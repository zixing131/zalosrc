package com.zing.zalo.p077ui.zviews;

import ac.C0732w;
import ae.C0766k;
import ag0.AbstractC0837p0;
import aj0.C0880c;
import am.AbstractC0924m0;
import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.camera2.CameraManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.AbstractC1324b;
import androidx.core.text.AbstractC1463b;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.RepeatOnLifecycleKt;
import au.AbstractC2379w;
import bj0.C2826e;
import bn.C2913t1;
import bv.EnumC3143a;
import bv.EnumC3144b;
import c30.C3245i;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.SensitiveExtraData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.WebAppInterface;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.dialog.ConfirmDialogView;
import com.zing.zalo.libwebview.browser.p067ui.ZaloSystemWebView;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.p077ui.WebViewMPActivity;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.widget.mini.program.SSLErrorPage;
import com.zing.zalo.p077ui.zviews.RotatableZaloView;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.C16766d;
import com.zing.zalo.webview.AbstractC16795m;
import com.zing.zalo.webview.C16783a;
import com.zing.zalo.webview.C16786d;
import com.zing.zalo.webview.C16789g;
import com.zing.zalo.webview.C16798n;
import com.zing.zalo.webview.ZWebView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.C17460a;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import dj.C18013y0;
import ej0.AbstractC18457a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19044c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19040a;
import fn0.C19067n0;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i20.C20196i;
import java.io.File;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import jj0.EnumC21279d;
import kf0.C21703a;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import li.AbstractC22490a;
import lj0.C22501b;
import lv.InterfaceC22653a;
import lv.InterfaceC22657e;
import me0.AbstractC23034c6;
import me0.AbstractC23093i;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23211s7;
import me0.AbstractC23254w8;
import me0.C23046d7;
import me0.C23055e5;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import org.json.JSONException;
import org.json.JSONObject;
import p006a0.C0015d;
import p135em.C18489c;
import p140ev.C18612a;
import p140ev.C18613b;
import p140ev.C18614c;
import p140ev.C18617f;
import p140ev.C18620i;
import p140ev.C18625n;
import p170fv.AbstractC19147a;
import p170fv.C19149c;
import p170fv.C19156j;
import p170fv.C19159m;
import p189gv.C19602a;
import p189gv.C19609h;
import p239ih.C20556f;
import p266jg.AbstractC21244b;
import p278jv.C21367a;
import p278jv.C21368b;
import p278jv.C21369c;
import p307kv.AbstractC21954k;
import p322lf.AbstractC22460a;
import p322lf.AbstractC22470k;
import p346mb.C22969a;
import p363nh.C23744a;
import p468r0.AbstractC25591b;
import p468r0.AbstractC25592c;
import p468r0.AbstractServiceConnectionC25594e;
import p468r0.C25593d;
import p468r0.C25595f;
import p542ub.InterfaceC27218a;
import p621wu.C29245b;
import p681yh.EnumC30982b;
import p693yu.InterfaceC31085c;
import p716zh.C32204z7;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25358n;
import sx.C26405g;
import th0.C26697c;
import th0.C26699e;
import vg.AbstractC28207v1;
import vg.AbstractC28248z6;
import vg.C28203u6;
import vg.C28239y6;
import vm0.AbstractC28298d;
import vu.C28630a;
import wf0.AbstractC28958c;
import wf0.AbstractC28959d;
import wm0.AbstractC29104l;
import x30.C29314i;
import xi0.C29673d;
import yf0.C30933c0;
import yf0.C30939f0;
import yf0.C30946k;
import yf0.C30957v;
import zm.AbstractC32236a;

/* loaded from: classes6.dex */
public class WebBaseView extends RotatableZaloView implements View.OnCreateContextMenuListener, InterfaceC22653a, InterfaceC31085c, C23744a.c {
    public static final C15353b Companion = new C15353b(null);

    /* renamed from: P1 */
    private static final String f79404P1;

    /* renamed from: Q1 */
    private static Exception f79405Q1;

    /* renamed from: R1 */
    private static final InterfaceC24854k f79406R1;

    /* renamed from: A1 */
    private boolean f79407A1;

    /* renamed from: B1 */
    private HashMap f79408B1;

    /* renamed from: C1 */
    public RelativeLayout f79409C1;

    /* renamed from: D1 */
    private String f79410D1;

    /* renamed from: E1 */
    private AtomicBoolean f79411E1;

    /* renamed from: F1 */
    private CameraManager f79412F1;

    /* renamed from: G1 */
    private C18612a f79413G1;

    /* renamed from: H1 */
    private boolean f79414H1;

    /* renamed from: I1 */
    private CameraManager.AvailabilityCallback f79415I1;

    /* renamed from: J1 */
    private C20196i f79416J1;

    /* renamed from: K1 */
    private boolean f79417K1;

    /* renamed from: L1 */
    private boolean f79418L1;

    /* renamed from: M1 */
    private int f79419M1;

    /* renamed from: N1 */
    private final int f79420N1;

    /* renamed from: O1 */
    private C28239y6 f79421O1;

    /* renamed from: T0 */
    private int f79422T0;

    /* renamed from: U0 */
    private MultiStateView f79423U0;

    /* renamed from: V0 */
    private ProgressBar f79424V0;

    /* renamed from: W0 */
    private RelativeLayout f79425W0;

    /* renamed from: X0 */
    private FrameLayout f79426X0;

    /* renamed from: Y0 */
    private RelativeLayout f79427Y0;

    /* renamed from: Z0 */
    private boolean f79428Z0;

    /* renamed from: a1 */
    private ZWebView f79429a1;

    /* renamed from: c1 */
    private C21368b f79431c1;

    /* renamed from: d1 */
    private C25595f f79432d1;

    /* renamed from: e1 */
    private AbstractC25592c f79433e1;

    /* renamed from: f1 */
    private AbstractServiceConnectionC25594e f79434f1;

    /* renamed from: g1 */
    private String f79435g1;

    /* renamed from: h1 */
    private String f79436h1;

    /* renamed from: i1 */
    private PermissionRequest f79437i1;

    /* renamed from: k1 */
    private final InterfaceC24854k f79439k1;

    /* renamed from: l1 */
    private final InterfaceC24854k f79440l1;

    /* renamed from: m1 */
    private String f79441m1;

    /* renamed from: n1 */
    private GeolocationPermissions.Callback f79442n1;

    /* renamed from: o1 */
    private C8009j f79443o1;

    /* renamed from: p1 */
    private int f79444p1;

    /* renamed from: q1 */
    private C29245b f79445q1;

    /* renamed from: r1 */
    private ValueCallback f79446r1;

    /* renamed from: s1 */
    private final InterfaceC24854k f79447s1;

    /* renamed from: t1 */
    private final InterfaceC24854k f79448t1;

    /* renamed from: u1 */
    private String f79449u1;

    /* renamed from: v1 */
    private C29314i f79450v1;

    /* renamed from: w1 */
    private int f79451w1;

    /* renamed from: x1 */
    private AbstractC19147a f79452x1;

    /* renamed from: y1 */
    private final InterfaceC24854k f79453y1;

    /* renamed from: z1 */
    private ConfirmDialogView f79454z1;

    /* renamed from: b1 */
    private String f79430b1 = "";

    /* renamed from: j1 */
    private final Map f79438j1 = new HashMap();

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$a */
    /* loaded from: classes6.dex */
    static final class C15352a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C15352a f79455q = new C15352a();

        C15352a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C22501b mo12V4() {
            return C29673d.m147521P();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$b */
    /* loaded from: classes6.dex */
    public static final class C15353b {
        private C15353b() {
        }

        public /* synthetic */ C15353b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: i */
        public final C22501b m86825i() {
            return (C22501b) WebBaseView.f79406R1.getValue();
        }

        /* renamed from: o */
        public static /* synthetic */ Bundle m86826o(C15353b c15353b, C19609h c19609h, String str, Bundle bundle, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = "";
            }
            if ((i11 & 4) != 0) {
                bundle = null;
            }
            return c15353b.m86840n(c19609h, str, bundle);
        }

        /* renamed from: q */
        public static final void m86827q() {
            try {
                String m3357Q1 = AbstractC0924m0.m3357Q1();
                if (m3357Q1 != null && m3357Q1.length() != 0) {
                    JSONObject jSONObject = new JSONObject(m3357Q1);
                    Iterator<String> keys = jSONObject.keys();
                    AbstractC19074t.m100207e(keys, "keys(...)");
                    while (keys.hasNext()) {
                        JSONObject optJSONObject = jSONObject.optJSONObject(keys.next());
                        if (optJSONObject != null) {
                            C15353b c15353b = WebBaseView.Companion;
                            String jSONObject2 = optJSONObject.toString();
                            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                            c15353b.m86832x(jSONObject2);
                        }
                    }
                }
                AbstractC0924m0.m3345Pi("{}");
            } catch (Exception e11) {
                AbstractC22490a.m116282e(new Exception("RotatableZaloView", e11));
            }
        }

        /* renamed from: t */
        public static /* synthetic */ boolean m86828t(C15353b c15353b, InterfaceC27218a interfaceC27218a, C19609h c19609h, Bundle bundle, C18620i c18620i, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                bundle = null;
            }
            if ((i11 & 8) != 0) {
                c18620i = null;
            }
            return c15353b.m86843s(interfaceC27218a, c19609h, bundle, c18620i);
        }

        /* renamed from: u */
        public static final void m86829u(Context context, Bundle bundle) {
            AbstractC19074t.m100208f(bundle, "$bundle");
            AbstractC19074t.m100206d(context, "null cannot be cast to non-null type com.zing.zalo.activity.ZaloActivity");
            ((ZaloActivity) context).mo35579p().m93069k2(MPWebView.class, bundle, 0, true);
        }

        /* renamed from: v */
        public static final void m86830v(Bundle bundle, Context context) {
            AbstractC19074t.m100208f(bundle, "$bundle");
            Intent m119014P = AbstractC23152n3.m119014P(MPWebView.class, bundle, false);
            AbstractC19074t.m100207e(m119014P, "makeIntentShowZaloView(...)");
            context.startActivity(m119014P);
        }

        /* renamed from: w */
        public static final void m86831w(Context context, Intent intent) {
            AbstractC19074t.m100208f(intent, "$intent");
            context.startActivity(intent);
            if (!AbstractC23136l9.m118650F0(context)) {
                AbstractC19074t.m100206d(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).moveTaskToBack(true);
            }
        }

        /* renamed from: x */
        private final void m86832x(String str) {
            JSONObject jSONObject = new JSONObject(str);
            C0732w m1189a = C0732w.Companion.m1189a();
            C16789g.a aVar = C16789g.Companion;
            m1189a.m1187q("ma_system_log", "", aVar.m89681b(jSONObject), aVar.m89680a(jSONObject));
        }

        /* renamed from: f */
        public final boolean m86833f(InterfaceC27218a interfaceC27218a) {
            return AbstractC23136l9.m118646D0(interfaceC27218a);
        }

        /* renamed from: g */
        public final String m86834g(C18613b c18613b, Bundle bundle, String str) {
            long j11;
            long j12;
            int i11;
            long j13;
            int i12;
            int i13;
            int i14;
            AbstractC19074t.m100208f(c18613b, "featureId");
            AbstractC19074t.m100208f(str, "extraParam");
            long j14 = 0;
            if (AbstractC19074t.m100204b(c18613b, C18613b.f93601t)) {
                if (bundle != null && bundle.containsKey("extra_cate_id")) {
                    i14 = bundle.getInt("extra_cate_id");
                } else {
                    i14 = 0;
                }
                i11 = i14;
                j11 = 0;
                j12 = 0;
            } else {
                if (AbstractC19074t.m100204b(c18613b, C18613b.f93600s)) {
                    if (bundle != null && bundle.containsKey("extra_zapp_id")) {
                        j13 = bundle.getLong("extra_zapp_id");
                    } else {
                        j13 = 0;
                    }
                    if (bundle != null && bundle.containsKey("extra_news_id")) {
                        j14 = bundle.getLong("extra_news_id");
                    }
                    if (bundle != null && bundle.getBoolean("extra_game_news", false)) {
                        i12 = 0;
                    } else {
                        i12 = 1;
                    }
                    i13 = i12;
                    j12 = j14;
                    j11 = j13;
                    i11 = 0;
                    return AbstractC21954k.Companion.m114615g(c18613b.m98348a(), new AbstractC21954k.b(i11, j11, j12, i13), str);
                }
                j11 = 0;
                j12 = 0;
                i11 = 0;
            }
            i13 = 0;
            return AbstractC21954k.Companion.m114615g(c18613b.m98348a(), new AbstractC21954k.b(i11, j11, j12, i13), str);
        }

        /* renamed from: h */
        public final int m86835h() {
            return AbstractC23136l9.m118713h0();
        }

        /* renamed from: j */
        public final String m86836j() {
            return WebBaseView.f79404P1;
        }

        /* renamed from: k */
        public final C18620i m86837k(Bundle bundle) {
            if (bundle == null) {
                C18620i c18620i = C18620i.f93694q;
                C21703a.m112010b(C21703a.f105414a, null, "WebBaseView.getMiniAppSource: bundle null", 1, null);
                return c18620i;
            }
            if (bundle.containsKey("EXTRA_SOURCE_LINK")) {
                int i11 = bundle.getInt("EXTRA_SOURCE_LINK");
                if (i11 != 30) {
                    if (i11 != 31) {
                        if (i11 != 33) {
                            if (i11 != 224) {
                                if (i11 != 260) {
                                    if (i11 != 410) {
                                        if (i11 != 411) {
                                            switch (i11) {
                                                case 10:
                                                case 12:
                                                    return C18620i.f93661D;
                                                case 11:
                                                    return C18620i.f93662E;
                                            }
                                        }
                                        return C18620i.f93703z;
                                    }
                                    return C18620i.f93697t;
                                }
                                if (bundle.getInt("SOURCE_EXTRA_FEATURE_ID") == C18613b.f93604w.m98348a()) {
                                    return C18620i.f93685b0;
                                }
                                return C18620i.f93673P;
                            }
                            return C18620i.f93689f0;
                        }
                        if (bundle.containsKey("CHAT_PAGE_MENU_VERSION")) {
                            int i12 = bundle.getInt("CHAT_PAGE_MENU_VERSION");
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    return C18620i.f93676S;
                                }
                            } else {
                                return C18620i.f93675R;
                            }
                        }
                        return C18620i.f93660C;
                    }
                    return C18620i.f93701x;
                }
                return C18620i.f93696s;
            }
            if (bundle.containsKey("EXTRA_SOURCE_OPEN_MA")) {
                C18620i c18620i2 = (C18620i) AbstractC21954k.Companion.m114622q(bundle, "EXTRA_SOURCE_OPEN_MA", C18620i.class);
                if (c18620i2 == null) {
                    C18620i c18620i3 = C18620i.f93694q;
                    C21703a.m112010b(C21703a.f105414a, null, "WebBaseView.getMiniAppSource: EXTRA_SOURCE_OPEN_MA", 1, null);
                    return c18620i3;
                }
                return c18620i2;
            }
            C21703a.m112010b(C21703a.f105414a, null, "WebBaseView.getMiniAppSource: no bundle keys", 1, null);
            return C18620i.f93694q;
        }

        /* renamed from: l */
        public final int m86838l() {
            return AbstractC23136l9.m118737p0();
        }

        /* renamed from: m */
        public final Exception m86839m() {
            return WebBaseView.f79405Q1;
        }

        /* renamed from: n */
        public final Bundle m86840n(C19609h c19609h, String str, Bundle bundle) {
            AbstractC19074t.m100208f(c19609h, "miniProgramInfo");
            AbstractC19074t.m100208f(str, "actionListTaskId");
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSerializable("EXTRA_MINI_PROGRAM", c19609h);
            bundle.putString("EXTRA_MINI_PROGRAM_ID", c19609h.m102616j());
            bundle.putString("EXTRA_WEB_URL", c19609h.m102620n());
            bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93597B);
            if (!C30946k.Companion.m150528a().m150514g(c19609h.m102616j())) {
                bundle.putInt("SHOW_WITH_FLAGS", 134217728);
            }
            bundle.putString("EXTRA_ACTION_LIST_TASK_ID", str);
            return bundle;
        }

        /* renamed from: p */
        public final synchronized void m86841p(Context context) {
            AbstractC19074t.m100208f(context, "context");
            if ((context instanceof ZaloLauncherActivity) && (((ZaloLauncherActivity) context).mo35579p().m93012K0() instanceof MPWebView)) {
                return;
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.d51
                @Override // java.lang.Runnable
                public final void run() {
                    WebBaseView.C15353b.m86827q();
                }
            });
        }

        /* renamed from: r */
        public final void m86842r(Exception exc) {
            WebBaseView.f79405Q1 = exc;
        }

        /* renamed from: s */
        public final boolean m86843s(InterfaceC27218a interfaceC27218a, C19609h c19609h, Bundle bundle, C18620i c18620i) {
            boolean isInMultiWindowMode;
            AbstractC19074t.m100208f(interfaceC27218a, "act");
            AbstractC19074t.m100208f(c19609h, "mpInfo");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 <= 23) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_os_not_supported));
                return false;
            }
            Context context = interfaceC27218a.getContext();
            m86842r(new Exception("startNewMPActivity"));
            AbstractC2379w.m12430d(interfaceC27218a.getCurrentFocus());
            C23744a.b bVar = C23744a.Companion;
            bVar.m124119a().m124116d(6061, new Object[0]);
            AbstractC19074t.m100205c(context);
            m86841p(context);
            Bundle m86826o = m86826o(this, c19609h, null, bundle, 2, null);
            if (interfaceC27218a instanceof WebViewMPActivity) {
                interfaceC27218a.mo35573l4(MPWebView.class, m86826o, 0, true);
                return true;
            }
            if (c18620i != null && !AbstractC19074t.m100204b(c18620i, C18620i.f93694q)) {
                m86826o.putSerializable("EXTRA_SOURCE_OPEN_MA", c18620i);
            }
            WebViewMPActivity.C10961a c10961a = WebViewMPActivity.Companion;
            c10961a.m57013b("Checking task for " + c19609h.m102616j());
            C30946k.a aVar = C30946k.Companion;
            if (aVar.m150528a().m150514g(c19609h.m102616j())) {
                C18617f.Companion.m98398b();
                if (context instanceof ZaloLauncherActivity) {
                    AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.a51

                        /* renamed from: p */
                        public final /* synthetic */ Context f79779p;

                        /* renamed from: q */
                        public final /* synthetic */ Bundle f79780q;

                        public /* synthetic */ a51(Context context2, Bundle m86826o2) {
                            r1 = context2;
                            r2 = m86826o2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            WebBaseView.C15353b.m86829u(r1, r2);
                        }
                    });
                } else if (aVar.m150528a().m150519n()) {
                    C16786d.a.m89644c(C16786d.Companion, null, 1, null).m47800U(true);
                    bVar.m124119a().m124116d(9005, m86826o2);
                } else {
                    AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.b51

                        /* renamed from: p */
                        public final /* synthetic */ Bundle f79886p;

                        /* renamed from: q */
                        public final /* synthetic */ Context f79887q;

                        public /* synthetic */ b51(Bundle m86826o2, Context context2) {
                            r1 = m86826o2;
                            r2 = context2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            WebBaseView.C15353b.m86830v(r1, r2);
                        }
                    });
                }
                return true;
            }
            if (m86826o2.containsKey("EXTRA_OPEN_FROM_MA_ID") && aVar.m150528a().m150521r()) {
                bVar.m124119a().m124116d(9010, m86826o2);
                return true;
            }
            if (aVar.m150528a().m150520p(context2, c19609h.m102616j(), true, true) == -1) {
                C18617f.Companion.m98398b();
                Intent intent = new Intent(context2, (Class<?>) WebViewMPActivity.class);
                intent.putExtras(m86826o2);
                intent.setFlags(134742016);
                if (!c10961a.m57015d()) {
                    intent.addFlags(65536);
                }
                boolean m110054d = AbstractC21244b.m110054d(context2);
                boolean m57054h = ZaloBubbleActivity.Companion.m57054h();
                boolean z11 = CoreUtility.f89239o;
                if (i11 >= 24 && !m57054h && !m110054d && z11) {
                    isInMultiWindowMode = ((ZaloActivity) context2).mo35575n1().isInMultiWindowMode();
                    if (isInMultiWindowMode) {
                        intent.setFlags(intent.getFlags() | 4096);
                    }
                }
                c10961a.m57013b("Start new activity " + c19609h.m102616j());
                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.c51

                    /* renamed from: p */
                    public final /* synthetic */ Context f79991p;

                    /* renamed from: q */
                    public final /* synthetic */ Intent f79992q;

                    public /* synthetic */ c51(Context context2, Intent intent2) {
                        r1 = context2;
                        r2 = intent2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        WebBaseView.C15353b.m86831w(r1, r2);
                    }
                });
                AbstractC28959d.m144630c(c19609h.m102616j(), false);
            } else {
                c10961a.m57013b("Open task for " + c19609h.m102616j());
                AbstractC28959d.m144630c(c19609h.m102616j(), true);
                bVar.m124119a().m124116d(9001, c19609h);
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$c */
    /* loaded from: classes6.dex */
    public final class C15354c extends AbstractC25591b {
        public C15354c() {
        }

        @Override // p468r0.AbstractC25591b
        /* renamed from: d */
        public void mo5829d(int i11, Bundle bundle) {
            if (i11 == 6 && TextUtils.isEmpty(WebBaseView.this.m86721DO())) {
                WebBaseView.this.m86741TN();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$d */
    /* loaded from: classes6.dex */
    public static final class C15355d extends CameraManager.AvailabilityCallback {
        C15355d() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            AbstractC19074t.m100208f(str, "cameraId");
            if (WebBaseView.this.f79411E1.get()) {
                WebBaseView.this.f79411E1.set(false);
                C8937j0.m47656d().m40937b();
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            AbstractC19074t.m100208f(str, "cameraId");
            if (!WebBaseView.this.f79411E1.get()) {
                WebBaseView.this.f79411E1.set(true);
                SensitiveExtraData sensitiveExtraData = new SensitiveExtraData();
                String m114620m = AbstractC21954k.Companion.m114620m(WebBaseView.this.m86721DO());
                if (m114620m != null) {
                    sensitiveExtraData.m35535d(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, m114620m);
                }
                String mo81390nO = WebBaseView.this.mo81390nO();
                if (mo81390nO != null) {
                    sensitiveExtraData.m35535d("app_id", mo81390nO);
                }
                C8937j0.m47656d().m40938d(new SensitiveData("web_camera", "web_view", sensitiveExtraData));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$e */
    /* loaded from: classes6.dex */
    public static final class C15356e implements C30933c0.b {
        C15356e() {
        }

        @Override // yf0.C30933c0.b
        /* renamed from: a */
        public void mo86844a(C30933c0.a aVar) {
            AbstractC19074t.m100208f(aVar, "command");
            WebBaseView.this.m86669eQ(aVar);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$f */
    /* loaded from: classes6.dex */
    public static final class C15357f extends AbstractC19075u implements InterfaceC18505l {
        C15357f() {
            super(1);
        }

        /* renamed from: a */
        public final void m86845a(C21368b c21368b) {
            WebBaseView webBaseView = WebBaseView.this;
            AbstractC19074t.m100205c(c21368b);
            webBaseView.mo81383YQ(c21368b);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m86845a((C21368b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$g */
    /* loaded from: classes6.dex */
    public static final class C15358g extends AbstractC19075u implements InterfaceC18505l {
        C15358g() {
            super(1);
        }

        /* renamed from: a */
        public final void m86846a(C21369c c21369c) {
            WebBaseView webBaseView = WebBaseView.this;
            AbstractC19074t.m100205c(c21369c);
            webBaseView.mo86759aR(c21369c);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m86846a((C21369c) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$h */
    /* loaded from: classes6.dex */
    public static final class C15359h extends AbstractC19075u implements InterfaceC18505l {
        C15359h() {
            super(1);
        }

        /* renamed from: a */
        public final void m86847a(C21367a c21367a) {
            WebBaseView.this.m86670eR();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m86847a((C21367a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$i */
    /* loaded from: classes6.dex */
    public static final class C15360i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f79462t;

        /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$i$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f79464t;

            /* renamed from: u */
            final /* synthetic */ WebBaseView f79465u;

            /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$i$a$a */
            /* loaded from: classes6.dex */
            public /* synthetic */ class C32789a implements FlowCollector, InterfaceC19066n {

                /* renamed from: p */
                final /* synthetic */ WebBaseView f79466p;

                C32789a(WebBaseView webBaseView) {
                    this.f79466p = webBaseView;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object mo12109b(AbstractC18457a abstractC18457a, Continuation continuation) {
                    Object m142578e;
                    Object m86850t = a.m86850t(this.f79466p, abstractC18457a, continuation);
                    m142578e = AbstractC28298d.m142578e();
                    if (m86850t == m142578e) {
                        return m86850t;
                    }
                    return C24848g0.f119245a;
                }

                @Override // fn0.InterfaceC19066n
                /* renamed from: c */
                public final InterfaceC24847g mo9368c() {
                    return new C19040a(2, this.f79466p, WebBaseView.class, "updateMakePaymentUi", "updateMakePaymentUi(Lcom/zing/zalo/ziap/data/ui/MakePaymentUiState;)V", 4);
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof InterfaceC19066n)) {
                        return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
                    }
                    return false;
                }

                public final int hashCode() {
                    return mo9368c().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(WebBaseView webBaseView, Continuation continuation) {
                super(2, continuation);
                this.f79465u = webBaseView;
            }

            /* renamed from: t */
            public static final /* synthetic */ Object m86850t(WebBaseView webBaseView, AbstractC18457a abstractC18457a, Continuation continuation) {
                webBaseView.m86661bR(abstractC18457a);
                return C24848g0.f119245a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f79465u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f79464t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    StateFlow m150280C0 = this.f79465u.m86816yO().m150280C0();
                    C32789a c32789a = new C32789a(this.f79465u);
                    this.f79464t = 1;
                    if (m150280C0.mo97893a(c32789a, this) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: s */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C15360i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C15360i(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f79462t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                WebBaseView webBaseView = WebBaseView.this;
                AbstractC1785o.b bVar = AbstractC1785o.b.RESUMED;
                a aVar = new a(webBaseView, null);
                this.f79462t = 1;
                if (RepeatOnLifecycleKt.m9234b(webBaseView, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C15360i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$j */
    /* loaded from: classes6.dex */
    public static final class C15361j extends AbstractC28248z6.f {
        C15361j() {
        }

        @Override // vg.AbstractC28248z6.f
        /* renamed from: a */
        public void mo40758a(Location location, int i11) {
            WebBaseView.this.mo81370KO(location);
            WebBaseView.this.m86654XQ();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$k */
    /* loaded from: classes6.dex */
    public static final class C15362k extends AbstractServiceConnectionC25594e {
        C15362k() {
        }

        @Override // p468r0.AbstractServiceConnectionC25594e
        /* renamed from: a */
        public void mo28105a(ComponentName componentName, AbstractC25592c abstractC25592c) {
            C25595f m86703uO;
            AbstractC19074t.m100208f(componentName, "name");
            AbstractC19074t.m100208f(abstractC25592c, "client");
            WebBaseView.this.f79433e1 = abstractC25592c;
            AbstractC25592c abstractC25592c2 = WebBaseView.this.f79433e1;
            if (abstractC25592c2 != null && abstractC25592c2.m132186e(0L) && (m86703uO = WebBaseView.this.m86703uO()) != null) {
                m86703uO.m132201f(Uri.parse(WebBaseView.this.f79436h1), null, null);
            }
            String str = WebBaseView.this.f79436h1;
            if (str != null) {
                WebBaseView.this.m86646VQ(str);
            }
            WebBaseView.this.f79436h1 = "";
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            AbstractC19074t.m100208f(componentName, "name");
            WebBaseView.this.f79433e1 = null;
            WebBaseView.this.f79436h1 = "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$l */
    /* loaded from: classes6.dex */
    public static final class C15363l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C15363l f79469q = new C15363l();

        C15363l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Bitmap mo12V4() {
            return BitmapFactory.decodeResource(AbstractC23136l9.m118698c0(), AbstractC16803z.ic_msg_img);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$m */
    /* loaded from: classes6.dex */
    public static final class C15364m extends AbstractC19075u implements InterfaceC18494a {
        C15364m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final View mo12V4() {
            return LayoutInflater.from(WebBaseView.this.m92648SI()).inflate(AbstractC7409c0.holo_circular_progress_bar_inside, WebBaseView.this.m86790pO());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$n */
    /* loaded from: classes6.dex */
    public static final class C15365n implements C32204z7.h {
        C15365n() {
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: a */
        public void mo64439a(String str, int i11) {
            AbstractC20110a.f98889a.m104564x("RotatableZaloView").mo104551d("Parse link error: (" + str + ", " + i11 + ")", new Object[0]);
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: b */
        public void mo64440b(String str, C18013y0 c18013y0) {
            AbstractC19074t.m100208f(str, "input");
            AbstractC19074t.m100208f(c18013y0, "data");
            AbstractC20110a.f98889a.m104564x("RotatableZaloView").mo104551d("Parse link success: (" + str + ", " + c18013y0 + ")", new Object[0]);
            WebBaseView.this.f79410D1 = str;
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: c */
        public void mo64441c(String str, String str2) {
            AbstractC19074t.m100208f(str, "urlLink");
            AbstractC19074t.m100208f(str2, "thumbPath");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$o */
    /* loaded from: classes6.dex */
    public static final class C15366o implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f79473b;

        C15366o(int i11) {
            this.f79473b = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            WebBaseView.this.mo49315c4();
            if (WebBaseView.this.m92672lJ()) {
                ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            WebBaseView.this.mo49315c4();
            if (WebBaseView.this.m92672lJ()) {
                ToastUtils.m89268p(AbstractC23136l9.m118743r0(this.f79473b));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$p */
    /* loaded from: classes6.dex */
    public static final class C15367p implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f79474p;

        C15367p(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f79474p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f79474p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f79474p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$q */
    /* loaded from: classes6.dex */
    public static final class C15368q extends AbstractC19075u implements InterfaceC18509p {
        C15368q() {
            super(2);
        }

        /* renamed from: a */
        public final void m86855a(int i11, Float f11) {
            boolean z11;
            if (i11 > WebBaseView.this.f79419M1) {
                WebBaseView.this.f79419M1 = i11;
            }
            WebBaseView webBaseView = WebBaseView.this;
            if (i11 > 0 && i11 >= webBaseView.f79419M1) {
                z11 = true;
            } else {
                z11 = false;
            }
            webBaseView.m86625OO(z11);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m86855a(((Number) obj).intValue(), (Float) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$r */
    /* loaded from: classes6.dex */
    public static final class C15369r extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C16798n f79477r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15369r(C16798n c16798n) {
            super(1);
            this.f79477r = c16798n;
        }

        /* renamed from: a */
        public final void m86856a(boolean z11) {
            if (!z11) {
                WebBaseView webBaseView = WebBaseView.this;
                webBaseView.m86770fR(webBaseView.f79437i1);
                return;
            }
            if (WebBaseView.this.m92648SI() != null) {
                Context m92648SI = WebBaseView.this.m92648SI();
                AbstractC19074t.m100205c(m92648SI);
                if (AbstractC23034c6.m118165m(m92648SI, this.f79477r.m89727a()) != 0) {
                    AbstractC23034c6.m118184v0(WebBaseView.this, new String[]{this.f79477r.m89727a()}, 12);
                    return;
                }
            }
            WebBaseView webBaseView2 = WebBaseView.this;
            webBaseView2.m86656YP(webBaseView2.f79437i1, true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m86856a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$s */
    /* loaded from: classes6.dex */
    public static final class C15370s extends AbstractC19075u implements InterfaceC18494a {
        C15370s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C30933c0 mo12V4() {
            WebBaseView webBaseView = WebBaseView.this;
            C30933c0 c30933c0 = (C30933c0) new C1802w0(webBaseView, webBaseView.m86713zO()).m9378a(C30933c0.class);
            c30933c0.m150334g2(WebBaseView.this.f79420N1);
            c30933c0.m150326c2(WebBaseView.Companion.m86837k(WebBaseView.this.m92642L3()));
            return c30933c0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$t */
    /* loaded from: classes6.dex */
    public static final class C15371t extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C15371t f79479q = new C15371t();

        C15371t() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C30957v mo12V4() {
            return C30957v.Companion.m150573a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.WebBaseView$u */
    /* loaded from: classes6.dex */
    public static final class C15372u extends AbstractC19075u implements InterfaceC18494a {
        C15372u() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final WebAppInterface mo12V4() {
            WebBaseView webBaseView = WebBaseView.this;
            return new WebAppInterface(webBaseView, webBaseView.m86816yO().m150303Q0());
        }
    }

    static {
        InterfaceC24854k m129210a;
        String name = WebBaseView.class.getName();
        AbstractC19074t.m100207e(name, "getName(...)");
        f79404P1 = name;
        m129210a = AbstractC24856m.m129210a(C15352a.f79455q);
        f79406R1 = m129210a;
    }

    public WebBaseView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        m129210a = AbstractC24856m.m129210a(C15363l.f79469q);
        this.f79439k1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C15364m());
        this.f79440l1 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C15371t.f79479q);
        this.f79447s1 = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C15370s());
        this.f79448t1 = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C15372u());
        this.f79453y1 = m129210a5;
        this.f79408B1 = new HashMap();
        this.f79410D1 = "";
        this.f79411E1 = new AtomicBoolean(false);
        this.f79415I1 = new C15355d();
        this.f79418L1 = true;
        this.f79420N1 = (int) (System.currentTimeMillis() & 2147483647L);
    }

    /* renamed from: AP */
    private final void m86583AP(String str, JsResult jsResult) {
        try {
            if (!m92672lJ()) {
                if (jsResult != null) {
                    jsResult.cancel();
                    return;
                }
                return;
            }
            new C17460a.a(m92648SI()).m92840k(AbstractC8020f0.browser_javascript_alert_title).m92834e(str).m92837h(AbstractC8020f0.f43842ok, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.n41

                /* renamed from: p */
                public final /* synthetic */ JsResult f81309p;

                public /* synthetic */ n41(JsResult jsResult2) {
                    r1 = jsResult2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    WebBaseView.m86587BP(r1, interfaceC17463d, i11);
                }
            }).m92836g(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.o41

                /* renamed from: p */
                public final /* synthetic */ JsResult f81422p;

                public /* synthetic */ o41(JsResult jsResult2) {
                    r1 = jsResult2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    WebBaseView.m86589CP(r1, interfaceC17463d);
                }
            }).m92830a().mo13822K();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: BN */
    public static final void m86585BN(WebBaseView webBaseView) {
        AbstractC19074t.m100208f(webBaseView, "this$0");
        webBaseView.m86777hQ();
    }

    /* renamed from: BO */
    private final WebAppInterface m86586BO() {
        return (WebAppInterface) this.f79453y1.getValue();
    }

    /* renamed from: BP */
    public static final void m86587BP(JsResult jsResult, InterfaceC17463d interfaceC17463d, int i11) {
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    /* renamed from: CP */
    public static final void m86589CP(JsResult jsResult, InterfaceC17463d interfaceC17463d) {
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    /* renamed from: CQ */
    private final void m86590CQ() {
        Context m92648SI = m92648SI();
        if (m92648SI == null) {
            m92648SI = CoreUtility.getAppContext();
        }
        AbstractC19074t.m100205c(m92648SI);
        C23046d7.m118240c(m92648SI).mo13822K();
    }

    /* renamed from: DP */
    private final boolean m86592DP(String str, JsResult jsResult) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!m92672lJ()) {
            if (jsResult != null) {
                jsResult.cancel();
            }
            return true;
        }
        new C17460a.a(m92648SI()).m92840k(AbstractC8020f0.browser_javascript_alert_title).m92834e(str).m92837h(AbstractC8020f0.f43842ok, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.w41

            /* renamed from: p */
            public final /* synthetic */ JsResult f82485p;

            public /* synthetic */ w41(JsResult jsResult2) {
                r1 = jsResult2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                WebBaseView.m86595EP(r1, interfaceC17463d, i11);
            }
        }).m92835f(AbstractC8020f0.cancel, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.x41

            /* renamed from: p */
            public final /* synthetic */ JsResult f82594p;

            public /* synthetic */ x41(JsResult jsResult2) {
                r1 = jsResult2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                WebBaseView.m86597FP(r1, interfaceC17463d, i11);
            }
        }).m92830a().mo13822K();
        return true;
    }

    /* renamed from: EN */
    private final void m86594EN() {
        C20196i c20196i = this.f79416J1;
        if (c20196i != null) {
            c20196i.m105321s();
        }
        this.f79416J1 = null;
    }

    /* renamed from: EP */
    public static final void m86595EP(JsResult jsResult, InterfaceC17463d interfaceC17463d, int i11) {
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    /* renamed from: FP */
    public static final void m86597FP(JsResult jsResult, InterfaceC17463d interfaceC17463d, int i11) {
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    /* renamed from: FQ */
    public static final void m86598FQ(WebBaseView webBaseView, String str, String[] strArr, ArrayList arrayList, PermissionRequest permissionRequest, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(webBaseView, "this$0");
        AbstractC19074t.m100208f(str, "$origin");
        AbstractC19074t.m100208f(strArr, "$permissions");
        AbstractC19074t.m100208f(arrayList, "$requestPermissions");
        webBaseView.m86788oQ(str, strArr, arrayList, permissionRequest);
    }

    /* renamed from: GQ */
    public static final void m86600GQ(WebBaseView webBaseView, PermissionRequest permissionRequest, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(webBaseView, "this$0");
        webBaseView.m86770fR(permissionRequest);
    }

    /* renamed from: HN */
    private final void m86602HN(C18625n c18625n) {
        WebSettings webSettings;
        WebSettings webSettings2 = null;
        if (c18625n.m98429a()) {
            ZWebView zWebView = this.f79429a1;
            if (zWebView != null) {
                webSettings = zWebView.getSettings();
            } else {
                webSettings = null;
            }
            if (webSettings != null) {
                webSettings.setMediaPlaybackRequiresUserGesture(false);
            }
        }
        if (c18625n.m98430b()) {
            ZWebView zWebView2 = this.f79429a1;
            if (zWebView2 != null) {
                webSettings2 = zWebView2.getSettings();
            }
            if (webSettings2 != null) {
                webSettings2.setCacheMode(1);
            }
        }
    }

    /* renamed from: HO */
    private final void m86603HO(String str, String str2) {
        if (this.f79433e1 != null) {
            return;
        }
        this.f79436h1 = str;
        if (TextUtils.isEmpty(this.f79435g1)) {
            String m144626a = AbstractC28958c.m144626a(m92648SI());
            this.f79435g1 = m144626a;
            if (m144626a == null) {
                m86694rP(this, str2, false, 2, null);
                this.f79436h1 = "";
                return;
            }
        }
        C15362k c15362k = new C15362k();
        this.f79434f1 = c15362k;
        if (!AbstractC25592c.m132182a(m92686rK(), this.f79435g1, c15362k) || this.f79434f1 == null) {
            this.f79434f1 = null;
            m86694rP(this, str2, false, 2, null);
            this.f79436h1 = "";
        }
    }

    /* renamed from: HP */
    public static final void m86604HP(View view, JsPromptResult jsPromptResult, InterfaceC17463d interfaceC17463d, int i11) {
        View findViewById = view.findViewById(AbstractC6918a0.JavaScriptPromptInput);
        AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.EditText");
        String obj = ((EditText) findViewById).getText().toString();
        if (jsPromptResult != null) {
            jsPromptResult.confirm(obj);
        }
    }

    /* renamed from: IN */
    private final boolean m86606IN(String str) {
        return AbstractC19074t.m100204b(this.f79408B1.get(str), Boolean.TRUE);
    }

    /* renamed from: IO */
    private final void m86607IO(String str) {
        AbstractC21954k.Companion.m114607G(new Runnable() { // from class: com.zing.zalo.ui.zviews.s41

            /* renamed from: p */
            public final /* synthetic */ String f81891p;

            /* renamed from: q */
            public final /* synthetic */ WebBaseView f81892q;

            public /* synthetic */ s41(String str2, WebBaseView this) {
                r1 = str2;
                r2 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebBaseView.m86611JO(r1, r2);
            }
        });
    }

    /* renamed from: IP */
    public static final void m86608IP(JsPromptResult jsPromptResult, InterfaceC17463d interfaceC17463d, int i11) {
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
    }

    /* renamed from: Ib */
    private final void m86609Ib() {
        if (!AbstractC23034c6.m118121G()) {
            AbstractC23034c6.m118186w0(m92692wK(), AbstractC23034c6.f112029f, 109);
        }
    }

    /* renamed from: JO */
    public static final void m86611JO(String str, WebBaseView webBaseView) {
        AbstractC19074t.m100208f(str, "$url");
        AbstractC19074t.m100208f(webBaseView, "this$0");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setAction("android.intent.action.VIEW");
            webBaseView.m92641HK(intent);
            webBaseView.m86741TN();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104551d(f79404P1, e11.toString());
        }
    }

    /* renamed from: JP */
    public static final void m86612JP(JsPromptResult jsPromptResult, InterfaceC17463d interfaceC17463d) {
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
    }

    /* renamed from: JQ */
    public static final void m86613JQ(WebBaseView webBaseView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(webBaseView, "this$0");
        if (i11 != -2) {
            if (i11 == -1) {
                try {
                    interfaceC17463d.dismiss();
                    webBaseView.f72421L0.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 14);
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            return;
        }
        interfaceC17463d.dismiss();
        webBaseView.mo81370KO(null);
    }

    /* renamed from: KP */
    private final void m86615KP(String str) {
        m92641HK(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* renamed from: KQ */
    public static final void m86616KQ(WebBaseView webBaseView, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(webBaseView, "this$0");
        webBaseView.mo81370KO(null);
    }

    /* renamed from: LO */
    public static final void m86618LO(WebBaseView webBaseView, String str, String str2) {
        AbstractC19074t.m100208f(webBaseView, "this$0");
        m86694rP(webBaseView, "javascript: " + str + " ('" + str2 + "')", false, 2, null);
    }

    /* renamed from: MN */
    private final void m86620MN(AbstractC18457a.c cVar) {
        String m97775b = cVar.m97775b();
        String m97776c = cVar.m97776c();
        EnumC21279d m97777d = cVar.m97777d();
        String m97778e = cVar.m97778e();
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("{\"tranx_id\":\"%1$s\",\"sku\":\"%2$s\"}", Arrays.copyOf(new Object[]{m97775b, m97776c}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        String m141903O0 = AbstractC28207v1.m141903O0(m97777d.m110221c(), m97777d.name(), format, "action.iap.requestpayment");
        AbstractC19074t.m100205c(m141903O0);
        m86783mP(m141903O0, m97778e);
        Companion.m86825i().m116345w("action.iap.requestpayment return with " + m141903O0, new Object[0]);
        m86816yO().m150331f0();
    }

    /* renamed from: MO */
    private final void m86621MO(int i11, String str, String str2, String str3) {
        Intent intent;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (m92648SI() == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str2 != null && str != null) {
                intent = m86674hO(str2, str);
            } else {
                intent = null;
            }
            if (intent != null) {
                m92641HK(intent);
                m86741TN();
                return;
            }
        }
        if (str3 != null && str3.length() > 0) {
            if (i11 == 1) {
                m86694rP(this, str3, false, 2, null);
            } else {
                m86607IO(str3);
            }
        }
    }

    /* renamed from: NN */
    private final void m86623NN(AbstractC18457a.d dVar) {
        String m141911Q0 = AbstractC28207v1.m141911Q0(dVar.m97780b(), dVar.m97781c(), dVar.m97782d().m110218c());
        m86791pP(null, "action.payment.result", m141911Q0);
        Companion.m86825i().m116345w("action.payment.result return with " + m141911Q0, new Object[0]);
        m86816yO().m150331f0();
    }

    /* renamed from: OO */
    public final void m86625OO(boolean z11) {
        if (this.f79417K1 == z11) {
            return;
        }
        this.f79417K1 = z11;
        m86738RO(z11, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* renamed from: OP */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m86626OP(HttpAuthHandler httpAuthHandler, String str, String str2) {
        String str3;
        String str4;
        String[] strArr;
        if (m92648SI() == null) {
            return;
        }
        if (httpAuthHandler != null && httpAuthHandler.useHttpAuthUsernamePassword()) {
            ZWebView zWebView = this.f79429a1;
            if (zWebView != null) {
                strArr = zWebView.getHttpAuthUsernamePassword(str, str2);
            } else {
                strArr = null;
            }
            if (strArr != null && strArr.length == 2) {
                str4 = strArr[0];
                str3 = strArr[1];
                if (str4 == null && str3 != null) {
                    if (httpAuthHandler != null) {
                        httpAuthHandler.proceed(str4, str3);
                        return;
                    }
                    return;
                }
                View inflate = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.http_authentication_dialog, (ViewGroup) null);
                if (str4 != null) {
                    View findViewById = inflate.findViewById(AbstractC6918a0.username_edit);
                    AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.EditText");
                    ((EditText) findViewById).setText(str4);
                }
                if (str3 != null) {
                    View findViewById2 = inflate.findViewById(AbstractC6918a0.password_edit);
                    AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.EditText");
                    ((EditText) findViewById2).setText(str3);
                }
                C17460a.a aVar = new C17460a.a(m92648SI());
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.http_authentication_dialog_dialog_title);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{str, str2}, 2));
                AbstractC19074t.m100207e(format, "format(...)");
                C17460a m92830a = aVar.m92841l(format).m92833d(R.drawable.ic_dialog_alert).m92842m(inflate).m92837h(AbstractC8020f0.f43842ok, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.y41

                    /* renamed from: p */
                    public final /* synthetic */ View f82707p;

                    /* renamed from: q */
                    public final /* synthetic */ WebBaseView f82708q;

                    /* renamed from: r */
                    public final /* synthetic */ String f82709r;

                    /* renamed from: s */
                    public final /* synthetic */ String f82710s;

                    /* renamed from: t */
                    public final /* synthetic */ HttpAuthHandler f82711t;

                    public /* synthetic */ y41(View inflate2, WebBaseView this, String str5, String str22, HttpAuthHandler httpAuthHandler2) {
                        r1 = inflate2;
                        r2 = this;
                        r3 = str5;
                        r4 = str22;
                        r5 = httpAuthHandler2;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        WebBaseView.m86629PP(r1, r2, r3, r4, r5, interfaceC17463d, i11);
                    }
                }).m92835f(AbstractC8020f0.cancel, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.z41

                    /* renamed from: p */
                    public final /* synthetic */ HttpAuthHandler f82810p;

                    public /* synthetic */ z41(HttpAuthHandler httpAuthHandler2) {
                        r1 = httpAuthHandler2;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        WebBaseView.m86632QP(r1, interfaceC17463d, i11);
                    }
                }).m92836g(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.b41

                    /* renamed from: p */
                    public final /* synthetic */ HttpAuthHandler f79881p;

                    public /* synthetic */ b41(HttpAuthHandler httpAuthHandler2) {
                        r1 = httpAuthHandler2;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                    /* renamed from: p7 */
                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                        WebBaseView.m86636RP(r1, interfaceC17463d);
                    }
                }).m92830a();
                m92830a.m92867k().m92890I(4);
                m92830a.mo13822K();
                inflate2.findViewById(AbstractC6918a0.username_edit).requestFocus();
            }
        }
        str3 = null;
        str4 = null;
        if (str4 == null) {
        }
        View inflate2 = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.http_authentication_dialog, (ViewGroup) null);
        if (str4 != null) {
        }
        if (str3 != null) {
        }
        C17460a.a aVar2 = new C17460a.a(m92648SI());
        C19067n0 c19067n02 = C19067n0.f94947a;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.http_authentication_dialog_dialog_title);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        String format2 = String.format(m118743r02, Arrays.copyOf(new Object[]{str5, str22}, 2));
        AbstractC19074t.m100207e(format2, "format(...)");
        C17460a m92830a2 = aVar2.m92841l(format2).m92833d(R.drawable.ic_dialog_alert).m92842m(inflate2).m92837h(AbstractC8020f0.f43842ok, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.y41

            /* renamed from: p */
            public final /* synthetic */ View f82707p;

            /* renamed from: q */
            public final /* synthetic */ WebBaseView f82708q;

            /* renamed from: r */
            public final /* synthetic */ String f82709r;

            /* renamed from: s */
            public final /* synthetic */ String f82710s;

            /* renamed from: t */
            public final /* synthetic */ HttpAuthHandler f82711t;

            public /* synthetic */ y41(View inflate22, WebBaseView this, String str5, String str22, HttpAuthHandler httpAuthHandler2) {
                r1 = inflate22;
                r2 = this;
                r3 = str5;
                r4 = str22;
                r5 = httpAuthHandler2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                WebBaseView.m86629PP(r1, r2, r3, r4, r5, interfaceC17463d, i11);
            }
        }).m92835f(AbstractC8020f0.cancel, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.z41

            /* renamed from: p */
            public final /* synthetic */ HttpAuthHandler f82810p;

            public /* synthetic */ z41(HttpAuthHandler httpAuthHandler2) {
                r1 = httpAuthHandler2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                WebBaseView.m86632QP(r1, interfaceC17463d, i11);
            }
        }).m92836g(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.b41

            /* renamed from: p */
            public final /* synthetic */ HttpAuthHandler f79881p;

            public /* synthetic */ b41(HttpAuthHandler httpAuthHandler2) {
                r1 = httpAuthHandler2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                WebBaseView.m86636RP(r1, interfaceC17463d);
            }
        }).m92830a();
        m92830a2.m92867k().m92890I(4);
        m92830a2.mo13822K();
        inflate22.findViewById(AbstractC6918a0.username_edit).requestFocus();
    }

    /* renamed from: PN */
    public static /* synthetic */ void m86628PN(WebBaseView webBaseView, String str, String str2, String str3, String str4, Integer num, int i11, Object obj) {
        String str5;
        String str6;
        Integer num2;
        if (obj == null) {
            if ((i11 & 2) != 0) {
                str5 = null;
            } else {
                str5 = str2;
            }
            if ((i11 & 4) != 0) {
                str3 = "action.webview.save.file";
            }
            String str7 = str3;
            if ((i11 & 8) != 0) {
                str6 = null;
            } else {
                str6 = str4;
            }
            if ((i11 & 16) != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            webBaseView.m86734ON(str, str5, str7, str6, num2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doDownloadStart");
    }

    /* renamed from: PP */
    public static final void m86629PP(View view, WebBaseView webBaseView, String str, String str2, HttpAuthHandler httpAuthHandler, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(webBaseView, "this$0");
        View findViewById = view.findViewById(AbstractC6918a0.username_edit);
        AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.EditText");
        String obj = ((EditText) findViewById).getText().toString();
        View findViewById2 = view.findViewById(AbstractC6918a0.password_edit);
        AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.EditText");
        String obj2 = ((EditText) findViewById2).getText().toString();
        ZWebView zWebView = webBaseView.f79429a1;
        if (zWebView != null) {
            zWebView.setHttpAuthUsernamePassword(str, str2, obj, obj2);
        }
        if (httpAuthHandler != null) {
            httpAuthHandler.proceed(obj, obj2);
        }
    }

    /* renamed from: PQ */
    public static final void m86630PQ(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: QP */
    public static final void m86632QP(HttpAuthHandler httpAuthHandler, InterfaceC17463d interfaceC17463d, int i11) {
        if (httpAuthHandler != null) {
            httpAuthHandler.cancel();
        }
    }

    /* renamed from: QQ */
    public static final void m86633QQ(WebBaseView webBaseView, C0880c c0880c, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(webBaseView, "this$0");
        AbstractC19074t.m100208f(c0880c, "$billingItem");
        webBaseView.m86816yO().m150292J1(c0880c, true);
    }

    /* renamed from: RN */
    private final void m86635RN(byte[] bArr) {
        ZWebView zWebView = this.f79429a1;
        if (zWebView != null) {
            zWebView.loadUrl("javascript:(function() {var parent = document.getElementsByTagName('head').item(0);var script = document.createElement('script');script.type = 'text/javascript';script.innerHTML = decodeURIComponent(Array.prototype.map.call(atob('" + Base64.encodeToString(bArr, 2) + "'), function(c) {\n        return '%' + ('00' + c.charCodeAt(0).toString(16)).slice(-2)\n    }).join(''));parent.appendChild(script)})()");
        }
    }

    /* renamed from: RP */
    public static final void m86636RP(HttpAuthHandler httpAuthHandler, InterfaceC17463d interfaceC17463d) {
        if (httpAuthHandler != null) {
            httpAuthHandler.cancel();
        }
    }

    /* renamed from: SO */
    public static /* synthetic */ void m86638SO(WebBaseView webBaseView, boolean z11, boolean z12, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z12 = false;
            }
            webBaseView.m86738RO(z11, z12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleNavigationBarConfig");
    }

    /* renamed from: SQ */
    public static /* synthetic */ void m86639SQ(WebBaseView webBaseView, String str, String str2, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                interfaceC18505l = null;
            }
            webBaseView.mo81378RQ(str, str2, interfaceC18505l);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showZinstantDialog");
    }

    /* renamed from: UN */
    public static final void m86642UN(WebBaseView webBaseView) {
        AbstractC19074t.m100208f(webBaseView, "this$0");
        C17487o0 m92662fJ = webBaseView.m92662fJ();
        if (m92662fJ != null && m92662fJ.m93018M0() == 1 && (webBaseView.m92648SI() instanceof WebViewMPActivity)) {
            webBaseView.m86739SN();
        } else {
            webBaseView.finish();
        }
    }

    /* renamed from: UP */
    private final void m86643UP(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    C3245i c3245i = new C3245i(new JSONObject(str));
                    if (this.f72421L0.m92676n2() != null) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("bol_share_in_app", true);
                        bundle.putString("contentNeedToShare", c3245i.m16461c());
                        C17487o0 m92662fJ = m92662fJ();
                        if (m92662fJ != null) {
                            m92662fJ.m93069k2(ShareView.class, bundle, 0, true);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: VP */
    private final void m86645VP(C22969a c22969a) {
        CameraInputParams m116122a = AbstractC22460a.m116122a(c22969a);
        m116122a.f41138w0 = new SensitiveData("web_camera", "web_view", null, 4, null);
        AbstractC22470k.m116167s(m92676n2(), 3, 1, m116122a);
    }

    /* renamed from: VQ */
    public final void m86646VQ(String str) {
        try {
            C25593d.a aVar = new C25593d.a(m86703uO());
            int m86750YN = m86750YN();
            if (m86750YN == Integer.MIN_VALUE) {
                m86750YN = AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.action_bar_inapp_browser);
            }
            aVar.m132194g(m86750YN).m132192e(true);
            aVar.m132193f(m92686rK(), 0, 0);
            aVar.m132190b(m92686rK(), 0, 0);
            C25593d m132189a = aVar.m132189a();
            AbstractC19074t.m100207e(m132189a, "build(...)");
            m132189a.m132187a(m92686rK(), Uri.parse(str));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: WP */
    private final void m86648WP(int i11) {
        Bundle bundle = new Bundle();
        SensitiveExtraData sensitiveExtraData = new SensitiveExtraData();
        String m114620m = AbstractC21954k.Companion.m114620m(m86721DO());
        if (m114620m != null) {
            sensitiveExtraData.m35535d(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, m114620m);
        }
        String mo81390nO = mo81390nO();
        if (mo81390nO != null) {
            sensitiveExtraData.m35535d("app_id", mo81390nO);
        }
        bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_web_view", "web_view", sensitiveExtraData));
        AbstractC23211s7.m119589v(m92676n2(), 2, i11, true, bundle);
    }

    /* renamed from: WQ */
    public static final boolean m86649WQ(InterfaceC27218a interfaceC27218a, C19609h c19609h, Bundle bundle, C18620i c18620i) {
        return Companion.m86843s(interfaceC27218a, c19609h, bundle, c18620i);
    }

    /* renamed from: XN */
    public static final String m86651XN(C18613b c18613b, Bundle bundle, String str) {
        return Companion.m86834g(c18613b, bundle, str);
    }

    /* renamed from: XO */
    public static final void m86652XO(FrameLayout frameLayout) {
        AbstractC19074t.m100208f(frameLayout, "$flWebContainer");
        AbstractC2379w.m12430d(frameLayout);
    }

    /* renamed from: XP */
    private final void m86653XP(Bundle bundle) {
        String str;
        String str2;
        ZWebView zWebView;
        WebBackForwardList copyBackForwardList;
        WebBackForwardList copyBackForwardList2;
        String str3;
        Intent intent = null;
        String str4 = null;
        if (!AbstractC19074t.m100204b(m86768eO(), C18613b.f93598q) && !AbstractC19074t.m100204b(m86768eO(), C18613b.f93603v)) {
            if (AbstractC19074t.m100204b(m86768eO(), C18613b.f93606y)) {
                if (bundle != null) {
                    str3 = bundle.getString("EXTRA_WEB_URL");
                } else {
                    str3 = null;
                }
                if (!TextUtils.isEmpty(str3)) {
                    if (str3 != null) {
                        str4 = AbstractC21954k.Companion.m114612M(str3);
                    }
                    MultiStateView multiStateView = this.f79423U0;
                    if (multiStateView != null) {
                        multiStateView.setState(MultiStateView.EnumC15914e.CONTENT);
                    }
                    if (str4 != null) {
                        m86808vP(str4);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (bundle != null) {
            str = bundle.getString("EXTRA_WEB_URL");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str != null) {
                str2 = AbstractC21954k.Companion.m114612M(str);
            } else {
                str2 = null;
            }
            if (str2 == null) {
                if (str != null) {
                    intent = m86743UQ(str);
                }
                if (intent != null) {
                    ZWebView zWebView2 = this.f79429a1;
                    if ((zWebView2 != null && (copyBackForwardList2 = zWebView2.copyBackForwardList()) != null && copyBackForwardList2.getSize() == 0) || ((zWebView = this.f79429a1) != null && (copyBackForwardList = zWebView.copyBackForwardList()) != null && copyBackForwardList.getCurrentIndex() == -1)) {
                        finish();
                    }
                    m92641HK(intent);
                    this.f79414H1 = true;
                }
            }
        }
    }

    /* renamed from: XQ */
    public final void m86654XQ() {
        C28239y6 c28239y6 = this.f79421O1;
        if (c28239y6 != null) {
            c28239y6.m142224e();
        }
        this.f79421O1 = null;
    }

    /* renamed from: YP */
    public final void m86656YP(PermissionRequest permissionRequest, boolean z11) {
        if (permissionRequest != null) {
            try {
                if (z11) {
                    permissionRequest.grant(permissionRequest.getResources());
                } else {
                    permissionRequest.deny();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        this.f79437i1 = null;
    }

    /* renamed from: ZO */
    public static final boolean m86658ZO(WebBaseView webBaseView, View view, MotionEvent motionEvent) {
        WebView.HitTestResult hitTestResult;
        AbstractC19074t.m100208f(webBaseView, "this$0");
        if (webBaseView.f79407A1) {
            ZWebView zWebView = webBaseView.f79429a1;
            if (zWebView != null) {
                hitTestResult = zWebView.getHitTestResult();
            } else {
                hitTestResult = null;
            }
            if (hitTestResult == null || hitTestResult.getType() != 0) {
                webBaseView.f79407A1 = false;
            }
        }
        return false;
    }

    /* renamed from: bR */
    public final void m86661bR(AbstractC18457a abstractC18457a) {
        m86662c3(abstractC18457a.m97774a());
        if (abstractC18457a instanceof AbstractC18457a.e) {
            AbstractC18457a.e eVar = (AbstractC18457a.e) abstractC18457a;
            m86735OQ(eVar.m97784b(), eVar.m97785c());
        } else if (abstractC18457a instanceof AbstractC18457a.c) {
            m86620MN((AbstractC18457a.c) abstractC18457a);
        } else if (abstractC18457a instanceof AbstractC18457a.d) {
            m86623NN((AbstractC18457a.d) abstractC18457a);
        }
    }

    /* renamed from: c3 */
    private final void m86662c3(boolean z11) {
        if (z11) {
            mo46829Y();
        } else {
            mo49315c4();
        }
    }

    /* renamed from: cO */
    private final void m86664cO() {
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, "204278670", null, 2, null);
        if (m141798e == null) {
            m141798e = new ContactProfile("204278670");
        }
        C18013y0 m155270k = C32204z7.Companion.m155281c().m155270k(m86721DO());
        if (m155270k != null) {
            m155270k.f91011p = "";
            AbstractC23112j7.m118515Y(m141798e, m155270k, null, "share_inapp_browser");
        } else {
            AbstractC23112j7.m118534i0(m141798e.f42434r, m86721DO(), null, null, "share_inapp_browser");
        }
    }

    /* renamed from: cQ */
    public static /* synthetic */ void m86665cQ(WebBaseView webBaseView, String str, String str2, String str3, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            webBaseView.m86762bQ(str, str2, str3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processActionList");
    }

    /* renamed from: dR */
    private final void m86667dR(String str, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            Map map = (Map) this.f79438j1.get(str);
            if (map == null) {
                map = new HashMap();
            }
            Iterator m100149a = AbstractC19044c.m100149a(strArr);
            while (m100149a.hasNext()) {
                map.put((String) m100149a.next(), Boolean.TRUE);
            }
            this.f79438j1.put(str, map);
        }
    }

    /* renamed from: eQ */
    public final void m86669eQ(C30933c0.a aVar) {
        if (aVar instanceof C30933c0.a.z) {
            m86694rP(this, ((C30933c0.a.z) aVar).m150450a(), false, 2, null);
            return;
        }
        if (aVar instanceof C30933c0.a.g) {
            m86635RN(((C30933c0.a.g) aVar).m150384a());
            return;
        }
        if (aVar instanceof C30933c0.a.y) {
            C30933c0.a.y yVar = (C30933c0.a.y) aVar;
            m86787oP(yVar.m150445a(), yVar.m150446b(), yVar.m150449e(), yVar.m150447c(), yVar.m150448d());
            return;
        }
        if (aVar instanceof C30933c0.a.d) {
            m86602HN(((C30933c0.a.d) aVar).m150375a());
            return;
        }
        if (aVar instanceof C30933c0.a.j) {
            m86607IO(((C30933c0.a.j) aVar).m150393a());
            return;
        }
        if (aVar instanceof C30933c0.a.s) {
            C30933c0.a.s sVar = (C30933c0.a.s) aVar;
            m86621MO(sVar.m150428c(), sVar.m150426a(), sVar.m150427b(), sVar.m150429d());
            return;
        }
        if (aVar instanceof C30933c0.a.i) {
            C30933c0.a.i iVar = (C30933c0.a.i) aVar;
            m86603HO(iVar.m150388a(), iVar.m150389b());
            return;
        }
        if (aVar instanceof C30933c0.a.h0) {
            m86732NP(((C30933c0.a.h0) aVar).m150387a());
            return;
        }
        if (aVar instanceof C30933c0.a.c0) {
            C30933c0.a.c0 c0Var = (C30933c0.a.c0) aVar;
            m86583AP(c0Var.m150373a(), c0Var.m150374b());
            return;
        }
        if (aVar instanceof C30933c0.a.d0) {
            C30933c0.a.d0 d0Var = (C30933c0.a.d0) aVar;
            m86592DP(d0Var.m150376a(), d0Var.m150377b());
            return;
        }
        if (aVar instanceof C30933c0.a.e0) {
            C30933c0.a.e0 e0Var = (C30933c0.a.e0) aVar;
            m86728GP(e0Var.m150382d(), e0Var.m150380b(), e0Var.m150379a(), e0Var.m150381c());
            return;
        }
        if (aVar instanceof C30933c0.a.q0) {
            C30933c0.a.q0 q0Var = (C30933c0.a.q0) aVar;
            String[] m150424c = q0Var.m150424c();
            if (m150424c != null) {
                m86691nQ(m150424c, q0Var.m150423b(), q0Var.m150422a());
                return;
            }
            return;
        }
        if (aVar instanceof C30933c0.a.a0) {
            m86711yP();
            return;
        }
        if (aVar instanceof C30933c0.a.l0) {
            C29245b c29245b = this.f79445q1;
            if (c29245b != null) {
                C30933c0.a.l0 l0Var = (C30933c0.a.l0) aVar;
                c29245b.m146014e(l0Var.m150402c(), l0Var.m150401b(), l0Var.m150400a());
                return;
            }
            return;
        }
        if (aVar instanceof C30933c0.a.b0) {
            C29245b c29245b2 = this.f79445q1;
            if (c29245b2 != null) {
                c29245b2.m146013d();
                return;
            }
            return;
        }
        if (aVar instanceof C30933c0.a.g0) {
            C30933c0.a.g0 g0Var = (C30933c0.a.g0) aVar;
            String m150386b = g0Var.m150386b();
            if (m150386b != null) {
                mo81373MP(m150386b, g0Var.m150385a());
                return;
            }
            return;
        }
        if (aVar instanceof C30933c0.a.f0) {
            String m150383a = ((C30933c0.a.f0) aVar).m150383a();
            if (m150383a != null) {
                mo49858LP(m150383a);
                return;
            }
            return;
        }
        if (aVar instanceof C30933c0.a.i0) {
            C30933c0.a.i0 i0Var = (C30933c0.a.i0) aVar;
            mo81382UO(i0Var.m150391b(), i0Var.m150390a(), i0Var.m150392c());
            return;
        }
        if (aVar instanceof C30933c0.a.j0) {
            C30933c0.a.j0 j0Var = (C30933c0.a.j0) aVar;
            m86626OP(j0Var.m150394a(), j0Var.m150395b(), j0Var.m150396c());
            return;
        }
        if (aVar instanceof C30933c0.a.k0) {
            mo81380TP();
            return;
        }
        if (aVar instanceof C30933c0.a.h) {
            m86741TN();
            return;
        }
        if (aVar instanceof C30933c0.a.t0) {
            m86643UP(((C30933c0.a.t0) aVar).m150431a());
            return;
        }
        if (aVar instanceof C30933c0.a.t) {
            m86748WO(true);
            return;
        }
        if (aVar instanceof C30933c0.a.o0) {
            m86777hQ();
            return;
        }
        if (aVar instanceof C30933c0.a.r) {
            m78968wL(((C30933c0.a.r) aVar).m150425a());
            return;
        }
        if (aVar instanceof C30933c0.a.n) {
            C30933c0.a.n nVar = (C30933c0.a.n) aVar;
            m78965tL(nVar.m150410f(), nVar.m150407c(), nVar.m150409e(), nVar.m150405a(), nVar.m150406b(), nVar.m150408d());
            return;
        }
        if (aVar instanceof C30933c0.a.m) {
            m78964sL();
            return;
        }
        if (aVar instanceof C30933c0.a.k) {
            m78961qL(((C30933c0.a.k) aVar).m150397a());
            return;
        }
        if (aVar instanceof C30933c0.a.l) {
            C30933c0.a.l lVar = (C30933c0.a.l) aVar;
            m78962rL(lVar.m150398a(), lVar.m150399b());
            return;
        }
        if (aVar instanceof C30933c0.a.q) {
            m78971xL(((C30933c0.a.q) aVar).m150421a());
            return;
        }
        if (aVar instanceof C30933c0.a.n0) {
            C30933c0.a.n0 n0Var = (C30933c0.a.n0) aVar;
            m86740SP(n0Var.m150412b(), n0Var.m150411a());
            return;
        }
        if (aVar instanceof C30933c0.a.x) {
            C30933c0.a.x xVar = (C30933c0.a.x) aVar;
            m86783mP(xVar.m150443b(), xVar.m150442a());
            return;
        }
        if (aVar instanceof C30933c0.a.u) {
            mo86818zP();
            return;
        }
        if (aVar instanceof C30933c0.a.c) {
            mo86726GN(((C30933c0.a.c) aVar).m150372a());
            return;
        }
        if (aVar instanceof C30933c0.a.m0) {
            C30933c0.a.m0 m0Var = (C30933c0.a.m0) aVar;
            mo86753ZP(m0Var.m150403a(), m0Var.m150404b());
            return;
        }
        if (aVar instanceof C30933c0.a.v) {
            m86682kP(((C30933c0.a.v) aVar).m150435a());
            return;
        }
        if (aVar instanceof C30933c0.a.w) {
            C30933c0.a.w wVar = (C30933c0.a.w) aVar;
            m86685lP(wVar.m150438a(), wVar.m150439b(), wVar.m150440c());
            return;
        }
        if (aVar instanceof C30933c0.a.p0) {
            C30933c0.a.p0 p0Var = (C30933c0.a.p0) aVar;
            m86686lQ(this, p0Var.m150418a(), p0Var.m150420c(), p0Var.m150419b(), null, 8, null);
            return;
        }
        if (aVar instanceof C30933c0.a.x0) {
            mo81385cR(((C30933c0.a.x0) aVar).m150444a());
            return;
        }
        if (aVar instanceof C30933c0.a.f) {
            mo81369KN();
            return;
        }
        if (aVar instanceof C30933c0.a.b) {
            mo86723FN(((C30933c0.a.b) aVar).m150371a());
            return;
        }
        if (aVar instanceof C30933c0.a.r0) {
            mo86795qQ();
            return;
        }
        if (aVar instanceof C30933c0.a.s0) {
            m86709xQ(((C30933c0.a.s0) aVar).m150430a());
            return;
        }
        if (aVar instanceof C30933c0.a.w0) {
            mo81372LQ(((C30933c0.a.w0) aVar).m150441a());
            return;
        }
        if (aVar instanceof C30933c0.a.v0) {
            C30933c0.a.v0 v0Var = (C30933c0.a.v0) aVar;
            mo81374MQ(v0Var.m150437b(), v0Var.m150436a());
            return;
        }
        if (aVar instanceof C30933c0.a.u0) {
            C30933c0.a.u0 u0Var = (C30933c0.a.u0) aVar;
            mo81381TQ(u0Var.m150432a(), u0Var.m150434c(), u0Var.m150433b());
            return;
        }
        if (aVar instanceof C30933c0.a.e) {
            mo81368JN(((C30933c0.a.e) aVar).m150378a());
            return;
        }
        if (aVar instanceof C30933c0.a.C33053a) {
            mo81392xN(((C30933c0.a.C33053a) aVar).m150370a());
            return;
        }
        if (aVar instanceof C30933c0.a.p) {
            C30933c0.a.p pVar = (C30933c0.a.p) aVar;
            m78967vL(pVar.m150415c(), pVar.m150416d(), pVar.m150417e(), pVar.m150413a(), pVar.m150414b());
        } else if (aVar instanceof C30933c0.a.o) {
            m78966uL();
        } else {
            AbstractC20110a.f98889a.mo104548a("Unknown command", new Object[0]);
        }
    }

    /* renamed from: eR */
    public final void m86670eR() {
        mo81389fQ();
    }

    /* renamed from: hO */
    private final Intent m86674hO(String str, String str2) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            parseUri.putExtra("backToSource", false);
            parseUri.addFlags(268435456);
            ResolveInfo m86699tO = m86699tO(parseUri, str2);
            if (m86699tO != null && m92676n2() != null) {
                ActivityInfo activityInfo = m86699tO.activityInfo;
                parseUri.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                parseUri.setData(Uri.parse(str));
                return parseUri;
            }
        } catch (URISyntaxException unused) {
        }
        return null;
    }

    /* renamed from: iQ */
    private final void m86676iQ() {
        C23744a.Companion.m124119a().m124117e(this, 73);
        m86654XQ();
    }

    /* renamed from: jO */
    private final void m86678jO() {
        Boolean bool;
        C29314i c29314i = this.f79450v1;
        if (c29314i != null) {
            c29314i.m146461f(true);
        }
        if (this.f79421O1 != null) {
            m86654XQ();
        }
        this.f79421O1 = new C28239y6();
        SensitiveExtraData sensitiveExtraData = new SensitiveExtraData();
        String m114620m = AbstractC21954k.Companion.m114620m(m86721DO());
        if (m114620m != null) {
            sensitiveExtraData.m35535d(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, m114620m);
        }
        String mo81390nO = mo81390nO();
        if (mo81390nO != null) {
            sensitiveExtraData.m35535d("app_id", mo81390nO);
        }
        C28239y6 c28239y6 = this.f79421O1;
        if (c28239y6 != null) {
            bool = Boolean.valueOf(c28239y6.m142226h(getContext(), new C15361j(), new SensitiveData("web_location", "web_view", sensitiveExtraData)));
        } else {
            bool = null;
        }
        if (!AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
            mo81370KO(null);
            m86654XQ();
        }
    }

    /* renamed from: jP */
    private final void m86679jP(C18614c c18614c) {
        C30933c0 m86816yO = m86816yO();
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C30933c0.m150263d1(m86816yO, m92689tK, c18614c, false, false, 12, null);
        m86816yO().m150352p2(c18614c);
    }

    /* renamed from: kO */
    private final Bitmap m86681kO() {
        Object value = this.f79439k1.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (Bitmap) value;
    }

    /* renamed from: kP */
    private final void m86682kP(boolean z11) {
        try {
            Window window = this.f72421L0.m92692wK().getWindow();
            if (window == null) {
                return;
            }
            if (z11) {
                window.addFlags(128);
            } else {
                window.clearFlags(128);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:            if (r7.equals("action.lfs.list") == false) goto L187;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x012c, code lost:            if (r8 != null) goto L173;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x012e, code lost:            r8 = new org.json.JSONObject();     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0133, code lost:            mo81376PO(r7, r8, r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:            if (r7.equals("action.lfs.file.remove") == false) goto L187;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0120, code lost:            if (r7.equals("action.lfs.file.save") == false) goto L187;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0129, code lost:            if (r7.equals("action.lfs.file.info") == false) goto L187;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0040. Please report as an issue. */
    /* renamed from: kQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m86683kQ(String str, JSONObject jSONObject, String str2, InterfaceC18505l interfaceC18505l) {
        if (!TextUtils.isEmpty(str)) {
            if (m86816yO().m150319Z0(str)) {
                if (AbstractC19074t.m100204b(str, "action.get.location")) {
                    C29314i c29314i = this.f79450v1;
                    if (c29314i != null && c29314i != null && c29314i.m146459d()) {
                        return;
                    }
                    this.f79450v1 = new C29314i(str2);
                    mo81366DQ(m86810wO(), null);
                    return;
                }
                mo81378RQ(str, str2, interfaceC18505l);
                return;
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -2141726715:
                        if (str.equals("action.get.location")) {
                            C29314i c29314i2 = this.f79450v1;
                            if (c29314i2 != null && c29314i2 != null && c29314i2.m146459d()) {
                                return;
                            }
                            this.f79450v1 = new C29314i(str2);
                            if (mo81387eP()) {
                                mo81366DQ(m86810wO(), null);
                                return;
                            } else {
                                m86718CN(true);
                                return;
                            }
                        }
                        break;
                    case -1674667341:
                        break;
                    case -1674381438:
                        break;
                    case -1642935676:
                        if (str.equals("action.mp.open.profile.picker")) {
                            mo81375NQ(str, str2, jSONObject);
                            return;
                        }
                        break;
                    case -1420149245:
                        if (str.equals("REQUEST_STORAGE_PERMISSION")) {
                            this.f79413G1 = new C18612a(str, jSONObject, str2);
                            m86609Ib();
                            return;
                        }
                        break;
                    case 310418310:
                        if (str.equals("action.mp.join.wifi")) {
                            m86779iP(jSONObject, str2);
                            return;
                        }
                        break;
                    case 1078199380:
                        if (str.equals("action.mp.get.number")) {
                            m86639SQ(this, str, str2, null, 4, null);
                            return;
                        }
                        break;
                    case 1360818381:
                        if (str.equals("action.request.permission.camera")) {
                            if (TextUtils.isEmpty(this.f79449u1)) {
                                this.f79449u1 = str2;
                                Context m92648SI = m92648SI();
                                if (m92648SI != null && AbstractC23034c6.m118165m(m92648SI, "android.permission.CAMERA") == 0) {
                                    String m141899N0 = AbstractC28207v1.m141899N0(1, "App had permission before", str);
                                    AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
                                    m86783mP(m141899N0, str2);
                                    this.f79449u1 = null;
                                    return;
                                }
                                AbstractC23034c6.m118184v0(this, new String[]{"android.permission.CAMERA"}, 12);
                                return;
                            }
                            String m141899N02 = AbstractC28207v1.m141899N0(-3, "Before request have to finish", str);
                            AbstractC19074t.m100207e(m141899N02, "genJsonErrorSpecific(...)");
                            m86783mP(m141899N02, str2);
                            return;
                        }
                        break;
                    case 1506984265:
                        break;
                    case 1703784998:
                        if (str.equals("action.mp.get.visitor.id")) {
                            mo81365AO(str, str2);
                            return;
                        }
                        break;
                    case 1769740814:
                        if (str.equals("UPDATE_DOWNLOAD_PROGRESS")) {
                            m86816yO().m150336i0(new C19602a("h5.event.webview.download.progress", String.valueOf(jSONObject)));
                            return;
                        }
                        break;
                    case 2027607019:
                        break;
                }
            }
            mo81377QO(str, str2, jSONObject);
        }
    }

    /* renamed from: lP */
    private final void m86685lP(C29673d c29673d, String str, JSONObject jSONObject) {
        Activity activity;
        if (m92672lJ() && str.length() != 0) {
            InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
            if (m92676n2 != null) {
                activity = m92676n2.mo35575n1();
            } else {
                activity = null;
            }
            if (activity != null) {
                if (!jSONObject.has("product_type")) {
                    jSONObject.put("product_type", "consumable");
                }
                if (!jSONObject.has("verify_url")) {
                    jSONObject.put("verify_url", C18489c.m97849k(C7962g.c.a.STORES_CREDITS_ZALO_APP_S) + "/v2/google/receipt");
                }
                Companion.m86825i().m116345w("action.iap.requestpayment data: " + jSONObject, new Object[0]);
                try {
                    c29673d.m147565a0(activity, str, C2826e.Companion.m13663a(jSONObject));
                } catch (Exception e11) {
                    Companion.m86825i().mo104552e(e11);
                }
            }
        }
    }

    /* renamed from: lQ */
    static /* synthetic */ void m86686lQ(WebBaseView webBaseView, String str, JSONObject jSONObject, String str2, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                interfaceC18505l = null;
            }
            webBaseView.m86683kQ(str, jSONObject, str2, interfaceC18505l);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestHandleOnUI");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x0052
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* renamed from: mQ */
    private final void m86688mQ() {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L55
            java.lang.String r1 = "location"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.location.LocationManager"
            fn0.AbstractC19074t.m100206d(r0, r1)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            com.zing.zalo.SensitiveExtraData r1 = new com.zing.zalo.SensitiveExtraData
            r1.<init>()
            kv.k$a r2 = p307kv.AbstractC21954k.Companion
            java.lang.String r3 = r6.m86721DO()
            java.lang.String r2 = r2.m114620m(r3)
            if (r2 == 0) goto L29
            java.lang.String r3 = "url"
            r1.m35535d(r3, r2)
        L29:
            java.lang.String r2 = r6.mo81390nO()
            if (r2 == 0) goto L34
            java.lang.String r3 = "app_id"
            r1.m35535d(r3, r2)
        L34:
            a0.d r2 = new a0.d     // Catch: com.zing.zalo.SensitiveDataException -> L52
            com.zing.zalo.SensitiveData r3 = new com.zing.zalo.SensitiveData     // Catch: com.zing.zalo.SensitiveDataException -> L52
            java.lang.String r4 = "web_location"
            java.lang.String r5 = "web_view"
            r3.<init>(r4, r5, r1)     // Catch: com.zing.zalo.SensitiveDataException -> L52
            r2.<init>(r0, r3)     // Catch: com.zing.zalo.SensitiveDataException -> L52
            java.lang.String r0 = "gps"
            boolean r0 = r2.m24c(r0)     // Catch: com.zing.zalo.SensitiveDataException -> L52
            if (r0 == 0) goto L4e
            r6.m86678jO()     // Catch: com.zing.zalo.SensitiveDataException -> L52
            goto L55
        L4e:
            r6.m86730IQ()     // Catch: com.zing.zalo.SensitiveDataException -> L52
            goto L55
        L52:
            r6.m86590CQ()
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.WebBaseView.m86688mQ():void");
    }

    /* renamed from: nP */
    public static final void m86690nP(WebBaseView webBaseView, String str, String str2) {
        AbstractC19074t.m100208f(webBaseView, "this$0");
        AbstractC19074t.m100208f(str2, "$result");
        try {
            ZWebView zWebView = webBaseView.f79429a1;
            if (zWebView != null) {
                zWebView.loadUrl("javascript: typeof " + str + " == 'function' && " + str + " ('" + str2 + "')");
            }
            AbstractC20110a.f98889a.m104564x(f79404P1).mo104548a("javascript: typeof " + str + " == 'function' && " + str + " ('" + str2 + "')", new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nQ */
    private final void m86691nQ(String[] strArr, String str, GeolocationPermissions.Callback callback) {
        if (m92648SI() != null) {
            this.f79441m1 = str;
            this.f79442n1 = callback;
            if (AbstractC23034c6.m118165m(m92686rK(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
                AbstractC23034c6.m118186w0(this.f72421L0.m92692wK(), strArr, 10);
                return;
            }
            if (m86816yO().m150353q0()) {
                if (callback != null) {
                    callback.invoke(str, true, true);
                }
                this.f79441m1 = null;
                this.f79442n1 = null;
                return;
            }
            mo81366DQ(str, callback);
        }
    }

    /* renamed from: qO */
    private final View m86692qO() {
        Object value = this.f79440l1.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    /* renamed from: rP */
    public static /* synthetic */ void m86694rP(WebBaseView webBaseView, String str, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            webBaseView.m86794qP(str, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadUrl");
    }

    /* renamed from: sN */
    public static final void m86696sN(WebBaseView webBaseView, int i11, String str) {
        AbstractC19074t.m100208f(webBaseView, "this$0");
        webBaseView.m86780jQ(i11, str);
    }

    /* renamed from: sP */
    public static final Bundle m86697sP(C19609h c19609h, String str, Bundle bundle) {
        return Companion.m86840n(c19609h, str, bundle);
    }

    /* renamed from: tO */
    private final ResolveInfo m86699tO(Intent intent, String str) {
        PackageManager packageManager;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Context m92648SI = m92648SI();
        if (m92648SI != null) {
            packageManager = m92648SI.getPackageManager();
        } else {
            packageManager = null;
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        AbstractC19074t.m100207e(queryIntentActivities, "queryIntentActivities(...)");
        if (queryIntentActivities.size() == 0) {
            return null;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && TextUtils.equals(str, activityInfo.packageName)) {
                return resolveInfo;
            }
        }
        return null;
    }

    /* renamed from: tP */
    private final C16798n m86700tP(String str) {
        if (AbstractC19074t.m100204b(str, "android.webkit.resource.AUDIO_CAPTURE")) {
            int i11 = AbstractC16803z.ic_mp_micro_permission;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_webview_permission_audio);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return new C16798n(i11, str, "android.permission.RECORD_AUDIO", m118743r0, "microphone");
        }
        if (AbstractC19074t.m100204b(str, "android.webkit.resource.VIDEO_CAPTURE")) {
            int i12 = AbstractC16803z.ic_mp_camera_permission;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_webview_permission_camera);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            return new C16798n(i12, str, "android.permission.CAMERA", m118743r02, "action.mp.use.camera");
        }
        return null;
    }

    /* renamed from: uN */
    public static final void m86702uN(WebBaseView webBaseView) {
        AbstractC19074t.m100208f(webBaseView, "this$0");
        webBaseView.m86664cO();
    }

    /* renamed from: uO */
    public final C25595f m86703uO() {
        AbstractC25592c abstractC25592c = this.f79433e1;
        if (abstractC25592c != null) {
            if (this.f79432d1 == null) {
                this.f79432d1 = abstractC25592c.m132185c(new C15354c());
            }
        } else {
            this.f79432d1 = null;
        }
        return this.f79432d1;
    }

    /* renamed from: wN */
    private final void m86706wN() {
        C23744a.Companion.m124119a().m124115b(this, 73);
    }

    /* renamed from: xP */
    public static final void m86708xP() {
        C28630a.a aVar = C28630a.Companion;
        synchronized (aVar.m143191a()) {
            try {
                if (aVar.m143191a().get()) {
                    GeolocationPermissions.getInstance().clearAll();
                    aVar.m143191a().set(false);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: xQ */
    private final void m86709xQ(MultiStateView.EnumC15914e enumC15914e) {
        MultiStateView multiStateView = this.f79423U0;
        if (multiStateView != null) {
            multiStateView.setState(enumC15914e);
        }
    }

    /* renamed from: yP */
    private final void m86711yP() {
        C8009j c8009j = this.f79443o1;
        if (c8009j != null && c8009j.m92868m()) {
            c8009j.dismiss();
        }
    }

    /* renamed from: zO */
    public final C30957v m86713zO() {
        return (C30957v) this.f79447s1.getValue();
    }

    /* renamed from: zQ */
    private final void m86714zQ() {
        if (this.f79416J1 != null) {
            return;
        }
        C20196i c20196i = new C20196i(this, false, new C15368q());
        this.f79416J1 = c20196i;
        C20196i.m105317q(c20196i, null, 1, null);
    }

    /* renamed from: AN */
    public void m86715AN() {
        View view;
        View view2;
        View view3;
        RelativeLayout relativeLayout = this.f79427Y0;
        View view4 = null;
        if (relativeLayout != null) {
            view = relativeLayout.findViewById(AbstractC6918a0.web_progress_bar);
        } else {
            view = null;
        }
        ProgressBar progressBar = (ProgressBar) view;
        this.f79424V0 = progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f79427Y0;
        if (relativeLayout2 != null) {
            view2 = relativeLayout2.findViewById(AbstractC6918a0.toolbar_container);
        } else {
            view2 = null;
        }
        AbstractC19074t.m100206d(view2, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.f79425W0 = (RelativeLayout) view2;
        RelativeLayout relativeLayout3 = this.f79427Y0;
        if (relativeLayout3 != null) {
            view3 = relativeLayout3.findViewById(AbstractC6918a0.multi_state_container);
        } else {
            view3 = null;
        }
        AbstractC19074t.m100206d(view3, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.multistate.MultiStateView");
        MultiStateView multiStateView = (MultiStateView) view3;
        this.f79423U0 = multiStateView;
        if (multiStateView != null) {
            multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
        }
        MultiStateView multiStateView2 = this.f79423U0;
        if (multiStateView2 != null) {
            multiStateView2.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.c41
                public /* synthetic */ c41() {
                }

                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    WebBaseView.m86585BN(WebBaseView.this);
                }
            });
        }
        MultiStateView multiStateView3 = this.f79423U0;
        if (multiStateView3 != null) {
            view4 = multiStateView3.getContentView();
        }
        this.f79426X0 = (FrameLayout) view4;
        RelativeLayout relativeLayout4 = this.f79427Y0;
        AbstractC19074t.m100205c(relativeLayout4);
        View findViewById = relativeLayout4.findViewById(AbstractC6918a0.header_webview_container);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        m86801sQ((RelativeLayout) findViewById);
        m86751YO();
    }

    /* renamed from: AO */
    public void mo81365AO(String str, String str2) {
    }

    /* renamed from: AQ */
    public void m86716AQ(int i11) {
        this.f79422T0 = i11;
    }

    /* renamed from: BQ */
    public boolean m86717BQ(String str) {
        boolean m127120J;
        boolean m127120J2;
        boolean m127120J3;
        boolean m127120J4;
        boolean m127120J5;
        ZWebView zWebView;
        ZWebView zWebView2;
        WebBackForwardList copyBackForwardList;
        WebBackForwardList copyBackForwardList2;
        String m127114D;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        String str2 = null;
        m127120J = AbstractC24341v.m127120J(str, "about:", false, 2, null);
        if (!m127120J) {
            m127120J2 = AbstractC24341v.m127120J(str, "javascript:", false, 2, null);
            if (!m127120J2) {
                WebView.HitTestResult m86722EO = m86722EO();
                m127120J3 = AbstractC24341v.m127120J(str, "action:search?q=", false, 2, null);
                if (m127120J3) {
                    m127114D = AbstractC24341v.m127114D(str, "action:search?q=", "", false, 4, null);
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format("https://www.google.com/search?ie=UTF-8&sourceid=navclient&gfns=1&q=%s", Arrays.copyOf(new Object[]{m127114D}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    m86694rP(this, format, false, 2, null);
                } else if (m86722EO != null && m86722EO.getType() == 4) {
                    m86615KP(str);
                } else {
                    Intent m86743UQ = m86743UQ(str);
                    if (m86743UQ == null) {
                        m127120J4 = AbstractC24341v.m127120J(str, "http://", false, 2, null);
                        if (!m127120J4) {
                            m127120J5 = AbstractC24341v.m127120J(str, "https://", false, 2, null);
                            if (m127120J5) {
                            }
                        }
                    } else {
                        if (m86816yO().m150293K0() || (((zWebView = this.f79429a1) != null && (copyBackForwardList2 = zWebView.copyBackForwardList()) != null && copyBackForwardList2.getSize() == 0) || ((zWebView2 = this.f79429a1) != null && (copyBackForwardList = zWebView2.copyBackForwardList()) != null && copyBackForwardList.getCurrentIndex() == -1))) {
                            m86741TN();
                        }
                        if (m86743UQ.getPackage() != null) {
                            String str3 = m86743UQ.getPackage();
                            Context context = getContext();
                            if (context != null) {
                                str2 = context.getPackageName();
                            }
                            if (!AbstractC19074t.m100204b(str3, str2)) {
                                m86743UQ.addFlags(268435456);
                            }
                        }
                        if (!this.f79407A1) {
                            this.f79407A1 = true;
                            Context context2 = getContext();
                            if (context2 != null) {
                                context2.startActivity(m86743UQ);
                            }
                        }
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        Object obj;
        Bundle m92642L3;
        super.mo37111CJ(bundle);
        if (m92642L3() != null && (m92642L3 = m92642L3()) != null) {
            try {
                String string = m92642L3.getString("extra_param_info", "");
                AbstractC19074t.m100205c(string);
                if (string.length() > 0) {
                    this.f79444p1 = new JSONObject(string).optInt("open_source", 0);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.l41
            @Override // java.lang.Runnable
            public final void run() {
                WebBaseView.m86708xP();
            }
        });
        Context context = getContext();
        if (context != null) {
            obj = context.getSystemService("camera");
        } else {
            obj = null;
        }
        CameraManager cameraManager = (CameraManager) obj;
        this.f79412F1 = cameraManager;
        if (cameraManager != null) {
            cameraManager.registerAvailabilityCallback(this.f79415I1, (Handler) null);
        }
    }

    /* renamed from: CN */
    public final void m86718CN(boolean z11) {
        String str;
        Context context = getContext();
        if (context == null || this.f79450v1 == null) {
            return;
        }
        if (z11) {
            if (AbstractC23034c6.m118165m(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                InterfaceC27218a m92676n2 = m92676n2();
                if (m92676n2 != null) {
                    AbstractC23034c6.m118186w0(m92676n2, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 11);
                    return;
                }
                return;
            }
            m86688mQ();
            return;
        }
        String m141899N0 = AbstractC28207v1.m141899N0(WebAppInterface.ERROR_CODE_USER_REJECTED_REQUEST, "User permission deny", "action.get.location");
        AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
        C29314i c29314i = this.f79450v1;
        if (c29314i != null) {
            str = c29314i.m146457b();
        } else {
            str = null;
        }
        m86783mP(m141899N0, str);
        this.f79450v1 = null;
    }

    /* renamed from: CO */
    public View m86719CO() {
        return this.f79429a1;
    }

    /* renamed from: DN */
    public final boolean m86720DN() {
        C21367a c21367a = (C21367a) m86816yO().m150354r0().mo9215f();
        if (c21367a != null) {
            return c21367a.m110737d();
        }
        return false;
    }

    /* renamed from: DO */
    public String m86721DO() {
        String m110739f;
        C21367a c21367a = (C21367a) m86816yO().m150354r0().mo9215f();
        if (c21367a == null || (m110739f = c21367a.m110739f()) == null) {
            return "";
        }
        return m110739f;
    }

    /* renamed from: DQ */
    public void mo81366DQ(String str, GeolocationPermissions.Callback callback) {
    }

    /* renamed from: EO */
    public WebView.HitTestResult m86722EO() {
        ZWebView zWebView = this.f79429a1;
        if (zWebView != null) {
            return zWebView.getZaloHitTestResult();
        }
        return null;
    }

    /* renamed from: EQ */
    public void mo81367EQ(String str, String[] strArr, PermissionRequest permissionRequest, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC19074t.m100208f(str, "origin");
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(arrayList, "requestPermissions");
        AbstractC19074t.m100208f(arrayList2, "permissionNames");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_webview_permissions_dialog_message);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{str, TextUtils.join(", ", arrayList2)}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        C8009j m43152a = new C8009j.a(getContext()).m43169r(AbstractC8020f0.f43842ok, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.h41

            /* renamed from: q */
            public final /* synthetic */ String f80543q;

            /* renamed from: r */
            public final /* synthetic */ String[] f80544r;

            /* renamed from: s */
            public final /* synthetic */ ArrayList f80545s;

            /* renamed from: t */
            public final /* synthetic */ PermissionRequest f80546t;

            public /* synthetic */ h41(String str2, String[] strArr2, ArrayList arrayList3, PermissionRequest permissionRequest2) {
                r2 = str2;
                r3 = strArr2;
                r4 = arrayList3;
                r5 = permissionRequest2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                WebBaseView.m86598FQ(WebBaseView.this, r2, r3, r4, r5, interfaceC17463d, i11);
            }
        }).m43164m(AbstractC8020f0.str_webview_geolocation_permission_deny, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.i41

            /* renamed from: q */
            public final /* synthetic */ PermissionRequest f80648q;

            public /* synthetic */ i41(PermissionRequest permissionRequest2) {
                r2 = permissionRequest2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                WebBaseView.m86600GQ(WebBaseView.this, r2, interfaceC17463d, i11);
            }
        }).m43162k(AbstractC1463b.m7440a(format, 0)).m43155d(false).m43152a();
        AbstractC19074t.m100207e(m43152a, "create(...)");
        if (m92674mJ() && !m92681pJ()) {
            m43152a.mo13822K();
        }
    }

    /* renamed from: FN */
    public void mo86723FN(String str) {
    }

    /* renamed from: FO */
    public final ZWebView m86724FO() {
        return this.f79429a1;
    }

    @Override // lv.InterfaceC22653a
    /* renamed from: Fs */
    public View mo86725Fs() {
        return m86692qO();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Serializable serializable;
        Boolean bool;
        C17487o0 m92662fJ;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("extra.clear_below_view")) {
            Bundle m92642L32 = m92642L3();
            if (m92642L32 != null) {
                bool = Boolean.valueOf(m92642L32.getBoolean("extra.clear_below_view", false));
            } else {
                bool = null;
            }
            if (AbstractC19074t.m100204b(bool, Boolean.TRUE) && (m92662fJ = m92662fJ()) != null) {
                m92662fJ.m92985A0(0);
            }
        }
        View inflate = layoutInflater.inflate(AbstractC7409c0.zalo_webview_view, viewGroup, false);
        AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.f79427Y0 = (RelativeLayout) inflate;
        Bundle m92642L33 = m92642L3();
        if (m92642L33 == null || (serializable = m92642L33.getSerializable("EXTRA_FEATURE_ID")) == null) {
            serializable = C18613b.f93598q;
        }
        AbstractC19074t.m100206d(serializable, "null cannot be cast to non-null type com.zing.zalo.libwebview.model.FeatureId");
        m86816yO().m150323b2((C18613b) serializable);
        m86715AN();
        return this.f79427Y0;
    }

    /* renamed from: GN */
    public void mo86726GN(String str) {
    }

    /* renamed from: GO */
    public final ZaloSystemWebView m86727GO() {
        ZWebView zWebView = this.f79429a1;
        AbstractC19074t.m100205c(zWebView);
        return zWebView;
    }

    /* renamed from: GP */
    public boolean m86728GP(String str, String str2, String str3, JsPromptResult jsPromptResult) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!m92672lJ()) {
            if (jsPromptResult != null) {
                jsPromptResult.cancel();
            }
            return true;
        }
        View inflate = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.javascript_prompt_dialog, (ViewGroup) null);
        View findViewById = inflate.findViewById(AbstractC6918a0.JavaScriptPromptMessage);
        AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str2);
        View findViewById2 = inflate.findViewById(AbstractC6918a0.JavaScriptPromptInput);
        AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.EditText");
        ((EditText) findViewById2).setText(str3);
        new C17460a.a(m92648SI()).m92840k(AbstractC8020f0.browser_javascript_alert_title).m92842m(inflate).m92837h(AbstractC8020f0.f43842ok, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.d41

            /* renamed from: p */
            public final /* synthetic */ View f80109p;

            /* renamed from: q */
            public final /* synthetic */ JsPromptResult f80110q;

            public /* synthetic */ d41(View inflate2, JsPromptResult jsPromptResult2) {
                r1 = inflate2;
                r2 = jsPromptResult2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                WebBaseView.m86604HP(r1, r2, interfaceC17463d, i11);
            }
        }).m92835f(AbstractC8020f0.cancel, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.e41

            /* renamed from: p */
            public final /* synthetic */ JsPromptResult f80207p;

            public /* synthetic */ e41(JsPromptResult jsPromptResult2) {
                r1 = jsPromptResult2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                WebBaseView.m86608IP(r1, interfaceC17463d, i11);
            }
        }).m92836g(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.f41

            /* renamed from: p */
            public final /* synthetic */ JsPromptResult f80312p;

            public /* synthetic */ f41(JsPromptResult jsPromptResult2) {
                r1 = jsPromptResult2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                WebBaseView.m86612JP(r1, interfaceC17463d);
            }
        }).m92843n();
        return true;
    }

    /* renamed from: HQ */
    public void m86729HQ(String str, String[] strArr, PermissionRequest permissionRequest) {
        AbstractC19074t.m100208f(str, "origin");
        AbstractC19074t.m100208f(strArr, "permissions");
        if (permissionRequest == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int length = strArr.length;
        int length2 = strArr.length;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 < length2) {
                String str2 = strArr[i11];
                C16798n m86700tP = m86700tP(str2);
                if (m86700tP != null) {
                    if (length == 1 && m86816yO().m150319Z0(m86700tP.m89729c())) {
                        m86686lQ(this, m86700tP.m89729c(), new JSONObject(), null, new C15369r(m86700tP), 4, null);
                        return;
                    }
                    Context context = getContext();
                    if (context == null || AbstractC23034c6.m118165m(context, m86700tP.m89727a()) != 0) {
                        z11 = false;
                    }
                    if (AbstractC19074t.m100204b(m86700tP.m89727a(), "android.permission.CAMERA") && !C8937j0.m47663l("web_camera")) {
                        Context context2 = getContext();
                        if (context2 != null) {
                            ToastUtils.showMess(context2.getString(AbstractC8020f0.str_sensitive_camera_block_title));
                        }
                        z11 = false;
                    }
                    Map map = (Map) this.f79438j1.get(str);
                    if (m86700tP.m89729c() != null && m86606IN(m86700tP.m89729c())) {
                        if (!z11) {
                            arrayList2.add(m86700tP.m89727a());
                        }
                    } else {
                        if (map != null && map.containsKey(str2)) {
                            Boolean bool = (Boolean) map.get(str2);
                            if (bool == null) {
                                if (z11) {
                                    arrayList4.add(str2);
                                } else {
                                    arrayList2.add(m86700tP.m89727a());
                                }
                            } else if (!bool.booleanValue()) {
                                arrayList3.add(str2);
                            } else if (!z11) {
                                arrayList2.add(m86700tP.m89727a());
                            }
                        } else if (z11) {
                            arrayList4.add(str2);
                        } else {
                            arrayList2.add(m86700tP.m89727a());
                        }
                        arrayList.add(m86700tP);
                    }
                }
                i11++;
            } else {
                if (arrayList3.size() > 0) {
                    m86770fR(permissionRequest);
                    return;
                }
                if (arrayList2.size() == 0 && arrayList4.size() == 0) {
                    m86656YP(permissionRequest, true);
                    this.f79437i1 = null;
                    return;
                } else if (arrayList.size() > 0) {
                    mo81367EQ(str, strArr, permissionRequest, arrayList2, arrayList);
                    return;
                } else {
                    m86788oQ(str, strArr, arrayList2, permissionRequest);
                    return;
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        CameraManager cameraManager = this.f79412F1;
        if (cameraManager != null) {
            cameraManager.unregisterAvailabilityCallback(this.f79415I1);
        }
        super.mo39024IJ();
        m86816yO().m150349o1();
        ZWebView zWebView = this.f79429a1;
        if (zWebView != null) {
            zWebView.destroy();
        }
        C8009j c8009j = this.f79443o1;
        if (c8009j != null && c8009j.m92868m()) {
            String str = this.f79441m1;
            if (str != null) {
                GeolocationPermissions.Callback callback = this.f79442n1;
                if (callback != null) {
                    callback.invoke(str, false, false);
                }
                this.f79441m1 = null;
                this.f79442n1 = null;
            }
            c8009j.dismiss();
        }
        m86676iQ();
        m86594EN();
    }

    /* renamed from: IQ */
    public void m86730IQ() {
        ConfirmDialogView confirmDialogView;
        ConfirmDialogView confirmDialogView2 = this.f79454z1;
        if (confirmDialogView2 != null && confirmDialogView2 != null && confirmDialogView2.m92674mJ() && (confirmDialogView = this.f79454z1) != null && confirmDialogView.m92687sJ()) {
            return;
        }
        try {
            ConfirmDialogView confirmDialogView3 = new ConfirmDialogView();
            this.f79454z1 = confirmDialogView3;
            confirmDialogView3.mo43041MK(false);
            confirmDialogView3.m42853aL(AbstractC8020f0.str_titleDlg2);
            confirmDialogView3.m42849WK(AbstractC8020f0.GPS_Enable_Message);
            j41 j41Var = new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.j41
                public /* synthetic */ j41() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    WebBaseView.m86613JQ(WebBaseView.this, interfaceC17463d, i11);
                }
            };
            confirmDialogView3.m42852ZK(AbstractC8020f0.str_yes, j41Var);
            confirmDialogView3.m42851YK(AbstractC8020f0.str_no, j41Var);
            confirmDialogView3.m92597OK(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.k41
                public /* synthetic */ k41() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    WebBaseView.m86616KQ(WebBaseView.this, interfaceC17463d);
                }
            });
            confirmDialogView3.m92602UK(this.f72421L0.m92649TI(), "request_location_dialog_enable_gps");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JN */
    public void mo81368JN(EnumC3143a enumC3143a) {
        AbstractC19074t.m100208f(enumC3143a, "source");
    }

    /* renamed from: KN */
    public void mo81369KN() {
    }

    /* renamed from: KO */
    public void mo81370KO(Location location) {
        String str;
        String str2;
        C29314i c29314i = this.f79450v1;
        if (c29314i != null) {
            str = c29314i.m146456a(location);
        } else {
            str = null;
        }
        C29314i c29314i2 = this.f79450v1;
        if (c29314i2 != null) {
            str2 = c29314i2.m146457b();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            AbstractC21954k.Companion.m114607G(new Runnable() { // from class: com.zing.zalo.ui.zviews.m41

                /* renamed from: q */
                public final /* synthetic */ String f81090q;

                /* renamed from: r */
                public final /* synthetic */ String f81091r;

                public /* synthetic */ m41(String str22, String str3) {
                    r2 = str22;
                    r3 = str3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WebBaseView.m86618LO(WebBaseView.this, r2, r3);
                }
            });
        }
        C29314i c29314i3 = this.f79450v1;
        if (c29314i3 != null) {
            c29314i3.m146461f(false);
        }
        this.f79450v1 = null;
    }

    /* renamed from: LN */
    public void mo81371LN() {
        C29245b c29245b = this.f79445q1;
        if (c29245b != null) {
            c29245b.m146017j(m86816yO());
        }
        m86816yO().m150320Z1(new C15356e());
        m86816yO().m150365x0().m9219j(this, new C15367p(new C15357f()));
        m86816yO().m150367y0().m9219j(this, new C15367p(new C15358g()));
        m86816yO().m150354r0().m9219j(this, new C15367p(new C15359h()));
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), null, null, new C15360i(null), 3, null);
    }

    /* renamed from: LP */
    public void mo49858LP(String str) {
        MultiStateView multiStateView;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        WebViewMPActivity.Companion.m57013b(str + " onPageFinish");
        int i11 = this.f79422T0;
        if (i11 == 0) {
            Locale locale = Locale.ROOT;
            AbstractC19074t.m100207e(locale, "ROOT");
            String lowerCase = str.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            if (!AbstractC19074t.m100204b(lowerCase, "about:blank") && (multiStateView = this.f79423U0) != null) {
                multiStateView.setState(MultiStateView.EnumC15914e.CONTENT);
            }
        } else if (i11 < 0 || i11 >= 400) {
            InterfaceC22657e.a.m117257a(m86816yO(), null, AbstractC23136l9.m118743r0(AbstractC8020f0.app_name), false, 4, null);
            MultiStateView multiStateView2 = this.f79423U0;
            if (multiStateView2 != null) {
                multiStateView2.setState(MultiStateView.EnumC15914e.ERROR);
            }
            MultiStateView multiStateView3 = this.f79423U0;
            if (multiStateView3 != null) {
                multiStateView3.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
            }
        }
        this.f79422T0 = 0;
    }

    /* renamed from: LQ */
    public void mo81372LQ(boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return !this.f79428Z0;
    }

    /* renamed from: MP */
    public void mo81373MP(String str, Bitmap bitmap) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        WebViewMPActivity.Companion.m57013b(str + " onPageStarted");
        this.f79422T0 = 0;
        MultiStateView multiStateView = this.f79423U0;
        if (multiStateView != null) {
            multiStateView.setState(MultiStateView.EnumC15914e.CONTENT);
        }
    }

    /* renamed from: MQ */
    public void mo81374MQ(int i11, C15923mx c15923mx) {
        AbstractC19074t.m100208f(c15923mx, "miniAppAwarenessData");
    }

    /* renamed from: NO */
    public final void m86731NO() {
        Integer num;
        boolean z11;
        C19149c m110746d;
        C21368b c21368b = this.f79431c1;
        if (c21368b != null && (m110746d = c21368b.m110746d()) != null) {
            num = Integer.valueOf(m110746d.m100492a());
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        m86638SO(this, z11, false, 2, null);
    }

    /* renamed from: NP */
    public void m86732NP(PermissionRequest permissionRequest) {
        PermissionRequest permissionRequest2 = this.f79437i1;
        boolean z11 = false;
        if (permissionRequest2 != null && !AbstractC19074t.m100204b(permissionRequest2, permissionRequest)) {
            m86656YP(this.f79437i1, false);
        }
        this.f79437i1 = permissionRequest;
        if (permissionRequest != null && !TextUtils.isEmpty(permissionRequest.getOrigin().toString())) {
            String[] resources = permissionRequest.getResources();
            AbstractC19074t.m100205c(resources);
            if (resources.length == 0) {
                z11 = true;
            }
            if (!z11) {
                String uri = permissionRequest.getOrigin().toString();
                AbstractC19074t.m100207e(uri, "toString(...)");
                m86729HQ(uri, resources, permissionRequest);
            }
        }
    }

    /* renamed from: NQ */
    public void mo81375NQ(String str, String str2, JSONObject jSONObject) {
        String m141899N0 = AbstractC28207v1.m141899N0(-1, str + " is only available for Mini app", str);
        AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
        m86783mP(m141899N0, str2);
    }

    @Override // p693yu.InterfaceC31085c
    /* renamed from: O9 */
    public Object mo86733O9() {
        return this;
    }

    /* renamed from: ON */
    protected void m86734ON(String str, String str2, String str3, String str4, Integer num) {
        AbstractC19074t.m100208f(str3, "action");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, str);
        if (str2 != null) {
            jSONObject.put("contentDisposition", str2);
        }
        if (str4 != null) {
            jSONObject.put("successMsg", str4);
        }
        if (num != null) {
            jSONObject.put("iDownloadForShareId", num.intValue());
        }
        m86665cQ(this, str3, jSONObject.toString(), null, 4, null);
    }

    /* renamed from: OQ */
    public final void m86735OQ(C0880c c0880c, boolean z11) {
        AbstractC19074t.m100208f(c0880c, "billingItem");
        Context m92648SI = m92648SI();
        if (m92648SI == null) {
            m92648SI = CoreUtility.getAppContext();
        }
        AbstractC19074t.m100205c(m92648SI);
        C16972e0.a m90917A = new C16972e0.a(m92648SI).m90932i(C16972e0.b.DIALOG_INFORMATION).m90917A(AbstractC8020f0.browser_javascript_alert_title);
        String m92652XI = m92652XI(AbstractC8020f0.str_iap_verify_error_title);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        C16972e0.a m90949z = m90917A.m90949z(m92652XI);
        if (z11) {
            String m92652XI2 = m92652XI(AbstractC8020f0.str_iap_verify_retry_negative_button);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m90949z.m90934k(m92652XI2, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.t41
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    WebBaseView.m86630PQ(interfaceC17463d, i11);
                }
            });
        } else {
            String m92652XI3 = m92652XI(AbstractC8020f0.str_iap_verify_retry_positive_button);
            AbstractC19074t.m100207e(m92652XI3, "getString(...)");
            m90949z.m90943t(m92652XI3, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.u41

                /* renamed from: q */
                public final /* synthetic */ C0880c f82267q;

                public /* synthetic */ u41(C0880c c0880c2) {
                    r2 = c0880c2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    WebBaseView.m86633QQ(WebBaseView.this, r2, interfaceC17463d, i11);
                }
            });
        }
        m90949z.m90923G();
    }

    @Override // lv.InterfaceC22653a
    /* renamed from: Ow */
    public boolean mo86736Ow(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        if (m92648SI() != null) {
            return m86717BQ(str);
        }
        return false;
    }

    /* renamed from: PO */
    public void mo81376PO(String str, JSONObject jSONObject, String str2) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(jSONObject, "data");
    }

    /* renamed from: QN */
    public void m86737QN(String str) {
        int nextInt = new Random().nextInt();
        this.f79451w1 = nextInt;
        m86628PN(this, str, null, null, null, Integer.valueOf(nextInt), 14, null);
    }

    /* renamed from: QO */
    public void mo81377QO(String str, String str2, JSONObject jSONObject) {
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m86816yO().onPause();
        ZWebView zWebView = this.f79429a1;
        if (zWebView != null) {
            zWebView.onPause();
        }
    }

    /* renamed from: RO */
    public void m86738RO(boolean z11, boolean z12) {
        Window window;
        if (!z12) {
            if (!z11) {
                m86714zQ();
            } else {
                m86594EN();
            }
            if (this.f79418L1 == z11) {
                return;
            } else {
                this.f79418L1 = z11;
            }
        }
        if (m92676n2() instanceof ZaloLauncherActivity) {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null && (window = m92676n2.getWindow()) != null) {
                new C16766d(null, null, null, null, null, null, Boolean.valueOf(!z11), null, 191, null).m89475f(window);
            }
            InterfaceC27218a m92676n22 = m92676n2();
            AbstractC19074t.m100206d(m92676n22, "null cannot be cast to non-null type com.zing.zalo.ui.ZaloLauncherActivity");
            ((ZaloLauncherActivity) m92676n22).m57108q7(z11);
            return;
        }
        if (m92676n2() instanceof WebViewMPActivity) {
            InterfaceC27218a m92676n23 = m92676n2();
            AbstractC19074t.m100206d(m92676n23, "null cannot be cast to non-null type com.zing.zalo.ui.WebViewMPActivity");
            ((WebViewMPActivity) m92676n23).m57009u4(z11);
        }
    }

    /* renamed from: RQ */
    public void mo81378RQ(String str, String str2, InterfaceC18505l interfaceC18505l) {
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        MultiStateView.EnumC15914e enumC15914e;
        AbstractC19074t.m100208f(bundle, "outState");
        ZWebView zWebView = this.f79429a1;
        if (zWebView != null) {
            zWebView.saveState(bundle);
        }
        m86816yO().m150287G1(bundle);
        MultiStateView multiStateView = this.f79423U0;
        if (multiStateView == null || (enumC15914e = multiStateView.getState()) == null) {
            enumC15914e = MultiStateView.EnumC15914e.LOADING;
        }
        bundle.putInt("extra_multiview_state", enumC15914e.f81257p);
        bundle.putBoolean("extra_loading_state", mo81388fP());
        bundle.putBoolean("extra_prevent_start_other_activity_state", this.f79407A1);
        super.mo37118SJ(bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: SL */
    public void mo68807SL() {
        if (this.f79451w1 != 0) {
            C16783a.m89629b().m89630a(this.f79451w1);
            this.f79451w1 = 0;
        }
    }

    /* renamed from: SN */
    public final void m86739SN() {
        boolean z11;
        Context m92648SI = m92648SI();
        AbstractC19074t.m100206d(m92648SI, "null cannot be cast to non-null type com.zing.zalo.ui.WebViewMPActivity");
        WebViewMPActivity webViewMPActivity = (WebViewMPActivity) m92648SI;
        C21368b c21368b = this.f79431c1;
        if (c21368b != null) {
            z11 = c21368b.m110747e();
        } else {
            z11 = false;
        }
        webViewMPActivity.m57011v4(z11);
    }

    /* renamed from: SP */
    public void m86740SP(SslErrorHandler sslErrorHandler, SslError sslError) {
        ZWebView zWebView;
        AbstractC19074t.m100208f(sslErrorHandler, "handler");
        AbstractC19074t.m100208f(sslError, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sslError.getUrl());
        sb2.append("\n");
        if (sslError.hasError(3)) {
            sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.browser_ssl_untrusted));
            sb2.append("\n");
        }
        if (sslError.hasError(2)) {
            sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.browser_ssl_id_mismatch));
            sb2.append("\n");
        }
        if (sslError.hasError(1)) {
            sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.browser_ssl_expired));
            sb2.append("\n");
        }
        if (sslError.hasError(0)) {
            sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.browser_ssl_not_yet_valid));
            sb2.append("\n");
        }
        sslErrorHandler.cancel();
        ZWebView zWebView2 = this.f79429a1;
        if (zWebView2 != null && zWebView2.m47843a() && (zWebView = this.f79429a1) != null) {
            zWebView.stopLoading();
        }
        String str = "SSL Error: " + sslError.getUrl() + ", code = " + sslError.getPrimaryError() + " - " + ((Object) sb2);
        AbstractC28959d.m144632e(str);
        AbstractC20110a.f98889a.mo104551d(str, new Object[0]);
        Context context = getContext();
        if (context != null) {
            SSLErrorPage sSLErrorPage = new SSLErrorPage(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, AbstractC6918a0.toolbar_container);
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "toString(...)");
            sSLErrorPage.setData(sb3);
            RelativeLayout relativeLayout = this.f79427Y0;
            if (relativeLayout != null) {
                relativeLayout.addView(sSLErrorPage, layoutParams);
            }
        }
    }

    /* renamed from: Sc */
    public void mo81379Sc(String str, String str2) {
        m86628PN(this, str, str2, null, null, null, 28, null);
    }

    /* renamed from: TN */
    public final void m86741TN() {
        AbstractC21954k.Companion.m114607G(new Runnable() { // from class: com.zing.zalo.ui.zviews.g41
            public /* synthetic */ g41() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebBaseView.m86642UN(WebBaseView.this);
            }
        });
    }

    /* renamed from: TO */
    public void m86742TO() {
        C21368b c21368b = this.f79431c1;
        if (c21368b != null && c21368b.m110750h()) {
            ZWebView zWebView = this.f79429a1;
            if (zWebView != null) {
                zWebView.reload();
                return;
            }
            return;
        }
        C30933c0 m86816yO = m86816yO();
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C30933c0.m150256U1(m86816yO, m92689tK, null, 2, null);
    }

    /* renamed from: TP */
    public void mo81380TP() {
    }

    /* renamed from: TQ */
    public void mo81381TQ(String str, JSONObject jSONObject, String str2) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(jSONObject, "options");
    }

    /* renamed from: UO */
    public void mo81382UO(int i11, String str, String str2) {
    }

    /* renamed from: UQ */
    public Intent m86743UQ(String str) {
        boolean m127120J;
        boolean m127120J2;
        ResolveInfo resolveInfo;
        String str2;
        PackageManager packageManager;
        PackageManager packageManager2;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        List<ResolveInfo> list = null;
        m127120J = AbstractC24341v.m127120J(str, "http://", false, 2, null);
        if (!m127120J) {
            m127120J2 = AbstractC24341v.m127120J(str, "https://", false, 2, null);
            if (!m127120J2) {
                try {
                    Intent parseUri = Intent.parseUri(str, 1);
                    AbstractC19074t.m100207e(parseUri, "parseUri(...)");
                    parseUri.putExtra("backToSource", false);
                    parseUri.putExtra("ZALO_INTENT_SOURCE", "");
                    parseUri.putExtra("EXTRA_SOURCE_OPEN_MA", C18620i.f93681X);
                    if (m92676n2() instanceof WebViewMPActivity) {
                        InterfaceC27218a m92676n2 = m92676n2();
                        AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type com.zing.zalo.ui.WebViewMPActivity");
                        parseUri.putExtra("EXTRA_OPEN_FROM_MA_ID", ((WebViewMPActivity) m92676n2).m57002V4());
                    }
                    Context m92648SI = m92648SI();
                    if (m92648SI != null && (packageManager2 = m92648SI.getPackageManager()) != null) {
                        resolveInfo = packageManager2.resolveActivity(parseUri, 0);
                    } else {
                        resolveInfo = null;
                    }
                    if (resolveInfo == null) {
                        Bundle extras = parseUri.getExtras();
                        if (extras != null) {
                            str2 = extras.getString("browser_fallback_url", null);
                        } else {
                            str2 = null;
                        }
                        String str3 = parseUri.getPackage();
                        if (str3 == null) {
                            return null;
                        }
                        String str4 = "market://details?id=" + str3;
                        if (str2 == null || AbstractC19074t.m100204b(str2, "")) {
                            str2 = str4;
                        }
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                        intent.addCategory("android.intent.category.BROWSABLE");
                        intent.addFlags(268435456);
                        Context context = getContext();
                        if (context != null && (packageManager = context.getPackageManager()) != null) {
                            list = packageManager.queryIntentActivities(intent, 65536);
                        }
                        List<ResolveInfo> list2 = list;
                        if (list2 != null && !list2.isEmpty()) {
                            return intent;
                        }
                        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + str3));
                        return intent;
                    }
                    if (AbstractC21954k.Companion.m114616h().matcher(str).matches() && !m86773gP(parseUri)) {
                        return null;
                    }
                    try {
                    } catch (ActivityNotFoundException e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                    if (this.f72421L0.m92676n2() == null) {
                        return null;
                    }
                    return parseUri;
                } catch (URISyntaxException e12) {
                    String message = e12.getMessage();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Bad URI ");
                    sb2.append(str);
                    sb2.append(": ");
                    sb2.append(message);
                }
            }
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            int requestedOrientation = m92676n2.getRequestedOrientation();
            super.mo37712VJ();
            m92676n2.setRequestedOrientation(requestedOrientation);
        } else {
            m92676n2 = null;
        }
        if (m92676n2 == null) {
            super.mo37712VJ();
        }
    }

    /* renamed from: VN */
    public void m86744VN(boolean z11) {
        AbstractC23136l9.m118686X0(this, z11);
    }

    /* renamed from: VO */
    public boolean m86745VO() {
        AbstractC19147a m86760bO = m86760bO();
        if (m86760bO != null) {
            return m86760bO.m100471c();
        }
        return false;
    }

    @Override // lv.InterfaceC22653a
    /* renamed from: W7 */
    public Context mo86746W7() {
        return getContext();
    }

    /* renamed from: WN */
    public void m86747WN(AbstractC19147a abstractC19147a) {
        AbstractC19074t.m100208f(abstractC19147a, "actionBarConfig");
        this.f79452x1 = abstractC19147a;
        if (m92672lJ()) {
            m86816yO().m150351p0(abstractC19147a);
        }
    }

    /* renamed from: WO */
    public void m86748WO(boolean z11) {
        try {
            FrameLayout frameLayout = this.f79426X0;
            if (frameLayout != null) {
                if (z11) {
                    frameLayout.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.v41

                        /* renamed from: p */
                        public final /* synthetic */ FrameLayout f82376p;

                        public /* synthetic */ v41(FrameLayout frameLayout2) {
                            r1 = frameLayout2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            WebBaseView.m86652XO(r1);
                        }
                    });
                } else {
                    AbstractC2379w.m12430d(frameLayout2);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // lv.InterfaceC22653a
    /* renamed from: X7 */
    public boolean mo86749X7(String[] strArr) {
        if (strArr == null || m92648SI() == null || AbstractC23034c6.m118167n(m92686rK(), strArr) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: YN */
    protected int m86750YN() {
        Integer m100473e;
        AbstractC19147a m86760bO = m86760bO();
        if (m86760bO == null || !m86760bO.m100471c() || (m100473e = m86760bO.m100473e()) == null) {
            return Integer.MIN_VALUE;
        }
        return m100473e.intValue();
    }

    /* renamed from: YO */
    public void m86751YO() {
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        ZWebView zWebView = new ZWebView(context);
        this.f79429a1 = zWebView;
        FrameLayout frameLayout = this.f79426X0;
        if (frameLayout != null) {
            frameLayout.addView(zWebView, new ViewGroup.LayoutParams(-1, -1));
        }
        ZWebView zWebView2 = this.f79429a1;
        if (zWebView2 != null) {
            zWebView2.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.r41
                public /* synthetic */ r41() {
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m86658ZO;
                    m86658ZO = WebBaseView.m86658ZO(WebBaseView.this, view, motionEvent);
                    return m86658ZO;
                }
            });
        }
    }

    /* renamed from: YQ */
    public void mo81383YQ(C21368b c21368b) {
        AbstractC19074t.m100208f(c21368b, "jumpViewState");
        this.f79431c1 = c21368b;
        this.f79428Z0 = c21368b.m110749g();
        int m110745c = c21368b.m110745c();
        if (m110745c != 1) {
            if (m110745c != 2) {
                if (m110745c != 3) {
                    m83788pM(RotatableZaloView.EnumC14966b.Default);
                } else {
                    m83788pM(RotatableZaloView.EnumC14966b.Landscape);
                }
            } else {
                m83788pM(RotatableZaloView.EnumC14966b.Portrait);
            }
        } else {
            m83788pM(RotatableZaloView.EnumC14966b.Auto);
        }
        m86754ZQ(m86768eO());
        m86731NO();
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        WebViewClient webViewClient;
        C26697c m137251r;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        try {
            ZWebView zWebView = this.f79429a1;
            AbstractC19074t.m100205c(zWebView);
            C29245b c29245b = new C29245b(zWebView, this);
            this.f79445q1 = c29245b;
            C30939f0.a aVar = C30939f0.Companion;
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C26699e m150478d = aVar.m150478d(m92689tK);
            if (m150478d != null && (m137251r = m150478d.m137251r()) != null) {
                webViewClient = m137251r.f126524x;
            } else {
                webViewClient = null;
            }
            c29245b.m146018k(webViewClient);
            mo81371LN();
            ZWebView zWebView2 = this.f79429a1;
            AbstractC19074t.m100205c(zWebView2);
            zWebView2.addJavascriptInterface(m86586BO(), "ZaloJavaScriptInterface");
            boolean z11 = false;
            if (bundle == null) {
                m86653XP(m92642L3());
            } else {
                m86816yO().m150285F1(bundle);
                MultiStateView.EnumC15914e m87374c = MultiStateView.EnumC15914e.m87374c(bundle.getInt("extra_multiview_state", 0));
                AbstractC19074t.m100207e(m87374c, "getState(...)");
                m86709xQ(m87374c);
                if (bundle.containsKey("extra_loading_state") && !bundle.getBoolean("extra_loading_state")) {
                    mo81369KN();
                }
                this.f79407A1 = bundle.getBoolean("extra_prevent_start_other_activity_state", false);
                ZWebView zWebView3 = this.f79429a1;
                AbstractC19074t.m100205c(zWebView3);
                zWebView3.restoreState(bundle);
            }
            if (!this.f79414H1) {
                C30933c0 m86816yO = m86816yO();
                Context m92689tK2 = m92689tK();
                AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                Bundle m92642L3 = m92642L3();
                if (bundle != null) {
                    z11 = true;
                }
                m86816yO.m150339k1(m92689tK2, m92642L3, z11);
            }
            m86706wN();
            WebView.setWebContentsDebuggingEnabled(AbstractC32236a.m155476b());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ZN */
    public int m86752ZN() {
        return AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_height);
    }

    /* renamed from: ZP */
    public void mo86753ZP(boolean z11, long j11) {
    }

    /* renamed from: ZQ */
    public void m86754ZQ(C18613b c18613b) {
        AbstractC19074t.m100208f(c18613b, "featureId");
    }

    @Override // p693yu.InterfaceC31085c
    /* renamed from: a3 */
    public Context mo86755a3() {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        return m92689tK;
    }

    /* renamed from: aO */
    public int m86756aO() {
        AbstractC19147a m86760bO = m86760bO();
        if (m86760bO != null) {
            return m86760bO.m100477i();
        }
        return 0;
    }

    /* renamed from: aP */
    public boolean m86757aP() {
        return !m86761bP();
    }

    /* renamed from: aQ */
    public void m86758aQ() {
        if (TextUtils.equals(this.f79410D1, m86721DO())) {
            return;
        }
        C32204z7.Companion.m155281c().m155277x(m86721DO(), true, false, 1, new C15365n());
    }

    /* renamed from: aR */
    public void mo86759aR(C21369c c21369c) {
        MultiStateView multiStateView;
        AbstractC19074t.m100208f(c21369c, "loadingViewState");
        this.f79422T0 = c21369c.m110761c();
        if (c21369c.m110763e() && (multiStateView = this.f79423U0) != null) {
            multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: bK */
    public void mo39045bK(boolean z11) {
        super.mo39045bK(z11);
        if (!(m92676n2() instanceof WebViewMPActivity)) {
            C29245b c29245b = this.f79445q1;
            if (c29245b != null) {
                c29245b.m146016g(z11);
            }
            if (z11) {
                m86731NO();
            }
        }
    }

    /* renamed from: bO */
    public AbstractC19147a m86760bO() {
        AbstractC19147a abstractC19147a = this.f79452x1;
        if (abstractC19147a == null) {
            C21368b c21368b = this.f79431c1;
            if (c21368b != null) {
                return c21368b.m110743a();
            }
            return null;
        }
        return abstractC19147a;
    }

    /* renamed from: bP */
    public final boolean m86761bP() {
        AbstractC19147a m86760bO = m86760bO();
        if (m86760bO != null && m86760bO.m100471c()) {
            return !AbstractC21954k.Companion.m114624s(m86760bO.m100473e());
        }
        return false;
    }

    /* renamed from: bQ */
    public final void m86762bQ(String str, String str2, String str3) {
        if (str != null) {
            WebAppInterface m86586BO = m86586BO();
            if (str3 == null) {
                str3 = "";
            }
            WebAppInterface.processJavaScriptCall$default(m86586BO, str, str2, str3, null, 8, null);
        }
    }

    @Override // p693yu.InterfaceC31085c
    /* renamed from: cB */
    public boolean mo86763cB() {
        return m92687sJ();
    }

    /* renamed from: cP */
    public boolean m86764cP() {
        return false;
    }

    /* renamed from: cR */
    public void mo81385cR(C19609h c19609h) {
    }

    public final boolean canGoBack() {
        C21367a c21367a = (C21367a) m86816yO().m150354r0().mo9215f();
        if (c21367a != null) {
            return c21367a.m110736c();
        }
        return false;
    }

    /* renamed from: dO */
    public final int m86765dO() {
        return this.f79444p1;
    }

    /* renamed from: dP */
    public boolean m86766dP() {
        AbstractC19147a m86760bO = m86760bO();
        if (m86760bO == null || m86760bO.m100477i() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: dQ */
    public void m86767dQ(String str, String str2, String str3) {
        m86762bQ(str, str2, str3);
    }

    /* renamed from: eO */
    public final C18613b m86768eO() {
        return m86816yO().m150361v0();
    }

    /* renamed from: eP */
    public boolean mo81387eP() {
        return false;
    }

    /* renamed from: fO */
    public final C8009j m86769fO() {
        return this.f79443o1;
    }

    /* renamed from: fP */
    public boolean mo81388fP() {
        return false;
    }

    /* renamed from: fQ */
    protected boolean mo81389fQ() {
        return false;
    }

    /* renamed from: fR */
    public final void m86770fR(PermissionRequest permissionRequest) {
        m86656YP(permissionRequest, false);
        this.f79437i1 = null;
    }

    @Override // lv.InterfaceC22653a
    /* renamed from: g8 */
    public Bitmap mo86771g8() {
        return m86681kO();
    }

    /* renamed from: gO */
    public final RelativeLayout m86772gO() {
        RelativeLayout relativeLayout = this.f79409C1;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        AbstractC19074t.m100223u("headerView");
        return null;
    }

    /* renamed from: gP */
    public boolean m86773gP(Intent intent) {
        PackageManager packageManager;
        if (intent == null) {
            return false;
        }
        Context m92648SI = m92648SI();
        if (m92648SI != null) {
            packageManager = m92648SI.getPackageManager();
        } else {
            packageManager = null;
        }
        if (packageManager == null) {
            return false;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        AbstractC19074t.m100207e(queryIntentActivities, "queryIntentActivities(...)");
        if (queryIntentActivities.size() == 0) {
            return false;
        }
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = it.next().filter;
            if (intentFilter != null && (intentFilter.countDataAuthorities() != 0 || intentFilter.countDataPaths() != 0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: gQ */
    public final void m86774gQ() {
        C19159m m100498t;
        AbstractC19147a m86760bO = m86760bO();
        if ((m86760bO instanceof C19156j) && (m100498t = ((C19156j) m86760bO).m100498t()) != null) {
            String m100505d = m100498t.m100505d();
            if (m100505d != null && m100505d.length() != 0) {
                if (m100498t.m100504c() == 1) {
                    m86679jP(new C18614c(m100505d));
                    return;
                } else {
                    m86794qP(m100505d, true);
                    return;
                }
            }
            String m86721DO = m86721DO();
            if (m86721DO.length() > 0) {
                m86794qP(m86721DO, true);
            }
        }
    }

    /* renamed from: gR */
    public final void m86775gR() {
        m86816yO().m150347n1();
    }

    @Override // lv.InterfaceC22653a
    public int getRequestedOrientation() {
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            return m92676n2.getRequestedOrientation();
        }
        return -1;
    }

    public String getTrackingKey() {
        return "";
    }

    @Override // lv.InterfaceC22653a
    public Window getWindow() {
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            return m92676n2.getWindow();
        }
        return null;
    }

    /* renamed from: hP */
    public final boolean m86776hP() {
        C21367a c21367a;
        if ((!AbstractC19074t.m100204b(m86768eO(), C18613b.f93598q) && !AbstractC19074t.m100204b(m86768eO(), C18613b.f93603v)) || ((c21367a = (C21367a) m86816yO().m150354r0().mo9215f()) != null && !c21367a.m110740g())) {
            return false;
        }
        return true;
    }

    /* renamed from: hQ */
    public void m86777hQ() {
        ZWebView zWebView = this.f79429a1;
        if (zWebView != null && zWebView.m47843a()) {
            ZWebView zWebView2 = this.f79429a1;
            if (zWebView2 != null) {
                zWebView2.stopLoading();
                return;
            }
            return;
        }
        try {
            MultiStateView multiStateView = this.f79423U0;
            if (multiStateView != null) {
                multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
            }
            if (!C23055e5.m118273h(false, 1, null)) {
                MultiStateView multiStateView2 = this.f79423U0;
                if (multiStateView2 != null) {
                    multiStateView2.setState(MultiStateView.EnumC15914e.ERROR);
                    return;
                }
                return;
            }
            m86716AQ(0);
            m86742TO();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: iO */
    public final C21368b m86778iO() {
        return this.f79431c1;
    }

    /* renamed from: iP */
    public void m86779iP(JSONObject jSONObject, String str) {
    }

    /* renamed from: jQ */
    protected void m86780jQ(int i11, String str) {
        try {
            int i12 = AbstractC8020f0.str_link_report_success;
            mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15366o(i12));
            c0766k.mo1787ya("", "10", "", m86721DO(), i11, str);
        } catch (Exception e11) {
            e11.printStackTrace();
            mo49315c4();
        }
    }

    /* renamed from: lO */
    public final MultiStateView m86781lO() {
        return this.f79423U0;
    }

    /* renamed from: mO */
    public final String m86782mO() {
        return this.f79430b1;
    }

    /* renamed from: mP */
    public void m86783mP(String str, String str2) {
        AbstractC19074t.m100208f(str, "result");
        this.f77082S0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.a41

            /* renamed from: q */
            public final /* synthetic */ String f79773q;

            /* renamed from: r */
            public final /* synthetic */ String f79774r;

            public /* synthetic */ a41(String str22, String str3) {
                r2 = str22;
                r3 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebBaseView.m86690nP(WebBaseView.this, r2, r3);
            }
        });
    }

    /* renamed from: nO */
    public String mo81390nO() {
        return null;
    }

    @Override // lv.InterfaceC22653a
    /* renamed from: oI */
    public void mo86784oI(WebView webView, ValueCallback valueCallback, int i11) {
        ValueCallback valueCallback2 = this.f79446r1;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        this.f79446r1 = valueCallback;
        if ((i11 & 1) != 0) {
            m86648WP(25);
            return;
        }
        if ((i11 & 2) != 0) {
            m86648WP(26);
        } else if ((i11 & 4) != 0) {
            m86645VP(new C22969a(1));
        } else if ((i11 & 8) != 0) {
            m86645VP(new C22969a(0));
        }
    }

    /* renamed from: oN */
    public void m86785oN() {
        String m86721DO = m86721DO();
        if (!TextUtils.isEmpty(m86721DO)) {
            AbstractC16795m.m89712a(m92648SI(), m86721DO, AbstractC23136l9.m118743r0(AbstractC8020f0.browser_url_copy_toast_message));
        }
    }

    /* renamed from: oO */
    public final ProgressBar m86786oO() {
        return this.f79424V0;
    }

    /* renamed from: oP */
    public final synchronized void m86787oP(String str, String str2, String str3, String str4, String str5) {
        AbstractC19074t.m100208f(str, "baseUrl");
        AbstractC19074t.m100208f(str2, "data");
        AbstractC19074t.m100208f(str3, "mimeType");
        AbstractC19074t.m100208f(str4, "encoding");
        AbstractC19074t.m100208f(str5, "historyUrl");
        ZWebView zWebView = this.f79429a1;
        if (zWebView != null) {
            zWebView.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    /* renamed from: oQ */
    public final void m86788oQ(String str, String[] strArr, ArrayList arrayList, PermissionRequest permissionRequest) {
        AbstractC19074t.m100208f(str, "origin");
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(arrayList, "requestPermissions");
        if (arrayList.contains("android.permission.CAMERA") && !C8937j0.m47663l("web_camera")) {
            m86656YP(permissionRequest, false);
            this.f79437i1 = null;
        }
        if (arrayList.size() > 0) {
            Object m92676n2 = m92676n2();
            if (m92676n2 != null && (m92676n2 instanceof Activity)) {
                AbstractC1324b.m6640w((Activity) m92676n2, (String[]) arrayList.toArray(new String[0]), 137);
                return;
            }
            return;
        }
        m86656YP(permissionRequest, true);
        m86667dR(str, strArr);
        this.f79437i1 = null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        Object obj;
        try {
            super.onActivityResult(i11, i12, intent);
            Integer num = null;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 14) {
                        if (i11 != 15) {
                            C29245b c29245b = this.f79445q1;
                            if (c29245b != null) {
                                c29245b.m146012c(i11, i12, intent);
                                return;
                            }
                            return;
                        }
                        if (intent != null) {
                            num = Integer.valueOf(intent.getIntExtra("MA_AWARENESS_TYPE", 2));
                        }
                        if (num != null && num.intValue() == 1) {
                            m86741TN();
                            return;
                        }
                        return;
                    }
                    Context context = getContext();
                    if (context != null) {
                        obj = context.getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                    } else {
                        obj = null;
                    }
                    LocationManager locationManager = (LocationManager) obj;
                    if (locationManager == null) {
                        mo81370KO(null);
                        return;
                    }
                    try {
                        if (new C0015d(locationManager, new SensitiveData("web_location", "web_view", null, 4, null)).m24c("gps")) {
                            m86678jO();
                        } else {
                            mo81370KO(null);
                        }
                        return;
                    } catch (SensitiveDataException unused) {
                        mo81370KO(null);
                        return;
                    }
                }
                if (i12 == -1) {
                    if (intent != null) {
                        String stringExtra = intent.getStringExtra("extra_result_output_path");
                        ValueCallback valueCallback = this.f79446r1;
                        if (valueCallback != null) {
                            if (stringExtra != null && stringExtra.length() != 0) {
                                Uri fromFile = Uri.fromFile(new File(stringExtra));
                                AbstractC19074t.m100207e(fromFile, "fromFile(...)");
                                valueCallback.onReceiveValue(new Uri[]{fromFile});
                            }
                            valueCallback.onReceiveValue(null);
                        }
                    }
                } else {
                    ValueCallback valueCallback2 = this.f79446r1;
                    if (valueCallback2 != null) {
                        valueCallback2.onReceiveValue(null);
                    }
                }
                this.f79446r1 = null;
                return;
            }
            if (i12 == -1) {
                List m71478a = GalleryPickerView.Companion.m71478a(intent);
                if (!m71478a.isEmpty()) {
                    MediaItem mediaItem = (MediaItem) m71478a.get(0);
                    String str = "";
                    if (!TextUtils.isEmpty(mediaItem.m41113N()) && new C20556f(mediaItem.m41113N()).m106830b()) {
                        str = mediaItem.m41113N();
                    } else if (!TextUtils.isEmpty(mediaItem.mo41081Q()) && new C20556f(mediaItem.mo41081Q()).m106830b()) {
                        str = mediaItem.mo41081Q();
                    }
                    ValueCallback valueCallback3 = this.f79446r1;
                    if (valueCallback3 != null) {
                        if (AbstractC23254w8.m119859g(str)) {
                            Uri parse = Uri.parse(str);
                            AbstractC19074t.m100207e(parse, "parse(this)");
                            valueCallback3.onReceiveValue(new Uri[]{parse});
                        } else {
                            Uri fromFile2 = Uri.fromFile(new File(str));
                            AbstractC19074t.m100207e(fromFile2, "fromFile(...)");
                            valueCallback3.onReceiveValue(new Uri[]{fromFile2});
                        }
                    }
                }
            } else {
                ValueCallback valueCallback4 = this.f79446r1;
                if (valueCallback4 != null) {
                    valueCallback4.onReceiveValue(null);
                }
            }
            this.f79446r1 = null;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            if (i11 != 84) {
                return false;
            }
            return true;
        }
        try {
            return m86811wP();
        } catch (Exception e11) {
            e11.printStackTrace();
            return super.onKeyUp(i11, keyEvent);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0020. Please report as an issue. */
    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        boolean m131390w;
        boolean m131390w2;
        boolean m131388u;
        String str;
        String m114626u;
        String str2;
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        int i12 = 0;
        String str3 = null;
        if (i11 == 109) {
            m131390w = AbstractC25358n.m131390w(strArr, "android.permission.READ_EXTERNAL_STORAGE");
            if (m131390w) {
                m131390w2 = AbstractC25358n.m131390w(strArr, "android.permission.WRITE_EXTERNAL_STORAGE");
                if (m131390w2) {
                    m131388u = AbstractC25358n.m131388u(iArr, -1);
                    if (!m131388u) {
                        C18612a c18612a = this.f79413G1;
                        if (c18612a != null) {
                            JSONObject m98347b = c18612a.m98347b();
                            if (m98347b != null) {
                                str = m98347b.optString("action");
                            } else {
                                str = null;
                            }
                            m86762bQ(str, String.valueOf(c18612a.m98347b()), c18612a.m98346a());
                        }
                        String m141899N0 = AbstractC28207v1.m141899N0(0, "User accepted", "action.save.file");
                        AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
                        C18612a c18612a2 = this.f79413G1;
                        if (c18612a2 != null) {
                            str3 = c18612a2.m98346a();
                        }
                        m86783mP(m141899N0, str3);
                        return;
                    }
                }
            }
            mo59032jx(AbstractC8020f0.str_msg_download2Evernote_fail);
            String m141899N02 = AbstractC28207v1.m141899N0(-1, "User denied", "action.save.file");
            AbstractC19074t.m100207e(m141899N02, "genJsonErrorSpecific(...)");
            C18612a c18612a3 = this.f79413G1;
            if (c18612a3 != null) {
                str3 = c18612a3.m98346a();
            }
            m86783mP(m141899N02, str3);
            return;
        }
        if (i11 != 137) {
            switch (i11) {
                case 10:
                    while (i12 < strArr.length) {
                        String str4 = strArr[i12];
                        int i13 = iArr[i12];
                        if (AbstractC19074t.m100204b(str4, "android.permission.ACCESS_FINE_LOCATION")) {
                            if (i13 == 0) {
                                if (m86816yO().m150353q0()) {
                                    GeolocationPermissions.Callback callback = this.f79442n1;
                                    if (callback != null) {
                                        callback.invoke(this.f79441m1, true, true);
                                    }
                                    this.f79441m1 = null;
                                    this.f79442n1 = null;
                                } else {
                                    mo81366DQ(this.f79441m1, this.f79442n1);
                                }
                            } else {
                                this.f79441m1 = null;
                                this.f79442n1 = null;
                            }
                        }
                        i12++;
                    }
                    return;
                case 11:
                    while (i12 < strArr.length) {
                        if (AbstractC19074t.m100204b(strArr[i12], "android.permission.ACCESS_FINE_LOCATION")) {
                            if (iArr[i12] == 0) {
                                m86688mQ();
                            } else {
                                String m141899N03 = AbstractC28207v1.m141899N0(WebAppInterface.ERROR_CODE_USER_REJECTED_REQUEST, "User permission deny", "action.get.location");
                                AbstractC19074t.m100207e(m141899N03, "genJsonErrorSpecific(...)");
                                C29314i c29314i = this.f79450v1;
                                if (c29314i != null) {
                                    str2 = c29314i.m146457b();
                                } else {
                                    str2 = null;
                                }
                                m86783mP(m141899N03, str2);
                                this.f79450v1 = null;
                            }
                        }
                        i12++;
                    }
                    return;
                case 12:
                    for (int i14 = 0; i14 < strArr.length; i14++) {
                        if (AbstractC19074t.m100204b(strArr[i14], "android.permission.CAMERA")) {
                            if (iArr[i14] == 0) {
                                String m141899N04 = AbstractC28207v1.m141899N0(0, "User accepted", "action.request.permission.camera");
                                AbstractC19074t.m100207e(m141899N04, "genJsonErrorSpecific(...)");
                                m86783mP(m141899N04, this.f79449u1);
                                m86656YP(this.f79437i1, true);
                            } else {
                                String m141899N05 = AbstractC28207v1.m141899N0(-2, "User denied", "action.request.permission.camera");
                                AbstractC19074t.m100207e(m141899N05, "genJsonErrorSpecific(...)");
                                m86783mP(m141899N05, this.f79449u1);
                                m86770fR(this.f79437i1);
                            }
                        }
                    }
                    this.f79449u1 = null;
                    return;
                default:
                    return;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < strArr.length; i15++) {
            if (iArr[i15] != 0 && (m114626u = AbstractC21954k.Companion.m114626u(strArr[i15])) != null) {
                arrayList.add(m114626u);
            }
        }
        if (this.f79437i1 != null) {
            if (arrayList.size() > 0) {
                m86656YP(this.f79437i1, false);
            } else {
                m86656YP(this.f79437i1, true);
                PermissionRequest permissionRequest = this.f79437i1;
                if (permissionRequest != null && permissionRequest.getOrigin() != null) {
                    String uri = permissionRequest.getOrigin().toString();
                    AbstractC19074t.m100207e(uri, "toString(...)");
                    m86667dR(uri, permissionRequest.getResources());
                }
            }
        }
        this.f79437i1 = null;
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        ZWebView zWebView = this.f79429a1;
        if (zWebView != null) {
            zWebView.onResume();
        }
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(18);
        }
        m86816yO().onResume();
        m86731NO();
    }

    /* renamed from: ow */
    public void mo81391ow(String str, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(str, "maSchemesFilePath");
        AbstractC19074t.m100208f(interfaceC18509p, "callback");
    }

    /* renamed from: pN */
    public void m86789pN() {
        String m86721DO = m86721DO();
        if (!TextUtils.isEmpty(m86721DO)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(m86721DO));
                m92641HK(intent);
            } catch (Exception e11) {
                AbstractC23350e.m122775e(f79404P1, "web_view_browser_abs_menu_more_open_with_browser", e11);
            }
        }
    }

    /* renamed from: pO */
    public final RelativeLayout m86790pO() {
        return this.f79427Y0;
    }

    /* renamed from: pP */
    public void m86791pP(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str2, "action");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("loadNative2JSCall: action: ");
        sb2.append(str2);
        sb2.append(", data: ");
        sb2.append(str3);
        C19067n0 c19067n0 = C19067n0.f94947a;
        Object[] objArr = new Object[3];
        if (TextUtils.isEmpty(str)) {
            str = "null";
        }
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = str3;
        String format = String.format("javascript:zaloNative2JS.nativeCall('%s','%s','%s')", Arrays.copyOf(objArr, 3));
        AbstractC19074t.m100207e(format, "format(...)");
        m86694rP(this, format, false, 2, null);
    }

    /* renamed from: pQ */
    public void m86792pQ(boolean z11) {
        if (m86815yN()) {
            AbstractC23136l9.m118686X0(this, z11);
        }
    }

    /* renamed from: qN */
    public void m86793qN() {
        Bundle bundle = new Bundle();
        bundle.putString("extra_share_original_link", m86721DO());
        bundle.putBoolean("fromShareVia", true);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(UpdateStatusView.class, bundle, 1, true);
        }
    }

    /* renamed from: qP */
    public final synchronized void m86794qP(String str, boolean z11) {
        try {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            if (getContext() == null) {
                return;
            }
            if (z11) {
                m86816yO().m150332f2(z11);
            }
            ZWebView zWebView = this.f79429a1;
            if (zWebView != null) {
                zWebView.loadUrl(str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: qQ */
    public void mo86795qQ() {
    }

    /* renamed from: rN */
    public void m86796rN() {
        KeyEventCallbackC17462c m118464q = AbstractC23093i.m118464q(m92648SI(), new C2913t1.b() { // from class: com.zing.zalo.ui.zviews.q41
            public /* synthetic */ q41() {
            }

            @Override // bn.C2913t1.b
            /* renamed from: a */
            public final void mo13056a(int i11, String str) {
                WebBaseView.m86696sN(WebBaseView.this, i11, str);
            }
        }, AbstractC23136l9.m118743r0(AbstractC8020f0.str_link_report), AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), AbstractC23136l9.m118743r0(AbstractC8020f0.str_no));
        if (m118464q != null) {
            m118464q.mo13822K();
        }
    }

    /* renamed from: rO */
    public final C29314i m86797rO() {
        return this.f79450v1;
    }

    /* renamed from: rQ */
    public final void m86798rQ(C8009j c8009j) {
        this.f79443o1 = c8009j;
    }

    /* renamed from: ra */
    public final void m86799ra() {
        ZWebView zWebView = this.f79429a1;
        if (zWebView != null) {
            zWebView.goBack();
        }
    }

    /* renamed from: sO */
    public final int m86800sO() {
        return this.f79422T0;
    }

    /* renamed from: sQ */
    public final void m86801sQ(RelativeLayout relativeLayout) {
        AbstractC19074t.m100208f(relativeLayout, "<set-?>");
        this.f79409C1 = relativeLayout;
    }

    @Override // lv.InterfaceC22653a
    public void setRequestedOrientation(int i11) {
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.setRequestedOrientation(i11);
        }
    }

    /* renamed from: tN */
    public void m86802tN() {
        if (TextUtils.equals(this.f79410D1, m86721DO())) {
            m86664cO();
        } else {
            AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.zviews.p41
                public /* synthetic */ p41() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WebBaseView.m86702uN(WebBaseView.this);
                }
            }, 1000L);
        }
    }

    /* renamed from: tQ */
    public final void m86803tQ(GeolocationPermissions.Callback callback) {
        this.f79442n1 = callback;
    }

    /* renamed from: uP */
    public void m86804uP() {
        m86748WO(true);
        try {
            ZWebView zWebView = this.f79429a1;
            if (zWebView != null) {
                zWebView.goForward();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f79404P1, e11);
        }
    }

    /* renamed from: uQ */
    public final void m86805uQ(String str) {
        this.f79441m1 = str;
    }

    /* renamed from: vN */
    public void m86806vN() {
        AbstractC23152n3.m119017Q0(m92676n2(), new C26405g(C32204z7.Companion.m155281c().m155270k(m86721DO()), true), m86721DO(), m86810wO(), true, false, "webview_menu");
    }

    /* renamed from: vO */
    public final int m86807vO() {
        return this.f79420N1;
    }

    /* renamed from: vP */
    public final void m86808vP(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        try {
            if (!TextUtils.isEmpty(str)) {
                m86748WO(true);
                m86694rP(this, str, false, 2, null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vQ */
    public final void m86809vQ(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f79430b1 = str;
    }

    /* renamed from: wO */
    public final String m86810wO() {
        String m110738e;
        C21367a c21367a = (C21367a) m86816yO().m150354r0().mo9215f();
        if (c21367a == null || (m110738e = c21367a.m110738e()) == null) {
            return "";
        }
        return m110738e;
    }

    /* renamed from: wP */
    public final boolean m86811wP() {
        ProgressDialogView progressDialogView = this.f72826A0;
        if (progressDialogView != null && progressDialogView.m92687sJ()) {
            mo49315c4();
            return true;
        }
        return mo81393zN();
    }

    /* renamed from: wQ */
    public final void m86812wQ(C29314i c29314i) {
        this.f79450v1 = c29314i;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 73) {
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.connection.state.ConnectionState");
            EnumC30982b enumC30982b = (EnumC30982b) obj;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("state", enumC30982b.toString());
                C21369c c21369c = (C21369c) m86816yO().m150367y0().mo9215f();
                if (c21369c != null && !c21369c.m110763e()) {
                    C30933c0 m86816yO = m86816yO();
                    String jSONObject2 = jSONObject.toString();
                    AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                    m86816yO.m150337j0(jSONObject2);
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: xN */
    public void mo81392xN(EnumC3144b enumC3144b) {
        AbstractC19074t.m100208f(enumC3144b, "startupEvent");
    }

    /* renamed from: xO */
    public final RelativeLayout m86813xO() {
        return this.f79425W0;
    }

    @Override // p693yu.InterfaceC31085c
    /* renamed from: xr */
    public InterfaceC27218a mo86814xr() {
        return m92676n2();
    }

    /* renamed from: yN */
    public boolean m86815yN() {
        if (m86756aO() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: yO */
    public final C30933c0 m86816yO() {
        return (C30933c0) this.f79448t1.getValue();
    }

    /* renamed from: yQ */
    public final void m86817yQ(String str) {
        AbstractC19074t.m100208f(str, "title");
        C21367a c21367a = (C21367a) m86816yO().m150354r0().mo9215f();
        if (c21367a != null) {
            c21367a.m110741h(str);
        }
    }

    /* renamed from: zN */
    public boolean mo81393zN() {
        if (canGoBack()) {
            m86799ra();
            return true;
        }
        return false;
    }

    /* renamed from: zP */
    public void mo86818zP() {
    }
}
