<?php
$u=$_POST['username'];
$p=$_POST['password'];
if(($u == "test") && ($p == "test"))
{
 echo "Login Successful";
}
 else
{ 
 echo "invalid user";
}
?>
