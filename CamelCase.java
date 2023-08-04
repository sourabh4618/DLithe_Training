class CamelCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(camelcase(s));
    }
}


public static int camelcase(String s) {
    // Write your code here
        int num = 1;
        for(char c : s.toCharArray()){
            if(c>='A' && c<='Z')
                num++;
        }
        return num;
}