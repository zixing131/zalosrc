package d30;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: d30.i */
/* loaded from: classes5.dex */
public final class C17729i {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f89862a;

    /* renamed from: b */
    private final int f89863b;

    /* renamed from: c */
    private final Map f89864c;

    /* renamed from: d30.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C17729i(int i11, int i12, Map map) {
        AbstractC19074t.m100208f(map, "metrics");
        this.f89862a = i11;
        this.f89863b = i12;
        this.f89864c = map;
    }

    /* renamed from: a */
    public final Map m93844a() {
        return this.f89864c;
    }

    /* renamed from: b */
    public final int m93845b() {
        return this.f89863b;
    }

    /* renamed from: c */
    public final int m93846c() {
        return this.f89862a;
    }

    /* renamed from: d */
    public final JSONObject m93847d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("numReconStickers", m93846c());
        jSONObject.put("numBenchmarkStickers", m93845b());
        for (Map.Entry entry : m93844a().entrySet()) {
            jSONObject.put((String) entry.getKey(), Float.valueOf(((Number) entry.getValue()).floatValue()));
        }
        return jSONObject;
    }

    public C17729i() {
        this(0, 0, new HashMap());
    }
}
