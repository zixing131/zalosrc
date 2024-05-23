package p716zh;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;

/* renamed from: zh.j1 */
/* loaded from: classes3.dex */
public abstract class AbstractC31969j1 {

    /* renamed from: a */
    private static final SparseArray f146922a = new SparseArray(3);

    /* renamed from: a */
    private static Typeface m153696a(Context context, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 5) {
                            return Typeface.createFromAsset(context.getAssets(), "fonts/quicksand/Quicksand-Regular.ttf");
                        }
                        return Typeface.createFromAsset(context.getAssets(), "fonts/quicksand/Quicksand-SemiBold.ttf");
                    }
                    return Typeface.createFromAsset(context.getAssets(), "fonts/quicksand/Quicksand-Medium.ttf");
                }
                return Typeface.createFromAsset(context.getAssets(), "fonts/quicksand/Quicksand-Light.ttf");
            }
            return Typeface.createFromAsset(context.getAssets(), "fonts/quicksand/Quicksand-Bold.ttf");
        }
        return Typeface.createFromAsset(context.getAssets(), "fonts/quicksand/Quicksand-Regular.ttf");
    }

    /* renamed from: b */
    public static Typeface m153697b(Context context, int i11) {
        SparseArray sparseArray = f146922a;
        Typeface typeface = (Typeface) sparseArray.get(i11);
        if (typeface == null && (typeface = m153696a(context, i11)) != null) {
            sparseArray.put(i11, typeface);
        }
        return typeface;
    }
}
