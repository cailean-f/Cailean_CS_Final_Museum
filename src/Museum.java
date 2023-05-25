import java.util.ArrayList;

public class Museum {

    private Exhibit[] exhibits;
    private String museumName;

    public Museum(String museumName,Exhibit[] exhibits){
        this.exhibits = exhibits;
        this.museumName = museumName;
    }


    //generates a randomly shuffled list of all the paintings at a museum that can be visited
    public String generateAllPaintingsItinerary(){
        ArrayList<Painting> temp = new ArrayList<Painting>();
        for(Exhibit curr : exhibits){
            for(Art art: curr.getAllArt()){
                if(art instanceof Painting){
                    temp.add((Painting) art);
                }
            }
        }
        //Collections.shuffle(temp);
        return "All Paintings Itinerary: " + stringifyItinerary(temp);
    }

    private String stringifyItinerary(ArrayList<? extends Art> artList){
        String temp = "";
        for(int i = 0; i < artList.size(); i++){
            temp += i + ": "+ artList.get(i).getName() + "\n";
        }
        return temp;
    }

    //generates a randomly shuffled list of all the sculptures at a museum that can be visited
    public String generateAllSculpturesItinerary(){
        ArrayList<Sculpture> temp = new ArrayList<Sculpture>();
        for(Exhibit curr : exhibits){
            for(Art art: curr.getAllArt()){
                if(art instanceof Sculpture){
                    temp.add((Sculpture) art);
                }
            }
        }
       // Collections.shuffle(temp);
        return "All Sculptures Itinerary: " + stringifyItinerary(temp);
    }

    //generates a randomly shuffled list of all the photographs at a museum that can be visited
    public String generateAllPhotographsItinerary(){
        ArrayList<Photograph> temp = new ArrayList<Photograph>();
        for(Exhibit curr : exhibits){
            for(Art art: curr.getAllArt()){
                if(art instanceof Photograph){
                    temp.add((Photograph) art);
                }
            }
        }
      //  Collections.shuffle(temp);
        return "All Photograph Itinerary:" + stringifyItinerary(temp);
    }

    public String generateCustomItinerary(ArrayList<Integer> userInput){
        ArrayList<Art> temp = new ArrayList<Art>();
        for(int i = 0; i < userInput.size(); i++){
            for(Art art: exhibits[userInput.get(i)].getAllArt()){
                temp.add(art);
            }
        }
        return "Custom Itinerary:" + "\n" + stringifyItinerary(temp);
    }

    @Override
    public String toString(){
        String formatted = museumName;
        museumName += "\n";
        museumName += "Exhibits:" + "\n";
        for(int i = 0; i < exhibits.length; i++){
            museumName += i + ": " + exhibits[i].getExhibitName();
            museumName += "\n";
        }
        return museumName;
    }

}
