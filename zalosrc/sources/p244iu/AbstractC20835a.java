package p244iu;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: iu.a */
/* loaded from: classes4.dex */
public abstract class AbstractC20835a implements InterfaceC20836b {

    /* renamed from: a */
    protected BufferedOutputStream f102417a;

    /* renamed from: b */
    protected int f102418b;

    /* renamed from: c */
    protected int f102419c;

    @Override // p244iu.InterfaceC20836b
    /* renamed from: b */
    public void mo108929b(OutputStream outputStream) {
        this.f102417a = new BufferedOutputStream(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m108930c() {
        try {
            this.f102417a.close();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m108931d(byte[] bArr) {
        try {
            this.f102417a.write(bArr, 0, ((bArr[2] & 255) << 8) + (bArr[3] & 255) + 2);
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m108932e(byte[] bArr) {
        try {
            this.f102417a.write(bArr, 0, 2);
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }
}
