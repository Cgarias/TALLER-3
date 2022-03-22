package ACTIVIDAD2;
public class Actividad2 {
    public static void main(String[] args) {
        int saldo, abono, deduc, LimC, NewS;
        saldo = 1000000;
        abono = 700000;
        deduc = 100000;
        LimC = 1500000;
        
        NewS = ( saldo + abono - deduc );
        
        System.out.println("Saldo mes: " + saldo );
        System.out.println("Abono mes: " + abono );
        System.out.println("Deduccion mes: " + deduc );
        System.out.println("Limite de credito: " + LimC );
        
        System.out.println("------------------------------");
        
        System.out.println("Nuevo saldo es: " + NewS );
        if (LimC < NewS)
            System.out.println("!!Se excedió el límite de su crédito!!");
    } 
    
}