<?php

// Inialize session
session_start();

// Delete current session
unset($_SESSION['loggedIn']);
unset($_SESSION['username']);

// Jump to login page
header('Location: login.html');

?>