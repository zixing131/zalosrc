package me0;

import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import am.AbstractC0924m0;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Pair;
import androidx.core.text.AbstractC1463b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalocore.CoreUtility;
import gw.C19669z;
import hm0.C20096c;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l30.C22013a0;
import l30.C22021e0;
import l30.C22037m0;
import l30.C22052u;
import lr.C22640a;
import mm0.AbstractC23350e;
import od0.EnumC24233k;
import org.json.JSONException;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p142ey.C18644n;
import p172fy.C19171b;
import p173fz.C19172a;
import p187gk.C19464a;
import p302ko.C21785g;
import p304ks.AbstractC21935u;
import p304ks.C21920f;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p368nq.C23926a;
import p398oo.C24355e0;
import p398oo.C24380u;
import p401or.C24417g;
import p456qp.C25451c;
import p461qu.AbstractC25495a;
import p509sp.C26356e;
import p510sq.C26365a;
import p616wo.C29116a;
import p716zh.C31845ac;
import p716zh.C31948ha;
import p716zh.C32002l4;
import p716zh.C32065p8;
import tn.C26736a;
import tn.C26761p;
import vg.C28023b6;
import vg.C28203u6;

/* renamed from: me0.d8 */
/* loaded from: classes4.dex */
public abstract class AbstractC23047d8 {
    /* renamed from: b */
    public static Pair m118250b(int i11, int i12, int i13, int i14) {
        float f11 = i12;
        float f12 = i11;
        return new Pair(Integer.valueOf(Math.max(i13, Math.round((i14 / f11) * f12))), Integer.valueOf(Math.max(Math.round((i13 / f12) * f11), i14)));
    }

    /* renamed from: c */
    public static String m118251c(C20096c c20096c) {
        if (c20096c != null) {
            try {
                try {
                    return new JSONObject(c20096c.m104490b()).getJSONObject("data").getString("error_content");
                } catch (JSONException e11) {
                    AbstractC23350e.m122778h(e11);
                    int m104491c = c20096c.m104491c();
                    if (m104491c == 18026) {
                        return AbstractC23136l9.m118746s0(AbstractC8020f0.str_upload_avt_err_dimen_too_small, Integer.valueOf(C19172a.m100599j("safety@social@upload@min_w_ava")), Integer.valueOf(C19172a.m100599j("safety@social@upload@min_h_ava")));
                    }
                    if (m104491c == 18027) {
                        return AbstractC23136l9.m118746s0(AbstractC8020f0.str_upload_avt_err_file_size_too_small, Integer.valueOf(C19172a.m100599j("safety@social@upload@min_size_ava") / 1024));
                    }
                    return "";
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
                return "";
            }
        }
        return "";
    }

    /* renamed from: d */
    public static String m118252d(C20096c c20096c) {
        if (c20096c != null) {
            try {
                try {
                    return new JSONObject(c20096c.m104490b()).getJSONObject("data").getString("error_content");
                } catch (JSONException e11) {
                    AbstractC23350e.m122778h(e11);
                    int m104491c = c20096c.m104491c();
                    if (m104491c != 0) {
                        if (m104491c != 19001 && m104491c != 19002 && m104491c != 19003 && m104491c != 18002) {
                            if (m104491c != 18004 && m104491c != 19004 && m104491c != 19006) {
                                if (m104491c == 18026) {
                                    return AbstractC23136l9.m118746s0(AbstractC8020f0.str_upload_cover_err_dimen_too_small, Integer.valueOf(C19172a.m100599j("safety@social@upload@min_w_cover")), Integer.valueOf(C19172a.m100599j("safety@social@upload@min_h_cover")));
                                }
                                if (m104491c == 18027) {
                                    return AbstractC23136l9.m118746s0(AbstractC8020f0.str_upload_cover_err_file_size_too_small, Integer.valueOf(C19172a.m100599j("safety@social@upload@min_size_cover") / 1024));
                                }
                                return "";
                            }
                            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_error_invalidImage);
                        }
                        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_warningUploadImg);
                    }
                    return "";
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
                return "";
            }
        }
        return "";
    }

    /* renamed from: e */
    public static int m118253e() {
        if (!AbstractC23136l9.m118654H0(MainApplication.getAppContext()) && !AbstractC23171p0.m119371c()) {
            return 1;
        }
        return 640;
    }

    /* renamed from: f */
    public static byte m118254f() {
        String str = AbstractC18458a.f93019a;
        str.hashCode();
        if (!str.equals("en")) {
            if (!str.equals("my")) {
                return (byte) 0;
            }
            return (byte) 2;
        }
        return (byte) 1;
    }

    /* renamed from: g */
    public static void m118255g() {
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            AbstractC23304d.m120538i();
            C26761p.m137741q().m137749A();
            if (!AbstractC0924m0.m3222Lb()) {
                AbstractC0924m0.m3059Fm(true);
                C26761p.m137741q().m137756I();
            }
            C31845ac.m152996J().m153046a0();
            C26736a.m137532e().m137540g();
            C19464a.m101788g();
            C28023b6.m141250h0().m141333b2();
            C26356e.f125201a.m135681f();
            C22640a.f111031a.m117214e();
            C29116a.f134962a.m145367c();
            C23926a.f115594a.m125054c();
            C22021e0.m114963p().m114995x();
            if (C22013a0.m114928g()) {
                C22052u.m115085y().m115089S();
                C22013a0.m114924c();
            }
            String m3622Z5 = AbstractC0924m0.m3622Z5();
            if (!TextUtils.isEmpty(m3622Z5)) {
                C24417g.f117907a.m127708k(new JSONObject(m3622Z5), false);
            }
            String m3652a6 = AbstractC0924m0.m3652a6();
            if (!TextUtils.isEmpty(m3652a6)) {
                C22037m0.f108553a.m115041o(new JSONObject(m3652a6), false);
            }
            C22037m0.f108553a.m115042p();
            C24380u.f117739a.m127518l();
            C24355e0.f117560a.m127363s();
            C19172a.m100599j("safety@social_ekyc_block_post");
            C23058e8.f112065a.m118308a();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: h */
    public static boolean m118256h(String str) {
        if (!AbstractC25495a.m132079d(str) && !AbstractC25495a.m132078c(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m118257i(int i11) {
        if (i11 != EnumC24233k.f117064r.m126539c() && i11 != EnumC24233k.f117066t.m126539c()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static /* synthetic */ void m118258j() {
        if (!C31948ha.m153587d().m153595i() && !C31948ha.m153587d().m153596j() && !C32065p8.m154684c().m154692g() && !C32065p8.m154684c().m154691f() && !C25451c.f121865a.m131820h().get() && C7853b.m40052a0().m40137k0()) {
            C7853b.m40052a0().m40136j1();
        }
    }

    /* renamed from: k */
    public static void m118259k(ContactProfile contactProfile, boolean z11, SensitiveData sensitiveData) {
        C21785g m112430F0 = C21785g.m112430F0();
        m112430F0.mo112387E(contactProfile.f42434r, false);
        C28203u6 c28203u6 = C28203u6.f131407a;
        c28203u6.m141827z(contactProfile.f42434r, false);
        ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(contactProfile.f42434r);
        ContactProfile m98552o = C18644n.m98531l().m98552o(contactProfile.f42434r);
        C18644n.m98531l().m98540I(contactProfile.f42434r);
        c28203u6.m141804B(contactProfile.f42434r, 0);
        if (m153138j == null && m98552o != null) {
            m112430F0.mo112423x0(m98552o, false);
        }
        C21927m.m114302u().m114350o0(contactProfile.f42434r);
        if (m112430F0.mo112407h(contactProfile.f42434r)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(Integer.parseInt(contactProfile.f42434r)));
            C21927m.m114302u().m114338i0(arrayList);
        }
        if (!AbstractC25495a.m132084i(contactProfile.f42434r) && AbstractC21935u.m114515E(contactProfile.f42434r) && AbstractC23306f.m120562A().m2529X(contactProfile.f42434r)) {
            C7959d.m41638d1().m41774b3(contactProfile.f42434r, 2);
        }
        Map map = AbstractC23304d.f113421p;
        synchronized (map) {
            try {
                if (map.containsKey(contactProfile.f42434r)) {
                    m112430F0.mo112417p0(contactProfile.f42434r);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC21935u.m114533W(contactProfile.f42434r, -1, "");
        AbstractC23059e9.m118317F(contactProfile.f42434r);
        C21927m.m114302u().m114352p0(contactProfile.f42434r);
        C7960e.m41971c6().m42099Dc(contactProfile.f42434r);
        AbstractC0852x.m2332I(contactProfile.f42434r);
        if (z11) {
            AbstractC0852x.m2355l(MainApplication.getAppContext(), contactProfile.f42455y, sensitiveData);
        }
        C19669z.m103146Y().m103198O0();
        C23744a.m124114c().m124116d(6078, new Object[0]);
        C21920f.m114270a().m114272c(contactProfile.f42434r);
        AbstractC23088h5.m118426g();
        C23744a.m124114c().m124116d(6042, contactProfile.f42434r);
    }

    /* renamed from: l */
    public static void m118260l(String str, C8050a.d0 d0Var, C17487o0 c17487o0, int i11, C32002l4 c32002l4) {
        try {
            C26365a m135743b = new C26365a.b(str, c32002l4).m135735B(d0Var).m135743b();
            if (c17487o0 != null) {
                new C19171b().m101508a(new C19171b.a(c17487o0.m93021N0(), m135743b, i11, 1));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.String] */
    /* renamed from: m */
    public static SpannableString m118261m(String str) {
        String str2;
        String group;
        ?? replaceAll = str.replaceAll("(\r\n|\n)", "<br/>");
        try {
            Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(replaceAll);
            replaceAll = replaceAll;
            if (matcher.find()) {
                if (replaceAll.contains("<a href=\"http")) {
                    replaceAll = replaceAll;
                } else if (matcher.group().startsWith("https://")) {
                    replaceAll = matcher.replaceAll("<a href=\"$1\">$1</a>");
                } else if (matcher.group().startsWith("http://")) {
                    replaceAll = matcher.replaceAll("<a href=\"$1\">$1</a>");
                } else {
                    replaceAll = matcher.replaceAll("<a href=\"http://$1\">$1</a>");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            Matcher matcher2 = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(replaceAll);
            while (matcher2.find()) {
                ?? group2 = matcher2.group(0);
                if (group2 != 0 && group2.startsWith("<a href=\"zm://Profile/")) {
                    Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group2);
                    String str3 = "";
                    if (matcher3.find() && (group = matcher3.group(1)) != null) {
                        String replace = group.replace("\"", "");
                        str3 = replace.substring(replace.lastIndexOf("/") + 1);
                    }
                    String group3 = matcher2.group(1);
                    String m114542i = AbstractC21935u.m114542i(str3, group3);
                    if (group3 != null) {
                        if (!group3.equals(m114542i)) {
                            str2 = group2.replace(group3, m114542i);
                        } else {
                            str2 = group2;
                        }
                        if (replaceAll.contains(group2) && !group2.equals(str2)) {
                            replaceAll = replaceAll.replace(group2, str2);
                        }
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        Spanned m7440a = AbstractC1463b.m7440a(replaceAll, 0);
        SpannableString spannableString = new SpannableString(m7440a.toString());
        for (Object obj : m7440a.getSpans(0, m7440a.length(), Object.class)) {
            int spanStart = m7440a.getSpanStart(obj);
            int spanEnd = m7440a.getSpanEnd(obj);
            int spanFlags = m7440a.getSpanFlags(obj);
            if (obj instanceof URLSpan) {
                spannableString.setSpan(new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd), spanStart, spanEnd, spanFlags);
            }
        }
        return spannableString;
    }

    /* renamed from: n */
    public static void m118262n() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.c8
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23047d8.m118258j();
            }
        });
    }

    /* renamed from: o */
    public static boolean m118263o(String str) {
        if (!m118256h(str) && !AbstractC25495a.m132079d(str) && !AbstractC25495a.m132078c(str)) {
            return false;
        }
        return true;
    }
}
