package q20;

import android.content.Context;
import android.graphics.Typeface;
import fn0.AbstractC19074t;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: q20.y */
/* loaded from: classes5.dex */
public final class C25102y {

    /* renamed from: a */
    public static final C25102y f120581a = new C25102y();

    /* renamed from: b */
    private static final Map f120582b = new ConcurrentHashMap();

    private C25102y() {
    }

    /* renamed from: a */
    private final Typeface m130177a(Context context, int i11) {
        if (i11 != 0) {
            return null;
        }
        try {
            return Typeface.createFromAsset(context.getAssets(), "fonts/LuckiestGuy-Regular.ttf");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final Typeface m130178b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        return m130179c(context, 0);
    }

    /* renamed from: c */
    public final Typeface m130179c(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        Map map = f120582b;
        Typeface typeface = (Typeface) map.get(Integer.valueOf(i11));
        if (typeface == null && (typeface = m130177a(context, i11)) != null) {
            map.put(Integer.valueOf(i11), typeface);
        }
        return typeface;
    }
}
