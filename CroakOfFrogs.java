package biweeklyTest;

public class CroakOfFrogs {

    public static void main(String[] args) {

        String croakOfFrogs = "croakcroak";
        int[] count = new int[5];
        int maxFrogs = 0;
        int size = croakOfFrogs.length();

        for (int i = 0; i < size; i++) {

            char ch = croakOfFrogs.charAt(i);

            if (ch == 'c') {
                count[0]++;
                maxFrogs = Math.max(maxFrogs, count[0] - count[4]);
            } 
            else if (ch == 'r') {
                count[1]++;
            } 
            else if (ch == 'o') {
                count[2]++;
            } 
            else if (ch == 'a') {
                count[3]++;
            } 
            else if (ch == 'k') {
                count[4]++;
            } 
            else {
                System.out.println(-1);
                return;
            }

            if (!(count[0] >= count[1] &&
                  count[1] >= count[2] &&
                  count[2] >= count[3] &&
                  count[3] >= count[4])) {
                System.out.println(-1);
                return;
            }
        }

        if (count[0] != count[1] ||
            count[1] != count[2] ||
            count[2] != count[3] ||
            count[3] != count[4]) {
            System.out.println(-1);
            return;
        }

        System.out.println(maxFrogs);
    }
}
