package p140ev;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Random;

/* renamed from: ev.c */
/* loaded from: classes4.dex */
public final class C18614c {

    /* renamed from: a */
    private final String f93609a;

    /* renamed from: b */
    private C18613b f93610b;

    /* renamed from: c */
    private final int f93611c;

    /* renamed from: d */
    private final String f93612d;

    /* renamed from: e */
    private String f93613e;

    /* renamed from: f */
    private final long f93614f;

    /* renamed from: g */
    private final boolean f93615g;

    /* renamed from: h */
    private final String f93616h;

    /* renamed from: i */
    private final String f93617i;

    /* renamed from: j */
    private int f93618j;

    public C18614c(String str, C18613b c18613b, int i11, String str2, String str3, long j11, boolean z11, String str4, String str5, int i12) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(c18613b, "featureId");
        AbstractC19074t.m100208f(str2, "srcParam");
        AbstractC19074t.m100208f(str3, "extraInfo");
        AbstractC19074t.m100208f(str4, "jsToken");
        AbstractC19074t.m100208f(str5, "oaId");
        this.f93609a = str;
        this.f93610b = c18613b;
        this.f93611c = i11;
        this.f93612d = str2;
        this.f93613e = str3;
        this.f93614f = j11;
        this.f93615g = z11;
        this.f93616h = str4;
        this.f93617i = str5;
        this.f93618j = i12;
    }

    /* renamed from: a */
    public final C18614c m98351a(String str, C18613b c18613b, int i11, String str2, String str3, long j11, boolean z11, String str4, String str5, int i12) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(c18613b, "featureId");
        AbstractC19074t.m100208f(str2, "srcParam");
        AbstractC19074t.m100208f(str3, "extraInfo");
        AbstractC19074t.m100208f(str4, "jsToken");
        AbstractC19074t.m100208f(str5, "oaId");
        return new C18614c(str, c18613b, i11, str2, str3, j11, z11, str4, str5, i12);
    }

    /* renamed from: c */
    public final String m98352c() {
        return this.f93613e;
    }

    /* renamed from: d */
    public final C18613b m98353d() {
        return this.f93610b;
    }

    /* renamed from: e */
    public final boolean m98354e() {
        return this.f93615g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18614c)) {
            return false;
        }
        C18614c c18614c = (C18614c) obj;
        return AbstractC19074t.m100204b(this.f93609a, c18614c.f93609a) && AbstractC19074t.m100204b(this.f93610b, c18614c.f93610b) && this.f93611c == c18614c.f93611c && AbstractC19074t.m100204b(this.f93612d, c18614c.f93612d) && AbstractC19074t.m100204b(this.f93613e, c18614c.f93613e) && this.f93614f == c18614c.f93614f && this.f93615g == c18614c.f93615g && AbstractC19074t.m100204b(this.f93616h, c18614c.f93616h) && AbstractC19074t.m100204b(this.f93617i, c18614c.f93617i) && this.f93618j == c18614c.f93618j;
    }

    /* renamed from: f */
    public final String m98355f() {
        return this.f93616h;
    }

    /* renamed from: g */
    public final String m98356g() {
        return this.f93617i;
    }

    /* renamed from: h */
    public final long m98357h() {
        return this.f93614f;
    }

    public int hashCode() {
        return (((((((((((((((((this.f93609a.hashCode() * 31) + this.f93610b.hashCode()) * 31) + this.f93611c) * 31) + this.f93612d.hashCode()) * 31) + this.f93613e.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f93614f)) * 31) + AbstractC2144f.m11520a(this.f93615g)) * 31) + this.f93616h.hashCode()) * 31) + this.f93617i.hashCode()) * 31) + this.f93618j;
    }

    /* renamed from: i */
    public final int m98358i() {
        return this.f93618j;
    }

    /* renamed from: j */
    public final String m98359j() {
        return this.f93612d;
    }

    /* renamed from: k */
    public final int m98360k() {
        return this.f93611c;
    }

    /* renamed from: l */
    public final String m98361l() {
        return this.f93609a;
    }

    /* renamed from: m */
    public final void m98362m(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f93613e = str;
    }

    /* renamed from: n */
    public final void m98363n(C18613b c18613b) {
        AbstractC19074t.m100208f(c18613b, "<set-?>");
        this.f93610b = c18613b;
    }

    /* renamed from: o */
    public final void m98364o(int i11) {
        this.f93618j = i11;
    }

    public String toString() {
        return "JumpInput(url=" + this.f93609a + ", featureId=" + this.f93610b + ", srcType=" + this.f93611c + ", srcParam=" + this.f93612d + ", extraInfo=" + this.f93613e + ", requestKey=" + this.f93614f + ", genToken=" + this.f93615g + ", jsToken=" + this.f93616h + ", oaId=" + this.f93617i + ", srcOpen=" + this.f93618j + ")";
    }

    public /* synthetic */ C18614c(String str, C18613b c18613b, int i11, String str2, String str3, long j11, boolean z11, String str4, String str5, int i12, int i13, AbstractC19060k abstractC19060k) {
        this(str, c18613b, i11, str2, str3, (i13 & 32) != 0 ? new Random().nextLong() : j11, z11, str4, str5, (i13 & 512) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18614c(String str) {
        this(str, C18613b.f93598q, 0, "", "", new Random().nextLong(), true, "", "", 0, 512, null);
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
    }
}
