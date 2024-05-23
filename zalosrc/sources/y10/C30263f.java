package y10;

import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;
import y10.AbstractC30261d;

/* renamed from: y10.f */
/* loaded from: classes5.dex */
public class C30263f extends AbstractC30261d {

    /* renamed from: s */
    private Interpolator f140603s;

    public C30263f(Interpolator interpolator) {
        AbstractC19074t.m100208f(interpolator, "slideUpInterpolator");
        this.f140603s = interpolator;
    }

    @Override // y10.AbstractC30261d
    /* renamed from: d0 */
    protected void mo149297d0(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        ViewPropertyAnimator animate = abstractC1876c0.f7784p.animate();
        animate.translationY(0.0f);
        animate.alpha(1.0f);
        animate.setDuration(250L);
        animate.setInterpolator(this.f140603s);
        animate.setListener(new AbstractC30261d.d(this, abstractC1876c0));
        animate.setStartDelay(m149300q0(abstractC1876c0));
        animate.start();
    }

    @Override // y10.AbstractC30261d
    /* renamed from: g0 */
    protected void mo149298g0(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        ViewPropertyAnimator animate = abstractC1876c0.f7784p.animate();
        animate.translationY(abstractC1876c0.f7784p.getHeight());
        animate.alpha(0.0f);
        animate.setDuration(m10049o());
        animate.setInterpolator(this.f140603s);
        animate.setListener(new AbstractC30261d.e(this, abstractC1876c0));
        animate.setStartDelay(m149302s0(abstractC1876c0));
        animate.start();
    }

    @Override // y10.AbstractC30261d
    /* renamed from: u0 */
    protected void mo149303u0(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        abstractC1876c0.f7784p.setTranslationY(r0.getHeight() * 1.5f);
        abstractC1876c0.f7784p.setAlpha(0.0f);
    }
}
