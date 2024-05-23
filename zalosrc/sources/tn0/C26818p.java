package tn0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;

/* renamed from: tn0.p */
/* loaded from: classes7.dex */
public final class C26818p extends AbstractC26784d1 {

    /* renamed from: a */
    private double[] f127048a;

    /* renamed from: b */
    private int f127049b;

    public C26818p(double[] dArr) {
        AbstractC19074t.m100208f(dArr, "bufferWithData");
        this.f127048a = dArr;
        this.f127049b = dArr.length;
        mo137810b(10);
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: b */
    public void mo137810b(int i11) {
        int m116580c;
        double[] dArr = this.f127048a;
        if (dArr.length < i11) {
            m116580c = AbstractC22543l.m116580c(i11, dArr.length * 2);
            double[] copyOf = Arrays.copyOf(dArr, m116580c);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            this.f127048a = copyOf;
        }
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: d */
    public int mo137811d() {
        return this.f127049b;
    }

    /* renamed from: e */
    public final void m137909e(double d11) {
        AbstractC26784d1.m137816c(this, 0, 1, null);
        double[] dArr = this.f127048a;
        int mo137811d = mo137811d();
        this.f127049b = mo137811d + 1;
        dArr[mo137811d] = d11;
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] mo137809a() {
        double[] copyOf = Arrays.copyOf(this.f127048a, mo137811d());
        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
