package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import n.a;

/* compiled from: BrowserActionsFallbackMenuUi */
class d implements Runnable {
    public final /* synthetic */ g O;

    public d(g gVar) {
        this.O = gVar;
    }

    public final void run() {
        g gVar = this.O;
        ((ClipboardManager) gVar.O.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("url", gVar.P.toString()));
        Toast.makeText(gVar.O, gVar.O.getString(a.e.f25769a), 0).show();
    }
}
