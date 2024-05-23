package p633x5;

import java.util.List;

/* renamed from: x5.l */
/* loaded from: classes2.dex */
public final class C29354l extends AbstractC29356m {

    /* renamed from: s */
    final transient int f135826s;

    /* renamed from: t */
    final transient int f135827t;

    /* renamed from: u */
    final /* synthetic */ AbstractC29356m f135828u;

    public C29354l(AbstractC29356m abstractC29356m, int i11, int i12) {
        this.f135828u = abstractC29356m;
        this.f135826s = i11;
        this.f135827t = i12;
    }

    @Override // p633x5.AbstractC29350j
    /* renamed from: e */
    final int mo146490e() {
        return this.f135828u.mo146491g() + this.f135826s + this.f135827t;
    }

    @Override // p633x5.AbstractC29350j
    /* renamed from: g */
    public final int mo146491g() {
        return this.f135828u.mo146491g() + this.f135826s;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC29336c.m146471a(i11, this.f135827t, "index");
        return this.f135828u.get(i11 + this.f135826s);
    }

    @Override // p633x5.AbstractC29350j
    /* renamed from: j */
    public final Object[] mo146492j() {
        return this.f135828u.mo146492j();
    }

    @Override // p633x5.AbstractC29356m
    /* renamed from: k */
    public final AbstractC29356m subList(int i11, int i12) {
        AbstractC29336c.m146473c(i11, i12, this.f135827t);
        AbstractC29356m abstractC29356m = this.f135828u;
        int i13 = this.f135826s;
        return abstractC29356m.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f135827t;
    }

    @Override // p633x5.AbstractC29356m, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }
}
