import java.util.ArrayList;

public class BisKota {
    public static void main(String[] args) {
        ArrayList <int[]>StopGo = new ArrayList<int[]>();
        StopGo.add(new int[]{10,0});
        StopGo.add(new int[]{3,5});
        StopGo.add(new int[]{2,5});
        System.out.println("jumlah penumpang: "+GetPessenger(StopGo));
    }
        public static int GetPessenger(ArrayList<int[]> BisKota){
            int total= 0;
            for (int[] main : BisKota){
                total += main[0] - main[1];

            }return total;
        }
    }
