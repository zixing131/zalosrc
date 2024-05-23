package bh;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import p461qu.AbstractC25495a;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: bh.b */
/* loaded from: classes3.dex */
public class C2800b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f11213a;

    /* renamed from: b */
    private final int f11214b;

    /* renamed from: c */
    private final String f11215c;

    /* renamed from: d */
    private final String f11216d;

    /* renamed from: e */
    private final b f11217e;

    /* renamed from: f */
    private final int f11218f;

    /* renamed from: g */
    private final byte f11219g;

    /* renamed from: bh.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: bh.b$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f11220p = new b("SHOW", 0);

        /* renamed from: q */
        public static final b f11221q = new b("HIDE", 1);

        /* renamed from: r */
        private static final /* synthetic */ b[] f11222r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f11223s;

        static {
            b[] m13522b = m13522b();
            f11222r = m13522b;
            f11223s = AbstractC30166b.m148796a(m13522b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m13522b() {
            return new b[]{f11220p, f11221q};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f11222r.clone();
        }
    }

    /* renamed from: bh.b$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11224a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f11221q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f11220p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11224a = iArr;
        }
    }

    public C2800b(String str, int i11, String str2, String str3, b bVar) {
        AbstractC19074t.m100208f(str, "queryString");
        AbstractC19074t.m100208f(str3, "messageId");
        AbstractC19074t.m100208f(bVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f11213a = str;
        this.f11214b = i11;
        this.f11215c = str2;
        this.f11216d = str3;
        this.f11217e = bVar;
        if (str2 != null && str2.length() != 0) {
            if (AbstractC25495a.m132079d(str2)) {
                this.f11219g = (byte) 6;
                str2 = AbstractC25495a.m132088m(str2);
            } else {
                this.f11219g = (byte) 3;
            }
            this.f11218f = Integer.parseInt(str2);
            return;
        }
        this.f11218f = 0;
        this.f11219g = (byte) 0;
    }

    /* renamed from: a */
    public final int m13517a() {
        return this.f11218f;
    }

    /* renamed from: b */
    public final byte m13518b() {
        return this.f11219g;
    }

    /* renamed from: c */
    public final int m13519c() {
        return this.f11214b;
    }

    /* renamed from: d */
    public final String m13520d() {
        return this.f11213a;
    }

    /* renamed from: e */
    public final String m13521e() {
        long j11;
        JSONObject jSONObject = new JSONObject();
        int i11 = c.f11224a[this.f11217e.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i12 = 0;
        }
        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, i12);
        try {
            if (this.f11216d.length() == 0) {
                j11 = 0;
            } else {
                j11 = Long.parseLong(this.f11216d);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            j11 = -1;
        }
        jSONObject.put("trackingMsgId", j11);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
