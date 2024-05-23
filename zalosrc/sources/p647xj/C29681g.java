package p647xj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: xj.g */
/* loaded from: classes3.dex */
public final class C29681g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f137112a;

    /* renamed from: b */
    private long f137113b;

    /* renamed from: c */
    private int f137114c;

    /* renamed from: d */
    private Set f137115d;

    /* renamed from: xj.g$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29681g(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        this.f137112a = -1;
        this.f137115d = new HashSet();
        this.f137112a = jSONObject.optInt("promoted_cate_id", -1);
        this.f137113b = jSONObject.optLong("last_used_cate_time_out", 0L);
        this.f137114c = jSONObject.optInt("recent_sticker_number", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("last_cate_exceptions");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                this.f137115d.add(Integer.valueOf(optJSONArray.getInt(i11)));
            }
        }
    }

    /* renamed from: a */
    public final long m147614a() {
        return this.f137113b;
    }

    /* renamed from: b */
    public final int m147615b() {
        return this.f137112a;
    }

    /* renamed from: c */
    public final int m147616c() {
        return this.f137114c;
    }

    /* renamed from: d */
    public final boolean m147617d(int i11) {
        return this.f137115d.contains(Integer.valueOf(i11));
    }

    /* renamed from: e */
    public final boolean m147618e() {
        return this.f137113b > 0;
    }
}
