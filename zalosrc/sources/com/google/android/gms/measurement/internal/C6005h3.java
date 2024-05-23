package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h3 */
/* loaded from: classes.dex */
public final class C6005h3 extends SQLiteOpenHelper {

    /* renamed from: p */
    final /* synthetic */ C6016i3 f34054p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6005h3(C6016i3 c6016i3, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f34054p = c6016i3;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e11) {
            throw e11;
        } catch (SQLiteException unused) {
            this.f34054p.f34158a.mo31033c().m31197q().m31108a("Opening the local database failed, dropping and recreating it");
            this.f34054p.f34158a.m31401z();
            if (!this.f34054p.f34158a.mo31032b().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f34054p.f34158a.mo31033c().m31197q().m31109b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e12) {
                this.f34054p.f34158a.mo31033c().m31197q().m31109b("Failed to open local database. Events will bypass local storage", e12);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC6045l.m31030b(this.f34054p.f34158a.mo31033c(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        AbstractC6045l.m31029a(this.f34054p.f34158a.mo31033c(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }
}
