package p455qo;

import bo.C3000l0;
import bo.C3020p0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.C20834z0;
import on0.AbstractC24341v;
import p185gc.AbstractC19383g;
import p398oo.C24371m0;

/* renamed from: qo.e0 */
/* loaded from: classes4.dex */
public final class C25406e0 extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f121640a;

    /* renamed from: qo.e0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f121641a;

        /* renamed from: b */
        private final boolean f121642b;

        public a(String str) {
            boolean m127128x;
            AbstractC19074t.m100208f(str, "feedItemId");
            this.f121641a = str;
            m127128x = AbstractC24341v.m127128x(str);
            this.f121642b = !m127128x;
        }

        /* renamed from: a */
        public final String m131637a() {
            return this.f121641a;
        }

        /* renamed from: b */
        public final boolean m131638b() {
            return this.f121642b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f121641a, ((a) obj).f121641a);
        }

        public int hashCode() {
            return this.f121641a.hashCode();
        }

        public String toString() {
            return "Params(feedItemId=" + this.f121641a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.e0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final b f121643q = new b();

        b() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo240pC(C3020p0 c3020p0, C3000l0 c3000l0) {
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            AbstractC19074t.m100208f(c3000l0, "<anonymous parameter 1>");
            c3020p0.f12059r.m14388a();
            return Boolean.TRUE;
        }
    }

    public C25406e0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        if (aVar.m131638b() && this.f121640a.m127481s(aVar.m131637a(), b.f121643q)) {
            C20834z0.f102412a.m108927f(true);
        }
    }

    public C25406e0(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f121640a = c24371m0;
    }

    public /* synthetic */ C25406e0(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }
}
