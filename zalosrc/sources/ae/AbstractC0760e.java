package ae;

import androidx.core.util.C1483e;
import au.AbstractC2339c;
import au.AbstractC2340c0;
import au.AbstractC2373t;
import com.zing.zalo.AbstractC7306b;
import com.zing.zalo.BuildConfig;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import fh0.AbstractC18942g;
import im0.AbstractC20626a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import me0.AbstractC23006a0;
import me0.AbstractC23059e9;
import me0.AbstractC23159o;
import me0.AbstractC23160o0;
import me0.AbstractC23193r0;
import me0.C23055e5;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p221hy.C20166b;
import p221hy.InterfaceC20165a;
import p348mi.AbstractC23309i;

/* renamed from: ae.e */
/* loaded from: classes3.dex */
public abstract class AbstractC0760e {

    /* renamed from: a */
    private static Map f2531a;

    /* renamed from: a */
    public static C1483e m1357a(String[] strArr, String[] strArr2) {
        C1483e m1358b = m1358b(strArr, strArr2);
        Map m1360d = m1360d();
        int i11 = 0;
        while (true) {
            Object obj = m1358b.f6374a;
            if (i11 < ((String[]) obj).length) {
                if (m1360d.containsKey(((String[]) obj)[i11])) {
                    Object obj2 = m1358b.f6374a;
                    ((String[]) obj2)[i11] = (String) m1360d.get(((String[]) obj2)[i11]);
                }
                i11++;
            } else {
                return m1358b;
            }
        }
    }

    /* renamed from: b */
    public static C1483e m1358b(String[] strArr, String[] strArr2) {
        Object obj;
        C1483e m1359c = m1359c();
        Object obj2 = m1359c.f6374a;
        if (obj2 != null && (obj = m1359c.f6375b) != null && ((String[]) obj2).length == ((String[]) obj).length && strArr.length == strArr2.length) {
            return new C1483e((String[]) AbstractC23159o.m119177a((String[]) obj2, strArr), (String[]) AbstractC23159o.m119177a((String[]) m1359c.f6375b, strArr2));
        }
        throw new RuntimeException("wrong parameters");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(1:3)(1:140)|4|(6:5|6|8|9|11|12)|(3:13|14|15)|16|17|18|20|21|22|23|(15:24|25|27|28|29|30|32|33|(5:35|36|37|38|39)(1:109)|40|41|43|44|(1:46)(1:98)|47)|(4:48|49|50|(9:51|52|53|54|55|56|(5:58|59|60|(2:62|63)(1:65)|64)|86|87))|(1:70)|(1:72)|73|(1:75)|76|(1:78)(1:85)|79|(1:81)|82|83|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:1|(1:3)(1:140)|4|5|6|8|9|11|12|(3:13|14|15)|16|17|18|20|21|22|23|(15:24|25|27|28|29|30|32|33|(5:35|36|37|38|39)(1:109)|40|41|43|44|(1:46)(1:98)|47)|(4:48|49|50|(9:51|52|53|54|55|56|(5:58|59|60|(2:62|63)(1:65)|64)|86|87))|(1:70)|(1:72)|73|(1:75)|76|(1:78)(1:85)|79|(1:81)|82|83|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(36:135|136|137|131|16|17|18|20|21|22|23|24|25|(3:27|28|(11:29|30|32|33|(0)(0)|40|41|43|44|(0)(0)|47))|48|49|50|51|52|53|54|55|56|(0)|86|87|(0)|(0)|73|(0)|76|(0)(0)|79|(0)|82|83) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00f4, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00f7, code lost:            r1 = "";        r3 = r1;        r20 = r3;        r21 = r20;        r22 = r21;     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00ff, code lost:            r19 = 5;     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0102, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0104, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0105, code lost:            r1 = "";        r3 = r1;        r20 = r3;        r21 = r20;        r22 = r21;        r18 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015f, code lost:            r0 = th;     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:            r26 = r12;     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[Catch: Exception -> 0x00a1, TRY_LEAVE, TryCatch #17 {Exception -> 0x00a1, blocks: (B:33:0x0081, B:35:0x0087), top: B:32:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c7  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1483e m1359c() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String m12302a;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        int i11;
        int i12;
        String str16;
        int i13;
        String str17;
        String str18;
        int i14;
        boolean z11;
        String str19;
        String str20;
        String str21;
        String str22;
        String m12409g;
        String str23;
        JSONObject jSONObject;
        int length;
        int i15;
        C20166b.a aVar;
        boolean z12;
        String str24 = "";
        if (AbstractC23309i.m121859e9() != 1) {
            str = "";
        } else {
            str = AbstractC23309i.m121704a5();
        }
        int m117905e = AbstractC23006a0.m117905e();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            str2 = AbstractC2340c0.m12303b(MainApplication.getAppContext());
            try {
                str3 = Locale.getDefault().toString();
                try {
                    str4 = AbstractC23160o0.m119218S0();
                } catch (Exception e11) {
                    e = e11;
                    str4 = "";
                }
            } catch (Exception e12) {
                e = e12;
                str3 = "";
                str4 = str3;
                e.printStackTrace();
                str5 = str4;
                str6 = str3;
                str7 = str2;
                str8 = "";
                str9 = AbstractC18458a.f93019a;
                str10 = "UNKNOWN";
                String str25 = "000000";
                m12302a = AbstractC2340c0.m12302a(MainApplication.getAppContext());
                i11 = AbstractC23349d.m122766d();
                str10 = AbstractC23349d.m122767e();
                i12 = AbstractC20626a.m107387c();
                str25 = AbstractC23349d.m122764b();
                str13 = AbstractC18942g.m99249e();
                try {
                    str14 = C23055e5.m118268c(MainApplication.getAppContext());
                    try {
                        str15 = AbstractC23193r0.m119494c(MainApplication.getAppContext());
                        try {
                            if (C8937j0.m47663l("ads_id_get_info_on_login")) {
                            }
                            try {
                                aVar = C20166b.Companion;
                                str12 = aVar.m105162b().m105151c(MainApplication.getAppContext());
                                try {
                                    if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99531p) {
                                    }
                                    i13 = i11;
                                    str17 = str12;
                                    str18 = str11;
                                    i14 = i12;
                                    z11 = z12;
                                } catch (Exception e13) {
                                    e = e13;
                                    str10 = str16;
                                    AbstractC23350e.m122778h(e);
                                    str16 = str10;
                                    i13 = i11;
                                    str17 = str12;
                                    str18 = str11;
                                    i14 = i12;
                                    z11 = true;
                                    jSONObject = new JSONObject();
                                    str21 = m12302a;
                                    Field[] fields = BuildConfig.class.getFields();
                                    str19 = str8;
                                    length = fields.length;
                                    str20 = str9;
                                    i15 = 0;
                                    while (i15 < length) {
                                    }
                                    AbstractC7306b.Companion.m37258b(jSONObject);
                                    str22 = jSONObject.toString();
                                    if (str13 == null) {
                                    }
                                    if (str18 == null) {
                                    }
                                    m12409g = AbstractC2373t.m12409g();
                                    if (m12409g == null) {
                                    }
                                    String[] strArr = {"client_type", "iso_country_code", "inc_p", "avatarSize", ZinstantMetaConstant.IMPRESSION_META_TYPE, "model", "imei", "client_version", "distributor", "distributor_mobile_tracking", "cs", "width", "height", "heap", "operator", "network", "time_zone", "language", "local_time", "user_language", "deviceInfo", "device_identifier", "certificatedKey", "zcid", "preload_info", "mac_address", "android_id", "advertising_id", "fcm_token", "hcm_token", "build_info"};
                                    String[] strArr2 = new String[31];
                                    strArr2[0] = "1";
                                    strArr2[1] = str;
                                    strArr2[2] = "1";
                                    strArr2[3] = "" + m117905e;
                                    strArr2[4] = "1";
                                    strArr2[5] = str16;
                                    strArr2[6] = str25;
                                    strArr2[7] = "" + CoreUtility.f89236l;
                                    strArr2[8] = BuildConfig.DISTRIBUTOR;
                                    strArr2[9] = "";
                                    strArr2[10] = str7;
                                    strArr2[11] = "" + MainApplication.f37848N;
                                    strArr2[12] = "" + MainApplication.f37849O;
                                    strArr2[13] = "" + MainApplication.f37850P;
                                    strArr2[14] = "" + i13;
                                    strArr2[15] = "" + i14;
                                    strArr2[16] = str5;
                                    strArr2[17] = str6;
                                    strArr2[18] = "" + currentTimeMillis;
                                    strArr2[19] = str20;
                                    strArr2[20] = str19;
                                    strArr2[21] = str13;
                                    strArr2[22] = str21;
                                    strArr2[23] = m12409g;
                                    strArr2[24] = AbstractC18942g.m99250f();
                                    strArr2[25] = str14;
                                    strArr2[26] = str15;
                                    strArr2[27] = str18;
                                    if (!z11) {
                                    }
                                    strArr2[28] = str23;
                                    if (!z11) {
                                    }
                                    strArr2[29] = str24;
                                    strArr2[30] = str22;
                                    return new C1483e(strArr, strArr2);
                                }
                            } catch (Exception e14) {
                                e = e14;
                                str12 = "";
                            }
                        } catch (Exception e15) {
                            e = e15;
                            str11 = "";
                            str12 = str11;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        str11 = "";
                        str12 = str11;
                        str15 = str12;
                    }
                } catch (Exception e17) {
                    e = e17;
                    str11 = "";
                    str12 = str11;
                    str14 = str12;
                    str15 = str14;
                    AbstractC23350e.m122778h(e);
                    str16 = str10;
                    i13 = i11;
                    str17 = str12;
                    str18 = str11;
                    i14 = i12;
                    z11 = true;
                    jSONObject = new JSONObject();
                    str21 = m12302a;
                    Field[] fields2 = BuildConfig.class.getFields();
                    str19 = str8;
                    length = fields2.length;
                    str20 = str9;
                    i15 = 0;
                    while (i15 < length) {
                    }
                    AbstractC7306b.Companion.m37258b(jSONObject);
                    str22 = jSONObject.toString();
                    if (str13 == null) {
                    }
                    if (str18 == null) {
                    }
                    m12409g = AbstractC2373t.m12409g();
                    if (m12409g == null) {
                    }
                    String[] strArr3 = {"client_type", "iso_country_code", "inc_p", "avatarSize", ZinstantMetaConstant.IMPRESSION_META_TYPE, "model", "imei", "client_version", "distributor", "distributor_mobile_tracking", "cs", "width", "height", "heap", "operator", "network", "time_zone", "language", "local_time", "user_language", "deviceInfo", "device_identifier", "certificatedKey", "zcid", "preload_info", "mac_address", "android_id", "advertising_id", "fcm_token", "hcm_token", "build_info"};
                    String[] strArr22 = new String[31];
                    strArr22[0] = "1";
                    strArr22[1] = str;
                    strArr22[2] = "1";
                    strArr22[3] = "" + m117905e;
                    strArr22[4] = "1";
                    strArr22[5] = str16;
                    strArr22[6] = str25;
                    strArr22[7] = "" + CoreUtility.f89236l;
                    strArr22[8] = BuildConfig.DISTRIBUTOR;
                    strArr22[9] = "";
                    strArr22[10] = str7;
                    strArr22[11] = "" + MainApplication.f37848N;
                    strArr22[12] = "" + MainApplication.f37849O;
                    strArr22[13] = "" + MainApplication.f37850P;
                    strArr22[14] = "" + i13;
                    strArr22[15] = "" + i14;
                    strArr22[16] = str5;
                    strArr22[17] = str6;
                    strArr22[18] = "" + currentTimeMillis;
                    strArr22[19] = str20;
                    strArr22[20] = str19;
                    strArr22[21] = str13;
                    strArr22[22] = str21;
                    strArr22[23] = m12409g;
                    strArr22[24] = AbstractC18942g.m99250f();
                    strArr22[25] = str14;
                    strArr22[26] = str15;
                    strArr22[27] = str18;
                    if (!z11) {
                    }
                    strArr22[28] = str23;
                    if (!z11) {
                    }
                    strArr22[29] = str24;
                    strArr22[30] = str22;
                    return new C1483e(strArr3, strArr22);
                }
                jSONObject = new JSONObject();
                str21 = m12302a;
                Field[] fields22 = BuildConfig.class.getFields();
                str19 = str8;
                length = fields22.length;
                str20 = str9;
                i15 = 0;
                while (i15 < length) {
                }
                AbstractC7306b.Companion.m37258b(jSONObject);
                str22 = jSONObject.toString();
                if (str13 == null) {
                }
                if (str18 == null) {
                }
                m12409g = AbstractC2373t.m12409g();
                if (m12409g == null) {
                }
                String[] strArr32 = {"client_type", "iso_country_code", "inc_p", "avatarSize", ZinstantMetaConstant.IMPRESSION_META_TYPE, "model", "imei", "client_version", "distributor", "distributor_mobile_tracking", "cs", "width", "height", "heap", "operator", "network", "time_zone", "language", "local_time", "user_language", "deviceInfo", "device_identifier", "certificatedKey", "zcid", "preload_info", "mac_address", "android_id", "advertising_id", "fcm_token", "hcm_token", "build_info"};
                String[] strArr222 = new String[31];
                strArr222[0] = "1";
                strArr222[1] = str;
                strArr222[2] = "1";
                strArr222[3] = "" + m117905e;
                strArr222[4] = "1";
                strArr222[5] = str16;
                strArr222[6] = str25;
                strArr222[7] = "" + CoreUtility.f89236l;
                strArr222[8] = BuildConfig.DISTRIBUTOR;
                strArr222[9] = "";
                strArr222[10] = str7;
                strArr222[11] = "" + MainApplication.f37848N;
                strArr222[12] = "" + MainApplication.f37849O;
                strArr222[13] = "" + MainApplication.f37850P;
                strArr222[14] = "" + i13;
                strArr222[15] = "" + i14;
                strArr222[16] = str5;
                strArr222[17] = str6;
                strArr222[18] = "" + currentTimeMillis;
                strArr222[19] = str20;
                strArr222[20] = str19;
                strArr222[21] = str13;
                strArr222[22] = str21;
                strArr222[23] = m12409g;
                strArr222[24] = AbstractC18942g.m99250f();
                strArr222[25] = str14;
                strArr222[26] = str15;
                strArr222[27] = str18;
                if (!z11) {
                }
                strArr222[28] = str23;
                if (!z11) {
                }
                strArr222[29] = str24;
                strArr222[30] = str22;
                return new C1483e(strArr32, strArr222);
            }
        } catch (Exception e18) {
            e = e18;
            str2 = "";
            str3 = str2;
        }
        try {
            str5 = str4;
            str6 = str3;
            str7 = str2;
            str8 = AbstractC23059e9.m118332k();
        } catch (Exception e19) {
            e = e19;
            e.printStackTrace();
            str5 = str4;
            str6 = str3;
            str7 = str2;
            str8 = "";
            str9 = AbstractC18458a.f93019a;
            str10 = "UNKNOWN";
            String str252 = "000000";
            m12302a = AbstractC2340c0.m12302a(MainApplication.getAppContext());
            i11 = AbstractC23349d.m122766d();
            str10 = AbstractC23349d.m122767e();
            i12 = AbstractC20626a.m107387c();
            str252 = AbstractC23349d.m122764b();
            str13 = AbstractC18942g.m99249e();
            str14 = C23055e5.m118268c(MainApplication.getAppContext());
            str15 = AbstractC23193r0.m119494c(MainApplication.getAppContext());
            if (C8937j0.m47663l("ads_id_get_info_on_login")) {
            }
            aVar = C20166b.Companion;
            str12 = aVar.m105162b().m105151c(MainApplication.getAppContext());
            if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99531p) {
            }
            i13 = i11;
            str17 = str12;
            str18 = str11;
            i14 = i12;
            z11 = z12;
            jSONObject = new JSONObject();
            str21 = m12302a;
            Field[] fields222 = BuildConfig.class.getFields();
            str19 = str8;
            length = fields222.length;
            str20 = str9;
            i15 = 0;
            while (i15 < length) {
            }
            AbstractC7306b.Companion.m37258b(jSONObject);
            str22 = jSONObject.toString();
            if (str13 == null) {
            }
            if (str18 == null) {
            }
            m12409g = AbstractC2373t.m12409g();
            if (m12409g == null) {
            }
            String[] strArr322 = {"client_type", "iso_country_code", "inc_p", "avatarSize", ZinstantMetaConstant.IMPRESSION_META_TYPE, "model", "imei", "client_version", "distributor", "distributor_mobile_tracking", "cs", "width", "height", "heap", "operator", "network", "time_zone", "language", "local_time", "user_language", "deviceInfo", "device_identifier", "certificatedKey", "zcid", "preload_info", "mac_address", "android_id", "advertising_id", "fcm_token", "hcm_token", "build_info"};
            String[] strArr2222 = new String[31];
            strArr2222[0] = "1";
            strArr2222[1] = str;
            strArr2222[2] = "1";
            strArr2222[3] = "" + m117905e;
            strArr2222[4] = "1";
            strArr2222[5] = str16;
            strArr2222[6] = str252;
            strArr2222[7] = "" + CoreUtility.f89236l;
            strArr2222[8] = BuildConfig.DISTRIBUTOR;
            strArr2222[9] = "";
            strArr2222[10] = str7;
            strArr2222[11] = "" + MainApplication.f37848N;
            strArr2222[12] = "" + MainApplication.f37849O;
            strArr2222[13] = "" + MainApplication.f37850P;
            strArr2222[14] = "" + i13;
            strArr2222[15] = "" + i14;
            strArr2222[16] = str5;
            strArr2222[17] = str6;
            strArr2222[18] = "" + currentTimeMillis;
            strArr2222[19] = str20;
            strArr2222[20] = str19;
            strArr2222[21] = str13;
            strArr2222[22] = str21;
            strArr2222[23] = m12409g;
            strArr2222[24] = AbstractC18942g.m99250f();
            strArr2222[25] = str14;
            strArr2222[26] = str15;
            strArr2222[27] = str18;
            if (!z11) {
            }
            strArr2222[28] = str23;
            if (!z11) {
            }
            strArr2222[29] = str24;
            strArr2222[30] = str22;
            return new C1483e(strArr322, strArr2222);
        }
        str9 = AbstractC18458a.f93019a;
        str10 = "UNKNOWN";
        String str2522 = "000000";
        m12302a = AbstractC2340c0.m12302a(MainApplication.getAppContext());
        i11 = AbstractC23349d.m122766d();
        str10 = AbstractC23349d.m122767e();
        i12 = AbstractC20626a.m107387c();
        try {
            str2522 = AbstractC23349d.m122764b();
            str13 = AbstractC18942g.m99249e();
            str14 = C23055e5.m118268c(MainApplication.getAppContext());
            str15 = AbstractC23193r0.m119494c(MainApplication.getAppContext());
            if (C8937j0.m47663l("ads_id_get_info_on_login")) {
                str16 = str10;
                try {
                    str11 = AbstractC2339c.m12298b(MainApplication.getAppContext(), new SensitiveData("ads_id_get_info_on_login", "ads_id"));
                } catch (Exception e21) {
                    e = e21;
                    str11 = "";
                    str12 = str11;
                    str10 = str16;
                    AbstractC23350e.m122778h(e);
                    str16 = str10;
                    i13 = i11;
                    str17 = str12;
                    str18 = str11;
                    i14 = i12;
                    z11 = true;
                    jSONObject = new JSONObject();
                    str21 = m12302a;
                    Field[] fields2222 = BuildConfig.class.getFields();
                    str19 = str8;
                    length = fields2222.length;
                    str20 = str9;
                    i15 = 0;
                    while (i15 < length) {
                    }
                    AbstractC7306b.Companion.m37258b(jSONObject);
                    str22 = jSONObject.toString();
                    if (str13 == null) {
                    }
                    if (str18 == null) {
                    }
                    m12409g = AbstractC2373t.m12409g();
                    if (m12409g == null) {
                    }
                    String[] strArr3222 = {"client_type", "iso_country_code", "inc_p", "avatarSize", ZinstantMetaConstant.IMPRESSION_META_TYPE, "model", "imei", "client_version", "distributor", "distributor_mobile_tracking", "cs", "width", "height", "heap", "operator", "network", "time_zone", "language", "local_time", "user_language", "deviceInfo", "device_identifier", "certificatedKey", "zcid", "preload_info", "mac_address", "android_id", "advertising_id", "fcm_token", "hcm_token", "build_info"};
                    String[] strArr22222 = new String[31];
                    strArr22222[0] = "1";
                    strArr22222[1] = str;
                    strArr22222[2] = "1";
                    strArr22222[3] = "" + m117905e;
                    strArr22222[4] = "1";
                    strArr22222[5] = str16;
                    strArr22222[6] = str2522;
                    strArr22222[7] = "" + CoreUtility.f89236l;
                    strArr22222[8] = BuildConfig.DISTRIBUTOR;
                    strArr22222[9] = "";
                    strArr22222[10] = str7;
                    strArr22222[11] = "" + MainApplication.f37848N;
                    strArr22222[12] = "" + MainApplication.f37849O;
                    strArr22222[13] = "" + MainApplication.f37850P;
                    strArr22222[14] = "" + i13;
                    strArr22222[15] = "" + i14;
                    strArr22222[16] = str5;
                    strArr22222[17] = str6;
                    strArr22222[18] = "" + currentTimeMillis;
                    strArr22222[19] = str20;
                    strArr22222[20] = str19;
                    strArr22222[21] = str13;
                    strArr22222[22] = str21;
                    strArr22222[23] = m12409g;
                    strArr22222[24] = AbstractC18942g.m99250f();
                    strArr22222[25] = str14;
                    strArr22222[26] = str15;
                    strArr22222[27] = str18;
                    if (!z11) {
                    }
                    strArr22222[28] = str23;
                    if (!z11) {
                    }
                    strArr22222[29] = str24;
                    strArr22222[30] = str22;
                    return new C1483e(strArr3222, strArr22222);
                }
            } else {
                str16 = str10;
                str11 = "";
            }
            aVar = C20166b.Companion;
            str12 = aVar.m105162b().m105151c(MainApplication.getAppContext());
            if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99531p) {
                z12 = true;
            } else {
                z12 = false;
            }
            i13 = i11;
            str17 = str12;
            str18 = str11;
            i14 = i12;
            z11 = z12;
        } catch (Exception e22) {
            e = e22;
            str11 = "";
            str12 = str11;
            str13 = str12;
            str14 = str13;
        }
        try {
            jSONObject = new JSONObject();
            str21 = m12302a;
            try {
                Field[] fields22222 = BuildConfig.class.getFields();
                str19 = str8;
                length = fields22222.length;
                str20 = str9;
                i15 = 0;
                while (i15 < length) {
                    int i16 = length;
                    try {
                        Field field = fields22222[i15];
                        Field[] fieldArr = fields22222;
                        Object obj = field.get(null);
                        if (obj != null) {
                            jSONObject.put(field.getName(), obj.toString());
                        }
                        i15++;
                        length = i16;
                        fields22222 = fieldArr;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC23350e.m122778h(th);
                        str22 = "";
                        if (str13 == null) {
                        }
                        if (str18 == null) {
                        }
                        m12409g = AbstractC2373t.m12409g();
                        if (m12409g == null) {
                        }
                        String[] strArr32222 = {"client_type", "iso_country_code", "inc_p", "avatarSize", ZinstantMetaConstant.IMPRESSION_META_TYPE, "model", "imei", "client_version", "distributor", "distributor_mobile_tracking", "cs", "width", "height", "heap", "operator", "network", "time_zone", "language", "local_time", "user_language", "deviceInfo", "device_identifier", "certificatedKey", "zcid", "preload_info", "mac_address", "android_id", "advertising_id", "fcm_token", "hcm_token", "build_info"};
                        String[] strArr222222 = new String[31];
                        strArr222222[0] = "1";
                        strArr222222[1] = str;
                        strArr222222[2] = "1";
                        strArr222222[3] = "" + m117905e;
                        strArr222222[4] = "1";
                        strArr222222[5] = str16;
                        strArr222222[6] = str2522;
                        strArr222222[7] = "" + CoreUtility.f89236l;
                        strArr222222[8] = BuildConfig.DISTRIBUTOR;
                        strArr222222[9] = "";
                        strArr222222[10] = str7;
                        strArr222222[11] = "" + MainApplication.f37848N;
                        strArr222222[12] = "" + MainApplication.f37849O;
                        strArr222222[13] = "" + MainApplication.f37850P;
                        strArr222222[14] = "" + i13;
                        strArr222222[15] = "" + i14;
                        strArr222222[16] = str5;
                        strArr222222[17] = str6;
                        strArr222222[18] = "" + currentTimeMillis;
                        strArr222222[19] = str20;
                        strArr222222[20] = str19;
                        strArr222222[21] = str13;
                        strArr222222[22] = str21;
                        strArr222222[23] = m12409g;
                        strArr222222[24] = AbstractC18942g.m99250f();
                        strArr222222[25] = str14;
                        strArr222222[26] = str15;
                        strArr222222[27] = str18;
                        if (!z11) {
                        }
                        strArr222222[28] = str23;
                        if (!z11) {
                        }
                        strArr222222[29] = str24;
                        strArr222222[30] = str22;
                        return new C1483e(strArr32222, strArr222222);
                    }
                }
                AbstractC7306b.Companion.m37258b(jSONObject);
                str22 = jSONObject.toString();
            } catch (Throwable th3) {
                th = th3;
                str19 = str8;
            }
        } catch (Throwable th4) {
            th = th4;
            str19 = str8;
            str20 = str9;
            str21 = m12302a;
        }
        if (str13 == null) {
            str13 = "";
        }
        if (str18 == null) {
            str18 = "";
        }
        m12409g = AbstractC2373t.m12409g();
        if (m12409g == null) {
            m12409g = "";
        }
        String[] strArr322222 = {"client_type", "iso_country_code", "inc_p", "avatarSize", ZinstantMetaConstant.IMPRESSION_META_TYPE, "model", "imei", "client_version", "distributor", "distributor_mobile_tracking", "cs", "width", "height", "heap", "operator", "network", "time_zone", "language", "local_time", "user_language", "deviceInfo", "device_identifier", "certificatedKey", "zcid", "preload_info", "mac_address", "android_id", "advertising_id", "fcm_token", "hcm_token", "build_info"};
        String[] strArr2222222 = new String[31];
        strArr2222222[0] = "1";
        strArr2222222[1] = str;
        strArr2222222[2] = "1";
        strArr2222222[3] = "" + m117905e;
        strArr2222222[4] = "1";
        strArr2222222[5] = str16;
        strArr2222222[6] = str2522;
        strArr2222222[7] = "" + CoreUtility.f89236l;
        strArr2222222[8] = BuildConfig.DISTRIBUTOR;
        strArr2222222[9] = "";
        strArr2222222[10] = str7;
        strArr2222222[11] = "" + MainApplication.f37848N;
        strArr2222222[12] = "" + MainApplication.f37849O;
        strArr2222222[13] = "" + MainApplication.f37850P;
        strArr2222222[14] = "" + i13;
        strArr2222222[15] = "" + i14;
        strArr2222222[16] = str5;
        strArr2222222[17] = str6;
        strArr2222222[18] = "" + currentTimeMillis;
        strArr2222222[19] = str20;
        strArr2222222[20] = str19;
        strArr2222222[21] = str13;
        strArr2222222[22] = str21;
        strArr2222222[23] = m12409g;
        strArr2222222[24] = AbstractC18942g.m99250f();
        strArr2222222[25] = str14;
        strArr2222222[26] = str15;
        strArr2222222[27] = str18;
        if (!z11) {
            str23 = "";
        } else {
            str23 = str17;
        }
        strArr2222222[28] = str23;
        if (!z11) {
            str24 = str17;
        }
        strArr2222222[29] = str24;
        strArr2222222[30] = str22;
        return new C1483e(strArr322222, strArr2222222);
    }

    /* renamed from: d */
    private static Map m1360d() {
        if (f2531a == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("width", "device_width");
            hashMap.put("height", "device_height");
            hashMap.put("heap", "device_heap");
            hashMap.put("deviceInfo", "device_info");
            hashMap.put("avatarSize", "avatar_size");
            f2531a = hashMap;
        }
        return f2531a;
    }
}
