package a8;

import b8.j;
import io.reactivex.f;
import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.v;
import x7.g;

/* compiled from: EmptyDisposable */
public enum e implements j<Object> {
    INSTANCE,
    NEVER;

    public static void d(f fVar) {
        fVar.i(INSTANCE);
        fVar.g();
    }

    public static void g(v<?> vVar) {
        vVar.i(INSTANCE);
        vVar.g();
    }

    public static void i(i0<?> i0Var) {
        i0Var.i(INSTANCE);
        i0Var.g();
    }

    public static void j(Throwable th, f fVar) {
        fVar.i(INSTANCE);
        fVar.onError(th);
    }

    public static void l(Throwable th, v<?> vVar) {
        vVar.i(INSTANCE);
        vVar.onError(th);
    }

    public static void n(Throwable th, i0<?> i0Var) {
        i0Var.i(INSTANCE);
        i0Var.onError(th);
    }

    public static void q(Throwable th, n0<?> n0Var) {
        n0Var.i(INSTANCE);
        n0Var.onError(th);
    }

    public final boolean isEmpty() {
        return true;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @g
    public final Object poll() {
        return null;
    }

    public final boolean t() {
        if (this == INSTANCE) {
            return true;
        }
        return false;
    }

    public final int y(int i10) {
        return i10 & 2;
    }

    public final void clear() {
    }

    public final void p() {
    }
}
