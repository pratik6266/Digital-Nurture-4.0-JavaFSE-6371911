public class ExcelDocument implements Document {
    @Override
    public void create() {
        System.out.println("Creating a excel file");
    }

    @Override
    public void read() {
        System.out.println("Reading a excel file");
    }

    @Override
    public void delete(){
        System.out.println("Deleting a excel file");
    }
}
