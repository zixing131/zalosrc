package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.t */
/* loaded from: classes2.dex */
public abstract class AbstractC5838t {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m30478a(Set set) {
        int i11;
        int i12 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i11 = obj.hashCode();
            } else {
                i11 = 0;
            }
            i12 += i11;
        }
        return i12;
    }
}
