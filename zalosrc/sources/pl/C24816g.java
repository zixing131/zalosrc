package pl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import bn0.AbstractC2933b;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zalocloud.exception.ZaloCloudDBException;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.concurrent.ConcurrentHashMap;
import me0.AbstractC23149n0;
import on0.AbstractC24341v;
import p487rl.C25820a;
import pl.C24816g;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import tg0.C26675a;
import tg0.C26676b;

/* renamed from: pl.g */
/* loaded from: classes3.dex */
public final class C24816g {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static final ConcurrentHashMap f119146b = new ConcurrentHashMap();

    /* renamed from: a */
    private final b f119147a;

    /* renamed from: pl.g$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: pl.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C32925a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C32925a f119148q = new C32925a();

            C32925a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C24816g mo12V4() {
                return new C24816g(AbstractC24814e.m129016b(MainApplication.Companion.m35500c(), null, 1, null));
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C24816g m129043a() {
            boolean z11;
            InterfaceC24854k m129210a;
            C24816g c24816g;
            boolean m127128x;
            String str = CoreUtility.f89233i;
            if (str != null) {
                m127128x = AbstractC24341v.m127128x(str);
                if (!m127128x) {
                    z11 = false;
                    if (!(true ^ z11)) {
                        m129210a = AbstractC24856m.m129210a(C32925a.f119148q);
                        InterfaceC24854k interfaceC24854k = (InterfaceC24854k) C24816g.f119146b.putIfAbsent(str, m129210a);
                        if (interfaceC24854k == null || (c24816g = (C24816g) interfaceC24854k.getValue()) == null) {
                            return (C24816g) m129210a.getValue();
                        }
                        return c24816g;
                    }
                    throw new IllegalArgumentException("User UID is required. Please ensure it is available before accessing ZaloCloud's database.".toString());
                }
            }
            z11 = true;
            if (!(true ^ z11)) {
            }
        }
    }

    /* renamed from: pl.g$b */
    /* loaded from: classes3.dex */
    public static final class b extends SQLiteOpenHelper {
        public static final C32927b Companion = new C32927b(null);

        /* renamed from: q */
        private static final String[] f119149q = {"CREATE TABLE IF NOT EXISTS cloud_key (key_version INTEGER PRIMARY KEY, public_key TEXT, hardware_secured_private_key TEXT, sha256_checksum TEXT);"};

        /* renamed from: p */
        private final SQLiteDatabase f119150p;

        /* renamed from: pl.g$b$a */
        /* loaded from: classes3.dex */
        public interface a {
            public static final C32926a Companion = C32926a.f119151a;

            /* renamed from: pl.g$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C32926a {

                /* renamed from: a */
                static final /* synthetic */ C32926a f119151a = new C32926a();

                /* renamed from: b */
                private static final String[] f119152b = {"key_version", "public_key", "hardware_secured_private_key", "sha256_checksum"};

                private C32926a() {
                }

                /* renamed from: a */
                public final String[] m129053a() {
                    return f119152b;
                }
            }
        }

        /* renamed from: pl.g$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C32927b {
            private C32927b() {
            }

            public /* synthetic */ C32927b(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(context, "zalo_cloud_metadata.db", (SQLiteDatabase.CursorFactory) null, 1);
            AbstractC19074t.m100208f(context, "context");
            SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase("zalo_cloud_metadata.db", 0, null, new DatabaseErrorHandler() { // from class: pl.h
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C24816g.b.this.m129051o(sQLiteDatabase);
                }
            });
            AbstractC19074t.m100207e(openOrCreateDatabase, "openOrCreateDatabase(...)");
            this.f119150p = openOrCreateDatabase;
            m129046b();
            m129047c();
            int m129048d = m129048d();
            if (2 > m129048d) {
                m129050i(m129048d);
            }
        }

        /* renamed from: b */
        private final void m129046b() {
            try {
                if (m129049h("db_version")) {
                    return;
                }
                C26676b.m136955e("SMLZCloudMetadataDB", "Create DB version table", C26676b.b.f126331p);
                SQLiteDatabase sQLiteDatabase = this.f119150p;
                sQLiteDatabase.execSQL("CREATE TABLE db_version (version)");
                sQLiteDatabase.execSQL("INSERT INTO db_version VALUES (0)");
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudMetadataDB", e11);
            }
        }

        /* renamed from: c */
        private final void m129047c() {
            for (String str : f119149q) {
                this.f119150p.execSQL(str);
            }
        }

        /* renamed from: d */
        private final int m129048d() {
            int columnIndex;
            try {
                Cursor rawQuery = this.f119150p.rawQuery("SELECT version FROM db_version", null);
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
                C26676b.m136954d("SMLZCloudMetadataDB", e11);
                return 0;
            }
        }

        /* renamed from: h */
        private final boolean m129049h(String str) {
            boolean z11;
            try {
                Cursor rawQuery = this.f119150p.rawQuery("SELECT * FROM SQLITE_MASTER WHERE NAME = '" + str + "'", null);
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
                C26676b.m136954d("SMLZCloudMetadataDB", e11);
                return false;
            }
        }

        /* renamed from: i */
        private final void m129050i(int i11) {
            C26676b.m136955e("SMLZCloudMetadataDB", "Migrate DB: curr=" + i11 + ", target=2", C26676b.b.f126331p);
            try {
                if (i11 < 2) {
                    try {
                        AbstractC23149n0.m118854b(this.f119150p, "cloud_key", "sha256_checksum", "TEXT");
                    } catch (Exception e11) {
                        C26676b.m136954d("SMLZCloudMetadataDB", e11);
                        this.f119150p.execSQL("UPDATE db_version SET version = " + i11 + " WHERE 1");
                        return;
                    }
                }
                this.f119150p.execSQL("UPDATE db_version SET version = 2 WHERE 1");
            } catch (Throwable th2) {
                this.f119150p.execSQL("UPDATE db_version SET version = " + i11 + " WHERE 1");
                throw th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final void m129051o(SQLiteDatabase sQLiteDatabase) {
            try {
                C26676b.m136955e("SMLZCloudMetadataDB", "ZaloCloudMetadataDB is Corrupted", C26676b.b.f126335t);
                C26675a.m136890L(C26675a.f126213a, 1504230, -1, "ZaloCloudMetadataDB is Corrupted", null, 0L, 0L, 56, null);
                C26676b.m136954d("SMLZCloudMetadataDB", new ZaloCloudDBException(-1, "ZaloCloudMetadataDB is Corrupted"));
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudMetadataDB", e11);
            }
        }

        /* renamed from: f */
        public final SQLiteDatabase m129052f() {
            return this.f119150p;
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

    public C24816g(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f119147a = new b(context);
    }

    /* renamed from: b */
    private final C25820a m129039b(Cursor cursor) {
        int i11 = cursor.getInt(0);
        String string = cursor.getString(1);
        AbstractC19074t.m100207e(string, "getString(...)");
        String string2 = cursor.getString(2);
        AbstractC19074t.m100207e(string2, "getString(...)");
        String string3 = cursor.getString(3);
        if (string3 == null) {
            string3 = "";
        }
        return new C25820a(i11, string, string2, string3);
    }

    /* renamed from: d */
    private final SQLiteDatabase m129040d() {
        return this.f119147a.m129052f();
    }

    /* renamed from: c */
    public final C25820a m129041c() {
        Cursor cursor;
        C25820a c25820a;
        try {
            Cursor query = m129040d().query("cloud_key", b.a.Companion.m129053a(), null, null, null, null, "key_version DESC", "1");
            try {
                if (query.moveToFirst()) {
                    cursor = query;
                } else {
                    cursor = null;
                }
                if (cursor != null) {
                    c25820a = m129039b(cursor);
                } else {
                    c25820a = null;
                }
                AbstractC2933b.m13890a(query, null);
                return c25820a;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC2933b.m13890a(query, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMetadataDB", e11);
            return null;
        }
    }

    /* renamed from: e */
    public final void m129042e(C25820a c25820a) {
        AbstractC19074t.m100208f(c25820a, "cloudKey");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key_version", Integer.valueOf(c25820a.m133135b()));
            contentValues.put("public_key", c25820a.m133136c());
            contentValues.put("hardware_secured_private_key", c25820a.m133134a());
            contentValues.put("sha256_checksum", c25820a.m133137d());
            m129040d().insertWithOnConflict("cloud_key", null, contentValues, 5);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMetadataDB", e11);
        }
    }
}
