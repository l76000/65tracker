package androidx.browser.trusted;

import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.browser.trusted.e;
import e.o0;
import e.q0;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: Token */
public final class g {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final i f1463a;

    public g(@o0 i iVar) {
        this.f1463a = iVar;
    }

    @q0
    public static g a(@o0 String str, @o0 PackageManager packageManager) {
        ArrayList arrayList;
        e.c cVar;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                cVar = new e.a();
            } else {
                cVar = new e.b();
            }
            arrayList = cVar.a(packageManager, str);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("PackageIdentity", "Could not get fingerprint for package.", e10);
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        try {
            return new g(i.a(str, arrayList));
        } catch (IOException e11) {
            Log.e("Token", "Exception when creating token.", e11);
            return null;
        }
    }

    @o0
    public static g b(@o0 byte[] bArr) {
        return new g(new i(bArr));
    }
}
