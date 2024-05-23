package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.GroupFullMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.chatinfo.BaseMemberItemModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Locale;
import kd0.C21693c;
import l30.AbstractC22055v0;
import l80.C22124b0;
import l80.C22126c0;
import l80.C22129e;
import l80.C22132g;
import ld0.C22448a;
import me0.AbstractC23022b5;
import me0.AbstractC23028c0;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p193h0.AbstractC19694b;
import p262jb.AbstractC21196a;
import p266jg.AbstractC21244b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import ui0.C27280g;

/* loaded from: classes3.dex */
public final class GroupFullMemberAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: A */
    public int f38004A;

    /* renamed from: r */
    private Context f38005r;

    /* renamed from: s */
    private C23528a f38006s;

    /* renamed from: t */
    private final String f38007t;

    /* renamed from: u */
    private final boolean f38008u;

    /* renamed from: v */
    public ArrayList f38009v;

    /* renamed from: w */
    public boolean f38010w;

    /* renamed from: x */
    public boolean f38011x;

    /* renamed from: y */
    public LayoutInflater f38012y;

    /* renamed from: z */
    public InterfaceC6939c f38013z;

    /* loaded from: classes3.dex */
    public final class HeaderModuleView extends ModulesView implements InterfaceC6937a {

        /* renamed from: K */
        private final C16716d f38014K;

        /* renamed from: L */
        private final C22126c0 f38015L;

        /* renamed from: M */
        private final C21693c f38016M;

        /* renamed from: N */
        private final C16719g f38017N;

        /* renamed from: O */
        private final C22126c0 f38018O;

        public HeaderModuleView(Context context) {
            super(context);
            m88987U(-1, -2);
            C16719g c16719g = new C16719g(context);
            c16719g.m89106L().m89028L(-1, AbstractC23222t7.f112564i);
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor));
            this.f38017N = c16719g;
            C16716d c16716d = new C16716d(context);
            C16718f m89028L = c16716d.m89106L().m89028L(-1, -2);
            int i11 = AbstractC23222t7.f112586t;
            int i12 = AbstractC23222t7.f112566j;
            m89028L.m89042Z(i11, i12, i12, i12).m89029M(12).m89023G(c16719g);
            this.f38014K = c16716d;
            C21693c c21693c = new C21693c(context);
            C16718f m89029M = c21693c.m89106L().m89028L(-2, -2).m89029M(12);
            Boolean bool = Boolean.TRUE;
            C16718f m89017A = m89029M.m89017A(bool);
            int i13 = AbstractC23222t7.f112566j;
            m89017A.m89042Z(i13, i13, i13, i13);
            AbstractC19074t.m100205c(context);
            c21693c.mo111925v1(AbstractC19694b.m103336d(context, AbstractC16803z.icn_csc_sticker_option_vertical));
            c21693c.m89085A0(AbstractC23136l9.m118718j(context));
            this.f38016M = c21693c;
            c21693c.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.k1
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g2) {
                    GroupFullMemberAdapter.HeaderModuleView.m35638W(GroupFullMemberAdapter.this, this, c16719g2);
                }
            });
            C16716d c16716d2 = new C16716d(context);
            c16716d2.m89106L().m89028L(-2, -2).m89049e0(c21693c).m89073z(bool).m89027K(true);
            C22126c0 c22126c0 = new C22126c0(context);
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.SectionTitleColor1));
            c22126c0.mo111964L1(AbstractC23222t7.f112580q);
            c22126c0.mo111965M1(1);
            c22126c0.m89106L().m89073z(bool).m89018B(bool).m89017A(bool);
            this.f38015L = c22126c0;
            C22126c0 c22126c02 = new C22126c0(context);
            c22126c02.m89106L().m89073z(bool).m89023G(c22126c0).m89017A(bool);
            c22126c02.mo111965M1(0);
            c22126c02.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_02));
            c22126c02.mo111964L1(AbstractC23222t7.f112582r);
            this.f38018O = c22126c02;
            c16716d2.m89001g1(c22126c0);
            c16716d2.m89001g1(c22126c02);
            c16716d.m89001g1(c21693c);
            c16716d.m89001g1(c16716d2);
            mo69681L(c16719g);
            mo69681L(c16716d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public static final void m35638W(GroupFullMemberAdapter groupFullMemberAdapter, HeaderModuleView headerModuleView, C16719g c16719g) {
            AbstractC19074t.m100208f(groupFullMemberAdapter, "this$0");
            AbstractC19074t.m100208f(headerModuleView, "this$1");
            InterfaceC6939c interfaceC6939c = groupFullMemberAdapter.f38013z;
            if (interfaceC6939c != null) {
                int[] iArr = new int[2];
                headerModuleView.getLocationOnScreen(iArr);
                int m89096G = iArr[0] + headerModuleView.f38016M.m89096G();
                int m89098H = iArr[1] + headerModuleView.f38016M.m89098H();
                interfaceC6939c.mo35654g(new Rect(m89096G, m89098H, headerModuleView.f38016M.m89114P() + m89096G, headerModuleView.f38016M.m89112O() + m89098H));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6937a
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo35639i(C6938b c6938b, int i11, boolean z11) {
            int i12;
            boolean z12;
            int i13;
            AbstractC19074t.m100208f(c6938b, "groupMemberItem");
            try {
                int i14 = 8;
                if (c6938b.f38031k.length() > 0) {
                    this.f38015L.mo44614b1(0);
                    this.f38015L.m111959G1(c6938b.f38031k);
                    C16719g c16719g = this.f38017N;
                    if (c6938b.f38035o) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    c16719g.mo44614b1(i13);
                } else {
                    this.f38015L.mo44614b1(8);
                    this.f38017N.mo44614b1(8);
                }
                C21693c c21693c = this.f38016M;
                if (c6938b.f38033m) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                c21693c.mo44614b1(i12);
                if (c6938b.f38032l.length() > 0) {
                    C22126c0 c22126c0 = this.f38018O;
                    c22126c0.mo44614b1(0);
                    c22126c0.m111959G1(c6938b.f38032l);
                    c22126c0.m111961I1(Layout.Alignment.ALIGN_NORMAL);
                    c22126c0.m111955C1(new C22448a());
                    if (this.f38015L.m89136d0() == 0) {
                        c22126c0.m89106L().m89036T(AbstractC23222t7.f112566j);
                    } else {
                        c22126c0.m89106L().m89036T(0);
                    }
                } else {
                    this.f38018O.mo44614b1(8);
                }
                if (this.f38015L.m89136d0() != 0 && this.f38018O.m89136d0() != 0 && this.f38016M.m89136d0() != 0) {
                    z12 = false;
                    C16716d c16716d = this.f38014K;
                    if (z12) {
                        i14 = 0;
                    }
                    c16716d.mo44614b1(i14);
                }
                z12 = true;
                C16716d c16716d2 = this.f38014K;
                if (z12) {
                }
                c16716d2.mo44614b1(i14);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class MemberRowModuleView extends BaseMemberItemModuleView implements InterfaceC6937a {
        public MemberRowModuleView(Context context, C23528a c23528a) {
            super(context, c23528a);
            this.f64549L.mo44614b1(8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a0 */
        public static final void m35644a0(GroupFullMemberAdapter groupFullMemberAdapter, ContactProfile contactProfile, C16719g c16719g) {
            AbstractC19074t.m100208f(groupFullMemberAdapter, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$this_run");
            InterfaceC6939c interfaceC6939c = groupFullMemberAdapter.f38013z;
            if (interfaceC6939c != null) {
                interfaceC6939c.mo35660m(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b0 */
        public static final void m35645b0(GroupFullMemberAdapter groupFullMemberAdapter, ContactProfile contactProfile, C16719g c16719g) {
            AbstractC19074t.m100208f(groupFullMemberAdapter, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$this_run");
            InterfaceC6939c interfaceC6939c = groupFullMemberAdapter.f38013z;
            if (interfaceC6939c != null) {
                interfaceC6939c.mo35655h(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c0 */
        public static final void m35646c0(GroupFullMemberAdapter groupFullMemberAdapter, ContactProfile contactProfile, C16719g c16719g) {
            AbstractC19074t.m100208f(groupFullMemberAdapter, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contactProfile");
            InterfaceC6939c interfaceC6939c = groupFullMemberAdapter.f38013z;
            if (interfaceC6939c != null) {
                interfaceC6939c.mo35649b(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d0 */
        public static final void m35647d0(GroupFullMemberAdapter groupFullMemberAdapter, ContactProfile contactProfile, C16719g c16719g) {
            AbstractC19074t.m100208f(groupFullMemberAdapter, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contactProfile");
            InterfaceC6939c interfaceC6939c = groupFullMemberAdapter.f38013z;
            if (interfaceC6939c != null) {
                AbstractC23647d.m123897g("1591111");
                interfaceC6939c.mo35650c(contactProfile);
            }
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6937a
        /* renamed from: i */
        public void mo35639i(C6938b c6938b, int i11, boolean z11) {
            int i12;
            String m114543j;
            String m118746s0;
            int i13;
            String m114543j2;
            ContactProfile contactProfile;
            int i14;
            String m114543j3;
            String string;
            AbstractC19074t.m100208f(c6938b, "groupMemberItem");
            try {
                final GroupFullMemberAdapter groupFullMemberAdapter = GroupFullMemberAdapter.this;
                this.f64549L.mo44614b1(8);
                int i15 = c6938b.f38021a;
                if (i15 != 0) {
                    if (i15 == 1 || i15 == 2) {
                        C22129e c22129e = this.f64552O;
                        if (i15 == 1) {
                            c22129e.m115440x1(AbstractC16803z.ic_group_add_member);
                        } else {
                            c22129e.m115440x1(AbstractC16803z.icn_add_admin);
                        }
                        c22129e.m115429C1(false, false);
                        C22126c0 c22126c0 = this.f64550M.f108888M0;
                        if (c6938b.f38021a == 1) {
                            string = this.f84675p.getString(AbstractC8020f0.str_invite_member);
                        } else {
                            string = this.f84675p.getString(groupFullMemberAdapter.m35632M() ? AbstractC8020f0.str_add_community_admins : AbstractC8020f0.str_add_group_admin_title_v2);
                        }
                        c22126c0.m111959G1(string);
                        c22126c0.mo111964L1(AbstractC23222t7.f112584s);
                        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC21196a.TextColor1));
                        this.f64553P.mo44614b1(4);
                        this.f64555R.mo44614b1(8);
                        return;
                    }
                    if (i15 == 3) {
                        C22126c0 c22126c02 = this.f64550M.f108888M0;
                        c22126c02.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_block_member));
                        c22126c02.m111962J1(C23212s8.m119607o(c22126c02.getContext(), AbstractC21196a.TextColor1));
                        c22126c02.mo111964L1(AbstractC23222t7.f112584s);
                        C22129e c22129e2 = this.f64552O;
                        c22129e2.m115440x1(AbstractC16803z.icn_blocked);
                        c22129e2.m115429C1(false, false);
                        this.f64555R.mo44614b1(8);
                        this.f64553P.mo44614b1(8);
                        return;
                    }
                    if (i15 == 6) {
                        C22126c0 c22126c03 = this.f64550M.f108888M0;
                        c22126c03.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_invite_to_group));
                        c22126c03.m111962J1(C23212s8.m119607o(c22126c03.getContext(), AbstractC21196a.TextColor1));
                        c22126c03.mo111964L1(AbstractC23222t7.f112586t);
                        c22126c03.m115422R1();
                        this.f64553P.mo44614b1(8);
                        this.f64555R.mo44614b1(8);
                        C22129e c22129e3 = this.f64552O;
                        c22129e3.m115440x1(AbstractC16803z.ic_group_add_member_3);
                        c22129e3.m115429C1(false, false);
                        this.f64549L.mo44614b1(c6938b.f38034n ? 0 : 8);
                        C22132g c22132g = this.f64557T;
                        c22132g.mo44614b1(0);
                        ArrayList arrayList = c6938b.f38029i;
                        c22132g.m115449r1(arrayList, arrayList.size(), false);
                        return;
                    }
                    if (i15 != 7) {
                        return;
                    }
                    C22126c0 c22126c04 = this.f64550M.f108888M0;
                    c22126c04.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_membership_approval));
                    c22126c04.m111962J1(C23212s8.m119607o(c22126c04.getContext(), AbstractC21196a.TextColor1));
                    c22126c04.mo111964L1(AbstractC23222t7.f112586t);
                    this.f64553P.mo44614b1(8);
                    C22126c0 c22126c05 = this.f64555R;
                    c22126c05.mo44614b1(c6938b.f38028h > 0 ? 0 : 8);
                    AbstractC23022b5.m118024b(c22126c05);
                    int i16 = c6938b.f38028h;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    c22126c05.m111959G1(sb2.toString());
                    C22129e c22129e4 = this.f64552O;
                    c22129e4.m115440x1(AbstractC16803z.ic_group_request);
                    c22129e4.m115429C1(false, false);
                    return;
                }
                final ContactProfile contactProfile2 = ((C6938b) groupFullMemberAdapter.f38009v.get(i11)).f38022b;
                C22126c0 c22126c06 = this.f64550M.f108888M0;
                c22126c06.m111962J1(C23212s8.m119607o(c22126c06.getContext(), AbstractC21196a.TextColor1));
                String str = "";
                if (contactProfile2 != null) {
                    if (contactProfile2.f42399a1.isEmpty()) {
                        c22126c06.m111959G1(AbstractC23028c0.m118085e(contactProfile2, true, AbstractC8020f0.str_you));
                    } else {
                        c22126c06.m111959G1("");
                        SpannableString spannableString = new SpannableString(AbstractC23028c0.m118085e(contactProfile2, true, AbstractC8020f0.str_you));
                        int i17 = 0;
                        for (int i18 = 1; i17 < contactProfile2.f42399a1.size() - i18; i18 = 1) {
                            Object obj = contactProfile2.f42399a1.get(i17);
                            AbstractC19074t.m100207e(obj, "get(...)");
                            if (((Number) obj).intValue() >= 0) {
                                int i19 = i17 + 1;
                                Object obj2 = contactProfile2.f42399a1.get(i19);
                                AbstractC19074t.m100207e(obj2, "get(...)");
                                int intValue = ((Number) obj2).intValue();
                                Object obj3 = contactProfile2.f42399a1.get(i17);
                                AbstractC19074t.m100207e(obj3, "get(...)");
                                if (intValue > ((Number) obj3).intValue()) {
                                    Object obj4 = contactProfile2.f42399a1.get(i19);
                                    AbstractC19074t.m100207e(obj4, "get(...)");
                                    if (((Number) obj4).intValue() <= spannableString.length()) {
                                        StyleSpan styleSpan = new StyleSpan(i18);
                                        Object obj5 = contactProfile2.f42399a1.get(i17);
                                        AbstractC19074t.m100207e(obj5, "get(...)");
                                        int intValue2 = ((Number) obj5).intValue();
                                        Object obj6 = contactProfile2.f42399a1.get(i19);
                                        AbstractC19074t.m100207e(obj6, "get(...)");
                                        spannableString.setSpan(styleSpan, intValue2, ((Number) obj6).intValue(), 33);
                                    }
                                }
                            }
                            i17 += 2;
                        }
                        c22126c06.m111959G1(spannableString);
                    }
                }
                if (c6938b.f38025e) {
                    C21693c c21693c = this.f64553P;
                    c21693c.mo44614b1(0);
                    c21693c.mo111926w1(AbstractC16803z.icn_rightmenu_key_gold);
                    C22126c0 c22126c07 = this.f64551N;
                    c22126c07.mo44614b1(0);
                    c22126c07.m111958F1(groupFullMemberAdapter.m35632M() ? AbstractC8020f0.str_community_owner_role : AbstractC8020f0.str_owner_role);
                    if (c6938b.f38026f) {
                        C22124b0 c22124b0 = this.f64550M;
                        Context context = getContext();
                        AbstractC19074t.m100207e(context, "getContext(...)");
                        c22124b0.m115402s1(null, null, C27280g.m139658a(context, AbstractC23322a.zds_oic_oa_star_check_color_24), null);
                        C22124b0 c22124b02 = this.f64550M;
                        int i21 = AbstractC23222t7.f112586t;
                        c22124b02.m115403t1(i21, i21);
                    } else {
                        this.f64550M.m115402s1(null, null, null, null);
                    }
                } else if (c6938b.f38027g) {
                    C21693c c21693c2 = this.f64553P;
                    c21693c2.mo44614b1(0);
                    c21693c2.mo111926w1(AbstractC16803z.icn_rightmenu_key_silver);
                    C22126c0 c22126c08 = this.f64551N;
                    c22126c08.mo44614b1(0);
                    c22126c08.m111958F1(groupFullMemberAdapter.m35632M() ? AbstractC8020f0.str_community_admin_role : AbstractC8020f0.str_admin_role);
                } else {
                    this.f64553P.mo44614b1(4);
                    C22126c0 c22126c09 = this.f64551N;
                    c22126c09.mo44614b1(8);
                    int i22 = groupFullMemberAdapter.f38004A;
                    if (i22 == 1) {
                        ContactProfile contactProfile3 = c6938b.f38023c;
                        if (contactProfile3 != null) {
                            int i23 = contactProfile3.f42376S0;
                            if (i23 == 2) {
                                if (AbstractC19074t.m100204b(contactProfile3.f42434r, CoreUtility.f89233i)) {
                                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.f43877x61e6ddd3);
                                } else {
                                    String m114543j4 = AbstractC21935u.m114543j(contactProfile3.f42434r, contactProfile3.f42437s, true);
                                    if (m114543j4.length() > 10) {
                                        AbstractC19074t.m100205c(m114543j4);
                                        String substring = m114543j4.substring(0, 10);
                                        AbstractC19074t.m100207e(substring, "substring(...)");
                                        m114543j4 = substring + "...";
                                    }
                                    str = AbstractC23136l9.m118746s0(AbstractC8020f0.f43876x13f95048, m114543j4);
                                }
                            } else if (i23 == 1) {
                                str = AbstractC23136l9.m118743r0(groupFullMemberAdapter.m35632M() ? AbstractC8020f0.str_subtitle_item_community_mem_tab_all_join_by_link : AbstractC8020f0.str_subtitle_item_group_mem_tab_all_join_by_link);
                            } else if (i23 == 0) {
                                if (AbstractC19074t.m100204b(contactProfile3.f42434r, contactProfile2 != null ? contactProfile2.f42434r : null)) {
                                    m118746s0 = AbstractC23136l9.m118743r0(groupFullMemberAdapter.m35632M() ? AbstractC8020f0.str_subtitle_item_community_mem_tab_all_creator_mem : AbstractC8020f0.str_subtitle_item_group_mem_tab_all_creator_mem);
                                } else {
                                    if (AbstractC19074t.m100204b(contactProfile3.f42434r, CoreUtility.f89233i)) {
                                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_you);
                                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                                        Locale locale = Locale.getDefault();
                                        AbstractC19074t.m100207e(locale, "getDefault(...)");
                                        m114543j = m118743r0.toLowerCase(locale);
                                        AbstractC19074t.m100207e(m114543j, "toLowerCase(...)");
                                        i12 = 1;
                                    } else {
                                        i12 = 1;
                                        m114543j = AbstractC21935u.m114543j(contactProfile3.f42434r, contactProfile3.f42437s, true);
                                    }
                                    int i24 = AbstractC8020f0.str_subtitle_item_group_mem_tab_all;
                                    Object[] objArr = new Object[i12];
                                    objArr[0] = m114543j;
                                    m118746s0 = AbstractC23136l9.m118746s0(i24, objArr);
                                }
                                str = m118746s0;
                            }
                            c22126c09.mo44614b1(0);
                            c22126c09.m111959G1(str);
                        }
                    } else if (i22 == 4) {
                        ContactProfile contactProfile4 = c6938b.f38024d;
                        if (contactProfile4 != null) {
                            if (AbstractC19074t.m100204b(contactProfile4.f42434r, CoreUtility.f89233i)) {
                                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_you);
                                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                                Locale locale2 = Locale.getDefault();
                                AbstractC19074t.m100207e(locale2, "getDefault(...)");
                                m114543j2 = m118743r02.toLowerCase(locale2);
                                AbstractC19074t.m100207e(m114543j2, "toLowerCase(...)");
                                i13 = 1;
                            } else {
                                i13 = 1;
                                m114543j2 = AbstractC21935u.m114543j(contactProfile4.f42434r, contactProfile4.f42437s, true);
                            }
                            int i25 = AbstractC8020f0.str_subtitle_item_group_mem_tab_block;
                            Object[] objArr2 = new Object[i13];
                            objArr2[0] = m114543j2;
                            String m118746s02 = AbstractC23136l9.m118746s0(i25, objArr2);
                            AbstractC19074t.m100207e(m118746s02, "getString(...)");
                            c22126c09.mo44614b1(0);
                            c22126c09.m111959G1(m118746s02);
                        }
                    } else if (i22 == 5 && (contactProfile = c6938b.f38023c) != null) {
                        if (AbstractC19074t.m100204b(contactProfile.f42434r, CoreUtility.f89233i)) {
                            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_you);
                            AbstractC19074t.m100207e(m118743r03, "getString(...)");
                            Locale locale3 = Locale.getDefault();
                            AbstractC19074t.m100207e(locale3, "getDefault(...)");
                            m114543j3 = m118743r03.toLowerCase(locale3);
                            AbstractC19074t.m100207e(m114543j3, "toLowerCase(...)");
                            i14 = 1;
                        } else {
                            i14 = 1;
                            m114543j3 = AbstractC21935u.m114543j(contactProfile.f42434r, contactProfile.f42437s, true);
                        }
                        int i26 = AbstractC8020f0.str_invited_by;
                        Object[] objArr3 = new Object[i14];
                        objArr3[0] = m114543j3;
                        String m118746s03 = AbstractC23136l9.m118746s0(i26, objArr3);
                        AbstractC19074t.m100207e(m118746s03, "getString(...)");
                        c22126c09.mo44614b1(0);
                        c22126c09.m111959G1(m118746s03);
                    }
                }
                C22129e c22129e5 = this.f64552O;
                if (contactProfile2 != null) {
                    c22129e5.m115439w1(C23278z2.m120143n());
                    c22129e5.m115442z1(AbstractC22055v0.m115112B(contactProfile2.f42434r));
                    c22129e5.m115429C1(AbstractC22055v0.m115116F(contactProfile2.f42434r, AbstractC21244b.m110054d(c22129e5.getContext())), AbstractC22055v0.m115115E(contactProfile2.f42434r, AbstractC21244b.m110054d(c22129e5.getContext())));
                    c22129e5.m115433q1(contactProfile2);
                    if (AbstractC22055v0.m115114D(contactProfile2.f42434r, AbstractC21244b.m110054d(c22129e5.getContext()))) {
                        c22129e5.mo89099H0(true);
                        c22129e5.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.l1
                            @Override // com.zing.zalo.uidrawing.C16719g.c
                            /* renamed from: y */
                            public final void mo929y(C16719g c16719g) {
                                GroupFullMemberAdapter.MemberRowModuleView.m35644a0(GroupFullMemberAdapter.this, contactProfile2, c16719g);
                            }
                        });
                    } else {
                        c22129e5.mo89099H0(false);
                    }
                }
                if (groupFullMemberAdapter.f38004A != 3) {
                    if (!AbstractC19074t.m100204b(contactProfile2 != null ? contactProfile2.f42434r : null, CoreUtility.f89233i)) {
                        if (groupFullMemberAdapter.f38004A == 4) {
                            C22126c0 c22126c010 = this.f64555R;
                            c22126c010.mo44614b1(8);
                            c22126c010.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_unblock_member));
                            if (contactProfile2 != null) {
                                c22126c010.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.m1
                                    @Override // com.zing.zalo.uidrawing.C16719g.c
                                    /* renamed from: y */
                                    public final void mo929y(C16719g c16719g) {
                                        GroupFullMemberAdapter.MemberRowModuleView.m35645b0(GroupFullMemberAdapter.this, contactProfile2, c16719g);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        C21693c c21693c3 = this.f64556S;
                        if (contactProfile2 != null) {
                            if (!AbstractC21935u.m114554u(contactProfile2.f42434r) && !C21927m.m114302u().m114357s().m153137g(contactProfile2.f42434r) && contactProfile2.f42352K0 <= 0) {
                                c21693c3.mo44614b1(0);
                                if (AbstractC23063f2.m118359k(contactProfile2.f42434r)) {
                                    c21693c3.mo111925v1(AbstractC23136l9.m118665N(c21693c3.getContext(), AbstractC16803z.icn_popupcall_chat_1));
                                    c21693c3.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.n1
                                        @Override // com.zing.zalo.uidrawing.C16719g.c
                                        /* renamed from: y */
                                        public final void mo929y(C16719g c16719g) {
                                            GroupFullMemberAdapter.MemberRowModuleView.m35646c0(GroupFullMemberAdapter.this, contactProfile2, c16719g);
                                        }
                                    });
                                    return;
                                } else {
                                    c21693c3.mo111925v1(AbstractC23136l9.m118665N(c21693c3.getContext(), AbstractC16803z.icn_add_friend_member_list));
                                    c21693c3.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.o1
                                        @Override // com.zing.zalo.uidrawing.C16719g.c
                                        /* renamed from: y */
                                        public final void mo929y(C16719g c16719g) {
                                            GroupFullMemberAdapter.MemberRowModuleView.m35647d0(GroupFullMemberAdapter.this, contactProfile2, c16719g);
                                        }
                                    });
                                    return;
                                }
                            }
                            c21693c3.mo44614b1(4);
                            c21693c3.mo89109M0(null);
                            return;
                        }
                        return;
                    }
                }
                C22126c0 c22126c011 = this.f64555R;
                c22126c011.mo44614b1(8);
                c22126c011.mo89109M0(null);
                C21693c c21693c4 = this.f64556S;
                c21693c4.mo44614b1(8);
                c21693c4.mo89109M0(null);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.adapters.GroupFullMemberAdapter$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC6937a {
        /* renamed from: i */
        void mo35639i(C6938b c6938b, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.adapters.GroupFullMemberAdapter$b */
    /* loaded from: classes3.dex */
    public static class C6938b {
        public static final a Companion = new a(null);

        /* renamed from: a */
        public int f38021a;

        /* renamed from: b */
        public ContactProfile f38022b;

        /* renamed from: c */
        public ContactProfile f38023c;

        /* renamed from: d */
        public ContactProfile f38024d;

        /* renamed from: e */
        public boolean f38025e;

        /* renamed from: f */
        public boolean f38026f;

        /* renamed from: g */
        public boolean f38027g;

        /* renamed from: h */
        public int f38028h;

        /* renamed from: j */
        public int f38030j;

        /* renamed from: m */
        public boolean f38033m;

        /* renamed from: n */
        public boolean f38034n;

        /* renamed from: o */
        public boolean f38035o;

        /* renamed from: p */
        public boolean f38036p;

        /* renamed from: i */
        public ArrayList f38029i = new ArrayList();

        /* renamed from: k */
        public CharSequence f38031k = "";

        /* renamed from: l */
        public CharSequence f38032l = "";

        /* renamed from: com.zing.zalo.adapters.GroupFullMemberAdapter$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public C6938b(int i11) {
            this.f38021a = i11;
        }

        /* renamed from: a */
        public final C6938b m35648a() {
            CharSequence obj;
            CharSequence obj2;
            C6938b c6938b = new C6938b(this.f38021a);
            ContactProfile contactProfile = this.f38022b;
            if (contactProfile != null) {
                c6938b.f38022b = ContactProfile.m40356w(contactProfile);
            }
            ContactProfile contactProfile2 = this.f38023c;
            if (contactProfile2 != null) {
                c6938b.f38023c = ContactProfile.m40356w(contactProfile2);
            }
            ContactProfile contactProfile3 = this.f38024d;
            if (contactProfile3 != null) {
                c6938b.f38024d = ContactProfile.m40356w(contactProfile3);
            }
            c6938b.f38025e = this.f38025e;
            c6938b.f38026f = this.f38026f;
            c6938b.f38027g = this.f38027g;
            c6938b.f38028h = this.f38028h;
            ArrayList arrayList = new ArrayList(this.f38029i);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.set(i11, ContactProfile.m40356w((ContactProfile) arrayList.get(i11)));
            }
            c6938b.f38029i = arrayList;
            c6938b.f38030j = this.f38030j;
            CharSequence charSequence = this.f38031k;
            if (charSequence instanceof SpannableStringBuilder) {
                obj = new SpannableStringBuilder(charSequence);
            } else {
                obj = charSequence.toString();
            }
            c6938b.f38031k = obj;
            CharSequence charSequence2 = this.f38032l;
            if (charSequence2 instanceof SpannableStringBuilder) {
                obj2 = new SpannableStringBuilder(charSequence2);
            } else {
                obj2 = charSequence2.toString();
            }
            c6938b.f38032l = obj2;
            c6938b.f38033m = this.f38033m;
            c6938b.f38034n = this.f38034n;
            c6938b.f38035o = this.f38035o;
            c6938b.f38036p = this.f38036p;
            return c6938b;
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupFullMemberAdapter$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC6939c {
        /* renamed from: b */
        void mo35649b(ContactProfile contactProfile);

        /* renamed from: c */
        void mo35650c(ContactProfile contactProfile);

        /* renamed from: d */
        void mo35651d(String str, ArrayList arrayList);

        /* renamed from: e */
        void mo35652e(String str);

        /* renamed from: f */
        void mo35653f(boolean z11, String str);

        /* renamed from: g */
        void mo35654g(Rect rect);

        /* renamed from: h */
        void mo35655h(ContactProfile contactProfile);

        /* renamed from: i */
        void mo35656i(ContactProfile contactProfile);

        /* renamed from: j */
        void mo35657j(String str, ContactProfile contactProfile, int i11);

        /* renamed from: k */
        void mo35658k(String str);

        /* renamed from: l */
        void mo35659l(String str, String str2);

        /* renamed from: m */
        void mo35660m(ContactProfile contactProfile);

        /* renamed from: n */
        void mo35661n(String str);

        /* renamed from: o */
        void mo35662o(String str, ArrayList arrayList);
    }

    /* renamed from: com.zing.zalo.adapters.GroupFullMemberAdapter$d */
    /* loaded from: classes3.dex */
    public final class C6940d extends AbstractC6942f {

        /* renamed from: I */
        private final LinearLayout f38037I;

        /* renamed from: J */
        private final LinearLayout f38038J;

        /* renamed from: K */
        final /* synthetic */ GroupFullMemberAdapter f38039K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6940d(GroupFullMemberAdapter groupFullMemberAdapter, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f38039K = groupFullMemberAdapter;
            View findViewById = view.findViewById(AbstractC6918a0.layoutFeedFooterError);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            LinearLayout linearLayout = (LinearLayout) findViewById;
            this.f38037I = linearLayout;
            linearLayout.setVisibility(8);
            View findViewById2 = view.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
            AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
            LinearLayout linearLayout2 = (LinearLayout) findViewById2;
            this.f38038J = linearLayout2;
            linearLayout2.setVisibility(0);
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6937a
        /* renamed from: i */
        public void mo35639i(C6938b c6938b, int i11, boolean z11) {
            AbstractC19074t.m100208f(c6938b, "groupMemberItem");
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupFullMemberAdapter$e */
    /* loaded from: classes3.dex */
    public final class C6941e extends AbstractC6942f {

        /* renamed from: I */
        private final ModulesView f38040I;

        /* renamed from: J */
        final /* synthetic */ GroupFullMemberAdapter f38041J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6941e(GroupFullMemberAdapter groupFullMemberAdapter, ModulesView modulesView) {
            super(modulesView);
            AbstractC19074t.m100208f(modulesView, "itemView");
            this.f38041J = groupFullMemberAdapter;
            this.f38040I = modulesView;
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6937a
        /* renamed from: i */
        public void mo35639i(C6938b c6938b, int i11, boolean z11) {
            AbstractC19074t.m100208f(c6938b, "groupMemberItem");
            try {
                C6938b m35631L = this.f38041J.m35631L(i11);
                if (m35631L != null) {
                    GroupFullMemberAdapter groupFullMemberAdapter = this.f38041J;
                    ViewParent viewParent = this.f38040I;
                    if (viewParent instanceof InterfaceC6937a) {
                        ((InterfaceC6937a) viewParent).mo35639i(m35631L, i11, groupFullMemberAdapter.f38010w);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupFullMemberAdapter$f */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC6942f extends RecyclerView.AbstractC1876c0 implements InterfaceC6937a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC6942f(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    public GroupFullMemberAdapter(Context context, ArrayList arrayList, C23528a c23528a, InterfaceC6939c interfaceC6939c, int i11, String str, boolean z11) {
        AbstractC19074t.m100208f(context, "mContext");
        AbstractC19074t.m100208f(arrayList, "itemList");
        AbstractC19074t.m100208f(str, "sourceStartView");
        this.f38005r = context;
        this.f38006s = c23528a;
        this.f38007t = str;
        this.f38008u = z11;
        this.f38009v = new ArrayList(arrayList);
        Object systemService = this.f38005r.getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f38012y = (LayoutInflater) systemService;
        this.f38013z = interfaceC6939c;
        this.f38004A = i11;
    }

    /* renamed from: L */
    public final C6938b m35631L(int i11) {
        if (i11 >= 0 && i11 < this.f38009v.size()) {
            return (C6938b) this.f38009v.get(i11);
        }
        return null;
    }

    /* renamed from: M */
    public final boolean m35632M() {
        return this.f38008u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo9990A(AbstractC6942f abstractC6942f, int i11) {
        AbstractC19074t.m100208f(abstractC6942f, "holder");
        C6938b m35631L = m35631L(i11);
        if (m35631L != null) {
            abstractC6942f.mo35639i(m35631L, i11, this.f38010w);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public AbstractC6942f mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 4) {
            if (i11 != 5) {
                return new C6941e(this, new MemberRowModuleView(this.f38005r, this.f38006s));
            }
            return new C6941e(this, new HeaderModuleView(this.f38005r));
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.group_rada_footer, viewGroup, false);
        AbstractC19074t.m100205c(inflate);
        return new C6940d(this, inflate);
    }

    /* renamed from: P */
    public final void m35635P(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "itemList");
        this.f38009v = new ArrayList(arrayList);
    }

    /* renamed from: Q */
    public final void m35636Q(boolean z11) {
        this.f38010w = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38009v.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((C6938b) this.f38009v.get(i11)).f38021a;
    }

    public /* synthetic */ GroupFullMemberAdapter(Context context, ArrayList arrayList, C23528a c23528a, InterfaceC6939c interfaceC6939c, int i11, String str, boolean z11, int i12, AbstractC19060k abstractC19060k) {
        this(context, arrayList, c23528a, interfaceC6939c, i11, (i12 & 32) != 0 ? "" : str, (i12 & 64) != 0 ? false : z11);
    }
}
