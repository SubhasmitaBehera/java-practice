package enum_;


interface A{
    void show();
}

enum Day implements A
{
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY,SUNDAY;
    //    Day(){}
    public void show() {
        System.out.println("Show Implements from class A to \"enum\"");
    }

}

public class Enum1
{
    Day day;
    public Enum1(Day day)
    {
        this.day = day;
    }

    public void dayIsLike()
    {
        switch (day)
        {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    public static void main(String[] args)
    {
        Day arr[] = Day.values();

        for (int i = 0;i < arr.length;i++){
            System.out.println("Values are : "+ arr[i] + " at index no "+arr[i].ordinal()); // ordinal prints the
            // index number
        }
        System.out.println(Day.TUESDAY.ordinal()); // By using ordinal() method,
        // each enum constant index can be found, just like array index.
//        for (Day days : arr){  // Modern for loop
//            System.out.println(days);
//        }
        String str = "MONDAY";
        Enum1 t1 = new Enum1(Day.valueOf(str));
        t1.dayIsLike();
        Day obj = Day.MONDAY;
        obj.show();
        System.out.println(obj.toString());
//        System.out.println(Day.FRIDAY.toString());
        System.out.println(Day.valueOf("MONDAY")); // valueOf() method returns the enum constant of
        // the specified string value, if exists
//        System.out.println(Day.values());
    }
}
