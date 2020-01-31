package com.akash.array;

import java.util.HashMap; 
  
public class ZeroSumSubarray { 
      

    static Boolean subArrayExists(int arr[]) 
    { 
       
        HashMap<Integer, Integer> hM =  
                        new HashMap<Integer, Integer>(); 
          
   
        int sum = 0;      
          
       
        for (int i = 0; i < arr.length; i++) 
        {  
           
            sum += arr[i]; 
              
          
            if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)                          
                return true; 
              
         
            hM.put(sum, i); 
        }  
          
       
        return false; 
    }      
      
   
    public static void main(String arg[]) 
    { 
        int arr[] = {-3, 2, 3, 1, 6}; 
        if (subArrayExists(arr)) 
            System.out.println("Found a subarray with 0 sum"); 
        else
            System.out.println("No Such Sub Array Exists!");          
    }          
} 