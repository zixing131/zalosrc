package com.zing.zalo;

import ac.C0708i;
import ac.C0732w;
import ae.AbstractC0761f;
import ae.C0766k;
import af0.AbstractC0777e;
import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import ag0.C0804b;
import ag0.C0832n;
import ag0.C0834o;
import am.AbstractC0906d0;
import am.AbstractC0908e0;
import am.AbstractC0924m0;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.widget.Toast;
import androidx.core.provider.C1458e;
import androidx.emoji2.text.C1698f;
import androidx.emoji2.text.C1703k;
import androidx.lifecycle.InterfaceC1799v;
import androidx.multidex.MultiDex;
import au.AbstractC2339c;
import au.AbstractC2351i;
import au.AbstractC2379w;
import b50.C2556d;
import c30.C3255n;
import cf0.C3452a;
import ck0.C3568b;
import cl.C3570a;
import com.androidquery.util.AbstractC3972e;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.zing.zalo.MainApplication;
import com.zing.zalo.analytics.ZaloAnalytics;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.gifplayer.C8917b;
import com.zing.zalo.initializer.ProcessLifecycleManager;
import com.zing.zalo.leveldb.exception.LevelDBIOException;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.nativebridge.ZaloNativeBridge;
import com.zing.zalo.nativecommon.NetworkHelper;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.p062db.C7965j;
import com.zing.zalo.p062db.C7967l;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.widget.inputbar.ChatInputBar;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.preferences.C9049a;
import com.zing.zalo.preferences.C9050b;
import com.zing.zalo.preferences.C9051c;
import com.zing.zalo.preferences.IPreferences;
import com.zing.zalo.provider.InternalProvider;
import com.zing.zalo.receiver.AlarmReceiver;
import com.zing.zalo.receiver.ZaloReceiver;
import com.zing.zalo.service.TaskNonStickyExecutor;
import com.zing.zalo.startup.StartupApplication;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalo.webview.C16786d;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.AbstractC17158i1;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import cz.C17670w0;
import dg0.AbstractC17930e;
import dh0.C17933b;
import dk0.C18020c;
import ee.C18403k;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fh0.AbstractC18942g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gm.C19492c;
import gw.AbstractC19646n0;
import gw.C19669z;
import gy.C19681e;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20127a;
import hu.C20131e;
import im0.AbstractC20626a;
import java.util.HashSet;
import java.util.List;
import kg0.C21720c;
import ki.C21731c;
import km0.AbstractC21767b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kz.AbstractC21970a;
import li.AbstractC22490a;
import lm0.InterfaceC22529a;
import ln0.AbstractC22543l;
import me0.AbstractC23006a0;
import me0.AbstractC23009a3;
import me0.AbstractC23020b3;
import me0.AbstractC23028c0;
import me0.AbstractC23041d2;
import me0.AbstractC23044d5;
import me0.AbstractC23047d8;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23148n;
import me0.AbstractC23152n3;
import me0.AbstractC23153n4;
import me0.AbstractC23161o1;
import me0.AbstractC23165o5;
import me0.AbstractC23171p0;
import me0.AbstractC23188q6;
import me0.AbstractC23193r0;
import me0.AbstractC23204s0;
import me0.AbstractC23258x2;
import me0.C23010a4;
import me0.C23212s8;
import me0.C23219t4;
import me0.C23269y3;
import mm0.AbstractC23350e;
import mm0.AbstractC23354i;
import mn0.InterfaceC23364b;
import mx.C23475l;
import mx.C23476m;
import nh0.C23793c;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p019aj.C0872f;
import p021an.C0952a;
import p021an.InterfaceC0954c;
import p042bx.C3148c;
import p131ei.C18434b;
import p135em.C18489c;
import p142ey.C18631a;
import p142ey.C18644n;
import p157fc.C18868a;
import p161fg.C18922m;
import p171fx.AbstractC19164e;
import p173fz.C19172a;
import p207he.C20012f;
import p231i7.C20358b;
import p248iy.AbstractC20886f;
import p248iy.AbstractC20887g;
import p263jc.C21216s;
import p268ji.C21270p;
import p304ks.AbstractC21935u;
import p304ks.C21912a;
import p304ks.C21913a0;
import p304ks.C21914b;
import p304ks.C21916c;
import p304ks.C21917c0;
import p304ks.C21919e;
import p304ks.C21937w;
import p320ld.C22436h;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p362nd.C23728a;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p363nh.C23750d;
import p371nv.C23952g;
import p379o3.AbstractRunnableC23992c;
import p392oh.C24265l;
import p406ow.C24574j;
import p406ow.EnumC24566b;
import p406ow.InterfaceC24567c;
import p420pb.C24709a;
import p445qe.C25244a;
import p463qw.C25498b;
import p495rx.C25994h;
import p561ux.C27382f;
import p588vw.C28644j;
import p588vw.C28646l;
import p588vw.C28652r;
import p602w9.AbstractC28827c;
import p604wb.C28905e;
import p609wh.AbstractC29039u0;
import p645xh.AbstractC29633j;
import p656xs.C30202c;
import p667y2.C30268e;
import p684yk.InterfaceC31005a;
import p716zh.C31849b1;
import p716zh.C31892e;
import p716zh.C31930g7;
import p716zh.C31986k3;
import p716zh.C31994kb;
import p716zh.C31999l1;
import p716zh.C32034n6;
import p716zh.C32037n9;
import p716zh.C32091r6;
import p716zh.C32100s1;
import p716zh.C32119t6;
import p716zh.C32150v9;
import p716zh.C32190y7;
import p728zt.C32554c;
import p728zt.C32556e;
import pm0.AbstractC24855l;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import r00.C25597b;
import r30.C25641k;
import rh0.AbstractC25803k;
import rh0.C25795c;
import rh0.C25801i;
import s00.C26076k;
import t20.C26465b;
import tg0.C26675a;
import th.AbstractC26683d;
import th.AbstractC26684e;
import th.AbstractC26685f;
import th.AbstractC26689j;
import th.C26688i;
import th.C26691l;
import ui0.AbstractC27281h;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import v00.C27415j;
import vg.AbstractC28025b8;
import vg.AbstractC28105j8;
import vg.C28023b6;
import vg.C28111k4;
import vg.C28119l3;
import vg.C28157p5;
import vg.C28181s2;
import vg.C28200u3;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import xi0.C29673d;
import zm.voip.service.C32246a;

/* loaded from: classes.dex */
public final class MainApplication extends StartupApplication implements InterfaceC1799v, InterfaceC0954c, CoroutineScope {

    /* renamed from: M */
    private static MainApplication f37847M;

    /* renamed from: N */
    public static int f37848N;

    /* renamed from: O */
    public static int f37849O;

    /* renamed from: P */
    public static int f37850P;

    /* renamed from: R */
    public static boolean f37852R;

    /* renamed from: S */
    private static int f37853S;

    /* renamed from: B */
    private BroadcastReceiver f37857B;

    /* renamed from: C */
    private BroadcastReceiver f37858C;

    /* renamed from: D */
    private BroadcastReceiver f37859D;

    /* renamed from: E */
    private BroadcastReceiver f37860E;

    /* renamed from: F */
    private BroadcastReceiver f37861F;

    /* renamed from: H */
    private Context f37863H;
    public static final C6895a Companion = new C6895a(null);

    /* renamed from: Q */
    public static int f37851Q = -1;

    /* renamed from: T */
    private static String f37854T = "";

    /* renamed from: U */
    private static long f37855U = -1;

    /* renamed from: z */
    private final CoroutineExceptionHandler f37868z = new C6914t(CoroutineExceptionHandler.f105837l);

    /* renamed from: A */
    private final CompletableJob f37856A = SupervisorKt.m112864b(null, 1, null);

    /* renamed from: G */
    private final InterfaceC24854k f37862G = AbstractC24855l.m129208a(C6896b.f37869q);

    /* renamed from: I */
    private final long f37864I = SystemClock.elapsedRealtime();

    /* renamed from: J */
    private final long f37865J = System.currentTimeMillis();

    /* renamed from: K */
    private final InterfaceC24854k f37866K = AbstractC24855l.m129208a(new C6897c());

    /* renamed from: L */
    private final InterfaceC24854k f37867L = AbstractC24855l.m129208a(C6909o.f37886q);

    /* renamed from: com.zing.zalo.MainApplication$a */
    /* loaded from: classes.dex */
    public static final class C6895a {
        private C6895a() {
        }

        public /* synthetic */ C6895a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m35498a(Context context) {
            if (MainApplication.f37847M != null && CoreUtility.getAppContext() != null) {
                return;
            }
            if (context != null) {
                Toast makeText = Toast.makeText(context, AbstractC8020f0.error_msg_system_install_failed, 1);
                makeText.setGravity(17, 0, 0);
                makeText.show();
                CoreUtility.m93150c(context);
                C23750d c23750d = new C23750d(context);
                c23750d.m124165v0("other");
                c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
                c23750d.m6870W(context.getText(AbstractC8020f0.error_msg_system_install_failed));
                c23750d.mo6894v(context.getText(AbstractC8020f0.error_msg_system_install_failed));
                c23750d.m6892t("");
                c23750d.mo6860M(false).mo6895w(context.getText(AbstractC8020f0.app_name));
                C28023b6.m141256k2(c23750d);
                c23750d.m124147b0();
            }
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }

        /* renamed from: b */
        public final void m35499b() {
            try {
                AbstractC23006a0.m117899b();
                C28646l.m143315b();
                C28181s2.f131306a.m141724e();
                C28111k4.m141588d().m141592a();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("MainApplication", e11);
            }
        }

        /* renamed from: c */
        public final Context m35500c() {
            Context context;
            MainApplication mainApplication = MainApplication.f37847M;
            if (mainApplication != null) {
                context = mainApplication.getApplicationContext();
            } else {
                context = null;
            }
            if (context == null) {
                Context appContext = CoreUtility.getAppContext();
                AbstractC19074t.m100205c(appContext);
                return appContext;
            }
            return context;
        }

        /* renamed from: d */
        public final Application m35501d() {
            MainApplication mainApplication = MainApplication.f37847M;
            AbstractC19074t.m100205c(mainApplication);
            return mainApplication;
        }

        /* renamed from: e */
        public final Context m35502e() {
            MainApplication mainApplication = MainApplication.f37847M;
            if (mainApplication != null) {
                return mainApplication.f37863H;
            }
            return null;
        }

        /* renamed from: f */
        public final long m35503f() {
            return MainApplication.f37855U;
        }

        /* renamed from: g */
        public final int m35504g() {
            return MainApplication.f37853S;
        }

        /* renamed from: h */
        public final long m35505h() {
            MainApplication mainApplication = MainApplication.f37847M;
            if (mainApplication != null) {
                return mainApplication.f37865J;
            }
            return 0L;
        }

        /* renamed from: i */
        public final void m35506i(long j11) {
            MainApplication.f37855U = j11;
        }

        /* renamed from: j */
        public final void m35507j() {
            ContextThemeWrapper contextThemeWrapper = null;
            Context m120037d = C23269y3.m120037d(MainApplication.f37847M, null, 2, null);
            MainApplication mainApplication = MainApplication.f37847M;
            if (mainApplication != null) {
                if (m120037d != null) {
                    contextThemeWrapper = new ContextThemeWrapper(m120037d, C23212s8.m119601h());
                }
                mainApplication.f37863H = contextThemeWrapper;
            }
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$b */
    /* loaded from: classes.dex */
    static final class C6896b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C6896b f37869q = new C6896b();

        C6896b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0952a mo12V4() {
            return new C0952a();
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$c */
    /* loaded from: classes.dex */
    static final class C6897c extends AbstractC19075u implements InterfaceC18494a {
        C6897c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24860q mo12V4() {
            return AbstractC23193r0.m119496e(MainApplication.this);
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$d */
    /* loaded from: classes3.dex */
    public static final class C6898d implements C3568b.b {
        C6898d() {
        }

        /* renamed from: b */
        public static final void m35511b() {
            C18020c.m95817m().m95831i();
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
            AbstractC19074t.m100208f(exc, C30268e.f140632a);
            AbstractC23350e.m122776f("MainApplication", exc);
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            AbstractC19074t.m100208f(c3568b, "zinstantDagger");
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.q
                @Override // java.lang.Runnable
                public final void run() {
                    MainApplication.C6898d.m35511b();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$e */
    /* loaded from: classes3.dex */
    public static final class C6899e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f37871t;

        /* renamed from: u */
        /* synthetic */ Object f37872u;

        C6899e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C6899e c6899e = new C6899e(continuation);
            c6899e.f37872u = obj;
            return c6899e;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f37871t == 0) {
                AbstractC24862s.m129228b(obj);
                JSONObject jSONObject = (JSONObject) this.f37872u;
                AbstractC23153n4.m119085A(jSONObject, false, false);
                AbstractC23148n.m118837k(jSONObject);
                return AbstractC29094b.m145339a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(JSONObject jSONObject, Continuation continuation) {
            return ((C6899e) mo238a(jSONObject, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$f */
    /* loaded from: classes3.dex */
    public static final class C6900f implements InterfaceC20094a {
        C6900f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject optJSONObject;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject optJSONObject2 = new JSONObject(obj.toString()).optJSONObject("data");
                Long l11 = null;
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("config")) != null) {
                    jSONObject = optJSONObject.optJSONObject("register_v2");
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    C17670w0 c17670w0 = C17670w0.f89662a;
                    c17670w0.m93659k(jSONObject.optInt("enable", c17670w0.m93652d()));
                    String optString = jSONObject.optString("otp_help_link", c17670w0.m93655g());
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    c17670w0.m93662n(optString);
                    String optString2 = jSONObject.optString("naming_guideline", c17670w0.m93654f());
                    AbstractC19074t.m100207e(optString2, "optString(...)");
                    c17670w0.m93661m(optString2);
                    String optString3 = jSONObject.optString("contact_link", c17670w0.m93653e());
                    AbstractC19074t.m100207e(optString3, "optString(...)");
                    c17670w0.m93660l(optString3);
                    c17670w0.m93658j(jSONObject.optInt("enable_api_native", c17670w0.m93651c()));
                }
                if (optJSONObject2 != null) {
                    l11 = Long.valueOf(optJSONObject2.optLong("ttl", 28800L));
                }
                AbstractC0924m0.m4208sm(String.valueOf(jSONObject));
                if (l11 != null) {
                    AbstractC0924m0.m4178rm((l11.longValue() * 1000) + System.currentTimeMillis());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$g */
    /* loaded from: classes.dex */
    public static final class C6901g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f37873t;

        C6901g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C6901g(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f37873t == 0) {
                AbstractC24862s.m129228b(obj);
                MainApplication.this.m35456R0();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C6901g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$h */
    /* loaded from: classes.dex */
    public static final class C6902h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f37875t;

        /* renamed from: u */
        final /* synthetic */ long f37876u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6902h(long j11, Continuation continuation) {
            super(2, continuation);
            this.f37876u = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C6902h(this.f37876u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f37875t == 0) {
                AbstractC24862s.m129228b(obj);
                C23952g.m125345j("STARTUP_PERFORMANCE", "application-initCoreOnProcessInit: " + (SystemClock.elapsedRealtime() - this.f37876u) + " ms");
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C6902h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$i */
    /* loaded from: classes3.dex */
    public static final class C6903i extends C1698f.f {
        C6903i() {
        }

        @Override // androidx.emoji2.text.C1698f.f
        /* renamed from: a */
        public void mo8704a(Throwable th2) {
            super.mo8704a(th2);
            C28652r.m143349v().f132848n = false;
        }

        @Override // androidx.emoji2.text.C1698f.f
        /* renamed from: b */
        public void mo8705b() {
            super.mo8705b();
            C28652r.m143349v().f132848n = true;
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$j */
    /* loaded from: classes.dex */
    public static final class C6904j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C6904j f37877q = new C6904j();

        C6904j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.UPLOAD_QOS);
            AbstractC19074t.m100207e(m145033a, "getUrlCommand(...)");
            return m145033a;
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$k */
    /* loaded from: classes.dex */
    public static final class C6905k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f37878t;

        /* renamed from: u */
        final /* synthetic */ long f37879u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6905k(long j11, Continuation continuation) {
            super(2, continuation);
            this.f37879u = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C6905k(this.f37879u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f37878t == 0) {
                AbstractC24862s.m129228b(obj);
                C23952g.m125345j("STARTUP_PERFORMANCE", "application-initPlatformOnProcessInit: " + (SystemClock.elapsedRealtime() - this.f37879u) + " ms");
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C6905k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$l */
    /* loaded from: classes.dex */
    public static final class C6906l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f37880t;

        /* renamed from: u */
        final /* synthetic */ C9051c f37881u;

        /* renamed from: v */
        final /* synthetic */ IPreferences f37882v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6906l(C9051c c9051c, IPreferences iPreferences, Continuation continuation) {
            super(2, continuation);
            this.f37881u = c9051c;
            this.f37882v = iPreferences;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C6906l(this.f37881u, this.f37882v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f37880t == 0) {
                AbstractC24862s.m129228b(obj);
                if (!AbstractC0924m0.m3716ca()) {
                    HashSet hashSet = new HashSet();
                    this.f37881u.m48469j(this.f37882v, hashSet);
                    C20127a.m104751b(hashSet, true);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C6906l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$m */
    /* loaded from: classes.dex */
    public static final class C6907m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f37883t;

        /* renamed from: u */
        final /* synthetic */ long f37884u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6907m(long j11, Continuation continuation) {
            super(2, continuation);
            this.f37884u = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C6907m(this.f37884u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f37883t == 0) {
                AbstractC24862s.m129228b(obj);
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                C6895a c6895a = MainApplication.Companion;
                MainApplication.f37848N = displayMetrics.widthPixels;
                MainApplication.f37849O = displayMetrics.heightPixels;
                C23952g.m125345j("STARTUP_PERFORMANCE", "application-initSharedProcess: " + (SystemClock.elapsedRealtime() - this.f37884u) + " ms");
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C6907m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$n */
    /* loaded from: classes3.dex */
    public static final class C6908n extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f37885t;

        C6908n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C6908n(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f37885t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C26675a c26675a = C26675a.f126213a;
                MainApplication mainApplication = MainApplication.f37847M;
                this.f37885t = 1;
                if (c26675a.m136924n(mainApplication, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C6908n) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$o */
    /* loaded from: classes.dex */
    static final class C6909o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C6909o f37886q = new C6909o();

        C6909o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ProcessLifecycleManager mo12V4() {
            return new ProcessLifecycleManager();
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$p */
    /* loaded from: classes.dex */
    static final class C6910p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f37887t;

        /* renamed from: u */
        final /* synthetic */ long f37888u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6910p(long j11, Continuation continuation) {
            super(2, continuation);
            this.f37888u = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C6910p(this.f37888u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f37887t == 0) {
                AbstractC24862s.m129228b(obj);
                C23952g.m125345j("STARTUP_PERFORMANCE", "application-applyTheme: " + (SystemClock.elapsedRealtime() - this.f37888u) + " ms");
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C6910p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$q */
    /* loaded from: classes.dex */
    static final class C6911q extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f37889t;

        /* renamed from: u */
        final /* synthetic */ long f37890u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6911q(long j11, Continuation continuation) {
            super(2, continuation);
            this.f37890u = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C6911q(this.f37890u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f37889t == 0) {
                AbstractC24862s.m129228b(obj);
                C23952g.m125345j("STARTUP_PERFORMANCE", "application-onCreate: " + (SystemClock.elapsedRealtime() - this.f37890u) + " ms");
                C23475l.m123240d().m123242a("App_Initializer");
                C23475l.m123240d().m123243b();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C6911q) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$r */
    /* loaded from: classes.dex */
    static final class C6912r extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f37891t;

        /* renamed from: u */
        final /* synthetic */ long f37892u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6912r(long j11, Continuation continuation) {
            super(2, continuation);
            this.f37892u = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C6912r(this.f37892u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f37891t == 0) {
                AbstractC24862s.m129228b(obj);
                C23952g.m125345j("STARTUP_PERFORMANCE", "application-onProcessInitialization: " + (SystemClock.elapsedRealtime() - this.f37892u) + " ms");
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C6912r) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$s */
    /* loaded from: classes.dex */
    static final class C6913s extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f37893t;

        C6913s(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C6913s(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f37893t == 0) {
                AbstractC24862s.m129228b(obj);
                String str = CoreUtility.f89233i;
                if (str != null && str.length() != 0) {
                    MainApplication mainApplication = MainApplication.this;
                    String str2 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str2, "currentUserUid");
                    C19172a.m100609t(mainApplication, str2, AbstractC21767b.f105718a.m112296a());
                    MainApplication.this.m35472g0();
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C6913s) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.MainApplication$t */
    /* loaded from: classes.dex */
    public static final class C6914t extends AbstractC27310a implements CoroutineExceptionHandler {
        public C6914t(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
    }

    public MainApplication() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(C6896b.f37869q);
        this.f37862G = m129210a;
        this.f37864I = SystemClock.elapsedRealtime();
        this.f37865J = System.currentTimeMillis();
        m129210a2 = AbstractC24856m.m129210a(new C6897c());
        this.f37866K = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C6909o.f37886q);
        this.f37867L = m129210a3;
    }

    /* renamed from: A0 */
    private final void m35426A0() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C21731c.Companion.m112155a();
        AbstractC23136l9.m118709g(this, null, false);
        AbstractC23304d.m120534e();
        try {
            NativeLoader.m89238q(this, EnumC16739a.f84885b0);
        } catch (Throwable unused) {
            NativeLoader.m89240s(this, EnumC16739a.f84889f0);
            ZaloNativeBridge.check(this);
        }
        AbstractC29633j.m147362k();
        AbstractC0761f.m1363c();
        AbstractC17148f0.m91692k(this);
        C25795c.f122999c = System.currentTimeMillis();
        InterfaceC22529a interfaceC22529a = AbstractC20887g.f102632a;
        CoreUtility.f89243s = interfaceC22529a;
        NativeLoader.m89243v(interfaceC22529a);
        try {
            C25498b.m132098b(this);
            m35444K0(this);
            AbstractC28105j8.m141581c();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
        try {
            AbstractC18942g.m99259o(this);
        } catch (Throwable th2) {
            AbstractC23350e.m122776f("MainApplication", th2);
        }
        m35462V();
        ZaloAnalytics.C7293b c7293b = ZaloAnalytics.Companion;
        if (!c7293b.m37219b().m37205X()) {
            c7293b.m37221d(this);
        }
        C29673d.f136989d.m147561W(AbstractC21767b.f105718a.m112296a(), C23793c.Companion.m124321a(), this, C23728a.Companion.m124066a());
        C19681e.Companion.m103275a().m103271j();
        m35440I0();
        BuildersKt__Builders_commonKt.m112540d(this, null, null, new C6905k(elapsedRealtime, null), 3, null);
    }

    /* renamed from: B0 */
    private final void m35428B0() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        CoreUtility.m93150c(this);
        AbstractC3972e.m18791k0(this);
        int myPid = Process.myPid();
        f37853S = myPid;
        String m119503l = AbstractC23193r0.m119503l(this, myPid);
        f37854T = m119503l;
        AbstractC23354i.m122792b(m119503l);
        f37852R = AbstractC23354i.m122791a();
        AbstractC23304d.f113381f = System.currentTimeMillis();
        AbstractC23304d.f113314P0 = f37853S;
        C23010a4 c23010a4 = C23010a4.f111960a;
        c23010a4.m117975c();
        AbstractC7306b.Companion.m37259c(this);
        if (AbstractC23354i.m122791a()) {
            C9051c c9051c = new C9051c();
            C9049a c9049a = new C9049a();
            AbstractC0908e0.m2827u(c9051c, null, c9049a);
            BuildersKt__Builders_commonKt.m112540d(this, null, null, new C6906l(c9051c, c9049a, null), 3, null);
        } else {
            AbstractC0908e0.m2827u(new C27382f(new C9051c()), null, null);
            AbstractC29633j.m147362k();
        }
        c23010a4.m117974b();
        CoreUtility.m93151d(new C28200u3());
        try {
            CoreUtility.f89236l = ((Number) m35474i0().m129215c()).intValue();
            CoreUtility.f89234j = (String) m35474i0().m129216d();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
        C23269y3.f112776a.m120043h(this);
        BuildersKt__Builders_commonKt.m112540d(this, null, null, new C6907m(elapsedRealtime, null), 3, null);
    }

    /* renamed from: C0 */
    private final void m35430C0() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            AbstractC23047d8.m118255g();
        }
    }

    /* renamed from: D0 */
    private final void m35432D0() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            C21720c m120630W1 = AbstractC23306f.m120630W1();
            AbstractC19074t.m100207e(m120630W1, "provideZCloudMigrateSharedPrefManager(...)");
            C21720c.m112103m(m120630W1, false, 1, null);
            AbstractC23306f.m120633X1().m89796A();
            AbstractC23306f.m120643a2().m89835c();
            AbstractC23306f.m120687l2().m152927d();
            AbstractC23306f.m120668h().m132687f();
            ZaloCloudRecoverCloudMediaWorker.Companion.m90205q(f37847M);
            AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: com.zing.zalo.p
                @Override // java.lang.Runnable
                public final void run() {
                    MainApplication.m35434E0();
                }
            }, 1000L);
            BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new C6908n(null), 3, null);
        }
    }

    /* renamed from: E0 */
    public static final void m35434E0() {
        AbstractC23306f.m120655d2().m112086v();
        AbstractC23306f.m120655d2().m112075g();
        AbstractC23306f.m120663f2().m90146q();
    }

    /* renamed from: F0 */
    private final void m35436F0() {
        try {
            ZaloAnalytics.C7293b c7293b = ZaloAnalytics.Companion;
            if (!c7293b.m37219b().m37205X() && !TextUtils.isEmpty(AbstractC0924m0.m4368y7())) {
                c7293b.m37220c(C23793c.Companion.m124321a(), new JSONObject(AbstractC0924m0.m4368y7()));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
    }

    /* renamed from: G0 */
    private final void m35437G0() {
        try {
            AbstractC23044d5.m118231d(Companion.m35500c(), EnumC16739a.f84885b0);
            NativeLoader.m89241t(C32554c.m157634h());
            NativeLoader.m89242u(C32556e.m157646h());
            AbstractC28827c.m144121e(new C19492c());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
    }

    /* renamed from: I0 */
    private final void m35440I0() {
        if (this.f37861F == null) {
            this.f37861F = new BroadcastReceiver() { // from class: com.zing.zalo.MainApplication$registerLanguageReceiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Resources resources;
                    Configuration configuration;
                    AbstractC19074t.m100208f(context, "context");
                    AbstractC19074t.m100208f(intent, "intent");
                    if (AbstractC19074t.m100204b(intent.getAction(), "android.intent.action.LOCALE_CHANGED") && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
                        C23269y3.f112776a.m120041b(configuration);
                    }
                }
            };
            Companion.m35500c().registerReceiver(this.f37861F, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        }
    }

    /* renamed from: J0 */
    private final void m35442J0() {
        try {
            Handler handler = new Handler(Looper.getMainLooper());
            IntentFilter m119028X = AbstractC23152n3.m119028X();
            AbstractC19074t.m100207e(m119028X, "makePhoneObserveIntentFiler(...)");
            this.f37857B = new ZaloReceiver();
            Companion.m35500c().registerReceiver(this.f37857B, m119028X, "android.permission.BROADCAST_SMS", handler);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
    }

    /* renamed from: K0 */
    private final void m35444K0(Context context) {
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                ZaloReceiver zaloReceiver = new ZaloReceiver();
                this.f37860E = zaloReceiver;
                AbstractC19074t.m100206d(zaloReceiver, "null cannot be cast to non-null type com.zing.zalo.receiver.ZaloReceiver");
                IntentFilter m118994F = AbstractC23152n3.m118994F();
                AbstractC19074t.m100207e(m118994F, "makeConnectionChangeIntentFiler(...)");
                AbstractC2351i.m12327a(context, zaloReceiver, m118994F, false);
                if (i11 >= 26) {
                    ZaloReceiver zaloReceiver2 = new ZaloReceiver();
                    this.f37858C = zaloReceiver2;
                    AbstractC19074t.m100206d(zaloReceiver2, "null cannot be cast to non-null type com.zing.zalo.receiver.ZaloReceiver");
                    IntentFilter m119024U = AbstractC23152n3.m119024U();
                    AbstractC19074t.m100207e(m119024U, "makePackageDetectIntentFiler(...)");
                    AbstractC2351i.m12327a(context, zaloReceiver2, m119024U, false);
                    ZaloReceiver zaloReceiver3 = new ZaloReceiver();
                    this.f37859D = zaloReceiver3;
                    AbstractC19074t.m100206d(zaloReceiver3, "null cannot be cast to non-null type com.zing.zalo.receiver.ZaloReceiver");
                    IntentFilter m119029Y = AbstractC23152n3.m119029Y();
                    AbstractC19074t.m100207e(m119029Y, "makeZaloReceiverAllIntentFiler(...)");
                    AbstractC2351i.m12327a(context, zaloReceiver3, m119029Y, false);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
    }

    /* renamed from: L0 */
    private final void m35445L0(Context context) {
        try {
            C24574j.m127992c().m127998h(context);
            C24574j.m127992c().m127996f(new InterfaceC24567c() { // from class: com.zing.zalo.k
                @Override // p406ow.InterfaceC24567c
                /* renamed from: a */
                public final void mo47667a(EnumC24566b enumC24566b) {
                    MainApplication.m35447M0(enumC24566b);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
    }

    /* renamed from: M0 */
    public static final void m35447M0(EnumC24566b enumC24566b) {
        int m116580c;
        if (enumC24566b != null) {
            try {
                enumC24566b.toString();
                if (enumC24566b.compareTo(EnumC24566b.GOOD) >= 0) {
                    m116580c = AbstractC22543l.m116580c(4, AbstractC23193r0.m119501j());
                    AbstractRunnableC23992c.m125560g1(m116580c);
                } else {
                    AbstractRunnableC23992c.m125560g1(2);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("MainApplication", e11);
            }
        }
    }

    /* renamed from: N0 */
    private final void m35449N0() {
        try {
            if (!AbstractC0924m0.m2988D9()) {
                return;
            }
            AbstractC22490a.f110023a = true;
            AbstractC22490a.m116279b(Companion.m35500c());
            AbstractC22490a.m116278a();
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.mo104560t(th2);
        }
    }

    /* renamed from: O0 */
    private final void m35450O0() {
        ZMediaPlayerSettings.playMode = AbstractC23309i.m121903fe();
        String m122428te = AbstractC23309i.m122428te();
        AbstractC19074t.m100205c(m122428te);
        ZMediaPlayerSettings.initZMediaPlayerSettings(m122428te);
        AbstractC26689j.m137091R(m122428te);
        C8917b.m47605n(AbstractC23309i.m120967G8());
        C8917b.m47606o(AbstractC23309i.m122344r4());
        C8917b.m47607p(AbstractC23309i.m122381s4());
        C8917b.m47604m(AbstractC23309i.m122208ng());
        C8917b.m47603l(AbstractC23309i.m122170mg());
    }

    /* renamed from: P0 */
    private final void m35452P0() {
        boolean m3686ba = AbstractC0924m0.m3686ba();
        boolean m3716ca = AbstractC0924m0.m3716ca();
        boolean m3395Ra = AbstractC0924m0.m3395Ra();
        String m104862W = AbstractC20130d.m104862W();
        AbstractC19074t.m100207e(m104862W, "getLevelDbPrefs(...)");
        if (m3395Ra && !m3716ca) {
            AbstractC0924m0.m3934ji(false);
            AbstractC20130d.m104889q(m104862W);
        }
        if (m3716ca) {
            try {
                C9050b m48455n = C9050b.m48455n(AbstractC23020b3.m118021b(f37847M).toString(), m104862W);
                AbstractC19074t.m100207e(m48455n, "makeInstance(...)");
                AbstractC0908e0.m2828v(m48455n, m3686ba);
                HashSet hashSet = new HashSet();
                m48455n.m48467l(AbstractC0908e0.m2807a(), hashSet);
                C20127a.m104751b(hashSet, true);
            } catch (Exception e11) {
                if (m3686ba) {
                    AbstractC0908e0.m2829w();
                }
                if (e11 instanceof LevelDBIOException) {
                    LevelDBIOException levelDBIOException = (LevelDBIOException) e11;
                    if (levelDBIOException.isLockByPid()) {
                        AbstractC20110a.f98889a.mo104551d("PreferencesLevelDB lock by " + levelDBIOException.getLockPid(), new Object[0]);
                        InternalProvider.Companion.m49015c(Companion.m35500c());
                    }
                }
            }
            if (!m3395Ra) {
                AbstractC0924m0.m3934ji(true);
                return;
            }
            return;
        }
        if (m3686ba) {
            AbstractC0908e0.m2829w();
        }
    }

    /* renamed from: Q0 */
    private final void m35454Q0() {
        try {
            if (AbstractC23165o5.m119333b()) {
                AbstractC23304d.f113266D0 = AbstractC23309i.m122048j9();
                AbstractC23304d.f113270E0 = AbstractC23309i.m121862eb();
                AbstractC23304d.f113278G0 = AbstractC23309i.m122465ue();
                AbstractC23304d.f113298L0 = AbstractC23309i.m122229o0();
                AbstractC23304d.f113302M0 = AbstractC23309i.m122266p0();
                AbstractC23304d.f113310O0 = AbstractC23309i.m122457u6();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
    }

    /* renamed from: R0 */
    public final void m35456R0() {
        try {
            if (AbstractC0924m0.m3070G4() < System.currentTimeMillis()) {
                m35477l0();
            }
            JSONObject jSONObject = new JSONObject(AbstractC0924m0.m3099H4());
            C17670w0 c17670w0 = C17670w0.f89662a;
            c17670w0.m93659k(jSONObject.optInt("enable", c17670w0.m93652d()));
            String optString = jSONObject.optString("otp_help_link", c17670w0.m93655g());
            AbstractC19074t.m100207e(optString, "optString(...)");
            c17670w0.m93662n(optString);
            String optString2 = jSONObject.optString("naming_guideline", c17670w0.m93654f());
            AbstractC19074t.m100207e(optString2, "optString(...)");
            c17670w0.m93661m(optString2);
            String optString3 = jSONObject.optString("contact_link", c17670w0.m93653e());
            AbstractC19074t.m100207e(optString3, "optString(...)");
            c17670w0.m93660l(optString3);
            c17670w0.m93658j(jSONObject.optInt("enable_api_native", c17670w0.m93651c()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: S0 */
    private final void m35458S0(Context context) {
        try {
            AbstractC19164e.m100540z(AbstractC23309i.m122019ig());
            if (C23476m.m123246d()) {
                AbstractC19164e.m100527m(context, C25801i.m132957d().m132960c(), AbstractC7306b.f40031a, AbstractC7306b.f40033c, AbstractC26684e.f126413f);
            }
            if (AbstractC26684e.f126412e) {
                C3148c.m15841b(context, new C18868a(), AbstractC25803k.m132968h()).m15844e();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
    }

    /* renamed from: T0 */
    private final void m35460T0() {
        int m3067G1 = AbstractC0924m0.m3067G1();
        int intValue = ((Number) m35474i0().m129215c()).intValue();
        if (m3067G1 <= 0) {
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1072c("app_version", BuildConfig.VERSION_CODE);
            String str = Build.VERSION.RELEASE;
            AbstractC19074t.m100207e(str, "RELEASE");
            c0708i.m1075f("os_version", str);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, "first_open", "", c0708i, null, 8, null);
            AbstractC0924m0.m3373Qh(System.currentTimeMillis());
        } else if (intValue > m3067G1) {
            C0732w m1189a2 = C0732w.Companion.m1189a();
            C0708i c0708i2 = new C0708i();
            c0708i2.m1072c("app_version", intValue);
            c0708i2.m1072c("prev_app_version", m3067G1);
            C24848g0 c24848g02 = C24848g0.f119245a;
            C0732w.m1177r(m1189a2, "app_update", "", c0708i2, null, 8, null);
        }
        AbstractC0924m0.m3026Ei(intValue);
        String m3473U1 = AbstractC0924m0.m3473U1();
        AbstractC19074t.m100207e(m3473U1, "getLastOsVersion(...)");
        if (m3473U1.length() > 0) {
            String str2 = Build.VERSION.RELEASE;
            if (!AbstractC19074t.m100204b(m3473U1, str2)) {
                C0732w m1189a3 = C0732w.Companion.m1189a();
                C0708i c0708i3 = new C0708i();
                AbstractC19074t.m100207e(str2, "RELEASE");
                c0708i3.m1075f("os_version", str2);
                c0708i3.m1075f("prev_os_version", m3473U1);
                C24848g0 c24848g03 = C24848g0.f119245a;
                C0732w.m1177r(m1189a3, "os_update", "", c0708i3, null, 8, null);
            }
        }
        AbstractC0924m0.m3461Ti(Build.VERSION.RELEASE);
    }

    /* renamed from: V */
    private final void m35462V() {
        try {
            int m121151L7 = AbstractC23309i.m121151L7();
            if (((Number) m35474i0().m129215c()).intValue() > m121151L7 && m121151L7 % 1000 < 470) {
                C3568b.m18124b().m18127d(new C6898d());
            }
        } catch (Throwable th2) {
            AbstractC23350e.m122776f("MainApplication", th2);
        }
        try {
            String m121789ce = AbstractC23309i.m121789ce();
            if (m121789ce != null && m121789ce.length() != 0) {
                JSONObject jSONObject = new JSONObject(m121789ce);
                if (CoreUtility.f89236l > jSONObject.optInt("newVersion")) {
                    int optInt = jSONObject.optInt("newVersion");
                    f37851Q = optInt;
                    jSONObject.put("oldVersion", optInt);
                    jSONObject.put("newVersion", CoreUtility.f89236l);
                    AbstractC23309i.m121216Mz(jSONObject.toString());
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            int m121079J9 = AbstractC23309i.m121079J9();
            f37851Q = m121079J9;
            jSONObject2.put("oldVersion", m121079J9);
            jSONObject2.put("newVersion", CoreUtility.f89236l);
            AbstractC23309i.m121216Mz(jSONObject2.toString());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0109 A[Catch: Exception -> 0x013c, TryCatch #1 {Exception -> 0x013c, blocks: (B:17:0x00f4, B:19:0x0109, B:21:0x0111, B:24:0x0118, B:26:0x011e, B:30:0x013e), top: B:16:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m35463W() {
        String uuid;
        String m122308q5;
        String str;
        boolean m127126v;
        try {
            int m121151L7 = AbstractC23309i.m121151L7();
            int intValue = ((Number) m35474i0().m129215c()).intValue();
            if (m121151L7 <= 0) {
                AbstractC20110a.f98889a.mo104556o(8, "Fresh install", new Object[0]);
            } else if (intValue > m121151L7) {
                try {
                    int i11 = m121151L7 % 1000;
                    if (460 <= i11 && i11 < 467) {
                        AbstractC20110a.f98889a.mo104556o(8, "reset notification channel - fix bug notification channel do not sync with user account", new Object[0]);
                        AbstractC23775p0.m124217v(1);
                    }
                    AbstractC23309i.m120764Ar(0L);
                    NativeLoader.m89226e(Companion.m35500c(), EnumC16739a.f84898x.m89284g());
                    String str2 = C20131e.f99303a.m104942a0() + "temp";
                    if (AbstractC23041d2.m118194A(str2)) {
                        AbstractC20130d.m104889q(str2);
                    }
                    if (i11 < 498) {
                        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                MainApplication.m35464X();
                            }
                        });
                    }
                    if (i11 < 732) {
                        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                MainApplication.m35465Y();
                            }
                        });
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            AbstractC23309i.m122144ls(intValue);
        } catch (Exception e12) {
            AbstractC23350e.m122776f("MainApplication", e12);
        }
        try {
            m122308q5 = AbstractC23309i.m122308q5();
            str = AbstractC7306b.f40031a;
        } catch (Exception e13) {
            AbstractC23350e.m122776f("MainApplication", e13);
        }
        try {
            if (m122308q5 != null && m122308q5.length() != 0) {
                m127126v = AbstractC24341v.m127126v(str, m122308q5, true);
                if (!m127126v) {
                }
                uuid = AbstractC23020b3.m118021b(f37847M).toString();
                AbstractC19074t.m100207e(uuid, "toString(...)");
                if (uuid.length() <= 0) {
                    String m121296P4 = AbstractC23309i.m121296P4();
                    if (m121296P4 != null && m121296P4.length() != 0) {
                        if (!AbstractC19074t.m100204b(m121296P4, uuid)) {
                            AbstractC23309i.m120845Cy(0L);
                            AbstractC23309i.m121811d(f37847M);
                            AbstractC23309i.m121773c(f37847M, "SETTING_ENABLE_CHAT_HEAD_CLIENT");
                            AbstractC23309i.m122618yj(true);
                            AbstractC23309i.m121395Rt(true);
                            AbstractC23309i.m122065jp(uuid);
                            AbstractC20887g.m109217D(17711, null, 2, null);
                            return;
                        }
                        return;
                    }
                    AbstractC23309i.m122065jp(uuid);
                    AbstractC20887g.m109217D(17710, null, 2, null);
                    return;
                }
                return;
            }
            uuid = AbstractC23020b3.m118021b(f37847M).toString();
            AbstractC19074t.m100207e(uuid, "toString(...)");
            if (uuid.length() <= 0) {
            }
        } catch (Exception e14) {
            AbstractC23350e.m122776f("MainApplication", e14);
            return;
        }
        C32556e.m157646h().m157649f();
        C6895a c6895a = Companion;
        NativeLoader.m89245x(c6895a.m35500c());
        NativeLoader.m89222a(c6895a.m35500c());
        AbstractC23309i.m121688Zq(0L);
        C32556e.m157646h().m157648e();
        AbstractC23309i.m122551wq(0L);
        C7962g.c.a aVar = C7962g.c.a.SERVICE_MAP;
        C18489c.m97854t(aVar, aVar.m42672d());
        AbstractC23309i.m121243Np(str);
    }

    /* renamed from: X */
    public static final void m35464X() {
        C32034n6.Companion.m154508a().m154505k();
    }

    /* renamed from: Y */
    public static final void m35465Y() {
        C7967l.Companion.m42748b().m42737p();
    }

    /* renamed from: Z */
    private final void m35466Z() {
        long m120773B = AbstractC23309i.m120773B();
        if (m120773B > 0 && this.f37864I < m120773B) {
            AbstractC23309i.m120912Er(0L);
        }
        AbstractC23309i.m121013Hh(this.f37864I);
        int m120736A = AbstractC23309i.m120736A();
        if (Math.abs(this.f37864I - m120773B) < 3000) {
            if (m120736A == 5) {
                AbstractC20887g.m109217D(19007, null, 2, null);
                TaskNonStickyExecutor.m50450b().m50454e(new Runnable() { // from class: com.zing.zalo.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainApplication.m35467a0();
                    }
                }, 1000L);
            }
            AbstractC23309i.m120976Gh(m120736A + 1);
            return;
        }
        AbstractC23309i.m120976Gh(0);
    }

    /* renamed from: a0 */
    public static final void m35467a0() {
        AbstractC20110a.f98889a.mo104552e(new IllegalStateException("app-restart-loop"));
    }

    /* renamed from: b0 */
    public static final void m35468b0() {
        Companion.m35499b();
    }

    /* renamed from: c0 */
    private final void m35469c0() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.o
            @Override // java.lang.Runnable
            public final void run() {
                MainApplication.m35470e0();
            }
        });
        new C0834o().start();
    }

    /* renamed from: e0 */
    public static final void m35470e0() {
        AbstractC20130d.m104885o();
    }

    /* renamed from: f0 */
    private final void m35471f0() {
    }

    /* renamed from: g0 */
    public final void m35472g0() {
        if (AbstractC21970a.m114736e() > 0) {
            C19172a.m100593d(new C6899e(null));
        }
    }

    public static final Context getAppContext() {
        return Companion.m35500c();
    }

    /* renamed from: h0 */
    private final C0952a m35473h0() {
        return (C0952a) this.f37862G.getValue();
    }

    /* renamed from: i0 */
    private final C24860q m35474i0() {
        return (C24860q) this.f37866K.getValue();
    }

    /* renamed from: j0 */
    public static final long m35475j0() {
        return Companion.m35503f();
    }

    /* renamed from: k0 */
    private final ProcessLifecycleManager m35476k0() {
        return (ProcessLifecycleManager) this.f37867L.getValue();
    }

    /* renamed from: l0 */
    private final void m35477l0() {
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C6900f());
            c0766k.mo1736s8();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m0 */
    private final void m35478m0() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            C31930g7.m153408g().m153418l();
            C32100s1.m154953d().m154963j();
            AbstractC23304d.m120548s();
            C23744a.Companion.m124119a().m124116d(6078, new Object[0]);
            AbstractC23309i.m121195Me();
            C20012f.f98380a.m103862p();
            C25244a.f121072a.m130657y();
            C32246a.f148777h.m155689a().m155683O();
        }
    }

    /* renamed from: n0 */
    private final void m35479n0() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            C0872f m120562A = AbstractC23306f.m120562A();
            AbstractC19074t.m100207e(m120562A, "provideChatRepo(...)");
            C32091r6.m154832b();
            C24265l.b bVar = C24265l.Companion;
            C24265l m126709b = bVar.m126709b();
            String m122304q1 = AbstractC23309i.m122304q1();
            AbstractC19074t.m100207e(m122304q1, "getDefaultReactionInfo(...)");
            m126709b.m126686K(m122304q1);
            bVar.m126709b().m126698n();
            m120562A.m2567z();
            C32037n9.f147516a.m154548A();
            m120562A.m2532a0();
            InterfaceC31005a m120726x1 = AbstractC23306f.m120726x1();
            AbstractC19074t.m100207e(m120726x1, "provideStickerRepo(...)");
            C3570a m120723w1 = AbstractC23306f.m120723w1();
            AbstractC19074t.m100207e(m120723w1, "provideStickerPanelRepository(...)");
            AbstractC0837p0.e eVar = AbstractC0837p0.Companion;
            eVar.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.l
                @Override // java.lang.Runnable
                public final void run() {
                    MainApplication.m35482q0();
                }
            });
            m120726x1.mo150752p();
            AbstractC23309i.m121197Mg();
            m120726x1.mo150737a();
            m120726x1.mo150750n();
            m120723w1.m18143l();
            AbstractC23306f.m120583H().m110203e();
            eVar.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.m
                @Override // java.lang.Runnable
                public final void run() {
                    MainApplication.m35480o0();
                }
            });
            C3255n.m16562n().m16567B();
            C32119t6.m155009c().m155019j();
            AbstractC23304d.m120551v();
            C32190y7.Companion.m155234a().m155225h();
            m120562A.m2515F();
            m120562A.m2511B();
            m120562A.m2514E();
            AbstractC23309i.m121866ef();
            AbstractC23309i.m122007i5(Companion.m35500c());
            AbstractC23309i.m121295P3();
            AbstractC23309i.m121183M2();
            AbstractC23309i.m121257O2();
            AbstractC23309i.m121294P2();
            AbstractC23309i.m121934g8();
            AbstractC23309i.m122351rb();
            AbstractC23309i.m121699a0();
            AbstractC23309i.m121490Ud();
            AbstractC23309i.m121379Rd();
            AbstractC23309i.m121234Ng();
            AbstractC23309i.m121527Vd();
            AbstractC23309i.m121888f0();
            AbstractC23309i.m121160Lg();
            AbstractC23309i.m120999H3();
            AbstractC23309i.m121977hc();
            AbstractC23309i.m121106K();
            AbstractC23309i.m122303q0();
            AbstractC23309i.m122005i3();
            AbstractC23309i.m122245og();
            AbstractC23309i.m122080k3();
            C30202c.f140315a.m148953d();
            AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: com.zing.zalo.n

                /* renamed from: p */
                public final /* synthetic */ String f48386p;

                public /* synthetic */ RunnableC9037n(String str2) {
                    r1 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MainApplication.m35481p0(r1);
                }
            }, 2000L);
        }
    }

    /* renamed from: o0 */
    public static final void m35480o0() {
        C3255n.m16562n().m16566A();
    }

    /* renamed from: p0 */
    public static final void m35481p0(String str) {
        C21216s m120652d = AbstractC23306f.m120652d();
        AbstractC19074t.m100205c(str);
        m120652d.m109877e1(str, false);
        AbstractC23306f.m120573D1().m109951J();
        AbstractC23306f.m120573D1().m109952L();
    }

    /* renamed from: q0 */
    public static final void m35482q0() {
        C28644j.m143233Y();
    }

    /* renamed from: r0 */
    private final void m35483r0() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            C7967l.Companion.m42748b().m42730E();
            C19669z.Companion.m103232a().m103229t0();
            C0804b.m2025g().m2034k();
        }
    }

    /* renamed from: s0 */
    private final void m35484s0() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            AbstractC23306f.m120721w().m154792i(Integer.MIN_VALUE);
            ChatView.m59378WU();
            ChatInputBar.m65373U(Companion.m35500c());
        }
    }

    /* renamed from: t0 */
    private final void m35485t0() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            C25641k.m132506o().m132509A();
            C26076k.m134208q().m134215C();
            C2556d.m12981o().m12985E();
            C25597b.Companion.m132226a().m132224e();
            C7960e.m41971c6().m42140H5();
            C7960e.m41971c6().m42301W5();
            C21913a0.m114177i().m114187n();
            C21916c.m114210e().m114222m();
            C21912a.m114159g().m114171l();
            C21937w.f108027a.m114575n();
            C21914b.f107731a.m114201l();
            AbstractC23063f2.m118351c(false);
            AbstractC23063f2.m118350b(false);
            C7960e.m41971c6().m42151I6();
            C7960e.m41971c6().m42188L5();
            C7960e.m41971c6().m42368d6();
            AbstractC23304d.m120552w();
            if (!C19669z.f97572T.get()) {
                C7960e.m41971c6().m42378e6();
            }
            AbstractC21935u.m114524N();
            if (AbstractC23309i.m121715af() && AbstractC23309i.m122650ze()) {
                C7960e.m41971c6().m42291V4();
                C21919e c21919e = AbstractC23304d.f113453x;
                if (c21919e != null && c21919e.m114269h() > 0) {
                    AbstractC0852x.g.m2376b().m2379d(true);
                }
            }
            C21917c0.m114228c().m114232e();
            C22436h.f109760a.m115921q();
            C18434b.Companion.m97695b().m97683g();
            C26691l.m137148w();
            AbstractC0924m0.m3675b();
        }
    }

    /* renamed from: u0 */
    private final void m35486u0() {
        List list;
        try {
            AbstractC23028c0.m118091k(f37847M);
            AbstractC0906d0.m2802h(f37847M);
            C18644n.m98531l();
            AbstractC0852x.m2363t();
            AbstractC0852x.m2338O(new SensitiveData("phonebook_auto_scan_on_startup", "phonebook_auto_scan", null, 4, null));
            C31849b1.m153097n().m153106h(false);
            String str = CoreUtility.f89233i;
            if (str != null && str.length() != 0) {
                AbstractC23304d.m120546q();
            }
            if (AbstractC23309i.m122562x0() == 1 && (list = AbstractC23304d.f113293K) != null) {
                AbstractC19074t.m100207e(list, "timeOnAppInfoArr");
                synchronized (list) {
                    AbstractC23304d.f113293K.clear();
                    AbstractC23304d.f113293K = C24709a.m128299t(Companion.m35500c()).m128301E(0, -1);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            }
            C19669z.f97570R.set(true);
            C18631a.m98445h();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
    }

    /* renamed from: v0 */
    private final void m35487v0() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            C31994kb.m154233h().m154248q(this);
        }
        m35454Q0();
        BuildersKt__Builders_commonKt.m112540d(this, null, null, new C6901g(null), 3, null);
        if (!AbstractC23138m0.Companion.m118777d()) {
            C28119l3.m141601c().m141602a();
        } else {
            String m122415t1 = AbstractC23309i.m122415t1();
            AbstractC19074t.m100205c(m122415t1);
            if (m122415t1.length() > 0) {
                C28119l3.m141601c().m141605e(m122415t1);
            }
        }
        BuildersKt__Builders_commonKt.m112540d(this, null, null, new C6902h(elapsedRealtime, null), 3, null);
    }

    /* renamed from: w0 */
    private final void m35488w0() {
        if (Build.VERSION.SDK_INT > C28652r.m143349v().f132849o) {
            return;
        }
        C1703k c1703k = new C1703k(this, new C1458e("com.google.android.gms.fonts", "com.google.android.gms", "Noto Color Emoji Compat", AbstractC16775v.com_google_android_gms_fonts_certs));
        c1703k.m8699c(AbstractC23136l9.m118641B(Companion.m35500c(), AbstractC16801x.transparent));
        c1703k.m8700d(true);
        c1703k.m8702f(C28652r.m143349v().f132850p);
        c1703k.m8698b(new C6903i());
        C1698f.m8680f(c1703k);
    }

    /* renamed from: x0 */
    private final void m35489x0() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            C26688i.f126427a.m137071e();
            C8967m.m47870P();
            if (AbstractC23309i.m120887E2() == 1) {
                AbstractC23188q6.m119486d();
            }
            C18403k.m97443p().m97464o();
            if (AbstractC0924m0.m3539W9() || AbstractC0924m0.m3568X9()) {
                C25994h.f124017a.m133921j();
            }
        }
    }

    /* renamed from: y0 */
    private final void m35490y0() {
        try {
            AbstractC23138m0.a aVar = AbstractC23138m0.Companion;
            if (aVar.m118778e()) {
                NetworkHelper.m48302k().m48311h(AbstractC23309i.m122152m(), AbstractC23309i.m122190n(), AbstractC23309i.m122501vd(), AbstractC23309i.m121523V9(), AbstractC23309i.m121481U4(), AbstractC23309i.m121268Od(), AbstractC23309i.m121116K9(), AbstractC23309i.m121157Ld());
                NetworkHelper m48302k = NetworkHelper.m48302k();
                String m119555f = AbstractC23204s0.m119555f();
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                m48302k.m48309f(m119555f, Integer.parseInt(str), AbstractC20887g.m109224b(), String.valueOf(CoreUtility.f89236l));
            }
            CampaignTrackingReceiver.m19017c(CoreUtility.getAppContext());
            if (C8937j0.m47663l("ads_id_get_info_on_startup")) {
                AbstractC2339c.m12301e(Companion.m35500c(), new SensitiveData("ads_id_get_info_on_startup", "ads_id", null, 4, null));
            }
            AbstractC28025b8.m141431B();
            if (aVar.m118777d()) {
                C0832n.m2179i().m2199x();
            }
            ZMediaPlayer.preloadLibrary(C20131e.m104912E());
            m35460T0();
            m35471f0();
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
    }

    /* renamed from: z0 */
    private final void m35492z0() {
        boolean z11;
        f37850P = AbstractC23193r0.m119499h(Companion.m35500c());
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            AbstractC23309i.m122059jj(f37847M, CoreUtility.f89233i);
        }
        C26465b.m136377b(new C3452a());
        boolean z12 = false;
        try {
            if (AbstractC23309i.m122089kb() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C13778s1.m76971l(z11);
            C13778s1.m76970k(Integer.valueOf(C13778s1.m76968i(AbstractC23309i.m122635z())));
            C13778s1.m76969j(AbstractC23309i.m122376s());
            AbstractC17148f0.m91699r();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
        AlarmReceiver.m49667e(Companion.m35500c());
        AbstractC27281h.a aVar = AbstractC27281h.Companion;
        aVar.m139668d(false);
        aVar.m139667c(false);
        try {
            AbstractC20886f.m109207g().mo145981a(C6904j.f37877q);
        } catch (Throwable th2) {
            AbstractC23350e.m122776f("MainApplication", th2);
        }
        InternalProvider.C9184a c9184a = InternalProvider.Companion;
        C6895a c6895a = Companion;
        c9184a.m49015c(c6895a.m35500c());
        m35452P0();
        m35437G0();
        m35442J0();
        try {
            AbstractC18942g.m99251g(c6895a.m35501d());
            AbstractC18942g.m99250f();
            if (C19172a.m100600k("zalosdk@preload@wakeup@wakeup_on_startup", 1) == 1 && !AbstractC0924m0.m3310Oc()) {
                AbstractC0924m0.m4062nq(true);
                AbstractC18942g.m99261q(c6895a.m35500c());
            }
        } catch (Exception e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
        }
        try {
            C7960e.m41971c6();
            C7959d.Companion.m41850e();
            C7965j.Companion.m42695a();
            AbstractC26683d.m137045e();
            AbstractC23775p0.m124207l();
            AbstractC23775p0.m124205j();
            if (AbstractC23775p0.m124206k()) {
                AbstractC20110a.f98889a.mo104556o(8, "sync server reset notification channel - application start", new Object[0]);
                AbstractC23775p0.m124217v(0);
            }
            C8937j0.m47662k(C23793c.Companion.m124321a());
            try {
                C21270p.Companion.m110161b().m110156i0();
                AbstractC23647d.m123896f(AbstractC29039u0.m145033a(AbstractC29039u0.b.UPLOAD_ACTION_LOG));
                C28905e.m144373n().m144394p(Companion.m35500c(), new C31999l1(), new C31892e());
            } catch (Exception e13) {
                AbstractC20110a.f98889a.mo104552e(e13);
            }
            C6895a c6895a2 = Companion;
            m35458S0(c6895a2.m35500c());
            if (AbstractC23309i.m122562x0() == 1 || AbstractC23309i.m120962G3(2) == 1) {
                C25795c.m132936d().m132940f();
            }
            C23010a4.f111960a.m117973a(C23010a4.a.Companion.m117976a());
            AbstractC0777e.m1938d(c6895a2.m35500c());
            m35445L0(c6895a2.m35500c());
            if (Build.VERSION.SDK_INT >= 28 && AbstractC23309i.m120814C3()) {
                z12 = true;
            }
            AbstractC23258x2.f112740a = z12;
            m35450O0();
            C3568b.m18124b().m18127d(null);
            AbstractC26689j.m137090Q(AbstractC23309i.m121710aa());
            AbstractC26685f.m137051b(AbstractC23309i.m121218N0());
            AbstractC20886f.m109209i(AbstractC23309i.m122129ld());
            Object systemService = c6895a2.m35500c().getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            C7853b.Companion.m40150a().m40132h1(((AudioManager) systemService).isSpeakerphoneOn());
            AbstractC23188q6.m119488f();
            MainApplication mainApplication = f37847M;
            AbstractC19074t.m100205c(mainApplication);
            C13718q1.m76694c(mainApplication, 7);
            AbstractC23306f.m120716u0().m154498b();
            AbstractC23306f.m120716u0().m154499c();
            m35488w0();
            C19681e.Companion.m103275a().m103267e();
        } catch (Throwable th3) {
            AbstractC20110a.f98889a.mo104552e(th3);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: O */
    public InterfaceC27315f mo9207O() {
        return Dispatchers.m112680b().mo112823d0(this.f37868z).mo112823d0(this.f37856A);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.startup.StartupApplication, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f37847M = this;
        MultiDex.install(this);
        CoreUtility.m93150c(this);
        C20358b.m106109a(this);
    }

    @Override // p021an.InterfaceC0954c
    /* renamed from: b */
    public Object mo4494b(InterfaceC23364b interfaceC23364b) {
        AbstractC19074t.m100208f(interfaceC23364b, "cls");
        return m35473h0().mo4494b(interfaceC23364b);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        AssetManager assetManager;
        Context context = this.f37863H;
        if (context != null) {
            assetManager = context.getAssets();
        } else {
            assetManager = null;
        }
        if (assetManager == null) {
            AssetManager assets = super.getAssets();
            AbstractC19074t.m100207e(assets, "getAssets(...)");
            return assets;
        }
        return assetManager;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources;
        Context context = this.f37863H;
        if (context != null) {
            resources = context.getResources();
        } else {
            resources = null;
        }
        if (resources == null) {
            Resources resources2 = super.getResources();
            AbstractC19074t.m100207e(resources2, "getResources(...)");
            return resources2;
        }
        return resources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme;
        Context context = this.f37863H;
        if (context != null) {
            theme = context.getTheme();
        } else {
            theme = null;
        }
        if (theme == null) {
            Resources.Theme theme2 = super.getTheme();
            AbstractC19074t.m100207e(theme2, "getTheme(...)");
            return theme2;
        }
        return theme;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        try {
            AbstractC23136l9.m118709g(this, configuration, true);
            AbstractC2379w.m12427a(configuration);
            if (C28652r.f132825q) {
                C28652r.m143349v().m143372j();
            }
            AbstractC17158i1.m91747f(this);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // com.zing.zalo.startup.StartupApplication, android.app.Application
    public void onCreate() {
        f37847M = this;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C23475l.m123241e((byte) 0, "App_Initializer");
        m35428B0();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        Companion.m35507j();
        C23212s8.m119597d(null, false, 0, 0, 12, null);
        BuildersKt__Builders_commonKt.m112540d(this, null, null, new C6910p(elapsedRealtime2, null), 3, null);
        super.onCreate();
        try {
            if (!f37852R) {
                m35449N0();
                AbstractC26683d.m137045e();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        BuildersKt__Builders_commonKt.m112540d(this, null, null, new C6911q(elapsedRealtime, null), 3, null);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        Companion.m35499b();
    }

    @Override // android.app.Application
    public void onTerminate() {
        try {
            AbstractC23647d.m123895e();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
        }
        if (AbstractC23309i.m122562x0() != 1) {
            if (AbstractC23309i.m120962G3(2) == 1) {
            }
            AbstractC18942g.m99257m(getApplicationContext());
            C32150v9.f148254a.m155130d();
            C16786d.Companion.m89645a();
            C27415j.Companion.m140374a();
            super.onTerminate();
        }
        C25795c.m132936d().m132941g();
        AbstractC18942g.m99257m(getApplicationContext());
        C32150v9.f148254a.m155130d();
        C16786d.Companion.m89645a();
        C27415j.Companion.m140374a();
        super.onTerminate();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        super.onTrimMemory(i11);
        AbstractC23006a0.m117912h0(i11);
    }

    @Override // com.zing.zalo.startup.StartupApplication
    /* renamed from: r */
    public void mo35493r() {
        if (!AbstractC23354i.m122791a()) {
            return;
        }
        AbstractC19646n0.m102949Y1();
        m35479n0();
        m35489x0();
        m35485t0();
        m35490y0();
        m35432D0();
        m35478m0();
        m35430C0();
        m35469c0();
    }

    @Override // com.zing.zalo.startup.StartupApplication
    /* renamed from: s */
    public void mo35494s() {
        if (!AbstractC23354i.m122791a()) {
            return;
        }
        m35484s0();
        AbstractC23304d.m120531b();
        C28157p5.m141667d().m141674e();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        AbstractC19074t.m100208f(intent, "intent");
        intent.addFlags(268435456);
        super.startActivity(intent);
        if (C18922m.f94409e) {
            C18922m.m99141t().m99143L();
        }
        C18922m.f94409e = true;
    }

    @Override // com.zing.zalo.startup.StartupApplication
    /* renamed from: u */
    public void mo35495u() {
        if (!AbstractC23354i.m122791a()) {
            return;
        }
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            C28652r.m143349v();
            C31986k3.f147083a.m154153z2();
        }
        C23219t4.Companion.m119684a().m119682o(false);
    }

    @Override // com.zing.zalo.startup.StartupApplication
    /* renamed from: w */
    public void mo35496w() {
        if (!AbstractC23354i.m122791a()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m35476k0().m47649c();
        m35426A0();
        m35487v0();
        BuildersKt__Builders_commonKt.m112540d(this, null, null, new C6912r(elapsedRealtime, null), 3, null);
    }

    @Override // com.zing.zalo.startup.StartupApplication
    /* renamed from: x */
    public void mo35497x() {
        boolean z11;
        if (AbstractC23354i.m122791a()) {
            BuildersKt__Builders_commonKt.m112540d(this, null, null, new C6913s(null), 3, null);
            if (!AbstractC23171p0.m119371c() && !AbstractC23136l9.m118654H0(Companion.m35500c())) {
                z11 = false;
            } else {
                z11 = true;
            }
            AbstractC23009a3.m117959j(z11);
            C6895a c6895a = Companion;
            AbstractC23006a0.m117902c0(c6895a.m35500c());
            AbstractC23161o1.m119319d(f37847M);
            m35436F0();
            try {
                C28023b6.m141265v(c6895a.m35500c());
            } catch (Throwable th2) {
                AbstractC23350e.m122776f("MainApplication", th2);
            }
            C32150v9.f148254a.m155131e();
            AbstractC29633j.m147362k();
            AbstractC20626a.m107395k(AbstractC23309i.m122201nA());
            m35449N0();
            m35463W();
            m35466Z();
            m35492z0();
            m35486u0();
            m35483r0();
            C23219t4.Companion.m119684a();
        }
    }
}
