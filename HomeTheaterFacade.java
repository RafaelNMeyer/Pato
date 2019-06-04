
public final class HomeTheaterFacade {

	/* 
	 * Amplifier amp;
	 * Tuner tuner;
	 * DvdPlayer dvd;
	 * CdPLayer cd;
	 * Projector projector;
	 * TheaterLights lights;
	 * Screen screen;
	 * PopCornPopper popper;
	 * 
	 * */
	
	
	

	private static final HomeTheaterFacade home = new HomeTheaterFacade();
	
	private HomeTheaterFacade(){
		System.err.println("Objeto criado");
	}
	
	public static HomeTheaterFacade getInstance() {
		return home;
	}
	

	public void watchMovie(String movie) {
		
		/*System.out.println("Get ready..");
		popper.on;
		popper.pop;
		lights.dim(10);
		screen.down;
		projector.on;
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurround();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);*/

	}
}
