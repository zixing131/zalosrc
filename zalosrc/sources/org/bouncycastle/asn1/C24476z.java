package org.bouncycastle.asn1;

import java.io.InputStream;
import zn0.InterfaceC32517d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.bouncycastle.asn1.z */
/* loaded from: classes7.dex */
public class C24476z extends InputStream {

    /* renamed from: p */
    private final C24450m f118014p;

    /* renamed from: q */
    private boolean f118015q = true;

    /* renamed from: r */
    private InputStream f118016r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24476z(C24450m c24450m) {
        this.f118014p = c24450m;
    }

    @Override // java.io.InputStream
    public int read() {
        InterfaceC32517d interfaceC32517d;
        if (this.f118016r == null) {
            if (!this.f118015q || (interfaceC32517d = (InterfaceC32517d) this.f118014p.m127795b()) == null) {
                return -1;
            }
            this.f118015q = false;
            this.f118016r = interfaceC32517d.mo127767a();
        }
        while (true) {
            int read = this.f118016r.read();
            if (read >= 0) {
                return read;
            }
            InterfaceC32517d interfaceC32517d2 = (InterfaceC32517d) this.f118014p.m127795b();
            if (interfaceC32517d2 == null) {
                this.f118016r = null;
                return -1;
            }
            this.f118016r = interfaceC32517d2.mo127767a();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        InterfaceC32517d interfaceC32517d;
        int i13 = 0;
        if (this.f118016r == null) {
            if (!this.f118015q || (interfaceC32517d = (InterfaceC32517d) this.f118014p.m127795b()) == null) {
                return -1;
            }
            this.f118015q = false;
            this.f118016r = interfaceC32517d.mo127767a();
        }
        while (true) {
            int read = this.f118016r.read(bArr, i11 + i13, i12 - i13);
            if (read >= 0) {
                i13 += read;
                if (i13 == i12) {
                    return i13;
                }
            } else {
                InterfaceC32517d interfaceC32517d2 = (InterfaceC32517d) this.f118014p.m127795b();
                if (interfaceC32517d2 == null) {
                    this.f118016r = null;
                    if (i13 < 1) {
                        return -1;
                    }
                    return i13;
                }
                this.f118016r = interfaceC32517d2.mo127767a();
            }
        }
    }
}
