package su;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import pm0.C24848g0;

/* renamed from: su.b */
/* loaded from: classes.dex */
public final class C26388b {

    /* renamed from: a */
    public static final C26388b f125374a = new C26388b();

    private C26388b() {
    }

    /* renamed from: a */
    public static final int m135975a(ContentResolver contentResolver, Uri uri, String str, String[] strArr, boolean z11) {
        AbstractC19074t.m100208f(contentResolver, "resolver");
        AbstractC19074t.m100208f(uri, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        if (f125374a.m135980f(uri) && !z11) {
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            new Exception("Access sensitive data from content resolver without define sourceId").printStackTrace();
            aVar.mo104551d(String.valueOf(C24848g0.f119245a), new Object[0]);
        }
        return contentResolver.delete(uri, str, strArr);
    }

    /* renamed from: b */
    public static final int m135976b(Context context, Uri uri, String str, String[] strArr, boolean z11) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(uri, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        if (f125374a.m135980f(uri) && !z11) {
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            new Exception("Access sensitive data from content resolver without define sourceId").printStackTrace();
            aVar.mo104551d(String.valueOf(C24848g0.f119245a), new Object[0]);
        }
        return m135977c(context).delete(uri, str, strArr);
    }

    /* renamed from: c */
    public static final ContentResolver m135977c(Context context) {
        AbstractC19074t.m100208f(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        AbstractC19074t.m100207e(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    /* renamed from: d */
    public static final Uri m135978d(ContentResolver contentResolver, Uri uri, ContentValues contentValues, boolean z11) {
        AbstractC19074t.m100208f(contentResolver, "resolver");
        AbstractC19074t.m100208f(uri, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        if (f125374a.m135980f(uri) && !z11) {
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            new Exception("Access sensitive data from content resolver without define sourceId").printStackTrace();
            aVar.mo104551d(String.valueOf(C24848g0.f119245a), new Object[0]);
        }
        return contentResolver.insert(uri, contentValues);
    }

    /* renamed from: e */
    public static final Uri m135979e(Context context, Uri uri, ContentValues contentValues, boolean z11) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(uri, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        if (f125374a.m135980f(uri) && !z11) {
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            new Exception("Access sensitive data from content resolver without define sourceId").printStackTrace();
            aVar.mo104551d(String.valueOf(C24848g0.f119245a), new Object[0]);
        }
        return m135977c(context).insert(uri, contentValues);
    }

    /* renamed from: f */
    private final boolean m135980f(Uri uri) {
        if (!AbstractC19074t.m100204b(uri, ContactsContract.CommonDataKinds.Phone.CONTENT_URI) && !AbstractC19074t.m100204b(uri, ContactsContract.Data.CONTENT_URI) && !AbstractC19074t.m100204b(uri, ContactsContract.RawContacts.CONTENT_URI) && !AbstractC19074t.m100204b(uri, MediaStore.Images.Media.EXTERNAL_CONTENT_URI) && !AbstractC19074t.m100204b(uri, MediaStore.Video.Media.EXTERNAL_CONTENT_URI) && !AbstractC19074t.m100204b(uri, CallLog.Calls.CONTENT_URI)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static final Cursor m135981g(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, boolean z11) {
        AbstractC19074t.m100208f(contentResolver, "resolver");
        AbstractC19074t.m100208f(uri, "uri");
        if (f125374a.m135980f(uri) && !z11) {
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            new Exception("Access sensitive data from content resolver without define sourceId").printStackTrace();
            aVar.mo104551d(String.valueOf(C24848g0.f119245a), new Object[0]);
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2, null);
    }

    /* renamed from: h */
    public static final Cursor m135982h(Context context, Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal, boolean z11) {
        Cursor query;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(uri, "uri");
        if (f125374a.m135980f(uri) && !z11) {
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            new Exception("Access sensitive data from content resolver without define sourceId").printStackTrace();
            aVar.mo104551d(String.valueOf(C24848g0.f119245a), new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            query = m135977c(context).query(uri, strArr, bundle, cancellationSignal);
            return query;
        }
        return null;
    }

    /* renamed from: i */
    public static final Cursor m135983i(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal, boolean z11) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(uri, "uri");
        if (f125374a.m135980f(uri) && !z11) {
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            new Exception("Access sensitive data from content resolver without define sourceId").printStackTrace();
            aVar.mo104551d(String.valueOf(C24848g0.f119245a), new Object[0]);
        }
        return m135977c(context).query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }

    /* renamed from: j */
    public static final Cursor m135984j(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2, boolean z11) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(uri, "uri");
        if (f125374a.m135980f(uri) && !z11) {
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            new Exception("Access sensitive data from content resolver without define sourceId").printStackTrace();
            aVar.mo104551d(String.valueOf(C24848g0.f119245a), new Object[0]);
        }
        return m135983i(context, uri, strArr, str, strArr2, str2, null, z11);
    }
}
