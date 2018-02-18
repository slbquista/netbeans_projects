<!--
    Created on : 19-Sep-2017
    Author     : Finn Turnbull
-->

<?php
    include_once 'dbconnection.php';
    
    session_start();
    
    $un = filter_input(INPUT_POST, 'username', FILTER_SANITIZE_STRING);
    //$un = $_POST['username'];
    $pw = filter_input(INPUT_POST, 'password', FILTER_SANITIZE_STRING);
    //$pw = $_POST['password'];
    $salt = "ft01passwordSalt";
    $pw = $pw . $salt;
    $pw = sha1($pw);
    
    $sql = "SELECT * FROM users WHERE username = :username AND password = :password";
        
    $stmt = $pdo->prepare($sql);
    $success = $stmt->execute([
        'username'=>$un,
        'password'=>$pw
    ]);
    
    if ($success && ($stmt->rowCount() > 0)) {
        echo "Successfully logged in.";
        $_SESSION['loggedIn'] = true;
        $_SESSION['username'] = $un;
        echo $_SESSION['loggedIn'];
        echo $_SESSION['username'];
    } else {
        echo "Failed to login.";
        $_SESSION['loggedIn'] = false;
        $_SESSION['username'] = "";
    }
    
    header('Location: index.php');
?>