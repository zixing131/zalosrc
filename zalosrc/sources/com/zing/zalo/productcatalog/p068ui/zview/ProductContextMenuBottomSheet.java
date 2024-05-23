package com.zing.zalo.productcatalog.p068ui.zview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.productcatalog.model.Product;
import com.zing.zalo.productcatalog.p068ui.zview.ProductContextMenuBottomSheet;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19071q;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p262jb.AbstractC21196a;
import p649xl.C29963o9;
import pm0.C24848g0;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class ProductContextMenuBottomSheet extends BottomSheetZaloViewWithAnim {
    public static final C9126a Companion = new C9126a(null);

    /* renamed from: W0 */
    private C29963o9 f48691W0;

    /* renamed from: X0 */
    private Product f48692X0;

    /* renamed from: Y0 */
    private SettingItemLayout f48693Y0;

    /* renamed from: Z0 */
    private SettingItemLayout f48694Z0;

    /* renamed from: a1 */
    private SettingItemLayout f48695a1;

    /* renamed from: b1 */
    private SettingItemLayout f48696b1;

    /* renamed from: c1 */
    private SettingItemLayout f48697c1;

    /* renamed from: d1 */
    private SettingItemLayout f48698d1;

    /* renamed from: e1 */
    private SettingItemLayout f48699e1;

    /* renamed from: f1 */
    private final boolean f48700f1 = true;

    /* renamed from: g1 */
    private boolean f48701g1;

    /* renamed from: h1 */
    private InterfaceC18505l f48702h1;

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductContextMenuBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C9126a {
        private C9126a() {
        }

        public /* synthetic */ C9126a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductContextMenuBottomSheet$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC9127b {

        /* renamed from: a */
        private final Product f48705a;

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductContextMenuBottomSheet$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC9127b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Product product) {
                super(product, null);
                AbstractC19074t.m100208f(product, "product");
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductContextMenuBottomSheet$b$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC9127b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Product product) {
                super(product, null);
                AbstractC19074t.m100208f(product, "product");
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductContextMenuBottomSheet$b$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC9127b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Product product) {
                super(product, null);
                AbstractC19074t.m100208f(product, "product");
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductContextMenuBottomSheet$b$d */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC9127b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Product product) {
                super(product, null);
                AbstractC19074t.m100208f(product, "product");
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductContextMenuBottomSheet$b$e */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC9127b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Product product) {
                super(product, null);
                AbstractC19074t.m100208f(product, "product");
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductContextMenuBottomSheet$b$f */
        /* loaded from: classes4.dex */
        public static final class f extends AbstractC9127b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Product product) {
                super(product, null);
                AbstractC19074t.m100208f(product, "product");
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductContextMenuBottomSheet$b$g */
        /* loaded from: classes4.dex */
        public static final class g extends AbstractC9127b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Product product) {
                super(product, null);
                AbstractC19074t.m100208f(product, "product");
            }
        }

        public /* synthetic */ AbstractC9127b(Product product, AbstractC19060k abstractC19060k) {
            this(product);
        }

        /* renamed from: a */
        public final Product m48829a() {
            return this.f48705a;
        }

        private AbstractC9127b(Product product) {
            this.f48705a = product;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductContextMenuBottomSheet$c */
    /* loaded from: classes4.dex */
    /* synthetic */ class C9128c extends C19071q implements InterfaceC18505l {
        C9128c(Object obj) {
            super(1, obj, ProductManageView.class, "onHandleProductContextMenuAction", "onHandleProductContextMenuAction(Lcom/zing/zalo/productcatalog/ui/zview/ProductContextMenuBottomSheet$MenuItem;)V", 0);
        }

        /* renamed from: h */
        public final void m48830h(AbstractC9127b abstractC9127b) {
            AbstractC19074t.m100208f(abstractC9127b, "p0");
            ((ProductManageView) this.f94922q).m48896aN(abstractC9127b);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48830h((AbstractC9127b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: AM */
    public static final void m48811AM(ProductContextMenuBottomSheet productContextMenuBottomSheet, Product product, View view) {
        AbstractC19074t.m100208f(productContextMenuBottomSheet, "this$0");
        AbstractC19074t.m100208f(product, "$product");
        InterfaceC18505l interfaceC18505l = productContextMenuBottomSheet.f48702h1;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new AbstractC9127b.c(product));
        }
        productContextMenuBottomSheet.close();
    }

    /* renamed from: BM */
    public static final void m48812BM(ProductContextMenuBottomSheet productContextMenuBottomSheet, Product product, View view) {
        AbstractC19074t.m100208f(productContextMenuBottomSheet, "this$0");
        AbstractC19074t.m100208f(product, "$product");
        InterfaceC18505l interfaceC18505l = productContextMenuBottomSheet.f48702h1;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new AbstractC9127b.e(product));
        }
        productContextMenuBottomSheet.close();
    }

    /* renamed from: tM */
    private final View m48820tM() {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC23136l9.m118742r(0.5f));
        layoutParams.leftMargin = AbstractC23136l9.m118742r(60.0f);
        layoutParams.rightMargin = AbstractC23136l9.m118742r(16.0f);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC16781w.ItemSeparatorColor));
        return view;
    }

    /* renamed from: uM */
    private final void m48821uM() {
        C29963o9 c29963o9 = this.f48691W0;
        SettingItemLayout settingItemLayout = null;
        if (c29963o9 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o9 = null;
        }
        Context context = c29963o9.f138883q.getContext();
        Product product = this.f48692X0;
        if (product == null) {
            return;
        }
        AbstractC19074t.m100205c(context);
        SettingItemLayout settingItemLayout2 = new SettingItemLayout(context);
        Drawable m139660c = C27280g.m139660c(context, AbstractC23322a.zds_ic_catalog_line_24, AbstractC2807a.icon_02);
        String string = settingItemLayout2.getResources().getString(AbstractC8020f0.product_catalog_context_menu_item_view_details);
        AbstractC19074t.m100207e(string, "getString(...)");
        settingItemLayout2.m48828a(m139660c, string);
        settingItemLayout2.setOnClickListener(new View.OnClickListener() { // from class: ay.a1

            /* renamed from: q */
            public final /* synthetic */ Product f9970q;

            public /* synthetic */ ViewOnClickListenerC2396a1(Product product2) {
                r2 = product2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductContextMenuBottomSheet.m48825yM(ProductContextMenuBottomSheet.this, r2, view);
            }
        });
        this.f48693Y0 = settingItemLayout2;
        C29963o9 c29963o92 = this.f48691W0;
        if (c29963o92 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o92 = null;
        }
        LinearLayout linearLayout = c29963o92.f138883q;
        SettingItemLayout settingItemLayout3 = this.f48693Y0;
        if (settingItemLayout3 == null) {
            AbstractC19074t.m100223u("viewDetailsProductItem");
            settingItemLayout3 = null;
        }
        linearLayout.addView(settingItemLayout3);
        C29963o9 c29963o93 = this.f48691W0;
        if (c29963o93 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o93 = null;
        }
        c29963o93.f138883q.addView(m48820tM());
        SettingItemLayout settingItemLayout4 = new SettingItemLayout(context);
        Drawable m139660c2 = C27280g.m139660c(context, AbstractC23322a.zds_ic_edit_line_24, AbstractC2807a.icon_02);
        String string2 = settingItemLayout4.getResources().getString(AbstractC8020f0.product_catalog_context_menu_item_edit);
        AbstractC19074t.m100207e(string2, "getString(...)");
        settingItemLayout4.m48828a(m139660c2, string2);
        settingItemLayout4.setOnClickListener(new View.OnClickListener() { // from class: ay.b1

            /* renamed from: q */
            public final /* synthetic */ Product f9975q;

            public /* synthetic */ ViewOnClickListenerC2399b1(Product product2) {
                r2 = product2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductContextMenuBottomSheet.m48826zM(ProductContextMenuBottomSheet.this, r2, view);
            }
        });
        this.f48694Z0 = settingItemLayout4;
        C29963o9 c29963o94 = this.f48691W0;
        if (c29963o94 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o94 = null;
        }
        LinearLayout linearLayout2 = c29963o94.f138883q;
        SettingItemLayout settingItemLayout5 = this.f48694Z0;
        if (settingItemLayout5 == null) {
            AbstractC19074t.m100223u("editProductItem");
            settingItemLayout5 = null;
        }
        linearLayout2.addView(settingItemLayout5);
        C29963o9 c29963o95 = this.f48691W0;
        if (c29963o95 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o95 = null;
        }
        c29963o95.f138883q.addView(m48820tM());
        SettingItemLayout settingItemLayout6 = new SettingItemLayout(context);
        Drawable m139660c3 = C27280g.m139660c(context, AbstractC23322a.zds_ic_copy_line_24, AbstractC2807a.icon_02);
        String string3 = settingItemLayout6.getResources().getString(AbstractC8020f0.product_catalog_context_menu_item_duplicate);
        AbstractC19074t.m100207e(string3, "getString(...)");
        settingItemLayout6.m48828a(m139660c3, string3);
        settingItemLayout6.setOnClickListener(new View.OnClickListener() { // from class: ay.c1

            /* renamed from: q */
            public final /* synthetic */ Product f9982q;

            public /* synthetic */ ViewOnClickListenerC2402c1(Product product2) {
                r2 = product2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductContextMenuBottomSheet.m48811AM(ProductContextMenuBottomSheet.this, r2, view);
            }
        });
        this.f48695a1 = settingItemLayout6;
        if (this.f48700f1) {
            C29963o9 c29963o96 = this.f48691W0;
            if (c29963o96 == null) {
                AbstractC19074t.m100223u("binding");
                c29963o96 = null;
            }
            LinearLayout linearLayout3 = c29963o96.f138883q;
            SettingItemLayout settingItemLayout7 = this.f48695a1;
            if (settingItemLayout7 == null) {
                AbstractC19074t.m100223u("duplicateProductItem");
                settingItemLayout7 = null;
            }
            linearLayout3.addView(settingItemLayout7);
            C29963o9 c29963o97 = this.f48691W0;
            if (c29963o97 == null) {
                AbstractC19074t.m100223u("binding");
                c29963o97 = null;
            }
            c29963o97.f138883q.addView(m48820tM());
        }
        SettingItemLayout settingItemLayout8 = new SettingItemLayout(context);
        Drawable m139660c4 = C27280g.m139660c(context, AbstractC23322a.zds_ic_shuffle_solid_24, AbstractC2807a.icon_02);
        String string4 = settingItemLayout8.getResources().getString(AbstractC8020f0.product_catalog_context_menu_item_move);
        AbstractC19074t.m100207e(string4, "getString(...)");
        settingItemLayout8.m48828a(m139660c4, string4);
        settingItemLayout8.setOnClickListener(new View.OnClickListener() { // from class: ay.d1

            /* renamed from: q */
            public final /* synthetic */ Product f9988q;

            public /* synthetic */ ViewOnClickListenerC2405d1(Product product2) {
                r2 = product2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductContextMenuBottomSheet.m48812BM(ProductContextMenuBottomSheet.this, r2, view);
            }
        });
        this.f48696b1 = settingItemLayout8;
        C29963o9 c29963o98 = this.f48691W0;
        if (c29963o98 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o98 = null;
        }
        LinearLayout linearLayout4 = c29963o98.f138883q;
        SettingItemLayout settingItemLayout9 = this.f48696b1;
        if (settingItemLayout9 == null) {
            AbstractC19074t.m100223u("moveProductItem");
            settingItemLayout9 = null;
        }
        linearLayout4.addView(settingItemLayout9);
        C29963o9 c29963o99 = this.f48691W0;
        if (c29963o99 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o99 = null;
        }
        c29963o99.f138883q.addView(m48820tM());
        SettingItemLayout settingItemLayout10 = new SettingItemLayout(context);
        Drawable m139660c5 = C27280g.m139660c(context, AbstractC23322a.zds_ic_share_line_24, AbstractC2807a.icon_02);
        String string5 = settingItemLayout10.getResources().getString(AbstractC8020f0.product_catalog_context_menu_item_share);
        AbstractC19074t.m100207e(string5, "getString(...)");
        settingItemLayout10.m48828a(m139660c5, string5);
        settingItemLayout10.setOnClickListener(new View.OnClickListener() { // from class: ay.e1

            /* renamed from: q */
            public final /* synthetic */ Product f9994q;

            public /* synthetic */ ViewOnClickListenerC2408e1(Product product2) {
                r2 = product2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductContextMenuBottomSheet.m48822vM(ProductContextMenuBottomSheet.this, r2, view);
            }
        });
        this.f48697c1 = settingItemLayout10;
        C29963o9 c29963o910 = this.f48691W0;
        if (c29963o910 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o910 = null;
        }
        LinearLayout linearLayout5 = c29963o910.f138883q;
        SettingItemLayout settingItemLayout11 = this.f48697c1;
        if (settingItemLayout11 == null) {
            AbstractC19074t.m100223u("shareProductItem");
            settingItemLayout11 = null;
        }
        linearLayout5.addView(settingItemLayout11);
        C29963o9 c29963o911 = this.f48691W0;
        if (c29963o911 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o911 = null;
        }
        c29963o911.f138883q.addView(m48820tM());
        SettingItemLayout settingItemLayout12 = new SettingItemLayout(context);
        Drawable m139660c6 = C27280g.m139660c(context, AbstractC23322a.zds_ic_link_line_24, AbstractC2807a.icon_02);
        String string6 = settingItemLayout12.getResources().getString(AbstractC8020f0.product_catalog_context_menu_item_copy_link);
        AbstractC19074t.m100207e(string6, "getString(...)");
        settingItemLayout12.m48828a(m139660c6, string6);
        settingItemLayout12.setOnClickListener(new View.OnClickListener() { // from class: ay.f1

            /* renamed from: q */
            public final /* synthetic */ Product f9997q;

            public /* synthetic */ ViewOnClickListenerC2411f1(Product product2) {
                r2 = product2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductContextMenuBottomSheet.m48823wM(ProductContextMenuBottomSheet.this, r2, view);
            }
        });
        this.f48698d1 = settingItemLayout12;
        C29963o9 c29963o912 = this.f48691W0;
        if (c29963o912 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o912 = null;
        }
        LinearLayout linearLayout6 = c29963o912.f138883q;
        SettingItemLayout settingItemLayout13 = this.f48698d1;
        if (settingItemLayout13 == null) {
            AbstractC19074t.m100223u("copyProductLinkItem");
            settingItemLayout13 = null;
        }
        linearLayout6.addView(settingItemLayout13);
        C29963o9 c29963o913 = this.f48691W0;
        if (c29963o913 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o913 = null;
        }
        c29963o913.f138883q.addView(m48820tM());
        SettingItemLayout settingItemLayout14 = new SettingItemLayout(context);
        settingItemLayout14.getTitle().setTextColor(C23212s8.m119607o(context, AbstractC2807a.danger));
        Drawable m139660c7 = C27280g.m139660c(context, AbstractC23322a.zds_ic_delete_line_24, AbstractC2807a.danger);
        String string7 = settingItemLayout14.getResources().getString(AbstractC8020f0.product_catalog_context_menu_item_delete);
        AbstractC19074t.m100207e(string7, "getString(...)");
        settingItemLayout14.m48828a(m139660c7, string7);
        settingItemLayout14.setOnClickListener(new View.OnClickListener() { // from class: ay.g1

            /* renamed from: q */
            public final /* synthetic */ Product f10001q;

            public /* synthetic */ ViewOnClickListenerC2414g1(Product product2) {
                r2 = product2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductContextMenuBottomSheet.m48824xM(ProductContextMenuBottomSheet.this, r2, view);
            }
        });
        this.f48699e1 = settingItemLayout14;
        C29963o9 c29963o914 = this.f48691W0;
        if (c29963o914 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o914 = null;
        }
        LinearLayout linearLayout7 = c29963o914.f138883q;
        SettingItemLayout settingItemLayout15 = this.f48699e1;
        if (settingItemLayout15 == null) {
            AbstractC19074t.m100223u("deleteProductItem");
        } else {
            settingItemLayout = settingItemLayout15;
        }
        linearLayout7.addView(settingItemLayout);
    }

    /* renamed from: vM */
    public static final void m48822vM(ProductContextMenuBottomSheet productContextMenuBottomSheet, Product product, View view) {
        AbstractC19074t.m100208f(productContextMenuBottomSheet, "this$0");
        AbstractC19074t.m100208f(product, "$product");
        InterfaceC18505l interfaceC18505l = productContextMenuBottomSheet.f48702h1;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new AbstractC9127b.f(product));
        }
        productContextMenuBottomSheet.close();
    }

    /* renamed from: wM */
    public static final void m48823wM(ProductContextMenuBottomSheet productContextMenuBottomSheet, Product product, View view) {
        AbstractC19074t.m100208f(productContextMenuBottomSheet, "this$0");
        AbstractC19074t.m100208f(product, "$product");
        InterfaceC18505l interfaceC18505l = productContextMenuBottomSheet.f48702h1;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new AbstractC9127b.a(product));
        }
        productContextMenuBottomSheet.close();
    }

    /* renamed from: xM */
    public static final void m48824xM(ProductContextMenuBottomSheet productContextMenuBottomSheet, Product product, View view) {
        AbstractC19074t.m100208f(productContextMenuBottomSheet, "this$0");
        AbstractC19074t.m100208f(product, "$product");
        InterfaceC18505l interfaceC18505l = productContextMenuBottomSheet.f48702h1;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new AbstractC9127b.b(product));
        }
        productContextMenuBottomSheet.close();
    }

    /* renamed from: yM */
    public static final void m48825yM(ProductContextMenuBottomSheet productContextMenuBottomSheet, Product product, View view) {
        AbstractC19074t.m100208f(productContextMenuBottomSheet, "this$0");
        AbstractC19074t.m100208f(product, "$product");
        InterfaceC18505l interfaceC18505l = productContextMenuBottomSheet.f48702h1;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new AbstractC9127b.g(product));
        }
        productContextMenuBottomSheet.close();
    }

    /* renamed from: zM */
    public static final void m48826zM(ProductContextMenuBottomSheet productContextMenuBottomSheet, Product product, View view) {
        AbstractC19074t.m100208f(productContextMenuBottomSheet, "this$0");
        AbstractC19074t.m100208f(product, "$product");
        InterfaceC18505l interfaceC18505l = productContextMenuBottomSheet.f48702h1;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new AbstractC9127b.d(product));
        }
        productContextMenuBottomSheet.close();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        Product product;
        C17487o0 mo78545c;
        ZaloView m92993D0;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            product = (Product) m92642L3.getParcelable("EXTRA_PRODUCT_ITEM");
        } else {
            product = null;
        }
        this.f48692X0 = product;
        if (product == null) {
            close();
        }
        BottomSheetZaloViewWithAnim.InterfaceC14117c interfaceC14117c = this.f72458P0;
        if (interfaceC14117c != null && (mo78545c = interfaceC14117c.mo78545c()) != null && (m92993D0 = mo78545c.m92993D0(ProductManageView.class)) != null && (m92993D0 instanceof ProductManageView)) {
            this.f48702h1 = new C9128c(m92993D0);
        }
    }

    /* renamed from: CM */
    public final boolean m48827CM() {
        return this.f48701g1;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C29963o9 c29963o9 = this.f48691W0;
        if (c29963o9 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o9 = null;
        }
        LinearLayout linearLayout = c29963o9.f138883q;
        AbstractC19074t.m100207e(linearLayout, "mainView");
        return linearLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: dM */
    public int mo37127dM() {
        return this.f72454M0.getMeasuredHeight();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        int measuredHeight = this.f72454M0.getMeasuredHeight();
        C29963o9 c29963o9 = this.f48691W0;
        if (c29963o9 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o9 = null;
        }
        return measuredHeight - c29963o9.f138883q.getBottom();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        C29963o9 m148326c = C29963o9.m148326c(LayoutInflater.from(getContext()), this.f72454M0, true);
        AbstractC19074t.m100207e(m148326c, "inflate(...)");
        this.f48691W0 = m148326c;
        m48821uM();
        this.f72454M0.setVisibility(4);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setMaxTranslationY(mo37128eM());
        this.f72454M0.setMinTranslationY(mo37128eM());
        this.f72454M0.setEnableScrollY(true);
        this.f48701g1 = true;
        this.f72454M0.setVisibility(0);
        m78542lM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ProductContextMenuBottomSheetView";
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: hM */
    public void mo37567hM() {
        super.mo37567hM();
        if (this.f72454M0.getTranslationY() != mo37128eM()) {
            this.f72454M0.setViewTranslationY(mo37128eM());
        }
    }

    /* loaded from: classes4.dex */
    public static final class SettingItemLayout extends RelativeLayout {

        /* renamed from: p */
        private final ZAppCompatImageView f48703p;

        /* renamed from: q */
        private final RobotoTextView f48704q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettingItemLayout(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
            this.f48703p = zAppCompatImageView;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context2);
            this.f48704q = robotoTextView;
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            int dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC2809c.f11268u5);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(AbstractC2809c.f11267u4);
            setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, -2);
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            zAppCompatImageView.setLayoutParams(layoutParams);
            zAppCompatImageView.setId(View.generateViewId());
            addView(zAppCompatImageView);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(1, zAppCompatImageView.getId());
            layoutParams2.addRule(15);
            layoutParams2.leftMargin = dimensionPixelSize;
            robotoTextView.setId(View.generateViewId());
            robotoTextView.setTextSize(0, robotoTextView.getResources().getDimension(AbstractC2809c.f600));
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            robotoTextView.setMaxLines(2);
            robotoTextView.setLayoutParams(layoutParams2);
            addView(robotoTextView);
        }

        /* renamed from: a */
        public final void m48828a(Drawable drawable, CharSequence charSequence) {
            AbstractC19074t.m100208f(charSequence, "titleText");
            this.f48703p.setImageDrawable(drawable);
            this.f48704q.setText(charSequence);
        }

        public final ZAppCompatImageView getIcon() {
            return this.f48703p;
        }

        public final RobotoTextView getTitle() {
            return this.f48704q;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettingItemLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(attributeSet, "attrs");
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
            this.f48703p = zAppCompatImageView;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context2);
            this.f48704q = robotoTextView;
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            int dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC2809c.f11268u5);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(AbstractC2809c.f11267u4);
            setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, -2);
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            zAppCompatImageView.setLayoutParams(layoutParams);
            zAppCompatImageView.setId(View.generateViewId());
            addView(zAppCompatImageView);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(1, zAppCompatImageView.getId());
            layoutParams2.addRule(15);
            layoutParams2.leftMargin = dimensionPixelSize;
            robotoTextView.setId(View.generateViewId());
            robotoTextView.setTextSize(0, robotoTextView.getResources().getDimension(AbstractC2809c.f600));
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            robotoTextView.setMaxLines(2);
            robotoTextView.setLayoutParams(layoutParams2);
            addView(robotoTextView);
        }
    }
}
