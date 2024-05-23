package d30;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: d30.g */
/* loaded from: classes5.dex */
public final class C17727g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final float f89855a;

    /* renamed from: b */
    private final int f89856b;

    /* renamed from: c */
    private final int f89857c;

    /* renamed from: d */
    private final C17729i f89858d;

    /* renamed from: d30.g$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C17727g(float f11, int i11, int i12, C17729i c17729i) {
        AbstractC19074t.m100208f(c17729i, "validInfo");
        this.f89855a = f11;
        this.f89856b = i11;
        this.f89857c = i12;
        this.f89858d = c17729i;
    }

    /* renamed from: a */
    public final int m93836a() {
        return this.f89857c;
    }

    /* renamed from: b */
    public final int m93837b() {
        return this.f89856b;
    }

    /* renamed from: c */
    public final float m93838c() {
        return this.f89855a;
    }

    /* renamed from: d */
    public final C17729i m93839d() {
        return this.f89858d;
    }

    /* renamed from: e */
    public final JSONObject m93840e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trainLoss", Float.valueOf(m93838c()));
        jSONObject.put("gradRowCount", m93837b());
        jSONObject.put("gradColCount", m93836a());
        jSONObject.put("validResult", m93839d().m93847d());
        return jSONObject;
    }

    public C17727g() {
        this(0.0f, 0, 0, new C17729i());
    }
}
