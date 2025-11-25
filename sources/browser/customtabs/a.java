package androidx.browser.customtabs;

import android.os.Bundle;
import e.l;
import e.o0;
import e.q0;

/* compiled from: CustomTabColorSchemeParams */
public final class a {
    @l
    @q0

    /* renamed from: a  reason: collision with root package name */
    public final Integer f1390a;
    @l
    @q0

    /* renamed from: b  reason: collision with root package name */
    public final Integer f1391b;
    @l
    @q0

    /* renamed from: c  reason: collision with root package name */
    public final Integer f1392c;
    @l
    @q0

    /* renamed from: d  reason: collision with root package name */
    public final Integer f1393d;

    /* renamed from: androidx.browser.customtabs.a$a  reason: collision with other inner class name */
    /* compiled from: CustomTabColorSchemeParams */
    public static final class C0039a {
    }

    public a(@l @q0 Integer num, @l @q0 Integer num2, @l @q0 Integer num3, @l @q0 Integer num4) {
        this.f1390a = num;
        this.f1391b = num2;
        this.f1392c = num3;
        this.f1393d = num4;
    }

    @o0
    public static a a(@q0 Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new a((Integer) bundle.get(g.f1412i), (Integer) bundle.get(g.f1420q), (Integer) bundle.get(g.J), (Integer) bundle.get(g.K));
    }
}
