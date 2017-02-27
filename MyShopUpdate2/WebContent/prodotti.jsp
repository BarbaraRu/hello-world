<%@page import="controller.*"%>
<%@page import="model.*"%>
<%@page import="java.util.ArrayList"%>

	
	<%! ArrayList<Abito> elencoProdotti ; %>
	
	<%
			 elencoProdotti = Prodotti.getMostraProdotti();
			
	out.print("<div class='container-fluid'>");
			out.print("<form method='post' action='?pagina=doOrdine'> ");
			
			int i=0;
			for (Abito a : elencoProdotti){
				i++;
				
				if (a instanceof Giacca) {
					out.print("<div class='col-md-6 labelCarrello'>"+a.descriviProdotto()+"</div>");
					out.print(" ");
					
					out.print("<div class='col-md-6 form-group'><input type='number' class='form-control' name='giacca' /></div>");
				} 
				
				
				if (a instanceof Pantalone) {
					out.print("<div class='col-md-6 labelCarrello'>"+a.descriviProdotto()+"</div>");
					out.print(" ");
					
					out.print("<div class='col-md-6 form-group'><input type='number' class='form-control' name='pantalone' /></div>");
				} 
				
				
				if (a instanceof Maglione) {
					out.print("<div class='col-md-6 labelCarrello'>"+a.descriviProdotto()+"</div>");
					out.print(" ");
					out.print("<div class='col-md-6 form-group'><input type='number' class='form-control' name='maglione' /></div>");
				} 
				
				
				if (a instanceof Camicia) {
					out.print("<div class='col-md-6 labelCarrello'>"+a.descriviProdotto()+"</div>");
					out.print(" ");
					out.print("<div class='col-md-6 form-group'><input type='number' class='form-control' name='camicia'/></div>");
				} 
				
				
				if (a instanceof Scarpe) {
					out.print("<div class='col-md-6 labelCarrello'>"+a.descriviProdotto()+"</div>");
					out.print(" ");
					out.print("<div class='col-md-6 form-group'><input type='number' class='form-control' name='scarpe'/></div>");
					
				} 
				
			}
			
				%>
				<hr/>
				
				
				
		<%		
			
			out.print("<div class='col-md-12'>");
			out.print("<input type='submit' class='btn btn-default carrelloButton' value='metti nel carrello'/>");
			out.print("</div>");
			out.print("</form>");
			out.print("</div>");
			%>