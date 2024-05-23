package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import p045c1.AbstractC3194m;
import p045c1.C3187f;
import p045c1.C3193l;
import p045c1.InterfaceC3190i;

/* loaded from: classes2.dex */
public class MotionPlaceholder extends VirtualLayout {

    /* renamed from: A */
    C3193l f4929A;

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: n */
    public void mo5935n(AttributeSet attributeSet) {
        super.mo5935n(attributeSet);
        this.f5457s = new C3193l();
        m6368x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onMeasure(int i11, int i12) {
        mo5938y(this.f4929A, i11, i12);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: w */
    public void mo5948w(C3187f c3187f, InterfaceC3190i interfaceC3190i, SparseArray sparseArray) {
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

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
