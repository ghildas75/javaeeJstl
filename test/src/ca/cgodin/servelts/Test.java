package ca.cgodin.servelts;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import ca.cgodin.beans.Auteur;
import ca.cgodin.beans.Noms;
import ca.cgodin.beans.Users;
import ca.cgodin.forms.ConnectionForm;


@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static final int TAILLE_TAMPON = 10240; 
    public static final String CHEMIN_FICHIERS = "/Utilisateurs/Portable/Bureau/";
    public Test() {
        super();
        
    }

	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  Noms tabNoms=new Noms();
		request.setAttribute("userss", tabNoms.getUsers());
		this.getServletContext().getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
		/*HttpSession session=request.getSession();
		String nom=(String)session.getAttribute("nom");
		session.invalidate();// destroy la session  si le client clique volonatrement sur disconnect
*/		
		
		
		/*// TODO Auto-generated method stub
		String titres[]= {"nouvelle incendie","led incovenient de mondialisation","iles des oubl"};
		request.setAttribute("titres", "titres");
		Auteur  auteur= new  Auteur();
		auteur.setPrenom("samir");
		auteur.setNom("Ghilas");
		auteur.setEstActif(true);
		request.setAttribute("auteur",auteur);*/
		/*String name=request.getParameter("name");
		request.setAttribute("name",name);
		String noms[]= {"jennifer","lopez","samir"};
		request.setAttribute("keytab", noms);
		String message="Good bye";
		request.setAttribute("variable",message);
		request.setAttribute("heure","jour");*/
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	/*response.setContentType("text/html");
	response.setCharacterEncoding("UTF-8");
	PrintWriter out=response.getWriter();
	//out.printf("Bonjour");
	String ms="<!Doctype html>\n";
	ms+="<html>\n";
	ms+="<head>\n";
	ms+="<meta charset=\"utf-8\"  />";
	ms+="<title>Test </title>\n";
	ms+="</head>\n";
	ms+="<body>\n";
	ms+="<b>Bonjour samir <b>\n";
	ms+="</body>\n";
	ms+="</html>";
	out.println(ms);*/
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		/*String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");*/
		Users users=new Users();
		users.setNom(request.getParameter("nom"));
		users.setPrenom(request.getParameter("prenom"));
		Noms tabs= new Noms();
		tabs.addUser(users);
		request.setAttribute("userss", tabs.getUsers());       
	      /*  Cookie cookie = new Cookie("prenom", prenom);
	        cookie.setMaxAge(60 *2);
	        response.addCookie(cookie);*/
		/*HttpSession session=request.getSession();
		session.setAttribute("nom", nom);
		session.setAttribute("prenom", prenom);*/
		this.getServletContext().getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
		/* String description = request.getParameter("description");
	        request.setAttribute("description", description );

	        // On récupère le champ du fichier
	        Part part = request.getPart("fichier");
	            
	        // On vérifie qu'on a bien reçu un fichier
	       // String nomFichier = getNomFichier(part);

	        // Si on a bien un fichier
	        if (nomFichier != null && !nomFichier.isEmpty()) {
	            String nomChamp = part.getName();
	            // Corrige un bug du fonctionnement d'Internet Explorer
	             nomFichier = nomFichier.substring(nomFichier.lastIndexOf('/') + 1)
	                    .substring(nomFichier.lastIndexOf('\\') + 1);

	            // On écrit définitivement le fichier sur le disque
	            ecrireFichier(part, nomFichier, CHEMIN_FICHIERS);

	            request.setAttribute(nomChamp, nomFichier);
	        }
		
		
		
			ConnectionForm  forms= new ConnectionForm();
		forms.validLogin(request);
		request.setAttribute("forms",forms);
		this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
		
	}

	 private void ecrireFichier( Part part, String nomFichier, String chemin ) throws IOException {
	        BufferedInputStream entree = null;
	        BufferedOutputStream sortie = null;
	        try {
	            entree = new BufferedInputStream(part.getInputStream(), TAILLE_TAMPON);
	            sortie = new BufferedOutputStream(new FileOutputStream(new File(chemin + nomFichier)), TAILLE_TAMPON);

	            byte[] tampon = new byte[TAILLE_TAMPON];
	            int longueur;
	            while ((longueur = entree.read(tampon)) > 0) {
	                sortie.write(tampon, 0, longueur);
	            }
	        } finally {
	            try {
	                sortie.close();
	            } catch (IOException ignore) {
	            }
	            try {
	                entree.close();
	            } catch (IOException ignore) {
	            }
	        }
	    }
	    
	    private static String getNomFichier( Part part ) {
	        for ( String contentDisposition : part.getHeader( "content-disposition" ).split( ";" ) ) {
	            if ( contentDisposition.trim().startsWith( "filename" ) ) {
	                return contentDisposition.substring( contentDisposition.indexOf( '=' ) + 1 ).trim().replace( "\"", "" );
	            }
	        }
	        return null;
	    }   
	*/
	
}
}
