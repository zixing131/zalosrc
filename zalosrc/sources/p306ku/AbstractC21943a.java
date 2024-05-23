package p306ku;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import me0.AbstractC23277z1;
import p111du.AbstractC18070b;
import p620wt.AbstractC29238m;
import su.C26388b;

/* renamed from: ku.a */
/* loaded from: classes4.dex */
public abstract class AbstractC21943a {

    /* renamed from: a */
    private static final AbstractC18070b f108044a = new a(2);

    /* renamed from: ku.a$a */
    /* loaded from: classes4.dex */
    class a extends AbstractC18070b {
        a(int i11) {
            super(i11);
        }

        @Override // p111du.AbstractC18070b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat mo15431d() {
            return new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US);
        }
    }

    /* renamed from: a */
    public static File m114577a() {
        File file = new File(AbstractC20130d.m104905y());
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return m114580d(file.getPath());
    }

    /* renamed from: b */
    public static File m114578b() {
        File file = new File(AbstractC20130d.m104878k0("Zalo"));
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return m114580d(file.getPath());
    }

    /* renamed from: c */
    public static File m114579c() {
        return m114580d(new File(AbstractC20130d.m104872g0()).getPath());
    }

    /* renamed from: d */
    private static File m114580d(String str) {
        AbstractC18070b abstractC18070b = f108044a;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) abstractC18070b.mo7484b();
        try {
            File file = new File(str + File.separator + "IMG_UPLOAD_" + simpleDateFormat.format(new Date()) + ".jpg");
            abstractC18070b.mo7483a(simpleDateFormat);
            return file;
        } catch (Throwable th2) {
            f108044a.mo7483a(simpleDateFormat);
            throw th2;
        }
    }

    /* renamed from: e */
    public static File m114581e() {
        return m114580d(new File(AbstractC20130d.m104848O0()).getPath());
    }

    /* renamed from: f */
    public static String m114582f(ContentResolver contentResolver, File file, String str, boolean z11, double d11, double d12) {
        try {
            String substring = TextUtils.substring(str, 0, str.length() - 3);
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", substring);
            contentValues.put("_display_name", str);
            contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("mime_type", "image/jpeg");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                contentValues.put("relative_path", AbstractC20130d.f99270a);
            } else {
                contentValues.put("_data", file.getPath());
                contentValues.put("longitude", Double.valueOf(d11));
                contentValues.put("latitude", Double.valueOf(d12));
            }
            if (z11) {
                int m120058b = AbstractC23277z1.m120058b(file.getPath());
                contentValues.put("orientation", Integer.valueOf(m120058b));
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getPath(), options);
                int i12 = options.outWidth;
                int i13 = options.outHeight;
                if (m120058b == 90 || m120058b == 270) {
                    i12 = i13;
                    i13 = i12;
                }
                contentValues.put("width", Integer.valueOf(i12));
                contentValues.put("height", Integer.valueOf(i13));
            }
            Uri m135978d = C26388b.m135978d(contentResolver, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues, true);
            contentValues.clear();
            contentValues.put("_size", Long.valueOf(file.length()));
            contentResolver.update(m135978d, contentValues, null, null);
            if (i11 >= 29) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    OutputStream openOutputStream = contentResolver.openOutputStream(m135978d);
                    if (openOutputStream != null) {
                        AbstractC29238m.m145998b(fileInputStream, openOutputStream);
                    }
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            return m135978d.toString();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }
}
