package rd0;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;

/* renamed from: rd0.l */
/* loaded from: classes4.dex */
public final class C25746l extends AbstractC25751q {

    /* renamed from: a */
    private final String f122894a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25746l(String str) {
        super(null);
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f122894a = str;
    }

    /* renamed from: a */
    public final String m132873a() {
        return this.f122894a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25746l) && AbstractC19074t.m100204b(this.f122894a, ((C25746l) obj).f122894a);
    }

    public int hashCode() {
        return this.f122894a.hashCode();
    }

    public String toString() {
        return "UploadGroupAvatarResponse(url=" + this.f122894a + ")";
    }
}
