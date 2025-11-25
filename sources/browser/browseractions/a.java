package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.net.Uri;
import e.a1;
import e.o0;
import e.q0;
import e.v;

@Deprecated
/* compiled from: BrowserActionItem */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f1343a;
    @q0

    /* renamed from: b  reason: collision with root package name */
    public final PendingIntent f1344b;
    @v

    /* renamed from: c  reason: collision with root package name */
    public final int f1345c;
    @q0

    /* renamed from: d  reason: collision with root package name */
    public final Uri f1346d;
    @q0

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f1347e;

    public a() {
        throw null;
    }

    public a(@v int i10, @o0 PendingIntent pendingIntent, @o0 String str) {
        this.f1343a = str;
        this.f1344b = pendingIntent;
        this.f1345c = i10;
    }

    @o0
    public final PendingIntent a() {
        PendingIntent pendingIntent = this.f1344b;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    @a1
    public a(@o0 String str, @o0 PendingIntent pendingIntent, @o0 Uri uri) {
        this.f1343a = str;
        this.f1344b = pendingIntent;
        this.f1346d = uri;
    }

    public a(@o0 Runnable runnable, @o0 String str) {
        this.f1343a = str;
        this.f1344b = null;
        this.f1347e = runnable;
    }
}
