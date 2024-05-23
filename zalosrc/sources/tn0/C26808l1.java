package tn0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;

/* renamed from: tn0.l1 */
/* loaded from: classes7.dex */
public final class C26808l1 extends AbstractC26784d1 {

    /* renamed from: a */
    private short[] f127020a;

    /* renamed from: b */
    private int f127021b;

    public C26808l1(short[] sArr) {
        AbstractC19074t.m100208f(sArr, "bufferWithData");
        this.f127020a = sArr;
        this.f127021b = sArr.length;
        mo137810b(10);
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: b */
    public void mo137810b(int i11) {
        int m116580c;
        short[] sArr = this.f127020a;
        if (sArr.length < i11) {
            m116580c = AbstractC22543l.m116580c(i11, sArr.length * 2);
            short[] copyOf = Arrays.copyOf(sArr, m116580c);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            this.f127020a = copyOf;
        }
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: d */
    public int mo137811d() {
        return this.f127021b;
    }

    /* renamed from: e */
    public final void m137875e(short s7) {
        AbstractC26784d1.m137816c(this, 0, 1, null);
        short[] sArr = this.f127020a;
        int mo137811d = mo137811d();
        this.f127021b = mo137811d + 1;
        sArr[mo137811d] = s7;
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] mo137809a() {
        short[] copyOf = Arrays.copyOf(this.f127020a, mo137811d());
        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
