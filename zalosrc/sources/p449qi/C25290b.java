package p449qi;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ni.C23794a;
import org.json.JSONObject;
import p263jc.C21219v;

/* renamed from: qi.b */
/* loaded from: classes3.dex */
public final class C25290b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C23794a f121273a;

    /* renamed from: b */
    private final C21219v f121274b;

    /* renamed from: qi.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C25290b(C23794a c23794a, C21219v c21219v) {
        AbstractC19074t.m100208f(c23794a, "autoDownloadRepo");
        AbstractC19074t.m100208f(c21219v, "syncActionMediaController");
        this.f121273a = c23794a;
        this.f121274b = c21219v;
    }

    /* renamed from: a */
    public final void m130865a(String str) {
        AbstractC19074t.m100208f(str, "data");
        this.f121274b.m109950H(new JSONObject(str), false);
    }
}
