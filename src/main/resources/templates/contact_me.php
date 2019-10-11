<!DOCTYPE html>
<html>
  <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" th:href="@{/style.css}" href="../static/style.css">

    <!-- Import Font -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet"
        type="text/css">

    <title>Sébastien Dupuis</title>
  </head>
<body>
   <h1>Contact</h1>
   <form method="post">
       <label>Email</label>
       <input type="email" name="email" required><br>
       <label>Message</label>
       <textarea name="message" required></textarea><br>
       <input type="submit">
   </form>
   <?php
   if (isset($_POST['message'])) {
       $position_arobase = strpos($_POST['email'], '@');
       if ($position_arobase === false)
           echo '<p>Votre email doit comporter un arobase.</p>';
       else {
           $retour = mail('jules@free.fr', 'Envoi depuis la page Contact', $_POST['message'], 'From: ' . $_POST['email']);
           if($retour)
               echo '<p>Votre message a été envoyé.</p>';
           else
               echo '<p>Erreur.</p>';
       }
   }
   ?>
</body>
</html>