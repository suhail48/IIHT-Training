public class Test{
	public static int f1(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return f1(n-2) + f1(n-1);
	}
    public static void main(String args[]) {
	int n= 10;
	System.out.print("Fibonacci Series of "+n+" numbers: ");
	for(int i = 0; i < n; i++){
			System.out.print(f1(i) +" ");
		}
	}
}
