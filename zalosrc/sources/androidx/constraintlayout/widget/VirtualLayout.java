package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p045c1.AbstractC3194m;

/* loaded from: classes2.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: y */
    private boolean f5593y;

    /* renamed from: z */
    private boolean f5594z;

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: i */
    public void mo5941i(ConstraintLayout constraintLayout) {
        m6364h(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: n */
    public void mo5935n(AttributeSet attributeSet) {
        super.mo5935n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.ConstraintLayout_Layout_android_visibility) {
                    this.f5593y = true;
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_android_elevation) {
                    this.f5594z = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5593y || this.f5594z) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i11 = 0; i11 < this.f5455q; i11++) {
                    View m6382l = constraintLayout.m6382l(this.f5454p[i11]);
                    if (m6382l != null) {
                        if (this.f5593y) {
                            m6382l.setVisibility(visibility);
                        }
                        if (this.f5594z && elevation > 0.0f) {
                            m6382l.setTranslationZ(m6382l.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        m6363g();
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        m6363g();
    }

    /* renamed from: y */
    public void mo5938y(AbstractC3194m abstractC3194m, int i11, int i12) {
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
