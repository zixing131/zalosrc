package ui0;

import android.content.Context;
import fn0.AbstractC19074t;

/* renamed from: ui0.c */
/* loaded from: classes7.dex */
public final class C27276c {

    /* renamed from: a */
    public static final C27276c f128330a = new C27276c();

    private C27276c() {
    }

    /* renamed from: a */
    public static final int m139648a(Context context, float f11) {
        AbstractC19074t.m100208f(context, "context");
        return (int) ((f11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static final int m139649b(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        return m139648a(context, i11);
    }
}
