package t80;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import id0.C20518d;
import kd0.C21693c;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p348mi.AbstractC23304d;
import p379o3.C24003n;
import vg.AbstractC28025b8;
import vg.C28212v6;

/* renamed from: t80.i */
/* loaded from: classes6.dex */
public class C26596i extends AbstractC26593f {

    /* renamed from: q1 */
    static int[] f125928q1 = {AbstractC16803z.icn_story_camera_white, AbstractC16803z.icn_story_video_call_white, AbstractC16803z.icn_story_pen_white};

    /* renamed from: o1 */
    int f125929o1;

    /* renamed from: p1 */
    Animator f125930p1;

    /* renamed from: t80.i$a */
    /* loaded from: classes6.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C26596i c26596i = C26596i.this;
            int i11 = c26596i.f125929o1 + 1;
            c26596i.f125929o1 = i11;
            int[] iArr = C26596i.f125928q1;
            int length = i11 % iArr.length;
            c26596i.f125929o1 = length;
            C21693c c21693c = c26596i.f125912c1;
            if (c21693c != null) {
                c21693c.mo111926w1(iArr[length]);
            }
        }
    }

    /* renamed from: t80.i$b */
    /* loaded from: classes6.dex */
    class b extends AnimatorListenerAdapter {

        /* renamed from: p */
        boolean f125932p = false;

        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f125932p = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                if (!this.f125932p) {
                    Animator animator2 = C26596i.this.f125930p1;
                    if (animator2 != null) {
                        animator2.start();
                    }
                } else {
                    C21693c c21693c = C26596i.this.f125912c1;
                    if (c21693c != null) {
                        c21693c.mo89124V0(1.0f);
                        C26596i.this.f125912c1.mo89126W0(1.0f);
                        C26596i c26596i = C26596i.this;
                        c26596i.f125929o1 = 0;
                        c26596i.f125912c1.mo111926w1(C26596i.f125928q1[0]);
                        C26596i.this.f125912c1.invalidate();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C26596i(Context context) {
        super(context);
        C21693c c21693c = this.f125912c1;
        if (c21693c != null) {
            c21693c.mo44614b1(0);
        }
        C26590c c26590c = this.f125910a1;
        if (c26590c != null) {
            c26590c.mo89161z0(AbstractC23136l9.m118641B(context, AbstractC16801x.white_60));
        }
        m136541y1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public /* synthetic */ void m136543C1(ValueAnimator valueAnimator) {
        C21693c c21693c = this.f125912c1;
        if (c21693c != null) {
            c21693c.mo89124V0(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f125912c1.mo89126W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f125912c1.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public /* synthetic */ void m136544D1(ValueAnimator valueAnimator) {
        C21693c c21693c = this.f125912c1;
        if (c21693c != null) {
            c21693c.mo89124V0(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f125912c1.mo89126W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f125912c1.invalidate();
        }
    }

    /* renamed from: B1 */
    public void m136546B1() {
        String str;
        try {
            C28212v6 m141453i = AbstractC28025b8.m141453i("tip.timeline.createstory");
            String str2 = "";
            if (m141453i != null && m141453i.m142167f()) {
                str2 = m141453i.f131585k;
            } else {
                ContactProfile contactProfile = AbstractC23304d.f113368c0;
                if (contactProfile != null) {
                    if (TextUtils.isEmpty(contactProfile.f42323A1)) {
                        str = AbstractC23304d.f113368c0.f42446v;
                    } else {
                        str = AbstractC23304d.f113368c0.f42323A1;
                    }
                    str2 = str;
                }
            }
            if (this.f125907X0 != null) {
                C24003n m120097T0 = C23278z2.m120097T0();
                this.f125907X0.mo111926w1(AbstractC16803z.bg_item_feed_o);
                if (!TextUtils.isEmpty(str2)) {
                    this.f125907X0.m115375G1(this.f125906W0, str2, m120097T0);
                }
            }
            C26590c c26590c = this.f125910a1;
            if (c26590c != null) {
                c26590c.m136529y1(false);
                C26590c c26590c2 = this.f125910a1;
                c26590c2.mo89161z0(AbstractC23136l9.m118641B(c26590c2.getContext(), AbstractC16801x.white_60));
                this.f125910a1.m136520A1(0);
            }
            C22122a0 c22122a0 = this.f125911b1;
            if (c22122a0 != null) {
                c22122a0.m89087B0(AbstractC16803z.story_newstory_large_rect_bg);
            }
            C21693c c21693c = this.f125912c1;
            if (c21693c != null) {
                c21693c.m89106L().m89060k0(AbstractC23136l9.m118742r(16.0f)).m89030N(AbstractC23136l9.m118742r(16.0f)).m89025I(true);
                this.f125912c1.mo111926w1(f125928q1[this.f125929o1]);
            }
            C22126c0 c22126c0 = this.f125913d1;
            if (c22126c0 != null) {
                c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_add_new));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E1 */
    public void m136547E1() {
        try {
            Animator animator = this.f125930p1;
            if (animator != null && animator.isRunning()) {
                return;
            }
            m136548F1();
            C21693c c21693c = this.f125912c1;
            if (c21693c != null) {
                c21693c.mo89124V0(1.0f);
                this.f125912c1.mo89126W0(1.0f);
                this.f125912c1.mo111926w1(f125928q1[this.f125929o1]);
                this.f125912c1.m89135c1(new C20518d());
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t80.g
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C26596i.this.m136543C1(valueAnimator);
                }
            });
            ofFloat.addListener(new a());
            ofFloat.setDuration(350L);
            ofFloat.setStartDelay(1000L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t80.h
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C26596i.this.m136544D1(valueAnimator);
                }
            });
            ofFloat2.setDuration(350L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).before(ofFloat2);
            animatorSet.addListener(new b());
            this.f125930p1 = animatorSet;
            animatorSet.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: F1 */
    public void m136548F1() {
        try {
            Animator animator = this.f125930p1;
            if (animator != null) {
                animator.cancel();
                this.f125930p1 = null;
            }
            C21693c c21693c = this.f125912c1;
            if (c21693c != null) {
                c21693c.mo89124V0(1.0f);
                this.f125912c1.mo89126W0(1.0f);
                this.f125912c1.mo111926w1(f125928q1[this.f125929o1]);
                this.f125912c1.invalidate();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // t80.AbstractC26593f
    /* renamed from: t1 */
    boolean mo136538t1() {
        return true;
    }

    @Override // t80.AbstractC26593f
    /* renamed from: x1 */
    void mo136540x1(boolean z11) {
    }
}
