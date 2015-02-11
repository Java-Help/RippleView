package ru.javahelp.rippleview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.indris.material.RippleView;


public class MainActivity extends Activity {

	RippleView mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple_view);
        mButton = (RippleView) findViewById(R.id.btn);
        mButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Клик", Toast.LENGTH_LONG).show();
			}
		});
    }

}
