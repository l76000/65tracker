package androidx.browser.trusted;

import android.os.Bundle;
import e.o0;

/* compiled from: TrustedWebActivityDisplayMode */
public interface m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1467a = "androidx.browser.trusted.displaymode.KEY_ID";

    /* compiled from: TrustedWebActivityDisplayMode */
    public static class a implements m {
    }

    /* compiled from: TrustedWebActivityDisplayMode */
    public static class b implements m {

        /* renamed from: b  reason: collision with root package name */
        public static final String f1468b = "androidx.browser.trusted.displaymode.KEY_STICKY";

        /* renamed from: c  reason: collision with root package name */
        public static final String f1469c = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";

        @o0
        public static b b(@o0 Bundle bundle) {
            bundle.getBoolean(f1468b);
            bundle.getInt(f1469c);
            return new b();
        }
    }

    @o0
    static m a(@o0 Bundle bundle) {
        if (bundle.getInt(f1467a) != 1) {
            return new a();
        }
        return b.b(bundle);
    }
}
