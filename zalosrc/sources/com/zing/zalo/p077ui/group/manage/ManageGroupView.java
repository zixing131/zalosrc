package com.zing.zalo.p077ui.group.manage;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import ag0.C0804b;
import ag0.C0815e1;
import am.AbstractC0906d0;
import am.AbstractC0924m0;
import am.C0927o;
import am.C0943w;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.ManageGroupAdapter;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.MuteTrackingSource;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.group.bottomsheet.setting.ManageMemberPermissionSettingBottomSheet;
import com.zing.zalo.p077ui.group.manage.ManageGroupView;
import com.zing.zalo.p077ui.widget.DimHightLightView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.GroupAdminMemberView;
import com.zing.zalo.p077ui.zviews.GroupBlockedMemberView;
import com.zing.zalo.p077ui.zviews.GroupMemApprovalView;
import com.zing.zalo.p077ui.zviews.GroupSelectNewOwnerView;
import com.zing.zalo.p077ui.zviews.ManageGroupLinkView;
import com.zing.zalo.p077ui.zviews.ManageMembersView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gw.AbstractC19620d0;
import gw.AbstractC19646n0;
import gw.C19637j;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import me0.AbstractC23034c6;
import me0.AbstractC23059e9;
import me0.AbstractC23088h5;
import me0.AbstractC23116k0;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23201r8;
import me0.C23055e5;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p019aj.C0872f;
import p085ct.C17573b;
import p142ey.C18644n;
import p205hc.C19965d;
import p304ks.AbstractC21935u;
import p304ks.C21912a;
import p304ks.C21920f;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p394oj.C24275a;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p649xl.C29704a2;
import p649xl.C29938n2;
import p649xl.C29956o2;
import p649xl.C30066u7;
import p656xs.C30202c;
import p716zh.C31901e8;
import p716zh.C31973j5;
import p716zh.C31986k3;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import t00.C26444a;
import th.AbstractC26689j;
import vg.AbstractC28025b8;
import vg.C28203u6;
import vg.C28212v6;

/* loaded from: classes5.dex */
public final class ManageGroupView extends SlidableZaloView implements C23744a.c, InterfaceC17463d.d, InterfaceC0733x {
    public static final C11976a Companion = new C11976a(null);

    /* renamed from: Q0 */
    private C30066u7 f62359Q0;

    /* renamed from: R0 */
    private ManageGroupAdapter f62360R0;

    /* renamed from: S0 */
    private DimHightLightView f62361S0;

    /* renamed from: V0 */
    private Conversation f62364V0;

    /* renamed from: X0 */
    private C31973j5 f62366X0;

    /* renamed from: Y0 */
    private boolean f62367Y0;

    /* renamed from: Z0 */
    private InterfaceC11977b f62368Z0;

    /* renamed from: b1 */
    private boolean f62370b1;

    /* renamed from: f1 */
    private boolean f62374f1;

    /* renamed from: g1 */
    private int f62375g1;

    /* renamed from: h1 */
    private boolean f62376h1;

    /* renamed from: i1 */
    private CheckBox f62377i1;

    /* renamed from: k1 */
    private boolean f62379k1;

    /* renamed from: n1 */
    private boolean f62382n1;

    /* renamed from: r1 */
    private boolean f62386r1;

    /* renamed from: u1 */
    private boolean f62389u1;

    /* renamed from: P0 */
    private final InterfaceC24854k f62358P0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C17573b.class), new C11990o(new C11989n(this)), C11994s.f62411q);

    /* renamed from: T0 */
    private String f62362T0 = "";

    /* renamed from: U0 */
    private String f62363U0 = "";

    /* renamed from: W0 */
    private ArrayList f62365W0 = new ArrayList();

    /* renamed from: a1 */
    private int f62369a1 = 52;

    /* renamed from: c1 */
    private String f62371c1 = "";

    /* renamed from: d1 */
    private String f62372d1 = "0";

    /* renamed from: e1 */
    private String f62373e1 = "";

    /* renamed from: j1 */
    private int f62378j1 = -1;

    /* renamed from: l1 */
    private InterfaceC0765j f62380l1 = new C0766k();

    /* renamed from: m1 */
    private InterfaceC20094a f62381m1 = new C11981f();

    /* renamed from: o1 */
    private String f62383o1 = "";

    /* renamed from: p1 */
    private InterfaceC0765j f62384p1 = new C0766k();

    /* renamed from: q1 */
    private InterfaceC20094a f62385q1 = new C11986k();

    /* renamed from: s1 */
    private InterfaceC0765j f62387s1 = new C0766k();

    /* renamed from: t1 */
    private InterfaceC20094a f62388t1 = new C11979d();

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$a */
    /* loaded from: classes5.dex */
    public static final class C11976a {
        private C11976a() {
        }

        public /* synthetic */ C11976a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ManageGroupView m66605a(String str, Conversation conversation, InterfaceC11977b interfaceC11977b, int i11, String str2, String str3, String str4) {
            AbstractC19074t.m100208f(str, "chatId");
            AbstractC19074t.m100208f(conversation, "conversation");
            ManageGroupView manageGroupView = new ManageGroupView();
            Bundle bundle = new Bundle();
            bundle.putString("extra_chat_id", str);
            bundle.putParcelable("state_chat_contact", conversation);
            bundle.putInt("other_setting_type", i11);
            bundle.putString("STR_SOURCE_START_VIEW", str2);
            bundle.putString("STR_LOG_CHAT_TYPE", str3);
            bundle.putString("highlight_id", str4);
            manageGroupView.mo60305zK(bundle);
            manageGroupView.m66604xO(conversation);
            manageGroupView.m66603wO(interfaceC11977b);
            return manageGroupView;
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC11977b {
        /* renamed from: a */
        void mo60336a();

        /* renamed from: b */
        void mo60337b();

        /* renamed from: c */
        void mo60338c();

        /* renamed from: d */
        void mo60339d(boolean z11);

        /* renamed from: e */
        void mo60340e();

        /* renamed from: g4 */
        void mo60341g4();

        /* renamed from: i4 */
        void mo60342i4();
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$c */
    /* loaded from: classes5.dex */
    public static final class C11978c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ C24275a f62391b;

        C11978c(C24275a c24275a) {
            this.f62391b = c24275a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                ManageGroupView.this.f62389u1 = false;
                ManageGroupView.this.mo49315c4();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "arg0");
            try {
                try {
                    C7860a.Companion.m40303b().m40260C0();
                    C0804b.m2025g().m2029b(this.f62391b);
                    C23744a.Companion.m124119a().m124116d(119, new Object[0]);
                    if (ManageGroupView.this.mo45894h0()) {
                        ToastUtils.m89268p(AbstractC19620d0.m102701u(this.f62391b.m126766c()));
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                ManageGroupView.this.f62389u1 = false;
                ManageGroupView.this.mo49315c4();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$d */
    /* loaded from: classes5.dex */
    public static final class C11979d implements InterfaceC20094a {
        C11979d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            ManageGroupView.this.f62386r1 = false;
            if (ManageGroupView.this.m92672lJ()) {
                ToastUtils.showMess(ManageGroupView.this.m92652XI(AbstractC8020f0.error_message));
            }
            ManageGroupView.this.m66487EO();
            ManageGroupView.this.f72421L0.mo78960q3();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ContactProfile contactProfile;
            AbstractC19074t.m100208f(obj, "entity");
            ManageGroupView.this.f62386r1 = false;
            InterfaceC11977b m66601HN = ManageGroupView.this.m66601HN();
            if (m66601HN != null) {
                m66601HN.mo60339d(true);
            }
            if (ManageGroupView.this.m66602JN() != null) {
                C21912a m114159g = C21912a.m114159g();
                Conversation m66602JN = ManageGroupView.this.m66602JN();
                if (m66602JN != null) {
                    contactProfile = m66602JN.m40998a();
                } else {
                    contactProfile = null;
                }
                m114159g.m114162b(contactProfile);
            }
            ManageGroupView.this.f62378j1 = 1;
            ManageGroupView.this.m66487EO();
            ManageGroupView.this.f72421L0.mo78960q3();
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$e */
    /* loaded from: classes5.dex */
    public static final class C11980e implements InterfaceC20094a {
        C11980e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            ManageGroupView.this.f62374f1 = false;
            ManageGroupView.this.f72421L0.mo49315c4();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            ManageGroupView.this.f62374f1 = false;
            ManageGroupView.this.f72421L0.mo49315c4();
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$f */
    /* loaded from: classes5.dex */
    public static final class C11981f implements InterfaceC20094a {
        C11981f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            ManageGroupView.this.f62379k1 = false;
            ManageGroupView.this.m66487EO();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    if (jSONObject.has("req_info")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("req_info");
                        ManageGroupView.this.f62378j1 = jSONObject2.optInt("isBlockTimeLine", 0);
                        ContactProfile contactProfile = null;
                        if (ManageGroupView.this.f62378j1 == 1) {
                            C21912a m114159g = C21912a.m114159g();
                            Conversation m66602JN = ManageGroupView.this.m66602JN();
                            if (m66602JN != null) {
                                contactProfile = m66602JN.m40998a();
                            }
                            m114159g.m114162b(contactProfile);
                        } else {
                            C21912a m114159g2 = C21912a.m114159g();
                            Conversation m66602JN2 = ManageGroupView.this.m66602JN();
                            if (m66602JN2 != null) {
                                contactProfile = m66602JN2.m40998a();
                            }
                            m114159g2.m114172n(contactProfile);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                ManageGroupView.this.m66487EO();
                ManageGroupView.this.f62379k1 = false;
            } catch (Throwable th2) {
                ManageGroupView.this.m66487EO();
                ManageGroupView.this.f62379k1 = false;
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$g */
    /* loaded from: classes5.dex */
    public static final class C11982g implements InterfaceC20094a {
        C11982g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                ToastUtils.showMess(c20096c.m104492d());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                AbstractC23184q2.m119447e(ManageGroupView.this.f62362T0);
                Intent intent = new Intent();
                intent.putExtra("extra_group_id", ManageGroupView.this.f62362T0);
                ManageGroupView.this.f72421L0.mo50035CK(-1, intent);
                ManageGroupView.this.finish();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$h */
    /* loaded from: classes5.dex */
    public static final class C11983h extends AbstractC23116k0.a {
        C11983h() {
        }

        @Override // me0.AbstractC23116k0.a
        /* renamed from: b */
        public void mo56829b(InterfaceC17463d interfaceC17463d, int i11) {
            AbstractC19074t.m100208f(interfaceC17463d, "dialog");
            interfaceC17463d.dismiss();
            ManageGroupView.this.m66597yO(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$i */
    /* loaded from: classes5.dex */
    public static final class C11984i extends RecyclerView.AbstractC1892s {
        C11984i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    ManageGroupAdapter manageGroupAdapter = ManageGroupView.this.f62360R0;
                    if (manageGroupAdapter != null) {
                        manageGroupAdapter.f38153u = false;
                    }
                    ManageGroupAdapter manageGroupAdapter2 = ManageGroupView.this.f62360R0;
                    if (manageGroupAdapter2 != null) {
                        manageGroupAdapter2.m10008p();
                        return;
                    }
                    return;
                }
                ManageGroupAdapter manageGroupAdapter3 = ManageGroupView.this.f62360R0;
                if (manageGroupAdapter3 != null) {
                    manageGroupAdapter3.f38153u = true;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$j */
    /* loaded from: classes5.dex */
    public static final class C11985j implements ManageGroupAdapter.InterfaceC6975b {
        C11985j() {
        }

        @Override // com.zing.zalo.adapters.ManageGroupAdapter.InterfaceC6975b
        /* renamed from: a */
        public void mo35744a(int i11, boolean z11, ManageGroupAdapter.C6979f c6979f) {
            AbstractC19074t.m100208f(c6979f, "settingItem");
            if (c6979f.m35758k()) {
                switch (i11) {
                    case 0:
                    case 1:
                    case 2:
                    case 11:
                    case 12:
                    case 20:
                    case 27:
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                        ManageGroupView.this.m66530ZN(i11, z11);
                        return;
                    case 3:
                        ManageGroupView.this.m66524WN(z11);
                        return;
                    case 4:
                        ManageGroupView.this.m66528YN(i11, z11);
                        return;
                    case 5:
                        ManageGroupView.this.m66526XN();
                        return;
                    case 6:
                        ManageGroupView.this.m66510PN();
                        return;
                    case 7:
                        ManageGroupView.this.m66522VN();
                        return;
                    case 8:
                        ManageGroupView.this.m66540eO();
                        return;
                    case 9:
                        ManageGroupView.this.m66534bO();
                        return;
                    case 10:
                    case 22:
                    default:
                        return;
                    case 13:
                        ManageGroupView.this.m66506NN();
                        return;
                    case 14:
                        ManageGroupView.this.m66508ON();
                        return;
                    case 15:
                        ManageGroupView.this.m66548hO();
                        return;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        ManageGroupView.this.m66518TN();
                        return;
                    case 17:
                        ManageGroupView.this.m66512QN(z11);
                        return;
                    case 18:
                        ManageGroupView.this.m66520UN();
                        return;
                    case 19:
                        ManageGroupView.this.m66516SN();
                        return;
                    case 21:
                        ManageGroupView.this.m66484DO();
                        return;
                    case 23:
                        ManageGroupView.this.m66538dO();
                        return;
                    case 24:
                        ManageGroupView.this.m66542fO();
                        return;
                    case 25:
                        ManageGroupView.this.m66514RN();
                        return;
                    case 26:
                        ManageGroupView.this.m66532aO();
                        return;
                    case 28:
                        ManageGroupView.this.m66545gO();
                        return;
                    case 29:
                        ManageGroupView.this.m66536cO();
                        return;
                }
            }
            if (i11 == 3) {
                ManageGroupView.this.m66504MN();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$k */
    /* loaded from: classes5.dex */
    public static final class C11986k implements InterfaceC20094a {
        C11986k() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            ManageGroupView.this.f62382n1 = false;
            if (ManageGroupView.this.m92672lJ()) {
                ToastUtils.showMess(ManageGroupView.this.m92652XI(AbstractC8020f0.error_message));
            }
            ManageGroupView.this.m66487EO();
            ManageGroupView.this.f72421L0.mo78960q3();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                ManageGroupView.this.f62382n1 = false;
                Conversation m66602JN = ManageGroupView.this.m66602JN();
                if (m66602JN != null) {
                    ManageGroupView manageGroupView = ManageGroupView.this;
                    if (manageGroupView.f62383o1.length() > 0 && AbstractC19074t.m100204b(manageGroupView.f62383o1, m66602JN.f42893q)) {
                        InterfaceC11977b m66601HN = manageGroupView.m66601HN();
                        if (m66601HN != null) {
                            m66601HN.mo60339d(false);
                        }
                        C21912a.m114159g().m114173o(manageGroupView.f62383o1);
                        manageGroupView.f62378j1 = 0;
                    }
                }
                ManageGroupView.this.m66487EO();
                ManageGroupView.this.f72421L0.mo78960q3();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$l */
    /* loaded from: classes5.dex */
    public static final class C11987l implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f62401b;

        C11987l(String str) {
            this.f62401b = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                ManageGroupView.this.mo49315c4();
                ManageGroupView.this.f62389u1 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "arg0");
            try {
                try {
                    C0804b.m2025g().m2035l(this.f62401b, true);
                    C23744a.Companion.m124119a().m124116d(119, new Object[0]);
                    if (ManageGroupView.this.mo45894h0()) {
                        ToastUtils.m89268p(ManageGroupView.this.m92652XI(AbstractC8020f0.str_toast_msg_turn_on_notif));
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                ManageGroupView.this.mo49315c4();
                ManageGroupView.this.f62389u1 = false;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$m */
    /* loaded from: classes5.dex */
    public static final class C11988m implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ ContactProfile f62403b;

        /* renamed from: c */
        final /* synthetic */ boolean f62404c;

        C11988m(ContactProfile contactProfile, boolean z11) {
            this.f62403b = contactProfile;
            this.f62404c = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m66607d(ManageGroupView manageGroupView) {
            AbstractC19074t.m100208f(manageGroupView, "this$0");
            try {
                manageGroupView.mo49315c4();
                AbstractC23088h5.m118426g();
                if (manageGroupView.m92672lJ()) {
                    ToastUtils.showMess(manageGroupView.m92652XI(AbstractC8020f0.str_tv_delfriend_success));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                ManageGroupView.this.mo78960q3();
                try {
                    i11 = c20096c.m104491c();
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    i11 = -1000;
                }
                if (ManageGroupView.this.m92672lJ()) {
                    ToastUtils.m89259g(i11);
                }
            } catch (Exception e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("data")) {
                    String string = new JSONObject(jSONObject.getString("data")).getString("code");
                    AbstractC19074t.m100207e(string, "getString(...)");
                    int parseInt = Integer.parseInt(string);
                    if (parseInt != 0) {
                        if (ManageGroupView.this.m92672lJ()) {
                            ToastUtils.m89259g(parseInt);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            C7960e.m41971c6().m42136Gd(this.f62403b.f42434r, false);
            C28203u6 c28203u6 = C28203u6.f131407a;
            String str = this.f62403b.f42434r;
            AbstractC19074t.m100207e(str, "uid");
            c28203u6.m141827z(str, false);
            ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(this.f62403b.f42434r);
            ContactProfile m98552o = C18644n.m98531l().m98552o(this.f62403b.f42434r);
            C18644n.m98531l().m98540I(this.f62403b.f42434r);
            String str2 = this.f62403b.f42434r;
            AbstractC19074t.m100207e(str2, "uid");
            c28203u6.m141804B(str2, 0);
            if (m153138j == null && m98552o != null) {
                C7960e.m41971c6().m42221O7(m98552o, false);
            }
            C21927m.m114302u().m114350o0(this.f62403b.f42434r);
            if (C7960e.m41971c6().m42096D9(this.f62403b.f42434r)) {
                ArrayList arrayList = new ArrayList();
                String str3 = this.f62403b.f42434r;
                AbstractC19074t.m100207e(str3, "uid");
                arrayList.add(Integer.valueOf(Integer.parseInt(str3)));
                C21927m.m114302u().m114338i0(arrayList);
            }
            if (!AbstractC25495a.m132084i(this.f62403b.f42434r) && AbstractC21935u.m114515E(this.f62403b.f42434r)) {
                C0872f m120562A = AbstractC23306f.m120562A();
                String str4 = this.f62403b.f42434r;
                AbstractC19074t.m100207e(str4, "uid");
                if (m120562A.m2529X(str4)) {
                    C7959d m41850e = C7959d.Companion.m41850e();
                    String str5 = this.f62403b.f42434r;
                    AbstractC19074t.m100207e(str5, "uid");
                    m41850e.m41774b3(str5, 2);
                }
            }
            Map map = AbstractC23304d.f113421p;
            AbstractC19074t.m100207e(map, "mapRecentClickUids");
            ContactProfile contactProfile = this.f62403b;
            synchronized (map) {
                try {
                    if (map.containsKey(contactProfile.f42434r)) {
                        C7960e.m41971c6().m42376e4(contactProfile.f42434r);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            AbstractC21935u.m114533W(this.f62403b.f42434r, -1, "");
            AbstractC23059e9.m118317F(this.f62403b.f42434r);
            C21927m.m114302u().m114352p0(this.f62403b.f42434r);
            C7960e.m41971c6().m42099Dc(this.f62403b.f42434r);
            AbstractC0852x.m2332I(this.f62403b.f42434r);
            if (this.f62404c) {
                AbstractC0852x.m2355l(ManageGroupView.this.f72421L0.getContext(), this.f62403b.f42455y, new SensitiveData("phonebook_delete_in_csc_personal_setting", "phonebook_delete", null, 4, null));
            }
            ManageGroupView.this.m66487EO();
            C19669z.Companion.m103232a().m103198O0();
            C23744a.Companion.m124119a().m124116d(6078, new Object[0]);
            C21920f.m114270a().m114272c(this.f62403b.f42434r);
            if (ManageGroupView.this.m92676n2() != null) {
                Handler handler = ((CommonZaloview) ManageGroupView.this).f72827B0;
                final ManageGroupView manageGroupView = ManageGroupView.this;
                handler.post(new Runnable() { // from class: g70.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ManageGroupView.C11988m.m66607d(ManageGroupView.this);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$n */
    /* loaded from: classes5.dex */
    public static final class C11989n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f62405q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11989n(ZaloView zaloView) {
            super(0);
            this.f62405q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f62405q;
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$o */
    /* loaded from: classes5.dex */
    public static final class C11990o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f62406q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11990o(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f62406q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f62406q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$p */
    /* loaded from: classes5.dex */
    public static final class C11991p extends AbstractC19075u implements InterfaceC18505l {
        C11991p() {
            super(1);
        }

        /* renamed from: a */
        public final void m66610a(boolean z11) {
            if (z11) {
                ManageGroupView.this.f72421L0.mo46829Y();
            } else {
                ManageGroupView.this.f72421L0.mo49315c4();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m66610a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$q */
    /* loaded from: classes5.dex */
    public static final class C11992q extends AbstractC19075u implements InterfaceC18505l {
        C11992q() {
            super(1);
        }

        /* renamed from: a */
        public final void m66611a(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "it");
            ManageGroupView.this.m66487EO();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m66611a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$r */
    /* loaded from: classes5.dex */
    public static final class C11993r implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C24275a f62409a;

        /* renamed from: b */
        final /* synthetic */ ManageGroupView f62410b;

        C11993r(C24275a c24275a, ManageGroupView manageGroupView) {
            this.f62409a = c24275a;
            this.f62410b = manageGroupView;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            this.f62410b.mo49315c4();
            this.f62410b.f62389u1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            C0804b.m2025g().m2029b(this.f62409a);
            C23744a.Companion.m124119a().m124116d(119, new Object[0]);
            this.f62410b.mo49315c4();
            this.f62410b.f62389u1 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.group.manage.ManageGroupView$s */
    /* loaded from: classes5.dex */
    static final class C11994s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11994s f62411q = new C11994s();

        C11994s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C17573b.a();
        }
    }

    /* renamed from: AN */
    private final ManageGroupAdapter.C6976c m66474AN(C24275a c24275a, boolean z11) {
        boolean z12;
        Integer num;
        String str;
        if (c24275a != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(23, AbstractC8020f0.str_notify_mention_v2, false);
        if (z12) {
            if (c24275a != null) {
                num = Integer.valueOf(c24275a.m126770g());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 3) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_me_and_everyone_v2);
                AbstractC19074t.m100207e(str, "getString(...)");
            } else if (num != null && num.intValue() == 2) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_me_v2);
                AbstractC19074t.m100207e(str, "getString(...)");
            } else if (num != null && num.intValue() == 1) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_off_v2);
                AbstractC19074t.m100207e(str, "getString(...)");
            } else {
                str = "";
            }
            c6979f.f38163e = str;
            c6979f.m35760m(true);
        } else {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_notify_mention);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            c6979f.f38163e = m118743r0;
        }
        c6979f.f38166h = z11;
        return c6979f;
    }

    /* renamed from: AO */
    private final void m66475AO() {
        m66502LN().m93586S().m9219j(this, new C19965d(new C11991p()));
    }

    /* renamed from: BN */
    private final ManageGroupAdapter.C6976c m66477BN(C24275a c24275a, boolean z11) {
        boolean z12;
        String str;
        if (c24275a != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(21, AbstractC8020f0.str_notify_new_msg_text_v2, !z12);
        c6979f.f38166h = z11;
        if (c24275a != null && c24275a.m126772i()) {
            str = AbstractC19620d0.m102702v(c24275a, false);
        } else {
            str = "";
        }
        c6979f.f38163e = str;
        return c6979f;
    }

    /* renamed from: BO */
    private final void m66478BO() {
        m66475AO();
        m66481CO();
    }

    /* renamed from: CN */
    private final ManageGroupAdapter.C6976c m66480CN(boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(29, AbstractC8020f0.str_setting_new_photo_suggest_title, AbstractC0924m0.m4046na());
        c6979f.f38166h = z11;
        return c6979f;
    }

    /* renamed from: CO */
    private final void m66481CO() {
        m66502LN().m93587T().m9219j(this, new C19965d(new C11992q()));
    }

    /* renamed from: DN */
    private final ManageGroupAdapter.C6976c m66483DN(boolean z11) {
        int i11;
        boolean m121048If = AbstractC23309i.m121048If();
        if (AbstractC26689j.m137085L()) {
            i11 = AbstractC8020f0.setting_photo_and_video_hd_title;
        } else {
            i11 = AbstractC8020f0.str_recommend_send_photo_hd_title;
        }
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(24, i11, m121048If);
        c6979f.f38166h = z11;
        return c6979f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DO */
    public final void m66484DO() {
        try {
            Conversation conversation = this.f62364V0;
            if (conversation != null) {
                if (C0804b.m2025g().m2033i(conversation.f42893q)) {
                    m66581sO(conversation);
                } else {
                    showDialog(4);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: EN */
    private final ManageGroupAdapter.C6976c m66486EN(boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(28, AbstractC8020f0.str_setting_save_media_captured_by_zalo_camera_title, AbstractC0924m0.m4076oa());
        c6979f.f38166h = z11;
        return c6979f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EO */
    public final void m66487EO() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: g70.a
            @Override // java.lang.Runnable
            public final void run() {
                ManageGroupView.m66490FO(ManageGroupView.this);
            }
        });
    }

    /* renamed from: FN */
    private final ManageGroupAdapter.C6976c m66489FN(boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(16, AbstractC8020f0.str_create_shortcut_mini_chat, false);
        c6979f.f38166h = z11;
        return c6979f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FO */
    public static final void m66490FO(final ManageGroupView manageGroupView) {
        AbstractC19074t.m100208f(manageGroupView, "this$0");
        manageGroupView.f62366X0 = C0943w.m4462l().m4472f(manageGroupView.f62362T0);
        manageGroupView.f72827B0.post(new Runnable() { // from class: g70.h
            @Override // java.lang.Runnable
            public final void run() {
                ManageGroupView.m66493GO(ManageGroupView.this);
            }
        });
    }

    /* renamed from: GN */
    private final C30066u7 m66492GN() {
        C30066u7 c30066u7 = this.f62359Q0;
        AbstractC19074t.m100205c(c30066u7);
        return c30066u7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GO */
    public static final void m66493GO(ManageGroupView manageGroupView) {
        int i11;
        int i12;
        ZaloView m92993D0;
        AbstractC19074t.m100208f(manageGroupView, "this$0");
        C31973j5 c31973j5 = manageGroupView.f62366X0;
        if (c31973j5 != null && c31973j5.m153747Y()) {
            i11 = AbstractC8020f0.str_action_bar_title_community_settings;
        } else {
            i11 = AbstractC8020f0.str_other_setting_group_v2;
        }
        ZdsActionBar m87077NK = manageGroupView.m87077NK();
        if (m87077NK != null) {
            if (manageGroupView.f62369a1 != 53) {
                i11 = AbstractC8020f0.str_other_setting_personal;
            }
            String m118743r0 = AbstractC23136l9.m118743r0(i11);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m87077NK.setMiddleTitle(m118743r0);
        }
        manageGroupView.f62365W0.clear();
        C31973j5 c31973j52 = manageGroupView.f62366X0;
        if (manageGroupView.f62369a1 == 52) {
            Conversation conversation = manageGroupView.f62364V0;
            if (!manageGroupView.f62370b1) {
                manageGroupView.m66541fN(manageGroupView.f62365W0, c31973j52);
                manageGroupView.m66533bN(manageGroupView.f62365W0, conversation);
                manageGroupView.m66544gN(manageGroupView.f62365W0, conversation);
            }
        } else if (c31973j52 != null && c31973j52.m153742T()) {
            manageGroupView.m66539eN(manageGroupView.f62365W0, c31973j52);
            manageGroupView.m66537dN(manageGroupView.f62365W0, c31973j52);
            manageGroupView.m66535cN(manageGroupView.f62365W0, c31973j52);
        } else {
            if (c31973j52 != null) {
                C31973j5 c31973j53 = manageGroupView.f62366X0;
                if (c31973j53 != null && c31973j53.m153747Y()) {
                    i12 = AbstractC8020f0.str_toast_lost_access_manage_community_settings;
                } else {
                    i12 = AbstractC8020f0.str_toast_lost_access_manage_group_settings;
                }
                ToastUtils.showMess(true, AbstractC23136l9.m118743r0(i12));
                C17487o0 m92662fJ = manageGroupView.m92662fJ();
                if (m92662fJ != null && (m92993D0 = m92662fJ.m92993D0(ZdsModalBottomSheet.class)) != null) {
                    m92993D0.finish();
                }
            }
            manageGroupView.finish();
        }
        ManageGroupAdapter manageGroupAdapter = manageGroupView.f62360R0;
        if (manageGroupAdapter != null) {
            manageGroupAdapter.m35740P(manageGroupView.f62365W0);
        }
        manageGroupView.m66587uO();
        manageGroupView.m66550iN();
    }

    /* renamed from: HO */
    private final void m66495HO(C24275a c24275a) {
        if (this.f62389u1) {
            return;
        }
        this.f62389u1 = true;
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11993r(c24275a, this));
        c0766k.mo1527R9(c24275a);
    }

    /* renamed from: IN */
    private final Rect m66497IN(int i11, int i12) {
        View view;
        View view2;
        if (i11 < 0 || i12 < 0) {
            return null;
        }
        try {
            Rect rect = new Rect();
            RecyclerView recyclerView = m66492GN().f139563q;
            AbstractC19074t.m100207e(recyclerView, "contentRecycleView");
            RecyclerView.AbstractC1888o layoutManager = m66492GN().f139563q.getLayoutManager();
            int[] iArr = new int[2];
            recyclerView.getLocationOnScreen(iArr);
            int i13 = iArr[0];
            int i14 = iArr[1];
            int left = (i13 - recyclerView.getLeft()) + recyclerView.getRight();
            int top = (iArr[1] - recyclerView.getTop()) + recyclerView.getBottom();
            if (layoutManager != null) {
                view = layoutManager.mo9732P(i11);
            } else {
                view = null;
            }
            if (layoutManager != null) {
                view2 = layoutManager.mo9732P(i12);
            } else {
                view2 = null;
            }
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                int i15 = iArr2[0];
                rect.left = i15;
                rect.top = iArr2[1];
                rect.right = (i15 - view.getLeft()) + view.getRight();
            } else {
                if (view2 == null) {
                    return null;
                }
                rect.left = i13;
                rect.top = i14;
                rect.right = left;
            }
            if (view2 != null) {
                int[] iArr3 = new int[2];
                view2.getLocationOnScreen(iArr3);
                rect.bottom = (iArr3[1] - view2.getTop()) + view2.getBottom();
            } else {
                rect.bottom = top;
            }
            if (rect.left < i13) {
                rect.left = i13;
            }
            if (rect.top < i14) {
                rect.top = i14;
            }
            if (rect.right > left) {
                rect.right = left;
            }
            if (rect.bottom > top) {
                rect.bottom = top;
            }
            return rect;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: KN */
    private final int m66500KN(int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                return 4;
            }
            if (i11 == 3) {
                return 5;
            }
            if (i11 == 4) {
                return 2;
            }
            if (i11 == 9) {
                return 6;
            }
            if (i11 == 20) {
                return 9;
            }
            if (i11 == 27) {
                return 10;
            }
            if (i11 == 30) {
                return 12;
            }
            if (i11 != 11) {
                return i11 != 12 ? -1 : 7;
            }
            return 8;
        }
        return 1;
    }

    /* renamed from: LN */
    private final C17573b m66502LN() {
        return (C17573b) this.f62358P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MN */
    public final void m66504MN() {
        C31973j5 c31973j5 = this.f62366X0;
        if (c31973j5 != null && c31973j5.m153750a0()) {
            ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_e2ee_msg_history_not_available));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NN */
    public final void m66506NN() {
        C31973j5 c31973j5 = this.f62366X0;
        if (c31973j5 != null && c31973j5.m153742T()) {
            AbstractC23647d.m123897g("1591029");
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                Bundle m79877a = GroupAdminMemberView.Companion.m79877a(AbstractC23136l9.m118743r0(AbstractC8020f0.str_chat_group_member_title));
                m79877a.putString("extra_group_id", this.f62362T0);
                m79877a.putBoolean("bol_extra_show_admin_only", true);
                C24848g0 c24848g0 = C24848g0.f119245a;
                m92662fJ.m93066i2(GroupAdminMemberView.class, m79877a, 0, 1, true);
                return;
            }
            return;
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_privileges_admin_expire));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ON */
    public final void m66508ON() {
        C31973j5 c31973j5 = this.f62366X0;
        if (c31973j5 != null && c31973j5.m153742T()) {
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_group_id", this.f62362T0);
                C24848g0 c24848g0 = C24848g0.f119245a;
                m92662fJ.m93069k2(GroupBlockedMemberView.class, bundle, 1, true);
            }
            AbstractC23647d.m123897g("1591043");
            return;
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_privileges_admin_expire));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PN */
    public final void m66510PN() {
        C31973j5 c31973j5 = this.f62366X0;
        if (c31973j5 != null && c31973j5.m153742T()) {
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_group_id", this.f62362T0);
                C24848g0 c24848g0 = C24848g0.f119245a;
                m92662fJ.m93069k2(GroupBlockedMemberView.class, bundle, 1, true);
                return;
            }
            return;
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_privileges_admin_expire));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QN */
    public final void m66512QN(boolean z11) {
        Conversation conversation = this.f62364V0;
        if (conversation != null && C23055e5.m118272g(true)) {
            if (z11) {
                m66529ZM(conversation.f42893q);
            } else {
                m66578rO(conversation.f42893q);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RN */
    public final void m66514RN() {
        AbstractC23647d.m123897g("1591061");
        this.f72421L0.showDialog(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SN */
    public final void m66516SN() {
        InterfaceC11977b interfaceC11977b = this.f62368Z0;
        if (interfaceC11977b != null) {
            interfaceC11977b.mo60338c();
            AbstractC28025b8.m141442M("tip.csc.rightmenu.createshortcutcall");
            m66487EO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TN */
    public final void m66518TN() {
        InterfaceC11977b interfaceC11977b = this.f62368Z0;
        if (interfaceC11977b != null) {
            interfaceC11977b.mo60336a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UN */
    public final void m66520UN() {
        showDialog(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VN */
    public final void m66522VN() {
        AbstractC23647d.m123897g("1591059");
        this.f72421L0.showDialog(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WN */
    public final void m66524WN(boolean z11) {
        if (z11) {
            this.f72421L0.showDialog(8);
        } else {
            this.f72421L0.showDialog(7);
        }
        AbstractC23647d.m123897g("1591028");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XN */
    public final void m66526XN() {
        C31973j5 c31973j5 = this.f62366X0;
        if (c31973j5 != null && c31973j5.m153742T()) {
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_group_id", c31973j5.m153781r());
                bundle.putBoolean("BOL_EXTRA_IS_GROUP_OWNER", c31973j5.m153778p0());
                C24848g0 c24848g0 = C24848g0.f119245a;
                m92662fJ.m93069k2(ManageGroupLinkView.class, bundle, 1, true);
            }
            AbstractC23647d.m123897g("10300102");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YN */
    public final void m66528YN(int i11, boolean z11) {
        m66554jO(i11, z11);
        AbstractC23647d.m123897g("1591027");
    }

    /* renamed from: ZM */
    private final void m66529ZM(String str) {
        String str2 = "[" + str + "]";
        if (this.f62386r1) {
            return;
        }
        this.f62386r1 = true;
        this.f62387s1.mo1704o8(this.f62388t1);
        this.f62387s1.mo1481M3(str2, new TrackingSource(106));
        this.f72421L0.mo46829Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZN */
    public final void m66530ZN(int i11, boolean z11) {
        this.f62375g1 = i11;
        boolean z12 = true;
        this.f62376h1 = !z11;
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null && m92674mJ() && !m92681pJ()) {
            Bundle m78535kL = BottomPickerView.m78535kL();
            C31973j5 c31973j5 = this.f62366X0;
            if (c31973j5 == null || !c31973j5.m153747Y()) {
                z12 = false;
            }
            m78535kL.putBoolean("EXTRA_IS_COMMUNITY", z12);
            ManageMemberPermissionSettingBottomSheet.C11898a c11898a = ManageMemberPermissionSettingBottomSheet.Companion;
            AbstractC19074t.m100205c(m78535kL);
            c11898a.m66151a(m78535kL, this.f62376h1, i11, "gr_settings");
            m92662fJ.mo89694j2(ManageMemberPermissionSettingBottomSheet.class, m78535kL, 3, "ManageMemberPermissionSettingBottomSheet", 2, true);
        }
    }

    /* renamed from: aN */
    private final void m66531aN(C24275a c24275a) {
        if (this.f62389u1) {
            return;
        }
        mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11978c(c24275a));
        this.f62389u1 = true;
        c0766k.mo1652h7(c24275a, new MuteTrackingSource(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aO */
    public final void m66532aO() {
        C31973j5 c31973j5 = this.f62366X0;
        if (c31973j5 != null && c31973j5.m153742T()) {
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_group_id", this.f62362T0);
                C24848g0 c24848g0 = C24848g0.f119245a;
                m92662fJ.m93066i2(ManageMembersView.class, bundle, 0, 1, true);
                return;
            }
            return;
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_privileges_admin_expire));
    }

    /* renamed from: bN */
    private final void m66533bN(ArrayList arrayList, Conversation conversation) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_app);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        boolean z16 = true;
        arrayList.add(new ManageGroupAdapter.C6978e(m118743r0, true));
        int size = arrayList.size();
        if (C26444a.m136319a().m136320b() && !AbstractC23059e9.m118341t() && conversation != null && conversation.f42893q.length() > 0 && AbstractC21935u.m114554u(conversation.f42893q) && (this.f62363U0.length() == 0 || !C21927m.m114302u().m114345m(this.f62363U0))) {
            if (arrayList.size() == size) {
                z15 = true;
            } else {
                z15 = false;
            }
            arrayList.add(m66556kN(z15));
        }
        if (AbstractC23309i.m121122Kf() && !AbstractC23059e9.m118341t() && (this.f62363U0.length() == 0 || !C21927m.m114302u().m114345m(this.f62363U0))) {
            if (arrayList.size() == size) {
                z14 = true;
            } else {
                z14 = false;
            }
            arrayList.add(m66489FN(z14));
        }
        if (AbstractC19646n0.m103025s(this.f72421L0)) {
            if (arrayList.size() == size) {
                z13 = true;
            } else {
                z13 = false;
            }
            arrayList.add(m66574qN(z13));
        }
        if (AbstractC23309i.m121376Ra() > 0) {
            if (arrayList.size() == size) {
                z12 = true;
            } else {
                z12 = false;
            }
            arrayList.add(m66483DN(z12));
        }
        if (arrayList.size() == size) {
            z11 = true;
        } else {
            z11 = false;
        }
        arrayList.add(m66486EN(z11));
        if (AbstractC23306f.m120562A().m2511B().m2720i()) {
            if (arrayList.size() != size) {
                z16 = false;
            }
            arrayList.add(m66480CN(z16));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bO */
    public final void m66534bO() {
        C31973j5 c31973j5 = this.f62366X0;
        if (c31973j5 != null && c31973j5.m153742T()) {
            AbstractC23647d.m123897g("1591033");
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_group_id", this.f62362T0);
                C24848g0 c24848g0 = C24848g0.f119245a;
                m92662fJ.m93066i2(GroupMemApprovalView.class, bundle, 1, 1, true);
                return;
            }
            return;
        }
        ToastUtils.showMess(m92652XI(AbstractC8020f0.str_error_privileges_admin_expire));
    }

    /* renamed from: cN */
    private final void m66535cN(ArrayList arrayList, C31973j5 c31973j5) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_membership_rights_header);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        boolean z17 = true;
        arrayList.add(new ManageGroupAdapter.C6978e(m118743r0, true));
        int size = arrayList.size();
        if (C30202c.f140315a.m148952c(c31973j5)) {
            if (arrayList.size() == size) {
                z16 = true;
            } else {
                z16 = false;
            }
            arrayList.add(m66589vN(c31973j5, z16));
        }
        if (arrayList.size() == size) {
            z11 = true;
        } else {
            z11 = false;
        }
        arrayList.add(m66577rN(c31973j5, z11));
        if (AbstractC23309i.m121740b3() == 1) {
            if (arrayList.size() == size) {
                z15 = true;
            } else {
                z15 = false;
            }
            arrayList.add(m66594xN(c31973j5, z15));
        }
        if (arrayList.size() == size) {
            z12 = true;
        } else {
            z12 = false;
        }
        arrayList.add(m66586uN(c31973j5, z12));
        if (arrayList.size() == size) {
            z13 = true;
        } else {
            z13 = false;
        }
        arrayList.add(m66583tN(c31973j5, z13));
        if (arrayList.size() == size) {
            z14 = true;
        } else {
            z14 = false;
        }
        arrayList.add(m66580sN(c31973j5, z14));
        if (arrayList.size() != size) {
            z17 = false;
        }
        arrayList.add(m66592wN(c31973j5, z17));
        if (c31973j5.m153778p0()) {
            arrayList.add(m66565nN(c31973j5.m153747Y()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cO */
    public final void m66536cO() {
        InterfaceC11977b interfaceC11977b = this.f62368Z0;
        if (interfaceC11977b != null) {
            interfaceC11977b.mo60341g4();
            m66487EO();
        }
    }

    /* renamed from: dN */
    private final void m66537dN(ArrayList arrayList, C31973j5 c31973j5) {
        boolean z11;
        boolean z12;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_member_setting_header_v3);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        boolean z13 = true;
        arrayList.add(new ManageGroupAdapter.C6978e(m118743r0, true));
        int size = arrayList.size();
        if (arrayList.size() == size) {
            z11 = true;
        } else {
            z11 = false;
        }
        arrayList.add(m66596yN(z11));
        if (arrayList.size() == size) {
            z12 = true;
        } else {
            z12 = false;
        }
        arrayList.add(m66599zN(c31973j5, z12));
        if (c31973j5.m153778p0() && c31973j5.m153732O() > 1) {
            boolean m153747Y = c31973j5.m153747Y();
            if (arrayList.size() != size) {
                z13 = false;
            }
            arrayList.add(m66559lN(m153747Y, z13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dO */
    public final void m66538dO() {
        if (C0804b.m2025g().m2032f(this.f62363U0) != null) {
            showDialog(5);
        } else {
            ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_notify_mention_setting));
        }
    }

    /* renamed from: eN */
    private final void m66539eN(ArrayList arrayList, C31973j5 c31973j5) {
        boolean z11;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_message_setting_header);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        boolean z12 = false;
        arrayList.add(new ManageGroupAdapter.C6978e(m118743r0, false));
        int size = arrayList.size();
        if (arrayList.size() == size) {
            z11 = true;
        } else {
            z11 = false;
        }
        arrayList.add(m66571pN(c31973j5, z11));
        if (arrayList.size() == size) {
            z12 = true;
        }
        arrayList.add(m66568oN(c31973j5, z12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eO */
    public final void m66540eO() {
        C31973j5 c31973j5 = this.f62366X0;
        if (c31973j5 != null && c31973j5.m153742T()) {
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_group_id", this.f62362T0);
                C24848g0 c24848g0 = C24848g0.f119245a;
                m92662fJ.m93066i2(GroupMemApprovalView.class, bundle, 1036, 1, true);
                return;
            }
            return;
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_privileges_admin_expire));
    }

    /* renamed from: fN */
    private final void m66541fN(ArrayList arrayList, C31973j5 c31973j5) {
        boolean z11;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_notification_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        boolean z12 = false;
        arrayList.add(new ManageGroupAdapter.C6978e(m118743r0, false));
        int size = arrayList.size();
        C24275a m2032f = C0804b.m2025g().m2032f(this.f62363U0);
        if (arrayList.size() == size) {
            z11 = true;
        } else {
            z11 = false;
        }
        arrayList.add(m66477BN(m2032f, z11));
        if (c31973j5 != null) {
            if (arrayList.size() == size) {
                z12 = true;
            }
            arrayList.add(m66474AN(m2032f, z12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fO */
    public final void m66542fO() {
        InterfaceC11977b interfaceC11977b = this.f62368Z0;
        if (interfaceC11977b != null) {
            interfaceC11977b.mo60337b();
            m66487EO();
        }
    }

    /* renamed from: gN */
    private final void m66544gN(ArrayList arrayList, Conversation conversation) {
        if (conversation != null && conversation.f42893q.length() > 0 && this.f62363U0.length() > 0 && this.f62366X0 == null && !AbstractC21935u.m114515E(conversation.f42893q)) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.privatesetting_title);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            boolean z11 = true;
            arrayList.add(new ManageGroupAdapter.C6978e(m118743r0, true));
            if (arrayList.size() != arrayList.size()) {
                z11 = false;
            }
            arrayList.add(m66553jN(conversation, z11));
            arrayList.add(m66562mN());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gO */
    public final void m66545gO() {
        InterfaceC11977b interfaceC11977b = this.f62368Z0;
        if (interfaceC11977b != null) {
            interfaceC11977b.mo60342i4();
            m66487EO();
        }
    }

    /* renamed from: hN */
    private final void m66547hN(String str, String str2) {
        if (str.length() == 0 || str2.length() == 0 || this.f62374f1) {
            return;
        }
        this.f62374f1 = true;
        this.f72421L0.mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11980e());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("srcType", 0);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        c0766k.mo1492N6(jSONObject.toString(), str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hO */
    public final void m66548hO() {
        InterfaceC11977b interfaceC11977b = this.f62368Z0;
        if (interfaceC11977b != null) {
            interfaceC11977b.mo60340e();
            m66487EO();
        }
    }

    /* renamed from: iN */
    private final void m66550iN() {
        this.f62373e1 = "";
    }

    /* renamed from: iO */
    private final void m66551iO() {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11982g());
        c0766k.mo1541T7(this.f62362T0);
    }

    /* renamed from: jN */
    private final ManageGroupAdapter.C6976c m66553jN(Conversation conversation, boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(17, AbstractC8020f0.str_csc_block_timeline, C21912a.m114159g().m114169j(conversation.f42893q));
        c6979f.f38166h = z11;
        return c6979f;
    }

    /* renamed from: jO */
    private final void m66554jO(int i11, boolean z11) {
        int i12;
        C31973j5 c31973j5 = this.f62366X0;
        if (c31973j5 != null) {
            i12 = c31973j5.m153713E();
        } else {
            i12 = 0;
        }
        if (i11 == 9 && !z11 && i12 > 0) {
            this.f72421L0.showDialog(2);
            return;
        }
        if (i11 == 15) {
            InterfaceC11977b interfaceC11977b = this.f62368Z0;
            if (interfaceC11977b != null) {
                interfaceC11977b.mo60340e();
                m66487EO();
                return;
            }
            return;
        }
        m66502LN().m93588V(this.f62362T0, m66500KN(i11), z11);
    }

    /* renamed from: kN */
    private final ManageGroupAdapter.C6976c m66556kN(boolean z11) {
        int i11 = 0;
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(19, AbstractC8020f0.str_create_shortcut_call_icon, false);
        c6979f.f38166h = z11;
        C28212v6 m141453i = AbstractC28025b8.m141453i("tip.csc.rightmenu.createshortcutcall");
        if (m141453i != null && (m141453i.f131579e || m141453i.f131580f)) {
            i11 = 1;
        }
        c6979f.m35762o(i11);
        return c6979f;
    }

    /* renamed from: kO */
    public static final ManageGroupView m66557kO(String str, Conversation conversation, InterfaceC11977b interfaceC11977b, int i11, String str2, String str3, String str4) {
        return Companion.m66605a(str, conversation, interfaceC11977b, i11, str2, str3, str4);
    }

    /* renamed from: lN */
    private final ManageGroupAdapter.C6976c m66559lN(boolean z11, boolean z12) {
        int i11;
        if (z11) {
            i11 = AbstractC8020f0.str_community_settings_change_community_owner;
        } else {
            i11 = AbstractC8020f0.str_group_change_owner;
        }
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(25, i11, false);
        c6979f.f38166h = z12;
        c6979f.m35747c("change_group_owner");
        return c6979f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lO */
    public static final void m66560lO(ManageGroupView manageGroupView, View view) {
        AbstractC19074t.m100208f(manageGroupView, "this$0");
        CheckBox checkBox = manageGroupView.f62377i1;
        if (checkBox != null) {
            checkBox.performClick();
        }
    }

    /* renamed from: mN */
    private final ManageGroupAdapter.C6976c m66562mN() {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(18, AbstractC8020f0.str_tv_delfriend, false);
        c6979f.f38166h = false;
        c6979f.m35759l(false);
        return c6979f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mO */
    public static final void m66563mO(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: nN */
    private final ManageGroupAdapter.C6976c m66565nN(boolean z11) {
        int i11;
        if (z11) {
            i11 = AbstractC8020f0.str_community_settings_delete_community;
        } else {
            i11 = AbstractC8020f0.str_group_disband;
        }
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(7, i11, false);
        c6979f.f38166h = false;
        c6979f.m35759l(false);
        c6979f.m35747c("disband_group");
        return c6979f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nO */
    public static final void m66566nO(ManageGroupView manageGroupView, InterfaceC17463d interfaceC17463d, int i11) {
        ContactProfile contactProfile;
        boolean z11;
        AbstractC19074t.m100208f(manageGroupView, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        Conversation conversation = manageGroupView.f62364V0;
        if (conversation != null) {
            contactProfile = conversation.m40998a();
        } else {
            contactProfile = null;
        }
        CheckBox checkBox = manageGroupView.f62377i1;
        if (checkBox != null) {
            z11 = checkBox.isChecked();
        } else {
            z11 = false;
        }
        manageGroupView.m66584tO(contactProfile, z11);
    }

    /* renamed from: oN */
    private final ManageGroupAdapter.C6976c m66568oN(C31973j5 c31973j5, boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(3, AbstractC8020f0.str_setting_chat_history_v2, c31973j5.m153751b0());
        c6979f.f38166h = z11;
        c6979f.m35747c("enable_message_history");
        if (C31986k3.f147083a.m154108R1(c31973j5.m153730N()) && !c31973j5.m153751b0()) {
            c6979f.m35760m(false);
        }
        return c6979f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oO */
    public static final void m66569oO(SimpleAdapter simpleAdapter, int i11, C24275a c24275a, ManageGroupView manageGroupView, InterfaceC17463d interfaceC17463d, int i12) {
        AbstractC19074t.m100208f(simpleAdapter, "$simpleAdapter");
        AbstractC19074t.m100208f(c24275a, "$muteItem");
        AbstractC19074t.m100208f(manageGroupView, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        Object item = simpleAdapter.getItem(i12);
        AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
        Object obj = ((HashMap) item).get("id");
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        if (i11 != intValue) {
            C24275a clone = c24275a.clone();
            clone.m126777n(intValue);
            AbstractC19074t.m100205c(clone);
            manageGroupView.m66495HO(clone);
        }
    }

    /* renamed from: pN */
    private final ManageGroupAdapter.C6976c m66571pN(C31973j5 c31973j5, boolean z11) {
        int i11;
        if (c31973j5.m153747Y()) {
            i11 = AbstractC8020f0.str_community_settings_highlight_messages_from_owner;
        } else {
            i11 = AbstractC8020f0.str_setting_highlight_admin_msg_v2;
        }
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(4, i11, c31973j5.m153753c0());
        c6979f.f38166h = z11;
        c6979f.m35747c("highlight_admin_message");
        return c6979f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pO */
    public static final void m66572pO(ManageGroupView manageGroupView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(manageGroupView, "this$0");
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        interfaceC17463d.dismiss();
        manageGroupView.m66502LN().m93588V(manageGroupView.f62362T0, manageGroupView.m66500KN(3), false);
    }

    /* renamed from: qN */
    private final ManageGroupAdapter.C6976c m66574qN(boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(15, AbstractC8020f0.str_general_setting_show_emoji_title, AbstractC23309i.m121220N2());
        c6979f.f38166h = z11;
        return c6979f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qO */
    public static final void m66575qO(ManageGroupView manageGroupView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(manageGroupView, "this$0");
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        interfaceC17463d.dismiss();
        manageGroupView.m66554jO(3, true);
    }

    /* renamed from: rN */
    private final ManageGroupAdapter.C6976c m66577rN(C31973j5 c31973j5, boolean z11) {
        int i11;
        if (c31973j5.m153747Y()) {
            i11 = AbstractC8020f0.str_community_settings_right_to_edit_info;
        } else {
            i11 = AbstractC8020f0.str_setting_change_group_information_v2;
        }
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(0, i11, c31973j5.m153761g0());
        c6979f.f38166h = z11;
        c6979f.m35747c("right_to_change_group_info");
        return c6979f;
    }

    /* renamed from: rO */
    private final void m66578rO(String str) {
        if (this.f62382n1) {
            return;
        }
        this.f62382n1 = true;
        this.f62383o1 = str;
        this.f62384p1.mo1704o8(this.f62385q1);
        this.f62384p1.mo1466K4(str, new TrackingSource(105));
        this.f72421L0.mo46829Y();
    }

    /* renamed from: sN */
    private final ManageGroupAdapter.C6976c m66580sN(C31973j5 c31973j5, boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(1, AbstractC8020f0.str_setting_pin_message_v2, c31973j5.m153763h0());
        c6979f.m35747c("right_to_pin_message");
        c6979f.f38166h = z11;
        return c6979f;
    }

    /* renamed from: sO */
    private final void m66581sO(Conversation conversation) {
        int i11;
        if (this.f62389u1) {
            return;
        }
        mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        if (conversation.m41013q()) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        String str = conversation.f42893q;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11987l(str));
        this.f62389u1 = true;
        c0766k.mo1413D8(i11, str, new MuteTrackingSource(5));
    }

    /* renamed from: tN */
    private final ManageGroupAdapter.C6976c m66583tN(C31973j5 c31973j5, boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(11, AbstractC8020f0.str_setting_create_poll_v2, c31973j5.m153757e0());
        c6979f.f38166h = z11;
        c6979f.m35747c("right_to_create_poll");
        return c6979f;
    }

    /* renamed from: tO */
    private final void m66584tO(ContactProfile contactProfile, boolean z11) {
        if (contactProfile == null) {
            return;
        }
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11988m(contactProfile, z11));
        c0766k.mo1791z6(contactProfile.f42434r, 25);
    }

    /* renamed from: uN */
    private final ManageGroupAdapter.C6976c m66586uN(C31973j5 c31973j5, boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(12, AbstractC8020f0.str_setting_create_post_v2, c31973j5.m153759f0());
        c6979f.f38166h = z11;
        c6979f.m35747c("right_to_create_note");
        return c6979f;
    }

    /* renamed from: uO */
    private final void m66587uO() {
        final int m35736L;
        int i11;
        ManageGroupAdapter manageGroupAdapter = this.f62360R0;
        RecyclerView.AbstractC1888o layoutManager = m66492GN().f139563q.getLayoutManager();
        if (manageGroupAdapter != null && layoutManager != null && this.f62373e1.length() > 0 && (m35736L = manageGroupAdapter.m35736L(this.f62373e1)) >= 0) {
            if (m35736L == manageGroupAdapter.mo10003k() - 1) {
                i11 = m35736L;
            } else {
                i11 = m35736L + 1;
            }
            layoutManager.mo9756v1(i11);
            this.f72827B0.postDelayed(new Runnable() { // from class: g70.i
                @Override // java.lang.Runnable
                public final void run() {
                    ManageGroupView.m66590vO(ManageGroupView.this, m35736L);
                }
            }, 200L);
        }
    }

    /* renamed from: vN */
    private final ManageGroupAdapter.C6976c m66589vN(C31973j5 c31973j5, boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(30, AbstractC8020f0.str_lock_view_members_setting_title, c31973j5.m153768k0());
        c6979f.f38166h = z11;
        c6979f.m35747c("right_to_view_member_list");
        return c6979f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vO */
    public static final void m66590vO(ManageGroupView manageGroupView, int i11) {
        AbstractC19074t.m100208f(manageGroupView, "this$0");
        manageGroupView.m66600zO(true, manageGroupView.m66497IN(i11, i11));
    }

    /* renamed from: wN */
    private final ManageGroupAdapter.C6976c m66592wN(C31973j5 c31973j5, boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(27, AbstractC8020f0.str_send_message_permission, c31973j5.m153764i0());
        c6979f.m35747c("right_to_send_message");
        c6979f.f38166h = z11;
        return c6979f;
    }

    /* renamed from: xN */
    private final ManageGroupAdapter.C6976c m66594xN(C31973j5 c31973j5, boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(20, AbstractC8020f0.str_set_nickname_permission, c31973j5.m153766j0());
        c6979f.f38166h = z11;
        return c6979f;
    }

    /* renamed from: yN */
    private final ManageGroupAdapter.C6976c m66596yN(boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(26, AbstractC8020f0.str_manage_members, false);
        c6979f.f38166h = z11;
        c6979f.m35747c("manage_member");
        return c6979f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yO */
    public final void m66597yO(int i11) {
        boolean z11;
        try {
            String str = this.f62363U0;
            if (this.f62362T0.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C24275a m103040w0 = AbstractC19646n0.m103040w0(i11, str, z11, 3);
            AbstractC19074t.m100207e(m103040w0, "getChatMuteSettingItem(...)");
            m66531aN(m103040w0);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: zN */
    private final ManageGroupAdapter.C6976c m66599zN(C31973j5 c31973j5, boolean z11) {
        ManageGroupAdapter.C6979f c6979f = new ManageGroupAdapter.C6979f(9, AbstractC8020f0.str_admin_tool_new_member_approval_v3, c31973j5.m153755d0(), C19637j.f97466a.m102827H(this.f62362T0));
        c6979f.m35761n(c31973j5.m153785t());
        c6979f.f38166h = z11;
        c6979f.m35747c("approve_new_member");
        return c6979f;
    }

    /* renamed from: zO */
    private final void m66600zO(boolean z11, Rect rect) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        try {
            if (z11 && rect != null) {
                if (this.f62361S0 == null) {
                    DimHightLightView dimHightLightView = new DimHightLightView(getContext());
                    this.f62361S0 = dimHightLightView;
                    dimHightLightView.setElevation(AbstractC23136l9.m118655I(AbstractC17454d.width_shadow_action_bar));
                }
                m66492GN().getRoot().addView(this.f62361S0, new ViewGroup.LayoutParams(-1, -1));
                DimHightLightView dimHightLightView2 = this.f62361S0;
                if (dimHightLightView2 != null) {
                    dimHightLightView2.setVisibility(0);
                }
                DimHightLightView dimHightLightView3 = this.f62361S0;
                if (dimHightLightView3 != null) {
                    dimHightLightView3.m75684i(rect, 1000L);
                }
                DimHightLightView dimHightLightView4 = this.f62361S0;
                if (dimHightLightView4 != null) {
                    dimHightLightView4.setAlpha(0.0f);
                }
                DimHightLightView dimHightLightView5 = this.f62361S0;
                if (dimHightLightView5 != null && (animate = dimHightLightView5.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(150L)) != null) {
                    duration.start();
                    return;
                }
                return;
            }
            DimHightLightView dimHightLightView6 = this.f62361S0;
            if (dimHightLightView6 != null) {
                dimHightLightView6.m75681c();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        boolean z11;
        int i11;
        String str;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (this.f62364V0 == null) {
                this.f62364V0 = (Conversation) m92642L3.getParcelable("state_chat_contact");
            }
            this.f62369a1 = m92642L3.getInt("other_setting_type", 52);
            this.f62370b1 = m92642L3.getBoolean("only_show_mute_section", false);
            String string = m92642L3.getString("extra_chat_id", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f62363U0 = string;
            String string2 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f62371c1 = string2;
            String string3 = m92642L3.getString("STR_LOG_CHAT_TYPE", "0");
            AbstractC19074t.m100207e(string3, "getString(...)");
            this.f62372d1 = string3;
            String string4 = m92642L3.getString("highlight_id", "");
            AbstractC19074t.m100207e(string4, "getString(...)");
            this.f62373e1 = string4;
        }
        boolean m132079d = AbstractC25495a.m132079d(this.f62363U0);
        if (this.f62369a1 == 52) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m132079d) {
            i11 = 5;
        } else {
            i11 = 1;
        }
        String str2 = this.f62371c1;
        if (z11) {
            str = "chat_settings";
        } else {
            str = "gr_settings";
        }
        C0815e1.m2075D().m2100V(new C23648e(i11, str2, 1, str, this.f62372d1), false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        int m127173b0;
        ContactProfile m40998a;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str = null;
        switch (i11) {
            case 1:
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                C8009j.a m43159h = aVar.m43159h(1);
                C31973j5 c31973j5 = this.f62366X0;
                if (c31973j5 != null && c31973j5 != null && c31973j5.m153747Y()) {
                    i12 = AbstractC8020f0.str_manage_group_confirm_community_disband_title;
                } else {
                    i12 = AbstractC8020f0.str_confirm_group_disband_title;
                }
                m43159h.m43172u(AbstractC23136l9.m118743r0(i12)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_group_disband_v2)).m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.str_btn_disband_group, this);
                return aVar.m43152a();
            case 2:
                int m102827H = C19637j.f97466a.m102827H(this.f62362T0);
                if (m102827H <= 0) {
                    return null;
                }
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_reject_all_join_pending_requests);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(m102827H)}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                aVar2.m43159h(4).m43162k(format).m43164m(AbstractC8020f0.str_no, this).m43169r(AbstractC8020f0.str_yes, this);
                return aVar2.m43152a();
            case 3:
                C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
                if (AbstractC23309i.m121566Wf()) {
                    try {
                        Conversation conversation = this.f62364V0;
                        if (conversation != null) {
                            String str2 = conversation.m40998a().f42455y;
                            AbstractC19074t.m100207e(str2, "phone");
                            if (str2.length() > 0) {
                                Context m92648SI = this.f72421L0.m92648SI();
                                AbstractC19074t.m100205c(m92648SI);
                                if (AbstractC23034c6.m118167n(m92648SI, AbstractC23034c6.f112032i) == 0 && C8937j0.m47663l("phonebook_delete_in_csc_personal_setting")) {
                                    C29704a2 m147706c = C29704a2.m147706c(LayoutInflater.from(this.f72421L0.getContext()), null, false);
                                    this.f62377i1 = m147706c.f137188q;
                                    C31901e8 m2800f = AbstractC0906d0.m2800f(this.f72421L0.getContext(), conversation.m40998a().f42455y);
                                    if (m2800f != null) {
                                        AbstractC19074t.m100205c(m2800f);
                                        String m153297j = m2800f.m153297j();
                                        AbstractC19074t.m100207e(m153297j, "getNumber(...)");
                                        if (m153297j.length() > 0) {
                                            C19067n0 c19067n02 = C19067n0.f94947a;
                                            String format2 = String.format("%s (%s)", Arrays.copyOf(new Object[]{m2800f.m153299q(), m2800f.m153297j()}, 2));
                                            AbstractC19074t.m100207e(format2, "format(...)");
                                            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_phone_number_in_contact);
                                            AbstractC19074t.m100207e(m118743r02, "getString(...)");
                                            String format3 = String.format(m118743r02, Arrays.copyOf(new Object[]{format2}, 1));
                                            AbstractC19074t.m100207e(format3, "format(...)");
                                            m127173b0 = AbstractC24342w.m127173b0(format3, format2, 0, false, 6, null);
                                            SpannableString spannableString = new SpannableString(format3);
                                            spannableString.setSpan(new StyleSpan(1), m127173b0, format2.length() + m127173b0, 33);
                                            m147706c.f137189r.setText(spannableString);
                                            m147706c.getRoot().setOnClickListener(new View.OnClickListener() { // from class: g70.b
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    ManageGroupView.m66560lO(ManageGroupView.this, view);
                                                }
                                            });
                                            aVar3.m43177z(m147706c.getRoot());
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                }
                C8009j.a m43159h2 = aVar3.m43159h(7);
                C19067n0 c19067n03 = C19067n0.f94947a;
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_delete_contact_dialog);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                Object[] objArr = new Object[1];
                Conversation conversation2 = this.f62364V0;
                if (conversation2 != null && (m40998a = conversation2.m40998a()) != null) {
                    str = m40998a.m40420o0();
                }
                objArr[0] = str;
                String format4 = String.format(m118743r03, Arrays.copyOf(objArr, 1));
                AbstractC19074t.m100207e(format4, "format(...)");
                m43159h2.m43162k(format4).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: g70.c
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i21) {
                        ManageGroupView.m66563mO(interfaceC17463d, i21);
                    }
                }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_delete_contact_dialog), new InterfaceC17463d.d() { // from class: g70.d
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i21) {
                        ManageGroupView.m66566nO(ManageGroupView.this, interfaceC17463d, i21);
                    }
                });
                C8009j m43152a = aVar3.m43152a();
                AbstractC19074t.m100207e(m43152a, "create(...)");
                m43152a.m92873y(false);
                return m43152a;
            case 4:
                Context m92648SI2 = this.f72421L0.m92648SI();
                AbstractC19074t.m100205c(m92648SI2);
                return AbstractC23116k0.m118580h(m92648SI2, false, new C11983h());
            case 5:
                final C24275a m2032f = C0804b.m2025g().m2032f(this.f62363U0);
                if (m2032f == null) {
                    return null;
                }
                final int m126770g = m2032f.m126770g();
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_off_v2));
                hashMap.put("id", 1);
                if (m126770g == 1) {
                    i13 = AbstractC16803z.btn_radio_on_holo_light;
                } else {
                    i13 = AbstractC16803z.btn_radio_off_holo_light;
                }
                hashMap.put("icon", Integer.valueOf(i13));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_me_v2));
                hashMap2.put("id", 2);
                if (m126770g == 2) {
                    i14 = AbstractC16803z.btn_radio_on_holo_light;
                } else {
                    i14 = AbstractC16803z.btn_radio_off_holo_light;
                }
                hashMap2.put("icon", Integer.valueOf(i14));
                HashMap hashMap3 = new HashMap();
                hashMap3.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_me_and_everyone_v2));
                hashMap3.put("id", 3);
                if (m126770g == 3) {
                    i15 = AbstractC16803z.btn_radio_on_holo_light;
                } else {
                    i15 = AbstractC16803z.btn_radio_off_holo_light;
                }
                hashMap3.put("icon", Integer.valueOf(i15));
                arrayList.add(hashMap);
                arrayList.add(hashMap2);
                arrayList.add(hashMap3);
                if (!arrayList.isEmpty()) {
                    C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
                    C29956o2 m148305c = C29956o2.m148305c(LayoutInflater.from(getContext()), null, false);
                    m148305c.f138850r.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_mention_v2));
                    m148305c.f138849q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_subtitle_notify_mention_dialog));
                    AbstractC19074t.m100207e(m148305c, "apply(...)");
                    aVar4.m43158g(m148305c.getRoot());
                    aVar4.m43155d(true);
                    final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.setting_notification_mention_menu_item, new String[]{"name", "icon"}, new int[]{AbstractC6918a0.tv_setting_item, AbstractC6918a0.ic_choose_or_not});
                    aVar4.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: g70.e
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i21) {
                            ManageGroupView.m66569oO(simpleAdapter, m126770g, m2032f, this, interfaceC17463d, i21);
                        }
                    });
                    return aVar4.m43152a();
                }
                break;
            case 6:
                C8009j.a aVar5 = new C8009j.a(this.f72421L0.m92648SI());
                C8009j.a m43159h3 = aVar5.m43159h(4);
                C31973j5 c31973j52 = this.f62366X0;
                if (c31973j52 != null && c31973j52.m153747Y()) {
                    i16 = AbstractC8020f0.str_community_change_owner_dialog_title;
                } else {
                    i16 = AbstractC8020f0.str_group_change_owner_dialog_title;
                }
                C8009j.a m43172u = m43159h3.m43172u(AbstractC23136l9.m118743r0(i16));
                C31973j5 c31973j53 = this.f62366X0;
                if (c31973j53 != null && c31973j53.m153747Y()) {
                    i17 = AbstractC8020f0.str_community_change_owner_dialog_desc;
                } else {
                    i17 = AbstractC8020f0.str_group_change_owner_dialog_desc;
                }
                m43172u.m43162k(AbstractC23136l9.m118743r0(i17)).m43164m(AbstractC8020f0.str_exit, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.continue_text, this);
                return aVar5.m43152a();
            case 7:
                C29938n2 m148267c = C29938n2.m148267c(LayoutInflater.from(this.f72421L0.getContext()), null, false);
                RobotoTextView robotoTextView = m148267c.f138752r;
                C31973j5 c31973j54 = this.f62366X0;
                if (c31973j54 != null && c31973j54.m153747Y()) {
                    i18 = AbstractC8020f0.str_dialog_desc_confirm_disable_community_history_msg_v2;
                } else {
                    i18 = AbstractC8020f0.str_dialog_desc_confirm_disable_history_msg_v2;
                }
                robotoTextView.setText(AbstractC23136l9.m118743r0(i18));
                AbstractC19074t.m100207e(m148267c, "apply(...)");
                C8009j.a aVar6 = new C8009j.a(this.f72421L0.m92648SI());
                aVar6.m43159h(4);
                aVar6.m43177z(m148267c.getRoot());
                aVar6.m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b());
                aVar6.m43169r(AbstractC8020f0.str_btn_agree, new InterfaceC17463d.d() { // from class: g70.f
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i21) {
                        ManageGroupView.m66572pO(ManageGroupView.this, interfaceC17463d, i21);
                    }
                });
                return aVar6.m43152a();
            case 8:
                C29938n2 m148267c2 = C29938n2.m148267c(LayoutInflater.from(this.f72421L0.getContext()), null, false);
                RobotoTextView robotoTextView2 = m148267c2.f138752r;
                C31973j5 c31973j55 = this.f62366X0;
                if (c31973j55 != null && c31973j55.m153747Y()) {
                    i19 = AbstractC8020f0.str_dialog_desc_confirm_enable_community_history_msg_v2;
                } else {
                    i19 = AbstractC8020f0.str_dialog_desc_confirm_enable_history_msg_v2;
                }
                robotoTextView2.setText(AbstractC23136l9.m118743r0(i19));
                AbstractC19074t.m100207e(m148267c2, "apply(...)");
                C8009j.a aVar7 = new C8009j.a(this.f72421L0.m92648SI());
                aVar7.m43159h(4);
                aVar7.m43177z(m148267c2.getRoot());
                aVar7.m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b());
                aVar7.m43169r(AbstractC8020f0.str_btn_agree, new InterfaceC17463d.d() { // from class: g70.g
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i21) {
                        ManageGroupView.m66575qO(ManageGroupView.this, interfaceC17463d, i21);
                    }
                });
                return aVar7.m43152a();
        }
        return super.mo39014DJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C31973j5 m4472f;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        boolean z11 = false;
        this.f62359Q0 = C30066u7.m148572c(layoutInflater, viewGroup, false);
        RecyclerView recyclerView = m66492GN().f139563q;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.m9826E(new C11984i());
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(recyclerView.getContext());
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        recyclerView.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        C11985j c11985j = new C11985j();
        if (AbstractC25495a.m132079d(this.f62363U0) && (m4472f = C0943w.m4462l().m4472f(AbstractC25495a.m132088m(this.f62363U0))) != null && m4472f.m153747Y()) {
            z11 = true;
        }
        ManageGroupAdapter manageGroupAdapter = new ManageGroupAdapter(c11985j, z11);
        this.f62360R0 = manageGroupAdapter;
        recyclerView.setAdapter(manageGroupAdapter);
        RelativeLayout root = m66492GN().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: HN */
    public final InterfaceC11977b m66601HN() {
        return this.f62368Z0;
    }

    /* renamed from: JN */
    public final Conversation m66602JN() {
        return this.f62364V0;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        int i12;
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        int mo92862f = interfaceC17463d.mo92862f();
        if (mo92862f != 1) {
            if (mo92862f != 2) {
                if (mo92862f == 6 && i11 == -1) {
                    AbstractC23647d.m123897g("1591060");
                    interfaceC17463d.dismiss();
                    C31973j5 c31973j5 = this.f62366X0;
                    if (c31973j5 != null && c31973j5 != null && c31973j5.m153747Y()) {
                        i12 = AbstractC8020f0.str_select_new_community_owner;
                    } else {
                        i12 = AbstractC8020f0.str_select_new_group_owner;
                    }
                    Bundle m80670a = GroupSelectNewOwnerView.Companion.m80670a(AbstractC23136l9.m118743r0(i12));
                    m80670a.putString("extra_group_id", this.f62362T0);
                    m80670a.putString("extra_activity_title", AbstractC23136l9.m118743r0(i12));
                    m80670a.putBoolean("BOL_EXTRA_LEAVE_GROUP_AFTER_SELECTED_NEW_GROUP_OWNER", false);
                    InterfaceC27218a m92676n2 = m92676n2();
                    if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                        mo35579p.m93066i2(GroupSelectNewOwnerView.class, m80670a, 2, 1, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 != -2) {
                if (i11 == -1) {
                    interfaceC17463d.dismiss();
                    C19637j.f97466a.m102865r0(this.f62362T0, 0);
                    m66502LN().m93588V(this.f62362T0, m66500KN(9), false);
                    return;
                }
                return;
            }
            interfaceC17463d.dismiss();
            m66487EO();
            return;
        }
        if (i11 == -1) {
            AbstractC23647d.m123897g("1591060");
            interfaceC17463d.dismiss();
            m66551iO();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 27);
        bVar.m124119a().m124117e(this, 62);
        bVar.m124119a().m124117e(this, 52);
        bVar.m124119a().m124117e(this, 119);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        Button leadingButton;
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null && (leadingButton = m87077NK.getLeadingButton()) != null) {
            AbstractC23201r8.m119531a(leadingButton, AbstractC8020f0.tb_btn_home);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        Conversation conversation = this.f62364V0;
        if (conversation != null && AbstractC21935u.m114554u(conversation.f42893q) && C26444a.m136319a().m136320b()) {
            AbstractC28025b8.m141442M("tip.csc.rightmenu.createshortcutcall");
        }
        AbstractC23304d.f113436s2 = true;
        C23744a.Companion.m124119a().m124117e(this, 6019);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        Conversation conversation = this.f62364V0;
        if (conversation != null) {
            bundle.putParcelable("state_chat_contact", conversation);
        }
        bundle.putInt("other_setting_type", this.f62369a1);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m66478BO();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ManageGroupView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        String str;
        boolean booleanExtra;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3 && i12 == -1 && intent != null && this.f62376h1 != (booleanExtra = intent.getBooleanExtra("RESULT_DATA_NEW_CHECKED_VALUE", this.f62376h1))) {
                    m66554jO(this.f62375g1, booleanExtra);
                    return;
                }
                return;
            }
            if (i12 == -1) {
                if (intent == null || (str = intent.getStringExtra("EXTRA_SELECTED_UID")) == null) {
                    str = "";
                }
                m66547hN(this.f62362T0, str);
                return;
            }
            return;
        }
        if (i12 == 1001) {
            this.f72421L0.mo50035CK(i12, intent);
            this.f72421L0.finish();
        }
        m66487EO();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (AbstractC23304d.f113436s2) {
            m66487EO();
            AbstractC23304d.f113436s2 = false;
        }
        C23744a.Companion.m124119a().m124115b(this, 6019);
    }

    /* renamed from: wO */
    public final void m66603wO(InterfaceC11977b interfaceC11977b) {
        this.f62368Z0 = interfaceC11977b;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        C31973j5 c31973j5;
        int i12;
        boolean z11;
        AbstractC19074t.m100208f(objArr, "args");
        try {
            if (i11 != 27) {
                if (i11 != 52) {
                    if (i11 != 62) {
                        if (i11 != 119) {
                            if (i11 == 6019) {
                                if (objArr.length == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z11) {
                                    Object obj = objArr[0];
                                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                                    if (AbstractC19074t.m100204b(this.f62363U0, (String) obj)) {
                                        m66487EO();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (this.f62369a1 == 52) {
                            m66487EO();
                            return;
                        }
                        return;
                    }
                    m66487EO();
                    return;
                }
                if (AbstractC23184q2.m119459q(this.f62362T0, i11, Arrays.copyOf(objArr, objArr.length))) {
                    finish();
                    return;
                }
                return;
            }
            if (objArr.length >= 3) {
                Object obj2 = objArr[0];
                AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj2;
                Object obj3 = objArr[1];
                AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj3).intValue();
                if (intValue == 9 && (c31973j5 = this.f62366X0) != null && c31973j5.m153751b0() != this.f62367Y0) {
                    if (c31973j5.m153751b0()) {
                        i12 = AbstractC8020f0.str_msg_toast_enable_history_msg;
                    } else {
                        i12 = AbstractC8020f0.str_msg_toast_disable_history_msg;
                    }
                    ToastUtils.m89268p(AbstractC23136l9.m118743r0(i12));
                    this.f62367Y0 = c31973j5.m153751b0();
                }
                if (intValue != 0 && AbstractC19074t.m100204b(str, this.f62362T0)) {
                    m66487EO();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f62378j1 = -1;
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("extra_chat_id", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f62363U0 = string;
            if (AbstractC25495a.m132079d(string)) {
                this.f62362T0 = AbstractC25495a.m132088m(this.f62363U0);
                C31973j5 m4472f = C0943w.m4462l().m4472f(this.f62362T0);
                if (m4472f != null) {
                    this.f62367Y0 = m4472f.m153751b0();
                } else {
                    m4472f = null;
                }
                this.f62366X0 = m4472f;
                if (this.f62364V0 == null) {
                    this.f62364V0 = new Conversation("group_" + this.f62362T0, null, null, null, 14, null);
                }
            }
            m66487EO();
            Conversation conversation = this.f62364V0;
            if (conversation != null && !this.f62379k1 && this.f62362T0.length() == 0 && conversation.f42893q.length() > 0 && !C21912a.m114159g().m114170k(conversation.f42893q) && C23055e5.m118273h(false, 1, null)) {
                this.f62379k1 = true;
                TrackingSource trackingSource = new TrackingSource(-1);
                this.f62380l1.mo1704o8(this.f62381m1);
                this.f62380l1.mo1427F6(conversation.f42893q, trackingSource);
            }
        }
    }

    /* renamed from: xO */
    public final void m66604xO(Conversation conversation) {
        this.f62364V0 = conversation;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 27);
        bVar.m124119a().m124115b(this, 62);
        bVar.m124119a().m124115b(this, 52);
        bVar.m124119a().m124115b(this, 119);
    }
}
