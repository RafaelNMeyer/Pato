
public final class HomeTheaterFacade {


	private static final HomeTheaterFacade home = new HomeTheaterFacade();
	
	private HomeTheaterFacade(){
		System.err.println("Objeto criado");
	}
	
	public static HomeTheaterFacade getInstance() {
		return home;
	}
	

	public void watchMovie(String movie) {

	}
}
