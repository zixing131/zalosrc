package bb;

import java.lang.reflect.Array;

/* renamed from: bb.a */
/* loaded from: classes3.dex */
public final class C2685a {

    /* renamed from: a */
    private final C2686b[] f10716a;

    /* renamed from: b */
    private int f10717b;

    /* renamed from: c */
    private final int f10718c;

    /* renamed from: d */
    private final int f10719d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2685a(int i11, int i12) {
        C2686b[] c2686bArr = new C2686b[i11];
        this.f10716a = c2686bArr;
        int length = c2686bArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            this.f10716a[i13] = new C2686b(((i12 + 4) * 17) + 1);
        }
        this.f10719d = i12 * 17;
        this.f10718c = i11;
        this.f10717b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C2686b m13125a() {
        return this.f10716a[this.f10717b];
    }

    /* renamed from: b */
    public byte[][] m13126b(int i11, int i12) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f10718c * i12, this.f10719d * i11);
        int i13 = this.f10718c * i12;
        for (int i14 = 0; i14 < i13; i14++) {
            bArr[(i13 - i14) - 1] = this.f10716a[i14 / i12].m13130b(i11);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m13127c() {
        this.f10717b++;
    }
}
