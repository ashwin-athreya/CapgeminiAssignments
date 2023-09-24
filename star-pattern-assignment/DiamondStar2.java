package work;

public class DiamondStar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 4;
		
	    for (int i = 1; i <=size; i++) 
	    {
	      for (int j = size; j > i; j--) 
	      {
	        System.out.print(" ");
	      }
	      
	      for (int k = 0; k < i * 2 - 1; k++) 
	      {
	        System.out.print("*");
	      }
	      
	      System.out.println();
	    }
	    
	    for (int i = 1; i <= size - 1; i++) 
	    {
	        for (int j = 0; j < i; j++)
	        {
	          System.out.print(" ");
	        }
	        
	        for (int k = (size - i) * 2 - 1; k > 0; k--) 
	        {
	          System.out.print("*");
	        }
	        
	        System.out.println();
	}

}
}
