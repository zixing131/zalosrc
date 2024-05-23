package p455qo;

import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.zmedia.view.C17391z;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import on0.AbstractC24341v;
import p185gc.AbstractC19383g;
import p398oo.C24371m0;

/* renamed from: qo.t0 */
/* loaded from: classes4.dex */
public final class C25436t0 extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f121757a;

    /* renamed from: qo.t0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f121758a;

        /* renamed from: b */
        private final C17391z f121759b;

        /* renamed from: c */
        private final boolean f121760c;

        public a(String str, C17391z c17391z) {
            boolean m127128x;
            AbstractC19074t.m100208f(str, "feedItemId");
            AbstractC19074t.m100208f(c17391z, "zVideo");
            this.f121758a = str;
            this.f121759b = c17391z;
            m127128x = AbstractC24341v.m127128x(str);
            this.f121760c = m127128x;
        }

        /* renamed from: a */
        public final String m131737a() {
            return this.f121758a;
        }

        /* renamed from: b */
        public final C17391z m131738b() {
            return this.f121759b;
        }

        /* renamed from: c */
        public final boolean m131739c() {
            return this.f121760c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f121758a, aVar.f121758a) && AbstractC19074t.m100204b(this.f121759b, aVar.f121759b);
        }

        public int hashCode() {
            return (this.f121758a.hashCode() * 31) + this.f121759b.hashCode();
        }

        public String toString() {
            return "Params(feedItemId=" + this.f121758a + ", zVideo=" + this.f121759b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.t0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ a f121761q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(2);
            this.f121761q = aVar;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo240pC(C3020p0 c3020p0, C3000l0 c3000l0) {
            AbstractC19074t.m100208f(c3020p0, "updateFeed");
            AbstractC19074t.m100208f(c3000l0, "<anonymous parameter 1>");
            c3020p0.f12023C.f12093B = this.f121761q.m131738b();
            return Boolean.TRUE;
        }
    }

    public C25436t0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        if (aVar.m131739c()) {
            return;
        }
        this.f121757a.m127481s(aVar.m131737a(), new b(aVar));
    }

    public /* synthetic */ C25436t0(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }

    public C25436t0(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f121757a = c24371m0;
    }
}
