public class FlourPacker {
    // write code here
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int totalKg = (bigCount * 5) + smallCount;



        if (totalKg >= goal) {
            int smallBagsNeed = goal % 5;
            if (smallCount >= smallBagsNeed) {
                return true;
            }
        }

        return false;


    }
}