package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.w1 */
/* loaded from: classes2.dex */
public abstract class AbstractC1220w1 {
    /* renamed from: a */
    public static void m5757a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            ViewOnLongClickListenerC1223x1.m5764f(view, charSequence);
        }
    }
}
