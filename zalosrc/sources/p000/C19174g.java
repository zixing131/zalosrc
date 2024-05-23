package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import fn0.AbstractC19074t;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pm0.C24848g0;

/* renamed from: g */
/* loaded from: classes2.dex */
public final class C19174g {

    /* renamed from: a */
    public static final C19174g f95302a = new C19174g();

    /* renamed from: b */
    public static final String f95303b;

    /* renamed from: c */
    public static ThreadPoolExecutor f95304c;

    static {
        C24592p0 c24592p0 = C24592p0.f118350o;
        f95303b = "content://com.zing.mp3.provider.media/current_media_track";
    }

    /* renamed from: a */
    public static void m100625a(final Context context, final String str, final int i11) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "event");
        try {
            ThreadPoolExecutor threadPoolExecutor = f95304c;
            if (threadPoolExecutor == null) {
                threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
                f95304c = threadPoolExecutor;
            }
            threadPoolExecutor.execute(new Runnable() { // from class: e
                @Override // java.lang.Runnable
                public final void run() {
                    C19174g.m100626b(context, str, i11);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public static final void m100626b(Context context, String str, int i11) {
        AbstractC19074t.m100208f(context, "$context");
        AbstractC19074t.m100208f(str, "$event");
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Uri parse = Uri.parse(f95303b);
            ContentValues contentValues = new ContentValues();
            contentValues.put("eventId", str);
            contentValues.put("playerStatus", Integer.valueOf(i11));
            contentValues.put("appName", AbstractC17681d.f89680a);
            C24848g0 c24848g0 = C24848g0.f119245a;
            contentResolver.insert(parse, contentValues);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
