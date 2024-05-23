package com.zing.zalo.productcatalog.p068ui.zview;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.productcatalog.model.CatalogAddEditModel;
import com.zing.zalo.productcatalog.p068ui.zview.CatalogAddEditView;
import com.zing.zalo.productcatalog.utils.DeleteCatalogSource;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.TextField;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zdesign.component.inputfield.EditText;
import com.zing.zalo.zdesign.component.inputfield.EnumC17007i;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import ed0.AbstractC18391a;
import ed0.C18392b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import java.util.Arrays;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p115dy.C18076a;
import p227i3.C20215s;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p589vx.C28669n;
import p624wx.AbstractC29263f;
import p624wx.C29259b;
import p649xl.C29891k9;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public final class CatalogAddEditView extends SlidableZaloView {
    public static final C9066a Companion = new C9066a(null);

    /* renamed from: P0 */
    private C29891k9 f48565P0;

    /* renamed from: Q0 */
    private final InterfaceC24854k f48566Q0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C18076a.class), new C9071f(new C9070e(this)), C9072g.f48575q);

    /* renamed from: R0 */
    private final InterfaceC1764d0 f48567R0 = new InterfaceC1764d0() { // from class: ay.l
        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            CatalogAddEditView.m48577qM(CatalogAddEditView.this, (C29259b) obj);
        }
    };

    /* renamed from: S0 */
    private C29259b f48568S0;

    /* renamed from: T0 */
    private boolean f48569T0;

    /* renamed from: U0 */
    private C16972e0 f48570U0;

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogAddEditView$a */
    /* loaded from: classes4.dex */
    public static final class C9066a {
        private C9066a() {
        }

        public /* synthetic */ C9066a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogAddEditView$b */
    /* loaded from: classes4.dex */
    /* synthetic */ class C9067b extends C19071q implements InterfaceC18505l {
        C9067b(Object obj) {
            super(1, obj, CatalogAddEditView.class, "handleUiAction", "handleUiAction(Lcom/zing/zalo/productcatalog/viewmodel/CatalogAddEditViewModel$UiAction;)V", 0);
        }

        /* renamed from: h */
        public final void m48587h(C18076a.b bVar) {
            AbstractC19074t.m100208f(bVar, "p0");
            ((CatalogAddEditView) this.f94922q).m48581uM(bVar);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48587h((C18076a.b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogAddEditView$c */
    /* loaded from: classes4.dex */
    public static final class C9068c extends AbstractC18391a {
        C9068c() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AbstractC19074t.m100208f(editable, C20215s.f99966b);
            CatalogAddEditView.this.m48580tM().m96151e0(editable.toString());
            CatalogAddEditView.this.m48566IM();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogAddEditView$d */
    /* loaded from: classes4.dex */
    public static final class C9069d extends ZdsActionBar.AbstractC16987c {
        C9069d() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            CatalogAddEditView.this.m48559BM(true);
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogAddEditView$e */
    /* loaded from: classes4.dex */
    public static final class C9070e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f48573q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9070e(ZaloView zaloView) {
            super(0);
            this.f48573q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f48573q;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogAddEditView$f */
    /* loaded from: classes4.dex */
    public static final class C9071f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f48574q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9071f(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48574q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f48574q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogAddEditView$g */
    /* loaded from: classes4.dex */
    static final class C9072g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9072g f48575q = new C9072g();

        C9072g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C18076a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static final void m48558AM(CatalogAddEditView catalogAddEditView, View view) {
        AbstractC19074t.m100208f(catalogAddEditView, "this$0");
        C29259b c29259b = catalogAddEditView.f48568S0;
        if (c29259b == null) {
            return;
        }
        if (c29259b == null) {
            AbstractC19074t.m100223u("catalog");
            c29259b = null;
        }
        catalogAddEditView.m48583wM(c29259b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public final void m48559BM(boolean z11) {
        if (z11 && m48580tM().m96147Z()) {
            m48586zM();
        } else {
            m48579sM();
        }
    }

    /* renamed from: CM */
    static /* synthetic */ void m48560CM(CatalogAddEditView catalogAddEditView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        catalogAddEditView.m48559BM(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m48561DM(CatalogAddEditView catalogAddEditView, View view) {
        AbstractC19074t.m100208f(catalogAddEditView, "this$0");
        if (catalogAddEditView.m48582vM()) {
            catalogAddEditView.m48580tM().m96150c0();
        }
    }

    /* renamed from: EM */
    private final void m48562EM() {
        C23744a.Companion.m124119a().m124115b(this, 5300);
    }

    /* renamed from: FM */
    private final void m48563FM() {
        C23744a.Companion.m124119a().m124117e(this, 5300);
    }

    /* renamed from: GM */
    private final void m48564GM() {
        C29891k9 c29891k9 = null;
        if (m48580tM().m96149b0()) {
            C29891k9 c29891k92 = this.f48565P0;
            if (c29891k92 == null) {
                AbstractC19074t.m100223u("binding");
                c29891k92 = null;
            }
            c29891k92.f138483r.setFieldState(EnumC17007i.ERROR);
            C29891k9 c29891k93 = this.f48565P0;
            if (c29891k93 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29891k9 = c29891k93;
            }
            TextField textField = c29891k9.f138483r;
            String m92652XI = m92652XI(AbstractC8020f0.product_catalog_add_catalog_view_name_duplicated_hint);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            textField.setErrorText(m92652XI);
            m48580tM().m96153h0(m48580tM().m96145X());
            return;
        }
        C29891k9 c29891k94 = this.f48565P0;
        if (c29891k94 == null) {
            AbstractC19074t.m100223u("binding");
            c29891k94 = null;
        }
        c29891k94.f138483r.setFieldState(EnumC17007i.NORMAL);
        C29891k9 c29891k95 = this.f48565P0;
        if (c29891k95 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29891k9 = c29891k95;
        }
        c29891k9.f138483r.setErrorText("");
    }

    /* renamed from: HM */
    private final void m48565HM() {
        Button button;
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            button = m87077NK.getTrailingButton();
        } else {
            button = null;
        }
        if (button != null) {
            button.setEnabled(m48582vM());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public final void m48566IM() {
        m48565HM();
        m48564GM();
    }

    /* renamed from: pM */
    private final void m48576pM() {
        if (this.f48568S0 == null) {
            return;
        }
        C29891k9 c29891k9 = this.f48565P0;
        C29259b c29259b = null;
        if (c29891k9 == null) {
            AbstractC19074t.m100223u("binding");
            c29891k9 = null;
        }
        String valueOf = String.valueOf(c29891k9.f138483r.getEditText().getText());
        C29259b c29259b2 = this.f48568S0;
        if (c29259b2 == null) {
            AbstractC19074t.m100223u("catalog");
            c29259b2 = null;
        }
        if (!AbstractC19074t.m100204b(valueOf, c29259b2.m146160o())) {
            C29891k9 c29891k92 = this.f48565P0;
            if (c29891k92 == null) {
                AbstractC19074t.m100223u("binding");
                c29891k92 = null;
            }
            EditText editText = c29891k92.f138483r.getEditText();
            C29259b c29259b3 = this.f48568S0;
            if (c29259b3 == null) {
                AbstractC19074t.m100223u("catalog");
            } else {
                c29259b = c29259b3;
            }
            editText.setText(c29259b.m146160o());
        }
        m48566IM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public static final void m48577qM(CatalogAddEditView catalogAddEditView, C29259b c29259b) {
        AbstractC19074t.m100208f(catalogAddEditView, "this$0");
        AbstractC19074t.m100208f(c29259b, "catalog");
        catalogAddEditView.f48568S0 = c29259b;
        catalogAddEditView.m48576pM();
    }

    /* renamed from: rM */
    private final void m48578rM(C29259b c29259b) {
        m48580tM().m96141S(c29259b, DeleteCatalogSource.Unknown.f48756q);
    }

    /* renamed from: sM */
    private final void m48579sM() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public final C18076a m48580tM() {
        return (C18076a) this.f48566Q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public final void m48581uM(C18076a.b bVar) {
        if (AbstractC19074t.m100204b(bVar, C18076a.b.f.f91523a)) {
            mo46829Y();
            return;
        }
        if (AbstractC19074t.m100204b(bVar, C18076a.b.d.f91521a)) {
            mo49315c4();
            return;
        }
        if (AbstractC19074t.m100204b(bVar, C18076a.b.c.f91520a)) {
            ToastUtils.m89266n(AbstractC8020f0.product_catalog_toast_catalog_edited, new Object[0]);
            m48560CM(this, false, 1, null);
            return;
        }
        if (AbstractC19074t.m100204b(bVar, C18076a.b.a.f91518a)) {
            ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.product_catalog_toast_catalog_added), true, false, 0, AbstractC7409c0.photo_sent_toast_layout);
            m48560CM(this, false, 1, null);
        } else if (AbstractC19074t.m100204b(bVar, C18076a.b.C32808b.f91519a)) {
            ToastUtils.m89266n(AbstractC8020f0.product_catalog_toast_catalog_deleted, new Object[0]);
            m48560CM(this, false, 1, null);
        } else if (bVar instanceof C18076a.b.g) {
            ToastUtils.showMess(((C18076a.b.g) bVar).m96155a());
        } else if (bVar instanceof C18076a.b.e) {
            finish();
        }
    }

    /* renamed from: vM */
    private final boolean m48582vM() {
        return m48580tM().m96138P();
    }

    /* renamed from: wM */
    private final void m48583wM(final C29259b c29259b) {
        if (!m48580tM().m96137O(c29259b)) {
            ToastUtils.showMess(m92651WI().getString(AbstractC8020f0.product_catalog_toast_keep_at_least_one_catalog));
            return;
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        C16972e0 c16972e0 = this.f48570U0;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
        C16972e0.a aVar = new C16972e0.a(context);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90931h("CatalogAddEditView-ConfirmDelete");
        String string = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_this_catalog_title);
        AbstractC19074t.m100207e(string, "getString(...)");
        aVar.m90949z(string);
        aVar.m90921E(true);
        aVar.m90947x("CatalogAddEditView-ConfirmDelete-Positive");
        String string2 = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_btn_confirm);
        AbstractC19074t.m100207e(string2, "getString(...)");
        aVar.m90943t(string2, new InterfaceC17463d.d() { // from class: ay.n
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                CatalogAddEditView.m48584xM(CatalogAddEditView.this, c29259b, interfaceC17463d, i11);
            }
        });
        aVar.m90937n("CatalogAddEditView-ConfirmDelete-Negative");
        String string3 = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_btn_cancel);
        AbstractC19074t.m100207e(string3, "getString(...)");
        aVar.m90934k(string3, new InterfaceC17463d.d() { // from class: ay.o
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                CatalogAddEditView.m48585yM(interfaceC17463d, i11);
            }
        });
        this.f48570U0 = aVar.m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m48584xM(CatalogAddEditView catalogAddEditView, C29259b c29259b, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(catalogAddEditView, "this$0");
        AbstractC19074t.m100208f(c29259b, "$catalog");
        catalogAddEditView.m48578rM(c29259b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m48585yM(InterfaceC17463d interfaceC17463d, int i11) {
    }

    /* renamed from: zM */
    private final void m48586zM() {
        m48579sM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        Parcelable parcelable;
        Object obj;
        super.mo37111CJ(bundle);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(18);
        }
        Bundle m92642L3 = m92642L3();
        CatalogAddEditModel catalogAddEditModel = null;
        if (m92642L3 != null) {
            obj = m92642L3.getParcelable("EXTRA_EDITING_CATALOG");
            parcelable = m92642L3.getParcelable("EXTRA_TRACKING_SOURCE");
        } else {
            parcelable = null;
            obj = null;
        }
        if (bundle != null) {
            catalogAddEditModel = (CatalogAddEditModel) bundle.getParcelable("SAVE_EXTRA_USER_INPUTTED_CATALOG");
        }
        m48580tM().m96148a0((CatalogAddEditModel) obj, catalogAddEditModel, parcelable);
        m48580tM().m96152f0(new C9067b(this));
        m48580tM().m96144V().m9219j(this, this.f48567R0);
        m48562EM();
        if (obj != null) {
            this.f48569T0 = true;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        int i11 = 0;
        C29891k9 m148165c = C29891k9.m148165c(LayoutInflater.from(getContext()), viewGroup, false);
        AbstractC19074t.m100207e(m148165c, "inflate(...)");
        this.f48565P0 = m148165c;
        int m146126a = C28669n.Companion.m143559a().m143541Q().m146126a();
        C29891k9 c29891k9 = this.f48565P0;
        C29891k9 c29891k92 = null;
        if (c29891k9 == null) {
            AbstractC19074t.m100223u("binding");
            c29891k9 = null;
        }
        c29891k9.f138483r.m91046E(true);
        C29891k9 c29891k93 = this.f48565P0;
        if (c29891k93 == null) {
            AbstractC19074t.m100223u("binding");
            c29891k93 = null;
        }
        EditText editText = c29891k93.f138483r.getEditText();
        editText.setTextColor(C23212s8.m119607o(editText.getContext(), AbstractC2807a.text_01));
        String string = editText.getResources().getString(AbstractC8020f0.product_catalog_toast_catalog_name_exceeds_limit, Integer.valueOf(m146126a));
        AbstractC19074t.m100207e(string, "getString(...)");
        editText.setFilters(new InputFilter[]{new C18392b(m146126a, string)});
        editText.addTextChangedListener(new C9068c());
        C29891k9 c29891k94 = this.f48565P0;
        if (c29891k94 == null) {
            AbstractC19074t.m100223u("binding");
            c29891k94 = null;
        }
        RobotoTextView robotoTextView = c29891k94.f138482q;
        if (!this.f48569T0) {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        C29891k9 c29891k95 = this.f48565P0;
        if (c29891k95 == null) {
            AbstractC19074t.m100223u("binding");
            c29891k95 = null;
        }
        c29891k95.f138482q.setOnClickListener(new View.OnClickListener() { // from class: ay.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogAddEditView.m48558AM(CatalogAddEditView.this, view);
            }
        });
        C29891k9 c29891k96 = this.f48565P0;
        if (c29891k96 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29891k92 = c29891k96;
        }
        RelativeLayout root = c29891k92.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        m48580tM().m96152f0(null);
        m48580tM().m96144V().mo9222o(this.f48567R0);
        C16972e0 c16972e0 = this.f48570U0;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
        m48563FM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        int i11;
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            if (this.f48569T0) {
                i11 = AbstractC8020f0.product_catalog_edit_catalog_view_title;
            } else {
                i11 = AbstractC8020f0.product_catalog_add_catalog_view_title;
            }
            String m92652XI = m92652XI(i11);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            m87077NK.setMiddleTitle(m92652XI);
            m87077NK.setLeadingFunctionCallback(new C9069d());
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: ay.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CatalogAddEditView.m48561DM(CatalogAddEditView.this, view);
                }
            });
        }
        m48565HM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C29891k9 c29891k9 = this.f48565P0;
        if (c29891k9 == null) {
            AbstractC19074t.m100223u("binding");
            c29891k9 = null;
        }
        AbstractC2379w.m12430d(c29891k9.f138483r.getEditText());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putParcelable("SAVE_EXTRA_USER_INPUTTED_CATALOG", m48580tM().m96143U());
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CatalogCreatingView";
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m48559BM(true);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC29263f abstractC29263f;
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
            m48580tM().m96146Y(abstractC29263f);
            return;
        }
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
    }
}
