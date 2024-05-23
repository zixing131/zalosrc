package com.zing.zalo.p077ui.mycloud.collection;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.mycloud.collection.CreateNewCollectionView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import jn0.AbstractC21317c;
import kw.C21955a;
import ln0.AbstractC22543l;
import ln0.C22537f;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mw.C23459d;
import on0.AbstractC24341v;
import p246iw.C20843c0;
import p262jb.AbstractC21196a;
import p279jw.C21373a;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p649xl.C29902l2;
import pk.C24799c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ui0.C27280g;
import x80.C29504u;
import x80.InterfaceC29503t;

/* loaded from: classes6.dex */
public final class CreateNewCollectionView extends SlidableZaloView implements InterfaceC29503t, C23744a.c {
    public static final C12541a Companion = new C12541a(null);

    /* renamed from: P0 */
    private C29902l2 f65533P0;

    /* renamed from: Q0 */
    private final InterfaceC24854k f65534Q0;

    /* renamed from: R0 */
    private final InterfaceC24854k f65535R0;

    /* renamed from: S0 */
    private Button f65536S0;

    /* renamed from: T0 */
    private C24799c f65537T0;

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CreateNewCollectionView$a */
    /* loaded from: classes6.dex */
    public static final class C12541a {
        private C12541a() {
        }

        public /* synthetic */ C12541a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CreateNewCollectionView$b */
    /* loaded from: classes6.dex */
    static final class C12542b extends AbstractC19075u implements InterfaceC18494a {
        C12542b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C12556c mo12V4() {
            return C12556c.Companion.m70735a(CreateNewCollectionView.this.m92642L3());
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CreateNewCollectionView$c */
    /* loaded from: classes6.dex */
    public static final class C12543c implements TextWatcher {
        public C12543c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CreateNewCollectionView.this.m70673mM(String.valueOf(editable));
            CreateNewCollectionView.this.m70680tM();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CreateNewCollectionView$d */
    /* loaded from: classes6.dex */
    static final class C12544d extends AbstractC19075u implements InterfaceC18494a {
        C12544d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C29504u mo12V4() {
            return new C29504u(CreateNewCollectionView.this);
        }
    }

    public CreateNewCollectionView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C12542b());
        this.f65534Q0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12544d());
        this.f65535R0 = m129210a2;
    }

    /* renamed from: mM */
    public final void m70673mM(String str) {
        if (str.length() > 50) {
            C29902l2 c29902l2 = this.f65533P0;
            C29902l2 c29902l22 = null;
            if (c29902l2 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29902l2 = null;
            }
            CustomEditText customEditText = c29902l2.f138546q;
            String substring = str.substring(0, 50);
            AbstractC19074t.m100207e(substring, "substring(...)");
            customEditText.setText(substring);
            C29902l2 c29902l23 = this.f65533P0;
            if (c29902l23 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c29902l22 = c29902l23;
            }
            c29902l22.f138546q.setSelection(50);
            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, 50));
        }
    }

    /* renamed from: nM */
    public static final void m70674nM(Object[] objArr, CreateNewCollectionView createNewCollectionView) {
        C24799c c24799c;
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(objArr, "$args");
        AbstractC19074t.m100208f(createNewCollectionView, "this$0");
        Object obj = objArr[0];
        if (obj instanceof C24799c) {
            c24799c = (C24799c) obj;
        } else {
            c24799c = null;
        }
        if (c24799c != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("extra_collection_id", c24799c.m128824d());
            InterfaceC27218a m92676n2 = createNewCollectionView.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93069k2(CollectionDetailView.class, bundle, 1, true);
            }
        }
    }

    /* renamed from: oM */
    public static final void m70675oM(CreateNewCollectionView createNewCollectionView, int i11, String str, String str2) {
        AbstractC19074t.m100208f(createNewCollectionView, "this$0");
        AbstractC19074t.m100208f(str, "$successMsg");
        AbstractC19074t.m100208f(str2, "$errorMessage");
        C23459d.f113954a.m123170n(createNewCollectionView.f72421L0, i11, str, str2);
    }

    /* renamed from: pM */
    private final C12556c m70676pM() {
        return (C12556c) this.f65534Q0.getValue();
    }

    /* renamed from: qM */
    private final C29504u m70677qM() {
        return (C29504u) this.f65535R0.getValue();
    }

    /* renamed from: rM */
    public static final void m70678rM(CreateNewCollectionView createNewCollectionView, View view) {
        AbstractC19074t.m100208f(createNewCollectionView, "this$0");
        createNewCollectionView.m70681xg();
    }

    /* renamed from: sM */
    public static final void m70679sM(CreateNewCollectionView createNewCollectionView) {
        AbstractC19074t.m100208f(createNewCollectionView, "this$0");
        createNewCollectionView.m70681xg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:            if ((!r0) != false) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:            r2 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:            if (fn0.AbstractC19074t.m100204b(r1, r0.toString()) == false) goto L45;     */
    /* renamed from: tM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m70680tM() {
        boolean m127128x;
        boolean m127128x2;
        C29902l2 c29902l2 = this.f65533P0;
        String str = null;
        if (c29902l2 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29902l2 = null;
        }
        Editable text = c29902l2.f138546q.getText();
        boolean z11 = false;
        if (text != null) {
            if (m70676pM().m70727f() == 0) {
                if (text.length() > 0) {
                    m127128x2 = AbstractC24341v.m127128x(text);
                }
            } else if (text.length() > 0) {
                m127128x = AbstractC24341v.m127128x(text);
                if (!m127128x) {
                    C24799c c24799c = this.f65537T0;
                    if (c24799c != null) {
                        str = c24799c.m128827g();
                    }
                }
            }
        }
        Button button = this.f65536S0;
        if (button != null) {
            if (z11) {
                button.setTextColor(AbstractC23136l9.m118641B(button.getContext(), AbstractC2808b.f150821b60));
            } else {
                button.setTextColor(C23212s8.m119607o(button.getContext(), AbstractC2807a.text_03));
            }
            button.setEnabled(z11);
        }
    }

    /* renamed from: xg */
    private final void m70681xg() {
        C29902l2 c29902l2 = this.f65533P0;
        if (c29902l2 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29902l2 = null;
        }
        CustomEditText customEditText = c29902l2.f138546q;
        customEditText.clearFocus();
        customEditText.requestFocus();
        Editable text = customEditText.getText();
        if (text != null) {
            AbstractC19074t.m100205c(text);
            if (text.length() > 0) {
                customEditText.setSelection(text.length());
            }
        }
        AbstractC2379w.m12432f(customEditText);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (m70676pM().m70727f() == 1) {
            this.f65537T0 = C20843c0.Companion.m109092a().m109091x0(m70676pM().m70722a());
        }
        C21955a.f108070a.m114648o(m70676pM().m70723b());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        int i11;
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        actionBarMenu.m92750r();
        if (m70676pM().m70727f() == 0) {
            i11 = AbstractC8020f0.str_btn_create_new_collection;
        } else {
            i11 = AbstractC8020f0.str_btn_edit_collection;
        }
        View m92744k = actionBarMenu.m92744k(1, AbstractC7409c0.action_bar_menu_item_blue_text_only);
        AbstractC19074t.m100206d(m92744k, "null cannot be cast to non-null type android.widget.Button");
        Button button = (Button) m92744k;
        button.setText(m92652XI(i11));
        button.setTextSize(15.0f);
        this.f65536S0 = button;
        m70680tM();
        super.mo37482FJ(actionBarMenu);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29902l2 m148188c = C29902l2.m148188c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148188c, "inflate(...)");
        this.f65533P0 = m148188c;
        C29902l2 c29902l2 = null;
        if (m148188c == null) {
            AbstractC19074t.m100223u("viewBinding");
            m148188c = null;
        }
        CustomEditText customEditText = m148188c.f138546q;
        Context context = customEditText.getContext();
        AbstractC19074t.m100205c(context);
        customEditText.setClearDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_close_circle_solid_16, C23212s8.m119610r(AbstractC2807a.icon_01)));
        AbstractC19074t.m100205c(customEditText);
        customEditText.addTextChangedListener(new C12543c());
        customEditText.setOnClickListener(new View.OnClickListener() { // from class: x80.y
            public /* synthetic */ ViewOnClickListenerC29508y() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNewCollectionView.m70678rM(CreateNewCollectionView.this, view);
            }
        });
        m92637BK(true);
        C29902l2 c29902l22 = this.f65533P0;
        if (c29902l22 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29902l2 = c29902l22;
        }
        LinearLayout root = c29902l2.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 5204);
        bVar.m124119a().m124117e(this, 5211);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        C24799c c24799c;
        int i12;
        String str;
        C22537f m116593p;
        if (i11 == 1) {
            C29902l2 c29902l2 = this.f65533P0;
            C29902l2 c29902l22 = null;
            if (c29902l2 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29902l2 = null;
            }
            AbstractC2379w.m12430d(c29902l2.f138546q);
            if (m70676pM().m70727f() == 0) {
                C21373a c21373a = C21373a.f104231a;
                int size = c21373a.m110804t().size();
                if (size > 0) {
                    m116593p = AbstractC22543l.m116593p(0, size);
                    i12 = AbstractC22543l.m116591n(m116593p, AbstractC21317c.f103810p);
                } else {
                    i12 = -1;
                }
                if (i12 >= 0) {
                    str = (String) c21373a.m110804t().get(i12);
                } else {
                    str = "";
                }
                String str2 = str;
                AbstractC19074t.m100205c(str2);
                C29902l2 c29902l23 = this.f65533P0;
                if (c29902l23 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                } else {
                    c29902l22 = c29902l23;
                }
                m70677qM().m146733Ip(new C24799c(0L, String.valueOf(c29902l22.f138546q.getText()), 0, 0L, str2, 0L, null, 0L, null, false, false, 2029, null), m70676pM().m70726e(), C21955a.f108070a.m114642i(m70676pM().m70723b(), m70676pM().m70725d(), false), !m70676pM().m70726e().isEmpty(), m70676pM().m70724c());
            } else if (m70676pM().m70727f() == 1 && (c24799c = this.f65537T0) != null) {
                C29902l2 c29902l24 = this.f65533P0;
                if (c29902l24 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                } else {
                    c29902l22 = c29902l24;
                }
                c24799c.m128839s(String.valueOf(c29902l22.f138546q.getText()));
                m70677qM().m146734Jp(c24799c);
            }
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        int i11;
        int i12;
        super.mo37493TJ();
        if (m70676pM().m70727f() == 0) {
            i11 = AbstractC8020f0.str_title_action_bar_create_collection_view;
        } else {
            i11 = AbstractC8020f0.str_title_action_bar_edit_collection_view;
        }
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            if (C23212s8.m119603k()) {
                i12 = AbstractC2808b.light_icon_01;
            } else {
                i12 = AbstractC2808b.dark_icon_01;
            }
            Context context = actionBar.getContext();
            AbstractC19074t.m100205c(context);
            actionBar.setBackButtonDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_close_line_24, i12));
            actionBar.setTitleColor(C23212s8.m119607o(actionBar.getContext(), AbstractC21196a.TextColor1));
            actionBar.setBackgroundColor(C23212s8.m119607o(actionBar.getContext(), AbstractC16781w.HeaderFormColor));
            actionBar.setTitle(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            mo78955kl(new Runnable() { // from class: x80.x
                public /* synthetic */ RunnableC29507x() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CreateNewCollectionView.m70679sM(CreateNewCollectionView.this);
                }
            }, 500L);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        try {
            C29902l2 c29902l2 = this.f65533P0;
            if (c29902l2 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29902l2 = null;
            }
            AbstractC2379w.m12430d(c29902l2.f138546q);
            super.finish();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // x80.InterfaceC29503t
    /* renamed from: g */
    public void mo70682g() {
        finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CollectionListing";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: x80.w.<init>(com.zing.zalo.ui.mycloud.collection.CreateNewCollectionView, int, java.lang.String, java.lang.String):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int r5, java.lang.Object... r6) {
        /*
            r4 = this;
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            java.lang.String r1 = "args"
            fn0.AbstractC19074t.m100208f(r6, r1)
            int r1 = r6.length     // Catch: java.lang.Exception -> L53
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r6, r1)     // Catch: java.lang.Exception -> L53
            super.mo17795x(r5, r1)     // Catch: java.lang.Exception -> L53
            r1 = 5204(0x1454, float:7.292E-42)
            r2 = 0
            r3 = 1
            if (r5 == r1) goto L55
            r1 = 5211(0x145b, float:7.302E-42)
            if (r5 == r1) goto L1e
            r1 = 5212(0x145c, float:7.304E-42)
            if (r5 == r1) goto L1e
            goto L74
        L1e:
            int r5 = r6.length     // Catch: java.lang.Exception -> L4e
            if (r5 != 0) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            r5 = r5 ^ r3
            if (r5 == 0) goto L74
            r5 = r6[r2]     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            fn0.AbstractC19074t.m100206d(r5, r1)     // Catch: java.lang.Exception -> L4e
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L4e
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L4e
            r1 = r6[r3]     // Catch: java.lang.Exception -> L4e
            fn0.AbstractC19074t.m100206d(r1, r0)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L4e
            r2 = 2
            r6 = r6[r2]     // Catch: java.lang.Exception -> L4e
            fn0.AbstractC19074t.m100206d(r6, r0)     // Catch: java.lang.Exception -> L4e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L4e
            x80.w r0 = new x80.w     // Catch: java.lang.Exception -> L4e
            r0.<init>()     // Catch: java.lang.Exception -> L4e
            r5 = 300(0x12c, double:1.48E-321)
            r4.mo78955kl(r0, r5)     // Catch: java.lang.Exception -> L4e
            goto L74
        L4e:
            r5 = move-exception
            mm0.AbstractC23350e.m122778h(r5)     // Catch: java.lang.Exception -> L53
            goto L74
        L53:
            r5 = move-exception
            goto L71
        L55:
            int r5 = r6.length     // Catch: java.lang.Exception -> L53
            if (r5 != 0) goto L59
            r2 = 1
        L59:
            if (r2 != 0) goto L6d
            com.zing.zalo.ui.mycloud.collection.c r5 = r4.m70676pM()     // Catch: java.lang.Exception -> L53
            boolean r5 = r5.m70728g()     // Catch: java.lang.Exception -> L53
            if (r5 == 0) goto L6d
            x80.v r5 = new x80.v     // Catch: java.lang.Exception -> L53
            r5.<init>()     // Catch: java.lang.Exception -> L53
            gg0.AbstractC19444a.m101697e(r5)     // Catch: java.lang.Exception -> L53
        L6d:
            r4.mo70682g()     // Catch: java.lang.Exception -> L53
            goto L74
        L71:
            mm0.AbstractC23350e.m122778h(r5)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.mycloud.collection.CreateNewCollectionView.mo17795x(int, java.lang.Object[]):void");
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        C24799c c24799c;
        super.mo37135xJ(bundle);
        if (m70676pM().m70727f() == 1 && (c24799c = this.f65537T0) != null) {
            C29902l2 c29902l2 = this.f65533P0;
            if (c29902l2 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29902l2 = null;
            }
            c29902l2.f138546q.setText(c24799c.m128821a());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 5204);
        bVar.m124119a().m124115b(this, 5211);
    }
}
