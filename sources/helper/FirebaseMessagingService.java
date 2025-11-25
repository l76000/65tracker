package buslogic.app.helper;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.z;
import buslogic.app.ui.MainActivity;
import buslogic.beogradplus.R;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.e;
import java.util.Objects;

public class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    public final void d(c0 c0Var) {
        Intent intent;
        StringBuilder sb = new StringBuilder("From: ");
        Bundle bundle = c0Var.O;
        sb.append(bundle.getString("from"));
        Log.d("ASD", sb.toString());
        if (c0Var.v1() != null) {
            Log.d("ASD", "Message Notification Body: " + c0Var.v1().f33882b);
            String str = c0Var.v1().f33881a;
            String str2 = c0Var.v1().f33882b;
            Intent intent2 = new Intent(this, MainActivity.class);
            intent2.addFlags(67108864);
            PendingIntent activity = PendingIntent.getActivity(this, 0, intent2, 67108864);
            Uri defaultUri = RingtoneManager.getDefaultUri(2);
            z.g gVar = new z.g(this, "My channel ID");
            gVar.f4173s.icon = R.drawable.nsmart_icon;
            gVar.f4159e = z.g.b(str);
            gVar.f4160f = z.g.b(str2);
            gVar.c(true);
            gVar.e(defaultUri);
            gVar.f4161g = activity;
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel("My channel ID", "Channel human readable title", 3));
            }
            notificationManager.notify(0, gVar.a());
            if (c0Var.P == null) {
                c0Var.P = e.d.a(bundle);
            }
            if (c0Var.P.size() > 0) {
                StringBuilder sb2 = new StringBuilder("Message data payload: ");
                if (c0Var.P == null) {
                    c0Var.P = e.d.a(bundle);
                }
                sb2.append((String) c0Var.P.get("id"));
                Log.d("ASDF", sb2.toString());
                if (c0Var.P == null) {
                    c0Var.P = e.d.a(bundle);
                }
                if (Objects.equals(c0Var.P.get("id"), "update")) {
                    String str3 = c0Var.v1().f33881a;
                    String str4 = c0Var.v1().f33882b;
                    try {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=beogradplus"));
                    } catch (ActivityNotFoundException unused) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=beogradplus"));
                    }
                    intent.addFlags(67108864);
                    PendingIntent activity2 = PendingIntent.getActivity(this, 0, intent, 67108864);
                    Uri defaultUri2 = RingtoneManager.getDefaultUri(2);
                    z.g gVar2 = new z.g(this, "My channel ID");
                    gVar2.f4173s.icon = R.drawable.nsmart_icon;
                    gVar2.f4159e = z.g.b(getString(R.string.update_notification_title));
                    gVar2.f4160f = z.g.b(getString(R.string.update_notification_text));
                    gVar2.c(true);
                    gVar2.e(defaultUri2);
                    gVar2.f4161g = activity2;
                    NotificationManager notificationManager2 = (NotificationManager) getSystemService("notification");
                    if (Build.VERSION.SDK_INT >= 26) {
                        notificationManager2.createNotificationChannel(new NotificationChannel("My channel ID", "Channel human readable title", 3));
                    }
                    notificationManager2.notify(0, gVar2.a());
                }
            }
        }
    }
}
