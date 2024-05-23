package tn0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;

/* renamed from: tn0.v */
/* loaded from: classes7.dex */
public final class C26836v extends AbstractC26784d1 {

    /* renamed from: a */
    private float[] f127092a;

    /* renamed from: b */
    private int f127093b;

    public C26836v(float[] fArr) {
        AbstractC19074t.m100208f(fArr, "bufferWithData");
        this.f127092a = fArr;
        this.f127093b = fArr.length;
        mo137810b(10);
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: b */
    public void mo137810b(int i11) {
        int m116580c;
        float[] fArr = this.f127092a;
        if (fArr.length < i11) {
            m116580c = AbstractC22543l.m116580c(i11, fArr.length * 2);
            float[] copyOf = Arrays.copyOf(fArr, m116580c);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            this.f127092a = copyOf;
        }
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: d */
    public int mo137811d() {
        return this.f127093b;
    }

    /* renamed from: e */
    public final void m137977e(float f11) {
        AbstractC26784d1.m137816c(this, 0, 1, null);
        float[] fArr = this.f127092a;
        int mo137811d = mo137811d();
        this.f127093b = mo137811d + 1;
        fArr[mo137811d] = f11;
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] mo137809a() {
        float[] copyOf = Arrays.copyOf(this.f127092a, mo137811d());
        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
