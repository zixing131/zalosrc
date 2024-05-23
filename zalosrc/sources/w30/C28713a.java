package w30;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import p363nh.C23744a;

/* renamed from: w30.a */
/* loaded from: classes5.dex */
public final class C28713a {

    /* renamed from: a */
    private final C17945a0 f133205a;

    /* renamed from: b */
    private final String f133206b;

    /* renamed from: c */
    private String f133207c;

    /* renamed from: d */
    private String f133208d;

    /* renamed from: e */
    private C20096c f133209e;

    /* renamed from: f */
    private final String f133210f;

    public C28713a(C17945a0 c17945a0, String str, String str2, String str3, C20096c c20096c) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(str, "text");
        AbstractC19074t.m100208f(str2, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str3, "localPath");
        this.f133205a = c17945a0;
        this.f133206b = str;
        this.f133207c = str2;
        this.f133208d = str3;
        this.f133209e = c20096c;
        String m95061Y3 = c17945a0.m95061Y3();
        AbstractC19074t.m100207e(m95061Y3, "getMessageTypeId(...)");
        this.f133210f = m95061Y3;
    }

    /* renamed from: a */
    public final C20096c m143796a() {
        return this.f133209e;
    }

    /* renamed from: b */
    public final String m143797b() {
        return this.f133210f;
    }

    /* renamed from: c */
    public final String m143798c() {
        return this.f133208d;
    }

    /* renamed from: d */
    public final C17945a0 m143799d() {
        return this.f133205a;
    }

    /* renamed from: e */
    public final String m143800e() {
        return this.f133206b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28713a)) {
            return false;
        }
        C28713a c28713a = (C28713a) obj;
        return AbstractC19074t.m100204b(this.f133205a, c28713a.f133205a) && AbstractC19074t.m100204b(this.f133206b, c28713a.f133206b) && AbstractC19074t.m100204b(this.f133207c, c28713a.f133207c) && AbstractC19074t.m100204b(this.f133208d, c28713a.f133208d) && AbstractC19074t.m100204b(this.f133209e, c28713a.f133209e);
    }

    /* renamed from: f */
    public final String m143801f() {
        return this.f133207c;
    }

    /* renamed from: g */
    public final void m143802g() {
        this.f133205a.m95111d9();
        C23744a.Companion.m124119a().m124116d(6, this.f133205a.m95029V3());
    }

    /* renamed from: h */
    public final void m143803h(C20096c c20096c) {
        this.f133209e = c20096c;
    }

    public int hashCode() {
        int hashCode = ((((((this.f133205a.hashCode() * 31) + this.f133206b.hashCode()) * 31) + this.f133207c.hashCode()) * 31) + this.f133208d.hashCode()) * 31;
        C20096c c20096c = this.f133209e;
        return hashCode + (c20096c == null ? 0 : c20096c.hashCode());
    }

    /* renamed from: i */
    public final void m143804i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f133208d = str;
    }

    /* renamed from: j */
    public final void m143805j(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f133207c = str;
    }

    public String toString() {
        return "TextToSpeechContent(message=" + this.f133205a + ", text=" + this.f133206b + ", url=" + this.f133207c + ", localPath=" + this.f133208d + ", errorMessage=" + this.f133209e + ")";
    }

    public /* synthetic */ C28713a(C17945a0 c17945a0, String str, String str2, String str3, C20096c c20096c, int i11, AbstractC19060k abstractC19060k) {
        this(c17945a0, str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? null : c20096c);
    }
}
