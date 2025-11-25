package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.core.app.o;
import androidx.core.content.FileProvider;
import androidx.core.content.d;
import e.a1;
import e.l1;
import e.o0;
import java.io.File;

/* compiled from: TrustedWebUtils */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1452a = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";
    @a1

    /* renamed from: b  reason: collision with root package name */
    public static final String f1453b = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";

    public static boolean a(@o0 Context context, @o0 String str, @o0 String str2) {
        IntentFilter intentFilter;
        ResolveInfo resolveService = context.getPackageManager().resolveService(new Intent().setAction(i.Q).setPackage(str), 64);
        if (resolveService == null || (intentFilter = resolveService.filter) == null) {
            return false;
        }
        return intentFilter.hasCategory(str2);
    }

    @Deprecated
    public static void b(@o0 Context context, @o0 g gVar, @o0 Uri uri) {
        if (o.a(gVar.f1430a.getExtras(), g.f1406c) != null) {
            Intent intent = gVar.f1430a;
            intent.putExtra(f1452a, true);
            intent.setData(uri);
            d.v(context, intent, gVar.f1431b);
            return;
        }
        throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
    }

    @a1
    public static void c(@o0 Context context, @o0 k kVar, @o0 Uri uri) {
        Intent intent = new Intent(f1453b);
        intent.setPackage(kVar.f1446c.getPackageName());
        intent.setData(uri);
        Bundle bundle = new Bundle();
        o.b(bundle, g.f1406c, kVar.f1445b.asBinder());
        intent.putExtras(bundle);
        PendingIntent pendingIntent = kVar.f1447d;
        if (pendingIntent != null) {
            intent.putExtra(g.f1407d, pendingIntent);
        }
        context.startActivity(intent);
    }

    @l1
    public static boolean d(@o0 Context context, @o0 File file, @o0 String str, @o0 String str2, @o0 k kVar) {
        Uri b10 = FileProvider.b(context, str, file);
        context.grantUriPermission(str2, b10, 1);
        kVar.getClass();
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = kVar.f1447d;
        if (pendingIntent != null) {
            bundle.putParcelable(g.f1407d, pendingIntent);
        }
        try {
            return kVar.f1444a.m2(1, b10, bundle, kVar.f1445b);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
