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

/* renamed from: qo.k0 */
/* loaded from: classes4.dex */
public final class C25418k0 extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f121682a;

    /* renamed from: qo.k0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C3020p0 f121683a;

        public a(C3020p0 c3020p0) {
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            this.f121683a = c3020p0;
        }

        /* renamed from: a */
        public final C3020p0 m131672a() {
            return this.f121683a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f121683a, ((a) obj).f121683a);
        }

        public int hashCode() {
            return this.f121683a.hashCode();
        }

        public String toString() {
            return "Params(feedItem=" + this.f121683a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.k0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ a f121684q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(2);
            this.f121684q = aVar;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo240pC(C3020p0 c3020p0, C3000l0 c3000l0) {
            AbstractC19074t.m100208f(c3020p0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(c3000l0, "updateFeedContent");
            c3000l0.m14354q1(this.f121684q.m131672a());
            C20834z0.f102412a.m108927f(true);
            return Boolean.TRUE;
        }
    }

    public C25418k0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        C24371m0 c24371m0 = this.f121682a;
        String str = aVar.m131672a().f12057p;
        AbstractC19074t.m100207e(str, "fid");
        c24371m0.m127481s(str, new b(aVar));
    }

    public /* synthetic */ C25418k0(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }

    public C25418k0(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f121682a = c24371m0;
    }
}
