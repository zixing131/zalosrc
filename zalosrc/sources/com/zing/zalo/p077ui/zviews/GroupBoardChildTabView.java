package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import am.C0943w;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import com.adtima.Adtima;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.GroupBoardAdapter;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.GroupBoardChildTabView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import dj.C18005u0;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p459qs.C25490c;
import p461qu.AbstractC25495a;
import p495rx.AbstractC25989c;
import p495rx.C25994h;
import p495rx.C26000n;
import p716zh.C31961i8;
import p716zh.C31973j5;
import p716zh.C31988k5;
import p716zh.C32002l4;
import p716zh.C32003l5;
import vg.C28176r6;

/* loaded from: classes6.dex */
public class GroupBoardChildTabView extends BaseZaloView implements C23744a.c, InterfaceC0733x {

    /* renamed from: M0 */
    View f73567M0;

    /* renamed from: N0 */
    RecyclerView f73568N0;

    /* renamed from: O0 */
    LinearLayoutManager f73569O0;

    /* renamed from: P0 */
    MultiStateView f73570P0;

    /* renamed from: Q0 */
    View f73571Q0;

    /* renamed from: S0 */
    String f73573S0;

    /* renamed from: W0 */
    GroupBoardAdapter f73577W0;

    /* renamed from: Z0 */
    C31988k5 f73580Z0;

    /* renamed from: a1 */
    SwipeRefreshLayout f73581a1;

    /* renamed from: R0 */
    public int f73572R0 = 0;

    /* renamed from: T0 */
    boolean f73574T0 = false;

    /* renamed from: U0 */
    int f73575U0 = 1;

    /* renamed from: V0 */
    boolean f73576V0 = true;

    /* renamed from: X0 */
    final ArrayList f73578X0 = new ArrayList();

    /* renamed from: Y0 */
    ArrayList f73579Y0 = new ArrayList();

    /* renamed from: b1 */
    boolean f73582b1 = false;

    /* renamed from: c1 */
    boolean f73583c1 = false;

    /* renamed from: d1 */
    boolean f73584d1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupBoardChildTabView$a */
    /* loaded from: classes6.dex */
    public class C14318a implements GroupBoardAdapter.InterfaceC6930c {
        C14318a() {
        }

        @Override // com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6930c
        /* renamed from: i3 */
        public void mo35614i3() {
            GroupBoardChildTabView.this.m79975sM(false);
        }

        @Override // com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6930c
        /* renamed from: j3 */
        public void mo35615j3(int i11) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4 && i11 != 5) {
                            return;
                        }
                    } else {
                        ZaloView m92650VI = GroupBoardChildTabView.this.f72421L0.m92650VI();
                        if (m92650VI instanceof GroupBoardView) {
                            ((GroupBoardView) m92650VI).m79988mM(false, true);
                            return;
                        }
                        return;
                    }
                } else {
                    ZaloView m92650VI2 = GroupBoardChildTabView.this.f72421L0.m92650VI();
                    if (m92650VI2 instanceof GroupBoardView) {
                        ((GroupBoardView) m92650VI2).m79987lM(3);
                        return;
                    }
                    return;
                }
            }
            ZaloView m92650VI3 = GroupBoardChildTabView.this.f72421L0.m92650VI();
            if (m92650VI3 instanceof GroupBoardView) {
                ((GroupBoardView) m92650VI3).m79988mM(false, false);
            }
        }

        @Override // com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6930c
        /* renamed from: k3 */
        public void mo35616k3(String str) {
            AbstractC23184q2.m119465w(str, GroupBoardChildTabView.this.f72421L0.getContext(), GroupBoardChildTabView.this.f72421L0.m92676n2());
        }

        @Override // com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6930c
        /* renamed from: l3 */
        public void mo35617l3(C31988k5 c31988k5) {
            if (c31988k5 == null) {
                return;
            }
            int i11 = c31988k5.f147200a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        return;
                    }
                } else {
                    if (c31988k5.f147201b != null) {
                        AbstractC23647d.m123897g("1001660");
                        GroupBoardChildTabView.this.m79977vM(c31988k5.f147201b);
                        return;
                    }
                    return;
                }
            }
            if (c31988k5.f147201b != null) {
                AbstractC23647d.m123897g("1001659");
                GroupBoardChildTabView.this.m79967IM(c31988k5);
            }
        }

        @Override // com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6930c
        /* renamed from: m3 */
        public void mo35618m3() {
            GroupBoardChildTabView.this.f72421L0.showDialog(2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:            if (r0 != 4) goto L16;     */
        @Override // com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6930c
        /* renamed from: n3 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo35619n3(C31988k5 c31988k5) {
            if (c31988k5 == null) {
                return;
            }
            int i11 = c31988k5.f147200a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        AbstractC23647d.m123897g("10010008");
                    }
                } else {
                    AbstractC23647d.m123897g("1001662");
                }
                GroupBoardChildTabView groupBoardChildTabView = GroupBoardChildTabView.this;
                groupBoardChildTabView.f73580Z0 = c31988k5;
                groupBoardChildTabView.f72421L0.showDialog(1);
            }
            AbstractC23647d.m123897g("1001661");
            GroupBoardChildTabView groupBoardChildTabView2 = GroupBoardChildTabView.this;
            groupBoardChildTabView2.f73580Z0 = c31988k5;
            groupBoardChildTabView2.f72421L0.showDialog(1);
        }

        @Override // com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6930c
        /* renamed from: o3 */
        public void mo35620o3(String str) {
            AbstractC23184q2.m119465w(str, GroupBoardChildTabView.this.f72421L0.getContext(), GroupBoardChildTabView.this.f72421L0.m92676n2());
        }

        @Override // com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6930c
        /* renamed from: p3 */
        public void mo35621p3(String str, boolean z11) {
            if (z11) {
                AbstractC23647d.m123897g("10010018");
            } else {
                AbstractC23647d.m123897g("10010007");
            }
            GroupBoardChildTabView groupBoardChildTabView = GroupBoardChildTabView.this;
            AbstractC23211s7.m119592y(str, groupBoardChildTabView.f73573S0, groupBoardChildTabView.f72421L0.m92676n2(), false, z11);
        }

        @Override // com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6930c
        /* renamed from: v1 */
        public void mo35622v1(String str) {
            AbstractC23211s7.m119562B(str, GroupBoardChildTabView.this.f72421L0.m92676n2().mo35579p(), GroupBoardChildTabView.this.f73573S0, C32002l4.m154265h(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 13));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupBoardChildTabView$b */
    /* loaded from: classes6.dex */
    public class C14319b extends RecyclerView.AbstractC1892s {
        C14319b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    GroupBoardAdapter groupBoardAdapter = GroupBoardChildTabView.this.f73577W0;
                    groupBoardAdapter.f37949w = false;
                    groupBoardAdapter.m10008p();
                } else {
                    GroupBoardChildTabView.this.f73577W0.f37949w = true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            try {
                if (GroupBoardChildTabView.this.f73569O0.m9740Y1() + GroupBoardChildTabView.this.f73569O0.m10110a() >= GroupBoardChildTabView.this.f73569O0.m10127i()) {
                    GroupBoardChildTabView groupBoardChildTabView = GroupBoardChildTabView.this;
                    if (groupBoardChildTabView.f73576V0 && !groupBoardChildTabView.f73582b1 && groupBoardChildTabView.f73577W0.f37950x != 2) {
                        groupBoardChildTabView.f73575U0++;
                        groupBoardChildTabView.m79975sM(false);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupBoardChildTabView$c */
    /* loaded from: classes6.dex */
    public class C14320c implements InterfaceC20094a {
        C14320c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m79980e() {
            GroupBoardChildTabView.this.f73581a1.setRefreshing(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m79981f() {
            GroupBoardChildTabView.this.f73581a1.setRefreshing(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                GroupBoardChildTabView groupBoardChildTabView = GroupBoardChildTabView.this;
                if (groupBoardChildTabView.f73575U0 == 1) {
                    groupBoardChildTabView.m79970LM(false, c20096c.m104491c());
                } else {
                    groupBoardChildTabView.f73577W0.f37950x = 2;
                    groupBoardChildTabView.m79972NM();
                    GroupBoardChildTabView.this.m79970LM(false, 0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupBoardChildTabView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.yh
                @Override // java.lang.Runnable
                public final void run() {
                    GroupBoardChildTabView.C14320c.this.m79981f();
                }
            });
            GroupBoardChildTabView.this.f73582b1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    GroupBoardChildTabView.this.f73576V0 = optJSONObject.optBoolean("isLoadMore", false);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("boards");
                    if (optJSONArray != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            C31988k5 c31988k5 = new C31988k5(optJSONArray.getJSONObject(i11), GroupBoardChildTabView.this.f73573S0);
                            C25490c.m132054j().m132056b(c31988k5);
                            C7904b c7904b = c31988k5.f147201b;
                            if (c7904b != null) {
                                AbstractC25989c.m133908a(c7904b);
                            }
                            GroupBoardChildTabView.this.f73578X0.add(c31988k5.m154218b());
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupBoardChildTabView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.zh
                @Override // java.lang.Runnable
                public final void run() {
                    GroupBoardChildTabView.C14320c.this.m79980e();
                }
            });
            GroupBoardChildTabView.this.m79970LM(false, 0);
            GroupBoardChildTabView groupBoardChildTabView = GroupBoardChildTabView.this;
            groupBoardChildTabView.f73577W0.f37950x = 0;
            groupBoardChildTabView.m79972NM();
            GroupBoardChildTabView.this.f73582b1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupBoardChildTabView$d */
    /* loaded from: classes6.dex */
    public class C14321d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C26000n f73588a;

        C14321d(C26000n c26000n) {
            this.f73588a = c26000n;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                this.f73588a.m133960l();
                ToastUtils.showMess(c20096c.m104492d());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19646n0.m103000l2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupBoardChildTabView$e */
    /* loaded from: classes6.dex */
    public class C14322e implements InterfaceC20094a {
        C14322e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    if (c20096c.m104491c() == 17064) {
                        C25994h.f124017a.m133919h("group_" + GroupBoardChildTabView.this.f73573S0).m133960l();
                    }
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            GroupBoardChildTabView.this.f72421L0.mo49315c4();
            GroupBoardChildTabView.this.f73583c1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    new C7904b(optJSONObject, "group_" + GroupBoardChildTabView.this.f73573S0);
                    C0943w.m4462l().m4472f(GroupBoardChildTabView.this.f73573S0);
                    AbstractC23184q2.m119438C(GroupBoardChildTabView.this.f73573S0);
                    AbstractC19646n0.m102996k2();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupBoardChildTabView.this.f72421L0.mo49315c4();
            GroupBoardChildTabView.this.f73583c1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupBoardChildTabView$f */
    /* loaded from: classes6.dex */
    public class C14323f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31988k5 f73591a;

        C14323f(C31988k5 c31988k5) {
            this.f73591a = c31988k5;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            GroupBoardChildTabView groupBoardChildTabView = GroupBoardChildTabView.this;
            groupBoardChildTabView.f73583c1 = false;
            groupBoardChildTabView.f72421L0.mo49315c4();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C23744a.m124114c().m124116d(67, this.f73591a.m154218b());
                C25490c.m132054j().m132063k(GroupBoardChildTabView.this.f73573S0, this.f73591a.m154218b());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupBoardChildTabView groupBoardChildTabView = GroupBoardChildTabView.this;
            groupBoardChildTabView.f73583c1 = false;
            groupBoardChildTabView.f72421L0.mo49315c4();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupBoardChildTabView$g */
    /* loaded from: classes6.dex */
    public class C14324g implements InterfaceC20094a {
        C14324g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                String m104492d = c20096c.m104492d();
                if (!TextUtils.isEmpty(m104492d)) {
                    ToastUtils.showMess(m104492d);
                }
            }
            GroupBoardChildTabView.this.f72421L0.mo49315c4();
            GroupBoardChildTabView.this.f73583c1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            try {
                JSONObject optJSONObject2 = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("poll")) != null) {
                    AbstractC19646n0.m103014p0(new C31961i8(optJSONObject), GroupBoardChildTabView.this.f73573S0);
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_new_poll_is_added_to_group_chat_v2));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupBoardChildTabView.this.f72421L0.mo49315c4();
            GroupBoardChildTabView.this.f73583c1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupBoardChildTabView$h */
    /* loaded from: classes6.dex */
    public class C14325h implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C7904b f73594a;

        C14325h(C7904b c7904b) {
            this.f73594a = c7904b;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                String m104492d = c20096c.m104492d();
                if (!TextUtils.isEmpty(m104492d)) {
                    ToastUtils.showMess(m104492d);
                }
            }
            GroupBoardChildTabView.this.f72421L0.mo49315c4();
            GroupBoardChildTabView.this.f73583c1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                new JSONObject().put("topicId", this.f73594a.f42715C);
                if (this.f73594a.f42732d > 0) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_send_time_reminder_to_group_chat));
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_send_notice_to_group_chat));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupBoardChildTabView.this.f72421L0.mo49315c4();
            GroupBoardChildTabView.this.f73583c1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupBoardChildTabView$i */
    /* loaded from: classes6.dex */
    public class C14326i implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31988k5 f73596a;

        C14326i(C31988k5 c31988k5) {
            this.f73596a = c31988k5;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                GroupBoardChildTabView.this.f72421L0.mo49315c4();
                if (c20096c != null) {
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                    if (c20096c.m104491c() == -17212) {
                        this.f73596a.f147202c.f146896q = 2;
                        C23744a.m124114c().m124116d(66, new Object[0]);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupBoardChildTabView.this.f73584d1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            try {
                GroupBoardChildTabView.this.f72421L0.mo49315c4();
                JSONObject optJSONObject2 = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("poll")) != null) {
                    C31961i8 c31961i8 = new C31961i8(optJSONObject);
                    C28176r6.m141702d().m141711l(c31961i8);
                    String m153669g = c31961i8.m153669g();
                    String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_msg_info_close_poll, GroupBoardChildTabView.this.m92652XI(AbstractC8020f0.str_identifier_mine_attach_list_name_onlyOne), m153669g);
                    C7907e c7907e = new C7907e();
                    c7907e.m40852b(new C7907e.a(m118746s0.lastIndexOf(m153669g), m153669g.length()));
                    AbstractC19646n0.m102983h1(m118746s0, new C18005u0.a().m95727i(9).m95719a("action.groupchat.open.polldetail", C31961i8.m153663d(c31961i8.f146880a), GroupBoardChildTabView.this.m92652XI(AbstractC8020f0.str_view)).m95725g(c7907e).m95729k(c31961i8.f146880a, c31961i8.f146895p).m95722d("share"), C0943w.m4462l().m4472f(c31961i8.f146883d), -1L);
                    C25490c.m132054j().m132060f(c31961i8);
                    C23744a.m124114c().m124116d(66, new Object[0]);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupBoardChildTabView.this.f73584d1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public /* synthetic */ void m79941AM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        m79973oM(this.f73580Z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ void m79942BM(C7904b c7904b, InterfaceC17463d interfaceC17463d, int i11) {
        m79959qM(c7904b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public /* synthetic */ void m79943CM(boolean z11, int i11) {
        String m118743r0;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            if (z11) {
                MultiStateView multiStateView = this.f73570P0;
                if (multiStateView != null) {
                    multiStateView.setVisibility(0);
                    this.f73570P0.setState(MultiStateView.EnumC15914e.LOADING);
                }
                this.f73571Q0.setVisibility(8);
                return;
            }
            if (i11 == 0) {
                this.f73570P0.setVisibility(8);
                this.f73571Q0.setVisibility(0);
                return;
            }
            if (i11 != 17007) {
                if (i11 != 50001) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_loading_board_items);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_privileges_admin_expire);
            }
            this.f73570P0.setState(MultiStateView.EnumC15914e.ERROR);
            this.f73570P0.setErrorTitleString(m118743r0);
            MultiStateView multiStateView2 = this.f73570P0;
            if (i11 == 50001) {
                enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
            } else {
                enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
            }
            multiStateView2.setErrorType(enumC15915f);
            this.f73570P0.setVisibility(0);
            this.f73571Q0.setVisibility(8);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ void m79944DM() {
        m79975sM(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public /* synthetic */ void m79945EM() {
        if (!C23055e5.m118271f()) {
            this.f73581a1.setRefreshing(false);
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
        } else {
            this.f73575U0 = 1;
            this.f73578X0.clear();
            this.f73576V0 = true;
            m79975sM(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public /* synthetic */ void m79946FM() {
        this.f73577W0.m35602S(this.f73579Y0);
    }

    /* renamed from: nM */
    private boolean m79957nM(final C7904b c7904b) {
        if (C25994h.f124017a.m133919h("group_" + this.f73573S0).m133973z()) {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.xh
                @Override // java.lang.Runnable
                public final void run() {
                    GroupBoardChildTabView.this.m79961wM(c7904b);
                }
            });
            return false;
        }
        return true;
    }

    /* renamed from: pM */
    private C7904b m79958pM() {
        C7904b c7904b = new C7904b(3);
        C31961i8 c31961i8 = this.f73580Z0.f147202c;
        if (c31961i8 != null) {
            c7904b.f42715C = c31961i8.f146880a;
            String str = c31961i8.f146881b;
            c7904b.f42754z = str;
            c7904b.f42736h = str;
        }
        return c7904b;
    }

    /* renamed from: qM */
    private void m79959qM(C7904b c7904b) {
        String str = "group_" + this.f73573S0;
        C26000n m133919h = C25994h.f124017a.m133919h(str);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14321d(m133919h));
        if (AbstractC25495a.m132079d(str)) {
            c0766k.mo1551U9(this.f73573S0, c7904b.f42715C, c7904b.f42729a);
        } else {
            c0766k.mo1694n6(str, m133919h.m133961m(), c7904b.f42715C, c7904b.f42729a);
        }
    }

    /* renamed from: uM */
    private boolean m79960uM() {
        if (this.f73580Z0 == null) {
            return false;
        }
        C26000n m133919h = C25994h.f124017a.m133919h("group_" + this.f73573S0);
        C31988k5 c31988k5 = this.f73580Z0;
        C7904b c7904b = c31988k5.f147201b;
        if (c31988k5.f147200a == 3) {
            c7904b = m79958pM();
        }
        return m133919h.m133971x(c7904b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m79961wM(C7904b c7904b) {
        ZaloView m92650VI = this.f72421L0.m92650VI();
        if (m92650VI instanceof GroupBoardView) {
            ((GroupBoardView) m92650VI).m79989nM(c7904b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m79962xM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == -1) {
            return;
        }
        m79976tM(intValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public /* synthetic */ void m79963yM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        m79969KM(this.f73580Z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public /* synthetic */ void m79964zM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue != -1 && intValue == AbstractC8020f0.str_item_hide) {
            m79972NM();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0257, code lost:            if (r7 != 4) goto L106;     */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        C31973j5 m4472f;
        boolean z11;
        int i12;
        InviteContactProfile inviteContactProfile;
        C31961i8 c31961i8;
        int i13;
        int i14;
        final C7904b c7904b;
        boolean z12 = false;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        C31988k5 c31988k5 = this.f73580Z0;
                        if (c31988k5.f147200a == 3) {
                            c7904b = m79958pM();
                        } else {
                            c7904b = c31988k5.f147201b;
                        }
                        if (c7904b == null) {
                            return null;
                        }
                        return AbstractC23089h6.m118433a(c7904b, "group_" + this.f73573S0, this.f72421L0.getContext(), new InterfaceC17463d.b(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.th
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                                GroupBoardChildTabView.this.m79942BM(c7904b, interfaceC17463d, i15);
                            }
                        });
                    }
                    C31973j5 m4472f2 = C0943w.m4462l().m4472f(this.f73573S0);
                    if (m4472f2 != null && m4472f2.m153747Y()) {
                        z12 = true;
                    }
                    C8009j.a aVar = new C8009j.a(this.f72421L0.getContext());
                    C8009j.a m43171t = aVar.m43159h(7).m43171t(AbstractC8020f0.str_close_poll_dialog_title);
                    if (z12) {
                        i14 = AbstractC8020f0.str_community_close_poll_dialog_msg;
                    } else {
                        i14 = AbstractC8020f0.str_close_poll_dialog_msg;
                    }
                    m43171t.m43161j(i14).m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.str_btn_close_poll, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.sh
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                            GroupBoardChildTabView.this.m79941AM(interfaceC17463d, i15);
                        }
                    });
                    return aVar.m43152a();
                }
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.getContext());
                aVar2.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_delete_this_item)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.qh
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                        GroupBoardChildTabView.this.m79963yM(interfaceC17463d, i15);
                    }
                });
                return aVar2.m43152a();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_item_hide), AbstractC8020f0.str_item_hide));
            if (arrayList.isEmpty()) {
                return null;
            }
            final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.getContext(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar3 = new C8009j.a(this.f72421L0.getContext());
            aVar3.m43155d(true);
            aVar3.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.rh
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                    GroupBoardChildTabView.this.m79964zM(simpleAdapter, interfaceC17463d, i15);
                }
            });
            return aVar3.m43152a();
        }
        if (this.f73580Z0 == null || (m4472f = C0943w.m4462l().m4472f(this.f73573S0)) == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!m4472f.m153742T() && !this.f73580Z0.m154219c()) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i15 = this.f73580Z0.f147200a;
        if ((i15 == 1 || i15 == 4) && z11) {
            arrayList2.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit), AbstractC8020f0.str_edit));
        }
        if ((!m4472f.m153763h0() || m4472f.m153742T()) && ((i12 = this.f73580Z0.f147200a) == 1 || i12 == 3 || i12 == 4)) {
            if (m79960uM()) {
                arrayList2.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_unpin_from_top_of_group_chat_v2), AbstractC8020f0.str_unpin_from_top_of_group_chat_v2));
            } else {
                arrayList2.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pin_to_top_group_chat_v2), AbstractC8020f0.str_pin_to_top_group_chat_v2));
            }
        }
        if (this.f73580Z0.f147200a == 3) {
            arrayList2.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_send_to_group_v2), AbstractC8020f0.str_poll_send_to_group_v2));
        }
        int i16 = this.f73580Z0.f147200a;
        if ((i16 == 1 || i16 == 4) && z11) {
            arrayList2.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), AbstractC8020f0.str_delete));
        }
        if (this.f73580Z0.f147200a == 2) {
            arrayList2.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_original_msg), AbstractC8020f0.str_view_original_msg));
            if (z11) {
                if (this.f73574T0) {
                    i13 = AbstractC8020f0.str_remove_from_community_board;
                } else {
                    i13 = AbstractC8020f0.str_remove_from_group_board;
                }
                arrayList2.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(i13), AbstractC8020f0.str_remove_from_group_board));
            }
        }
        C31988k5 c31988k52 = this.f73580Z0;
        if (c31988k52.f147200a == 3 && (c31961i8 = c31988k52.f147202c) != null && !c31961i8.m153671i() && z11) {
            arrayList2.add(AbstractC23184q2.m119451i(m92652XI(AbstractC8020f0.str_menu_close_poll), AbstractC8020f0.str_menu_close_poll));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        final SimpleAdapter simpleAdapter2 = new SimpleAdapter(this.f72421L0.getContext(), arrayList2, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
        C8009j.a aVar4 = new C8009j.a(this.f72421L0.getContext());
        C31988k5 c31988k53 = this.f73580Z0;
        int i17 = c31988k53.f147200a;
        String str = "";
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 == 3) {
                    C31961i8 c31961i82 = c31988k53.f147202c;
                    if (c31961i82 != null) {
                        str = c31961i82.f146881b;
                    }
                }
            } else {
                C7904b c7904b2 = c31988k53.f147201b;
                if (c7904b2 != null && (inviteContactProfile = c7904b2.f42719G) != null) {
                    str = inviteContactProfile.m40485u1();
                }
                str = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_message_of_user), str);
            }
            aVar4.m43172u(str);
            aVar4.m43155d(true);
            aVar4.m43153b(simpleAdapter2, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ph
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i18) {
                    GroupBoardChildTabView.this.m79962xM(simpleAdapter2, interfaceC17463d, i18);
                }
            });
            return aVar4.m43152a();
        }
        C7904b c7904b3 = c31988k53.f147201b;
        if (c7904b3 != null) {
            str = c7904b3.f42736h;
        }
        aVar4.m43172u(str);
        aVar4.m43155d(true);
        aVar4.m43153b(simpleAdapter2, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ph
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i18) {
                GroupBoardChildTabView.this.m79962xM(simpleAdapter2, interfaceC17463d, i18);
            }
        });
        return aVar4.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m92637BK(true);
        this.f73567M0 = layoutInflater.inflate(AbstractC7409c0.group_board_child_tab_view, viewGroup, false);
        m79971MM();
        return this.f73567M0;
    }

    /* renamed from: GM */
    void m79965GM(String str) {
        if (TextUtils.isEmpty(str) || this.f73583c1) {
            return;
        }
        this.f73583c1 = true;
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14324g());
        c0766k.mo1408D3(str);
    }

    /* renamed from: HM */
    void m79966HM(C7904b c7904b) {
        if (c7904b == null || TextUtils.isEmpty(c7904b.f42715C) || this.f73583c1) {
            return;
        }
        this.f73583c1 = true;
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14325h(c7904b));
        c0766k.mo1461J7(c7904b.f42715C, this.f73573S0);
    }

    /* renamed from: IM */
    void m79967IM(C31988k5 c31988k5) {
        if (c31988k5 != null && c31988k5.f147201b != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("extra_topic_id", c31988k5.f147201b.f42715C);
                bundle.putString("extra_group_id", this.f73573S0);
                this.f72421L0.m92676n2().mo35579p().m93069k2(GroupPostDetailViewV2.class, bundle, 1, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: JM */
    void m79968JM(C31988k5 c31988k5) {
        if (c31988k5 == null || this.f73583c1) {
            return;
        }
        this.f73583c1 = true;
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14322e());
        c0766k.mo1476L6(this.f73573S0, c31988k5.f147200a, c31988k5.m154217a());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 66);
        C23744a.m124114c().m124117e(this, 67);
        C23744a.m124114c().m124117e(this, 68);
    }

    /* renamed from: KM */
    void m79969KM(C31988k5 c31988k5) {
        if (c31988k5 == null || this.f73583c1) {
            return;
        }
        this.f73583c1 = true;
        C0943w.m4462l().m4472f(this.f73573S0);
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14323f(c31988k5));
        c0766k.mo1602b5(this.f73573S0, c31988k5.f147200a, c31988k5.m154217a());
    }

    /* renamed from: LM */
    void m79970LM(final boolean z11, final int i11) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.oh
            @Override // java.lang.Runnable
            public final void run() {
                GroupBoardChildTabView.this.m79943CM(z11, i11);
            }
        });
    }

    /* renamed from: MM */
    void m79971MM() {
        this.f73571Q0 = this.f73567M0.findViewById(AbstractC6918a0.container);
        MultiStateView multiStateView = (MultiStateView) this.f73567M0.findViewById(AbstractC6918a0.multi_state);
        this.f73570P0 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.uh
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                GroupBoardChildTabView.this.m79944DM();
            }
        });
        this.f73570P0.setEnableBtnEmpty(false);
        this.f73577W0 = new GroupBoardAdapter(this.f72421L0.getContext(), this.f73573S0, new C14318a());
        RecyclerView recyclerView = (RecyclerView) this.f73567M0.findViewById(AbstractC6918a0.recycle_view);
        this.f73568N0 = recyclerView;
        recyclerView.m9826E(new C14319b());
        this.f73568N0.setAdapter(this.f73577W0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.getContext());
        this.f73569O0 = linearLayoutManager;
        this.f73568N0.setLayoutManager(linearLayoutManager);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f73567M0.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f73581a1 = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(AbstractC16801x.cM1);
        this.f73581a1.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.vh
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                GroupBoardChildTabView.this.m79945EM();
            }
        });
    }

    /* renamed from: NM */
    void m79972NM() {
        int i11;
        int i12;
        int i13;
        this.f73579Y0.clear();
        Iterator it = this.f73578X0.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int m132053i = C25490c.m132053i(str);
            if (m132053i != 1) {
                if (m132053i != 2) {
                    if (m132053i != 3) {
                        if (m132053i != 4) {
                        }
                    } else {
                        this.f73579Y0.add(new C32003l5(108, str));
                    }
                } else {
                    this.f73579Y0.add(new C32003l5(107, str));
                }
            }
            this.f73579Y0.add(new C32003l5(106, str));
        }
        if (!this.f73576V0) {
            C32003l5 c32003l5 = new C32003l5(104);
            int i14 = this.f73572R0;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        if (this.f73574T0) {
                            i13 = AbstractC8020f0.str_community_board_hint_note;
                        } else {
                            i13 = AbstractC8020f0.str_board_tab_post_title;
                        }
                        c32003l5.f147252b = AbstractC23136l9.m118743r0(i13);
                        c32003l5.f147253c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_note);
                        c32003l5.f147254d = 4;
                        c32003l5.f147255e = AbstractC16803z.icn_hint_create_notice;
                    }
                } else {
                    if (this.f73574T0) {
                        i12 = AbstractC8020f0.str_community_board_hint_poll;
                    } else {
                        i12 = AbstractC8020f0.str_board_tab_poll_title;
                    }
                    c32003l5.f147252b = AbstractC23136l9.m118743r0(i12);
                    c32003l5.f147253c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_poll);
                    c32003l5.f147254d = 2;
                    c32003l5.f147255e = AbstractC16803z.icn_hint_poll;
                }
            } else {
                if (this.f73574T0) {
                    i11 = AbstractC8020f0.str_community_board_hint_messsage_pinned;
                } else {
                    i11 = AbstractC8020f0.str_board_tab_message_title;
                }
                c32003l5.f147252b = AbstractC23136l9.m118743r0(i11);
                c32003l5.f147255e = AbstractC16803z.icn_hint_pin_msg;
            }
            this.f73579Y0.add(c32003l5);
        } else if (this.f73577W0.f37950x != 0) {
            this.f73579Y0.add(new C32003l5(105));
        }
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.wh
            @Override // java.lang.Runnable
            public final void run() {
                GroupBoardChildTabView.this.m79946FM();
            }
        });
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupBoardChildTabView";
    }

    /* renamed from: oM */
    void m79973oM(C31988k5 c31988k5) {
        if (this.f73584d1) {
            return;
        }
        this.f73584d1 = true;
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14326i(c31988k5));
        c0766k.mo1760v8(c31988k5.f147202c.f146880a);
    }

    /* renamed from: rM */
    void m79974rM(C31988k5 c31988k5) {
        if (c31988k5 != null && c31988k5.f147201b != null) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_group_id", this.f73573S0);
            bundle.putString("extra_group_board_gen_id", c31988k5.m154218b());
            if (c31988k5.f147201b.f42732d > 0) {
                bundle.putInt("INT_EXTRA_MODE_REMINDER_COMPOSE", 0);
                this.f72421L0.m92676n2().mo35579p().m93069k2(GroupReminderComposeView.class, bundle, 1, true);
            } else {
                this.f72421L0.m92676n2().mo35579p().m93069k2(GroupPostComposeViewV2.class, bundle, 1, true);
            }
        }
    }

    /* renamed from: sM */
    void m79975sM(boolean z11) {
        int i11;
        String m154217a;
        int i12;
        if (this.f73582b1) {
            return;
        }
        this.f73582b1 = true;
        if (this.f73575U0 == 1) {
            if (!z11) {
                m79970LM(true, 0);
            }
        } else {
            this.f73577W0.f37950x = 1;
            m79972NM();
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14320c());
        int i13 = this.f73572R0;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
            } else {
                i11 = 3;
            }
        } else {
            i11 = 2;
        }
        if (this.f73578X0.size() == 0) {
            m154217a = "0";
            i12 = 0;
        } else {
            C25490c m132054j = C25490c.m132054j();
            ArrayList arrayList = this.f73578X0;
            C31988k5 m132062h = m132054j.m132062h((String) arrayList.get(arrayList.size() - 1));
            m154217a = m132062h.m154217a();
            i12 = m132062h.f147200a;
        }
        c0766k.mo1432G3(this.f73573S0, i11, this.f73575U0, m154217a, i12);
    }

    /* renamed from: tM */
    void m79976tM(int i11) {
        C31988k5 c31988k5 = this.f73580Z0;
        if (c31988k5 == null) {
            return;
        }
        if (i11 == AbstractC8020f0.str_edit) {
            int i12 = c31988k5.f147200a;
            if (i12 == 1 || i12 == 4) {
                AbstractC23647d.m123897g("1001666");
                m79974rM(this.f73580Z0);
                return;
            }
            return;
        }
        if (i11 == AbstractC8020f0.str_pin_to_top_group_chat_v2) {
            int i13 = c31988k5.f147200a;
            if (i13 != 1) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                } else {
                    if (c31988k5.f147202c != null) {
                        if (m79960uM() || m79957nM(m79958pM())) {
                            m79968JM(this.f73580Z0);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            if (c31988k5.f147201b != null) {
                if (m79960uM() || m79957nM(this.f73580Z0.f147201b)) {
                    m79968JM(this.f73580Z0);
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == AbstractC8020f0.str_unpin_from_top_of_group_chat_v2) {
            showDialog(5);
            return;
        }
        if (i11 == AbstractC8020f0.str_poll_send_to_group_v2) {
            int i14 = c31988k5.f147200a;
            if (i14 != 1 && i14 != 4) {
                if (i14 == 3) {
                    AbstractC23647d.m123897g("10010009");
                    C31961i8 c31961i8 = this.f73580Z0.f147202c;
                    if (c31961i8 != null) {
                        m79965GM(c31961i8.f146880a);
                        return;
                    }
                    return;
                }
                return;
            }
            m79966HM(c31988k5.f147201b);
            return;
        }
        if (i11 == AbstractC8020f0.str_delete) {
            int i15 = c31988k5.f147200a;
            if (i15 == 1 || i15 == 4) {
                AbstractC23647d.m123897g("1001615");
                this.f72421L0.showDialog(3);
                return;
            }
            return;
        }
        if (i11 == AbstractC8020f0.str_remove_from_group_board) {
            if (c31988k5.f147200a == 2) {
                AbstractC23647d.m123897g("1001677");
                this.f72421L0.showDialog(3);
                return;
            }
            return;
        }
        if (i11 == AbstractC8020f0.str_view_original_msg) {
            if (c31988k5.f147200a == 2) {
                m79977vM(c31988k5.f147201b);
            }
        } else if (i11 == AbstractC8020f0.str_menu_close_poll) {
            this.f72421L0.showDialog(4);
        }
    }

    /* renamed from: vM */
    void m79977vM(C7904b c7904b) {
        if (c7904b != null && c7904b.f42747s != null) {
            ZaloView m92650VI = this.f72421L0.m92650VI();
            if (m92650VI instanceof GroupBoardView) {
                ((GroupBoardView) m92650VI).m79986iM(c7904b);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        int i12 = 0;
        try {
            switch (i11) {
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    AbstractC2364o0.m12369l(this.f72421L0.m92676n2(), this.f73577W0);
                    return;
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    String str = (String) objArr[0];
                    while (true) {
                        if (i12 < this.f73578X0.size()) {
                            if (((String) this.f73578X0.get(i12)).equals(str)) {
                                this.f73578X0.remove(i12);
                            } else {
                                i12++;
                            }
                        }
                    }
                    m79972NM();
                    return;
                case 68:
                    C31988k5 m132062h = C25490c.m132054j().m132062h((String) objArr[0]);
                    int i13 = this.f73572R0;
                    if (i13 == 2) {
                        int i14 = m132062h.f147200a;
                        if (i14 != 1 && i14 != 4) {
                        }
                        this.f73578X0.add(0, m132062h.m154218b());
                        m79972NM();
                        return;
                    }
                    if ((i13 != 0 || m132062h.f147200a != 2) && (i13 != 1 || m132062h.f147200a != 3)) {
                        return;
                    }
                    this.f73578X0.add(0, m132062h.m154218b());
                    m79972NM();
                    return;
                default:
                    return;
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
            this.f73572R0 = 0;
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                int i11 = m92642L3.getInt("extra_tab_type");
                this.f73572R0 = i11;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC23647d.m123897g("1001649");
                        }
                    } else {
                        AbstractC23647d.m123897g("1001651");
                    }
                } else {
                    AbstractC23647d.m123897g("1001650");
                }
                this.f73573S0 = m92642L3.getString("extra_group_id");
                this.f73574T0 = m92642L3.getBoolean("EXTRA_IS_COMMUNITY", false);
                this.f73577W0.m35601R(this.f73573S0);
                m79975sM(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 66);
        C23744a.m124114c().m124115b(this, 67);
        C23744a.m124114c().m124115b(this, 68);
    }
}
