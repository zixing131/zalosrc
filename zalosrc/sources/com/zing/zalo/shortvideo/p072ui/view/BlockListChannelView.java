package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.AbstractC1388a;
import androidx.lifecycle.AbstractC1785o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.shortvideo.p072ui.receiver.ChannelReceiver;
import com.zing.zalo.shortvideo.p072ui.view.ChannelPageView;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import h20.InterfaceC19717a;
import java.util.Map;
import m20.InterfaceC22722b;
import p148f3.C18711c;
import p227i3.C20218v;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25061v1;
import q20.C25097t;
import qm0.AbstractC25361o0;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27409d;
import v00.AbstractC27413h;
import w00.AbstractC28684a;
import z10.C31152a;

/* loaded from: classes5.dex */
public final class BlockListChannelView extends ZchBaseView implements InterfaceC22722b {

    /* renamed from: A0 */
    private C25061v1 f52519A0;

    /* renamed from: B0 */
    private C31152a f52520B0;

    /* renamed from: C0 */
    private ChannelReceiver f52521C0;

    /* renamed from: z0 */
    private InterfaceC19717a f52522z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockListChannelView$a */
    /* loaded from: classes5.dex */
    public static final class C10108a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Channel f52524r;

        /* renamed from: s */
        final /* synthetic */ ConfirmPopupView f52525s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10108a(Channel channel, ConfirmPopupView confirmPopupView) {
            super(0);
            this.f52524r = channel;
            this.f52525s = confirmPopupView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53910a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53910a() {
            Map m131401f;
            InterfaceC19717a interfaceC19717a = BlockListChannelView.this.f52522z0;
            if (interfaceC19717a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19717a = null;
            }
            interfaceC19717a.mo52987s7(this.f52524r);
            String m92652XI = this.f52525s.m92652XI(AbstractC27413h.zch_action_key_block_channel);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", this.f52524r.m50769l()));
            c19205a.m100713L(m92652XI, m131401f);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockListChannelView$b */
    /* loaded from: classes5.dex */
    static final class C10109b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25061v1 f52526q;

        /* renamed from: r */
        final /* synthetic */ BlockListChannelView f52527r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10109b(C25061v1 c25061v1, BlockListChannelView blockListChannelView) {
            super(0);
            this.f52526q = c25061v1;
            this.f52527r = blockListChannelView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53911a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53911a() {
            this.f52526q.f120355r.m55786j();
            InterfaceC19717a interfaceC19717a = this.f52527r.f52522z0;
            if (interfaceC19717a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19717a = null;
            }
            interfaceC19717a.mo52986i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockListChannelView$c */
    /* loaded from: classes5.dex */
    static final class C10110c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25061v1 f52528q;

        /* renamed from: r */
        final /* synthetic */ BlockListChannelView f52529r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10110c(C25061v1 c25061v1, BlockListChannelView blockListChannelView) {
            super(0);
            this.f52528q = c25061v1;
            this.f52529r = blockListChannelView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53912a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53912a() {
            this.f52528q.f120355r.m55786j();
            InterfaceC19717a interfaceC19717a = this.f52529r.f52522z0;
            if (interfaceC19717a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19717a = null;
            }
            interfaceC19717a.mo52986i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockListChannelView$d */
    /* loaded from: classes5.dex */
    public static final class C10111d implements C31152a.b {
        C10111d() {
        }

        @Override // z10.C31152a.b
        /* renamed from: a */
        public void mo53913a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
            InterfaceC19717a interfaceC19717a = BlockListChannelView.this.f52522z0;
            if (interfaceC19717a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19717a = null;
            }
            interfaceC19717a.mo52985a(loadMoreInfo);
        }

        @Override // z10.C31152a.b
        /* renamed from: m */
        public void mo53914m(View view) {
            Channel channel;
            Map m131401f;
            View view2;
            Object obj;
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            Channel channel2 = null;
            if (view.getId() == AbstractC27409d.btnBlock) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view2 = (View) parent;
                } else {
                    view2 = null;
                }
                if (view2 != null) {
                    obj = view2.getTag();
                } else {
                    obj = null;
                }
                if (obj instanceof Channel) {
                    channel2 = (Channel) obj;
                }
                if (channel2 != null) {
                    BlockListChannelView.this.m53903VK(!AbstractC19074t.m100204b(view.getTag(), Boolean.TRUE), channel2);
                    return;
                }
                return;
            }
            Object tag = view.getTag();
            if (tag instanceof Channel) {
                channel = (Channel) tag;
            } else {
                channel = null;
            }
            if (channel != null) {
                BlockListChannelView blockListChannelView = BlockListChannelView.this;
                blockListChannelView.m55551QK(ChannelPageView.C10134b.m53981c(ChannelPageView.Companion, channel, null, 2, null));
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = blockListChannelView.m92652XI(AbstractC27413h.zch_action_key_click_channel_detail);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("seen_channel_uid", channel.m50769l()));
                c19205a.m100713L(m92652XI, m131401f);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockListChannelView$e */
    /* loaded from: classes5.dex */
    static final class C10112e extends AbstractC19075u implements InterfaceC18509p {
        C10112e() {
            super(2);
        }

        /* renamed from: a */
        public final void m53915a(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "id");
            if (z11) {
                C31152a c31152a = BlockListChannelView.this.f52520B0;
                if (c31152a != null) {
                    c31152a.m151432U(str);
                    return;
                }
                return;
            }
            C31152a c31152a2 = BlockListChannelView.this.f52520B0;
            if (c31152a2 != null) {
                c31152a2.m151433V(str);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m53915a((String) obj, ((Boolean) obj2).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockListChannelView$f */
    /* loaded from: classes5.dex */
    public static final class C10113f extends RecyclerView.AbstractC1887n {

        /* renamed from: a */
        private final Paint f52532a;

        /* renamed from: b */
        final /* synthetic */ int f52533b;

        C10113f(int i11, BlockListChannelView blockListChannelView) {
            this.f52533b = i11;
            Paint paint = new Paint();
            paint.setFlags(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(AbstractC1388a.m6961c(blockListChannelView.m92689tK(), AbstractC27406a.zch_layer_background_subtle));
            this.f52532a = paint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            int i11;
            Integer num;
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            RecyclerView.AbstractC1880g adapter = recyclerView.getAdapter();
            if (adapter != null) {
                i11 = adapter.mo10003k();
            } else {
                i11 = 0;
            }
            int i12 = i11 - 1;
            RecyclerView.AbstractC1876c0 m9897o0 = recyclerView.m9897o0(view);
            if (m9897o0 != null) {
                num = Integer.valueOf(m9897o0.m9929A());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                rect.top = this.f52533b;
            } else if (num != null && num.intValue() == i12) {
                rect.bottom = this.f52533b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: i */
        public void mo10068i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(canvas, C18711c.f94014e);
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10068i(canvas, recyclerView, c1899z);
            if (recyclerView.getChildCount() == 0) {
                return;
            }
            View childAt = recyclerView.getChildAt(0);
            canvas.drawRect(0.0f, childAt.getTop() - this.f52533b, recyclerView.getWidth(), childAt.getTop(), this.f52532a);
            View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
            canvas.drawRect(0.0f, childAt2.getBottom(), recyclerView.getWidth(), childAt2.getBottom() + this.f52533b, this.f52532a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockListChannelView$g */
    /* loaded from: classes5.dex */
    static final class C10114g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10114g f52534q = new C10114g();

        C10114g() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(Channel channel) {
            AbstractC19074t.m100208f(channel, "i");
            return channel.m50769l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VK */
    public final void m53903VK(boolean z11, Channel channel) {
        Map m131401f;
        Map m131401f2;
        InterfaceC19717a interfaceC19717a = null;
        if (z11) {
            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_block_channel_title), Integer.valueOf(AbstractC27413h.zch_popup_block_channel_message), Integer.valueOf(AbstractC27413h.zch_popup_block_channel_positive), Integer.valueOf(AbstractC27413h.zch_popup_block_channel_negative), null, true, false, 80, null);
            m51992b.m51991lL(new C10108a(channel, m51992b));
            m51992b.m51978ZK(true);
            BasePopupView.m51974dL(m51992b, m53904WK(), null, 2, null);
            String m92652XI = m92652XI(AbstractC27413h.zch_action_key_list_channel_icon_block);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131401f2 = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
            c19205a.m100713L(m92652XI, m131401f2);
            return;
        }
        InterfaceC19717a interfaceC19717a2 = this.f52522z0;
        if (interfaceC19717a2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC19717a = interfaceC19717a2;
        }
        interfaceC19717a.mo52984Qf(channel);
        String m92652XI2 = m92652XI(AbstractC27413h.zch_action_key_unblock_channel);
        C19205a c19205a2 = C19205a.f95429a;
        AbstractC19074t.m100205c(m92652XI2);
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
        c19205a2.m100713L(m92652XI2, m131401f);
    }

    /* renamed from: WK */
    private final C17487o0 m53904WK() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof BlockPageView) {
            C17487o0 m92649TI = ((BlockPageView) m92650VI).m92649TI();
            AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
            return m92649TI;
        }
        C17487o0 m92649TI2 = super.m92649TI();
        AbstractC19074t.m100207e(m92649TI2, "getChildZaloViewManager(...)");
        return m92649TI2;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        InterfaceC19717a m143677k = AbstractC28684a.Companion.m143677k();
        this.f52522z0 = m143677k;
        Section section = null;
        byte b11 = 0;
        if (m143677k == null) {
            AbstractC19074t.m100223u("presenter");
            m143677k = null;
        }
        m143677k.mo52965Lb(this);
        AbstractC1785o lifecycle = getLifecycle();
        InterfaceC19717a interfaceC19717a = this.f52522z0;
        if (interfaceC19717a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19717a = null;
        }
        lifecycle.mo9335a(interfaceC19717a);
        C31152a c31152a = new C31152a(section, 1, b11 == true ? 1 : 0);
        c31152a.m151437Z(new C10111d());
        this.f52520B0 = c31152a;
    }

    @Override // m20.InterfaceC22722b
    /* renamed from: Fz */
    public void mo53905Fz(Channel channel, boolean z11, Throwable th2) {
        int i11;
        AbstractC19074t.m100208f(channel, "channel");
        if (th2 != null) {
            C25097t.f120556a.m130155r(getContext(), th2);
            return;
        }
        C25097t c25097t = C25097t.f120556a;
        Context context = getContext();
        if (z11) {
            i11 = AbstractC27413h.zch_page_channel_block_success;
        } else {
            i11 = AbstractC27413h.zch_page_channel_unblock_success;
        }
        c25097t.m130154o(context, m92653YI(i11, channel.m50775o()));
        if (z11) {
            C31152a c31152a = this.f52520B0;
            if (c31152a != null) {
                c31152a.m151432U(channel.m50769l());
                return;
            }
            return;
        }
        C31152a c31152a2 = this.f52520B0;
        if (c31152a2 != null) {
            c31152a2.m151433V(channel.m50769l());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25061v1 m129957c = C25061v1.m129957c(layoutInflater);
        AbstractC19074t.m100207e(m129957c, "inflate(...)");
        this.f52519A0 = m129957c;
        C25061v1 c25061v1 = null;
        if (m129957c == null) {
            AbstractC19074t.m100223u("binding");
            m129957c = null;
        }
        ChannelReceiver channelReceiver = new ChannelReceiver(null, null, new C10112e(), null, null, 27, null);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        channelReceiver.mo53685d(m92689tK);
        this.f52521C0 = channelReceiver;
        m129957c.f120356s.setLayoutManager(new LinearLayoutManager(getContext()));
        m129957c.f120356s.setAdapter(this.f52520B0);
        m129957c.f120356s.m9816A(new C10113f(m92651WI().getDimensionPixelSize(AbstractC27407b.zch_radius_8dp), this));
        C25061v1 c25061v12 = this.f52519A0;
        if (c25061v12 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25061v1 = c25061v12;
        }
        FrameLayout root = c25061v1.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        ChannelReceiver channelReceiver = this.f52521C0;
        if (channelReceiver != null) {
            channelReceiver.mo53687g();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        InterfaceC19717a interfaceC19717a = this.f52522z0;
        InterfaceC19717a interfaceC19717a2 = null;
        if (interfaceC19717a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19717a = null;
        }
        if (interfaceC19717a.mo52983Ns() == null) {
            C25061v1 c25061v1 = this.f52519A0;
            if (c25061v1 == null) {
                AbstractC19074t.m100223u("binding");
                c25061v1 = null;
            }
            c25061v1.f120355r.m55786j();
            InterfaceC19717a interfaceC19717a3 = this.f52522z0;
            if (interfaceC19717a3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC19717a2 = interfaceC19717a3;
            }
            interfaceC19717a2.mo52986i();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C25061v1 c25061v1 = this.f52519A0;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55781c();
    }

    @Override // m20.InterfaceC22722b
    /* renamed from: b */
    public void mo53906b(boolean z11) {
        InterfaceC19717a interfaceC19717a = this.f52522z0;
        InterfaceC19717a interfaceC19717a2 = null;
        if (interfaceC19717a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19717a = null;
        }
        if (interfaceC19717a.mo52983Ns() == null) {
            C25061v1 c25061v1 = this.f52519A0;
            if (c25061v1 == null) {
                AbstractC19074t.m100223u("binding");
                c25061v1 = null;
            }
            if (z11) {
                c25061v1.f120355r.m55786j();
                InterfaceC19717a interfaceC19717a3 = this.f52522z0;
                if (interfaceC19717a3 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC19717a2 = interfaceC19717a3;
                }
                interfaceC19717a2.mo52986i();
            }
        }
    }

    @Override // m20.InterfaceC22722b
    /* renamed from: d */
    public void mo53907d(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        InterfaceC19717a interfaceC19717a = this.f52522z0;
        C25061v1 c25061v1 = null;
        if (interfaceC19717a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19717a = null;
        }
        if (interfaceC19717a.mo52983Ns() == null) {
            C25061v1 c25061v12 = this.f52519A0;
            if (c25061v12 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25061v1 = c25061v12;
            }
            if (th2 instanceof NetworkException) {
                c25061v1.f120355r.m55784g(new C10109b(c25061v1, this));
            } else {
                c25061v1.f120355r.m55783f(new C10110c(c25061v1, this));
            }
        }
    }

    @Override // m20.InterfaceC22722b
    /* renamed from: e */
    public void mo53908e(Section section) {
        AbstractC19074t.m100208f(section, "newItems");
        C31152a c31152a = this.f52520B0;
        if (c31152a != null) {
            int mo10003k = c31152a.mo10003k();
            c31152a.m151431T().m51163e(section, C10114g.f52534q);
            int mo10003k2 = c31152a.mo10003k() - mo10003k;
            c31152a.m10009q(mo10003k - 1);
            c31152a.m10015w(mo10003k, mo10003k2);
        }
    }

    @Override // m20.InterfaceC22722b
    /* renamed from: o */
    public void mo53909o(Section section) {
        AbstractC19074t.m100208f(section, "newItems");
        C25061v1 c25061v1 = this.f52519A0;
        C25061v1 c25061v12 = null;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55781c();
        C31152a c31152a = this.f52520B0;
        if (c31152a != null) {
            c31152a.m151438a0(section);
            c31152a.m10008p();
        }
        if (section.m51168m().isEmpty()) {
            C25061v1 c25061v13 = this.f52519A0;
            if (c25061v13 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25061v12 = c25061v13;
            }
            LoadingLayout loadingLayout = c25061v12.f120355r;
            AbstractC19074t.m100207e(loadingLayout, "lytLoading");
            LoadingLayout.m55778e(loadingLayout, null, null, Integer.valueOf(AbstractC27413h.zch_page_block_list_no_data), null, null, null, 59, null);
        }
    }
}
