package Basic;

interface calc
{
	int VAR=1;
	void calc(int item);
	
}
interface calculate extends calc
{			 
	
            int VAR = 0;
                      
            void calc(int item);
}

        
// Only one time you can override the interfcae and We need output like 0 0 4.
//Note you can use the Array also.

public abstract class Interfaces implements calc  {
	
	  public static void main(String args[]) 
      {
       
      }
}
