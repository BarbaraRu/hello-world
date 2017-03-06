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
					out.print("<div class='col-md-6'>");
					out.print("<div class='panelProd'>");
					out.print("<div class='titlePanel'>" );
					out.print("<h3>"+a.getClass()+"</h3>");
					out.print("</div>");
					out.print("<div class='imgProd'>");
					out.print("<img class='img-responsive' src='img/giacca.jpg' alt='Immagine della "+a.getClass()+"'/>" + "<br/>");
					
					out.print("<h3>"+a.getPrezzo()+" euro"+"</h3>");
					out.print("</div>");
					out.print("<div class='imgProd'>");
					out.print("<h3>Qta</h3>");
					out.print("<div class='form-group'><input type='number' class='form-control' name='giacca' /></div>");
					out.print("</div>");
					out.print("</div>");
					out.print("</div>");
					
					
				} 
				
				
				if (a instanceof Pantalone) {
					out.print("<div class='col-md-6'>");
					out.print("<div class='panelProd'>");
					out.print("<div class='titlePanel'>" );
					out.print("<h3>"+a.getClass()+"</h3>");
					out.print("</div>");
					out.print("<div class='imgProd'>");
					out.print("<img class='img-responsive' src='img/pantalone.jpg' alt='Immagine della "+a.getClass()+"'/>" + "<br/>");
					
					out.print("<h3>"+a.getPrezzo()+" euro"+"</h3>");
					out.print("</div>");
					out.print("<div class='imgProd'>");
					out.print("<h3>Qta</h3>");
					out.print("<div class='form-group'><input type='number' class='form-control' name='pantalone' /></div>");
					out.print("</div>");
					out.print("</div>");
					out.print("</div>");
					
					
				} 
			
				
				if (a instanceof Maglione) {
					out.print("<div class='col-md-6'>");
					out.print("<div class='panelProd'>");
					out.print("<div class='titlePanel'>" );
					out.print("<h3>"+a.getClass()+"</h3>");
					out.print("</div>");
					
					out.print("<div class='imgProd'>");
					out.print("<img class='img-responsive' src='img/maglione.jpg' alt='Immagine della "+a.getClass()+"'/>" + "<br/>");
					
					out.print("<h3>"+a.getPrezzo()+" euro"+"</h3>");
					out.print("</div>");
					out.print("<div class='imgProd'>");
					out.print("<h3>Qta</h3>");
					out.print("<div class='form-group'><input type='number' class='form-control' name='maglione' /></div>");
					out.print("</div>");
					out.print("</div>");
					out.print("</div>");
					
				} 
				
				
				if (a instanceof Camicia) {
					out.print("<div class='col-md-6'>");
					out.print("<div class='panelProd'>");
					out.print("<div class='titlePanel'>" );
					out.print("<h3>"+a.getClass()+"</h3>");
					out.print("</div>");
					out.print("<div class='imgProd'>");
					out.print("<img class='img-responsive' src='img/camicia.jpg' alt='Immagine della "+a.getClass()+"'/>" + "<br/>");
					
					out.print("<h3>"+a.getPrezzo()+" euro"+"</h3>");
					out.print("</div>");
					out.print("<div class='imgProd'>");
					out.print("<h3>Qta</h3>");
					out.print("<div class='form-group'><input type='number' class='form-control' name='camicia' /></div>");
					out.print("</div>");
					out.print("</div>");
					out.print("</div>");
					
				} 
				
				
				if (a instanceof Scarpe) {
					out.print("<div class='col-md-6'>");
					out.print("<div class='panelProd'>");
					out.print("<div class='titlePanel'>" );
					out.print("<h3>"+a.getClass()+"</h3>");
					out.print("</div>");
					out.print("<div class='imgProd'>");
					out.print("<img class='img-responsive' src='img/scarpe.jpg' alt='Immagine della "+a.getClass()+"'/>" + "<br/>");
					
					out.print("<h3>"+a.getPrezzo()+" euro"+"</h3>");
					out.print("</div>");
					out.print("<div class='imgProd'>");
					out.print("<h3>Qta</h3>");
					out.print("<div class='form-group'><input type='number' class='form-control' name='scarpe' /></div>");
					out.print("</div>");
					out.print("</div>");
					out.print("</div>");
					
					
				} 
				
			}
			
				%>
				
				
				<div class="clearfix"></div>
				
		
		</br>
		<%
		out.print("<div class='col-md-6'>");
		out.print("<input type='submit' class='btn btn-default' value='metti nel carrello'/>");
		out.print("</div>");
		out.print("</form>");
		out.print("</div>");
		%>
			