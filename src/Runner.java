import java.util.*;
public class Runner {

    public static void main(String[] args) {
        Museum FineArtMuseumOfSFO = new Museum(
                "Fine Art Museum of San Francisco",
                new Exhibit[]{
                        new Exhibit(
                                "Kehinde Wiley: An Archaeology of Silence",
                                new Art[]{
                                        new Painting("Femme Piquée par un Serpent", "Kehinde Wiley", 2022, "Contemporary", PaintType.Oil),
                                        new Sculpture("Youth Mourning", "Kehinde Wiley", 2022, "Contemporary", "Bronze", SculptingTechnique.Casting),
                                        new Sculpture("The Virgin Martyr Cecilia ", "Kehinde Wiley", 2022, "Contemporary", "Bronze", SculptingTechnique.Casting),
                                        new Painting("The Death of Hyacinth", "Kehinde Wiley", 2022, "Contemporary", PaintType.Oil),

                                }

                        ),
                        new Exhibit(
                                "Ansel Adams in Our Time",
                                new Art[]{
                                        new Photograph("Clearing Winter Storm", "Ansel Adams", 1937, "Realist", "Gelatin Silver Print"),
                                        new Photograph("The Tetons and Snake River", "Ansel Adams", 1942, "Realist", "Gelatin Silver Print"),
                                        new Photograph("The Golden Gate Before the Bridge", "Ansel Adams", 1932, "Realist", "Gelatin Silver Print"),
                                        new Photograph("Surf Sequence #2", "Ansel Adams", 1940, "Realist", "Gelatin Silver Print"),
                                        new Photograph("Mount Williamson, Sierra Nevada", "Ansel Adams", 1939, "Realist", "Gelatin Silver Print"),
                                }
                        )
                }

        );
        System.out.println("Welcome to the " + FineArtMuseumOfSFO.toString());
        System.out.println("Enter exhibit numbers spaced using commas to generate a custom itinerary of art to visit(Ex:0,1,4)");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<Integer>();
        int i = 0;
        String temp = sc.nextLine();
        Scanner line = new Scanner(temp);
        line.useDelimiter(",");

        sc.close();

        while(line.hasNext()){
            userInput.add(Integer.parseInt(line.next()));
           // System.out.print("+_+");
            i++;
        }
        line.close();


        System.out.print(FineArtMuseumOfSFO.generateCustomItinerary(userInput));
    }
}
