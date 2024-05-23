package p260j9;

import nm0.AbstractC23885b;
import nm0.C23884a;
import om0.InterfaceC24312a;
import p233i9.C20432e;
import p233i9.C20434g;
import p293k9.C21598a;
import p293k9.C21599b;
import p293k9.C21600c;
import p293k9.C21601d;
import p293k9.C21602e;
import p293k9.C21603f;
import p293k9.C21604g;
import p293k9.C21605h;

/* renamed from: j9.a */
/* loaded from: classes3.dex */
public final class C21097a implements InterfaceC21098b {

    /* renamed from: a */
    private InterfaceC24312a f103133a;

    /* renamed from: b */
    private InterfaceC24312a f103134b;

    /* renamed from: c */
    private InterfaceC24312a f103135c;

    /* renamed from: d */
    private InterfaceC24312a f103136d;

    /* renamed from: e */
    private InterfaceC24312a f103137e;

    /* renamed from: f */
    private InterfaceC24312a f103138f;

    /* renamed from: g */
    private InterfaceC24312a f103139g;

    /* renamed from: h */
    private InterfaceC24312a f103140h;

    /* renamed from: j9.a$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private C21598a f103141a;

        /* renamed from: a */
        public InterfaceC21098b m109628a() {
            AbstractC23885b.m124956a(this.f103141a, C21598a.class);
            return new C21097a(this.f103141a);
        }

        /* renamed from: b */
        public b m109629b(C21598a c21598a) {
            this.f103141a = (C21598a) AbstractC23885b.m124957b(c21598a);
            return this;
        }

        private b() {
        }
    }

    /* renamed from: b */
    public static b m109625b() {
        return new b();
    }

    /* renamed from: c */
    private void m109626c(C21598a c21598a) {
        this.f103133a = C21600c.m111529a(c21598a);
        this.f103134b = C21602e.m111535a(c21598a);
        this.f103135c = C21601d.m111532a(c21598a);
        this.f103136d = C21605h.m111544a(c21598a);
        this.f103137e = C21603f.m111538a(c21598a);
        this.f103138f = C21599b.m111526a(c21598a);
        C21604g m111541a = C21604g.m111541a(c21598a);
        this.f103139g = m111541a;
        this.f103140h = C23884a.m124954a(C20434g.m106439a(this.f103133a, this.f103134b, this.f103135c, this.f103136d, this.f103137e, this.f103138f, m111541a));
    }

    @Override // p260j9.InterfaceC21098b
    /* renamed from: a */
    public C20432e mo109627a() {
        return (C20432e) this.f103140h.get();
    }

    private C21097a(C21598a c21598a) {
        m109626c(c21598a);
    }
}
