package tn0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;

/* renamed from: tn0.i */
/* loaded from: classes7.dex */
public final class C26797i extends AbstractC26784d1 {

    /* renamed from: a */
    private byte[] f127004a;

    /* renamed from: b */
    private int f127005b;

    public C26797i(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "bufferWithData");
        this.f127004a = bArr;
        this.f127005b = bArr.length;
        mo137810b(10);
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: b */
    public void mo137810b(int i11) {
        int m116580c;
        byte[] bArr = this.f127004a;
        if (bArr.length < i11) {
            m116580c = AbstractC22543l.m116580c(i11, bArr.length * 2);
            byte[] copyOf = Arrays.copyOf(bArr, m116580c);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            this.f127004a = copyOf;
        }
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: d */
    public int mo137811d() {
        return this.f127005b;
    }

    /* renamed from: e */
    public final void m137852e(byte b11) {
        AbstractC26784d1.m137816c(this, 0, 1, null);
        byte[] bArr = this.f127004a;
        int mo137811d = mo137811d();
        this.f127005b = mo137811d + 1;
        bArr[mo137811d] = b11;
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] mo137809a() {
        byte[] copyOf = Arrays.copyOf(this.f127004a, mo137811d());
        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
