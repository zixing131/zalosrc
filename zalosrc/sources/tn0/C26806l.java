package tn0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;

/* renamed from: tn0.l */
/* loaded from: classes7.dex */
public final class C26806l extends AbstractC26784d1 {

    /* renamed from: a */
    private char[] f127016a;

    /* renamed from: b */
    private int f127017b;

    public C26806l(char[] cArr) {
        AbstractC19074t.m100208f(cArr, "bufferWithData");
        this.f127016a = cArr;
        this.f127017b = cArr.length;
        mo137810b(10);
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: b */
    public void mo137810b(int i11) {
        int m116580c;
        char[] cArr = this.f127016a;
        if (cArr.length < i11) {
            m116580c = AbstractC22543l.m116580c(i11, cArr.length * 2);
            char[] copyOf = Arrays.copyOf(cArr, m116580c);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            this.f127016a = copyOf;
        }
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: d */
    public int mo137811d() {
        return this.f127017b;
    }

    /* renamed from: e */
    public final void m137871e(char c11) {
        AbstractC26784d1.m137816c(this, 0, 1, null);
        char[] cArr = this.f127016a;
        int mo137811d = mo137811d();
        this.f127017b = mo137811d + 1;
        cArr[mo137811d] = c11;
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] mo137809a() {
        char[] copyOf = Arrays.copyOf(this.f127016a, mo137811d());
        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
