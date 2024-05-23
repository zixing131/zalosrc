package bp0;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: bp0.q */
/* loaded from: classes7.dex */
public abstract class AbstractC3105q {
    /* renamed from: a */
    public static FrameLayout.LayoutParams m15698a(int i11, int i12) {
        return new FrameLayout.LayoutParams(m15707j(i11), m15707j(i12));
    }

    /* renamed from: b */
    public static FrameLayout.LayoutParams m15699b(int i11, int i12, int i13) {
        return new FrameLayout.LayoutParams(m15707j(i11), m15707j(i12), i13);
    }

    /* renamed from: c */
    public static FrameLayout.LayoutParams m15700c(int i11, int i12) {
        return new FrameLayout.LayoutParams(i11, i12);
    }

    /* renamed from: d */
    public static LinearLayout.LayoutParams m15701d(int i11, int i12) {
        return new LinearLayout.LayoutParams(m15707j(i11), m15707j(i12));
    }

    /* renamed from: e */
    public static LinearLayout.LayoutParams m15702e(int i11, int i12, float f11) {
        return new LinearLayout.LayoutParams(m15707j(i11), m15707j(i12), f11);
    }

    /* renamed from: f */
    public static LinearLayout.LayoutParams m15703f(int i11, int i12) {
        return new LinearLayout.LayoutParams(i11, i12);
    }

    /* renamed from: g */
    public static LinearLayout.LayoutParams m15704g(int i11, int i12, int i13) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m15707j(i11), m15707j(i12));
        layoutParams.gravity = i13;
        return layoutParams;
    }

    /* renamed from: h */
    public static RelativeLayout.LayoutParams m15705h(int i11, int i12) {
        return new RelativeLayout.LayoutParams(m15707j(i11), m15707j(i12));
    }

    /* renamed from: i */
    public static RelativeLayout.LayoutParams m15706i(int i11, int i12) {
        return new RelativeLayout.LayoutParams(i11, i12);
    }

    /* renamed from: j */
    private static int m15707j(float f11) {
        if (f11 >= 0.0f) {
            f11 = AbstractC3104p.m15650a(f11);
        }
        return (int) f11;
    }
}
