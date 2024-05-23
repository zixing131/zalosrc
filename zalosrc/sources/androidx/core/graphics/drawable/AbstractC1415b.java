package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import fn0.AbstractC19074t;

/* renamed from: androidx.core.graphics.drawable.b */
/* loaded from: classes2.dex */
public abstract class AbstractC1415b {
    /* renamed from: a */
    public static final Bitmap m7217a(Drawable drawable, int i11, int i12, Bitmap.Config config) {
        AbstractC19074t.m100208f(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                    if (i11 == bitmapDrawable.getBitmap().getWidth() && i12 == bitmapDrawable.getBitmap().getHeight()) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        AbstractC19074t.m100207e(bitmap, "bitmap");
                        return bitmap;
                    }
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i11, i12, true);
                    AbstractC19074t.m100207e(createScaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
                    return createScaledBitmap;
                }
            } else {
                throw new IllegalArgumentException("bitmap is null");
            }
        }
        Rect bounds = drawable.getBounds();
        AbstractC19074t.m100207e(bounds, "bounds");
        int i13 = bounds.left;
        int i14 = bounds.top;
        int i15 = bounds.right;
        int i16 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, config);
        drawable.setBounds(0, 0, i11, i12);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i13, i14, i15, i16);
        AbstractC19074t.m100207e(createBitmap, "bitmap");
        return createBitmap;
    }

    /* renamed from: b */
    public static /* synthetic */ Bitmap m7218b(Drawable drawable, int i11, int i12, Bitmap.Config config, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = drawable.getIntrinsicWidth();
        }
        if ((i13 & 2) != 0) {
            i12 = drawable.getIntrinsicHeight();
        }
        if ((i13 & 4) != 0) {
            config = null;
        }
        return m7217a(drawable, i11, i12, config);
    }

    /* renamed from: c */
    public static final Bitmap m7219c(Drawable drawable, int i11, int i12, Bitmap.Config config) {
        AbstractC19074t.m100208f(drawable, "<this>");
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return m7217a(drawable, i11, i12, config);
    }

    /* renamed from: d */
    public static /* synthetic */ Bitmap m7220d(Drawable drawable, int i11, int i12, Bitmap.Config config, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = drawable.getIntrinsicWidth();
        }
        if ((i13 & 2) != 0) {
            i12 = drawable.getIntrinsicHeight();
        }
        if ((i13 & 4) != 0) {
            config = null;
        }
        return m7219c(drawable, i11, i12, config);
    }
}
