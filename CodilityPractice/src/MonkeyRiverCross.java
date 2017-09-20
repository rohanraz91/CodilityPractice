
public class MonkeyRiverCross {
	public static int solution(int a[],int X){
		int step=X;
		int[] arr=new int[X+1];
		for(int i=0;i<a.length;i++){
			if(a[i]>X)
				return -1;
			else if(arr[a[i]]==0){
				arr[a[i]]=1;
				step--;
			}
			if(step==0)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{1,3,1,4,2,3,5,4};
		System.out.println(solution(a, 5));
	}

}
