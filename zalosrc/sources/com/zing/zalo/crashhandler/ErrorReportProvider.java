package com.zing.zalo.crashhandler;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.zing.zalo.AbstractC8020f0;
import ki.EnumC21730b;

/* loaded from: classes.dex */
public class ErrorReportProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C7919a c7919a = new C7919a(Thread.getDefaultUncaughtExceptionHandler());
        c7919a.m40933j(EnumC21730b.f105516q);
        c7919a.m40934k(AbstractC8020f0.error_general);
        Thread.setDefaultUncaughtExceptionHandler(c7919a);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
