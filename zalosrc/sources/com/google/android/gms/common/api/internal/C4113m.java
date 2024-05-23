package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p342m6.C22890k;

/* renamed from: com.google.android.gms.common.api.internal.m */
/* loaded from: classes2.dex */
public final class C4113m {

    /* renamed from: a */
    private final Map f16395a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map f16396b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m19493h(boolean z11, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f16395a) {
            hashMap = new HashMap(this.f16395a);
        }
        synchronized (this.f16396b) {
            hashMap2 = new HashMap(this.f16396b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z11 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m19280e(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z11 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C22890k) entry2.getKey()).m117597d(new ApiException(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m19494c(BasePendingResult basePendingResult, boolean z11) {
        this.f16395a.put(basePendingResult, Boolean.valueOf(z11));
        basePendingResult.mo19276a(new C4107k(this, basePendingResult));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m19495d(C22890k c22890k, boolean z11) {
        this.f16396b.put(c22890k, Boolean.valueOf(z11));
        c22890k.m117594a().mo117574c(new C4110l(this, c22890k));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m19496e(int i11, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i11 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i11 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        m19493h(true, new Status(20, sb2.toString()));
    }

    /* renamed from: f */
    public final void m19497f() {
        m19493h(false, C4083c.f16263G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m19498g() {
        if (this.f16395a.isEmpty() && this.f16396b.isEmpty()) {
            return false;
        }
        return true;
    }
}
