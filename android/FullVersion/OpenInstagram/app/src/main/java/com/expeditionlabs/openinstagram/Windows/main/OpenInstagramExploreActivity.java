package com.expeditionlabs.openinstagram.Windows.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TableRow;

import com.expeditionlabs.openinstagram.R;

/**
 * Created by kweaver on 27/07/15.
 */
public class OpenInstagramExploreActivity extends Activity {
    public static String TAG = "OI_";
    //protected Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_oi_explore);
        //this = mContext.getApplicationContext();




        /*
        -------- Bottom Menu ------
         */
        TableRow homeBtn = (TableRow) findViewById(R.id.homeBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openHomeWindow = new Intent(v.getContext(),
                                        OpenInstagramHomeActivity.class);
                startActivity(openHomeWindow);
            }
        });
    }
    protected void onPause(){
        super.onPause();
    }
    protected void onResume(){
        super.onResume();
    }
    protected void onDestroy(){
        super.onDestroy();
    }
    
}
