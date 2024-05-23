package my;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import hm0.C20096c;

/* renamed from: my.k */
/* loaded from: classes4.dex */
public final class C23488k {

    /* renamed from: a */
    private final C20096c f114029a;

    /* renamed from: b */
    private final int f114030b;

    /* renamed from: c */
    private final String f114031c;

    /* renamed from: d */
    private final String f114032d;

    /* renamed from: e */
    private final String f114033e;

    /* renamed from: f */
    private final CharSequence f114034f;

    /* renamed from: g */
    private final String f114035g;

    /* renamed from: h */
    private final long f114036h;

    public C23488k(C20096c c20096c, int i11, String str, String str2, String str3, CharSequence charSequence, String str4, long j11) {
        AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(str2, "title");
        AbstractC19074t.m100208f(str3, "description");
        AbstractC19074t.m100208f(charSequence, "warning");
        AbstractC19074t.m100208f(str4, "cta");
        this.f114029a = c20096c;
        this.f114030b = i11;
        this.f114031c = str;
        this.f114032d = str2;
        this.f114033e = str3;
        this.f114034f = charSequence;
        this.f114035g = str4;
        this.f114036h = j11;
    }

    /* renamed from: a */
    public final String m123280a() {
        return this.f114035g;
    }

    /* renamed from: b */
    public final String m123281b() {
        return this.f114033e;
    }

    /* renamed from: c */
    public final C20096c m123282c() {
        return this.f114029a;
    }

    /* renamed from: d */
    public final int m123283d() {
        return this.f114030b;
    }

    /* renamed from: e */
    public final long m123284e() {
        return this.f114036h;
    }

    /* renamed from: f */
    public final String m123285f() {
        return this.f114032d;
    }

    /* renamed from: g */
    public final CharSequence m123286g() {
        return this.f114034f;
    }
}
