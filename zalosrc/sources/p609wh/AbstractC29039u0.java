package p609wh;

import com.adtima.Adtima;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import p135em.C18489c;

/* renamed from: wh.u0 */
/* loaded from: classes.dex */
public abstract class AbstractC29039u0 {

    /* renamed from: wh.u0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f134388a;

        static {
            int[] iArr = new int[b.values().length];
            f134388a = iArr;
            try {
                iArr[b.SERVICE_MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f134388a[b.TAPI_PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f134388a[b.TAPI_GET_SMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f134388a[b.TAPI_GET_SMS_LIST_PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f134388a[b.MAPI_URL_POST_CONTACT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f134388a[b.MAPI_URL_COMMON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f134388a[b.MAPI_PLUGINS_LIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f134388a[b.TAPI_REGISTER_IS_SET_PASSWORD_URL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f134388a[b.TAPI_REGISTER_VERIFY_CLIENT_INFO_URL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f134388a[b.TAPI_REGISTER_GET_CONSENTS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f134388a[b.TAPI_VERIFY_PHONE_NUMBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f134388a[b.TAPI_GET_OTP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f134388a[b.TAPI_VERIFY_OTP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f134388a[b.TAPI_VERIFY_DISPLAY_NAME.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f134388a[b.TAPI_VERIFY_DOB.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f134388a[b.TAPI_CREATE_ACCOUNT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f134388a[b.TAPI_GET_COMMON_SETTINGS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f134388a[b.TAPI_REGISTER_ACTIVE_PASSWORD_URL.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f134388a[b.TAPI_REGISTER_ACTIVE_PASSWORD_WITH_QUESTION_URL.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f134388a[b.TAPI_REGISTER_ACTIVE_PASSWORD_WITH_SECURITY_QUESTION_URL.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f134388a[b.TAPI_RESUME_ACCOUNT_SESSION.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f134388a[b.TAPI_REGISTER_VERIFY_ACCOUNT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f134388a[b.TAPI_REGISTER_DEACTIVATE_ACCOUNT_URL.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f134388a[b.TAPI_REGISTER_VALIDATE_ACCOUNT_URL.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f134388a[b.TAPI_REGISTER_LOGOUT_URL.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f134388a[b.TAPI_REGISTER_SUSPEND_ACCOUNT_SESSION.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f134388a[b.TAPI_REGISTER_SET_PASSWORD_URL.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f134388a[b.TAPI_REGISTER_REQUEST_REJECT_CALL_URL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f134388a[b.TAPI_REGISTER_ACTIVE_BY_REJECT_CALL_URL.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f134388a[b.TAPI_GET_ACTIVE_CODE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f134388a[b.TAPI_ACTIVE_CODE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f134388a[b.TAPI_GET_ZOTP.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f134388a[b.TAPI_ACTIVE_ACCOUNT_BY_ACTIVATION_CODE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f134388a[b.TAPI_FACEBOOK_ACTIVE_CODE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f134388a[b.TAPI_ZINGME_ACTIVE_CODE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f134388a[b.TAPI_ACTIVE_ACCOUNT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f134388a[b.TAPI_LOCK_ACCOUNT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f134388a[b.TAPI_DO_LOGIN.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f134388a[b.TAPI_UPDATE_PRIVACY.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f134388a[b.TAPI_GET_ALL_PRIVACY.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f134388a[b.TAPI_UPDATE_ACCOUNT.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f134388a[b.TAPI_UPDATE_ACCOUNT_POST.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f134388a[b.TAPI_UNLINK_FACEBOOK_ACCOUNT.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f134388a[b.TAPI_LINK_FACEBOOK_ACCOUNT.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f134388a[b.TAPI_UNLINK_GOOGLE_ACCOUNT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f134388a[b.TAPI_LINK_GOOGLE_ACCOUNT.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f134388a[b.TAPI_CLEAR_DECRYPT_KEY.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f134388a[b.TAPI_ADD_ZALO_FRIEND.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f134388a[b.TAPI_REMOVE_ZALO_FRIEND.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f134388a[b.TAPI_GET_LIST_ZALO_FRIEND.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f134388a[b.TAPI_REMOVE_ITEM_LIST_SUGGEST_FRIEND.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f134388a[b.TAPI_REMOVE_ALL_SUGGEST_FRIEND.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f134388a[b.GET_LOGIN_FRIEND.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f134388a[b.TAPI_BLOCK_FRIEND.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f134388a[b.TAPI_GET_LIST_BLOCK_FRIEND.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f134388a[b.TAPI_SEND_FRIEND_REQUEST.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f134388a[b.TAPI_ACCEPT_FRIEND_REQUEST.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f134388a[b.TAPI_REJECT_FRIEND_REQUEST.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f134388a[b.TAPI_GET_LIST_FRIEND_REQUEST.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f134388a[b.TAPI_GET_INFO_FRIEND_REQUEST.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f134388a[b.TAPI_GET_FRIEND_REQUEST_STATUS.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f134388a[b.TAPI_REJECT_ALL_FRIEND_REQUEST.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f134388a[b.SEARCH_PROFILE_URL.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f134388a[b.ZME_FEED_HOST_URI.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f134388a[b.ZME_FEED_URL.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f134388a[b.ZME_FEED_REMOVEFROM_BLACK_LIST.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f134388a[b.ZME_FEED_ADDTO_BLACK_LIST.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f134388a[b.ZME_FEED_GET_BLACK_LIST.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f134388a[b.ZME_FEED_REMOVEFROM_HIDDEN_LIST.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f134388a[b.ZME_FEED_ADDTO_HIDDEN_LIST.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f134388a[b.ZME_FEED_GET_HIDDEN_LIST.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f134388a[b.GOOGLE_TRANSLATION_TRANSLATE.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f134388a[b.GOOGLE_TRANSLATION_DETECT.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f134388a[b.ZME_VOTE_URL.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f134388a[b.ZME_PHOTO_VOTE_URL.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f134388a[b.ZALO_PHOTO_DELETE_URL.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f134388a[b.ZALO_REPORT_ABUSE_URL.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f134388a[b.ZALO_REPORT_V2_URL.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f134388a[b.ZALO_STICKER_DOWNLOAD_URL.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f134388a[b.ZALO_STICKER_DOWNLOAD_URL_NEW.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f134388a[b.ZALO_STICKER_VOICE_DOWNLOAD_URL.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f134388a[b.TAPI_GET_QUOTA_SMS.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f134388a[b.TAPI_BROADCAST_SMS_INVITE.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f134388a[b.TAPI_GET_SUPPORT_COUNTRY.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f134388a[b.TAPI_CALL_TO_ACTIVE.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f134388a[b.TAPI_GET_ACTIVATION_CODE.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f134388a[b.THIRD_PARTY_AUTHEN.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f134388a[b.SUBMIT_REG_ID_GCM.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f134388a[b.SUBMIT_REG_ID_FCM.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                f134388a[b.THIRD_PARTY_SERVER.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f134388a[b.THIRD_PARTY_OAUTH_V2.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f134388a[b.THIRD_PARTY_OAUTH_V4.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f134388a[b.FAIL_OVER_URL.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f134388a[b.FAIL_OVER_E2EE_URL.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f134388a[b.TAPI_SETTING.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f134388a[b.TAPI_GET_LIST_FOLLOW.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f134388a[b.EMPTY_RESOURCES_URL.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f134388a[b.MSG_BACKUP.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f134388a[b.MSG_BACKUP_WAITING.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f134388a[b.GROUP_API_INFO.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f134388a[b.GROUP_LIST.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f134388a[b.SUGGEST_STICKER_KEYWORDS_V3.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f134388a[b.UPLOAD_QOS.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f134388a[b.UPLOAD_ACTION_LOG.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f134388a[b.UPLOAD_FILE_LOG.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f134388a[b.UPLOAD_LOG_GET_URL.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f134388a[b.UPLOAD_ZINSTANT_LOG.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f134388a[b.GET_DEFAULT_COUNTRY.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f134388a[b.CHECK_VALID_DPN_REGISTER.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f134388a[b.GET_PROFILES_NONE_FRIEND_IN_PHONEBOOK.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f134388a[b.GET_CHANGE_PHONE_NUMBER_STATUS_FUNCTION.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f134388a[b.UPLOAD_ZALO_TRACKING_LOG.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f134388a[b.BROADCAST_MSG_GET.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f134388a[b.ALIAS_API_GET.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f134388a[b.CONTACT_PHONEBOOK_API_GET.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f134388a[b.CONTACT_PHONEBOOK_API_SUBMIT.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f134388a[b.TAPI_GET_MOBILE_NETWORK_CODE.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f134388a[b.CALENDAR_SYNC.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f134388a[b.CALENDAR_GET.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f134388a[b.CONTACT_DISCOVER_API.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                f134388a[b.PARSE_VOICE_TRANSCRIPT_URL.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                f134388a[b.ACK_UPDATED_GLOBAL_MSGID_API.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                f134388a[b.GET_ALL_HIDDEN_CHAT.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                f134388a[b.TAPI_GET_KEY_SET.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                f134388a[b.TAPI_GET_LIST_SERVERS.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                f134388a[b.BIO_API.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                f134388a[b.FETCH_PREVIEW_MSG_OFFLINE_GROUP_API.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                f134388a[b.FETCH_OLD_MSG_MY_CLOUD_API.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                f134388a[b.PRODUCT_CATALOG_DOMAIN.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                f134388a[b.CHECK_SERVER_MAINTENANCE.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                f134388a[b.SUBMIT_ACTION_MEDIA.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                f134388a[b.SHORT_VIDEO_PLATFORM.ordinal()] = 132;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                f134388a[b.ZALO_CLOUD.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                f134388a[b.ZALO_CLOUD_MEDIA.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                f134388a[b.ZALO_CLOUD_KEY.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                f134388a[b.ZALO_CLOUD_QOS.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                f134388a[b.ADS_PLATFORM_GET_ADS_TAB_MESSAGE.ordinal()] = 137;
            } catch (NoSuchFieldError unused137) {
            }
        }
    }

    /* renamed from: wh.u0$b */
    /* loaded from: classes.dex */
    public enum b {
        SERVICE_MAP,
        DRAW_URL,
        TAPI_PHOTO,
        TAPI_GET_SMS,
        TAPI_GET_SMS_LIST_PHONE,
        MAPI_URL_CONTACT,
        MAPI_URL_POST_CONTACT,
        MAPI_URL_USER,
        MAPI_URL_COMMON,
        MAPI_PLUGINS_LIST,
        TAPI_REGISTER_IS_SET_PASSWORD_URL,
        TAPI_REGISTER_VERIFY_CLIENT_INFO_URL,
        TAPI_REGISTER_GET_CONSENTS,
        TAPI_VERIFY_PHONE_NUMBER,
        TAPI_GET_OTP,
        TAPI_VERIFY_OTP,
        TAPI_VERIFY_DISPLAY_NAME,
        TAPI_VERIFY_DOB,
        TAPI_CREATE_ACCOUNT,
        TAPI_GET_COMMON_SETTINGS,
        TAPI_REGISTER_ACTIVE_PASSWORD_URL,
        TAPI_REGISTER_ACTIVE_PASSWORD_WITH_QUESTION_URL,
        TAPI_REGISTER_ACTIVE_PASSWORD_WITH_SECURITY_QUESTION_URL,
        TAPI_REGISTER_VERIFY_ACCOUNT,
        TAPI_RESUME_ACCOUNT_SESSION,
        TAPI_REGISTER_DEACTIVATE_ACCOUNT_URL,
        TAPI_REGISTER_SET_PASSWORD_URL,
        TAPI_REGISTER_REQUEST_REJECT_CALL_URL,
        TAPI_REGISTER_ACTIVE_BY_REJECT_CALL_URL,
        TAPI_GET_ACTIVE_CODE,
        TAPI_ACTIVE_CODE,
        TAPI_GET_ZOTP,
        TAPI_ACTIVE_ACCOUNT_BY_ACTIVATION_CODE,
        TAPI_FACEBOOK_ACTIVE_CODE,
        TAPI_ZINGME_ACTIVE_CODE,
        TAPI_ACTIVE_ACCOUNT,
        TAPI_DO_LOGIN,
        TAPI_LOCK_ACCOUNT,
        TAPI_UPDATE_PRIVACY,
        TAPI_GET_ALL_PRIVACY,
        TAPI_UPDATE_ACCOUNT,
        TAPI_UPDATE_ACCOUNT_POST,
        TAPI_UNLINK_FACEBOOK_ACCOUNT,
        TAPI_LINK_FACEBOOK_ACCOUNT,
        TAPI_UNLINK_GOOGLE_ACCOUNT,
        TAPI_LINK_GOOGLE_ACCOUNT,
        TAPI_GETLIST_PROMOTION_URL,
        TAPI_CLEAR_DECRYPT_KEY,
        TAPI_ADD_ZALO_FRIEND,
        TAPI_REMOVE_ZALO_FRIEND,
        TAPI_GET_LIST_ZALO_FRIEND,
        TAPI_REMOVE_ITEM_LIST_SUGGEST_FRIEND,
        TAPI_REMOVE_ALL_SUGGEST_FRIEND,
        TAPI_BLOCK_FRIEND,
        TAPI_ADD_BLOCK_FRIEND,
        TAPI_REMOVE_BLOCK_FRIEND,
        TAPI_GET_LIST_BLOCK_FRIEND,
        TAPI_GET_MOBILE_NETWORK_CODE,
        TAPI_SEND_FRIEND_REQUEST,
        TAPI_ACCEPT_FRIEND_REQUEST,
        TAPI_REJECT_FRIEND_REQUEST,
        TAPI_GET_LIST_FRIEND_REQUEST,
        TAPI_GET_INFO_FRIEND_REQUEST,
        TAPI_GET_FRIEND_REQUEST_STATUS,
        TAPI_REJECT_ALL_FRIEND_REQUEST,
        SEARCH_PROFILE_URL,
        ZME_FEED_HOST_URI,
        ZME_FEED_URL,
        ZME_FEED_REMOVEFROM_BLACK_LIST,
        ZME_FEED_ADDTO_BLACK_LIST,
        ZME_FEED_GET_BLACK_LIST,
        ZME_FEED_REMOVEFROM_HIDDEN_LIST,
        ZME_FEED_ADDTO_HIDDEN_LIST,
        ZME_FEED_GET_HIDDEN_LIST,
        ZME_VOTE_URL,
        ZME_PHOTO_VOTE_URL,
        ZALO_PHOTO_DELETE_URL,
        ZALO_REPORT_ABUSE_URL,
        ZALO_STICKER_DOWNLOAD_URL,
        ZALO_STICKER_DOWNLOAD_URL_NEW,
        ZALO_STICKER_VOICE_DOWNLOAD_URL,
        FACEBOOK_FRIEND,
        TAPI_GET_QUOTA_SMS,
        TAPI_BROADCAST_SMS_INVITE,
        TAPI_GET_SUPPORT_COUNTRY,
        TAPI_CALL_TO_ACTIVE,
        TAPI_GET_ACTIVATION_CODE,
        THIRD_PARTY_AUTHEN,
        SUBMIT_REG_ID_GCM,
        SUBMIT_REG_ID_FCM,
        THIRD_PARTY_SERVER,
        THIRD_PARTY_OAUTH_V2,
        THIRD_PARTY_OAUTH_V4,
        FAIL_OVER_URL,
        FAIL_OVER_E2EE_URL,
        AVARTAR_BG,
        TAPI_SETTING,
        TAPI_GET_LIST_FOLLOW,
        EMPTY_RESOURCES_URL,
        SUGGEST_STICKER_KEYWORDS,
        GET_LOGIN_FRIEND,
        MSG_BACKUP,
        MSG_BACKUP_WAITING,
        GROUP_API_INFO,
        GROUP_LIST,
        SUGGEST_STICKER_KEYWORDS_V3,
        UPLOAD_QOS,
        UPLOAD_ACTION_LOG,
        UPLOAD_FILE_LOG,
        UPLOAD_LOG_GET_URL,
        UPLOAD_ZINSTANT_LOG,
        GET_DEFAULT_COUNTRY,
        CHECK_VALID_DPN_REGISTER,
        GET_PROFILES_NONE_FRIEND_IN_PHONEBOOK,
        GET_CHANGE_PHONE_NUMBER_STATUS_FUNCTION,
        UPLOAD_ZALO_TRACKING_LOG,
        BROADCAST_MSG_GET,
        ALIAS_API_GET,
        GOOGLE_TRANSLATION_TRANSLATE,
        GOOGLE_TRANSLATION_DETECT,
        CALENDAR_SYNC,
        CALENDAR_GET,
        CONTACT_PHONEBOOK_API_GET,
        CONTACT_PHONEBOOK_API_SUBMIT,
        TAPI_REGISTER_VALIDATE_ACCOUNT_URL,
        TAPI_REGISTER_LOGOUT_URL,
        TAPI_REGISTER_SUSPEND_ACCOUNT_SESSION,
        CONTACT_DISCOVER_API,
        PARSE_VOICE_TRANSCRIPT_URL,
        ACK_UPDATED_GLOBAL_MSGID_API,
        GET_ALL_HIDDEN_CHAT,
        TAPI_GET_KEY_SET,
        TAPI_GET_LIST_SERVERS,
        BIO_API,
        FETCH_PREVIEW_MSG_OFFLINE_GROUP_API,
        FETCH_OLD_MSG_MY_CLOUD_API,
        PRODUCT_CATALOG_DOMAIN,
        CHECK_SERVER_MAINTENANCE,
        SUBMIT_ACTION_MEDIA,
        ZALO_REPORT_V2_URL,
        SHORT_VIDEO_PLATFORM,
        ZALO_CLOUD,
        ZALO_CLOUD_MEDIA,
        ZALO_CLOUD_KEY,
        ZALO_CLOUD_QOS,
        ADS_PLATFORM_GET_ADS_TAB_MESSAGE
    }

    /* renamed from: a */
    public static String m145033a(b bVar) {
        switch (a.f134388a[bVar.ordinal()]) {
            case 1:
                return C18489c.m97849k(C7962g.c.a.SERVICE_MAP);
            case 2:
                return C18489c.m97849k(C7962g.c.a.PHOTO_TALK) + "/api/photo?";
            case 3:
                return C18489c.m97849k(C7962g.c.a.API_TALK) + "/api/talk?";
            case 4:
                return C18489c.m97849k(C7962g.c.a.API_TALK) + "/api/sms/getListInvitationMsg?";
            case 5:
                return C18489c.m97849k(C7962g.c.a.TAPI_M_S) + "/api/contact";
            case 6:
                return C18489c.m97849k(C7962g.c.a.API_TALK_S) + "/api/common";
            case 7:
                return C18489c.m97849k(C7962g.c.a.API_TALK) + "/api/talk?";
            case 8:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/login/isSetPassword?";
            case 9:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register/verifyClientInfo?";
            case 10:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/v1/register/consents?";
            case 11:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/v1/login/phone/verify?";
            case 12:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/v1/login/otp?";
            case 13:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/v1/login/otp/verify?";
            case 14:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/v1/register/verify/name?";
            case 15:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/v1/register/verify/dob?";
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/v1/register/accounts?";
            case 17:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/v1/settings/common";
            case 18:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register/activePassword?";
            case 19:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register/activePasswordWithQuestion?";
            case 20:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register/activeAccountByPassword?";
            case 21:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/login/resumeAccountSession?";
            case 22:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register/verifyAccount?";
            case 23:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/update/deactivateAccount?";
            case 24:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/update/validateAccount?";
            case 25:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/login/doLogout?";
            case 26:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/login/suspendAccountSession?";
            case 27:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/login/setPassword?";
            case 28:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register/reqRejectCall?";
            case 29:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register/activeByRejectCall?";
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register.getActiveCode?";
            case 31:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register.activeCode?";
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/v1/login/zotp?";
            case 33:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register/activeAccountByActivationCode?";
            case 34:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register.activeCode?";
            case 35:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register.activeCode?";
            case 36:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register.activeAccount?";
            case 37:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register/lockAccount?";
            case 38:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/login.doLogin?";
            case 39:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/privacy/updatePrivacy?";
            case 40:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/privacy/getAllPrivacy?";
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/update.UpdateAccount?";
            case 42:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/update.UpdateAccount";
            case 43:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/update/unlinkFacebook?";
            case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/update/linkFacebook?";
            case 45:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/update/unlinkGoogle?";
            case 46:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/update/linkGoogle?";
            case 47:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/update/clearDecryptKey?";
            case 48:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK_S) + "/api/friend/add?";
            case 49:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK_S) + "/api/friend/remove?";
            case 50:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK_S) + "/api/friend/getlist?";
            case 51:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK_S) + "/api/friend/removesuggest?";
            case 52:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK_S) + "/api/friend/removeallsuggest?";
            case 53:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK_S) + "/api/friend/loginfriend?";
            case 54:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK) + "/api/friend/";
            case 55:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m145033a(b.TAPI_BLOCK_FRIEND));
                sb2.append("getblocklist?");
                return sb2.toString();
            case 56:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK_S) + "/api/friend/request?";
            case 57:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK_S) + "/api/friend/accept?";
            case 58:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK_S) + "/api/friend/reject?";
            case 59:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK_S) + "/api/friend/getlistrequest?";
            case 60:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK_S) + "/api/friend/getrequestitem?";
            case 61:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK_S) + "/api/friend/requeststatus?";
            case 62:
                return C18489c.m97849k(C7962g.c.a.FRIEND_TALK_S) + "/api/friend/rejectall?";
            case 63:
                return C18489c.m97849k(C7962g.c.a.TAPI_M_S) + "/api/contact/searchProfile?";
            case 64:
                return C18489c.m97849k(C7962g.c.a.API_TALK) + "/api/feed/";
            case 65:
                return C18489c.m97849k(C7962g.c.a.API_TALK) + "/api/feed?";
            case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                return m145033a(b.ZME_FEED_HOST_URI) + "blacklist/delete?";
            case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                return m145033a(b.ZME_FEED_HOST_URI) + "blacklist/add?";
            case 68:
                return m145033a(b.ZME_FEED_HOST_URI) + "blacklist/getList?";
            case 69:
                return m145033a(b.ZME_FEED_HOST_URI) + "hide/delete?";
            case 70:
                return m145033a(b.ZME_FEED_HOST_URI) + "hide/add?";
            case 71:
                return m145033a(b.ZME_FEED_HOST_URI) + "hide/getList?";
            case 72:
                return C18489c.m97849k(C7962g.c.a.GOOGLE_TRANSLATION) + "/language/translate/v2?";
            case 73:
                return C18489c.m97849k(C7962g.c.a.GOOGLE_TRANSLATION) + "/language/translate/v2/detect?";
            case 74:
                return C18489c.m97849k(C7962g.c.a.API_TALK) + "/api/vote?";
            case 75:
                return C18489c.m97849k(C7962g.c.a.PHOTO_TALK) + "/api/vote?";
            case 76:
                return C18489c.m97849k(C7962g.c.a.PHOTO_TALK) + "/api/photo/delete?";
            case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                return C18489c.m97849k(C7962g.c.a.ZALO_M) + "/api/community/abuse/report?";
            case 78:
                return C18489c.m97849k(C7962g.c.a.ZALO_M) + "/api/community/abuse/reportv2";
            case 79:
                return C18489c.m97849k(C7962g.c.a.STICKERS_DOWNLOAD) + "/api/emoticon/getZip?";
            case 80:
                return C18489c.m97849k(C7962g.c.a.STICKERS_DOWNLOAD) + "/api/emoticon/sticker?";
            case 81:
                return C18489c.m97849k(C7962g.c.a.STICKERS_DOWNLOAD) + "/api/emoticon/voice?";
            case 82:
                return C18489c.m97849k(C7962g.c.a.API_TALK) + "/api/sms/getQuota?";
            case 83:
                return C18489c.m97849k(C7962g.c.a.API_TALK) + "/api/sms/sendInvite?";
            case 84:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register/getSupportCountry?";
            case 85:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register/callToActive?";
            case 86:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register/getActivationCode?";
            case 87:
                return C18489c.m97849k(C7962g.c.a.AUTH_ZALOAPP_S) + "/3rd/authen?";
            case 88:
                return C18489c.m97849k(C7962g.c.a.TALK_M) + "/api/zpn?";
            case 89:
                return C18489c.m97849k(C7962g.c.a.TALK_M) + "/api/fcm?";
            case 90:
                return C18489c.m97849k(C7962g.c.a.OAUTH_ZALOAPP_S) + "/mobile/v2/";
            case 91:
                return C18489c.m97849k(C7962g.c.a.OAUTH_ZALOAPP_S) + "/v2/zalo/";
            case 92:
                return C18489c.m97849k(C7962g.c.a.OAUTH_ZALOAPP_S) + "/v4/zalo/auth?";
            case 93:
                return C18489c.m97849k(C7962g.c.a.FAILOVER_ZALOAPP_S) + "/api/message?";
            case 94:
                return C18489c.m97849k(C7962g.c.a.FAILOVER_ZALOAPP_S) + "/api/e2e?";
            case 95:
                return C18489c.m97849k(C7962g.c.a.SYSTEM_SETTING_S) + "/api/setting/";
            case 96:
                return C18489c.m97849k(C7962g.c.a.GET_FOLLOW_S) + "/api/page/getListFollow?";
            case 97:
                return C18489c.m97849k(C7962g.c.a.EMPTY_RES) + "/api/resource/getLink?";
            case 98:
                return C18489c.m97849k(C7962g.c.a.BKMSG_TALK) + "/api/msgbackup";
            case 99:
                return C18489c.m97849k(C7962g.c.a.BKMSG_TALK) + "/api/waiting";
            case 100:
                return C18489c.m97849k(C7962g.c.a.GROUP_API) + "/group/info";
            case 101:
                return C18489c.m97849k(C7962g.c.a.GROUP_API) + "/group/list";
            case 102:
                return C18489c.m97849k(C7962g.c.a.SUGGEST_STICKER) + "/suggestion/v3/getListKeyword?";
            case 103:
                return C18489c.m97849k(C7962g.c.a.QOS_TALK_S) + "/api/qos/uploadv2";
            case 104:
                return C18489c.m97849k(C7962g.c.a.QOS_TALK_S) + "/api/qos/uploadactionlog";
            case 105:
                return C18489c.m97849k(C7962g.c.a.QOS_TALK_S) + "/api/qos/uploaddetaillog";
            case 106:
                return C18489c.m97849k(C7962g.c.a.QOS_TALK_S) + "/uploadservicepublic";
            case 107:
                return C18489c.m97849k(C7962g.c.a.QOS_TALK_S) + "/api/qos/zinstant";
            case 108:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/helper/getDefaultCountry";
            case 109:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/update/verifyName?";
            case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10 /* 110 */:
                return C18489c.m97849k(C7962g.c.a.GET_PAGE_API) + "/api/page/getListNoneFriend?";
            case 111:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/register/allowChangePhoneNumber?";
            case 112:
                return C18489c.m97849k(C7962g.c.a.ZALO_LOG) + "/tracking";
            case 113:
                return C18489c.m97849k(C7962g.c.a.BROADCAST_MSG_S) + "/get";
            case 114:
                return C18489c.m97849k(C7962g.c.a.ALIAS_API) + "/api/list";
            case 115:
                return C18489c.m97849k(C7962g.c.a.TAPI_M_S) + "/api/contact/getCurrentPhonebook";
            case 116:
                return C18489c.m97849k(C7962g.c.a.TAPI_M_S) + "/api/contact/submitContact";
            case 117:
                return C18489c.m97849k(C7962g.c.a.ALIAS_API) + "/api/getMobileNetworkCodes";
            case 118:
                return C18489c.m97849k(C7962g.c.a.CALENDAR_API_S) + "/syncevents";
            case 119:
                return C18489c.m97849k(C7962g.c.a.CALENDAR_API_S) + "/getcalendar";
            case 120:
                return C18489c.m97849k(C7962g.c.a.TAPI_M_S) + "/api/contact/discoverContact";
            case 121:
                return C18489c.m97849k(C7962g.c.a.PARSE_VOICE_TRANSCRIPT_S) + "/api/v1/recognize/url";
            case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422 /* 122 */:
                return C18489c.m97849k(C7962g.c.a.ACK_MSGID_S) + "/api/glbid/delivered";
            case 123:
                return C18489c.m97849k(C7962g.c.a.SYSTEM_SETTING_S) + "/api/setting/hidden/getAll";
            case 124:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/helper/getKeySet";
            case 125:
                return C18489c.m97849k(C7962g.c.a.REGISTER_TALK_M_S) + "/api/helper/getListServers";
            case 126:
                return C18489c.m97849k(C7962g.c.a.BIO_API_S) + "/ftf?";
            case 127:
                return C18489c.m97849k(C7962g.c.a.FETCH_PREVIEW_MSG_OFFLINE_GROUP_API) + "/api/preload";
            case 128:
                return C18489c.m97849k(C7962g.c.a.FETCH_OLD_MSG_MY_CLOUD_API) + "/api/cm/femc";
            case 129:
                return C18489c.m97849k(C7962g.c.a.PRODUCT_CATALOG_DOMAIN);
            case 130:
                return C18489c.m97849k(C7962g.c.a.CHECK_SERVER_MAINTENANCE) + "/api/chk";
            case 131:
                return C18489c.m97849k(C7962g.c.a.MEDIA_API) + "/syncationmedia/v1/api/submitaction";
            case 132:
                return C18489c.m97849k(C7962g.c.a.SHORT_VIDEO_PLATFORM) + "/token";
            case 133:
                return C18489c.m97849k(C7962g.c.a.ZALO_CLOUD) + "/zalocloud";
            case 134:
                return C18489c.m97849k(C7962g.c.a.ZALO_CLOUD) + "/cloudmedia";
            case 135:
                return C18489c.m97849k(C7962g.c.a.ZALO_CLOUD) + "/personalcloud_key";
            case 136:
                return C18489c.m97849k(C7962g.c.a.ZALO_CLOUD) + "/zalocloudqos";
            case 137:
                return C18489c.m97849k(C7962g.c.a.ADS_PLATFORM) + "/zpads/inboxnative/getads";
            default:
                return "";
        }
    }
}
