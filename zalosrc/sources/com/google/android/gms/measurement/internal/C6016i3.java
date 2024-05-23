package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.i3 */
/* loaded from: classes.dex */
public final class C6016i3 extends AbstractC6148u3 {

    /* renamed from: c */
    private final C6005h3 f34080c;

    /* renamed from: d */
    private boolean f34081d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6016i3(C6127s4 c6127s4) {
        super(c6127s4);
        Context mo31032b = this.f34158a.mo31032b();
        this.f34158a.m31401z();
        this.f34080c = new C6005h3(this, mo31032b, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0132  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m30950x(int i11, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        ?? r102;
        Cursor cursor;
        mo31036g();
        ?? r22 = 0;
        if (this.f34081d) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, Integer.valueOf(i11));
        contentValues.put("entry", bArr);
        this.f34158a.m31401z();
        int i12 = 0;
        int i13 = 5;
        for (int i14 = 5; i12 < i14; i14 = 5) {
            Cursor cursor2 = null;
            cursor2 = null;
            cursor2 = null;
            r8 = null;
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = m30951n();
                try {
                    if (sQLiteDatabase == null) {
                        this.f34081d = true;
                        return r22;
                    }
                    sQLiteDatabase.beginTransaction();
                    r102 = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                    long j11 = 0;
                    if (r102 != 0) {
                        try {
                            if (r102.moveToFirst()) {
                                j11 = r102.getLong(r22);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            cursor2 = r102;
                            try {
                                SystemClock.sleep(i13);
                                i13 += 20;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                i12++;
                                r22 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e11) {
                            e = e11;
                            sQLiteDatabase2 = sQLiteDatabase;
                            cursor = r102;
                            this.f34158a.mo31033c().m31197q().m31109b("Error writing entry; local database full", e);
                            this.f34081d = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase2 == null) {
                                i12++;
                                r22 = 0;
                            }
                            sQLiteDatabase2.close();
                            i12++;
                            r22 = 0;
                        } catch (SQLiteException e12) {
                            e = e12;
                            sQLiteDatabase2 = sQLiteDatabase;
                            r102 = r102;
                            if (sQLiteDatabase2 != null) {
                                try {
                                    if (sQLiteDatabase2.inTransaction()) {
                                        sQLiteDatabase2.endTransaction();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    cursor2 = r102;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            this.f34158a.mo31033c().m31197q().m31109b("Error writing entry to local database", e);
                            this.f34081d = true;
                            if (r102 != 0) {
                                r102.close();
                            }
                            if (sQLiteDatabase2 == null) {
                                i12++;
                                r22 = 0;
                            }
                            sQLiteDatabase2.close();
                            i12++;
                            r22 = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor2 = r102;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                    if (j11 >= 100000) {
                        this.f34158a.mo31033c().m31197q().m31108a("Data loss, local db full");
                        String[] strArr = new String[1];
                        long j12 = 100001 - j11;
                        strArr[r22] = Long.toString(j12);
                        long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (delete != j12) {
                            this.f34158a.mo31033c().m31197q().m31111d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j12), Long.valueOf(delete), Long.valueOf(j12 - delete));
                        }
                    }
                    sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    if (r102 != 0) {
                        r102.close();
                    }
                    sQLiteDatabase.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e13) {
                    e = e13;
                    r102 = 0;
                } catch (SQLiteException e14) {
                    e = e14;
                    r102 = 0;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabase = null;
            } catch (SQLiteFullException e15) {
                e = e15;
                cursor = null;
            } catch (SQLiteException e16) {
                e = e16;
                r102 = 0;
            } catch (Throwable th5) {
                th = th5;
                sQLiteDatabase = null;
                if (cursor2 != null) {
                }
                if (sQLiteDatabase != null) {
                }
                throw th;
            }
        }
        this.f34158a.mo31033c().m31201u().m31108a("Failed to write entry to local database");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6148u3
    /* renamed from: m */
    protected final boolean mo30852m() {
        return false;
    }

    /* renamed from: n */
    final SQLiteDatabase m30951n() {
        if (this.f34081d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f34080c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f34081d = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0218 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0276  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m30952o(int i11) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor2;
        long j11;
        String str;
        String[] strArr;
        Parcel obtain;
        zzli zzliVar;
        zzac zzacVar;
        mo31036g();
        Cursor cursor3 = null;
        if (this.f34081d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (m30955r()) {
            int i12 = 0;
            int i13 = 5;
            for (int i14 = 5; i12 < i14; i14 = 5) {
                try {
                    SQLiteDatabase m30951n = m30951n();
                    if (m30951n == null) {
                        this.f34081d = true;
                        return null;
                    }
                    try {
                        m30951n.beginTransaction();
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteDatabase2 = m30951n;
                        }
                        try {
                            cursor2 = m30951n.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                            try {
                                long j12 = -1;
                                if (cursor2.moveToFirst()) {
                                    j11 = cursor2.getLong(0);
                                    try {
                                        cursor2.close();
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        sQLiteDatabase2 = m30951n;
                                        cursor = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        SystemClock.sleep(i13);
                                        i13 += 20;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i12++;
                                    } catch (SQLiteFullException e11) {
                                        e = e11;
                                        sQLiteDatabase2 = m30951n;
                                        cursor = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        this.f34158a.mo31033c().m31197q().m31109b("Error reading entries from local database", e);
                                        this.f34081d = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i12++;
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        sQLiteDatabase2 = m30951n;
                                        cursor = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (sQLiteDatabase != null) {
                                        }
                                        this.f34158a.mo31033c().m31197q().m31109b("Error reading entries from local database", e);
                                        this.f34081d = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i12++;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sQLiteDatabase2 = m30951n;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (cursor3 != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    cursor2.close();
                                    j11 = -1;
                                }
                                if (j11 != -1) {
                                    str = "rowid<?";
                                    strArr = new String[]{String.valueOf(j11)};
                                } else {
                                    str = null;
                                    strArr = null;
                                }
                                cursor = m30951n.query("messages", new String[]{"rowid", ZinstantMetaConstant.IMPRESSION_META_TYPE, "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                while (cursor.moveToNext()) {
                                    try {
                                        j12 = cursor.getLong(0);
                                        int i15 = cursor.getInt(1);
                                        byte[] blob = cursor.getBlob(2);
                                        if (i15 == 0) {
                                            obtain = Parcel.obtain();
                                            try {
                                                try {
                                                    obtain.unmarshall(blob, 0, blob.length);
                                                    obtain.setDataPosition(0);
                                                    zzaw createFromParcel = zzaw.CREATOR.createFromParcel(obtain);
                                                    if (createFromParcel != null) {
                                                        arrayList.add(createFromParcel);
                                                    }
                                                } catch (SafeParcelReader.ParseException unused2) {
                                                    this.f34158a.mo31033c().m31197q().m31108a("Failed to load event from local database");
                                                    obtain.recycle();
                                                }
                                            } finally {
                                            }
                                        } else if (i15 == 1) {
                                            obtain = Parcel.obtain();
                                            try {
                                                try {
                                                    obtain.unmarshall(blob, 0, blob.length);
                                                    obtain.setDataPosition(0);
                                                    zzliVar = zzli.CREATOR.createFromParcel(obtain);
                                                } catch (SafeParcelReader.ParseException unused3) {
                                                    this.f34158a.mo31033c().m31197q().m31108a("Failed to load user property from local database");
                                                    obtain.recycle();
                                                    zzliVar = null;
                                                }
                                                if (zzliVar != null) {
                                                    arrayList.add(zzliVar);
                                                }
                                            } finally {
                                            }
                                        } else if (i15 == 2) {
                                            obtain = Parcel.obtain();
                                            try {
                                                try {
                                                    obtain.unmarshall(blob, 0, blob.length);
                                                    obtain.setDataPosition(0);
                                                    zzacVar = zzac.CREATOR.createFromParcel(obtain);
                                                } catch (SafeParcelReader.ParseException unused4) {
                                                    this.f34158a.mo31033c().m31197q().m31108a("Failed to load conditional user property from local database");
                                                    obtain.recycle();
                                                    zzacVar = null;
                                                }
                                                if (zzacVar != null) {
                                                    arrayList.add(zzacVar);
                                                }
                                            } finally {
                                            }
                                        } else if (i15 == 3) {
                                            this.f34158a.mo31033c().m31202w().m31108a("Skipping app launch break");
                                        } else {
                                            this.f34158a.mo31033c().m31197q().m31108a("Unknown record type in local database");
                                        }
                                    } catch (SQLiteDatabaseLockedException unused5) {
                                        sQLiteDatabase2 = m30951n;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        SystemClock.sleep(i13);
                                        i13 += 20;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i12++;
                                    } catch (SQLiteFullException e13) {
                                        e = e13;
                                        sQLiteDatabase2 = m30951n;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        this.f34158a.mo31033c().m31197q().m31109b("Error reading entries from local database", e);
                                        this.f34081d = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i12++;
                                    } catch (SQLiteException e14) {
                                        e = e14;
                                        sQLiteDatabase2 = m30951n;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (sQLiteDatabase != null) {
                                        }
                                        this.f34158a.mo31033c().m31197q().m31109b("Error reading entries from local database", e);
                                        this.f34081d = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i12++;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        sQLiteDatabase2 = m30951n;
                                        cursor3 = cursor;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (cursor3 != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                }
                                sQLiteDatabase2 = m30951n;
                                try {
                                    if (sQLiteDatabase2.delete("messages", "rowid <= ?", new String[]{Long.toString(j12)}) < arrayList.size()) {
                                        this.f34158a.mo31033c().m31197q().m31108a("Fewer entries removed from local database than expected");
                                    }
                                    sQLiteDatabase2.setTransactionSuccessful();
                                    sQLiteDatabase2.endTransaction();
                                    cursor.close();
                                    sQLiteDatabase2.close();
                                    return arrayList;
                                } catch (SQLiteDatabaseLockedException unused6) {
                                    sQLiteDatabase = sQLiteDatabase2;
                                    SystemClock.sleep(i13);
                                    i13 += 20;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i12++;
                                    }
                                    sQLiteDatabase.close();
                                    i12++;
                                } catch (SQLiteFullException e15) {
                                    e = e15;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    this.f34158a.mo31033c().m31197q().m31109b("Error reading entries from local database", e);
                                    this.f34081d = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i12++;
                                    }
                                    sQLiteDatabase.close();
                                    i12++;
                                } catch (SQLiteException e16) {
                                    e = e16;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (sQLiteDatabase != null) {
                                        try {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            cursor3 = cursor;
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    this.f34158a.mo31033c().m31197q().m31109b("Error reading entries from local database", e);
                                    this.f34081d = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i12++;
                                    }
                                    sQLiteDatabase.close();
                                    i12++;
                                } catch (Throwable th6) {
                                    th = th6;
                                    cursor3 = cursor;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (cursor3 != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                sQLiteDatabase2 = m30951n;
                                if (cursor2 != null) {
                                }
                                throw th;
                                break;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteDatabase2 = m30951n;
                            cursor2 = null;
                            if (cursor2 != null) {
                                try {
                                    cursor2.close();
                                } catch (SQLiteDatabaseLockedException unused7) {
                                    cursor = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    SystemClock.sleep(i13);
                                    i13 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i12++;
                                } catch (SQLiteFullException e17) {
                                    e = e17;
                                    cursor = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    this.f34158a.mo31033c().m31197q().m31109b("Error reading entries from local database", e);
                                    this.f34081d = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i12++;
                                } catch (SQLiteException e18) {
                                    e = e18;
                                    cursor = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (sQLiteDatabase != null) {
                                    }
                                    this.f34158a.mo31033c().m31197q().m31109b("Error reading entries from local database", e);
                                    this.f34081d = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i12++;
                                } catch (Throwable th9) {
                                    th = th9;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (cursor3 != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            throw th;
                            break;
                            break;
                        }
                    } catch (SQLiteDatabaseLockedException unused8) {
                        sQLiteDatabase2 = m30951n;
                    } catch (SQLiteFullException e19) {
                        e = e19;
                        sQLiteDatabase2 = m30951n;
                    } catch (SQLiteException e21) {
                        e = e21;
                        sQLiteDatabase2 = m30951n;
                    } catch (Throwable th10) {
                        th = th10;
                        sQLiteDatabase2 = m30951n;
                    }
                } catch (SQLiteDatabaseLockedException unused9) {
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (SQLiteFullException e22) {
                    e = e22;
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (SQLiteException e23) {
                    e = e23;
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (Throwable th11) {
                    th = th11;
                    sQLiteDatabase = null;
                }
            }
            this.f34158a.mo31033c().m31202w().m31108a("Failed to read events from database in reasonable time");
            return null;
        }
        return arrayList;
    }

    /* renamed from: p */
    public final void m30953p() {
        int delete;
        mo31036g();
        try {
            SQLiteDatabase m30951n = m30951n();
            if (m30951n != null && (delete = m30951n.delete("messages", null, null)) > 0) {
                this.f34158a.mo31033c().m31201u().m31109b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e11) {
            this.f34158a.mo31033c().m31197q().m31109b("Error resetting local analytics data. error", e11);
        }
    }

    /* renamed from: q */
    public final boolean m30954q() {
        return m30950x(3, new byte[0]);
    }

    /* renamed from: r */
    final boolean m30955r() {
        Context mo31032b = this.f34158a.mo31032b();
        this.f34158a.m31401z();
        return mo31032b.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* renamed from: s */
    public final boolean m30956s() {
        mo31036g();
        if (!this.f34081d && m30955r()) {
            int i11 = 5;
            for (int i12 = 0; i12 < 5; i12++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase m30951n = m30951n();
                            if (m30951n == null) {
                                this.f34081d = true;
                                return false;
                            }
                            m30951n.beginTransaction();
                            m30951n.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            m30951n.setTransactionSuccessful();
                            m30951n.endTransaction();
                            m30951n.close();
                            return true;
                        } catch (SQLiteFullException e11) {
                            this.f34158a.mo31033c().m31197q().m31109b("Error deleting app launch break from local database", e11);
                            this.f34081d = true;
                            if (0 == 0) {
                            }
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i11);
                        i11 += 20;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e12) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                    this.f34158a.mo31033c().m31197q().m31109b("Error deleting app launch break from local database", e12);
                    this.f34081d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.f34158a.mo31033c().m31202w().m31108a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* renamed from: t */
    public final boolean m30957t(zzac zzacVar) {
        byte[] m31340e0 = this.f34158a.m31381N().m31340e0(zzacVar);
        if (m31340e0.length > 131072) {
            this.f34158a.mo31033c().m31199s().m31108a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return m30950x(2, m31340e0);
    }

    /* renamed from: u */
    public final boolean m30958u(zzaw zzawVar) {
        Parcel obtain = Parcel.obtain();
        C6133t.m31450a(zzawVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f34158a.mo31033c().m31199s().m31108a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return m30950x(0, marshall);
    }

    /* renamed from: w */
    public final boolean m30959w(zzli zzliVar) {
        Parcel obtain = Parcel.obtain();
        C6088o9.m31271a(zzliVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f34158a.mo31033c().m31199s().m31108a("User property too long for local database. Sending directly to service");
            return false;
        }
        return m30950x(1, marshall);
    }
}
