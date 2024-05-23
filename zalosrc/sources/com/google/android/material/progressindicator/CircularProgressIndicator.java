package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23586k;

/* loaded from: classes3.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {

    /* renamed from: E */
    public static final int f35703E = AbstractC23586k.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.circularProgressIndicatorStyle);
    }

    /* renamed from: u */
    private void m32731u() {
        setIndeterminateDrawable(C6385h.m32807s(getContext(), (CircularProgressIndicatorSpec) this.f35688p));
        setProgressDrawable(C6381d.m32773u(getContext(), (CircularProgressIndicatorSpec) this.f35688p));
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f35688p).f35706i;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f35688p).f35705h;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f35688p).f35704g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public CircularProgressIndicatorSpec mo32727i(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndicatorDirection(int i11) {
        ((CircularProgressIndicatorSpec) this.f35688p).f35706i = i11;
        invalidate();
    }

    public void setIndicatorInset(int i11) {
        AbstractC6378a abstractC6378a = this.f35688p;
        if (((CircularProgressIndicatorSpec) abstractC6378a).f35705h != i11) {
            ((CircularProgressIndicatorSpec) abstractC6378a).f35705h = i11;
            invalidate();
        }
    }

    public void setIndicatorSize(int i11) {
        int max = Math.max(i11, getTrackThickness() * 2);
        AbstractC6378a abstractC6378a = this.f35688p;
        if (((CircularProgressIndicatorSpec) abstractC6378a).f35704g != max) {
            ((CircularProgressIndicatorSpec) abstractC6378a).f35704g = max;
            ((CircularProgressIndicatorSpec) abstractC6378a).mo32733e();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i11) {
        super.setTrackThickness(i11);
        ((CircularProgressIndicatorSpec) this.f35688p).mo32733e();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, f35703E);
        m32731u();
    }
}
