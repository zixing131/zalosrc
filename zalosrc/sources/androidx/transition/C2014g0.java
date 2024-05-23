package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: androidx.transition.g0 */
/* loaded from: classes2.dex */
class C2014g0 extends C2012f0 {
    @Override // androidx.transition.AbstractC2006c0, androidx.transition.AbstractC2016h0
    /* renamed from: c */
    public float mo10984c(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // androidx.transition.C2008d0, androidx.transition.AbstractC2016h0
    /* renamed from: e */
    public void mo10988e(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.C2010e0, androidx.transition.AbstractC2016h0
    /* renamed from: f */
    public void mo10992f(View view, int i11, int i12, int i13, int i14) {
        view.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    @Override // androidx.transition.AbstractC2006c0, androidx.transition.AbstractC2016h0
    /* renamed from: g */
    public void mo10986g(View view, float f11) {
        view.setTransitionAlpha(f11);
    }

    @Override // androidx.transition.C2012f0, androidx.transition.AbstractC2016h0
    /* renamed from: h */
    public void mo11000h(View view, int i11) {
        view.setTransitionVisibility(i11);
    }

    @Override // androidx.transition.C2008d0, androidx.transition.AbstractC2016h0
    /* renamed from: i */
    public void mo10989i(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.C2008d0, androidx.transition.AbstractC2016h0
    /* renamed from: j */
    public void mo10990j(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
