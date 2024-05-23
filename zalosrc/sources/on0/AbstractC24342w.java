package on0;

import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;
import ln0.C22535d;
import ln0.C22537f;
import nn0.AbstractC23906o;
import nn0.InterfaceC23898g;
import pm0.AbstractC24866w;
import pm0.C24860q;
import qm0.AbstractC25332a0;
import qm0.AbstractC25351j0;
import qm0.AbstractC25356m;
import qm0.AbstractC25358n;
import qm0.AbstractC25366r;
import qm0.AbstractC25370t;

/* renamed from: on0.w */
/* loaded from: classes.dex */
public abstract class AbstractC24342w extends AbstractC24341v {

    /* renamed from: on0.w$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ char[] f117446q;

        /* renamed from: r */
        final /* synthetic */ boolean f117447r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z11) {
            super(2);
            this.f117446q = cArr;
            this.f117447r = z11;
        }

        /* renamed from: a */
        public final C24860q m127198a(CharSequence charSequence, int i11) {
            AbstractC19074t.m100208f(charSequence, "$this$$receiver");
            int m127174c0 = AbstractC24342w.m127174c0(charSequence, this.f117446q, i11, this.f117447r);
            if (m127174c0 < 0) {
                return null;
            }
            return AbstractC24866w.m129235a(Integer.valueOf(m127174c0), 1);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            return m127198a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: on0.w$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ List f117448q;

        /* renamed from: r */
        final /* synthetic */ boolean f117449r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, boolean z11) {
            super(2);
            this.f117448q = list;
            this.f117449r = z11;
        }

        /* renamed from: a */
        public final C24860q m127199a(CharSequence charSequence, int i11) {
            AbstractC19074t.m100208f(charSequence, "$this$$receiver");
            C24860q m127159T = AbstractC24342w.m127159T(charSequence, this.f117448q, i11, this.f117449r, false);
            if (m127159T != null) {
                return AbstractC24866w.m129235a(m127159T.m129215c(), Integer.valueOf(((String) m127159T.m129216d()).length()));
            }
            return null;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            return m127199a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: on0.w$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ CharSequence f117450q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f117450q = charSequence;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(C22537f c22537f) {
            AbstractC19074t.m100208f(c22537f, "it");
            return AbstractC24342w.m127139I0(this.f117450q, c22537f);
        }
    }

    /* renamed from: A0 */
    public static /* synthetic */ List m127131A0(CharSequence charSequence, char[] cArr, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return m127195x0(charSequence, cArr, z11, i11);
    }

    /* renamed from: B0 */
    public static /* synthetic */ List m127132B0(CharSequence charSequence, String[] strArr, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return m127196y0(charSequence, strArr, z11, i11);
    }

    /* renamed from: C0 */
    public static final InterfaceC23898g m127133C0(CharSequence charSequence, String[] strArr, boolean z11, int i11) {
        InterfaceC23898g m125028q;
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(strArr, "delimiters");
        m125028q = AbstractC23906o.m125028q(m127187p0(charSequence, strArr, 0, z11, i11, 2, null), new c(charSequence));
        return m125028q;
    }

    /* renamed from: D0 */
    public static /* synthetic */ InterfaceC23898g m127134D0(CharSequence charSequence, String[] strArr, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return m127133C0(charSequence, strArr, z11, i11);
    }

    /* renamed from: E0 */
    public static final boolean m127135E0(CharSequence charSequence, char c11, boolean z11) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (charSequence.length() <= 0 || !AbstractC24319c.m126979d(charSequence.charAt(0), c11, z11)) {
            return false;
        }
        return true;
    }

    /* renamed from: F0 */
    public static final boolean m127136F0(CharSequence charSequence, CharSequence charSequence2, boolean z11) {
        boolean m127120J;
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(charSequence2, "prefix");
        if (!z11 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            m127120J = AbstractC24341v.m127120J((String) charSequence, (String) charSequence2, false, 2, null);
            return m127120J;
        }
        return m127188q0(charSequence, 0, charSequence2, 0, charSequence2.length(), z11);
    }

    /* renamed from: G0 */
    public static /* synthetic */ boolean m127137G0(CharSequence charSequence, char c11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m127135E0(charSequence, c11, z11);
    }

    /* renamed from: H0 */
    public static /* synthetic */ boolean m127138H0(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m127136F0(charSequence, charSequence2, z11);
    }

    /* renamed from: I0 */
    public static final String m127139I0(CharSequence charSequence, C22537f c22537f) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(c22537f, "range");
        return charSequence.subSequence(c22537f.m116556n().intValue(), c22537f.m116555m().intValue() + 1).toString();
    }

    /* renamed from: J0 */
    public static final String m127140J0(String str, char c11, String str2) {
        int m127172a0;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "missingDelimiterValue");
        m127172a0 = m127172a0(str, c11, 0, false, 6, null);
        if (m127172a0 != -1) {
            String substring = str.substring(m127172a0 + 1, str.length());
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        return str2;
    }

    /* renamed from: K0 */
    public static final String m127142K0(String str, String str2, String str3) {
        int m127173b0;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "delimiter");
        AbstractC19074t.m100208f(str3, "missingDelimiterValue");
        m127173b0 = m127173b0(str, str2, 0, false, 6, null);
        if (m127173b0 != -1) {
            String substring = str.substring(m127173b0 + str2.length(), str.length());
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        return str3;
    }

    /* renamed from: L */
    public static final boolean m127143L(CharSequence charSequence, char c11, boolean z11) {
        int m127172a0;
        AbstractC19074t.m100208f(charSequence, "<this>");
        m127172a0 = m127172a0(charSequence, c11, 0, z11, 2, null);
        if (m127172a0 >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: L0 */
    public static /* synthetic */ String m127144L0(String str, char c11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        return m127140J0(str, c11, str2);
    }

    /* renamed from: M */
    public static final boolean m127145M(CharSequence charSequence, CharSequence charSequence2, boolean z11) {
        int m127173b0;
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            m127173b0 = m127173b0(charSequence, (String) charSequence2, 0, z11, 2, null);
            if (m127173b0 < 0) {
                return false;
            }
        } else if (m127171Z(charSequence, charSequence2, 0, charSequence.length(), z11, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: M0 */
    public static /* synthetic */ String m127146M0(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return m127142K0(str, str2, str3);
    }

    /* renamed from: N */
    public static /* synthetic */ boolean m127147N(CharSequence charSequence, char c11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m127143L(charSequence, c11, z11);
    }

    /* renamed from: N0 */
    public static String m127148N0(String str, char c11, String str2) {
        int m127177f0;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "missingDelimiterValue");
        m127177f0 = m127177f0(str, c11, 0, false, 6, null);
        if (m127177f0 != -1) {
            String substring = str.substring(m127177f0 + 1, str.length());
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        return str2;
    }

    /* renamed from: O */
    public static /* synthetic */ boolean m127149O(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m127145M(charSequence, charSequence2, z11);
    }

    /* renamed from: O0 */
    public static final String m127150O0(String str, String str2, String str3) {
        int m127178g0;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "delimiter");
        AbstractC19074t.m100208f(str3, "missingDelimiterValue");
        m127178g0 = m127178g0(str, str2, 0, false, 6, null);
        if (m127178g0 != -1) {
            String substring = str.substring(m127178g0 + str2.length(), str.length());
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        return str3;
    }

    /* renamed from: P */
    public static final boolean m127151P(CharSequence charSequence, char c11, boolean z11) {
        int m127163V;
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (charSequence.length() > 0) {
            m127163V = m127163V(charSequence);
            if (AbstractC24319c.m126979d(charSequence.charAt(m127163V), c11, z11)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P0 */
    public static /* synthetic */ String m127152P0(String str, char c11, String str2, int i11, Object obj) {
        String m127148N0;
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        m127148N0 = m127148N0(str, c11, str2);
        return m127148N0;
    }

    /* renamed from: Q */
    public static final boolean m127153Q(CharSequence charSequence, CharSequence charSequence2, boolean z11) {
        boolean m127125u;
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(charSequence2, "suffix");
        if (!z11 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            m127125u = AbstractC24341v.m127125u((String) charSequence, (String) charSequence2, false, 2, null);
            return m127125u;
        }
        return m127188q0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z11);
    }

    /* renamed from: Q0 */
    public static /* synthetic */ String m127154Q0(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return m127150O0(str, str2, str3);
    }

    /* renamed from: R */
    public static /* synthetic */ boolean m127155R(CharSequence charSequence, char c11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m127151P(charSequence, c11, z11);
    }

    /* renamed from: R0 */
    public static final String m127156R0(String str, char c11, String str2) {
        int m127172a0;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "missingDelimiterValue");
        m127172a0 = m127172a0(str, c11, 0, false, 6, null);
        if (m127172a0 != -1) {
            String substring = str.substring(0, m127172a0);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        return str2;
    }

    /* renamed from: S */
    public static /* synthetic */ boolean m127157S(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m127153Q(charSequence, charSequence2, z11);
    }

    /* renamed from: S0 */
    public static final String m127158S0(String str, String str2, String str3) {
        int m127173b0;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "delimiter");
        AbstractC19074t.m100208f(str3, "missingDelimiterValue");
        m127173b0 = m127173b0(str, str2, 0, false, 6, null);
        if (m127173b0 != -1) {
            String substring = str.substring(0, m127173b0);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        return str3;
    }

    /* renamed from: T */
    public static final C24860q m127159T(CharSequence charSequence, Collection collection, int i11, boolean z11, boolean z12) {
        int m127163V;
        int m116584g;
        C22535d m116590m;
        Object obj;
        Object obj2;
        boolean m127129y;
        int m116580c;
        Object m131226z0;
        if (!z11 && collection.size() == 1) {
            m131226z0 = AbstractC25332a0.m131226z0(collection);
            String str = (String) m131226z0;
            int m127173b0 = !z12 ? m127173b0(charSequence, str, i11, false, 4, null) : m127178g0(charSequence, str, i11, false, 4, null);
            if (m127173b0 < 0) {
                return null;
            }
            return AbstractC24866w.m129235a(Integer.valueOf(m127173b0), str);
        }
        if (!z12) {
            m116580c = AbstractC22543l.m116580c(i11, 0);
            m116590m = new C22537f(m116580c, charSequence.length());
        } else {
            m127163V = m127163V(charSequence);
            m116584g = AbstractC22543l.m116584g(i11, m127163V);
            m116590m = AbstractC22543l.m116590m(m116584g, 0);
        }
        if (charSequence instanceof String) {
            int m116547d = m116590m.m116547d();
            int m116548e = m116590m.m116548e();
            int m116549g = m116590m.m116549g();
            if ((m116549g > 0 && m116547d <= m116548e) || (m116549g < 0 && m116548e <= m116547d)) {
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            m127129y = AbstractC24341v.m127129y(str2, 0, (String) charSequence, m116547d, str2.length(), z11);
                            if (m127129y) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        return AbstractC24866w.m129235a(Integer.valueOf(m116547d), str3);
                    }
                    if (m116547d == m116548e) {
                        break;
                    }
                    m116547d += m116549g;
                }
            }
        } else {
            int m116547d2 = m116590m.m116547d();
            int m116548e2 = m116590m.m116548e();
            int m116549g2 = m116590m.m116549g();
            if ((m116549g2 > 0 && m116547d2 <= m116548e2) || (m116549g2 < 0 && m116548e2 <= m116547d2)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            String str4 = (String) obj;
                            if (m127188q0(str4, 0, charSequence, m116547d2, str4.length(), z11)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 != null) {
                        return AbstractC24866w.m129235a(Integer.valueOf(m116547d2), str5);
                    }
                    if (m116547d2 == m116548e2) {
                        break;
                    }
                    m116547d2 += m116549g2;
                }
            }
        }
        return null;
    }

    /* renamed from: T0 */
    public static /* synthetic */ String m127160T0(String str, char c11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        return m127156R0(str, c11, str2);
    }

    /* renamed from: U */
    public static final C22537f m127161U(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        return new C22537f(0, charSequence.length() - 1);
    }

    /* renamed from: U0 */
    public static /* synthetic */ String m127162U0(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return m127158S0(str, str2, str3);
    }

    /* renamed from: V */
    public static int m127163V(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: V0 */
    public static final String m127164V0(String str, String str2, String str3) {
        int m127178g0;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "delimiter");
        AbstractC19074t.m100208f(str3, "missingDelimiterValue");
        m127178g0 = m127178g0(str, str2, 0, false, 6, null);
        if (m127178g0 != -1) {
            String substring = str.substring(0, m127178g0);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        return str3;
    }

    /* renamed from: W */
    public static final int m127165W(CharSequence charSequence, char c11, int i11, boolean z11) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (!z11 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c11, i11);
        }
        return m127174c0(charSequence, new char[]{c11}, i11, z11);
    }

    /* renamed from: W0 */
    public static /* synthetic */ String m127166W0(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return m127164V0(str, str2, str3);
    }

    /* renamed from: X */
    public static int m127167X(CharSequence charSequence, String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(str, "string");
        if (!z11 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i11);
        }
        return m127171Z(charSequence, str, i11, charSequence.length(), z11, false, 16, null);
    }

    /* renamed from: X0 */
    public static CharSequence m127168X0(CharSequence charSequence) {
        int i11;
        boolean m126977c;
        AbstractC19074t.m100208f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i12 = 0;
        boolean z11 = false;
        while (i12 <= length) {
            if (!z11) {
                i11 = i12;
            } else {
                i11 = length;
            }
            m126977c = AbstractC24317b.m126977c(charSequence.charAt(i11));
            if (!z11) {
                if (!m126977c) {
                    z11 = true;
                } else {
                    i12++;
                }
            } else {
                if (!m126977c) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i12, length + 1);
    }

    /* renamed from: Y */
    private static final int m127169Y(CharSequence charSequence, CharSequence charSequence2, int i11, int i12, boolean z11, boolean z12) {
        int m127163V;
        int m116584g;
        int m116580c;
        C22535d m116590m;
        boolean m127129y;
        int m116580c2;
        int m116584g2;
        if (!z12) {
            m116580c2 = AbstractC22543l.m116580c(i11, 0);
            m116584g2 = AbstractC22543l.m116584g(i12, charSequence.length());
            m116590m = new C22537f(m116580c2, m116584g2);
        } else {
            m127163V = m127163V(charSequence);
            m116584g = AbstractC22543l.m116584g(i11, m127163V);
            m116580c = AbstractC22543l.m116580c(i12, 0);
            m116590m = AbstractC22543l.m116590m(m116584g, m116580c);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int m116547d = m116590m.m116547d();
            int m116548e = m116590m.m116548e();
            int m116549g = m116590m.m116549g();
            if ((m116549g <= 0 || m116547d > m116548e) && (m116549g >= 0 || m116548e > m116547d)) {
                return -1;
            }
            while (true) {
                m127129y = AbstractC24341v.m127129y((String) charSequence2, 0, (String) charSequence, m116547d, charSequence2.length(), z11);
                if (m127129y) {
                    return m116547d;
                }
                if (m116547d != m116548e) {
                    m116547d += m116549g;
                } else {
                    return -1;
                }
            }
        } else {
            int m116547d2 = m116590m.m116547d();
            int m116548e2 = m116590m.m116548e();
            int m116549g2 = m116590m.m116549g();
            if ((m116549g2 > 0 && m116547d2 <= m116548e2) || (m116549g2 < 0 && m116548e2 <= m116547d2)) {
                while (!m127188q0(charSequence2, 0, charSequence, m116547d2, charSequence2.length(), z11)) {
                    if (m116547d2 != m116548e2) {
                        m116547d2 += m116549g2;
                    } else {
                        return -1;
                    }
                }
                return m116547d2;
            }
            return -1;
        }
    }

    /* renamed from: Y0 */
    public static CharSequence m127170Y0(CharSequence charSequence) {
        boolean m126977c;
        AbstractC19074t.m100208f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                m126977c = AbstractC24317b.m126977c(charSequence.charAt(length));
                if (!m126977c) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return "";
    }

    /* renamed from: Z */
    static /* synthetic */ int m127171Z(CharSequence charSequence, CharSequence charSequence2, int i11, int i12, boolean z11, boolean z12, int i13, Object obj) {
        boolean z13;
        if ((i13 & 16) != 0) {
            z13 = false;
        } else {
            z13 = z12;
        }
        return m127169Y(charSequence, charSequence2, i11, i12, z11, z13);
    }

    /* renamed from: a0 */
    public static /* synthetic */ int m127172a0(CharSequence charSequence, char c11, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return m127165W(charSequence, c11, i11, z11);
    }

    /* renamed from: b0 */
    public static /* synthetic */ int m127173b0(CharSequence charSequence, String str, int i11, boolean z11, int i12, Object obj) {
        int m127167X;
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        m127167X = m127167X(charSequence, str, i11, z11);
        return m127167X;
    }

    /* renamed from: c0 */
    public static final int m127174c0(CharSequence charSequence, char[] cArr, int i11, boolean z11) {
        int m116580c;
        int m127163V;
        char m131376X;
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(cArr, "chars");
        if (z11 || cArr.length != 1 || !(charSequence instanceof String)) {
            m116580c = AbstractC22543l.m116580c(i11, 0);
            m127163V = m127163V(charSequence);
            AbstractC25351j0 it = new C22537f(m116580c, m127163V).iterator();
            while (it.hasNext()) {
                int mo116552a = it.mo116552a();
                char charAt = charSequence.charAt(mo116552a);
                for (char c11 : cArr) {
                    if (AbstractC24319c.m126979d(c11, charAt, z11)) {
                        return mo116552a;
                    }
                }
            }
            return -1;
        }
        m131376X = AbstractC25358n.m131376X(cArr);
        return ((String) charSequence).indexOf(m131376X, i11);
    }

    /* renamed from: d0 */
    public static final int m127175d0(CharSequence charSequence, char c11, int i11, boolean z11) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (!z11 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c11, i11);
        }
        return m127179h0(charSequence, new char[]{c11}, i11, z11);
    }

    /* renamed from: e0 */
    public static final int m127176e0(CharSequence charSequence, String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(str, "string");
        if (!z11 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i11);
        }
        return m127169Y(charSequence, str, i11, 0, z11, true);
    }

    /* renamed from: f0 */
    public static /* synthetic */ int m127177f0(CharSequence charSequence, char c11, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = m127163V(charSequence);
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return m127175d0(charSequence, c11, i11, z11);
    }

    /* renamed from: g0 */
    public static /* synthetic */ int m127178g0(CharSequence charSequence, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = m127163V(charSequence);
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return m127176e0(charSequence, str, i11, z11);
    }

    /* renamed from: h0 */
    public static final int m127179h0(CharSequence charSequence, char[] cArr, int i11, boolean z11) {
        int m127163V;
        int m116584g;
        char m131376X;
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(cArr, "chars");
        if (z11 || cArr.length != 1 || !(charSequence instanceof String)) {
            m127163V = m127163V(charSequence);
            for (m116584g = AbstractC22543l.m116584g(i11, m127163V); -1 < m116584g; m116584g--) {
                char charAt = charSequence.charAt(m116584g);
                for (char c11 : cArr) {
                    if (AbstractC24319c.m126979d(c11, charAt, z11)) {
                        return m116584g;
                    }
                }
            }
            return -1;
        }
        m131376X = AbstractC25358n.m131376X(cArr);
        return ((String) charSequence).lastIndexOf(m131376X, i11);
    }

    /* renamed from: i0 */
    public static final InterfaceC23898g m127180i0(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        return m127134D0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    /* renamed from: j0 */
    public static final List m127181j0(CharSequence charSequence) {
        List m125032u;
        AbstractC19074t.m100208f(charSequence, "<this>");
        m125032u = AbstractC23906o.m125032u(m127180i0(charSequence));
        return m125032u;
    }

    /* renamed from: k0 */
    public static final CharSequence m127182k0(CharSequence charSequence, int i11, char c11) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (i11 >= 0) {
            if (i11 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb2 = new StringBuilder(i11);
            AbstractC25351j0 it = new C22537f(1, i11 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.mo116552a();
                sb2.append(c11);
            }
            sb2.append(charSequence);
            return sb2;
        }
        throw new IllegalArgumentException("Desired length " + i11 + " is less than zero.");
    }

    /* renamed from: l0 */
    public static String m127183l0(String str, int i11, char c11) {
        AbstractC19074t.m100208f(str, "<this>");
        return m127182k0(str, i11, c11).toString();
    }

    /* renamed from: m0 */
    private static final InterfaceC23898g m127184m0(CharSequence charSequence, char[] cArr, int i11, boolean z11, int i12) {
        m127194w0(i12);
        return new C24323e(charSequence, i11, i12, new a(cArr, z11));
    }

    /* renamed from: n0 */
    private static final InterfaceC23898g m127185n0(CharSequence charSequence, String[] strArr, int i11, boolean z11, int i12) {
        List m131320c;
        m127194w0(i12);
        m131320c = AbstractC25356m.m131320c(strArr);
        return new C24323e(charSequence, i11, i12, new b(m131320c, z11));
    }

    /* renamed from: o0 */
    static /* synthetic */ InterfaceC23898g m127186o0(CharSequence charSequence, char[] cArr, int i11, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return m127184m0(charSequence, cArr, i11, z11, i12);
    }

    /* renamed from: p0 */
    static /* synthetic */ InterfaceC23898g m127187p0(CharSequence charSequence, String[] strArr, int i11, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return m127185n0(charSequence, strArr, i11, z11, i12);
    }

    /* renamed from: q0 */
    public static final boolean m127188q0(CharSequence charSequence, int i11, CharSequence charSequence2, int i12, int i13, boolean z11) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(charSequence2, "other");
        if (i12 < 0 || i11 < 0 || i11 > charSequence.length() - i13 || i12 > charSequence2.length() - i13) {
            return false;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (!AbstractC24319c.m126979d(charSequence.charAt(i11 + i14), charSequence2.charAt(i12 + i14), z11)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r0 */
    public static String m127189r0(String str, CharSequence charSequence) {
        boolean m127138H0;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(charSequence, "prefix");
        m127138H0 = m127138H0(str, charSequence, false, 2, null);
        if (m127138H0) {
            String substring = str.substring(charSequence.length());
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    /* renamed from: s0 */
    public static CharSequence m127190s0(CharSequence charSequence, int i11, int i12) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (i12 >= i11) {
            if (i12 == i11) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb2 = new StringBuilder(charSequence.length() - (i12 - i11));
            sb2.append(charSequence, 0, i11);
            AbstractC19074t.m100207e(sb2, "append(...)");
            sb2.append(charSequence, i12, charSequence.length());
            AbstractC19074t.m100207e(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i12 + ") is less than start index (" + i11 + ").");
    }

    /* renamed from: t0 */
    public static CharSequence m127191t0(CharSequence charSequence, C22537f c22537f) {
        CharSequence m127190s0;
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(c22537f, "range");
        m127190s0 = m127190s0(charSequence, c22537f.m116556n().intValue(), c22537f.m116555m().intValue() + 1);
        return m127190s0;
    }

    /* renamed from: u0 */
    public static String m127192u0(String str, CharSequence charSequence) {
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(charSequence, "suffix");
        if (m127157S(str, charSequence, false, 2, null)) {
            String substring = str.substring(0, str.length() - charSequence.length());
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    /* renamed from: v0 */
    public static CharSequence m127193v0(CharSequence charSequence, int i11, int i12, CharSequence charSequence2) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(charSequence2, "replacement");
        if (i12 >= i11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i11);
            AbstractC19074t.m100207e(sb2, "append(...)");
            sb2.append(charSequence2);
            sb2.append(charSequence, i12, charSequence.length());
            AbstractC19074t.m100207e(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i12 + ") is less than start index (" + i11 + ").");
    }

    /* renamed from: w0 */
    public static final void m127194w0(int i11) {
        if (i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i11).toString());
    }

    /* renamed from: x0 */
    public static final List m127195x0(CharSequence charSequence, char[] cArr, boolean z11, int i11) {
        Iterable m125019h;
        int m131511r;
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(cArr, "delimiters");
        if (cArr.length != 1) {
            m125019h = AbstractC23906o.m125019h(m127186o0(charSequence, cArr, 0, z11, i11, 2, null));
            m131511r = AbstractC25370t.m131511r(m125019h, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m125019h.iterator();
            while (it.hasNext()) {
                arrayList.add(m127139I0(charSequence, (C22537f) it.next()));
            }
            return arrayList;
        }
        return m127197z0(charSequence, String.valueOf(cArr[0]), z11, i11);
    }

    /* renamed from: y0 */
    public static final List m127196y0(CharSequence charSequence, String[] strArr, boolean z11, int i11) {
        Iterable m125019h;
        int m131511r;
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m127197z0(charSequence, str, z11, i11);
            }
        }
        m125019h = AbstractC23906o.m125019h(m127187p0(charSequence, strArr, 0, z11, i11, 2, null));
        m131511r = AbstractC25370t.m131511r(m125019h, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m125019h.iterator();
        while (it.hasNext()) {
            arrayList.add(m127139I0(charSequence, (C22537f) it.next()));
        }
        return arrayList;
    }

    /* renamed from: z0 */
    private static final List m127197z0(CharSequence charSequence, String str, boolean z11, int i11) {
        int m127167X;
        List m131496e;
        boolean z12;
        m127194w0(i11);
        int i12 = 0;
        m127167X = m127167X(charSequence, str, 0, z11);
        if (m127167X == -1 || i11 == 1) {
            m131496e = AbstractC25366r.m131496e(charSequence.toString());
            return m131496e;
        }
        if (i11 > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i13 = 10;
        if (z12) {
            i13 = AbstractC22543l.m116584g(i11, 10);
        }
        ArrayList arrayList = new ArrayList(i13);
        do {
            arrayList.add(charSequence.subSequence(i12, m127167X).toString());
            i12 = str.length() + m127167X;
            if (z12 && arrayList.size() == i11 - 1) {
                break;
            }
            m127167X = m127167X(charSequence, str, i12, z11);
        } while (m127167X != -1);
        arrayList.add(charSequence.subSequence(i12, charSequence.length()).toString());
        return arrayList;
    }
}
