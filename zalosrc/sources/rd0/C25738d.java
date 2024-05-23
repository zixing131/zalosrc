package rd0;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: rd0.d */
/* loaded from: classes4.dex */
public final class C25738d extends AbstractC25751q {

    /* renamed from: a */
    private final String f122872a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25738d(String str) {
        super(null);
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f122872a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25738d) && AbstractC19074t.m100204b(this.f122872a, ((C25738d) obj).f122872a);
    }

    public int hashCode() {
        return this.f122872a.hashCode();
    }

    public String toString() {
        return "UploadChatMemoVideoResponse(url=" + this.f122872a + ")";
    }

    public /* synthetic */ C25738d(String str, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str);
    }
}
