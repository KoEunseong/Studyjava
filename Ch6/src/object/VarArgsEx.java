package object;

public class VarArgsEx { //가변인자
	static String concatenate(String delim, String ... args) {
		String result = "";
		
		for(String str : args) {
			result += str + delim;
		}
		return result;
	}
	
	/*static String concatenate(String... args) {
		String result;
		
		return concatenate("",result);
	}가능하면 가변인자를 사용한 메소드는 오버로딩 하지 않는 것이 좋다.*/ 
	
	public static void main(String[] args) { //p289
		String[] strArr = {"100" , "200" , "300"};
		System.out.println(concatenate(",", strArr));
		System.out.println(concatenate("/", "100","200","400","500"));
		System.out.println(concatenate(",", new String[0]));
		System.out.println(concatenate(",", new String[5]));
		System.out.println(concatenate(",", new String[] {"1","2","3"}));
		
	}
}
