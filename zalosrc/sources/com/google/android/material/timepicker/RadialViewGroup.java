package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C1295c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AbstractC1579n0;
import p357n6.AbstractC23581f;
import p357n6.AbstractC23583h;
import p357n6.AbstractC23587l;
import p706z6.C31689h;
import p706z6.C31692k;

/* loaded from: classes3.dex */
class RadialViewGroup extends ConstraintLayout {

    /* renamed from: N */
    private final Runnable f36203N;

    /* renamed from: O */
    private int f36204O;

    /* renamed from: P */
    private C31689h f36205P;

    /* renamed from: com.google.android.material.timepicker.RadialViewGroup$a */
    /* loaded from: classes3.dex */
    class RunnableC6451a implements Runnable {
        RunnableC6451a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RadialViewGroup.this.m33280H();
        }
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: D */
    private Drawable m33276D() {
        C31689h c31689h = new C31689h();
        this.f36205P = c31689h;
        c31689h.m152440a0(new C31692k(0.5f));
        this.f36205P.m152442c0(ColorStateList.valueOf(-1));
        return this.f36205P;
    }

    /* renamed from: G */
    private static boolean m33277G(View view) {
        return "skip".equals(view.getTag());
    }

    /* renamed from: I */
    private void m33278I() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f36203N);
            handler.post(this.f36203N);
        }
    }

    /* renamed from: E */
    public int m33279E() {
        return this.f36204O;
    }

    /* renamed from: F */
    public void mo33260F(int i11) {
        this.f36204O = i11;
        m33280H();
    }

    /* renamed from: H */
    protected void m33280H() {
        int childCount = getChildCount();
        int i11 = 1;
        for (int i12 = 0; i12 < childCount; i12++) {
            if (m33277G(getChildAt(i12))) {
                i11++;
            }
        }
        C1295c c1295c = new C1295c();
        c1295c.m6456p(this);
        float f11 = 0.0f;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getId() != AbstractC23581f.circle_center && !m33277G(childAt)) {
                c1295c.m6459s(childAt.getId(), AbstractC23581f.circle_center, this.f36204O, f11);
                f11 += 360.0f / (childCount - i11);
            }
        }
        c1295c.m6450i(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        if (view.getId() == -1) {
            view.setId(AbstractC1579n0.m7889n());
        }
        m33278I();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m33280H();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m33278I();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        this.f36205P.m152442c0(ColorStateList.valueOf(i11));
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LayoutInflater.from(context).inflate(AbstractC23583h.material_radial_view_group, this);
        AbstractC1579n0.m7807D0(this, m33276D());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23587l.RadialViewGroup, i11, 0);
        this.f36204O = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.RadialViewGroup_materialCircleRadius, 0);
        this.f36203N = new RunnableC6451a();
        obtainStyledAttributes.recycle();
    }
}
