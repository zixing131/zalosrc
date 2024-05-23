package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes3.dex */
abstract class AbstractC6303e {

    /* renamed from: a */
    static AtomicReference f35270a = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Calendar m32278a(Calendar calendar) {
        Calendar m32281d = m32281d(calendar);
        Calendar m32280c = m32280c();
        m32280c.set(m32281d.get(1), m32281d.get(2), m32281d.get(5));
        return m32280c;
    }

    /* renamed from: b */
    private static TimeZone m32279b() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Calendar m32280c() {
        return m32281d(null);
    }

    /* renamed from: d */
    static Calendar m32281d(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m32279b());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
