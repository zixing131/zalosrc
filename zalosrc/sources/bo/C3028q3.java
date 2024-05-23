package bo;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import nh0.C23793c;
import on0.AbstractC24341v;

/* renamed from: bo.q3 */
/* loaded from: classes4.dex */
public final class C3028q3 {

    /* renamed from: a */
    private final String f12196a;

    /* renamed from: b */
    private final long f12197b;

    public C3028q3(String str, long j11) {
        AbstractC19074t.m100208f(str, "streamUrl");
        this.f12196a = str;
        this.f12197b = j11;
    }

    /* renamed from: a */
    public final String m14577a() {
        return this.f12196a;
    }

    /* renamed from: b */
    public final boolean m14578b() {
        boolean m127128x;
        if (C23793c.Companion.m124321a().mo124311f() - this.f12197b < 900000) {
            m127128x = AbstractC24341v.m127128x(this.f12196a);
            if (!m127128x) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3028q3)) {
            return false;
        }
        C3028q3 c3028q3 = (C3028q3) obj;
        return AbstractC19074t.m100204b(this.f12196a, c3028q3.f12196a) && this.f12197b == c3028q3.f12197b;
    }

    public int hashCode() {
        return (this.f12196a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f12197b);
    }

    public String toString() {
        return "ZShortVideoStreaming(streamUrl=" + this.f12196a + ", lastFetchTime=" + this.f12197b + ")";
    }

    public /* synthetic */ C3028q3(String str, long j11, int i11, AbstractC19060k abstractC19060k) {
        this(str, (i11 & 2) != 0 ? C23793c.Companion.m124321a().mo124311f() : j11);
    }
}
