package am;

import ag0.AbstractC0852x;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.zing.zalo.SensitiveData;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;
import p248iy.AbstractC20887g;
import p716zh.C31901e8;

/* renamed from: am.o */
/* loaded from: classes.dex */
public class C0927o extends SQLiteOpenHelper {

    /* renamed from: r */
    public static final String f3427r = "o";

    /* renamed from: s */
    private static volatile C0927o f3428s;

    /* renamed from: p */
    private final Context f3429p;

    /* renamed from: q */
    private final C0918j0 f3430q;

    /* renamed from: am.o$a */
    /* loaded from: classes.dex */
    class a extends AbstractC0934r0 {
        a() {
        }

        @Override // am.AbstractC0934r0, android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
            AbstractC20887g.m109231i(CoreUtility.f89233i, 17541, "CorruptionStock phone_contacts", 0L, 17500, CoreUtility.f89236l);
            AbstractC20887g.m109237o(17541);
            super.onCorruption(sQLiteDatabase);
        }
    }

    public C0927o(Context context, DatabaseErrorHandler databaseErrorHandler) {
        super(context, "phone_contacts_v2", null, 2, databaseErrorHandler);
        this.f3429p = context;
        this.f3430q = new C0918j0();
    }

    /* renamed from: a */
    private void m4423a(C0918j0 c0918j0) {
        c0918j0.m2865f("create table if not exists phone_contacts_v1 (_id INTEGER PRIMARY KEY,name TEXT NOT NULL,number TEXT NOT NULL,number_iso TEXT NULL,zalo_uid INTEGER DEFAULT 0 ,time DATETIME DEFAULT CURRENT_TIMESTAMP, UNIQUE (name,number) ON CONFLICT REPLACE )");
        c0918j0.m2865f("create index if not exists phone_contacts_v1_index_number_iso on phone_contacts_v1 (number_iso )");
    }

    /* renamed from: b */
    private void m4424b(C0918j0 c0918j0) {
        c0918j0.m2865f("create table if not exists sms_seen (_id INTEGER PRIMARY KEY ON CONFLICT REPLACE, date INTEGER DEFAULT CURRENT_TIMESTAMP)");
    }

    /* renamed from: c */
    public static int m4425c(C0918j0 c0918j0) {
        return c0918j0.m2863d("phone_contacts_v1", "1", null);
    }

    /* renamed from: d */
    public static C0927o m4426d(Context context) {
        if (f3428s == null) {
            try {
                synchronized (C0927o.class) {
                    try {
                        if (f3428s == null) {
                            f3428s = new C0927o(context, new a());
                        }
                    } finally {
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f3427r, e11);
            }
        }
        return f3428s;
    }

    /* renamed from: h */
    public static long m4427h(C0918j0 c0918j0, long j11, String str, String str2, String str3, long j12) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        contentValues.put("number", str2);
        contentValues.put("number_iso", str3);
        if (j12 > 0) {
            contentValues.put("zalo_uid", Long.valueOf(j12));
        }
        if (j11 > 0) {
            contentValues.put("_id", Long.valueOf(j11));
        }
        contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
        return c0918j0.m2868i("phone_contacts_v1", null, contentValues);
    }

    /* renamed from: f */
    public C0918j0 m4428f() {
        return this.f3430q;
    }

    /* renamed from: i */
    public List m4429i() {
        this.f3430q.m2874o(getReadableDatabase());
        Cursor m2871l = this.f3430q.m2871l("phone_contacts_v1", null, null, null, null, null, null);
        ArrayList arrayList = new ArrayList(m2871l.getCount());
        if (m2871l.getCount() > 0) {
            m2871l.moveToFirst();
            int columnIndex = m2871l.getColumnIndex("_id");
            int columnIndex2 = m2871l.getColumnIndex("name");
            int columnIndex3 = m2871l.getColumnIndex("number");
            int columnIndex4 = m2871l.getColumnIndex("number_iso");
            int columnIndex5 = m2871l.getColumnIndex("zalo_uid");
            do {
                String string = m2871l.getString(columnIndex2);
                String string2 = m2871l.getString(columnIndex3);
                String string3 = m2871l.getString(columnIndex4);
                long j11 = m2871l.getLong(columnIndex);
                C31901e8 c31901e8 = new C31901e8(m2871l.getLong(columnIndex5), string, string2, string3);
                c31901e8.m153304x(j11);
                arrayList.add(c31901e8);
            } while (m2871l.moveToNext());
        }
        m2871l.close();
        return arrayList;
    }

    /* renamed from: o */
    public C31901e8 m4430o(String str) {
        this.f3430q.m2874o(getReadableDatabase());
        Cursor m2871l = this.f3430q.m2871l("phone_contacts_v1", null, "number_iso=?", new String[]{str}, null, null, null);
        if (m2871l.getCount() > 0) {
            m2871l.moveToFirst();
            int columnIndex = m2871l.getColumnIndex("_id");
            int columnIndex2 = m2871l.getColumnIndex("name");
            int columnIndex3 = m2871l.getColumnIndex("number");
            int columnIndex4 = m2871l.getColumnIndex("number_iso");
            int columnIndex5 = m2871l.getColumnIndex("zalo_uid");
            String string = m2871l.getString(columnIndex2);
            String string2 = m2871l.getString(columnIndex3);
            String string3 = m2871l.getString(columnIndex4);
            long j11 = m2871l.getLong(columnIndex);
            C31901e8 c31901e8 = new C31901e8(m2871l.getLong(columnIndex5), string, string2, string3);
            c31901e8.m153304x(j11);
            m2871l.close();
            return c31901e8;
        }
        m2871l.close();
        return null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f3430q.m2874o(sQLiteDatabase);
        m4423a(this.f3430q);
        m4424b(this.f3430q);
        AbstractC0852x.m2333J();
        AbstractC0852x.m2338O(new SensitiveData("phonebook_auto_scan_on_startup", "phonebook_auto_scan"));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        this.f3430q.m2874o(sQLiteDatabase);
        if (i12 > i11) {
            m4423a(this.f3430q);
            if (i11 <= 1) {
                m4424b(this.f3430q);
            }
        }
    }

    /* renamed from: q */
    public C31901e8 m4431q(String str) {
        this.f3430q.m2874o(getReadableDatabase());
        Cursor m2871l = this.f3430q.m2871l("phone_contacts_v1", null, "zalo_uid=?", new String[]{str}, null, null, null);
        if (m2871l.getCount() > 0) {
            m2871l.moveToFirst();
            int columnIndex = m2871l.getColumnIndex("_id");
            int columnIndex2 = m2871l.getColumnIndex("name");
            int columnIndex3 = m2871l.getColumnIndex("number");
            int columnIndex4 = m2871l.getColumnIndex("number_iso");
            int columnIndex5 = m2871l.getColumnIndex("zalo_uid");
            String string = m2871l.getString(columnIndex2);
            String string2 = m2871l.getString(columnIndex3);
            String string3 = m2871l.getString(columnIndex4);
            long j11 = m2871l.getLong(columnIndex);
            C31901e8 c31901e8 = new C31901e8(m2871l.getLong(columnIndex5), string, string2, string3);
            c31901e8.m153304x(j11);
            m2871l.close();
            return c31901e8;
        }
        m2871l.close();
        return null;
    }
}
