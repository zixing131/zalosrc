package p480rd;

import fn0.AbstractC19074t;
import java.util.Calendar;

/* renamed from: rd.a */
/* loaded from: classes3.dex */
public final class C25730a {

    /* renamed from: a */
    private final Calendar f122849a;

    public C25730a(Calendar calendar) {
        AbstractC19074t.m100208f(calendar, "calendar");
        this.f122849a = calendar;
    }

    /* renamed from: a */
    public final Calendar m132822a() {
        return this.f122849a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25730a) && AbstractC19074t.m100204b(this.f122849a, ((C25730a) obj).f122849a);
    }

    public int hashCode() {
        return this.f122849a.hashCode();
    }

    public String toString() {
        return "CalendarMonth(calendar=" + this.f122849a + ")";
    }
}
