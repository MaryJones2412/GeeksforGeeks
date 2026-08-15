class Solution {
     public ArrayList<Integer> findUniquePair(int[] arr) {
         int xor = 0;

         for (int x : arr) {
             xor ^= x;
         }

         int bit = xor & -xor;

         int a = 0, b = 0;

         for (int x : arr) {
             if ((x & bit) != 0) {
                 a ^= x;
             } else {
                 b ^= x;
             }
         }

         ArrayList<Integer> result = new ArrayList<>();

         if (a < b) {
             result.add(a);
             result.add(b);
         } else {
             result.add(b);
             result.add(a);
         }

         return result;
     }
 }