package on0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;

/* renamed from: on0.o */
/* loaded from: classes.dex */
public abstract class AbstractC24334o extends AbstractC24333n {

    /* renamed from: on0.o$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f117444q = new a();

        a() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(String str) {
            AbstractC19074t.m100208f(str, "line");
            return str;
        }
    }

    /* renamed from: on0.o$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f117445q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f117445q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(String str) {
            AbstractC19074t.m100208f(str, "line");
            return this.f117445q + str;
        }
    }

    /* renamed from: b */
    private static final InterfaceC18505l m127094b(String str) {
        if (str.length() == 0) {
            return a.f117444q;
        }
        return new b(str);
    }

    /* renamed from: c */
    private static final int m127095c(String str) {
        boolean m126977c;
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                m126977c = AbstractC24317b.m126977c(str.charAt(i11));
                if (!m126977c) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 == -1) {
            return str.length();
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m127096d(String str, String str2) {
        int m131511r;
        Comparable m131219s0;
        int i11;
        int m131504l;
        Appendable m131212l0;
        boolean m127128x;
        String m127202a1;
        String str3;
        boolean m127128x2;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "newIndent");
        List m127181j0 = AbstractC24342w.m127181j0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m127181j0) {
            m127128x2 = AbstractC24341v.m127128x((String) obj);
            if (!m127128x2) {
                arrayList.add(obj);
            }
        }
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m127095c((String) it.next())));
        }
        m131219s0 = AbstractC25332a0.m131219s0(arrayList2);
        Integer num = (Integer) m131219s0;
        int i12 = 0;
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        int length = str.length() + (str2.length() * m127181j0.size());
        InterfaceC18505l m127094b = m127094b(str2);
        m131504l = AbstractC25368s.m131504l(m127181j0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : m127181j0) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC25368s.m131509q();
            }
            String str4 = (String) obj2;
            if (i12 == 0 || i12 == m131504l) {
                m127128x = AbstractC24341v.m127128x(str4);
                if (m127128x) {
                    str4 = null;
                    if (str4 == null) {
                        arrayList3.add(str4);
                    }
                    i12 = i13;
                }
            }
            m127202a1 = AbstractC24344y.m127202a1(str4, i11);
            if (m127202a1 != null && (str3 = (String) m127094b.mo205i9(m127202a1)) != null) {
                str4 = str3;
            }
            if (str4 == null) {
            }
            i12 = i13;
        }
        m131212l0 = AbstractC25332a0.m131212l0(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null);
        String sb2 = ((StringBuilder) m131212l0).toString();
        AbstractC19074t.m100207e(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m127097e(String str, String str2, String str3) {
        boolean m127128x;
        int m131504l;
        Appendable m131212l0;
        boolean m127128x2;
        int i11;
        String str4;
        boolean m126977c;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "newIndent");
        AbstractC19074t.m100208f(str3, "marginPrefix");
        m127128x = AbstractC24341v.m127128x(str3);
        if (!m127128x) {
            List m127181j0 = AbstractC24342w.m127181j0(str);
            int length = str.length() + (str2.length() * m127181j0.size());
            InterfaceC18505l m127094b = m127094b(str2);
            m131504l = AbstractC25368s.m131504l(m127181j0);
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            for (Object obj : m127181j0) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    AbstractC25368s.m131509q();
                }
                String str5 = (String) obj;
                String str6 = null;
                if (i12 == 0 || i12 == m131504l) {
                    m127128x2 = AbstractC24341v.m127128x(str5);
                    if (m127128x2) {
                        str5 = null;
                        if (str5 == null) {
                            arrayList.add(str5);
                        }
                        i12 = i13;
                    }
                }
                int length2 = str5.length();
                int i14 = 0;
                while (true) {
                    if (i14 < length2) {
                        m126977c = AbstractC24317b.m126977c(str5.charAt(i14));
                        if (!m126977c) {
                            i11 = i14;
                            break;
                        }
                        i14++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 != -1) {
                    int i15 = i11;
                    if (AbstractC24341v.m127119I(str5, str3, i11, false, 4, null)) {
                        int length3 = i15 + str3.length();
                        AbstractC19074t.m100206d(str5, "null cannot be cast to non-null type java.lang.String");
                        str6 = str5.substring(length3);
                        AbstractC19074t.m100207e(str6, "substring(...)");
                    }
                }
                if (str6 != null && (str4 = (String) m127094b.mo205i9(str6)) != null) {
                    str5 = str4;
                }
                if (str5 == null) {
                }
                i12 = i13;
            }
            m131212l0 = AbstractC25332a0.m131212l0(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null);
            String sb2 = ((StringBuilder) m131212l0).toString();
            AbstractC19074t.m100207e(sb2, "toString(...)");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    /* renamed from: f */
    public static String m127098f(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        return m127096d(str, "");
    }

    /* renamed from: g */
    public static final String m127099g(String str, String str2) {
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "marginPrefix");
        return m127097e(str, "", str2);
    }

    /* renamed from: h */
    public static /* synthetic */ String m127100h(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "|";
        }
        return m127099g(str, str2);
    }
}
