public class TimeOfDay {

    public int timeOfTheDay(int time) {
        if (time > 5 && time < 12) {
           System.out.println("morning");
        }
        if (time > 12 && time < 16) {
            System.out.println("afternoon");
        }
        if (time > 16 && time < 22) {
            System.out.println("evening");
        }
        if (time > 22 && time < 5) {
            System.out.println("night");
        }
        return time;
    }
}
