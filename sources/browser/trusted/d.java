package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import e.a1;
import e.q0;
import e.w0;

@a1
/* compiled from: NotificationApiHelperForO */
class d {
    @w0
    @q0
    public static Notification a(p pVar, NotificationManager notificationManager, Notification notification, String str, String str2) {
        notificationManager.createNotificationChannel(new NotificationChannel(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(pVar, notification);
        recoverBuilder.setChannelId(str);
        return recoverBuilder.build();
    }
}
