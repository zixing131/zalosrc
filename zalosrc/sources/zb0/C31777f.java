package zb0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import fn0.AbstractC19074t;
import kotlinx.coroutines.flow.StateFlow;
import p205hc.C19964c;
import p348mi.AbstractC23306f;
import zb0.AbstractC31776e;

/* renamed from: zb0.f */
/* loaded from: classes6.dex */
public final class C31777f extends AbstractC1796t0 {

    /* renamed from: s */
    private final C1761c0 f145911s = new C1761c0();

    /* renamed from: t */
    private final C1761c0 f145912t = new C1761c0(new C19964c(AbstractC31776e.a.f145909a));

    /* renamed from: u */
    private final StateFlow f145913u = ZaloCloudRecoverCloudMediaWorker.Companion.m90201h();

    /* renamed from: R */
    public static /* synthetic */ void m152799R(C31777f c31777f, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c31777f.m152804Q(z11);
    }

    /* renamed from: M */
    public final LiveData m152800M() {
        return this.f145912t;
    }

    /* renamed from: N */
    public final LiveData m152801N() {
        return this.f145911s;
    }

    /* renamed from: O */
    public final StateFlow m152802O() {
        return this.f145913u;
    }

    /* renamed from: P */
    public final void m152803P(ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f) {
        AbstractC19074t.m100208f(abstractC16884f, "state");
        this.f145912t.mo9221n(new C19964c(new AbstractC31776e.b(abstractC16884f)));
    }

    /* renamed from: Q */
    public final void m152804Q(boolean z11) {
        if (z11) {
            AbstractC23306f.m120627V1().m90254y();
        } else {
            AbstractC23306f.m120627V1().m90218A();
        }
    }
}
