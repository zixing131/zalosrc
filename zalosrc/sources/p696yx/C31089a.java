package p696yx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.productcatalog.p068ui.widget.BaseCatalogItemView;
import com.zing.zalo.productcatalog.p068ui.widget.BottomSheetCatalogItemView;
import com.zing.zalo.productcatalog.p068ui.widget.CatalogManageAddCatalogItemView;
import com.zing.zalo.productcatalog.p068ui.widget.CatalogManageAddProductItemView;
import com.zing.zalo.productcatalog.p068ui.widget.ManageCatalogItemView;
import com.zing.zalo.productcatalog.p068ui.widget.ProductCatalogSkeletonView;
import com.zing.zalo.zdesign.component.Button;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p115dy.AbstractC18088e;
import p661xx.AbstractC30215a;
import p661xx.InterfaceC30216b;
import p696yx.C31089a;
import qm0.AbstractC25332a0;

/* renamed from: yx.a */
/* loaded from: classes4.dex */
public final class C31089a extends RecyclerView.AbstractC1880g {
    public static final e Companion = new e(null);

    /* renamed from: r */
    private final boolean f143293r;

    /* renamed from: s */
    private final InterfaceC30216b f143294s;

    /* renamed from: t */
    private final ArrayList f143295t;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.a$a */
    /* loaded from: classes4.dex */
    public static class a extends c {

        /* renamed from: J */
        private final CatalogManageAddCatalogItemView f143296J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30216b interfaceC30216b, CatalogManageAddCatalogItemView catalogManageAddCatalogItemView) {
            super(interfaceC30216b, catalogManageAddCatalogItemView);
            AbstractC19074t.m100208f(interfaceC30216b, "actionHandler");
            AbstractC19074t.m100208f(catalogManageAddCatalogItemView, "addCatalogItemView");
            this.f143296J = catalogManageAddCatalogItemView;
        }

        @Override // p696yx.C31089a.c
        /* renamed from: i0 */
        public void mo151077i0(AbstractC18088e abstractC18088e) {
            AbstractC19074t.m100208f(abstractC18088e, "item");
            if (abstractC18088e instanceof AbstractC18088e.a) {
                this.f143296J.setActionHandler(m151078j0());
                this.f143296J.m48533p((AbstractC18088e.a) abstractC18088e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.a$b */
    /* loaded from: classes4.dex */
    public static class b extends c {

        /* renamed from: J */
        private final CatalogManageAddProductItemView f143297J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30216b interfaceC30216b, CatalogManageAddProductItemView catalogManageAddProductItemView) {
            super(interfaceC30216b, catalogManageAddProductItemView);
            AbstractC19074t.m100208f(interfaceC30216b, "actionHandler");
            AbstractC19074t.m100208f(catalogManageAddProductItemView, "addProductItemView");
            this.f143297J = catalogManageAddProductItemView;
        }

        @Override // p696yx.C31089a.c
        /* renamed from: i0 */
        public void mo151077i0(AbstractC18088e abstractC18088e) {
            AbstractC19074t.m100208f(abstractC18088e, "item");
            if (abstractC18088e instanceof AbstractC18088e.b) {
                this.f143297J.setActionHandler(m151078j0());
                this.f143297J.m48536p((AbstractC18088e.b) abstractC18088e);
            }
        }
    }

    /* renamed from: yx.a$c */
    /* loaded from: classes4.dex */
    public static class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final InterfaceC30216b f143298I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30216b interfaceC30216b, View view) {
            super(view);
            AbstractC19074t.m100208f(interfaceC30216b, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            this.f143298I = interfaceC30216b;
        }

        /* renamed from: i0 */
        public void mo151077i0(AbstractC18088e abstractC18088e) {
            AbstractC19074t.m100208f(abstractC18088e, "item");
        }

        /* renamed from: j0 */
        public final InterfaceC30216b m151078j0() {
            return this.f143298I;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends c {

        /* renamed from: J */
        private final BaseCatalogItemView f143299J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30216b interfaceC30216b, BaseCatalogItemView baseCatalogItemView) {
            super(interfaceC30216b, baseCatalogItemView);
            AbstractC19074t.m100208f(interfaceC30216b, "actionHandler");
            AbstractC19074t.m100208f(baseCatalogItemView, "catalogItemView");
            this.f143299J = baseCatalogItemView;
            baseCatalogItemView.setActionHandler(interfaceC30216b);
        }

        @Override // p696yx.C31089a.c
        /* renamed from: i0 */
        public void mo151077i0(AbstractC18088e abstractC18088e) {
            AbstractC19074t.m100208f(abstractC18088e, "item");
            if (abstractC18088e instanceof AbstractC18088e.c) {
                this.f143299J.m48519p((AbstractC18088e.c) abstractC18088e);
            }
        }
    }

    /* renamed from: yx.a$e */
    /* loaded from: classes4.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.a$f */
    /* loaded from: classes4.dex */
    public static class f extends c {

        /* renamed from: J */
        private final View f143300J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(final InterfaceC30216b interfaceC30216b, View view) {
            super(interfaceC30216b, view);
            AbstractC19074t.m100208f(interfaceC30216b, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            View findViewById = view.findViewById(AbstractC6918a0.btn_create_empty);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            this.f143300J = findViewById;
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: yx.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31089a.f.m151080l0(InterfaceC30216b.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m151080l0(InterfaceC30216b interfaceC30216b, View view) {
            AbstractC19074t.m100208f(interfaceC30216b, "$actionHandler");
            interfaceC30216b.mo48669vf(AbstractC30215a.b.f140357a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.a$g */
    /* loaded from: classes4.dex */
    public static class g extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(final InterfaceC30216b interfaceC30216b, View view) {
            super(interfaceC30216b, view);
            AbstractC19074t.m100208f(interfaceC30216b, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            view.setOnClickListener(new View.OnClickListener() { // from class: yx.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31089a.g.m151082l0(InterfaceC30216b.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m151082l0(InterfaceC30216b interfaceC30216b, View view) {
            AbstractC19074t.m100208f(interfaceC30216b, "$actionHandler");
            interfaceC30216b.mo48669vf(AbstractC30215a.f.f140361a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.a$h */
    /* loaded from: classes4.dex */
    public static class h extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(final InterfaceC30216b interfaceC30216b, View view) {
            super(interfaceC30216b, view);
            AbstractC19074t.m100208f(interfaceC30216b, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            view.setOnClickListener(new View.OnClickListener() { // from class: yx.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31089a.h.m151084l0(InterfaceC30216b.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m151084l0(InterfaceC30216b interfaceC30216b, View view) {
            AbstractC19074t.m100208f(interfaceC30216b, "$actionHandler");
            interfaceC30216b.mo48669vf(AbstractC30215a.f.f140361a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.a$i */
    /* loaded from: classes4.dex */
    public static class i extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(final InterfaceC30216b interfaceC30216b, View view) {
            super(interfaceC30216b, view);
            AbstractC19074t.m100208f(interfaceC30216b, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            Button button = (Button) view.findViewById(AbstractC6918a0.product_catalog_btn_retry);
            if (button != null) {
                button.setIdTracking("catalog_list_btn_retry_network");
                button.setOnClickListener(new View.OnClickListener() { // from class: yx.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C31089a.i.m151086l0(InterfaceC30216b.this, view2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m151086l0(InterfaceC30216b interfaceC30216b, View view) {
            AbstractC19074t.m100208f(interfaceC30216b, "$actionHandler");
            interfaceC30216b.mo48669vf(AbstractC30215a.f.f140361a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.a$j */
    /* loaded from: classes4.dex */
    public static class j extends c {

        /* renamed from: J */
        private final ProductCatalogSkeletonView f143301J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC30216b interfaceC30216b, ProductCatalogSkeletonView productCatalogSkeletonView) {
            super(interfaceC30216b, productCatalogSkeletonView);
            AbstractC19074t.m100208f(interfaceC30216b, "actionHandler");
            AbstractC19074t.m100208f(productCatalogSkeletonView, "skeletonView");
            this.f143301J = productCatalogSkeletonView;
            productCatalogSkeletonView.setSkeletonLayoutType(6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.a$k */
    /* loaded from: classes4.dex */
    public static class k extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC30216b interfaceC30216b, View view) {
            super(interfaceC30216b, view);
            AbstractC19074t.m100208f(interfaceC30216b, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.a$l */
    /* loaded from: classes4.dex */
    public static class l extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(final InterfaceC30216b interfaceC30216b, View view) {
            super(interfaceC30216b, view);
            AbstractC19074t.m100208f(interfaceC30216b, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            view.setOnClickListener(new View.OnClickListener() { // from class: yx.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31089a.l.m151088l0(InterfaceC30216b.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m151088l0(InterfaceC30216b interfaceC30216b, View view) {
            AbstractC19074t.m100208f(interfaceC30216b, "$actionHandler");
            interfaceC30216b.mo48669vf(AbstractC30215a.e.f140360a);
        }
    }

    public C31089a(boolean z11, InterfaceC30216b interfaceC30216b) {
        AbstractC19074t.m100208f(interfaceC30216b, "actionHandler");
        this.f143293r = z11;
        this.f143294s = interfaceC30216b;
        this.f143295t = new ArrayList();
    }

    /* renamed from: L */
    public final AbstractC18088e m151073L(int i11) {
        Object m131207g0;
        m131207g0 = AbstractC25332a0.m131207g0(this.f143295t, i11);
        return (AbstractC18088e) m131207g0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(c cVar, int i11) {
        AbstractC19074t.m100208f(cVar, "holder");
        Object obj = this.f143295t.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        cVar.mo151077i0((AbstractC18088e) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public c mo9992C(ViewGroup viewGroup, int i11) {
        BaseCatalogItemView bottomSheetCatalogItemView;
        c dVar;
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        switch (i11) {
            case 1:
                if (this.f143293r) {
                    AbstractC19074t.m100205c(context);
                    bottomSheetCatalogItemView = new ManageCatalogItemView(context);
                } else {
                    AbstractC19074t.m100205c(context);
                    bottomSheetCatalogItemView = new BottomSheetCatalogItemView(context);
                }
                bottomSheetCatalogItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                dVar = new d(this.f143294s, bottomSheetCatalogItemView);
                break;
            case 2:
                ProductCatalogSkeletonView productCatalogSkeletonView = new ProductCatalogSkeletonView(context);
                productCatalogSkeletonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                dVar = new j(this.f143294s, productCatalogSkeletonView);
                break;
            case 3:
                View inflate = from.inflate(AbstractC7409c0.prodcat_catalog_list_loading_footer, viewGroup, false);
                InterfaceC30216b interfaceC30216b = this.f143294s;
                AbstractC19074t.m100205c(inflate);
                dVar = new k(interfaceC30216b, inflate);
                break;
            case 4:
                View inflate2 = from.inflate(AbstractC7409c0.prodcat_catalog_list_load_error_footer, viewGroup, false);
                InterfaceC30216b interfaceC30216b2 = this.f143294s;
                AbstractC19074t.m100205c(inflate2);
                dVar = new g(interfaceC30216b2, inflate2);
                break;
            case 5:
                View inflate3 = from.inflate(AbstractC7409c0.prodcat_catalog_list_load_error_full, viewGroup, false);
                InterfaceC30216b interfaceC30216b3 = this.f143294s;
                AbstractC19074t.m100205c(inflate3);
                dVar = new h(interfaceC30216b3, inflate3);
                break;
            case 6:
                View inflate4 = from.inflate(AbstractC7409c0.prodcat_catalog_list_load_error_network, viewGroup, false);
                InterfaceC30216b interfaceC30216b4 = this.f143294s;
                AbstractC19074t.m100205c(inflate4);
                dVar = new i(interfaceC30216b4, inflate4);
                break;
            case 7:
                View inflate5 = from.inflate(AbstractC7409c0.prodcat_catalog_list_empty_layout, viewGroup, false);
                InterfaceC30216b interfaceC30216b5 = this.f143294s;
                AbstractC19074t.m100205c(inflate5);
                dVar = new f(interfaceC30216b5, inflate5);
                break;
            case 8:
                AbstractC19074t.m100205c(context);
                CatalogManageAddCatalogItemView catalogManageAddCatalogItemView = new CatalogManageAddCatalogItemView(context);
                catalogManageAddCatalogItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                dVar = new a(this.f143294s, catalogManageAddCatalogItemView);
                break;
            case 9:
                AbstractC19074t.m100205c(context);
                CatalogManageAddProductItemView catalogManageAddProductItemView = new CatalogManageAddProductItemView(context);
                catalogManageAddProductItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                dVar = new b(this.f143294s, catalogManageAddProductItemView);
                break;
            case 10:
                View inflate6 = from.inflate(AbstractC7409c0.prodcat_catalog_list_manage_catalogs_item, viewGroup, false);
                InterfaceC30216b interfaceC30216b6 = this.f143294s;
                AbstractC19074t.m100205c(inflate6);
                dVar = new l(interfaceC30216b6, inflate6);
                break;
            default:
                return new c(this.f143294s, new View(context));
        }
        return dVar;
    }

    /* renamed from: O */
    public final void m151076O(List list) {
        AbstractC19074t.m100208f(list, "itemList");
        this.f143295t.clear();
        this.f143295t.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143295t.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return ((AbstractC18088e) this.f143295t.get(i11)).mo96245b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        AbstractC18088e abstractC18088e = (AbstractC18088e) this.f143295t.get(i11);
        if (abstractC18088e instanceof AbstractC18088e.c) {
            return 1;
        }
        if (abstractC18088e instanceof AbstractC18088e.i) {
            return 2;
        }
        if (abstractC18088e instanceof AbstractC18088e.j) {
            return 3;
        }
        if (abstractC18088e instanceof AbstractC18088e.f) {
            return 4;
        }
        if (abstractC18088e instanceof AbstractC18088e.g) {
            return 5;
        }
        if (abstractC18088e instanceof AbstractC18088e.h) {
            return 6;
        }
        if (abstractC18088e instanceof AbstractC18088e.e) {
            return 7;
        }
        if (abstractC18088e instanceof AbstractC18088e.a) {
            return 8;
        }
        if (abstractC18088e instanceof AbstractC18088e.b) {
            return 9;
        }
        if (abstractC18088e instanceof AbstractC18088e.k) {
            return 10;
        }
        throw new NoWhenBranchMatchedException();
    }
}
