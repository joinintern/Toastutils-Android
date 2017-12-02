package com.toastlibrary;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Server on 12/2/2017.
 */

public class ToastFile {
    public static void toast(final String message, final AppCompatActivity activity) {
        try {
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (message != null && !message.isEmpty())
                        Toast.makeText(activity, message,
                                Toast.LENGTH_SHORT).show();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
