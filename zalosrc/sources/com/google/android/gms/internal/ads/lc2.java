package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
final class lc2 implements sh2 {

    /* renamed from: a */
    private final Set f23817a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lc2(Set set) {
        this.f23817a = set;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.f23817a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return kc3.m23877i(new rh2() { // from class: com.google.android.gms.internal.ads.kc2
            @Override // com.google.android.gms.internal.ads.rh2
            /* renamed from: a */
            public final void mo20086a(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
