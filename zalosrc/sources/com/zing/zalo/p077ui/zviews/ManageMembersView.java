package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import am.AbstractC0924m0;
import am.C0943w;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7149n3;
import com.zing.zalo.adapters.GroupFullMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.zviews.GroupSearchMemberView;
import com.zing.zalo.uicontrol.ViewPagerCustomSwipeable;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p649xl.C30083v7;
import p716zh.C31973j5;
import p716zh.C31986k3;
import p716zh.C32076q5;
import qm0.AbstractC25358n;
import qm0.AbstractC25368s;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class ManageMembersView extends RemoveGroupMemberBaseView implements ViewPager.InterfaceC6875j, C23744a.c, InterfaceC0733x {
    public static final C14568a Companion = new C14568a(null);

    /* renamed from: r1 */
    private static final String f74984r1;

    /* renamed from: s1 */
    private static ArrayList f74985s1;

    /* renamed from: t1 */
    private static ArrayList f74986t1;

    /* renamed from: u1 */
    private static int f74987u1;

    /* renamed from: v1 */
    private static boolean f74988v1;

    /* renamed from: w1 */
    private static int f74989w1;

    /* renamed from: j1 */
    private C23528a f74990j1;

    /* renamed from: k1 */
    public C7149n3 f74991k1;

    /* renamed from: n1 */
    private C31973j5 f74994n1;

    /* renamed from: o1 */
    private C17487o0 f74995o1;

    /* renamed from: q1 */
    public C30083v7 f74997q1;

    /* renamed from: l1 */
    private final HashMap f74992l1 = new HashMap();

    /* renamed from: m1 */
    private String f74993m1 = "";

    /* renamed from: p1 */
    private String f74996p1 = "";

    /* renamed from: com.zing.zalo.ui.zviews.ManageMembersView$a */
    /* loaded from: classes6.dex */
    public static final class C14568a {
        private C14568a() {
        }

        public /* synthetic */ C14568a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ArrayList m81553a() {
            return ManageMembersView.f74986t1;
        }

        /* renamed from: b */
        public final ArrayList m81554b() {
            return ManageMembersView.f74985s1;
        }

        /* renamed from: c */
        public final void m81555c(boolean z11) {
            ManageMembersView.f74988v1 = z11;
        }

        /* renamed from: d */
        public final void m81556d(int i11) {
            ManageMembersView.f74987u1 = i11;
        }

        /* renamed from: e */
        public final void m81557e(int i11) {
            ManageMembersView.f74989w1 = i11;
        }

        /* renamed from: f */
        public final void m81558f(ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "<set-?>");
            ManageMembersView.f74986t1 = arrayList;
        }

        /* renamed from: g */
        public final void m81559g(ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "<set-?>");
            ManageMembersView.f74985s1 = arrayList;
        }
    }

    static {
        String name = ManageMembersView.class.getName();
        AbstractC19074t.m100207e(name, "getName(...)");
        f74984r1 = name;
        f74985s1 = new ArrayList();
        f74986t1 = new ArrayList();
        f74988v1 = true;
    }

    /* renamed from: aN */
    private final void m81539aN() {
        boolean m131390w;
        C31973j5 c31973j5 = this.f74994n1;
        if (c31973j5 != null && c31973j5.m153747Y()) {
            m81549YM().f139670v.setText(AbstractC8020f0.str_community_tab_owner_admin);
        }
        HashMap hashMap = this.f74992l1;
        hashMap.put(0, m81549YM().f139667s);
        hashMap.put(1, m81549YM().f139670v);
        hashMap.put(2, m81549YM().f139669u);
        Integer[] m36370C = m81550ZM().m36370C();
        for (Integer num : this.f74992l1.keySet()) {
            View view = (View) this.f74992l1.get(num);
            if (view != null) {
                AbstractC19074t.m100205c(num);
                m131390w = AbstractC25358n.m131390w(m36370C, num);
                if (m131390w) {
                    view.setVisibility(0);
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.yw

                        /* renamed from: q */
                        public final /* synthetic */ Integer f82780q;

                        public /* synthetic */ ViewOnClickListenerC16391yw(Integer num2) {
                            r2 = num2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ManageMembersView.m81540bN(ManageMembersView.this, r2, view2);
                        }
                    });
                    this.f74992l1.put(num2, view);
                } else {
                    view.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: bN */
    public static final void m81540bN(ManageMembersView manageMembersView, Integer num, View view) {
        AbstractC19074t.m100208f(manageMembersView, "this$0");
        AbstractC19074t.m100208f(num, "$tabId");
        manageMembersView.m81545gN(num.intValue());
    }

    /* renamed from: cN */
    private final void m81541cN() {
        C17487o0 mo35579p;
        C32076q5 m4476k = C0943w.m4462l().m4476k(this.f74993m1);
        if (m4476k != null && C31986k3.f147083a.m154108R1(m4476k.m154721j()) && m4476k.m154717f() >= AbstractC0924m0.m4248u3()) {
            ToastUtils.m89266n(AbstractC8020f0.str_group_exceed_max_member_e2ee, Integer.valueOf(AbstractC0924m0.m4248u3()));
            return;
        }
        AbstractC23647d.m123897g("1591119");
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", this.f74993m1);
        bundle.putBoolean("BOL_EXTRA_FROM_GROUP_MEMEBER", true);
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", 3);
        if (f74986t1.size() > 0) {
            bundle.putString("extra_preload_data", InviteToCreateGroupView.m80904EM(this.f74993m1, f74986t1));
        }
        bundle.putString("STR_SOURCE_START_VIEW", "gr_member_manage");
        bundle.putString("STR_LOG_CHAT_TYPE", "2");
        bundle.putBoolean("BOL_EXTRA_HAS_TIP", false);
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(InviteToCreateGroupView.class, bundle, 1, true);
        }
    }

    /* renamed from: dN */
    private final void m81542dN() {
        AbstractC23647d.m123897g("1591118");
        m81547kN();
    }

    /* renamed from: eN */
    public static final void m81543eN(ManageMembersView manageMembersView, View view) {
        AbstractC19074t.m100208f(manageMembersView, "this$0");
        manageMembersView.m81541cN();
    }

    /* renamed from: fN */
    public static final void m81544fN(ManageMembersView manageMembersView, View view) {
        AbstractC19074t.m100208f(manageMembersView, "this$0");
        manageMembersView.m81542dN();
    }

    /* renamed from: gN */
    private final void m81545gN(int i11) {
        int m36371D = m81550ZM().m36371D(i11);
        if (m36371D >= 0 && m81549YM().f139671w.getCurrentItem() != m36371D) {
            m81549YM().f139671w.setCurrentItem(m36371D, false);
        }
    }

    /* renamed from: jN */
    private final void m81546jN(GroupSearchMemberView groupSearchMemberView) {
        ContactProfile contactProfile;
        groupSearchMemberView.f72337r1 = new ArrayList();
        Iterator it = f74985s1.iterator();
        while (it.hasNext()) {
            GroupFullMemberAdapter.C6938b c6938b = (GroupFullMemberAdapter.C6938b) it.next();
            if (c6938b.f38021a == 0 && (contactProfile = c6938b.f38022b) != null && !groupSearchMemberView.f72330k1.containsKey(contactProfile.f42434r)) {
                GroupFullMemberAdapter.C6938b m35648a = c6938b.m35648a();
                groupSearchMemberView.f72337r1.add(m35648a);
                HashMap hashMap = groupSearchMemberView.f72330k1;
                String str = contactProfile.f42434r;
                AbstractC19074t.m100207e(str, "uid");
                hashMap.put(str, m35648a);
                if (m35648a.f38025e) {
                    String str2 = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str2, "uid");
                    groupSearchMemberView.f72342w1 = str2;
                }
            }
        }
        groupSearchMemberView.f72323A1 = f74987u1;
        groupSearchMemberView.f72324B1 = f74989w1;
        groupSearchMemberView.f72345z1 = f74988v1;
    }

    /* renamed from: kN */
    private final void m81547kN() {
        try {
            GroupSearchMemberView.C14443a c14443a = GroupSearchMemberView.Companion;
            Bundle m80642a = c14443a.m80642a(m92652XI(AbstractC8020f0.str_chat_group_member_title));
            m80642a.putString("extra_group_id", this.f74993m1);
            GroupSearchMemberView m80643b = c14443a.m80643b(m80642a);
            m81546jN(m80643b);
            this.f72421L0.m92649TI().m93060e2(AbstractC6918a0.search_container, m80643b, "GroupSearchMemberView", 0, true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033 A[SYNTHETIC] */
    /* renamed from: lN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m81548lN(int i11) {
        boolean z11;
        try {
            for (Integer num : this.f74992l1.keySet()) {
                View view = (View) this.f74992l1.get(num);
                if (view != null) {
                    if (num != null && num.intValue() == i11) {
                        z11 = true;
                        view.setSelected(z11);
                        if (i11 == 1) {
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    AbstractC23647d.m123897g("1591043");
                                }
                            } else {
                                AbstractC23647d.m123897g("1591123");
                            }
                        } else {
                            AbstractC23647d.m123897g("1591029");
                        }
                    }
                    z11 = false;
                    view.setSelected(z11);
                    if (i11 == 1) {
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f74984r1, e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        try {
            super.mo37111CJ(bundle);
            InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
            if (m92676n2 != null && m92676n2.getWindow() != null) {
                m92676n2.mo35554O(32);
            }
            this.f74995o1 = this.f72421L0.m92662fJ();
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null && m92642L3.containsKey("extra_group_id")) {
                String string = m92642L3.getString("extra_group_id");
                this.f74993m1 = string;
                this.f74994n1 = C0943w.f3447a.m4472f(string);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30083v7 m148613a = C30083v7.m148613a(layoutInflater.inflate(AbstractC7409c0.manage_members_view, viewGroup, false));
        AbstractC19074t.m100207e(m148613a, "bind(...)");
        m81551hN(m148613a);
        ViewPagerCustomSwipeable viewPagerCustomSwipeable = m81549YM().f139671w;
        viewPagerCustomSwipeable.setDrawingCacheEnabled(true);
        viewPagerCustomSwipeable.setAlwaysDrawnWithCacheEnabled(true);
        viewPagerCustomSwipeable.setDrawingCacheQuality(ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE);
        viewPagerCustomSwipeable.setOffscreenPageLimit(4);
        viewPagerCustomSwipeable.setSwipeEnabled(false);
        viewPagerCustomSwipeable.addOnPageChangeListener(this);
        this.f74990j1 = new C23528a(this.f72421L0.m92648SI());
        FrameLayout root = m81549YM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.RemoveGroupMemberBaseView
    /* renamed from: HM */
    public void mo78398HM() {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.Companion.m124119a().m124117e(this, 27);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            C31973j5 c31973j5 = this.f74994n1;
            if (c31973j5 != null && c31973j5.m153742T()) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_member_setting_header);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            } else {
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_chat_group_member_title);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                m87077NK.setMiddleTitle(m118743r02);
            }
            C31973j5 c31973j52 = this.f74994n1;
            if (c31973j52 != null && c31973j52.m153747Y()) {
                Context context = m87077NK.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                Drawable m139658a = C27280g.m139658a(context, AbstractC23322a.zds_ic_create_group_line_24);
                if (m139658a != null) {
                    m87077NK.setTrailingIconButton(m139658a);
                }
            }
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ww
                public /* synthetic */ ViewOnClickListenerC16317ww() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManageMembersView.m81543eN(ManageMembersView.this, view);
                }
            });
            m87077NK.setOnClickListenerTrailingButton2(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.xw
                public /* synthetic */ ViewOnClickListenerC16354xw() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManageMembersView.m81544fN(ManageMembersView.this, view);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        try {
            super.mo37118SJ(bundle);
            bundle.putInt("tabId", m81550ZM().m36369B(m81549YM().f139671w.getCurrentItem()));
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f74984r1, e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        InterfaceC27218a m92676n2;
        super.mo37122XJ(z11, z12);
        if (m92672lJ() && m92674mJ() && (m92676n2 = this.f72421L0.m92676n2()) != null && z11 && m92676n2.getWindow() != null) {
            m92676n2.mo35554O(32);
        }
    }

    /* renamed from: YM */
    public final C30083v7 m81549YM() {
        C30083v7 c30083v7 = this.f74997q1;
        if (c30083v7 != null) {
            return c30083v7;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: ZM */
    public final C7149n3 m81550ZM() {
        C7149n3 c7149n3 = this.f74991k1;
        if (c7149n3 != null) {
            return c7149n3;
        }
        AbstractC19074t.m100223u("mTabAdapter");
        return null;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ManageMembersView";
    }

    /* renamed from: hN */
    public final void m81551hN(C30083v7 c30083v7) {
        AbstractC19074t.m100208f(c30083v7, "<set-?>");
        this.f74997q1 = c30083v7;
    }

    /* renamed from: iN */
    public final void m81552iN(C7149n3 c7149n3) {
        AbstractC19074t.m100208f(c7149n3, "<set-?>");
        this.f74991k1 = c7149n3;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        switch (i11) {
            case 101:
            case 103:
            case 104:
            case 105:
                this.f72421L0.m92643OI(i11, i12, intent);
                return;
            case 102:
            default:
                return;
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrollStateChanged(int i11) {
        if (i11 == 0) {
            m81550ZM().m36372E(m81549YM().f139671w.getCurrentItem());
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrolled(int i11, float f11, int i12) {
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageSelected(int i11) {
        m81550ZM().m36372E(i11);
        m81548lN(m81550ZM().m36369B(i11));
    }

    @Override // com.zing.zalo.p077ui.zviews.RemoveGroupMemberBaseView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C23744a.Companion.m124119a().m124115b(this, 27);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        List m131505m;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 27 && objArr.length >= 3) {
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = objArr[1];
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            Object obj3 = objArr[2];
            AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.String");
            String[] split = TextUtils.split((String) obj3, ";");
            AbstractC19074t.m100207e(split, "split(...)");
            m131505m = AbstractC25368s.m131505m(Arrays.copyOf(split, split.length));
            boolean contains = new ArrayList(m131505m).contains(CoreUtility.f89233i);
            if (AbstractC19074t.m100204b(this.f74993m1, (String) obj)) {
                if ((intValue == 4 || intValue == 10) && contains) {
                    finish();
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        boolean z11;
        boolean z12;
        int i11;
        String str;
        String optString;
        super.mo37135xJ(bundle);
        try {
            C17487o0 m92649TI = this.f72421L0.m92649TI();
            String str2 = this.f74993m1;
            AbstractC19074t.m100205c(str2);
            C31973j5 c31973j5 = this.f74994n1;
            if (c31973j5 != null) {
                z11 = c31973j5.m153742T();
            } else {
                z11 = false;
            }
            C31973j5 c31973j52 = this.f74994n1;
            if (c31973j52 != null) {
                z12 = c31973j52.m153747Y();
            } else {
                z12 = false;
            }
            m81552iN(new C7149n3(m92649TI, str2, z11, z12));
            m81539aN();
            m81549YM().f139671w.setAdapter(m81550ZM());
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                if (m92642L3.getBoolean("EXTRA_IS_SHOW_SEARCH_MODE", false)) {
                    m81547kN();
                }
                String string = m92642L3.getString("STR_SOURCE_START_VIEW", "");
                AbstractC19074t.m100207e(string, "getString(...)");
                this.f74996p1 = string;
            }
            try {
                if (bundle != null) {
                    i11 = bundle.getInt("tabId");
                } else {
                    try {
                        Bundle m92642L32 = m92642L3();
                        if (m92642L32 != null) {
                            str = m92642L32.getString("actionCommonData");
                        } else {
                            str = null;
                        }
                        if (str != null && !TextUtils.isEmpty(str) && (optString = new JSONObject(str).optString("view_id")) != null) {
                            switch (optString.hashCode()) {
                                case -1077769574:
                                    optString.equals("member");
                                    break;
                                case -21437972:
                                    if (!optString.equals("blocked")) {
                                        break;
                                    } else {
                                        i11 = 3;
                                        break;
                                    }
                                case 92668751:
                                    if (!optString.equals("admin")) {
                                        break;
                                    } else {
                                        i11 = 1;
                                        break;
                                    }
                                case 1960030843:
                                    if (!optString.equals("invited")) {
                                        break;
                                    } else {
                                        i11 = 2;
                                        break;
                                    }
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                    i11 = 0;
                }
                int m36371D = m81550ZM().m36371D(i11);
                if (m36371D < 0) {
                    m36371D = 0;
                }
                m81549YM().f139671w.setCurrentItem(m36371D, false);
                if (m36371D == 0) {
                    m81548lN(m81550ZM().m36369B(m36371D));
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
            C0815e1.m2075D().m2100V(new C23648e(5, this.f74996p1, 1, "gr_member_manage", "2"), false);
        } catch (Exception e13) {
            AbstractC23350e.m122776f(f74984r1, e13);
        }
    }
}
