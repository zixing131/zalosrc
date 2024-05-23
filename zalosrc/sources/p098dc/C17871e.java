package p098dc;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: dc.e */
/* loaded from: classes3.dex */
class C17871e implements InterfaceC17869c {

    /* renamed from: a */
    private TimeInterpolator f90317a;

    @Override // p098dc.InterfaceC17869c
    /* renamed from: a */
    public void mo94398a(View view) {
        if (this.f90317a == null) {
            this.f90317a = new ValueAnimator().getInterpolator();
        }
        view.animate().setInterpolator(this.f90317a);
    }
}
