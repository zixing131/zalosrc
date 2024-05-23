package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;

/* renamed from: com.google.android.gms.internal.play_billing.o */
/* loaded from: classes2.dex */
final class C5808o extends AbstractC5766h {

    /* renamed from: s */
    final /* synthetic */ C5814p f33381s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5808o(C5814p c5814p) {
        this.f33381s = c5814p;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        int i12;
        Object[] objArr;
        Object[] objArr2;
        i12 = this.f33381s.f33400t;
        AbstractC5727a5.m30166a(i11, i12, "index");
        C5814p c5814p = this.f33381s;
        objArr = c5814p.f33399s;
        int i13 = i11 + i11;
        Object obj = objArr[i13];
        obj.getClass();
        objArr2 = c5814p.f33399s;
        Object obj2 = objArr2[i13 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: k */
    public final boolean mo30209k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i11;
        i11 = this.f33381s.f33400t;
        return i11;
    }
}
