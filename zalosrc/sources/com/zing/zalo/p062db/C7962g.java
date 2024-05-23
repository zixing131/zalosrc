package com.zing.zalo.p062db;

import am.AbstractC0934r0;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import me0.AbstractC23149n0;
import mm0.AbstractC23350e;
import mm0.AbstractC23356k;
import p135em.C18489c;
import p248iy.AbstractC20887g;

/* renamed from: com.zing.zalo.db.g */
/* loaded from: classes.dex */
public class C7962g extends SQLiteOpenHelper {

    /* renamed from: r */
    public static final String f43287r = "g";

    /* renamed from: s */
    private static volatile C7962g f43288s;

    /* renamed from: p */
    private final Context f43289p;

    /* renamed from: q */
    private SQLiteDatabase f43290q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.db.g$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC0934r0 {
        a() {
        }

        @Override // am.AbstractC0934r0, android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
            AbstractC20887g.m109231i(CoreUtility.f89233i, 17540, "CorruptionStock prefs", 0L, 17500, CoreUtility.f89236l);
            AbstractC20887g.m109237o(17540);
            super.onCorruption(sQLiteDatabase);
        }
    }

    /* renamed from: com.zing.zalo.db.g$b */
    /* loaded from: classes.dex */
    public interface b extends BaseColumns {

        /* renamed from: a */
        public static final String[] f43291a = {"_id", "key", ZinstantMetaConstant.IMPRESSION_META_TYPE, "value", "last_used", "last_update"};
    }

    public C7962g(Context context, boolean z11, DatabaseErrorHandler databaseErrorHandler) {
        super(context, z11 ? null : "zaloprefs", null, 5, databaseErrorHandler);
        this.f43290q = null;
        this.f43289p = context;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f43290q = writableDatabase;
        if (writableDatabase != null) {
            m42663a(writableDatabase);
        }
    }

    /* renamed from: a */
    private void m42663a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists prefs_v2 (_id INTEGER PRIMARY KEY,key TEXT UNIQUE ON CONFLICT REPLACE,type INTEGER NOT NULL,value TEXT NULL,last_used DATETIME DEFAULT 0,last_update DATETIME DEFAULT 0)");
        if (!AbstractC23149n0.m118857e(sQLiteDatabase, "prefs_v2", "last_update")) {
            sQLiteDatabase.execSQL("ALTER TABLE prefs_v2 ADD last_update DATETIME DEFAULT 0");
        }
        if (!AbstractC23149n0.m118857e(sQLiteDatabase, "prefs_v2", "last_used")) {
            sQLiteDatabase.execSQL("ALTER TABLE prefs_v2 ADD last_used DATETIME DEFAULT 0");
        }
    }

    /* renamed from: b */
    private void m42664b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists service_map (_id INTEGER PRIMARY KEY,type INTEGER NOT NULL,host TEXT NOT NULL,port INTEGER NOT NULL,key_xor INTEGER DEFAULT 0,key_ps TEXT DEFAULT '',last_update timestamp DEFAULT (strftime('%s', 'now')),last_used timestamp DEFAULT 0 )");
        ArrayList<C18489c> arrayList = new ArrayList();
        arrayList.add(new C18489c(c.a.COM, "120.138.69.142", 3001));
        arrayList.add(new C18489c(c.a.UPLOAD, "120.138.74.178", 443));
        arrayList.add(new C18489c(c.a.VIDEO_UPLOAD, "20.138.69.15", 443));
        arrayList.add(new C18489c(c.a.SIP, "s.zapps.vn", 5060));
        sQLiteDatabase.delete("service_map", null, null);
        long currentTimeMillis = System.currentTimeMillis();
        for (C18489c c18489c : arrayList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, Integer.valueOf(c18489c.m97861m()));
            contentValues.put("host", c18489c.m97856c());
            contentValues.put("port", Integer.valueOf(c18489c.m97860l()));
            contentValues.put("key_xor", Long.valueOf(c18489c.m97858e()));
            contentValues.put("key_ps", c18489c.m97857d());
            contentValues.put("last_update", Long.valueOf(currentTimeMillis));
            sQLiteDatabase.insert("service_map", null, contentValues);
        }
        try {
            for (C18489c c18489c2 : C18489c.m97843a(this.f43289p.getAssets().open("service_map.bin"))) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, Integer.valueOf(c18489c2.m97861m()));
                contentValues2.put("host", c18489c2.m97856c());
                contentValues2.put("port", Integer.valueOf(c18489c2.m97860l()));
                contentValues2.put("key_xor", Long.valueOf(c18489c2.m97858e()));
                contentValues2.put("key_ps", c18489c2.m97857d());
                contentValues2.put("last_update", Long.valueOf(currentTimeMillis));
                sQLiteDatabase.insert("service_map", null, contentValues2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f43287r, e11);
            throw new SQLException();
        }
    }

    /* renamed from: c */
    public static C7962g m42665c(Context context) {
        if (f43288s == null) {
            try {
                synchronized (C7962g.class) {
                    try {
                        if (f43288s == null) {
                            f43288s = new C7962g(context, false, new a());
                        }
                    } finally {
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f43287r, e11);
            }
        }
        return f43288s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:            if (r1 == null) goto L17;     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m42666d(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z11 = true;
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT * FROM SQLITE_MASTER WHERE NAME = '" + str + "'", null);
                if (cursor != null) {
                    if (cursor.getCount() == 0) {
                        z11 = false;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f43287r, e11);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: f */
    public void m42667f(SQLiteDatabase sQLiteDatabase) {
        m42668h(sQLiteDatabase, this.f43289p.getSharedPreferences("Zalo", 0).getAll());
    }

    /* renamed from: h */
    public void m42668h(SQLiteDatabase sQLiteDatabase, Map map) {
        try {
            if (map.size() > 0) {
                for (String str : map.keySet()) {
                    try {
                        Object obj = map.get(str);
                        if (obj instanceof Integer) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("key", str);
                            contentValues.put("value", (Integer) obj);
                            contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, (Integer) 0);
                            sQLiteDatabase.insert("prefs_v2", null, contentValues);
                        } else if (obj instanceof String) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("key", str);
                            contentValues2.put("value", (String) obj);
                            contentValues2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, (Integer) 3);
                            sQLiteDatabase.insert("prefs_v2", null, contentValues2);
                        } else if (obj instanceof Long) {
                            ContentValues contentValues3 = new ContentValues();
                            contentValues3.put("key", str);
                            contentValues3.put("value", (Long) obj);
                            contentValues3.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, (Integer) 1);
                            sQLiteDatabase.insert("prefs_v2", null, contentValues3);
                        } else if (obj instanceof Boolean) {
                            ContentValues contentValues4 = new ContentValues();
                            contentValues4.put("key", str);
                            contentValues4.put("value", (Boolean) obj);
                            contentValues4.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, (Integer) 2);
                            sQLiteDatabase.insert("prefs_v2", null, contentValues4);
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f(f43287r, e11);
                    }
                }
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f(f43287r, e12);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            m42663a(sQLiteDatabase);
            m42664b(sQLiteDatabase);
            m42667f(sQLiteDatabase);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f43287r, e11);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        if (i11 >= 3 && i12 == 2) {
            sQLiteDatabase.execSQL("drop table if exists service_map");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        if (i12 > i11) {
            m42663a(sQLiteDatabase);
            if (m42666d(sQLiteDatabase, "prefs")) {
                sQLiteDatabase.execSQL("delete from prefs_v2");
                List m118860h = AbstractC23149n0.m118860h(sQLiteDatabase, "prefs_v2");
                m118860h.retainAll(AbstractC23149n0.m118860h(sQLiteDatabase, "prefs"));
                String m122796b = AbstractC23356k.m122796b(m118860h, ",");
                sQLiteDatabase.execSQL(String.format("INSERT INTO %s (%s) SELECT %s from %s", "prefs_v2", m122796b, m122796b, "prefs"));
                sQLiteDatabase.execSQL("drop table if exists prefs");
            }
            if (!m42666d(sQLiteDatabase, "service_map")) {
                m42664b(sQLiteDatabase);
                return;
            }
            if (!AbstractC23149n0.m118857e(sQLiteDatabase, "service_map", "key_xor")) {
                sQLiteDatabase.execSQL("ALTER TABLE service_map ADD key_xor INTEGER DEFAULT 0");
            }
            if (!AbstractC23149n0.m118857e(sQLiteDatabase, "service_map", "key_ps")) {
                sQLiteDatabase.execSQL("ALTER TABLE service_map ADD key_ps TEXT DEFAULT ''");
            }
        }
    }

    /* renamed from: com.zing.zalo.db.g$c */
    /* loaded from: classes.dex */
    public interface c extends BaseColumns {

        /* renamed from: b */
        public static final String[] f43292b = {"_id", ZinstantMetaConstant.IMPRESSION_META_TYPE, "host", "port", "key_xor", "key_ps", "last_used", "last_update"};

        /* renamed from: com.zing.zalo.db.g$c$a */
        /* loaded from: classes.dex */
        public enum a {
            UNKNOWN(-1, "UNKNOWN", "", 80),
            SERVICE_MAP(1001, "SERVICE_LINK", 80, "https://srv.mp3.zing.vn/zdl/", "https://zaloapp.com/zdl/", "https://mp3.zing.vn/zdl/", "https://n.zing.vn/zdl/"),
            COM(0, "COM", "cnn2.talk.zing.vn", 2804),
            UPLOAD(1, "UPLOAD", "up1.talk.zing.vn", 83),
            SIP(2, "SIP", "s.zapps.vn", 5060),
            TALK_M(3, "talk_m", "https://talk-m.zaloapp.com", 80),
            TAPI_M_S(4, "tapi_m_s", "https://tapi.api.zaloapp.com", 80),
            API_ZALOAPP(5, "api_zaloapp", "https://api.zaloapp.com", 80),
            REGISTER_TALK_M(6, "register_talk_m", "https://register.zaloapp.com", 80),
            PHOTO_TALK(7, "photo_talk", "https://photo.api.zaloapp.com", 80),
            OAUTH_ZALOAPP_S(8, "oauth_zaloapp_s", "https://oauth.zaloapp.com", 80),
            VIP_ZALOAPP(9, "vip_zaloapp", "https://vip.zaloapp.com", 80),
            FRIEND_TALK(10, "friend_talk", "https://friend.talk.zing.vn", 80),
            API_TALK(11, "api_talk", "https://api-talk.api.zaloapp.com", 80),
            FAILOVER_ZALOAPP_S(12, "failover_zaloapp_s", "https://failover.zaloapp.com", 80),
            REGISTER_TALK_M_S(13, "register_talk_m_s", "https://register.zaloapp.com", 80),
            FRIEND_TALK_S(14, "friend_talk_s", "https://friend.talk.zing.vn", 80),
            ZALO_M(15, "zalo_m", "https://zalo.api.zaloapp.com", 80),
            AUTH_ZALOAPP_S(16, "auth_zaloapp_s", "https://auth.zaloapp.com", 80),
            ME_TALK(17, "me_talk", "https://me.api.zaloapp.com", 80),
            DRAW_TALK_M(18, "draw_talk_m", "https://draw.api.zaloapp.com", 80),
            AVATAR_BG(19, "bg_avatar_talk", "https://bg.avatar.talk.zdn.vn", 80),
            EMPTY_RES(20, "empty_resources", "https://res.conf.zaloapp.com", 80),
            SUGGEST_STICKER(21, "suggest_sticker", "https://stickers.zaloapp.com", 80),
            BKMSG_TALK(22, "bkmsg_talk_s", "https://bkmsg-talk.zaloapp.com", 80),
            GROUP_API(23, "group_api", "https://group.api.zaloapp.com", 80),
            QOS_TALK_S(24, "qos_talk_s", "https://qos-talk.zaloapp.com", 80),
            GET_PAGE_API(25, "get_follow_page_s", "https://getpage.api.zaloapp.com", 80),
            VIDEO_UPLOAD(26, "VIDEO_UPLOAD", "120.138.74.144", 3001),
            GET_FOLLOW_S(27, "get_follow_s", "https://getpage.api.zaloapp.com", 80),
            SYSTEM_SETTING_S(28, "system_setting_s", "https://setting.api.zaloapp.com", 80),
            ZALO_LOG(29, "log_api", "https://log.api.zaloapp.com", 80),
            BROADCAST_MSG_S(30, "broadcast_api_zaloapp_s", "https://broadcast.api.zaloapp.com", 80),
            ALIAS_API(31, "alias_api_s", "https://alias.api.zaloapp.com", 80),
            CALENDAR_API_S(32, "calendar_api_s", "https://calendar.api.zaloapp.com", 80),
            GOOGLE_TRANSLATION(33, "google_translation", "https://translation.googleapis.com", 80),
            API_TALK_S(34, "api_talk_s", "https://api-talk.api.zaloapp.com", 80),
            ID_ZALOAPP_COM_S(35, "login_web_url_s", "https://id.zaloapp.com", 80),
            ZALO_APP_S(36, "zalo_app_s", "https://zaloapp.com", 80),
            QOS_TRK_INSTALL_ZALO_APP_S(37, "qos-trk-install_s", "https://qos-trk-install.zaloapp.com", 80),
            STORES_CREDITS_ZALO_APP_S(38, "stores-credits_s", "https://stores-credits.zaloapp.com", 80),
            QOS_TALK_ZING_S(39, "qos_trk_crashlytics_s", "https://qos.talk.zing.vn", 80),
            PARSE_VOICE_TRANSCRIPT_S(40, "zapp_asr_s", "https://zapp.asr.zalo.ai", 80),
            ACK_MSGID_S(41, "ack_msg_s", "https://ack-push-msgid.api.zaloapp.com", 80),
            BIO_API_S(42, "bio_api_s", "https://zlp-bio.api.zaloapp.com", 80),
            FETCH_PREVIEW_MSG_OFFLINE_GROUP_API(43, "fe_gr", "https://fe-gr-chat.zalo.me", 80),
            FETCH_OLD_MSG_MY_CLOUD_API(44, "fe_mc", "https://fe-mc.chat.zalo.me", 80),
            PRODUCT_CATALOG_DOMAIN(45, "catalog", "https://catalog.zalo.me", 80),
            CHECK_SERVER_MAINTENANCE(46, "mtnance", "https://mtnance.zaloapp.com", 80),
            BIG_MEDIA_UPLOAD(47, "BIG_MEDIA_UPLOAD", "120.138.74.144", 3001),
            STICKERS_DOWNLOAD(48, "stickers_download", "https://zalo-api.zadn.vn", 80),
            MEDIA_API(49, "MEDIA_API", "https://media.api.zaloapp.com", 80),
            SHORT_VIDEO_PLATFORM(50, "shortvideo_platform_s", "https://zsp.zaloapp.com", 80),
            ZALO_CLOUD(51, "zcloud", "https://zcld.chat.zalo.me", 80),
            SHORT_VIDEO_API(52, "shortvideo_api_s", "https://api.zalo.video", 80),
            SHORT_VIDEO_LONG_POLLING(53, "shortvideo_lp_s", "https://lp.zalo.video", 80),
            SHORT_VIDEO_LOG(54, "shortvideo_log_s", "https://log.zalo.video", 80),
            SHORT_VIDEO_UPLOAD(55, "shortvideo_upload_s", "https://uploadapi.zalo.video", 80),
            ADS_PLATFORM(56, "ads_platform", "https://ads-platform.zalo.me", 80);


            /* renamed from: A0 */
            private static final Random f43294A0 = new Random();

            /* renamed from: p */
            private final int f43354p;

            /* renamed from: q */
            private final String f43355q;

            /* renamed from: r */
            private final String[] f43356r;

            /* renamed from: s */
            private final int[] f43357s;

            a(int i11, String str, int i12, String... strArr) {
                this.f43354p = i11;
                this.f43355q = str;
                String[] strArr2 = (String[]) strArr.clone();
                this.f43356r = strArr2;
                this.f43357s = new int[strArr2.length];
                int i13 = 0;
                while (true) {
                    int[] iArr = this.f43357s;
                    if (i13 >= iArr.length) {
                        return;
                    }
                    iArr[i13] = i12;
                    i13++;
                }
            }

            /* renamed from: h */
            public static a m42670h(String str) {
                for (a aVar : values()) {
                    if (aVar.f43355q.equals(str)) {
                        return aVar;
                    }
                }
                return UNKNOWN;
            }

            /* renamed from: c */
            public int m42671c() {
                return this.f43354p;
            }

            /* renamed from: d */
            public List m42672d() {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < this.f43357s.length; i11++) {
                    arrayList.add(new C18489c(this, this.f43356r[i11], this.f43357s[i11]));
                }
                return arrayList;
            }

            /* renamed from: e */
            public String m42673e() {
                String[] strArr = this.f43356r;
                return strArr[f43294A0.nextInt(strArr.length)];
            }

            /* renamed from: g */
            public int m42674g() {
                int[] iArr = this.f43357s;
                return iArr[f43294A0.nextInt(iArr.length)];
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.f43355q;
            }

            a(int i11, String str, String str2, int i12) {
                this.f43354p = i11;
                this.f43355q = str;
                this.f43356r = new String[]{str2};
                this.f43357s = new int[]{i12};
            }
        }
    }

    public C7962g(Context context, boolean z11) {
        super(context, z11 ? null : "zaloprefs", (SQLiteDatabase.CursorFactory) null, 5);
        this.f43290q = null;
        this.f43289p = context;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f43290q = writableDatabase;
        if (writableDatabase != null) {
            m42663a(writableDatabase);
        }
    }
}
