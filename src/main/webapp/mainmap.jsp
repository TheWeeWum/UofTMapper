<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dynamic Markers</title>

    <link rel="stylesheet" href="css/mainmap.css">
    <link rel="stylesheet" href="css/navbar.css">
    <link rel="stylesheet" href="css/footer.css">

    <script async src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBNWxKThZ-Rq8dU0AH_DOrzJ-itEYicp-E&callback=initMap&libraries=maps,marker&v=beta"></script>
    <script src="js/mainmap.js"></script>
</head>
<body>

<header>
    <h1>UniVerse</h1>
</header>

<nav>
    <a href="index">Home</a>
    <div class="dropdown">
        <a class="dropbtn">Profile</a>
        <div class="dropdown-content">
            <a href="#favourites">Favourites</a>
            <a href="#userReviews">Reviews</a>
            <a href="profile">Profile</a>
        </div>
    </div>
    <a href="#about">About</a>
    <a href="signup">Signup</a>
    <a href="login">Login</a>

    <!-- Add more links as needed -->
</nav>

<div id="map" style="height: 600px;"></div>

<div class="contactInformation">
    <h1>
        Contact us
    </h1>
    <h3> The Gods of the UniVerse</h3>
    <p>
        Evan Wang<br>
        Isabella Nguyen<br>
        Ivan Kraskov<br>
        Liam Csiffary<br>
        Raon Kim<br>
    </p>
</div>

</body>
</html>