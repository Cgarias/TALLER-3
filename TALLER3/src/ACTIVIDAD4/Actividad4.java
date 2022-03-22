
package ACTIVIDAD4;
public class Actividad4 {
    public static void main(String[] args) {
        
        int Tar2 = 0;
        int HoE = 0;
        double PaE = 0;
        double PaG = 0;
        double SulB = 0;
        
        String[] NomE = new String[5];
        NomE[1] = "Juan";
        NomE[2] = "Alberto";
        NomE[3] = "Luis";
        NomE[4] = "Andres";
        
        int[] NumH = new int[5];
        NumH[1] = 42;
        NumH[2] = 40;
        NumH[3] = 45;
        NumH[4] = 47;
        
        double[] Tar = new double[5];
        Tar[1] = 20;
        Tar[2] = 18;
        Tar[3] = 12;
        Tar[4] = 15;
        
        for(int i = 1; i <= 4; i = i + 1)
        {
          HoE = 0;
          HoE = NumH[i]-40;
          PaE = (Tar[i] + Tar[i]/2);
          PaG = 40 * Tar[i];
          SulB = PaG + PaE * HoE;
          System.out.println("Empleado: " + NomE[i]);
          System.out.println("Horas Trabajadas: " + NumH[i]);
          System.out.println("Tarifa normal: " + Tar[i]);
          System.out.println("Tarifa por horas extras: " + PaE);
          System.out.println("Sueldo Bruto: " + SulB);
          System.out.println("-----------------------------------");
        }

    }
}
