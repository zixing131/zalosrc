package zl0;

import android.os.Build;
import android.widget.TextView;
import java.lang.reflect.Field;

/* renamed from: zl0.k */
/* loaded from: classes7.dex */
public abstract class AbstractC32234k {
    /* renamed from: a */
    public static void m155469a(TextView textView, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setTextCursorDrawable(i11);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(textView, Integer.valueOf(i11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
