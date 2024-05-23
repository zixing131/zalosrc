package p547uh;

import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import org.json.JSONObject;

/* renamed from: uh.a */
/* loaded from: classes.dex */
public class C27260a {

    /* renamed from: a */
    private int f128188a = 1280;

    /* renamed from: b */
    private int f128189b = 90;

    /* renamed from: c */
    private int f128190c = 90;

    /* renamed from: d */
    private int f128191d = 90;

    /* renamed from: e */
    private float f128192e = 0.25f;

    /* renamed from: f */
    private float f128193f = 4.0f;

    /* renamed from: g */
    private int f128194g = ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;

    /* renamed from: a */
    public int m139531a() {
        return this.f128189b;
    }

    /* renamed from: b */
    public int mo139532b() {
        return this.f128194g;
    }

    /* renamed from: c */
    public int m139533c() {
        return this.f128191d;
    }

    /* renamed from: d */
    public float m139534d() {
        return this.f128193f;
    }

    /* renamed from: e */
    public float m139535e() {
        return this.f128192e;
    }

    /* renamed from: f */
    public int mo139536f() {
        return this.f128188a;
    }

    /* renamed from: g */
    public int m139537g() {
        return this.f128190c;
    }

    /* renamed from: h */
    public void m139538h(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObj");
        m139544n((float) jSONObject.optDouble("panoramo_min_ratio", 0.25d));
        m139543m((float) jSONObject.optDouble("panorama_max_ratio", 4.0d));
        mo139539i(jSONObject);
    }

    /* renamed from: i */
    public void mo139539i(JSONObject jSONObject) {
        int m116588k;
        double m116586i;
        double m116586i2;
        double m116586i3;
        int m116588k2;
        AbstractC19074t.m100208f(jSONObject, "jsonObj");
        m116588k = AbstractC22543l.m116588k(jSONObject.optInt("photoNormalSize", 1280), 640, 2560);
        mo139545o(m116588k);
        double d11 = 100;
        m116586i = AbstractC22543l.m116586i(jSONObject.optDouble("normal_jpeg_quality", 0.9d) * d11, 50.0d, 100.0d);
        m139540j((int) m116586i);
        m116586i2 = AbstractC22543l.m116586i(jSONObject.optDouble("screenshot_jpeg_quality", 0.9d) * d11, 50.0d, 100.0d);
        m139546p((int) m116586i2);
        m116586i3 = AbstractC22543l.m116586i(jSONObject.optDouble("panorama_jpeg_quality", 0.9d) * d11, 50.0d, 100.0d);
        m139542l((int) m116586i3);
        m116588k2 = AbstractC22543l.m116588k(jSONObject.optInt("maxNormalSize", ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE), ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE, 5242880);
        mo139541k(m116588k2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public void m139540j(int i11) {
        this.f128189b = i11;
    }

    /* renamed from: k */
    protected void mo139541k(int i11) {
        this.f128194g = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void m139542l(int i11) {
        this.f128191d = i11;
    }

    /* renamed from: m */
    protected void m139543m(float f11) {
        this.f128193f = f11;
    }

    /* renamed from: n */
    protected void m139544n(float f11) {
        this.f128192e = f11;
    }

    /* renamed from: o */
    protected void mo139545o(int i11) {
        this.f128188a = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void m139546p(int i11) {
        this.f128190c = i11;
    }
}
