package p548ui;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: ui.b */
/* loaded from: classes3.dex */
public final class C27272b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final boolean f128303a;

    /* renamed from: b */
    private final String f128304b;

    /* renamed from: c */
    private final int f128305c;

    /* renamed from: ui.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C27272b m139627a(JSONObject jSONObject) {
            boolean z11 = false;
            if (jSONObject == null) {
                return new C27272b(false, "", 30);
            }
            if (jSONObject.optInt("cnt") == 1) {
                z11 = true;
            }
            String optString = jSONObject.optString("ulda");
            int optInt = jSONObject.optInt("rtrper");
            AbstractC19074t.m100205c(optString);
            return new C27272b(z11, optString, optInt);
        }
    }

    public C27272b(boolean z11, String str, int i11) {
        AbstractC19074t.m100208f(str, "uploadUrl");
        this.f128303a = z11;
        this.f128304b = str;
        this.f128305c = i11;
    }

    /* renamed from: a */
    public final boolean m139624a() {
        return this.f128303a;
    }

    /* renamed from: b */
    public final int m139625b() {
        return this.f128305c;
    }

    /* renamed from: c */
    public final String m139626c() {
        return this.f128304b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27272b)) {
            return false;
        }
        C27272b c27272b = (C27272b) obj;
        return this.f128303a == c27272b.f128303a && AbstractC19074t.m100204b(this.f128304b, c27272b.f128304b) && this.f128305c == c27272b.f128305c;
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f128303a) * 31) + this.f128304b.hashCode()) * 31) + this.f128305c;
    }

    public String toString() {
        return "BackupDivisionResponse(canUpload=" + this.f128303a + ", uploadUrl=" + this.f128304b + ", delayTime=" + this.f128305c + ")";
    }
}
