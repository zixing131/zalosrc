package x30;

import android.location.Location;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import vg.AbstractC28207v1;

/* renamed from: x30.i */
/* loaded from: classes5.dex */
public final class C29314i {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static final String f135797d;

    /* renamed from: a */
    private final String f135798a;

    /* renamed from: b */
    private boolean f135799b = true;

    /* renamed from: c */
    private boolean f135800c;

    /* renamed from: x30.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    static {
        String simpleName = C29314i.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f135797d = simpleName;
    }

    public C29314i(String str) {
        this.f135798a = str;
    }

    /* renamed from: a */
    public final String m146456a(Location location) {
        String m141907P0;
        if (location == null) {
            String m141899N0 = AbstractC28207v1.m141899N0(-1, "can not get user location", "action.get.location");
            AbstractC19074t.m100205c(m141899N0);
            return m141899N0;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("longitude", String.valueOf(location.getLongitude()));
            jSONObject.put("latitude", String.valueOf(location.getLatitude()));
            jSONObject.put("timestamp", String.valueOf(System.currentTimeMillis()));
            jSONObject.put("provider", String.valueOf(location.getProvider()));
            m141907P0 = AbstractC28207v1.m141919S0("action.get.location", jSONObject.toString());
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f135797d, e11);
            m141907P0 = AbstractC28207v1.m141907P0("action.get.location");
        }
        AbstractC19074t.m100205c(m141907P0);
        return m141907P0;
    }

    /* renamed from: b */
    public final String m146457b() {
        return this.f135798a;
    }

    /* renamed from: c */
    public final boolean m146458c() {
        return this.f135799b;
    }

    /* renamed from: d */
    public final boolean m146459d() {
        return this.f135800c;
    }

    /* renamed from: e */
    public final void m146460e(boolean z11) {
        this.f135799b = z11;
    }

    /* renamed from: f */
    public final void m146461f(boolean z11) {
        this.f135800c = z11;
    }
}
