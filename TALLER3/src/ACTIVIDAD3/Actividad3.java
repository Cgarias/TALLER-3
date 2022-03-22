package ACTIVIDAD3;
public class Actividad3 {
    public static void main(String[] args) {
        
        double VeT = 0;
        double PaV = 0;
        double PaF = 200;
        double CoP = 0;
        double CaA = 0;
        double CaB = 0;
        
        double[] venta = new double[8];
        venta[1] = 2000;
        venta[2] = 1321;
        venta[3] = 720;
        venta[4] = 820;
        venta[5] = 1200;
        venta[6] = 1000;
        venta[7] = 1200;
        
        for(int i = 1; i <= 7; i = i + 1)
        {
            VeT = VeT + venta[i];
        }
        CoP = VeT * 0.09;
        PaV = PaF + CoP;
      
        if( VeT > 3000 && VeT < 5000)
            CaA = PaV + PaV * 0.05;
        else if( VeT > 5000 && VeT < 7000)
            CaA = PaV + PaV * 0.07;
        else if( VeT > 7000)
            CaA = PaV + PaV * 0.1;
        
        if( VeT > 5000 && VeT < 10000)
            CaB = PaV + PaV * 0.07;
        else if( VeT > 10000 && VeT < 15000)
            CaB = PaV + PaV * 0.1;
        else if( VeT > 15000)
            CaB = PaV + PaV * 0.13;
        
        System.out.println("Vendido en la semana: " + VeT);
        System.out.println("Pago fijo semana: " + PaF);
        System.out.println("Comision por ventas: " + CoP);
        System.out.println("TOTAL: " + PaV);
        System.out.println("--------------------------------");
        System.out.println("Pago semanal categoria A: " + CaA);
        System.out.println("Pago semanal categoria B: " + CaB);
        
        
        
             
        
    }
    
}
