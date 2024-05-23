package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C1299g;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public class ReactiveGuide extends View implements C1299g.a {

    /* renamed from: p */
    private int f5589p;

    /* renamed from: q */
    private boolean f5590q;

    /* renamed from: r */
    private int f5591r;

    /* renamed from: s */
    private boolean f5592s;

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5589p = -1;
        this.f5590q = false;
        this.f5591r = 0;
        this.f5592s = true;
        super.setVisibility(8);
        m6401a(attributeSet);
    }

    /* renamed from: a */
    private void m6401a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f5589p = obtainStyledAttributes.getResourceId(index, this.f5589p);
                } else if (index == AbstractC1298f.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f5590q = obtainStyledAttributes.getBoolean(index, this.f5590q);
                } else if (index == AbstractC1298f.f5767x2694048c) {
                    this.f5591r = obtainStyledAttributes.getResourceId(index, this.f5591r);
                } else if (index == AbstractC1298f.f5766xfdeff96) {
                    this.f5592s = obtainStyledAttributes.getBoolean(index, this.f5592s);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f5589p != -1) {
            ConstraintLayout.getSharedValues().m6486a(this.f5589p, this);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f5591r;
    }

    public int getAttributeId() {
        return this.f5589p;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z11) {
        this.f5590q = z11;
    }

    public void setApplyToConstraintSetId(int i11) {
        this.f5591r = i11;
    }

    public void setAttributeId(int i11) {
        C1299g sharedValues = ConstraintLayout.getSharedValues();
        int i12 = this.f5589p;
        if (i12 != -1) {
            sharedValues.m6487b(i12, this);
        }
        this.f5589p = i11;
        if (i11 != -1) {
            sharedValues.m6486a(i11, this);
        }
    }

    public void setGuidelineBegin(int i11) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f5513a = i11;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i11) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f5515b = i11;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f11) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f5517c = f11;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f5589p = -1;
        this.f5590q = false;
        this.f5591r = 0;
        this.f5592s = true;
        super.setVisibility(8);
        m6401a(attributeSet);
    }
}
