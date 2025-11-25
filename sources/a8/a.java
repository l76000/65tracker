package a8;

import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: ArrayCompositeDisposable */
public final class a extends AtomicReferenceArray<c> implements c {
    public a() {
        super(2);
    }

    public final boolean a(int i10, c cVar) {
        c cVar2;
        do {
            cVar2 = (c) get(i10);
            if (cVar2 == d.O) {
                cVar.p();
                return false;
            }
        } while (!compareAndSet(i10, cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.p();
        return true;
    }

    public final void p() {
        c cVar;
        if (get(0) != d.O) {
            int length = length();
            for (int i10 = 0; i10 < length; i10++) {
                c cVar2 = (c) get(i10);
                d dVar = d.O;
                if (!(cVar2 == dVar || (cVar = (c) getAndSet(i10, dVar)) == dVar || cVar == null)) {
                    cVar.p();
                }
            }
        }
    }

    public final boolean t() {
        if (get(0) == d.O) {
            return true;
        }
        return false;
    }
}
