package p648xk;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* renamed from: xk.c */
/* loaded from: classes3.dex */
public class C29687c implements InterfaceC29691g {

    /* renamed from: a */
    private ByteArrayOutputStream f137139a = new ByteArrayOutputStream();

    /* renamed from: b */
    private DataOutputStream f137140b = new DataOutputStream(this.f137139a);

    @Override // p648xk.InterfaceC29691g
    /* renamed from: a */
    public void mo147652a(int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            try {
                this.f137140b.write(i11 >> (i12 * 8));
            } catch (Exception e11) {
                throw new RuntimeException("write byte error", e11);
            }
        }
    }

    @Override // p648xk.InterfaceC29691g
    /* renamed from: b */
    public void mo147653b(byte[] bArr) {
        try {
            this.f137140b.write(bArr);
        } catch (Exception e11) {
            throw new RuntimeException("write byte error", e11);
        }
    }

    @Override // p648xk.InterfaceC29691g
    /* renamed from: c */
    public void mo147654c(double d11) {
        try {
            mo147657f(Double.doubleToRawLongBits(d11));
        } catch (Exception e11) {
            throw new RuntimeException("write byte error", e11);
        }
    }

    @Override // p648xk.InterfaceC29691g
    /* renamed from: d */
    public void mo147655d(String str) {
        try {
            if (str == null) {
                mo147652a(-1);
            } else if (str.isEmpty()) {
                mo147652a(0);
            } else {
                m147661j(str.getBytes("UTF-8"));
            }
        } catch (Exception e11) {
            throw new RuntimeException("write byte error", e11);
        }
    }

    @Override // p648xk.InterfaceC29691g
    /* renamed from: e */
    public void mo147656e(int i11) {
        for (int i12 = 0; i12 < 2; i12++) {
            try {
                this.f137140b.write(i11 >> (i12 * 8));
            } catch (Exception e11) {
                throw new RuntimeException("writeInt16: write byte error", e11);
            }
        }
    }

    @Override // p648xk.InterfaceC29691g
    /* renamed from: f */
    public void mo147657f(long j11) {
        for (int i11 = 0; i11 < 8; i11++) {
            try {
                this.f137140b.write((int) (j11 >> (i11 * 8)));
            } catch (Exception e11) {
                throw new RuntimeException("write byte error", e11);
            }
        }
    }

    @Override // p648xk.InterfaceC29691g
    /* renamed from: g */
    public void mo147658g(boolean z11) {
        try {
            this.f137140b.write(z11 ? 1 : 0);
        } catch (Exception e11) {
            throw new RuntimeException("write byte error", e11);
        }
    }

    /* renamed from: h */
    public void m147659h() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = this.f137139a;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
                this.f137139a = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            DataOutputStream dataOutputStream = this.f137140b;
            if (dataOutputStream != null) {
                dataOutputStream.close();
                this.f137140b = null;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: i */
    public byte[] m147660i() {
        ByteArrayOutputStream byteArrayOutputStream = this.f137139a;
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    /* renamed from: j */
    public void m147661j(byte[] bArr) {
        m147662k(bArr, 0, bArr.length);
    }

    /* renamed from: k */
    public void m147662k(byte[] bArr, int i11, int i12) {
        try {
            mo147652a(i12);
            this.f137140b.write(bArr, i11, i12);
        } catch (Exception e11) {
            throw new RuntimeException("write byte error", e11);
        }
    }
}
