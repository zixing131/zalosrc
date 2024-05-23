package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.AbstractC6355v;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23587l;

/* loaded from: classes3.dex */
public final class LinearProgressIndicatorSpec extends AbstractC6378a {

    /* renamed from: g */
    public int f35708g;

    /* renamed from: h */
    public int f35709h;

    /* renamed from: i */
    boolean f35710i;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.linearProgressIndicatorStyle);
    }

    @Override // com.google.android.material.progressindicator.AbstractC6378a
    /* renamed from: e */
    public void mo32733e() {
        if (this.f35708g == 0) {
            if (this.f35712b <= 0) {
                if (this.f35713c.length < 3) {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
                return;
            }
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        }
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, LinearProgressIndicator.f35707E);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray m32639h = AbstractC6355v.m32639h(context, attributeSet, AbstractC23587l.LinearProgressIndicator, AbstractC23577b.linearProgressIndicatorStyle, LinearProgressIndicator.f35707E, new int[0]);
        this.f35708g = m32639h.getInt(AbstractC23587l.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.f35709h = m32639h.getInt(AbstractC23587l.LinearProgressIndicator_indicatorDirectionLinear, 0);
        m32639h.recycle();
        mo32733e();
        this.f35710i = this.f35709h == 1;
    }
}
