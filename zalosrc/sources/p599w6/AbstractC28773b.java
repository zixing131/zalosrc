package p599w6;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: w6.b */
/* loaded from: classes3.dex */
public abstract class AbstractC28773b {
    /* renamed from: a */
    public static TypedValue m143969a(Context context, int i11) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i11, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m143970b(Context context, int i11, boolean z11) {
        TypedValue m143969a = m143969a(context, i11);
        if (m143969a != null && m143969a.type == 18) {
            if (m143969a.data != 0) {
                return true;
            }
            return false;
        }
        return z11;
    }

    /* renamed from: c */
    public static int m143971c(Context context, int i11, String str) {
        TypedValue m143969a = m143969a(context, i11);
        if (m143969a != null) {
            return m143969a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i11)));
    }

    /* renamed from: d */
    public static int m143972d(View view, int i11) {
        return m143971c(view.getContext(), i11, view.getClass().getCanonicalName());
    }
}
