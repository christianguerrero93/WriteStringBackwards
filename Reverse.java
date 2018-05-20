
public class Reverse {

	public static void writeBackwards(String s){
		if(s.length() ==1){
			System.out.print(s);
		}
		else{
			System.out.print(s.substring(s.length()-1));
			writeBackwards(s.substring(0,   s.length() -1    ));
		}
	}

}
