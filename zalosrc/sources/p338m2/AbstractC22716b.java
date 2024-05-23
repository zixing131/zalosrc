package p338m2;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: m2.b */
/* loaded from: classes.dex */
public abstract class AbstractC22716b {
    /* renamed from: a */
    public static View m117526a(View view, int i11) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View findViewById = viewGroup.getChildAt(i12).findViewById(i11);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }
}
