package ceg.avtechlabs.kandhasastikavasam.services;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by adhithyan-3592 on 06/12/16.
 */

public class FCMMessagingService extends FirebaseMessagingService {
  static final String TAG = "sbm-log";

  @Override
  public void onMessageReceived(RemoteMessage remoteMessage) {
    Log.d(TAG, "from:" + remoteMessage.getFrom());
    Log.d(TAG, "body:" + remoteMessage.getNotification().getBody());
  }
}
