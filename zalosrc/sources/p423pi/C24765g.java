package p423pi;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: pi.g */
/* loaded from: classes3.dex */
public final class C24765g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f118949a;

    /* renamed from: b */
    private double f118950b;

    /* renamed from: pi.g$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C24765g(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        Long valueOf = Long.valueOf(jSONObject.optLong("seen_time", 60L));
        valueOf = valueOf.longValue() <= 0 ? null : valueOf;
        this.f118949a = (valueOf != null ? valueOf.longValue() : 60L) * 1000;
        Double valueOf2 = Double.valueOf(jSONObject.optDouble("seen_ratio", 0.3d));
        Double d11 = valueOf2.doubleValue() > 0.0d ? valueOf2 : null;
        this.f118950b = d11 != null ? d11.doubleValue() : 0.3d;
    }

    /* renamed from: a */
    public final long m128731a() {
        return this.f118949a;
    }

    /* renamed from: b */
    public final double m128732b() {
        return this.f118950b;
    }

    public C24765g(long j11, double d11) {
        this.f118949a = j11;
        this.f118950b = d11;
    }
}
