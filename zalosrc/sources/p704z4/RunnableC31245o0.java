package p704z4;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: z4.o0 */
/* loaded from: classes2.dex */
final class RunnableC31245o0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ LifecycleCallback f144261p;

    /* renamed from: q */
    final /* synthetic */ String f144262q;

    /* renamed from: r */
    final /* synthetic */ C31247p0 f144263r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC31245o0(C31247p0 c31247p0, LifecycleCallback lifecycleCallback, String str) {
        this.f144263r = c31247p0;
        this.f144261p = lifecycleCallback;
        this.f144262q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        C31247p0 c31247p0 = this.f144263r;
        i11 = c31247p0.f144266o0;
        if (i11 > 0) {
            LifecycleCallback lifecycleCallback = this.f144261p;
            bundle = c31247p0.f144267p0;
            if (bundle != null) {
                bundle3 = c31247p0.f144267p0;
                bundle2 = bundle3.getBundle(this.f144262q);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo19292f(bundle2);
        }
        i12 = this.f144263r.f144266o0;
        if (i12 >= 2) {
            this.f144261p.mo19296j();
        }
        i13 = this.f144263r.f144266o0;
        if (i13 >= 3) {
            this.f144261p.mo19294h();
        }
        i14 = this.f144263r.f144266o0;
        if (i14 >= 4) {
            this.f144261p.mo19297k();
        }
        i15 = this.f144263r.f144266o0;
        if (i15 >= 5) {
            this.f144261p.m19293g();
        }
    }
}
