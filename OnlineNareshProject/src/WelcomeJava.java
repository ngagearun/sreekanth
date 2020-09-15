
class WelcomeJava {
	
	 double balance=10000;			
	
	 void Withdraw() {
				
		 balance= balance - 2000;
		 
		 System.out.println( balance);
		 
		//return balance;
	}
	 
	 
	 public static void main(String[] args) {
		 WelcomeJava hdfc=new WelcomeJava();
	       hdfc.Withdraw();
	       WelcomeJava sbi=new WelcomeJava();
	       sbi.Withdraw();
	     WelcomeJava axis=new WelcomeJava();
	     axis.Withdraw();

		
		
}
	
}
