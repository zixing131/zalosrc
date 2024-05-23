package androidx.transition;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: androidx.transition.j */
/* loaded from: classes2.dex */
abstract class AbstractC2019j {

    /* renamed from: a */
    private static boolean f8588a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m11016a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        m11017b(imageView, matrix);
    }

    /* renamed from: b */
    private static void m11017b(ImageView imageView, Matrix matrix) {
        if (f8588a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f8588a = false;
            }
        }
    }
}
