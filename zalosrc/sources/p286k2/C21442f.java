package p286k2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C2030t;
import androidx.transition.Transition;

/* renamed from: k2.f */
/* loaded from: classes2.dex */
public class C21442f extends AbstractC21454r {

    /* renamed from: b */
    private float f104459b = 3.0f;

    /* renamed from: c */
    private int f104460c = 80;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0012, code lost:            r0 = 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001d, code lost:            if (androidx.core.view.AbstractC1579n0.m7812G(r6) == 1) goto L7;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:            if (androidx.core.view.AbstractC1579n0.m7812G(r6) == 1) goto L6;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:            r0 = 5;     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m110984h(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = this.f104460c;
        if (i19 != 8388611) {
            if (i19 == 8388613) {
            }
        }
        if (i19 != 3) {
            if (i19 != 5) {
                if (i19 != 48) {
                    if (i19 != 80) {
                        return 0;
                    }
                    return Math.abs(i13 - i11) + (i12 - i16);
                }
                return Math.abs(i13 - i11) + (i18 - i12);
            }
            return Math.abs(i14 - i12) + (i11 - i15);
        }
        return Math.abs(i14 - i12) + (i17 - i11);
    }

    /* renamed from: i */
    private int m110985i(ViewGroup viewGroup) {
        int i11 = this.f104460c;
        if (i11 != 3 && i11 != 5 && i11 != 8388611 && i11 != 8388613) {
            return viewGroup.getHeight();
        }
        return viewGroup.getWidth();
    }

    @Override // p286k2.AbstractC21443g
    /* renamed from: c */
    public long mo110982c(ViewGroup viewGroup, Transition transition, C2030t c2030t, C2030t c2030t2) {
        int i11;
        int i12;
        int i13;
        C2030t c2030t3 = c2030t;
        if (c2030t3 == null && c2030t2 == null) {
            return 0L;
        }
        Rect m10932u = transition.m10932u();
        if (c2030t2 != null && m111000e(c2030t3) != 0) {
            c2030t3 = c2030t2;
            i11 = 1;
        } else {
            i11 = -1;
        }
        int m111001f = m111001f(c2030t3);
        int m111002g = m111002g(c2030t3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (m10932u != null) {
            i12 = m10932u.centerX();
            i13 = m10932u.centerY();
        } else {
            i12 = (round + width) / 2;
            i13 = (round2 + height) / 2;
        }
        float m110984h = m110984h(viewGroup, m111001f, m111002g, i12, i13, round, round2, width, height) / m110985i(viewGroup);
        long m10931s = transition.m10931s();
        if (m10931s < 0) {
            m10931s = 300;
        }
        return Math.round((((float) (m10931s * i11)) / this.f104459b) * m110984h);
    }

    /* renamed from: j */
    public void m110986j(int i11) {
        this.f104460c = i11;
    }
}
