
public class PermutationChecker {
	public static int solution(int[] a){
		int newArray[]=new int[a.length+1];
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>=newArray.length){
				return 0;
			}
			//To check duplicate value eg. {4,3,3,1}
			else if(newArray[a[i]]==0){
				newArray[a[i]]=1;
				count++;
			}
		}
		
		return count==a.length? 1:0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{4,3,2,1};
		System.out.println(solution(arr));
	}
	

}
