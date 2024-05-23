package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.AbstractC1158c0;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.qa */
/* loaded from: classes.dex */
final class C5562qa {
    /* renamed from: a */
    public static final int m29562a(int i11, Object obj, Object obj2) {
        C5545pa c5545pa = (C5545pa) obj;
        AbstractC1158c0.m5500a(obj2);
        if (!c5545pa.isEmpty()) {
            Iterator it = c5545pa.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    /* renamed from: b */
    public static final Object m29563b(Object obj, Object obj2) {
        C5545pa c5545pa = (C5545pa) obj;
        C5545pa c5545pa2 = (C5545pa) obj2;
        if (!c5545pa2.isEmpty()) {
            if (!c5545pa.m29535f()) {
                c5545pa = c5545pa.m29532b();
            }
            c5545pa.m29534e(c5545pa2);
        }
        return c5545pa;
    }
}
