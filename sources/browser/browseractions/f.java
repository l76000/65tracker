package androidx.browser.browseractions;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.n;

/* compiled from: BrowserActionsFallbackMenuUi */
class f implements View.OnClickListener {
    public final /* synthetic */ TextView O;

    public f(TextView textView) {
        this.O = textView;
    }

    public final void onClick(View view) {
        TextView textView = this.O;
        if (n.k(textView) == Integer.MAX_VALUE) {
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            return;
        }
        textView.setMaxLines(Integer.MAX_VALUE);
        textView.setEllipsize((TextUtils.TruncateAt) null);
    }
}
