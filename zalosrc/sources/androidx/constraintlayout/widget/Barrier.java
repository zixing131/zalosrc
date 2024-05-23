package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.C1295c;
import androidx.constraintlayout.widget.ConstraintLayout;
import p045c1.C3182a;
import p045c1.C3186e;
import p045c1.C3187f;
import p045c1.C3191j;

/* loaded from: classes2.dex */
public class Barrier extends ConstraintHelper {

    /* renamed from: A */
    private C3182a f5451A;

    /* renamed from: y */
    private int f5452y;

    /* renamed from: z */
    private int f5453z;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: y */
    private void m6356y(C3186e c3186e, int i11, boolean z11) {
        this.f5453z = i11;
        if (z11) {
            int i12 = this.f5452y;
            if (i12 == 5) {
                this.f5453z = 1;
            } else if (i12 == 6) {
                this.f5453z = 0;
            }
        } else {
            int i13 = this.f5452y;
            if (i13 == 5) {
                this.f5453z = 0;
            } else if (i13 == 6) {
                this.f5453z = 1;
            }
        }
        if (c3186e instanceof C3182a) {
            ((C3182a) c3186e).m15982D1(this.f5453z);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f5451A.m15990x1();
    }

    public int getMargin() {
        return this.f5451A.m15992z1();
    }

    public int getType() {
        return this.f5452y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: n */
    public void mo5935n(AttributeSet attributeSet) {
        super.mo5935n(attributeSet);
        this.f5451A = new C3182a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f5451A.m15981C1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_barrierMargin) {
                    this.f5451A.m15983E1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f5457s = this.f5451A;
        m6368x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: p */
    public void mo5936p(C1295c.a aVar, C3191j c3191j, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
        super.mo5936p(aVar, c3191j, layoutParams, sparseArray);
        if (c3191j instanceof C3182a) {
            C3182a c3182a = (C3182a) c3191j;
            m6356y(c3182a, aVar.f5643e.f5701h0, ((C3187f) c3191j.m16048M()).m16155S1());
            c3182a.m15981C1(aVar.f5643e.f5717p0);
            c3182a.m15983E1(aVar.f5643e.f5703i0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: q */
    public void mo5937q(C3186e c3186e, boolean z11) {
        m6356y(c3186e, this.f5452y, z11);
    }

    public void setAllowsGoneWidget(boolean z11) {
        this.f5451A.m15981C1(z11);
    }

    public void setDpMargin(int i11) {
        this.f5451A.m15983E1((int) ((i11 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i11) {
        this.f5451A.m15983E1(i11);
    }

    public void setType(int i11) {
        this.f5452y = i11;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        super.setVisibility(8);
    }
}
