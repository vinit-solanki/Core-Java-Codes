class mixed_triangle{
    public static void main(String[] args) {
        int n =4;
        
        
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }   
        

        // for(int i=1;i<=n;i++){
        //     int spaces = n-i;
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=i;k>=1;k--){
        //         System.out.print(k+" ");
        //     }
        //     for(int l=2;l<=i;l++){
        //         System.out.print(l+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}