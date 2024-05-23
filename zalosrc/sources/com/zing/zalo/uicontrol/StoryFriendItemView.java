package com.zing.zalo.uicontrol;

import ag0.C0815e1;
import android.content.Context;
import android.graphics.Rect;
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
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.ReactionHorizontalView;
import com.zing.zalo.uicontrol.BaseStoryItemView;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import ed0.AbstractC18391a;
import fn0.AbstractC19074t;
import hm0.C20096c;
import is.AbstractC20826v0;
import l30.AbstractC22055v0;
import l30.C22037m0;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p227i3.C20215s;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p649xl.C29715ad;
import p649xl.C29895kd;
import p716zh.C31980jc;
import p716zh.C32123ta;

/* loaded from: classes4.dex */
public final class StoryFriendItemView extends BaseStoryItemView {

    /* renamed from: A0 */
    private final TextView.OnEditorActionListener f83509A0;

    /* renamed from: B0 */
    private C16572d1 f83510B0;

    /* renamed from: C0 */
    private final ReactionHorizontalView.InterfaceC13519b f83511C0;

    /* renamed from: y0 */
    private C29895kd f83512y0;

    /* renamed from: z0 */
    private final TextWatcher f83513z0;

    /* renamed from: com.zing.zalo.uicontrol.StoryFriendItemView$a */
    /* loaded from: classes4.dex */
    public static final class C16519a extends AbstractC18391a {
        C16519a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z11;
            AbstractC19074t.m100208f(editable, C20215s.f99966b);
            C29895kd c29895kd = StoryFriendItemView.this.f83512y0;
            if (c29895kd == null) {
                AbstractC19074t.m100223u("stubBottomLayoutBinding");
                c29895kd = null;
            }
            TrackingImageView trackingImageView = c29895kd.f138502q.f137255q;
            if (editable.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            trackingImageView.setEnabled(z11);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryFriendItemView$b */
    /* loaded from: classes4.dex */
    public static final class C16520b implements ReactionHorizontalView.InterfaceC13520c {
        C16520b() {
        }

        @Override // com.zing.zalo.p077ui.widget.ReactionHorizontalView.InterfaceC13520c
        /* renamed from: a */
        public void mo75844a() {
            int i11;
            BaseStoryItemView.InterfaceC16456f interfaceC16456f;
            StoryFriendItemView storyFriendItemView = StoryFriendItemView.this;
            C32123ta c32123ta = storyFriendItemView.f83108V;
            if (c32123ta != null) {
                i11 = c32123ta.f148151q;
            } else {
                i11 = -1;
            }
            if (i11 != -1 && i11 - ((int) ((storyFriendItemView.f83141x.getProgress() / 100.0f) * i11)) <= 1000 && (interfaceC16456f = StoryFriendItemView.this.f83140w0) != null) {
                interfaceC16456f.mo84787v();
            }
        }

        @Override // com.zing.zalo.p077ui.widget.ReactionHorizontalView.InterfaceC13520c
        /* renamed from: b */
        public void mo75845b() {
            BaseStoryItemView.InterfaceC16456f interfaceC16456f = StoryFriendItemView.this.f83140w0;
            if (interfaceC16456f != null) {
                interfaceC16456f.mo84778m();
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.StoryFriendItemView$c */
    /* loaded from: classes4.dex */
    public static final class C16521c implements ReactionHorizontalView.InterfaceC13519b {
        C16521c() {
        }

        @Override // com.zing.zalo.p077ui.widget.ReactionHorizontalView.InterfaceC13519b
        /* renamed from: a */
        public boolean mo75843a(int i11, int i12, int i13, String str, String str2) {
            BaseStoryItemView.InterfaceC16456f interfaceC16456f;
            AbstractC19074t.m100208f(str, "selectedReactionId");
            AbstractC19074t.m100208f(str2, "selectedReactionEmoString");
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    AbstractC23647d.m123897g("491500705");
                                }
                            } else {
                                AbstractC23647d.m123897g("491500704");
                            }
                        } else {
                            AbstractC23647d.m123897g("491500703");
                        }
                    } else {
                        AbstractC23647d.m123897g("491500702");
                    }
                } else {
                    AbstractC23647d.m123897g("491500701");
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reaction", Integer.parseInt(str));
                C0815e1.m2075D().m2100V(new C23648e(47, "social_story", 0, "story_reaction_click_react", jSONObject.toString()), false);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            StoryFriendItemView storyFriendItemView = StoryFriendItemView.this;
            C32123ta c32123ta = storyFriendItemView.f83108V;
            if (c32123ta != null && (interfaceC16456f = storyFriendItemView.f83140w0) != null) {
                interfaceC16456f.mo84781p(c32123ta.f148138h, str, str2);
            }
            if (C22037m0.f108553a.m115034h()) {
                if (C23055e5.m118272g(false)) {
                    BaseStoryItemView.InterfaceC16456f interfaceC16456f2 = StoryFriendItemView.this.f83140w0;
                    if (interfaceC16456f2 != null) {
                        interfaceC16456f2.mo84765M(str, i12, i13);
                        AbstractC22055v0.m115144d0();
                    }
                } else {
                    BaseStoryItemView.InterfaceC16456f interfaceC16456f3 = StoryFriendItemView.this.f83140w0;
                    if (interfaceC16456f3 == null) {
                        return false;
                    }
                    interfaceC16456f3.mo84773h(AbstractC23136l9.m118743r0(AbstractC8020f0.str_archive_story_failed_network), ZAbstractBase.ZVU_PROCESS_FLUSH, AbstractC23322a.zds_ic_wifi_off_line_24, AbstractC2808b.wht_a100, null, null);
                    return false;
                }
            } else {
                BaseStoryItemView.InterfaceC16456f interfaceC16456f4 = StoryFriendItemView.this.f83140w0;
                if (interfaceC16456f4 != null) {
                    interfaceC16456f4.mo84765M(str, i12, i13);
                }
                AbstractC20826v0.m108790V0();
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryFriendItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f83513z0 = new C16519a();
        this.f83509A0 = new TextView.OnEditorActionListener() { // from class: com.zing.zalo.uicontrol.p1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m88085p0;
                m88085p0 = StoryFriendItemView.m88085p0(StoryFriendItemView.this, textView, i11, keyEvent);
                return m88085p0;
            }
        };
        this.f83511C0 = new C16521c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public static final void m88082l0(StoryFriendItemView storyFriendItemView, ViewStub viewStub, View view) {
        AbstractC19074t.m100208f(storyFriendItemView, "this$0");
        C29895kd m148174a = C29895kd.m148174a(view);
        AbstractC19074t.m100207e(m148174a, "bind(...)");
        storyFriendItemView.f83512y0 = m148174a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m88083m0(StoryFriendItemView storyFriendItemView, View view) {
        AbstractC19074t.m100208f(storyFriendItemView, "this$0");
        storyFriendItemView.m88088u0(false);
        C0815e1.m2075D().m2100V(new C23648e(47, "social_story", 0, "story_reaction_click_reply_box", new String[0]), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m88084n0(StoryFriendItemView storyFriendItemView, View view) {
        AbstractC19074t.m100208f(storyFriendItemView, "this$0");
        storyFriendItemView.m88087t0(false);
        C0815e1.m2075D().m2100V(new C23648e(47, "social_story", 0, "story_reaction_send_reply", new String[0]), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static final boolean m88085p0(StoryFriendItemView storyFriendItemView, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(storyFriendItemView, "this$0");
        if (i11 != 4 && i11 != 6) {
            return false;
        }
        storyFriendItemView.m88087t0(false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m88086s0(StoryFriendItemView storyFriendItemView) {
        AbstractC19074t.m100208f(storyFriendItemView, "this$0");
        storyFriendItemView.m88090w0();
    }

    /* renamed from: t0 */
    private final void m88087t0(boolean z11) {
        String storyMessageToSend = getStoryMessageToSend();
        BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null && interfaceC16456f.mo84788w(storyMessageToSend, z11, true)) {
            m88091k0();
            if (!z11) {
                C29895kd c29895kd = this.f83512y0;
                if (c29895kd == null) {
                    AbstractC19074t.m100223u("stubBottomLayoutBinding");
                    c29895kd = null;
                }
                c29895kd.f138502q.f137256r.setText("");
            }
        }
    }

    /* renamed from: u0 */
    private final void m88088u0(boolean z11) {
        String str;
        if (z11) {
            str = "4915308";
        } else {
            str = "4915307";
        }
        AbstractC23647d.m123897g(str);
        C29895kd c29895kd = this.f83512y0;
        if (c29895kd == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29895kd = null;
        }
        AbstractC23136l9.m118744r1(c29895kd.f138503r, 8);
        boolean z12 = false;
        AbstractC23136l9.m118744r1(c29895kd.f138502q.f137257s, 0);
        m88090w0();
        AbstractC2379w.m12432f(c29895kd.f138502q.f137256r);
        C29715ad c29715ad = c29895kd.f138502q;
        TrackingImageView trackingImageView = c29715ad.f137255q;
        Editable text = c29715ad.f137256r.getText();
        if (text != null) {
            AbstractC19074t.m100205c(text);
            if (text.length() > 0) {
                z12 = true;
            }
        }
        trackingImageView.setEnabled(z12);
        BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null) {
            interfaceC16456f.mo84764L(this, true);
        }
    }

    /* renamed from: v0 */
    private final void m88089v0(C32123ta c32123ta) {
        String str;
        C22037m0 c22037m0 = C22037m0.f108553a;
        C29895kd c29895kd = null;
        if (c32123ta != null) {
            str = c32123ta.f148138h;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String m115037k = c22037m0.m115037k(str);
        C29895kd c29895kd2 = this.f83512y0;
        if (c29895kd2 == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
        } else {
            c29895kd = c29895kd2;
        }
        c29895kd.f138503r.m75842g(m115037k);
    }

    /* renamed from: w0 */
    private final void m88090w0() {
        C29895kd c29895kd = this.f83512y0;
        if (c29895kd == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29895kd = null;
        }
        ViewGroup.LayoutParams layoutParams = c29895kd.f138504s.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = AbstractC23309i.m122007i5(getContext());
        c29895kd.f138504s.setLayoutParams(marginLayoutParams);
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: N */
    public boolean mo87689N() {
        return false;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: O */
    public void mo87690O() {
        m88091k0();
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: P */
    public void mo87691P(boolean z11) {
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: Q */
    public void mo87692Q() {
        m88091k0();
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: R */
    public void mo87693R() {
        if (m88092o0()) {
            m88091k0();
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
        m88088u0(false);
        return true;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: U */
    public void mo87696U(int i11) {
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: V */
    public void mo87697V() {
        C29895kd c29895kd = this.f83512y0;
        if (c29895kd == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29895kd = null;
        }
        C29715ad c29715ad = c29895kd.f138502q;
        c29715ad.f137256r.removeTextChangedListener(this.f83513z0);
        c29715ad.f137256r.setOnEditorActionListener(null);
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: W */
    public void mo87698W(boolean z11) {
        BaseStoryItemView.InterfaceC16456f interfaceC16456f;
        if (z11) {
            C29895kd c29895kd = this.f83512y0;
            C29895kd c29895kd2 = null;
            if (c29895kd == null) {
                AbstractC19074t.m100223u("stubBottomLayoutBinding");
                c29895kd = null;
            }
            if (c29895kd.f138503r.isShown()) {
                C29895kd c29895kd3 = this.f83512y0;
                if (c29895kd3 == null) {
                    AbstractC19074t.m100223u("stubBottomLayoutBinding");
                } else {
                    c29895kd2 = c29895kd3;
                }
                if (c29895kd2.f138503r.m75841c()) {
                    C0815e1.m2075D().m2100V(new C23648e(47, "social_story", 1, "story_reaction_view_reaction_bar", new String[0]), false);
                    return;
                }
                return;
            }
            return;
        }
        if (C22037m0.f108553a.m115034h() && (interfaceC16456f = this.f83140w0) != null) {
            interfaceC16456f.mo84763K(this.f83108V);
        }
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: X */
    public void mo87699X(C32123ta c32123ta) {
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: a0 */
    public void mo87702a0(int i11, C32123ta c32123ta, C20096c c20096c) {
        m88091k0();
        super.mo87702a0(i11, c32123ta, c20096c);
    }

    public final View getReactionBar() {
        C29895kd c29895kd = this.f83512y0;
        if (c29895kd == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29895kd = null;
        }
        return c29895kd.f138503r.getReactionBar();
    }

    public final Rect getReactionBarTipRect() {
        C29895kd c29895kd = this.f83512y0;
        if (c29895kd == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29895kd = null;
        }
        return c29895kd.f138503r.getReactionBarTipRect();
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    public String getStoryMessageToSend() {
        CharSequence m127168X0;
        C29895kd c29895kd = this.f83512y0;
        if (c29895kd == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29895kd = null;
        }
        m127168X0 = AbstractC24342w.m127168X0(String.valueOf(c29895kd.f138502q.f137256r.getText()));
        return m127168X0.toString();
    }

    /* renamed from: k0 */
    public final void m88091k0() {
        C29895kd c29895kd = this.f83512y0;
        if (c29895kd == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29895kd = null;
        }
        AbstractC2379w.m12430d(c29895kd.f138502q.f137256r);
        AbstractC23136l9.m118744r1(c29895kd.f138503r, 0);
        AbstractC23136l9.m118744r1(c29895kd.f138502q.f137257s, 8);
        ViewGroup.LayoutParams layoutParams = c29895kd.f138504s.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = 0;
        c29895kd.f138504s.setLayoutParams(marginLayoutParams);
        BaseStoryItemView.InterfaceC16456f interfaceC16456f = this.f83140w0;
        if (interfaceC16456f != null) {
            interfaceC16456f.mo84764L(this, false);
        }
    }

    /* renamed from: o0 */
    public final boolean m88092o0() {
        C29895kd c29895kd = this.f83512y0;
        if (c29895kd == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29895kd = null;
        }
        if (c29895kd.f138502q.f137257s.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: q */
    public void mo87709q(C31980jc c31980jc) {
        C32123ta c32123ta;
        BaseStoryItemView.InterfaceC16456f interfaceC16456f;
        super.mo87709q(c31980jc);
        float f11 = this.f83113d0;
        this.f83106T = f11;
        this.f83105S.setTranslationY(f11);
        C29895kd c29895kd = null;
        if (c31980jc != null) {
            c32123ta = c31980jc.m153825r();
        } else {
            c32123ta = null;
        }
        if (c32123ta != null && (interfaceC16456f = this.f83140w0) != null) {
            C32123ta m153825r = c31980jc.m153825r();
            AbstractC19074t.m100205c(m153825r);
            interfaceC16456f.mo84784s(m153825r.f148138h);
        }
        C29895kd c29895kd2 = this.f83512y0;
        if (c29895kd2 == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
        } else {
            c29895kd = c29895kd2;
        }
        c29895kd.f138503r.scrollTo(0, 0);
    }

    /* renamed from: q0 */
    public final void m88093q0() {
        C29895kd c29895kd = this.f83512y0;
        if (c29895kd == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29895kd = null;
        }
        Editable text = c29895kd.f138502q.f137256r.getText();
        if (text != null) {
            AbstractC19074t.m100205c(text);
            if (text.length() > 0) {
                c29895kd.f138503r.setHintTextMessage(String.valueOf(c29895kd.f138502q.f137256r.getText()));
                m88091k0();
                m87703b0(false);
            }
        }
        c29895kd.f138503r.setHintTextMessage(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_reaction_v2_send_message_hint));
        m88091k0();
        m87703b0(false);
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: r */
    public void mo87710r(C32123ta c32123ta) {
        super.mo87710r(c32123ta);
        AbstractC23136l9.m118744r1(this.f83100N, 8);
        this.f83143z.setOnClickListener(m87711s(1007));
        setBottomBarVisibility(0);
        m88089v0(c32123ta);
    }

    /* renamed from: r0 */
    public final void m88094r0() {
        C29895kd c29895kd = this.f83512y0;
        if (c29895kd == null) {
            AbstractC19074t.m100223u("stubBottomLayoutBinding");
            c29895kd = null;
        }
        if (m88092o0()) {
            c29895kd.f138504s.post(new Runnable() { // from class: com.zing.zalo.uicontrol.q1
                @Override // java.lang.Runnable
                public final void run() {
                    StoryFriendItemView.m88086s0(StoryFriendItemView.this);
                }
            });
            if (!c29895kd.f138502q.f137256r.isFocused()) {
                c29895kd.f138502q.f137256r.requestFocus();
            }
            m87703b0(true);
        }
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: x */
    protected void mo87715x() {
        ViewStub viewStub = (ViewStub) findViewById(AbstractC6918a0.stub_story_item_view_bottom_layout);
        if (viewStub != null) {
            viewStub.setLayoutResource(AbstractC7409c0.story_reaction_message_view);
            viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: com.zing.zalo.uicontrol.m1
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub2, View view) {
                    StoryFriendItemView.m88082l0(StoryFriendItemView.this, viewStub2, view);
                }
            });
            this.f83103Q = viewStub.inflate();
            C29895kd c29895kd = this.f83512y0;
            if (c29895kd == null) {
                AbstractC19074t.m100223u("stubBottomLayoutBinding");
                c29895kd = null;
            }
            c29895kd.f138503r.setTouchEventListener(new C16520b());
            c29895kd.f138503r.setReactionClickListener(this.f83511C0);
            c29895kd.f138503r.setHintTextMessage(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_reaction_v2_send_message_hint));
            c29895kd.f138503r.setHintTextClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.n1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoryFriendItemView.m88083m0(StoryFriendItemView.this, view);
                }
            });
            C29715ad c29715ad = c29895kd.f138502q;
            c29715ad.f137256r.addTextChangedListener(this.f83513z0);
            c29715ad.f137256r.setOnEditorActionListener(this.f83509A0);
            this.f83510B0 = new C16572d1(c29715ad.f137256r, false, null);
            c29715ad.f137255q.setEnabled(!TextUtils.isEmpty(c29715ad.f137256r.getText()));
            c29715ad.f137255q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.o1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoryFriendItemView.m88084n0(StoryFriendItemView.this, view);
                }
            });
        }
    }
}
