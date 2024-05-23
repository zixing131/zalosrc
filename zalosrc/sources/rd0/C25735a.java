package rd0;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;

/* renamed from: rd0.a */
/* loaded from: classes4.dex */
public final class C25735a extends AbstractC25751q {

    /* renamed from: a */
    private final String f122867a;

    /* renamed from: b */
    private final String f122868b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25735a(String str, String str2) {
        super(null);
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "picId");
        this.f122867a = str;
        this.f122868b = str2;
    }

    /* renamed from: a */
    public final String m132849a() {
        return this.f122868b;
    }

    /* renamed from: b */
    public final String m132850b() {
        return this.f122867a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25735a)) {
            return false;
        }
        C25735a c25735a = (C25735a) obj;
        return AbstractC19074t.m100204b(this.f122867a, c25735a.f122867a) && AbstractC19074t.m100204b(this.f122868b, c25735a.f122868b);
    }

    public int hashCode() {
        return (this.f122867a.hashCode() * 31) + this.f122868b.hashCode();
    }

    public String toString() {
        return "UploadAvatarResponse(url=" + this.f122867a + ", picId=" + this.f122868b + ")";
    }
}
