package p680yg;

import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import p542ub.InterfaceC27218a;
import p608wg.InterfaceC28970f;
import v00.C27419n;

/* renamed from: yg.j */
/* loaded from: classes3.dex */
public final class C30971j implements InterfaceC28970f {

    /* renamed from: a */
    private final InterfaceC27218a f142906a;

    /* renamed from: b */
    private final String f142907b;

    /* renamed from: c */
    private final C27419n f142908c;

    public C30971j(InterfaceC27218a interfaceC27218a, String str, C27419n c27419n) {
        AbstractC19074t.m100208f(c27419n, "zChannelNavigation");
        this.f142906a = interfaceC27218a;
        this.f142907b = str;
        this.f142908c = c27419n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m150587c(C30971j c30971j) {
        AbstractC19074t.m100208f(c30971j, "this$0");
        InterfaceC27218a interfaceC27218a = c30971j.f142906a;
        if (interfaceC27218a != null) {
            C27419n c27419n = c30971j.f142908c;
            C17487o0 mo35579p = interfaceC27218a.mo35579p();
            AbstractC19074t.m100207e(mo35579p, "getZaloViewManager(...)");
            c27419n.m140418e(mo35579p, c30971j.f142907b);
        }
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: a */
    public String mo2446a(String str) {
        return InterfaceC28970f.a.m144682b(this, str);
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: d */
    public void mo2447d() {
        AbstractC19444a.m101697e(new Runnable() { // from class: yg.i
            @Override // java.lang.Runnable
            public final void run() {
                C30971j.m150587c(C30971j.this);
            }
        });
    }
}
