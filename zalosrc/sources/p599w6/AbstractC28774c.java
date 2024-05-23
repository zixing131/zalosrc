package p599w6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C1211t1;
import p193h0.AbstractC19694b;

/* renamed from: w6.c */
/* loaded from: classes3.dex */
public abstract class AbstractC28774c {
    /* renamed from: a */
    public static ColorStateList m143973a(Context context, TypedArray typedArray, int i11) {
        int resourceId;
        ColorStateList m103335c;
        if (typedArray.hasValue(i11) && (resourceId = typedArray.getResourceId(i11, 0)) != 0 && (m103335c = AbstractC19694b.m103335c(context, resourceId)) != null) {
            return m103335c;
        }
        return typedArray.getColorStateList(i11);
    }

    /* renamed from: b */
    public static ColorStateList m143974b(Context context, C1211t1 c1211t1, int i11) {
        int m5730n;
        ColorStateList m103335c;
        if (c1211t1.m5735s(i11) && (m5730n = c1211t1.m5730n(i11, 0)) != 0 && (m103335c = AbstractC19694b.m103335c(context, m5730n)) != null) {
            return m103335c;
        }
        return c1211t1.m5719c(i11);
    }

    /* renamed from: c */
    public static int m143975c(Context context, TypedArray typedArray, int i11, int i12) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i11, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i12);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i11, i12);
    }

    /* renamed from: d */
    public static Drawable m143976d(Context context, TypedArray typedArray, int i11) {
        int resourceId;
        Drawable m103336d;
        if (typedArray.hasValue(i11) && (resourceId = typedArray.getResourceId(i11, 0)) != 0 && (m103336d = AbstractC19694b.m103336d(context, resourceId)) != null) {
            return m103336d;
        }
        return typedArray.getDrawable(i11);
    }

    /* renamed from: e */
    public static int m143977e(TypedArray typedArray, int i11, int i12) {
        if (typedArray.hasValue(i11)) {
            return i11;
        }
        return i12;
    }

    /* renamed from: f */
    public static C28775d m143978f(Context context, TypedArray typedArray, int i11) {
        int resourceId;
        if (typedArray.hasValue(i11) && (resourceId = typedArray.getResourceId(i11, 0)) != 0) {
            return new C28775d(context, resourceId);
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m143979g(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m143980h(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 2.0f) {
            return true;
        }
        return false;
    }
}
