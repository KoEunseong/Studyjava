package chapter3;

public class Exercise3_7 { 
	public static void main(String[] args) {
	int fahrenheit = 100;
	float celcius = (int)((5 / 9.0f) *(fahrenheit- 32)*100 + 0.5) /100f;
	System.out.println("Fahrenheit:"+fahrenheit);
	System.out.println("Celcius:"+celcius);

/*
 C =5/9 ×(F - 32)

 */
	}
}
