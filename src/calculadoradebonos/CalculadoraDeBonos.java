package calculadoradebonos;

public class CalculadoraDeBonos {

        int salario;
        String mensajeDeBono; 
        public void calcular(){
        salario = 50000;
        mensajeDeBono = "Bono = $" + (.02 * salario);
        System.out.println(mensajeDeBono);
        }
        
    public static void main(String[] args) {
      
    CalculadoraDeBonos NuevoBono=new CalculadoraDeBonos();
    NuevoBono.calcular();  
    }
}
