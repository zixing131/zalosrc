package bb;

/* renamed from: bb.b */
/* loaded from: classes3.dex */
final class C2686b {

    /* renamed from: a */
    private final byte[] f10720a;

    /* renamed from: b */
    private int f10721b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2686b(int i11) {
        this.f10720a = new byte[i11];
    }

    /* renamed from: c */
    private void m13128c(int i11, boolean z11) {
        this.f10720a[i11] = z11 ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13129a(boolean z11, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f10721b;
            this.f10721b = i13 + 1;
            m13128c(i13, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public byte[] m13130b(int i11) {
        int length = this.f10720a.length * i11;
        byte[] bArr = new byte[length];
        for (int i12 = 0; i12 < length; i12++) {
            bArr[i12] = this.f10720a[i12 / i11];
        }
        return bArr;
    }
}
