package p166fq;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import fn0.AbstractC19074t;
import java.util.Locale;
import p129ef.C18420a;
import p276jt.C21357l;

/* renamed from: fq.x */
/* loaded from: classes4.dex */
public final class C19127x extends AbstractC19118o {

    /* renamed from: e */
    private long f95145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19127x(InterfaceC19110g interfaceC19110g, boolean z11) {
        super(interfaceC19110g, z11);
        AbstractC19074t.m100208f(interfaceC19110g, "current");
        this.f95145e = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m100394m(C19127x c19127x, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c19127x, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animator");
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (c19127x.m100376e() instanceof C18420a) {
            animatedFraction *= ((C18420a) c19127x.m100376e()).m97619c1();
        }
        if (animatedFraction < 0.1d && (c19127x.m100376e() instanceof C21357l)) {
            ((C21357l) c19127x.m100376e()).m110608h0();
            return;
        }
        if (c19127x.m100376e() instanceof C21357l) {
            ((C21357l) c19127x.m100376e()).m110616t0();
        }
        c19127x.m100376e().mo97625j(animatedFraction);
        c19127x.m100376e().mo97627o(animatedFraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m100395n(C19127x c19127x, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c19127x, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animator");
        float animatedFraction = 1 - valueAnimator.getAnimatedFraction();
        if (c19127x.m100376e() instanceof C18420a) {
            animatedFraction *= ((C18420a) c19127x.m100376e()).m97619c1();
        }
        if (animatedFraction < 0.1d && (c19127x.m100376e() instanceof C21357l)) {
            ((C21357l) c19127x.m100376e()).m110608h0();
            return;
        }
        if (c19127x.m100376e() instanceof C21357l) {
            ((C21357l) c19127x.m100376e()).m110616t0();
        }
        c19127x.m100376e().mo97625j(animatedFraction);
        c19127x.m100376e().mo97627o(animatedFraction);
    }

    @Override // p166fq.AbstractC19118o
    /* renamed from: a */
    public void mo100372a(LyricRender lyricRender) {
        AbstractC19074t.m100208f(lyricRender, "lyricRender");
        if (!m100377f()) {
            m100375d().cancel();
            return;
        }
        if (this.f95145e != lyricRender.m45708e()) {
            this.f95145e = lyricRender.m45708e();
            long m45710g = lyricRender.m45710g() - lyricRender.m45708e();
            if (m45710g > 0) {
                C19104a m100396o = m100396o(m45710g);
                long m100339a = m100396o.m100339a();
                long m100340b = m100396o.m100340b();
                long m100341c = m100396o.m100341c();
                InterfaceC19110g m100376e = m100376e();
                boolean m100374c = m100374c();
                String m45707d = lyricRender.m45707d();
                if (m100374c) {
                    m45707d = m45707d.toUpperCase(Locale.ROOT);
                    AbstractC19074t.m100207e(m45707d, "toUpperCase(...)");
                }
                m100376e.mo97624i(m45707d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fq.v
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C19127x.m100394m(C19127x.this, valueAnimator);
                    }
                });
                ofFloat.setDuration(m100339a);
                ofFloat.setInterpolator(new InterpolatorC19105b());
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fq.w
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C19127x.m100395n(C19127x.this, valueAnimator);
                    }
                });
                ofFloat2.setStartDelay(m100340b);
                ofFloat2.setDuration(m100341c);
                ofFloat2.setInterpolator(new AccelerateInterpolator());
                m100375d().cancel();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ofFloat, ofFloat2);
                m100381j(animatorSet);
                m100375d().start();
            }
        }
    }

    /* renamed from: o */
    public C19104a m100396o(long j11) {
        double d11 = j11;
        return new C19104a((long) (0.4d * d11), (long) (0.5d * d11), (long) (d11 * 0.1d));
    }
}
