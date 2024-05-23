package va;

import java.util.Arrays;

/* renamed from: va.b */
/* loaded from: classes3.dex */
public final class C27954b implements Cloneable {

    /* renamed from: p */
    private final int f130311p;

    /* renamed from: q */
    private final int f130312q;

    /* renamed from: r */
    private final int f130313r;

    /* renamed from: s */
    private final int[] f130314s;

    public C27954b(int i11) {
        this(i11, i11);
    }

    /* renamed from: a */
    private String m140887a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb2 = new StringBuilder(this.f130312q * (this.f130311p + 1));
        for (int i11 = 0; i11 < this.f130312q; i11++) {
            for (int i12 = 0; i12 < this.f130311p; i12++) {
                if (m140890e(i12, i11)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                sb2.append(str4);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public void m140888b() {
        int length = this.f130314s.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f130314s[i11] = 0;
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C27954b clone() {
        return new C27954b(this.f130311p, this.f130312q, this.f130313r, (int[]) this.f130314s.clone());
    }

    /* renamed from: e */
    public boolean m140890e(int i11, int i12) {
        if (((this.f130314s[(i12 * this.f130313r) + (i11 / 32)] >>> (i11 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C27954b)) {
            return false;
        }
        C27954b c27954b = (C27954b) obj;
        if (this.f130311p != c27954b.f130311p || this.f130312q != c27954b.f130312q || this.f130313r != c27954b.f130313r || !Arrays.equals(this.f130314s, c27954b.f130314s)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int m140891f() {
        return this.f130312q;
    }

    /* renamed from: g */
    public int m140892g() {
        return this.f130311p;
    }

    /* renamed from: h */
    public void m140893h(int i11, int i12) {
        int i13 = (i12 * this.f130313r) + (i11 / 32);
        int[] iArr = this.f130314s;
        iArr[i13] = (1 << (i11 & 31)) | iArr[i13];
    }

    public int hashCode() {
        int i11 = this.f130311p;
        return (((((((i11 * 31) + i11) * 31) + this.f130312q) * 31) + this.f130313r) * 31) + Arrays.hashCode(this.f130314s);
    }

    /* renamed from: i */
    public void m140894i(int i11, int i12, int i13, int i14) {
        if (i12 >= 0 && i11 >= 0) {
            if (i14 >= 1 && i13 >= 1) {
                int i15 = i13 + i11;
                int i16 = i14 + i12;
                if (i16 <= this.f130312q && i15 <= this.f130311p) {
                    while (i12 < i16) {
                        int i17 = this.f130313r * i12;
                        for (int i18 = i11; i18 < i15; i18++) {
                            int[] iArr = this.f130314s;
                            int i19 = (i18 / 32) + i17;
                            iArr[i19] = iArr[i19] | (1 << (i18 & 31));
                        }
                        i12++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    /* renamed from: j */
    public String m140895j(String str, String str2) {
        return m140887a(str, str2, "\n");
    }

    public String toString() {
        return m140895j("X ", "  ");
    }

    public C27954b(int i11, int i12) {
        if (i11 >= 1 && i12 >= 1) {
            this.f130311p = i11;
            this.f130312q = i12;
            int i13 = (i11 + 31) / 32;
            this.f130313r = i13;
            this.f130314s = new int[i13 * i12];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    private C27954b(int i11, int i12, int i13, int[] iArr) {
        this.f130311p = i11;
        this.f130312q = i12;
        this.f130313r = i13;
        this.f130314s = iArr;
    }
}
