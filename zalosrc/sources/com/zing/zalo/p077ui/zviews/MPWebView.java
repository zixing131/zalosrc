package com.zing.zalo.p077ui.zviews;

import ac.C0697c0;
import ac.C0732w;
import ae.C0762g;
import ae.C0766k;
import am.AbstractC0924m0;
import am.C0903c0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1595r0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1764d0;
import au.AbstractC2379w;
import bv.EnumC3143a;
import bv.EnumC3144b;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.WebAppInterface;
import com.zing.zalo.p077ui.WebViewMPActivity;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.mini.program.actionbar.MPNormalActionBar;
import com.zing.zalo.p077ui.widget.mini.program.actionbar.MPTransparentActionBar;
import com.zing.zalo.p077ui.widget.mini.program.actionbar.MiniProgramActionBar;
import com.zing.zalo.p077ui.zviews.MiniAppAwarenessPopup;
import com.zing.zalo.p077ui.zviews.MiniAppBottomMenu;
import com.zing.zalo.p077ui.zviews.MiniAppZinstantDialog;
import com.zing.zalo.p077ui.zviews.MiniAppZinstantView;
import com.zing.zalo.p077ui.zviews.MiniProgramDialog;
import com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBottomPermissionView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.webview.C16786d;
import com.zing.zalo.webview.C16789g;
import com.zing.zalo.webview.C16790h;
import com.zing.zalo.webview.C16798n;
import com.zing.zalo.webview.ZWebView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.AbstractC17452c;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import jn0.AbstractC21317c;
import kf0.C21703a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import li.AbstractC22490a;
import me0.AbstractC23020b3;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006a0.C0012a;
import p140ev.C18617f;
import p140ev.C18620i;
import p170fv.AbstractC19147a;
import p170fv.C19158l;
import p189gv.C19602a;
import p189gv.C19609h;
import p278jv.C21368b;
import p307kv.AbstractC21954k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p542ub.InterfaceC27218a;
import p693yu.C31083a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import rf0.C25768b;
import th0.C26697c;
import th0.C26699e;
import vg.AbstractC28207v1;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import x30.C29314i;
import yf0.C30930b;
import yf0.C30933c0;
import yf0.C30939f0;
import yf0.C30946k;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public final class MPWebView extends WebBaseView implements View.OnClickListener, C23744a.c, ZaloView.InterfaceC17421f {
    public static final C14535a Companion = new C14535a(null);

    /* renamed from: S1 */
    private int f74824S1 = 5;

    /* renamed from: T1 */
    private MiniProgramActionBar f74825T1;

    /* renamed from: U1 */
    private MPLoadingView f74826U1;

    /* renamed from: V1 */
    private MPLoadingViewFull f74827V1;

    /* renamed from: W1 */
    private C19609h f74828W1;

    /* renamed from: X1 */
    private boolean f74829X1;

    /* renamed from: Y1 */
    private boolean f74830Y1;

    /* renamed from: Z1 */
    private boolean f74831Z1;

    /* renamed from: a2 */
    private boolean f74832a2;

    /* renamed from: b2 */
    private Long f74833b2;

    /* renamed from: c2 */
    private final InterfaceC24854k f74834c2;

    /* renamed from: d2 */
    private boolean f74835d2;

    /* renamed from: e2 */
    private InterfaceC1764d0 f74836e2;

    /* renamed from: f2 */
    private final InterfaceC24854k f74837f2;

    /* renamed from: g2 */
    private final C14554t f74838g2;

    /* renamed from: h2 */
    private CoroutineScope f74839h2;

    /* renamed from: i2 */
    private C23528a f74840i2;

    /* renamed from: j2 */
    private String f74841j2;

    /* renamed from: k2 */
    private C19158l f74842k2;

    /* renamed from: l2 */
    private boolean f74843l2;

    /* renamed from: m2 */
    private final InterfaceC24854k f74844m2;

    /* renamed from: n2 */
    private String f74845n2;

    /* renamed from: o2 */
    private Map f74846o2;

    /* renamed from: p2 */
    private String f74847p2;

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$a */
    /* loaded from: classes6.dex */
    public static final class C14535a {
        private C14535a() {
        }

        public /* synthetic */ C14535a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$b */
    /* loaded from: classes6.dex */
    public static final class C14536b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ RecyclingImageView f74848l1;

        /* renamed from: m1 */
        final /* synthetic */ MPWebView f74849m1;

        /* renamed from: com.zing.zalo.ui.zviews.MPWebView$b$a */
        /* loaded from: classes6.dex */
        public static final class a implements View.OnLayoutChangeListener {

            /* renamed from: p */
            final /* synthetic */ C3979l f74850p;

            /* renamed from: q */
            final /* synthetic */ RecyclingImageView f74851q;

            /* renamed from: r */
            final /* synthetic */ InterfaceC3968a f74852r;

            /* renamed from: s */
            final /* synthetic */ MPWebView f74853s;

            /* renamed from: t */
            final /* synthetic */ RecyclingImageView f74854t;

            public a(C3979l c3979l, RecyclingImageView recyclingImageView, InterfaceC3968a interfaceC3968a, MPWebView mPWebView, RecyclingImageView recyclingImageView2) {
                this.f74850p = c3979l;
                this.f74851q = recyclingImageView;
                this.f74852r = interfaceC3968a;
                this.f74853s = mPWebView;
                this.f74854t = recyclingImageView2;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                int i19;
                int i21;
                Bitmap m18839c;
                Bitmap m18839c2;
                AbstractC19074t.m100208f(view, "view");
                view.removeOnLayoutChangeListener(this);
                C3979l c3979l = this.f74850p;
                if (c3979l != null && (m18839c2 = c3979l.m18839c()) != null) {
                    i19 = m18839c2.getWidth();
                } else {
                    i19 = 0;
                }
                C3979l c3979l2 = this.f74850p;
                if (c3979l2 != null && (m18839c = c3979l2.m18839c()) != null) {
                    i21 = m18839c.getHeight();
                } else {
                    i21 = 0;
                }
                if (i19 != 0 && i21 != 0) {
                    this.f74851q.setScaleType(ImageView.ScaleType.MATRIX);
                    RecyclingImageView recyclingImageView = this.f74851q;
                    Matrix matrix = new Matrix();
                    float width = this.f74853s.m86772gO().getWidth() / i19;
                    matrix.setScale(width, width);
                    matrix.postTranslate(0.0f, this.f74853s.m86772gO().getHeight() - (i21 * width));
                    recyclingImageView.setImageMatrix(matrix);
                    InterfaceC3968a interfaceC3968a = this.f74852r;
                    if (interfaceC3968a != null) {
                        interfaceC3968a.setImageInfo(this.f74850p, true);
                    }
                    MiniProgramActionBar miniProgramActionBar = this.f74853s.f74825T1;
                    AbstractC19074t.m100206d(miniProgramActionBar, "null cannot be cast to non-null type com.zing.zalo.ui.widget.mini.program.actionbar.MPNormalActionBar");
                    ((MPNormalActionBar) miniProgramActionBar).setBackgroundResource(0);
                    return;
                }
                this.f74853s.m86772gO().removeView(this.f74854t);
            }
        }

        C14536b(RecyclingImageView recyclingImageView, MPWebView mPWebView) {
            this.f74848l1 = recyclingImageView;
            this.f74849m1 = mPWebView;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            int i11;
            int i12;
            Bitmap m18839c;
            Bitmap m18839c2;
            try {
                RecyclingImageView recyclingImageView = this.f74848l1;
                MPWebView mPWebView = this.f74849m1;
                if (AbstractC1579n0.m7865e0(recyclingImageView) && !recyclingImageView.isLayoutRequested()) {
                    if (c3979l != null && (m18839c2 = c3979l.m18839c()) != null) {
                        i11 = m18839c2.getWidth();
                    } else {
                        i11 = 0;
                    }
                    if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                        i12 = m18839c.getHeight();
                    } else {
                        i12 = 0;
                    }
                    if (i11 != 0 && i12 != 0) {
                        recyclingImageView.setScaleType(ImageView.ScaleType.MATRIX);
                        Matrix matrix = new Matrix();
                        float width = mPWebView.m86772gO().getWidth() / i11;
                        matrix.setScale(width, width);
                        matrix.postTranslate(0.0f, mPWebView.m86772gO().getHeight() - (i12 * width));
                        recyclingImageView.setImageMatrix(matrix);
                        if (interfaceC3968a != null) {
                            interfaceC3968a.setImageInfo(c3979l, true);
                        }
                        MiniProgramActionBar miniProgramActionBar = mPWebView.f74825T1;
                        AbstractC19074t.m100206d(miniProgramActionBar, "null cannot be cast to non-null type com.zing.zalo.ui.widget.mini.program.actionbar.MPNormalActionBar");
                        ((MPNormalActionBar) miniProgramActionBar).setBackgroundResource(0);
                        return;
                    }
                    mPWebView.m86772gO().removeView(recyclingImageView);
                    return;
                }
                recyclingImageView.addOnLayoutChangeListener(new a(c3979l, recyclingImageView, interfaceC3968a, mPWebView, recyclingImageView));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$c */
    /* loaded from: classes6.dex */
    public static final class C14537c implements C31083a.b {
        C14537c() {
        }

        @Override // p693yu.C31083a.b
        /* renamed from: a */
        public void mo81394a() {
            MPLoadingView mPLoadingView = MPWebView.this.f74826U1;
            AbstractC19074t.m100206d(mPLoadingView, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.MPLoadingViewFull");
            ((MPLoadingViewFull) mPLoadingView).m81292i();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$d */
    /* loaded from: classes6.dex */
    public static final class C14538d implements C31083a.b {
        C14538d() {
        }

        @Override // p693yu.C31083a.b
        /* renamed from: a */
        public void mo81394a() {
            MPLoadingView mPLoadingView = MPWebView.this.f74826U1;
            AbstractC19074t.m100206d(mPLoadingView, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.MPLoadingViewFull");
            ((MPLoadingViewFull) mPLoadingView).m81291h();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$e */
    /* loaded from: classes6.dex */
    public static final class C14539e extends AnimatorListenerAdapter {
        C14539e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            C17487o0 m92662fJ = MPWebView.this.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93000F1(MPWebView.this.f74826U1);
            }
            MPLoadingView mPLoadingView = MPWebView.this.f74826U1;
            if (mPLoadingView != null) {
                mPLoadingView.setAlpha(1.0f);
            }
            if (!(MPWebView.this.f74826U1 instanceof MPLoadingViewFull)) {
                return;
            }
            MPWebView.this.m86816yO().m150305R1("EVENT_CLIENT_OPEN_LOADING_VIEW");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$f */
    /* loaded from: classes6.dex */
    static final class C14540f extends AbstractC19075u implements InterfaceC18505l {
        C14540f() {
            super(1);
        }

        /* renamed from: a */
        public final void m81395a(C19158l c19158l) {
            MPWebView.this.f74842k2 = c19158l;
            MPWebView.this.m81312RR();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m81395a((C19158l) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$g */
    /* loaded from: classes6.dex */
    public static final class C14541g implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f74860b;

        /* renamed from: c */
        final /* synthetic */ String f74861c;

        C14541g(String str, String str2) {
            this.f74860b = str;
            this.f74861c = str2;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            MPWebView mPWebView = MPWebView.this;
            String m141899N0 = AbstractC28207v1.m141899N0(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, "Internal Server Error", this.f74860b);
            AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
            mPWebView.m86783mP(m141899N0, this.f74861c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.getInt("error_code") == 0) {
                    MPWebView.this.m86783mP(AbstractC21954k.Companion.m114618j(this.f74860b, new JSONObject(jSONObject.getString("data"))), this.f74861c);
                }
            } catch (Exception unused) {
                MPWebView mPWebView = MPWebView.this;
                String m141899N0 = AbstractC28207v1.m141899N0(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, "Internal Server Error", this.f74860b);
                AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
                mPWebView.m86783mP(m141899N0, this.f74861c);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$h */
    /* loaded from: classes6.dex */
    public static final class C14542h implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f74863b;

        /* renamed from: c */
        final /* synthetic */ String f74864c;

        C14542h(String str, String str2) {
            this.f74863b = str;
            this.f74864c = str2;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC20110a.f98889a.mo104548a("handleDynamicApiOnServer: " + c20096c, new Object[0]);
            C30933c0.m150273m0(MPWebView.this.m86816yO(), WebAppInterface.ERROR_CODE_PARSED_DATA_FAILED, String.valueOf(c20096c), this.f74863b, null, this.f74864c, 8, null);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            String str;
            String m127114D;
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                C30933c0.m150273m0(MPWebView.this.m86816yO(), WebAppInterface.ERROR_CODE_PARSED_DATA_FAILED, "Server sent a non-json data format", this.f74863b, null, this.f74864c, 8, null);
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                str = optJSONObject.optString("payload");
            } else {
                str = null;
            }
            if (str == null) {
                C30933c0.m150273m0(MPWebView.this.m86816yO(), WebAppInterface.ERROR_CODE_PARSED_DATA_FAILED, "Payload is null!", this.f74863b, null, this.f74864c, 8, null);
                return;
            }
            if (AbstractC19074t.m100204b(this.f74863b, "action.mp.add.myfavorites")) {
                MPWebView.this.f74845n2 = null;
                MPWebView.this.m86816yO().m150317Y0().mo9221n(Boolean.TRUE);
            }
            C30933c0 m86816yO = MPWebView.this.m86816yO();
            String str2 = this.f74863b;
            m127114D = AbstractC24341v.m127114D(str, "\"", "\\\"", false, 4, null);
            C30933c0.m150273m0(m86816yO, 0, null, str2, m127114D, this.f74864c, 3, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$i */
    /* loaded from: classes6.dex */
    static final class C14543i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.zviews.MPWebView$i$a */
        /* loaded from: classes6.dex */
        public static final class a implements C25768b.b {

            /* renamed from: a */
            final /* synthetic */ MPWebView f74866a;

            /* renamed from: com.zing.zalo.ui.zviews.MPWebView$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            static final class C32787a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ MPWebView f74867q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32787a(MPWebView mPWebView) {
                    super(0);
                    this.f74867q = mPWebView;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m81410a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m81410a() {
                    MPWebView.m81344pS(this.f74867q, null, 1, null);
                }
            }

            /* renamed from: com.zing.zalo.ui.zviews.MPWebView$i$a$b */
            /* loaded from: classes6.dex */
            static final class b extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ MPWebView f74868q;

                /* renamed from: r */
                final /* synthetic */ ContactProfile f74869r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(MPWebView mPWebView, ContactProfile contactProfile) {
                    super(0);
                    this.f74868q = mPWebView;
                    this.f74869r = contactProfile;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m81411a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m81411a() {
                    List m131496e;
                    MPWebView mPWebView = this.f74868q;
                    m131496e = AbstractC25366r.m131496e(this.f74869r.mo2478b());
                    mPWebView.m81342oS(new ArrayList(m131496e));
                }
            }

            a(MPWebView mPWebView) {
                this.f74866a = mPWebView;
            }

            @Override // rf0.C25768b.b
            /* renamed from: a */
            public void mo81397a() {
                this.f74866a.m81330iS();
            }

            @Override // rf0.C25768b.b
            /* renamed from: b */
            public void mo81398b() {
                this.f74866a.m81338mS();
            }

            @Override // rf0.C25768b.b
            /* renamed from: c */
            public void mo81399c(ContactProfile contactProfile) {
                AbstractC19074t.m100208f(contactProfile, "profile");
                MiniAppPopupView.m81730mM(this.f74866a.m81322cS(), false, false, new b(this.f74866a, contactProfile), 3, null);
            }

            @Override // rf0.C25768b.b
            /* renamed from: d */
            public void mo81400d() {
                this.f74866a.m81306LR();
            }

            @Override // rf0.C25768b.b
            /* renamed from: e */
            public float mo81401e() {
                if (this.f74866a.m86781lO() != null) {
                    return r0.getHeight();
                }
                return 0.0f;
            }

            @Override // rf0.C25768b.b
            /* renamed from: f */
            public boolean mo81402f() {
                Boolean bool = (Boolean) this.f74866a.m86816yO().m150317Y0().mo9215f();
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            }

            @Override // rf0.C25768b.b
            /* renamed from: g */
            public void mo81403g() {
                this.f74866a.m86816yO().m150311W();
            }

            @Override // rf0.C25768b.b
            /* renamed from: g0 */
            public void mo81404g0(String str) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                this.f74866a.m86737QN(str);
            }

            @Override // rf0.C25768b.b
            /* renamed from: h */
            public void mo81405h() {
                this.f74866a.m81336lS();
            }

            @Override // rf0.C25768b.b
            /* renamed from: i */
            public void mo81406i() {
                MiniAppPopupView.m81730mM(this.f74866a.m81322cS(), false, false, new C32787a(this.f74866a), 3, null);
            }

            @Override // rf0.C25768b.b
            /* renamed from: j */
            public void mo81407j() {
                this.f74866a.m81314TR();
            }

            @Override // rf0.C25768b.b
            /* renamed from: k */
            public void mo81408k(String str) {
                this.f74866a.m81316VR(str);
            }

            @Override // rf0.C25768b.b
            public void onDismiss() {
                this.f74866a.f74829X1 = false;
                this.f74866a.m86816yO().m150317Y0().mo9222o(this.f74866a.m81384ZR());
            }

            @Override // rf0.C25768b.b
            /* renamed from: r3 */
            public void mo81409r3(String str) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                WebBaseView.m86628PN(this.f74866a, str, null, "action.save.image.gallery", AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_qr_saved), null, 18, null);
            }
        }

        C14543i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a mo12V4() {
            return new a(MPWebView.this);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$j */
    /* loaded from: classes6.dex */
    static final class C14544j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.zviews.MPWebView$j$a */
        /* loaded from: classes6.dex */
        public static final class a implements MiniAppBottomMenu.InterfaceC14584c {

            /* renamed from: a */
            final /* synthetic */ MPWebView f74871a;

            a(MPWebView mPWebView) {
                this.f74871a = mPWebView;
            }

            @Override // com.zing.zalo.p077ui.zviews.MiniAppBottomMenu.InterfaceC14584c
            /* renamed from: a */
            public void mo81413a() {
                this.f74871a.f74835d2 = true;
                C1761c0 m150317Y0 = this.f74871a.m86816yO().m150317Y0();
                MPWebView mPWebView = this.f74871a;
                m150317Y0.m9219j(mPWebView, mPWebView.m81384ZR());
            }
        }

        C14544j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiniAppBottomMenu mo12V4() {
            MiniAppBottomMenu miniAppBottomMenu = new MiniAppBottomMenu();
            miniAppBottomMenu.m81679IM(new a(MPWebView.this));
            Context context = MPWebView.this.getContext();
            AbstractC19074t.m100205c(context);
            MPWebView mPWebView = MPWebView.this;
            miniAppBottomMenu.m81680JM(context, mPWebView, mPWebView.m81321bS());
            Bundle m78535kL = BottomPickerView.m78535kL();
            m78535kL.putSerializable("EXTRA_MINI_PROGRAM_INFO", MPWebView.this.f74828W1);
            miniAppBottomMenu.mo60305zK(m78535kL);
            return miniAppBottomMenu;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$k */
    /* loaded from: classes6.dex */
    static final class C14545k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C14545k f74872q = new C14545k();

        C14545k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C16789g mo12V4() {
            return new C16789g();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$l */
    /* loaded from: classes6.dex */
    public static final class C14546l implements InterfaceC20094a {
        C14546l() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC20110a.f98889a.mo104551d(String.valueOf(c20096c), new Object[0]);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject == null) {
                    MPWebView mPWebView = MPWebView.this;
                    String m141899N0 = AbstractC28207v1.m141899N0(-101, "Client cannot encrypt uid", "action.mp.open.profile.picker");
                    AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
                    mPWebView.m86783mP(m141899N0, MPWebView.this.f74841j2);
                    return;
                }
                JSONObject jSONObject = optJSONObject.getJSONObject("mapRs");
                Iterator<String> keys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                while (keys.hasNext()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", String.valueOf(jSONObject.getLong(keys.next())));
                    arrayList.add(jSONObject2);
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("error_code", 0);
                jSONObject3.put("error_message", "successful");
                jSONObject3.put("data", new JSONArray((Collection) arrayList));
                jSONObject3.put("action", "action.mp.open.profile.picker");
                MPWebView mPWebView2 = MPWebView.this;
                String jSONObject4 = jSONObject3.toString();
                AbstractC19074t.m100207e(jSONObject4, "toString(...)");
                mPWebView2.m86783mP(jSONObject4, MPWebView.this.f74841j2);
                MPWebView.this.f74841j2 = null;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104551d(e11.toString(), new Object[0]);
                MPWebView mPWebView3 = MPWebView.this;
                String m141899N02 = AbstractC28207v1.m141899N0(-1, e11.toString(), "action.mp.open.profile.picker");
                AbstractC19074t.m100207e(m141899N02, "genJsonErrorSpecific(...)");
                mPWebView3.m86783mP(m141899N02, MPWebView.this.f74841j2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$m */
    /* loaded from: classes6.dex */
    public static final class C14547m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f74874t;

        C14547m(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C14547m(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f74874t == 0) {
                AbstractC24862s.m129228b(obj);
                C17487o0 m92662fJ = MPWebView.this.m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93069k2(MiniAppZinstantView.class, MiniAppZinstantView.C14618a.m81798b(MiniAppZinstantView.Companion, 1, MPWebView.this.f74828W1, null, 4, null), 0, true);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C14547m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$n */
    /* loaded from: classes6.dex */
    public static final class C14548n extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f74876t;

        C14548n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C14548n(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f74876t == 0) {
                AbstractC24862s.m129228b(obj);
                C17487o0 m92662fJ = MPWebView.this.m92662fJ();
                if (m92662fJ != null) {
                    MiniAppZinstantView.C14618a c14618a = MiniAppZinstantView.Companion;
                    C19609h c19609h = MPWebView.this.f74828W1;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_permission);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    m92662fJ.m93069k2(MiniAppZinstantView.class, c14618a.m81799a(2, c19609h, m118743r0), 0, true);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C14548n) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$o */
    /* loaded from: classes6.dex */
    public static final class C14549o extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f74878t;

        C14549o(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C14549o(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f74878t == 0) {
                AbstractC24862s.m129228b(obj);
                Bundle bundle = new Bundle();
                bundle.putSerializable("MINI_APP_INFO", MPWebView.this.f74828W1);
                C17487o0 m92662fJ = MPWebView.this.m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93069k2(MiniAppQRNewView.class, bundle, 0, true);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C14549o) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$p */
    /* loaded from: classes6.dex */
    static final class C14550p implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f74880p;

        C14550p(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f74880p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f74880p;
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
            this.f74880p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$q */
    /* loaded from: classes6.dex */
    static final class C14551q extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ GeolocationPermissions.Callback f74881q;

        /* renamed from: r */
        final /* synthetic */ String f74882r;

        /* renamed from: s */
        final /* synthetic */ MPWebView f74883s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14551q(GeolocationPermissions.Callback callback, String str, MPWebView mPWebView) {
            super(1);
            this.f74881q = callback;
            this.f74882r = str;
            this.f74883s = mPWebView;
        }

        /* renamed from: a */
        public final void m81418a(boolean z11) {
            if (z11) {
                GeolocationPermissions.Callback callback = this.f74881q;
                if (callback != null) {
                    callback.invoke(this.f74882r, true, false);
                }
                if (this.f74883s.m86797rO() != null) {
                    this.f74883s.m86718CN(true);
                    return;
                }
                return;
            }
            GeolocationPermissions.Callback callback2 = this.f74881q;
            if (callback2 != null) {
                callback2.invoke(this.f74882r, false, false);
            }
            if (this.f74883s.m86797rO() != null) {
                this.f74883s.m86718CN(false);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m81418a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$r */
    /* loaded from: classes6.dex */
    public static final class C14552r implements MiniProgramDialog.InterfaceC14633b {

        /* renamed from: a */
        final /* synthetic */ ArrayList f74884a;

        /* renamed from: b */
        final /* synthetic */ MPWebView f74885b;

        /* renamed from: c */
        final /* synthetic */ String f74886c;

        /* renamed from: d */
        final /* synthetic */ String[] f74887d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f74888e;

        /* renamed from: f */
        final /* synthetic */ PermissionRequest f74889f;

        C14552r(ArrayList arrayList, MPWebView mPWebView, String str, String[] strArr, ArrayList arrayList2, PermissionRequest permissionRequest) {
            this.f74884a = arrayList;
            this.f74885b = mPWebView;
            this.f74886c = str;
            this.f74887d = strArr;
            this.f74888e = arrayList2;
            this.f74889f = permissionRequest;
        }

        @Override // com.zing.zalo.p077ui.zviews.MiniProgramDialog.InterfaceC14633b
        /* renamed from: a */
        public void mo81419a(boolean z11) {
            if (z11) {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f74884a.iterator();
                while (it.hasNext()) {
                    C16798n c16798n = (C16798n) it.next();
                    if (c16798n.m89729c() != null) {
                        arrayList.add(c16798n.m89729c());
                    }
                }
                this.f74885b.m86788oQ(this.f74886c, this.f74887d, this.f74888e, this.f74889f);
                return;
            }
            this.f74885b.m86770fR(this.f74889f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$s */
    /* loaded from: classes6.dex */
    public static final class C14553s extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f74890t;

        C14553s(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C14553s(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f74890t == 0) {
                AbstractC24862s.m129228b(obj);
                InterfaceC27218a m92676n2 = MPWebView.this.m92676n2();
                AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type com.zing.zalo.ui.WebViewMPActivity");
                ((WebViewMPActivity) m92676n2).m57006o5();
                C16786d.a aVar = C16786d.Companion;
                if (C16786d.a.m89644c(aVar, null, 1, null).m47790K() != null) {
                    C16786d.a.m89644c(aVar, null, 1, null).m47800U(false);
                    C23744a.Companion.m124119a().m124116d(9002, new Object[0]);
                } else {
                    C16786d.a.m89644c(aVar, null, 1, null).m47800U(true);
                    C16786d.a.m89644c(aVar, null, 1, null).m47795P();
                    Intent intent = new Intent(MPWebView.this.getContext(), (Class<?>) ZaloLauncherActivity.class);
                    intent.addFlags(65536);
                    InterfaceC27218a m92676n22 = MPWebView.this.m92676n2();
                    if (m92676n22 != null) {
                        m92676n22.startActivity(intent);
                    }
                    Object m92676n23 = MPWebView.this.m92676n2();
                    AbstractC19074t.m100206d(m92676n23, "null cannot be cast to non-null type android.app.Activity");
                    ((Activity) m92676n23).overridePendingTransition(0, 0);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C14553s) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MPWebView$t */
    /* loaded from: classes6.dex */
    public static final class C14554t implements C17487o0.l {
        C14554t() {
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: gp */
        public void mo35571gp(ZaloView zaloView) {
            MPWebView.this.m81323dS().m89672m(zaloView);
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: o7 */
        public void mo35578o7(ZaloView zaloView) {
            if (!(zaloView instanceof MPWebView)) {
                if (!(zaloView instanceof MiniAppPopupView)) {
                    MPWebView.this.m81350sS(true);
                    return;
                }
                return;
            }
            MPWebView.this.m81323dS().m89674p();
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: r5 */
        public void mo35582r5(ZaloView zaloView) {
        }
    }

    public MPWebView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(new C14543i());
        this.f74834c2 = m129210a;
        this.f74836e2 = new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.xv
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                MPWebView.m81317WR(MPWebView.this, ((Boolean) obj).booleanValue());
            }
        };
        m129210a2 = AbstractC24856m.m129210a(new C14544j());
        this.f74837f2 = m129210a2;
        this.f74838g2 = new C14554t();
        this.f74839h2 = CoroutineScopeKt.m112637a(Dispatchers.m112681c());
        this.f74843l2 = true;
        m129210a3 = AbstractC24856m.m129210a(C14545k.f74872q);
        this.f74844m2 = m129210a3;
        this.f74846o2 = new LinkedHashMap();
        this.f74847p2 = "MPWebView_" + AbstractC21317c.f103810p.mo110380i(0L, Long.MAX_VALUE);
    }

    /* renamed from: AS */
    private final void m81295AS() {
        Integer num;
        int m118639A;
        AbstractC19147a m110743a;
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(AbstractC23136l9.m118639A(AbstractC16801x.transparent));
        }
        C21368b m86778iO = m86778iO();
        if (m86778iO != null && (m110743a = m86778iO.m110743a()) != null) {
            num = m110743a.m100473e();
        } else {
            num = null;
        }
        RelativeLayout m86813xO = m86813xO();
        if (m86813xO != null) {
            if (num != null) {
                m118639A = num.intValue();
            } else {
                m118639A = AbstractC23136l9.m118639A(AbstractC16801x.transparent);
            }
            m86813xO.setBackgroundColor(m118639A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LR */
    public final void m81306LR() {
        C19609h c19609h = this.f74828W1;
        if (c19609h != null) {
            C16786d.a.m89644c(C16786d.Companion, null, 1, null).mo47804f(c19609h, true);
            m81323dS().m89679v();
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.uv
                @Override // java.lang.Runnable
                public final void run() {
                    MPWebView.m81307MR(MPWebView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MR */
    public static final void m81307MR(MPWebView mPWebView) {
        AbstractC19074t.m100208f(mPWebView, "this$0");
        mPWebView.m81356vS();
    }

    /* renamed from: NR */
    private final void m81308NR() {
        String str;
        String str2;
        AbstractC19147a m110743a;
        AbstractC19147a m110743a2;
        AbstractC19147a m110743a3;
        m81346qS();
        C21368b m86778iO = m86778iO();
        String str3 = null;
        if (m86778iO != null && (m110743a3 = m86778iO.m110743a()) != null) {
            str = m110743a3.m100472d();
        } else {
            str = null;
        }
        if (str != null) {
            C21368b m86778iO2 = m86778iO();
            if (m86778iO2 != null && (m110743a2 = m86778iO2.m110743a()) != null) {
                str2 = m110743a2.m100472d();
            } else {
                str2 = null;
            }
            if (!AbstractC19074t.m100204b(str2, "null")) {
                C21368b m86778iO3 = m86778iO();
                if (m86778iO3 != null && (m110743a = m86778iO3.m110743a()) != null) {
                    str3 = m110743a.m100472d();
                }
                AbstractC19074t.m100205c(str3);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10, -1);
                layoutParams.addRule(8, AbstractC6918a0.mp_wv_normal_action_bar);
                Context context = getContext();
                if (context != null) {
                    RecyclingImageView recyclingImageView = new RecyclingImageView(context);
                    m86772gO().addView(recyclingImageView, 0, layoutParams);
                    C14536b c14536b = new C14536b(recyclingImageView, this);
                    c14536b.m125635v1(str3);
                    c14536b.m125757D3(m86772gO().getWidth());
                    if (this.f74840i2 == null) {
                        this.f74840i2 = new C23528a(context);
                    }
                    C23528a c23528a = this.f74840i2;
                    AbstractC19074t.m100205c(c23528a);
                }
            }
        }
    }

    /* renamed from: OR */
    private final void m81309OR() {
        RelativeLayout m86790pO = m86790pO();
        if (m86790pO != null) {
            m86790pO.removeView(this.f74825T1);
        }
        m86772gO().removeView(this.f74825T1);
        RelativeLayout m86813xO = m86813xO();
        if (m86813xO != null) {
            m86813xO.setElevation(0.0f);
        }
        if (this.f74824S1 == 6) {
            Context context = getContext();
            if (context != null) {
                this.f74825T1 = new MPTransparentActionBar(context);
                RelativeLayout m86790pO2 = m86790pO();
                if (m86790pO2 != null) {
                    MiniProgramActionBar miniProgramActionBar = this.f74825T1;
                    AbstractC19074t.m100206d(miniProgramActionBar, "null cannot be cast to non-null type com.zing.zalo.ui.widget.mini.program.actionbar.MPTransparentActionBar");
                    ((MPTransparentActionBar) miniProgramActionBar).setRootView(m86790pO2);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(21, -1);
                layoutParams.addRule(10, -1);
                RelativeLayout m86790pO3 = m86790pO();
                if (m86790pO3 != null) {
                    m86790pO3.addView(this.f74825T1, layoutParams);
                }
                m86772gO().getLayoutParams().height = AbstractC32226c.m155409h(m86790pO());
                m81295AS();
                m81346qS();
            } else {
                return;
            }
        } else {
            m86772gO().getLayoutParams().height = -2;
            Context context2 = getContext();
            if (context2 != null) {
                this.f74825T1 = new MPNormalActionBar(context2);
                RelativeLayout m86790pO4 = m86790pO();
                if (m86790pO4 != null) {
                    MiniProgramActionBar miniProgramActionBar2 = this.f74825T1;
                    AbstractC19074t.m100206d(miniProgramActionBar2, "null cannot be cast to non-null type com.zing.zalo.ui.widget.mini.program.actionbar.MPNormalActionBar");
                    ((MPNormalActionBar) miniProgramActionBar2).setRootView(m86790pO4);
                }
                m86772gO().addView(this.f74825T1, new ViewGroup.LayoutParams(-1, -2));
                m81308NR();
            } else {
                return;
            }
        }
        MiniProgramActionBar miniProgramActionBar3 = this.f74825T1;
        if (miniProgramActionBar3 != null) {
            miniProgramActionBar3.setDeviceHasNotch(WebBaseView.Companion.m86833f(m92676n2()));
        }
        m81364zS();
        MiniProgramActionBar miniProgramActionBar4 = this.f74825T1;
        if (miniProgramActionBar4 != null) {
            miniProgramActionBar4.setOptionClickListener(this);
        }
    }

    /* renamed from: PR */
    private final void m81310PR() {
        this.f74830Y1 = true;
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93086w(this.f74826U1, 998, null);
        }
        this.f74833b2 = Long.valueOf(System.currentTimeMillis());
        m81311QR();
        C18617f m98397a = C18617f.Companion.m98397a();
        if (m98397a != null) {
            m98397a.m98393p();
        }
    }

    /* renamed from: QR */
    private final void m81311QR() {
        if (!(this.f74826U1 instanceof MPLoadingViewFull)) {
            return;
        }
        C30933c0 m86816yO = m86816yO();
        m86816yO.m150310V1(new C19602a("EVENT_CLIENT_OPEN_LOADING_VIEW", 1000, new C14537c()));
        m86816yO.m150310V1(new C19602a("EVENT_CLIENT_LOADING_VIEW_ENABLE_CLOSE_BUTTON", ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, new C14538d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RR */
    public final void m81312RR() {
        if (m92676n2() instanceof Activity) {
            C19158l c19158l = this.f74842k2;
            boolean z11 = false;
            if (c19158l != null && c19158l.m100500a() == 0) {
                z11 = true;
            }
            this.f74843l2 = !z11;
            AbstractC21954k.a aVar = AbstractC21954k.Companion;
            Object m92676n2 = m92676n2();
            AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type android.app.Activity");
            aVar.m114611L((Activity) m92676n2, this.f74843l2, m92676n2() instanceof ZaloLauncherActivity);
            m81295AS();
            m81364zS();
        }
    }

    /* renamed from: SR */
    private final void m81313SR() {
        String m3357Q1;
        String m89670j = m81323dS().m89670j();
        if (m89670j != null && (m3357Q1 = AbstractC0924m0.m3357Q1()) != null && m3357Q1.length() != 0) {
            JSONObject jSONObject = new JSONObject(m3357Q1);
            jSONObject.remove(m89670j);
            AbstractC0924m0.m3345Pi(String.valueOf(jSONObject));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TR */
    public final void m81314TR() {
        String m86721DO;
        String str;
        String m86721DO2;
        C26697c m137251r;
        String m86721DO3;
        C30939f0.a aVar = C30939f0.Companion;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C26699e m150478d = aVar.m150478d(m92689tK);
        if (m150478d != null && (m137251r = m150478d.m137251r()) != null) {
            C19609h c19609h = this.f74828W1;
            if (c19609h == null || (m86721DO3 = c19609h.m102620n()) == null) {
                m86721DO3 = m86721DO();
            }
            m137251r.m137206G(m86721DO3);
        }
        C30930b.a aVar2 = C30930b.Companion;
        C30930b m150239a = aVar2.m150239a();
        C19609h c19609h2 = this.f74828W1;
        if (c19609h2 == null || (m86721DO = c19609h2.m102620n()) == null) {
            m86721DO = m86721DO();
        }
        m150239a.m150238k(aVar2.m150240b(m86721DO));
        C30933c0 m86816yO = m86816yO();
        C19609h c19609h3 = this.f74828W1;
        if (c19609h3 != null) {
            str = c19609h3.m102616j();
        } else {
            str = null;
        }
        C30933c0.m150248P1(m86816yO, new JSONObject("{\"mpds_action\": \"mpds.clear.appData\", \"appId\":\"" + str + "\"}"), null, 2, null);
        m81360xS();
        C19609h c19609h4 = this.f74828W1;
        if (c19609h4 == null || (m86721DO2 = c19609h4.m102620n()) == null) {
            m86721DO2 = m86721DO();
        }
        m86794qP(m86721DO2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UR */
    public static final void m81315UR(MPWebView mPWebView, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(mPWebView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        RelativeLayout m86790pO = mPWebView.m86790pO();
        if (m86790pO != null) {
            m86790pO.setAlpha(floatValue);
        }
        MPLoadingView mPLoadingView = mPWebView.f74826U1;
        if (mPLoadingView != null) {
            mPLoadingView.setAlpha(1 - floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VR */
    public final void m81316VR(String str) {
        if (str != null && !AbstractC19074t.m100204b(str, "")) {
            Context context = getContext();
            if (context != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                    if (clipboardManager != null) {
                        C0012a c0012a = new C0012a(clipboardManager, new SensitiveData("clipboard_copy_link_bottom_menu_miniapp", "web_view", null, 4, null));
                        ClipData newPlainText = ClipData.newPlainText("", str);
                        AbstractC19074t.m100205c(newPlainText);
                        c0012a.m16c(newPlainText);
                        ToastUtils.m89268p(context.getString(AbstractC8020f0.str_mini_app_copied));
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    ToastUtils.m89268p(context.getString(AbstractC8020f0.str_sensitive_clipboard_block_title));
                    return;
                }
            }
            return;
        }
        ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_link_not_exist));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WR */
    public static final void m81317WR(MPWebView mPWebView, boolean z11) {
        AbstractC19074t.m100208f(mPWebView, "this$0");
        mPWebView.m81322cS().m81681LM(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XR */
    public final void m81318XR(boolean z11, String str, String str2) {
        if (!z11) {
            String str3 = null;
            if (!AbstractC19074t.m100204b(str, "action.get.location")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", str);
                jSONObject.put("payload", "{}");
                C19609h c19609h = this.f74828W1;
                if (c19609h != null) {
                    str3 = c19609h.m102616j();
                }
                jSONObject.put("appId", str3);
                str3 = jSONObject.toString();
            }
            if (str3 != null) {
                m81319YR(str, str2, str3);
                return;
            }
            return;
        }
        String m81320aS = m81320aS(str);
        if (m81320aS != null) {
            m86783mP(m81320aS, str2);
        }
    }

    /* renamed from: YR */
    private final void m81319YR(String str, String str2, String str3) {
        C0762g c0762g = new C0762g();
        c0762g.m1341j(new C14541g(str, str2));
        long m150306S0 = m86816yO().m150306S0();
        C19609h c19609h = this.f74828W1;
        AbstractC19074t.m100205c(c19609h);
        long parseLong = Long.parseLong(c19609h.m102616j());
        if (str3 == null) {
            str3 = "";
        }
        c0762g.m1374m(m150306S0, parseLong, str, str3);
    }

    /* renamed from: aS */
    private final String m81320aS(String str) {
        if (AbstractC19074t.m100204b(str, "action.mp.get.number")) {
            String str2 = AbstractC23304d.f113368c0.f42455y;
            if (!TextUtils.isEmpty(str2)) {
                str2 = AbstractC23056e6.m118281g(str2, AbstractC23309i.m121704a5());
            }
            return AbstractC28207v1.m141923T0(str, "0", str2);
        }
        return "{}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bS */
    public final C25768b.b m81321bS() {
        return (C25768b.b) this.f74834c2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cS */
    public final MiniAppBottomMenu m81322cS() {
        return (MiniAppBottomMenu) this.f74837f2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dS */
    public final C16789g m81323dS() {
        return (C16789g) this.f74844m2.getValue();
    }

    /* renamed from: eS */
    private final void m81324eS() {
        int i11;
        AbstractC19147a abstractC19147a;
        boolean z11;
        AbstractC19147a m110743a;
        Boolean m100478j;
        AbstractC19147a m110743a2;
        AbstractC19147a abstractC19147a2;
        AbstractC19147a m110743a3;
        C21368b m86778iO = m86778iO();
        if (m86778iO != null && (m110743a3 = m86778iO.m110743a()) != null) {
            i11 = m110743a3.m100477i();
        } else {
            i11 = 5;
        }
        if (i11 != this.f74824S1) {
            this.f74824S1 = i11;
            m81309OR();
        }
        MiniProgramActionBar miniProgramActionBar = this.f74825T1;
        Integer num = null;
        if (miniProgramActionBar instanceof MPNormalActionBar) {
            AbstractC19074t.m100206d(miniProgramActionBar, "null cannot be cast to non-null type com.zing.zalo.ui.widget.mini.program.actionbar.MPNormalActionBar");
            MPNormalActionBar mPNormalActionBar = (MPNormalActionBar) miniProgramActionBar;
            boolean canGoBack = canGoBack();
            C21368b m86778iO2 = m86778iO();
            if (m86778iO2 != null) {
                abstractC19147a2 = m86778iO2.m110743a();
            } else {
                abstractC19147a2 = null;
            }
            mPNormalActionBar.m76430n(canGoBack, abstractC19147a2);
            MiniProgramActionBar miniProgramActionBar2 = this.f74825T1;
            AbstractC19074t.m100206d(miniProgramActionBar2, "null cannot be cast to non-null type com.zing.zalo.ui.widget.mini.program.actionbar.MPNormalActionBar");
            ((MPNormalActionBar) miniProgramActionBar2).setTitle(m86810wO());
            m81308NR();
        } else {
            AbstractC19074t.m100206d(miniProgramActionBar, "null cannot be cast to non-null type com.zing.zalo.ui.widget.mini.program.actionbar.MPTransparentActionBar");
            MPTransparentActionBar mPTransparentActionBar = (MPTransparentActionBar) miniProgramActionBar;
            C21368b m86778iO3 = m86778iO();
            if (m86778iO3 != null) {
                abstractC19147a = m86778iO3.m110743a();
            } else {
                abstractC19147a = null;
            }
            mPTransparentActionBar.m76432m(abstractC19147a);
            m81295AS();
        }
        C21368b m86778iO4 = m86778iO();
        if (m86778iO4 != null && (m110743a2 = m86778iO4.m110743a()) != null) {
            num = m110743a2.m100473e();
        }
        C21368b m86778iO5 = m86778iO();
        if (m86778iO5 != null && (m110743a = m86778iO5.m110743a()) != null && (m100478j = m110743a.m100478j()) != null) {
            z11 = m100478j.booleanValue();
        } else if (num != null) {
            z11 = AbstractC21954k.Companion.m114624s(num);
        } else {
            z11 = true;
        }
        m81350sS(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fS */
    public final void m81325fS(String str, JSONObject jSONObject, String str2) {
        if (!jSONObject.optBoolean("isGranted") && !AbstractC28207v1.m141992i1(str)) {
            C30933c0.m150273m0(m86816yO(), WebAppInterface.ERROR_CODE_USER_REJECTED_REQUEST, "The user rejected! (clicked the negative button)", str, null, str2, 8, null);
        } else {
            m86762bQ(str, jSONObject.toString(), str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gS */
    public final void m81326gS(String str, JSONObject jSONObject, String str2) {
        try {
            C0762g c0762g = new C0762g();
            c0762g.m1341j(new C14542h(str, str2));
            C19609h c19609h = this.f74828W1;
            if (c19609h != null) {
                long m102617k = c19609h.m102617k();
                if (m102617k == 0) {
                    return;
                }
                c0762g.m1376o(m102617k, str, jSONObject);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: hS */
    private final void m81328hS() {
        int i11;
        C16789g m81323dS = m81323dS();
        C18620i m150296M0 = m86816yO().m150296M0();
        if (m150296M0 == null) {
            m150296M0 = C18620i.f93694q;
        }
        m81323dS.m89677s(m150296M0.m98403a());
        if (m86816yO().m150296M0() != null) {
            C21703a.f105414a.m112011a(WebBaseView.Companion.m86839m(), "viewModel.sourceOpenMiniApp null");
        }
        C16789g m81323dS2 = m81323dS();
        Integer m150298N0 = m86816yO().m150298N0();
        if (m150298N0 != null) {
            i11 = m150298N0.intValue();
        } else {
            i11 = -1;
        }
        m81323dS2.m89678t(i11);
        m81323dS().m89668e();
        m81323dS().m89667d(EnumC3144b.f13281w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0030  */
    /* renamed from: iS */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m81330iS() {
        String str;
        C19609h c19609h;
        String str2;
        C19609h c19609h2;
        C19609h c19609h3;
        JSONObject m102614h;
        JSONObject jSONObject = new JSONObject();
        String str3 = null;
        try {
            c19609h3 = this.f74828W1;
        } catch (Exception unused) {
        }
        if (c19609h3 != null && (m102614h = c19609h3.m102614h()) != null) {
            str = m102614h.getString("shortcutUrl");
            if (TextUtils.isEmpty(str)) {
                str = AbstractC21954k.Companion.m114621o(this.f74828W1);
            }
            c19609h = this.f74828W1;
            if (c19609h == null) {
                str2 = c19609h.m102619m();
            } else {
                str2 = null;
            }
            c19609h2 = this.f74828W1;
            if (c19609h2 != null) {
                str3 = c19609h2.m102612f();
            }
            if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, str);
                jSONObject.put("title", str2);
                jSONObject.put("iconUrl", str3);
                WebBaseView.m86665cQ(this, "action.create.shortcut", jSONObject.toString(), null, 4, null);
                return;
            }
            ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_cannot_add_to_phone_screen));
        }
        str = null;
        if (TextUtils.isEmpty(str)) {
        }
        c19609h = this.f74828W1;
        if (c19609h == null) {
        }
        c19609h2 = this.f74828W1;
        if (c19609h2 != null) {
        }
        if (TextUtils.isEmpty(str)) {
        }
        ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_cannot_add_to_phone_screen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jS */
    public static final void m81332jS(MPWebView mPWebView) {
        AbstractC19074t.m100208f(mPWebView, "this$0");
        mPWebView.f74832a2 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kS */
    public static final void m81334kS(MPWebView mPWebView) {
        AbstractC19074t.m100208f(mPWebView, "this$0");
        AbstractC21954k.a aVar = AbstractC21954k.Companion;
        Object m92676n2 = mPWebView.m92676n2();
        AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type android.app.Activity");
        aVar.m114627v((Activity) m92676n2, new Intent(mPWebView.getContext(), (Class<?>) ZaloLauncherActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lS */
    public final void m81336lS() {
        BuildersKt__Builders_commonKt.m112540d(this.f74839h2, null, null, new C14547m(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mS */
    public final void m81338mS() {
        BuildersKt__Builders_commonKt.m112540d(this.f74839h2, null, null, new C14548n(null), 3, null);
    }

    /* renamed from: nS */
    private final void m81340nS() {
        BuildersKt__Builders_commonKt.m112540d(this.f74839h2, null, null, new C14549o(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oS */
    public final void m81342oS(ArrayList arrayList) {
        String m114621o = AbstractC21954k.Companion.m114621o(this.f74828W1);
        if (AbstractC19074t.m100204b(m114621o, "")) {
            ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_cannot_share));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("linktoShare", m114621o);
        if (arrayList != null) {
            bundle.putStringArrayList("EXTRA_SELECTED_UID_LIST", arrayList);
        }
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(ShareView.class, bundle, 1, true);
        }
    }

    /* renamed from: pS */
    static /* synthetic */ void m81344pS(MPWebView mPWebView, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            arrayList = null;
        }
        mPWebView.m81342oS(arrayList);
    }

    /* renamed from: qS */
    private final void m81346qS() {
        for (View view : AbstractC1595r0.m8168a(m86772gO())) {
            if (view instanceof RecyclingImageView) {
                m86772gO().removeView(view);
            }
        }
    }

    /* renamed from: rS */
    private final void m81348rS(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, str);
        m86816yO().m150336i0(new C19602a("h5.event.open.mp", jSONObject.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sS */
    public final void m81350sS(boolean z11) {
        View view;
        Window window;
        if (m92681pJ() && (m92676n2() instanceof WebViewMPActivity)) {
            return;
        }
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (window = m92676n2.getWindow()) != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        if (Build.VERSION.SDK_INT >= 23 && view != null) {
            if (z11) {
                view.setSystemUiVisibility(view.getSystemUiVisibility() & (-8193));
            } else {
                view.setSystemUiVisibility(view.getSystemUiVisibility() | 8192);
            }
        }
    }

    /* renamed from: tS */
    private final void m81352tS() {
        C19609h c19609h = this.f74828W1;
        if (c19609h != null) {
            C0697c0.Companion.m1052f(this, "appid", c19609h.m102616j());
        }
    }

    /* renamed from: uS */
    private final synchronized void m81354uS() {
        try {
            AbstractC2379w.m12430d(m86790pO());
            if (this.f74829X1) {
                return;
            }
            this.f74829X1 = true;
            if (AbstractC0924m0.m4159r3() == 0) {
                m81322cS().m81678FM();
                AbstractC2379w.m12430d(m86790pO());
                C17487o0 m92662fJ = m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.mo89693h2(m81322cS(), "", 0, true);
                }
            } else {
                C19609h c19609h = this.f74828W1;
                if (c19609h != null) {
                    MiniAppZinstantDialog.C14611a.m81767c(MiniAppZinstantDialog.Companion, m92662fJ(), new MiniAppZinstantBottomMenu() { // from class: com.zing.zalo.ui.zviews.MPWebView$showBottomSheet$1$1
                        @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
                        /* renamed from: FM */
                        public MPWebView mo81421FM() {
                            return MPWebView.this;
                        }

                        @Override // com.zing.zalo.p077ui.zviews.MiniAppZinstantBottomMenu, com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView, zf0.InterfaceC31826c
                        /* renamed from: yo */
                        public void mo81422yo(String str) {
                            super.mo81422yo(str);
                            MPWebView.this.f74845n2 = str;
                        }

                        @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
                        /* renamed from: zM */
                        public void mo81423zM(boolean z11) {
                            super.mo81423zM(z11);
                            MPWebView.this.f74829X1 = false;
                        }
                    }, c19609h, null, this.f74845n2, 8, null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: vS */
    private final void m81356vS() {
        if ((m92676n2() instanceof WebViewMPActivity) && AbstractC0924m0.m3098H3() == 1) {
            BuildersKt__Builders_commonKt.m112540d(this.f74839h2, null, null, new C14553s(null), 3, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:            if (r1.m93018M0() > 1) goto L25;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: wS */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m81358wS() {
        String str;
        MPLoadingViewFull mPLoadingViewFull;
        C17487o0 m92662fJ;
        m81323dS().m89667d(EnumC3144b.f13276r);
        WebViewMPActivity.C10961a c10961a = WebViewMPActivity.Companion;
        C19609h c19609h = this.f74828W1;
        String str2 = null;
        if (c19609h != null) {
            str = c19609h.m102616j();
        } else {
            str = null;
        }
        c10961a.m57013b(str + " show loading view");
        if (this.f74826U1 == null) {
            Context context = getContext();
            if (context != null) {
                if (Build.VERSION.SDK_INT != 26 && !c10961a.m57015d()) {
                    MPLoadingViewDialog mPLoadingViewDialog = new MPLoadingViewDialog(context);
                    if (!(m92676n2() instanceof ZaloLauncherActivity) || (m92662fJ = m92662fJ()) == null || m92662fJ.m93018M0() != 1) {
                        C17487o0 m92662fJ2 = m92662fJ();
                        mPLoadingViewFull = mPLoadingViewDialog;
                        if (m92662fJ2 != null) {
                            mPLoadingViewFull = mPLoadingViewDialog;
                        }
                    }
                    mPLoadingViewDialog.m81281g();
                    mPLoadingViewFull = mPLoadingViewDialog;
                } else {
                    mPLoadingViewFull = new MPLoadingViewFull(context);
                }
                this.f74826U1 = mPLoadingViewFull;
            } else {
                return;
            }
        }
        MPLoadingView mPLoadingView = this.f74826U1;
        if (mPLoadingView != null) {
            mPLoadingView.setOnBtnExitClickListener(this);
        }
        MPLoadingView mPLoadingView2 = this.f74826U1;
        if (mPLoadingView2 != null) {
            mPLoadingView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        m81310PR();
        C16789g m81323dS = m81323dS();
        C19609h c19609h2 = this.f74828W1;
        if (c19609h2 != null) {
            str2 = c19609h2.m102616j();
        }
        m81323dS.m89675q(str2);
    }

    /* renamed from: xS */
    private final void m81360xS() {
        if (this.f74827V1 == null) {
            if (getContext() == null) {
                return;
            }
            Context context = getContext();
            AbstractC19074t.m100205c(context);
            MPLoadingViewFull mPLoadingViewFull = new MPLoadingViewFull(context);
            this.f74827V1 = mPLoadingViewFull;
            C19609h c19609h = this.f74828W1;
            if (c19609h != null) {
                AbstractC19074t.m100205c(c19609h);
                mPLoadingViewFull.setMPInfo(c19609h);
            }
        }
        MPLoadingViewFull mPLoadingViewFull2 = this.f74827V1;
        if (mPLoadingViewFull2 != null) {
            mPLoadingViewFull2.setOnBtnExitClickListener(this);
        }
        this.f74831Z1 = true;
        this.f74830Y1 = true;
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93086w(this.f74827V1, 998, null);
        }
    }

    /* renamed from: yS */
    private final void m81362yS() {
        try {
            JSONObject jSONObject = new JSONObject(m81323dS().toString());
            C0732w m1189a = C0732w.Companion.m1189a();
            C16789g.a aVar = C16789g.Companion;
            m1189a.m1187q("ma_system_log", "", aVar.m89681b(jSONObject), aVar.m89680a(jSONObject));
            if (m92676n2() instanceof WebViewMPActivity) {
                InterfaceC27218a m92676n2 = m92676n2();
                AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type com.zing.zalo.ui.WebViewMPActivity");
                if (!((WebViewMPActivity) m92676n2).m57005d5()) {
                    m81313SR();
                }
            } else if (m92676n2() instanceof ZaloLauncherActivity) {
                InterfaceC27218a m92676n22 = m92676n2();
                AbstractC19074t.m100206d(m92676n22, "null cannot be cast to non-null type com.zing.zalo.ui.ZaloLauncherActivity");
                if (!((ZaloLauncherActivity) m92676n22).m57106D5()) {
                    m81313SR();
                }
            }
        } catch (Exception e11) {
            AbstractC22490a.m116282e(new Exception("MPWebView", e11));
        }
    }

    /* renamed from: zS */
    private final void m81364zS() {
        Integer num;
        int i11 = 0;
        if (this.f74825T1 instanceof MPTransparentActionBar) {
            RelativeLayout m86813xO = m86813xO();
            if (m86813xO != null) {
                C19158l c19158l = this.f74842k2;
                if (c19158l == null || c19158l.m100500a() != 1) {
                    C19158l c19158l2 = this.f74842k2;
                    if (c19158l2 != null) {
                        num = Integer.valueOf(c19158l2.m100500a());
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i11 = 8;
                    }
                }
                m86813xO.setVisibility(i11);
            }
        } else {
            RelativeLayout m86813xO2 = m86813xO();
            if (m86813xO2 != null) {
                m86813xO2.setVisibility(0);
            }
        }
        MiniProgramActionBar miniProgramActionBar = this.f74825T1;
        if (miniProgramActionBar != null) {
            miniProgramActionBar.setShowTopInset(this.f74843l2);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: AO */
    public void mo81365AO(String str, String str2) {
        String str3;
        if (AbstractC23304d.f113368c0 == null) {
            String m141907P0 = AbstractC28207v1.m141907P0(str);
            AbstractC19074t.m100207e(m141907P0, "genJsonErrorUnknown(...)");
            m86783mP(m141907P0, str2);
            return;
        }
        UUID m118021b = AbstractC23020b3.m118021b(getContext());
        String str4 = AbstractC23304d.f113368c0.f42434r;
        C19609h c19609h = this.f74828W1;
        if (c19609h != null) {
            str3 = c19609h.m102616j();
        } else {
            str3 = null;
        }
        String str5 = m118021b + "_" + str4 + "_" + str3;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        Charset charset = StandardCharsets.UTF_8;
        AbstractC19074t.m100207e(charset, "UTF_8");
        byte[] bytes = str5.getBytes(charset);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(messageDigest.digest(bytes), 0);
        AbstractC19074t.m100207e(encodeToString, "encodeToString(...)");
        String m141923T0 = AbstractC28207v1.m141923T0(str, "0", encodeToString);
        AbstractC19074t.m100207e(m141923T0, "genJsonSuccess(...)");
        m86783mP(m141923T0, str2);
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        m81323dS().m89667d(EnumC3144b.f13275q);
        super.mo37111CJ(bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: DQ */
    public void mo81366DQ(String str, GeolocationPermissions.Callback callback) {
        String str2;
        C29314i m86797rO = m86797rO();
        if (m86797rO != null) {
            str2 = m86797rO.m146457b();
        } else {
            str2 = null;
        }
        mo81378RQ("action.get.location", str2, new C14551q(callback, str, this));
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: EQ */
    public void mo81367EQ(String str, String[] strArr, PermissionRequest permissionRequest, ArrayList arrayList, ArrayList arrayList2) {
        String str2;
        CharSequence m127168X0;
        AbstractC19074t.m100208f(str, "origin");
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(arrayList, "requestPermissions");
        AbstractC19074t.m100208f(arrayList2, "permissionNames");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mp_permission_request_content_dialog);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        Object[] objArr = new Object[1];
        C19609h c19609h = this.f74828W1;
        if (c19609h == null || (str2 = c19609h.m102619m()) == null) {
            str2 = str;
        }
        m127168X0 = AbstractC24342w.m127168X0(str2);
        objArr[0] = m127168X0.toString();
        String format = String.format(m118743r0, Arrays.copyOf(objArr, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        Context context = getContext();
        if (context != null) {
            MiniProgramDialog.Companion.m81864a(m92676n2(), (r29 & 2) != 0 ? "" : format, (r29 & 4) != 0 ? "" : "", (r29 & 8) != 0 ? null : new C14552r(arrayList2, this, str, strArr, arrayList, permissionRequest), (r29 & 16) != 0 ? null : new MiniDialogPermissionRequest(context, arrayList2), (r29 & 32) != 0 ? null : null, (r29 & 64) != 0 ? false : false, (r29 & 128) != 0 ? null : null, (r29 & 256) != 0 ? null : null, (r29 & 512) != 0 ? null : this.f74828W1, "mp_accept_permission_request", "mp_cancel_permission_request");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m81323dS().m89667d(EnumC3144b.f13277s);
        View mo37483GJ = super.mo37483GJ(layoutInflater, viewGroup, bundle);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93092y(this.f74838g2);
        }
        if (mo37483GJ != null) {
            mo37483GJ.setVisibility(8);
        }
        C17487o0 m92662fJ2 = m92662fJ();
        if (m92662fJ2 != null) {
            m92662fJ2.m93000F1(this.f74826U1);
        }
        m81358wS();
        m81309OR();
        return mo37483GJ;
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        String str;
        C17487o0 m92662fJ;
        super.mo39024IJ();
        m81323dS().m89669f(EnumC3143a.f13269v);
        m81362yS();
        m86816yO().m150304Q1();
        WebView.setWebContentsDebuggingEnabled(false);
        C17487o0 m92662fJ2 = m92662fJ();
        if (m92662fJ2 != null) {
            m92662fJ2.m93008I1(this.f74838g2);
        }
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 9001);
        bVar.m124119a().m124117e(this, 9009);
        bVar.m124119a().m124117e(this, 9010);
        bVar.m124119a().m124117e(this, 9011);
        MPLoadingView mPLoadingView = this.f74826U1;
        if (mPLoadingView != null && (m92662fJ = m92662fJ()) != null) {
            m92662fJ.m93000F1(mPLoadingView);
        }
        WebViewMPActivity.C10961a c10961a = WebViewMPActivity.Companion;
        C19609h c19609h = this.f74828W1;
        Window window = null;
        if (c19609h != null) {
            str = c19609h.m102616j();
        } else {
            str = null;
        }
        c10961a.m57013b(str + " onDestroy");
        if (!(m92676n2() instanceof WebViewMPActivity)) {
            m81350sS(true);
            Context context = getContext();
            if (context != null) {
                InterfaceC27218a m92676n2 = m92676n2();
                if (m92676n2 != null) {
                    window = m92676n2.getWindow();
                }
                if (window != null) {
                    window.setStatusBarColor(AbstractC23136l9.m118641B(context, AbstractC17452c.statusBarColor));
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: JN */
    public void mo81368JN(EnumC3143a enumC3143a) {
        AbstractC19074t.m100208f(enumC3143a, "source");
        m81323dS().m89669f(enumC3143a);
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: KN */
    public void mo81369KN() {
        String str;
        if (!this.f74830Y1) {
            return;
        }
        m81328hS();
        C18617f.a aVar = C18617f.Companion;
        C18617f m98397a = aVar.m98397a();
        if (m98397a != null) {
            m98397a.m98387j();
        }
        super.mo81369KN();
        WebViewMPActivity.C10961a c10961a = WebViewMPActivity.Companion;
        C19609h c19609h = this.f74828W1;
        String str2 = null;
        if (c19609h != null) {
            str = c19609h.m102616j();
        } else {
            str = null;
        }
        c10961a.m57013b(str + " close loading view");
        m81324eS();
        m86731NO();
        this.f74830Y1 = false;
        if (this.f74831Z1) {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93000F1(this.f74827V1);
            }
            this.f74831Z1 = false;
        } else {
            RelativeLayout m86790pO = m86790pO();
            if (m86790pO != null) {
                m86790pO.setAlpha(0.0f);
            }
            RelativeLayout m86790pO2 = m86790pO();
            if (m86790pO2 != null) {
                m86790pO2.setVisibility(0);
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.tv
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    MPWebView.m81315UR(MPWebView.this, valueAnimator2);
                }
            });
            valueAnimator.addListener(new C14539e());
            valueAnimator.setDuration(500L);
            valueAnimator.start();
        }
        C18617f m98397a2 = aVar.m98397a();
        if (m98397a2 != null) {
            str2 = m98397a2.m98382e(m86816yO().m150295L0());
        }
        if (!Debug.isDebuggerConnected() && str2 != null && str2.length() != 0) {
            m86816yO().m150336i0(new C19602a("h5.event.mp.loadingview.closed", str2));
        }
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: KO */
    public void mo81370KO(Location location) {
        String str;
        String m146456a;
        C29314i m86797rO = m86797rO();
        if (m86797rO != null) {
            str = m86797rO.m146457b();
        } else {
            str = null;
        }
        if (str == null) {
            super.mo81370KO(location);
            return;
        }
        if (location == null) {
            return;
        }
        try {
            try {
                C29314i m86797rO2 = m86797rO();
                if (m86797rO2 != null && (m146456a = m86797rO2.m146456a(location)) != null) {
                    String string = new JSONObject(m146456a).getString("data");
                    C29314i m86797rO3 = m86797rO();
                    if (m86797rO3 != null && m86797rO3.m146458c()) {
                        m86783mP(AbstractC21954k.a.m114600k(AbstractC21954k.Companion, null, new JSONObject(string), 1, null), str);
                    } else {
                        m81319YR("action.get.location", str, string);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            m86812wQ(null);
        } catch (Throwable th2) {
            m86812wQ(null);
            throw th2;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: LN */
    public void mo81371LN() {
        super.mo81371LN();
        m86816yO().m150300O0().m9219j(this, new C14550p(new C14540f()));
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: LP */
    public void mo49858LP(String str) {
        String str2;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        m81323dS().m89667d(EnumC3144b.f13280v);
        C18617f m98397a = C18617f.Companion.m98397a();
        if (m98397a != null) {
            m98397a.m98385h();
        }
        super.mo49858LP(str);
        WebViewMPActivity.C10961a c10961a = WebViewMPActivity.Companion;
        C19609h c19609h = this.f74828W1;
        if (c19609h != null) {
            str2 = c19609h.m102616j();
        } else {
            str2 = null;
        }
        c10961a.m57013b("App id " + str2 + " onPageFinished");
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: LQ */
    public void mo81372LQ(boolean z11) {
        int i11;
        this.f74845n2 = null;
        if (z11 && m86816yO().m150345m2()) {
            return;
        }
        if (z11) {
            i11 = AbstractC8020f0.str_mini_app_added_favorite;
        } else {
            i11 = AbstractC8020f0.str_mini_app_removed_favorite;
        }
        ToastUtils.m89268p(AbstractC23136l9.m118743r0(i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: MP */
    public void mo81373MP(String str, Bitmap bitmap) {
        String str2;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        m81323dS().m89667d(EnumC3144b.f13279u);
        C18617f m98397a = C18617f.Companion.m98397a();
        if (m98397a != null) {
            m98397a.m98386i();
        }
        super.mo81373MP(str, bitmap);
        WebViewMPActivity.C10961a c10961a = WebViewMPActivity.Companion;
        C19609h c19609h = this.f74828W1;
        if (c19609h != null) {
            str2 = c19609h.m102616j();
        } else {
            str2 = null;
        }
        c10961a.m57013b("App id " + str2 + " onPageStarted");
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: MQ */
    public void mo81374MQ(int i11, C15923mx c15923mx) {
        String m102619m;
        String str;
        Class cls;
        AbstractC19074t.m100208f(c15923mx, "miniAppAwarenessData");
        C19609h c19609h = this.f74828W1;
        if (c19609h != null && (m102619m = c19609h.m102619m()) != null) {
            Bundle bundle = new Bundle();
            C19609h c19609h2 = this.f74828W1;
            if (c19609h2 != null) {
                str = c19609h2.m102616j();
            } else {
                str = null;
            }
            bundle.putSerializable("MA_AWARENESS_INFO", new MiniAppAwarenessPopup.C14580b(m102619m, c15923mx, i11, str));
            AbstractC2379w.m12430d(m86790pO());
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                if (i11 == 2) {
                    cls = MiniAppAwarenessPopupFavorite.class;
                } else {
                    cls = MiniAppAwarenessPopupExit.class;
                }
                m92662fJ.m93066i2(cls, bundle, 15, 0, true);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: NQ */
    public void mo81375NQ(String str, String str2, JSONObject jSONObject) {
        int i11;
        if (jSONObject != null && jSONObject.has("maxProfile")) {
            i11 = jSONObject.getInt("maxProfile");
        } else {
            i11 = 1;
        }
        if (i11 > 0 && i11 <= 10) {
            this.f74841j2 = str2;
            Bundle m83055pM = ProfilePickerView.m83055pM(null, i11, AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_select_title));
            m83055pM.putBoolean("extra_show_text_instead_icon", true);
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(ProfilePickerView.class, m83055pM, 13, 1, true);
                return;
            }
            return;
        }
        if (str2 != null) {
            String m141899N0 = AbstractC28207v1.m141899N0(-103, "Max profile must be in the range of 1 10", "action.mp.open.profile.picker");
            AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
            m86783mP(m141899N0, str2);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: PO */
    public void mo81376PO(String str, JSONObject jSONObject, String str2) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(jSONObject, "data");
        m86816yO().m150297M1(str, jSONObject, str2);
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: QO */
    public void mo81377QO(String str, String str2, JSONObject jSONObject) {
        String str3;
        List m131496e;
        if (str != null) {
            switch (str.hashCode()) {
                case -819287323:
                    if (str.equals("action.ma.menu.open.description")) {
                        m81336lS();
                        return;
                    }
                    return;
                case 353164316:
                    if (str.equals("action.ma.menu.permission")) {
                        m81338mS();
                        return;
                    }
                    return;
                case 845188139:
                    if (str.equals("action.ma.menu.minimize")) {
                        m81306LR();
                        return;
                    }
                    return;
                case 1439874418:
                    if (str.equals("action.ma.menu.share")) {
                        ArrayList arrayList = null;
                        if (jSONObject != null && jSONObject.has("preselect_uids")) {
                            str3 = jSONObject.getString("preselect_uids");
                        } else {
                            str3 = null;
                        }
                        if (str3 != null) {
                            m131496e = AbstractC25366r.m131496e(str3);
                            arrayList = new ArrayList(m131496e);
                        }
                        m81342oS(arrayList);
                        return;
                    }
                    return;
                case 1655359078:
                    if (str.equals("action.ma.menu.reload")) {
                        m81314TR();
                        return;
                    }
                    return;
                case 1697177859:
                    if (str.equals("action.ma.menu.copy.url")) {
                        m81316VR(AbstractC21954k.Companion.m114621o(this.f74828W1));
                        return;
                    }
                    return;
                case 1717357848:
                    if (str.equals("action.ma.menu.open.qr")) {
                        m81340nS();
                        return;
                    }
                    return;
                case 1861755347:
                    if (str.equals("action.ma.menu.shortcut")) {
                        m81330iS();
                        return;
                    }
                    return;
                case 2122176106:
                    if (str.equals("action.ma.menu.favorites")) {
                        m86816yO().m150311W();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m81323dS().m89671l();
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: RQ */
    public void mo81378RQ(final String str, final String str2, final InterfaceC18505l interfaceC18505l) {
        final boolean z11;
        String str3;
        InterfaceC18505l interfaceC18505l2;
        String str4;
        if (str == null) {
            return;
        }
        C0903c0 m150289I0 = m86816yO().m150289I0(str);
        if (m150289I0 == null) {
            if (str2 != null) {
                String m141899N0 = AbstractC28207v1.m141899N0(WebAppInterface.ERROR_CODE_USER_REJECTED_REQUEST_NO_ASK_AGAIN, "User rejected", str);
                AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
                m86783mP(m141899N0, str2);
            }
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(Boolean.FALSE);
                return;
            }
            return;
        }
        if (m150289I0.m2791a() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        C29314i m86797rO = m86797rO();
        if (m86797rO != null) {
            m86797rO.m146460e(z11);
        }
        int m2792b = m150289I0.m2792b();
        if (m2792b != 0) {
            if (m2792b != 2) {
                new FrameLayout.LayoutParams(-1, -2).gravity = 16;
                try {
                    str3 = "genJsonErrorSpecific(...)";
                    interfaceC18505l2 = interfaceC18505l;
                    str4 = str2;
                    try {
                        MiniAppZinstantDialog.C14611a.m81767c(MiniAppZinstantDialog.Companion, m92662fJ(), new MiniAppZinstantBottomPermissionView() { // from class: com.zing.zalo.ui.zviews.MPWebView$showZinstantDialog$1
                            @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
                            /* renamed from: KM */
                            public void mo81424KM(String str5, boolean z12, boolean z13, String str6) {
                                String str7;
                                int i11;
                                AbstractC19074t.m100208f(str5, "appId");
                                super.mo81424KM(str5, z12, z13, str6);
                                C19609h c19609h = this.f74828W1;
                                if (c19609h != null) {
                                    str7 = c19609h.m102616j();
                                } else {
                                    str7 = null;
                                }
                                if (!AbstractC19074t.m100204b(str5, str7)) {
                                    return;
                                }
                                String str8 = str2;
                                if (str8 != null) {
                                    if (z12) {
                                        this.m81318XR(z11, str, str8);
                                    } else {
                                        MPWebView mPWebView = this;
                                        if (z13) {
                                            i11 = WebAppInterface.ERROR_CODE_USER_REJECTED_REQUEST;
                                        } else {
                                            i11 = WebAppInterface.ERROR_CODE_USER_REJECTED_REQUEST_NO_ASK_AGAIN;
                                        }
                                        String m141899N02 = AbstractC28207v1.m141899N0(i11, "User rejected", str);
                                        AbstractC19074t.m100207e(m141899N02, "genJsonErrorSpecific(...)");
                                        mPWebView.m86783mP(m141899N02, str2);
                                    }
                                }
                                InterfaceC18505l interfaceC18505l3 = interfaceC18505l;
                                if (interfaceC18505l3 != null) {
                                    interfaceC18505l3.mo205i9(Boolean.valueOf(z12));
                                }
                            }

                            @Override // com.zing.zalo.p077ui.zviews.MiniAppZinstantDialog
                            /* renamed from: RM */
                            public void mo81425RM() {
                                super.mo81425RM();
                                if (str2 != null) {
                                    MPWebView mPWebView = this;
                                    String m141899N02 = AbstractC28207v1.m141899N0(WebAppInterface.ERROR_CODE_USER_REJECTED_REQUEST, "User rejected", str);
                                    AbstractC19074t.m100207e(m141899N02, "genJsonErrorSpecific(...)");
                                    mPWebView.m86783mP(m141899N02, str2);
                                }
                                InterfaceC18505l interfaceC18505l3 = interfaceC18505l;
                                if (interfaceC18505l3 != null) {
                                    interfaceC18505l3.mo205i9(Boolean.FALSE);
                                }
                            }
                        }, this.f74828W1, str, null, 16, null);
                    } catch (Exception unused) {
                        if (str4 != null) {
                            String m141899N02 = AbstractC28207v1.m141899N0(-500, "Internal server error", str);
                            AbstractC19074t.m100207e(m141899N02, str3);
                            m86783mP(m141899N02, str4);
                        }
                        if (interfaceC18505l2 != null) {
                            interfaceC18505l2.mo205i9(Boolean.FALSE);
                        }
                    }
                } catch (Exception unused2) {
                    str3 = "genJsonErrorSpecific(...)";
                    interfaceC18505l2 = interfaceC18505l;
                    str4 = str2;
                }
            } else {
                if (str2 != null) {
                    m81318XR(z11, str, str2);
                }
                if (interfaceC18505l != null) {
                    interfaceC18505l.mo205i9(Boolean.TRUE);
                }
            }
        } else {
            if (str2 != null) {
                String m141899N03 = AbstractC28207v1.m141899N0(WebAppInterface.ERROR_CODE_USER_REJECTED_REQUEST_NO_ASK_AGAIN, "User rejected", str);
                AbstractC19074t.m100207e(m141899N03, "genJsonErrorSpecific(...)");
                m86783mP(m141899N03, str2);
            }
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(Boolean.FALSE);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, lv.InterfaceC22653a
    /* renamed from: Sc */
    public void mo81379Sc(String str, String str2) {
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: TP */
    public void mo81380TP() {
        if (m92676n2() instanceof WebViewMPActivity) {
            InterfaceC27218a m92676n2 = m92676n2();
            AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type com.zing.zalo.ui.WebViewMPActivity");
            ((WebViewMPActivity) m92676n2).m57000H4();
            return;
        }
        finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: TQ */
    public void mo81381TQ(final String str, JSONObject jSONObject, final String str2) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(jSONObject, "options");
        final String optString = jSONObject.optString("uid");
        MAZinstantDynamicBottomSheet.Companion.m81273b(m92662fJ(), new MAZinstantDynamicBottomSheet() { // from class: com.zing.zalo.ui.zviews.MPWebView$showZinstantDynamicBottomSheet$1

            /* renamed from: a1 */
            private boolean f74898a1;

            @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
            /* renamed from: FM */
            public MPWebView mo81421FM() {
                return MPWebView.this;
            }

            @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
            /* renamed from: JM */
            public void mo81426JM(String str3, String str4) {
                AbstractC19074t.m100208f(str3, "action");
                super.mo81426JM(str3, str4);
                if (str4 != null && str4.length() != 0) {
                    this.f74898a1 = true;
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2 = new JSONObject(str4);
                    } catch (JSONException unused) {
                    }
                    String str5 = optString;
                    if (str5 != null && str5.length() != 0) {
                        jSONObject2.put("uid", optString);
                    }
                    jSONObject2.put("showDialogConfirm", false);
                    if (MPWebView.this.m86816yO().m150312W0(str3)) {
                        MPWebView.this.m81325fS(str3, jSONObject2, str2);
                    } else {
                        MPWebView.this.m81326gS(str3, jSONObject2, str2);
                    }
                }
            }

            @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
            /* renamed from: KM */
            public void mo81424KM(String str3, boolean z11, boolean z12, String str4) {
                AbstractC19074t.m100208f(str3, "appId");
                super.mo81424KM(str3, z11, z12, str4);
                if (str4 != null && str4.length() != 0) {
                    this.f74898a1 = true;
                    if (z11) {
                        mo87351L0(str, str4);
                    } else {
                        C30933c0.m150273m0(MPWebView.this.m86816yO(), WebAppInterface.ERROR_CODE_USER_REJECTED_REQUEST, "The user rejected! (dismissed the bottom sheet)", str, null, str2, 8, null);
                    }
                }
            }

            @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView, zf0.InterfaceC31826c
            /* renamed from: yo */
            public void mo81422yo(String str3) {
                Map map;
                super.mo81422yo(str3);
                if (str3 != null && str3.length() != 0) {
                    map = MPWebView.this.f74846o2;
                    map.put(str, str3);
                }
            }

            @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
            /* renamed from: zM */
            public void mo81423zM(boolean z11) {
                super.mo81423zM(z11);
                if (!this.f74898a1 && !z11) {
                    C30933c0.m150273m0(MPWebView.this.m86816yO(), WebAppInterface.ERROR_CODE_USER_REJECTED_REQUEST, "The user rejected! (dismissed the bottom sheet)", str, null, str2, 8, null);
                }
            }
        }, this.f74828W1, str, jSONObject, (String) this.f74846o2.get(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: UO */
    public void mo81382UO(int i11, String str, String str2) {
        super.mo81382UO(i11, str, str2);
        if (AbstractC19074t.m100204b(m86721DO(), str2)) {
            mo81369KN();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        ZaloView zaloView;
        super.mo37712VJ();
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            zaloView = m92662fJ.m93012K0();
        } else {
            zaloView = null;
        }
        m81323dS().m89673o(zaloView);
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: YQ */
    public void mo81383YQ(C21368b c21368b) {
        AbstractC19074t.m100208f(c21368b, "jumpViewState");
        super.mo81383YQ(c21368b);
        m81324eS();
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        Object obj;
        ZWebView m86724FO;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        ZWebView m86724FO2 = m86724FO();
        if (m86724FO2 != null) {
            m86724FO2.setBackgroundColor(0);
        }
        if (Build.VERSION.SDK_INT >= 26 && (m86724FO = m86724FO()) != null) {
            m86724FO.setRendererPriorityPolicy(2, false);
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("EXTRA_MINI_PROGRAM")) {
            Bundle m92642L32 = m92642L3();
            if (m92642L32 != null) {
                obj = m92642L32.get("EXTRA_MINI_PROGRAM");
            } else {
                obj = null;
            }
            C19609h c19609h = (C19609h) obj;
            mo81385cR(c19609h);
            if (c19609h != null && c19609h.m102622p()) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 9001);
        bVar.m124119a().m124115b(this, 9009);
        bVar.m124119a().m124115b(this, 9010);
        bVar.m124119a().m124115b(this, 9011);
        Bundle m92642L33 = m92642L3();
        if (m92642L33 != null && m92642L33.containsKey("SHOW_STORE_FROM_MA")) {
            if (m92676n2() instanceof ZaloLauncherActivity) {
                AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.zviews.vv
                    @Override // java.lang.Runnable
                    public final void run() {
                        MPWebView.m81334kS(MPWebView.this);
                    }
                }, 300L);
            }
            Bundle m92642L34 = m92642L3();
            if (m92642L34 != null) {
                m92642L34.remove("SHOW_STORE_FROM_MA");
            }
        }
        m81352tS();
    }

    /* renamed from: ZR */
    public final InterfaceC1764d0 m81384ZR() {
        return this.f74836e2;
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: cR */
    public void mo81385cR(C19609h c19609h) {
        String str;
        m86816yO().m150330e2(c19609h);
        this.f74828W1 = c19609h;
        C16789g m81323dS = m81323dS();
        String str2 = null;
        if (c19609h != null) {
            str = c19609h.m102616j();
        } else {
            str = null;
        }
        m81323dS.m89675q(str);
        if (c19609h != null) {
            str2 = c19609h.m102620n();
        }
        m81323dS.m89676r(str2);
        if (c19609h == null) {
            return;
        }
        MPLoadingView mPLoadingView = this.f74826U1;
        if (mPLoadingView != null) {
            mPLoadingView.setMPInfo(c19609h);
        }
        if (this.f74835d2) {
            m81322cS().m81682NM(this.f74828W1);
        }
        if (m92676n2() instanceof WebViewMPActivity) {
            InterfaceC27218a m92676n2 = m92676n2();
            AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type com.zing.zalo.ui.WebViewMPActivity");
            ((WebViewMPActivity) m92676n2).m57001H5(c19609h);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: eJ */
    public String mo81386eJ() {
        String m102616j;
        C19609h c19609h = this.f74828W1;
        if (c19609h == null || (m102616j = c19609h.m102616j()) == null) {
            return super.mo81386eJ();
        }
        return m102616j;
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: eP */
    public boolean mo81387eP() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: fP */
    public boolean mo81388fP() {
        return this.f74830Y1;
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: fQ */
    protected boolean mo81389fQ() {
        m81324eS();
        m86731NO();
        if (!(this.f74825T1 instanceof MPNormalActionBar)) {
            return false;
        }
        String m86810wO = m86810wO();
        if (m86810wO.length() == 0) {
            m86810wO = AbstractC23136l9.m118743r0(AbstractC8020f0.app_name);
            AbstractC19074t.m100207e(m86810wO, "getString(...)");
        }
        if (m86800sO() < 0 || m86800sO() >= 400) {
            m86810wO = AbstractC23136l9.m118743r0(AbstractC8020f0.app_name);
            AbstractC19074t.m100207e(m86810wO, "getString(...)");
        }
        if (TextUtils.isEmpty(m86810wO)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        AbstractC19074t.m100207e(locale, "ROOT");
        String lowerCase = m86810wO.toLowerCase(locale);
        AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
        if (AbstractC19074t.m100204b("about:blank", lowerCase)) {
            return false;
        }
        if ((this.f74825T1 instanceof MPNormalActionBar) && !TextUtils.isEmpty(m86810wO)) {
            AbstractC19074t.m100207e(locale, "ROOT");
            String lowerCase2 = m86810wO.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase2, "toLowerCase(...)");
            String m86782mO = m86782mO();
            AbstractC19074t.m100207e(locale, "ROOT");
            String lowerCase3 = m86782mO.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase3, "toLowerCase(...)");
            if (!AbstractC19074t.m100204b(lowerCase2, lowerCase3)) {
                m86817yQ(m86810wO);
                MiniProgramActionBar miniProgramActionBar = this.f74825T1;
                AbstractC19074t.m100206d(miniProgramActionBar, "null cannot be cast to non-null type com.zing.zalo.ui.widget.mini.program.actionbar.MPNormalActionBar");
                ((MPNormalActionBar) miniProgramActionBar).setTitle(m86810wO);
            }
        }
        m86809vQ(m86810wO);
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        String m102616j;
        m81323dS().m89669f(EnumC3143a.f13269v);
        if (m92676n2() instanceof ZaloLauncherActivity) {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null && m92662fJ.m93018M0() > 1) {
                super.finish();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 67108864);
            C17487o0 m92662fJ2 = m92662fJ();
            if (m92662fJ2 != null) {
                m92662fJ2.m93069k2(MainTabView.class, bundle, 0, true);
                return;
            }
            return;
        }
        C19609h c19609h = this.f74828W1;
        if (c19609h != null && (m102616j = c19609h.m102616j()) != null) {
            C16786d.a.m89644c(C16786d.Companion, null, 1, null).m89640g0(m102616j);
        }
        super.finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MPWebView";
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: nO */
    public String mo81390nO() {
        C19609h c19609h = this.f74828W1;
        if (c19609h != null) {
            return c19609h.m102616j();
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        long j11;
        if (i11 == 13) {
            if (this.f74841j2 == null) {
                return;
            }
            if (i12 == -1 && intent != null && intent.hasExtra("extra_selected_profiles")) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles");
                if (parcelableArrayListExtra == null) {
                    parcelableArrayListExtra = new ArrayList();
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = parcelableArrayListExtra.iterator();
                while (it.hasNext()) {
                    String mo2478b = ((InviteContactProfile) it.next()).mo2478b();
                    AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                    arrayList.add(mo2478b);
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C14546l());
                String mo81390nO = mo81390nO();
                if (mo81390nO != null) {
                    j11 = Long.parseLong(mo81390nO);
                } else {
                    j11 = 1;
                }
                c0766k.m1846g0(arrayList, j11, 1);
                return;
            }
            String m141899N0 = AbstractC28207v1.m141899N0(-101, "User rejected", "action.mp.open.profile.picker");
            AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
            m86783mP(m141899N0, this.f74841j2);
            this.f74841j2 = null;
            return;
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19147a m110743a;
        InterfaceC27218a m92676n2;
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.mp_wv_exit_id) {
            if (this.f74830Y1) {
                m81323dS().m89669f(EnumC3143a.f13266s);
                if ((m92676n2() instanceof WebViewMPActivity) && (m92676n2 = m92676n2()) != null) {
                    m92676n2.finish();
                    return;
                }
                return;
            }
            C21368b m86778iO = m86778iO();
            if (m86778iO != null && (m110743a = m86778iO.m110743a()) != null && m110743a.m100474f() == 2) {
                m86775gR();
                return;
            } else {
                if (!m86816yO().m150343l2()) {
                    m81323dS().m89669f(EnumC3143a.f13266s);
                    m86741TN();
                    return;
                }
                return;
            }
        }
        if (id2 == AbstractC6918a0.mp_wv_menu_id) {
            m81354uS();
            return;
        }
        if (id2 == AbstractC6918a0.btn_exit_loading_view) {
            if ((this.f74826U1 instanceof MPLoadingViewFull) && this.f74833b2 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                Long l11 = this.f74833b2;
                AbstractC19074t.m100205c(l11);
                if (currentTimeMillis - l11.longValue() < 500) {
                    return;
                }
            }
            m81323dS().m89669f(EnumC3143a.f13265r);
            finish();
            return;
        }
        if (id2 == AbstractC6918a0.mp_wv_back_id) {
            m86811wP();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19147a m110743a;
        if (i11 == 4) {
            if (this.f74830Y1) {
                finish();
                return true;
            }
            if (!canGoBack()) {
                C21368b m86778iO = m86778iO();
                if (m86778iO != null && (m110743a = m86778iO.m110743a()) != null && m110743a.m100474f() == 2) {
                    m86775gR();
                    return true;
                }
                if (this.f74832a2) {
                    if (m86816yO().m150343l2()) {
                        return true;
                    }
                    m81323dS().m89669f(EnumC3143a.f13268u);
                    finish();
                    return true;
                }
                this.f74832a2 = true;
                Toast.makeText(getContext(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_confirm_to_exit), 0).show();
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.wv
                    @Override // java.lang.Runnable
                    public final void run() {
                        MPWebView.m81332jS(MPWebView.this);
                    }
                }, 2000L);
                return true;
            }
            return super.onKeyUp(i11, keyEvent);
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        String str;
        String m102616j;
        super.onResume();
        WebViewMPActivity.C10961a c10961a = WebViewMPActivity.Companion;
        C19609h c19609h = this.f74828W1;
        if (c19609h != null) {
            str = c19609h.m102616j();
        } else {
            str = null;
        }
        c10961a.m57013b(str + " onResume");
        C16789g.m89661n(m81323dS(), null, 1, null);
        mo81385cR(this.f74828W1);
        m81324eS();
        m81295AS();
        m81312RR();
        C19609h c19609h2 = this.f74828W1;
        if (c19609h2 != null && (m92676n2() instanceof WebViewMPActivity)) {
            InterfaceC27218a m92676n2 = m92676n2();
            AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type com.zing.zalo.ui.WebViewMPActivity");
            WebViewMPActivity webViewMPActivity = (WebViewMPActivity) m92676n2;
            webViewMPActivity.m57010u5(c19609h2.m102616j());
            webViewMPActivity.m57007s5(c19609h2.m102616j());
            webViewMPActivity.m57001H5(c19609h2);
        }
        C19609h c19609h3 = this.f74828W1;
        if (c19609h3 != null && (m102616j = c19609h3.m102616j()) != null) {
            C30946k.Companion.m150528a().m150523t(m102616j);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, lv.InterfaceC22653a
    /* renamed from: ow */
    public void mo81391ow(String str, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(str, "maSchemesFilePath");
        AbstractC19074t.m100208f(interfaceC18509p, "callback");
        if (m86816yO().m150324c0(str)) {
            interfaceC18509p.mo240pC(m86816yO().m150278B0(str), m86816yO().m150276A0(str));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        ZaloView m93012K0;
        C19609h c19609h;
        String m102616j;
        Bundle bundle;
        InterfaceC27218a m92676n2;
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 != 9001) {
            C19602a c19602a = null;
            String str = null;
            switch (i11) {
                case 9009:
                    Object obj = objArr[0];
                    if (obj instanceof C19602a) {
                        c19602a = (C19602a) obj;
                    }
                    if (c19602a == null) {
                        return;
                    }
                    m86816yO().m150336i0(c19602a);
                    return;
                case 9010:
                    Object obj2 = objArr[0];
                    if (obj2 instanceof Bundle) {
                        bundle = (Bundle) obj2;
                    } else {
                        bundle = null;
                    }
                    if (bundle == null) {
                        return;
                    }
                    String string = bundle.getString("EXTRA_OPEN_FROM_MA_ID");
                    C19609h c19609h2 = this.f74828W1;
                    if (c19609h2 != null) {
                        str = c19609h2.m102616j();
                    }
                    if (AbstractC19074t.m100204b(string, str) && (m92676n2 = m92676n2()) != null) {
                        m92676n2.mo35573l4(MPWebView.class, bundle, 0, true);
                        return;
                    }
                    return;
                case 9011:
                    try {
                        C17487o0 m92662fJ = m92662fJ();
                        if (m92662fJ != null && (m93012K0 = m92662fJ.m93012K0()) != null) {
                            if (AbstractC19074t.m100204b(this, m93012K0)) {
                                Object obj3 = objArr[0];
                                AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.String");
                                m81348rS((String) obj3);
                            } else if ((m92662fJ() instanceof C16790h) && (c19609h = this.f74828W1) != null && (m102616j = c19609h.m102616j()) != null) {
                                C17487o0 m92662fJ2 = m92662fJ();
                                AbstractC19074t.m100206d(m92662fJ2, "null cannot be cast to non-null type com.zing.zalo.webview.MiniProgramViewManager");
                                ((C16790h) m92662fJ2).m89695s2(m102616j, true);
                            }
                        }
                        return;
                    } catch (Exception e11) {
                        e11.getMessage();
                        return;
                    }
                default:
                    return;
            }
        }
        try {
            Object obj4 = objArr[0];
            AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type com.zing.zalo.libwebview.model.h5.MiniProgramInfo");
            m81348rS(((C19609h) obj4).m102620n());
        } catch (Exception unused) {
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: xN */
    public void mo81392xN(EnumC3144b enumC3144b) {
        AbstractC19074t.m100208f(enumC3144b, "startupEvent");
        m81323dS().m89667d(enumC3144b);
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: zN */
    public boolean mo81393zN() {
        if (canGoBack()) {
            m86799ra();
            return true;
        }
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null && m92662fJ.m93018M0() > 1) {
            return false;
        }
        m81323dS().m89669f(EnumC3143a.f13267t);
        m86739SN();
        return true;
    }
}
