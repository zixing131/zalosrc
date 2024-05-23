package f90;

import android.net.Uri;
import android.provider.MediaStore;
import fn0.AbstractC19074t;
import me0.AbstractC23258x2;
import p173fz.C19172a;

/* renamed from: f90.a */
/* loaded from: classes6.dex */
public final class C18826a {

    /* renamed from: a */
    public static final C18826a f94115a = new C18826a();

    /* renamed from: b */
    public static final int f94116b;

    /* renamed from: c */
    public static final Uri f94117c;

    /* renamed from: d */
    public static final Uri f94118d;

    /* renamed from: e */
    public static final String[] f94119e;

    /* renamed from: f */
    public static final String[] f94120f;

    /* renamed from: g */
    public static final String[] f94121g;

    /* renamed from: h */
    private static String f94122h;

    /* renamed from: i */
    private static String f94123i;

    /* renamed from: j */
    public static final String f94124j;

    static {
        int m100600k = C19172a.m100600k("media_picker@video_min_duration", 1000);
        f94116b = m100600k;
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        AbstractC19074t.m100207e(uri, "EXTERNAL_CONTENT_URI");
        f94117c = uri;
        Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        AbstractC19074t.m100207e(uri2, "EXTERNAL_CONTENT_URI");
        f94118d = uri2;
        f94119e = new String[]{"_id", "_data", "_display_name", "_size", "date_modified", "date_added", "datetaken", "bucket_id", "bucket_display_name"};
        f94120f = new String[]{"_id", "_data", "_display_name", "_size", "date_modified", "date_added", "datetaken", "bucket_id", "bucket_display_name", "duration", "width", "height"};
        f94121g = new String[]{"_id", "_data", "date_added", "datetaken", "date_modified", "_display_name"};
        f94124j = "(mime_type in ('video/mp4', 'video/3gpp') OR LOWER('_display_name') LIKE '%[ ]%.mp4' OR LOWER('_display_name') LIKE '%[ ]%.3gp') AND duration >= " + m100600k + " AND _size > 0";
        m98813b();
    }

    private C18826a() {
    }

    /* renamed from: a */
    public static final String m98812a(boolean z11) {
        return z11 ? f94123i : f94122h;
    }

    /* renamed from: b */
    public static final void m98813b() {
        if (AbstractC23258x2.f112740a) {
            f94122h = "(mime_type in ('image/jpeg', 'image/jpg', 'image/png', 'image/heic', 'image/heif', 'image/webp'))";
            f94123i = "(mime_type in ('image/jpeg', 'image/jpg', 'image/png', 'image/heic', 'image/heif', 'image/webp', 'image/gif'))";
        } else {
            f94122h = "(mime_type in ('image/jpeg', 'image/jpg', 'image/png', 'image/webp'))";
            f94123i = "(mime_type in ('image/jpeg', 'image/jpg', 'image/png', 'image/webp', 'image/gif'))";
        }
    }
}
