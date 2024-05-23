package nc;

import com.zing.zalo.p062db.C7962g;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lc.EnumC22425a;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p227i3.C20215s;
import p227i3.C20218v;
import p263jc.C21216s;
import p268ji.C21270p;
import p423pi.C24761c;
import p620wt.AbstractC29231f;
import qm0.AbstractC25370t;

/* renamed from: nc.g */
/* loaded from: classes3.dex */
public final class C23682g {

    /* renamed from: a */
    public static final C23682g f114732a = new C23682g();

    /* renamed from: nc.g$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f114733a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f114734b;

        static {
            int[] iArr = new int[EnumC22425a.values().length];
            try {
                iArr[EnumC22425a.f109726q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC22425a.f109727r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f114733a = iArr;
            int[] iArr2 = new int[C21270p.a.values().length];
            try {
                iArr2[C21270p.a.f103624q.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[C21270p.a.f103625r.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[C21270p.a.f103626s.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f114734b = iArr2;
        }
    }

    private C23682g() {
    }

    /* renamed from: h */
    private final String m124049h(Set[] setArr) {
        int length = setArr.length;
        Integer[] numArr = new Integer[length];
        for (int i11 = 0; i11 < length; i11++) {
            numArr[i11] = Integer.valueOf(setArr[i11].size());
        }
        String arrays = Arrays.toString(numArr);
        AbstractC19074t.m100207e(arrays, "toString(...)");
        return arrays;
    }

    /* renamed from: a */
    public final void m124050a(C21216s c21216s, C17945a0 c17945a0, Set[] setArr) {
        AbstractC19074t.m100208f(c21216s, "controller");
        AbstractC19074t.m100208f(c17945a0, "msg");
        AbstractC19074t.m100208f(setArr, "data");
        String m124055f = m124055f(c17945a0, c21216s);
        int hashCode = m124055f.hashCode();
        if (hashCode != 97) {
            if (hashCode != 102) {
                if (hashCode != 108) {
                    if (hashCode != 112) {
                        if (hashCode == 118 && m124055f.equals(C20218v.f100059b)) {
                            setArr[3].add(Integer.valueOf(c17945a0.m95029V3().hashCode()));
                            return;
                        }
                        return;
                    }
                    if (m124055f.equals("p")) {
                        setArr[1].add(Integer.valueOf(c17945a0.m95029V3().hashCode()));
                        return;
                    }
                    return;
                }
                if (m124055f.equals("l")) {
                    setArr[4].add(Integer.valueOf(c17945a0.m95029V3().hashCode()));
                    return;
                }
                return;
            }
            if (m124055f.equals("f")) {
                setArr[2].add(Integer.valueOf(c17945a0.m95029V3().hashCode()));
                return;
            }
            return;
        }
        if (m124055f.equals("a")) {
            setArr[0].add(Integer.valueOf(c17945a0.m95029V3().hashCode()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C24761c m124051b(C21216s c21216s, C21270p.a aVar, String str, C17945a0 c17945a0, EnumC22425a enumC22425a) {
        Integer num;
        Integer num2;
        int i11;
        Integer num3;
        int i12;
        int i13;
        AbstractC19074t.m100208f(c21216s, "controller");
        AbstractC19074t.m100208f(aVar, "logState");
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(c17945a0, "msg");
        String m124055f = m124055f(c17945a0, c21216s);
        Integer num4 = null;
        if (aVar == C21270p.a.f103623p) {
            num = 1;
        } else {
            num = null;
        }
        boolean m95180k8 = c17945a0.m95180k8();
        int[] iArr = a.f114734b;
        int i14 = -1;
        if (iArr[aVar.ordinal()] == 1) {
            if (enumC22425a == null) {
                i13 = -1;
            } else {
                i13 = a.f114733a[enumC22425a.ordinal()];
            }
            if (i13 != 1) {
                if (i13 == 2) {
                    num2 = 2;
                }
            } else {
                num2 = 1;
            }
            i11 = iArr[aVar.ordinal()];
            if (i11 == 2) {
                if (i11 == 3) {
                    if (enumC22425a != null) {
                        i14 = a.f114733a[enumC22425a.ordinal()];
                    }
                    if (i14 != 1) {
                        if (i14 == 2) {
                            i12 = 4;
                        }
                    } else {
                        i12 = 3;
                    }
                    num3 = i12;
                }
                num3 = null;
            } else {
                if (enumC22425a != null) {
                    i14 = a.f114733a[enumC22425a.ordinal()];
                }
                if (i14 != 1) {
                    if (i14 == 2) {
                        i12 = 2;
                        num3 = i12;
                    }
                    num3 = null;
                } else {
                    num3 = 1;
                }
            }
            if (aVar == C21270p.a.f103627t) {
                num4 = 1;
            }
            return new C24761c(str, m124055f, c17945a0.m95029V3().hashCode(), m95180k8 ? 1 : 0, num2, num3, num, num4);
        }
        num2 = null;
        i11 = iArr[aVar.ordinal()];
        if (i11 == 2) {
        }
        if (aVar == C21270p.a.f103627t) {
        }
        return new C24761c(str, m124055f, c17945a0.m95029V3().hashCode(), m95180k8 ? 1 : 0, num2, num3, num, num4);
    }

    /* renamed from: c */
    public final C24761c m124052c(C21216s c21216s, C21270p.a aVar, String str, C17945a0 c17945a0) {
        Integer num;
        AbstractC19074t.m100208f(c21216s, "controller");
        AbstractC19074t.m100208f(aVar, "logState");
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(c17945a0, "msg");
        String m124055f = m124055f(c17945a0, c21216s);
        int[] iArr = a.f114734b;
        Integer num2 = 1;
        if (iArr[aVar.ordinal()] == 1) {
            num = num2;
        } else {
            num = null;
        }
        int i11 = iArr[aVar.ordinal()];
        if (i11 != 2 && i11 != 3) {
            num2 = null;
        }
        return new C24761c(str, m124055f, c17945a0.m95029V3().hashCode(), 0, num, num2, null, null, 200, null);
    }

    /* renamed from: d */
    public final JSONObject m124053d(List list, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "matchCondition");
        JSONObject jSONObject = new JSONObject();
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C24761c c24761c = (C24761c) it.next();
                if (((Boolean) interfaceC18505l.mo205i9(c24761c)).booleanValue()) {
                    Integer num = (Integer) hashMap.get(c24761c.m128703b());
                    if (num == null) {
                        num = 0;
                    }
                    AbstractC19074t.m100205c(num);
                    hashMap.put(c24761c.m128703b(), Integer.valueOf(num.intValue() + 1));
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), ((Number) entry.getValue()).intValue());
            }
        }
        return jSONObject;
    }

    /* renamed from: e */
    public final String m124054e(C21216s c21216s, String str, EnumC22425a enumC22425a) {
        AbstractC19074t.m100208f(c21216s, "controller");
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(enumC22425a, "downloadType");
        Set[] setArr = new Set[5];
        for (int i11 = 0; i11 < 5; i11++) {
            setArr[i11] = new HashSet();
        }
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        Iterator it = c21216s.m109852D0(str2, str, enumC22425a).iterator();
        while (it.hasNext()) {
            f114732a.m124050a(c21216s, (C17945a0) it.next(), setArr);
        }
        return m124049h(setArr);
    }

    /* renamed from: f */
    public final String m124055f(C17945a0 c17945a0, C21216s c21216s) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        AbstractC19074t.m100208f(c21216s, "controller");
        if (c17945a0.m94960N7()) {
            return "l";
        }
        int m109888n0 = c21216s.m109888n0(c17945a0);
        if (m109888n0 != 1) {
            if (m109888n0 != 2) {
                if (m109888n0 != 4) {
                    if (m109888n0 != 8) {
                        return "";
                    }
                    return "f";
                }
                return C20218v.f100059b;
            }
            return "p";
        }
        return "a";
    }

    /* renamed from: g */
    public final String m124056g(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? i11 != 2 ? i11 != 4 ? i11 != 8 ? i11 != 16 ? "un" : C7962g.f43287r : "oa" : "ft" : C20215s.f99966b : "f";
        }
        return "un";
    }

    /* renamed from: i */
    public final JSONObject m124057i(String str) {
        List m127132B0;
        int m131511r;
        int i11;
        int i12;
        int i13;
        int i14;
        CharSequence m127168X0;
        JSONObject jSONObject = new JSONObject();
        if (str != null && str.length() != 0) {
            try {
                String substring = str.substring(1, str.length() - 1);
                AbstractC19074t.m100207e(substring, "substring(...)");
                int i15 = 0;
                m127132B0 = AbstractC24342w.m127132B0(substring, new String[]{","}, false, 0, 6, null);
                List list = m127132B0;
                m131511r = AbstractC25370t.m131511r(list, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m127168X0 = AbstractC24342w.m127168X0((String) it.next());
                    arrayList.add(Integer.valueOf(Integer.parseInt(m127168X0.toString())));
                }
                if (arrayList.size() > 0) {
                    i11 = ((Number) arrayList.get(0)).intValue();
                } else {
                    i11 = 0;
                }
                AbstractC29231f.m145988f(jSONObject, "a", i11);
                if (1 < arrayList.size()) {
                    i12 = ((Number) arrayList.get(1)).intValue();
                } else {
                    i12 = 0;
                }
                AbstractC29231f.m145988f(jSONObject, "p", i12);
                if (2 < arrayList.size()) {
                    i13 = ((Number) arrayList.get(2)).intValue();
                } else {
                    i13 = 0;
                }
                AbstractC29231f.m145988f(jSONObject, "f", i13);
                if (3 < arrayList.size()) {
                    i14 = ((Number) arrayList.get(3)).intValue();
                } else {
                    i14 = 0;
                }
                AbstractC29231f.m145988f(jSONObject, C20218v.f100059b, i14);
                if (4 < arrayList.size()) {
                    i15 = ((Number) arrayList.get(4)).intValue();
                }
                AbstractC29231f.m145988f(jSONObject, "l", i15);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return jSONObject;
    }
}
