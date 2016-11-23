package com.example.administrator.practicaltraining;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by Administrator on 2016/11/22.
 */
public class ActivityApply  extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);
        RelativeLayout rl = (RelativeLayout)findViewById(R.id.id_apply);
        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(ActivityApply.this,Zhuce.class);
                startActivity(i);
            }
        });
    }
}
