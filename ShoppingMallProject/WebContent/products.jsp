<%@page import="dao.ProductRepository"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="dto.Product" %>

<html>
<head>
<!-- https://getbootstrap.com/docs/4.3/getting-started/introduction/ -->
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<title>상품 목록</title>
</head>
<body>
<jsp:include page="menu.jsp" />
<div class="jumbotron">
    <div class="container">
        <h1 class="display-3">상품목록</h1>
     </div>
 </div>
 <%
     ArrayList<Product> listofProducts = ProductRepository.getInstance().getAllProducts();
 %>
 
 
 
 <div class="contianer">
  <div class="row" align="center">
  <%
     for(int i =0; i<listofProducts.size(); i++){
        Product product = listofProducts.get(i);
     %>
        <div class="col-md-4">
        	<img src="./resources/images/<%=product.getFilename() %>" style="height: 200px; object-fit:cover">
           <h3><%=product.getPname() %></h3>
           <p><%=product.getDescriotion()%>
           <p><%=product.getUnitPrice() %>원
           <p><a href="./product.jsp?id=<%=product.getProductId() %>" class="btn btn-secondary" role="button">상세 정보</a>
     </div>
     <% 
        }
     %>
  </div>
  <hr>
  </div>
<jsp:include page="footer.jsp"/>
</body>
</html>