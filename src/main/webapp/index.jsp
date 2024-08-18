<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="calculate" method="post">
    <label>Product Description: </label></br>
    <input type="text" name="txtDescribe" placeholder="ProductDescription"/></br>
    <label>List Price: </label></br>
    <input type="number" name="price" placeholder="ListPrice"/></br>
    <label>Discount Percentage: </label></br>
    <input type="number" name="percent" placeholder="DiscountPercent"/></br>
    <input type="submit" id="submit" value="Calculate Discount">
</form>
</body>
</html>