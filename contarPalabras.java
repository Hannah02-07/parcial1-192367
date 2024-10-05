import java.util.Scanner;
public class contarPalabras
{
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
String frase1 = leer.nextLine();
frase1= frase1.trim().replaceAll("\\s+", " ");
String[] palabras1 = frase1.split(" ");
for (int i=0; i<palabras1.length; i++){
    System.out.println(" la cantidad de palabras de esta frase: "+ "es" +i);

}



    }
}
