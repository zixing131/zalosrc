package p286k2;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.C2030t;
import androidx.transition.Transition;

/* renamed from: k2.c */
/* loaded from: classes2.dex */
public class C21439c extends AbstractC21454r {

    /* renamed from: b */
    private float f104458b = 3.0f;

    /* renamed from: h */
    private static float m110981h(float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        return (float) Math.sqrt((f15 * f15) + (f16 * f16));
    }

    @Override // p286k2.AbstractC21443g
    /* renamed from: c */
    public long mo110982c(ViewGroup viewGroup, Transition transition, C2030t c2030t, C2030t c2030t2) {
        int i11;
        int round;
        int i12;
        if (c2030t == null && c2030t2 == null) {
            return 0L;
        }
        if (c2030t2 != null && m111000e(c2030t) != 0) {
            c2030t = c2030t2;
            i11 = 1;
        } else {
            i11 = -1;
        }
        int m111001f = m111001f(c2030t);
        int m111002g = m111002g(c2030t);
        Rect m10932u = transition.m10932u();
        if (m10932u != null) {
            i12 = m10932u.centerX();
            round = m10932u.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            round = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            i12 = round2;
        }
        float m110981h = m110981h(m111001f, m111002g, i12, round) / m110981h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long m10931s = transition.m10931s();
        if (m10931s < 0) {
            m10931s = 300;
        }
        return Math.round((((float) (m10931s * i11)) / this.f104458b) * m110981h);
    }
}
