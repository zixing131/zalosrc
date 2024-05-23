package ui0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.AbstractC1388a;
import androidx.core.graphics.drawable.AbstractC1414a;
import bi0.AbstractC2816j;
import fn0.AbstractC19074t;
import p193h0.AbstractC19694b;

/* renamed from: ui0.g */
/* loaded from: classes.dex */
public final class C27280g {

    /* renamed from: a */
    public static final C27280g f128349a = new C27280g();

    private C27280g() {
    }

    /* renamed from: a */
    public static final Drawable m139658a(Context context, int i11) {
        Drawable mutate;
        Drawable.ConstantState constantState;
        AbstractC19074t.m100208f(context, "context");
        Drawable m103336d = AbstractC19694b.m103336d(context, i11);
        if (m103336d != null && (mutate = m103336d.mutate()) != null && (constantState = mutate.getConstantState()) != null) {
            return constantState.newDrawable();
        }
        return null;
    }

    /* renamed from: b */
    public static final Drawable m139659b(Context context, int i11, int i12) {
        AbstractC19074t.m100208f(context, "context");
        Drawable m139658a = m139658a(context, i11);
        if (m139658a != null) {
            AbstractC1414a.m7196n(m139658a, AbstractC1388a.m6961c(context, i12));
        }
        return m139658a;
    }

    /* renamed from: c */
    public static final Drawable m139660c(Context context, int i11, int i12) {
        AbstractC19074t.m100208f(context, "context");
        Drawable m139658a = m139658a(context, i11);
        if (m139658a != null) {
            AbstractC1414a.m7196n(m139658a, AbstractC2816j.Companion.m13592a(context, i12));
        }
        return m139658a;
    }
}
