
	<h1>richiesta registrazione da parte di</h1>

	<h3> Username:      <%= request.getParameter("username") %>        </h3>
	<h3> Password:      ${param.password}        </h3>
	<h3> Genere:      ${param.genere}        </h3>
	<h3> Fascia di età:      ${param.eta}        </h3>
	
	<h3>forma di pagamento desiderata</h3>
	<ul>
	<%
		String[] pagamenti = request.getParameterValues("payment");
		for(String temp : pagamenti){
			out.println("<li>"   + temp  +  "</li>"  );		
		}
	%>
	</ul>
