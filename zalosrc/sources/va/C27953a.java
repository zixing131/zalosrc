package va;

import java.util.Arrays;

/* renamed from: va.a */
/* loaded from: classes3.dex */
public final class C27953a implements Cloneable {

    /* renamed from: p */
    private int[] f130309p;

    /* renamed from: q */
    private int f130310q;

    public C27953a() {
        this.f130310q = 0;
        this.f130309p = new int[1];
    }

    /* renamed from: e */
    private void m140880e(int i11) {
        if (i11 > this.f130309p.length * 32) {
            int[] m140881h = m140881h(i11);
            int[] iArr = this.f130309p;
            System.arraycopy(iArr, 0, m140881h, 0, iArr.length);
            this.f130309p = m140881h;
        }
    }

    /* renamed from: h */
    private static int[] m140881h(int i11) {
        return new int[(i11 + 31) / 32];
    }

    /* renamed from: a */
    public void m140882a(boolean z11) {
        m140880e(this.f130310q + 1);
        if (z11) {
            int[] iArr = this.f130309p;
            int i11 = this.f130310q;
            int i12 = i11 / 32;
            iArr[i12] = (1 << (i11 & 31)) | iArr[i12];
        }
        this.f130310q++;
    }

    /* renamed from: b */
    public void m140883b(int i11, int i12) {
        if (i12 >= 0 && i12 <= 32) {
            m140880e(this.f130310q + i12);
            while (i12 > 0) {
                boolean z11 = true;
                if (((i11 >> (i12 - 1)) & 1) != 1) {
                    z11 = false;
                }
                m140882a(z11);
                i12--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C27953a clone() {
        return new C27953a((int[]) this.f130309p.clone(), this.f130310q);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C27953a)) {
            return false;
        }
        C27953a c27953a = (C27953a) obj;
        if (this.f130310q != c27953a.f130310q || !Arrays.equals(this.f130309p, c27953a.f130309p)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m140885f(int i11) {
        if (((1 << (i11 & 31)) & this.f130309p[i11 / 32]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public int m140886g() {
        return this.f130310q;
    }

    public int hashCode() {
        return (this.f130310q * 31) + Arrays.hashCode(this.f130309p);
    }

    public String toString() {
        char c11;
        int i11 = this.f130310q;
        StringBuilder sb2 = new StringBuilder(i11 + (i11 / 8) + 1);
        for (int i12 = 0; i12 < this.f130310q; i12++) {
            if ((i12 & 7) == 0) {
                sb2.append(' ');
            }
            if (m140885f(i12)) {
                c11 = 'X';
            } else {
                c11 = '.';
            }
            sb2.append(c11);
        }
        return sb2.toString();
    }

    C27953a(int[] iArr, int i11) {
        this.f130309p = iArr;
        this.f130310q = i11;
    }
}
