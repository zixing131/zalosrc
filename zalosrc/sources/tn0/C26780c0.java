package tn0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;

/* renamed from: tn0.c0 */
/* loaded from: classes7.dex */
public final class C26780c0 extends AbstractC26784d1 {

    /* renamed from: a */
    private int[] f126986a;

    /* renamed from: b */
    private int f126987b;

    public C26780c0(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "bufferWithData");
        this.f126986a = iArr;
        this.f126987b = iArr.length;
        mo137810b(10);
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: b */
    public void mo137810b(int i11) {
        int m116580c;
        int[] iArr = this.f126986a;
        if (iArr.length < i11) {
            m116580c = AbstractC22543l.m116580c(i11, iArr.length * 2);
            int[] copyOf = Arrays.copyOf(iArr, m116580c);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            this.f126986a = copyOf;
        }
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: d */
    public int mo137811d() {
        return this.f126987b;
    }

    /* renamed from: e */
    public final void m137812e(int i11) {
        AbstractC26784d1.m137816c(this, 0, 1, null);
        int[] iArr = this.f126986a;
        int mo137811d = mo137811d();
        this.f126987b = mo137811d + 1;
        iArr[mo137811d] = i11;
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] mo137809a() {
        int[] copyOf = Arrays.copyOf(this.f126986a, mo137811d());
        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
