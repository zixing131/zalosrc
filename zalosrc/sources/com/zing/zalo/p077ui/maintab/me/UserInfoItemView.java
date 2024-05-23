package com.zing.zalo.p077ui.maintab.me;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import bi0.AbstractC2808b;
import bi0.AbstractC2811e;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.maintab.me.UserInfoItemView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zdesign.component.list.ListItemMeTab;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19074t;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p055ce.AbstractC3439h;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import r70.C25687s;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class UserInfoItemView extends ListItemMeTab {

    /* renamed from: A */
    private boolean f63437A;

    /* renamed from: B */
    private InterfaceC12157a f63438B;

    /* renamed from: com.zing.zalo.ui.maintab.me.UserInfoItemView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC12157a {
        /* renamed from: b */
        void mo67976b();

        /* renamed from: d */
        void mo67977d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoItemView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m67993k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m67983j(UserInfoItemView userInfoItemView, View view) {
        AbstractC19074t.m100208f(userInfoItemView, "this$0");
        InterfaceC12157a interfaceC12157a = userInfoItemView.f63438B;
        if (interfaceC12157a != null) {
            interfaceC12157a.mo67977d();
        }
    }

    /* renamed from: l */
    private final void m67984l(String str) {
        List m131496e;
        Avatar avtLeft = getAvtLeft();
        m131496e = AbstractC25366r.m131496e(str);
        avtLeft.m90480p(m131496e);
    }

    /* renamed from: m */
    private final void m67985m(String str) {
        setSubtitle(str);
        TextView textView = (TextView) findViewById(AbstractC2811e.subtitle_list_me_tab);
        if (textView != null) {
            AbstractC3439h.m17291y(textView, str, 0, 4, null);
        }
    }

    /* renamed from: n */
    private final void m67986n(String str) {
        if (str.length() > 0) {
            setTitle(str);
        }
    }

    /* renamed from: p */
    private final void m67987p(boolean z11, boolean z12) {
        if (z11) {
            getGlowingReddot().setVisibility(0);
            if (z12 && !this.f63437A) {
                getGlowingReddot().m90573f(4000L);
                this.f63437A = true;
                return;
            }
            return;
        }
        getGlowingReddot().m90574g();
        getGlowingReddot().setVisibility(8);
    }

    /* renamed from: q */
    private final void m67988q(String str) {
        setSubtitle(str);
    }

    /* renamed from: r */
    private final void m67989r(List list) {
        List m131505m;
        List m131505m2;
        List m131496e;
        if (list.size() > 1) {
            if (list.size() == 2) {
                Avatar avtRight = getAvtRight();
                m131496e = AbstractC25366r.m131496e(((ContactProfile) list.get(1)).f42434r);
                avtRight.m90480p(m131496e);
                Avatar avtRight2 = getAvtRight();
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                avtRight2.m90481x(context, EnumC16949e.SIZE_24);
                getAvtRight().requestLayout();
            } else if (list.size() == 3) {
                Avatar avtRight3 = getAvtRight();
                m131505m2 = AbstractC25368s.m131505m(((ContactProfile) list.get(1)).f42434r, ((ContactProfile) list.get(2)).f42434r);
                avtRight3.m90480p(m131505m2);
                Avatar avtRight4 = getAvtRight();
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                avtRight4.m90481x(context2, EnumC16949e.SIZE_48);
                getAvtRight().requestLayout();
            } else if (list.size() > 3) {
                Avatar avtRight5 = getAvtRight();
                m131505m = AbstractC25368s.m131505m(((ContactProfile) list.get(1)).f42434r, "+" + (list.size() - 2));
                avtRight5.m90480p(m131505m);
                Avatar avtRight6 = getAvtRight();
                Context context3 = getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                avtRight6.m90481x(context3, EnumC16949e.SIZE_48);
                getAvtRight().requestLayout();
            }
            m91072e(true);
            getAvtRight().setOnClickListener(new View.OnClickListener() { // from class: r70.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserInfoItemView.m67990s(UserInfoItemView.this, view);
                }
            });
            return;
        }
        m91072e(false);
        TrackingImageView iconRight = getIconRight();
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        iconRight.setImageDrawable(C27280g.m139659b(context4, AbstractC23322a.zds_ic_switch_users_line_24, AbstractC2808b.f150820b50));
        getIconRight().setOnClickListener(new View.OnClickListener() { // from class: r70.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoItemView.m67991u(UserInfoItemView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m67990s(UserInfoItemView userInfoItemView, View view) {
        AbstractC19074t.m100208f(userInfoItemView, "this$0");
        InterfaceC12157a interfaceC12157a = userInfoItemView.f63438B;
        if (interfaceC12157a != null) {
            interfaceC12157a.mo67976b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m67991u(UserInfoItemView userInfoItemView, View view) {
        AbstractC19074t.m100208f(userInfoItemView, "this$0");
        InterfaceC12157a interfaceC12157a = userInfoItemView.f63438B;
        if (interfaceC12157a != null) {
            interfaceC12157a.mo67976b();
        }
    }

    public final InterfaceC12157a getListener() {
        return this.f63438B;
    }

    public final boolean getRunAnimRedDot() {
        return this.f63437A;
    }

    /* renamed from: i */
    public final void m67992i(C25687s c25687s) {
        if (c25687s == null) {
            return;
        }
        m67984l(c25687s.m132593j());
        m67986n(c25687s.m132588e());
        if (c25687s.m132587d().length() > 0) {
            m67985m(c25687s.m132587d());
        } else {
            m67988q(c25687s.m132592i());
        }
        m67987p(c25687s.m132591h(), c25687s.m132589f());
        m67989r(c25687s.m132590g());
        setOnClickListener(new View.OnClickListener() { // from class: r70.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoItemView.m67983j(UserInfoItemView.this, view);
            }
        });
    }

    /* renamed from: k */
    public final void m67993k() {
        setIdTracking("tab_me_profile_me");
        getAvtRight().setIdTracking("tab_me_switch_account");
        getIconRight().setIdTracking("tab_me_switch_account");
        getIconNotify().setVisibility(8);
        getGlowingReddot().m90571c(AbstractC23136l9.m118742r(10.0f), Color.parseColor("#ff565d"), ZAbstractBase.ZVU_PROCESS_FLUSH, 0, 1, 3, 300);
        getGlowingReddot().setTopLayerSize(AbstractC23136l9.m118742r(6.0f));
        getGlowingReddot().setTopLayerColor(Color.parseColor("#ff565d"));
        getGlowingReddot().setBottomLayerSize(AbstractC23136l9.m118742r(8.0f));
        getGlowingReddot().setBottomLayerColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
    }

    public final void setListener(InterfaceC12157a interfaceC12157a) {
        this.f63438B = interfaceC12157a;
    }

    public final void setRunAnimRedDot(boolean z11) {
        this.f63437A = z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        m67993k();
    }
}
