public class pascals_triangle {
    public static void main(String[] args){
        int n=5;
        int[][] ans = new int[n+1][];
        for(int i=0;i<=n;i++){
            ans[i] = new int[i+1];
            ans[i][0]=1;
            if(i>0)
            ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(ans[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for (int i = 0; i <= n; i++) {
            // Print leading spaces for centering
            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");  // 2 spaces per level for better alignment
            }

            // Print the numbers in the row
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", ans[i][j]);  // Width of 4 for uniform spacing
            }
            System.out.println();
        }
    }
}
