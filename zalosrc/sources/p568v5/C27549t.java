package p568v5;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v5.t */
/* loaded from: classes2.dex */
public final class C27549t extends AbstractC27550u {

    /* renamed from: r */
    final transient int f129509r;

    /* renamed from: s */
    final transient int f129510s;

    /* renamed from: t */
    final /* synthetic */ AbstractC27550u f129511t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C27549t(AbstractC27550u abstractC27550u, int i11, int i12) {
        this.f129511t = abstractC27550u;
        this.f129509r = i11;
        this.f129510s = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p568v5.AbstractC27547r
    /* renamed from: d */
    public final Object[] mo140753d() {
        return this.f129511t.mo140753d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p568v5.AbstractC27547r
    /* renamed from: e */
    public final int mo140754e() {
        return this.f129511t.mo140754e() + this.f129509r;
    }

    @Override // p568v5.AbstractC27547r
    /* renamed from: g */
    final int mo140755g() {
        return this.f129511t.mo140754e() + this.f129509r + this.f129510s;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC27544o.m140747a(i11, this.f129510s, "index");
        return this.f129511t.get(i11 + this.f129509r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p568v5.AbstractC27547r
    /* renamed from: k */
    public final boolean mo140757k() {
        return true;
    }

    @Override // p568v5.AbstractC27550u
    /* renamed from: m */
    public final AbstractC27550u subList(int i11, int i12) {
        AbstractC27544o.m140749c(i11, i12, this.f129510s);
        AbstractC27550u abstractC27550u = this.f129511t;
        int i13 = this.f129509r;
        return abstractC27550u.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f129510s;
    }

    @Override // p568v5.AbstractC27550u, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }
}
