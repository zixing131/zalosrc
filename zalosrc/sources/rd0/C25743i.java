package rd0;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: rd0.i */
/* loaded from: classes4.dex */
public final class C25743i extends AbstractC25751q {

    /* renamed from: a */
    private final String f122889a;

    /* renamed from: b */
    private final String f122890b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25743i(String str, String str2) {
        super(null);
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "thumb");
        this.f122889a = str;
        this.f122890b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25743i)) {
            return false;
        }
        C25743i c25743i = (C25743i) obj;
        return AbstractC19074t.m100204b(this.f122889a, c25743i.f122889a) && AbstractC19074t.m100204b(this.f122890b, c25743i.f122890b);
    }

    public int hashCode() {
        return (this.f122889a.hashCode() * 31) + this.f122890b.hashCode();
    }

    public String toString() {
        return "UploadExtendedProfilePhotoResponse(url=" + this.f122889a + ", thumb=" + this.f122890b + ")";
    }

    public /* synthetic */ C25743i(String str, String str2, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }
}
