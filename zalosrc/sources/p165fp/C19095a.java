package p165fp;

import bo.C3020p0;
import bo.C3023p3;
import bo.C3025q0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p185gc.AbstractC19383g;
import p398oo.C24371m0;
import p455qo.C25418k0;

/* renamed from: fp.a */
/* loaded from: classes4.dex */
public final class C19095a extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f95039a;

    /* renamed from: b */
    private final C25418k0 f95040b;

    /* renamed from: fp.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C3020p0 f95041a;

        /* renamed from: b */
        private final C3023p3 f95042b;

        public a(C3020p0 c3020p0, C3023p3 c3023p3) {
            AbstractC19074t.m100208f(c3023p3, "zShortVideoInfo");
            this.f95041a = c3020p0;
            this.f95042b = c3023p3;
        }

        /* renamed from: a */
        public final C3020p0 m100300a() {
            return this.f95041a;
        }

        /* renamed from: b */
        public final C3023p3 m100301b() {
            return this.f95042b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f95041a, aVar.f95041a) && AbstractC19074t.m100204b(this.f95042b, aVar.f95042b);
        }

        public int hashCode() {
            C3020p0 c3020p0 = this.f95041a;
            return ((c3020p0 == null ? 0 : c3020p0.hashCode()) * 31) + this.f95042b.hashCode();
        }

        public String toString() {
            return "Param(feedItem=" + this.f95041a + ", zShortVideoInfo=" + this.f95042b + ")";
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C19095a(C24371m0 c24371m0, C25418k0 c25418k0, int i11, AbstractC19060k abstractC19060k) {
        this(c24371m0, (i11 & 2) != 0 ? new C25418k0(c24371m0) : c25418k0);
        c24371m0 = (i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        C3020p0 m100300a = aVar.m100300a();
        if (m100300a != null) {
            C3025q0 c3025q0 = m100300a.f12023C;
            if (c3025q0 != null) {
                c3025q0.f12100I = aVar.m100301b();
            }
            C3025q0 c3025q02 = m100300a.f12023C;
            if (c3025q02 != null) {
                c3025q02.m14564a(m100300a.f12057p, m100300a.m14465A());
            }
            this.f95040b.m101508a(new C25418k0.a(m100300a));
        }
    }

    public C19095a(C24371m0 c24371m0, C25418k0 c25418k0) {
        AbstractC19074t.m100208f(c24371m0, "repo");
        AbstractC19074t.m100208f(c25418k0, "updateFeedItemTimelineUseCase");
        this.f95039a = c24371m0;
        this.f95040b = c25418k0;
    }
}
