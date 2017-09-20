
public class FrogJump {
	public static int solution(int x,int y, int d){
		if(y-x%d==0){
			return (y-x)/d;
		}
		else
			return ((y-x)/d +1); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution(10,85,30));
	}

}
