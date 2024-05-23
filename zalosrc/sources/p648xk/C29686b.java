package p648xk;

import java.io.ByteArrayInputStream;

/* renamed from: xk.b */
/* loaded from: classes3.dex */
public class C29686b implements InterfaceC29690f {

    /* renamed from: a */
    private ByteArrayInputStream f137135a;

    /* renamed from: d */
    private int f137138d;

    /* renamed from: c */
    private int f137137c = 0;

    /* renamed from: b */
    private int f137136b = 0;

    public C29686b(byte[] bArr) {
        this.f137135a = new ByteArrayInputStream(bArr);
        this.f137138d = bArr.length;
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: a */
    public void mo147641a(int i11) {
        ByteArrayInputStream byteArrayInputStream;
        if (i11 != 0 && (byteArrayInputStream = this.f137135a) != null) {
            try {
                byteArrayInputStream.skip(i11);
                this.f137136b += i11;
            } catch (Exception e11) {
                throw new RuntimeException("skip error", e11);
            }
        }
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: b */
    public boolean mo147642b() {
        return this.f137135a.markSupported();
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: c */
    public boolean mo147643c() {
        if (m147651k() == 1) {
            return true;
        }
        return false;
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: d */
    public int mo147644d() {
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            try {
                i11 |= this.f137135a.read() << (i12 * 8);
                this.f137136b++;
            } catch (Exception e11) {
                throw new RuntimeException("read byte error", e11);
            }
        }
        return i11;
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: e */
    public void mo147645e(int i11) {
        this.f137135a.mark(i11);
        this.f137137c = this.f137136b;
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: f */
    public String mo147646f() {
        try {
            int mo147644d = mo147644d();
            if (mo147644d < 0) {
                return null;
            }
            if (mo147644d == 0) {
                return "";
            }
            if (mo147644d <= this.f137138d) {
                byte[] bArr = new byte[mo147644d];
                if (this.f137135a.read(bArr) == mo147644d) {
                    this.f137136b += mo147644d;
                    return new String(bArr, "UTF-8");
                }
                throw new RuntimeException("read byte error");
            }
            throw new RuntimeException("read byte length error");
        } catch (Exception e11) {
            throw new RuntimeException("read string error", e11);
        }
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: g */
    public long mo147647g() {
        long j11 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            try {
                j11 |= this.f137135a.read() << (i11 * 8);
                this.f137136b++;
            } catch (Exception e11) {
                throw new RuntimeException("read byte error", e11);
            }
        }
        return j11;
    }

    @Override // p648xk.InterfaceC29690f
    public int getPosition() {
        return this.f137136b;
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: h */
    public int mo147648h() {
        int i11 = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            try {
                i11 |= this.f137135a.read() << (i12 * 8);
                this.f137136b++;
            } catch (Exception e11) {
                throw new RuntimeException("readInt16: read byte error", e11);
            }
        }
        return i11;
    }

    /* renamed from: i */
    public int m147649i() {
        return this.f137135a.available();
    }

    /* renamed from: j */
    public void m147650j() {
        try {
            ByteArrayInputStream byteArrayInputStream = this.f137135a;
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
                this.f137135a = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public int m147651k() {
        try {
            int read = this.f137135a.read();
            this.f137136b++;
            return read;
        } catch (Exception e11) {
            throw new RuntimeException("read byte error", e11);
        }
    }

    @Override // p648xk.InterfaceC29690f
    public double readDouble() {
        return Double.longBitsToDouble(mo147647g());
    }

    @Override // p648xk.InterfaceC29690f
    public synchronized void reset() {
        this.f137135a.reset();
        this.f137136b = this.f137137c;
    }
}
