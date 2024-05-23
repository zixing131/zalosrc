package p455qo;

import ag0.AbstractC0837p0;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import java.util.Iterator;
import p185gc.AbstractC19383g;
import p302ko.C21785g;

/* renamed from: qo.p0 */
/* loaded from: classes4.dex */
public final class C25428p0 extends AbstractC19383g {

    /* renamed from: a */
    private final C21785g f121733a;

    /* renamed from: qo.p0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C3000l0 f121734a;

        public a(C3000l0 c3000l0) {
            AbstractC19074t.m100208f(c3000l0, "feedContent");
            this.f121734a = c3000l0;
        }

        /* renamed from: a */
        public final C3000l0 m131710a() {
            return this.f121734a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f121734a, ((a) obj).f121734a);
        }

        public int hashCode() {
            return this.f121734a.hashCode();
        }

        public String toString() {
            return "Params(feedContent=" + this.f121734a + ")";
        }
    }

    public C25428p0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m131708e(C25428p0 c25428p0, C3000l0 c3000l0) {
        String str;
        AbstractC19074t.m100208f(c25428p0, "this$0");
        AbstractC19074t.m100208f(c3000l0, "$newFeedContent");
        C21785g c21785g = c25428p0.f121733a;
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        Iterator it = c21785g.mo112416o(str2).iterator();
        while (it.hasNext()) {
            C3020p0 m14322a0 = ((C3000l0) it.next()).m14322a0();
            String str3 = null;
            if (m14322a0 != null) {
                str = m14322a0.f12057p;
            } else {
                str = null;
            }
            C3020p0 m14322a02 = c3000l0.m14322a0();
            if (m14322a02 != null) {
                str3 = m14322a02.f12057p;
            }
            if (AbstractC19074t.m100204b(str, str3)) {
                C21785g c21785g2 = c25428p0.f121733a;
                String str4 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str4, "currentUserUid");
                String str5 = c3000l0.f11895q;
                AbstractC19074t.m100207e(str5, "feedContentId");
                String jSONObject = AbstractC20826v0.m108827p(c3000l0).toString();
                AbstractC19074t.m100207e(jSONObject, "toString(...)");
                c21785g2.mo112412k0(str4, str5, jSONObject);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        String str;
        AbstractC19074t.m100208f(aVar, "params");
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        if (str2.length() == 0) {
            return;
        }
        final C3000l0 m131710a = aVar.m131710a();
        C3020p0 m14322a0 = m131710a.m14322a0();
        if (m14322a0 != null) {
            str = m14322a0.m14465A();
        } else {
            str = null;
        }
        if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qo.o0
            @Override // java.lang.Runnable
            public final void run() {
                C25428p0.m131708e(C25428p0.this, m131710a);
            }
        });
    }

    public C25428p0(C21785g c21785g) {
        AbstractC19074t.m100208f(c21785g, "profileRepo");
        this.f121733a = c21785g;
    }

    public /* synthetic */ C25428p0(C21785g c21785g, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C21785g.Companion.m112431a() : c21785g);
    }
}
