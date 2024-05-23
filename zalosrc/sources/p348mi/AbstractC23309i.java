package p348mi;

import ag0.AbstractC0837p0;
import am.AbstractC0908e0;
import am.AbstractC0924m0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.text.TextUtils;
import au.EnumC2381y;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.gifplayer.C8917b;
import com.zing.zalo.location.EnumC8996x;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.p062db.PreferencesProvider;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.C17171o0;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import kn.AbstractC21777d;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p135em.C18489c;
import p248iy.AbstractC20887g;
import p594w1.C28685a;
import s00.AbstractC26080o;
import s00.AbstractC26084s;
import su.C26388b;
import t00.C26446c;
import th.AbstractC26683d;
import th.AbstractC26684e;
import vg.AbstractC28102j5;
import vg.C28119l3;

/* renamed from: mi.i */
/* loaded from: classes.dex */
public abstract class AbstractC23309i {

    /* renamed from: a */
    static Boolean f113482a = null;

    /* renamed from: b */
    static int f113483b = -999;

    /* renamed from: c */
    static int f113484c = -2;

    /* renamed from: d */
    private static int f113485d = -1;

    /* renamed from: e */
    private static int f113486e = -1;

    /* renamed from: A */
    public static int m120736A() {
        return m121937ga("APPLICATION_RESTART_CHAIN", 0, true);
    }

    /* renamed from: A0 */
    public static int m120737A0() {
        return m121937ga("CONFIG_MAX_USER_GROUP", 200, true);
    }

    /* renamed from: A1 */
    public static String m120738A1() {
        return AbstractC0908e0.m2815i("DOMAINS_SKIP_JUMP", "", true);
    }

    /* renamed from: A2 */
    public static boolean m120739A2() {
        return m121899fa("ENABLE_GEN_GREETING_MSG", false, false);
    }

    /* renamed from: A3 */
    public static int m120740A3() {
        return m121937ga(m122076k("ENABLE_SUGGEST_VIEW_FIND_FRIEND_TAB_PHONEBOOK_%S", "%S"), 0, true);
    }

    /* renamed from: A4 */
    public static String m120741A4() {
        return m122013ia("HASH_OF_PHONE_CONTACT_DATABASE", "", true);
    }

    /* renamed from: A5 */
    public static String m120742A5() {
        return m122013ia("SavePhoneNumber", "", true);
    }

    /* renamed from: A6 */
    public static long m120743A6() {
        return AbstractC0908e0.m2814h("LAST_TIME_REMOVE_METADATA_CACHE", 0L, true, true);
    }

    /* renamed from: A7 */
    public static long m120744A7() {
        return m121975ha("timestampUpdateVersionApp", 0L, true);
    }

    /* renamed from: A8 */
    public static int m120745A8() {
        return m121937ga("MAX_ITEM_SUGGEST_OA_MEDIABOX", 3, true);
    }

    /* renamed from: A9 */
    public static int m120746A9() {
        return m121937ga("NUMBER_BUBBLE_CALL_NATIVE" + CoreUtility.f89233i, 0, true);
    }

    /* renamed from: Aa */
    public static int m120747Aa() {
        return m121937ga(m122038j("PRIVACY_SETTINGS_SETTING_VIEW_EMAIL_%s"), 1, true);
    }

    /* renamed from: Ab */
    public static int m120748Ab() {
        int m121937ga = m121937ga("SETTING_GAME_CENTER", 0, true);
        if (m121937ga == 0) {
            return 1;
        }
        return m121937ga;
    }

    /* renamed from: Ac */
    public static String m120749Ac() {
        return AbstractC0908e0.m2816j("suggest_sticker_keywords_v2", "", false, true);
    }

    /* renamed from: Ad */
    public static long m120750Ad() {
        return m121937ga("TURNON_GROUP_NOTI_" + CoreUtility.f89233i, 0, false);
    }

    /* renamed from: Ae */
    public static boolean m120751Ae() {
        return m121899fa("AUTO_MESSAGE_PARSE_BACKGROUND", true, true);
    }

    /* renamed from: Af */
    public static boolean m120752Af() {
        return m121899fa("ENABLE_REFRESH_SUGGEST_CHAT_IN_BG", false, true);
    }

    /* renamed from: Ag */
    public static boolean m120753Ag() {
        return m121899fa("NOTIFICATION_MANAGER_MANUAL_PLAY_SOUND_VIBRATION", false, true);
    }

    /* renamed from: Ah */
    public static void m120754Ah(boolean z11) {
        m121692Zu("ALREADY_CONTACT_PHONEBOOK" + m121738b1(), z11, true);
    }

    /* renamed from: Ai */
    public static void m120755Ai(int i11) {
        f113483b = i11;
        m121731av("COMPARE_CSCP_STATE_" + m121738b1(), i11, true);
    }

    /* renamed from: Aj */
    public static void m120756Aj(long j11) {
        m121769bv("DESTROY_COCOS_ERROR", j11, true);
    }

    /* renamed from: Ak */
    public static void m120757Ak(boolean z11) {
        m121692Zu("sticker_lua_enable_checksum", z11, true);
    }

    /* renamed from: Al */
    public static void m120758Al(boolean z11) {
        m121692Zu("ENABLE_KICK_OUT_ON_IMEI_CHANGED", z11, true);
    }

    /* renamed from: Am */
    public static void m120759Am(boolean z11) {
        m121692Zu("IS_ENABLE_REUSE_CHAT_VIDEO", z11, true);
    }

    /* renamed from: An */
    public static void m120760An(boolean z11) {
        m121692Zu("ENABLE_TRENDING_STICKER", z11, true);
    }

    /* renamed from: Ao */
    public static void m120761Ao(String str) {
        m121806cv("STR_GENERAL_INFO_DISCOVER_SEARCH_1", str, true);
    }

    /* renamed from: Ap */
    public static void m120762Ap(String str, String str2) {
        m121806cv("ISO_COUNTRY_CODE_" + str, str2, true);
    }

    /* renamed from: Aq */
    public static void m120763Aq(long j11) {
        m121769bv("LAST_TIME_GET_EFFECT_BG_FEED", j11, true);
    }

    /* renamed from: Ar */
    public static void m120764Ar(long j11) {
        m121769bv("timestampCheckRegisteGCM", j11, true);
    }

    /* renamed from: As */
    public static void m120765As(String str) {
        m121806cv("LIST_PHONE_BOOK_DELETE", str, false);
    }

    /* renamed from: At */
    public static void m120766At(String str) {
        m121806cv(m122038j("MEMORY_ENTRY_TIMELINE_CONFIG_%s"), str, true);
    }

    /* renamed from: Au */
    public static void m120767Au(int i11) {
        m121731av("pageMsgExpiredT", i11, true);
    }

    /* renamed from: Av */
    public static void m120768Av(String str, String str2) {
        m121806cv("QRCODE_USERID", CoreUtility.f89233i, false);
        m121806cv("QRCODE_QRLINK", str, false);
        m121806cv("QRCODE_AVATAR", str2, false);
    }

    /* renamed from: Aw */
    public static void m120769Aw(boolean z11) {
        m121692Zu("SERVER_CONFIG_ENABLE_SYNC_MESSAGE_" + CoreUtility.f89233i, z11, true);
    }

    /* renamed from: Ax */
    public static void m120770Ax(boolean z11) {
        AbstractC0908e0.m2818l(m122038j("NEW_FEATURE_UNDO_MSG_%s"), z11, true);
    }

    /* renamed from: Ay */
    public static void m120771Ay(long j11, int i11) {
        m121769bv(m122001i("TIME_INTERVAL_CHECK_SUBMIT_ZALO_TRACKING_%d", i11), j11, true);
    }

    /* renamed from: Az */
    public static void m120772Az(boolean z11) {
        m121692Zu("useSuggestStickerV2" + m121738b1(), z11, true);
        AbstractC26084s.m134257e(2, "setting_19", true);
    }

    /* renamed from: B */
    public static long m120773B() {
        return m121975ha("APPLICATION_START_LAST_TIME", 0L, true);
    }

    /* renamed from: B0 */
    public static long m120774B0() {
        return m121975ha("CONFIG_MIN_TIME_RETURN_FROM_AUTO_OPEN", 3000L, true);
    }

    /* renamed from: B1 */
    public static int m120775B1() {
        return m121937ga("DURATION_GEN_BUBBLE_CALL_NATIVE" + CoreUtility.f89233i, 300, true);
    }

    /* renamed from: B2 */
    public static boolean m120776B2() {
        return AbstractC0908e0.m2808b("ENABLE_GROUP_CALL_ENTRY_POINT_CHAT_TAB_HEADER_MORE", false, true);
    }

    /* renamed from: B3 */
    public static int m120777B3() {
        return m121937ga("FLAG_ENABLE_SETTING_SUGGEST_ME_DATAMINING", 1, true);
    }

    /* renamed from: B4 */
    public static String m120778B4() {
        return m122013ia("HINT_SET_PASSWORD", "", true);
    }

    /* renamed from: B5 */
    public static String m120779B5() {
        return m122013ia("LAST_PHOTO_SUGGEST_PATH", "", true);
    }

    /* renamed from: B6 */
    public static long m120780B6() {
        return m121975ha("LAST_TIME_REQUEST_DISTRIBUTED_LIBRARY", 0L, true);
    }

    /* renamed from: B7 */
    public static long m120781B7() {
        return m121975ha("timestampUpdateZaloFriend" + m121738b1(), 0L, true);
    }

    /* renamed from: B8 */
    public static int m120782B8() {
        return m121937ga(m122038j("MAX_LENGTH_ALIAS_%s"), 40, true);
    }

    /* renamed from: B9 */
    public static int m120783B9() {
        return m121937ga("NUMBER_BUBBLE_CALL_SUCCESS_INCOMING_NATIVE" + CoreUtility.f89233i, 0, true);
    }

    /* renamed from: Ba */
    public static int m120784Ba() {
        return m121937ga(m122038j("PRIVACY_SETTINGS_SETTING_VIEW_PHOTO_%s"), 1, true);
    }

    /* renamed from: Bb */
    public static int m120785Bb() {
        return m121937ga(m122038j("SRC_SETTING_PERMISSION_CONTACT_INAPP_%s"), -1, true);
    }

    /* renamed from: Bc */
    public static long m120786Bc() {
        return m121975ha("suggest_sticker_ts", 0L, true);
    }

    /* renamed from: Bd */
    public static int m120787Bd() {
        return AbstractC0908e0.m2811e("TYPE_DATA_DYNAMIC_SHORTCUT_APP", 1, true, true);
    }

    /* renamed from: Be */
    public static boolean m120788Be() {
        return m121899fa(m122038j("AUTO_PLAY_MY_PROFILE_MUSIC_%s"), true, true);
    }

    /* renamed from: Bf */
    public static boolean m120789Bf() {
        return m121899fa(m122038j("RESET_UNREAD_NUMBER_OFFLINE_%s"), true, true);
    }

    /* renamed from: Bg */
    public static boolean m120790Bg() {
        return m121899fa("NOTIFICATION_MANAGER_MANUAL_PLAY_SOUND_VIBRATION_LOCAL", false, true);
    }

    /* renamed from: Bh */
    public static void m120791Bh(boolean z11) {
        m121692Zu("ALREADY_MAPPING_PHONE_CONTACT_ZALO_UID", z11, false);
    }

    /* renamed from: Bi */
    public static void m120792Bi(int i11) {
        m121731av("CONDITION_UPDATE_CATE_MSG", i11, true);
    }

    /* renamed from: Bj */
    public static void m120793Bj(String str) {
        m121806cv("DETECT_COUNTRY_DATA", str, true);
    }

    /* renamed from: Bk */
    public static void m120794Bk(int i11) {
        m121731av(m122038j("FLAG_CLEAR_NEW_SUGGEST_BADGET_%s"), i11, true);
    }

    /* renamed from: Bl */
    public static void m120795Bl(int i11) {
        m121731av(m122038j("ENABLE_LABEL_STRANGER_NAME_CALL%s"), i11, true);
    }

    /* renamed from: Bm */
    public static void m120796Bm(boolean z11) {
        m121692Zu("ENABLE_SAVE_GROUP_PHOTO_IN_AQUERY", z11, true);
    }

    /* renamed from: Bn */
    public static void m120797Bn(int i11) {
        m121731av("CONFIG_ENABLE_TTL_MESSAGE", i11, true);
    }

    /* renamed from: Bo */
    public static void m120798Bo(String str) {
        m121806cv("STR_GENERAL_INFO_OA_NEARBY", str, true);
    }

    /* renamed from: Bp */
    public static void m120799Bp(String str) {
        m121806cv("JSON_APP_THEME_OPERATION_" + m121738b1(), str, true);
    }

    /* renamed from: Bq */
    public static void m120800Bq(long j11) {
        m121769bv("LAST_TIME_GET_EFFECT_TYPO_FEED", j11, true);
    }

    /* renamed from: Br */
    public static void m120801Br(long j11) {
        m121769bv("TIMESTAMP_CLEAN_AQUERY", j11, true);
    }

    /* renamed from: Bs */
    public static void m120802Bs(String str) {
        m121806cv("LIST_PREFIX_PHONE_NUMBER", str, true);
        AbstractC23304d.m120548s();
    }

    /* renamed from: Bt */
    public static void m120803Bt(String str) {
        AbstractC0908e0.m2826t(m122038j("MEMORY_PROFILE_NOTIFICATION_ITEM_%s"), str, true, true);
    }

    /* renamed from: Bu */
    public static void m120804Bu(int i11) {
        m121731av("PARSE_LINK_MAX_LIMIT", i11, true);
    }

    /* renamed from: Bv */
    public static void m120805Bv(long j11) {
        m121769bv("QUICK_ACCESS_FILTER_BUTTON_CATEID", j11, true);
    }

    /* renamed from: Bw */
    public static void m120806Bw(int i11) {
        m121731av("SERVER_CONFIG_INSTANT_UPLOAD_MODE", i11, true);
    }

    /* renamed from: Bx */
    public static void m120807Bx(boolean z11) {
        m121692Zu(m122038j("STATUS_SYNC_LANGUAGE_%s"), z11, true);
    }

    /* renamed from: By */
    public static void m120808By(long j11) {
        m121769bv("TIME_LIMIT_SUGGEST_LINK", j11, true);
    }

    /* renamed from: Bz */
    public static void m120809Bz(boolean z11) {
        m121692Zu("USE_TWO_DB_PARALLEL", z11, true);
    }

    /* renamed from: C */
    public static String m120810C() {
        return m122013ia("AQUERY_RESIZE_SAMPLE_CONFIG", "", true);
    }

    /* renamed from: C0 */
    public static long m120811C0() {
        return m121975ha("SETTING_MIN_TIME_SUBMTT_LOG", 60000L, true);
    }

    /* renamed from: C1 */
    public static String m120812C1() {
        return m122013ia(m122038j("DYNAMIC_CALL_ENTRY_POINT_HEADER_CHAT_FOR_ALL%s"), "", true);
    }

    /* renamed from: C2 */
    public static boolean m120813C2() {
        return AbstractC0908e0.m2808b("ENABLE_GROUP_CALL_ENTRY_POINT_GROUP_TAB_ROW", false, true);
    }

    /* renamed from: C3 */
    public static boolean m120814C3() {
        return m121899fa("ENABLE_SUPPORT_HEIC_FORMAT", false, true);
    }

    /* renamed from: C4 */
    public static int m120815C4() {
        return m121937ga("HOLD_CALL_RECEIVE_TIME_OUT", 300000, true);
    }

    /* renamed from: C5 */
    public static long m120816C5() {
        return m121975ha("LAST_PHOTO_SUGGEST_TIME", 0L, true);
    }

    /* renamed from: C6 */
    public static long m120817C6() {
        return m121975ha("LAST_TIME_RESET_SUBMIT_CONTACT_FULL_" + m121738b1(), 0L, true);
    }

    /* renamed from: C7 */
    public static long m120818C7() {
        return m121975ha("TIMESTAMP_UPLOAD_QOS_SMS_LOG", 0L, true);
    }

    /* renamed from: C8 */
    public static int m120819C8() {
        int m2510A = AbstractC23306f.m120562A().m2510A();
        int m121937ga = m121937ga("CHAT_MULTI_SELECTION_MAX_NUMBER_OF_SELECTED_MESSAGES", m2510A, true);
        if (m121937ga <= m2510A) {
            return m121937ga;
        }
        return m2510A;
    }

    /* renamed from: C9 */
    public static int m120820C9() {
        return m121937ga("NUMBER_COUNT_NEWEST_PHOTO_PROVIDER", 0, true);
    }

    /* renamed from: Ca */
    public static boolean m120821Ca() {
        return m121899fa(m122038j("PRIVACY_SETTINGS_SETTING_VIEW_TIMELINE_%s"), false, true);
    }

    /* renamed from: Cb */
    public static String m120822Cb() {
        return m122013ia(m122038j("SETTING_PRIVACY_NOTI_FEED_%s"), "", false);
    }

    /* renamed from: Cc */
    public static int m120823Cc() {
        return m121937ga("SUPPORT_CALL_CONTACT_TAB", 1, true);
    }

    /* renamed from: Cd */
    public static int m120824Cd() {
        return m121937ga("boolAlreadyShowSuggestMsgTab" + m121738b1(), 0, true);
    }

    /* renamed from: Ce */
    public static boolean m120825Ce() {
        return m121899fa(m122038j("AUTO_PLAY_USER_PROFILE_MUSIC_%s"), false, true);
    }

    /* renamed from: Cf */
    public static boolean m120826Cf() {
        return m121899fa("ENABLE_RESTORE_LAST_COMPOSE", true, true);
    }

    /* renamed from: Cg */
    public static boolean m120827Cg() {
        return m121899fa("onion_sticker_delete", false, true);
    }

    /* renamed from: Ch */
    public static void m120828Ch(int i11) {
        m121731av("ANIM_FILTER_EXPIRED_TIME", i11, true);
    }

    /* renamed from: Ci */
    public static void m120829Ci(int i11) {
        m121731av("CONFIG_AUTO_DOWNLOAD_HD", i11, true);
    }

    /* renamed from: Cj */
    public static void m120830Cj(int i11) {
        m121731av("DEVICE_STATUS" + m121738b1(), i11, false);
    }

    /* renamed from: Ck */
    public static void m120831Ck(boolean z11) {
        m121692Zu("CONFIG_ENABLE_CLONE_GROUP", z11, true);
    }

    /* renamed from: Cl */
    public static void m120832Cl(int i11) {
        m121731av("ENABLE_LAST_ACTIVE_NEW_RULE", i11, true);
    }

    /* renamed from: Cm */
    public static void m120833Cm(int i11) {
        m121731av("ENABLE_SCALE_MODE", i11, true);
    }

    /* renamed from: Cn */
    public static void m120834Cn(int i11) {
        m121731av("ENABLE_USERNAME_STARTUP_FLOW", i11, true);
    }

    /* renamed from: Co */
    public static void m120835Co(String str) {
        m121806cv("STR_GENERAL_INFO_SUGGEST_CHAT_MSG_TAB", str, true);
    }

    /* renamed from: Cp */
    public static void m120836Cp(String str) {
        m121806cv("JUMPLINK_DOMAIN_901", str, true);
    }

    /* renamed from: Cq */
    public static void m120837Cq(long j11) {
        m121769bv("LAST_TIME_GET_FRIEND_REQUEST", j11, false);
    }

    /* renamed from: Cr */
    public static void m120838Cr(long j11) {
        m121769bv("TIMESTAMP_CLEAN_BACKGROUND_FILES", j11, true);
    }

    /* renamed from: Cs */
    public static void m120839Cs(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("ZaloListNotifyInfo", 0).edit();
        edit.putString(m122038j("STR_LIST_SUGGEST_HINT_ITEM_%s"), str);
        edit.commit();
    }

    /* renamed from: Ct */
    public static void m120840Ct(boolean z11) {
        m121692Zu("MIGRATE_PHOTO_TO_SCOPE_STORAGE_" + m121738b1(), z11, true);
    }

    /* renamed from: Cu */
    public static void m120841Cu(int i11) {
        m121731av("PARSE_LINK_PREVIEW_CONFIG", i11, true);
    }

    /* renamed from: Cv */
    public static void m120842Cv(long j11) {
        m121769bv("QUICK_ACCESS_FILTER_BUTTON_ID", j11, true);
    }

    /* renamed from: Cw */
    public static void m120843Cw(long j11) {
        m121769bv("SERVER_CONFIG_SECRET_CHAT_EXPIRE_TIME", j11, true);
    }

    /* renamed from: Cx */
    public static void m120844Cx(long j11) {
        m121769bv("STICKER_DECOR_EXPIRE_TIME", j11, true);
    }

    /* renamed from: Cy */
    public static void m120845Cy(long j11) {
        m121769bv("TIME_OF_NEWEST_PHOTO_PROVIDER", j11, true);
    }

    /* renamed from: Cz */
    public static void m120846Cz(boolean z11) {
        m121692Zu("UnlockScreenForPopupMessage" + m121738b1(), z11, true);
    }

    /* renamed from: D */
    public static long m120847D() {
        return m121975ha("AQUERY_TARGET_SIZE", 15000000L, true);
    }

    /* renamed from: D0 */
    public static String m120848D0() {
        return m122013ia("CONFIG_MISS_CALL_INFO", "", true);
    }

    /* renamed from: D1 */
    public static String m120849D1() {
        return m122013ia(m122038j("DYNAMIC_CALL_ENTRY_POINT_HEADER_CHAT_FOR_SPECIAL%s"), "", true);
    }

    /* renamed from: D2 */
    public static boolean m120850D2() {
        return m121899fa("ENABLE_GROUP_MENTION_STACK", true, false);
    }

    /* renamed from: D3 */
    public static boolean m120851D3() {
        return m121899fa("ENABLE_SYNC_CONTACTS", true, true);
    }

    /* renamed from: D4 */
    public static int m120852D4() {
        return m121937ga("HOLD_CALL_INTERRUPT_TIME_OUT", 600000, true);
    }

    /* renamed from: D5 */
    public static int m120853D5() {
        return m121937ga("LAST_PROMOTED_LOCATION_FILTER_ID", -1, true);
    }

    /* renamed from: D6 */
    public static long m120854D6() {
        return m121975ha("LAST_TIME_SCAN_NEWEST_PHOTO_PROVIDER", 0L, true);
    }

    /* renamed from: D7 */
    public static int m120855D7() {
        return m121937ga("LAST_TYPO_SELECTED_ID" + m121738b1(), 0, true);
    }

    /* renamed from: D8 */
    public static int m120856D8() {
        return m121937ga("SETTING_MAX_PERCENT_OF_FREE_STORAGE_FOR_ZINSTANT_CACHE", C17171o0.f87722e, true);
    }

    /* renamed from: D9 */
    public static int m120857D9(Context context) {
        return context.getSharedPreferences("ZaloListNotifyInfo", 0).getInt("numberNewFriend" + m121738b1(), 0);
    }

    /* renamed from: Da */
    public static int m120858Da() {
        return m121937ga(m122038j("PRIVACY_SETTINGS_SETTING_VIEW_USER_DETAIL_%s"), 1, true);
    }

    /* renamed from: Db */
    public static String m120859Db() {
        return m122013ia(m122038j("SETTING_PRIVACY_NOTI_STORY_%s"), "", false);
    }

    /* renamed from: Dc */
    public static String m120860Dc() {
        return m122013ia("support_info", "", true);
    }

    /* renamed from: Dd */
    public static String m120861Dd() {
        return AbstractC0908e0.m2815i(m122038j("TYPO_MAP_TYPEFACE_%s"), "", true);
    }

    /* renamed from: De */
    public static boolean m120862De() {
        return m121899fa("CHAT_HEAD_ROTATION_ENABLE", true, true);
    }

    /* renamed from: Df */
    public static boolean m120863Df() {
        return m121899fa("ENABLE_RETRY_MISS_CALL", true, true);
    }

    /* renamed from: Dg */
    public static boolean m120864Dg() {
        return m121899fa("PERMISSION_MONITOR", false, true);
    }

    /* renamed from: Dh */
    public static void m120865Dh(int i11) {
        m121731av("ANIM_FILTER_PROMOTE_CATE_ID", i11, true);
    }

    /* renamed from: Di */
    public static void m120866Di(long j11) {
        m121769bv("CONFIG_DURATION_DISABLE_AUTO_OPEN_FILE", j11, true);
    }

    /* renamed from: Dj */
    public static void m120867Dj(int i11) {
        m121731av("devicetype", i11, true);
    }

    /* renamed from: Dk */
    public static void m120868Dk(int i11) {
        m121731av("FLAG_COLLAPSE_CONVERSATION_FOR_SHOW_SUGGEST", i11, true);
    }

    /* renamed from: Dl */
    public static void m120869Dl(boolean z11) {
        m121692Zu("ENABLE_LIKE_COMMENT_FEED", z11, true);
    }

    /* renamed from: Dm */
    public static void m120870Dm(int i11) {
        m121731av("ENABLE_SEARCH_MENTION_WITHOUT_PREFIX", i11, true);
    }

    /* renamed from: Dn */
    public static void m120871Dn(boolean z11) {
        m121692Zu("IS_ENABLE_VIDEO_BIG_SIZE", z11, true);
    }

    /* renamed from: Do */
    public static void m120872Do(String str) {
        m121806cv("GEO_LOCATION_APP_ID", str, true);
    }

    /* renamed from: Dp */
    public static void m120873Dp(String str) {
        m121806cv(m122038j("JUMP_URL_%s"), str, false);
    }

    /* renamed from: Dq */
    public static void m120874Dq(long j11) {
        m121769bv("LAST_TIME_GET_FRIEND_REQUESTED", j11, false);
    }

    /* renamed from: Dr */
    public static void m120875Dr(long j11) {
        m121769bv("timestampCleanDupMessage", j11, true);
    }

    /* renamed from: Ds */
    public static void m120876Ds(String str) {
        m121806cv("strListUidNewFriendWithTimeToDelete" + m121738b1(), str, true);
    }

    /* renamed from: Dt */
    public static void m120877Dt(int i11) {
        m121731av("MIN_CHAR_BG_FEED", i11, true);
    }

    /* renamed from: Du */
    public static void m120878Du(int i11) {
        m121731av("PARSE_PHONE_NUM_MAX_LIMIT", i11, true);
    }

    /* renamed from: Dv */
    public static void m120879Dv(int i11) {
        m121731av("QUICK_ACCESS_FILTER_BUTTON_MODE", i11, true);
    }

    /* renamed from: Dw */
    public static void m120880Dw(int i11) {
        m121731av("SERVER_CONFIG_SECRET_CHAT_SNAP_TIME", i11, true);
    }

    /* renamed from: Dx */
    public static void m120881Dx(int i11) {
        m121731av("STICKER_STORE_ALIGN", i11, true);
    }

    /* renamed from: Dy */
    public static void m120882Dy(long j11) {
        m121769bv("SETTING_TIME_OFF_NOTI_MSG_" + CoreUtility.f89233i, j11, false);
    }

    /* renamed from: Dz */
    public static void m120883Dz(boolean z11) {
        m121692Zu("use_wakeup_connection", z11, true);
    }

    /* renamed from: E */
    public static long m120884E() {
        return m121975ha("AQUERY_TRIGGER_SIZE", 30000000L, true);
    }

    /* renamed from: E0 */
    public static int m120885E0() {
        return m121937ga("SETTING_NUMBERLOG_SUBMIT", 5, true);
    }

    /* renamed from: E1 */
    public static long m120886E1() {
        return m121975ha("EDITOR_FILTER_CATEGORY", 3L, true);
    }

    /* renamed from: E2 */
    public static int m120887E2() {
        return m121937ga("CONFIG_ENABLE_GROUP_NAME_COLOR", 1, true);
    }

    /* renamed from: E3 */
    public static int m120888E3() {
        return m121937ga("CONFIG_ENABLE_SYNC_STICKER", 1, true);
    }

    /* renamed from: E4 */
    public static boolean m120889E4() {
        return m121899fa("http_fail_over", false, true);
    }

    /* renamed from: E5 */
    public static int m120890E5() {
        return m121937ga(m122038j("LAST_SETTING_THEME_%s"), -1, true);
    }

    /* renamed from: E6 */
    public static long m120891E6() {
        return m121975ha("LAST_TIME_SEND_LOG_DOWNLOAD_PHOTO", 0L, true);
    }

    /* renamed from: E7 */
    public static String m120892E7() {
        return m122013ia("LAST_UID_REQUEST_FRIEND", "", false);
    }

    /* renamed from: E8 */
    public static int m120893E8() {
        return m121937ga("SETTING_MAX_PERCENT_OF_ZINSTANT_STORAGE_FOR_LAYOUT_CACHE", C17171o0.f87723f, true);
    }

    /* renamed from: E9 */
    public static int m120894E9() {
        return m121937ga("int_count_number_warning_sms" + m121738b1(), 0, true);
    }

    /* renamed from: Ea */
    public static String m120895Ea() {
        return m122013ia("privacySettings" + m121738b1(), "", true);
    }

    /* renamed from: Eb */
    public static int m120896Eb() {
        return m121937ga("SETTING_SHOW_BIG_PHOTO_IN_NOTIFICATION_", 1, true);
    }

    /* renamed from: Ec */
    public static int m120897Ec() {
        return m121937ga("sync_entry_point_" + CoreUtility.f89233i, 1, true);
    }

    /* renamed from: Ed */
    public static String m120898Ed(int i11) {
        return m122013ia(m122001i("STR_URL_UPLOAD_ZALO_TRACKING_BY_TYPE_%d", i11), C18489c.m97849k(C7962g.c.a.ZALO_LOG) + "/tracking", true);
    }

    /* renamed from: Ee */
    public static boolean m120899Ee() {
        return m121899fa("RESOLUTION_CHANGED_CONFIG", true, true);
    }

    /* renamed from: Ef */
    public static boolean m120900Ef() {
        return m121899fa("IS_ENABLE_REUSE_CHAT_FILE", true, true);
    }

    /* renamed from: Eg */
    public static boolean m120901Eg() {
        return m121899fa(m122038j("PRECHECK_CONTACT_PERMISSION_%s"), true, true);
    }

    /* renamed from: Eh */
    public static void m120902Eh(int i11) {
        m121731av(m122038j("ANIM_SCALE_BTN_SEARCH_%s"), i11, true);
    }

    /* renamed from: Ei */
    public static void m120903Ei(int i11) {
        m121731av("CONFIG_ENABLE_AUTO_OPEN_FILE_AFTER_DOWNLOAD", i11, true);
    }

    /* renamed from: Ej */
    public static void m120904Ej(long j11) {
        m121769bv("DISCOVER_CONTACT_EXPIRE_TIME_" + m121738b1(), j11, true);
    }

    /* renamed from: Ek */
    public static void m120905Ek(boolean z11) {
        m121692Zu("ENABLE_COMMENT_PHOTO_STICKER", z11, true);
    }

    /* renamed from: El */
    public static void m120906El(boolean z11) {
        m121692Zu("ENABLE_LIVE_EMOJI_V2", z11, true);
    }

    /* renamed from: Em */
    public static void m120907Em(int i11) {
        m121731av("IS_ENABLE_SEARCH_PHONE_GLOBAL_SEARCH", i11, true);
    }

    /* renamed from: En */
    public static void m120908En(boolean z11) {
        m121692Zu("ENABLE_VIDEO_CALL", z11, true);
    }

    /* renamed from: Eo */
    public static void m120909Eo(long j11) {
        AbstractC0908e0.m2824r("GET_TRENDING_STICKER_EXPIRE_TIME", j11, true, true);
    }

    /* renamed from: Ep */
    public static void m120910Ep(boolean z11) {
        m121692Zu("STORY_KEEP_RATIO", z11, true);
    }

    /* renamed from: Eq */
    public static void m120911Eq(long j11) {
        m121769bv("LAST_TIME_GET_HIDDEN_CHAT", j11, true);
    }

    /* renamed from: Er */
    public static void m120912Er(long j11) {
        m121769bv("timestampCleanMessageChatContent", j11, true);
    }

    /* renamed from: Es */
    public static void m120913Es(String str) {
        m121806cv("strListUidNewFriendStickNumNew" + m121738b1(), str, true);
    }

    /* renamed from: Et */
    public static void m120914Et(int i11) {
        m121731av("MIN_CHAR_BG_FEED_STORY", i11, true);
    }

    /* renamed from: Eu */
    public static void m120915Eu(int i11) {
        m121731av("PARSE_PHONE_PREVIEW_CONFIG", i11, true);
    }

    /* renamed from: Ev */
    public static void m120916Ev(int i11) {
        m121731av("QUICK_ACCESS_FILTER_BUTTON_SOURCE", i11, true);
    }

    /* renamed from: Ew */
    public static void m120917Ew(long j11) {
        m121769bv("SERVER_CONFIG_SYNC_MESSAGE_INTERVAL_" + CoreUtility.f89233i, j11, true);
    }

    /* renamed from: Ex */
    public static void m120918Ex(String str) {
        m121806cv("STORY_CONFIG", str, true);
    }

    /* renamed from: Ey */
    public static void m120919Ey(long j11) {
        m121769bv("SETTING_TIME_OFF_NOTI_MSG_GROUP_" + CoreUtility.f89233i, j11, false);
    }

    /* renamed from: Ez */
    public static void m120920Ez(boolean z11) {
        m121692Zu("WAKEUP_DEVICE_ZALO_HANDLER", z11, true);
    }

    /* renamed from: F */
    public static String m120921F() {
        return m122013ia("ARRAY_BANNER_HIDE_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: F0 */
    public static String m120922F0() {
        return m122013ia(m122038j("CONFIG_POST_FEED_%s"), "", true);
    }

    /* renamed from: F1 */
    public static int m120923F1() {
        return m121937ga("emei_state", 2, true);
    }

    /* renamed from: F2 */
    public static int m120924F2() {
        return m121937ga("ENABLE_GROUP_TAB", 1, true);
    }

    /* renamed from: F3 */
    public static int m120925F3() {
        return m121937ga("ENABLE_TIMELINE_TAB", 1, true);
    }

    /* renamed from: F4 */
    public static String m120926F4() {
        return m122013ia("HTTP_HEADER_VIEWER_KEY_FROM_SERVER", "", true);
    }

    /* renamed from: F5 */
    public static int m120927F5() {
        return m121937ga("LAST_STATE_AIRPLANE_MODE", 0, true);
    }

    /* renamed from: F6 */
    public static long m120928F6() {
        return m121975ha("LAST_TIME_SEND_LOG_PLAY_VOICE_MSG", 0L, true);
    }

    /* renamed from: F7 */
    public static int m120929F7() {
        return m121937ga("LAST_UPDATE_FRIEND_NUM_ITEM" + m121738b1(), 3, true);
    }

    /* renamed from: F8 */
    public static int m120930F8() {
        return m121937ga("MAX_PHONES_SUPPORT", ZAbstractBase.ZVU_PROCESS_FLUSH, true);
    }

    /* renamed from: F9 */
    public static int m120931F9(int i11) {
        return m121937ga(m122001i("NUMBER_RECORD_TO_SUBMIT_ZALOTRACKING_%d", i11), 5, true);
    }

    /* renamed from: Fa */
    public static boolean m120932Fa() {
        return m121899fa("PROMOTE_SEASONAL_STICKER_TAB", false, true);
    }

    /* renamed from: Fb */
    public static int m120933Fb() {
        return m121937ga(m122038j("SETTING_SHOW_HIDE_ONLINE_FRIEND_%s"), 1, true);
    }

    /* renamed from: Fc */
    public static long m120934Fc() {
        return AbstractC0908e0.m2813g("sync_message_status_time_out_" + CoreUtility.f89233i, 172800L, true);
    }

    /* renamed from: Fd */
    public static long m120935Fd() {
        return m121975ha("UNDO_INVITE_TIME", 0L, true);
    }

    /* renamed from: Fe */
    public static boolean m120936Fe() {
        return m121899fa("CLIENT_CONTROL_NOTIF_DELETE_MSG", true, true);
    }

    /* renamed from: Ff */
    public static boolean m120937Ff() {
        return m121899fa("IS_ENABLE_REUSE_CHAT_PHOTO", true, true);
    }

    /* renamed from: Fg */
    public static boolean m120938Fg() {
        return m121899fa("REDOWNLOAD_CHAT_MEDIA", true, true);
    }

    /* renamed from: Fh */
    public static void m120939Fh(float f11) {
        m121806cv("APP_FONT_SIZE_RATIO", String.valueOf(f11), true);
    }

    /* renamed from: Fi */
    public static void m120940Fi(int i11) {
        m121731av("SETTING_ENABLE_SUBMIT_TIMEONAPP", i11, true);
    }

    /* renamed from: Fj */
    public static void m120941Fj(long j11) {
        m121769bv("DISCOVER_CONTACT_LAST_TIME_" + m121738b1(), j11, true);
    }

    /* renamed from: Fk */
    public static void m120942Fk(boolean z11) {
        m121692Zu("ENABLE_CONFIG_SEARCH_AFTER_RECENT", z11, true);
    }

    /* renamed from: Fl */
    public static void m120943Fl(boolean z11) {
        m121731av(m122038j("ENABLE_LIVE_EMOJI_ALL_CONVERSATIONS_%s"), z11 ? 1 : 0, true);
    }

    /* renamed from: Fm */
    public static void m120944Fm(boolean z11) {
        m121692Zu("ENABLE_SEARCH_SETTING", z11, false);
    }

    /* renamed from: Fn */
    public static void m120945Fn(boolean z11) {
        m121692Zu("SETTING_ENABLE_VIEW_FULL_CHAT_MERGE_MEDIA_STORE", z11, true);
    }

    /* renamed from: Fo */
    public static void m120946Fo(boolean z11) {
        m121692Zu("gif_auto_repeat", z11, true);
    }

    /* renamed from: Fp */
    public static void m120947Fp(int i11) {
        m121731av("KEEP_SUGGEST_STICKER_AFTER_SEND_MSG", i11, true);
    }

    /* renamed from: Fq */
    public static void m120948Fq(long j11) {
        AbstractC0908e0.m2823q("LAST_TIME_GET_INVITATION_LIST", j11, true);
    }

    /* renamed from: Fr */
    public static void m120949Fr(long j11) {
        m121769bv("TIMESTAMP_CLEAN_OLD_CONTACT_PROFILE", j11, true);
    }

    /* renamed from: Fs */
    public static void m120950Fs(String str) {
        m121806cv(m122038j("strListUidNewSuggestStickNumNew_%s"), str, true);
    }

    /* renamed from: Ft */
    public static void m120951Ft(long j11) {
        m121769bv("minDurationCheckNetwork" + m121738b1(), j11, true);
    }

    /* renamed from: Fu */
    public static void m120952Fu(String str) {
        m121806cv("PARSE_TIME_CONFIG_EXCLUDES", str, false);
    }

    /* renamed from: Fv */
    public static void m120953Fv(String str) {
        AbstractC0908e0.m2825s("QUICK_COMMENT_CONFIG", str, true);
    }

    /* renamed from: Fw */
    public static void m120954Fw(boolean z11) {
        m121692Zu("SERVER_ENABLE_EFFECT", z11, true);
    }

    /* renamed from: Fx */
    public static void m120955Fx(int i11) {
        AbstractC0908e0.m2820n(m122038j("STORY_DEST_TYPE_%s"), i11, true);
    }

    /* renamed from: Fy */
    public static void m120956Fy(int i11) {
        m121731av("TIME_REMIND_DIALOG_UPDATE_PHONEBOOK_" + m121738b1(), i11, true);
    }

    /* renamed from: Fz */
    public static void m120957Fz(boolean z11) {
        m121692Zu("USE_ZALO_HANDLER_SOCKET_CONNECTION", z11, true);
    }

    /* renamed from: G */
    public static String m120958G() {
        return m122013ia("ARRAY_RECENT_BG_FEED_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: G0 */
    public static boolean m120959G0() {
        return AbstractC0908e0.m2808b("drive_photo_restore_in_chat", true, true);
    }

    /* renamed from: G1 */
    public static String m120960G1() {
        return m122013ia("EMOTICON_EFFECT", "", true);
    }

    /* renamed from: G2 */
    public static boolean m120961G2() {
        return AbstractC0908e0.m2808b("ENABLE_INVITATION_BOX", true, true);
    }

    /* renamed from: G3 */
    public static int m120962G3(int i11) {
        return m121937ga(m122001i("ENABLE_TRACK_ZALO_LOG_BY_TYPE_%d", i11), 1, true);
    }

    /* renamed from: G4 */
    public static String m120963G4() {
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return null;
        }
        return m122013ia(m122038j("HUAWEI_TOKEN_%s"), "", true);
    }

    /* renamed from: G5 */
    public static boolean m120964G5() {
        return m121899fa("LAST_STATE_NOTIFICATION_SYSTEM", true, false);
    }

    /* renamed from: G6 */
    public static long m120965G6() {
        return m121975ha(m122038j("LAST_TIME_SHOW_HEADUP_FRIEND_REQUEST_%s"), 0L, true);
    }

    /* renamed from: G7 */
    public static int m120966G7() {
        return m121937ga(m122038j("LAST_VALUE_SETTING_NOTIFY_SYSTEM_%s"), 2, true);
    }

    /* renamed from: G8 */
    public static int m120967G8() {
        return m121937ga("GIF_MAX_PREIVEW_SIZE", C8917b.f47666W, true);
    }

    /* renamed from: G9 */
    public static String m120968G9() {
        return m122013ia(m122038j("OA_SUGGEST_LIST_INFO_%s"), "", true);
    }

    /* renamed from: Ga */
    public static String m120969Ga() {
        String m122013ia = m122013ia("QRCODE_USERID", null, false);
        if (m122013ia == null || !m122013ia.equals(CoreUtility.f89233i)) {
            return null;
        }
        return m122013ia("QRCODE_AVATAR", null, false);
    }

    /* renamed from: Gb */
    public static int m120970Gb() {
        return m121937ga(m122038j("SETTING_SHOW_LESS_SHORT_RECENT_UPDATE_%s"), 1, true);
    }

    /* renamed from: Gc */
    public static String m120971Gc() {
        return AbstractC0908e0.m2815i("sync_session_data" + m121738b1(), "", true);
    }

    /* renamed from: Gd */
    public static String m120972Gd(String str) {
        return m122013ia("UNPACK_LIBRARY_CHECKSUM" + str, "", true);
    }

    /* renamed from: Ge */
    public static boolean m120973Ge() {
        return m121899fa("FLAG_UPDATE_OLD_DEFAULT_STICKER_THUMB_", false, true);
    }

    /* renamed from: Gf */
    public static boolean m120974Gf() {
        return m121899fa("IS_ENABLE_REUSE_CHAT_VIDEO", true, true);
    }

    /* renamed from: Gg */
    public static boolean m120975Gg() {
        return m121899fa("REACTION_SETTING", true, true);
    }

    /* renamed from: Gh */
    public static void m120976Gh(int i11) {
        m121731av("APPLICATION_RESTART_CHAIN", i11, true);
    }

    /* renamed from: Gi */
    public static void m120977Gi(int i11) {
        m121731av("CONFIG_LIMIT_INVITE_IN_GROUP", i11, true);
    }

    /* renamed from: Gj */
    public static void m120978Gj(int i11) {
        m121731av("DISCOVER_ENABLE_SETTING", i11, true);
    }

    /* renamed from: Gk */
    public static void m120979Gk(boolean z11) {
        m121692Zu("TRENDING_AFTER_RECENT", z11, true);
    }

    /* renamed from: Gl */
    public static void m120980Gl(boolean z11) {
        m121692Zu("ENABLE_LIVE_EMOJI_CONVERSATION", z11, true);
    }

    /* renamed from: Gm */
    public static void m120981Gm(int i11) {
        m121731av("ENABLE_SELECT_BUBBLE", i11, true);
    }

    /* renamed from: Gn */
    public static void m120982Gn(boolean z11) {
        m121692Zu("ENABLE_VOICE_AAC", z11, true);
    }

    /* renamed from: Go */
    public static void m120983Go(boolean z11) {
        m121692Zu("gif_enable", z11, true);
    }

    /* renamed from: Gp */
    public static void m120984Gp(int i11) {
        m121731av("keyboard_height", i11, true);
    }

    /* renamed from: Gq */
    public static void m120985Gq(long j11) {
        m121769bv("LAST_TIME_GET_INFO_LAST_KNOW_LOCATION", j11, true);
    }

    /* renamed from: Gr */
    public static void m120986Gr(long j11) {
        m121769bv("timestampCleanStoryVideo", j11, true);
    }

    /* renamed from: Gs */
    public static void m120987Gs(String str) {
        m121806cv("strListUidSuggestMsgTab" + m121738b1(), str, true);
    }

    /* renamed from: Gt */
    public static void m120988Gt(long j11, int i11) {
        m121769bv(m122001i("MIN_TIME_SUBMIT_ZALO_TRACKING_LOG_%d", i11), j11, true);
    }

    /* renamed from: Gu */
    public static void m120989Gu(String str) {
        m121806cv("PARSE_TIME_CONFIG_INCLUDES", str, false);
    }

    /* renamed from: Gv */
    public static void m120990Gv(String str) {
        m121806cv("QUICK_REACT_NOTIF_SETTING", str, true);
    }

    /* renamed from: Gw */
    public static void m120991Gw(boolean z11) {
        m121692Zu("SERVER_ENABLE_SEASONAL_STICKER", z11, true);
    }

    /* renamed from: Gx */
    public static void m120992Gx(boolean z11) {
        m121692Zu("STORY_REACTION_COLLAPSE_MODE", z11, true);
    }

    /* renamed from: Gy */
    public static void m120993Gy(long j11) {
        m121769bv("time_server", j11, true);
    }

    /* renamed from: Gz */
    public static void m120994Gz(String str) {
        AbstractC0908e0.m2825s("user_backup_pass_" + m121738b1(), str, true);
    }

    /* renamed from: H */
    public static boolean m120995H() {
        return m121899fa("ASK_USER_UPDATE_PHONEBOOK_" + m121738b1(), false, true);
    }

    /* renamed from: H0 */
    public static int m120996H0() {
        return m121937ga("CONFIG_STORY_BAR_POSITION", 0, true);
    }

    /* renamed from: H1 */
    public static String m120997H1() {
        return m122013ia("EMOTICON_EFFECT_CONFIG", "", true);
    }

    /* renamed from: H2 */
    public static boolean m120998H2() {
        return m121899fa("ENABLE_INVITE_PHONE_LIST", true, true);
    }

    /* renamed from: H3 */
    public static boolean m120999H3() {
        return m121899fa("ENABLE_VIDEO_CALL", true, true);
    }

    /* renamed from: H4 */
    public static String m121000H4() {
        return m122013ia("IMEI_LOGIN_SESSION", "", true);
    }

    /* renamed from: H5 */
    public static long m121001H5() {
        return m121975ha("STORY_LAST_SUGGEST_MEDIA_CREATE_TIME", 0L, true);
    }

    /* renamed from: H6 */
    public static long m121002H6() {
        return m121975ha("last_time_show_popup_maintab", 0L, true);
    }

    /* renamed from: H7 */
    public static int m121003H7() {
        return m121937ga(m122038j("LAST_VALUE_PERMISSION_CONTACT_INAPP_%s"), 2, true);
    }

    /* renamed from: H8 */
    public static int m121004H8(int i11) {
        return m121937ga(m122001i("MAX_RECORD_TO_SUBMIT_ZALOTRACKING_%d", i11), 100, true);
    }

    /* renamed from: H9 */
    public static String m121005H9() {
        return m122013ia("OLD_JSON_APP_THEME_OPERATION_" + m121738b1(), "", true);
    }

    /* renamed from: Ha */
    public static String m121006Ha() {
        String m122013ia = m122013ia("QRCODE_USERID", null, false);
        if (m122013ia == null || !m122013ia.equals(CoreUtility.f89233i)) {
            return null;
        }
        return m122013ia("QRCODE_QRLINK", null, false);
    }

    /* renamed from: Hb */
    public static boolean m121007Hb() {
        return m121899fa("SHOW_LIKE_COMMENT_PROFILE", false, true);
    }

    /* renamed from: Hc */
    public static long m121008Hc() {
        return m121975ha("SYNC_STICKER_EXPIRE_TIME", 0L, true);
    }

    /* renamed from: Hd */
    public static int m121009Hd() {
        return m121937ga(m122038j("UNREAD_OA_FOLDER_%s"), 0, true);
    }

    /* renamed from: He */
    public static boolean m121010He() {
        return m121899fa("DELETE_FOR_EVERYONE", true, true);
    }

    /* renamed from: Hf */
    public static boolean m121011Hf() {
        return m121899fa("ENABLE_SEARCH_SETTING", true, false);
    }

    /* renamed from: Hg */
    public static boolean m121012Hg() {
        return m121899fa("RESTORE_PHOTO_IN_MEDIA_STORE_" + m121738b1(), false, true);
    }

    /* renamed from: Hh */
    public static void m121013Hh(long j11) {
        m121769bv("APPLICATION_START_LAST_TIME", j11, true);
    }

    /* renamed from: Hi */
    public static void m121014Hi(int i11) {
        m121731av("CONFIG_LIMIT_MAXIMUM_MEM_IN_GROUP", i11, true);
    }

    /* renamed from: Hj */
    public static void m121015Hj(String str) {
        AbstractC0908e0.m2825s("DOMAINS_SKIP_JUMP", str, true);
    }

    /* renamed from: Hk */
    public static void m121016Hk(boolean z11) {
        m121692Zu("ENABLE_CREATE_GROUP_GROUP_1_1", z11, true);
    }

    /* renamed from: Hl */
    public static void m121017Hl(boolean z11) {
        m121692Zu("ENABLE_LIVE_EMOJI_IN_CHAT_HEAD", z11, true);
    }

    /* renamed from: Hm */
    public static void m121018Hm(boolean z11) {
        m121692Zu(m122038j("ENABLE_SETTING_BLOCK_SOCIAL_TIMELINE_%s"), z11, true);
    }

    /* renamed from: Hn */
    public static void m121019Hn(int i11) {
        m121731av("ENABLE_VOICE_MISSCALL_NOT_RING_RING", i11, true);
    }

    /* renamed from: Ho */
    public static void m121020Ho(int i11) {
        m121731av("GIF_CHAT_SIZE", i11, true);
    }

    /* renamed from: Hp */
    public static void m121021Hp(int i11) {
        m121731av("KILL_CHAT_HEAD_COUNT", i11, false);
    }

    /* renamed from: Hq */
    public static void m121022Hq(long j11) {
        m121769bv(m122038j("LAST_TIME_GET_OA_SUGGEST_LIST_%s"), j11, false);
    }

    /* renamed from: Hr */
    public static void m121023Hr(long j11) {
        m121769bv("timestampClearWebviewCache", j11, false);
    }

    /* renamed from: Hs */
    public static void m121024Hs(float f11) {
        m121806cv("LIVE_EMOJI_BUTTON_TRANSLATION_Y", "" + f11, true);
    }

    /* renamed from: Ht */
    public static void m121025Ht(int i11) {
        m121731av("min_time_undo_send_msg", i11, true);
    }

    /* renamed from: Hu */
    public static void m121026Hu(String str) {
        m121806cv("PARSE_TIME_CONFIG_MAPPING_RULES", str, false);
    }

    /* renamed from: Hv */
    public static void m121027Hv(int i11) {
        m121731av("QuickStickerDownloadSetting", i11, true);
    }

    /* renamed from: Hw */
    public static void m121028Hw(boolean z11) {
        m121692Zu("enable_suggest_sticker", z11, true);
    }

    /* renamed from: Hx */
    public static void m121029Hx(String str) {
        m121806cv("STORY_SUGGESTION_SETTING", str, true);
    }

    /* renamed from: Hy */
    public static void m121030Hy(long j11) {
        m121769bv("TIME_SHOW_SUGGEST_REMOVE_FRIEND", j11, false);
    }

    /* renamed from: Hz */
    public static void m121031Hz(boolean z11) {
        m121692Zu("USER_DISABLE_POPUP_CONFIRM_DELETE_MSG_" + m121738b1(), z11, false);
    }

    /* renamed from: I */
    public static String m121032I() {
        return m122013ia("ATTACH_FOOTER_INFO", "", true);
    }

    /* renamed from: I0 */
    public static int m121033I0() {
        return m121937ga("CONFIG_STORY_THUMB_SHAPE", 0, true);
    }

    /* renamed from: I1 */
    public static String m121034I1() {
        return m122013ia("emptyRes", "", false);
    }

    /* renamed from: I2 */
    public static boolean m121035I2() {
        return m121899fa("ENABLE_INVITE_TO_MULTI_GROUP", true, true);
    }

    /* renamed from: I3 */
    public static boolean m121036I3() {
        return m121899fa("SETTING_ENABLE_VIEW_FULL_CHAT_MERGE_MEDIA_STORE", false, true);
    }

    /* renamed from: I4 */
    public static String m121037I4() {
        return m122013ia("ip_client", "", true);
    }

    /* renamed from: I5 */
    public static long m121038I5() {
        return m121975ha("STORY_LAST_SUGGEST_MEDIA_TIME", 0L, true);
    }

    /* renamed from: I6 */
    public static long m121039I6() {
        return m121975ha("LAST_TIME_SHOW_REMIND_UPDATE_MINI_CHAT_PERMISSION", 0L, true);
    }

    /* renamed from: I7 */
    public static int m121040I7() {
        return m121937ga(m122038j("LAST_VALUE_PERMISSION_CONTACT_SYSTEM_%s"), 2, true);
    }

    /* renamed from: I8 */
    public static int m121041I8() {
        return m121937ga("MAX_SELECTED_INVITE_TO_MULTI_GROUP", 3, true);
    }

    /* renamed from: I9 */
    public static String m121042I9() {
        return m122013ia("appBackupGdriveToken", "", true);
    }

    /* renamed from: Ia */
    public static long m121043Ia() {
        return m121975ha("QUICK_ACCESS_FILTER_BUTTON_CATEID", 3L, true);
    }

    /* renamed from: Ib */
    public static boolean m121044Ib() {
        return m121899fa("SHOW_LIKE_COMMENT_TIMELINE", true, true);
    }

    /* renamed from: Ic */
    public static int m121045Ic() {
        return m121937ga(m122038j("SYNC_STICKER_VERSION_%s"), 0, true);
    }

    /* renamed from: Id */
    public static String m121046Id() {
        return m122013ia(m122038j("UPDATE_NEW_PROFILE_STATUS_%s"), "", true);
    }

    /* renamed from: Ie */
    public static boolean m121047Ie() {
        return m121899fa("ENABLE_ANIMATION_STORY_VIEWER", true, true);
    }

    /* renamed from: If */
    public static boolean m121048If() {
        return m121899fa(m122038j("ENABLE_SETTING_RECOMMEND_SEND_PHOTO_HD_%s"), false, true);
    }

    /* renamed from: Ig */
    public static boolean m121049Ig() {
        return m121899fa("SCAN_LOCATION", false, true);
    }

    /* renamed from: Ih */
    public static void m121050Ih(String str) {
        m121806cv("AQUERY_RESIZE_SAMPLE_CONFIG", str, true);
    }

    /* renamed from: Ii */
    public static void m121051Ii(int i11) {
        m121731av("CONFIG_MAX_USER_GROUP", i11, true);
    }

    /* renamed from: Ij */
    public static void m121052Ij(int i11) {
        m121731av("DURATION_GEN_BUBBLE_CALL_NATIVE" + CoreUtility.f89233i, i11, true);
    }

    /* renamed from: Ik */
    public static void m121053Ik(int i11) {
        m121731av(m122038j("ENABLE_CUSTOM_NOTIFICATION_CALL%s"), i11, true);
    }

    /* renamed from: Il */
    public static void m121054Il(boolean z11) {
        m121692Zu("ENABLE_LOCATION_PICKER_FROM_ACTION_LIST", z11, true);
    }

    /* renamed from: Im */
    public static void m121055Im(boolean z11) {
        m121692Zu("ENABLE_SETTING_IN_APP_NOTIFICATION_" + m121738b1(), z11, true);
        AbstractC26084s.m134269q(2, 63);
    }

    /* renamed from: In */
    public static void m121056In(boolean z11) {
        m121692Zu("SETTING_ENABLE_VOIP_COMMAND_TIMEOUT_SERVER", z11, true);
    }

    /* renamed from: Io */
    public static void m121057Io(int i11) {
        m121731av("GIF_MAX_SIZE_FEED", i11, true);
    }

    /* renamed from: Ip */
    public static void m121058Ip(long j11) {
        m121769bv("KILL_CHAT_HEAD_DISABLE_TIME", j11, false);
    }

    /* renamed from: Iq */
    public static void m121059Iq(long j11) {
        m121769bv("LASTTIME_GET_LIST_PIN_MSG" + m121738b1(), j11, true);
    }

    /* renamed from: Ir */
    public static void m121060Ir(long j11) {
        m121769bv("LAST_TIMESTAMP_GET_BROADCAST_HTTP", j11, false);
    }

    /* renamed from: Is */
    public static void m121061Is(String str) {
        m121806cv("LIVE_LOCATION_CONFIG", str, true);
    }

    /* renamed from: It */
    public static void m121062It(int i11) {
        m121731av(m122038j("MODE_ACCEPT_FRIEND_REQUEST_%s"), i11, true);
    }

    /* renamed from: Iu */
    public static void m121063Iu(String str) {
        m121806cv("PARSE_TIME_CONFIG_REGEX_FILTER_RULES", str, false);
    }

    /* renamed from: Iv */
    public static void m121064Iv(long j11) {
        m121769bv("RANGE_CHECK_SHOW_CREATE_CALL_SHORTCUT_" + m121738b1(), j11, true);
    }

    /* renamed from: Iw */
    public static void m121065Iw(String str) {
        int i11;
        m121806cv("sessionKey", str, true);
        if (TextUtils.isEmpty(str)) {
            i11 = AbstractC23304d.f113418o0;
        } else {
            i11 = 123205;
        }
        AbstractC20887g.m109229g(123204, i11, "");
        AbstractC0837p0.m2225f().mo2040a(new RunnableC23308h());
    }

    /* renamed from: Ix */
    public static void m121066Ix(long j11) {
        m121769bv("STORY_VERSION", j11, true);
    }

    /* renamed from: Iy */
    public static void m121067Iy(long j11) {
        m121769bv("TIME_SKIP_SYNC_CONTACT_REMOVE_FRIEND", j11, false);
    }

    /* renamed from: Iz */
    public static void m121068Iz(String str) {
        m121806cv("UserInfo", str, true);
    }

    /* renamed from: J */
    public static int m121069J() {
        return m121937ga("AUTO_OPEN_CONNECTION_UPLOAD_CHAT_PHOTO", 1, true);
    }

    /* renamed from: J0 */
    public static int m121070J0(Context context) {
        return context.getSharedPreferences("Zalo", 0).getInt("configSupportCall", 3);
    }

    /* renamed from: J1 */
    public static long m121071J1() {
        return m121975ha("emptyResTimestamp", 0L, false);
    }

    /* renamed from: J2 */
    public static boolean m121072J2() {
        return m121899fa("ENABLE_KEYWORD_MAPPING", true, true);
    }

    /* renamed from: J3 */
    public static int m121073J3() {
        return m121937ga("ENABLE_VOICE_MISSCALL_NOT_RING_RING", 1, true);
    }

    /* renamed from: J4 */
    public static boolean m121074J4() {
        return m121899fa("IGNORE_MUTE_MENTION", true, true);
    }

    /* renamed from: J5 */
    public static String m121075J5() {
        return m122013ia("SUGGEST_LAST_ITEM_TIMELINE_CONFIG_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: J6 */
    public static long m121076J6() {
        return m121975ha(m122038j("LAST_TIME_SHOW_REQUEST_PERMISSION_REMINDER_NEW_%s"), 0L, false);
    }

    /* renamed from: J7 */
    public static int m121077J7() {
        return m121937ga(m122038j("LAST_VALUE_SETTING_SYNC_MSG_BACKUP_RESTORE_%s"), 2, true);
    }

    /* renamed from: J8 */
    public static int m121078J8() {
        return m121937ga("CONFIG_MAX_STRANGER_ADDED_TO_GROUP_PER_SESSION", 0, true);
    }

    /* renamed from: J9 */
    public static int m121079J9() {
        return m121937ga("SaveOldVersionCode", 0, true);
    }

    /* renamed from: Ja */
    public static long m121080Ja() {
        return m121975ha("QUICK_ACCESS_FILTER_BUTTON_ID", 12477L, true);
    }

    /* renamed from: Jb */
    public static int m121081Jb() {
        return m121937ga("SETTING_SHOW_NEW_FRIEND_SECTION", 1, true);
    }

    /* renamed from: Jc */
    public static long m121082Jc() {
        return m121975ha("TSGetPromotionSticker" + m121738b1(), 0L, false);
    }

    /* renamed from: Jd */
    public static int m121083Jd() {
        return m121937ga("UPDATE_PHONE_BOOK_STATUS", 0, true);
    }

    /* renamed from: Je */
    public static boolean m121084Je() {
        return m121899fa("ENABLE_AQUERY_SHRINK_CACHE", true, true);
    }

    /* renamed from: Jf */
    public static boolean m121085Jf() {
        return m121899fa("ENABLE_SHARE_PHONE_NUMBER", true, false);
    }

    /* renamed from: Jg */
    public static boolean m121086Jg() {
        return m121899fa("SCAN_PHONE_CONTACT", false, true);
    }

    /* renamed from: Jh */
    public static void m121087Jh(long j11) {
        m121769bv("AQUERY_TARGET_SIZE", j11, true);
    }

    /* renamed from: Ji */
    public static void m121088Ji(long j11) {
        m121769bv("CONFIG_MIN_TIME_RETURN_FROM_AUTO_OPEN", j11, true);
    }

    /* renamed from: Jj */
    public static void m121089Jj(String str) {
        m121806cv(m122038j("DYNAMIC_CALL_ENTRY_POINT_HEADER_CHAT_FOR_ALL%s"), str, true);
    }

    /* renamed from: Jk */
    public static void m121090Jk(boolean z11) {
        m121692Zu("DYNAMIC_GROUP_NAME", z11, true);
    }

    /* renamed from: Jl */
    public static void m121091Jl(boolean z11) {
        m121692Zu("FLAG_ENTRY_POINT_LOCATION_POST_FEED", z11, true);
    }

    /* renamed from: Jm */
    public static void m121092Jm(int i11) {
        m121731av("ENABLE_SETTING_ONLINE_STATUS", i11, true);
    }

    /* renamed from: Jn */
    public static void m121093Jn(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_WEBP_ANIMATION", z11, true);
    }

    /* renamed from: Jo */
    public static void m121094Jo(int i11) {
        m121731av("GLOBAL_ITEM_MODE", i11, false);
    }

    /* renamed from: Jp */
    public static void m121095Jp(long j11) {
        m121769bv("KILL_CHAT_HEAD_START_TIME", j11, false);
    }

    /* renamed from: Jq */
    public static void m121096Jq(long j11) {
        m121769bv("LAST_TIME_GET_LIST_THEME", j11, true);
    }

    /* renamed from: Jr */
    public static void m121097Jr(long j11) {
        m121769bv("timestampGetFriendRequestMsgTabList_V2" + m121738b1(), j11, false);
    }

    /* renamed from: Js */
    public static void m121098Js(long j11) {
        m121769bv("LIVE_LOCATION_LAST_CLEAN_TIME", j11, true);
    }

    /* renamed from: Jt */
    public static void m121099Jt(int i11) {
        m121731av(m122038j("MODE_CALL_ACTION_IN_LIST_ACTION_GROUP%s"), i11, true);
    }

    /* renamed from: Ju */
    public static void m121100Ju(String str) {
        m121806cv("PARSE_TIME_CONFIG_REGEX_RULES", str, false);
    }

    /* renamed from: Jv */
    public static void m121101Jv(boolean z11) {
        m121692Zu("REDOWNLOAD_CHAT_MEDIA", z11, true);
    }

    /* renamed from: Jw */
    public static void m121102Jw(int i11) {
        m121731av("SETTING_GAME_CENTER", i11, true);
    }

    /* renamed from: Jx */
    public static void m121103Jx(int i11) {
        m121731av("STYLE_REMIND_DIALOG_UPDATE_PHONEBOOK_" + m121738b1(), i11, true);
    }

    /* renamed from: Jy */
    public static void m121104Jy(long j11) {
        m121769bv("time_to_upload_qos", j11, true);
    }

    /* renamed from: Jz */
    public static void m121105Jz(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        m121731av("userTotalPhoto", i11, false);
    }

    /* renamed from: K */
    public static boolean m121106K() {
        return m121899fa("AutoReceiveVoice" + m121738b1(), m121899fa("AutoReceiveVoice", false, true), true);
    }

    /* renamed from: K0 */
    public static long m121107K0() {
        return m121975ha("SETTING_TIME_SUBMIT_LOG", 300000L, true);
    }

    /* renamed from: K1 */
    public static boolean m121108K1() {
        return m121899fa("ENABLE_ANIM_FILTER", true, true);
    }

    /* renamed from: K2 */
    public static int m121109K2() {
        return m121937ga(m122038j("ENABLE_LABEL_STRANGER_NAME_CALL%s"), 1, true);
    }

    /* renamed from: K3 */
    public static boolean m121110K3() {
        return m121899fa("SETTING_ENABLE_VOIP_COMMAND_TIMEOUT_SERVER", true, true);
    }

    /* renamed from: K4 */
    public static String m121111K4() {
        return m122013ia("INFO_PRELOAD_WEB_VIEW_FEATURE", "", true);
    }

    /* renamed from: K5 */
    public static String m121112K5() {
        return m122013ia("SUGGEST_LAST_ITEM_TIMELINE_DATA_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: K6 */
    public static long m121113K6() {
        return m121975ha(m122038j("lastTimeShowUpdateAvatar_%s"), 0L, true);
    }

    /* renamed from: K7 */
    public static int m121114K7() {
        return AbstractC0908e0.m2810d("last_sync_setting_sync_network_condition_" + m121738b1(), 2, true);
    }

    /* renamed from: K8 */
    public static int m121115K8() {
        return m121937ga("MAX_SUPPORT_CLOSE_FRIEND", 6, true);
    }

    /* renamed from: K9 */
    public static boolean m121116K9() {
        return m121899fa("onlyAcceptCheckIpResult" + m121738b1(), false, true);
    }

    /* renamed from: Ka */
    public static int m121117Ka() {
        return m121937ga("QUICK_ACCESS_FILTER_BUTTON_MODE", 9, true);
    }

    /* renamed from: Kb */
    public static int m121118Kb() {
        return m121937ga("SETTING_SHOW_ONLINE_FRIEND_WITH_STATUS", 1, true);
    }

    /* renamed from: Kc */
    public static long m121119Kc() {
        return m121975ha("TSGetSupportCountry" + m121738b1(), 0L, false);
    }

    /* renamed from: Kd */
    public static String m121120Kd() {
        return m122013ia("updateProfileStatus", "", true);
    }

    /* renamed from: Ke */
    public static boolean m121121Ke() {
        return m121899fa("ENABLE_BACKUP_MEDIA", false, true);
    }

    /* renamed from: Kf */
    public static boolean m121122Kf() {
        return m121899fa("FLAG_CONFIG_SHORTCUT_MINI_CHAT", true, true);
    }

    /* renamed from: Kg */
    public static boolean m121123Kg() {
        return m121899fa("SCROLL_INTRO_LOGIN_DONE", false, true);
    }

    /* renamed from: Kh */
    public static void m121124Kh(long j11) {
        m121769bv("AQUERY_TRIGGER_SIZE", j11, true);
    }

    /* renamed from: Ki */
    public static void m121125Ki(long j11) {
        m121769bv("SETTING_MIN_TIME_SUBMTT_LOG", j11, true);
    }

    /* renamed from: Kj */
    public static void m121126Kj(String str) {
        m121806cv(m122038j("DYNAMIC_CALL_ENTRY_POINT_HEADER_CHAT_FOR_SPECIAL%s"), str, true);
    }

    /* renamed from: Kk */
    public static void m121127Kk(boolean z11) {
        m121692Zu("ENABLE_FEATURE_EDIT_FEED", z11, true);
    }

    /* renamed from: Kl */
    public static void m121128Kl(boolean z11) {
        m121692Zu("ENABLE_LOG_NEARBY_LOCATION_INFO", z11, true);
    }

    /* renamed from: Km */
    public static void m121129Km(boolean z11) {
        m121692Zu(m122038j("ENABLE_SETTING_RECOMMEND_SEND_PHOTO_HD_%s"), z11, true);
    }

    /* renamed from: Kn */
    public static void m121130Kn(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_ZANIM_DECODER_SINGLE_INSTANCE", z11, true);
    }

    /* renamed from: Ko */
    public static void m121131Ko(boolean z11) {
        m121692Zu("CONFIG_GROUP_CHAT_SWAP_SHARED_MEDIA_AND_SEARCH", z11, true);
    }

    /* renamed from: Kp */
    public static void m121132Kp(String str) {
        m121806cv("CURRENT_LANGUAGE_SETTING_WITHOUT_USERID", str, true);
    }

    /* renamed from: Kq */
    public static void m121133Kq(long j11) {
        m121769bv("location_filter_time", j11, false);
    }

    /* renamed from: Kr */
    public static void m121134Kr(long j11) {
        m121769bv("TIMESTAMP_GET_FRIEND_SUGGEST_TIMELINE_TAB_LIST_V2" + m121738b1(), j11, false);
    }

    /* renamed from: Ks */
    public static void m121135Ks(String str) {
        m121806cv("Local_backup_Info" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: Kt */
    public static void m121136Kt(long j11) {
        AbstractC0908e0.m2824r("LAST_MOMENT_RESET_TOPIC_THRESHOLD", j11, true, true);
    }

    /* renamed from: Ku */
    public static void m121137Ku(Context context, String str) {
        m121806cv("passcodevalueString", str, false);
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("Zalo", 0).edit();
            edit.remove("passcodevalueString");
            edit.apply();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: Kv */
    public static void m121138Kv(String str) {
        m121806cv("STORY_REACTION_EMOJI_INFO", str, true);
    }

    /* renamed from: Kw */
    public static void m121139Kw(int i11) {
        m121731av(m122038j("SRC_SETTING_PERMISSION_CONTACT_INAPP_%s"), i11, true);
    }

    /* renamed from: Kx */
    public static void m121140Kx(boolean z11) {
        m121692Zu("SUBMIT_ALL_CONTACT", z11, false);
    }

    /* renamed from: Ky */
    public static void m121141Ky(int i11) {
        m121731av("RESET_SOCKET_WHEN_RECV_CALL_FIREBASE", i11, true);
    }

    /* renamed from: Kz */
    public static void m121142Kz(String str) {
        AbstractC0908e0.m2825s(m122038j("USER_SONG_MAPPING_%s"), str, true);
    }

    /* renamed from: L */
    public static int m121143L() {
        String str = "autoUpdatePhonebook" + m121738b1();
        if (AbstractC0908e0.m2817k(str)) {
            return AbstractC0908e0.m2808b(str, false, true) ? 1 : 0;
        }
        return -1;
    }

    /* renamed from: L0 */
    public static int m121144L0() {
        return m121937ga("CONNECT_NOTIF_WWAN_TIME" + m121738b1(), 8, false);
    }

    /* renamed from: L1 */
    public static boolean m121145L1() {
        return AbstractC0908e0.m2808b("ENABLE_ANIM_JUMP_CAMERA_ICON", true, true);
    }

    /* renamed from: L2 */
    public static int m121146L2() {
        return m121937ga("ENABLE_LAST_ACTIVE_NEW_RULE", 0, true);
    }

    /* renamed from: L3 */
    public static boolean m121147L3() {
        return AbstractC0908e0.m2808b("ENABLE_WEBP_ANIMATION", true, true);
    }

    /* renamed from: L4 */
    public static void m121148L4() {
        try {
            AbstractC23304d.f113346X0 = m121666Z4();
            CoreUtility.f89233i = m121738b1();
            CoreUtility.f89232h = m122647zb();
            AbstractC23304d.f113418o0 = 123208;
            AbstractC23304d.f113394i0 = m121634Y9();
            AbstractC23304d.f113414n0 = 123218;
            AbstractC23304d.f113410m0 = m122464ud();
            AbstractC23306f.m120562A().m2562t0(m121106K());
            AbstractC23304d.f113420o2 = m121007Hb();
            AbstractC23304d.f113424p2 = m121044Ib();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: L5 */
    public static long m121149L5() {
        return m121975ha(m122038j("LAST_SUGGEST_CHAT_LIST_ID_%s"), 0L, true);
    }

    /* renamed from: L6 */
    public static long m121150L6() {
        return m121975ha("LAST_TIME_SHOW_WARNING_NOTIF", 0L, true);
    }

    /* renamed from: L7 */
    public static int m121151L7() {
        return m121937ga("LAST_VERSION_CODE", m121079J9(), true);
    }

    /* renamed from: L8 */
    public static int m121152L8() {
        return m121937ga("MAX_SWITCH_ACCOUNT", 5, true);
    }

    /* renamed from: L9 */
    public static int m121153L9() {
        int m121937ga = m121937ga("pageMsgExpiredT", 7200, true);
        if (m121937ga <= 0) {
            return 7200;
        }
        return m121937ga;
    }

    /* renamed from: La */
    public static int m121154La() {
        return m121937ga("QUICK_ACCESS_FILTER_BUTTON_SOURCE", 9, true);
    }

    /* renamed from: Lb */
    public static int m121155Lb() {
        return m121937ga("SETTING_USE_FINGER_PRINT_PASSCODE", 1, true);
    }

    /* renamed from: Lc */
    public static String m121156Lc() {
        return AbstractC0908e0.m2815i(m122038j("TAB_MESSAGE_ADS_DATA%s"), "", true);
    }

    /* renamed from: Ld */
    public static boolean m121157Ld() {
        return m121899fa("uploadAllLogTest" + m121738b1(), false, true);
    }

    /* renamed from: Le */
    public static boolean m121158Le() {
        return m121899fa("cached_location", true, true);
    }

    /* renamed from: Lf */
    public static boolean m121159Lf() {
        return m121899fa("ENABLE_SOCKET_UPLOAD_FOR_VIDEO", true, true);
    }

    /* renamed from: Lg */
    public static boolean m121160Lg() {
        return m121899fa("SERVER_CONFIG_ENABLE_FTS_SEARCH_FEATURE", true, true);
    }

    /* renamed from: Lh */
    public static void m121161Lh(String str) {
        m121806cv("ARRAY_BANNER_HIDE_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: Li */
    public static void m121162Li(String str) {
        m121806cv("CONFIG_MISS_CALL_INFO", str, true);
    }

    /* renamed from: Lj */
    public static void m121163Lj(long j11) {
        m121769bv("EDITOR_FILTER_CATEGORY", j11, true);
    }

    /* renamed from: Lk */
    public static void m121164Lk(boolean z11) {
        m121692Zu("ENABLE_EDIT_PHONE_SWITCH_ACCOUNT", z11, true);
    }

    /* renamed from: Ll */
    public static void m121165Ll(int i11) {
        m121731av(m122038j("ENABLE_LOG_TIMBER_IN_VOIP%s"), i11, true);
    }

    /* renamed from: Lm */
    public static void m121166Lm(boolean z11) {
        m121692Zu("ENABLE_SHARE_PHONE_NUMBER", z11, false);
    }

    /* renamed from: Ln */
    public static void m121167Ln(boolean z11) {
        m121692Zu("FLAG_ENABLE_ZBROWSER", z11, true);
    }

    /* renamed from: Lo */
    public static void m121168Lo(String str) {
        AbstractC0908e0.m2825s(m122038j("GROUP_INVITATION_BOX_INFO%s"), str, true);
    }

    /* renamed from: Lp */
    public static void m121169Lp(long j11) {
        m121769bv("LAST_ACTION_ID_GET_BROADCAST_HTTP_" + m121738b1(), j11, true);
    }

    /* renamed from: Lq */
    public static void m121170Lq(long j11) {
        m121769bv("LASTTIME_TO_GET_SETTING_MAPPING_KWD", j11, true);
    }

    /* renamed from: Lr */
    public static void m121171Lr(long j11) {
        m121769bv("timestampGetGroupList", j11, false);
    }

    /* renamed from: Ls */
    public static void m121172Ls(boolean z11) {
        m121692Zu("LOCK_SOCKET_FOR_SHOW_RESTORE_CHAT_DB_" + m121738b1(), z11, true);
    }

    /* renamed from: Lt */
    public static void m121173Lt(String str) {
        m121806cv("MULTI_PHOTO_SUGGESTION_SETTING", str, true);
    }

    /* renamed from: Lu */
    public static void m121174Lu(String str) {
        m121806cv("PASSWORD_RULE_CONFIG", str, true);
    }

    /* renamed from: Lv */
    public static void m121175Lv(String str) {
        m121806cv("REACTION_MSG_TYPE", str, true);
    }

    /* renamed from: Lw */
    public static void m121176Lw(String str) {
        m121806cv(m122038j("SETTING_PRIVACY_NOTI_FEED_%s"), str, false);
        AbstractC26084s.m134257e(2, "setting_14", true);
    }

    /* renamed from: Lx */
    public static void m121177Lx(boolean z11) {
        m121692Zu("SubmitLocation", z11, true);
    }

    /* renamed from: Ly */
    public static void m121178Ly(long j11) {
        m121769bv("timestampGetListFollow", j11, false);
    }

    /* renamed from: Lz */
    public static void m121179Lz(String str) {
        AbstractC0908e0.m2825s(m122038j("VERIFY_ACCOUNT_WITH_IDENTIFY_CARD_%s"), str, true);
    }

    /* renamed from: M */
    public static long m121180M() {
        return m121975ha("BACKUP_CHAT_DB_FILE_SIZE_LIMIT", 78643200L, true);
    }

    /* renamed from: M0 */
    public static int m121181M0() {
        return m121937ga("CONNECT_NOTIF_WIFI_TIME" + m121738b1(), 5, false);
    }

    /* renamed from: M1 */
    public static boolean m121182M1() {
        return m121899fa("ANIMATION_TRENDING_EVENT_" + CoreUtility.f89233i, true, true);
    }

    /* renamed from: M2 */
    public static boolean m121183M2() {
        return m121899fa("ENABLE_LIVE_EMOJI_V2", true, true);
    }

    /* renamed from: M3 */
    public static boolean m121184M3() {
        return AbstractC0908e0.m2808b("ENABLE_ZANIM_DECODER_SINGLE_INSTANCE", true, true);
    }

    /* renamed from: M4 */
    public static String m121185M4(String str, int i11) {
        return m122013ia("UNREAD_FEATURE_ID_" + i11 + "_UID_" + str, "", true);
    }

    /* renamed from: M5 */
    public static long m121186M5() {
        return m121975ha("LAST_TIME_ANIMATION_ERROR", 0L, true);
    }

    /* renamed from: M6 */
    public static long m121187M6() {
        return m121975ha("LAST_TIME_SUBMIT_EXTRA_CONTACT", 0L, true);
    }

    /* renamed from: M7 */
    public static String m121188M7() {
        return AbstractC0908e0.m2815i("LIBRARIES_INFO_JSON", "", false);
    }

    /* renamed from: M8 */
    public static int m121189M8() {
        return m121937ga("MAX_SYNC_CONTACT_REMOVE_FRIEND_", 10, false);
    }

    /* renamed from: M9 */
    public static int m121190M9() {
        return m121937ga("PARSE_LINK_MAX_LIMIT", ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, true);
    }

    /* renamed from: Ma */
    public static String m121191Ma() {
        return AbstractC0908e0.m2815i("QUICK_COMMENT_CONFIG", "", true);
    }

    /* renamed from: Mb */
    public static int m121192Mb() {
        return m121937ga(m122038j("SETTING_USE_FINGER_PRINT_PASSCODE_USER_SETTING_%s"), 1, true);
    }

    /* renamed from: Mc */
    public static long m121193Mc() {
        return AbstractC0908e0.m2813g(m122038j("TAB_MESSAGE_ADS_LAST_TIME_REQUEST%s"), 0L, true);
    }

    /* renamed from: Md */
    public static String m121194Md() {
        return m122013ia("UPLOAD_CONFIG_SERVER", "", true);
    }

    /* renamed from: Me */
    public static int m121195Me() {
        return m121937ga(m122038j("ENABLE_CALL_BACK_CHAT_LIST_%s"), 1, true);
    }

    /* renamed from: Mf */
    public static boolean m121196Mf() {
        return m121899fa("ENABLE_STORY_BACKGROUND_STATUS", true, true);
    }

    /* renamed from: Mg */
    public static boolean m121197Mg() {
        return m121899fa("SERVER_ENABLE_SEASONAL_STICKER", true, true);
    }

    /* renamed from: Mh */
    public static void m121198Mh(String str) {
        m121806cv("ARRAY_RECENT_BG_FEED_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: Mi */
    public static void m121199Mi(int i11) {
        m121731av("CONFIG_NETWORK_PRE_DOWNLOAD_CHAT_CONTENT_FILE", i11, true);
    }

    /* renamed from: Mj */
    public static void m121200Mj(int i11) {
        m121731av("emei_state", i11, true);
    }

    /* renamed from: Mk */
    public static void m121201Mk(boolean z11) {
        m121692Zu("ENABLE_ENCRYPT_HTTP_PARAMS", z11, true);
    }

    /* renamed from: Ml */
    public static void m121202Ml(boolean z11) {
        m121692Zu("ENABLE_MANAGE_OA_EVENT", z11, true);
    }

    /* renamed from: Mm */
    public static void m121203Mm(boolean z11) {
        m121692Zu("FLAG_CONFIG_SHORTCUT_MINI_CHAT", z11, true);
    }

    /* renamed from: Mn */
    public static void m121204Mn(boolean z11) {
        m121692Zu("enable_zam", z11, true);
    }

    /* renamed from: Mo */
    public static void m121205Mo(int i11) {
        m121731av(m122038j("GROUP_LIST_SORT_BY_%s"), i11, true);
    }

    /* renamed from: Mp */
    public static void m121206Mp(String str) {
        m121806cv("LAST_BG_SELECTED_ID_NEW" + m121738b1(), str, true);
    }

    /* renamed from: Mq */
    public static void m121207Mq(long j11) {
        m121769bv(m122038j("LAST_TIME_GET_MEMORY_ENTRY_TIMELINE_%s"), j11, true);
    }

    /* renamed from: Mr */
    public static void m121208Mr(long j11) {
        m121769bv("timestampGetInfoUpdate", j11, false);
    }

    /* renamed from: Ms */
    public static void m121209Ms(boolean z11) {
        m121692Zu("LOGIN_NEW_DEVICE_FLAG" + m121738b1(), z11, true);
    }

    /* renamed from: Mt */
    public static void m121210Mt(int i11) {
        m121731av("SET_MUST_PICK_COUNTRY_CODE", i11, true);
    }

    /* renamed from: Mu */
    public static void m121211Mu(int i11) {
        AbstractC0908e0.m2820n("sync_pc_request_timeout", i11, true);
    }

    /* renamed from: Mv */
    public static void m121212Mv(int i11) {
        m121731av(m122038j("RECOMMEND_SEND_PHOTO_HD_COUNT_%s"), i11, true);
    }

    /* renamed from: Mw */
    public static void m121213Mw(String str) {
        m121806cv(m122038j("SETTING_PRIVACY_NOTI_STORY_%s"), str, false);
        AbstractC26084s.m134257e(2, "setting_16", true);
    }

    /* renamed from: Mx */
    public static void m121214Mx(EnumC8996x enumC8996x) {
        m121731av("SUBMIT_LOCATION_SOURCE", enumC8996x.m48093d(), true);
    }

    /* renamed from: My */
    public static void m121215My(long j11) {
        m121769bv("TSmsgOfflineHttp" + m121738b1(), j11, true);
    }

    /* renamed from: Mz */
    public static void m121216Mz(String str) {
        m121806cv("SAVE_VERSION_CODE", str, true);
    }

    /* renamed from: N */
    public static int m121217N() {
        return m121937ga("BIT_RATE_VOICE_MSG", 64000, true);
    }

    /* renamed from: N0 */
    public static String m121218N0() {
        return m122013ia("CONNECTION_CONFIG", "", true);
    }

    /* renamed from: N1 */
    public static boolean m121219N1() {
        return m121899fa("ENABLE_ASSIGN_OWNER", true, false);
    }

    /* renamed from: N2 */
    public static boolean m121220N2() {
        int m121937ga = m121937ga(m122038j("ENABLE_LIVE_EMOJI_ALL_CONVERSATIONS_%s"), -1, true);
        if (m121937ga == -1) {
            m120943Fl(m121257O2());
        }
        if (m121937ga == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: N3 */
    public static boolean m121221N3() {
        return m121899fa("ENABLE_ATTACH_FOOTER_REMINDER_FROM_MESSAGE", false, true);
    }

    /* renamed from: N4 */
    public static int m121222N4() {
        return m121937ga("INIT_CONTACT_NATIVE_SYNC", -1, true);
    }

    /* renamed from: N5 */
    public static long m121223N5() {
        return m121975ha("LAST_TIME_APP_ALIVE", 0L, false);
    }

    /* renamed from: N6 */
    public static long m121224N6() {
        return m121975ha("LAST_TIME_TIME_SUBMIT_TIME_ON_APP", 0L, true);
    }

    /* renamed from: N7 */
    public static int m121225N7() {
        return m121937ga("BACKUP_MEDIA_LIMIT_TIME_DAY", 30, true);
    }

    /* renamed from: N8 */
    public static long m121226N8() {
        return m121975ha("MAX_TIME_DELETE_FOR_ADMIN", 1800L, true);
    }

    /* renamed from: N9 */
    public static int m121227N9() {
        return m121937ga("PARSE_LINK_PREVIEW_CONFIG", 2, true);
    }

    /* renamed from: Na */
    public static String m121228Na() {
        return m122013ia("QUICK_REACT_NOTIF_SETTING", "", true);
    }

    /* renamed from: Nb */
    public static int m121229Nb() {
        return m121937ga(m122038j("SETTING_VIDEO_AUTO_PLAY_%s"), 2, false);
    }

    /* renamed from: Nc */
    public static String m121230Nc() {
        return AbstractC0908e0.m2815i(m122038j("TAB_MESSAGE_ADS_REMOVED_ITEMS%s"), "", true);
    }

    /* renamed from: Nd */
    public static int m121231Nd() {
        return m121937ga("LIMIT_UPLOAD_FILE_SIZE", 50, true);
    }

    /* renamed from: Ne */
    public static boolean m121232Ne() {
        return m121899fa("CAMERA_LIVE_PREVIEW", false, true);
    }

    /* renamed from: Nf */
    public static boolean m121233Nf() {
        return m121899fa("ENABLE_STORY_POULATE_MINICHAT", true, true);
    }

    /* renamed from: Ng */
    public static boolean m121234Ng() {
        return m121899fa("enable_suggest_sticker", true, true);
    }

    /* renamed from: Nh */
    public static void m121235Nh(boolean z11) {
        m121692Zu("ASK_USER_UPDATE_PHONEBOOK_" + m121738b1(), z11, true);
    }

    /* renamed from: Ni */
    public static void m121236Ni(int i11) {
        m121731av("SETTING_NUMBERLOG_SUBMIT", i11, true);
    }

    /* renamed from: Nj */
    public static void m121237Nj(String str) {
        m121806cv("EMOTICON_EFFECT", str, true);
    }

    /* renamed from: Nk */
    public static void m121238Nk(int i11) {
        m121731av("ENABLE_ENTRY_CALL_GLOBAL_SEARCH", i11, true);
    }

    /* renamed from: Nl */
    public static void m121239Nl(boolean z11) {
        m121692Zu("ENABLE_MAP_VIEW_OVERLAY", z11, true);
    }

    /* renamed from: Nm */
    public static void m121240Nm(int i11) {
        m121731av("ENABLE_SHOW_PREVIEW_PICTURE_NOTI", i11, false);
    }

    /* renamed from: Nn */
    public static void m121241Nn(boolean z11) {
        m121692Zu("enable_zam_upload", z11, true);
    }

    /* renamed from: No */
    public static void m121242No(String str) {
        m121806cv("GROUP_SETTING", str, true);
    }

    /* renamed from: Np */
    public static void m121243Np(String str) {
        m121806cv("LAST_BUILD_ID", str, true);
    }

    /* renamed from: Nq */
    public static void m121244Nq(long j11) {
        m121769bv("TimeToGetNewDefaultSticker", j11, true);
    }

    /* renamed from: Nr */
    public static void m121245Nr(long j11) {
        m121769bv("TIMESTAMP_GET_LAST_SUGGEST_ITEM_TIMELINE" + m121738b1(), j11, false);
    }

    /* renamed from: Ns */
    public static void m121246Ns(String str) {
        m121806cv("LONG_LAT_VALUE_DEVICE_INFO", str, true);
    }

    /* renamed from: Nt */
    public static void m121247Nt(int i11) {
        f113486e = i11;
        AbstractC0908e0.m2820n("MUTE_ICON_SEARCH_HIDDEN_CHAT", i11, true);
    }

    /* renamed from: Nu */
    public static void m121248Nu(int i11) {
        m121731av("percentFailToUploadResult" + m121738b1(), i11, true);
    }

    /* renamed from: Nv */
    public static void m121249Nv(int i11) {
        m121731av(m122038j("RECOMMEND_SEND_PHOTO_HD_COUNT_CURRENT_%s"), i11, true);
    }

    /* renamed from: Nw */
    public static void m121250Nw(int i11) {
        m121731av("SETTING_SHOW_BIG_PHOTO_IN_NOTIFICATION_", i11, true);
    }

    /* renamed from: Nx */
    public static void m121251Nx(String str) {
        m121806cv("SUGGEST_FRIEND_MSG_TAB_DATA_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: Ny */
    public static void m121252Ny(long j11) {
        m121769bv(m122038j("timestampInterValGetFavoriteFriend_%s"), j11, true);
    }

    /* renamed from: Nz */
    public static void m121253Nz(boolean z11) {
        m121692Zu("SaveVibrationSetting" + m121738b1(), z11, true);
    }

    /* renamed from: O */
    public static int m121254O() {
        return m121937ga("BOTTOM_BANNER_PERMISSION_CONTACT_LIST_HEIGHT", 0, true);
    }

    /* renamed from: O0 */
    public static int m121255O0() {
        return m121937ga("CONNECTION_PING_FOREGROUND_INTERVAL_" + m121738b1(), 60000, true);
    }

    /* renamed from: O1 */
    public static int m121256O1() {
        return m121937ga(m122038j("ENABLE_SETTING_ALLOW_ADD_FRIEND_PHONEBOOK_%s"), 0, true);
    }

    /* renamed from: O2 */
    public static boolean m121257O2() {
        return m121899fa("ENABLE_LIVE_EMOJI_CONVERSATION", false, true);
    }

    /* renamed from: O3 */
    public static boolean m121258O3() {
        return m121899fa("ENABLE_REMINDER_FROM_MESSAGE", false, true);
    }

    /* renamed from: O4 */
    public static int m121259O4() {
        if (f113484c == -2) {
            f113484c = m121222N4();
        }
        return f113484c;
    }

    /* renamed from: O5 */
    public static long m121260O5() {
        return m121975ha("SaveLastTimeAutoLogin", 0L, true);
    }

    /* renamed from: O6 */
    public static long m121261O6() {
        return m121975ha(m122038j("LAST_TIME_SUBMIT_PHONEBOOK_DISPLAY_%s"), m122353rd(), true);
    }

    /* renamed from: O7 */
    public static int m121262O7() {
        return AbstractC0908e0.m2810d("LIMIT_MEMBER_IN_GROUP_CALL", 10, true);
    }

    /* renamed from: O8 */
    public static long m121263O8() {
        return m121975ha("MAX_TIME_DELETE_FOR_EVERYONE", 1800L, true);
    }

    /* renamed from: O9 */
    public static int m121264O9() {
        return m121937ga("PARSE_PHONE_NUM_MAX_LIMIT", 100, true);
    }

    /* renamed from: Oa */
    public static int m121265Oa() {
        return m121937ga("QuickStickerDownloadSetting", 1, true);
    }

    /* renamed from: Ob */
    public static int m121266Ob() {
        return m121937ga("SETTING_ZALO_PAGE", 0, true);
    }

    /* renamed from: Oc */
    public static String m121267Oc() {
        return AbstractC0908e0.m2815i("TENOR_STICKER_MAP_DATA", "", false);
    }

    /* renamed from: Od */
    public static boolean m121268Od() {
        return m121899fa("uploadIfFailSameNetwork" + m121738b1(), true, true);
    }

    /* renamed from: Oe */
    public static boolean m121269Oe() {
        return m121899fa("CAPTURE_IMAGE_BY_BUTTON_VOLUME", true, true);
    }

    /* renamed from: Of */
    public static boolean m121270Of() {
        return m121899fa("ENABLE_SUGGEST_ACTION", true, true);
    }

    /* renamed from: Og */
    public static boolean m121271Og() {
        return m121899fa(m122038j("SHOW_FIND_FRIEND_NATIVE_TAB_MESSSAGE_%s"), true, true);
    }

    /* renamed from: Oh */
    public static void m121272Oh(int i11) {
        m121731av("AUTO_OPEN_CONNECTION_UPLOAD_CHAT_PHOTO", i11, true);
    }

    /* renamed from: Oi */
    public static void m121273Oi(String str) {
        m121806cv(m122038j("CONFIG_POST_FEED_%s"), str, true);
    }

    /* renamed from: Oj */
    public static void m121274Oj(String str) {
        m121806cv("EMOTICON_EFFECT_CONFIG", str, true);
    }

    /* renamed from: Ok */
    public static void m121275Ok(int i11) {
        m121731av("ENABLE_ENTRY_CALL_PROFILE", i11, true);
    }

    /* renamed from: Ol */
    public static void m121276Ol(boolean z11) {
        m121692Zu("ENABLE_MAP_VIEW_PICKER", z11, true);
    }

    /* renamed from: Om */
    public static void m121277Om(int i11) {
        m121731av("ENABLE_SHOW_PREVIEW_STICKER_NOTI", i11, false);
    }

    /* renamed from: On */
    public static void m121278On(boolean z11) {
        m121692Zu("ENABLE_ATTACH_FOOTER_REMINDER_FROM_MESSAGE", z11, true);
    }

    /* renamed from: Oo */
    public static void m121279Oo(String str) {
        m121806cv("GROUP_TAB_DATA_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: Op */
    public static void m121280Op(String str) {
        m121806cv("LAST_COPIED_LINK_CLIPBOARD_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: Oq */
    public static void m121281Oq(long j11) {
        m121769bv("LAST_TIME_GET_NONE_FRIEND_SYNC", j11, true);
    }

    /* renamed from: Or */
    public static void m121282Or(long j11) {
        m121769bv("LAST_TIMESTAMP_GET_SUGGEST_CHAT", j11, false);
    }

    /* renamed from: Os */
    public static void m121283Os(String str) {
        m121806cv("MAJOR_COUNTRY_LIST", str, true);
    }

    /* renamed from: Ot */
    public static void m121284Ot(String str) {
        m121806cv(m122038j("mutual_ids_noti_list_%s"), str, false);
    }

    /* renamed from: Ou */
    public static void m121285Ou(boolean z11) {
        m121692Zu("PERMISSION_MONITOR", z11, true);
    }

    /* renamed from: Ov */
    public static void m121286Ov(int i11) {
        m121731av("REFRESH_GROUP_INFO_INTERVAL", i11, true);
    }

    /* renamed from: Ow */
    public static void m121287Ow(int i11) {
        m121731av(m122038j("SETTING_SHOW_HIDE_ONLINE_FRIEND_%s"), i11, true);
        AbstractC26084s.m134257e(2, "setting_priv_15", true);
    }

    /* renamed from: Ox */
    public static void m121288Ox(String str) {
        m121806cv("SUGGEST_FRIEND_TIMELINE_FEEDS_CONFIG_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: Oy */
    public static void m121289Oy(long j11) {
        m121769bv(m122038j("TIMESTAMP_SEE_LAYOUT_GUIDE_ONLINE_LIST_%s"), j11, true);
    }

    /* renamed from: Oz */
    public static void m121290Oz(boolean z11) {
        m121692Zu("SAVE_VIBRATION_SETTING_LOCAL", z11, true);
    }

    /* renamed from: P */
    public static String m121291P() {
        return m122013ia("CACHE_BACKUP_INFO_FROM_SERVER_" + m121738b1(), "", true);
    }

    /* renamed from: P0 */
    public static boolean m121292P0() {
        return m121899fa("CONNECTION_PING_PARALLEL_OLD_RULE_" + m121738b1(), false, true);
    }

    /* renamed from: P1 */
    public static boolean m121293P1() {
        return m121899fa("AUTO_APPLIED_RANDOM_TYPO", true, true);
    }

    /* renamed from: P2 */
    public static boolean m121294P2() {
        return m121899fa("ENABLE_LIVE_EMOJI_IN_CHAT_HEAD", false, true);
    }

    /* renamed from: P3 */
    public static String m121295P3() {
        return m122013ia("SETTING_ENTRY_RIGHT_MENU", "", true);
    }

    /* renamed from: P4 */
    public static String m121296P4() {
        return m122013ia("ZALO-INSTALLATION-UNIQUE-ID-" + m121738b1(), "", true);
    }

    /* renamed from: P5 */
    public static long m121297P5() {
        return m121975ha("BACKUP_DB_TO_LOCAL_WITH_USERID_IS_" + CoreUtility.f89233i, 0L, true);
    }

    /* renamed from: P6 */
    public static long m121298P6() {
        return AbstractC0908e0.m2813g("last_time_sync_setting_sync_mes_networ_" + m121738b1(), 0L, true);
    }

    /* renamed from: P7 */
    public static int m121299P7() {
        return AbstractC0908e0.m2810d("LIMIT_MEMBER_IN_GROUP_TO_ENABLE_ENTRY_POINT_GROUP_CALL", 100, true);
    }

    /* renamed from: P8 */
    public static String m121300P8() {
        return m122013ia("MEDIA_GROUP_INFO_CONFIG", "", true);
    }

    /* renamed from: P9 */
    public static int m121301P9() {
        return m121937ga("PARSE_PHONE_PREVIEW_CONFIG", 2, true);
    }

    /* renamed from: Pa */
    public static long m121302Pa() {
        return m121975ha("RANGE_CHECK_SHOW_CREATE_CALL_SHORTCUT_" + m121738b1(), 604800000L, true);
    }

    /* renamed from: Pb */
    public static String m121303Pb() {
        return m122013ia("SUGGEST_CHAT_FUNCTION", "", true);
    }

    /* renamed from: Pc */
    public static long m121304Pc() {
        return m121975ha("TIME_BUBBLE_CALL_NATIVE" + CoreUtility.f89233i, 0L, true);
    }

    /* renamed from: Pd */
    public static boolean m121305Pd() {
        return m121899fa("useSuggestStickerOnFeed" + m121738b1(), true, true);
    }

    /* renamed from: Pe */
    public static boolean m121306Pe() {
        return m121899fa("sticker_lua_enable_checksum", true, true);
    }

    /* renamed from: Pf */
    public static boolean m121307Pf() {
        return m121899fa("ENABLE_SUGGEST_LOCATION", true, true);
    }

    /* renamed from: Pg */
    public static boolean m121308Pg() {
        return AbstractC0908e0.m2808b("PRIVACY_SETTINGS_SHOW_ONLINE_STATUS_" + m121738b1(), true, true);
    }

    /* renamed from: Ph */
    public static void m121309Ph(boolean z11) {
        m121692Zu("AUTO_MESSAGE_PARSE_BACKGROUND", z11, true);
    }

    /* renamed from: Pi */
    public static void m121310Pi(boolean z11) {
        m121692Zu("CONFIG_SHOW_CONTACT_PERMISSION", z11, true);
    }

    /* renamed from: Pj */
    public static void m121311Pj(String str) {
        m121806cv("emptyRes", str, false);
    }

    /* renamed from: Pk */
    public static void m121312Pk(int i11) {
        m121731av("ENABLE_EXPAND_NOTI_MEDIA", i11, false);
    }

    /* renamed from: Pl */
    public static void m121313Pl(int i11) {
        m121731av("ENABLE_MEDIA_STORE_SEARCH_V2", i11, true);
    }

    /* renamed from: Pm */
    public static void m121314Pm(int i11) {
        m121731av("ENABLE_SHOW_PREVIEW_VIDEO_NOTI", i11, false);
    }

    /* renamed from: Pn */
    public static void m121315Pn(boolean z11) {
        m121692Zu("ENABLE_REMINDER_FROM_MESSAGE", z11, true);
    }

    /* renamed from: Po */
    public static void m121316Po(int i11) {
        m121731av("SETTING_GROUP_VOIP_TIME_OUT", i11, true);
    }

    /* renamed from: Pp */
    public static void m121317Pp(long j11) {
        m121769bv("LAST_COPIED_URL_TIMESTAMP_FOR_SUGGEST_LINK_FROM_O", j11, true);
    }

    /* renamed from: Pq */
    public static void m121318Pq(long j11) {
        m121769bv("TimeToGetQuickSticker", j11, true);
    }

    /* renamed from: Pr */
    public static void m121319Pr(long j11) {
        m121769bv("LAST_TIMESTAMP_SUBMIT_FCM", j11, true);
    }

    /* renamed from: Ps */
    public static void m121320Ps(String str) {
        AbstractC0908e0.m2825s("MALICIOUS_MIME_TYPE", str, true);
    }

    /* renamed from: Pt */
    public static void m121321Pt(boolean z11) {
        m121692Zu("NATIVE_LOADER_ENABLE", z11, true);
    }

    /* renamed from: Pu */
    public static void m121322Pu(String str, int i11) {
        m121731av("permission_" + str, i11, true);
    }

    /* renamed from: Pv */
    public static void m121323Pv(String str) {
        m121806cv("REGISTER_DPN", str, true);
    }

    /* renamed from: Pw */
    public static void m121324Pw(int i11) {
        m121731av(m122038j("SETTING_SHOW_LESS_SHORT_RECENT_UPDATE_%s"), i11, true);
    }

    /* renamed from: Px */
    public static void m121325Px(String str) {
        m121806cv("SUGGEST_FRIEND_TIMELINE_TAB_DATA_CONFIG_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: Py */
    public static void m121326Py(long j11) {
        m121769bv("TSSubmitphone" + m121738b1(), j11, true);
    }

    /* renamed from: Pz */
    public static void m121327Pz(boolean z11) {
        m121692Zu("VIDEO_GIF_ENABLE", z11, true);
    }

    /* renamed from: Q */
    public static int m121328Q() {
        return m121937ga("CALENDAR_SHOW_RANGE", 2, true);
    }

    /* renamed from: Q0 */
    public static int m121329Q0() {
        return m121937ga(m122038j("COUNT_FAIL_UPDATE_CURRENT_USER_INFO_%s"), 0, true);
    }

    /* renamed from: Q1 */
    public static boolean m121330Q1() {
        return m121899fa("enableAutoCheckNetwork" + m121738b1(), true, true);
    }

    /* renamed from: Q2 */
    public static boolean m121331Q2() {
        return m121899fa("ENABLE_LOCATION_PICKER_FROM_ACTION_LIST", true, true);
    }

    /* renamed from: Q3 */
    public static long m121332Q3() {
        return m121975ha("EXPIRE_DURATION_SYNC_CALENDAR_EVENT", 604800L, false);
    }

    /* renamed from: Q4 */
    public static long m121333Q4() {
        return m121975ha("intervalGetGroupList", 21600000L, false);
    }

    /* renamed from: Q5 */
    public static long m121334Q5() {
        return m121975ha("LAST_TIME_CHECK_EXPIRE_NOTI_SOCIAL" + m121738b1(), 0L, true);
    }

    /* renamed from: Q6 */
    public static long m121335Q6() {
        return m121975ha(m122038j("LASTTIME_SUBMIT_VALUE_PERMISSION_CONTACT_INAPP_%s"), 0L, true);
    }

    /* renamed from: Q7 */
    public static int m121336Q7() {
        return m121937ga("LIMIT_SELECTED_FILE_COUNT", Integer.MAX_VALUE, true);
    }

    /* renamed from: Q8 */
    public static long m121337Q8() {
        return m121975ha("media_search_expired_ts", 0L, true);
    }

    /* renamed from: Q9 */
    public static String m121338Q9() {
        return m122013ia("passcodevalueString", "", false);
    }

    /* renamed from: Qa */
    public static String m121339Qa() {
        return m122013ia("REACTION_MSG_TYPE", "[{\"rType\":0,\"rIcon\":\":>\"},{\"rType\":1,\"rIcon\":\"--b\"},{\"rType\":2,\"rIcon\":\":-((\"},{\"rType\":3,\"rIcon\":\"\\/-strong\"},{\"rType\":4,\"rIcon\":\"\\/-weak\"},{\"rType\":5,\"rIcon\":\"\\/-heart\"}]", true);
    }

    /* renamed from: Qb */
    public static boolean m121340Qb() {
        return m121899fa("SHOULD_SHOW_PERMISSION_BOTTOM_BANNER_" + m121738b1(), false, true);
    }

    /* renamed from: Qc */
    public static long m121341Qc() {
        return AbstractC0908e0.m2814h(m122038j("TIME_CLEAR_HINT_FRIEND_REQUEST_%s"), 259200000L, true, true);
    }

    /* renamed from: Qd */
    public static boolean m121342Qd() {
        return m121899fa("SETTING_SHOW_MISS_CALL_POPUP", true, true);
    }

    /* renamed from: Qe */
    public static boolean m121343Qe() {
        return m121899fa("ENABLE_EDIT_PHONE_SWITCH_ACCOUNT", false, true);
    }

    /* renamed from: Qf */
    public static boolean m121344Qf() {
        return m121899fa("setting_suggest_maybe_you_now" + m121738b1(), true, true);
    }

    /* renamed from: Qg */
    public static boolean m121345Qg() {
        return m121899fa(m122038j("MENU_SUGGEST_CHAT_MSG_TAB_%s"), true, true);
    }

    /* renamed from: Qh */
    public static void m121346Qh(boolean z11) {
        m121692Zu(m122038j("AUTO_PLAY_MY_PROFILE_MUSIC_%s"), z11, true);
    }

    /* renamed from: Qi */
    public static void m121347Qi(int i11) {
        m121731av("CONFIG_STORY_BAR_POSITION", i11, true);
    }

    /* renamed from: Qj */
    public static void m121348Qj(long j11) {
        m121769bv("emptyResTimestamp", j11, false);
    }

    /* renamed from: Qk */
    public static void m121349Qk(int i11) {
        m121731av("ENABLE_EXPAND_NOTIFICATION", i11, true);
    }

    /* renamed from: Ql */
    public static void m121350Ql(boolean z11) {
        m121692Zu("ENABLE_MENTION_ALL", z11, false);
    }

    /* renamed from: Qm */
    public static void m121351Qm(boolean z11) {
        m121692Zu("ENABLE_SOCKET_UPLOAD_FOR_VIDEO", z11, true);
    }

    /* renamed from: Qn */
    public static void m121352Qn(String str) {
        m121806cv("SETTING_ENTRY_RIGHT_MENU", str, true);
    }

    /* renamed from: Qo */
    public static void m121353Qo(String str) {
        m121806cv("STRING_GROUP_WELCOME_MEMBER_SETTING", str, true);
    }

    /* renamed from: Qp */
    public static void m121354Qp(String str) {
        m121806cv("LAST_REMIND_LINK", str, true);
    }

    /* renamed from: Qq */
    public static void m121355Qq(long j11) {
        m121769bv("LAST_TIME_GET_STICKER_CATE", j11, true);
    }

    /* renamed from: Qr */
    public static void m121356Qr(long j11) {
        m121769bv("LAST_TIMESTAMP_SUBMIT_HUAWEI_TOKEN", j11, true);
    }

    /* renamed from: Qs */
    public static void m121357Qs(String str) {
        m121806cv("MAP_VIEW_OVERLAY_DATA", str, true);
    }

    /* renamed from: Qt */
    public static void m121358Qt(boolean z11) {
        AbstractC0908e0.m2818l("need_clear_drive_sync_cache", z11, true);
    }

    /* renamed from: Qu */
    public static void m121359Qu(String str) {
        m121806cv("PHONE_CONTACT_ISO_COUNTRY_CODES", str, true);
    }

    /* renamed from: Qv */
    public static void m121360Qv(String str) {
        m121806cv(m122038j("REMIND_CONTACT_SUBMISSION_%s"), str, false);
    }

    /* renamed from: Qw */
    public static void m121361Qw(boolean z11) {
        m121692Zu("SHOW_LIKE_COMMENT_PROFILE", z11, true);
    }

    /* renamed from: Qx */
    public static void m121362Qx(String str) {
        AbstractC0908e0.m2826t("suggest_sticker_keywords_v2", str, false, true);
    }

    /* renamed from: Qy */
    public static void m121363Qy(long j11) {
        m121769bv(m122038j("TsUpdatePhonebook_%s"), j11, false);
    }

    /* renamed from: Qz */
    public static void m121364Qz(boolean z11) {
        m121692Zu("VIDEO_GIF_HIGH_QUALITY", z11, true);
    }

    /* renamed from: R */
    public static int m121365R() {
        return m121937ga("ENABLE_CALLSHORTCUT_FEATURE_" + m121738b1(), 0, true);
    }

    /* renamed from: R0 */
    public static int m121366R0() {
        return m121937ga("COUNT_GET_ZFRIEND_UPDATE", 0, true);
    }

    /* renamed from: R1 */
    public static boolean m121367R1() {
        return m121899fa("ENABLE_AUTO_GET_TIMELINE_EXPIRED", false, true);
    }

    /* renamed from: R2 */
    public static boolean m121368R2() {
        return m121899fa("ENABLE_LOG_NEARBY_LOCATION_INFO", false, true);
    }

    /* renamed from: R3 */
    public static long m121369R3() {
        return m121975ha("EXPIRE_TIME_CHECK_CATE_PROMOTE_BG", 0L, true);
    }

    /* renamed from: R4 */
    public static long m121370R4() {
        return m121975ha("INTERVAL_REGISTER_SEEN_LAST_ACTIVE", 0L, true);
    }

    /* renamed from: R5 */
    public static long m121371R5() {
        return m121975ha("lastTimeCheckNetwork" + m121738b1(), 0L, true);
    }

    /* renamed from: R6 */
    public static long m121372R6() {
        return m121975ha(m122038j("LASTTIME_SUBMIT_VALUE_PERMISSION_CONTACT_SYSTEM_%s"), 0L, true);
    }

    /* renamed from: R7 */
    public static int m121373R7() {
        return m121937ga("SETTING_LIMIT_SIZE_STORAGE_FOR_ZINSTANT_CACHE", C17171o0.f87721d, true);
    }

    /* renamed from: R8 */
    public static int m121374R8() {
        return m121937ga("SETTING_MEDIA_STORE_MEDIA_LAYOUT_MODE", EnumC2381y.f9940q.ordinal(), true);
    }

    /* renamed from: R9 */
    public static String m121375R9(Context context) {
        return context.getSharedPreferences("Zalo", 0).getString("passcodevalueString", "");
    }

    /* renamed from: Ra */
    public static int m121376Ra() {
        return m121937ga(m122038j("RECOMMEND_SEND_PHOTO_HD_COUNT_%s"), 3, true);
    }

    /* renamed from: Rb */
    public static int m121377Rb() {
        return m121937ga("SETTING_BUBBLE_CALL_NATIVE" + CoreUtility.f89233i, 0, true);
    }

    /* renamed from: Rc */
    public static long m121378Rc() {
        return m121975ha(m122038j("TIME_CLEAR_SUGGEST_FRIEND_%s"), 604800000L, true);
    }

    /* renamed from: Rd */
    public static int m121379Rd() {
        return m121937ga("USE_NEW_RULE_PARSE_EMO", 1, true);
    }

    /* renamed from: Re */
    public static boolean m121380Re() {
        return m121899fa("ENABLE_ENCRYPT_HTTP_PARAMS", true, true);
    }

    /* renamed from: Rf */
    public static boolean m121381Rf() {
        return m121899fa("ENABLE_SUGGEST_PROMOTION", true, true);
    }

    /* renamed from: Rg */
    public static boolean m121382Rg() {
        AbstractC26683d.m137045e();
        if (AbstractC26684e.f126409b && m121787cc() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: Rh */
    public static void m121383Rh(boolean z11) {
        m121692Zu(m122038j("AUTO_PLAY_USER_PROFILE_MUSIC_%s"), z11, true);
    }

    /* renamed from: Ri */
    public static void m121384Ri(int i11) {
        m121731av("CONFIG_STORY_THUMB_SHAPE", i11, true);
    }

    /* renamed from: Rj */
    public static void m121385Rj(boolean z11) {
        m121692Zu("ENABLE_AQUERY_SHRINK_CACHE", z11, true);
    }

    /* renamed from: Rk */
    public static void m121386Rk(boolean z11) {
        m121692Zu("ENABLE_EXTEND_PROFILE", z11, true);
    }

    /* renamed from: Rl */
    public static void m121387Rl(boolean z11) {
        m121692Zu("SETTING_ENABLE_MINI_CALL_SERVER", z11, true);
    }

    /* renamed from: Rm */
    public static void m121388Rm(boolean z11) {
        m121692Zu("ENABLE_STICKER_HTML5", z11, true);
    }

    /* renamed from: Rn */
    public static void m121389Rn(long j11) {
        m121769bv("EXPIRE_DURATION_SYNC_CALENDAR_EVENT", j11, false);
    }

    /* renamed from: Ro */
    public static void m121390Ro(boolean z11) {
        f113485d = z11 ? 1 : 0;
        m121692Zu("HAS_MSG_HIDDEN_CHAT_NEW", z11, false);
    }

    /* renamed from: Rp */
    public static void m121391Rp(long j11) {
        m121769bv("pref_last_force_activate_zam_time", j11, true);
    }

    /* renamed from: Rq */
    public static void m121392Rq(long j11) {
        m121769bv("LAST_TIME_GET_SWITCH_ACCOUNT", j11, true);
    }

    /* renamed from: Rr */
    public static void m121393Rr(long j11) {
        m121769bv("timestampSubmitLocation", j11, true);
    }

    /* renamed from: Rs */
    public static void m121394Rs(int i11) {
        m121731av("MAX_BUBBLE_CALL_NATIVE" + CoreUtility.f89233i, i11, true);
    }

    /* renamed from: Rt */
    public static void m121395Rt(boolean z11) {
        m121692Zu("DEFAULT_REQUEST_CHAT_HEAD_AFTER_INSTALL_AUTO_RESTORE", z11, true);
    }

    /* renamed from: Ru */
    public static void m121396Ru(String str) {
        int i11;
        m121806cv("phoneNumber", str, true);
        if (TextUtils.isEmpty(str)) {
            i11 = AbstractC23304d.f113414n0;
        } else {
            i11 = 123216;
        }
        AbstractC20887g.m109229g(123203, i11, "");
        AbstractC0837p0.m2225f().mo2040a(new RunnableC23308h());
    }

    /* renamed from: Rv */
    public static void m121397Rv(String str) {
        m121806cv(m122038j("REMIND_NOTIFICATION_PERMISSION_%s"), str, false);
    }

    /* renamed from: Rw */
    public static void m121398Rw(boolean z11) {
        m121692Zu("SHOW_LIKE_COMMENT_TIMELINE", z11, true);
    }

    /* renamed from: Rx */
    public static void m121399Rx(long j11) {
        m121769bv("suggest_sticker_ts", j11, true);
    }

    /* renamed from: Ry */
    public static void m121400Ry(String str) {
        m121806cv("token", str, true);
    }

    /* renamed from: Rz */
    public static void m121401Rz(int i11) {
        m121731av("video_playmode", i11, true);
    }

    /* renamed from: S */
    public static int m121402S() {
        return m121937ga("CALLEE_COUNT_CREATE_SHORTCUT" + m121738b1(), 5, true);
    }

    /* renamed from: S0 */
    public static int m121403S0() {
        return m121937ga("COUNT_RETRY_GET_LIST_PIN" + m121738b1(), 0, true);
    }

    /* renamed from: S1 */
    public static boolean m121404S1() {
        return AbstractC0908e0.m2808b("ENABLE_AUTO_PLAY_STICKER_IN_BANNER", true, true);
    }

    /* renamed from: S2 */
    public static int m121405S2() {
        return m121937ga(m122038j("ENABLE_LOG_TIMBER_IN_VOIP%s"), 0, true);
    }

    /* renamed from: S3 */
    public static long m121406S3() {
        return m121975ha("EXPIRE_TIME_GET_EFFECT_BG_FEED", 0L, true);
    }

    /* renamed from: S4 */
    public static int m121407S4() {
        return m121937ga("INTERVAL_RETRY_CONTACT_PHONEBOOK" + m121738b1(), 0, false);
    }

    /* renamed from: S5 */
    public static long m121408S5() {
        return m121975ha("DISCORVERY_LAST_TIME_CLEAN_UP", 0L, true);
    }

    /* renamed from: S6 */
    public static long m121409S6() {
        return m121975ha(m122038j("LASTTIME_SUBMIT_VALUE_SETTING_NOTIFY_SYSTEM_%s"), 0L, true);
    }

    /* renamed from: S7 */
    public static int m121410S7() {
        return m121937ga("SETTING_BACKUP_MEDIA_EXIST_TIME_ON_DRIVE", 365, true);
    }

    /* renamed from: S8 */
    public static int m121411S8() {
        return m121937ga("SETTING_MEDIA_STORE_MIN_POS_TO_LOADMORE_WHEN_VIEWFULL", 1, true);
    }

    /* renamed from: S9 */
    public static String m121412S9() {
        return m122013ia("PASSWORD_RULE_CONFIG", "", true);
    }

    /* renamed from: Sa */
    public static int m121413Sa() {
        return m121937ga(m122038j("RECOMMEND_SEND_PHOTO_HD_COUNT_CURRENT_%s"), 0, true);
    }

    /* renamed from: Sb */
    public static boolean m121414Sb() {
        return m121899fa(m122038j("SETTING_SHOW_CALL_BUBBLE_%s"), true, true);
    }

    /* renamed from: Sc */
    public static long m121415Sc() {
        return m121975ha("CONFIG_TIME_DISABLE_AUTO_OPEN_FILE_DOWNLOADED", 0, true);
    }

    /* renamed from: Sd */
    public static boolean m121416Sd() {
        return m121899fa("PopupMessage" + m121738b1(), m121899fa("PopupMessage", true, true), true);
    }

    /* renamed from: Se */
    public static int m121417Se() {
        return m121937ga("ENABLE_ENTRY_CALL_GLOBAL_SEARCH", 0, true);
    }

    /* renamed from: Sf */
    public static boolean m121418Sf() {
        return m121899fa("ENABLE_SUGGEST_REMOVE_FRIEND", true, false);
    }

    /* renamed from: Sg */
    public static boolean m121419Sg() {
        return m121899fa("SUBMIT_ALL_CONTACT", false, false);
    }

    /* renamed from: Sh */
    public static void m121420Sh(boolean z11) {
        m121692Zu("AutoReceiveVoice" + m121738b1(), z11, true);
    }

    /* renamed from: Si */
    public static void m121421Si(int i11) {
        m121731av("configSupportCall", i11, false);
    }

    /* renamed from: Sj */
    public static void m121422Sj(boolean z11) {
        m121692Zu("ENABLE_ANIM_FILTER", z11, true);
    }

    /* renamed from: Sk */
    public static void m121423Sk(int i11) {
        m121731av("ENABLE_FEATURE_ALIAS" + m121738b1(), i11, true);
    }

    /* renamed from: Sl */
    public static void m121424Sl(int i11) {
        m121731av("CONFIG_ENABLE_MINI_PROFILE", i11, true);
    }

    /* renamed from: Sm */
    public static void m121425Sm(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_STICKER_POPUP", z11, true);
    }

    /* renamed from: Sn */
    public static void m121426Sn(long j11) {
        m121769bv("EXPIRE_TIME_CHECK_CATE_PROMOTE_BG", j11, true);
    }

    /* renamed from: So */
    public static void m121427So(String str) {
        m121806cv("HASH_OF_PHONE_CONTACT_DATABASE", str, true);
    }

    /* renamed from: Sp */
    public static void m121428Sp(String str) {
        m121806cv("LAST_LIST_WIFI_NETWORKS", str, true);
    }

    /* renamed from: Sq */
    public static void m121429Sq(long j11) {
        m121769bv("lastTimeOnStopAct", j11, false);
    }

    /* renamed from: Sr */
    public static void m121430Sr(long j11) {
        m121769bv(m122038j("TIMESTAMP_SYNC_LANGUAGE_%s"), j11, true);
    }

    /* renamed from: Ss */
    public static void m121431Ss(int i11) {
        m121731av("MAX_BUBBLE_CALL_SUCCESS_INCOMING_NATIVE" + CoreUtility.f89233i, i11, true);
    }

    /* renamed from: St */
    public static void m121432St(boolean z11) {
        m121692Zu("NEED_SYNC_HIDDEN_CHAT", z11, true);
    }

    /* renamed from: Su */
    public static void m121433Su(String str) {
        m121806cv(m122038j("PHONE_SUGGEST_HIGHLIGHT_%s"), str, true);
    }

    /* renamed from: Sv */
    public static void m121434Sv(long j11) {
        m121769bv("REMIND_UPDATE_MINI_CHAT_PERMISSION_INTERVAL", j11, true);
    }

    /* renamed from: Sw */
    public static void m121435Sw(int i11) {
        m121731av("SETTING_SHOW_NEW_FRIEND_SECTION", i11, true);
    }

    /* renamed from: Sx */
    public static void m121436Sx(int i11) {
        m121731av("SUPPORT_CALL_CONTACT_TAB", i11, true);
    }

    /* renamed from: Sy */
    public static void m121437Sy(int i11) {
        m121731av("totalNetworkCheck" + m121738b1(), i11, true);
    }

    /* renamed from: Sz */
    public static void m121438Sz(boolean z11) {
        m121692Zu("IS_VISIBLE_CREATE_USERNAME_SIGNUP", z11, true);
    }

    /* renamed from: T */
    public static String m121439T() {
        return m122013ia("CAMERA_NO_DELAY_RELEASE_TIME_DEVICE_LIST", "", true);
    }

    /* renamed from: T0 */
    public static int m121440T0() {
        return m121937ga(m122038j("COUNT_TOAST_COLLAPSE_CALL_MINI_VIEW%s"), 0, true);
    }

    /* renamed from: T1 */
    public static boolean m121441T1() {
        return AbstractC0908e0.m2808b("ENABLE_AUTO_PLAY_STICKER_IN_BUBBLE", true, true);
    }

    /* renamed from: T2 */
    public static boolean m121442T2() {
        return m121899fa("ENABLE_MANAGE_OA_EVENT", false, true);
    }

    /* renamed from: T3 */
    public static long m121443T3() {
        return m121975ha("EXPIRE_TIME_GET_EFFECT_TYPO_FEED", 0L, true);
    }

    /* renamed from: T4 */
    public static long m121444T4() {
        return m121975ha("INTERVAL_START_BACKGROUND_SERVICE_TIMESTAMP", 900000L, true);
    }

    /* renamed from: T5 */
    public static long m121445T5() {
        return m121975ha("LAST_TIME_DELETE_SECRET_MSG", 0L, true);
    }

    /* renamed from: T6 */
    public static long m121446T6() {
        return m121975ha(m122038j("LAST_TIME_SUBMIT_VALUE_SETTING_SYNC_MSG_BACKUP_RESTORE_%s"), 0L, true);
    }

    /* renamed from: T7 */
    public static int m121447T7() {
        return m121937ga("LIMIT_TOP_SECTION", 20, true);
    }

    /* renamed from: T8 */
    public static long m121448T8() {
        return AbstractC0908e0.m2814h(m122038j("MEMORY_ENTRY_API_EXPIRE_TIME_%s"), 0L, true, true);
    }

    /* renamed from: T9 */
    public static String m121449T9() {
        return AbstractC0908e0.m2815i("pc_request_sync_data_" + m121738b1(), "", true);
    }

    /* renamed from: Ta */
    public static int m121450Ta() {
        return m121937ga("REFRESH_GROUP_INFO_INTERVAL", 10800, true);
    }

    /* renamed from: Tb */
    public static boolean m121451Tb() {
        return m121899fa("SHOW_LIST_TYPO_ON_SEND_BUTTON_LONG_HOLD", false, true);
    }

    /* renamed from: Tc */
    public static int m121452Tc() {
        return m121937ga("IN_APP_NOTIFICATION_DISPLAY", 5, true);
    }

    /* renamed from: Td */
    public static int m121453Td() {
        return m121937ga("USE_SCALE_TEXT_SIZE_FUNCTION", 1, true);
    }

    /* renamed from: Te */
    public static boolean m121454Te() {
        return m121899fa("ENABLE_EXTEND_PROFILE", true, true);
    }

    /* renamed from: Tf */
    public static boolean m121455Tf() {
        return m121899fa("ENABLE_SUGGEST_SICKER_WITH_ONE_EMOJI", true, true);
    }

    /* renamed from: Tg */
    public static boolean m121456Tg() {
        return m121899fa("SYNC_DELETE_FROM_PC", true, true);
    }

    /* renamed from: Th */
    public static void m121457Th(long j11) {
        if (j11 < 1048576) {
            return;
        }
        m121769bv("BACKUP_CHAT_DB_FILE_SIZE_LIMIT", j11, true);
    }

    /* renamed from: Ti */
    public static void m121458Ti(long j11) {
        m121769bv("CONFIG_TIMEOUT_TOPOUT_MSG_BY_MSG_SENT", j11, true);
    }

    /* renamed from: Tj */
    public static void m121459Tj(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_ANIM_JUMP_CAMERA_ICON", z11, true);
    }

    /* renamed from: Tk */
    public static void m121460Tk(boolean z11) {
        m121692Zu("ENABLE_FEATURE_BG_GRAPHY", z11, true);
    }

    /* renamed from: Tl */
    public static void m121461Tl(int i11) {
        m121731av("ENABLE_MUTUAL_FEED", i11, true);
    }

    /* renamed from: Tm */
    public static void m121462Tm(boolean z11) {
        m121692Zu("ENABLE_STORY", z11, true);
    }

    /* renamed from: Tn */
    public static void m121463Tn(long j11) {
        m121769bv("EXPIRE_TIME_GET_EFFECT_BG_FEED", j11, true);
    }

    /* renamed from: To */
    public static void m121464To() {
        AbstractC0908e0.m2818l("have_pc_request_sync_" + m121738b1(), true, true);
    }

    /* renamed from: Tp */
    public static void m121465Tp(String str) {
        m121806cv("SaveLastSubmitPhone" + m121738b1(), str, true);
    }

    /* renamed from: Tq */
    public static void m121466Tq(long j11) {
        m121769bv("LAST_TIME_OPEN_GALLERY", j11, true);
    }

    /* renamed from: Tr */
    public static void m121467Tr(long j11) {
        m121769bv("timestampUpdateBlockZaloFriend" + m121738b1(), j11, true);
    }

    /* renamed from: Ts */
    public static void m121468Ts(int i11) {
        m121731av("MAX_CHAR_BG_FEED", i11, true);
    }

    /* renamed from: Tt */
    public static void m121469Tt(int i11) {
        m121731av(m122038j("NEED_SYNC_STICKER_LIST_%s"), i11, true);
    }

    /* renamed from: Tu */
    public static void m121470Tu(String str) {
        m121806cv("PHOTO_CONFIG", str, true);
    }

    /* renamed from: Tv */
    public static void m121471Tv(int i11) {
        m121731av("REMIND_UPDATE_MINI_CHAT_PERMISSION_LIMIT_COUNT", i11, true);
    }

    /* renamed from: Tw */
    public static void m121472Tw(int i11) {
        m121731av("SETTING_SHOW_ONLINE_FRIEND_WITH_STATUS", i11, true);
    }

    /* renamed from: Tx */
    public static void m121473Tx(String str) {
        m121806cv("support_info", str, true);
    }

    /* renamed from: Ty */
    public static void m121474Ty(String str) {
        m121806cv("TRENDING_DEFAULT_ICON_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: Tz */
    public static void m121475Tz(int i11) {
        m121731av("SETTING_VOIP_ENABLE_BLUETOOTH_UI", i11, true);
    }

    /* renamed from: U */
    public static int m121476U() {
        return m121937ga("CAMERA_VIDEO_RECORD_EXTRA_TIME", 3000, true);
    }

    /* renamed from: U0 */
    public static String m121477U0() {
        return m122013ia("countrycodes", "84", true);
    }

    /* renamed from: U1 */
    public static boolean m121478U1() {
        return AbstractC0908e0.m2808b("ENABLE_AUTO_PLAY_STICKER_IN_STICKER_PANEL", true, true);
    }

    /* renamed from: U2 */
    public static boolean m121479U2() {
        return m121899fa("ENABLE_MAP_VIEW_OVERLAY", true, true);
    }

    /* renamed from: U3 */
    public static long m121480U3() {
        return m121975ha("EXPIRE_TIME_CHECK_FORCE_REFRESH_BG_FEED", 0L, true);
    }

    /* renamed from: U4 */
    public static int m121481U4() {
        return m121937ga("intervalTimeCheckNetwork" + m121738b1(), 300, true);
    }

    /* renamed from: U5 */
    public static long m121482U5() {
        return m121975ha("LAST_TIME_DETECT_COUNTRY", 0L, true);
    }

    /* renamed from: U6 */
    public static long m121483U6(int i11) {
        return m121975ha(m122001i("LAST_TIME_TIME_SUBMIT_ZALO_TRACKING_INFO_%d", i11), 0L, true);
    }

    /* renamed from: U7 */
    public static String m121484U7() {
        return m122013ia("COPIED_LINK_SUGGEST_CONFIG", "", true);
    }

    /* renamed from: U8 */
    public static String m121485U8() {
        return m122013ia(m122038j("MEMORY_ENTRY_TIMELINE_CONFIG_%s"), "", true);
    }

    /* renamed from: U9 */
    public static int m121486U9() {
        return AbstractC0908e0.m2810d("sync_pc_request_timeout", 300, true);
    }

    /* renamed from: Ua */
    public static String m121487Ua() {
        return m122013ia("REGISTER_DPN", "", true);
    }

    /* renamed from: Ub */
    public static boolean m121488Ub() {
        return m121899fa("showedLocationNetworkGPSDialog", true, true);
    }

    /* renamed from: Uc */
    public static long m121489Uc() {
        return m121975ha(m122038j("TIME_DURATION_CLEAR_NEW_FRIEND_ITEM_%s"), 259200000L, true);
    }

    /* renamed from: Ud */
    public static boolean m121490Ud() {
        return m121899fa("useseenmessage" + m121738b1(), m121899fa("useseenmessage", true, true), true);
    }

    /* renamed from: Ue */
    public static boolean m121491Ue() {
        return m121899fa("ENABLE_FEATURE_BG_GRAPHY", true, true);
    }

    /* renamed from: Uf */
    public static boolean m121492Uf() {
        return m121899fa("ENABLE_SUPPORT_EXTRA_DB", false, true);
    }

    /* renamed from: Ug */
    public static boolean m121493Ug() {
        return m121899fa("SYNC_HIDDEN_CHAT_SUCCESS_" + CoreUtility.f89233i, false, true);
    }

    /* renamed from: Uh */
    public static void m121494Uh(int i11) {
        m121731av("BIT_RATE_VOICE_MSG", i11, true);
    }

    /* renamed from: Ui */
    public static void m121495Ui(long j11) {
        m121769bv("SETTING_TIME_SUBMIT_LOG", j11, true);
    }

    /* renamed from: Uj */
    public static void m121496Uj(boolean z11) {
        m121692Zu("ENABLE_ANIM_MAIN_TAB", z11, false);
    }

    /* renamed from: Uk */
    public static void m121497Uk(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_FEATURE_DYNAMIC_SHORTCUTS", z11, true);
    }

    /* renamed from: Ul */
    public static void m121498Ul(boolean z11) {
        m121692Zu("ENABLE_NEARBY_FRIEND", z11, true);
    }

    /* renamed from: Um */
    public static void m121499Um(boolean z11) {
        m121692Zu("ENABLE_STORY_BACKGROUND_STATUS", z11, true);
    }

    /* renamed from: Un */
    public static void m121500Un(long j11) {
        m121769bv("EXPIRE_TIME_GET_EFFECT_TYPO_FEED", j11, true);
    }

    /* renamed from: Uo */
    public static void m121501Uo(String str) {
        m121806cv("HINT_SET_PASSWORD", str, true);
    }

    /* renamed from: Up */
    public static void m121502Up(int i11) {
        m121731av("LAST_MODE_COMPOSE_FEED", i11, true);
    }

    /* renamed from: Uq */
    public static void m121503Uq(long j11) {
        AbstractC0908e0.m2823q("LAST_TIME_PLAY_ANIM_MUSIC_EMPTY_VIEW", j11, true);
    }

    /* renamed from: Ur */
    public static void m121504Ur(long j11) {
        m121769bv(m122038j("LAST_TIMESTAMP_UPDATE_COUNT_CLICK_AFTER_SEARCH_%s"), j11, false);
    }

    /* renamed from: Us */
    public static void m121505Us(int i11) {
        m121731av("MAX_CHAR_BG_FEED_STORY", i11, true);
    }

    /* renamed from: Ut */
    public static void m121506Ut(boolean z11) {
        m121692Zu("needToShowPassCodeScreen", z11, false);
    }

    /* renamed from: Uu */
    public static void m121507Uu(String str) {
        m121806cv("PHOTO_NOTIFICATION_SETTING", str, true);
    }

    /* renamed from: Uv */
    public static void m121508Uv(int i11) {
        m121731av("REMIND_UPDATE_MINI_CHAT_PERMISSION_SKIP_COUNT", i11, true);
    }

    /* renamed from: Uw */
    public static void m121509Uw(int i11) {
        m121731av("SETTING_USE_FINGER_PRINT_PASSCODE", i11, true);
    }

    /* renamed from: Ux */
    public static void m121510Ux(boolean z11) {
        m121692Zu("SYNC_DELETE_FROM_PC", z11, true);
    }

    /* renamed from: Uy */
    public static void m121511Uy(String str) {
        m121806cv("TRENDING_EVENT_ICON_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: Uz */
    public static void m121512Uz(int i11) {
        m121731av("SETTING_VOIP_PRESELECT_CHECK_LAST_MISS_CALL", i11, true);
    }

    /* renamed from: V */
    public static boolean m121513V() {
        return m121899fa(m122038j("CAN_COLLAPSE_CONVERSATION_%s"), true, true);
    }

    /* renamed from: V0 */
    public static boolean m121514V0() {
        return m121899fa("CreateShorcut", true, true);
    }

    /* renamed from: V1 */
    public static boolean m121515V1() {
        return AbstractC0908e0.m2808b("ENABLE_AUTO_PLAY_STICKER_IN_STICKER_POPUP", true, true);
    }

    /* renamed from: V2 */
    public static boolean m121516V2() {
        return m121899fa("ENABLE_MAP_VIEW_PICKER", true, true);
    }

    /* renamed from: V3 */
    public static long m121517V3() {
        return m121975ha("EXPIRE_TIME_GET_LST_THEME", 3600000L, true);
    }

    /* renamed from: V4 */
    public static long m121518V4() {
        return m121975ha("INTERVAL_TIME_KNOW_LAST_ACTIVE", 180L, true);
    }

    /* renamed from: V5 */
    public static long m121519V5(String str) {
        return m121975ha("LAST_TIME_DOWNLOAD_LIBRARY_" + str, 0L, true);
    }

    /* renamed from: V6 */
    public static long m121520V6() {
        return m121975ha("SYNC_ALARM_LOCAL_EVENT_LAST_TIME", 0L, true);
    }

    /* renamed from: V7 */
    public static String m121521V7() {
        return m122013ia("LIST_CONVERT_PHONE_NUMBER", "", false);
    }

    /* renamed from: V8 */
    public static String m121522V8() {
        return AbstractC0908e0.m2816j(m122038j("MEMORY_PROFILE_NOTIFICATION_ITEM_%s"), "", true, true);
    }

    /* renamed from: V9 */
    public static int m121523V9() {
        return m121937ga("percentFailToUploadResult" + m121738b1(), 50, true);
    }

    /* renamed from: Va */
    public static String m121524Va() {
        return m122013ia(m122038j("REMIND_CONTACT_SUBMISSION_%s"), "", false);
    }

    /* renamed from: Vb */
    public static boolean m121525Vb() {
        return m121899fa("STATUS_CAN_SHOW_NOTIFY_STICKY_ADS", false, false);
    }

    /* renamed from: Vc */
    public static long m121526Vc() {
        return m121975ha(m122038j("TIME_DURATION_CLEAR_NEW_SUGGEST_ITEM_%s"), 259200000L, true);
    }

    /* renamed from: Vd */
    public static boolean m121527Vd() {
        return m121899fa("useSuggestStickerV2" + m121738b1(), true, true);
    }

    /* renamed from: Ve */
    public static boolean m121528Ve() {
        return m121899fa("ENABLE_FEED_TRANSLATE", true, true);
    }

    /* renamed from: Vf */
    public static boolean m121529Vf() {
        return m121899fa("ENABLE_SWITCH_ACCOUNT", false, true);
    }

    /* renamed from: Vg */
    public static boolean m121530Vg() {
        return m121899fa("UNREAD_COUNT_ENABLE_FOR_MUTED_CONVERSATION", true, true);
    }

    /* renamed from: Vh */
    public static void m121531Vh(int i11) {
        m121731av("BOTTOM_BANNER_PERMISSION_CONTACT_LIST_HEIGHT", i11, true);
    }

    /* renamed from: Vi */
    public static void m121532Vi(int i11) {
        m121731av("CONNECT_NOTIF_WWAN_TIME" + m121738b1(), i11, false);
    }

    /* renamed from: Vj */
    public static void m121533Vj(boolean z11) {
        m121692Zu("ENABLE_ANIMATION_STORY_VIEWER", z11, true);
    }

    /* renamed from: Vk */
    public static void m121534Vk(int i11) {
        m121731av("ENABLE_FEATURE_HINT_ON_NOTIFY", i11, false);
    }

    /* renamed from: Vl */
    public static void m121535Vl(boolean z11) {
        m121692Zu("IS_ENABLE_NEW_RESIZE_PHOTO_LOGIC", z11, true);
    }

    /* renamed from: Vm */
    public static void m121536Vm(boolean z11) {
        m121692Zu("IS_ENABLE_STORY_MULTI_SELECT", z11, true);
    }

    /* renamed from: Vn */
    public static void m121537Vn(long j11) {
        m121769bv("EXPIRE_TIME_CHECK_FORCE_REFRESH_BG_FEED", j11, true);
    }

    /* renamed from: Vo */
    public static void m121538Vo(int i11) {
        m121731av("HOLD_CALL_RECEIVE_TIME_OUT", i11, true);
    }

    /* renamed from: Vp */
    public static void m121539Vp(long j11) {
        m121769bv("timestamp_last_permission_scan", j11, true);
    }

    /* renamed from: Vq */
    public static void m121540Vq(long j11) {
        m121769bv("LAST_TIME_REMOVE_ANIM_FILTER_ASSET", j11, true);
    }

    /* renamed from: Vr */
    public static void m121541Vr(long j11) {
        m121769bv("timestampUpdateCurrentUserInfo", j11, true);
    }

    /* renamed from: Vs */
    public static void m121542Vs(int i11) {
        m121731av("CONFIG_MAX_CLONE_GROUP_MEMBER", i11, true);
    }

    /* renamed from: Vt */
    public static void m121543Vt(long j11) {
        m121769bv("NEED_TO_UPDATE_ZALO_FRIEND_PROFILE" + m121738b1(), j11, true);
    }

    /* renamed from: Vu */
    public static void m121544Vu(String str) {
        m121806cv("PHOTO_SUGGESTION_SETTING", str, true);
    }

    /* renamed from: Vv */
    public static void m121545Vv(String str) {
        m121806cv(m122038j("REQUEST_HIGHLIGHT_%s"), str, true);
    }

    /* renamed from: Vw */
    public static void m121546Vw(int i11) {
        m121731av(m122038j("SETTING_USE_FINGER_PRINT_PASSCODE_USER_SETTING_%s"), i11, true);
    }

    /* renamed from: Vx */
    public static void m121547Vx(int i11) {
        m121731av("sync_entry_point_" + CoreUtility.f89233i, i11, true);
    }

    /* renamed from: Vy */
    public static void m121548Vy(int i11) {
        m121731av("TURNON_CHAT_NOTI_" + CoreUtility.f89233i, i11, false);
    }

    /* renamed from: Vz */
    public static void m121549Vz(int i11) {
        boolean z11;
        if (i11 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        m121692Zu("SETTING_VOIP_PRESELECT_ENABLE", z11, true);
    }

    /* renamed from: W */
    public static String m121550W() {
        return m122013ia("CAPTIVE_PORTAL_CHECK_URL", "", false);
    }

    /* renamed from: W0 */
    public static String m121551W0() {
        return m122013ia("CryptKey" + m121738b1(), "", true);
    }

    /* renamed from: W1 */
    public static boolean m121552W1() {
        return AbstractC0908e0.m2808b("ENABLE_AUTO_PLAY_STICKER_IN_STICKER_REPLY", true, true);
    }

    /* renamed from: W2 */
    public static int m121553W2() {
        return m121937ga("ENABLE_MEDIA_STORE_SEARCH_V2", 1, true);
    }

    /* renamed from: W3 */
    public static long m121554W3() {
        return AbstractC0908e0.m2813g("EXPIRE_TIME_GET_TENOR_STICKER_MAP", 86400L, true);
    }

    /* renamed from: W4 */
    public static long m121555W4() {
        return m121975ha("INTERVAL_TIMESTAMP_GETLIST_FOLLOW", 86400000L, false);
    }

    /* renamed from: W5 */
    public static long m121556W5() {
        return m121975ha(m122038j("LAST_TIME_FETCH_BLACK_LIST_%s"), 0L, true);
    }

    /* renamed from: W6 */
    public static long m121557W6() {
        return m121975ha("CALENDAR_EVENT_LAST_SYNC", 0L, false);
    }

    /* renamed from: W7 */
    public static String m121558W7() {
        return m122013ia("manage_reddot_group_list_media_store_by_type" + CoreUtility.f89233i, "{}", true);
    }

    /* renamed from: W8 */
    public static int m121559W8() {
        return m121937ga("MIN_CHAR_BG_FEED", 100, true);
    }

    /* renamed from: W9 */
    public static int m121560W9(String str) {
        return m121937ga("permission_" + str, -1, true);
    }

    /* renamed from: Wa */
    public static String m121561Wa() {
        return m122013ia(m122038j("REMIND_NOTIFICATION_PERMISSION_%s"), "", false);
    }

    /* renamed from: Wb */
    public static String m121562Wb() {
        return m122013ia("show_popup_maintab", "", true);
    }

    /* renamed from: Wc */
    public static long m121563Wc() {
        return m121975ha("TIME_EXPIRE_GET_NONE_FRIEND", 0L, true);
    }

    /* renamed from: Wd */
    public static boolean m121564Wd() {
        return m121899fa("UnlockScreenForPopupMessage" + m121738b1(), m121899fa("UnlockScreenForPopupMessage", true, true), true);
    }

    /* renamed from: We */
    public static boolean m121565We() {
        return m121899fa("feedVideoEnable", false, true);
    }

    /* renamed from: Wf */
    public static boolean m121566Wf() {
        return m121899fa("ENABLE_SYNC_CONTACT_REMOVE_FRIEND_" + CoreUtility.f89233i, true, false);
    }

    /* renamed from: Wg */
    public static boolean m121567Wg() {
        return m121899fa("UNREAD_COUNT_ENABLE_FOR_STRANGER", true, true);
    }

    /* renamed from: Wh */
    public static void m121568Wh(String str) {
        m121806cv("CACHE_BACKUP_INFO_FROM_SERVER_" + m121738b1(), str, true);
    }

    /* renamed from: Wi */
    public static void m121569Wi(int i11) {
        m121731av("CONNECT_NOTIF_WIFI_TIME" + m121738b1(), i11, false);
    }

    /* renamed from: Wj */
    public static void m121570Wj(boolean z11) {
        m121692Zu("ANIMATION_TRENDING_EVENT_" + CoreUtility.f89233i, z11, true);
    }

    /* renamed from: Wk */
    public static void m121571Wk(int i11) {
        m121731av("ENABLE_OFF_COUNT_UNREAD", i11, true);
    }

    /* renamed from: Wl */
    public static void m121572Wl(int i11) {
        m121731av("ENABLE_NICKNAME_IN_GROUP", i11, true);
    }

    /* renamed from: Wm */
    public static void m121573Wm(boolean z11) {
        m121692Zu("ENABLE_STORY_POULATE_MINICHAT", z11, true);
    }

    /* renamed from: Wn */
    public static void m121574Wn(long j11) {
        m121769bv("EXPIRE_TIME_GET_LST_THEME", j11, true);
    }

    /* renamed from: Wo */
    public static void m121575Wo(int i11) {
        m121731av("HOLD_CALL_INTERRUPT_TIME_OUT", i11, true);
    }

    /* renamed from: Wp */
    public static void m121576Wp(String str) {
        m121806cv("SavePhoneNumber", str, true);
    }

    /* renamed from: Wq */
    public static void m121577Wq(long j11) {
        m121769bv("LAST_TIME_REMOVE_COCOS_GARBAGE_ASSET", j11, true);
    }

    /* renamed from: Wr */
    public static void m121578Wr(long j11) {
        m121769bv(m122038j("timestampUpdateFavoriteFriend_%s"), j11, true);
    }

    /* renamed from: Ws */
    public static void m121579Ws(int i11) {
        m121731av("MAX_COMMENT_WORD", i11, true);
    }

    /* renamed from: Wt */
    public static void m121580Wt(String str) {
        m121806cv("NEW_CHAT_BAR_CONFIG", str, true);
        AbstractC23306f.m120721w().f147815b = false;
    }

    /* renamed from: Wu */
    public static void m121581Wu(String str) {
        m121806cv(m122038j("GROUP_POLL_CONFIG_%s"), str, true);
    }

    /* renamed from: Wv */
    public static void m121582Wv(String str) {
        m121806cv(m122038j("REG_ID_SUBMIT_FCM_%s"), str, true);
    }

    /* renamed from: Ww */
    public static void m121583Ww(int i11) {
        m121731av(m122038j("SETTING_VIDEO_AUTO_PLAY_%s"), i11, false);
        AbstractC26084s.m134257e(2, "setting_17", true);
    }

    /* renamed from: Wx */
    public static void m121584Wx(boolean z11) {
        m121692Zu("SYNC_HIDDEN_CHAT_SUCCESS_" + CoreUtility.f89233i, z11, true);
    }

    /* renamed from: Wy */
    public static void m121585Wy(int i11) {
        m121731av("TURNON_GROUP_NOTI_" + CoreUtility.f89233i, i11, false);
    }

    /* renamed from: Wz */
    public static void m121586Wz(int i11) {
        m121731av("SETTING_VOIP_PRESELECT_EXPIRE_TIME", i11, true);
    }

    /* renamed from: X */
    public static boolean m121587X() {
        return m121899fa("CAPTURE_VIDEO_SNAPSHOT_ENABLE", true, true);
    }

    /* renamed from: X0 */
    public static int m121588X0() {
        return m121937ga("GET_CSCP_AT_PAGE" + m121738b1(), 1, false);
    }

    /* renamed from: X1 */
    public static int m121589X1() {
        return m121937ga("ENABLE_BADGE_NOTI_NEW_BRANDS", 1, true);
    }

    /* renamed from: X2 */
    public static boolean m121590X2() {
        return m121899fa("ENABLE_MENTION_ALL", true, false);
    }

    /* renamed from: X3 */
    public static long m121591X3() {
        return m121975ha("TIME_NOT_SUGGEST_SYNC_CONTACT_REMOVE_FRIEND", 86400000L, false);
    }

    /* renamed from: X4 */
    public static String m121592X4() {
        return AbstractC0908e0.m2816j("INVALID_FEED_MEMORY_LAYOUT_RATIO", "0", true, true);
    }

    /* renamed from: X5 */
    public static long m121593X5() {
        return m121975ha("LAST_TIME_FETCH_PRELOAD_INFO", 0L, true);
    }

    /* renamed from: X6 */
    public static long m121594X6() {
        return m121975ha("LAST_TIME_UPLOAD_DB_TO_SERVER_WITH_USER_IS_" + CoreUtility.f89233i, 0L, true);
    }

    /* renamed from: X7 */
    public static String m121595X7() {
        return m122013ia(m122038j("LIST_HISTORY_EMOJI_%s"), "", true);
    }

    /* renamed from: X8 */
    public static int m121596X8() {
        return m121937ga("MIN_CHAR_BG_FEED_STORY", 100, true);
    }

    /* renamed from: X9 */
    public static String m121597X9() {
        return m122013ia("PHONE_CONTACT_ISO_COUNTRY_CODES", m121704a5(), true);
    }

    /* renamed from: Xa */
    public static long m121598Xa() {
        return m121975ha("REMIND_UPDATE_MINI_CHAT_PERMISSION_INTERVAL", 86400000L, true);
    }

    /* renamed from: Xb */
    public static int m121599Xb() {
        return m121937ga("showStickerTip", 0, true);
    }

    /* renamed from: Xc */
    public static long m121600Xc() {
        return m121975ha("TIME_EXPIRE_NOTI_PUSH_REDDOT_STICKER_STORE_CHAT", System.currentTimeMillis(), true);
    }

    /* renamed from: Xd */
    public static boolean m121601Xd() {
        return m121899fa("use_wakeup_connection", false, true);
    }

    /* renamed from: Xe */
    public static boolean m121602Xe() {
        return m121899fa("ENABLE_GALLERY_PICKER_WHEN_OPENING_CAMERA_CHAT", false, true);
    }

    /* renamed from: Xf */
    public static boolean m121603Xf() {
        return m121899fa("ENABLE_SYNC_NOTI_DOT_TIMELINE_TAB", false, true);
    }

    /* renamed from: Xg */
    public static boolean m121604Xg() {
        return m121899fa("ENABLE_ANIM_VIEWFULL_DIFF_RATIO", false, true);
    }

    /* renamed from: Xh */
    public static void m121605Xh(int i11) {
        m121731av("CALENDAR_SHOW_RANGE", i11, true);
    }

    /* renamed from: Xi */
    public static void m121606Xi(String str) {
        m121806cv("CONNECTION_CONFIG", str, true);
    }

    /* renamed from: Xj */
    public static void m121607Xj(boolean z11) {
        m121692Zu("ENABLE_ASSIGN_OWNER", z11, false);
    }

    /* renamed from: Xk */
    public static void m121608Xk(int i11) {
        m121731av("ENABLE_SEARCH_PHONEBOOK_GLOBAL_SEARCH", i11, true);
    }

    /* renamed from: Xl */
    public static void m121609Xl(boolean z11) {
        m121692Zu(m122038j("ENABLE_NOTIFY_BIRTHDAY_%s"), z11, true);
    }

    /* renamed from: Xm */
    public static void m121610Xm(int i11) {
        m121731av("ENABLE_STRANGER_ALIAS" + m121738b1(), i11, true);
    }

    /* renamed from: Xn */
    public static void m121611Xn(long j11) {
        AbstractC0908e0.m2823q("EXPIRE_TIME_GET_TENOR_STICKER_MAP", System.currentTimeMillis() + (j11 * 1000), true);
    }

    /* renamed from: Xo */
    public static void m121612Xo(boolean z11) {
        m121692Zu("http_fail_over", z11, true);
    }

    /* renamed from: Xp */
    public static void m121613Xp(String str) {
        m121806cv("LAST_PHOTO_SUGGEST_PATH", str, true);
    }

    /* renamed from: Xq */
    public static void m121614Xq(long j11) {
        m121769bv("LAST_TIME_REMOVE_DECOR_TYPO_ASSET", j11, true);
    }

    /* renamed from: Xr */
    public static void m121615Xr(long j11) {
        m121769bv("timestampUpdateListFollow" + m121738b1(), j11, true);
    }

    /* renamed from: Xs */
    public static void m121616Xs(int i11) {
        m121731av("MAX_ITEM_MSG_OA_MEDIABOX", i11, true);
    }

    /* renamed from: Xt */
    public static void m121617Xt(int i11) {
        m121731av("new_default_sticker_cate_id_download", i11, true);
    }

    /* renamed from: Xu */
    public static void m121618Xu(int i11) {
        m121731av("position_onion_sticker", i11, true);
    }

    /* renamed from: Xv */
    public static void m121619Xv(boolean z11) {
        AbstractC0908e0.m2818l("drive_photo_restore_in_chat", z11, true);
    }

    /* renamed from: Xw */
    public static void m121620Xw(int i11) {
        m121731av("SETTING_ZALO_PAGE", i11, true);
    }

    /* renamed from: Xx */
    public static void m121621Xx(long j11) {
        AbstractC0908e0.m2823q("sync_message_status_time_out_" + CoreUtility.f89233i, j11, true);
    }

    /* renamed from: Xy */
    public static void m121622Xy(int i11) {
        if (!AbstractC21777d.m112316g(i11)) {
            i11 = 1;
        }
        AbstractC0908e0.m2821o("TYPE_DATA_DYNAMIC_SHORTCUT_APP", i11, true, true);
    }

    /* renamed from: Xz */
    public static void m121623Xz(int i11) {
        m121731av("SETTING_VOIP_PRESELECT_THRESHOLD_MESSAGE_CALL", i11, true);
    }

    /* renamed from: Y */
    public static int m121624Y() {
        return m121937ga(m122038j("CATE_ID_BG_PROMOTE_%s"), -100, true);
    }

    /* renamed from: Y0 */
    public static String m121625Y0() {
        return AbstractC0908e0.m2816j("CURRENT_TOPIC_THRESHOLD_ARRAY", "", true, true);
    }

    /* renamed from: Y1 */
    public static boolean m121626Y1() {
        return m121899fa("ENABLE_BLOCK_INVITE_ME", true, false);
    }

    /* renamed from: Y2 */
    public static boolean m121627Y2() {
        return m121899fa("SETTING_ENABLE_MINI_CALL_SERVER", true, true);
    }

    /* renamed from: Y3 */
    public static long m121628Y3() {
        return m121975ha("EXPIRED_DURATION_GET_ALL_SETTING", 86400000L, true);
    }

    /* renamed from: Y4 */
    public static String m121629Y4() {
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return null;
        }
        return m122013ia(m122038j("INVITATION_SEEN_LIST_%s"), null, true);
    }

    /* renamed from: Y5 */
    public static long m121630Y5() {
        return m121975ha("LAST_TIME_GET_ALIAS" + m121738b1(), 0L, true);
    }

    /* renamed from: Y6 */
    public static long m121631Y6() {
        return m121975ha("lastTimeToGetSettings" + m121738b1(), 0L, true);
    }

    /* renamed from: Y7 */
    public static String m121632Y7() {
        return m122013ia("LIST_LIVE_EMOJI_V2", "[{\"rType\":6,\"rIcon\":\":d\"},{\"rType\":7,\"rIcon\":\":')\"},{\"rType\":8,\"rIcon\":\":-*\"},{\"rType\":5,\"rIcon\":\"/-heart\"},{\"rType\":3,\"rIcon\":\"/-strong\"},{\"rType\":9,\"rIcon\":\":3\"},{\"rType\":1,\"rIcon\":\"--b\"},{\"rType\":10,\"rIcon\":\":b\"},{\"rType\":11,\"rIcon\":\";d\"},{\"rType\":12,\"rIcon\":\":~\"},{\"rType\":0,\"rIcon\":\":>\"},{\"rType\":13,\"rIcon\":\";p\"},{\"rType\":14,\"rIcon\":\":*\"},{\"rType\":15,\"rIcon\":\";o\"},{\"rType\":16,\"rIcon\":\":((\"},{\"rType\":17,\"rIcon\":\":)\"},{\"rType\":18,\"rIcon\":\":p\"},{\"rType\":19,\"rIcon\":\":$\"},{\"rType\":20,\"rIcon\":\":-h\"},{\"rType\":2,\"rIcon\":\":-((\"},{\"rType\":21,\"rIcon\":\"x-)\"},{\"rType\":22,\"rIcon\":\"8-)\"},{\"rType\":23,\"rIcon\":\";-d\"},{\"rType\":24,\"rIcon\":\":q\"},{\"rType\":25,\"rIcon\":\":(\"},{\"rType\":26,\"rIcon\":\"b-)\"},{\"rType\":27,\"rIcon\":\";?\"},{\"rType\":28,\"rIcon\":\":|\"},{\"rType\":29,\"rIcon\":\";xx\"},{\"rType\":30,\"rIcon\":\":--|\"},{\"rType\":31,\"rIcon\":\";g\"},{\"rType\":32,\"rIcon\":\":o\"},{\"rType\":33,\"rIcon\":\":z\"},{\"rType\":34,\"rIcon\":\":l\"},{\"rType\":35,\"rIcon\":\"p-(\"},{\"rType\":36,\"rIcon\":\":-bye\"},{\"rType\":37,\"rIcon\":\":x\"},{\"rType\":38,\"rIcon\":\"|-)\"},{\"rType\":39,\"rIcon\":\":wipe\"},{\"rType\":40,\"rIcon\":\":!\"},{\"rType\":41,\"rIcon\":\"8*\"},{\"rType\":42,\"rIcon\":\":-dig\"},{\"rType\":43,\"rIcon\":\":t\"},{\"rType\":44,\"rIcon\":\"&-(\"},{\"rType\":45,\"rIcon\":\";-)\"},{\"rType\":46,\"rIcon\":\":handclap\"},{\"rType\":47,\"rIcon\":\">-|\"},{\"rType\":48,\"rIcon\":\":-f\"},{\"rType\":49,\"rIcon\":\":-l\"},{\"rType\":50,\"rIcon\":\":-r\"},{\"rType\":51,\"rIcon\":\";-/\"},{\"rType\":52,\"rIcon\":\";-x\"},{\"rType\":53,\"rIcon\":\":-o\"},{\"rType\":54,\"rIcon\":\";-s\"},{\"rType\":55,\"rIcon\":\"8*)\"},{\"rType\":56,\"rIcon\":\";!\"},{\"rType\":57,\"rIcon\":\";f\"},{\"rType\":58,\"rIcon\":\":;\"},{\"rType\":59,\"rIcon\":\":v\"},{\"rType\":60,\"rIcon\":\";-a\"},{\"rType\":61,\"rIcon\":\":-<\"},{\"rType\":62,\"rIcon\":\":))\"},{\"rType\":63,\"rIcon\":\"$-)\"},{\"rType\":64,\"rIcon\":\"/-cake\"},{\"rType\":65,\"rIcon\":\"/-break\"},{\"rType\":66,\"rIcon\":\"/-shit\"},{\"rType\":67,\"rIcon\":\"/-li\"},{\"rType\":4,\"rIcon\":\"/-weak\"},{\"rType\":68,\"rIcon\":\"/-ok\"},{\"rType\":69,\"rIcon\":\"/-v\"},{\"rType\":70,\"rIcon\":\"/-thanks\"},{\"rType\":71,\"rIcon\":\"/-punch\"},{\"rType\":72,\"rIcon\":\"/-share\"},{\"rType\":73,\"rIcon\":\"_()_\"},{\"rType\":74,\"rIcon\":\"\\uD83D\\uDC8B\"},{\"rType\":75,\"rIcon\":\"\\uD83D\\uDC4A\"},{\"rType\":76,\"rIcon\":\"\\uD83D\\uDC4B\"},{\"rType\":77,\"rIcon\":\"\\uD83D\\uDC50\"},{\"rType\":78,\"rIcon\":\"\\uD83D\\uDCAA\"},{\"rType\":79,\"rIcon\":\"\\uD83D\\uDC4F\"},{\"rType\":80,\"rIcon\":\"\\uD83D\\uDC36\"},{\"rType\":81,\"rIcon\":\"\\uD83D\\uDC39\"},{\"rType\":82,\"rIcon\":\"\\uD83D\\uDC37\"},{\"rType\":83,\"rIcon\":\"\\uD83D\\uDC2E\"},{\"rType\":84,\"rIcon\":\"\\uD83C\\uDF84\"},{\"rType\":85,\"rIcon\":\"\\uD83D\\uDCA7\"},{\"rType\":86,\"rIcon\":\"\\u26C4\\uFE0F\"},{\"rType\":87,\"rIcon\":\"\\uD83C\\uDF7B\"},{\"rType\":88,\"rIcon\":\"\\uD83C\\uDF78\"},{\"rType\":89,\"rIcon\":\"\\uD83C\\uDF57\"},{\"rType\":90,\"rIcon\":\"\\uD83C\\uDF5C\"},{\"rType\":91,\"rIcon\":\"\\uD83C\\uDF82\"},{\"rType\":92,\"rIcon\":\"\\uD83C\\uDF46\"},{\"rType\":93,\"rIcon\":\"\\uD83C\\uDFB6\"},{\"rType\":94,\"rIcon\":\"\\uD83C\\uDF89\"},{\"rType\":95,\"rIcon\":\"\\uD83C\\uDF81\"}]", true);
    }

    /* renamed from: Y8 */
    public static long m121633Y8() {
        return m121975ha("minDurationCheckNetwork" + m121738b1(), 86400000L, true);
    }

    /* renamed from: Y9 */
    public static String m121634Y9() {
        return m122013ia("phoneNumber", "", true);
    }

    /* renamed from: Ya */
    public static int m121635Ya() {
        return m121937ga("REMIND_UPDATE_MINI_CHAT_PERMISSION_LIMIT_COUNT", 6, true);
    }

    /* renamed from: Yb */
    public static boolean m121636Yb() {
        return m121899fa("STATUS_CAN_SHOW_STICKY_ADS", false, true);
    }

    /* renamed from: Yc */
    public static long m121637Yc() {
        return m121975ha("TIME_EXPIRED_HIDDEN_CHAT", 86400000L, true);
    }

    /* renamed from: Yd */
    public static String m121638Yd() {
        return AbstractC0908e0.m2816j("user_backup_pass_" + m121738b1(), "", true, true);
    }

    /* renamed from: Ye */
    public static boolean m121639Ye() {
        return m121899fa("ENABLE_GALLERY_SWIPE_TO_MULTI_SELECT", true, true);
    }

    /* renamed from: Yf */
    public static boolean m121640Yf() {
        return AbstractC0908e0.m2808b("enable_sync_with_pass_" + m121738b1(), false, true);
    }

    /* renamed from: Yg */
    public static boolean m121641Yg() {
        return m121899fa("USE_HANDLER_SOCKET_CONNECTION", true, true);
    }

    /* renamed from: Yh */
    public static void m121642Yh(int i11) {
        m121731av("ENABLE_CALLSHORTCUT_FEATURE_" + m121738b1(), i11, true);
    }

    /* renamed from: Yi */
    public static void m121643Yi(int i11) {
        m121731av("CONNECTION_PING_FOREGROUND_INTERVAL_" + m121738b1(), i11, true);
    }

    /* renamed from: Yj */
    public static void m121644Yj(int i11) {
        m121731av(m122038j("ENABLE_SETTING_ALLOW_ADD_FRIEND_PHONEBOOK_%s"), i11, true);
    }

    /* renamed from: Yk */
    public static void m121645Yk(boolean z11) {
        m121692Zu("ENABLE_FEED_REMIND", z11, true);
    }

    /* renamed from: Yl */
    public static void m121646Yl(boolean z11) {
        m121692Zu("ENABLE_OA_PROFILE_HTML5", z11, true);
    }

    /* renamed from: Ym */
    public static void m121647Ym(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_SUBMIT_TRACKING_LOG_MODEL_SUGGESTION", z11, true);
    }

    /* renamed from: Yn */
    public static void m121648Yn(long j11) {
        m121769bv("TIME_NOT_SUGGEST_SYNC_CONTACT_REMOVE_FRIEND", j11, false);
    }

    /* renamed from: Yo */
    public static void m121649Yo(String str) {
        m121806cv("HTTP_HEADER_VIEWER_KEY_FROM_SERVER", str, true);
    }

    /* renamed from: Yp */
    public static void m121650Yp(long j11) {
        m121769bv("LAST_PHOTO_SUGGEST_TIME", j11, true);
    }

    /* renamed from: Yq */
    public static void m121651Yq(long j11) {
        AbstractC0908e0.m2824r("LAST_TIME_REMOVE_METADATA_CACHE", j11, true, true);
    }

    /* renamed from: Yr */
    public static void m121652Yr(long j11) {
        m121769bv("timestampUpdatePluginList", j11, true);
    }

    /* renamed from: Ys */
    public static void m121653Ys(int i11) {
        m121731av("MAX_ITEM_PIN_PREF", i11, false);
    }

    /* renamed from: Yt */
    public static void m121654Yt(int i11) {
        m121731av("new_sticker_default_cate_id", i11, true);
    }

    /* renamed from: Yu */
    public static void m121655Yu(boolean z11) {
        m121692Zu(m122038j("PRECHECK_CONTACT_PERMISSION_%s"), z11, true);
    }

    /* renamed from: Yv */
    public static void m121656Yv(boolean z11) {
        m121692Zu("app_restore_media_check", z11, true);
    }

    /* renamed from: Yw */
    public static void m121657Yw(String str) {
        m121806cv("SUGGEST_CHAT_FUNCTION", str, true);
    }

    /* renamed from: Yx */
    public static void m121658Yx(String str) {
        AbstractC0908e0.m2825s("sync_session_data" + m121738b1(), str, true);
    }

    /* renamed from: Yy */
    public static void m121659Yy(int i11) {
        m121731av("boolAlreadyShowSuggestMsgTab" + m121738b1(), i11, true);
    }

    /* renamed from: Yz */
    public static void m121660Yz(int i11) {
        m121731av("VOIP_TIME_AWAIT", i11, false);
    }

    /* renamed from: Z */
    public static int m121661Z() {
        return m121937ga("CHANNEL_VOICE_MSG", 2, true);
    }

    /* renamed from: Z0 */
    public static String m121662Z0(Context context) {
        return context.getSharedPreferences("Zalo", 0).getString("CURRENT_USER_UID_FLOW_RESTORE_APP", "");
    }

    /* renamed from: Z1 */
    public static int m121663Z1() {
        return AbstractC0908e0.m2810d(m122038j("ENABLE_BOOST_VOLUME_IN_CALL%s"), 0, true);
    }

    /* renamed from: Z2 */
    public static int m121664Z2() {
        return m121937ga("CONFIG_ENABLE_MINI_PROFILE", 0, true);
    }

    /* renamed from: Z3 */
    public static long m121665Z3() {
        return m121975ha("expired_duration_location_filter", 300L, false);
    }

    /* renamed from: Z4 */
    public static int m121666Z4() {
        return m121937ga("IsSetPassword", 0, true);
    }

    /* renamed from: Z5 */
    public static long m121667Z5() {
        return m121975ha("LAST_TIME_GET_ANIM_FILTERS", 0L, true);
    }

    /* renamed from: Z6 */
    public static long m121668Z6() {
        return m121975ha("lastTimeToGetSettingsFailed" + m121738b1(), 0L, true);
    }

    /* renamed from: Z7 */
    public static String m121669Z7() {
        return m122013ia("LIST_PHONE_BOOK_DELETE", "", false);
    }

    /* renamed from: Z8 */
    public static long m121670Z8(int i11) {
        return m121975ha(m122001i("MIN_TIME_SUBMIT_ZALO_TRACKING_LOG_%d", i11), 3600L, true);
    }

    /* renamed from: Z9 */
    public static String m121671Z9() {
        return m122013ia(m122038j("PHONE_SUGGEST_HIGHLIGHT_%s"), "", true);
    }

    /* renamed from: Za */
    public static int m121672Za() {
        return m121937ga("REMIND_UPDATE_MINI_CHAT_PERMISSION_SKIP_COUNT", 0, true);
    }

    /* renamed from: Zb */
    public static long m121673Zb() {
        long m2813g = AbstractC0908e0.m2813g("shrinking_db_interval", 604800000L, true);
        if (m2813g < 86400000) {
            return 604800000L;
        }
        return m2813g;
    }

    /* renamed from: Zc */
    public static long m121674Zc() {
        return m121975ha("TIME_GET_SWITCH_ACCOUNT", 300000L, true);
    }

    /* renamed from: Zd */
    public static String m121675Zd() {
        return m122013ia("UserInfo", "", true);
    }

    /* renamed from: Ze */
    public static boolean m121676Ze() {
        return m121899fa("ENABLE_GET_CONTACT_PHONEBOOK" + m121738b1(), false, true);
    }

    /* renamed from: Zf */
    public static boolean m121677Zf() {
        return m121899fa("CONFIG_FLAG_TODO_TASK_IN_CSC", false, true);
    }

    /* renamed from: Zg */
    public static boolean m121678Zg() {
        return m121899fa("USE_WIFI_TO_BACKUP_DB_TO_SERVER_" + m121738b1(), true, true);
    }

    /* renamed from: Zh */
    public static void m121679Zh(int i11) {
        m121731av("CALLEE_COUNT_CREATE_SHORTCUT" + m121738b1(), i11, true);
    }

    /* renamed from: Zi */
    public static void m121680Zi(boolean z11) {
        m121692Zu("CONNECTION_PING_PARALLEL_OLD_RULE_" + m121738b1(), z11, true);
    }

    /* renamed from: Zj */
    public static void m121681Zj(boolean z11) {
        m121692Zu("AUTO_APPLIED_RANDOM_TYPO", z11, true);
    }

    /* renamed from: Zk */
    public static void m121682Zk(boolean z11) {
        m121692Zu("ENABLE_FEED_TRANSLATE", z11, true);
    }

    /* renamed from: Zl */
    public static void m121683Zl(boolean z11) {
        m121692Zu("okHttp", z11, true);
    }

    /* renamed from: Zm */
    public static void m121684Zm(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_SUBMIT_TRACKING_LOG_STICKER_PANEL", z11, true);
    }

    /* renamed from: Zn */
    public static void m121685Zn(long j11) {
        m121769bv("EXPIRED_DURATION_GET_ALL_SETTING", j11, true);
    }

    /* renamed from: Zo */
    public static void m121686Zo(String str) {
        m121806cv(m122038j("HUAWEI_TOKEN_%s"), str, true);
    }

    /* renamed from: Zp */
    public static void m121687Zp(int i11) {
        m121731av("LAST_PROMOTED_LOCATION_FILTER_ID", i11, true);
    }

    /* renamed from: Zq */
    public static void m121688Zq(long j11) {
        m121769bv("LAST_TIME_REQUEST_DISTRIBUTED_LIBRARY", j11, true);
    }

    /* renamed from: Zr */
    public static void m121689Zr(long j11) {
        m121769bv("timestampUpdateVersionApp", j11, true);
    }

    /* renamed from: Zs */
    public static void m121690Zs(int i11) {
        m121731av("MAX_RECENT_OAVIEW_HORIZONTAL", i11, true);
    }

    /* renamed from: Zt */
    public static void m121691Zt(long j11) {
        m121769bv(m122038j("NEXT_TIMESTAMP_RECALL_API_SYNC_EXTRA_PHONEBOOK_INFO_%s"), j11, true);
    }

    /* renamed from: Zu */
    public static void m121692Zu(String str, boolean z11, boolean z12) {
        AbstractC0908e0.m2819m(str, z11, true, z12);
    }

    /* renamed from: Zv */
    public static void m121693Zv(boolean z11) {
        m121692Zu("RESTORE_PHOTO_IN_MEDIA_STORE_" + m121738b1(), z11, true);
    }

    /* renamed from: Zw */
    public static void m121694Zw(boolean z11) {
        m121692Zu("sync_message_error_shown_" + m121738b1(), z11, true);
    }

    /* renamed from: Zx */
    public static void m121695Zx(String str) {
        m121806cv("SYNC_STATE_BUNDLE_DATA_" + m121738b1(), str, true);
    }

    /* renamed from: Zy */
    public static void m121696Zy(String str) {
        AbstractC0908e0.m2825s(m122038j("TYPO_MAP_TYPEFACE_%s"), str, true);
    }

    /* renamed from: Zz */
    public static void m121697Zz(int i11) {
        m121731av("SETTING_ENABLE_VOIP_TIMEOUT_CALLER", i11, true);
    }

    /* renamed from: a */
    public static boolean m121698a() {
        return m121899fa("SHOW_POPUP_CONFIRM_DELETE_MSG", false, true);
    }

    /* renamed from: a0 */
    public static boolean m121699a0() {
        return m121899fa("chatEnterToSend" + m121738b1(), m121899fa("chatEnterToSend", true, true), true);
    }

    /* renamed from: a1 */
    public static String m121700a1() {
        return m122013ia("CurrentUserExtendProfile" + m121738b1(), "", true);
    }

    /* renamed from: a2 */
    public static boolean m121701a2() {
        return m121899fa("ENABLE_BOUNCING_ENTRYPOINT_BG_FEED", true, true);
    }

    /* renamed from: a3 */
    public static int m121702a3() {
        return m121937ga("ENABLE_MUTUAL_FEED", 1, true);
    }

    /* renamed from: a4 */
    public static long m121703a4() {
        return m121975ha(m122038j("EXPIRED_MIN_TIME_TO_CHECK_EXPIRE_ON_TREE_SETTINGS_%s"), 0L, true);
    }

    /* renamed from: a5 */
    public static String m121704a5() {
        return m122013ia("isoCountrycodes", AbstractC28102j5.m141576a(), true);
    }

    /* renamed from: a6 */
    public static long m121705a6() {
        return m121975ha("LAST_TIME_GET_CONTACT_PHONEBOOK" + m121738b1(), 0L, false);
    }

    /* renamed from: a7 */
    public static long m121706a7() {
        return m121975ha("SaveLastTimeUpdatePhoneBook", 0L, true);
    }

    /* renamed from: a8 */
    public static String m121707a8() {
        return m122013ia("LIST_PREFIX_PHONE_NUMBER", "", true);
    }

    /* renamed from: a9 */
    public static int m121708a9() {
        return m121937ga("min_time_undo_send_msg", 300, true);
    }

    /* renamed from: aA */
    public static void m121709aA(boolean z11) {
        m121692Zu("WAITING_FOR_COMPARE_" + m121738b1(), z11, true);
    }

    /* renamed from: aa */
    public static String m121710aa() {
        return m122013ia("PHOTO_CONFIG", "", true);
    }

    /* renamed from: ab */
    public static String m121711ab() {
        return m122013ia(m122038j("REQUEST_HIGHLIGHT_%s"), "", true);
    }

    /* renamed from: ac */
    public static String m121712ac() {
        return m122013ia("sign", "", true);
    }

    /* renamed from: ad */
    public static long m121713ad() {
        return m121975ha("TIME_INTERVAL_GET_BROADCAST_HTTP", 0L, true);
    }

    /* renamed from: ae */
    public static String m121714ae() {
        return AbstractC0908e0.m2815i(m122038j("USER_SONG_MAPPING_%s"), "", true);
    }

    /* renamed from: af */
    public static boolean m121715af() {
        if (f113482a == null) {
            f113482a = Boolean.valueOf(m121676Ze());
        }
        return f113482a.booleanValue();
    }

    /* renamed from: ag */
    public static boolean m121716ag() {
        return m121899fa("ENABLE_TOOL_CONVERT_PHONE_NUMBER", false, false);
    }

    /* renamed from: ah */
    public static boolean m121717ah() {
        return m121899fa("USE_ZALO_HANDLER_SOCKET_CONNECTION", true, true);
    }

    /* renamed from: ai */
    public static void m121718ai(String str) {
        m121806cv("CAMERA_NO_DELAY_RELEASE_TIME_DEVICE_LIST", str, true);
    }

    /* renamed from: aj */
    public static void m121719aj(int i11) {
        m121731av(m122038j("COUNT_FAIL_UPDATE_CURRENT_USER_INFO_%s"), i11, true);
    }

    /* renamed from: ak */
    public static void m121720ak(boolean z11) {
        m121692Zu("enableAutoCheckNetwork" + m121738b1(), z11, true);
    }

    /* renamed from: al */
    public static void m121721al(boolean z11) {
        m121692Zu("feedVideoEnable", z11, true);
    }

    /* renamed from: am */
    public static void m121722am(boolean z11) {
        m121692Zu("ENABLE_OPEN_SHARED_TIMELINE_FOR_FRIEND", z11, true);
    }

    /* renamed from: an */
    public static void m121723an(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_SUBMIT_TRACKING_LOG_SUGGEST_STICKER", z11, true);
    }

    /* renamed from: ao */
    public static void m121724ao(long j11) {
        m121769bv("expired_duration_location_filter", j11, false);
    }

    /* renamed from: ap */
    public static void m121725ap(String str) {
        m121806cv("IMEI_LOGIN_SESSION", str, true);
    }

    /* renamed from: aq */
    public static void m121726aq(boolean z11) {
        m121692Zu(m122038j("LAST_SELECTION_SEND_PHOTO_HD_%s"), z11, true);
    }

    /* renamed from: ar */
    public static void m121727ar(long j11) {
        m121769bv("LAST_TIME_RESET_SUBMIT_CONTACT_FULL_" + m121738b1(), j11, true);
    }

    /* renamed from: as */
    public static void m121728as(long j11) {
        m121769bv("timestampUpdateZaloFriend" + m121738b1(), j11, true);
    }

    /* renamed from: at */
    public static void m121729at(int i11) {
        m121731av("MAX_ITEM_SEARCH_SUGGEST", i11, true);
    }

    /* renamed from: au */
    public static void m121730au(long j11) {
        m121769bv(m122038j("NEXT_TIMESTAMP_RECALL_API_SYNC_SETTING_CONTACT_PERMISSION_%s"), j11, true);
    }

    /* renamed from: av */
    public static void m121731av(String str, int i11, boolean z11) {
        AbstractC0908e0.m2821o(str, i11, true, z11);
    }

    /* renamed from: aw */
    public static void m121732aw(boolean z11) {
        m121692Zu("RESUME_DOWNLOAD_SERVER_SETTING", z11, true);
    }

    /* renamed from: ax */
    public static void m121733ax(boolean z11) {
        m121692Zu("SHOULD_REMIND_UPDATE_MINI_CHAT_PERMISSION", z11, true);
    }

    /* renamed from: ay */
    public static void m121734ay(long j11) {
        m121769bv("SYNC_STICKER_EXPIRE_TIME", j11, true);
    }

    /* renamed from: az */
    public static void m121735az(String str, int i11) {
        m121806cv(m122001i("STR_URL_UPLOAD_ZALO_TRACKING_BY_TYPE_%d", i11), str, true);
    }

    /* renamed from: b */
    public static boolean m121736b() {
        return m121899fa("use_stock_wrapper_db", true, true);
    }

    /* renamed from: b0 */
    public static int m121737b0() {
        return m121937ga("CHAT_HEAD_ACTIVATED_SPAM_TIME", 120, false);
    }

    /* renamed from: b1 */
    public static String m121738b1() {
        return m122013ia("currentUserUid", "", true);
    }

    /* renamed from: b2 */
    public static boolean m121739b2() {
        if (m121937ga(m122038j("ENABLE_CALL_ACTION_SOCIAL_FEED%s"), 1, true) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b3 */
    public static int m121740b3() {
        return m121937ga("ENABLE_NICKNAME_IN_GROUP", 0, true);
    }

    /* renamed from: b4 */
    public static String m121741b4() {
        return m122013ia("FEATURE_HTML_SETTING_CONFIG_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: b5 */
    public static String m121742b5() {
        return m122013ia(m122038j("ISO_COUNTRY_CODES_CHANGE_PHONE_NUMBER_%s"), m121704a5(), true);
    }

    /* renamed from: b6 */
    public static long m121743b6() {
        return m121975ha(m122038j("LAST_TIME_GET_CURRENT_PROFILE_ERROR_%s"), 0L, true);
    }

    /* renamed from: b7 */
    public static long m121744b7() {
        return m121975ha("LAST_TIMESTAMP_GET_SETTING_STARTUP", 0L, false);
    }

    /* renamed from: b8 */
    public static String m121745b8(Context context) {
        return context.getSharedPreferences("ZaloListNotifyInfo", 0).getString(m122038j("STR_LIST_SUGGEST_HINT_ITEM_%s"), "");
    }

    /* renamed from: b9 */
    public static int m121746b9() {
        return m121937ga(m122038j("MODE_ACCEPT_FRIEND_REQUEST_%s"), 0, true);
    }

    /* renamed from: bA */
    public static void m121747bA(boolean z11) {
        m121692Zu("WAITING_FOR_LOGIN_SUCCESS", z11, true);
    }

    /* renamed from: ba */
    public static String m121748ba() {
        return m122013ia("PHOTO_NOTIFICATION_SETTING", "", true);
    }

    /* renamed from: bb */
    public static String m121749bb() {
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return null;
        }
        return m122013ia(m122038j("REG_ID_SUBMIT_FCM_%s"), "", true);
    }

    /* renamed from: bc */
    public static boolean m121750bc() {
        return m121899fa("SAVE_SMS_INTEGRATION_SERVER_", true, true);
    }

    /* renamed from: bd */
    public static long m121751bd(int i11) {
        return m121975ha(m122001i("TIME_INTERVAL_GET_LAST_KNOW_LOCATION_LOG_%d", i11), 21600L, true);
    }

    /* renamed from: be */
    public static String m121752be() {
        return AbstractC0908e0.m2816j(m122038j("VERIFY_ACCOUNT_WITH_IDENTIFY_CARD_%s"), "", true, true);
    }

    /* renamed from: bf */
    public static boolean m121753bf() {
        return m121899fa("FIRST_TIME_GET_DATA_BG_FEED", true, false);
    }

    /* renamed from: bg */
    public static boolean m121754bg() {
        return m121899fa("ENABLE_TOOL_REVERT_PHONE_NUMBER", false, false);
    }

    /* renamed from: bh */
    public static boolean m121755bh() {
        return m121899fa("USER_DISABLE_POPUP_CONFIRM_DELETE_MSG_" + m121738b1(), false, false);
    }

    /* renamed from: bi */
    public static void m121756bi(int i11) {
        m121731av("CAMERA_VIDEO_RECORD_EXTRA_TIME", i11, true);
    }

    /* renamed from: bj */
    public static void m121757bj(int i11) {
        m121731av("COUNT_GET_ZFRIEND_UPDATE", i11, true);
    }

    /* renamed from: bk */
    public static void m121758bk(boolean z11) {
        m121692Zu("ENABLE_AUTO_GET_TIMELINE_EXPIRED", z11, true);
    }

    /* renamed from: bl */
    public static void m121759bl(boolean z11) {
        m121692Zu("ENABLE_FLIPPING_BG_FEED_REMIND", z11, true);
    }

    /* renamed from: bm */
    public static void m121760bm(boolean z11) {
        m121692Zu("aquery_opt_device_class", z11, true);
    }

    /* renamed from: bn */
    public static void m121761bn(boolean z11) {
        m121692Zu("ENABLE_SUGGEST_ACTION", z11, true);
    }

    /* renamed from: bo */
    public static void m121762bo(long j11) {
        m121769bv(m122038j("EXPIRED_MIN_TIME_TO_CHECK_EXPIRE_ON_TREE_SETTINGS_%s"), j11, true);
    }

    /* renamed from: bp */
    public static void m121763bp(String str) {
        m121806cv("ip_client", str, true);
    }

    /* renamed from: bq */
    public static void m121764bq(int i11) {
        m121731av(m122038j("LAST_SETTING_THEME_%s"), i11, true);
    }

    /* renamed from: br */
    public static void m121765br(long j11) {
        m121769bv(m122038j("lastTimeScanExpiredSticker_%s"), j11, true);
    }

    /* renamed from: bs */
    public static void m121766bs(long j11) {
        m121769bv("TIMESTAMP_UPLOAD_QOS_SMS_LOG", j11, true);
    }

    /* renamed from: bt */
    public static void m121767bt(int i11) {
        m121731av("MAX_ITEM_SECTION_CONTACT", i11, true);
    }

    /* renamed from: bu */
    public static void m121768bu(long j11) {
        m121769bv("NEXT_TIME_TO_SYNC_SERVICE_MAP", j11, true);
    }

    /* renamed from: bv */
    public static void m121769bv(String str, long j11, boolean z11) {
        AbstractC0908e0.m2824r(str, j11, true, z11);
    }

    /* renamed from: bw */
    public static void m121770bw(String str, int i11) {
        m121731av("RETRY_DOWNLOAD_THEME_EXCEPTION_" + str, i11, true);
    }

    /* renamed from: bx */
    public static void m121771bx(boolean z11) {
        m121692Zu("SHOULD_SHOW_PERMISSION_BOTTOM_BANNER_" + m121738b1(), z11, true);
    }

    /* renamed from: bz */
    public static void m121772bz(long j11) {
        m121769bv("UNDO_INVITE_TIME", j11, true);
    }

    /* renamed from: c */
    public static void m121773c(Context context, String str) {
        try {
            ContentResolver m135977c = C26388b.m135977c(context);
            Cursor m135981g = C26388b.m135981g(m135977c, PreferencesProvider.f43162q, new String[]{"key"}, "key like '" + str + "%'", null, null, false);
            if (m135981g != null && m135981g.getCount() > 0 && m135981g.moveToFirst()) {
                int columnIndexOrThrow = m135981g.getColumnIndexOrThrow("key");
                do {
                    C26388b.m135975a(m135977c, PreferencesProvider.f43162q, "key=?", new String[]{m135981g.getString(columnIndexOrThrow)}, false);
                } while (m135981g.moveToNext());
                if (!m135981g.isClosed()) {
                    m135981g.close();
                }
            }
        } catch (RuntimeException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: c0 */
    public static int m121774c0() {
        return m121937ga("CHAT_HEAD_EXPIRED_SPAM_TIME", 600, false);
    }

    /* renamed from: c1 */
    public static String m121775c1() {
        return m122013ia("CUSTOM_THEMES_CHAT", "", true);
    }

    /* renamed from: c2 */
    public static int m121776c2() {
        return m121937ga(m122038j("SETTING_ENABLE_CALL_MINI_MODE_CLIENT_%s"), 1, true);
    }

    /* renamed from: c3 */
    public static boolean m121777c3() {
        return m121899fa(m122038j("ENABLE_NOTIFY_BIRTHDAY_%s"), true, true);
    }

    /* renamed from: c4 */
    public static int m121778c4() {
        return m121937ga("FEED_COMPOSE_MAX_WORD", AbstractC23304d.f113344W2, true);
    }

    /* renamed from: c5 */
    public static String m121779c5() {
        return m122013ia(m122038j("isoCountrycodesFindFriend_%s"), m121704a5(), true);
    }

    /* renamed from: c6 */
    public static long m121780c6() {
        return m121975ha("LAST_TIME_GET_EFFECT_BG_FEED", 0L, true);
    }

    /* renamed from: c7 */
    public static long m121781c7() {
        return m121975ha("timestampCheckRegisteGCM", 0L, true);
    }

    /* renamed from: c8 */
    public static String m121782c8() {
        return m122013ia("strListUidNewFriendWithTimeToDelete" + m121738b1(), "", true);
    }

    /* renamed from: c9 */
    public static int m121783c9() {
        return m121937ga(m122038j("MODE_CALL_ACTION_IN_LIST_ACTION_GROUP%s"), 0, true);
    }

    /* renamed from: cA */
    public static void m121784cA() {
        m121731av(m122038j("WIFI_SLEEP_POLICY_WARNING_COUNTER_%s"), m122280pe() + 1, true);
    }

    /* renamed from: ca */
    public static String m121785ca() {
        return m122013ia("PHOTO_SUGGESTION_SETTING", "", true);
    }

    /* renamed from: cb */
    public static int m121786cb(String str) {
        return m121937ga("RETRY_DOWNLOAD_THEME_EXCEPTION_" + str, 3, true);
    }

    /* renamed from: cc */
    public static int m121787cc() {
        return m121937ga("SAVE_SMS_INTEGRATION" + m121738b1(), m121937ga("SAVE_SMS_INTEGRATION", 1, true), true);
    }

    /* renamed from: cd */
    public static long m121788cd() {
        return m121975ha("TIME_INTERVAL_SHOW_HEADUP_FRIEND_REQUEST", 3600000L, true);
    }

    /* renamed from: ce */
    public static String m121789ce() {
        return m122013ia("SAVE_VERSION_CODE", "", true);
    }

    /* renamed from: cf */
    public static int m121790cf() {
        return m121937ga("ENABLE_HEAD_UP_NOTIFY", 1, true);
    }

    /* renamed from: cg */
    public static boolean m121791cg() {
        return m121899fa("ENABLE_TRENDING_STICKER", true, true);
    }

    /* renamed from: ch */
    public static boolean m121792ch() {
        return m121899fa("VIDEO_GIF_ENABLE", true, true);
    }

    /* renamed from: ci */
    public static void m121793ci(boolean z11) {
        m121692Zu(m122038j("CAN_COLLAPSE_CONVERSATION_%s"), z11, true);
    }

    /* renamed from: cj */
    public static void m121794cj(int i11) {
        m121731av("COUNT_RETRY_GET_LIST_PIN" + m121738b1(), i11, true);
    }

    /* renamed from: ck */
    public static void m121795ck(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_AUTO_PLAY_STICKER_IN_BANNER", z11, true);
    }

    /* renamed from: cl */
    public static void m121796cl(boolean z11) {
        m121692Zu("enable_force_jump_to_seasonal_tab", z11, true);
    }

    /* renamed from: cm */
    public static void m121797cm(int i11) {
        m121731av("ENABLE_PERMISSION_BOTTOM_BANNER_" + m121738b1(), i11, true);
    }

    /* renamed from: cn */
    public static void m121798cn(int i11) {
        m121731av("CONFIG_ENABLE_SUGGEST_CHAT", i11, true);
    }

    /* renamed from: co */
    public static void m121799co(String str) {
        m121806cv("FEATURE_HTML_SETTING_CONFIG_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: cp */
    public static void m121800cp(boolean z11) {
        m121692Zu("IGNORE_MUTE_MENTION", z11, true);
    }

    /* renamed from: cq */
    public static void m121801cq(int i11) {
        m121731av("LAST_STATE_AIRPLANE_MODE", i11, true);
    }

    /* renamed from: cr */
    public static void m121802cr(long j11) {
        m121769bv("LAST_TIME_SCAN_NEWEST_PHOTO_PROVIDER", j11, true);
    }

    /* renamed from: cs */
    public static void m121803cs(int i11) {
        m121731av("LAST_TYPO_SELECTED_ID" + m121738b1(), i11, true);
    }

    /* renamed from: ct */
    public static void m121804ct(int i11) {
        m121731av("MAX_ITEM_SECTION_GROUP", i11, true);
    }

    /* renamed from: cu */
    public static void m121805cu(int i11) {
        m121731av("NOTI_CONFIG_CHAT_GROUP", i11, true);
    }

    /* renamed from: cv */
    public static void m121806cv(String str, String str2, boolean z11) {
        AbstractC0908e0.m2826t(str, str2, true, z11);
    }

    /* renamed from: cw */
    public static void m121807cw(String str) {
        m121806cv("RETRY_MSG_CONFIG", str, true);
    }

    /* renamed from: cx */
    public static void m121808cx(int i11) {
        m121731av("SETTING_BUBBLE_CALL_NATIVE" + CoreUtility.f89233i, i11, true);
    }

    /* renamed from: cy */
    public static void m121809cy(int i11) {
        m121731av(m122038j("SYNC_STICKER_VERSION_%s"), i11, true);
    }

    /* renamed from: cz */
    public static void m121810cz(String str, String str2) {
        m121806cv("UNPACK_LIBRARY_CHECKSUM" + str, str2, true);
    }

    /* renamed from: d */
    public static void m121811d(Context context) {
        m121773c(context, "CurrentUserExtendProfile");
    }

    /* renamed from: d0 */
    public static int m121812d0() {
        return m121937ga("CHAT_HEAD_SPAM_COUNT", 3, false);
    }

    /* renamed from: d1 */
    public static long m121813d1(int i11) {
        return m121975ha(m122001i("DATA_EXPIRE_TIME_ZALO_TRACKING_LOG_%d", i11), 3600L, true);
    }

    /* renamed from: d2 */
    public static int m121814d2() {
        return m121937ga("ENABLE_CALL_TEXT_SUPPORT", 0, true);
    }

    /* renamed from: d3 */
    public static boolean m121815d3() {
        return m121899fa("ENABLE_OA_PROFILE_HTML5", false, true);
    }

    /* renamed from: d4 */
    public static int m121816d4() {
        return AbstractC0908e0.m2810d("FEED_IMPRESSION_RELOG_INTERVAL", 2, true);
    }

    /* renamed from: d5 */
    public static String m121817d5(String str) {
        return m122013ia("ISO_COUNTRY_CODE_" + str, "", true);
    }

    /* renamed from: d6 */
    public static long m121818d6() {
        return m121975ha("LAST_TIME_GET_EFFECT_TYPO_FEED", 0L, true);
    }

    /* renamed from: d7 */
    public static long m121819d7() {
        return m121975ha("TIMESTAMP_CLEAN_AQUERY", 0L, true);
    }

    /* renamed from: d8 */
    public static String m121820d8() {
        return m122013ia("strListUidNewFriendStickNumNew" + m121738b1(), "", true);
    }

    /* renamed from: d9 */
    public static String m121821d9() {
        return m122013ia("MULTI_PHOTO_SUGGESTION_SETTING", "", true);
    }

    /* renamed from: dA */
    public static void m121822dA(String str) {
        m121806cv("ZBROWSER_PRECACHE_JSON_CONFIG", str, true);
    }

    /* renamed from: da */
    public static String m121823da() {
        return m122013ia(m122038j("GROUP_POLL_CONFIG_%s"), "", true);
    }

    /* renamed from: db */
    public static String m121824db() {
        return m122013ia("RETRY_MSG_CONFIG", "", true);
    }

    /* renamed from: dc */
    public static boolean m121825dc() {
        return m121899fa("SaveSoundSetting" + m121738b1(), m121899fa("SaveSoundSetting", true, true), true);
    }

    /* renamed from: dd */
    public static long m121826dd() {
        return AbstractC0908e0.m2813g("timeIntervalSubmitLocationFromSerVer", 21600000L, true);
    }

    /* renamed from: de */
    public static boolean m121827de() {
        return m121899fa("SaveVibrationSetting" + m121738b1(), m121899fa("SaveVibrationSetting", true, true), true);
    }

    /* renamed from: df */
    public static boolean m121828df() {
        return m121899fa("ENABLE_HINT_DELETE_FRIEND_TAB_CONTACT" + CoreUtility.f89233i, false, false);
    }

    /* renamed from: dg */
    public static boolean m121829dg() {
        if (m121937ga("ENABLE_USERNAME_STARTUP_FLOW", 0, true) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: dh */
    public static boolean m121830dh() {
        return m121899fa("VIDEO_GIF_HIGH_QUALITY", true, true);
    }

    /* renamed from: di */
    public static void m121831di(String str) {
        m121806cv("CAPTIVE_PORTAL_CHECK_URL", str, false);
    }

    /* renamed from: dj */
    public static void m121832dj(int i11) {
        m121731av(m122038j("COUNT_TOAST_COLLAPSE_CALL_MINI_VIEW%s"), i11, true);
    }

    /* renamed from: dk */
    public static void m121833dk(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_AUTO_PLAY_STICKER_IN_BUBBLE", z11, true);
    }

    /* renamed from: dl */
    public static void m121834dl(int i11) {
        m121731av("ENABLE_FORCE_SYNC_DISCOVER_FOR_FRIEND_REQUEST", i11, true);
    }

    /* renamed from: dm */
    public static void m121835dm(boolean z11) {
        m121692Zu(m122038j("ENABLE_PHOTO_EDIT_DOODLE_BLUR_%s"), z11, true);
    }

    /* renamed from: dn */
    public static void m121836dn(boolean z11) {
        m121692Zu("ENABLE_SUGGEST_CHAT_PROFILE", z11, true);
    }

    /* renamed from: do */
    public static void m121837do(int i11) {
        m121731av("FEED_COMPOSE_MAX_WORD", i11, true);
    }

    /* renamed from: dp */
    public static void m121838dp(String str) {
        m121806cv("INFO_PRELOAD_WEB_VIEW_FEATURE", str, true);
    }

    /* renamed from: dq */
    public static void m121839dq(boolean z11) {
        m121692Zu("LAST_STATE_NOTIFICATION_SYSTEM", z11, false);
    }

    /* renamed from: dr */
    public static void m121840dr(long j11) {
        m121769bv("LAST_TIME_SEND_LOG_DOWNLOAD_PHOTO", j11, true);
    }

    /* renamed from: ds */
    public static void m121841ds(String str) {
        m121806cv("lastUIDCurrentChat", str, true);
    }

    /* renamed from: dt */
    public static void m121842dt(int i11) {
        m121731av("MAX_RECENT_CONTACTVIEW_HORIZONTAL", i11, true);
    }

    /* renamed from: du */
    public static void m121843du(int i11) {
        m121731av("NOTI_CONFIG_CHAT_SINGLE", i11, true);
    }

    /* renamed from: dv */
    public static void m121844dv(int i11) {
        m121731av("PRELOAD_WEBVIEW_NETWORK_CONDITION", i11, true);
    }

    /* renamed from: dw */
    public static void m121845dw(boolean z11) {
        m121692Zu("returnFromStartActForResult", z11, false);
    }

    /* renamed from: dx */
    public static void m121846dx(boolean z11) {
        m121692Zu(m122038j("SETTING_SHOW_CALL_BUBBLE_%s"), z11, true);
        AbstractC26084s.m134269q(2, 94);
    }

    /* renamed from: dy */
    public static void m121847dy(long j11) {
        m121769bv("TSGetPromotionSticker" + m121738b1(), j11, false);
    }

    /* renamed from: dz */
    public static void m121848dz(boolean z11) {
        m121692Zu("UNREAD_COUNT_ENABLE_FOR_MUTED_CONVERSATION", z11, true);
    }

    /* renamed from: e */
    public static boolean m121849e() {
        return m121899fa("ENABLE_NEARBY_FRIEND", true, true);
    }

    /* renamed from: e0 */
    public static long m121850e0() {
        return m121975ha("CHAT_PHOTO_SLIDER_STAY_DURATION", 3000L, true);
    }

    /* renamed from: e1 */
    public static String m121851e1() {
        return m122013ia("DATA_KICK_OUT", "", false);
    }

    /* renamed from: e2 */
    public static int m121852e2() {
        return m121937ga(m122038j("ENABLE_CALL_VIA_ZALO_IN_PHONE_NUMBER_POPUP%s"), 0, true);
    }

    /* renamed from: e3 */
    public static int m121853e3() {
        return m121937ga("ENABLE_PERMISSION_BOTTOM_BANNER_" + m121738b1(), 0, true);
    }

    /* renamed from: e4 */
    public static long m121854e4() {
        return AbstractC0908e0.m2813g("FEED_IMPRESSION_THRESHOLD", 300L, true);
    }

    /* renamed from: e5 */
    public static String m121855e5() {
        return m122013ia("JSON_APP_THEME_OPERATION_" + m121738b1(), "", true);
    }

    /* renamed from: e6 */
    public static long m121856e6() {
        return m121975ha("LAST_TIME_GET_FRIEND_REQUEST", 0L, false);
    }

    /* renamed from: e7 */
    public static long m121857e7() {
        return m121975ha("TIMESTAMP_CLEAN_BACKGROUND_FILES", 0L, true);
    }

    /* renamed from: e8 */
    public static String m121858e8() {
        return m122013ia(m122038j("strListUidNewSuggestStickNumNew_%s"), "", true);
    }

    /* renamed from: e9 */
    public static int m121859e9() {
        return m121937ga("SET_MUST_PICK_COUNTRY_CODE", 0, true);
    }

    /* renamed from: eA */
    public static void m121860eA(String str) {
        m121806cv("ZMEDIA_PLAYER_SETTINGS_NEW", str, true);
    }

    /* renamed from: ea */
    public static int m121861ea() {
        return m121937ga("position_onion_sticker", 0, true);
    }

    /* renamed from: eb */
    public static boolean m121862eb() {
        return m121899fa("returnFromStartActForResult", false, false);
    }

    /* renamed from: ec */
    public static boolean m121863ec() {
        return m121899fa("SAVE_SOUND_SETTING_LOCAL", m121825dc(), true);
    }

    /* renamed from: ed */
    public static long m121864ed(int i11) {
        return m121975ha(m122001i("TIME_INTERVAL_CHECK_SUBMIT_ZALO_TRACKING_%d", i11), 300L, true);
    }

    /* renamed from: ee */
    public static boolean m121865ee() {
        return m121899fa("SAVE_VIBRATION_SETTING_LOCAL", m121827de(), true);
    }

    /* renamed from: ef */
    public static boolean m121866ef() {
        return m121899fa("SETTING_IMAGE_KEYBOARD", true, true);
    }

    /* renamed from: eg */
    public static boolean m121867eg() {
        return m121899fa("FLAG_USING_DO_NOT_DISTURB_" + CoreUtility.f89233i, true, true);
    }

    /* renamed from: eh */
    public static boolean m121868eh() {
        return m121899fa("IS_VISIBLE_CREATE_USERNAME_SIGNUP", false, true);
    }

    /* renamed from: ei */
    public static void m121869ei(boolean z11) {
        m121692Zu("CAPTURE_VIDEO_SNAPSHOT_ENABLE", z11, true);
    }

    /* renamed from: ej */
    public static void m121870ej(String str) {
        m121806cv("countrycodes", str, true);
    }

    /* renamed from: ek */
    public static void m121871ek(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_AUTO_PLAY_STICKER_IN_STICKER_PANEL", z11, true);
    }

    /* renamed from: el */
    public static void m121872el(boolean z11) {
        m121692Zu("ENABLE_GALLERY_PICKER_WHEN_OPENING_CAMERA_CHAT", z11, true);
    }

    /* renamed from: em */
    public static void m121873em(boolean z11) {
        m121692Zu("POPULATE_CLONE_GROUP", z11, true);
    }

    /* renamed from: en */
    public static void m121874en(int i11) {
        m121731av(m122076k("ENABLE_SUGGEST_VIEW_FIND_FRIEND_TAB_MSG_%S", "%S"), i11, true);
    }

    /* renamed from: eo */
    public static void m121875eo(int i11) {
        AbstractC0908e0.m2820n("FEED_IMPRESSION_RELOG_INTERVAL", i11, true);
    }

    /* renamed from: ep */
    public static void m121876ep(String str, int i11, String str2) {
        m121806cv("UNREAD_FEATURE_ID_" + i11 + "_UID_" + str, str2, true);
    }

    /* renamed from: eq */
    public static void m121877eq(long j11) {
        m121769bv("STORY_LAST_SUGGEST_MEDIA_CREATE_TIME", j11, true);
    }

    /* renamed from: er */
    public static void m121878er(long j11) {
        m121769bv(m122038j("LAST_TIME_SHOW_HEADUP_FRIEND_REQUEST_%s"), j11, true);
    }

    /* renamed from: es */
    public static void m121879es(String str) {
        m121806cv("LAST_UID_REQUEST_FRIEND", str, false);
    }

    /* renamed from: et */
    public static void m121880et(int i11) {
        m121731av("MAX_ITEM_SECTION_OA", i11, true);
    }

    /* renamed from: eu */
    public static void m121881eu(int i11) {
        m121731av("NOTI_CONFIG_FRIEND_ACCEPT", i11, true);
    }

    /* renamed from: ev */
    public static void m121882ev(boolean z11) {
        m121692Zu("PRELOAD_WEBVIEW_SERVER_SETTING", z11, true);
    }

    /* renamed from: ew */
    public static void m121883ew(long j11) {
        m121769bv("REUSE_CHAT_FILE_EXPIRED_TIME", j11, false);
    }

    /* renamed from: ex */
    public static void m121884ex(boolean z11) {
        m121692Zu("SHOW_LIST_TYPO_ON_SEND_BUTTON_LONG_HOLD", z11, true);
    }

    /* renamed from: ey */
    public static void m121885ey(long j11) {
        m121769bv("TSGetSupportCountry" + m121738b1(), j11, false);
    }

    /* renamed from: ez */
    public static void m121886ez(boolean z11) {
        m121692Zu("UNREAD_COUNT_ENABLE_FOR_STRANGER", z11, true);
    }

    /* renamed from: f */
    public static boolean m121887f() {
        return AbstractC0908e0.m2808b("ENABLE_SUBMIT_TRACKING_LOG_MODEL_SUGGESTION", true, true);
    }

    /* renamed from: f0 */
    public static boolean m121888f0() {
        return m121899fa("CHAT_TYPO_FEATURE_ENABLE", true, true);
    }

    /* renamed from: f1 */
    public static int m121889f1() {
        return m121937ga("DB_CURRENT_SYNC_STATE_" + CoreUtility.f89233i, 0, true);
    }

    /* renamed from: f2 */
    public static boolean m121890f2() {
        return AbstractC0908e0.m2808b("ENABLE_CAMERA_DOCUMENT_SCANNER", true, true);
    }

    /* renamed from: f3 */
    public static boolean m121891f3() {
        return m121899fa("POPULATE_CLONE_GROUP", true, true);
    }

    /* renamed from: f4 */
    public static int m121892f4() {
        return AbstractC0908e0.m2810d("FEED_IMPRESSION_VALID_PERCENT", 75, true);
    }

    /* renamed from: f5 */
    public static String m121893f5() {
        return m122013ia("JUMPLINK_DOMAIN_901", "", true);
    }

    /* renamed from: f6 */
    public static long m121894f6() {
        return m121975ha("LAST_TIME_GET_FRIEND_REQUESTED", 0L, false);
    }

    /* renamed from: f7 */
    public static long m121895f7() {
        return m121975ha("timestampCleanDupMessage", 0L, true);
    }

    /* renamed from: f8 */
    public static String m121896f8() {
        return m122013ia("strListUidSuggestMsgTab" + m121738b1(), "", true);
    }

    /* renamed from: f9 */
    public static int m121897f9() {
        if (f113486e < 0) {
            f113486e = AbstractC0908e0.m2810d("MUTE_ICON_SEARCH_HIDDEN_CHAT", 0, true);
        }
        return f113486e;
    }

    /* renamed from: fA */
    public static void m121898fA(String str) {
        m121806cv("zaloViewForResult", str, false);
    }

    /* renamed from: fa */
    public static boolean m121899fa(String str, boolean z11, boolean z12) {
        return AbstractC0908e0.m2809c(str, z11, true, z12);
    }

    /* renamed from: fb */
    public static long m121900fb() {
        return m121975ha("REUSE_CHAT_FILE_EXPIRED_TIME", 0L, false);
    }

    /* renamed from: fc */
    public static int m121901fc() {
        return m121937ga("SRC_ATTACH_FOOTER_REMINDER_FROM_MESSAGE", 2, true);
    }

    /* renamed from: fd */
    public static long m121902fd() {
        return m121975ha("TIME_OF_NEWEST_PHOTO_PROVIDER", 0L, true);
    }

    /* renamed from: fe */
    public static int m121903fe() {
        return m121937ga("video_playmode", 3, true);
    }

    /* renamed from: ff */
    public static boolean m121904ff() {
        return m121899fa("ENABLE_IN_APP_NOTIFICATION", true, true);
    }

    /* renamed from: fg */
    public static boolean m121905fg() {
        return m121899fa("IS_ENABLE_VIDEO_BIG_SIZE", true, true);
    }

    /* renamed from: fh */
    public static boolean m121906fh() {
        return m121899fa("WAKEUP_DEVICE_ZALO_HANDLER", false, true);
    }

    /* renamed from: fi */
    public static void m121907fi(int i11) {
        m121731av(m122038j("CATE_ID_BG_PROMOTE_%s"), i11, true);
    }

    /* renamed from: fj */
    public static void m121908fj(boolean z11) {
        m121692Zu("CreateShorcut", z11, true);
    }

    /* renamed from: fk */
    public static void m121909fk(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_AUTO_PLAY_STICKER_IN_STICKER_POPUP", z11, true);
    }

    /* renamed from: fl */
    public static void m121910fl(boolean z11) {
        m121692Zu("ENABLE_GALLERY_SWIPE_TO_MULTI_SELECT", z11, true);
    }

    /* renamed from: fm */
    public static void m121911fm(int i11) {
        m121731av(m122038j("ENABLE_POPUP_QUICK_REPLY_%s"), i11, true);
    }

    /* renamed from: fn */
    public static void m121912fn(int i11) {
        m121731av(m122076k("ENABLE_SUGGEST_VIEW_FIND_FRIEND_TAB_MYPAGES_%S", "%S"), i11, true);
    }

    /* renamed from: fo */
    public static void m121913fo(long j11) {
        AbstractC0908e0.m2823q("FEED_IMPRESSION_THRESHOLD", j11, true);
    }

    /* renamed from: fp */
    public static void m121914fp(int i11) {
        f113484c = i11;
        m121731av("INIT_CONTACT_NATIVE_SYNC", i11, true);
    }

    /* renamed from: fq */
    public static void m121915fq(long j11) {
        m121769bv("STORY_LAST_SUGGEST_MEDIA_TIME", j11, true);
    }

    /* renamed from: fr */
    public static void m121916fr(long j11) {
        m121769bv("last_time_show_popup_maintab", j11, true);
    }

    /* renamed from: fs */
    public static void m121917fs(int i11) {
        m121731av("LAST_UPDATE_FRIEND_NUM_ITEM" + m121738b1(), i11, true);
    }

    /* renamed from: ft */
    public static void m121918ft(int i11) {
        m121731av("MAX_ITEM_SUGGEST_OA_MEDIABOX", i11, true);
    }

    /* renamed from: fu */
    public static void m121919fu(int i11) {
        m121731av("NOTI_CONFIG_FRIEND_REQUEST", i11, true);
    }

    /* renamed from: fv */
    public static void m121920fv(boolean z11) {
        m121692Zu("SavePreviewMessage" + m121738b1(), z11, true);
    }

    /* renamed from: fw */
    public static void m121921fw(long j11) {
        m121769bv("REUSE_CHAT_PHOTO_EXPIRED_TIME", j11, false);
    }

    /* renamed from: fx */
    public static void m121922fx(boolean z11) {
        m121692Zu("showedLocationNetworkGPSDialog", z11, true);
    }

    /* renamed from: fy */
    public static void m121923fy(String str) {
        AbstractC0908e0.m2825s(m122038j("TAB_MESSAGE_ADS_DATA%s"), str, true);
    }

    /* renamed from: fz */
    public static void m121924fz(int i11) {
        m121731av(m122038j("UNREAD_OA_FOLDER_%s"), i11, true);
    }

    /* renamed from: g */
    public static boolean m121925g() {
        return AbstractC0908e0.m2808b("ENABLE_SUBMIT_TRACKING_LOG_STICKER_PANEL", true, true);
    }

    /* renamed from: g0 */
    public static int m121926g0() {
        return m121937ga("CHAT_TYPO_NUM_OF_CHAR_LIMIT", 30, true);
    }

    /* renamed from: g1 */
    public static String m121927g1() {
        return m122013ia("SYNC_STATE_BUNDLE_DATA_" + m121738b1(), "", true);
    }

    /* renamed from: g2 */
    public static boolean m121928g2() {
        return m121899fa("ENABLE_CAMERA_IMMERSIVE_STICKY_MODE", true, true);
    }

    /* renamed from: g3 */
    public static int m121929g3() {
        return m121937ga(m122038j("ENABLE_POPUP_QUICK_REPLY_%s"), 0, true);
    }

    /* renamed from: g4 */
    public static String m121930g4() {
        return m122013ia(m122038j("FEED_MAPPING_URI_DATA_%s"), "", true);
    }

    /* renamed from: g5 */
    public static String m121931g5() {
        return m122013ia(m122038j("JUMP_URL_%s"), null, false);
    }

    /* renamed from: g6 */
    public static long m121932g6() {
        return m121975ha("LAST_TIME_GET_HIDDEN_CHAT", 0L, true);
    }

    /* renamed from: g7 */
    public static long m121933g7() {
        return m121975ha("timestampCleanMessageChatContent", 0L, true);
    }

    /* renamed from: g8 */
    public static float m121934g8() {
        String m122013ia = m122013ia("LIVE_EMOJI_BUTTON_TRANSLATION_Y", null, true);
        if (!TextUtils.isEmpty(m122013ia)) {
            try {
                return Float.parseFloat(m122013ia);
            } catch (NumberFormatException e11) {
                e11.printStackTrace();
            }
        }
        return 0.0f;
    }

    /* renamed from: g9 */
    public static String m121935g9() {
        return m122013ia(m122038j("mutual_ids_noti_list_%s"), "", false);
    }

    /* renamed from: gA */
    public static void m121936gA(String str) {
        m121806cv("ZINSTANT_DISCOVERY_CONFIG_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: ga */
    public static int m121937ga(String str, int i11, boolean z11) {
        return AbstractC0908e0.m2811e(str, i11, true, z11);
    }

    /* renamed from: gb */
    public static long m121938gb() {
        return m121975ha("REUSE_CHAT_PHOTO_EXPIRED_TIME", 0L, false);
    }

    /* renamed from: gc */
    public static int m121939gc() {
        return m121937ga("SRC_DETECT_TIME_REMINDER_FROM_MESSAGE", 2, true);
    }

    /* renamed from: gd */
    public static long m121940gd() {
        return m121975ha("SETTING_TIME_OFF_NOTI_MSG_" + CoreUtility.f89233i, 0L, false);
    }

    /* renamed from: ge */
    public static int m121941ge() {
        return m121937ga("SETTING_VOIP_ENABLE_BLUETOOTH_UI", 1, true);
    }

    /* renamed from: gf */
    public static boolean m121942gf() {
        return m121899fa("enable_inBitmap", false, true);
    }

    /* renamed from: gg */
    public static boolean m121943gg() {
        return m121899fa("ENABLE_VOICE_AAC", true, true);
    }

    /* renamed from: gh */
    public static void m121944gh(boolean z11) {
        m121692Zu("FLAG_UPDATE_OLD_DEFAULT_STICKER_THUMB_", z11, true);
    }

    /* renamed from: gi */
    public static void m121945gi(int i11) {
        m121731av("CHANNEL_VOICE_MSG", i11, true);
    }

    /* renamed from: gj */
    public static void m121946gj(String str) {
        m121806cv("CryptKey" + m121738b1(), str, true);
    }

    /* renamed from: gk */
    public static void m121947gk(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_AUTO_PLAY_STICKER_IN_STICKER_REPLY", z11, true);
    }

    /* renamed from: gl */
    public static void m121948gl(boolean z11) {
        m121692Zu("ENABLE_GEN_GREETING_MSG", z11, false);
    }

    /* renamed from: gm */
    public static void m121949gm(boolean z11) {
        m121692Zu(m122038j("ENABLE_POPUP_RECOMMEND_SEND_PHOTO_HD_%s"), z11, true);
    }

    /* renamed from: gn */
    public static void m121950gn(int i11) {
        m121731av(m122076k("ENABLE_SUGGEST_VIEW_FIND_FRIEND_TAB_PHONEBOOK_%S", "%S"), i11, true);
    }

    /* renamed from: go */
    public static void m121951go(int i11) {
        AbstractC0908e0.m2820n("FEED_IMPRESSION_VALID_PERCENT", i11, true);
    }

    /* renamed from: gp */
    public static void m121952gp(boolean z11) {
        m121692Zu("INSERT_FILE_INTO_MEDIA_STORE_USING_PRE_Q_LOGIC", z11, true);
    }

    /* renamed from: gq */
    public static void m121953gq(String str) {
        m121806cv("SUGGEST_LAST_ITEM_TIMELINE_CONFIG_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: gr */
    public static void m121954gr(long j11) {
        m121769bv("LAST_TIME_SHOW_REMIND_UPDATE_MINI_CHAT_PERMISSION", j11, true);
    }

    /* renamed from: gs */
    public static void m121955gs(int i11) {
        m121731av(m122038j("LAST_VALUE_SETTING_NOTIFY_SYSTEM_%s"), i11, true);
    }

    /* renamed from: gt */
    public static void m121956gt(int i11) {
        m121731av(m122038j("MAX_LENGTH_ALIAS_%s"), i11, true);
    }

    /* renamed from: gu */
    public static void m121957gu(int i11) {
        m121731av("NOTI_CONFIG_FRIEND_SUGGESTION", i11, true);
    }

    /* renamed from: gv */
    public static void m121958gv(String str) {
        m121806cv(m122038j("FEED_PRIVACY_EXCLUDED_FRIENDS_%s"), str, false);
    }

    /* renamed from: gw */
    public static void m121959gw(long j11) {
        m121769bv("REUSE_CHAT_VIDEO_EXPIRED_TIME", j11, false);
    }

    /* renamed from: gx */
    public static void m121960gx(boolean z11) {
        m121692Zu("STATUS_CAN_SHOW_NOTIFY_STICKY_ADS", z11, false);
    }

    /* renamed from: gy */
    public static void m121961gy(long j11) {
        AbstractC0908e0.m2823q(m122038j("TAB_MESSAGE_ADS_LAST_TIME_REQUEST%s"), j11, true);
    }

    /* renamed from: gz */
    public static void m121962gz(String str) {
        m121806cv(m122038j("UPDATE_NEW_PROFILE_STATUS_%s"), str, true);
    }

    /* renamed from: h */
    public static boolean m121963h() {
        return AbstractC0908e0.m2808b("ENABLE_SUBMIT_TRACKING_LOG_SUGGEST_STICKER", true, true);
    }

    /* renamed from: h0 */
    public static long m121964h0() {
        return m121975ha("CHECK_DOWNLOAD_THEME_BEFORE_" + m121738b1(), 0L, true);
    }

    /* renamed from: h1 */
    public static int m121965h1() {
        return m121937ga(m122038j("DEACTIVATE_ACCOUNT_SETTING_%s"), 0, true);
    }

    /* renamed from: h2 */
    public static boolean m121966h2() {
        return m121899fa("SETTING_ENABLE_CHAT_HEAD_CLIENT" + m121738b1(), m122341r1(), true);
    }

    /* renamed from: h3 */
    public static int m121967h3() {
        return m121937ga("ENABLE_SCALE_MODE", 1, true);
    }

    /* renamed from: h4 */
    public static int m121968h4() {
        return m121937ga(m122038j("feedThumbSetting_%s"), -1, true);
    }

    /* renamed from: h5 */
    public static boolean m121969h5() {
        return m121899fa("STORY_KEEP_RATIO", false, true);
    }

    /* renamed from: h6 */
    public static long m121970h6() {
        return AbstractC0908e0.m2813g("LAST_TIME_GET_INVITATION_LIST", 0L, true);
    }

    /* renamed from: h7 */
    public static long m121971h7() {
        return m121975ha("TIMESTAMP_CLEAN_OLD_CONTACT_PROFILE", 0L, true);
    }

    /* renamed from: h8 */
    public static String m121972h8() {
        return m122013ia("LIVE_LOCATION_CONFIG", "", true);
    }

    /* renamed from: h9 */
    public static boolean m121973h9() {
        return m121899fa("DEFAULT_REQUEST_CHAT_HEAD_AFTER_INSTALL_AUTO_RESTORE", false, true);
    }

    /* renamed from: hA */
    public static void m121974hA(String str) {
        m121806cv("ZINSTANT_DISCOVERY_STREAMLINE_CONFIG_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: ha */
    public static long m121975ha(String str, long j11, boolean z11) {
        return AbstractC0908e0.m2814h(str, j11, true, z11);
    }

    /* renamed from: hb */
    public static long m121976hb() {
        return m121975ha("REUSE_CHAT_VIDEO_EXPIRED_TIME", 0L, false);
    }

    /* renamed from: hc */
    public static boolean m121977hc() {
        return m121899fa("SpeakerphoneOn" + m121738b1(), true, false);
    }

    /* renamed from: hd */
    public static long m121978hd() {
        return m121975ha("SETTING_TIME_OFF_NOTI_MSG_GROUP_" + CoreUtility.f89233i, 0L, false);
    }

    /* renamed from: he */
    public static boolean m121979he() {
        if (m121937ga("SETTING_VOIP_PRESELECT_CHECK_LAST_MISS_CALL", 1, true) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: hf */
    public static boolean m121980hf() {
        return m121899fa("ENABLE_KEYBOARD_SHARE_VIEW", false, false);
    }

    /* renamed from: hg */
    public static boolean m121981hg() {
        return m121899fa("FLAG_ENABLE_ZBROWSER", true, true);
    }

    /* renamed from: hh */
    public static boolean m121982hh() {
        return AbstractC0908e0.m2808b("need_clear_drive_sync_cache", true, true);
    }

    /* renamed from: hi */
    public static void m121983hi(int i11) {
        m121731av("CHAT_HEAD_ACTIVATED_SPAM_TIME", i11, false);
    }

    /* renamed from: hj */
    public static void m121984hj(int i11) {
        m121731av("GET_CSCP_AT_PAGE" + m121738b1(), i11, false);
    }

    /* renamed from: hk */
    public static void m121985hk(boolean z11) {
        m121692Zu("ENABLE_BACKUP_MEDIA", z11, true);
    }

    /* renamed from: hl */
    public static void m121986hl(boolean z11) {
        f113482a = Boolean.valueOf(z11);
        m121692Zu("ENABLE_GET_CONTACT_PHONEBOOK" + m121738b1(), z11, true);
    }

    /* renamed from: hm */
    public static void m121987hm(boolean z11) {
        m121692Zu("ENABLE_POST_BG_FEED_ON_STORY", z11, true);
    }

    /* renamed from: hn */
    public static void m121988hn(boolean z11) {
        m121692Zu("ENABLE_SUGGEST_LOCATION", z11, true);
    }

    /* renamed from: ho */
    public static void m121989ho(boolean z11) {
        m121692Zu("FEED_REMIND_PROMOTE_BACKGROUND_FEED", z11, true);
    }

    /* renamed from: hp */
    public static void m121990hp(boolean z11) {
        m121692Zu("INSERT_PHOTO_INTO_MEDIA_STORE_USING_PRE_Q_LOGIC", z11, true);
    }

    /* renamed from: hq */
    public static void m121991hq(String str) {
        m121806cv("SUGGEST_LAST_ITEM_TIMELINE_DATA_" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: hr */
    public static void m121992hr(long j11) {
        m121769bv(m122038j("LAST_TIME_SHOW_REQUEST_PERMISSION_REMINDER_NEW_%s"), j11, false);
    }

    /* renamed from: hs */
    public static void m121993hs(int i11) {
        m121731av(m122038j("LAST_VALUE_PERMISSION_CONTACT_INAPP_%s"), i11, true);
    }

    /* renamed from: ht */
    public static void m121994ht(int i11) {
        if (i11 > AbstractC23306f.m120562A().m2510A()) {
            i11 = AbstractC23306f.m120562A().m2510A();
        }
        m121731av("CHAT_MULTI_SELECTION_MAX_NUMBER_OF_SELECTED_MESSAGES", i11, true);
    }

    /* renamed from: hu */
    public static void m121995hu(int i11) {
        m121731av("NOTI_CONFIG_MIN_MSG_ACCEPT_MUTE", i11, true);
    }

    /* renamed from: hv */
    public static void m121996hv(String str) {
        m121806cv(m122038j("FEED_PRIVACY_RECENT_LIST_%s"), str, false);
    }

    /* renamed from: hw */
    public static void m121997hw(long j11) {
        m121769bv("roll_cache_sticker", j11, false);
    }

    /* renamed from: hx */
    public static void m121998hx(boolean z11) {
        AbstractC0908e0.m2818l("PRIVACY_SETTINGS_SHOW_ONLINE_STATUS_" + m121738b1(), z11, true);
    }

    /* renamed from: hy */
    public static void m121999hy(String str) {
        AbstractC0908e0.m2825s(m122038j("TAB_MESSAGE_ADS_REMOVED_ITEMS%s"), str, true);
    }

    /* renamed from: hz */
    public static void m122000hz(int i11) {
        m121731av("UPDATE_PHONE_BOOK_STATUS", i11, true);
    }

    /* renamed from: i */
    private static String m122001i(String str, int i11) {
        return str.replace("%d", "" + i11);
    }

    /* renamed from: i0 */
    public static String m122002i0() {
        return m122013ia("CONFIG_CHECK_SCROLLING_LOAD_IMAGE", "", true);
    }

    /* renamed from: i1 */
    public static String m122003i1() {
        return m122013ia("DEFAUL_AVT_URL", "", true);
    }

    /* renamed from: i2 */
    public static boolean m122004i2() {
        return m121899fa("SETTING_ENABLE_CHAT_HEAD_SERVER", true, true);
    }

    /* renamed from: i3 */
    public static int m122005i3() {
        return m121937ga("ENABLE_SEARCH_MENTION_WITHOUT_PREFIX", 1, true);
    }

    /* renamed from: i4 */
    public static long m122006i4() {
        return m121975ha("FETCH_PRELOAD_INFO_DURATION", 0L, true);
    }

    /* renamed from: i5 */
    public static int m122007i5(Context context) {
        Context appContext;
        float f11;
        int m121937ga = m121937ga("keyboard_height", 0, true);
        if (context.getResources().getConfiguration().orientation == 2 && m121937ga > (context.getResources().getDisplayMetrics().heightPixels * 2.0f) / 3.0f) {
            return context.getResources().getDisplayMetrics().heightPixels / 2;
        }
        if (AbstractC23136l9.m118654H0(MainApplication.getAppContext())) {
            appContext = MainApplication.getAppContext();
            f11 = 195.0f;
        } else {
            appContext = MainApplication.getAppContext();
            f11 = 200.0f;
        }
        return Math.max(m121937ga, AbstractC23136l9.m118712h(appContext, f11));
    }

    /* renamed from: i6 */
    public static long m122008i6() {
        return m121975ha("LAST_TIME_GET_INFO_LAST_KNOW_LOCATION", 0L, true);
    }

    /* renamed from: i7 */
    public static long m122009i7() {
        return m121975ha("timestampCleanStoryVideo", 0L, true);
    }

    /* renamed from: i8 */
    public static long m122010i8() {
        return m121975ha("LIVE_LOCATION_LAST_CLEAN_TIME", 0L, true);
    }

    /* renamed from: i9 */
    public static int m122011i9() {
        return m121937ga(m122038j("NEED_SYNC_STICKER_LIST_%s"), 0, true);
    }

    /* renamed from: iA */
    public static boolean m122012iA() {
        return m121899fa("sync_message_error_shown_" + m121738b1(), true, true);
    }

    /* renamed from: ia */
    public static String m122013ia(String str, String str2, boolean z11) {
        return AbstractC0908e0.m2816j(str, str2, true, z11);
    }

    /* renamed from: ib */
    public static long m122014ib() {
        return m121975ha("roll_cache_sticker", 0L, false);
    }

    /* renamed from: ic */
    public static int m122015ic() {
        return m121937ga("SQLITE_FLAG_HANDLE_EXCEPTION", 0, true);
    }

    /* renamed from: id */
    public static int m122016id() {
        return m121937ga("TIME_REMIND_DIALOG_UPDATE_PHONEBOOK_" + m121738b1(), 0, true);
    }

    /* renamed from: ie */
    public static boolean m122017ie() {
        return m121899fa("SETTING_VOIP_PRESELECT_ENABLE", true, true);
    }

    /* renamed from: if */
    public static boolean m122018if() {
        return m121899fa("ENABLE_KICK_OUT_ON_IMEI_CHANGED", true, true);
    }

    /* renamed from: ig */
    public static boolean m122019ig() {
        return m121899fa("enable_zam", false, true);
    }

    /* renamed from: ih */
    public static void m122020ih() {
        m121506Ut(false);
        m121845dw(false);
        m122580xi("");
        m121429Sq(0L);
    }

    /* renamed from: ii */
    public static void m122021ii(int i11) {
        m121731av("CHAT_HEAD_EXPIRED_SPAM_TIME", i11, false);
    }

    /* renamed from: ij */
    public static void m122022ij(String str, boolean z11) {
        m121806cv(m122038j("currentLanguageSetting_%s"), str, !z11);
        if (!z11) {
            AbstractC26084s.m134269q(2, 79);
        }
    }

    /* renamed from: ik */
    public static void m122023ik(int i11) {
        m121731av("ENABLE_BADGE_NOTI_NEW_BRANDS", i11, true);
    }

    /* renamed from: il */
    public static void m122024il(boolean z11) {
        m121692Zu("FIRST_TIME_GET_DATA_BG_FEED", z11, false);
    }

    /* renamed from: im */
    public static void m122025im(boolean z11) {
        m121692Zu("picker_prefer_local_path_over_uri", z11, true);
    }

    /* renamed from: in */
    public static void m122026in(boolean z11) {
        m121692Zu("setting_suggest_maybe_you_now" + m121738b1(), z11, true);
    }

    /* renamed from: io */
    public static void m122027io(boolean z11) {
        AbstractC0908e0.m2819m(m122038j("FEED_REMIND_PROMOTE_MEMORY_%s"), z11, true, true);
    }

    /* renamed from: ip */
    public static void m122028ip(boolean z11) {
        m121692Zu("INSERT_VIDEO_INTO_MEDIA_STORE_USING_PRE_Q_LOGIC", z11, true);
    }

    /* renamed from: iq */
    public static void m122029iq(long j11) {
        m121769bv(m122038j("LAST_SUGGEST_CHAT_LIST_ID_%s"), j11, true);
    }

    /* renamed from: ir */
    public static void m122030ir(long j11) {
        m121769bv(m122038j("lastTimeShowUpdateAvatar_%s"), j11, true);
    }

    /* renamed from: is */
    public static void m122031is(int i11) {
        m121731av(m122038j("LAST_VALUE_PERMISSION_CONTACT_SYSTEM_%s"), i11, true);
    }

    /* renamed from: iu */
    public static void m122032iu(String str) {
        m121806cv("NOTIFICATION_MANAGER_CONFIG", str, true);
    }

    /* renamed from: iv */
    public static void m122033iv(int i11) {
        m121731av(m122038j("SETTING_ALLOW_VIEW_SOCIAL%s"), i11, false);
    }

    /* renamed from: iw */
    public static void m122034iw(boolean z11) {
        m121692Zu("ENABLE_PUBLIC_GROUP_IN_ROOM", z11, false);
    }

    /* renamed from: ix */
    public static void m122035ix(boolean z11) {
        m121692Zu("SHOW_POPUP_CONFIRM_DELETE_MSG", z11, true);
    }

    /* renamed from: iy */
    public static void m122036iy(String str) {
        AbstractC0908e0.m2825s("TENOR_STICKER_MAP_DATA", str, false);
    }

    /* renamed from: iz */
    public static void m122037iz(String str) {
        m121806cv("updateProfileStatus", str, true);
    }

    /* renamed from: j */
    private static String m122038j(String str) {
        return m122076k(str, "%s");
    }

    /* renamed from: j0 */
    public static String m122039j0() {
        return m122013ia("CHECKSUM_THEME_FOLDER_" + m121738b1(), "", true);
    }

    /* renamed from: j1 */
    public static String m122040j1() {
        return m122013ia("defaultChatBg" + m121738b1(), "", true);
    }

    /* renamed from: j2 */
    public static boolean m122041j2() {
        return m121899fa("ENABLE_CHAT_PHOTO_SLIDER", true, true);
    }

    /* renamed from: j3 */
    public static int m122042j3() {
        return m121937ga("IS_ENABLE_SEARCH_PHONE_GLOBAL_SEARCH", 0, true);
    }

    /* renamed from: j4 */
    public static int m122043j4() {
        return m121937ga(m122038j("FILE_LIST_SORT_BY_%s"), 0, true);
    }

    /* renamed from: j5 */
    public static int m122044j5() {
        return m121937ga("KILL_CHAT_HEAD_COUNT", 0, false);
    }

    /* renamed from: j6 */
    public static long m122045j6() {
        return m121975ha(m122038j("LAST_TIME_GET_OA_SUGGEST_LIST_%s"), 0L, false);
    }

    /* renamed from: j7 */
    public static long m122046j7() {
        return m121975ha("timestampClearWebviewCache", 0L, false);
    }

    /* renamed from: j8 */
    public static String m122047j8() {
        return m122013ia("Local_backup_Info" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: j9 */
    public static boolean m122048j9() {
        return m121899fa("needToShowPassCodeScreen", false, false);
    }

    /* renamed from: jA */
    public static boolean m122049jA() {
        return m121899fa("SHOULD_REMIND_UPDATE_MINI_CHAT_PERMISSION", false, true);
    }

    /* renamed from: ja */
    public static int m122050ja() {
        return m121937ga("PRELOAD_WEBVIEW_NETWORK_CONDITION", 0, true);
    }

    /* renamed from: jb */
    public static int m122051jb() {
        return m121937ga("SAMPLING_RATE_VOICE_MSG", 16000, true);
    }

    /* renamed from: jc */
    public static boolean m122052jc() {
        return m121899fa("STATE_CHECK_BOX_SYNC_THEME", true, true);
    }

    /* renamed from: jd */
    public static long m122053jd() {
        return m121975ha("TIME_SHOW_SUGGEST_REMOVE_FRIEND", 0L, false);
    }

    /* renamed from: je */
    public static int m122054je() {
        return m121937ga("SETTING_VOIP_PRESELECT_EXPIRE_TIME", 60000, true);
    }

    /* renamed from: jf */
    public static boolean m122055jf() {
        return m121899fa("ENABLE_LIKE_COMMENT_FEED", true, true);
    }

    /* renamed from: jg */
    public static boolean m122056jg() {
        return m121899fa("enable_zam_upload", false, true);
    }

    /* renamed from: jh */
    public static void m122057jh(Context context) {
        m122552wr(0L);
        m122593xv("");
        m121177Lx(false);
        AbstractC23304d.f113414n0 = 123229;
        m121396Ru("");
        m121068Iz("");
        m122225nx("");
        AbstractC23304d.f113418o0 = 123214;
        m121065Iw("");
        m122135lj(context, "");
        m121148L4();
    }

    /* renamed from: ji */
    public static void m122058ji(int i11) {
        m121731av("CHAT_HEAD_SPAM_COUNT", i11, false);
    }

    /* renamed from: jj */
    public static void m122059jj(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Zalo", 0).edit();
        edit.putString("CURRENT_USER_UID_FLOW_RESTORE_APP", str);
        edit.commit();
    }

    /* renamed from: jk */
    public static void m122060jk(boolean z11) {
        m121692Zu("enable_block_canary", z11, true);
    }

    /* renamed from: jl */
    public static void m122061jl(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_GROUP_CALL_ENTRY_POINT_CHAT_TAB_HEADER_MORE", z11, true);
    }

    /* renamed from: jm */
    public static void m122062jm(boolean z11) {
        AbstractC0908e0.m2819m(m122038j("ENABLE_PRELOAD_FEED_EFFECT_%s"), z11, true, true);
    }

    /* renamed from: jn */
    public static void m122063jn(int i11) {
        boolean z11;
        C26446c m136326b = C26446c.m136326b();
        if (i11 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        m136326b.m136334i(z11);
        m121731av("FLAG_ENABLE_SETTING_SUGGEST_ME_DATAMINING", i11, true);
    }

    /* renamed from: jo */
    public static void m122064jo(boolean z11) {
        m121692Zu("FEED_REMIND_PROMOTE_PHOTO", z11, true);
    }

    /* renamed from: jp */
    public static void m122065jp(String str) {
        m121806cv("ZALO-INSTALLATION-UNIQUE-ID-" + m121738b1(), str, true);
    }

    /* renamed from: jq */
    public static void m122066jq(long j11) {
        m121769bv("LAST_TIME_ANIMATION_ERROR", j11, true);
    }

    /* renamed from: jr */
    public static void m122067jr(long j11) {
        m121769bv("LAST_TIME_SHOW_WARNING_NOTIF", j11, true);
    }

    /* renamed from: js */
    public static void m122068js(int i11) {
        m121731av(m122038j("LAST_VALUE_SETTING_SYNC_MSG_BACKUP_RESTORE_%s"), i11, true);
    }

    /* renamed from: jt */
    public static void m122069jt(int i11) {
        m121731av("SETTING_MAX_PERCENT_OF_FREE_STORAGE_FOR_ZINSTANT_CACHE", i11, true);
    }

    /* renamed from: ju */
    public static void m122070ju(boolean z11) {
        m121692Zu("NOTIFICATION_MANAGER_MANUAL_PLAY_SOUND_VIBRATION", z11, true);
    }

    /* renamed from: jv */
    public static void m122071jv(boolean z11) {
        m121692Zu(m122038j("PRIVACY_SETTING_AUTO_ADD_FRIEND_%s"), z11, true);
    }

    /* renamed from: jw */
    public static void m122072jw(long j11) {
        m121769bv("SQLITE_NATIVE_BACKUP_TIME_INTERVAL", j11, true);
    }

    /* renamed from: jx */
    public static void m122073jx(String str) {
        m121806cv("show_popup_maintab", str, true);
    }

    /* renamed from: jy */
    public static void m122074jy(long j11) {
        m121769bv("TIME_BUBBLE_CALL_NATIVE" + CoreUtility.f89233i, j11, true);
    }

    /* renamed from: jz */
    public static void m122075jz(boolean z11) {
        m121692Zu("uploadAllLogTest" + m121738b1(), z11, true);
    }

    /* renamed from: k */
    private static String m122076k(String str, String str2) {
        String m121738b1;
        if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
            m121738b1 = CoreUtility.f89233i;
        } else {
            m121738b1 = m121738b1();
        }
        return str.replace(str2, m121738b1);
    }

    /* renamed from: k0 */
    public static boolean m122077k0() {
        return m121899fa("CLICK_EVENT_ICON_" + CoreUtility.f89233i, true, true);
    }

    /* renamed from: k1 */
    public static String m122078k1() {
        return m122013ia("DEFAUL_GROUP_AVT_URL", "https://s120.ava.grp.talk.zdn.vn/default", true);
    }

    /* renamed from: k2 */
    public static boolean m122079k2() {
        return m121899fa("CONFIG_ENABLE_CLONE_GROUP", false, true);
    }

    /* renamed from: k3 */
    public static int m122080k3() {
        return m121937ga("ENABLE_SELECT_BUBBLE", 1, true);
    }

    /* renamed from: k4 */
    public static int m122081k4() {
        return m121937ga(m122038j("FilterSexUserNearBy_%s"), -1, true);
    }

    /* renamed from: k5 */
    public static long m122082k5() {
        return m121975ha("KILL_CHAT_HEAD_DISABLE_TIME", -1L, false);
    }

    /* renamed from: k6 */
    public static long m122083k6() {
        return m121975ha("LASTTIME_GET_LIST_PIN_MSG" + m121738b1(), 0L, true);
    }

    /* renamed from: k7 */
    public static long m122084k7() {
        return m121975ha("LAST_TIMESTAMP_GET_BROADCAST_HTTP", 0L, false);
    }

    /* renamed from: k8 */
    public static boolean m122085k8() {
        return m121899fa("LOCK_SOCKET_FOR_SHOW_RESTORE_CHAT_DB_" + m121738b1(), false, true);
    }

    /* renamed from: k9 */
    public static long m122086k9() {
        return m121975ha("NEED_TO_UPDATE_ZALO_FRIEND_PROFILE" + m121738b1(), 0L, true);
    }

    /* renamed from: kA */
    public static boolean m122087kA() {
        return m121899fa("CONFIG_SHOW_CONTACT_PERMISSION", false, true);
    }

    /* renamed from: ka */
    public static boolean m122088ka() {
        return m121899fa("PRELOAD_WEBVIEW_SERVER_SETTING", true, true);
    }

    /* renamed from: kb */
    public static int m122089kb() {
        return m121937ga("SAVE_SETTING_FONT_SELECTED_POSITION" + m121738b1(), 0, true);
    }

    /* renamed from: kc */
    public static boolean m122090kc() {
        return m121899fa("passcode_isInCall", false, false);
    }

    /* renamed from: kd */
    public static long m122091kd() {
        return m121975ha("TIME_SKIP_SYNC_CONTACT_REMOVE_FRIEND", 172800000L, false);
    }

    /* renamed from: ke */
    public static int m122092ke() {
        return m121937ga("SETTING_VOIP_PRESELECT_THRESHOLD_MESSAGE_CALL", 70, true);
    }

    /* renamed from: kf */
    public static boolean m122093kf() {
        return m121899fa("FLAG_ENTRY_POINT_LOCATION_POST_FEED", true, true);
    }

    /* renamed from: kg */
    public static boolean m122094kg() {
        return m121899fa("FIRST_TIME_DELETE_MESSAGE_EVERYONE_" + m121738b1(), true, false);
    }

    /* renamed from: kh */
    public static void m122095kh() {
        m121105Jz(0);
    }

    /* renamed from: ki */
    public static void m122096ki(long j11) {
        m121769bv("CHAT_PHOTO_SLIDER_STAY_DURATION", j11, true);
    }

    /* renamed from: kj */
    public static void m122097kj(String str) {
        m121806cv("CurrentUserExtendProfile" + m121738b1(), str, true);
    }

    /* renamed from: kk */
    public static void m122098kk(boolean z11) {
        m121692Zu("ENABLE_BLOCK_INVITE_ME", z11, false);
    }

    /* renamed from: kl */
    public static void m122099kl(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_GROUP_CALL_ENTRY_POINT_GROUP_HEADER", z11, true);
    }

    /* renamed from: km */
    public static void m122100km(boolean z11) {
        m121692Zu(m122038j("ENABLE_PRELOAD_PHOTO_DETAILS_VIEWFULL_%s"), z11, true);
    }

    /* renamed from: kn */
    public static void m122101kn(boolean z11) {
        m121692Zu("ENABLE_SUGGEST_PROMOTION", z11, true);
    }

    /* renamed from: ko */
    public static void m122102ko(boolean z11) {
        m121692Zu("FEED_REMIND_PROMOTE_VIDEO", z11, true);
    }

    /* renamed from: kp */
    public static void m122103kp(int i11) {
        m121731av("SETTING_INTERVAL_DAY_OF_CLEAN_ZINSTANT_CACHE", i11, true);
    }

    /* renamed from: kq */
    public static void m122104kq(long j11) {
        m121769bv("LAST_TIME_APP_ALIVE", j11, false);
    }

    /* renamed from: kr */
    public static void m122105kr(long j11) {
        m121769bv("LAST_TIME_SUBMIT_EXTRA_CONTACT", j11, true);
    }

    /* renamed from: ks */
    public static void m122106ks(int i11) {
        AbstractC0908e0.m2820n("last_sync_setting_sync_network_condition_" + m121738b1(), i11, true);
    }

    /* renamed from: kt */
    public static void m122107kt(int i11) {
        m121731av("MAX_PHONES_SUPPORT", i11, true);
    }

    /* renamed from: ku */
    public static void m122108ku(boolean z11) {
        m121692Zu("NOTIFICATION_MANAGER_MANUAL_PLAY_SOUND_VIBRATION_LOCAL", z11, true);
    }

    /* renamed from: kv */
    public static void m122109kv(int i11) {
        m121731av(m122038j("PRIVACY_SETTINGS_SETTING_COMMENT_%s"), i11, true);
    }

    /* renamed from: kw */
    public static void m122110kw(int i11) {
        m121731av("SAMPLING_RATE_VOICE_MSG", i11, true);
    }

    /* renamed from: kx */
    public static void m122111kx(int i11) {
        m121731av("showStickerTip", i11, true);
    }

    /* renamed from: ky */
    public static void m122112ky(long j11) {
        AbstractC0908e0.m2824r(m122038j("TIME_CLEAR_HINT_FRIEND_REQUEST_%s"), j11, true, true);
    }

    /* renamed from: kz */
    public static void m122113kz(String str) {
        m121806cv("UPLOAD_CONFIG_SERVER", str, true);
    }

    /* renamed from: l */
    public static String m122114l() {
        return m122013ia("ABUSE_CONFIG_JSON", "", true);
    }

    /* renamed from: l0 */
    public static int m122115l0() {
        return m121937ga(m122038j("CLOSE_COUNT_HINT_ON_NOTIFICATION_%s"), -1, false);
    }

    /* renamed from: l1 */
    public static String m122116l1(String str) {
        return m122013ia("DEFAULT_LIBRARY_CHECKSUM_" + str, "", true);
    }

    /* renamed from: l2 */
    public static int m122117l2() {
        return m121937ga("FLAG_COLLAPSE_CONVERSATION_FOR_SHOW_SUGGEST", 0, true);
    }

    /* renamed from: l3 */
    public static boolean m122118l3() {
        return m121899fa(m122038j("ENABLE_SETTING_BLOCK_SOCIAL_TIMELINE_%s"), true, true);
    }

    /* renamed from: l4 */
    public static boolean m122119l4() {
        return m121899fa("FRIEND_FROM_NATIVE_ENTRY_POINT_ADD_FRIEND_" + m121738b1(), true, true);
    }

    /* renamed from: l5 */
    public static long m122120l5() {
        return m121975ha("KILL_CHAT_HEAD_START_TIME", -1L, false);
    }

    /* renamed from: l6 */
    public static long m122121l6() {
        return m121975ha("LAST_TIME_GET_LIST_THEME", 0L, true);
    }

    /* renamed from: l7 */
    public static long m122122l7() {
        return m121975ha("timestampGetFriendRequestMsgTabList_V2" + m121738b1(), 0L, false);
    }

    /* renamed from: l8 */
    public static boolean m122123l8() {
        return m121899fa("LOGIN_NEW_DEVICE_FLAG" + m121738b1(), false, true);
    }

    /* renamed from: l9 */
    public static String m122124l9() {
        return m122013ia("NEW_CHAT_BAR_CONFIG", "", true);
    }

    /* renamed from: lA */
    public static void m122125lA(boolean z11) {
        m121692Zu(m122038j("SHOW_FIND_FRIEND_NATIVE_TAB_MESSSAGE_%s"), z11, true);
    }

    /* renamed from: la */
    public static boolean m122126la() {
        return m121899fa("SavePreviewMessage" + m121738b1(), true, true);
    }

    /* renamed from: lb */
    public static int m122127lb() {
        return m121937ga("SaveSettingActiveFriend" + m121738b1(), 0, true);
    }

    /* renamed from: lc */
    public static int m122128lc() {
        return m121937ga("STATE_SYNC_CONTACT_NATIVE" + m121738b1(), 1, true);
    }

    /* renamed from: ld */
    public static long m122129ld() {
        return m121975ha("time_to_upload_qos", 1L, true);
    }

    /* renamed from: le */
    public static int m122130le() {
        return m121937ga("VOIP_TIME_AWAIT", 1500, false);
    }

    /* renamed from: lf */
    public static boolean m122131lf() {
        return m121899fa("IS_ENABLE_NEW_RESIZE_PHOTO_LOGIC", true, true);
    }

    /* renamed from: lg */
    public static boolean m122132lg() {
        return m121899fa("FIRST_TIME_OPEN_CALENDAR", true, true);
    }

    /* renamed from: lh */
    public static void m122133lh(String str) {
        AbstractC0908e0.m2826t("CURRENT_TOPIC_THRESHOLD_ARRAY", str, true, true);
    }

    /* renamed from: li */
    public static void m122134li(boolean z11) {
        m121692Zu("CHAT_TYPO_FEATURE_ENABLE", z11, true);
    }

    /* renamed from: lj */
    public static void m122135lj(Context context, String str) {
        m121806cv("currentUserUid", str, true);
        m121806cv("currentUserUid", str, false);
        m122059jj(context, str);
    }

    /* renamed from: lk */
    public static void m122136lk(int i11) {
        AbstractC0908e0.m2820n(m122038j("ENABLE_BOOST_VOLUME_IN_CALL%s"), i11, true);
    }

    /* renamed from: ll */
    public static void m122137ll(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_GROUP_CALL_ENTRY_POINT_GROUP_TAB_ROW", z11, true);
    }

    /* renamed from: lm */
    public static void m122138lm(boolean z11) {
        m121692Zu("ENABLE_PREVIEW_PHOTO_POSTFEED", z11, true);
    }

    /* renamed from: ln */
    public static void m122139ln(boolean z11) {
        m121692Zu("ENABLE_SUGGEST_REMOVE_FRIEND", z11, false);
    }

    /* renamed from: lo */
    public static void m122140lo(int i11) {
        m121731av(m122038j("feedThumbSetting_%s"), i11, true);
    }

    /* renamed from: lp */
    public static void m122141lp(long j11) {
        m121769bv("intervalGetGroupList", j11, false);
    }

    /* renamed from: lq */
    public static void m122142lq(long j11) {
        m121769bv("SaveLastTimeAutoLogin", j11, true);
    }

    /* renamed from: lr */
    public static void m122143lr(long j11) {
        m121769bv("LAST_TIME_TIME_SUBMIT_TIME_ON_APP", j11, true);
    }

    /* renamed from: ls */
    public static void m122144ls(int i11) {
        m121731av("LAST_VERSION_CODE", i11, true);
    }

    /* renamed from: lt */
    public static void m122145lt(int i11) {
        m121731av("GIF_MAX_PREIVEW_SIZE", i11, true);
    }

    /* renamed from: lu */
    public static void m122146lu(int i11) {
        AbstractC0908e0.m2821o(m122038j("SAVE_NUM_NEW_MEMORY_ENTRY_%s"), i11, true, true);
    }

    /* renamed from: lv */
    public static void m122147lv(boolean z11) {
        m121692Zu(m122038j("PRIVACY_SETTING_FRIEND_REQUEST_CONTACT_%s"), z11, true);
    }

    /* renamed from: lw */
    public static void m122148lw(Context context, int i11, boolean z11) {
        boolean z12;
        int m122089kb = m122089kb();
        m121731av("SAVE_SETTING_FONT_SELECTED_POSITION" + m121738b1(), i11, true);
        if (i11 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        C13778s1.m76971l(z12);
        AbstractC17148f0.m91699r();
        if (m122089kb != i11 && z11) {
            C28685a.m143693b(context).m143696d(new Intent("com.zing.zalo.action.ACTION_FONT_CHANGED"));
        }
        AbstractC26084s.m134257e(2, "setting_12", true);
    }

    /* renamed from: lx */
    public static void m122149lx(boolean z11) {
        m121692Zu("STATUS_CAN_SHOW_STICKY_ADS", z11, true);
    }

    /* renamed from: ly */
    public static void m122150ly(long j11) {
        m121769bv(m122038j("TIME_CLEAR_SUGGEST_FRIEND_%s"), j11, true);
    }

    /* renamed from: lz */
    public static void m122151lz(int i11) {
        m121731av("LIMIT_UPLOAD_FILE_SIZE", i11, true);
    }

    /* renamed from: m */
    public static boolean m122152m() {
        return m121899fa("acceptBackgroundCheck" + m121738b1(), false, true);
    }

    /* renamed from: m0 */
    public static String m122153m0() {
        return m122013ia(m122038j("invited_close_friend_list_%s"), "", false);
    }

    /* renamed from: m1 */
    public static String m122154m1() {
        return m122013ia("DEFAULT_LIVE_EMOJI", "/-heart", true);
    }

    /* renamed from: m2 */
    public static boolean m122155m2() {
        return m121899fa("ENABLE_COMMENT_PHOTO_STICKER", true, true);
    }

    /* renamed from: m3 */
    public static boolean m122156m3() {
        return m121899fa("ENABLE_SETTING_IN_APP_NOTIFICATION_" + m121738b1(), true, true);
    }

    /* renamed from: m4 */
    public static boolean m122157m4() {
        return m121899fa("FRIEND_FROM_NATIVE_ENTRY_POINT_TAB_CONTACT_" + m121738b1(), true, true);
    }

    /* renamed from: m5 */
    public static String m122158m5() {
        String m141604d = C28119l3.m141601c().m141604d();
        if (!TextUtils.isEmpty(m121738b1())) {
            return m122013ia(m122038j("currentLanguageSetting_%s"), m141604d, true);
        }
        return m141604d;
    }

    /* renamed from: m6 */
    public static long m122159m6() {
        return m121975ha("location_filter_time", 0L, false);
    }

    /* renamed from: m7 */
    public static long m122160m7() {
        return m121975ha("TIMESTAMP_GET_FRIEND_SUGGEST_TIMELINE_TAB_LIST_V2" + m121738b1(), 0L, false);
    }

    /* renamed from: m8 */
    public static String m122161m8() {
        return m122013ia("LONG_LAT_VALUE_DEVICE_INFO", "", true);
    }

    /* renamed from: m9 */
    public static int m122162m9() {
        return m121937ga("new_default_sticker_cate_id_download", 0, true);
    }

    /* renamed from: mA */
    public static void m122163mA() {
        m121769bv("DISCORVERY_LAST_TIME_CLEAN_UP", System.currentTimeMillis(), true);
    }

    /* renamed from: ma */
    public static String m122164ma() {
        return m122013ia(m122038j("FEED_PRIVACY_EXCLUDED_FRIENDS_%s"), "", false);
    }

    /* renamed from: mb */
    public static int m122165mb() {
        return m121937ga("SAVE_SETTING_THEME_SELECTED_POSITION", 0, true);
    }

    /* renamed from: mc */
    public static int m122166mc() {
        int i11;
        if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
            i11 = 6;
        } else {
            i11 = 0;
        }
        return m121937ga("STATUS_AUTO_DETECT_ISO_SIM_LANGUAGE_ONE", i11, true);
    }

    /* renamed from: md */
    public static int m122167md() {
        return m121937ga("RESET_SOCKET_WHEN_RECV_CALL_FIREBASE", 0, true);
    }

    /* renamed from: me */
    public static int m122168me() {
        return m121937ga("SETTING_ENABLE_VOIP_TIMEOUT_CALLER", IMediaPlayer.MEDIA_INFO_COMPLETED_AND_LOOP, true);
    }

    /* renamed from: mf */
    public static boolean m122169mf() {
        return m121899fa("okHttp", true, true);
    }

    /* renamed from: mg */
    public static boolean m122170mg() {
        return m121899fa("gif_auto_repeat", true, true);
    }

    /* renamed from: mh */
    public static void m122171mh() {
        try {
            m122135lj(MainApplication.getAppContext(), CoreUtility.f89233i);
            m121065Iw(CoreUtility.f89232h);
            m121396Ru(AbstractC23304d.f113394i0);
            m121400Ry(AbstractC23304d.f113410m0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mi */
    public static void m122172mi(int i11) {
        m121731av("CHAT_TYPO_ITEM_ID", i11, true);
    }

    /* renamed from: mj */
    public static void m122173mj(String str) {
        m121806cv("CUSTOM_THEMES_CHAT", str, true);
    }

    /* renamed from: mk */
    public static void m122174mk(boolean z11) {
        m121692Zu("ENABLE_BOUNCING_ENTRYPOINT_BG_FEED", z11, true);
    }

    /* renamed from: ml */
    public static void m122175ml(boolean z11) {
        m121692Zu("ENABLE_GROUP_LINK", z11, true);
    }

    /* renamed from: mm */
    public static void m122176mm(boolean z11) {
        m121692Zu(m122038j("ENABLE_PROFILE_MUSIC_%s"), z11, true);
    }

    /* renamed from: mn */
    public static void m122177mn(boolean z11) {
        m121692Zu("ENABLE_SUGGEST_SICKER_WITH_ONE_EMOJI", z11, true);
    }

    /* renamed from: mo */
    public static void m122178mo(long j11) {
        m121769bv("FETCH_PRELOAD_INFO_DURATION", j11, true);
    }

    /* renamed from: mp */
    public static void m122179mp(long j11) {
        m121769bv("INTERVAL_REGISTER_SEEN_LAST_ACTIVE", j11, true);
    }

    /* renamed from: mq */
    public static void m122180mq(long j11) {
        m121769bv("BACKUP_DB_TO_LOCAL_WITH_USERID_IS_" + CoreUtility.f89233i, j11, true);
    }

    /* renamed from: mr */
    public static void m122181mr(long j11) {
        m121769bv(m122038j("LAST_TIME_SUBMIT_PHONEBOOK_DISPLAY_%s"), j11, true);
    }

    /* renamed from: ms */
    public static void m122182ms(String str) {
        m121806cv("LIBRARIES_INFO_JSON", str, true);
    }

    /* renamed from: mt */
    public static void m122183mt(int i11, int i12) {
        m121731av(m122001i("MAX_RECORD_TO_SUBMIT_ZALOTRACKING_%d", i12), i11, true);
    }

    /* renamed from: mu */
    public static void m122184mu(int i11) {
        m121731av("NUM_NEW_MY_GROUP", i11, false);
    }

    /* renamed from: mv */
    public static void m122185mv(boolean z11) {
        m121692Zu(m122038j("PRIVACY_SETTING_FRIEND_REQUEST_GROUP_%s"), z11, true);
    }

    /* renamed from: mw */
    public static void m122186mw(int i11) {
        m121731av("SaveSettingActiveFriend" + m121738b1(), i11, true);
    }

    /* renamed from: mx */
    public static void m122187mx(boolean z11) {
        m121692Zu(m122038j("MENU_SUGGEST_CHAT_MSG_TAB_%s"), z11, true);
    }

    /* renamed from: my */
    public static void m122188my(long j11) {
        m121769bv("CONFIG_TIME_DISABLE_AUTO_OPEN_FILE_DOWNLOADED", j11, true);
    }

    /* renamed from: mz */
    public static void m122189mz(boolean z11) {
        m121692Zu("uploadIfFailSameNetwork" + m121738b1(), z11, true);
    }

    /* renamed from: n */
    public static boolean m122190n() {
        return m121899fa("acceptTestOnMobileNetwork" + m121738b1(), true, true);
    }

    /* renamed from: n0 */
    public static long m122191n0() {
        return m121975ha(m122038j("CLOSE_HINT_ON_NOTIFICATION_TIME_%s"), 0L, false);
    }

    /* renamed from: n1 */
    public static int m122192n1() {
        return m121937ga("DEFAULT_MAX_SIZE_VOICE_MSG", 16, true);
    }

    /* renamed from: n2 */
    public static boolean m122193n2() {
        return m121899fa("ENABLE_CREATE_GROUP_GROUP_1_1", true, true);
    }

    /* renamed from: n3 */
    public static int m122194n3() {
        return m121937ga("ENABLE_SETTING_ONLINE_STATUS", 0, true);
    }

    /* renamed from: n4 */
    public static int m122195n4() {
        return m121937ga("gdrive_token_invalid_" + m121738b1(), 0, true);
    }

    /* renamed from: n5 */
    public static String m122196n5() {
        return m122013ia("CURRENT_LANGUAGE_SETTING_WITHOUT_USERID", C28119l3.m141601c().m141604d(), true);
    }

    /* renamed from: n6 */
    public static long m122197n6() {
        return m121975ha("LASTTIME_TO_GET_SETTING_MAPPING_KWD", 0L, true);
    }

    /* renamed from: n7 */
    public static long m122198n7() {
        return m121975ha("timestampGetGroupList", 0L, false);
    }

    /* renamed from: n8 */
    public static String m122199n8() {
        return m122013ia("MAJOR_COUNTRY_LIST", "", true);
    }

    /* renamed from: n9 */
    public static int m122200n9() {
        return m121937ga("new_sticker_default_cate_id", 0, true);
    }

    /* renamed from: nA */
    public static boolean m122201nA() {
        return m121899fa("CHECK_CONNECTION_AVAILABLE", true, true);
    }

    /* renamed from: na */
    public static String m122202na() {
        return m122013ia(m122038j("FEED_PRIVACY_RECENT_LIST_%s"), "", false);
    }

    /* renamed from: nb */
    public static int m122203nb() {
        return m121937ga("SCALE_EMOJI_SYSTEM_LARGE", 0, true);
    }

    /* renamed from: nc */
    public static boolean m122204nc() {
        return AbstractC0908e0.m2808b(m122038j("NEW_FEATURE_UNDO_MSG_%s"), true, true);
    }

    /* renamed from: nd */
    public static long m122205nd() {
        return m121975ha("timestampGetListFollow", 86400000L, false);
    }

    /* renamed from: ne */
    public static boolean m122206ne() {
        return m121899fa("WAITING_FOR_COMPARE_" + m121738b1(), false, true);
    }

    /* renamed from: nf */
    public static boolean m122207nf() {
        return m121899fa("ENABLE_OPEN_SHARED_TIMELINE_FOR_FRIEND", true, true);
    }

    /* renamed from: ng */
    public static boolean m122208ng() {
        return m121899fa("gif_enable", true, true);
    }

    /* renamed from: nh */
    public static void m122209nh(String str) {
        AbstractC0908e0.m2825s("pc_request_sync_data_" + m121738b1(), str, true);
    }

    /* renamed from: ni */
    public static void m122210ni(int i11) {
        m121731av("CHAT_TYPO_NUM_OF_CHAR_LIMIT", i11, true);
    }

    /* renamed from: nj */
    public static void m122211nj(long j11, int i11) {
        m121769bv(m122001i("DATA_EXPIRE_TIME_ZALO_TRACKING_LOG_%d", i11), j11, true);
    }

    /* renamed from: nk */
    public static void m122212nk(boolean z11) {
        m121692Zu("cached_location", z11, true);
    }

    /* renamed from: nl */
    public static void m122213nl(boolean z11) {
        m121692Zu("ENABLE_GROUP_MENTION_STACK", z11, false);
    }

    /* renamed from: nm */
    public static void m122214nm(boolean z11) {
        m121692Zu("ENABLE_PROFILE_PHOTO_COUNT", z11, true);
    }

    /* renamed from: nn */
    public static void m122215nn(boolean z11) {
        m121692Zu("ENABLE_SUPPORT_EXTRA_DB", z11, true);
    }

    /* renamed from: no */
    public static void m122216no(int i11) {
        m121731av(m122038j("FILE_LIST_SORT_BY_%s"), i11, true);
    }

    /* renamed from: np */
    public static void m122217np(int i11) {
        m121731av("INTERVAL_RETRY_CONTACT_PHONEBOOK" + m121738b1(), i11, false);
    }

    /* renamed from: nq */
    public static void m122218nq(long j11) {
        m121769bv("LAST_TIME_CHECK_EXPIRE_NOTI_SOCIAL" + m121738b1(), j11, true);
    }

    /* renamed from: nr */
    public static void m122219nr(long j11) {
        AbstractC0908e0.m2823q("last_time_sync_setting_sync_mes_networ_" + m121738b1(), j11, true);
    }

    /* renamed from: ns */
    public static void m122220ns(int i11) {
        m121731av("BACKUP_MEDIA_LIMIT_TIME_DAY", i11, true);
    }

    /* renamed from: nt */
    public static void m122221nt(int i11) {
        m121731av("MAX_SELECTED_INVITE_TO_MULTI_GROUP", i11, true);
    }

    /* renamed from: nu */
    public static void m122222nu(int i11) {
        m121731av("numShowVoiceTip", i11, true);
    }

    /* renamed from: nv */
    public static void m122223nv(boolean z11) {
        m121692Zu(m122038j("PRIVACY_SETTING_FRIEND_REQUEST_PHONE_NUMBER_%s"), z11, true);
    }

    /* renamed from: nw */
    public static void m122224nw(Context context, int i11, boolean z11) {
        int m122165mb = m122165mb();
        m121731av("SAVE_SETTING_THEME_SELECTED_POSITION", i11, true);
        AbstractC17148f0.m91699r();
        if (m122165mb != i11 && z11) {
            C28685a.m143693b(context).m143696d(new Intent("com.zing.zalo.action.ACTION_THEME_CHANGED"));
        }
    }

    /* renamed from: nx */
    public static void m122225nx(String str) {
        m121806cv("sign", str, true);
    }

    /* renamed from: ny */
    public static void m122226ny(int i11) {
        m121731av("IN_APP_NOTIFICATION_DISPLAY", i11, true);
    }

    /* renamed from: nz */
    public static void m122227nz(boolean z11) {
        m121692Zu("CHECK_CONNECTION_AVAILABLE", z11, true);
    }

    /* renamed from: o */
    public static String m122228o() {
        return m122013ia("appBackupGdriveAccount" + m121738b1(), "", true);
    }

    /* renamed from: o0 */
    public static String m122229o0() {
        return m122013ia("clsInPause", "", false);
    }

    /* renamed from: o1 */
    public static int m122230o1() {
        return m121937ga("DEFAULT_PUSH_AVATAR_FEED", 1, true);
    }

    /* renamed from: o2 */
    public static int m122231o2() {
        return m121937ga(m122038j("ENABLE_CUSTOM_NOTIFICATION_CALL%s"), 0, true);
    }

    /* renamed from: o3 */
    public static int m122232o3() {
        return m121937ga("ENABLE_SHOW_PREVIEW_PICTURE_NOTI", 1, false);
    }

    /* renamed from: o4 */
    public static String m122233o4() {
        return m122013ia("STR_GENERAL_INFO_DISCOVER_SEARCH_1", "", true);
    }

    /* renamed from: o5 */
    public static long m122234o5() {
        return m121975ha("LAST_ACTION_ID_GET_BROADCAST_HTTP_" + m121738b1(), 0L, true);
    }

    /* renamed from: o6 */
    public static long m122235o6() {
        return m121975ha(m122038j("LAST_TIME_GET_MEMORY_ENTRY_TIMELINE_%s"), 0L, true);
    }

    /* renamed from: o7 */
    public static long m122236o7() {
        return m121975ha("timestampGetInfoUpdate", 0L, false);
    }

    /* renamed from: o8 */
    public static String m122237o8() {
        return AbstractC0908e0.m2815i("MALICIOUS_MIME_TYPE", "", true);
    }

    /* renamed from: o9 */
    public static long m122238o9() {
        return m121975ha(m122038j("NEXT_TIMESTAMP_RECALL_API_SYNC_EXTRA_PHONEBOOK_INFO_%s"), 0L, true);
    }

    /* renamed from: oa */
    public static boolean m122239oa() {
        return m121899fa(m122038j("PRIVACY_SETTING_ALLOW_INCOMMING_CALL_%s"), true, true);
    }

    /* renamed from: ob */
    public static String m122240ob(Context context) {
        return m122013ia("SEARCH_CMD_JSON", context.getString(AbstractC8020f0.default_search_cmd), true);
    }

    /* renamed from: oc */
    public static boolean m122241oc() {
        return m121899fa(m122038j("STATUS_SYNC_LANGUAGE_%s"), false, true);
    }

    /* renamed from: od */
    public static long m122242od() {
        return m121975ha("TSmsgOfflineHttp" + m121738b1(), 0L, true);
    }

    /* renamed from: oe */
    public static boolean m122243oe() {
        return m121899fa("WAITING_FOR_LOGIN_SUCCESS", true, true);
    }

    /* renamed from: of */
    public static boolean m122244of() {
        return m121899fa("aquery_opt_device_class", false, true);
    }

    /* renamed from: og */
    public static boolean m122245og() {
        return m121899fa("CONFIG_GROUP_CHAT_SWAP_SHARED_MEDIA_AND_SEARCH", true, true);
    }

    /* renamed from: oh */
    public static void m122246oh(String str) {
        m121806cv("ABUSE_CONFIG_JSON", str, true);
    }

    /* renamed from: oi */
    public static void m122247oi(long j11) {
        m121769bv("CHECK_DOWNLOAD_THEME_BEFORE_" + m121738b1(), j11, true);
    }

    /* renamed from: oj */
    public static void m122248oj(String str) {
        m121806cv("DATA_KICK_OUT", str, false);
    }

    /* renamed from: ok */
    public static void m122249ok(int i11) {
        m121731av(m122038j("ENABLE_CALL_ACTION_SOCIAL_FEED%s"), i11, true);
    }

    /* renamed from: ol */
    public static void m122250ol(int i11) {
        m121731av("CONFIG_ENABLE_GROUP_NAME_COLOR", i11, true);
    }

    /* renamed from: om */
    public static void m122251om(boolean z11) {
        m121692Zu("IS_ENABLE_PROFILE_USERNAME", z11, true);
    }

    /* renamed from: on */
    public static void m122252on(boolean z11) {
        m121692Zu("ENABLE_SUPPORT_HEIC_FORMAT", z11, true);
    }

    /* renamed from: oo */
    public static void m122253oo(int i11) {
        m121731av(m122038j("FilterSexUserNearBy_%s"), i11, true);
    }

    /* renamed from: op */
    public static void m122254op(long j11) {
        m121769bv("INTERVAL_START_BACKGROUND_SERVICE_TIMESTAMP", j11, true);
    }

    /* renamed from: oq */
    public static void m122255oq(long j11) {
        m121769bv("lastTimeCheckNetwork" + m121738b1(), j11, true);
    }

    /* renamed from: or */
    public static void m122256or(long j11) {
        m121769bv(m122038j("LASTTIME_SUBMIT_VALUE_PERMISSION_CONTACT_INAPP_%s"), j11, true);
    }

    /* renamed from: os */
    public static void m122257os(int i11) {
        m121731av("LIMIT_FILE_SIZE_AUTO_DOWNLOAD", i11, true);
    }

    /* renamed from: ot */
    public static void m122258ot(int i11) {
        m121731av("CONFIG_MAX_STRANGER_ADDED_TO_GROUP_PER_SESSION", i11, true);
    }

    /* renamed from: ou */
    public static void m122259ou(int i11) {
        m121731av("NUMBER_BUBBLE_CALL_NATIVE" + CoreUtility.f89233i, i11, true);
    }

    /* renamed from: ov */
    public static void m122260ov(boolean z11) {
        m121692Zu(m122038j("PRIVACY_SETTING_FRIEND_REQUEST_QRCODE_%s"), z11, true);
    }

    /* renamed from: ow */
    public static void m122261ow(int i11) {
        m121731av("SCALE_EMOJI_SYSTEM_LARGE", i11, true);
    }

    /* renamed from: ox */
    public static void m122262ox(boolean z11) {
        m121692Zu("SAVE_SMS_INTEGRATION_SERVER_", z11, true);
    }

    /* renamed from: oy */
    public static void m122263oy(long j11) {
        m121769bv(m122038j("TIME_DURATION_CLEAR_NEW_FRIEND_ITEM_%s"), j11, true);
    }

    /* renamed from: oz */
    public static void m122264oz(boolean z11) {
        m121692Zu("ENABLE_ANIM_VIEWFULL_DIFF_RATIO", z11, true);
    }

    /* renamed from: p */
    public static int m122265p() {
        return m121937ga("ACTION_CLICK_ON_STORY_VIEWER", 1, true);
    }

    /* renamed from: p0 */
    public static String m122266p0() {
        return m122013ia("clsInResume", "", false);
    }

    /* renamed from: p1 */
    public static int m122267p1() {
        return m121937ga("DEFAULT_PUSH_COVER_FEED", 0, true);
    }

    /* renamed from: p2 */
    public static boolean m122268p2() {
        return m121899fa("DYNAMIC_GROUP_NAME", true, true);
    }

    /* renamed from: p3 */
    public static int m122269p3() {
        return m121937ga("ENABLE_SHOW_PREVIEW_STICKER_NOTI", 1, false);
    }

    /* renamed from: p4 */
    public static String m122270p4() {
        return m122013ia("STR_GENERAL_INFO_SUGGEST_CHAT_MSG_TAB", "", true);
    }

    /* renamed from: p5 */
    public static String m122271p5() {
        return m122013ia("LAST_BG_SELECTED_ID_NEW" + m121738b1(), "-1_-100", true);
    }

    /* renamed from: p6 */
    public static long m122272p6() {
        return m121975ha("TimeToGetNewDefaultSticker", 0L, true);
    }

    /* renamed from: p7 */
    public static long m122273p7() {
        return m121975ha("TIMESTAMP_GET_LAST_SUGGEST_ITEM_TIMELINE" + m121738b1(), 0L, false);
    }

    /* renamed from: p8 */
    public static String m122274p8() {
        return m122013ia("MAP_VIEW_OVERLAY_DATA", "", true);
    }

    /* renamed from: p9 */
    public static long m122275p9() {
        return m121975ha(m122038j("NEXT_TIMESTAMP_RECALL_API_SYNC_SETTING_CONTACT_PERMISSION_%s"), 0L, true);
    }

    /* renamed from: pa */
    public static int m122276pa() {
        return m121937ga(m122038j("SETTING_ALLOW_VIEW_SOCIAL%s"), 1, false);
    }

    /* renamed from: pb */
    public static String m122277pb() {
        return m122013ia("seasonal_feed_info", "", true);
    }

    /* renamed from: pc */
    public static long m122278pc() {
        return m121975ha("STICKER_DECOR_EXPIRE_TIME", 0L, true);
    }

    /* renamed from: pd */
    public static long m122279pd() {
        return m121975ha(m122038j("timestampInterValGetFavoriteFriend_%s"), 604800000L, true);
    }

    /* renamed from: pe */
    public static int m122280pe() {
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return 0;
        }
        return m121937ga(m122038j("WIFI_SLEEP_POLICY_WARNING_COUNTER_%s"), 0, true);
    }

    /* renamed from: pf */
    public static boolean m122281pf() {
        return m121899fa(m122038j("ENABLE_PHOTO_EDIT_DOODLE_BLUR_%s"), false, true);
    }

    /* renamed from: pg */
    public static boolean m122282pg() {
        if (f113485d < 0) {
            f113485d = m121899fa("HAS_MSG_HIDDEN_CHAT_NEW", false, false) ? 1 : 0;
        }
        if (f113485d != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: ph */
    public static void m122283ph(boolean z11) {
        m121692Zu("acceptBackgroundCheck" + m121738b1(), z11, true);
    }

    /* renamed from: pi */
    public static void m122284pi(boolean z11) {
        m121692Zu("RESOLUTION_CHANGED_CONFIG", z11, true);
    }

    /* renamed from: pj */
    public static void m122285pj(int i11) {
        m121731av("DB_CURRENT_SYNC_STATE_" + CoreUtility.f89233i, i11, true);
    }

    /* renamed from: pk */
    public static void m122286pk(int i11) {
        m121731av(m122038j("ENABLE_CALL_BACK_CHAT_LIST_%s"), i11, true);
    }

    /* renamed from: pl */
    public static void m122287pl(int i11) {
        m121731av("ENABLE_GROUP_TAB", i11, true);
    }

    /* renamed from: pm */
    public static void m122288pm(boolean z11) {
        m121692Zu("ENABLE_PROMOTE_BG_GRAPHY", z11, true);
    }

    /* renamed from: pn */
    public static void m122289pn(boolean z11) {
        m121692Zu("ENABLE_SWITCH_ACCOUNT", z11, true);
    }

    /* renamed from: po */
    public static void m122290po(boolean z11) {
        m121692Zu("FIRST_TIME_DELETE_MESSAGE_EVERYONE_" + m121738b1(), z11, false);
    }

    /* renamed from: pp */
    public static void m122291pp(int i11) {
        m121731av("intervalTimeCheckNetwork" + m121738b1(), i11, true);
    }

    /* renamed from: pq */
    public static void m122292pq(long j11) {
        m121769bv("LAST_TIME_DELETE_SECRET_MSG", j11, true);
    }

    /* renamed from: pr */
    public static void m122293pr(long j11) {
        m121769bv(m122038j("LASTTIME_SUBMIT_VALUE_PERMISSION_CONTACT_SYSTEM_%s"), j11, true);
    }

    /* renamed from: ps */
    public static void m122294ps(int i11) {
        AbstractC0908e0.m2820n("LIMIT_MEMBER_IN_GROUP_CALL", i11, true);
    }

    /* renamed from: pt */
    public static void m122295pt(int i11) {
        m121731av("MAX_SUPPORT_CLOSE_FRIEND", i11, true);
    }

    /* renamed from: pu */
    public static void m122296pu(int i11) {
        m121731av("NUMBER_BUBBLE_CALL_SUCCESS_INCOMING_NATIVE" + CoreUtility.f89233i, i11, true);
    }

    /* renamed from: pv */
    public static void m122297pv(boolean z11) {
        m121692Zu(m122038j("PRIVACY_SETTING_FRIEND_REQUEST_USERNAME_%s"), z11, true);
    }

    /* renamed from: pw */
    public static void m122298pw(boolean z11) {
        m121692Zu("SCAN_LOCATION", z11, true);
    }

    /* renamed from: px */
    public static void m122299px(int i11) {
        m121731av("SAVE_SMS_INTEGRATION" + m121738b1(), i11, true);
        AbstractC26084s.m134257e(2, "setting_priv_10", true);
    }

    /* renamed from: py */
    public static void m122300py(long j11) {
        m121769bv(m122038j("TIME_DURATION_CLEAR_NEW_SUGGEST_ITEM_%s"), j11, true);
    }

    /* renamed from: pz */
    public static void m122301pz(boolean z11) {
        m121692Zu("chatEnterToSend" + m121738b1(), z11, true);
    }

    /* renamed from: q */
    public static String m122302q() {
        return AbstractC0908e0.m2815i("ACTION_FOR_SKIP_JUMP_DOMAIN", "", true);
    }

    /* renamed from: q0 */
    public static String m122303q0() {
        return m122013ia(m122038j("CODE_HIDDEN_CHAT_%s"), "", true);
    }

    /* renamed from: q1 */
    public static String m122304q1() {
        return m122013ia("DEFAULT_REACTION_CONFIG", "", true);
    }

    /* renamed from: q2 */
    public static boolean m122305q2() {
        return m121899fa("ENABLE_FEATURE_EDIT_FEED", true, true);
    }

    /* renamed from: q3 */
    public static int m122306q3() {
        return m121937ga("ENABLE_SHOW_PREVIEW_VIDEO_NOTI", 1, false);
    }

    /* renamed from: q4 */
    public static String m122307q4() {
        return m122013ia("GEO_LOCATION_APP_ID", "", true);
    }

    /* renamed from: q5 */
    public static String m122308q5() {
        return m122013ia("LAST_BUILD_ID", "", true);
    }

    /* renamed from: q6 */
    public static long m122309q6() {
        return m121975ha("LAST_TIME_GET_NONE_FRIEND_SYNC", 0L, true);
    }

    /* renamed from: q7 */
    public static long m122310q7() {
        return m121975ha("LAST_TIMESTAMP_GET_SUGGEST_CHAT", 0L, false);
    }

    /* renamed from: q8 */
    public static int m122311q8() {
        return m121937ga("MAX_BUBBLE_CALL_NATIVE" + CoreUtility.f89233i, 30, true);
    }

    /* renamed from: q9 */
    public static long m122312q9() {
        return m121975ha("NEXT_TIME_TO_SYNC_SERVICE_MAP", 0L, true);
    }

    /* renamed from: qa */
    public static boolean m122313qa() {
        return m121899fa(m122038j("PRIVACY_SETTING_AUTO_ADD_FRIEND_%s"), true, true);
    }

    /* renamed from: qb */
    public static String m122314qb() {
        return m122013ia("SELECTED_LIVE_EMOJI", m122154m1(), true);
    }

    /* renamed from: qc */
    public static String m122315qc() {
        return m122013ia("STORY_CONFIG", "", true);
    }

    /* renamed from: qd */
    public static long m122316qd() {
        return m121975ha(m122038j("TIMESTAMP_SEE_LAYOUT_GUIDE_ONLINE_LIST_%s"), 0L, true);
    }

    /* renamed from: qe */
    public static String m122317qe() {
        return m122013ia("ZBROWSER_PRECACHE_JSON_CONFIG", "", true);
    }

    /* renamed from: qf */
    public static boolean m122318qf() {
        return m121899fa(m122038j("ENABLE_POPUP_RECOMMEND_SEND_PHOTO_HD_%s"), false, true);
    }

    /* renamed from: qg */
    public static boolean m122319qg() {
        return m121899fa("FLAG_NEW_SIGNAL_STORY", false, true);
    }

    /* renamed from: qh */
    public static void m122320qh(boolean z11) {
        m121692Zu("acceptTestOnMobileNetwork" + m121738b1(), z11, true);
    }

    /* renamed from: qi */
    public static void m122321qi(String str) {
        m121806cv("CONFIG_CHECK_SCROLLING_LOAD_IMAGE", str, true);
    }

    /* renamed from: qj */
    public static void m122322qj(int i11) {
        m121731av(m122038j("DEACTIVATE_ACCOUNT_SETTING_%s"), i11, true);
    }

    /* renamed from: qk */
    public static void m122323qk(int i11) {
        m121731av(m122038j("SETTING_ENABLE_CALL_MINI_MODE_CLIENT_%s"), i11, true);
        AbstractC26084s.m134269q(2, 95);
    }

    /* renamed from: ql */
    public static void m122324ql(int i11) {
        m121731av("ENABLE_HEAD_UP_NOTIFY", i11, true);
    }

    /* renamed from: qm */
    public static void m122325qm(boolean z11) {
        m121692Zu(m122038j("ENABLE_PROMOTE_LABANKEY_IN_SETTING_CHANGE_THEME_%s"), z11, true);
    }

    /* renamed from: qn */
    public static void m122326qn(boolean z11) {
        m121692Zu("ENABLE_SYNC_CONTACT_REMOVE_FRIEND_" + CoreUtility.f89233i, z11, false);
    }

    /* renamed from: qo */
    public static void m122327qo(boolean z11) {
        m121692Zu("FIRST_TIME_VIEW_AGAIN_SECRET_MSG", z11, false);
    }

    /* renamed from: qp */
    public static void m122328qp(long j11) {
        m121769bv("INTERVAL_TIME_KNOW_LAST_ACTIVE", j11, true);
    }

    /* renamed from: qq */
    public static void m122329qq(long j11) {
        m121769bv("LAST_TIME_DETECT_COUNTRY", j11, true);
    }

    /* renamed from: qr */
    public static void m122330qr(long j11) {
        m121769bv(m122038j("LASTTIME_SUBMIT_VALUE_SETTING_NOTIFY_SYSTEM_%s"), j11, true);
    }

    /* renamed from: qs */
    public static void m122331qs(int i11) {
        AbstractC0908e0.m2820n("LIMIT_MEMBER_IN_GROUP_TO_ENABLE_ENTRY_POINT_GROUP_CALL", i11, true);
    }

    /* renamed from: qt */
    public static void m122332qt(int i11) {
        m121731av("MAX_SWITCH_ACCOUNT", i11, true);
    }

    /* renamed from: qu */
    public static void m122333qu(int i11) {
        m121731av("NUMBER_COUNT_NEWEST_PHOTO_PROVIDER", i11, true);
    }

    /* renamed from: qv */
    public static void m122334qv(boolean z11) {
        m121692Zu(m122038j("PRIVACY_SETTING_FRIEND_SUGGEST_%s"), z11, true);
    }

    /* renamed from: qw */
    public static void m122335qw(boolean z11) {
        m121692Zu("SCAN_PHONE_CONTACT", z11, true);
    }

    /* renamed from: qx */
    public static void m122336qx(boolean z11) {
        m121692Zu("SaveSoundSetting" + m121738b1(), z11, true);
    }

    /* renamed from: qy */
    public static void m122337qy(long j11) {
        m121769bv("TIME_EXPIRE_GET_NONE_FRIEND", j11, true);
    }

    /* renamed from: qz */
    public static void m122338qz(boolean z11) {
        m121692Zu("useSuggestStickerOnFeed" + m121738b1(), z11, true);
        AbstractC26084s.m134269q(2, 103);
    }

    /* renamed from: r */
    public static int m122339r() {
        return m121937ga("SaveActiveTimePasscodeSetting", AbstractC26080o.a.f124275b, false);
    }

    /* renamed from: r0 */
    public static int m122340r0() {
        return m121937ga("COMPARE_CSCP_STATE_" + m121738b1(), -2, true);
    }

    /* renamed from: r1 */
    public static boolean m122341r1() {
        return m121899fa("DEFAULT_VALUE_ENABLE_MINI_CHAT_CLIENT", true, true);
    }

    /* renamed from: r2 */
    public static int m122342r2() {
        return m121937ga("ENABLE_ENTRY_CALL_PROFILE", 0, true);
    }

    /* renamed from: r3 */
    public static boolean m122343r3() {
        return m121899fa("ENABLE_STICKER_HTML5", false, true);
    }

    /* renamed from: r4 */
    public static int m122344r4() {
        return m121937ga("GIF_CHAT_SIZE", C8917b.f47667X, true);
    }

    /* renamed from: r5 */
    public static String m122345r5() {
        return m122013ia("LAST_COPIED_LINK_CLIPBOARD_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: r6 */
    public static long m122346r6() {
        return m121975ha("TimeToGetQuickSticker", 0L, true);
    }

    /* renamed from: r7 */
    public static long m122347r7() {
        return m121975ha("LAST_TIMESTAMP_SUBMIT_FCM", 0L, true);
    }

    /* renamed from: r8 */
    public static int m122348r8() {
        return m121937ga("MAX_BUBBLE_CALL_SUCCESS_INCOMING_NATIVE" + CoreUtility.f89233i, 10, true);
    }

    /* renamed from: r9 */
    public static int m122349r9() {
        return m121937ga("NOTI_CONFIG_CHAT_GROUP", 0, true);
    }

    /* renamed from: ra */
    public static int m122350ra() {
        return m121937ga(m122038j("PRIVACY_SETTINGS_SETTING_COMMENT_%s"), 0, true);
    }

    /* renamed from: rb */
    public static int m122351rb() {
        return m121937ga(m122038j("sendLocationSetting_%s"), 1, true);
    }

    /* renamed from: rc */
    public static int m122352rc() {
        return AbstractC0908e0.m2810d(m122038j("STORY_DEST_TYPE_%s"), 0, true);
    }

    /* renamed from: rd */
    public static long m122353rd() {
        return m121975ha("TSSubmitphone" + m121738b1(), 0L, true);
    }

    /* renamed from: re */
    public static String m122354re() {
        return m122013ia("ZINSTANT_DISCOVERY_CONFIG_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: rf */
    public static boolean m122355rf() {
        return m121899fa("ENABLE_POST_BG_FEED_ON_STORY", true, true);
    }

    /* renamed from: rg */
    public static boolean m122356rg() {
        return m121899fa("INSERT_FILE_INTO_MEDIA_STORE_USING_PRE_Q_LOGIC", false, true);
    }

    /* renamed from: rh */
    public static void m122357rh(String str, int i11) {
        m121806cv("appBackupGdriveAccount" + m121738b1(), str, true);
        m121731av("backup_drive_account_state" + m121738b1(), i11, true);
    }

    /* renamed from: ri */
    public static void m122358ri(String str) {
        m121806cv("CHECKSUM_THEME_FOLDER_" + m121738b1(), str, true);
    }

    /* renamed from: rj */
    public static void m122359rj(String str) {
        m121806cv("DEFAUL_AVT_URL", str, true);
    }

    /* renamed from: rk */
    public static void m122360rk(int i11) {
        m121731av("ENABLE_CALL_TEXT_SUPPORT", i11, true);
    }

    /* renamed from: rl */
    public static void m122361rl(boolean z11) {
        m121692Zu("ENABLE_HINT_DELETE_FRIEND_TAB_CONTACT" + CoreUtility.f89233i, z11, false);
    }

    /* renamed from: rm */
    public static void m122362rm(boolean z11) {
        m121692Zu("REACTION_SETTING", z11, true);
    }

    /* renamed from: rn */
    public static void m122363rn(boolean z11) {
        m121692Zu("ENABLE_SYNC_CONTACTS", z11, true);
    }

    /* renamed from: ro */
    public static void m122364ro(boolean z11) {
        m121692Zu("FLAG_CACHE_WEBVIEW_NORMAL", z11, false);
    }

    /* renamed from: rp */
    public static void m122365rp(long j11) {
        m121769bv("INTERVAL_TIMESTAMP_GETLIST_FOLLOW", j11, false);
    }

    /* renamed from: rq */
    public static void m122366rq(String str, long j11) {
        m121769bv("LAST_TIME_DOWNLOAD_LIBRARY_" + str, j11, true);
    }

    /* renamed from: rr */
    public static void m122367rr(long j11) {
        m121769bv(m122038j("LAST_TIME_SUBMIT_VALUE_SETTING_SYNC_MSG_BACKUP_RESTORE_%s"), j11, true);
    }

    /* renamed from: rs */
    public static void m122368rs(int i11) {
        m121731av("LIMIT_SELECTED_FILE_COUNT", i11, true);
    }

    /* renamed from: rt */
    public static void m122369rt(int i11) {
        m121731av("MAX_SYNC_CONTACT_REMOVE_FRIEND_", i11, false);
    }

    /* renamed from: ru */
    public static void m122370ru(Context context, int i11) {
        SharedPreferences.Editor edit = context.getSharedPreferences("ZaloListNotifyInfo", 0).edit();
        edit.putInt("numberNewFriend" + m121738b1(), i11);
        edit.commit();
    }

    /* renamed from: rv */
    public static void m122371rv(int i11) {
        m121731av(m122038j("PRIVACY_SETTINGS_RECEIVE_MESSAGE_%s"), i11, true);
    }

    /* renamed from: rw */
    public static void m122372rw(boolean z11) {
        m121692Zu("SCROLL_INTRO_LOGIN_DONE", z11, true);
    }

    /* renamed from: rx */
    public static void m122373rx(boolean z11) {
        m121692Zu("SAVE_SOUND_SETTING_LOCAL", z11, true);
    }

    /* renamed from: ry */
    public static void m122374ry(long j11) {
        m121769bv("TIME_EXPIRE_NOTI_PUSH_REDDOT_STICKER_STORE_CHAT", j11, true);
    }

    /* renamed from: rz */
    public static void m122375rz(boolean z11) {
        m121692Zu("USE_HANDLER_SOCKET_CONNECTION", z11, true);
    }

    /* renamed from: s */
    public static boolean m122376s() {
        return m121899fa("ALLOW_CHANGING_APP_TEXT_SIZE", true, true);
    }

    /* renamed from: s0 */
    public static int m122377s0() {
        if (f113483b == -999) {
            f113483b = m122340r0();
        }
        return f113483b;
    }

    /* renamed from: s1 */
    public static long m122378s1() {
        return m121975ha("DESTROY_COCOS_ERROR", -1L, true);
    }

    /* renamed from: s2 */
    public static int m122379s2() {
        return m121937ga("ENABLE_EXPAND_NOTI_MEDIA", 1, false);
    }

    /* renamed from: s3 */
    public static boolean m122380s3() {
        return AbstractC0908e0.m2808b("ENABLE_STICKER_POPUP", true, true);
    }

    /* renamed from: s4 */
    public static int m122381s4() {
        return m121937ga("GIF_MAX_SIZE_FEED", C8917b.f47668Y, true);
    }

    /* renamed from: s5 */
    public static long m122382s5() {
        return m121975ha("LAST_COPIED_URL_TIMESTAMP_FOR_SUGGEST_LINK_FROM_O", 0L, true);
    }

    /* renamed from: s6 */
    public static long m122383s6() {
        return m121975ha("LAST_TIME_GET_STICKER_CATE", 0L, true);
    }

    /* renamed from: s7 */
    public static long m122384s7() {
        return m121975ha("LAST_TIMESTAMP_SUBMIT_HUAWEI_TOKEN", 0L, true);
    }

    /* renamed from: s8 */
    public static int m122385s8() {
        return m121937ga("MAX_CHAR_BG_FEED", 250, true);
    }

    /* renamed from: s9 */
    public static int m122386s9() {
        return m121937ga("NOTI_CONFIG_CHAT_SINGLE", 0, true);
    }

    /* renamed from: sa */
    public static boolean m122387sa() {
        return m121899fa(m122038j("PRIVACY_SETTING_FRIEND_REQUEST_CONTACT_%s"), true, true);
    }

    /* renamed from: sb */
    public static String m122388sb() {
        return m122013ia("SEND_TO_ME_INFO", "", true);
    }

    /* renamed from: sc */
    public static String m122389sc() {
        return m122013ia("STORY_SUGGESTION_SETTING", "", true);
    }

    /* renamed from: sd */
    public static long m122390sd() {
        return m121975ha("timestampUpdateCurrentUserInfo", 0L, true);
    }

    /* renamed from: se */
    public static String m122391se() {
        return m122013ia("ZINSTANT_DISCOVERY_STREAMLINE_CONFIG_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: sf */
    public static boolean m122392sf() {
        return m121899fa("picker_prefer_local_path_over_uri", true, true);
    }

    /* renamed from: sg */
    public static boolean m122393sg() {
        return m121899fa("INSERT_PHOTO_INTO_MEDIA_STORE_USING_PRE_Q_LOGIC", false, true);
    }

    /* renamed from: sh */
    public static void m122394sh(boolean z11) {
        m121692Zu("IS_SHOW_DES_USERNAME", z11, true);
    }

    /* renamed from: si */
    public static void m122395si(boolean z11) {
        m121692Zu("CLICK_EVENT_ICON_" + CoreUtility.f89233i, z11, true);
    }

    /* renamed from: sj */
    public static void m122396sj(String str, String str2) {
        m121806cv("DEFAULT_LIBRARY_CHECKSUM_" + str, str2, true);
    }

    /* renamed from: sk */
    public static void m122397sk(int i11) {
        m121731av(m122038j("ENABLE_CALL_VIA_ZALO_IN_PHONE_NUMBER_POPUP%s"), i11, true);
    }

    /* renamed from: sl */
    public static void m122398sl(boolean z11) {
        m121692Zu("SETTING_IMAGE_KEYBOARD", z11, true);
    }

    /* renamed from: sm */
    public static void m122399sm(boolean z11) {
        m121692Zu("REACTION_NOTI_SETTING", z11, true);
    }

    /* renamed from: sn */
    public static void m122400sn(boolean z11) {
        m121692Zu("ENABLE_SYNC_NOTI_DOT_TIMELINE_TAB", z11, true);
    }

    /* renamed from: so */
    public static void m122401so(boolean z11) {
        m121692Zu("CAPTURE_IMAGE_BY_BUTTON_VOLUME", z11, true);
    }

    /* renamed from: sp */
    public static void m122402sp(String str) {
        AbstractC0908e0.m2826t("INVALID_FEED_MEMORY_LAYOUT_RATIO", str, true, true);
    }

    /* renamed from: sq */
    public static void m122403sq(long j11) {
        m121769bv("LAST_REMIND", j11, true);
    }

    /* renamed from: sr */
    public static void m122404sr(long j11, int i11) {
        m121769bv(m122001i("LAST_TIME_TIME_SUBMIT_ZALO_TRACKING_INFO_%d", i11), j11, true);
    }

    /* renamed from: ss */
    public static void m122405ss(int i11) {
        m121731av("SETTING_LIMIT_SIZE_STORAGE_FOR_ZINSTANT_CACHE", i11, true);
    }

    /* renamed from: st */
    public static void m122406st(long j11) {
        m121769bv("MAX_TIME_DELETE_FOR_ADMIN", j11, true);
    }

    /* renamed from: su */
    public static void m122407su(int i11) {
        m121731av("int_count_number_warning_sms" + m121738b1(), i11, true);
    }

    /* renamed from: sv */
    public static void m122408sv(int i11) {
        m121731av(m122038j("PRIVACY_SETTINGS_SETTING_VIEW_DOB_%s"), i11, true);
    }

    /* renamed from: sw */
    public static void m122409sw(String str) {
        m121806cv("SEARCH_CMD_JSON", str, true);
    }

    /* renamed from: sx */
    public static void m122410sx(int i11) {
        m121731av("SRC_ATTACH_FOOTER_REMINDER_FROM_MESSAGE", i11, true);
    }

    /* renamed from: sy */
    public static void m122411sy(long j11) {
        m121769bv("TIME_EXPIRED_DURATION", j11, true);
    }

    /* renamed from: sz */
    public static void m122412sz(boolean z11) {
        m121692Zu("SETTING_SHOW_MISS_CALL_POPUP", z11, true);
        AbstractC26084s.m134269q(2, 20);
    }

    /* renamed from: t */
    public static boolean m122413t() {
        return m121899fa(m122038j("ALLOW_NOTIFICATION_CHAT_1_1_%s"), true, true);
    }

    /* renamed from: t0 */
    public static int m122414t0() {
        return m121937ga("CONDITION_UPDATE_CATE_MSG", 0, true);
    }

    /* renamed from: t1 */
    public static String m122415t1() {
        return m122013ia("DETECT_COUNTRY_DATA", "", true);
    }

    /* renamed from: t2 */
    public static int m122416t2() {
        return m121937ga("ENABLE_EXPAND_NOTIFICATION", 1, true);
    }

    /* renamed from: t3 */
    public static boolean m122417t3() {
        return m121899fa("ENABLE_STORY", true, true);
    }

    /* renamed from: t4 */
    public static int m122418t4() {
        return m121937ga("GLOBAL_ITEM_MODE", 1, false);
    }

    /* renamed from: t5 */
    public static String m122419t5() {
        return m122013ia("LAST_REMIND_LINK", "", true);
    }

    /* renamed from: t6 */
    public static long m122420t6() {
        return m121975ha("LAST_TIME_GET_SWITCH_ACCOUNT", 0L, true);
    }

    /* renamed from: t7 */
    public static long m122421t7() {
        return m121975ha("timestampSubmitLocation", 0L, true);
    }

    /* renamed from: t8 */
    public static int m122422t8() {
        return m121937ga("MAX_CHAR_BG_FEED_STORY", 300, true);
    }

    /* renamed from: t9 */
    public static int m122423t9() {
        return m121937ga("NOTI_CONFIG_FRIEND_ACCEPT", 0, true);
    }

    /* renamed from: ta */
    public static boolean m122424ta() {
        return m121899fa(m122038j("PRIVACY_SETTING_FRIEND_REQUEST_GROUP_%s"), true, true);
    }

    /* renamed from: tb */
    public static int m122425tb() {
        return m121937ga(m122038j("sendVideoSetting_%s"), 2, true);
    }

    /* renamed from: tc */
    public static long m122426tc() {
        return m121975ha("STORY_VERSION", 0L, true);
    }

    /* renamed from: td */
    public static long m122427td() {
        return m121975ha(m122038j("TsUpdatePhonebook_%s"), 0L, false);
    }

    /* renamed from: te */
    public static String m122428te() {
        return m122013ia("ZMEDIA_PLAYER_SETTINGS_NEW", "", true);
    }

    /* renamed from: tf */
    public static boolean m122429tf() {
        return AbstractC0908e0.m2809c(m122038j("ENABLE_PRELOAD_FEED_EFFECT_%s"), false, true, true);
    }

    /* renamed from: tg */
    public static boolean m122430tg() {
        return m121899fa("INSERT_VIDEO_INTO_MEDIA_STORE_USING_PRE_Q_LOGIC", false, true);
    }

    /* renamed from: th */
    public static void m122431th(int i11) {
        m121731av("ACTION_CLICK_ON_STORY_VIEWER", i11, true);
    }

    /* renamed from: ti */
    public static void m122432ti(boolean z11) {
        m121692Zu("CLIENT_CONTROL_NOTIF_DELETE_MSG", z11, true);
    }

    /* renamed from: tj */
    public static void m122433tj(String str) {
        m121806cv("DEFAULT_LIVE_EMOJI", str, true);
    }

    /* renamed from: tk */
    public static void m122434tk(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_CAMERA_DOCUMENT_SCANNER", z11, true);
    }

    /* renamed from: tl */
    public static void m122435tl(boolean z11) {
        m121692Zu("ENABLE_IN_APP_NOTIFICATION", z11, true);
    }

    /* renamed from: tm */
    public static void m122436tm(boolean z11) {
        m121692Zu("ENABLE_REFRESH_SUGGEST_CHAT_IN_BG", z11, true);
    }

    /* renamed from: tn */
    public static void m122437tn(int i11) {
        m121731av("CONFIG_ENABLE_SYNC_STICKER", i11, true);
    }

    /* renamed from: to */
    public static void m122438to(boolean z11) {
        m121692Zu("FLAG_USING_DO_NOT_DISTURB_" + CoreUtility.f89233i, z11, true);
    }

    /* renamed from: tp */
    public static void m122439tp(String str) {
        m121806cv(m122038j("INVITATION_SEEN_LIST_%s"), str, true);
    }

    /* renamed from: tq */
    public static void m122440tq(long j11) {
        m121769bv(m122038j("LAST_TIME_FETCH_BLACK_LIST_%s"), j11, true);
    }

    /* renamed from: tr */
    public static void m122441tr(long j11) {
        m121769bv("SYNC_ALARM_LOCAL_EVENT_LAST_TIME", j11, true);
    }

    /* renamed from: ts */
    public static void m122442ts(int i11) {
        m121731av("SETTING_BACKUP_MEDIA_EXIST_TIME_ON_DRIVE", i11, true);
    }

    /* renamed from: tt */
    public static void m122443tt(long j11) {
        m121769bv("MAX_TIME_DELETE_FOR_EVERYONE", j11, true);
    }

    /* renamed from: tu */
    public static void m122444tu(int i11, int i12) {
        m121731av(m122001i("NUMBER_RECORD_TO_SUBMIT_ZALOTRACKING_%d", i12), i11, true);
    }

    /* renamed from: tv */
    public static void m122445tv(int i11) {
        m121731av(m122038j("PRIVACY_SETTINGS_SETTING_VIEW_EMAIL_%s"), i11, true);
    }

    /* renamed from: tw */
    public static void m122446tw(String str) {
        m121806cv("seasonal_feed_info", str, true);
    }

    /* renamed from: tx */
    public static void m122447tx(int i11) {
        m121731av("SRC_DETECT_TIME_REMINDER_FROM_MESSAGE", i11, true);
    }

    /* renamed from: ty */
    public static void m122448ty(long j11) {
        m121769bv("TIME_EXPIRED_HIDDEN_CHAT", j11, true);
    }

    /* renamed from: tz */
    public static void m122449tz(int i11) {
        m121731av("USE_NEW_RULE_PARSE_EMO", i11, true);
    }

    /* renamed from: u */
    public static boolean m122450u() {
        return m121899fa(m122038j("ALLOW_NOTIFICATION_GROUP_%s"), m121899fa("allowNotification" + m121738b1(), m121899fa("allowNotification", true, true), true), true);
    }

    /* renamed from: u0 */
    public static int m122451u0() {
        return m121937ga("CONFIG_AUTO_DOWNLOAD_HD", 2, true);
    }

    /* renamed from: u1 */
    public static int m122452u1() {
        return m121937ga("DEVICE_STATUS" + m121738b1(), -1, false);
    }

    /* renamed from: u2 */
    public static int m122453u2() {
        return m121937ga("ENABLE_FEATURE_ALIAS" + m121738b1(), 0, true);
    }

    /* renamed from: u3 */
    public static int m122454u3() {
        return m121937ga("ENABLE_STRANGER_ALIAS" + m121738b1(), 0, true);
    }

    /* renamed from: u4 */
    public static String m122455u4() {
        return AbstractC0908e0.m2815i(m122038j("GROUP_INVITATION_BOX_INFO%s"), "", true);
    }

    /* renamed from: u5 */
    public static long m122456u5() {
        return m121975ha("pref_last_force_activate_zam_time", 0L, true);
    }

    /* renamed from: u6 */
    public static long m122457u6() {
        return m121975ha("lastTimeOnStopAct", 0L, false);
    }

    /* renamed from: u7 */
    public static long m122458u7() {
        return m121975ha(m122038j("TIMESTAMP_SYNC_LANGUAGE_%s"), 0L, true);
    }

    /* renamed from: u8 */
    public static int m122459u8() {
        return m121937ga("CONFIG_MAX_CLONE_GROUP_MEMBER", 50, true);
    }

    /* renamed from: u9 */
    public static int m122460u9() {
        return m121937ga("NOTI_CONFIG_FRIEND_REQUEST", 0, true);
    }

    /* renamed from: ua */
    public static boolean m122461ua() {
        return m121899fa(m122038j("PRIVACY_SETTING_FRIEND_REQUEST_PHONE_NUMBER_%s"), true, true);
    }

    /* renamed from: ub */
    public static boolean m122462ub() {
        return m121899fa("SERVER_CONFIG_ENABLE_AUTO_SYNC_MESSAGE_" + CoreUtility.f89233i, true, true);
    }

    /* renamed from: uc */
    public static int m122463uc() {
        return m121937ga("STYLE_REMIND_DIALOG_UPDATE_PHONEBOOK_" + m121738b1(), 0, true);
    }

    /* renamed from: ud */
    public static String m122464ud() {
        return m122013ia("token", "", true);
    }

    /* renamed from: ue */
    public static String m122465ue() {
        return m122013ia("zaloViewForResult", "", false);
    }

    /* renamed from: uf */
    public static boolean m122466uf() {
        return m121899fa(m122038j("ENABLE_PRELOAD_PHOTO_DETAILS_VIEWFULL_%s"), true, true);
    }

    /* renamed from: ug */
    public static int m122467ug() {
        return m121937ga("KEEP_SUGGEST_STICKER_AFTER_SEND_MSG", 1, true);
    }

    /* renamed from: uh */
    public static void m122468uh(String str) {
        AbstractC0908e0.m2825s("ACTION_FOR_SKIP_JUMP_DOMAIN", str, true);
    }

    /* renamed from: ui */
    public static void m122469ui(int i11) {
        m121731av(m122038j("CLOSE_COUNT_HINT_ON_NOTIFICATION_%s"), i11, false);
    }

    /* renamed from: uj */
    public static void m122470uj(int i11) {
        m121731av("DEFAULT_MAX_SIZE_VOICE_MSG", i11, true);
    }

    /* renamed from: uk */
    public static void m122471uk(boolean z11) {
        m121692Zu("ENABLE_CAMERA_IMMERSIVE_STICKY_MODE", z11, true);
    }

    /* renamed from: ul */
    public static void m122472ul(boolean z11) {
        m121692Zu("enable_inBitmap", z11, true);
    }

    /* renamed from: um */
    public static void m122473um(boolean z11) {
        m121692Zu(m122038j("RESET_UNREAD_NUMBER_OFFLINE_%s"), z11, true);
    }

    /* renamed from: un */
    public static void m122474un(boolean z11) {
        AbstractC0908e0.m2818l("enable_sync_with_pass_" + m121738b1(), z11, true);
    }

    /* renamed from: uo */
    public static void m122475uo(boolean z11) {
        m121692Zu("FLAG_NEW_SIGNAL_STORY", z11, true);
    }

    /* renamed from: up */
    public static void m122476up(boolean z11) {
        m121692Zu("IS_DIRTY_DATA_DISCOVER_GLOBAL_SEARCH", z11, true);
    }

    /* renamed from: uq */
    public static void m122477uq(long j11) {
        m121769bv("LAST_TIME_FETCH_PRELOAD_INFO", j11, true);
    }

    /* renamed from: ur */
    public static void m122478ur(long j11) {
        m121769bv("CALENDAR_EVENT_LAST_SYNC", j11, false);
    }

    /* renamed from: us */
    public static void m122479us(int i11) {
        m121731av("LIMIT_TOP_SECTION", i11, true);
    }

    /* renamed from: ut */
    public static void m122480ut(String str) {
        m121806cv("MEDIA_GROUP_INFO_CONFIG", str, true);
    }

    /* renamed from: uu */
    public static void m122481uu(String str) {
        m121806cv(m122038j("OA_SUGGEST_LIST_INFO_%s"), str, true);
    }

    /* renamed from: uv */
    public static void m122482uv(int i11) {
        m121731av(m122038j("PRIVACY_SETTINGS_SETTING_VIEW_PHOTO_%s"), i11, true);
    }

    /* renamed from: uw */
    public static void m122483uw(String str) {
        m121806cv("SELECTED_LIVE_EMOJI", str, true);
    }

    /* renamed from: ux */
    public static void m122484ux(boolean z11) {
        m121692Zu("SpeakerphoneOn" + m121738b1(), z11, false);
    }

    /* renamed from: uy */
    public static void m122485uy(long j11) {
        m121769bv("TIME_GET_SWITCH_ACCOUNT", j11, true);
    }

    /* renamed from: uz */
    public static void m122486uz(boolean z11) {
        m121692Zu("USE_WIFI_TO_BACKUP_DB_TO_SERVER_" + m121738b1(), z11, true);
        AbstractC26084s.m134269q(2, 60);
    }

    /* renamed from: v */
    public static boolean m122487v() {
        return m121899fa("ALREADY_MAPPING_PHONE_CONTACT_ZALO_UID", false, false);
    }

    /* renamed from: v0 */
    public static long m122488v0() {
        return m121975ha("CONFIG_DURATION_DISABLE_AUTO_OPEN_FILE", 3600000L, true);
    }

    /* renamed from: v1 */
    public static int m122489v1() {
        int i11;
        if (!AbstractC23136l9.m118654H0(MainApplication.getAppContext()) && AbstractC23136l9.m118731n0(MainApplication.getAppContext()) > 480) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        return m121937ga("devicetype", i11, true);
    }

    /* renamed from: v2 */
    public static boolean m122490v2() {
        return AbstractC0908e0.m2808b("ENABLE_FEATURE_DYNAMIC_SHORTCUTS", false, true);
    }

    /* renamed from: v3 */
    public static int m122491v3() {
        return m121937ga("CONFIG_ENABLE_SUGGEST_CHAT", 0, true);
    }

    /* renamed from: v4 */
    public static int m122492v4() {
        return m121937ga(m122038j("GROUP_LIST_SORT_BY_%s"), 0, true);
    }

    /* renamed from: v5 */
    public static String m122493v5() {
        return m122013ia("LAST_LIST_WIFI_NETWORKS", "", true);
    }

    /* renamed from: v6 */
    public static long m122494v6() {
        return m121975ha("LAST_TIME_OPEN_GALLERY", 0L, true);
    }

    /* renamed from: v7 */
    public static long m122495v7() {
        return m121975ha("timestampUpdateBlockZaloFriend" + m121738b1(), 0L, true);
    }

    /* renamed from: v8 */
    public static int m122496v8() {
        return m121937ga("MAX_COMMENT_WORD", 300, true);
    }

    /* renamed from: v9 */
    public static int m122497v9() {
        return m121937ga("NOTI_CONFIG_FRIEND_SUGGESTION", 0, true);
    }

    /* renamed from: va */
    public static boolean m122498va() {
        return m121899fa(m122038j("PRIVACY_SETTING_FRIEND_REQUEST_QRCODE_%s"), true, true);
    }

    /* renamed from: vb */
    public static boolean m122499vb() {
        return m121899fa("SERVER_CONFIG_ENABLE_SYNC_MESSAGE_" + CoreUtility.f89233i, true, true);
    }

    /* renamed from: vc */
    public static boolean m122500vc() {
        return m121899fa("SubmitLocation", false, true);
    }

    /* renamed from: vd */
    public static int m122501vd() {
        return m121937ga("totalNetworkCheck" + m121738b1(), 5, true);
    }

    /* renamed from: ve */
    public static int m122502ve() {
        return m121937ga("SETTING_INTERVAL_DAY_OF_CLEAN_ZINSTANT_CACHE", C17171o0.f87720c, true);
    }

    /* renamed from: vf */
    public static boolean m122503vf() {
        return m121899fa("ENABLE_PREVIEW_PHOTO_POSTFEED", false, true);
    }

    /* renamed from: vg */
    public static boolean m122504vg() {
        return m121899fa(m122038j("LAST_SELECTION_SEND_PHOTO_HD_%s"), false, true);
    }

    /* renamed from: vh */
    public static void m122505vh(int i11) {
        m121731av("SaveActiveTimePasscodeSetting", i11, false);
    }

    /* renamed from: vi */
    public static void m122506vi(String str) {
        m121806cv(m122038j("invited_close_friend_list_%s"), str, false);
    }

    /* renamed from: vj */
    public static void m122507vj(int i11) {
        m121731av("DEFAULT_PUSH_AVATAR_FEED", i11, true);
    }

    /* renamed from: vk */
    public static void m122508vk(boolean z11) {
        m121692Zu("CAMERA_LIVE_PREVIEW", z11, true);
    }

    /* renamed from: vl */
    public static void m122509vl(boolean z11) {
        AbstractC0908e0.m2818l("ENABLE_INVITATION_BOX", z11, true);
    }

    /* renamed from: vm */
    public static void m122510vm(boolean z11) {
        m121692Zu("ENABLE_RESTORE_LAST_COMPOSE", z11, true);
    }

    /* renamed from: vn */
    public static void m122511vn(int i11) {
        m121731av("ENABLE_TIMELINE_TAB", i11, true);
    }

    /* renamed from: vo */
    public static void m122512vo(boolean z11) {
        m121692Zu("FLAG_USE_QRCODE_SCANNER_IMAGE_FULL", z11, true);
    }

    /* renamed from: vp */
    public static void m122513vp(boolean z11) {
        m121692Zu("FIRST_TIME_OPEN_CALENDAR", z11, true);
    }

    /* renamed from: vq */
    public static void m122514vq(long j11) {
        m121769bv("LAST_TIME_GET_ALIAS" + m121738b1(), j11, true);
    }

    /* renamed from: vr */
    public static void m122515vr(long j11) {
        m121769bv("LAST_TIME_UPLOAD_DB_TO_SERVER_WITH_USER_IS_" + CoreUtility.f89233i, j11, true);
    }

    /* renamed from: vs */
    public static void m122516vs(String str) {
        m121806cv("COPIED_LINK_SUGGEST_CONFIG", str, true);
    }

    /* renamed from: vt */
    public static void m122517vt(long j11) {
        m121769bv("media_search_expired_ts", j11, true);
    }

    /* renamed from: vu */
    public static void m122518vu(String str) {
        m121806cv("OLD_JSON_APP_THEME_OPERATION_" + m121738b1(), str, true);
    }

    /* renamed from: vv */
    public static void m122519vv(boolean z11) {
        m121692Zu(m122038j("PRIVACY_SETTINGS_SETTING_VIEW_TIMELINE_%s"), z11, true);
    }

    /* renamed from: vw */
    public static void m122520vw(int i11) {
        m121731av(m122038j("sendLocationSetting_%s"), i11, true);
    }

    /* renamed from: vx */
    public static void m122521vx(int i11) {
        m121731av("SQLITE_FLAG_HANDLE_EXCEPTION", i11, true);
    }

    /* renamed from: vy */
    public static void m122522vy(long j11) {
        m121769bv("TIME_INTERVAL_GET_BROADCAST_HTTP", j11, true);
    }

    /* renamed from: vz */
    public static void m122523vz(boolean z11) {
        m121731av("USE_PASS_CODE", z11 ? 1 : 0, false);
    }

    /* renamed from: w */
    public static int m122524w() {
        return m121937ga("ANIM_FILTER_EXPIRED_TIME", 43200, true);
    }

    /* renamed from: w0 */
    public static int m122525w0() {
        return m121937ga("CONFIG_ENABLE_AUTO_OPEN_FILE_AFTER_DOWNLOAD", 0, true);
    }

    /* renamed from: w1 */
    public static long m122526w1() {
        return m121975ha("DISCOVER_CONTACT_EXPIRE_TIME_" + m121738b1(), 0L, true);
    }

    /* renamed from: w2 */
    public static int m122527w2() {
        return m121937ga("ENABLE_FEATURE_HINT_ON_NOTIFY", 1, false);
    }

    /* renamed from: w3 */
    public static boolean m122528w3() {
        return m121899fa("ENABLE_SUGGEST_CHAT_PROFILE", true, true);
    }

    /* renamed from: w4 */
    public static String m122529w4() {
        return m122013ia("GROUP_SETTING", "", true);
    }

    /* renamed from: w5 */
    public static String m122530w5() {
        return m122013ia("SaveLastSubmitPhone" + m121738b1(), "", true);
    }

    /* renamed from: w6 */
    public static long m122531w6() {
        return AbstractC0908e0.m2813g("LAST_TIME_PLAY_ANIM_MUSIC_EMPTY_VIEW", 0L, true);
    }

    /* renamed from: w7 */
    public static long m122532w7() {
        return m121975ha(m122038j("LAST_TIMESTAMP_UPDATE_COUNT_CLICK_AFTER_SEARCH_%s"), 0L, false);
    }

    /* renamed from: w8 */
    public static int m122533w8() {
        return m121937ga("MAX_ITEM_MSG_OA_MEDIABOX", 5, true);
    }

    /* renamed from: w9 */
    public static String m122534w9() {
        return m122013ia("NOTIFICATION_MANAGER_CONFIG", "", true);
    }

    /* renamed from: wa */
    public static boolean m122535wa() {
        return m121899fa(m122038j("PRIVACY_SETTING_FRIEND_REQUEST_USERNAME_%s"), true, true);
    }

    /* renamed from: wb */
    public static int m122536wb() {
        return m121937ga("SERVER_CONFIG_INSTANT_UPLOAD_MODE", 0, true);
    }

    /* renamed from: wc */
    public static int m122537wc() {
        return m121937ga("SUBMIT_LOCATION_SOURCE", EnumC8996x.TIME_INTERVAL.m48093d(), true);
    }

    /* renamed from: wd */
    public static String m122538wd() {
        return m122013ia("TRENDING_DEFAULT_ICON_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: we */
    public static boolean m122539we() {
        return AbstractC0908e0.m2808b("have_pc_request_sync_" + m121738b1(), false, true);
    }

    /* renamed from: wf */
    public static boolean m122540wf() {
        return m121899fa(m122038j("ENABLE_PROFILE_MUSIC_%s"), false, true);
    }

    /* renamed from: wg */
    public static boolean m122541wg() {
        return m121899fa("SETTING_MEDIA_STORE_MEDIA_LAYOUT_MODE_CHANGED", false, true);
    }

    /* renamed from: wh */
    public static void m122542wh(boolean z11) {
        boolean m122376s = m122376s();
        m121692Zu("ALLOW_CHANGING_APP_TEXT_SIZE", z11, true);
        C13778s1.m76969j(z11);
        if (m122376s != z11) {
            AbstractC19646n0.m102940V1();
        }
    }

    /* renamed from: wi */
    public static void m122543wi(long j11) {
        m121769bv(m122038j("CLOSE_HINT_ON_NOTIFICATION_TIME_%s"), j11, false);
    }

    /* renamed from: wj */
    public static void m122544wj(int i11) {
        m121731av("DEFAULT_PUSH_COVER_FEED", i11, true);
    }

    /* renamed from: wk */
    public static void m122545wk(boolean z11) {
        m121692Zu("SETTING_ENABLE_CHAT_HEAD_CLIENT" + m121738b1(), z11, true);
        AbstractC26084s.m134269q(2, 92);
    }

    /* renamed from: wl */
    public static void m122546wl(boolean z11) {
        m121692Zu("ENABLE_INVITE_PHONE_LIST", z11, true);
    }

    /* renamed from: wm */
    public static void m122547wm(boolean z11) {
        m121692Zu("enable_resume_upload", z11, true);
    }

    /* renamed from: wn */
    public static void m122548wn(boolean z11) {
        m121692Zu("CONFIG_FLAG_TODO_TASK_IN_CSC", z11, true);
    }

    /* renamed from: wo */
    public static void m122549wo(String str) {
        m121806cv("ATTACH_FOOTER_INFO", str, true);
    }

    /* renamed from: wp */
    public static void m122550wp(int i11) {
        m121731av("IsSetPassword", i11, true);
    }

    /* renamed from: wq */
    public static void m122551wq(long j11) {
        m121769bv("LAST_TIME_GET_ANIM_FILTERS", j11, true);
    }

    /* renamed from: wr */
    public static void m122552wr(long j11) {
        m121769bv("lastTimeToGetSettings" + m121738b1(), j11, true);
    }

    /* renamed from: ws */
    public static void m122553ws(String str) {
        m121806cv("LIST_CONVERT_PHONE_NUMBER", str, false);
    }

    /* renamed from: wt */
    public static void m122554wt(boolean z11) {
        m121692Zu("SETTING_MEDIA_STORE_MEDIA_LAYOUT_MODE_CHANGED", z11, true);
    }

    /* renamed from: wu */
    public static void m122555wu(String str) {
        m121806cv("appBackupGdriveToken", str, true);
    }

    /* renamed from: wv */
    public static void m122556wv(int i11) {
        m121731av(m122038j("PRIVACY_SETTINGS_SETTING_VIEW_USER_DETAIL_%s"), i11, true);
    }

    /* renamed from: ww */
    public static void m122557ww(int i11) {
        m121731av(m122038j("sendVideoSetting_%s"), i11, true);
    }

    /* renamed from: wx */
    public static void m122558wx(boolean z11) {
        m121692Zu("STATE_CHECK_BOX_SYNC_THEME", z11, true);
    }

    /* renamed from: wy */
    public static void m122559wy(long j11, int i11) {
        m121769bv(m122001i("TIME_INTERVAL_GET_LAST_KNOW_LOCATION_LOG_%d", i11), j11, true);
    }

    /* renamed from: wz */
    public static void m122560wz(boolean z11) {
        m121692Zu("PopupMessage" + m121738b1(), z11, true);
    }

    /* renamed from: x */
    public static int m122561x() {
        return m121937ga("ANIM_FILTER_PROMOTE_CATE_ID", -10, true);
    }

    /* renamed from: x0 */
    public static int m122562x0() {
        return m121937ga("SETTING_ENABLE_SUBMIT_TIMEONAPP", 1, true);
    }

    /* renamed from: x1 */
    public static long m122563x1() {
        return m121975ha("DISCOVER_CONTACT_LAST_TIME_" + m121738b1(), 0L, true);
    }

    /* renamed from: x2 */
    public static int m122564x2() {
        return m121937ga("ENABLE_OFF_COUNT_UNREAD", 0, true);
    }

    /* renamed from: x3 */
    public static int m122565x3() {
        return m121937ga(m122076k("ENABLE_SUGGEST_VIEW_FIND_FRIEND_TAB_GROUP_%S", "%S"), 0, true);
    }

    /* renamed from: x4 */
    public static String m122566x4() {
        return m122013ia("GROUP_TAB_DATA_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: x5 */
    public static int m122567x5() {
        return m121937ga("LAST_MODE_COMPOSE_FEED", 0, true);
    }

    /* renamed from: x6 */
    public static long m122568x6() {
        return m121975ha("LAST_TIME_REMOVE_ANIM_FILTER_ASSET", 0L, true);
    }

    /* renamed from: x7 */
    public static long m122569x7() {
        return m121975ha(m122038j("timestampUpdateFavoriteFriend_%s"), 0L, true);
    }

    /* renamed from: x8 */
    public static int m122570x8() {
        return m121937ga("MAX_ITEM_PIN_PREF", 2, false);
    }

    /* renamed from: x9 */
    public static int m122571x9() {
        return AbstractC0908e0.m2811e(m122038j("SAVE_NUM_NEW_MEMORY_ENTRY_%s"), 0, true, true);
    }

    /* renamed from: xa */
    public static boolean m122572xa() {
        return m121899fa(m122038j("PRIVACY_SETTING_FRIEND_SUGGEST_%s"), true, true);
    }

    /* renamed from: xb */
    public static long m122573xb() {
        return m121975ha("SERVER_CONFIG_SYNC_MESSAGE_INTERVAL_" + CoreUtility.f89233i, 86400000L, true);
    }

    /* renamed from: xc */
    public static String m122574xc() {
        return m122013ia("SUGGEST_FRIEND_MSG_TAB_DATA_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: xd */
    public static String m122575xd() {
        return m122013ia("TRENDING_EVENT_ICON_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: xe */
    public static boolean m122576xe() {
        return m121899fa("IS_SHOW_DES_USERNAME", true, true);
    }

    /* renamed from: xf */
    public static boolean m122577xf() {
        return m121899fa("IS_ENABLE_PROFILE_USERNAME", true, true);
    }

    /* renamed from: xg */
    public static boolean m122578xg() {
        return m121899fa("MIGRATE_PHOTO_TO_SCOPE_STORAGE_" + m121738b1(), false, true);
    }

    /* renamed from: xh */
    public static void m122579xh(int i11, boolean z11) {
        if (i11 == 15) {
            m121692Zu(m122038j("ALLOW_NOTIFICATION_CHAT_1_1_%s"), z11, true);
        } else if (i11 == 8) {
            m121692Zu("allowNotification" + m121738b1(), z11, true);
        }
    }

    /* renamed from: xi */
    public static void m122580xi(String str) {
        m121806cv("clsInPause", str, false);
    }

    /* renamed from: xj */
    public static void m122581xj(String str) {
        m121806cv("DEFAULT_REACTION_CONFIG", str, true);
    }

    /* renamed from: xk */
    public static void m122582xk(boolean z11) {
        m121692Zu("SETTING_ENABLE_CHAT_HEAD_SERVER", z11, true);
    }

    /* renamed from: xl */
    public static void m122583xl(boolean z11) {
        m121692Zu("ENABLE_INVITE_TO_MULTI_GROUP", z11, true);
    }

    /* renamed from: xm */
    public static void m122584xm(boolean z11) {
        m121692Zu("ENABLE_RETRY_MISS_CALL", z11, true);
    }

    /* renamed from: xn */
    public static void m122585xn(boolean z11) {
        m121692Zu("ENABLE_TOOL_CONVERT_PHONE_NUMBER", z11, false);
    }

    /* renamed from: xo */
    public static void m122586xo(boolean z11) {
        m121692Zu("FRIEND_FROM_NATIVE_ENTRY_POINT_ADD_FRIEND_" + m121738b1(), z11, true);
    }

    /* renamed from: xp */
    public static void m122587xp(String str) {
        m121806cv("isoCountrycodes", str, true);
    }

    /* renamed from: xq */
    public static void m122588xq(long j11) {
        m121769bv("LAST_TIME_GET_CONTACT_PHONEBOOK" + m121738b1(), j11, false);
    }

    /* renamed from: xr */
    public static void m122589xr(long j11) {
        m121769bv("lastTimeToGetSettingsFailed" + m121738b1(), j11, true);
    }

    /* renamed from: xs */
    public static void m122590xs(String str) {
        m121806cv("manage_reddot_group_list_media_store_by_type" + CoreUtility.f89233i, str, true);
    }

    /* renamed from: xt */
    public static void m122591xt(int i11) {
        m121731av("SETTING_MEDIA_STORE_MEDIA_LAYOUT_MODE", i11, true);
    }

    /* renamed from: xu */
    public static void m122592xu(int i11) {
        m121731av("SaveOldVersionCode", i11, true);
    }

    /* renamed from: xv */
    public static void m122593xv(String str) {
        m121806cv("privacySettings" + m121738b1(), str, true);
    }

    /* renamed from: xw */
    public static void m122594xw(boolean z11) {
        m121692Zu("SERVER_CONFIG_ENABLE_AUTO_SYNC_MESSAGE_" + CoreUtility.f89233i, z11, true);
    }

    /* renamed from: xx */
    public static void m122595xx(boolean z11) {
        m121692Zu("passcode_isInCall", z11, false);
    }

    /* renamed from: xy */
    public static void m122596xy(long j11) {
        m121769bv("TIME_INTERVAL_SHOW_FEED_SUGGEST", j11, true);
    }

    /* renamed from: xz */
    public static void m122597xz(int i11) {
        m121731av("USE_SEARCH_MESSAGE", i11, true);
    }

    /* renamed from: y */
    public static int m122598y() {
        return m121937ga(m122038j("ANIM_SCALE_BTN_SEARCH_%s"), 3, true);
    }

    /* renamed from: y0 */
    public static int m122599y0() {
        return m121937ga("CONFIG_LIMIT_INVITE_IN_GROUP", 50, true);
    }

    /* renamed from: y1 */
    public static int m122600y1() {
        return m121937ga("DISCOVER_ENABLE_SETTING", 0, true);
    }

    /* renamed from: y2 */
    public static int m122601y2() {
        return m121937ga("ENABLE_SEARCH_PHONEBOOK_GLOBAL_SEARCH", 0, true);
    }

    /* renamed from: y3 */
    public static int m122602y3() {
        return m121937ga(m122076k("ENABLE_SUGGEST_VIEW_FIND_FRIEND_TAB_MSG_%S", "%S"), 0, true);
    }

    /* renamed from: y4 */
    public static int m122603y4() {
        return m121937ga("SETTING_GROUP_VOIP_TIME_OUT", 45000, true);
    }

    /* renamed from: y5 */
    public static long m122604y5() {
        return AbstractC0908e0.m2814h("LAST_MOMENT_RESET_TOPIC_THRESHOLD", 0L, true, true);
    }

    /* renamed from: y6 */
    public static long m122605y6() {
        return m121975ha("LAST_TIME_REMOVE_COCOS_GARBAGE_ASSET", 0L, true);
    }

    /* renamed from: y7 */
    public static long m122606y7() {
        return m121975ha("timestampUpdateListFollow" + m121738b1(), 0L, true);
    }

    /* renamed from: y8 */
    public static int m122607y8() {
        return m121937ga("MAX_ITEM_SEARCH_SUGGEST", 20, true);
    }

    /* renamed from: y9 */
    public static int m122608y9() {
        return m121937ga("NUM_NEW_MY_GROUP", 0, false);
    }

    /* renamed from: ya */
    public static int m122609ya() {
        return m121937ga(m122038j("PRIVACY_SETTINGS_RECEIVE_MESSAGE_%s"), 1, true);
    }

    /* renamed from: yb */
    public static boolean m122610yb() {
        return m121899fa("SERVER_ENABLE_EFFECT", true, true);
    }

    /* renamed from: yc */
    public static String m122611yc() {
        return m122013ia("SUGGEST_FRIEND_TIMELINE_FEEDS_CONFIG_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: yd */
    public static long m122612yd() {
        return AbstractC0908e0.m2814h("GET_TRENDING_STICKER_EXPIRE_TIME", 0L, true, true);
    }

    /* renamed from: ye */
    public static boolean m122613ye() {
        return m121899fa("ALLOW_QUICK_EXIT_APP", true, true);
    }

    /* renamed from: yf */
    public static boolean m122614yf() {
        return m121899fa(m122038j("ENABLE_PROMOTE_LABANKEY_IN_SETTING_CHANGE_THEME_%s"), false, true);
    }

    /* renamed from: yg */
    public static boolean m122615yg() {
        return m121899fa("NATIVE_LOADER_ENABLE", true, true);
    }

    /* renamed from: yh */
    public static void m122616yh(boolean z11) {
        m121692Zu(m122038j("ALLOW_NOTIFICATION_GROUP_%s"), z11, true);
    }

    /* renamed from: yi */
    public static void m122617yi(String str) {
        m121806cv("clsInResume", str, false);
    }

    /* renamed from: yj */
    public static void m122618yj(boolean z11) {
        m121692Zu("DEFAULT_VALUE_ENABLE_MINI_CHAT_CLIENT", z11, true);
    }

    /* renamed from: yk */
    public static void m122619yk(boolean z11) {
        m121692Zu("CHAT_HEAD_ROTATION_ENABLE", z11, true);
    }

    /* renamed from: yl */
    public static void m122620yl(boolean z11) {
        m121692Zu("ENABLE_KEYBOARD_SHARE_VIEW", z11, false);
    }

    /* renamed from: ym */
    public static void m122621ym(boolean z11) {
        m121692Zu("IS_ENABLE_REUSE_CHAT_FILE", z11, true);
    }

    /* renamed from: yn */
    public static void m122622yn(boolean z11) {
        m121692Zu("ENABLE_TOOL_REVERT_PHONE_NUMBER", z11, false);
    }

    /* renamed from: yo */
    public static void m122623yo(boolean z11) {
        m121692Zu("FRIEND_FROM_NATIVE_ENTRY_POINT_TAB_CONTACT_" + m121738b1(), z11, true);
    }

    /* renamed from: yp */
    public static void m122624yp(String str) {
        m121806cv(m122038j("ISO_COUNTRY_CODES_CHANGE_PHONE_NUMBER_%s"), str, true);
    }

    /* renamed from: yq */
    public static void m122625yq(long j11) {
        m121769bv(m122038j("LAST_TIME_GET_CURRENT_PROFILE_ERROR_%s"), j11, true);
    }

    /* renamed from: yr */
    public static void m122626yr(long j11) {
        m121769bv("SaveLastTimeUpdatePhoneBook", j11, true);
    }

    /* renamed from: ys */
    public static void m122627ys(String str) {
        m121806cv(m122038j("LIST_HISTORY_EMOJI_%s"), str, true);
    }

    /* renamed from: yt */
    public static void m122628yt(int i11) {
        m121731av("SETTING_MEDIA_STORE_MIN_POS_TO_LOADMORE_WHEN_VIEWFULL", i11, true);
    }

    /* renamed from: yu */
    public static void m122629yu(boolean z11) {
        m121692Zu("onion_sticker_delete", z11, true);
    }

    /* renamed from: yv */
    public static void m122630yv(boolean z11) {
        m121692Zu("PROMOTE_SEASONAL_STICKER_TAB", z11, true);
    }

    /* renamed from: yw */
    public static void m122631yw(boolean z11) {
        if (m121160Lg() != z11 && z11) {
            AbstractC0924m0.m4266ul(true);
        }
        m121692Zu("SERVER_CONFIG_ENABLE_FTS_SEARCH_FEATURE", z11, true);
    }

    /* renamed from: yx */
    public static void m122632yx(int i11) {
        m121731av("STATE_SYNC_CONTACT_NATIVE" + m121738b1(), i11, true);
    }

    /* renamed from: yy */
    public static void m122633yy(long j11) {
        m121769bv("TIME_INTERVAL_SHOW_HEADUP_FRIEND_REQUEST", j11, true);
    }

    /* renamed from: yz */
    public static void m122634yz(boolean z11) {
        m121692Zu("useseenmessage" + m121738b1(), z11, true);
    }

    /* renamed from: z */
    public static float m122635z() {
        try {
            return Float.parseFloat(m122013ia("APP_FONT_SIZE_RATIO", "1", true));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return 1.0f;
        }
    }

    /* renamed from: z0 */
    public static int m122636z0() {
        return m121937ga("CONFIG_LIMIT_MAXIMUM_MEM_IN_GROUP", 100, true);
    }

    /* renamed from: z1 */
    public static String m122637z1() {
        return AbstractC0908e0.m2816j("DOMAIN_DOWNLOAD_STICKER", "", true, true);
    }

    /* renamed from: z2 */
    public static boolean m122638z2() {
        return m121899fa("enable_force_jump_to_seasonal_tab", false, true);
    }

    /* renamed from: z3 */
    public static int m122639z3() {
        return m121937ga(m122076k("ENABLE_SUGGEST_VIEW_FIND_FRIEND_TAB_MYPAGES_%S", "%S"), 0, true);
    }

    /* renamed from: z4 */
    public static String m122640z4() {
        return m122013ia("STRING_GROUP_WELCOME_MEMBER_SETTING", "", true);
    }

    /* renamed from: z5 */
    public static long m122641z5() {
        return m121975ha("timestamp_last_permission_scan", 0L, true);
    }

    /* renamed from: z6 */
    public static long m122642z6() {
        return m121975ha("LAST_TIME_REMOVE_DECOR_TYPO_ASSET", 0L, true);
    }

    /* renamed from: z7 */
    public static long m122643z7() {
        return m121975ha("timestampUpdatePluginList", 0L, true);
    }

    /* renamed from: z8 */
    public static int m122644z8() {
        return m121937ga("MAX_RECENT_CONTACTVIEW_HORIZONTAL", 10, true);
    }

    /* renamed from: z9 */
    public static int m122645z9() {
        return m121937ga("numShowVoiceTip", 0, true);
    }

    /* renamed from: za */
    public static int m122646za() {
        return m121937ga(m122038j("PRIVACY_SETTINGS_SETTING_VIEW_DOB_%s"), 1, true);
    }

    /* renamed from: zb */
    public static String m122647zb() {
        return m122013ia("sessionKey", "", true);
    }

    /* renamed from: zc */
    public static String m122648zc() {
        return m122013ia("SUGGEST_FRIEND_TIMELINE_TAB_DATA_CONFIG_" + CoreUtility.f89233i, "", true);
    }

    /* renamed from: zd */
    public static long m122649zd() {
        return m121937ga("TURNON_CHAT_NOTI_" + CoreUtility.f89233i, 0, false);
    }

    /* renamed from: ze */
    public static boolean m122650ze() {
        return m121899fa("ALREADY_CONTACT_PHONEBOOK" + m121738b1(), false, true);
    }

    /* renamed from: zf */
    public static boolean m122651zf() {
        return m121899fa("REACTION_NOTI_SETTING", true, true);
    }

    /* renamed from: zg */
    public static boolean m122652zg() {
        return m121899fa("NEED_SYNC_HIDDEN_CHAT", false, true);
    }

    /* renamed from: zh */
    public static void m122653zh(boolean z11) {
        m121692Zu("ALLOW_QUICK_EXIT_APP", z11, true);
    }

    /* renamed from: zi */
    public static void m122654zi(String str) {
        m121806cv(m122038j("CODE_HIDDEN_CHAT_%s"), str, true);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(70);
        arrayList.add(71);
        AbstractC26084s.m134268p(2, arrayList, true);
    }

    /* renamed from: zj */
    public static void m122655zj(boolean z11) {
        m121692Zu("DELETE_FOR_EVERYONE", z11, true);
    }

    /* renamed from: zk */
    public static void m122656zk(boolean z11) {
        m121692Zu("ENABLE_CHAT_PHOTO_SLIDER", z11, true);
    }

    /* renamed from: zl */
    public static void m122657zl(boolean z11) {
        m121692Zu("ENABLE_KEYWORD_MAPPING", z11, true);
    }

    /* renamed from: zm */
    public static void m122658zm(boolean z11) {
        m121692Zu("IS_ENABLE_REUSE_CHAT_PHOTO", z11, true);
    }

    /* renamed from: zn */
    public static void m122659zn(int i11, int i12) {
        m121731av(m122001i("ENABLE_TRACK_ZALO_LOG_BY_TYPE_%d", i12), i11, true);
    }

    /* renamed from: zo */
    public static void m122660zo(int i11) {
        m121731av("gdrive_token_invalid_" + m121738b1(), i11, true);
    }

    /* renamed from: zp */
    public static void m122661zp(String str) {
        m121806cv(m122038j("isoCountrycodesFindFriend_%s"), str, true);
    }

    /* renamed from: zq */
    public static void m122662zq(long j11) {
        m121769bv("LAST_TIME_GET_DISCOVER_ID", j11, false);
    }

    /* renamed from: zr */
    public static void m122663zr(long j11) {
        m121769bv("LAST_TIMESTAMP_GET_SETTING_STARTUP", j11, false);
    }

    /* renamed from: zs */
    public static void m122664zs(String str) {
        m121806cv("LIST_LIVE_EMOJI_V2", str, true);
    }

    /* renamed from: zt */
    public static void m122665zt(long j11) {
        AbstractC0908e0.m2824r(m122038j("MEMORY_ENTRY_API_EXPIRE_TIME_%s"), j11, true, true);
    }

    /* renamed from: zu */
    public static void m122666zu(boolean z11) {
        m121692Zu("onlyAcceptCheckIpResult" + m121738b1(), z11, true);
    }

    /* renamed from: zv */
    public static void m122667zv(String str) {
        m121806cv("QRCODE_USERID", CoreUtility.f89233i, false);
        m121806cv("QRCODE_QRLINK", str, false);
    }

    /* renamed from: zw */
    public static void m122668zw(boolean z11) {
        m121692Zu("SERVER_CONFIG_ENABLE_SECRET_CHAT_FEATURE", z11, true);
    }

    /* renamed from: zx */
    public static void m122669zx(int i11) {
        m121731av("STATUS_AUTO_DETECT_ISO_SIM_LANGUAGE_ONE", i11, true);
    }

    /* renamed from: zy */
    public static void m122670zy(long j11) {
        AbstractC0908e0.m2823q("timeIntervalSubmitLocationFromSerVer", j11, true);
    }

    /* renamed from: zz */
    public static void m122671zz(boolean z11) {
        m121692Zu("use_stock_wrapper_db", z11, true);
    }
}
