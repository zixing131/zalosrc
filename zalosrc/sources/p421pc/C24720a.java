package p421pc;

import am.AbstractC0924m0;
import b50.C2556d;
import ch0.AbstractC3489d;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ln0.AbstractC22543l;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p320ld.C22436h;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p620wt.AbstractC29231f;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import s00.AbstractC26084s;
import sc.C26220b;

/* renamed from: pc.a */
/* loaded from: classes3.dex */
public final class C24720a {
    public static final b Companion = new b(null);

    /* renamed from: d */
    private static final InterfaceC24854k f118733d;

    /* renamed from: a */
    private final C29234i f118734a;

    /* renamed from: b */
    private final InterfaceC29232g f118735b;

    /* renamed from: c */
    private final InterfaceC29232g f118736c;

    /* renamed from: pc.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f118737q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24720a mo12V4() {
            return c.f118738a.m128433a();
        }
    }

    /* renamed from: pc.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24720a m128432a() {
            return (C24720a) C24720a.f118733d.getValue();
        }
    }

    /* renamed from: pc.a$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f118738a = new c();

        /* renamed from: b */
        private static final C24720a f118739b = new C24720a();

        private c() {
        }

        /* renamed from: a */
        public final C24720a m128433a() {
            return f118739b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pc.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final int[] mo12V4() {
            C24720a c24720a = C24720a.this;
            String m4127q1 = AbstractC0924m0.m4127q1();
            AbstractC19074t.m100207e(m4127q1, "getGdriveRetryConfig(...)");
            return c24720a.m128383W(m4127q1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pc.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f118741q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24722c mo12V4() {
            String m4012m6 = AbstractC0924m0.m4012m6();
            if (m4012m6 == null) {
                m4012m6 = "";
            }
            return C24722c.Companion.m128458a(m4012m6);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f118737q);
        f118733d = m129210a;
    }

    public C24720a() {
        C29234i m145994a = AbstractC29235j.m145994a();
        this.f118734a = m145994a;
        this.f118735b = AbstractC29233h.m145991b(m145994a, e.f118741q);
        this.f118736c = AbstractC29233h.m145991b(m145994a, new d());
    }

    /* renamed from: A */
    private final int[] m128378A() {
        return (int[]) this.f118736c.getValue();
    }

    /* renamed from: B */
    private final C24722c m128379B() {
        return (C24722c) this.f118735b.getValue();
    }

    /* renamed from: C */
    private final void m128380C(JSONObject jSONObject, boolean z11) {
        boolean z12;
        boolean z13 = false;
        AbstractC0924m0.m3630Zd(AbstractC18069a.m96086e(jSONObject, "backup_compress_level", 0));
        AbstractC0924m0.m3601Yd(AbstractC18069a.m96086e(jSONObject, "backup_bonus_resize_percent", 10));
        long m96088g = AbstractC18069a.m96088g(jSONObject, "backup_size_limit", 78643200L);
        if (m96088g > 0) {
            AbstractC23309i.m121457Th(m96088g);
        }
        if (AbstractC18069a.m96086e(jSONObject, "back_up_media", 0) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC23309i.m121985hk(z12);
        AbstractC23309i.m122220ns(AbstractC18069a.m96086e(jSONObject, "backup_media_limit_day", 120));
        AbstractC23309i.m122442ts(AbstractC18069a.m96085d(jSONObject, "backup_media_limit_time_exists"));
        if (AbstractC18069a.m96086e(jSONObject, "restore_gdrive_photo_csc", 1) == 1) {
            z13 = true;
        }
        AbstractC23309i.m121619Xv(z13);
    }

    /* renamed from: D */
    private final void m128381D(JSONObject jSONObject, boolean z11) {
        String jSONObject2;
        C26220b.m134826i("SMLBackupRestoreConfigs", "handleBRMediaConfig(): fromLoginFlow=" + z11 + ", json=" + jSONObject, null, 4, null);
        if (jSONObject != null) {
            try {
                jSONObject2 = jSONObject.toString();
                if (jSONObject2 == null) {
                }
                AbstractC0924m0.m3554Wo(jSONObject2);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SMLBackupRestoreConfigs", e11);
                return;
            }
        }
        jSONObject2 = "";
        AbstractC0924m0.m3554Wo(jSONObject2);
    }

    /* renamed from: E */
    private final void m128382E(JSONObject jSONObject, boolean z11) {
        boolean z12;
        boolean z13;
        long j11;
        boolean z14;
        boolean z15;
        boolean z16;
        JSONObject optJSONObject;
        String jSONObject2;
        JSONArray optJSONArray;
        boolean z17;
        JSONObject optJSONObject2;
        boolean z18;
        boolean z19;
        String str;
        boolean z21;
        C26220b.m134826i("SMLBackupRestoreConfigs", "handleBRMsgConfig(): fromLoginFlow=" + z11 + ", json=" + jSONObject, null, 4, null);
        try {
            C26220b.m134826i("SMLBackupRestoreConfigs", "handleServerConfig(): " + jSONObject, null, 4, null);
            boolean z22 = false;
            if (jSONObject != null && jSONObject.optInt("enable", 1) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            AbstractC23309i.m120769Aw(z12);
            if (jSONObject != null && jSONObject.optInt("enable_auto_sync", 1) == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            AbstractC23309i.m122594xw(z13);
            if (jSONObject != null) {
                j11 = jSONObject.optLong("sync_interval", 86400000L);
            } else {
                j11 = 86400000;
            }
            AbstractC23309i.m120917Ew(j11);
            if (z11) {
                if (jSONObject != null && jSONObject.optInt("enable_sync_dialog_onlogin", 0) == 1) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                m128408Z(z21);
            }
            long j12 = 169200;
            if (jSONObject != null) {
                j12 = jSONObject.optLong("timeout_toast_sync_msg_status", 169200L);
            }
            AbstractC23309i.m121621Xx(j12);
            int i11 = 300;
            if (jSONObject != null) {
                i11 = jSONObject.optInt("pc_popup_expire_time", 300);
            }
            AbstractC23309i.m121211Mu(i11);
            int i12 = 7;
            if (jSONObject != null) {
                i12 = jSONObject.optInt("old_backup_after_day", 7);
            }
            AbstractC0924m0.m3058Fl(i12 * 86400000);
            if (jSONObject != null && jSONObject.optInt("enable_backup_division", 0) == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            AbstractC0924m0.m3371Qf(z14);
            if (jSONObject != null && (optJSONObject2 = jSONObject.optJSONObject("password")) != null) {
                if (optJSONObject2.optInt("enable", 0) == 1) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                m128385a0(z18);
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("force_set_pwd");
                if (optJSONObject3 != null) {
                    AbstractC19074t.m100205c(optJSONObject3);
                    AbstractC0924m0.m3701bp(optJSONObject3.optInt("require", 0));
                    AbstractC0924m0.m3612Yo(optJSONObject3.optInt("allow_skip", 1));
                    JSONArray optJSONArray2 = optJSONObject3.optJSONArray("require_srcs");
                    if (optJSONArray2 == null || (str = optJSONArray2.toString()) == null) {
                        str = "[2,4,5,7,8]";
                    }
                    AbstractC0924m0.m3671ap(str);
                }
                if (optJSONObject2.optInt("skip_select_encryption_type", 1) == 1) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                AbstractC0924m0.m4060no(z19);
            }
            if (jSONObject != null) {
                if (jSONObject.optInt("enable_backup_detail", 0) == 1) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                AbstractC0924m0.m3342Pf(z17);
            }
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("media_retry_times")) != null) {
                AbstractC0924m0.m3724ci(optJSONArray.toString());
            }
            if (jSONObject != null && jSONObject.optInt("bk_override_popup", 1) == 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            AbstractC0924m0.m3812fg(z15);
            int i13 = 524288;
            if (jSONObject != null) {
                i13 = AbstractC29231f.m145983a(jSONObject, "upload_chunk_size", 524288, 524288, 3145728);
            }
            AbstractC0924m0.m4288ve(i13);
            if (jSONObject != null && jSONObject.optInt("enable_move_param", 0) == 1) {
                z16 = true;
            } else {
                z16 = false;
            }
            AbstractC0924m0.m2937Bg(z16);
            m128387c(m128401R());
            String str2 = "";
            if (jSONObject != null && jSONObject.has("remind_bk_mini_survey_zinst")) {
                JSONObject optJSONObject4 = jSONObject.optJSONObject("remind_bk_mini_survey_zinst");
                if (optJSONObject4 != null && (jSONObject2 = optJSONObject4.toString()) != null) {
                    str2 = jSONObject2;
                }
                AbstractC0924m0.m3750de(str2);
            } else {
                AbstractC0924m0.m3750de("");
            }
            if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("reminder")) != null) {
                if (optJSONObject.optInt("remind_auto_backup", 0) == 1) {
                    z22 = true;
                }
                AbstractC0924m0.m3723ch(z22);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLBackupRestoreConfigs", e11);
        }
    }

    /* renamed from: W */
    public final int[] m128383W(String str) {
        if (str.length() > 0) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() == 0) {
                    return new int[0];
                }
                int[] iArr = new int[jSONArray.length()];
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = jSONArray.getInt(i11);
                    if (i12 > 0 && i12 < 5) {
                        iArr[i11] = jSONArray.getInt(i11);
                    } else {
                        throw new JSONException("Invalid config retry time value: " + i12);
                    }
                }
                return iArr;
            } catch (JSONException e11) {
                C26220b.m134821d("SMLBackupRestoreConfigs", e11);
                return new int[]{1, 2, 4};
            }
        }
        return new int[]{1, 2, 4};
    }

    /* renamed from: a0 */
    private final void m128385a0(boolean z11) {
        AbstractC23309i.m122474un(z11);
        C2556d.m12981o().m13007x(2);
    }

    /* renamed from: c */
    private final void m128387c(boolean z11) {
        if (z11 && !AbstractC23306f.m120684l().m126159l()) {
            m128407Y(-6);
        }
    }

    /* renamed from: p */
    public static final C24720a m128388p() {
        return Companion.m128432a();
    }

    /* renamed from: F */
    public final void m128389F(JSONObject jSONObject) {
        String str;
        long m116581d;
        String jSONObject2;
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("promote_media");
        String str2 = "";
        if (optJSONObject == null || (str = optJSONObject.toString()) == null) {
            str = "";
        }
        AbstractC0924m0.m3080Ge(str);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("remind_restore");
        if (optJSONObject2 != null && (jSONObject2 = optJSONObject2.toString()) != null) {
            str2 = jSONObject2;
        }
        AbstractC0924m0.m3109He(str2);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("remind_gauth");
        if (optJSONObject3 != null) {
            boolean z11 = false;
            if (optJSONObject3.optInt("enable", 0) == 1) {
                z11 = true;
            }
            AbstractC0924m0.m3429Sf(z11);
            m116581d = AbstractC22543l.m116581d(optJSONObject3.optLong(ZinstantMetaConstant.IMPRESSION_META_INTERVAL, 604800L) * 1000, 86400000L);
            AbstractC0924m0.m4296vm(m116581d);
        }
        C22436h.f109760a.m115921q();
    }

    /* renamed from: G */
    public final void m128390G(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, boolean z11) {
        m128382E(jSONObject, z11);
        m128381D(jSONObject2, z11);
        m128380C(jSONObject3, z11);
    }

    /* renamed from: H */
    public final boolean m128391H() {
        return AbstractC0924m0.m3424Sa();
    }

    /* renamed from: I */
    public final boolean m128392I() {
        if (AbstractC0924m0.m3326P() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final boolean m128393J() {
        return AbstractC0924m0.m3925j9();
    }

    /* renamed from: K */
    public final boolean m128394K() {
        return AbstractC0924m0.m3955k9();
    }

    /* renamed from: L */
    public final boolean m128395L() {
        return AbstractC23309i.m121121Ke();
    }

    /* renamed from: M */
    public final boolean m128396M() {
        return AbstractC23309i.m122499vb();
    }

    /* renamed from: N */
    public final boolean m128397N() {
        return AbstractC0924m0.m3985l9();
    }

    /* renamed from: O */
    public final boolean m128398O() {
        return AbstractC0924m0.m4225t9();
    }

    /* renamed from: P */
    public final boolean m128399P() {
        return AbstractC0924m0.m3220L9();
    }

    /* renamed from: Q */
    public final boolean m128400Q() {
        return AbstractC0924m0.m3896ia();
    }

    /* renamed from: R */
    public final boolean m128401R() {
        return AbstractC0924m0.m3193Kb();
    }

    /* renamed from: S */
    public final boolean m128402S() {
        return AbstractC23309i.m120959G0();
    }

    /* renamed from: T */
    public final boolean m128403T() {
        return AbstractC23309i.m121640Yf();
    }

    /* renamed from: U */
    public final boolean m128404U() {
        return AbstractC23309i.m122462ub();
    }

    /* renamed from: V */
    public final boolean m128405V() {
        return AbstractC0924m0.m4257uc();
    }

    /* renamed from: X */
    public final void m128406X(boolean z11) {
        AbstractC0924m0.m4174ri(z11);
    }

    /* renamed from: Y */
    public final void m128407Y(int i11) {
        C26220b.m134826i("SMLBackupRestoreConfigs", "setConfigAutoBackup(" + i11 + ")", null, 4, null);
        if (i11 > 0) {
            m128406X(false);
        }
        AbstractC0924m0.m4404ze(i11);
        AbstractC26084s.m134271s(2, 58, true);
    }

    /* renamed from: Z */
    public final void m128408Z(boolean z11) {
        AbstractC0924m0.m3783eh(z11);
    }

    /* renamed from: d */
    public final void m128409d() {
        C26220b.m134826i("SMLBackupRestoreConfigs", "clearAllMemCache()", null, 4, null);
        this.f118734a.m145993b();
    }

    /* renamed from: e */
    public final long m128410e() {
        return AbstractC23309i.m122573xb();
    }

    /* renamed from: f */
    public final int m128411f() {
        return AbstractC0924m0.m4125q();
    }

    /* renamed from: g */
    public final int m128412g() {
        return AbstractC0924m0.m4155r();
    }

    /* renamed from: h */
    public final int m128413h() {
        return AbstractC23309i.m121225N7();
    }

    /* renamed from: i */
    public final String m128414i() {
        String m4302w = AbstractC0924m0.m4302w();
        AbstractC19074t.m100207e(m4302w, "getBackupRestoreMiniSurveyJson(...)");
        return m4302w;
    }

    /* renamed from: j */
    public final long m128415j() {
        return AbstractC23309i.m121180M();
    }

    /* renamed from: k */
    public final int m128416k() {
        if (AbstractC3489d.m17514v()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: l */
    public final String m128417l() {
        String m3529W = AbstractC0924m0.m3529W();
        AbstractC19074t.m100207e(m3529W, "getConfigPromoteBackupMsg(...)");
        return m3529W;
    }

    /* renamed from: m */
    public final String m128418m() {
        String m3558X = AbstractC0924m0.m3558X();
        AbstractC19074t.m100207e(m3558X, "getConfigRemindRestore(...)");
        return m3558X;
    }

    /* renamed from: n */
    public final int[] m128419n() {
        return m128378A();
    }

    /* renamed from: o */
    public final int m128420o() {
        return AbstractC0924m0.m3326P();
    }

    /* renamed from: q */
    public final long m128421q() {
        return AbstractC0924m0.m3890i4();
    }

    /* renamed from: r */
    public final long m128422r() {
        long j11 = 1024;
        return m128379B().m128453l() * j11 * j11;
    }

    /* renamed from: s */
    public final long m128423s() {
        long j11 = 1024;
        return m128379B().m128455n() * j11 * j11;
    }

    /* renamed from: t */
    public final long m128424t() {
        return AbstractC0924m0.m3186K4();
    }

    /* renamed from: u */
    public final int m128425u() {
        return AbstractC23309i.m121410S7();
    }

    /* renamed from: v */
    public final C24722c m128426v() {
        return m128379B();
    }

    /* renamed from: w */
    public final int m128427w() {
        return AbstractC0924m0.m4042n6();
    }

    /* renamed from: x */
    public final String m128428x() {
        String m4102p6 = AbstractC0924m0.m4102p6();
        AbstractC19074t.m100207e(m4102p6, "getSyncMsgForceSetPwdRequiredSrcs(...)");
        return m4102p6;
    }

    /* renamed from: y */
    public final int m128429y() {
        return AbstractC0924m0.m4132q6();
    }

    /* renamed from: z */
    public final int m128430z() {
        return AbstractC0924m0.m3239M();
    }
}
