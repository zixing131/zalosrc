package p455qo;

import bo.C3000l0;
import bo.C3020p0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.C20834z0;
import p185gc.AbstractC19383g;
import p398oo.C24371m0;

/* renamed from: qo.d0 */
/* loaded from: classes4.dex */
public final class C25404d0 extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f121635a;

    /* renamed from: qo.d0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C3020p0 f121636a;

        public a(C3020p0 c3020p0) {
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            this.f121636a = c3020p0;
        }

        /* renamed from: a */
        public final C3020p0 m131632a() {
            return this.f121636a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f121636a, ((a) obj).f121636a);
        }

        public int hashCode() {
            return this.f121636a.hashCode();
        }

        public String toString() {
            return "Params(feedItem=" + this.f121636a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.d0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final b f121637q = new b();

        b() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo240pC(C3020p0 c3020p0, C3000l0 c3000l0) {
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            AbstractC19074t.m100208f(c3000l0, "feedContent");
            String m14465A = c3020p0.m14465A();
            AbstractC19074t.m100207e(m14465A, "getOwnerId(...)");
            if (c3000l0.f11893p == 1 && c3000l0.f11851A != null && !c3000l0.m14353q(m14465A)) {
                c3000l0.f11851A.m14394g(m14465A, true);
            }
            c3020p0.f12021A.m129388h(false);
            if (c3000l0.f11893p == 2) {
                c3000l0.m14298H1();
            }
            C20834z0.f102412a.m108927f(true);
            return Boolean.TRUE;
        }
    }

    public C25404d0(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f121635a = c24371m0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        C24371m0 c24371m0 = this.f121635a;
        String str = aVar.m131632a().f12057p;
        AbstractC19074t.m100207e(str, "fid");
        c24371m0.m127481s(str, b.f121637q);
    }

    public /* synthetic */ C25404d0(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }
}
