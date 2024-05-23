package p647xj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: xj.f */
/* loaded from: classes3.dex */
public final class C29680f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f137110a;

    /* renamed from: b */
    private boolean f137111b;

    /* renamed from: xj.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29680f(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "data");
        this.f137110a = 300000;
        this.f137110a = jSONObject.optInt("group_break_timeout", 300000);
        this.f137111b = jSONObject.optInt("is_enable", 0) == 1;
    }

    /* renamed from: a */
    public final int m147612a() {
        return this.f137110a;
    }

    /* renamed from: b */
    public final boolean m147613b() {
        return this.f137111b;
    }
}
