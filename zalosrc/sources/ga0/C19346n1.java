package ga0;

import am.AbstractC0906d0;
import am.C0943w;
import android.text.SpannableStringBuilder;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import ga0.C19372y0;
import gw.C19669z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.AbstractC23210s6;
import me0.AbstractC23262x6;
import me0.C23024b7;
import me0.C23282z6;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p142ey.C18635e;
import p142ey.C18644n;
import p304ks.C21913a0;
import p304ks.C21916c;
import p348mi.AbstractC23304d;
import p348mi.C23302b;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29072d;
import p612wk.AbstractC29075g;
import p612wk.AbstractC29076h;
import p716zh.C31901e8;
import p716zh.C31934gb;
import p716zh.C31973j5;
import p716zh.C32093r8;
import pm0.C24848g0;
import qm0.AbstractC25376w;
import tk.C26726e;
import vg.C28213v7;

/* renamed from: ga0.n1 */
/* loaded from: classes6.dex */
public final class C19346n1 extends AbstractC19358r1 {

    /* renamed from: t */
    private final List f96093t;

    /* renamed from: u */
    private final HashMap f96094u;

    /* renamed from: v */
    private final List f96095v;

    /* renamed from: w */
    private final String f96096w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga0.n1$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final a f96097q = new a();

        a() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo240pC(ContactProfile contactProfile, ContactProfile contactProfile2) {
            int m127121q;
            String str = contactProfile.f42437s;
            String str2 = contactProfile2.f42437s;
            AbstractC19074t.m100205c(str);
            AbstractC19074t.m100205c(str2);
            m127121q = AbstractC24341v.m127121q(str, str2, true);
            return Integer.valueOf(m127121q);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19346n1(InterfaceC18319c interfaceC18319c, String str, List list, HashMap hashMap, List list2) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(list, "listStrangersThreadChat");
        AbstractC19074t.m100208f(hashMap, "mapUidContact");
        AbstractC19074t.m100208f(list2, "infoArrToCheck");
        this.f96093t = list;
        this.f96094u = hashMap;
        this.f96095v = list2;
        String m120002o = AbstractC23262x6.m120002o(str);
        AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
        this.f96096w = m120002o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final int m101363o(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* renamed from: p */
    private final void m101364p(C19325g1 c19325g1, List list) {
        try {
            if (isCancelled()) {
                return;
            }
            ArrayList<ContactProfile> arrayList = new ArrayList();
            C18635e m118350b = AbstractC23063f2.m118350b(c19325g1.m101188N());
            c19325g1.m101238s0(true);
            AbstractC23262x6.m119979N(this.f96096w, m118350b, arrayList, C19669z.f97573U, this.f96095v, C19322f1.f95950a.m101134I() | 32800, this);
            for (ContactProfile contactProfile : arrayList) {
                if (isCancelled()) {
                    return;
                }
                if (!C18644n.m98531l().m98558u(contactProfile.f42434r)) {
                    contactProfile.f42436r1 = new SpannableStringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_want_to_be_friend));
                    list.add(contactProfile);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    private final void m101365q(C19325g1 c19325g1, List list) {
        try {
            if (isCancelled()) {
                return;
            }
            ArrayList m118351c = AbstractC23063f2.m118351c(c19325g1.m101189O());
            c19325g1.m101240t0(false);
            AbstractC23262x6.m119979N(this.f96096w, m118351c, list, C19669z.f97573U, C19372y0.Companion.m101489f(c19325g1, m101455l()), C19322f1.f95950a.m101134I() | 32800, this);
            if (isCancelled()) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it.next();
                if (!C18644n.m98531l().m98558u(contactProfile.f42434r)) {
                    contactProfile.f42436r1 = new SpannableStringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_have_sent_friend_invitation));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d A[SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m101366s(C19325g1 c19325g1, List list) {
        int i11;
        int i12;
        float f11;
        int i13;
        if (!list.isEmpty()) {
            list.clear();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            List<ContactProfile> m101368n = m101368n();
            if (!isCancelled() && C21916c.m114210e().m114220k()) {
                List<C32093r8> m101489f = C19372y0.Companion.m101489f(c19325g1, m101455l());
                try {
                    for (ContactProfile contactProfile : m101368n) {
                        if (isCancelled()) {
                            break;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        String str = contactProfile.f42437s;
                        contactProfile.f42405d1 = false;
                        contactProfile.f42387W = 0.0f;
                        arrayList.clear();
                        contactProfile.f42439s1 = new SpannableStringBuilder();
                        AbstractC23262x6.m119994g(this.f96096w, str, contactProfile, arrayList, new ArrayList(), 256);
                        if (contactProfile.f42387W > 0.0f) {
                            contactProfile.f42387W = 0.0f;
                            contactProfile.f42365O1 = 4;
                            Map map = AbstractC23304d.f113425q;
                            if (map.containsKey(contactProfile.f42434r) && map.get(contactProfile.f42434r) != null) {
                                Object obj = map.get(contactProfile.f42434r);
                                AbstractC19074t.m100205c(obj);
                                i11 = ((C32093r8) obj).f147886c;
                            } else {
                                i11 = 0;
                            }
                            if (i11 > 20) {
                                i11 = 20;
                            }
                            if (C19322f1.f95953d) {
                                sb2.append("-clickCount: ");
                                sb2.append(i11);
                            }
                            float f12 = 0.0f;
                            for (C32093r8 c32093r8 : m101489f) {
                                try {
                                    if (AbstractC19074t.m100204b(contactProfile.f42434r, c32093r8.f147884a) && AbstractC19074t.m100204b(contactProfile.f42437s, c32093r8.f147887d) && c32093r8.f147886c > 0) {
                                        float m120009v = AbstractC23262x6.m120009v(c32093r8.f147892i);
                                        ArrayList arrayList2 = c32093r8.f147893j;
                                        if (arrayList2 != null) {
                                            AbstractC19074t.m100205c(arrayList2);
                                            if (!arrayList2.isEmpty()) {
                                                Iterator it = c32093r8.f147893j.iterator();
                                                f11 = 0.0f;
                                                i13 = 0;
                                                while (it.hasNext()) {
                                                    Long l11 = (Long) it.next();
                                                    if (l11 == null) {
                                                        l11 = 0L;
                                                    }
                                                    AbstractC19074t.m100205c(l11);
                                                    int m118042N = C23024b7.m118042N(currentTimeMillis - l11.longValue());
                                                    Iterator it2 = it;
                                                    f11 += m118042N * m120009v;
                                                    if (C19322f1.f95953d) {
                                                        sb2.append("*");
                                                        sb2.append(m120009v);
                                                        sb2.append("-");
                                                        sb2.append(m118042N);
                                                    }
                                                    i13++;
                                                    it = it2;
                                                }
                                                if (i13 <= 0) {
                                                    f12 = (i11 * f11) / i13;
                                                }
                                            }
                                        }
                                        f11 = 0.0f;
                                        i13 = 0;
                                        if (i13 <= 0) {
                                        }
                                    }
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                            contactProfile.f42387W += f12;
                            if (AbstractC23210s6.f112470b) {
                                sb2.append(" - 3: ");
                                sb2.append(f12);
                            }
                            if (AbstractC23210s6.f112470b) {
                                sb2.append(" - Total: ");
                                sb2.append(contactProfile.f42387W);
                            }
                            ContactProfile m40356w = ContactProfile.m40356w(contactProfile);
                            m40356w.f42436r1 = new SpannableStringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_export_call_non_zalo_user) + ". " + AbstractC23136l9.m118743r0(AbstractC8020f0.str_strangers_in_phone_book));
                            m40356w.f42399a1.addAll(arrayList);
                            m40356w.f42393Y = true;
                            Integer num = (Integer) C19669z.f97573U.get(m40356w.f42434r);
                            if (num != null) {
                                i12 = num.intValue();
                            } else {
                                i12 = -1;
                            }
                            m40356w.f42390X = i12;
                            if (C19322f1.f95953d) {
                                sb2.append("-position msg: ");
                                sb2.append(m40356w.f42390X);
                            }
                            if (AbstractC23210s6.f112470b) {
                                m40356w.m40401d1(sb2.toString());
                            }
                            AbstractC19074t.m100205c(m40356w);
                            list.add(m40356w);
                        }
                        if (isCancelled()) {
                            break;
                        }
                    }
                    isCancelled();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    /* renamed from: t */
    private final void m101367t(C19325g1 c19325g1, List list) {
        if (c19325g1.m101190P()) {
            List<C31934gb> m114184g = C21913a0.m114177i().m114184g();
            c19325g1.m101229o().clear();
            AbstractC19074t.m100205c(m114184g);
            for (C31934gb c31934gb : m114184g) {
                if (!C18644n.m98531l().m98558u(c31934gb.f146729a)) {
                    List m101229o = c19325g1.m101229o();
                    ContactProfile contactProfile = new ContactProfile(c31934gb.f146729a);
                    contactProfile.f42434r = c31934gb.f146729a;
                    contactProfile.f42446v = c31934gb.f146733e;
                    contactProfile.f42455y = c31934gb.f146730b;
                    contactProfile.f42437s = c31934gb.f146732d;
                    contactProfile.f42460z1 = c31934gb.f146734f;
                    m101229o.add(contactProfile);
                }
            }
            c19325g1.m101242u0(false);
        }
        AbstractC23262x6.m119979N(this.f96096w, c19325g1.m101229o(), list, C19669z.f97573U, this.f96095v, C19322f1.f95950a.m101134I() | 32800, this);
    }

    /* renamed from: n */
    public final List m101368n() {
        Object obj;
        List m2802h;
        Set set;
        ArrayList arrayList = new ArrayList();
        try {
            obj = AbstractC23304d.f113449w;
            AbstractC19074t.m100207e(obj, "lockPhonebookNonFriend");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        synchronized (obj) {
            try {
                m2802h = AbstractC0906d0.m2802h(MainApplication.Companion.m35500c());
            } catch (Exception e12) {
                e12.printStackTrace();
            } finally {
            }
            if (m2802h != null && !m2802h.isEmpty()) {
                int size = m2802h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C31901e8 c31901e8 = (C31901e8) m2802h.get(i11);
                    C31901e8 m2800f = AbstractC0906d0.m2800f(MainApplication.Companion.m35500c(), c31901e8.m153298m());
                    if (m2800f != null && m2800f.m153300r() <= 0 && m2800f.m153301s() && !AbstractC19074t.m100204b(c31901e8.m153298m(), AbstractC23304d.f113394i0) && (((set = AbstractC23304d.f113441u) == null || !set.contains(m2800f.m153298m())) && !C21916c.m114210e().m114219j(m2800f.m153298m()))) {
                        ContactProfile contactProfile = new ContactProfile("/" + m2800f.m153298m());
                        contactProfile.f42455y = m2800f.m153297j();
                        contactProfile.f42437s = m2800f.m153295h();
                        contactProfile.f42446v = C23302b.f113247a.m120521a();
                        arrayList.add(contactProfile);
                    }
                }
                final a aVar = a.f96097q;
                AbstractC25376w.m131534w(arrayList, new Comparator() { // from class: ga0.m1
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        int m101363o;
                        m101363o = C19346n1.m101363o(InterfaceC18509p.this, obj2, obj3);
                        return m101363o;
                    }
                });
                C24848g0 c24848g0 = C24848g0.f119245a;
                return arrayList;
            }
            return arrayList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0256 A[Catch: Exception -> 0x0267, TRY_LEAVE, TryCatch #1 {Exception -> 0x0267, blocks: (B:90:0x01f5, B:92:0x0202, B:94:0x0211, B:98:0x024d, B:100:0x0256), top: B:89:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x0016, B:5:0x003c, B:7:0x0057, B:9:0x0063, B:12:0x0066, B:16:0x006d, B:18:0x0081, B:20:0x008f, B:22:0x009d, B:26:0x00ad, B:30:0x00b9, B:32:0x00ca, B:34:0x00d2, B:36:0x00de, B:38:0x00ea, B:41:0x00f5, B:43:0x00f8, B:45:0x00fc, B:51:0x0118, B:53:0x0122, B:55:0x0138, B:56:0x013f, B:58:0x0144, B:62:0x014e, B:65:0x0176, B:67:0x0197, B:69:0x01a4, B:71:0x01ac, B:75:0x01c1, B:77:0x01c5, B:78:0x01cd, B:118:0x028f, B:123:0x028c, B:132:0x0295, B:134:0x029e, B:135:0x02a6, B:137:0x02aa, B:138:0x02b4, B:140:0x02bf, B:142:0x02da, B:144:0x031d, B:146:0x0325, B:147:0x0336, B:149:0x033c, B:150:0x0346, B:152:0x034a, B:153:0x0351, B:155:0x0364, B:47:0x0112, B:28:0x00c4, B:173:0x0376), top: B:2:0x0016 }] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m101369r(C19325g1 c19325g1, boolean z11, List list) {
        CharSequence m127168X0;
        C26726e c26726e;
        String str;
        C18635e c18635e;
        String str2;
        String[] strArr;
        StringBuilder sb2;
        ContactProfile contactProfile;
        Object obj;
        CharSequence charSequence;
        int i11;
        int i12;
        int i13;
        int i14;
        float f11;
        int i15;
        C32093r8 c32093r8;
        int m127173b0;
        AbstractC19074t.m100208f(c19325g1, "searchSessionData");
        AbstractC19074t.m100208f(list, "result");
        String m101455l = m101455l();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Map synchronizedMap = Collections.synchronizedMap(new HashMap());
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) C23282z6.m120367c(m101455l, 16781312).m118488a().clone();
            int length = strArr2.length;
            int i16 = 0;
            String str3 = null;
            for (int i17 = 0; i17 < length; i17++) {
                String str4 = ' ' + strArr2[i17];
                strArr2[i17] = str4;
                if (str4.length() > i16) {
                    i16 = strArr2[i17].length();
                    str3 = strArr2[i17];
                }
            }
            if (isCancelled()) {
                return;
            }
            List m101489f = C19372y0.Companion.m101489f(c19325g1, m101455l());
            C18635e m98553p = C18644n.m98531l().m98553p();
            if (str3 != null) {
                m127168X0 = AbstractC24342w.m127168X0(str3);
                if (m127168X0.toString().length() > 0) {
                    StringBuilder m142176d = C28213v7.f131603a.m142176d();
                    int indexOf = m142176d.indexOf(str3);
                    while (indexOf >= 0) {
                        StringBuilder sb3 = new StringBuilder();
                        if (isCancelled()) {
                            return;
                        }
                        int i18 = indexOf;
                        while (true) {
                            if (i18 < 0) {
                                c26726e = null;
                                break;
                            }
                            Map map = C28213v7.f131604b;
                            if (map.containsKey(Integer.valueOf(i18))) {
                                c26726e = (C26726e) map.get(Integer.valueOf(i18));
                                break;
                            }
                            i18--;
                        }
                        if ((c26726e != null ? c26726e.m137460a() : null) != null && !synchronizedMap.containsKey(c26726e.m137460a().f42434r) && !m98553p.mo98490g(c26726e.m137460a().f42434r)) {
                            ContactProfile m137460a = c26726e.m137460a();
                            if (!(strArr2.length == 0)) {
                                for (String str5 : strArr2) {
                                    m127173b0 = AbstractC24342w.m127173b0(c26726e.m137461b(), str5, 0, false, 6, null);
                                    if (m127173b0 < 0) {
                                        contactProfile = null;
                                        break;
                                    }
                                }
                            }
                            contactProfile = m137460a;
                            if (contactProfile != null) {
                                Map map2 = C28213v7.f131605c;
                                if (map2.containsKey(contactProfile.f42434r)) {
                                    Object obj2 = map2.get(contactProfile.f42434r);
                                    AbstractC19074t.m100205c(obj2);
                                    List list2 = (List) obj2;
                                    if (!list2.isEmpty()) {
                                        obj = list2.get(0);
                                        charSequence = (CharSequence) obj;
                                        if (charSequence != null && charSequence.length() != 0 && contactProfile != null) {
                                            C31973j5 m4472f = C0943w.f3447a.m4472f((String) obj);
                                            String m40383Q = contactProfile.m40383Q(true, false);
                                            contactProfile.f42405d1 = false;
                                            contactProfile.f42387W = 0.0f;
                                            arrayList.clear();
                                            contactProfile.f42439s1 = new SpannableStringBuilder();
                                            str = m101455l;
                                            strArr = strArr2;
                                            sb2 = m142176d;
                                            c18635e = m98553p;
                                            str2 = str3;
                                            AbstractC23262x6.m119994g(m101455l, m40383Q, contactProfile, arrayList, new ArrayList(), 256 | (!z11 ? 16 : 0));
                                            if (contactProfile.f42387W <= 0.0f) {
                                                contactProfile.f42365O1 = 4;
                                                Map map3 = AbstractC23304d.f113425q;
                                                if (!map3.containsKey(contactProfile.f42434r) || map3.get(contactProfile.f42434r) == null) {
                                                    i11 = 0;
                                                } else {
                                                    Object obj3 = map3.get(contactProfile.f42434r);
                                                    AbstractC19074t.m100205c(obj3);
                                                    i11 = ((C32093r8) obj3).f147886c;
                                                }
                                                if (i11 > 20) {
                                                    i11 = 20;
                                                }
                                                if (C19322f1.f95953d) {
                                                    sb3.append("-clickCount: ");
                                                    sb3.append(i11);
                                                }
                                                int size = m101489f.size();
                                                int i19 = 0;
                                                float f12 = 0.0f;
                                                while (i19 < size) {
                                                    try {
                                                        C32093r8 c32093r82 = (C32093r8) m101489f.get(i19);
                                                        if (!AbstractC19074t.m100204b(contactProfile.f42434r, c32093r82.f147884a) || c32093r82.f147886c <= 0) {
                                                            i13 = size;
                                                        } else {
                                                            float m120009v = AbstractC23262x6.m120009v(c32093r82.f147892i);
                                                            ArrayList arrayList2 = c32093r82.f147893j;
                                                            if (arrayList2 != null) {
                                                                i13 = size;
                                                                try {
                                                                    AbstractC19074t.m100207e(arrayList2, "arrTimeStampClick");
                                                                    if (!arrayList2.isEmpty()) {
                                                                        int size2 = c32093r82.f147893j.size();
                                                                        int i21 = 0;
                                                                        int i22 = 0;
                                                                        int i23 = 0;
                                                                        float f13 = 0.0f;
                                                                        while (i21 < size2) {
                                                                            int i24 = size2;
                                                                            Long l11 = (Long) c32093r82.f147893j.get(i21);
                                                                            AbstractC19074t.m100205c(l11);
                                                                            long longValue = currentTimeMillis - l11.longValue();
                                                                            if (longValue <= 14400000) {
                                                                                i15 = 100;
                                                                            } else if (longValue <= 86400000) {
                                                                                i15 = 50;
                                                                            } else if (longValue <= 259200000) {
                                                                                i15 = 25;
                                                                            } else if (longValue > 259200000) {
                                                                                c32093r8 = c32093r82;
                                                                                i15 = 0;
                                                                                f13 += i15 * m120009v;
                                                                                if (!C19322f1.f95953d) {
                                                                                    sb3.append("*");
                                                                                    sb3.append(m120009v);
                                                                                    sb3.append("-");
                                                                                    sb3.append(i15);
                                                                                }
                                                                                i22++;
                                                                                i21++;
                                                                                c32093r82 = c32093r8;
                                                                                i23 = i15;
                                                                                size2 = i24;
                                                                            } else {
                                                                                i15 = i23;
                                                                            }
                                                                            c32093r8 = c32093r82;
                                                                            f13 += i15 * m120009v;
                                                                            if (!C19322f1.f95953d) {
                                                                            }
                                                                            i22++;
                                                                            i21++;
                                                                            c32093r82 = c32093r8;
                                                                            i23 = i15;
                                                                            size2 = i24;
                                                                        }
                                                                        i14 = i22;
                                                                        f11 = f13;
                                                                        if (i14 <= 0) {
                                                                            f12 = (i11 * f11) / i14;
                                                                        }
                                                                    }
                                                                } catch (Exception e11) {
                                                                    e = e11;
                                                                    e.printStackTrace();
                                                                    i19++;
                                                                    size = i13;
                                                                }
                                                            } else {
                                                                i13 = size;
                                                            }
                                                            i14 = 0;
                                                            f11 = 0.0f;
                                                            if (i14 <= 0) {
                                                            }
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        i13 = size;
                                                    }
                                                    i19++;
                                                    size = i13;
                                                }
                                                contactProfile.f42387W += f12;
                                                if (C19322f1.f95953d) {
                                                    sb3.append(" - 3: ");
                                                    sb3.append(f12);
                                                }
                                                if (C19322f1.f95953d) {
                                                    sb3.append(" - Total: ");
                                                    sb3.append(contactProfile.f42387W);
                                                }
                                                ContactProfile m40356w = ContactProfile.m40356w(contactProfile);
                                                int size3 = arrayList.size();
                                                for (int i25 = 0; i25 < size3; i25++) {
                                                    Object obj4 = arrayList.get(i25);
                                                    AbstractC19074t.m100207e(obj4, "get(...)");
                                                    m40356w.f42399a1.add(Integer.valueOf(((Number) obj4).intValue()));
                                                }
                                                C19067n0 c19067n0 = C19067n0.f94947a;
                                                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_des_stranger_in_group);
                                                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                                                AbstractC19074t.m100205c(m4472f);
                                                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m4472f.m153793y()}, 1));
                                                AbstractC19074t.m100207e(format, "format(...)");
                                                m40356w.f42436r1 = new SpannableStringBuilder(format);
                                                AbstractC19074t.m100205c(synchronizedMap);
                                                String str6 = m40356w.f42434r;
                                                synchronizedMap.put(str6, str6);
                                                m40356w.f42393Y = true;
                                                Map map4 = C19669z.f97573U;
                                                if (!map4.containsKey(m40356w.f42434r) || map4.get(m40356w.f42434r) == null) {
                                                    i12 = -1;
                                                } else {
                                                    Object obj5 = map4.get(m40356w.f42434r);
                                                    AbstractC19074t.m100205c(obj5);
                                                    i12 = ((Number) obj5).intValue();
                                                }
                                                m40356w.f42390X = i12;
                                                if (C19322f1.f95953d) {
                                                    sb3.append("-position msg: ");
                                                    sb3.append(m40356w.f42390X);
                                                }
                                                if (C19322f1.f95953d) {
                                                    m40356w.m40401d1(sb3.toString());
                                                }
                                                AbstractC19074t.m100205c(m40356w);
                                                list.add(m40356w);
                                            }
                                            String str7 = str2;
                                            indexOf = sb2.indexOf(str7, indexOf + 1);
                                            str3 = str7;
                                            m142176d = sb2;
                                            m101455l = str;
                                            strArr2 = strArr;
                                            m98553p = c18635e;
                                        }
                                    }
                                }
                            }
                            obj = null;
                            charSequence = (CharSequence) obj;
                            if (charSequence != null) {
                                C31973j5 m4472f2 = C0943w.f3447a.m4472f((String) obj);
                                String m40383Q2 = contactProfile.m40383Q(true, false);
                                contactProfile.f42405d1 = false;
                                contactProfile.f42387W = 0.0f;
                                arrayList.clear();
                                contactProfile.f42439s1 = new SpannableStringBuilder();
                                str = m101455l;
                                strArr = strArr2;
                                sb2 = m142176d;
                                c18635e = m98553p;
                                str2 = str3;
                                AbstractC23262x6.m119994g(m101455l, m40383Q2, contactProfile, arrayList, new ArrayList(), 256 | (!z11 ? 16 : 0));
                                if (contactProfile.f42387W <= 0.0f) {
                                }
                                String str72 = str2;
                                indexOf = sb2.indexOf(str72, indexOf + 1);
                                str3 = str72;
                                m142176d = sb2;
                                m101455l = str;
                                strArr2 = strArr;
                                m98553p = c18635e;
                            }
                        }
                        str = m101455l;
                        c18635e = m98553p;
                        str2 = str3;
                        strArr = strArr2;
                        sb2 = m142176d;
                        String str722 = str2;
                        indexOf = sb2.indexOf(str722, indexOf + 1);
                        str3 = str722;
                        m142176d = sb2;
                        m101455l = str;
                        strArr2 = strArr;
                        m98553p = c18635e;
                    }
                }
            }
            Collections.sort(list, ContactProfile.f42319Z1);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        C19325g1 c19325g1;
        AbstractC29069a.p pVar;
        Object obj2;
        Boolean bool;
        C18316b c18316b;
        C18316b c18316b2;
        if (isCancelled()) {
            return;
        }
        InterfaceC18319c m101438e = m101438e();
        if (m101438e != null && (c18316b2 = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b2.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C19325g1) {
            c19325g1 = (C19325g1) obj;
        } else {
            c19325g1 = null;
        }
        if (c19325g1 == null) {
            return;
        }
        ArrayList<AbstractC29069a.o> arrayList = new ArrayList();
        ArrayList<ContactProfile> arrayList2 = new ArrayList();
        ArrayList<ContactProfile> arrayList3 = new ArrayList();
        ArrayList<ContactProfile> arrayList4 = new ArrayList();
        ArrayList<ContactProfile> arrayList5 = new ArrayList();
        ArrayList<ContactProfile> arrayList6 = new ArrayList();
        m101365q(c19325g1, arrayList2);
        m101367t(c19325g1, arrayList4);
        m101364p(c19325g1, arrayList3);
        m101369r(c19325g1, false, arrayList6);
        if (c19325g1.m101182H()) {
            InterfaceC18319c m101438e2 = m101438e();
            if (m101438e2 != null && (c18316b = (C18316b) m101438e2.mo205i9(new C18316b("ACTION_CHECK_READ_WRITE_CONTACT_PERMISSION", null, null, null, 14, null))) != null) {
                obj2 = c18316b.m97245a();
            } else {
                obj2 = null;
            }
            if (obj2 instanceof Boolean) {
                bool = (Boolean) obj2;
            } else {
                bool = null;
            }
            if (AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
                m101366s(c19325g1, arrayList5);
            }
        }
        if (isCancelled()) {
            return;
        }
        for (ContactProfile contactProfile : arrayList2) {
            if (!this.f96094u.containsKey(contactProfile.f42434r)) {
                C19372y0.a aVar = C19372y0.Companion;
                arrayList.add(C19372y0.a.m101483e(aVar, contactProfile, aVar.m101485a(contactProfile) | 32, null, null, null, null, null, 124, null));
                HashMap hashMap = this.f96094u;
                String str = contactProfile.f42434r;
                AbstractC19074t.m100207e(str, "uid");
                String str2 = contactProfile.f42434r;
                AbstractC19074t.m100207e(str2, "uid");
                hashMap.put(str, str2);
            }
        }
        if (isCancelled()) {
            return;
        }
        for (ContactProfile contactProfile2 : arrayList4) {
            if (!this.f96094u.containsKey(contactProfile2.f42434r)) {
                C19372y0.a aVar2 = C19372y0.Companion;
                AbstractC29069a.o m101483e = C19372y0.a.m101483e(aVar2, contactProfile2, aVar2.m101485a(contactProfile2) | 32, null, null, null, null, null, 124, null);
                m101483e.m145208o(new SpannableStringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_strangers_in_phone_book)));
                arrayList.add(m101483e);
                HashMap hashMap2 = this.f96094u;
                String str3 = contactProfile2.f42434r;
                AbstractC19074t.m100207e(str3, "uid");
                String str4 = contactProfile2.f42434r;
                AbstractC19074t.m100207e(str4, "uid");
                hashMap2.put(str3, str4);
            }
        }
        if (isCancelled()) {
            return;
        }
        for (ContactProfile contactProfile3 : arrayList5) {
            if (!this.f96094u.containsKey(contactProfile3.f42434r)) {
                C19372y0.a aVar3 = C19372y0.Companion;
                arrayList.add(C19372y0.a.m101483e(aVar3, contactProfile3, aVar3.m101485a(contactProfile3) | 32, null, null, null, null, null, 124, null));
                HashMap hashMap3 = this.f96094u;
                String str5 = contactProfile3.f42434r;
                AbstractC19074t.m100207e(str5, "uid");
                String str6 = contactProfile3.f42434r;
                AbstractC19074t.m100207e(str6, "uid");
                hashMap3.put(str5, str6);
            }
        }
        if (isCancelled()) {
            return;
        }
        for (ContactProfile contactProfile4 : arrayList3) {
            if (!this.f96094u.containsKey(contactProfile4.f42434r)) {
                C19372y0.a aVar4 = C19372y0.Companion;
                arrayList.add(C19372y0.a.m101483e(aVar4, contactProfile4, aVar4.m101485a(contactProfile4) | 32, null, null, null, null, null, 124, null));
                HashMap hashMap4 = this.f96094u;
                String str7 = contactProfile4.f42434r;
                AbstractC19074t.m100207e(str7, "uid");
                String str8 = contactProfile4.f42434r;
                AbstractC19074t.m100207e(str8, "uid");
                hashMap4.put(str7, str8);
            }
        }
        if (isCancelled()) {
            return;
        }
        for (ContactProfile contactProfile5 : arrayList6) {
            if (!this.f96094u.containsKey(contactProfile5.f42434r)) {
                C19372y0.a aVar5 = C19372y0.Companion;
                arrayList.add(C19372y0.a.m101483e(aVar5, contactProfile5, aVar5.m101485a(contactProfile5) | 32, null, null, null, null, null, 124, null));
                HashMap hashMap5 = this.f96094u;
                String str9 = contactProfile5.f42434r;
                AbstractC19074t.m100207e(str9, "uid");
                String str10 = contactProfile5.f42434r;
                AbstractC19074t.m100207e(str10, "uid");
                hashMap5.put(str9, str10);
            }
        }
        if (isCancelled()) {
            return;
        }
        for (ContactProfile contactProfile6 : this.f96093t) {
            if (!this.f96094u.containsKey(contactProfile6.f42434r)) {
                C19372y0.a aVar6 = C19372y0.Companion;
                arrayList.add(C19372y0.a.m101483e(aVar6, contactProfile6, aVar6.m101485a(contactProfile6) | 32, null, null, null, null, null, 124, null));
                HashMap hashMap6 = this.f96094u;
                String str11 = contactProfile6.f42434r;
                AbstractC19074t.m100207e(str11, "uid");
                String str12 = contactProfile6.f42434r;
                AbstractC19074t.m100207e(str12, "uid");
                hashMap6.put(str11, str12);
            }
        }
        for (AbstractC29069a.o oVar : arrayList) {
            if (AbstractC23063f2.m118359k(oVar.m145198e().mo2478b())) {
                oVar.m145208o(new SpannableStringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_have_sent_friend_invitation)));
                pVar = AbstractC29069a.p.d.f134718a;
            } else if (AbstractC23063f2.m118360l(oVar.m145198e().mo2478b())) {
                oVar.m145208o(new SpannableStringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_want_to_be_friend)));
                pVar = AbstractC29069a.p.a.f134715c;
            } else {
                pVar = AbstractC29069a.p.b.f134716c;
            }
            oVar.m145207n(pVar);
        }
        AbstractC25376w.m131534w(arrayList, C19342m0.Companion.m101360f());
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = this.f96093t.iterator();
        while (it.hasNext()) {
            hashSet.add(((ContactProfile) it.next()).f42434r);
        }
        for (AbstractC29069a.o oVar2 : arrayList) {
            if (hashSet.contains(oVar2.m145198e().mo2478b())) {
                arrayList7.add(oVar2);
            } else {
                arrayList8.add(oVar2);
            }
        }
        mo205i9(new C18316b("ACTION_SEARCH_TASK_RESULT_SET_DATA", AbstractC29075g.m145258e(AbstractC29075g.m145255b(AbstractC29076h.o.f134829b, m101455l(), arrayList8, AbstractC29072d.d.f134806a)), null, null, 12, null));
    }
}
