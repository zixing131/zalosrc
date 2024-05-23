package p492rr;

import fn0.AbstractC19074t;
import ge.C19415g;
import java.util.Calendar;

/* renamed from: rr.c */
/* loaded from: classes4.dex */
public final class C25960c {
    /* renamed from: a */
    public final long m133740a(C19415g c19415g) {
        AbstractC19074t.m100208f(c19415g, "dateInfo");
        Calendar calendar = Calendar.getInstance();
        calendar.set(c19415g.f96330c, c19415g.f96329b, c19415g.f96328a);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
