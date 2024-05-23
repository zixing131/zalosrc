package p625wy;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: wy.b */
/* loaded from: classes4.dex */
public final class C29269b implements InterfaceC29270c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f135661a;

    /* renamed from: b */
    private final b f135662b;

    /* renamed from: c */
    private final b f135663c;

    /* renamed from: wy.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C29269b m146271a(JSONObject jSONObject) {
            b bVar;
            AbstractC19074t.m100208f(jSONObject, "jsonObj");
            String optString = jSONObject.optString("content");
            AbstractC19074t.m100207e(optString, "optString(...)");
            JSONObject optJSONObject = jSONObject.optJSONObject("front_photo");
            b bVar2 = null;
            if (optJSONObject != null) {
                bVar = b.Companion.m146273a(optJSONObject);
            } else {
                bVar = null;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("back_photo");
            if (optJSONObject2 != null) {
                bVar2 = b.Companion.m146273a(optJSONObject2);
            }
            return new C29269b(optString, bVar, bVar2);
        }
    }

    /* renamed from: wy.b$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final String f135664a;

        /* renamed from: wy.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m146273a(JSONObject jSONObject) {
                AbstractC19074t.m100208f(jSONObject, "jsonObj");
                String optString = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100207e(optString, "optString(...)");
                return new b(optString);
            }
        }

        public b(String str) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            this.f135664a = str;
        }

        /* renamed from: a */
        public final String m146272a() {
            return this.f135664a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f135664a, ((b) obj).f135664a);
        }

        public int hashCode() {
            return this.f135664a.hashCode();
        }

        public String toString() {
            return "PhotoInfo(url=" + this.f135664a + ")";
        }
    }

    public C29269b(String str, b bVar, b bVar2) {
        AbstractC19074t.m100208f(str, "content");
        this.f135661a = str;
        this.f135662b = bVar;
        this.f135663c = bVar2;
    }

    /* renamed from: a */
    public final b m146267a() {
        return this.f135663c;
    }

    /* renamed from: b */
    public final String m146268b() {
        return this.f135661a;
    }

    /* renamed from: c */
    public final b m146269c() {
        return this.f135662b;
    }

    /* renamed from: d */
    public final boolean m146270d() {
        if (this.f135661a.length() > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29269b)) {
            return false;
        }
        C29269b c29269b = (C29269b) obj;
        return AbstractC19074t.m100204b(this.f135661a, c29269b.f135661a) && AbstractC19074t.m100204b(this.f135662b, c29269b.f135662b) && AbstractC19074t.m100204b(this.f135663c, c29269b.f135663c);
    }

    public int hashCode() {
        int hashCode = this.f135661a.hashCode() * 31;
        b bVar = this.f135662b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f135663c;
        return hashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    public String toString() {
        return "PersonalIdentity(content=" + this.f135661a + ", frontPhoto=" + this.f135662b + ", backPhoto=" + this.f135663c + ")";
    }
}
