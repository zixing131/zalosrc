package zm.voip.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.zing.zalo.p077ui.widget.RobotoTextView;

/* loaded from: classes7.dex */
public class MarqueeTextView extends RobotoTextView {
    public MarqueeTextView(Context context) {
        super(context);
        m157371i();
    }

    /* renamed from: i */
    void m157371i() {
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setMarqueeRepeatLimit(-1);
        setLines(1);
        setSingleLine();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        if (z11) {
            super.onFocusChanged(z11, i11, rect);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z11) {
        if (z11) {
            super.onWindowFocusChanged(z11);
        }
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m157371i();
    }
}
