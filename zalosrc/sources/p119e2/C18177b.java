package p119e2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import fn0.AbstractC19074t;
import java.io.File;

/* renamed from: e2.b */
/* loaded from: classes.dex */
public final class C18177b {

    /* renamed from: a */
    public static final C18177b f92337a = new C18177b();

    private C18177b() {
    }

    /* renamed from: a */
    public static final void m96914a(CancellationSignal cancellationSignal) {
        AbstractC19074t.m100208f(cancellationSignal, "cancellationSignal");
        cancellationSignal.cancel();
    }

    /* renamed from: b */
    public static final CancellationSignal m96915b() {
        return new CancellationSignal();
    }

    /* renamed from: c */
    public static final boolean m96916c(File file) {
        AbstractC19074t.m100208f(file, "file");
        return SQLiteDatabase.deleteDatabase(file);
    }

    /* renamed from: d */
    public static final boolean m96917d(SQLiteDatabase sQLiteDatabase) {
        AbstractC19074t.m100208f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    /* renamed from: e */
    public static final Cursor m96918e(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        AbstractC19074t.m100208f(sQLiteDatabase, "sQLiteDatabase");
        AbstractC19074t.m100208f(str, "sql");
        AbstractC19074t.m100208f(strArr, "selectionArgs");
        AbstractC19074t.m100208f(cancellationSignal, "cancellationSignal");
        AbstractC19074t.m100208f(cursorFactory, "cursorFactory");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        AbstractC19074t.m100207e(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    /* renamed from: f */
    public static final void m96919f(SQLiteOpenHelper sQLiteOpenHelper, boolean z11) {
        AbstractC19074t.m100208f(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z11);
    }
}
