package com.zing.zalo.uicontrol;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StoryReactedOverviewLayout;
import com.zing.zalo.story.p076ui.StoryRecentlyReactedItemView;
import com.zing.zalo.uicomponents.imageview.ActiveImageColorButton;
import com.zing.zalo.uicontrol.BaseStoryItemView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import l30.C22037m0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import o30.C24009b;
import p361nb.AbstractC23647d;
import p401or.C24417g;
import p649xl.C29769dd;
import p649xl.C29931md;
import p716zh.C31844ab;
import p716zh.C31980jc;
import p716zh.C32123ta;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class StoryMineItemView extends BaseStoryItemView {
    public static final C16522a Companion = new C16522a(null);

    /* renamed from: E0 */
    private static final int f83518E0 = AbstractC23222t7.f112566j;

    /* renamed from: F0 */
    private static final int f83519F0 = AbstractC23222t7.f112514B;

    /* renamed from: A0 */
    private C29931md f83520A0;

    /* renamed from: B0 */
    private C29769dd f83521B0;

    /* renamed from: C0 */
    private boolean f83522C0;

    /* renamed from: D0 */
    private AnimatorSet f83523D0;

    /* renamed from: y0 */
    private ActiveImageColorButton f83524y0;

    /* renamed from: z0 */
    private View f83525z0;

    /* renamed from: com.zing.zalo.uicontrol.StoryMineItemView$a */
    /* loaded from: classes4.dex */
    public static final class C16522a {
        private C16522a() {
        }

        public /* synthetic */ C16522a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryMineItemView$b */
    /* loaded from: classes4.dex */
    public static final class C16523b extends AnimatorListenerAdapter {
        C16523b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryMineItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: A0 */
    private final void m88099A0() {
        ViewStub viewStub = (ViewStub) findViewById(AbstractC6918a0.stub_story_item_view_uploading_layout);
        if (viewStub != null) {
            viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: com.zing.zalo.uicontrol.c2
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub2, View view) {
                    StoryMineItemView.m88100B0(StoryMineItemView.this, viewStub2, view);
                }
            });
            viewStub.inflate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public static final void m88100B0(StoryMineItemView storyMineItemView, ViewStub viewStub, View view) {
        AbstractC19074t.m100208f(storyMineItemView, "this$0");
        C29769dd m147865a = C29769dd.m147865a(view);
        AbstractC19074t.m100207e(m147865a, "bind(...)");
        storyMineItemView.f83521B0 = m147865a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public static final void m88101C0(StoryMineItemView storyMineItemView, View view) {
        AbstractC19074t.m100208f(storyMineItemView, "this$0");
        BaseStoryItemView.InterfaceC16456f interfaceC16456f = storyMineItemView.f83140w0;
        if (interfaceC16456f != null) {
            interfaceC16456f.mo84770e();
        }
    }

    /* renamed from: E0 */
    private final void m88102E0(C32123ta c32123ta) {
        try {
            if (getViewMode() != 5 && C22037m0.f108553a.m115034h()) {
                this.f83522C0 = false;
                AnimatorSet animatorSet = this.f83523D0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                int i11 = f83519F0;
                int i12 = f83518E0;
                C29931md c29931md = this.f83520A0;
                if (c29931md == null) {
                    AbstractC19074t.m100223u("stubBottomLayoutBinding");
                    c29931md = null;
                }
                LinearLayout linearLayout = c29931md.f138713s;
                AbstractC19074t.m100207e(linearLayout, "storyRecentlyReactedLayout");
                List m155090z = c32123ta.m155090z();
                AbstractC19074t.m100207e(m155090z, "getNewActivityUsers(...)");
                linearLayout.removeAllViews();
                if (!m155090z.isEmpty()) {
                    AbstractC23136l9.m118744r1(linearLayout, 0);
                    int size = m155090z.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        C31844ab c31844ab = (C31844ab) m155090z.get(i13);
                        if (c31844ab != null) {
                            StoryRecentlyReactedItemView storyRecentlyReactedItemView = new StoryRecentlyReactedItemView(getContext());
                            storyRecentlyReactedItemView.m56595V(c31844ab);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, i11);
                            layoutParams.bottomMargin = i12;
                            if (i13 == m155090z.size() - 1) {
                                layoutParams.bottomMargin = 0;
                            }
                            linearLayout.addView(storyRecentlyReactedItemView, layoutParams);
                        }
                    }
                    ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                    int size2 = ((i11 + i12) * m155090z.size()) - i12;
                    layoutParams2.height = size2;
                    linearLayout.setLayoutParams(layoutParams2);
                    linearLayout.setPadding(0, size2, 0, 0);
                    return;
                }
                AbstractC23136l9.m118744r1(linearLayout, 8);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: o0 */
    private final void m88113o0() {
        List list;
        try {
            if (!this.f83522C0 && getViewMode() != 5 && C22037m0.f108553a.m115034h()) {
                this.f83522C0 = true;
                int i11 = f83519F0;
                int i12 = f83518E0;
                C32123ta c32123ta = this.f83108V;
                if (c32123ta != null) {
                    list = c32123ta.m155090z();
                } else {
                    list = null;
                }
                if (list != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    int size = list.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i13 = size - 1;
                            int i14 = i11 + i12;
                            ValueAnimator ofInt = ValueAnimator.ofInt((size + 1) * i14, i14 * size);
                            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.uicontrol.z1
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    StoryMineItemView.m88114p0(StoryMineItemView.this, valueAnimator);
                                }
                            });
                            ofInt.setStartDelay(500L);
                            AbstractC19074t.m100205c(ofInt);
                            arrayList.add(ofInt);
                            if (i13 < 0) {
                                break;
                            } else {
                                size = i13;
                            }
                        }
                    }
                    animatorSet.playSequentially(arrayList);
                    animatorSet.start();
                    this.f83523D0 = animatorSet;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m88114p0(StoryMineItemView storyMineItemView, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(storyMineItemView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        C29931md c29931md = storyMineItemView.f83520A0;
        if (c29931md == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29931md = null;
        }
        LinearLayout linearLayout = c29931md.f138713s;
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        linearLayout.setPadding(0, ((Integer) animatedValue).intValue(), 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m88115r0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m88116s0(StoryMineItemView storyMineItemView, View view) {
        AbstractC19074t.m100208f(storyMineItemView, "this$0");
        storyMineItemView.m88117t0();
    }

    /* renamed from: t0 */
    private final void m88117t0() {
        if (getViewMode() == 5) {
            BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
            if (interfaceC16456f != null) {
                interfaceC16456f.mo84768c(this.f83108V);
                return;
            }
            return;
        }
        AbstractC23647d.m123897g("49150033");
        BaseStoryItemView.InterfaceC16456f interfaceC16456f2 = this.f83140w0;
        if (interfaceC16456f2 != null) {
            interfaceC16456f2.mo84759G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m88118v0(StoryMineItemView storyMineItemView, ViewStub viewStub, View view) {
        AbstractC19074t.m100208f(storyMineItemView, "this$0");
        C29931md m148259a = C29931md.m148259a(view);
        AbstractC19074t.m100207e(m148259a, "bind(...)");
        storyMineItemView.f83520A0 = m148259a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m88119w0(StoryMineItemView storyMineItemView, View view) {
        AbstractC19074t.m100208f(storyMineItemView, "this$0");
        storyMineItemView.m88123D0(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m88120x0(StoryMineItemView storyMineItemView, View view) {
        AbstractC19074t.m100208f(storyMineItemView, "this$0");
        storyMineItemView.m88123D0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m88121y0(StoryMineItemView storyMineItemView, View view) {
        AbstractC19074t.m100208f(storyMineItemView, "this$0");
        storyMineItemView.m88123D0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m88122z0(StoryMineItemView storyMineItemView, View view) {
        AbstractC19074t.m100208f(storyMineItemView, "this$0");
        storyMineItemView.m88117t0();
    }

    /* renamed from: D0 */
    public final void m88123D0(int i11) {
        C31980jc c31980jc;
        ArrayList arrayList;
        C32123ta c32123ta;
        BaseStoryItemView.InterfaceC16456f interfaceC16456f;
        this.f83126p0 = false;
        BaseStoryItemView.InterfaceC16456f interfaceC16456f2 = this.f83140w0;
        if (interfaceC16456f2 != null) {
            interfaceC16456f2.mo84790y(true);
        }
        BaseStoryItemView.InterfaceC16456f interfaceC16456f3 = this.f83140w0;
        if (interfaceC16456f3 != null) {
            interfaceC16456f3.mo84762J(true);
        }
        BaseStoryItemView.InterfaceC16456f interfaceC16456f4 = this.f83140w0;
        if (interfaceC16456f4 != null) {
            interfaceC16456f4.mo84774i(this, 2);
        }
        BaseStoryItemView.InterfaceC16456f interfaceC16456f5 = this.f83140w0;
        if (interfaceC16456f5 != null) {
            interfaceC16456f5.mo84769d();
        }
        FrameLayout frameLayout = this.f83105S;
        Float f11 = null;
        if (frameLayout != null && frameLayout.getTranslationY() > 0.0f && (c31980jc = this.f83110a0) != null && (arrayList = c31980jc.f147031x) != null && (!arrayList.isEmpty())) {
            AnimatorSet animatorSet = this.f83107U;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.f83107U.cancel();
            }
            C31980jc c31980jc2 = this.f83110a0;
            if (c31980jc2 != null) {
                c32123ta = c31980jc2.m153825r();
            } else {
                c32123ta = null;
            }
            if (c32123ta != null && (interfaceC16456f = this.f83140w0) != null) {
                interfaceC16456f.mo84771f(c32123ta.f148138h, c32123ta.f148142j, c32123ta.f148113P, i11);
            }
            BaseStoryItemView.InterfaceC16456f interfaceC16456f6 = this.f83140w0;
            if (interfaceC16456f6 != null) {
                interfaceC16456f6.mo84787v();
            }
        }
        FrameLayout frameLayout2 = this.f83105S;
        if (frameLayout2 != null) {
            f11 = Float.valueOf(frameLayout2.getTranslationY());
        }
        if (AbstractC19074t.m100203a(f11, this.f83106T)) {
            AbstractC23647d.m123897g("4915305");
        } else {
            AbstractC23647d.m123897g("4915304");
        }
    }

    /* renamed from: F0 */
    public final void m88124F0(int i11, int i12) {
        C29931md c29931md = this.f83520A0;
        C29931md c29931md2 = null;
        if (c29931md == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29931md = null;
        }
        c29931md.f138717w.setText(String.valueOf(i11));
        C29931md c29931md3 = this.f83520A0;
        if (c29931md3 == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
        } else {
            c29931md2 = c29931md3;
        }
        c29931md2.f138712r.m75961X(i12);
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: N */
    public boolean mo87689N() {
        C29931md c29931md = this.f83520A0;
        if (c29931md == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29931md = null;
        }
        if (c29931md.f138716v.isShown()) {
            m88123D0(3);
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: O */
    public void mo87690O() {
        C29769dd c29769dd = this.f83521B0;
        if (c29769dd == null) {
            AbstractC19074t.m100223u("stubUploadingLayoutBinding");
            c29769dd = null;
        }
        AbstractC23136l9.m118744r1(c29769dd.getRoot(), 8);
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: P */
    public void mo87691P(boolean z11) {
        m88126u0(z11);
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
        m88099A0();
        C29769dd c29769dd = this.f83521B0;
        if (c29769dd == null) {
            AbstractC19074t.m100223u("stubUploadingLayoutBinding");
            c29769dd = null;
        }
        if (!c29769dd.getRoot().isShown()) {
            m88126u0(true);
            BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
            if (interfaceC16456f != null) {
                interfaceC16456f.mo84754B();
            }
        }
        return true;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: T */
    public boolean mo87695T() {
        C29769dd c29769dd = this.f83521B0;
        if (c29769dd == null) {
            AbstractC19074t.m100223u("stubUploadingLayoutBinding");
            c29769dd = null;
        }
        if (!c29769dd.getRoot().isShown()) {
            m88123D0(3);
            return true;
        }
        return true;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: U */
    public void mo87696U(int i11) {
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
        AbstractC23136l9.m118744r1(this.f83096J, 8);
        C29769dd c29769dd = this.f83521B0;
        if (c29769dd == null) {
            AbstractC19074t.m100223u("stubUploadingLayoutBinding");
            c29769dd = null;
        }
        AbstractC23136l9.m118744r1(c29769dd.getRoot(), 0);
        BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null) {
            interfaceC16456f.mo84777l(c32123ta);
        }
    }

    public final View getButtonReShare() {
        C29931md c29931md = this.f83520A0;
        if (c29931md == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29931md = null;
        }
        RobotoTextView robotoTextView = c29931md.f138711q;
        AbstractC19074t.m100207e(robotoTextView, "llStoryMineAddNew");
        return robotoTextView;
    }

    public final ActiveImageColorButton getIconPrivacySetting() {
        ActiveImageColorButton activeImageColorButton = this.f83524y0;
        if (activeImageColorButton == null) {
            AbstractC19074t.m100223u("icStoryPrivacy");
            return null;
        }
        return activeImageColorButton;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    public String getStoryMessageToSend() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uicontrol.BaseStoryItemView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(AbstractC6918a0.separator_story_privacy);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f83525z0 = findViewById;
        View findViewById2 = findViewById(AbstractC6918a0.ic_story_privacy);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        ActiveImageColorButton activeImageColorButton = (ActiveImageColorButton) findViewById2;
        this.f83524y0 = activeImageColorButton;
        ActiveImageColorButton activeImageColorButton2 = null;
        if (activeImageColorButton == null) {
            AbstractC19074t.m100223u("icStoryPrivacy");
            activeImageColorButton = null;
        }
        activeImageColorButton.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryMineItemView.m88101C0(StoryMineItemView.this, view);
            }
        });
        ActiveImageColorButton activeImageColorButton3 = this.f83524y0;
        if (activeImageColorButton3 == null) {
            AbstractC19074t.m100223u("icStoryPrivacy");
            activeImageColorButton3 = null;
        }
        activeImageColorButton3.setMaxIconSize(AbstractC23222t7.f112586t);
        ActiveImageColorButton activeImageColorButton4 = this.f83524y0;
        if (activeImageColorButton4 == null) {
            AbstractC19074t.m100223u("icStoryPrivacy");
        } else {
            activeImageColorButton2 = activeImageColorButton4;
        }
        activeImageColorButton2.setRedDotSize(AbstractC23222t7.f112556e);
        m88099A0();
        m87716y();
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: q */
    public void mo87709q(C31980jc c31980jc) {
        super.mo87709q(c31980jc);
        this.f83106T = this.f83113d0 / 2.0f;
        ViewGroup.LayoutParams layoutParams = this.f83105S.getLayoutParams();
        float f11 = this.f83106T;
        layoutParams.height = (int) f11;
        this.f83105S.setTranslationY(f11);
    }

    /* renamed from: q0 */
    public final void m88125q0(boolean z11) {
        if (getViewMode() == 5) {
            C29931md c29931md = this.f83520A0;
            if (c29931md == null) {
                AbstractC19074t.m100223u("stubBottomLayoutBinding");
                c29931md = null;
            }
            if (z11) {
                c29931md.f138711q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.a2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StoryMineItemView.m88116s0(StoryMineItemView.this, view);
                    }
                });
                c29931md.f138711q.setAlpha(1.0f);
                c29931md.f138711q.setBackgroundResource(AbstractC23136l9.m118734o0(getContext(), false));
            } else {
                c29931md.f138711q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.b2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StoryMineItemView.m88115r0(view);
                    }
                });
                c29931md.f138711q.setAlpha(0.4f);
                c29931md.f138711q.setBackground(null);
            }
        }
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: r */
    public void mo87710r(C32123ta c32123ta) {
        super.mo87710r(c32123ta);
        if (c32123ta == null) {
            return;
        }
        C29931md c29931md = null;
        if (c32123ta.f148126b == 2) {
            if (c32123ta.f148128c == 2) {
                mo87702a0(0, c32123ta, null);
            } else {
                C29769dd c29769dd = this.f83521B0;
                if (c29769dd == null) {
                    AbstractC19074t.m100223u("stubUploadingLayoutBinding");
                    c29769dd = null;
                }
                AbstractC23136l9.m118744r1(c29769dd.getRoot(), 0);
                AbstractC23136l9.m118744r1(this.f83096J, 8);
                C29931md c29931md2 = this.f83520A0;
                if (c29931md2 == null) {
                    AbstractC19074t.m100223u("stubBottomLayoutBinding");
                    c29931md2 = null;
                }
                AbstractC23136l9.m118744r1(c29931md2.f138711q, 8);
                C29931md c29931md3 = this.f83520A0;
                if (c29931md3 == null) {
                    AbstractC19074t.m100223u("stubBottomLayoutBinding");
                    c29931md3 = null;
                }
                AbstractC23136l9.m118744r1(c29931md3.f138716v, 8);
            }
            AbstractC23136l9.m118744r1(this.f83143z, 8);
        } else {
            this.f83100N.setOnClickListener(m87711s(1007));
            AbstractC23136l9.m118744r1(this.f83100N, 0);
            this.f83143z.setOnClickListener(m87711s(1007));
            AbstractC23136l9.m118744r1(this.f83143z, 0);
            setBottomBarVisibility(0);
            C29769dd c29769dd2 = this.f83521B0;
            if (c29769dd2 == null) {
                AbstractC19074t.m100223u("stubUploadingLayoutBinding");
                c29769dd2 = null;
            }
            AbstractC23136l9.m118744r1(c29769dd2.getRoot(), 8);
            AbstractC23136l9.m118744r1(this.f83096J, 8);
            if (getViewMode() == 5) {
                if (c32123ta.f148140i == 3) {
                    C29931md c29931md4 = this.f83520A0;
                    if (c29931md4 == null) {
                        AbstractC19074t.m100223u("stubBottomLayoutBinding");
                        c29931md4 = null;
                    }
                    AbstractC23136l9.m118744r1(c29931md4.f138711q, 8);
                } else {
                    C29931md c29931md5 = this.f83520A0;
                    if (c29931md5 == null) {
                        AbstractC19074t.m100223u("stubBottomLayoutBinding");
                        c29931md5 = null;
                    }
                    AbstractC23136l9.m118744r1(c29931md5.f138711q, 0);
                    C29931md c29931md6 = this.f83520A0;
                    if (c29931md6 == null) {
                        AbstractC19074t.m100223u("stubBottomLayoutBinding");
                        c29931md6 = null;
                    }
                    RobotoTextView robotoTextView = c29931md6.f138711q;
                    Context context = getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    robotoTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, C27280g.m139659b(context, AbstractC23322a.zds_ic_share_solid_24, AbstractC16801x.white), (Drawable) null, (Drawable) null);
                    C29931md c29931md7 = this.f83520A0;
                    if (c29931md7 == null) {
                        AbstractC19074t.m100223u("stubBottomLayoutBinding");
                        c29931md7 = null;
                    }
                    c29931md7.f138711q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_owner_reshare_story_prompt));
                }
                m88125q0(false);
            } else {
                C29931md c29931md8 = this.f83520A0;
                if (c29931md8 == null) {
                    AbstractC19074t.m100223u("stubBottomLayoutBinding");
                    c29931md8 = null;
                }
                AbstractC23136l9.m118744r1(c29931md8.f138711q, 0);
                C29931md c29931md9 = this.f83520A0;
                if (c29931md9 == null) {
                    AbstractC19074t.m100223u("stubBottomLayoutBinding");
                    c29931md9 = null;
                }
                RobotoTextView robotoTextView2 = c29931md9.f138711q;
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                robotoTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, C27280g.m139659b(context2, AbstractC23322a.zds_ic_add_story_line_24, AbstractC16801x.white), (Drawable) null, (Drawable) null);
                C29931md c29931md10 = this.f83520A0;
                if (c29931md10 == null) {
                    AbstractC19074t.m100223u("stubBottomLayoutBinding");
                    c29931md10 = null;
                }
                c29931md10.f138711q.setText(AbstractC8020f0.str_story_owner_create_story_prompt);
            }
            C29931md c29931md11 = this.f83520A0;
            if (c29931md11 == null) {
                AbstractC19074t.m100223u("stubBottomLayoutBinding");
                c29931md11 = null;
            }
            AbstractC23136l9.m118744r1(c29931md11.f138716v, 0);
        }
        if (C24417g.f117907a.m127702d()) {
            if (c32123ta.f148149o != null && getViewMode() != 5) {
                ActiveImageColorButton activeImageColorButton = this.f83524y0;
                if (activeImageColorButton == null) {
                    AbstractC19074t.m100223u("icStoryPrivacy");
                    activeImageColorButton = null;
                }
                AbstractC23136l9.m118744r1(activeImageColorButton, 0);
                View view = this.f83525z0;
                if (view == null) {
                    AbstractC19074t.m100223u("dotSeparatorStoryPrivacy");
                    view = null;
                }
                AbstractC23136l9.m118744r1(view, 0);
                ActiveImageColorButton activeImageColorButton2 = this.f83524y0;
                if (activeImageColorButton2 == null) {
                    AbstractC19074t.m100223u("icStoryPrivacy");
                    activeImageColorButton2 = null;
                }
                activeImageColorButton2.setImageResource(c32123ta.f148149o.m45147o());
            } else {
                ActiveImageColorButton activeImageColorButton3 = this.f83524y0;
                if (activeImageColorButton3 == null) {
                    AbstractC19074t.m100223u("icStoryPrivacy");
                    activeImageColorButton3 = null;
                }
                AbstractC23136l9.m118744r1(activeImageColorButton3, 8);
                View view2 = this.f83525z0;
                if (view2 == null) {
                    AbstractC19074t.m100223u("dotSeparatorStoryPrivacy");
                    view2 = null;
                }
                AbstractC23136l9.m118744r1(view2, 8);
            }
        } else {
            ActiveImageColorButton activeImageColorButton4 = this.f83524y0;
            if (activeImageColorButton4 == null) {
                AbstractC19074t.m100223u("icStoryPrivacy");
                activeImageColorButton4 = null;
            }
            AbstractC23136l9.m118744r1(activeImageColorButton4, 8);
            View view3 = this.f83525z0;
            if (view3 == null) {
                AbstractC19074t.m100223u("dotSeparatorStoryPrivacy");
                view3 = null;
            }
            AbstractC23136l9.m118744r1(view3, 8);
        }
        m88124F0(c32123ta.f148142j, c32123ta.f148113P);
        m88102E0(c32123ta);
        m88113o0();
        if (C22037m0.f108553a.m115034h()) {
            if (c32123ta.m155083j0()) {
                C29931md c29931md12 = this.f83520A0;
                if (c29931md12 == null) {
                    AbstractC19074t.m100223u("stubBottomLayoutBinding");
                    c29931md12 = null;
                }
                AbstractC23136l9.m118744r1(c29931md12.f138712r, 0);
                C29931md c29931md13 = this.f83520A0;
                if (c29931md13 == null) {
                    AbstractC19074t.m100223u("stubBottomLayoutBinding");
                } else {
                    c29931md = c29931md13;
                }
                StoryReactedOverviewLayout storyReactedOverviewLayout = c29931md.f138712r;
                List<C24009b> list = c32123ta.f148111N;
                AbstractC19074t.m100207e(list, "reactionDataList");
                storyReactedOverviewLayout.setReactions(list);
            } else {
                C29931md c29931md14 = this.f83520A0;
                if (c29931md14 == null) {
                    AbstractC19074t.m100223u("stubBottomLayoutBinding");
                } else {
                    c29931md = c29931md14;
                }
                AbstractC23136l9.m118744r1(c29931md.f138712r, 8);
            }
        } else {
            C29931md c29931md15 = this.f83520A0;
            if (c29931md15 == null) {
                AbstractC19074t.m100223u("stubBottomLayoutBinding");
            } else {
                c29931md = c29931md15;
            }
            AbstractC23136l9.m118744r1(c29931md.f138712r, 8);
        }
        AbstractC19074t.m100207e(c32123ta.f148104G, "avatarViewers");
        if (!(!r0.isEmpty())) {
            AbstractC19074t.m100207e(c32123ta.f148111N, "reactionDataList");
            if (!(!r0.isEmpty())) {
                BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
                if (interfaceC16456f != null) {
                    interfaceC16456f.mo84766a(c32123ta);
                    return;
                }
                return;
            }
        }
        BaseStoryItemView.InterfaceC16456f interfaceC16456f2 = this.f83140w0;
        if (interfaceC16456f2 != null) {
            interfaceC16456f2.mo84775j(c32123ta);
        }
    }

    /* renamed from: u0 */
    public final void m88126u0(boolean z11) {
        BaseStoryItemView.InterfaceC16456f interfaceC16456f;
        C32123ta c32123ta;
        boolean m87717z = m87717z();
        if (this.f83105S != null) {
            AnimatorSet animatorSet = this.f83107U;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.f83107U.cancel();
            }
            this.f83126p0 = false;
            if (z11 && this.f83105S.getTranslationY() < this.f83106T) {
                m87705d0(false, new C16523b());
            } else {
                AnimatorSet animatorSet2 = this.f83107U;
                if (animatorSet2 != null && animatorSet2.isRunning()) {
                    this.f83107U.end();
                }
                this.f83105S.setVisibility(8);
                this.f83105S.setTranslationY(this.f83106T);
                this.f83104R.setAlpha(0.0f);
                this.f83104R.setVisibility(8);
            }
            BaseStoryItemView.InterfaceC16456f interfaceC16456f2 = this.f83140w0;
            if (interfaceC16456f2 != null) {
                interfaceC16456f2.mo84790y(false);
            }
            BaseStoryItemView.InterfaceC16456f interfaceC16456f3 = this.f83140w0;
            if (interfaceC16456f3 != null) {
                interfaceC16456f3.mo84762J(false);
            }
        }
        BaseStoryItemView.InterfaceC16456f interfaceC16456f4 = this.f83140w0;
        if (interfaceC16456f4 != null) {
            interfaceC16456f4.mo84774i(this, 0);
        }
        C31980jc c31980jc = this.f83110a0;
        if (c31980jc != null && m87717z && (interfaceC16456f = this.f83140w0) != null) {
            if (c31980jc != null) {
                c32123ta = c31980jc.m153825r();
            } else {
                c32123ta = null;
            }
            interfaceC16456f.mo84767b(c32123ta);
        }
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: x */
    protected void mo87715x() {
        ViewStub viewStub = (ViewStub) findViewById(AbstractC6918a0.stub_story_item_view_bottom_layout);
        if (viewStub != null) {
            viewStub.setLayoutResource(AbstractC7409c0.story_viewers_mine_layout);
            viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: com.zing.zalo.uicontrol.t1
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub2, View view) {
                    StoryMineItemView.m88118v0(StoryMineItemView.this, viewStub2, view);
                }
            });
            this.f83103Q = viewStub.inflate();
        }
        C29931md c29931md = this.f83520A0;
        if (c29931md == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29931md = null;
        }
        c29931md.f138713s.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryMineItemView.m88119w0(StoryMineItemView.this, view);
            }
        });
        c29931md.f138714t.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryMineItemView.m88120x0(StoryMineItemView.this, view);
            }
        });
        c29931md.f138712r.m75959V(AbstractC23136l9.m118639A(AbstractC16801x.white), AbstractC2814h.t_normal);
        c29931md.f138712r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryMineItemView.m88121y0(StoryMineItemView.this, view);
            }
        });
        c29931md.f138711q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryMineItemView.m88122z0(StoryMineItemView.this, view);
            }
        });
    }
}
