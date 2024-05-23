package am;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import me0.AbstractC23149n0;
import rh0.AbstractC25803k;

/* renamed from: am.j0 */
/* loaded from: classes.dex */
public class C0918j0 {

    /* renamed from: a */
    private final String f3414a = C0918j0.class.getSimpleName();

    /* renamed from: b */
    private SQLiteDatabase f3415b;

    public C0918j0() {
    }

    /* renamed from: a */
    public void m2860a() {
        this.f3415b.beginTransaction();
    }

    /* renamed from: b */
    public void m2861b() {
        this.f3415b.close();
    }

    /* renamed from: c */
    public SQLiteStatement m2862c(String str) {
        return this.f3415b.compileStatement(str);
    }

    /* renamed from: d */
    public int m2863d(String str, String str2, String[] strArr) {
        StringBuilder m118858f;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if ("prefs_v2".equals(str)) {
            m118858f = AbstractC23149n0.m118859g(stackTrace, true);
        } else {
            m118858f = AbstractC23149n0.m118858f(stackTrace, true, false);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int delete = this.f3415b.delete(str, str2, strArr);
        AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        return delete;
    }

    /* renamed from: e */
    public void m2864e() {
        this.f3415b.endTransaction();
    }

    /* renamed from: f */
    public void m2865f(String str) {
        StringBuilder m118858f = AbstractC23149n0.m118858f(Thread.currentThread().getStackTrace(), true, false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f3415b.execSQL(str);
        if (AbstractC23149n0.m118865m(str)) {
            AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        }
    }

    /* renamed from: g */
    public void m2866g(String str, Object[] objArr) {
        StringBuilder m118858f = AbstractC23149n0.m118858f(Thread.currentThread().getStackTrace(), true, false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f3415b.execSQL(str, objArr);
        if (AbstractC23149n0.m118865m(str)) {
            AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        }
    }

    /* renamed from: h */
    public SQLiteDatabase m2867h() {
        return this.f3415b;
    }

    /* renamed from: i */
    public long m2868i(String str, String str2, ContentValues contentValues) {
        StringBuilder m118858f;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if ("prefs_v2".equals(str)) {
            m118858f = AbstractC23149n0.m118859g(stackTrace, true);
        } else {
            m118858f = AbstractC23149n0.m118858f(stackTrace, true, false);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long insert = this.f3415b.insert(str, str2, contentValues);
        AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        return insert;
    }

    /* renamed from: j */
    public long m2869j(String str, String str2, ContentValues contentValues, int i11) {
        StringBuilder m118858f;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if ("prefs_v2".equals(str)) {
            m118858f = AbstractC23149n0.m118859g(stackTrace, true);
        } else {
            m118858f = AbstractC23149n0.m118858f(stackTrace, true, false);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long insertWithOnConflict = this.f3415b.insertWithOnConflict(str, str2, contentValues, i11);
        AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        return insertWithOnConflict;
    }

    /* renamed from: k */
    public boolean m2870k() {
        return this.f3415b.isOpen();
    }

    /* renamed from: l */
    public Cursor m2871l(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        StringBuilder m118858f = AbstractC23149n0.m118858f(Thread.currentThread().getStackTrace(), true, false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Cursor query = this.f3415b.query(false, str, strArr, str2, strArr2, str3, str4, str5, null);
        AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        return query;
    }

    /* renamed from: m */
    public Cursor m2872m(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        StringBuilder m118858f = AbstractC23149n0.m118858f(Thread.currentThread().getStackTrace(), true, false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Cursor query = this.f3415b.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        return query;
    }

    /* renamed from: n */
    public Cursor m2873n(String str, String[] strArr) {
        StringBuilder m118858f = AbstractC23149n0.m118858f(Thread.currentThread().getStackTrace(), true, false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Cursor rawQuery = this.f3415b.rawQuery(str, strArr);
        if (AbstractC23149n0.m118864l(str)) {
            AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        return rawQuery;
    }

    /* renamed from: o */
    public void m2874o(SQLiteDatabase sQLiteDatabase) {
        this.f3415b = sQLiteDatabase;
    }

    /* renamed from: p */
    public void m2875p() {
        this.f3415b.setTransactionSuccessful();
    }

    /* renamed from: q */
    public int m2876q(String str, ContentValues contentValues, String str2, String[] strArr) {
        StringBuilder m118858f;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if ("prefs_v2".equals(str)) {
            m118858f = AbstractC23149n0.m118859g(stackTrace, true);
        } else {
            m118858f = AbstractC23149n0.m118858f(stackTrace, true, false);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int update = this.f3415b.update(str, contentValues, str2, strArr);
        AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        return update;
    }

    public C0918j0(Context context, AbstractC0934r0 abstractC0934r0) {
        this.f3415b = context.openOrCreateDatabase("zalo", 0, null, abstractC0934r0);
    }
}
