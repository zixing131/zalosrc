package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class rv3 implements xv3 {

    /* renamed from: a */
    private final xv3[] f27390a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rv3(xv3... xv3VarArr) {
        this.f27390a = xv3VarArr;
    }

    @Override // com.google.android.gms.internal.ads.xv3
    /* renamed from: a */
    public final wv3 mo25332a(Class cls) {
        xv3[] xv3VarArr = this.f27390a;
        for (int i11 = 0; i11 < 2; i11++) {
            xv3 xv3Var = xv3VarArr[i11];
            if (xv3Var.mo25333b(cls)) {
                return xv3Var.mo25332a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.xv3
    /* renamed from: b */
    public final boolean mo25333b(Class cls) {
        xv3[] xv3VarArr = this.f27390a;
        for (int i11 = 0; i11 < 2; i11++) {
            if (xv3VarArr[i11].mo25333b(cls)) {
                return true;
            }
        }
        return false;
    }
}
