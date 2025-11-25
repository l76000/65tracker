package buslogic.app.helper;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.support.v4.media.h;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ScrollView;
import buslogic.beogradplus.R;
import java.util.Locale;

/* compiled from: LocaleHelper */
public class a {

    /* renamed from: buslogic.app.helper.a$a  reason: collision with other inner class name */
    /* compiled from: LocaleHelper */
    public class C0181a implements View.OnClickListener {
        public final /* synthetic */ ScrollView O;

        public C0181a(ScrollView scrollView) {
            this.O = scrollView;
        }

        public final void onClick(View view) {
            this.O.fullScroll(130);
        }
    }

    /* compiled from: LocaleHelper */
    public class b implements ViewTreeObserver.OnScrollChangedListener {
        public final /* synthetic */ ImageView O;
        public final /* synthetic */ Animation P;
        public final /* synthetic */ ScrollView Q;

        public b(Animation animation, ImageView imageView, ScrollView scrollView) {
            this.O = imageView;
            this.P = animation;
            this.Q = scrollView;
        }

        public final void onScrollChanged() {
            ImageView imageView = this.O;
            imageView.clearAnimation();
            Animation animation = this.P;
            animation.cancel();
            animation.reset();
            imageView.setVisibility(8);
            this.Q.getViewTreeObserver().removeOnScrollChangedListener(this);
        }
    }

    /* compiled from: LocaleHelper */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ ScrollView O;
        public final /* synthetic */ ImageView P;
        public final /* synthetic */ Animation Q;

        public c(Animation animation, ImageView imageView, ScrollView scrollView) {
            this.O = scrollView;
            this.P = imageView;
            this.Q = animation;
        }

        public final void onGlobalLayout() {
            ScrollView scrollView = this.O;
            boolean canScrollVertically = scrollView.canScrollVertically(1);
            ImageView imageView = this.P;
            if (canScrollVertically) {
                imageView.setVisibility(0);
                imageView.startAnimation(this.Q);
            } else {
                imageView.setVisibility(8);
            }
            scrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public static String a(Context context) {
        return b(context, Locale.getDefault().getLanguage());
    }

    public static String b(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("com.example.testjedan.language", str);
    }

    public static Context c(Context context) {
        return f(context, b(context, Locale.getDefault().getLanguage()));
    }

    public static Context d(Context context, String str) {
        return f(context, b(context, str));
    }

    public static void e(Activity activity, ImageView imageView, ScrollView scrollView) {
        if (activity != null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(activity.getApplicationContext(), R.anim.slide_down);
            imageView.setOnClickListener(new C0181a(scrollView));
            imageView.getViewTreeObserver().addOnScrollChangedListener(new b(loadAnimation, imageView, scrollView));
            scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new c(loadAnimation, imageView, scrollView));
        }
    }

    public static Context f(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("com.example.testjedan.language", str);
        edit.apply();
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        configuration.setLayoutDirection(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        Resources resources = createConfigurationContext.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration2 = resources.getConfiguration();
        configuration2.locale = locale;
        resources.updateConfiguration(configuration2, displayMetrics);
        return createConfigurationContext;
    }

    public static String g(String str) {
        String substring = str.substring(0, 4);
        String substring2 = str.substring(5, 7);
        String substring3 = str.substring(8, 10);
        return substring3 + "." + substring2 + "." + substring;
    }

    public static String h(String str) {
        return h.D(str.substring(5, 7), "/", str.substring(2, 4));
    }
}
