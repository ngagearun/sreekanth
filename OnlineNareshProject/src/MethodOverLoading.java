
public class MethodOverLoading {
	
	static int sum;
	static void addition(int a,int b){
		sum=a+b;
		System.out.println(sum);
	}
	
	
	static void addition(int a,int b,int c){
		sum=a+b+c;
		System.out.println(sum);
	}
	
	static void addition(float a,float b){
		
		sum=(int) (a+b);
		System.out.println(sum);
	}
	
	static void addition(int a,int b,int c,int d){
		sum=a+b+c+d;
		System.out.println(sum);
	}
	
	static void main(int a){
		
	}

	public static void main(String[] args) {
	
		MethodOverLoading method=new MethodOverLoading();
		method.addition(200, 500);
		method.addition(300.5f, 564.5f);
		
		Divison d=new Divison();
		d.div(200, 400);

	}

}
