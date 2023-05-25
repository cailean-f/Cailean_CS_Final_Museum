public class Painting extends Art{


    private PaintType paintType;



    public Painting(String name, String artist, int creationDate, String genre, PaintType paintType){
        super(name, artist, creationDate, genre);
        this.paintType = paintType;
    }

    public PaintType getPaintType(){
        return paintType;
    }
}
