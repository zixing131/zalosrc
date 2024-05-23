package on0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import ln0.AbstractC22543l;
import qm0.AbstractC25383z0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: on0.y */
/* loaded from: classes.dex */
public abstract class AbstractC24344y extends AbstractC24343x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: on0.y$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f117451q = new a();

        a() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(CharSequence charSequence) {
            AbstractC19074t.m100208f(charSequence, "it");
            return charSequence.toString();
        }
    }

    /* renamed from: Z0 */
    public static List m127201Z0(CharSequence charSequence, int i11) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        return m127214m1(charSequence, i11, i11, true);
    }

    /* renamed from: a1 */
    public static String m127202a1(String str, int i11) {
        int m116584g;
        AbstractC19074t.m100208f(str, "<this>");
        if (i11 >= 0) {
            m116584g = AbstractC22543l.m116584g(i11, str.length());
            String substring = str.substring(m116584g);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    /* renamed from: b1 */
    public static CharSequence m127203b1(CharSequence charSequence, int i11) {
        int m116580c;
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (i11 >= 0) {
            m116580c = AbstractC22543l.m116580c(charSequence.length() - i11, 0);
            return m127211j1(charSequence, m116580c);
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    /* renamed from: c1 */
    public static String m127204c1(String str, int i11) {
        int m116580c;
        String m127212k1;
        AbstractC19074t.m100208f(str, "<this>");
        if (i11 >= 0) {
            m116580c = AbstractC22543l.m116580c(str.length() - i11, 0);
            m127212k1 = m127212k1(str, m116580c);
            return m127212k1;
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    /* renamed from: d1 */
    public static char m127205d1(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: e1 */
    public static Character m127206e1(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    /* renamed from: f1 */
    public static Character m127207f1(CharSequence charSequence, int i11) {
        int m127163V;
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (i11 >= 0) {
            m127163V = AbstractC24342w.m127163V(charSequence);
            if (i11 <= m127163V) {
                return Character.valueOf(charSequence.charAt(i11));
            }
        }
        return null;
    }

    /* renamed from: g1 */
    public static char m127208g1(CharSequence charSequence) {
        int m127163V;
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            m127163V = AbstractC24342w.m127163V(charSequence);
            return charSequence.charAt(m127163V);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: h1 */
    public static CharSequence m127209h1(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        AbstractC19074t.m100207e(reverse, "reverse(...)");
        return reverse;
    }

    /* renamed from: i1 */
    public static char m127210i1(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: j1 */
    public static final CharSequence m127211j1(CharSequence charSequence, int i11) {
        int m116584g;
        AbstractC19074t.m100208f(charSequence, "<this>");
        if (i11 >= 0) {
            m116584g = AbstractC22543l.m116584g(i11, charSequence.length());
            return charSequence.subSequence(0, m116584g);
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    /* renamed from: k1 */
    public static String m127212k1(String str, int i11) {
        int m116584g;
        AbstractC19074t.m100208f(str, "<this>");
        if (i11 >= 0) {
            m116584g = AbstractC22543l.m116584g(i11, str.length());
            String substring = str.substring(0, m116584g);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    /* renamed from: l1 */
    public static String m127213l1(String str, int i11) {
        int m116584g;
        AbstractC19074t.m100208f(str, "<this>");
        if (i11 >= 0) {
            int length = str.length();
            m116584g = AbstractC22543l.m116584g(i11, length);
            String substring = str.substring(length - m116584g);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    /* renamed from: m1 */
    public static final List m127214m1(CharSequence charSequence, int i11, int i12, boolean z11) {
        AbstractC19074t.m100208f(charSequence, "<this>");
        return m127215n1(charSequence, i11, i12, z11, a.f117451q);
    }

    /* renamed from: n1 */
    public static final List m127215n1(CharSequence charSequence, int i11, int i12, boolean z11, InterfaceC18505l interfaceC18505l) {
        int i13;
        AbstractC19074t.m100208f(charSequence, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "transform");
        AbstractC25383z0.m131567a(i11, i12);
        int length = charSequence.length();
        int i14 = length / i12;
        int i15 = 0;
        if (length % i12 == 0) {
            i13 = 0;
        } else {
            i13 = 1;
        }
        ArrayList arrayList = new ArrayList(i14 + i13);
        while (i15 >= 0 && i15 < length) {
            int i16 = i15 + i11;
            if (i16 < 0 || i16 > length) {
                if (!z11) {
                    break;
                }
                i16 = length;
            }
            arrayList.add(interfaceC18505l.mo205i9(charSequence.subSequence(i15, i16)));
            i15 += i12;
        }
        return arrayList;
    }
}
