class Solution {
    public boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {   
     
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i=0;i<arr1.length;i++)
        {
          sb1.append(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
          sb2.append(arr2[i]);
        }
        return sb1.toString().equals(sb2.toString());
    
    }
}