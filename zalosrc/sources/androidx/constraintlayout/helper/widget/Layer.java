package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.AbstractC1298f;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import p045c1.C3186e;

/* loaded from: classes2.dex */
public class Layer extends ConstraintHelper {

    /* renamed from: A */
    private float f4903A;

    /* renamed from: B */
    ConstraintLayout f4904B;

    /* renamed from: C */
    private float f4905C;

    /* renamed from: D */
    private float f4906D;

    /* renamed from: E */
    protected float f4907E;

    /* renamed from: F */
    protected float f4908F;

    /* renamed from: G */
    protected float f4909G;

    /* renamed from: H */
    protected float f4910H;

    /* renamed from: I */
    protected float f4911I;

    /* renamed from: J */
    protected float f4912J;

    /* renamed from: K */
    boolean f4913K;

    /* renamed from: L */
    View[] f4914L;

    /* renamed from: M */
    private float f4915M;

    /* renamed from: N */
    private float f4916N;

    /* renamed from: O */
    private boolean f4917O;

    /* renamed from: P */
    private boolean f4918P;

    /* renamed from: y */
    private float f4919y;

    /* renamed from: z */
    private float f4920z;

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4919y = Float.NaN;
        this.f4920z = Float.NaN;
        this.f4903A = Float.NaN;
        this.f4905C = 1.0f;
        this.f4906D = 1.0f;
        this.f4907E = Float.NaN;
        this.f4908F = Float.NaN;
        this.f4909G = Float.NaN;
        this.f4910H = Float.NaN;
        this.f4911I = Float.NaN;
        this.f4912J = Float.NaN;
        this.f4913K = true;
        this.f4914L = null;
        this.f4915M = 0.0f;
        this.f4916N = 0.0f;
    }

    /* renamed from: A */
    private void m5939A() {
        double radians;
        if (this.f4904B == null) {
            return;
        }
        if (this.f4914L == null) {
            m5940z();
        }
        m5944y();
        if (Float.isNaN(this.f4903A)) {
            radians = 0.0d;
        } else {
            radians = Math.toRadians(this.f4903A);
        }
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f11 = this.f4905C;
        float f12 = f11 * cos;
        float f13 = this.f4906D;
        float f14 = (-f13) * sin;
        float f15 = f11 * sin;
        float f16 = f13 * cos;
        for (int i11 = 0; i11 < this.f5455q; i11++) {
            View view = this.f4914L[i11];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f17 = left - this.f4907E;
            float f18 = top - this.f4908F;
            float f19 = (((f12 * f17) + (f14 * f18)) - f17) + this.f4915M;
            float f21 = (((f17 * f15) + (f16 * f18)) - f18) + this.f4916N;
            view.setTranslationX(f19);
            view.setTranslationY(f21);
            view.setScaleY(this.f4906D);
            view.setScaleX(this.f4905C);
            if (!Float.isNaN(this.f4903A)) {
                view.setRotation(this.f4903A);
            }
        }
    }

    /* renamed from: z */
    private void m5940z() {
        int i11;
        if (this.f4904B == null || (i11 = this.f5455q) == 0) {
            return;
        }
        View[] viewArr = this.f4914L;
        if (viewArr == null || viewArr.length != i11) {
            this.f4914L = new View[i11];
        }
        for (int i12 = 0; i12 < this.f5455q; i12++) {
            this.f4914L[i12] = this.f4904B.m6382l(this.f5454p[i12]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: i */
    public void mo5941i(ConstraintLayout constraintLayout) {
        m6364h(constraintLayout);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: n */
    public void mo5935n(AttributeSet attributeSet) {
        super.mo5935n(attributeSet);
        this.f5458t = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.ConstraintLayout_Layout_android_visibility) {
                    this.f4917O = true;
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_android_elevation) {
                    this.f4918P = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4904B = (ConstraintLayout) getParent();
        if (this.f4917O || this.f4918P) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i11 = 0; i11 < this.f5455q; i11++) {
                View m6382l = this.f4904B.m6382l(this.f5454p[i11]);
                if (m6382l != null) {
                    if (this.f4917O) {
                        m6382l.setVisibility(visibility);
                    }
                    if (this.f4918P && elevation > 0.0f) {
                        m6382l.setTranslationZ(m6382l.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: r */
    public void mo5942r(ConstraintLayout constraintLayout) {
        m5940z();
        this.f4907E = Float.NaN;
        this.f4908F = Float.NaN;
        C3186e m6389b = ((ConstraintLayout.LayoutParams) getLayoutParams()).m6389b();
        m6389b.m16106n1(0);
        m6389b.m16053O0(0);
        m5944y();
        layout(((int) this.f4911I) - getPaddingLeft(), ((int) this.f4912J) - getPaddingTop(), ((int) this.f4909G) + getPaddingRight(), ((int) this.f4910H) + getPaddingBottom());
        m5939A();
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        m6363g();
    }

    @Override // android.view.View
    public void setPivotX(float f11) {
        this.f4919y = f11;
        m5939A();
    }

    @Override // android.view.View
    public void setPivotY(float f11) {
        this.f4920z = f11;
        m5939A();
    }

    @Override // android.view.View
    public void setRotation(float f11) {
        this.f4903A = f11;
        m5939A();
    }

    @Override // android.view.View
    public void setScaleX(float f11) {
        this.f4905C = f11;
        m5939A();
    }

    @Override // android.view.View
    public void setScaleY(float f11) {
        this.f4906D = f11;
        m5939A();
    }

    @Override // android.view.View
    public void setTranslationX(float f11) {
        this.f4915M = f11;
        m5939A();
    }

    @Override // android.view.View
    public void setTranslationY(float f11) {
        this.f4916N = f11;
        m5939A();
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        m6363g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: u */
    public void mo5943u(ConstraintLayout constraintLayout) {
        this.f4904B = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (!Float.isNaN(this.f4903A)) {
                this.f4903A = rotation;
                return;
            }
            return;
        }
        this.f4903A = rotation;
    }

    /* renamed from: y */
    protected void m5944y() {
        if (this.f4904B == null) {
            return;
        }
        if (!this.f4913K && !Float.isNaN(this.f4907E) && !Float.isNaN(this.f4908F)) {
            return;
        }
        if (!Float.isNaN(this.f4919y) && !Float.isNaN(this.f4920z)) {
            this.f4908F = this.f4920z;
            this.f4907E = this.f4919y;
            return;
        }
        View[] m6365m = m6365m(this.f4904B);
        int left = m6365m[0].getLeft();
        int top = m6365m[0].getTop();
        int right = m6365m[0].getRight();
        int bottom = m6365m[0].getBottom();
        for (int i11 = 0; i11 < this.f5455q; i11++) {
            View view = m6365m[i11];
            left = Math.min(left, view.getLeft());
            top = Math.min(top, view.getTop());
            right = Math.max(right, view.getRight());
            bottom = Math.max(bottom, view.getBottom());
        }
        this.f4909G = right;
        this.f4910H = bottom;
        this.f4911I = left;
        this.f4912J = top;
        if (Float.isNaN(this.f4919y)) {
            this.f4907E = (left + right) / 2;
        } else {
            this.f4907E = this.f4919y;
        }
        if (Float.isNaN(this.f4920z)) {
            this.f4908F = (top + bottom) / 2;
        } else {
            this.f4908F = this.f4920z;
        }
    }

    public Layer(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4919y = Float.NaN;
        this.f4920z = Float.NaN;
        this.f4903A = Float.NaN;
        this.f4905C = 1.0f;
        this.f4906D = 1.0f;
        this.f4907E = Float.NaN;
        this.f4908F = Float.NaN;
        this.f4909G = Float.NaN;
        this.f4910H = Float.NaN;
        this.f4911I = Float.NaN;
        this.f4912J = Float.NaN;
        this.f4913K = true;
        this.f4914L = null;
        this.f4915M = 0.0f;
        this.f4916N = 0.0f;
    }
}
