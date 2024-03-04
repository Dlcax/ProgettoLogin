import java.util.ArrayList;

public class Database {

	private ArrayList<Register>db= new ArrayList<Register>();
	
	/***
	 * metedo che aggiunge un utente nel db
	 * @param username
	 * @param password
	 */
	public void newUtente(String username,String password) {
		Register utente = new Register();
		utente.setNomeUtente(username);
		utente.setPassword(password);

		db.add(utente);
	}
	
	
	/***
	 * Verifica se l'utente è registrato
	 * @param username
	 * @param password
	 * @return
	 */
	public Register verify(String username,String password) {
		for (Register register : db) {
			if(register.getNomeUtente().equals(username)&& register.getPassword().equals(password)){
				return register;
			}
		}
		return null;
	}

	
	
}
