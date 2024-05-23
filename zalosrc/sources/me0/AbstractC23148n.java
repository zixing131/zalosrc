package me0;

import ac.AbstractC0706h;
import ac.C0697c0;
import ac.C0711j0;
import ac.C0722p;
import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import ag0.C0804b;
import ag0.C0809c1;
import ag0.C0856z;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import am.C0943w;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.C1335e1;
import b50.C2556d;
import bp0.AbstractC3096i0;
import bp0.C3080a0;
import com.adtima.Adtima;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.analytics.ZaloAnalytics;
import com.zing.zalo.chathead.ChatHeadUI.ChatHeadTextView;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.maintab.msg.MessagesView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import gw.AbstractC19646n0;
import gw.C19637j;
import hf0.C20048j;
import ho0.AbstractC20110a;
import hu.C20131e;
import j30.C20912a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import jf0.C21242e;
import l30.C22013a0;
import l30.C22021e0;
import l30.C22052u;
import l50.C22094p;
import lr.C22640a;
import mj0.AbstractC23322a;
import ml.C23343a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p019aj.C0872f;
import p019aj.C0874h;
import p111du.AbstractC18069a;
import p133ek.AbstractC18458a;
import p142ey.C18644n;
import p162fh.C18932a;
import p162fh.C18935d;
import p187gk.C19464a;
import p207he.C20024r;
import p263jc.C21216s;
import p268ji.C21270p;
import p269jj.C21275a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p320ld.C22432d;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p368nq.C23926a;
import p392oh.C24265l;
import p398oo.C24380u;
import p405ov.C24559a;
import p420pb.C24709a;
import p421pc.C24720a;
import p445qe.C25244a;
import p455qo.C25432r0;
import p455qo.C25434s0;
import p509sp.C26354c;
import p509sp.C26356e;
import p594w1.C28685a;
import p604wb.C28905e;
import p616wo.C29116a;
import p641xd.C29584h;
import p684yk.InterfaceC31005a;
import p716zh.C31944h6;
import p716zh.C31947h9;
import p716zh.C31994kb;
import p716zh.C32100s1;
import p716zh.C32119t6;
import p716zh.C32178x9;
import r00.C25597b;
import s00.AbstractC26084s;
import s00.C26076k;
import sj.C26275a;
import t00.C26446c;
import th.AbstractC26683d;
import th.AbstractC26689j;
import tn.C26736a;
import tn.C26761p;
import vg.AbstractC28025b8;
import vg.AbstractC28245z3;
import vg.C28050e3;
import yf0.C30946k;

/* renamed from: me0.n */
/* loaded from: classes4.dex */
public abstract class AbstractC23148n {

    /* renamed from: me0.n$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {
        a() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128315s(0, 0);
        }
    }

    /* renamed from: b */
    public static void m118828b(Context context) {
        AbstractC23161o1.m119319d(context);
        AbstractC23160o0.m119271m1();
        C26446c.m136326b().m136332g();
    }

    /* renamed from: c */
    private static void m118829c(JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("inline_promote_config");
            C21275a m120583H = AbstractC23306f.m120583H();
            Map m110203e = m120583H.m110203e();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                HashMap hashMap = new HashMap();
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    C26275a c26275a = new C26275a(optJSONArray.getJSONObject(i11));
                    C26275a c26275a2 = (C26275a) m110203e.get(Integer.valueOf(c26275a.m135171g()));
                    if (c26275a2 != null && c26275a.m135170f() <= c26275a2.m135170f()) {
                        c26275a.m135175k(c26275a2.m135168d());
                    }
                    hashMap.put(Integer.valueOf(c26275a.m135171g()), c26275a);
                }
                m120583H.m110207m(hashMap, C23343a.m122750c(hashMap));
                return;
            }
            m120583H.m110202d();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: d */
    public static short m118830d() {
        String str = AbstractC18458a.f93019a;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case 3241:
                if (str.equals("en")) {
                    c11 = 0;
                    break;
                }
                break;
            case 3500:
                if (str.equals("my")) {
                    c11 = 1;
                    break;
                }
                break;
            case 3763:
                if (str.equals("vi")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            default:
                return (short) 1;
            case 1:
                return (short) 2;
            case 2:
                return (short) 0;
        }
    }

    /* renamed from: e */
    public static int m118831e(int i11) {
        if (i11 == 79) {
            return AbstractC23322a.zds_ic_storage_line_24;
        }
        if (i11 == 102) {
            return AbstractC23322a.zds_ic_help_circle_line_24;
        }
        if (i11 == 123) {
            return AbstractC23322a.zds_ic_zcloud_line_24;
        }
        switch (i11) {
            case 1:
                return AbstractC23322a.zds_ic_lock_line_24;
            case 2:
                return AbstractC23322a.zds_ic_shield_star_line_24;
            case 3:
                return AbstractC23322a.zds_ic_backup_line_24;
            case 4:
                return AbstractC23322a.zds_ic_notif_line_24;
            case 5:
                return AbstractC23322a.zds_ic_chat_line_24;
            case 6:
                return AbstractC23322a.zds_ic_call_line_24;
            case 7:
                return AbstractC23322a.zds_ic_clock_2_line_24;
            case 8:
                return AbstractC23322a.zds_ic_contact_list_line_24;
            case 9:
                return AbstractC23322a.zds_ic_wallpaper_line_24;
            case 10:
                return AbstractC23322a.zds_ic_info_circle_line_24;
            case 11:
                return AbstractC23322a.zds_ic_switch_users_line_24;
            case 12:
                return AbstractC23322a.zds_ic_leave_line_24;
            default:
                return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[RETURN] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m118832f(int i11) {
        String str;
        char c11;
        try {
            str = AbstractC18458a.f93019a;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            return i11;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3241) {
            if (hashCode != 3500) {
                if (hashCode == 3763 && str.equals("vi")) {
                    c11 = 0;
                    if (c11 != 0) {
                        return 0;
                    }
                    if (c11 == 1) {
                        return 1;
                    }
                    if (c11 == 2) {
                        return 3;
                    }
                    return i11;
                }
                c11 = 65535;
                if (c11 != 0) {
                }
            } else {
                if (str.equals("my")) {
                    c11 = 2;
                    if (c11 != 0) {
                    }
                }
                c11 = 65535;
                if (c11 != 0) {
                }
            }
        } else {
            if (str.equals("en")) {
                c11 = 1;
                if (c11 != 0) {
                }
            }
            c11 = 65535;
            if (c11 != 0) {
            }
        }
    }

    /* renamed from: g */
    public static int m118833g(int i11) {
        return m118834h(i11, -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x001d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0020. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0024. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ab  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m118834h(int i11, int i12) {
        if (i11 == 27) {
            return AbstractC23309i.m122572xa() ? 1 : 0;
        }
        if (i11 == 28) {
            return AbstractC23057e7.m118297d() ? 1 : 0;
        }
        if (i11 != 62) {
            if (i11 == 63) {
                return AbstractC23309i.m122156m3() ? 1 : 0;
            }
            if (i11 != 94) {
                if (i11 != 95) {
                    switch (i11) {
                        case 0:
                            return AbstractC23309i.m122461ua() ? 1 : 0;
                        case 1:
                            return AbstractC23309i.m122535wa() ? 1 : 0;
                        case 2:
                            return AbstractC23309i.m122498va() ? 1 : 0;
                        case 3:
                            return AbstractC23309i.m122424ta() ? 1 : 0;
                        case 4:
                            return AbstractC23309i.m122387sa() ? 1 : 0;
                        case 5:
                            return AbstractC23309i.m121490Ud() ? 1 : 0;
                        case 6:
                            return AbstractC23309i.m122350ra();
                        case 7:
                            return AbstractC23309i.m120784Ba();
                        case 8:
                            return AbstractC23309i.m120821Ca() ? 1 : 0;
                        case 9:
                            return AbstractC23309i.m122646za();
                        case 10:
                            return AbstractC23309i.m122413t() ? 1 : 0;
                        case 11:
                            break;
                        case 12:
                            return AbstractC23309i.m121777c3() ? 1 : 0;
                        case 13:
                            return AbstractC23309i.m121825dc() ? 1 : 0;
                        case 14:
                            return AbstractC23309i.m121827de() ? 1 : 0;
                        case 15:
                            return AbstractC23309i.m121106K() ? 1 : 0;
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            return AbstractC23309i.m121527Vd() ? 1 : 0;
                        default:
                            switch (i11) {
                                case 18:
                                    return AbstractC23309i.m121416Sd() ? 1 : 0;
                                case 19:
                                    return AbstractC23309i.m121564Wd() ? 1 : 0;
                                case 20:
                                    if (!AbstractC23309i.m121342Qd() || !AbstractC23034c6.m118112B()) {
                                        return 0;
                                    }
                                    return 1;
                                case 21:
                                    return AbstractC23309i.m121787cc();
                                case 22:
                                    return AbstractC23309i.m121699a0() ? 1 : 0;
                                case 23:
                                    return AbstractC23309i.m122609ya();
                                case 24:
                                    return AbstractC23309i.m122313qa() ? 1 : 0;
                                default:
                                    switch (i11) {
                                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                            if (AbstractC23034c6.m118165m(MainApplication.getAppContext(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
                                                return 0;
                                            }
                                            return 1;
                                        case 31:
                                            if (AbstractC23034c6.m118167n(MainApplication.getAppContext(), new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}) != 0) {
                                                return 0;
                                            }
                                            return 1;
                                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                            return AbstractC23034c6.m118121G() ? 1 : 0;
                                        case 33:
                                            if (AbstractC23034c6.m118167n(MainApplication.getAppContext(), new String[]{"android.permission.RECORD_AUDIO"}) != 0) {
                                                return 0;
                                            }
                                            return 1;
                                        case 34:
                                            if (AbstractC23034c6.m118167n(MainApplication.getAppContext(), new String[]{"android.permission.CAMERA"}) != 0) {
                                                return 0;
                                            }
                                            return 1;
                                        case 35:
                                            return C1335e1.m6691e(MainApplication.getAppContext()).m6695a() ? 1 : 0;
                                        default:
                                            switch (i11) {
                                                case 58:
                                                    return AbstractC23306f.m120676j().m128392I() ? 1 : 0;
                                                case 60:
                                                    return !AbstractC23309i.m121678Zg() ? 1 : 0;
                                                case 73:
                                                    return C20048j.f98580a.m104104c();
                                                case 89:
                                                    return AbstractC23309i.m122276pa();
                                                case 92:
                                                    if (AbstractC23165o5.m119333b() || !AbstractC23309i.m121966h2() || !AbstractC23034c6.m118126L(MainApplication.getAppContext())) {
                                                        return 0;
                                                    }
                                                    return 1;
                                                case 103:
                                                    return AbstractC23309i.m121305Pd() ? 1 : 0;
                                                case 108:
                                                    return AbstractC23309i.m121308Pg() ? 1 : 0;
                                                case 117:
                                                    return C26354c.f125196a.m135672c();
                                                case 120:
                                                    return AbstractC0924m0.m3776ea() ? 1 : 0;
                                                case 126:
                                                    if (AbstractC0924m0.m3240M0() != 1) {
                                                        return 0;
                                                    }
                                                    return 1;
                                                case 128:
                                                    return AbstractC23306f.m120692n().m133023A() ? 1 : 0;
                                                case 141:
                                                    return C24380u.f117739a.mo127507a() ? 1 : 0;
                                                case 143:
                                                    int m4337x5 = AbstractC0924m0.m4337x5();
                                                    if (m4337x5 != 2 && m4337x5 != 1) {
                                                        return 0;
                                                    }
                                                    return 1;
                                                case 147:
                                                    int m4395z5 = AbstractC0924m0.m4395z5();
                                                    if (m4395z5 == 2) {
                                                        if (AbstractC23309i.m122646za() == 0) {
                                                            return 0;
                                                        }
                                                        return 1;
                                                    }
                                                    return m4395z5;
                                                case 149:
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 65:
                                                            return AbstractC23309i.m122450u() ? 1 : 0;
                                                        case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                                                            break;
                                                        case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                                                            break;
                                                        default:
                                                            switch (i11) {
                                                                case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                                                                    return AbstractC23309i.m122127lb();
                                                                case 78:
                                                                    return C23212s8.m119601h();
                                                                case 79:
                                                                    return m118832f(i12);
                                                                case 80:
                                                                    return AbstractC23309i.m122089kb();
                                                                default:
                                                                    return i12;
                                                            }
                                                    }
                                            }
                                    }
                                case 25:
                                    return C3080a0.f13112a.m15417j() ? 1 : 0;
                            }
                    }
                    return !AbstractC23309i.m122126la() ? 1 : 0;
                }
                if (AbstractC23309i.m121776c2() != 1 || !AbstractC23034c6.m118126L(MainApplication.getAppContext())) {
                    return 0;
                }
                return 1;
            }
            if (!AbstractC23309i.m121414Sb() || !AbstractC23034c6.m118112B()) {
                return 0;
            }
            return 1;
        }
        return m118836j(AbstractC23309i.m120822Cb(), i12);
    }

    /* renamed from: i */
    public static String m118835i() {
        return "";
    }

    /* renamed from: j */
    private static int m118836j(String str, int i11) {
        try {
            if (TextUtils.isEmpty(str)) {
                return i11;
            }
            return new JSONObject(str).optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
            return i11;
        }
    }

    /* renamed from: k */
    public static boolean m118837k(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        JSONObject optJSONObject;
        JSONArray jSONArray;
        String str7;
        JSONArray jSONArray2;
        String str8;
        String str9;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        String str10;
        String str11;
        JSONObject optJSONObject4;
        boolean z11;
        boolean z12;
        String str12;
        String str13;
        try {
            try {
                AbstractC23309i.m122333qu(0);
                JSONObject optJSONObject5 = jSONObject.optJSONObject("settings");
                int optInt = jSONObject.optInt("error_code", -1);
                if (optJSONObject5 != null && optInt == 0) {
                    JSONObject optJSONObject6 = optJSONObject5.optJSONObject("remind_config");
                    if (optJSONObject6 == null) {
                        str = "onboard_zinstant_on_setting";
                        str2 = "chat_label";
                    } else {
                        JSONObject optJSONObject7 = optJSONObject6.optJSONObject("contact_permission");
                        if (optJSONObject7 != null) {
                            str = "onboard_zinstant_on_setting";
                            str2 = "chat_label";
                            AbstractC23309i.m121797cm(optJSONObject7.optInt("enable_mini_banner", 0));
                        } else {
                            str = "onboard_zinstant_on_setting";
                            str2 = "chat_label";
                        }
                        JSONObject optJSONObject8 = optJSONObject6.optJSONObject("contact_submission");
                        if (optJSONObject8 != null) {
                            AbstractC23309i.m121360Qv(optJSONObject8.toString());
                        }
                        JSONObject optJSONObject9 = optJSONObject6.optJSONObject("notification_permission");
                        if (optJSONObject9 != null) {
                            AbstractC23309i.m121397Rv(optJSONObject9.toString());
                        }
                        if (optJSONObject6.has("database_password")) {
                            JSONObject optJSONObject10 = optJSONObject6.optJSONObject("database_password");
                            if (optJSONObject10 == null) {
                                str13 = "";
                            } else {
                                str13 = optJSONObject10.toString();
                            }
                            AbstractC0924m0.m2935Be(str13);
                            C2556d.m12981o().m12985E();
                        }
                        if (optJSONObject6.has("cloud_database")) {
                            AbstractC23306f.m120676j().m128389F(optJSONObject6.optJSONObject("cloud_database"));
                        }
                    }
                    JSONObject optJSONObject11 = optJSONObject5.optJSONObject("seasonalEffect");
                    JSONObject optJSONObject12 = optJSONObject5.optJSONObject("seasonalSticker");
                    if (optJSONObject11 != null) {
                        AbstractC23306f.m120726x1().mo150748l(optJSONObject11.toString());
                    }
                    if (optJSONObject12 != null) {
                        InterfaceC31005a m120726x1 = AbstractC23306f.m120726x1();
                        if (m120726x1.mo150752p() == null) {
                            str12 = "";
                        } else {
                            str12 = m120726x1.mo150752p().m153583e();
                        }
                        m120726x1.mo150745i(optJSONObject12.toString());
                        C31947h9 mo150752p = m120726x1.mo150752p();
                        if (mo150752p != null && (TextUtils.isEmpty(str12) || !TextUtils.equals(str12, mo150752p.m153583e()))) {
                            AbstractC23309i.m122630yv(true);
                        }
                    }
                    JSONObject optJSONObject13 = optJSONObject5.optJSONObject("seasonalFeedBG");
                    if (optJSONObject13 != null) {
                        AbstractC23309i.m122446tw(optJSONObject13.toString());
                        AbstractC23304d.m120550u();
                    }
                    JSONObject optJSONObject14 = optJSONObject5.optJSONObject("replySticker");
                    if (optJSONObject14 != null) {
                        AbstractC23306f.m120726x1().mo150741e(optJSONObject14.toString());
                    }
                    JSONObject optJSONObject15 = optJSONObject5.optJSONObject("sticker_popup");
                    if (optJSONObject15 != null) {
                        boolean optBoolean = optJSONObject15.optBoolean("auto_play_in_bubble", true);
                        AbstractC23309i.m121795ck(optJSONObject15.optBoolean("auto_play_in_banner", true));
                        AbstractC23309i.m121947gk(optJSONObject15.optBoolean("auto_play_in_panel", true));
                        AbstractC23309i.m121909fk(optJSONObject15.optBoolean("auto_play_in_popup", true));
                        AbstractC23309i.m121871ek(optJSONObject15.optBoolean("auto_play_in_panel", true));
                        AbstractC23309i.m121833dk(optBoolean);
                        if (optBoolean && optJSONObject15.optBoolean("enable", true)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        AbstractC23309i.m121425Sm(z11);
                        if (optJSONObject15.optInt("zanim_decoder_single_mode", 1) == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        AbstractC23309i.m121130Kn(z12);
                        AbstractC0924m0.m3173Jk(optJSONObject15.optLong("min_memory_allow_cache_in_single_mode", 5368709120L));
                    }
                    JSONObject optJSONObject16 = optJSONObject5.optJSONObject("showPopupMaintab");
                    if (optJSONObject16 != null) {
                        AbstractC23309i.m122073jx(optJSONObject16.toString());
                        AbstractC23304d.m120552w();
                    }
                    JSONArray optJSONArray = optJSONObject5.optJSONArray("searchFunctions");
                    if (optJSONArray != null) {
                        AbstractC23309i.m122409sw(optJSONArray.toString());
                        C32119t6.m155009c().m155019j();
                        C32119t6.m155009c().m155021m();
                    }
                    JSONObject optJSONObject17 = optJSONObject5.optJSONObject("ss_group");
                    if (optJSONObject17 != null) {
                        AbstractC23309i.m121242No(optJSONObject17.toString());
                        AbstractC23188q6.m119485c(true);
                    }
                    JSONObject optJSONObject18 = optJSONObject5.optJSONObject("welcomeMember");
                    if (optJSONObject18 == null) {
                        str3 = "";
                    } else {
                        str3 = optJSONObject18.toString();
                    }
                    AbstractC23309i.m121353Qo(str3);
                    JSONObject optJSONObject19 = optJSONObject5.optJSONObject("globalSearchSetting");
                    if (optJSONObject19 == null) {
                        str4 = "comm4work";
                    } else {
                        int optInt2 = optJSONObject19.optInt("maxItemContactView");
                        int optInt3 = optJSONObject19.optInt("maxItemGroupView", 3);
                        int optInt4 = optJSONObject19.optInt("maxItemOAView");
                        int optInt5 = optJSONObject19.optInt("maxItemSearchSuggest");
                        int optInt6 = optJSONObject19.optInt("maxItemRecentContactView_Horizontal", 10);
                        str4 = "comm4work";
                        int optInt7 = optJSONObject19.optInt("maxItemRecentOAView_Horizontal", 3);
                        AbstractC23309i.m121880et(optInt4);
                        AbstractC23309i.m121767bt(optInt2);
                        AbstractC23309i.m121804ct(optInt3);
                        AbstractC23309i.m121729at(optInt5);
                        AbstractC23309i.m121842dt(optInt6);
                        AbstractC23309i.m121690Zs(optInt7);
                    }
                    JSONObject optJSONObject20 = optJSONObject5.optJSONObject("mediaBoxSetting");
                    if (optJSONObject20 != null) {
                        int optInt8 = optJSONObject20.optInt("maxItemMessage");
                        int optInt9 = optJSONObject20.optInt("maxItemSuggestOA");
                        AbstractC23309i.m121616Xs(optInt8);
                        AbstractC23309i.m121918ft(optInt9);
                    }
                    JSONObject optJSONObject21 = optJSONObject5.optJSONObject("sendToMeInfo");
                    if (optJSONObject21 != null) {
                        AbstractC21935u.m114525O(optJSONObject21);
                        AbstractC0924m0.m3175Jm(optJSONObject21.toString());
                    }
                    JSONObject optJSONObject22 = optJSONObject5.optJSONObject("photoSuggestSetting");
                    if (optJSONObject22 != null) {
                        AbstractC23306f.m120562A().m2558r0(optJSONObject22.toString());
                    }
                    JSONArray optJSONArray2 = optJSONObject5.optJSONArray("reactionMsgInfo");
                    if (optJSONArray2 != null) {
                        AbstractC23309i.m121175Lv(optJSONArray2.toString());
                        C24265l.m126676s().m126687N();
                    }
                    JSONArray optJSONArray3 = optJSONObject5.optJSONArray("liveEmojiInfo");
                    if (optJSONArray3 != null) {
                        AbstractC23309i.m122664zs(optJSONArray3.toString());
                        C0874h.f3217a.m2587b();
                    }
                    JSONObject optJSONObject23 = optJSONObject5.optJSONObject("default_reaction");
                    if (optJSONObject23 != null) {
                        String jSONObject2 = optJSONObject23.toString();
                        AbstractC23309i.m122581xj(jSONObject2);
                        C24265l.m126676s().m126686K(jSONObject2);
                    }
                    String optString = optJSONObject5.optString("featurehtml", "");
                    if (!optString.equals(AbstractC23309i.m121741b4())) {
                        ArrayList arrayList = new ArrayList(C21242e.m110039d().m110044e());
                        AbstractC23309i.m121799co(optString);
                        C21242e.m110043o();
                        C23177p6.m119386c().m119395i(arrayList);
                        Intent intent = new Intent();
                        intent.setAction("com.zing.zalo.ACTION_UPDATE_FEATURE_HTML");
                        C28685a.m143693b(MainApplication.getAppContext()).m143696d(intent);
                    }
                    JSONObject optJSONObject24 = optJSONObject5.optJSONObject("oaFollowSetting");
                    if (optJSONObject24 != null) {
                        AbstractC23309i.m122365rp(optJSONObject24.optLong("expiredTime", 86400000L));
                        AbstractC23309i.m121178Ly(AbstractC23309i.m121555W4());
                    }
                    JSONObject optJSONObject25 = optJSONObject5.optJSONObject("notification_menu");
                    if (optJSONObject25 != null) {
                        int optInt10 = optJSONObject25.optInt("friend_suggestion", 0);
                        int optInt11 = optJSONObject25.optInt("friend_accept", 0);
                        int optInt12 = optJSONObject25.optInt("friend_request", 0);
                        int optInt13 = optJSONObject25.optInt("chat_single", 0);
                        int optInt14 = optJSONObject25.optInt("chat_group", 0);
                        int optInt15 = optJSONObject25.optInt("min_msg_accept_mute", 3);
                        AbstractC23309i.m121957gu(optInt10);
                        AbstractC23309i.m121881eu(optInt11);
                        AbstractC23309i.m121919fu(optInt12);
                        AbstractC23309i.m121843du(optInt13);
                        AbstractC23309i.m121805cu(optInt14);
                        AbstractC23309i.m121995hu(optInt15);
                    }
                    JSONObject optJSONObject26 = optJSONObject5.optJSONObject("abuse_config");
                    if (optJSONObject26 != null) {
                        AbstractC23309i.m122246oh(optJSONObject26.toString());
                    }
                    if (AbstractC26683d.f126393l) {
                        JSONObject optJSONObject27 = optJSONObject5.optJSONObject("emoticonEffect");
                        if (optJSONObject27 != null) {
                            AbstractC23309i.m121237Nj(optJSONObject27.toString());
                            C28050e3.m141486l().m141501n(optJSONObject27);
                        }
                        JSONObject optJSONObject28 = optJSONObject5.optJSONObject("emoticonEffectConfig");
                        if (optJSONObject28 != null) {
                            AbstractC23309i.m121274Oj(optJSONObject28.toString());
                            AbstractC28245z3.m142220c(optJSONObject28);
                        }
                    }
                    JSONArray optJSONArray4 = optJSONObject5.optJSONArray("actionFooterMsg");
                    if (optJSONArray4 != null) {
                        AbstractC23309i.m122549wo(optJSONArray4.toString());
                        AbstractC23304d.m120547r();
                    } else {
                        AbstractC23304d.m120532c();
                        AbstractC23309i.m122549wo("");
                    }
                    JSONObject optJSONObject29 = optJSONObject5.optJSONObject("parse_message_detail");
                    if (optJSONObject29 != null) {
                        if (optJSONObject29.has("valid_suffix_link")) {
                            AbstractC0924m0.m4171rf(optJSONObject29.optString("valid_suffix_link"));
                            C31944h6.m153531P();
                        }
                        if (optJSONObject29.has("white_list_domain")) {
                            AbstractC0924m0.m4201sf(optJSONObject29.optString("white_list_domain"));
                            C31944h6.m153532Q();
                        }
                    }
                    JSONObject optJSONObject30 = optJSONObject5.optJSONObject("ZInstantDiscovery");
                    if (optJSONObject30 == null) {
                        str5 = "";
                    } else {
                        str5 = optJSONObject30.toString();
                    }
                    AbstractC23309i.m121936gA(str5);
                    JSONObject optJSONObject31 = optJSONObject5.optJSONObject("ZInstantDiscoveryStreamLine");
                    if (optJSONObject31 == null) {
                        str6 = "";
                    } else {
                        str6 = optJSONObject31.toString();
                    }
                    AbstractC23309i.m121974hA(str6);
                    m118829c(optJSONObject5);
                    JSONObject optJSONObject32 = optJSONObject5.optJSONObject("theme_config");
                    if (optJSONObject32 != null && (optJSONObject4 = optJSONObject32.optJSONObject("theme")) != null) {
                        C31994kb.m154233h().m154251t(optJSONObject4.toString());
                    }
                    if (optJSONObject5.has("voip") && !optJSONObject5.isNull("voip") && (optJSONObject2 = optJSONObject5.optJSONObject("voip")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("dynamic_call_entrypoint")) != null) {
                        if (!optJSONObject3.has("all")) {
                            str10 = "";
                        } else {
                            str10 = optJSONObject3.optString("all");
                        }
                        if (!optJSONObject3.has("wish_list")) {
                            str11 = "";
                        } else {
                            str11 = optJSONObject3.optString("wish_list");
                        }
                        if (!TextUtils.isEmpty(str10) && !TextUtils.isEmpty(str11)) {
                            C32100s1.m154953d().m154962i(str10, str11);
                        } else if (!TextUtils.isEmpty(str10)) {
                            C32100s1.m154953d().m154964n(str10);
                        } else if (!TextUtils.isEmpty(str11)) {
                            C32100s1.m154953d().m154965o(str11);
                        }
                    }
                    JSONObject optJSONObject33 = optJSONObject5.optJSONObject("inapp_browser_config");
                    JSONObject jSONObject3 = null;
                    if (optJSONObject33 != null) {
                        JSONObject optJSONObject34 = optJSONObject33.optJSONObject("jumplink");
                        if (optJSONObject34 != null) {
                            jSONArray = optJSONObject34.optJSONArray("domain_skip_jump");
                        } else {
                            jSONArray = null;
                        }
                        if (jSONArray == null) {
                            str7 = "";
                        } else {
                            str7 = jSONArray.toString();
                        }
                        AbstractC23309i.m121015Hj(str7);
                        if (optJSONObject34 != null) {
                            jSONArray2 = optJSONObject34.optJSONArray("actions_for_skip_jump");
                        } else {
                            jSONArray2 = null;
                        }
                        if (jSONArray2 == null) {
                            str8 = "";
                        } else {
                            str8 = jSONArray2.toString();
                        }
                        AbstractC23309i.m122468uh(str8);
                        JSONObject optJSONObject35 = optJSONObject33.optJSONObject("mini_program_config");
                        if (optJSONObject35 != null) {
                            long optLong = optJSONObject35.optLong("keep_instance_time", 20L) * 1000;
                            C30946k.Companion.m150532e(optLong);
                            AbstractC0924m0.m4061np(optLong);
                            AbstractC0924m0.m2912Ak(optJSONObject35.optInt("max_stack", 3));
                        }
                        JSONArray optJSONArray5 = optJSONObject33.optJSONArray("malicious_mime_types");
                        if (optJSONArray5 == null) {
                            str9 = "";
                        } else {
                            str9 = optJSONArray5.toString();
                        }
                        AbstractC23309i.m121320Ps(str9);
                    }
                    String str14 = str4;
                    if (!optJSONObject5.isNull(str14)) {
                        JSONObject optJSONObject36 = optJSONObject5.optJSONObject(str14);
                        if (optJSONObject36 != null) {
                            String str15 = str2;
                            if (!optJSONObject36.isNull(str15)) {
                                JSONObject jSONObject4 = optJSONObject36.getJSONObject(str15);
                                if (!jSONObject4.isNull("onboard_zinstant")) {
                                    AbstractC0924m0.m3486Ue(jSONObject4.getJSONObject("onboard_zinstant").toString());
                                }
                                String str16 = str;
                                if (!jSONObject4.isNull(str16)) {
                                    AbstractC0924m0.m3515Ve(jSONObject4.getJSONObject(str16).toString());
                                }
                            }
                        }
                        if (optJSONObject36 != null && !optJSONObject36.isNull("quick_message")) {
                            JSONObject jSONObject5 = optJSONObject36.getJSONObject("quick_message");
                            if (!jSONObject5.isNull("onboard_zinstant")) {
                                AbstractC0924m0.m3544We(jSONObject5.getJSONObject("onboard_zinstant").toString());
                            }
                        }
                    }
                    C25597b.m132222d().m132225f(optJSONObject5.optJSONObject("latest_version_configs"));
                    if (optJSONObject5.has("zaloAnalytics") && !optJSONObject5.isNull("zaloAnalytics")) {
                        JSONObject optJSONObject37 = optJSONObject5.optJSONObject("zaloAnalytics");
                        if (optJSONObject37 != null) {
                            ZaloAnalytics.C7293b c7293b = ZaloAnalytics.Companion;
                            if (!c7293b.m37219b().m37205X()) {
                                c7293b.m37220c(C23793c.m124316k(), optJSONObject37);
                                AbstractC0706h.a aVar = AbstractC0706h.Companion;
                                aVar.m1069b(false);
                                aVar.m1068a(false, C20131e.m104924r0());
                                C0711j0.Companion.m1104a().m1102w(C0722p.b.APP_LAUNCHER);
                                if (ZaloLauncherActivity.m57070R5() instanceof InterfaceC0733x) {
                                    C0697c0.Companion.m1048b().m1043u(((InterfaceC0733x) ZaloLauncherActivity.m57070R5()).getTrackingKey());
                                } else {
                                    C0697c0.Companion.m1048b().m1043u(MessagesView.f63530k3);
                                }
                            }
                            AbstractC0924m0.m4329wq(optJSONObject37.toString());
                        } else {
                            if (CoreUtility.f89239o) {
                                C0697c0.b bVar = C0697c0.Companion;
                                bVar.m1048b().m1035h(bVar.m1048b().m1038m());
                                C0711j0.Companion.m1104a().m1094k(C0722p.a.NORMAL_END);
                            }
                            ZaloAnalytics.Companion.m37218a();
                            AbstractC0924m0.m4329wq("");
                        }
                    } else {
                        if (CoreUtility.f89239o) {
                            C0697c0.b bVar2 = C0697c0.Companion;
                            bVar2.m1048b().m1035h(bVar2.m1048b().m1038m());
                            C0711j0.Companion.m1104a().m1094k(C0722p.a.NORMAL_END);
                        }
                        ZaloAnalytics.Companion.m37218a();
                        AbstractC0924m0.m4329wq("");
                    }
                    if (optJSONObject5.has("business_account") && (optJSONObject = optJSONObject5.optJSONObject("business_account")) != null && optJSONObject.has("block_limit_reply_stranger_chat")) {
                        jSONObject3 = optJSONObject.optJSONObject("block_limit_reply_stranger_chat");
                    }
                    C29584h.f136523a.m147009j(jSONObject3);
                    if (optJSONObject5.has("syncActionMedia")) {
                        AbstractC23306f.m120573D1().m109953O(optJSONObject5.optJSONObject("syncActionMedia"));
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            AbstractC26683d.m137044d();
            return true;
        } catch (Throwable th2) {
            AbstractC26683d.m137044d();
            throw th2;
        }
    }

    /* renamed from: l */
    public static void m118838l() {
        int i11;
        Context m118649F;
        try {
            AtomicBoolean atomicBoolean = AbstractC23304d.f113362b;
            if (atomicBoolean.get() && !AbstractC23304d.f113372d.isEmpty()) {
                return;
            }
            synchronized (atomicBoolean) {
                try {
                    if (atomicBoolean.get()) {
                        if (AbstractC23304d.f113372d.isEmpty()) {
                        }
                    }
                    String[] strArr = AbstractC23304d.f113367c;
                    if (strArr == null || strArr.length == 0) {
                        AbstractC23304d.f113367c = MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_language_as_code);
                    }
                    AbstractC23304d.f113372d.add(new C32178x9(2, 2, AbstractC8020f0.str_setting_account_title, 0, 0, false, 38));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 1, AbstractC8020f0.str_title_setting_private, 0, 0, false, 37));
                    if (C20912a.m109395e().m109406m()) {
                        AbstractC23304d.f113372d.add(new C32178x9(79, 79, AbstractC8020f0.str_tool_storage_title_ver_zcloud, 0, 0, false, 109));
                    }
                    AbstractC23304d.f113372d.add(new C32178x9(3, 3, AbstractC8020f0.str_syncmes_sync_title, 0, 0, false, 39));
                    AbstractC23304d.f113372d.add(new C32178x9(3, 95, AbstractC8020f0.str_setting_backup_e2ee, 0, 0, true, 128));
                    AbstractC23304d.f113372d.add(new C32178x9(4, 4, AbstractC8020f0.str_setting_notification_title, 0, 0, false, 40));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 5, AbstractC8020f0.str_setting_message_title, 0, 0, false, 41));
                    AbstractC23304d.f113372d.add(new C32178x9(7, 7, AbstractC8020f0.setting_section_timeline, 0, 0, false, 43));
                    AbstractC23304d.f113372d.add(new C32178x9(6, 6, AbstractC8020f0.str_call_setting, 0, 0, false, 42));
                    AbstractC23304d.f113372d.add(new C32178x9(8, 8, AbstractC8020f0.str_index_setting_contact_des, 0, 0, false, 44));
                    AbstractC23304d.f113372d.add(new C32178x9(9, 9, AbstractC8020f0.setting_theme_title, 0, 0, false, 45));
                    AbstractC23304d.f113372d.add(new C32178x9(10, 10, AbstractC8020f0.str_index_setting_about_des, 0, 0, false, 46));
                    AbstractC23304d.f113372d.add(new C32178x9(102, 102, AbstractC8020f0.setting_support_title, 0, 0, false, 83));
                    AbstractC23304d.f113372d.add(new C32178x9(11, 11, AbstractC8020f0.str_header_switch_account, 0, 0, false, 47));
                    AbstractC23304d.f113372d.add(new C32178x9(12, 12, AbstractC8020f0.menuframe_change_acc, 0, 0, false, 48));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 24, AbstractC8020f0.str_setting_birthday_title, 0, 0, false, 9));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 116, AbstractC8020f0.setting_privacy_birthday, 0, 0, false, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 80, AbstractC8020f0.setting_privacy_online_status, 0, 0, true, 108));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 18, AbstractC8020f0.setting_privacy_seen_status, 0, 0, true, 5));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 19, AbstractC8020f0.setting_privacy_allow_msg, 0, 0, true, 23));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 23, AbstractC8020f0.setting_privacy_allow_call, 0, 0, true, 25));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 96, AbstractC8020f0.setting_privacy_allow_view_and_comment, 0, 0, false, 133));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 16, AbstractC8020f0.setting_privacy_auto_add_friend_from_native_phone_book, 0, 0, true, 24));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 17, AbstractC8020f0.setting_privacy_manage_friend_request_src, 0, 0, false, 49));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 97, AbstractC8020f0.setting_privacy_utility, 0, 0, false, 134));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 29, AbstractC8020f0.setting_privacy_app, 0, 0, false, 90));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 98, AbstractC8020f0.setting_privacy_block_and_hide, 0, 0, false, 135));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 22, AbstractC8020f0.setting_privacy_allow_feed, 0, 0, true, 8));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 21, AbstractC8020f0.setting_privacy_allow_photo, 0, 0, true, 7));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 20, AbstractC8020f0.setting_privacy_allow_comment, 0, 0, true, 6));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 51, AbstractC8020f0.setting_privacy_block_msg, 0, 0, false, 68));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 117, AbstractC8020f0.title_setting_block_call, 0, 0, false, 141));
                    if (AbstractC0924m0.m4075o9()) {
                        AbstractC23304d.f113372d.add(new C32178x9(1, 82, AbstractC8020f0.setting_privacy_block_timeline, 0, 0, false, 117));
                        AbstractC23304d.f113372d.add(new C32178x9(1, 84, AbstractC8020f0.setting_privacy_block_story, 0, 0, false, 119));
                        AbstractC23304d.f113372d.add(new C32178x9(1, 83, AbstractC8020f0.setting_privacy_hide_timeline, 0, 0, false, 118));
                    }
                    AbstractC23304d.f113372d.add(new C32178x9(1, 99, AbstractC8020f0.setting_privacy_allow_search_phone_number, 0, 0, false, 0));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 100, AbstractC8020f0.setting_section_allow_stranger_add_friend, 0, 0, false, ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4));
                    if (AbstractC0924m0.m4332x0() == 1) {
                        AbstractC23304d.f113372d.add(new C32178x9(1, 85, AbstractC8020f0.setting_privacy_auto_qr_photo, 0, 0, true, 120));
                    }
                    AbstractC23304d.f113372d.add(new C32178x9(1, 114, AbstractC8020f0.str_setting_opt_in_out_bank_card_csc, 0, 0, true, 143));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 101, AbstractC8020f0.str_jump_link_setting_title, 0, 0, false, 136));
                    AbstractC23304d.f113372d.add(new C32178x9(2, 25, AbstractC8020f0.str_account_security_item_history_login_title, 0, 0, false, 53));
                    AbstractC23304d.f113372d.add(new C32178x9(2, 26, AbstractC8020f0.str_account_security_item_phone_number_search_keyword, 0, 0, false, 51));
                    AbstractC23304d.f113372d.add(new C32178x9(2, 120, AbstractC8020f0.str_account_security_item_my_qr_title, 0, 0, false, 148));
                    AbstractC23304d.f113372d.add(new C32178x9(2, 115, AbstractC8020f0.setting_verify_account_title, 0, 0, false, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444));
                    AbstractC23304d.f113372d.add(new C32178x9(2, 27, AbstractC8020f0.str_account_security_item_password_search_keyword, 0, 0, false, 54));
                    AbstractC23304d.f113372d.add(new C32178x9(2, 28, AbstractC8020f0.setting_passcode_title, 0, 0, false, 55));
                    AbstractC23304d.f113372d.add(new C32178x9(2, 86, AbstractC8020f0.str_title_security_checkub, 0, 0, false, 121));
                    AbstractC23304d.f113372d.add(new C32178x9(2, 32, AbstractC8020f0.setting_account_manage_deactivate_title, 0, 0, false, 52));
                    AbstractC23304d.f113372d.add(new C32178x9(2, 89, AbstractC8020f0.str_2fa_login_title, AbstractC8020f0.str_2fa_login_desc, 0, true, 126));
                    AbstractC23304d.f113372d.add(new C32178x9(4, 37, AbstractC8020f0.setting_chat_11_title, 0, 0, true, 10));
                    AbstractC23304d.f113372d.add(new C32178x9(4, 39, AbstractC8020f0.setting_noti_group_title, 0, 0, false, 64));
                    AbstractC23304d.f113372d.add(new C32178x9(4, 40, AbstractC8020f0.setting_noti_feed_title, 0, 0, false, 62));
                    AbstractC23304d.f113372d.add(new C32178x9(4, 41, AbstractC8020f0.setting_noti_birthday_title, 0, 0, true, 12));
                    AbstractC23304d.f113372d.add(new C32178x9(4, 42, AbstractC8020f0.str_setting1, 0, 0, true, 13));
                    AbstractC23304d.f113372d.add(new C32178x9(4, 43, AbstractC8020f0.str_setting2, 0, 0, true, 14));
                    AbstractC23304d.f113372d.add(new C32178x9(4, 44, AbstractC8020f0.setting_noti_in_app, 0, 0, true, 63));
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 26) {
                        AbstractC23304d.f113372d.add(new C32178x9(4, 45, AbstractC8020f0.str_manage_noti_system, 0, 0, false, 111));
                    }
                    AbstractC23304d.f113372d.add(new C32178x9(4, 93, AbstractC8020f0.str_call_setting_notif_toggle, 0, 0, true, 131));
                    AbstractC23304d.f113372d.add(new C32178x9(4, 94, AbstractC8020f0.str_call_setting_notif_except, 0, 0, false, 132));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 46, AbstractC8020f0.str_setting6, 0, 0, true, 15));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 47, AbstractC8020f0.setting_enter_send_msg_title, 0, 0, true, 22));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 48, AbstractC8020f0.str_suggest_sticker_chat, 0, 0, true, 16));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 81, AbstractC8020f0.setting_bubble_chat_title, 0, 0, false, 114));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 50, AbstractC8020f0.str_setting_video_auto_play, 0, 0, false, 67));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 91, AbstractC8020f0.str_setting_quick_message_title, 0, 0, false, 127));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 103, AbstractC8020f0.setting_floating_emoji_title, 0, 0, false, 138));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 104, AbstractC8020f0.setting_suggest_new_photo_title, 0, 0, false, 139));
                    if (AbstractC26689j.m137085L()) {
                        i11 = AbstractC8020f0.setting_photo_and_video_hd_title;
                    } else {
                        i11 = AbstractC8020f0.setting_photo_hd_title;
                    }
                    AbstractC23304d.f113372d.add(new C32178x9(5, 105, i11, 0, 0, false, 140));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 106, AbstractC8020f0.str_setting_display_msg, 0, 0, false, 93));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 108, AbstractC8020f0.str_setting_on_off_chat_label_2, 0, 0, false, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 52, AbstractC8020f0.str_title_hidden_chat, 0, 0, false, 69));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 75, AbstractC8020f0.change_code_title_setting, 0, 0, false, 70));
                    AbstractC23304d.f113372d.add(new C32178x9(5, 76, AbstractC8020f0.cancel_hidden_chat_title, 0, 0, false, 71));
                    AbstractC23304d.f113372d.add(new C32178x9(6, 53, AbstractC8020f0.setting_noti_miss_call_title, 0, 0, true, 20));
                    AbstractC23304d.f113372d.add(new C32178x9(6, 54, AbstractC8020f0.setting_sync_history_call_title, AbstractC8020f0.str_setting_native_call_bubble_des, 0, true, 94));
                    AbstractC23304d.f113372d.add(new C32178x9(6, 55, AbstractC8020f0.str_setting_call_mini_mode, AbstractC8020f0.str_setting_call_mini_mode_des, 0, true, 95));
                    AbstractC23304d.f113372d.add(new C32178x9(6, 56, AbstractC8020f0.setting_privacy_allow_call, 0, 0, true, 149));
                    if (m118840n()) {
                        AbstractC23304d.f113372d.add(new C32178x9(6, 88, AbstractC8020f0.str_call_ring_tone, 0, 0, true, 124));
                    }
                    if (AbstractC3096i0.m15564t().booleanValue()) {
                        AbstractC23304d.f113372d.add(new C32178x9(6, 90, AbstractC8020f0.str_call_ring_back_tone, 0, 0, true, 129));
                    }
                    AbstractC23304d.f113372d.add(new C32178x9(7, 57, AbstractC8020f0.str_setting_video_auto_play, 0, 0, false, 73));
                    AbstractC23304d.f113372d.add(new C32178x9(7, 58, AbstractC8020f0.str_suggest_sticker_feed, 0, 0, true, 103));
                    AbstractC23304d.f113372d.add(new C32178x9(7, 109, AbstractC8020f0.str_music_setting_auto_play_title, 0, 0, true, 117));
                    AbstractC23304d.f113372d.add(new C32178x9(7, 113, AbstractC8020f0.setting_filter_timeline_title, 0, 0, false, 141));
                    if (AbstractC0924m0.m4105p9() & (!AbstractC0924m0.m4075o9())) {
                        AbstractC23304d.f113372d.add(new C32178x9(7, 59, AbstractC8020f0.str_setting_timeline_blocked_list_title, 0, 0, false, 74));
                        AbstractC23304d.f113372d.add(new C32178x9(7, 60, AbstractC8020f0.str_setting_timeline_hided_list_title, 0, 0, false, 75));
                        AbstractC23304d.f113372d.add(new C32178x9(7, 61, AbstractC8020f0.str_setting_story_blocked_list_title, 0, 0, false, 76));
                    }
                    AbstractC23304d.f113372d.add(new C32178x9(8, 14, AbstractC8020f0.str_setting_update_phonebook, 0, 0, false, 102));
                    AbstractC23304d.f113372d.add(new C32178x9(8, 13, AbstractC8020f0.str_setting_show_activefriend, 0, 0, false, 77));
                    AbstractC23304d.f113372d.add(new C32178x9(9, 72, AbstractC8020f0.str_search_setting_theme_light, 0, 0, false, 78));
                    AbstractC23304d.f113372d.add(new C32178x9(9, 73, AbstractC8020f0.str_search_setting_theme_dark, 0, 0, false, 78));
                    if (i12 >= 29) {
                        AbstractC23304d.f113372d.add(new C32178x9(9, 77, AbstractC8020f0.str_setting_auto_change_theme_title, 0, 0, false, 78));
                    }
                    AbstractC23304d.f113372d.add(new C32178x9(9, 62, AbstractC8020f0.setting_change_language_title, 0, 0, false, 79));
                    AbstractC23304d.f113372d.add(new C32178x9(9, 63, AbstractC8020f0.setting_change_font_title, 0, 0, false, 80));
                    AbstractC23304d.f113372d.add(new C32178x9(9, 64, AbstractC8020f0.setting_change_size_text_title, 0, 0, false, 97));
                    AbstractC23304d.f113372d.add(new C32178x9(10, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10, AbstractC8020f0.setting_current_version, 0, 0, false, 81));
                    AbstractC23304d.f113372d.add(new C32178x9(10, 65, AbstractC8020f0.str_feature_instruction, 0, 0, false, 84));
                    AbstractC23304d.f113372d.add(new C32178x9(10, 71, AbstractC8020f0.str_contact_page_support, 0, 0, false, 83));
                    AbstractC23304d.f113372d.add(new C32178x9(10, 111, AbstractC8020f0.str_send_qos_log, 0, 0, false, 88));
                    AbstractC23304d.f113372d.add(new C32178x9(10, 112, AbstractC8020f0.str_terms_of_service, 0, 0, false, 85));
                    AbstractC23304d.f113372d.add(new C32178x9(1, 119, AbstractC8020f0.str_setting_notify_friend_about_my_birthday, 0, 0, true, 147));
                    if (AbstractC23306f.m120636Y1().m128520b()) {
                        AbstractC23304d.f113372d.add(new C32178x9(123, 123, AbstractC8020f0.str_zcloud_branding, 0, 0, false, 125));
                    }
                    if (AbstractC23304d.f113367c != null) {
                        int i13 = 0;
                        while (true) {
                            String[] strArr2 = AbstractC23304d.f113367c;
                            if (i13 >= strArr2.length) {
                                break;
                            }
                            if (strArr2[i13].equalsIgnoreCase(AbstractC18458a.f93019a)) {
                                m118649F = MainApplication.getAppContext();
                            } else {
                                m118649F = AbstractC23136l9.m118649F(new Locale(AbstractC23304d.f113367c[i13]));
                            }
                            Iterator<E> it = AbstractC23304d.f113372d.iterator();
                            while (it.hasNext()) {
                                C32178x9 c32178x9 = (C32178x9) it.next();
                                c32178x9.f148376E.put(AbstractC23304d.f113367c[i13], m118649F.getText(c32178x9.f148388v).toString());
                            }
                            i13++;
                        }
                    }
                    AbstractC23304d.f113362b.set(true);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public static void m118839m(String str) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.m

            /* renamed from: p */
            public final /* synthetic */ String f112255p;

            public /* synthetic */ RunnableC23137m(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23148n.m118842p(r1);
            }
        });
    }

    /* renamed from: n */
    public static boolean m118840n() {
        int i11 = AbstractC23304d.f113267D1;
        if (i11 == 1 || i11 == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m118841o() {
        return AbstractC23309i.m122577xf();
    }

    /* renamed from: p */
    public static /* synthetic */ void m118842p(String str) {
        List list;
        try {
            AbstractC19646n0.m102949Y1();
            AbstractC23309i.m120909Eo(0L);
            C7960e.m41971c6().m42140H5();
            C7960e.m41971c6().m42301W5();
            C0804b.m2025g().m2034k();
            C0856z.m2393m().m2406q();
            C26761p.m137741q().m137749A();
            C26736a.m137532e().m137540g();
            if (C22013a0.m114928g()) {
                C22052u.m115085y().m115089S();
            }
            C28905e.m144373n().m144395q();
            C0943w.m4462l().m4474h();
            C7960e.m41971c6().m42151I6();
            C7960e.m41971c6().m42188L5();
            C7960e.m41971c6().m42368d6();
            AbstractC23306f.m120562A().m2565w("");
            C20024r.m103936b();
            if (AbstractC23309i.m122562x0() == 1 && (list = AbstractC23304d.f113293K) != null) {
                synchronized (list) {
                    AbstractC23304d.f113293K.clear();
                    AbstractC23304d.f113293K = C24709a.m128299t(MainApplication.getAppContext()).m128301E(0, -1);
                }
                AbstractC23304d.f113318Q0 = System.currentTimeMillis();
            }
            AbstractC23304d.f113256A2.set(true);
            C0809c1.m2050b(new a());
            C19464a.m101788g();
            AbstractC28025b8.m141431B();
            C26356e.f125201a.m135681f();
            C22640a.f111031a.m117214e();
            C29116a.f134962a.m145367c();
            C23926a.f115594a.m125054c();
            C22021e0.m114963p().m114995x();
            C21216s m120652d = AbstractC23306f.m120652d();
            m120652d.m109861N0(str);
            m120652d.m109877e1(str, false);
            AbstractC23306f.m120573D1().m109951J();
            C21270p.m110079C().m110156i0();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: q */
    public static void m118843q(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONArray optJSONArray;
        JSONObject optJSONObject4;
        JSONObject optJSONObject5;
        JSONObject jSONObject2;
        JSONArray optJSONArray2;
        JSONObject optJSONObject6;
        JSONObject jSONObject3;
        JSONArray optJSONArray3;
        try {
            if (!jSONObject.isNull("settings") && (optJSONObject3 = jSONObject.optJSONObject("settings")) != null) {
                if (!optJSONObject3.isNull("enable_chat_tag")) {
                    m118846t(optJSONObject3.getJSONObject("enable_chat_tag"));
                }
                if (!optJSONObject3.isNull("enable_show_tagmsg")) {
                    m118846t(optJSONObject3.getJSONObject("enable_show_tagmsg"));
                }
                if (!optJSONObject3.isNull("setting_work_mode")) {
                    m118846t(optJSONObject3.getJSONObject("setting_work_mode"));
                }
                if (!optJSONObject3.isNull("show_email_extprofile")) {
                    m118847u(optJSONObject3.optJSONObject("show_email_extprofile"));
                }
                if (!optJSONObject3.isNull("show_extprofile")) {
                    m118847u(optJSONObject3.optJSONObject("show_extprofile"));
                }
                if (!optJSONObject3.isNull("autoplay_voice")) {
                    m118846t(optJSONObject3.optJSONObject("autoplay_voice"));
                }
                if (!optJSONObject3.isNull("use_enter_send_message")) {
                    m118846t(optJSONObject3.optJSONObject("use_enter_send_message"));
                }
                if (!optJSONObject3.isNull("show_popup_message")) {
                    m118846t(optJSONObject3.optJSONObject("show_popup_message"));
                }
                if (!optJSONObject3.isNull("vibrate_new_message")) {
                    m118846t(optJSONObject3.optJSONObject("vibrate_new_message"));
                }
                if (!optJSONObject3.isNull("popup_unlock")) {
                    m118846t(optJSONObject3.optJSONObject("popup_unlock"));
                }
                if (!optJSONObject3.isNull("notify_new_message")) {
                    m118846t(optJSONObject3.optJSONObject("notify_new_message"));
                }
                if (!optJSONObject3.isNull("ringtone_new_message")) {
                    m118846t(optJSONObject3.optJSONObject("ringtone_new_message"));
                }
                if (!optJSONObject3.isNull("active_friend")) {
                    m118846t(optJSONObject3.optJSONObject("active_friend"));
                }
                if (!optJSONObject3.isNull("language")) {
                    m118846t(optJSONObject3.optJSONObject("language"));
                }
                if (!optJSONObject3.isNull("notify_new_message_group")) {
                    m118846t(optJSONObject3.optJSONObject("notify_new_message_group"));
                }
                if (!optJSONObject3.isNull("notify_new_message_single")) {
                    m118846t(optJSONObject3.optJSONObject("notify_new_message_single"));
                }
                if (optJSONObject3.has("notify_new_timeline") && !optJSONObject3.isNull("notify_new_timeline") && (optJSONObject6 = optJSONObject3.optJSONObject("notify_new_timeline")) != null) {
                    int optInt = optJSONObject6.optInt("value", 1);
                    try {
                        jSONObject3 = new JSONObject(AbstractC23309i.m120822Cb());
                    } catch (Exception unused) {
                        jSONObject3 = new JSONObject();
                    }
                    jSONObject3.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, optInt);
                    if (optInt == 2 && (optJSONArray3 = optJSONObject6.optJSONArray("users")) != null) {
                        jSONObject3.put("list_uid", optJSONArray3);
                    }
                    AbstractC23309i.m121176Lw(jSONObject3.toString());
                }
                if (optJSONObject3.has("notify_new_story") && !optJSONObject3.isNull("notify_new_story") && (optJSONObject5 = optJSONObject3.optJSONObject("notify_new_story")) != null) {
                    int optInt2 = optJSONObject5.optInt("value", 1);
                    try {
                        jSONObject2 = new JSONObject(AbstractC23309i.m120859Db());
                    } catch (Exception unused2) {
                        jSONObject2 = new JSONObject();
                    }
                    jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, optInt2);
                    if (optInt2 == 2 && (optJSONArray2 = optJSONObject5.optJSONArray("users")) != null) {
                        JSONArray jSONArray = new JSONArray();
                        for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                            JSONObject optJSONObject7 = optJSONArray2.optJSONObject(i11);
                            if (optJSONObject7 != null) {
                                jSONArray.put(optJSONObject7.optString("userId"));
                            }
                        }
                        jSONObject2.put("list_uid", jSONArray);
                    }
                    AbstractC23309i.m121213Mw(jSONObject2.toString());
                }
                if (!optJSONObject3.isNull("suggest_sticker_msg")) {
                    m118846t(optJSONObject3.optJSONObject("suggest_sticker_msg"));
                }
                if (!optJSONObject3.isNull("maybe_friend")) {
                    m118846t(optJSONObject3.optJSONObject("maybe_friend"));
                }
                if (!optJSONObject3.isNull("setting_jump_first_unread")) {
                    m118846t(optJSONObject3.optJSONObject("setting_jump_first_unread"));
                }
                if (!optJSONObject3.isNull("auto_play_music_feed")) {
                    m118846t(optJSONObject3.optJSONObject("auto_play_music_feed"));
                }
                if (!optJSONObject3.isNull("two_factor_authentication")) {
                    m118846t(optJSONObject3.optJSONObject("two_factor_authentication"));
                }
                if (AbstractC23304d.f113267D1 == 2 && !optJSONObject3.isNull("setting_call_ringtone")) {
                    JSONObject optJSONObject8 = optJSONObject3.optJSONObject("setting_call_ringtone");
                    m118846t(optJSONObject8);
                    if (optJSONObject8 != null) {
                        try {
                            JSONArray optJSONArray4 = optJSONObject8.optJSONArray("songs");
                            if (optJSONArray4 != null && optJSONArray4.length() > 0 && (optJSONObject4 = optJSONArray4.optJSONObject(0)) != null && !optJSONObject4.isNull("id")) {
                                new C22094p().m101508a(optJSONObject4.optString("id"));
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                if (!optJSONObject3.isNull("notify_call")) {
                    JSONObject optJSONObject9 = optJSONObject3.optJSONObject("notify_call");
                    m118846t(optJSONObject9);
                    if (optJSONObject9 != null) {
                        try {
                            if (!optJSONObject9.isNull("users") && (optJSONArray = optJSONObject9.optJSONArray("users")) != null) {
                                C25244a.m130619J(optJSONArray);
                            }
                        } catch (Exception e12) {
                            AbstractC20110a.m104539h(e12);
                        }
                    }
                }
                if (!optJSONObject3.isNull("auto_play_video")) {
                    m118846t(optJSONObject3.optJSONObject("auto_play_video"));
                }
                if (optJSONObject3.has("enable_show_tab_other_timeline")) {
                    m118846t(optJSONObject3.optJSONObject("enable_show_tab_other_timeline"));
                }
                if (optJSONObject3.has("enable_auto_parse_bankcard")) {
                    m118846t(optJSONObject3.optJSONObject("enable_auto_parse_bankcard"));
                }
                if (optJSONObject3.has("sync_msg_backup_restore")) {
                    m118846t(optJSONObject3.optJSONObject("sync_msg_backup_restore"));
                }
                if (optJSONObject3.has("enable_zvideo_section_timeline")) {
                    m118846t(optJSONObject3.optJSONObject("enable_zvideo_section_timeline"));
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        try {
            if (!jSONObject.isNull("privacy") && (optJSONObject = jSONObject.optJSONObject("privacy")) != null) {
                if (!optJSONObject.isNull("receive_message")) {
                    m118845s(optJSONObject.optJSONObject("receive_message"));
                }
                if (!optJSONObject.isNull("view_photo")) {
                    m118845s(optJSONObject.optJSONObject("view_photo"));
                }
                if (!optJSONObject.isNull("allow_comment")) {
                    m118845s(optJSONObject.optJSONObject("allow_comment"));
                }
                if (!optJSONObject.isNull("online_status")) {
                    m118845s(optJSONObject.optJSONObject("online_status"));
                }
                if (!optJSONObject.isNull("view_username")) {
                    m118845s(optJSONObject.optJSONObject("view_username"));
                }
                if (!optJSONObject.isNull("view_birthday")) {
                    m118845s(optJSONObject.optJSONObject("view_birthday"));
                }
                if (!optJSONObject.isNull("notify_detail_message")) {
                    m118845s(optJSONObject.optJSONObject("notify_detail_message"));
                }
                if (!optJSONObject.isNull("reply_sms_use_zalo")) {
                    m118845s(optJSONObject.optJSONObject("reply_sms_use_zalo"));
                }
                if (!optJSONObject.isNull("display_seen_status")) {
                    m118845s(optJSONObject.optJSONObject("display_seen_status"));
                }
                if (!optJSONObject.isNull("enable_room_wifi")) {
                    m118845s(optJSONObject.optJSONObject("enable_room_wifi"));
                }
                if (!optJSONObject.isNull("receive_birthday_notify")) {
                    m118845s(optJSONObject.optJSONObject("receive_birthday_notify"));
                }
                if (!optJSONObject.isNull("online_friends")) {
                    m118845s(optJSONObject.optJSONObject("online_friends"));
                }
                if (!optJSONObject.isNull("receive_friend_phone")) {
                    m118845s(optJSONObject.optJSONObject("receive_friend_phone"));
                }
                if (!optJSONObject.isNull("receive_friend_uname")) {
                    m118845s(optJSONObject.optJSONObject("receive_friend_uname"));
                }
                if (!optJSONObject.isNull("receive_friend_qr")) {
                    m118845s(optJSONObject.optJSONObject("receive_friend_qr"));
                }
                if (!optJSONObject.isNull("receive_friend_ecard")) {
                    m118845s(optJSONObject.optJSONObject("receive_friend_ecard"));
                }
                if (!optJSONObject.isNull("view_latest_feed")) {
                    m118845s(optJSONObject.optJSONObject("view_latest_feed"));
                }
                if (!optJSONObject.isNull("receive_friend_group")) {
                    m118845s(optJSONObject.optJSONObject("receive_friend_group"));
                }
                if (!optJSONObject.isNull("allow_auto_friend")) {
                    m118845s(optJSONObject.optJSONObject("allow_auto_friend"));
                }
                if (!optJSONObject.isNull("display_recommend_friend")) {
                    m118845s(optJSONObject.optJSONObject("display_recommend_friend"));
                }
                if (!optJSONObject.isNull("accept_stranger_call")) {
                    m118845s(optJSONObject.optJSONObject("accept_stranger_call"));
                }
                if (!optJSONObject.isNull("allow_auto_friend_view_feed")) {
                    m118845s(optJSONObject.optJSONObject("allow_auto_friend_view_feed"));
                }
                if (!optJSONObject.isNull("recently_online_status")) {
                    m118845s(optJSONObject.optJSONObject("recently_online_status"));
                }
                if (!optJSONObject.isNull("limit_visible_feed") && (optJSONObject2 = optJSONObject.optJSONObject("limit_visible_feed")) != null) {
                    m118849w(optJSONObject2.toString());
                }
                if (!optJSONObject.isNull("notify_my_birthday")) {
                    m118845s(optJSONObject.optJSONObject("notify_my_birthday"));
                }
            }
        } catch (Exception e14) {
            e14.printStackTrace();
        }
    }

    /* renamed from: r */
    public static void m118844r(JSONObject jSONObject) {
        JSONArray optJSONArray;
        try {
            m118843q(jSONObject);
            if (!jSONObject.isNull("mutes")) {
                C0804b.m2025g().m2036n(jSONObject.getJSONObject("mutes"));
            }
            if (!jSONObject.isNull("clearReminders") && jSONObject.optInt("clearReminders", 0) == 1) {
                C26076k.m134208q().m134219m();
            }
            if (!jSONObject.isNull("reminders") && (optJSONArray = jSONObject.optJSONArray("reminders")) != null) {
                C26076k.m134208q().m134216D(optJSONArray);
            }
            if (!jSONObject.isNull("expiredDuration")) {
                long optLong = jSONObject.optLong("expiredDuration", 0L);
                if (optLong >= 86400) {
                    AbstractC23309i.m121685Zn(optLong * 1000);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        try {
            if (AbstractC23775p0.m124206k()) {
                AbstractC20110a.m104542k(8, "sync server reset notification channel - parse setting info", new Object[0]);
                AbstractC23775p0.m124217v(2);
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }

    /* renamed from: s */
    public static void m118845s(JSONObject jSONObject) {
        m118848v(AbstractC18069a.m96085d(jSONObject, "id"), AbstractC18069a.m96085d(jSONObject, "value"));
    }

    /* renamed from: t */
    public static void m118846t(JSONObject jSONObject) {
        if (jSONObject != null) {
            m118851y(AbstractC18069a.m96085d(jSONObject, "id"), AbstractC18069a.m96085d(jSONObject, "value"), -1);
        }
    }

    /* renamed from: u */
    public static void m118847u(JSONObject jSONObject) {
        if (jSONObject != null) {
            m118850x(AbstractC18069a.m96085d(jSONObject, "id"), AbstractC18069a.m96085d(jSONObject, "value"));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0019. Please report as an issue. */
    /* renamed from: v */
    public static void m118848v(int i11, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 4) {
                    if (i11 != 7) {
                        if (i11 != 31) {
                            boolean z11 = false;
                            if (i11 != 14) {
                                if (i11 != 15) {
                                    switch (i11) {
                                        case 9:
                                            if (i12 == 0) {
                                                z11 = true;
                                            }
                                            AbstractC23309i.m121920fv(z11);
                                            break;
                                        case 10:
                                            int m121787cc = AbstractC23309i.m121787cc();
                                            AbstractC23309i.m122299px(i12);
                                            if (m121787cc == 1 && i12 == 2 && AbstractC23309i.m120894E9() < 3) {
                                                AbstractC23309i.m122407su(3);
                                                return;
                                            }
                                            return;
                                        case 11:
                                            if (i12 == 1) {
                                                z11 = true;
                                            }
                                            if (z11 && !AbstractC23309i.m121490Ud()) {
                                                AbstractC23306f.m120720v1().m120475h(4);
                                            }
                                            AbstractC23309i.m122634yz(z11);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 17:
                                                    if (i12 == 1) {
                                                        z11 = true;
                                                    }
                                                    AbstractC23309i.m122223nv(z11);
                                                    break;
                                                case 18:
                                                    if (i12 == 1) {
                                                        z11 = true;
                                                    }
                                                    AbstractC23309i.m122297pv(z11);
                                                    break;
                                                case 19:
                                                    if (i12 == 1) {
                                                        z11 = true;
                                                    }
                                                    AbstractC23309i.m122260ov(z11);
                                                    break;
                                                case 20:
                                                    if (i12 == 1) {
                                                        z11 = true;
                                                    }
                                                    AbstractC23309i.m122147lv(z11);
                                                    break;
                                                case 21:
                                                    if (i12 == 1) {
                                                        z11 = true;
                                                    }
                                                    AbstractC23309i.m122519vv(z11);
                                                    break;
                                                case 22:
                                                    if (i12 == 1) {
                                                        z11 = true;
                                                    }
                                                    AbstractC23309i.m122185mv(z11);
                                                    break;
                                                case 23:
                                                    if (i12 == 1) {
                                                        z11 = true;
                                                    }
                                                    AbstractC23309i.m122071jv(z11);
                                                    break;
                                                case 24:
                                                    if (i12 == 1) {
                                                        z11 = true;
                                                    }
                                                    AbstractC23309i.m122334qv(z11);
                                                    break;
                                                case 25:
                                                    AbstractC0924m0.m3118Hn(i12);
                                                    break;
                                                case 26:
                                                    AbstractC23309i.m122033iv(i12);
                                                    break;
                                                case 27:
                                                    boolean m121308Pg = AbstractC23309i.m121308Pg();
                                                    if (i12 != 0) {
                                                        z11 = true;
                                                    }
                                                    AbstractC23309i.m121998hx(z11);
                                                    if (z11 != m121308Pg) {
                                                        C21927m.m114302u().m114336h0();
                                                    }
                                                    if (i12 == 0) {
                                                        C19637j.f97466a.m102826G().clear();
                                                        break;
                                                    }
                                                    break;
                                            }
                                    }
                                } else {
                                    int m120933Fb = AbstractC23309i.m120933Fb();
                                    AbstractC23309i.m121287Ow(i12);
                                    if (m120933Fb != i12) {
                                        C18644n.m98524E();
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                if (i12 == 1) {
                                    z11 = true;
                                }
                                AbstractC23309i.m121609Xl(z11);
                            }
                        } else {
                            AbstractC0924m0.m3263Mn(i12);
                        }
                    } else {
                        AbstractC23309i.m122408sv(i12);
                    }
                } else {
                    AbstractC23309i.m122109kv(i12);
                }
            } else {
                AbstractC23309i.m122482uv(i12);
            }
        } else {
            AbstractC23309i.m122371rv(i12);
        }
        AbstractC26084s.m134257e(2, "setting_priv_" + i11, true);
    }

    /* renamed from: w */
    public static void m118849w(String str) {
        AbstractC0924m0.m3464Tl(str);
    }

    /* renamed from: x */
    public static void m118850x(int i11, int i12) {
        try {
            if (i11 != 21) {
                if (i11 == 22) {
                    AbstractC23309i.m122556wv(i12);
                }
            } else {
                AbstractC23309i.m122445tv(i12);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x001c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0023. Please report as an issue. */
    /* renamed from: y */
    public static void m118851y(int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = false;
        try {
            if (i11 != 1) {
                if (i11 != 10) {
                    if (i11 != 19) {
                        if (i11 != 20) {
                            if (i11 != 31) {
                                if (i11 != 32) {
                                    switch (i11) {
                                        case 3:
                                            if (i12 == 1) {
                                                z18 = true;
                                            }
                                            AbstractC23309i.m122301pz(z18);
                                            break;
                                        case 4:
                                            if (i12 == 1) {
                                                z18 = true;
                                            }
                                            AbstractC23309i.m122560wz(z18);
                                            break;
                                        case 5:
                                            if (i12 == 1) {
                                                z18 = true;
                                            }
                                            AbstractC23309i.m120846Cz(z18);
                                            break;
                                        case 6:
                                            boolean m121863ec = AbstractC23309i.m121863ec();
                                            if (i12 == 1) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (i12 == 1) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            AbstractC23309i.m122336qx(z12);
                                            if (i12 == 1 && i13 == 6) {
                                                C7853b.m40052a0().m40098L0();
                                            }
                                            if (m121863ec != z11 && i13 != -1) {
                                                AbstractC20110a.m104542k(8, "manual reset notification channel (sound): %s -> %s", Boolean.valueOf(m121863ec), Boolean.valueOf(z11));
                                                AbstractC23775p0.m124217v(3);
                                                AbstractC23309i.m122373rx(z11);
                                                break;
                                            }
                                            break;
                                        case 7:
                                            boolean m121865ee = AbstractC23309i.m121865ee();
                                            if (i12 == 1) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (i12 == 1) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            AbstractC23309i.m121253Nz(z14);
                                            if (i12 == 1 && i13 == 7) {
                                                C23081g9.m118413k();
                                            }
                                            if (m121865ee != z13 && i13 != -1) {
                                                AbstractC20110a.m104542k(8, "manual reset notification channel (vibration): %s -> %s", Boolean.valueOf(m121865ee), Boolean.valueOf(z13));
                                                AbstractC23775p0.m124217v(4);
                                                AbstractC23309i.m121290Oz(z13);
                                                break;
                                            }
                                            break;
                                        case 8:
                                            if (i12 == 1) {
                                                z18 = true;
                                            }
                                            AbstractC23309i.m122579xh(i11, z18);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 12:
                                                    AbstractC23309i.m122148lw(MainApplication.getAppContext(), i12, true);
                                                    ChatHeadTextView.m39852c();
                                                    AbstractC19646n0.m102940V1();
                                                    return;
                                                case 13:
                                                    if (i12 == 1) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    AbstractC23309i.m122616yh(z15);
                                                    if (i12 == 0 && i13 != -1) {
                                                        AbstractC23309i.m122469ui(0);
                                                        AbstractC23309i.m122543wi(0L);
                                                        break;
                                                    }
                                                    break;
                                                case 14:
                                                    String m120822Cb = AbstractC23309i.m120822Cb();
                                                    try {
                                                        if (TextUtils.isEmpty(m120822Cb)) {
                                                            JSONObject jSONObject = new JSONObject();
                                                            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, i12);
                                                            AbstractC23309i.m121176Lw(jSONObject.toString());
                                                        } else {
                                                            JSONObject jSONObject2 = new JSONObject(m120822Cb);
                                                            jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, i12);
                                                            AbstractC23309i.m121176Lw(jSONObject2.toString());
                                                        }
                                                        return;
                                                    } catch (Exception e11) {
                                                        e11.printStackTrace();
                                                        break;
                                                    }
                                                case 15:
                                                    if (i12 == 1) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    AbstractC23309i.m122579xh(i11, z16);
                                                    if (i12 == 0 && i13 != -1) {
                                                        AbstractC23309i.m122469ui(0);
                                                        AbstractC23309i.m122543wi(0L);
                                                        break;
                                                    }
                                                    break;
                                                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                                    String m120859Db = AbstractC23309i.m120859Db();
                                                    try {
                                                        if (TextUtils.isEmpty(m120859Db)) {
                                                            JSONObject jSONObject3 = new JSONObject();
                                                            jSONObject3.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, i12);
                                                            AbstractC23309i.m121213Mw(jSONObject3.toString());
                                                        } else {
                                                            JSONObject jSONObject4 = new JSONObject(m120859Db);
                                                            jSONObject4.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, i12);
                                                            AbstractC23309i.m121213Mw(jSONObject4.toString());
                                                        }
                                                        return;
                                                    } catch (Exception e12) {
                                                        e12.printStackTrace();
                                                        break;
                                                    }
                                                case 17:
                                                    C20048j.f98580a.m104106e(i12);
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 38:
                                                            boolean m3838gc = AbstractC0924m0.m3838gc();
                                                            if (i12 == 1) {
                                                                z17 = true;
                                                            } else {
                                                                z17 = false;
                                                            }
                                                            C18932a.f94442a.m99179c().m104188h(z17);
                                                            if (m3838gc != z17) {
                                                                if (i12 == 1) {
                                                                    C24559a.m127933c("[ConversationLabel]", "updateSettingsData");
                                                                    C7860a.Companion.m40303b().m40294r0(true);
                                                                }
                                                                C23744a.m124114c().m124116d(8101, new Object[0]);
                                                                break;
                                                            }
                                                            break;
                                                        case 39:
                                                            AbstractC0924m0.m3323Op(i12);
                                                            break;
                                                        case 40:
                                                            if (i12 == 1) {
                                                                z18 = true;
                                                            }
                                                            AbstractC23306f.m120562A().m2547l0(z18);
                                                            break;
                                                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                                                            C26354c.f125196a.m135674e(i12);
                                                            break;
                                                        default:
                                                            switch (i11) {
                                                                case 43:
                                                                    AbstractC0924m0.m3284Nf(i12);
                                                                    break;
                                                                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                                                    C25244a.m130620K(i12);
                                                                    break;
                                                                case 45:
                                                                    C18932a c18932a = C18932a.f94442a;
                                                                    boolean m99184h = c18932a.m99184h();
                                                                    c18932a.m99179c().m104189i(i12);
                                                                    if (c18932a.m99184h() && !m99184h) {
                                                                        C18935d.m99214s().m99227o();
                                                                    }
                                                                    C23744a.m124114c().m124116d(8101, new Object[0]);
                                                                    break;
                                                                case 46:
                                                                    C18932a c18932a2 = C18932a.f94442a;
                                                                    boolean m99186j = c18932a2.m99186j();
                                                                    c18932a2.m99179c().m104190j(i12);
                                                                    if (m99186j != c18932a2.m99186j()) {
                                                                        C23744a.m124114c().m124116d(8101, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 47:
                                                                    new C25432r0().m101508a(new C25432r0.c(i12));
                                                                    break;
                                                                case 48:
                                                                    AbstractC0924m0.m3205Kn(i12);
                                                                    break;
                                                                case 49:
                                                                    new C25434s0().m101508a(new C25434s0.b(i12));
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                                } else if (!AbstractC0924m0.m2904Ac()) {
                                    C24720a m120676j = AbstractC23306f.m120676j();
                                    if (i12 == 1) {
                                        z18 = true;
                                    }
                                    m120676j.m128406X(z18);
                                    AbstractC0924m0.m3467To(true);
                                    C22432d.f109743a.m115879g();
                                }
                            } else {
                                AbstractC23309i.m122224nw(MainApplication.getAppContext(), i12, true);
                            }
                        } else {
                            if (i12 == 1) {
                                z18 = true;
                            }
                            AbstractC23309i.m122026in(z18);
                        }
                    } else {
                        if (i12 == 1) {
                            z18 = true;
                        }
                        AbstractC23309i.m120772Az(z18);
                        return;
                    }
                } else {
                    AbstractC23309i.m122186mw(i12);
                }
            } else {
                C0872f m120562A = AbstractC23306f.m120562A();
                if (i12 == 1) {
                    z18 = true;
                }
                m120562A.m2562t0(z18);
                AbstractC23309i.m121420Sh(m120562A.m2531Z());
            }
            AbstractC26084s.m134257e(2, "setting_" + i11, true);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    /* renamed from: z */
    public static void m118852z() {
        AbstractC23304d.f113318Q0 = -1L;
    }
}
