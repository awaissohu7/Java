class A{

    public static void main(String[] args) {
        int a=0;

        for(String i: args)
        {
            int j = Integer.parseInt(i);
            a += j;
        }
            System.out.println(a);
            for(int i=0; i<args.length;i++){
                System.out.println(i);
            }
    }
}