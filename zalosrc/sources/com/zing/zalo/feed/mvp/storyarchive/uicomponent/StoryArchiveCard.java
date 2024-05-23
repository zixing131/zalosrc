package com.zing.zalo.feed.mvp.storyarchive.uicomponent;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.feed.mvp.storyarchive.uicomponent.StoryArchiveCard;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gr.C19589a;
import l30.AbstractC22055v0;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C24003n;
import p500s1.C26086a;
import p716zh.C31903ea;
import p716zh.C32123ta;

/* loaded from: classes4.dex */
public final class StoryArchiveCard extends ModulesView {
    public static final C8764a Companion = new C8764a(null);

    /* renamed from: S */
    private static final int f47025S = AbstractC23136l9.m118655I(AbstractC16802y.story_archive_card_height);

    /* renamed from: K */
    private final boolean f47026K;

    /* renamed from: L */
    private C22122a0 f47027L;

    /* renamed from: M */
    private C22126c0 f47028M;

    /* renamed from: N */
    private C16719g f47029N;

    /* renamed from: O */
    private C16719g f47030O;

    /* renamed from: P */
    private C22126c0 f47031P;

    /* renamed from: Q */
    private final C23528a f47032Q;

    /* renamed from: R */
    private boolean f47033R;

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.uicomponent.StoryArchiveCard$a */
    /* loaded from: classes4.dex */
    public static final class C8764a {
        private C8764a() {
        }

        public /* synthetic */ C8764a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.uicomponent.StoryArchiveCard$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8765b {
        /* renamed from: a */
        void mo46918a(int i11);
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.uicomponent.StoryArchiveCard$c */
    /* loaded from: classes4.dex */
    public static final class C8766c extends AnimatorListenerAdapter {

        /* renamed from: q */
        final /* synthetic */ Animator.AnimatorListener f47035q;

        C8766c(Animator.AnimatorListener animatorListener) {
            this.f47035q = animatorListener;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            StoryArchiveCard.this.f47033R = false;
            C16719g c16719g = StoryArchiveCard.this.f47030O;
            if (c16719g != null) {
                c16719g.mo89158x0(1.0f);
            }
            Animator.AnimatorListener animatorListener = this.f47035q;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.uicomponent.StoryArchiveCard$d */
    /* loaded from: classes4.dex */
    public static final class C8767d implements C31903ea.b {

        /* renamed from: a */
        final /* synthetic */ C22122a0 f47036a;

        /* renamed from: b */
        final /* synthetic */ String f47037b;

        C8767d(C22122a0 c22122a0, String str) {
            this.f47036a = c22122a0;
            this.f47037b = str;
        }

        @Override // p716zh.C31903ea.b
        /* renamed from: a */
        public void mo46919a(C3979l c3979l) {
            Object tag = this.f47036a.getTag(AbstractC6918a0.tag_story_thumb);
            if (tag != null && tag.equals(this.f47037b)) {
                this.f47036a.m115386T1(c3979l);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.uicomponent.StoryArchiveCard$e */
    /* loaded from: classes4.dex */
    public static final class C8768e extends C22122a0.d {

        /* renamed from: c */
        final /* synthetic */ C22122a0 f47038c;

        /* renamed from: d */
        final /* synthetic */ String f47039d;

        C8768e(C22122a0 c22122a0, String str) {
            this.f47038c = c22122a0;
            this.f47039d = str;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            Object tag = this.f47038c.getTag(AbstractC6918a0.tag_story_thumb);
            if (tag != null && tag.equals(this.f47039d)) {
                super.mo43943h(str, c22122a0, c3979l, c23995f, z11);
            }
        }
    }

    public StoryArchiveCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47032Q = new C23528a(context);
        m46914f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m46912b0(float f11, float f12, float f13, StoryArchiveCard storyArchiveCard, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(storyArchiveCard, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f14 = ((f12 - f11) * animatedFraction) + f11;
        float f15 = f11 + ((f13 - f11) * animatedFraction);
        C22122a0 c22122a0 = storyArchiveCard.f47027L;
        if (c22122a0 != null) {
            c22122a0.mo89124V0(f14);
        }
        C22122a0 c22122a02 = storyArchiveCard.f47027L;
        if (c22122a02 != null) {
            c22122a02.mo89126W0(f15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m46913d0(InterfaceC8765b interfaceC8765b, int i11, View view) {
        if (interfaceC8765b != null) {
            interfaceC8765b.mo46918a(i11);
        }
    }

    /* renamed from: f0 */
    private final void m46914f0() {
        C22122a0 c22122a0 = new C22122a0(getContext());
        C16718f m89106L = c22122a0.m89106L();
        int i11 = f47025S;
        m89106L.m89028L(-1, i11);
        c22122a0.m111929z1(5);
        mo69681L(c22122a0);
        this.f47027L = c22122a0;
        C16719g c16719g = new C16719g(getContext());
        C16718f m89028L = c16719g.m89106L().m89028L(-1, AbstractC23222t7.f112553c0);
        Boolean bool = Boolean.TRUE;
        m89028L.m89072y(bool);
        c16719g.m89087B0(AbstractC16803z.story_card_bottom_gradient_bg);
        c16719g.mo89158x0(0.7f);
        mo69681L(c16719g);
        this.f47029N = c16719g;
        C22126c0 c22126c0 = new C22126c0(getContext());
        C16718f m89073z = c22126c0.m89106L().m89028L(-2, -2).m89072y(bool).m89073z(bool);
        int i12 = AbstractC23222t7.f112556e;
        m89073z.m89032P(i12, 0, 0, i12).m89042Z(AbstractC23222t7.f112566j, AbstractC23222t7.f112552c, AbstractC23222t7.f112566j, AbstractC23222t7.f112552c);
        c22126c0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f1s));
        c22126c0.m111962J1(AbstractC23136l9.m118641B(c22126c0.getContext(), AbstractC16801x.white));
        c22126c0.m89087B0(AbstractC16803z.story_card_tv_bg);
        mo69681L(c22126c0);
        this.f47028M = c22126c0;
        C16719g c16719g2 = new C16719g(getContext());
        c16719g2.m89106L().m89028L(-1, i11);
        c16719g2.m89087B0(AbstractC16803z.bg_highlight_story_item_archive);
        c16719g2.mo89158x0(0.0f);
        mo69681L(c16719g2);
        this.f47030O = c16719g2;
        if (this.f47026K) {
            C22126c0 c22126c02 = new C22126c0(getContext());
            c22126c02.m89106L().m89028L(-2, -2).m89025I(true);
            c22126c02.m111962J1(AbstractC23136l9.m118641B(c22126c02.getContext(), AbstractC16801x.white));
            mo69681L(c22126c02);
            this.f47031P = c22126c02;
        }
    }

    /* renamed from: a0 */
    public final void m46915a0(Animator.AnimatorListener animatorListener) {
        if (this.f47033R) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setRepeatCount(1);
        ofFloat.setRepeatMode(2);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new C26086a());
        final float f11 = 1.0f;
        final float f12 = 0.9f;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hr.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StoryArchiveCard.m46912b0(f11, f12, f12, this, valueAnimator);
            }
        });
        ofFloat.addListener(new C8766c(animatorListener));
        this.f47033R = true;
        ofFloat.start();
    }

    /* renamed from: c0 */
    public final void m46916c0(C19589a c19589a, final int i11, final InterfaceC8765b interfaceC8765b) {
        if (c19589a != null) {
            C22122a0 c22122a0 = this.f47027L;
            if (c22122a0 != null) {
                C32123ta m102543h = c19589a.m102543h();
                if (m102543h.m155070J()) {
                    String m155066C = m102543h.m155066C();
                    c22122a0.setTag(AbstractC6918a0.tag_story_thumb, m155066C);
                    int m117926v = AbstractC23006a0.m117926v();
                    float m115160t = AbstractC22055v0.m115160t(c22122a0);
                    Context context = getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    C24003n m120133j = C23278z2.m120133j(context, m117926v, m115160t);
                    C31903ea c31903ea = C31903ea.f146582a;
                    String str = m102543h.f148115R;
                    AbstractC19074t.m100207e(str, "caption");
                    C3979l m153340e = c31903ea.m153340e(str, m102543h.f148116S, 3, m120133j);
                    if (m153340e != null) {
                        c22122a0.m115386T1(m153340e);
                    } else {
                        c22122a0.mo111925v1(m120133j.f116261b);
                        String str2 = m102543h.f148115R;
                        AbstractC19074t.m100207e(str2, "caption");
                        c31903ea.m153346k(str2, m102543h.f148116S, m102543h.f148117T, m120133j, 3, new C8767d(c22122a0, m155066C));
                    }
                } else {
                    String str3 = m102543h.f148146l;
                    c22122a0.setTag(AbstractC6918a0.tag_story_thumb, str3);
                    c22122a0.m115381O1(this.f47032Q, m102543h.f148146l, C23278z2.m120106Y(), new C8768e(c22122a0, str3));
                }
            }
            C22126c0 c22126c0 = this.f47028M;
            if (c22126c0 != null) {
                if (c19589a.m102542g()) {
                    SpannableString spannableString = new SpannableString(c19589a.m102536a());
                    if (c19589a.m102540e().length() > 0) {
                        spannableString.setSpan(new AbsoluteSizeSpan(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0)), 0, spannableString.length(), 18);
                        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
                    } else {
                        spannableString.setSpan(new AbsoluteSizeSpan(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0)), 0, spannableString.length(), 18);
                    }
                    SpannableString spannableString2 = new SpannableString(c19589a.m102540e());
                    spannableString2.setSpan(new AbsoluteSizeSpan(AbstractC23136l9.m118655I(AbstractC16802y.f1s)), 0, spannableString2.length(), 18);
                    c22126c0.m111959G1(TextUtils.concat(spannableString, spannableString2));
                    c22126c0.mo44614b1(0);
                    C16719g c16719g = this.f47029N;
                    if (c16719g != null) {
                        c16719g.mo44614b1(0);
                    }
                } else {
                    c22126c0.mo44614b1(8);
                    C16719g c16719g2 = this.f47029N;
                    if (c16719g2 != null) {
                        c16719g2.mo44614b1(8);
                    }
                }
            }
            C22126c0 c22126c02 = this.f47031P;
            if (c22126c02 != null) {
                c22126c02.m111959G1(c19589a.m102543h().f148138h);
            }
            setOnClickListener(new View.OnClickListener() { // from class: hr.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoryArchiveCard.m46913d0(StoryArchiveCard.InterfaceC8765b.this, i11, view);
                }
            });
        }
    }

    /* renamed from: e0 */
    public final void m46917e0() {
        Float f11;
        C16719g c16719g;
        C16719g c16719g2 = this.f47030O;
        if (c16719g2 != null) {
            f11 = Float.valueOf(c16719g2.m89092E());
        } else {
            f11 = null;
        }
        if (!AbstractC19074t.m100203a(f11, 0.0f) && (c16719g = this.f47030O) != null) {
            c16719g.mo89158x0(0.0f);
        }
    }
}
