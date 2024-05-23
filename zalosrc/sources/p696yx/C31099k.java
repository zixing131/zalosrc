package p696yx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.productcatalog.p068ui.widget.BaseProductItemView;
import com.zing.zalo.productcatalog.p068ui.widget.BottomSheetProductItemView;
import com.zing.zalo.productcatalog.p068ui.widget.ManageProductItemView;
import com.zing.zalo.productcatalog.p068ui.widget.ProductCatalogSkeletonView;
import com.zing.zalo.productcatalog.p068ui.widget.ProductManageAddProductItemView;
import com.zing.zalo.productcatalog.p068ui.widget.SelectWholeCatalogItemView;
import com.zing.zalo.zdesign.component.Button;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p115dy.AbstractC18129y0;
import p661xx.AbstractC30220f;
import p661xx.InterfaceC30221g;
import p696yx.C31099k;
import qm0.AbstractC25332a0;

/* renamed from: yx.k */
/* loaded from: classes4.dex */
public final class C31099k extends RecyclerView.AbstractC1880g {
    public static final b Companion = new b(null);

    /* renamed from: r */
    private final boolean f143315r;

    /* renamed from: s */
    private final InterfaceC30221g f143316s;

    /* renamed from: t */
    private final ArrayList f143317t;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.k$a */
    /* loaded from: classes4.dex */
    public static class a extends j {

        /* renamed from: J */
        private final ProductManageAddProductItemView f143318J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30221g interfaceC30221g, ProductManageAddProductItemView productManageAddProductItemView) {
            super(interfaceC30221g, productManageAddProductItemView);
            AbstractC19074t.m100208f(interfaceC30221g, "actionHandler");
            AbstractC19074t.m100208f(productManageAddProductItemView, "addProductItemView");
            this.f143318J = productManageAddProductItemView;
        }

        @Override // p696yx.C31099k.j
        /* renamed from: i0 */
        public void mo151104i0(AbstractC18129y0 abstractC18129y0) {
            AbstractC19074t.m100208f(abstractC18129y0, "item");
            if (abstractC18129y0 instanceof AbstractC18129y0.a) {
                this.f143318J.setActionHandler(m151113j0());
                this.f143318J.m48554p((AbstractC18129y0.a) abstractC18129y0);
            }
        }
    }

    /* renamed from: yx.k$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.k$c */
    /* loaded from: classes4.dex */
    public static class c extends j {

        /* renamed from: J */
        private final Button f143319J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(final InterfaceC30221g interfaceC30221g, View view) {
            super(interfaceC30221g, view);
            AbstractC19074t.m100208f(interfaceC30221g, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            View findViewById = view.findViewById(AbstractC6918a0.btn_create_empty);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            Button button = (Button) findViewById;
            this.f143319J = button;
            button.setText(button.getResources().getString(AbstractC8020f0.product_catalog_empty_add_product_btn));
            button.setIdTracking("ProductCatalog-BtnAddEmpty");
            button.setOnClickListener(new View.OnClickListener() { // from class: yx.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31099k.c.m151106l0(InterfaceC30221g.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m151106l0(InterfaceC30221g interfaceC30221g, View view) {
            AbstractC19074t.m100208f(interfaceC30221g, "$actionHandler");
            interfaceC30221g.mo48798ne(AbstractC30220f.b.f140365a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.k$d */
    /* loaded from: classes4.dex */
    public static class d extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(final InterfaceC30221g interfaceC30221g, View view) {
            super(interfaceC30221g, view);
            AbstractC19074t.m100208f(interfaceC30221g, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            view.setOnClickListener(new View.OnClickListener() { // from class: yx.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31099k.d.m151108l0(InterfaceC30221g.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m151108l0(InterfaceC30221g interfaceC30221g, View view) {
            AbstractC19074t.m100208f(interfaceC30221g, "$actionHandler");
            interfaceC30221g.mo48798ne(AbstractC30220f.f.f140369a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.k$e */
    /* loaded from: classes4.dex */
    public static class e extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(final InterfaceC30221g interfaceC30221g, View view) {
            super(interfaceC30221g, view);
            AbstractC19074t.m100208f(interfaceC30221g, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            view.setOnClickListener(new View.OnClickListener() { // from class: yx.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31099k.e.m151110l0(InterfaceC30221g.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m151110l0(InterfaceC30221g interfaceC30221g, View view) {
            AbstractC19074t.m100208f(interfaceC30221g, "$actionHandler");
            interfaceC30221g.mo48798ne(AbstractC30220f.f.f140369a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.k$f */
    /* loaded from: classes4.dex */
    public static class f extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(final InterfaceC30221g interfaceC30221g, View view) {
            super(interfaceC30221g, view);
            AbstractC19074t.m100208f(interfaceC30221g, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            Button button = (Button) view.findViewById(AbstractC6918a0.product_catalog_btn_retry);
            if (button != null) {
                button.setIdTracking("product_list_btn_retry_network");
                button.setOnClickListener(new View.OnClickListener() { // from class: yx.o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C31099k.f.m151112l0(InterfaceC30221g.this, view2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m151112l0(InterfaceC30221g interfaceC30221g, View view) {
            AbstractC19074t.m100208f(interfaceC30221g, "$actionHandler");
            interfaceC30221g.mo48798ne(AbstractC30220f.f.f140369a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.k$g */
    /* loaded from: classes4.dex */
    public static class g extends j {

        /* renamed from: J */
        private final ProductCatalogSkeletonView f143320J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30221g interfaceC30221g, ProductCatalogSkeletonView productCatalogSkeletonView) {
            super(interfaceC30221g, productCatalogSkeletonView);
            AbstractC19074t.m100208f(interfaceC30221g, "actionHandler");
            AbstractC19074t.m100208f(productCatalogSkeletonView, "skeletonView");
            this.f143320J = productCatalogSkeletonView;
            productCatalogSkeletonView.setSkeletonLayoutType(6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.k$h */
    /* loaded from: classes4.dex */
    public static class h extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30221g interfaceC30221g, View view) {
            super(interfaceC30221g, view);
            AbstractC19074t.m100208f(interfaceC30221g, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.k$i */
    /* loaded from: classes4.dex */
    public static final class i extends j {

        /* renamed from: J */
        private final BaseProductItemView f143321J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC30221g interfaceC30221g, BaseProductItemView baseProductItemView) {
            super(interfaceC30221g, baseProductItemView);
            AbstractC19074t.m100208f(interfaceC30221g, "actionHandler");
            AbstractC19074t.m100208f(baseProductItemView, "productItemView");
            this.f143321J = baseProductItemView;
            baseProductItemView.setActionHandler(interfaceC30221g);
        }

        @Override // p696yx.C31099k.j
        /* renamed from: i0 */
        public void mo151104i0(AbstractC18129y0 abstractC18129y0) {
            AbstractC19074t.m100208f(abstractC18129y0, "item");
            if (abstractC18129y0 instanceof AbstractC18129y0.i) {
                this.f143321J.mo48524r((AbstractC18129y0.i) abstractC18129y0);
            }
        }
    }

    /* renamed from: yx.k$j */
    /* loaded from: classes4.dex */
    public static class j extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final InterfaceC30221g f143322I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC30221g interfaceC30221g, View view) {
            super(view);
            AbstractC19074t.m100208f(interfaceC30221g, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            this.f143322I = interfaceC30221g;
        }

        /* renamed from: i0 */
        public void mo151104i0(AbstractC18129y0 abstractC18129y0) {
            AbstractC19074t.m100208f(abstractC18129y0, "item");
        }

        /* renamed from: j0 */
        public final InterfaceC30221g m151113j0() {
            return this.f143322I;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.k$k */
    /* loaded from: classes4.dex */
    public static class k extends j {

        /* renamed from: J */
        private final SelectWholeCatalogItemView f143323J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC30221g interfaceC30221g, SelectWholeCatalogItemView selectWholeCatalogItemView) {
            super(interfaceC30221g, selectWholeCatalogItemView);
            AbstractC19074t.m100208f(interfaceC30221g, "actionHandler");
            AbstractC19074t.m100208f(selectWholeCatalogItemView, "selectWholeCatalogItemView");
            this.f143323J = selectWholeCatalogItemView;
        }

        @Override // p696yx.C31099k.j
        /* renamed from: i0 */
        public void mo151104i0(AbstractC18129y0 abstractC18129y0) {
            AbstractC19074t.m100208f(abstractC18129y0, "item");
            if (abstractC18129y0 instanceof AbstractC18129y0.j) {
                this.f143323J.setActionHandler(m151113j0());
                this.f143323J.m48557p((AbstractC18129y0.j) abstractC18129y0);
            }
        }
    }

    public C31099k(boolean z11, InterfaceC30221g interfaceC30221g) {
        AbstractC19074t.m100208f(interfaceC30221g, "actionHandler");
        this.f143315r = z11;
        this.f143316s = interfaceC30221g;
        this.f143317t = new ArrayList();
    }

    /* renamed from: L */
    public final AbstractC18129y0 m151100L(int i11) {
        Object m131207g0;
        m131207g0 = AbstractC25332a0.m131207g0(this.f143317t, i11);
        return (AbstractC18129y0) m131207g0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(j jVar, int i11) {
        AbstractC19074t.m100208f(jVar, "holder");
        Object obj = this.f143317t.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        jVar.mo151104i0((AbstractC18129y0) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public j mo9992C(ViewGroup viewGroup, int i11) {
        BaseProductItemView bottomSheetProductItemView;
        j iVar;
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        switch (i11) {
            case 1:
                if (this.f143315r) {
                    AbstractC19074t.m100205c(context);
                    bottomSheetProductItemView = new ManageProductItemView(context);
                } else {
                    AbstractC19074t.m100205c(context);
                    bottomSheetProductItemView = new BottomSheetProductItemView(context);
                }
                bottomSheetProductItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                iVar = new i(this.f143316s, bottomSheetProductItemView);
                break;
            case 2:
                ProductCatalogSkeletonView productCatalogSkeletonView = new ProductCatalogSkeletonView(context);
                productCatalogSkeletonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                iVar = new g(this.f143316s, productCatalogSkeletonView);
                break;
            case 3:
                View inflate = from.inflate(AbstractC7409c0.prodcat_product_list_loading_footer, viewGroup, false);
                InterfaceC30221g interfaceC30221g = this.f143316s;
                AbstractC19074t.m100205c(inflate);
                iVar = new h(interfaceC30221g, inflate);
                break;
            case 4:
                View inflate2 = from.inflate(AbstractC7409c0.prodcat_product_list_load_error_footer, viewGroup, false);
                InterfaceC30221g interfaceC30221g2 = this.f143316s;
                AbstractC19074t.m100205c(inflate2);
                iVar = new d(interfaceC30221g2, inflate2);
                break;
            case 5:
                View inflate3 = from.inflate(AbstractC7409c0.prodcat_product_list_load_error_full, viewGroup, false);
                InterfaceC30221g interfaceC30221g3 = this.f143316s;
                AbstractC19074t.m100205c(inflate3);
                iVar = new e(interfaceC30221g3, inflate3);
                break;
            case 6:
                View inflate4 = from.inflate(AbstractC7409c0.prodcat_product_list_load_error_network, viewGroup, false);
                InterfaceC30221g interfaceC30221g4 = this.f143316s;
                AbstractC19074t.m100205c(inflate4);
                iVar = new f(interfaceC30221g4, inflate4);
                break;
            case 7:
                View inflate5 = from.inflate(AbstractC7409c0.prodcat_product_list_empty_layout, viewGroup, false);
                InterfaceC30221g interfaceC30221g5 = this.f143316s;
                AbstractC19074t.m100205c(inflate5);
                iVar = new c(interfaceC30221g5, inflate5);
                break;
            case 8:
                AbstractC19074t.m100205c(context);
                ProductManageAddProductItemView productManageAddProductItemView = new ProductManageAddProductItemView(context);
                productManageAddProductItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                iVar = new a(this.f143316s, productManageAddProductItemView);
                break;
            case 9:
                AbstractC19074t.m100205c(context);
                SelectWholeCatalogItemView selectWholeCatalogItemView = new SelectWholeCatalogItemView(context);
                selectWholeCatalogItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                iVar = new k(this.f143316s, selectWholeCatalogItemView);
                break;
            default:
                return new j(this.f143316s, new View(context));
        }
        return iVar;
    }

    /* renamed from: O */
    public final void m151103O(List list) {
        AbstractC19074t.m100208f(list, "itemList");
        this.f143317t.clear();
        this.f143317t.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143317t.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return ((AbstractC18129y0) this.f143317t.get(i11)).mo96414c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        AbstractC18129y0 abstractC18129y0 = (AbstractC18129y0) this.f143317t.get(i11);
        if (abstractC18129y0 instanceof AbstractC18129y0.i) {
            return 1;
        }
        if (abstractC18129y0 instanceof AbstractC18129y0.g) {
            return 2;
        }
        if (abstractC18129y0 instanceof AbstractC18129y0.h) {
            return 3;
        }
        if (abstractC18129y0 instanceof AbstractC18129y0.d) {
            return 4;
        }
        if (abstractC18129y0 instanceof AbstractC18129y0.e) {
            return 5;
        }
        if (abstractC18129y0 instanceof AbstractC18129y0.f) {
            return 6;
        }
        if (abstractC18129y0 instanceof AbstractC18129y0.c) {
            return 7;
        }
        if (abstractC18129y0 instanceof AbstractC18129y0.a) {
            return 8;
        }
        if (abstractC18129y0 instanceof AbstractC18129y0.j) {
            return 9;
        }
        throw new NoWhenBranchMatchedException();
    }
}
