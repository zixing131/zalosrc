package p705z5;

import java.util.List;

/* renamed from: z5.lc */
/* loaded from: classes2.dex */
public final class C31462lc extends AbstractC31476mc {

    /* renamed from: r */
    final transient int f144919r;

    /* renamed from: s */
    final transient int f144920s;

    /* renamed from: t */
    final /* synthetic */ AbstractC31476mc f144921t;

    public C31462lc(AbstractC31476mc abstractC31476mc, int i11, int i12) {
        this.f144921t = abstractC31476mc;
        this.f144919r = i11;
        this.f144920s = i12;
    }

    @Override // p705z5.AbstractC31460la
    /* renamed from: e */
    final int mo152301e() {
        return this.f144921t.mo152302g() + this.f144919r + this.f144920s;
    }

    @Override // p705z5.AbstractC31460la
    /* renamed from: g */
    public final int mo152302g() {
        return this.f144921t.mo152302g() + this.f144919r;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC31370f4.m152224a(i11, this.f144920s, "index");
        return this.f144921t.get(i11 + this.f144919r);
    }

    @Override // p705z5.AbstractC31460la
    /* renamed from: j */
    public final Object[] mo152303j() {
        return this.f144921t.mo152303j();
    }

    @Override // p705z5.AbstractC31476mc
    /* renamed from: k */
    public final AbstractC31476mc subList(int i11, int i12) {
        AbstractC31370f4.m152226c(i11, i12, this.f144920s);
        AbstractC31476mc abstractC31476mc = this.f144921t;
        int i13 = this.f144919r;
        return abstractC31476mc.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f144920s;
    }

    @Override // p705z5.AbstractC31476mc, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }
}
