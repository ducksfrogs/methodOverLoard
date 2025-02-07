public class secondMinuts {
    public static void main(String[] args) {

        System.out.println(getDurationsString(3945));
        System.out.println(getDurationsString( 0,3945));
    }

    public static  String getDurationsString(int seconds) {

        int minutes = seconds / 60;
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + ":" + remainingMinutes + ":" + remainingSeconds;
    }

    public static  String getDurationsString(int minutes, int seconds ) {

        int minute2 = seconds / 60;
        int tmpM = minutes + minute2;
        int hours = tmpM / 60;

        int remainingMinutes = tmpM % 60;
        int remainingSeconds = seconds % 60;


        return hours + ":" + remainingMinutes + ":" + remainingSeconds;

    }

}
