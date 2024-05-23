package xc0;

import android.view.View;
import com.zing.p058v4.view.ViewPager;

/* renamed from: xc0.a */
/* loaded from: classes4.dex */
public abstract class AbstractC29575a implements ViewPager.InterfaceC6877l {
    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6877l
    /* renamed from: a */
    public void mo35330a(View view, float f11) {
        m146981e(view, f11);
        mo146982f(view, f11);
        m146980d(view, f11);
    }

    /* renamed from: b */
    protected boolean m146978b() {
        return true;
    }

    /* renamed from: c */
    protected abstract boolean mo146979c();

    /* renamed from: d */
    protected void m146980d(View view, float f11) {
    }

    /* renamed from: e */
    protected void m146981e(View view, float f11) {
        float f12;
        float width = view.getWidth();
        float f13 = 0.0f;
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationY(0.0f);
        if (mo146979c()) {
            f12 = 0.0f;
        } else {
            f12 = (-width) * f11;
        }
        view.setTranslationX(f12);
        if (m146978b()) {
            if (f11 > -1.0f && f11 < 1.0f) {
                f13 = 1.0f;
            }
            view.setAlpha(f13);
            return;
        }
        view.setAlpha(1.0f);
    }

    /* renamed from: f */
    protected abstract void mo146982f(View view, float f11);
}
