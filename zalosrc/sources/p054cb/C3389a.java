package p054cb;

import java.lang.reflect.Array;

/* renamed from: cb.a */
/* loaded from: classes3.dex */
public final class C3389a {

    /* renamed from: a */
    private final byte[][] f14326a;

    /* renamed from: b */
    private final int f14327b;

    /* renamed from: c */
    private final int f14328c;

    public C3389a(int i11, int i12) {
        this.f14326a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i12, i11);
        this.f14327b = i11;
        this.f14328c = i12;
    }

    /* renamed from: a */
    public byte m17060a(int i11, int i12) {
        return this.f14326a[i12][i11];
    }

    /* renamed from: b */
    public int m17061b() {
        return this.f14328c;
    }

    /* renamed from: c */
    public int m17062c() {
        return this.f14327b;
    }

    /* renamed from: d */
    public void m17063d(int i11, int i12, boolean z11) {
        this.f14326a[i12][i11] = z11 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f14327b * 2 * this.f14328c) + 2);
        for (int i11 = 0; i11 < this.f14328c; i11++) {
            byte[] bArr = this.f14326a[i11];
            for (int i12 = 0; i12 < this.f14327b; i12++) {
                byte b11 = bArr[i12];
                if (b11 != 0) {
                    if (b11 != 1) {
                        sb2.append("  ");
                    } else {
                        sb2.append(" 1");
                    }
                } else {
                    sb2.append(" 0");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
