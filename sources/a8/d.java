package a8;

import f8.a;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DisposableHelper */
public enum d implements c {
    ;

    /* access modifiers changed from: public */
    d() {
    }

    public static boolean d(AtomicReference<c> atomicReference) {
        c andSet;
        c cVar = atomicReference.get();
        d dVar = O;
        if (cVar == dVar || (andSet = atomicReference.getAndSet(dVar)) == dVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.p();
        return true;
    }

    public static boolean g(c cVar) {
        if (cVar == O) {
            return true;
        }
        return false;
    }

    public static boolean i(AtomicReference<c> atomicReference, c cVar) {
        boolean z9;
        do {
            c cVar2 = atomicReference.get();
            z9 = false;
            if (cVar2 != O) {
                while (true) {
                    if (!atomicReference.compareAndSet(cVar2, cVar)) {
                        if (atomicReference.get() != cVar2) {
                            continue;
                            break;
                        }
                    } else {
                        z9 = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (cVar != null) {
                    cVar.p();
                }
                return false;
            }
        } while (!z9);
        return true;
    }

    public static void j() {
        a.X(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean l(AtomicReference<c> atomicReference, c cVar) {
        c cVar2;
        boolean z9;
        do {
            cVar2 = atomicReference.get();
            z9 = false;
            if (cVar2 != O) {
                while (true) {
                    if (!atomicReference.compareAndSet(cVar2, cVar)) {
                        if (atomicReference.get() != cVar2) {
                            continue;
                            break;
                        }
                    } else {
                        z9 = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (cVar != null) {
                    cVar.p();
                }
                return false;
            }
        } while (!z9);
        if (cVar2 != null) {
            cVar2.p();
        }
        return true;
    }

    public static boolean n(AtomicReference<c> atomicReference, c cVar) {
        boolean z9;
        b.g(cVar, "d is null");
        while (true) {
            if (!atomicReference.compareAndSet((Object) null, cVar)) {
                if (atomicReference.get() != null) {
                    z9 = false;
                    break;
                }
            } else {
                z9 = true;
                break;
            }
        }
        if (z9) {
            return true;
        }
        cVar.p();
        if (atomicReference.get() != O) {
            j();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean o(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.c> r3, io.reactivex.disposables.c r4) {
        /*
        L_0x0000:
            r0 = 0
            boolean r0 = r3.compareAndSet(r0, r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000b
            r0 = r2
            goto L_0x0012
        L_0x000b:
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0012:
            if (r0 != 0) goto L_0x0020
            java.lang.Object r3 = r3.get()
            a8.d r0 = O
            if (r3 != r0) goto L_0x001f
            r4.p()
        L_0x001f:
            return r1
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.d.o(java.util.concurrent.atomic.AtomicReference, io.reactivex.disposables.c):boolean");
    }

    public static boolean q(c cVar, c cVar2) {
        if (cVar2 == null) {
            a.X(new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.p();
            j();
            return false;
        }
    }

    public final boolean t() {
        return true;
    }

    public final void p() {
    }
}
