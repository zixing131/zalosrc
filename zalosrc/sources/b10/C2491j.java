package b10;

import androidx.work.AbstractC2144f;
import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import fn0.AbstractC19074t;

/* renamed from: b10.j */
/* loaded from: classes5.dex */
public final class C2491j extends AbstractC2487f {

    /* renamed from: b */
    private InteractEventResponse.InteractItem f10174b;

    /* renamed from: c */
    private final boolean f10175c;

    public C2491j(InteractEventResponse.InteractItem interactItem, boolean z11) {
        super(3);
        this.f10174b = interactItem;
        this.f10175c = z11;
    }

    /* renamed from: b */
    public final InteractEventResponse.InteractItem m12574b() {
        return this.f10174b;
    }

    /* renamed from: c */
    public final boolean m12575c() {
        return this.f10175c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2491j)) {
            return false;
        }
        C2491j c2491j = (C2491j) obj;
        return AbstractC19074t.m100204b(this.f10174b, c2491j.f10174b) && this.f10175c == c2491j.f10175c;
    }

    public int hashCode() {
        InteractEventResponse.InteractItem interactItem = this.f10174b;
        return ((interactItem == null ? 0 : interactItem.hashCode()) * 31) + AbstractC2144f.m11520a(this.f10175c);
    }

    public String toString() {
        return "WelcomeComment(interact=" + this.f10174b + ", isLandscape=" + this.f10175c + ")";
    }
}
