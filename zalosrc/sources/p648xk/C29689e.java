package p648xk;

import java.nio.ByteBuffer;

/* renamed from: xk.e */
/* loaded from: classes3.dex */
public class C29689e implements InterfaceC29691g {

    /* renamed from: c */
    private int f137145c = 524288;

    /* renamed from: d */
    private int f137146d = 1024;

    /* renamed from: a */
    private ByteBuffer f137143a = ByteBuffer.allocate(1024);

    /* renamed from: b */
    private int f137144b = this.f137146d;

    /* renamed from: i */
    private void m147671i(int i11) {
        if (this.f137143a.remaining() < i11 && this.f137143a.capacity() < this.f137145c) {
            this.f137144b *= 2;
            while (this.f137144b - this.f137143a.position() < i11) {
                this.f137144b *= 2;
            }
            int i12 = this.f137144b;
            int i13 = this.f137145c;
            if (i12 > i13) {
                this.f137144b = i13;
            }
            this.f137143a = ByteBuffer.allocate(this.f137144b).put(this.f137143a.array(), 0, this.f137143a.position());
        }
    }

    /* renamed from: k */
    private void m147672k(byte b11, boolean z11) {
        if (z11) {
            m147675n(AbstractC29693i.m147690d(b11, (byte) 0));
        } else {
            m147675n(AbstractC29693i.m147690d(b11, (byte) 5));
        }
    }

    /* renamed from: l */
    private void m147673l(byte b11, byte b12) {
        if (b12 == 0) {
            m147675n(AbstractC29693i.m147690d(b11, (byte) 5));
            return;
        }
        m147675n(AbstractC29693i.m147690d(b11, (byte) 1));
        m147671i(1);
        this.f137143a.put(b12);
    }

    /* renamed from: m */
    private void m147674m(byte b11, byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            m147675n(AbstractC29693i.m147690d(b11, (byte) 5));
            return;
        }
        m147675n(AbstractC29693i.m147690d(b11, (byte) 3));
        m147676o((byte) 3, i12);
        m147671i(i12);
        this.f137143a.put(bArr, i11, i12);
    }

    /* renamed from: n */
    private void m147675n(byte b11) {
        m147671i(1);
        this.f137143a.put(b11);
    }

    /* renamed from: o */
    private void m147676o(byte b11, int i11) {
        if (i11 == 0) {
            m147675n(AbstractC29693i.m147690d(b11, (byte) 5));
        } else {
            if (((-65536) & i11) == 0) {
                m147678q(b11, i11);
                return;
            }
            m147675n(AbstractC29693i.m147690d(b11, (byte) 3));
            m147671i(4);
            this.f137143a.putInt(i11);
        }
    }

    /* renamed from: p */
    private void m147677p(byte b11, long j11) {
        if (j11 == 0) {
            m147675n(AbstractC29693i.m147690d(b11, (byte) 5));
        } else {
            if (((-4294967296L) & j11) == 0) {
                m147676o(b11, (int) j11);
                return;
            }
            m147675n(AbstractC29693i.m147690d(b11, (byte) 4));
            m147671i(8);
            this.f137143a.putLong(j11);
        }
    }

    /* renamed from: q */
    private void m147678q(byte b11, int i11) {
        m147679r(b11, (short) i11);
    }

    /* renamed from: r */
    private void m147679r(byte b11, short s7) {
        if (s7 == 0) {
            m147675n(AbstractC29693i.m147690d(b11, (byte) 5));
        } else {
            if ((65280 & s7) == 0) {
                m147673l(b11, (byte) s7);
                return;
            }
            m147675n(AbstractC29693i.m147690d(b11, (byte) 2));
            m147671i(2);
            this.f137143a.putShort(s7);
        }
    }

    /* renamed from: s */
    private void m147680s(byte b11, String str) {
        if (str == null) {
            m147675n(AbstractC29693i.m147690d(b11, (byte) 6));
        } else if (str.isEmpty()) {
            m147675n(AbstractC29693i.m147690d(b11, (byte) 5));
        } else {
            byte[] bytes = str.getBytes("UTF-8");
            m147674m(b11, bytes, 0, bytes.length);
        }
    }

    @Override // p648xk.InterfaceC29691g
    /* renamed from: a */
    public void mo147652a(int i11) {
        try {
            m147676o((byte) 3, i11);
        } catch (Exception e11) {
            throw new RuntimeException("write byte error", e11);
        }
    }

    @Override // p648xk.InterfaceC29691g
    /* renamed from: b */
    public void mo147653b(byte[] bArr) {
        try {
            m147674m((byte) 6, bArr, 0, bArr.length);
        } catch (Exception e11) {
            throw new RuntimeException("write byte error", e11);
        }
    }

    @Override // p648xk.InterfaceC29691g
    /* renamed from: c */
    public void mo147654c(double d11) {
        try {
            m147677p((byte) 5, Double.doubleToRawLongBits(d11));
        } catch (Exception e11) {
            throw new RuntimeException("write byte error", e11);
        }
    }

    @Override // p648xk.InterfaceC29691g
    /* renamed from: d */
    public void mo147655d(String str) {
        try {
            m147680s((byte) 7, str);
        } catch (Exception e11) {
            throw new RuntimeException("write byte error", e11);
        }
    }

    @Override // p648xk.InterfaceC29691g
    /* renamed from: e */
    public void mo147656e(int i11) {
        try {
            m147678q((byte) 2, i11);
        } catch (Exception e11) {
            throw new RuntimeException("writeInt16: write byte error", e11);
        }
    }

    @Override // p648xk.InterfaceC29691g
    /* renamed from: f */
    public void mo147657f(long j11) {
        try {
            m147677p((byte) 4, j11);
        } catch (Exception e11) {
            throw new RuntimeException("write byte error", e11);
        }
    }

    @Override // p648xk.InterfaceC29691g
    /* renamed from: g */
    public void mo147658g(boolean z11) {
        try {
            m147672k((byte) 1, z11);
        } catch (Exception e11) {
            throw new RuntimeException("write byte error", e11);
        }
    }

    /* renamed from: h */
    public void m147681h() {
        try {
            ByteBuffer byteBuffer = this.f137143a;
            if (byteBuffer != null) {
                byteBuffer.clear();
                this.f137143a = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public byte[] m147682j() {
        ByteBuffer byteBuffer = this.f137143a;
        if (byteBuffer == null) {
            return null;
        }
        return ByteBuffer.allocate(byteBuffer.position()).put(this.f137143a.array(), 0, this.f137143a.position()).array();
    }
}
