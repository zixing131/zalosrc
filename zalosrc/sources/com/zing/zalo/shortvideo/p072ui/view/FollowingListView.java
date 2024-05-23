package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.AbstractC1388a;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.remote.common.LimitationReachedException;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.shortvideo.p072ui.receiver.ChannelReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import com.zing.zalo.shortvideo.p072ui.view.ChannelPageView;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import j20.InterfaceC20907a;
import java.util.Map;
import k20.C21456b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import n20.AbstractC23524a;
import n20.C23526c;
import p148f3.C18711c;
import p227i3.C20218v;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import q10.C25061v1;
import q20.C25097t;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import s20.AbstractC26114p;
import t10.C26449a;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27409d;
import v00.AbstractC27410e;
import v00.AbstractC27413h;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import z10.C31172k;

/* loaded from: classes5.dex */
public final class FollowingListView extends SimpleView implements C21456b.c {

    /* renamed from: B0 */
    private C25061v1 f52840B0;

    /* renamed from: C0 */
    private final InterfaceC24854k f52841C0;

    /* renamed from: D0 */
    private C31172k f52842D0;

    /* renamed from: E0 */
    private final NetworkReceiver f52843E0;

    /* renamed from: F0 */
    private final ChannelReceiver f52844F0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$a */
    /* loaded from: classes5.dex */
    static final class C10245a extends AbstractC19075u implements InterfaceC18509p {
        C10245a() {
            super(2);
        }

        /* renamed from: a */
        public final void m54352a(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "id");
            FollowingListView.this.m54347hL().m123503i0(str, z11);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54352a((String) obj, ((Boolean) obj2).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$b */
    /* loaded from: classes5.dex */
    static final class C10246b extends AbstractC19075u implements InterfaceC18494a {
        C10246b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54353a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54353a() {
            FollowingListView.this.m54347hL().m123504j0(false);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$c */
    /* loaded from: classes5.dex */
    static final class C10247c extends AbstractC19075u implements InterfaceC18494a {
        C10247c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54354a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54354a() {
            FollowingListView.this.m54347hL().m123504j0(true);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$d */
    /* loaded from: classes5.dex */
    public static final class C10248d implements C31172k.a {
        C10248d() {
        }

        @Override // z10.C31172k.a
        /* renamed from: a */
        public void mo54355a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
            FollowingListView.this.m54347hL().m123494a(loadMoreInfo);
        }

        @Override // z10.C31172k.a
        /* renamed from: m */
        public void mo54356m(View view) {
            View view2;
            Object obj;
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            Channel channel = null;
            if (view.getId() == AbstractC27409d.btnFollow) {
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
                    channel = (Channel) obj;
                }
                if (channel != null) {
                    FollowingListView.this.m54347hL().m123500g0(channel, !AbstractC19074t.m100204b(view.getTag(), Boolean.TRUE));
                    return;
                }
                return;
            }
            Object tag = view.getTag();
            if (tag instanceof Channel) {
                channel = (Channel) tag;
            }
            if (channel != null) {
                FollowingListView.this.m54347hL().m123499f0(channel);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$e */
    /* loaded from: classes5.dex */
    public static final class C10249e implements OverScrollableRecyclerView.InterfaceC10832c {
        C10249e() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31172k c31172k;
            C31172k c31172k2 = FollowingListView.this.f52842D0;
            if ((c31172k2 == null || !c31172k2.m151444M()) && (c31172k = FollowingListView.this.f52842D0) != null) {
                c31172k.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$f */
    /* loaded from: classes5.dex */
    public static final class C10250f extends RecyclerView.AbstractC1887n {

        /* renamed from: a */
        private final Paint f52850a;

        /* renamed from: b */
        final /* synthetic */ int f52851b;

        /* renamed from: c */
        final /* synthetic */ FollowingListView f52852c;

        C10250f(int i11, FollowingListView followingListView) {
            this.f52851b = i11;
            this.f52852c = followingListView;
            Paint paint = new Paint();
            paint.setFlags(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(AbstractC1388a.m6961c(followingListView.m92689tK(), AbstractC27406a.zch_layer_background_subtle));
            this.f52850a = paint;
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
                rect.top = this.f52851b;
            } else if (num != null && num.intValue() == i12) {
                rect.bottom = this.f52851b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: i */
        public void mo10068i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(canvas, C18711c.f94014e);
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10068i(canvas, recyclerView, c1899z);
            if (recyclerView.getAdapter() == null) {
                return;
            }
            AbstractC19074t.m100205c(recyclerView.getAdapter());
            C25061v1 c25061v1 = null;
            if (recyclerView.m9817A0(recyclerView.getChildAt(0)) == 0) {
                C25061v1 c25061v12 = this.f52852c.f52840B0;
                if (c25061v12 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25061v12 = null;
                }
                float offsetY = c25061v12.f120356s.getOffsetY();
                canvas.drawRect(0.0f, (r0.getTop() + offsetY) - this.f52851b, recyclerView.getWidth(), r0.getTop() + offsetY, this.f52850a);
            }
            int m9817A0 = recyclerView.m9817A0(recyclerView.getChildAt(recyclerView.getChildCount() - 1));
            if (m9817A0 != -1 && m9817A0 == r13.mo10003k() - 1) {
                C25061v1 c25061v13 = this.f52852c.f52840B0;
                if (c25061v13 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c25061v1 = c25061v13;
                }
                float offsetY2 = c25061v1.f120356s.getOffsetY();
                canvas.drawRect(0.0f, r0.getBottom() + offsetY2, recyclerView.getWidth(), r0.getBottom() + offsetY2 + this.f52851b, this.f52850a);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$g */
    /* loaded from: classes5.dex */
    static final class C10251g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52853t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$g$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FollowingListView f52855p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32740a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ FollowingListView f52856q;

                /* renamed from: r */
                final /* synthetic */ Channel f52857r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32740a(FollowingListView followingListView, Channel channel) {
                    super(0);
                    this.f52856q = followingListView;
                    this.f52857r = channel;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m54359a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m54359a() {
                    this.f52856q.m54347hL().m123501h0(this.f52857r);
                }
            }

            a(FollowingListView followingListView) {
                this.f52855p = followingListView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC23524a.b bVar, Continuation continuation) {
                Channel channel;
                Channel channel2;
                Map m131401f;
                String m123446b = bVar.m123446b();
                Channel channel3 = null;
                switch (m123446b.hashCode()) {
                    case -1365240279:
                        if (m123446b.equals("confirm_unfollow")) {
                            Object m123445a = bVar.m123445a();
                            if (m123445a instanceof Channel) {
                                channel = (Channel) m123445a;
                            } else {
                                channel = null;
                            }
                            if (channel != null) {
                                FollowingListView followingListView = this.f52855p;
                                followingListView.m54348iL(channel, false, false);
                                ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, AbstractC29094b.m145341c(AbstractC27413h.zch_popup_unfollow_channel_title), AbstractC29094b.m145341c(AbstractC27413h.zch_popup_unfollow_channel_message), AbstractC29094b.m145341c(AbstractC27413h.zch_popup_unfollow_channel_positive), AbstractC29094b.m145341c(AbstractC27413h.zch_popup_unfollow_channel_negative), null, false, false, 112, null);
                                m51992b.m51991lL(new C32740a(followingListView, channel));
                                m51992b.m51978ZK(true);
                                C17487o0 m92649TI = followingListView.m92649TI();
                                AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
                                BasePopupView.m51974dL(m51992b, m92649TI, null, 2, null);
                                break;
                            }
                        }
                        break;
                    case -1268958287:
                        if (m123446b.equals("follow")) {
                            Object m123445a2 = bVar.m123445a();
                            if (m123445a2 instanceof Channel) {
                                channel3 = (Channel) m123445a2;
                            }
                            Channel channel4 = channel3;
                            if (channel4 != null) {
                                FollowingListView.m54349jL(this.f52855p, channel4, true, false, 4, null);
                                break;
                            }
                        }
                        break;
                    case -382454902:
                        if (m123446b.equals("unfollow")) {
                            Object m123445a3 = bVar.m123445a();
                            if (m123445a3 instanceof Channel) {
                                channel3 = (Channel) m123445a3;
                            }
                            Channel channel5 = channel3;
                            if (channel5 != null) {
                                FollowingListView.m54349jL(this.f52855p, channel5, false, false, 4, null);
                                break;
                            }
                        }
                        break;
                    case 815363047:
                        if (m123446b.equals("view_channel_detail")) {
                            Object m123445a4 = bVar.m123445a();
                            if (m123445a4 instanceof Channel) {
                                channel2 = (Channel) m123445a4;
                            } else {
                                channel2 = null;
                            }
                            if (channel2 != null) {
                                FollowingListView followingListView2 = this.f52855p;
                                followingListView2.m55551QK(ChannelPageView.C10134b.m53981c(ChannelPageView.Companion, channel2, null, 2, null));
                                C19205a c19205a = C19205a.f95429a;
                                String m92652XI = followingListView2.m92652XI(AbstractC27413h.zch_action_key_click_channel_detail);
                                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                                m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("seen_channel_uid", channel2.m50769l()));
                                c19205a.m100713L(m92652XI, m131401f);
                                break;
                            }
                        }
                        break;
                }
                return C24848g0.f119245a;
            }
        }

        C10251g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10251g(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52853t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m123442M = FollowingListView.this.m54347hL().m123442M();
                a aVar = new a(FollowingListView.this);
                this.f52853t = 1;
                if (m123442M.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10251g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$h */
    /* loaded from: classes5.dex */
    static final class C10252h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52858t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$h$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FollowingListView f52860p;

            a(FollowingListView followingListView) {
                this.f52860p = followingListView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(InterfaceC20907a interfaceC20907a, Continuation continuation) {
                Map m131401f;
                Map m131401f2;
                if (!AbstractC19074t.m100204b(interfaceC20907a, InterfaceC20907a.b.f102732a) && !AbstractC19074t.m100204b(interfaceC20907a, InterfaceC20907a.c.f102733a)) {
                    if (interfaceC20907a instanceof InterfaceC20907a.a) {
                        this.f52860p.m54350jr(((InterfaceC20907a.a) interfaceC20907a).m109378a());
                        C19205a c19205a = C19205a.f95429a;
                        String m92652XI = this.f52860p.m92652XI(AbstractC27413h.zch_action_key_list_follow_channel_result);
                        AbstractC19074t.m100207e(m92652XI, "getString(...)");
                        m131401f2 = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", AbstractC29094b.m145341c(0)));
                        c19205a.m100713L(m92652XI, m131401f2);
                    } else if (interfaceC20907a instanceof InterfaceC20907a.d) {
                        C31172k c31172k = this.f52860p.f52842D0;
                        if (c31172k != null) {
                            c31172k.m151739U(((Channel) ((InterfaceC20907a.d) interfaceC20907a).m109379a()).m50769l());
                        }
                        C19205a c19205a2 = C19205a.f95429a;
                        String m92652XI2 = this.f52860p.m92652XI(AbstractC27413h.zch_action_key_list_follow_channel_result);
                        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", AbstractC29094b.m145341c(1)));
                        c19205a2.m100713L(m92652XI2, m131401f);
                    }
                }
                return C24848g0.f119245a;
            }
        }

        C10252h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10252h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52858t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m123491X = FollowingListView.this.m54347hL().m123491X();
                a aVar = new a(FollowingListView.this);
                this.f52858t = 1;
                if (m123491X.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10252h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$i */
    /* loaded from: classes5.dex */
    static final class C10253i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52861t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$i$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FollowingListView f52863p;

            a(FollowingListView followingListView) {
                this.f52863p = followingListView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(InterfaceC20907a interfaceC20907a, Continuation continuation) {
                Map m131401f;
                Map m131401f2;
                if (!AbstractC19074t.m100204b(interfaceC20907a, InterfaceC20907a.b.f102732a) && !AbstractC19074t.m100204b(interfaceC20907a, InterfaceC20907a.c.f102733a)) {
                    if (interfaceC20907a instanceof InterfaceC20907a.a) {
                        this.f52863p.m54350jr(((InterfaceC20907a.a) interfaceC20907a).m109378a());
                        C19205a c19205a = C19205a.f95429a;
                        String m92652XI = this.f52863p.m92652XI(AbstractC27413h.zch_action_key_list_unfollow_channel_result);
                        AbstractC19074t.m100207e(m92652XI, "getString(...)");
                        m131401f2 = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", AbstractC29094b.m145341c(0)));
                        c19205a.m100713L(m92652XI, m131401f2);
                    } else if (interfaceC20907a instanceof InterfaceC20907a.d) {
                        C31172k c31172k = this.f52863p.f52842D0;
                        if (c31172k != null) {
                            c31172k.m151740V(((Channel) ((InterfaceC20907a.d) interfaceC20907a).m109379a()).m50769l());
                        }
                        C19205a c19205a2 = C19205a.f95429a;
                        String m92652XI2 = this.f52863p.m92652XI(AbstractC27413h.zch_action_key_list_unfollow_channel_result);
                        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", AbstractC29094b.m145341c(1)));
                        c19205a2.m100713L(m92652XI2, m131401f);
                    }
                }
                return C24848g0.f119245a;
            }
        }

        C10253i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10253i(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52861t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m123496b0 = FollowingListView.this.m54347hL().m123496b0();
                a aVar = new a(FollowingListView.this);
                this.f52861t = 1;
                if (m123496b0.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10253i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$j */
    /* loaded from: classes5.dex */
    static final class C10254j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52864t;

        /* renamed from: v */
        final /* synthetic */ C25061v1 f52866v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$j$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FollowingListView f52867p;

            /* renamed from: q */
            final /* synthetic */ C25061v1 f52868q;

            a(FollowingListView followingListView, C25061v1 c25061v1) {
                this.f52867p = followingListView;
                this.f52868q = c25061v1;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(InterfaceC20907a interfaceC20907a, Continuation continuation) {
                if (!AbstractC19074t.m100204b(interfaceC20907a, InterfaceC20907a.b.f102732a)) {
                    if (AbstractC19074t.m100204b(interfaceC20907a, InterfaceC20907a.c.f102733a)) {
                        if (!this.f52867p.m54347hL().m123498e0()) {
                            this.f52868q.f120355r.m55786j();
                        }
                    } else if (interfaceC20907a instanceof InterfaceC20907a.a) {
                        this.f52867p.m54350jr(((InterfaceC20907a.a) interfaceC20907a).m109378a());
                    } else if (interfaceC20907a instanceof InterfaceC20907a.d) {
                        if (this.f52867p.m54347hL().m123498e0()) {
                            this.f52867p.m54343e((Section) ((InterfaceC20907a.d) interfaceC20907a).m109379a());
                        } else {
                            this.f52867p.m54351o((Section) ((InterfaceC20907a.d) interfaceC20907a).m109379a());
                        }
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10254j(C25061v1 c25061v1, Continuation continuation) {
            super(2, continuation);
            this.f52866v = c25061v1;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10254j(this.f52866v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52864t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m123493Z = FollowingListView.this.m54347hL().m123493Z();
                a aVar = new a(FollowingListView.this, this.f52866v);
                this.f52864t = 1;
                if (m123493Z.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10254j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$k */
    /* loaded from: classes5.dex */
    static final class C10255k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52869t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$k$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FollowingListView f52871p;

            a(FollowingListView followingListView) {
                this.f52871p = followingListView;
            }

            /* renamed from: a */
            public final Object m54367a(boolean z11, Continuation continuation) {
                if (this.f52871p.m54347hL().m123497c0() && !this.f52871p.m54347hL().m123498e0() && z11) {
                    this.f52871p.m54347hL().m123502i();
                }
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m54367a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        C10255k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10255k(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52869t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m123495a0 = FollowingListView.this.m54347hL().m123495a0();
                a aVar = new a(FollowingListView.this);
                this.f52869t = 1;
                if (m123495a0.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10255k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$l */
    /* loaded from: classes5.dex */
    static final class C10256l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52872t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$l$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FollowingListView f52874p;

            a(FollowingListView followingListView) {
                this.f52874p = followingListView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(C24860q c24860q, Continuation continuation) {
                String str = (String) c24860q.m129213a();
                boolean booleanValue = ((Boolean) c24860q.m129214b()).booleanValue();
                if (str.length() > 0) {
                    if (booleanValue) {
                        C31172k c31172k = this.f52874p.f52842D0;
                        if (c31172k != null) {
                            c31172k.m151739U(str);
                        }
                    } else {
                        C31172k c31172k2 = this.f52874p.f52842D0;
                        if (c31172k2 != null) {
                            c31172k2.m151740V(str);
                        }
                    }
                }
                return C24848g0.f119245a;
            }
        }

        C10256l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10256l(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52872t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m123492Y = FollowingListView.this.m54347hL().m123492Y();
                a aVar = new a(FollowingListView.this);
                this.f52872t = 1;
                if (m123492Y.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10256l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$m */
    /* loaded from: classes5.dex */
    public static final class C10257m extends AbstractC19075u implements InterfaceC18494a {
        C10257m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54370a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54370a() {
            FollowingListView.this.m54347hL().m123502i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$n */
    /* loaded from: classes5.dex */
    public static final class C10258n extends AbstractC19075u implements InterfaceC18494a {
        C10258n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54371a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54371a() {
            FollowingListView.this.m54347hL().m123502i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$o */
    /* loaded from: classes5.dex */
    public static final class C10259o extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10259o f52877q = new C10259o();

        C10259o() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(Channel channel) {
            AbstractC19074t.m100208f(channel, "i");
            return channel.m50769l();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowingListView$p */
    /* loaded from: classes5.dex */
    static final class C10260p extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10260p f52878q = new C10260p();

        C10260p() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23526c mo12V4() {
            return C26449a.f125639a.m136337b();
        }
    }

    public FollowingListView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C10260p.f52878q);
        this.f52841C0 = m129210a;
        this.f52843E0 = new NetworkReceiver(new C10246b(), new C10247c());
        this.f52844F0 = new ChannelReceiver(null, null, null, new C10245a(), null, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m54343e(Section section) {
        C31172k c31172k = this.f52842D0;
        if (c31172k != null) {
            int mo10003k = c31172k.mo10003k();
            c31172k.m151738T().m51163e(section, C10259o.f52877q);
            int mo10003k2 = c31172k.mo10003k() - mo10003k;
            c31172k.m10010r(mo10003k - 1, Boolean.TRUE);
            c31172k.m10015w(mo10003k, mo10003k2);
            c31172k.m151445N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hL */
    public final C23526c m54347hL() {
        return (C23526c) this.f52841C0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iL */
    public final void m54348iL(Channel channel, boolean z11, boolean z12) {
        int i11;
        Map m131407l;
        if (z11) {
            i11 = AbstractC27413h.zch_action_key_list_follow_channel;
        } else if (z12) {
            i11 = AbstractC27413h.zch_action_key_list_unfollow_confirm;
        } else {
            i11 = AbstractC27413h.zch_action_key_list_unfollow_channel;
        }
        String m92652XI = m92652XI(i11);
        C19205a c19205a = C19205a.f95429a;
        AbstractC19074t.m100205c(m92652XI);
        m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
        c19205a.m100713L(m92652XI, m131407l);
    }

    /* renamed from: jL */
    static /* synthetic */ void m54349jL(FollowingListView followingListView, Channel channel, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        followingListView.m54348iL(channel, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jr */
    public final void m54350jr(Throwable th2) {
        C31172k c31172k = this.f52842D0;
        if (c31172k != null) {
            c31172k.m151445N();
        }
        if (th2 instanceof LimitationReachedException) {
            C25097t.f120556a.m130154o(getContext(), ((LimitationReachedException) th2).getMessage());
            return;
        }
        C25061v1 c25061v1 = null;
        if (th2 instanceof NetworkException) {
            if (m54347hL().m123498e0()) {
                C25097t.f120556a.m130155r(getContext(), th2);
                return;
            }
            C25061v1 c25061v12 = this.f52840B0;
            if (c25061v12 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25061v1 = c25061v12;
            }
            c25061v1.f120355r.m55784g(new C10257m());
            return;
        }
        if (m54347hL().m123498e0()) {
            if (th2 != null) {
                C25097t.f120556a.m130155r(getContext(), th2);
            }
        } else {
            C25061v1 c25061v13 = this.f52840B0;
            if (c25061v13 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25061v1 = c25061v13;
            }
            c25061v1.f120355r.m55783f(new C10258n());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m54351o(Section section) {
        C25061v1 c25061v1 = this.f52840B0;
        C25061v1 c25061v12 = null;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55781c();
        C25061v1 c25061v13 = this.f52840B0;
        if (c25061v13 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v13 = null;
        }
        c25061v13.f120355r.m55780b();
        if (section.m51168m().isEmpty()) {
            C25061v1 c25061v14 = this.f52840B0;
            if (c25061v14 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25061v12 = c25061v14;
            }
            LoadingLayout loadingLayout = c25061v12.f120355r;
            AbstractC19074t.m100207e(loadingLayout, "lytLoading");
            LoadingLayout.m55778e(loadingLayout, null, null, Integer.valueOf(AbstractC27413h.zch_page_following_list_no_data), null, null, null, 59, null);
        } else {
            C31172k c31172k = this.f52842D0;
            if (c31172k != null) {
                c31172k.m151745a0(section);
                c31172k.m10008p();
            }
        }
        C31172k c31172k2 = this.f52842D0;
        if (c31172k2 != null) {
            c31172k2.m151445N();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C25061v1 c25061v1;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View mo37483GJ = super.mo37483GJ(layoutInflater, viewGroup, bundle);
        C25061v1 m129956a = C25061v1.m129956a(m55010SK());
        AbstractC19074t.m100207e(m129956a, "bind(...)");
        this.f52840B0 = m129956a;
        if (m129956a == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        } else {
            c25061v1 = m129956a;
        }
        C31172k c31172k = new C31172k(null, 1, null);
        c31172k.m151744Z(new C10248d());
        this.f52842D0 = c31172k;
        OverScrollableRecyclerView overScrollableRecyclerView = c25061v1.f120356s;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        overScrollableRecyclerView.setLayoutManager(new OverScrollableRecyclerView.LinearLayoutManager(m92689tK, 0, false, false, 14, null));
        c25061v1.f120356s.setAdapter(this.f52842D0);
        int dimensionPixelSize = m92651WI().getDimensionPixelSize(AbstractC27407b.zch_radius_8dp);
        OverScrollableRecyclerView overScrollableRecyclerView2 = c25061v1.f120356s;
        AbstractC19074t.m100207e(overScrollableRecyclerView2, "rv");
        OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView2, new C10249e(), 0.0f, 2, null);
        c25061v1.f120356s.m9816A(new C10250f(dimensionPixelSize, this));
        AbstractC26114p.m134444b(this, null, null, new C10251g(null), 3, null);
        AbstractC26114p.m134444b(this, null, null, new C10252h(null), 3, null);
        AbstractC26114p.m134444b(this, null, null, new C10253i(null), 3, null);
        AbstractC26114p.m134444b(this, null, null, new C10254j(c25061v1, null), 3, null);
        AbstractC26114p.m134444b(this, null, null, new C10255k(null), 3, null);
        AbstractC26114p.m134444b(this, null, null, new C10256l(null), 3, null);
        Context context = getContext();
        if (context != null) {
            this.f52843E0.mo53685d(context);
            this.f52844F0.mo53685d(context);
        }
        return mo37483GJ;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        this.f52843E0.mo53687g();
        this.f52844F0.mo53687g();
        super.mo37484JJ();
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(FollowingListView.class, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView
    /* renamed from: TK */
    public int mo54293TK() {
        return AbstractC27410e.zch_layout_simple_list;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        if (!m54347hL().m123498e0() || m54347hL().m123497c0()) {
            m54347hL().m123502i();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView
    /* renamed from: VK */
    public String mo54294VK() {
        String m92652XI = m92652XI(AbstractC27413h.zch_page_following_list_title);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        return m92652XI;
    }

    @Override // k20.C21456b.c
    /* renamed from: oH */
    public void mo53935oH(C21456b.b bVar) {
        C21456b.c.a.m111025b(this, bVar);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // k20.C21456b.c
    /* renamed from: pt */
    public void mo53936pt(C21456b.b bVar) {
        C21456b.c.a.m111024a(this, bVar);
    }
}
