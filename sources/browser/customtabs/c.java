package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.support.customtabs.b;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.k;
import e.a1;
import e.o0;
import e.q0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CustomTabsClient */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f1401a;

    /* renamed from: b  reason: collision with root package name */
    public final ComponentName f1402b;

    public c(b bVar, ComponentName componentName) {
        this.f1401a = bVar;
        this.f1402b = componentName;
    }

    public static boolean a(@o0 Context context, @q0 String str, @o0 j jVar) {
        jVar.f1443c = context.getApplicationContext();
        Intent intent = new Intent(i.Q);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, jVar, 33);
    }

    public static boolean b(@o0 Context context, @q0 String str, @o0 j jVar) {
        jVar.f1443c = context.getApplicationContext();
        Intent intent = new Intent(i.Q);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, jVar, 1);
    }

    public static boolean c(@o0 Context context, @o0 String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    @q0
    public static String d(@o0 Context context, @q0 List<String> list) {
        return e(context, list, false);
    }

    @q0
    public static String e(@o0 Context context, @q0 List<String> list, boolean z9) {
        ArrayList arrayList;
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z9 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(i.Q);
        for (String next : arrayList) {
            intent2.setPackage(next);
            if (packageManager.resolveService(intent2, 0) != null) {
                return next;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    @o0
    @a1
    public static k.b f(@o0 Context context, @q0 b bVar, int i10) {
        PendingIntent.getActivity(context, i10, new Intent(), 67108864);
        return new k.b();
    }

    @q0
    public final k g() {
        d dVar = new d();
        b bVar = this.f1401a;
        try {
            if (bVar.m3(dVar)) {
                return new k(bVar, dVar, this.f1402b);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* compiled from: CustomTabsClient */
    public class a extends j {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f1403d;

        public a(Context context) {
            this.f1403d = context;
        }

        public final void a(@o0 ComponentName componentName, @o0 c cVar) {
            try {
                cVar.f1401a.q2(0);
            } catch (RemoteException unused) {
            }
            this.f1403d.unbindService(this);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
