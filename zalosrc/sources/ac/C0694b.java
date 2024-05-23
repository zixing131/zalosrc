package ac;

import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;

/* renamed from: ac.b */
/* loaded from: classes3.dex */
public final class C0694b extends AbstractC0704g implements C16719g.c {

    /* renamed from: q */
    private final C16719g f2272q;

    /* renamed from: r */
    private final String f2273r;

    /* renamed from: s */
    private C16719g.c f2274s;

    public C0694b(C16719g c16719g, String str) {
        AbstractC19074t.m100208f(c16719g, "module");
        AbstractC19074t.m100208f(str, "moduleName");
        this.f2272q = c16719g;
        this.f2273r = str;
    }

    @Override // ac.AbstractC0704g
    /* renamed from: b */
    public void mo1014b() {
        this.f2272q.mo89109M0(this);
    }

    @Override // ac.AbstractC0704g
    /* renamed from: c */
    public void mo1015c(Object obj) {
        if (obj instanceof C16719g.c) {
            this.f2274s = (C16719g.c) obj;
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g.c
    /* renamed from: y */
    public void mo929y(C16719g c16719g) {
        C16719g.c cVar = this.f2274s;
        if (cVar != null) {
            cVar.mo929y(c16719g);
        }
        C0717m0.Companion.m1125a().m1122o(this.f2273r, m1063a());
    }
}
