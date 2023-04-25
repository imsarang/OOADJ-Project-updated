<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>
            </head>

            <body>
                <form:form>
                    <c:forEach var="show" items="${shows}">
                        <a>
                            <h2>${show.showId}</h2>
                            <h2>${show.movieId}</h2>
                            <h2>${show.theatreId}</h2>
                            <h2>${show.date}</h2>
                            <h2>${show.startTime}</h2>
                            <h2>${show.endTime}</h2>
                            <h2>${show.seatMatrixID}</h2>
                <button><a href="./bookingForm?id=${show.showId}">Booking</a></button>

                        </a>
                       
                        <!-- <h2><button type="button" class="btn btn-success">
                                            <a href="/editMovie/${movie.id}" style="color:white;font-size: large;">Edit</a>
                                        </button></h2> -->
                        <!-- <h2><button type="button" class="btn btn-danger">
                                            <a href="/deleteMovie/${movie.id}" style="color:white;font-size:large">Delete</a>
                                        </button></h2> -->

                    </c:forEach>

                </form:form>
                <!-- <button><a href="./loginForm">LOGIN</a></button> -->
            </body>
            <script>
                // const handleClick = ()=>{
                //     document.getElementById("movie_id");
                //     console.log("hello");
                // }
            </script>
            </html>