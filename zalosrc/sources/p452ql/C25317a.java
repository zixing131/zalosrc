package p452ql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import bn0.AbstractC2933b;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zalocloud.exception.ZaloCloudDBException;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import me0.AbstractC23149n0;
import od0.EnumC24229g;
import p452ql.C25317a;
import p487rl.C25822c;
import p487rl.C25823d;
import p487rl.EnumC25824e;
import p487rl.EnumC25825f;
import p665y0.C30240b;
import pl.AbstractC24814e;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import tg0.C26675a;
import tg0.C26676b;

/* renamed from: ql.a */
/* loaded from: classes3.dex */
public final class C25317a {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static final ConcurrentHashMap f121387b = new ConcurrentHashMap();

    /* renamed from: a */
    private final b f121388a;

    /* renamed from: ql.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C25317a m131073a(String str) {
            Object putIfAbsent;
            AbstractC19074t.m100208f(str, "userUid");
            ConcurrentHashMap concurrentHashMap = C25317a.f121387b;
            Object obj = concurrentHashMap.get(str);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new C25317a(MainApplication.Companion.m35500c(), str)))) != null) {
                obj = putIfAbsent;
            }
            AbstractC19074t.m100207e(obj, "getOrPut(...)");
            return (C25317a) obj;
        }
    }

    /* renamed from: ql.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends SQLiteOpenHelper {
        public static final a Companion = new a(null);

        /* renamed from: q */
        private static final String[] f121389q = {"CREATE TABLE IF NOT EXISTS migrate_cloud_media (message_id TEXT PRIMARY KEY, thread_id TEXT NOT NULL, local_path TEXT, download_url TEXT, timestamp INTEGER DEFAULT 0, analyzed_type INTEGER DEFAULT 0, msg_type INTEGER DEFAULT 0, is_e2ee INTEGER DEFAULT 0, is_group INTEGER DEFAULT 0, upload_feature INTEGER NOT NULL, is_uploaded INTEGER DEFAULT 0, file_size INTEGER DEFAULT 0, md5_checksum TEXT, media_ext_info TEXT);", "CREATE TABLE IF NOT EXISTS analyzed_conversations (conversation_uid TEXT PRIMARY KEY);", "CREATE TABLE IF NOT EXISTS state_log (id TEXT NOT NULL, state INTEGER NOT NULL, migration_step INTEGER DEFAULT 0, progress INTEGER NOT NULL, timestamp timestamp DEFAULT (strftime('%s', 'now')));"};

        /* renamed from: p */
        private final SQLiteDatabase f121390p;

        /* renamed from: ql.a$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: ql.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC32951b {
            public static final a Companion = a.f121391a;

            /* renamed from: ql.a$b$b$a */
            /* loaded from: classes3.dex */
            public static final class a {

                /* renamed from: a */
                static final /* synthetic */ a f121391a = new a();

                /* renamed from: b */
                private static final String[] f121392b = {"message_id", "thread_id", "local_path", "download_url", "timestamp", "analyzed_type", "msg_type", "is_e2ee", "is_group", "upload_feature", "is_uploaded", "file_size", "md5_checksum", "media_ext_info"};

                private a() {
                }

                /* renamed from: a */
                public final String[] m131082a() {
                    return f121392b;
                }
            }
        }

        /* renamed from: ql.a$b$c */
        /* loaded from: classes3.dex */
        public interface c {
            public static final a Companion = a.f121393a;

            /* renamed from: ql.a$b$c$a */
            /* loaded from: classes3.dex */
            public static final class a {

                /* renamed from: a */
                static final /* synthetic */ a f121393a = new a();

                /* renamed from: b */
                private static final String[] f121394b = {"id", "state", "migration_step", "progress", "timestamp"};

                private a() {
                }

                /* renamed from: a */
                public final String[] m131083a() {
                    return f121394b;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(context, "zalo_cloud_migration.db", (SQLiteDatabase.CursorFactory) null, 1);
            AbstractC19074t.m100208f(context, "context");
            SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase("zalo_cloud_migration.db", 0, null, new DatabaseErrorHandler() { // from class: ql.b
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C25317a.b.this.m131080o(sQLiteDatabase);
                }
            });
            AbstractC19074t.m100207e(openOrCreateDatabase, "openOrCreateDatabase(...)");
            this.f121390p = openOrCreateDatabase;
            m131075b();
            m131076c();
            int m131077d = m131077d();
            if (6 > m131077d) {
                m131079i(m131077d);
            }
        }

        /* renamed from: b */
        private final void m131075b() {
            try {
                if (m131078h("db_version")) {
                    return;
                }
                C26676b.m136955e("SMLZCloudMigrationDB", "Create DB version table", C26676b.b.f126331p);
                SQLiteDatabase sQLiteDatabase = this.f121390p;
                sQLiteDatabase.execSQL("CREATE TABLE db_version (version)");
                sQLiteDatabase.execSQL("INSERT INTO db_version VALUES (0)");
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudMigrationDB", e11);
            }
        }

        /* renamed from: c */
        private final void m131076c() {
            for (String str : f121389q) {
                this.f121390p.execSQL(str);
            }
        }

        /* renamed from: d */
        private final int m131077d() {
            int columnIndex;
            try {
                Cursor rawQuery = this.f121390p.rawQuery("SELECT version FROM db_version", null);
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
                C26676b.m136954d("SMLZCloudMigrationDB", e11);
                return 0;
            }
        }

        /* renamed from: h */
        private final boolean m131078h(String str) {
            boolean z11;
            try {
                Cursor rawQuery = this.f121390p.rawQuery("SELECT * FROM SQLITE_MASTER WHERE NAME = '" + str + "'", null);
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
                C26676b.m136954d("SMLZCloudMigrationDB", e11);
                return false;
            }
        }

        /* renamed from: i */
        private final void m131079i(int i11) {
            C26676b.m136955e("SMLZCloudMigrationDB", "Migrate DB: curr=" + i11 + ", target=6", C26676b.b.f126331p);
            try {
                if (i11 < 2) {
                    try {
                        AbstractC23149n0.m118854b(this.f121390p, "migrate_cloud_media", "upload_feature", "INTEGER");
                        i11 = 2;
                    } catch (Exception e11) {
                        C26676b.m136954d("SMLZCloudMigrationDB", e11);
                        this.f121390p.execSQL("UPDATE db_version SET version = " + i11 + " WHERE 1");
                        return;
                    }
                }
                if (i11 == 2) {
                    AbstractC23149n0.m118854b(this.f121390p, "migrate_cloud_media", "thread_id", "TEXT");
                    i11 = 3;
                }
                if (i11 == 3) {
                    AbstractC23149n0.m118855c(this.f121390p, "migrate_cloud_media", "file_size", "INTEGER", "0");
                    AbstractC23149n0.m118854b(this.f121390p, "migrate_cloud_media", "md5_checksum", "TEXT");
                    i11 = 4;
                }
                if (i11 == 4) {
                    AbstractC23149n0.m118854b(this.f121390p, "migrate_cloud_media", "media_ext_info", "TEXT");
                    i11 = 5;
                }
                if (i11 == 5) {
                    AbstractC23149n0.m118854b(this.f121390p, "state_log", "id", "TEXT");
                    this.f121390p.execSQL("UPDATE state_log SET id = 'cloud_media_migration';");
                }
                this.f121390p.execSQL("UPDATE db_version SET version = 6 WHERE 1");
            } catch (Throwable th2) {
                this.f121390p.execSQL("UPDATE db_version SET version = " + i11 + " WHERE 1");
                throw th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final void m131080o(SQLiteDatabase sQLiteDatabase) {
            try {
                C26676b.m136955e("SMLZCloudMigrationDB", "ZaloCloudMigrationDB is Corrupted", C26676b.b.f126335t);
                C26675a.m136890L(C26675a.f126213a, 1504230, -1, "ZaloCloudMigrationDB is Corrupted", null, 0L, 0L, 56, null);
                C26676b.m136954d("SMLZCloudMigrationDB", new ZaloCloudDBException(-1, "ZaloCloudMigrationDB is Corrupted"));
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudMigrationDB", e11);
            }
        }

        /* renamed from: f */
        public final SQLiteDatabase m131081f() {
            return this.f121390p;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            AbstractC19074t.m100208f(sQLiteDatabase, "db");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
            AbstractC19074t.m100208f(sQLiteDatabase, "db");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ql.a$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f121395q = new c();

        c() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo205i9(EnumC25825f enumC25825f) {
            AbstractC19074t.m100208f(enumC25825f, "it");
            return String.valueOf(enumC25825f.m133199c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ql.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f121396q = new d();

        d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo205i9(EnumC25824e enumC25824e) {
            AbstractC19074t.m100208f(enumC25824e, "it");
            return String.valueOf(enumC25824e.m133197c());
        }
    }

    public C25317a(Context context, String str) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "userUid");
        this.f121388a = new b(AbstractC24814e.m129015a(context, str));
    }

    /* renamed from: b */
    private final C24860q m131053b(String str, List list, List list2) {
        String m131214n0;
        String m131214n02;
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() != 0) {
            sb2.append("thread_id=?");
            arrayList.add(str);
        } else {
            sb2.append("thread_id!=?");
            arrayList.add("204278670");
        }
        if (!list.isEmpty()) {
            sb2.append(" AND ");
            m131214n02 = AbstractC25332a0.m131214n0(list, null, null, null, 0, null, c.f121395q, 31, null);
            sb2.append("analyzed_type IN (" + m131214n02 + ")");
        }
        if (!list2.isEmpty()) {
            sb2.append(" AND ");
            m131214n0 = AbstractC25332a0.m131214n0(list2, null, null, null, 0, null, d.f121396q, 31, null);
            sb2.append("is_uploaded IN (" + m131214n0 + ")");
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return AbstractC24866w.m129235a(sb3, arrayList.toArray(new String[0]));
    }

    /* renamed from: c */
    private final C25822c m131054c(Cursor cursor) {
        String string = cursor.getString(0);
        AbstractC19074t.m100207e(string, "getString(...)");
        return new C25822c(string, cursor.getInt(1), cursor.getInt(2), cursor.getInt(3), cursor.getLong(4));
    }

    /* renamed from: d */
    private final C25823d m131055d(Cursor cursor) {
        boolean z11;
        boolean z12;
        int i11 = 0;
        String string = cursor.getString(0);
        String string2 = cursor.getString(1);
        String string3 = cursor.getString(2);
        String string4 = cursor.getString(3);
        int i12 = cursor.getInt(5);
        EnumC25825f[] values = EnumC25825f.values();
        int length = values.length;
        int i13 = 0;
        while (i13 < length) {
            EnumC25825f enumC25825f = values[i13];
            if (enumC25825f.m133199c() == i12) {
                long j11 = cursor.getLong(4);
                int i14 = cursor.getInt(6);
                if (cursor.getInt(7) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (cursor.getInt(8) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i15 = cursor.getInt(9);
                EnumC24229g[] values2 = EnumC24229g.values();
                int length2 = values2.length;
                while (i11 < length2) {
                    EnumC24229g enumC24229g = values2[i11];
                    EnumC24229g[] enumC24229gArr = values2;
                    if (enumC24229g.m126452c() == i15) {
                        int i16 = cursor.getInt(10);
                        EnumC25824e[] values3 = EnumC25824e.values();
                        int length3 = values3.length;
                        int i17 = 0;
                        while (i17 < length3) {
                            EnumC25824e enumC25824e = values3[i17];
                            EnumC25824e[] enumC25824eArr = values3;
                            if (enumC25824e.m133197c() == i16) {
                                long j12 = cursor.getLong(11);
                                String string5 = cursor.getString(12);
                                String string6 = cursor.getString(13);
                                AbstractC19074t.m100205c(string);
                                AbstractC19074t.m100205c(string2);
                                AbstractC19074t.m100205c(string3);
                                AbstractC19074t.m100205c(string4);
                                return new C25823d(string, string2, string3, string4, j11, enumC25825f, i14, z11, z12, enumC24229g, enumC25824e, j12, string5, string6);
                            }
                            i17++;
                            values3 = enumC25824eArr;
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    i11++;
                    values2 = enumC24229gArr;
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            i13++;
            i11 = 0;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: m */
    private final SQLiteDatabase m131056m() {
        return this.f121388a.m131081f();
    }

    /* renamed from: s */
    private final ContentValues m131057s(C25823d c25823d) {
        Integer num;
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", c25823d.m133186l());
        contentValues.put("thread_id", c25823d.m133189o());
        contentValues.put("local_path", c25823d.m133182h());
        contentValues.put("download_url", c25823d.m133180f());
        contentValues.put("timestamp", Long.valueOf(c25823d.m133190p()));
        contentValues.put("analyzed_type", Integer.valueOf(c25823d.m133191q().m133199c()));
        contentValues.put("msg_type", Integer.valueOf(c25823d.m133187m()));
        contentValues.put("is_e2ee", Boolean.valueOf(c25823d.m133193t()));
        contentValues.put("is_group", Boolean.valueOf(c25823d.m133194u()));
        EnumC24229g m133192r = c25823d.m133192r();
        if (m133192r != null) {
            num = Integer.valueOf(m133192r.m126452c());
        } else {
            num = null;
        }
        contentValues.put("upload_feature", num);
        contentValues.put("is_uploaded", Integer.valueOf(c25823d.m133188n().m133197c()));
        contentValues.put("file_size", Long.valueOf(c25823d.m133181g()));
        contentValues.put("md5_checksum", c25823d.m133178d());
        contentValues.put("media_ext_info", c25823d.m133184j());
        return contentValues;
    }

    /* renamed from: e */
    public final int m131058e(String str, List list, List list2) {
        AbstractC19074t.m100208f(list, "filterTypes");
        AbstractC19074t.m100208f(list2, "filterStates");
        C24860q m131053b = m131053b(str, list, list2);
        Cursor query = m131056m().query("migrate_cloud_media", new String[]{"COUNT(message_id)"}, (String) m131053b.m129213a(), (String[]) m131053b.m129214b(), null, null, null);
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

    /* renamed from: f */
    public final int m131059f(String str, int i11) {
        AbstractC19074t.m100208f(str, "id");
        Cursor query = m131056m().query("state_log", new String[]{"COUNT(1)"}, "id=? AND state=?", new String[]{str, String.valueOf(i11)}, null, null, null);
        try {
            int i12 = 0;
            if (query.moveToFirst()) {
                i12 = query.getInt(0);
            }
            AbstractC2933b.m13890a(query, null);
            return i12;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2933b.m13890a(query, th2);
                throw th3;
            }
        }
    }

    /* renamed from: g */
    public final void m131060g(String str, List list) {
        List m131502j;
        AbstractC19074t.m100208f(list, "types");
        try {
            m131502j = AbstractC25368s.m131502j();
            C24860q m131053b = m131053b(str, list, m131502j);
            m131056m().delete("migrate_cloud_media", (String) m131053b.m129213a(), (String[]) m131053b.m129214b());
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMigrationDB", e11);
        }
    }

    /* renamed from: h */
    public final void m131061h(String str) {
        String str2;
        try {
            ArrayList arrayList = new ArrayList();
            if (str != null && str.length() != 0) {
                arrayList.add(str);
                str2 = "conversation_uid=?";
                m131056m().delete("analyzed_conversations", str2, (String[]) arrayList.toArray(new String[0]));
            }
            arrayList.add("204278670");
            str2 = "conversation_uid!=?";
            m131056m().delete("analyzed_conversations", str2, (String[]) arrayList.toArray(new String[0]));
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMigrationDB", e11);
        }
    }

    /* renamed from: i */
    public final void m131062i(String str) {
        AbstractC19074t.m100208f(str, "id");
        try {
            m131056m().delete("state_log", "id=?", new String[]{str});
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMigrationDB", e11);
        }
    }

    /* renamed from: j */
    public final List m131063j(String str, List list, List list2) {
        List m131502j;
        AbstractC19074t.m100208f(list, "filterTypes");
        AbstractC19074t.m100208f(list2, "filterStates");
        try {
            ArrayList arrayList = new ArrayList();
            C24860q m131053b = m131053b(str, list, list2);
            Cursor query = m131056m().query("migrate_cloud_media", b.InterfaceC32951b.Companion.m131082a(), (String) m131053b.m129213a(), (String[]) m131053b.m129214b(), null, null, "thread_id");
            while (query.moveToNext()) {
                try {
                    AbstractC19074t.m100205c(query);
                    arrayList.add(m131055d(query));
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(query, null);
            return arrayList;
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMigrationDB", e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: k */
    public final List m131064k(String str, List list, List list2, int i11, int i12) {
        List m131502j;
        AbstractC19074t.m100208f(list, "filterTypes");
        AbstractC19074t.m100208f(list2, "filterStates");
        try {
            ArrayList arrayList = new ArrayList();
            C24860q m131053b = m131053b(str, list, list2);
            String str2 = (String) m131053b.m129213a();
            String[] strArr = (String[]) m131053b.m129214b();
            Cursor query = m131056m().query("migrate_cloud_media", b.InterfaceC32951b.Companion.m131082a(), str2, strArr, null, null, "thread_id, timestamp DESC", i11 + ", " + i12);
            while (query.moveToNext()) {
                try {
                    AbstractC19074t.m100205c(query);
                    arrayList.add(m131055d(query));
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(query, null);
            return arrayList;
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMigrationDB", e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: l */
    public final Set m131065l() {
        C30240b c30240b = new C30240b();
        try {
            Cursor query = m131056m().query("analyzed_conversations", new String[]{"conversation_uid"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    c30240b.add(query.getString(0));
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(query, null);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMigrationDB", e11);
        }
        return c30240b;
    }

    /* renamed from: n */
    public final C25822c m131066n(String str) {
        Cursor cursor;
        C25822c c25822c;
        AbstractC19074t.m100208f(str, "id");
        Cursor query = m131056m().query("state_log", b.c.Companion.m131083a(), "id=?", new String[]{str}, null, null, "timestamp DESC", "1");
        try {
            if (query.moveToFirst()) {
                cursor = query;
            } else {
                cursor = null;
            }
            if (cursor != null) {
                c25822c = m131054c(cursor);
            } else {
                c25822c = null;
            }
            AbstractC2933b.m13890a(query, null);
            return c25822c;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2933b.m13890a(query, th2);
                throw th3;
            }
        }
    }

    /* renamed from: o */
    public final void m131067o(C25823d c25823d) {
        AbstractC19074t.m100208f(c25823d, "migrationItem");
        try {
            m131056m().insertWithOnConflict("migrate_cloud_media", null, m131057s(c25823d), 4);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMigrationDB", e11);
        }
    }

    /* renamed from: p */
    public final void m131068p(List list) {
        AbstractC19074t.m100208f(list, "migrationItems");
        m131056m().beginTransaction();
        try {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m131067o((C25823d) it.next());
                }
                m131056m().setTransactionSuccessful();
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudMigrationDB", e11);
            }
            m131056m().endTransaction();
        } catch (Throwable th2) {
            m131056m().endTransaction();
            throw th2;
        }
    }

    /* renamed from: q */
    public final void m131069q(C25822c c25822c) {
        AbstractC19074t.m100208f(c25822c, "logItem");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", c25822c.m133169a());
            contentValues.put("state", Integer.valueOf(c25822c.m133172d()));
            contentValues.put("migration_step", Integer.valueOf(c25822c.m133170b()));
            contentValues.put("progress", Integer.valueOf(c25822c.m133171c()));
            contentValues.put("timestamp", Long.valueOf(c25822c.m133173e()));
            m131056m().insert("state_log", null, contentValues);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMigrationDB", e11);
        }
    }

    /* renamed from: r */
    public final void m131070r(String str) {
        AbstractC19074t.m100208f(str, "conversationUid");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("conversation_uid", str);
            m131056m().insert("analyzed_conversations", null, contentValues);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMigrationDB", e11);
        }
    }

    /* renamed from: t */
    public final void m131071t(String str, EnumC25824e enumC25824e) {
        AbstractC19074t.m100208f(str, "messageId");
        AbstractC19074t.m100208f(enumC25824e, "state");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_uploaded", Integer.valueOf(enumC25824e.m133197c()));
            m131056m().update("migrate_cloud_media", contentValues, " message_id = ? ", new String[]{str});
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMigrationDB", e11);
        }
    }

    /* renamed from: u */
    public final void m131072u(String str, EnumC25825f enumC25825f) {
        AbstractC19074t.m100208f(str, "messageId");
        AbstractC19074t.m100208f(enumC25825f, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("analyzed_type", Integer.valueOf(enumC25825f.m133199c()));
            m131056m().update("migrate_cloud_media", contentValues, " message_id = ? ", new String[]{str});
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMigrationDB", e11);
        }
    }
}
