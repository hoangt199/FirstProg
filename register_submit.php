<?php
    if(isset($_POST['submit'])&& ($_POST['username'])!="" &&($_POST['password']))){
        $username = $_POST['username'];
        $password = ($_POST['password']);
        $sql = "SELECT *FROM user WHERE username = '$username' AND passwor = '$password'";
        $user = mysqli_query($conn,$sql);
        if(mysqli_num_rows($user)>0){
            header("location:./Didongthongminh/Home.html")
        }else{
            echo("Nhap sai ten dang nhap hoac password");
        }
    }
    else{
        header("location:Home.html");
    }
?>