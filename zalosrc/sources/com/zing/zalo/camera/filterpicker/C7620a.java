package com.zing.zalo.camera.filterpicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.camera.filterpicker.C7620a;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p500s1.C26087b;
import p642xe.C29605a;
import p649xl.C29706a4;
import tg.C26674y;

/* renamed from: com.zing.zalo.camera.filterpicker.a */
/* loaded from: classes3.dex */
public final class C7620a extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final C23528a f41226r;

    /* renamed from: s */
    private final a f41227s;

    /* renamed from: t */
    private final List f41228t;

    /* renamed from: u */
    private final Map f41229u;

    /* renamed from: v */
    private boolean f41230v;

    /* renamed from: w */
    private AnimatorSet f41231w;

    /* renamed from: x */
    private AnimatorSet f41232x;

    /* renamed from: y */
    private boolean f41233y;

    /* renamed from: com.zing.zalo.camera.filterpicker.a$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        boolean mo39292a(C29605a c29605a);

        /* renamed from: b */
        boolean mo39293b(C29605a c29605a);

        /* renamed from: c */
        void mo39294c(C29605a c29605a);
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private C29706a4 f41234I;

        /* renamed from: com.zing.zalo.camera.filterpicker.a$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m39315a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C29706a4 m147712c = C29706a4.m147712c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m147712c, "inflate(...)");
                return new b(m147712c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C29706a4 c29706a4) {
            super(c29706a4.getRoot());
            AbstractC19074t.m100208f(c29706a4, "binding");
            this.f41234I = c29706a4;
        }

        /* renamed from: i0 */
        public final C29706a4 m39314i0() {
            return this.f41234I;
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.a$c */
    /* loaded from: classes3.dex */
    public static final class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            C7620a.this.f41232x = null;
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: q */
        final /* synthetic */ b f41237q;

        d(b bVar) {
            this.f41237q = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            C7620a.this.f41231w = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            this.f41237q.m39314i0().f137200t.setVisibility(8);
        }
    }

    /* renamed from: com.zing.zalo.camera.filterpicker.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            C7620a.this.f41231w = null;
        }
    }

    public C7620a(C23528a c23528a, a aVar) {
        AbstractC19074t.m100208f(c23528a, "aq");
        AbstractC19074t.m100208f(aVar, "callback");
        this.f41228t = new ArrayList();
        this.f41229u = new LinkedHashMap();
        this.f41226r = c23528a;
        this.f41227s = aVar;
        m9999J(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m39302T(C7620a c7620a, C29605a c29605a, View view) {
        AbstractC19074t.m100208f(c7620a, "this$0");
        AbstractC19074t.m100208f(c29605a, "$filter");
        try {
            c7620a.f41227s.mo39292a(c29605a);
            c7620a.m10008p();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: O */
    public final void m39303O(C29605a c29605a) {
        C29605a c29605a2;
        if (c29605a == null) {
            c29605a2 = (C29605a) this.f41228t.get(0);
        } else {
            if (AbstractC19074t.m100204b(c29605a, this.f41228t.get(r1.size() - 1))) {
                c29605a2 = (C29605a) this.f41228t.get(0);
            } else {
                c29605a2 = (C29605a) this.f41228t.get(this.f41228t.indexOf(c29605a) + 1);
            }
        }
        this.f41227s.mo39294c(c29605a2);
        m10008p();
    }

    /* renamed from: P */
    public final void m39304P(C29605a c29605a) {
        C29605a c29605a2;
        if (c29605a == null) {
            c29605a2 = (C29605a) this.f41228t.get(r3.size() - 1);
        } else if (AbstractC19074t.m100204b(c29605a, this.f41228t.get(0))) {
            c29605a2 = (C29605a) this.f41228t.get(r3.size() - 1);
        } else {
            c29605a2 = (C29605a) this.f41228t.get(this.f41228t.indexOf(c29605a) - 1);
        }
        this.f41227s.mo39294c(c29605a2);
        m10008p();
    }

    /* renamed from: Q */
    public final List m39305Q() {
        return this.f41228t;
    }

    /* renamed from: R */
    public final Map m39306R() {
        return this.f41229u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        boolean z11;
        int i12;
        float f11;
        AbstractC19074t.m100208f(bVar, "holder");
        int m118742r = AbstractC23136l9.m118742r(14.0f);
        int m118742r2 = AbstractC23136l9.m118742r(9.0f);
        int m118742r3 = AbstractC23136l9.m118742r(2.0f);
        ViewGroup.LayoutParams layoutParams = bVar.f7784p.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = m118742r2;
        marginLayoutParams.bottomMargin = m118742r2;
        boolean z12 = true;
        if (i11 == 0) {
            marginLayoutParams.leftMargin = m118742r;
            marginLayoutParams.rightMargin = m118742r3;
        } else if (i11 == this.f41228t.size() - 1) {
            marginLayoutParams.leftMargin = m118742r3;
            marginLayoutParams.rightMargin = m118742r;
        } else {
            marginLayoutParams.leftMargin = m118742r3;
            marginLayoutParams.rightMargin = m118742r3;
        }
        bVar.f7784p.setLayoutParams(marginLayoutParams);
        final C29605a c29605a = (C29605a) this.f41228t.get(i11);
        int m118641B = AbstractC23136l9.m118641B(bVar.f7784p.getContext(), AbstractC16801x.black_332e2e2e);
        bVar.m39314i0().f137198r.setVisibility(0);
        bVar.m39314i0().f137198r.setBackground(AbstractC23136l9.m118665N(bVar.f7784p.getContext(), AbstractC16803z.bg_filter_item_mini_image_view));
        bVar.m39314i0().f137198r.setBorderColor(m118641B);
        if (!this.f41230v) {
            if (this.f41233y) {
                ((C23528a) this.f41226r.m123612r(bVar.m39314i0().f137198r)).m123618x(c29605a.m147132i(), C23278z2.m120140m());
            } else {
                bVar.m39314i0().f137198r.setImageBitmap((Bitmap) this.f41229u.get(Integer.valueOf(i11)));
            }
        } else {
            bVar.m39314i0().f137198r.setImageResource(AbstractC16803z.bg_filter_item_mini_image_view);
        }
        boolean mo39293b = this.f41227s.mo39293b(c29605a);
        boolean m136882x = C26674y.m136865t().m136882x(String.valueOf(c29605a.m147131h()), "anim_filter_camera");
        if (mo39293b && !m136882x) {
            c29605a.m147143t(false);
        }
        boolean m147140q = c29605a.m147140q();
        bVar.m39314i0().f137198r.setBorderColor(m118641B);
        bVar.m39314i0().f137198r.setBorderWidthDP(0.0f);
        if (!this.f41233y && (!(!this.f41229u.isEmpty()) || this.f41229u.get(Integer.valueOf(i11)) == null)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (m136882x || m147140q || !mo39293b || !z11) {
            z12 = false;
        }
        ZAppCompatImageView zAppCompatImageView = bVar.m39314i0().f137201u;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        zAppCompatImageView.setVisibility(i12);
        RoundedImageView roundedImageView = bVar.m39314i0().f137198r;
        if (z12) {
            f11 = 0.6f;
        } else {
            f11 = 1.0f;
        }
        roundedImageView.setAlpha(f11);
        if ((m136882x || !z11) && bVar.m39314i0().f137199s.getVisibility() == 8) {
            bVar.m39314i0().f137199s.setVisibility(0);
        } else if ((!m136882x && z11 && bVar.m39314i0().f137199s.getVisibility() == 0) || (!mo39293b && this.f41233y)) {
            bVar.m39314i0().f137199s.setVisibility(8);
        }
        if (m147140q && bVar.m39314i0().f137200t.getVisibility() == 8) {
            bVar.m39314i0().f137200t.setVisibility(0);
        } else if (!m147140q && bVar.m39314i0().f137200t.getVisibility() == 0) {
            bVar.m39314i0().f137200t.setVisibility(8);
        }
        bVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: we.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7620a.m39302T(C7620a.this, c29605a, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        return b.Companion.m39315a(viewGroup);
    }

    /* renamed from: V */
    public final void m39309V(boolean z11, b bVar) {
        AbstractC19074t.m100208f(bVar, "holder");
        if (z11) {
            AnimatorSet animatorSet = this.f41232x;
            if (animatorSet != null) {
                AbstractC19074t.m100205c(animatorSet);
                if (animatorSet.isRunning()) {
                    AnimatorSet animatorSet2 = this.f41232x;
                    AbstractC19074t.m100205c(animatorSet2);
                    animatorSet2.end();
                }
            }
            bVar.m39314i0().f137200t.setVisibility(8);
            bVar.m39314i0().f137199s.setVisibility(0);
            bVar.m39314i0().f137199s.setAlpha(0.0f);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.play(ObjectAnimator.ofFloat(bVar.m39314i0().f137199s, "alpha", 1.0f));
            animatorSet3.setDuration(200L);
            animatorSet3.setInterpolator(new C26087b());
            animatorSet3.addListener(new c());
            animatorSet3.start();
            this.f41232x = animatorSet3;
            return;
        }
        AnimatorSet animatorSet4 = this.f41231w;
        if (animatorSet4 != null && animatorSet4.isRunning()) {
            animatorSet4.end();
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.play(ObjectAnimator.ofFloat(bVar.m39314i0().f137200t, "alpha", 0.0f));
        animatorSet5.setDuration(200L);
        animatorSet5.setInterpolator(new C26087b());
        animatorSet5.addListener(new d(bVar));
        animatorSet5.start();
        this.f41231w = animatorSet5;
    }

    /* renamed from: W */
    public final void m39310W(boolean z11, b bVar) {
        AbstractC19074t.m100208f(bVar, "holder");
        if (z11) {
            AnimatorSet animatorSet = this.f41231w;
            if (animatorSet != null) {
                AbstractC19074t.m100205c(animatorSet);
                if (animatorSet.isRunning()) {
                    AnimatorSet animatorSet2 = this.f41231w;
                    AbstractC19074t.m100205c(animatorSet2);
                    animatorSet2.end();
                }
            }
            bVar.m39314i0().f137199s.setVisibility(8);
            bVar.m39314i0().f137200t.setVisibility(0);
            bVar.m39314i0().f137200t.setAlpha(0.0f);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.play(ObjectAnimator.ofFloat(bVar.m39314i0().f137200t, "alpha", 1.0f));
            animatorSet3.setDuration(200L);
            animatorSet3.setInterpolator(new C26087b());
            animatorSet3.addListener(new e());
            animatorSet3.start();
            this.f41231w = animatorSet3;
        }
    }

    /* renamed from: X */
    public final void m39311X(List list) {
        AbstractC19074t.m100208f(list, "filterAnims");
        this.f41228t.clear();
        this.f41228t.addAll(list);
        m10008p();
    }

    /* renamed from: Y */
    public final void m39312Y(boolean z11, b bVar) {
        int i11;
        float f11;
        AbstractC19074t.m100208f(bVar, "holder");
        ZAppCompatImageView zAppCompatImageView = bVar.m39314i0().f137201u;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        zAppCompatImageView.setVisibility(i11);
        RoundedImageView roundedImageView = bVar.m39314i0().f137198r;
        if (z11) {
            f11 = 0.6f;
        } else {
            f11 = 1.0f;
        }
        roundedImageView.setAlpha(f11);
    }

    /* renamed from: Z */
    public final void m39313Z(boolean z11) {
        this.f41233y = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f41228t.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        if (i11 < this.f41228t.size()) {
            return ((C29605a) this.f41228t.get(i11)).m147131h();
        }
        return super.mo10004l(i11);
    }
}
