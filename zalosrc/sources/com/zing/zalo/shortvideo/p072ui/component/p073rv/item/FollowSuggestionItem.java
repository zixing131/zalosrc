package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.AbstractC1415b;
import b20.C2495a;
import c20.C3211a;
import c20.C3226p;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9765a;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.ChannelReceiver;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import e10.C18168e;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pm0.C24848g0;
import q10.C25041p;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import w00.AbstractC28684a;
import x00.InterfaceC29283d;
import z10.C31162f;

/* loaded from: classes5.dex */
public final class FollowSuggestionItem extends FrameLayout {

    /* renamed from: A */
    private C31162f f50653A;

    /* renamed from: B */
    private C9765a f50654B;

    /* renamed from: C */
    private ChannelReceiver f50655C;

    /* renamed from: D */
    private C25041p f50656D;

    /* renamed from: p */
    private InterfaceC9589a f50657p;

    /* renamed from: q */
    private final int f50658q;

    /* renamed from: r */
    private final int f50659r;

    /* renamed from: s */
    private final int f50660s;

    /* renamed from: t */
    private final int f50661t;

    /* renamed from: u */
    private final int f50662u;

    /* renamed from: v */
    private final int f50663v;

    /* renamed from: w */
    private int f50664w;

    /* renamed from: x */
    private boolean f50665x;

    /* renamed from: y */
    private boolean f50666y;

    /* renamed from: z */
    private boolean f50667z;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.FollowSuggestionItem$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9589a {
        /* renamed from: a */
        void mo52130a(Channel channel, boolean z11);

        /* renamed from: b */
        void mo52131b(Channel channel, String str);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.FollowSuggestionItem$b */
    /* loaded from: classes5.dex */
    static final class C9590b extends AbstractC19075u implements InterfaceC18509p {
        C9590b() {
            super(2);
        }

        /* renamed from: a */
        public final void m52132a(String str, PersonalizeChannel personalizeChannel) {
            ArrayList m151557M;
            C9765a c9765a;
            C9765a c9765a2;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            C31162f c31162f = FollowSuggestionItem.this.f50653A;
            if (c31162f != null && (m151557M = c31162f.m151557M()) != null) {
                FollowSuggestionItem followSuggestionItem = FollowSuggestionItem.this;
                int i11 = 0;
                for (Object obj : m151557M) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    Channel channel = (Channel) obj;
                    if (AbstractC19074t.m100204b(channel.m50769l(), str) && channel.m50741Q() != personalizeChannel.m51104c()) {
                        channel.m50770l0(personalizeChannel.m51104c());
                        C31162f c31162f2 = followSuggestionItem.f50653A;
                        if (c31162f2 != null) {
                            c31162f2.m10010r(i11, new Object());
                        }
                        if (channel.m50741Q() && (c9765a = followSuggestionItem.f50654B) != null && c9765a.m52653l() == i11 && (c9765a2 = followSuggestionItem.f50654B) != null) {
                            c9765a2.m52658r();
                        }
                    }
                    i11 = i12;
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m52132a((String) obj, (PersonalizeChannel) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.FollowSuggestionItem$c */
    /* loaded from: classes5.dex */
    public static final class C9591c implements C31162f.a {

        /* renamed from: a */
        final /* synthetic */ C25041p f50669a;

        /* renamed from: b */
        final /* synthetic */ FollowSuggestionItem f50670b;

        C9591c(C25041p c25041p, FollowSuggestionItem followSuggestionItem) {
            this.f50669a = c25041p;
            this.f50670b = followSuggestionItem;
        }

        @Override // z10.C31162f.a
        /* renamed from: a */
        public void mo52133a(Channel channel, boolean z11) {
            AbstractC19074t.m100208f(channel, "channel");
            InterfaceC9589a callback = this.f50670b.getCallback();
            if (callback != null) {
                callback.mo52130a(channel, z11);
            }
        }

        @Override // z10.C31162f.a
        /* renamed from: b */
        public void mo52134b(Channel channel, int i11, String str) {
            C9765a c9765a;
            AbstractC19074t.m100208f(channel, "channel");
            if (this.f50669a.f120170q.getScrollState() == 0 && (c9765a = this.f50670b.f50654B) != null) {
                int m52653l = c9765a.m52653l();
                if (m52653l > i11) {
                    C9765a c9765a2 = this.f50670b.f50654B;
                    if (c9765a2 != null) {
                        c9765a2.m52657q();
                        return;
                    }
                    return;
                }
                if (m52653l < i11) {
                    C9765a c9765a3 = this.f50670b.f50654B;
                    if (c9765a3 != null) {
                        c9765a3.m52658r();
                        return;
                    }
                    return;
                }
                InterfaceC9589a callback = this.f50670b.getCallback();
                if (callback != null) {
                    callback.mo52131b(channel, str);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowSuggestionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50658q = AbstractC26112n.m134365F(this);
        this.f50659r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_header_height);
        this.f50660s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_footer_height);
        this.f50661t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_follow_suggestion_info_margin_top);
        this.f50662u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_follow_suggestion_title_to_message);
        this.f50663v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_follow_suggestion_message_to_channels);
        this.f50665x = true;
        this.f50666y = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m52120i(C25041p c25041p, final FollowSuggestionItem followSuggestionItem) {
        AbstractC19074t.m100208f(c25041p, "$this_run");
        AbstractC19074t.m100208f(followSuggestionItem, "this$0");
        c25041p.f120170q.m9837K1(0);
        followSuggestionItem.f50667z = false;
        followSuggestionItem.post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.m
            @Override // java.lang.Runnable
            public final void run() {
                FollowSuggestionItem.m52121j(FollowSuggestionItem.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m52121j(FollowSuggestionItem followSuggestionItem) {
        AbstractC19074t.m100208f(followSuggestionItem, "this$0");
        if (followSuggestionItem.f50666y && followSuggestionItem.isAttachedToWindow()) {
            followSuggestionItem.f50666y = false;
            C9765a c9765a = followSuggestionItem.f50654B;
            if (c9765a != null) {
                c9765a.m52655o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m52122k(FollowSuggestionItem followSuggestionItem) {
        AbstractC19074t.m100208f(followSuggestionItem, "this$0");
        if (followSuggestionItem.f50666y && followSuggestionItem.isAttachedToWindow()) {
            followSuggestionItem.f50666y = false;
            C9765a c9765a = followSuggestionItem.f50654B;
            if (c9765a != null) {
                c9765a.m52655o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m52123n(FollowSuggestionItem followSuggestionItem) {
        AbstractC19074t.m100208f(followSuggestionItem, "this$0");
        if (followSuggestionItem.f50666y && followSuggestionItem.isAttachedToWindow()) {
            followSuggestionItem.f50666y = false;
            C9765a c9765a = followSuggestionItem.f50654B;
            if (c9765a != null) {
                c9765a.m52655o();
            }
        }
    }

    /* renamed from: p */
    private final void m52124p(boolean z11) {
        ArrayList m151557M;
        boolean booleanValue;
        C9765a c9765a;
        if (this.f50665x) {
            int i11 = 0;
            this.f50665x = false;
            InterfaceC29283d m143692z = AbstractC28684a.Companion.m143692z();
            C31162f c31162f = this.f50653A;
            if (c31162f != null && (m151557M = c31162f.m151557M()) != null) {
                for (Object obj : m151557M) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    Channel channel = (Channel) obj;
                    Boolean mo146377p = m143692z.mo146377p(channel.m50769l());
                    if (mo146377p != null && channel.m50741Q() != (booleanValue = mo146377p.booleanValue())) {
                        channel.m50770l0(booleanValue);
                        if (z11) {
                            C9765a c9765a2 = this.f50654B;
                            if (c9765a2 != null && c9765a2.m52653l() == i11 && (c9765a = this.f50654B) != null) {
                                c9765a.m52658r();
                            }
                            C31162f c31162f2 = this.f50653A;
                            if (c31162f2 != null) {
                                c31162f2.m10010r(i11, new Object());
                            }
                        }
                    }
                    i11 = i12;
                }
            }
        }
    }

    /* renamed from: q */
    static /* synthetic */ void m52125q(FollowSuggestionItem followSuggestionItem, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        followSuggestionItem.m52124p(z11);
    }

    /* renamed from: g */
    public final void m52126g() {
        C9765a c9765a = this.f50654B;
        if (c9765a != null) {
            c9765a.m52650g();
        }
    }

    public final InterfaceC9589a getCallback() {
        return this.f50657p;
    }

    /* renamed from: h */
    public final void m52127h(BreakSlot breakSlot) {
        boolean z11;
        List m51168m;
        AbstractC19074t.m100208f(breakSlot, "suggestion");
        ArrayList m50682c = breakSlot.m50682c();
        if (m50682c != null) {
            Iterator it = m50682c.iterator();
            while (it.hasNext()) {
                Section m50732J = ((Channel) it.next()).m50732J();
                if (m50732J != null && (m51168m = m50732J.m51168m()) != null) {
                    Iterator it2 = m51168m.iterator();
                    while (it2.hasNext()) {
                        ((Video) it2.next()).m52868T0("suggest_channel");
                    }
                }
            }
        }
        final C25041p c25041p = this.f50656D;
        if (c25041p == null) {
            AbstractC19074t.m100223u("binding");
            c25041p = null;
        }
        c25041p.f120173t.setText(breakSlot.m50689j());
        c25041p.f120172s.setText(breakSlot.m50684e());
        C31162f c31162f = this.f50653A;
        AbstractC19074t.m100205c(c31162f);
        if (c31162f.mo10003k() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f50666y = z11;
        ArrayList m50682c2 = breakSlot.m50682c();
        if (m50682c2 == null) {
            m50682c2 = new ArrayList();
        }
        c31162f.m151562R(m50682c2);
        m52125q(this, false, 1, null);
        c31162f.m10008p();
        C9765a c9765a = this.f50654B;
        AbstractC19074t.m100205c(c9765a);
        if (c9765a.m52652k() > 0) {
            this.f50667z = true;
            post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.k
                @Override // java.lang.Runnable
                public final void run() {
                    FollowSuggestionItem.m52120i(C25041p.this, this);
                }
            });
        } else if (this.f50666y) {
            post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.l
                @Override // java.lang.Runnable
                public final void run() {
                    FollowSuggestionItem.m52122k(FollowSuggestionItem.this);
                }
            });
        }
    }

    /* renamed from: l */
    public final void m52128l(BreakSlot breakSlot, List list) {
        AbstractC19074t.m100208f(breakSlot, "suggestion");
        AbstractC19074t.m100208f(list, "payloads");
        this.f50665x = true;
        m52124p(true);
    }

    /* renamed from: m */
    public final void m52129m() {
        C9765a c9765a = this.f50654B;
        if (c9765a != null) {
            c9765a.m52651j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C25041p c25041p = this.f50656D;
        if (c25041p == null) {
            AbstractC19074t.m100223u("binding");
            c25041p = null;
        }
        FollowSuggestionVideoLayout followSuggestionVideoLayout = c25041p.f120171r;
        C18168e m96538b = C18168e.Companion.m96538b();
        C31162f c31162f = this.f50653A;
        AbstractC19074t.m100205c(c31162f);
        followSuggestionVideoLayout.setPlaylistId(m96538b.m96517x(c31162f));
        if (this.f50666y && !this.f50667z) {
            post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.j
                @Override // java.lang.Runnable
                public final void run() {
                    FollowSuggestionItem.m52123n(FollowSuggestionItem.this);
                }
            });
        }
        ChannelReceiver channelReceiver = new ChannelReceiver(null, null, null, null, new C9590b(), 15, null);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        channelReceiver.mo53685d(context);
        this.f50655C = channelReceiver;
        m52124p(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        C9765a c9765a;
        C18168e m96538b = C18168e.Companion.m96538b();
        C25041p c25041p = this.f50656D;
        if (c25041p == null) {
            AbstractC19074t.m100223u("binding");
            c25041p = null;
        }
        m96538b.m96512E(c25041p.f120171r.getPlaylistId());
        C9765a c9765a2 = this.f50654B;
        if (c9765a2 != null && c9765a2.m52654m() && (c9765a = this.f50654B) != null) {
            c9765a.m52651j();
        }
        ChannelReceiver channelReceiver = this.f50655C;
        if (channelReceiver != null) {
            channelReceiver.mo53687g();
        }
        super.onDetachedFromWindow();
        this.f50665x = true;
        this.f50666y = true;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25041p m129911a = C25041p.m129911a(this);
        AbstractC19074t.m100207e(m129911a, "bind(...)");
        setBackground(new BitmapDrawable(getResources(), AbstractC1415b.m7218b(AbstractC26112n.m134434z(this, AbstractC27408c.zch_layer_radial_blue), 0, 0, null, 7, null)));
        OverScrollableRecyclerView overScrollableRecyclerView = m129911a.f120170q;
        Context context = overScrollableRecyclerView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        overScrollableRecyclerView.setLayoutManager(new OverScrollableRecyclerView.LinearLayoutManager(context, 0, false, false, 12, null));
        C31162f c31162f = new C31162f(null, 1, 0 == true ? 1 : 0);
        c31162f.m151561Q(new C9591c(m129911a, this));
        this.f50653A = c31162f;
        overScrollableRecyclerView.setAdapter(c31162f);
        OverScrollableRecyclerView overScrollableRecyclerView2 = m129911a.f120170q;
        AbstractC19074t.m100207e(overScrollableRecyclerView2, "lstChannel");
        FollowSuggestionVideoLayout followSuggestionVideoLayout = m129911a.f120171r;
        AbstractC19074t.m100207e(followSuggestionVideoLayout, "lytVideo");
        C3211a c3211a = new C3211a();
        c3211a.mo10397b(m129911a.f120170q);
        C24848g0 c24848g0 = C24848g0.f119245a;
        C9765a c9765a = new C9765a(overScrollableRecyclerView2, followSuggestionVideoLayout, c3211a);
        this.f50654B = c9765a;
        overScrollableRecyclerView.m9826E(c9765a);
        overScrollableRecyclerView.m9816A(new C2495a());
        overScrollableRecyclerView.setHasFixedSize(true);
        overScrollableRecyclerView.setItemAnimator(null);
        this.f50656D = m129911a;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        float y11 = motionEvent.getY();
        C25041p c25041p = this.f50656D;
        C25041p c25041p2 = null;
        if (c25041p == null) {
            AbstractC19074t.m100223u("binding");
            c25041p = null;
        }
        if (y11 >= c25041p.f120170q.getTop()) {
            float y12 = motionEvent.getY();
            C25041p c25041p3 = this.f50656D;
            if (c25041p3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25041p2 = c25041p3;
            }
            if (y12 <= c25041p2.f120170q.getBottom()) {
                getParent().getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C25041p c25041p = this.f50656D;
        if (c25041p == null) {
            AbstractC19074t.m100223u("binding");
            c25041p = null;
        }
        int measuredWidth = (getMeasuredWidth() - c25041p.f120173t.getMeasuredWidth()) / 2;
        int i15 = this.f50664w;
        SimpleShadowTextView simpleShadowTextView = c25041p.f120173t;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtTitle");
        AbstractC26112n.m134383X(simpleShadowTextView, i15, measuredWidth);
        int measuredHeight = i15 + c25041p.f120173t.getMeasuredHeight() + this.f50662u;
        SimpleShadowTextView simpleShadowTextView2 = c25041p.f120172s;
        AbstractC19074t.m100207e(simpleShadowTextView2, "txtMessage");
        AbstractC26112n.m134383X(simpleShadowTextView2, measuredHeight, measuredWidth);
        int measuredHeight2 = measuredHeight + c25041p.f120172s.getMeasuredHeight() + this.f50663v;
        FollowSuggestionVideoLayout followSuggestionVideoLayout = c25041p.f120171r;
        AbstractC19074t.m100207e(followSuggestionVideoLayout, "lytVideo");
        AbstractC26112n.m134383X(followSuggestionVideoLayout, measuredHeight2, 0);
        OverScrollableRecyclerView overScrollableRecyclerView = c25041p.f120170q;
        AbstractC19074t.m100207e(overScrollableRecyclerView, "lstChannel");
        AbstractC26112n.m134383X(overScrollableRecyclerView, measuredHeight2, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25041p c25041p = this.f50656D;
        if (c25041p == null) {
            AbstractC19074t.m100223u("binding");
            c25041p = null;
        }
        int i14 = this.f50659r;
        int i15 = this.f50661t;
        int i16 = i14 + i15;
        this.f50664w = i16;
        int i17 = (size2 - i16) - i15;
        C3226p.a aVar = C3226p.Companion;
        if (aVar.m16363f()) {
            int i18 = this.f50664w;
            int i19 = this.f50658q;
            this.f50664w = i18 + i19;
            i17 -= i19;
        }
        if (aVar.m16362e()) {
            i17 -= this.f50660s;
        }
        int i21 = (size * 6) / 10;
        SimpleShadowTextView simpleShadowTextView = c25041p.f120173t;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtTitle");
        AbstractC26112n.m134387a0(simpleShadowTextView, i21, 1073741824, 0, 0);
        SimpleShadowTextView simpleShadowTextView2 = c25041p.f120172s;
        AbstractC19074t.m100207e(simpleShadowTextView2, "txtMessage");
        AbstractC26112n.m134387a0(simpleShadowTextView2, i21, 1073741824, 0, 0);
        int measuredHeight = i17 - (((c25041p.f120173t.getMeasuredHeight() + this.f50662u) + c25041p.f120172s.getMeasuredHeight()) + this.f50663v);
        if (aVar.m16364g()) {
            i13 = (size * 2) / 5;
        } else {
            i13 = (size * 3) / 4;
        }
        int i22 = (i13 * 3) / 2;
        if (i22 > measuredHeight) {
            i13 = (measuredHeight / 3) * 2;
            i22 = measuredHeight;
        }
        FollowSuggestionVideoLayout followSuggestionVideoLayout = c25041p.f120171r;
        AbstractC19074t.m100207e(followSuggestionVideoLayout, "lytVideo");
        AbstractC26112n.m134387a0(followSuggestionVideoLayout, i13, 1073741824, i22, 1073741824);
        OverScrollableRecyclerView overScrollableRecyclerView = c25041p.f120170q;
        AbstractC19074t.m100207e(overScrollableRecyclerView, "lstChannel");
        AbstractC26112n.m134387a0(overScrollableRecyclerView, size, 1073741824, i22, 1073741824);
        this.f50664w += (measuredHeight - c25041p.f120170q.getMeasuredHeight()) / 3;
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        C25041p c25041p = this.f50656D;
        if (c25041p == null) {
            AbstractC19074t.m100223u("binding");
            c25041p = null;
        }
        c25041p.f120170q.m9853S0();
        C9765a c9765a = this.f50654B;
        if (c9765a != null) {
            c9765a.m52656p();
        }
    }

    public final void setCallback(InterfaceC9589a interfaceC9589a) {
        this.f50657p = interfaceC9589a;
    }

    public final void setPageSource(String str) {
        AbstractC19074t.m100208f(str, "source");
        C9765a c9765a = this.f50654B;
        if (c9765a != null) {
            c9765a.m52659s(str);
        }
    }
}
