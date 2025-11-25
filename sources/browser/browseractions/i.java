package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.h;
import android.util.Log;
import androidx.concurrent.futures.d;
import androidx.core.content.FileProvider;
import com.google.firebase.analytics.FirebaseAnalytics;
import e.a1;
import e.j1;
import e.o0;
import e.q0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Deprecated
@a1
/* compiled from: BrowserServiceFileProvider */
public final class i extends FileProvider {
    public static final Object S = new Object();

    /* compiled from: BrowserServiceFileProvider */
    public class a implements Runnable {
        public final /* synthetic */ ContentResolver O;
        public final /* synthetic */ Uri P;
        public final /* synthetic */ d Q;

        public a(ContentResolver contentResolver, Uri uri, d dVar) {
            this.O = contentResolver;
            this.P = uri;
            this.Q = dVar;
        }

        public final void run() {
            d dVar = this.Q;
            try {
                ParcelFileDescriptor openFileDescriptor = this.O.openFileDescriptor(this.P, "r");
                if (openFileDescriptor == null) {
                    dVar.r(new FileNotFoundException());
                    return;
                }
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                openFileDescriptor.close();
                if (decodeFileDescriptor == null) {
                    dVar.r(new IOException("File could not be decoded."));
                } else {
                    dVar.q(decodeFileDescriptor);
                }
            } catch (IOException e10) {
                dVar.r(e10);
            }
        }
    }

    /* compiled from: BrowserServiceFileProvider */
    public static class b extends AsyncTask<Void, Void, Void> {

        /* renamed from: b  reason: collision with root package name */
        public static final long f1381b;

        /* renamed from: c  reason: collision with root package name */
        public static final long f1382c;

        /* renamed from: d  reason: collision with root package name */
        public static final long f1383d;

        /* renamed from: a  reason: collision with root package name */
        public final Context f1384a;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            f1381b = timeUnit.toMillis(7);
            f1382c = timeUnit.toMillis(7);
            f1383d = timeUnit.toMillis(1);
        }

        public b(Context context) {
            this.f1384a = context.getApplicationContext();
        }

        public final Object doInBackground(Object[] objArr) {
            boolean z9;
            long j10;
            Void[] voidArr = (Void[]) objArr;
            SharedPreferences sharedPreferences = this.f1384a.getSharedPreferences(this.f1384a.getPackageName() + ".image_provider", 0);
            boolean z10 = true;
            if (System.currentTimeMillis() > sharedPreferences.getLong("last_cleanup_time", System.currentTimeMillis()) + f1382c) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                return null;
            }
            synchronized (i.S) {
                File file = new File(this.f1384a.getFilesDir(), "image_provider");
                if (!file.exists()) {
                    return null;
                }
                File[] listFiles = file.listFiles();
                long currentTimeMillis = System.currentTimeMillis() - f1381b;
                for (File file2 : listFiles) {
                    if (file2.getName().endsWith("..png")) {
                        if (file2.lastModified() < currentTimeMillis && !file2.delete()) {
                            Log.e("BrowserServiceFP", "Fail to delete image: " + file2.getAbsoluteFile());
                            z10 = false;
                        }
                    }
                }
                if (z10) {
                    j10 = System.currentTimeMillis();
                } else {
                    j10 = (System.currentTimeMillis() - f1382c) + f1383d;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("last_cleanup_time", j10);
                edit.apply();
                return null;
            }
        }
    }

    /* compiled from: BrowserServiceFileProvider */
    public static class c extends AsyncTask<String, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1385a;

        /* renamed from: b  reason: collision with root package name */
        public final String f1386b;

        /* renamed from: c  reason: collision with root package name */
        public final Bitmap f1387c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f1388d;

        /* renamed from: e  reason: collision with root package name */
        public final d<Uri> f1389e;

        public c(Context context, String str, Bitmap bitmap, Uri uri, d<Uri> dVar) {
            this.f1385a = context.getApplicationContext();
            this.f1386b = str;
            this.f1387c = bitmap;
            this.f1388d = uri;
            this.f1389e = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x004a A[SYNTHETIC, Splitter:B:23:0x004a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.io.File r12) {
            /*
                r11 = this;
                androidx.concurrent.futures.d<android.net.Uri> r0 = r11.f1389e
                java.lang.String r1 = "Failed to close file output stream"
                java.lang.String r2 = "Failed to sync file output stream"
                java.lang.String r3 = "AtomicFile"
                androidx.core.util.c r4 = new androidx.core.util.c
                r4.<init>(r12)
                java.io.File r12 = r4.f4602b
                r5 = 1
                r6 = 0
                java.io.FileOutputStream r7 = r4.b()     // Catch:{ IOException -> 0x0045 }
                android.graphics.Bitmap r8 = r11.f1387c     // Catch:{ IOException -> 0x0043 }
                android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0043 }
                r10 = 100
                r8.compress(r9, r10, r7)     // Catch:{ IOException -> 0x0043 }
                r7.close()     // Catch:{ IOException -> 0x0043 }
                java.io.FileDescriptor r8 = r7.getFD()     // Catch:{ IOException -> 0x002a }
                r8.sync()     // Catch:{ IOException -> 0x002a }
                r8 = r5
                goto L_0x002b
            L_0x002a:
                r8 = r6
            L_0x002b:
                if (r8 != 0) goto L_0x0030
                android.util.Log.e(r3, r2)     // Catch:{ IOException -> 0x0043 }
            L_0x0030:
                r7.close()     // Catch:{ IOException -> 0x0034 }
                goto L_0x0038
            L_0x0034:
                r8 = move-exception
                android.util.Log.e(r3, r1, r8)     // Catch:{ IOException -> 0x0043 }
            L_0x0038:
                java.io.File r4 = r4.f4601a     // Catch:{ IOException -> 0x0043 }
                androidx.core.util.c.a(r12, r4)     // Catch:{ IOException -> 0x0043 }
                android.net.Uri r4 = r11.f1388d     // Catch:{ IOException -> 0x0043 }
                r0.q(r4)     // Catch:{ IOException -> 0x0043 }
                goto L_0x007a
            L_0x0043:
                r4 = move-exception
                goto L_0x0047
            L_0x0045:
                r4 = move-exception
                r7 = 0
            L_0x0047:
                if (r7 != 0) goto L_0x004a
                goto L_0x0077
            L_0x004a:
                java.io.FileDescriptor r8 = r7.getFD()     // Catch:{ IOException -> 0x0052 }
                r8.sync()     // Catch:{ IOException -> 0x0052 }
                goto L_0x0053
            L_0x0052:
                r5 = r6
            L_0x0053:
                if (r5 != 0) goto L_0x0058
                android.util.Log.e(r3, r2)
            L_0x0058:
                r7.close()     // Catch:{ IOException -> 0x005c }
                goto L_0x0060
            L_0x005c:
                r2 = move-exception
                android.util.Log.e(r3, r1, r2)
            L_0x0060:
                boolean r1 = r12.delete()
                if (r1 != 0) goto L_0x0077
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Failed to delete new file "
                r1.<init>(r2)
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                android.util.Log.e(r3, r12)
            L_0x0077:
                r0.r(r4)
            L_0x007a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.browser.browseractions.i.c.a(java.io.File):void");
        }

        public final Object doInBackground(Object[] objArr) {
            String[] strArr = (String[]) objArr;
            File file = new File(this.f1385a.getFilesDir(), "image_provider");
            synchronized (i.S) {
                if (file.exists() || file.mkdir()) {
                    File file2 = new File(file, this.f1386b + ".png");
                    if (file2.exists()) {
                        this.f1389e.q(this.f1388d);
                    } else {
                        a(file2);
                    }
                    file2.setLastModified(System.currentTimeMillis());
                    return null;
                }
                this.f1389e.r(new IOException("Could not create file directory."));
                return null;
            }
        }

        public final void onPostExecute(Object obj) {
            Void voidR = (Void) obj;
            new b(this.f1385a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public static void e(@o0 Intent intent, @q0 List<Uri> list, @o0 Context context) {
        if (list != null && list.size() != 0) {
            ContentResolver contentResolver = context.getContentResolver();
            intent.addFlags(1);
            ClipData newUri = ClipData.newUri(contentResolver, "image_provider_uris", list.get(0));
            for (int i10 = 1; i10 < list.size(); i10++) {
                newUri.addItem(new ClipData.Item(list.get(i10)));
            }
            intent.setClipData(newUri);
        }
    }

    @o0
    public static t5.a<Bitmap> f(@o0 ContentResolver contentResolver, @o0 Uri uri) {
        d u9 = d.u();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(contentResolver, uri, u9));
        return u9;
    }

    @o0
    @j1
    public static d<Uri> g(@o0 Context context, @o0 Bitmap bitmap, @o0 String str, int i10) {
        StringBuilder w9 = h.w(str, "_");
        w9.append(Integer.toString(i10));
        String sb = w9.toString();
        String p10 = h.p("image_provider_images/", sb, ".png");
        Uri.Builder scheme = new Uri.Builder().scheme(FirebaseAnalytics.d.P);
        Uri build = scheme.authority(context.getPackageName() + ".image_provider").path(p10).build();
        d<Uri> u9 = d.u();
        new c(context, sb, bitmap, build, u9).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return u9;
    }
}
