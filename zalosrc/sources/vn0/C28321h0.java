package vn0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;

/* renamed from: vn0.h0 */
/* loaded from: classes7.dex */
public final class C28321h0 implements InterfaceC28337p0 {

    /* renamed from: a */
    private char[] f132046a = C28324j.f132054c.m142721d();

    /* renamed from: b */
    private int f132047b;

    /* renamed from: e */
    private final void m142708e(int i11, int i12, String str) {
        int i13;
        int length = str.length();
        while (i11 < length) {
            int m142710g = m142710g(i12, 2);
            char charAt = str.charAt(i11);
            if (charAt < AbstractC28351w0.m142790a().length) {
                byte b11 = AbstractC28351w0.m142790a()[charAt];
                if (b11 == 0) {
                    i13 = m142710g + 1;
                    this.f132046a[m142710g] = charAt;
                } else {
                    if (b11 == 1) {
                        String str2 = AbstractC28351w0.m142791b()[charAt];
                        AbstractC19074t.m100205c(str2);
                        int m142710g2 = m142710g(m142710g, str2.length());
                        str2.getChars(0, str2.length(), this.f132046a, m142710g2);
                        i12 = m142710g2 + str2.length();
                        this.f132047b = i12;
                    } else {
                        char[] cArr = this.f132046a;
                        cArr[m142710g] = '\\';
                        cArr[m142710g + 1] = (char) b11;
                        i12 = m142710g + 2;
                        this.f132047b = i12;
                    }
                    i11++;
                }
            } else {
                i13 = m142710g + 1;
                this.f132046a[m142710g] = charAt;
            }
            i12 = i13;
            i11++;
        }
        int m142710g3 = m142710g(i12, 1);
        this.f132046a[m142710g3] = '\"';
        this.f132047b = m142710g3 + 1;
    }

    /* renamed from: f */
    private final void m142709f(int i11) {
        m142710g(this.f132047b, i11);
    }

    /* renamed from: g */
    private final int m142710g(int i11, int i12) {
        int m116580c;
        int i13 = i12 + i11;
        char[] cArr = this.f132046a;
        if (cArr.length <= i13) {
            m116580c = AbstractC22543l.m116580c(i13, i11 * 2);
            char[] copyOf = Arrays.copyOf(cArr, m116580c);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            this.f132046a = copyOf;
        }
        return i11;
    }

    @Override // vn0.InterfaceC28337p0
    /* renamed from: a */
    public void mo142711a(char c11) {
        m142709f(1);
        char[] cArr = this.f132046a;
        int i11 = this.f132047b;
        this.f132047b = i11 + 1;
        cArr[i11] = c11;
    }

    @Override // vn0.InterfaceC28337p0
    /* renamed from: b */
    public void mo142712b(String str) {
        AbstractC19074t.m100208f(str, "text");
        m142709f(str.length() + 2);
        char[] cArr = this.f132046a;
        int i11 = this.f132047b;
        int i12 = i11 + 1;
        cArr[i11] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i12);
        int i13 = length + i12;
        for (int i14 = i12; i14 < i13; i14++) {
            char c11 = cArr[i14];
            if (c11 < AbstractC28351w0.m142790a().length && AbstractC28351w0.m142790a()[c11] != 0) {
                m142708e(i14 - i12, i14, str);
                return;
            }
        }
        cArr[i13] = '\"';
        this.f132047b = i13 + 1;
    }

    @Override // vn0.InterfaceC28337p0
    /* renamed from: c */
    public void mo142713c(long j11) {
        mo142714d(String.valueOf(j11));
    }

    @Override // vn0.InterfaceC28337p0
    /* renamed from: d */
    public void mo142714d(String str) {
        AbstractC19074t.m100208f(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        m142709f(length);
        str.getChars(0, str.length(), this.f132046a, this.f132047b);
        this.f132047b += length;
    }

    /* renamed from: h */
    public void m142715h() {
        C28324j.f132054c.m142720c(this.f132046a);
    }

    public String toString() {
        return new String(this.f132046a, 0, this.f132047b);
    }
}
