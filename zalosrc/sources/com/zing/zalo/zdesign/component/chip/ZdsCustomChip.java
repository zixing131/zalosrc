package com.zing.zalo.zdesign.component.chip;

import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class ZdsCustomChip extends ZdsChip {

    /* renamed from: b0 */
    private View f86676b0;

    public final void setMiddleCustom(View view) {
        ViewGroup middleContainer;
        ViewGroup middleContainer2;
        AbstractC19074t.m100208f(view, "customView");
        if (!AbstractC19074t.m100204b(this.f86676b0, view) && this.f86676b0 != null && (middleContainer2 = getMiddleContainer()) != null) {
            middleContainer2.removeView(this.f86676b0);
        }
        this.f86676b0 = view;
        if (view != null && (middleContainer = getMiddleContainer()) != null) {
            middleContainer.addView(view);
        }
        RobotoTextView middleText = getMiddleText();
        if (middleText != null) {
            middleText.setVisibility(8);
        }
    }
}
