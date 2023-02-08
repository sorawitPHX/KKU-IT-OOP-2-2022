package lab10;

import java.io.File;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Directory name: ");
        String user_dir = input.nextLine();
        int user_choose;

        try {
            File dir = new File(user_dir);
            if (!dir.exists()) {
                System.out.printf("Directory '%s' not found", user_dir);
                return;
            }

            String[] files_list = dir.list();

            if (files_list.length == 0) {
                System.out.printf("Empyty Directory");
                return;
            }

            // SCREEN TO USER
            int arr_len = files_list.length;
            System.out.println("=== Choose file ===");
            for (int i = 0; i < arr_len; i++) {
                System.out.printf("%d. %s\n", (i + 1), files_list[i]);
            }

            String user_file_name;
            do {
                System.out.print("Enter file number: ");
                try {
                    user_choose = input.nextByte();
                    user_file_name = files_list[user_choose-1];
                    break;
                } catch (Exception e) {
                    System.out.printf("Select 1 to %d\n", arr_len);
                    input.nextLine();
                }
            } while (true);

            
            try {
                Scanner file_scan = new Scanner(new File(String.format("%s/%s", user_dir, user_file_name)));
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("-- Cannot read this file please try again --");
                return;
            }
            Scanner file_scan = new Scanner(new File(String.format("%s/%s", user_dir, user_file_name)));
            System.out.printf("=== Content of %s ===\n", user_file_name);


            // PRINT OUTPUT CONTENT
            while (file_scan.hasNext()) {
                System.out.println(file_scan.nextLine());
            }

            file_scan.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
