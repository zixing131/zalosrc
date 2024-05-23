package p573vb;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import p604wb.C28905e;
import p639xb.C29568a;
import p639xb.C29571d;

/* renamed from: vb.a */
/* loaded from: classes.dex */
public class C27958a extends SQLiteOpenHelper {

    /* renamed from: q */
    private static volatile C27958a f130353q;

    /* renamed from: p */
    private SQLiteDatabase f130354p;

    private C27958a(Context context) {
        super(context, "zalo_ads_tracking.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f130354p = context.openOrCreateDatabase("zalo_ads_tracking.db", 0, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:            if (r1 == null) goto L33;     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m140904A(String str) {
        boolean z11 = true;
        Cursor cursor = null;
        try {
            try {
                cursor = this.f130354p.rawQuery("SELECT * FROM SQLITE_MASTER WHERE NAME= ? ", new String[]{str});
                if (cursor.getCount() == 0) {
                    z11 = false;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            cursor.close();
            return z11;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* renamed from: F */
    private void m140905F(int i11) {
        if (i11 <= 1) {
            if (m140904A("advertising_log")) {
                m140910E();
            }
            if (m140904A("install_item")) {
                m140911G();
            }
        }
    }

    /* renamed from: a */
    private void m140906a() {
        if (!m140904A("advertising_log_ver_1")) {
            this.f130354p.execSQL("CREATE TABLE advertising_log_ver_1 (client_id, campaign_id, action_type, content_type, content_id, source, create_time, extra_param1, extra_param2, extra_param3)");
        }
    }

    /* renamed from: b */
    private void m140907b() {
        if (!m140904A("db_version")) {
            this.f130354p.execSQL("create table db_version (version)");
            this.f130354p.execSQL("insert into db_version values (?)", new String[]{"1"});
        }
    }

    /* renamed from: c */
    private void m140908c() {
        if (!m140904A("install_item_ver_1")) {
            this.f130354p.execSQL("CREATE TABLE install_item_ver_1 (client_id, campaign_id, action_type, content_type, content_id, source, create_time, data, extra_param1, extra_param2, extra_param3)");
        }
    }

    /* renamed from: q */
    public static C27958a m140909q(Context context) {
        int i11;
        if (f130353q == null) {
            try {
                synchronized (C27958a.class) {
                    try {
                        if (f130353q == null) {
                            f130353q = new C27958a(context);
                        }
                    } finally {
                    }
                }
                f130353q.m140907b();
                f130353q.m140906a();
                f130353q.m140908c();
                Cursor rawQuery = f130353q.f130354p.rawQuery("select version from db_version", null);
                if (rawQuery.moveToFirst()) {
                    i11 = rawQuery.getInt(rawQuery.getColumnIndex("version"));
                } else {
                    i11 = 0;
                }
                rawQuery.close();
                f130353q.m140905F(i11);
                if (1 > i11) {
                    f130353q.f130354p.execSQL("update db_version set version = 1 where 1");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return f130353q;
    }

    /* renamed from: E */
    public void m140910E() {
        Cursor cursor = null;
        try {
            try {
                try {
                    this.f130354p.beginTransaction();
                    cursor = this.f130354p.rawQuery("select * from advertising_log", new String[0]);
                    if (cursor != null && cursor.getCount() > 0) {
                        cursor.moveToFirst();
                        do {
                            try {
                                C29568a c29568a = new C29568a(cursor.getString(cursor.getColumnIndex("client_id")), cursor.getString(cursor.getColumnIndex("campaign_id")), cursor.getInt(cursor.getColumnIndex("action_type")), cursor.getInt(cursor.getColumnIndex("content_type")), cursor.getString(cursor.getColumnIndex("content_id")), cursor.getInt(cursor.getColumnIndex("source")), cursor.getLong(cursor.getColumnIndex("create_time")), "");
                                this.f130354p.execSQL("INSERT INTO advertising_log_ver_1 (client_id, campaign_id, action_type, content_type, content_id, source, create_time, extra_param1, extra_param2, extra_param3) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? , ?)", new String[]{c29568a.m146946c(), c29568a.m146945b(), c29568a.m146944a() + "", c29568a.m146948e() + "", c29568a.m146947d(), c29568a.m146951h() + "", c29568a.m146949f() + "", "", "", ""});
                            } catch (Exception e11) {
                                AbstractC20110a.m104539h(e11);
                            }
                        } while (cursor.moveToNext());
                    }
                    this.f130354p.execSQL("delete from advertising_log");
                    this.f130354p.execSQL("drop table if exists advertising_log");
                    this.f130354p.setTransactionSuccessful();
                    this.f130354p.endTransaction();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th2) {
                    try {
                        this.f130354p.endTransaction();
                        if (cursor != null) {
                            cursor.close();
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    throw th2;
                }
            } catch (Exception e13) {
                AbstractC20110a.m104539h(e13);
                this.f130354p.endTransaction();
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Exception e14) {
            e14.printStackTrace();
        }
    }

    /* renamed from: G */
    public void m140911G() {
        Cursor cursor = null;
        try {
            try {
                try {
                    this.f130354p.beginTransaction();
                    cursor = this.f130354p.rawQuery("select * from install_item", new String[0]);
                    if (cursor != null && cursor.getCount() > 0) {
                        cursor.moveToFirst();
                        do {
                            try {
                                C29571d c29571d = new C29571d(cursor.getString(cursor.getColumnIndex("client_id")), cursor.getString(cursor.getColumnIndex("campaign_id")), cursor.getInt(cursor.getColumnIndex("action_type")), cursor.getInt(cursor.getColumnIndex("content_type")), cursor.getString(cursor.getColumnIndex("content_id")), cursor.getInt(cursor.getColumnIndex("source")), cursor.getLong(cursor.getColumnIndex("create_time")), cursor.getString(cursor.getColumnIndex("data")), "");
                                this.f130354p.execSQL("INSERT INTO install_item_ver_1 (client_id, campaign_id, action_type, content_type, content_id, source, create_time, data, extra_param1, extra_param2, extra_param3) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new String[]{c29571d.m146946c(), c29571d.m146945b(), c29571d.m146944a() + "", c29571d.m146948e() + "", c29571d.m146947d(), c29571d.m146951h() + "", c29571d.m146949f() + "", c29571d.m146956j(), "", "", ""});
                            } catch (Exception e11) {
                                AbstractC20110a.m104539h(e11);
                            }
                        } while (cursor.moveToNext());
                    }
                    this.f130354p.execSQL("delete from install_item");
                    this.f130354p.execSQL("drop table if exists install_item");
                    this.f130354p.setTransactionSuccessful();
                    this.f130354p.endTransaction();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                    this.f130354p.endTransaction();
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            } finally {
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f130354p) {
            try {
                SQLiteDatabase sQLiteDatabase = this.f130354p;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.close();
    }

    /* renamed from: d */
    public void m140912d(String str) {
        try {
            this.f130354p.execSQL("DELETE FROM advertising_log_ver_1 WHERE client_id IN(" + str + ")", new String[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m140913f() {
        try {
            this.f130354p.execSQL("DELETE FROM advertising_log_ver_1");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public void m140914h() {
        try {
            this.f130354p.execSQL("DELETE FROM install_item_ver_1");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public void m140915i(String str) {
        try {
            this.f130354p.delete("install_item_ver_1", "data = ?", new String[]{str});
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o */
    public void m140916o(String str) {
        try {
            this.f130354p.execSQL("DELETE FROM install_item_ver_1 WHERE data IN(" + str + ")", new String[0]);
        } catch (SQLException e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:            if (r3 == null) goto L39;     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList m140917r() {
        ArrayList arrayList = new ArrayList();
        long m144393m = C28905e.m144373n().m144393m() - C28905e.f133807g;
        Cursor cursor = null;
        try {
            try {
                cursor = this.f130354p.rawQuery("SELECT client_id, campaign_id, action_type, content_type, content_id, source, create_time, extra_param1 FROM advertising_log_ver_1 WHERE create_time > ?", new String[]{m144393m + ""});
                while (cursor.moveToNext()) {
                    arrayList.add(new C29568a(cursor.getString(cursor.getColumnIndex("client_id")), cursor.getString(cursor.getColumnIndex("campaign_id")), cursor.getInt(cursor.getColumnIndex("action_type")), cursor.getInt(cursor.getColumnIndex("content_type")), cursor.getString(cursor.getColumnIndex("content_id")), cursor.getInt(cursor.getColumnIndex("source")), cursor.getLong(cursor.getColumnIndex("create_time")), cursor.getString(cursor.getColumnIndex("extra_param1"))));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:            if (r1 == null) goto L39;     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList m140918s() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = this.f130354p.rawQuery("SELECT client_id, campaign_id, action_type, content_type, content_id, source, create_time, extra_param1 FROM advertising_log_ver_1 LIMIT ?", new String[]{"50"});
                while (cursor.moveToNext()) {
                    arrayList.add(new C29568a(cursor.getString(cursor.getColumnIndex("client_id")), cursor.getString(cursor.getColumnIndex("campaign_id")), cursor.getInt(cursor.getColumnIndex("action_type")), cursor.getInt(cursor.getColumnIndex("content_type")), cursor.getString(cursor.getColumnIndex("content_id")), cursor.getInt(cursor.getColumnIndex("source")), cursor.getLong(cursor.getColumnIndex("create_time")), cursor.getString(cursor.getColumnIndex("extra_param1"))));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:            if (r1 == null) goto L40;     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList m140919t() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = this.f130354p.rawQuery("SELECT client_id, campaign_id, action_type, content_type, content_id, source, create_time, data, extra_param1 FROM install_item_ver_1", new String[0]);
                while (cursor.moveToNext()) {
                    arrayList.add(new C29571d(cursor.getString(cursor.getColumnIndex("client_id")), cursor.getString(cursor.getColumnIndex("campaign_id")), cursor.getInt(cursor.getColumnIndex("action_type")), cursor.getInt(cursor.getColumnIndex("content_type")), cursor.getString(cursor.getColumnIndex("content_id")), cursor.getInt(cursor.getColumnIndex("source")), cursor.getLong(cursor.getColumnIndex("create_time")), cursor.getString(cursor.getColumnIndex("data")), cursor.getString(cursor.getColumnIndex("extra_param1"))));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* renamed from: v */
    public void m140920v(C29568a c29568a) {
        try {
            this.f130354p.execSQL("INSERT INTO advertising_log_ver_1 (client_id, campaign_id, action_type, content_type, content_id, source, create_time, extra_param1, extra_param2, extra_param3) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new String[]{c29568a.m146946c(), c29568a.m146945b(), c29568a.m146944a() + "", c29568a.m146948e() + "", c29568a.m146947d(), c29568a.m146951h() + "", c29568a.m146949f() + "", c29568a.m146950g(), "", ""});
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y */
    public void m140921y(C29571d c29571d) {
        try {
            m140915i(c29571d.m146956j());
            this.f130354p.execSQL("INSERT INTO install_item_ver_1 (client_id, campaign_id, action_type, content_type, content_id, source, create_time, data, extra_param1, extra_param2, extra_param3) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new String[]{c29571d.m146946c(), c29571d.m146945b(), c29571d.m146944a() + "", c29571d.m146948e() + "", c29571d.m146947d(), c29571d.m146951h() + "", c29571d.m146949f() + "", c29571d.m146956j(), c29571d.m146950g(), "", ""});
        } catch (SQLException e11) {
            e11.printStackTrace();
        }
    }
}
