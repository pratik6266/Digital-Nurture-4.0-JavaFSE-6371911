public class WordDocument implements Document {
    @Override
    public void create() {
        System.out.println("Creating a word file");
    }

    @Override
    public void read() {
        System.out.println("Reading a word file");
    }

    @Override
    public void delete(){
        System.out.println("Deleting a word file");
    }
}
