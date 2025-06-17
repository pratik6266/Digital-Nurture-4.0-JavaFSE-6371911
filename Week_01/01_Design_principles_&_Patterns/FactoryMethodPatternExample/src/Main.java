import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Document you want to read like(word, pdf, excel): ");
        String str = sc.next();

        Document obj = Factory.getDocument(str);
        obj.create();
        obj.read();
        obj.delete();
    }
}

/*
OUTPUT:
Enter the Document you want to read like(word, pdf, excel):
pdf
Creating a pdf file
Reading a pdf file
Deleting a pdf file
 */