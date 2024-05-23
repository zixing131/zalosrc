package p706z6;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.AbstractC6359z;

/* renamed from: z6.i */
/* loaded from: classes3.dex */
public abstract class AbstractC31690i {
    /* renamed from: a */
    public static AbstractC31685d m152465a(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return m152466b();
            }
            return new C31686e();
        }
        return new C31693l();
    }

    /* renamed from: b */
    public static AbstractC31685d m152466b() {
        return new C31693l();
    }

    /* renamed from: c */
    public static C31687f m152467c() {
        return new C31687f();
    }

    /* renamed from: d */
    public static void m152468d(View view, float f11) {
        Drawable background = view.getBackground();
        if (background instanceof C31689h) {
            ((C31689h) background).m152441b0(f11);
        }
    }

    /* renamed from: e */
    public static void m152469e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C31689h) {
            m152470f(view, (C31689h) background);
        }
    }

    /* renamed from: f */
    public static void m152470f(View view, C31689h c31689h) {
        if (c31689h.m152436T()) {
            c31689h.m152446g0(AbstractC6359z.m32652g(view));
        }
    }
}
