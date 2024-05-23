package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.AbstractC1409d;
import p175g0.AbstractC19187j;

/* renamed from: androidx.appcompat.widget.p1 */
/* loaded from: classes.dex */
public abstract class AbstractC1199p1 {

    /* renamed from: a */
    private static final ThreadLocal f4701a = new ThreadLocal();

    /* renamed from: b */
    static final int[] f4702b = {-16842910};

    /* renamed from: c */
    static final int[] f4703c = {R.attr.state_focused};

    /* renamed from: d */
    static final int[] f4704d = {R.attr.state_activated};

    /* renamed from: e */
    static final int[] f4705e = {R.attr.state_pressed};

    /* renamed from: f */
    static final int[] f4706f = {R.attr.state_checked};

    /* renamed from: g */
    static final int[] f4707g = {R.attr.state_selected};

    /* renamed from: h */
    static final int[] f4708h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f4709i = new int[0];

    /* renamed from: j */
    private static final int[] f4710j = new int[1];

    /* renamed from: a */
    public static void m5678a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC19187j.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(AbstractC19187j.AppCompatTheme_windowActionBar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("View ");
                sb2.append(view.getClass());
                sb2.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m5679b(Context context, int i11) {
        ColorStateList m5682e = m5682e(context, i11);
        if (m5682e != null && m5682e.isStateful()) {
            return m5682e.getColorForState(f4702b, m5682e.getDefaultColor());
        }
        TypedValue m5683f = m5683f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, m5683f, true);
        return m5681d(context, i11, m5683f.getFloat());
    }

    /* renamed from: c */
    public static int m5680c(Context context, int i11) {
        int[] iArr = f4710j;
        iArr[0] = i11;
        C1211t1 m5715u = C1211t1.m5715u(context, null, iArr);
        try {
            return m5715u.m5718b(0, 0);
        } finally {
            m5715u.m5736w();
        }
    }

    /* renamed from: d */
    static int m5681d(Context context, int i11, float f11) {
        return AbstractC1409d.m7147p(m5680c(context, i11), Math.round(Color.alpha(r0) * f11));
    }

    /* renamed from: e */
    public static ColorStateList m5682e(Context context, int i11) {
        int[] iArr = f4710j;
        iArr[0] = i11;
        C1211t1 m5715u = C1211t1.m5715u(context, null, iArr);
        try {
            return m5715u.m5719c(0);
        } finally {
            m5715u.m5736w();
        }
    }

    /* renamed from: f */
    private static TypedValue m5683f() {
        ThreadLocal threadLocal = f4701a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
