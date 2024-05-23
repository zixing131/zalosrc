package rd0;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;

/* renamed from: rd0.h */
/* loaded from: classes4.dex */
public final class C25742h extends AbstractC25751q {

    /* renamed from: a */
    private final String f122887a;

    /* renamed from: b */
    private final String f122888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25742h(String str, String str2) {
        super(null);
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "picId");
        this.f122887a = str;
        this.f122888b = str2;
    }

    /* renamed from: a */
    public final String m132868a() {
        return this.f122888b;
    }

    /* renamed from: b */
    public final String m132869b() {
        return this.f122887a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25742h)) {
            return false;
        }
        C25742h c25742h = (C25742h) obj;
        return AbstractC19074t.m100204b(this.f122887a, c25742h.f122887a) && AbstractC19074t.m100204b(this.f122888b, c25742h.f122888b);
    }

    public int hashCode() {
        return (this.f122887a.hashCode() * 31) + this.f122888b.hashCode();
    }

    public String toString() {
        return "UploadCoverPhotoResponse(url=" + this.f122887a + ", picId=" + this.f122888b + ")";
    }
}
