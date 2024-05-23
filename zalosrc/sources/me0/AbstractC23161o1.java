package me0;

import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import hm0.AbstractC20095b;
import hm0.C20096c;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: me0.o1 */
/* loaded from: classes.dex */
public abstract class AbstractC23161o1 {
    /* renamed from: a */
    public static String m119316a(int i11, String str) {
        switch (i11) {
            case -33:
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_alias_so_long_name_error);
            case -32:
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_alias_not_support_stranger);
            case -31:
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_alias_spam_case);
            case -30:
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_alias_full_list_msg);
            default:
                return str;
        }
    }

    /* renamed from: b */
    public static String m119317b(int i11) {
        switch (i11) {
            case -44:
                return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.BLOCK_REQUEST_FRIEND_GROUP_MSG_NEW), -44);
            case -43:
                return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.BLOCK_REQUEST_FRIEND_ECARD_MSG_NEW), -43);
            case -42:
                return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.BLOCK_REQUEST_FRIEND_QR_MSG_NEW), -42);
            case -41:
                return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.BLOCK_REQUEST_FRIEND_UNAME_MSG_NEW), -41);
            case -40:
                return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.BLOCK_REQUEST_FRIEND_PHONE_MSG_NEW), -40);
            default:
                return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0312 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:5:0x000e, B:8:0x0018, B:10:0x0022, B:11:0x002f, B:36:0x0060, B:37:0x0063, B:38:0x0066, B:39:0x0069, B:40:0x006c, B:41:0x006f, B:42:0x0072, B:45:0x008a, B:46:0x00a2, B:47:0x00ba, B:48:0x00d2, B:49:0x00ea, B:50:0x0102, B:51:0x011a, B:52:0x0132, B:53:0x014a, B:54:0x0162, B:55:0x017a, B:56:0x0192, B:57:0x01aa, B:58:0x01c2, B:59:0x01da, B:60:0x01f2, B:61:0x020a, B:62:0x0222, B:63:0x023a, B:64:0x0252, B:65:0x026a, B:66:0x0282, B:67:0x029a, B:68:0x02b2, B:69:0x02ca, B:70:0x02e2, B:71:0x02fa, B:72:0x0312, B:73:0x032a, B:74:0x0342, B:75:0x035a, B:76:0x0372, B:77:0x038a, B:78:0x03a2, B:79:0x03ba, B:80:0x03d2, B:81:0x03ea, B:82:0x0402, B:83:0x041a, B:84:0x0432, B:85:0x044a, B:86:0x0462, B:87:0x047a, B:88:0x0492, B:89:0x04aa, B:90:0x04c2, B:91:0x04da, B:92:0x04f2, B:93:0x050a, B:94:0x0522, B:95:0x053a, B:96:0x0552, B:97:0x056a, B:98:0x0581, B:99:0x0598, B:100:0x05af, B:101:0x05c6), top: B:4:0x000e }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m119318c(int i11, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!TextUtils.isEmpty(sb2)) {
            if (sb2.indexOf(String.valueOf(i11)) < 0) {
                sb2.append("(");
                sb2.append(i11);
                sb2.append(")");
            }
            return sb2.toString();
        }
        if (i11 != 112) {
            if (i11 != 201) {
                if (i11 != 500) {
                    if (i11 != 515) {
                        if (i11 != 601) {
                            if (i11 != 1001) {
                                if (i11 != 2212) {
                                    if (i11 != 5001) {
                                        if (i11 != 18005) {
                                            if (i11 != 17010) {
                                                if (i11 != 17011) {
                                                    switch (i11) {
                                                        case -804:
                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.str_pin_hidden_thread_not_support));
                                                            sb2.append("(");
                                                            sb2.append(i11);
                                                            sb2.append(")");
                                                            break;
                                                        case -803:
                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.LIST_PIN_OVER_MAX_SIZE_MSG));
                                                            sb2.append("(");
                                                            sb2.append(i11);
                                                            sb2.append(")");
                                                            break;
                                                        case -802:
                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.GET_PIN_INVALID_INPUT_MSG));
                                                            sb2.append("(");
                                                            sb2.append(i11);
                                                            sb2.append(")");
                                                            break;
                                                        case -801:
                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.LIST_PIN_OUTDATE_MSG));
                                                            sb2.append("(");
                                                            sb2.append(i11);
                                                            sb2.append(")");
                                                            break;
                                                        default:
                                                            switch (i11) {
                                                                case ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4 /* 2001 */:
                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.INVALID_PHONE_NUMBER_MSG));
                                                                    sb2.append("(");
                                                                    sb2.append(i11);
                                                                    sb2.append(")");
                                                                    break;
                                                                case ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP /* 2002 */:
                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.INVALID_ACTIVE_CODE_MSG));
                                                                    sb2.append("(");
                                                                    sb2.append(i11);
                                                                    sb2.append(")");
                                                                    break;
                                                                case ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE /* 2003 */:
                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.INVALID_TOKEN_MSG));
                                                                    sb2.append("(");
                                                                    sb2.append(i11);
                                                                    sb2.append(")");
                                                                    break;
                                                                case ZAbstractBase.ZVU_PROCESS_HLS_TO_MP4 /* 2004 */:
                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.USER_NOT_FOUND_MSG));
                                                                    sb2.append("(");
                                                                    sb2.append(i11);
                                                                    sb2.append(")");
                                                                    break;
                                                                case 2005:
                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.SEND_SMS_FAIL_MSG));
                                                                    sb2.append("(");
                                                                    sb2.append(i11);
                                                                    sb2.append(")");
                                                                    break;
                                                                case 2006:
                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.GENERATE_TOKEN_FAIL_MSG));
                                                                    sb2.append("(");
                                                                    sb2.append(i11);
                                                                    sb2.append(")");
                                                                    break;
                                                                case 2007:
                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.GENERATE_SESSION_KEY_FAIL_MSG));
                                                                    sb2.append("(");
                                                                    sb2.append(i11);
                                                                    sb2.append(")");
                                                                    break;
                                                                case 2008:
                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.CREATE_ACCOUNT_FAIL_MSG));
                                                                    sb2.append("(");
                                                                    sb2.append(i11);
                                                                    sb2.append(")");
                                                                    break;
                                                                default:
                                                                    switch (i11) {
                                                                        case 2011:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.OPERATOR_INVALID_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2012:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.EXCEED_SMS_TIMES_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2013:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.ACCOUNT_ALREADY_EXISTS_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2014:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.INVALID_EMAIL_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2015:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.INVALID_DATEOFBIRTH_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2016:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.INVALID_NAME_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2017:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.PASSWORD_DONT_MATCH_USERNAME_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2018:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.USERNAME_OR_PASS_EMPTY_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2019:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.MANUAL_ACTIVATION_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2020:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.MY_ACCOUNT_IS_BANED_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2021:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.EXCEED_CALLACTIVE_TIMES_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2022:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.CALL_FAIL_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2023:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.CALL_NOT_SUPPORT_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2024:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.SET_PASSWORD_FAIL_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2025:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.INVALID_PASSWORD_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2026:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.INVALID_CLIENT_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2027:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.TOO_MANY_REQUEST_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2028:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.DEVICE_NOT_ACCEPT_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        case 2029:
                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.CLIENT_VERSION_DENY_MSG));
                                                                            sb2.append("(");
                                                                            sb2.append(i11);
                                                                            sb2.append(")");
                                                                            break;
                                                                        default:
                                                                            switch (i11) {
                                                                                case 2044:
                                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.PHONE_NUMBER_IS_IN_USE_MSG));
                                                                                    sb2.append("(");
                                                                                    sb2.append(i11);
                                                                                    sb2.append(")");
                                                                                    break;
                                                                                case 2045:
                                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.PASSWORD_DONT_MATCH_ID_MSG));
                                                                                    sb2.append("(");
                                                                                    sb2.append(i11);
                                                                                    sb2.append(")");
                                                                                    break;
                                                                                case 2046:
                                                                                    break;
                                                                                case 2047:
                                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.USERNAME_IS_NOT_SUPPORT_MSG));
                                                                                    sb2.append("(");
                                                                                    sb2.append(i11);
                                                                                    sb2.append(")");
                                                                                    break;
                                                                                default:
                                                                                    switch (i11) {
                                                                                        case 17001:
                                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.INVALID_INPUT_DATA_MSG));
                                                                                            sb2.append("(");
                                                                                            sb2.append(i11);
                                                                                            sb2.append(")");
                                                                                            break;
                                                                                        case 17002:
                                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.NOT_FOLLOWED_YET_MSG));
                                                                                            sb2.append("(");
                                                                                            sb2.append(i11);
                                                                                            sb2.append(")");
                                                                                            break;
                                                                                        case 17003:
                                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.FAN_LIST_EXCEED_MSG));
                                                                                            sb2.append("(");
                                                                                            sb2.append(i11);
                                                                                            sb2.append(")");
                                                                                            break;
                                                                                        case 17004:
                                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.FOLLOW_LIST_EXCEED_MSG));
                                                                                            sb2.append("(");
                                                                                            sb2.append(i11);
                                                                                            sb2.append(")");
                                                                                            break;
                                                                                        case 17005:
                                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.FOLLOW_FAIL_MSG));
                                                                                            sb2.append("(");
                                                                                            sb2.append(i11);
                                                                                            sb2.append(")");
                                                                                            break;
                                                                                        case 17006:
                                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.UNFOLLOW_FAIL_MSG));
                                                                                            sb2.append("(");
                                                                                            sb2.append(i11);
                                                                                            sb2.append(")");
                                                                                            break;
                                                                                        case 17007:
                                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.SUBCRIBE_FAIL_MSG));
                                                                                            sb2.append("(");
                                                                                            sb2.append(i11);
                                                                                            sb2.append(")");
                                                                                            break;
                                                                                        case 17008:
                                                                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.UNSUBCRIBE_FAIL_MSG));
                                                                                            sb2.append("(");
                                                                                            sb2.append(i11);
                                                                                            sb2.append(")");
                                                                                            break;
                                                                                        default:
                                                                                            switch (i11) {
                                                                                                case 50000:
                                                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.WRONG_USER_MSG));
                                                                                                    sb2.append("(");
                                                                                                    sb2.append(i11);
                                                                                                    sb2.append(")");
                                                                                                    break;
                                                                                                case 50001:
                                                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.NETWORK_ERROR_MSG));
                                                                                                    sb2.append("(");
                                                                                                    sb2.append(i11);
                                                                                                    sb2.append(")");
                                                                                                    break;
                                                                                                case 50002:
                                                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.SOCKET_NOT_CONNECT_MSG));
                                                                                                    sb2.append("(");
                                                                                                    sb2.append(i11);
                                                                                                    sb2.append(")");
                                                                                                    break;
                                                                                                case 50003:
                                                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.SOCKET_TIME_OUT_MSG));
                                                                                                    sb2.append("(");
                                                                                                    sb2.append(i11);
                                                                                                    sb2.append(")");
                                                                                                    break;
                                                                                                default:
                                                                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.UNKNOWN_MSG));
                                                                                                    sb2.append("(");
                                                                                                    sb2.append(i11);
                                                                                                    sb2.append(")");
                                                                                                    break;
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                } else {
                                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.UNFOLLOW_REJECTED));
                                                    sb2.append("(");
                                                    sb2.append(i11);
                                                    sb2.append(")");
                                                }
                                            } else {
                                                sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.FOLLOW_REJECTED));
                                                sb2.append("(");
                                                sb2.append(i11);
                                                sb2.append(")");
                                            }
                                        } else {
                                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.QR_CODE_INVALID_TOKEN));
                                            sb2.append("(");
                                            sb2.append(i11);
                                            sb2.append(")");
                                        }
                                    } else {
                                        sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.SHARE_REJECTED));
                                        sb2.append("(");
                                        sb2.append(i11);
                                        sb2.append(")");
                                    }
                                } else {
                                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.LINK_ZM_NOT_FOUND_MSG));
                                    sb2.append("(");
                                    sb2.append(i11);
                                    sb2.append(")");
                                }
                            } else {
                                sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.ITEM_NOT_FOUND_MSG));
                                sb2.append("(");
                                sb2.append(i11);
                                sb2.append(")");
                            }
                        } else {
                            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.str_error_full_sdcard_more_descriptive));
                            sb2.append("(");
                            sb2.append(i11);
                            sb2.append(")");
                        }
                    } else {
                        sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                        sb2.append("(");
                        sb2.append(i11);
                        sb2.append(")");
                    }
                } else {
                    sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.ALBUM_PERMISSION_DENIED_MSG));
                    sb2.append("(");
                    sb2.append(i11);
                    sb2.append(")");
                }
            } else {
                sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.LOGIN_FAIL_MORE_TIMES_MSG));
                sb2.append("(");
                sb2.append(i11);
                sb2.append(")");
            }
        } else {
            sb2.append(MainApplication.getAppContext().getString(AbstractC8020f0.UNKNOWN_EXCEPTION_MSG));
            sb2.append("(");
            sb2.append(i11);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static void m119319d(Context context) {
        try {
            AbstractC20095b.f98830b = context.getString(AbstractC8020f0.SOCKET_TIME_OUT_MSG) + "(50003)";
            AbstractC20095b.f98832d = context.getString(AbstractC8020f0.UNKNOWN_MSG) + "(502)";
            AbstractC20095b.f98833e = context.getString(AbstractC8020f0.UNKNOWN_EXCEPTION_MSG) + "(112)";
            AbstractC20095b.f98834f = context.getString(AbstractC8020f0.WRONG_DATE_TIME_MSG) + "(515)";
            AbstractC20095b.f98829a = context.getString(AbstractC8020f0.NETWORK_ERROR_MSG) + "(50001)";
            AbstractC20095b.f98831c = context.getString(AbstractC8020f0.SOCKET_NOT_CONNECT_MSG) + "(50002)";
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: e */
    public static void m119320e(C20096c c20096c, boolean z11) {
        if (c20096c != null) {
            try {
                String m104492d = c20096c.m104492d();
                int m104491c = c20096c.m104491c();
                if (!TextUtils.isEmpty(m104492d)) {
                    ToastUtils.showMess(m104492d);
                } else {
                    ToastUtils.m89260h(m104491c, z11);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: f */
    public static void m119321f(C20096c c20096c, boolean z11) {
        try {
            int m104491c = c20096c.m104491c();
            int i11 = 100;
            try {
                if (!TextUtils.isEmpty(c20096c.m104490b())) {
                    JSONObject jSONObject = new JSONObject(c20096c.m104490b());
                    if (jSONObject.has("maxUsers")) {
                        i11 = jSONObject.optInt("maxUsers");
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            switch (m104491c) {
                case 17001:
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.ERROR_INVALID_INPUT_DATA, 17001));
                    return;
                case 17004:
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.ERROR_CANNOT_GENERATE_GROUP_ID, 17004));
                    return;
                case 17007:
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.ERROR_NOT_AUTHORIZED_ACTION, 17007));
                    return;
                case 17010:
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.ERROR_CANNOT_CREATE_GROUP, 17010));
                    return;
                case 17011:
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.ERROR_NOT_IN_INVITED_LIST, 17011));
                    return;
                case 17012:
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.ERROR_SAME_GROUP_INFO_UPDATE, 17012));
                    return;
                case 17016:
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.ERROR_ALL_MEMBERS_BLOCK_YOU, 17016));
                    return;
                case 17017:
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.ERROR_OVER_NUMBER_INVITED_LIST_PER_USER, Integer.valueOf(i11), 17017));
                    return;
                case 17018:
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.ERROR_OVER_NUMBER_OWNED_GROUP_PER_USER, Integer.valueOf(i11), 17018));
                    return;
                case 17023:
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.ERROR_CANNOT_ADD_BLOCK_MEMBER_GROUP));
                    return;
                case 17024:
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.ERROR_CANNOT_REMOVE_BLOCK_MEMBER_GROUP));
                    return;
                case 17025:
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.ERROR_CANNOT_UPDATE_GROUP_SETTING));
                    return;
                case 17027:
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.ERROR_CANNOT_REMOVE_ADMIN_GROUP));
                    return;
                case 17028:
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.ERROR_OVER_NUMBER_INVITED_LIST_PER_USER_V2, Integer.valueOf(i11), 17028));
                    return;
                case 17030:
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.ERROR_CANNOT_JOIN_GROUP));
                    return;
                case 17032:
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_request_join));
                    return;
                case 17034:
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_topic_is_deleted));
                    return;
                case 50001:
                    ToastUtils.showMess(AbstractC20095b.f98829a);
                    return;
                case 50003:
                    ToastUtils.showMess(AbstractC20095b.f98830b);
                    return;
                default:
                    m119320e(c20096c, z11);
                    return;
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }
}
