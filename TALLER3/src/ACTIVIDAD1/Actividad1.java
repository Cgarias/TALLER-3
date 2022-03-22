package ACTIVIDAD1;
public class Actividad1 {
    public static void main(String[] args) {
        
        int ToPrV = 0;
        double TotalI = 0;
        int Max = 0;
        int ProC = 0;
        double Pre = 0;
        double Pre2 = 0;

        
        int[] CoProV = new int[5];
        CoProV[1] = 452;
        CoProV[2] = 231;
        CoProV[3] = 114;
        CoProV[4] = 293;
        
        double[] ValorP = new double[5];
        ValorP[1] = 1200;
        ValorP[2] = 3000;
        ValorP[3] = 4000;
        ValorP[4] = 600;
        
        int[] CanVeP = new int[5];
        CanVeP[1] = 12;
        CanVeP[2] = 7;
        CanVeP[3] = 18;
        CanVeP[4] = 9;
        
        for(int i = 0; i <= 4; i = i + 1)
        {
            ToPrV = ToPrV + CanVeP[i];
            TotalI = ValorP[i] * CanVeP[i] + TotalI;
        }
        for(int i = 1; i <= 4; i = i + 1)
        {
            if(Max < CanVeP[i])
                Max = CoProV[i];
            if(Pre < CanVeP[i])
                Pre = ValorP[i];
                        
            if(ProC < ValorP[i])
                ProC = CoProV[i];
            if(ProC < ValorP[i])
                Pre2 = ValorP[i];

        }
        System.out.println("Total productos vendidos en el día: " + ToPrV );
        System.out.println("Total ingresos por ventas del dia: " + TotalI );
        System.out.println("--------------------------------" );
        System.out.println("El producto más vendido: ");
        System.out.println("Codigo: " + Max);
        System.out.println("Precio: " + Pre);
        System.out.println("--------------------------------" );
        System.out.println("El producto más costoso vendido " );
        System.out.println("Codigo: " + ProC);
        System.out.println("Precio: " + Pre2);
    }

}
