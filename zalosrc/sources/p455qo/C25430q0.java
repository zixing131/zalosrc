package p455qo;

import androidx.work.AbstractC2144f;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.feed.models.PrivacyInfo;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.C20834z0;
import on0.AbstractC24341v;
import p185gc.AbstractC19383g;
import p398oo.C24371m0;

/* renamed from: qo.q0 */
/* loaded from: classes4.dex */
public final class C25430q0 extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f121735a;

    /* renamed from: qo.q0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f121736a;

        /* renamed from: b */
        private final PrivacyInfo f121737b;

        /* renamed from: c */
        private final boolean f121738c;

        /* renamed from: d */
        private final boolean f121739d;

        public a(String str, PrivacyInfo privacyInfo, boolean z11) {
            boolean m127128x;
            AbstractC19074t.m100208f(str, "feedItemId");
            AbstractC19074t.m100208f(privacyInfo, "newPrivacy");
            this.f121736a = str;
            this.f121737b = privacyInfo;
            this.f121738c = z11;
            m127128x = AbstractC24341v.m127128x(str);
            this.f121739d = m127128x;
        }

        /* renamed from: a */
        public final String m131713a() {
            return this.f121736a;
        }

        /* renamed from: b */
        public final PrivacyInfo m131714b() {
            return this.f121737b;
        }

        /* renamed from: c */
        public final boolean m131715c() {
            return this.f121739d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f121736a, aVar.f121736a) && AbstractC19074t.m100204b(this.f121737b, aVar.f121737b) && this.f121738c == aVar.f121738c;
        }

        public int hashCode() {
            return (((this.f121736a.hashCode() * 31) + this.f121737b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f121738c);
        }

        public String toString() {
            return "Params(feedItemId=" + this.f121736a + ", newPrivacy=" + this.f121737b + ", isRefreshTimeline=" + this.f121738c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.q0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ a f121740q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(2);
            this.f121740q = aVar;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo240pC(C3020p0 c3020p0, C3000l0 c3000l0) {
            AbstractC19074t.m100208f(c3020p0, "updateFeed");
            AbstractC19074t.m100208f(c3000l0, "<anonymous parameter 1>");
            c3020p0.f12042V = this.f121740q.m131714b();
            C20834z0.f102412a.m108927f(true);
            return Boolean.TRUE;
        }
    }

    public C25430q0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        if (aVar.m131715c()) {
            return;
        }
        this.f121735a.m127481s(aVar.m131713a(), new b(aVar));
    }

    public /* synthetic */ C25430q0(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }

    public C25430q0(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f121735a = c24371m0;
    }
}
