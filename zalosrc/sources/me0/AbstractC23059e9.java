package me0;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0809c1;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import bz.C3162g;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p062db.C7965j;
import com.zing.zalo.p062db.C7967l;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import eg0.C18426a;
import gg0.AbstractC19444a;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import is.AbstractC20826v0;
import l30.C22021e0;
import mg.C23288a;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p164fn.C19027a;
import p173fz.C19172a;
import p248iy.C20882b;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.C23655l;
import p361nb.C23669z;
import p398oo.C24371m0;
import p420pb.C24709a;
import p542ub.InterfaceC27218a;
import p588vw.C28652r;
import p716zh.C31849b1;
import r30.AbstractC25638h;
import r30.C25637g;
import r30.C25639i;
import si.C26263i;
import vg.C28139n5;

/* renamed from: me0.e9 */
/* loaded from: classes.dex */
public abstract class AbstractC23059e9 {

    /* renamed from: a */
    static final String f112067a = "e9";

    /* renamed from: b */
    private static Boolean f112068b;

    /* renamed from: me0.e9$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {
        a() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42325Z();
        }
    }

    /* renamed from: me0.e9$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {
        b() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            AbstractC23309i.m121504Ur(System.currentTimeMillis());
            C7960e.m41971c6().m42537sd();
            C7960e.m41971c6().m42188L5();
        }
    }

    /* renamed from: me0.e9$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ long f112069a;

        c(long j11) {
            this.f112069a = j11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            AbstractC23309i.m120949Fr(this.f112069a);
            C7960e.m41971c6().m42502pc(432000000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.e9$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC20094a {
        d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                obj.toString();
                C19669z.f97579a0.clear();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.e9$e */
    /* loaded from: classes4.dex */
    public class e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f112070a;

        e(C23669z c23669z) {
            this.f112070a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f112070a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.e9$f */
    /* loaded from: classes4.dex */
    public class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f112071a;

        f(C23669z c23669z) {
            this.f112071a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f112071a);
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m118312A() {
        AbstractC23306f.m120716u0().m154498b();
    }

    /* renamed from: B */
    public static /* synthetic */ void m118313B(long j11) {
        try {
            C7959d.m41638d1().m41819q0();
            C7965j.m42684k().m42690h();
            C7960e.m41971c6().m42138H3();
            AbstractC0924m0.m3905ij(j11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: C */
    public static /* synthetic */ void m118314C(InterfaceC27218a interfaceC27218a, boolean z11) {
        try {
            if (interfaceC27218a.getWindow() != null) {
                if (z11) {
                    interfaceC27218a.getWindow().addFlags(128);
                } else {
                    interfaceC27218a.getWindow().clearFlags(128);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m118315D() {
        C28139n5.m141620j().m141633e();
    }

    /* renamed from: E */
    public static boolean m118316E() {
        boolean z11;
        boolean z12;
        String m121120Kd = AbstractC23309i.m121120Kd();
        if (TextUtils.isEmpty(m121120Kd)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(m121120Kd);
            z11 = jSONObject.getBoolean("is_set_avatar");
            try {
                z12 = jSONObject.getBoolean("is_set_dob");
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                z12 = false;
                if (!z11) {
                }
                return true;
            }
        } catch (Exception e12) {
            e = e12;
            z11 = false;
        }
        if (!z11 && z12) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public static void m118317F(String str) {
        C25639i.m132496q().m132467l(str);
        C25637g.m132489q().m132467l(str);
        AbstractC25638h.m132494d(str);
    }

    /* renamed from: G */
    public static void m118318G(int i11) {
        AbstractC23304d.f113432r2 = i11;
    }

    /* renamed from: H */
    public static void m118319H(InterfaceC27218a interfaceC27218a, boolean z11) {
        if (interfaceC27218a == null) {
            return;
        }
        interfaceC27218a.runOnUiThread(new Runnable() { // from class: me0.x8

            /* renamed from: q */
            public final /* synthetic */ boolean f112763q;

            public /* synthetic */ RunnableC23264x8(boolean z112) {
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23059e9.m118314C(InterfaceC27218a.this, r2);
            }
        });
    }

    /* renamed from: I */
    public static void m118320I() {
        try {
            long m121826dd = AbstractC23309i.m121826dd();
            if (m121826dd > 0 && !TextUtils.isEmpty(CoreUtility.f89233i) && Math.abs(System.currentTimeMillis() - AbstractC23309i.m122421t7()) > m121826dd) {
                AbstractC23309i.m121393Rr(System.currentTimeMillis());
                AbstractC19444a.m101695c(new Runnable() { // from class: me0.d9
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC23059e9.m118315D();
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    public static void m118321J() {
        try {
            if (AbstractC23309i.m121146L2() == 0) {
                return;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new d());
            c0766k.mo1755v3();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public static boolean m118329h() {
        return AbstractC23309i.m122126la();
    }

    /* renamed from: i */
    public static boolean m118330i(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (C28652r.m143331K(charAt)) {
                    return false;
                }
                if (AbstractC23244v8.m119755s(charAt) && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ' ' && charAt != ',') {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: j */
    public static void m118331j() {
        if (C26263i.m135055u().m135071M()) {
            AbstractC20110a.m104535d("Abort clean cache chat content because Db is backup/restore", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.y8
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23059e9.m118345x();
            }
        });
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.z8
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23059e9.m118346y();
            }
        });
        C23278z2.m120142m1();
        if (currentTimeMillis - AbstractC23309i.m121895f7() > 7200000) {
            AbstractC23309i.m120875Dr(currentTimeMillis);
            C23288a.f113033a.mo13474a(new C18426a(new Runnable() { // from class: me0.a9
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23059e9.m118347z();
                }
            }));
            C0824j.m2153b(new a());
        }
        if (currentTimeMillis - AbstractC23309i.m122532w7() >= 86400000) {
            C0824j.m2153b(new b());
        }
        if (currentTimeMillis - AbstractC23309i.m121933g7() > AbstractC23309i.m121673Zb()) {
            AbstractC23309i.m120912Er(currentTimeMillis);
            AbstractC20110a.m104542k(8, "Start clean limit message...", new Object[0]);
            C7959d.m41638d1().m41689C();
            AbstractC23306f.m120584H0().m2628k(false, true);
            AbstractC23306f.m120716u0().m154502f(AbstractC20130d.m104884n0(), currentTimeMillis - 302400000);
            AbstractC23306f.m120716u0().m154502f(AbstractC20130d.m104904x0(), currentTimeMillis - 604800000);
        }
        if (currentTimeMillis - AbstractC23309i.m121971h7() > 259200000) {
            C0824j.m2153b(new c(currentTimeMillis));
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.b9
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23059e9.m118312A();
            }
        });
        if (currentTimeMillis - AbstractC0924m0.m3918j2() > 86400000) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.c9

                /* renamed from: p */
                public final /* synthetic */ long f112039p;

                public /* synthetic */ RunnableC23037c9(long currentTimeMillis2) {
                    r1 = currentTimeMillis2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23059e9.m118313B(r1);
                }
            });
        }
    }

    /* renamed from: k */
    public static String m118332k() {
        return "";
    }

    /* renamed from: l */
    private static void m118333l(Context context) {
        try {
            AbstractC23304d.f113338V0 = false;
            AbstractC23304d.f113341W = 0;
            AbstractC23304d.f113337V = false;
            AbstractC0924m0.m3693bh(false);
            AbstractC23309i.m122370ru(MainApplication.getAppContext(), AbstractC23304d.f113341W);
            AbstractC23309i.m120913Es("");
            AbstractC23304d.f113350Y0 = 0L;
            AbstractC23304d.f113253A = null;
            AbstractC23304d.f113257B = null;
            AbstractC23304d.f113254A0 = false;
            C24371m0.m127468p().m127473i();
            C22021e0.m114963p().m114983f();
            C19027a.m100086c().m100087a();
            C3162g.f13363a.m15933r();
            C7853b.m40052a0().m40144o1();
            MainApplication.m35468b0();
            MainTabView.m67662xN(null);
            C7853b.m40052a0().m40101O0();
            Intent intent = new Intent();
            intent.setAction("com.zing.zalo.ACTION_EXIT");
            context.sendBroadcast(intent);
            AbstractC23304d.f113333U = System.currentTimeMillis();
            AbstractC20826v0.f102358h.clear();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f112067a, e11);
        }
    }

    /* renamed from: m */
    public static void m118334m(InterfaceC27218a interfaceC27218a) {
        if (interfaceC27218a != null) {
            try {
                interfaceC27218a.finish();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f112067a, e11);
                return;
            }
        }
        m118333l(MainApplication.getAppContext());
        C20882b.m109134j();
    }

    /* renamed from: n */
    public static String m118335n(int i11) {
        return m118336o(i11, false);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x002f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m118336o(int i11, boolean z11) {
        Context appContext = MainApplication.getAppContext();
        if (i11 != 20) {
            if (i11 != 21 && i11 != 31) {
                if (i11 != 32) {
                    if (i11 != 44) {
                        if (i11 != 47) {
                            if (i11 != 80) {
                                if (i11 != 299) {
                                    if (i11 != 342) {
                                        if (i11 != 402) {
                                            switch (i11) {
                                                case 40:
                                                    break;
                                                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                                                    return appContext.getString(AbstractC8020f0.str_mini_profile_from_contacts);
                                                case 42:
                                                    return appContext.getString(AbstractC8020f0.str_from_src_zingme);
                                                default:
                                                    switch (i11) {
                                                        case 83:
                                                            return appContext.getString(AbstractC8020f0.str_from_src_radar);
                                                        case 84:
                                                            return appContext.getString(AbstractC8020f0.str_from_wifi_chat);
                                                        case 85:
                                                            break;
                                                        case 86:
                                                            if (AbstractC23148n.m118841o()) {
                                                                if (z11) {
                                                                    return appContext.getString(AbstractC8020f0.str_from_src_username);
                                                                }
                                                                return appContext.getString(AbstractC8020f0.str_mini_profile_from_src_username);
                                                            }
                                                            return appContext.getString(AbstractC8020f0.str_mini_profile_from_src_suggestion);
                                                        default:
                                                            switch (i11) {
                                                                case 90:
                                                                    return appContext.getString(AbstractC8020f0.str_mini_profile_from_src_suggestion);
                                                                case 91:
                                                                    break;
                                                                case 92:
                                                                    break;
                                                                default:
                                                                    return "";
                                                            }
                                                    }
                                            }
                                            return appContext.getString(AbstractC8020f0.str_mini_profile_from_phone);
                                        }
                                    } else {
                                        return appContext.getString(AbstractC8020f0.str_from_src_zinder);
                                    }
                                }
                            }
                            return appContext.getString(AbstractC8020f0.str_mini_profile_from_src_nearby);
                        }
                        return appContext.getString(AbstractC8020f0.str_mini_profile_from_qr);
                    }
                    return appContext.getString(AbstractC8020f0.str_from_google_plus);
                }
                return appContext.getString(AbstractC8020f0.str_mini_profile_from_share_contact);
            }
            return appContext.getString(AbstractC8020f0.str_mini_profile_from_src_group_chat);
        }
        return appContext.getString(AbstractC8020f0.str_from_src_zalo_page);
    }

    /* renamed from: p */
    public static void m118337p() {
        try {
            if (AbstractC23309i.m120962G3(1) == 1) {
                String m122161m8 = AbstractC23309i.m122161m8();
                if (!TextUtils.isEmpty(m122161m8)) {
                    C23655l c23655l = new C23655l();
                    c23655l.f114654a = 1;
                    c23655l.f114655b = 3;
                    c23655l.f114656c = System.currentTimeMillis();
                    c23655l.f114657d = 0;
                    c23655l.f114659f[0] = m122161m8;
                    C0809c1.m2050b(new e(c23655l));
                }
            }
        } catch (Exception e11) {
            e11.toString();
        }
    }

    /* renamed from: q */
    public static String m118338q(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            return "";
        }
        if (m118342u()) {
            str = "vi";
        } else {
            str = "en";
        }
        return jSONObject.optString(str, "");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0031. Please report as an issue. */
    /* renamed from: r */
    public static String m118339r(int i11, int i12, String str) {
        Context appContext = MainApplication.getAppContext();
        if (i12 != 20) {
            if (i12 != 21 && i12 != 31) {
                if (i12 != 32) {
                    if (i12 != 44) {
                        if (i12 != 47) {
                            if (i12 != 80) {
                                if (i12 != 299) {
                                    if (i12 != 342) {
                                        if (i12 != 91) {
                                            if (i12 != 92) {
                                                switch (i12) {
                                                    case 40:
                                                        break;
                                                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                                                        if (2 == i11) {
                                                            return appContext.getString(AbstractC8020f0.str_from_src_search_phone);
                                                        }
                                                        if (1 == i11) {
                                                            if (!TextUtils.isEmpty(str)) {
                                                                return appContext.getString(AbstractC8020f0.str_from_contacts_suggest);
                                                            }
                                                            return appContext.getString(AbstractC8020f0.str_you_may_know);
                                                        }
                                                        return appContext.getString(AbstractC8020f0.str_from_contacts);
                                                    case 42:
                                                        return appContext.getString(AbstractC8020f0.str_from_src_zingme);
                                                    default:
                                                        switch (i12) {
                                                            case 83:
                                                                return appContext.getString(AbstractC8020f0.str_from_src_radar);
                                                            case 84:
                                                                return appContext.getString(AbstractC8020f0.str_from_wifi_chat);
                                                            case 85:
                                                                break;
                                                            case 86:
                                                                break;
                                                            default:
                                                                if (i11 == 2) {
                                                                    return appContext.getString(AbstractC8020f0.str_from_src_unknown_not_name);
                                                                }
                                                                return appContext.getString(AbstractC8020f0.str_you_may_know);
                                                        }
                                                }
                                            }
                                            if (AbstractC23148n.m118841o()) {
                                                return appContext.getString(AbstractC8020f0.str_from_src_username);
                                            }
                                            if (i11 == 2) {
                                                return appContext.getString(AbstractC8020f0.str_from_src_unknown_not_name);
                                            }
                                            return appContext.getString(AbstractC8020f0.str_you_may_know);
                                        }
                                        return appContext.getString(AbstractC8020f0.str_from_src_search_phone);
                                    }
                                    return appContext.getString(AbstractC8020f0.str_from_src_zinder);
                                }
                            } else {
                                return appContext.getString(AbstractC8020f0.str_from_src_lbs);
                            }
                        }
                        return appContext.getString(AbstractC8020f0.str_from_src_scan_qr_code);
                    }
                    return appContext.getString(AbstractC8020f0.str_from_google_plus);
                }
                return appContext.getString(AbstractC8020f0.str_from_share_contact);
            }
            return appContext.getString(AbstractC8020f0.str_from_src_group_chat);
        }
        return appContext.getString(AbstractC8020f0.str_from_src_zalo_page);
    }

    /* renamed from: s */
    public static void m118340s(String str) {
        try {
            if (AbstractC23309i.m120962G3(1) == 1 && !TextUtils.isEmpty(str)) {
                C23655l c23655l = new C23655l();
                c23655l.f114654a = 1;
                c23655l.f114655b = 5;
                c23655l.f114656c = System.currentTimeMillis();
                c23655l.f114657d = 0;
                c23655l.f114659f[0] = str;
                C0809c1.m2050b(new f(c23655l));
            }
        } catch (Exception e11) {
            e11.toString();
        }
    }

    /* renamed from: t */
    public static boolean m118341t() {
        boolean z11;
        boolean z12 = false;
        if (Build.VERSION.SDK_INT < 27) {
            return false;
        }
        if (f112068b == null) {
            ActivityManager activityManager = (ActivityManager) MainApplication.getAppContext().getSystemService("activity");
            boolean m119071u = AbstractC23152n3.m119071u(MainApplication.getAppContext(), "com.google.android.apps.assistant");
            boolean m119071u2 = AbstractC23152n3.m119071u(MainApplication.getAppContext(), "com.google.android.apps.youtube.mango");
            boolean m119071u3 = AbstractC23152n3.m119071u(MainApplication.getAppContext(), "com.google.android.gm.lite");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isAndroidGoEdition check Android Go Device: isLowRamDevice ");
            if (activityManager != null && activityManager.isLowRamDevice()) {
                z11 = true;
            } else {
                z11 = false;
            }
            sb2.append(z11);
            sb2.append(" assistantGoInstalled: ");
            sb2.append(m119071u);
            sb2.append(" youtubeGoInstalled: ");
            sb2.append(m119071u2);
            sb2.append(" gmailGoInstalled: ");
            sb2.append(m119071u3);
            AbstractC20110a.m104542k(8, sb2.toString(), new Object[0]);
            if (activityManager != null && activityManager.isLowRamDevice() && (m119071u || m119071u2 || m119071u3)) {
                z12 = true;
            }
            f112068b = Boolean.valueOf(z12);
        }
        return f112068b.booleanValue();
    }

    /* renamed from: u */
    public static boolean m118342u() {
        return "vi".equals(AbstractC18458a.f93019a);
    }

    /* renamed from: v */
    public static boolean m118343v() {
        if (C19172a.m100600k("platform@enable_api_native", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public static boolean m118344w(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals("android.intent.action.VIEW")) {
            return false;
        }
        if (!str2.equals(C31849b1.f146224h) && !str2.equals(C31849b1.f146225i) && !str2.equals(C31849b1.f146226j)) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public static /* synthetic */ void m118345x() {
        C7967l.m42727z().m42739u();
    }

    /* renamed from: y */
    public static /* synthetic */ void m118346y() {
        C7967l.m42727z().m42740v(CoreUtility.f89233i);
    }

    /* renamed from: z */
    public static /* synthetic */ void m118347z() {
        try {
            AbstractC23306f.m120584H0().m2626i();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
