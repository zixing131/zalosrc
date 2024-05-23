package p324lh;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p267jh.AbstractC21252a;

/* renamed from: lh.a */
/* loaded from: classes3.dex */
public abstract class AbstractC22485a {

    /* renamed from: a */
    private static final Map f109990a;

    /* renamed from: b */
    private static final Map f109991b;

    static {
        HashMap hashMap = new HashMap(7);
        hashMap.put("image/heif", "heif");
        hashMap.put("image/heic", "heic");
        hashMap.put("image/jpg", "jpeg");
        hashMap.put("image/x-dwg", "dwg");
        hashMap.put("image/x-dxf", "dxf");
        hashMap.put("drawing/x-dwf", "dwf");
        hashMap.put("image/jxl", "jxl");
        f109990a = Collections.unmodifiableMap(hashMap);
        f109991b = AbstractC21252a.m110058of("heif", "image/heif", "heic", "image/heic", "dwg", "image/x-dwg", "dxf", "image/x-dxf", "dwf", "drawing/x-dwf", "jxl", "image/jxl");
    }

    /* renamed from: a */
    public static String m116268a(String str) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (TextUtils.isEmpty(extensionFromMimeType)) {
            return (String) f109990a.get(str);
        }
        return extensionFromMimeType;
    }

    /* renamed from: b */
    public static String m116269b(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            return (String) f109991b.get(str);
        }
        return mimeTypeFromExtension;
    }
}
