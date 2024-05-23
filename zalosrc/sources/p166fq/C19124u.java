package p166fq;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import fn0.AbstractC19074t;
import java.util.Locale;

/* renamed from: fq.u */
/* loaded from: classes4.dex */
public final class C19124u extends AbstractC19118o {

    /* renamed from: e */
    private long f95142e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19124u(InterfaceC19110g interfaceC19110g, boolean z11) {
        super(interfaceC19110g, z11);
        AbstractC19074t.m100208f(interfaceC19110g, "current");
        this.f95142e = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m100389m(C19124u c19124u, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c19124u, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animator");
        c19124u.m100376e().mo97629q(valueAnimator.getAnimatedFraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m100390n(C19124u c19124u, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c19124u, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animator");
        c19124u.m100376e().mo97629q(1 - valueAnimator.getAnimatedFraction());
    }

    @Override // p166fq.AbstractC19118o
    /* renamed from: a */
    public void mo100372a(LyricRender lyricRender) {
        AbstractC19074t.m100208f(lyricRender, "lyricRender");
        if (!m100377f()) {
            m100375d().cancel();
            return;
        }
        if (this.f95142e != lyricRender.m45708e()) {
            this.f95142e = lyricRender.m45708e();
            long m45710g = lyricRender.m45710g() - lyricRender.m45708e();
            if (m45710g > 0) {
                C19104a m100391o = m100391o(m45710g);
                long m100339a = m100391o.m100339a();
                long m100340b = m100391o.m100340b();
                long m100341c = m100391o.m100341c();
                InterfaceC19110g m100376e = m100376e();
                boolean m100374c = m100374c();
                String m45707d = lyricRender.m45707d();
                if (m100374c) {
                    m45707d = m45707d.toUpperCase(Locale.ROOT);
                    AbstractC19074t.m100207e(m45707d, "toUpperCase(...)");
                }
                m100376e.mo97624i(m45707d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fq.s
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C19124u.m100389m(C19124u.this, valueAnimator);
                    }
                });
                ofFloat.setDuration(m100339a);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fq.t
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C19124u.m100390n(C19124u.this, valueAnimator);
                    }
                });
                ofFloat2.setStartDelay(m100340b);
                ofFloat2.setDuration(m100341c);
                m100375d().cancel();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.setInterpolator(new LinearInterpolator());
                m100381j(animatorSet);
                m100375d().start();
            }
        }
    }

    /* renamed from: o */
    public C19104a m100391o(long j11) {
        double d11 = j11;
        long j12 = (long) (0.2d * d11);
        return new C19104a(j12, (long) (d11 * 0.6d), j12);
    }
}
