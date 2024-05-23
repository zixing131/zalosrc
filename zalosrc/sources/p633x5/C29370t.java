package p633x5;

import java.util.AbstractMap;

/* renamed from: x5.t */
/* loaded from: classes2.dex */
final class C29370t extends AbstractC29356m {

    /* renamed from: s */
    final /* synthetic */ C29372u f135864s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C29370t(C29372u c29372u) {
        this.f135864s = c29372u;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        int i12;
        Object[] objArr;
        Object[] objArr2;
        i12 = this.f135864s.f135867t;
        AbstractC29336c.m146471a(i11, i12, "index");
        C29372u c29372u = this.f135864s;
        objArr = c29372u.f135866s;
        int i13 = i11 + i11;
        Object obj = objArr[i13];
        obj.getClass();
        objArr2 = c29372u.f135866s;
        Object obj2 = objArr2[i13 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i11;
        i11 = this.f135864s.f135867t;
        return i11;
    }
}
