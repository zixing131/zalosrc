package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.AbstractC6355v;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23587l;
import p439q6.AbstractC25136a;
import p599w6.AbstractC28774c;

/* renamed from: com.google.android.material.progressindicator.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6378a {

    /* renamed from: a */
    public int f35711a;

    /* renamed from: b */
    public int f35712b;

    /* renamed from: c */
    public int[] f35713c = new int[0];

    /* renamed from: d */
    public int f35714d;

    /* renamed from: e */
    public int f35715e;

    /* renamed from: f */
    public int f35716f;

    public AbstractC6378a(Context context, AttributeSet attributeSet, int i11, int i12) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(AbstractC23579d.mtrl_progress_track_thickness);
        TypedArray m32639h = AbstractC6355v.m32639h(context, attributeSet, AbstractC23587l.BaseProgressIndicator, i11, i12, new int[0]);
        this.f35711a = AbstractC28774c.m143975c(context, m32639h, AbstractC23587l.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f35712b = Math.min(AbstractC28774c.m143975c(context, m32639h, AbstractC23587l.BaseProgressIndicator_trackCornerRadius, 0), this.f35711a / 2);
        this.f35715e = m32639h.getInt(AbstractC23587l.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f35716f = m32639h.getInt(AbstractC23587l.BaseProgressIndicator_hideAnimationBehavior, 0);
        m32736c(context, m32639h);
        m32737d(context, m32639h);
        m32639h.recycle();
    }

    /* renamed from: c */
    private void m32736c(Context context, TypedArray typedArray) {
        if (!typedArray.hasValue(AbstractC23587l.BaseProgressIndicator_indicatorColor)) {
            this.f35713c = new int[]{AbstractC25136a.m130292b(context, AbstractC23577b.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(AbstractC23587l.BaseProgressIndicator_indicatorColor).type != 1) {
            this.f35713c = new int[]{typedArray.getColor(AbstractC23587l.BaseProgressIndicator_indicatorColor, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(AbstractC23587l.BaseProgressIndicator_indicatorColor, -1));
        this.f35713c = intArray;
        if (intArray.length != 0) {
        } else {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    /* renamed from: d */
    private void m32737d(Context context, TypedArray typedArray) {
        if (typedArray.hasValue(AbstractC23587l.BaseProgressIndicator_trackColor)) {
            this.f35714d = typedArray.getColor(AbstractC23587l.BaseProgressIndicator_trackColor, -1);
            return;
        }
        this.f35714d = this.f35713c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f11 = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f35714d = AbstractC25136a.m130291a(this.f35714d, (int) (f11 * 255.0f));
    }

    /* renamed from: a */
    public boolean m32738a() {
        return this.f35716f != 0;
    }

    /* renamed from: b */
    public boolean m32739b() {
        return this.f35715e != 0;
    }

    /* renamed from: e */
    public abstract void mo32733e();
}
