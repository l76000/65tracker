package androidx.browser.trusted;

import android.content.Context;
import android.os.AsyncTask;
import e.o0;
import e.q0;
import java.util.HashMap;

/* compiled from: TrustedWebActivityServiceConnectionPool */
public final class s {

    /* compiled from: TrustedWebActivityServiceConnectionPool */
    public static class a extends AsyncTask<Void, Void, Exception> {
        @q0
        public final Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            throw null;
        }

        public final void onPostExecute(Object obj) {
            if (((Exception) obj) != null) {
                throw null;
            }
        }
    }

    public s(@o0 Context context) {
        new HashMap();
        context.getApplicationContext();
    }

    @o0
    public static s a(@o0 Context context) {
        return new s(context);
    }
}
