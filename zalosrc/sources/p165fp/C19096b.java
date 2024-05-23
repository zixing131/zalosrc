package p165fp;

import bo.C3020p0;
import bo.C3023p3;
import bo.C3025q0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p138ep.C18535e;
import p165fp.C19095a;
import p165fp.C19098d;
import p185gc.AbstractC19383g;
import p398oo.C24371m0;

/* renamed from: fp.b */
/* loaded from: classes4.dex */
public final class C19096b extends AbstractC19383g {

    /* renamed from: a */
    private final C18535e f95043a;

    /* renamed from: b */
    private final C24371m0 f95044b;

    /* renamed from: c */
    private final C19095a f95045c;

    /* renamed from: fp.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f95046a;

        /* renamed from: b */
        private final C19098d.a f95047b;

        public a(String str, C19098d.a aVar) {
            AbstractC19074t.m100208f(str, "feedId");
            this.f95046a = str;
            this.f95047b = aVar;
        }

        /* renamed from: a */
        public final String m100303a() {
            return this.f95046a;
        }

        /* renamed from: b */
        public final C19098d.a m100304b() {
            return this.f95047b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f95046a, aVar.f95046a) && AbstractC19074t.m100204b(this.f95047b, aVar.f95047b);
        }

        public int hashCode() {
            int hashCode = this.f95046a.hashCode() * 31;
            C19098d.a aVar = this.f95047b;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "Param(feedId=" + this.f95046a + ", referenceKeeper=" + this.f95047b + ")";
        }
    }

    public /* synthetic */ C19096b(C18535e c18535e, C24371m0 c24371m0, C19095a c19095a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C18535e.Companion.m97930a() : c18535e, (i11 & 2) != 0 ? C24371m0.Companion.m127483a() : c24371m0, (i11 & 4) != 0 ? new C19095a(null, null, 3, null) : c19095a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        String str;
        C3020p0 c3020p0;
        C3025q0 c3025q0;
        C3023p3 c3023p3;
        AbstractC19074t.m100208f(aVar, "params");
        C3020p0 m127478n = this.f95044b.m127478n(aVar.m100303a());
        if (m127478n == null || (c3025q0 = m127478n.f12023C) == null || (c3023p3 = c3025q0.f12100I) == null || (str = c3023p3.m14554k()) == null) {
            str = "";
        }
        C3023p3 c3023p32 = new C3023p3(str, null, null, null, null, null, null, null, 0, 0L, 0, 0, 0, 8190, null);
        this.f95045c.m101508a(new C19095a.a(m127478n, c3023p32));
        C19095a c19095a = this.f95045c;
        C19098d.a m100304b = aVar.m100304b();
        if (m100304b != null) {
            c3020p0 = m100304b.m100318a();
        } else {
            c3020p0 = null;
        }
        c19095a.m101508a(new C19095a.a(c3020p0, c3023p32));
    }

    public C19096b(C18535e c18535e, C24371m0 c24371m0, C19095a c19095a) {
        AbstractC19074t.m100208f(c18535e, "repo");
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        AbstractC19074t.m100208f(c19095a, "attachZShortVideoInfoToFeedItemUseCase");
        this.f95043a = c18535e;
        this.f95044b = c24371m0;
        this.f95045c = c19095a;
    }
}
