public class BonusChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationsString(3465));
        System.out.println(getDurationsString(23, 3465));
    }

    public static String getDurationsString(int seconds) {
        if (seconds < 0) {
            return "You should enter a positive number";
        }
            int minutes = seconds / 60;
            return getDurationsString(minutes, seconds);

    }

    public static String getDurationsString(int minutes, int seconds) {
        if (minutes < 0) {
            return "You should enter a positive number";
        }

        if (seconds < 0 || seconds > 59) {
            return "You should enter a positive number";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + ":" + remainingMinutes + ":" + remainingSeconds;

    }
}
