package ai;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: ai.b */
/* loaded from: classes3.dex */
public final class C0862b implements InterfaceC0861a {

    /* renamed from: A */
    private String f3163A;

    /* renamed from: B */
    private int f3164B;

    /* renamed from: C */
    private float f3165C;

    /* renamed from: p */
    private final String f3166p;

    /* renamed from: q */
    private final String f3167q;

    /* renamed from: r */
    private final CharSequence f3168r;

    /* renamed from: s */
    private final String f3169s;

    /* renamed from: t */
    private final String f3170t;

    /* renamed from: u */
    private final String[] f3171u;

    /* renamed from: v */
    private final CharSequence f3172v;

    /* renamed from: w */
    private final JSONObject f3173w;

    /* renamed from: x */
    private final String f3174x;

    /* renamed from: y */
    private String f3175y;

    /* renamed from: z */
    private final List f3176z;

    public C0862b(String str, String str2, CharSequence charSequence, String str3, String str4, String[] strArr, CharSequence charSequence2, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(charSequence, "name");
        AbstractC19074t.m100208f(str3, "avtUrl");
        AbstractC19074t.m100208f(str4, "version");
        AbstractC19074t.m100208f(strArr, "featuresImages");
        AbstractC19074t.m100208f(charSequence2, "desc");
        this.f3166p = str;
        this.f3167q = str2;
        this.f3168r = charSequence;
        this.f3169s = str3;
        this.f3170t = str4;
        this.f3171u = strArr;
        this.f3172v = charSequence2;
        this.f3173w = jSONObject;
        this.f3174x = "mp_" + str;
        this.f3175y = charSequence.toString();
        this.f3176z = new ArrayList();
        this.f3163A = "";
        this.f3164B = 4;
    }

    /* renamed from: a */
    public final String m2477a() {
        return this.f3169s;
    }

    @Override // ai.InterfaceC0863c
    /* renamed from: b */
    public String mo2478b() {
        return this.f3174x;
    }

    @Override // ai.InterfaceC0861a
    /* renamed from: c */
    public String mo2475c() {
        return this.f3175y;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: d */
    public float mo2479d() {
        return this.f3165C;
    }

    @Override // ai.InterfaceC0861a
    /* renamed from: e */
    public void mo2476e(String str) {
        AbstractC19074t.m100208f(str, "dpn");
        this.f3175y = str;
    }

    /* renamed from: f */
    public String m2480f() {
        return this.f3163A;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: g */
    public int mo2481g() {
        return this.f3164B;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: h */
    public List mo2482h() {
        return this.f3176z;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: i */
    public void mo2483i(float f11) {
        this.f3165C = f11;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: j */
    public void mo2484j(int i11) {
        this.f3164B = i11;
    }

    /* renamed from: k */
    public final CharSequence m2485k() {
        return this.f3172v;
    }

    /* renamed from: l */
    public final String[] m2486l() {
        return this.f3171u;
    }

    /* renamed from: m */
    public final String m2487m() {
        return this.f3166p;
    }

    /* renamed from: n */
    public final JSONObject m2488n() {
        return this.f3173w;
    }

    /* renamed from: o */
    public final CharSequence m2489o() {
        return this.f3168r;
    }

    /* renamed from: p */
    public final String m2490p() {
        return this.f3167q;
    }

    /* renamed from: q */
    public final String m2491q() {
        return this.f3170t;
    }
}
