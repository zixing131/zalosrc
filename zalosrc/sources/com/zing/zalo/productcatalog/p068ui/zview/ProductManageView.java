package com.zing.zalo.productcatalog.p068ui.zview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.productcatalog.model.CatalogAddEditModel;
import com.zing.zalo.productcatalog.model.Product;
import com.zing.zalo.productcatalog.p068ui.zview.ProductContextMenuBottomSheet;
import com.zing.zalo.productcatalog.p068ui.zview.ProductManageView;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.productcatalog.utils.AddProductSource;
import com.zing.zalo.productcatalog.utils.DeleteCatalogSource;
import com.zing.zalo.productcatalog.utils.DeleteProductSource;
import com.zing.zalo.productcatalog.utils.EditCatalogSource;
import com.zing.zalo.productcatalog.utils.EditProductSource;
import com.zing.zalo.productcatalog.utils.MoveProductSource;
import com.zing.zalo.productcatalog.utils.SendProductSource;
import com.zing.zalo.uicontrol.MultiSelectBottomView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23217t2;
import me0.AbstractC23222t7;
import me0.C23055e5;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p024ay.AbstractC2421j;
import p024ay.C2460y;
import p115dy.AbstractC18084c1;
import p115dy.AbstractC18087d1;
import p115dy.AbstractC18114r;
import p115dy.AbstractC18116s;
import p115dy.AbstractC18122v;
import p115dy.AbstractC18124w;
import p115dy.AbstractC18129y0;
import p115dy.C18076a;
import p115dy.C18113q0;
import p115dy.C18131z0;
import p262jb.AbstractC21196a;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p624wx.AbstractC29263f;
import p624wx.C29259b;
import p649xl.C30017r9;
import p661xx.AbstractC30220f;
import p661xx.InterfaceC30219e;
import p661xx.InterfaceC30221g;
import p696yx.C31099k;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import qm0.AbstractC25370t;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class ProductManageView extends SlidableZaloView implements InterfaceC30221g, InterfaceC30219e {
    public static final C9129a Companion = new C9129a(null);

    /* renamed from: P0 */
    private C30017r9 f48706P0;

    /* renamed from: Q0 */
    private C31099k f48707Q0;

    /* renamed from: R0 */
    private LinearLayoutManager f48708R0;

    /* renamed from: S0 */
    private long f48709S0;

    /* renamed from: U0 */
    private MultiSelectBottomView f48711U0;

    /* renamed from: V0 */
    private View f48712V0;

    /* renamed from: W0 */
    private View f48713W0;

    /* renamed from: X0 */
    private View f48714X0;

    /* renamed from: Z0 */
    private final InterfaceC24854k f48716Z0;

    /* renamed from: a1 */
    private final InterfaceC1764d0 f48717a1;

    /* renamed from: b1 */
    private final InterfaceC1764d0 f48718b1;

    /* renamed from: c1 */
    private final InterfaceC24854k f48719c1;

    /* renamed from: d1 */
    private List f48720d1;

    /* renamed from: e1 */
    private C16972e0 f48721e1;

    /* renamed from: f1 */
    private C16972e0 f48722f1;

    /* renamed from: T0 */
    private AbstractC9130b f48710T0 = AbstractC9130b.b.f48724a;

    /* renamed from: Y0 */
    private final InterfaceC24854k f48715Y0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C18131z0.class), new C9141m(new C9140l(this)), C9144p.f48740q);

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$a */
    /* loaded from: classes4.dex */
    public static final class C9129a {
        private C9129a() {
        }

        public /* synthetic */ C9129a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC9130b {

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC9130b {

            /* renamed from: a */
            public static final a f48723a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$b$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC9130b {

            /* renamed from: a */
            public static final b f48724a = new b();

            private b() {
                super(null);
            }
        }

        private AbstractC9130b() {
        }

        public /* synthetic */ AbstractC9130b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$c */
    /* loaded from: classes4.dex */
    static final class C9131c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9131c f48725q = new C9131c();

        C9131c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C18076a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$d */
    /* loaded from: classes4.dex */
    public static final class C9132d extends AbstractC19075u implements InterfaceC18505l {
        C9132d() {
            super(1);
        }

        /* renamed from: a */
        public final void m48898a(AbstractC18114r abstractC18114r) {
            AbstractC19074t.m100208f(abstractC18114r, "state");
            if (AbstractC19074t.m100204b(abstractC18114r, AbstractC18114r.b.f91718a)) {
                ProductManageView.this.m48835EM().m12483c("delete_catalog");
                return;
            }
            if (AbstractC19074t.m100204b(abstractC18114r, AbstractC18114r.c.f91719a)) {
                ProductManageView.this.m48835EM().m12482b("delete_catalog");
                ProductManageView.this.finish();
            } else if (abstractC18114r instanceof AbstractC18114r.a) {
                ProductManageView.this.m48835EM().m12482b("delete_catalog");
                AbstractC18114r.a aVar = (AbstractC18114r.a) abstractC18114r;
                if (aVar.m96406a().length() > 0) {
                    ToastUtils.showMess(false, aVar.m96406a());
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48898a((AbstractC18114r) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$e */
    /* loaded from: classes4.dex */
    public static final class C9133e extends AbstractC19075u implements InterfaceC18505l {
        C9133e() {
            super(1);
        }

        /* renamed from: a */
        public final void m48899a(AbstractC18116s abstractC18116s) {
            AbstractC19074t.m100208f(abstractC18116s, "state");
            if (AbstractC19074t.m100204b(abstractC18116s, AbstractC18116s.b.f91723a)) {
                ProductManageView.this.m48835EM().m12483c("delete_product");
                return;
            }
            if (AbstractC19074t.m100204b(abstractC18116s, AbstractC18116s.c.f91724a)) {
                ProductManageView.this.m48835EM().m12482b("delete_product");
                ProductManageView.this.m48881pN(false);
                ProductManageView.this.invalidateOptionsMenu();
                ToastUtils.m89266n(AbstractC8020f0.product_catalog_toast_product_deleted, new Object[0]);
                return;
            }
            if (abstractC18116s instanceof AbstractC18116s.a) {
                ProductManageView.this.m48835EM().m12482b("delete_product");
                AbstractC18116s.a aVar = (AbstractC18116s.a) abstractC18116s;
                if (aVar.m96407a().length() > 0) {
                    ToastUtils.showMess(false, aVar.m96407a());
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48899a((AbstractC18116s) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$f */
    /* loaded from: classes4.dex */
    public static final class C9134f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ SendProductSource f48729r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9134f(SendProductSource sendProductSource) {
            super(1);
            this.f48729r = sendProductSource;
        }

        /* renamed from: a */
        public final void m48900a(AbstractC18087d1 abstractC18087d1) {
            String str;
            AbstractC19074t.m100208f(abstractC18087d1, "state");
            if (AbstractC19074t.m100204b(abstractC18087d1, AbstractC18087d1.a.f91581a)) {
                ProductManageView.this.m48835EM().m12483c("share_product");
                return;
            }
            if (abstractC18087d1 instanceof AbstractC18087d1.b) {
                ProductManageView.this.m48835EM().m12482b("share_product");
                AbstractC18087d1.b bVar = (AbstractC18087d1.b) abstractC18087d1;
                if (!bVar.m96243a().isEmpty()) {
                    SendProductSource sendProductSource = this.f48729r;
                    if (AbstractC19074t.m100204b(sendProductSource, SendProductSource.ProductManageContextMenuShare.f48782q)) {
                        str = "product_manage_context_menu_share";
                    } else if (AbstractC19074t.m100204b(sendProductSource, SendProductSource.ProductManageMultiSelect.f48783q)) {
                        str = "product_manage_multi_select";
                    } else {
                        str = "";
                    }
                    ProductManageView.this.m48871kN(bVar.m96243a(), true, str);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48900a((AbstractC18087d1) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$g */
    /* loaded from: classes4.dex */
    static final class C9135g extends AbstractC19075u implements InterfaceC18494a {
        C9135g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2460y mo12V4() {
            return new C2460y(ProductManageView.this);
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$h */
    /* loaded from: classes4.dex */
    static final class C9136h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C29259b f48732r;

        /* renamed from: s */
        final /* synthetic */ List f48733s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9136h(C29259b c29259b, List list) {
            super(1);
            this.f48732r = c29259b;
            this.f48733s = list;
        }

        /* renamed from: a */
        public final void m48902a(AbstractC18124w abstractC18124w) {
            String m118746s0;
            int m127173b0;
            String m127114D;
            AbstractC19074t.m100208f(abstractC18124w, "state");
            if (AbstractC19074t.m100204b(abstractC18124w, AbstractC18124w.b.f91751a)) {
                ProductManageView.this.m48835EM().m12483c("move_product");
                return;
            }
            if (AbstractC19074t.m100204b(abstractC18124w, AbstractC18124w.c.f91752a)) {
                ProductManageView.this.m48835EM().m12482b("move_product");
                String m146160o = this.f48732r.m146160o();
                if (this.f48733s.size() == 1) {
                    m118746s0 = AbstractC23136l9.m118743r0(AbstractC8020f0.product_catalog_toast_single_product_moved);
                } else {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.product_catalog_toast_multiple_products_moved, Integer.valueOf(this.f48733s.size()));
                }
                String str = m118746s0;
                AbstractC19074t.m100205c(str);
                m127173b0 = AbstractC24342w.m127173b0(str, "[[catalog_name]]", 0, false, 6, null);
                int length = m127173b0 + m146160o.length();
                m127114D = AbstractC24341v.m127114D(str, "[[catalog_name]]", m146160o, false, 4, null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m127114D);
                AbstractC23217t2.m119664p(spannableStringBuilder, m127173b0, length, 0, 7, 33);
                ToastUtils.showMess(true, spannableStringBuilder, true, false, 0, AbstractC7409c0.photo_sent_toast_layout);
                ProductManageView.this.m48881pN(false);
                return;
            }
            if (abstractC18124w instanceof AbstractC18124w.a) {
                ProductManageView.this.m48835EM().m12482b("move_product");
                AbstractC18124w.a aVar = (AbstractC18124w.a) abstractC18124w;
                if (aVar.m96411a().length() > 0) {
                    ToastUtils.showMess(false, aVar.m96411a());
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48902a((AbstractC18124w) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$i */
    /* loaded from: classes4.dex */
    public static final class C9137i extends RecyclerView.AbstractC1887n {
        C9137i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            int i11;
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int m9817A0 = recyclerView.m9817A0(view);
            RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                i11 = layoutManager.m10127i();
            } else {
                i11 = 0;
            }
            if (m9817A0 == i11 - 1) {
                rect.bottom = AbstractC23222t7.f112591v0;
            }
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$j */
    /* loaded from: classes4.dex */
    public static final class C9138j extends RecyclerView.AbstractC1892s {
        C9138j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            if (i11 != 0 || i12 != 0) {
                try {
                    LinearLayoutManager linearLayoutManager = ProductManageView.this.f48708R0;
                    if (linearLayoutManager == null) {
                        AbstractC19074t.m100223u("layoutManager");
                        linearLayoutManager = null;
                    }
                    int m9745c2 = linearLayoutManager.m9745c2();
                    C31099k c31099k = ProductManageView.this.f48707Q0;
                    if (c31099k == null) {
                        AbstractC19074t.m100223u("adapter");
                        c31099k = null;
                    }
                    AbstractC18129y0 m151100L = c31099k.m151100L(m9745c2);
                    LinearLayoutManager linearLayoutManager2 = ProductManageView.this.f48708R0;
                    if (linearLayoutManager2 == null) {
                        AbstractC19074t.m100223u("layoutManager");
                        linearLayoutManager2 = null;
                    }
                    if (m9745c2 >= linearLayoutManager2.m10127i() - 1 && (m151100L instanceof AbstractC18129y0.i)) {
                        C18113q0.m96331K0(ProductManageView.this.m48836FM(), false, 1, null);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$k */
    /* loaded from: classes4.dex */
    public static final class C9139k extends AbstractC19075u implements InterfaceC18505l {
        C9139k() {
            super(1);
        }

        /* renamed from: a */
        public final void m48903a(AbstractC18084c1 abstractC18084c1) {
            AbstractC19074t.m100208f(abstractC18084c1, "state");
            if (AbstractC19074t.m100204b(abstractC18084c1, AbstractC18084c1.a.f91540a)) {
                ProductManageView.this.m48835EM().m12483c("share_catalog");
                return;
            }
            if (abstractC18084c1 instanceof AbstractC18084c1.b) {
                ProductManageView.this.m48835EM().m12482b("share_catalog");
                AbstractC18084c1.b bVar = (AbstractC18084c1.b) abstractC18084c1;
                if (!bVar.m96165a().isEmpty()) {
                    ProductManageView.this.m48871kN(bVar.m96165a(), false, "product_manage_share_catalog");
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48903a((AbstractC18084c1) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$l */
    /* loaded from: classes4.dex */
    public static final class C9140l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f48736q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9140l(ZaloView zaloView) {
            super(0);
            this.f48736q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f48736q;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$m */
    /* loaded from: classes4.dex */
    public static final class C9141m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f48737q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9141m(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48737q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f48737q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$n */
    /* loaded from: classes4.dex */
    public static final class C9142n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f48738q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9142n(ZaloView zaloView) {
            super(0);
            this.f48738q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f48738q;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$o */
    /* loaded from: classes4.dex */
    public static final class C9143o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f48739q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9143o(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48739q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f48739q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductManageView$p */
    /* loaded from: classes4.dex */
    static final class C9144p extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9144p f48740q = new C9144p();

        C9144p() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C18131z0.a();
        }
    }

    public ProductManageView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C9135g());
        this.f48716Z0 = m129210a;
        this.f48717a1 = new InterfaceC1764d0() { // from class: ay.p1
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                ProductManageView.m48841KM(ProductManageView.this, (List) obj);
            }
        };
        this.f48718b1 = new InterfaceC1764d0() { // from class: ay.q1
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                ProductManageView.m48842LM(ProductManageView.this, (AbstractC18122v) obj);
            }
        };
        this.f48719c1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C18076a.class), new C9143o(new C9142n(this)), C9131c.f48725q);
    }

    /* renamed from: AM */
    private final void m48831AM(C29259b c29259b) {
        m48836FM().m96427T0(c29259b, DeleteCatalogSource.ProductManageContextMenuDelete.f48755q, new C9132d());
    }

    /* renamed from: BM */
    private final void m48832BM(List list, DeleteProductSource deleteProductSource) {
        m48836FM().m96364Y(list, deleteProductSource, new C9133e());
    }

    /* renamed from: CM */
    private final void m48833CM(List list, SendProductSource sendProductSource) {
        m48836FM().m96373k0(list, sendProductSource, new C9134f(sendProductSource));
    }

    /* renamed from: DM */
    private final C18076a m48834DM() {
        return (C18076a) this.f48719c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public final C2460y m48835EM() {
        return (C2460y) this.f48716Z0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public final C18131z0 m48836FM() {
        return (C18131z0) this.f48715Y0.getValue();
    }

    /* renamed from: GM */
    private final void m48837GM() {
        if (this.f48711U0 == null) {
            C30017r9 c30017r9 = this.f48706P0;
            C30017r9 c30017r92 = null;
            if (c30017r9 == null) {
                AbstractC19074t.m100223u("binding");
                c30017r9 = null;
            }
            Context context = c30017r9.getRoot().getContext();
            AbstractC19074t.m100205c(context);
            MultiSelectBottomView multiSelectBottomView = new MultiSelectBottomView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12, -1);
            C30017r9 c30017r93 = this.f48706P0;
            if (c30017r93 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30017r92 = c30017r93;
            }
            c30017r92.getRoot().addView(multiSelectBottomView, layoutParams);
            this.f48711U0 = multiSelectBottomView;
            Drawable m139659b = C27280g.m139659b(context, AbstractC2810d.zds_ic_share_line_24, AbstractC2808b.f150820b50);
            int i11 = AbstractC6918a0.product_catalog_menu_share;
            String string = m92651WI().getString(AbstractC8020f0.product_catalog_manage_menu_share);
            AbstractC19074t.m100207e(string, "getString(...)");
            TextView m87769a = multiSelectBottomView.m87769a(i11, string, m139659b);
            m87769a.setOnClickListener(new View.OnClickListener() { // from class: ay.l1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductManageView.m48838HM(ProductManageView.this, view);
                }
            });
            this.f48712V0 = m87769a;
            Drawable m139660c = C27280g.m139660c(context, AbstractC2810d.zds_ic_shuffle_solid_24, AbstractC2807a.icon_01);
            int i12 = AbstractC6918a0.product_catalog_menu_move;
            String string2 = m92651WI().getString(AbstractC8020f0.product_catalog_manage_menu_move);
            AbstractC19074t.m100207e(string2, "getString(...)");
            TextView m87769a2 = multiSelectBottomView.m87769a(i12, string2, m139660c);
            m87769a2.setOnClickListener(new View.OnClickListener() { // from class: ay.m1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductManageView.m48839IM(ProductManageView.this, view);
                }
            });
            this.f48713W0 = m87769a2;
            Drawable m139660c2 = C27280g.m139660c(context, AbstractC2810d.zds_ic_delete_line_24, AbstractC2807a.danger);
            int i13 = AbstractC6918a0.product_catalog_menu_delete;
            String string3 = m92651WI().getString(AbstractC8020f0.product_catalog_manage_menu_delete);
            AbstractC19074t.m100207e(string3, "getString(...)");
            TextView m87769a3 = multiSelectBottomView.m87769a(i13, string3, m139660c2);
            m87769a3.setOnClickListener(new View.OnClickListener() { // from class: ay.n1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductManageView.m48840JM(ProductManageView.this, view);
                }
            });
            this.f48714X0 = m87769a3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m48838HM(ProductManageView productManageView, View view) {
        AbstractC19074t.m100208f(productManageView, "this$0");
        productManageView.m48863gN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m48839IM(ProductManageView productManageView, View view) {
        AbstractC19074t.m100208f(productManageView, "this$0");
        productManageView.m48858cN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m48840JM(ProductManageView productManageView, View view) {
        AbstractC19074t.m100208f(productManageView, "this$0");
        productManageView.m48853WM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m48841KM(ProductManageView productManageView, List list) {
        AbstractC19074t.m100208f(productManageView, "this$0");
        AbstractC19074t.m100208f(list, "items");
        C31099k c31099k = productManageView.f48707Q0;
        C31099k c31099k2 = null;
        if (c31099k == null) {
            AbstractC19074t.m100223u("adapter");
            c31099k = null;
        }
        c31099k.m151103O(list);
        C31099k c31099k3 = productManageView.f48707Q0;
        if (c31099k3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c31099k2 = c31099k3;
        }
        c31099k2.m10008p();
        productManageView.m48889tN();
        productManageView.invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m48842LM(ProductManageView productManageView, AbstractC18122v abstractC18122v) {
        boolean z11;
        AbstractC19074t.m100208f(productManageView, "this$0");
        AbstractC19074t.m100208f(abstractC18122v, "state");
        C30017r9 c30017r9 = productManageView.f48706P0;
        if (c30017r9 == null) {
            AbstractC19074t.m100223u("binding");
            c30017r9 = null;
        }
        SwipeRefreshLayout swipeRefreshLayout = c30017r9.f139224r;
        if ((abstractC18122v instanceof AbstractC18122v.g) && ((AbstractC18122v.g) abstractC18122v).m96410a()) {
            z11 = true;
        } else {
            z11 = false;
        }
        swipeRefreshLayout.setRefreshing(z11);
    }

    /* renamed from: MM */
    private final void m48843MM(AddProductSource addProductSource) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putLong("EXTRA_CATALOG_ID", this.f48709S0);
        bundle.putParcelable("EXTRA_TRACKING_SOURCE", addProductSource);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(ProductAddEditView.class, bundle, 2, true);
        }
    }

    /* renamed from: NM */
    private final void m48844NM(AbstractC9130b abstractC9130b) {
        this.f48710T0 = abstractC9130b;
        mo37493TJ();
        invalidateOptionsMenu();
        if (this.f48710T0 instanceof AbstractC9130b.a) {
            m48883qN(true);
        } else {
            m48883qN(false);
        }
    }

    /* renamed from: OM */
    private final void m48845OM() {
        m48836FM().mo96362W();
        m48881pN(false);
    }

    /* renamed from: PM */
    private final void m48846PM() {
        final C29259b m96380u0;
        Context context = getContext();
        if (context == null || (m96380u0 = m48836FM().m96380u0()) == null) {
            return;
        }
        C16972e0 c16972e0 = this.f48722f1;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
        if (!m48836FM().m96428U0(m96380u0)) {
            ToastUtils.showMess(m92651WI().getString(AbstractC8020f0.product_catalog_toast_keep_at_least_one_catalog));
            return;
        }
        C16972e0.a aVar = new C16972e0.a(context);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90931h("ProductManageView-ConfirmDeleteCatalog");
        String string = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_this_catalog_title);
        AbstractC19074t.m100207e(string, "getString(...)");
        aVar.m90918B(string);
        String string2 = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_this_catalog_desc);
        AbstractC19074t.m100207e(string2, "getString(...)");
        aVar.m90949z(string2);
        aVar.m90921E(true);
        aVar.m90947x("ProductManageView-ConfirmDeleteCatalog-Positive");
        String string3 = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_btn_confirm);
        AbstractC19074t.m100207e(string3, "getString(...)");
        aVar.m90943t(string3, new InterfaceC17463d.d() { // from class: ay.r1
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ProductManageView.m48847QM(ProductManageView.this, m96380u0, interfaceC17463d, i11);
            }
        });
        aVar.m90937n("ProductManageView-ConfirmDeleteCatalog-Negative");
        String string4 = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_btn_cancel);
        AbstractC19074t.m100207e(string4, "getString(...)");
        aVar.m90934k(string4, new InterfaceC17463d.d() { // from class: ay.i1
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ProductManageView.m48848RM(interfaceC17463d, i11);
            }
        });
        this.f48722f1 = aVar.m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public static final void m48847QM(ProductManageView productManageView, C29259b c29259b, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(productManageView, "this$0");
        AbstractC19074t.m100208f(c29259b, "$catalog");
        productManageView.m48831AM(c29259b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public static final void m48848RM(InterfaceC17463d interfaceC17463d, int i11) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.text.SpannableStringBuilder, android.text.Spannable] */
    /* renamed from: SM */
    private final void m48849SM(final List list, final DeleteProductSource deleteProductSource) {
        String str;
        int m127173b0;
        C16972e0 c16972e0 = this.f48721e1;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (list.size() == 1) {
            String m48488l = ((Product) list.get(0)).m48488l();
            String string = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_single_msg, m48488l);
            AbstractC19074t.m100207e(string, "getString(...)");
            m127173b0 = AbstractC24342w.m127173b0(string, m48488l, 0, false, 6, null);
            int length = m127173b0 + m48488l.length();
            ?? spannableStringBuilder = new SpannableStringBuilder(string);
            AbstractC23217t2.m119664p(spannableStringBuilder, m127173b0, length, C23212s8.m119607o(context, AbstractC21196a.TextColor1), 7, 33);
            str = spannableStringBuilder;
        } else {
            String string2 = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_multi_msg, Integer.valueOf(list.size()));
            AbstractC19074t.m100205c(string2);
            str = string2;
        }
        C16972e0.a aVar = new C16972e0.a(context);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90931h("ProductManageView-ConfirmDelete");
        aVar.m90949z(str);
        aVar.m90921E(true);
        aVar.m90947x("ProductManageView-ConfirmDelete-Positive");
        String string3 = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_btn_confirm);
        AbstractC19074t.m100207e(string3, "getString(...)");
        aVar.m90943t(string3, new InterfaceC17463d.d() { // from class: ay.j1
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ProductManageView.m48850TM(ProductManageView.this, list, deleteProductSource, interfaceC17463d, i11);
            }
        });
        aVar.m90937n("ProductManageView-ConfirmDelete-Negative");
        String string4 = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_btn_cancel);
        AbstractC19074t.m100207e(string4, "getString(...)");
        aVar.m90934k(string4, new InterfaceC17463d.d() { // from class: ay.k1
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ProductManageView.m48851UM(interfaceC17463d, i11);
            }
        });
        this.f48721e1 = aVar.m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public static final void m48850TM(ProductManageView productManageView, List list, DeleteProductSource deleteProductSource, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(productManageView, "this$0");
        AbstractC19074t.m100208f(list, "$products");
        AbstractC19074t.m100208f(deleteProductSource, "$source");
        productManageView.m48832BM(list, deleteProductSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public static final void m48851UM(InterfaceC17463d interfaceC17463d, int i11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public static final void m48852VM(ProductManageView productManageView) {
        AbstractC19074t.m100208f(productManageView, "this$0");
        C30017r9 c30017r9 = null;
        if (!C23055e5.m118273h(false, 1, null)) {
            C30017r9 c30017r92 = productManageView.f48706P0;
            if (c30017r92 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30017r9 = c30017r92;
            }
            c30017r9.f139224r.setRefreshing(false);
            return;
        }
        productManageView.m48836FM().m96366a0();
    }

    /* renamed from: WM */
    private final void m48853WM() {
        int m131511r;
        List m96351C0 = m48836FM().m96351C0();
        m131511r = AbstractC25370t.m131511r(m96351C0, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m96351C0.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC18129y0.i) it.next()).m96421h());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m48849SM(arrayList, DeleteProductSource.ProductManageMultiSelect.f48760q);
    }

    /* renamed from: XM */
    private final void m48854XM(Product product) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putLong("EXTRA_CATALOG_ID", product.m48480d());
        bundle.putParcelable("EXTRA_DUPLICATED_PRODUCT", product);
        bundle.putParcelable("EXTRA_TRACKING_SOURCE", AddProductSource.ProductManageContextMenuDuplicate.f48750q);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(ProductAddEditView.class, bundle, 2, true);
        }
    }

    /* renamed from: YM */
    private final void m48855YM() {
        C29259b m96380u0 = m48836FM().m96380u0();
        if (m96380u0 == null) {
            return;
        }
        CatalogAddEditModel catalogAddEditModel = new CatalogAddEditModel(m96380u0.m146161p(), m96380u0.m146158m(), m96380u0.m146160o());
        List list = this.f48720d1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C16972e0) it.next()).dismiss();
            }
        }
        this.f48720d1 = AbstractC2421j.m12468k(this, m48834DM(), catalogAddEditModel, EditCatalogSource.ProductManageContextMenuEdit.f48764q);
    }

    /* renamed from: ZM */
    private final void m48856ZM(Product product) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putLong("EXTRA_CATALOG_ID", product.m48480d());
        bundle.putParcelable("EXTRA_EDITED_PRODUCT", product);
        bundle.putParcelable("EXTRA_TRACKING_SOURCE", EditProductSource.ProductManageContextMenuEdit.f48767q);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(ProductAddEditView.class, bundle, 2, true);
        }
    }

    /* renamed from: bN */
    private final void m48857bN(Product product) {
        C18131z0 m48836FM = m48836FM();
        List singletonList = Collections.singletonList(Long.valueOf(product.m48485i()));
        AbstractC19074t.m100207e(singletonList, "singletonList(...)");
        m48836FM.m96430W0(singletonList);
        m48865hN();
    }

    /* renamed from: cN */
    private final void m48858cN() {
        int m131511r;
        if (m48836FM().m96350B0() <= 0) {
            return;
        }
        List m96351C0 = m48836FM().m96351C0();
        m131511r = AbstractC25370t.m131511r(m96351C0, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m96351C0.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((AbstractC18129y0.i) it.next()).m96421h().m48485i()));
        }
        m48836FM().m96430W0(arrayList);
        m48865hN();
    }

    /* renamed from: dN */
    private final void m48859dN() {
        C29259b m96380u0 = m48836FM().m96380u0();
        if (m96380u0 == null) {
            return;
        }
        String m48998f = AbstractC9183a.m48998f(m96380u0);
        if (m48998f.length() == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_WEB_URL", m48998f);
        bundle.putInt("EXTRA_SOURCE_LINK", 421);
        ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
        InterfaceC27218a m92692wK = m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        c15403a.m87171F(m92692wK, m48998f, bundle);
    }

    /* renamed from: eN */
    private final void m48860eN(AbstractC18129y0.i iVar) {
        boolean m96368f0 = m48836FM().m96368f0(iVar);
        m48887sN();
        if (m96368f0) {
            C31099k c31099k = this.f48707Q0;
            if (c31099k == null) {
                AbstractC19074t.m100223u("adapter");
                c31099k = null;
            }
            c31099k.m10008p();
        }
    }

    /* renamed from: fN */
    private final void m48861fN() {
        m48836FM().m96372j0(SendProductSource.ProductManageShareCatalog.f48784q, new C9139k());
    }

    /* renamed from: gN */
    private final void m48863gN() {
        int m131511r;
        List m96351C0 = m48836FM().m96351C0();
        m131511r = AbstractC25370t.m131511r(m96351C0, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m96351C0.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC18129y0.i) it.next()).m96421h());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m48833CM(arrayList, SendProductSource.ProductManageMultiSelect.f48783q);
    }

    /* renamed from: hN */
    private final void m48865hN() {
        m48875mN();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 23);
        bundle.putString("EXTRA_TITLE", m92652XI(AbstractC8020f0.catalog_picker_title_move));
        C29259b m96380u0 = m48836FM().m96380u0();
        if (m96380u0 != null) {
            bundle.putLong("EXTRA_SELECTED_CATALOG_ID", m96380u0.m146158m());
        }
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 0, 2, true);
        }
    }

    /* renamed from: iN */
    private final void m48867iN(AbstractC18129y0.i iVar) {
        m48877nN();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 21);
        bundle.putParcelable("EXTRA_PRODUCT_ITEM", iVar.m96421h());
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 0, 2, true);
        }
    }

    /* renamed from: jN */
    private final void m48869jN(Product product) {
        try {
            String m49001i = AbstractC9183a.m49001i(product);
            if (m49001i.length() == 0) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", m49001i);
            bundle.putInt("EXTRA_SOURCE_LINK", 420);
            ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
            InterfaceC27218a m92692wK = m92692wK();
            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
            c15403a.m87171F(m92692wK, m49001i, bundle);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kN */
    public final void m48871kN(List list, boolean z11, String str) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("multipleLinksToShare", new ArrayList<>(list));
        bundle.putBoolean("bol_share_in_app", true);
        bundle.putString("STR_SOURCE_START_VIEW", str);
        if (z11) {
            if (list.size() == 1) {
                bundle.putString("str_extra_toast_sent_message", m92651WI().getString(AbstractC8020f0.product_catalog_toast_single_product_shared));
            } else {
                bundle.putString("str_extra_toast_sent_message", m92651WI().getString(AbstractC8020f0.product_catalog_toast_multiple_products_shared, Integer.valueOf(list.size())));
            }
        } else {
            bundle.putString("str_extra_toast_sent_message", m92651WI().getString(AbstractC8020f0.product_catalog_toast_catalog_shared));
        }
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.mo89694j2(ShareView.class, bundle, 1, null, 2, true);
        }
    }

    /* renamed from: lN */
    private final void m48873lN() {
        C23744a.Companion.m124119a().m124115b(this, 5300);
    }

    /* renamed from: mN */
    private final void m48875mN() {
        ZaloView m92993D0;
        C17487o0 m92662fJ;
        C17487o0 m92662fJ2 = m92662fJ();
        if (m92662fJ2 != null && (m92993D0 = m92662fJ2.m92993D0(FrameLayoutKeepBtmSheetZaloView.class)) != null && (m92993D0 instanceof FrameLayoutKeepBtmSheetZaloView) && ((FrameLayoutKeepBtmSheetZaloView) m92993D0).m79790fM() == 23 && (m92662fJ = m92662fJ()) != null) {
            m92662fJ.mo92702G1(m92993D0, 0);
        }
    }

    /* renamed from: nN */
    private final void m48877nN() {
        ZaloView m92993D0;
        C17487o0 m92662fJ;
        C17487o0 m92662fJ2 = m92662fJ();
        if (m92662fJ2 != null && (m92993D0 = m92662fJ2.m92993D0(FrameLayoutKeepBtmSheetZaloView.class)) != null && (m92993D0 instanceof FrameLayoutKeepBtmSheetZaloView) && ((FrameLayoutKeepBtmSheetZaloView) m92993D0).m79790fM() == 21 && (m92662fJ = m92662fJ()) != null) {
            m92662fJ.mo92702G1(m92993D0, 0);
        }
    }

    /* renamed from: oN */
    private final void m48879oN() {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            if (this.f48710T0 instanceof AbstractC9130b.a) {
                if (m48836FM().m96350B0() == 1) {
                    actionBar.setSubtitle(actionBar.getResources().getString(AbstractC8020f0.product_catalog_manage_view_multiselect_subtitle_single_item, Integer.valueOf(m48836FM().m96350B0())));
                    return;
                } else {
                    actionBar.setSubtitle(actionBar.getResources().getString(AbstractC8020f0.product_catalog_manage_view_multiselect_subtitle_multiple_items, Integer.valueOf(m48836FM().m96350B0())));
                    return;
                }
            }
            actionBar.setSubtitle(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public final void m48881pN(boolean z11) {
        m48836FM().m96359O0(z11);
        C31099k c31099k = this.f48707Q0;
        C31099k c31099k2 = null;
        if (c31099k == null) {
            AbstractC19074t.m100223u("adapter");
            c31099k = null;
        }
        if (c31099k.mo10003k() > 0) {
            C31099k c31099k3 = this.f48707Q0;
            if (c31099k3 == null) {
                AbstractC19074t.m100223u("adapter");
                c31099k3 = null;
            }
            C31099k c31099k4 = this.f48707Q0;
            if (c31099k4 == null) {
                AbstractC19074t.m100223u("adapter");
            } else {
                c31099k2 = c31099k4;
            }
            c31099k3.m10014v(0, c31099k2.mo10003k(), this);
        }
        m48889tN();
    }

    /* renamed from: qN */
    private final void m48883qN(boolean z11) {
        int i11;
        if (z11) {
            m48837GM();
        } else if (this.f48711U0 == null) {
            return;
        }
        MultiSelectBottomView multiSelectBottomView = this.f48711U0;
        if (multiSelectBottomView == null) {
            return;
        }
        Slide slide = new Slide(80);
        slide.setDuration(250L);
        slide.addTarget(multiSelectBottomView);
        C30017r9 c30017r9 = this.f48706P0;
        if (c30017r9 == null) {
            AbstractC19074t.m100223u("binding");
            c30017r9 = null;
        }
        TransitionManager.beginDelayedTransition(c30017r9.getRoot(), slide);
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        multiSelectBottomView.setVisibility(i11);
    }

    /* renamed from: rN */
    private final void m48885rN() {
        C23744a.Companion.m124119a().m124117e(this, 5300);
    }

    /* renamed from: sN */
    private final void m48887sN() {
        boolean z11;
        boolean z12;
        boolean z13;
        int m96350B0 = m48836FM().m96350B0();
        if (m96350B0 > 0 && m96350B0 <= m48836FM().m96384y0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m96350B0 > 0 && m96350B0 <= m48836FM().mo96383x0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m96350B0 > 0 && m96350B0 <= m48836FM().mo96383x0()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z11) {
            View view = this.f48712V0;
            if (view != null) {
                view.setEnabled(true);
            }
            View view2 = this.f48712V0;
            if (view2 != null) {
                view2.setAlpha(1.0f);
            }
        } else {
            View view3 = this.f48712V0;
            if (view3 != null) {
                view3.setEnabled(false);
            }
            View view4 = this.f48712V0;
            if (view4 != null) {
                view4.setAlpha(0.3f);
            }
        }
        if (z12) {
            View view5 = this.f48713W0;
            if (view5 != null) {
                view5.setEnabled(true);
            }
            View view6 = this.f48713W0;
            if (view6 != null) {
                view6.setAlpha(1.0f);
            }
        } else {
            View view7 = this.f48713W0;
            if (view7 != null) {
                view7.setEnabled(false);
            }
            View view8 = this.f48713W0;
            if (view8 != null) {
                view8.setAlpha(0.3f);
            }
        }
        if (z13) {
            View view9 = this.f48714X0;
            if (view9 != null) {
                view9.setEnabled(true);
            }
            View view10 = this.f48714X0;
            if (view10 != null) {
                view10.setAlpha(1.0f);
            }
        } else {
            View view11 = this.f48714X0;
            if (view11 != null) {
                view11.setEnabled(false);
            }
            View view12 = this.f48714X0;
            if (view12 != null) {
                view12.setAlpha(0.3f);
            }
        }
        m48879oN();
    }

    /* renamed from: tN */
    private final void m48889tN() {
        boolean m96354G0 = m48836FM().m96354G0();
        if (m96354G0 && !(this.f48710T0 instanceof AbstractC9130b.a)) {
            m48844NM(AbstractC9130b.a.f48723a);
        } else if (!m96354G0 && !(this.f48710T0 instanceof AbstractC9130b.b)) {
            m48844NM(AbstractC9130b.b.f48724a);
        }
        m48887sN();
    }

    /* renamed from: xM */
    private final boolean m48893xM() {
        ZaloView zaloView;
        C17487o0 m92662fJ = m92662fJ();
        CatalogPickerBottomSheetView catalogPickerBottomSheetView = null;
        if (m92662fJ != null) {
            zaloView = m92662fJ.m92996E0("CatalogPickerBottomSheet");
        } else {
            zaloView = null;
        }
        if (zaloView instanceof CatalogPickerBottomSheetView) {
            catalogPickerBottomSheetView = (CatalogPickerBottomSheetView) zaloView;
        }
        if (catalogPickerBottomSheetView != null && catalogPickerBottomSheetView.m48621uM()) {
            catalogPickerBottomSheetView.close();
            return true;
        }
        return false;
    }

    /* renamed from: yM */
    private final boolean m48894yM() {
        ZaloView zaloView;
        C17487o0 m92662fJ = m92662fJ();
        ProductContextMenuBottomSheet productContextMenuBottomSheet = null;
        if (m92662fJ != null) {
            zaloView = m92662fJ.m92996E0("ProductCatalogContextMenu");
        } else {
            zaloView = null;
        }
        if (zaloView instanceof ProductContextMenuBottomSheet) {
            productContextMenuBottomSheet = (ProductContextMenuBottomSheet) zaloView;
        }
        if (productContextMenuBottomSheet != null && productContextMenuBottomSheet.m48827CM()) {
            productContextMenuBottomSheet.close();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public static final void m48895zM(ProductManageView productManageView, AbstractC29263f abstractC29263f) {
        long j11;
        AbstractC19074t.m100208f(productManageView, "this$0");
        AbstractC19074t.m100208f(abstractC29263f, "$localEvent");
        C29259b m96380u0 = productManageView.m48836FM().m96380u0();
        if (m96380u0 != null) {
            j11 = m96380u0.m146158m();
        } else {
            j11 = 0;
        }
        if (((AbstractC29263f.b) abstractC29263f).m146186c().m146158m() == j11) {
            productManageView.mo37493TJ();
            productManageView.invalidateOptionsMenu();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        long j11;
        super.mo37111CJ(bundle);
        m92637BK(true);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            j11 = m92642L3.getLong("EXTRA_CATALOG_ID");
        } else {
            j11 = 0;
        }
        this.f48709S0 = j11;
        if (j11 <= 0) {
            finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        try {
            actionBarMenu.m92750r();
            Context context = actionBarMenu.getContext();
            if (this.f48710T0 instanceof AbstractC9130b.b) {
                ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.menu_more, AbstractC23322a.zds_ic_more_horizontal_line_24);
                m92738e.getIconView().setColorFilter(-1);
                AbstractC19074t.m100205c(context);
                m92738e.m92774j(AbstractC23136l9.m118733o(context, AbstractC6918a0.menu_preview, m92652XI(AbstractC8020f0.product_catalog_manage_view_preview_catalog_menu), C27280g.m139660c(context, AbstractC23322a.zds_ic_unhide_line_24, AbstractC2807a.icon_02)));
                m92738e.m92774j(AbstractC23136l9.m118733o(context, AbstractC6918a0.menu_edit, m92652XI(AbstractC8020f0.product_catalog_manage_view_edit_catalog_menu), C27280g.m139660c(context, AbstractC23322a.zds_ic_edit_line_24, AbstractC2807a.icon_02)));
                m92738e.m92774j(AbstractC23136l9.m118733o(context, AbstractC6918a0.menu_share, m92652XI(AbstractC8020f0.product_catalog_manage_view_share_catalog_menu), C27280g.m139660c(context, AbstractC23322a.zds_ic_share_line_24, AbstractC2807a.icon_02)));
                if (m48836FM().m96374l0()) {
                    m92738e.m92774j(AbstractC23136l9.m118733o(context, AbstractC6918a0.menu_multi_select, m92652XI(AbstractC8020f0.product_catalog_manage_view_multiselect_menu), C27280g.m139660c(context, AbstractC23322a.zds_ic_check_circle_line_24, AbstractC2807a.icon_02)));
                }
                TextView m118733o = AbstractC23136l9.m118733o(context, AbstractC6918a0.menu_delete, m92652XI(AbstractC8020f0.product_catalog_manage_view_delete_catalog_menu), C27280g.m139660c(context, AbstractC23322a.zds_ic_delete_line_24, AbstractC2807a.danger));
                m118733o.setTextColor(C23212s8.m119607o(context, AbstractC2807a.danger));
                AbstractC19074t.m100207e(m118733o, "apply(...)");
                m92738e.m92774j(m118733o);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30017r9 m148450c = C30017r9.m148450c(LayoutInflater.from(getContext()), viewGroup, false);
        AbstractC19074t.m100207e(m148450c, "inflate(...)");
        this.f48706P0 = m148450c;
        C31099k c31099k = new C31099k(true, this);
        this.f48707Q0 = c31099k;
        c31099k.m9999J(true);
        C30017r9 c30017r9 = this.f48706P0;
        C30017r9 c30017r92 = null;
        if (c30017r9 == null) {
            AbstractC19074t.m100223u("binding");
            c30017r9 = null;
        }
        RecyclerView recyclerView = c30017r9.f139223q;
        C31099k c31099k2 = this.f48707Q0;
        if (c31099k2 == null) {
            AbstractC19074t.m100223u("adapter");
            c31099k2 = null;
        }
        recyclerView.setAdapter(c31099k2);
        this.f48708R0 = new LinearLayoutManager(getContext(), 1, false);
        C30017r9 c30017r93 = this.f48706P0;
        if (c30017r93 == null) {
            AbstractC19074t.m100223u("binding");
            c30017r93 = null;
        }
        RecyclerView recyclerView2 = c30017r93.f139223q;
        LinearLayoutManager linearLayoutManager = this.f48708R0;
        if (linearLayoutManager == null) {
            AbstractC19074t.m100223u("layoutManager");
            linearLayoutManager = null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        C30017r9 c30017r94 = this.f48706P0;
        if (c30017r94 == null) {
            AbstractC19074t.m100223u("binding");
            c30017r94 = null;
        }
        c30017r94.f139223q.m9816A(new C9137i());
        C30017r9 c30017r95 = this.f48706P0;
        if (c30017r95 == null) {
            AbstractC19074t.m100223u("binding");
            c30017r95 = null;
        }
        c30017r95.f139223q.m9826E(new C9138j());
        C30017r9 c30017r96 = this.f48706P0;
        if (c30017r96 == null) {
            AbstractC19074t.m100223u("binding");
            c30017r96 = null;
        }
        c30017r96.f139224r.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: ay.o1
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                ProductManageView.m48852VM(ProductManageView.this);
            }
        });
        C30017r9 c30017r97 = this.f48706P0;
        if (c30017r97 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30017r92 = c30017r97;
        }
        RelativeLayout root = c30017r92.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        m48875mN();
        m48836FM().m96385z0().mo9222o(this.f48717a1);
        m48836FM().m96382w0().mo9222o(this.f48718b1);
        AbstractC2421j.m12467j(this, m48834DM());
        List list = this.f48720d1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C16972e0) it.next()).dismiss();
            }
        }
        C16972e0 c16972e0 = this.f48721e1;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
        C16972e0 c16972e02 = this.f48722f1;
        if (c16972e02 != null) {
            c16972e02.dismiss();
        }
        m48885rN();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            if (this.f48710T0 instanceof AbstractC9130b.a) {
                m48845OM();
            } else {
                finish();
            }
        } else if (i11 == AbstractC6918a0.menu_preview) {
            m48859dN();
        } else if (i11 == AbstractC6918a0.menu_edit) {
            m48855YM();
        } else if (i11 == AbstractC6918a0.menu_share) {
            m48861fN();
        } else if (i11 == AbstractC6918a0.menu_multi_select) {
            m48881pN(true);
        } else if (i11 == AbstractC6918a0.menu_delete) {
            m48846PM();
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        String str;
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            if (this.f48710T0 instanceof AbstractC9130b.a) {
                actionBar.setTitle(m92652XI(AbstractC8020f0.product_catalog_manage_view_multiselect_title));
                actionBar.setTitleColor(C23212s8.m119607o(actionBar.getContext(), AbstractC21196a.TextColor1));
                actionBar.setSubTitleColor(C23212s8.m119607o(actionBar.getContext(), AbstractC21196a.TextColor2));
                actionBar.setBackgroundResource(AbstractC16803z.bg_postfeed_actionbar);
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
                m48879oN();
                return;
            }
            C29259b m96380u0 = m48836FM().m96380u0();
            if (m96380u0 == null || (str = m96380u0.m146160o()) == null) {
                Bundle m92642L3 = m92642L3();
                if (m92642L3 != null) {
                    str = m92642L3.getString("EXTRA_CATALOG_NAME");
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            }
            if (str.length() == 0) {
                str = m92652XI(AbstractC8020f0.product_catalog_manage_view_title);
                AbstractC19074t.m100207e(str, "getString(...)");
            }
            actionBar.setTitle(str);
            actionBar.setSubtitle(null);
            actionBar.setTitleColor(C23212s8.m119607o(actionBar.getContext(), AbstractC16781w.TextColor6));
            actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m48836FM().m96385z0().m9219j(this, this.f48717a1);
        m48836FM().m96382w0().m9219j(this, this.f48718b1);
        m48836FM().m96353E0(this.f48709S0);
        m48873lN();
        m48877nN();
    }

    /* renamed from: aN */
    public final void m48896aN(ProductContextMenuBottomSheet.AbstractC9127b abstractC9127b) {
        List m131496e;
        List m131496e2;
        AbstractC19074t.m100208f(abstractC9127b, "menuItem");
        Product m48829a = abstractC9127b.m48829a();
        if (abstractC9127b instanceof ProductContextMenuBottomSheet.AbstractC9127b.g) {
            m48869jN(m48829a);
            return;
        }
        if (abstractC9127b instanceof ProductContextMenuBottomSheet.AbstractC9127b.d) {
            m48856ZM(m48829a);
            return;
        }
        if (abstractC9127b instanceof ProductContextMenuBottomSheet.AbstractC9127b.c) {
            m48854XM(m48829a);
            return;
        }
        if (abstractC9127b instanceof ProductContextMenuBottomSheet.AbstractC9127b.f) {
            m131496e2 = AbstractC25366r.m131496e(m48829a);
            m48833CM(m131496e2, SendProductSource.ProductManageContextMenuShare.f48782q);
            return;
        }
        if (abstractC9127b instanceof ProductContextMenuBottomSheet.AbstractC9127b.a) {
            Context context = getContext();
            AbstractC19074t.m100205c(context);
            AbstractC9183a.m48996d(context, m48829a, false, 4, null);
        } else if (abstractC9127b instanceof ProductContextMenuBottomSheet.AbstractC9127b.e) {
            m48857bN(m48829a);
        } else if (abstractC9127b instanceof ProductContextMenuBottomSheet.AbstractC9127b.b) {
            m131496e = AbstractC25366r.m131496e(m48829a);
            m48849SM(m131496e, DeleteProductSource.ProductManageContextMenuDelete.f48759q);
        }
    }

    @Override // p661xx.InterfaceC30219e
    /* renamed from: et */
    public void mo48737et(long j11, C29259b c29259b) {
        MoveProductSource moveProductSource;
        AbstractC19074t.m100208f(c29259b, "catalog");
        List m96429V0 = m48836FM().m96429V0();
        if (m96429V0.isEmpty()) {
            return;
        }
        List list = m96429V0;
        C29259b m96380u0 = m48836FM().m96380u0();
        if (m96380u0 != null && m96380u0.m146158m() == j11) {
            return;
        }
        if (AbstractC19074t.m100204b(this.f48710T0, AbstractC9130b.a.f48723a)) {
            moveProductSource = MoveProductSource.ProductManageMultiSelect.f48772q;
        } else {
            moveProductSource = MoveProductSource.ProductManageContextMenu.f48771q;
        }
        m48836FM().m96365Z(j11, list, moveProductSource, new C9136h(c29259b, list));
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ProductManageView";
    }

    @Override // p661xx.InterfaceC30221g
    /* renamed from: ne */
    public void mo48798ne(AbstractC30220f abstractC30220f) {
        AbstractC19074t.m100208f(abstractC30220f, "action");
        if (abstractC30220f instanceof AbstractC30220f.c) {
            m48869jN(((AbstractC30220f.c) abstractC30220f).m149002a().m96421h());
            return;
        }
        if (abstractC30220f instanceof AbstractC30220f.d) {
            AbstractC30220f.d dVar = (AbstractC30220f.d) abstractC30220f;
            if (!dVar.m149003a().m96422i()) {
                if (!(this.f48710T0 instanceof AbstractC9130b.a) || m48836FM().m96350B0() == 0) {
                    m48881pN(true);
                    mo48798ne(new AbstractC30220f.e(dVar.m149003a()));
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC30220f instanceof AbstractC30220f.g) {
            m48867iN(((AbstractC30220f.g) abstractC30220f).m149005a());
            return;
        }
        if (abstractC30220f instanceof AbstractC30220f.a) {
            m48843MM(AddProductSource.ProductManageBtnPlus.f48749q);
            return;
        }
        if (abstractC30220f instanceof AbstractC30220f.b) {
            m48843MM(AddProductSource.ProductManageEmptyView.f48751q);
            return;
        }
        if (abstractC30220f instanceof AbstractC30220f.f) {
            m48836FM().m96366a0();
            return;
        }
        if (abstractC30220f instanceof AbstractC30220f.e) {
            AbstractC30220f.e eVar = (AbstractC30220f.e) abstractC30220f;
            if (eVar.m149004a().m96422i()) {
                eVar.m149004a().m96423j(false);
                m48860eN(eVar.m149004a());
            } else if (m48836FM().m96379t0()) {
                eVar.m149004a().m96423j(true);
                m48860eN(eVar.m149004a());
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1) {
            if (i12 == -1) {
                m48881pN(false);
                return;
            }
            return;
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (m48893xM()) {
                return true;
            }
            if (this.f48710T0 instanceof AbstractC9130b.a) {
                m48845OM();
            } else if (m92649TI().m92996E0("ProductCatalogContextMenu") != null) {
                if (!m48894yM()) {
                    finish();
                }
            } else {
                finish();
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        final AbstractC29263f abstractC29263f;
        long j11;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 5300) {
            Object obj = objArr[0];
            if (obj instanceof AbstractC29263f) {
                abstractC29263f = (AbstractC29263f) obj;
            } else {
                abstractC29263f = null;
            }
            if (abstractC29263f == null) {
                return;
            }
            if (abstractC29263f instanceof AbstractC29263f.g) {
                if (!((AbstractC29263f.g) abstractC29263f).m146189c()) {
                    finish();
                }
            } else if (abstractC29263f instanceof AbstractC29263f.b) {
                AbstractC19444a.m101697e(new Runnable() { // from class: ay.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProductManageView.m48895zM(ProductManageView.this, abstractC29263f);
                    }
                });
            } else if (abstractC29263f instanceof AbstractC29263f.e) {
                C29259b m96380u0 = m48836FM().m96380u0();
                if (m96380u0 != null) {
                    j11 = m96380u0.m146158m();
                } else {
                    j11 = 0;
                }
                if (((AbstractC29263f.e) abstractC29263f).m146188c().contains(Long.valueOf(j11))) {
                    finish();
                    if (abstractC29263f.m146183a()) {
                        ToastUtils.showMess(m92652XI(AbstractC8020f0.product_catalog_toast_catalog_deleted_sync));
                    } else {
                        ToastUtils.showMess(m92652XI(AbstractC8020f0.product_catalog_toast_catalog_deleted));
                    }
                }
            }
            m48836FM().m96352D0(abstractC29263f);
            m48834DM().m96146Y(abstractC29263f);
            return;
        }
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
    }
}
