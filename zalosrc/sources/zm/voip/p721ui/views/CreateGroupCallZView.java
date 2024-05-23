package zm.voip.p721ui.views;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.KeyboardAwareRelativeLayout;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import hm0.C20096c;
import io0.C20644a;
import java.util.ArrayList;
import jo0.C21335m;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p363nh.C23744a;
import to0.InterfaceC26858c;
import to0.InterfaceC26859d;
import wo0.C29165q0;
import zc0.C31784b;
import zm.voip.adapter.GroupMembersAdapter;
import zm.voip.p721ui.views.CreateGroupCallZView;

/* loaded from: classes7.dex */
public class CreateGroupCallZView extends SlidableZaloView implements C23744a.c, View.OnClickListener, InterfaceC26859d {

    /* renamed from: Q0 */
    private KeyboardAwareRelativeLayout f149842Q0;

    /* renamed from: R0 */
    private MultiStateView f149843R0;

    /* renamed from: S0 */
    private RecyclerView f149844S0;

    /* renamed from: T0 */
    private RecyclerView f149845T0;

    /* renamed from: U0 */
    private CustomEditText f149846U0;

    /* renamed from: V0 */
    private RobotoTextView f149847V0;

    /* renamed from: W0 */
    private RobotoTextView f149848W0;

    /* renamed from: X0 */
    private LinearLayout f149849X0;

    /* renamed from: Y0 */
    private GroupMembersAdapter f149850Y0;

    /* renamed from: Z0 */
    private C21335m f149851Z0;

    /* renamed from: a1 */
    private InterfaceC26858c f149852a1;

    /* renamed from: P0 */
    private final InterfaceC17463d.d f149841P0 = new InterfaceC17463d.b();

    /* renamed from: b1 */
    private final TextWatcher f149853b1 = new C32470d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.views.CreateGroupCallZView$a */
    /* loaded from: classes7.dex */
    public class C32467a extends RecyclerView.AbstractC1892s {
        C32467a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    if (CreateGroupCallZView.this.f149850Y0 != null) {
                        CreateGroupCallZView.this.f149850Y0.m155484P(false);
                        CreateGroupCallZView.this.f149850Y0.m10008p();
                    }
                } else if (CreateGroupCallZView.this.f149850Y0 != null) {
                    CreateGroupCallZView.this.f149850Y0.m155484P(true);
                    AbstractC2379w.m12430d(CreateGroupCallZView.this.f149846U0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.views.CreateGroupCallZView$b */
    /* loaded from: classes7.dex */
    public class C32468b extends RecyclerView.AbstractC1892s {
        C32468b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    CreateGroupCallZView.this.f149851Z0.m110505N(false);
                    CreateGroupCallZView.this.f149851Z0.m10008p();
                } else {
                    CreateGroupCallZView.this.f149851Z0.m110505N(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.views.CreateGroupCallZView$c */
    /* loaded from: classes7.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC32469c implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC32469c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (CreateGroupCallZView.this.f149849X0.getHeight() > 0) {
                CreateGroupCallZView.this.f149849X0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                CreateGroupCallZView.this.f149852a1.mo138203Yc();
            }
        }
    }

    /* renamed from: zm.voip.ui.views.CreateGroupCallZView$d */
    /* loaded from: classes7.dex */
    class C32470d extends AbstractC18391a {
        C32470d() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            if (CreateGroupCallZView.this.f149846U0 != null && CreateGroupCallZView.this.f149846U0.getText() != null) {
                CreateGroupCallZView.this.f149852a1.mo138209jp(CreateGroupCallZView.this.f149846U0.getText().toString().trim().replaceAll("\\s+", " "));
            }
        }
    }

    /* renamed from: AM */
    private void m157201AM() {
        try {
            if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().getWindow() != null) {
                this.f72421L0.m92676n2().mo35554O(18);
                this.f149842Q0.setEnableMeasureKeyboard(false);
            }
            ((RobotoTextView) this.f149842Q0.findViewById(AbstractC6918a0.tv_selected_base_title)).setFontStyle(7);
            RobotoTextView robotoTextView = (RobotoTextView) this.f149842Q0.findViewById(AbstractC6918a0.txt_limit_mem_warning);
            this.f149847V0 = robotoTextView;
            robotoTextView.setFontStyle(7);
            RobotoTextView robotoTextView2 = (RobotoTextView) this.f149842Q0.findViewById(AbstractC6918a0.num_selected_member);
            this.f149848W0 = robotoTextView2;
            robotoTextView2.setFontStyle(7);
            CustomEditText customEditText = (CustomEditText) this.f149842Q0.findViewById(AbstractC6918a0.search_input_text);
            this.f149846U0 = customEditText;
            customEditText.setImeOptions(3);
            this.f149846U0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: yo0.a
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    boolean m157213rM;
                    m157213rM = CreateGroupCallZView.this.m157213rM(textView, i11, keyEvent);
                    return m157213rM;
                }
            });
            this.f149846U0.setSingleLine(true);
            this.f149846U0.setPadding(AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(6.0f));
            this.f149846U0.setHint(AbstractC8020f0.str_call_groupcall_search_bar_text);
            this.f149846U0.addTextChangedListener(this.f149853b1);
            ((RobotoTextView) this.f149842Q0.findViewById(AbstractC6918a0.tv_create_group_call)).setOnClickListener(this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.m92648SI());
            RecyclerView recyclerView = (RecyclerView) this.f149842Q0.findViewById(AbstractC6918a0.rv_members);
            this.f149844S0 = recyclerView;
            recyclerView.setLayoutManager(linearLayoutManager);
            GroupMembersAdapter groupMembersAdapter = new GroupMembersAdapter(this.f72421L0.m92648SI(), this.f149852a1.mo138199Nm(), this.f149852a1.mo138208ik());
            this.f149850Y0 = groupMembersAdapter;
            this.f149844S0.setAdapter(groupMembersAdapter);
            C31784b.m152808a(this.f149844S0).m152809b(new C31784b.d() { // from class: yo0.b
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView2, int i11, View view) {
                    CreateGroupCallZView.this.m157214sM(recyclerView2, i11, view);
                }
            });
            this.f149844S0.m9826E(new C32467a());
            MultiStateView multiStateView = (MultiStateView) this.f149842Q0.findViewById(AbstractC6918a0.multi_state);
            this.f149843R0 = multiStateView;
            multiStateView.setEnableLoadingText(true);
            m157221zM(AbstractC8020f0.empty_list);
            m157220yM(AbstractC8020f0.str_tv_loading);
            m157219xM(true);
            this.f149843R0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: yo0.c
                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    CreateGroupCallZView.this.m157215tM();
                }
            });
            this.f149851Z0 = new C21335m(this.f72421L0.m92648SI());
            RecyclerView recyclerView2 = (RecyclerView) this.f149842Q0.findViewById(AbstractC6918a0.rv_selected_member);
            this.f149845T0 = recyclerView2;
            recyclerView2.setLayoutManager(new LinearLayoutManager(this.f72421L0.getContext(), 0, false));
            this.f149845T0.setAdapter(this.f149851Z0);
            C31784b.m152808a(this.f149845T0).m152809b(new C31784b.d() { // from class: yo0.d
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView3, int i11, View view) {
                    CreateGroupCallZView.this.m157216uM(recyclerView3, i11, view);
                }
            });
            this.f149845T0.m9826E(new C32468b());
            LinearLayout linearLayout = (LinearLayout) this.f149842Q0.findViewById(AbstractC6918a0.section_footer);
            this.f149849X0 = linearLayout;
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC32469c());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ boolean m157213rM(TextView textView, int i11, KeyEvent keyEvent) {
        return this.f149852a1.mo138205cj(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public /* synthetic */ void m157214sM(RecyclerView recyclerView, int i11, View view) {
        ContactProfile contactProfile;
        try {
            GroupMembersAdapter groupMembersAdapter = this.f149850Y0;
            if (groupMembersAdapter != null && groupMembersAdapter.mo10003k() > 0 && (contactProfile = this.f149850Y0.m155481M(i11).f105756a) != null && !contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                this.f149852a1.mo138200P(contactProfile);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public /* synthetic */ void m157215tM() {
        this.f149852a1.mo138195Ak();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m157216uM(RecyclerView recyclerView, int i11, View view) {
        try {
            this.f149852a1.mo138210q7(this.f149851Z0.m110504M(i11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m157217vM(C20096c c20096c) {
        MultiStateView.EnumC15915f enumC15915f;
        int i11;
        try {
            int m104491c = c20096c.m104491c();
            m157219xM(false);
            this.f149843R0.setState(MultiStateView.EnumC15914e.ERROR);
            MultiStateView multiStateView = this.f149843R0;
            if (m104491c == 50001) {
                enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
            } else {
                enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
            }
            multiStateView.setErrorType(enumC15915f);
            MultiStateView multiStateView2 = this.f149843R0;
            if (m104491c == 50001) {
                i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
            } else {
                i11 = AbstractC8020f0.str_tv_loadingMemberList_error;
            }
            multiStateView2.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m157218wM(int i11) {
        RobotoTextView robotoTextView = this.f149848W0;
        if (robotoTextView != null) {
            robotoTextView.setText("(" + i11 + "/" + this.f149852a1.mo138207ea() + ")");
            if (i11 < this.f149852a1.mo138207ea()) {
                RobotoTextView robotoTextView2 = this.f149848W0;
                robotoTextView2.setTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC21196a.TextColor1));
            } else {
                this.f149848W0.setTextColor(Color.parseColor("#EF4E49"));
            }
        }
    }

    /* renamed from: xM */
    private void m157219xM(boolean z11) {
        if (z11) {
            this.f149844S0.setVisibility(8);
            this.f149843R0.setVisibility(0);
            this.f149843R0.setState(MultiStateView.EnumC15914e.LOADING);
        } else if (this.f149852a1.mo138199Nm().size() > 0) {
            this.f149843R0.setVisibility(8);
            this.f149844S0.setVisibility(0);
        } else {
            this.f149844S0.setVisibility(8);
            this.f149843R0.setVisibility(0);
            this.f149843R0.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    /* renamed from: yM */
    private void m157220yM(int i11) {
        MultiStateView multiStateView = this.f149843R0;
        if (multiStateView != null) {
            multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: zM */
    private void m157221zM(int i11) {
        MultiStateView multiStateView = this.f149843R0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f149852a1 = new C29165q0(this);
        this.f149852a1.mo995Nd(C20644a.m107586a(this.f72421L0.m92642L3()), null);
        C23744a.m124114c().m124115b(this, 91);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            return null;
        }
        C8009j.a aVar = new C8009j.a(getContext());
        aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warningMsgcantuseVoiceCall)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), this.f149841P0);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        return m43152a;
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: E2 */
    public String mo138212E2() {
        if (this.f149846U0.getText() != null) {
            return this.f149846U0.getText().toString().trim().replaceAll("\\s+", " ");
        }
        return "";
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: EI */
    public void mo138213EI() {
        CustomEditText customEditText = this.f149846U0;
        if (customEditText != null && !TextUtils.isEmpty(customEditText.getEditableText().toString())) {
            this.f149846U0.setText("");
        }
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: Ep */
    public void mo138214Ep() {
        AbstractC23034c6.m118184v0(this, AbstractC23034c6.f112033j, 113);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f149842Q0 = (KeyboardAwareRelativeLayout) layoutInflater.inflate(AbstractC7409c0.layout_call_create_group_call, viewGroup, false);
        m92637BK(true);
        m157201AM();
        this.f149852a1.mo138206d();
        return this.f149842Q0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C23744a.m124114c().m124117e(this, 91);
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: M9 */
    public void mo138215M9() {
        finish();
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: N5 */
    public void mo138216N5(int i11) {
        GroupMembersAdapter groupMembersAdapter = this.f149850Y0;
        if (groupMembersAdapter != null) {
            groupMembersAdapter.f148672v = i11;
        }
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: Ql */
    public void mo138217Ql() {
        m157219xM(false);
        this.f149843R0.setState(MultiStateView.EnumC15914e.ERROR);
        this.f149843R0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
        this.f149843R0.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        AbstractC2379w.m12430d(this.f149846U0);
        C23744a.m124114c().m124117e(this, 27);
        C23744a.m124114c().m124117e(this, 65);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_groupcall_start_header_title_v2));
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
        }
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: Td */
    public void mo138218Td() {
        LinearLayout linearLayout = this.f149849X0;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            this.f149850Y0.m10008p();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        this.f149852a1.mo138202T5();
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: Ut */
    public void mo138219Ut(ArrayList arrayList) {
        m157221zM(AbstractC8020f0.str_emptyResult);
        m157219xM(false);
        GroupMembersAdapter groupMembersAdapter = this.f149850Y0;
        if (groupMembersAdapter != null) {
            groupMembersAdapter.m155485Q(this.f149852a1.mo138199Nm());
            this.f149850Y0.m10008p();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f149852a1.mo138196Ec();
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: Vc */
    public void mo138220Vc(ArrayList arrayList) {
        m157221zM(AbstractC8020f0.str_emptyResult);
        m157219xM(false);
        GroupMembersAdapter groupMembersAdapter = this.f149850Y0;
        if (groupMembersAdapter != null) {
            groupMembersAdapter.m155485Q(arrayList);
            this.f149850Y0.m10008p();
        }
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: Xx */
    public void mo138221Xx(int i11) {
        try {
            this.f149845T0.mo9854S1(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: ct */
    public void mo138222ct() {
        CustomEditText customEditText = this.f149846U0;
        if (customEditText != null) {
            AbstractC2379w.m12430d(customEditText);
        }
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: df */
    public void mo138223df(final C20096c c20096c) {
        if (c20096c != null) {
            this.f72827B0.post(new Runnable() { // from class: yo0.f
                @Override // java.lang.Runnable
                public final void run() {
                    CreateGroupCallZView.this.m157217vM(c20096c);
                }
            });
        }
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: di */
    public boolean mo138224di() {
        if (AbstractC23034c6.m118167n(this.f72421L0.getContext(), AbstractC23034c6.f112033j) == 0) {
            return true;
        }
        return false;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CreateGroupCallZView";
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: ii */
    public void mo138225ii() {
        this.f72421L0.removeDialog(1);
        this.f72421L0.showDialog(1);
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: k */
    public ZaloView mo138226k() {
        return this;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 10099 && i12 == -1) {
            AbstractC2364o0.m12369l(this.f72421L0.m92676n2(), this.f149850Y0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.tv_create_group_call) {
            this.f149852a1.mo138198Ji();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            this.f149852a1.mo138201Sm();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 113) {
            if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(this.f72421L0.getContext(), AbstractC23034c6.f112033j) == 0) {
                this.f149852a1.mo138197I6();
            } else {
                AbstractC23034c6.m118166m0(this, 113);
            }
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        GroupMembersAdapter groupMembersAdapter = this.f149850Y0;
        if (groupMembersAdapter != null) {
            groupMembersAdapter.m10008p();
        }
        C23744a.m124114c().m124115b(this, 27);
        C23744a.m124114c().m124115b(this, 65);
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: pl */
    public void mo138227pl() {
        RobotoTextView robotoTextView = this.f149847V0;
        if (robotoTextView != null) {
            robotoTextView.setVisibility(8);
        }
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: rr */
    public void mo138228rr(final int i11) {
        this.f72827B0.post(new Runnable() { // from class: yo0.e
            @Override // java.lang.Runnable
            public final void run() {
                CreateGroupCallZView.this.m157218wM(i11);
            }
        });
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: rt */
    public void mo138229rt() {
        LinearLayout linearLayout = this.f149849X0;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            this.f149849X0.setOnClickListener(null);
            this.f149850Y0.m10008p();
        }
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: tv */
    public void mo138230tv(ArrayList arrayList) {
        C21335m c21335m = this.f149851Z0;
        if (c21335m != null && this.f149850Y0 != null && arrayList != null) {
            c21335m.m110506O(arrayList);
            this.f149851Z0.m10008p();
            this.f149850Y0.m10008p();
            mo138228rr(arrayList.size());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 != 27) {
            if (i11 != 65) {
                if (i11 == 91 && objArr.length == 3) {
                    try {
                        onRequestPermissionsResult(((Integer) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return;
                    }
                }
                return;
            }
            this.f149852a1.mo138211t1();
            return;
        }
        this.f149852a1.mo138204c4(objArr);
    }

    @Override // to0.InterfaceC26859d
    /* renamed from: xC */
    public void mo138231xC(int i11) {
        RobotoTextView robotoTextView = this.f149847V0;
        if (robotoTextView != null) {
            robotoTextView.setText(m92653YI(AbstractC8020f0.str_call_groupcall_full_member_error, Integer.valueOf(i11)));
            this.f149847V0.setVisibility(0);
        }
    }
}
