package p239ih;

import android.content.ContentResolver;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.IOException;
import java.util.Locale;
import me0.AbstractC23041d2;
import me0.AbstractC23254w8;
import me0.AbstractC23258x2;
import on0.AbstractC24341v;
import p620wt.AbstractC29237l;

/* renamed from: ih.a */
/* loaded from: classes3.dex */
public final class C20551a {

    /* renamed from: a */
    public static final C20551a f100921a = new C20551a();

    /* renamed from: b */
    public static final String[] f100922b = {"jpg", "jpeg", "png", "mp3", "amr", "3gp", "mp4", "webp", "heic", "heif", "gif", "m4a", "aac", "jxl"};

    /* renamed from: c */
    private static final String[] f100923c = {"heic", "heif"};

    private C20551a() {
    }

    /* renamed from: a */
    public static final boolean m106806a(String str) {
        String m118216o = AbstractC23041d2.m118216o(str);
        AbstractC19074t.m100207e(m118216o, "getExtension(filePath)");
        return m106808c(m118216o);
    }

    /* renamed from: b */
    public static final boolean m106807b(String str) {
        String m118217p = AbstractC23041d2.m118217p(str);
        AbstractC19074t.m100207e(m118217p, "getExtensionFromFileName(fileName)");
        return m106808c(m118217p);
    }

    /* renamed from: c */
    public static final boolean m106808c(String str) {
        boolean m127120J;
        boolean m127120J2;
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        if (str.length() <= 0) {
            return false;
        }
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        AbstractC19074t.m100207e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!AbstractC23258x2.f112740a) {
            for (String str2 : f100923c) {
                m127120J2 = AbstractC24341v.m127120J(lowerCase, str2, false, 2, null);
                if (m127120J2) {
                    return false;
                }
            }
        }
        for (String str3 : f100922b) {
            m127120J = AbstractC24341v.m127120J(lowerCase, str3, false, 2, null);
            if (m127120J) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final void m106809d(MediaMetadataRetriever mediaMetadataRetriever, String str) {
        AbstractC19074t.m100208f(mediaMetadataRetriever, "mmr");
        AbstractC19074t.m100208f(str, "inputPath");
        if (AbstractC23254w8.m119859g(str)) {
            ParcelFileDescriptor parcelFileDescriptor = null;
            try {
                try {
                    ContentResolver contentResolver = CoreUtility.getAppContext().getContentResolver();
                    Uri parse = Uri.parse(str);
                    AbstractC19074t.m100207e(parse, "Uri.parse(this)");
                    parcelFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                    if (parcelFileDescriptor != null) {
                        mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
                        parcelFileDescriptor.close();
                    }
                } catch (IOException e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
                return;
            } finally {
                AbstractC29237l.m145996a(parcelFileDescriptor);
            }
        }
        mediaMetadataRetriever.setDataSource(str);
    }
}
