package rd0;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;

/* renamed from: rd0.f */
/* loaded from: classes4.dex */
public final class C25740f extends AbstractC25751q {

    /* renamed from: a */
    private final String f122881a;

    /* renamed from: b */
    private final long f122882b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25740f(String str, long j11) {
        super(null);
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f122881a = str;
        this.f122882b = j11;
    }

    /* renamed from: a */
    public final long m132862a() {
        return this.f122882b;
    }

    /* renamed from: b */
    public final String m132863b() {
        return this.f122881a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25740f)) {
            return false;
        }
        C25740f c25740f = (C25740f) obj;
        return AbstractC19074t.m100204b(this.f122881a, c25740f.f122881a) && this.f122882b == c25740f.f122882b;
    }

    public int hashCode() {
        return (this.f122881a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f122882b);
    }

    public String toString() {
        return "UploadChatVideoResponse(url=" + this.f122881a + ", fileSize=" + this.f122882b + ")";
    }
}
