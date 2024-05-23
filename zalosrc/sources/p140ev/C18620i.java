package p140ev;

import android.text.TextUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;
import org.json.JSONObject;
import s00.AbstractC26080o;

/* renamed from: ev.i */
/* loaded from: classes4.dex */
public final class C18620i implements Serializable {

    /* renamed from: p */
    private final int f93704p;
    public static final a Companion = new a(null);

    /* renamed from: q */
    public static final C18620i f93694q = new C18620i(0);

    /* renamed from: r */
    public static final C18620i f93695r = new C18620i(100);

    /* renamed from: s */
    public static final C18620i f93696s = new C18620i(1001);

    /* renamed from: t */
    public static final C18620i f93697t = new C18620i(ZAbstractBase.ZVU_BLEND_PERCENTAGE);

    /* renamed from: u */
    public static final C18620i f93698u = new C18620i(ZAbstractBase.ZVU_BLEND_GEN_THUMB);

    /* renamed from: v */
    public static final C18620i f93699v = new C18620i(1004);

    /* renamed from: w */
    public static final C18620i f93700w = new C18620i(1005);

    /* renamed from: x */
    public static final C18620i f93701x = new C18620i(1051);

    /* renamed from: y */
    public static final C18620i f93702y = new C18620i(1053);

    /* renamed from: z */
    public static final C18620i f93703z = new C18620i(1052);

    /* renamed from: A */
    public static final C18620i f93658A = new C18620i(1054);

    /* renamed from: B */
    public static final C18620i f93659B = new C18620i(1055);

    /* renamed from: C */
    public static final C18620i f93660C = new C18620i(1101);

    /* renamed from: D */
    public static final C18620i f93661D = new C18620i(1151);

    /* renamed from: E */
    public static final C18620i f93662E = new C18620i(1152);

    /* renamed from: F */
    public static final C18620i f93663F = new C18620i(1153);

    /* renamed from: G */
    public static final C18620i f93664G = new C18620i(1154);

    /* renamed from: H */
    public static final C18620i f93665H = new C18620i(1200);

    /* renamed from: I */
    public static final C18620i f93666I = new C18620i(1201);

    /* renamed from: J */
    public static final C18620i f93667J = new C18620i(1202);

    /* renamed from: K */
    public static final C18620i f93668K = new C18620i(1251);

    /* renamed from: L */
    public static final C18620i f93669L = new C18620i(1252);

    /* renamed from: M */
    public static final C18620i f93670M = new C18620i(1300);

    /* renamed from: N */
    public static final C18620i f93671N = new C18620i(1350);

    /* renamed from: O */
    public static final C18620i f93672O = new C18620i(1351);

    /* renamed from: P */
    public static final C18620i f93673P = new C18620i(10000);

    /* renamed from: Q */
    public static final C18620i f93674Q = new C18620i(6100);

    /* renamed from: R */
    public static final C18620i f93675R = new C18620i(1102);

    /* renamed from: S */
    public static final C18620i f93676S = new C18620i(1103);

    /* renamed from: T */
    public static final C18620i f93677T = new C18620i(AbstractC26080o.a.f124275b);

    /* renamed from: U */
    public static final C18620i f93678U = new C18620i(1352);

    /* renamed from: V */
    public static final C18620i f93679V = new C18620i(1006);

    /* renamed from: W */
    public static final C18620i f93680W = new C18620i(1056);

    /* renamed from: X */
    public static final C18620i f93681X = new C18620i(101);

    /* renamed from: Y */
    public static final C18620i f93682Y = new C18620i(1251);

    /* renamed from: Z */
    public static final C18620i f93683Z = new C18620i(4003);

    /* renamed from: a0 */
    public static final C18620i f93684a0 = new C18620i(1351);

    /* renamed from: b0 */
    public static final C18620i f93685b0 = new C18620i(1104);

    /* renamed from: c0 */
    public static final C18620i f93686c0 = new C18620i(4006);

    /* renamed from: d0 */
    public static final C18620i f93687d0 = new C18620i(4004);

    /* renamed from: e0 */
    public static final C18620i f93688e0 = new C18620i(4005);

    /* renamed from: f0 */
    public static final C18620i f93689f0 = new C18620i(4002);

    /* renamed from: g0 */
    public static final C18620i f93690g0 = new C18620i(6151);

    /* renamed from: h0 */
    public static final C18620i f93691h0 = new C18620i(6150);

    /* renamed from: i0 */
    public static final C18620i f93692i0 = new C18620i(1203);

    /* renamed from: j0 */
    public static final C18620i f93693j0 = new C18620i(1400);

    /* renamed from: ev.i$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        private final boolean m98404b(C18620i c18620i) {
            int m98403a = c18620i.m98403a();
            if (5000 > m98403a || m98403a >= 10000) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private final boolean m98405c(C18620i c18620i) {
            if (c18620i.m98403a() == 10000) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final String m98406a(String str, C18620i c18620i) {
            JSONObject jSONObject;
            AbstractC19074t.m100208f(c18620i, "sourceOpenMiniApp");
            if (str != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        jSONObject = new JSONObject(str);
                        jSONObject.put("sourceOpen", c18620i.m98403a());
                    } catch (Exception unused) {
                        return str;
                    }
                }
                return jSONObject.toString();
            }
            return str;
        }

        /* renamed from: d */
        public final boolean m98407d(C18620i c18620i) {
            AbstractC19074t.m100208f(c18620i, "<this>");
            int m98403a = c18620i.m98403a();
            if (2000 > m98403a || m98403a >= 5000) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public final boolean m98408e(C18620i c18620i) {
            AbstractC19074t.m100208f(c18620i, "<this>");
            if (!m98407d(c18620i) && !m98404b(c18620i) && !m98405c(c18620i)) {
                return true;
            }
            return false;
        }
    }

    public C18620i(int i11) {
        this.f93704p = i11;
    }

    /* renamed from: a */
    public final int m98403a() {
        return this.f93704p;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C18620i) && ((C18620i) obj).f93704p == this.f93704p) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f93704p << 10;
    }

    public String toString() {
        String str;
        int i11 = this.f93704p;
        if (i11 != 0) {
            if (i11 != 100) {
                if (i11 != 101) {
                    if (i11 != 1251) {
                        if (i11 != 1252) {
                            if (i11 != 6150) {
                                if (i11 != 6151) {
                                    switch (i11) {
                                        case 0:
                                            break;
                                        case 1001:
                                            str = "CHAT_1_1_LINK_ID";
                                            break;
                                        case ZAbstractBase.ZVU_BLEND_PERCENTAGE /* 1002 */:
                                            str = "CHAT_1_1_LINK_MEDIA_STORE_ID";
                                            break;
                                        case ZAbstractBase.ZVU_BLEND_GEN_THUMB /* 1003 */:
                                            str = "CHAT_1_1_QR_FOOTER_OF_MESSAGE_PHOTO_ID";
                                            break;
                                        case 1004:
                                            str = "CHAT_1_1_QR_VIEW_PHOTO_ID";
                                            break;
                                        case 1005:
                                            str = "CHAT_1_1_QR_VIEW_PHOTO_IN_MEDIA_STORE_ID";
                                            break;
                                        case 1006:
                                            str = "CHAT_VIEW_ATTACHMENT_ID_1_1";
                                            break;
                                        case 1400:
                                            str = "QR_IN_ADD_FRIEND_ID";
                                            break;
                                        case AbstractC26080o.a.f124275b /* 5000 */:
                                            str = "MINI_APP_STORE_ID";
                                            break;
                                        case 6100:
                                            str = "DISCOVERY_TAB_ID";
                                            break;
                                        case 10000:
                                            str = "WEB_VIEW_ID";
                                            break;
                                        default:
                                            switch (i11) {
                                                case 1051:
                                                    str = "CHAT_GROUP_LINK_ID";
                                                    break;
                                                case 1052:
                                                    str = "CHAT_GROUP_LINK_MEDIA_STORE_ID";
                                                    break;
                                                case 1053:
                                                    str = "CHAT_GROUP_QR_FOOTER_OF_MESSAGE_PHOTO_ID";
                                                    break;
                                                case 1054:
                                                    str = "CHAT_GROUP_QR_VIEW_PHOTO_ID";
                                                    break;
                                                case 1055:
                                                    str = "CHAT_GROUP_QR_VIEW_PHOTO_IN_MEDIA_STORE_ID";
                                                    break;
                                                case 1056:
                                                    str = "CHAT_VIEW_ATTACHMENT_ID_GROUP";
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 1101:
                                                            str = "OA_LINK_ID";
                                                            break;
                                                        case 1102:
                                                            str = "MENU_V1_CSC_OA_ID";
                                                            break;
                                                        case 1103:
                                                            str = "MENU_V2_CSC_OA_ID";
                                                            break;
                                                        case 1104:
                                                            str = "OA_PROFILE_ID";
                                                            break;
                                                        default:
                                                            switch (i11) {
                                                                case 1151:
                                                                    str = "FEED_LINK_POST_ID";
                                                                    break;
                                                                case 1152:
                                                                    str = "FEED_LINK_COMMENT_ID";
                                                                    break;
                                                                case 1153:
                                                                    str = "FEED_QR_VIEW_PHOTO_ID";
                                                                    break;
                                                                case 1154:
                                                                    str = "FEED_QR_VIEW_PHOTO_COMMENT_ID";
                                                                    break;
                                                                default:
                                                                    switch (i11) {
                                                                        case 1200:
                                                                            str = "QR_IMAGE_ID";
                                                                            break;
                                                                        case 1201:
                                                                            str = "QR_CAMERA_ID";
                                                                            break;
                                                                        case 1202:
                                                                            str = "QR_GALLERY_ID";
                                                                            break;
                                                                        case 1203:
                                                                            str = "MY_QR_IN_CAMERA_VIEW_ID";
                                                                            break;
                                                                        default:
                                                                            switch (i11) {
                                                                                case 1350:
                                                                                    str = "TAB_ME_ID";
                                                                                    break;
                                                                                case 1351:
                                                                                    str = "CREATE_AI_AVATAR_ID";
                                                                                    break;
                                                                                case 1352:
                                                                                    str = "CALL_RING_BACK_TONE_SETTING_ID";
                                                                                    break;
                                                                                default:
                                                                                    switch (i11) {
                                                                                        case 4002:
                                                                                            str = "BANNER_TIMELINE_TAB_ID";
                                                                                            break;
                                                                                        case 4003:
                                                                                            str = "BANNER_GLOBAL_SEARCH_ID";
                                                                                            break;
                                                                                        case 4004:
                                                                                            str = "BANNER_MSG_TAB_ID";
                                                                                            break;
                                                                                        case 4005:
                                                                                            str = "BANNER_PROFILE_VIEW_ID";
                                                                                            break;
                                                                                        case 4006:
                                                                                            str = "BANNER_ME_TAB_ID";
                                                                                            break;
                                                                                        default:
                                                                                            str = super.toString();
                                                                                            break;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                } else {
                                    str = "DISCOVERY_SEARCH_ID";
                                }
                            } else {
                                str = "DISCOVERY_PRE_SEARCH_ID";
                            }
                        } else {
                            str = "GLOBAL_PRE_SEARCH_ID";
                        }
                    } else {
                        str = "GLOBAL_SEARCH_ID";
                    }
                } else {
                    str = "REDIRECT_ID";
                }
            } else {
                str = "DEEP_LINK_ID";
            }
            return str + "(" + this.f93704p + ")";
        }
        str = "DEFAULT_ID";
        return str + "(" + this.f93704p + ")";
    }
}
