package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public class Constraints extends ViewGroup {

    /* renamed from: p */
    C1295c f5572p;

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* renamed from: A0 */
        public float f5573A0;

        /* renamed from: B0 */
        public float f5574B0;

        /* renamed from: C0 */
        public float f5575C0;

        /* renamed from: D0 */
        public float f5576D0;

        /* renamed from: E0 */
        public float f5577E0;

        /* renamed from: F0 */
        public float f5578F0;

        /* renamed from: G0 */
        public float f5579G0;

        /* renamed from: H0 */
        public float f5580H0;

        /* renamed from: I0 */
        public float f5581I0;

        /* renamed from: J0 */
        public float f5582J0;

        /* renamed from: x0 */
        public float f5583x0;

        /* renamed from: y0 */
        public boolean f5584y0;

        /* renamed from: z0 */
        public float f5585z0;

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.f5583x0 = 1.0f;
            this.f5584y0 = false;
            this.f5585z0 = 0.0f;
            this.f5573A0 = 0.0f;
            this.f5574B0 = 0.0f;
            this.f5575C0 = 0.0f;
            this.f5576D0 = 1.0f;
            this.f5577E0 = 1.0f;
            this.f5578F0 = 0.0f;
            this.f5579G0 = 0.0f;
            this.f5580H0 = 0.0f;
            this.f5581I0 = 0.0f;
            this.f5582J0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5583x0 = 1.0f;
            this.f5584y0 = false;
            this.f5585z0 = 0.0f;
            this.f5573A0 = 0.0f;
            this.f5574B0 = 0.0f;
            this.f5575C0 = 0.0f;
            this.f5576D0 = 1.0f;
            this.f5577E0 = 1.0f;
            this.f5578F0 = 0.0f;
            this.f5579G0 = 0.0f;
            this.f5580H0 = 0.0f;
            this.f5581I0 = 0.0f;
            this.f5582J0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1298f.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.ConstraintSet_android_alpha) {
                    this.f5583x0 = obtainStyledAttributes.getFloat(index, this.f5583x0);
                } else if (index == AbstractC1298f.ConstraintSet_android_elevation) {
                    this.f5585z0 = obtainStyledAttributes.getFloat(index, this.f5585z0);
                    this.f5584y0 = true;
                } else if (index == AbstractC1298f.ConstraintSet_android_rotationX) {
                    this.f5574B0 = obtainStyledAttributes.getFloat(index, this.f5574B0);
                } else if (index == AbstractC1298f.ConstraintSet_android_rotationY) {
                    this.f5575C0 = obtainStyledAttributes.getFloat(index, this.f5575C0);
                } else if (index == AbstractC1298f.ConstraintSet_android_rotation) {
                    this.f5573A0 = obtainStyledAttributes.getFloat(index, this.f5573A0);
                } else if (index == AbstractC1298f.ConstraintSet_android_scaleX) {
                    this.f5576D0 = obtainStyledAttributes.getFloat(index, this.f5576D0);
                } else if (index == AbstractC1298f.ConstraintSet_android_scaleY) {
                    this.f5577E0 = obtainStyledAttributes.getFloat(index, this.f5577E0);
                } else if (index == AbstractC1298f.ConstraintSet_android_transformPivotX) {
                    this.f5578F0 = obtainStyledAttributes.getFloat(index, this.f5578F0);
                } else if (index == AbstractC1298f.ConstraintSet_android_transformPivotY) {
                    this.f5579G0 = obtainStyledAttributes.getFloat(index, this.f5579G0);
                } else if (index == AbstractC1298f.ConstraintSet_android_translationX) {
                    this.f5580H0 = obtainStyledAttributes.getFloat(index, this.f5580H0);
                } else if (index == AbstractC1298f.ConstraintSet_android_translationY) {
                    this.f5581I0 = obtainStyledAttributes.getFloat(index, this.f5581I0);
                } else if (index == AbstractC1298f.ConstraintSet_android_translationZ) {
                    this.f5582J0 = obtainStyledAttributes.getFloat(index, this.f5582J0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6395c(attributeSet);
        super.setVisibility(8);
    }

    /* renamed from: c */
    private void m6395c(AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public C1295c getConstraintSet() {
        if (this.f5572p == null) {
            this.f5572p = new C1295c();
        }
        this.f5572p.m6458r(this);
        return this.f5572p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m6395c(attributeSet);
        super.setVisibility(8);
    }
}
