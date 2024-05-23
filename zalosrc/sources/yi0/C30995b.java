package yi0;

import com.android.billingclient.api.AbstractC3894e;
import com.android.billingclient.api.C3906h;
import com.android.billingclient.api.C3918k;
import com.android.billingclient.api.C3928n;
import com.android.billingclient.api.InterfaceC3910i;
import fn0.AbstractC19074t;
import lj0.C22501b;

/* renamed from: yi0.b */
/* loaded from: classes7.dex */
public final class C30995b {

    /* renamed from: a */
    private final AbstractC3894e f142970a;

    /* renamed from: b */
    private final C22501b f142971b;

    public C30995b(AbstractC3894e abstractC3894e, C22501b c22501b) {
        AbstractC19074t.m100208f(abstractC3894e, "billingClient");
        AbstractC19074t.m100208f(c22501b, "logger");
        this.f142970a = abstractC3894e;
        this.f142971b = c22501b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m150655c(C30995b c30995b, C3918k c3918k, C3906h c3906h) {
        String str;
        AbstractC19074t.m100208f(c30995b, "this$0");
        AbstractC19074t.m100208f(c3918k, "billingResult");
        C22501b c22501b = c30995b.f142971b;
        if (c3906h != null) {
            str = c3906h.m18594a();
        } else {
            str = null;
        }
        c22501b.m116346x(true, "BillingResult: " + c3918k + ", BillingConfig-CountryCode: " + str, new Object[0]);
    }

    /* renamed from: b */
    public final void m150656b() {
        if (this.f142970a.mo18533e() != 2) {
            return;
        }
        this.f142970a.mo18532d(C3928n.m18662a().m18663a(), new InterfaceC3910i() { // from class: yi0.a
            @Override // com.android.billingclient.api.InterfaceC3910i
            /* renamed from: a */
            public final void mo18599a(C3918k c3918k, C3906h c3906h) {
                C30995b.m150655c(C30995b.this, c3918k, c3906h);
            }
        });
    }
}
