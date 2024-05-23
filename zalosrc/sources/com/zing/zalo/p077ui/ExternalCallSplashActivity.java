package com.zing.zalo.p077ui;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.ExternalCallSplashActivity;
import com.zing.zalo.p077ui.zviews.AuthorizationAppView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.p077ui.zviews.WebAuthorizationView;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.receiver.AlarmReceiver;
import com.zing.zalo.register.StartUpNewView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.AbstractC17468f;
import com.zing.zalo.zview.AbstractC17470g;
import com.zing.zalo.zview.widget.InsetsLayout;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hu.AbstractC20130d;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import ly.C22688w;
import me0.AbstractC23152n3;
import me0.C23212s8;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.C24329j;
import p140ev.C18613b;
import p140ev.C18620i;
import p189gv.C19609h;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import vg.AbstractC28105j8;

/* loaded from: classes5.dex */
public final class ExternalCallSplashActivity extends BaseZaloActivity {
    public static final C10931a Companion = new C10931a(null);

    /* renamed from: l0 */
    private static final String f55220l0;

    /* renamed from: j0 */
    private C22688w f55222j0;

    /* renamed from: i0 */
    private Handler f55221i0 = new Handler(Looper.getMainLooper());

    /* renamed from: k0 */
    private Runnable f55223k0 = new Runnable() { // from class: h40.m
        public /* synthetic */ RunnableC19823m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ExternalCallSplashActivity.m56724N4(ExternalCallSplashActivity.this);
        }
    };

    /* renamed from: com.zing.zalo.ui.ExternalCallSplashActivity$a */
    /* loaded from: classes5.dex */
    public static final class C10931a {
        private C10931a() {
        }

        public /* synthetic */ C10931a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.ExternalCallSplashActivity$b */
    /* loaded from: classes5.dex */
    public static final class C10932b extends C22688w.b {
        C10932b() {
            super(null, ExternalCallSplashActivity.this, false);
        }

        /* renamed from: q0 */
        public static final void m56740q0(Class cls, Bundle bundle, ExternalCallSplashActivity externalCallSplashActivity, int i11) {
            AbstractC19074t.m100208f(cls, "$cls");
            AbstractC19074t.m100208f(bundle, "$data");
            AbstractC19074t.m100208f(externalCallSplashActivity, "this$0");
            try {
                Intent m119012O = AbstractC23152n3.m119012O(cls, bundle);
                AbstractC19074t.m100207e(m119012O, "makeIntentShowZaloView(...)");
                externalCallSplashActivity.startActivityForResult(m119012O, i11);
                externalCallSplashActivity.finish();
                externalCallSplashActivity.overridePendingTransition(AbstractC10919t.fade_in, AbstractC10919t.fade_out);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: a */
        public void mo49370a(int i11) {
            AbstractC19444a.m101695c(ExternalCallSplashActivity.this.m56738t4());
        }

        @Override // ly.C22688w.b, ly.InterfaceC22668c
        /* renamed from: e */
        public void mo49372e(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            super.mo49372e(c20096c);
            AbstractC19444a.m101695c(ExternalCallSplashActivity.this.m56738t4());
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: f */
        public void mo49373f(C19609h c19609h, C18620i c18620i) {
            AbstractC19074t.m100208f(c19609h, "miniProgramInfo");
            InterfaceC27218a mo49367R = mo49367R();
            if (mo49367R != null) {
                ExternalCallSplashActivity externalCallSplashActivity = ExternalCallSplashActivity.this;
                WebViewMPActivity.Companion.m57013b("showMPActivity " + c19609h.m102616j());
                if (WebBaseView.Companion.m86843s(mo49367R, c19609h, null, c18620i)) {
                    externalCallSplashActivity.finish();
                } else {
                    externalCallSplashActivity.finishAndRemoveTask();
                }
            }
        }

        @Override // ly.C22688w.b, ly.InterfaceC22668c
        /* renamed from: i */
        public void mo49376i(int i11) {
            super.mo49376i(i11);
            AbstractC19444a.m101695c(ExternalCallSplashActivity.this.m56738t4());
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: u */
        public void mo49386u(Class cls, Bundle bundle, int i11) {
            AbstractC19074t.m100208f(cls, "cls");
            AbstractC19074t.m100208f(bundle, "data");
            AbstractC19444a.m101695c(new Runnable() { // from class: h40.p

                /* renamed from: p */
                public final /* synthetic */ Class f97992p;

                /* renamed from: q */
                public final /* synthetic */ Bundle f97993q;

                /* renamed from: r */
                public final /* synthetic */ ExternalCallSplashActivity f97994r;

                /* renamed from: s */
                public final /* synthetic */ int f97995s;

                public /* synthetic */ RunnableC19835p(Class cls2, Bundle bundle2, ExternalCallSplashActivity externalCallSplashActivity, int i112) {
                    r1 = cls2;
                    r2 = bundle2;
                    r3 = externalCallSplashActivity;
                    r4 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ExternalCallSplashActivity.C10932b.m56740q0(r1, r2, r3, r4);
                }
            });
        }
    }

    static {
        String simpleName = ExternalCallSplashActivity.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f55220l0 = simpleName;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:            if (r0.equals("com.zing.zalo.intent.action.THIRD_PARTY_REQ_PERM") == false) goto L74;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:            m56736y4(r4, r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:            if (r0.equals("com.zing.zalo.intent.action.THIRD_PARTY_APP_AUTHORIZATION") == false) goto L74;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0017. Please report as an issue. */
    /* renamed from: F4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m56722F4(Intent intent) {
        String action = intent.getAction();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("action:");
        sb2.append(action);
        if (action != null) {
            switch (action.hashCode()) {
                case -1999165671:
                    break;
                case -1569790015:
                    if (action.equals("com.zing.zalo.intent.action.OPEN_USER_DETAIL")) {
                        return;
                    }
                    break;
                case -1173171990:
                    if (action.equals("android.intent.action.VIEW") && m56737z4(intent)) {
                        return;
                    }
                    break;
                case 157739987:
                    break;
                case 622838707:
                    if (action.equals("com.zing.zalo.action.CREATE_NEW_FEED")) {
                        m56734u4(intent);
                        return;
                    }
                    break;
                case 1389629899:
                    if (action.equals("com.zing.zalo.intent.action.OPEN_URL") && m56735v4(intent)) {
                        return;
                    }
                    break;
            }
        }
        finish();
        overridePendingTransition(AbstractC10919t.fade_in, AbstractC10919t.fade_out);
    }

    /* renamed from: H4 */
    private final void m56723H4() {
        try {
            AbstractC23304d.m120534e();
            AbstractC28105j8.m141584f(MainApplication.Companion.m35500c());
        } catch (Exception unused) {
            m56730a5();
        }
    }

    /* renamed from: N4 */
    public static final void m56724N4(ExternalCallSplashActivity externalCallSplashActivity) {
        AbstractC19074t.m100208f(externalCallSplashActivity, "this$0");
        try {
            externalCallSplashActivity.finish();
            externalCallSplashActivity.overridePendingTransition(AbstractC10919t.fade_in, AbstractC10919t.fade_out);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: O4 */
    public static final void m56725O4(ExternalCallSplashActivity externalCallSplashActivity) {
        AbstractC19074t.m100208f(externalCallSplashActivity, "this$0");
        AbstractC20130d.m104905y();
        externalCallSplashActivity.m56723H4();
        externalCallSplashActivity.m56731d5();
    }

    /* renamed from: V4 */
    public static final void m56727V4(ExternalCallSplashActivity externalCallSplashActivity) {
        AbstractC19074t.m100208f(externalCallSplashActivity, "this$0");
        Intent intent = externalCallSplashActivity.getIntent();
        AbstractC19074t.m100207e(intent, "getIntent(...)");
        externalCallSplashActivity.m56722F4(intent);
    }

    /* renamed from: a5 */
    private final void m56730a5() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        AbstractC23350e.m122782l("LoginBug", Arrays.copyOf(stackTrace, stackTrace.length));
        Intent m119018R = AbstractC23152n3.m119018R(StartUpNewView.class, null);
        AbstractC19074t.m100207e(m119018R, "makeIntentShowZaloViewClearStack(...)");
        startActivity(m119018R);
        m56732e4();
        finish();
    }

    /* renamed from: d5 */
    private final void m56731d5() {
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        try {
            String m121675Zd = AbstractC23309i.m121675Zd();
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            int length = str.length() - 1;
            int i14 = 0;
            boolean z14 = false;
            while (i14 <= length) {
                if (!z14) {
                    i13 = i14;
                } else {
                    i13 = length;
                }
                if (AbstractC19074t.m100209g(str.charAt(i13), 32) <= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z14) {
                    if (!z13) {
                        z14 = true;
                    } else {
                        i14++;
                    }
                } else if (!z13) {
                    break;
                } else {
                    length--;
                }
            }
            if (!AbstractC19074t.m100204b(str.subSequence(i14, length + 1).toString(), "")) {
                String str2 = CoreUtility.f89232h;
                AbstractC19074t.m100207e(str2, "sessionKey");
                int length2 = str2.length() - 1;
                int i15 = 0;
                boolean z15 = false;
                while (i15 <= length2) {
                    if (!z15) {
                        i12 = i15;
                    } else {
                        i12 = length2;
                    }
                    if (AbstractC19074t.m100209g(str2.charAt(i12), 32) <= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z15) {
                        if (!z12) {
                            z15 = true;
                        } else {
                            i15++;
                        }
                    } else if (!z12) {
                        break;
                    } else {
                        length2--;
                    }
                }
                if (!AbstractC19074t.m100204b(str2.subSequence(i15, length2 + 1).toString(), "")) {
                    AbstractC19074t.m100205c(m121675Zd);
                    int length3 = m121675Zd.length() - 1;
                    int i16 = 0;
                    boolean z16 = false;
                    while (i16 <= length3) {
                        if (!z16) {
                            i11 = i16;
                        } else {
                            i11 = length3;
                        }
                        if (AbstractC19074t.m100209g(m121675Zd.charAt(i11), 32) <= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z16) {
                            if (!z11) {
                                z16 = true;
                            } else {
                                i16++;
                            }
                        } else if (!z11) {
                            break;
                        } else {
                            length3--;
                        }
                    }
                    if (!AbstractC19074t.m100204b(m121675Zd.subSequence(i16, length3 + 1).toString(), "")) {
                        Intent intent = getIntent();
                        AbstractC19074t.m100207e(intent, "getIntent(...)");
                        m56722F4(intent);
                        return;
                    }
                }
            }
            m56730a5();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e4 */
    private final void m56732e4() {
        String dataString;
        boolean m127126v;
        boolean m127126v2;
        String action = getIntent().getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1999165671) {
                if (hashCode != -1173171990) {
                    if (hashCode != 157739987 || !action.equals("com.zing.zalo.intent.action.THIRD_PARTY_REQ_PERM")) {
                        return;
                    }
                } else {
                    if (action.equals("android.intent.action.VIEW") && (dataString = getIntent().getDataString()) != null) {
                        try {
                            URI uri = new URI(dataString);
                            m127126v = AbstractC24341v.m127126v("zalo", uri.getScheme(), true);
                            if (m127126v) {
                                m127126v2 = AbstractC24341v.m127126v("login", uri.getHost(), true);
                                if (m127126v2) {
                                    AbstractC23304d.f113268D2.set(true);
                                    Bundle bundle = new Bundle();
                                    bundle.putAll(getIntent().getExtras());
                                    bundle.putString("uri", uri.toString());
                                    AbstractC23304d.f113272E2 = bundle;
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
            } else if (!action.equals("com.zing.zalo.intent.action.THIRD_PARTY_APP_AUTHORIZATION")) {
                return;
            }
            AbstractC23304d.f113338V0 = true;
            AbstractC23304d.f113342W0 = System.currentTimeMillis();
            AuthorizationAppView.m78146mM(this);
        }
    }

    /* renamed from: m4 */
    private final void m56733m4(String str, boolean z11) {
        int i11;
        C22688w c22688w = new C22688w();
        c22688w.mo117295a(new C10932b());
        if (z11) {
            i11 = 10;
        } else {
            i11 = 4;
        }
        c22688w.m117350h(str, i11);
        this.f55222j0 = c22688w;
    }

    /* renamed from: u4 */
    private final void m56734u4(Intent intent) {
        boolean m127125u;
        boolean m127125u2;
        boolean m127125u3;
        boolean m127125u4;
        try {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Uri data = intent.getData();
            if (data != null) {
                MediaItem mediaItem = new MediaItem();
                String path = data.getPath();
                if (path == null) {
                    path = "";
                } else {
                    AbstractC19074t.m100205c(path);
                }
                mediaItem.mo41082W0(path);
                arrayList.add(mediaItem);
            }
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.intent.extra.STREAM");
            if (parcelableArrayExtra != null) {
                for (Parcelable parcelable : parcelableArrayExtra) {
                    try {
                        if (parcelable instanceof Uri) {
                            AbstractC19074t.m100206d(parcelable, "null cannot be cast to non-null type android.net.Uri");
                            Uri uri = (Uri) parcelable;
                            String path2 = uri.getPath();
                            if (path2 != null && path2.length() != 0) {
                                File file = new File(path2);
                                Locale locale = Locale.ROOT;
                                AbstractC19074t.m100207e(locale, "ROOT");
                                String lowerCase = path2.toLowerCase(locale);
                                AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                                if (file.exists() && file.isFile()) {
                                    m127125u = AbstractC24341v.m127125u(lowerCase, ".jpg", false, 2, null);
                                    if (!m127125u) {
                                        m127125u2 = AbstractC24341v.m127125u(lowerCase, ".png", false, 2, null);
                                        if (!m127125u2) {
                                            m127125u3 = AbstractC24341v.m127125u(lowerCase, ".bmp", false, 2, null);
                                            if (!m127125u3) {
                                                m127125u4 = AbstractC24341v.m127125u(lowerCase, ".gif", false, 2, null);
                                                if (m127125u4) {
                                                }
                                            }
                                        }
                                    }
                                    MediaItem mediaItem2 = new MediaItem();
                                    String path3 = uri.getPath();
                                    if (path3 == null) {
                                        path3 = "";
                                    } else {
                                        AbstractC19074t.m100205c(path3);
                                    }
                                    mediaItem2.mo41082W0(path3);
                                    arrayList.add(mediaItem2);
                                }
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122775e(f55220l0, "handleIntent", e11);
                    }
                }
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("multiUpload", true);
            bundle.putParcelableArrayList("extra_initial_photos", arrayList);
            String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
            if (stringExtra != null) {
                bundle.putString("status", stringExtra);
            }
            mo35579p().m93069k2(UpdateStatusView.class, bundle, 1, true);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        finish();
    }

    /* renamed from: v4 */
    private final boolean m56735v4(Intent intent) {
        boolean m127126v;
        boolean m127126v2;
        try {
            String dataString = intent.getDataString();
            if (dataString != null) {
                URI uri = new URI(dataString);
                if (AbstractC23152n3.m119025U0(intent)) {
                    m127126v = AbstractC24341v.m127126v("http", uri.getScheme(), true);
                    if (!m127126v) {
                        m127126v2 = AbstractC24341v.m127126v("https", uri.getScheme(), true);
                        if (m127126v2) {
                        }
                    }
                    int intExtra = intent.getIntExtra("open_url_featureId", -1);
                    boolean booleanExtra = intent.getBooleanExtra("EXTRA_OPEN_FROM_SHORTCUT", false);
                    if (intExtra == 1) {
                        startActivityForResult(AbstractC23152n3.m119012O(ZaloWebView.class, ZaloWebView.Companion.m87179u(dataString)), -1);
                    } else if (intExtra > 1) {
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("EXTRA_FEATURE_ID", new C18613b(intExtra));
                        bundle.putString("EXTRA_WEB_URL", dataString);
                        startActivityForResult(AbstractC23152n3.m119012O(ZaloWebView.class, bundle), -1);
                    } else {
                        m56733m4(dataString, booleanExtra);
                        return true;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: y4 */
    private final void m56736y4(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.putString("app_action", str);
        }
        mo35579p().mo57057c2(R.id.content, AuthorizationAppView.class, extras, 1001, null, 0, true);
    }

    /* renamed from: z4 */
    private final boolean m56737z4(Intent intent) {
        boolean m127126v;
        boolean m127126v2;
        boolean m127126v3;
        boolean m127126v4;
        boolean m127126v5;
        try {
            String dataString = intent.getDataString();
            if (dataString != null) {
                URI uri = new URI(dataString);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("dataString:");
                sb2.append(dataString);
                m127126v = AbstractC24341v.m127126v("zalo", uri.getScheme(), true);
                if (m127126v) {
                    m127126v5 = AbstractC24341v.m127126v("login", uri.getHost(), true);
                    if (m127126v5) {
                        Bundle bundle = new Bundle();
                        bundle.putAll(intent.getExtras());
                        bundle.putString("uri", uri.toString());
                        Intent m119012O = AbstractC23152n3.m119012O(WebAuthorizationView.class, bundle);
                        m119012O.setFlags(268435456);
                        AbstractC19074t.m100207e(m119012O, "apply(...)");
                        finish();
                        startActivity(m119012O);
                        return true;
                    }
                }
                m127126v2 = AbstractC24341v.m127126v("zalo", uri.getScheme(), true);
                if (!m127126v2) {
                    m127126v3 = AbstractC24341v.m127126v("http", uri.getScheme(), true);
                    if (!m127126v3) {
                        m127126v4 = AbstractC24341v.m127126v("https", uri.getScheme(), true);
                        if (!m127126v4) {
                            dataString = null;
                        }
                    }
                } else {
                    dataString = new C24329j("zalo://").m127020h(dataString, "http://");
                }
                if (dataString != null) {
                    m56733m4(dataString, intent.getBooleanExtra("EXTRA_OPEN_FROM_SHORTCUT", false));
                    return true;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity
    /* renamed from: d3 */
    protected void mo56688d3() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C23212s8.m119600g(context, false, AbstractC8915g0.ThemeDefault_NoActionbarDark, AbstractC8915g0.ThemeDefault_NoActionbarLight, 2, null);
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1001) {
            if (intent != null) {
                setResult(i12, intent);
            } else {
                setResult(i12);
            }
            finish();
        }
        super.onActivityResult(i11, i12, intent);
        C23744a.Companion.m124119a().m124116d(134, Integer.valueOf(i11), Integer.valueOf(i12), intent);
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        InsetsLayout insetsLayout = new InsetsLayout(this);
        insetsLayout.setApplyWindowInsetsListener(this);
        insetsLayout.setId(AbstractC6918a0.zalo_view_container);
        insetsLayout.addView(relativeLayout);
        setContentView(insetsLayout, new ViewGroup.LayoutParams(-1, -1));
        LayoutInflater.from(this).inflate(AbstractC17470g.splash, (ViewGroup) relativeLayout, true);
        View findViewById = findViewById(AbstractC6918a0.str_copyright);
        AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String string = getString(AbstractC8020f0.str_splashscreen_version);
        AbstractC19074t.m100207e(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{CoreUtility.f89234j}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        ((TextView) findViewById).setText(format);
        View findViewById2 = findViewById(AbstractC17468f.logosplash);
        AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) findViewById2).setImageResource(AbstractC16803z.img_splashscreen);
        Intent intent = new Intent(getContext(), (Class<?>) AlarmReceiver.class);
        intent.setAction("com.zing.zalo.intent.action.START_ZALO_BACKGROUND_SERVICE");
        sendBroadcast(intent);
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            if (bundle == null) {
                this.f55221i0.postDelayed(new Runnable() { // from class: h40.o
                    public /* synthetic */ RunnableC19831o() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ExternalCallSplashActivity.m56727V4(ExternalCallSplashActivity.this);
                    }
                }, 200L);
                return;
            }
            return;
        }
        this.f55221i0.postDelayed(new Runnable() { // from class: h40.n
            public /* synthetic */ RunnableC19827n() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ExternalCallSplashActivity.m56725O4(ExternalCallSplashActivity.this);
            }
        }, 200L);
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onDestroy() {
        C22688w c22688w = this.f55222j0;
        if (c22688w != null) {
            c22688w.m117349g();
        }
        super.onDestroy();
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4) {
            try {
                if (mo35579p().m93048Y0()) {
                    String action = getIntent().getAction();
                    if (!AbstractC19074t.m100204b("com.zing.zalo.intent.action.THIRD_PARTY_APP_AUTHORIZATION", action)) {
                        if (AbstractC19074t.m100204b("com.zing.zalo.intent.action.THIRD_PARTY_REQ_PERM", action)) {
                        }
                    }
                    finish();
                    return true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: t4 */
    public final Runnable m56738t4() {
        return this.f55223k0;
    }
}
