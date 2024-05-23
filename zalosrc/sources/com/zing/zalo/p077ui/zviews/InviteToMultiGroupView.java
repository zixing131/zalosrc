package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import am.C0943w;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7005a5;
import com.zing.zalo.adapters.C7092i1;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.uicontrol.SimpleMenuListPopupView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import e70.C18275a;
import e70.C18282h;
import e70.InterfaceC18276b;
import e70.InterfaceC18277c;
import ed0.AbstractC18391a;
import gw.C19637j;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p692ys.C31070a;
import p716zh.C31973j5;
import p716zh.C32020m7;
import rs.C25976a;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class InviteToMultiGroupView extends SlidableZaloView implements InterfaceC18277c, ZaloView.InterfaceC17421f, C25976a.a, C23744a.c, InterfaceC0733x {

    /* renamed from: P0 */
    C25976a f74486P0;

    /* renamed from: Q0 */
    C7005a5 f74487Q0;

    /* renamed from: R0 */
    RecyclerView f74488R0;

    /* renamed from: S0 */
    LinearLayoutManager f74489S0;

    /* renamed from: T0 */
    MultiStateView f74490T0;

    /* renamed from: U0 */
    boolean f74491U0 = true;

    /* renamed from: V0 */
    C23528a f74492V0;

    /* renamed from: W0 */
    CustomEditText f74493W0;

    /* renamed from: X0 */
    KeyboardFrameLayout f74494X0;

    /* renamed from: Y0 */
    View f74495Y0;

    /* renamed from: Z0 */
    RobotoTextView f74496Z0;

    /* renamed from: a1 */
    LinearLayout f74497a1;

    /* renamed from: b1 */
    LinearLayout f74498b1;

    /* renamed from: c1 */
    AppCompatImageView f74499c1;

    /* renamed from: d1 */
    LinearLayout f74500d1;

    /* renamed from: e1 */
    LinearLayout f74501e1;

    /* renamed from: f1 */
    RecyclerView f74502f1;

    /* renamed from: g1 */
    InterfaceC18276b f74503g1;

    /* renamed from: h1 */
    C18275a f74504h1;

    /* renamed from: com.zing.zalo.ui.zviews.InviteToMultiGroupView$a */
    /* loaded from: classes6.dex */
    class ViewTreeObserverOnGlobalLayoutListenerC14489a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC14489a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (InviteToMultiGroupView.this.f74501e1.getHeight() > 0) {
                InviteToMultiGroupView.this.f74501e1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                InviteToMultiGroupView.this.m80973JM();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.InviteToMultiGroupView$b */
    /* loaded from: classes6.dex */
    class C14490b extends AbstractC18391a {
        C14490b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            InterfaceC18276b interfaceC18276b = InviteToMultiGroupView.this.f74503g1;
            if (interfaceC18276b != null) {
                interfaceC18276b.mo97119v9(charSequence.toString());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.InviteToMultiGroupView$c */
    /* loaded from: classes6.dex */
    class C14491c implements KeyboardFrameLayout.InterfaceC13508a {
        C14491c() {
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            AbstractC23647d.m123897g("1591070");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.InviteToMultiGroupView$d */
    /* loaded from: classes6.dex */
    class C14492d extends RecyclerView.AbstractC1892s {
        C14492d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            if (i11 == 0) {
                C25976a c25976a = InviteToMultiGroupView.this.f74486P0;
                c25976a.f123935s = false;
                c25976a.m10008p();
            } else {
                InviteToMultiGroupView inviteToMultiGroupView = InviteToMultiGroupView.this;
                inviteToMultiGroupView.f74486P0.f123935s = true;
                inviteToMultiGroupView.m80967C();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.InviteToMultiGroupView$e */
    /* loaded from: classes6.dex */
    class C14493e extends C7145n.g {
        C14493e() {
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
            InviteToMultiGroupView.this.m80988tM();
            C19637j c19637j = C19637j.f97466a;
            if (i11 != c19637j.m102828I()) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC23647d.m123897g("8011003");
                        }
                    } else {
                        AbstractC23647d.m123897g("8011005");
                    }
                } else {
                    AbstractC23647d.m123897g("8011004");
                }
            }
            c19637j.m102867s0(i11);
            InterfaceC18276b interfaceC18276b = InviteToMultiGroupView.this.f74503g1;
            if (interfaceC18276b != null) {
                interfaceC18276b.mo97112Lg();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public /* synthetic */ void m80965AM(View view) {
        InterfaceC18276b interfaceC18276b = this.f74503g1;
        if (interfaceC18276b != null) {
            interfaceC18276b.mo97111Kg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ void m80966BM(RecyclerView recyclerView, int i11, View view) {
        InterfaceC18276b interfaceC18276b = this.f74503g1;
        if (interfaceC18276b != null) {
            interfaceC18276b.mo97109Fo(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m80967C() {
        CustomEditText customEditText = this.f74493W0;
        if (customEditText != null) {
            AbstractC2379w.m12430d(customEditText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public /* synthetic */ void m80968CM() {
        View view = this.f74495Y0;
        if (view != null) {
            view.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ void m80969DM() {
        List arrayList;
        List arrayList2;
        if (this.f74487Q0 != null) {
            InterfaceC18276b interfaceC18276b = this.f74503g1;
            if (interfaceC18276b != null) {
                arrayList = interfaceC18276b.mo97118v();
            } else {
                arrayList = new ArrayList();
            }
            this.f74487Q0.m35846M(arrayList);
            InterfaceC18276b interfaceC18276b2 = this.f74503g1;
            if (interfaceC18276b2 != null) {
                arrayList2 = interfaceC18276b2.mo97110G8();
            } else {
                arrayList2 = new ArrayList();
            }
            int size = arrayList2.size();
            int size2 = arrayList.size();
            if (size > 0) {
                if (size2 == 0) {
                    int i11 = size - 1;
                    if (((C32020m7) arrayList2.get(i11)).f147410a == 29) {
                        arrayList2.remove(i11);
                        this.f74486P0.m133803P(arrayList2);
                    }
                }
                if (size2 > 0 && ((C32020m7) arrayList2.get(size - 1)).f147410a != 29) {
                    arrayList2.add(new C32020m7(29));
                    this.f74486P0.m133803P(arrayList2);
                }
            }
            this.f74487Q0.m10008p();
            this.f74486P0.m10008p();
            m80973JM();
            m80970EM();
        }
    }

    /* renamed from: EM */
    private void m80970EM() {
        String str;
        if (m87077NK() != null) {
            ZdsActionBar m87077NK = m87077NK();
            InterfaceC18276b interfaceC18276b = this.f74503g1;
            if (interfaceC18276b != null) {
                str = interfaceC18276b.mo97113Ym();
            } else {
                str = "";
            }
            m87077NK.setMiddleSubtitle(str);
        }
    }

    /* renamed from: FM */
    private void m80971FM(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        Bundle bundle = new Bundle();
        bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 9);
        bundle.putStringArrayList("STR_EXTRA_SELECTED_UIDS", arrayList);
        bundle.putString("extra_preload_data", QuickCreateGroupView.m83234GM(1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_new_group_title_select_member)));
        m92662fJ().m93069k2(QuickCreateGroupView.class, bundle, 1, true);
    }

    /* renamed from: IM */
    private void m80972IM(int i11) {
        if (m92676n2() != null && m92676n2().getWindow() != null) {
            m92676n2().mo35554O(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public void m80973JM() {
        List arrayList;
        try {
            InterfaceC18276b interfaceC18276b = this.f74503g1;
            if (interfaceC18276b != null) {
                arrayList = interfaceC18276b.mo97118v();
            } else {
                arrayList = new ArrayList();
            }
            if (arrayList.size() > 0) {
                this.f74500d1.setVisibility(0);
                this.f74500d1.bringToFront();
                this.f74501e1.setOnClickListener(null);
                return;
            }
            this.f74500d1.setVisibility(8);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: KM */
    private void m80974KM() {
        if (this.f74493W0.getText().toString().trim().isEmpty()) {
            this.f74497a1.setVisibility(0);
            this.f74498b1.setVisibility(0);
        } else {
            this.f74497a1.setVisibility(8);
            this.f74498b1.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public void m80988tM() {
        try {
            ZaloView m92996E0 = m92649TI().m92996E0("request_sort_list");
            if (m92996E0 != null) {
                m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m80989uM(RecyclerView recyclerView, int i11, View view) {
        InterfaceC18276b interfaceC18276b = this.f74503g1;
        if (interfaceC18276b != null) {
            interfaceC18276b.mo97120y6(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m80991wM(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC23647d.m123897g("1591068");
        this.f74503g1.mo97115ha(m92642L3().getString("STR_SOURCE_START_VIEW"));
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m80992xM(InterfaceC17463d interfaceC17463d, int i11) {
        finish();
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public /* synthetic */ void m80993yM(View view) {
        m80967C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public /* synthetic */ void m80994zM(View view) {
        AbstractC23647d.m123897g("1591065");
        m80971FM(this.f74504h1.f92521a);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f74504h1 = C18275a.m97108a(m92642L3());
        C18282h c18282h = new C18282h(this, C0943w.m4462l(), C19637j.f97466a, this.f74504h1);
        this.f74503g1 = c18282h;
        c18282h.mo97117pj(bundle);
        m80972IM(AbstractC2379w.m12428b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        List arrayList;
        int i12;
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            View inflate = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.dialog_error_not_friend_invite_to_multi_group, (ViewGroup) null);
            ((RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_desc)).setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_dialog_error_not_friend_invite_to_multi_group));
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_error_not_friend_invite_to_multi_group)).m43173v(3).m43177z(inflate).m43159h(4).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.close), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.gs
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                    InviteToMultiGroupView.this.m80992xM(interfaceC17463d, i13);
                }
            });
            return aVar.m43152a();
        }
        View inflate2 = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.dialog_confirm_invite_to_multi_group, (ViewGroup) null);
        RobotoTextView robotoTextView = (RobotoTextView) inflate2.findViewById(AbstractC6918a0.tv_desc);
        InterfaceC18276b interfaceC18276b = this.f74503g1;
        if (interfaceC18276b != null) {
            arrayList = interfaceC18276b.mo97118v();
        } else {
            arrayList = new ArrayList();
        }
        int size = arrayList.size();
        if (size > 1) {
            i12 = AbstractC8020f0.str_desc_dialog_confirm_invite_to_multi_group_2;
        } else {
            i12 = AbstractC8020f0.str_desc_dialog_confirm_invite_to_multi_group_1;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC23136l9.m118746s0(i12, this.f74504h1.f92522b, Integer.valueOf(size)));
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, this.f74504h1.f92522b.length(), 33);
        robotoTextView.setText(spannableStringBuilder);
        RecyclerView recyclerView = (RecyclerView) inflate2.findViewById(AbstractC6918a0.list_group_invite_confirm);
        C7092i1 c7092i1 = new C7092i1(this.f72421L0.getContext(), this.f74492V0);
        recyclerView.setAdapter(c7092i1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI()));
        recyclerView.setItemAnimator(null);
        c7092i1.m36165N(arrayList);
        if (size <= 3) {
            recyclerView.getLayoutParams().height = AbstractC23222t7.f112549a0 * size;
        } else {
            recyclerView.getLayoutParams().height = (AbstractC23222t7.f112549a0 * 3) + AbstractC23222t7.f112526H;
        }
        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
        aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_confirm_invite_to_multi_group)).m43159h(4).m43177z(inflate2).m43155d(true).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.es
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                interfaceC17463d.dismiss();
            }
        }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.fs
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                InviteToMultiGroupView.this.m80991wM(interfaceC17463d, i13);
            }
        });
        return aVar2.m43152a();
    }

    @Override // e70.InterfaceC18277c
    /* renamed from: E2 */
    public String mo80995E2() {
        CustomEditText customEditText = this.f74493W0;
        if (customEditText != null) {
            return customEditText.getText().toString();
        }
        return "";
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) layoutInflater.inflate(AbstractC7409c0.invite_to_multi_group_view, viewGroup, false);
        this.f74494X0 = keyboardFrameLayout;
        MultiStateView multiStateView = (MultiStateView) keyboardFrameLayout.findViewById(AbstractC6918a0.multi_state);
        this.f74490T0 = multiStateView;
        multiStateView.getEmptyView().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.as
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InviteToMultiGroupView.this.m80993yM(view);
            }
        });
        this.f74488R0 = (RecyclerView) this.f74494X0.findViewById(AbstractC6918a0.rv_group_list);
        View findViewById = this.f74494X0.findViewById(AbstractC6918a0.main_container);
        this.f74495Y0 = findViewById;
        this.f74494X0.setTopViewGroup(findViewById);
        LinearLayout linearLayout = (LinearLayout) this.f74494X0.findViewById(AbstractC6918a0.btn_create_group);
        this.f74497a1 = linearLayout;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.bs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InviteToMultiGroupView.this.m80994zM(view);
            }
        });
        this.f74496Z0 = (RobotoTextView) this.f74494X0.findViewById(AbstractC6918a0.btn_create_group_title);
        this.f74498b1 = (LinearLayout) this.f74494X0.findViewById(AbstractC6918a0.section_divider);
        LinearLayout linearLayout2 = (LinearLayout) this.f74494X0.findViewById(AbstractC6918a0.section_footer);
        this.f74500d1 = linearLayout2;
        linearLayout2.setVisibility(8);
        LinearLayout linearLayout3 = (LinearLayout) this.f74494X0.findViewById(AbstractC6918a0.content_section_footer);
        this.f74501e1 = linearLayout3;
        linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC14489a());
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f74494X0.findViewById(AbstractC6918a0.btn_done_invite_to_group);
        this.f74499c1 = appCompatImageView;
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.cs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InviteToMultiGroupView.this.m80965AM(view);
            }
        });
        RecyclerView recyclerView = (RecyclerView) this.f74494X0.findViewById(AbstractC6918a0.selected_recycler_view);
        this.f74502f1 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f72421L0.getContext(), 0, false));
        C7005a5 c7005a5 = new C7005a5();
        this.f74487Q0 = c7005a5;
        c7005a5.f38321u = true;
        c7005a5.f38320t = false;
        this.f74502f1.setAdapter(c7005a5);
        C31784b.m152808a(this.f74502f1).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.ds
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView2, int i11, View view) {
                InviteToMultiGroupView.this.m80966BM(recyclerView2, i11, view);
            }
        });
        CustomEditText customEditText = (CustomEditText) this.f74494X0.findViewById(AbstractC6918a0.edit_search);
        this.f74493W0 = customEditText;
        customEditText.addTextChangedListener(new C14490b());
        this.f74494X0.setOnKeyboardListener(new C14491c());
        return this.f74494X0;
    }

    /* renamed from: GM */
    public void m80996GM(int i11) {
        MultiStateView multiStateView = this.f74490T0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // rs.C25976a.a
    /* renamed from: Gq */
    public void mo67804Gq(String str, String str2) {
    }

    /* renamed from: HM */
    public void m80997HM(int i11) {
        MultiStateView multiStateView = this.f74490T0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // e70.InterfaceC18277c
    /* renamed from: ND */
    public void mo80998ND() {
        CustomEditText customEditText = this.f74493W0;
        if (customEditText != null && !TextUtils.isEmpty(customEditText.getText())) {
            this.f74493W0.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        m80970EM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.m124114c().m124117e(this, 36);
        C23744a.m124114c().m124117e(this, 27);
        m80967C();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        InterfaceC18276b interfaceC18276b = this.f74503g1;
        if (interfaceC18276b != null) {
            interfaceC18276b.mo97116j3(bundle);
        }
        super.mo37118SJ(bundle);
    }

    @Override // rs.C25976a.a
    /* renamed from: Va */
    public void mo67809Va(C31070a c31070a, String str, String str2, TrackingSource trackingSource) {
    }

    @Override // e70.InterfaceC18277c
    /* renamed from: Wx */
    public void mo80999Wx(boolean z11) {
        this.f74491U0 = z11;
    }

    @Override // e70.InterfaceC18277c
    /* renamed from: c3 */
    public void mo81000c3(boolean z11) {
        if (z11) {
            mo46829Y();
        } else {
            mo49315c4();
        }
    }

    @Override // e70.InterfaceC18277c
    /* renamed from: g */
    public void mo81001g() {
        finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "InviteToMultiGroupView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C23744a.m124114c().m124115b(this, 36);
        C23744a.m124114c().m124115b(this, 27);
        try {
            this.f72827B0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.hs
                @Override // java.lang.Runnable
                public final void run() {
                    InviteToMultiGroupView.this.m80968CM();
                }
            }, 200L);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // e70.InterfaceC18277c
    /* renamed from: pD */
    public void mo81002pD(String str, List list) {
        int i11;
        try {
            m80974KM();
            if (str.equals(mo80995E2())) {
                this.f74486P0.m133803P(list);
                mo81006ug();
                mo81005pv(false, 0);
                if (!TextUtils.isEmpty(r0.trim())) {
                    i11 = AbstractC8020f0.str_emptyResult;
                } else {
                    i11 = AbstractC8020f0.str_empty_joined_group_list;
                }
                m80996GM(i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // e70.InterfaceC18277c
    /* renamed from: pG */
    public void mo81003pG() {
        showDialog(2);
    }

    @Override // e70.InterfaceC18277c
    /* renamed from: ph */
    public void mo81004ph() {
        showDialog(1);
    }

    @Override // e70.InterfaceC18277c
    /* renamed from: pv */
    public void mo81005pv(boolean z11, int i11) {
        if (z11) {
            this.f74490T0.setVisibility(0);
            this.f74490T0.setState(MultiStateView.EnumC15914e.LOADING);
            this.f74488R0.setVisibility(8);
            return;
        }
        C25976a c25976a = this.f74486P0;
        if (c25976a != null && c25976a.mo10003k() > 0) {
            this.f74490T0.setVisibility(8);
            this.f74488R0.setVisibility(0);
        } else {
            this.f74488R0.setVisibility(8);
            this.f74490T0.setVisibility(0);
            m80996GM(AbstractC8020f0.str_empty_joined_group_list);
            this.f74490T0.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    @Override // rs.C25976a.a
    /* renamed from: tl */
    public void mo67819tl(C31973j5 c31973j5) {
    }

    @Override // rs.C25976a.a
    /* renamed from: uG */
    public void mo67820uG(Rect rect) {
        AbstractC23647d.m123897g("1591069");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7145n.b(m92689tK(), 5, 3, AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_recent_activity), ""));
        arrayList.add(new C7145n.b(m92689tK(), 5, 1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_name), ""));
        arrayList.add(new C7145n.b(m92689tK(), 5, 2, AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_manage), ""));
        m92649TI().m93060e2(0, SimpleMenuListPopupView.m87992ML(arrayList, new C14493e(), rect, AbstractC23309i.m122492v4()), "request_sort_list", 0, false);
    }

    @Override // e70.InterfaceC18277c
    /* renamed from: ug */
    public void mo81006ug() {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.is
            @Override // java.lang.Runnable
            public final void run() {
                InviteToMultiGroupView.this.m80969DM();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        int intValue;
        InterfaceC18276b interfaceC18276b;
        InterfaceC18276b interfaceC18276b2;
        try {
            if (i11 != 27) {
                if (i11 == 36) {
                    if (this.f74491U0 && (interfaceC18276b2 = this.f74503g1) != null) {
                        interfaceC18276b2.mo97112Lg();
                    }
                }
            } else if (objArr.length >= 2 && (((intValue = ((Integer) objArr[1]).intValue()) == 3 || intValue == 4) && (interfaceC18276b = this.f74503g1) != null)) {
                interfaceC18276b.mo97112Lg();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            this.f74492V0 = new C23528a(this.f72421L0.m92648SI());
            this.f74496Z0.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.new_group_with, this.f74504h1.f92522b));
            C31784b.m152808a(this.f74488R0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.zr
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                    InviteToMultiGroupView.this.m80989uM(recyclerView, i11, view);
                }
            });
            C25976a c25976a = new C25976a(this.f74492V0, this);
            this.f74486P0 = c25976a;
            c25976a.m9999J(true);
            this.f74488R0.setAdapter(this.f74486P0);
            this.f74488R0.setHasFixedSize(true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.m92648SI());
            this.f74489S0 = linearLayoutManager;
            this.f74488R0.setLayoutManager(linearLayoutManager);
            this.f74488R0.setItemAnimator(null);
            this.f74488R0.m9826E(new C14492d());
            m80996GM(AbstractC8020f0.str_empty_joined_group_list);
            m80997HM(AbstractC8020f0.str_tv_loadingGroupList);
            InterfaceC18276b interfaceC18276b = this.f74503g1;
            if (interfaceC18276b != null) {
                interfaceC18276b.mo97114d();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // e70.InterfaceC18277c
    /* renamed from: zd */
    public void mo81007zd(String str) {
        AbstractC23211s7.m119572e(str, m92676n2(), "");
    }
}
