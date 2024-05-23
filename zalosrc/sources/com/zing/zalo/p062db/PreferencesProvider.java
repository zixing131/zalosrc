package com.zing.zalo.p062db;

import am.C0918j0;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import mm0.AbstractC23350e;
import p135em.C18487a;
import p248iy.AbstractC20887g;

/* loaded from: classes.dex */
public class PreferencesProvider extends ContentProvider {

    /* renamed from: q */
    public static final Uri f43162q;

    /* renamed from: r */
    public static final Uri f43163r;

    /* renamed from: s */
    private static final UriMatcher f43164s;

    /* renamed from: t */
    public static boolean f43165t;

    /* renamed from: p */
    private SQLiteOpenHelper f43166p;

    /* renamed from: com.zing.zalo.db.PreferencesProvider$a */
    /* loaded from: classes3.dex */
    private static final class C7952a {
        /* renamed from: a */
        public static String m41401a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return str2;
            }
            if (TextUtils.isEmpty(str2)) {
                return str;
            }
            return "(" + str + ") AND (" + str2 + ")";
        }
    }

    static {
        Uri parse = Uri.parse("content://com.zing.zalo.db.preferencesprovider");
        f43162q = parse;
        f43163r = Uri.withAppendedPath(parse, "key");
        UriMatcher uriMatcher = new UriMatcher(-1);
        f43164s = uriMatcher;
        f43165t = false;
        uriMatcher.addURI("com.zing.zalo.db.preferencesprovider", null, 0);
        uriMatcher.addURI("com.zing.zalo.db.preferencesprovider", "key/*", 1);
    }

    /* renamed from: b */
    private void m41399b(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    /* renamed from: a */
    void m41400a(Uri uri, ContentValues contentValues) {
        C0918j0 c0918j0 = null;
        try {
            try {
                C0918j0 c0918j02 = new C0918j0();
                try {
                    c0918j02.m2874o(this.f43166p.getWritableDatabase());
                    if (f43164s.match(uri) != 0) {
                        AbstractC20110a.m104538g("Invalid insert request: %s", uri);
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    contentValues.put("last_update", Long.valueOf(currentTimeMillis));
                    contentValues.put("last_used", Long.valueOf(currentTimeMillis));
                    if (c0918j02.m2868i("prefs_v2", null, contentValues) > 0) {
                        m41399b(uri);
                    }
                } catch (SQLException e11) {
                    e = e11;
                    c0918j0 = c0918j02;
                    AbstractC23350e.m122774d("PreferencesProvider", e.getMessage());
                    ToastUtils.m89266n(AbstractC8020f0.database_error_diskio, new Object[0]);
                    AbstractC20887g.m109237o(17601);
                    AbstractC20887g.m109231i(CoreUtility.f89233i, 17601, e.toString(), 0L, 17600, CoreUtility.f89236l);
                    C7962g c7962g = new C7962g(MainApplication.getAppContext(), true);
                    this.f43166p = c7962g;
                    c0918j0.m2874o(c7962g.getWritableDatabase());
                    f43165t = true;
                }
            } catch (RuntimeException e12) {
                AbstractC23350e.m122774d("PreferencesProvider", e12.getMessage());
            }
        } catch (SQLException e13) {
            e = e13;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int match = f43164s.match(uri);
        C0918j0 c0918j0 = new C0918j0();
        try {
            c0918j0.m2874o(this.f43166p.getWritableDatabase());
        } catch (SQLException e11) {
            AbstractC23350e.m122774d("PreferencesProvider", e11.getMessage());
            ToastUtils.m89266n(AbstractC8020f0.database_error_diskio, new Object[0]);
            AbstractC20887g.m109237o(17601);
            AbstractC20887g.m109231i(CoreUtility.f89233i, 17601, e11.toString(), 0L, 17600, CoreUtility.f89236l);
            C7962g c7962g = new C7962g(MainApplication.getAppContext(), true);
            this.f43166p = c7962g;
            c0918j0.m2874o(c7962g.getWritableDatabase());
            f43165t = true;
        }
        if (match != 0) {
            AbstractC20110a.m104538g("Invalid delete request: %s", uri);
            return 0;
        }
        return c0918j0.m2863d("prefs_v2", str, strArr);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        if (contentValues == null) {
            contentValues = new ContentValues(1);
        }
        m41400a(uri, contentValues);
        return Uri.withAppendedPath(f43162q, "key/" + contentValues.getAsString("key"));
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f43166p = C7962g.m42665c(getContext());
        f43165t = false;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteDatabase readableDatabase;
        C18487a c18487a = new C18487a();
        int match = f43164s.match(uri);
        if (match != 0) {
            if (match != 1) {
                AbstractC20110a.m104538g("Invalid query request: %s", uri);
                return null;
            }
            c18487a.setTables("prefs_v2");
            c18487a.appendWhere("key='" + uri.getPathSegments().get(1) + "'");
        } else {
            c18487a.setTables("prefs_v2");
        }
        try {
            readableDatabase = this.f43166p.getReadableDatabase();
        } catch (SQLException e11) {
            AbstractC23350e.m122774d("PreferencesProvider", e11.getMessage());
            ToastUtils.m89266n(AbstractC8020f0.database_error_diskio, new Object[0]);
            AbstractC20887g.m109237o(17601);
            AbstractC20887g.m109231i(CoreUtility.f89233i, 17601, e11.toString(), 0L, 17600, CoreUtility.f89236l);
            C7962g c7962g = new C7962g(MainApplication.getAppContext(), true);
            this.f43166p = c7962g;
            readableDatabase = c7962g.getReadableDatabase();
            f43165t = true;
        }
        Cursor query = c18487a.query(readableDatabase, strArr, str, strArr2, null, null, str2);
        query.setNotificationUri(getContext().getContentResolver(), uri);
        return query;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C0918j0 c0918j0 = new C0918j0();
        try {
            c0918j0.m2874o(this.f43166p.getWritableDatabase());
        } catch (SQLException e11) {
            AbstractC23350e.m122774d("PreferencesProvider", e11.getMessage());
            ToastUtils.m89266n(AbstractC8020f0.database_error_diskio, new Object[0]);
            AbstractC20887g.m109237o(17601);
            AbstractC20887g.m109231i(CoreUtility.f89233i, 17601, e11.toString(), 0L, 17600, CoreUtility.f89236l);
            C7962g c7962g = new C7962g(MainApplication.getAppContext(), true);
            this.f43166p = c7962g;
            c0918j0.m2874o(c7962g.getWritableDatabase());
            f43165t = true;
        }
        if (f43164s.match(uri) != 1) {
            AbstractC20110a.m104538g("Invalid update request: %s", uri);
            return 0;
        }
        String m41401a = C7952a.m41401a(str, "key='" + uri.getPathSegments().get(1) + "'");
        contentValues.put("last_update", Long.valueOf(System.currentTimeMillis() / 1000));
        int m2876q = c0918j0.m2876q("prefs_v2", contentValues, m41401a, strArr);
        if (m2876q > 0) {
            m41399b(uri);
        }
        return m2876q;
    }
}
