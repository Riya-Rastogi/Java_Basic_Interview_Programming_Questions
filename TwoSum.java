import java.util.*;
public class TwoSum {
    
        public int[] twoSum(int[] arr, int target) {
            
            HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
            for(int i = 0; i <arr.length; i++){
    
                Integer diff = (Integer)(target - arr[i]);
                if(hash.containsKey(diff)){
                    int toReturn[] = {hash.get(diff)+1, i+1};
                    return toReturn;
                }
    
                hash.put(arr[i], i);
    
            }
         
            return null;
          
        }

    
}
