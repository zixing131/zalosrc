package p469r1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: r1.b */
/* loaded from: classes2.dex */
public final class C25600b extends AbstractC25601c {
    /* renamed from: h */
    public static C25600b m132242h(ByteBuffer byteBuffer) {
        return m132243i(byteBuffer, new C25600b());
    }

    /* renamed from: i */
    public static C25600b m132243i(ByteBuffer byteBuffer, C25600b c25600b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c25600b.m132244f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: f */
    public C25600b m132244f(int i11, ByteBuffer byteBuffer) {
        m132245g(i11, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m132245g(int i11, ByteBuffer byteBuffer) {
        m132250c(i11, byteBuffer);
    }

    /* renamed from: j */
    public C25599a m132246j(C25599a c25599a, int i11) {
        int m132249b = m132249b(6);
        if (m132249b != 0) {
            return c25599a.m132233f(m132248a(m132251d(m132249b) + (i11 * 4)), this.f122401b);
        }
        return null;
    }

    /* renamed from: k */
    public int m132247k() {
        int m132249b = m132249b(6);
        if (m132249b != 0) {
            return m132252e(m132249b);
        }
        return 0;
    }
}
