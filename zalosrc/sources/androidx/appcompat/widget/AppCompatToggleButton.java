package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes2.dex */
public class AppCompatToggleButton extends ToggleButton {

    /* renamed from: p */
    private final C1154b0 f4310p;

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC1199p1.m5678a(this, getContext());
        C1154b0 c1154b0 = new C1154b0(this);
        this.f4310p = c1154b0;
        c1154b0.m5477m(attributeSet, i11);
    }
}
