import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) {
             Scanner leia = new Scanner(System.in);
                
             int number;
            
        System.out.print("What is the maximum number for a byte variable?: ");
		number = leia.nextInt();
        
        if(number>127){
        }else if (number<-128) {  
        System.out.println("This number represents at least one short.");}
        else {System.out.println("This number represents at byte.");
             }
             
        
    }
}
