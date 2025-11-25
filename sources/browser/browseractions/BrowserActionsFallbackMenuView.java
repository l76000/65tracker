package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.widgets.analyzer.b;
import e.a1;
import e.o0;
import n.a;

@Deprecated
@a1
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int O = getResources().getDimensionPixelOffset(a.b.f25761b);
    public final int P = getResources().getDimensionPixelOffset(a.b.f25760a);

    public BrowserActionsFallbackMenuView(@o0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.O * 2), this.P), b.f1977e), i11);
    }
}
