package p455qo;

import androidx.work.AbstractC2144f;
import bo.C3000l0;
import bo.C3020p0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p185gc.AbstractC19383g;
import p363nh.C23744a;
import p398oo.C24371m0;

/* renamed from: qo.i0 */
/* loaded from: classes4.dex */
public final class C25414i0 extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f121669a;

    /* renamed from: qo.i0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f121670a;

        /* renamed from: b */
        private final int f121671b;

        /* renamed from: c */
        private final boolean f121672c;

        public a(String str, int i11, boolean z11) {
            AbstractC19074t.m100208f(str, "feedId");
            this.f121670a = str;
            this.f121671b = i11;
            this.f121672c = z11;
        }

        /* renamed from: a */
        public final boolean m131659a() {
            return this.f121672c;
        }

        /* renamed from: b */
        public final String m131660b() {
            return this.f121670a;
        }

        /* renamed from: c */
        public final int m131661c() {
            return this.f121671b;
        }

        /* renamed from: d */
        public final boolean m131662d() {
            if (this.f121670a.length() > 0 && this.f121671b >= 0) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f121670a, aVar.f121670a) && this.f121671b == aVar.f121671b && this.f121672c == aVar.f121672c;
        }

        public int hashCode() {
            return (((this.f121670a.hashCode() * 31) + this.f121671b) * 31) + AbstractC2144f.m11520a(this.f121672c);
        }

        public String toString() {
            return "Params(feedId=" + this.f121670a + ", totalComment=" + this.f121671b + ", broadcastUpdateEvent=" + this.f121672c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.i0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ a f121673q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(2);
            this.f121673q = aVar;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo240pC(C3020p0 c3020p0, C3000l0 c3000l0) {
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            AbstractC19074t.m100208f(c3000l0, "<anonymous parameter 1>");
            c3020p0.f12025E.f12243a = this.f121673q.m131661c();
            return Boolean.TRUE;
        }
    }

    public C25414i0(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f121669a = c24371m0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        if (!aVar.m131662d()) {
            return;
        }
        this.f121669a.m127481s(aVar.m131660b(), new b(aVar));
        if (aVar.m131659a()) {
            C23744a.Companion.m124119a().m124116d(6014, aVar.m131660b());
        }
    }

    public /* synthetic */ C25414i0(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }
}
