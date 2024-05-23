package p675ya;

import java.util.Arrays;

/* renamed from: ya.e */
/* loaded from: classes3.dex */
public class C30866e {

    /* renamed from: a */
    private final CharSequence f142422a;

    /* renamed from: b */
    private final int f142423b;

    /* renamed from: c */
    private final int f142424c;

    /* renamed from: d */
    private final byte[] f142425d;

    public C30866e(CharSequence charSequence, int i11, int i12) {
        this.f142422a = charSequence;
        this.f142424c = i11;
        this.f142423b = i12;
        byte[] bArr = new byte[i11 * i12];
        this.f142425d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    private void m150019a(int i11) {
        m150023f(this.f142423b - 1, 0, i11, 1);
        m150023f(this.f142423b - 1, 1, i11, 2);
        m150023f(this.f142423b - 1, 2, i11, 3);
        m150023f(0, this.f142424c - 2, i11, 4);
        m150023f(0, this.f142424c - 1, i11, 5);
        m150023f(1, this.f142424c - 1, i11, 6);
        m150023f(2, this.f142424c - 1, i11, 7);
        m150023f(3, this.f142424c - 1, i11, 8);
    }

    /* renamed from: b */
    private void m150020b(int i11) {
        m150023f(this.f142423b - 3, 0, i11, 1);
        m150023f(this.f142423b - 2, 0, i11, 2);
        m150023f(this.f142423b - 1, 0, i11, 3);
        m150023f(0, this.f142424c - 4, i11, 4);
        m150023f(0, this.f142424c - 3, i11, 5);
        m150023f(0, this.f142424c - 2, i11, 6);
        m150023f(0, this.f142424c - 1, i11, 7);
        m150023f(1, this.f142424c - 1, i11, 8);
    }

    /* renamed from: c */
    private void m150021c(int i11) {
        m150023f(this.f142423b - 3, 0, i11, 1);
        m150023f(this.f142423b - 2, 0, i11, 2);
        m150023f(this.f142423b - 1, 0, i11, 3);
        m150023f(0, this.f142424c - 2, i11, 4);
        m150023f(0, this.f142424c - 1, i11, 5);
        m150023f(1, this.f142424c - 1, i11, 6);
        m150023f(2, this.f142424c - 1, i11, 7);
        m150023f(3, this.f142424c - 1, i11, 8);
    }

    /* renamed from: d */
    private void m150022d(int i11) {
        m150023f(this.f142423b - 1, 0, i11, 1);
        m150023f(this.f142423b - 1, this.f142424c - 1, i11, 2);
        m150023f(0, this.f142424c - 3, i11, 3);
        m150023f(0, this.f142424c - 2, i11, 4);
        m150023f(0, this.f142424c - 1, i11, 5);
        m150023f(1, this.f142424c - 3, i11, 6);
        m150023f(1, this.f142424c - 2, i11, 7);
        m150023f(1, this.f142424c - 1, i11, 8);
    }

    /* renamed from: f */
    private void m150023f(int i11, int i12, int i13, int i14) {
        if (i11 < 0) {
            int i15 = this.f142423b;
            i11 += i15;
            i12 += 4 - ((i15 + 4) % 8);
        }
        if (i12 < 0) {
            int i16 = this.f142424c;
            i12 += i16;
            i11 += 4 - ((i16 + 4) % 8);
        }
        boolean z11 = true;
        if ((this.f142422a.charAt(i13) & (1 << (8 - i14))) == 0) {
            z11 = false;
        }
        m150025i(i12, i11, z11);
    }

    /* renamed from: g */
    private boolean m150024g(int i11, int i12) {
        if (this.f142425d[(i12 * this.f142424c) + i11] < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m150025i(int i11, int i12, boolean z11) {
        this.f142425d[(i12 * this.f142424c) + i11] = z11 ? (byte) 1 : (byte) 0;
    }

    /* renamed from: j */
    private void m150026j(int i11, int i12, int i13) {
        int i14 = i11 - 2;
        int i15 = i12 - 2;
        m150023f(i14, i15, i13, 1);
        int i16 = i12 - 1;
        m150023f(i14, i16, i13, 2);
        int i17 = i11 - 1;
        m150023f(i17, i15, i13, 3);
        m150023f(i17, i16, i13, 4);
        m150023f(i17, i12, i13, 5);
        m150023f(i11, i15, i13, 6);
        m150023f(i11, i16, i13, 7);
        m150023f(i11, i12, i13, 8);
    }

    /* renamed from: e */
    public final boolean m150027e(int i11, int i12) {
        if (this.f142425d[(i12 * this.f142424c) + i11] == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void m150028h() {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 4;
        while (true) {
            if (i15 == this.f142423b && i13 == 0) {
                m150019a(i14);
                i14++;
            }
            if (i15 == this.f142423b - 2 && i13 == 0 && this.f142424c % 4 != 0) {
                m150020b(i14);
                i14++;
            }
            if (i15 == this.f142423b - 2 && i13 == 0 && this.f142424c % 8 == 4) {
                m150021c(i14);
                i14++;
            }
            if (i15 == this.f142423b + 4 && i13 == 2 && this.f142424c % 8 == 0) {
                m150022d(i14);
                i14++;
            }
            while (true) {
                if (i15 < this.f142423b && i13 >= 0 && m150024g(i13, i15)) {
                    m150026j(i15, i13, i14);
                    i14++;
                }
                int i16 = i15 - 2;
                int i17 = i13 + 2;
                if (i16 < 0 || i17 >= this.f142424c) {
                    break;
                }
                i15 = i16;
                i13 = i17;
            }
            int i18 = i15 - 1;
            int i19 = i13 + 5;
            while (true) {
                if (i18 >= 0 && i19 < this.f142424c && m150024g(i19, i18)) {
                    m150026j(i18, i19, i14);
                    i14++;
                }
                int i21 = i18 + 2;
                int i22 = i19 - 2;
                i11 = this.f142423b;
                if (i21 >= i11 || i22 < 0) {
                    break;
                }
                i18 = i21;
                i19 = i22;
            }
            i15 = i18 + 5;
            i13 = i19 - 1;
            if (i15 >= i11 && i13 >= (i12 = this.f142424c)) {
                break;
            }
        }
        if (m150024g(i12 - 1, i11 - 1)) {
            m150025i(this.f142424c - 1, this.f142423b - 1, true);
            m150025i(this.f142424c - 2, this.f142423b - 2, true);
        }
    }
}
