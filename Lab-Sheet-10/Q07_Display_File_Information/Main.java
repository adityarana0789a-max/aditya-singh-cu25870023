import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        File f = new File(sc.nextLine());
        System.out.println("Exists: " + f.exists());
        System.out.println("Name: " + f.getName());
        System.out.println("Absolute path: " + f.getAbsolutePath());
        System.out.println("Size: " + (f.exists() ? f.length() : 0) + " bytes");
        System.out.println("Is file: " + f.isFile());
        System.out.println("Is directory: " + f.isDirectory());
        System.out.println("Readable: " + f.canRead());
        System.out.println("Writable: " + f.canWrite());
        sc.close();
    }
}
