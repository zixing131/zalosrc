package com.zing.zalo.zdesign.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.zing.zalo.zdesign.component.inputfield.BaseInputField;
import fn0.AbstractC19074t;
import ui0.C27276c;

/* loaded from: classes7.dex */
public class TextField extends BaseInputField {

    /* renamed from: V */
    private View f86437V;

    /* renamed from: W */
    private View f86438W;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: G */
    public final void m90700G(boolean z11) {
        int i11;
        View view = this.f86438W;
        if (view != null) {
            AbstractC19074t.m100205c(view);
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    public final void setLeadingView(View view) {
        if (view == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        layoutParams.leftMargin = C27276c.m139649b(context, 12);
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
        if (this.f86437V == null) {
            getLeftControlsLayout().addView(view, layoutParams);
            this.f86437V = view;
        } else {
            getLeftControlsLayout().removeView(this.f86437V);
            getLeftControlsLayout().addView(view, layoutParams);
            this.f86437V = view;
        }
    }

    public final void setTrailingView(View view) {
        if (view == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        layoutParams.rightMargin = C27276c.m139649b(context, 12);
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
        if (this.f86438W == null) {
            getRightLayoutInput().addView(view, layoutParams);
            this.f86438W = view;
        } else {
            getRightLayoutInput().removeView(this.f86438W);
            getRightLayoutInput().addView(view, layoutParams);
            this.f86438W = view;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextField(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        m91047v();
    }
}
