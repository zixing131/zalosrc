package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.o8 */
/* loaded from: classes.dex */
final class C5526o8 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC5679x8 abstractC5679x8 = (AbstractC5679x8) obj;
        AbstractC5679x8 abstractC5679x82 = (AbstractC5679x8) obj2;
        C5509n8 c5509n8 = new C5509n8(abstractC5679x8);
        C5509n8 c5509n82 = new C5509n8(abstractC5679x82);
        while (c5509n8.hasNext() && c5509n82.hasNext()) {
            int compareTo = Integer.valueOf(c5509n8.zza() & 255).compareTo(Integer.valueOf(c5509n82.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(abstractC5679x8.mo29551g()).compareTo(Integer.valueOf(abstractC5679x82.mo29551g()));
    }
}
