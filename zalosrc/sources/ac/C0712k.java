package ac;

import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;

/* renamed from: ac.k */
/* loaded from: classes3.dex */
public final class C0712k extends AbstractC0704g implements C16719g.c {

    /* renamed from: q */
    private final C16719g f2344q;

    /* renamed from: r */
    private C16719g.c f2345r;

    public C0712k(C16719g c16719g) {
        AbstractC19074t.m100208f(c16719g, "module");
        this.f2344q = c16719g;
    }

    @Override // ac.AbstractC0704g
    /* renamed from: b */
    public void mo1014b() {
        this.f2344q.mo89109M0(this);
    }

    @Override // ac.AbstractC0704g
    /* renamed from: c */
    public void mo1015c(Object obj) {
        if (obj instanceof C16719g.c) {
            this.f2345r = (C16719g.c) obj;
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g.c
    /* renamed from: y */
    public void mo929y(C16719g c16719g) {
        C16719g.c cVar = this.f2345r;
        if (cVar != null) {
            cVar.mo929y(c16719g);
        }
    }
}
