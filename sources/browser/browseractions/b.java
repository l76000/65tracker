package androidx.browser.browseractions;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import e.o0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: BrowserActionsFallbackMenuAdapter */
class b extends BaseAdapter {
    public final List<a> O;
    public final Context P;

    /* compiled from: BrowserActionsFallbackMenuAdapter */
    public class a implements Runnable {
        public final /* synthetic */ String O;
        public final /* synthetic */ c P;
        public final /* synthetic */ t5.a Q;

        public a(String str, c cVar, t5.a aVar) {
            this.O = str;
            this.P = cVar;
            this.Q = aVar;
        }

        public final void run() {
            Bitmap bitmap;
            c cVar = this.P;
            if (TextUtils.equals(this.O, cVar.f1349b.getText())) {
                try {
                    bitmap = (Bitmap) this.Q.get();
                } catch (InterruptedException | ExecutionException unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    cVar.f1348a.setVisibility(0);
                    cVar.f1348a.setImageBitmap(bitmap);
                    return;
                }
                cVar.f1348a.setVisibility(4);
                cVar.f1348a.setImageBitmap((Bitmap) null);
            }
        }
    }

    /* renamed from: androidx.browser.browseractions.b$b  reason: collision with other inner class name */
    /* compiled from: BrowserActionsFallbackMenuAdapter */
    public class C0038b implements Executor {
        public final void execute(@o0 Runnable runnable) {
            runnable.run();
        }
    }

    /* compiled from: BrowserActionsFallbackMenuAdapter */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final ImageView f1348a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1349b;

        public c(ImageView imageView, TextView textView) {
            this.f1348a = imageView;
            this.f1349b = textView;
        }
    }

    public b(Context context, ArrayList arrayList) {
        this.O = arrayList;
        this.P = context;
    }

    public final int getCount() {
        return this.O.size();
    }

    public final Object getItem(int i10) {
        return this.O.get(i10);
    }

    public final long getItemId(int i10) {
        return (long) i10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: androidx.browser.browseractions.b$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            java.util.List<androidx.browser.browseractions.a> r8 = r5.O
            java.lang.Object r6 = r8.get(r6)
            androidx.browser.browseractions.a r6 = (androidx.browser.browseractions.a) r6
            r8 = 0
            android.content.Context r0 = r5.P
            if (r7 != 0) goto L_0x003c
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r0)
            int r1 = n.a.d.f25768b
            android.view.View r7 = r7.inflate(r1, r8)
            int r1 = n.a.c.f25763b
            android.view.View r1 = r7.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = n.a.c.f25764c
            android.view.View r2 = r7.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r1 == 0) goto L_0x0034
            if (r2 == 0) goto L_0x0034
            androidx.browser.browseractions.b$c r3 = new androidx.browser.browseractions.b$c
            r3.<init>(r1, r2)
            r7.setTag(r3)
            goto L_0x0043
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Browser Actions fallback UI does not contain necessary Views."
            r6.<init>(r7)
            throw r6
        L_0x003c:
            java.lang.Object r1 = r7.getTag()
            r3 = r1
            androidx.browser.browseractions.b$c r3 = (androidx.browser.browseractions.b.c) r3
        L_0x0043:
            java.lang.String r1 = r6.f1343a
            android.widget.TextView r2 = r3.f1349b
            r2.setText(r1)
            int r2 = r6.f1345c
            android.widget.ImageView r4 = r3.f1348a
            if (r2 == 0) goto L_0x005c
            android.content.res.Resources r6 = r0.getResources()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.i.e(r6, r2, r8)
            r4.setImageDrawable(r6)
            goto L_0x007d
        L_0x005c:
            android.net.Uri r6 = r6.f1346d
            if (r6 == 0) goto L_0x0076
            android.content.ContentResolver r8 = r0.getContentResolver()
            t5.a r6 = androidx.browser.browseractions.i.f(r8, r6)
            androidx.browser.browseractions.b$a r8 = new androidx.browser.browseractions.b$a
            r8.<init>(r1, r3, r6)
            androidx.browser.browseractions.b$b r0 = new androidx.browser.browseractions.b$b
            r0.<init>()
            r6.j(r8, r0)
            goto L_0x007d
        L_0x0076:
            r4.setImageBitmap(r8)
            r6 = 4
            r4.setVisibility(r6)
        L_0x007d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.browser.browseractions.b.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
