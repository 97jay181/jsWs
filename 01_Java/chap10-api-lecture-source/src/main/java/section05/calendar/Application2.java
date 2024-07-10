package section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. java.util.Calendar 클래스 사용법을 이해하고 사용할 수 있다. */

        /* 설명.
         *  API 문서를 살펴보면 Calendar 클래스는 abstract 클래스로 작성되어 있다.
         *  따라서 Calendar 클래스를 이용해서 인스턴스를 생성하는 것이 불가능하다.
         * */

        /* 필기.
         *  Calendar 클래스를 이용한 인스턴스 생성 방법에는 두 가지 방법이 있다.
         *  1. getInstance() static 메소드를 이용해서 인스턴스를 반환받는 방법
         *  2. 후손 클래스인 GregorianCalendar 클래스를 이용해서 인스턴스를 생성하는 방법
         * */

        /* 목차 1. static getInstance() 메소드 사용 */
        Calendar cal = Calendar.getInstance();

        /* 설명. toString()이 오버라이딩 되어있는 것을 확인.
         *  Date 클래스에 비해 매우 많은 필드들이 값을 지니고 있다.
         *  또한 생성된 인스턴스의 타입이 후손 클래스 타입인 GregorianCalendar 타입인 것을 확인할 수 있다.
         *  이 방식으로 인스턴스를 생성하면 운영체제의 날짜/시간 정보를 이용해 인스턴스를 생성하게 된다.  */
        System.out.println("cal = " + cal);
        /* 설명. 특정 날짜/시간 정보를 이용해서 인스턴스를 생성하는 방법을 GregorianCalendar의 생성자로 제공한다. */

        /* 목차 2. GregorianCalendar 이용하는 방법 */
        /* 목차 2-1. 기본생성자 사용 */
        Calendar gregorian = new GregorianCalendar();

        /* 설명. GregorianCalendar에 toString()이 오버라이딩된 것을 확인 */
        System.out.println("gregorian = " + gregorian);
        
        /* 목차 2-2. 년, 월, 일, 시, 분, 초 정보를 이용해서 인스턴스 생성 */
        /* 설명. 2024년 06월 17일 09:30:00 */
        int year = 2024;
        int month = 5;      // GregorianCalendar는 0 ~ 11로 월을 나타낸다. (6월 -> 5)
        int dayOfMonth = 17;
        int hour = 9;
        int min = 30;
        int second = 0;
        
        Calendar startDate = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);

        System.out.println("startDate = " + startDate);
        System.out.println("================================================================================");
        /* 설명. 상황에 따라서 특정일자를 기준으로 한 Date 타입의 인스턴스가 필요할 수도 있다.
         *  먼저, GregorianCalendar를 이용해서 특정 날짜와 시간정보로 인스턴스를 생성한다.
         *  그리고 1970/01/01 00:00:00을 기준으로 한 millisecond를 계산해 long 타입으로 반환하는
         *  Calendar.getTimeInMillis() 메소드를 사용해 Date 타입으로 인스턴스를 새로 생성하면 된다.
         * */
        System.out.println("startDate.getTimeInMillis() = " + startDate.getTimeInMillis());
        System.out.println("================================================================================");

        Date date = new Date(startDate.getTimeInMillis());
        System.out.println("date = " + date);
        System.out.println("================================================================================");

        /* 설명. 실제 실무에서 사용 시 아래 형태를 가장 많이 사용한다. */
        Date date2 = new Date(new GregorianCalendar(year, month, dayOfMonth, hour, min, second).getTimeInMillis());
        System.out.println("date2 = " + date2);
        System.out.println("================================================================================");

        /* 설명. get() : Calendar 클래스의 필드 정보를 반환 */
        int startYear = startDate.get(1);
        int startMonth = startDate.get(2);
        int startDayOfMonth = startDate.get(5);

        System.out.println("startYear = " + startYear);                 // 2024
        System.out.println("startMonth = " + startMonth);               // 5
        System.out.println("startDayOfMonth = " + startDayOfMonth);     // 17
        System.out.println("================================================================================");

        /* 설명. 인자로 전달되는 정수에 따라서 필드값을 반환받을 수 있다.
         *  하지만 이렇게 사용하게 되면 각 필드에 매칭되는 정소를 다 외워야 사용 가능할 것이다.
         *  따라서 아래와 같은 정수들을 상수 필드 형태로 제공하고 있다.
         * */
        System.out.println("Calendar.YEAR = " + Calendar.YEAR);
        System.out.println("Calendar.MONTH = " + Calendar.MONTH);
        System.out.println("Calendar = " + Calendar.DATE);
        System.out.println("================================================================================");

        System.out.println("startDate.get(Calendar.YEAR) = " + startDate.get(Calendar.YEAR));
        System.out.println("startDate.get(Calendar.YEAR) = " + startDate.get(Calendar.MONTH));
        System.out.println("startDate.get(Calendar.YEAR) = " + startDate.get(Calendar.DATE));
        System.out.println("startDate.get(Calendar.YEAR) = " + startDate.get(Calendar.DATE));
        System.out.println("================================================================================");

        /* 설명. 요일(DAY_OF_WEEK) -> 일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7) */
        System.out.println("startDate.get(Calendar.DAY_OF_WEEK) = " + startDate.get(Calendar.DAY_OF_WEEK));
        System.out.println("================================================================================");

        String day = "";

        switch (startDate.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY: day = "일"; break;
            case Calendar.MONDAY:  day = "월"; break;
            case Calendar.TUESDAY:  day = "화"; break;
            case Calendar.WEDNESDAY:  day = "수"; break;
            case Calendar.THURSDAY:  day = "목"; break;
            case Calendar.FRIDAY:  day = "금"; break;
            case Calendar.SATURDAY:  day = "토"; break;
        }
        System.out.println("요일 = " + day);
        System.out.println("================================================================================");

        /* 설명. Calendar.AM_PM : 오전=0, 오후=1 */
        System.out.println("startDate.get(Calendar.AM_PM) = " + startDate.get(Calendar.AM_PM));

        System.out.println(startDate.get(Calendar.AM_PM) == Calendar.AM ? "오전" : "오후");

        System.out.println("startDate.get(Calendar.HOUR_OF_DAY) = " + startDate.get(Calendar.HOUR_OF_DAY));
        System.out.println("================================================================================");

        System.out.println("startDate.get(Calendar.MINUTE) = " + startDate.get(Calendar.MINUTE));
        System.out.println("startDate.get(Calendar.MINUTE) = " + startDate.get(Calendar.SECOND));

        /* 설명.
         *  왜 1970년 1월 1일 0시 0분 0초 인가요?
         *
         * 설명.
         *  수직으로 태양이 떠오르는 시간을 정오(12시)로 계산하는 방법을 태양시라고 부른다.
         *  그리치니 천문대의 천문학적 업적을 기리고자 그리치치 천문대를 기준으로 태양이 수직으로 떠오르는 시점을
         *  12시로 측정한 시간대가 GMT 시간대이다.
         *  하지만 태양시는 오차가 발생할 수 있다. 태양빛이 지구까지 오는 데 걸리는 시간은 8분 12초 ~ 8분 28초 이기 때문에
         *  태양시는 실제 태양 위치와 육안으로 측정한 시간의 오차가 발생할 수 밖에 없었다.
         *  또한 지구가 23.5도 기울어져 있고 공전이 타원 궤도로 돌기 때문에 계절에 따라 조금씩 다를 수 밖에 없다.
         *
         * 설명.
         *  이러한 시간을 측정하는 방식보다 조금 더 정밀한 측정 방법도 존재하는데
         *  매우 작은 원자가 바닥과 들뜸 상태를 주기적으로 반복하는 것을 이용하여 시간을 측정하는 방법이 있다.
         *  특히 세슘 원자의 경우 1초동안 진동하는 횟수가 실제 1초와 유사하여 30만년에 1초의 오차를 보이는 정확성을 보인다.
         *  따라서 세계적으로 동일한 시간대를 사용하기 위해 협정한 시간을 협정 세계시 UTC 라고 한다.
         *
         * 설명.
         *  하지만 물리적으로 너무 정확하다보니 실제 존재하는 지구와 태양간의 공전/자전에 따른 오차를 반영해야 한다.
         *  그래서 윤초를 두고 세슘 원자 시계와 태양시의 오차를 보정하는데 사용한다.
         *  이것이 정해진 날짜는 1972년 1월 1일이며, 세계 표준시를 기준으로 1972년으로 계산하기에는 뭔가 딱 맞아 떨어지지 않아
         *  1970년 1월 1일 0시 0분 0초를 기준으로 컴퓨터에서는 시간대를 계산하기로 한 것이다.
         * */




        
        

    }
}
