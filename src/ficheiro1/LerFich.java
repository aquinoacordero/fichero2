package ficheiro1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class LerFich {

    static Scanner sc;

    public void lerLinea(String nome) {
        String resposta;
        try {
            sc = new Scanner(new File(nome));
            while (sc.hasNextLine()) {
                resposta = sc.nextLine();
                System.out.println(resposta);
            }
        } catch (IOException ex) {
            System.err.println("Erro de lectura" + ex.toString());
        } finally {
            sc.close();
        }
    }

    public void lerFich(String nome) {
        String resposta;
        try {
            sc = new Scanner(new File(nome));
            while (sc.hasNext()) {
                resposta = sc.next();
                System.out.println(resposta);
            }
        } catch (IOException ex) {
            System.err.println("Erro de lectura" + ex.toString());
        } finally {
            sc.close();
        }
    }
    public void lerNumeros(String nome){
        int res;
        try {
            sc = new Scanner(new File(nome));
            while (sc.hasNextInt()) {
                res = sc.nextInt();
                System.out.println(res);
            }
        } catch (IOException ex) {
            System.err.println("Erro de lectura" + ex.toString());
        } finally {
            sc.close();
        }
    }
}
