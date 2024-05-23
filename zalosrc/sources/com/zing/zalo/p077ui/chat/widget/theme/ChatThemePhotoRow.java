package com.zing.zalo.p077ui.chat.widget.theme;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1579n0;
import com.androidquery.util.AbstractC3972e;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.chat.widget.theme.ChatThemePhotoRow;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p056cj.C3538f;
import p354n3.C23528a;
import p379o3.C23999j;
import t60.C26493a;
import t60.C26495c;

/* loaded from: classes5.dex */
public class ChatThemePhotoRow extends LinearLayout {

    /* renamed from: A */
    AnimatorSet f61500A;

    /* renamed from: B */
    Animator f61501B;

    /* renamed from: C */
    AnimatorSet f61502C;

    /* renamed from: D */
    AnimatorSet f61503D;

    /* renamed from: E */
    AnimatorSet f61504E;

    /* renamed from: F */
    ChatThemePhotoRow f61505F;

    /* renamed from: p */
    C23528a f61506p;

    /* renamed from: q */
    AspectRatioImageView f61507q;

    /* renamed from: r */
    AspectRatioImageView f61508r;

    /* renamed from: s */
    AspectRatioImageView f61509s;

    /* renamed from: t */
    AspectRatioImageView f61510t;

    /* renamed from: u */
    AspectRatioImageView f61511u;

    /* renamed from: v */
    View f61512v;

    /* renamed from: w */
    View f61513w;

    /* renamed from: x */
    ImageView f61514x;

    /* renamed from: y */
    InterfaceC11820e f61515y;

    /* renamed from: z */
    public boolean f61516z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.theme.ChatThemePhotoRow$a */
    /* loaded from: classes5.dex */
    public class C11816a extends AnimatorListenerAdapter {
        C11816a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            AnimatorSet animatorSet = ChatThemePhotoRow.this.f61502C;
            if (animatorSet != null && animatorSet.equals(animator)) {
                ChatThemePhotoRow chatThemePhotoRow = ChatThemePhotoRow.this;
                chatThemePhotoRow.f61502C = null;
                chatThemePhotoRow.f61516z = false;
                AbstractC1579n0.m7845W0(chatThemePhotoRow.f61513w, 0.1f);
                AbstractC1579n0.m7847X0(ChatThemePhotoRow.this.f61513w, 0.1f);
                AbstractC1579n0.m7845W0(ChatThemePhotoRow.this.f61514x, 1.0f);
                AbstractC1579n0.m7847X0(ChatThemePhotoRow.this.f61514x, 1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AnimatorSet animatorSet = ChatThemePhotoRow.this.f61503D;
            if (animatorSet != null) {
                animatorSet.start();
                ChatThemePhotoRow chatThemePhotoRow = ChatThemePhotoRow.this;
                chatThemePhotoRow.f61501B = chatThemePhotoRow.f61503D;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.theme.ChatThemePhotoRow$b */
    /* loaded from: classes5.dex */
    public class C11817b extends AnimatorListenerAdapter {
        C11817b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            AnimatorSet animatorSet = ChatThemePhotoRow.this.f61504E;
            if (animatorSet != null && animatorSet.equals(animator)) {
                ChatThemePhotoRow chatThemePhotoRow = ChatThemePhotoRow.this;
                chatThemePhotoRow.f61504E = null;
                chatThemePhotoRow.f61516z = false;
                AbstractC1579n0.m7845W0(chatThemePhotoRow.f61513w, 0.1f);
                AbstractC1579n0.m7847X0(ChatThemePhotoRow.this.f61513w, 0.1f);
                AbstractC1579n0.m7845W0(ChatThemePhotoRow.this.f61514x, 1.0f);
                AbstractC1579n0.m7847X0(ChatThemePhotoRow.this.f61514x, 1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ChatThemePhotoRow chatThemePhotoRow = ChatThemePhotoRow.this;
            if (chatThemePhotoRow.f61516z) {
                chatThemePhotoRow.m65714g(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.theme.ChatThemePhotoRow$c */
    /* loaded from: classes5.dex */
    public class C11818c extends AnimatorListenerAdapter {
        C11818c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            AnimatorSet animatorSet = ChatThemePhotoRow.this.f61503D;
            if (animatorSet != null && animatorSet.equals(animator)) {
                ChatThemePhotoRow chatThemePhotoRow = ChatThemePhotoRow.this;
                chatThemePhotoRow.f61503D = null;
                chatThemePhotoRow.f61516z = false;
                AbstractC1579n0.m7845W0(chatThemePhotoRow.f61513w, 0.1f);
                AbstractC1579n0.m7847X0(ChatThemePhotoRow.this.f61513w, 0.1f);
                AbstractC1579n0.m7845W0(ChatThemePhotoRow.this.f61514x, 1.0f);
                AbstractC1579n0.m7847X0(ChatThemePhotoRow.this.f61514x, 1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AnimatorSet animatorSet = ChatThemePhotoRow.this.f61504E;
            if (animatorSet != null) {
                animatorSet.start();
                ChatThemePhotoRow chatThemePhotoRow = ChatThemePhotoRow.this;
                chatThemePhotoRow.f61501B = chatThemePhotoRow.f61504E;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.theme.ChatThemePhotoRow$d */
    /* loaded from: classes5.dex */
    public class C11819d extends AnimatorListenerAdapter {
        C11819d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            AnimatorSet animatorSet = ChatThemePhotoRow.this.f61500A;
            if (animatorSet != null && animatorSet.equals(animator)) {
                ChatThemePhotoRow chatThemePhotoRow = ChatThemePhotoRow.this;
                chatThemePhotoRow.f61500A = null;
                chatThemePhotoRow.f61516z = false;
                AbstractC1579n0.m7845W0(chatThemePhotoRow.f61513w, 0.1f);
                AbstractC1579n0.m7847X0(ChatThemePhotoRow.this.f61513w, 0.1f);
                AbstractC1579n0.m7845W0(ChatThemePhotoRow.this.f61514x, 1.0f);
                AbstractC1579n0.m7847X0(ChatThemePhotoRow.this.f61514x, 1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ChatThemePhotoRow chatThemePhotoRow = ChatThemePhotoRow.this;
            chatThemePhotoRow.f61500A = null;
            AnimatorSet animatorSet = chatThemePhotoRow.f61502C;
            if (animatorSet != null) {
                animatorSet.start();
                ChatThemePhotoRow chatThemePhotoRow2 = ChatThemePhotoRow.this;
                chatThemePhotoRow2.f61501B = chatThemePhotoRow2.f61502C;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.theme.ChatThemePhotoRow$e */
    /* loaded from: classes5.dex */
    public interface InterfaceC11820e {
        /* renamed from: a */
        void mo65715a(View view, C3538f c3538f);
    }

    public ChatThemePhotoRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61516z = false;
        this.f61505F = this;
    }

    /* renamed from: b */
    private void m65709b(AspectRatioImageView aspectRatioImageView, View view, final C3538f c3538f, C3538f c3538f2, C3538f c3538f3, boolean z11) {
        try {
            if (c3538f != null) {
                view.setVisibility(0);
                AbstractC3972e.m18781f0(aspectRatioImageView);
                aspectRatioImageView.mDrawStroke = false;
                aspectRatioImageView.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.SecondaryBackgroundColor));
                if (c3538f.f14925a.equals("-1")) {
                    this.f61514x.setVisibility(0);
                } else if (c3538f.f14925a.equals("0")) {
                    aspectRatioImageView.setImageDrawable(getContext().getDrawable(AbstractC16803z.ic_thumb_theme_default));
                } else if (C23999j.m125696L2(c3538f.f14928d, C23278z2.m120126f0()) || !z11) {
                    ((C23528a) this.f61506p.m123612r(aspectRatioImageView)).m123619y(c3538f.f14928d, C23278z2.m120126f0(), 10);
                    if (!z11) {
                        C26495c.m136473c().m136474d(c3538f, this.f61506p);
                    }
                }
                if (c3538f2 != null && c3538f2.f14925a.equals(c3538f.f14925a)) {
                    if (!TextUtils.isEmpty(c3538f2.f14927c)) {
                        if (c3538f2.f14927c.equals(c3538f.f14927c)) {
                            aspectRatioImageView.mDrawStroke = true;
                        }
                    } else {
                        aspectRatioImageView.mDrawStroke = true;
                    }
                }
                if (c3538f3 != null) {
                    aspectRatioImageView.setShowLoading(c3538f.f14925a.equals(c3538f3.f14925a));
                } else {
                    aspectRatioImageView.setShowLoading(false);
                }
                aspectRatioImageView.setOnClickListener(new View.OnClickListener() { // from class: t60.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ChatThemePhotoRow.this.m65710e(c3538f, view2);
                    }
                });
                return;
            }
            view.setVisibility(4);
            aspectRatioImageView.setOnClickListener(null);
            aspectRatioImageView.setOnLongClickListener(null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m65710e(C3538f c3538f, View view) {
        InterfaceC11820e interfaceC11820e = this.f61515y;
        if (interfaceC11820e != null) {
            interfaceC11820e.mo65715a(view, c3538f);
        }
    }

    /* renamed from: c */
    void m65711c(AspectRatioImageView aspectRatioImageView) {
        aspectRatioImageView.setScaleOption(1);
        aspectRatioImageView.setStrokeColor(C23212s8.m119607o(getContext(), AbstractC16781w.AppPrimaryColor));
        aspectRatioImageView.setStrokeWidth(AbstractC23136l9.m118742r(4.0f));
    }

    /* renamed from: d */
    public void m65712d(Context context) {
        this.f61506p = new C23528a(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.chat_theme_photo_content, this);
        this.f61507q = (AspectRatioImageView) this.f61505F.findViewById(AbstractC6918a0.image_left);
        this.f61509s = (AspectRatioImageView) this.f61505F.findViewById(AbstractC6918a0.image_center);
        this.f61511u = (AspectRatioImageView) this.f61505F.findViewById(AbstractC6918a0.image_right);
        this.f61508r = (AspectRatioImageView) this.f61505F.findViewById(AbstractC6918a0.image_left_center);
        this.f61510t = (AspectRatioImageView) this.f61505F.findViewById(AbstractC6918a0.image_right_center);
        this.f61512v = this.f61505F.findViewById(AbstractC6918a0.layout_imv_left);
        this.f61513w = this.f61505F.findViewById(AbstractC6918a0.circle_view);
        this.f61514x = (ImageView) this.f61505F.findViewById(AbstractC6918a0.ic_camera_left);
        AbstractC1579n0.m7845W0(this.f61513w, 0.1f);
        AbstractC1579n0.m7847X0(this.f61513w, 0.1f);
        setOrientation(0);
        m65711c(this.f61507q);
        m65711c(this.f61508r);
        m65711c(this.f61509s);
        m65711c(this.f61510t);
        m65711c(this.f61511u);
    }

    /* renamed from: f */
    public void m65713f(C26493a c26493a, C3538f c3538f, C3538f c3538f2, int i11, boolean z11) {
        int i12;
        if (c26493a == null) {
            return;
        }
        ImageView imageView = this.f61514x;
        int i13 = 8;
        if (i11 == 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        View view = this.f61513w;
        if (i11 == 0) {
            i13 = 0;
        }
        view.setVisibility(i13);
        C3538f m136466c = c26493a.m136466c();
        C3538f m136468e = c26493a.m136468e();
        C3538f m136465b = c26493a.m136465b();
        C3538f m136467d = c26493a.m136467d();
        C3538f m136469f = c26493a.m136469f();
        m65709b(this.f61507q, this.f61512v, m136466c, c3538f, c3538f2, z11);
        AspectRatioImageView aspectRatioImageView = this.f61509s;
        m65709b(aspectRatioImageView, aspectRatioImageView, m136465b, c3538f, c3538f2, z11);
        AspectRatioImageView aspectRatioImageView2 = this.f61511u;
        m65709b(aspectRatioImageView2, aspectRatioImageView2, m136468e, c3538f, c3538f2, z11);
        AspectRatioImageView aspectRatioImageView3 = this.f61508r;
        m65709b(aspectRatioImageView3, aspectRatioImageView3, m136467d, c3538f, c3538f2, z11);
        AspectRatioImageView aspectRatioImageView4 = this.f61510t;
        m65709b(aspectRatioImageView4, aspectRatioImageView4, m136469f, c3538f, c3538f2, z11);
    }

    /* renamed from: g */
    public void m65714g(boolean z11) {
        if (this.f61500A != null) {
            return;
        }
        if (z11) {
            AbstractC1579n0.m7845W0(this.f61513w, 0.1f);
            AbstractC1579n0.m7847X0(this.f61513w, 0.1f);
            AbstractC1579n0.m7845W0(this.f61514x, 1.0f);
            AbstractC1579n0.m7847X0(this.f61514x, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f61500A = animatorSet;
            animatorSet.play(ObjectAnimator.ofFloat(this.f61513w, "scaleX", 0.1f, 1.5f)).with(ObjectAnimator.ofFloat(this.f61513w, "scaleY", 0.1f, 1.5f));
            this.f61500A.setInterpolator(new DecelerateInterpolator());
            this.f61500A.setDuration(400L);
            this.f61500A.setStartDelay(600L);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f61502C = animatorSet2;
        animatorSet2.play(ObjectAnimator.ofFloat(this.f61514x, "scaleX", 1.0f, 0.9f)).with(ObjectAnimator.ofFloat(this.f61514x, "scaleY", 1.0f, 0.9f));
        this.f61502C.setDuration(200L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f61503D = animatorSet3;
        animatorSet3.play(ObjectAnimator.ofFloat(this.f61514x, "scaleX", 0.9f, 1.1f)).with(ObjectAnimator.ofFloat(this.f61514x, "scaleY", 0.9f, 1.1f));
        this.f61503D.setInterpolator(new OvershootInterpolator());
        this.f61503D.setDuration(200L);
        this.f61502C.addListener(new C11816a());
        if (!z11) {
            this.f61502C.setStartDelay(1000L);
        } else {
            this.f61502C.setStartDelay(400L);
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f61504E = animatorSet4;
        animatorSet4.play(ObjectAnimator.ofFloat(this.f61514x, "scaleX", 1.1f, 1.0f)).with(ObjectAnimator.ofFloat(this.f61514x, "scaleY", 1.1f, 1.0f));
        this.f61504E.setDuration(200L);
        this.f61504E.addListener(new C11817b());
        this.f61503D.addListener(new C11818c());
        AnimatorSet animatorSet5 = this.f61500A;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new C11819d());
            this.f61500A.start();
        } else {
            AnimatorSet animatorSet6 = this.f61502C;
            if (animatorSet6 != null) {
                animatorSet6.start();
                this.f61501B = this.f61502C;
            }
        }
        this.f61516z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f61501B;
        if (animator != null) {
            animator.cancel();
            this.f61501B = null;
        }
        AnimatorSet animatorSet = this.f61500A;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f61500A = null;
        }
        AnimatorSet animatorSet2 = this.f61502C;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.f61502C = null;
        }
        AnimatorSet animatorSet3 = this.f61503D;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.f61503D = null;
        }
        AnimatorSet animatorSet4 = this.f61504E;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
            this.f61504E = null;
        }
        this.f61516z = false;
        AbstractC1579n0.m7845W0(this.f61513w, 0.1f);
        AbstractC1579n0.m7847X0(this.f61513w, 0.1f);
        AbstractC1579n0.m7845W0(this.f61514x, 1.0f);
        AbstractC1579n0.m7847X0(this.f61514x, 1.0f);
    }

    public void setOnThemeRowClickListener(InterfaceC11820e interfaceC11820e) {
        this.f61515y = interfaceC11820e;
    }
}
