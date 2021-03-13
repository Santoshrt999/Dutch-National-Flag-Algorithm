package com.graphs;

import java.util.*;

class Dutch {
	
    
    public static void dutch_flag_sort(char[] balls) {
        
        int low=0, high=balls.length-1;
        int mid=0;
        char temp = '\0';
        
        while(mid <= high){
           switch(balls[mid]){
               case 'R':
                  
                  temp = balls[low];
                  balls[low]=balls[mid];
                  balls[mid]=temp;
                  low++;
                  mid++;
                  break;
               
               case 'G': 
                   mid++;
                   break;
               
               case 'B' : 
                   temp = balls[mid];
                   balls[mid]=balls[high];
                   balls[high]=temp;
                   high--;
                   break;
                   
           }
        }
        

    }

}
