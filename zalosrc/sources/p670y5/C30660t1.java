package p670y5;

import java.util.AbstractMap;

/* renamed from: y5.t1 */
/* loaded from: classes2.dex */
final class C30660t1 extends AbstractC30375e1 {

    /* renamed from: s */
    final /* synthetic */ C30679u1 f141816s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30660t1(C30679u1 c30679u1) {
        this.f141816s = c30679u1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        int i12;
        Object[] objArr;
        Object[] objArr2;
        i12 = this.f141816s.f141875t;
        AbstractC30582p.m149598a(i11, i12, "index");
        C30679u1 c30679u1 = this.f141816s;
        objArr = c30679u1.f141874s;
        int i13 = i11 + i11;
        Object obj = objArr[i13];
        obj.getClass();
        objArr2 = c30679u1.f141874s;
        Object obj2 = objArr2[i13 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i11;
        i11 = this.f141816s.f141875t;
        return i11;
    }
}
