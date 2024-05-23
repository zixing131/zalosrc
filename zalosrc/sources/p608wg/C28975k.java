package p608wg;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import yf0.C30943h0;

/* renamed from: wg.k */
/* loaded from: classes3.dex */
public final class C28975k extends AbstractC28968d {
    public /* synthetic */ C28975k(InterfaceC27218a interfaceC27218a, InterfaceC25792a.c cVar, InterfaceC25792a.b bVar, String str, C30943h0 c30943h0, String str2, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC27218a, (i11 & 2) != 0 ? null : cVar, (i11 & 4) != 0 ? null : bVar, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : c30943h0, (i11 & 32) == 0 ? str2 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28975k(InterfaceC27218a interfaceC27218a, InterfaceC25792a.c cVar, InterfaceC25792a.b bVar, String str, C30943h0 c30943h0, String str2) {
        super("action.prompt.authentication", interfaceC27218a, cVar, bVar, str, str2);
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        m144675k(c30943h0);
    }
}
