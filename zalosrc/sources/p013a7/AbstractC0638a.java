package p013a7;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p310l0.C21983d;
import p357n6.AbstractC23577b;

/* renamed from: a7.a */
/* loaded from: classes3.dex */
public abstract class AbstractC0638a {

    /* renamed from: a */
    private static final int[] f2159a = {R.attr.theme, AbstractC23577b.theme};

    /* renamed from: b */
    private static final int[] f2160b = {AbstractC23577b.materialThemeOverlay};

    /* renamed from: a */
    private static int m907a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2159a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return resourceId2;
        }
        return resourceId;
    }

    /* renamed from: b */
    private static int m908b(Context context, AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2160b, i11, i12);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m909c(Context context, AttributeSet attributeSet, int i11, int i12) {
        boolean z11;
        int m908b = m908b(context, attributeSet, i11, i12);
        if ((context instanceof C21983d) && ((C21983d) context).m114801c() == m908b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m908b != 0 && !z11) {
            C21983d c21983d = new C21983d(context, m908b);
            int m907a = m907a(context, attributeSet);
            if (m907a != 0) {
                c21983d.getTheme().applyStyle(m907a, true);
            }
            return c21983d;
        }
        return context;
    }
}
