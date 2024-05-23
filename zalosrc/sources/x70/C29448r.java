package x70;

import android.graphics.Bitmap;
import android.util.LruCache;
import fn0.AbstractC19074t;

/* renamed from: x70.r */
/* loaded from: classes6.dex */
public final class C29448r {

    /* renamed from: a */
    public static final C29448r f136087a = new C29448r();

    /* renamed from: b */
    private static final LruCache f136088b = new LruCache(30);

    private C29448r() {
    }

    /* renamed from: a */
    public final void m146702a() {
        f136088b.evictAll();
    }

    /* renamed from: b */
    public final Bitmap m146703b(String str) {
        AbstractC19074t.m100208f(str, "key");
        return (Bitmap) f136088b.get(str);
    }

    /* renamed from: c */
    public final void m146704c(String str, Bitmap bitmap) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(bitmap, "bitmap");
        if (m146703b(str) == null) {
            f136088b.put(str, bitmap);
        }
    }
}
