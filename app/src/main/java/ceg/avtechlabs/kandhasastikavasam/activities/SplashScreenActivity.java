package ceg.avtechlabs.kandhasastikavasam.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import ceg.avtechlabs.kandhasastikavasam.R;

public class SplashScreenActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams
        .FLAG_FULLSCREEN);

    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_splash_screen);
  }
}