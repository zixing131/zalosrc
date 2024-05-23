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
import com.zing.zalo.productcatalog.p068ui.zview.CatalogContextMenuBottomSheet;
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
import p589vx.C28669n;
import p624wx.C29259b;
import p649xl.C29963o9;
import pm0.C24848g0;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class CatalogContextMenuBottomSheet extends BottomSheetZaloViewWithAnim {
    public static final C9073a Companion = new C9073a(null);

    /* renamed from: W0 */
    private C29963o9 f48576W0;

    /* renamed from: X0 */
    private C29259b f48577X0;

    /* renamed from: Y0 */
    private SettingItemLayout f48578Y0;

    /* renamed from: Z0 */
    private SettingItemLayout f48579Z0;

    /* renamed from: a1 */
    private SettingItemLayout f48580a1;

    /* renamed from: b1 */
    private SettingItemLayout f48581b1;

    /* renamed from: c1 */
    private SettingItemLayout f48582c1;

    /* renamed from: d1 */
    private SettingItemLayout f48583d1;

    /* renamed from: e1 */
    private final boolean f48584e1;

    /* renamed from: f1 */
    private boolean f48585f1;

    /* renamed from: g1 */
    private InterfaceC18505l f48586g1;

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogContextMenuBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C9073a {
        private C9073a() {
        }

        public /* synthetic */ C9073a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogContextMenuBottomSheet$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC9074b {

        /* renamed from: a */
        private final C29259b f48589a;

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogContextMenuBottomSheet$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC9074b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C29259b c29259b) {
                super(c29259b, null);
                AbstractC19074t.m100208f(c29259b, "catalog");
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogContextMenuBottomSheet$b$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC9074b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C29259b c29259b) {
                super(c29259b, null);
                AbstractC19074t.m100208f(c29259b, "catalog");
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogContextMenuBottomSheet$b$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC9074b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C29259b c29259b) {
                super(c29259b, null);
                AbstractC19074t.m100208f(c29259b, "catalog");
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogContextMenuBottomSheet$b$d */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC9074b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C29259b c29259b) {
                super(c29259b, null);
                AbstractC19074t.m100208f(c29259b, "catalog");
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogContextMenuBottomSheet$b$e */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC9074b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(C29259b c29259b) {
                super(c29259b, null);
                AbstractC19074t.m100208f(c29259b, "catalog");
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogContextMenuBottomSheet$b$f */
        /* loaded from: classes4.dex */
        public static final class f extends AbstractC9074b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(C29259b c29259b) {
                super(c29259b, null);
                AbstractC19074t.m100208f(c29259b, "catalog");
            }
        }

        public /* synthetic */ AbstractC9074b(C29259b c29259b, AbstractC19060k abstractC19060k) {
            this(c29259b);
        }

        /* renamed from: a */
        public final C29259b m48606a() {
            return this.f48589a;
        }

        private AbstractC9074b(C29259b c29259b) {
            this.f48589a = c29259b;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogContextMenuBottomSheet$c */
    /* loaded from: classes4.dex */
    /* synthetic */ class C9075c extends C19071q implements InterfaceC18505l {
        C9075c(Object obj) {
            super(1, obj, CatalogsManageView.class, "onHandleCatalogContextMenuAction", "onHandleCatalogContextMenuAction(Lcom/zing/zalo/productcatalog/ui/zview/CatalogContextMenuBottomSheet$MenuItem;)V", 0);
        }

        /* renamed from: h */
        public final void m48607h(AbstractC9074b abstractC9074b) {
            AbstractC19074t.m100208f(abstractC9074b, "p0");
            ((CatalogsManageView) this.f94922q).m48668LM(abstractC9074b);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48607h((AbstractC9074b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: sM */
    private final View m48597sM() {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC23136l9.m118742r(0.5f));
        layoutParams.leftMargin = AbstractC23136l9.m118742r(60.0f);
        layoutParams.rightMargin = AbstractC23136l9.m118742r(16.0f);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC16781w.ItemSeparatorColor));
        return view;
    }

    /* renamed from: tM */
    private final void m48598tM() {
        C29963o9 c29963o9 = this.f48576W0;
        SettingItemLayout settingItemLayout = null;
        if (c29963o9 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o9 = null;
        }
        Context context = c29963o9.f138883q.getContext();
        final C29259b c29259b = this.f48577X0;
        if (c29259b == null) {
            return;
        }
        AbstractC19074t.m100205c(context);
        SettingItemLayout settingItemLayout2 = new SettingItemLayout(context);
        Drawable m139660c = C27280g.m139660c(context, AbstractC23322a.zds_ic_catalog_line_24, AbstractC2807a.icon_02);
        String string = settingItemLayout2.getResources().getString(AbstractC8020f0.catalog_context_menu_item_view_manage);
        AbstractC19074t.m100207e(string, "getString(...)");
        settingItemLayout2.m48605a(m139660c, string);
        settingItemLayout2.setOnClickListener(new View.OnClickListener() { // from class: ay.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogContextMenuBottomSheet.m48601wM(CatalogContextMenuBottomSheet.this, c29259b, view);
            }
        });
        this.f48578Y0 = settingItemLayout2;
        C29963o9 c29963o92 = this.f48576W0;
        if (c29963o92 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o92 = null;
        }
        LinearLayout linearLayout = c29963o92.f138883q;
        SettingItemLayout settingItemLayout3 = this.f48578Y0;
        if (settingItemLayout3 == null) {
            AbstractC19074t.m100223u("manageItem");
            settingItemLayout3 = null;
        }
        linearLayout.addView(settingItemLayout3);
        C29963o9 c29963o93 = this.f48576W0;
        if (c29963o93 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o93 = null;
        }
        c29963o93.f138883q.addView(m48597sM());
        SettingItemLayout settingItemLayout4 = new SettingItemLayout(context);
        Drawable m139660c2 = C27280g.m139660c(context, AbstractC23322a.zds_ic_share_line_24, AbstractC2807a.icon_02);
        String string2 = settingItemLayout4.getResources().getString(AbstractC8020f0.catalog_context_menu_item_share);
        AbstractC19074t.m100207e(string2, "getString(...)");
        settingItemLayout4.m48605a(m139660c2, string2);
        settingItemLayout4.setOnClickListener(new View.OnClickListener() { // from class: ay.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogContextMenuBottomSheet.m48602xM(CatalogContextMenuBottomSheet.this, c29259b, view);
            }
        });
        this.f48579Z0 = settingItemLayout4;
        C29963o9 c29963o94 = this.f48576W0;
        if (c29963o94 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o94 = null;
        }
        LinearLayout linearLayout2 = c29963o94.f138883q;
        SettingItemLayout settingItemLayout5 = this.f48579Z0;
        if (settingItemLayout5 == null) {
            AbstractC19074t.m100223u("shareItem");
            settingItemLayout5 = null;
        }
        linearLayout2.addView(settingItemLayout5);
        C29963o9 c29963o95 = this.f48576W0;
        if (c29963o95 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o95 = null;
        }
        c29963o95.f138883q.addView(m48597sM());
        SettingItemLayout settingItemLayout6 = new SettingItemLayout(context);
        Drawable m139660c3 = C27280g.m139660c(context, AbstractC23322a.zds_ic_link_line_24, AbstractC2807a.icon_02);
        String string3 = settingItemLayout6.getResources().getString(AbstractC8020f0.catalog_context_menu_item_copy_link);
        AbstractC19074t.m100207e(string3, "getString(...)");
        settingItemLayout6.m48605a(m139660c3, string3);
        settingItemLayout6.setOnClickListener(new View.OnClickListener() { // from class: ay.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogContextMenuBottomSheet.m48603yM(CatalogContextMenuBottomSheet.this, c29259b, view);
            }
        });
        this.f48580a1 = settingItemLayout6;
        C29963o9 c29963o96 = this.f48576W0;
        if (c29963o96 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o96 = null;
        }
        LinearLayout linearLayout3 = c29963o96.f138883q;
        SettingItemLayout settingItemLayout7 = this.f48580a1;
        if (settingItemLayout7 == null) {
            AbstractC19074t.m100223u("copyLinkItem");
            settingItemLayout7 = null;
        }
        linearLayout3.addView(settingItemLayout7);
        C29963o9 c29963o97 = this.f48576W0;
        if (c29963o97 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o97 = null;
        }
        c29963o97.f138883q.addView(m48597sM());
        SettingItemLayout settingItemLayout8 = new SettingItemLayout(context);
        Drawable m139660c4 = C27280g.m139660c(context, AbstractC23322a.zds_ic_unhide_line_24, AbstractC2807a.icon_02);
        String string4 = settingItemLayout8.getResources().getString(AbstractC8020f0.catalog_context_menu_item_preview);
        AbstractC19074t.m100207e(string4, "getString(...)");
        settingItemLayout8.m48605a(m139660c4, string4);
        settingItemLayout8.setOnClickListener(new View.OnClickListener() { // from class: ay.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogContextMenuBottomSheet.m48604zM(CatalogContextMenuBottomSheet.this, c29259b, view);
            }
        });
        this.f48581b1 = settingItemLayout8;
        C29963o9 c29963o98 = this.f48576W0;
        if (c29963o98 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o98 = null;
        }
        LinearLayout linearLayout4 = c29963o98.f138883q;
        SettingItemLayout settingItemLayout9 = this.f48581b1;
        if (settingItemLayout9 == null) {
            AbstractC19074t.m100223u("previewItem");
            settingItemLayout9 = null;
        }
        linearLayout4.addView(settingItemLayout9);
        C29963o9 c29963o99 = this.f48576W0;
        if (c29963o99 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o99 = null;
        }
        c29963o99.f138883q.addView(m48597sM());
        SettingItemLayout settingItemLayout10 = new SettingItemLayout(context);
        Drawable m139660c5 = C27280g.m139660c(context, AbstractC23322a.zds_ic_edit_line_24, AbstractC2807a.icon_02);
        String string5 = settingItemLayout10.getResources().getString(AbstractC8020f0.catalog_context_menu_item_edit);
        AbstractC19074t.m100207e(string5, "getString(...)");
        settingItemLayout10.m48605a(m139660c5, string5);
        settingItemLayout10.setOnClickListener(new View.OnClickListener() { // from class: ay.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogContextMenuBottomSheet.m48599uM(CatalogContextMenuBottomSheet.this, c29259b, view);
            }
        });
        this.f48582c1 = settingItemLayout10;
        C29963o9 c29963o910 = this.f48576W0;
        if (c29963o910 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o910 = null;
        }
        LinearLayout linearLayout5 = c29963o910.f138883q;
        SettingItemLayout settingItemLayout11 = this.f48582c1;
        if (settingItemLayout11 == null) {
            AbstractC19074t.m100223u("editItem");
            settingItemLayout11 = null;
        }
        linearLayout5.addView(settingItemLayout11);
        if (this.f48584e1) {
            C29963o9 c29963o911 = this.f48576W0;
            if (c29963o911 == null) {
                AbstractC19074t.m100223u("binding");
                c29963o911 = null;
            }
            c29963o911.f138883q.addView(m48597sM());
        }
        if (this.f48584e1) {
            SettingItemLayout settingItemLayout12 = new SettingItemLayout(context);
            settingItemLayout12.getTitle().setTextColor(C23212s8.m119607o(context, AbstractC2807a.danger));
            Drawable m139660c6 = C27280g.m139660c(context, AbstractC23322a.zds_ic_delete_line_24, AbstractC2807a.danger);
            String string6 = settingItemLayout12.getResources().getString(AbstractC8020f0.catalog_context_menu_item_delete);
            AbstractC19074t.m100207e(string6, "getString(...)");
            settingItemLayout12.m48605a(m139660c6, string6);
            settingItemLayout12.setOnClickListener(new View.OnClickListener() { // from class: ay.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CatalogContextMenuBottomSheet.m48600vM(CatalogContextMenuBottomSheet.this, c29259b, view);
                }
            });
            this.f48583d1 = settingItemLayout12;
            C29963o9 c29963o912 = this.f48576W0;
            if (c29963o912 == null) {
                AbstractC19074t.m100223u("binding");
                c29963o912 = null;
            }
            LinearLayout linearLayout6 = c29963o912.f138883q;
            SettingItemLayout settingItemLayout13 = this.f48583d1;
            if (settingItemLayout13 == null) {
                AbstractC19074t.m100223u("deleteItem");
            } else {
                settingItemLayout = settingItemLayout13;
            }
            linearLayout6.addView(settingItemLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public static final void m48599uM(CatalogContextMenuBottomSheet catalogContextMenuBottomSheet, C29259b c29259b, View view) {
        AbstractC19074t.m100208f(catalogContextMenuBottomSheet, "this$0");
        AbstractC19074t.m100208f(c29259b, "$catalog");
        InterfaceC18505l interfaceC18505l = catalogContextMenuBottomSheet.f48586g1;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new AbstractC9074b.c(c29259b));
        }
        catalogContextMenuBottomSheet.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public static final void m48600vM(CatalogContextMenuBottomSheet catalogContextMenuBottomSheet, C29259b c29259b, View view) {
        AbstractC19074t.m100208f(catalogContextMenuBottomSheet, "this$0");
        AbstractC19074t.m100208f(c29259b, "$catalog");
        InterfaceC18505l interfaceC18505l = catalogContextMenuBottomSheet.f48586g1;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new AbstractC9074b.b(c29259b));
        }
        catalogContextMenuBottomSheet.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static final void m48601wM(CatalogContextMenuBottomSheet catalogContextMenuBottomSheet, C29259b c29259b, View view) {
        AbstractC19074t.m100208f(catalogContextMenuBottomSheet, "this$0");
        AbstractC19074t.m100208f(c29259b, "$catalog");
        InterfaceC18505l interfaceC18505l = catalogContextMenuBottomSheet.f48586g1;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new AbstractC9074b.d(c29259b));
        }
        catalogContextMenuBottomSheet.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m48602xM(CatalogContextMenuBottomSheet catalogContextMenuBottomSheet, C29259b c29259b, View view) {
        AbstractC19074t.m100208f(catalogContextMenuBottomSheet, "this$0");
        AbstractC19074t.m100208f(c29259b, "$catalog");
        InterfaceC18505l interfaceC18505l = catalogContextMenuBottomSheet.f48586g1;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new AbstractC9074b.f(c29259b));
        }
        catalogContextMenuBottomSheet.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m48603yM(CatalogContextMenuBottomSheet catalogContextMenuBottomSheet, C29259b c29259b, View view) {
        AbstractC19074t.m100208f(catalogContextMenuBottomSheet, "this$0");
        AbstractC19074t.m100208f(c29259b, "$catalog");
        InterfaceC18505l interfaceC18505l = catalogContextMenuBottomSheet.f48586g1;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new AbstractC9074b.a(c29259b));
        }
        catalogContextMenuBottomSheet.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public static final void m48604zM(CatalogContextMenuBottomSheet catalogContextMenuBottomSheet, C29259b c29259b, View view) {
        AbstractC19074t.m100208f(catalogContextMenuBottomSheet, "this$0");
        AbstractC19074t.m100208f(c29259b, "$catalog");
        InterfaceC18505l interfaceC18505l = catalogContextMenuBottomSheet.f48586g1;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new AbstractC9074b.e(c29259b));
        }
        catalogContextMenuBottomSheet.close();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        long j11;
        C17487o0 mo78545c;
        ZaloView m92993D0;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        long j12 = 0;
        if (m92642L3 != null) {
            j11 = m92642L3.getLong("EXTRA_CATALOG_ID");
        } else {
            j11 = 0;
        }
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            j12 = m92642L32.getLong("EXTRA_CATALOG_OWNER_ID");
        }
        C29259b m143545U = C28669n.Companion.m143559a().m143545U(String.valueOf(j12), j11);
        this.f48577X0 = m143545U;
        if (m143545U == null) {
            close();
        }
        BottomSheetZaloViewWithAnim.InterfaceC14117c interfaceC14117c = this.f72458P0;
        if (interfaceC14117c != null && (mo78545c = interfaceC14117c.mo78545c()) != null && (m92993D0 = mo78545c.m92993D0(CatalogsManageView.class)) != null && (m92993D0 instanceof CatalogsManageView)) {
            this.f48586g1 = new C9075c(m92993D0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C29963o9 c29963o9 = this.f48576W0;
        if (c29963o9 == null) {
            AbstractC19074t.m100223u("binding");
            c29963o9 = null;
        }
        LinearLayout linearLayout = c29963o9.f138883q;
        AbstractC19074t.m100207e(linearLayout, "mainView");
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: dM */
    public int mo37127dM() {
        return this.f72454M0.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        int measuredHeight = this.f72454M0.getMeasuredHeight();
        C29963o9 c29963o9 = this.f48576W0;
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
        this.f48576W0 = m148326c;
        m48598tM();
        this.f72454M0.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setMaxTranslationY(mo37128eM());
        this.f72454M0.setMinTranslationY(mo37128eM());
        this.f72454M0.setEnableScrollY(true);
        this.f48585f1 = true;
        this.f72454M0.setVisibility(0);
        m78542lM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CatalogContextMenuBottomSheetView";
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
        private final ZAppCompatImageView f48587p;

        /* renamed from: q */
        private final RobotoTextView f48588q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettingItemLayout(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
            this.f48587p = zAppCompatImageView;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context2);
            this.f48588q = robotoTextView;
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
        public final void m48605a(Drawable drawable, CharSequence charSequence) {
            AbstractC19074t.m100208f(charSequence, "titleText");
            this.f48587p.setImageDrawable(drawable);
            this.f48588q.setText(charSequence);
        }

        public final ZAppCompatImageView getIcon() {
            return this.f48587p;
        }

        public final RobotoTextView getTitle() {
            return this.f48588q;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettingItemLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(attributeSet, "attrs");
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
            this.f48587p = zAppCompatImageView;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context2);
            this.f48588q = robotoTextView;
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
