package kw;

import ac.C0708i;
import ac.C0732w;
import b90.EnumC2667d;
import com.zing.zalo.data.zalocloud.model.CloudQuotaUsage;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k30.C21459a;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p620wt.AbstractC29231f;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: kw.b */
/* loaded from: classes4.dex */
public final class C21956b {

    /* renamed from: a */
    public static final C21956b f108071a = new C21956b();

    /* renamed from: b */
    private static final Map f108072b = new ConcurrentHashMap();

    /* renamed from: kw.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends Enum {

        /* renamed from: q */
        public static final a f108073q = new a("TAB_ME", 0, "tabme");

        /* renamed from: r */
        public static final a f108074r = new a("CSC", 1, "csc");

        /* renamed from: s */
        public static final a f108075s = new a("RIGHT_MENU", 2, "right_menu");

        /* renamed from: t */
        public static final a f108076t = new a("MY_CLOUD_CLEANER", 3, "mycloud_cleaner");

        /* renamed from: u */
        private static final /* synthetic */ a[] f108077u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f108078v;

        /* renamed from: p */
        private final String f108079p;

        static {
            a[] m114664b = m114664b();
            f108077u = m114664b;
            f108078v = AbstractC30166b.m148796a(m114664b);
        }

        private a(String str, int i11, String str2) {
            super(str, i11);
            this.f108079p = str2;
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m114664b() {
            return new a[]{f108073q, f108074r, f108075s, f108076t};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f108077u.clone();
        }

        /* renamed from: c */
        public final String m114665c() {
            return this.f108079p;
        }
    }

    /* renamed from: kw.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends Enum {

        /* renamed from: q */
        public static final b f108080q = new b("HALF_WAY_BANNER", 0, "yellow");

        /* renamed from: r */
        public static final b f108081r = new b("ALMOST_FULL_BANNER", 1, "red");

        /* renamed from: s */
        public static final b f108082s = new b("FULL_BANNER", 2, "full");

        /* renamed from: t */
        public static final b f108083t = new b("ABUSE_BANNER", 3, "abuse");

        /* renamed from: u */
        public static final b f108084u = new b("CSC_HEADER", 4, "csc_header");

        /* renamed from: v */
        private static final /* synthetic */ b[] f108085v;

        /* renamed from: w */
        private static final /* synthetic */ InterfaceC30165a f108086w;

        /* renamed from: p */
        private final String f108087p;

        static {
            b[] m114666b = m114666b();
            f108085v = m114666b;
            f108086w = AbstractC30166b.m148796a(m114666b);
        }

        private b(String str, int i11, String str2) {
            super(str, i11);
            this.f108087p = str2;
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m114666b() {
            return new b[]{f108080q, f108081r, f108082s, f108083t, f108084u};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f108085v.clone();
        }

        /* renamed from: c */
        public final String m114667c() {
            return this.f108087p;
        }
    }

    /* renamed from: kw.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends Enum {

        /* renamed from: q */
        public static final c f108088q = new c("BIG_FILE", 0, "big_file");

        /* renamed from: r */
        public static final c f108089r = new c("OVER_QUOTA", 1, "over_quota");

        /* renamed from: s */
        private static final /* synthetic */ c[] f108090s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f108091t;

        /* renamed from: p */
        private final String f108092p;

        static {
            c[] m114668b = m114668b();
            f108090s = m114668b;
            f108091t = AbstractC30166b.m148796a(m114668b);
        }

        private c(String str, int i11, String str2) {
            super(str, i11);
            this.f108092p = str2;
        }

        /* renamed from: b */
        private static final /* synthetic */ c[] m114668b() {
            return new c[]{f108088q, f108089r};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f108090s.clone();
        }

        /* renamed from: c */
        public final String m114669c() {
            return this.f108092p;
        }
    }

    /* renamed from: kw.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends Enum {

        /* renamed from: p */
        public static final d f108093p = new d("CORE_FLOW", 0);

        /* renamed from: q */
        public static final d f108094q = new d("SERVER", 1);

        /* renamed from: r */
        public static final d f108095r = new d("DEV", 2);

        /* renamed from: s */
        public static final d f108096s = new d("ERROR", 3);

        /* renamed from: t */
        private static final /* synthetic */ d[] f108097t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f108098u;

        static {
            d[] m114670b = m114670b();
            f108097t = m114670b;
            f108098u = AbstractC30166b.m148796a(m114670b);
        }

        private d(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ d[] m114670b() {
            return new d[]{f108093p, f108094q, f108095r, f108096s};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f108097t.clone();
        }
    }

    /* renamed from: kw.b$e */
    /* loaded from: classes4.dex */
    public static final class e extends Enum {

        /* renamed from: q */
        public static final e f108099q = new e("BECOME_YELLOW", 0, "become_yellow");

        /* renamed from: r */
        public static final e f108100r = new e("BECOME_RED", 1, "become_red");

        /* renamed from: s */
        public static final e f108101s = new e("BECOME_FULL", 2, "become_full");

        /* renamed from: t */
        public static final e f108102t = new e("BECOME_NORMAL", 3, "become_normal");

        /* renamed from: u */
        private static final /* synthetic */ e[] f108103u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f108104v;

        /* renamed from: p */
        private final String f108105p;

        static {
            e[] m114671b = m114671b();
            f108103u = m114671b;
            f108104v = AbstractC30166b.m148796a(m114671b);
        }

        private e(String str, int i11, String str2) {
            super(str, i11);
            this.f108105p = str2;
        }

        /* renamed from: b */
        private static final /* synthetic */ e[] m114671b() {
            return new e[]{f108099q, f108100r, f108101s, f108102t};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f108103u.clone();
        }

        /* renamed from: c */
        public final String m114672c() {
            return this.f108105p;
        }
    }

    /* renamed from: kw.b$f */
    /* loaded from: classes4.dex */
    public /* synthetic */ class f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f108106a;

        static {
            int[] iArr = new int[EnumC2667d.values().length];
            try {
                iArr[EnumC2667d.f10678t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2667d.f10679u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2667d.f10680v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f108106a = iArr;
        }
    }

    private C21956b() {
    }

    /* renamed from: a */
    private final long m114651a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public static final void m114652b(Exception exc) {
        AbstractC19074t.m100208f(exc, "exception");
        m114653c("SMLMyCloud", exc);
    }

    /* renamed from: c */
    public static final void m114653c(String str, Exception exc) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(exc, "exception");
        AbstractC23350e.m122776f(str, exc);
    }

    /* renamed from: d */
    public static final void m114654d(String str, String str2, d dVar) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        AbstractC19074t.m100208f(dVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC20110a.f98889a.m104564x(str).mo104556o(8, "[" + AbstractC23160o0.m119279p0(f108071a.m114651a()) + "] " + str2, new Object[0]);
    }

    /* renamed from: e */
    public static final void m114655e(String str, d dVar) {
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(dVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        m114656f("SMLMyCloud", str, null, 4, null);
    }

    /* renamed from: f */
    public static /* synthetic */ void m114656f(String str, String str2, d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            dVar = d.f108095r;
        }
        m114654d(str, str2, dVar);
    }

    /* renamed from: g */
    public static final void m114657g(String str, String str2) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
    }

    /* renamed from: h */
    public static final void m114658h(int i11, int i12, long j11, long j12, long j13) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", i12);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        AbstractC20887g.m109243u(i11, jSONObject2, j11, j12, j13);
    }

    /* renamed from: i */
    public static /* synthetic */ void m114659i(int i11, int i12, long j11, long j12, long j13, int i13, Object obj) {
        long j14;
        long j15;
        long j16;
        if ((i13 & 4) != 0) {
            j14 = System.currentTimeMillis();
        } else {
            j14 = j11;
        }
        if ((i13 & 8) != 0) {
            j15 = System.currentTimeMillis();
        } else {
            j15 = j12;
        }
        if ((i13 & 16) != 0) {
            j16 = 0;
        } else {
            j16 = j13;
        }
        m114658h(i11, i12, j14, j15, j16);
    }

    /* renamed from: j */
    public static final void m114660j(ThreadStorageInfo threadStorageInfo) {
        AbstractC19074t.m100208f(threadStorageInfo, "thread");
        try {
            long m74776N = threadStorageInfo.m74776N();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deleted_total_size", C21459a.m111035c(m74776N));
            AbstractC29231f.m145989g(jSONObject, "a_num", threadStorageInfo.m74811p());
            AbstractC29231f.m145987e(jSONObject, "a_size", C21459a.m111035c(threadStorageInfo.m74773J()));
            AbstractC29231f.m145989g(jSONObject, "p_num", threadStorageInfo.m74809o());
            AbstractC29231f.m145987e(jSONObject, "p_size", C21459a.m111035c(threadStorageInfo.m74772I()));
            AbstractC29231f.m145989g(jSONObject, "v_num", threadStorageInfo.m74780S());
            AbstractC29231f.m145987e(jSONObject, "v_size", C21459a.m111035c(threadStorageInfo.m74781T()));
            AbstractC29231f.m145989g(jSONObject, "f_num", threadStorageInfo.m74813q());
            AbstractC29231f.m145987e(jSONObject, "f_size", C21459a.m111035c(threadStorageInfo.m74816t()));
            AbstractC29231f.m145989g(jSONObject, "o_num", threadStorageInfo.m74820x());
            AbstractC29231f.m145987e(jSONObject, "o_size", C21459a.m111035c(threadStorageInfo.m74821y()));
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1075f("source", a.f108076t.m114665c());
            C0732w.m1177r(m1189a, "mycloud_delete", null, c0708i, cVar, 2, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLMyCloud", e11);
        }
    }

    /* renamed from: k */
    public static final void m114661k(EnumC2667d enumC2667d, a aVar) {
        e eVar;
        AbstractC19074t.m100208f(enumC2667d, "cloudQuotaState");
        AbstractC19074t.m100208f(aVar, "source");
        if (!enumC2667d.m13112m()) {
            return;
        }
        Map map = f108072b;
        EnumC2667d enumC2667d2 = (EnumC2667d) map.get(aVar.m114665c());
        if (enumC2667d2 == null || enumC2667d2 != enumC2667d) {
            map.put(aVar.m114665c(), enumC2667d);
            try {
                double m111035c = C21459a.m111035c(enumC2667d.m13107e());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mycloud_size", m111035c);
                int i11 = f.f108106a[enumC2667d.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            eVar = e.f108102t;
                        } else {
                            eVar = e.f108101s;
                        }
                    } else {
                        eVar = e.f108100r;
                    }
                } else {
                    eVar = e.f108099q;
                }
                C0708i c0708i = new C0708i();
                c0708i.m1075f("warning", eVar.m114672c());
                c0708i.m1075f("source", aVar.m114665c());
                C0732w.c cVar = new C0732w.c();
                String jSONObject2 = jSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                cVar.m1192b(jSONObject2);
                C0732w.m1177r(C0732w.Companion.m1189a(), "mycloud_warning_status", null, c0708i, cVar, 2, null);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SMLMyCloud", e11);
            }
        }
    }

    /* renamed from: l */
    public static final void m114662l(c cVar, int i11) {
        AbstractC19074t.m100208f(cVar, "tipType");
        try {
            C0708i c0708i = new C0708i();
            c0708i.m1075f("tip_type", cVar.m114669c());
            c0708i.m1072c("msg_type", i11);
            C0732w.m1177r(C0732w.Companion.m1189a(), "mycloud_tip", null, c0708i, null, 10, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLMyCloud", e11);
        }
    }

    /* renamed from: m */
    public static final void m114663m(long j11, CloudQuotaUsage cloudQuotaUsage) {
        AbstractC19074t.m100208f(cloudQuotaUsage, "quotaUsage");
        if (!cloudQuotaUsage.m41236l()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time_load", j11);
            jSONObject.put("used_photo", C21459a.m111035c(cloudQuotaUsage.m41230f()));
            jSONObject.put("used_file", C21459a.m111035c(cloudQuotaUsage.m41228d()));
            jSONObject.put("used_video", C21459a.m111035c(cloudQuotaUsage.m41233i()));
            jSONObject.put("used_other", C21459a.m111035c(cloudQuotaUsage.m41229e()));
            C0708i c0708i = new C0708i();
            c0708i.m1072c("zcloud_plan", 0);
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            C0732w.m1177r(C0732w.Companion.m1189a(), "mycloud_storage_detail", null, c0708i, cVar, 2, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLMyCloud", e11);
        }
    }
}
