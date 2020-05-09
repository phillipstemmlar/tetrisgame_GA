public class Game{
	public static void main(String[] args){
		Game.INIT();
		Game.RUN();
		Game.SHUTDOWN();
	}

	public static Game instance = null; 



	private Game(){

	}


	public void run(){

	}

	public void shutdown(){

	}

	public static Game ME(){
		if(instance == null){
			INIT();
		}
		return instance;
	}

	public static void INIT(){
		instance = new Game();
	}

	public static void RUN(){
		if(IsALIVE()) ME().run();
	}

	public static void SHUTDOWN(){
		if(IsALIVE()) ME().shutdown();
	}

	public static Boolean IsALIVE(){
		return (instance != null);
	}
}