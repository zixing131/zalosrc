package com.zing.zalo.p077ui;

import ac.C0697c0;
import ac.C0722p;
import ac.InterfaceC0724q;
import ag0.AbstractC0837p0;
import am.C0923m;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.content.AbstractC1388a;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.WebViewMPActivity;
import com.zing.zalo.p077ui.chat.picker.file.FileSelectView;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.widget.mini.program.MiniAppInsetsLayout;
import com.zing.zalo.p077ui.zviews.MPWebView;
import com.zing.zalo.p077ui.zviews.MiniAppBaseView;
import com.zing.zalo.p077ui.zviews.MiniAppPopupView;
import com.zing.zalo.p077ui.zviews.OpenPermisionsSettingView;
import com.zing.zalo.p077ui.zviews.PickMediaView;
import com.zing.zalo.p077ui.zviews.ProfilePickerView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.webview.C16786d;
import com.zing.zalo.webview.C16790h;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.AbstractC17452c;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import li.AbstractC22490a;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p133ek.AbstractC18458a;
import p173fz.C19172a;
import p189gv.C19609h;
import p307kv.AbstractC21954k;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import yf0.C30946k;
import yt.EnumC31080j;
import yt.InterfaceC31077g;

/* loaded from: classes5.dex */
public final class WebViewMPActivity extends BaseZaloActivity implements InterfaceC0724q, InterfaceC31077g, C23744a.c {
    public static final C10961a Companion = new C10961a(null);

    /* renamed from: w0 */
    private static final ArrayList f55435w0;

    /* renamed from: k0 */
    private Timer f55438k0;

    /* renamed from: l0 */
    private boolean f55439l0;

    /* renamed from: m0 */
    private boolean f55440m0;

    /* renamed from: n0 */
    private int f55441n0;

    /* renamed from: p0 */
    private C19609h f55443p0;

    /* renamed from: q0 */
    private MiniAppInsetsLayout f55444q0;

    /* renamed from: r0 */
    private final InterfaceC24854k f55445r0;

    /* renamed from: s0 */
    private boolean f55446s0;

    /* renamed from: t0 */
    private String f55447t0;

    /* renamed from: u0 */
    private boolean f55448u0;

    /* renamed from: v0 */
    private boolean f55449v0;

    /* renamed from: i0 */
    private String f55436i0 = "";

    /* renamed from: j0 */
    private String f55437j0 = "";

    /* renamed from: o0 */
    private String f55442o0 = "";

    /* renamed from: com.zing.zalo.ui.WebViewMPActivity$a */
    /* loaded from: classes5.dex */
    public static final class C10961a {
        private C10961a() {
        }

        public /* synthetic */ C10961a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ArrayList m57012a() {
            return WebViewMPActivity.f55435w0;
        }

        /* renamed from: b */
        public final void m57013b(String str) {
            AbstractC19074t.m100208f(str, "msg");
        }

        /* renamed from: c */
        public final void m57014c(Context context, Window window, Class cls) {
            AbstractC19074t.m100208f(context, "context");
            C16790h.b bVar = C16790h.Companion;
            if (!bVar.m89696a(cls, MiniAppBaseView.class) && window != null) {
                window.setStatusBarColor(AbstractC23136l9.m118641B(context, AbstractC17452c.statusBarColor));
            }
            if (!AbstractC19074t.m100204b(cls, MPWebView.class) && (context instanceof Activity) && !bVar.m89696a(cls, MiniAppPopupView.class)) {
                AbstractC21954k.Companion.m114611L((Activity) context, true, context instanceof ZaloLauncherActivity);
            }
        }

        /* renamed from: d */
        public final boolean m57015d() {
            if (C19172a.m100600k("mini_program@new_loading_ui", 0) != 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.zing.zalo.ui.WebViewMPActivity$b */
    /* loaded from: classes5.dex */
    static final class C10962b extends AbstractC19075u implements InterfaceC18494a {
        C10962b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C10963c mo12V4() {
            return WebViewMPActivity.this.m56997y4();
        }
    }

    /* renamed from: com.zing.zalo.ui.WebViewMPActivity$c */
    /* loaded from: classes5.dex */
    public static final class C10963c implements Application.ActivityLifecycleCallbacks {
        C10963c() {
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
            WebViewMPActivity.this.m56999B5(false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC19074t.m100208f(activity, "activity");
            AbstractC19074t.m100208f(bundle, "outState");
            WebViewMPActivity.this.m56999B5(true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
        }
    }

    /* renamed from: com.zing.zalo.ui.WebViewMPActivity$d */
    /* loaded from: classes5.dex */
    public static final class C10964d extends TimerTask {
        C10964d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            WebViewMPActivity.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.WebViewMPActivity$e */
    /* loaded from: classes5.dex */
    public static final class C10965e extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C19609h f55453l1;

        /* renamed from: m1 */
        final /* synthetic */ WebViewMPActivity f55454m1;

        /* renamed from: n1 */
        final /* synthetic */ C3977j f55455n1;

        C10965e(C19609h c19609h, WebViewMPActivity webViewMPActivity, C3977j c3977j) {
            this.f55453l1 = c19609h;
            this.f55454m1 = webViewMPActivity;
            this.f55455n1 = c3977j;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap bitmap;
            try {
                if (!TextUtils.isEmpty(str) && AbstractC19074t.m100204b(str, this.f55453l1.m102612f()) && this.f55454m1.m56695v3()) {
                    this.f55455n1.setImageInfo(c3979l, false);
                    if (c3979l != null) {
                        bitmap = c3979l.m18839c();
                    } else {
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        Bitmap m56998z4 = this.f55454m1.m56998z4(bitmap);
                        this.f55454m1.setTaskDescription(new ActivityManager.TaskDescription(this.f55454m1.getString(AbstractC8020f0.app_name) + ": " + this.f55453l1.m102619m(), m56998z4));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    static {
        ArrayList m131500h;
        m131500h = AbstractC25368s.m131500h(MPWebView.class, ZaloWebView.class, PickMediaView.class, GalleryPickerView.class, FileSelectView.class, ProfilePickerView.class, ShareView.class, OpenPermisionsSettingView.class);
        f55435w0 = m131500h;
    }

    public WebViewMPActivity() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C10962b());
        this.f55445r0 = m129210a;
        this.f55447t0 = "";
        this.f55448u0 = true;
    }

    /* renamed from: D5 */
    private final void m56983D5() {
        C17487o0 mo35579p = mo35579p();
        if (mo35579p != null && mo35579p.m93018M0() == 0) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putInt("SHOW_WITH_FLAGS", 67108864);
            extras.putInt("SHOW_WITH_FLAGS", 16777216);
            C17487o0 mo35579p2 = mo35579p();
            if (mo35579p2 != null) {
                mo35579p2.m93069k2(MPWebView.class, extras, 0, true);
            }
        }
    }

    /* renamed from: E5 */
    private final void m56984E5() {
        C0697c0.b bVar = C0697c0.Companion;
        bVar.m1048b().m1043u("MiniAppView");
        bVar.m1054h("MiniAppView", "appid", this.f55436i0);
    }

    /* renamed from: F4 */
    public static final void m56985F4(WebViewMPActivity webViewMPActivity) {
        AbstractC19074t.m100208f(webViewMPActivity, "this$0");
        try {
            int m92990C0 = webViewMPActivity.mo35579p().m92990C0(webViewMPActivity.f55447t0, true);
            if (m92990C0 == 0) {
                webViewMPActivity.finish();
                return;
            }
            ZaloView m93012K0 = webViewMPActivity.mo35579p().m93012K0();
            if (m93012K0 instanceof MPWebView) {
                webViewMPActivity.mo35579p().mo92702G1(m93012K0, 0);
            } else {
                webViewMPActivity.mo35579p().m92985A0(m92990C0);
                webViewMPActivity.mo35579p().mo92702G1(m93012K0, 0);
            }
            C16786d.a.m89644c(C16786d.Companion, null, 1, null).m89640g0(webViewMPActivity.f55436i0);
            C23744a.Companion.m124119a().m124116d(9008, new Object[0]);
        } catch (Exception e11) {
            AbstractC22490a.m116282e(new Exception("WebViewMPActivity:didReceivedEvent:9007", e11));
        }
    }

    /* renamed from: N4 */
    public static final void m56986N4(WebViewMPActivity webViewMPActivity) {
        AbstractC19074t.m100208f(webViewMPActivity, "this$0");
        webViewMPActivity.finish();
    }

    /* renamed from: O4 */
    private final Application.ActivityLifecycleCallbacks m56987O4() {
        return (Application.ActivityLifecycleCallbacks) this.f55445r0.getValue();
    }

    /* renamed from: a5 */
    private final void m56991a5() {
        Window window;
        if (Companion.m57015d()) {
            if (C23212s8.m119603k() && (window = getWindow()) != null) {
                window.setBackgroundDrawable(AbstractC1388a.m6964f(this, AbstractC16803z.mini_app_splash_bg_light));
            }
            if (Build.VERSION.SDK_INT >= 31) {
                setTranslucent(false);
            }
        }
    }

    /* renamed from: e5 */
    public static final void m56993e5(WebViewMPActivity webViewMPActivity) {
        AbstractC19074t.m100208f(webViewMPActivity, "this$0");
        try {
            C30946k m150528a = C30946k.Companion.m150528a();
            Context context = webViewMPActivity.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            m150528a.m150515i(context, webViewMPActivity.getTaskId());
        } catch (Exception unused) {
        }
    }

    /* renamed from: i5 */
    private final void m56994i5() {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    /* renamed from: y4 */
    public final C10963c m56997y4() {
        return new C10963c();
    }

    /* renamed from: z4 */
    public final Bitmap m56998z4(Bitmap bitmap) {
        Resources resources;
        Context context = getContext();
        if (context != null) {
            resources = context.getResources();
        } else {
            resources = null;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, AbstractC16803z.app_icon), (bitmap.getWidth() * 2) / 5, (bitmap.getHeight() * 2) / 5, false);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, new Matrix(), null);
        canvas.translate(bitmap.getWidth() - createScaledBitmap.getWidth(), bitmap.getHeight() - createScaledBitmap.getHeight());
        canvas.drawBitmap(createScaledBitmap, new Matrix(), null);
        createScaledBitmap.recycle();
        return createBitmap;
    }

    /* renamed from: B5 */
    public final void m56999B5(boolean z11) {
        this.f55446s0 = z11;
    }

    /* renamed from: H4 */
    public final void m57000H4() {
        AbstractC19444a.m101695c(new Runnable() { // from class: h40.y1
            public /* synthetic */ RunnableC19873y1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebViewMPActivity.m56986N4(WebViewMPActivity.this);
            }
        });
    }

    /* renamed from: H5 */
    public final void m57001H5(C19609h c19609h) {
        AbstractC19074t.m100208f(c19609h, "mpInfo");
        if (!AbstractC19074t.m100204b(this.f55436i0, c19609h.m102616j())) {
            return;
        }
        this.f55443p0 = c19609h;
        C16786d.a.m89644c(C16786d.Companion, null, 1, null).mo47804f(c19609h, false);
        if (!AbstractC19074t.m100204b(this.f55437j0, c19609h.m102612f())) {
            this.f55437j0 = c19609h.m102612f();
            Context context = getContext();
            if (context != null) {
                C23528a c23528a = new C23528a(context);
                C3977j c3977j = new C3977j(context);
            }
        }
    }

    /* renamed from: V4 */
    public final String m57002V4() {
        return this.f55436i0;
    }

    @Override // yt.InterfaceC31077g
    /* renamed from: W0 */
    public void mo57003W0(Intent intent) {
        AbstractC19074t.m100208f(intent, "intent");
        C16786d.a.m89644c(C16786d.Companion, null, 1, null).m47795P();
        AbstractC21954k.Companion.m114627v(this, intent);
    }

    @Override // yt.InterfaceC31077g
    /* renamed from: c */
    public void mo57004c(EnumC31080j enumC31080j) {
        AbstractC19074t.m100208f(enumC31080j, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        if (m56695v3()) {
            m56994i5();
            return;
        }
        this.f55448u0 = false;
        this.f55449v0 = true;
        C30946k.Companion.m150528a().m150513f(getTaskId());
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity
    /* renamed from: d3 */
    protected void mo56688d3() {
        int i11;
        int i12;
        C10961a c10961a = Companion;
        if (c10961a.m57015d()) {
            i11 = AbstractC8915g0.Theme_MiniApp_DarkFullscreenLoading;
        } else {
            i11 = AbstractC8915g0.ThemeDefault_MP_Dark;
        }
        if (c10961a.m57015d()) {
            i12 = AbstractC8915g0.Theme_MiniApp_LightFullscreenLoading;
        } else {
            i12 = AbstractC8915g0.ThemeDefault_MP_Light;
        }
        C23212s8.m119600g(this, false, i11, i12, 2, null);
    }

    /* renamed from: d5 */
    public final boolean m57005d5() {
        return this.f55446s0;
    }

    @Override // android.app.Activity, p542ub.InterfaceC27218a
    public void finish() {
        C16786d.a aVar = C16786d.Companion;
        C16786d.a.m89644c(aVar, null, 1, null).m47800U(false);
        C16786d.a.m89644c(aVar, null, 1, null).m89640g0(this.f55436i0);
        aVar.m89651h(true);
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // ac.InterfaceC0724q
    /* renamed from: l0 */
    public C0722p.b mo1166l0() {
        return C0722p.b.APP_RESUME;
    }

    /* renamed from: o5 */
    public final void m57006o5() {
        C16786d.a aVar = C16786d.Companion;
        if (C16786d.a.m89644c(aVar, null, 1, null).m47785E() == null) {
            C16786d.a.m89644c(aVar, null, 1, null).m47799T(this);
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int i11;
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (AbstractC23309i.m122165mb() != 2) {
            return;
        }
        if ((configuration.uiMode & 48) == 32) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (i11 != this.f55441n0) {
            m56994i5();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object obj;
        mo56688d3();
        m56991a5();
        MainApplication.Companion.m35501d().registerActivityLifecycleCallbacks(m56987O4());
        requestWindowFeature(1);
        this.f37914M = new C16790h(getTaskId());
        super.onCreate(bundle);
        this.f55441n0 = C23212s8.m119601h();
        String str = AbstractC18458a.f93019a;
        AbstractC19074t.m100207e(str, "defaultLanguage");
        this.f55442o0 = str;
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("EXTRA_MINI_PROGRAM_ID")) {
            Bundle extras2 = getIntent().getExtras();
            if (extras2 != null) {
                obj = extras2.get("EXTRA_MINI_PROGRAM_ID");
            } else {
                obj = null;
            }
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            this.f55436i0 = (String) obj;
        }
        try {
            C0923m.Companion.m2890b(this);
            MiniAppInsetsLayout miniAppInsetsLayout = new MiniAppInsetsLayout(this, null, 0, 6, null);
            this.f55444q0 = miniAppInsetsLayout;
            miniAppInsetsLayout.setId(AbstractC6918a0.zalo_view_container);
            setContentView(this.f55444q0, new ViewGroup.LayoutParams(-1, -1));
            m56983D5();
            C16786d.a aVar = C16786d.Companion;
            aVar.m89645a();
            C16786d.a.m89644c(aVar, null, 1, null).m47799T(this);
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: h40.w1
                public /* synthetic */ RunnableC19865w1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WebViewMPActivity.m56993e5(WebViewMPActivity.this);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        C23744a.Companion.m124119a().m124115b(this, 9007);
        C16786d.Companion.m89651h(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onDestroy() {
        Timer timer = this.f55438k0;
        if (timer != null) {
            timer.cancel();
        }
        if (this.f55448u0) {
            C16786d.a.m89644c(C16786d.Companion, null, 1, null).m47799T(null);
        }
        MainApplication.Companion.m35501d().unregisterActivityLifecycleCallbacks(m56987O4());
        super.onDestroy();
        C23744a.Companion.m124119a().m124117e(this, 9007);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C0697c0.Companion.m1048b().m1035h("MiniAppView");
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        m56994i5();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f55449v0) {
            this.f55449v0 = false;
            m56994i5();
            return;
        }
        C30946k.Companion.m150531d(true);
        C19609h c19609h = this.f55443p0;
        if (c19609h != null) {
            C16786d.a.m89644c(C16786d.Companion, null, 1, null).mo47804f(c19609h, false);
        }
        this.f55440m0 = true;
        this.f55439l0 = false;
        try {
            Timer timer = this.f55438k0;
            if (timer != null) {
                timer.cancel();
            }
            this.f55438k0 = null;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        m56984E5();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        C30946k.a aVar = C30946k.Companion;
        aVar.m150531d(false);
        this.f55440m0 = false;
        C0697c0.Companion.m1048b().m1035h("MiniAppView");
        if (this.f55439l0) {
            try {
                Timer timer = new Timer();
                this.f55438k0 = timer;
                AbstractC19074t.m100205c(timer);
                timer.schedule(new C10964d(), aVar.m150528a().m150517k());
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    @Override // com.zing.zalo.analytics.ZaloTrackingActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onTopResumedActivityChanged(boolean z11) {
        super.onTopResumedActivityChanged(z11);
        if (z11) {
            m56984E5();
        }
    }

    /* renamed from: s5 */
    public final void m57007s5(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f55447t0 = str;
    }

    @Override // yt.InterfaceC31077g
    /* renamed from: t */
    public Bitmap mo57008t() {
        AbstractC21954k.a aVar = AbstractC21954k.Companion;
        View mo35585v = mo35585v();
        AbstractC19074t.m100207e(mo35585v, "getContentView(...)");
        return aVar.m114609J(mo35585v);
    }

    /* renamed from: u4 */
    public final void m57009u4(boolean z11) {
        AbstractC21954k.Companion.m114610K(this, z11);
        MiniAppInsetsLayout miniAppInsetsLayout = this.f55444q0;
        if (miniAppInsetsLayout != null) {
            miniAppInsetsLayout.setHideNavigationBar(!z11);
        }
    }

    /* renamed from: u5 */
    public final void m57010u5(String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f55436i0 = str;
        C30946k.Companion.m150528a().m150522s(this.f55436i0, getTaskId());
        C0697c0.Companion.m1054h("MiniAppView", "appid", this.f55436i0);
    }

    /* renamed from: v4 */
    public final void m57011v4(boolean z11) {
        C16786d.a.m89644c(C16786d.Companion, null, 1, null).m47800U(false);
        C30946k.Companion.m150528a().m150527y(this.f55436i0);
        if (!z11) {
            C23744a.Companion.m124119a().m124116d(9004, new Object[0]);
            finish();
        } else {
            this.f55439l0 = true;
            C23744a.Companion.m124119a().m124116d(9004, new Object[0]);
            moveTaskToBack(true);
        }
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 9007) {
            runOnUiThread(new Runnable() { // from class: h40.x1
                public /* synthetic */ RunnableC19869x1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WebViewMPActivity.m56985F4(WebViewMPActivity.this);
                }
            });
        }
    }
}
