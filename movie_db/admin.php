<?php
    session_start();
    
    if (!$_SESSION['loggedIn']) {
        header('location: login.html');
    }

    include 'dbconnection.php';
    
    $query = $pdo -> query("select * from users where admin != 'y'");
    $results = $query -> fetchAll(PDO::FETCH_OBJ);
    $output = "";
    $output .= "<table>";
    foreach($results as $result){
        $output .= "<tr>";
        $output .= "<td>" . $result -> id . "</td>";
        $output .= "<td>" . $result -> fname . "</td>";
        $output .= "<td>" . $result -> lname . "</td>";
        $output .= "<td>" . $result -> username . "</td>";
        $output .= "<td>" . "<form id='update_admin' name='update_admin' action='update.php' method='POST'> 
                             <input type='hidden' name='id' id='admin' value='$result->id'/>
                             <input type='submit' value='Admin' />
                            </form>" . "</td>";
        $output .= "</tr>";
    }
    $output .= "</table>";
?>

<!DOCTYPE html>
<!--
    Created on : 19-Sep-2017
    Author     : Kevin McDonald
-->
<html lang="en">
    <head>
        <title>Movie Database</title>
        <meta name="viewport" content="width: device-width, intial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/movie_home.css" />
    </head>
    <body>
        <div id="header">
            <div class="inner">
                <div id="logo">LOGO</div>
                <nav>
                    <a href="index.php">Home</a>
                    <a href="insert.php">Insert</a>
                    <a href="logout.php">Logout</a>
                </nav>
            </div>
        </div>
        <div id="banner">
            <h1>Movies</h1>
            <h3>Database</h3>
        </div>

        <section class="inner container">
            <?php
                echo $output;
            ?>
        </section>
        <footer>
            <span id="copy">&copy; Kevin McDonald 2017</span>
        </footer>	
    </body>
</html>
