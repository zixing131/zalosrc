package p439q6;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.AbstractC1409d;
import p599w6.AbstractC28773b;

/* renamed from: q6.a */
/* loaded from: classes3.dex */
public abstract class AbstractC25136a {
    /* renamed from: a */
    public static int m130291a(int i11, int i12) {
        return AbstractC1409d.m7147p(i11, (Color.alpha(i11) * i12) / 255);
    }

    /* renamed from: b */
    public static int m130292b(Context context, int i11, int i12) {
        TypedValue m143969a = AbstractC28773b.m143969a(context, i11);
        if (m143969a != null) {
            return m143969a.data;
        }
        return i12;
    }

    /* renamed from: c */
    public static int m130293c(Context context, int i11, String str) {
        return AbstractC28773b.m143971c(context, i11, str);
    }

    /* renamed from: d */
    public static int m130294d(View view, int i11) {
        return AbstractC28773b.m143972d(view, i11);
    }

    /* renamed from: e */
    public static int m130295e(View view, int i11, int i12) {
        return m130292b(view.getContext(), i11, i12);
    }

    /* renamed from: f */
    public static int m130296f(int i11, int i12) {
        return AbstractC1409d.m7142k(i12, i11);
    }

    /* renamed from: g */
    public static int m130297g(int i11, int i12, float f11) {
        return m130296f(i11, AbstractC1409d.m7147p(i12, Math.round(Color.alpha(i12) * f11)));
    }

    /* renamed from: h */
    public static int m130298h(View view, int i11, int i12, float f11) {
        return m130297g(m130294d(view, i11), m130294d(view, i12), f11);
    }
}
