package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class x12 {
    /* renamed from: a */
    public static int m27800a(SQLiteDatabase sQLiteDatabase, int i11) {
        int i12 = 0;
        if (i11 == 2) {
            return 0;
        }
        Cursor m27807h = m27807h(sQLiteDatabase, i11);
        if (m27807h.getCount() > 0) {
            m27807h.moveToNext();
            i12 = m27807h.getInt(m27807h.getColumnIndexOrThrow("value"));
        }
        m27807h.close();
        return i12;
    }

    /* renamed from: b */
    public static long m27801b(SQLiteDatabase sQLiteDatabase, int i11) {
        long j11;
        Cursor m27807h = m27807h(sQLiteDatabase, 2);
        if (m27807h.getCount() > 0) {
            m27807h.moveToNext();
            j11 = m27807h.getLong(m27807h.getColumnIndexOrThrow("value"));
        } else {
            j11 = 0;
        }
        m27807h.close();
        return j11;
    }

    /* renamed from: c */
    public static ArrayList m27802c(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(C5256zu.m28622P(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzgrq e11) {
                yk0.zzg("Unable to deserialize proto from offline signals database:");
                yk0.zzg(e11.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    /* renamed from: d */
    public static void m27803d(SQLiteDatabase sQLiteDatabase, long j11, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j11));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j11)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    /* renamed from: e */
    public static void m27804e(SQLiteDatabase sQLiteDatabase) {
        m27808i(sQLiteDatabase, "failed_requests", 0);
        m27808i(sQLiteDatabase, "total_requests", 0);
        m27808i(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    /* renamed from: f */
    public static void m27805f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        m27809j(sQLiteDatabase, "failed_requests", 0);
        m27809j(sQLiteDatabase, "total_requests", 0);
        m27809j(sQLiteDatabase, "completed_requests", 0);
    }

    /* renamed from: g */
    public static void m27806g(SQLiteDatabase sQLiteDatabase, boolean z11, boolean z12) {
        if (!z12) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
        if (!z11) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
        }
    }

    /* renamed from: h */
    private static Cursor m27807h(SQLiteDatabase sQLiteDatabase, int i11) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    strArr2[0] = "completed_requests";
                } else {
                    strArr2[0] = "last_successful_request_time";
                }
            } else {
                strArr2[0] = "total_requests";
            }
        } else {
            strArr2[0] = "failed_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    /* renamed from: i */
    private static void m27808i(SQLiteDatabase sQLiteDatabase, String str, int i11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    /* renamed from: j */
    private static void m27809j(SQLiteDatabase sQLiteDatabase, String str, int i11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }
}
