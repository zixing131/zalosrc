package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.view.AbstractC1579n0;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23586k;

/* loaded from: classes3.dex */
public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    /* renamed from: E */
    public static final int f35707E = AbstractC23586k.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.linearProgressIndicatorStyle);
    }

    /* renamed from: u */
    private void m32734u() {
        setIndeterminateDrawable(C6385h.m32808t(getContext(), (LinearProgressIndicatorSpec) this.f35688p));
        setProgressDrawable(C6381d.m32774v(getContext(), (LinearProgressIndicatorSpec) this.f35688p));
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f35688p).f35708g;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f35688p).f35709h;
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        AbstractC6378a abstractC6378a = this.f35688p;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) abstractC6378a;
        boolean z12 = true;
        if (((LinearProgressIndicatorSpec) abstractC6378a).f35709h != 1 && ((AbstractC1579n0.m7812G(this) != 1 || ((LinearProgressIndicatorSpec) this.f35688p).f35709h != 2) && (AbstractC1579n0.m7812G(this) != 0 || ((LinearProgressIndicatorSpec) this.f35688p).f35709h != 3))) {
            z12 = false;
        }
        linearProgressIndicatorSpec.f35710i = z12;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        int paddingLeft = i11 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i12 - (getPaddingTop() + getPaddingBottom());
        C6385h indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        C6381d progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: p */
    public void mo32729p(int i11, boolean z11) {
        AbstractC6378a abstractC6378a = this.f35688p;
        if (abstractC6378a != null && ((LinearProgressIndicatorSpec) abstractC6378a).f35708g == 0 && isIndeterminate()) {
            return;
        }
        super.mo32729p(i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public LinearProgressIndicatorSpec mo32727i(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i11) {
        if (((LinearProgressIndicatorSpec) this.f35688p).f35708g == i11) {
            return;
        }
        if (m32730r() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        AbstractC6378a abstractC6378a = this.f35688p;
        ((LinearProgressIndicatorSpec) abstractC6378a).f35708g = i11;
        ((LinearProgressIndicatorSpec) abstractC6378a).mo32733e();
        if (i11 == 0) {
            getIndeterminateDrawable().m32811w(new C6387j((LinearProgressIndicatorSpec) this.f35688p));
        } else {
            getIndeterminateDrawable().m32811w(new C6388k(getContext(), (LinearProgressIndicatorSpec) this.f35688p));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f35688p).mo32733e();
    }

    public void setIndicatorDirection(int i11) {
        AbstractC6378a abstractC6378a = this.f35688p;
        ((LinearProgressIndicatorSpec) abstractC6378a).f35709h = i11;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) abstractC6378a;
        boolean z11 = true;
        if (i11 != 1 && ((AbstractC1579n0.m7812G(this) != 1 || ((LinearProgressIndicatorSpec) this.f35688p).f35709h != 2) && (AbstractC1579n0.m7812G(this) != 0 || i11 != 3))) {
            z11 = false;
        }
        linearProgressIndicatorSpec.f35710i = z11;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i11) {
        super.setTrackCornerRadius(i11);
        ((LinearProgressIndicatorSpec) this.f35688p).mo32733e();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, f35707E);
        m32734u();
    }
}
