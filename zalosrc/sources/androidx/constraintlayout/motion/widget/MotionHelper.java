package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.AbstractC1298f;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.InterfaceC1259j {

    /* renamed from: A */
    private float f4930A;

    /* renamed from: B */
    protected View[] f4931B;

    /* renamed from: y */
    private boolean f4932y;

    /* renamed from: z */
    private boolean f4933z;

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4932y = false;
        this.f4933z = false;
        mo5935n(attributeSet);
    }

    /* renamed from: A */
    public boolean m5949A() {
        return this.f4932y;
    }

    /* renamed from: B */
    public void m5950B(MotionLayout motionLayout) {
    }

    /* renamed from: C */
    public void m5951C(Canvas canvas) {
    }

    /* renamed from: D */
    public void m5952D(Canvas canvas) {
    }

    /* renamed from: E */
    public void mo5946E(MotionLayout motionLayout, HashMap hashMap) {
    }

    /* renamed from: F */
    public void m5953F(View view, float f11) {
    }

    /* renamed from: a */
    public void mo5930a(MotionLayout motionLayout, int i11, int i12, float f11) {
    }

    /* renamed from: b */
    public void mo5931b(MotionLayout motionLayout, int i11) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1259j
    /* renamed from: c */
    public void mo5954c(MotionLayout motionLayout, int i11, int i12) {
    }

    public float getProgress() {
        return this.f4930A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: n */
    public void mo5935n(AttributeSet attributeSet) {
        super.mo5935n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.MotionHelper_onShow) {
                    this.f4932y = obtainStyledAttributes.getBoolean(index, this.f4932y);
                } else if (index == AbstractC1298f.MotionHelper_onHide) {
                    this.f4933z = obtainStyledAttributes.getBoolean(index, this.f4933z);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f11) {
        this.f4930A = f11;
        int i11 = 0;
        if (this.f5455q > 0) {
            this.f4931B = m6365m((ConstraintLayout) getParent());
            while (i11 < this.f5455q) {
                m5953F(this.f4931B[i11], f11);
                i11++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i11 < childCount) {
            View childAt = viewGroup.getChildAt(i11);
            if (!(childAt instanceof MotionHelper)) {
                m5953F(childAt, f11);
            }
            i11++;
        }
    }

    /* renamed from: y */
    public boolean mo5947y() {
        return false;
    }

    /* renamed from: z */
    public boolean m5955z() {
        return this.f4933z;
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4932y = false;
        this.f4933z = false;
        mo5935n(attributeSet);
    }
}
