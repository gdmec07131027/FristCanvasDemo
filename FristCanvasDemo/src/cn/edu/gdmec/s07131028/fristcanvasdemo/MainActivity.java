package cn.edu.gdmec.s07131028.fristcanvasdemo;



import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;


public class MainActivity extends Activity {
	private AnimationDrawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));   
    }
    
}

