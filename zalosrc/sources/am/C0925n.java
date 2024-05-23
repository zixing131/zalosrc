package am;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import mm0.AbstractC23350e;

/* renamed from: am.n */
/* loaded from: classes3.dex */
public class C0925n extends SQLiteOpenHelper {

    /* renamed from: p */
    public static final String f3421p = "n";

    /* renamed from: q */
    private static volatile C0925n f3422q;

    /* renamed from: am.n$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public long f3423a;

        /* renamed from: b */
        public long f3424b;

        /* renamed from: c */
        public long f3425c;

        /* renamed from: d */
        public String f3426d;
    }

    public C0925n(Context context) {
        super(context, "normality_v1", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    private void m4418a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists firebase_ack_monitor (send_time INTEGER DEFAULT 0,received_time INTEGER DEFAULT 0,data TEXT )");
    }

    /* renamed from: d */
    public static C0925n m4419d(Context context) {
        if (f3422q == null) {
            try {
                synchronized (C0925n.class) {
                    try {
                        if (f3422q == null) {
                            f3422q = new C0925n(context.getApplicationContext());
                        }
                        f3422q.m4418a(f3422q.getWritableDatabase());
                    } finally {
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f3421p, e11);
            }
        }
        return f3422q;
    }

    /* renamed from: b */
    public boolean m4420b(long j11) {
        try {
            if (getWritableDatabase().delete("firebase_ack_monitor", "rowid=?", new String[]{String.valueOf(j11)}) <= 0) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f3421p, e11);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a m4421c() {
        Cursor cursor;
        Throwable th2;
        try {
            cursor = getReadableDatabase().rawQuery(String.format("select rowid, * from %s limit 1", "firebase_ack_monitor"), null);
        } catch (Exception e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th3) {
            cursor = null;
            th2 = th3;
            if (cursor != null) {
            }
            throw th2;
        }
        try {
            try {
                if (cursor.getCount() != 0 && cursor.moveToFirst()) {
                    a aVar = new a();
                    aVar.f3423a = cursor.getLong(cursor.getColumnIndex("rowid"));
                    aVar.f3424b = cursor.getLong(cursor.getColumnIndex("send_time"));
                    aVar.f3425c = cursor.getLong(cursor.getColumnIndex("received_time"));
                    aVar.f3426d = cursor.getString(cursor.getColumnIndex("data"));
                    cursor.close();
                    return aVar;
                }
                cursor.close();
                return null;
            } catch (Throwable th4) {
                th2 = th4;
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        } catch (Exception e12) {
            e = e12;
            AbstractC23350e.m122776f(f3421p, e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
    }

    /* renamed from: f */
    public long m4422f(long j11, long j12, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("send_time", Long.valueOf(j11));
        contentValues.put("received_time", Long.valueOf(j12));
        contentValues.put("data", str);
        return getWritableDatabase().insert("firebase_ack_monitor", null, contentValues);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m4418a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        if (i12 > i11) {
            m4418a(sQLiteDatabase);
        }
    }
}
