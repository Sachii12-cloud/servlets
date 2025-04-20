<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <%if(request.getMethod().equals("POST")){%>
      <h1>Submitted User details </h1>
      <table>
           <tr>
               <th>Name:</th>
               <td><%=request.getParameter("name")%></td>
           </tr>
           <tr>
               <th>Email:</th>
               <td><%=request.getParameter("email")%></td>
           </tr>
           <tr>
               <th>Mobile:</th>
               <td><%=request.getParameter("mobile")%></td>
           </tr>
      </table>
      <%}else{ %>
      <h1>Enter the user detail</h1>
      <form action="jsp1.jsp" method="POST">
        <label for="name">Name:</label>
        <input type="text"  name="name" required /><br><br>
        
        <label for="email">Email:</label>
        <input type="text"  name="email" required /><br><br>
        
        <label for="mobile">Mobile:</label>
        <input type="text"  name="mobile" required /><br><br>
        
        <button type="submit">Submit</button>
      </form>
      <%} %>
      
      
     
</body>
</html>