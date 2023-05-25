public class Art {

    private String name;
    private String artist;
    private int creationDate;
    private String genre;

    public Art(String name, String artist, int creationDate, String genre){
        this.name = name;
        this.artist = artist;
        this.creationDate = creationDate;
        this.genre = genre;
    }

    public String getArtist(){
        return artist;
    }

    public int getCreationDate(){
        return creationDate;
    }

    public String getGenre(){
        return genre;
    }
    public String getName(){
        return name;
    }
}
