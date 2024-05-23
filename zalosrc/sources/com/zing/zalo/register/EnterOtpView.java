package com.zing.zalo.register;

import ae.C0766k;
import am.AbstractC0924m0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import au.AbstractC2351i;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.google.android.gms.common.api.Status;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.WebInAppView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.receiver.SMSReceiver;
import com.zing.zalo.register.EnterOtpView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.OtpField;
import com.zing.zalo.zdesign.component.inputfield.EnumC17007i;
import com.zing.zalo.zdesign.component.inputfield.OtpEdittext;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import cz.C17667v0;
import cz.C17670w0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23153n4;
import me0.AbstractC23216t1;
import me0.C23055e5;
import me0.C23212s8;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p140ev.C18613b;
import p207he.AbstractC20019m;
import p248iy.AbstractC20887g;
import p342m6.AbstractC22888j;
import p342m6.InterfaceC22880f;
import p342m6.InterfaceC22882g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p472r4.AbstractC25644a;
import p542ub.InterfaceC27218a;
import p649xl.C29867j3;
import pm0.C24848g0;
import ui0.C27280g;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes4.dex */
public final class EnterOtpView extends SlidableZaloView {
    public static final C9285b Companion = new C9285b(null);

    /* renamed from: P0 */
    private C29867j3 f49235P0;

    /* renamed from: T0 */
    private int f49239T0;

    /* renamed from: U0 */
    private CountDownTimer f49240U0;

    /* renamed from: W0 */
    private BroadcastReceiver f49242W0;

    /* renamed from: X0 */
    private SMSReceiver f49243X0;

    /* renamed from: Y0 */
    private long f49244Y0;

    /* renamed from: Z0 */
    private int f49245Z0;

    /* renamed from: c1 */
    private JSONObject f49248c1;

    /* renamed from: e1 */
    private boolean f49250e1;

    /* renamed from: h1 */
    private int f49253h1;

    /* renamed from: i1 */
    private boolean f49254i1;

    /* renamed from: Q0 */
    private String f49236Q0 = "";

    /* renamed from: R0 */
    private String f49237R0 = "";

    /* renamed from: S0 */
    private String f49238S0 = "";

    /* renamed from: V0 */
    private final String f49241V0 = "([0-9]{4,8})";

    /* renamed from: a1 */
    private EnumC9284a f49246a1 = EnumC9284a.f49259t;

    /* renamed from: b1 */
    private long f49247b1 = System.currentTimeMillis();

    /* renamed from: d1 */
    private String f49249d1 = "";

    /* renamed from: f1 */
    private String f49251f1 = "";

    /* renamed from: g1 */
    private Handler f49252g1 = new Handler(Looper.getMainLooper());

    /* renamed from: j1 */
    private Runnable f49255j1 = new Runnable() { // from class: cz.m
        public /* synthetic */ RunnableC17634m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            EnterOtpView.m49724MM(EnterOtpView.this);
        }
    };

    /* renamed from: com.zing.zalo.register.EnterOtpView$a */
    /* loaded from: classes4.dex */
    public static final class EnumC9284a extends Enum {
        public static final a Companion;

        /* renamed from: q */
        public static final EnumC9284a f49256q = new EnumC9284a("TYPE_ACTIVE_REJECT_CALL", 0, 1);

        /* renamed from: r */
        public static final EnumC9284a f49257r = new EnumC9284a("TYPE_ACTIVE_CALL", 1, 2);

        /* renamed from: s */
        public static final EnumC9284a f49258s = new EnumC9284a("TYPE_ACTIVE_SMS", 2, 3);

        /* renamed from: t */
        public static final EnumC9284a f49259t = new EnumC9284a("TYPE_UNKNOWN", 3, 0);

        /* renamed from: u */
        private static final /* synthetic */ EnumC9284a[] f49260u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f49261v;

        /* renamed from: p */
        private final int f49262p;

        /* renamed from: com.zing.zalo.register.EnterOtpView$a$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final EnumC9284a m49776a(int i11) {
                try {
                    for (EnumC9284a enumC9284a : EnumC9284a.values()) {
                        if (enumC9284a.m49775c() == i11) {
                            return enumC9284a;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (Exception unused) {
                    return EnumC9284a.f49259t;
                }
            }
        }

        static {
            EnumC9284a[] m49774b = m49774b();
            f49260u = m49774b;
            f49261v = AbstractC30166b.m148796a(m49774b);
            Companion = new a(null);
        }

        private EnumC9284a(String str, int i11, int i12) {
            super(str, i11);
            this.f49262p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC9284a[] m49774b() {
            return new EnumC9284a[]{f49256q, f49257r, f49258s, f49259t};
        }

        public static EnumC9284a valueOf(String str) {
            return (EnumC9284a) Enum.valueOf(EnumC9284a.class, str);
        }

        public static EnumC9284a[] values() {
            return (EnumC9284a[]) f49260u.clone();
        }

        /* renamed from: c */
        public final int m49775c() {
            return this.f49262p;
        }
    }

    /* renamed from: com.zing.zalo.register.EnterOtpView$b */
    /* loaded from: classes4.dex */
    public static final class C9285b {
        private C9285b() {
        }

        public /* synthetic */ C9285b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.register.EnterOtpView$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C9286c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49263a;

        static {
            int[] iArr = new int[EnumC9284a.values().length];
            try {
                iArr[EnumC9284a.f49256q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9284a.f49257r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9284a.f49258s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f49263a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.register.EnterOtpView$d */
    /* loaded from: classes4.dex */
    public static final class C9287d implements InterfaceC20094a {
        C9287d() {
        }

        /* renamed from: h */
        public static final void m49782h(EnterOtpView enterOtpView) {
            AbstractC19074t.m100208f(enterOtpView, "this$0");
            enterOtpView.m49729SM();
            enterOtpView.m49754mN(enterOtpView.f49245Z0);
        }

        /* renamed from: i */
        public static final void m49783i(EnterOtpView enterOtpView, String str) {
            AbstractC19074t.m100208f(enterOtpView, "this$0");
            C29867j3 c29867j3 = enterOtpView.f49235P0;
            C29867j3 c29867j32 = null;
            if (c29867j3 == null) {
                AbstractC19074t.m100223u("binding");
                c29867j3 = null;
            }
            c29867j3.f138247u.m90595c(true);
            C29867j3 c29867j33 = enterOtpView.f49235P0;
            if (c29867j33 == null) {
                AbstractC19074t.m100223u("binding");
                c29867j33 = null;
            }
            c29867j33.f138247u.setFieldState(EnumC17007i.ERROR);
            C29867j3 c29867j34 = enterOtpView.f49235P0;
            if (c29867j34 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29867j32 = c29867j34;
            }
            OtpField otpField = c29867j32.f138247u;
            AbstractC19074t.m100205c(str);
            otpField.setErrorText(str);
        }

        /* renamed from: j */
        public static final void m49784j(EnterOtpView enterOtpView) {
            Spanned fromHtml;
            AbstractC19074t.m100208f(enterOtpView, "this$0");
            C29867j3 c29867j3 = enterOtpView.f49235P0;
            C29867j3 c29867j32 = null;
            if (c29867j3 == null) {
                AbstractC19074t.m100223u("binding");
                c29867j3 = null;
            }
            c29867j3.f138251y.setVisibility(8);
            C29867j3 c29867j33 = enterOtpView.f49235P0;
            if (c29867j33 == null) {
                AbstractC19074t.m100223u("binding");
                c29867j33 = null;
            }
            c29867j33.f138243q.setVisibility(0);
            C29867j3 c29867j34 = enterOtpView.f49235P0;
            if (c29867j34 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29867j32 = c29867j34;
            }
            RobotoTextView robotoTextView = c29867j32.f138250x;
            if (Build.VERSION.SDK_INT >= 24) {
                fromHtml = Html.fromHtml(AbstractC23304d.f113454x0, 63);
            } else {
                fromHtml = Html.fromHtml(AbstractC23304d.f113454x0);
            }
            robotoTextView.setText(fromHtml);
            enterOtpView.m49754mN(enterOtpView.f49245Z0);
        }

        /* renamed from: k */
        public static final void m49785k(EnterOtpView enterOtpView, C20096c c20096c) {
            AbstractC19074t.m100208f(enterOtpView, "this$0");
            enterOtpView.m92639EK(2, c20096c.m104492d());
        }

        /* renamed from: l */
        public static final void m49786l(EnterOtpView enterOtpView, C20096c c20096c) {
            AbstractC19074t.m100208f(enterOtpView, "this$0");
            C29867j3 c29867j3 = enterOtpView.f49235P0;
            C29867j3 c29867j32 = null;
            if (c29867j3 == null) {
                AbstractC19074t.m100223u("binding");
                c29867j3 = null;
            }
            c29867j3.f138247u.m90595c(true);
            C29867j3 c29867j33 = enterOtpView.f49235P0;
            if (c29867j33 == null) {
                AbstractC19074t.m100223u("binding");
                c29867j33 = null;
            }
            c29867j33.f138247u.setFieldState(EnumC17007i.ERROR);
            C29867j3 c29867j34 = enterOtpView.f49235P0;
            if (c29867j34 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29867j32 = c29867j34;
            }
            OtpField otpField = c29867j32.f138247u;
            AbstractC19074t.m100205c(c20096c);
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            otpField.setErrorText(m104492d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:            if (r1 != null) goto L65;     */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:            gg0.AbstractC19444a.m101697e(new cz.RunnableC17666v());     */
        /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:            return;     */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:            if (r1.intValue() != 2003) goto L68;     */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:            gg0.AbstractC19444a.m101697e(new cz.RunnableC17663u());     */
        /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:            return;     */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:            if (r1.intValue() == 2021) goto L62;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            String str;
            EnterOtpView.this.m78954jL();
            try {
                EnterOtpView enterOtpView = EnterOtpView.this;
                if (AbstractC23216t1.m119643h(enterOtpView.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: cz.s
                    public /* synthetic */ C17657s() {
                    }

                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str2) {
                        EnterOtpView.C9287d.m49783i(EnterOtpView.this, str2);
                    }
                })) {
                    return;
                }
                Integer num = null;
                if (c20096c != null) {
                    str = c20096c.m104490b();
                } else {
                    str = null;
                }
                JSONObject jSONObject = new JSONObject(String.valueOf(str)).getJSONObject("data");
                EnterOtpView enterOtpView2 = EnterOtpView.this;
                String optString = jSONObject.optString("sessionToken", "");
                AbstractC19074t.m100207e(optString, "optString(...)");
                enterOtpView2.f49238S0 = optString;
                EnterOtpView.this.f49245Z0 = jSONObject.optInt("activationNumber", 6);
                if (c20096c != null) {
                    num = Integer.valueOf(c20096c.m104491c());
                }
                if (num != null && num.intValue() == 2012) {
                    AbstractC23153n4.m119105S(jSONObject, false);
                    AbstractC19444a.m101697e(new Runnable() { // from class: cz.t
                        public /* synthetic */ RunnableC17660t() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            EnterOtpView.C9287d.m49784j(EnterOtpView.this);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                EnterOtpView.this.m78954jL();
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                EnterOtpView.this.f49245Z0 = jSONObject.optInt("activationNumber");
                EnterOtpView enterOtpView = EnterOtpView.this;
                String optString = jSONObject.optString("sessionToken");
                AbstractC19074t.m100207e(optString, "optString(...)");
                enterOtpView.f49238S0 = optString;
                EnterOtpView.this.f49246a1 = EnumC9284a.Companion.m49776a(jSONObject.optInt("activationType"));
                EnterOtpView enterOtpView2 = EnterOtpView.this;
                enterOtpView2.m49752lN(enterOtpView2.f49246a1);
                AbstractC23153n4.m119105S(jSONObject, true);
                AbstractC19444a.m101697e(new Runnable() { // from class: cz.w
                    public /* synthetic */ RunnableC17669w() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EnterOtpView.C9287d.m49782h(EnterOtpView.this);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.register.EnterOtpView$e */
    /* loaded from: classes4.dex */
    public static final class CountDownTimerC9288e extends CountDownTimer {

        /* renamed from: com.zing.zalo.register.EnterOtpView$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ EnterOtpView f49266q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(EnterOtpView enterOtpView) {
                super(0);
                this.f49266q = enterOtpView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m49791a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m49791a() {
                AbstractC20887g.m109217D(510032, null, 2, null);
                C29867j3 c29867j3 = this.f49266q.f49235P0;
                if (c29867j3 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29867j3 = null;
                }
                c29867j3.f138247u.setFieldState(EnumC17007i.NORMAL);
                if (C23055e5.m118273h(false, 1, null)) {
                    this.f49266q.m49770QM();
                    ToastUtils.m89274v(this.f49266q, ToastUtils.EnumC16738b.RESENT_OTP);
                } else {
                    ToastUtils.m89274v(this.f49266q, ToastUtils.EnumC16738b.DISCONNECTED);
                }
            }
        }

        /* renamed from: com.zing.zalo.register.EnterOtpView$e$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final b f49267q = new b();

            b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m49792a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m49792a() {
            }
        }

        CountDownTimerC9288e(long j11) {
            super(j11, 1000L);
        }

        /* renamed from: c */
        public static final void m49789c(EnterOtpView enterOtpView) {
            int i11;
            AbstractC19074t.m100208f(enterOtpView, "this$0");
            C29867j3 c29867j3 = enterOtpView.f49235P0;
            if (c29867j3 == null) {
                AbstractC19074t.m100223u("binding");
                c29867j3 = null;
            }
            RobotoTextView robotoTextView = c29867j3.f138251y;
            robotoTextView.setLinkTextColor(C23212s8.m119606n(AbstractC2807a.cta_link));
            if (enterOtpView.f49246a1 == EnumC9284a.f49257r) {
                i11 = AbstractC8020f0.str_call_me_back;
            } else {
                i11 = AbstractC8020f0.resend;
            }
            String m118743r0 = AbstractC23136l9.m118743r0(i11);
            AbstractC19074t.m100205c(m118743r0);
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_register_enter_verification_code_hint_request, m118743r0);
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            robotoTextView.setText(EnterOtpView.m49731UM(enterOtpView, m118746s0, m118746s0.length() - m118743r0.length(), m118746s0.length(), false, new a(enterOtpView), 8, null), TextView.BufferType.SPANNABLE);
        }

        /* renamed from: d */
        public static final void m49790d(EnterOtpView enterOtpView, long j11) {
            String m118743r0;
            long j12;
            StringBuilder sb2;
            AbstractC19074t.m100208f(enterOtpView, "this$0");
            C29867j3 c29867j3 = enterOtpView.f49235P0;
            if (c29867j3 == null) {
                AbstractC19074t.m100223u("binding");
                c29867j3 = null;
            }
            RobotoTextView robotoTextView = c29867j3.f138251y;
            robotoTextView.setLinkTextColor(C23212s8.m119606n(AbstractC2807a.text_disabled));
            if (enterOtpView.f49246a1 == EnumC9284a.f49257r) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_me_back);
                j12 = j11 / 1000;
                sb2 = new StringBuilder();
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.resend);
                j12 = j11 / 1000;
                sb2 = new StringBuilder();
            }
            sb2.append(m118743r0);
            sb2.append(" (");
            sb2.append(j12);
            sb2.append("s)");
            String sb3 = sb2.toString();
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_register_enter_verification_code_hint_request, sb3);
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            robotoTextView.setText(EnterOtpView.m49731UM(enterOtpView, m118746s0, m118746s0.length() - sb3.length(), m118746s0.length(), false, b.f49267q, 8, null), TextView.BufferType.SPANNABLE);
            robotoTextView.setVisibility(0);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            AbstractC19444a.m101697e(new Runnable() { // from class: cz.y
                public /* synthetic */ RunnableC17675y() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EnterOtpView.CountDownTimerC9288e.m49789c(EnterOtpView.this);
                }
            });
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
            AbstractC19444a.m101697e(new Runnable() { // from class: cz.x

                /* renamed from: q */
                public final /* synthetic */ long f89672q;

                public /* synthetic */ RunnableC17672x(long j112) {
                    r2 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EnterOtpView.CountDownTimerC9288e.m49790d(EnterOtpView.this, r2);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.register.EnterOtpView$f */
    /* loaded from: classes4.dex */
    public static final class C9289f extends ClickableSpan {

        /* renamed from: p */
        final /* synthetic */ InterfaceC18494a f49268p;

        C9289f(InterfaceC18494a interfaceC18494a) {
            this.f49268p = interfaceC18494a;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "textView");
            this.f49268p.mo12V4();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.zing.zalo.register.EnterOtpView$g */
    /* loaded from: classes4.dex */
    public static final class C9290g implements TextWatcher {

        /* renamed from: q */
        final /* synthetic */ OtpField f49270q;

        C9290g(OtpField otpField) {
            this.f49270q = otpField;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C29867j3 c29867j3 = EnterOtpView.this.f49235P0;
            if (c29867j3 == null) {
                AbstractC19074t.m100223u("binding");
                c29867j3 = null;
            }
            c29867j3.f138247u.setErrorText("");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            boolean z11;
            if (charSequence != null) {
                EnterOtpView enterOtpView = EnterOtpView.this;
                OtpField otpField = this.f49270q;
                C29867j3 c29867j3 = enterOtpView.f49235P0;
                if (c29867j3 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29867j3 = null;
                }
                Button button = c29867j3.f138245s;
                if (charSequence.length() == otpField.getEditText().getMaxLength()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                button.setEnabled(z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.register.EnterOtpView$h */
    /* loaded from: classes4.dex */
    public static final class C9291h extends AbstractC19075u implements InterfaceC18494a {
        C9291h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49793a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49793a() {
            AbstractC20887g.m109217D(510033, null, 2, null);
            C17487o0 m92662fJ = EnterOtpView.this.m92662fJ();
            if (m92662fJ != null) {
                C17667v0.f89659a.m93647d(EnterOtpView.this.m92676n2());
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_URL", C17670w0.f89662a.m93655g());
                m92662fJ.m93069k2(WebInAppView.class, bundle, 1, true);
            }
        }
    }

    /* renamed from: com.zing.zalo.register.EnterOtpView$i */
    /* loaded from: classes4.dex */
    public static final class C9292i extends AbstractC19075u implements InterfaceC18505l {
        C9292i() {
            super(1);
        }

        /* renamed from: a */
        public final void m49794a(Void r42) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
            Context m35500c = MainApplication.Companion.m35500c();
            BroadcastReceiver broadcastReceiver = EnterOtpView.this.f49242W0;
            AbstractC19074t.m100206d(broadcastReceiver, "null cannot be cast to non-null type android.content.BroadcastReceiver");
            AbstractC2351i.m12327a(m35500c, broadcastReceiver, intentFilter, true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m49794a((Void) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.register.EnterOtpView$j */
    /* loaded from: classes4.dex */
    public static final class C9293j implements InterfaceC20094a {
        C9293j() {
        }

        /* renamed from: f */
        public static final void m49798f(EnterOtpView enterOtpView, JSONObject jSONObject, JSONObject jSONObject2, C9293j c9293j) {
            String str;
            AbstractC19074t.m100208f(enterOtpView, "this$0");
            AbstractC19074t.m100208f(c9293j, "this$1");
            C17667v0.f89659a.m93647d(enterOtpView.m92676n2());
            if (enterOtpView.f49239T0 == 1) {
                AbstractC0924m0.m2972Cm(1);
                if (jSONObject == null || (str = jSONObject.toString()) == null) {
                    str = "";
                }
                enterOtpView.m49737bN(str);
                return;
            }
            C24848g0 c24848g0 = null;
            if (jSONObject2 != null) {
                AbstractC0924m0.m2972Cm(2);
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_WEB_URL", jSONObject2.getString("secureUrl"));
                bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93606y);
                bundle.putBoolean("EXTRA_ALLOW_BACK", false);
                bundle.putString("EXTRA_PHONE_NUMBER", enterOtpView.f49236Q0);
                bundle.putString("EXTRA_SESSION_TOKEN", enterOtpView.f49237R0);
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                C17487o0 m92662fJ = enterOtpView.m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93069k2(H5EkycView.class, bundle, 1, true);
                    c24848g0 = C24848g0.f119245a;
                }
            }
            if (c24848g0 == null) {
                enterOtpView.m49738cN();
            }
        }

        /* renamed from: g */
        public static final void m49799g(EnterOtpView enterOtpView, String str) {
            AbstractC19074t.m100208f(enterOtpView, "this$0");
            C29867j3 c29867j3 = enterOtpView.f49235P0;
            C29867j3 c29867j32 = null;
            if (c29867j3 == null) {
                AbstractC19074t.m100223u("binding");
                c29867j3 = null;
            }
            c29867j3.f138247u.m90595c(true);
            C29867j3 c29867j33 = enterOtpView.f49235P0;
            if (c29867j33 == null) {
                AbstractC19074t.m100223u("binding");
                c29867j33 = null;
            }
            c29867j33.f138247u.setFieldState(EnumC17007i.ERROR);
            C29867j3 c29867j34 = enterOtpView.f49235P0;
            if (c29867j34 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29867j32 = c29867j34;
            }
            OtpField otpField = c29867j32.f138247u;
            AbstractC19074t.m100205c(str);
            otpField.setErrorText(str);
        }

        /* renamed from: h */
        public static final void m49800h(C20096c c20096c, EnterOtpView enterOtpView) {
            Integer num;
            AbstractC19074t.m100208f(enterOtpView, "this$0");
            C29867j3 c29867j3 = null;
            if (c20096c != null) {
                num = Integer.valueOf(c20096c.m104491c());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 2038) {
                if (enterOtpView.f49253h1 >= 4) {
                    C29867j3 c29867j32 = enterOtpView.f49235P0;
                    if (c29867j32 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29867j32 = null;
                    }
                    c29867j32.f138247u.m90595c(true);
                    C29867j3 c29867j33 = enterOtpView.f49235P0;
                    if (c29867j33 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29867j33 = null;
                    }
                    c29867j33.f138247u.setFieldState(EnumC17007i.ERROR);
                    C29867j3 c29867j34 = enterOtpView.f49235P0;
                    if (c29867j34 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29867j3 = c29867j34;
                    }
                    OtpField otpField = c29867j3.f138247u;
                    String m104492d = c20096c.m104492d();
                    AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                    otpField.setErrorText(m104492d);
                    return;
                }
                enterOtpView.f49252g1.removeCallbacks(enterOtpView.f49255j1);
                enterOtpView.f49252g1.postDelayed(enterOtpView.f49255j1, AbstractC23304d.f113391h1);
                return;
            }
            if (num != null && num.intValue() == 2030) {
                enterOtpView.showDialog(1);
                return;
            }
            if (num != null && num.intValue() == 2020) {
                C17667v0.f89659a.m93647d(enterOtpView.m92676n2());
                C17487o0 m92662fJ = enterOtpView.m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93069k2(BannedAccountRegisterView.class, null, 1, true);
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 2042) {
                C29867j3 c29867j35 = enterOtpView.f49235P0;
                if (c29867j35 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29867j35 = null;
                }
                c29867j35.f138247u.m90595c(true);
                C29867j3 c29867j36 = enterOtpView.f49235P0;
                if (c29867j36 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29867j36 = null;
                }
                c29867j36.f138247u.setFieldState(EnumC17007i.ERROR);
                C29867j3 c29867j37 = enterOtpView.f49235P0;
                if (c29867j37 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29867j3 = c29867j37;
                }
                OtpField otpField2 = c29867j3.f138247u;
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_account_creation_limit);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(c20096c.m104491c())}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                otpField2.setErrorText(format);
                return;
            }
            if (num != null && num.intValue() == 2051) {
                C29867j3 c29867j38 = enterOtpView.f49235P0;
                if (c29867j38 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29867j38 = null;
                }
                c29867j38.f138247u.m90595c(true);
                C29867j3 c29867j39 = enterOtpView.f49235P0;
                if (c29867j39 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29867j39 = null;
                }
                c29867j39.f138247u.setFieldState(EnumC17007i.ERROR);
                C29867j3 c29867j310 = enterOtpView.f49235P0;
                if (c29867j310 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29867j3 = c29867j310;
                }
                OtpField otpField3 = c29867j3.f138247u;
                C19067n0 c19067n02 = C19067n0.f94947a;
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pwd_token_expired);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                String format2 = String.format(m118743r02, Arrays.copyOf(new Object[]{Integer.valueOf(c20096c.m104491c())}, 1));
                AbstractC19074t.m100207e(format2, "format(...)");
                otpField3.setErrorText(format2);
                return;
            }
            if (num != null && num.intValue() == 2052) {
                C29867j3 c29867j311 = enterOtpView.f49235P0;
                if (c29867j311 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29867j311 = null;
                }
                c29867j311.f138247u.m90595c(true);
                C29867j3 c29867j312 = enterOtpView.f49235P0;
                if (c29867j312 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29867j312 = null;
                }
                c29867j312.f138247u.setFieldState(EnumC17007i.ERROR);
                C29867j3 c29867j313 = enterOtpView.f49235P0;
                if (c29867j313 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29867j3 = c29867j313;
                }
                OtpField otpField4 = c29867j3.f138247u;
                C19067n0 c19067n03 = C19067n0.f94947a;
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_quota_question);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                String format3 = String.format(m118743r03, Arrays.copyOf(new Object[]{Integer.valueOf(c20096c.m104491c())}, 1));
                AbstractC19074t.m100207e(format3, "format(...)");
                otpField4.setErrorText(format3);
                return;
            }
            if (num != null && num.intValue() == 2053) {
                enterOtpView.m92639EK(2, c20096c.m104492d());
                return;
            }
            if (num == null || num.intValue() != 2003) {
                C29867j3 c29867j314 = enterOtpView.f49235P0;
                if (c29867j314 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29867j314 = null;
                }
                c29867j314.f138247u.m90595c(true);
                C29867j3 c29867j315 = enterOtpView.f49235P0;
                if (c29867j315 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29867j315 = null;
                }
                c29867j315.f138247u.setFieldState(EnumC17007i.ERROR);
                C29867j3 c29867j316 = enterOtpView.f49235P0;
                if (c29867j316 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29867j3 = c29867j316;
                }
                OtpField otpField5 = c29867j3.f138247u;
                AbstractC19074t.m100205c(c20096c);
                String m104492d2 = c20096c.m104492d();
                AbstractC19074t.m100207e(m104492d2, "getError_message(...)");
                otpField5.setErrorText(m104492d2);
                return;
            }
            enterOtpView.m92639EK(2, c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            EnterOtpView.this.m49772eN(false);
            EnterOtpView.this.m78954jL();
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("{status : 1, type: %s, platform: 0}", Arrays.copyOf(new Object[]{Integer.valueOf(EnterOtpView.this.f49246a1.m49775c())}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            AbstractC20887g.m109248z(510031, format);
            EnterOtpView enterOtpView = EnterOtpView.this;
            if (AbstractC23216t1.m119643h(enterOtpView.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: cz.z
                public /* synthetic */ C17678z() {
                }

                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    EnterOtpView.C9293j.m49799g(EnterOtpView.this, str);
                }
            })) {
                return;
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: cz.a0

                /* renamed from: q */
                public final /* synthetic */ EnterOtpView f89565q;

                public /* synthetic */ RunnableC17587a0(EnterOtpView enterOtpView2) {
                    r2 = enterOtpView2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EnterOtpView.C9293j.m49800h(C20096c.this, r2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            try {
                EnterOtpView.this.m49772eN(false);
                EnterOtpView.this.m78954jL();
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                EnterOtpView enterOtpView = EnterOtpView.this;
                JSONObject jSONObject = null;
                String str2 = "";
                if (optJSONObject != null) {
                    str = optJSONObject.optString("sessionToken", "");
                } else {
                    str = null;
                }
                if (str != null) {
                    str2 = str;
                }
                enterOtpView.f49237R0 = str2;
                long j11 = 0;
                if (optJSONObject != null) {
                    j11 = optJSONObject.optLong("sessionTTL", 0L);
                }
                if (optJSONObject != null) {
                    jSONObject = optJSONObject.optJSONObject("ekyc");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("phone_number", EnterOtpView.this.f49236Q0);
                jSONObject2.put("exist_account", EnterOtpView.this.f49239T0);
                jSONObject2.put("token_otp", EnterOtpView.this.f49237R0);
                jSONObject2.put("timeout_token_otp", System.currentTimeMillis() + j11);
                if (EnterOtpView.this.f49239T0 == 1) {
                    jSONObject2.put("data_exist_account", optJSONObject);
                }
                if (jSONObject != null) {
                    jSONObject2.put("ekyc", jSONObject);
                }
                AbstractC0924m0.m3691bf(jSONObject2.toString());
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format("{type: %s, flow: %s, time: %s,status : 0, platform: 0}", Arrays.copyOf(new Object[]{Integer.valueOf(EnterOtpView.this.f49246a1.m49775c()), Integer.valueOf(EnterOtpView.this.f49239T0), Long.valueOf((System.currentTimeMillis() - EnterOtpView.this.f49247b1) / 1000)}, 3));
                AbstractC19074t.m100207e(format, "format(...)");
                AbstractC20887g.m109248z(510031, format);
                EnterOtpView enterOtpView2 = EnterOtpView.this;
                enterOtpView2.mo70710wy(new Runnable() { // from class: cz.b0

                    /* renamed from: q */
                    public final /* synthetic */ JSONObject f89570q;

                    /* renamed from: r */
                    public final /* synthetic */ JSONObject f89571r;

                    /* renamed from: s */
                    public final /* synthetic */ EnterOtpView.C9293j f89572s;

                    public /* synthetic */ RunnableC17591b0(JSONObject optJSONObject2, JSONObject jSONObject3, EnterOtpView.C9293j this) {
                        r2 = optJSONObject2;
                        r3 = jSONObject3;
                        r4 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EnterOtpView.C9293j.m49798f(EnterOtpView.this, r2, r3, r4);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: MM */
    public static final void m49724MM(EnterOtpView enterOtpView) {
        AbstractC19074t.m100208f(enterOtpView, "this$0");
        m49757oN(enterOtpView, enterOtpView.f49251f1, false, 2, null);
    }

    /* renamed from: NM */
    private final KeyEventCallbackC17462c m49725NM() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_version_zalo_outdated);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_version_zalo_outdated_description);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a aVar = new C16972e0.a(m92689tK);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90918B(m118743r0);
        aVar.m90949z(m118743r02);
        aVar.m90945v(AbstractC2814h.ButtonMedium_Tertiary);
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_user_update_avatar_button_update_title);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        aVar.m90943t(m118743r03, new InterfaceC17463d.d() { // from class: cz.n
            public /* synthetic */ C17638n() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                EnterOtpView.m49727PM(EnterOtpView.this, interfaceC17463d, i11);
            }
        });
        aVar.m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_close);
        AbstractC19074t.m100207e(m118743r04, "getString(...)");
        aVar.m90934k(m118743r04, new InterfaceC17463d.d() { // from class: cz.o
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                EnterOtpView.m49726OM(interfaceC17463d, i11);
            }
        });
        return aVar.m90927d();
    }

    /* renamed from: OM */
    public static final void m49726OM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: PM */
    public static final void m49727PM(EnterOtpView enterOtpView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(enterOtpView, "this$0");
        interfaceC17463d.dismiss();
        try {
            ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
            InterfaceC27218a m92676n2 = enterOtpView.m92676n2();
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ratezalo_url);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{enterOtpView.m92686rK().getPackageName()}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            c15403a.m87168C(m92676n2, format);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RM */
    private final void m49728RM(String str, Context context) {
        try {
            if (this.f49254i1) {
                return;
            }
            this.f49254i1 = true;
            this.f49251f1 = str;
            if (!TextUtils.isEmpty(str) && AbstractC23304d.f113289J.size() > 0) {
                int length = ((String) AbstractC23304d.f113289J.get(0)).length();
                StringBuilder sb2 = new StringBuilder();
                int i11 = 0;
                for (int length2 = this.f49251f1.length() - 1; i11 < length && length2 >= 0; length2 -= 2) {
                    sb2.append(this.f49251f1.charAt(length2));
                    char charAt = this.f49251f1.charAt(length2);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("value1: ");
                    sb3.append(charAt);
                    i11++;
                }
                if (AbstractC23304d.f113289J.contains(sb2.toString())) {
                    this.f49253h1 = 0;
                    AbstractC20019m.m103895c(context);
                    this.f49252g1.removeCallbacks(this.f49255j1);
                    if (System.currentTimeMillis() - AbstractC23304d.f113399j1 <= AbstractC23304d.f113395i1) {
                        this.f49252g1.postDelayed(this.f49255j1, AbstractC23304d.f113391h1);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: SM */
    public final void m49729SM() {
        long j11 = AbstractC23304d.f113395i1;
        if (j11 <= 0) {
            j11 = 60000;
        }
        CountDownTimerC9288e countDownTimerC9288e = new CountDownTimerC9288e(j11);
        this.f49240U0 = countDownTimerC9288e;
        countDownTimerC9288e.start();
    }

    /* renamed from: TM */
    private final SpannableString m49730TM(String str, int i11, int i12, boolean z11, InterfaceC18494a interfaceC18494a) {
        C9289f c9289f = new C9289f(interfaceC18494a);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(c9289f, i11, i12, 33);
        if (z11) {
            spannableString.setSpan(new StyleSpan(1), i11, i12, 33);
        }
        return spannableString;
    }

    /* renamed from: UM */
    static /* synthetic */ SpannableString m49731UM(EnterOtpView enterOtpView, String str, int i11, int i12, boolean z11, InterfaceC18494a interfaceC18494a, int i13, Object obj) {
        boolean z12;
        if ((i13 & 8) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        return enterOtpView.m49730TM(str, i11, i12, z12, interfaceC18494a);
    }

    /* renamed from: VM */
    private final void m49732VM() {
        C29867j3 c29867j3 = this.f49235P0;
        if (c29867j3 == null) {
            AbstractC19074t.m100223u("binding");
            c29867j3 = null;
        }
        FrameLayout root = c29867j3.getRoot();
        AbstractC19074t.m100205c(root);
        root.setPadding(root.getPaddingLeft(), AbstractC17484n.Companion.m92931b(), root.getPaddingRight(), root.getPaddingBottom());
        m49752lN(this.f49246a1);
        C29867j3 c29867j32 = this.f49235P0;
        if (c29867j32 == null) {
            AbstractC19074t.m100223u("binding");
            c29867j32 = null;
        }
        OtpField otpField = c29867j32.f138247u;
        otpField.getEditText().setMaxLength(6);
        otpField.getEditText().addTextChangedListener(new C9290g(otpField));
        C29867j3 c29867j33 = this.f49235P0;
        if (c29867j33 == null) {
            AbstractC19074t.m100223u("binding");
            c29867j33 = null;
        }
        RobotoTextView robotoTextView = c29867j33.f138251y;
        robotoTextView.setMovementMethod(LinkMovementMethod.getInstance());
        robotoTextView.setHighlightColor(0);
        C29867j3 c29867j34 = this.f49235P0;
        if (c29867j34 == null) {
            AbstractC19074t.m100223u("binding");
            c29867j34 = null;
        }
        c29867j34.f138245s.setOnClickListener(new View.OnClickListener() { // from class: cz.h
            public /* synthetic */ ViewOnClickListenerC17614h() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterOtpView.m49733WM(EnterOtpView.this, view);
            }
        });
        C29867j3 c29867j35 = this.f49235P0;
        if (c29867j35 == null) {
            AbstractC19074t.m100223u("binding");
            c29867j35 = null;
        }
        c29867j35.f138244r.setOnClickListener(new View.OnClickListener() { // from class: cz.j
            public /* synthetic */ ViewOnClickListenerC17622j() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterOtpView.m49734XM(EnterOtpView.this, view);
            }
        });
        C29867j3 c29867j36 = this.f49235P0;
        if (c29867j36 == null) {
            AbstractC19074t.m100223u("binding");
            c29867j36 = null;
        }
        c29867j36.f138246t.setOnClickListener(new View.OnClickListener() { // from class: cz.k
            public /* synthetic */ ViewOnClickListenerC17626k() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterOtpView.m49735YM(EnterOtpView.this, view);
            }
        });
        C29867j3 c29867j37 = this.f49235P0;
        if (c29867j37 == null) {
            AbstractC19074t.m100223u("binding");
            c29867j37 = null;
        }
        RobotoTextView robotoTextView2 = c29867j37.f138252z;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        robotoTextView2.setCompoundDrawablesWithIntrinsicBounds(C27280g.m139660c(m92689tK, AbstractC23322a.zds_ic_help_circle_solid_16, AbstractC2807a.cta_link), (Drawable) null, (Drawable) null, (Drawable) null);
        robotoTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        robotoTextView2.setHighlightColor(0);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_enter_verification_code_hint_support);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        robotoTextView2.setText(m49731UM(this, m118743r0, 0, m118743r0.length(), false, new C9291h(), 8, null), TextView.BufferType.SPANNABLE);
    }

    /* renamed from: WM */
    public static final void m49733WM(EnterOtpView enterOtpView, View view) {
        AbstractC19074t.m100208f(enterOtpView, "this$0");
        C29867j3 c29867j3 = enterOtpView.f49235P0;
        if (c29867j3 == null) {
            AbstractC19074t.m100223u("binding");
            c29867j3 = null;
        }
        c29867j3.f138247u.setFieldState(EnumC17007i.NORMAL);
        if (C23055e5.m118273h(false, 1, null)) {
            C17667v0.f89659a.m93647d(enterOtpView.m92676n2());
            C29867j3 c29867j32 = enterOtpView.f49235P0;
            if (c29867j32 == null) {
                AbstractC19074t.m100223u("binding");
                c29867j32 = null;
            }
            m49757oN(enterOtpView, String.valueOf(c29867j32.f138247u.getEditText().getText()), false, 2, null);
            return;
        }
        ToastUtils.m89274v(enterOtpView, ToastUtils.EnumC16738b.DISCONNECTED);
    }

    /* renamed from: XM */
    public static final void m49734XM(EnterOtpView enterOtpView, View view) {
        AbstractC19074t.m100208f(enterOtpView, "this$0");
        C17667v0.f89659a.m93647d(enterOtpView.m92676n2());
        enterOtpView.finish();
    }

    /* renamed from: YM */
    public static final void m49735YM(EnterOtpView enterOtpView, View view) {
        AbstractC19074t.m100208f(enterOtpView, "this$0");
        enterOtpView.m49739dN();
    }

    /* renamed from: aN */
    public static final void m49736aN(EnterOtpView enterOtpView) {
        AbstractC19074t.m100208f(enterOtpView, "this$0");
        C17667v0 c17667v0 = C17667v0.f89659a;
        C29867j3 c29867j3 = enterOtpView.f49235P0;
        if (c29867j3 == null) {
            AbstractC19074t.m100223u("binding");
            c29867j3 = null;
        }
        c17667v0.m93648e(c29867j3.f138247u.getEditText());
    }

    /* renamed from: bN */
    public final void m49737bN(String str) {
        C17667v0.f89659a.m93647d(m92676n2());
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PHONE_NUMBER", this.f49236Q0);
        bundle.putString("EXTRA_DATA", str);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(AlreadyExistAccountRegisterView.class, bundle, 1, true);
        }
    }

    /* renamed from: cN */
    public final void m49738cN() {
        AbstractC0924m0.m2972Cm(3);
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PHONE_NUMBER", this.f49236Q0);
        bundle.putString("EXTRA_SESSION_TOKEN", this.f49237R0);
        if (this.f49249d1.length() > 0) {
            bundle.putString("EXTRA_E_KYC_TOKEN", this.f49249d1);
        }
        JSONObject jSONObject = this.f49248c1;
        if (jSONObject != null) {
            bundle.putString("EXTRA_E_KYC_INFO", jSONObject.toString());
        }
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(UserNamingView.class, bundle, 1, true);
        }
    }

    /* renamed from: dN */
    private final void m49739dN() {
        String str;
        String str2;
        try {
            if (!TextUtils.isEmpty(AbstractC23304d.f113446v0)) {
                str = AbstractC23304d.f113446v0;
            } else {
                str = "6020";
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
            if (!TextUtils.isEmpty(AbstractC23304d.f113458y0)) {
                str2 = AbstractC23304d.f113458y0;
            } else {
                str2 = "ZALO";
            }
            intent.putExtra("sms_body", str2);
            m92641HK(intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fN */
    private final void m49740fN() {
        this.f49243X0 = new SMSReceiver(new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: cz.r
            public /* synthetic */ C17654r() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m49742gN;
                m49742gN = EnterOtpView.m49742gN(EnterOtpView.this, message);
                return m49742gN;
            }
        }));
    }

    /* renamed from: gN */
    public static final boolean m49742gN(EnterOtpView enterOtpView, Message message) {
        int i11;
        boolean z11;
        AbstractC19074t.m100208f(enterOtpView, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        int i12 = message.what;
        if (i12 != 0) {
            if (i12 == 2) {
                try {
                    Object obj = message.obj;
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                    enterOtpView.m49728RM((String) obj, MainApplication.Companion.m35500c());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        } else {
            try {
                Object obj2 = message.obj;
                AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.String");
                if (!TextUtils.isEmpty((String) obj2)) {
                    C29867j3 c29867j3 = enterOtpView.f49235P0;
                    C29867j3 c29867j32 = null;
                    if (c29867j3 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29867j3 = null;
                    }
                    OtpEdittext editText = c29867j3.f138247u.getEditText();
                    Object obj3 = message.obj;
                    AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.String");
                    editText.setText((String) obj3);
                    C29867j3 c29867j33 = enterOtpView.f49235P0;
                    if (c29867j33 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29867j32 = c29867j33;
                    }
                    String valueOf = String.valueOf(c29867j32.f138247u.getEditText().getText());
                    int length = valueOf.length() - 1;
                    int i13 = 0;
                    boolean z12 = false;
                    while (i13 <= length) {
                        if (!z12) {
                            i11 = i13;
                        } else {
                            i11 = length;
                        }
                        if (AbstractC19074t.m100209g(valueOf.charAt(i11), 32) <= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z12) {
                            if (!z11) {
                                z12 = true;
                            } else {
                                i13++;
                            }
                        } else {
                            if (!z11) {
                                break;
                            }
                            length--;
                        }
                    }
                    enterOtpView.f49252g1.post(new Runnable() { // from class: cz.i

                        /* renamed from: q */
                        public final /* synthetic */ String f89603q;

                        public /* synthetic */ RunnableC17618i(String str) {
                            r2 = str;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            EnterOtpView.m49744hN(EnterOtpView.this, r2);
                        }
                    });
                }
                return true;
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: hN */
    public static final void m49744hN(EnterOtpView enterOtpView, String str) {
        AbstractC19074t.m100208f(enterOtpView, "this$0");
        AbstractC19074t.m100208f(str, "$strActiveCode");
        m49757oN(enterOtpView, str, false, 2, null);
    }

    /* renamed from: iN */
    private final void m49746iN() {
        this.f49242W0 = new BroadcastReceiver() { // from class: com.zing.zalo.register.EnterOtpView$startSMSRetrieverListener$1
            public EnterOtpView$startSMSRetrieverListener$1() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object obj;
                String string;
                String str;
                Matcher matcher;
                String str2;
                int i11;
                boolean z11;
                AbstractC19074t.m100208f(context, "context");
                AbstractC19074t.m100208f(intent, "intent");
                if (AbstractC19074t.m100204b("com.google.android.gms.auth.api.phone.SMS_RETRIEVED", intent.getAction())) {
                    Bundle extras = intent.getExtras();
                    C29867j3 c29867j3 = null;
                    if (extras != null) {
                        obj = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                    } else {
                        obj = null;
                    }
                    Status status = (Status) obj;
                    if (status != null) {
                        EnterOtpView enterOtpView = EnterOtpView.this;
                        if (status.m19220F() == 0) {
                            if (extras != null) {
                                try {
                                    string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                    return;
                                }
                            } else {
                                string = null;
                            }
                            if (!TextUtils.isEmpty(string)) {
                                str = enterOtpView.f49241V0;
                                Pattern compile = Pattern.compile(str);
                                if (string != null) {
                                    matcher = compile.matcher(string);
                                } else {
                                    matcher = null;
                                }
                                if (matcher != null && matcher.find()) {
                                    String group = matcher.group(0);
                                    if (group != null) {
                                        AbstractC19074t.m100205c(group);
                                        int length = group.length() - 1;
                                        int i12 = 0;
                                        boolean z12 = false;
                                        while (i12 <= length) {
                                            if (!z12) {
                                                i11 = i12;
                                            } else {
                                                i11 = length;
                                            }
                                            if (AbstractC19074t.m100209g(group.charAt(i11), 32) <= 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (!z12) {
                                                if (!z11) {
                                                    z12 = true;
                                                } else {
                                                    i12++;
                                                }
                                            } else if (!z11) {
                                                break;
                                            } else {
                                                length--;
                                            }
                                        }
                                        str2 = group.subSequence(i12, length + 1).toString();
                                    } else {
                                        str2 = null;
                                    }
                                    C29867j3 c29867j32 = enterOtpView.f49235P0;
                                    if (c29867j32 == null) {
                                        AbstractC19074t.m100223u("binding");
                                    } else {
                                        c29867j3 = c29867j32;
                                    }
                                    c29867j3.f138247u.getEditText().setText(str2);
                                }
                            }
                        }
                    }
                }
            }
        };
        AbstractC22888j mo132539w = AbstractC25644a.m132538a(MainApplication.Companion.m35500c()).mo132539w();
        mo132539w.mo117578g(new InterfaceC22882g() { // from class: cz.p
            public /* synthetic */ C17646p() {
            }

            @Override // p342m6.InterfaceC22882g
            public final void onSuccess(Object obj) {
                EnterOtpView.m49748jN(InterfaceC18505l.this, obj);
            }
        });
        mo132539w.mo117576e(new InterfaceC22880f() { // from class: cz.q
            @Override // p342m6.InterfaceC22880f
            /* renamed from: b */
            public final void mo839b(Exception exc) {
                EnterOtpView.m49750kN(exc);
            }
        });
    }

    /* renamed from: jN */
    public static final void m49748jN(InterfaceC18505l interfaceC18505l, Object obj) {
        AbstractC19074t.m100208f(interfaceC18505l, "$tmp0");
        interfaceC18505l.mo205i9(obj);
    }

    /* renamed from: kN */
    public static final void m49750kN(Exception exc) {
        AbstractC20110a.f98889a.mo104552e(exc);
    }

    /* renamed from: lN */
    public final void m49752lN(EnumC9284a enumC9284a) {
        String m118746s0;
        int m127173b0;
        boolean m127126v;
        String m119145q = AbstractC23153n4.m119145q(this.f49236Q0);
        String m118283i = AbstractC23056e6.m118283i(m119145q, AbstractC23309i.m121704a5(), true, 4);
        if (!TextUtils.isEmpty(m118283i)) {
            m127126v = AbstractC24341v.m127126v(m118283i, AbstractC23056e6.f112062a, true);
            if (!m127126v) {
                m119145q = m118283i;
            }
        }
        int i11 = C9286c.f49263a[enumC9284a.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_register_enter_verification_code_description, m119145q);
                    AbstractC19074t.m100205c(m118746s0);
                } else {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_register_enter_verification_code_description, m119145q);
                    AbstractC19074t.m100205c(m118746s0);
                }
            } else {
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_register_enter_verification_code_description_type_call, m119145q);
                AbstractC19074t.m100205c(m118746s0);
            }
        } else {
            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_register_enter_verification_code_description, m119145q);
            AbstractC19074t.m100205c(m118746s0);
        }
        AbstractC19074t.m100205c(m119145q);
        m127173b0 = AbstractC24342w.m127173b0(m118746s0, m119145q, 0, false, 6, null);
        int length = m119145q.length() + m127173b0;
        SpannableString spannableString = new SpannableString(m118746s0);
        spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119606n(AbstractC2807a.text_primary)), m127173b0, length, 33);
        spannableString.setSpan(new StyleSpan(1), m127173b0, length, 33);
        C29867j3 c29867j3 = this.f49235P0;
        if (c29867j3 == null) {
            AbstractC19074t.m100223u("binding");
            c29867j3 = null;
        }
        c29867j3.f138241B.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    /* renamed from: mN */
    public final void m49754mN(int i11) {
        if (i11 != 6 && 4 <= i11 && i11 < 7) {
            C29867j3 c29867j3 = this.f49235P0;
            if (c29867j3 == null) {
                AbstractC19074t.m100223u("binding");
                c29867j3 = null;
            }
            c29867j3.f138247u.getEditText().setMaxLength(i11);
        }
    }

    /* renamed from: oN */
    public static /* synthetic */ void m49757oN(EnterOtpView enterOtpView, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        enterOtpView.m49773nN(str, z11);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f49236Q0 = String.valueOf(m92642L3.getString("EXTRA_PHONE_NUMBER"));
            this.f49237R0 = String.valueOf(m92642L3.getString("EXTRA_SESSION_TOKEN"));
            this.f49239T0 = m92642L3.getInt("EXTRA_EXIST_ACCOUNT");
        }
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(16);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        return mo49769EJ(i11, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "objects");
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            C17667v0 c17667v0 = C17667v0.f89659a;
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            return c17667v0.m93646b(this, (String) obj);
        }
        return m49725NM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29867j3 m148106c = C29867j3.m148106c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148106c, "inflate(...)");
        this.f49235P0 = m148106c;
        m49732VM();
        C29867j3 c29867j3 = this.f49235P0;
        if (c29867j3 == null) {
            AbstractC19074t.m100223u("binding");
            c29867j3 = null;
        }
        FrameLayout root = c29867j3.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            if (this.f49242W0 != null) {
                MainApplication.Companion.m35500c().unregisterReceiver(this.f49242W0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo39024IJ();
    }

    /* renamed from: QM */
    public final void m49770QM() {
        m78946bM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_progress), Boolean.FALSE);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C9287d());
        c0766k.mo1607ba(this.f49236Q0, AbstractC23153n4.m119147r(), 0, this.f49237R0, AbstractC23034c6.m118110A());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        try {
            MainApplication.Companion.m35500c().unregisterReceiver(this.f49243X0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo13886RJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            AbstractC19444a.m101694b(new Runnable() { // from class: cz.l
                public /* synthetic */ RunnableC17630l() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EnterOtpView.m49736aN(EnterOtpView.this);
                }
            }, 50L);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        AbstractC20887g.m109217D(510030, null, 2, null);
    }

    /* renamed from: ZM */
    public final void m49771ZM() {
        this.f49252g1.removeCallbacks(this.f49255j1);
        C17667v0.f89659a.m93647d(m92676n2());
        AbstractC23647d.m123897g("38531");
        C29867j3 c29867j3 = this.f49235P0;
        if (c29867j3 == null) {
            AbstractC19074t.m100223u("binding");
            c29867j3 = null;
        }
        if (!AbstractC19074t.m100204b(String.valueOf(c29867j3.f138247u.getEditText().getText()), AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_enter_verification_code_requested_resend_otp))) {
            AbstractC23647d.m123897g("38532");
        }
    }

    /* renamed from: eN */
    public final void m49772eN(boolean z11) {
        this.f49250e1 = z11;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "EnterOtpRegisterView";
    }

    /* renamed from: nN */
    public final void m49773nN(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "activationValue");
        if (this.f49250e1) {
            m78946bM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_progress), Boolean.valueOf(z11));
            return;
        }
        this.f49250e1 = true;
        m78946bM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_progress), Boolean.valueOf(z11));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C9293j());
        c0766k.mo1750u6(this.f49236Q0, AbstractC23153n4.m119147r(), 0, this.f49238S0, str);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            long currentTimeMillis = System.currentTimeMillis() - this.f49244Y0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deltaTime: ");
            sb2.append(currentTimeMillis);
            if (currentTimeMillis < 300) {
                return true;
            }
            m49771ZM();
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            if (this.f49238S0.length() == 0) {
                m49770QM();
            }
            if (m92676n2() != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PHONE_STATE");
                intentFilter.setPriority(Integer.MAX_VALUE);
                SMSReceiver sMSReceiver = this.f49243X0;
                if (sMSReceiver != null) {
                    AbstractC2351i.m12327a(MainApplication.Companion.m35500c(), sMSReceiver, intentFilter, true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f49244Y0 = System.currentTimeMillis();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m49746iN();
        m49740fN();
    }
}
