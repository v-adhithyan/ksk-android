package ceg.avtechlabs.kandhasastikavasam.services;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by adhithyan-3592 on 06/12/16.
 */

public class FCMInstanceIdService extends FirebaseInstanceIdService{
  static final String TAG = "sbm-log";

  @Override
  public void onTokenRefresh() {
    String token = FirebaseInstanceId.getInstance().getToken();
    Log.d(TAG, "TOKEN:" + token);
  }
}
