package vg;

import ag0.AbstractC0826k;
import ag0.AbstractC0852x;
import ag0.C0843s0;
import am.C0943w;
import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import me0.AbstractC23262x6;
import p055ce.C3432a;
import p055ce.C3442k;
import p142ey.C18635e;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p304ks.C21928n;
import p348mi.AbstractC23304d;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import p716zh.C32134u7;
import pm0.C24848g0;

/* renamed from: vg.u6 */
/* loaded from: classes3.dex */
public final class C28203u6 {

    /* renamed from: a */
    public static final C28203u6 f131407a = new C28203u6();

    /* renamed from: b */
    private static final Map f131408b;

    /* renamed from: c */
    private static final Map f131409c;

    /* renamed from: d */
    private static final ArrayList f131410d;

    static {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap(30, 0.75f, true));
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        f131408b = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap(30, 0.75f, true));
        AbstractC19074t.m100207e(synchronizedMap2, "synchronizedMap(...)");
        f131409c = synchronizedMap2;
        f131410d = new ArrayList();
    }

    private C28203u6() {
    }

    /* renamed from: e */
    public static /* synthetic */ ContactProfile m141798e(C28203u6 c28203u6, String str, TrackingSource trackingSource, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            trackingSource = null;
        }
        return c28203u6.m141810d(str, trackingSource);
    }

    /* renamed from: f */
    private final ContactProfile m141799f(String str) {
        ContactProfile contactProfile;
        ContactProfile contactProfile2 = null;
        if (!C18644n.m98531l().m98551n().get()) {
            contactProfile = C21928n.Companion.m114389a().m114376e(str);
        } else {
            contactProfile = null;
        }
        if (contactProfile == null && !C18644n.m98531l().m98550m().get()) {
            contactProfile = C7960e.m41971c6().m42199M5(str, "contact_profile_block");
        }
        if (contactProfile == null) {
            ContactProfile m42199M5 = C7960e.m41971c6().m42199M5(str, "contact_profile_5");
            if (m42199M5 != null) {
                m42199M5.f42425n1 = 0;
                Map map = f131408b;
                String str2 = m42199M5.f42434r;
                AbstractC19074t.m100207e(str2, "uid");
                map.put(str2, m42199M5);
                contactProfile2 = m42199M5;
            }
            return contactProfile2;
        }
        return contactProfile;
    }

    /* renamed from: i */
    public static /* synthetic */ ContactProfile m141800i(C28203u6 c28203u6, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return c28203u6.m141812h(str, z11);
    }

    /* renamed from: m */
    public static /* synthetic */ ContactProfile m141801m(C28203u6 c28203u6, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return c28203u6.m141815l(str, z11);
    }

    /* renamed from: p */
    public static /* synthetic */ ContactProfile m141802p(C28203u6 c28203u6, String str, InterfaceC18494a interfaceC18494a, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC18494a = null;
        }
        return c28203u6.m141817o(str, interfaceC18494a);
    }

    /* renamed from: A */
    public final void m141803A(String str, String str2) {
        AbstractC19074t.m100208f(str, "uid");
        try {
            ContactProfile contactProfile = (ContactProfile) f131408b.get(str);
            if (contactProfile != null) {
                contactProfile.f42455y = str2;
            }
            ContactProfile mo98491j = C18644n.m98531l().m98554q().mo98491j(str);
            if (mo98491j != null) {
                mo98491j.f42455y = str2;
            }
            ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(str);
            if (m153138j != null) {
                m153138j.f42455y = str2;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: B */
    public final void m141804B(String str, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        try {
            ContactProfile contactProfile = (ContactProfile) f131408b.get(str);
            if (contactProfile != null) {
                contactProfile.f42425n1 = i11;
            }
            ContactProfile mo98491j = C18644n.m98531l().m98554q().mo98491j(str);
            if (mo98491j != null) {
                mo98491j.f42425n1 = i11;
            }
            ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(str);
            if (m153138j != null) {
                m153138j.f42425n1 = i11;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: C */
    public final void m141805C(String str, String str2) {
        AbstractC19074t.m100208f(str, "uid");
        try {
            ContactProfile contactProfile = (ContactProfile) f131408b.get(str);
            if (contactProfile != null) {
                contactProfile.f42433q1 = str2;
            }
            ContactProfile mo98491j = C18644n.m98531l().m98554q().mo98491j(str);
            if (mo98491j != null) {
                mo98491j.f42433q1 = str2;
            }
            ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(str);
            if (m153138j != null) {
                m153138j.f42433q1 = str2;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: D */
    public final void m141806D(String str, boolean z11) {
        ContactProfile contactProfile;
        if (str != null && str.length() != 0 && (contactProfile = (ContactProfile) f131408b.get(str)) != null) {
            contactProfile.f42450w0 = z11 ? 1 : 0;
        }
    }

    /* renamed from: a */
    public final void m141807a() {
        f131408b.clear();
        f131409c.clear();
    }

    /* renamed from: b */
    public final String m141808b(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        String str2 = null;
        ContactProfile m141798e = m141798e(this, str, null, 2, null);
        if (m141798e != null) {
            str2 = m141798e.f42446v;
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: c */
    public final ContactProfile m141809c(String str) {
        return m141798e(this, str, null, 2, null);
    }

    /* renamed from: d */
    public final ContactProfile m141810d(String str, TrackingSource trackingSource) {
        if (str != null && str.length() != 0 && TextUtils.isDigitsOnly(str)) {
            ContactProfile m141812h = m141812h(str, false);
            if (m141812h == null && (m141812h = m141799f(str)) == null && trackingSource != null) {
                C0843s0.m2286r().m2294e(new AbstractC0826k.c(str, trackingSource));
            }
            return m141812h;
        }
        return null;
    }

    /* renamed from: g */
    public final ContactProfile m141811g(String str) {
        return m141800i(this, str, false, 2, null);
    }

    /* renamed from: h */
    public final ContactProfile m141812h(String str, boolean z11) {
        if (z11 && (str == null || str.length() == 0 || !TextUtils.isDigitsOnly(str))) {
            return null;
        }
        if (AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            return AbstractC23304d.f113368c0;
        }
        ContactProfile m98552o = C18644n.m98531l().m98552o(str);
        if (m98552o == null) {
            ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(str);
            if (m153138j == null) {
                return (ContactProfile) f131408b.get(str);
            }
            return m153138j;
        }
        return m98552o;
    }

    /* renamed from: j */
    public final C18635e m141813j(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        C18635e c18635e = new C18635e();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ContactProfile m141800i = m141800i(this, str, false, 2, null);
            if (m141800i != null) {
                c18635e.add(m141800i);
            } else {
                arrayList2.add(str);
            }
        }
        if (arrayList2.size() > 0) {
            ArrayList m42209N5 = C7960e.m41971c6().m42209N5(arrayList2, "contact_profile_5");
            Iterator it2 = m42209N5.iterator();
            while (it2.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it2.next();
                contactProfile.f42425n1 = 0;
                Map map = f131408b;
                String str2 = contactProfile.f42434r;
                AbstractC19074t.m100207e(str2, "uid");
                AbstractC19074t.m100205c(contactProfile);
                map.put(str2, contactProfile);
            }
            c18635e.addAll(m42209N5);
        }
        return c18635e;
    }

    /* renamed from: k */
    public final ContactProfile m141814k(String str) {
        ContactProfile contactProfile;
        ContactProfile contactProfile2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (!C18644n.m98531l().m98551n().get()) {
            contactProfile = C21928n.Companion.m114389a().m114377f(str);
        } else {
            contactProfile = null;
        }
        if (contactProfile == null && !C18644n.m98531l().m98550m().get()) {
            contactProfile = C7960e.m41971c6().m42219O5(str, "contact_profile_block");
        }
        if (contactProfile == null) {
            ContactProfile m42219O5 = C7960e.m41971c6().m42219O5(str, "contact_profile_5");
            if (m42219O5 != null) {
                m42219O5.f42425n1 = 0;
                Map map = f131408b;
                String str2 = m42219O5.f42434r;
                AbstractC19074t.m100207e(str2, "uid");
                map.put(str2, m42219O5);
                contactProfile2 = m42219O5;
            }
            return contactProfile2;
        }
        return contactProfile;
    }

    /* renamed from: l */
    public final ContactProfile m141815l(String str, boolean z11) {
        ContactProfile m141800i;
        String m153793y;
        ContactProfile contactProfile = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            if (AbstractC25495a.m132079d(str)) {
                C0943w c0943w = C0943w.f3447a;
                C31973j5 m4473g = c0943w.m4473g(str);
                if (m4473g == null && z11) {
                    m4473g = c0943w.m4472f(str);
                }
                if (m4473g == null || (m153793y = m4473g.m153793y()) == null || m153793y.length() <= 0) {
                    return null;
                }
                Map map = f131409c;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new ContactProfile(str);
                    map.put(str, obj);
                }
                ContactProfile contactProfile2 = (ContactProfile) obj;
                try {
                    contactProfile2.f42437s = m4473g.m153793y();
                    contactProfile2.f42446v = m4473g.m153756e();
                    return contactProfile2;
                } catch (Exception e11) {
                    e = e11;
                    contactProfile = contactProfile2;
                    AbstractC20110a.f98889a.mo104553f(e, "ProfileManager: getConversationProfile ownerId invalid", new Object[0]);
                    return contactProfile;
                }
            }
            if (z11) {
                m141800i = m141798e(this, str, null, 2, null);
            } else {
                m141800i = m141800i(this, str, false, 2, null);
            }
            return m141800i;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: n */
    public final ContactProfile m141816n(String str, InterfaceC18494a interfaceC18494a) {
        ContactProfile contactProfile;
        AbstractC19074t.m100208f(str, "uid");
        if (str.length() == 0) {
            AbstractC20110a.f98889a.mo104552e(new Exception("ProfileManager: getContactProfileOrPutDefault uid invalid"));
            return new ContactProfile("");
        }
        ContactProfile m141798e = m141798e(this, str, null, 2, null);
        if (m141798e == null) {
            if (interfaceC18494a == null || (contactProfile = (ContactProfile) interfaceC18494a.mo12V4()) == null) {
                contactProfile = new ContactProfile(str);
            }
            m141798e = contactProfile;
            m141798e.f42425n1 = 0;
            Map map = f131408b;
            String str2 = m141798e.f42434r;
            AbstractC19074t.m100207e(str2, "uid");
            map.put(str2, m141798e);
        }
        return m141798e;
    }

    /* renamed from: o */
    public final ContactProfile m141817o(String str, InterfaceC18494a interfaceC18494a) {
        ContactProfile contactProfile;
        AbstractC19074t.m100208f(str, "ownerId");
        if (str.length() == 0) {
            AbstractC20110a.f98889a.mo104552e(new Exception("ProfileManager: getConversationProfile ownerId invalid"));
            return new ContactProfile("");
        }
        ContactProfile m141801m = m141801m(this, str, false, 2, null);
        if (m141801m == null) {
            if (interfaceC18494a == null || (contactProfile = (ContactProfile) interfaceC18494a.mo12V4()) == null) {
                contactProfile = new ContactProfile(str);
            }
            m141801m = contactProfile;
            if (AbstractC25495a.m132079d(str)) {
                f131409c.put(str, m141801m);
            } else {
                f131408b.put(str, m141801m);
            }
        }
        return m141801m;
    }

    /* renamed from: q */
    public final boolean m141818q(String str) {
        ContactProfile m141800i;
        AbstractC19074t.m100208f(str, "uid");
        if (!C3432a.f14402a.m17234c() || (m141800i = m141800i(this, str, false, 2, null)) == null || !m141800i.m40357A0()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m141819r(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return f131410d.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public final ContactProfile m141820s() {
        Random random;
        List m114303A;
        int size;
        int nextInt;
        ContactProfile contactProfile;
        try {
            random = new Random();
            m114303A = C21927m.m114302u().m114303A();
            AbstractC19074t.m100207e(m114303A, "getOnlineFriend(...)");
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        synchronized (m114303A) {
            try {
                ArrayList arrayList = new ArrayList(C21927m.m114302u().m114303A());
                if (arrayList.isEmpty()) {
                    C21927m.m114302u().m114366x0();
                } else {
                    int size2 = arrayList.size();
                    int nextInt2 = random.nextInt(size2);
                    if (nextInt2 >= 0 && nextInt2 < size2) {
                        C32134u7 c32134u7 = (C32134u7) arrayList.get(nextInt2);
                        if (!TextUtils.isEmpty(c32134u7.f148218a)) {
                            return m141798e(f131407a, c32134u7.f148218a, null, 2, null);
                        }
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                C18635e m98553p = C18644n.m98531l().m98553p();
                if (m98553p != null && !m98553p.isEmpty() && (nextInt = random.nextInt((size = m98553p.size()))) >= 0 && nextInt < size && (contactProfile = (ContactProfile) m98553p.get(nextInt)) != null && C18644n.m98531l().m98558u(contactProfile.f42434r)) {
                    return contactProfile;
                }
                List m4475i = C0943w.f3447a.m4475i();
                if (m4475i.size() > 0) {
                    Iterator it = m4475i.iterator();
                    int size3 = m4475i.size();
                    int nextInt3 = random.nextInt(size3);
                    if (nextInt3 >= 0 && nextInt3 < size3) {
                        int i11 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (i11 == nextInt3) {
                                C31973j5 c31973j5 = (C31973j5) it.next();
                                if (!TextUtils.isEmpty(c31973j5.m153781r())) {
                                    ContactProfile contactProfile2 = new ContactProfile(1, c31973j5.m153781r());
                                    contactProfile2.f42437s = c31973j5.m153793y();
                                    contactProfile2.f42446v = c31973j5.m153756e();
                                    return contactProfile2;
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }

    /* renamed from: t */
    public final void m141821t(String str, String str2) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "oldPhone");
        try {
            ContactProfile contactProfile = (ContactProfile) f131408b.get(str);
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42455y) && AbstractC19074t.m100204b(contactProfile.f42455y, str2)) {
                contactProfile.f42455y = "";
            }
            ContactProfile mo98491j = C18644n.m98531l().m98554q().mo98491j(str);
            if (mo98491j != null && !TextUtils.isEmpty(mo98491j.f42455y) && AbstractC19074t.m100204b(mo98491j.f42455y, str2)) {
                mo98491j.f42455y = "";
            }
            ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(str);
            if (m153138j != null && !TextUtils.isEmpty(m153138j.f42455y) && AbstractC19074t.m100204b(m153138j.f42455y, str2)) {
                m153138j.f42455y = "";
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: u */
    public final void m141822u(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        if (contactProfile.m40435x0()) {
            ArrayList arrayList = f131410d;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
                return;
            }
            return;
        }
        f131410d.remove(str);
    }

    /* renamed from: v */
    public final void m141823v(ContactProfile contactProfile, boolean z11) {
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        AbstractC19074t.m100208f(contactProfile, "contact");
        Map map = f131408b;
        ContactProfile contactProfile2 = (ContactProfile) map.get(contactProfile.f42434r);
        if (contactProfile2 != null) {
            contactProfile2.f42437s = contactProfile.f42437s;
            contactProfile2.f42446v = contactProfile.f42446v;
            contactProfile2.f42449w = contactProfile.f42449w;
            contactProfile2.f42452x = contactProfile.f42452x;
            contactProfile2.f42455y = contactProfile.f42455y;
            contactProfile2.f42458z = contactProfile.f42458z;
            contactProfile2.f42324B = contactProfile.f42324B;
            contactProfile2.f42336F = contactProfile.f42336F;
            contactProfile2.f42339G = contactProfile.f42339G;
            contactProfile2.f42330D = contactProfile.f42330D;
            contactProfile2.f42321A = contactProfile.f42321A;
            contactProfile2.f42352K0 = contactProfile.f42352K0;
            contactProfile2.f42355L0 = contactProfile.f42355L0;
            contactProfile2.f42385V0 = contactProfile.f42385V0;
            contactProfile2.f42453x0 = contactProfile.f42453x0;
            contactProfile2.f42351K = contactProfile.f42351K;
            contactProfile2.f42433q1 = contactProfile.f42433q1;
            contactProfile2.f42361N0 = contactProfile.f42361N0;
            contactProfile2.f42364O0 = contactProfile.f42364O0;
            if (!TextUtils.isEmpty(contactProfile.f42383U1)) {
                contactProfile2.f42383U1 = contactProfile.f42383U1;
                contactProfile2.f42389W1 = contactProfile.f42389W1;
            } else if (!TextUtils.isEmpty(contactProfile2.f42383U1)) {
                contactProfile.f42383U1 = contactProfile2.f42383U1;
                contactProfile.f42389W1 = contactProfile2.f42389W1;
            }
            contactProfile2.m40434x(contactProfile);
            if (!TextUtils.isEmpty(contactProfile.f42460z1)) {
                contactProfile2.f42460z1 = contactProfile.f42460z1;
            }
            contactProfile2.f42394Y0 = contactProfile.f42394Y0;
            contactProfile2.f42352K0 = contactProfile.f42352K0;
            contactProfile2.f42415i1 = contactProfile.f42415i1;
            contactProfile2.f42395Y1 = contactProfile.f42395Y1;
        }
        ContactProfile m98552o = C18644n.m98531l().m98552o(contactProfile.f42434r);
        boolean z14 = true;
        boolean z15 = false;
        if (m98552o != null) {
            if (!AbstractC19074t.m100204b(m98552o.f42437s, contactProfile.f42437s) && !TextUtils.isEmpty(contactProfile.f42437s)) {
                m98552o.f42437s = contactProfile.f42437s;
                String m120002o = AbstractC23262x6.m120002o(AbstractC21935u.m114539f(m98552o.f42455y, contactProfile.f42434r, contactProfile.f42437s));
                AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                int length = m120002o.length() - 1;
                int i13 = 0;
                boolean z16 = false;
                while (i13 <= length) {
                    if (!z16) {
                        i12 = i13;
                    } else {
                        i12 = length;
                    }
                    if (AbstractC19074t.m100209g(m120002o.charAt(i12), 32) <= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z16) {
                        if (!z13) {
                            z16 = true;
                        } else {
                            i13++;
                        }
                    } else if (!z13) {
                        break;
                    } else {
                        length--;
                    }
                }
                m98552o.f42440t = m120002o.subSequence(i13, length + 1).toString();
                z15 = true;
            }
            if (!AbstractC19074t.m100204b(m98552o.f42446v, contactProfile.f42446v) && !TextUtils.isEmpty(contactProfile.f42446v)) {
                m98552o.f42446v = contactProfile.f42446v;
                z15 = true;
            }
            if (z11 && ((contactProfile.f42341G1 == 1 || !TextUtils.isEmpty(contactProfile.f42455y)) && !AbstractC19074t.m100204b(m98552o.f42455y, contactProfile.f42455y))) {
                m98552o.f42455y = contactProfile.f42455y;
                AbstractC0852x.m2330G();
                z15 = true;
            }
            if (m98552o.f42361N0 == contactProfile.f42361N0) {
                C3442k c3442k = C3442k.f14460a;
                if (c3442k.m17298c(m98552o) == c3442k.m17298c(contactProfile)) {
                    z14 = z15;
                }
            }
            m98552o.f42449w = contactProfile.f42449w;
            m98552o.f42452x = contactProfile.f42452x;
            m98552o.f42458z = contactProfile.f42458z;
            m98552o.f42324B = contactProfile.f42324B;
            m98552o.f42336F = contactProfile.f42336F;
            m98552o.f42339G = contactProfile.f42339G;
            m98552o.f42330D = contactProfile.f42330D;
            m98552o.f42321A = contactProfile.f42321A;
            m98552o.f42352K0 = contactProfile.f42352K0;
            m98552o.f42355L0 = contactProfile.f42355L0;
            m98552o.f42385V0 = contactProfile.f42385V0;
            m98552o.f42453x0 = contactProfile.f42453x0;
            m98552o.m40434x(contactProfile);
            if (!TextUtils.isEmpty(contactProfile.f42460z1)) {
                m98552o.f42460z1 = contactProfile.f42460z1;
            }
            m98552o.f42394Y0 = contactProfile.f42394Y0;
            m98552o.f42415i1 = contactProfile.f42415i1;
            m98552o.f42395Y1 = contactProfile.f42395Y1;
            m98552o.f42361N0 = contactProfile.f42361N0;
            m98552o.f42364O0 = contactProfile.f42364O0;
            m98552o.f42400b0 = contactProfile.f42400b0;
            if (!TextUtils.isEmpty(contactProfile.f42383U1)) {
                m98552o.f42383U1 = contactProfile.f42383U1;
                m98552o.f42389W1 = contactProfile.f42389W1;
            } else if (!TextUtils.isEmpty(m98552o.f42383U1)) {
                contactProfile.f42383U1 = m98552o.f42383U1;
                contactProfile.f42389W1 = m98552o.f42389W1;
            }
        } else {
            ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(contactProfile.f42434r);
            if (m153138j != null) {
                if (!AbstractC19074t.m100204b(m153138j.f42437s, contactProfile.f42437s) && !TextUtils.isEmpty(contactProfile.f42437s)) {
                    m153138j.f42437s = contactProfile.f42437s;
                    if (m153138j.m40390U0()) {
                        String m120002o2 = AbstractC23262x6.m120002o(AbstractC21935u.m114539f(m153138j.f42455y, contactProfile.f42434r, contactProfile.f42437s));
                        AbstractC19074t.m100207e(m120002o2, "convertSignToNoSign(...)");
                        int length2 = m120002o2.length() - 1;
                        int i14 = 0;
                        boolean z17 = false;
                        while (i14 <= length2) {
                            if (!z17) {
                                i11 = i14;
                            } else {
                                i11 = length2;
                            }
                            if (AbstractC19074t.m100209g(m120002o2.charAt(i11), 32) <= 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z17) {
                                if (!z12) {
                                    z17 = true;
                                } else {
                                    i14++;
                                }
                            } else if (!z12) {
                                break;
                            } else {
                                length2--;
                            }
                        }
                        m153138j.f42440t = m120002o2.subSequence(i14, length2 + 1).toString();
                        z15 = true;
                    }
                }
                if (!AbstractC19074t.m100204b(m153138j.f42446v, contactProfile.f42446v) && !TextUtils.isEmpty(contactProfile.f42446v)) {
                    m153138j.f42446v = contactProfile.f42446v;
                    if (m153138j.m40390U0()) {
                        z15 = true;
                    }
                }
                if (z11 && (contactProfile.f42341G1 == 1 || !TextUtils.isEmpty(contactProfile.f42455y))) {
                    m153138j.f42455y = contactProfile.f42455y;
                    AbstractC0852x.m2330G();
                    z15 = true;
                }
                if (m153138j.f42361N0 == contactProfile.f42361N0) {
                    C3442k c3442k2 = C3442k.f14460a;
                    if (c3442k2.m17298c(m153138j) == c3442k2.m17298c(contactProfile)) {
                        z14 = z15;
                    }
                }
                m153138j.f42449w = contactProfile.f42449w;
                m153138j.f42452x = contactProfile.f42452x;
                m153138j.f42458z = contactProfile.f42458z;
                m153138j.f42324B = contactProfile.f42324B;
                m153138j.f42336F = contactProfile.f42336F;
                m153138j.f42339G = contactProfile.f42339G;
                m153138j.f42330D = contactProfile.f42330D;
                m153138j.f42321A = contactProfile.f42321A;
                m153138j.f42352K0 = contactProfile.f42352K0;
                m153138j.f42355L0 = contactProfile.f42355L0;
                m153138j.f42385V0 = contactProfile.f42385V0;
                m153138j.f42453x0 = contactProfile.f42453x0;
                m153138j.m40434x(contactProfile);
                if (!TextUtils.isEmpty(contactProfile.f42460z1)) {
                    m153138j.f42460z1 = contactProfile.f42460z1;
                }
                m153138j.f42394Y0 = contactProfile.f42394Y0;
                m153138j.f42415i1 = contactProfile.f42415i1;
                m153138j.f42395Y1 = contactProfile.f42395Y1;
                m153138j.f42361N0 = contactProfile.f42361N0;
                m153138j.f42364O0 = contactProfile.f42364O0;
                if (!TextUtils.isEmpty(contactProfile.f42383U1)) {
                    m153138j.f42383U1 = contactProfile.f42383U1;
                    m153138j.f42389W1 = contactProfile.f42389W1;
                } else if (!TextUtils.isEmpty(m153138j.f42383U1)) {
                    contactProfile.f42383U1 = m153138j.f42383U1;
                    contactProfile.f42389W1 = m153138j.f42389W1;
                }
            } else {
                contactProfile.f42425n1 = 0;
                String str = contactProfile.f42434r;
                AbstractC19074t.m100207e(str, "uid");
                map.put(str, contactProfile);
                return;
            }
        }
        if (z14) {
            C18644n.m98524E();
        }
    }

    /* renamed from: w */
    public final void m141824w(ContactProfile contactProfile) {
        if (contactProfile == null) {
            return;
        }
        try {
            if (C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r)) {
                ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(contactProfile.f42434r);
                m153138j.f42437s = contactProfile.f42437s;
                m153138j.f42446v = contactProfile.f42446v;
                m153138j.f42455y = contactProfile.f42455y;
                m153138j.f42458z = contactProfile.f42458z;
                m153138j.f42336F = contactProfile.f42336F;
                m153138j.f42330D = contactProfile.f42330D;
                m153138j.f42425n1 = 2;
                if (!TextUtils.isEmpty(contactProfile.f42383U1)) {
                    m153138j.f42383U1 = contactProfile.f42383U1;
                    m153138j.f42389W1 = contactProfile.f42389W1;
                }
            } else {
                contactProfile.f42425n1 = 2;
                C21927m.m114302u().m114312J().add(contactProfile);
            }
            f131408b.remove(contactProfile.f42434r);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: x */
    public final void m141825x(String str, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        try {
            ContactProfile contactProfile = (ContactProfile) f131408b.get(str);
            if (contactProfile != null) {
                contactProfile.f42382U0 = i11;
            }
            ContactProfile mo98491j = C18644n.m98531l().m98554q().mo98491j(str);
            if (mo98491j != null) {
                mo98491j.f42382U0 = i11;
            }
            ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(str);
            if (m153138j != null) {
                m153138j.f42382U0 = i11;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: y */
    public final void m141826y(String str, String str2) {
        AbstractC19074t.m100208f(str, "uid");
        try {
            ContactProfile contactProfile = (ContactProfile) f131408b.get(str);
            if (contactProfile != null) {
                contactProfile.f42367P0 = str2;
            }
            ContactProfile mo98491j = C18644n.m98531l().m98553p().mo98491j(str);
            if (mo98491j != null) {
                mo98491j.f42367P0 = str2;
            }
            ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(str);
            if (m153138j != null) {
                m153138j.f42367P0 = str2;
            }
            C7960e.m41971c6().m42374dd(str, str2);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: z */
    public final void m141827z(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "uid");
    }
}
