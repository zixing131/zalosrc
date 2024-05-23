package p581vo;

import ag0.C0824j;
import am.AbstractC0939u;
import bo.C3003l3;
import bo.C3063z0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import l30.C22052u;
import p185gc.AbstractC19383g;
import p363nh.C23744a;
import p509sp.C26359h;
import p716zh.C31890dc;
import p716zh.C32123ta;

/* renamed from: vo.b */
/* loaded from: classes4.dex */
public final class C28359b extends AbstractC19383g {

    /* renamed from: vo.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f132129a;

        /* renamed from: b */
        private final C31890dc f132130b;

        /* renamed from: c */
        private final C3063z0 f132131c;

        /* renamed from: d */
        private final PrivacyInfo f132132d;

        /* renamed from: e */
        private final C3003l3 f132133e;

        /* renamed from: f */
        private final TrackingSource f132134f;

        public a(String str, C31890dc c31890dc, C3063z0 c3063z0, PrivacyInfo privacyInfo, C3003l3 c3003l3, TrackingSource trackingSource) {
            AbstractC19074t.m100208f(str, "desc");
            this.f132129a = str;
            this.f132130b = c31890dc;
            this.f132131c = c3063z0;
            this.f132132d = privacyInfo;
            this.f132133e = c3003l3;
            this.f132134f = trackingSource;
        }

        /* renamed from: a */
        public final String m142809a() {
            return this.f132129a;
        }

        /* renamed from: b */
        public final C3063z0 m142810b() {
            return this.f132131c;
        }

        /* renamed from: c */
        public final PrivacyInfo m142811c() {
            return this.f132132d;
        }

        /* renamed from: d */
        public final C3003l3 m142812d() {
            return this.f132133e;
        }

        /* renamed from: e */
        public final TrackingSource m142813e() {
            return this.f132134f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f132129a, aVar.f132129a) && AbstractC19074t.m100204b(this.f132130b, aVar.f132130b) && AbstractC19074t.m100204b(this.f132131c, aVar.f132131c) && AbstractC19074t.m100204b(this.f132132d, aVar.f132132d) && AbstractC19074t.m100204b(this.f132133e, aVar.f132133e) && AbstractC19074t.m100204b(this.f132134f, aVar.f132134f);
        }

        /* renamed from: f */
        public final C31890dc m142814f() {
            return this.f132130b;
        }

        public int hashCode() {
            int hashCode = this.f132129a.hashCode() * 31;
            C31890dc c31890dc = this.f132130b;
            int hashCode2 = (hashCode + (c31890dc == null ? 0 : c31890dc.hashCode())) * 31;
            C3063z0 c3063z0 = this.f132131c;
            int hashCode3 = (hashCode2 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f132132d;
            int hashCode4 = (hashCode3 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31;
            C3003l3 c3003l3 = this.f132133e;
            int hashCode5 = (hashCode4 + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            TrackingSource trackingSource = this.f132134f;
            return hashCode5 + (trackingSource != null ? trackingSource.hashCode() : 0);
        }

        public String toString() {
            return "Param(desc=" + this.f132129a + ", typo=" + this.f132130b + ", location=" + this.f132131c + ", privacy=" + this.f132132d + ", tagInfo=" + this.f132133e + ", trackingSource=" + this.f132134f + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vo.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C32123ta f132135q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C32123ta c32123ta) {
            super(0);
            this.f132135q = c32123ta;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "post story bg from update status: id=" + this.f132135q.f148138h;
        }
    }

    /* renamed from: vo.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C32123ta f132136a;

        c(C32123ta c32123ta) {
            this.f132136a = c32123ta;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C7960e m41971c6 = C7960e.m41971c6();
                String str = CoreUtility.f89233i;
                C32123ta c32123ta = this.f132136a;
                m41971c6.m42074B8(str, c32123ta.f148138h, c32123ta.m155082i0().toString(), 1, this.f132136a.f148157w);
                C22052u.m115085y().m115096p(this.f132136a);
                C22052u.m115085y().m115101u();
                C22052u.m115085y().m115091U(this.f132136a);
                C23744a.Companion.m124119a().m124116d(28, 0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        String m142809a = aVar.m142809a();
        C31890dc m142814f = aVar.m142814f();
        C3063z0 m142810b = aVar.m142810b();
        PrivacyInfo m142811c = aVar.m142811c();
        C3003l3 m142812d = aVar.m142812d();
        TrackingSource m142813e = aVar.m142813e();
        C32123ta m155062r = C32123ta.m155062r(m142809a, m142814f, m142810b, m142811c, m142812d);
        if (m142813e == null) {
            m142813e = new TrackingSource(0);
        }
        m155062r.m155081h0(m142813e);
        C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_STATUS", new b(m155062r));
        C0824j.m2153b(new c(m155062r));
    }
}
