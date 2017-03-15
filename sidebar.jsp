<%@ page import="java.util.ArrayList" %>

	<% if (session.getValue("isLogged") != null && session.getValue("isLogged").equals("true")) {
		String r1 = request.getParameter("pagina");
		if (r1 != null && r1.equals("doOrdine")){
		
			%> <jsp:include page="doOrdine.jsp"></jsp:include> <% 
		
		}%>
	
	<div id="carrello" class="elementoScomparsa">
	
		<div class="header"><h1>carrello</h1></div>
	

	</div>
	
	<% } else { %>



<div id="registrazione">

	<div class="header"><h1>registrazione</h1></div>

	<form class="form-group" method="post" action="?pagina=doRegistrazione">
	<label for="username">Username:</label>
	 <input type="text" class="form-control" name="username" />
		<br/>
		<label for="pwd">Password:</label>
	 <input type="text" class="form-control" name="password" />
	
		<br/>
		<label for="email">Mail:</label>
		<input type="text" class="form-control" name="mail" />
		<br/>
	
		<input type="submit" class="btn btn-default" name="invia" value="registrati" />
	
	</form>

</div>


<div id="login">
	<div class="header"><h1>login</h1></div>
	<form method="post" class="form-group" name="doLogin" action="?pagina=doLogin">
	<label for="username">Username:</label>
		<input type="text" class="form-control" name="username" />
		<br/><label for="pwd">Password:</label>
		<input type="text" class="form-control" name="password" />
		<br/>
	
		<input type="submit" class="btn btn-default" name="btnLogin" id="btnLogin"  value="login" />	

	</form>
</div>


	<% } %>