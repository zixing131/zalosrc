package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class m93 extends h83 {

    /* renamed from: r */
    private final transient f83 f24440r;

    /* renamed from: s */
    private final transient Object[] f24441s;

    /* renamed from: t */
    private final transient int f24442t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m93(f83 f83Var, Object[] objArr, int i11, int i12) {
        this.f24440r = f83Var;
        this.f24441s = objArr;
        this.f24442t = i12;
    }

    @Override // com.google.android.gms.internal.ads.x73, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f24440r.get(key))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: d */
    public final int mo20836d(Object[] objArr, int i11) {
        return mo20837j().mo20836d(objArr, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo20837j().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.h83, com.google.android.gms.internal.ads.x73
    /* renamed from: k */
    public final ba3 mo20838k() {
        return mo20837j().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.h83
    /* renamed from: p */
    final c83 mo22738p() {
        return new l93(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24442t;
    }
}
