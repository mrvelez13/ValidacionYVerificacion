public class Numeros {
    public static void main(String args[]) {
        int a = 25;
        int b = 100;
        int c = 1;
        //A es menor
        if ((a < b) && (a < c)) {
            System.out.println(a);
        }if(b < c){
            System.out.println(b);
            System.out.println(c);
        }else if (a > c){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        //b es menor
        else if ((b < a) && (b < c)) {
            System.out.println(b);
        }if(c < b){
            System.out.println(c);
            System.out.println(a);
        }else if (b > a){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            //c es mayor
        } else if ((c < a) && (c < b)) {
            System.out.println(c);
        } if(b < c){
            System.out.println(b);
            System.out.println(a);
        }else if (c > a){
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
        
        
         
    }
}