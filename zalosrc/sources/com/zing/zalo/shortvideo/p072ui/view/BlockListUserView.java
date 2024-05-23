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
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import h20.InterfaceC19718b;
import m20.InterfaceC22727c;
import p148f3.C18711c;
import p227i3.C20218v;
import pm0.C24848g0;
import q10.C25061v1;
import q20.C25097t;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27409d;
import v00.AbstractC27413h;
import w00.AbstractC28684a;
import z10.C31154b;

/* loaded from: classes5.dex */
public final class BlockListUserView extends ZchBaseView implements InterfaceC22727c {

    /* renamed from: A0 */
    private C25061v1 f52535A0;

    /* renamed from: B0 */
    private C31154b f52536B0;

    /* renamed from: z0 */
    private InterfaceC19718b f52537z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockListUserView$a */
    /* loaded from: classes5.dex */
    public static final class C10115a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ User f52539r;

        /* renamed from: s */
        final /* synthetic */ ConfirmPopupView f52540s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10115a(User user, ConfirmPopupView confirmPopupView) {
            super(0);
            this.f52539r = user;
            this.f52540s = confirmPopupView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53926a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53926a() {
            InterfaceC19718b interfaceC19718b = BlockListUserView.this.f52537z0;
            if (interfaceC19718b == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19718b = null;
            }
            interfaceC19718b.mo53011TG(this.f52539r);
            String m92652XI = this.f52540s.m92652XI(AbstractC27413h.zch_action_key_block_user);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            c19205a.m100713L(m92652XI, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockListUserView$b */
    /* loaded from: classes5.dex */
    static final class C10116b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25061v1 f52541q;

        /* renamed from: r */
        final /* synthetic */ BlockListUserView f52542r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10116b(C25061v1 c25061v1, BlockListUserView blockListUserView) {
            super(0);
            this.f52541q = c25061v1;
            this.f52542r = blockListUserView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53927a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53927a() {
            this.f52541q.f120355r.m55786j();
            InterfaceC19718b interfaceC19718b = this.f52542r.f52537z0;
            if (interfaceC19718b == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19718b = null;
            }
            interfaceC19718b.mo53013i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockListUserView$c */
    /* loaded from: classes5.dex */
    static final class C10117c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25061v1 f52543q;

        /* renamed from: r */
        final /* synthetic */ BlockListUserView f52544r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10117c(C25061v1 c25061v1, BlockListUserView blockListUserView) {
            super(0);
            this.f52543q = c25061v1;
            this.f52544r = blockListUserView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53928a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53928a() {
            this.f52543q.f120355r.m55786j();
            InterfaceC19718b interfaceC19718b = this.f52544r.f52537z0;
            if (interfaceC19718b == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19718b = null;
            }
            interfaceC19718b.mo53013i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockListUserView$d */
    /* loaded from: classes5.dex */
    public static final class C10118d implements C31154b.b {
        C10118d() {
        }

        @Override // z10.C31154b.b
        /* renamed from: a */
        public void mo53929a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
            InterfaceC19718b interfaceC19718b = BlockListUserView.this.f52537z0;
            if (interfaceC19718b == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19718b = null;
            }
            interfaceC19718b.mo53012a(loadMoreInfo);
        }

        @Override // z10.C31154b.b
        /* renamed from: m */
        public void mo53930m(View view) {
            View view2;
            Object obj;
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            if (view.getId() == AbstractC27409d.btnBlock) {
                Object parent = view.getParent();
                User user = null;
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
                if (obj instanceof User) {
                    user = (User) obj;
                }
                if (user != null) {
                    BlockListUserView.this.m53919UK(!AbstractC19074t.m100204b(view.getTag(), Boolean.TRUE), user);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockListUserView$e */
    /* loaded from: classes5.dex */
    public static final class C10119e extends RecyclerView.AbstractC1887n {

        /* renamed from: a */
        private final Paint f52546a;

        /* renamed from: b */
        final /* synthetic */ int f52547b;

        C10119e(int i11, BlockListUserView blockListUserView) {
            this.f52547b = i11;
            Paint paint = new Paint();
            paint.setFlags(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(AbstractC1388a.m6961c(blockListUserView.m92689tK(), AbstractC27406a.zch_layer_background_subtle));
            this.f52546a = paint;
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
                rect.top = this.f52547b;
            } else if (num != null && num.intValue() == i12) {
                rect.bottom = this.f52547b;
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
            canvas.drawRect(0.0f, childAt.getTop() - this.f52547b, recyclerView.getWidth(), childAt.getTop(), this.f52546a);
            View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
            canvas.drawRect(0.0f, childAt2.getBottom(), recyclerView.getWidth(), childAt2.getBottom() + this.f52547b, this.f52546a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BlockListUserView$f */
    /* loaded from: classes5.dex */
    static final class C10120f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10120f f52548q = new C10120f();

        C10120f() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(User user) {
            AbstractC19074t.m100208f(user, "i");
            return user.m51234g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UK */
    public final void m53919UK(boolean z11, User user) {
        if (z11) {
            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_block_user_title), Integer.valueOf(AbstractC27413h.zch_popup_block_user_message), Integer.valueOf(AbstractC27413h.zch_popup_block_user_positive), Integer.valueOf(AbstractC27413h.zch_popup_block_user_negative), null, true, false, 80, null);
            m51992b.m51991lL(new C10115a(user, m51992b));
            m51992b.m51978ZK(true);
            BasePopupView.m51974dL(m51992b, m53920VK(), null, 2, null);
            String m92652XI = m92652XI(AbstractC27413h.zch_action_key_list_user_icon_block);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            c19205a.m100713L(m92652XI, null);
            return;
        }
        InterfaceC19718b interfaceC19718b = this.f52537z0;
        if (interfaceC19718b == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19718b = null;
        }
        interfaceC19718b.mo53014mb(user);
        String m92652XI2 = m92652XI(AbstractC27413h.zch_action_key_unblock_user);
        C19205a c19205a2 = C19205a.f95429a;
        AbstractC19074t.m100205c(m92652XI2);
        c19205a2.m100713L(m92652XI2, null);
    }

    /* renamed from: VK */
    private final C17487o0 m53920VK() {
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
        InterfaceC19718b m143678l = AbstractC28684a.Companion.m143678l();
        this.f52537z0 = m143678l;
        if (m143678l == null) {
            AbstractC19074t.m100223u("presenter");
            m143678l = null;
        }
        m143678l.mo52965Lb(this);
        AbstractC1785o lifecycle = getLifecycle();
        InterfaceC19718b interfaceC19718b = this.f52537z0;
        if (interfaceC19718b == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19718b = null;
        }
        lifecycle.mo9335a(interfaceC19718b);
        C31154b c31154b = new C31154b(null, 1, null);
        c31154b.m151456Z(new C10118d());
        this.f52536B0 = c31154b;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25061v1 m129957c = C25061v1.m129957c(layoutInflater);
        AbstractC19074t.m100207e(m129957c, "inflate(...)");
        this.f52535A0 = m129957c;
        C25061v1 c25061v1 = null;
        if (m129957c == null) {
            AbstractC19074t.m100223u("binding");
            m129957c = null;
        }
        m129957c.f120356s.setLayoutManager(new LinearLayoutManager(getContext()));
        m129957c.f120356s.setAdapter(this.f52536B0);
        m129957c.f120356s.m9816A(new C10119e(m92651WI().getDimensionPixelSize(AbstractC27407b.zch_radius_8dp), this));
        C25061v1 c25061v12 = this.f52535A0;
        if (c25061v12 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25061v1 = c25061v12;
        }
        FrameLayout root = c25061v1.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        InterfaceC19718b interfaceC19718b = this.f52537z0;
        InterfaceC19718b interfaceC19718b2 = null;
        if (interfaceC19718b == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19718b = null;
        }
        if (interfaceC19718b.mo53010Oj() == null) {
            C25061v1 c25061v1 = this.f52535A0;
            if (c25061v1 == null) {
                AbstractC19074t.m100223u("binding");
                c25061v1 = null;
            }
            c25061v1.f120355r.m55786j();
            InterfaceC19718b interfaceC19718b3 = this.f52537z0;
            if (interfaceC19718b3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC19718b2 = interfaceC19718b3;
            }
            interfaceC19718b2.mo53013i();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C25061v1 c25061v1 = this.f52535A0;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55781c();
    }

    @Override // m20.InterfaceC22727c
    /* renamed from: b */
    public void mo53921b(boolean z11) {
        InterfaceC19718b interfaceC19718b = this.f52537z0;
        InterfaceC19718b interfaceC19718b2 = null;
        if (interfaceC19718b == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19718b = null;
        }
        if (interfaceC19718b.mo53010Oj() == null) {
            C25061v1 c25061v1 = this.f52535A0;
            if (c25061v1 == null) {
                AbstractC19074t.m100223u("binding");
                c25061v1 = null;
            }
            if (z11) {
                c25061v1.f120355r.m55786j();
                InterfaceC19718b interfaceC19718b3 = this.f52537z0;
                if (interfaceC19718b3 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC19718b2 = interfaceC19718b3;
                }
                interfaceC19718b2.mo53013i();
            }
        }
    }

    @Override // m20.InterfaceC22727c
    /* renamed from: d */
    public void mo53922d(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        InterfaceC19718b interfaceC19718b = this.f52537z0;
        C25061v1 c25061v1 = null;
        if (interfaceC19718b == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19718b = null;
        }
        if (interfaceC19718b.mo53010Oj() == null) {
            C25061v1 c25061v12 = this.f52535A0;
            if (c25061v12 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25061v1 = c25061v12;
            }
            if (th2 instanceof NetworkException) {
                c25061v1.f120355r.m55784g(new C10116b(c25061v1, this));
            } else {
                c25061v1.f120355r.m55783f(new C10117c(c25061v1, this));
            }
        }
    }

    @Override // m20.InterfaceC22727c
    /* renamed from: e */
    public void mo53923e(Section section) {
        AbstractC19074t.m100208f(section, "newItems");
        C31154b c31154b = this.f52536B0;
        if (c31154b != null) {
            int mo10003k = c31154b.mo10003k();
            c31154b.m151450T().m51163e(section, C10120f.f52548q);
            c31154b.m10015w(mo10003k, c31154b.mo10003k() - mo10003k);
        }
    }

    @Override // m20.InterfaceC22727c
    /* renamed from: o */
    public void mo53924o(Section section) {
        AbstractC19074t.m100208f(section, "newItems");
        C25061v1 c25061v1 = this.f52535A0;
        if (c25061v1 == null) {
            AbstractC19074t.m100223u("binding");
            c25061v1 = null;
        }
        c25061v1.f120355r.m55781c();
        C31154b c31154b = this.f52536B0;
        if (c31154b != null) {
            c31154b.m151457a0(section);
            c31154b.m10008p();
        }
    }

    @Override // m20.InterfaceC22727c
    /* renamed from: z4 */
    public void mo53925z4(boolean z11, Throwable th2, User user) {
        int i11;
        AbstractC19074t.m100208f(user, "user");
        if (th2 != null) {
            C25097t.f120556a.m130155r(getContext(), th2);
            return;
        }
        C25097t c25097t = C25097t.f120556a;
        Context context = getContext();
        if (z11) {
            i11 = AbstractC27413h.zch_page_block_list_block_user_success;
        } else {
            i11 = AbstractC27413h.zch_page_block_list_unblock_user_success;
        }
        c25097t.m130154o(context, m92653YI(i11, user.m51235h()));
        if (z11) {
            C31154b c31154b = this.f52536B0;
            if (c31154b != null) {
                c31154b.m151451U(user.m51234g());
                return;
            }
            return;
        }
        C31154b c31154b2 = this.f52536B0;
        if (c31154b2 != null) {
            c31154b2.m151452V(user.m51234g());
        }
    }
}
