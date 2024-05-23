package com.zing.zalo.p077ui.backuprestore.syncpass;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import au.AbstractC2379w;
import b50.C2556d;
import c50.C3297h;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMessageForceSetPassView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ed0.AbstractC18391a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p320ld.AbstractC22429a;
import p348mi.AbstractC23306f;
import p649xl.C30021rd;
import si.C26263i;
import zl0.AbstractC32226c;
import zl0.AbstractC32234k;

/* loaded from: classes5.dex */
public class SyncMessageForceSetPassView extends SlidableZaloView implements InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: Q0 */
    private C30021rd f56031Q0;

    /* renamed from: S0 */
    private C8009j f56033S0;

    /* renamed from: T0 */
    private int f56034T0;

    /* renamed from: P0 */
    private final int f56030P0 = 1;

    /* renamed from: R0 */
    private final TextWatcher f56032R0 = new C11131a();

    /* renamed from: U0 */
    private boolean f56035U0 = false;

    /* renamed from: V0 */
    private boolean f56036V0 = false;

    /* renamed from: com.zing.zalo.ui.backuprestore.syncpass.SyncMessageForceSetPassView$a */
    /* loaded from: classes5.dex */
    class C11131a extends AbstractC18391a {
        C11131a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            SyncMessageForceSetPassView.this.m58284MM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public /* synthetic */ void m58272AM(View view, boolean z11) {
        m58279HM(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ void m58273BM(View view) {
        m58298sM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public /* synthetic */ void m58274CM(View view) {
        m58300uM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ void m58275DM(View view) {
        m58286gi();
        m58299tM();
        C0815e1.m2078H("6", this.f56034T0, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public /* synthetic */ void m58276EM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        C0815e1.m2078H("7", this.f56034T0, "");
    }

    /* renamed from: FM */
    private void m58277FM() {
        try {
            m58297rM();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: GM */
    private void m58278GM(boolean z11) {
        int i11;
        LinearLayout linearLayout = this.f56031Q0.f139253x;
        if (z11) {
            i11 = AbstractC16803z.edt_active;
        } else {
            i11 = AbstractC16803z.edt_normal;
        }
        linearLayout.setBackgroundResource(i11);
        if (z11) {
            this.f56031Q0.f139249t.setRightDrawable(null);
            this.f56031Q0.f139249t.setEnableClearText(true);
            this.f56031Q0.f139249t.setTag(Boolean.TRUE);
            if (this.f56031Q0.f139255z.getVisibility() == 0) {
                this.f56031Q0.f139255z.setVisibility(8);
                return;
            }
            return;
        }
        if (((Boolean) this.f56031Q0.f139249t.getTag()).booleanValue()) {
            if (!AbstractC22429a.m115863a(this.f56031Q0.f139249t.getText().toString())) {
                C30021rd c30021rd = this.f56031Q0;
                AbstractC23136l9.m118753u1(c30021rd.f139249t, c30021rd.f139255z);
                this.f56031Q0.f139242A.setVisibility(8);
            } else {
                C30021rd c30021rd2 = this.f56031Q0;
                AbstractC23136l9.m118756v1(c30021rd2.f139249t, c30021rd2.f139255z);
            }
        }
    }

    /* renamed from: HM */
    private void m58279HM(boolean z11) {
        int i11;
        CustomEditText customEditText = this.f56031Q0.f139250u;
        if (z11) {
            i11 = AbstractC16803z.edt_active;
        } else {
            i11 = AbstractC16803z.edt_normal;
        }
        customEditText.setBackgroundResource(i11);
        if (z11) {
            this.f56031Q0.f139250u.setEnableClearText(true);
            this.f56031Q0.f139250u.setTag(Boolean.TRUE);
            if (this.f56031Q0.f139242A.getVisibility() == 0) {
                this.f56031Q0.f139242A.setVisibility(8);
            }
        }
    }

    /* renamed from: IM */
    private void m58280IM() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f56036V0 = m92642L3.getBoolean("EXTRA_SYNC_AFTER_SET", false);
            int i11 = m92642L3.getInt("EXTRA_FROM_SYNC_ENTRY_POINT", -1);
            if (i11 == -1) {
                mo50035CK(0, null);
                finish();
            } else {
                this.f56034T0 = i11;
            }
        }
    }

    /* renamed from: JM */
    private void m58281JM() {
        if (AbstractC23306f.m120676j().m128427w() == 1) {
            this.f56031Q0.f139246q.setVisibility(0);
        } else {
            this.f56031Q0.f139246q.setVisibility(8);
        }
    }

    /* renamed from: KM */
    private void m58282KM(String str) {
        AbstractC23306f.m120668h().m132674O(str);
        AbstractC0924m0.m3641Zo(this.f56034T0);
        AbstractC0924m0.m3731cp(2);
        if (this.f56036V0) {
            C26263i.m135055u().m135085r0(10);
        }
        Intent intent = new Intent();
        intent.putExtra("return_setted_pass", true);
        mo50035CK(-1, intent);
        finish();
        C2556d.m12981o().m13007x(5);
    }

    /* renamed from: LM */
    private void m58283LM() {
        AbstractC0924m0.m3641Zo(0);
        AbstractC0924m0.m3731cp(1);
        if (this.f56036V0) {
            C26263i.m135055u().m135085r0(this.f56034T0);
        }
        mo50035CK(-1, null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public void m58284MM() {
        boolean z11;
        String obj = this.f56031Q0.f139249t.getText().toString();
        String obj2 = this.f56031Q0.f139250u.getText().toString();
        RobotoTextView robotoTextView = this.f56031Q0.f139247r;
        if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(obj2)) {
            z11 = true;
        } else {
            z11 = false;
        }
        robotoTextView.setEnabled(z11);
    }

    /* renamed from: gi */
    private void m58286gi() {
        AbstractC2379w.m12430d(this.f56031Q0.f139249t);
        AbstractC2379w.m12430d(this.f56031Q0.f139250u);
    }

    /* renamed from: pM */
    private void m58295pM(CustomEditText... customEditTextArr) {
        for (CustomEditText customEditText : customEditTextArr) {
            if (customEditText != null) {
                customEditText.removeTextChangedListener(this.f56032R0);
                customEditText.addTextChangedListener(this.f56032R0);
            }
        }
    }

    /* renamed from: qM */
    private boolean m58296qM(String str, String str2) {
        if (!AbstractC22429a.m115863a(str)) {
            C30021rd c30021rd = this.f56031Q0;
            AbstractC23136l9.m118753u1(c30021rd.f139249t, c30021rd.f139255z);
            this.f56031Q0.f139242A.setVisibility(8);
            return false;
        }
        C30021rd c30021rd2 = this.f56031Q0;
        AbstractC23136l9.m118756v1(c30021rd2.f139249t, c30021rd2.f139255z);
        if (!str.equals(str2)) {
            C30021rd c30021rd3 = this.f56031Q0;
            AbstractC23136l9.m118753u1(c30021rd3.f139250u, c30021rd3.f139242A);
            this.f56031Q0.f139247r.setEnabled(false);
            this.f56031Q0.f139255z.setVisibility(8);
            return false;
        }
        C30021rd c30021rd4 = this.f56031Q0;
        AbstractC23136l9.m118756v1(c30021rd4.f139250u, c30021rd4.f139242A);
        return true;
    }

    /* renamed from: rM */
    private void m58297rM() {
        C8009j c8009j = this.f56033S0;
        if (c8009j != null && c8009j.m92868m()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap(1);
        hashMap.put("id", Integer.valueOf(AbstractC8020f0.str_sync_force_pass_option_ignore_set_pass));
        hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_sync_force_pass_option_ignore_set_pass));
        arrayList.add(hashMap);
        final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.dialog_menu_item_set_pass, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sync_force_pass_other_options));
        aVar.m43173v(2);
        aVar.m43155d(true);
        aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: b50.o
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                SyncMessageForceSetPassView.this.m58302xM(simpleAdapter, interfaceC17463d, i11);
            }
        });
        aVar.m43167p(new InterfaceC17463d.c() { // from class: b50.p
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                SyncMessageForceSetPassView.this.m58303yM(interfaceC17463d);
            }
        });
        C8009j c8009j2 = this.f56033S0;
        if (c8009j2 == null || !c8009j2.m92868m()) {
            C8009j m43152a = aVar.m43152a();
            this.f56033S0 = m43152a;
            m43152a.mo13822K();
        }
    }

    /* renamed from: sM */
    private void m58298sM() {
        try {
            m58286gi();
            String obj = this.f56031Q0.f139249t.getText().toString();
            if (m58296qM(obj, this.f56031Q0.f139250u.getText().toString())) {
                this.f56031Q0.f139255z.setVisibility(8);
                this.f56031Q0.f139242A.setVisibility(8);
                m58282KM(obj);
            }
            C0815e1.m2078H("3", this.f56034T0, "");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: tM */
    private void m58299tM() {
        showDialog(1);
    }

    /* renamed from: uM */
    private void m58300uM() {
        boolean z11 = !this.f56035U0;
        this.f56035U0 = z11;
        if (z11) {
            this.f56031Q0.f139248s.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.startup_hide_password));
            AbstractC22429a.m115865c(this.f56031Q0.f139249t);
            AbstractC22429a.m115865c(this.f56031Q0.f139250u);
        } else {
            this.f56031Q0.f139248s.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.startup_show_password));
            AbstractC22429a.m115864b(this.f56031Q0.f139249t);
            AbstractC22429a.m115864b(this.f56031Q0.f139250u);
        }
    }

    /* renamed from: wM */
    private boolean m58301wM() {
        if (AbstractC23306f.m120676j().m128427w() == 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m58302xM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        if (((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue() == AbstractC8020f0.str_sync_force_pass_option_ignore_set_pass) {
            m58299tM();
            C0815e1.m2078H("6", this.f56034T0, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public /* synthetic */ void m58303yM(InterfaceC17463d interfaceC17463d) {
        C0815e1.m2078H("5", this.f56034T0, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public /* synthetic */ void m58304zM(View view, boolean z11) {
        m58278GM(z11);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f72421L0.m92637BK(true);
        m58280IM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(8);
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setup_backup_force_set_pass_warning_skip_title));
            aVar.m43173v(3);
            aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setup_backup_force_set_pass_warning_skip_desc));
            aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_back), new InterfaceC17463d.d() { // from class: b50.n
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    SyncMessageForceSetPassView.this.m58276EM(interfaceC17463d, i12);
                }
            });
            aVar.m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setup_backup_force_set_pass_warning_skip_action_skip), this);
            return aVar.m43152a();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        try {
            actionBarMenu.m92750r();
            if (m58301wM()) {
                actionBarMenu.m92738e(1, AbstractC16803z.stencils_ic_head_menu_white);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f56031Q0 = C30021rd.m148461c(layoutInflater, viewGroup, false);
        m58305vM();
        return this.f56031Q0.getRoot();
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 1 && i11 == -1) {
                interfaceC17463d.dismiss();
                m58283LM();
                C0815e1.m2078H("8", this.f56034T0, "");
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        m58280IM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 != 1) {
            if (i11 == 16908332) {
                m58286gi();
                C0815e1.m2078H("2", this.f56034T0, "");
            }
        } else {
            m58277FM();
            C0815e1.m2078H("4", this.f56034T0, "1");
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        C3297h.m16742n(this.f88760a0);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C8009j c8009j = this.f56033S0;
        if (c8009j != null && c8009j.m92868m()) {
            this.f56033S0.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            AbstractC2379w.m12432f(this.f56031Q0.f139249t);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SyncMessageForceSetPassView";
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m58286gi();
            C0815e1.m2078H("2", this.f56034T0, "");
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m58281JM();
        this.f72421L0.invalidateOptionsMenu();
    }

    /* renamed from: vM */
    void m58305vM() {
        C30021rd c30021rd = this.f56031Q0;
        m58295pM(c30021rd.f139249t, c30021rd.f139250u);
        AbstractC32234k.m155469a(this.f56031Q0.f139249t, AbstractC16803z.chat_bar_text_cursor);
        AbstractC32234k.m155469a(this.f56031Q0.f139250u, AbstractC16803z.chat_bar_text_cursor);
        this.f56031Q0.f139249t.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: b50.i
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                SyncMessageForceSetPassView.this.m58304zM(view, z11);
            }
        });
        this.f56031Q0.f139250u.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: b50.j
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                SyncMessageForceSetPassView.this.m58272AM(view, z11);
            }
        });
        this.f56031Q0.f139247r.setOnClickListener(new View.OnClickListener() { // from class: b50.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncMessageForceSetPassView.this.m58273BM(view);
            }
        });
        this.f56031Q0.f139248s.setOnClickListener(new View.OnClickListener() { // from class: b50.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncMessageForceSetPassView.this.m58274CM(view);
            }
        });
        this.f56031Q0.f139246q.setOnClickListener(new View.OnClickListener() { // from class: b50.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncMessageForceSetPassView.this.m58275DM(view);
            }
        });
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f56031Q0.f139252w.getLayoutParams();
            if (AbstractC32226c.m155415n(this.f72421L0.m92676n2())) {
                marginLayoutParams.topMargin = (AbstractC23136l9.m118655I(AbstractC16802y.backup_restore_margin_top_big) - AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_height)) - AbstractC32226c.m155411j(this.f72421L0.m92676n2()).top;
            } else {
                marginLayoutParams.topMargin = AbstractC23136l9.m118655I(AbstractC16802y.backup_restore_margin_top_big) - AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_height);
            }
            this.f56031Q0.f139252w.setLayoutParams(marginLayoutParams);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
