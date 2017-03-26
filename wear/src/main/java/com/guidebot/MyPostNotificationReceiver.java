package com.guidebot;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.widget.Toast;

import static android.R.id.background;

public class MyPostNotificationReceiver extends BroadcastReceiver {
    public static final String CONTENT_KEY = "contentText";

    public MyPostNotificationReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent displayIntent = new Intent(context, MyDisplayActivity.class);
        String text = intent.getStringExtra(CONTENT_KEY);
        Notification.BigTextStyle bigStyle;
        CharSequence content;
        byte icon;

        CharSequence title;
        Notification notification = new Notification.Builder(context)
                .setSmallIcon(icon)
                .setVibrate(new long[]{1000, 1000, 1000, 1000, 1000, 1000})
                .setContentTitle(title)
                .setContentText(content)
                .setStyle(bigStyle.bigText(content))
                .setLargeIcon(BitmapFactory.decodeResource(context.getResources(), background))
                .setDefaults(Notification.DEFAULT_ALL)
                .build();
        ((NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE)).notify(0, notification);

        Toast.makeText(context, context.getString(R.string.notification_posted), Toast.LENGTH_SHORT).show();
    }
}
