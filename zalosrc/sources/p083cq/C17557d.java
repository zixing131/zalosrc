package p083cq;

import aq.C2288h;
import bg0.C2797c;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import is.AbstractC20833z;
import p185gc.AbstractC19381e;
import pm0.C24848g0;

/* renamed from: cq.d */
/* loaded from: classes4.dex */
public final class C17557d extends AbstractC19381e {

    /* renamed from: a */
    private final C2288h f89444a;

    /* renamed from: b */
    private final C2797c f89445b;

    public C17557d(C2288h c2288h, C2797c c2797c) {
        AbstractC19074t.m100208f(c2288h, "repository");
        AbstractC19074t.m100208f(c2797c, "serialTaskDispatcher");
        this.f89444a = c2288h;
        this.f89445b = c2797c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m93501e(C17557d c17557d) {
        AbstractC19074t.m100208f(c17557d, "this$0");
        C2288h c2288h = c17557d.f89444a;
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        c2288h.mo12060d(str);
        c17557d.f89444a.mo12061e(false);
        AbstractC20833z.m108894I();
    }

    @Override // p185gc.AbstractC19381e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo93498b() {
        m93502d();
        return C24848g0.f119245a;
    }

    /* renamed from: d */
    protected void m93502d() {
        this.f89445b.mo13474a(new Runnable() { // from class: cq.c
            @Override // java.lang.Runnable
            public final void run() {
                C17557d.m93501e(C17557d.this);
            }
        });
    }
}
