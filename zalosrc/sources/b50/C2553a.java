package b50;

import am.AbstractC0924m0;
import org.json.JSONObject;

/* renamed from: b50.a */
/* loaded from: classes5.dex */
public class C2553a {

    /* renamed from: a */
    private final int f10452a;

    /* renamed from: b */
    private final long f10453b;

    /* renamed from: c */
    private final int f10454c;

    /* renamed from: d */
    private final long f10455d;

    /* renamed from: e */
    private final int f10456e;

    /* renamed from: f */
    private final b f10457f;

    /* renamed from: g */
    private final a f10458g;

    /* renamed from: b50.a$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        private final int f10459a;

        public a(int i11) {
            this.f10459a = i11;
        }

        /* renamed from: a */
        public boolean m12947a() {
            return this.f10459a == 1;
        }
    }

    /* renamed from: b50.a$b */
    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a */
        private final int f10460a;

        /* renamed from: b */
        private final int f10461b;

        /* renamed from: c */
        private final long f10462c;

        public b(int i11, int i12, long j11) {
            this.f10460a = i11;
            this.f10461b = i12;
            this.f10462c = j11;
        }

        /* renamed from: c */
        public static int m12948c() {
            return AbstractC0924m0.m3130I6();
        }

        /* renamed from: d */
        public static long m12949d() {
            return AbstractC0924m0.m3391R6();
        }

        /* renamed from: f */
        public static void m12950f(int i11) {
            AbstractC0924m0.m4299vp(i11);
        }

        /* renamed from: g */
        public static void m12951g(long j11) {
            AbstractC0924m0.m3033Ep(j11);
        }

        /* renamed from: a */
        public int m12952a() {
            return this.f10461b;
        }

        /* renamed from: b */
        public long m12953b() {
            return this.f10462c;
        }

        /* renamed from: e */
        public int m12954e() {
            return this.f10460a;
        }
    }

    public C2553a() {
        this.f10452a = 0;
        this.f10453b = 604800L;
        this.f10454c = 1;
        this.f10455d = 0L;
        this.f10456e = 0;
        this.f10457f = new b(1, 3, 259200L);
        this.f10458g = new a(1);
    }

    /* renamed from: a */
    public static C2553a m12938a(JSONObject jSONObject) {
        return new C2553a(jSONObject.optInt("on_remind_set_dbpw", 0), jSONObject.optLong("short_time", 604800L), jSONObject.optInt("short_time_count", 1), jSONObject.optLong("long_time", 0L), jSONObject.optInt("long_time_count", 0), jSONObject.optInt("show_icon_count", 3), jSONObject.optInt("icon_type", 1), jSONObject.optLong("show_icon_interval", 259200L), jSONObject.optInt("cancel_button", 1));
    }

    /* renamed from: b */
    public long m12939b() {
        return this.f10455d;
    }

    /* renamed from: c */
    public int m12940c() {
        return this.f10456e;
    }

    /* renamed from: d */
    public long m12941d() {
        return this.f10453b;
    }

    /* renamed from: e */
    public int m12942e() {
        return this.f10454c;
    }

    /* renamed from: f */
    public a m12943f() {
        return this.f10458g;
    }

    /* renamed from: g */
    public b m12944g() {
        return this.f10457f;
    }

    /* renamed from: h */
    public boolean m12945h() {
        return this.f10452a == 1;
    }

    /* renamed from: i */
    public boolean m12946i() {
        return true;
    }

    public C2553a(int i11, long j11, int i12, long j12, int i13, int i14, int i15, long j13, int i16) {
        this.f10452a = i11;
        this.f10453b = j11;
        this.f10454c = i12;
        this.f10455d = j12;
        this.f10456e = i13;
        this.f10457f = new b(i15, i14, j13);
        this.f10458g = new a(i16);
    }
}
