package com.zing.zalo.p077ui.bottomsheet;

import ae.C0766k;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.bottomsheet.MenuTabContactViewBottomSheet;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18631a;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p461qu.AbstractC25495a;
import p649xl.C30110x0;

/* loaded from: classes5.dex */
public final class MenuTabContactViewBottomSheet extends BottomSheet {

    /* renamed from: b1 */
    public C30110x0 f56218b1;

    /* renamed from: c1 */
    public Avatar f56219c1;

    /* renamed from: d1 */
    private ContactProfile f56220d1;

    /* renamed from: e1 */
    private String f56221e1 = "";

    /* renamed from: f1 */
    private boolean f56222f1;

    /* renamed from: g1 */
    private boolean f56223g1;

    /* renamed from: com.zing.zalo.ui.bottomsheet.MenuTabContactViewBottomSheet$a */
    /* loaded from: classes5.dex */
    public static final class C11178a implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f56225b;

        /* renamed from: com.zing.zalo.ui.bottomsheet.MenuTabContactViewBottomSheet$a$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f56226a;

            a(String str) {
                this.f56226a = str;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42413h8(this.f56226a);
            }
        }

        C11178a(String str) {
            this.f56225b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m58544e(MenuTabContactViewBottomSheet menuTabContactViewBottomSheet) {
            AbstractC19074t.m100208f(menuTabContactViewBottomSheet, "this$0");
            menuTabContactViewBottomSheet.m58534OL().f139863t.setSwitch(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m58545f(MenuTabContactViewBottomSheet menuTabContactViewBottomSheet) {
            AbstractC19074t.m100208f(menuTabContactViewBottomSheet, "this$0");
            menuTabContactViewBottomSheet.m58534OL().f139863t.setSwitch(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            final MenuTabContactViewBottomSheet menuTabContactViewBottomSheet;
            Runnable runnable;
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                    MenuTabContactViewBottomSheet.this.m91396q3();
                    MenuTabContactViewBottomSheet.this.m58540bM(false);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    MenuTabContactViewBottomSheet.this.m91396q3();
                    MenuTabContactViewBottomSheet.this.m58540bM(false);
                    if (ZaloListView.m86977gN()) {
                        menuTabContactViewBottomSheet = MenuTabContactViewBottomSheet.this;
                        runnable = new Runnable() { // from class: e50.s
                            @Override // java.lang.Runnable
                            public final void run() {
                                MenuTabContactViewBottomSheet.C11178a.m58545f(MenuTabContactViewBottomSheet.this);
                            }
                        };
                    } else {
                        return;
                    }
                }
                if (ZaloListView.m86977gN()) {
                    menuTabContactViewBottomSheet = MenuTabContactViewBottomSheet.this;
                    runnable = new Runnable() { // from class: e50.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            MenuTabContactViewBottomSheet.C11178a.m58545f(MenuTabContactViewBottomSheet.this);
                        }
                    };
                    menuTabContactViewBottomSheet.mo70710wy(runnable);
                }
            } catch (Throwable th2) {
                MenuTabContactViewBottomSheet.this.m91396q3();
                MenuTabContactViewBottomSheet.this.m58540bM(false);
                if (ZaloListView.m86977gN()) {
                    final MenuTabContactViewBottomSheet menuTabContactViewBottomSheet2 = MenuTabContactViewBottomSheet.this;
                    menuTabContactViewBottomSheet2.mo70710wy(new Runnable() { // from class: e50.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            MenuTabContactViewBottomSheet.C11178a.m58545f(MenuTabContactViewBottomSheet.this);
                        }
                    });
                }
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                        JSONArray jSONArray = new JSONArray();
                        try {
                            if (!jSONObject.isNull("data")) {
                                jSONArray = new JSONArray(jSONObject.getString("data"));
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        int length = jSONArray.length();
                        boolean z12 = true;
                        for (int i11 = 0; i11 < length; i11++) {
                            Object obj2 = jSONArray.get(i11);
                            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
                            if (Integer.parseInt(this.f56225b) == ((Integer) obj2).intValue()) {
                                z12 = false;
                            }
                        }
                        if (z12) {
                            if (!C21927m.m114302u().m114351p().contains(this.f56225b)) {
                                C21927m.m114302u().m114351p().add(this.f56225b);
                                AbstractC21935u.m114527Q(this.f56225b);
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            C0824j.m2153b(new a(this.f56225b));
                            ContactProfile m98552o = C18644n.m98531l().m98552o(this.f56225b);
                            if (m98552o != null) {
                                String m114539f = AbstractC21935u.m114539f(m98552o.f42455y, this.f56225b, m98552o.f42437s);
                                String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_msg_info_add_favorite_friend, m114539f, m114539f);
                                AbstractC19074t.m100207e(m118746s0, "getString(...)");
                                if (!z11) {
                                    AbstractC19646n0.m103026s0(this.f56225b, m118746s0);
                                }
                            }
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cant_add_favorite_friend));
                            if (ZaloListView.m86977gN()) {
                                final MenuTabContactViewBottomSheet menuTabContactViewBottomSheet = MenuTabContactViewBottomSheet.this;
                                menuTabContactViewBottomSheet.mo70710wy(new Runnable() { // from class: e50.r
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MenuTabContactViewBottomSheet.C11178a.m58544e(MenuTabContactViewBottomSheet.this);
                                    }
                                });
                            }
                        }
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } finally {
                C18644n.m98524E();
                MenuTabContactViewBottomSheet.this.m91396q3();
                MenuTabContactViewBottomSheet.this.m58540bM(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.bottomsheet.MenuTabContactViewBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C11179b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f56228b;

        /* renamed from: com.zing.zalo.ui.bottomsheet.MenuTabContactViewBottomSheet$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f56229a;

            a(String str) {
                this.f56229a = str;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42415hc(this.f56229a);
            }
        }

        C11179b(String str) {
            this.f56228b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m58547d(MenuTabContactViewBottomSheet menuTabContactViewBottomSheet) {
            AbstractC19074t.m100208f(menuTabContactViewBottomSheet, "this$0");
            menuTabContactViewBottomSheet.m58534OL().f139863t.setSwitch(true);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            final MenuTabContactViewBottomSheet menuTabContactViewBottomSheet;
            Runnable runnable;
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                    MenuTabContactViewBottomSheet.this.m58541cM(false);
                    MenuTabContactViewBottomSheet.this.m91396q3();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    MenuTabContactViewBottomSheet.this.m58541cM(false);
                    MenuTabContactViewBottomSheet.this.m91396q3();
                    if (ZaloListView.m86977gN()) {
                        menuTabContactViewBottomSheet = MenuTabContactViewBottomSheet.this;
                        runnable = new Runnable() { // from class: e50.t
                            @Override // java.lang.Runnable
                            public final void run() {
                                MenuTabContactViewBottomSheet.C11179b.m58547d(MenuTabContactViewBottomSheet.this);
                            }
                        };
                    } else {
                        return;
                    }
                }
                if (ZaloListView.m86977gN()) {
                    menuTabContactViewBottomSheet = MenuTabContactViewBottomSheet.this;
                    runnable = new Runnable() { // from class: e50.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            MenuTabContactViewBottomSheet.C11179b.m58547d(MenuTabContactViewBottomSheet.this);
                        }
                    };
                    menuTabContactViewBottomSheet.mo70710wy(runnable);
                }
            } catch (Throwable th2) {
                MenuTabContactViewBottomSheet.this.m58541cM(false);
                MenuTabContactViewBottomSheet.this.m91396q3();
                if (ZaloListView.m86977gN()) {
                    final MenuTabContactViewBottomSheet menuTabContactViewBottomSheet2 = MenuTabContactViewBottomSheet.this;
                    menuTabContactViewBottomSheet2.mo70710wy(new Runnable() { // from class: e50.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            MenuTabContactViewBottomSheet.C11179b.m58547d(MenuTabContactViewBottomSheet.this);
                        }
                    });
                }
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                        JSONArray jSONArray = new JSONArray();
                        try {
                            if (!jSONObject.isNull("data")) {
                                jSONArray = new JSONArray(jSONObject.getString("data"));
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        int length = jSONArray.length();
                        boolean z11 = true;
                        for (int i11 = 0; i11 < length; i11++) {
                            Object obj2 = jSONArray.get(i11);
                            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
                            if (Integer.parseInt(this.f56228b) == ((Integer) obj2).intValue()) {
                                z11 = false;
                            }
                        }
                        if (z11) {
                            C21927m.m114302u().m114340j0(this.f56228b);
                            AbstractC21935u.m114526P(this.f56228b);
                            C21927m.m114302u().m114336h0();
                            C0824j.m2153b(new a(this.f56228b));
                        }
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } finally {
                MenuTabContactViewBottomSheet.this.m91396q3();
                MenuTabContactViewBottomSheet.this.m58541cM(false);
            }
        }
    }

    /* renamed from: QL */
    private final void m58526QL() {
        String str;
        ContactProfile contactProfile;
        final ListItemSetting listItemSetting = m58534OL().f139864u;
        listItemSetting.setIdTracking("MENU_TAB_CONTACT_PROFILE");
        Context context = listItemSetting.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        m58539aM(new Avatar(context));
        m58535PL().setLayoutParams(new RelativeLayout.LayoutParams(AbstractC23136l9.m118736p(AbstractC16802y.ava3), AbstractC23136l9.m118736p(AbstractC16802y.ava3)));
        ContactProfile contactProfile2 = this.f56220d1;
        int i11 = 0;
        if (contactProfile2 != null) {
            Avatar m58535PL = m58535PL();
            C16948d m40361D = contactProfile2.m40361D();
            AbstractC19074t.m100207e(m40361D, "getAvatarProperties(...)");
            m58535PL.m90478m(m40361D);
            String m40383Q = contactProfile2.m40383Q(true, false);
            AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
            listItemSetting.setTitle(m40383Q);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_profile);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            listItemSetting.setSubtitle(m118743r0);
        }
        listItemSetting.m90587c(m58535PL());
        listItemSetting.setLeadingGravity(EnumC16952b0.CENTER);
        listItemSetting.m90591l(AbstractC23136l9.m118742r(16.0f), 0, 0, 0);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: e50.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuTabContactViewBottomSheet.m58528SL(MenuTabContactViewBottomSheet.this, listItemSetting, view);
            }
        });
        final ListItemSetting listItemSetting2 = m58534OL().f139860q;
        listItemSetting2.setIdTracking("MENU_TAB_CONTACT_ALIAS");
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: e50.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuTabContactViewBottomSheet.m58529TL(MenuTabContactViewBottomSheet.this, listItemSetting2, view);
            }
        });
        final ListItemSetting listItemSetting3 = m58534OL().f139863t;
        listItemSetting3.setIdTracking("MENU_TAB_CONTACT_FAVORITE");
        listItemSetting3.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e50.o
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                MenuTabContactViewBottomSheet.m58530UL(MenuTabContactViewBottomSheet.this, listItemSetting3, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting4 = m58534OL().f139861r;
        listItemSetting4.setIdTracking("MENU_TAB_CONTACT_BLOCK");
        listItemSetting4.setOnClickListener(new View.OnClickListener() { // from class: e50.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuTabContactViewBottomSheet.m58531VL(MenuTabContactViewBottomSheet.this, listItemSetting4, view);
            }
        });
        final ListItemSetting listItemSetting5 = m58534OL().f139862s;
        listItemSetting5.setIdTracking("MENU_TAB_CONTACT_DELETE");
        listItemSetting5.setOnClickListener(new View.OnClickListener() { // from class: e50.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuTabContactViewBottomSheet.m58527RL(MenuTabContactViewBottomSheet.this, listItemSetting5, view);
            }
        });
        ContactProfile contactProfile3 = this.f56220d1;
        if (contactProfile3 != null) {
            str = contactProfile3.f42434r;
        } else {
            str = null;
        }
        if (!AbstractC25495a.m132086k(str) && ((contactProfile = this.f56220d1) == null || !contactProfile.m40372J0())) {
            ListItemSetting listItemSetting6 = m58534OL().f139860q;
            if (!C18631a.m98446i().f93749a) {
                i11 = 8;
            }
            listItemSetting6.setVisibility(i11);
        } else {
            m58534OL().f139860q.setVisibility(8);
            m58534OL().f139863t.setVisibility(8);
            m58534OL().f139861r.setVisibility(8);
            m58534OL().f139862s.setVisibility(8);
        }
        m58532XL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RL */
    public static final void m58527RL(MenuTabContactViewBottomSheet menuTabContactViewBottomSheet, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(menuTabContactViewBottomSheet, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        menuTabContactViewBottomSheet.m58536WL(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SL */
    public static final void m58528SL(MenuTabContactViewBottomSheet menuTabContactViewBottomSheet, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(menuTabContactViewBottomSheet, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        menuTabContactViewBottomSheet.m58536WL(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TL */
    public static final void m58529TL(MenuTabContactViewBottomSheet menuTabContactViewBottomSheet, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(menuTabContactViewBottomSheet, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        menuTabContactViewBottomSheet.m58536WL(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UL */
    public static final void m58530UL(MenuTabContactViewBottomSheet menuTabContactViewBottomSheet, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(menuTabContactViewBottomSheet, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        menuTabContactViewBottomSheet.m58536WL(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VL */
    public static final void m58531VL(MenuTabContactViewBottomSheet menuTabContactViewBottomSheet, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(menuTabContactViewBottomSheet, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        menuTabContactViewBottomSheet.m58536WL(listItemSetting, false);
    }

    /* renamed from: XL */
    private final void m58532XL() {
        String str;
        ListItemSetting listItemSetting = m58534OL().f139863t;
        ArrayList m114351p = C21927m.m114302u().m114351p();
        ContactProfile contactProfile = this.f56220d1;
        if (contactProfile != null) {
            str = contactProfile.f42434r;
        } else {
            str = null;
        }
        listItemSetting.setSwitch(m114351p.contains(str));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = m92642L3();
            String str2 = null;
            String str3 = "";
            if (m92642L3 != null) {
                str = m92642L3.getString("EXTRA_TRACKING_ACTION_SOURCE_VIEW", "");
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            this.f56221e1 = str;
            Bundle m92642L32 = m92642L3();
            if (m92642L32 != null) {
                str2 = m92642L32.getString("EXTRA_CONTACT_PROFILE", "");
            }
            if (str2 != null) {
                str3 = str2;
            }
            if (str3.length() != 0) {
                this.f56220d1 = new ContactProfile(new JSONObject(str3));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: NL */
    public final void m58533NL(String str) {
        int i11;
        AbstractC19074t.m100208f(str, "uidFriend");
        if (this.f56222f1) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11178a(str));
        try {
            i11 = Integer.parseInt(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            i11 = -1;
        }
        if (i11 > -1) {
            m91394cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            ArrayList arrayList = new ArrayList();
            this.f56222f1 = true;
            arrayList.add(Integer.valueOf(i11));
            c0766k.mo1653h8(arrayList);
        }
    }

    /* renamed from: OL */
    public final C30110x0 m58534OL() {
        C30110x0 c30110x0 = this.f56218b1;
        if (c30110x0 != null) {
            return c30110x0;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: PL */
    public final Avatar m58535PL() {
        Avatar avatar = this.f56219c1;
        if (avatar != null) {
            return avatar;
        }
        AbstractC19074t.m100223u("mAvatar");
        return null;
    }

    /* renamed from: WL */
    public final void m58536WL(View view, boolean z11) {
        ContactProfile contactProfile;
        String str;
        String str2;
        AbstractC19074t.m100208f(view, "item");
        if (AbstractC19074t.m100204b(view, m58534OL().f139864u)) {
            Intent intent = new Intent();
            intent.putExtra("PARAM_ITEM_CLICK", 1);
            ZaloView m92650VI = m92650VI();
            if (m92650VI != null) {
                m92650VI.mo50035CK(-1, intent);
            }
            close();
            return;
        }
        if (AbstractC19074t.m100204b(view, m58534OL().f139860q)) {
            Intent intent2 = new Intent();
            intent2.putExtra("PARAM_ITEM_CLICK", 2);
            ZaloView m92650VI2 = m92650VI();
            if (m92650VI2 != null) {
                m92650VI2.mo50035CK(-1, intent2);
            }
            close();
            return;
        }
        if (AbstractC19074t.m100204b(view, m58534OL().f139861r)) {
            Intent intent3 = new Intent();
            intent3.putExtra("PARAM_ITEM_CLICK", 3);
            ZaloView m92650VI3 = m92650VI();
            if (m92650VI3 != null) {
                m92650VI3.mo50035CK(-1, intent3);
            }
            close();
            return;
        }
        if (AbstractC19074t.m100204b(view, m58534OL().f139862s)) {
            Intent intent4 = new Intent();
            intent4.putExtra("PARAM_ITEM_CLICK", 4);
            ZaloView m92650VI4 = m92650VI();
            if (m92650VI4 != null) {
                m92650VI4.mo50035CK(-1, intent4);
            }
            close();
            return;
        }
        if (AbstractC19074t.m100204b(view, m58534OL().f139863t) && (contactProfile = this.f56220d1) != null) {
            String str3 = null;
            if (z11) {
                AbstractC23647d.m123898h("3240", "");
                if (C21927m.m114302u().m114351p() != null) {
                    ArrayList m114351p = C21927m.m114302u().m114351p();
                    ContactProfile contactProfile2 = this.f56220d1;
                    if (contactProfile2 != null) {
                        str2 = contactProfile2.f42434r;
                    } else {
                        str2 = null;
                    }
                    if (!m114351p.contains(str2)) {
                        if (C21927m.m114302u().m114351p().size() < AbstractC23309i.m121115K8()) {
                            String str4 = contactProfile.f42434r;
                            AbstractC19074t.m100207e(str4, "uid");
                            m58533NL(str4);
                        } else {
                            C19067n0 c19067n0 = C19067n0.f94947a;
                            String m92652XI = m92652XI(AbstractC8020f0.str_warning_limit_favorite_list);
                            AbstractC19074t.m100207e(m92652XI, "getString(...)");
                            String format = String.format(m92652XI, Arrays.copyOf(new Object[]{Integer.valueOf(AbstractC23309i.m121115K8())}, 1));
                            AbstractC19074t.m100207e(format, "format(...)");
                            ToastUtils.showMess(format);
                        }
                    }
                }
                C0815e1 m2075D = C0815e1.m2075D();
                ContactProfile contactProfile3 = this.f56220d1;
                if (contactProfile3 != null) {
                    str3 = contactProfile3.f42434r;
                }
                m2075D.m2095O("1", "18", str3, this.f56221e1);
                return;
            }
            AbstractC23647d.m123898h("3260", "");
            if (C21927m.m114302u().m114351p() != null) {
                ArrayList m114351p2 = C21927m.m114302u().m114351p();
                ContactProfile contactProfile4 = this.f56220d1;
                if (contactProfile4 != null) {
                    str = contactProfile4.f42434r;
                } else {
                    str = null;
                }
                if (m114351p2.contains(str)) {
                    String str5 = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str5, "uid");
                    m58537YL(str5);
                }
            }
            C0815e1 m2075D2 = C0815e1.m2075D();
            ContactProfile contactProfile5 = this.f56220d1;
            if (contactProfile5 != null) {
                str3 = contactProfile5.f42434r;
            }
            m2075D2.m2095O("1", "19", str3, this.f56221e1);
        }
    }

    /* renamed from: YL */
    public final void m58537YL(String str) {
        int i11;
        AbstractC19074t.m100208f(str, "uidFriend");
        if (this.f56223g1) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11179b(str));
        try {
            i11 = Integer.parseInt(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            i11 = -1;
        }
        if (i11 > -1) {
            m91394cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            ArrayList arrayList = new ArrayList();
            this.f56223g1 = true;
            arrayList.add(Integer.valueOf(i11));
            c0766k.mo1563W5(arrayList);
        }
    }

    /* renamed from: ZL */
    public final void m58538ZL(C30110x0 c30110x0) {
        AbstractC19074t.m100208f(c30110x0, "<set-?>");
        this.f56218b1 = c30110x0;
    }

    /* renamed from: aM */
    public final void m58539aM(Avatar avatar) {
        AbstractC19074t.m100208f(avatar, "<set-?>");
        this.f56219c1 = avatar;
    }

    /* renamed from: bM */
    public final void m58540bM(boolean z11) {
        this.f56222f1 = z11;
    }

    /* renamed from: cM */
    public final void m58541cM(boolean z11) {
        this.f56223g1 = z11;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30110x0 m148672c = C30110x0.m148672c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148672c, "inflate(...)");
        m58538ZL(m148672c);
        m90525tL(true);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m58526QL();
    }
}
