package me0;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import ho0.AbstractC20110a;
import java.io.File;

/* renamed from: me0.w8 */
/* loaded from: classes.dex */
public abstract class AbstractC23254w8 {
    /* renamed from: a */
    public static Uri m119853a(String str) {
        String substring = str.substring(str.lastIndexOf("/") + 1);
        if (str.contains("/external/image")) {
            return Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, substring);
        }
        if (str.contains("/internal/image")) {
            return Uri.withAppendedPath(MediaStore.Images.Media.INTERNAL_CONTENT_URI, substring);
        }
        if (str.contains("/external/video")) {
            return Uri.withAppendedPath(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, substring);
        }
        if (str.contains("/internal/video")) {
            return Uri.withAppendedPath(MediaStore.Video.Media.INTERNAL_CONTENT_URI, substring);
        }
        if (str.contains("/external/audio")) {
            return Uri.withAppendedPath(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, substring);
        }
        if (str.contains("/internal/audio")) {
            return Uri.withAppendedPath(MediaStore.Audio.Media.INTERNAL_CONTENT_URI, substring);
        }
        return Uri.parse(str);
    }

    /* renamed from: b */
    public static Uri m119854b(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public static String m119855c(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (m119857e(uri)) {
                if (Build.VERSION.SDK_INT < 29) {
                    String[] split = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(split[0])) {
                        return AbstractC23204s0.m119554e() + "/" + split[1];
                    }
                } else {
                    return uri.toString();
                }
            } else {
                if (m119856d(uri)) {
                    return uri.toString();
                }
                if (m119858f(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = split2[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return Uri.withAppendedPath(uri2, split2[1]).toString();
                }
                return uri.toString();
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return uri.toString();
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m119856d(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: e */
    public static boolean m119857e(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* renamed from: f */
    public static boolean m119858f(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* renamed from: g */
    public static boolean m119859g(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("content://")) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static long m119860h(String str) {
        Uri m119853a;
        if (m119859g(str) && (m119853a = m119853a(str)) != null) {
            try {
                return ContentUris.parseId(m119853a);
            } catch (NumberFormatException | UnsupportedOperationException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return -1L;
    }
}
