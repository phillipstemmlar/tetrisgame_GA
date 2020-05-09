public class Console{
	public static final String bold = "\033[0;1m";
	public static final String red = "\033[0;31m";
	public static final String green = "\033[0;32m";
	public static final String blue = "\033[0;34m";
	public static final String white = "\033[0;37m";
	public static final String grey = "\033[1;30m";
	public static final String gray = grey;

	public static String color = white;
	public static String colorError = red;
	public static String colorInfo = green;
	public static String colorLine = color;
	public static char lineChar = '=';

	public static Boolean logging = true;
	public static Boolean loggingErrors = true;
	public static Boolean loggingInfo = true;
	public static Boolean loggingLines = true;



	public static void logln(String msg){
		logln(msg,color);
	}
	public static void logln(String msg, String MSGcolor){
		log(msg + "\n", MSGcolor);
	}
	public static void log(String msg){
		log(msg,color);
	}
	public static void log(String msg, String MSGcolor){
		if(logging) System.out.print(MSGcolor + msg + color);
	}

	public static void error(String msg){
		error(msg,colorError);
	}
	public static void error(String msg, String ERRORcolor){
		if(loggingErrors) System.out.println(ERRORcolor + msg + color);
	}

	public static void info(String msg){
		info(msg, colorInfo);
	}
	public static void info(String msg, String InfoColor){
		if(loggingInfo) System.out.println(InfoColor + msg + color);
	}

	public static void line(char c){
		line(c,colorLine);
	}
	public static void line(){
		line(lineChar,colorLine);
	}
	public static void line(String LineColor){
		line(lineChar,LineColor);
	}
	public static void line(char c, String LineColor){
		if(loggingLines){
			String ln = "";
			for(int i = 0; i < 30; ++i) ln += c;
			logln(ln, LineColor);
		}
	}

}