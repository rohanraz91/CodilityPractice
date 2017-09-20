import java.util.HashSet;

public class MissingInteger {
	public static int solution(int[] a){
		if(a.length>0){
			HashSet<Integer> hs=new HashSet<>();
			for(int i=0;i<a.length;i++){
				hs.add(a[i]);
			}
			int count=1;
			while(hs.contains(count)){
				count++;
			}
			return count;
		}
		else
			return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[]{1,3,6,4,1,2};
		System.out.println(solution(ar));
	}

}
