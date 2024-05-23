package kc0;

import androidx.lifecycle.AbstractC1796t0;
import dg0.AbstractC17930e;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p348mi.AbstractC23306f;
import pm0.C24848g0;
import sl.C26318c;
import zg0.C31831a;

/* renamed from: kc0.v */
/* loaded from: classes6.dex */
public final class C21683v extends AbstractC1796t0 {

    /* renamed from: s */
    private final C31831a f105238s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kc0.v$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f105239q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m111818a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m111818a() {
            AbstractC23306f.m120663f2().m90146q();
        }
    }

    public C21683v(C31831a c31831a) {
        AbstractC19074t.m100208f(c31831a, "zaloCloudSettings");
        this.f105238s = c31831a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m111815P(boolean z11, C21683v c21683v) {
        AbstractC19074t.m100208f(c21683v, "this$0");
        if (z11 == c21683v.m111816N()) {
            return;
        }
        c21683v.f105238s.m152938w(new C26318c(0, 0, 0, z11 ? 1 : 0, 7, null), a.f105239q);
    }

    /* renamed from: N */
    public final boolean m111816N() {
        return this.f105238s.m152934m();
    }

    /* renamed from: O */
    public final void m111817O(final boolean z11) {
        AbstractC17930e.Companion.m94551d().mo94530d("UPDATE_CLOUD_SETTINGS_OFFLOAD", new Runnable() { // from class: kc0.u
            @Override // java.lang.Runnable
            public final void run() {
                C21683v.m111815P(z11, this);
            }
        }, 3000L);
    }
}
