package p056cj;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: cj.s */
/* loaded from: classes3.dex */
public final class C3551s extends AbstractC3552t {

    /* renamed from: a */
    private final String f14997a;

    /* renamed from: b */
    private final String f14998b;

    /* renamed from: c */
    private final String f14999c;

    /* renamed from: d */
    private final String f15000d;

    /* renamed from: e */
    private final String f15001e;

    /* renamed from: f */
    private final String f15002f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3551s(String str, String str2, String str3, String str4, String str5, String str6) {
        super(null);
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
        AbstractC19074t.m100208f(str3, "src");
        AbstractC19074t.m100208f(str4, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str5, "thumbUrl");
        AbstractC19074t.m100208f(str6, "actionRecommened");
        this.f14997a = str;
        this.f14998b = str2;
        this.f14999c = str3;
        this.f15000d = str4;
        this.f15001e = str5;
        this.f15002f = str6;
    }

    /* renamed from: a */
    public final String m18046a() {
        return this.f15002f;
    }

    /* renamed from: b */
    public final String m18047b() {
        return this.f14999c;
    }

    /* renamed from: c */
    public final String m18048c() {
        return this.f14998b;
    }

    /* renamed from: d */
    public final String m18049d() {
        return this.f15001e;
    }

    /* renamed from: e */
    public final String m18050e() {
        return this.f14997a;
    }

    /* renamed from: f */
    public final String m18051f() {
        return this.f15000d;
    }

    public /* synthetic */ C3551s(String str, String str2, String str3, String str4, String str5, String str6, int i11, AbstractC19060k abstractC19060k) {
        this(str, str2, str3, str4, str5, (i11 & 32) != 0 ? "recommened.link" : str6);
    }
}
