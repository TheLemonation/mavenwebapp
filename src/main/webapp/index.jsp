<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login Page</title>
    </head>
    <body>
        <h1>Petclinic login</h1><form action="login" method="post">
   <table>
   <tr>
      <td><font face="verdana" size="2px">Name:</font></td>
      <td><input type="text" name="userName"></td>
   </tr>
   <tr>
      <td><font face="verdana" size="2px">Password:</font></td>
      <td><input type="password" name="userPassword"></td>
   </tr>
   </table>
      <input type="submit" value="Login">
</form>
        
    </body>
</html>
