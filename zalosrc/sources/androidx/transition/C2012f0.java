package androidx.transition;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.transition.f0 */
/* loaded from: classes2.dex */
class C2012f0 extends C2010e0 {

    /* renamed from: j */
    private static boolean f8568j = true;

    @Override // androidx.transition.AbstractC2016h0
    /* renamed from: h */
    public void mo11000h(View view, int i11) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo11000h(view, i11);
        } else if (f8568j) {
            try {
                view.setTransitionVisibility(i11);
            } catch (NoSuchMethodError unused) {
                f8568j = false;
            }
        }
    }
}
