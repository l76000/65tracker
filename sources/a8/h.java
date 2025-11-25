package a8;

import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequentialDisposable */
public final class h extends AtomicReference<c> implements c {
    public h() {
    }

    public final void p() {
        d.d(this);
    }

    public final boolean t() {
        return d.g((c) get());
    }

    public h(h hVar) {
        lazySet(hVar);
    }
}
