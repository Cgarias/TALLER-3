package ACTIVIDAD5;
public class Actividad5 {
    public static void main(String[] args) {      
        
        int TotalV = 0;
        int TotaC = 0;
        int ComM = 0;
        float CanM = 0;
        String Gan = "";
 
        int[][] Can = new int[5][6];
        Can[0][1] = 1;
        Can[0][2] = 2;
        Can[0][3] = 3;
        Can[0][4] = 4;
        Can[0][5] = 5;
        
        Can[1][1] = 194;
        Can[1][2] = 180;
        Can[1][3] = 221;
        Can[1][4] = 432;
        Can[1][5] = 820;
        
        Can[2][1] = 48;
        Can[2][2] = 20;
        Can[2][3] = 90;
        Can[2][4] = 50;
        Can[2][5] = 61;
        
        Can[3][1] = 206;
        Can[3][2] = 320;
        Can[3][3] = 140;
        Can[3][4] = 821;
        Can[3][5] = 946;
        
        Can[4][1] = 45;
        Can[4][2] = 16;
        Can[4][3] = 20;
        Can[4][4] = 14;
        Can[4][5] = 18;
        
        float[] To = new float[5];
        To[1] = 0;
        To[2] = 0;
        To[3] = 0;
        To[4] = 0;
        
        int[] ToC = new int[5];
        ToC[1] = 0;
        ToC[2] = 0;
        ToC[3] = 0;
        ToC[4] = 0;
        
        String [] CanD = new String[5];
        CanD[1] = "A";
        CanD[2] = "B";
        CanD[3] = "C";
        CanD[4] = "D";
        
        float [] Por = new float[5];
        Por[1] = 0;
        Por[2] = 0;
        Por[3] = 0;
        Por[4] = 0;
        
        System.out.println("  Comuna  |  Candidato A  |  Candidato B  |  Candidato C  |  Candidato D");
        System.out.println("    1     |      " + Can[1][1] + "      |      "  + Can[2][1] + "      |      "  + Can[3][1]+  "      |      "  + Can[4][1]);
        System.out.println("    2     |      " + Can[1][2] + "      |      "  + Can[2][2] + "      |      "  + Can[3][2]+  "      |      "  + Can[4][2]);
        System.out.println("    3     |      " + Can[1][3] + "      |      "  + Can[2][3] + "      |      "  + Can[3][3]+  "      |      "  + Can[4][3]);
        System.out.println("    4     |      " + Can[1][4] + "      |      "  + Can[2][4] + "      |      "  + Can[3][4]+  "      |      "  + Can[4][4]);
        System.out.println("    5     |      " + Can[1][5] + "      |      "  + Can[2][5] + "      |      "  + Can[3][5]+  "      |      "  + Can[4][5]);
        
        for (int i = 1; i < Can.length; i++)
        {
            for (int j = 1; j <= Can.length; j++)
            {
                To[i]+= Can[i][j];     
            }
            TotalV+= To[i];
            
        }
        
        for (int i = 1; i < 5; i++)
        {
            
            Por[i]=(To[i]*100)/TotalV;
            System.out.println("Total Votos candidato "+ CanD[i] +": " + To[i]+" ----> " + Por[i]+"%") ;
            if (CanM < To[i])
            CanM = To[i];
            if (Por[i]>50)
            Gan=CanD[i];
        }
        
        System.out.println("Candadidato con mas votos: " + "C");
        System.out.println("Total votos: " + TotalV);
        System.out.println("Ganador !Candidato " + Gan + "!");
        System.out.println("----------------------------------");
        
        for (int j = 1; j < Can.length; j++)
        {
            for (int i = 1; i < Can.length; i++)
            {
                ToC[j]+= Can[i][j];     
            } 
            System.out.println("Total Votos comuna "+ Can[0][j] +": " + ToC[j]);
            TotaC+= ToC[j];
            if (ComM < ToC[j])
            ComM=Can[0][j];
            
        }
        System.out.println("Total Votos: " + TotaC);
        System.out.println("Comuna con mas votos: " + ComM);
        
    }
}
