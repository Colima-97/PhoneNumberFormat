package phone.number_format;
import java.util.Scanner;

public class PhoneNumberFormat {
   
    public static void main(String[] args) {
        System.out.print("Inserte su número (10 dígitos): ");
        String numb = new Scanner(System.in).next();
        boolean ban = isNumeric(numb);
        if(ban){            
            System.out.println(numb.length()==10&&!numb.isEmpty()?
                "("+numb.substring(0,3)+")"+" "+numb.substring(3,6)+"-"+numb.substring(6)+"":
             "Número inválido");
        }else{
            System.out.println("Debe ser un número");
        }
    }
    
    public static boolean isNumeric(String numb){
        boolean resultado;
        
        try{
            Long.parseLong(numb);
            resultado=true;
        }catch (NumberFormatException e){
            resultado=false;
        }
        
        return resultado;
    }
    
}
