package p705z5;

import java.util.AbstractMap;

/* renamed from: z5.sc */
/* loaded from: classes2.dex */
final class C31560sc extends AbstractC31476mc {

    /* renamed from: r */
    final /* synthetic */ C31574tc f145125r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31560sc(C31574tc c31574tc) {
        this.f145125r = c31574tc;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        int i12;
        Object[] objArr;
        Object[] objArr2;
        i12 = this.f145125r.f145236t;
        AbstractC31370f4.m152224a(i11, i12, "index");
        C31574tc c31574tc = this.f145125r;
        objArr = c31574tc.f145235s;
        int i13 = i11 + i11;
        Object obj = objArr[i13];
        obj.getClass();
        objArr2 = c31574tc.f145235s;
        Object obj2 = objArr2[i13 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i11;
        i11 = this.f145125r.f145236t;
        return i11;
    }
}
