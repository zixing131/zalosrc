package vg;

import am.C0943w;
import android.text.TextUtils;
import au.AbstractC2345f;
import au.C2343e;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.zalocloud.model.api.CloudSubscriptionInfo;
import com.zing.zalo.shortvideo.data.utils.C9466c;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.zinstant.C17105c;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.utils.ScriptHelperImpl;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import ho0.AbstractC20110a;
import hu.C20128b;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import me0.AbstractC23005a;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import me0.AbstractC23244v8;
import me0.C23055e5;
import me0.C23186q4;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p133ek.AbstractC18458a;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p645xh.C29628e;
import p716zh.C31973j5;
import pe0.AbstractC24743a;

/* renamed from: vg.q2 */
/* loaded from: classes3.dex */
public abstract class AbstractC28163q2 {
    /* renamed from: a */
    private static boolean m141681a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String string = new JSONObject(str).getString("oaid");
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            if (!C21927m.m114302u().m114322U(string)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m141682b(String str) {
        char c11;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("action");
            int i11 = jSONObject.getInt("android");
            int androidVersionCode = ScriptHelperImpl.getAndroidVersionCode();
            int hashCode = string.hashCode();
            if (hashCode != 3244) {
                if (hashCode != 3294) {
                    if (hashCode != 3309) {
                        if (hashCode != 3449) {
                            if (hashCode != 3464) {
                                if (hashCode == 3511 && string.equals("ne")) {
                                    c11 = 0;
                                    if (c11 == 0) {
                                        if (c11 != 1) {
                                            if (c11 != 2) {
                                                if (c11 != 3) {
                                                    if (c11 != 4) {
                                                        if (c11 != 5 || androidVersionCode > i11) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                    if (androidVersionCode >= i11) {
                                                        return false;
                                                    }
                                                    return true;
                                                }
                                                if (androidVersionCode < i11) {
                                                    return false;
                                                }
                                                return true;
                                            }
                                            if (androidVersionCode <= i11) {
                                                return false;
                                            }
                                            return true;
                                        }
                                        if (androidVersionCode != i11) {
                                            return false;
                                        }
                                        return true;
                                    }
                                    if (androidVersionCode == i11) {
                                        return false;
                                    }
                                    return true;
                                }
                                c11 = 65535;
                                if (c11 == 0) {
                                }
                            } else {
                                if (string.equals("lt")) {
                                    c11 = 4;
                                    if (c11 == 0) {
                                    }
                                }
                                c11 = 65535;
                                if (c11 == 0) {
                                }
                            }
                        } else {
                            if (string.equals("le")) {
                                c11 = 5;
                                if (c11 == 0) {
                                }
                            }
                            c11 = 65535;
                            if (c11 == 0) {
                            }
                        }
                    } else {
                        if (string.equals("gt")) {
                            c11 = 2;
                            if (c11 == 0) {
                            }
                        }
                        c11 = 65535;
                        if (c11 == 0) {
                        }
                    }
                } else {
                    if (string.equals("ge")) {
                        c11 = 3;
                        if (c11 == 0) {
                        }
                    }
                    c11 = 65535;
                    if (c11 == 0) {
                    }
                }
            } else {
                if (string.equals("eq")) {
                    c11 = 1;
                    if (c11 == 0) {
                    }
                }
                c11 = 65535;
                if (c11 == 0) {
                }
            }
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: c */
    static String m141683c(String str) {
        DateFormat dateFormat;
        try {
            JSONObject jSONObject = new JSONObject(str);
            long j11 = jSONObject.getLong("timestamp");
            String string = jSONObject.getString("pattern");
            int optInt = jSONObject.optInt("format", 0);
            if (jSONObject.optInt("calendar", 0) == 1) {
                dateFormat = new C23186q4(string, new Locale(AbstractC18458a.f93019a));
            } else {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string, new Locale(AbstractC18458a.f93019a));
                simpleDateFormat.getDateFormatSymbols().setWeekdays(MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_days_of_week_full));
                simpleDateFormat.getDateFormatSymbols().setShortWeekdays(MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_days_of_week_short));
                simpleDateFormat.getDateFormatSymbols().setShortMonths(MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_months_short));
                simpleDateFormat.getDateFormatSymbols().setMonths(MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_months_full));
                dateFormat = simpleDateFormat;
            }
            String format = dateFormat.format(new Date(j11));
            if (optInt != 1) {
                if (optInt != 2) {
                    if (optInt != 3) {
                        if (optInt == 4) {
                            return AbstractC23244v8.m119739c(format);
                        }
                        return format;
                    }
                    return format.toLowerCase();
                }
                return format.toUpperCase();
            }
            return AbstractC23244v8.m119740d(format);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    private static String m141684d() {
        CloudSubscriptionInfo m2458h = AbstractC23306f.m120691m2().m2458h();
        if (m2458h != null) {
            return m2458h.m41322f();
        }
        return "";
    }

    /* renamed from: e */
    private static String m141685e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("zalo_size", C20128b.m104778y());
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ce, code lost:            if (r8.equals("action.query.enable.check.gamecenter") == false) goto L362;     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m141686f(String str, String str2) {
        char c11;
        str.hashCode();
        char c12 = 4;
        switch (str.hashCode()) {
            case -2017848685:
                if (str.equals("action.open.addfriend")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1800864416:
                if (str.equals("action.query.hide")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1800537317:
                if (str.equals("action.query.show")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -1703071105:
                if (str.equals("action.query.check.biometrics")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1484607133:
                if (str.equals("action.query.check.group.has_name")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -1392358831:
                if (str.equals("action.open.sticker")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -1392351947:
                if (str.equals("action.open.app")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -1392334739:
                if (str.equals("action.open.sms")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -1131437519:
                if (str.equals("action.query.check.group.has_avatar")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -995421901:
                if (str.equals("action.open.gamecenter")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case -987623510:
                if (str.equals("action.open.postfeed")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case -982786462:
                if (str.equals("action.query.check.network.connection")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case -966632145:
                if (str.equals("action.open.gamedetail")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case -144255681:
                if (str.equals("action.query.check.feature.enable")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case 188467901:
                if (str.equals("action.open.profile")) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case 687358312:
                if (str.equals("action.query.check.oa.followed")) {
                    c11 = 15;
                    break;
                }
                c11 = 65535;
                break;
            case 781414193:
                if (str.equals("action.open.gamenews")) {
                    c11 = 16;
                    break;
                }
                c11 = 65535;
                break;
            case 886363360:
                if (str.equals("action.query.check.myuid")) {
                    c11 = 17;
                    break;
                }
                c11 = 65535;
                break;
            case 1395191490:
                if (str.equals("action.open.galary")) {
                    c11 = 18;
                    break;
                }
                c11 = 65535;
                break;
            case 1400103659:
                if (str.equals("action.condition.version.zalo")) {
                    c11 = 19;
                    break;
                }
                c11 = 65535;
                break;
            case 1400447357:
                if (str.equals("action.query.location.hide")) {
                    c11 = 20;
                    break;
                }
                c11 = 65535;
                break;
            case 1527222464:
                if (str.equals("action.open.logindevices")) {
                    c11 = 21;
                    break;
                }
                c11 = 65535;
                break;
            case 1598977771:
                if (str.equals("action.open.nearby")) {
                    c11 = 22;
                    break;
                }
                c11 = 65535;
                break;
            case 1617653901:
                if (str.equals("action.open.qr")) {
                    c11 = 23;
                    break;
                }
                c11 = 65535;
                break;
            case 1642933375:
                if (str.equals("action.open.outapp")) {
                    c11 = 24;
                    break;
                }
                c11 = 65535;
                break;
            case 1829504063:
                if (str.equals("action.query.check.datetime")) {
                    c11 = 25;
                    break;
                }
                c11 = 65535;
                break;
            case 1986893040:
                if (str.equals("action.open.inapp")) {
                    c11 = 26;
                    break;
                }
                c11 = 65535;
                break;
            case 1993192322:
                if (str.equals("action.open.phone")) {
                    c11 = 27;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
            case '\t':
            case '\n':
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
                return true;
            case 1:
            case 2:
            case 5:
            case 7:
            case '\f':
            case 14:
            case 24:
            case 26:
            case 27:
                return !TextUtils.isEmpty(str2);
            case 3:
                return AbstractC2345f.m12313b(MainApplication.getAppContext());
            case 4:
                C31973j5 m4472f = C0943w.m4462l().m4472f(str2);
                if (m4472f == null || m4472f.m153716G() != 1) {
                    return false;
                }
                return true;
            case 6:
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                try {
                    return !TextUtils.isEmpty(AbstractC18069a.m96089h(new JSONObject(str2), "android"));
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return false;
                }
            case '\b':
                C31973j5 m4472f2 = C0943w.m4462l().m4472f(str2);
                if (m4472f2 == null || !m4472f2.m153786t0()) {
                    return false;
                }
                return true;
            case 11:
                try {
                    int optInt = new JSONObject(str2).optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 0);
                    if (optInt != 1) {
                        if (optInt != 2) {
                            return C23055e5.m118271f();
                        }
                        if (!C23055e5.m118271f() || C23055e5.m118270e()) {
                            return false;
                        }
                        return true;
                    }
                    return C23055e5.m118270e();
                } catch (JSONException unused) {
                    return C23055e5.m118271f();
                }
            case '\r':
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -1281365636:
                        if (str2.equals("action.query.enable.check.discover")) {
                            c12 = 0;
                            break;
                        }
                        c12 = 65535;
                        break;
                    case -653335342:
                        if (str2.equals("action.query.enable.check.nearby")) {
                            c12 = 1;
                            break;
                        }
                        c12 = 65535;
                        break;
                    case -396780073:
                        if (str2.equals("action.query.enable.check.stickerstore")) {
                            c12 = 2;
                            break;
                        }
                        c12 = 65535;
                        break;
                    case 709989794:
                        if (str2.equals("action.query.enable.check.page")) {
                            c12 = 3;
                            break;
                        }
                        c12 = 65535;
                        break;
                    case 1797534618:
                        break;
                    default:
                        c12 = 65535;
                        break;
                }
                switch (c12) {
                    case 0:
                        if (AbstractC23309i.m122600y1() != 1) {
                            return false;
                        }
                        return true;
                    case 1:
                        return AbstractC23309i.m121849e();
                    case 2:
                        return AbstractC23309i.m122343r3();
                    case 3:
                        if (AbstractC23309i.m121266Ob() == -1) {
                            return false;
                        }
                        return true;
                    case 4:
                        if (AbstractC23309i.m120748Ab() == -1) {
                            return false;
                        }
                        return true;
                    default:
                        throw new IllegalArgumentException("Unsupported data: " + str2);
                }
            case 15:
                return m141681a(str2);
            case 17:
                if (TextUtils.isEmpty(CoreUtility.f89233i) || !TextUtils.equals(CoreUtility.f89233i, str2)) {
                    return false;
                }
                return true;
            case 19:
                return m141682b(str2);
            case 25:
                return m141689i(str2);
            default:
                throw new IllegalArgumentException("Unsupported action: " + str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: g */
    public static String m141687g(String str, String str2, Object obj) {
        char c11;
        String str3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        int i11 = -1;
        switch (str.hashCode()) {
            case -1843393952:
                if (str.equals("action.query.get.uidNoise")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1800548603:
                if (str.equals("action.query.get.time.local.convert")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1501685049:
                if (str.equals("action.query.zcloudinfo")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -1472713975:
                if (str.equals("action.query.zalosize")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1428249698:
                if (str.equals("action.query.get.zalo.servertime")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -1420650281:
                if (str.equals("action.query.get.displayname")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -625197400:
                if (str.equals("action.query.get.displayname.group")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -407431072:
                if (str.equals("action.query.get.avatar.group")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case 760942031:
                if (str.equals("action.check.app.installed")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case 882377921:
                if (str.equals("action.query.get.phonenumber")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case 891397991:
                if (str.equals("action.query.zvideo.filter")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 1560353935:
                if (str.equals("action.query.get.avatar")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case 1716801015:
                if (str.equals("action.query.get.gender")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case 2095928298:
                if (str.equals("action.query.text.decrypt")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                return AbstractC24743a.m128500b();
            case 1:
                return m141683c(str2);
            case 2:
                return m141684d();
            case 3:
                return m141685e();
            case 4:
                return String.valueOf(C23793c.m124316k().mo124314i());
            case 5:
                if ("me".equals(str2)) {
                    ContactProfile contactProfile = AbstractC23304d.f113368c0;
                    if (contactProfile != null) {
                        return contactProfile.mo2475c();
                    }
                    ContactProfile m141810d = C28203u6.f131407a.m141810d(CoreUtility.f89233i, new TrackingSource((short) 1006));
                    if (m141810d != null) {
                        return m141810d.m40383Q(true, false);
                    }
                } else {
                    if (obj instanceof C17945a0) {
                        C17945a0 c17945a0 = (C17945a0) obj;
                        if (c17945a0.m94847A6() && AbstractC23184q2.m119453k(str2, null, c17945a0.mo95039W2()) != null) {
                            return AbstractC23184q2.m119453k(str2, null, c17945a0.mo95039W2());
                        }
                    }
                    ContactProfile m141810d2 = C28203u6.f131407a.m141810d(str2, new TrackingSource((short) 1006));
                    if (m141810d2 != null) {
                        return m141810d2.m40383Q(true, false);
                    }
                }
                return null;
            case 6:
                C31973j5 m4472f = C0943w.m4462l().m4472f(str2);
                if (m4472f == null) {
                    return null;
                }
                return m4472f.m153793y();
            case 7:
                C31973j5 m4472f2 = C0943w.m4462l().m4472f(str2);
                if (m4472f2 == null || !m4472f2.m153786t0()) {
                    return null;
                }
                return m4472f2.m153756e();
            case '\b':
                if (str2 != null) {
                    try {
                        JSONObject m117869a = AbstractC23005a.m117869a(new JSONObject(str2));
                        if (m117869a != null) {
                            return m117869a.toString();
                        }
                    } catch (JSONException e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
                return null;
            case '\t':
                if (!"me".equals(str2)) {
                    return null;
                }
                ContactProfile contactProfile2 = AbstractC23304d.f113368c0;
                if (contactProfile2 != null) {
                    return contactProfile2.f42455y;
                }
                ContactProfile m141810d3 = C28203u6.f131407a.m141810d(CoreUtility.f89233i, new TrackingSource((short) 1008));
                if (m141810d3 == null) {
                    return null;
                }
                return m141810d3.f42455y;
            case '\n':
                return new C9466c().m51745b(str2);
            case 11:
                if ("me".equals(str2)) {
                    ContactProfile contactProfile3 = AbstractC23304d.f113368c0;
                    if (contactProfile3 != null) {
                        return contactProfile3.f42446v;
                    }
                    return C28203u6.f131407a.m141808b(CoreUtility.f89233i);
                }
                return C28203u6.f131407a.m141808b(str2);
            case '\f':
                if ("me".equals(str2)) {
                    ContactProfile contactProfile4 = AbstractC23304d.f113368c0;
                    if (contactProfile4 != null) {
                        i11 = contactProfile4.f42449w;
                    } else {
                        ContactProfile m141810d4 = C28203u6.f131407a.m141810d(CoreUtility.f89233i, new TrackingSource((short) 1007));
                        if (m141810d4 != null) {
                            i11 = m141810d4.f42449w;
                        }
                    }
                } else {
                    ContactProfile m141810d5 = C28203u6.f131407a.m141810d(str2, new TrackingSource((short) 1007));
                    if (m141810d5 != null) {
                        i11 = m141810d5.f42449w;
                    }
                }
                if (i11 == 1) {
                    return AbstractC23136l9.m118755v0(AbstractC16775v.sex_text)[1];
                }
                if (i11 != 0) {
                    return null;
                }
                return AbstractC23136l9.m118755v0(AbstractC16775v.sex_text)[0];
            case '\r':
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String optString = jSONObject.optString("itemId");
                    String optString2 = jSONObject.optString("required");
                    String string = jSONObject.getString("value");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(string)) {
                        C17105c c17105c = C17105c.f87481a;
                        String m91462a = c17105c.m91462a(optString, string);
                        if (TextUtils.isEmpty(m91462a)) {
                            String str4 = new String((byte[]) C29628e.m147249E0().m93380H(string.getBytes(StandardCharsets.UTF_8), Integer.parseInt(optString2)).second);
                            try {
                                c17105c.m91463c(optString, string, str4);
                                return str4;
                            } catch (Exception e12) {
                                e = e12;
                                str3 = str4;
                                AbstractC20110a.m104539h(e);
                                return str3;
                            }
                        }
                        return m91462a;
                    }
                    return null;
                } catch (Exception e13) {
                    e = e13;
                }
                break;
            default:
                return null;
        }
    }

    /* renamed from: h */
    public static Object m141688h(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        if (!str.equals("action.query.get.avatar")) {
            if (!str.equals("action.query.get.qr.encode.bitmap")) {
                return "";
            }
            return new C28006a().m141159a(str2);
        }
        ContactProfile m141809c = C28203u6.f131407a.m141809c(str2);
        if (m141809c == null || !C23302b.f113247a.m120523d(str3) || CoreUtility.f89233i.equals(m141809c.f42434r)) {
            return null;
        }
        return C16640q2.m88404a().mo88412f(m141809c.m40418n0(), C2343e.m12307a(str2, false));
    }

    /* renamed from: i */
    private static boolean m141689i(String str) {
        JSONArray jSONArray = new JSONArray(str);
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i11);
            if (optJSONObject != null && optJSONObject.length() != 0 && ((!optJSONObject.has("days") || AbstractC17201m.m91819k(optJSONObject.optString("days").split(","), AbstractC23160o0.m119234a0())) && (!optJSONObject.has("hours") || AbstractC17201m.m91819k(optJSONObject.optString("hours").split(","), Calendar.getInstance().get(11))))) {
                return true;
            }
        }
        return false;
    }
}
