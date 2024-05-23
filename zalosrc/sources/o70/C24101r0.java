package o70;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.p077ui.maintab.widget.CustomMainTab;
import com.zing.zalo.p077ui.zviews.TimelineView;
import com.zing.zalo.zview.ZaloView;
import java.util.ArrayList;
import zl0.AbstractC32232i;

/* renamed from: o70.r0 */
/* loaded from: classes5.dex */
public class C24101r0 implements ViewPager.InterfaceC6876k {

    /* renamed from: g */
    static boolean f116468g = !AbstractC32232i.m155457e("x86");

    /* renamed from: a */
    ViewPager f116469a;

    /* renamed from: b */
    C24105t0 f116470b;

    /* renamed from: c */
    CustomMainTab f116471c;

    /* renamed from: d */
    Animator f116472d;

    /* renamed from: e */
    Animator f116473e;

    /* renamed from: f */
    String f116474f = null;

    /* renamed from: o70.r0$a */
    /* loaded from: classes5.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f116475p;

        /* renamed from: q */
        final /* synthetic */ View f116476q;

        /* renamed from: r */
        final /* synthetic */ Runnable f116477r;

        /* renamed from: s */
        final /* synthetic */ int f116478s;

        a(View view, View view2, Runnable runnable, int i11) {
            this.f116475p = view;
            this.f116476q = view2;
            this.f116477r = runnable;
            this.f116478s = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f116475p.setAlpha(1.0f);
            View view = this.f116476q;
            if (view != null) {
                view.setAlpha(1.0f);
                this.f116476q.setTranslationX(0.0f);
            }
            Runnable runnable = this.f116477r;
            if (runnable != null) {
                runnable.run();
            }
            C24105t0 c24105t0 = C24101r0.this.f116470b;
            if (c24105t0 != null) {
                c24105t0.m125991C(this.f116478s);
            }
            if (C24101r0.f116468g) {
                View view2 = this.f116475p;
                if (view2 != null) {
                    view2.setLayerType(0, null);
                }
                View view3 = this.f116476q;
                if (view3 != null) {
                    view3.setLayerType(0, null);
                }
            }
        }
    }

    public C24101r0(ViewPager viewPager, C24105t0 c24105t0, CustomMainTab customMainTab) {
        this.f116469a = viewPager;
        this.f116470b = c24105t0;
        this.f116471c = customMainTab;
    }

    /* renamed from: c */
    private void m125987c(int i11, int i12) {
        ZaloView m125988d = m125988d(i11);
        ZaloView m125988d2 = m125988d(i12);
        if (m125988d != null && (m125988d instanceof TimelineView)) {
            ((TimelineView) m125988d).m85376BQ(true);
        } else if (m125988d2 != null && (m125988d2 instanceof TimelineView)) {
            ((TimelineView) m125988d2).m85376BQ(false);
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6876k
    /* renamed from: a */
    public void mo35328a(int i11, int i12) {
        Animator animator;
        Animator animator2 = this.f116472d;
        if (animator2 != null) {
            animator2.cancel();
            this.f116472d = null;
        }
        String str = i11 + "-" + i12;
        if (i11 != i12) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("prepareForNextTabChange: animatorKey= ");
            sb2.append(this.f116474f);
            sb2.append(", newAnimatorKey= ");
            sb2.append(str);
            if (!str.equals(this.f116474f) && (animator = this.f116473e) != null) {
                animator.cancel();
                this.f116473e = null;
            }
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6876k
    /* renamed from: b */
    public boolean mo35329b(int i11, View view, int i12, View view2, Runnable runnable) {
        if (view != null) {
            this.f116474f = i11 + "-" + i12;
            CustomMainTab customMainTab = this.f116471c;
            if (customMainTab != null) {
                Animator m68754l = customMainTab.m68754l(i11, i12);
                this.f116473e = m68754l;
                if (m68754l != null) {
                    m68754l.setDuration(150L);
                    this.f116473e.start();
                }
            }
            Animator animator = this.f116472d;
            if (animator != null) {
                animator.cancel();
                this.f116472d = null;
            }
            if (f116468g) {
                view.setLayerType(2, null);
                if (view2 != null) {
                    view2.setLayerType(2, null);
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f));
            if (view2 != null) {
                view2.setTranslationX(view.getLeft() - view2.getLeft());
                arrayList.add(ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f));
            }
            m125987c(i11, i12);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new a(view, view2, runnable, i11));
            animatorSet.setDuration(150L);
            animatorSet.start();
            this.f116472d = animatorSet;
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public ZaloView m125988d(int i11) {
        C24105t0 c24105t0 = this.f116470b;
        if (c24105t0 != null && i11 >= 0 && i11 < c24105t0.mo35335g()) {
            return this.f116470b.m93128x(i11);
        }
        return null;
    }
}
