package com.example.bookmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bookmovie.models.Login;
import com.example.bookmovie.models.Movie;
import com.example.bookmovie.models.SeatMatrix1;
import com.example.bookmovie.models.Show;
import com.example.bookmovie.models.User;
import com.example.bookmovie.payloadResponse.LoginMessage;
import com.example.bookmovie.service.MovieService;
import com.example.bookmovie.service.SeatMatrix1Service;
import com.example.bookmovie.service.SeatMatrix2Service;
import com.example.bookmovie.service.SeatMatrix3Service;
import com.example.bookmovie.service.ShowService;
import com.example.bookmovie.service.UserService;

import antlr.collections.List;

@Controller
public class MainController {
    @Autowired
    MovieService movieService;

    @Autowired
    UserService userService;
    @Autowired
    ShowService showService;
    // MovieController movieController;

    @Autowired
    SeatMatrix1Service seatMatrix1Service;

    @Autowired
    SeatMatrix2Service seatMatrix2Service;
    @Autowired
    SeatMatrix3Service seatMatrix3Service;

    boolean checkAdmin = false;
    String email;
    boolean loginStatus = false;
    Integer showCount = 0;

    @GetMapping("/")
    public String Home() {
        return "Start";
    }

    @GetMapping("/userLogin")
    public String loginPage(Model model) {
        model.addAttribute("login", new Login());
        return "Login";
    }

    @GetMapping("/addMovie")
    public String addMovie(Model model) {
        if (!checkAdmin)
            return "redirect:/";
        model.addAttribute("movie", new Movie());
        System.out.println("ADDMOVIE");
        return "AddMovie";
    }

    @GetMapping("/viewMovies")
    public String homePage(Model model) {
        System.out.println("HOME PAGE");
        model.addAttribute("movieList", movieService.getMovies());
        return "Home";
    }

    @GetMapping("/addShow")
    public String addShow(Model model) {
        if (!checkAdmin)
            return "redirect:/";
        model.addAttribute("show", new Show());
        return "Show";
    }

    @PostMapping("/saveShow")
    public String saveShow(Show show) {
        if (!checkAdmin)
            return "redirect:/";

        showCount++;
        System.out.println(showCount);

        showService.addShow(show, showCount);
        return "redirect:/viewMovies";

    }

    @PostMapping("/saveMovie")
    public String saveMovie(Movie movie) {
        movieService.addMovie(movie);
        return "redirect:/viewMovies";
    }

    // @RequestParam int id
    @GetMapping("/showMovie")
    public String getShow(@RequestParam int id, Model model) {
        System.out.println(id);
        model.addAttribute("shows", showService.getShowByMovieId(id));
        return "MovieShow";
    }

    @GetMapping("/registerUser")
    public String registerUser(Model model) {
        model.addAttribute("register", new User());
        return "Register";
    }

    @GetMapping("/bookingForm")
    public String bookingForm(@RequestParam int id, Model model) {
        if (id == 1) {
            model.addAttribute("matrix", seatMatrix1Service.getSeatMatrix1s());
            System.out.println(seatMatrix1Service.getSeatMatrix1s());
        } else if (id == 2) {
            model.addAttribute("matrix", seatMatrix2Service.getSeatMatrix2s());
        } else if (id == 3) {
            model.addAttribute("matrix", seatMatrix3Service.getSeatMatrix3s());
        } else {
            return "error";
        }
        return "Booking";
    }

    @PostMapping("saveRegUser")
    public String saveUser(User user) {
        userService.addUser(user);
        return "redirect:/";
    }

    @PostMapping("/loginUser")
    public String loginUser(Login login) {
        LoginMessage loginMessage = userService.loginUser(login);
        System.out.println(loginMessage);
        if (loginMessage.getUserStatus().matches("admin")) {
            checkAdmin = true;
            return "redirect:/viewMovies";
        }
        if (loginMessage.getStatus()) {
            email = loginMessage.getEmail();
            loginStatus = true;
            // model.addAttribute("checkLogin", true);
            return "redirect:/viewMovies";
        } else
            return "error";
    }

    @DeleteMapping("/logoutUser")
    public String logout() {
        // if (loginStatus) {
        // userService.logoutUser(null);
        // // model.addAttribute("checkLogin", false);
        // // return "redirect:/";
        // }
        userService.logoutUser(email);
        return "redirect:/";
    }

}
