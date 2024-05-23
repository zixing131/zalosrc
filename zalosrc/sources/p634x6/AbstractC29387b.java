package p634x6;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import androidx.core.graphics.AbstractC1409d;

/* renamed from: x6.b */
/* loaded from: classes3.dex */
public abstract class AbstractC29387b {

    /* renamed from: a */
    public static final boolean f135923a = true;

    /* renamed from: b */
    private static final int[] f135924b = {R.attr.state_pressed};

    /* renamed from: c */
    private static final int[] f135925c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d */
    private static final int[] f135926d = {R.attr.state_focused};

    /* renamed from: e */
    private static final int[] f135927e = {R.attr.state_hovered};

    /* renamed from: f */
    private static final int[] f135928f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g */
    private static final int[] f135929g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h */
    private static final int[] f135930h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i */
    private static final int[] f135931i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j */
    private static final int[] f135932j = {R.attr.state_selected};

    /* renamed from: k */
    private static final int[] f135933k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l */
    static final String f135934l = AbstractC29387b.class.getSimpleName();

    /* renamed from: a */
    public static ColorStateList m146551a(ColorStateList colorStateList) {
        if (f135923a) {
            return new ColorStateList(new int[][]{f135932j, StateSet.NOTHING}, new int[]{m146553c(colorStateList, f135928f), m146553c(colorStateList, f135924b)});
        }
        int[] iArr = f135928f;
        int[] iArr2 = f135929g;
        int[] iArr3 = f135930h;
        int[] iArr4 = f135931i;
        int[] iArr5 = f135924b;
        int[] iArr6 = f135925c;
        int[] iArr7 = f135926d;
        int[] iArr8 = f135927e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f135932j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m146553c(colorStateList, iArr), m146553c(colorStateList, iArr2), m146553c(colorStateList, iArr3), m146553c(colorStateList, iArr4), 0, m146553c(colorStateList, iArr5), m146553c(colorStateList, iArr6), m146553c(colorStateList, iArr7), m146553c(colorStateList, iArr8), 0});
    }

    /* renamed from: b */
    private static int m146552b(int i11) {
        return AbstractC1409d.m7147p(i11, Math.min(Color.alpha(i11) * 2, 255));
    }

    /* renamed from: c */
    private static int m146553c(ColorStateList colorStateList, int[] iArr) {
        int i11;
        if (colorStateList != null) {
            i11 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i11 = 0;
        }
        if (f135923a) {
            return m146552b(i11);
        }
        return i11;
    }

    /* renamed from: d */
    public static ColorStateList m146554d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 22 && i11 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
                Color.alpha(colorStateList.getColorForState(f135933k, 0));
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* renamed from: e */
    public static boolean m146555e(int[] iArr) {
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 : iArr) {
            if (i11 == 16842910) {
                z11 = true;
            } else if (i11 == 16842908 || i11 == 16842919 || i11 == 16843623) {
                z12 = true;
            }
        }
        if (!z11 || !z12) {
            return false;
        }
        return true;
    }
}
