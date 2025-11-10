public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int hours = Integer.parseInt(time.substring(0,2));
        int minutes = Integer.parseInt(time.substring(3,5));
        int minutesToTime = Integer.parseInt(args[1]);
        minutes += minutesToTime % 60;
        if(minutes >= 60){
            int minutesMoreThan60 = minutes / 60;
            hours += minutesMoreThan60;
            minutes = minutes % 60;
        }
        hours += minutesToTime / 60;
        String finalMinutes = "";
        String finalhours = "";
        if(minutes < 10){
            finalMinutes += "0" +minutes;
        } else{
            finalMinutes += minutes;
        }
        hours = hours % 24;
        if(hours<10){
            finalhours += "0" +hours;
        } else{
            finalhours += hours;
        }
        System.out.println( finalhours +":" +finalMinutes );
    }
}
