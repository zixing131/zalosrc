package p670y5;

import java.util.List;

/* renamed from: y5.d1 */
/* loaded from: classes2.dex */
public final class C30356d1 extends AbstractC30375e1 {

    /* renamed from: s */
    final transient int f140777s;

    /* renamed from: t */
    final transient int f140778t;

    /* renamed from: u */
    final /* synthetic */ AbstractC30375e1 f140779u;

    public C30356d1(AbstractC30375e1 abstractC30375e1, int i11, int i12) {
        this.f140779u = abstractC30375e1;
        this.f140777s = i11;
        this.f140778t = i12;
    }

    @Override // p670y5.AbstractC30754y0
    /* renamed from: e */
    final int mo149475e() {
        return this.f140779u.mo149476g() + this.f140777s + this.f140778t;
    }

    @Override // p670y5.AbstractC30754y0
    /* renamed from: g */
    public final int mo149476g() {
        return this.f140779u.mo149476g() + this.f140777s;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC30582p.m149598a(i11, this.f140778t, "index");
        return this.f140779u.get(i11 + this.f140777s);
    }

    @Override // p670y5.AbstractC30754y0
    /* renamed from: j */
    public final Object[] mo149477j() {
        return this.f140779u.mo149477j();
    }

    @Override // p670y5.AbstractC30375e1
    /* renamed from: k */
    public final AbstractC30375e1 subList(int i11, int i12) {
        AbstractC30582p.m149600c(i11, i12, this.f140778t);
        AbstractC30375e1 abstractC30375e1 = this.f140779u;
        int i13 = this.f140777s;
        return abstractC30375e1.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f140778t;
    }

    @Override // p670y5.AbstractC30375e1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }
}
