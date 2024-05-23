package vn0;

import fn0.AbstractC19074t;
import un0.AbstractC27323a;

/* renamed from: vn0.v */
/* loaded from: classes7.dex */
public final class C28348v extends C28330m {

    /* renamed from: c */
    private final AbstractC27323a f132110c;

    /* renamed from: d */
    private int f132111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28348v(InterfaceC28337p0 interfaceC28337p0, AbstractC27323a abstractC27323a) {
        super(interfaceC28337p0);
        AbstractC19074t.m100208f(interfaceC28337p0, "writer");
        AbstractC19074t.m100208f(abstractC27323a, "json");
        this.f132110c = abstractC27323a;
    }

    @Override // vn0.C28330m
    /* renamed from: b */
    public void mo142733b() {
        m142745n(true);
        this.f132111d++;
    }

    @Override // vn0.C28330m
    /* renamed from: c */
    public void mo142734c() {
        m142745n(false);
        m142741j("\n");
        int i11 = this.f132111d;
        for (int i12 = 0; i12 < i11; i12++) {
            m142741j(this.f132110c.m139869f().m139893j());
        }
    }

    @Override // vn0.C28330m
    /* renamed from: o */
    public void mo142746o() {
        m142736e(' ');
    }

    @Override // vn0.C28330m
    /* renamed from: p */
    public void mo142747p() {
        this.f132111d--;
    }
}
