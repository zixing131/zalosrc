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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.AbstractC1388a;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView;
import com.zing.zalo.shortvideo.p072ui.component.bts.CommentUserBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import com.zing.zalo.shortvideo.p072ui.view.FollowerListView;
import com.zing.zalo.shortvideo.p072ui.widget.HeaderLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import j20.InterfaceC20907a;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import n20.AbstractC23524a;
import n20.C23525b;
import p148f3.C18711c;
import p227i3.C20218v;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q10.C25009g1;
import q20.C25097t;
import s20.AbstractC26112n;
import s20.AbstractC26114p;
import t10.C26449a;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27413h;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import z10.C31170j;

/* loaded from: classes5.dex */
public final class FollowerListView extends ZchBaseView {
    public static final C10235a Companion = new C10235a(null);

    /* renamed from: A0 */
    private C25009g1 f52807A0;

    /* renamed from: B0 */
    private C31170j f52808B0;

    /* renamed from: C0 */
    private final NetworkReceiver f52809C0;

    /* renamed from: z0 */
    private final InterfaceC24854k f52810z0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$a */
    /* loaded from: classes5.dex */
    public static final class C10235a {
        private C10235a() {
        }

        public /* synthetic */ C10235a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$b */
    /* loaded from: classes5.dex */
    static final class C10236b extends AbstractC19075u implements InterfaceC18494a {
        C10236b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54322a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54322a() {
            FollowerListView.this.m54320WK().m123469j0(false);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$c */
    /* loaded from: classes5.dex */
    static final class C10237c extends AbstractC19075u implements InterfaceC18494a {
        C10237c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54323a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54323a() {
            FollowerListView.this.m54320WK().m123469j0(true);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$d */
    /* loaded from: classes5.dex */
    public static final class C10238d implements C31170j.a {
        C10238d() {
        }

        @Override // z10.C31170j.a
        /* renamed from: a */
        public void mo54324a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
            FollowerListView.this.m54320WK().m123460a(loadMoreInfo);
        }

        @Override // z10.C31170j.a
        /* renamed from: m */
        public void mo54325m(View view) {
            User user;
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            C23525b m54320WK = FollowerListView.this.m54320WK();
            Object tag = view.getTag();
            if (tag instanceof User) {
                user = (User) tag;
            } else {
                user = null;
            }
            if (user == null) {
                return;
            }
            m54320WK.m123466h0(user);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$e */
    /* loaded from: classes5.dex */
    public static final class C10239e extends RecyclerView.AbstractC1887n {

        /* renamed from: a */
        private final Paint f52814a;

        /* renamed from: b */
        final /* synthetic */ int f52815b;

        /* renamed from: c */
        final /* synthetic */ FollowerListView f52816c;

        C10239e(int i11, FollowerListView followerListView) {
            this.f52815b = i11;
            this.f52816c = followerListView;
            Paint paint = new Paint();
            paint.setFlags(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(AbstractC1388a.m6961c(followerListView.m92689tK(), AbstractC27406a.zch_layer_background_subtle));
            this.f52814a = paint;
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
                rect.top = this.f52815b;
            } else if (num != null && num.intValue() == i12) {
                rect.bottom = this.f52815b;
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
            C25009g1 c25009g1 = null;
            if (recyclerView.m9817A0(recyclerView.getChildAt(0)) == 0) {
                C25009g1 c25009g12 = this.f52816c.f52807A0;
                if (c25009g12 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25009g12 = null;
                }
                float offsetY = c25009g12.f119918t.getOffsetY();
                canvas.drawRect(0.0f, (r0.getTop() + offsetY) - this.f52815b, recyclerView.getWidth(), r0.getTop() + offsetY, this.f52814a);
            }
            int m9817A0 = recyclerView.m9817A0(recyclerView.getChildAt(recyclerView.getChildCount() - 1));
            if (m9817A0 != -1 && m9817A0 == r13.mo10003k() - 1) {
                C25009g1 c25009g13 = this.f52816c.f52807A0;
                if (c25009g13 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c25009g1 = c25009g13;
                }
                float offsetY2 = c25009g1.f119918t.getOffsetY();
                canvas.drawRect(0.0f, r0.getBottom() + offsetY2, recyclerView.getWidth(), r0.getBottom() + offsetY2 + this.f52815b, this.f52814a);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$f */
    /* loaded from: classes5.dex */
    static final class C10240f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52817t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$f$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FollowerListView f52819p;

            /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32738a implements CommentUserBottomSheet.InterfaceC9505a {

                /* renamed from: a */
                final /* synthetic */ FollowerListView f52820a;

                /* renamed from: b */
                final /* synthetic */ User f52821b;

                C32738a(FollowerListView followerListView, User user) {
                    this.f52820a = followerListView;
                    this.f52821b = user;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$f$a$b */
            /* loaded from: classes5.dex */
            public static final class b extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ FollowerListView f52822q;

                /* renamed from: r */
                final /* synthetic */ User f52823r;

                /* renamed from: s */
                final /* synthetic */ ConfirmPopupView f52824s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(FollowerListView followerListView, User user, ConfirmPopupView confirmPopupView) {
                    super(0);
                    this.f52822q = followerListView;
                    this.f52823r = user;
                    this.f52824s = confirmPopupView;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m54328a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m54328a() {
                    this.f52822q.m54320WK().m123457W(this.f52823r);
                    String m92652XI = this.f52824s.m92652XI(AbstractC27413h.zch_action_key_block_user);
                    C19205a c19205a = C19205a.f95429a;
                    AbstractC19074t.m100205c(m92652XI);
                    c19205a.m100713L(m92652XI, null);
                }
            }

            a(FollowerListView followerListView) {
                this.f52819p = followerListView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC23524a.b bVar, Continuation continuation) {
                User user;
                User user2;
                String m123446b = bVar.m123446b();
                int hashCode = m123446b.hashCode();
                if (hashCode != -776858590) {
                    if (hashCode != 3015911) {
                        if (hashCode == 575471182 && m123446b.equals("confirm_block")) {
                            Object m123445a = bVar.m123445a();
                            if (m123445a instanceof User) {
                                user2 = (User) m123445a;
                            } else {
                                user2 = null;
                            }
                            if (user2 == null) {
                                return C24848g0.f119245a;
                            }
                            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, AbstractC29094b.m145341c(AbstractC27413h.zch_popup_block_user_title), AbstractC29094b.m145341c(AbstractC27413h.zch_popup_block_user_message), AbstractC29094b.m145341c(AbstractC27413h.zch_popup_block_user_positive), AbstractC29094b.m145341c(AbstractC27413h.zch_popup_block_user_negative), null, true, false, 80, null);
                            m51992b.m51991lL(new b(this.f52819p, user2, m51992b));
                            m51992b.m51978ZK(true);
                            C17487o0 m92693xK = this.f52819p.m92693xK();
                            AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
                            BasePopupView.m51974dL(m51992b, m92693xK, null, 2, null);
                            String m92652XI = this.f52819p.m92652XI(AbstractC27413h.zch_action_key_user_icon_block);
                            C19205a c19205a = C19205a.f95429a;
                            AbstractC19074t.m100205c(m92652XI);
                            c19205a.m100713L(m92652XI, null);
                        }
                    } else if (m123446b.equals("back")) {
                        this.f52819p.finish();
                    }
                } else if (m123446b.equals("click_user")) {
                    Object m123445a2 = bVar.m123445a();
                    if (m123445a2 instanceof User) {
                        user = (User) m123445a2;
                    } else {
                        user = null;
                    }
                    if (user == null) {
                        return C24848g0.f119245a;
                    }
                    CommentUserBottomSheet m51879a = CommentUserBottomSheet.Companion.m51879a(user.m51229b());
                    m51879a.m51878iL(new C32738a(this.f52819p, user));
                    m51879a.m51757bL(true);
                    C17487o0 m92649TI = this.f52819p.m92649TI();
                    AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
                    BaseBottomSheetView.m51747hL(m51879a, m92649TI, null, 2, null);
                }
                return C24848g0.f119245a;
            }
        }

        C10240f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10240f(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52817t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m123442M = FollowerListView.this.m54320WK().m123442M();
                a aVar = new a(FollowerListView.this);
                this.f52817t = 1;
                if (m123442M.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10240f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$g */
    /* loaded from: classes5.dex */
    static final class C10241g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52825t;

        /* renamed from: v */
        final /* synthetic */ C25009g1 f52827v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$g$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FollowerListView f52828p;

            /* renamed from: q */
            final /* synthetic */ C25009g1 f52829q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32739a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ FollowerListView f52830q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32739a(FollowerListView followerListView) {
                    super(0);
                    this.f52830q = followerListView;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m54331a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m54331a() {
                    this.f52830q.m54320WK().m123467i();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$g$a$b */
            /* loaded from: classes5.dex */
            public static final class b extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ FollowerListView f52831q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(FollowerListView followerListView) {
                    super(0);
                    this.f52831q = followerListView;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m54332a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m54332a() {
                    this.f52831q.m54320WK().m123467i();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$g$a$c */
            /* loaded from: classes5.dex */
            public static final class c extends AbstractC19075u implements InterfaceC18505l {

                /* renamed from: q */
                public static final c f52832q = new c();

                c() {
                    super(1);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo205i9(User user) {
                    AbstractC19074t.m100208f(user, "i");
                    return user.m51234g();
                }
            }

            a(FollowerListView followerListView, C25009g1 c25009g1) {
                this.f52828p = followerListView;
                this.f52829q = c25009g1;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(InterfaceC20907a interfaceC20907a, Continuation continuation) {
                if (!AbstractC19074t.m100204b(interfaceC20907a, InterfaceC20907a.b.f102732a)) {
                    if (AbstractC19074t.m100204b(interfaceC20907a, InterfaceC20907a.c.f102733a)) {
                        if (!this.f52828p.m54320WK().m123464f0()) {
                            this.f52829q.f119916r.m55786j();
                        }
                    } else if (interfaceC20907a instanceof InterfaceC20907a.a) {
                        this.f52829q.f119916r.m55781c();
                        if (this.f52828p.m54320WK().m123464f0()) {
                            return C24848g0.f119245a;
                        }
                        if (((InterfaceC20907a.a) interfaceC20907a).m109378a() instanceof NetworkException) {
                            this.f52829q.f119916r.m55784g(new C32739a(this.f52828p));
                        } else {
                            this.f52829q.f119916r.m55783f(new b(this.f52828p));
                        }
                    } else if (interfaceC20907a instanceof InterfaceC20907a.d) {
                        this.f52829q.f119916r.m55781c();
                        C31170j c31170j = this.f52828p.f52808B0;
                        if (c31170j != null) {
                            FollowerListView followerListView = this.f52828p;
                            Section section = (Section) ((InterfaceC20907a.d) interfaceC20907a).m109379a();
                            if (followerListView.m54320WK().m123464f0()) {
                                int mo10003k = c31170j.mo10003k();
                                c31170j.m151728S().m51163e(section, c.f52832q);
                                int mo10003k2 = c31170j.mo10003k() - mo10003k;
                                c31170j.m10010r(mo10003k - 1, AbstractC29094b.m145339a(true));
                                c31170j.m10015w(mo10003k, mo10003k2);
                                c31170j.m151445N();
                            } else {
                                c31170j.m151733X(section);
                                c31170j.m10008p();
                                if (section.m51168m().isEmpty()) {
                                    C25009g1 c25009g1 = followerListView.f52807A0;
                                    if (c25009g1 == null) {
                                        AbstractC19074t.m100223u("binding");
                                        c25009g1 = null;
                                    }
                                    LoadingLayout loadingLayout = c25009g1.f119916r;
                                    AbstractC19074t.m100207e(loadingLayout, "lytLoading");
                                    LoadingLayout.m55779i(loadingLayout, 0, 1, null);
                                }
                            }
                        }
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10241g(C25009g1 c25009g1, Continuation continuation) {
            super(2, continuation);
            this.f52827v = c25009g1;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10241g(this.f52827v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52825t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m123459Y = FollowerListView.this.m54320WK().m123459Y();
                a aVar = new a(FollowerListView.this, this.f52827v);
                this.f52825t = 1;
                if (m123459Y.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10241g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$h */
    /* loaded from: classes5.dex */
    static final class C10242h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52833t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$h$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FollowerListView f52835p;

            a(FollowerListView followerListView) {
                this.f52835p = followerListView;
            }

            /* renamed from: a */
            public final Object m54335a(boolean z11, Continuation continuation) {
                if (!this.f52835p.m54320WK().m123464f0() && this.f52835p.m54320WK().m123462c0() && z11) {
                    this.f52835p.m54320WK().m123467i();
                }
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m54335a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        C10242h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10242h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52833t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m123461a0 = FollowerListView.this.m54320WK().m123461a0();
                a aVar = new a(FollowerListView.this);
                this.f52833t = 1;
                if (m123461a0.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10242h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$i */
    /* loaded from: classes5.dex */
    static final class C10243i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52836t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$i$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FollowerListView f52838p;

            a(FollowerListView followerListView) {
                this.f52838p = followerListView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(InterfaceC20907a interfaceC20907a, Continuation continuation) {
                Throwable m109378a;
                int i11;
                C31170j c31170j;
                if (interfaceC20907a instanceof InterfaceC20907a.d) {
                    C23525b.a aVar = (C23525b.a) ((InterfaceC20907a.d) interfaceC20907a).m109379a();
                    C25097t c25097t = C25097t.f120556a;
                    Context context = this.f52838p.getContext();
                    FollowerListView followerListView = this.f52838p;
                    if (aVar.m123470a()) {
                        i11 = AbstractC27413h.zch_page_block_list_block_user_success;
                    } else {
                        i11 = AbstractC27413h.zch_page_block_list_unblock_user_success;
                    }
                    c25097t.m130154o(context, followerListView.m92653YI(i11, aVar.m123471b().m51235h()));
                    if (aVar.m123470a() && (c31170j = this.f52838p.f52808B0) != null) {
                        c31170j.m151729T(aVar.m123471b().m51234g());
                    }
                } else if ((interfaceC20907a instanceof InterfaceC20907a.a) && (m109378a = ((InterfaceC20907a.a) interfaceC20907a).m109378a()) != null) {
                    C25097t.f120556a.m130155r(this.f52838p.getContext(), m109378a);
                }
                return C24848g0.f119245a;
            }
        }

        C10243i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10243i(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52836t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m123458X = FollowerListView.this.m54320WK().m123458X();
                a aVar = new a(FollowerListView.this);
                this.f52836t = 1;
                if (m123458X.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10243i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FollowerListView$j */
    /* loaded from: classes5.dex */
    static final class C10244j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10244j f52839q = new C10244j();

        C10244j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23525b mo12V4() {
            return C26449a.f125639a.m136336a();
        }
    }

    public FollowerListView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C10244j.f52839q);
        this.f52810z0 = m129210a;
        this.f52809C0 = new NetworkReceiver(new C10236b(), new C10237c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WK */
    public final C23525b m54320WK() {
        return (C23525b) this.f52810z0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XK */
    public static final void m54321XK(FollowerListView followerListView, View view) {
        AbstractC19074t.m100208f(followerListView, "this$0");
        followerListView.m54320WK().m123465g0();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C25009g1 c25009g1;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25009g1 m129822c = C25009g1.m129822c(layoutInflater);
        AbstractC19074t.m100207e(m129822c, "inflate(...)");
        this.f52807A0 = m129822c;
        m54320WK().m123468i0(m92642L3());
        C25009g1 c25009g12 = this.f52807A0;
        C25009g1 c25009g13 = null;
        if (c25009g12 == null) {
            AbstractC19074t.m100223u("binding");
            c25009g1 = null;
        } else {
            c25009g1 = c25009g12;
        }
        C31170j c31170j = new C31170j(null, 1, null);
        c31170j.m151732W(new C10238d());
        this.f52808B0 = c31170j;
        c25009g1.f119915q.f119989q.setOnClickListener(new View.OnClickListener() { // from class: m20.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FollowerListView.m54321XK(FollowerListView.this, view);
            }
        });
        c25009g1.f119915q.f119995w.setText(m92652XI(AbstractC27413h.zch_page_follower_title));
        HeaderLayout root = c25009g1.f119915q.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            FrameLayout root2 = c25009g1.getRoot();
            AbstractC19074t.m100207e(root2, "getRoot(...)");
            layoutParams2.topMargin = AbstractC26112n.m134365F(root2);
            root.setLayoutParams(layoutParams2);
            OverScrollableRecyclerView overScrollableRecyclerView = c25009g1.f119918t;
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            overScrollableRecyclerView.setLayoutManager(new OverScrollableRecyclerView.LinearLayoutManager(m92689tK, 0, false, false, 14, null));
            c25009g1.f119918t.setAdapter(this.f52808B0);
            c25009g1.f119918t.m9816A(new C10239e(m92651WI().getDimensionPixelSize(AbstractC27407b.zch_radius_8dp), this));
            AbstractC26114p.m134444b(this, null, null, new C10240f(null), 3, null);
            AbstractC26114p.m134444b(this, null, null, new C10241g(c25009g1, null), 3, null);
            AbstractC26114p.m134444b(this, null, null, new C10242h(null), 3, null);
            AbstractC26114p.m134444b(this, null, null, new C10243i(null), 3, null);
            C25009g1 c25009g14 = this.f52807A0;
            if (c25009g14 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25009g13 = c25009g14;
            }
            FrameLayout root3 = c25009g13.getRoot();
            AbstractC19074t.m100207e(root3, "getRoot(...)");
            return root3;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        Context context = getContext();
        if (context != null) {
            this.f52809C0.mo53685d(context);
        }
        if (!m54320WK().m123464f0() || m54320WK().m123462c0()) {
            m54320WK().m123467i();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        this.f52809C0.mo53687g();
        C25009g1 c25009g1 = this.f52807A0;
        if (c25009g1 == null) {
            AbstractC19074t.m100223u("binding");
            c25009g1 = null;
        }
        c25009g1.f119916r.m55781c();
        super.mo37712VJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (m92649TI().m93012K0() instanceof BaseBottomSheetView) {
            return m92649TI().m93096z1(i11, keyEvent);
        }
        if (i11 == 4) {
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
