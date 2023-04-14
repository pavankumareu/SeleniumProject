package practice;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8,2};   
		  int[] sub = {2,7};
		  int[] nsub = {3,4,1};
          
//	        System.out.println("Duplicate elements in given array: ");  
//	        //Searches for duplicate element  
//	        for(int i = 0; i < arr.length; i++) {  
//	            for(int j = i + 1; j < arr.length; j++) {  
//	                if(arr[i] == arr[j])  
//	                    System.out.println(arr[j]);  
		  
		  System.out.println(arr.length+" "+sub.length);
		  int count =1;
		//  System.out.println(sub[1]);
		  
		  for(int i=0;i<arr.length;i++)
		  {
			  if(count ==sub.length&& count>1)
			  {
				  System.out.println("the given sub sequence is correct ");
				  break;
			  }
			 
			  
			  if(sub.length<=(arr.length-i)&&sub[0]==arr[i]&&sub.length>1)
			  {
				  System.out.println(i);
			  for(int j=1 ,k=i+1;j<sub.length;j++,k++)
			  {
				  System.out.println();
				  if(sub[j]==arr[k])
				  {
					  //syso
					 count++;
				  }
				  
				  else {
					  count =1;
					  break;
				  }
			  }
			  }
		  }
		  
		  if(count!=sub.length)
			  
			  {
				  System.out.println("the given sub sequence is incorrect");
			  }
		  
		
//	            }  
	          
	}

}
