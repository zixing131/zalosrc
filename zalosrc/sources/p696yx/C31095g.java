package p696yx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.productcatalog.p068ui.widget.PickCatalogItemView;
import com.zing.zalo.productcatalog.p068ui.widget.ProductCatalogSkeletonView;
import com.zing.zalo.zdesign.component.Button;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p115dy.AbstractC18104m;
import p661xx.AbstractC30217c;
import p661xx.InterfaceC30218d;
import p696yx.C31095g;
import qm0.AbstractC25332a0;

/* renamed from: yx.g */
/* loaded from: classes4.dex */
public final class C31095g extends RecyclerView.AbstractC1880g {
    public static final c Companion = new c(null);

    /* renamed from: r */
    private final InterfaceC30218d f143307r;

    /* renamed from: s */
    private final ArrayList f143308s;

    /* renamed from: yx.g$a */
    /* loaded from: classes4.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final InterfaceC30218d f143309I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30218d interfaceC30218d, View view) {
            super(view);
            AbstractC19074t.m100208f(interfaceC30218d, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            this.f143309I = interfaceC30218d;
        }

        /* renamed from: i0 */
        public void mo151093i0(AbstractC18104m abstractC18104m) {
            AbstractC19074t.m100208f(abstractC18104m, "item");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends a {

        /* renamed from: J */
        private final PickCatalogItemView f143310J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30218d interfaceC30218d, PickCatalogItemView pickCatalogItemView) {
            super(interfaceC30218d, pickCatalogItemView);
            AbstractC19074t.m100208f(interfaceC30218d, "actionHandler");
            AbstractC19074t.m100208f(pickCatalogItemView, "catalogItemView");
            this.f143310J = pickCatalogItemView;
            pickCatalogItemView.setActionHandler(interfaceC30218d);
        }

        @Override // p696yx.C31095g.a
        /* renamed from: i0 */
        public void mo151093i0(AbstractC18104m abstractC18104m) {
            AbstractC19074t.m100208f(abstractC18104m, "item");
            if (abstractC18104m instanceof AbstractC18104m.a) {
                this.f143310J.m48545p((AbstractC18104m.a) abstractC18104m);
            }
        }
    }

    /* renamed from: yx.g$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.g$d */
    /* loaded from: classes4.dex */
    public static class d extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30218d interfaceC30218d, View view) {
            super(interfaceC30218d, view);
            AbstractC19074t.m100208f(interfaceC30218d, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.g$e */
    /* loaded from: classes4.dex */
    public static class e extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(final InterfaceC30218d interfaceC30218d, View view) {
            super(interfaceC30218d, view);
            AbstractC19074t.m100208f(interfaceC30218d, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            view.setOnClickListener(new View.OnClickListener() { // from class: yx.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31095g.e.m151095k0(InterfaceC30218d.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m151095k0(InterfaceC30218d interfaceC30218d, View view) {
            AbstractC19074t.m100208f(interfaceC30218d, "$actionHandler");
            interfaceC30218d.mo48620Zz(AbstractC30217c.b.f140363a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.g$f */
    /* loaded from: classes4.dex */
    public static class f extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(final InterfaceC30218d interfaceC30218d, View view) {
            super(interfaceC30218d, view);
            AbstractC19074t.m100208f(interfaceC30218d, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            view.setOnClickListener(new View.OnClickListener() { // from class: yx.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31095g.f.m151097k0(InterfaceC30218d.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m151097k0(InterfaceC30218d interfaceC30218d, View view) {
            AbstractC19074t.m100208f(interfaceC30218d, "$actionHandler");
            interfaceC30218d.mo48620Zz(AbstractC30217c.b.f140363a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.g$g */
    /* loaded from: classes4.dex */
    public static class g extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(final InterfaceC30218d interfaceC30218d, View view) {
            super(interfaceC30218d, view);
            AbstractC19074t.m100208f(interfaceC30218d, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            Button button = (Button) view.findViewById(AbstractC6918a0.product_catalog_btn_retry);
            if (button != null) {
                button.setIdTracking("catalog_list_btn_retry_network");
                button.setOnClickListener(new View.OnClickListener() { // from class: yx.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C31095g.g.m151099k0(InterfaceC30218d.this, view2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m151099k0(InterfaceC30218d interfaceC30218d, View view) {
            AbstractC19074t.m100208f(interfaceC30218d, "$actionHandler");
            interfaceC30218d.mo48620Zz(AbstractC30217c.b.f140363a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.g$h */
    /* loaded from: classes4.dex */
    public static class h extends a {

        /* renamed from: J */
        private final ProductCatalogSkeletonView f143311J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30218d interfaceC30218d, ProductCatalogSkeletonView productCatalogSkeletonView) {
            super(interfaceC30218d, productCatalogSkeletonView);
            AbstractC19074t.m100208f(interfaceC30218d, "actionHandler");
            AbstractC19074t.m100208f(productCatalogSkeletonView, "skeletonView");
            this.f143311J = productCatalogSkeletonView;
            productCatalogSkeletonView.setSkeletonLayoutType(6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yx.g$i */
    /* loaded from: classes4.dex */
    public static class i extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC30218d interfaceC30218d, View view) {
            super(interfaceC30218d, view);
            AbstractC19074t.m100208f(interfaceC30218d, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    public C31095g(InterfaceC30218d interfaceC30218d) {
        AbstractC19074t.m100208f(interfaceC30218d, "actionHandler");
        this.f143307r = interfaceC30218d;
        this.f143308s = new ArrayList();
    }

    /* renamed from: L */
    public final AbstractC18104m m151089L(int i11) {
        Object m131207g0;
        m131207g0 = AbstractC25332a0.m131207g0(this.f143308s, i11);
        return (AbstractC18104m) m131207g0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        Object obj = this.f143308s.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        aVar.mo151093i0((AbstractC18104m) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        a bVar;
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        switch (i11) {
            case 1:
                AbstractC19074t.m100205c(context);
                PickCatalogItemView pickCatalogItemView = new PickCatalogItemView(context);
                pickCatalogItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                bVar = new b(this.f143307r, pickCatalogItemView);
                break;
            case 2:
                ProductCatalogSkeletonView productCatalogSkeletonView = new ProductCatalogSkeletonView(context);
                productCatalogSkeletonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                bVar = new h(this.f143307r, productCatalogSkeletonView);
                break;
            case 3:
                View inflate = from.inflate(AbstractC7409c0.prodcat_catalog_list_loading_footer, viewGroup, false);
                InterfaceC30218d interfaceC30218d = this.f143307r;
                AbstractC19074t.m100205c(inflate);
                bVar = new i(interfaceC30218d, inflate);
                break;
            case 4:
                View inflate2 = from.inflate(AbstractC7409c0.prodcat_catalog_list_load_error_footer, viewGroup, false);
                InterfaceC30218d interfaceC30218d2 = this.f143307r;
                AbstractC19074t.m100205c(inflate2);
                bVar = new e(interfaceC30218d2, inflate2);
                break;
            case 5:
                View inflate3 = from.inflate(AbstractC7409c0.prodcat_catalog_list_load_error_full, viewGroup, false);
                InterfaceC30218d interfaceC30218d3 = this.f143307r;
                AbstractC19074t.m100205c(inflate3);
                bVar = new f(interfaceC30218d3, inflate3);
                break;
            case 6:
                View inflate4 = from.inflate(AbstractC7409c0.prodcat_catalog_list_load_error_network, viewGroup, false);
                InterfaceC30218d interfaceC30218d4 = this.f143307r;
                AbstractC19074t.m100205c(inflate4);
                bVar = new g(interfaceC30218d4, inflate4);
                break;
            case 7:
                View inflate5 = from.inflate(AbstractC7409c0.prodcat_catalog_picker_empty_layout, viewGroup, false);
                InterfaceC30218d interfaceC30218d5 = this.f143307r;
                AbstractC19074t.m100205c(inflate5);
                bVar = new d(interfaceC30218d5, inflate5);
                break;
            default:
                return new a(this.f143307r, new View(context));
        }
        return bVar;
    }

    /* renamed from: O */
    public final void m151092O(List list) {
        AbstractC19074t.m100208f(list, "itemList");
        this.f143308s.clear();
        this.f143308s.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143308s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return ((AbstractC18104m) this.f143308s.get(i11)).mo96297a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        AbstractC18104m abstractC18104m = (AbstractC18104m) this.f143308s.get(i11);
        if (abstractC18104m instanceof AbstractC18104m.a) {
            return 1;
        }
        if (abstractC18104m instanceof AbstractC18104m.g) {
            return 2;
        }
        if (abstractC18104m instanceof AbstractC18104m.h) {
            return 3;
        }
        if (abstractC18104m instanceof AbstractC18104m.d) {
            return 4;
        }
        if (abstractC18104m instanceof AbstractC18104m.e) {
            return 5;
        }
        if (abstractC18104m instanceof AbstractC18104m.f) {
            return 6;
        }
        if (abstractC18104m instanceof AbstractC18104m.c) {
            return 7;
        }
        throw new NoWhenBranchMatchedException();
    }
}
