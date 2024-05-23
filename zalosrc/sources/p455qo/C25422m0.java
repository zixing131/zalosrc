package p455qo;

import ag0.AbstractC0837p0;
import androidx.work.AbstractC2144f;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3039t0;
import bo.C3051w0;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import fn0.C19055h0;
import is.AbstractC20826v0;
import p167fs.C19140e;
import p185gc.AbstractC19383g;
import p302ko.C21785g;
import p363nh.C23744a;
import p398oo.C24371m0;
import p726zr.C32546b;
import p726zr.C32547c;

/* renamed from: qo.m0 */
/* loaded from: classes4.dex */
public final class C25422m0 extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f121704a;

    /* renamed from: b */
    private final C21785g f121705b;

    /* renamed from: qo.m0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f121706a;

        /* renamed from: b */
        private final int f121707b;

        /* renamed from: c */
        private final boolean f121708c;

        /* renamed from: d */
        private final C3051w0 f121709d;

        /* renamed from: e */
        private final C32546b f121710e;

        /* renamed from: f */
        private final boolean f121711f;

        /* renamed from: g */
        private final boolean f121712g;

        public a(String str, int i11, boolean z11, C3051w0 c3051w0, C32546b c32546b, boolean z12, boolean z13) {
            AbstractC19074t.m100208f(str, "feedId");
            this.f121706a = str;
            this.f121707b = i11;
            this.f121708c = z11;
            this.f121709d = c3051w0;
            this.f121710e = c32546b;
            this.f121711f = z12;
            this.f121712g = z13;
        }

        /* renamed from: a */
        public final boolean m131688a() {
            return this.f121712g;
        }

        /* renamed from: b */
        public final String m131689b() {
            return this.f121706a;
        }

        /* renamed from: c */
        public final boolean m131690c() {
            return this.f121711f;
        }

        /* renamed from: d */
        public final C32546b m131691d() {
            return this.f121710e;
        }

        /* renamed from: e */
        public final C3051w0 m131692e() {
            return this.f121709d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f121706a, aVar.f121706a) && this.f121707b == aVar.f121707b && this.f121708c == aVar.f121708c && AbstractC19074t.m100204b(this.f121709d, aVar.f121709d) && AbstractC19074t.m100204b(this.f121710e, aVar.f121710e) && this.f121711f == aVar.f121711f && this.f121712g == aVar.f121712g;
        }

        /* renamed from: f */
        public final int m131693f() {
            return this.f121707b;
        }

        /* renamed from: g */
        public final boolean m131694g() {
            return this.f121708c;
        }

        /* renamed from: h */
        public final boolean m131695h() {
            if (this.f121706a.length() > 0 && this.f121707b >= 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((this.f121706a.hashCode() * 31) + this.f121707b) * 31) + AbstractC2144f.m11520a(this.f121708c)) * 31;
            C3051w0 c3051w0 = this.f121709d;
            int hashCode2 = (hashCode + (c3051w0 == null ? 0 : c3051w0.hashCode())) * 31;
            C32546b c32546b = this.f121710e;
            return ((((hashCode2 + (c32546b != null ? c32546b.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f121711f)) * 31) + AbstractC2144f.m11520a(this.f121712g);
        }

        public String toString() {
            return "Params(feedId=" + this.f121706a + ", totalLike=" + this.f121707b + ", isLike=" + this.f121708c + ", recentLike=" + this.f121709d + ", reactionDetail=" + this.f121710e + ", needSyncIsLikeState=" + this.f121711f + ", broadcastUpdateEvent=" + this.f121712g + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.m0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ a f121713q;

        /* renamed from: r */
        final /* synthetic */ C19055h0 f121714r;

        /* renamed from: s */
        final /* synthetic */ C19051f0 f121715s;

        /* renamed from: t */
        final /* synthetic */ C3051w0 f121716t;

        /* renamed from: u */
        final /* synthetic */ C32546b f121717u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C19055h0 c19055h0, C19051f0 c19051f0, C3051w0 c3051w0, C32546b c32546b) {
            super(2);
            this.f121713q = aVar;
            this.f121714r = c19055h0;
            this.f121715s = c19051f0;
            this.f121716t = c3051w0;
            this.f121717u = c32546b;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo240pC(C3020p0 c3020p0, C3000l0 c3000l0) {
            boolean z11;
            int i11;
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            AbstractC19074t.m100208f(c3000l0, "<anonymous parameter 1>");
            int i12 = 0;
            if (this.f121713q.m131694g() != c3020p0.f12064w) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f121713q.m131690c() && z11) {
                boolean z12 = c3020p0.f12064w;
                int i13 = this.f121714r.f94931p;
                if (z12) {
                    i11 = i13 + 1;
                } else {
                    i11 = i13 - 1;
                }
                C19055h0 c19055h0 = this.f121714r;
                if (i11 >= 0) {
                    i12 = i11;
                }
                c19055h0.f94931p = i12;
                this.f121715s.f94928p = z12;
            }
            C3039t0 c3039t0 = c3020p0.f12025E;
            c3039t0.f12244b = this.f121714r.f94931p;
            c3020p0.f12064w = this.f121715s.f94928p;
            C3051w0 c3051w0 = this.f121716t;
            if (c3051w0 != null) {
                c3039t0.f12246d = c3051w0;
            }
            C32546b c32546b = this.f121717u;
            if (c32546b != null) {
                c3039t0.f12247e = c32546b;
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ C25422m0(C24371m0 c24371m0, C21785g c21785g, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0, (i11 & 2) != 0 ? C21785g.Companion.m112431a() : c21785g);
    }

    /* renamed from: e */
    private final void m131684e(a aVar) {
        final String m131689b = aVar.m131689b();
        final int m131693f = aVar.m131693f();
        final boolean m131694g = aVar.m131694g();
        C32546b m131691d = aVar.m131691d();
        if (m131691d == null) {
            m131691d = new C32546b(1, null, 2, null);
        }
        final C32546b c32546b = m131691d;
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qo.l0
            @Override // java.lang.Runnable
            public final void run() {
                C25422m0.m131685f(C25422m0.this, m131689b, m131694g, m131693f, c32546b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m131685f(C25422m0 c25422m0, String str, boolean z11, int i11, C32546b c32546b) {
        C3020p0 m14325c0;
        AbstractC19074t.m100208f(c25422m0, "this$0");
        AbstractC19074t.m100208f(str, "$feedId");
        AbstractC19074t.m100208f(c32546b, "$reactionDetail");
        C21785g c21785g = c25422m0.f121705b;
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        for (C3000l0 c3000l0 : c21785g.mo112416o(str2)) {
            if (c3000l0 != null && AbstractC19074t.m100204b(c3000l0.f11895q, str) && (m14325c0 = c3000l0.m14325c0(str)) != null) {
                C19140e.f95172a.m100456h(m14325c0, new C32547c(z11, i11, c32546b));
                C21785g c21785g2 = c25422m0.f121705b;
                String str3 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str3, "currentUserUid");
                String str4 = c3000l0.f11895q;
                AbstractC19074t.m100207e(str4, "feedContentId");
                String jSONObject = AbstractC20826v0.m108827p(c3000l0).toString();
                AbstractC19074t.m100207e(jSONObject, "toString(...)");
                c21785g2.mo112412k0(str3, str4, jSONObject);
            }
        }
    }

    /* renamed from: g */
    private final void m131686g(a aVar) {
        C19055h0 c19055h0 = new C19055h0();
        c19055h0.f94931p = aVar.m131693f();
        C19051f0 c19051f0 = new C19051f0();
        c19051f0.f94928p = aVar.m131694g();
        this.f121704a.m127481s(aVar.m131689b(), new b(aVar, c19055h0, c19051f0, aVar.m131692e(), aVar.m131691d()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        if (!aVar.m131695h()) {
            return;
        }
        m131686g(aVar);
        m131684e(aVar);
        if (aVar.m131688a()) {
            C23744a.Companion.m124119a().m124116d(6014, aVar.m131689b());
        }
    }

    public C25422m0(C24371m0 c24371m0, C21785g c21785g) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        AbstractC19074t.m100208f(c21785g, "profileRepo");
        this.f121704a = c24371m0;
        this.f121705b = c21785g;
    }
}
