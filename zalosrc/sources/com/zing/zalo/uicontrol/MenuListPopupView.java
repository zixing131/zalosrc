package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.adapters.C7256x0;
import com.zing.zalo.adapters.ViewOnClickListenerC7267y0;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import zl0.AbstractC32226c;

/* loaded from: classes4.dex */
public class MenuListPopupView extends ContentPickerPopupView {

    /* renamed from: O0 */
    View f83207O0;

    /* renamed from: P0 */
    ExpandableListView f83208P0;

    /* renamed from: Q0 */
    ListView f83209Q0;

    /* renamed from: S0 */
    protected boolean f83211S0;

    /* renamed from: T0 */
    View f83212T0;

    /* renamed from: U0 */
    int f83213U0;

    /* renamed from: V0 */
    int f83214V0;

    /* renamed from: X0 */
    protected boolean f83216X0;

    /* renamed from: Y0 */
    String f83217Y0;

    /* renamed from: Z0 */
    C7145n.a f83218Z0;

    /* renamed from: a1 */
    ViewOnClickListenerC7267y0.a f83219a1;

    /* renamed from: b1 */
    InterfaceC16465c f83220b1;

    /* renamed from: c1 */
    View f83221c1;

    /* renamed from: d1 */
    LinearLayout f83222d1;

    /* renamed from: e1 */
    TextView f83223e1;

    /* renamed from: f1 */
    C7145n f83224f1;

    /* renamed from: g1 */
    RelativeLayout f83225g1;

    /* renamed from: i1 */
    RobotoTextView f83227i1;

    /* renamed from: j1 */
    C7256x0 f83228j1;

    /* renamed from: R0 */
    long f83210R0 = 1;

    /* renamed from: W0 */
    int f83215W0 = 0;

    /* renamed from: h1 */
    boolean f83226h1 = false;

    /* renamed from: k1 */
    int f83229k1 = 1;

    /* renamed from: com.zing.zalo.uicontrol.MenuListPopupView$a */
    /* loaded from: classes4.dex */
    public class C16463a implements AbsListView.OnScrollListener {

        /* renamed from: p */
        final /* synthetic */ ViewOnClickListenerC7267y0 f83230p;

        C16463a(ViewOnClickListenerC7267y0 viewOnClickListenerC7267y0) {
            this.f83230p = viewOnClickListenerC7267y0;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    ViewOnClickListenerC7267y0 viewOnClickListenerC7267y0 = this.f83230p;
                    if (viewOnClickListenerC7267y0 != null) {
                        viewOnClickListenerC7267y0.m37021c(false);
                        this.f83230p.notifyDataSetChanged();
                    }
                } else {
                    ViewOnClickListenerC7267y0 viewOnClickListenerC7267y02 = this.f83230p;
                    if (viewOnClickListenerC7267y02 != null) {
                        viewOnClickListenerC7267y02.m37021c(true);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.MenuListPopupView$b */
    /* loaded from: classes4.dex */
    public class C16464b implements InterfaceC16465c {

        /* renamed from: b */
        final /* synthetic */ List f83233b;

        /* renamed from: c */
        final /* synthetic */ int f83234c;

        /* renamed from: d */
        final /* synthetic */ int f83235d;

        /* renamed from: com.zing.zalo.uicontrol.MenuListPopupView$b$a */
        /* loaded from: classes4.dex */
        class a implements ViewTreeObserver.OnPreDrawListener {
            a() {
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                MenuListPopupView.this.f83660J0.getViewTreeObserver().removeOnPreDrawListener(this);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) MenuListPopupView.this.f83660J0.getLayoutParams();
                C16464b c16464b = C16464b.this;
                int i11 = c16464b.f83235d;
                View rootView = MenuListPopupView.this.f83660J0.getRootView();
                int i12 = i11 - AbstractC32226c.m155407f(rootView).top;
                int[] iArr = new int[2];
                rootView.getLocationOnScreen(iArr);
                marginLayoutParams.topMargin = i12 - iArr[1];
                MenuListPopupView.this.f83660J0.setLayoutParams(marginLayoutParams);
                return false;
            }
        }

        C16464b(List list, int i11, int i12) {
            this.f83233b = list;
            this.f83234c = i11;
            this.f83235d = i12;
        }

        @Override // com.zing.zalo.uicontrol.MenuListPopupView.InterfaceC16465c
        /* renamed from: a */
        public void mo87765a() {
            WindowManager.LayoutParams m92901h;
            try {
                MenuListPopupView.this.m87755DL(this.f83233b, this.f83234c);
                if (MenuListPopupView.this.m92594JK() != null && MenuListPopupView.this.m92594JK().m92867k() != null && (m92901h = MenuListPopupView.this.m92594JK().m92867k().m92901h()) != null) {
                    m92901h.height = -1;
                    MenuListPopupView.this.m92594JK().m92867k().m92912v(m92901h);
                }
                MenuListPopupView menuListPopupView = MenuListPopupView.this;
                View view = menuListPopupView.f83660J0;
                if (view != null) {
                    view.setBackgroundColor(menuListPopupView.m92651WI().getColor(AbstractC16801x.black_60));
                    MenuListPopupView.this.f83660J0.getViewTreeObserver().addOnPreDrawListener(new a());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.MenuListPopupView$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC16465c {
        /* renamed from: a */
        void mo87765a();
    }

    /* renamed from: HL */
    public static void m87740HL(MenuListPopupView menuListPopupView, List list) {
        if (menuListPopupView != null) {
            menuListPopupView.m87759IL(new InterfaceC16465c() { // from class: com.zing.zalo.uicontrol.a0

                /* renamed from: b */
                public final /* synthetic */ List f83634b;

                public /* synthetic */ C16556a0(List list2) {
                    r2 = list2;
                }

                @Override // com.zing.zalo.uicontrol.MenuListPopupView.InterfaceC16465c
                /* renamed from: a */
                public final void mo87765a() {
                    MenuListPopupView.this.mo87757FL(r2);
                }
            });
        }
    }

    /* renamed from: oL */
    public static MenuListPopupView m87745oL(Context context, boolean z11, PrivacyInfo privacyInfo, C7145n.a aVar, int i11) {
        boolean z12;
        try {
            PrivacyInfo.m45135z(false);
            PrivacyInfo.m45121B(false);
            ArrayList arrayList = new ArrayList();
            C7256x0.b bVar = new C7256x0.b(1, 40, context.getString(AbstractC8020f0.str_privacy_share_all_title), context.getString(AbstractC8020f0.str_privacy_share_all_hint));
            bVar.f39821f = false;
            bVar.f39827l = true;
            bVar.f39828m = AbstractC16803z.icn_profile_form_friends;
            arrayList.add(bVar);
            C7256x0.b bVar2 = new C7256x0.b(1, 50, context.getString(AbstractC8020f0.str_privacy_share_only_me_title), context.getString(AbstractC8020f0.str_privacy_share_only_me_hint));
            bVar2.f39827l = true;
            bVar2.f39828m = AbstractC16803z.icn_profile_form_private;
            arrayList.add(bVar2);
            C7256x0.b bVar3 = new C7256x0.b(1, -1, context.getString(AbstractC8020f0.str_privacy_share_to_selected_friends), context.getString(AbstractC8020f0.str_privacy_share_to_selected_friends_hint));
            bVar3.f39827l = true;
            bVar3.f39828m = AbstractC16803z.icn_profile_form_selected_friends;
            ArrayList arrayList2 = new ArrayList();
            List list = PrivacyInfo.f45971u;
            if (list != null && !list.isEmpty()) {
                for (PrivacyInfo privacyInfo2 : PrivacyInfo.f45971u) {
                    privacyInfo2.m45139f();
                    C7256x0.b bVar4 = new C7256x0.b(1, privacyInfo2.f45977t, String.format(context.getString(AbstractC8020f0.str_privacy_to_friend_count), Integer.valueOf(privacyInfo2.f45974q.size())), privacyInfo2.f45975r);
                    bVar4.f39824i = true;
                    arrayList2.add(bVar4);
                }
            }
            C7256x0.b bVar5 = new C7256x0.b(1, 70, context.getString(AbstractC8020f0.str_privacy_share_to_contact), context.getString(AbstractC8020f0.str_privacy_share_to_friends_hint));
            bVar5.f39822g = true;
            C7256x0.b bVar6 = new C7256x0.b(1, 80, context.getString(AbstractC8020f0.str_privacy_share_to_group), context.getString(AbstractC8020f0.str_privacy_share_to_group_hint));
            bVar6.f39822g = true;
            arrayList2.add(bVar5);
            arrayList2.add(bVar6);
            ArrayList arrayList3 = new ArrayList(arrayList2);
            bVar3.f39816a = arrayList3;
            bVar3.f39822g = true;
            if (arrayList3.size() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            bVar3.f39825j = z12;
            arrayList.add(bVar3);
            String string = context.getString(AbstractC8020f0.str_privacy_except_friends_hint_default);
            PrivacyInfo privacyInfo3 = PrivacyInfo.f45972v;
            if (privacyInfo3 != null && !TextUtils.isEmpty(privacyInfo3.f45975r)) {
                PrivacyInfo.f45972v.m45139f();
                string = PrivacyInfo.f45972v.f45975r;
            }
            C7256x0.b bVar7 = new C7256x0.b(1, 90, context.getString(AbstractC8020f0.str_privacy_except_friends), string);
            bVar7.f39822g = true;
            bVar7.f39827l = true;
            bVar7.f39828m = AbstractC16803z.icn_profile_form_except;
            arrayList.add(bVar7);
            C7256x0.b m37015a = C7256x0.b.m37015a(arrayList, privacyInfo.f45977t);
            if (m37015a != null) {
                m37015a.f39823h = true;
                int i12 = privacyInfo.f45977t;
                if (i12 != 40 && i12 != 90) {
                    if (privacyInfo.f45974q.isEmpty()) {
                        if (i11 > 0) {
                            m37015a.f39820e = context.getString(AbstractC8020f0.str_privacy_only_me_hint_with_tag);
                        } else {
                            m37015a.f39820e = context.getString(AbstractC8020f0.str_privacy_share_only_me_hint);
                        }
                    } else if (i11 > 0) {
                        if (privacyInfo.f45977t == 50) {
                            m37015a.f39820e = context.getString(AbstractC8020f0.str_privacy_only_me_hint_with_tag);
                        } else {
                            m37015a.f39820e = String.format(context.getString(AbstractC8020f0.str_privacy_mylist_hint_with_tag), Integer.valueOf(privacyInfo.f45974q.size()));
                        }
                    }
                }
            }
            Bundle bundle = new Bundle();
            bundle.putInt("gravity", 80);
            bundle.putBoolean("showArrow", false);
            bundle.putBoolean("showTitle", !z11);
            bundle.putInt("window_animation_type", 1);
            bundle.putBoolean("show_header_privacy", z11);
            bundle.putInt("extra_list_item_mode", 2);
            MenuListPopupView menuListPopupView = new MenuListPopupView();
            menuListPopupView.m87758GL(aVar);
            menuListPopupView.mo60305zK(bundle);
            menuListPopupView.m92601SK(2, 0);
            menuListPopupView.m87759IL(new InterfaceC16465c() { // from class: com.zing.zalo.uicontrol.x

                /* renamed from: b */
                public final /* synthetic */ List f84577b;

                public /* synthetic */ C16676x(List arrayList4) {
                    r2 = arrayList4;
                }

                @Override // com.zing.zalo.uicontrol.MenuListPopupView.InterfaceC16465c
                /* renamed from: a */
                public final void mo87765a() {
                    MenuListPopupView.m87750xL(MenuListPopupView.this, r2);
                }
            });
            return menuListPopupView;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: pL */
    public static MenuListPopupView m87746pL(ActionBar actionBar, List list, ViewOnClickListenerC7267y0.a aVar, int i11) {
        int m118716i0 = AbstractC23136l9.m118716i0(actionBar.getContext());
        Rect m87749uL = m87749uL(actionBar);
        int i12 = m87749uL.bottom;
        MenuListPopupView menuListPopupView = new MenuListPopupView();
        menuListPopupView.m87756EL(aVar);
        Bundle bundle = new Bundle();
        bundle.putInt("y", m87749uL.bottom);
        bundle.putInt("gravity", 51);
        bundle.putInt("content_max_height", ((m118716i0 - i12) * 3) / 4);
        bundle.putInt("window_animation_type", 2);
        bundle.putInt("width", actionBar.getWidth());
        bundle.putBoolean("showDim", false);
        menuListPopupView.mo60305zK(bundle);
        menuListPopupView.m92601SK(2, 0);
        menuListPopupView.m87759IL(new C16464b(list, i11, i12));
        return menuListPopupView;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019d A[EDGE_INSN: B:42:0x019d->B:38:0x019d BREAK  A[LOOP:1: B:20:0x0136->B:41:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* renamed from: qL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MenuListPopupView m87747qL(Context context, boolean z11, PrivacyInfo privacyInfo, C7145n.a aVar, int i11) {
        Iterator it;
        PrivacyInfo.m45135z(false);
        PrivacyInfo.m45121B(false);
        ArrayList arrayList = new ArrayList();
        C7145n.b bVar = new C7145n.b(context, 1, 40, context.getString(AbstractC8020f0.str_privacy_share_all), context.getString(AbstractC8020f0.str_privacy_share_all_hint));
        C7145n.b bVar2 = new C7145n.b(context, 1, 50, context.getString(AbstractC8020f0.str_privacy_share_only_me), context.getString(AbstractC8020f0.str_privacy_share_only_me_hint));
        bVar.f39071k = false;
        arrayList.add(bVar);
        arrayList.add(bVar2);
        if (z11) {
            List<PrivacyInfo> list = PrivacyInfo.f45971u;
            if (list != null) {
                for (PrivacyInfo privacyInfo2 : list) {
                    privacyInfo2.m45139f();
                    C7145n.b bVar3 = new C7145n.b(context, 1, privacyInfo2.f45977t, String.format(context.getString(AbstractC8020f0.str_privacy_to_friend_count), Integer.valueOf(privacyInfo2.f45974q.size())), privacyInfo2.f45975r);
                    bVar3.f39074n = true;
                    arrayList.add(bVar3);
                }
            }
        } else if (privacyInfo.f45977t == 1000) {
            C7145n.b bVar4 = new C7145n.b(context, 1, 1000, String.format(context.getString(AbstractC8020f0.str_privacy_to_friend_count), Integer.valueOf(privacyInfo.f45974q.size())), privacyInfo.f45975r);
            bVar4.f39074n = true;
            arrayList.add(bVar4);
            String string = context.getString(AbstractC8020f0.str_privacy_except_friends_hint_default);
            if (!z11) {
                PrivacyInfo privacyInfo3 = PrivacyInfo.f45972v;
                if (privacyInfo3 != null && !TextUtils.isEmpty(privacyInfo3.f45975r)) {
                    PrivacyInfo.f45972v.m45139f();
                    string = PrivacyInfo.f45972v.f45975r;
                }
            } else if (privacyInfo.f45977t == 90 && !TextUtils.isEmpty(privacyInfo.f45975r)) {
                string = privacyInfo.f45975r;
            }
            C7145n.b bVar5 = new C7145n.b(context, 1, 90, context.getString(AbstractC8020f0.str_privacy_except_friends), string);
            bVar5.m36365f(true, true);
            arrayList.add(bVar5);
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    break;
                }
                C7145n.b bVar6 = (C7145n.b) it.next();
                int m36361a = bVar6.m36361a();
                int i12 = privacyInfo.f45977t;
                if (m36361a == i12) {
                    bVar6.f39073m = true;
                    if (i12 != 40 && i12 != 90) {
                        if (privacyInfo.f45974q.isEmpty()) {
                            if (i11 > 0) {
                                bVar6.m36364e(context.getString(AbstractC8020f0.str_privacy_only_me_hint_with_tag));
                            } else {
                                bVar6.m36364e(context.getString(AbstractC8020f0.str_privacy_share_only_me_hint));
                            }
                        } else if (i11 > 0) {
                            if (privacyInfo.f45977t == 50) {
                                bVar6.m36364e(context.getString(AbstractC8020f0.str_privacy_only_me_hint_with_tag));
                            } else {
                                bVar6.m36364e(String.format(context.getString(AbstractC8020f0.str_privacy_mylist_hint_with_tag), Integer.valueOf(privacyInfo.f45974q.size())));
                            }
                        }
                    }
                }
            }
            Bundle bundle = new Bundle();
            bundle.putInt("gravity", 80);
            bundle.putBoolean("showArrow", false);
            bundle.putBoolean("showTitle", !z11);
            bundle.putInt("window_animation_type", 1);
            bundle.putBoolean("show_header_privacy", z11);
            MenuListPopupView menuListPopupView = new MenuListPopupView();
            menuListPopupView.m87758GL(aVar);
            menuListPopupView.mo60305zK(bundle);
            menuListPopupView.m92601SK(2, 0);
            menuListPopupView.m87759IL(new InterfaceC16465c() { // from class: com.zing.zalo.uicontrol.y

                /* renamed from: b */
                public final /* synthetic */ List f84580b;

                public /* synthetic */ C16679y(List arrayList2) {
                    r2 = arrayList2;
                }

                @Override // com.zing.zalo.uicontrol.MenuListPopupView.InterfaceC16465c
                /* renamed from: a */
                public final void mo87765a() {
                    MenuListPopupView.this.m87760JL(r2);
                }
            });
            return menuListPopupView;
        }
        C7145n.b bVar7 = new C7145n.b(context, 1, 70, context.getString(AbstractC8020f0.str_privacy_share_to_friends), context.getString(AbstractC8020f0.str_privacy_share_to_friends_hint));
        bVar7.m36365f(true, true);
        C7145n.b bVar8 = new C7145n.b(context, 1, 80, context.getString(AbstractC8020f0.str_privacy_share_to_group), context.getString(AbstractC8020f0.str_privacy_share_to_group_hint));
        bVar8.m36365f(true, true);
        arrayList2.add(bVar7);
        arrayList2.add(bVar8);
        String string2 = context.getString(AbstractC8020f0.str_privacy_except_friends_hint_default);
        if (!z11) {
        }
        C7145n.b bVar52 = new C7145n.b(context, 1, 90, context.getString(AbstractC8020f0.str_privacy_except_friends), string2);
        bVar52.m36365f(true, true);
        arrayList2.add(bVar52);
        it = arrayList2.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("gravity", 80);
        bundle2.putBoolean("showArrow", false);
        bundle2.putBoolean("showTitle", !z11);
        bundle2.putInt("window_animation_type", 1);
        bundle2.putBoolean("show_header_privacy", z11);
        MenuListPopupView menuListPopupView2 = new MenuListPopupView();
        menuListPopupView2.m87758GL(aVar);
        menuListPopupView2.mo60305zK(bundle2);
        menuListPopupView2.m92601SK(2, 0);
        menuListPopupView2.m87759IL(new InterfaceC16465c() { // from class: com.zing.zalo.uicontrol.y

            /* renamed from: b */
            public final /* synthetic */ List f84580b;

            public /* synthetic */ C16679y(List arrayList2) {
                r2 = arrayList2;
            }

            @Override // com.zing.zalo.uicontrol.MenuListPopupView.InterfaceC16465c
            /* renamed from: a */
            public final void mo87765a() {
                MenuListPopupView.this.m87760JL(r2);
            }
        });
        return menuListPopupView2;
    }

    /* renamed from: rL */
    public static MenuListPopupView m87748rL(Context context, boolean z11, PrivacyInfo privacyInfo, C7145n.a aVar, int i11, String str) {
        MenuListPopupView m87747qL = m87747qL(context, z11, privacyInfo, aVar, i11);
        Bundle m92642L3 = m87747qL.m92642L3();
        if (m92642L3 != null) {
            m92642L3.putString("title", str);
        }
        return m87747qL;
    }

    /* renamed from: uL */
    public static Rect m87749uL(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        rect.left = i11;
        rect.top = iArr[1];
        rect.right = i11 + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        return rect;
    }

    /* renamed from: xL */
    public static /* synthetic */ void m87750xL(MenuListPopupView menuListPopupView, List list) {
        try {
            menuListPopupView.m87754CL(list);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: zL */
    public /* synthetic */ void m87752zL(int i11) {
        try {
            if (this.f83208P0.isGroupExpanded(i11)) {
                this.f83208P0.collapseGroup(i11);
            } else {
                this.f83208P0.expandGroup(i11, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: BL */
    public void m87753BL() {
        this.f83210R0 = -1L;
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f83211S0 = m92642L3.getBoolean("showArrow", true);
            this.f83213U0 = m92642L3.getInt("arrow_x");
            if (m92642L3.containsKey("arrow_y")) {
                this.f83214V0 = m92642L3.getInt("arrow_y");
            }
            this.f83216X0 = m92642L3.getBoolean("showTitle", true);
            this.f83217Y0 = m92642L3.getString("title");
            this.f83215W0 = m92642L3.getInt("arrow_gravity");
            if (m92642L3.containsKey("show_header_privacy")) {
                this.f83226h1 = m92642L3.getBoolean("show_header_privacy", false);
            }
            if (m92642L3.containsKey("bool_fullscreen_mode")) {
                AbstractC23136l9.m118750t1(m92676n2(), !m92642L3.getBoolean("bool_fullscreen_mode", false));
            }
            if (m92642L3.containsKey("extra_list_item_mode")) {
                this.f83229k1 = m92642L3.getInt("extra_list_item_mode", 1);
            }
        }
    }

    /* renamed from: CL */
    public void m87754CL(List list) {
        try {
            C7256x0 c7256x0 = new C7256x0(m92648SI(), this.f83218Z0, m87762tL());
            this.f83228j1 = c7256x0;
            c7256x0.m37013g(list);
            this.f83208P0.setAdapter(this.f83228j1);
            m87761sL(list.size());
            if (this.f83222d1 != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, 0, 0, 0);
                this.f83222d1.setLayoutParams(layoutParams);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: DL */
    public void m87755DL(List list, int i11) {
        try {
            ViewOnClickListenerC7267y0 viewOnClickListenerC7267y0 = new ViewOnClickListenerC7267y0(m92648SI(), this.f83219a1);
            viewOnClickListenerC7267y0.m37020b(list);
            viewOnClickListenerC7267y0.m37022d(i11);
            this.f83209Q0.setOnScrollListener(new C16463a(viewOnClickListenerC7267y0));
            this.f83209Q0.setAdapter((ListAdapter) viewOnClickListenerC7267y0);
            if (list.size() >= 5) {
                float f11 = m92651WI().getDisplayMetrics().density;
                int i12 = (int) (350.0f * f11);
                if (m92642L3().containsKey("content_max_height")) {
                    i12 = m92642L3().getInt("content_max_height");
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i12);
                layoutParams.setMargins(0, (int) (f11 * (-2.0f)), 0, 0);
                this.f83209Q0.setLayoutParams(layoutParams);
            }
            if (this.f83222d1 != null) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, 0, 0, 0);
                this.f83222d1.setLayoutParams(layoutParams2);
                LinearLayout linearLayout = this.f83222d1;
                linearLayout.setBackground(AbstractC23136l9.m118665N(linearLayout.getContext(), AbstractC16803z.bg_folderalbum_popup));
            }
            View view = this.f83212T0;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f83221c1;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.f83207O0;
            if (view3 != null) {
                view3.setVisibility(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: EL */
    public void m87756EL(ViewOnClickListenerC7267y0.a aVar) {
        this.f83219a1 = aVar;
    }

    /* renamed from: FL */
    public void mo87757FL(List list) {
        try {
            C7145n c7145n = new C7145n(m92648SI(), this.f83218Z0);
            this.f83224f1 = c7145n;
            c7145n.m36356j(list);
            this.f83209Q0.setAdapter((ListAdapter) this.f83224f1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: GL */
    public void m87758GL(C7145n.a aVar) {
        this.f83218Z0 = aVar;
    }

    /* renamed from: IL */
    public void m87759IL(InterfaceC16465c interfaceC16465c) {
        this.f83220b1 = interfaceC16465c;
    }

    /* renamed from: JL */
    public void m87760JL(List list) {
        try {
            C7145n c7145n = new C7145n(m92648SI(), this.f83218Z0);
            this.f83224f1 = c7145n;
            c7145n.m36356j(list);
            this.f83209Q0.setAdapter((ListAdapter) this.f83224f1);
            if (this.f83222d1 != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, 0, 0, 0);
                this.f83222d1.setLayoutParams(layoutParams);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
    /* renamed from: Tv */
    public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
        super.mo12457Tv(interfaceC17463d);
        this.f83210R0 = System.currentTimeMillis();
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    protected View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        View inflate = layoutInflater.inflate(AbstractC7409c0.menu_list_popup, viewGroup, false);
        this.f83223e1 = (TextView) inflate.findViewById(AbstractC6918a0.tv_title);
        this.f83209Q0 = (ListView) inflate.findViewById(AbstractC6918a0.menu_list);
        inflate.setOnClickListener(this.f83664N0);
        View findViewById = inflate.findViewById(AbstractC6918a0.menu_arrow);
        this.f83212T0 = findViewById;
        if (this.f83211S0) {
            findViewById.setVisibility(0);
            this.f83223e1.setVisibility(8);
        } else {
            if (this.f83216X0) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            findViewById.setVisibility(i11);
            TextView textView = this.f83223e1;
            if (this.f83216X0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            textView.setVisibility(i12);
        }
        if (!TextUtils.isEmpty(this.f83217Y0)) {
            this.f83223e1.setText(this.f83217Y0);
        }
        View view = this.f83212T0;
        if (view != null && (view.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f83212T0.getLayoutParams();
            int i16 = this.f83213U0;
            if (i16 > 0) {
                layoutParams.setMargins(i16, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
            } else {
                int i17 = this.f83214V0;
                if (i17 > 0) {
                    layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, i17 - (((ImageView) this.f83212T0).getDrawable().getMinimumWidth() / 2), layoutParams.bottomMargin);
                }
            }
            int i18 = this.f83215W0;
            if (i18 != 0) {
                layoutParams.gravity = i18;
            }
        }
        this.f83221c1 = inflate.findViewById(AbstractC6918a0.anchor_top_listview);
        this.f83207O0 = inflate.findViewById(AbstractC6918a0.divider_top);
        this.f83222d1 = (LinearLayout) inflate.findViewById(AbstractC6918a0.container_popup_listview);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(AbstractC6918a0.header_privacy);
        this.f83225g1 = relativeLayout;
        if (this.f83226h1) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        relativeLayout.setVisibility(i13);
        RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_close);
        this.f83227i1 = robotoTextView;
        robotoTextView.setOnClickListener(this.f83664N0);
        this.f83208P0 = (ExpandableListView) inflate.findViewById(AbstractC6918a0.expandable_menu_list);
        ListView listView = this.f83209Q0;
        if (this.f83229k1 == 1) {
            i14 = 0;
        } else {
            i14 = 8;
        }
        listView.setVisibility(i14);
        ExpandableListView expandableListView = this.f83208P0;
        if (this.f83229k1 != 2) {
            i15 = 8;
        }
        expandableListView.setVisibility(i15);
        return inflate;
    }

    /* renamed from: sL */
    public void m87761sL(int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            try {
                if (!this.f83208P0.isGroupExpanded(i12)) {
                    this.f83208P0.expandGroup(i12, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
    }

    /* renamed from: tL */
    public C7256x0.a m87762tL() {
        try {
            return new C7256x0.a() { // from class: com.zing.zalo.uicontrol.z
                public /* synthetic */ C16682z() {
                }

                @Override // com.zing.zalo.adapters.C7256x0.a
                /* renamed from: a */
                public final void mo37014a(int i11) {
                    MenuListPopupView.this.m87752zL(i11);
                }
            };
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: vL */
    public long m87763vL() {
        return this.f83210R0;
    }

    /* renamed from: wL */
    public String m87764wL() {
        return "MenuListPopupView";
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        InterfaceC16465c interfaceC16465c = this.f83220b1;
        if (interfaceC16465c != null) {
            interfaceC16465c.mo87765a();
        }
    }
}
