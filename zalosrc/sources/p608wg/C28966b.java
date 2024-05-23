package p608wg;

import android.os.Bundle;
import com.zing.zalo.p077ui.zviews.BroadcastMsgToFriendsView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import p542ub.InterfaceC27218a;
import p608wg.InterfaceC28970f;

/* renamed from: wg.b */
/* loaded from: classes3.dex */
public final class C28966b implements InterfaceC28970f {

    /* renamed from: a */
    private final InterfaceC27218a f134069a;

    /* renamed from: b */
    private final Bundle f134070b;

    public C28966b(InterfaceC27218a interfaceC27218a, Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "bundle");
        this.f134069a = interfaceC27218a;
        this.f134070b = bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m144664c(C28966b c28966b) {
        AbstractC19074t.m100208f(c28966b, "this$0");
        c28966b.f134070b.putBoolean("bAddFavoriteGrid", true);
        c28966b.f134069a.mo35579p().m93069k2(BroadcastMsgToFriendsView.class, c28966b.f134070b, 1, true);
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: a */
    public String mo2446a(String str) {
        return InterfaceC28970f.a.m144682b(this, str);
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: d */
    public void mo2447d() {
        if (this.f134069a != null) {
            AbstractC19444a.m101697e(new Runnable() { // from class: wg.a
                @Override // java.lang.Runnable
                public final void run() {
                    C28966b.m144664c(C28966b.this);
                }
            });
        }
    }

    public /* synthetic */ C28966b(InterfaceC27218a interfaceC27218a, Bundle bundle, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC27218a, (i11 & 2) != 0 ? new Bundle() : bundle);
    }
}
