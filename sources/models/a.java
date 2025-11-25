package buslogic.app;

import android.os.Handler;
import android.os.Looper;
import e.o0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: AppExecutors */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static a f9669c;

    /* renamed from: a  reason: collision with root package name */
    public final Executor f9670a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f9671b;

    /* compiled from: AppExecutors */
    public static class b implements Executor {
        public final Handler O = new Handler(Looper.getMainLooper());

        public final void execute(@o0 Runnable runnable) {
            this.O.post(runnable);
        }
    }

    public a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Executors.newFixedThreadPool(3);
        b bVar = new b();
        this.f9670a = newSingleThreadExecutor;
        this.f9671b = bVar;
        f9669c = this;
    }

    public static a a() {
        return f9669c;
    }
}
