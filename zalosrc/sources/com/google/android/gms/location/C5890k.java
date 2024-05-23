package com.google.android.gms.location;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.Comparator;

/* renamed from: com.google.android.gms.location.k */
/* loaded from: classes2.dex */
final class C5890k implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        AbstractC4205o.m19722k(detectedActivity);
        AbstractC4205o.m19722k(detectedActivity2);
        int compareTo = Integer.valueOf(detectedActivity2.m30600t()).compareTo(Integer.valueOf(detectedActivity.m30600t()));
        if (compareTo == 0) {
            return Integer.valueOf(detectedActivity.m30599F()).compareTo(Integer.valueOf(detectedActivity2.m30599F()));
        }
        return compareTo;
    }
}
