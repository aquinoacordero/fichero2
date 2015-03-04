package ficheiro1;

public class Ficheiro1 {

    public static void main(String[] args) {
        LerFich obx=new LerFich();
        obx.lerLinea("texto.txt");
        obx.lerFich("texto.txt");
        obx.lerNumeros("numeros.txt");
    }
    
}
