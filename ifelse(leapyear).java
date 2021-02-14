class Example{
	public static void main(String[] args){
		int year=2021;
		if((year%4==0 && year%100!=0)|| year%400==0){
			System.out.println("this year is a leap year");
			
		}
		else{
			System.out.println("no, this is not a leap year");
		}
		
		
	}
	
	
}
