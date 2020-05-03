
//------------------------------------------------------------------------------------------------

//right rotate by 1 
//----------------------------------------------------------------------------------------------------------

// import java.util.Scanner;
// class ArrayRotation
// {
// 	public static void main(String[] args) {
		

		
// 		System.out.println("Enter how many right shift");
// 		Scanner s=new Scanner(System.in);
// 		int n=s.nextInt();
// 		int arr[]=new int[] {1,2,3,4,5};
        
		
// 			for(int i=1;i<=n;i++)
// 			{
// 	        int temp=arr[arr.length-1];
	       
// 			for(int j=arr.length-1;j>=1;j--){
// 				arr[j]=arr[j-1];
// 			}
// 			     arr[0]=temp;
			
		  

// 		  }
	   
// 	    System.out.println("Array after right rotation: ");    

//         for(int i = 0; i< arr.length; i++){    
//             System.out.print(arr[i] + " ");  
//             }  
// 	}

//------------------------------------------------------------------------------------------------

//left rotate by 1 
//----------------------------------------------------------------------------------------------------------
// import java.util.Scanner;
// class ArrayRotation
// {
// 	public static void main(String[] args) {
		

		
// 		System.out.println("Enter how many left shift");
// 		Scanner s=new Scanner(System.in);
// 		int n=s.nextInt();
// 		int arr[]=new int[] {1,2,3,4,5};
        
		
// 			for(int i=1;i<=n;i++)
// 			{
			
// 			 int temp = arr[0];  
//             for(int j = 0; j < arr.length-1; j++){  
//                 //Shift element of array by one  
//                 arr[j] = arr[j+1];  
//             }  
//                 														//First element of array will be added to the end  
//             arr[arr.length-1] = temp;  
		  

// 		  }
	   
// 	    System.out.println("Array after left rotation: ");    

//         for(int i = 0; i< arr.length; i++){    
//             System.out.print(arr[i] + " ");  
//             }  


		
// 	}
// }

//------------------------------------------------------------------------------------------------

//left rotate by 2
//----------------------------------------------------------------------------------------------------------


import java.util.Scanner;
class ArrayRotation
{
	public static void main(String[] args) {
		

		
		System.out.println("Enter how many left shift");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[] {1,2,3,4,5};
        
		
			for(int i=1;i<=n;i++)
			{
			 
			 int t1=arr[0];
			 int t2=arr[i];
			 
            for(int j = 0; j < arr.length-1; j++){  
                //Shift element of array by one  
                arr[j] = arr[j+2];  
                arr[j+1]=arr[j+3];
            }  
            arr[arr.length-2]=t1;
             arr[arr.length-1]=t2;

                														//First element of array will be added to the end  
            
		  

		  }
	   
	    System.out.println("Array after left rotation: ");    

        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");  
            }  


		
	}
}

