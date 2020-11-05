public class CustomException extends Exception{
    String s;
    CustomException(String a){
        this.s=a;
    }
    public void display(){
        System.out.println(s);
    }
}
