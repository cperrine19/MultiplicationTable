package multiplication;

import java.util.Scanner; //using to read input from console for "N"
import java.io.FileWriter; //writing to output HTML file

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // looking for console input
        System.out.print("Enter the value of N: "); // prompt user
        int N = scanner.nextInt(); // turn console input into "N"
        try (FileWriter writer = new FileWriter("MultiplicationTables.html")) { // write to HTML output file
            writer.write("<!DOCTYPE html>\n");
            writer.write("<html>\n");
            writer.write("<head>\n<title>Multiplication Tables</title>\n</head>\n"); // title
            writer.write("<body>\n");
            // loop through for each table 1 through N
            for (int i = 1; i <= N; i++) {
                writer.write("<h2>Multiplication Table for Number " + i + "</h2>\n"); // table header
                writer.write("<table border='1'>\n"); // put in table
                // loop through 1-10 for each table to create the multiplication table
                for (int j = 1; j <= 10; j++) {
                    writer.write("<tr><td>" + i + " * " + j + "</td><td>" + (i * j) + "</td></tr>\n");
                }
                writer.write("</table><br/>\n");
            }
            writer.write("</body>\n</html>\n");

            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}