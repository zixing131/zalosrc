package bo;

import com.zing.zalo.feed.data.TextLocalization;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;

/* renamed from: bo.i1 */
/* loaded from: classes4.dex */
public final class C2986i1 {

    /* renamed from: a */
    private final C17244x0 f11799a;

    /* renamed from: b */
    private final int f11800b;

    /* renamed from: c */
    private final int f11801c;

    /* renamed from: d */
    private final TextLocalization f11802d;

    /* renamed from: e */
    private final TextLocalization f11803e;

    public C2986i1(C17244x0 c17244x0, int i11, int i12, TextLocalization textLocalization, TextLocalization textLocalization2) {
        AbstractC19074t.m100208f(c17244x0, "zinstantAPIInfo");
        AbstractC19074t.m100208f(textLocalization, "title");
        AbstractC19074t.m100208f(textLocalization2, ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
        this.f11799a = c17244x0;
        this.f11800b = i11;
        this.f11801c = i12;
        this.f11802d = textLocalization;
        this.f11803e = textLocalization2;
    }

    /* renamed from: a */
    public final int m14153a() {
        return this.f11800b;
    }

    /* renamed from: b */
    public final int m14154b() {
        return this.f11801c;
    }

    /* renamed from: c */
    public final TextLocalization m14155c() {
        return this.f11803e;
    }

    /* renamed from: d */
    public final TextLocalization m14156d() {
        return this.f11802d;
    }

    /* renamed from: e */
    public final C17244x0 m14157e() {
        return this.f11799a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2986i1)) {
            return false;
        }
        C2986i1 c2986i1 = (C2986i1) obj;
        return AbstractC19074t.m100204b(this.f11799a, c2986i1.f11799a) && this.f11800b == c2986i1.f11800b && this.f11801c == c2986i1.f11801c && AbstractC19074t.m100204b(this.f11802d, c2986i1.f11802d) && AbstractC19074t.m100204b(this.f11803e, c2986i1.f11803e);
    }

    public int hashCode() {
        return (((((((this.f11799a.hashCode() * 31) + this.f11800b) * 31) + this.f11801c) * 31) + this.f11802d.hashCode()) * 31) + this.f11803e.hashCode();
    }

    public String toString() {
        return "FeedVideoChannelAttachment(zinstantAPIInfo=" + this.f11799a + ", height=" + this.f11800b + ", position=" + this.f11801c + ", title=" + this.f11802d + ", subtitle=" + this.f11803e + ")";
    }
}
