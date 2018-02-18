<?php
    /* 
        Created on : 19-Sep-2017
        Author     : Finn Turnbull
    */

    session_start();
    
    if (!$_SESSION['loggedIn']) {
        header('location: login.html');
    }

    include_once 'dbconnection.php';

    $id = filter_input(INPUT_POST, 'id', FILTER_SANITIZE_STRING);
    //$id = $_POST['id'];

    $query = $pdo -> prepare ("
            update users
                set admin = 'y'
            where id = :id
            ");
    
    $success = $query -> execute ([
        'id' => $id
    ]);
    
    header('Location: admin.php');
?>