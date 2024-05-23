package com.zing.zalo.p077ui.maintab.group;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0804b;
import ag0.C0815e1;
import am.C0943w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.MuteTrackingSource;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.group.invitation.box.GroupInvitationListView;
import com.zing.zalo.p077ui.group.leavegroup.C11922b;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.maintab.contact.ContactGroupMyPagesView;
import com.zing.zalo.p077ui.maintab.group.GroupTabView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.CodeLockMessageView;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.GroupNotificationSettingView;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupView;
import com.zing.zalo.uicontrol.SimpleMenuListPopupView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import f70.C18815q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gw.AbstractC19646n0;
import gw.C19636i1;
import gw.C19637j;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i60.C20336b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23034c6;
import me0.AbstractC23088h5;
import me0.AbstractC23116k0;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23161o1;
import me0.AbstractC23165o5;
import me0.AbstractC23184q2;
import me0.AbstractC23192r;
import me0.AbstractC23211s7;
import me0.C23212s8;
import me0.C23283z7;
import mm0.AbstractC23350e;
import nh0.C23793c;
import o70.C24099q0;
import p161fg.C18922m;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p394oj.C24275a;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p692ys.C31070a;
import p716zh.C31877d;
import p716zh.C31973j5;
import p716zh.C32020m7;
import p716zh.C32076q5;
import rs.C25976a;
import th.AbstractC26681b;
import th.AbstractC26683d;
import u00.C26939u;
import v50.C27870vb;
import vg.AbstractC28207v1;
import vg.C28023b6;
import zc0.C31784b;
import zm.voip.p721ui.views.CreateGroupCallZView;

/* loaded from: classes5.dex */
public final class GroupTabView extends BaseZaloView implements C23744a.c, C25976a.a, InterfaceC17463d.d {
    public static final C12122a Companion = new C12122a(null);

    /* renamed from: t1 */
    private static final String f63321t1;

    /* renamed from: M0 */
    private ViewGroup f63322M0;

    /* renamed from: N0 */
    private ProgressBar f63323N0;

    /* renamed from: O0 */
    private TextView f63324O0;

    /* renamed from: P0 */
    private RecyclerView f63325P0;

    /* renamed from: Q0 */
    private C32020m7 f63326Q0;

    /* renamed from: R0 */
    private ContactProfile f63327R0;

    /* renamed from: S0 */
    private ContactProfile f63328S0;

    /* renamed from: T0 */
    private ContactProfile f63329T0;

    /* renamed from: U0 */
    private C32020m7 f63330U0;

    /* renamed from: V0 */
    private C23528a f63331V0;

    /* renamed from: W0 */
    private C25976a f63332W0;

    /* renamed from: X0 */
    private C8009j f63333X0;

    /* renamed from: Y0 */
    private LinearLayoutManager f63334Y0;

    /* renamed from: Z0 */
    private View f63335Z0;

    /* renamed from: b1 */
    private Handler f63337b1;

    /* renamed from: d1 */
    private HandlerThread f63339d1;

    /* renamed from: e1 */
    private int f63340e1;

    /* renamed from: h1 */
    private boolean f63343h1;

    /* renamed from: i1 */
    private float f63344i1;

    /* renamed from: j1 */
    private float f63345j1;

    /* renamed from: k1 */
    private boolean f63346k1;

    /* renamed from: l1 */
    private boolean f63347l1;

    /* renamed from: n1 */
    private ArrayList f63349n1;

    /* renamed from: p1 */
    private boolean f63351p1;

    /* renamed from: q1 */
    private boolean f63352q1;

    /* renamed from: s1 */
    private boolean f63354s1;

    /* renamed from: a1 */
    private String f63336a1 = "";

    /* renamed from: c1 */
    private Handler f63338c1 = new Handler(Looper.getMainLooper());

    /* renamed from: f1 */
    private String f63341f1 = "";

    /* renamed from: g1 */
    private String f63342g1 = "";

    /* renamed from: m1 */
    private Runnable f63348m1 = new Runnable() { // from class: q70.g
        public /* synthetic */ RunnableC25147g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            GroupTabView.m67777RM(GroupTabView.this);
        }
    };

    /* renamed from: o1 */
    private final Runnable f63350o1 = new Runnable() { // from class: q70.h
        public /* synthetic */ RunnableC25148h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            GroupTabView.m67778SM(GroupTabView.this);
        }
    };

    /* renamed from: r1 */
    private Runnable f63353r1 = new Runnable() { // from class: q70.i
        public /* synthetic */ RunnableC25149i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            GroupTabView.m67770IM(GroupTabView.this);
        }
    };

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabView$a */
    /* loaded from: classes5.dex */
    public static final class C12122a {
        private C12122a() {
        }

        public /* synthetic */ C12122a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabView$b */
    /* loaded from: classes5.dex */
    public static final class C12123b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ C24275a f63356b;

        C12123b(C24275a c24275a) {
            this.f63356b = c24275a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Runnable] */
        /* JADX WARN: Type inference failed for: r0v7 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                    GroupTabView.this.m67800AM().post(GroupTabView.this.m67826zM());
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                GroupTabView.this.m67815bN(z11);
                GroupTabView.this.m67800AM().post(((CommonZaloview) GroupTabView.this).f72832G0);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "arg0");
            try {
                try {
                    C7860a.Companion.m40303b().m40260C0();
                    C0804b.m2025g().m2029b(this.f63356b);
                    GroupTabView.this.m67800AM().post(GroupTabView.this.m67826zM());
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                GroupTabView.this.m67815bN(false);
                GroupTabView.this.m67800AM().post(((CommonZaloview) GroupTabView.this).f72832G0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabView$c */
    /* loaded from: classes5.dex */
    public static final class C12124c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f63358b;

        C12124c(String str) {
            this.f63358b = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            boolean z11 = false;
            GroupTabView.this.m67811XM(false);
            GroupTabView.this.m67800AM().post(((CommonZaloview) GroupTabView.this).f72832G0);
            C31973j5 m4472f = C0943w.f3447a.m4472f(this.f63358b);
            if (m4472f != null) {
                z11 = m4472f.m153747Y();
            }
            AbstractC23161o1.m119321f(c20096c, z11);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    String str = "group_" + this.f63358b;
                    AbstractC23306f.m120584H0().m2629l(str);
                    C31973j5 m4472f = C0943w.f3447a.m4472f(this.f63358b);
                    AbstractC23184q2.m119446d(this.f63358b, str);
                    AbstractC23184q2.m119438C(this.f63358b);
                    GroupTabView groupTabView = GroupTabView.this;
                    if (m4472f != null && m4472f.m153747Y()) {
                        i11 = AbstractC8020f0.str_leave_community_success_toast;
                    } else {
                        i11 = AbstractC8020f0.str_leave_group_success_toast;
                    }
                    C23283z7.m120375h(groupTabView, i11, 0, Integer.valueOf(AbstractC23136l9.m118742r(50.0f)));
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                GroupTabView.this.m67811XM(false);
                GroupTabView.this.m67800AM().post(((CommonZaloview) GroupTabView.this).f72832G0);
            } catch (Throwable th2) {
                GroupTabView.this.m67811XM(false);
                GroupTabView.this.m67800AM().post(((CommonZaloview) GroupTabView.this).f72832G0);
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabView$d */
    /* loaded from: classes5.dex */
    public static final class C12125d extends RecyclerView.AbstractC1892s {
        C12125d() {
        }

        /* renamed from: g */
        public static final void m67828g(GroupTabView groupTabView) {
            AbstractC19074t.m100208f(groupTabView, "this$0");
            try {
                if (groupTabView.m67822vM() && groupTabView.f72421L0.m92650VI() != null && (groupTabView.f72421L0.m92650VI() instanceof ContactGroupMyPagesView)) {
                    ZaloView m92650VI = groupTabView.f72421L0.m92650VI();
                    AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.maintab.contact.ContactGroupMyPagesView");
                    ((ContactGroupMyPagesView) m92650VI).m67741rM(true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            if (i11 == 0) {
                C25976a m67818tM = GroupTabView.this.m67818tM();
                AbstractC19074t.m100205c(m67818tM);
                m67818tM.f123935s = false;
                C25976a m67818tM2 = GroupTabView.this.m67818tM();
                AbstractC19074t.m100205c(m67818tM2);
                m67818tM2.m10008p();
                if (GroupTabView.this.m67822vM() && GroupTabView.this.f72421L0.m92650VI() != null && (GroupTabView.this.f72421L0.m92650VI() instanceof ContactGroupMyPagesView)) {
                    ZaloView m92650VI = GroupTabView.this.f72421L0.m92650VI();
                    AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.maintab.contact.ContactGroupMyPagesView");
                    ((ContactGroupMyPagesView) m92650VI).m67741rM(true);
                }
                if (GroupTabView.this.m67824xM() != null) {
                    Handler m67824xM = GroupTabView.this.m67824xM();
                    AbstractC19074t.m100205c(m67824xM);
                    m67824xM.postDelayed(new Runnable() { // from class: q70.p
                        public /* synthetic */ RunnableC25156p() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupTabView.C12125d.m67828g(GroupTabView.this);
                        }
                    }, 500L);
                    return;
                }
                return;
            }
            C25976a m67818tM3 = GroupTabView.this.m67818tM();
            AbstractC19074t.m100205c(m67818tM3);
            m67818tM3.f123935s = AbstractC23304d.m120536g().f147982c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            try {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                AbstractC19074t.m100205c(linearLayoutManager);
                int m9737T1 = linearLayoutManager.m9737T1();
                GroupTabView groupTabView = GroupTabView.this;
                boolean z11 = true;
                if (m9737T1 != 1) {
                    z11 = false;
                }
                groupTabView.m67810WM(z11);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabView$e */
    /* loaded from: classes5.dex */
    public static final class C12126e extends InterfaceC17463d.b {
        C12126e() {
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.b, com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            AbstractC19074t.m100208f(interfaceC17463d, "dialog");
            super.mo605K8(interfaceC17463d, i11);
            if (!AbstractC23088h5.m118421b()) {
                AbstractC23088h5.m118428i(MainApplication.Companion.m35500c());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabView$f */
    /* loaded from: classes5.dex */
    public static final class C12127f extends InterfaceC17463d.b {
        C12127f() {
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.b, com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            AbstractC19074t.m100208f(interfaceC17463d, "dialog");
            super.mo605K8(interfaceC17463d, i11);
            AbstractC23152n3.m119082z0();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabView$g */
    /* loaded from: classes5.dex */
    public static final class C12128g extends AbstractC23116k0.a {
        C12128g() {
        }

        @Override // me0.AbstractC23116k0.a
        /* renamed from: b */
        public void mo56829b(InterfaceC17463d interfaceC17463d, int i11) {
            C17487o0 mo35579p;
            AbstractC19074t.m100208f(interfaceC17463d, "dialog");
            interfaceC17463d.dismiss();
            if (i11 == 4) {
                ContactProfile m67821uM = GroupTabView.this.m67821uM();
                AbstractC19074t.m100205c(m67821uM);
                String str = m67821uM.f42434r;
                ContactProfile m67821uM2 = GroupTabView.this.m67821uM();
                AbstractC19074t.m100205c(m67821uM2);
                GroupNotificationSettingView m80298mM = GroupNotificationSettingView.m80298mM(str, new Conversation(m67821uM2), 7);
                InterfaceC27218a m92676n2 = GroupTabView.this.f72421L0.m92676n2();
                if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                    mo35579p.mo89692g2(m80298mM, 0, 1, true);
                    return;
                }
                return;
            }
            GroupTabView.this.m67814aN(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabView$h */
    /* loaded from: classes5.dex */
    public static final class C12129h extends AbstractC23116k0.a {

        /* renamed from: b */
        final /* synthetic */ String f63362b;

        C12129h(String str) {
            this.f63362b = str;
        }

        @Override // me0.AbstractC23116k0.a
        /* renamed from: a */
        public void mo62982a(InterfaceC17463d interfaceC17463d, int i11, Object... objArr) {
            AbstractC19074t.m100208f(interfaceC17463d, "dialog");
            AbstractC19074t.m100208f(objArr, "params");
            if (i11 != -1) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        interfaceC17463d.dismiss();
                        return;
                    }
                    try {
                        interfaceC17463d.dismiss();
                        AbstractC23211s7.m119564D(this.f63362b, GroupTabView.this.f72421L0.m92676n2(), ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4);
                        return;
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                        return;
                    }
                }
                AbstractC23647d.m123897g("1020002");
                GroupTabView.this.f72421L0.showDialog(16);
                interfaceC17463d.dismiss();
                return;
            }
            try {
                AbstractC23647d.m123897g("1020001");
                interfaceC17463d.dismiss();
                Object obj = objArr[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                GroupTabView.this.m67817sM(this.f63362b, null, ((Boolean) obj).booleanValue(), false);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabView$i */
    /* loaded from: classes5.dex */
    public static final class HandlerThreadC12130i extends HandlerThread {
        HandlerThreadC12130i() {
            super("Z:GroupTab");
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            super.onLooperPrepared();
            HandlerThread m67825yM = GroupTabView.this.m67825yM();
            AbstractC19074t.m100205c(m67825yM);
            if (m67825yM.getLooper() != null) {
                GroupTabView groupTabView = GroupTabView.this;
                HandlerThread m67825yM2 = GroupTabView.this.m67825yM();
                AbstractC19074t.m100205c(m67825yM2);
                groupTabView.m67813ZM(new Handler(m67825yM2.getLooper()));
                if (C19669z.Companion.m103232a().m103226p0() && GroupTabView.this.m67824xM() != null) {
                    Handler m67824xM = GroupTabView.this.m67824xM();
                    AbstractC19074t.m100205c(m67824xM);
                    m67824xM.post(GroupTabView.this.m67801CM());
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabView$j */
    /* loaded from: classes5.dex */
    public static final class C12131j implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f63365b;

        C12131j(String str) {
            this.f63365b = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                    GroupTabView.this.m67800AM().post(GroupTabView.this.m67826zM());
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                GroupTabView.this.m67800AM().post(((CommonZaloview) GroupTabView.this).f72832G0);
                GroupTabView.this.m67815bN(false);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "arg0");
            try {
                try {
                    GroupTabView.this.m67815bN(false);
                    C0804b.m2025g().m2035l(this.f63365b, true);
                    GroupTabView.this.m67800AM().post(GroupTabView.this.m67826zM());
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                GroupTabView.this.m67800AM().post(((CommonZaloview) GroupTabView.this).f72832G0);
                GroupTabView.this.m67815bN(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabView$k */
    /* loaded from: classes5.dex */
    public static final class C12132k implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f63366a;

        /* renamed from: b */
        final /* synthetic */ GroupTabView f63367b;

        C12132k(String str, GroupTabView groupTabView) {
            this.f63366a = str;
            this.f63367b = groupTabView;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                ToastUtils.showMess(c20096c.m104492d());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                C19637j c19637j = C19637j.f97466a;
                String str = this.f63366a;
                AbstractC19074t.m100205c(str);
                c19637j.m102842a0(str);
                if (this.f63367b.m67824xM() != null) {
                    Handler m67824xM = this.f63367b.m67824xM();
                    AbstractC19074t.m100205c(m67824xM);
                    m67824xM.post(this.f63367b.m67801CM());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.group.GroupTabView$l */
    /* loaded from: classes5.dex */
    public static final class C12133l extends C7145n.g {
        C12133l() {
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
            GroupTabView.this.m67816qM();
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
            GroupTabView.this.m67805OM();
        }
    }

    static {
        String simpleName = GroupTabView.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f63321t1 = simpleName;
    }

    /* renamed from: BM */
    private final MainTabView m67766BM() {
        MainTabView mainTabView;
        Exception e11;
        MainTabView m67645lM = MainTabView.m67645lM();
        if (m67645lM == null) {
            try {
            } catch (Exception e12) {
                mainTabView = m67645lM;
                e11 = e12;
            }
            if (this.f72421L0.m92650VI() != null && (this.f72421L0.m92650VI() instanceof MainTabView)) {
                ZaloView m92650VI = this.f72421L0.m92650VI();
                AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.maintab.MainTabView");
                mainTabView = (MainTabView) m92650VI;
                try {
                    MainTabView.m67662xN(mainTabView);
                } catch (Exception e13) {
                    e11 = e13;
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return mainTabView;
                }
                return mainTabView;
            }
            return m67645lM;
        }
        return m67645lM;
    }

    /* renamed from: FM */
    private final void m67767FM(C31973j5 c31973j5) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: q70.n
            public /* synthetic */ RunnableC25154n() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupTabView.m67768GM(C31973j5.this);
            }
        });
    }

    /* renamed from: GM */
    public static final void m67768GM(C31973j5 c31973j5) {
        List<String> arrayList;
        if (c31973j5 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet m102826G = C19637j.f97466a.m102826G();
        C32076q5 m4476k = C0943w.f3447a.m4476k(c31973j5.m153781r());
        if (m4476k == null || (arrayList = m4476k.m154718g()) == null) {
            arrayList = new ArrayList();
        }
        for (String str : arrayList) {
            if (m102826G.contains(str)) {
                arrayList2.add(str);
            }
        }
        if (arrayList2.size() == 0) {
            return;
        }
        AbstractC19646n0.m102986i0(arrayList2, c31973j5, 2, AbstractC23136l9.m118743r0(AbstractC8020f0.str_are_online) + ". " + AbstractC23136l9.m118743r0(AbstractC8020f0.str_let_start_chatting), "", "", "", 259200000L);
    }

    /* renamed from: HM */
    private final boolean m67769HM() {
        return m92650VI() instanceof ContactGroupMyPagesView;
    }

    /* renamed from: IM */
    public static final void m67770IM(GroupTabView groupTabView) {
        AbstractC19074t.m100208f(groupTabView, "this$0");
        try {
            C25976a c25976a = groupTabView.f63332W0;
            if (c25976a != null) {
                AbstractC19074t.m100205c(c25976a);
                c25976a.m10008p();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: JM */
    public static final void m67771JM(GroupTabView groupTabView, RecyclerView recyclerView, int i11, View view) {
        AbstractC19074t.m100208f(groupTabView, "this$0");
        groupTabView.m67802DM(i11);
    }

    /* renamed from: KM */
    public static final boolean m67772KM(GroupTabView groupTabView, RecyclerView recyclerView, int i11, View view) {
        AbstractC19074t.m100208f(groupTabView, "this$0");
        return groupTabView.m67803EM(i11);
    }

    /* renamed from: LM */
    public static final boolean m67773LM(GroupTabView groupTabView, View view, MotionEvent motionEvent) {
        int action;
        AbstractC19074t.m100208f(groupTabView, "this$0");
        try {
            action = motionEvent.getAction();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (action != 0 && action != 1) {
            if (action != 2) {
                if (action != 3) {
                }
            } else {
                C25976a c25976a = groupTabView.f63332W0;
                if (c25976a != null) {
                    AbstractC19074t.m100205c(c25976a);
                    if (!c25976a.m133800M()) {
                        float y11 = motionEvent.getY();
                        if (groupTabView.f63345j1 == 0.0f) {
                            groupTabView.f63345j1 = y11;
                        }
                        if (groupTabView.f63344i1 == 0.0f) {
                            groupTabView.f63344i1 = y11;
                        }
                        if (!groupTabView.f63346k1 && !groupTabView.f63347l1) {
                            float f11 = groupTabView.f63345j1;
                            if (y11 > f11) {
                                groupTabView.f63347l1 = false;
                                groupTabView.f63346k1 = true;
                            } else if (y11 < f11) {
                                groupTabView.f63347l1 = true;
                                groupTabView.f63346k1 = false;
                            }
                        }
                        float f12 = groupTabView.f63345j1;
                        if (y11 > f12) {
                            if (groupTabView.f63347l1 && !groupTabView.f63346k1) {
                                groupTabView.f63344i1 = y11;
                                groupTabView.f63347l1 = false;
                                groupTabView.f63346k1 = true;
                            }
                        } else if (y11 < f12 && groupTabView.f63346k1 && !groupTabView.f63347l1) {
                            groupTabView.f63344i1 = y11;
                            groupTabView.f63347l1 = true;
                            groupTabView.f63346k1 = false;
                        }
                        double d11 = y11 - groupTabView.f63344i1;
                        if (d11 > 3.0d) {
                            if (groupTabView.f72421L0.m92650VI() != null && (groupTabView.f72421L0.m92650VI() instanceof ContactGroupMyPagesView)) {
                                ZaloView m92650VI = groupTabView.f72421L0.m92650VI();
                                AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.maintab.contact.ContactGroupMyPagesView");
                                ((ContactGroupMyPagesView) m92650VI).m67741rM(true);
                            }
                            groupTabView.f63344i1 = y11;
                            groupTabView.f63347l1 = false;
                            groupTabView.f63346k1 = false;
                        } else if (d11 < -3.0d) {
                            if (!groupTabView.f63343h1 && groupTabView.f72421L0.m92650VI() != null && (groupTabView.f72421L0.m92650VI() instanceof ContactGroupMyPagesView)) {
                                ZaloView m92650VI2 = groupTabView.f72421L0.m92650VI();
                                AbstractC19074t.m100206d(m92650VI2, "null cannot be cast to non-null type com.zing.zalo.ui.maintab.contact.ContactGroupMyPagesView");
                                ((ContactGroupMyPagesView) m92650VI2).m67741rM(false);
                            }
                            groupTabView.f63344i1 = y11;
                            groupTabView.f63347l1 = false;
                            groupTabView.f63346k1 = false;
                        }
                        groupTabView.f63345j1 = y11;
                    }
                }
            }
            return false;
        }
        groupTabView.f63344i1 = 0.0f;
        groupTabView.f63345j1 = 0.0f;
        groupTabView.f63346k1 = false;
        groupTabView.f63347l1 = false;
        return false;
    }

    /* renamed from: MM */
    public static final void m67774MM(InterfaceC17463d interfaceC17463d) {
        AbstractC23647d.m123906p("22001303");
        AbstractC23647d.m123893c();
    }

    /* renamed from: NM */
    private final void m67775NM(C20336b c20336b) {
        String str;
        if (c20336b != null) {
            str = c20336b.m106036c();
        } else {
            str = null;
        }
        if (str != null) {
            m67817sM(c20336b.m106036c(), c20336b.m106037d(), c20336b.m106038e(), c20336b.m106039f());
        }
    }

    /* renamed from: PM */
    private final void m67776PM(Bundle bundle, ContactProfile contactProfile) {
        AbstractC23211s7.m119583p(this.f72421L0.m92676n2(), bundle, contactProfile);
    }

    /* renamed from: RM */
    public static final void m67777RM(GroupTabView groupTabView) {
        AbstractC19074t.m100208f(groupTabView, "this$0");
        try {
            C25976a c25976a = groupTabView.f63332W0;
            AbstractC19074t.m100205c(c25976a);
            c25976a.m133803P(groupTabView.f63349n1);
            groupTabView.m67812YM(false, false);
            if (groupTabView.f72421L0.m92650VI() != null && (groupTabView.f72421L0.m92650VI() instanceof GroupTabParentView)) {
                ZaloView m92650VI = groupTabView.f72421L0.m92650VI();
                AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.maintab.group.GroupTabParentView");
                ((GroupTabParentView) m92650VI).m67763uM(0, false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: SM */
    public static final void m67778SM(GroupTabView groupTabView) {
        AbstractC19074t.m100208f(groupTabView, "this$0");
        try {
            groupTabView.f63349n1 = C19637j.f97466a.m102872z();
            if (!C24099q0.Companion.m125984a().m125962c()) {
                ArrayList arrayList = groupTabView.f63349n1;
                AbstractC19074t.m100205c(arrayList);
                arrayList.add(0, new C32020m7(18));
            }
            groupTabView.f63338c1.removeCallbacks(groupTabView.f63348m1);
            groupTabView.f63338c1.post(groupTabView.f63348m1);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: TM */
    private final void m67779TM(ContactProfile contactProfile) {
        int i11;
        if (this.f63352q1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        AbstractC19074t.m100205c(contactProfile);
        if (contactProfile.m40374K0()) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C12131j(str));
        this.f63352q1 = true;
        c0766k.mo1413D8(i11, str, new MuteTrackingSource(7));
    }

    /* renamed from: cN */
    private final void m67780cN(int i11) {
        TextView textView = this.f63324O0;
        AbstractC19074t.m100205c(textView);
        textView.setText(i11);
    }

    /* renamed from: dN */
    private final void m67782dN(String str) {
        if (str.length() == 0) {
            return;
        }
        if (C11922b.Companion.m66332a()) {
            C31973j5 m4472f = C0943w.f3447a.m4472f(str);
            if (m4472f != null) {
                if (m4472f.m153732O() < 2) {
                    C18815q c18815q = C18815q.f94092a;
                    Context m92689tK = m92689tK();
                    AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                    c18815q.m98780b(m92689tK, new InterfaceC17463d.d() { // from class: q70.f

                        /* renamed from: q */
                        public final /* synthetic */ String f120715q;

                        public /* synthetic */ C25146f(String str2) {
                            r2 = str2;
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                            GroupTabView.m67784eN(GroupTabView.this, r2, interfaceC17463d, i11);
                        }
                    }, m4472f.m153747Y());
                    return;
                }
                AbstractC23211s7.m119582o(str2, this.f72421L0.m92676n2(), ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, "contacts");
                return;
            }
            return;
        }
        this.f72421L0.showDialog(19);
    }

    /* renamed from: eN */
    public static final void m67784eN(GroupTabView groupTabView, String str, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(groupTabView, "this$0");
        AbstractC19074t.m100208f(str, "$groupId");
        groupTabView.m67817sM(str, null, false, false);
    }

    /* renamed from: fN */
    private final void m67786fN(int i11) {
        C31973j5 c31973j5;
        int i12;
        int i13;
        int i14;
        this.f63328S0 = this.f63329T0;
        ArrayList arrayList = new ArrayList();
        if (i11 == 15) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.delete));
            hashMap.put("id", Integer.valueOf(AbstractC8020f0.delete));
            arrayList.add(hashMap);
        } else {
            if (i11 == 1) {
                C0804b m2025g = C0804b.m2025g();
                ContactProfile contactProfile = this.f63328S0;
                AbstractC19074t.m100205c(contactProfile);
                boolean m2033i = m2025g.m2033i(contactProfile.f42434r);
                HashMap hashMap2 = new HashMap();
                if (m2033i) {
                    i13 = AbstractC8020f0.str_optionM_receiveNotification;
                } else {
                    i13 = AbstractC8020f0.str_optionM_muteConversation;
                }
                hashMap2.put("name", AbstractC23136l9.m118743r0(i13));
                if (m2033i) {
                    i14 = AbstractC8020f0.str_optionM_receiveNotification;
                } else {
                    i14 = AbstractC8020f0.str_optionM_muteConversation;
                }
                hashMap2.put("id", Integer.valueOf(i14));
                arrayList.add(hashMap2);
            }
            ContactProfile contactProfile2 = this.f63328S0;
            AbstractC19074t.m100205c(contactProfile2);
            if (contactProfile2.m40374K0()) {
                ContactProfile contactProfile3 = this.f63328S0;
                if (contactProfile3 != null) {
                    c31973j5 = contactProfile3.m40388T(true);
                } else {
                    c31973j5 = null;
                }
                HashMap m119451i = AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide_message), AbstractC8020f0.str_hide_message);
                AbstractC19074t.m100207e(m119451i, "getNewEntry(...)");
                arrayList.add(m119451i);
                if (c31973j5 != null && c31973j5.m153747Y()) {
                    i12 = AbstractC8020f0.str_leave_community;
                } else {
                    i12 = AbstractC8020f0.context_menu_item_leave_group;
                }
                HashMap m119451i2 = AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(i12), AbstractC8020f0.context_menu_item_leave_group);
                AbstractC19074t.m100207e(m119451i2, "getNewEntry(...)");
                arrayList.add(m119451i2);
            }
            if (AbstractC26683d.f126391B) {
                HashMap m119451i3 = AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_open_bubble_chat), AbstractC8020f0.str_open_chat_head);
                AbstractC19074t.m100207e(m119451i3, "getNewEntry(...)");
                arrayList.add(m119451i3);
            } else if (!this.f72421L0.m92692wK().mo35576n3() && AbstractC23309i.m122004i2() && AbstractC26681b.f126356a) {
                HashMap m119451i4 = AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_open_chat_head), AbstractC8020f0.str_open_chat_head);
                AbstractC19074t.m100207e(m119451i4, "getNewEntry(...)");
                arrayList.add(m119451i4);
            }
        }
        if (!arrayList.isEmpty()) {
            SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            ContactProfile contactProfile4 = this.f63328S0;
            if (contactProfile4 != null) {
                AbstractC19074t.m100205c(contactProfile4);
                aVar.m43172u(contactProfile4.m40383Q(true, false));
            }
            aVar.m43173v(100);
            aVar.m43155d(true);
            aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: q70.o

                /* renamed from: p */
                public final /* synthetic */ SimpleAdapter f120723p;

                /* renamed from: q */
                public final /* synthetic */ GroupTabView f120724q;

                public /* synthetic */ C25155o(SimpleAdapter simpleAdapter2, GroupTabView this) {
                    r1 = simpleAdapter2;
                    r2 = this;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                    GroupTabView.m67788gN(r1, r2, interfaceC17463d, i15);
                }
            });
            C8009j m43152a = aVar.m43152a();
            this.f63333X0 = m43152a;
            if (m43152a != null) {
                AbstractC19074t.m100205c(m43152a);
                if (!m43152a.m92868m()) {
                    C8009j c8009j = this.f63333X0;
                    AbstractC19074t.m100205c(c8009j);
                    c8009j.mo13822K();
                }
            }
        }
    }

    /* renamed from: gN */
    public static final void m67788gN(SimpleAdapter simpleAdapter, GroupTabView groupTabView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(simpleAdapter, "$a");
        AbstractC19074t.m100208f(groupTabView, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        Object item = simpleAdapter.getItem(i11);
        AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        Object obj = ((HashMap) item).get("id");
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        if (intValue == AbstractC8020f0.str_optionM_receiveNotification) {
            groupTabView.m67779TM(groupTabView.f63328S0);
            return;
        }
        if (intValue == AbstractC8020f0.str_optionM_muteConversation) {
            groupTabView.f72421L0.showDialog(16);
            return;
        }
        if (intValue == AbstractC8020f0.str_hide_message) {
            ContactProfile contactProfile = groupTabView.f63328S0;
            AbstractC19074t.m100205c(contactProfile);
            groupTabView.m67808VM(contactProfile.f42434r);
            return;
        }
        if (intValue == AbstractC8020f0.context_menu_item_leave_group) {
            ContactProfile contactProfile2 = groupTabView.f63328S0;
            AbstractC19074t.m100205c(contactProfile2);
            if (contactProfile2.m40374K0()) {
                ContactProfile contactProfile3 = groupTabView.f63328S0;
                AbstractC19074t.m100205c(contactProfile3);
                groupTabView.m67782dN(AbstractC25495a.m132088m(contactProfile3.f42434r));
                return;
            }
            return;
        }
        if (intValue == AbstractC8020f0.delete) {
            C32020m7 c32020m7 = groupTabView.f63330U0;
            AbstractC19074t.m100205c(c32020m7);
            groupTabView.m67807UM(c32020m7.f147418i.f143228a);
            return;
        }
        if (intValue == AbstractC8020f0.str_open_chat_head) {
            if (AbstractC23165o5.m119333b()) {
                groupTabView.f72421L0.removeDialog(22);
                groupTabView.f72421L0.showDialog(22);
            } else {
                C17487o0 c17487o0 = null;
                String str = null;
                C17487o0 c17487o02 = null;
                if (AbstractC26683d.f126391B) {
                    if (!AbstractC23088h5.m118421b()) {
                        AbstractC23350e.m122772b("System Setting not allow to create Bubbles on Screen", new Object[0]);
                        groupTabView.f72421L0.removeDialog(24);
                        groupTabView.f72421L0.showDialog(24);
                    } else if (!AbstractC23192r.m119490a()) {
                        AbstractC23350e.m122772b("System Setting not allow to create Bubbles on Screen", new Object[0]);
                        groupTabView.f72421L0.removeDialog(23);
                        groupTabView.f72421L0.showDialog(23);
                    } else if (AbstractC23192r.m119491b(groupTabView.f63328S0)) {
                        ContactProfile contactProfile4 = groupTabView.f63328S0;
                        if (contactProfile4 != null) {
                            str = contactProfile4.m40360C();
                        }
                        AbstractC23350e.m122772b("ChatView: Open Bubble Chat " + str, new Object[0]);
                    } else if (groupTabView.f72421L0.m92676n2() != null) {
                        InterfaceC27218a m92676n2 = groupTabView.f72421L0.m92676n2();
                        if (m92676n2 != null) {
                            c17487o02 = m92676n2.mo35579p();
                        }
                        AbstractC23034c6.m118178s0(c17487o02, 1016);
                    }
                } else if (AbstractC26681b.f126356a) {
                    if (AbstractC23034c6.m118126L(MainApplication.Companion.m35500c())) {
                        groupTabView.m67790hN();
                    } else if (groupTabView.f72421L0.m92676n2() != null) {
                        InterfaceC27218a m92676n22 = groupTabView.f72421L0.m92676n2();
                        if (m92676n22 != null) {
                            c17487o0 = m92676n22.mo35579p();
                        }
                        AbstractC23034c6.m118182u0(c17487o0, 1015);
                    }
                }
            }
            AbstractC23647d.m123906p("220013");
            AbstractC23647d.m123893c();
        }
    }

    /* renamed from: hN */
    private final void m67790hN() {
        try {
            this.f63354s1 = false;
            AbstractC23309i.m122545wk(true);
            ContactProfile contactProfile = this.f63328S0;
            AbstractC19074t.m100205c(contactProfile);
            String mo2478b = contactProfile.mo2478b();
            AbstractC19074t.m100207e(mo2478b, "getUid(...)");
            Bundle m140776b = new C27870vb(mo2478b).m140780g(this.f63328S0).m140776b();
            if (C18922m.m99140n(this.f63328S0)) {
                AbstractC23304d.f113379e1 = C21927m.m114293T(this.f63328S0);
                C18922m.m99141t().m99148R(m140776b, this.f63328S0);
                if (this.f72421L0.m92676n2() instanceof Activity) {
                    AbstractC23647d.m123897g("22001401");
                    Object m92676n2 = this.f72421L0.m92676n2();
                    AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type android.app.Activity");
                    AbstractC23136l9.m118680U0((Activity) m92676n2, false);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: pM */
    private final void m67798pM(C24275a c24275a) {
        if (c24275a == null || this.f63352q1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C12123b(c24275a));
        this.f63352q1 = true;
        c0766k.mo1652h7(c24275a, new MuteTrackingSource(7));
    }

    /* renamed from: rM */
    public static final void m67799rM(GroupTabView groupTabView) {
        AbstractC19074t.m100208f(groupTabView, "this$0");
        RecyclerView recyclerView = groupTabView.f63325P0;
        if (recyclerView != null) {
            recyclerView.m9837K1(0);
        }
    }

    /* renamed from: AM */
    public final Handler m67800AM() {
        return this.f63338c1;
    }

    /* renamed from: CM */
    public final Runnable m67801CM() {
        return this.f63350o1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        C8009j c8009j = null;
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return c8009j;
        }
        if (i11 != 16) {
            switch (i11) {
                case 19:
                    C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                    aVar.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_askleave_chatactivity)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
                    C8009j m43152a = aVar.m43152a();
                    ContactProfile contactProfile = this.f63328S0;
                    AbstractC19074t.m100205c(contactProfile);
                    if (contactProfile.m40374K0()) {
                        ContactProfile contactProfile2 = this.f63328S0;
                        AbstractC19074t.m100205c(contactProfile2);
                        String m132088m = AbstractC25495a.m132088m(contactProfile2.f42434r);
                        C31973j5 m4472f = C0943w.f3447a.m4472f(m132088m);
                        Context m92686rK = this.f72421L0.m92686rK();
                        AbstractC19074t.m100205c(m4472f);
                        return AbstractC23116k0.m118579g(m92686rK, m4472f, new C12129h(m132088m));
                    }
                    return m43152a;
                case 20:
                    C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                    aVar2.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_new_hidden_chat)).m43173v(2).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_hint_hidden_chat)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_setpin), this);
                    return aVar2.m43152a();
                case 21:
                    C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
                    ImageView imageView = new ImageView(this.f72421L0.m92648SI());
                    imageView.setImageDrawable(C23212s8.m119609q(getContext(), AbstractC16781w.banner_hiddenchat_lock));
                    imageView.setPadding(0, AbstractC23136l9.m118742r(16.0f), 0, 0);
                    aVar3.m43177z(imageView);
                    aVar3.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_setup_hiddenchat_success)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_setup_hiddenchat_success)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.close), this);
                    C8009j m43152a2 = aVar3.m43152a();
                    m43152a2.m92855F(new InterfaceC17463d.e() { // from class: q70.m
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                        /* renamed from: Tv */
                        public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                            GroupTabView.m67774MM(interfaceC17463d);
                        }
                    });
                    return m43152a2;
                case 22:
                    try {
                        C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
                        aVar4.m43159h(4);
                        aVar4.m43155d(true);
                        if (AbstractC26683d.f126391B) {
                            i12 = AbstractC8020f0.str_announce_unable_bubble_chat_when_use_passcode;
                        } else {
                            i12 = AbstractC8020f0.str_announce_unable_chat_head_when_use_passcode;
                        }
                        String m118743r0 = AbstractC23136l9.m118743r0(i12);
                        AbstractC19074t.m100205c(m118743r0);
                        aVar4.m43162k(m118743r0);
                        aVar4.m43169r(AbstractC8020f0.ls_ok, new InterfaceC17463d.b());
                        c8009j = aVar4.m43152a();
                        return c8009j;
                    } catch (Exception e12) {
                        AbstractC23350e.m122778h(e12);
                        return null;
                    }
                case 23:
                    if (Build.VERSION.SDK_INT <= 29) {
                        return null;
                    }
                    C8009j.a aVar5 = new C8009j.a(this.f72421L0.m92648SI());
                    aVar5.m43159h(4);
                    aVar5.m43155d(true);
                    aVar5.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_notice_bubble_chat));
                    aVar5.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_notice_bubble_chat_global_setting));
                    aVar5.m43169r(AbstractC8020f0.ls_ok, new C12127f());
                    aVar5.m43164m(AbstractC8020f0.cancel, new InterfaceC17463d.b());
                    return aVar5.m43152a();
                case 24:
                    if (Build.VERSION.SDK_INT <= 29) {
                        return null;
                    }
                    C8009j.a aVar6 = new C8009j.a(this.f72421L0.m92648SI());
                    aVar6.m43159h(4);
                    aVar6.m43155d(true);
                    aVar6.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_notice_bubble_chat));
                    aVar6.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_notice_bubble_chat_notification_off));
                    aVar6.m43169r(AbstractC8020f0.str_hint_on_notification_action, new C12126e());
                    aVar6.m43164m(AbstractC8020f0.cancel, new InterfaceC17463d.b());
                    return aVar6.m43152a();
                default:
                    return null;
            }
            AbstractC23350e.m122778h(e11);
            return c8009j;
        }
        Context m92686rK2 = this.f72421L0.m92686rK();
        ContactProfile contactProfile3 = this.f63328S0;
        AbstractC19074t.m100205c(contactProfile3);
        return AbstractC23116k0.m118580h(m92686rK2, contactProfile3.m40374K0(), new C12128g());
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1 A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:85:0x0003, B:87:0x000e, B:4:0x001c, B:15:0x003b, B:18:0x0041, B:20:0x004b, B:21:0x004e, B:24:0x0067, B:26:0x006f, B:28:0x0073, B:32:0x008c, B:34:0x0092, B:36:0x00a5, B:38:0x00ab, B:43:0x00b2, B:45:0x00ba, B:47:0x00c0, B:51:0x00c7, B:53:0x00d1, B:55:0x00de, B:57:0x00f6, B:60:0x0102, B:63:0x0130, B:64:0x014d, B:66:0x0165, B:68:0x016f, B:69:0x018a, B:73:0x017a, B:75:0x0182, B:76:0x0136, B:78:0x0142, B:79:0x0148, B:80:0x0190), top: B:84:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* renamed from: DM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m67802DM(int i11) {
        C32020m7 m133799L;
        int i12;
        C17487o0 mo35579p;
        C17487o0 mo35579p2;
        if (i11 >= 0) {
            try {
                C25976a c25976a = this.f63332W0;
                AbstractC19074t.m100205c(c25976a);
                if (i11 < c25976a.mo10003k()) {
                    C25976a c25976a2 = this.f63332W0;
                    AbstractC19074t.m100205c(c25976a2);
                    m133799L = c25976a2.m133799L(i11);
                    this.f63326Q0 = m133799L;
                    AbstractC19074t.m100205c(m133799L);
                    i12 = m133799L.f147410a;
                    if (i12 == 1) {
                        if (i12 != 19) {
                            if (i12 != 35) {
                                if (i12 != 36) {
                                    switch (i12) {
                                        case 15:
                                            C31070a c31070a = m133799L.f147418i;
                                            if (c31070a != null) {
                                                AbstractC19074t.m100205c(c31070a);
                                                String str = c31070a.f143235h;
                                                AbstractC19074t.m100207e(str, "buttonAction");
                                                String str2 = c31070a.f143234g;
                                                AbstractC19074t.m100207e(str2, "buttonData");
                                                mo67809Va(c31070a, str, str2, new TrackingSource((short) 1003));
                                                return;
                                            }
                                            return;
                                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                        case 17:
                                            C31070a c31070a2 = m133799L.f147418i;
                                            if (c31070a2 != null) {
                                                if (AbstractC19074t.m100204b(c31070a2.f143235h, "action.open.creategroup")) {
                                                    AbstractC23647d.m123897g("27404");
                                                }
                                                AbstractC19074t.m100205c(c31070a2);
                                                String str3 = c31070a2.f143235h;
                                                AbstractC19074t.m100207e(str3, "buttonAction");
                                                String str4 = c31070a2.f143234g;
                                                AbstractC19074t.m100207e(str4, "buttonData");
                                                mo67809Va(c31070a2, str3, str4, new TrackingSource((short) 1005));
                                                return;
                                            }
                                            AbstractC23647d.m123897g("27404");
                                            m67806QM();
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                if (AbstractC23309i.m120813C2()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("extra_source_call", 7);
                                    InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                                    if (m92676n2 != null && (mo35579p2 = m92676n2.mo35579p()) != null) {
                                        mo35579p2.m93069k2(CreateGroupCallZView.class, bundle, 1, true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            InterfaceC27218a m92676n22 = this.f72421L0.m92676n2();
                            if (m92676n22 != null && (mo35579p = m92676n22.mo35579p()) != null) {
                                mo35579p.m93069k2(GroupInvitationListView.class, null, 1, true);
                                return;
                            }
                            return;
                        }
                        AbstractC23647d.m123897g("8011007");
                        m67806QM();
                        return;
                    }
                    ContactProfile contactProfile = m133799L.f147411b;
                    this.f63327R0 = contactProfile;
                    AbstractC19074t.m100205c(contactProfile);
                    if (contactProfile.m40374K0()) {
                        ContactProfile contactProfile2 = this.f63327R0;
                        AbstractC19074t.m100205c(contactProfile2);
                        String mo2478b = contactProfile2.mo2478b();
                        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                        String m132088m = AbstractC25495a.m132088m(mo2478b);
                        if (m132088m.length() > 0) {
                            C31973j5 m4472f = C0943w.f3447a.m4472f(m132088m);
                            if (m4472f != null) {
                                Bundle m140776b = new C27870vb(mo2478b).m140780g(this.f63327R0).m140776b();
                                m140776b.putString("groupId", m4472f.m153781r());
                                m140776b.putString("groupName", m4472f.m153793y());
                                ContactProfile contactProfile3 = this.f63327R0;
                                AbstractC19074t.m100205c(contactProfile3);
                                contactProfile3.f42428p = 1;
                                if (!TextUtils.isEmpty("")) {
                                    m140776b.putString("SOURCE_ACTION", "2820");
                                } else if (C19636i1.Companion.m102800a().m102761R(mo2478b)) {
                                    m140776b.putString("SOURCE_ACTION", "2400");
                                } else {
                                    m140776b.putString("SOURCE_ACTION", "2500");
                                }
                                long mo124311f = C23793c.Companion.m124321a().mo124311f() - m133799L.f147411b.m40402e0();
                                if (mo124311f >= 21600000 && !TextUtils.isEmpty(m4472f.m153724K())) {
                                    AbstractC19646n0.m102967d1(m4472f);
                                } else if (mo124311f >= 259200000 && C19637j.f97466a.m102833P(m4472f)) {
                                    m140776b.putBoolean("EXTRA_OPEN_KEYBOARD", true);
                                    m67767FM(m4472f);
                                }
                                m67776PM(m140776b, this.f63327R0);
                                return;
                            }
                            Bundle m140776b2 = new C27870vb(mo2478b).m140780g(this.f63327R0).m140776b();
                            m140776b2.putString("groupId", m132088m);
                            ContactProfile contactProfile4 = this.f63327R0;
                            AbstractC19074t.m100205c(contactProfile4);
                            m140776b2.putString("groupName", contactProfile4.f42437s);
                            ContactProfile contactProfile5 = this.f63327R0;
                            AbstractC19074t.m100205c(contactProfile5);
                            contactProfile5.f42428p = 1;
                            m67776PM(m140776b2, this.f63327R0);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        m133799L = null;
        this.f63326Q0 = m133799L;
        AbstractC19074t.m100205c(m133799L);
        i12 = m133799L.f147410a;
        if (i12 == 1) {
        }
    }

    /* renamed from: EM */
    public final boolean m67803EM(int i11) {
        ContactProfile contactProfile;
        try {
            C25976a c25976a = this.f63332W0;
            AbstractC19074t.m100205c(c25976a);
            C32020m7 m133799L = c25976a.m133799L(i11);
            this.f63330U0 = m133799L;
            if (m133799L != null) {
                contactProfile = m133799L.f147411b;
            } else {
                contactProfile = null;
            }
            this.f63329T0 = contactProfile;
            AbstractC19074t.m100205c(m133799L);
            int i12 = m133799L.f147410a;
            if (i12 == 1 || i12 == 15) {
                m67786fN(i12);
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        Resources resources;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        Context context = this.f72421L0.getContext();
        if (context != null && (resources = context.getResources()) != null) {
            i11 = resources.getDimensionPixelSize(AbstractC16802y.func_bar_general_h);
        } else {
            i11 = 0;
        }
        this.f63340e1 = i11;
        View inflate = layoutInflater.inflate(AbstractC7409c0.group_tab_view, viewGroup, false);
        if (m67769HM()) {
            inflate.setBackground(null);
        }
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92692wK().mo35576n3()) {
            this.f72421L0.m92637BK(true);
        }
        this.f63331V0 = new C23528a(this.f72421L0.m92648SI());
        this.f63325P0 = (RecyclerView) inflate.findViewById(AbstractC6918a0.recycler_view);
        View findViewById = inflate.findViewById(AbstractC6918a0.empty_view);
        AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        this.f63322M0 = viewGroup2;
        AbstractC19074t.m100205c(viewGroup2);
        View findViewById2 = viewGroup2.findViewById(AbstractC6918a0.pb_loading);
        AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.ProgressBar");
        this.f63323N0 = (ProgressBar) findViewById2;
        ViewGroup viewGroup3 = this.f63322M0;
        AbstractC19074t.m100205c(viewGroup3);
        View findViewById3 = viewGroup3.findViewById(AbstractC6918a0.list_empty_text);
        AbstractC19074t.m100206d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.f63324O0 = (TextView) findViewById3;
        this.f63335Z0 = inflate.findViewById(AbstractC6918a0.layout_container);
        return inflate;
    }

    @Override // rs.C25976a.a
    /* renamed from: Gq */
    public void mo67804Gq(String str, String str2) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "groupId");
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        HandlerThread handlerThread = this.f63339d1;
        if (handlerThread != null) {
            AbstractC19074t.m100205c(handlerThread);
            handlerThread.quitSafely();
        }
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            if (mo92862f != 20) {
                if (mo92862f == 21 && i11 == -1) {
                    try {
                        interfaceC17463d.dismiss();
                        MainTabView m67766BM = m67766BM();
                        AbstractC19074t.m100205c(m67766BM);
                        m67766BM.m67709sN(true);
                        if (!TextUtils.isEmpty(this.f63341f1)) {
                            C19067n0 c19067n0 = C19067n0.f94947a;
                            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_hidden_setup_with_friend_done);
                            AbstractC19074t.m100207e(m118743r0, "getString(...)");
                            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{this.f63341f1}, 1));
                            AbstractC19074t.m100207e(format, "format(...)");
                            ToastUtils.showMess(format);
                        }
                        if (Build.VERSION.SDK_INT >= 25) {
                            C26939u m138770q = C26939u.m138770q();
                            ContactProfile contactProfile = this.f63328S0;
                            AbstractC19074t.m100205c(contactProfile);
                            m138770q.m138779h(contactProfile.f42434r);
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                        return;
                    }
                }
                return;
            }
            if (i11 == -1) {
                interfaceC17463d.dismiss();
                try {
                    Bundle bundle = new Bundle();
                    bundle.putInt("case_passcode_process", 0);
                    ContactProfile contactProfile2 = this.f63328S0;
                    AbstractC19074t.m100205c(contactProfile2);
                    bundle.putString("uid_set_hidden_chat", contactProfile2.f42434r);
                    InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                    if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                        mo35579p.m93066i2(CodeLockMessageView.class, bundle, 8654, 1, true);
                    }
                    this.f72421L0.removeDialog(20);
                    AbstractC23647d.m123906p("22001301");
                    AbstractC23647d.m123893c();
                    return;
                } catch (Exception e12) {
                    AbstractC23350e.m122778h(e12);
                    return;
                }
            }
            return;
        } catch (Exception e13) {
            AbstractC23350e.m122778h(e13);
        }
        AbstractC23350e.m122778h(e13);
    }

    /* renamed from: OM */
    public final void m67805OM() {
        try {
            if (this.f63337b1 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                C19637j c19637j = C19637j.f97466a;
                if (currentTimeMillis - c19637j.m102822B() > 1000) {
                    c19637j.m102855k0(0);
                    Handler handler = this.f63337b1;
                    AbstractC19074t.m100205c(handler);
                    handler.removeCallbacks(this.f63350o1);
                    Handler handler2 = this.f63337b1;
                    AbstractC19074t.m100205c(handler2);
                    handler2.post(this.f63350o1);
                } else {
                    c19637j.m102855k0(c19637j.m102825F() + 1);
                    if (c19637j.m102825F() > 10) {
                        if (c19637j.m102825F() % 10 != 0) {
                            Handler handler3 = this.f63337b1;
                            AbstractC19074t.m100205c(handler3);
                            handler3.removeCallbacks(this.f63350o1);
                            Handler handler4 = this.f63337b1;
                            AbstractC19074t.m100205c(handler4);
                            handler4.postDelayed(this.f63350o1, 500L);
                        } else {
                            Handler handler5 = this.f63337b1;
                            AbstractC19074t.m100205c(handler5);
                            handler5.removeCallbacks(this.f63350o1);
                            Handler handler6 = this.f63337b1;
                            AbstractC19074t.m100205c(handler6);
                            handler6.post(this.f63350o1);
                        }
                    } else {
                        Handler handler7 = this.f63337b1;
                        AbstractC19074t.m100205c(handler7);
                        handler7.removeCallbacks(this.f63350o1);
                        Handler handler8 = this.f63337b1;
                        AbstractC19074t.m100205c(handler8);
                        handler8.post(this.f63350o1);
                    }
                }
                c19637j.m102849h0(currentTimeMillis);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: QM */
    public final void m67806QM() {
        C17487o0 mo35579p;
        if (C19637j.f97466a.m102834Q()) {
            if (this.f72421L0.m92676n2() != null) {
                Bundle bundle = new Bundle();
                bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 1002);
                InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                    mo35579p.m93069k2(QuickCreateGroupView.class, bundle, 1, true);
                    return;
                }
                return;
            }
            return;
        }
        C23744a.Companion.m124119a().m124116d(60, new Object[0]);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 36);
        bVar.m124119a().m124117e(this, 59);
        bVar.m124119a().m124117e(this, 27);
    }

    /* renamed from: UM */
    public final void m67807UM(String str) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C12132k(str, this));
        c0766k.mo1390A9(str);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        try {
            C8009j c8009j = this.f63333X0;
            if (c8009j != null) {
                AbstractC19074t.m100205c(c8009j);
                if (c8009j.m92868m()) {
                    C8009j c8009j2 = this.f63333X0;
                    AbstractC19074t.m100205c(c8009j2);
                    c8009j2.dismiss();
                }
            }
            C23744a.Companion.m124119a().m124117e(this, 6074);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: VM */
    public final void m67808VM(String str) {
        C17487o0 mo35579p;
        try {
            if (TextUtils.isEmpty(AbstractC23309i.m122303q0())) {
                this.f72421L0.showDialog(20);
                AbstractC23647d.m123906p("22001300");
                AbstractC23647d.m123893c();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("uid_set_hidden_chat", str);
            bundle.putInt("case_passcode_process", 2);
            InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93066i2(CodeLockMessageView.class, bundle, 8654, 1, true);
            }
            AbstractC23647d.m123906p("22001304");
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // rs.C25976a.a
    /* renamed from: Va */
    public void mo67809Va(C31070a c31070a, String str, String str2, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(c31070a, "actionItem");
        AbstractC19074t.m100208f(str, "actionType");
        AbstractC19074t.m100208f(str2, "actionData");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        try {
            if (!TextUtils.isEmpty(str)) {
                C0815e1.m2075D().m2091J(3, "", str, 0);
                if (AbstractC19074t.m100204b(str, "action.open.creategroup")) {
                    C31877d c31877d = new C31877d();
                    c31877d.f146418d = c31070a;
                    c31877d.m153186e(c31070a.f143228a);
                    c31877d.m153187f(trackingSource);
                    AbstractC28207v1.m141994i3(str, 4, this.f72421L0.m92676n2(), this, str2, c31877d);
                } else {
                    AbstractC28207v1.m141994i3(str, 4, this.f72421L0.m92676n2(), this, str2, null);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: WM */
    public final void m67810WM(boolean z11) {
        this.f63343h1 = z11;
    }

    /* renamed from: XM */
    public final void m67811XM(boolean z11) {
        this.f63351p1 = z11;
    }

    /* renamed from: YM */
    public final void m67812YM(boolean z11, boolean z12) {
        try {
            if (z11) {
                TextView textView = this.f63324O0;
                AbstractC19074t.m100205c(textView);
                textView.setVisibility(8);
                ProgressBar progressBar = this.f63323N0;
                AbstractC19074t.m100205c(progressBar);
                progressBar.setVisibility(0);
                ViewGroup viewGroup = this.f63322M0;
                AbstractC19074t.m100205c(viewGroup);
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = this.f63322M0;
                AbstractC19074t.m100205c(viewGroup2);
                for (int childCount = viewGroup2.getChildCount() - 1; -1 < childCount; childCount--) {
                    ViewGroup viewGroup3 = this.f63322M0;
                    AbstractC19074t.m100205c(viewGroup3);
                    View childAt = viewGroup3.getChildAt(childCount);
                    if (childAt != null && (childAt instanceof ScrollView) && childAt.getId() == AbstractC6918a0.list_empty_withcontent_scrollview) {
                        ViewGroup viewGroup4 = this.f63322M0;
                        AbstractC19074t.m100205c(viewGroup4);
                        viewGroup4.removeViewAt(childCount);
                        return;
                    }
                }
                return;
            }
            C25976a c25976a = this.f63332W0;
            AbstractC19074t.m100205c(c25976a);
            if (c25976a.mo10003k() > 0) {
                ViewGroup viewGroup5 = this.f63322M0;
                AbstractC19074t.m100205c(viewGroup5);
                viewGroup5.setVisibility(8);
                return;
            }
            if (z12) {
                ProgressBar progressBar2 = this.f63323N0;
                AbstractC19074t.m100205c(progressBar2);
                progressBar2.setVisibility(8);
                ViewGroup viewGroup6 = this.f63322M0;
                AbstractC19074t.m100205c(viewGroup6);
                viewGroup6.setVisibility(0);
                TextView textView2 = this.f63324O0;
                AbstractC19074t.m100205c(textView2);
                textView2.setVisibility(0);
                ViewGroup viewGroup7 = this.f63322M0;
                AbstractC19074t.m100205c(viewGroup7);
                for (int childCount2 = viewGroup7.getChildCount() - 1; -1 < childCount2; childCount2--) {
                    ViewGroup viewGroup8 = this.f63322M0;
                    AbstractC19074t.m100205c(viewGroup8);
                    View childAt2 = viewGroup8.getChildAt(childCount2);
                    if (childAt2 != null && (childAt2 instanceof ScrollView) && childAt2.getId() == AbstractC6918a0.list_empty_withcontent_scrollview) {
                        ViewGroup viewGroup9 = this.f63322M0;
                        AbstractC19074t.m100205c(viewGroup9);
                        viewGroup9.removeViewAt(childCount2);
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: ZM */
    public final void m67813ZM(Handler handler) {
        this.f63337b1 = handler;
    }

    /* renamed from: aN */
    public final void m67814aN(int i11) {
        try {
            ContactProfile contactProfile = this.f63328S0;
            AbstractC19074t.m100205c(contactProfile);
            String str = contactProfile.f42434r;
            ContactProfile contactProfile2 = this.f63328S0;
            AbstractC19074t.m100205c(contactProfile2);
            C24275a m103040w0 = AbstractC19646n0.m103040w0(i11, str, contactProfile2.m40374K0(), 3);
            AbstractC19074t.m100207e(m103040w0, "getChatMuteSettingItem(...)");
            m67798pM(m103040w0);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: bN */
    public final void m67815bN(boolean z11) {
        this.f63352q1 = z11;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupTabView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        String str;
        if (i11 != 1015) {
            int i13 = -1;
            if (i11 != 8654) {
                if (i11 != 2001 && i11 != 2002) {
                    super.onActivityResult(i11, i12, intent);
                    return;
                } else {
                    if (i12 == -1) {
                        m67775NM(C20336b.Companion.m106041b(intent));
                        return;
                    }
                    return;
                }
            }
            if (i12 == -1 && intent != null) {
                if (intent.hasExtra("uid_set_hidden_chat")) {
                    str = intent.getStringExtra("uid_set_hidden_chat");
                } else {
                    str = "";
                }
                if (intent.hasExtra("case_passcode_process")) {
                    i13 = intent.getIntExtra("case_passcode_process", -1);
                }
                if (!TextUtils.isEmpty(str)) {
                    AbstractC19074t.m100205c(str);
                    ContactProfile contactProfile = new ContactProfile(str);
                    C18922m.m99141t().m99145O(str);
                    C28023b6.m141250h0().m141310R(str, true, false, false);
                    C21927m.m114302u().m114331f(str, contactProfile, true);
                    C19669z.Companion.m103232a().m103198O0();
                    if (i13 == 0) {
                        ContactProfile contactProfile2 = this.f63328S0;
                        if (contactProfile2 != null) {
                            AbstractC19074t.m100205c(contactProfile2);
                            if (!TextUtils.isEmpty(contactProfile2.f42434r)) {
                                ContactProfile contactProfile3 = this.f63328S0;
                                AbstractC19074t.m100205c(contactProfile3);
                                if (AbstractC19074t.m100204b(str, contactProfile3.f42434r)) {
                                    ContactProfile contactProfile4 = this.f63328S0;
                                    AbstractC19074t.m100205c(contactProfile4);
                                    String m40383Q = contactProfile4.m40383Q(true, false);
                                    AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
                                    this.f63341f1 = m40383Q;
                                }
                            }
                        }
                        this.f72421L0.showDialog(21);
                        AbstractC23647d.m123906p("22001302");
                        AbstractC23647d.m123893c();
                        return;
                    }
                    if (m67766BM() != null) {
                        MainTabView m67766BM = m67766BM();
                        AbstractC19074t.m100205c(m67766BM);
                        m67766BM.m67709sN(true);
                    }
                    AbstractC23647d.m123906p("22001305");
                    AbstractC23647d.m123893c();
                    ContactProfile contactProfile5 = this.f63328S0;
                    if (contactProfile5 != null) {
                        AbstractC19074t.m100205c(contactProfile5);
                        if (!TextUtils.isEmpty(contactProfile5.f42434r)) {
                            ContactProfile contactProfile6 = this.f63328S0;
                            AbstractC19074t.m100205c(contactProfile6);
                            if (AbstractC19074t.m100204b(str, contactProfile6.f42434r)) {
                                C19067n0 c19067n0 = C19067n0.f94947a;
                                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_hidden_setup_with_friend_done);
                                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                                ContactProfile contactProfile7 = this.f63328S0;
                                AbstractC19074t.m100205c(contactProfile7);
                                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{contactProfile7.m40383Q(true, false)}, 1));
                                AbstractC19074t.m100207e(format, "format(...)");
                                ToastUtils.showMess(format);
                            }
                        }
                    }
                    if (this.f63328S0 != null && Build.VERSION.SDK_INT >= 25) {
                        C26939u m138770q = C26939u.m138770q();
                        ContactProfile contactProfile8 = this.f63328S0;
                        AbstractC19074t.m100205c(contactProfile8);
                        m138770q.m138779h(contactProfile8.f42434r);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC26681b.f126356a) {
            this.f63354s1 = true;
            if (m92672lJ()) {
                m67790hN();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        Handler handler;
        super.onResume();
        if (AbstractC26681b.f126356a && this.f63354s1) {
            m67790hN();
        }
        if (this.f63339d1 == null) {
            HandlerThreadC12130i handlerThreadC12130i = new HandlerThreadC12130i();
            this.f63339d1 = handlerThreadC12130i;
            AbstractC19074t.m100205c(handlerThreadC12130i);
            handlerThreadC12130i.start();
        } else {
            AtomicBoolean atomicBoolean = AbstractC23304d.f113435s1;
            if (atomicBoolean.get()) {
                C19637j.f97466a.m102840X();
                atomicBoolean.set(false);
            } else if (C19669z.Companion.m103232a().m103226p0() && (handler = this.f63337b1) != null) {
                AbstractC19074t.m100205c(handler);
                handler.post(this.f63350o1);
            }
        }
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 36);
        bVar.m124119a().m124115b(this, 59);
        bVar.m124119a().m124115b(this, 27);
        bVar.m124119a().m124115b(this, 6074);
    }

    /* renamed from: qM */
    public final void m67816qM() {
        try {
            ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("request_sort_list");
            if (m92996E0 != null) {
                this.f72421L0.m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: sM */
    public final void m67817sM(String str, String str2, boolean z11, boolean z12) {
        try {
            if (this.f63351p1) {
                return;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C12124c(str));
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f63351p1 = true;
            c0766k.mo1496Na(str, str2, z11, z12);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f63321t1, e11);
            this.f63351p1 = false;
            this.f63338c1.post(this.f72832G0);
        }
    }

    /* renamed from: tM */
    public final C25976a m67818tM() {
        return this.f63332W0;
    }

    @Override // rs.C25976a.a
    /* renamed from: tl */
    public void mo67819tl(C31973j5 c31973j5) {
        AbstractC19074t.m100208f(c31973j5, "group");
    }

    @Override // rs.C25976a.a
    /* renamed from: uG */
    public void mo67820uG(Rect rect) {
        AbstractC19074t.m100208f(rect, "anchor");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7145n.b(m92689tK(), 5, 3, AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_recent_activity), ""));
        arrayList.add(new C7145n.b(m92689tK(), 5, 1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_name), ""));
        arrayList.add(new C7145n.b(m92689tK(), 5, 2, AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_manage), ""));
        this.f72421L0.m92649TI().m93060e2(0, SimpleMenuListPopupView.m87992ML(arrayList, new C12133l(), rect, AbstractC23309i.m122492v4()), "request_sort_list", 0, false);
    }

    /* renamed from: uM */
    public final ContactProfile m67821uM() {
        return this.f63328S0;
    }

    /* renamed from: vM */
    public final boolean m67822vM() {
        return this.f63343h1;
    }

    /* renamed from: wM */
    public final View m67823wM() {
        LinearLayoutManager linearLayoutManager = this.f63334Y0;
        if (linearLayoutManager != null && this.f63332W0 != null) {
            AbstractC19074t.m100205c(linearLayoutManager);
            int m9737T1 = linearLayoutManager.m9737T1();
            LinearLayoutManager linearLayoutManager2 = this.f63334Y0;
            AbstractC19074t.m100205c(linearLayoutManager2);
            int m9741Z1 = linearLayoutManager2.m9741Z1();
            if (m9737T1 > m9741Z1) {
                return null;
            }
            while (true) {
                RecyclerView recyclerView = this.f63325P0;
                AbstractC19074t.m100205c(recyclerView);
                RecyclerView.AbstractC1876c0 m9900t0 = recyclerView.m9900t0(m9737T1);
                if (m9900t0 != null && m9900t0.m9931C() == 1) {
                    return m9900t0.f7784p;
                }
                if (m9737T1 != m9741Z1) {
                    m9737T1++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        try {
            if (i11 != 27 && i11 != 36 && i11 != 59) {
                if (i11 == 6074) {
                    this.f63338c1.post(new Runnable() { // from class: q70.e
                        public /* synthetic */ RunnableC25145e() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupTabView.m67799rM(GroupTabView.this);
                        }
                    });
                }
            } else {
                C24099q0.b bVar = C24099q0.Companion;
                if (bVar.m125984a().m125962c()) {
                    if (m67766BM() != null) {
                        MainTabView m67766BM = m67766BM();
                        AbstractC19074t.m100205c(m67766BM);
                        if (m67766BM.m67696kM() == bVar.m125984a().m125967h()) {
                            m67805OM();
                        }
                    }
                } else if (m67766BM() != null) {
                    MainTabView m67766BM2 = m67766BM();
                    AbstractC19074t.m100205c(m67766BM2);
                    if (m67766BM2.m67696kM() == bVar.m125984a().m125972p()) {
                        ZaloView m92650VI = this.f72421L0.m92650VI();
                        AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.maintab.contact.ContactGroupMyPagesView");
                        if (((ContactGroupMyPagesView) m92650VI).m67736kM() == ContactGroupMyPagesView.C12118e.f63297a) {
                            m67805OM();
                        }
                    }
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
        C25976a c25976a = new C25976a(this.f63331V0, this);
        this.f63332W0 = c25976a;
        AbstractC19074t.m100205c(c25976a);
        c25976a.m9999J(true);
        RecyclerView recyclerView = this.f63325P0;
        AbstractC19074t.m100205c(recyclerView);
        recyclerView.setAdapter(this.f63332W0);
        RecyclerView recyclerView2 = this.f63325P0;
        AbstractC19074t.m100205c(recyclerView2);
        recyclerView2.setHasFixedSize(true);
        this.f63334Y0 = new LinearLayoutManager(this.f72421L0.m92648SI());
        RecyclerView recyclerView3 = this.f63325P0;
        AbstractC19074t.m100205c(recyclerView3);
        recyclerView3.setLayoutManager(this.f63334Y0);
        RecyclerView recyclerView4 = this.f63325P0;
        AbstractC19074t.m100205c(recyclerView4);
        recyclerView4.setItemAnimator(null);
        C31784b.m152808a(this.f63325P0).m152809b(new C31784b.d() { // from class: q70.j
            public /* synthetic */ C25150j() {
            }

            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView5, int i11, View view) {
                GroupTabView.m67771JM(GroupTabView.this, recyclerView5, i11, view);
            }
        });
        C31784b.m152808a(this.f63325P0).m152810c(new C31784b.e() { // from class: q70.k
            public /* synthetic */ C25151k() {
            }

            @Override // zc0.C31784b.e
            /* renamed from: T3 */
            public final boolean mo81113T3(RecyclerView recyclerView5, int i11, View view) {
                boolean m67772KM;
                m67772KM = GroupTabView.m67772KM(GroupTabView.this, recyclerView5, i11, view);
                return m67772KM;
            }
        });
        RecyclerView recyclerView5 = this.f63325P0;
        AbstractC19074t.m100205c(recyclerView5);
        recyclerView5.m9826E(new C12125d());
        RecyclerView recyclerView6 = this.f63325P0;
        AbstractC19074t.m100205c(recyclerView6);
        recyclerView6.setOnTouchListener(new View.OnTouchListener() { // from class: q70.l
            public /* synthetic */ ViewOnTouchListenerC25152l() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m67773LM;
                m67773LM = GroupTabView.m67773LM(GroupTabView.this, view, motionEvent);
                return m67773LM;
            }
        });
        m67780cN(AbstractC8020f0.empty_list);
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92692wK().mo35576n3() && C19669z.Companion.m103232a().m103226p0()) {
            ViewGroup viewGroup = this.f63322M0;
            AbstractC19074t.m100205c(viewGroup);
            viewGroup.setVisibility(8);
        } else {
            m67812YM(true, false);
        }
        C19637j.f97466a.m102840X();
    }

    /* renamed from: xM */
    public final Handler m67824xM() {
        return this.f63337b1;
    }

    /* renamed from: yM */
    public final HandlerThread m67825yM() {
        return this.f63339d1;
    }

    /* renamed from: zM */
    public final Runnable m67826zM() {
        return this.f63353r1;
    }
}
