class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int cols=image[0].length;
        for(int i=0;i<n;i++){
            for(int j=0,k=cols-1;j<k;j++,k--){
                int temp=image[i][j];
                image[i][j]=image[i][k];
                image[i][k]=temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(image[i][j]==0) image[i][j]=1;
                else image[i][j]=0;
            }
        }

        return image;

    }
}