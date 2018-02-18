<?php
    /* 
        Created on : 19-Sep-2017
        Author     : Finn Turnbull
    */

    include_once 'dbconnection.php';

    $title = filter_input(INPUT_POST, 'title', FILTER_SANITIZE_STRING);
    //$title = $_POST['title'];
    $year = filter_input(INPUT_POST, 'year', FILTER_SANITIZE_STRING);
    //$year = $_POST['year'];
    $genre = filter_input(INPUT_POST, 'genre', FILTER_SANITIZE_STRING);
    //$genre = $_POST['genre'];

    $query = $pdo -> prepare ("
            insert into Movies (title, year, genre)
                values (:title, :year, :genre)
            ");

    $success = $query -> execute ([
        'title' => $title,
        'year' => $year,
        'genre' => $genre
    ]);

    header('Location: index.php');
?>