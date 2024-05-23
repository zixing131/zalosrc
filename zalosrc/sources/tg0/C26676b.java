package tg0;

import ac.C0708i;
import ac.C0732w;
import ag0.C0815e1;
import am.AbstractC0924m0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.BackupKeySetupView;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.SaveBackupKeyBottomSheet;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.List;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import nh0.C23793c;
import og0.EnumC24251b;
import org.json.JSONObject;
import p361nb.C23648e;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import pm.C24832c;
import pm0.C24848g0;
import vg.C28203u6;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: tg0.b */
/* loaded from: classes.dex */
public final class C26676b {

    /* renamed from: a */
    public static final C26676b f126324a = new C26676b();

    /* renamed from: tg0.b$a */
    /* loaded from: classes7.dex */
    public static final class a extends Enum {

        /* renamed from: q */
        public static final a f126325q = new a("FINISH", 0, 0);

        /* renamed from: r */
        public static final a f126326r = new a("AUTO_SKIP", 1, 1);

        /* renamed from: s */
        public static final a f126327s = new a("MANUAL_SKIP", 2, 2);

        /* renamed from: t */
        private static final /* synthetic */ a[] f126328t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f126329u;

        /* renamed from: p */
        private final int f126330p;

        static {
            a[] m137013b = m137013b();
            f126328t = m137013b;
            f126329u = AbstractC30166b.m148796a(m137013b);
        }

        private a(String str, int i11, int i12) {
            super(str, i11);
            this.f126330p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m137013b() {
            return new a[]{f126325q, f126326r, f126327s};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f126328t.clone();
        }

        /* renamed from: c */
        public final int m137014c() {
            return this.f126330p;
        }
    }

    /* renamed from: tg0.b$b */
    /* loaded from: classes.dex */
    public static final class b extends Enum {

        /* renamed from: p */
        public static final b f126331p = new b("CORE_FLOW", 0);

        /* renamed from: q */
        public static final b f126332q = new b("SERVER", 1);

        /* renamed from: r */
        public static final b f126333r = new b("DEV", 2);

        /* renamed from: s */
        public static final b f126334s = new b("MIGRATE", 3);

        /* renamed from: t */
        public static final b f126335t = new b("ERROR", 4);

        /* renamed from: u */
        public static final b f126336u = new b("DOWNLOAD", 5);

        /* renamed from: v */
        public static final b f126337v = new b("AUDITOR", 6);

        /* renamed from: w */
        public static final b f126338w = new b("OFFLOAD", 7);

        /* renamed from: x */
        private static final /* synthetic */ b[] f126339x;

        /* renamed from: y */
        private static final /* synthetic */ InterfaceC30165a f126340y;

        static {
            b[] m137015b = m137015b();
            f126339x = m137015b;
            f126340y = AbstractC30166b.m148796a(m137015b);
        }

        private b(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m137015b() {
            return new b[]{f126331p, f126332q, f126333r, f126334s, f126335t, f126336u, f126337v, f126338w};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f126339x.clone();
        }
    }

    /* renamed from: tg0.b$c */
    /* loaded from: classes7.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f126341a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f126342b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f126343c;

        static {
            int[] iArr = new int[BackupKeySetupView.EnumC11021b.values().length];
            try {
                iArr[BackupKeySetupView.EnumC11021b.f55687r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BackupKeySetupView.EnumC11021b.f55688s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f126341a = iArr;
            int[] iArr2 = new int[SaveBackupKeyBottomSheet.EnumC11042b.values().length];
            try {
                iArr2[SaveBackupKeyBottomSheet.EnumC11042b.f55721r.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f126342b = iArr2;
            int[] iArr3 = new int[EnumC24251b.values().length];
            try {
                iArr3[EnumC24251b.f117146q.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[EnumC24251b.f117147r.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[EnumC24251b.f117148s.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f126343c = iArr3;
        }
    }

    private C26676b() {
    }

    /* renamed from: A */
    public static /* synthetic */ void m136950A(C26676b c26676b, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        c26676b.m137012z(i11, z11);
    }

    /* renamed from: a */
    private final long m136951a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public static final void m136952b(String str, String str2) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
    }

    /* renamed from: c */
    public static final void m136953c(Exception exc) {
        AbstractC19074t.m100208f(exc, "exception");
        m136954d("SMLZCloud", exc);
    }

    /* renamed from: d */
    public static final void m136954d(String str, Exception exc) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(exc, "exception");
        AbstractC23350e.m122776f(str, exc);
        C24832c.m129125e(exc.toString(), b.f126335t);
    }

    /* renamed from: e */
    public static final void m136955e(String str, String str2, b bVar) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        AbstractC19074t.m100208f(bVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC20110a.f98889a.m104564x(str).mo104556o(8, "[" + AbstractC23160o0.m119291t0(f126324a.m136951a()) + "] " + str2, new Object[0]);
        C24832c.m129125e(str2, bVar);
    }

    /* renamed from: f */
    public static final void m136956f(String str, b bVar) {
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(bVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        m136955e("SMLZCloud", str, bVar);
    }

    /* renamed from: g */
    public static /* synthetic */ void m136957g(String str, String str2, b bVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            bVar = b.f126333r;
        }
        m136955e(str, str2, bVar);
    }

    /* renamed from: h */
    public static /* synthetic */ void m136958h(String str, b bVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bVar = b.f126333r;
        }
        m136956f(str, bVar);
    }

    /* renamed from: i */
    public static final void m136959i(String str) {
        AbstractC19074t.m100208f(str, "message");
        m136960j("SMLZCloud", str);
    }

    /* renamed from: j */
    public static final void m136960j(String str, String str2) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
    }

    /* renamed from: k */
    public static final void m136961k(String str) {
        AbstractC19074t.m100208f(str, "message");
        m136962l("SMLZCloud", str);
    }

    /* renamed from: l */
    public static final void m136962l(String str, String str2) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
    }

    /* renamed from: B */
    public final void m136963B(boolean z11, String str) {
        String str2;
        AbstractC19074t.m100208f(str, "source");
        if (z11) {
            str2 = "zcloud_setup_pin_confirm_done";
        } else {
            str2 = "zcloud_setup_pin_create_btn_next";
        }
        String str3 = str2;
        try {
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1075f("source", str);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, str3, null, c0708i, null, 10, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: C */
    public final void m136964C(ThreadStorageInfo threadStorageInfo) {
        String str;
        C31973j5 m40389U;
        AbstractC19074t.m100208f(threadStorageInfo, "threadStorageInfo");
        try {
            String m74822z = threadStorageInfo.m74822z();
            Integer num = null;
            ContactProfile m141801m = C28203u6.m141801m(C28203u6.f131407a, threadStorageInfo.m74822z(), false, 2, null);
            if (m141801m != null) {
                str = m141801m.f42434r;
            } else {
                str = null;
            }
            boolean m132079d = AbstractC25495a.m132079d(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_id", m74822z);
            jSONObject.put("thread_type", m132079d ? 1 : 0);
            if (m132079d) {
                if (m141801m != null && (m40389U = m141801m.m40389U()) != null) {
                    num = Integer.valueOf(m40389U.m153732O());
                }
            } else {
                num = 1;
            }
            jSONObject.put("thread_member_size", num);
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            C0732w.m1177r(C0732w.Companion.m1189a(), "cloudmedia_threads_detail", null, null, cVar, 6, null);
        } catch (Exception e11) {
            m136954d("SMLZCloud", e11);
        }
    }

    /* renamed from: D */
    public final void m136965D(String str) {
        AbstractC19074t.m100208f(str, "plan");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("plan", str);
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_home_manage_subscription", null, null, cVar, 6, null);
        } catch (Exception e11) {
            m136954d("SMLZCloud", e11);
        }
    }

    /* renamed from: E */
    public final void m136966E() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_settings_click_network_cond", null, null, null, 14, null);
        } catch (Exception e11) {
            m136954d("SMLZCloud", e11);
        }
    }

    /* renamed from: F */
    public final void m136967F(BackupKeySetupView.EnumC11021b enumC11021b, String str) {
        String str2;
        AbstractC19074t.m100208f(enumC11021b, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str, "source");
        try {
            int i11 = c.f126341a[enumC11021b.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    str2 = "";
                } else {
                    str2 = "passphrase";
                }
            } else {
                str2 = "pin";
            }
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1075f("pwd_type", str2);
            c0708i.m1075f("source", str);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, "zcloud_setup_select_pwd", null, c0708i, null, 10, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: G */
    public final void m136968G() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_setup_pwd_intro_next", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: H */
    public final void m136969H(int i11) {
        String str;
        if (i11 == -1) {
            str = "setup";
        } else {
            str = "media_zcloudhome";
        }
        try {
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1075f("flow", str);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, "zcloud_migrate_out_quota_cta_popup", null, c0708i, null, 10, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: I */
    public final void m136970I(boolean z11, int i11, String str) {
        String str2;
        AbstractC19074t.m100208f(str, "source");
        try {
            if (i11 == AbstractC6918a0.tvPrivateKey) {
                if (z11) {
                    str2 = "zcloud_setup_pass_confirm_click_pass_area";
                } else {
                    str2 = "zcloud_setup_pass_create_click_pass_area";
                }
            } else {
                str2 = "";
            }
            String str3 = str2;
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1075f("source", str);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, str3, null, c0708i, null, 10, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: J */
    public final void m136971J() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_settings_click_password", null, null, null, 14, null);
        } catch (Exception e11) {
            m136954d("SMLZCloud", e11);
        }
    }

    /* renamed from: K */
    public final void m136972K(int i11) {
        String str;
        try {
            if (i11 == AbstractC6918a0.btnSetup) {
                str = "zcloud_undone_setup_banner_accept";
            } else if (i11 == AbstractC6918a0.btnClose) {
                str = "zcloud_undone_setup_banner_dismiss";
            } else {
                str = "";
            }
            C0732w.m1177r(C0732w.Companion.m1189a(), str, null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: L */
    public final void m136973L() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migration_manual_resume_banner_start", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: M */
    public final void m136974M() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migration_manual_resume_cloud_home", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: N */
    public final void m136975N(int i11, String str) {
        String str2;
        AbstractC19074t.m100208f(str, "entryPoint");
        if (i11 == -1) {
            str2 = "setup";
        } else {
            str2 = "media_zcloudhome";
        }
        try {
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1075f("entry_point", str);
            c0708i.m1075f("flow", str2);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, "zcloud_migrate_out_quota_cta_popup", null, c0708i, null, 10, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: O */
    public final void m136976O(EnumC24251b enumC24251b) {
        AbstractC19074t.m100208f(enumC24251b, "feature");
        try {
            int i11 = c.f126343c[enumC24251b.ordinal()];
            if (i11 != 1) {
                if (i11 != 3) {
                } else {
                    C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_home_connect_backup", null, null, null, 14, null);
                }
            } else {
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_home_connect_media", null, null, null, 14, null);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: P */
    public final void m136977P() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_time", AbstractC0924m0.m4311w8());
            jSONObject.put("end_time", System.currentTimeMillis());
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_complete", null, null, cVar, 6, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: Q */
    public final void m136978Q() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migration_manual_resume_banner_dismiss", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: R */
    public final void m136979R() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_interrupt_backup_corrupted", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: S */
    public final void m136980S(int i11, int i12, int i13, int i14) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("total_media_migrate", i11);
            jSONObject.put("new", i12);
            jSONObject.put("local", i13);
            jSONObject.put("ggdrive", i14);
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_analyze_end", null, null, cVar, 6, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: T */
    public final void m136981T() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_analyze_start", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: U */
    public final void m136982U(a aVar) {
        AbstractC19074t.m100208f(aVar, "skipType");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("skip", aVar.m137014c());
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_ggdrive_media_end", null, null, cVar, 6, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: V */
    public final void m136983V() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_ggdrive_media_start", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: W */
    public final void m136984W() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_local_media_end", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: X */
    public final void m136985X() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_local_media_start", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: Y */
    public final void m136986Y() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_server_media_end", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: Z */
    public final void m136987Z() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_server_media_start", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: a0 */
    public final void m136988a0() {
        C0815e1.m2075D().m2100V(new C23648e(69, "tab_me", 0, "tab_me_open_zcloud", new String[0]), false);
    }

    /* renamed from: b0 */
    public final void m136989b0(SaveBackupKeyBottomSheet.EnumC11042b enumC11042b, boolean z11, String str) {
        String str2;
        AbstractC19074t.m100208f(enumC11042b, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str, "source");
        try {
            if (c.f126342b[enumC11042b.ordinal()] == 1) {
                if (z11) {
                    str2 = "zcloud_setup_pass_option_ggdrive_done";
                } else {
                    str2 = "zcloud_setup_pass_option_ggdrive_failed";
                }
            } else {
                str2 = "";
            }
            String str3 = str2;
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1075f("source", str);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, str3, null, c0708i, null, 10, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: c0 */
    public final void m136990c0(BackupKeySetupView.EnumC11021b enumC11021b, String str) {
        AbstractC19074t.m100208f(enumC11021b, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str, "source");
        try {
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1073d("ts_done_setup", AbstractC0924m0.m3595Y7());
            c0708i.m1073d("ts_intro", AbstractC0924m0.m3537W7());
            c0708i.m1073d("ts_select_pass_type", AbstractC0924m0.m3804f8());
            c0708i.m1075f("source", str);
            int i11 = c.f126341a[enumC11021b.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    c0708i.m1073d("ts_set_pass_create", AbstractC0924m0.m3654a8());
                    c0708i.m1073d("ts_set_pass_confirm", AbstractC0924m0.m3624Z7());
                    c0708i.m1075f("pwd_type", "passphrase");
                }
            } else {
                c0708i.m1073d("ts_set_pass_create", AbstractC0924m0.m3714c8());
                c0708i.m1073d("ts_set_pass_confirm", AbstractC0924m0.m3684b8());
                c0708i.m1073d("ts_set_pass_reconfirm", AbstractC0924m0.m3744d8());
                c0708i.m1075f("pwd_type", "pin");
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, "zcloud_setup_finish", null, c0708i, null, 10, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: d0 */
    public final void m136991d0(String str) {
        AbstractC19074t.m100208f(str, "sortType");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sort_type", str);
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            C0732w.m1177r(C0732w.Companion.m1189a(), "cloudmedia_threads_sort", null, null, cVar, 6, null);
        } catch (Exception e11) {
            m136954d("SMLZCloud", e11);
        }
    }

    /* renamed from: e0 */
    public final void m136992e0() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_start", null, null, null, 14, null);
            AbstractC0924m0.m3267Mr(System.currentTimeMillis());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: f0 */
    public final void m136993f0() {
        try {
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1073d("ts_welcome", C23793c.Companion.m124321a().mo124314i());
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, "zcloud_setup_start", "", c0708i, null, 8, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: g0 */
    public final void m136994g0(boolean z11, int i11) {
        String str;
        try {
            if (i11 == AbstractC6918a0.btnConnectZcloud) {
                if (z11) {
                    str = "zcloud_undone_setup_warning_skip";
                } else {
                    str = "zcloud_warning_no_backup_by_pass";
                }
            } else if (i11 == AbstractC6918a0.btnHelp) {
                if (z11) {
                    str = "zcloud_undone_setup_warning_help";
                } else {
                    str = "zcloud_warning_no_backup_info_help_web";
                }
            } else {
                return;
            }
            C0732w.m1177r(C0732w.Companion.m1189a(), str, null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: h0 */
    public final void m136995h0(boolean z11, List list) {
        String str;
        AbstractC19074t.m100208f(list, "threads");
        try {
            JSONObject jSONObject = new JSONObject();
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            if (z11) {
                str = "zcloud_manage_all_delete";
            } else {
                str = "zcloud_manage_thread_delete";
            }
            C0732w.m1177r(C0732w.Companion.m1189a(), str, null, null, cVar, 6, null);
        } catch (Exception e11) {
            m136954d("SMLZCloud", e11);
        }
    }

    /* renamed from: i0 */
    public final void m136996i0(boolean z11, List list) {
        String str;
        AbstractC19074t.m100208f(list, "threads");
        try {
            JSONObject jSONObject = new JSONObject();
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            if (z11) {
                str = "zcloud_manage_all_download";
            } else {
                str = "zcloud_manage_thread_download";
            }
            C0732w.m1177r(C0732w.Companion.m1189a(), str, null, null, cVar, 6, null);
        } catch (Exception e11) {
            m136954d("SMLZCloud", e11);
        }
    }

    /* renamed from: j0 */
    public final void m136997j0(boolean z11, String str) {
        String str2;
        String str3;
        AbstractC19074t.m100208f(str, "tabType");
        try {
            JSONObject jSONObject = new JSONObject();
            switch (str.hashCode()) {
                case -1905167199:
                    if (str.equals("Photos")) {
                        str2 = "photo";
                        break;
                    }
                    str2 = "all";
                    break;
                case -1732810888:
                    if (str.equals("Videos")) {
                        str2 = "video";
                        break;
                    } else {
                        str2 = "all";
                        break;
                    }
                case -1269867783:
                    if (str.equals("Voice message")) {
                        str2 = "voice";
                        break;
                    } else {
                        str2 = "all";
                        break;
                    }
                case 2189724:
                    if (str.equals("File")) {
                        str2 = "file";
                        break;
                    } else {
                        str2 = "all";
                        break;
                    }
                default:
                    str2 = "all";
                    break;
            }
            jSONObject.put("tab", str2);
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            if (z11) {
                str3 = "zcloud_manage_all_select_tab";
            } else {
                str3 = "zcloud_manage_thread_select_tab";
            }
            C0732w.m1177r(C0732w.Companion.m1189a(), str3, null, null, cVar, 6, null);
        } catch (Exception e11) {
            m136954d("SMLZCloud", e11);
        }
    }

    /* renamed from: k0 */
    public final void m136998k0(boolean z11, String str) {
        String str2;
        AbstractC19074t.m100208f(str, "sortType");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sort_type", str);
            C0732w.c cVar = new C0732w.c();
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            cVar.m1192b(jSONObject2);
            if (z11) {
                str2 = "zcloud_manage_all_sort";
            } else {
                str2 = "zcloud_manage_thread_sort";
            }
            C0732w.m1177r(C0732w.Companion.m1189a(), str2, null, null, cVar, 6, null);
        } catch (Exception e11) {
            m136954d("SMLZCloud", e11);
        }
    }

    /* renamed from: m */
    public final void m136999m() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_btn_exit", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: n */
    public final void m137000n() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_delete_corrupted_backup_cancel", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: o */
    public final void m137001o() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "cloudmedia_clean_type", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: p */
    public final void m137002p() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "cloudmedia_clean_chat", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: q */
    public final void m137003q(String str) {
        AbstractC19074t.m100208f(str, "source");
        try {
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1075f("source", str);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, "zcloud_migrate_delete_corrupted_backup_confirm", null, c0708i, null, 10, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: r */
    public final void m137004r(EnumC24251b enumC24251b) {
        AbstractC19074t.m100208f(enumC24251b, "feature");
        try {
            int i11 = c.f126343c[enumC24251b.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_home_feature_backup", null, null, null, 14, null);
                    }
                } else {
                    C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_home_feature_mycloud", null, null, null, 14, null);
                }
            } else {
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_home_feature_media", null, null, null, 14, null);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: s */
    public final void m137005s(int i11) {
        String str;
        if (i11 == -1) {
            str = "setup";
        } else {
            str = "media_zcloudhome";
        }
        try {
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1075f("flow", str);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, "zcloud_migrate_out_quota_cta_banner", null, c0708i, null, 10, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: t */
    public final void m137006t(boolean z11) {
        String str;
        if (z11) {
            str = "zcloud_restore_delete_backup_confirm";
        } else {
            str = "zcloud_restore_delete_backup_cancel";
        }
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), str, null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: u */
    public final void m137007u(int i11) {
        String str;
        if (i11 == -1) {
            str = "setup";
        } else {
            str = "media_zcloudhome";
        }
        try {
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1075f("flow", str);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, "zcloud_migrate_out_quota_dismiss_banner", null, c0708i, null, 10, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: v */
    public final void m137008v() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_settings_click_file_size_threshold", null, null, null, 14, null);
        } catch (Exception e11) {
            m136954d("SMLZCloud", e11);
        }
    }

    /* renamed from: w */
    public final void m137009w() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_setup_finish_btn_next", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: x */
    public final void m137010x() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_migrate_interrupt_backup_corrupted_handle", null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }

    /* renamed from: y */
    public final void m137011y() {
        try {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_home_setting", null, null, null, 14, null);
        } catch (Exception e11) {
            m136954d("SMLZCloud", e11);
        }
    }

    /* renamed from: z */
    public final void m137012z(int i11, boolean z11) {
        String str;
        try {
            if (i11 == AbstractC6918a0.btnKeepData) {
                if (z11) {
                    str = "zcloud_restore_confirm";
                } else {
                    str = "zcloud_restore_success";
                }
            } else if (i11 == AbstractC6918a0.btnDeleteData) {
                str = "zcloud_restore_decline";
            } else {
                str = "";
            }
            C0732w.m1177r(C0732w.Companion.m1189a(), str, null, null, null, 14, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLZCloud", e11);
        }
    }
}
