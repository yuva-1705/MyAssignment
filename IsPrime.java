package homeAssignment;

public class IsPrime {

	public static void main(String[] args) {
    int num=13;
    boolean isPrime = true;
    for(int i=2;i<num;i++)
    {
    	{
    		if(num%i==0) 
    		isPrime = false;
    	}
    	
    }
    if(isPrime) 
	{
	    System.out.println("The given number is prime " + num);
	}
    else
    {
    	System.out.println("The given number is not a prime " + num);
    }
	}

}
