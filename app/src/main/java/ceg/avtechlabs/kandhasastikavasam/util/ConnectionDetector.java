package ceg.avtechlabs.kandhasastikavasam.util;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by adhithyan-3592 on 29/01/16.
 */

public class ConnectionDetector {

    public static boolean isConnectedToInternet(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if(connectivity != null){
            NetworkInfo[] info = connectivity.getAllNetworkInfo();

            if(info != null){
                for(int i=0; i< info.length; i++){
                    if(info[i].getState() == NetworkInfo.State.CONNECTED){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
