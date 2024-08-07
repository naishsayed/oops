


class addition{
    public int add(int a,int b){

        int c = a + b;
        return c;
    }

    public int add(int a, int b,int c){
        int d = a + b+ c;
        return d;
    }

}


class main{
    public static void main(String[] args) {
         
         addition ad = new addition();
       
        int i = ad.add(2,3);
        System.out.println("addition of two number is " + i);

       int j =ad.add(1,2,3);
       System.out.println("addition of three number is " + j); 
    }
    


}