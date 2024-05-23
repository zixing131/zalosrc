package tn0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;
import pm0.C24836a0;

/* renamed from: tn0.u1 */
/* loaded from: classes7.dex */
public final class C26835u1 extends AbstractC26784d1 {

    /* renamed from: a */
    private int[] f127090a;

    /* renamed from: b */
    private int f127091b;

    public /* synthetic */ C26835u1(int[] iArr, AbstractC19060k abstractC19060k) {
        this(iArr);
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo137809a() {
        return C24836a0.m129130d(m137976f());
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: b */
    public void mo137810b(int i11) {
        int m116580c;
        if (C24836a0.m129137r(this.f127090a) < i11) {
            int[] iArr = this.f127090a;
            m116580c = AbstractC22543l.m116580c(i11, C24836a0.m129137r(iArr) * 2);
            int[] copyOf = Arrays.copyOf(iArr, m116580c);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            this.f127090a = C24836a0.m129132g(copyOf);
        }
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: d */
    public int mo137811d() {
        return this.f127091b;
    }

    /* renamed from: e */
    public final void m137975e(int i11) {
        AbstractC26784d1.m137816c(this, 0, 1, null);
        int[] iArr = this.f127090a;
        int mo137811d = mo137811d();
        this.f127091b = mo137811d + 1;
        C24836a0.m129141w(iArr, mo137811d, i11);
    }

    /* renamed from: f */
    public int[] m137976f() {
        int[] copyOf = Arrays.copyOf(this.f127090a, mo137811d());
        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
        return C24836a0.m129132g(copyOf);
    }

    private C26835u1(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "bufferWithData");
        this.f127090a = iArr;
        this.f127091b = C24836a0.m129137r(iArr);
        mo137810b(10);
    }
}
