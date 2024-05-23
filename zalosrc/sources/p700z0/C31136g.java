package p700z0;

/* renamed from: z0.g */
/* loaded from: classes2.dex */
class C31136g implements InterfaceC31135f {

    /* renamed from: a */
    private final Object[] f143454a;

    /* renamed from: b */
    private int f143455b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31136g(int i11) {
        if (i11 > 0) {
            this.f143454a = new Object[i11];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p700z0.InterfaceC31135f
    /* renamed from: a */
    public boolean mo151283a(Object obj) {
        int i11 = this.f143455b;
        Object[] objArr = this.f143454a;
        if (i11 < objArr.length) {
            objArr[i11] = obj;
            this.f143455b = i11 + 1;
            return true;
        }
        return false;
    }

    @Override // p700z0.InterfaceC31135f
    /* renamed from: b */
    public Object mo151284b() {
        int i11 = this.f143455b;
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        Object[] objArr = this.f143454a;
        Object obj = objArr[i12];
        objArr[i12] = null;
        this.f143455b = i11 - 1;
        return obj;
    }

    @Override // p700z0.InterfaceC31135f
    /* renamed from: c */
    public void mo151285c(Object[] objArr, int i11) {
        if (i11 > objArr.length) {
            i11 = objArr.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            int i13 = this.f143455b;
            Object[] objArr2 = this.f143454a;
            if (i13 < objArr2.length) {
                objArr2[i13] = obj;
                this.f143455b = i13 + 1;
            }
        }
    }
}
