package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.p */
/* loaded from: classes2.dex */
abstract class AbstractBinderC4251p extends AbstractBinderC4249n {

    /* renamed from: r */
    private static final WeakReference f16720r = new WeakReference(null);

    /* renamed from: q */
    private WeakReference f16721q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBinderC4251p(byte[] bArr) {
        super(bArr);
        this.f16721q = f16720r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.AbstractBinderC4249n
    /* renamed from: I3 */
    public final byte[] mo19844I3() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f16721q.get();
                if (bArr == null) {
                    bArr = mo19827W4();
                    this.f16721q = new WeakReference(bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    /* renamed from: W4 */
    protected abstract byte[] mo19827W4();
}
