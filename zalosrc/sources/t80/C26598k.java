package t80;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import au.C2343e;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalocore.CoreUtility;
import l30.C22052u;
import l80.C22126c0;
import me0.AbstractC23028c0;
import me0.AbstractC23124k8;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p304ks.AbstractC21935u;
import p348mi.C23302b;
import p716zh.C31980jc;

/* renamed from: t80.k */
/* loaded from: classes6.dex */
public class C26598k extends AbstractC26593f {

    /* renamed from: o1 */
    String f125934o1;

    /* renamed from: p1 */
    Animator f125935p1;

    /* renamed from: t80.k$a */
    /* loaded from: classes6.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            try {
                Animator animator2 = C26598k.this.f125935p1;
                if (animator2 != null && animator2.equals(animator)) {
                    C26598k c26598k = C26598k.this;
                    c26598k.f125935p1 = null;
                    C22052u.f108594e = false;
                    c26598k.f125934o1 = "";
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                Animator animator2 = C26598k.this.f125935p1;
                if (animator2 != null && animator2.equals(animator)) {
                    C26598k c26598k = C26598k.this;
                    c26598k.f125935p1 = null;
                    C22052u.f108594e = false;
                    c26598k.f125934o1 = "";
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C26598k(Context context) {
        super(context);
    }

    /* renamed from: A1 */
    public C16719g m136550A1() {
        return this.f125907X0;
    }

    @Override // t80.AbstractC26593f
    /* renamed from: t1 */
    boolean mo136538t1() {
        return true;
    }

    @Override // t80.AbstractC26593f
    /* renamed from: x1 */
    void mo136540x1(boolean z11) {
        C26590c c26590c = this.f125910a1;
        if (c26590c != null) {
            c26590c.m136530z1(z11);
        }
    }

    /* renamed from: z1 */
    public void m136551z1(C31980jc c31980jc, C31980jc c31980jc2) {
        boolean z11;
        Animator animator;
        if (c31980jc == null) {
            return;
        }
        try {
            boolean equals = CoreUtility.f89233i.equals(c31980jc.f147023p);
            C22126c0 c22126c0 = this.f125913d1;
            if (c22126c0 != null) {
                if (equals) {
                    c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_stories));
                } else if (!TextUtils.isEmpty(c31980jc.f147024q)) {
                    this.f125913d1.m111959G1(AbstractC21935u.m114542i(c31980jc.f147023p, c31980jc.f147024q));
                } else {
                    this.f125913d1.m111959G1("");
                }
            }
            AbstractC23124k8.m118622l(c31980jc2, c31980jc, this.f125906W0, this.f125907X0, getContext());
            if (this.f125911b1 != null) {
                String str = c31980jc.f147025r;
                if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
                    if (!equals && C23302b.f113247a.m120523d(str) && !TextUtils.isEmpty(c31980jc.f147024q)) {
                        this.f125911b1.mo111925v1(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(AbstractC21935u.m114542i(c31980jc.f147023p, c31980jc.f147024q)), C2343e.m12307a(c31980jc.f147023p, false)));
                    } else {
                        this.f125911b1.m115375G1(this.f125906W0, c31980jc.f147025r, C23278z2.m120143n());
                    }
                }
            }
            boolean m153829v = c31980jc.m153829v();
            C26590c c26590c = this.f125910a1;
            if (c26590c != null) {
                c26590c.m136528x1(m153829v);
            }
            mo136540x1(c31980jc.f147033z);
            if (c31980jc.f147033z) {
                this.f125914e1.mo44614b1(8);
                this.f125913d1.mo89099H0(true);
                return;
            }
            if (equals && C22052u.f108594e) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m153829v && !z11) {
                this.f125913d1.mo89099H0(true);
            } else if (z11) {
                if (TextUtils.isEmpty(this.f125934o1)) {
                    Animator m136524s1 = this.f125910a1.m136524s1();
                    m136524s1.addListener(new a());
                    this.f125935p1 = m136524s1;
                    this.f125934o1 = c31980jc.f147023p;
                    m136524s1.start();
                } else if (!this.f125934o1.equals(c31980jc.f147023p) && (animator = this.f125935p1) != null) {
                    animator.cancel();
                    this.f125935p1 = null;
                }
            } else {
                C26590c c26590c2 = this.f125910a1;
                if (c26590c2 != null) {
                    c26590c2.m136527w1(100);
                }
            }
            if (c31980jc.f147023p.equals(CoreUtility.f89233i) && C22052u.m115085y().m115105z()) {
                this.f125914e1.mo44614b1(0);
                this.f125908Y0.mo44614b1(0);
            } else {
                this.f125914e1.mo44614b1(8);
                this.f125908Y0.mo44614b1(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
