package am;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import com.zing.zalo.p062db.SQLiteDatabase;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: am.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC0934r0 implements DatabaseErrorHandler {
    /* renamed from: a */
    private void m4448a(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            AbstractC0900b0.m2786b("DatabaseErrorHandler", "deleting the database file: " + str);
            try {
                SQLiteDatabase.m41411f(new File(str));
            } catch (Exception e11) {
                AbstractC0900b0.m2789e("DatabaseErrorHandler", "delete failed: " + e11.getMessage());
            }
        }
    }

    @Override // android.database.DatabaseErrorHandler
    public void onCorruption(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        AbstractC0900b0.m2786b("DatabaseErrorHandler", "Corruption reported by sqlite on database: " + sQLiteDatabase.getPath());
        if (!sQLiteDatabase.isOpen()) {
            m4448a(sQLiteDatabase.getPath());
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            try {
                list = sQLiteDatabase.getAttachedDbs();
            } finally {
                if (list != null) {
                    Iterator<Pair<String, String>> it = list.iterator();
                    while (it.hasNext()) {
                        m4448a((String) it.next().second);
                    }
                } else {
                    m4448a(sQLiteDatabase.getPath());
                }
            }
        } catch (SQLiteException unused) {
        }
        try {
            sQLiteDatabase.close();
        } catch (SQLiteException unused2) {
        }
    }
}
