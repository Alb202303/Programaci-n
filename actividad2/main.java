import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       //Base base1 = new Base(); //error porque no se puede instanciar una clase abstracta
       Subclase1 subclase1 = new Subclase1(100, 9.95f, true);//constructor aunque no está deifinido
       String mensaje=subclase1.informar("juan");
       System.out.println(mensaje);
       //subclase1.setUnidades(10);
       //subclase1.setPrecio(7.95f);
       //subclase1.setAprobado(true);
       
       System.out.println(subclase1.getUnidades());
       System.out.println(subclase1.getPrecio());
       System.out.println(subclase1.getAprobado());
    }
}