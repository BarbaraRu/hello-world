<%@page import="controller.*"%>
<%@page import="model.*"%>
<%@page import="java.util.ArrayList"%>




<%String r = request.getParameter("pagina");


if(r !=null && r.equals("errorLogin")) {
	
	%><jsp:include page="errorLogin.jsp"></jsp:include><%
			
}else if(r!= null && r.equals("doRegistrazione")){
	%><jsp:include page="doRegistrazione.jsp"></jsp:include><%
	
}


else if (session.getValue("isLogged") != null && session.getValue("isLogged").equals("true")) { %>



<!--<h1>content</h1>-->

<%

	
	
	
	
	
	try{
	
	if(r.equals("ciaoGrazie"))	{
		%> <jsp:include page="ciaoGrazie.jsp"></jsp:include> <%
	
	}else if (r.equals("prodotti")) {
		%><jsp:include page="prodotti.jsp"></jsp:include>
		<br><%
		}
			
		
			
		else
			out.print("home");
		
	} catch(Exception e){
		out.print("non va!" );
	}



 } 



else {%>
	
	non sei collegato
	
	<% } %>

	
