/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author ADM
 */
public class BT10 {
    public static void main(String[] args) throws IOException {
        String filename = "";
        File f = new File("");
        filename = f.getAbsolutePath() + "\\src\\lab2\\data.txt";
        f = new File(filename);
        if (f.exists()) {
            System.out.println("File đã tồn tại");
            System.exit(0);
        }
        PrintWriter pw = new  PrintWriter(f);
        pw.print("Nguyen Duc Tan - ");
        pw.println(2021);
        pw.print("http://nguyenductan.info");
        System.out.println("Đã ghi file xong");
        Scanner sc = new Scanner(f);
        while (sc.hasNext()) {
            String ten = sc.next();
            System.out.print(ten + " ");
            int maso = sc.nextInt();
            System.out.print(maso);
        }
    }
}
