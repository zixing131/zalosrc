package p444qd;

import ag0.AbstractC0837p0;
import ag0.InterfaceC0806b1;
import am.AbstractC0924m0;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23088h5;
import me0.AbstractC23160o0;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import on0.AbstractC24340u;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18631a;
import p142ey.C18635e;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p405ov.C24561c;
import p422pd.C24726a;
import p444qd.C25231i;
import p480rd.C25734e;
import pm0.C24848g0;
import qm0.AbstractC25376w;
import sd.C26231b;
import vg.C28221w6;

/* renamed from: qd.i */
/* loaded from: classes3.dex */
public final class C25231i {

    /* renamed from: c */
    private static volatile boolean f121008c;

    /* renamed from: a */
    public static final C25231i f121006a = new C25231i();

    /* renamed from: b */
    private static final C28221w6 f121007b = new C28221w6();

    /* renamed from: d */
    private static volatile boolean f121009d = true;

    /* renamed from: qd.i$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final int f121010a;

        /* renamed from: b */
        private final long f121011b;

        /* renamed from: c */
        private final String f121012c;

        public a(int i11, long j11, String str) {
            AbstractC19074t.m100208f(str, "dpnNoSign");
            this.f121010a = i11;
            this.f121011b = j11;
            this.f121012c = str;
        }

        /* renamed from: a */
        public final String m130535a() {
            return this.f121012c;
        }

        /* renamed from: b */
        public final long m130536b() {
            return this.f121011b;
        }

        /* renamed from: c */
        public final int m130537c() {
            return this.f121010a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f121010a == aVar.f121010a && this.f121011b == aVar.f121011b && AbstractC19074t.m100204b(this.f121012c, aVar.f121012c);
        }

        public int hashCode() {
            return (((this.f121010a * 31) + AbstractC2147g0.m11521a(this.f121011b)) * 31) + this.f121012c.hashCode();
        }

        public String toString() {
            return "BirthdayProfile(uid=" + this.f121010a + ", requestDOB=" + this.f121011b + ", dpnNoSign=" + this.f121012c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.i$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final b f121013q = new b();

        b() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo240pC(a aVar, a aVar2) {
            AbstractC19074t.m100208f(aVar, "o1");
            AbstractC19074t.m100208f(aVar2, "o2");
            int m100210h = AbstractC19074t.m100210h(aVar.m130536b(), aVar2.m130536b());
            if (m100210h != 0) {
                return Integer.valueOf(m100210h);
            }
            int compareTo = aVar.m130535a().compareTo(aVar2.m130535a());
            if (compareTo != 0) {
                return Integer.valueOf(compareTo);
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.i$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25734e f121014q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C25734e c25734e) {
            super(1);
            this.f121014q = c25734e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m130540c(C25734e c25734e, JSONObject jSONObject) {
            AbstractC19074t.m100208f(c25734e, "$eventTimeRangeRequest");
            AbstractC19074t.m100208f(jSONObject, "$jsonResult");
            C25231i.f121006a.m130528u(c25734e, jSONObject);
        }

        /* renamed from: b */
        public final void m130541b(final JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonResult");
            InterfaceC0806b1 m2236a = AbstractC0837p0.Companion.m2236a();
            final C25734e c25734e = this.f121014q;
            m2236a.mo2040a(new Runnable() { // from class: qd.j
                @Override // java.lang.Runnable
                public final void run() {
                    C25231i.c.m130540c(C25734e.this, jSONObject);
                }
            });
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m130541b((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.i$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final d f121015q = new d();

        d() {
            super(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m130543c(int i11) {
            C25231i.f121006a.m130527t(i11);
        }

        /* renamed from: b */
        public final void m130544b(final int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: qd.k
                @Override // java.lang.Runnable
                public final void run() {
                    C25231i.d.m130543c(i11);
                }
            });
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m130544b(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    private C25231i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:            r3 = on0.AbstractC24340u.m127109o((java.lang.String) r2.get(0));     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m130515g(ContactProfile contactProfile, List list, int i11) {
        List m127132B0;
        Long m127109o;
        Long m127109o2;
        AbstractC19074t.m100208f(contactProfile, "$newProfile");
        try {
            String m3126I2 = AbstractC0924m0.m3126I2();
            AbstractC19074t.m100205c(m3126I2);
            m127132B0 = AbstractC24342w.m127132B0(m3126I2, new String[]{"_"}, false, 0, 6, null);
            if (m127132B0.size() != 2) {
                m127132B0 = null;
            }
            if (m127132B0 != null && m127109o != null) {
                long longValue = m127109o.longValue();
                m127109o2 = AbstractC24340u.m127109o((String) m127132B0.get(1));
                if (m127109o2 != null) {
                    long longValue2 = m127109o2.longValue();
                    if (longValue2 <= longValue) {
                        return;
                    }
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(longValue);
                    int i12 = calendar.get(5);
                    int i13 = calendar.get(2) + 1;
                    calendar.setTimeInMillis(longValue2);
                    int i14 = calendar.get(5);
                    int i15 = calendar.get(2) + 1;
                    C26231b c26231b = C26231b.f124604a;
                    calendar.setTimeZone(c26231b.m134872i());
                    int m134871h = c26231b.m134871h(contactProfile, calendar);
                    int m134873k = c26231b.m134873k(contactProfile, calendar) + 1;
                    if (i13 <= m134873k && m134873k <= i15) {
                        if (m134873k == i13) {
                            if (m134873k == i15) {
                                if (i12 <= m134871h && m134871h <= i14) {
                                    return;
                                }
                            } else if (m134871h >= i12) {
                                return;
                            }
                        } else if (m134873k == i15) {
                            if (m134871h <= i14) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    C24561c.m127942b("[BirthdayHub]", "checkDOBProfilePromoteChange: out of range");
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.remove(Integer.valueOf(i11));
                    C25227e.Companion.m130506a().m130504l(arrayList);
                    f121006a.m130524q();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    /* renamed from: i */
    private final C25734e m130516i() {
        Calendar calendar = Calendar.getInstance();
        AbstractC23160o0.m119283q1(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        HashSet hashSet = new HashSet();
        int i11 = 0;
        int i12 = -1;
        while (true) {
            if (i11 >= 7) {
                break;
            }
            int i13 = calendar.get(5);
            int i14 = calendar.get(2) + 1;
            if (i12 == -1) {
                i12 = i14;
            } else if (i12 != i14) {
                AbstractC0924m0.m3318Ok(i14);
                f121009d = false;
                calendar.add(5, -1);
                AbstractC23160o0.m119283q1(calendar);
                break;
            }
            hashSet.add(m130517j(i13, i14));
            if (i11 != 6) {
                calendar.add(5, 1);
                AbstractC23160o0.m119283q1(calendar);
            }
            i11++;
        }
        AbstractC23160o0.m119292t1(calendar);
        return new C25734e(timeInMillis, calendar.getTimeInMillis(), m130518k(hashSet), 1);
    }

    /* renamed from: j */
    private final String m130517j(int i11, int i12) {
        return i11 + "-" + i12;
    }

    /* renamed from: k */
    private final HashMap m130518k(HashSet hashSet) {
        boolean z11;
        HashMap hashMap = new HashMap();
        Calendar m134869f = C26231b.f124604a.m134869f();
        String m122303q0 = AbstractC23309i.m122303q0();
        if (m122303q0 != null && m122303q0.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z12 = !z11;
        C18635e<ContactProfile> m98553p = C18644n.m98531l().m98553p();
        AbstractC19074t.m100207e(m98553p, "getZaloList(...)");
        for (ContactProfile contactProfile : m98553p) {
            C26231b c26231b = C26231b.f124604a;
            AbstractC19074t.m100205c(contactProfile);
            if (c26231b.m134875n(contactProfile, z12)) {
                if (hashSet.contains(f121006a.m130517j(c26231b.m134871h(contactProfile, m134869f), c26231b.m134873k(contactProfile, m134869f) + 1))) {
                    String mo2478b = contactProfile.mo2478b();
                    AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                    hashMap.put(mo2478b, 0L);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    private final boolean m130519l() {
        if (C25227e.Companion.m130506a().m130502i() != null) {
            return !r0.isEmpty();
        }
        return false;
    }

    /* renamed from: m */
    private final boolean m130520m() {
        if (C18644n.m98531l().m98551n().get() && (!C18644n.m98531l().m98559v() || !AbstractC21935u.m114512B())) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private final boolean m130521n() {
        if (System.currentTimeMillis() - AbstractC0924m0.m3416S2() >= 86400000 && m130519l()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private final boolean m130522o() {
        if (System.currentTimeMillis() - AbstractC0924m0.m3387R2() < 604800000) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private final boolean m130523p() {
        try {
            int m3214L3 = AbstractC0924m0.m3214L3();
            if (1 <= m3214L3 && m3214L3 < 13) {
                if (Calendar.getInstance().get(2) + 1 == m3214L3) {
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
            return true;
        }
    }

    /* renamed from: q */
    private final void m130524q() {
        C23744a.Companion.m124119a().m124116d(6098, new Object[0]);
        AbstractC23088h5.m118426g();
    }

    /* renamed from: r */
    private final void m130525r(C25734e c25734e) {
        String str;
        AbstractC0924m0.m3346Pj(System.currentTimeMillis());
        AbstractC0924m0.m3375Qj(System.currentTimeMillis());
        if (c25734e != null) {
            str = c25734e.m132847e() + "_" + c25734e.m132846d();
        } else {
            str = "";
        }
        AbstractC0924m0.m3085Gj(str);
        if (f121009d) {
            AbstractC0924m0.m3318Ok(-1);
        }
        f121007b.m142182d();
    }

    /* renamed from: s */
    static /* synthetic */ void m130526s(C25231i c25231i, C25734e c25734e, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c25734e = null;
        }
        c25231i.m130525r(c25734e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final void m130527t(int i11) {
        try {
            try {
                f121007b.m142181c(i11);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("[BirthdayHub]", e11);
            }
        } finally {
            f121008c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m130528u(C25734e c25734e, JSONObject jSONObject) {
        try {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    m130529v(optJSONObject.optJSONArray("birthday_on"));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("[BirthdayHub]", e11);
            }
        } finally {
            m130525r(c25734e);
            f121008c = false;
        }
    }

    /* renamed from: v */
    private final void m130529v(JSONArray jSONArray) {
        int optInt;
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                if (optJSONObject != null && (optInt = optJSONObject.optInt("uid")) > 0) {
                    arrayList.add(Integer.valueOf(optInt));
                }
            }
            C25227e.Companion.m130506a().m130504l(m130530w(arrayList));
            m130524q();
        }
    }

    /* renamed from: w */
    private final List m130530w(List list) {
        int i11;
        int i12;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        Calendar m134869f = C26231b.f124604a.m134869f();
        int i13 = m134869f.get(1);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int intValue = ((Number) it.next()).intValue();
            C26231b c26231b = C26231b.f124604a;
            ContactProfile m134874l = c26231b.m134874l(String.valueOf(intValue));
            if (m134874l != null) {
                try {
                    int m134871h = c26231b.m134871h(m134874l, m134869f);
                    int m134873k = c26231b.m134873k(m134874l, m134869f);
                    m134869f.set(1, i13);
                    m134869f.set(2, m134873k);
                    m134869f.set(5, m134871h);
                    AbstractC23160o0.m119283q1(m134869f);
                    long timeInMillis = m134869f.getTimeInMillis();
                    String m120002o = AbstractC23262x6.m120002o(m134874l.m40385R(true, false, C18631a.m98446i().f93755g.get()));
                    AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                    int length = m120002o.length() - 1;
                    int i14 = 0;
                    boolean z12 = false;
                    while (i14 <= length) {
                        if (!z12) {
                            i12 = i14;
                        } else {
                            i12 = length;
                        }
                        if (AbstractC19074t.m100209g(m120002o.charAt(i12), 32) <= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z12) {
                            if (!z11) {
                                z12 = true;
                            } else {
                                i14++;
                            }
                        } else {
                            if (!z11) {
                                break;
                            }
                            length--;
                        }
                    }
                    arrayList.add(new a(intValue, timeInMillis, m120002o.subSequence(i14, length + 1).toString()));
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("[BirthdayHub]", e11);
                }
            }
        }
        final b bVar = b.f121013q;
        AbstractC25376w.m131534w(arrayList, new Comparator() { // from class: qd.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m130531x;
                m130531x = C25231i.m130531x(InterfaceC18509p.this, obj, obj2);
                return m130531x;
            }
        });
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (i11 = 0; i11 < size && i11 < 102; i11++) {
            arrayList2.add(Integer.valueOf(((a) arrayList.get(i11)).m130537c()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final int m130531x(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m130532y() {
        try {
            C25734e m130516i = m130516i();
            if (m130516i.m132844b() != null && (!r2.isEmpty())) {
                C25227e.Companion.m130506a().m130501h(m130516i, new c(m130516i), d.f121015q);
            } else {
                m130526s(this, null, 1, null);
                f121008c = false;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
            f121007b.m142181c(112);
            f121008c = false;
        }
    }

    /* renamed from: f */
    public final void m130533f(final ContactProfile contactProfile) {
        final List m130502i;
        Object obj;
        AbstractC19074t.m100208f(contactProfile, "newProfile");
        try {
            if (C24726a.f118764a.m128460b() && !AbstractC19074t.m100204b(contactProfile.mo2478b(), CoreUtility.f89233i) && (m130502i = C25227e.Companion.m130506a().m130502i()) != null) {
                Iterator it = m130502i.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC19074t.m100204b(String.valueOf(((Number) obj).intValue()), contactProfile.mo2478b())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    final int intValue = num.intValue();
                    AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: qd.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C25231i.m130515g(ContactProfile.this, m130502i, intValue);
                        }
                    });
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    /* renamed from: h */
    public final void m130534h() {
        if (f121008c || AbstractC23304d.f113427q1.get() || !C24726a.f118764a.m128460b() || m130520m()) {
            return;
        }
        if ((m130522o() && m130521n() && m130523p()) || !f121007b.m142179a()) {
            return;
        }
        f121008c = true;
        f121009d = true;
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: qd.f
            @Override // java.lang.Runnable
            public final void run() {
                C25231i.this.m130532y();
            }
        });
    }
}
