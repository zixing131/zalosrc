package qm0;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19044c;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import ln0.AbstractC22543l;
import ln0.C22537f;
import on0.AbstractC24333n;
import pm0.AbstractC24866w;

/* renamed from: qm0.n */
/* loaded from: classes.dex */
public abstract class AbstractC25358n extends AbstractC25356m {

    /* renamed from: qm0.n$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Object[] f121545q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object[] objArr) {
            super(0);
            this.f121545q = objArr;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Iterator mo12V4() {
            return AbstractC19044c.m100149a(this.f121545q);
        }
    }

    /* renamed from: A */
    public static List m131353A(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "<this>");
        return (List) m131354B(objArr, new ArrayList());
    }

    /* renamed from: B */
    public static final Collection m131354B(Object[] objArr, Collection collection) {
        AbstractC19074t.m100208f(objArr, "<this>");
        AbstractC19074t.m100208f(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    /* renamed from: C */
    public static float m131355C(float[] fArr) {
        AbstractC19074t.m100208f(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: D */
    public static Object m131356D(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: E */
    public static Object m131357E(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* renamed from: F */
    public static C22537f m131358F(float[] fArr) {
        int m131359G;
        AbstractC19074t.m100208f(fArr, "<this>");
        m131359G = m131359G(fArr);
        return new C22537f(0, m131359G);
    }

    /* renamed from: G */
    public static int m131359G(float[] fArr) {
        AbstractC19074t.m100208f(fArr, "<this>");
        return fArr.length - 1;
    }

    /* renamed from: H */
    public static int m131360H(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "<this>");
        return iArr.length - 1;
    }

    /* renamed from: I */
    public static int m131361I(long[] jArr) {
        AbstractC19074t.m100208f(jArr, "<this>");
        return jArr.length - 1;
    }

    /* renamed from: J */
    public static final int m131362J(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "<this>");
        return objArr.length - 1;
    }

    /* renamed from: K */
    public static Integer m131363K(int[] iArr, int i11) {
        int m131360H;
        AbstractC19074t.m100208f(iArr, "<this>");
        if (i11 >= 0) {
            m131360H = m131360H(iArr);
            if (i11 <= m131360H) {
                return Integer.valueOf(iArr[i11]);
            }
        }
        return null;
    }

    /* renamed from: L */
    public static Object m131364L(Object[] objArr, int i11) {
        AbstractC19074t.m100208f(objArr, "<this>");
        if (i11 >= 0 && i11 <= m131362J(objArr)) {
            return objArr[i11];
        }
        return null;
    }

    /* renamed from: M */
    public static final int m131365M(byte[] bArr, byte b11) {
        AbstractC19074t.m100208f(bArr, "<this>");
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (b11 == bArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: N */
    public static int m131366N(int[] iArr, int i11) {
        AbstractC19074t.m100208f(iArr, "<this>");
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (i11 == iArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: O */
    public static final int m131367O(long[] jArr, long j11) {
        AbstractC19074t.m100208f(jArr, "<this>");
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (j11 == jArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: P */
    public static int m131368P(Object[] objArr, Object obj) {
        AbstractC19074t.m100208f(objArr, "<this>");
        int i11 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i11 < length) {
                if (objArr[i11] == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i11 < length2) {
            if (AbstractC19074t.m100204b(obj, objArr[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* renamed from: Q */
    public static final int m131369Q(short[] sArr, short s7) {
        AbstractC19074t.m100208f(sArr, "<this>");
        int length = sArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (s7 == sArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: R */
    public static final Appendable m131370R(int[] iArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(iArr, "<this>");
        AbstractC19074t.m100208f(appendable, "buffer");
        AbstractC19074t.m100208f(charSequence, "separator");
        AbstractC19074t.m100208f(charSequence2, "prefix");
        AbstractC19074t.m100208f(charSequence3, "postfix");
        AbstractC19074t.m100208f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i12 = 0;
        for (int i13 : iArr) {
            i12++;
            if (i12 > 1) {
                appendable.append(charSequence);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (interfaceC18505l != null) {
                appendable.append((CharSequence) interfaceC18505l.mo205i9(Integer.valueOf(i13)));
            } else {
                appendable.append(String.valueOf(i13));
            }
        }
        if (i11 >= 0 && i12 > i11) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: S */
    public static final Appendable m131371S(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(objArr, "<this>");
        AbstractC19074t.m100208f(appendable, "buffer");
        AbstractC19074t.m100208f(charSequence, "separator");
        AbstractC19074t.m100208f(charSequence2, "prefix");
        AbstractC19074t.m100208f(charSequence3, "postfix");
        AbstractC19074t.m100208f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i12 = 0;
        for (Object obj : objArr) {
            i12++;
            if (i12 > 1) {
                appendable.append(charSequence);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            AbstractC24333n.m127093a(appendable, obj, interfaceC18505l);
        }
        if (i11 >= 0 && i12 > i11) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: T */
    public static final String m131372T(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(iArr, "<this>");
        AbstractC19074t.m100208f(charSequence, "separator");
        AbstractC19074t.m100208f(charSequence2, "prefix");
        AbstractC19074t.m100208f(charSequence3, "postfix");
        AbstractC19074t.m100208f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m131370R(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i11, charSequence4, interfaceC18505l)).toString();
        AbstractC19074t.m100207e(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: U */
    public static final String m131373U(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(objArr, "<this>");
        AbstractC19074t.m100208f(charSequence, "separator");
        AbstractC19074t.m100208f(charSequence2, "prefix");
        AbstractC19074t.m100208f(charSequence3, "postfix");
        AbstractC19074t.m100208f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m131371S(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i11, charSequence4, interfaceC18505l)).toString();
        AbstractC19074t.m100207e(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: V */
    public static /* synthetic */ String m131374V(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, InterfaceC18505l interfaceC18505l, int i12, Object obj) {
        CharSequence charSequence5;
        int i13;
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i12 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i12 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i12 & 8) != 0) {
            i13 = -1;
        } else {
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i12 & 32) != 0) {
            interfaceC18505l = null;
        }
        return m131372T(iArr, charSequence, charSequence5, charSequence6, i13, charSequence7, interfaceC18505l);
    }

    /* renamed from: W */
    public static /* synthetic */ String m131375W(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, InterfaceC18505l interfaceC18505l, int i12, Object obj) {
        CharSequence charSequence5;
        int i13;
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i12 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i12 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i12 & 8) != 0) {
            i13 = -1;
        } else {
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i12 & 32) != 0) {
            interfaceC18505l = null;
        }
        return m131373U(objArr, charSequence, charSequence5, charSequence6, i13, charSequence7, interfaceC18505l);
    }

    /* renamed from: X */
    public static char m131376X(char[] cArr) {
        AbstractC19074t.m100208f(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: Y */
    public static Object m131377Y(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    /* renamed from: Z */
    public static final List m131378Z(Object[] objArr, int i11) {
        List m131496e;
        List m131381c0;
        List m131502j;
        AbstractC19074t.m100208f(objArr, "<this>");
        if (i11 >= 0) {
            if (i11 == 0) {
                m131502j = AbstractC25368s.m131502j();
                return m131502j;
            }
            int length = objArr.length;
            if (i11 >= length) {
                m131381c0 = m131381c0(objArr);
                return m131381c0;
            }
            if (i11 == 1) {
                m131496e = AbstractC25366r.m131496e(objArr[length - 1]);
                return m131496e;
            }
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = length - i11; i12 < length; i12++) {
                arrayList.add(objArr[i12]);
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    /* renamed from: a0 */
    public static final Collection m131379a0(Object[] objArr, Collection collection) {
        AbstractC19074t.m100208f(objArr, "<this>");
        AbstractC19074t.m100208f(collection, "destination");
        for (Object obj : objArr) {
            collection.add(obj);
        }
        return collection;
    }

    /* renamed from: b0 */
    public static float[] m131380b0(Float[] fArr) {
        AbstractC19074t.m100208f(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i11 = 0; i11 < length; i11++) {
            fArr2[i11] = fArr[i11].floatValue();
        }
        return fArr2;
    }

    /* renamed from: c0 */
    public static List m131381c0(Object[] objArr) {
        List m131502j;
        List m131496e;
        AbstractC19074t.m100208f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        if (length == 1) {
            m131496e = AbstractC25366r.m131496e(objArr[0]);
            return m131496e;
        }
        return m131382d0(objArr);
    }

    /* renamed from: d0 */
    public static final List m131382d0(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "<this>");
        return new ArrayList(AbstractC25368s.m131501i(objArr));
    }

    /* renamed from: e0 */
    public static final Set m131383e0(Object[] objArr) {
        int m131400e;
        AbstractC19074t.m100208f(objArr, "<this>");
        m131400e = AbstractC25361o0.m131400e(objArr.length);
        return (Set) m131379a0(objArr, new LinkedHashSet(m131400e));
    }

    /* renamed from: f0 */
    public static final Set m131384f0(Object[] objArr) {
        Set m131551e;
        Set m131538d;
        int m131400e;
        AbstractC19074t.m100208f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            m131551e = AbstractC25379x0.m131551e();
            return m131551e;
        }
        if (length != 1) {
            m131400e = AbstractC25361o0.m131400e(objArr.length);
            return (Set) m131379a0(objArr, new LinkedHashSet(m131400e));
        }
        m131538d = AbstractC25377w0.m131538d(objArr[0]);
        return m131538d;
    }

    /* renamed from: g0 */
    public static Iterable m131385g0(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "<this>");
        return new C25347h0(new a(objArr));
    }

    /* renamed from: h0 */
    public static List m131386h0(Object[] objArr, Object[] objArr2) {
        AbstractC19074t.m100208f(objArr, "<this>");
        AbstractC19074t.m100208f(objArr2, "other");
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(AbstractC24866w.m129235a(objArr[i11], objArr2[i11]));
        }
        return arrayList;
    }

    /* renamed from: t */
    public static boolean m131387t(byte[] bArr, byte b11) {
        AbstractC19074t.m100208f(bArr, "<this>");
        if (m131365M(bArr, b11) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m131388u(int[] iArr, int i11) {
        int m131366N;
        AbstractC19074t.m100208f(iArr, "<this>");
        m131366N = m131366N(iArr, i11);
        if (m131366N >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static boolean m131389v(long[] jArr, long j11) {
        AbstractC19074t.m100208f(jArr, "<this>");
        if (m131367O(jArr, j11) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m131390w(Object[] objArr, Object obj) {
        int m131368P;
        AbstractC19074t.m100208f(objArr, "<this>");
        m131368P = m131368P(objArr, obj);
        if (m131368P >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m131391x(short[] sArr, short s7) {
        AbstractC19074t.m100208f(sArr, "<this>");
        if (m131369Q(sArr, s7) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static List m131392y(Object[] objArr) {
        List m131185M0;
        AbstractC19074t.m100208f(objArr, "<this>");
        m131185M0 = AbstractC25332a0.m131185M0(m131383e0(objArr));
        return m131185M0;
    }

    /* renamed from: z */
    public static List m131393z(Object[] objArr, int i11) {
        int m116580c;
        AbstractC19074t.m100208f(objArr, "<this>");
        if (i11 >= 0) {
            m116580c = AbstractC22543l.m116580c(objArr.length - i11, 0);
            return m131378Z(objArr, m116580c);
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }
}
