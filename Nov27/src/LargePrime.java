
public class LargePrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 0;
		for(int i=3;i<1000;i++){
			
			if(primePalin(i)){
				result = i;
			}
			
			
		}
		System.out.println(result);
		
		
	}
	
	public static boolean  primePalin(int i){
		boolean flag = false;
		int temp=i;
		int sum=0;
		for(int j=2;j<i/2;j++){
			if(i%j==0){
				flag=false;
				return flag;
			}
			else{
				flag = true;
				
			}
				
		}
		
		while(i>0){
			int d = i%10;
			i = i/10;
			sum= sum*10 + d;
			
		}
		if(sum==temp){
			flag=true;
		}
		else{
			flag=false;
		}
		
		
		
		return flag;
		
		
	}

}
