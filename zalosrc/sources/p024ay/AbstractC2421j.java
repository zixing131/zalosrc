package p024ay;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import androidx.lifecycle.InterfaceC1764d0;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.productcatalog.model.CatalogAddEditModel;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ButtonWithProgress;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.TextField;
import com.zing.zalo.zdesign.component.inputfield.EditText;
import com.zing.zalo.zdesign.component.inputfield.EnumC17007i;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import ed0.AbstractC18391a;
import ed0.C18392b;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p115dy.C18076a;
import p227i3.C20215s;
import p589vx.C28669n;
import p624wx.C29259b;
import p649xl.C29873j9;
import pm0.C24848g0;

/* renamed from: ay.j */
/* loaded from: classes4.dex */
public abstract class AbstractC2421j {

    /* renamed from: ay.j$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ CommonZaloview f10007q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CommonZaloview commonZaloview) {
            super(1);
            this.f10007q = commonZaloview;
        }

        /* renamed from: a */
        public final void m12479a(C18076a.b bVar) {
            AbstractC19074t.m100208f(bVar, "uiAction");
            if (AbstractC19074t.m100204b(bVar, C18076a.b.f.f91523a)) {
                if (this.f10007q.m92672lJ()) {
                    this.f10007q.mo46829Y();
                    return;
                }
                return;
            }
            if (AbstractC19074t.m100204b(bVar, C18076a.b.d.f91521a)) {
                if (this.f10007q.m92672lJ()) {
                    this.f10007q.mo49315c4();
                    return;
                }
                return;
            }
            if (AbstractC19074t.m100204b(bVar, C18076a.b.c.f91520a)) {
                if (this.f10007q.m92672lJ()) {
                    ToastUtils.m89266n(AbstractC8020f0.product_catalog_toast_catalog_edited, new Object[0]);
                }
            } else {
                if (AbstractC19074t.m100204b(bVar, C18076a.b.a.f91518a)) {
                    if (this.f10007q.m92672lJ()) {
                        ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.product_catalog_toast_catalog_added), true, false, 0, AbstractC7409c0.photo_sent_toast_layout);
                        this.f10007q.mo49315c4();
                        return;
                    }
                    return;
                }
                if ((bVar instanceof C18076a.b.g) && this.f10007q.m92672lJ()) {
                    ToastUtils.showMess(((C18076a.b.g) bVar).m96155a());
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m12479a((C18076a.b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ay.j$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC18391a {

        /* renamed from: p */
        final /* synthetic */ C18076a f10008p;

        /* renamed from: q */
        final /* synthetic */ C16972e0 f10009q;

        /* renamed from: r */
        final /* synthetic */ CatalogAddEditModel f10010r;

        /* renamed from: s */
        final /* synthetic */ TextField f10011s;

        /* renamed from: t */
        final /* synthetic */ Context f10012t;

        /* renamed from: u */
        final /* synthetic */ Resources f10013u;

        b(C18076a c18076a, C16972e0 c16972e0, CatalogAddEditModel catalogAddEditModel, TextField textField, Context context, Resources resources) {
            this.f10008p = c18076a;
            this.f10009q = c16972e0;
            this.f10010r = catalogAddEditModel;
            this.f10011s = textField;
            this.f10012t = context;
            this.f10013u = resources;
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Button button;
            CatalogAddEditModel catalogAddEditModel;
            AbstractC19074t.m100208f(editable, C20215s.f99966b);
            this.f10008p.m96151e0(editable.toString());
            ButtonWithProgress m90915L = this.f10009q.m90915L(-1);
            if (m90915L != null) {
                button = m90915L.getButton();
            } else {
                button = null;
            }
            if (button != null) {
                button.setEnabled(this.f10008p.m96138P());
            }
            if (this.f10008p.m96149b0() && ((catalogAddEditModel = this.f10010r) == null || !AbstractC19074t.m100204b(catalogAddEditModel.m48471b(), this.f10008p.m96145X()))) {
                this.f10011s.setFieldState(EnumC17007i.NORMAL);
                TextField textField = this.f10011s;
                Context context = this.f10012t;
                String string = this.f10013u.getString(AbstractC8020f0.product_catalog_add_catalog_view_name_duplicated_hint);
                AbstractC19074t.m100207e(string, "getString(...)");
                textField.setHelperText(AbstractC9183a.m49000h(context, string, AbstractC23322a.zds_ic_info_circle_solid_16));
                C18076a c18076a = this.f10008p;
                c18076a.m96153h0(c18076a.m96145X());
                return;
            }
            this.f10011s.setFieldState(EnumC17007i.NORMAL);
            this.f10011s.setHelperText("");
        }
    }

    /* renamed from: j */
    public static final void m12467j(CommonZaloview commonZaloview, C18076a c18076a) {
        AbstractC19074t.m100208f(commonZaloview, "zaloView");
        AbstractC19074t.m100208f(c18076a, "catalogAddEditViewModel");
        c18076a.m96152f0(null);
        c18076a.m96144V().m9223p(commonZaloview);
    }

    /* renamed from: k */
    public static final List m12468k(CommonZaloview commonZaloview, C18076a c18076a, CatalogAddEditModel catalogAddEditModel, Parcelable parcelable) {
        boolean z11;
        String string;
        AbstractC19074t.m100208f(commonZaloview, "zaloView");
        AbstractC19074t.m100208f(c18076a, "catalogAddEditViewModel");
        ArrayList arrayList = new ArrayList();
        c18076a.m96140R();
        Context context = commonZaloview.getContext();
        AbstractC19074t.m100205c(context);
        int m146126a = C28669n.Companion.m143559a().m143541Q().m146126a();
        TextField textField = C29873j9.m148121c(LayoutInflater.from(context)).f138293q;
        AbstractC19074t.m100207e(textField, "catalogNameTextField");
        if (catalogAddEditModel != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        EditText editText = textField.getEditText();
        editText.setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_01));
        String string2 = editText.getResources().getString(AbstractC8020f0.product_catalog_toast_catalog_name_exceeds_limit, Integer.valueOf(m146126a));
        AbstractC19074t.m100207e(string2, "getString(...)");
        editText.setFilters(new InputFilter[]{new C18392b(m146126a, string2)});
        if (catalogAddEditModel != null) {
            editText.setText(catalogAddEditModel.m48471b());
        }
        c18076a.m96148a0(catalogAddEditModel, null, parcelable);
        c18076a.m96144V().m9219j(commonZaloview, new InterfaceC1764d0() { // from class: ay.a
            public /* synthetic */ C2394a() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                AbstractC2421j.m12469l(TextField.this, (C29259b) obj);
            }
        });
        c18076a.m96152f0(new a(commonZaloview));
        Resources resources = context.getResources();
        C16972e0.a aVar = new C16972e0.a(context);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90931h("CatalogAddEditView");
        if (z11) {
            aVar.m90917A(AbstractC8020f0.product_catalog_edit_catalog_view_title);
        } else {
            aVar.m90917A(AbstractC8020f0.product_catalog_add_catalog_view_title);
        }
        aVar.m90926c(textField);
        aVar.m90928e(false);
        aVar.m90947x("CatalogAddEditView-Save");
        if (z11) {
            string = resources.getString(AbstractC8020f0.product_catalog_add_catalog_view_btn_save_edit);
        } else {
            string = resources.getString(AbstractC8020f0.product_catalog_add_catalog_view_btn_save);
        }
        AbstractC19074t.m100205c(string);
        aVar.m90943t(string, new InterfaceC17463d.d() { // from class: ay.b

            /* renamed from: q */
            public final /* synthetic */ C18076a f9972q;

            /* renamed from: r */
            public final /* synthetic */ List f9973r;

            public /* synthetic */ C2397b(C18076a c18076a2, List arrayList2) {
                r2 = c18076a2;
                r3 = arrayList2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                AbstractC2421j.m12472o(TextField.this, r2, r3, interfaceC17463d, i11);
            }
        });
        aVar.m90937n("CatalogAddEditView-Cancel");
        String string3 = resources.getString(AbstractC8020f0.product_catalog_add_catalog_view_btn_cancel);
        AbstractC19074t.m100207e(string3, "getString(...)");
        aVar.m90934k(string3, new InterfaceC17463d.d() { // from class: ay.c

            /* renamed from: q */
            public final /* synthetic */ boolean f9977q;

            /* renamed from: r */
            public final /* synthetic */ CatalogAddEditModel f9978r;

            /* renamed from: s */
            public final /* synthetic */ List f9979s;

            /* renamed from: t */
            public final /* synthetic */ Context f9980t;

            public /* synthetic */ C2400c(boolean z112, CatalogAddEditModel catalogAddEditModel2, List arrayList2, Context context2) {
                r2 = z112;
                r3 = catalogAddEditModel2;
                r4 = arrayList2;
                r5 = context2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                AbstractC2421j.m12473p(TextField.this, r2, r3, r4, r5, interfaceC17463d, i11);
            }
        });
        C16972e0 m90927d = aVar.m90927d();
        textField.getEditText().addTextChangedListener(new b(c18076a2, m90927d, catalogAddEditModel2, textField, context2, resources));
        m90927d.mo88280H(new InterfaceC17463d.g() { // from class: ay.d

            /* renamed from: b */
            public final /* synthetic */ C18076a f9984b;

            /* renamed from: c */
            public final /* synthetic */ TextField f9985c;

            public /* synthetic */ C2403d(C18076a c18076a2, TextField textField2) {
                r2 = c18076a2;
                r3 = textField2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.g
            /* renamed from: a */
            public final void mo12456a(InterfaceC17463d interfaceC17463d) {
                AbstractC2421j.m12474q(C16972e0.this, r2, r3, interfaceC17463d);
            }
        });
        m90927d.m92855F(new InterfaceC17463d.e() { // from class: ay.e
            public /* synthetic */ C2406e() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
            /* renamed from: Tv */
            public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                AbstractC2421j.m12470m(TextField.this, interfaceC17463d);
            }
        });
        m90927d.mo13822K();
        arrayList2.add(m90927d);
        return arrayList2;
    }

    /* renamed from: l */
    public static final void m12469l(TextField textField, C29259b c29259b) {
        AbstractC19074t.m100208f(textField, "$catalogNameTextField");
        AbstractC19074t.m100208f(c29259b, "catalog");
        if (!AbstractC19074t.m100204b(String.valueOf(textField.getEditText().getText()), c29259b.m146160o())) {
            textField.getEditText().setText(c29259b.m146160o());
        }
    }

    /* renamed from: m */
    public static final void m12470m(TextField textField, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(textField, "$catalogNameTextField");
        AbstractC19444a.m101694b(new Runnable() { // from class: ay.f
            public /* synthetic */ RunnableC2409f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2421j.m12471n(TextField.this);
            }
        }, 200L);
    }

    /* renamed from: n */
    public static final void m12471n(TextField textField) {
        AbstractC19074t.m100208f(textField, "$catalogNameTextField");
        AbstractC2379w.m12430d(textField.getEditText());
    }

    /* renamed from: o */
    public static final void m12472o(TextField textField, C18076a c18076a, List list, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(textField, "$catalogNameTextField");
        AbstractC19074t.m100208f(c18076a, "$catalogAddEditViewModel");
        AbstractC19074t.m100208f(list, "$modals");
        if (String.valueOf(textField.getEditText().getText()).length() == 0) {
            return;
        }
        c18076a.m96150c0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C16972e0) it.next()).dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:            if (r0.length() > 0) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:            if (android.text.TextUtils.equals(r0, r2.m48471b()) == false) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:            m12476s(r1, r3, r4);     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12473p(TextField textField, boolean z11, CatalogAddEditModel catalogAddEditModel, List list, Context context, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(textField, "$catalogNameTextField");
        AbstractC19074t.m100208f(list, "$modals");
        AbstractC19074t.m100208f(context, "$context");
        CharSequence text = textField.getEditText().getText();
        if (text == null) {
            text = "";
        }
        if (z11) {
            if (text.length() > 0) {
                AbstractC19074t.m100205c(catalogAddEditModel);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C16972e0) it.next()).dismiss();
            }
        }
    }

    /* renamed from: q */
    public static final void m12474q(C16972e0 c16972e0, C18076a c18076a, TextField textField, InterfaceC17463d interfaceC17463d) {
        Button button;
        AbstractC19074t.m100208f(c16972e0, "$modal");
        AbstractC19074t.m100208f(c18076a, "$catalogAddEditViewModel");
        AbstractC19074t.m100208f(textField, "$catalogNameTextField");
        ButtonWithProgress m90915L = c16972e0.m90915L(-1);
        if (m90915L != null) {
            button = m90915L.getButton();
        } else {
            button = null;
        }
        if (button != null) {
            button.setEnabled(c18076a.m96138P());
        }
        AbstractC19444a.m101694b(new Runnable() { // from class: ay.g
            public /* synthetic */ RunnableC2412g() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2421j.m12475r(TextField.this);
            }
        }, 200L);
    }

    /* renamed from: r */
    public static final void m12475r(TextField textField) {
        AbstractC19074t.m100208f(textField, "$catalogNameTextField");
        textField.getEditText().setSelection(String.valueOf(textField.getEditText().getText()).length());
        textField.getEditText().requestFocus();
        AbstractC2379w.m12432f(textField.getEditText());
    }

    /* renamed from: s */
    private static final void m12476s(boolean z11, List list, Context context) {
        C16972e0.a aVar = new C16972e0.a(context);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90931h("CatalogAddEditView-ConfirmExit");
        if (z11) {
            String string = context.getResources().getString(AbstractC8020f0.product_catalog_edit_catalog_confirm_exit_msg);
            AbstractC19074t.m100207e(string, "getString(...)");
            aVar.m90949z(string);
        } else {
            String string2 = context.getResources().getString(AbstractC8020f0.product_catalog_add_catalog_confirm_exit_msg);
            AbstractC19074t.m100207e(string2, "getString(...)");
            aVar.m90949z(string2);
        }
        aVar.m90921E(true);
        aVar.m90947x("CatalogAddEditView-ConfirmExit-Positive");
        String string3 = context.getResources().getString(AbstractC8020f0.product_catalog_add_view_confirm_exit_btn_exit);
        AbstractC19074t.m100207e(string3, "getString(...)");
        aVar.m90943t(string3, new InterfaceC17463d.d() { // from class: ay.h

            /* renamed from: p */
            public final /* synthetic */ List f10002p;

            public /* synthetic */ C2415h(List list2) {
                r1 = list2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                AbstractC2421j.m12477t(r1, interfaceC17463d, i11);
            }
        });
        aVar.m90937n("CatalogAddEditView-ConfirmExit-Negative");
        String string4 = context.getResources().getString(AbstractC8020f0.product_catalog_add_view_confirm_exit_btn_stay);
        AbstractC19074t.m100207e(string4, "getString(...)");
        aVar.m90934k(string4, new InterfaceC17463d.d() { // from class: ay.i
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                AbstractC2421j.m12478u(interfaceC17463d, i11);
            }
        });
        C16972e0 m90927d = aVar.m90927d();
        m90927d.mo13822K();
        list2.add(m90927d);
    }

    /* renamed from: t */
    public static final void m12477t(List list, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(list, "$modals");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C16972e0) it.next()).dismiss();
        }
    }

    /* renamed from: u */
    public static final void m12478u(InterfaceC17463d interfaceC17463d, int i11) {
    }
}
