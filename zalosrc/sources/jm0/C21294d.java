package jm0;

import java.io.OutputStream;

/* renamed from: jm0.d */
/* loaded from: classes7.dex */
public class C21294d extends AbstractC21293c {

    /* renamed from: f */
    private byte[] f103732f;

    public C21294d(String str, String str2, String str3, byte[] bArr) {
        super(str, str2, str3);
        this.f103732f = bArr;
    }

    @Override // jm0.AbstractC21293c
    /* renamed from: c */
    public long mo110259c() {
        int i11;
        long m110260d = m110260d();
        byte[] bArr = this.f103732f;
        if (bArr != null) {
            i11 = bArr.length;
        } else {
            i11 = 0;
        }
        return m110260d + i11;
    }

    @Override // jm0.AbstractC21293c
    /* renamed from: f */
    protected void mo110262f(OutputStream outputStream) {
        byte[] bArr = this.f103732f;
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public C21294d(String str, String str2, String str3, boolean z11, byte[] bArr) {
        super(str, str2, str3, z11);
        this.f103732f = bArr;
    }
}
