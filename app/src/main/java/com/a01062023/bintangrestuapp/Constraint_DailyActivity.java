package com.a01062023.bintangrestuapp;
import java.util.ArrayList;

public class Constraint_DailyActivity {
    public static ArrayList<DailyActivityList> getDailyActivityListData() {
        ArrayList<DailyActivityList> dailyActivityList
                = new ArrayList<DailyActivityList>();
        DailyActivityList emp1 = new DailyActivityList(R.drawable.img_schedule,
                "1 Juni 2023, hari merah dalam memperingati Hari Lahir Pancasila.");
        dailyActivityList.add(emp1);
        DailyActivityList emp2
                = new DailyActivityList(R.drawable.img_schedule, "2 Juni 2023, Saya memulai aktivitas berkuliah lagi seperti biasa.");
        dailyActivityList.add(emp2);
        DailyActivityList emp3 = new DailyActivityList(R.drawable.img_schedule,
                "6 Juni 2023, Saya sedang melaksanakan UAS (Ujian Akhir Semester) dari pagi sampai sore.");
        dailyActivityList.add(emp3);
        return dailyActivityList;
    }

}
