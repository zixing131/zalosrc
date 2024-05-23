package pl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import bn0.AbstractC2933b;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.zalocloud.model.CloudQuotaUsage;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.zalocloud.exception.ZaloCloudDBException;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import me0.AbstractC23149n0;
import on0.AbstractC24341v;
import p304ks.AbstractC21935u;
import p487rl.C25821b;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25358n;
import qm0.AbstractC25368s;
import tg0.C26675a;
import tg0.C26676b;

/* renamed from: pl.b */
/* loaded from: classes3.dex */
public final class C24811b extends SQLiteOpenHelper {
    public static final a Companion = new a(null);

    /* renamed from: q */
    private static final ConcurrentHashMap f119078q = new ConcurrentHashMap();

    /* renamed from: r */
    private static final String f119079r;

    /* renamed from: p */
    private SQLiteDatabase f119080p;

    /* renamed from: pl.b$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: pl.b$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC32923a {
            public static final C32924a Companion = C32924a.f119081a;

            /* renamed from: pl.b$a$a$a */
            /* loaded from: classes3.dex */
            public static final class C32924a {

                /* renamed from: a */
                static final /* synthetic */ C32924a f119081a = new C32924a();

                /* renamed from: b */
                private static final String[] f119082b = {"cloudId", "msgType", "senderUid", "ownerId", "cliMsgId", "gloMsgId", "timestamp", "cloudTimestamp", "isE2EE", "mediaSize", "checksum", "mediaExtInfo", "encryptKey", "keyVersion", "algoVersion", "rawEncryptInfo"};

                /* renamed from: c */
                private static final HashMap f119083c = new HashMap();

                private C32924a() {
                }

                /* renamed from: a */
                public final int m128940a(Cursor cursor, String str) {
                    int intValue;
                    AbstractC19074t.m100208f(cursor, "cursor");
                    AbstractC19074t.m100208f(str, "colName");
                    HashMap hashMap = f119083c;
                    Object obj = hashMap.get(str);
                    if (obj == null) {
                        synchronized (hashMap) {
                            try {
                                Integer num = (Integer) hashMap.get(str);
                                if (num == null) {
                                    intValue = cursor.getColumnIndexOrThrow(str);
                                    hashMap.put(str, Integer.valueOf(intValue));
                                } else {
                                    intValue = num.intValue();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return intValue;
                    }
                    return ((Number) obj).intValue();
                }

                /* renamed from: b */
                public final String[] m128941b() {
                    return f119082b;
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C24811b m128939a() {
            boolean z11;
            boolean m127128x;
            String str = CoreUtility.f89233i;
            if (str != null) {
                m127128x = AbstractC24341v.m127128x(str);
                if (!m127128x) {
                    z11 = false;
                    if (!(!z11)) {
                        if (C24811b.f119078q.get(str) == null) {
                            synchronized (this) {
                                try {
                                    if (C24811b.f119078q.get(str) == null) {
                                        ConcurrentHashMap concurrentHashMap = C24811b.f119078q;
                                        AbstractC19074t.m100205c(str);
                                        concurrentHashMap.put(str, new C24811b(AbstractC24814e.m129016b(MainApplication.Companion.m35500c(), null, 1, null)));
                                    }
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        Object obj = C24811b.f119078q.get(str);
                        AbstractC19074t.m100205c(obj);
                        return (C24811b) obj;
                    }
                    throw new IllegalArgumentException("User UID is required. Please ensure it is available before accessing ZaloCloud's database.".toString());
                }
            }
            z11 = true;
            if (!(!z11)) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pl.b$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f119084q = new b();

        b() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(MessageId messageId) {
            AbstractC19074t.m100208f(messageId, "it");
            return messageId.m41044h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pl.b$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f119085q = new c();

        c() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(MessageId messageId) {
            AbstractC19074t.m100208f(messageId, "it");
            return messageId.m41044h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pl.b$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f119086q = new d();

        d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(MessageId messageId) {
            AbstractC19074t.m100208f(messageId, "it");
            return messageId.m41044h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pl.b$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final e f119087q = new e();

        e() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(String str) {
            AbstractC19074t.m100208f(str, "it");
            return str;
        }
    }

    static {
        String m131375W;
        m131375W = AbstractC25358n.m131375W(a.InterfaceC32923a.Companion.m128941b(), null, null, null, 0, null, null, 63, null);
        f119079r = "select " + m131375W + " from cloud_media inner join sync_media_ext_info on cloudId=noiseId";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24811b(Context context) {
        super(context, "zalo_cloud.db", (SQLiteDatabase.CursorFactory) null, 1);
        AbstractC19074t.m100208f(context, "context");
        SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase("zalo_cloud.db", 0, null, new DatabaseErrorHandler() { // from class: pl.a
            public /* synthetic */ C24810a() {
            }

            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                C24811b.this.m128889P0(sQLiteDatabase);
            }
        });
        AbstractC19074t.m100207e(openOrCreateDatabase, "openOrCreateDatabase(...)");
        this.f119080p = openOrCreateDatabase;
        m128898o();
        m128896i();
        m128900q();
        m128901r();
        m128902s();
        int m128897i0 = m128897i0();
        if (5 > m128897i0) {
            m128884K0(m128897i0);
        }
    }

    /* renamed from: H0 */
    private final boolean m128883H0(String str) {
        boolean z11;
        try {
            Cursor rawQuery = this.f119080p.rawQuery("SELECT * FROM SQLITE_MASTER WHERE NAME = '" + str + "'", null);
            try {
                if (rawQuery.getCount() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC2933b.m13890a(rawQuery, null);
                return z11;
            } finally {
            }
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
            return false;
        }
    }

    /* renamed from: K0 */
    private final void m128884K0(int i11) {
        C26676b.m136955e("SMLZCloudDB", "Migrate DB: curr=" + i11 + ", target=5", C26676b.b.f126331p);
        if (i11 < 2) {
            try {
                try {
                    m128885L0();
                    i11 = 2;
                } catch (Exception e11) {
                    C26676b.m136954d("SMLZCloudDB", e11);
                    this.f119080p.execSQL("UPDATE db_version SET version = " + i11 + " WHERE 1");
                    return;
                }
            } catch (Throwable th2) {
                this.f119080p.execSQL("UPDATE db_version SET version = " + i11 + " WHERE 1");
                throw th2;
            }
        }
        if (i11 == 2) {
            m128886M0();
            i11 = 3;
        }
        if (i11 == 3) {
            m128887N0();
            i11 = 4;
        }
        if (i11 == 4) {
            m128888O0();
        }
        this.f119080p.execSQL("UPDATE db_version SET version = 5 WHERE 1");
    }

    /* renamed from: L0 */
    private final void m128885L0() {
        AbstractC23149n0.m118855c(this.f119080p, "cloud_media", "isE2EE", "INTEGER", "-1");
    }

    /* renamed from: M0 */
    private final void m128886M0() {
        AbstractC23149n0.m118854b(this.f119080p, "cloud_media", "rawEncryptInfo", "TEXT");
    }

    /* renamed from: N0 */
    private final void m128887N0() {
        AbstractC23149n0.m118854b(this.f119080p, "cloud_media", "mediaExtInfo", "TEXT");
    }

    /* renamed from: O0 */
    private final void m128888O0() {
        try {
            this.f119080p.beginTransaction();
            AbstractC23149n0.m118855c(this.f119080p, "cloud_media", "cloudTimestamp", "LONG", "-1");
            this.f119080p.execSQL("UPDATE cloud_media SET cloudTimestamp = timestamp;");
            this.f119080p.setTransactionSuccessful();
        } finally {
            this.f119080p.endTransaction();
        }
    }

    /* renamed from: P0 */
    public final void m128889P0(SQLiteDatabase sQLiteDatabase) {
        try {
            C26676b.m136955e("SMLZCloudDB", "ZaloCloudDB is Corrupted", C26676b.b.f126335t);
            C26675a.m136890L(C26675a.f126213a, 1504230, -1, "ZaloCloudDB is Corrupted", null, 0L, 0L, 56, null);
            C26676b.m136954d("SMLZCloudDB", new ZaloCloudDBException(-1, "ZaloCloudDB is Corrupted"));
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: R */
    private final CloudQuotaUsage m128890R(Map map) {
        long m131178F0;
        long j11;
        long j12;
        long j13;
        long m131178F02;
        m131178F0 = AbstractC25332a0.m131178F0(map.values());
        Long l11 = (Long) map.remove(3);
        if (l11 != null) {
            j11 = l11.longValue();
        } else {
            j11 = 0;
        }
        Long l12 = (Long) map.remove(19);
        if (l12 != null) {
            j12 = l12.longValue();
        } else {
            j12 = 0;
        }
        Long l13 = (Long) map.remove(22);
        if (l13 != null) {
            j13 = l13.longValue();
        } else {
            j13 = 0;
        }
        m131178F02 = AbstractC25332a0.m131178F0(map.values());
        return new CloudQuotaUsage(0L, m131178F0, j11, j12, j13, m131178F02, (CloudQuotaUsage.AbuseInfo) null, 64, (AbstractC19060k) null);
    }

    /* renamed from: R0 */
    private final ContentValues m128891R0(ContentValues contentValues, C25821b c25821b) {
        contentValues.put("cloudId", c25821b.m133141d());
        contentValues.put("msgType", Integer.valueOf(c25821b.m133147j()));
        contentValues.put("senderUid", Integer.valueOf(c25821b.m133146i().m41051o()));
        contentValues.put("ownerId", c25821b.m133146i().m41048l());
        contentValues.put("cliMsgId", Long.valueOf(c25821b.m133146i().m41045i()));
        contentValues.put("gloMsgId", Long.valueOf(c25821b.m133146i().m41047k()));
        contentValues.put("timestamp", Long.valueOf(c25821b.m133150m()));
        contentValues.put("cloudTimestamp", Long.valueOf(c25821b.m133142e()));
        contentValues.put("isE2EE", Integer.valueOf(c25821b.m133155r() ? 1 : 0));
        contentValues.put("mediaSize", Long.valueOf(c25821b.m133145h().m133166c()));
        contentValues.put("checksum", c25821b.m133145h().m133164a());
        contentValues.put("mediaExtInfo", c25821b.m133145h().m133165b());
        C25821b.a m133144g = c25821b.m133144g();
        if (m133144g != null) {
            contentValues.put("encryptKey", m133144g.m133162b());
            contentValues.put("keyVersion", Integer.valueOf(m133144g.m133163c()));
            contentValues.put("algoVersion", Integer.valueOf(m133144g.m133161a()));
        }
        contentValues.put("rawEncryptInfo", c25821b.m133148k());
        return contentValues;
    }

    /* renamed from: T */
    private final ZCloudQuotaUsage m128892T(Map map) {
        long m131178F0;
        long j11;
        long j12;
        long j13;
        long m131178F02;
        m131178F0 = AbstractC25332a0.m131178F0(map.values());
        ZCloudQuotaUsage.ServiceUsage serviceUsage = new ZCloudQuotaUsage.ServiceUsage(0L, 0L, 0L, 7, (AbstractC19060k) null);
        Long l11 = (Long) map.remove(3);
        if (l11 != null) {
            j11 = l11.longValue();
        } else {
            j11 = 0;
        }
        Long l12 = (Long) map.remove(19);
        if (l12 != null) {
            j12 = l12.longValue();
        } else {
            j12 = 0;
        }
        Long l13 = (Long) map.remove(22);
        if (l13 != null) {
            j13 = l13.longValue();
        } else {
            j13 = 0;
        }
        m131178F02 = AbstractC25332a0.m131178F0(map.values());
        return new ZCloudQuotaUsage(0L, m131178F0, serviceUsage, j11, j12, j13, m131178F02, (ZCloudQuotaUsage.AbuseInfo) null, 128, (AbstractC19060k) null);
    }

    /* renamed from: g0 */
    private final C25821b m128895g0(Cursor cursor) {
        Long valueOf;
        long j11;
        Integer valueOf2;
        int i11;
        String string;
        String str;
        String string2;
        String str2;
        Integer valueOf3;
        long j12;
        Integer valueOf4;
        int i12;
        C25821b.a aVar;
        String string3;
        boolean z11;
        a.InterfaceC32923a.C32924a c32924a = a.InterfaceC32923a.Companion;
        String string4 = cursor.getString(c32924a.m128940a(cursor, "cloudId"));
        int i13 = cursor.getInt(c32924a.m128940a(cursor, "msgType"));
        int i14 = cursor.getInt(c32924a.m128940a(cursor, "senderUid"));
        String string5 = cursor.getString(c32924a.m128940a(cursor, "ownerId"));
        long j13 = cursor.getLong(c32924a.m128940a(cursor, "cliMsgId"));
        long j14 = cursor.getLong(c32924a.m128940a(cursor, "gloMsgId"));
        long j15 = cursor.getLong(c32924a.m128940a(cursor, "timestamp"));
        int m128940a = c32924a.m128940a(cursor, "cloudTimestamp");
        if (cursor.isNull(m128940a)) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(cursor.getLong(m128940a));
        }
        if (valueOf != null) {
            j11 = valueOf.longValue();
        } else {
            j11 = j15;
        }
        int m128940a2 = c32924a.m128940a(cursor, "isE2EE");
        if (cursor.isNull(m128940a2)) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(cursor.getInt(m128940a2));
        }
        if (valueOf2 != null) {
            i11 = valueOf2.intValue();
        } else {
            i11 = -1;
        }
        long j16 = cursor.getLong(c32924a.m128940a(cursor, "mediaSize"));
        String string6 = cursor.getString(c32924a.m128940a(cursor, "checksum"));
        int m128940a3 = c32924a.m128940a(cursor, "mediaExtInfo");
        if (cursor.isNull(m128940a3)) {
            str = string6;
            string = null;
        } else {
            string = cursor.getString(m128940a3);
            str = string6;
        }
        int m128940a4 = c32924a.m128940a(cursor, "encryptKey");
        if (cursor.isNull(m128940a4)) {
            str2 = string;
            string2 = null;
        } else {
            string2 = cursor.getString(m128940a4);
            str2 = string;
        }
        int m128940a5 = c32924a.m128940a(cursor, "keyVersion");
        if (cursor.isNull(m128940a5)) {
            j12 = j11;
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(cursor.getInt(m128940a5));
            j12 = j11;
        }
        int m128940a6 = c32924a.m128940a(cursor, "algoVersion");
        if (cursor.isNull(m128940a6)) {
            valueOf4 = null;
        } else {
            valueOf4 = Integer.valueOf(cursor.getInt(m128940a6));
        }
        if (string2 != null && string2.length() != 0 && valueOf3 != null && valueOf4 != null) {
            i12 = i13;
            aVar = new C25821b.a(string2, valueOf3.intValue(), valueOf4.intValue());
        } else {
            i12 = i13;
            aVar = null;
        }
        int m128940a7 = c32924a.m128940a(cursor, "rawEncryptInfo");
        if (cursor.isNull(m128940a7)) {
            string3 = null;
        } else {
            string3 = cursor.getString(m128940a7);
        }
        AbstractC19074t.m100205c(string4);
        MessageId.C7932a c7932a = MessageId.Companion;
        AbstractC19074t.m100205c(string5);
        String valueOf5 = String.valueOf(i14);
        String str3 = str;
        String str4 = str2;
        MessageId m41063a = c7932a.m41063a(j13, j14, string5, valueOf5);
        if (i11 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC19074t.m100205c(str3);
        return new C25821b(string4, i12, m41063a, j15, j12, z11, new C25821b.b(j16, str3, str4), aVar, string3);
    }

    /* renamed from: i */
    private final void m128896i() {
        try {
            this.f119080p.execSQL("CREATE TABLE IF NOT EXISTS cloud_media (cloudId TEXT PRIMARY KEY ON CONFLICT REPLACE,msgType INTEGER,senderUid INTEGER,ownerId TEXT,cliMsgId LONG,gloMsgId LONG,timestamp LONG,cloudTimestamp LONG,isE2EE INTEGER,mediaSize LONG,checksum TEXT,mediaExtInfo TEXT,encryptKey TEXT,keyVersion INTEGER,algoVersion INTEGER,rawEncryptInfo TEXT)");
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: i0 */
    private final int m128897i0() {
        int columnIndex;
        try {
            Cursor rawQuery = this.f119080p.rawQuery("SELECT version FROM db_version", null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToFirst() && (columnIndex = rawQuery.getColumnIndex("version")) >= 0) {
                        int i11 = rawQuery.getInt(columnIndex);
                        AbstractC2933b.m13890a(rawQuery, null);
                        return i11;
                    }
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(rawQuery, null);
            return 0;
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
            return 0;
        }
    }

    /* renamed from: o */
    private final void m128898o() {
        try {
            if (m128883H0("db_version")) {
                return;
            }
            C26676b.m136955e("SMLZCloudDB", "Create DB version table", C26676b.b.f126331p);
            SQLiteDatabase sQLiteDatabase = this.f119080p;
            sQLiteDatabase.execSQL("CREATE TABLE db_version (version)");
            sQLiteDatabase.execSQL("INSERT INTO db_version VALUES (0)");
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: o0 */
    public static final C24811b m128899o0() {
        return Companion.m128939a();
    }

    /* renamed from: q */
    private final void m128900q() {
        try {
            this.f119080p.execSQL("CREATE TABLE IF NOT EXISTS verify_queue (ownerId TEXT,cliMsgId LONG,noiseId TEXT)");
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: r */
    private final void m128901r() {
        try {
            this.f119080p.execSQL("CREATE TABLE IF NOT EXISTS sync_media_ext_info (noiseId TEXT PRIMARY KEY)");
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: s */
    private final void m128902s() {
        try {
            this.f119080p.execSQL("CREATE TABLE IF NOT EXISTS temp_cloud_status (cliMsgId LONG PRIMARY KEY)");
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: A */
    public final void m128903A(List list) {
        String m131214n0;
        AbstractC19074t.m100208f(list, "msgIdList");
        try {
            if (m128883H0("cloud_media_grace_period")) {
                m131214n0 = AbstractC25332a0.m131214n0(list, "','", "'", "'", 0, null, b.f119084q, 24, null);
                this.f119080p.delete("cloud_media_grace_period", "cliMsgId IN (" + m131214n0 + ")", null);
            }
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: D0 */
    public final void m128904D0(List list) {
        AbstractC19074t.m100208f(list, "noiseIds");
        try {
            try {
                this.f119080p.beginTransaction();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m128938z0((String) it.next());
                }
                this.f119080p.setTransactionSuccessful();
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudDB", e11);
            }
            this.f119080p.endTransaction();
        } catch (Throwable th2) {
            this.f119080p.endTransaction();
            throw th2;
        }
    }

    /* renamed from: E */
    public final void m128905E(List list) {
        String m131214n0;
        AbstractC19074t.m100208f(list, "msgIdList");
        try {
            m131214n0 = AbstractC25332a0.m131214n0(list, "','", "'", "'", 0, null, c.f119085q, 24, null);
            this.f119080p.delete("cloud_media", "cliMsgId IN (" + m131214n0 + ")", null);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: E0 */
    public final void m128906E0(String str) {
        AbstractC19074t.m100208f(str, "noiseId");
        try {
            SQLiteDatabase sQLiteDatabase = this.f119080p;
            ContentValues contentValues = new ContentValues();
            contentValues.put("noiseId", str);
            C24848g0 c24848g0 = C24848g0.f119245a;
            sQLiteDatabase.insertWithOnConflict("sync_media_ext_info", null, contentValues, 4);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: F */
    public final void m128907F(List list) {
        String m131214n0;
        AbstractC19074t.m100208f(list, "listNoiseId");
        try {
            m131214n0 = AbstractC25332a0.m131214n0(list, "','", "'", "'", 0, null, null, 56, null);
            this.f119080p.delete("verify_queue", "noiseId IN (" + m131214n0 + ")", null);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: F0 */
    public final void m128908F0(List list) {
        AbstractC19074t.m100208f(list, "noiseIds");
        this.f119080p.beginTransaction();
        try {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m128906E0((String) it.next());
                }
                this.f119080p.setTransactionSuccessful();
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudDB", e11);
            }
            this.f119080p.endTransaction();
        } catch (Throwable th2) {
            this.f119080p.endTransaction();
            throw th2;
        }
    }

    /* renamed from: G */
    public final void m128909G(List list) {
        String m131214n0;
        AbstractC19074t.m100208f(list, "noiseIds");
        try {
            m131214n0 = AbstractC25332a0.m131214n0(list, "','", "'", "'", 0, null, null, 56, null);
            this.f119080p.delete("sync_media_ext_info", "noiseId IN (" + m131214n0 + ")", null);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: G0 */
    public final void m128910G0(String str) {
        AbstractC19074t.m100208f(str, "cliMsgId");
        try {
            SQLiteDatabase sQLiteDatabase = this.f119080p;
            ContentValues contentValues = new ContentValues();
            contentValues.put("cliMsgId", str);
            C24848g0 c24848g0 = C24848g0.f119245a;
            sQLiteDatabase.insert("temp_cloud_status", null, contentValues);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: I0 */
    public final List m128911I0() {
        List m131185M0;
        int i11;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor rawQuery = this.f119080p.rawQuery("SELECT msgType, ownerId, SUM(mediaSize) AS total_size,  COUNT(*) AS number_of_item FROM cloud_media GROUP BY msgType, ownerId", null);
        try {
            if (rawQuery.moveToFirst()) {
                do {
                    int i12 = rawQuery.getInt(rawQuery.getColumnIndexOrThrow("msgType"));
                    String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow("ownerId"));
                    long j11 = rawQuery.getLong(rawQuery.getColumnIndexOrThrow("total_size"));
                    int i13 = rawQuery.getInt(rawQuery.getColumnIndexOrThrow("number_of_item"));
                    ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) linkedHashMap.get(string);
                    if (threadStorageInfo == null) {
                        AbstractC19074t.m100205c(string);
                        i11 = i13;
                        threadStorageInfo = new ThreadStorageInfo(string, null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 262142, null);
                        linkedHashMap.put(string, threadStorageInfo);
                    } else {
                        i11 = i13;
                    }
                    if (!AbstractC19646n0.m103031t1(i12) && !AbstractC19646n0.m102995k1(i12)) {
                        if (AbstractC19646n0.m102886D1(i12)) {
                            threadStorageInfo.m74812p0(threadStorageInfo.m74780S() + i11);
                            threadStorageInfo.m74814q0(threadStorageInfo.m74781T() + j11);
                        } else if (AbstractC19646n0.m103003m1(i12)) {
                            threadStorageInfo.m74786Y(threadStorageInfo.m74813q() + i11);
                            threadStorageInfo.m74787Z(threadStorageInfo.m74816t() + j11);
                        } else if (AbstractC19646n0.m102889E1(i12)) {
                            threadStorageInfo.m74815r0(threadStorageInfo.m74782U() + i11);
                            threadStorageInfo.m74817t0(threadStorageInfo.m74783V() + j11);
                        } else {
                            threadStorageInfo.m74791e0(threadStorageInfo.m74820x() + i11);
                            threadStorageInfo.m74794g0(threadStorageInfo.m74821y() + j11);
                        }
                    }
                    threadStorageInfo.m74796h0(threadStorageInfo.m74767B() + i11);
                    threadStorageInfo.m74798i0(threadStorageInfo.m74768C() + j11);
                } while (rawQuery.moveToNext());
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(rawQuery, null);
            m131185M0 = AbstractC25332a0.m131185M0(linkedHashMap.values());
            return m131185M0;
        } finally {
        }
    }

    /* renamed from: J */
    public final void m128912J(String str, long j11) {
        AbstractC19074t.m100208f(str, "ownerId");
        try {
            if (!m128883H0("cloud_media_grace_period")) {
                return;
            }
            this.f119080p.delete("cloud_media_grace_period", "ownerId = ? AND timestamp <= ?", new String[]{str, String.valueOf(j11)});
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: J0 */
    public final List m128913J0() {
        List m131502j;
        try {
            ArrayList arrayList = new ArrayList();
            Cursor query = this.f119080p.query("temp_cloud_status", new String[]{"*"}, null, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(String.valueOf(query.getLong(query.getColumnIndexOrThrow("cliMsgId"))));
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(query, null);
            return arrayList;
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: K */
    public final void m128914K(String str, long j11) {
        AbstractC19074t.m100208f(str, "ownerId");
        try {
            this.f119080p.delete("cloud_media", "ownerId = ? AND timestamp <= ?", new String[]{str, String.valueOf(j11)});
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: L */
    public final void m128915L() {
        try {
            this.f119080p.execSQL("DROP TABLE IF EXISTS cloud_media_grace_period");
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: M */
    public final int m128916M() {
        try {
            Cursor rawQuery = this.f119080p.rawQuery("SELECT COUNT(cloudId) AS item_count FROM cloud_media", null);
            try {
                if (rawQuery.moveToFirst()) {
                    int i11 = rawQuery.getInt(rawQuery.getColumnIndexOrThrow("item_count"));
                    AbstractC2933b.m13890a(rawQuery, null);
                    return i11;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(rawQuery, null);
                return 0;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC2933b.m13890a(rawQuery, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
            return 0;
        }
    }

    /* renamed from: N */
    public final C25821b m128917N(MessageId messageId) {
        Cursor query;
        AbstractC19074t.m100208f(messageId, "msgId");
        try {
            query = this.f119080p.query("cloud_media", a.InterfaceC32923a.Companion.m128941b(), "ownerId = ? AND cliMsgId = ?", new String[]{messageId.m41048l(), messageId.m41044h()}, null, null, null);
            try {
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC2933b.m13890a(query, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
        if (query.moveToFirst()) {
            AbstractC19074t.m100205c(query);
            C25821b m128895g0 = m128895g0(query);
            AbstractC2933b.m13890a(query, null);
            return m128895g0;
        }
        C24848g0 c24848g0 = C24848g0.f119245a;
        AbstractC2933b.m13890a(query, null);
        return null;
    }

    /* renamed from: O */
    public final List m128918O(String str, List list) {
        List m131502j;
        String m131214n0;
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(list, "msgIdList");
        try {
            ArrayList arrayList = new ArrayList();
            String[] m128941b = a.InterfaceC32923a.Companion.m128941b();
            m131214n0 = AbstractC25332a0.m131214n0(list, "','", "'", "'", 0, null, d.f119086q, 24, null);
            Cursor query = this.f119080p.query("cloud_media", m128941b, "ownerId = ? AND cliMsgId IN (" + m131214n0 + ")", new String[]{str}, null, null, null);
            while (query.moveToNext()) {
                try {
                    try {
                        AbstractC19074t.m100205c(query);
                        arrayList.add(m128895g0(query));
                    } catch (Exception e11) {
                        C26676b.m136954d("SMLZCloudDB", e11);
                    }
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(query, null);
            return arrayList;
        } catch (Exception e12) {
            C26676b.m136954d("SMLZCloudDB", e12);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: P */
    public final List m128919P(List list) {
        List m131502j;
        String m131214n0;
        AbstractC19074t.m100208f(list, "cloudIds");
        try {
            ArrayList arrayList = new ArrayList();
            String[] m128941b = a.InterfaceC32923a.Companion.m128941b();
            m131214n0 = AbstractC25332a0.m131214n0(list, "','", "'", "'", 0, null, null, 56, null);
            Cursor query = this.f119080p.query("cloud_media", m128941b, "cloudId IN (" + m131214n0 + ")", null, null, null, null);
            while (query.moveToNext()) {
                try {
                    try {
                        AbstractC19074t.m100205c(query);
                        arrayList.add(m128895g0(query));
                    } catch (Exception e11) {
                        C26676b.m136954d("SMLZCloudDB", e11);
                    }
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(query, null);
            return arrayList;
        } catch (Exception e12) {
            C26676b.m136954d("SMLZCloudDB", e12);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:            return r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:            if (r3 == null) goto L48;     */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m128920Q(int i11, long j11, int i12, String str) {
        String m131375W;
        AbstractC19074t.m100208f(str, "excludedOwnerId");
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                m131375W = AbstractC25358n.m131375W(a.InterfaceC32923a.Companion.m128941b(), ",", null, null, 0, null, null, 62, null);
                cursor = this.f119080p.rawQuery("SELECT " + m131375W + " FROM cloud_media WHERE cloudId IN (SELECT cloudId FROM cloud_media WHERE ownerId != ? AND mediaSize < ? AND msgType = ? ORDER BY RANDOM() LIMIT ?)", new String[]{str, String.valueOf(j11), String.valueOf(i12), String.valueOf(i11 + 1)});
                if (cursor != null && cursor.moveToFirst()) {
                    while (cursor.moveToNext()) {
                        arrayList.add(m128895g0(cursor));
                    }
                }
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudDB", e11);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: Q0 */
    public final void m128921Q0() {
        try {
            this.f119080p.execSQL("delete from sync_media_ext_info where noiseId in (select noiseId from sync_media_ext_info left join cloud_media on noiseId=cloudId where cloudId is null)");
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: S0 */
    public final void m128922S0(List list, long j11) {
        String m131214n0;
        AbstractC19074t.m100208f(list, "excludedOwnerIds");
        try {
            m131214n0 = AbstractC25332a0.m131214n0(list, "','", "'", "'", 0, null, e.f119087q, 24, null);
            this.f119080p.delete("cloud_media", "ownerId NOT IN (" + m131214n0 + ") AND cloudTimestamp <= ?", new String[]{String.valueOf(j11)});
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: Z */
    public final List m128923Z() {
        List m131502j;
        try {
            ArrayList arrayList = new ArrayList();
            Cursor query = this.f119080p.query("cloud_media_grace_period", a.InterfaceC32923a.Companion.m128941b(), null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    AbstractC19074t.m100205c(query);
                    arrayList.add(m128895g0(query));
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(query, null);
            return arrayList;
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:            r1 = pm0.C24848g0.f119245a;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:            bn0.AbstractC2933b.m13890a(r5, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:            return m128890R(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:            if (r5.moveToFirst() != false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:            r0.put(java.lang.Integer.valueOf(r5.getInt(r5.getColumnIndexOrThrow("msgType"))), java.lang.Long.valueOf(r5.getLong(r5.getColumnIndexOrThrow("total_media_size"))));     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003f, code lost:            if (r5.moveToNext() != false) goto L45;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CloudQuotaUsage m128924c(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor rawQuery = this.f119080p.rawQuery("SELECT msgType, SUM(mediaSize) AS total_media_size FROM cloud_media WHERE ownerId = ? GROUP BY msgType", new String[]{str});
        try {
        } finally {
        }
    }

    /* renamed from: c0 */
    public final List m128925c0() {
        List m131502j;
        try {
            ArrayList arrayList = new ArrayList();
            Cursor query = this.f119080p.query("cloud_media", a.InterfaceC32923a.Companion.m128941b(), null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    AbstractC19074t.m100205c(query);
                    arrayList.add(m128895g0(query));
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(query, null);
            return arrayList;
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:            r2 = pm0.C24848g0.f119245a;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:            bn0.AbstractC2933b.m13890a(r1, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:            return m128892T(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:            if (r1.moveToFirst() != false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:            r0.put(java.lang.Integer.valueOf(r1.getInt(r1.getColumnIndexOrThrow("msgType"))), java.lang.Long.valueOf(r1.getLong(r1.getColumnIndexOrThrow("total_media_size"))));     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:            if (r1.moveToNext() != false) goto L45;     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ZCloudQuotaUsage m128926d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor rawQuery = this.f119080p.rawQuery("SELECT msgType, SUM(mediaSize) AS total_media_size FROM cloud_media GROUP BY msgType", null);
        try {
        } finally {
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: d0 */
    public final List m128927d0(String str) {
        List m131502j;
        Cursor query;
        String m131375W;
        AbstractC19074t.m100208f(str, "ownerId");
        try {
            ArrayList arrayList = new ArrayList();
            String[] m128941b = a.InterfaceC32923a.Companion.m128941b();
            if (!TextUtils.isEmpty(str)) {
                query = this.f119080p.query("cloud_media", m128941b, "ownerId = ?", new String[]{str}, null, null, null);
                while (query.moveToNext()) {
                    try {
                        AbstractC19074t.m100205c(query);
                        arrayList.add(m128895g0(query));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(query, null);
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            query = this.f119080p.query("cloud_media", new String[]{"DISTINCT ownerId"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList2.add(query.getString(query.getColumnIndexOrThrow("ownerId")));
                } finally {
                    try {
                        throw th2;
                    } finally {
                        AbstractC2933b.m13890a(query, th2);
                    }
                }
            }
            C24848g0 c24848g02 = C24848g0.f119245a;
            AbstractC2933b.m13890a(query, null);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (!AbstractC21935u.m114550q((String) obj)) {
                    arrayList3.add(obj);
                }
            }
            int size = arrayList3.size();
            String[] strArr = new String[size];
            for (int i11 = 0; i11 < size; i11++) {
                strArr[i11] = "?";
            }
            m131375W = AbstractC25358n.m131375W(strArr, ", ", null, null, 0, null, null, 62, null);
            query = this.f119080p.query("cloud_media", m128941b, "ownerId IN (" + m131375W + ")", (String[]) arrayList3.toArray(new String[0]), null, null, null);
            while (query.moveToNext()) {
                try {
                    AbstractC19074t.m100205c(query);
                    arrayList.add(m128895g0(query));
                } catch (Throwable th22) {
                }
            }
            C24848g0 c24848g03 = C24848g0.f119245a;
            AbstractC2933b.m13890a(query, null);
            return arrayList;
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        C26676b.m136954d("SMLZCloudDB", e11);
        m131502j = AbstractC25368s.m131502j();
        return m131502j;
    }

    /* renamed from: f */
    public final int m128928f() {
        Cursor query = this.f119080p.query("sync_media_ext_info", new String[]{"COUNT(noiseId)"}, null, null, null, null, null);
        try {
            int i11 = 0;
            if (query.moveToFirst()) {
                i11 = query.getInt(0);
            }
            AbstractC2933b.m13890a(query, null);
            return i11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2933b.m13890a(query, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:            if (r5.moveToFirst() != false) goto L44;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:            r0 = r5.getString(r5.getColumnIndexOrThrow("cloudId"));        fn0.AbstractC19074t.m100205c(r0);        r1.add(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:            if (r5.moveToNext() != false) goto L61;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:            r0 = pm0.C24848g0.f119245a;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:            bn0.AbstractC2933b.m13890a(r5, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:            return r1;     */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m128929f0(String str) {
        String str2;
        String[] strArr;
        AbstractC19074t.m100208f(str, "ownerId");
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "WHERE ownerId = ? ";
        }
        String str3 = "SELECT cloudId FROM cloud_media " + str2;
        if (TextUtils.isEmpty(str)) {
            strArr = null;
        } else {
            strArr = new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f119080p.rawQuery(str3, strArr);
        try {
        } finally {
        }
    }

    /* renamed from: h */
    public final void m128930h() {
        try {
            this.f119080p.execSQL("CREATE TABLE IF NOT EXISTS cloud_media_grace_period AS SELECT * FROM cloud_media");
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC19074t.m100208f(sQLiteDatabase, "db");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        AbstractC19074t.m100208f(sQLiteDatabase, "db");
    }

    /* renamed from: r0 */
    public final List m128931r0(long j11, int i11, int i12) {
        List m131502j;
        try {
            ArrayList arrayList = new ArrayList();
            try {
                Cursor query = this.f119080p.query("cloud_media", new String[]{"senderUid", "ownerId", "cliMsgId", "gloMsgId"}, "msgType!=? AND timestamp<=?", new String[]{"22", String.valueOf(j11)}, null, null, "ownerId", (i11 * i12) + ", " + i12);
                while (query.moveToNext()) {
                    try {
                        MessageId.C7932a c7932a = MessageId.Companion;
                        long j12 = query.getLong(query.getColumnIndexOrThrow("cliMsgId"));
                        long j13 = query.getLong(query.getColumnIndexOrThrow("gloMsgId"));
                        String string = query.getString(query.getColumnIndexOrThrow("ownerId"));
                        AbstractC19074t.m100207e(string, "getString(...)");
                        arrayList.add(c7932a.m41063a(j12, j13, string, String.valueOf(query.getInt(query.getColumnIndexOrThrow("senderUid")))));
                    } finally {
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(query, null);
                return arrayList;
            } catch (Exception e11) {
                e = e11;
                C26676b.m136954d("SMLZCloudDB", e);
                m131502j = AbstractC25368s.m131502j();
                return m131502j;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: s0 */
    public final List m128932s0(int i11) {
        List m131502j;
        try {
            ArrayList arrayList = new ArrayList();
            Cursor query = this.f119080p.query("verify_queue", new String[]{"*"}, null, null, null, null, null, String.valueOf(i11));
            while (query.moveToNext()) {
                try {
                    arrayList.add(query.getString(query.getColumnIndexOrThrow("noiseId")));
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(query, null);
            return arrayList;
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: t */
    public final void m128933t() {
        C26676b.m136957g("SMLZCloudDB", "deleteAllCloudMediaItems()", null, 4, null);
        try {
            this.f119080p.delete("cloud_media", null, null);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: v */
    public final void m128934v() {
        try {
            this.f119080p.delete("sync_media_ext_info", null, null);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: w0 */
    public final List m128935w0() {
        List m131502j;
        try {
            ArrayList arrayList = new ArrayList();
            Cursor rawQuery = this.f119080p.rawQuery(f119079r, null);
            while (rawQuery.moveToNext()) {
                try {
                    AbstractC19074t.m100205c(rawQuery);
                    arrayList.add(m128895g0(rawQuery));
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(rawQuery, null);
            return arrayList;
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: y */
    public final void m128936y(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "msgId");
        try {
            if (!m128883H0("cloud_media_grace_period")) {
                return;
            }
            this.f119080p.delete("cloud_media_grace_period", "cliMsgId = ?", new String[]{messageId.m41044h()});
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }

    /* renamed from: y0 */
    public final void m128937y0(List list) {
        AbstractC19074t.m100208f(list, "items");
        try {
            try {
                this.f119080p.beginTransaction();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f119080p.insertWithOnConflict("cloud_media", null, m128891R0(new ContentValues(), (C25821b) it.next()), 5);
                }
                this.f119080p.setTransactionSuccessful();
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudDB", e11);
            }
            this.f119080p.endTransaction();
        } catch (Throwable th2) {
            this.f119080p.endTransaction();
            throw th2;
        }
    }

    /* renamed from: z0 */
    public final void m128938z0(String str) {
        AbstractC19074t.m100208f(str, "noiseId");
        try {
            SQLiteDatabase sQLiteDatabase = this.f119080p;
            ContentValues contentValues = new ContentValues();
            contentValues.put("noiseId", str);
            C24848g0 c24848g0 = C24848g0.f119245a;
            sQLiteDatabase.insert("verify_queue", null, contentValues);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudDB", e11);
        }
    }
}
