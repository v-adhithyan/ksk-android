package ceg.avtechlabs.kandhasastikavasam.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import ceg.avtechlabs.kandhasastikavasam.R;

public class SplashScreenActivity extends AppCompatActivity {

  final int SPLASH_TIME_OUT = 2000;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams
        .FLAG_FULLSCREEN);

    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_splash_screen);

    new Handler().postDelayed(new Runnable() {
      @Override
      public void run() {
        Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
        startActivity(intent);
      }
    }, SPLASH_TIME_OUT);

  }

}
