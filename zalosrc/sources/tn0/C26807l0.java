package tn0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;

/* renamed from: tn0.l0 */
/* loaded from: classes7.dex */
public final class C26807l0 extends AbstractC26784d1 {

    /* renamed from: a */
    private long[] f127018a;

    /* renamed from: b */
    private int f127019b;

    public C26807l0(long[] jArr) {
        AbstractC19074t.m100208f(jArr, "bufferWithData");
        this.f127018a = jArr;
        this.f127019b = jArr.length;
        mo137810b(10);
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: b */
    public void mo137810b(int i11) {
        int m116580c;
        long[] jArr = this.f127018a;
        if (jArr.length < i11) {
            m116580c = AbstractC22543l.m116580c(i11, jArr.length * 2);
            long[] copyOf = Arrays.copyOf(jArr, m116580c);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            this.f127018a = copyOf;
        }
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: d */
    public int mo137811d() {
        return this.f127019b;
    }

    /* renamed from: e */
    public final void m137873e(long j11) {
        AbstractC26784d1.m137816c(this, 0, 1, null);
        long[] jArr = this.f127018a;
        int mo137811d = mo137811d();
        this.f127019b = mo137811d + 1;
        jArr[mo137811d] = j11;
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] mo137809a() {
        long[] copyOf = Arrays.copyOf(this.f127018a, mo137811d());
        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
