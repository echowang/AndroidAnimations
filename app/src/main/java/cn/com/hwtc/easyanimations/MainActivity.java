package cn.com.hwtc.easyanimations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import cn.com.hwtc.easyanimations.easing.EasyingActivity;

/**
 * Created by tingw on 2017/12/14.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void openEasingAnimation(View view){
        Intent intent = new Intent(this, EasyingActivity.class);
        startActivity(intent);
    }

    public void openAnimation(View view){

    }
}
