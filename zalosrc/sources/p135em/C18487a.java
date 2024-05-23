package p135em;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.SystemClock;
import me0.AbstractC23149n0;
import rh0.AbstractC25803k;

/* renamed from: em.a */
/* loaded from: classes.dex */
public class C18487a extends SQLiteQueryBuilder {
    @Override // android.database.sqlite.SQLiteQueryBuilder
    public Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4) {
        StringBuilder m118859g = AbstractC23149n0.m118859g(Thread.currentThread().getStackTrace(), true);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Cursor query = super.query(sQLiteDatabase, strArr, str, strArr2, str2, str3, str4);
        AbstractC25803k.m132972l(m118859g.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        return query;
    }
}
