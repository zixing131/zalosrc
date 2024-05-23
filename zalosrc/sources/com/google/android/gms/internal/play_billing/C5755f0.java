package com.google.android.gms.internal.play_billing;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.play_billing.f0 */
/* loaded from: classes2.dex */
final class C5755f0 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC5803n0 abstractC5803n0 = (AbstractC5803n0) obj;
        AbstractC5803n0 abstractC5803n02 = (AbstractC5803n0) obj2;
        C5749e0 c5749e0 = new C5749e0(abstractC5803n0);
        C5749e0 c5749e02 = new C5749e0(abstractC5803n02);
        while (c5749e0.hasNext() && c5749e02.hasNext()) {
            int compareTo = Integer.valueOf(c5749e0.zza() & 255).compareTo(Integer.valueOf(c5749e02.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(abstractC5803n0.mo30241g()).compareTo(Integer.valueOf(abstractC5803n02.mo30241g()));
    }
}
