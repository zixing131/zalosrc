package p140ev;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: ev.l */
/* loaded from: classes4.dex */
public final class C18623l {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private Boolean f93711a;

    /* renamed from: b */
    private Boolean f93712b;

    /* renamed from: ev.l$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C18623l m98424a(JSONObject jSONObject) {
            boolean z11;
            AbstractC19074t.m100208f(jSONObject, "json");
            C18623l c18623l = new C18623l();
            boolean z12 = false;
            if (jSONObject.getInt("decode") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            c18623l.m98422c(Boolean.valueOf(z11));
            if (jSONObject.getInt("perm") == 1) {
                z12 = true;
            }
            c18623l.m98423d(Boolean.valueOf(z12));
            return c18623l;
        }
    }

    /* renamed from: a */
    public final Boolean m98420a() {
        return this.f93712b;
    }

    /* renamed from: b */
    public final Boolean m98421b() {
        return this.f93711a;
    }

    /* renamed from: c */
    public final void m98422c(Boolean bool) {
        this.f93712b = bool;
    }

    /* renamed from: d */
    public final void m98423d(Boolean bool) {
        this.f93711a = bool;
    }
}
