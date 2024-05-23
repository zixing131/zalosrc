package p418p8;

import org.json.JSONObject;
import p232i8.InterfaceC20415r;
import p418p8.C24668d;

/* renamed from: p8.l */
/* loaded from: classes.dex */
class C24676l implements InterfaceC24672h {
    /* renamed from: b */
    private static C24668d.a m128232b(JSONObject jSONObject) {
        return new C24668d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    /* renamed from: c */
    private static C24668d.b m128233c(JSONObject jSONObject) {
        return new C24668d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: d */
    private static long m128234d(InterfaceC20415r interfaceC20415r, long j11, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return interfaceC20415r.mo106354a() + (j11 * 1000);
    }

    @Override // p418p8.InterfaceC24672h
    /* renamed from: a */
    public C24668d mo128201a(InterfaceC20415r interfaceC20415r, JSONObject jSONObject) {
        C24668d.b m128233c;
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt3 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            m128233c = m128233c(jSONObject.getJSONObject("session"));
        } else {
            m128233c = m128233c(new JSONObject());
        }
        return new C24668d(m128234d(interfaceC20415r, optInt2, jSONObject), m128233c, m128232b(jSONObject.getJSONObject("features")), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
