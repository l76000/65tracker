package androidx.browser.customtabs;

import android.os.IBinder;
import android.support.customtabs.a;
import androidx.browser.customtabs.i;
import java.util.NoSuchElementException;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i.a f1435a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f1436b;

    public /* synthetic */ h(i.a aVar, l lVar) {
        this.f1435a = aVar;
        this.f1436b = lVar;
    }

    public final void binderDied() {
        IBinder iBinder;
        i.a aVar = this.f1435a;
        l lVar = this.f1436b;
        i iVar = i.this;
        iVar.getClass();
        try {
            synchronized (iVar.O) {
                a aVar2 = lVar.f1448a;
                if (aVar2 == null) {
                    iBinder = null;
                } else {
                    iBinder = aVar2.asBinder();
                }
                if (iBinder != null) {
                    iBinder.unlinkToDeath(iVar.O.getOrDefault(iBinder, null), 0);
                    iVar.O.remove(iBinder);
                }
            }
        } catch (NoSuchElementException unused) {
        }
    }
}
