package p012a6;

import java.util.AbstractMap;

/* renamed from: a6.k1 */
/* loaded from: classes2.dex */
final class C0336k1 extends AbstractC0430p0 {

    /* renamed from: s */
    final /* synthetic */ C0355l1 f1538s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0336k1(C0355l1 c0355l1) {
        this.f1538s = c0355l1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        int i12;
        Object[] objArr;
        Object[] objArr2;
        i12 = this.f1538s.f1580t;
        AbstractC0163b.m617a(i11, i12, "index");
        C0355l1 c0355l1 = this.f1538s;
        objArr = c0355l1.f1579s;
        int i13 = i11 + i11;
        Object obj = objArr[i13];
        obj.getClass();
        objArr2 = c0355l1.f1579s;
        Object obj2 = objArr2[i13 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i11;
        i11 = this.f1538s.f1580t;
        return i11;
    }
}
