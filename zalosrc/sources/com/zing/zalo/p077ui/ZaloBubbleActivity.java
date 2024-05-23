package com.zing.zalo.p077ui;

import ac.C0722p;
import ac.InterfaceC0724q;
import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1803x;
import au.C2350h0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7967l;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.backuprestore.detail.BackupDetailView;
import com.zing.zalo.p077ui.backuprestore.settings.SettingBackupRestoreView;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamPlaybackView;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.settings.SettingContactView;
import com.zing.zalo.p077ui.settings.SettingPrivateV2View;
import com.zing.zalo.p077ui.settings.SettingThemeV2View;
import com.zing.zalo.p077ui.settings.subsettings.SettingHiddenChatView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.FeedDetailsView;
import com.zing.zalo.p077ui.zviews.FindFriendByPhoneNumberView;
import com.zing.zalo.p077ui.zviews.ImageCommentView;
import com.zing.zalo.p077ui.zviews.ListContactNativeView;
import com.zing.zalo.p077ui.zviews.MiniProfileView;
import com.zing.zalo.p077ui.zviews.MutualFeedView;
import com.zing.zalo.p077ui.zviews.MyCalendarView;
import com.zing.zalo.p077ui.zviews.MyInfoView;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupView;
import com.zing.zalo.p077ui.zviews.StoryDetailsView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.p077ui.zviews.UserDetailsView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.report_v2.reportattachment.ReportAttachmentView;
import com.zing.zalo.report_v2.reportsuccess.ReportSuccessActionView;
import com.zing.zalo.report_v2.reportsummary.ReportSummaryView;
import com.zing.zalo.service.StartIntentFromBubbleService;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17489p0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import dg0.AbstractC17927b;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import h40.AbstractC19778a2;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import jm.AbstractC21289a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import me0.AbstractC23034c6;
import me0.AbstractC23088h5;
import me0.AbstractC23132l5;
import me0.AbstractC23152n3;
import me0.AbstractC23171p0;
import me0.AbstractC23202r9;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p304ks.AbstractC21935u;
import p363nh.C23744a;
import p405ov.C24559a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import tg.C26664o;
import u00.AbstractC26927i;
import u00.C26939u;
import v00.AbstractC27418m;
import vg.AbstractC28093i6;
import vg.C28023b6;
import vg.C28203u6;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class ZaloBubbleActivity extends BaseZaloActivity implements C2350h0.a, InterfaceC0724q {
    public static final C10966a Companion = new C10966a(null);

    /* renamed from: r0 */
    private static WeakReference f55456r0;

    /* renamed from: s0 */
    private static int f55457s0;

    /* renamed from: i0 */
    private String f55458i0 = "";

    /* renamed from: j0 */
    private String f55459j0 = "";

    /* renamed from: k0 */
    private FrameLayout f55460k0;

    /* renamed from: l0 */
    public View f55461l0;

    /* renamed from: m0 */
    private boolean f55462m0;

    /* renamed from: n0 */
    private StartIntentFromBubbleService f55463n0;

    /* renamed from: o0 */
    private boolean f55464o0;

    /* renamed from: p0 */
    private final InterfaceC24854k f55465p0;

    /* renamed from: q0 */
    private Intent f55466q0;

    /* renamed from: com.zing.zalo.ui.ZaloBubbleActivity$a */
    /* loaded from: classes5.dex */
    public static final class C10966a {
        private C10966a() {
        }

        public /* synthetic */ C10966a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: e */
        public static final void m57049e() {
            ZaloBubbleActivity zaloBubbleActivity;
            C10966a c10966a = ZaloBubbleActivity.Companion;
            if (c10966a.m57054h() && ZaloBubbleActivity.f55457s0 < 3) {
                WeakReference m57053g = c10966a.m57053g();
                if (m57053g != null && (zaloBubbleActivity = (ZaloBubbleActivity) m57053g.get()) != null) {
                    zaloBubbleActivity.onBackPressed();
                }
                AbstractC23350e.m122772b("ZaloBubbleActivity Force Minimize action", new Object[0]);
                AbstractC19444a.m101694b(new Runnable() { // from class: h40.g2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloBubbleActivity.C10966a.m57050f();
                    }
                }, 200L);
            }
        }

        /* renamed from: f */
        public static final void m57050f() {
            ZaloBubbleActivity.Companion.m57052d();
        }

        /* renamed from: c */
        public final ZaloBubbleActivity m57051c() {
            WeakReference m57053g = m57053g();
            if (m57053g != null) {
                return (ZaloBubbleActivity) m57053g.get();
            }
            return null;
        }

        /* renamed from: d */
        public final void m57052d() {
            ZaloBubbleActivity.f55457s0++;
            AbstractC23350e.m122772b("ZaloBubbleActivity Force Minimize request", new Object[0]);
            AbstractC19444a.m101695c(new Runnable() { // from class: h40.f2
                @Override // java.lang.Runnable
                public final void run() {
                    ZaloBubbleActivity.C10966a.m57049e();
                }
            });
        }

        /* renamed from: g */
        public final WeakReference m57053g() {
            return ZaloBubbleActivity.f55456r0;
        }

        /* renamed from: h */
        public final boolean m57054h() {
            if (m57051c() != null) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public final void m57055i() {
            List shortcuts;
            String id2;
            String id3;
            if (Build.VERSION.SDK_INT >= 30) {
                ShortcutManager m138783s = C26939u.m138770q().m138783s();
                AbstractC19074t.m100207e(m138783s, "getShortcutManager(...)");
                shortcuts = m138783s.getShortcuts(8);
                AbstractC19074t.m100207e(shortcuts, "getShortcuts(...)");
                ArrayList arrayList = new ArrayList();
                int size = shortcuts.size();
                for (int i11 = 0; i11 < size; i11++) {
                    id2 = AbstractC26927i.m138746a(shortcuts.get(i11)).getId();
                    AbstractC23350e.m122772b("Cached short cut at " + i11 + " " + id2, new Object[0]);
                    id3 = AbstractC26927i.m138746a(shortcuts.get(i11)).getId();
                    arrayList.add(id3);
                }
                m138783s.removeLongLivedShortcuts(arrayList);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloBubbleActivity$b */
    /* loaded from: classes5.dex */
    public static final class C10967b extends AbstractC17489p0 {
        C10967b() {
        }

        @Override // com.zing.zalo.zview.C17487o0
        /* renamed from: b0 */
        public void mo57056b0(boolean z11) {
            ZaloBubbleActivity.this.recreate();
        }

        @Override // com.zing.zalo.zview.AbstractC17489p0, com.zing.zalo.zview.C17487o0
        /* renamed from: c2 */
        public ZaloView mo57057c2(int i11, Class cls, Bundle bundle, int i12, String str, int i13, boolean z11) {
            String str2;
            AbstractC19074t.m100208f(cls, "zClass");
            if (ZaloBubbleActivity.this.m57041u5(cls, bundle) || C7967l.Companion.m42748b().m42734K()) {
                ZaloBubbleActivity.this.m57018D5(cls, bundle);
            } else if (ZaloBubbleActivity.this.m57023N4(cls, bundle)) {
                if (bundle != null) {
                    str2 = bundle.getString("extra_chat_profile_uid");
                } else {
                    str2 = null;
                }
                ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, str2, false, 2, null);
                if (m141800i == null) {
                    AbstractC19074t.m100205c(str2);
                    m141800i = new ContactProfile(str2);
                    m141800i.f42446v = bundle.getString("extra_chat_profile_avt");
                    m141800i.f42437s = bundle.getString("extra_chat_profile_dpn");
                }
                if (AbstractC23034c6.m118125K() && !AbstractC23171p0.m119373e() && !AbstractC21935u.m114550q(m141800i.f42434r)) {
                    C11318b m60525a = C11318b.Companion.m60525a();
                    String str3 = m141800i.f42434r;
                    AbstractC19074t.m100207e(str3, "uid");
                    if (!m60525a.m60515j(str3)) {
                        C28023b6.m141250h0().m141357l1(bundle, m141800i);
                    }
                }
                ZaloBubbleActivity.this.m57018D5(cls, bundle);
            } else {
                if (AbstractC19074t.m100204b(cls, ChatView.class) && bundle != null) {
                    bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                }
                return super.mo57057c2(i11, cls, bundle, i12, str, i13, z11);
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloBubbleActivity$c */
    /* loaded from: classes5.dex */
    public static final class C10968c implements Animator.AnimatorListener {
        C10968c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloBubbleActivity$d */
    /* loaded from: classes5.dex */
    public static final class C10969d implements Animator.AnimatorListener {

        /* renamed from: com.zing.zalo.ui.ZaloBubbleActivity$d$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f55469t;

            /* renamed from: u */
            final /* synthetic */ ZaloBubbleActivity f55470u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ZaloBubbleActivity zaloBubbleActivity, Continuation continuation) {
                super(2, continuation);
                this.f55470u = zaloBubbleActivity;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f55470u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f55469t == 0) {
                    AbstractC24862s.m129228b(obj);
                    if (!this.f55470u.f55462m0) {
                        this.f55470u.m57046o5().setVisibility(8);
                    }
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C10969d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            AbstractC1803x.m9388a(ZaloBubbleActivity.this).m9355c(new a(ZaloBubbleActivity.this, null));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloBubbleActivity$e */
    /* loaded from: classes5.dex */
    static final class C10970e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.ZaloBubbleActivity$e$a */
        /* loaded from: classes5.dex */
        public static final class a implements ServiceConnection {

            /* renamed from: p */
            final /* synthetic */ ZaloBubbleActivity f55472p;

            a(ZaloBubbleActivity zaloBubbleActivity) {
                this.f55472p = zaloBubbleActivity;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                AbstractC19074t.m100206d(iBinder, "null cannot be cast to non-null type com.zing.zalo.service.StartIntentFromBubbleService.StartIntentBinder");
                this.f55472p.f55463n0 = ((StartIntentFromBubbleService.BinderC9355a) iBinder).m50449a();
                this.f55472p.f55464o0 = true;
                this.f55472p.m57032a6();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                this.f55472p.f55464o0 = false;
            }
        }

        C10970e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final a mo12V4() {
            return new a(ZaloBubbleActivity.this);
        }
    }

    public ZaloBubbleActivity() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C10970e());
        this.f55465p0 = m129210a;
    }

    /* renamed from: B5 */
    public static final boolean m57017B5() {
        return Companion.m57054h();
    }

    /* renamed from: D5 */
    public final void m57018D5(Class cls, Bundle bundle) {
        Intent m119014P;
        if (AbstractC19074t.m100204b(cls, ZaloCameraView.class)) {
            m119014P = AbstractC23152n3.m119018R(cls, bundle);
        } else {
            m119014P = AbstractC23152n3.m119014P(cls, bundle, false);
        }
        AbstractC19074t.m100205c(m119014P);
        m119014P.addFlags(268435456);
        startActivity(m119014P);
        Companion.m57052d();
    }

    /* renamed from: E5 */
    public static final void m57019E5() {
        AbstractC21289a.Companion.m110248b().set(true);
    }

    /* renamed from: M5 */
    public static final void m57022M5(ZaloBubbleActivity zaloBubbleActivity) {
        AbstractC19074t.m100208f(zaloBubbleActivity, "this$0");
        if (zaloBubbleActivity.m57046o5().getVisibility() == 0 && zaloBubbleActivity.f55462m0) {
            zaloBubbleActivity.f55462m0 = false;
            AbstractC23202r9.m119541i(zaloBubbleActivity.m57046o5(), 500L, new C10969d());
        }
    }

    /* renamed from: N4 */
    public final boolean m57023N4(Class cls, Bundle bundle) {
        String str;
        if (AbstractC19074t.m100204b(cls, ChatView.class) && bundle != null && bundle.containsKey("extra_chat_profile_uid")) {
            String string = bundle.getString("extra_chat_profile_uid");
            if (mo35575n1() instanceof ZaloBubbleActivity) {
                Activity mo35575n1 = mo35575n1();
                AbstractC19074t.m100206d(mo35575n1, "null cannot be cast to non-null type com.zing.zalo.ui.ZaloBubbleActivity");
                str = ((ZaloBubbleActivity) mo35575n1).m57033d5();
            } else {
                str = "";
            }
            return !AbstractC19074t.m100204b(str, C28023b6.m141250h0().m141338e0(AbstractC23088h5.m118423d(AbstractC19646n0.m103043x0(string), string)));
        }
        return false;
    }

    /* renamed from: O4 */
    private final void m57024O4() {
        if (this.f55464o0) {
            unbindService(m57036i5());
            this.f55464o0 = false;
        }
    }

    /* renamed from: R5 */
    private final void m57025R5(Intent intent, Bundle bundle) {
        intent.addFlags(268435456);
        switch (Build.VERSION.SDK_INT) {
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
            case 31:
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                this.f55466q0 = intent;
                if (!this.f55464o0) {
                    Intent intent2 = new Intent(this, (Class<?>) StartIntentFromBubbleService.class);
                    if (bundle != null) {
                        intent2.putExtras(bundle);
                    }
                    bindService(intent2, m57036i5(), 1);
                    return;
                }
                m57032a6();
                return;
            default:
                super.startActivityForResult(intent, -1, bundle);
                return;
        }
    }

    /* renamed from: S5 */
    static /* synthetic */ void m57026S5(ZaloBubbleActivity zaloBubbleActivity, Intent intent, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        zaloBubbleActivity.m57025R5(intent, bundle);
    }

    /* renamed from: V4 */
    public static final ZaloBubbleActivity m57028V4() {
        return Companion.m57051c();
    }

    /* renamed from: a5 */
    public static final void m57031a5() {
        Companion.m57052d();
    }

    /* renamed from: a6 */
    public final void m57032a6() {
        Intent intent = this.f55466q0;
        if (intent != null) {
            StartIntentFromBubbleService startIntentFromBubbleService = this.f55463n0;
            if (startIntentFromBubbleService != null) {
                startIntentFromBubbleService.m50448a(intent);
            }
            this.f55466q0 = null;
        }
    }

    /* renamed from: d5 */
    private final String m57033d5() {
        return this.f55458i0;
    }

    /* renamed from: e5 */
    private final C17487o0 m57035e5() {
        return new C10967b();
    }

    /* renamed from: i5 */
    private final ServiceConnection m57036i5() {
        return (ServiceConnection) this.f55465p0.getValue();
    }

    /* renamed from: s5 */
    private final void m57038s5(Bundle bundle) {
        Serializable serializable;
        boolean z11;
        if (bundle != null) {
            serializable = bundle.getSerializable("ACTION_SHOW_ZALO_VIEW_EXTRA_CLASS");
        } else {
            serializable = null;
        }
        if ((serializable instanceof Class) && ChatView.class.isAssignableFrom((Class) serializable)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (bundle != null && z11) {
            if (!AbstractC21935u.m114550q(this.f55459j0) && !C7967l.Companion.m42748b().m42734K()) {
                C17487o0 mo35579p = mo35579p();
                if (mo35579p != null) {
                    mo35579p.mo57057c2(AbstractC6918a0.zalo_view_container, ChatView.class, bundle, 0, null, 1, true);
                    return;
                }
                return;
            }
            finish();
            m57018D5(ChatView.class, bundle);
            return;
        }
        AbstractC23350e.m122778h(new Exception("Can not pass a null Intent to ZaloBubbleActivity!"));
        finish();
    }

    /* renamed from: u5 */
    public final boolean m57041u5(Class cls, Bundle bundle) {
        if (AbstractC19074t.m100204b(cls, MainTabView.class) || AbstractC19074t.m100204b(cls, ShareView.class) || AbstractC19074t.m100204b(cls, MyInfoView.class) || AbstractC19074t.m100204b(cls, UserDetailsView.class) || AbstractC19074t.m100204b(cls, MutualFeedView.class) || AbstractC19074t.m100204b(cls, FeedDetailsView.class) || AbstractC19074t.m100204b(cls, ImageCommentView.class) || AbstractC19074t.m100204b(cls, UpdateStatusView.class) || AbstractC19074t.m100204b(cls, MiniProfileView.class) || AbstractC19074t.m100204b(cls, GroupLiveStreamView.class) || AbstractC19074t.m100204b(cls, GroupLiveStreamPlaybackView.class) || AbstractC19074t.m100204b(cls, QuickCreateGroupView.class) || AbstractC19074t.m100204b(cls, MyCalendarView.class) || AbstractC19074t.m100204b(cls, FindFriendByPhoneNumberView.class) || AbstractC19074t.m100204b(cls, SettingHiddenChatView.class) || AbstractC19074t.m100204b(cls, ZaloWebView.class) || AbstractC19074t.m100204b(cls, ListContactNativeView.class) || AbstractC19074t.m100204b(cls, SettingContactView.class) || AbstractC19074t.m100204b(cls, SettingThemeV2View.class) || AbstractC19074t.m100204b(cls, BackupDetailView.class) || AbstractC19074t.m100204b(cls, SettingBackupRestoreView.class) || AbstractC19074t.m100204b(cls, SettingPrivateV2View.class) || AbstractC19074t.m100204b(cls, StoryDetailsView.class)) {
            return true;
        }
        if ((AbstractC19074t.m100204b(cls, ZaloCameraView.class) && bundle != null && bundle.getBoolean("BUNDLE_FORCE_OPEN_MAIN_APP", false)) || AbstractC19074t.m100204b(cls, ReportSummaryView.class) || AbstractC19074t.m100204b(cls, ReportAttachmentView.class) || AbstractC19074t.m100204b(cls, ReportSuccessActionView.class) || AbstractC27418m.Companion.m140402a(cls)) {
            return true;
        }
        return false;
    }

    @Override // au.C2350h0.a
    /* renamed from: A */
    public void mo12326A() {
        C23212s8.m119600g(this, false, 0, 0, 14, null);
    }

    /* renamed from: H5 */
    public final void m57045H5(String str, long j11) {
        AbstractC19074t.m100208f(str, "mess");
        if (this.f55461l0 != null) {
            View m57046o5 = m57046o5();
            if (str.length() > 0) {
                this.f55462m0 = true;
                m57046o5.setVisibility(0);
                AbstractC23202r9.m119539g(m57046o5(), 500L, new C10968c());
                RobotoTextView robotoTextView = (RobotoTextView) m57046o5.findViewById(AbstractC6918a0.text);
                if (robotoTextView != null) {
                    robotoTextView.setText(str);
                }
                m57046o5.bringToFront();
                AbstractC17927b.Companion.m94536b().mo94530d("HIDE_TOAST_ZALO_BUBBLE_ACTIVITY", new Runnable() { // from class: h40.c2
                    public /* synthetic */ RunnableC19786c2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloBubbleActivity.m57022M5(ZaloBubbleActivity.this);
                    }
                }, j11);
            }
        }
    }

    @Override // ac.InterfaceC0724q
    /* renamed from: l0 */
    public C0722p.b mo1166l0() {
        return C0722p.b.BUBBLE;
    }

    /* renamed from: o5 */
    public final View m57046o5() {
        View view = this.f55461l0;
        if (view != null) {
            return view;
        }
        AbstractC19074t.m100223u("toastLayout");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        byte[] bArr;
        this.f37914M = m57035e5();
        requestWindowFeature(1);
        super.onCreate(bundle);
        BaseZaloActivity.Companion.m56698b();
        int hashCode = hashCode();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hashCode);
        sb2.append(": onCreate()");
        C24559a.m127933c("[ZaloBubbleActivity]", hashCode() + ": onCreate()");
        FrameLayout frameLayout = new FrameLayout(this);
        this.f55460k0 = frameLayout;
        frameLayout.setId(AbstractC6918a0.zalo_view_container);
        FrameLayout frameLayout2 = this.f55460k0;
        if (frameLayout2 == null) {
            AbstractC19074t.m100223u("rootFrameLayout");
            frameLayout2 = null;
        }
        setContentView(frameLayout2, new ViewGroup.LayoutParams(-1, -1));
        View inflate = LayoutInflater.from(this).inflate(AbstractC7409c0.toast_layout, (ViewGroup) null);
        AbstractC19074t.m100207e(inflate, "inflate(...)");
        setToastLayout(inflate);
        m57046o5().setAlpha(0.0f);
        m57046o5().setVisibility(8);
        FrameLayout frameLayout3 = this.f55460k0;
        if (frameLayout3 == null) {
            AbstractC19074t.m100223u("rootFrameLayout");
            frameLayout3 = null;
        }
        frameLayout3.addView(m57046o5(), new FrameLayout.LayoutParams(-2, -2, 17));
        this.f37914M.m93043W1(5);
        Intent intent = getIntent();
        if (intent != null) {
            bArr = intent.getByteArrayExtra("EXTRA_BUBBLE_DATA");
        } else {
            bArr = null;
        }
        Bundle readBundle = AbstractC23132l5.m118634b(bArr).readBundle(getClassLoader());
        if (readBundle != null) {
            String string = readBundle.getString("extra_bubble_shortcut_id", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f55458i0 = string;
            String string2 = readBundle.getString("extra_chat_profile_uid", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f55459j0 = string2;
            C28023b6.m141250h0().m141341f(this.f55458i0);
            AbstractC19778a2.m103529a();
            setLocusContext(AbstractC28093i6.m141566a(this.f55458i0), null);
        }
        if (bundle == null) {
            m57038s5(readBundle);
        }
        C2350h0.f9867a.m12323a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BaseZaloActivity.Companion.m56698b();
        int hashCode = hashCode();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hashCode);
        sb2.append(": onDestroy()");
        C24559a.m127933c("[ZaloBubbleActivity]", hashCode() + ": onDestroy()");
        C28023b6.m141250h0().m141335c2(this.f55458i0);
        C2350h0.f9867a.m12325c(this);
        if (AbstractC21935u.m114550q(this.f55459j0)) {
            C28023b6.m141250h0().m141285G(this.f55459j0, true);
        }
        m57024O4();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (m57046o5().getVisibility() == 0) {
            m57046o5().setAlpha(0.0f);
            m57046o5().setVisibility(8);
            this.f55462m0 = false;
        }
        BaseZaloActivity.Companion.m56698b();
        int hashCode = hashCode();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hashCode);
        sb2.append(": onPause()");
        f55456r0 = null;
        C23744a.Companion.m124119a().m124116d(6019, this.f55459j0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        BaseZaloActivity.Companion.m56698b();
        int hashCode = hashCode();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hashCode);
        sb2.append(": onResume()");
        f55456r0 = new WeakReference(this);
        f55457s0 = 0;
        AbstractC19444a.m101695c(new Runnable() { // from class: h40.b2
            @Override // java.lang.Runnable
            public final void run() {
                ZaloBubbleActivity.m57019E5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        AbstractC21289a.Companion.m110248b().set(false);
    }

    @Override // com.zing.zalo.analytics.ZaloTrackingActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onTopResumedActivityChanged(boolean z11) {
        super.onTopResumedActivityChanged(z11);
        if (C26664o.m136836a().m136838c()) {
            C23744a.Companion.m124119a().m124116d(12002, new Object[0]);
        }
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, android.app.Activity, p542ub.InterfaceC27218a
    public void setRequestedOrientation(int i11) {
    }

    public final void setToastLayout(View view) {
        AbstractC19074t.m100208f(view, "<set-?>");
        this.f55461l0 = view;
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC19074t.m100208f(intent, "intent");
        m57025R5(intent, bundle);
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i11, Bundle bundle) {
        AbstractC19074t.m100208f(intent, "intent");
        if (i11 != -1) {
            super.startActivityForResult(intent, i11, bundle);
        } else {
            m57025R5(intent, bundle);
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, p542ub.InterfaceC27218a
    /* renamed from: v2 */
    public boolean mo35586v2() {
        return true;
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context, p542ub.InterfaceC27218a
    public void startActivity(Intent intent) {
        AbstractC19074t.m100208f(intent, "intent");
        m57026S5(this, intent, null, 2, null);
    }
}
