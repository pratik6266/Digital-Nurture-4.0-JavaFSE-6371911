public class PdfDocument implements Document {
    @Override
    public void create() {
        System.out.println("Creating a pdf file");
    }

    @Override
    public void read() {
        System.out.println("Reading a pdf file");
    }

    @Override
    public void delete(){
        System.out.println("Deleting a pdf file");
    }
}
