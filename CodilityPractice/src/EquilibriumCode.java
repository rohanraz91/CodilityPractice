
public class EquilibriumCode {

	public static int solution(int[] a){
		int leftSum=a[0];
		int rightSum=0;
		for(int i=1;i<a.length;i++){
			rightSum+=a[i];
		}
		int minDif= Math.abs(rightSum-leftSum);
		int temp=0;
		for(int i=1;i<a.length-1;i++){
			leftSum+=a[i];
			rightSum-=a[i];
			temp=Math.abs(rightSum-leftSum);
			if(temp<minDif){
				minDif=temp;
			}
		}
		return minDif;
	}
	public static void main(String arg[]){
		int[] a=new int[]{3,1,2,4,3};
		
		System.out.println(solution(a));
	}
}
