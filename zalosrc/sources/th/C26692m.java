package th;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Set;
import me0.AbstractC23121k5;
import org.json.JSONArray;
import org.json.JSONObject;
import qm0.AbstractC25332a0;

/* renamed from: th.m */
/* loaded from: classes.dex */
public class C26692m {

    /* renamed from: a */
    private final Set f126484a;

    /* renamed from: b */
    private long f126485b;

    /* renamed from: c */
    private float f126486c;

    /* renamed from: d */
    private int f126487d;

    /* renamed from: e */
    private long f126488e;

    /* renamed from: f */
    private int f126489f;

    /* renamed from: g */
    private int f126490g;

    public C26692m(Set set, long j11, float f11, int i11, long j12, int i12, int i13) {
        AbstractC19074t.m100208f(set, "profileH264");
        this.f126484a = set;
        this.f126485b = j11;
        this.f126486c = f11;
        this.f126487d = i11;
        this.f126488e = j12;
        this.f126489f = i12;
        this.f126490g = i13;
    }

    /* renamed from: a */
    public final Set m137160a() {
        return this.f126484a;
    }

    /* renamed from: b */
    public final boolean m137161b(int i11, int i12, int i13, int i14, int i15, int i16, long j11) {
        if (Math.max(i11, i12) <= this.f126490g && i11 * i12 <= this.f126487d && i13 <= this.f126486c && this.f126484a.contains(Integer.valueOf(i15)) && i16 <= this.f126489f && j11 <= this.f126488e && i14 <= this.f126485b) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    protected void m137162c(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsObject");
        int optInt = jSONObject.optInt("areaMax", 921600);
        this.f126487d = optInt;
        this.f126487d = AbstractC23121k5.m118605c(230400, 1166400, optInt);
    }

    /* renamed from: d */
    protected void m137163d(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsObject");
        long optLong = jSONObject.optLong("bitrateMax", 3072000L);
        this.f126485b = optLong;
        this.f126485b = AbstractC23121k5.m118606d(1024000L, 6144000L, optLong);
    }

    /* renamed from: e */
    protected void m137164e(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsObject");
        int optInt = jSONObject.optInt("dimensionMax", 1280);
        this.f126490g = optInt;
        this.f126490g = AbstractC23121k5.m118605c(480, 1920, optInt);
    }

    /* renamed from: f */
    protected void m137165f(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsObject");
        long optLong = jSONObject.optLong("fileSizeMax", 20L);
        this.f126488e = optLong;
        this.f126488e = AbstractC23121k5.m118606d(10L, 100L, optLong);
    }

    /* renamed from: g */
    protected void m137166g(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsObject");
        float optDouble = (float) jSONObject.optDouble("fpsMax", 30.0d);
        this.f126486c = optDouble;
        this.f126486c = AbstractC23121k5.m118604b(15.0f, 60.0f, optDouble);
    }

    /* renamed from: h */
    protected void m137167h(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsObject");
        this.f126484a.clear();
        this.f126484a.add(66);
        this.f126484a.add(Integer.valueOf(ZVideoUtilMetadata.FF_PROFILE_H264_CONSTRAINED_BASELINE));
        if (jSONObject.has("profileH264")) {
            JSONArray jSONArray = jSONObject.getJSONArray("profileH264");
            AbstractC19074t.m100207e(jSONArray, "getJSONArray(...)");
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                this.f126484a.add(Integer.valueOf(jSONArray.optInt(i11, 66)));
            }
        }
    }

    /* renamed from: i */
    protected void m137168i(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsObject");
        this.f126489f = jSONObject.optInt("profileH264LevelMax", 41);
    }

    /* renamed from: j */
    public final void m137169j(int i11) {
        this.f126487d = i11;
    }

    /* renamed from: k */
    public final void m137170k(long j11) {
        this.f126485b = j11;
    }

    /* renamed from: l */
    public final void m137171l(int i11) {
        this.f126490g = i11;
    }

    /* renamed from: m */
    public final void m137172m(long j11) {
        this.f126488e = j11;
    }

    /* renamed from: n */
    public final void m137173n(float f11) {
        this.f126486c = f11;
    }

    /* renamed from: o */
    public final void m137174o(int i11) {
        this.f126489f = i11;
    }

    /* renamed from: p */
    public final void m137175p(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            m137167h(jSONObject);
            m137163d(jSONObject);
            m137166g(jSONObject);
            m137162c(jSONObject);
            m137165f(jSONObject);
            m137168i(jSONObject);
            m137164e(jSONObject);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public /* synthetic */ C26692m(Set set, long j11, float f11, int i11, long j12, int i12, int i13, int i14, AbstractC19060k abstractC19060k) {
        this((i14 & 1) != 0 ? AbstractC25332a0.m131188P0(AbstractC26693n.m137176a()) : set, (i14 & 2) != 0 ? 3072000L : j11, (i14 & 4) != 0 ? 30.0f : f11, (i14 & 8) != 0 ? 921600 : i11, (i14 & 16) != 0 ? 20L : j12, (i14 & 32) != 0 ? 41 : i12, (i14 & 64) != 0 ? 1280 : i13);
    }
}
