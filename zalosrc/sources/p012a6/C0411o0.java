package p012a6;

import java.util.List;

/* renamed from: a6.o0 */
/* loaded from: classes2.dex */
public final class C0411o0 extends AbstractC0430p0 {

    /* renamed from: s */
    final transient int f1690s;

    /* renamed from: t */
    final transient int f1691t;

    /* renamed from: u */
    final /* synthetic */ AbstractC0430p0 f1692u;

    public C0411o0(AbstractC0430p0 abstractC0430p0, int i11, int i12) {
        this.f1692u = abstractC0430p0;
        this.f1690s = i11;
        this.f1691t = i12;
    }

    @Override // p012a6.AbstractC0335k0
    /* renamed from: e */
    final int mo769e() {
        return this.f1692u.mo770g() + this.f1690s + this.f1691t;
    }

    @Override // p012a6.AbstractC0335k0
    /* renamed from: g */
    public final int mo770g() {
        return this.f1692u.mo770g() + this.f1690s;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC0163b.m617a(i11, this.f1691t, "index");
        return this.f1692u.get(i11 + this.f1690s);
    }

    @Override // p012a6.AbstractC0335k0
    /* renamed from: j */
    public final Object[] mo771j() {
        return this.f1692u.mo771j();
    }

    @Override // p012a6.AbstractC0430p0
    /* renamed from: k */
    public final AbstractC0430p0 subList(int i11, int i12) {
        AbstractC0163b.m619c(i11, i12, this.f1691t);
        AbstractC0430p0 abstractC0430p0 = this.f1692u;
        int i13 = this.f1690s;
        return abstractC0430p0.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1691t;
    }

    @Override // p012a6.AbstractC0430p0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }
}
