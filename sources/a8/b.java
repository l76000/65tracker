package a8;

import io.reactivex.disposables.c;
import io.reactivex.exceptions.a;
import java.util.concurrent.atomic.AtomicReference;
import z7.f;

/* compiled from: CancellableDisposable */
public final class b extends AtomicReference<f> implements c {
    public final void p() {
        f fVar;
        if (get() != null && (fVar = (f) getAndSet((Object) null)) != null) {
            try {
                fVar.cancel();
            } catch (Exception e10) {
                a.b(e10);
                f8.a.X(e10);
            }
        }
    }

    public final boolean t() {
        if (get() == null) {
            return true;
        }
        return false;
    }
}
