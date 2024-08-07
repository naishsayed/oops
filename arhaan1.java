



class addition{
    public void add(String name, int no){
         String obj = name;
        System.out.println("name is "+ obj);
      
       int rollno = no;
        System.out.println("roll no is " + rollno);
    }

     public void add(int no,String name){
      String obj = name;
     System.out.println("name is "+ obj);
   
      
      int rollno = no;
     System.out.println("roll no is " + rollno);
 }

 
 

 
}


class arhaan1{
    public static void main(String[] args) {
    
    addition ad = new addition();

       ad.add("arhaan",60);
       ad.add(60,"arhaan");
 

 
     
    }

}





















