/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
/**
 *
 * @author ADM
 */
public class BT9 {
    public static void main(String args[]) throws IOException {
        try (FileOutputStream os = new FileOutputStream("abc.txt")){
            String s = "Chao cac ban den voi chuong trinh doc xuat file";
            for (int i = 0; i < s.length(); i++) {
                os.write(s.charAt(i));
            }
        }
        try(
            FileInputStream is = new FileInputStream("abc.txt")){
            int ibyts = is.available();
            System.out.println("File có tất cả "+ ibyts + "ký tự");
            byte ibuf[] = new byte[ibyts];
            int byrd = is.read(ibuf, 0, ibyts);
            System.out.println("Tổng số ký tự được đọc là: " + byrd);
            System.out.println("Chuỗi ký tự là: " + new String(ibuf));
        }
        File f1 = new File("abc.txt");
        f1.delete();
    }
    
}
