import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    public static void main(String[] args) {

        int turnedOn=2;
        //the hours are from 0 to 11
        // and the minutes are from 0 to 59
        // so the time complexity would be O(12+60)
        List<String> time=new ArrayList<>();
        for(int hours=0;hours<=11;hours++){
            // check every possible combination for the hours and minutes
            for(int minutes=0;minutes<=59;minutes++){
                // the total number of set bits of hours and minutes combined should be equal to turned on lights
                if(Integer.bitCount(hours)+Integer.bitCount(minutes)==turnedOn){
                    String hh=String.valueOf(hours);
                    String mm=(minutes<10?"0":"")+minutes;

                    time.add(hh+":"+mm);



                }

            }

        }
     for(String s:time){
         System.out.print(s+" ");
     }
    }
}
