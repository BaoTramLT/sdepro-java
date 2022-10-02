package lab_06;

public class CalculateMinutes {
    public static void main(String[] args) {

        String myStr = "2hrs and 5 minutes";

        //cut
        String hours = myStr.substring(0,4);
        String minutes = myStr.substring(5);

        //replace
        hours = hours.replaceAll("[^0-9]","");
        minutes = minutes.replaceAll("[^0-9]","");

        //calculate
        System.out.println("Total minutes is: " + (Integer.parseInt(hours)*60 + Integer.parseInt(minutes)));

    }

}
