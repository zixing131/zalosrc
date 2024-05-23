package p402os;

import java.io.Serializable;

/* renamed from: os.c */
/* loaded from: classes4.dex */
public class C24548c implements Serializable {

    /* renamed from: s */
    public static final byte[] f118172s;

    /* renamed from: p */
    private byte f118173p = 0;

    /* renamed from: q */
    private long f118174q;

    /* renamed from: r */
    private int f118175r;

    static {
        f118172s = r0;
        byte[] bArr = {0, 2, 2, 2, 2, 1, 1, 1, 1, 3, 3};
    }

    /* renamed from: a */
    public void m127900a(C24548c c24548c) {
        if (c24548c == null) {
            return;
        }
        m127906g(c24548c.m127902c());
        m127905f(c24548c.m127901b());
        m127907h(c24548c.m127904e());
    }

    /* renamed from: b */
    public long m127901b() {
        return this.f118174q;
    }

    /* renamed from: c */
    public byte m127902c() {
        return this.f118173p;
    }

    /* renamed from: d */
    public byte m127903d() {
        if (m127902c() >= 0) {
            byte m127902c = m127902c();
            byte[] bArr = f118172s;
            if (m127902c < bArr.length) {
                return bArr[m127902c()];
            }
            return (byte) 0;
        }
        return (byte) 0;
    }

    /* renamed from: e */
    public int m127904e() {
        return this.f118175r;
    }

    /* renamed from: f */
    public void m127905f(long j11) {
        this.f118174q = j11;
    }

    /* renamed from: g */
    public void m127906g(byte b11) {
        this.f118173p = b11;
    }

    /* renamed from: h */
    public void m127907h(int i11) {
        this.f118175r = i11;
    }

    public String toString() {
        return "\ntype:" + ((int) m127902c()) + "\nid:" + m127901b() + "\nuid:" + m127904e();
    }
}
