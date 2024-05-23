package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import am.C0943w;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.p077ui.zviews.PrivacyPickGroupView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.SimpleMenuListPopupView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import gw.C19637j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p459qs.C25490c;
import p692ys.C31070a;
import p716zh.C31973j5;
import p716zh.C31988k5;
import p716zh.C32020m7;
import p716zh.C32076q5;
import rs.C25976a;
import vg.C28203u6;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class PrivacyPickGroupView extends SlidableZaloView implements ZaloView.InterfaceC17421f, C25976a.a, C23744a.c, InterfaceC0733x {

    /* renamed from: Q0 */
    C25976a f76130Q0;

    /* renamed from: R0 */
    C31973j5 f76131R0;

    /* renamed from: S0 */
    RecyclerView f76132S0;

    /* renamed from: T0 */
    LinearLayoutManager f76133T0;

    /* renamed from: U0 */
    MultiStateView f76134U0;

    /* renamed from: V0 */
    C23528a f76135V0;

    /* renamed from: W0 */
    RobotoEditText f76136W0;

    /* renamed from: Y0 */
    long f76138Y0;

    /* renamed from: a1 */
    View f76140a1;

    /* renamed from: P0 */
    ArrayList f76129P0 = new ArrayList();

    /* renamed from: X0 */
    int f76137X0 = 0;

    /* renamed from: Z0 */
    Map f76139Z0 = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.zing.zalo.ui.zviews.PrivacyPickGroupView$a */
    /* loaded from: classes6.dex */
    class C14779a extends AbstractC18391a {
        C14779a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            new C14783e(charSequence.toString());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PrivacyPickGroupView$b */
    /* loaded from: classes6.dex */
    class C14780b extends RecyclerView.AbstractC1892s {
        C14780b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            if (i11 == 0) {
                C25976a c25976a = PrivacyPickGroupView.this.f76130Q0;
                c25976a.f123935s = false;
                c25976a.m10008p();
            } else {
                PrivacyPickGroupView privacyPickGroupView = PrivacyPickGroupView.this;
                privacyPickGroupView.f76130Q0.f123935s = true;
                RobotoEditText robotoEditText = privacyPickGroupView.f76136W0;
                if (robotoEditText != null) {
                    AbstractC2379w.m12430d(robotoEditText);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PrivacyPickGroupView$c */
    /* loaded from: classes6.dex */
    class C14781c extends ZdsActionBar.AbstractC16987c {
        C14781c() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            RobotoEditText robotoEditText = PrivacyPickGroupView.this.f76136W0;
            if (robotoEditText != null) {
                AbstractC2379w.m12430d(robotoEditText);
            }
            PrivacyPickGroupView.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PrivacyPickGroupView$d */
    /* loaded from: classes6.dex */
    class C14782d extends C7145n.g {
        C14782d() {
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
            PrivacyPickGroupView.this.m82849iM();
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
            PrivacyPickGroupView.this.m82850jM(0);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PrivacyPickGroupView$e */
    /* loaded from: classes6.dex */
    public class C14783e extends Thread {

        /* renamed from: p */
        final String f76145p;

        public C14783e(String str) {
            super("Z:PrivacyPickGroup-Search");
            this.f76145p = str;
            start();
        }

        /* renamed from: b */
        public /* synthetic */ void m82855b(ArrayList arrayList) {
            try {
                if (this.f76145p.equals(PrivacyPickGroupView.this.f76136W0.getText().toString())) {
                    PrivacyPickGroupView.this.f76130Q0.m133803P(arrayList);
                    PrivacyPickGroupView.this.m82853pv(false, 0);
                    PrivacyPickGroupView.this.m82852nM(AbstractC8020f0.str_emptyResult);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ContactProfile contactProfile;
            try {
                ArrayList arrayList = new ArrayList();
                if (PrivacyPickGroupView.this.f76130Q0 != null) {
                    if (TextUtils.isEmpty(this.f76145p)) {
                        for (int i11 = 0; i11 < PrivacyPickGroupView.this.f76129P0.size(); i11++) {
                            if (PrivacyPickGroupView.this.f76129P0.get(i11) != null && ((C32020m7) PrivacyPickGroupView.this.f76129P0.get(i11)).f147411b != null) {
                                ((C32020m7) PrivacyPickGroupView.this.f76129P0.get(i11)).f147411b.f42399a1.clear();
                            }
                        }
                        arrayList = new ArrayList(PrivacyPickGroupView.this.f76129P0);
                    } else {
                        String m120002o = AbstractC23262x6.m120002o(this.f76145p);
                        Iterator it = PrivacyPickGroupView.this.f76129P0.iterator();
                        while (it.hasNext()) {
                            C32020m7 c32020m7 = (C32020m7) it.next();
                            if (c32020m7 != null && (contactProfile = c32020m7.f147411b) != null) {
                                contactProfile.f42399a1.clear();
                                if (c32020m7.f147410a == 1) {
                                    String m120002o2 = AbstractC23262x6.m120002o(c32020m7.f147411b.f42437s);
                                    if (!TextUtils.isEmpty(m120002o2) && m120002o2.contains(m120002o)) {
                                        int indexOf = m120002o2.indexOf(m120002o);
                                        if (indexOf != -1) {
                                            int length = m120002o.length() + indexOf;
                                            c32020m7.f147411b.f42399a1.add(Integer.valueOf(indexOf));
                                            c32020m7.f147411b.f42399a1.add(Integer.valueOf(length));
                                        }
                                        arrayList.add(c32020m7);
                                    }
                                }
                            }
                        }
                    }
                    if (PrivacyPickGroupView.this.f72421L0.m92676n2() != null) {
                        PrivacyPickGroupView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.l60

                            /* renamed from: q */
                            public final /* synthetic */ ArrayList f80982q;

                            public /* synthetic */ l60(ArrayList arrayList2) {
                                r2 = arrayList2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                PrivacyPickGroupView.C14783e.this.m82855b(r2);
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: kM */
    public /* synthetic */ void m82847kM(int i11) {
        try {
            this.f76130Q0.m133803P(this.f76129P0);
            m82853pv(false, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lM */
    public /* synthetic */ void m82848lM(RecyclerView recyclerView, int i11, View view) {
        List<String> arrayList;
        ContactProfile m141809c;
        try {
            C25976a c25976a = this.f76130Q0;
            if (c25976a != null && i11 >= 0 && c25976a.mo10003k() > i11 && this.f76130Q0.m133799L(i11).f147410a == 1) {
                C31973j5 m4473g = C0943w.m4462l().m4473g(this.f76130Q0.m133799L(i11).f147411b.f42434r);
                this.f76131R0 = m4473g;
                int i12 = this.f76137X0;
                if (i12 == 1) {
                    if (m4473g == null || (!m4473g.m153742T() && !this.f76131R0.m153759f0())) {
                        if (this.f76138Y0 != -1) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_no_right_create_time_reminder));
                            return;
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_no_right_create_note));
                            return;
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_group_id", this.f76131R0.m153781r());
                    long j11 = this.f76138Y0;
                    if (j11 != -1) {
                        bundle.putLong("EXTRA_START_TIME", j11);
                    }
                    bundle.putInt("INT_EXTRA_MODE_REMINDER_COMPOSE", 2);
                    this.f72421L0.m92662fJ().m93066i2(GroupReminderComposeView.class, bundle, 1000, 2, true);
                    return;
                }
                if (i12 == 0 && m4473g != null && !TextUtils.isEmpty(m4473g.m153781r())) {
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    C32076q5 m4476k = C0943w.m4462l().m4476k(this.f76131R0.m153781r());
                    if (m4476k != null) {
                        arrayList = m4476k.m154718g();
                    } else {
                        arrayList = new ArrayList();
                    }
                    for (String str : arrayList) {
                        if (!CoreUtility.f89233i.equals(str) && AbstractC21935u.m114558y(str) && (m141809c = C28203u6.f131407a.m141809c(str)) != null) {
                            arrayList2.add(new InviteContactProfile(m141809c));
                        }
                    }
                    if (arrayList2.size() == 0) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_pick_empty_group));
                        return;
                    }
                    if (arrayList2.size() > 100) {
                        ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_privacy_group_limit_member, 100));
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArrayList("extra_selected_profile", arrayList2);
                    bundle2.putInt("extra_mode", 2);
                    this.f72421L0.m92662fJ().m93066i2(PrivacyShareListView.class, bundle2, 1019, 2, true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.privacy_pick_group_view, viewGroup, false);
        this.f76140a1 = inflate;
        this.f76134U0 = (MultiStateView) inflate.findViewById(AbstractC6918a0.multi_state);
        this.f76132S0 = (RecyclerView) this.f76140a1.findViewById(AbstractC6918a0.groupRecyclerView);
        m82852nM(AbstractC8020f0.empty_list);
        m82851mM(AbstractC8020f0.str_tv_loadingGroupList);
        RobotoEditText robotoEditText = (RobotoEditText) this.f76140a1.findViewById(AbstractC6918a0.edit_search);
        this.f76136W0 = robotoEditText;
        robotoEditText.addTextChangedListener(new C14779a());
        C19637j.f97466a.m102840X();
        return this.f76140a1;
    }

    @Override // rs.C25976a.a
    /* renamed from: Gq */
    public void mo67804Gq(String str, String str2) {
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        if (m87077NK() != null) {
            m87077NK().setLeadingFunctionCallback(new C14781c());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.m124114c().m124117e(this, 36);
    }

    @Override // rs.C25976a.a
    /* renamed from: Va */
    public void mo67809Va(C31070a c31070a, String str, String str2, TrackingSource trackingSource) {
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PrivacyPickGroupView";
    }

    /* renamed from: iM */
    public void m82849iM() {
        try {
            ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("request_sort_list");
            if (m92996E0 != null) {
                this.f72421L0.m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: Exception -> 0x0008, TryCatch #0 {Exception -> 0x0008, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0012, B:15:0x004c, B:17:0x0054, B:21:0x007f, B:22:0x00a2, B:23:0x0088, B:24:0x0091, B:25:0x009a, B:26:0x00a7, B:36:0x0049, B:37:0x000b, B:8:0x0022, B:31:0x002f, B:32:0x0039, B:33:0x0041), top: B:1:0x0000, inners: #1 }] */
    /* renamed from: jM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m82850jM(int i11) {
        int m102828I;
        try {
            ArrayList arrayList = this.f76129P0;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                this.f76129P0 = new ArrayList();
            }
            C19637j c19637j = C19637j.f97466a;
            this.f76129P0 = new ArrayList(c19637j.m102871x());
            try {
                m102828I = c19637j.m102828I();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (m102828I != 0) {
                if (m102828I != 1) {
                    if (m102828I != 2) {
                        if (m102828I != 3) {
                        }
                    } else {
                        Collections.sort(this.f76129P0, C19637j.f97459A);
                    }
                } else {
                    Collections.sort(this.f76129P0, C19637j.f97491z);
                }
                if (this.f76129P0.size() > 0) {
                    C32020m7 c32020m7 = new C32020m7(7);
                    c32020m7.f147428s = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.title_section_my_group_list), Integer.valueOf(this.f76129P0.size()));
                    int m122492v4 = AbstractC23309i.m122492v4();
                    if (m122492v4 != 1) {
                        if (m122492v4 != 2) {
                            if (m122492v4 != 3) {
                                c32020m7.f147429t = AbstractC23136l9.m118743r0(AbstractC8020f0.str_item_menu_filter);
                            } else {
                                c32020m7.f147429t = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_recent_activity);
                            }
                        } else {
                            c32020m7.f147429t = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_manage);
                        }
                    } else {
                        c32020m7.f147429t = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_name);
                    }
                    this.f76129P0.add(0, c32020m7);
                }
                this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.j60

                    /* renamed from: q */
                    public final /* synthetic */ int f80761q;

                    public /* synthetic */ j60(int i112) {
                        r2 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PrivacyPickGroupView.this.m82847kM(r2);
                    }
                });
            }
            Collections.sort(this.f76129P0, C19637j.f97489x);
            if (this.f76129P0.size() > 0) {
            }
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.j60

                /* renamed from: q */
                public final /* synthetic */ int f80761q;

                public /* synthetic */ j60(int i112) {
                    r2 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PrivacyPickGroupView.this.m82847kM(r2);
                }
            });
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: mM */
    void m82851mM(int i11) {
        MultiStateView multiStateView = this.f76134U0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: nM */
    void m82852nM(int i11) {
        MultiStateView multiStateView = this.f76134U0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1019) {
            if (i12 == -1 && intent != null && intent.hasExtra("extra_selected_profiles")) {
                ArrayList<? extends Parcelable> parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles");
                Intent intent2 = new Intent();
                if (parcelableArrayListExtra != null) {
                    intent2.putParcelableArrayListExtra("extra_selected_profiles", parcelableArrayListExtra);
                }
                this.f72421L0.mo50035CK(-1, intent2);
                finish();
                return;
            }
            return;
        }
        if (i11 == 1000 && i12 == -1) {
            Intent intent3 = new Intent();
            C31988k5 m132062h = C25490c.m132054j().m132062h(intent.getStringExtra("extra_group_board_gen_id"));
            if (m132062h != null) {
                C7904b c7904b = m132062h.f147201b;
                long j11 = c7904b.f42732d;
                if (j11 == 0) {
                    intent3.putExtra("EXTRA_TIME", c7904b.f42717E);
                } else {
                    intent3.putExtra("EXTRA_TIME", j11);
                }
            }
            this.f72421L0.mo50035CK(-1, intent3);
            finish();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C23744a.m124114c().m124115b(this, 36);
    }

    /* renamed from: pv */
    void m82853pv(boolean z11, int i11) {
        if (z11) {
            this.f76134U0.setVisibility(0);
            this.f76134U0.setState(MultiStateView.EnumC15914e.LOADING);
            this.f76132S0.setVisibility(8);
            return;
        }
        C25976a c25976a = this.f76130Q0;
        if (c25976a != null && c25976a.mo10003k() > 0) {
            this.f76134U0.setVisibility(8);
            this.f76132S0.setVisibility(0);
        } else {
            this.f76132S0.setVisibility(8);
            this.f76134U0.setVisibility(0);
            m82852nM(AbstractC8020f0.empty_list);
            this.f76134U0.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    @Override // rs.C25976a.a
    /* renamed from: tl */
    public void mo67819tl(C31973j5 c31973j5) {
    }

    @Override // rs.C25976a.a
    /* renamed from: uG */
    public void mo67820uG(Rect rect) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7145n.b(m92689tK(), 5, 3, AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_recent_activity), ""));
        arrayList.add(new C7145n.b(m92689tK(), 5, 1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_name), ""));
        arrayList.add(new C7145n.b(m92689tK(), 5, 2, AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_manage), ""));
        this.f72421L0.m92649TI().m93060e2(0, SimpleMenuListPopupView.m87992ML(arrayList, new C14782d(), rect, AbstractC23309i.m122492v4()), "request_sort_list", 0, false);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 36) {
            try {
                m82850jM(0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            this.f76135V0 = new C23528a(this.f72421L0.m92648SI());
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f76137X0 = m92642L3.getInt("PICKER_TYPE_EXTRA", 0);
                this.f76138Y0 = m92642L3.getLong("EXTRA_TIME", -1L);
            }
            C31784b.m152808a(this.f76132S0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.k60
                public /* synthetic */ k60() {
                }

                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                    PrivacyPickGroupView.this.m82848lM(recyclerView, i11, view);
                }
            });
            C25976a c25976a = new C25976a(this.f76135V0, this);
            this.f76130Q0 = c25976a;
            c25976a.m9999J(true);
            this.f76132S0.setAdapter(this.f76130Q0);
            this.f76132S0.setHasFixedSize(true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.m92648SI());
            this.f76133T0 = linearLayoutManager;
            this.f76132S0.setLayoutManager(linearLayoutManager);
            this.f76132S0.setItemAnimator(null);
            this.f76132S0.m9826E(new C14780b());
            m82850jM(0);
            m82853pv(false, 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
