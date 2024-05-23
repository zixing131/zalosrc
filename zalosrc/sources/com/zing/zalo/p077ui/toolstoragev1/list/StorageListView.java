package com.zing.zalo.p077ui.toolstoragev1.list;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import androidx.core.content.AbstractC1388a;
import au.AbstractC2379w;
import bb0.C2691a;
import bb0.C2701k;
import bb0.InterfaceC2692b;
import bb0.InterfaceC2693c;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstoragev1.detail.StorageUsageDetailView;
import com.zing.zalo.p077ui.toolstoragev1.list.StorageListView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import j30.C20912a;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p649xl.C29822gc;

/* loaded from: classes6.dex */
public class StorageListView extends SlidableZaloView implements InterfaceC2693c, InterfaceC0733x {

    /* renamed from: P0 */
    private C29822gc f68928P0;

    /* renamed from: Q0 */
    private C2691a f68929Q0;

    /* renamed from: R0 */
    private EditText f68930R0;

    /* renamed from: S0 */
    private View f68931S0;

    /* renamed from: U0 */
    private InterfaceC2692b f68933U0;

    /* renamed from: T0 */
    private C16972e0 f68932T0 = null;

    /* renamed from: V0 */
    private boolean f68934V0 = false;

    /* renamed from: W0 */
    ActionBar.C17431a f68935W0 = new C13464a();

    /* renamed from: X0 */
    ActionBarMenuItem.C17435d f68936X0 = new C13465b();

    /* renamed from: com.zing.zalo.ui.toolstoragev1.list.StorageListView$a */
    /* loaded from: classes6.dex */
    class C13464a extends ActionBar.C17431a {
        C13464a() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBar.C17431a
        /* renamed from: b */
        public void mo46831b(int i11) {
            if (i11 == 16908332 && StorageListView.this.f88760a0.m92719n() && !StorageListView.this.f68934V0) {
                StorageListView.this.m75521PM();
            } else if (StorageListView.this.f68934V0) {
                StorageListView.this.mo13188w8(false);
            } else {
                super.mo46831b(i11);
                StorageListView.this.mo37491QJ(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstoragev1.list.StorageListView$b */
    /* loaded from: classes6.dex */
    class C13465b extends ActionBarMenuItem.C17435d {
        C13465b() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: b */
        public void mo69246b() {
            StorageListView.this.f68929Q0.f10747z = "";
            super.mo69246b();
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: f */
        public void mo65079f(EditText editText) {
            StorageListView.this.f68933U0.mo13172I3(editText.getText().toString());
        }
    }

    /* renamed from: AM */
    public /* synthetic */ void m75486AM(AdapterView adapterView, View view, int i11, long j11) {
        if (!this.f68934V0) {
            this.f68933U0.mo13177sn((ThreadStorageInfo) this.f68929Q0.getItem(i11), m75518yM());
        } else {
            m75519zM(i11);
        }
    }

    /* renamed from: BM */
    public /* synthetic */ boolean m75487BM(View view, MotionEvent motionEvent) {
        mo13180C();
        return false;
    }

    /* renamed from: CM */
    public /* synthetic */ boolean m75488CM(AdapterView adapterView, View view, int i11, long j11) {
        try {
            if (!this.f68934V0 && C20912a.m109395e().m109407n()) {
                if (this.f88760a0.m92719n()) {
                    return false;
                }
                AbstractC23647d.m123897g("711236");
                mo13188w8(true);
                m75519zM(i11);
                m75499NM(i11);
                return true;
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
            return false;
        }
    }

    /* renamed from: DM */
    public /* synthetic */ void m75489DM(View view) {
        this.f68933U0.mo13179yh(this.f68929Q0.m13164o());
    }

    /* renamed from: EM */
    public /* synthetic */ void m75490EM(List list) {
        if (!mo78963ru()) {
            return;
        }
        if (list.size() > 0) {
            this.f68928P0.f137893v.setVisibility(0);
            this.f68928P0.f137891t.setVisibility(8);
            this.f68928P0.f137891t.setState(MultiStateView.EnumC15914e.CONTENT);
            this.f68929Q0.m35953b();
            this.f68929Q0.m35952a(list);
            this.f68929Q0.m13161l();
            this.f68929Q0.notifyDataSetChanged();
            m75498MM();
            return;
        }
        this.f68928P0.f137893v.setVisibility(8);
        this.f68928P0.f137891t.setVisibility(0);
        this.f68928P0.f137891t.setState(MultiStateView.EnumC15914e.EMPTY);
    }

    /* renamed from: FM */
    public /* synthetic */ void m75491FM(String str, List list) {
        EditText editText = this.f68930R0;
        if (editText != null && editText.getText() != null && !TextUtils.equals(str, this.f68930R0.getText().toString().toLowerCase().trim())) {
            return;
        }
        if (list.size() == 0) {
            this.f68928P0.f137891t.setVisibility(0);
            this.f68928P0.f137891t.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_usage_empty_search));
            this.f68928P0.f137891t.setState(MultiStateView.EnumC15914e.EMPTY);
        } else {
            this.f68928P0.f137891t.setVisibility(8);
            this.f68928P0.f137891t.setState(MultiStateView.EnumC15914e.CONTENT);
        }
        C2691a c2691a = this.f68929Q0;
        c2691a.f10747z = str;
        c2691a.m35953b();
        this.f68929Q0.m35952a(list);
        this.f68929Q0.notifyDataSetChanged();
    }

    /* renamed from: GM */
    public /* synthetic */ void m75492GM(int i11) {
        try {
            this.f68928P0.f137893v.f83579m0.smoothScrollToPosition(i11 - 1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* renamed from: HM */
    public /* synthetic */ void m75493HM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        m75517xM();
    }

    /* renamed from: IM */
    public /* synthetic */ void m75494IM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        this.f68933U0.mo13176m7(this.f68929Q0.m13164o());
    }

    /* renamed from: JM */
    public /* synthetic */ void m75495JM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        m75516wM(false);
    }

    /* renamed from: KM */
    public /* synthetic */ void m75496KM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        m75516wM(true);
    }

    /* renamed from: LM */
    public /* synthetic */ void m75497LM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        this.f68933U0.mo13176m7(this.f68929Q0.m13164o());
    }

    /* renamed from: MM */
    private void m75498MM() {
        if (!this.f68934V0) {
            return;
        }
        int m13164o = this.f68929Q0.m13164o();
        String m13162m = this.f68929Q0.m13162m();
        boolean z11 = false;
        this.f68928P0.f137894w.setText(String.format(Locale.getDefault(), "%d (%s)", Integer.valueOf(m13164o), m13162m));
        this.f68928P0.f137888q.setText(String.format(m92652XI(AbstractC8020f0.str_storage_usage_storage_clear), m13162m));
        RobotoTextView robotoTextView = this.f68928P0.f137888q;
        if (m13164o > 0) {
            z11 = true;
        }
        robotoTextView.setEnabled(z11);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: bb0.s.<init>(com.zing.zalo.ui.toolstoragev1.list.StorageListView, int):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: NM */
    private void m75499NM(int r5) {
        /*
            r4 = this;
            bb0.a r0 = r4.f68929Q0
            int r0 = r0.getCount()
            int r1 = r0 + (-2)
            if (r5 < r1) goto L1a
            xl.gc r5 = r4.f68928P0
            com.zing.zalo.uicontrol.SwipeRefreshListView r5 = r5.f137893v
            android.widget.ListView r5 = r5.f83579m0
            bb0.s r1 = new bb0.s
            r1.<init>()
            r2 = 50
            r5.postDelayed(r1, r2)
        L1a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.toolstoragev1.list.StorageListView.m75499NM(int):void");
    }

    /* renamed from: vM */
    private void m75515vM() {
        this.f68929Q0.f10747z = "";
        EditText editText = this.f68930R0;
        if (editText != null) {
            editText.setText("");
        }
        this.f88760a0.m92708c();
        this.f88763d0.m92750r();
    }

    /* renamed from: wM */
    private void m75516wM(boolean z11) {
        if (!z11) {
            m75517xM();
        } else {
            this.f68933U0.mo13175Tf(this.f68929Q0.m13163n());
        }
    }

    /* renamed from: xM */
    private void m75517xM() {
        if (this.f68929Q0.m13164o() != 0) {
            Intent intent = new Intent();
            intent.putExtra("need_reload", true);
            mo50035CK(-1, intent);
        }
        this.f68933U0.mo13178ug(this.f68929Q0.m13163n());
    }

    /* renamed from: yM */
    private String m75518yM() {
        EditText editText = this.f68930R0;
        if (editText != null) {
            return editText.getText().toString();
        }
        return "";
    }

    /* renamed from: zM */
    private void m75519zM(int i11) {
        if (!this.f68929Q0.m13167t(i11)) {
            return;
        }
        m75498MM();
    }

    @Override // bb0.InterfaceC2693c
    /* renamed from: C */
    public void mo13180C() {
        EditText editText = this.f68930R0;
        if (editText != null) {
            AbstractC2379w.m12430d(editText);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        C2701k c2701k = new C2701k(this, AbstractC23306f.m120570C1(), AbstractC23306f.m120601N());
        this.f68933U0 = c2701k;
        c2701k.mo995Nd(C13466a.Companion.m75525a(m92642L3()), null);
    }

    @Override // bb0.InterfaceC2693c
    /* renamed from: Cp */
    public void mo13181Cp() {
        C16972e0 c16972e0 = this.f68932T0;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29822gc m147999c = C29822gc.m147999c(layoutInflater, viewGroup, false);
        this.f68928P0 = m147999c;
        m147999c.f137893v.setSwipeRefreshEnable(false);
        C2691a c2691a = new C2691a(this.f72421L0.m92648SI().getApplicationContext());
        this.f68929Q0 = c2691a;
        this.f68928P0.f137893v.f83579m0.setAdapter((ListAdapter) c2691a);
        this.f68928P0.f137893v.f83579m0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: bb0.l
            public /* synthetic */ C2702l() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                StorageListView.this.m75486AM(adapterView, view, i11, j11);
            }
        });
        this.f68928P0.f137893v.f83579m0.setOnTouchListener(new View.OnTouchListener() { // from class: bb0.o
            public /* synthetic */ ViewOnTouchListenerC2705o() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m75487BM;
                m75487BM = StorageListView.this.m75487BM(view, motionEvent);
                return m75487BM;
            }
        });
        this.f68928P0.f137893v.f83579m0.setLongClickable(true);
        this.f68928P0.f137893v.f83579m0.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: bb0.p
            public /* synthetic */ C2706p() {
            }

            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i11, long j11) {
                boolean m75488CM;
                m75488CM = StorageListView.this.m75488CM(adapterView, view, i11, j11);
                return m75488CM;
            }
        });
        this.f68928P0.f137888q.setOnClickListener(new View.OnClickListener() { // from class: bb0.q
            public /* synthetic */ ViewOnClickListenerC2707q() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StorageListView.this.m75489DM(view);
            }
        });
        return this.f68928P0.getRoot();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        this.f68933U0.mo994F2();
    }

    @Override // bb0.InterfaceC2693c
    /* renamed from: M4 */
    public void mo13182M4(boolean z11) {
        int i11;
        View view = this.f68931S0;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    /* renamed from: OM */
    void m75520OM() {
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.m92708c();
                this.f88763d0.m92750r();
                this.f88760a0.setTitle(m92652XI(AbstractC8020f0.str_storage_usage_delete_conversation));
                ActionBar actionBar2 = this.f88760a0;
                actionBar2.setTitleColor(C23212s8.m119607o(actionBar2.getContext(), AbstractC21196a.TextColor1));
                if (C23212s8.m119603k()) {
                    this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_black);
                } else {
                    this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                }
                ActionBar actionBar3 = this.f88760a0;
                actionBar3.setBackgroundColor(C23212s8.m119607o(actionBar3.getContext(), AbstractC16781w.HeaderFormColor));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    @Override // bb0.InterfaceC2693c
    /* renamed from: P6 */
    public void mo13183P6(ThreadStorageInfo threadStorageInfo, long j11, long j12) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("details", threadStorageInfo);
        bundle.putLong("size_conversation", j11);
        bundle.putLong("size_cache", j12);
        bundle.putString("STR_SOURCE_START_VIEW", "storage_usage");
        this.f72421L0.m92662fJ().m93066i2(StorageUsageDetailView.class, bundle, 1, 1, true);
    }

    /* renamed from: PM */
    void m75521PM() {
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                if (actionBar.m92719n()) {
                    m75515vM();
                }
                this.f88763d0.m92750r();
                this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_usage_info));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setTitleColor(m92651WI().getColor(AbstractC16801x.storage_clear_storage_text_color));
                this.f88763d0.m92738e(1, AbstractC16803z.icon_header_search);
                this.f88760a0.setActionBarMenuOnItemClick(this.f68935W0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 1 && this.f68928P0.f137891t.getState() != MultiStateView.EnumC15914e.LOADING) {
            this.f88763d0.m92750r();
            ActionBarMenuItem m92738e = this.f88763d0.m92738e(0, 0);
            m92738e.m92768B(true, true, AbstractC16803z.icn_header_close_white, AbstractC16803z.search_cursor_white);
            m92738e.f88838J = true;
            m92738e.getSearchField().setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_usage_search_hint));
            EditText searchField = m92738e.getSearchField();
            this.f68930R0 = searchField;
            if (searchField != null) {
                searchField.setEllipsize(TextUtils.TruncateAt.END);
                this.f68930R0.setHintTextColor(AbstractC1388a.m6961c(this.f72421L0.m92648SI(), AbstractC16801x.white_50));
                this.f68930R0.setTextColor(AbstractC1388a.m6961c(this.f72421L0.m92648SI(), AbstractC16801x.white));
                AbstractC2379w.m12432f(this.f68930R0);
                AbstractC23647d.m123897g("711225");
                if (!TextUtils.isEmpty(this.f68930R0.getText())) {
                    m92738e.m92767A(this.f68936X0);
                    this.f88760a0.m92723u(this.f68930R0.getText().toString());
                } else {
                    this.f88760a0.m92723u("");
                    m92738e.m92767A(this.f68936X0);
                }
                if (this.f68930R0.getParent() != null) {
                    ((View) this.f68930R0.getParent()).setBackgroundResource(AbstractC16803z.stencil_edit_text_focused_no_space_white);
                }
            }
            this.f68931S0 = m92738e.getClearButton();
            mo13182M4(false);
        }
        return super.mo37491QJ(i11);
    }

    /* renamed from: QM */
    void m75522QM() {
        this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
        this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
        this.f88763d0.m92750r();
        ActionBarMenuItem m92738e = this.f88763d0.m92738e(0, 0);
        m92738e.m92768B(true, true, AbstractC16803z.icn_header_close_white, AbstractC16803z.search_cursor_white);
        m92738e.f88838J = true;
        m92738e.getSearchField().setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_usage_search_hint));
        EditText searchField = m92738e.getSearchField();
        this.f68930R0 = searchField;
        if (searchField != null) {
            searchField.setEllipsize(TextUtils.TruncateAt.END);
            this.f68930R0.setHintTextColor(AbstractC1388a.m6961c(this.f72421L0.m92648SI(), AbstractC16801x.white_50));
            this.f68930R0.setTextColor(AbstractC1388a.m6961c(this.f72421L0.m92648SI(), AbstractC16801x.white));
            AbstractC2379w.m12432f(this.f68930R0);
            if (!this.f68929Q0.isEmpty()) {
                this.f68930R0.setText(this.f68929Q0.f10747z);
            }
            if (!TextUtils.isEmpty(this.f68930R0.getText())) {
                m92738e.m92767A(this.f68936X0);
                this.f88760a0.m92723u(this.f68930R0.getText().toString());
            } else {
                this.f88760a0.m92723u("");
                m92738e.m92767A(this.f68936X0);
            }
            if (this.f68930R0.getParent() != null) {
                ((View) this.f68930R0.getParent()).setBackgroundResource(AbstractC16803z.stencil_edit_text_focused_no_space_white);
            }
        }
        this.f68931S0 = m92738e.getClearButton();
        mo13182M4(false);
        mo13180C();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_usage_info));
                this.f88760a0.setTitleColor(m92651WI().getColor(AbstractC16801x.storage_clear_storage_text_color));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88763d0.m92738e(1, AbstractC16803z.icon_header_search);
                this.f88760a0.setActionBarMenuOnItemClick(this.f68935W0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    @Override // bb0.InterfaceC2693c
    /* renamed from: Yr */
    public void mo13184Yr() {
        String m118746s0;
        if (this.f68929Q0.m13164o() > 1) {
            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_storage_usage_delete_conversation_confirm_multi_dialog, Integer.valueOf(this.f68929Q0.m13164o()), this.f68929Q0.m13162m());
        } else {
            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_storage_usage_delete_conversation_confirm_single_dialog, this.f68929Q0.m13162m());
        }
        this.f68932T0 = new C16972e0.a(m92689tK()).m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(m118746s0).m90942s(AbstractC8020f0.str_delete, new InterfaceC17463d.d() { // from class: bb0.t
            public /* synthetic */ C2710t() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                StorageListView.this.m75493HM(interfaceC17463d, i11);
            }
        }).m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger).m90933j(AbstractC8020f0.cancel, new InterfaceC17463d.d() { // from class: bb0.u
            public /* synthetic */ C2711u() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                StorageListView.this.m75494IM(interfaceC17463d, i11);
            }
        }).m90931h("delete_data_dialog").m90947x("delete_data_button").m90937n("close_dialog_button").m90923G();
    }

    @Override // bb0.InterfaceC2693c
    /* renamed from: Zy */
    public void mo13185Zy() {
        String m92653YI;
        List m13163n = this.f68929Q0.m13163n();
        String m74779R = ((ThreadStorageInfo) m13163n.get(0)).m74779R();
        int size = m13163n.size();
        if (size == 1) {
            m92653YI = m92653YI(AbstractC8020f0.str_storage_title_delete_conversation, m74779R);
        } else {
            m92653YI = m92653YI(AbstractC8020f0.str_storage_title_delete_list_conversations, Integer.valueOf(size));
        }
        this.f68932T0 = new C16972e0.a(m92689tK()).m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(m92653YI).m90922F(true).m90942s(AbstractC8020f0.str_storage_btn_delete_conversation, new InterfaceC17463d.d() { // from class: bb0.v
            public /* synthetic */ C2712v() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                StorageListView.this.m75495JM(interfaceC17463d, i11);
            }
        }).m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger).m90938o(AbstractC8020f0.str_storage_btn_delete_conversation_photo_video, new InterfaceC17463d.d() { // from class: bb0.w
            public /* synthetic */ C2713w() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                StorageListView.this.m75496KM(interfaceC17463d, i11);
            }
        }).m90940q(AbstractC2814h.ButtonMedium_TertiaryDanger).m90933j(AbstractC8020f0.cancel, new InterfaceC17463d.d() { // from class: bb0.m
            public /* synthetic */ C2703m() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                StorageListView.this.m75497LM(interfaceC17463d, i11);
            }
        }).m90935l(AbstractC2814h.ButtonMedium_Tertiary).m90931h("delete_data_dialog").m90947x("delete_data_button").m90941r("delete_only_media_button").m90937n("close_dialog_button").m90923G();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ToolStorageThreadList";
    }

    @Override // bb0.InterfaceC2693c
    /* renamed from: iI */
    public void mo13186iI(List list) {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: bb0.r

            /* renamed from: q */
            public final /* synthetic */ List f10786q;

            public /* synthetic */ RunnableC2708r(List list2) {
                r2 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                StorageListView.this.m75490EM(r2);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1 && i12 == -1) {
            this.f68933U0.mo13173Ke((ThreadStorageInfo) intent.getParcelableExtra("details"));
            Intent intent2 = new Intent();
            intent2.putExtra("need_reload", true);
            mo50035CK(-1, intent2);
        }
        m75521PM();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && this.f88760a0.m92719n()) {
            m75521PM();
            return true;
        }
        if (this.f68934V0) {
            mo13188w8(false);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f68933U0.mo13174Sa();
    }

    @Override // bb0.InterfaceC2693c
    /* renamed from: rs */
    public void mo13187rs(List list, String str) {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: bb0.n

            /* renamed from: q */
            public final /* synthetic */ String f10780q;

            /* renamed from: r */
            public final /* synthetic */ List f10781r;

            public /* synthetic */ RunnableC2704n(String str2, List list2) {
                r2 = str2;
                r3 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                StorageListView.this.m75491FM(r2, r3);
            }
        });
    }

    @Override // bb0.InterfaceC2693c
    /* renamed from: w8 */
    public void mo13188w8(boolean z11) {
        this.f68934V0 = z11;
        this.f68929Q0.m13166r(z11);
        if (z11) {
            this.f68928P0.f137890s.setVisibility(0);
            m75520OM();
            return;
        }
        this.f68928P0.f137890s.setVisibility(8);
        if (!this.f68929Q0.f10747z.isEmpty()) {
            m75522QM();
        } else {
            m75521PM();
        }
    }
}
