package p100df;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;

/* renamed from: df.a */
/* loaded from: classes3.dex */
public abstract class AbstractC17909a {

    /* renamed from: a */
    private static final SparseArray f90431a = new SparseArray(3);

    /* renamed from: a */
    private static Typeface m94484a(Context context, int i11) {
        if (i11 != 1) {
            if (i11 != 5) {
                if (i11 != 8) {
                    return null;
                }
                return Typeface.createFromAsset(context.getAssets(), "fonts/camera/Pangolin-Regular.ttf");
            }
            return Typeface.createFromAsset(context.getAssets(), "fonts/camera/DancingScript-Bold.ttf");
        }
        return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Bold.ttf");
    }

    /* renamed from: b */
    public static Typeface m94485b(Context context, int i11) {
        SparseArray sparseArray = f90431a;
        Typeface typeface = (Typeface) sparseArray.get(i11);
        if (typeface == null && (typeface = m94484a(context, i11)) != null) {
            sparseArray.put(i11, typeface);
        }
        return typeface;
    }
}
