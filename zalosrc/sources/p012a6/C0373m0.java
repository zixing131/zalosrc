package p012a6;

import java.util.Arrays;

/* renamed from: a6.m0 */
/* loaded from: classes2.dex */
public final class C0373m0 extends AbstractC0297i0 {
    public C0373m0() {
        super(4);
    }

    /* renamed from: a */
    public final C0373m0 m787a(Object obj) {
        obj.getClass();
        int i11 = this.f1478b;
        int i12 = i11 + 1;
        Object[] objArr = this.f1477a;
        int length = objArr.length;
        if (length < i12) {
            int i13 = length + (length >> 1) + 1;
            if (i13 < i12) {
                int highestOneBit = Integer.highestOneBit(i11);
                i13 = highestOneBit + highestOneBit;
            }
            if (i13 < 0) {
                i13 = Integer.MAX_VALUE;
            }
            this.f1477a = Arrays.copyOf(objArr, i13);
            this.f1479c = false;
        } else if (this.f1479c) {
            this.f1477a = (Object[]) objArr.clone();
            this.f1479c = false;
        }
        Object[] objArr2 = this.f1477a;
        int i14 = this.f1478b;
        this.f1478b = i14 + 1;
        objArr2[i14] = obj;
        return this;
    }

    /* renamed from: b */
    public final AbstractC0430p0 m788b() {
        this.f1479c = true;
        return AbstractC0430p0.m828l(this.f1477a, this.f1478b);
    }
}
