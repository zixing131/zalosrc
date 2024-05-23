package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.AbstractC1298f;
import androidx.constraintlayout.widget.C1295c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import p045c1.AbstractC3194m;
import p045c1.C3186e;
import p045c1.C3188g;
import p045c1.C3191j;

/* loaded from: classes2.dex */
public class Flow extends VirtualLayout {

    /* renamed from: A */
    private C3188g f4902A;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: n */
    public void mo5935n(AttributeSet attributeSet) {
        super.mo5935n(attributeSet);
        this.f4902A = new C3188g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.ConstraintLayout_Layout_android_orientation) {
                    this.f4902A.m16202G2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_android_padding) {
                    this.f4902A.m16252L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_android_paddingStart) {
                    this.f4902A.m16257Q1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f4902A.m16254N1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f4902A.m16255O1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_android_paddingTop) {
                    this.f4902A.m16258R1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_android_paddingRight) {
                    this.f4902A.m16256P1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f4902A.m16253M1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f4902A.m16207L2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f4902A.m16195A2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f4902A.m16206K2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f4902A.m16209u2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f4902A.m16197C2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f4902A.m16211w2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f4902A.m16199E2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f4902A.m16213y2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f4902A.m16208t2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f4902A.m16196B2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f4902A.m16210v2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f4902A.m16198D2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f4902A.m16204I2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f4902A.m16212x2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f4902A.m16203H2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f4902A.m16214z2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f4902A.m16205J2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f4902A.m16201F2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f5457s = this.f4902A;
        m6368x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onMeasure(int i11, int i12) {
        mo5938y(this.f4902A, i11, i12);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: p */
    public void mo5936p(C1295c.a aVar, C3191j c3191j, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
        super.mo5936p(aVar, c3191j, layoutParams, sparseArray);
        if (c3191j instanceof C3188g) {
            C3188g c3188g = (C3188g) c3191j;
            int i11 = layoutParams.f5512Z;
            if (i11 != -1) {
                c3188g.m16202G2(i11);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: q */
    public void mo5937q(C3186e c3186e, boolean z11) {
        this.f4902A.m16259w1(z11);
    }

    public void setFirstHorizontalBias(float f11) {
        this.f4902A.m16208t2(f11);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i11) {
        this.f4902A.m16209u2(i11);
        requestLayout();
    }

    public void setFirstVerticalBias(float f11) {
        this.f4902A.m16210v2(f11);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i11) {
        this.f4902A.m16211w2(i11);
        requestLayout();
    }

    public void setHorizontalAlign(int i11) {
        this.f4902A.m16212x2(i11);
        requestLayout();
    }

    public void setHorizontalBias(float f11) {
        this.f4902A.m16213y2(f11);
        requestLayout();
    }

    public void setHorizontalGap(int i11) {
        this.f4902A.m16214z2(i11);
        requestLayout();
    }

    public void setHorizontalStyle(int i11) {
        this.f4902A.m16195A2(i11);
        requestLayout();
    }

    public void setLastHorizontalBias(float f11) {
        this.f4902A.m16196B2(f11);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i11) {
        this.f4902A.m16197C2(i11);
        requestLayout();
    }

    public void setLastVerticalBias(float f11) {
        this.f4902A.m16198D2(f11);
        requestLayout();
    }

    public void setLastVerticalStyle(int i11) {
        this.f4902A.m16199E2(i11);
        requestLayout();
    }

    public void setMaxElementsWrap(int i11) {
        this.f4902A.m16201F2(i11);
        requestLayout();
    }

    public void setOrientation(int i11) {
        this.f4902A.m16202G2(i11);
        requestLayout();
    }

    public void setPadding(int i11) {
        this.f4902A.m16252L1(i11);
        requestLayout();
    }

    public void setPaddingBottom(int i11) {
        this.f4902A.m16253M1(i11);
        requestLayout();
    }

    public void setPaddingLeft(int i11) {
        this.f4902A.m16255O1(i11);
        requestLayout();
    }

    public void setPaddingRight(int i11) {
        this.f4902A.m16256P1(i11);
        requestLayout();
    }

    public void setPaddingTop(int i11) {
        this.f4902A.m16258R1(i11);
        requestLayout();
    }

    public void setVerticalAlign(int i11) {
        this.f4902A.m16203H2(i11);
        requestLayout();
    }

    public void setVerticalBias(float f11) {
        this.f4902A.m16204I2(f11);
        requestLayout();
    }

    public void setVerticalGap(int i11) {
        this.f4902A.m16205J2(i11);
        requestLayout();
    }

    public void setVerticalStyle(int i11) {
        this.f4902A.m16206K2(i11);
        requestLayout();
    }

    public void setWrapMode(int i11) {
        this.f4902A.m16207L2(i11);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    /* renamed from: y */
    public void mo5938y(AbstractC3194m abstractC3194m, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (abstractC3194m != null) {
            abstractC3194m.mo16200F1(mode, size, mode2, size2);
            setMeasuredDimension(abstractC3194m.m16242A1(), abstractC3194m.m16262z1());
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public Flow(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
