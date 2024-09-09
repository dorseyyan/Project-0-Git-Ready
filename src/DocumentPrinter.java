public class DocumentPrinter implements Printable<String> {

    @Override
    public void print(String item) {
        System.out.println("Printing document: " + item);
    }

    public static void main(String[] args) {
        DocumentPrinter printer = new DocumentPrinter();
        printer.print("This is an updated Java project!");
    }
}

