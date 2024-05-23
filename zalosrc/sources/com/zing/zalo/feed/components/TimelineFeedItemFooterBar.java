package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import ao.InterfaceC2259a;
import bo.C2976g1;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3039t0;
import com.zing.zalo.feed.reactions.p065ui.TimelineFeedCommentButton;
import com.zing.zalo.feed.uicontrols.FeedLikeButtonModulesView;
import com.zing.zalo.feed.uicontrols.suggestcomment.C8890a;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.Divider;
import fn0.AbstractC19074t;
import java.util.List;
import me0.AbstractC23222t7;
import p167fs.C19136a;
import p167fs.C19140e;
import p649xl.C29977p5;
import p691yr.C31060j;
import p691yr.C31063m;
import p716zh.C32002l4;
import p726zr.C32546b;
import pr.C24906b;
import qm0.AbstractC25368s;
import ti0.C26703b;
import ti0.C26708g;

/* loaded from: classes4.dex */
public final class TimelineFeedItemFooterBar extends RelativeLayout {

    /* renamed from: p */
    private C29977p5 f45153p;

    /* renamed from: q */
    private C3000l0 f45154q;

    /* renamed from: r */
    private InterfaceC2259a f45155r;

    /* renamed from: s */
    private int f45156s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFeedItemFooterBar(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        C29977p5 m148360c = C29977p5.m148360c(LayoutInflater.from(getContext()), this, true);
        AbstractC19074t.m100207e(m148360c, "inflate(...)");
        this.f45153p = m148360c;
        RelativeLayout relativeLayout = m148360c.f138957s;
        C31060j c31060j = C31060j.f143193a;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        relativeLayout.setBackground(c31060j.m150941g(0, context2, C31063m.a.f143211q));
        FeedLikeButtonModulesView feedLikeButtonModulesView = this.f45153p.f138958t;
        int i11 = AbstractC23222t7.f112514B;
        feedLikeButtonModulesView.m47306V(0, i11, i11);
        this.f45153p.f138958t.m47308X(false, 0);
        C19140e c19140e = C19140e.f95172a;
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        C26703b m100454d = c19140e.m100454d(context3);
        RobotoTextView robotoTextView = this.f45153p.f138959u;
        AbstractC19074t.m100207e(robotoTextView, "btnLikeText");
        new C26708g(robotoTextView).m137319a(m100454d);
    }

    /* renamed from: d */
    private final void m44530d(int i11, int i12, int i13, int i14) {
        ViewGroup.LayoutParams layoutParams = this.f45153p.f138955q.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i11, i12, i13, i14);
        }
    }

    /* renamed from: e */
    private final C32002l4 m44531e(C3000l0 c3000l0) {
        int i11;
        if (c3000l0 != null && c3000l0.m14287D0()) {
            i11 = 10002;
        } else {
            i11 = 10031;
        }
        return C32002l4.Companion.m154287a(i11);
    }

    /* renamed from: f */
    private final void m44532f() {
        C3020p0 m14324b0;
        InterfaceC2259a interfaceC2259a;
        C3000l0 c3000l0 = this.f45154q;
        if (c3000l0 != null && (m14324b0 = c3000l0.m14324b0(this.f45156s)) != null && (interfaceC2259a = this.f45155r) != null) {
            interfaceC2259a.mo11930Q2(m14324b0, m44531e(c3000l0));
        }
    }

    /* renamed from: g */
    private final boolean m44533g() {
        C3020p0 m14324b0;
        C3000l0 c3000l0 = this.f45154q;
        if (c3000l0 == null || (m14324b0 = c3000l0.m14324b0(this.f45156s)) == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.f45153p.f138957s.getLocationOnScreen(iArr);
        InterfaceC2259a interfaceC2259a = this.f45155r;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11972v3(m14324b0, m44531e(c3000l0), iArr[0], iArr[1], this.f45153p.f138957s.getHeight());
        }
        return true;
    }

    /* renamed from: h */
    private final void m44534h(boolean z11) {
        C3020p0 m14324b0;
        int i11;
        C3000l0 c3000l0 = this.f45154q;
        if (c3000l0 == null || (m14324b0 = c3000l0.m14324b0(this.f45156s)) == null) {
            return;
        }
        m44541q(c3000l0, m14324b0);
        m44543s(m14324b0);
        m44542r(m14324b0, c3000l0, z11);
        m44540p(m14324b0);
        View view = this.f45153p.f138960v;
        if (m14324b0.f12027G) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        m44539n();
    }

    /* renamed from: j */
    private final void m44535j() {
        this.f45153p.f138957s.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.feed.components.h7
            public /* synthetic */ ViewOnLongClickListenerC8295h7() {
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m44536k;
                m44536k = TimelineFeedItemFooterBar.m44536k(TimelineFeedItemFooterBar.this, view);
                return m44536k;
            }
        });
        this.f45153p.f138957s.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.i7
            public /* synthetic */ ViewOnClickListenerC8304i7() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TimelineFeedItemFooterBar.m44537l(TimelineFeedItemFooterBar.this, view);
            }
        });
        this.f45153p.f138956r.getCommentBarView().setFeedCallback(this.f45155r);
    }

    /* renamed from: k */
    public static final boolean m44536k(TimelineFeedItemFooterBar timelineFeedItemFooterBar, View view) {
        AbstractC19074t.m100208f(timelineFeedItemFooterBar, "this$0");
        return timelineFeedItemFooterBar.m44533g();
    }

    /* renamed from: l */
    public static final void m44537l(TimelineFeedItemFooterBar timelineFeedItemFooterBar, View view) {
        AbstractC19074t.m100208f(timelineFeedItemFooterBar, "this$0");
        C19136a c19136a = C19136a.f95164a;
        AbstractC19074t.m100205c(view);
        C19136a.m100435d(c19136a, view, 0.0f, null, 6, null);
        timelineFeedItemFooterBar.m44532f();
    }

    /* renamed from: m */
    public static final void m44538m(View.OnClickListener onClickListener, C16719g c16719g) {
        AbstractC19074t.m100208f(onClickListener, "$onClickListener");
        onClickListener.onClick(c16719g.m89119T());
    }

    /* renamed from: n */
    private final void m44539n() {
        int i11 = AbstractC23222t7.f112576o;
        TimelineFeedFooterReactionDescription timelineFeedFooterReactionDescription = this.f45153p.f138962x;
        AbstractC19074t.m100207e(timelineFeedFooterReactionDescription, "likeDescription");
        if (timelineFeedFooterReactionDescription.getVisibility() == 0) {
            m44530d(0, 0, 0, i11);
        } else {
            m44530d(0, i11, 0, i11);
        }
    }

    /* renamed from: p */
    private final void m44540p(C3020p0 c3020p0) {
        int i11;
        int i12;
        C3039t0 c3039t0 = c3020p0.f12025E;
        if (c3039t0 != null) {
            i11 = c3039t0.f12244b;
        } else {
            i11 = 0;
        }
        if (c3039t0 != null) {
            i12 = c3039t0.f12243a;
        } else {
            i12 = 0;
        }
        if (i11 <= 0 && i12 <= 0) {
            this.f45153p.f138962x.setVisibility(8);
        } else {
            this.f45153p.f138962x.m44526V(c3020p0);
            this.f45153p.f138962x.setVisibility(0);
        }
    }

    /* renamed from: q */
    private final void m44541q(C3000l0 c3000l0, C3020p0 c3020p0) {
        boolean z11;
        if (c3000l0 != null && c3020p0 != null) {
            int i11 = 0;
            if (!c3000l0.m14300I0() && !c3020p0.m14470C0() && !c3020p0.m14468B0() && !c3020p0.m14486Q()) {
                z11 = false;
            } else {
                z11 = true;
            }
            Divider divider = this.f45153p.f138963y;
            if (z11) {
                i11 = 8;
            }
            divider.setVisibility(i11);
        }
    }

    /* renamed from: r */
    private final void m44542r(C3020p0 c3020p0, C3000l0 c3000l0, boolean z11) {
        List m131502j;
        C24906b c24906b = C24906b.f119505a;
        String str = c3020p0.f12057p;
        AbstractC19074t.m100207e(str, "fid");
        C2976g1 m129551v = c24906b.m129551v(str);
        if (m129551v == null || !m129551v.m14120h() || m129551v == null || (m131502j = m129551v.m14117c()) == null) {
            m131502j = AbstractC25368s.m131502j();
        }
        List list = m131502j;
        TimelineFeedCommentButton.EnumC8850a enumC8850a = TimelineFeedCommentButton.EnumC8850a.f47295q;
        String str2 = c3020p0.f12057p;
        AbstractC19074t.m100207e(str2, "fid");
        this.f45153p.f138956r.m47280c(enumC8850a, new TimelineFeedCommentButton.C8852c(list, str2, false, c3020p0, c3000l0));
        this.f45153p.f138956r.setEnabled(!c3020p0.m14493X());
    }

    /* renamed from: s */
    private final void m44543s(C3020p0 c3020p0) {
        int i11;
        C32546b c32546b;
        if (c3020p0.f12064w) {
            C3039t0 c3039t0 = c3020p0.f12025E;
            if (c3039t0 != null && (c32546b = c3039t0.f12247e) != null) {
                i11 = c32546b.m157605a();
            } else {
                i11 = 1;
            }
            this.f45153p.f138958t.m47308X(true, i11);
            FeedLikeButtonModulesView feedLikeButtonModulesView = this.f45153p.f138958t;
            int i12 = AbstractC23222t7.f112594x;
            feedLikeButtonModulesView.m47307W(i12, i12);
            this.f45153p.f138957s.setPadding(AbstractC23222t7.f112576o, AbstractC23222t7.f112558f, AbstractC23222t7.f112576o, AbstractC23222t7.f112558f);
            RelativeLayout relativeLayout = this.f45153p.f138957s;
            C31060j c31060j = C31060j.f143193a;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C31063m.a aVar = C31063m.a.f143211q;
            relativeLayout.setBackground(c31060j.m150941g(i11, context, aVar));
            RobotoTextView robotoTextView = this.f45153p.f138959u;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            robotoTextView.setTextColor(c31060j.m150933J(i11, context2, aVar));
            RobotoTextView robotoTextView2 = this.f45153p.f138959u;
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            robotoTextView2.setText(c31060j.m150931H(i11, context3));
        } else {
            this.f45153p.f138958t.m47308X(false, 0);
            FeedLikeButtonModulesView feedLikeButtonModulesView2 = this.f45153p.f138958t;
            int i13 = AbstractC23222t7.f112514B;
            feedLikeButtonModulesView2.m47307W(i13, i13);
            this.f45153p.f138957s.setPadding(AbstractC23222t7.f112572m, AbstractC23222t7.f112556e, AbstractC23222t7.f112572m, AbstractC23222t7.f112556e);
            RelativeLayout relativeLayout2 = this.f45153p.f138957s;
            C31060j c31060j2 = C31060j.f143193a;
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "getContext(...)");
            C31063m.a aVar2 = C31063m.a.f143211q;
            relativeLayout2.setBackground(c31060j2.m150941g(0, context4, aVar2));
            RobotoTextView robotoTextView3 = this.f45153p.f138959u;
            Context context5 = getContext();
            AbstractC19074t.m100207e(context5, "getContext(...)");
            robotoTextView3.setTextColor(c31060j2.m150933J(0, context5, aVar2));
            RobotoTextView robotoTextView4 = this.f45153p.f138959u;
            Context context6 = getContext();
            AbstractC19074t.m100207e(context6, "getContext(...)");
            robotoTextView4.setText(c31060j2.m150931H(0, context6));
        }
        this.f45153p.f138958t.requestLayout();
        this.f45153p.f138957s.setEnabled(!c3020p0.m14493X());
    }

    /* renamed from: i */
    public final void m44544i(C3000l0 c3000l0, int i11, InterfaceC2259a interfaceC2259a, boolean z11) {
        this.f45154q = c3000l0;
        this.f45155r = interfaceC2259a;
        this.f45156s = i11;
        m44535j();
        m44534h(z11);
    }

    public final void setOnCommentClickListener(View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(onClickListener, "onClickListener");
        this.f45153p.f138956r.getCommentButtonMini().setOnClickListener(onClickListener);
        this.f45153p.f138962x.getReactionStatusView().m96053y1(new C16719g.c() { // from class: com.zing.zalo.feed.components.g7

            /* renamed from: p */
            public final /* synthetic */ View.OnClickListener f45370p;

            public /* synthetic */ C8286g7(View.OnClickListener onClickListener2) {
                r1 = onClickListener2;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                TimelineFeedItemFooterBar.m44538m(r1, c16719g);
            }
        });
    }

    public final void setOnLikeDescriptionClickListener(C16719g.c cVar) {
        AbstractC19074t.m100208f(cVar, "onClickListener");
        this.f45153p.f138962x.getReactionStatusView().m96052x1(cVar);
    }

    public final void setOnSuggestCommentListener(C8890a.f fVar) {
        AbstractC19074t.m100208f(fVar, "listener");
        this.f45153p.f138956r.getCommentBarView().setOnSuggestCommentClickListener(fVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFeedItemFooterBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attributeSet");
        C29977p5 m148360c = C29977p5.m148360c(LayoutInflater.from(getContext()), this, true);
        AbstractC19074t.m100207e(m148360c, "inflate(...)");
        this.f45153p = m148360c;
        RelativeLayout relativeLayout = m148360c.f138957s;
        C31060j c31060j = C31060j.f143193a;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        relativeLayout.setBackground(c31060j.m150941g(0, context2, C31063m.a.f143211q));
        FeedLikeButtonModulesView feedLikeButtonModulesView = this.f45153p.f138958t;
        int i11 = AbstractC23222t7.f112514B;
        feedLikeButtonModulesView.m47306V(0, i11, i11);
        this.f45153p.f138958t.m47308X(false, 0);
        C19140e c19140e = C19140e.f95172a;
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        C26703b m100454d = c19140e.m100454d(context3);
        RobotoTextView robotoTextView = this.f45153p.f138959u;
        AbstractC19074t.m100207e(robotoTextView, "btnLikeText");
        new C26708g(robotoTextView).m137319a(m100454d);
    }
}
