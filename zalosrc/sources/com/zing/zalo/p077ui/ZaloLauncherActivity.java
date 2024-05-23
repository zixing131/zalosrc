package com.zing.zalo.p077ui;

import ac.C0722p;
import ac.InterfaceC0724q;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import ag0.C0832n;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import am.RunnableC0940u0;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.lifecycle.AbstractC1803x;
import com.google.android.play.core.appupdate.AbstractC6474c;
import com.google.android.play.core.appupdate.C6470a;
import com.google.android.play.core.appupdate.InterfaceC6472b;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.feed.mvp.music.controller.InterruptMusicController;
import com.zing.zalo.feed.mvp.quickcomment.QuickCommentView;
import com.zing.zalo.libbubbleview.AbstractC8950c;
import com.zing.zalo.p062db.C7967l;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.backuprestore.restore.RestoreMessageStartupView;
import com.zing.zalo.p077ui.chattag.C11837a;
import com.zing.zalo.p077ui.floatingmp3.C11891a;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.settings.SettingNotificationV2View;
import com.zing.zalo.p077ui.widget.ZaloInsetsLayout;
import com.zing.zalo.p077ui.zdb.ZdbMigrateView;
import com.zing.zalo.p077ui.zviews.FeedDetailsView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.ImageCommentView;
import com.zing.zalo.p077ui.zviews.InAppNotificationView;
import com.zing.zalo.p077ui.zviews.LiveLocationSharingListView;
import com.zing.zalo.p077ui.zviews.MPWebView;
import com.zing.zalo.p077ui.zviews.MiniAppBaseView;
import com.zing.zalo.p077ui.zviews.MiniAppFloatingAnimView;
import com.zing.zalo.p077ui.zviews.OpenPermisionsSettingView;
import com.zing.zalo.p077ui.zviews.ServerMaintenanceView;
import com.zing.zalo.p077ui.zviews.StartUpView;
import com.zing.zalo.p077ui.zviews.TempShareViaView;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.p077ui.zviews.ZinstantZaloView;
import com.zing.zalo.register.StartUpNewView;
import com.zing.zalo.service.SmsReceiverService;
import com.zing.zalo.service.TaskNonStickyExecutor;
import com.zing.zalo.service.ZaloIntentServiceEmulate;
import com.zing.zalo.service.ZaloKeepAliveService;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.C16769g;
import com.zing.zalo.utils.systemui.C16772j;
import com.zing.zalo.webview.C16786d;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.AbstractC17452c;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import d60.C17793b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fh0.AbstractC18942g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ge0.C19429b;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import gw.C19636i1;
import gy.C19681e;
import h40.AbstractC19806h2;
import h40.AbstractC19814j2;
import h40.AbstractC19822l2;
import ho0.AbstractC20110a;
import i30.C20223b;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jm.AbstractC21289a;
import kn.AbstractC21777d;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23059e9;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23165o5;
import me0.AbstractC23224t9;
import me0.C23058e8;
import me0.C23212s8;
import mk.C23331i;
import mm0.AbstractC23350e;
import mx.C23475l;
import nh0.C23793c;
import o70.C24099q0;
import org.json.JSONObject;
import p142ey.C18637g;
import p142ey.C18644n;
import p163fl.C18989a;
import p173fz.C19172a;
import p189gv.C19609h;
import p248iy.AbstractC20887g;
import p307kv.AbstractC21954k;
import p320ld.C22438j;
import p342m6.InterfaceC22882g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p645xh.AbstractC29633j;
import p716zh.C31995kc;
import p716zh.C32085r0;
import p716zh.C32150v9;
import p716zh.C32205z8;
import pm.C24834e;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import rh0.C25798f;
import s00.AbstractC26084s;
import u00.C26939u;
import um0.InterfaceC27315f;
import vg.AbstractC28105j8;
import vg.AbstractC28207v1;
import vg.C28023b6;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xh0.C29667y;
import yf0.C30946k;

/* loaded from: classes.dex */
public final class ZaloLauncherActivity extends BaseZaloActivity implements InterfaceC0724q, C23744a.c {

    /* renamed from: A0 */
    private static long f55473A0;
    public static final C10971a Companion = new C10971a(null);

    /* renamed from: u0 */
    private static final String f55474u0;

    /* renamed from: v0 */
    private static WeakReference f55475v0;

    /* renamed from: w0 */
    private static boolean f55476w0;

    /* renamed from: x0 */
    private static boolean f55477x0;

    /* renamed from: y0 */
    private static boolean f55478y0;

    /* renamed from: z0 */
    private static InterfaceC6472b f55479z0;

    /* renamed from: i0 */
    private boolean f55480i0;

    /* renamed from: j0 */
    private boolean f55481j0;

    /* renamed from: k0 */
    private C0722p.b f55482k0 = C0722p.b.APP_LAUNCHER;

    /* renamed from: l0 */
    private final InterfaceC24854k f55483l0;

    /* renamed from: m0 */
    private final InterfaceC24854k f55484m0;

    /* renamed from: n0 */
    private int f55485n0;

    /* renamed from: o0 */
    private final InterfaceC24854k f55486o0;

    /* renamed from: p0 */
    private boolean f55487p0;

    /* renamed from: q0 */
    private ZaloInsetsLayout f55488q0;

    /* renamed from: r0 */
    private int f55489r0;

    /* renamed from: s0 */
    private boolean f55490s0;

    /* renamed from: t0 */
    private boolean f55491t0;

    /* renamed from: com.zing.zalo.ui.ZaloLauncherActivity$a */
    /* loaded from: classes.dex */
    public static final class C10971a {
        private C10971a() {
        }

        public /* synthetic */ C10971a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m57109a(Class cls) {
            ZaloLauncherActivity zaloLauncherActivity;
            ZaloView m93012K0;
            AbstractC19074t.m100208f(cls, "cls");
            try {
                WeakReference m57113e = m57113e();
                if (m57113e != null) {
                    zaloLauncherActivity = (ZaloLauncherActivity) m57113e.get();
                } else {
                    zaloLauncherActivity = null;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(m57114f(), e11);
            }
            if (zaloLauncherActivity == null || !zaloLauncherActivity.m56695v3() || (m93012K0 = zaloLauncherActivity.mo35579p().m93012K0()) == null) {
                return false;
            }
            if (cls.isInstance(m93012K0)) {
                return true;
            }
            if (m93012K0.m92649TI().m92993D0(cls) == null) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final void m57110b() {
            ZaloLauncherActivity zaloLauncherActivity;
            try {
                WeakReference m57113e = m57113e();
                if (m57113e != null && (zaloLauncherActivity = (ZaloLauncherActivity) m57113e.get()) != null) {
                    AbstractC23136l9.m118680U0(zaloLauncherActivity, false);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: c */
        public final InterfaceC6472b m57111c() {
            return ZaloLauncherActivity.f55479z0;
        }

        /* renamed from: d */
        public final InterfaceC27218a m57112d() {
            ZaloLauncherActivity zaloLauncherActivity;
            try {
                WeakReference m57113e = m57113e();
                if (m57113e != null) {
                    zaloLauncherActivity = (ZaloLauncherActivity) m57113e.get();
                } else {
                    zaloLauncherActivity = null;
                }
                if (zaloLauncherActivity == null) {
                    return null;
                }
                if (!zaloLauncherActivity.m56695v3()) {
                    return null;
                }
                return zaloLauncherActivity;
            } catch (Exception e11) {
                AbstractC23350e.m122776f(m57114f(), e11);
                return null;
            }
        }

        /* renamed from: e */
        public final WeakReference m57113e() {
            return ZaloLauncherActivity.f55475v0;
        }

        /* renamed from: f */
        public final String m57114f() {
            return ZaloLauncherActivity.f55474u0;
        }

        /* renamed from: g */
        public final long m57115g() {
            return ZaloLauncherActivity.f55473A0;
        }

        /* renamed from: h */
        public final ZaloView m57116h() {
            ZaloLauncherActivity zaloLauncherActivity;
            try {
                WeakReference m57113e = m57113e();
                if (m57113e != null) {
                    zaloLauncherActivity = (ZaloLauncherActivity) m57113e.get();
                } else {
                    zaloLauncherActivity = null;
                }
                if (zaloLauncherActivity != null && zaloLauncherActivity.m56695v3()) {
                    return zaloLauncherActivity.mo35579p().m93012K0();
                }
                return null;
            } catch (Exception e11) {
                AbstractC23350e.m122776f(m57114f(), e11);
                return null;
            }
        }

        /* renamed from: i */
        public final boolean m57117i() {
            ZaloLauncherActivity zaloLauncherActivity;
            try {
                WeakReference m57113e = m57113e();
                if (m57113e != null) {
                    zaloLauncherActivity = (ZaloLauncherActivity) m57113e.get();
                } else {
                    zaloLauncherActivity = null;
                }
                if (zaloLauncherActivity != null && zaloLauncherActivity.m56695v3()) {
                    if (zaloLauncherActivity.mo35579p().m93012K0() == null) {
                        return false;
                    }
                    return true;
                }
                return false;
            } catch (Exception e11) {
                AbstractC23350e.m122776f(m57114f(), e11);
                return false;
            }
        }

        /* renamed from: j */
        public final Bundle m57118j(PersistableBundle persistableBundle) {
            AbstractC19074t.m100208f(persistableBundle, "persistableBundle");
            Set<String> keySet = persistableBundle.keySet();
            Bundle bundle = new Bundle();
            for (String str : keySet) {
                Object obj = persistableBundle.get(str);
                if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(str, ((Number) obj).intValue());
                } else if (obj instanceof String) {
                    bundle.putString(str, (String) obj);
                } else if (obj instanceof Object[]) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (obj instanceof PersistableBundle) {
                    bundle.putBundle(str, m57118j((PersistableBundle) obj));
                }
            }
            return bundle;
        }

        /* renamed from: k */
        public final void m57119k(InterfaceC6472b interfaceC6472b) {
            ZaloLauncherActivity.f55479z0 = interfaceC6472b;
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloLauncherActivity$b */
    /* loaded from: classes.dex */
    static final class C10972b extends AbstractC19075u implements InterfaceC18494a {
        C10972b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C10974d mo12V4() {
            return ZaloLauncherActivity.this.m57093o5();
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloLauncherActivity$c */
    /* loaded from: classes.dex */
    public static final class C10973c implements C17487o0.l {
        C10973c() {
        }

        /* renamed from: b */
        public static final void m57122b(ZaloLauncherActivity zaloLauncherActivity, ZaloView zaloView) {
            AbstractC19074t.m100208f(zaloLauncherActivity, "this$0");
            C30946k m150528a = C30946k.Companion.m150528a();
            Bundle m92642L3 = zaloView.m92642L3();
            AbstractC19074t.m100205c(m92642L3);
            m150528a.m150525w(zaloLauncherActivity, m92642L3.getInt("MP_TASK_ID"));
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: gp */
        public void mo35571gp(ZaloView zaloView) {
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: o7 */
        public void mo35578o7(ZaloView zaloView) {
            Window window;
            if (!(zaloView instanceof MiniAppBaseView) && (window = ZaloLauncherActivity.this.getWindow()) != null) {
                window.setStatusBarColor(AbstractC23136l9.m118641B(ZaloLauncherActivity.this.getContext(), AbstractC17452c.statusBarColor));
            }
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: r5 */
        public void mo35582r5(ZaloView zaloView) {
            ZaloView zaloView2;
            Bundle m92642L3;
            Bundle bundle;
            int i11;
            Bundle m92642L32;
            Bundle m92642L33;
            C17487o0 mo35579p = ZaloLauncherActivity.this.mo35579p();
            ZaloView zaloView3 = null;
            if (mo35579p != null) {
                zaloView2 = mo35579p.m93012K0();
            } else {
                zaloView2 = null;
            }
            C17487o0 mo35579p2 = ZaloLauncherActivity.this.mo35579p();
            if (mo35579p2 != null) {
                zaloView3 = mo35579p2.m93004H0();
            }
            if (zaloView3 != null && (m92642L33 = zaloView3.m92642L3()) != null && m92642L33.containsKey("MP_TASK_ID")) {
                return;
            }
            if (zaloView != null && AbstractC19074t.m100204b(zaloView, zaloView2) && zaloView != null && (m92642L32 = zaloView.m92642L3()) != null && m92642L32.containsKey("MP_TASK_ID")) {
                AbstractC19444a.m101695c(new Runnable() { // from class: h40.y2

                    /* renamed from: q */
                    public final /* synthetic */ ZaloView f98044q;

                    public /* synthetic */ RunnableC19874y2(ZaloView zaloView4) {
                        r2 = zaloView4;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloLauncherActivity.C10973c.m57122b(ZaloLauncherActivity.this, r2);
                    }
                });
                return;
            }
            if (zaloView4 != null && (m92642L3 = zaloView4.m92642L3()) != null && m92642L3.containsKey("MP_TASK_ID")) {
                if (zaloView2 == null || (bundle = zaloView2.m92642L3()) == null) {
                    bundle = new Bundle();
                }
                Bundle m92642L34 = zaloView4.m92642L3();
                if (m92642L34 != null) {
                    i11 = m92642L34.getInt("MP_TASK_ID");
                } else {
                    i11 = 0;
                }
                bundle.putInt("MP_TASK_ID", i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloLauncherActivity$d */
    /* loaded from: classes.dex */
    public static final class C10974d implements Application.ActivityLifecycleCallbacks {
        C10974d() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC19074t.m100208f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            ZaloLauncherActivity.this.m57107g7(false);
            ZaloLauncherActivity.this.f55491t0 = true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC19074t.m100208f(activity, "activity");
            AbstractC19074t.m100208f(bundle, "outState");
            ZaloLauncherActivity.this.m57107g7(true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            AbstractC21289a.Companion.m110248b().set(true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            ZaloLauncherActivity.this.f55491t0 = false;
            AbstractC21289a.Companion.m110248b().set(false);
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloLauncherActivity$e */
    /* loaded from: classes5.dex */
    public static final class C10975e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f55495t;

        /* renamed from: v */
        final /* synthetic */ ZaloView f55497v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10975e(ZaloView zaloView, Continuation continuation) {
            super(2, continuation);
            this.f55497v = zaloView;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10975e(this.f55497v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Uri uri;
            Object parcelable;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f55495t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Bundle extras = ZaloLauncherActivity.this.getIntent().getExtras();
                if (extras != null && extras.containsKey("android.intent.extra.STREAM")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = extras.getParcelable("android.intent.extra.STREAM", Uri.class);
                        uri = (Uri) parcelable;
                    } else {
                        uri = (Uri) extras.getParcelable("android.intent.extra.STREAM");
                    }
                    if (uri != null) {
                        String type = ZaloLauncherActivity.this.getIntent().getType();
                        if (type == null) {
                            type = "";
                        }
                        C32205z8.c cVar = new C32205z8.c(uri, type, null);
                        C19429b c19429b = new C19429b();
                        C19429b.a aVar = new C19429b.a(cVar, null, null, 0);
                        this.f55495t = 1;
                        obj = c19429b.m101498a(aVar, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                }
                return C24848g0.f119245a;
            }
            String str = (String) obj;
            if (str != null && str.length() != 0) {
                ZaloView zaloView = this.f55497v;
                if (zaloView instanceof FrameLayoutKeepBtmSheetZaloView) {
                    ZaloView m92996E0 = ((FrameLayoutKeepBtmSheetZaloView) zaloView).m92649TI().m92996E0("CommonZaloview");
                    if (m92996E0 instanceof QuickCommentView) {
                        ((QuickCommentView) m92996E0).m46532ON(str);
                    }
                } else if (zaloView instanceof FeedDetailsView) {
                    ((FeedDetailsView) zaloView).m79621WO(str);
                } else if (zaloView instanceof ImageCommentView) {
                    ((ImageCommentView) zaloView).m80824DO(str);
                } else {
                    return C24848g0.f119245a;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10975e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloLauncherActivity$f */
    /* loaded from: classes.dex */
    static final class C10976f extends AbstractC19075u implements InterfaceC18509p {
        C10976f() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a */
        public final C16769g mo240pC(C16769g c16769g, C16772j c16772j) {
            int m119607o;
            int i11;
            boolean m119603k;
            AbstractC19074t.m100208f(c16769g, "$this$doOnApplySystemUI");
            AbstractC19074t.m100208f(c16772j, "it");
            if (c16769g.m89492c() == null || c16769g.m89493d() == null || c16769g.m89499j() == null) {
                C16769g.a aVar = new C16769g.a(c16769g);
                Integer m89492c = c16769g.m89492c();
                if (m89492c != null) {
                    m119607o = m89492c.intValue();
                } else {
                    m119607o = C23212s8.m119607o(ZaloLauncherActivity.this.getContext(), AbstractC16781w.PrimaryBackgroundColor);
                }
                C16769g.a m89504d = aVar.m89504d(Integer.valueOf(m119607o));
                Integer m89493d = c16769g.m89493d();
                if (m89493d != null) {
                    i11 = m89493d.intValue();
                } else {
                    i11 = 0;
                }
                C16769g.a m89505e = m89504d.m89505e(Integer.valueOf(i11));
                Boolean m89499j = c16769g.m89499j();
                if (m89499j != null) {
                    m119603k = m89499j.booleanValue();
                } else {
                    m119603k = C23212s8.m119603k();
                }
                return m89505e.m89503c(Boolean.valueOf(m119603k)).m89501a();
            }
            return c16769g;
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloLauncherActivity$g */
    /* loaded from: classes5.dex */
    static final class C10977g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f55499t;

        C10977g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10977g(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f55499t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC20110a.f98889a.mo104548a("doGetCurrentInfo", new Object[0]);
                AbstractC23304d.m120534e();
                AbstractC28105j8.m141584f(MainApplication.Companion.m35500c());
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10977g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloLauncherActivity$h */
    /* loaded from: classes5.dex */
    static final class C10978h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f55500t;

        C10978h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10978h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f55500t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC20110a.f98889a.mo104548a("registerClipboardListener", new Object[0]);
                C32085r0.m154802c().m154808i();
                C32085r0.m154802c().m154806d(false, true);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10978h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloLauncherActivity$i */
    /* loaded from: classes.dex */
    static final class C10979i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10979i f55501q = new C10979i();

        C10979i() {
            super(1);
        }

        /* renamed from: a */
        public final void m57127a(C6470a c6470a) {
            AbstractC19074t.m100208f(c6470a, "appUpdateInfo");
            if (c6470a.m33326b() == 11) {
                InterfaceC6472b m57111c = ZaloLauncherActivity.Companion.m57111c();
                AbstractC19074t.m100205c(m57111c);
                m57111c.mo33336a();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57127a((C6470a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloLauncherActivity$j */
    /* loaded from: classes5.dex */
    public static final class C10980j extends AbstractC0939u {
        C10980j() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C28023b6.m141262r2();
                AbstractC23304d.f113447v1 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122776f(ZaloLauncherActivity.Companion.m57114f(), e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloLauncherActivity$k */
    /* loaded from: classes.dex */
    static final class C10981k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10981k f55502q = new C10981k();

        C10981k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C20223b mo12V4() {
            return AbstractC23306f.m120564A1();
        }
    }

    /* renamed from: com.zing.zalo.ui.ZaloLauncherActivity$l */
    /* loaded from: classes.dex */
    static final class C10982l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10982l f55503q = new C10982l();

        C10982l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C18989a mo12V4() {
            return AbstractC23306f.m120567B1();
        }
    }

    static {
        String simpleName = ZaloLauncherActivity.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f55474u0 = simpleName;
        f55476w0 = true;
    }

    public ZaloLauncherActivity() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(C10981k.f55502q);
        this.f55483l0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C10982l.f55503q);
        this.f55484m0 = m129210a2;
        this.f55485n0 = 1;
        m129210a3 = AbstractC24856m.m129210a(new C10972b());
        this.f55486o0 = m129210a3;
        this.f55490s0 = true;
        this.f55491t0 = true;
    }

    /* renamed from: B5 */
    private final Application.ActivityLifecycleCallbacks m57060B5() {
        return (Application.ActivityLifecycleCallbacks) this.f55486o0.getValue();
    }

    /* renamed from: E5 */
    public static final InterfaceC27218a m57061E5() {
        return Companion.m57112d();
    }

    /* renamed from: G6 */
    public static final void m57063G6(ZaloLauncherActivity zaloLauncherActivity, JSONObject jSONObject) {
        AbstractC19074t.m100208f(zaloLauncherActivity, "this$0");
        AbstractC19074t.m100208f(jSONObject, "$jsonData");
        C10971a c10971a = Companion;
        if (!c10971a.m57109a(ZinstantZaloView.class)) {
            if (!(c10971a.m57116h() instanceof OpenPermisionsSettingView) || zaloLauncherActivity.mo35579p().m92993D0(ZinstantZaloView.class) == null) {
                AbstractC28207v1.m141994i3("action.open.zinstantview", 1, zaloLauncherActivity, null, jSONObject.toString(), null);
            }
        }
    }

    /* renamed from: H5 */
    private final C20223b m57065H5() {
        return (C20223b) this.f55483l0.getValue();
    }

    /* renamed from: J6 */
    public static final void m57066J6(InterfaceC18505l interfaceC18505l, Object obj) {
        AbstractC19074t.m100208f(interfaceC18505l, "$tmp0");
        interfaceC18505l.mo205i9(obj);
    }

    /* renamed from: M5 */
    private final C18989a m57067M5() {
        return (C18989a) this.f55484m0.getValue();
    }

    /* renamed from: R5 */
    public static final ZaloView m57070R5() {
        return Companion.m57116h();
    }

    /* renamed from: S5 */
    private final void m57071S5(boolean z11) {
        int i11 = 0;
        AbstractC20110a.f98889a.mo104548a("goToStartUpFlow: %b", Boolean.valueOf(z11));
        AbstractC23647d.m123907q("19100", "");
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (this.f55480i0) {
                extras.putBoolean("BOL_EXTRA_LOGOUT_GET_FLOW_LOGIN", true);
            }
            bundle.putAll(extras);
        }
        bundle.putBoolean("EXTRA_IGNORE_RESUME_REGISTER", true);
        C17487o0 mo35579p = mo35579p();
        if (z11) {
            i11 = 2;
        }
        mo35579p.m93069k2(StartUpNewView.class, bundle, i11, true);
        AbstractC23647d.m123893c();
    }

    /* renamed from: X6 */
    public static final void m57077X6() {
        try {
            if (C19172a.m100600k("zalosdk@preload@wakeup@wakeup_on_show_activity", 0) == 1) {
                AbstractC18942g.m99261q(MainApplication.Companion.m35500c());
            }
        } catch (Throwable th2) {
            AbstractC23350e.m122776f(f55474u0, th2);
        }
    }

    /* renamed from: a5 */
    private final void m57078a5() {
        AbstractC19444a.m101695c(new Runnable() { // from class: h40.v2
            public /* synthetic */ RunnableC19862v2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloLauncherActivity.m57082d5(ZaloLauncherActivity.this);
            }
        });
    }

    /* renamed from: a6 */
    private final void m57079a6() {
        ZaloView m93012K0 = mo35579p().m93012K0();
        if (C23058e8.f112065a.m118310c(m93012K0)) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), null, null, new C10975e(m93012K0, null), 3, null);
        }
    }

    /* renamed from: a7 */
    public static final void m57080a7(ZaloLauncherActivity zaloLauncherActivity) {
        boolean isBackgroundRestricted;
        boolean isBackgroundRestricted2;
        int i11;
        boolean isBackgroundRestricted3;
        AbstractC19074t.m100208f(zaloLauncherActivity, "this$0");
        try {
            Object systemService = zaloLauncherActivity.getSystemService("activity");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager activityManager = (ActivityManager) systemService;
            if (Build.VERSION.SDK_INT >= 28) {
                if (!f55478y0) {
                    f55478y0 = true;
                    isBackgroundRestricted3 = activityManager.isBackgroundRestricted();
                    if (isBackgroundRestricted3) {
                        AbstractC20887g.m109248z(266005, "Background Restricted");
                    } else {
                        AbstractC20887g.m109236n(266005, "Background NotRestricted", null, 0, 0L, 0, 60, null);
                    }
                }
                int m4095p = AbstractC0924m0.m4095p();
                isBackgroundRestricted = activityManager.isBackgroundRestricted();
                if (m4095p != isBackgroundRestricted) {
                    if (m4095p != -1) {
                        isBackgroundRestricted2 = activityManager.isBackgroundRestricted();
                        if (isBackgroundRestricted2) {
                            i11 = 266006;
                        } else {
                            i11 = 266007;
                        }
                        AbstractC20887g.m109248z(i11, "Background Restricted state changed " + m4095p + " -> " + (isBackgroundRestricted ? 1 : 0));
                        C23331i.f113531a.m122732f(isBackgroundRestricted ? 1 : 0);
                    }
                    AbstractC0924m0.m3572Xd(isBackgroundRestricted ? 1 : 0);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c7 */
    private final void m57081c7() {
        AbstractC8950c.m47780l(C16786d.a.m89644c(C16786d.Companion, null, 1, null), null, 1, null);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 9002);
        bVar.m124119a().m124117e(this, 9003);
        bVar.m124119a().m124117e(this, 9004);
        bVar.m124119a().m124117e(this, 9005);
        bVar.m124119a().m124117e(this, 9008);
        C30946k.Companion.m150528a().m150524v(false);
    }

    /* renamed from: d5 */
    public static final void m57082d5(ZaloLauncherActivity zaloLauncherActivity) {
        ZaloView zaloView;
        Bundle m92642L3;
        AbstractC19074t.m100208f(zaloLauncherActivity, "this$0");
        C17487o0 mo35579p = zaloLauncherActivity.mo35579p();
        if (mo35579p != null) {
            zaloView = mo35579p.m93012K0();
        } else {
            zaloView = null;
        }
        if (zaloView != null && (m92642L3 = zaloView.m92642L3()) != null && m92642L3.containsKey("MP_TASK_ID")) {
            return;
        }
        C16786d.a aVar = C16786d.Companion;
        if (!C16786d.a.m89644c(aVar, null, 1, null).m89638e0() && C16786d.a.m89644c(aVar, null, 1, null).m47786F()) {
            aVar.m89646b(zaloLauncherActivity).m89641h0();
        }
    }

    /* renamed from: e5 */
    private final void m57084e5() {
        mo35579p().m93092y(new C10973c());
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 9002);
        bVar.m124119a().m124115b(this, 9003);
        bVar.m124119a().m124115b(this, 9004);
        bVar.m124119a().m124115b(this, 9005);
        bVar.m124119a().m124115b(this, 9008);
    }

    /* renamed from: f6 */
    private final void m57085f6() {
        try {
            if (!AbstractC23224t9.m119695j(getIntent())) {
                return;
            }
            String stringExtra = getIntent().getStringExtra("handle_zalo_ui_event_sub_action");
            if (AbstractC19074t.m100204b("com.zing.zalo.action.HANDLE_ZALO_UI_EVENT.ACTION_LIST", stringExtra)) {
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: h40.w2

                    /* renamed from: p */
                    public final /* synthetic */ Bundle f98032p;

                    /* renamed from: q */
                    public final /* synthetic */ ZaloLauncherActivity f98033q;

                    public /* synthetic */ RunnableC19866w2(Bundle bundle, ZaloLauncherActivity this) {
                        r1 = bundle;
                        r2 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloLauncherActivity.m57088j6(r1, r2);
                    }
                });
            } else if (AbstractC19074t.m100204b("com.zing.zalo.action.HANDLE_ZALO_UI_EVENT_SUB_ACTION_DEV_CONSOLE", stringExtra)) {
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: h40.x2

                    /* renamed from: p */
                    public final /* synthetic */ Bundle f98038p;

                    /* renamed from: q */
                    public final /* synthetic */ ZaloLauncherActivity f98039q;

                    public /* synthetic */ RunnableC19870x2(Bundle bundle, ZaloLauncherActivity this) {
                        r1 = bundle;
                        r2 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloLauncherActivity.m57089l6(r1, r2);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f55474u0, e11);
        }
    }

    /* renamed from: i5 */
    public static final boolean m57086i5(Class cls) {
        return Companion.m57109a(cls);
    }

    /* renamed from: i7 */
    private final void m57087i7(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            if (bundle.getBoolean("EXTRA_REQUEST_OPEN_WEB_AUTHORIZATION")) {
                bundle2.putBoolean("EXTRA_REQUEST_OPEN_WEB_AUTHORIZATION", true);
                bundle2.putString("uri", bundle.getString("uri"));
            }
            if (bundle.getBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW")) {
                bundle2.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
            }
        }
        bundle2.putInt("SHOW_WITH_FLAGS", 67108864);
        mo35579p().m93069k2(MainTabView.class, bundle2, 0, true);
    }

    /* renamed from: j6 */
    public static final void m57088j6(Bundle bundle, ZaloLauncherActivity zaloLauncherActivity) {
        AbstractC19074t.m100208f(zaloLauncherActivity, "this$0");
        AbstractC28207v1.m141877H2(bundle, zaloLauncherActivity, null, null, null);
    }

    /* renamed from: l6 */
    public static final void m57089l6(Bundle bundle, ZaloLauncherActivity zaloLauncherActivity) {
        AbstractC19074t.m100208f(zaloLauncherActivity, "this$0");
        C24834e.f119224a.m129128a(bundle, zaloLauncherActivity);
    }

    /* renamed from: m6 */
    public static final boolean m57091m6() {
        return Companion.m57117i();
    }

    /* renamed from: n7 */
    private final void m57092n7(boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        Serializable serializable;
        Bundle bundle;
        boolean z15;
        ZaloView m93012K0;
        boolean z16;
        try {
            AbstractC23350e.m122780j("startIntentFlow: startIntentFlow(" + z11 + ") - clearAllBackStack(" + z12 + ")", new Object[0]);
            AbstractC23165o5.m119336e(2, this, ZaloLauncherActivity.class.getName());
            if (AbstractC23165o5.m119333b()) {
                mo35579p().m93016L1(AbstractC23304d.f113266D0);
            }
            boolean m57097r7 = m57097r7();
            if (m57097r7 && mo35579p().m93009J0() >= 0) {
                if (z12) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("SHOW_WITH_FLAGS", 67108864);
                    mo35579p().m93069k2(MainTabView.class, bundle2, 0, true);
                    return;
                }
                return;
            }
            Bundle bundleExtra = getIntent().getBundleExtra("zalo_view_bundle");
            if (AbstractC19074t.m100204b("com.zing.zalo.action.ACTION_SHOW_ZALO_VIEW", getIntent().getAction()) && getIntent().getExtras() != null && AbstractC23224t9.m119696k(getIntent())) {
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    z13 = extras.getBoolean("zalo_view_from_noti");
                } else {
                    z13 = false;
                }
                if (bundleExtra != null) {
                    z14 = bundleExtra.getBoolean("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT");
                } else {
                    z14 = false;
                }
                Bundle extras2 = getIntent().getExtras();
                if (extras2 != null) {
                    serializable = extras2.getSerializable("zalo_view_class");
                } else {
                    serializable = null;
                }
                if ((serializable instanceof Class) && ZaloView.class.isAssignableFrom((Class) serializable)) {
                    C25798f m132949c = C25798f.m132949c();
                    m132949c.m132951a(true);
                    if (z13) {
                        this.f55482k0 = C0722p.b.NOTIFICATION;
                        m132949c.m132954e(3);
                    } else if (z14) {
                        m132949c.m132954e(12);
                    } else {
                        m132949c.m132954e(5);
                    }
                    Class cls = (Class) serializable;
                    if (bundleExtra == null) {
                        bundle = new Bundle();
                    } else {
                        bundle = bundleExtra;
                    }
                    if (z12) {
                        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                    }
                    if (FeedDetailsView.class.isAssignableFrom(cls) && mo35579p() != null && (mo35579p().m93012K0() instanceof FeedDetailsView)) {
                        ZaloView m93012K02 = mo35579p().m93012K0();
                        AbstractC19074t.m100206d(m93012K02, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.FeedDetailsView");
                        FeedDetailsView feedDetailsView = (FeedDetailsView) m93012K02;
                        String string = bundle.getString("fid");
                        if (feedDetailsView.m79651rO() != null) {
                            if (AbstractC19074t.m100204b(feedDetailsView.m79651rO(), string)) {
                                bundle.putInt("SHOW_WITH_FLAGS", 16777216);
                            }
                        } else if (mo35579p().m93048Y0()) {
                            bundle.putInt("SHOW_WITH_FLAGS", 16777216);
                        }
                    }
                    if (ImageCommentView.class.isAssignableFrom(cls) && mo35579p() != null && (mo35579p().m93012K0() instanceof ImageCommentView)) {
                        ZaloView m93012K03 = mo35579p().m93012K0();
                        AbstractC19074t.m100206d(m93012K03, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.ImageCommentView");
                        ImageCommentView imageCommentView = (ImageCommentView) m93012K03;
                        String string2 = bundle.getString("extra_feed_id");
                        if (imageCommentView.m80851dO() != null) {
                            if (AbstractC19074t.m100204b(imageCommentView.m80851dO(), string2)) {
                                bundle.putInt("SHOW_WITH_FLAGS", 16777216);
                            }
                        } else if (mo35579p().m93048Y0()) {
                            bundle.putInt("SHOW_WITH_FLAGS", 16777216);
                        }
                    }
                    if (GroupLiveStreamView.class.isAssignableFrom(cls) && mo35579p() != null && (mo35579p().m93012K0() instanceof GroupLiveStreamView)) {
                        ZaloView m93012K04 = mo35579p().m93012K0();
                        AbstractC19074t.m100206d(m93012K04, "null cannot be cast to non-null type com.zing.zalo.ui.group.livestream.GroupLiveStreamView");
                        GroupLiveStreamView groupLiveStreamView = (GroupLiveStreamView) m93012K04;
                        if (groupLiveStreamView.m66457yM(bundle.getString("stream_id"))) {
                            groupLiveStreamView.m66440NM();
                            return;
                        }
                    }
                    if (LiveLocationSharingListView.class.isAssignableFrom(cls) && mo35579p() != null && mo35579p().m92993D0(LiveLocationSharingListView.class) == null) {
                        if (mo35579p().m93012K0() == null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt("SHOW_WITH_FLAGS", 67108864);
                            mo35579p().m93069k2(MainTabView.class, bundle3, 0, true);
                        }
                        LiveLocationSharingListView.m81147tL().m92602UK(mo35579p(), "LiveLocationSharingList");
                        return;
                    }
                    if (SettingNotificationV2View.class.isAssignableFrom(cls) && mo35579p() != null && mo35579p().m92993D0(SettingNotificationV2View.class) == null && mo35579p().m93012K0() == null && m57097r7) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putInt("SHOW_WITH_FLAGS", 67108864);
                        mo35579p().m93069k2(MainTabView.class, bundle4, 0, true);
                        return;
                    }
                    Class m115945l = C22438j.m115945l();
                    if (z13 && m115945l.isAssignableFrom(cls)) {
                        try {
                            if (mo35579p() != null && mo35579p().m92993D0(m115945l) != null) {
                                bundle.putInt("SHOW_WITH_FLAGS", 16777216);
                            }
                        } catch (Exception e11) {
                            AbstractC20110a.f98889a.mo104552e(e11);
                        }
                    }
                    if (m57097r7 && ((StartUpNewView.class.isAssignableFrom(cls) || StartUpView.class.isAssignableFrom(cls)) && AbstractC23138m0.Companion.m118777d())) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putInt("SHOW_WITH_FLAGS", 67108864);
                        mo35579p().m93069k2(MainTabView.class, bundle5, 0, true);
                        return;
                    }
                    try {
                        if (MainTabView.class.isAssignableFrom(cls) && mo35579p() != null && bundle.getBoolean("EXTRA_FORCE_SHOW_TAB_MESSAGE_FROM_BUBBLE", false)) {
                            ZaloBubbleActivity.Companion.m57052d();
                            if (mo35579p().m93012K0() instanceof MainTabView) {
                                ZaloView m93012K05 = mo35579p().m93012K0();
                                AbstractC19074t.m100206d(m93012K05, "null cannot be cast to non-null type com.zing.zalo.ui.maintab.MainTabView");
                                ((MainTabView) m93012K05).m67674JN(C24099q0.Companion.m125984a().m125971o());
                                return;
                            }
                        }
                        if (bundleExtra != null) {
                            z15 = bundleExtra.getBoolean("from_dynamic_shortcut");
                        } else {
                            z15 = false;
                        }
                        if (z14 && mo35579p() != null && z15 && (m93012K0 = mo35579p().m93012K0()) != null && ((!((z16 = m93012K0 instanceof RestoreMessageStartupView)) && (m93012K0 instanceof MainTabView) && ((MainTabView) m93012K0).m67708sM()) || z16)) {
                            return;
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    if (bundleExtra != null && bundleExtra.getBoolean("EXTRA_REQUEST_OPEN_WEB_AUTHORIZATION")) {
                        bundle.putBoolean("EXTRA_REQUEST_OPEN_WEB_AUTHORIZATION", true);
                        bundle.putString("uri", bundleExtra.getString("uri"));
                    }
                    mo35579p().m93069k2(cls, bundle, 0, true);
                    try {
                        if (bundle.getInt("extra_notification_source") == 101) {
                            String str = CoreUtility.f89233i;
                            AbstractC19074t.m100207e(str, "currentUserUid");
                            AbstractC20887g.m109231i(str, ZMediaPlayer.FFP_PROP_INT64_ASYNC_STATISTIC_BUF_FORWARDS, "", 0L, ZMediaPlayer.FFP_PROP_INT64_TCP_SPEED, CoreUtility.f89236l);
                            return;
                        }
                        return;
                    } catch (Exception e13) {
                        AbstractC23350e.m122776f(f55474u0, e13);
                        return;
                    }
                }
            } else if (!z11) {
                C25798f.m132949c().m132951a(true);
                C25798f.m132949c().m132954e(0);
            }
            if (!z11) {
                C17487o0 mo35579p = mo35579p();
                AbstractC19074t.m100207e(mo35579p, "getZaloViewManager(...)");
                if (C22438j.m115939f(mo35579p)) {
                    return;
                }
                if (!AbstractC23304d.f113266D0) {
                    C17793b.Companion.m93939a().m93937r(true);
                }
                m57087i7(bundleExtra);
            }
        } catch (Exception e14) {
            AbstractC23350e.m122776f(f55474u0, e14);
            finish();
        }
    }

    /* renamed from: o5 */
    public final C10974d m57093o5() {
        return new C10974d();
    }

    /* renamed from: o6 */
    private final void m57094o6() {
        InAppNotificationView.m80878n(this, mo35579p());
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:            r4 = r4.getExtras();     */
    /* renamed from: p7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m57095p7() {
        Object systemService;
        String str;
        List dynamicShortcuts;
        String id2;
        PersistableBundle extras;
        Intent intent;
        Bundle extras2;
        C25798f.m132949c().m132951a(true);
        C25798f.m132949c().m132954e(4);
        this.f55482k0 = C0722p.b.OTHER_APP;
        if (getCallingActivity() != null) {
            finish();
            startActivity(getIntent());
            return;
        }
        C23058e8 c23058e8 = C23058e8.f112065a;
        if (c23058e8.m118309b(mo35579p().m93012K0()) && (intent = getIntent()) != null && (extras2 = intent.getExtras()) != null && !extras2.containsKey("more_actions_quick_connect") && this.f55491t0) {
            if (c23058e8.m118310c(mo35579p().m93012K0())) {
                m57079a6();
                return;
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mime_type_unsupported_format));
                return;
            }
        }
        if (!AbstractC23138m0.Companion.m118777d()) {
            m57071S5(true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("intent_action", getIntent().getAction());
        bundle.putString("intent_type", getIntent().getType());
        bundle.putBoolean("STR_EXTRA_SHARED_FROM_OTHER_APP", true);
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null) {
            bundle.putAll(extras3);
        }
        Uri data = getIntent().getData();
        if (data != null) {
            bundle.putString("data_uri_from_intent", data.toString());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            systemService = getSystemService(AbstractC19806h2.m103539a());
            ShortcutManager m103541a = AbstractC19814j2.m103541a(systemService);
            if (m103541a != null) {
                if (getIntent().hasExtra("android.intent.extra.shortcut.ID")) {
                    str = getIntent().getStringExtra("android.intent.extra.shortcut.ID");
                } else {
                    str = null;
                }
                dynamicShortcuts = m103541a.getDynamicShortcuts();
                AbstractC19074t.m100207e(dynamicShortcuts, "getDynamicShortcuts(...)");
                Iterator it = dynamicShortcuts.iterator();
                while (it.hasNext()) {
                    ShortcutInfo m103543a = AbstractC19822l2.m103543a(it.next());
                    if (str != null) {
                        id2 = m103543a.getId();
                        if (AbstractC19074t.m100204b(str, id2) && extras != null) {
                            C10971a c10971a = Companion;
                            AbstractC19074t.m100205c(extras);
                            bundle.putAll(c10971a.m57118j(extras));
                        }
                    }
                }
            }
        }
        mo35579p().m93069k2(TempShareViaView.class, bundle, 0, true);
    }

    /* renamed from: r6 */
    private final void m57096r6(String str) {
        getIntent().removeExtra(str);
        AbstractC19646n0.m102940V1();
        finish();
        startActivity(getIntent());
    }

    /* renamed from: r7 */
    private final boolean m57097r7() {
        if ((getIntent().getFlags() & ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) == 1048576) {
            return true;
        }
        return false;
    }

    /* renamed from: s5 */
    public static final void m57098s5(ZaloLauncherActivity zaloLauncherActivity, Bundle bundle) {
        AbstractC19074t.m100208f(zaloLauncherActivity, "this$0");
        zaloLauncherActivity.mo35579p().m93069k2(MPWebView.class, bundle, 0, true);
    }

    /* renamed from: u5 */
    public static final void m57101u5() {
        Companion.m57110b();
    }

    /* renamed from: w6 */
    public static final void m57103w6(ZaloLauncherActivity zaloLauncherActivity) {
        JSONObject optJSONObject;
        AbstractC19074t.m100208f(zaloLauncherActivity, "this$0");
        try {
            String m4096p0 = AbstractC0924m0.m4096p0();
            if (!TextUtils.isEmpty(m4096p0)) {
                JSONObject jSONObject = new JSONObject(m4096p0);
                String optString = jSONObject.optString("clearView", "");
                if (TextUtils.isEmpty(optString) && (optJSONObject = jSONObject.optJSONObject("data")) != null && C23793c.Companion.m124321a().mo124314i() < optJSONObject.optLong("expiredTime", 0L)) {
                    AbstractC19444a.m101694b(new Runnable() { // from class: h40.u2

                        /* renamed from: q */
                        public final /* synthetic */ JSONObject f98024q;

                        public /* synthetic */ RunnableC19858u2(JSONObject jSONObject2) {
                            r2 = jSONObject2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZaloLauncherActivity.m57063G6(ZaloLauncherActivity.this, r2);
                        }
                    }, 500L);
                } else {
                    C23744a.Companion.m124119a().m124116d(6027, optString);
                    AbstractC0924m0.m3721cf("");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D5 */
    public final boolean m57106D5() {
        return this.f55487p0;
    }

    @Override // android.app.Activity, p542ub.InterfaceC27218a
    public void finish() {
        super.finish();
        C16786d.a.m89644c(C16786d.Companion, null, 1, null).mo47806h();
    }

    /* renamed from: g7 */
    public final void m57107g7(boolean z11) {
        this.f55487p0 = z11;
    }

    @Override // ac.InterfaceC0724q
    /* renamed from: l0 */
    public C0722p.b mo1166l0() {
        return this.f55482k0;
    }

    @Override // com.zing.zalo.activity.ZaloActivity, xl0.InterfaceC30160a
    /* renamed from: m */
    public void mo35574m(WindowInsets windowInsets) {
        int systemWindowInsetBottom;
        super.mo35574m(windowInsets);
        if (windowInsets == null || this.f55489r0 == (systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom())) {
            return;
        }
        this.f55489r0 = systemWindowInsetBottom;
        ZaloInsetsLayout zaloInsetsLayout = this.f55488q0;
        if (zaloInsetsLayout != null) {
            if (this.f55490s0) {
                systemWindowInsetBottom = 0;
            }
            zaloInsetsLayout.setBottomMarginView(systemWindowInsetBottom);
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        try {
            AbstractC23136l9.m118706f(this, true);
            m56686T3();
            AbstractC19646n0.m102940V1();
            C23744a.b bVar = C23744a.Companion;
            bVar.m124119a().m124116d(4, new Object[0]);
            int i11 = configuration.orientation;
            if (this.f55485n0 != i11) {
                this.f55485n0 = i11;
                bVar.m124119a().m124116d(9006, new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InterfaceC27315f m112681c;
        ArrayList m131500h;
        f55473A0 = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCreate:");
        sb2.append(bundle);
        C23475l.m123241e((byte) 1, "onCreate");
        MainApplication.Companion.m35501d().registerActivityLifecycleCallbacks(m57060B5());
        AbstractC23136l9.m118706f(getContext(), false);
        requestWindowFeature(1);
        super.onCreate(bundle);
        m56686T3();
        f55475v0 = new WeakReference(this);
        f55479z0 = AbstractC6474c.m33341a(this);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(C23212s8.m119607o(this, AbstractC16781w.PrimaryBackgroundColor)));
        }
        this.f55485n0 = getResources().getConfiguration().orientation;
        ZaloInsetsLayout zaloInsetsLayout = new ZaloInsetsLayout(this, null, 0, 6, null);
        zaloInsetsLayout.setId(AbstractC6918a0.zalo_view_container);
        zaloInsetsLayout.setApplyWindowInsetsListener(this);
        this.f55488q0 = zaloInsetsLayout;
        setContentView(zaloInsetsLayout, new ViewGroup.LayoutParams(-1, -1));
        try {
            mo35575n1().addContentView(new SurfaceView(mo35575n1()), new ViewGroup.LayoutParams(0, 0));
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f55474u0, e11);
        }
        C16772j m89537e = C16772j.Companion.m89537e(this);
        if (m89537e != null) {
            m89537e.m89521g(new C10976f());
        }
        mo35579p().m93043W1(5);
        InterruptMusicController.f46298p.m45700g(new WeakReference(this));
        m57084e5();
        if (C32150v9.f148254a.m155132g()) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("SHOW_WITH_FLAGS", 67108864);
            mo35573l4(ServerMaintenanceView.class, bundle2, 0, true);
            return;
        }
        if (bundle != null && mo35579p().m93009J0() >= 0) {
            f55477x0 = true;
            C23475l.m123240d().m123242a("onCreate");
            C23475l.m123240d().m123243b();
        } else {
            if (!AbstractC23138m0.Companion.m118777d()) {
                C25798f.m132949c().m132951a(true);
                C25798f.m132949c().m132954e(0);
                m57071S5(false);
                return;
            }
            C7967l.d dVar = C7967l.Companion;
            if (dVar.m42748b().m42734K()) {
                if (mo35579p().m92993D0(ZdbMigrateView.class) == null) {
                    dVar.m42748b().m42735T(this);
                    return;
                }
                return;
            }
            C20223b m57065H5 = m57065H5();
            C17487o0 mo35579p = mo35579p();
            AbstractC19074t.m100207e(mo35579p, "getZaloViewManager(...)");
            if (m57065H5.m105694c(mo35579p)) {
                return;
            }
            if (!m57097r7() && getIntent() != null && (AbstractC19074t.m100204b("android.intent.action.SEND", getIntent().getAction()) || AbstractC19074t.m100204b("com.zing.zalo.intent.action.SEND", getIntent().getAction()) || AbstractC19074t.m100204b("android.intent.action.SEND_MULTIPLE", getIntent().getAction()) || AbstractC23059e9.m118344w(getIntent().getAction(), getIntent().getType()))) {
                C23475l.m123240d().m123242a("ShareVia");
                C23475l.m123240d().m123243b();
                m57095p7();
                return;
            }
            if (AbstractC19074t.m100204b("com.zing.zalo.action.HANDLE_ZALO_UI_EVENT", getIntent().getAction())) {
                m57085f6();
                if (!getIntent().getBooleanExtra("handle_zalo_ui_event_show_main", true)) {
                    return;
                }
            }
            f55477x0 = false;
            if (AbstractC19074t.m100204b("android.intent.action.MAIN", getIntent().getAction())) {
                BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), Dispatchers.m112679a(), null, new C10977g(null), 2, null);
            }
            C23475l.m123240d().m123242a("onCreate");
            C23475l.m123240d().m123243b();
            m57092n7(false, AbstractC19074t.m100204b("android.intent.action.MAIN", getIntent().getAction()));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            m112681c = Dispatchers.m112679a();
        } else {
            m112681c = Dispatchers.m112681c();
        }
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), m112681c, null, new C10978h(null), 2, null);
        if (bundle != null && bundle.containsKey("MA_FLOATING_LIST")) {
            C19609h c19609h = (C19609h) AbstractC21954k.Companion.m114622q(bundle, "MA_FLOATING_LIST", C19609h.class);
            if (c19609h != null) {
                m131500h = AbstractC25368s.m131500h(c19609h);
                C16786d.Companion.m89650g(m131500h);
            }
            bundle.remove("MA_FLOATING_LIST");
        }
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onDestroy() {
        WeakReference weakReference = f55475v0;
        if (weakReference != null) {
            AbstractC19074t.m100205c(weakReference);
            if (weakReference.get() == this) {
                f55475v0 = null;
            }
        }
        super.onDestroy();
        C32085r0.m154802c().m154809j();
        InAppNotificationView.m80876k();
        AbstractC23093i.m118454g(this);
        C31995kc.m154255c().m154256a();
        f55479z0 = null;
        m57081c7();
        MainApplication.Companion.m35501d().unregisterActivityLifecycleCallbacks(m57060B5());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC19074t.m100208f(intent, "intent");
        C23475l.m123241e((byte) 1, "onNewIntent");
        super.onNewIntent(intent);
        setIntent(intent);
        if (C32150v9.f148254a.m155132g()) {
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 67108864);
            mo35573l4(ServerMaintenanceView.class, bundle, 0, true);
            return;
        }
        if (intent.hasExtra("BOL_EXTRA_LOGOUT_GET_FLOW_LOGIN")) {
            this.f55480i0 = intent.getBooleanExtra("EXTRA_LANGUAGE_CHANGED", false);
        }
        if (!AbstractC23138m0.Companion.m118777d()) {
            C25798f.m132949c().m132951a(true);
            C25798f.m132949c().m132954e(0);
            m57071S5(false);
            return;
        }
        C7967l.d dVar = C7967l.Companion;
        if (dVar.m42748b().m42734K()) {
            if (mo35579p().m92993D0(ZdbMigrateView.class) == null) {
                dVar.m42748b().m42735T(this);
                return;
            }
            return;
        }
        C20223b m57065H5 = m57065H5();
        C17487o0 mo35579p = mo35579p();
        AbstractC19074t.m100207e(mo35579p, "getZaloViewManager(...)");
        if (m57065H5.m105694c(mo35579p)) {
            return;
        }
        if (AbstractC19074t.m100204b("com.zing.zalo.action.HANDLE_ZALO_UI_EVENT", getIntent().getAction())) {
            m57085f6();
        }
        m57092n7(true, false);
        if (intent.hasExtra("EXTRA_LANGUAGE_CHANGED")) {
            if (intent.getBooleanExtra("EXTRA_LANGUAGE_CHANGED", false)) {
                m57096r6("EXTRA_LANGUAGE_CHANGED");
            }
        } else if (intent.hasExtra("EXTRA_FONT_CHANGED")) {
            if (intent.getBooleanExtra("EXTRA_FONT_CHANGED", false)) {
                m57096r6("EXTRA_FONT_CHANGED");
            }
        } else if (getIntent() != null && (AbstractC19074t.m100204b("android.intent.action.SEND", getIntent().getAction()) || AbstractC19074t.m100204b("com.zing.zalo.intent.action.SEND", getIntent().getAction()) || AbstractC19074t.m100204b("android.intent.action.SEND_MULTIPLE", getIntent().getAction()) || AbstractC23059e9.m118344w(getIntent().getAction(), getIntent().getType()))) {
            m57095p7();
            return;
        }
        C23475l.m123240d().m123242a("onNewIntent");
        C23475l.m123240d().m123243b();
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            AbstractC23350e.m122772b("onPause", new Object[0]);
            C29667y.m147442J();
            AbstractC23304d.f113411m1.set(false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f55474u0, e11);
        }
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            AbstractC23350e.m122772b("onResume", new Object[0]);
            Intent intent = new Intent();
            intent.setAction("com.zing.zalo.action.COUNT_NEWEST_PHOTO_PROVIDER");
            ZaloIntentServiceEmulate.m50468b(intent, SmsReceiverService.class);
            if (f55477x0 && !C25798f.m132949c().m132953d()) {
                C25798f.m132949c().m132954e(1);
            }
            if (f55476w0) {
                f55476w0 = false;
            } else if (!C25798f.m132949c().m132953d()) {
                C25798f.m132949c().m132954e(2);
            }
            AbstractC23304d.f113411m1.set(true);
            AbstractC26084s.m134272t();
            C7967l.d dVar = C7967l.Companion;
            if (dVar.m42748b().m42728A()) {
                AbstractC0837p0.Companion.m2237f().mo2040a(new RunnableC0940u0(dVar.m42748b()));
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: h40.p2
                public /* synthetic */ RunnableC19838p2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloLauncherActivity.m57103w6(ZaloLauncherActivity.this);
                }
            });
            m57078a5();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f55474u0, e11);
        }
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        List m89647d = C16786d.Companion.m89647d();
        if (m89647d != null && m89647d.size() > 0) {
            bundle.putSerializable("MA_FLOATING_LIST", (C19609h) m89647d.get(m89647d.size() - 1));
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        InterfaceC6472b interfaceC6472b = f55479z0;
        if (interfaceC6472b != null) {
            AbstractC19074t.m100205c(interfaceC6472b);
            interfaceC6472b.mo33337b().mo117578g(new InterfaceC22882g() { // from class: h40.s2
                public /* synthetic */ C19850s2() {
                }

                @Override // p342m6.InterfaceC22882g
                public final void onSuccess(Object obj) {
                    ZaloLauncherActivity.m57066J6(InterfaceC18505l.this, obj);
                }
            });
        }
        C0832n.m2179i().m2188g();
        AbstractC29633j.m147367p();
        C19681e.Companion.m103275a().m103269g();
        ZaloKeepAliveService.m50473n(getApplicationContext());
        AbstractC23775p0.m124219x(true);
        try {
            m57094o6();
        } catch (Throwable th2) {
            AbstractC23350e.m122776f(f55474u0, th2);
        }
        TaskNonStickyExecutor.m50450b().m50454e(new Runnable() { // from class: h40.t2
            @Override // java.lang.Runnable
            public final void run() {
                ZaloLauncherActivity.m57077X6();
            }
        }, 30000L);
        if (this.f55481j0 && m57067M5().m99704i()) {
            C20223b m57065H5 = m57065H5();
            C17487o0 mo35579p = mo35579p();
            AbstractC19074t.m100207e(mo35579p, "getZaloViewManager(...)");
            m57065H5.m105694c(mo35579p);
        }
        this.f55481j0 = false;
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f55481j0 = true;
        this.f55482k0 = C0722p.b.APP_RESUME;
        try {
            C25798f.m132949c().m132951a(false);
            if (C18637g.f93790r > 0) {
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                AbstractC20887g.m109231i(str, 80031, "counter: " + C18637g.f93790r, C18637g.f93790r, 80010, CoreUtility.f89236l);
                C18637g.f93790r = 0;
            }
            if (C18644n.f93820n > 0) {
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                AbstractC20887g.m109231i(str2, 80030, "counter: " + C18644n.f93820n, C18644n.f93820n, 80010, CoreUtility.f89236l);
                C18644n.f93820n = 0;
            }
            if (Build.VERSION.SDK_INT >= 25 && AbstractC21777d.m112317h()) {
                C26939u.m138770q().m138785z();
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: h40.r2
                public /* synthetic */ RunnableC19846r2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloLauncherActivity.m57080a7(ZaloLauncherActivity.this);
                }
            });
            AbstractC23775p0.m124219x(false);
            String str3 = CoreUtility.f89233i;
            if (str3 != null && str3.length() != 0 && C19636i1.Companion.m102800a().m102745D() == 0 && AbstractC23304d.f113447v1) {
                C0824j.m2153b(new C10980j());
            }
            C11837a.a aVar = C11837a.Companion;
            if (aVar.m65784a().m65776g()) {
                aVar.m65784a().m65780k(false);
            }
            C11891a.Companion.m66095r(this);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f55474u0, e11);
        }
    }

    /* renamed from: q7 */
    public final void m57108q7(boolean z11) {
        int i11;
        this.f55490s0 = z11;
        ZaloInsetsLayout zaloInsetsLayout = this.f55488q0;
        if (zaloInsetsLayout != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = this.f55489r0;
            }
            zaloInsetsLayout.setBottomMarginView(i11);
        }
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        Bundle bundle;
        C19609h c19609h;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 9008) {
            switch (i11) {
                case 9002:
                    if (AbstractC23136l9.m118650F0(getContext())) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("ANIM_FOR_VIEW", 1);
                        C16786d.a.m89644c(C16786d.Companion, null, 1, null).m47795P();
                        mo35579p().m93069k2(MiniAppFloatingAnimView.class, bundle2, 0, true);
                        return;
                    }
                    C16786d.a.m89644c(C16786d.Companion, null, 1, null).m47800U(true);
                    AbstractC21954k.Companion.m114627v(this, new Intent(getContext(), (Class<?>) ZaloLauncherActivity.class));
                    return;
                case 9003:
                    Object obj = objArr[0];
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type android.os.Bundle");
                    Bundle bundle3 = (Bundle) obj;
                    if (AbstractC23136l9.m118650F0(getContext())) {
                        mo35579p().m93069k2(MiniAppFloatingAnimView.class, bundle3, 0, true);
                        return;
                    } else {
                        if (bundle3.containsKey("MINI_APP_INFO") && (c19609h = (C19609h) AbstractC21954k.Companion.m114622q(bundle3, "MINI_APP_INFO", C19609h.class)) != null) {
                            WebBaseView.C15353b.m86828t(WebBaseView.Companion, this, c19609h, null, null, 12, null);
                            return;
                        }
                        return;
                    }
                case 9004:
                    AbstractC21954k.Companion.m114627v(this, new Intent(getContext(), (Class<?>) ZaloLauncherActivity.class));
                    return;
                case 9005:
                    try {
                        Object obj2 = objArr[0];
                        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type android.os.Bundle");
                        bundle = (Bundle) obj2;
                    } catch (Exception unused) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("SHOW_STORE_FROM_MA", true);
                    AbstractC19444a.m101695c(new Runnable() { // from class: h40.q2

                        /* renamed from: q */
                        public final /* synthetic */ Bundle f98005q;

                        public /* synthetic */ RunnableC19842q2(Bundle bundle4) {
                            r2 = bundle4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZaloLauncherActivity.m57098s5(ZaloLauncherActivity.this, r2);
                        }
                    });
                    return;
                default:
                    return;
            }
        }
        m57078a5();
    }
}
