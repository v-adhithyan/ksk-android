package ceg.avtechlabs.kandhasastikavasam.util;

/**
 * Created by adhithyan-3592 on 07/12/16.
 */

public class CommonUtil {

  private static boolean seekBarChanged = false;
  private static int currentProgess = 0;

  public static void setSeekBarChanged(){
    seekBarChanged = true;
  }

  public static void unsetSeekbarChange(){
    seekBarChanged = false;
  }

  public static boolean isSeekBarChanged(){
    return seekBarChanged;
  }

  public static void setCurrentProgess(int progess){
    currentProgess = progess;
  }

  public static int getCurrentProgess(){
    return currentProgess;
  }

}
