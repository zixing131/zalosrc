package tn0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;
import pm0.C24846f0;

/* renamed from: tn0.y1 */
/* loaded from: classes7.dex */
public final class C26847y1 extends AbstractC26784d1 {

    /* renamed from: a */
    private short[] f127113a;

    /* renamed from: b */
    private int f127114b;

    public /* synthetic */ C26847y1(short[] sArr, AbstractC19060k abstractC19060k) {
        this(sArr);
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo137809a() {
        return C24846f0.m129184d(m138006f());
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: b */
    public void mo137810b(int i11) {
        int m116580c;
        if (C24846f0.m129191r(this.f127113a) < i11) {
            short[] sArr = this.f127113a;
            m116580c = AbstractC22543l.m116580c(i11, C24846f0.m129191r(sArr) * 2);
            short[] copyOf = Arrays.copyOf(sArr, m116580c);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            this.f127113a = C24846f0.m129186g(copyOf);
        }
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: d */
    public int mo137811d() {
        return this.f127114b;
    }

    /* renamed from: e */
    public final void m138005e(short s7) {
        AbstractC26784d1.m137816c(this, 0, 1, null);
        short[] sArr = this.f127113a;
        int mo137811d = mo137811d();
        this.f127114b = mo137811d + 1;
        C24846f0.m129195w(sArr, mo137811d, s7);
    }

    /* renamed from: f */
    public short[] m138006f() {
        short[] copyOf = Arrays.copyOf(this.f127113a, mo137811d());
        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
        return C24846f0.m129186g(copyOf);
    }

    private C26847y1(short[] sArr) {
        AbstractC19074t.m100208f(sArr, "bufferWithData");
        this.f127113a = sArr;
        this.f127114b = C24846f0.m129191r(sArr);
        mo137810b(10);
    }
}
