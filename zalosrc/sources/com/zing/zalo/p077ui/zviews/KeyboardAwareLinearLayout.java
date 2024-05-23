package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import au.AbstractC2379w;
import p348mi.AbstractC23309i;

/* loaded from: classes6.dex */
public class KeyboardAwareLinearLayout extends LinearLayout {

    /* renamed from: p */
    private final AbstractC2379w.a f74561p;

    /* renamed from: q */
    boolean f74562q;

    /* renamed from: r */
    boolean f74563r;

    public KeyboardAwareLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74561p = new AbstractC2379w.a();
        this.f74562q = true;
        this.f74563r = true;
        if (Build.VERSION.SDK_INT >= 30) {
            this.f74563r = false;
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.zing.zalo.ui.zviews.us
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets m81047b;
                    m81047b = KeyboardAwareLinearLayout.m81047b(view, windowInsets);
                    return m81047b;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ WindowInsets m81047b(View view, WindowInsets windowInsets) {
        int ime;
        Insets insets;
        int i11;
        ime = WindowInsets.Type.ime();
        insets = windowInsets.getInsets(ime);
        i11 = insets.bottom;
        view.setPadding(0, 0, 0, i11);
        return windowInsets;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        if (!isInEditMode() && this.f74563r && this.f74562q) {
            int size = View.MeasureSpec.getSize(i12);
            AbstractC2379w.m12429c(this, this.f74561p, AbstractC23309i.m122007i5(getContext()));
            int i13 = this.f74561p.f9930e;
            if (i13 > 0) {
                size -= i13;
            }
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            return;
        }
        super.onMeasure(i11, i12);
    }

    public void setEnableMeasureKeyboard(boolean z11) {
        this.f74562q = z11;
    }
}
