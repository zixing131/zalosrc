package p286k2;

import android.view.View;
import androidx.transition.C2030t;

/* renamed from: k2.r */
/* loaded from: classes2.dex */
public abstract class AbstractC21454r extends AbstractC21443g {

    /* renamed from: a */
    private static final String[] f104461a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: d */
    private static int m110999d(C2030t c2030t, int i11) {
        int[] iArr;
        if (c2030t == null || (iArr = (int[]) c2030t.f8615a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i11];
    }

    @Override // p286k2.AbstractC21443g
    /* renamed from: a */
    public void mo110987a(C2030t c2030t) {
        View view = c2030t.f8616b;
        Integer num = (Integer) c2030t.f8615a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        c2030t.f8615a.put("android:visibilityPropagation:visibility", num);
        view.getLocationOnScreen(r2);
        int round = r2[0] + Math.round(view.getTranslationX());
        int[] iArr = {round};
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        c2030t.f8615a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // p286k2.AbstractC21443g
    /* renamed from: b */
    public String[] mo110988b() {
        return f104461a;
    }

    /* renamed from: e */
    public int m111000e(C2030t c2030t) {
        Integer num;
        if (c2030t == null || (num = (Integer) c2030t.f8615a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public int m111001f(C2030t c2030t) {
        return m110999d(c2030t, 0);
    }

    /* renamed from: g */
    public int m111002g(C2030t c2030t) {
        return m110999d(c2030t, 1);
    }
}
