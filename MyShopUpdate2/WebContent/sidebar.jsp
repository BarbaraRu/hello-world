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

<div id="pulsantiServizio">
	<button id="switchElementi" class="btn btn-primary">Registrati</button>
</div>

<div id="registrazione">

	<div class="header"><h1>registrazione</h1></div>

	<form method="post" name="doRegistrazione" action="?pagina=doRegistrazione">
	
		username <input type="text" name="username" />
		<br/>
		password <input type="text" name="password" />
	
		<br/>
		<br/>
	
		M: <input type="radio" name="genere" value="M" />
		F: <input type="radio" name="genere" value="F" />
	
		<br/>
		
		<select name="eta">
			<option value="giovane">giovane 18-35</option>
			<option value="esperto">esperto 36-49</option>
			<option value="maturo">maturo 50-65</option>	
		</select>
		<br/>
		
		metodi pagamento preferiti
		contanti <input type="checkbox" name="payment" value="contanti" /><br/>
		bonifico <input type="checkbox" name="payment" value="bonifico" /><br/>
		carta credito <input type="checkbox" name="payment" value="creditcard" /><br/>
		paypal <input type="checkbox" name="payment" value="paypal" /><br/>
	
		<br/>
	
		<input type="submit" name="invia" value="registrati" />
	
	</form>

</div>


<div id="login">
	<div class="header"><h1>login</h1></div>
	<form method="post" name="doLogin" action="login">
	
		username <input type="text" name="username" />
		<br/>
		password <input type="text" name="password" />
		<br/>
	
		<input type="submit" name="btnLogin" id="btnLogin"  value="login" />	

	</form>
</div>


	<% } %>