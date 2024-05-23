package b10;

import androidx.work.AbstractC2144f;
import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import fn0.AbstractC19074t;

/* renamed from: b10.c */
/* loaded from: classes5.dex */
public final class C2484c extends AbstractC2487f {

    /* renamed from: b */
    private InteractEventResponse.InteractItem f10139b;

    /* renamed from: c */
    private final boolean f10140c;

    public C2484c(InteractEventResponse.InteractItem interactItem, boolean z11) {
        super(2);
        this.f10139b = interactItem;
        this.f10140c = z11;
    }

    /* renamed from: b */
    public final InteractEventResponse.InteractItem m12549b() {
        return this.f10139b;
    }

    /* renamed from: c */
    public final boolean m12550c() {
        return this.f10140c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2484c)) {
            return false;
        }
        C2484c c2484c = (C2484c) obj;
        return AbstractC19074t.m100204b(this.f10139b, c2484c.f10139b) && this.f10140c == c2484c.f10140c;
    }

    public int hashCode() {
        InteractEventResponse.InteractItem interactItem = this.f10139b;
        return ((interactItem == null ? 0 : interactItem.hashCode()) * 31) + AbstractC2144f.m11520a(this.f10140c);
    }

    public String toString() {
        return "InteractComment(interact=" + this.f10139b + ", isLandscape=" + this.f10140c + ")";
    }
}
