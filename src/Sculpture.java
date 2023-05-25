public class Sculpture extends Art{


    private String material;
    private SculptingTechnique technique;

    public Sculpture(String name, String artist, int creationDate, String genre, String material, SculptingTechnique technique){
        super(name,artist,creationDate,genre);
        this.material = material;
        this.technique = technique;
    }

    public String getMaterial(){
        return material;
    }

    public SculptingTechnique getTechnique(){
        return technique;
    }
}
