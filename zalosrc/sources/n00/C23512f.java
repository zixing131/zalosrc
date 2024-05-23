package n00;

import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import dg0.AbstractC17930e;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ga0.C19322f1;
import gw.C19669z;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23217t2;
import me0.AbstractC23262x6;
import me0.C23282z6;
import mm0.AbstractC23350e;
import o00.C23975a;
import p142ey.C18635e;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p461qu.AbstractC25495a;
import p612wk.AbstractC29072d;
import p716zh.C31853b5;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25332a0;
import qm0.AbstractC25356m;
import sk.AbstractC26305f;
import sk.C26302c;
import sk.C26303d;
import sk.EnumC26306g;
import vg.C28203u6;

/* renamed from: n00.f */
/* loaded from: classes4.dex */
public final class C23512f extends AbstractC23514h {

    /* renamed from: t */
    private final HashMap f114182t;

    /* renamed from: u */
    private final a f114183u;

    /* renamed from: n00.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final List f114184a;

        /* renamed from: b */
        private final List f114185b;

        /* renamed from: c */
        private final List f114186c;

        public a(List list, List list2, List list3) {
            AbstractC19074t.m100208f(list, "miniAppResult");
            AbstractC19074t.m100208f(list2, "highPriorityOAResult");
            AbstractC19074t.m100208f(list3, "lowPriorityOAResult");
            this.f114184a = list;
            this.f114185b = list2;
            this.f114186c = list3;
        }

        /* renamed from: a */
        public final List m123416a() {
            return this.f114185b;
        }

        /* renamed from: b */
        public final List m123417b() {
            return this.f114186c;
        }

        /* renamed from: c */
        public final List m123418c() {
            return this.f114184a;
        }

        /* renamed from: d */
        public final a m123419d() {
            List m131187O0;
            List m131187O02;
            List m131187O03;
            m131187O0 = AbstractC25332a0.m131187O0(this.f114184a);
            m131187O02 = AbstractC25332a0.m131187O0(this.f114185b);
            m131187O03 = AbstractC25332a0.m131187O0(this.f114186c);
            return new a(m131187O0, m131187O02, m131187O03);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f114184a, aVar.f114184a) && AbstractC19074t.m100204b(this.f114185b, aVar.f114185b) && AbstractC19074t.m100204b(this.f114186c, aVar.f114186c);
        }

        public int hashCode() {
            return (((this.f114184a.hashCode() * 31) + this.f114185b.hashCode()) * 31) + this.f114186c.hashCode();
        }

        public String toString() {
            return "ResultSearch(miniAppResult=" + this.f114184a + ", highPriorityOAResult=" + this.f114185b + ", lowPriorityOAResult=" + this.f114186c + ")";
        }

        public /* synthetic */ a(List list, List list2, List list3, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? new ArrayList() : list, (i11 & 2) != 0 ? new ArrayList() : list2, (i11 & 4) != 0 ? new ArrayList() : list3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23512f(InterfaceC18319c interfaceC18319c, String str) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        this.f114182t = new HashMap();
        this.f114183u = new a(null, null, null, 7, null);
    }

    /* renamed from: m */
    private final void m123408m(boolean z11) {
        AbstractC29072d abstractC29072d;
        List m123417b;
        C26303d[] c26303dArr = new C26303d[3];
        EnumC26306g enumC26306g = EnumC26306g.f124953q;
        String m123420l = m123420l();
        ArrayList arrayList = new ArrayList();
        if (z11) {
            abstractC29072d = AbstractC29072d.c.f134805a;
        } else {
            abstractC29072d = AbstractC29072d.d.f134806a;
        }
        c26303dArr[0] = new C26303d(enumC26306g, m123420l, arrayList, abstractC29072d);
        EnumC26306g enumC26306g2 = EnumC26306g.f124954r;
        String m123420l2 = m123420l();
        List m123416a = this.f114183u.m123416a();
        AbstractC29072d abstractC29072d2 = AbstractC29072d.d.f134806a;
        c26303dArr[1] = new C26303d(enumC26306g2, m123420l2, m123416a, abstractC29072d2);
        EnumC26306g enumC26306g3 = EnumC26306g.f124955s;
        String m123420l3 = m123420l();
        if (z11) {
            m123417b = new ArrayList();
        } else {
            m123417b = this.f114183u.m123417b();
        }
        if (z11) {
            abstractC29072d2 = AbstractC29072d.c.f134805a;
        }
        c26303dArr[2] = new C26303d(enumC26306g3, m123420l3, m123417b, abstractC29072d2);
        mo205i9(new C18316b("ACTION_SEARCH_DISCOVERY_TASK_RESULT_SET_DATA", AbstractC26305f.m135430a(c26303dArr), null, null, 12, null));
    }

    /* renamed from: n */
    private final void m123409n(String str, List list, List list2) {
        List m131187O0;
        ContactProfile m153138j;
        C31853b5 m114357s = C21927m.m114302u().m114357s();
        AbstractC19074t.m100207e(m114357s, "getFollowList(...)");
        m131187O0 = AbstractC25332a0.m131187O0(m114357s);
        AbstractC23262x6.m119979N(str, m131187O0, list, C19669z.f97573U, list2, C19322f1.f95950a.m101134I() | 34, this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ContactProfile contactProfile = (ContactProfile) it.next();
            try {
                if (!AbstractC25495a.m132086k(contactProfile.f42434r) && C21927m.m114302u().m114357s().m153137g(contactProfile.f42434r) && (m153138j = C21927m.m114302u().m114357s().m153138j(contactProfile.f42434r)) != null) {
                    AbstractC19074t.m100205c(m153138j);
                    contactProfile.f42352K0 = m153138j.f42447v0;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: o */
    private final void m123410o(C26302c c26302c, List list) {
        List m131320c;
        List m131320c2;
        String[] m118488a = C23282z6.m120367c(m123420l(), 4096).m118488a();
        if (isCancelled()) {
            return;
        }
        ArrayList<ContactProfile> arrayList = new ArrayList();
        ArrayList<ContactProfile> arrayList2 = new ArrayList();
        m123412q(c26302c, list, arrayList2);
        m123413r(list, arrayList);
        m123411p(list, arrayList);
        if (isCancelled()) {
            return;
        }
        for (ContactProfile contactProfile : arrayList) {
            if (!this.f114182t.containsKey(contactProfile.f42434r)) {
                String spannableStringBuilder = contactProfile.f42436r1.toString();
                m131320c2 = AbstractC25356m.m131320c(m118488a);
                contactProfile.f42436r1 = AbstractC23217t2.m119655g(spannableStringBuilder, m131320c2, 0);
                this.f114183u.m123416a().add(contactProfile);
                HashMap hashMap = this.f114182t;
                String str = contactProfile.f42434r;
                AbstractC19074t.m100207e(str, "uid");
                String str2 = contactProfile.f42434r;
                AbstractC19074t.m100207e(str2, "uid");
                hashMap.put(str, str2);
            }
        }
        for (ContactProfile contactProfile2 : arrayList2) {
            if (!this.f114182t.containsKey(contactProfile2.f42434r)) {
                String spannableStringBuilder2 = contactProfile2.f42436r1.toString();
                m131320c = AbstractC25356m.m131320c(m118488a);
                contactProfile2.f42436r1 = AbstractC23217t2.m119655g(spannableStringBuilder2, m131320c, 0);
                this.f114183u.m123417b().add(contactProfile2);
                HashMap hashMap2 = this.f114182t;
                String str3 = contactProfile2.f42434r;
                AbstractC19074t.m100207e(str3, "uid");
                String str4 = contactProfile2.f42434r;
                AbstractC19074t.m100207e(str4, "uid");
                hashMap2.put(str3, str4);
            }
        }
    }

    /* renamed from: p */
    private final void m123411p(List list, List list2) {
        Object m129218b;
        try {
            C24861r.a aVar = C24861r.f119264q;
            m123409n(m123420l(), list2, list);
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            AbstractC20110a.f98889a.mo104552e(m129221e);
        }
    }

    /* renamed from: q */
    private final void m123412q(C26302c c26302c, List list, List list2) {
        Object m129218b;
        ArrayList<ContactProfile> arrayList = new ArrayList();
        try {
            C24861r.a aVar = C24861r.f119264q;
            m123415t(arrayList, c26302c, m123420l(), list);
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            AbstractC20110a.f98889a.mo104552e(m129221e);
        }
        for (ContactProfile contactProfile : arrayList) {
            if (isCancelled()) {
                return;
            }
            if (!this.f114182t.containsKey(contactProfile.f42434r) && (contactProfile.m40387S0() || AbstractC25495a.m132086k(contactProfile.f42434r) || C21927m.m114302u().m114318P(contactProfile.f42434r) || AbstractC23304d.f113417o.containsKey(contactProfile.f42434r) || AbstractC21935u.m114518H(contactProfile.f42434r))) {
                list2.add(contactProfile);
                ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, contactProfile.f42434r, null, 2, null);
                if (m141798e != null) {
                    contactProfile.f42352K0 = m141798e.f42352K0;
                    contactProfile.f42447v0 = m141798e.f42447v0;
                }
            }
        }
    }

    /* renamed from: r */
    private final void m123413r(List list, List list2) {
        ArrayList<ContactProfile> arrayList = new ArrayList();
        C18635e mo98465a = C18644n.m98531l().mo98465a(null, true);
        AbstractC19074t.m100207e(mo98465a, "getsortedZaloList(...)");
        AbstractC23262x6.m119979N(m123420l(), mo98465a, arrayList, C19669z.f97573U, list, C19322f1.f95950a.m101134I() | 32802, this);
        if (isCancelled()) {
            return;
        }
        for (ContactProfile contactProfile : arrayList) {
            if (!this.f114182t.containsKey(contactProfile.f42434r) && AbstractC25495a.m132086k(contactProfile.f42434r)) {
                list2.add(contactProfile);
            }
        }
    }

    /* renamed from: s */
    private final void m123414s(List list) {
        InterfaceC18319c interfaceC18319c;
        InterfaceC18319c m101438e = m101438e();
        if (m101438e == null) {
            interfaceC18319c = this;
        } else {
            interfaceC18319c = m101438e;
        }
        final C23510d c23510d = new C23510d(interfaceC18319c, m123420l(), (byte) 2, this.f114182t, this.f114183u.m123419d(), list, 0L, 64, null);
        AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: n00.e
            @Override // java.lang.Runnable
            public final void run() {
                C23510d.this.m101441i();
            }
        }, 75L);
    }

    /* renamed from: t */
    private final void m123415t(List list, C26302c c26302c, String str, List list2) {
        HashMap hashMap = new HashMap();
        if (c26302c.m135413n()) {
            c26302c.m135421v(false);
            List m103199P = C19669z.Companion.m103232a().m103199P();
            synchronized (c26302c.m135412m()) {
                c26302c.m135412m().clear();
                c26302c.m135412m().addAll(m103199P);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c26302c.m135412m());
        AbstractC23262x6.m119984S(str, arrayList, list, C19669z.f97573U, list2, hashMap, C19322f1.f95950a.m101134I() | ZVideoUtilMetadata.FF_PROFILE_H264_INTRA, this, false);
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        C18316b c18316b;
        InterfaceC18319c m101438e = m101438e();
        C26302c c26302c = null;
        if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C26302c) {
            c26302c = (C26302c) obj;
        }
        if (c26302c == null) {
            return;
        }
        List m101459b = c26302c.m135408i().m101459b(m123420l());
        m123410o(c26302c, m101459b);
        if (isCancelled()) {
            return;
        }
        boolean m125471a = C23975a.f116042a.m125471a(m123420l());
        m123408m(m125471a);
        if (m125471a) {
            m123414s(m101459b);
        }
    }
}
