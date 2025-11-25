package androidx.browser.browseractions;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import e.a1;
import e.k1;
import e.o0;
import e.q0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import n.a;

@Deprecated
/* compiled from: BrowserActionsIntent */
public class h {

    /* renamed from: b  reason: collision with root package name */
    public static final String f1352b = "androidx.browser.browseractions.APP_ID";

    /* renamed from: c  reason: collision with root package name */
    public static final String f1353c = "androidx.browser.browseractions.browser_action_open";

    /* renamed from: d  reason: collision with root package name */
    public static final String f1354d = "androidx.browser.browseractions.ICON_ID";

    /* renamed from: e  reason: collision with root package name */
    public static final String f1355e = "androidx.browser.browseractions.TITLE";

    /* renamed from: f  reason: collision with root package name */
    public static final String f1356f = "androidx.browser.browseractions.ACTION";

    /* renamed from: g  reason: collision with root package name */
    public static final String f1357g = "androidx.browser.browseractions.extra.TYPE";

    /* renamed from: h  reason: collision with root package name */
    public static final String f1358h = "androidx.browser.browseractions.extra.MENU_ITEMS";

    /* renamed from: i  reason: collision with root package name */
    public static final String f1359i = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: j  reason: collision with root package name */
    public static final int f1360j = 5;

    /* renamed from: k  reason: collision with root package name */
    public static final int f1361k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final int f1362l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f1363m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f1364n = 3;

    /* renamed from: o  reason: collision with root package name */
    public static final int f1365o = 4;

    /* renamed from: p  reason: collision with root package name */
    public static final int f1366p = 5;

    /* renamed from: q  reason: collision with root package name */
    public static final int f1367q = -1;

    /* renamed from: r  reason: collision with root package name */
    public static final int f1368r = 0;

    /* renamed from: s  reason: collision with root package name */
    public static final int f1369s = 1;

    /* renamed from: t  reason: collision with root package name */
    public static final int f1370t = 2;

    /* renamed from: u  reason: collision with root package name */
    public static final int f1371u = 3;

    /* renamed from: v  reason: collision with root package name */
    public static final int f1372v = 4;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final Intent f1373a;

    @k1
    @a1
    /* compiled from: BrowserActionsIntent */
    public interface a {
    }

    @a1
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: BrowserActionsIntent */
    public @interface b {
    }

    @a1
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: BrowserActionsIntent */
    public @interface c {
    }

    /* compiled from: BrowserActionsIntent */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f1374a = new Intent(h.f1353c);

        /* renamed from: b  reason: collision with root package name */
        public final Context f1375b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f1376c;

        /* renamed from: d  reason: collision with root package name */
        public int f1377d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList<Bundle> f1378e = new ArrayList<>();
        @q0

        /* renamed from: f  reason: collision with root package name */
        public PendingIntent f1379f = null;

        /* renamed from: g  reason: collision with root package name */
        public final ArrayList f1380g = new ArrayList();

        public d(@o0 Context context, @o0 Uri uri) {
            this.f1375b = context;
            this.f1376c = uri;
        }

        @o0
        public final h a() {
            Intent intent = this.f1374a;
            intent.setData(this.f1376c);
            intent.putExtra(h.f1357g, this.f1377d);
            intent.putParcelableArrayListExtra(h.f1358h, this.f1378e);
            Intent intent2 = new Intent();
            Context context = this.f1375b;
            intent.putExtra(h.f1352b, PendingIntent.getActivity(context, 0, intent2, 67108864));
            PendingIntent pendingIntent = this.f1379f;
            if (pendingIntent != null) {
                intent.putExtra(h.f1359i, pendingIntent);
            }
            i.e(intent, this.f1380g, context);
            return new h(intent);
        }
    }

    public h(@o0 Intent intent) {
        this.f1373a = intent;
    }

    @o0
    @a1
    public static List<ResolveInfo> a(@o0 Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(f1353c, Uri.parse("https://www.example.com")), 131072);
    }

    @q0
    @Deprecated
    public static String b(@o0 Intent intent) {
        return c(intent);
    }

    @q0
    public static String c(@o0 Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(f1352b);
        if (pendingIntent != null) {
            return pendingIntent.getCreatorPackage();
        }
        return null;
    }

    public static void d(@o0 Context context, @o0 Intent intent) {
        List<a> list;
        List<ResolveInfo> a10 = a(context);
        if (a10 == null || a10.size() == 0) {
            Uri data = intent.getData();
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(f1358h);
            if (parcelableArrayListExtra != null) {
                list = g(parcelableArrayListExtra);
            } else {
                list = null;
            }
            g gVar = new g(context, data, list);
            View inflate = LayoutInflater.from(context).inflate(a.d.f25767a, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(a.c.f25762a);
            textView.setText(data.toString());
            textView.setOnClickListener(new f(textView));
            ListView listView = (ListView) inflate.findViewById(a.c.f25765d);
            listView.setAdapter(new b(context, gVar.Q));
            listView.setOnItemClickListener(gVar);
            c cVar = new c((BrowserActionsFallbackMenuView) inflate.findViewById(a.c.f25766e), context);
            gVar.R = cVar;
            cVar.setContentView(inflate);
            gVar.R.show();
            return;
        }
        int i10 = 0;
        if (a10.size() == 1) {
            intent.setPackage(a10.get(0).activityInfo.packageName);
        } else {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 65536);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                while (true) {
                    if (i10 >= a10.size()) {
                        break;
                    } else if (str.equals(a10.get(i10).activityInfo.packageName)) {
                        intent.setPackage(str);
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        androidx.core.content.d.v(context, intent, (Bundle) null);
    }

    public static void e(@o0 Context context, @o0 Uri uri) {
        d(context, new d(context, uri).a().f1373a);
    }

    public static void f(@o0 Context context, @o0 Uri uri, int i10, @o0 ArrayList<a> arrayList, @o0 PendingIntent pendingIntent) {
        d dVar = new d(context, uri);
        dVar.f1377d = i10;
        if (arrayList.size() <= 5) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (TextUtils.isEmpty(arrayList.get(i11).f1343a) || arrayList.get(i11).a() == null) {
                    throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                }
                ArrayList<Bundle> arrayList2 = dVar.f1378e;
                a aVar = arrayList.get(i11);
                Bundle bundle = new Bundle();
                bundle.putString(f1355e, aVar.f1343a);
                bundle.putParcelable(f1356f, aVar.a());
                int i12 = aVar.f1345c;
                if (i12 != 0) {
                    bundle.putInt(f1354d, i12);
                }
                Uri uri2 = aVar.f1346d;
                if (uri2 != null) {
                    bundle.putParcelable("androidx.browser.browseractions.ICON_URI", uri2);
                }
                arrayList2.add(bundle);
                if (arrayList.get(i11).f1346d != null) {
                    dVar.f1380g.add(arrayList.get(i11).f1346d);
                }
            }
            dVar.f1379f = pendingIntent;
            d(context, dVar.a().f1373a);
            return;
        }
        throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
    }

    @o0
    public static List<a> g(@o0 ArrayList<Bundle> arrayList) {
        a aVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Bundle bundle = arrayList.get(i10);
            String string = bundle.getString(f1355e);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f1356f);
            int i11 = bundle.getInt(f1354d);
            Uri uri = (Uri) bundle.getParcelable("androidx.browser.browseractions.ICON_URI");
            if (TextUtils.isEmpty(string) || pendingIntent == null) {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
            if (i11 != 0) {
                aVar = new a(i11, pendingIntent, string);
            } else {
                aVar = new a(string, pendingIntent, uri);
            }
            arrayList2.add(aVar);
        }
        return arrayList2;
    }
}
