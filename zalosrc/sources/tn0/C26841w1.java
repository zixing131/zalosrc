package tn0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;
import pm0.C24840c0;

/* renamed from: tn0.w1 */
/* loaded from: classes7.dex */
public final class C26841w1 extends AbstractC26784d1 {

    /* renamed from: a */
    private long[] f127106a;

    /* renamed from: b */
    private int f127107b;

    public /* synthetic */ C26841w1(long[] jArr, AbstractC19060k abstractC19060k) {
        this(jArr);
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo137809a() {
        return C24840c0.m129156d(m137987f());
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: b */
    public void mo137810b(int i11) {
        int m116580c;
        if (C24840c0.m129163r(this.f127106a) < i11) {
            long[] jArr = this.f127106a;
            m116580c = AbstractC22543l.m116580c(i11, C24840c0.m129163r(jArr) * 2);
            long[] copyOf = Arrays.copyOf(jArr, m116580c);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            this.f127106a = C24840c0.m129158g(copyOf);
        }
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: d */
    public int mo137811d() {
        return this.f127107b;
    }

    /* renamed from: e */
    public final void m137986e(long j11) {
        AbstractC26784d1.m137816c(this, 0, 1, null);
        long[] jArr = this.f127106a;
        int mo137811d = mo137811d();
        this.f127107b = mo137811d + 1;
        C24840c0.m129167w(jArr, mo137811d, j11);
    }

    /* renamed from: f */
    public long[] m137987f() {
        long[] copyOf = Arrays.copyOf(this.f127106a, mo137811d());
        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
        return C24840c0.m129158g(copyOf);
    }

    private C26841w1(long[] jArr) {
        AbstractC19074t.m100208f(jArr, "bufferWithData");
        this.f127106a = jArr;
        this.f127107b = C24840c0.m129163r(jArr);
        mo137810b(10);
    }
}
