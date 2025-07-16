class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] vis=new int[nums2.length];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<vis.length;i++){
            vis[i]=0;
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=0; j<nums2.length;j++){
                if(nums1[i]==nums2[j] && vis[j]==0){
                    ans.add(nums1[i]);
                    vis[j]=1;
                    break;
                }
           }
        }
        int res[]=new int[ans.size()];
        for(int i=0; i<ans.size();i++){
            res[i] = ans.get(i);

        }

        return res;
    }
}

