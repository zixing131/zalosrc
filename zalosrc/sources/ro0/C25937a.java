package ro0;

import android.graphics.Bitmap;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: ro0.a */
/* loaded from: classes7.dex */
public final class C25937a {

    /* renamed from: f */
    public static final a f123669f = new a(null);

    /* renamed from: a */
    private final String f123670a;

    /* renamed from: b */
    private final b f123671b;

    /* renamed from: c */
    private long f123672c;

    /* renamed from: d */
    private long f123673d;

    /* renamed from: e */
    private Bitmap f123674e;

    /* renamed from: ro0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ro0.a$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f123675p = new b("Event", 0);

        /* renamed from: q */
        public static final b f123676q = new b("Brand", 1);

        /* renamed from: r */
        private static final /* synthetic */ b[] f123677r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f123678s;

        static {
            b[] m133644b = m133644b();
            f123677r = m133644b;
            f123678s = AbstractC30166b.m148796a(m133644b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m133644b() {
            return new b[]{f123675p, f123676q};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f123677r.clone();
        }
    }

    public C25937a(String str, b bVar, long j11, long j12, Bitmap bitmap) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(bVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f123670a = str;
        this.f123671b = bVar;
        this.f123672c = j11;
        this.f123673d = j12;
        this.f123674e = bitmap;
    }

    /* renamed from: a */
    public final long m133636a() {
        return this.f123673d;
    }

    /* renamed from: b */
    public final Bitmap m133637b() {
        return this.f123674e;
    }

    /* renamed from: c */
    public final long m133638c() {
        return this.f123672c;
    }

    /* renamed from: d */
    public final String m133639d() {
        return this.f123670a;
    }

    /* renamed from: e */
    public final void m133640e(long j11) {
        this.f123673d = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25937a)) {
            return false;
        }
        C25937a c25937a = (C25937a) obj;
        return AbstractC19074t.m100204b(this.f123670a, c25937a.f123670a) && this.f123671b == c25937a.f123671b && this.f123672c == c25937a.f123672c && this.f123673d == c25937a.f123673d && AbstractC19074t.m100204b(this.f123674e, c25937a.f123674e);
    }

    /* renamed from: f */
    public final void m133641f(Bitmap bitmap) {
        this.f123674e = bitmap;
    }

    /* renamed from: g */
    public final void m133642g(long j11) {
        this.f123672c = j11;
    }

    /* renamed from: h */
    public final JSONObject m133643h() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bg", this.f123670a);
        jSONObject.put("start_ts", this.f123672c);
        jSONObject.put("end_ts", this.f123673d);
        return jSONObject;
    }

    public int hashCode() {
        int hashCode = ((((((this.f123670a.hashCode() * 31) + this.f123671b.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f123672c)) * 31) + AbstractC2147g0.m11521a(this.f123673d)) * 31;
        Bitmap bitmap = this.f123674e;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public String toString() {
        return "CallBackground(url=" + this.f123670a + ", type=" + this.f123671b + ", startTime=" + this.f123672c + ", endTime=" + this.f123673d + ", imgBitmap=" + this.f123674e + ")";
    }

    public /* synthetic */ C25937a(String str, b bVar, long j11, long j12, Bitmap bitmap, int i11, AbstractC19060k abstractC19060k) {
        this(str, bVar, j11, j12, (i11 & 16) != 0 ? null : bitmap);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C25937a(JSONObject jSONObject, b bVar) {
        this(r2, bVar, jSONObject.optLong("start_ts"), jSONObject.optLong("end_ts"), null, 16, null);
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        AbstractC19074t.m100208f(bVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        String optString = jSONObject.optString("bg");
        AbstractC19074t.m100207e(optString, "optString(...)");
    }
}
