public class secondsAndMinutes {
    //creating a Constant and constants are usually in UpperCase
    public static final String INVALID_VALUE_MESSAGE = "Invalid value.";
    public static void main(String[] args){

        System.out.println(getDurationString( 60, 59));
        System.out.println(getDurationString(343234)) ;
        System.out.println(getDurationString(-34));
        System.out.println(getDurationString(65,51));
    }
    public static String getDurationString(long minutes, long seconds){
        if(minutes >=0 && (seconds >=0 && seconds <=59)){
              long hours =(int) minutes / 60;
              long remainingminutes = minutes % 60;
              String hoursString = hours +"h ";
              if(hours <10){
                  hoursString = "0"+hoursString;
            }
            String minuteString = remainingminutes +"m ";
            if(remainingminutes <10){
                minuteString = "0"+minuteString;
            }
            String secondString = seconds +"s";
            if(seconds < 10){
                secondString = "0"+secondString;
            }
             return hoursString +minuteString +secondString +"";

        }else{
            return INVALID_VALUE_MESSAGE;
        }
    }
    public static String getDurationString(long seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }else {
            long minutes = seconds / 60;
            long remainingSeconds = seconds %60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}
