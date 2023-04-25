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
                    <c:forEach var="seat" items="${matrix}">
                        <p> <a href="./saveBooking?id='A'">${seat.A}</a></p>
                        <p> <a href="./saveBooking?id='B'">${seat.B}</a></p>
                        <p> <a href="./saveBooking?id='C'">${seat.C}</a></p>
                        <p> <a href="./saveBooking?id='D'">${seat.D}</a></p>
                        <p> <a href="./saveBooking?id='E'">${seat.E}</a></p>
                        <p> <a href="./saveBooking?id='F'">${seat.F}</a></p>
                        <p> <a href="./saveBooking?id='G'">${seat.G}</a></p>
                        <p> <a href="./saveBooking?id='H'">${seat.H}</a></p>
                        <p> <a href="./saveBooking?id='I'">${seat.I}</a></p>
                        <p> <a href="./saveBooking?id='J'">${seat.J}</a></p>
                        <p> <a href="./saveBooking?id='K'">${seat.K}</a></p>
                        <p> <a href="./saveBooking?id='L'">${seat.L}</a></p>
                        <p> <a href="./saveBooking?id='M'">${seat.M}</a></p>
                        <p> <a href="./saveBooking?id='N'">${seat.N}</a></p>
                        <p> <a href="./saveBooking?id='O'">${seat.O}</a></p>
                        <p> <a href="./saveBooking?id='P'">${seat.P}</a></p>
                        <p> <a href="./saveBooking?id='Q'">${seat.Q}</a></p>
                        <p> <a href="./saveBooking?id='R'">${seat.R}</a></p>
                        <p> <a href="./saveBooking?id='S'">${seat.S}</a></p>
                        <p> <a href="./saveBooking?id='T'">${seat.T}</a></p>
                        <p> <a href="./saveBooking?id='U'">${seat.U}</a></p>
                        <p> <a href="./saveBooking?id='V'">${seat.V}</a></p>
                        <p> <a href="./saveBooking?id='W'">${seat.W}</a></p>
                        <p> <a href="./saveBooking?id='X'">${seat.X}</a></p>
                        <p> <a href="./saveBooking?id='Y'">${seat.Y}</a></p>
                        <p> <a href="./saveBooking?id='Z'">${seat.Z}</a></p>
                    
                    </c:forEach>

                </form:form>
                <!-- <button><a href="./logoutUser">LOGOUT</a></button> -->
            </body>
            <script>
                // const handleClick = ()=>{
                //     document.getElementById("movie_id");
                //     console.log("hello");
                // }
            </script>
            </html>