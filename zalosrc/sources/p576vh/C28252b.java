package p576vh;

import com.zing.zalo.config.VideoNativeCompressConfig;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import ln0.AbstractC22543l;
import org.json.JSONObject;
import th.C26692m;

/* renamed from: vh.b */
/* loaded from: classes.dex */
public class C28252b {

    /* renamed from: a */
    private float f131733a = 2.0f;

    /* renamed from: b */
    private int f131734b = 15;

    /* renamed from: c */
    private int f131735c = 30;

    /* renamed from: d */
    private int f131736d = 100;

    /* renamed from: e */
    private int f131737e = 20;

    /* renamed from: f */
    private int f131738f = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;

    /* renamed from: g */
    private C26692m f131739g = new C26692m(null, 0, 0.0f, 0, 0, 0, 0, 127, null);

    /* renamed from: h */
    private boolean f131740h = true;

    /* renamed from: i */
    private VideoNativeCompressConfig f131741i = new VideoNativeCompressConfig(null, null, null, null, null, null, 63, null);

    /* renamed from: j */
    private int f131742j = 3;

    /* renamed from: k */
    private int f131743k = 30;

    /* renamed from: l */
    private int f131744l = 3;

    /* renamed from: a */
    public C26692m mo142238a() {
        return this.f131739g;
    }

    /* renamed from: b */
    public float mo142239b() {
        return this.f131733a;
    }

    /* renamed from: c */
    public VideoNativeCompressConfig mo142240c() {
        return this.f131741i;
    }

    /* renamed from: d */
    public boolean mo142241d() {
        return this.f131740h;
    }

    /* renamed from: e */
    public int mo142242e() {
        return this.f131737e;
    }

    /* renamed from: f */
    public int mo142243f() {
        return this.f131738f;
    }

    /* renamed from: g */
    public int mo142244g() {
        return this.f131743k;
    }

    /* renamed from: h */
    public int mo142245h() {
        return this.f131736d;
    }

    /* renamed from: i */
    public int mo142246i() {
        return this.f131744l;
    }

    /* renamed from: j */
    public int mo142247j() {
        return this.f131735c;
    }

    /* renamed from: k */
    public int mo142248k() {
        return this.f131742j;
    }

    /* renamed from: l */
    public int mo142249l() {
        return this.f131734b;
    }

    /* renamed from: m */
    public void mo142260m(JSONObject jSONObject) {
        double m116586i;
        int m104529e;
        int m104529e2;
        int m116588k;
        int m104529e3;
        int m104529e4;
        int m116588k2;
        int m104529e5;
        int m104529e6;
        int m116588k3;
        int m104529e7;
        int m104529e8;
        int m116588k4;
        int m104529e9;
        int m104529e10;
        int m116588k5;
        AbstractC19074t.m100208f(jSONObject, "jsonObj");
        m116586i = AbstractC22543l.m116586i(jSONObject.optDouble("h264_level", 2.0d), 1.0d, 6.0d);
        mo142250o((float) m116586i);
        int optInt = jSONObject.optInt("recordVideoMaxDuration", 15);
        m104529e = AbstractC20104d.m104529e(4.5f);
        m104529e2 = AbstractC20104d.m104529e(150.0f);
        m116588k = AbstractC22543l.m116588k(optInt, m104529e, m104529e2);
        mo142259x(m116588k);
        int optInt2 = jSONObject.optInt("recordVideoFreehandMaxDuration", 30);
        m104529e3 = AbstractC20104d.m104529e(9.0f);
        m104529e4 = AbstractC20104d.m104529e(300.0f);
        m116588k2 = AbstractC22543l.m116588k(optInt2, m104529e3, m104529e4);
        mo142257v(m116588k2);
        int optInt3 = jSONObject.optInt("pickedVideoMaxSize", 100);
        m104529e5 = AbstractC20104d.m104529e(20.0f);
        m104529e6 = AbstractC20104d.m104529e(500.0f);
        m116588k3 = AbstractC22543l.m116588k(optInt3, m104529e5, m104529e6);
        mo142255t(m116588k3);
        int optInt4 = jSONObject.optInt("outputVideoMaxSize", 20);
        m104529e7 = AbstractC20104d.m104529e(4.0f);
        m104529e8 = AbstractC20104d.m104529e(100.0f);
        m116588k4 = AbstractC22543l.m116588k(optInt4, m104529e7, m104529e8);
        mo142252q(m116588k4);
        int optInt5 = jSONObject.optInt("pickedVideoBigMaxSize", ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        m104529e9 = AbstractC20104d.m104529e(100.0f);
        m104529e10 = AbstractC20104d.m104529e(2500.0f);
        m116588k5 = AbstractC22543l.m116588k(optInt5, m104529e9, m104529e10);
        mo142253r(m116588k5);
        mo142258w(jSONObject.optInt("recordVideoFreehandMinDuration", 3));
        mo142254s(jSONObject.optInt("pickedVideoMaxDuration", 30));
        mo142256u(jSONObject.optInt("pickedVideoMinDuration", 3));
        boolean z11 = true;
        if (jSONObject.optInt("nativeCompress", 1) != 1) {
            z11 = false;
        }
        mo142251p(z11);
        mo142261n(jSONObject);
    }

    /* renamed from: n */
    public void mo142261n(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObj");
        mo142238a().m137175p(jSONObject.optJSONObject("compress_config"));
        mo142240c().m40342q(jSONObject.optJSONObject("nativeCompressConfig"));
    }

    /* renamed from: o */
    protected void mo142250o(float f11) {
        this.f131733a = f11;
    }

    /* renamed from: p */
    protected void mo142251p(boolean z11) {
        this.f131740h = z11;
    }

    /* renamed from: q */
    protected void mo142252q(int i11) {
        this.f131737e = i11;
    }

    /* renamed from: r */
    protected void mo142253r(int i11) {
        this.f131738f = i11;
    }

    /* renamed from: s */
    protected void mo142254s(int i11) {
        this.f131743k = i11;
    }

    /* renamed from: t */
    protected void mo142255t(int i11) {
        this.f131736d = i11;
    }

    /* renamed from: u */
    protected void mo142256u(int i11) {
        this.f131744l = i11;
    }

    /* renamed from: v */
    protected void mo142257v(int i11) {
        this.f131735c = i11;
    }

    /* renamed from: w */
    protected void mo142258w(int i11) {
        this.f131742j = i11;
    }

    /* renamed from: x */
    protected void mo142259x(int i11) {
        this.f131734b = i11;
    }
}
