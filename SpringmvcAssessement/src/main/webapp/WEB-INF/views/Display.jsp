<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
 <feildset>
   <b>UserName :</b>  <p>${user}</p>  
    </feildset>
    <feildset>
    <b>Number of clothes :</b><p>${num}</p>  
    </feildset> 
    <feildset>
   <b>Type of washing:</b> <p>${type}</p> 
    </feildset>
    <feildset>
   <b>Total Bill:</b> <p>${bill}</p> 
    </feildset>
  
</body>
</html>
