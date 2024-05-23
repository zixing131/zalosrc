package com.zing.zalo.uicontrol;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicontrol.BaseStoryItemView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p133ek.AbstractC18458a;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p649xl.C29751cd;
import p716zh.C31980jc;
import p716zh.C32123ta;

/* loaded from: classes4.dex */
public final class StoryIntroItemView extends BaseStoryItemView {

    /* renamed from: y0 */
    private C29751cd f83517y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryIntroItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m88097g0(StoryIntroItemView storyIntroItemView, ViewStub viewStub, View view) {
        AbstractC19074t.m100208f(storyIntroItemView, "this$0");
        C29751cd m147821a = C29751cd.m147821a(view);
        AbstractC19074t.m100207e(m147821a, "bind(...)");
        storyIntroItemView.f83517y0 = m147821a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m88098h0(StoryIntroItemView storyIntroItemView, View view) {
        String str;
        C32123ta c32123ta;
        BaseStoryItemView.InterfaceC16456f interfaceC16456f;
        C32123ta m153825r;
        AbstractC19074t.m100208f(storyIntroItemView, "this$0");
        C31980jc c31980jc = storyIntroItemView.f83110a0;
        if (c31980jc != null && (m153825r = c31980jc.m153825r()) != null) {
            str = m153825r.f148106I;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            AbstractC23647d.m123897g("491500710");
            C31980jc c31980jc2 = storyIntroItemView.f83110a0;
            if (c31980jc2 != null) {
                c32123ta = c31980jc2.m153825r();
            } else {
                c32123ta = null;
            }
            if (c32123ta != null && (interfaceC16456f = storyIntroItemView.f83140w0) != null) {
                interfaceC16456f.mo84779n(c32123ta.f148106I, c32123ta.f148110M, null);
                return;
            }
            return;
        }
        AbstractC23647d.m123897g("49150046");
        BaseStoryItemView.InterfaceC16456f interfaceC16456f2 = storyIntroItemView.f83140w0;
        if (interfaceC16456f2 != null) {
            interfaceC16456f2.mo84759G();
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
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: P */
    public void mo87691P(boolean z11) {
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
        return false;
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: T */
    public boolean mo87695T() {
        return false;
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
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    public String getStoryMessageToSend() {
        return "";
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: q */
    public void mo87709q(C31980jc c31980jc) {
        super.mo87709q(c31980jc);
        AbstractC23136l9.m118744r1(this.f83142y, 0);
        AbstractC23136l9.m118744r1(this.f83143z, 8);
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: r */
    public void mo87710r(C32123ta c32123ta) {
        super.mo87710r(c32123ta);
        if (c32123ta == null) {
            return;
        }
        String str = c32123ta.f148106I;
        AbstractC19074t.m100207e(str, "quickActionId");
        if (str.length() > 0) {
            setBottomBarVisibility(0);
            String str2 = AbstractC18458a.f93019a;
            C23528a c23528a = this.f83109W;
            C29751cd c29751cd = this.f83517y0;
            C29751cd c29751cd2 = null;
            if (c29751cd == null) {
                AbstractC19074t.m100223u("stubBottomLayoutBinding");
                c29751cd = null;
            }
            ((C23528a) c23528a.m123612r(c29751cd.f137444q)).m123618x(c32123ta.f148109L, C23278z2.m120146o0());
            String str3 = c32123ta.f148108K;
            AbstractC19074t.m100207e(str3, "quickActionNameEn");
            if (str3.length() > 0 && (AbstractC19074t.m100204b(str2, "en") || AbstractC19074t.m100204b(str2, "my"))) {
                C29751cd c29751cd3 = this.f83517y0;
                if (c29751cd3 == null) {
                    AbstractC19074t.m100223u("stubBottomLayoutBinding");
                } else {
                    c29751cd2 = c29751cd3;
                }
                c29751cd2.f137445r.setText(c32123ta.f148108K);
                return;
            }
            C29751cd c29751cd4 = this.f83517y0;
            if (c29751cd4 == null) {
                AbstractC19074t.m100223u("stubBottomLayoutBinding");
            } else {
                c29751cd2 = c29751cd4;
            }
            c29751cd2.f137445r.setText(c32123ta.f148107J);
            return;
        }
        setBottomBarVisibility(8);
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
        if (c32123ta == null || (str = c32123ta.f148106I) == null || str.length() == 0) {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(this.f83103Q, i11);
    }

    @Override // com.zing.zalo.uicontrol.BaseStoryItemView
    /* renamed from: x */
    protected void mo87715x() {
        RelativeLayout.LayoutParams layoutParams;
        ViewStub viewStub = (ViewStub) findViewById(AbstractC6918a0.stub_story_item_view_bottom_layout);
        if (viewStub != null) {
            ViewGroup.LayoutParams layoutParams2 = viewStub.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = -2;
            }
            ViewGroup.LayoutParams layoutParams3 = viewStub.getLayoutParams();
            if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                layoutParams = (RelativeLayout.LayoutParams) layoutParams3;
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.addRule(14, -1);
            }
            viewStub.setLayoutResource(AbstractC7409c0.story_details_item_view_bottom_layout_intro);
            viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: com.zing.zalo.uicontrol.r1
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub2, View view) {
                    StoryIntroItemView.m88097g0(StoryIntroItemView.this, viewStub2, view);
                }
            });
            View inflate = viewStub.inflate();
            this.f83103Q = inflate;
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.s1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoryIntroItemView.m88098h0(StoryIntroItemView.this, view);
                }
            });
        }
    }
}
