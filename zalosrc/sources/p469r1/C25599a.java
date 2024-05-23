package p469r1;

import java.nio.ByteBuffer;

/* renamed from: r1.a */
/* loaded from: classes2.dex */
public final class C25599a extends AbstractC25601c {
    /* renamed from: f */
    public C25599a m132233f(int i11, ByteBuffer byteBuffer) {
        m132234g(i11, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m132234g(int i11, ByteBuffer byteBuffer) {
        m132250c(i11, byteBuffer);
    }

    /* renamed from: h */
    public int m132235h(int i11) {
        int m132249b = m132249b(16);
        if (m132249b != 0) {
            return this.f122401b.getInt(m132251d(m132249b) + (i11 * 4));
        }
        return 0;
    }

    /* renamed from: i */
    public int m132236i() {
        int m132249b = m132249b(16);
        if (m132249b != 0) {
            return m132252e(m132249b);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean m132237j() {
        int m132249b = m132249b(6);
        if (m132249b == 0 || this.f122401b.get(m132249b + this.f122400a) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public short m132238k() {
        int m132249b = m132249b(14);
        if (m132249b != 0) {
            return this.f122401b.getShort(m132249b + this.f122400a);
        }
        return (short) 0;
    }

    /* renamed from: l */
    public int m132239l() {
        int m132249b = m132249b(4);
        if (m132249b != 0) {
            return this.f122401b.getInt(m132249b + this.f122400a);
        }
        return 0;
    }

    /* renamed from: m */
    public short m132240m() {
        int m132249b = m132249b(8);
        if (m132249b != 0) {
            return this.f122401b.getShort(m132249b + this.f122400a);
        }
        return (short) 0;
    }

    /* renamed from: n */
    public short m132241n() {
        int m132249b = m132249b(12);
        if (m132249b != 0) {
            return this.f122401b.getShort(m132249b + this.f122400a);
        }
        return (short) 0;
    }
}
