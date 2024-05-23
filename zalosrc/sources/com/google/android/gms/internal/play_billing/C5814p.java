package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.play_billing.p */
/* loaded from: classes2.dex */
final class C5814p extends AbstractC5790l {

    /* renamed from: r */
    private final transient AbstractC5784k f33398r;

    /* renamed from: s */
    private final transient Object[] f33399s;

    /* renamed from: t */
    private final transient int f33400t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5814p(AbstractC5784k abstractC5784k, Object[] objArr, int i11, int i12) {
        this.f33398r = abstractC5784k;
        this.f33399s = objArr;
        this.f33400t = i12;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f33398r.get(key))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: d */
    public final int mo30205d(Object[] objArr, int i11) {
        return mo30208j().mo30205d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo30208j().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5790l
    /* renamed from: m */
    final AbstractC5766h mo30320m() {
        return new C5808o(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33400t;
    }
}
