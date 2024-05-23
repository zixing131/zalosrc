package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23581f;
import p357n6.AbstractC23587l;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: p */
    private TextView f35869p;

    /* renamed from: q */
    private Button f35870q;

    /* renamed from: r */
    private int f35871r;

    /* renamed from: s */
    private int f35872s;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23587l.SnackbarLayout);
        this.f35871r = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.SnackbarLayout_android_maxWidth, -1);
        this.f35872s = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static void m32930a(View view, int i11, int i12) {
        if (AbstractC1579n0.m7871g0(view)) {
            AbstractC1579n0.m7837S0(view, AbstractC1579n0.m7820K(view), i11, AbstractC1579n0.m7818J(view), i12);
        } else {
            view.setPadding(view.getPaddingLeft(), i11, view.getPaddingRight(), i12);
        }
    }

    /* renamed from: b */
    private boolean m32931b(int i11, int i12, int i13) {
        boolean z11;
        if (i11 != getOrientation()) {
            setOrientation(i11);
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f35869p.getPaddingTop() == i12 && this.f35869p.getPaddingBottom() == i13) {
            return z11;
        }
        m32930a(this.f35869p, i12, i13);
        return true;
    }

    public Button getActionView() {
        return this.f35870q;
    }

    public TextView getMessageView() {
        return this.f35869p;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f35869p = (TextView) findViewById(AbstractC23581f.snackbar_text);
        this.f35870q = (Button) findViewById(AbstractC23581f.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        boolean z11;
        super.onMeasure(i11, i12);
        if (this.f35871r > 0) {
            int measuredWidth = getMeasuredWidth();
            int i13 = this.f35871r;
            if (measuredWidth > i13) {
                i11 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                super.onMeasure(i11, i12);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC23579d.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(AbstractC23579d.design_snackbar_padding_vertical);
        if (this.f35869p.getLayout().getLineCount() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && this.f35872s > 0 && this.f35870q.getMeasuredWidth() > this.f35872s) {
            if (!m32931b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
        } else {
            if (!z11) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m32931b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        }
        super.onMeasure(i11, i12);
    }

    public void setMaxInlineActionWidth(int i11) {
        this.f35872s = i11;
    }
}
