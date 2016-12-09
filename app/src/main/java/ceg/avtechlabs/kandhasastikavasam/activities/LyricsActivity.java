package ceg.avtechlabs.kandhasastikavasam.activities;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import ceg.avtechlabs.kandhasastikavasam.R;

public class LyricsActivity extends AppCompatActivity {

  public final static String FILE_NAME="file";
  //MixPanelUtil //mixPanelUtil;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_lyrics_options);
    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.actionBarColor)));
    setTitle("Choose Language");

    //mixPanelUtil = MixPanelUtil.getInstance(this);
    ////mixPanelUtil.trackEvent("Lyrics");
  }

  public void showTamilLyrics(View v) {
    //mixPanelUtil.trackEvent("Tamil Lyrics");
    Intent intent = new Intent(this,ViewLyricsActivity.class);
    intent.putExtra(FILE_NAME,"tamil.txt");
    startActivity(intent);
  }

  public void showEnglishLyrics(View v) {
    //mixPanelUtil.trackEvent("English Lyrics");
    Intent intent = new Intent(this,ViewLyricsActivity.class);
    intent.putExtra(FILE_NAME,"english.txt");
    startActivity(intent);
  }

  public void showTeluguLyrics(View v) {
    //mixPanelUtil.trackEvent("Telugu Lyrics");
    Intent intent = new Intent(this,ViewLyricsActivity.class);
    intent.putExtra(FILE_NAME,"telugu.txt");
    startActivity(intent);
  }

  public void showKannadaLyrics(View v) {
    //mixPanelUtil.trackEvent("Kannada Lyrics");
    Intent intent = new Intent(this,ViewLyricsActivity.class);
    intent.putExtra(FILE_NAME,"kannada.txt");
    startActivity(intent);
  }

  public void showLyrics(String language){
    //generic function to load lyrics
  }

}

