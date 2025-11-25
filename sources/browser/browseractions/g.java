package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import e.a1;
import e.k1;
import e.o0;
import e.q0;
import java.util.ArrayList;
import java.util.List;
import n.a;
import org.apache.http.protocol.HTTP;

@Deprecated
/* compiled from: BrowserActionsFallbackMenuUi */
class g implements AdapterView.OnItemClickListener {
    public final Context O;
    public final Uri P;
    public final ArrayList Q;
    @q0
    public c R;

    @k1
    @a1
    /* compiled from: BrowserActionsFallbackMenuUi */
    public interface a {
    }

    public g(@o0 Context context, @o0 Uri uri, @o0 List<a> list) {
        this.O = context;
        this.P = uri;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(0, PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", uri), 67108864), context.getString(a.e.f25771c)));
        arrayList.add(new a(new d(this), context.getString(a.e.f25770b)));
        String string = context.getString(a.e.f25772d);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", uri.toString());
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        arrayList.add(new a(0, PendingIntent.getActivity(context, 0, intent, 67108864), string));
        arrayList.addAll(list);
        this.Q = arrayList;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        a aVar = (a) this.Q.get(i10);
        if (aVar.a() != null) {
            try {
                aVar.a().send();
            } catch (PendingIntent.CanceledException e10) {
                Log.e("BrowserActionskMenuUi", "Failed to send custom item action", e10);
            }
        } else {
            Runnable runnable = aVar.f1347e;
            if (runnable != null) {
                runnable.run();
            }
        }
        c cVar = this.R;
        if (cVar == null) {
            Log.e("BrowserActionskMenuUi", "Cannot dismiss dialog, it has already been dismissed.");
        } else {
            cVar.dismiss();
        }
    }
}
