package com.zing.zalo.uicontrol;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.BaseStoryItemView;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p361nb.AbstractC23647d;
import p649xl.C29841hd;
import p716zh.C31980jc;
import p716zh.C32123ta;

/* loaded from: classes4.dex */
public final class StoryOAItemView extends BaseStoryItemView {

    /* renamed from: y0 */
    private C29841hd f83526y0;

    /* renamed from: com.zing.zalo.uicontrol.StoryOAItemView$a */
    /* loaded from: classes4.dex */
    public static final class C16524a extends AnimatorListenerAdapter {
        C16524a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            StoryOAItemView.this.f83104R.setAlpha(0.0f);
            StoryOAItemView.this.f83104R.setVisibility(8);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryOAItemView$b */
    /* loaded from: classes4.dex */
    public static final class C16525b extends AnimatorListenerAdapter {
        C16525b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            if (AbstractC19074t.m100204b(StoryOAItemView.this.f83107U, animator)) {
                ZaloView zaloView = StoryOAItemView.this.f83115f0;
                if (zaloView != null && !zaloView.mo60294yp()) {
                    zaloView.finish();
                }
                StoryOAItemView.this.f83115f0 = null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryOAItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m88128f0(StoryOAItemView storyOAItemView, ViewStub viewStub, View view) {
        AbstractC19074t.m100208f(storyOAItemView, "this$0");
        C29841hd m148045a = C29841hd.m148045a(view);
        AbstractC19074t.m100207e(m148045a, "bind(...)");
        storyOAItemView.f83526y0 = m148045a;
    }

    /* renamed from: g0 */
    private final void m88129g0(boolean z11, boolean z12) {
        AnimatorSet animatorSet = this.f83107U;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f83107U.cancel();
        }
        this.f83126p0 = false;
        if (z11) {
            if (z12) {
                m87705d0(true, new C16524a());
            } else {
                this.f83105S.setVisibility(0);
                this.f83105S.setTranslationY(0.0f);
            }
            BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
            if (interfaceC16456f != null) {
                interfaceC16456f.mo84774i(this, 2);
                return;
            }
            return;
        }
        if (this.f83105S.getVisibility() == 0) {
            if (z12) {
                m87705d0(false, new C16525b());
            } else {
                this.f83105S.setVisibility(8);
                this.f83105S.setTranslationY(this.f83106T);
                this.f83104R.setAlpha(0.0f);
                this.f83104R.setVisibility(8);
                ZaloView zaloView = this.f83115f0;
                if (zaloView != null && !zaloView.mo60294yp()) {
                    zaloView.finish();
                }
                this.f83115f0 = null;
            }
            BaseStoryItemView.InterfaceC16456f interfaceC16456f2 = this.f83140w0;
            if (interfaceC16456f2 != null) {
                interfaceC16456f2.mo84774i(this, 0);
            }
        }
        BaseStoryItemView.InterfaceC16456f interfaceC16456f3 = this.f83140w0;
        if (interfaceC16456f3 != null) {
            interfaceC16456f3.mo84790y(false);
        }
        BaseStoryItemView.InterfaceC16456f interfaceC16456f4 = this.f83140w0;
        if (interfaceC16456f4 != null) {
            interfaceC16456f4.mo84762J(false);
        }
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: N */
    public boolean mo87689N() {
        C29841hd c29841hd = this.f83526y0;
        C32123ta c32123ta = null;
        if (c29841hd == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29841hd = null;
        }
        if (c29841hd.getRoot().isShown()) {
            BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
            if (interfaceC16456f != null) {
                C31980jc c31980jc = this.f83110a0;
                if (c31980jc != null) {
                    c32123ta = c31980jc.m153825r();
                }
                this.f83115f0 = interfaceC16456f.mo84758F(c32123ta, this.f83110a0, this);
                m88129g0(true, true);
                AbstractC23647d.m123897g("49153111");
            }
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: O */
    public void mo87690O() {
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: P */
    public void mo87691P(boolean z11) {
        m88129g0(false, z11);
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: Q */
    public void mo87692Q() {
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: R */
    public void mo87693R() {
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: S */
    public boolean mo87694S() {
        FrameLayout frameLayout = this.f83105S;
        if (frameLayout == null || frameLayout.getParent() == null || this.f83105S.getVisibility() != 0) {
            return false;
        }
        m88129g0(false, true);
        BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null) {
            interfaceC16456f.mo84754B();
        }
        return true;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: T */
    public boolean mo87695T() {
        FrameLayout frameLayout = this.f83105S;
        if (frameLayout != null && frameLayout.getParent() != null && this.f83105S.getVisibility() == 0) {
            m88129g0(true, true);
            AbstractC23647d.m123897g("49153112");
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: U */
    public void mo87696U(int i11) {
        float f11;
        C29841hd c29841hd = this.f83526y0;
        ZaloView zaloView = null;
        C32123ta c32123ta = null;
        if (c29841hd == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29841hd = null;
        }
        if (c29841hd.getRoot().getVisibility() == 0) {
            FrameLayout frameLayout = this.f83105S;
            if (frameLayout != null) {
                f11 = frameLayout.getTranslationY();
            } else {
                f11 = this.f83106T;
            }
            float f12 = this.f83106T;
            float f13 = i11 + f12;
            if (i11 > 0) {
                if (f11 >= f12) {
                    f13 = f12;
                }
            } else if (i11 < 0 && f13 <= 0.0f) {
                f13 = 0.0f;
            }
            float f14 = 1.0f - (f13 / f12);
            View view = this.f83104R;
            if (view != null) {
                if (view.getVisibility() != 0) {
                    this.f83104R.setVisibility(0);
                }
                this.f83104R.setAlpha(f14);
            }
            FrameLayout frameLayout2 = this.f83105S;
            if (frameLayout2 != null) {
                if (frameLayout2.getVisibility() != 0) {
                    BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
                    if (interfaceC16456f != null) {
                        C31980jc c31980jc = this.f83110a0;
                        if (c31980jc != null) {
                            c32123ta = c31980jc.m153825r();
                        }
                        zaloView = interfaceC16456f.mo84758F(c32123ta, this.f83110a0, this);
                    }
                    this.f83115f0 = zaloView;
                    this.f83105S.setVisibility(0);
                }
                this.f83105S.setTranslationY(f13);
                BaseStoryItemView.InterfaceC16456f interfaceC16456f2 = this.f83140w0;
                if (interfaceC16456f2 != null) {
                    interfaceC16456f2.mo84774i(this, 1);
                }
            }
        }
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: V */
    public void mo87697V() {
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: W */
    public void mo87698W(boolean z11) {
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: X */
    public void mo87699X(C32123ta c32123ta) {
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    public String getStoryMessageToSend() {
        return "";
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: q */
    public void mo87709q(C31980jc c31980jc) {
        super.mo87709q(c31980jc);
        C29841hd c29841hd = this.f83526y0;
        if (c29841hd == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29841hd = null;
        }
        AbstractC23136l9.m118744r1(c29841hd.getRoot(), 0);
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: r */
    public void mo87710r(C32123ta c32123ta) {
        super.mo87710r(c32123ta);
        setBottomBarVisibility(0);
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    public void setBottomBarVisibility(int i11) {
        C32123ta c32123ta;
        String str;
        C31980jc c31980jc = this.f83110a0;
        if (c31980jc != null) {
            c32123ta = c31980jc.m153825r();
        } else {
            c32123ta = null;
        }
        if (c32123ta == null || (str = c32123ta.f148158x) == null || str.length() == 0 || c32123ta.f148159y == 0) {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(this.f83103Q, i11);
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: x */
    protected void mo87715x() {
        ViewStub viewStub = (ViewStub) findViewById(AbstractC6918a0.stub_story_item_view_bottom_layout);
        if (viewStub != null) {
            viewStub.setLayoutResource(AbstractC7409c0.story_oa_bottom_layout);
            viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: com.zing.zalo.uicontrol.d2
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub2, View view) {
                    StoryOAItemView.m88128f0(StoryOAItemView.this, viewStub2, view);
                }
            });
            this.f83103Q = viewStub.inflate();
        }
        if (this.f83526y0 == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
        }
        RobotoTextView robotoTextView = this.f83139w;
        if (robotoTextView != null) {
            robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_see_more));
        }
    }
}
