public class Photograph extends Art {

    private String printType;

    public Photograph(String name, String artist, int creationDate, String genre, String printType){
        super(name, artist, creationDate, genre);
        this.printType = printType;
    }

    public String getPrintType(){
        return printType;
    }
}