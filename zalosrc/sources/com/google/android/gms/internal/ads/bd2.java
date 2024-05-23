package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class bd2 implements sh2 {

    /* renamed from: a */
    private final Executor f17705a;

    /* renamed from: b */
    private final hk0 f17706b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bd2(Executor executor, hk0 hk0Var) {
        this.f17705a = executor;
        this.f17706b = hk0Var;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21299l2)).booleanValue()) {
            return kc3.m23877i(null);
        }
        return kc3.m23881m(this.f17706b.m22937j(), new y43() { // from class: com.google.android.gms.internal.ads.zc2
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new rh2() { // from class: com.google.android.gms.internal.ads.ad2
                    @Override // com.google.android.gms.internal.ads.rh2
                    /* renamed from: a */
                    public final void mo20086a(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.f17705a);
    }
}
