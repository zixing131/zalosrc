package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C4148b;
import com.google.android.gms.common.api.C4071a;

/* renamed from: com.google.android.gms.common.internal.g0 */
/* loaded from: classes2.dex */
public final class C4182g0 {

    /* renamed from: a */
    private final SparseIntArray f16615a = new SparseIntArray();

    /* renamed from: b */
    private C4148b f16616b;

    public C4182g0(C4148b c4148b) {
        AbstractC4205o.m19722k(c4148b);
        this.f16616b = c4148b;
    }

    /* renamed from: a */
    public final int m19685a(Context context, int i11) {
        return this.f16615a.get(i11, -1);
    }

    /* renamed from: b */
    public final int m19686b(Context context, C4071a.f fVar) {
        AbstractC4205o.m19722k(context);
        AbstractC4205o.m19722k(fVar);
        int i11 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int m19685a = m19685a(context, minApkVersion);
        if (m19685a == -1) {
            int i12 = 0;
            while (true) {
                if (i12 < this.f16615a.size()) {
                    int keyAt = this.f16615a.keyAt(i12);
                    if (keyAt > minApkVersion && this.f16615a.get(keyAt) == 0) {
                        break;
                    }
                    i12++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 == -1) {
                m19685a = this.f16616b.mo19201j(context, minApkVersion);
            } else {
                m19685a = i11;
            }
            this.f16615a.put(minApkVersion, m19685a);
        }
        return m19685a;
    }

    /* renamed from: c */
    public final void m19687c() {
        this.f16615a.clear();
    }
}
