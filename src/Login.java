import java.util.ArrayList;

public class Login {

	private Database db =new Database();
	
	

	public void verifica( String username,String password) {
		System.out.println("verifico se l'utente "+ username +" "+ password );
		if(db.verify(username, password) != null) {
			System.out.println("L'utente esiste");
		}
		else {
			System.out.println("procedi con la registrazione");
			db.newUtente(username, password);
			System.out.print("Utente registrato corretamente");
		}
		
	}

}
