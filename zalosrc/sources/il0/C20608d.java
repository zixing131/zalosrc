package il0;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import ik0.C20600w;
import wk0.InterfaceRunnableC29084d;

/* renamed from: il0.d */
/* loaded from: classes7.dex */
public final class C20608d extends C20600w.d implements InterfaceRunnableC29084d {

    /* renamed from: q */
    private final Runnable f101350q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20608d(int i11, Runnable runnable) {
        super(i11);
        AbstractC19074t.m100208f(runnable, "block");
        this.f101350q = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f101350q.run();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
