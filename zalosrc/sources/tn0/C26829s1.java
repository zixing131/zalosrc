package tn0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;
import pm0.C24868y;

/* renamed from: tn0.s1 */
/* loaded from: classes7.dex */
public final class C26829s1 extends AbstractC26784d1 {

    /* renamed from: a */
    private byte[] f127071a;

    /* renamed from: b */
    private int f127072b;

    public /* synthetic */ C26829s1(byte[] bArr, AbstractC19060k abstractC19060k) {
        this(bArr);
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo137809a() {
        return C24868y.m129242d(m137961f());
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: b */
    public void mo137810b(int i11) {
        int m116580c;
        if (C24868y.m129249r(this.f127071a) < i11) {
            byte[] bArr = this.f127071a;
            m116580c = AbstractC22543l.m116580c(i11, C24868y.m129249r(bArr) * 2);
            byte[] copyOf = Arrays.copyOf(bArr, m116580c);
            AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
            this.f127071a = C24868y.m129244g(copyOf);
        }
    }

    @Override // tn0.AbstractC26784d1
    /* renamed from: d */
    public int mo137811d() {
        return this.f127072b;
    }

    /* renamed from: e */
    public final void m137960e(byte b11) {
        AbstractC26784d1.m137816c(this, 0, 1, null);
        byte[] bArr = this.f127071a;
        int mo137811d = mo137811d();
        this.f127072b = mo137811d + 1;
        C24868y.m129253w(bArr, mo137811d, b11);
    }

    /* renamed from: f */
    public byte[] m137961f() {
        byte[] copyOf = Arrays.copyOf(this.f127071a, mo137811d());
        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
        return C24868y.m129244g(copyOf);
    }

    private C26829s1(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "bufferWithData");
        this.f127071a = bArr;
        this.f127072b = C24868y.m129249r(bArr);
        mo137810b(10);
    }
}
