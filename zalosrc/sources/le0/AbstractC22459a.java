package le0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import ho0.AbstractC20110a;
import p193h0.AbstractC19694b;

/* renamed from: le0.a */
/* loaded from: classes.dex */
public abstract class AbstractC22459a {
    /* renamed from: a */
    public static int m116119a(Context context, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i11});
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return 0;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static Drawable m116120b(Context context, int i11) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i11});
        try {
            try {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    return AbstractC19694b.m103336d(context, resourceId);
                }
                return obtainStyledAttributes.getDrawable(0);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                obtainStyledAttributes.recycle();
                return null;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public static int m116121c(Context context, int i11) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i11});
        try {
            return obtainStyledAttributes.getResourceId(0, 0);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return 0;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
