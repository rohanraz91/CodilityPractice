
public class MissingElement {

	static public int solution(int[] a,int n){
		int sumTotal= (n*(n+1))/2;
		int actualSum=0;
		for(int i=0;i<a.length;i++){
			actualSum+=a[i];
		}
		int misNum=sumTotal-actualSum;
		
		return misNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{1,4,5,3,7,8,6};
		System.out.println(solution(a,a.length+1));
	}

}
