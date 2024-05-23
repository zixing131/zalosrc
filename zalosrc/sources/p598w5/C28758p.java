package p598w5;

import java.util.List;

/* renamed from: w5.p */
/* loaded from: classes2.dex */
public final class C28758p extends AbstractC28759q {

    /* renamed from: s */
    final transient int f133282s;

    /* renamed from: t */
    final transient int f133283t;

    /* renamed from: u */
    final /* synthetic */ AbstractC28759q f133284u;

    public C28758p(AbstractC28759q abstractC28759q, int i11, int i12) {
        this.f133284u = abstractC28759q;
        this.f133282s = i11;
        this.f133283t = i12;
    }

    @Override // p598w5.AbstractC28756n
    /* renamed from: e */
    final int mo143890e() {
        return this.f133284u.mo143891g() + this.f133282s + this.f133283t;
    }

    @Override // p598w5.AbstractC28756n
    /* renamed from: g */
    public final int mo143891g() {
        return this.f133284u.mo143891g() + this.f133282s;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC28752j.m143882a(i11, this.f133283t, "index");
        return this.f133284u.get(i11 + this.f133282s);
    }

    @Override // p598w5.AbstractC28756n
    /* renamed from: j */
    public final Object[] mo143892j() {
        return this.f133284u.mo143892j();
    }

    @Override // p598w5.AbstractC28759q
    /* renamed from: k */
    public final AbstractC28759q subList(int i11, int i12) {
        AbstractC28752j.m143884c(i11, i12, this.f133283t);
        int i13 = this.f133282s;
        return this.f133284u.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f133283t;
    }

    @Override // p598w5.AbstractC28759q, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }
}
