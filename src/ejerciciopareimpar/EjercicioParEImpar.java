import javax.swing.JOptionPane;
public class EjercicioParEImpar {
    public static void main(String[] args) {
        byte r;
        int num,x,a;
        for (x=1;x<=10;x++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
            r = (byte) (num%2);
            if (r==0){
                System.out.printf( "\nEl numero es par ",+num);
                for (a=1;a<=num/2;a++){
                    System.out.print("*");  
                }   
            }else {
                System.out.printf( "\nEl numero es impar ",+num);
            }  
        } 
    }
}
