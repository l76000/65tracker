package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;

@Deprecated
/* compiled from: BrowserActionsFallbackMenuDialog */
class c extends Dialog {
    public final View O;

    /* compiled from: BrowserActionsFallbackMenuDialog */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f1350a;

        public a(boolean z9) {
            this.f1350a = z9;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f1350a) {
                c.super.dismiss();
            }
        }
    }

    public c(BrowserActionsFallbackMenuView browserActionsFallbackMenuView, Context context) {
        super(context);
        this.O = browserActionsFallbackMenuView;
    }

    public final void b(boolean z9) {
        float f10;
        long j10;
        float f11 = 0.0f;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (z9) {
            f11 = 1.0f;
        }
        if (z9) {
            j10 = 250;
        } else {
            j10 = 150;
        }
        View view = this.O;
        view.setScaleX(f10);
        view.setScaleY(f10);
        view.animate().scaleX(f11).scaleY(f11).setDuration(j10).setInterpolator(new androidx.interpolator.view.animation.c()).setListener(new a(z9)).start();
    }

    public final void dismiss() {
        b(false);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        b(true);
        super.show();
    }
}
