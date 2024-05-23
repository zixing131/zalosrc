package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.AbstractC6355v;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23587l;
import p599w6.AbstractC28774c;

/* loaded from: classes3.dex */
public final class CircularProgressIndicatorSpec extends AbstractC6378a {

    /* renamed from: g */
    public int f35704g;

    /* renamed from: h */
    public int f35705h;

    /* renamed from: i */
    public int f35706i;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.circularProgressIndicatorStyle);
    }

    @Override // com.google.android.material.progressindicator.AbstractC6378a
    /* renamed from: e */
    public void mo32733e() {
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, CircularProgressIndicator.f35703E);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(AbstractC23579d.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(AbstractC23579d.mtrl_progress_circular_inset_medium);
        TypedArray m32639h = AbstractC6355v.m32639h(context, attributeSet, AbstractC23587l.CircularProgressIndicator, i11, i12, new int[0]);
        this.f35704g = Math.max(AbstractC28774c.m143975c(context, m32639h, AbstractC23587l.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.f35711a * 2);
        this.f35705h = AbstractC28774c.m143975c(context, m32639h, AbstractC23587l.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.f35706i = m32639h.getInt(AbstractC23587l.CircularProgressIndicator_indicatorDirectionCircular, 0);
        m32639h.recycle();
        mo32733e();
    }
}
