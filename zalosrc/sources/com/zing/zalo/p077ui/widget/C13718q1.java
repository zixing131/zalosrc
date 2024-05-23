package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import fn0.AbstractC19074t;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.zing.zalo.ui.widget.q1 */
/* loaded from: classes.dex */
public final class C13718q1 {

    /* renamed from: a */
    public static final C13718q1 f71012a = new C13718q1();

    /* renamed from: b */
    private static final Map f71013b = new ConcurrentHashMap();

    private C13718q1() {
    }

    /* renamed from: a */
    private final Typeface m76692a(Context context, int i11) {
        switch (i11) {
            case 0:
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Regular.ttf");
            case 1:
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Thin.ttf");
            case 2:
            case 4:
            case 8:
            default:
                return null;
            case 3:
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Light.ttf");
            case 5:
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Regular.ttf");
            case 6:
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Italic.ttf");
            case 7:
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
            case 9:
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Bold.ttf");
            case 10:
                return Typeface.createFromAsset(context.getAssets(), "fonts/RobotoMono-Regular.ttf");
            case 11:
                return Typeface.createFromAsset(context.getAssets(), "fonts/RobotoMono-Medium.ttf");
        }
    }

    /* renamed from: b */
    public static final Typeface m76693b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        return m76694c(context, 7);
    }

    /* renamed from: c */
    public static final Typeface m76694c(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        Map map = f71013b;
        Typeface typeface = (Typeface) map.get(Integer.valueOf(i11));
        if (typeface == null && (typeface = f71012a.m76692a(context, i11)) != null) {
            map.put(Integer.valueOf(i11), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static final Typeface m76695d(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        return m76694c(context, i11);
    }
}
