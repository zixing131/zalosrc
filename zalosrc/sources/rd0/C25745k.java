package rd0;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;

/* renamed from: rd0.k */
/* loaded from: classes4.dex */
public final class C25745k extends AbstractC25751q {

    /* renamed from: a */
    private final String f122892a;

    /* renamed from: b */
    private final long f122893b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25745k(String str, long j11) {
        super(null);
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f122892a = str;
        this.f122893b = j11;
    }

    /* renamed from: a */
    public final long m132871a() {
        return this.f122893b;
    }

    /* renamed from: b */
    public final String m132872b() {
        return this.f122892a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25745k)) {
            return false;
        }
        C25745k c25745k = (C25745k) obj;
        return AbstractC19074t.m100204b(this.f122892a, c25745k.f122892a) && this.f122893b == c25745k.f122893b;
    }

    public int hashCode() {
        return (this.f122892a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f122893b);
    }

    public String toString() {
        return "UploadFileResponse(url=" + this.f122892a + ", fileSize=" + this.f122893b + ")";
    }
}
