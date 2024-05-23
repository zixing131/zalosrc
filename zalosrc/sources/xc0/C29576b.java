package xc0;

import android.view.View;

/* renamed from: xc0.b */
/* loaded from: classes4.dex */
public class C29576b extends AbstractC29575a {
    @Override // xc0.AbstractC29575a
    /* renamed from: c */
    protected boolean mo146979c() {
        return true;
    }

    @Override // xc0.AbstractC29575a
    /* renamed from: f */
    protected void mo146982f(View view, float f11) {
        float f12 = 0.0f;
        if (f11 < 0.0f) {
            f12 = view.getWidth();
        }
        view.setPivotX(f12);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(f11 * 90.0f);
        view.setCameraDistance(view.getWidth() * 4 * view.getContext().getResources().getDisplayMetrics().density);
    }
}
