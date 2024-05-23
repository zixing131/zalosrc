package p648xk;

import java.nio.ByteBuffer;

/* renamed from: xk.d */
/* loaded from: classes3.dex */
public class C29688d implements InterfaceC29690f {

    /* renamed from: a */
    private ByteBuffer f137141a;

    /* renamed from: b */
    private int f137142b;

    public C29688d(byte[] bArr) {
        this.f137141a = ByteBuffer.wrap(bArr);
        this.f137142b = bArr.length;
    }

    /* renamed from: j */
    private boolean m147663j() {
        if (m147670l((byte) 1) != 5) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private double m147664k() {
        long j11;
        long j12;
        long j13;
        byte m147670l = m147670l((byte) 5);
        if (m147670l != 1) {
            if (m147670l != 2) {
                if (m147670l != 3) {
                    if (m147670l != 5) {
                        j13 = this.f137141a.getLong();
                    } else {
                        j13 = 0;
                    }
                    return Double.longBitsToDouble(j13);
                }
                j11 = this.f137141a.getInt();
                j12 = 4294967295L;
            } else {
                j11 = this.f137141a.getShort();
                j12 = 65535;
            }
        } else {
            j11 = this.f137141a.get();
            j12 = 255;
        }
        j13 = j11 & j12;
        return Double.longBitsToDouble(j13);
    }

    /* renamed from: m */
    private int m147665m() {
        byte m147670l = m147670l((byte) 3);
        if (m147670l != 1) {
            if (m147670l != 2) {
                if (m147670l != 5) {
                    return this.f137141a.getInt();
                }
                return 0;
            }
            return this.f137141a.getShort() & 65535;
        }
        return this.f137141a.get() & 255;
    }

    /* renamed from: n */
    private long m147666n() {
        byte m147670l = m147670l((byte) 4);
        if (m147670l != 1) {
            if (m147670l != 2) {
                if (m147670l != 3) {
                    if (m147670l != 5) {
                        return this.f137141a.getLong();
                    }
                    return 0L;
                }
                return this.f137141a.getInt() & 4294967295L;
            }
            return this.f137141a.getShort() & 65535;
        }
        return this.f137141a.get() & 255;
    }

    /* renamed from: o */
    private short m147667o() {
        byte m147670l = m147670l((byte) 2);
        if (m147670l != 1) {
            if (m147670l != 5) {
                return this.f137141a.getShort();
            }
            return (short) 0;
        }
        return (short) (this.f137141a.get() & 255);
    }

    /* renamed from: p */
    private String m147668p() {
        byte m147670l = m147670l((byte) 7);
        if (m147670l != 5) {
            if (m147670l != 6) {
                int m147665m = m147665m();
                if (m147665m <= this.f137142b) {
                    byte[] bArr = new byte[m147665m];
                    this.f137141a.get(bArr, 0, m147665m);
                    return new String(bArr, "UTF-8");
                }
                throw new RuntimeException("read byte length error");
            }
            return null;
        }
        return "";
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: a */
    public void mo147641a(int i11) {
        ByteBuffer byteBuffer;
        if (i11 != 0 && (byteBuffer = this.f137141a) != null) {
            try {
                byteBuffer.position(byteBuffer.position() + i11);
            } catch (Exception e11) {
                throw new RuntimeException("skip error", e11);
            }
        }
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: b */
    public boolean mo147642b() {
        return false;
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: c */
    public boolean mo147643c() {
        return m147663j();
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: d */
    public int mo147644d() {
        try {
            return m147665m();
        } catch (Exception e11) {
            throw new RuntimeException("read byte error", e11);
        }
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: e */
    public void mo147645e(int i11) {
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: f */
    public String mo147646f() {
        try {
            return m147668p();
        } catch (Exception e11) {
            throw new RuntimeException("read string error", e11);
        }
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: g */
    public long mo147647g() {
        try {
            return m147666n();
        } catch (Exception e11) {
            throw new RuntimeException("read byte error", e11);
        }
    }

    @Override // p648xk.InterfaceC29690f
    public int getPosition() {
        return this.f137141a.position();
    }

    @Override // p648xk.InterfaceC29690f
    /* renamed from: h */
    public int mo147648h() {
        try {
            return m147667o();
        } catch (Exception e11) {
            throw new RuntimeException("readInt16: read byte error", e11);
        }
    }

    /* renamed from: i */
    public void m147669i() {
        try {
            ByteBuffer byteBuffer = this.f137141a;
            if (byteBuffer != null) {
                byteBuffer.clear();
                this.f137141a = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public byte m147670l(byte b11) {
        byte b12 = this.f137141a.get();
        if (AbstractC29693i.m147688b(b12) == b11) {
            return AbstractC29693i.m147687a(b12);
        }
        throw new RuntimeException("Expected type: " + AbstractC29693i.m147689c(b11) + ", but serialization type: " + AbstractC29693i.m147689c(b12));
    }

    @Override // p648xk.InterfaceC29690f
    public double readDouble() {
        return m147664k();
    }

    @Override // p648xk.InterfaceC29690f
    public void reset() {
    }
}
