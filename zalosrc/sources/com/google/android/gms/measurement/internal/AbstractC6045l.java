package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: com.google.android.gms.measurement.internal.l */
/* loaded from: classes.dex */
public abstract class AbstractC6045l {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:            if (r3 == false) goto L20;     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m31029a(C6082o3 c6082o3, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        SQLiteException e11;
        Cursor cursor;
        if (c6082o3 != null) {
            Cursor cursor2 = null;
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            } catch (SQLiteException e12) {
                e11 = e12;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                }
                throw th;
            }
            try {
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                } catch (Throwable th3) {
                    th = th3;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e13) {
                e11 = e13;
                c6082o3.m31202w().m31110c("Error querying for table", str, e11);
                if (cursor != null) {
                    cursor.close();
                }
                sQLiteDatabase.execSQL(str2);
                try {
                    HashSet hashSet = new HashSet();
                    Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                    try {
                        Collections.addAll(hashSet, rawQuery.getColumnNames());
                        rawQuery.close();
                        for (String str4 : str3.split(",")) {
                            if (!hashSet.remove(str4)) {
                                throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                            }
                        }
                        if (strArr != null) {
                            for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                                if (!hashSet.remove(strArr[i11])) {
                                    sQLiteDatabase.execSQL(strArr[i11 + 1]);
                                }
                            }
                        }
                        if (!hashSet.isEmpty()) {
                            c6082o3.m31202w().m31110c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                        }
                    } catch (Throwable th4) {
                        rawQuery.close();
                        throw th4;
                    }
                } catch (SQLiteException e14) {
                    c6082o3.m31197q().m31109b("Failed to verify columns on table that was just created", str);
                    throw e14;
                }
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m31030b(C6082o3 c6082o3, SQLiteDatabase sQLiteDatabase) {
        if (c6082o3 != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                c6082o3.m31202w().m31108a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                c6082o3.m31202w().m31108a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                c6082o3.m31202w().m31108a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                c6082o3.m31202w().m31108a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
