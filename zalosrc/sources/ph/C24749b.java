package ph;

import androidx.work.AbstractC2144f;
import dj.C17945a0;
import fn0.AbstractC19074t;
import p577vj.C28266a;

/* renamed from: ph.b */
/* loaded from: classes3.dex */
public final class C24749b {

    /* renamed from: a */
    private final C28266a f118835a;

    /* renamed from: b */
    private final C17945a0 f118836b;

    /* renamed from: c */
    private final boolean f118837c;

    public C24749b(C28266a c28266a, C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c28266a, "lastUnreadReactionInfo");
        this.f118835a = c28266a;
        this.f118836b = c17945a0;
        this.f118837c = z11;
    }

    /* renamed from: a */
    public final boolean m128553a() {
        return this.f118837c;
    }

    /* renamed from: b */
    public final C28266a m128554b() {
        return this.f118835a;
    }

    /* renamed from: c */
    public final C17945a0 m128555c() {
        return this.f118836b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24749b)) {
            return false;
        }
        C24749b c24749b = (C24749b) obj;
        return AbstractC19074t.m100204b(this.f118835a, c24749b.f118835a) && AbstractC19074t.m100204b(this.f118836b, c24749b.f118836b) && this.f118837c == c24749b.f118837c;
    }

    public int hashCode() {
        int hashCode = this.f118835a.hashCode() * 31;
        C17945a0 c17945a0 = this.f118836b;
        return ((hashCode + (c17945a0 == null ? 0 : c17945a0.hashCode())) * 31) + AbstractC2144f.m11520a(this.f118837c);
    }

    public String toString() {
        return "LastUnReadReactionInfoPacket(lastUnreadReactionInfo=" + this.f118835a + ", msgLastUnreadReaction=" + this.f118836b + ", hasNotify=" + this.f118837c + ")";
    }
}
