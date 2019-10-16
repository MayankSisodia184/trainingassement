<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<h1>
	Online Laundary Booking  
</h1>
<h2>
Insert following details
</h2>
<form action="saveLaundary">
    <fieldset>
      <input placeholder="Username" type="text" tabindex="1" name="user"  autofocus>
    </fieldset>
    <fieldset>
      <input placeholder="Number of clothes" type="text" tabindex="2" name="num" >
    </fieldset>
    <fieldset>
      <input placeholder="Type of washing(dryclean,washing,ironing)" type="text" tabindex="2" name="name" >
    </fieldset>
             
      <button name="Book" type="submit" id="contact-submit" data-submit="...Sending">Book</button>

</form>

</body>
</html>
