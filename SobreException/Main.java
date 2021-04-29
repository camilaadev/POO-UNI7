public class Main{  
  public static int divide(int a, int b) throws Exception{
     if(b==0){ 
       throw new Exception();
     }   
       return a/b;
     } 
   public static void main(String[]args){
     try{
      //divide(a, b);
      System.out.println("dividiu um pelo outro");
      divide(10, 2);
      System.out.println("dividiu 10 por 2");
      divide(20, 0);
      System.out.println("dividiu 20 por 0");
     }
     catch(Exception e){
         System.out.println("divisão por 0");
     }
   }
}