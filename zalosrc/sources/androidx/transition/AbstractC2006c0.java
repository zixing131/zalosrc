package androidx.transition;

import android.view.View;

/* renamed from: androidx.transition.c0 */
/* loaded from: classes2.dex */
abstract class AbstractC2006c0 extends AbstractC2016h0 {

    /* renamed from: e */
    private static boolean f8547e = true;

    @Override // androidx.transition.AbstractC2016h0
    /* renamed from: a */
    public void mo10983a(View view) {
    }

    @Override // androidx.transition.AbstractC2016h0
    /* renamed from: c */
    public float mo10984c(View view) {
        float transitionAlpha;
        if (f8547e) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f8547e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.AbstractC2016h0
    /* renamed from: d */
    public void mo10985d(View view) {
    }

    @Override // androidx.transition.AbstractC2016h0
    /* renamed from: g */
    public void mo10986g(View view, float f11) {
        if (f8547e) {
            try {
                view.setTransitionAlpha(f11);
                return;
            } catch (NoSuchMethodError unused) {
                f8547e = false;
            }
        }
        view.setAlpha(f11);
    }
}
