package com.google.android.gms.location;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.Comparator;

/* renamed from: com.google.android.gms.location.j */
/* loaded from: classes2.dex */
final class C5889j implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        AbstractC4205o.m19722k(activityTransition);
        AbstractC4205o.m19722k(activityTransition2);
        int m30594t = activityTransition.m30594t();
        int m30594t2 = activityTransition2.m30594t();
        if (m30594t != m30594t2) {
            if (m30594t < m30594t2) {
                return -1;
            }
            return 1;
        }
        int m30593F = activityTransition.m30593F();
        int m30593F2 = activityTransition2.m30593F();
        if (m30593F == m30593F2) {
            return 0;
        }
        if (m30593F < m30593F2) {
            return -1;
        }
        return 1;
    }
}
