package lab10;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.print("Enter directory name: ");
        String dir_name = input.nextLine();
        System.out.print("Enter filename: ");
        String file_name = input.nextLine();

        
        try {
            File dir = new File(dir_name);
            if ( !dir.exists() ) {
                dir.mkdir();
            }
            String current_time = dateFormat.format(dir.lastModified());
            String current_time_noColon = dateFormat.format(dir.lastModified()).substring(11, 19).replace(":", "");
            file_name = current_time_noColon + "-" + file_name;
            
            PrintWriter file = new PrintWriter(new FileWriter(String.format("%s/%s.txt", dir, file_name)));
        
            file.print(current_time);
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
