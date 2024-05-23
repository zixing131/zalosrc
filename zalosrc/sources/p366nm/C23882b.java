package p366nm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh0.AbstractC21254a;

/* renamed from: nm.b */
/* loaded from: classes.dex */
public class C23882b {

    /* renamed from: a */
    private SQLiteDatabase f115459a;

    /* renamed from: b */
    private C23883c f115460b;

    public C23882b(Context context) {
        this.f115460b = new C23883c(context);
    }

    /* renamed from: b */
    private boolean m124944b(C23881a c23881a) {
        try {
            m124951h();
            ContentValues contentValues = new ContentValues();
            contentValues.put("time", Long.valueOf(c23881a.m124943c()));
            contentValues.put("action", c23881a.m124941a());
            contentValues.put("data", c23881a.m124942b().toString());
            if (this.f115459a.insert("events", null, contentValues) == -1) {
                return false;
            }
            m124948e();
            return true;
        } catch (Exception e11) {
            if (e11.getMessage() == null) {
                e11.printStackTrace();
            } else {
                AbstractC21254a.m110063e(getClass().getSimpleName(), e11.getMessage());
            }
            return false;
        } finally {
            m124948e();
        }
    }

    /* renamed from: a */
    public void m124945a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m124944b((C23881a) it.next());
        }
    }

    /* renamed from: c */
    public void m124946c() {
        try {
            try {
                m124951h();
                this.f115459a.delete("events", null, null);
            } catch (Exception e11) {
                if (e11.getMessage() == null) {
                    e11.printStackTrace();
                } else {
                    AbstractC21254a.m110063e(getClass().getSimpleName(), e11.getMessage());
                }
            }
        } finally {
            m124948e();
        }
    }

    /* renamed from: d */
    public void m124947d() {
        System.currentTimeMillis();
        try {
            try {
                m124951h();
                this.f115459a.delete("events", "time<?", new String[]{String.valueOf(System.currentTimeMillis() - 2880000)});
            } catch (Exception e11) {
                if (e11.getMessage() == null) {
                    e11.printStackTrace();
                } else {
                    AbstractC21254a.m110063e(getClass().getSimpleName(), e11.getMessage());
                }
            }
        } finally {
            m124948e();
        }
    }

    /* renamed from: e */
    public void m124948e() {
        this.f115460b.close();
    }

    /* renamed from: f */
    public void m124949f(long j11) {
        try {
            try {
                m124951h();
                this.f115459a.delete("events", "time=?", new String[]{"" + j11});
            } catch (Exception e11) {
                if (e11.getMessage() == null) {
                    e11.printStackTrace();
                } else {
                    AbstractC21254a.m110063e(getClass().getSimpleName(), e11.getMessage());
                }
            }
        } finally {
            m124948e();
        }
    }

    /* renamed from: g */
    public List m124950g() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            m124951h();
            cursor = this.f115459a.query("events", null, null, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    arrayList.add(new C23881a(cursor));
                    cursor.moveToNext();
                }
            }
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            m124948e();
            return arrayList;
        } catch (Exception unused) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            m124948e();
            return arrayList;
        } catch (Throwable th2) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            m124948e();
            throw th2;
        }
    }

    /* renamed from: h */
    public void m124951h() {
        this.f115459a = this.f115460b.getWritableDatabase();
    }

    /* renamed from: i */
    public void m124952i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m124949f(((C23881a) it.next()).m124943c());
        }
    }
}
