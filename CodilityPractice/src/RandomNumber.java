
public abstract class RandomNumber {
	public static void main(String arg[]) {
		RandomNumber.test("Hi");
	}
	public static void test(String value){
		if(value.equals(null)){
			System.out.println("null");
		}
		else
			System.out.println("not null");
	}
}
