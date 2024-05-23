package vg;

import am.C0943w;
import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import ga0.C19322f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me0.C23282z6;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import p716zh.C31973j5;
import p716zh.C32076q5;
import pm0.C24848g0;
import tk.C26726e;

/* renamed from: vg.v7 */
/* loaded from: classes3.dex */
public final class C28213v7 {

    /* renamed from: a */
    public static final C28213v7 f131603a = new C28213v7();

    /* renamed from: b */
    public static final Map f131604b = new HashMap();

    /* renamed from: c */
    public static final Map f131605c = new HashMap();

    /* renamed from: d */
    public static StringBuilder f131606d;

    private C28213v7() {
    }

    /* renamed from: a */
    public final void m142173a(C31973j5 c31973j5, C32076q5 c32076q5, StringBuilder sb2, Map map) {
        int m127173b0;
        AbstractC19074t.m100208f(c31973j5, "group");
        AbstractC19074t.m100208f(c32076q5, "groupMemberInfo");
        AbstractC19074t.m100208f(sb2, "dataStranger");
        AbstractC19074t.m100208f(map, "mapUid");
        if (c32076q5.m154717f() > 0) {
            for (String str : c32076q5.m154718g()) {
                if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
                    Map map2 = f131605c;
                    if (map2.containsKey(str)) {
                        Object obj = map2.get(str);
                        AbstractC19074t.m100205c(obj);
                        List list = (List) obj;
                        if (!list.contains(c31973j5.m153781r())) {
                            list.add(c31973j5.m153781r());
                        }
                    } else {
                        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, str, false, 2, null);
                        if (m141800i != null) {
                            String str2 = m141800i.f42434r;
                            AbstractC19074t.m100207e(str2, "uid");
                            m127173b0 = AbstractC24342w.m127173b0(str2, "-", 0, false, 6, null);
                            if (m127173b0 < 0 && !m141800i.f42403c1) {
                                if (m141800i.m40366G0()) {
                                    String m40383Q = m141800i.m40383Q(true, false);
                                    C26726e c26726e = new C26726e(m141800i, null, 2, null);
                                    c26726e.m137462c(m142175c(m40383Q, c26726e, sb2.length(), false));
                                    sb2.append(c26726e.m137461b());
                                }
                            }
                        } else if (!map.containsKey(str)) {
                            map.put(str, str);
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c31973j5.m153781r());
                        map2.put(str, arrayList);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void m142174b() {
        f131604b.clear();
        f131605c.clear();
        f131606d = null;
    }

    /* renamed from: c */
    public final String m142175c(String str, C26726e c26726e, int i11, boolean z11) {
        int i12;
        boolean z12;
        int i13;
        StringBuilder sb2 = new StringBuilder();
        AbstractC19074t.m100205c(str);
        if (z11) {
            i12 = 16;
        } else {
            i12 = 0;
        }
        String[] m118488a = C23282z6.m120367c(str, i12 | 16384).m118488a();
        if (m118488a.length == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            int length = m118488a.length;
            for (int i14 = 0; i14 < length; i14++) {
                if (!TextUtils.isEmpty(m118488a[i14])) {
                    if (!z11) {
                        int length2 = m118488a[i14].length();
                        i13 = 0;
                        for (int i15 = 1; i15 < length2; i15++) {
                            char charAt = m118488a[i14].charAt(i15);
                            char charAt2 = m118488a[i14].charAt(i15 - 1);
                            if ('A' <= charAt && charAt < '[' && 'a' <= charAt2 && charAt2 < '{') {
                                sb2.append(' ');
                                String substring = m118488a[i14].substring(i13, i15);
                                AbstractC19074t.m100207e(substring, "substring(...)");
                                sb2.append(substring);
                                i13 = i15;
                            }
                        }
                    } else {
                        i13 = 0;
                    }
                    sb2.append(' ');
                    String substring2 = m118488a[i14].substring(i13);
                    AbstractC19074t.m100207e(substring2, "substring(...)");
                    sb2.append(substring2);
                }
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        Map map = f131604b;
        AbstractC19074t.m100205c(c26726e);
        map.put(valueOf, c26726e);
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        Locale locale = Locale.US;
        AbstractC19074t.m100207e(locale, "US");
        String lowerCase = sb3.toLowerCase(locale);
        AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* renamed from: d */
    public final StringBuilder m142176d() {
        List<ContactProfile> m42421i6;
        int m127173b0;
        C32076q5 m4476k;
        StringBuilder sb2 = f131606d;
        if (sb2 != null) {
            AbstractC19074t.m100205c(sb2);
            return sb2;
        }
        System.currentTimeMillis();
        try {
            synchronized (this) {
                try {
                    if (f131606d == null) {
                        StringBuilder sb3 = new StringBuilder(1024);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (C31973j5 c31973j5 : C0943w.f3447a.m4475i()) {
                            if (c31973j5.m153732O() < C19322f1.f95950a.m101153j() && (m4476k = C0943w.f3447a.m4476k(c31973j5.m153781r())) != null) {
                                f131603a.m142173a(c31973j5, m4476k, sb3, linkedHashMap);
                            }
                        }
                        if ((!linkedHashMap.isEmpty()) && (m42421i6 = C7960e.m41971c6().m42421i6(new ArrayList(linkedHashMap.values()))) != null && (!m42421i6.isEmpty())) {
                            for (ContactProfile contactProfile : m42421i6) {
                                String str = contactProfile.f42434r;
                                AbstractC19074t.m100207e(str, "uid");
                                m127173b0 = AbstractC24342w.m127173b0(str, "-", 0, false, 6, null);
                                if (m127173b0 < 0 && !contactProfile.f42403c1 && contactProfile.m40366G0()) {
                                    String m40383Q = contactProfile.m40383Q(true, false);
                                    AbstractC19074t.m100205c(contactProfile);
                                    C26726e c26726e = new C26726e(contactProfile, null, 2, null);
                                    c26726e.m137462c(f131603a.m142175c(m40383Q, c26726e, sb3.length(), false));
                                    sb3.append(c26726e.m137461b());
                                }
                            }
                        }
                        f131606d = sb3;
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        StringBuilder sb4 = f131606d;
        if (sb4 != null) {
            AbstractC19074t.m100205c(sb4);
            return sb4;
        }
        return new StringBuilder();
    }
}
