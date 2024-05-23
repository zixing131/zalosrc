package com.zing.zalo.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Process;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23193r0;
import p248iy.AbstractC20887g;
import su.C26388b;

/* loaded from: classes.dex */
public final class InternalProvider extends ContentProvider {
    public static final C9184a Companion = new C9184a(null);

    /* renamed from: p */
    private static final Uri f48789p;

    /* renamed from: q */
    private static final UriMatcher f48790q;

    /* renamed from: com.zing.zalo.provider.InternalProvider$a */
    /* loaded from: classes.dex */
    public static final class C9184a {
        private C9184a() {
        }

        public /* synthetic */ C9184a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        private final int m49013b(Context context) {
            int i11;
            long currentTimeMillis = System.currentTimeMillis();
            Cursor cursor = null;
            try {
                try {
                    Uri build = Uri.withAppendedPath(m49014a(), "main-pid").buildUpon().appendQueryParameter("caller-pid", String.valueOf(Process.myPid())).build();
                    AbstractC19074t.m100205c(build);
                    cursor = C26388b.m135984j(context, build, null, null, null, null, false);
                    if (cursor != null && cursor.getCount() > 0) {
                        cursor.moveToFirst();
                        i11 = cursor.getInt(cursor.getColumnIndex("pid"));
                    } else {
                        i11 = 0;
                    }
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    AbstractC20110a.f98889a.mo104548a("queryMainProcessID: pid(" + i11 + ") in " + (System.currentTimeMillis() - currentTimeMillis) + "ms", new Object[0]);
                    return i11;
                } catch (Exception e11) {
                    AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                    aVar.mo104552e(e11);
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    aVar.mo104548a("queryMainProcessID: pid(0) in " + (System.currentTimeMillis() - currentTimeMillis) + "ms", new Object[0]);
                    return 0;
                }
            } catch (Throwable th2) {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                AbstractC20110a.f98889a.mo104548a("queryMainProcessID: pid(0) in " + (System.currentTimeMillis() - currentTimeMillis) + "ms", new Object[0]);
                throw th2;
            }
        }

        /* renamed from: a */
        public final Uri m49014a() {
            return InternalProvider.f48789p;
        }

        /* renamed from: c */
        public final void m49015c(Context context) {
            AbstractC19074t.m100208f(context, "context");
            if (m49013b(context) != Process.myPid()) {
                AbstractC20110a.f98889a.mo104551d("multi-instance of main process!", new Object[0]);
                CoreUtility.m93148a().mo100074a(new IllegalStateException("multi-instance of main process"));
            }
        }
    }

    static {
        Uri parse = Uri.parse("content://com.zing.zalo.provider.InternalProvider");
        AbstractC19074t.m100207e(parse, "parse(...)");
        f48789p = parse;
        UriMatcher uriMatcher = new UriMatcher(-1);
        f48790q = uriMatcher;
        uriMatcher.addURI("com.zing.zalo.provider.InternalProvider", "main-pid", 1);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        AbstractC19074t.m100208f(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        AbstractC19074t.m100208f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        AbstractC19074t.m100208f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Integer num;
        String str3;
        Context context;
        AbstractC19074t.m100208f(uri, "uri");
        String str4 = null;
        if (f48790q.match(uri) != 1) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("caller-pid");
        if (queryParameter != null) {
            num = Integer.valueOf(Integer.parseInt(queryParameter));
        } else {
            num = null;
        }
        int myPid = Process.myPid();
        if (num == null || myPid != num.intValue()) {
            if (num != null) {
                int intValue = num.intValue();
                Context context2 = getContext();
                if (context2 != null) {
                    AbstractC19074t.m100205c(context2);
                    str3 = AbstractC23193r0.m119503l(context2, intValue);
                    context = getContext();
                    if (context != null) {
                        str4 = AbstractC23193r0.m119503l(context, myPid);
                    }
                    String str5 = "call from other process " + str3 + " (" + num + ") to " + str4 + " (" + myPid + ")";
                    AbstractC20110a.f98889a.mo104551d(str5, new Object[0]);
                    AbstractC20887g.m109240r(19009, str5);
                }
            }
            str3 = null;
            context = getContext();
            if (context != null) {
            }
            String str52 = "call from other process " + str3 + " (" + num + ") to " + str4 + " (" + myPid + ")";
            AbstractC20110a.f98889a.mo104551d(str52, new Object[0]);
            AbstractC20887g.m109240r(19009, str52);
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"pid"});
        matrixCursor.addRow(new Integer[]{Integer.valueOf(myPid)});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC19074t.m100208f(uri, "uri");
        return 0;
    }
}
