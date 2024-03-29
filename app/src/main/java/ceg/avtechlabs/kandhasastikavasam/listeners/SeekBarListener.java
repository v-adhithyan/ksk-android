package ceg.avtechlabs.kandhasastikavasam.listeners;

import com.triggertrap.seekarc.SeekArc;

import ceg.avtechlabs.kandhasastikavasam.util.CommonUtil;

/**
 * Created by adhithyan-3592 on 06/12/16.
 */

public class SeekbarListener {

  SeekArc seekBar;

  public SeekbarListener(SeekArc seekBar){
    this.seekBar = seekBar;

    this.seekBar.setOnSeekArcChangeListener(new SeekArc.OnSeekArcChangeListener() {
      @Override
      public void onProgressChanged(SeekArc seekArc, int i, boolean b) {

        if(CommonUtil.isSeekBarChanged()) {
          CommonUtil.setCurrentProgess(i);
        }
      }

      @Override
      public void onStartTrackingTouch(SeekArc seekArc) {
        CommonUtil.setSeekBarChanged();
      }

      @Override
      public void onStopTrackingTouch(SeekArc seekArc) {

      }
    });

  }

}
