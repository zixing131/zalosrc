package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import am.C0943w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.C1914g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import bn.C2864d1;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.adapters.C7137m2;
import com.zing.zalo.adapters.GroupPollOptionsDetailRecyclerAdapter;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.poll.GroupPollOptionsDetailView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import h70.C19908b;
import h70.C19909c;
import h70.C19910d;
import h70.C19914h;
import h70.C19918l;
import h70.C19920n;
import h70.C19921o;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p227i3.C20218v;
import p304ks.C21927m;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p495rx.C25994h;
import p542ub.InterfaceC27218a;
import p588vw.C28652r;
import p649xl.C29850i4;
import p716zh.C31862c;
import p716zh.C31961i8;
import p716zh.C31973j5;
import p716zh.C32002l4;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import sa0.C26203c;
import sa0.C26209i;
import v20.C27473a;
import v50.C27870vb;
import vg.AbstractC28025b8;
import vg.AbstractC28207v1;
import vg.C28176r6;
import vg.C28212v6;

/* loaded from: classes6.dex */
public final class GroupPollVotingView extends RemoveGroupMemberBaseView implements View.OnClickListener, C23744a.c, KeyboardFrameLayout.InterfaceC13508a, InterfaceC0733x {
    public static final C14401a Companion = new C14401a(null);

    /* renamed from: D1 */
    private final InterfaceC24854k f73981D1;

    /* renamed from: E1 */
    private final C13306b.c f73982E1;

    /* renamed from: F1 */
    private final C19914h.d f73983F1;

    /* renamed from: G1 */
    private boolean f73984G1;

    /* renamed from: H1 */
    private boolean f73985H1;

    /* renamed from: I1 */
    private GroupPollOptionsDetailView f73986I1;

    /* renamed from: J1 */
    private C2864d1 f73987J1;

    /* renamed from: K1 */
    private final GroupPollOptionsDetailRecyclerAdapter.InterfaceC6959a f73988K1;

    /* renamed from: j1 */
    private C29850i4 f73989j1;

    /* renamed from: k1 */
    private C7137m2 f73990k1;

    /* renamed from: l1 */
    private LinearLayoutManager f73991l1;

    /* renamed from: m1 */
    private C31961i8 f73992m1;

    /* renamed from: n1 */
    private String f73993n1;

    /* renamed from: o1 */
    private String f73994o1;

    /* renamed from: p1 */
    private C31973j5 f73995p1;

    /* renamed from: r1 */
    private boolean f73997r1;

    /* renamed from: s1 */
    private C23528a f73998s1;

    /* renamed from: t1 */
    private boolean f73999t1;

    /* renamed from: q1 */
    private final ArrayList f73996q1 = new ArrayList();

    /* renamed from: u1 */
    private final InterfaceC24854k f74000u1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C19914h.class), new C14414n(new C14413m(this)), C14407g.f74011q);

    /* renamed from: v1 */
    private final InterfaceC1764d0 f74001v1 = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.om
        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            GroupPollVotingView.m80386bO(GroupPollVotingView.this, (C31961i8) obj);
        }
    };

    /* renamed from: w1 */
    private final InterfaceC1764d0 f74002w1 = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.pm
        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            GroupPollVotingView.m80382ZN(GroupPollVotingView.this, (List) obj);
        }
    };

    /* renamed from: x1 */
    private final InterfaceC1764d0 f74003x1 = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.qm
        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            GroupPollVotingView.m80384aO(GroupPollVotingView.this, (C19910d) obj);
        }
    };

    /* renamed from: y1 */
    private final InterfaceC1764d0 f74004y1 = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.rm
        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            GroupPollVotingView.m80390dO(GroupPollVotingView.this, (C19920n) obj);
        }
    };

    /* renamed from: z1 */
    private final InterfaceC1764d0 f74005z1 = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.sm
        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            GroupPollVotingView.m80380YN(GroupPollVotingView.this, (C19908b) obj);
        }
    };

    /* renamed from: A1 */
    private final InterfaceC1764d0 f73978A1 = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.tm
        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            GroupPollVotingView.m80388cO(GroupPollVotingView.this, (C19918l) obj);
        }
    };

    /* renamed from: B1 */
    private final InterfaceC1764d0 f73979B1 = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.um
        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            GroupPollVotingView.m80392eO(GroupPollVotingView.this, (C19921o) obj);
        }
    };

    /* renamed from: C1 */
    private final C14406f f73980C1 = new C14406f();

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$a */
    /* loaded from: classes6.dex */
    public static final class C14401a {
        private C14401a() {
        }

        public /* synthetic */ C14401a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$b */
    /* loaded from: classes6.dex */
    public static final class C14402b implements GroupPollOptionsDetailRecyclerAdapter.InterfaceC6959a {
        C14402b() {
        }

        @Override // com.zing.zalo.adapters.GroupPollOptionsDetailRecyclerAdapter.InterfaceC6959a
        /* renamed from: a */
        public void mo35704a(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "profile");
            try {
                AbstractC23211s7.m119562B(contactProfile.f42434r, GroupPollVotingView.this.f72421L0.m92662fJ(), GroupPollVotingView.this.f73994o1, C32002l4.Companion.m154288b(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 13));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.adapters.GroupPollOptionsDetailRecyclerAdapter.InterfaceC6959a
        /* renamed from: b */
        public void mo35705b(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "profile");
            try {
                String mo2478b = contactProfile.mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                AbstractC23211s7.m119583p(GroupPollVotingView.this.f72421L0.m92676n2(), new C27870vb(mo2478b).m140780g(contactProfile).m140776b(), contactProfile);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.adapters.GroupPollOptionsDetailRecyclerAdapter.InterfaceC6959a
        /* renamed from: c */
        public void mo35706c(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "profile");
            try {
                if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                    TrackingSource trackingSource = new TrackingSource(21);
                    trackingSource.m40677a("groupId", GroupPollVotingView.this.f73994o1);
                    C31973j5 m4473g = C0943w.f3447a.m4473g(GroupPollVotingView.this.f73994o1);
                    if (m4473g != null) {
                        trackingSource.m40677a("groupVisibility", Integer.valueOf(m4473g.m153740S()));
                        trackingSource.m40678b("nameHolder", m4473g.m153793y());
                    }
                    C21927m.m114302u().m114330e0(contactProfile.f42434r, trackingSource);
                }
                GroupPollVotingView groupPollVotingView = GroupPollVotingView.this;
                groupPollVotingView.f76936f1 = contactProfile;
                groupPollVotingView.m83610wM(contactProfile);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$c */
    /* loaded from: classes6.dex */
    static final class C14403c extends AbstractC19075u implements InterfaceC18494a {
        C14403c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13306b mo12V4() {
            return new C13306b(GroupPollVotingView.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$d */
    /* loaded from: classes6.dex */
    public static final class C14404d extends C13306b.c {
        C14404d() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            AbstractC19074t.m100208f(c28212v6, "notiInfo");
            if (AbstractC19074t.m100204b(c28212v6.f131577c, "tip.entry.point.new.group.from.poll")) {
                GroupPollOptionsDetailView m80426wN = GroupPollVotingView.this.m80426wN();
                if (m80426wN == null || m80426wN.getVisibility() != 0 || m80426wN.getMBtnDone().getVisibility() != 0) {
                    return false;
                }
                return true;
            }
            return super.mo66900a(c28212v6);
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: d */
        public void mo66901d(String str, C28212v6 c28212v6, C26203c c26203c) {
            AbstractC19074t.m100208f(str, "tipCat");
            AbstractC19074t.m100208f(c28212v6, "notiInfo");
            AbstractC19074t.m100208f(c26203c, "showcaseConfigs");
            if (AbstractC19074t.m100204b(str, "tip.entry.point.new.group.from.poll")) {
                c26203c.f124513d = AbstractC23136l9.m118742r(2.0f);
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            String[] strArr = AbstractC28025b8.f130869z;
            AbstractC19074t.m100207e(strArr, "ARR_POLL_DETAIL_TIPS");
            return strArr;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            GroupPollOptionsDetailView m80426wN;
            AbstractC19074t.m100208f(str, "tipCat");
            if (!AbstractC19074t.m100204b(str, "tip.entry.point.new.group.from.poll") || (m80426wN = GroupPollVotingView.this.m80426wN()) == null || m80426wN.getVisibility() != 0) {
                return null;
            }
            return new C26209i(m80426wN.getMBtnDone());
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (GroupPollVotingView.this.f72421L0.m92672lJ() && GroupPollVotingView.this.f72421L0.m92687sJ()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$e */
    /* loaded from: classes6.dex */
    public static final class C14405e extends ZdsActionBar.AbstractC16987c {
        C14405e() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            AbstractC23647d.m123897g("10010015");
            C29850i4 c29850i4 = GroupPollVotingView.this.f73989j1;
            if (c29850i4 == null) {
                AbstractC19074t.m100223u("binding");
                c29850i4 = null;
            }
            AbstractC2379w.m12430d(c29850i4.f138136s);
            GroupPollVotingView.this.m80356HN();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$f */
    /* loaded from: classes6.dex */
    public static final class C14406f implements C19914h.b {
        C14406f() {
        }

        @Override // h70.C19914h.b
        /* renamed from: a */
        public void mo80430a(C19909c c19909c) {
            AbstractC19074t.m100208f(c19909c, "item");
            C7137m2 c7137m2 = GroupPollVotingView.this.f73990k1;
            if (c7137m2 == null) {
                AbstractC19074t.m100223u("mGroupPollOptionsAdapter");
                c7137m2 = null;
            }
            c7137m2.m36311O(c19909c);
        }

        @Override // h70.C19914h.b
        /* renamed from: b */
        public void mo80431b() {
            GroupPollOptionsDetailView m80426wN = GroupPollVotingView.this.m80426wN();
            if (m80426wN != null) {
                m80426wN.m76629i();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$g */
    /* loaded from: classes6.dex */
    static final class C14407g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C14407g f74011q = new C14407g();

        C14407g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C19914h.c();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$h */
    /* loaded from: classes6.dex */
    public static final class C14408h implements C19914h.d {
        C14408h() {
        }

        @Override // h70.C19914h.d
        /* renamed from: a */
        public void mo80433a(C31961i8 c31961i8) {
            AbstractC19074t.m100208f(c31961i8, "pollInfo");
            ToastUtils.showMess(GroupPollVotingView.this.m92652XI(AbstractC8020f0.str_poll_voting_no_changed));
        }

        @Override // h70.C19914h.d
        /* renamed from: b */
        public void mo80434b(int i11) {
            if (i11 == 1) {
                GroupPollVotingView.this.showDialog(6);
            }
        }

        @Override // h70.C19914h.d
        /* renamed from: c */
        public void mo80435c(C31961i8 c31961i8) {
            AbstractC19074t.m100208f(c31961i8, "pollInfo");
            Intent intent = new Intent();
            intent.putExtra("extra_poll_info_json", c31961i8.m153673k().toString());
            GroupPollVotingView.this.f72421L0.mo50035CK(-1, intent);
            GroupPollVotingView.this.f72421L0.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$i */
    /* loaded from: classes6.dex */
    public static final class C14409i implements C7137m2.d {
        C14409i() {
        }

        @Override // com.zing.zalo.adapters.C7137m2.d
        /* renamed from: a */
        public void mo36320a(C31862c c31862c, String str, String str2) {
            AbstractC19074t.m100208f(str, "actionType");
            GroupPollVotingView.this.m80417PN(c31862c, str, str2);
        }

        @Override // com.zing.zalo.adapters.C7137m2.d
        /* renamed from: b */
        public void mo36321b(C31961i8.a aVar) {
            AbstractC19074t.m100208f(aVar, "pollOption");
            GroupPollVotingView.this.m80424nO(0, aVar.f146905e);
        }

        @Override // com.zing.zalo.adapters.C7137m2.d
        /* renamed from: c */
        public void mo36322c(C31961i8.a aVar) {
            AbstractC19074t.m100208f(aVar, "pollOption");
            if (aVar.f146908h) {
                AbstractC23647d.m123897g("10010017");
                GroupPollVotingView.this.m80419UN(aVar);
            }
        }

        @Override // com.zing.zalo.adapters.C7137m2.d
        /* renamed from: d */
        public void mo36323d() {
            C31961i8 c31961i8 = GroupPollVotingView.this.f73992m1;
            if (c31961i8 != null && c31961i8.m153666c() > 0) {
                AbstractC23647d.m123897g("10010016");
                GroupPollVotingView.this.m80424nO(0, "");
            }
        }

        @Override // com.zing.zalo.adapters.C7137m2.d
        /* renamed from: e */
        public void mo36324e() {
            AbstractC23647d.m123897g("10010013");
            GroupPollVotingView.this.m80364ON();
        }

        @Override // com.zing.zalo.adapters.C7137m2.d
        /* renamed from: f */
        public void mo36325f(C31961i8.a aVar) {
            AbstractC19074t.m100208f(aVar, "pollOption");
            GroupPollVotingView.this.m80415zN().m103640E0(aVar);
            AbstractC23647d.m123897g("10010012");
        }

        @Override // com.zing.zalo.adapters.C7137m2.d
        /* renamed from: g */
        public void mo36326g() {
            C31961i8 c31961i8 = GroupPollVotingView.this.f73992m1;
            if (c31961i8 != null) {
                GroupPollVotingView groupPollVotingView = GroupPollVotingView.this;
                AbstractC23211s7.m119562B(c31961i8.f146884e, groupPollVotingView.m92662fJ(), groupPollVotingView.f73994o1, C32002l4.Companion.m154288b(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 13));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$j */
    /* loaded from: classes6.dex */
    public static final class C14410j extends AbstractC18391a {
        C14410j() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AbstractC19074t.m100208f(editable, "editable");
            try {
                C29850i4 c29850i4 = GroupPollVotingView.this.f73989j1;
                C29850i4 c29850i42 = null;
                if (c29850i4 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29850i4 = null;
                }
                Editable text = c29850i4.f138137t.getText();
                if (text != null && text.length() > 120) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m92652XI = GroupPollVotingView.this.m92652XI(AbstractC8020f0.str_poll_max_chars_input);
                    AbstractC19074t.m100207e(m92652XI, "getString(...)");
                    String format = String.format(m92652XI, Arrays.copyOf(new Object[]{120}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    ToastUtils.showMess(format);
                    C29850i4 c29850i43 = GroupPollVotingView.this.f73989j1;
                    if (c29850i43 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29850i43 = null;
                    }
                    String valueOf = String.valueOf(c29850i43.f138137t.getText());
                    C29850i4 c29850i44 = GroupPollVotingView.this.f73989j1;
                    if (c29850i44 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29850i44 = null;
                    }
                    CustomEditText customEditText = c29850i44.f138137t;
                    String substring = valueOf.substring(0, 120);
                    AbstractC19074t.m100207e(substring, "substring(...)");
                    customEditText.setText(substring);
                    C29850i4 c29850i45 = GroupPollVotingView.this.f73989j1;
                    if (c29850i45 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29850i42 = c29850i45;
                    }
                    c29850i42.f138137t.setSelection(120);
                    return;
                }
                C28652r.m143349v().m143361W(editable);
                if (GroupPollVotingView.this.m80416EN()) {
                    C29850i4 c29850i46 = GroupPollVotingView.this.f73989j1;
                    if (c29850i46 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29850i42 = c29850i46;
                    }
                    RobotoTextView robotoTextView = c29850i42.f138131A;
                    String m92652XI2 = GroupPollVotingView.this.m92652XI(AbstractC8020f0.str_add);
                    AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                    Locale locale = Locale.getDefault();
                    AbstractC19074t.m100207e(locale, "getDefault(...)");
                    String upperCase = m92652XI2.toUpperCase(locale);
                    AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
                    robotoTextView.setText(upperCase);
                    return;
                }
                C29850i4 c29850i47 = GroupPollVotingView.this.f73989j1;
                if (c29850i47 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29850i42 = c29850i47;
                }
                RobotoTextView robotoTextView2 = c29850i42.f138131A;
                String m92652XI3 = GroupPollVotingView.this.m92652XI(AbstractC8020f0.str_close);
                AbstractC19074t.m100207e(m92652XI3, "getString(...)");
                Locale locale2 = Locale.getDefault();
                AbstractC19074t.m100207e(locale2, "getDefault(...)");
                String upperCase2 = m92652XI3.toUpperCase(locale2);
                AbstractC19074t.m100207e(upperCase2, "toUpperCase(...)");
                robotoTextView2.setText(upperCase2);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$k */
    /* loaded from: classes6.dex */
    public static final class C14411k extends EditTextWithContextMenu.AbstractC13498a {
        C14411k() {
        }

        @Override // com.zing.zalo.p077ui.widget.EditTextWithContextMenu.AbstractC13498a
        /* renamed from: a */
        public void mo36093a() {
            String m127114D;
            String m127114D2;
            int i11;
            boolean z11;
            C29850i4 c29850i4 = GroupPollVotingView.this.f73989j1;
            C29850i4 c29850i42 = null;
            if (c29850i4 == null) {
                AbstractC19074t.m100223u("binding");
                c29850i4 = null;
            }
            m127114D = AbstractC24341v.m127114D(String.valueOf(c29850i4.f138137t.getText()), "\r\n", " ", false, 4, null);
            m127114D2 = AbstractC24341v.m127114D(m127114D, "\n", " ", false, 4, null);
            int length = m127114D2.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(m127114D2.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = m127114D2.subSequence(i12, length + 1).toString();
            C29850i4 c29850i43 = GroupPollVotingView.this.f73989j1;
            if (c29850i43 == null) {
                AbstractC19074t.m100223u("binding");
                c29850i43 = null;
            }
            c29850i43.f138137t.setText(obj);
            C29850i4 c29850i44 = GroupPollVotingView.this.f73989j1;
            if (c29850i44 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29850i42 = c29850i44;
            }
            c29850i42.f138137t.setSelection(obj.length());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$l */
    /* loaded from: classes6.dex */
    public static final class C14412l implements GroupPollOptionsDetailView.InterfaceC13714b {

        /* renamed from: b */
        final /* synthetic */ int f74017b;

        /* renamed from: c */
        final /* synthetic */ String f74018c;

        C14412l(int i11, String str) {
            this.f74017b = i11;
            this.f74018c = str;
        }

        @Override // com.zing.zalo.p077ui.widget.poll.GroupPollOptionsDetailView.InterfaceC13714b
        /* renamed from: a */
        public void mo76677a() {
            GroupPollOptionsDetailView m80426wN = GroupPollVotingView.this.m80426wN();
            if (m80426wN != null) {
                m80426wN.m76632q(this.f74017b, this.f74018c);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.poll.GroupPollOptionsDetailView.InterfaceC13714b
        /* renamed from: b */
        public void mo76678b() {
            try {
                GroupPollVotingView.this.m80422iO(false);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$m */
    /* loaded from: classes6.dex */
    public static final class C14413m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f74019q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14413m(ZaloView zaloView) {
            super(0);
            this.f74019q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f74019q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupPollVotingView$n */
    /* loaded from: classes6.dex */
    public static final class C14414n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f74020q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14414n(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f74020q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f74020q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    public GroupPollVotingView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C14403c());
        this.f73981D1 = m129210a;
        this.f73982E1 = new C14404d();
        this.f73983F1 = new C14408h();
        this.f73988K1 = new C14402b();
    }

    /* renamed from: AN */
    private final void m80350AN() {
        m80415zN().m103660r0();
    }

    /* renamed from: BN */
    private final int m80351BN() {
        if (m80415zN().m103654j0()) {
            return 0;
        }
        return 8;
    }

    /* renamed from: CN */
    private final void m80352CN() {
        m80415zN().m103639A0(this.f73993n1);
        m80415zN().m103642G0(this.f73980C1);
        m80415zN().m103657o0().m9219j(this, this.f74003x1);
        m80415zN().m103661t0().m9219j(this, this.f74001v1);
        m80415zN().m103659q0().m9219j(this, this.f74002w1);
        m80415zN().m103664w0().m9219j(this, this.f74004y1);
        m80415zN().m103658p0().m9219j(this, this.f74005z1);
        m80415zN().m103663v0().m9219j(this, this.f73978A1);
        m80415zN().m103665x0().m9219j(this, this.f73979B1);
        m80415zN().m103660r0();
    }

    /* renamed from: DN */
    private final boolean m80353DN(C7904b c7904b) {
        String str = this.f73994o1;
        if (str == null) {
            return false;
        }
        return C25994h.f124017a.m133919h("group_" + str).m133971x(c7904b);
    }

    /* renamed from: FN */
    private final void m80354FN() {
        String m127114D;
        String m127114D2;
        int i11;
        boolean z11;
        C29850i4 c29850i4 = this.f73989j1;
        C29850i4 c29850i42 = null;
        if (c29850i4 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i4 = null;
        }
        m127114D = AbstractC24341v.m127114D(String.valueOf(c29850i4.f138137t.getText()), "\r\n", " ", false, 4, null);
        m127114D2 = AbstractC24341v.m127114D(m127114D, "\n", " ", false, 4, null);
        int length = m127114D2.length() - 1;
        int i12 = 0;
        boolean z12 = false;
        while (i12 <= length) {
            if (!z12) {
                i11 = i12;
            } else {
                i11 = length;
            }
            if (AbstractC19074t.m100209g(m127114D2.charAt(i11), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z12) {
                if (!z11) {
                    z12 = true;
                } else {
                    i12++;
                }
            } else if (!z11) {
                break;
            } else {
                length--;
            }
        }
        if (m80415zN().m103650e0(m127114D2.subSequence(i12, length + 1).toString())) {
            C29850i4 c29850i43 = this.f73989j1;
            if (c29850i43 == null) {
                AbstractC19074t.m100223u("binding");
                c29850i43 = null;
            }
            c29850i43.f138137t.setText("");
            C29850i4 c29850i44 = this.f73989j1;
            if (c29850i44 == null) {
                AbstractC19074t.m100223u("binding");
                c29850i44 = null;
            }
            AbstractC2379w.m12430d(c29850i44.f138136s);
            C29850i4 c29850i45 = this.f73989j1;
            if (c29850i45 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29850i42 = c29850i45;
            }
            c29850i42.f138143z.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.lm
                @Override // java.lang.Runnable
                public final void run() {
                    GroupPollVotingView.m80355GN(GroupPollVotingView.this);
                }
            }, 200L);
            return;
        }
        ToastUtils.showMess(m92652XI(AbstractC8020f0.str_poll_option_existed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public static final void m80355GN(GroupPollVotingView groupPollVotingView) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        C29850i4 c29850i4 = groupPollVotingView.f73989j1;
        LinearLayoutManager linearLayoutManager = null;
        if (c29850i4 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i4 = null;
        }
        RecyclerView recyclerView = c29850i4.f138143z;
        LinearLayoutManager linearLayoutManager2 = groupPollVotingView.f73991l1;
        if (linearLayoutManager2 == null) {
            AbstractC19074t.m100223u("layoutManager");
        } else {
            linearLayoutManager = linearLayoutManager2;
        }
        recyclerView.m9837K1(linearLayoutManager.m10127i() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HN */
    public final boolean m80356HN() {
        C31961i8 c31961i8 = this.f73992m1;
        if (c31961i8 != null && !c31961i8.m153671i() && m80415zN().m103655l0()) {
            removeDialog(0);
            showDialog(0);
            return true;
        }
        mo50035CK(0, null);
        finish();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IN */
    public static final void m80357IN(GroupPollVotingView groupPollVotingView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC19074t.m100208f(interfaceC17463d, "dialog14");
        interfaceC17463d.dismiss();
        groupPollVotingView.f72421L0.mo50035CK(0, null);
        groupPollVotingView.f72421L0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JN */
    public static final void m80358JN(SimpleAdapter simpleAdapter, GroupPollVotingView groupPollVotingView, C31973j5 c31973j5, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(simpleAdapter, "$a");
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        Object item = simpleAdapter.getItem(i11);
        AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<*, *>");
        Object obj = ((HashMap) item).get("id");
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        if (intValue == AbstractC8020f0.str_pin_to_top_group_chat_v2) {
            AbstractC23647d.m123897g("1001665");
            C7904b m80413uN = groupPollVotingView.m80413uN();
            if (groupPollVotingView.m80353DN(m80413uN) || groupPollVotingView.m80410qN(m80413uN)) {
                groupPollVotingView.m80420XN();
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_unpin_from_top_of_group_chat_v2) {
            groupPollVotingView.showDialog(7);
            return;
        }
        if (intValue == AbstractC8020f0.str_poll_send_to_group_v2) {
            AbstractC23647d.m123897g("10010009");
            groupPollVotingView.m80418SN(groupPollVotingView.f73993n1);
            return;
        }
        if (intValue == AbstractC8020f0.str_group_board) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_group_id", groupPollVotingView.f73994o1);
            bundle.putBoolean("EXTRA_IS_COMMUNITY", c31973j5.m153747Y());
            bundle.putInt("SHOW_WITH_FLAGS", 50331648);
            C17487o0 m92662fJ = groupPollVotingView.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(GroupBoardView.class, bundle, 1, true);
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.str_menu_close_poll) {
            groupPollVotingView.f72421L0.showDialog(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KN */
    public static final void m80359KN(GroupPollVotingView groupPollVotingView, String str, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC19074t.m100208f(str, "$question");
        AbstractC19074t.m100208f(interfaceC17463d, "dialog12");
        interfaceC17463d.dismiss();
        C7904b c7904b = new C7904b(3);
        c7904b.f42715C = groupPollVotingView.f73993n1;
        c7904b.f42754z = str;
        c7904b.f42736h = str;
        if (groupPollVotingView.m80353DN(c7904b) || groupPollVotingView.m80410qN(c7904b)) {
            groupPollVotingView.m80420XN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LN */
    public static final void m80360LN(GroupPollVotingView groupPollVotingView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC19074t.m100208f(interfaceC17463d, "dialog1");
        interfaceC17463d.dismiss();
        groupPollVotingView.m80425tN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MN */
    public static final void m80361MN(GroupPollVotingView groupPollVotingView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC19074t.m100208f(interfaceC17463d, "dialog1");
        interfaceC17463d.dismiss();
        groupPollVotingView.m80367QN(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NN */
    public static final void m80362NN(GroupPollVotingView groupPollVotingView, C7904b c7904b, String str, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC19074t.m100208f(c7904b, "$topicInfo");
        AbstractC19074t.m100208f(str, "$conversationId");
        groupPollVotingView.m80415zN().m103648R0(c7904b, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ON */
    public final void m80364ON() {
        C7137m2 c7137m2 = this.f73990k1;
        C29850i4 c29850i4 = null;
        if (c7137m2 == null) {
            AbstractC19074t.m100223u("mGroupPollOptionsAdapter");
            c7137m2 = null;
        }
        if (c7137m2.mo10003k() < C28176r6.m141702d().m141704e()) {
            m80405mO(true);
            C29850i4 c29850i42 = this.f73989j1;
            if (c29850i42 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29850i4 = c29850i42;
            }
            AbstractC2379w.m12432f(c29850i4.f138137t);
            return;
        }
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m92652XI = m92652XI(AbstractC8020f0.str_poll_max_options_input);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        String format = String.format(m92652XI, Arrays.copyOf(new Object[]{Integer.valueOf(C28176r6.m141702d().m141704e())}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        ToastUtils.showMess(format);
    }

    /* renamed from: QN */
    private final void m80367QN(boolean z11) {
        m80415zN().m103645M0(z11, this.f73983F1);
    }

    /* renamed from: RN */
    static /* synthetic */ void m80369RN(GroupPollVotingView groupPollVotingView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        groupPollVotingView.m80367QN(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TN */
    public static final void m80372TN(GroupPollVotingView groupPollVotingView, View view) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC23647d.m123897g("10010019");
        groupPollVotingView.showDialog(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VN */
    public static final void m80375VN(GroupPollVotingView groupPollVotingView, C27473a c27473a, C31961i8.a aVar, AdapterView adapterView, View view, int i11, long j11) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC19074t.m100208f(c27473a, "$adapter");
        AbstractC19074t.m100208f(aVar, "$pollOption");
        try {
            C2864d1 c2864d1 = groupPollVotingView.f73987J1;
            if (c2864d1 != null) {
                c2864d1.dismiss();
            }
            int m140529a = c27473a.m140529a(i11);
            if (m140529a != -1 && m140529a == 1) {
                groupPollVotingView.m80415zN().m103643I0(aVar);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: WN */
    private final void m80377WN(C7904b c7904b) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", "group_" + this.f73994o1);
        bundle.putString("extra_group_topic_info_json", c7904b.m40780r().toString());
        m92693xK().m93069k2(UnpinTopicPinBoardView.class, bundle, 2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YN */
    public static final void m80380YN(GroupPollVotingView groupPollVotingView, C19908b c19908b) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC19074t.m100208f(c19908b, "state");
        if (c19908b.m103595b()) {
            groupPollVotingView.mo46829Y();
            return;
        }
        groupPollVotingView.f72421L0.mo49315c4();
        if (!TextUtils.isEmpty(c19908b.m103594a())) {
            ToastUtils.showMess(c19908b.m103594a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZN */
    public static final void m80382ZN(GroupPollVotingView groupPollVotingView, List list) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC19074t.m100208f(list, "items");
        groupPollVotingView.f73996q1.clear();
        groupPollVotingView.f73996q1.addAll(list);
        groupPollVotingView.m80407oN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aO */
    public static final void m80384aO(GroupPollVotingView groupPollVotingView, C19910d c19910d) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC19074t.m100208f(c19910d, "state");
        groupPollVotingView.m80397hO(c19910d.m103603b(), c19910d.m103602a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bO */
    public static final void m80386bO(GroupPollVotingView groupPollVotingView, C31961i8 c31961i8) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        groupPollVotingView.f73992m1 = c31961i8;
        groupPollVotingView.m80407oN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cO */
    public static final void m80388cO(GroupPollVotingView groupPollVotingView, C19918l c19918l) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC19074t.m100208f(c19918l, "state");
        if (!c19918l.m103692b() && !TextUtils.isEmpty(c19918l.m103691a())) {
            ToastUtils.showMess(c19918l.m103691a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dO */
    public static final void m80390dO(GroupPollVotingView groupPollVotingView, C19920n c19920n) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC19074t.m100208f(c19920n, "state");
        if (c19920n.m103694b()) {
            groupPollVotingView.mo46829Y();
            return;
        }
        groupPollVotingView.f72421L0.mo49315c4();
        if (!TextUtils.isEmpty(c19920n.m103693a())) {
            ToastUtils.showMess(c19920n.m103693a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eO */
    public static final void m80392eO(GroupPollVotingView groupPollVotingView, C19921o c19921o) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC19074t.m100208f(c19921o, "state");
        if (!c19921o.m103696b() && !TextUtils.isEmpty(c19921o.m103695a())) {
            ToastUtils.showMess(c19921o.m103695a());
        }
    }

    /* renamed from: fO */
    private final void m80394fO() {
        String str;
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            C31973j5 m4472f = C0943w.m4462l().m4472f(this.f73994o1);
            if (m4472f == null || (str = m4472f.m153793y()) == null) {
                str = "";
            }
            m87077NK.setMiddleSubtitle(str);
        }
    }

    /* renamed from: hO */
    private final void m80397hO(boolean z11, int i11) {
        int i12;
        MultiStateView.EnumC15915f enumC15915f;
        C29850i4 c29850i4 = null;
        try {
            if (z11) {
                if (this.f73992m1 == null) {
                    C29850i4 c29850i42 = this.f73989j1;
                    if (c29850i42 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29850i42 = null;
                    }
                    c29850i42.f138138u.setVisibility(0);
                    C29850i4 c29850i43 = this.f73989j1;
                    if (c29850i43 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29850i43 = null;
                    }
                    c29850i43.f138138u.setState(MultiStateView.EnumC15914e.LOADING);
                    C29850i4 c29850i44 = this.f73989j1;
                    if (c29850i44 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29850i4 = c29850i44;
                    }
                    c29850i4.f138135r.setVisibility(8);
                    return;
                }
                return;
            }
            if (i11 == 0) {
                C29850i4 c29850i45 = this.f73989j1;
                if (c29850i45 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29850i45 = null;
                }
                c29850i45.f138138u.setVisibility(8);
                C29850i4 c29850i46 = this.f73989j1;
                if (c29850i46 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29850i4 = c29850i46;
                }
                c29850i4.f138135r.setVisibility(0);
                return;
            }
            C29850i4 c29850i47 = this.f73989j1;
            if (c29850i47 == null) {
                AbstractC19074t.m100223u("binding");
                c29850i47 = null;
            }
            c29850i47.f138138u.setState(MultiStateView.EnumC15914e.ERROR);
            C29850i4 c29850i48 = this.f73989j1;
            if (c29850i48 == null) {
                AbstractC19074t.m100223u("binding");
                c29850i48 = null;
            }
            MultiStateView multiStateView = c29850i48.f138138u;
            if (i11 == 50001) {
                i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
            } else {
                i12 = AbstractC8020f0.str_poll_error_loading_poll_info;
            }
            multiStateView.setErrorTitleString(m92652XI(i12));
            C29850i4 c29850i49 = this.f73989j1;
            if (c29850i49 == null) {
                AbstractC19074t.m100223u("binding");
                c29850i49 = null;
            }
            MultiStateView multiStateView2 = c29850i49.f138138u;
            if (i11 == 50001) {
                enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
            } else {
                enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
            }
            multiStateView2.setErrorType(enumC15915f);
            C29850i4 c29850i410 = this.f73989j1;
            if (c29850i410 == null) {
                AbstractC19074t.m100223u("binding");
                c29850i410 = null;
            }
            c29850i410.f138138u.setVisibility(0);
            C29850i4 c29850i411 = this.f73989j1;
            if (c29850i411 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29850i4 = c29850i411;
            }
            c29850i4.f138135r.setVisibility(8);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kO */
    public static final void m80401kO(GroupPollVotingView groupPollVotingView) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        groupPollVotingView.m80350AN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lO */
    public static final boolean m80403lO(GroupPollVotingView groupPollVotingView, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        if (i11 == 6) {
            C29850i4 c29850i4 = groupPollVotingView.f73989j1;
            if (c29850i4 == null) {
                AbstractC19074t.m100223u("binding");
                c29850i4 = null;
            }
            RobotoTextView robotoTextView = c29850i4.f138131A;
            AbstractC19074t.m100207e(robotoTextView, "tvOptionAction");
            groupPollVotingView.onClick(robotoTextView);
            return true;
        }
        return false;
    }

    /* renamed from: mO */
    private final void m80405mO(boolean z11) {
        if (!m80415zN().m103654j0()) {
            m80408oO();
        } else {
            C29850i4 c29850i4 = null;
            if (z11) {
                C29850i4 c29850i42 = this.f73989j1;
                if (c29850i42 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29850i42 = null;
                }
                c29850i42.f138142y.setVisibility(8);
                C29850i4 c29850i43 = this.f73989j1;
                if (c29850i43 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29850i4 = c29850i43;
                }
                c29850i4.f138139v.setVisibility(0);
            } else {
                C29850i4 c29850i44 = this.f73989j1;
                if (c29850i44 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29850i44 = null;
                }
                c29850i44.f138142y.setVisibility(m80351BN());
                C29850i4 c29850i45 = this.f73989j1;
                if (c29850i45 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29850i4 = c29850i45;
                }
                c29850i4.f138139v.setVisibility(8);
            }
        }
        m80409pN();
    }

    /* renamed from: oN */
    private final void m80407oN() {
        try {
            C7137m2 c7137m2 = this.f73990k1;
            if (c7137m2 == null) {
                AbstractC19074t.m100223u("mGroupPollOptionsAdapter");
                c7137m2 = null;
            }
            c7137m2.m36310N(this.f73996q1);
            m80409pN();
            m80414vN();
            if (this.f73997r1) {
                this.f73997r1 = false;
                m80424nO(0, "");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: oO */
    private final void m80408oO() {
        C29850i4 c29850i4 = this.f73989j1;
        C29850i4 c29850i42 = null;
        if (c29850i4 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i4 = null;
        }
        c29850i4.f138142y.setVisibility(8);
        C29850i4 c29850i43 = this.f73989j1;
        if (c29850i43 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i43 = null;
        }
        c29850i43.f138139v.setVisibility(8);
        C29850i4 c29850i44 = this.f73989j1;
        if (c29850i44 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i44 = null;
        }
        c29850i44.f138141x.setVisibility(0);
        C31961i8 c31961i8 = this.f73992m1;
        if (c31961i8 != null && c31961i8.m153671i()) {
            C29850i4 c29850i45 = this.f73989j1;
            if (c29850i45 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29850i42 = c29850i45;
            }
            c29850i42.f138140w.setText(AbstractC8020f0.str_msg_poll_closed);
            return;
        }
        C29850i4 c29850i46 = this.f73989j1;
        if (c29850i46 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29850i42 = c29850i46;
        }
        c29850i42.f138140w.setText(AbstractC8020f0.str_msg_poll_lock_change_vote);
    }

    /* renamed from: pN */
    private final void m80409pN() {
        if (!m80415zN().m103654j0()) {
            m80408oO();
            return;
        }
        C29850i4 c29850i4 = this.f73989j1;
        C29850i4 c29850i42 = null;
        if (c29850i4 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i4 = null;
        }
        c29850i4.f138141x.setVisibility(8);
        if (m80415zN().m103662u0() >= C28176r6.m141702d().m141704e()) {
            C29850i4 c29850i43 = this.f73989j1;
            if (c29850i43 == null) {
                AbstractC19074t.m100223u("binding");
                c29850i43 = null;
            }
            c29850i43.f138142y.setVisibility(m80351BN());
            C29850i4 c29850i44 = this.f73989j1;
            if (c29850i44 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29850i42 = c29850i44;
            }
            c29850i42.f138139v.setVisibility(8);
        }
    }

    /* renamed from: qN */
    private final boolean m80410qN(final C7904b c7904b) {
        String str = this.f73994o1;
        if (str == null) {
            return false;
        }
        if (C25994h.f124017a.m133919h("group_" + str).m133973z()) {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.mm
                @Override // java.lang.Runnable
                public final void run() {
                    GroupPollVotingView.m80411rN(GroupPollVotingView.this, c7904b);
                }
            });
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rN */
    public static final void m80411rN(GroupPollVotingView groupPollVotingView, C7904b c7904b) {
        AbstractC19074t.m100208f(groupPollVotingView, "this$0");
        AbstractC19074t.m100208f(c7904b, "$pendingPinTopic");
        groupPollVotingView.m80377WN(c7904b);
    }

    /* renamed from: sN */
    private final void m80412sN() {
        m80415zN().m103649S0(this.f73980C1);
        m80415zN().m103657o0().mo9222o(this.f74003x1);
        m80415zN().m103661t0().mo9222o(this.f74001v1);
        m80415zN().m103659q0().mo9222o(this.f74002w1);
        m80415zN().m103664w0().mo9222o(this.f74004y1);
        m80415zN().m103658p0().mo9222o(this.f74005z1);
        m80415zN().m103663v0().mo9222o(this.f73978A1);
        m80415zN().m103665x0().mo9222o(this.f73979B1);
    }

    /* renamed from: uN */
    private final C7904b m80413uN() {
        C7904b c7904b = new C7904b(3);
        C31961i8 c31961i8 = this.f73992m1;
        if (c31961i8 != null) {
            c7904b.f42715C = c31961i8.f146880a;
            String str = c31961i8.f146881b;
            c7904b.f42754z = str;
            c7904b.f42736h = str;
        }
        return c7904b;
    }

    /* renamed from: vN */
    private final void m80414vN() {
        try {
            C29850i4 c29850i4 = null;
            if (this.f73992m1 == null) {
                C29850i4 c29850i42 = this.f73989j1;
                if (c29850i42 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29850i4 = c29850i42;
                }
                c29850i4.f138134q.setEnabled(false);
                return;
            }
            C29850i4 c29850i43 = this.f73989j1;
            if (c29850i43 == null) {
                AbstractC19074t.m100223u("binding");
                c29850i43 = null;
            }
            c29850i43.f138134q.setEnabled(m80415zN().m103655l0());
            C29850i4 c29850i44 = this.f73989j1;
            if (c29850i44 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29850i4 = c29850i44;
            }
            c29850i4.f138142y.setVisibility(m80351BN());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public final C19914h m80415zN() {
        return (C19914h) this.f74000u1.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x016b, code lost:            if (fn0.AbstractC19074t.m100204b(r2, r5) != false) goto L62;     */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        final String str;
        String str2;
        int i12;
        int i13;
        C31961i8 c31961i8 = this.f73992m1;
        if (c31961i8 != null) {
            str = c31961i8.f146881b;
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        if (i11 != 0) {
            if (i11 != 3) {
                boolean z11 = true;
                if (i11 != 4) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            if (i11 != 7) {
                                return null;
                            }
                            final C7904b m80413uN = m80413uN();
                            final String str3 = "group_" + this.f73994o1;
                            return AbstractC23089h6.m118433a(m80413uN, str3, getContext(), new InterfaceC17463d.b(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.im
                                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                /* renamed from: K8 */
                                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                                    GroupPollVotingView.m80362NN(GroupPollVotingView.this, m80413uN, str3, interfaceC17463d, i14);
                                }
                            });
                        }
                        C8009j.a aVar = new C8009j.a(getContext());
                        aVar.m43159h(4).m43162k(m92652XI(AbstractC8020f0.str_poll_confirm_cannot_change_votes)).m43165n(m92652XI(AbstractC8020f0.str_poll_confirm_cannot_change_votes_btn_cancel), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.str_poll_confirm_cannot_change_votes_btn_accept), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.hm
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                                GroupPollVotingView.m80361MN(GroupPollVotingView.this, interfaceC17463d, i14);
                            }
                        });
                        return aVar.m43152a();
                    }
                    C8009j.a aVar2 = new C8009j.a(getContext());
                    C31973j5 m4472f = C0943w.f3447a.m4472f(this.f73994o1);
                    if (m4472f == null || !m4472f.m153747Y()) {
                        z11 = false;
                    }
                    C8009j.a m43171t = aVar2.m43159h(7).m43171t(AbstractC8020f0.str_close_poll_dialog_title);
                    if (z11) {
                        i13 = AbstractC8020f0.str_community_close_poll_dialog_msg;
                    } else {
                        i13 = AbstractC8020f0.str_close_poll_dialog_msg;
                    }
                    m43171t.m43161j(i13).m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.str_btn_close_poll, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.gm
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                            GroupPollVotingView.m80360LN(GroupPollVotingView.this, interfaceC17463d, i14);
                        }
                    });
                    return aVar2.m43152a();
                }
                final C31973j5 m4472f2 = C0943w.f3447a.m4472f(this.f73994o1);
                if (m4472f2 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                if (!m4472f2.m153763h0() || m4472f2.m153742T()) {
                    if (m80353DN(m80413uN())) {
                        HashMap m119451i = AbstractC23184q2.m119451i(m92652XI(AbstractC8020f0.str_unpin_from_top_of_group_chat_v2), AbstractC8020f0.str_unpin_from_top_of_group_chat_v2);
                        AbstractC19074t.m100207e(m119451i, "getNewEntry(...)");
                        arrayList.add(m119451i);
                    } else {
                        HashMap m119451i2 = AbstractC23184q2.m119451i(m92652XI(AbstractC8020f0.str_pin_to_top_group_chat_v2), AbstractC8020f0.str_pin_to_top_group_chat_v2);
                        AbstractC19074t.m100207e(m119451i2, "getNewEntry(...)");
                        arrayList.add(m119451i2);
                    }
                }
                HashMap m119451i3 = AbstractC23184q2.m119451i(m92652XI(AbstractC8020f0.str_poll_send_to_group_v2), AbstractC8020f0.str_poll_send_to_group_v2);
                AbstractC19074t.m100207e(m119451i3, "getNewEntry(...)");
                arrayList.add(m119451i3);
                if (this.f73999t1) {
                    if (m4472f2.m153747Y()) {
                        i12 = AbstractC8020f0.str_community_board;
                    } else {
                        i12 = AbstractC8020f0.str_group_board;
                    }
                    HashMap m119451i4 = AbstractC23184q2.m119451i(m92652XI(i12), AbstractC8020f0.str_group_board);
                    AbstractC19074t.m100207e(m119451i4, "getNewEntry(...)");
                    arrayList.add(m119451i4);
                }
                C31961i8 c31961i82 = this.f73992m1;
                if (c31961i82 != null && !c31961i82.m153671i()) {
                    if (!m4472f2.m153742T()) {
                        String str4 = CoreUtility.f89233i;
                        C31961i8 c31961i83 = this.f73992m1;
                        if (c31961i83 != null) {
                            str2 = c31961i83.f146884e;
                        } else {
                            str2 = null;
                        }
                    }
                    HashMap m119451i5 = AbstractC23184q2.m119451i(m92652XI(AbstractC8020f0.str_menu_close_poll), AbstractC8020f0.str_menu_close_poll);
                    AbstractC19074t.m100207e(m119451i5, "getNewEntry(...)");
                    arrayList.add(m119451i5);
                }
                if (!(!arrayList.isEmpty())) {
                    return null;
                }
                final SimpleAdapter simpleAdapter = new SimpleAdapter(getContext(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                C8009j.a aVar3 = new C8009j.a(getContext());
                aVar3.m43172u(str);
                aVar3.m43173v(1);
                aVar3.m43155d(true);
                aVar3.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.wm
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                        GroupPollVotingView.m80358JN(simpleAdapter, this, m4472f2, interfaceC17463d, i14);
                    }
                });
                return aVar3.m43152a();
            }
            C8009j.a aVar4 = new C8009j.a(getContext());
            aVar4.m43159h(4).m43162k(m92652XI(AbstractC8020f0.str_dialog_msg_replace_pin_new_poll)).m43165n(m92652XI(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.str_pin_this_poll), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.fm
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                    GroupPollVotingView.m80359KN(GroupPollVotingView.this, str, interfaceC17463d, i14);
                }
            });
            return aVar4.m43152a();
        }
        C8009j.a aVar5 = new C8009j.a(getContext());
        aVar5.m43172u(m92652XI(AbstractC8020f0.confirm)).m43159h(4).m43162k(m92652XI(AbstractC8020f0.str_poll_ask_to_cancel_voting)).m43165n(m92652XI(AbstractC8020f0.str_btn_dont_exit), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.str_exit), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.vm
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                GroupPollVotingView.m80357IN(GroupPollVotingView.this, interfaceC17463d, i14);
            }
        });
        return aVar5.m43152a();
    }

    /* renamed from: EN */
    public final boolean m80416EN() {
        int i11;
        boolean z11;
        C29850i4 c29850i4 = this.f73989j1;
        if (c29850i4 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i4 = null;
        }
        String valueOf = String.valueOf(c29850i4.f138137t.getText());
        int length = valueOf.length() - 1;
        int i12 = 0;
        boolean z12 = false;
        while (i12 <= length) {
            if (!z12) {
                i11 = i12;
            } else {
                i11 = length;
            }
            if (AbstractC19074t.m100209g(valueOf.charAt(i11), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z12) {
                if (!z11) {
                    z12 = true;
                } else {
                    i12++;
                }
            } else {
                if (!z11) {
                    break;
                }
                length--;
            }
        }
        return !TextUtils.isEmpty(valueOf.subSequence(i12, length + 1).toString());
    }

    @Override // com.zing.zalo.p077ui.zviews.RemoveGroupMemberBaseView
    /* renamed from: FM */
    public void mo78395FM() {
        GroupPollOptionsDetailView groupPollOptionsDetailView = this.f73986I1;
        if (groupPollOptionsDetailView != null) {
            groupPollOptionsDetailView.m76630j();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29850i4 m148066c = C29850i4.m148066c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148066c, "inflate(...)");
        this.f73989j1 = m148066c;
        this.f73998s1 = new C23528a(getContext());
        m80423jO();
        C29850i4 c29850i4 = this.f73989j1;
        if (c29850i4 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i4 = null;
        }
        KeyboardFrameLayout root = c29850i4.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.RemoveGroupMemberBaseView
    /* renamed from: HM */
    public void mo78398HM() {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        m80412sN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setLeadingFunctionCallback(new C14405e());
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.em
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupPollVotingView.m80372TN(GroupPollVotingView.this, view);
                }
            });
        }
        m80394fO();
        m80414vN();
    }

    /* renamed from: PN */
    public final void m80417PN(C31862c c31862c, String str, String str2) {
        boolean z11;
        AbstractC19074t.m100208f(str, "actionType");
        if (c31862c != null && c31862c.m153153e()) {
            m80415zN().m103644J0(c31862c);
            z11 = true;
        } else {
            z11 = false;
        }
        if (!TextUtils.isEmpty(str)) {
            if (AbstractC19074t.m100204b(str, "action.window.close")) {
                if (!z11) {
                    m80415zN().m103644J0(c31862c);
                    return;
                }
                return;
            }
            AbstractC28207v1.m141994i3(str, 4, this.f72421L0.m92676n2(), this, str2, null);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m80415zN().m103647P0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: SL */
    public void mo68807SL() {
        this.f73984G1 = false;
        super.mo68807SL();
    }

    /* renamed from: SN */
    public final void m80418SN(String str) {
        String str2 = this.f73994o1;
        if (str2 != null && str != null) {
            m80415zN().m103646O0(str, str2);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: TL */
    protected List mo78192TL() {
        List m131506n;
        m131506n = AbstractC25368s.m131506n(52, 27, 6020);
        return m131506n;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C23744a.Companion.m124119a().m124115b(this, 3100);
        if (this.f73992m1 != null) {
            m80415zN();
            m80415zN().m103660r0();
        }
        m80428yN().m74697c(this.f73982E1);
    }

    /* renamed from: UN */
    public final void m80419UN(final C31961i8.a aVar) {
        C2864d1 c2864d1;
        AbstractC19074t.m100208f(aVar, "pollOption");
        C27473a.a aVar2 = new C27473a.a(1, m92652XI(AbstractC8020f0.str_poll_delete_option));
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar2);
        C2864d1 c2864d12 = this.f73987J1;
        if (c2864d12 != null && c2864d12.m92868m() && (c2864d1 = this.f73987J1) != null) {
            c2864d1.dismiss();
        }
        C2864d1.a aVar3 = new C2864d1.a(getContext());
        final C27473a c27473a = new C27473a(getContext());
        c27473a.m140530b(arrayList);
        aVar3.m13795d(c27473a);
        aVar3.m13797f(AbstractC8915g0.TimelineMenuTheme);
        this.f73987J1 = aVar3.m13794b();
        aVar3.m13796e(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.nm
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                GroupPollVotingView.m80375VN(GroupPollVotingView.this, c27473a, aVar, adapterView, view, i11, j11);
            }
        });
        C2864d1 c2864d13 = this.f73987J1;
        if (c2864d13 != null) {
            c2864d13.m92874z(true);
        }
        C2864d1 c2864d14 = this.f73987J1;
        if (c2864d14 != null) {
            c2864d14.mo13822K();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C23744a.Companion.m124119a().m124117e(this, 3100);
        m80428yN().m74701i();
    }

    /* renamed from: XN */
    public final void m80420XN() {
        String str = this.f73994o1;
        if (str != null) {
            m80415zN().m103641F0(str);
        }
    }

    /* renamed from: gO */
    public final void m80421gO(boolean z11) {
        this.f73984G1 = z11;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupPollVotingView";
    }

    /* renamed from: iO */
    public final void m80422iO(boolean z11) {
        this.f73985H1 = z11;
    }

    /* renamed from: jO */
    public final void m80423jO() {
        InterfaceC27218a m92676n2;
        if ((m92676n2() instanceof Activity) && (m92676n2 = m92676n2()) != null) {
            m92676n2.mo35554O(AbstractC2379w.m12428b());
        }
        C29850i4 c29850i4 = this.f73989j1;
        C29850i4 c29850i42 = null;
        if (c29850i4 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i4 = null;
        }
        c29850i4.f138138u.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.jm
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                GroupPollVotingView.m80401kO(GroupPollVotingView.this);
            }
        });
        C7137m2 c7137m2 = new C7137m2(getContext(), new C14409i());
        this.f73990k1 = c7137m2;
        c7137m2.m9999J(true);
        this.f73991l1 = new LinearLayoutManager(getContext(), 1, false);
        C29850i4 c29850i43 = this.f73989j1;
        if (c29850i43 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i43 = null;
        }
        RecyclerView recyclerView = c29850i43.f138143z;
        LinearLayoutManager linearLayoutManager = this.f73991l1;
        if (linearLayoutManager == null) {
            AbstractC19074t.m100223u("layoutManager");
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        C29850i4 c29850i44 = this.f73989j1;
        if (c29850i44 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i44 = null;
        }
        RecyclerView recyclerView2 = c29850i44.f138143z;
        C7137m2 c7137m22 = this.f73990k1;
        if (c7137m22 == null) {
            AbstractC19074t.m100223u("mGroupPollOptionsAdapter");
            c7137m22 = null;
        }
        recyclerView2.setAdapter(c7137m22);
        C29850i4 c29850i45 = this.f73989j1;
        if (c29850i45 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i45 = null;
        }
        c29850i45.f138143z.setItemAnimator(new C1914g());
        C29850i4 c29850i46 = this.f73989j1;
        if (c29850i46 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i46 = null;
        }
        c29850i46.f138134q.setOnClickListener(this);
        C29850i4 c29850i47 = this.f73989j1;
        if (c29850i47 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i47 = null;
        }
        c29850i47.f138131A.setOnClickListener(this);
        C29850i4 c29850i48 = this.f73989j1;
        if (c29850i48 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i48 = null;
        }
        c29850i48.f138137t.addTextChangedListener(new C14410j());
        C29850i4 c29850i49 = this.f73989j1;
        if (c29850i49 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i49 = null;
        }
        c29850i49.f138137t.setTextContextChangeListener(new C14411k());
        C29850i4 c29850i410 = this.f73989j1;
        if (c29850i410 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i410 = null;
        }
        c29850i410.f138137t.setImeOptions(6);
        C29850i4 c29850i411 = this.f73989j1;
        if (c29850i411 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i411 = null;
        }
        c29850i411.f138137t.setRawInputType(16384);
        C29850i4 c29850i412 = this.f73989j1;
        if (c29850i412 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i412 = null;
        }
        c29850i412.f138137t.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.km
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m80403lO;
                m80403lO = GroupPollVotingView.m80403lO(GroupPollVotingView.this, textView, i11, keyEvent);
                return m80403lO;
            }
        });
        C29850i4 c29850i413 = this.f73989j1;
        if (c29850i413 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i413 = null;
        }
        c29850i413.f138141x.setVisibility(8);
        try {
            C29850i4 c29850i414 = this.f73989j1;
            if (c29850i414 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29850i42 = c29850i414;
            }
            KeyboardFrameLayout root = c29850i42.getRoot();
            if (root != null) {
                root.setOnKeyboardListener(this);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        m80405mO(false);
    }

    /* renamed from: nO */
    public final void m80424nO(int i11, String str) {
        C31961i8 c31961i8;
        String str2;
        try {
            C29850i4 c29850i4 = this.f73989j1;
            C29850i4 c29850i42 = null;
            if (c29850i4 == null) {
                AbstractC19074t.m100223u("binding");
                c29850i4 = null;
            }
            AbstractC2379w.m12430d(c29850i4.getRoot());
            GroupPollOptionsDetailView groupPollOptionsDetailView = this.f73986I1;
            if (groupPollOptionsDetailView == null) {
                String str3 = this.f73993n1;
                if (str3 == null || (c31961i8 = this.f73992m1) == null || (str2 = this.f73994o1) == null) {
                    return;
                }
                Context m92689tK = m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                String str4 = c31961i8.f146881b;
                AbstractC19074t.m100207e(str4, "question");
                String str5 = c31961i8.f146884e;
                AbstractC19074t.m100207e(str5, "creatorId");
                GroupPollOptionsDetailView groupPollOptionsDetailView2 = new GroupPollOptionsDetailView(m92689tK, this, str3, str4, str2, str5, this.f73988K1, new C14412l(i11, str));
                this.f73986I1 = groupPollOptionsDetailView2;
                if (groupPollOptionsDetailView2.getParent() == null) {
                    groupPollOptionsDetailView2.setVisibility(4);
                    C29850i4 c29850i43 = this.f73989j1;
                    if (c29850i43 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29850i42 = c29850i43;
                    }
                    KeyboardFrameLayout root = c29850i42.getRoot();
                    if (root != null) {
                        root.addView(this.f73986I1, new RelativeLayout.LayoutParams(-1, -1));
                        return;
                    }
                    return;
                }
                return;
            }
            if (groupPollOptionsDetailView != null) {
                groupPollOptionsDetailView.m76632q(i11, str);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        C29850i4 c29850i4 = null;
        if (id2 == AbstractC6918a0.btn_send_poll) {
            AbstractC23647d.m123897g("10010014");
            m80369RN(this, false, 1, null);
        } else if (id2 == AbstractC6918a0.tv_option_action) {
            if (m80416EN()) {
                m80354FN();
                return;
            }
            C29850i4 c29850i42 = this.f73989j1;
            if (c29850i42 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29850i4 = c29850i42;
            }
            AbstractC2379w.m12430d(c29850i4.f138136s);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4) {
            GroupPollOptionsDetailView groupPollOptionsDetailView = this.f73986I1;
            if (groupPollOptionsDetailView != null && groupPollOptionsDetailView.getVisibility() == 0) {
                if (!this.f73985H1) {
                    this.f73985H1 = true;
                    groupPollOptionsDetailView.m76628f();
                }
                return true;
            }
            m80356HN();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.RemoveGroupMemberBaseView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C29850i4 c29850i4 = this.f73989j1;
        C7137m2 c7137m2 = null;
        if (c29850i4 == null) {
            AbstractC19074t.m100223u("binding");
            c29850i4 = null;
        }
        c29850i4.getRoot().requestLayout();
        C7137m2 c7137m22 = this.f73990k1;
        if (c7137m22 == null) {
            AbstractC19074t.m100223u("mGroupPollOptionsAdapter");
        } else {
            c7137m2 = c7137m22;
        }
        c7137m2.m10008p();
        m80415zN().m103651g0();
        m80428yN().m74710v();
        m80428yN().m74699e("tip.entry.point.new.group.from.poll");
    }

    /* renamed from: tN */
    public final void m80425tN() {
        m80415zN().m103656m0();
    }

    /* renamed from: wN */
    public final GroupPollOptionsDetailView m80426wN() {
        return this.f73986I1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        List m131505m;
        boolean z11;
        boolean z12;
        AbstractC19074t.m100208f(objArr, "args");
        if (AbstractC23184q2.m119459q(this.f73994o1, i11, Arrays.copyOf(objArr, objArr.length))) {
            finish();
        }
        try {
            if (i11 != 27) {
                if (i11 != 3100) {
                    if (i11 == 6020) {
                        if (objArr.length == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            Object obj = objArr[0];
                            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
                            m80415zN().m103653i0(((Integer) obj).intValue());
                        }
                    }
                } else {
                    if (objArr.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        Object obj2 = objArr[0];
                        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type com.zing.zalo.control.PollInfo");
                        C31961i8 c31961i8 = (C31961i8) obj2;
                        if (AbstractC19074t.m100204b(c31961i8.f146880a, this.f73993n1)) {
                            m80415zN().m103652h0(c31961i8);
                        }
                    }
                }
            } else if (objArr.length >= 3) {
                Object obj3 = objArr[0];
                AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.String");
                Object obj4 = objArr[1];
                AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj4).intValue();
                Object obj5 = objArr[2];
                AbstractC19074t.m100206d(obj5, "null cannot be cast to non-null type kotlin.String");
                String[] split = TextUtils.split((String) obj5, ";");
                AbstractC19074t.m100207e(split, "split(...)");
                m131505m = AbstractC25368s.m131505m(Arrays.copyOf(split, split.length));
                boolean contains = new ArrayList(m131505m).contains(CoreUtility.f89233i);
                if (AbstractC19074t.m100204b(this.f73994o1, (String) obj3) && (!r0.isEmpty()) && intValue == 4 && contains) {
                    finish();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        try {
            super.mo37135xJ(bundle);
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                C0815e1.m2075D().m2100V(new C23648e(6, m92642L3.getString("STR_SOURCE_START_VIEW", ""), 1, "gr_poll_detail", "2"), false);
                String string = m92642L3.getString("extra_group_id");
                this.f73994o1 = string;
                if (!TextUtils.isEmpty(string)) {
                    this.f73995p1 = C0943w.m4462l().m4472f(this.f73994o1);
                }
                this.f73993n1 = m92642L3.getString("extra_poll_id");
                this.f73997r1 = m92642L3.getBoolean("extra_show_vote_detail", false);
                this.f73999t1 = m92642L3.getBoolean("extra_shortcut_groupboard", false);
                C13306b m80428yN = m80428yN();
                View m92656bJ = this.f72421L0.m92656bJ();
                AbstractC19074t.m100206d(m92656bJ, "null cannot be cast to non-null type android.view.ViewGroup");
                m80428yN.m74687C((ViewGroup) m92656bJ);
                m80352CN();
                m80394fO();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            finish();
        }
    }

    /* renamed from: xN */
    public final boolean m80427xN() {
        return this.f73984G1;
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: y1 */
    public void mo37136y1(int i11) {
        m80405mO(false);
    }

    /* renamed from: yN */
    public final C13306b m80428yN() {
        return (C13306b) this.f73981D1.getValue();
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: z3 */
    public void mo37138z3(int i11) {
        m80405mO(true);
    }
}
