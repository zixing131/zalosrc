package tn0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;

/* renamed from: tn0.g */
/* loaded from: classes7.dex */
public final class C26791g extends AbstractC26784d1 {

    /* renamed from: a */
    private boolean[] f126996a;

    /* renamed from: b */
    private int f126997b;

    public C26791g(boolean[] zArr) {
        AbstractC19074t.m100208f(zArr, "bufferWithData");
        this.f126996a = zArr;
        this.f126997b = zArr.length;
        mo137810b(10);
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: b */
    public void mo137810b(int i11) {
        int m116580c;
        boolean[] zArr = this.f126996a;
        if (zArr.length < i11) {
            m116580c = AbstractC22543l.m116580c(i11, zArr.length * 2);
            boolean[] copyOf = Arrays.copyOf(zArr, m116580c);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            this.f126996a = copyOf;
        }
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: d */
    public int mo137811d() {
        return this.f126997b;
    }

    /* renamed from: e */
    public final void m137835e(boolean z11) {
        AbstractC26784d1.m137816c(this, 0, 1, null);
        boolean[] zArr = this.f126996a;
        int mo137811d = mo137811d();
        this.f126997b = mo137811d + 1;
        zArr[mo137811d] = z11;
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] mo137809a() {
        boolean[] copyOf = Arrays.copyOf(this.f126996a, mo137811d());
        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
