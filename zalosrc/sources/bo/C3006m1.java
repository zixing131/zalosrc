package bo;

import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import org.json.JSONObject;

/* renamed from: bo.m1 */
/* loaded from: classes4.dex */
public final class C3006m1 {

    /* renamed from: a */
    private int f11972a;

    /* renamed from: b */
    private long f11973b;

    /* renamed from: c */
    private String f11974c;

    /* renamed from: d */
    private String f11975d;

    public C3006m1() {
        this.f11972a = -1;
        this.f11973b = -1L;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_profile_notify_feature_enable);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        this.f11974c = m118743r0;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_change_setting);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        this.f11975d = m118743r02;
    }

    /* renamed from: a */
    private final void m14410a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("value")) {
                this.f11972a = jSONObject.optInt("value");
            }
            if (jSONObject.has("ts")) {
                this.f11973b = jSONObject.optLong("ts");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public final String m14411b() {
        return this.f11975d;
    }

    /* renamed from: c */
    public final String m14412c() {
        return this.f11974c;
    }

    /* renamed from: d */
    public final long m14413d() {
        return this.f11973b;
    }

    /* renamed from: e */
    public final int m14414e() {
        return this.f11972a;
    }

    /* renamed from: f */
    public final void m14415f(long j11) {
        this.f11973b = j11;
    }

    /* renamed from: g */
    public final void m14416g(int i11) {
        this.f11972a = i11;
    }

    /* renamed from: h */
    public final JSONObject m14417h() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("value", this.f11972a);
        jSONObject.put("ts", this.f11973b);
        return jSONObject;
    }

    public C3006m1(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f11972a = -1;
        this.f11973b = -1L;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_profile_notify_feature_enable);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        this.f11974c = m118743r0;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_change_setting);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        this.f11975d = m118743r02;
        m14410a(jSONObject);
    }
}
