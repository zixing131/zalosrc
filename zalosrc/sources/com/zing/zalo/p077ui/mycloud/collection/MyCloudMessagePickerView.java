package com.zing.zalo.p077ui.mycloud.collection;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC1801w;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.mycloud.ScrollableTabViewLayout;
import com.zing.zalo.p077ui.mycloud.collection.InterfaceC12558e;
import com.zing.zalo.p077ui.mycloud.collection.MyCloudMessagePickerView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import ed0.AbstractC18391a;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kw.C21955a;
import kw.C21956b;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mw.EnumC23460e;
import p227i3.C20215s;
import p262jb.AbstractC21196a;
import p279jw.C21373a;
import p649xl.C30067u8;
import p90.InterfaceC24697q;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import q90.C25199b;
import ui0.C27280g;
import x80.C29480c0;
import x80.InterfaceC29509z;

/* loaded from: classes6.dex */
public final class MyCloudMessagePickerView extends BaseZaloView implements InterfaceC29509z {
    public static final C12545a Companion = new C12545a(null);

    /* renamed from: M0 */
    private C30067u8 f65541M0;

    /* renamed from: N0 */
    private C25199b f65542N0;

    /* renamed from: O0 */
    private InterfaceC12558e f65543O0;

    /* renamed from: P0 */
    private C12557d f65544P0;

    /* renamed from: Q0 */
    private final InterfaceC24854k f65545Q0;

    /* renamed from: R0 */
    private Button f65546R0;

    /* renamed from: S0 */
    private final C12548d f65547S0;

    /* renamed from: com.zing.zalo.ui.mycloud.collection.MyCloudMessagePickerView$a */
    /* loaded from: classes6.dex */
    public static final class C12545a {
        private C12545a() {
        }

        public /* synthetic */ C12545a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.MyCloudMessagePickerView$b */
    /* loaded from: classes6.dex */
    public static final class C12546b implements ScrollableTabViewLayout.InterfaceC12502b {
        C12546b() {
        }

        @Override // com.zing.zalo.p077ui.mycloud.ScrollableTabViewLayout.InterfaceC12502b
        /* renamed from: a */
        public void mo70203a(int i11, String str) {
            AbstractC19074t.m100208f(str, "tabId");
            MyCloudMessagePickerView.this.m70694mM(i11, EnumC23460e.valueOf(str));
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.MyCloudMessagePickerView$c */
    /* loaded from: classes6.dex */
    static final class C12547c extends AbstractC19075u implements InterfaceC18494a {
        C12547c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScrollableTabViewLayout mo12V4() {
            Context context = MyCloudMessagePickerView.this.getContext();
            AbstractC19074t.m100205c(context);
            return new ScrollableTabViewLayout(context);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.MyCloudMessagePickerView$d */
    /* loaded from: classes6.dex */
    public static final class C12548d extends AbstractC18391a {
        C12548d() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(charSequence, C20215s.f99966b);
            InterfaceC12558e interfaceC12558e = MyCloudMessagePickerView.this.f65543O0;
            if (interfaceC12558e == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC12558e = null;
            }
            InterfaceC12558e.a.m70748a(interfaceC12558e, charSequence, false, 2, null);
        }
    }

    public MyCloudMessagePickerView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C12547c());
        this.f65545Q0 = m129210a;
        this.f65547S0 = new C12548d();
    }

    /* renamed from: iM */
    private final ScrollableTabViewLayout m70690iM() {
        return (ScrollableTabViewLayout) this.f65545Q0.getValue();
    }

    /* renamed from: jM */
    private final void m70691jM() {
        ScrollableTabViewLayout m70690iM = m70690iM();
        InterfaceC12558e interfaceC12558e = this.f65543O0;
        InterfaceC12558e interfaceC12558e2 = interfaceC12558e;
        if (interfaceC12558e == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12558e2 = null;
        }
        m70690iM.setTabList(interfaceC12558e2.mo70745cn());
        m70690iM().setListener(new C12546b());
        m70697pM();
    }

    /* renamed from: kM */
    private final void m70692kM() {
        m70691jM();
        C17487o0 m92649TI = m92649TI();
        InterfaceC12558e interfaceC12558e = this.f65543O0;
        C30067u8 c30067u8 = null;
        if (interfaceC12558e == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12558e = null;
        }
        C25199b c25199b = new C25199b(m92649TI, "204278670", interfaceC12558e.mo70744a0());
        c25199b.m130439F(0);
        InterfaceC12558e interfaceC12558e2 = this.f65543O0;
        if (interfaceC12558e2 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12558e2 = null;
        }
        c25199b.m130438E(interfaceC12558e2.mo70747e1());
        InterfaceC12558e interfaceC12558e3 = this.f65543O0;
        if (interfaceC12558e3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12558e3 = null;
        }
        c25199b.m130440G(interfaceC12558e3.mo70743Wm());
        this.f65542N0 = c25199b;
        C30067u8 c30067u82 = this.f65541M0;
        if (c30067u82 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30067u82 = null;
        }
        c30067u82.f139569s.setAdapter(this.f65542N0);
        C30067u8 c30067u83 = this.f65541M0;
        if (c30067u83 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30067u83 = null;
        }
        c30067u83.f139569s.setOffscreenPageLimit(4);
        C30067u8 c30067u84 = this.f65541M0;
        if (c30067u84 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30067u84 = null;
        }
        c30067u84.f139569s.setSwipeEnabled(false);
        C30067u8 c30067u85 = this.f65541M0;
        if (c30067u85 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c30067u8 = c30067u85;
        }
        c30067u8.f139567q.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: x80.f0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m70693lM;
                m70693lM = MyCloudMessagePickerView.m70693lM(MyCloudMessagePickerView.this, textView, i11, keyEvent);
                return m70693lM;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final boolean m70693lM(MyCloudMessagePickerView myCloudMessagePickerView, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(myCloudMessagePickerView, "this$0");
        if (i11 != 3) {
            return false;
        }
        InterfaceC12558e interfaceC12558e = myCloudMessagePickerView.f65543O0;
        C30067u8 c30067u8 = null;
        if (interfaceC12558e == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12558e = null;
        }
        C30067u8 c30067u82 = myCloudMessagePickerView.f65541M0;
        if (c30067u82 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30067u82 = null;
        }
        interfaceC12558e.mo70746da(String.valueOf(c30067u82.f139567q.getText()), false);
        C30067u8 c30067u83 = myCloudMessagePickerView.f65541M0;
        if (c30067u83 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c30067u8 = c30067u83;
        }
        AbstractC2379w.m12430d(c30067u8.f139567q);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public final void m70694mM(int i11, EnumC23460e enumC23460e) {
        m70690iM().m70266c(enumC23460e.m123172c());
        C25199b c25199b = this.f65542N0;
        if (c25199b != null) {
            c25199b.m130439F(i11);
        }
        C30067u8 c30067u8 = this.f65541M0;
        if (c30067u8 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30067u8 = null;
        }
        c30067u8.f139569s.setCurrentItem(i11);
        C25199b c25199b2 = this.f65542N0;
        if (c25199b2 != null) {
            C30067u8 c30067u82 = this.f65541M0;
            if (c30067u82 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c30067u82 = null;
            }
            c25199b2.m130437C(c30067u82.f139569s.getCurrentItem());
            int mo35335g = c25199b2.mo35335g();
            for (int i12 = 0; i12 < mo35335g; i12++) {
                InterfaceC1801w m93128x = c25199b2.m93128x(i12);
                if (m93128x instanceof InterfaceC24697q) {
                    C30067u8 c30067u83 = this.f65541M0;
                    if (c30067u83 == null) {
                        AbstractC19074t.m100223u("viewBinding");
                        c30067u83 = null;
                    }
                    if (i12 == c30067u83.f139569s.getCurrentItem()) {
                        ((InterfaceC24697q) m93128x).mo72572W3();
                    } else {
                        ((InterfaceC24697q) m93128x).mo72573Y2();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public static final void m70695nM(MyCloudMessagePickerView myCloudMessagePickerView) {
        AbstractC19074t.m100208f(myCloudMessagePickerView, "this$0");
        C30067u8 c30067u8 = myCloudMessagePickerView.f65541M0;
        if (c30067u8 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30067u8 = null;
        }
        AbstractC2379w.m12430d(c30067u8.f139567q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static final void m70696oM(MyCloudMessagePickerView myCloudMessagePickerView) {
        AbstractC19074t.m100208f(myCloudMessagePickerView, "this$0");
        C30067u8 c30067u8 = myCloudMessagePickerView.f65541M0;
        if (c30067u8 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30067u8 = null;
        }
        CustomEditText customEditText = c30067u8.f139567q;
        customEditText.requestFocus();
        AbstractC2379w.m12430d(customEditText);
    }

    /* renamed from: pM */
    private final void m70697pM() {
        m70694mM(0, EnumC23460e.f113955q);
    }

    /* renamed from: qM */
    private final void m70698qM() {
        boolean z11;
        InterfaceC12558e interfaceC12558e = this.f65543O0;
        if (interfaceC12558e == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC12558e = null;
        }
        if (interfaceC12558e.mo70742N1().size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Button button = this.f65546R0;
        if (button != null) {
            if (z11) {
                button.setTextColor(AbstractC23136l9.m118641B(button.getContext(), AbstractC2808b.f150821b60));
            } else {
                button.setTextColor(C23212s8.m119607o(button.getContext(), AbstractC2807a.text_03));
            }
            button.setEnabled(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f65543O0 = new C29480c0(this);
        C12557d m70740a = C12557d.Companion.m70740a(m92642L3());
        this.f65544P0 = m70740a;
        C21955a c21955a = C21955a.f108070a;
        if (m70740a == null) {
            AbstractC19074t.m100223u("args");
            m70740a = null;
        }
        c21955a.m114645l(m70740a.m70737b());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        actionBarMenu.m92750r();
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C13718q1.m76694c(m92689tK, 7);
        int i11 = AbstractC8020f0.str_add;
        View m92744k = actionBarMenu.m92744k(1, AbstractC7409c0.action_bar_menu_item_blue_text_only);
        AbstractC19074t.m100206d(m92744k, "null cannot be cast to non-null type android.widget.Button");
        Button button = (Button) m92744k;
        button.setText(m92652XI(i11));
        button.setTextSize(15.0f);
        this.f65546R0 = button;
        m70698qM();
        super.mo37482FJ(actionBarMenu);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30067u8 m148575c = C30067u8.m148575c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148575c, "inflate(...)");
        this.f65541M0 = m148575c;
        C30067u8 c30067u8 = null;
        if (m148575c == null) {
            AbstractC19074t.m100223u("viewBinding");
            m148575c = null;
        }
        m148575c.f139568r.addView(m70690iM());
        C30067u8 c30067u82 = this.f65541M0;
        if (c30067u82 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30067u82 = null;
        }
        CustomEditText customEditText = c30067u82.f139567q;
        if (C23212s8.m119603k()) {
            i11 = AbstractC2808b.light_icon_01;
        } else {
            i11 = AbstractC2808b.dark_icon_01;
        }
        customEditText.f83177K = true;
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        customEditText.setCompoundDrawables(C27280g.m139659b(context, AbstractC23322a.zds_ic_search_line_24, i11), null, null, null);
        Context context2 = getContext();
        AbstractC19074t.m100205c(context2);
        customEditText.setClearDrawable(C27280g.m139659b(context2, AbstractC23322a.zds_ic_close_circle_solid_16, i11));
        customEditText.addTextChangedListener(this.f65547S0);
        m92637BK(true);
        C30067u8 c30067u83 = this.f65541M0;
        if (c30067u83 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c30067u8 = c30067u83;
        }
        LinearLayout root = c30067u8.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // x80.InterfaceC29509z
    /* renamed from: I4 */
    public void mo70699I4(int i11, String str, boolean z11) {
        int i12;
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            if (i11 > 1) {
                i12 = AbstractC8020f0.str_multi_selection_count;
            } else {
                i12 = AbstractC8020f0.str_multi_selection_singular_count;
            }
            String m118746s0 = AbstractC23136l9.m118746s0(i12, Integer.valueOf(i11));
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            actionBar.setSubtitle(m118746s0);
        }
        m70698qM();
        C21956b.m114657g("CommonZaloview", "handleOnItemSelectionStateChanged(): total=" + i11 + ", isSelected=" + z11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 1) {
            InterfaceC12558e interfaceC12558e = this.f65543O0;
            C12557d c12557d = null;
            if (interfaceC12558e == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC12558e = null;
            }
            C12557d c12557d2 = this.f65544P0;
            if (c12557d2 == null) {
                AbstractC19074t.m100223u("args");
                c12557d2 = null;
            }
            long m70736a = c12557d2.m70736a();
            C12557d c12557d3 = this.f65544P0;
            if (c12557d3 == null) {
                AbstractC19074t.m100223u("args");
            } else {
                c12557d = c12557d3;
            }
            interfaceC12558e.mo70741Fj(m70736a, c12557d.m70737b());
            finish();
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        int i11;
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            if (C23212s8.m119603k()) {
                i11 = AbstractC2808b.light_icon_01;
            } else {
                i11 = AbstractC2808b.dark_icon_01;
            }
            Context context = actionBar.getContext();
            AbstractC19074t.m100205c(context);
            actionBar.setBackButtonDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_close_line_24, i11));
            actionBar.setTitleColor(C23212s8.m119607o(actionBar.getContext(), AbstractC21196a.TextColor1));
            actionBar.setSubTitleColor(C23212s8.m119607o(actionBar.getContext(), AbstractC21196a.TextColor2));
            actionBar.setBackgroundColor(C23212s8.m119607o(actionBar.getContext(), AbstractC16781w.HeaderFormColor));
            actionBar.setTitle(AbstractC23136l9.m118746s0(AbstractC8020f0.str_title_action_bar_add_item_collection, C21373a.f104231a.m110805u()));
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_multi_selection_singular_count, 0);
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            actionBar.setSubtitle(m118746s0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z12) {
            this.f72827B0.postDelayed(new Runnable() { // from class: x80.d0
                @Override // java.lang.Runnable
                public final void run() {
                    MyCloudMessagePickerView.m70695nM(MyCloudMessagePickerView.this);
                }
            }, 500L);
        } else if (z11) {
            this.f72827B0.post(new Runnable() { // from class: x80.e0
                @Override // java.lang.Runnable
                public final void run() {
                    MyCloudMessagePickerView.m70696oM(MyCloudMessagePickerView.this);
                }
            });
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MyCloudMessagePickerView";
    }

    @Override // x80.InterfaceC29509z
    /* renamed from: m0 */
    public void mo70700m0(String str) {
        int i11;
        InterfaceC1801w interfaceC1801w;
        AbstractC19074t.m100208f(str, "searchKeyword");
        C25199b c25199b = this.f65542N0;
        if (c25199b != null) {
            i11 = c25199b.m130436B();
        } else {
            i11 = 0;
        }
        C25199b c25199b2 = this.f65542N0;
        if (c25199b2 != null) {
            interfaceC1801w = c25199b2.m93128x(i11);
        } else {
            interfaceC1801w = null;
        }
        if (interfaceC1801w instanceof InterfaceC24697q) {
            ((InterfaceC24697q) interfaceC1801w).mo72574m0(str);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m70692kM();
    }
}
