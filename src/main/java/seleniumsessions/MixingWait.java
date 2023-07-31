package seleniumsessions;

public class MixingWait {

	public static void main(String[] args) {

		//imp wait = 10 secs ----- for all elements
		//webdriverwait = 15 secs --- for specific elements
		
		//username :
		//imp wait :   10 secs---found element in 2 secs
		//WDwait :   15 secs---found element in 5 secs
		//total : 2+5 = 7 secs
		
		//imp wait :   10 secs---found element in 9secs
		//WDwait :   15 secs---found element in 14 secs
		//total : 9+14 = 23secs
		
		//imp wait :   10 secs---found element in 10secs
		//WDwait :   15 secs---found element in 25 secs
		//total : 9+14 = 25secs
		
		//imp wait :   10 secs---found element in 8secs
		//WDwait :   15 secs---found element in 12 secs
		//total : 8+12 = 20secs
	}

}
