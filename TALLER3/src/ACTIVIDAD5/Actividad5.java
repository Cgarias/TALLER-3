package ACTIVIDAD5;
public class Actividad5 {
    public static void main(String[] args) {      
        
        int[] com = new int[6];
        com[1] = 1;
        com[2] = 2;
        com[3] = 3;
        com[4] = 4;
        com[5] = 5;
        
        int[][] Can = new int[6][5];
        Can[1][1] = 194;
        Can[2][1] = 180;
        Can[3][1] = 221;
        Can[4][1] = 432;
        Can[5][1] = 820;
        
        Can[1][2] = 48;
        Can[2][2] = 20;
        Can[3][2] = 90;
        Can[4][2] = 50;
        Can[5][2] = 61;
        
        Can[1][3] = 206;
        Can[2][3] = 320;
        Can[3][3] = 140;
        Can[4][3] = 821;
        Can[5][3] = 946;
        
        Can[1][4] = 45;
        Can[2][4] = 16;
        Can[3][4] = 20;
        Can[4][4] = 14;
        Can[5][4]= 18;
        
        int[][] To = new int[6][5];

        for(int i = 1; i <= 5; i = i + 1)
        {
            for (int j = 1; j <= 5; j = j + 1)
            {
            To[j][i] = To[j][i] + Can[j][i];
            }
        }
        for(int i = 1; i <= 5; i = i + 1)
        {
            for (int j = 1; j <= 5; j = j + 1)
            {
                System.out.println("Numero de votos= " + To[j][i]);
            }
        }
        
        
    
        
        
    }
}
