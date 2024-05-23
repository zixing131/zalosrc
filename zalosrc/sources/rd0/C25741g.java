package rd0;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;

/* renamed from: rd0.g */
/* loaded from: classes4.dex */
public final class C25741g extends AbstractC25751q {

    /* renamed from: a */
    private final String f122883a;

    /* renamed from: b */
    private final String f122884b;

    /* renamed from: c */
    private final String f122885c;

    /* renamed from: d */
    private final long f122886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25741g(String str, String str2, String str3, long j11) {
        super(null);
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "thumb");
        AbstractC19074t.m100208f(str3, "m4aURL");
        this.f122883a = str;
        this.f122884b = str2;
        this.f122885c = str3;
        this.f122886d = j11;
    }

    /* renamed from: a */
    public final long m132864a() {
        return this.f122886d;
    }

    /* renamed from: b */
    public final String m132865b() {
        return this.f122885c;
    }

    /* renamed from: c */
    public final String m132866c() {
        return this.f122884b;
    }

    /* renamed from: d */
    public final String m132867d() {
        return this.f122883a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25741g)) {
            return false;
        }
        C25741g c25741g = (C25741g) obj;
        return AbstractC19074t.m100204b(this.f122883a, c25741g.f122883a) && AbstractC19074t.m100204b(this.f122884b, c25741g.f122884b) && AbstractC19074t.m100204b(this.f122885c, c25741g.f122885c) && this.f122886d == c25741g.f122886d;
    }

    public int hashCode() {
        return (((((this.f122883a.hashCode() * 31) + this.f122884b.hashCode()) * 31) + this.f122885c.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f122886d);
    }

    public String toString() {
        return "UploadChatVoiceResponse(url=" + this.f122883a + ", thumb=" + this.f122884b + ", m4aURL=" + this.f122885c + ", fileSize=" + this.f122886d + ")";
    }
}
