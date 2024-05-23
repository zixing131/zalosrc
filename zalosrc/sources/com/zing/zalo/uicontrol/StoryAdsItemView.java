package com.zing.zalo.uicontrol;

import ac.C0708i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.uicontrol.BaseStoryItemView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zdesign.component.TrackingTextView;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import ed0.AbstractC18391a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import l30.AbstractC22055v0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p227i3.C20215s;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p649xl.C29715ad;
import p649xl.C30088vc;
import p716zh.C31877d;
import p716zh.C31980jc;
import p716zh.C32123ta;

/* loaded from: classes4.dex */
public final class StoryAdsItemView extends BaseStoryItemView {
    public static final C16516a Companion = new C16516a(null);

    /* renamed from: A0 */
    private C30088vc f83498A0;

    /* renamed from: B0 */
    private boolean f83499B0;

    /* renamed from: C0 */
    private boolean f83500C0;

    /* renamed from: D0 */
    private final ArgbEvaluator f83501D0;

    /* renamed from: E0 */
    private final TextWatcher f83502E0;

    /* renamed from: F0 */
    private final TextView.OnEditorActionListener f83503F0;

    /* renamed from: G0 */
    private C16572d1 f83504G0;

    /* renamed from: y0 */
    private View f83505y0;

    /* renamed from: z0 */
    private TrackingTextView f83506z0;

    /* renamed from: com.zing.zalo.uicontrol.StoryAdsItemView$a */
    /* loaded from: classes4.dex */
    public static final class C16516a {
        private C16516a() {
        }

        public /* synthetic */ C16516a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryAdsItemView$b */
    /* loaded from: classes4.dex */
    public static final class C16517b extends AnimatorListenerAdapter {
        C16517b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            StoryAdsItemView.this.f83499B0 = true;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryAdsItemView$c */
    /* loaded from: classes4.dex */
    public static final class C16518c extends AbstractC18391a {
        C16518c() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z11;
            AbstractC19074t.m100208f(editable, C20215s.f99966b);
            C30088vc c30088vc = StoryAdsItemView.this.f83498A0;
            if (c30088vc == null) {
                AbstractC19074t.m100223u("stubBottomLayoutBinding");
                c30088vc = null;
            }
            TrackingImageView trackingImageView = c30088vc.f139707t.f137255q;
            if (editable.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            trackingImageView.setEnabled(z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryAdsItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f83501D0 = new ArgbEvaluator();
        this.f83502E0 = new C16518c();
        this.f83503F0 = new TextView.OnEditorActionListener() { // from class: com.zing.zalo.uicontrol.g1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m88070y0;
                m88070y0 = StoryAdsItemView.m88070y0(StoryAdsItemView.this, textView, i11, keyEvent);
                return m88070y0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public static final void m88049B0(StoryAdsItemView storyAdsItemView) {
        AbstractC19074t.m100208f(storyAdsItemView, "this$0");
        storyAdsItemView.m88052E0();
    }

    /* renamed from: C0 */
    private final void m88050C0() {
        CharSequence m127168X0;
        C30088vc c30088vc = this.f83498A0;
        C30088vc c30088vc2 = null;
        if (c30088vc == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c30088vc = null;
        }
        m127168X0 = AbstractC24342w.m127168X0(String.valueOf(c30088vc.f139707t.f137256r.getText()));
        String obj = m127168X0.toString();
        BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null && interfaceC16456f.mo84788w(obj, false, false)) {
            m88073u0();
            C30088vc c30088vc3 = this.f83498A0;
            if (c30088vc3 == null) {
                AbstractC19074t.m100223u("stubBottomLayoutBinding");
            } else {
                c30088vc2 = c30088vc3;
            }
            c30088vc2.f139707t.f137256r.setText("");
        }
    }

    /* renamed from: D0 */
    private final void m88051D0() {
        C30088vc c30088vc = this.f83498A0;
        C30088vc c30088vc2 = null;
        if (c30088vc == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c30088vc = null;
        }
        AbstractC23136l9.m118744r1(c30088vc.f139706s, 8);
        C30088vc c30088vc3 = this.f83498A0;
        if (c30088vc3 == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
        } else {
            c30088vc2 = c30088vc3;
        }
        C29715ad c29715ad = c30088vc2.f139707t;
        boolean z11 = false;
        AbstractC23136l9.m118744r1(c29715ad.f137257s, 0);
        m88052E0();
        AbstractC2379w.m12432f(c29715ad.f137256r);
        TrackingImageView trackingImageView = c29715ad.f137255q;
        Editable text = c29715ad.f137256r.getText();
        if (text != null) {
            AbstractC19074t.m100205c(text);
            if (text.length() > 0) {
                z11 = true;
            }
        }
        trackingImageView.setEnabled(z11);
        BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null) {
            interfaceC16456f.mo84764L(this, true);
        }
    }

    /* renamed from: E0 */
    private final void m88052E0() {
        C30088vc c30088vc = this.f83498A0;
        if (c30088vc == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c30088vc = null;
        }
        ViewGroup.LayoutParams layoutParams = c30088vc.f139705r.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = AbstractC23309i.m122007i5(getContext());
        c30088vc.f139705r.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public static final void m88063o0(C32123ta c32123ta, StoryAdsItemView storyAdsItemView, boolean z11, View view) {
        String str;
        String str2;
        AbstractC19074t.m100208f(storyAdsItemView, "this$0");
        if (AbstractC19074t.m100204b(c32123ta.f148131d0, "action.open.story_message")) {
            storyAdsItemView.m88051D0();
        } else {
            if (AbstractC19074t.m100204b(c32123ta.f148131d0, "action.follow.oa") && z11) {
                str = "action.unfollow.oa";
            } else {
                str = c32123ta.f148131d0;
            }
            if (AbstractC19074t.m100204b(c32123ta.f148131d0, "action.follow.oa") && z11) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uid", c32123ta.f148136g);
                str2 = jSONObject.toString();
            } else {
                str2 = c32123ta.f148133e0;
            }
            if (AbstractC19074t.m100204b(str, "action.unfollow.oa")) {
                BaseStoryItemView.InterfaceC16456f interfaceC16456f = storyAdsItemView.f83140w0;
                if (interfaceC16456f != null) {
                    interfaceC16456f.mo84776k(1008);
                }
            } else {
                BaseStoryItemView.InterfaceC16456f interfaceC16456f2 = storyAdsItemView.f83140w0;
                if (interfaceC16456f2 != null) {
                    interfaceC16456f2.mo84779n(str, str2, storyAdsItemView.m88067t0(c32123ta));
                }
            }
        }
        AbstractC22055v0.m115166z(c32123ta, 20);
        AbstractC22055v0.m115151k(c32123ta);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m88064p0(StoryAdsItemView storyAdsItemView, C32123ta c32123ta, View view) {
        AbstractC19074t.m100208f(storyAdsItemView, "this$0");
        BaseStoryItemView.InterfaceC16456f interfaceC16456f = storyAdsItemView.f83140w0;
        if (interfaceC16456f != null) {
            interfaceC16456f.mo84779n(c32123ta.f148122Y, c32123ta.f148123Z, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m88065r0(StoryAdsItemView storyAdsItemView, int i11, int i12, C30088vc c30088vc, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(storyAdsItemView, "this$0");
        AbstractC19074t.m100208f(c30088vc, "$this_with");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        Object evaluate = storyAdsItemView.f83501D0.evaluate(((Float) animatedValue).floatValue(), Integer.valueOf(i11), Integer.valueOf(i12));
        AbstractC19074t.m100206d(evaluate, "null cannot be cast to non-null type kotlin.Int");
        c30088vc.f139704q.setTextColor(((Integer) evaluate).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m88066s0(ValueAnimator valueAnimator, TransitionDrawable transitionDrawable) {
        AbstractC19074t.m100208f(transitionDrawable, "$transitionDrawable");
        valueAnimator.start();
        transitionDrawable.startTransition(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
    }

    /* renamed from: t0 */
    private final C31877d m88067t0(C32123ta c32123ta) {
        if (c32123ta != null && (AbstractC19074t.m100204b(c32123ta.f148131d0, "action.follow.oa") || AbstractC19074t.m100204b(c32123ta.f148131d0, "action.unfollow.oa"))) {
            TrackingSource trackingSource = new TrackingSource(225);
            trackingSource.m40677a("campaignId", Integer.valueOf(c32123ta.f148137g0));
            trackingSource.m40677a("srcId", Integer.valueOf(c32123ta.f148139h0));
            trackingSource.m40677a("tracking_src", c32123ta.f148141i0);
            return new C31877d(trackingSource);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m88068v0(StoryAdsItemView storyAdsItemView, ViewStub viewStub, View view) {
        AbstractC19074t.m100208f(storyAdsItemView, "this$0");
        C30088vc m148626a = C30088vc.m148626a(view);
        AbstractC19074t.m100207e(m148626a, "bind(...)");
        storyAdsItemView.f83498A0 = m148626a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m88069w0(StoryAdsItemView storyAdsItemView, View view) {
        AbstractC19074t.m100208f(storyAdsItemView, "this$0");
        storyAdsItemView.m88050C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final boolean m88070y0(StoryAdsItemView storyAdsItemView, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(storyAdsItemView, "this$0");
        if (i11 != 4 && i11 != 6) {
            return false;
        }
        storyAdsItemView.m88050C0();
        return true;
    }

    /* renamed from: A0 */
    public final void m88071A0() {
        C30088vc c30088vc = this.f83498A0;
        if (c30088vc == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c30088vc = null;
        }
        if (m88074x0()) {
            c30088vc.f139705r.post(new Runnable() { // from class: com.zing.zalo.uicontrol.j1
                @Override // java.lang.Runnable
                public final void run() {
                    StoryAdsItemView.m88049B0(StoryAdsItemView.this);
                }
            });
            if (!c30088vc.f139707t.f137256r.isFocused()) {
                c30088vc.f139707t.f137256r.requestFocus();
            }
            m87703b0(true);
        }
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: L */
    protected void mo87687L() {
        BaseStoryItemView.InterfaceC16456f interfaceC16456f;
        C32123ta c32123ta = this.f83108V;
        if (c32123ta != null && (interfaceC16456f = this.f83140w0) != null) {
            interfaceC16456f.mo84779n(c32123ta.f148122Y, c32123ta.f148123Z, null);
        }
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: N */
    public boolean mo87689N() {
        return false;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: O */
    public void mo87690O() {
        m88073u0();
        AbstractC23136l9.m118744r1(this.f83096J, 8);
        View view = this.f83505y0;
        if (view == null) {
            AbstractC19074t.m100223u("tvErrorAds");
            view = null;
        }
        AbstractC23136l9.m118744r1(view, 0);
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: P */
    public void mo87691P(boolean z11) {
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: Q */
    public void mo87692Q() {
        m88073u0();
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: R */
    public void mo87693R() {
        if (m88074x0()) {
            m88073u0();
        }
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: S */
    public boolean mo87694S() {
        return false;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: T */
    public boolean mo87695T() {
        C32123ta c32123ta = this.f83108V;
        if (c32123ta != null) {
            if (AbstractC19074t.m100204b(c32123ta.f148131d0, "action.open.story_message")) {
                m88051D0();
                return true;
            }
            if (!AbstractC19074t.m100204b(c32123ta.f148131d0, "action.follow.oa") && !AbstractC19074t.m100204b(c32123ta.f148131d0, "action.unfollow.oa")) {
                BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
                if (interfaceC16456f != null) {
                    interfaceC16456f.mo84779n(c32123ta.f148131d0, c32123ta.f148133e0, null);
                }
                AbstractC22055v0.m115166z(c32123ta, 20);
                AbstractC22055v0.m115151k(c32123ta);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: U */
    public void mo87696U(int i11) {
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: V */
    public void mo87697V() {
        C30088vc c30088vc = this.f83498A0;
        if (c30088vc == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c30088vc = null;
        }
        C29715ad c29715ad = c30088vc.f139707t;
        c29715ad.f137256r.removeTextChangedListener(this.f83502E0);
        c29715ad.f137256r.setOnEditorActionListener(null);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uicontrol.BaseStoryItemView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(AbstractC6918a0.tv_story_ads_sponsored);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f83506z0 = (TrackingTextView) findViewById;
        View findViewById2 = findViewById(AbstractC6918a0.tv_error_story_ads);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f83505y0 = findViewById2;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: q */
    public void mo87709q(C31980jc c31980jc) {
        super.mo87709q(c31980jc);
        this.f83143z.setOnClickListener(m87711s(1007));
    }

    /* renamed from: q0 */
    public final void m88072q0() {
        final C30088vc c30088vc = this.f83498A0;
        if (c30088vc == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c30088vc = null;
        }
        final int m119606n = C23212s8.m119606n(AbstractC2807a.constant_white);
        final int m119606n2 = C23212s8.m119606n(AbstractC2807a.constant_black);
        final TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{AbstractC23136l9.m118663M(AbstractC16803z.bg_btn_story_ads_tertiary), AbstractC23136l9.m118663M(AbstractC16803z.bg_btn_story_ads_secondary_neutral)});
        if (!this.f83499B0) {
            if (!this.f83500C0) {
                final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(500L);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.uicontrol.k1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        StoryAdsItemView.m88065r0(StoryAdsItemView.this, m119606n, m119606n2, c30088vc, valueAnimator);
                    }
                });
                ofFloat.addListener(new C16517b());
                c30088vc.f139704q.setBackground(transitionDrawable);
                c30088vc.f139704q.setTextColor(m119606n);
                c30088vc.f139704q.postDelayed(new Runnable() { // from class: com.zing.zalo.uicontrol.l1
                    @Override // java.lang.Runnable
                    public final void run() {
                        StoryAdsItemView.m88066s0(ofFloat, transitionDrawable);
                    }
                }, 3000L);
                this.f83500C0 = true;
                return;
            }
            return;
        }
        c30088vc.f139704q.setBackground(AbstractC23136l9.m118663M(AbstractC16803z.bg_btn_story_ads_secondary_neutral));
        c30088vc.f139704q.setTextColor(m119606n2);
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: r */
    public void mo87710r(final C32123ta c32123ta) {
        String str;
        TrackingTextView trackingTextView;
        TrackingTextView trackingTextView2;
        super.mo87710r(c32123ta);
        if (c32123ta == null) {
            return;
        }
        C30088vc c30088vc = this.f83498A0;
        C30088vc c30088vc2 = null;
        if (c30088vc == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c30088vc = null;
        }
        c30088vc.f139708u.setText(c32123ta.f148127b0);
        final boolean m114318P = C21927m.m114302u().m114318P(c32123ta.f148136g);
        if (AbstractC19074t.m100204b(c32123ta.f148131d0, "action.follow.oa") && m114318P) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_followed);
        } else {
            str = c32123ta.f148129c0;
        }
        c30088vc.f139704q.setText(str);
        c30088vc.f139704q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryAdsItemView.m88063o0(C32123ta.this, this, m114318P, view);
            }
        });
        c30088vc.f139704q.setIdTracking("click_story_ad_cta");
        Button button = c30088vc.f139704q;
        C0708i c0708i = new C0708i();
        String str2 = c32123ta.f148121X;
        AbstractC19074t.m100207e(str2, "adsId");
        c0708i.m1075f("adId", str2);
        button.setTrackingExtraData(c0708i);
        TextView textView = this.f83135u;
        if (textView instanceof TrackingTextView) {
            trackingTextView = (TrackingTextView) textView;
        } else {
            trackingTextView = null;
        }
        if (trackingTextView != null) {
            trackingTextView.setIdTracking("click_name_story_ad");
        }
        TextView textView2 = this.f83135u;
        if (textView2 instanceof TrackingTextView) {
            trackingTextView2 = (TrackingTextView) textView2;
        } else {
            trackingTextView2 = null;
        }
        if (trackingTextView2 != null) {
            C0708i c0708i2 = new C0708i();
            String str3 = c32123ta.f148121X;
            AbstractC19074t.m100207e(str3, "adsId");
            c0708i2.m1075f("adId", str3);
            trackingTextView2.setTrackingExtraData(c0708i2);
        }
        TrackingTextView trackingTextView3 = this.f83506z0;
        if (trackingTextView3 == null) {
            AbstractC19074t.m100223u("tvSponsoredStoryAds");
            trackingTextView3 = null;
        }
        trackingTextView3.setText(c32123ta.f148125a0);
        TrackingTextView trackingTextView4 = this.f83506z0;
        if (trackingTextView4 == null) {
            AbstractC19074t.m100223u("tvSponsoredStoryAds");
            trackingTextView4 = null;
        }
        trackingTextView4.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryAdsItemView.m88064p0(StoryAdsItemView.this, c32123ta, view);
            }
        });
        TrackingTextView trackingTextView5 = this.f83506z0;
        if (trackingTextView5 == null) {
            AbstractC19074t.m100223u("tvSponsoredStoryAds");
            trackingTextView5 = null;
        }
        trackingTextView5.setIdTracking("click_name_story_ad");
        TrackingTextView trackingTextView6 = this.f83506z0;
        if (trackingTextView6 == null) {
            AbstractC19074t.m100223u("tvSponsoredStoryAds");
            trackingTextView6 = null;
        }
        C0708i c0708i3 = new C0708i();
        String str4 = c32123ta.f148121X;
        AbstractC19074t.m100207e(str4, "adsId");
        c0708i3.m1075f("adId", str4);
        trackingTextView6.setTrackingExtraData(c0708i3);
        C30088vc c30088vc3 = this.f83498A0;
        if (c30088vc3 == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
        } else {
            c30088vc2 = c30088vc3;
        }
        C29715ad c29715ad = c30088vc2.f139707t;
        c29715ad.f137255q.setIdTracking("send_message_story_ad");
        TrackingImageView trackingImageView = c29715ad.f137255q;
        C0708i c0708i4 = new C0708i();
        String str5 = c32123ta.f148121X;
        AbstractC19074t.m100207e(str5, "adsId");
        c0708i4.m1075f("adId", str5);
        trackingImageView.setTrackingExtraData(c0708i4);
    }

    /* renamed from: u0 */
    public final void m88073u0() {
        C30088vc c30088vc = this.f83498A0;
        C30088vc c30088vc2 = null;
        if (c30088vc == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c30088vc = null;
        }
        AbstractC23136l9.m118744r1(c30088vc.f139706s, 0);
        ViewGroup.LayoutParams layoutParams = c30088vc.f139705r.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = 0;
        c30088vc.f139705r.setLayoutParams(marginLayoutParams);
        C30088vc c30088vc3 = this.f83498A0;
        if (c30088vc3 == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
        } else {
            c30088vc2 = c30088vc3;
        }
        C29715ad c29715ad = c30088vc2.f139707t;
        AbstractC2379w.m12430d(c29715ad.f137256r);
        AbstractC23136l9.m118744r1(c29715ad.f137257s, 8);
        BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null) {
            interfaceC16456f.mo84764L(this, false);
        }
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: x */
    protected void mo87715x() {
        ViewStub viewStub = (ViewStub) findViewById(AbstractC6918a0.stub_story_item_view_bottom_layout);
        if (viewStub != null) {
            viewStub.setLayoutResource(AbstractC7409c0.story_ads_info_cta_view);
            viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: com.zing.zalo.uicontrol.h1
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub2, View view) {
                    StoryAdsItemView.m88068v0(StoryAdsItemView.this, viewStub2, view);
                }
            });
            this.f83103Q = viewStub.inflate();
            C30088vc c30088vc = this.f83498A0;
            if (c30088vc == null) {
                AbstractC19074t.m100223u("stubBottomLayoutBinding");
                c30088vc = null;
            }
            C29715ad c29715ad = c30088vc.f139707t;
            c29715ad.f137256r.addTextChangedListener(this.f83502E0);
            c29715ad.f137256r.setOnEditorActionListener(this.f83503F0);
            this.f83504G0 = new C16572d1(c29715ad.f137256r, false, null);
            c29715ad.f137255q.setEnabled(!TextUtils.isEmpty(c29715ad.f137256r.getText()));
            c29715ad.f137255q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.i1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoryAdsItemView.m88069w0(StoryAdsItemView.this, view);
                }
            });
        }
    }

    /* renamed from: x0 */
    public final boolean m88074x0() {
        C30088vc c30088vc = this.f83498A0;
        if (c30088vc == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c30088vc = null;
        }
        if (c30088vc.f139707t.f137257s.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z0 */
    public final void m88075z0() {
        m88073u0();
        m87703b0(false);
    }
}
