package ceg.avtechlabs.kandhasastikavasam.activities;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;

import java.io.InputStream;

import ceg.avtechlabs.kandhasastikavasam.R;
import ceg.avtechlabs.kandhasastikavasam.util.DisplayUtil;

public class ViewLyricsActivity extends AppCompatActivity {
  TextView tv;
  InputStream inputStream;
  String entireLyrics = "";
  AssetManager assetManager;

  private boolean useSameEaseTypeBack = true;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_lyrics);
    Intent intent =  getIntent();
    String fname = intent.getStringExtra(LyricsActivity.FILE_NAME);
    tv = (TextView)findViewById(R.id.textViewLyrics);

    assetManager = getAssets();
    if(fname.equals("english.txt")) {
      setTitle(getString(R.string.vl_english_title));
    } else if(fname.equals("tamil.txt")) {
      setTitle(getString(R.string.vl_tamil_title));
    } else if(fname.equals("kannada.txt")) {
      setTitle(getString(R.string.vl_kannada_title));
    } else if(fname.equals("telugu.txt")) {
      setTitle(getString(R.string.vl_telugu_title));
    } else {

    }

    try {
      inputStream = assetManager.open(fname);
      byte[] buffer = new byte[inputStream.available()];
      inputStream.read(buffer);
      inputStream.close();
      entireLyrics = new String(buffer);
    } catch(Exception ex) {
      ex.printStackTrace();
    }

    //Toast.makeText(this, entireLyrics, Toast.LENGTH_LONG).show();

    tv.setText(entireLyrics);

    if(Build.VERSION.SDK_INT >= 13){
      int screenHeight = DisplayUtil.getScreenHeight(this);
      int screenWidth = DisplayUtil.getScreenWidth(this);

      tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, (float) screenWidth / 25);
    }

  }

}

