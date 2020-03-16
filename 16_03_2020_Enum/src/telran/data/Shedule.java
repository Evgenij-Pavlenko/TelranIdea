package telran.data;

public class Shedule {
   private DayOfWeek dayOfWeek;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    public void wakeUp(){
        if (this.getDayOfWeek().ordinal() >= 5){
            System.out.println("Tou can sleep longer");
        } else {
            System.out.println("Wake up!");
        }
    }
    public void getMenu(DayOfWeek dayOfWeek){
        switch (dayOfWeek){
            case MONDAY:
                System.out.println("Gulyash");
                break;
            case THUSDAY:
                System.out.println("Spagetti");
                break;
            case WEDNESDAY:
                System.out.println("Chickenneggets");
                break;
            case TUESDAY:
                System.out.println("Fish");
                break;
            case FRIDAY:
                System.out.println("Pizza");
                break;
            default:
                System.out.println("Nothing");
        }
    }
}
