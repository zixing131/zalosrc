package androidx.transition;

import android.view.View;

/* renamed from: androidx.transition.e0 */
/* loaded from: classes2.dex */
class C2010e0 extends C2008d0 {

    /* renamed from: i */
    private static boolean f8565i = true;

    @Override // androidx.transition.AbstractC2016h0
    /* renamed from: f */
    public void mo10992f(View view, int i11, int i12, int i13, int i14) {
        if (f8565i) {
            try {
                view.setLeftTopRightBottom(i11, i12, i13, i14);
            } catch (NoSuchMethodError unused) {
                f8565i = false;
            }
        }
    }
}
