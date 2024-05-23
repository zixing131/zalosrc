package if0;

import com.zing.zalo.p062db.C7956b;
import dj.C17945a0;
import dj.C17964g1;
import dj.C17969i0;
import fn0.AbstractC19074t;
import hm0.C20096c;
import rd0.AbstractC25751q;
import rd0.C25741g;
import sd0.C26232a;

/* renamed from: if0.e */
/* loaded from: classes5.dex */
public final class C20532e implements InterfaceC20546s {

    /* renamed from: a */
    private final C17945a0 f100860a;

    public C20532e(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        this.f100860a = c17945a0;
    }

    @Override // if0.InterfaceC20546s
    /* renamed from: a */
    public String mo106683a(C20545r c20545r, AbstractC25751q abstractC25751q) {
        AbstractC19074t.m100208f(c20545r, "content");
        AbstractC19074t.m100208f(abstractC25751q, "response");
        C26232a.m134877a().m134881d(c20545r.m106759j(), c20545r.m106758i().m126452c(), c20545r.m106757h());
        if (c20545r.m106763n()) {
            C17969i0 m94929K2 = this.f100860a.m94929K2();
            if ((abstractC25751q instanceof C25741g) && (m94929K2 instanceof C17964g1)) {
                C25741g c25741g = (C25741g) abstractC25751q;
                ((C17964g1) m94929K2).m95524E(c25741g.m132865b());
                C7956b.Companion.m41573b().m41564w0(this.f100860a);
                return c25741g.m132865b();
            }
            return "";
        }
        this.f100860a.m94855B5(abstractC25751q);
        return C20534g.f100864a.m106692f(this.f100860a, false);
    }

    @Override // if0.InterfaceC20546s
    /* renamed from: b */
    public void mo106684b(C20545r c20545r, C20096c c20096c) {
        AbstractC19074t.m100208f(c20545r, "content");
        C26232a.m134877a().m134880c(c20545r.m106759j(), c20545r.m106758i().m126452c(), c20545r.m106757h());
    }

    @Override // if0.InterfaceC20546s
    /* renamed from: c */
    public void mo106685c(C20545r c20545r) {
        AbstractC19074t.m100208f(c20545r, "content");
        C26232a.m134877a().m134879b(c20545r.m106759j(), c20545r.m106758i().m126452c(), c20545r.m106757h());
    }
}
