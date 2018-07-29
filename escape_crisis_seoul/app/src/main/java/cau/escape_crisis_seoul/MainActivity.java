package cau.escape_crisis_seoul;

import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ML = (LinearLayout)findViewById(R.id.mainlinearlayout);
        ML.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent start = new Intent(MainActivity.this,
                        StartActivity.class);
                startActivity(start);
            }
        });

    }


}