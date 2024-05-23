package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC7409c0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23222t7;
import me0.C23212s8;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public class MultiSelectMenuBottomView extends LinearLayout {

    /* renamed from: p */
    private final InterfaceC24854k f83255p;

    /* renamed from: q */
    private final InterfaceC24854k f83256q;

    /* renamed from: r */
    private int f83257r;

    /* renamed from: com.zing.zalo.uicontrol.MultiSelectMenuBottomView$a */
    /* loaded from: classes4.dex */
    static final class C16469a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f83258q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16469a(Context context) {
            super(0);
            this.f83258q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(C23212s8.m119607o(this.f83258q, AbstractC2807a.text_disabled));
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.MultiSelectMenuBottomView$b */
    /* loaded from: classes4.dex */
    static final class C16470b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f83259q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16470b(Context context) {
            super(0);
            this.f83259q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(C23212s8.m119607o(this.f83259q, AbstractC2807a.text_primary));
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.MultiSelectMenuBottomView$c */
    /* loaded from: classes4.dex */
    public static final class AnimationAnimationListenerC16471c implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ Animation.AnimationListener f83260a;

        /* renamed from: b */
        final /* synthetic */ boolean f83261b;

        /* renamed from: c */
        final /* synthetic */ MultiSelectMenuBottomView f83262c;

        AnimationAnimationListenerC16471c(Animation.AnimationListener animationListener, boolean z11, MultiSelectMenuBottomView multiSelectMenuBottomView) {
            this.f83260a = animationListener;
            this.f83261b = z11;
            this.f83262c = multiSelectMenuBottomView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (!this.f83261b) {
                this.f83262c.setVisibility(8);
            }
            Animation.AnimationListener animationListener = this.f83260a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f83260a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f83260a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    public MultiSelectMenuBottomView(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C16470b(context));
        this.f83255p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C16469a(context));
        this.f83256q = m129210a2;
        this.f83257r = AbstractC23222t7.f112579p0;
    }

    /* renamed from: e */
    public static /* synthetic */ void m87772e(MultiSelectMenuBottomView multiSelectMenuBottomView, boolean z11, boolean z12, Animation.AnimationListener animationListener, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z12 = true;
            }
            if ((i11 & 4) != 0) {
                animationListener = null;
            }
            multiSelectMenuBottomView.m87775d(z11, z12, animationListener);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showHideView");
    }

    private final int getDisableTextColor() {
        return ((Number) this.f83256q.getValue()).intValue();
    }

    private final int getEnableTextColor() {
        return ((Number) this.f83255p.getValue()).intValue();
    }

    /* renamed from: a */
    public final TextView m87773a(int i11, CharSequence charSequence, Drawable drawable) {
        AbstractC19074t.m100208f(charSequence, "text");
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.layout_multi_select_bottom_view_item, (ViewGroup) this, false);
        AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setId(i11);
        textView.setText(charSequence);
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        addView(textView);
        return textView;
    }

    /* renamed from: b */
    public final void m87774b() {
        removeAllViews();
    }

    /* renamed from: c */
    public void mo77422c(boolean z11, TextView textView) {
        int disableTextColor;
        if (z11) {
            disableTextColor = getEnableTextColor();
        } else {
            disableTextColor = getDisableTextColor();
        }
        if (textView != null) {
            textView.setTextColor(disableTextColor);
        }
    }

    /* renamed from: d */
    public final void m87775d(boolean z11, boolean z12, Animation.AnimationListener animationListener) {
        int i11;
        int i12 = 0;
        if (z12) {
            setVisibility(0);
            if (z11) {
                i11 = getContainerHeight();
            } else {
                i11 = 0;
            }
            if (!z11) {
                i12 = getContainerHeight();
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i11, i12);
            translateAnimation.setDuration(200L);
            translateAnimation.setAnimationListener(new AnimationAnimationListenerC16471c(animationListener, z11, this));
            startAnimation(translateAnimation);
            return;
        }
        if (!z11) {
            i12 = 8;
        }
        setVisibility(i12);
    }

    public final int getContainerHeight() {
        if (getHeight() == 0) {
            return this.f83257r;
        }
        return getHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getMinHeight() {
        return this.f83257r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setMinHeight(int i11) {
        this.f83257r = i11;
    }
}
