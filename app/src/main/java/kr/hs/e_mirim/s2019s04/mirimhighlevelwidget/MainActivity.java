package kr.hs.e_mirim.s2019s04.mirimhighlevelwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.RadioButton;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    RadioButton radioDate, radioTime;
    CalendarView calender1;
    TimePicker timePick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        radioDate = findViewById(R.id.radio_date);
        radioDate = findViewById(R.id.radio_time);

        radioDate.setOnClickListener(radioListener);
        radioTime.setOnClickListener(radioListener);

        calender1 = findViewById(R.id.calendar1);
        timePick = findViewById(R.id.time_pick);
    }

    View.OnClickListener radioListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.radio_date:
                    calender1.setVisibility(View.VISIBLE);
                    timePick.setVisibility(View.INVISIBLE);
                    break;

                case R.id.radio_time:
                    timePick.setVisibility(View.VISIBLE);
                    calender1.setVisibility(View.INVISIBLE);
                    break;
            }
        }
    };
}