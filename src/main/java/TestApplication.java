import java.util.EnumMap;
import java.util.EnumSet;

public class TestApplication {
    public void testTravelWeekDays(){
        WeekDay[] weekDays = WeekDay.values();
        for(WeekDay weekDay : weekDays){
            System.out.println("weekDay实例所传参数："+weekDay.getDay());
            weekDay.printDay(weekDay.ordinal());
        }
    }
    public void testEnumMap(){
        EnumMap<WeekDay, String> enumMap = new EnumMap<WeekDay, String>(WeekDay.class);
        enumMap.put(WeekDay.Mon, "星期一");
        enumMap.put(WeekDay.Thu, "星期二");
        for(WeekDay weekDay : WeekDay.values()){
            if(enumMap.get(weekDay)==null){
                break;
            }
            System.out.println(weekDay.name()+" "+enumMap.get(weekDay));
        }
    }
    public void testEnumSet(){
        EnumSet<WeekDay> enumSet = EnumSet.allOf(WeekDay.class);
        for(WeekDay weekDay : enumSet){
            System.out.println(weekDay);
        }
    }

    public static void main(String[] args){
        TestApplication test = new TestApplication();
        test.testTravelWeekDays();
        test.testEnumMap();
        test.testEnumSet();
    }
}
