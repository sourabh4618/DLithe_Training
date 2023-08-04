class Stair {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        staircase(n);
    }

    public static void staircase(int n) {
        int j;
        for(int i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=j;k<n;k++){
                System.out.print("#");
            }
            System.out.println();
        }

    }

}