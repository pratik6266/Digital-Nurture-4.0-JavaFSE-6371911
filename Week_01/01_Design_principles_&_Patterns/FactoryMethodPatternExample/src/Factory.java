public class Factory {
    public static Document getDocument(String str){
        if(str.trim().equalsIgnoreCase("word")){
            return new WordDocument();
        }
        else if(str.trim().equalsIgnoreCase("pdf")){
            return new PdfDocument();
        }
        else if(str.trim().equalsIgnoreCase("excel")){
            return new ExcelDocument();
        }
        else{
            return null;
        }
    }
}
