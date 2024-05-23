package com.zing.zalo.zinstant;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import lk0.C22509g;

/* renamed from: com.zing.zalo.zinstant.i */
/* loaded from: classes.dex */
public class C17156i extends C22509g.c {
    /* renamed from: b */
    private void m91740b(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            AbstractC20110a.m104538g("deleting the database file: %s", str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e11) {
                AbstractC20110a.m104547p(e11, "delete failed", new Object[0]);
            }
        }
    }

    @Override // lk0.C22509g.c
    /* renamed from: a */
    public void mo91741a(SQLiteDatabase sQLiteDatabase, Exception exc) {
        AbstractC17153h.m91710b(exc);
    }

    @Override // android.database.DatabaseErrorHandler
    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        AbstractC20110a.m104538g("Corruption reported by sqlite on database: %s", sQLiteDatabase.getPath());
        AbstractC17153h.m91710b(new Exception("DB Corruped: " + sQLiteDatabase.getPath()));
        if (!sQLiteDatabase.isOpen()) {
            m91740b(sQLiteDatabase.getPath());
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            try {
                list = sQLiteDatabase.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                sQLiteDatabase.close();
            } catch (SQLiteException unused2) {
            }
        } finally {
            if (list != null) {
                Iterator<Pair<String, String>> it = list.iterator();
                while (it.hasNext()) {
                    m91740b((String) it.next().second);
                }
            } else {
                m91740b(sQLiteDatabase.getPath());
            }
        }
    }
}
