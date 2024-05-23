package lk0;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import bk0.AbstractC2828a;
import com.zing.zalo.zinstant.AbstractC17158i1;
import ik0.EnumC20598u;
import java.io.File;
import p665y0.C30243e;
import pj0.C24777c;

/* renamed from: lk0.g */
/* loaded from: classes.dex */
public class C22509g {

    /* renamed from: a */
    private final C30243e f110159a;

    /* renamed from: b */
    private final b f110160b;

    /* renamed from: lk0.g$a */
    /* loaded from: classes.dex */
    class a extends C30243e {
        a(int i11) {
            super(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lk0.g$b */
    /* loaded from: classes.dex */
    public static class b extends SQLiteOpenHelper implements C24777c.b {

        /* renamed from: p */
        private volatile boolean f110162p;

        /* renamed from: q */
        private c f110163q;

        /* renamed from: r */
        private SQLiteDatabase f110164r;

        /* renamed from: s */
        private final Object f110165s;

        b(Context context, DatabaseErrorHandler databaseErrorHandler) {
            super(context, "zinstant_v3", null, 10, databaseErrorHandler);
            this.f110165s = new Object();
            if (databaseErrorHandler instanceof c) {
                this.f110163q = (c) databaseErrorHandler;
            }
            C24777c.m128780t().m128783h(this, false);
        }

        @Override // pj0.C24777c.b
        /* renamed from: a */
        public void mo116384a(int i11) {
            SQLiteDatabase sQLiteDatabase = this.f110164r;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                if (i11 != 4 && i11 != 5) {
                    return;
                } else {
                    m116387d();
                }
            }
            synchronized (this.f110165s) {
                try {
                    if (i11 != 4 && i11 != 5) {
                        if (i11 == 1) {
                            this.f110164r.execSQL("DELETE FROM zinstant_data WHERE key NOT IN (SELECT key FROM zinstant_data ORDER BY time DESC LIMIT 100)");
                        }
                    } else {
                        this.f110164r.execSQL(String.format("DELETE FROM %s", "zinstant_data"));
                    }
                    if (this.f110162p) {
                        this.f110162p = false;
                        this.f110164r.close();
                        this.f110164r = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: b */
        boolean m116385b() {
            SQLiteDatabase sQLiteDatabase = this.f110164r;
            if (sQLiteDatabase != null && !sQLiteDatabase.isOpen()) {
                synchronized (this.f110165s) {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = this.f110164r;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.close();
                            this.f110164r = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void m116386c() {
            if (this.f110164r != null) {
                this.f110162p = true;
                C24777c.m128780t().m128784i();
            }
        }

        /* renamed from: d */
        public SQLiteDatabase m116387d() {
            if (this.f110164r == null || m116385b() || this.f110162p) {
                synchronized (this.f110165s) {
                    try {
                        this.f110162p = false;
                        if (this.f110164r == null) {
                            this.f110164r = getWritableDatabase();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f110164r;
        }

        /* renamed from: f */
        void m116388f() {
            synchronized (this.f110165s) {
                SQLiteDatabase sQLiteDatabase = this.f110164r;
                String str = null;
                if (sQLiteDatabase != null) {
                    String path = sQLiteDatabase.getPath();
                    this.f110164r.close();
                    this.f110164r = null;
                    str = path;
                }
                try {
                    if (str != null) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                    } else {
                        AbstractC17158i1.m91742a().deleteDatabase("zinstant_v3");
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* renamed from: h */
        void m116389h(Exception exc) {
            c cVar = this.f110163q;
            if (cVar != null) {
                cVar.mo91741a(this.f110164r, exc);
            }
        }

        /* renamed from: i */
        void m116390i(SQLiteDatabase sQLiteDatabase) {
            AbstractC2828a.m13673a(sQLiteDatabase, "zinstant_data", "skeleton_raw_checksum");
            AbstractC2828a.m13673a(sQLiteDatabase, "zinstant_data", "skeleton_url");
        }

        /* renamed from: o */
        void m116391o(SQLiteDatabase sQLiteDatabase) {
            AbstractC2828a.m13673a(sQLiteDatabase, "zinstant_data", "bundle_data");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            AbstractC17158i1.m91742a().deleteDatabase("discovery_zinstant.db");
            AbstractC17158i1.m91742a().deleteDatabase("zinstant");
            AbstractC17158i1.m91742a().deleteDatabase("zinstant_api");
            AbstractC17158i1.m91742a().deleteDatabase("zinstant_v2");
            sQLiteDatabase.execSQL("CREATE TABLE `zinstant_data` ( `key` TEXT PRIMARY KEY, `zinstant_data_id` TEXT NOT NULL, `data_raw_checksum` TEXT NOT NULL, `resource_url` TEXT, `feature_type` INTEGER, `config_expiration_time` INTEGER, `config_pull_time` INTEGER, `time` INTEGER, `skeleton_raw_checksum` TEXT, `skeleton_url` TEXT, `bundle_data` TEXT )");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
            if (i11 != 0) {
                if (i11 != 3) {
                    if (i11 != 7 && i11 != 8) {
                        if (i11 != 9) {
                            return;
                        }
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS zinstant_zones");
                        return;
                    }
                } else {
                    m116390i(sQLiteDatabase);
                }
                m116391o(sQLiteDatabase);
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS zinstant_zones");
                return;
            }
            onCreate(sQLiteDatabase);
        }
    }

    /* renamed from: lk0.g$c */
    /* loaded from: classes.dex */
    public static abstract class c implements DatabaseErrorHandler {
        /* renamed from: a */
        public abstract void mo91741a(SQLiteDatabase sQLiteDatabase, Exception exc);
    }

    /* renamed from: lk0.g$d */
    /* loaded from: classes.dex */
    private static class d {

        /* renamed from: a */
        private static final C22509g f110166a = new C22509g(null);
    }

    /* synthetic */ C22509g(a aVar) {
        this();
    }

    /* renamed from: a */
    private void m116375a(Exception exc) {
        if (this.f110160b.m116385b()) {
            return;
        }
        if (AbstractC2828a.m13675c(this.f110160b.m116387d(), "zinstant_zones") && AbstractC2828a.m13675c(this.f110160b.m116387d(), "zinstant_data")) {
            this.f110160b.m116389h(exc);
        } else {
            this.f110160b.m116388f();
        }
    }

    /* renamed from: c */
    private void m116376c(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("zinstant_data", String.format("%s=?", "key"), new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:            if (r6 == null) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:            if (r6 != null) goto L14;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:            r6.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:            return r0;     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C22504b m116377e(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor;
        Cursor cursor2 = null;
        r0 = null;
        r0 = null;
        r0 = null;
        C22504b c22504b = null;
        try {
            cursor = sQLiteDatabase.rawQuery(String.format("SELECT * FROM %s WHERE %s=?", "zinstant_data", "key"), new String[]{str});
            if (cursor != null) {
                try {
                    try {
                        if (cursor.moveToFirst()) {
                            c22504b = new C22504b(cursor);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                }
            }
        } catch (Exception e12) {
            e = e12;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* renamed from: g */
    public static C22509g m116378g() {
        return d.f110166a;
    }

    /* renamed from: i */
    public static String m116379i(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        if (strArr != null && strArr.length > 0) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                sb2.append(" %s=? ");
                if (i11 < strArr.length - 1) {
                    sb2.append("AND");
                }
            }
        }
        return String.format(sb2.toString(), strArr);
    }

    /* renamed from: b */
    public void m116380b() {
        this.f110159a.m149138c();
        this.f110160b.m116386c();
    }

    /* renamed from: d */
    public void m116381d(String str) {
        try {
            this.f110159a.m149141f(str);
            m116376c(this.f110160b.m116387d(), str);
        } catch (Exception e11) {
            m116375a(e11);
        }
    }

    /* renamed from: f */
    public C22504b m116382f(String str) {
        C22504b c22504b = (C22504b) this.f110159a.m149139d(str);
        if (c22504b == null) {
            return m116377e(this.f110160b.m116387d(), str);
        }
        return c22504b;
    }

    /* renamed from: h */
    public void m116383h(C22504b c22504b, EnumC20598u enumC20598u) {
        try {
            this.f110159a.m149140e(c22504b.f110127a, c22504b);
            c22504b.m116355f(this.f110160b.m116387d(), enumC20598u);
        } catch (Exception e11) {
            m116375a(e11);
        }
    }

    private C22509g() {
        this.f110160b = new b(AbstractC17158i1.m91742a(), AbstractC17158i1.f87692b);
        this.f110159a = new a(10);
    }
}
