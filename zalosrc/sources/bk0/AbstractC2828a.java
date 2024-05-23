package bk0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: bk0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC2828a {
    /* renamed from: a */
    public static void m13673a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            if (!m13674b(sQLiteDatabase, str, str2)) {
                sQLiteDatabase.execSQL("ALTER TABLE " + str + " ADD " + str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public static boolean m13674b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor cursor = null;
        boolean z11 = false;
        try {
            try {
                try {
                    cursor = sQLiteDatabase.rawQuery(String.format("SELECT * FROM %s LIMIT 0", str), new String[0]);
                    if (cursor != null) {
                        if (cursor.getColumnIndex(str2) != -1) {
                            z11 = true;
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th2) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } catch (Exception e13) {
            e13.printStackTrace();
            if (cursor != null) {
                cursor.close();
            }
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:            if (r1 == null) goto L13;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m13675c(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z11 = true;
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT * FROM SQLITE_MASTER WHERE NAME= ? ", new String[]{str});
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
}
