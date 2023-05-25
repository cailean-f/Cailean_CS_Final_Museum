import java.util.ArrayList;
import java.util.Arrays;

public class Exhibit {

    private Art[] allArt;
    public String exhibitName;

    public Exhibit(String exhibitName, Art[] allArt){
        this.exhibitName = exhibitName;
        this.allArt = allArt;
    }


    public Art[] getAllArt(){
        return allArt;
    }

    public String getExhibitName(){
        return exhibitName;
    }
    public ArrayList<Art> generateRandomizedItinerary(){
        ArrayList<Art> temp;
        temp = (ArrayList<Art>) Arrays.asList(this.allArt);
        //Collections.shuffle(temp);
        return temp;

    }


}
