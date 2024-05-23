package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p433q0.AbstractC24962a;

@Deprecated
/* loaded from: classes2.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: p */
    private final int f4789p;

    /* renamed from: q */
    private final int f4790q;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4789p = getResources().getDimensionPixelOffset(AbstractC24962a.browser_actions_context_menu_min_padding);
        this.f4790q = getResources().getDimensionPixelOffset(AbstractC24962a.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f4789p * 2), this.f4790q), 1073741824), i12);
    }
}
