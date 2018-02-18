<?php
    /* 
        Created on : 19-Sep-2017
        Author     : Finn Turnbull
    */

    include_once 'dbconnection.php';
    
    $fname = filter_input(INPUT_POST, 'fname', FILTER_SANITIZE_STRING);
    $lname = filter_input(INPUT_POST, 'lname', FILTER_SANITIZE_STRING);
    $username = filter_input(INPUT_POST, 'username', FILTER_SANITIZE_STRING);
    $password = filter_input(INPUT_POST, 'password', FILTER_SANITIZE_STRING);
    //$fname = $_POST['fname'];
    //$lname = $_POST['lname'];
    //$username = $_POST['username'];
    //$password = $_POST['password'];
    $salt = "ft01passwordSalt";
    $password = $password . $salt;
    $password = sha1($password);

    $query = $pdo -> prepare ("
            insert into users (fname, lname, username, password)
                values (:fname, :lname, :username, :password)
            ");

    $success = $query -> execute ([
        'fname' => $fname,
        'lname' => $lname,
        'username' => $username,
        'password' => $password
    ]);

    header('Location: index.php');
?>