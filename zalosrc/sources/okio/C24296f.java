package okio;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: okio.f */
/* loaded from: classes7.dex */
public final class C24296f extends C24293c {

    /* renamed from: u */
    final transient byte[][] f117294u;

    /* renamed from: v */
    final transient int[] f117295v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24296f(C24291a c24291a, int i11) {
        super(null);
        AbstractC24297g.m126839b(c24291a.f117279q, 0L, i11);
        C24294d c24294d = c24291a.f117278p;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            int i15 = c24294d.f117287c;
            int i16 = c24294d.f117286b;
            if (i15 != i16) {
                i13 += i15 - i16;
                i14++;
                c24294d = c24294d.f117290f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f117294u = new byte[i14];
        this.f117295v = new int[i14 * 2];
        C24294d c24294d2 = c24291a.f117278p;
        int i17 = 0;
        while (i12 < i11) {
            byte[][] bArr = this.f117294u;
            bArr[i17] = c24294d2.f117285a;
            int i18 = c24294d2.f117287c;
            int i19 = c24294d2.f117286b;
            i12 += i18 - i19;
            if (i12 > i11) {
                i12 = i11;
            }
            int[] iArr = this.f117295v;
            iArr[i17] = i12;
            iArr[bArr.length + i17] = i19;
            c24294d2.f117288d = true;
            i17++;
            c24294d2 = c24294d2.f117290f;
        }
    }

    /* renamed from: u */
    private int m126834u(int i11) {
        int binarySearch = Arrays.binarySearch(this.f117295v, 0, this.f117294u.length, i11 + 1);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        return binarySearch;
    }

    /* renamed from: w */
    private C24293c m126835w() {
        return new C24293c(m126837v());
    }

    private Object writeReplace() {
        return m126835w();
    }

    @Override // okio.C24293c
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24293c) {
            C24293c c24293c = (C24293c) obj;
            if (c24293c.mo126826q() == mo126826q() && m126836t(0, c24293c, 0, mo126826q())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.C24293c
    /* renamed from: g */
    public byte mo126823g(int i11) {
        int i12;
        AbstractC24297g.m126839b(this.f117295v[this.f117294u.length - 1], i11, 1L);
        int m126834u = m126834u(i11);
        if (m126834u == 0) {
            i12 = 0;
        } else {
            i12 = this.f117295v[m126834u - 1];
        }
        int[] iArr = this.f117295v;
        byte[][] bArr = this.f117294u;
        return bArr[m126834u][(i11 - i12) + iArr[bArr.length + m126834u]];
    }

    @Override // okio.C24293c
    /* renamed from: h */
    public String mo126824h() {
        return m126835w().mo126824h();
    }

    @Override // okio.C24293c
    public int hashCode() {
        int i11 = this.f117283q;
        if (i11 != 0) {
            return i11;
        }
        int length = this.f117294u.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (i12 < length) {
            byte[] bArr = this.f117294u[i12];
            int[] iArr = this.f117295v;
            int i15 = iArr[length + i12];
            int i16 = iArr[i12];
            int i17 = (i16 - i13) + i15;
            while (i15 < i17) {
                i14 = (i14 * 31) + bArr[i15];
                i15++;
            }
            i12++;
            i13 = i16;
        }
        this.f117283q = i14;
        return i14;
    }

    @Override // okio.C24293c
    /* renamed from: j */
    public boolean mo126825j(int i11, byte[] bArr, int i12, int i13) {
        int i14;
        if (i11 < 0 || i11 > mo126826q() - i13 || i12 < 0 || i12 > bArr.length - i13) {
            return false;
        }
        int m126834u = m126834u(i11);
        while (i13 > 0) {
            if (m126834u == 0) {
                i14 = 0;
            } else {
                i14 = this.f117295v[m126834u - 1];
            }
            int min = Math.min(i13, ((this.f117295v[m126834u] - i14) + i14) - i11);
            int[] iArr = this.f117295v;
            byte[][] bArr2 = this.f117294u;
            if (!AbstractC24297g.m126838a(bArr2[m126834u], (i11 - i14) + iArr[bArr2.length + m126834u], bArr, i12, min)) {
                return false;
            }
            i11 += min;
            i12 += min;
            i13 -= min;
            m126834u++;
        }
        return true;
    }

    @Override // okio.C24293c
    /* renamed from: q */
    public int mo126826q() {
        return this.f117295v[this.f117294u.length - 1];
    }

    @Override // okio.C24293c
    /* renamed from: r */
    public C24293c mo126827r(int i11, int i12) {
        return m126835w().mo126827r(i11, i12);
    }

    @Override // okio.C24293c
    /* renamed from: s */
    public String mo126828s() {
        return m126835w().mo126828s();
    }

    /* renamed from: t */
    public boolean m126836t(int i11, C24293c c24293c, int i12, int i13) {
        int i14;
        if (i11 < 0 || i11 > mo126826q() - i13) {
            return false;
        }
        int m126834u = m126834u(i11);
        while (i13 > 0) {
            if (m126834u == 0) {
                i14 = 0;
            } else {
                i14 = this.f117295v[m126834u - 1];
            }
            int min = Math.min(i13, ((this.f117295v[m126834u] - i14) + i14) - i11);
            int[] iArr = this.f117295v;
            byte[][] bArr = this.f117294u;
            if (!c24293c.mo126825j(i12, bArr[m126834u], (i11 - i14) + iArr[bArr.length + m126834u], min)) {
                return false;
            }
            i11 += min;
            i12 += min;
            i13 -= min;
            m126834u++;
        }
        return true;
    }

    @Override // okio.C24293c
    public String toString() {
        return m126835w().toString();
    }

    /* renamed from: v */
    public byte[] m126837v() {
        int[] iArr = this.f117295v;
        byte[][] bArr = this.f117294u;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int[] iArr2 = this.f117295v;
            int i13 = iArr2[length + i11];
            int i14 = iArr2[i11];
            System.arraycopy(this.f117294u[i11], i13, bArr2, i12, i14 - i12);
            i11++;
            i12 = i14;
        }
        return bArr2;
    }
}
