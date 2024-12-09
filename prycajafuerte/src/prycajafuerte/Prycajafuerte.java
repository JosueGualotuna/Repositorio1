

package prycajafuerte;

public class Prycajafuerte {

    public static void main(String[] args) {
CajaFuerte caja = new CajaFuerte(100);
        System.out.println(caja.getSaldoactual(1));
caja.setSaldoactual(500);
        System.out.println("El nuevo saldo es: "+caja.getSaldoactual(1));
} 
}
