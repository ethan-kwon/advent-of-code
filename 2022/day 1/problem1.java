import java.util.Scanner;
import java.io.File;

class Problem1 {
    public static void main(String[] args) {
        try {
            File myFile = new File("problem1_input.txt");
            Scanner console = new Scanner(myFile);
            int max1 = 0;
            int max2 = 0;
            int max3 = 0;

            int local = 0;

            while (console.hasNext()) {
                String line = console.nextLine();
                if (line == "") {
                    if (local > max1) {
                        max3 = max2;
                        max2 = max1;
                        max1 = local;
                    } else if (local > max2) {
                        max3 = max2;
                        max2 = local;
                    } else if (local > max3) {
                        max3 = local;
                    }
                    local = 0;
                } else {
                    local += Integer.parseInt(line);
                }
            }

            if (local > max1) {
                max3 = max2;
                max2 = max1;
                max1 = local;
            } else if (local > max2) {
                max3 = max2;
                max2 = local;
            } else if (local > max3) {
                max3 = local;
            }

            System.out.println(max1 + max2 + max3);

            console.close();
        } catch (Exception e) {
            System.out.println("an error");
            e.printStackTrace();
        }
        
    }
}
