package com.zing.zalo.p077ui.maintab.msg.fixedbanner;

import a50.ViewOnClickListenerC0139g;
import ac.C0697c0;
import ac.C0732w;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ah0.C0860a;
import am.AbstractC0924m0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.core.app.C1335e1;
import androidx.core.content.AbstractC1388a;
import androidx.core.text.AbstractC1463b;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.RepeatOnLifecycleKt;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.maintab.msg.fixedbanner.FixedBannerView;
import com.zing.zalo.p077ui.settings.SettingNotificationV2View;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.ReturnCallScreenView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.home.ZCloudHomeView;
import com.zing.zalo.p077ui.zalocloud.restore.C13958c;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.UpdateAvatarView;
import com.zing.zalo.p077ui.zviews.UpdateUserInfoZView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.recover.AbstractC16889b;
import com.zing.zalo.zalocloud.recover.C16888a;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ProgressBar;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import dg0.AbstractC17930e;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import fn0.C19067n0;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import k30.C21459a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import lk.EnumC22502a;
import ln0.AbstractC22543l;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23152n3;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.C23055e5;
import me0.C23212s8;
import mg0.AbstractC23291c;
import mk.AbstractC23323a;
import mk.C23324b;
import mk.C23325c;
import mk.C23327e;
import mk.C23331i;
import mk.C23332j;
import mk.C23333k;
import mk.C23334l;
import mk.C23335m;
import mk.C23336n;
import mk.C23337o;
import mk.C23338p;
import mk.C23339q;
import mk.C23340r;
import mk.C23341s;
import mk.EnumC23326d;
import nh0.InterfaceC23792b;
import nl.C23870a;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p161fg.C18922m;
import p173fz.C19172a;
import p207he.C20024r;
import p269jj.C21275a;
import p297kd.C21688c;
import p320ld.C22438j;
import p320ld.C22447s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p363nh.EnumC23747b0;
import p363nh.EnumC23761i0;
import p405ov.C24559a;
import p445qe.C25244a;
import p479rc.C25727d;
import p484ri.C25804a;
import p542ub.InterfaceC27218a;
import p586vt.AbstractC28627l;
import p586vt.InterfaceC28625j;
import p609wh.AbstractC28998a;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import p649xl.C29711a9;
import p649xl.C29720b0;
import p649xl.C29772dg;
import p649xl.C29808fg;
import p649xl.C29826gg;
import p649xl.C29870j6;
import p649xl.C29886k4;
import p649xl.C29921m3;
import p649xl.C30015r7;
import p649xl.C30037sc;
import p649xl.C30057tf;
import p681yh.C30981a;
import p681yh.C30983c;
import p681yh.EnumC30982b;
import p716zh.C32044o1;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.C24865v;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import si.C26263i;
import tb0.C26626l;
import tg0.C26676b;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26708g;
import u70.C27096z0;
import ui0.C27280g;
import v70.AbstractC27941a;
import vl0.AbstractC28291a;
import vm0.AbstractC28298d;
import wg0.AbstractC28981d;
import wg0.C28989l;
import wg0.EnumC28993p;
import wg0.InterfaceC28990m;
import wm0.AbstractC29104l;
import yg0.EnumC30980a;

/* loaded from: classes5.dex */
public final class FixedBannerView extends CommonZaloview implements C23744a.c, InterfaceC28625j {
    public static final C12217a Companion = new C12217a(null);

    /* renamed from: v1 */
    private static final int[] f63733v1 = {1, 1, 2, 3, 5, 8, 13};

    /* renamed from: w1 */
    private static Boolean f63734w1;

    /* renamed from: x1 */
    private static boolean f63735x1;

    /* renamed from: L0 */
    private final InterfaceC24854k f63736L0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C27096z0.class), new C12243w(new C12242v(this)), new C12222c0());

    /* renamed from: M0 */
    private LinearLayout f63737M0;

    /* renamed from: N0 */
    private final C29234i f63738N0;

    /* renamed from: O0 */
    private final InterfaceC24854k f63739O0;

    /* renamed from: P0 */
    private EnumC30982b f63740P0;

    /* renamed from: Q0 */
    private long f63741Q0;

    /* renamed from: R0 */
    private ValueAnimator f63742R0;

    /* renamed from: S0 */
    private InterfaceC12219b f63743S0;

    /* renamed from: T0 */
    private int f63744T0;

    /* renamed from: U0 */
    private String f63745U0;

    /* renamed from: V0 */
    private final InterfaceC24854k f63746V0;

    /* renamed from: W0 */
    private boolean f63747W0;

    /* renamed from: X0 */
    private int f63748X0;

    /* renamed from: Y0 */
    private long f63749Y0;

    /* renamed from: Z0 */
    private ViewOnClickListenerC0139g f63750Z0;

    /* renamed from: a1 */
    private volatile boolean f63751a1;

    /* renamed from: b1 */
    private final InterfaceC24854k f63752b1;

    /* renamed from: c1 */
    private AbstractC28981d f63753c1;

    /* renamed from: d1 */
    private boolean f63754d1;

    /* renamed from: e1 */
    private final boolean f63755e1;

    /* renamed from: f1 */
    private final InterfaceC24854k f63756f1;

    /* renamed from: g1 */
    private final InterfaceC24854k f63757g1;

    /* renamed from: h1 */
    private volatile boolean f63758h1;

    /* renamed from: i1 */
    private ScheduledFuture f63759i1;

    /* renamed from: j1 */
    private final Runnable f63760j1;

    /* renamed from: k1 */
    private final InterfaceC29232g f63761k1;

    /* renamed from: l1 */
    private final InterfaceC29232g f63762l1;

    /* renamed from: m1 */
    private final InterfaceC29232g f63763m1;

    /* renamed from: n1 */
    private final InterfaceC29232g f63764n1;

    /* renamed from: o1 */
    private final InterfaceC29232g f63765o1;

    /* renamed from: p1 */
    private final InterfaceC29232g f63766p1;

    /* renamed from: q1 */
    private final InterfaceC29232g f63767q1;

    /* renamed from: r1 */
    private final InterfaceC29232g f63768r1;

    /* renamed from: s1 */
    private final InterfaceC29232g f63769s1;

    /* renamed from: t1 */
    private final InterfaceC29232g f63770t1;

    /* renamed from: u1 */
    private final InterfaceC29232g f63771u1;

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$a */
    /* loaded from: classes5.dex */
    public static final class C12217a {
        private C12217a() {
        }

        public /* synthetic */ C12217a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$a0 */
    /* loaded from: classes5.dex */
    public static final class C12218a0 extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f63772p;

        /* renamed from: q */
        final /* synthetic */ FixedBannerView f63773q;

        C12218a0(boolean z11, FixedBannerView fixedBannerView) {
            this.f63772p = z11;
            this.f63773q = fixedBannerView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            if (!this.f63772p) {
                FixedBannerView.m68427DP(this.f63773q, false, 0, null, 6, null);
            }
            InterfaceC12219b interfaceC12219b = this.f63773q.f63743S0;
            if (interfaceC12219b != null) {
                interfaceC12219b.mo68622a(0.0f);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC12219b {
        /* renamed from: a */
        void mo68622a(float f11);
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$b0 */
    /* loaded from: classes5.dex */
    static final class C12220b0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12220b0 f63774q = new C12220b0();

        C12220b0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set mo12V4() {
            return Collections.synchronizedSet(new HashSet());
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C12221c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63775a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f63776b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f63777c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f63778d;

        static {
            int[] iArr = new int[EnumC22502a.values().length];
            try {
                iArr[EnumC22502a.f110111p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC22502a.f110115t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC22502a.f110117v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC22502a.f110114s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC22502a.f110116u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC22502a.f110112q.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC22502a.f110113r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC22502a.f110118w.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC22502a.f110119x.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC22502a.f110120y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC22502a.f110121z.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC22502a.f110107A.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC22502a.f110108B.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f63775a = iArr;
            int[] iArr2 = new int[EnumC28993p.values().length];
            try {
                iArr2[EnumC28993p.f134267q.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[EnumC28993p.f134266p.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[EnumC28993p.f134269s.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[EnumC28993p.f134270t.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[EnumC28993p.f134271u.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            f63776b = iArr2;
            int[] iArr3 = new int[EnumC30982b.values().length];
            try {
                iArr3[EnumC30982b.AIRPLANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[EnumC30982b.NO_NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[EnumC30982b.CONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[EnumC30982b.CONNECT_LIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[EnumC30982b.CONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            f63777c = iArr3;
            int[] iArr4 = new int[EnumC23326d.values().length];
            try {
                iArr4[EnumC23326d.f113521p.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[EnumC23326d.f113522q.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[EnumC23326d.f113523r.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            f63778d = iArr4;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$c0 */
    /* loaded from: classes5.dex */
    static final class C12222c0 extends AbstractC19075u implements InterfaceC18494a {
        C12222c0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return AbstractC27941a.m140796a(FixedBannerView.this);
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$d */
    /* loaded from: classes5.dex */
    static final class C12223d extends AbstractC19075u implements InterfaceC18494a {
        C12223d() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m68626c(FixedBannerView fixedBannerView, View view) {
            AbstractC19074t.m100208f(fixedBannerView, "this$0");
            fixedBannerView.m68538fP();
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C30037sc mo12V4() {
            LayoutInflater from = LayoutInflater.from(FixedBannerView.this.getContext());
            LinearLayout linearLayout = FixedBannerView.this.f63737M0;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("mainContainer");
                linearLayout = null;
            }
            C30037sc m148500c = C30037sc.m148500c(from, linearLayout, false);
            AbstractC19074t.m100207e(m148500c, "inflate(...)");
            ReturnCallScreenView root = m148500c.getRoot();
            final FixedBannerView fixedBannerView = FixedBannerView.this;
            root.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.maintab.msg.fixedbanner.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FixedBannerView.C12223d.m68626c(FixedBannerView.this, view);
                }
            });
            return m148500c;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$d0 */
    /* loaded from: classes5.dex */
    static final class C12224d0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12224d0 f63781q = new C12224d0();

        C12224d0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23870a mo12V4() {
            return AbstractC23306f.m120679j2();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$e */
    /* loaded from: classes5.dex */
    static final class C12225e extends AbstractC19075u implements InterfaceC18494a {
        C12225e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C30015r7 mo12V4() {
            LayoutInflater from = LayoutInflater.from(FixedBannerView.this.getContext());
            LinearLayout linearLayout = FixedBannerView.this.f63737M0;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("mainContainer");
                linearLayout = null;
            }
            C30015r7 m148444c = C30015r7.m148444c(from, linearLayout, false);
            AbstractC19074t.m100207e(m148444c, "inflate(...)");
            return m148444c;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$f */
    /* loaded from: classes5.dex */
    static final class C12226f extends AbstractC19075u implements InterfaceC18494a {
        C12226f() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m68631c(FixedBannerView fixedBannerView, View view) {
            AbstractC19074t.m100208f(fixedBannerView, "this$0");
            fixedBannerView.m68542gP();
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C29921m3 mo12V4() {
            LayoutInflater from = LayoutInflater.from(FixedBannerView.this.getContext());
            LinearLayout linearLayout = FixedBannerView.this.f63737M0;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("mainContainer");
                linearLayout = null;
            }
            C29921m3 m148233c = C29921m3.m148233c(from, linearLayout, false);
            AbstractC19074t.m100207e(m148233c, "inflate(...)");
            LinearLayout root = m148233c.getRoot();
            final FixedBannerView fixedBannerView = FixedBannerView.this;
            root.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.maintab.msg.fixedbanner.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FixedBannerView.C12226f.m68631c(FixedBannerView.this, view);
                }
            });
            return m148233c;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$g */
    /* loaded from: classes5.dex */
    static final class C12227g extends AbstractC19075u implements InterfaceC18494a {
        C12227g() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m68636e(FixedBannerView fixedBannerView, View view) {
            AbstractC19074t.m100208f(fixedBannerView, "this$0");
            fixedBannerView.m68512ZO();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m68637f(FixedBannerView fixedBannerView, View view) {
            AbstractC19074t.m100208f(fixedBannerView, "this$0");
            if (!AbstractC23304d.f113370c2) {
                fixedBannerView.m68512ZO();
            } else {
                AbstractC23304d.f113370c2 = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m68638g(FixedBannerView fixedBannerView, View view) {
            AbstractC19074t.m100208f(fixedBannerView, "this$0");
            fixedBannerView.m68534eP();
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C29886k4 mo12V4() {
            LayoutInflater from = LayoutInflater.from(FixedBannerView.this.getContext());
            LinearLayout linearLayout = FixedBannerView.this.f63737M0;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("mainContainer");
                linearLayout = null;
            }
            C29886k4 m148155c = C29886k4.m148155c(from, linearLayout, false);
            AbstractC19074t.m100207e(m148155c, "inflate(...)");
            RelativeLayout relativeLayout = m148155c.f138459q;
            final FixedBannerView fixedBannerView = FixedBannerView.this;
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.maintab.msg.fixedbanner.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FixedBannerView.C12227g.m68636e(FixedBannerView.this, view);
                }
            });
            RobotoTextView robotoTextView = m148155c.f138461s;
            final FixedBannerView fixedBannerView2 = FixedBannerView.this;
            robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.maintab.msg.fixedbanner.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FixedBannerView.C12227g.m68637f(FixedBannerView.this, view);
                }
            });
            AppCompatImageView appCompatImageView = m148155c.f138460r;
            final FixedBannerView fixedBannerView3 = FixedBannerView.this;
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.maintab.msg.fixedbanner.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FixedBannerView.C12227g.m68638g(FixedBannerView.this, view);
                }
            });
            return m148155c;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$h */
    /* loaded from: classes5.dex */
    static final class C12228h extends AbstractC19075u implements InterfaceC18494a {
        C12228h() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m68641c(FixedBannerView fixedBannerView, View view) {
            AbstractC19074t.m100208f(fixedBannerView, "this$0");
            fixedBannerView.m68589sP();
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C29711a9 mo12V4() {
            LayoutInflater from = LayoutInflater.from(FixedBannerView.this.getContext());
            LinearLayout linearLayout = FixedBannerView.this.f63737M0;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("mainContainer");
                linearLayout = null;
            }
            C29711a9 m147726c = C29711a9.m147726c(from, linearLayout, false);
            AbstractC19074t.m100207e(m147726c, "inflate(...)");
            AppCompatImageView appCompatImageView = m147726c.f137228q;
            final FixedBannerView fixedBannerView = FixedBannerView.this;
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.maintab.msg.fixedbanner.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FixedBannerView.C12228h.m68641c(FixedBannerView.this, view);
                }
            });
            return m147726c;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$i */
    /* loaded from: classes5.dex */
    static final class C12229i extends AbstractC19075u implements InterfaceC18494a {
        C12229i() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m68645d(final FixedBannerView fixedBannerView, View view) {
            AbstractC19074t.m100208f(fixedBannerView, "this$0");
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.maintab.msg.fixedbanner.i
                @Override // java.lang.Runnable
                public final void run() {
                    FixedBannerView.C12229i.m68646e(FixedBannerView.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m68646e(FixedBannerView fixedBannerView) {
            AbstractC19074t.m100208f(fixedBannerView, "this$0");
            fixedBannerView.m68615zO().m139217V(new C23332j(0L, null, 3, null));
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C29720b0 mo12V4() {
            LayoutInflater from = LayoutInflater.from(FixedBannerView.this.getContext());
            LinearLayout linearLayout = FixedBannerView.this.f63737M0;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("mainContainer");
                linearLayout = null;
            }
            C29720b0 m147746c = C29720b0.m147746c(from, linearLayout, false);
            AbstractC19074t.m100207e(m147746c, "inflate(...)");
            FixedBannerView fixedBannerView = FixedBannerView.this;
            FrameLayout root = m147746c.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            FixedBannerView fixedBannerView2 = FixedBannerView.this;
            fixedBannerView.f63750Z0 = new ViewOnClickListenerC0139g(root, fixedBannerView2, fixedBannerView2.m68479RN());
            if (AbstractC23306f.m120633X1().m89807v() && AbstractC23306f.m120691m2().m2461l()) {
                final FixedBannerView fixedBannerView3 = FixedBannerView.this;
                m147746c.f137281r.setVisibility(8);
                m147746c.f137281r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.maintab.msg.fixedbanner.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FixedBannerView.C12229i.m68645d(FixedBannerView.this, view);
                    }
                });
            }
            return m147746c;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$j */
    /* loaded from: classes5.dex */
    static final class C12230j extends AbstractC19075u implements InterfaceC18494a {
        C12230j() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m68649c(FixedBannerView fixedBannerView, View view) {
            AbstractC19074t.m100208f(fixedBannerView, "this$0");
            fixedBannerView.m68546hP();
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C29870j6 mo12V4() {
            LayoutInflater from = LayoutInflater.from(FixedBannerView.this.getContext());
            LinearLayout linearLayout = FixedBannerView.this.f63737M0;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("mainContainer");
                linearLayout = null;
            }
            C29870j6 m148116c = C29870j6.m148116c(from, linearLayout, false);
            AbstractC19074t.m100207e(m148116c, "inflate(...)");
            FrameLayout root = m148116c.getRoot();
            final FixedBannerView fixedBannerView = FixedBannerView.this;
            root.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.maintab.msg.fixedbanner.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FixedBannerView.C12230j.m68649c(FixedBannerView.this, view);
                }
            });
            return m148116c;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$k */
    /* loaded from: classes5.dex */
    static final class C12231k extends AbstractC19075u implements InterfaceC18494a {
        C12231k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29772dg mo12V4() {
            LayoutInflater from = LayoutInflater.from(FixedBannerView.this.getContext());
            LinearLayout linearLayout = FixedBannerView.this.f63737M0;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("mainContainer");
                linearLayout = null;
            }
            C29772dg m147871c = C29772dg.m147871c(from, linearLayout, false);
            AbstractC19074t.m100207e(m147871c, "inflate(...)");
            return m147871c;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$l */
    /* loaded from: classes5.dex */
    static final class C12232l extends AbstractC19075u implements InterfaceC18494a {
        C12232l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29808fg mo12V4() {
            LayoutInflater from = LayoutInflater.from(FixedBannerView.this.getContext());
            LinearLayout linearLayout = FixedBannerView.this.f63737M0;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("mainContainer");
                linearLayout = null;
            }
            C29808fg m147964c = C29808fg.m147964c(from, linearLayout, false);
            AbstractC19074t.m100207e(m147964c, "inflate(...)");
            return m147964c;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$m */
    /* loaded from: classes5.dex */
    static final class C12233m extends AbstractC19075u implements InterfaceC18494a {
        C12233m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29826gg mo12V4() {
            LayoutInflater from = LayoutInflater.from(FixedBannerView.this.getContext());
            LinearLayout linearLayout = FixedBannerView.this.f63737M0;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("mainContainer");
                linearLayout = null;
            }
            C29826gg m148007c = C29826gg.m148007c(from, linearLayout, false);
            AbstractC19074t.m100207e(m148007c, "inflate(...)");
            return m148007c;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$n */
    /* loaded from: classes5.dex */
    static final class C12234n extends AbstractC19075u implements InterfaceC18494a {
        C12234n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C30057tf mo12V4() {
            LayoutInflater from = LayoutInflater.from(FixedBannerView.this.getContext());
            LinearLayout linearLayout = FixedBannerView.this.f63737M0;
            if (linearLayout == null) {
                AbstractC19074t.m100223u("mainContainer");
                linearLayout = null;
            }
            C30057tf m148548c = C30057tf.m148548c(from, linearLayout, false);
            AbstractC19074t.m100207e(m148548c, "inflate(...)");
            return m148548c;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$o */
    /* loaded from: classes5.dex */
    public static final class C12235o implements ViewOnClickListenerC0139g.b {
        C12235o() {
        }

        @Override // a50.ViewOnClickListenerC0139g.b
        public void onDismiss() {
            FixedBannerView.this.m68615zO().m139217V(new C23332j(0L, null, 3, null));
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$p */
    /* loaded from: classes5.dex */
    public static final class C12236p extends ClickableSpan {
        C12236p() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            AbstractC23304d.f113370c2 = true;
            FixedBannerView.this.m68512ZO();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            if (!C13778s1.m76960a()) {
                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            } else {
                textPaint.setTypeface(C13718q1.m76694c(MainApplication.Companion.m35500c(), 7));
            }
            textPaint.setUnderlineText(false);
            textPaint.setColor(AbstractC23136l9.m118641B(MainApplication.Companion.m35500c(), AbstractC16801x.cLink1));
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$q */
    /* loaded from: classes5.dex */
    public static final class C12237q implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f63794a;

        /* renamed from: b */
        final /* synthetic */ int f63795b;

        /* renamed from: c */
        final /* synthetic */ FixedBannerView f63796c;

        /* renamed from: d */
        final /* synthetic */ Set f63797d;

        C12237q(int i11, int i12, FixedBannerView fixedBannerView, Set set) {
            this.f63794a = i11;
            this.f63795b = i12;
            this.f63796c = fixedBannerView;
            this.f63797d = set;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null && c20096c.m104491c() == 515) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_on_notification_update_setting_fail));
            }
            this.f63797d.remove(Integer.valueOf(this.f63794a));
            this.f63796c.mo78960q3();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC23304d.f113365b2 = false;
            int i11 = this.f63794a;
            AbstractC23148n.m118851y(i11, this.f63795b, i11);
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_on_notification_update_setting_success));
            this.f63796c.m68610yN();
            this.f63797d.remove(Integer.valueOf(this.f63794a));
            this.f63796c.mo78960q3();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$r */
    /* loaded from: classes5.dex */
    static final class C12238r extends AbstractC19075u implements InterfaceC18494a {
        C12238r() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler mo12V4() {
            return FixedBannerView.this.m68491UN();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$s */
    /* loaded from: classes5.dex */
    static final class C12239s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12239s f63799q = new C12239s();

        C12239s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicBoolean mo12V4() {
            return new AtomicBoolean(AbstractC0924m0.m3135Ib());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$t */
    /* loaded from: classes5.dex */
    public static final class C12240t extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f63800t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$t$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f63802t;

            /* renamed from: u */
            final /* synthetic */ FixedBannerView f63803u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$t$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32766a extends AbstractC29104l implements InterfaceC18511r {

                /* renamed from: t */
                int f63804t;

                /* renamed from: u */
                /* synthetic */ Object f63805u;

                /* renamed from: v */
                /* synthetic */ Object f63806v;

                /* renamed from: w */
                /* synthetic */ Object f63807w;

                C32766a(Continuation continuation) {
                    super(4, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f63804t == 0) {
                        AbstractC24862s.m129228b(obj);
                        return new C24865v((AbstractC28981d) this.f63805u, (AbstractC23291c) this.f63806v, (ZaloCloudRecoverCloudMediaWorker.AbstractC16884f) this.f63807w);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18511r
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo49340Uc(AbstractC28981d abstractC28981d, AbstractC23291c abstractC23291c, ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f, Continuation continuation) {
                    C32766a c32766a = new C32766a(continuation);
                    c32766a.f63805u = abstractC28981d;
                    c32766a.f63806v = abstractC23291c;
                    c32766a.f63807w = abstractC16884f;
                    return c32766a.mo239o(C24848g0.f119245a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$t$a$b */
            /* loaded from: classes5.dex */
            public static final class b implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ FixedBannerView f63808p;

                b(FixedBannerView fixedBannerView) {
                    this.f63808p = fixedBannerView;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(C24865v c24865v, Continuation continuation) {
                    AbstractC20110a.f98889a.m104564x("CommonZaloview").mo104556o(8, "BannerState: Onboarding State-" + c24865v.m129232d() + ", Change key State-" + c24865v.m129233e() + ", Recover State-" + c24865v.m129234f(), new Object[0]);
                    if (!(c24865v.m129233e() instanceof AbstractC23291c.b)) {
                        this.f63808p.m68615zO().m139212O(new C23339q(this.f63808p.m68615zO().m139214Q(), (AbstractC23291c) c24865v.m129233e()));
                    } else if (AbstractC19074t.m100204b(c24865v.m129234f(), ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b)) {
                        this.f63808p.m68591tN((AbstractC28981d) c24865v.m129232d());
                    } else {
                        this.f63808p.m68615zO().m139217V(new C23339q(0L, null, 3, null));
                        this.f63808p.m68606xN((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f) c24865v.m129234f());
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FixedBannerView fixedBannerView, Continuation continuation) {
                super(2, continuation);
                this.f63803u = fixedBannerView;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f63803u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f63802t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Flow m113293k = FlowKt.m113293k(C28989l.Companion.m144769a().m144765r(), C25727d.Companion.m132783f(), ZaloCloudRecoverCloudMediaWorker.Companion.m90201h(), new C32766a(null));
                    b bVar = new b(this.f63803u);
                    this.f63802t = 1;
                    if (m113293k.mo97893a(bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C12240t(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C12240t(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f63800t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC1801w m92657cJ = FixedBannerView.this.m92657cJ();
                AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
                AbstractC1785o.b bVar = AbstractC1785o.b.STARTED;
                a aVar = new a(FixedBannerView.this, null);
                this.f63800t = 1;
                if (RepeatOnLifecycleKt.m9234b(m92657cJ, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C12240t) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$u */
    /* loaded from: classes5.dex */
    public static final class C12241u implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f63809p;

        C12241u(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f63809p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f63809p;
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
            this.f63809p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$v */
    /* loaded from: classes5.dex */
    public static final class C12242v extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f63810q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12242v(ZaloView zaloView) {
            super(0);
            this.f63810q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f63810q;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$w */
    /* loaded from: classes5.dex */
    public static final class C12243w extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f63811q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12243w(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f63811q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f63811q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$x */
    /* loaded from: classes5.dex */
    public static final class C12244x extends AbstractC19075u implements InterfaceC18505l {
        C12244x() {
            super(1);
        }

        /* renamed from: a */
        public final void m68663a(C24860q c24860q) {
            LinearLayout linearLayout = null;
            if (((Boolean) c24860q.m129215c()).booleanValue()) {
                LinearLayout linearLayout2 = FixedBannerView.this.f63737M0;
                if (linearLayout2 == null) {
                    AbstractC19074t.m100223u("mainContainer");
                    linearLayout2 = null;
                }
                linearLayout2.removeAllViews();
            }
            AbstractC23323a abstractC23323a = (AbstractC23323a) c24860q.m129216d();
            if (abstractC23323a != null) {
                FixedBannerView fixedBannerView = FixedBannerView.this;
                View m68519bO = fixedBannerView.m68519bO(abstractC23323a);
                LinearLayout linearLayout3 = fixedBannerView.f63737M0;
                if (linearLayout3 == null) {
                    AbstractC19074t.m100223u("mainContainer");
                    linearLayout3 = null;
                }
                if (linearLayout3.indexOfChild(m68519bO) == -1) {
                    LinearLayout linearLayout4 = fixedBannerView.f63737M0;
                    if (linearLayout4 == null) {
                        AbstractC19074t.m100223u("mainContainer");
                        linearLayout4 = null;
                    }
                    linearLayout4.addView(m68519bO);
                }
                LinearLayout linearLayout5 = fixedBannerView.f63737M0;
                if (linearLayout5 == null) {
                    AbstractC19074t.m100223u("mainContainer");
                } else {
                    linearLayout = linearLayout5;
                }
                linearLayout.invalidate();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m68663a((C24860q) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$y */
    /* loaded from: classes5.dex */
    static final class C12245y extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12245y f63813q = new C12245y();

        C12245y() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC23792b mo12V4() {
            return AbstractC23306f.m120579F1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.msg.fixedbanner.FixedBannerView$z */
    /* loaded from: classes5.dex */
    public static final class C12246z extends AbstractC19075u implements InterfaceC18505l {
        C12246z() {
            super(1);
        }

        /* renamed from: a */
        public final void m68665a(boolean z11) {
            FixedBannerView.this.mo78960q3();
            if (z11) {
                AbstractC23304d.f113365b2 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_setting_notif_unmute_success));
                FixedBannerView.this.m68610yN();
                return;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_on_notification_update_setting_fail));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m68665a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    public FixedBannerView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        C29234i m145994a = AbstractC29235j.m145994a();
        this.f63738N0 = m145994a;
        m129210a = AbstractC24856m.m129210a(new C12238r());
        this.f63739O0 = m129210a;
        this.f63745U0 = "";
        m129210a2 = AbstractC24856m.m129210a(C12220b0.f63774q);
        this.f63746V0 = m129210a2;
        this.f63749Y0 = 360000L;
        m129210a3 = AbstractC24856m.m129210a(C12239s.f63799q);
        this.f63752b1 = m129210a3;
        this.f63755e1 = C16805b.Companion.m89811a().m89807v();
        m129210a4 = AbstractC24856m.m129210a(C12224d0.f63781q);
        this.f63756f1 = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(C12245y.f63813q);
        this.f63757g1 = m129210a5;
        this.f63760j1 = new Runnable() { // from class: u70.l
            @Override // java.lang.Runnable
            public final void run() {
                FixedBannerView.m68416AP(FixedBannerView.this);
            }
        };
        this.f63761k1 = AbstractC29233h.m145991b(m145994a, new C12226f());
        this.f63762l1 = AbstractC29233h.m145991b(m145994a, new C12225e());
        this.f63763m1 = AbstractC29233h.m145991b(m145994a, new C12229i());
        this.f63764n1 = AbstractC29233h.m145991b(m145994a, new C12223d());
        this.f63765o1 = AbstractC29233h.m145991b(m145994a, new C12230j());
        this.f63766p1 = AbstractC29233h.m145991b(m145994a, new C12227g());
        this.f63767q1 = AbstractC29233h.m145991b(m145994a, new C12228h());
        this.f63768r1 = AbstractC29233h.m145991b(m145994a, new C12234n());
        this.f63769s1 = AbstractC29233h.m145991b(m145994a, new C12233m());
        this.f63770t1 = AbstractC29233h.m145991b(m145994a, new C12232l());
        this.f63771u1 = AbstractC29233h.m145991b(m145994a, new C12231k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AN */
    public static final void m68414AN(FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        fixedBannerView.m68615zO().m139217V(new C23333k(0L, null, 0, 7, null));
    }

    /* renamed from: AO */
    private final View m68415AO(C23339q c23339q) {
        m68564mO().getRoot().setOnClickListener(null);
        AbstractC23291c m122744e = c23339q.m122744e();
        if (m122744e instanceof AbstractC23291c.a) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_change_pass_unknown_error_banner_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_change_pass_unknown_error_cta);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            m68465NP(this, m118743r0, m118743r02, c23339q.m122715d(), 0, 8, null);
        } else if (m122744e instanceof AbstractC23291c.c) {
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_change_pass_progressing, "");
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            m68473PP(m118746s0, ((AbstractC23291c.c) m122744e).mo120404a());
        } else if (AbstractC19074t.m100204b(m122744e, AbstractC23291c.d.f113055b)) {
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_change_pass_success);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            m68481RP("", m118743r03, "");
        }
        m68564mO().f139516t.setOnClickListener(new View.OnClickListener() { // from class: u70.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedBannerView.m68419BO(FixedBannerView.this, view);
            }
        });
        RelativeLayout root = m68564mO().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AP */
    public static final void m68416AP(FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        if (fixedBannerView.f63758h1) {
            return;
        }
        fixedBannerView.m68595uN();
        if (!fixedBannerView.f63758h1) {
            fixedBannerView.m68446IP(5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BN */
    public static final void m68418BN(FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        fixedBannerView.m68615zO().m139217V(new C23333k(0L, null, 0, 7, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BO */
    public static final void m68419BO(FixedBannerView fixedBannerView, View view) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        fixedBannerView.f63754d1 = true;
        fixedBannerView.m68615zO().m139217V(new C23339q(0L, null, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public static final void m68421CN(FixedBannerView fixedBannerView, SpannableString spannableString) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC19074t.m100208f(spannableString, "$spannableString");
        fixedBannerView.m68615zO().m139212O(new C23333k(fixedBannerView.m68615zO().m139214Q(), spannableString, fixedBannerView.f63744T0));
    }

    /* renamed from: CO */
    private final View m68422CO(C23336n c23336n) {
        C29772dg m68553jO = m68553jO();
        m68553jO.getRoot().setOnClickListener(null);
        m68553jO.f137602t.setOnClickListener(new View.OnClickListener() { // from class: u70.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedBannerView.m68426DO(FixedBannerView.this, view);
            }
        });
        m68553jO.f137601s.setOnClickListener(new View.OnClickListener() { // from class: u70.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedBannerView.m68430EO(FixedBannerView.this, view);
            }
        });
        RelativeLayout root = m68553jO().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: CP */
    private final void m68423CP(boolean z11, int i11, CharSequence charSequence) {
        f63735x1 = z11;
        if (z11) {
            m68615zO().m139212O(new C23325c(m68615zO().m139214Q(), i11, charSequence));
        } else {
            m68615zO().m139217V(new C23325c(0L, 0, null, 7, null));
        }
    }

    /* renamed from: DN */
    private final void m68425DN() {
        C23870a m120679j2 = AbstractC23306f.m120679j2();
        AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
        if (!C23870a.m124721U0(m120679j2, 0L, 1, null)) {
            m68604wP();
            m68434FP();
        } else {
            this.f63758h1 = false;
            m68446IP(0L);
            m68615zO().m139212O(new C23336n(AbstractC3489d.m17498f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DO */
    public static final void m68426DO(FixedBannerView fixedBannerView, View view) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC23152n3.m119050j0(fixedBannerView.m92689tK(), AbstractC23306f.m120583H().m110204g().m116312d());
    }

    /* renamed from: DP */
    static /* synthetic */ void m68427DP(FixedBannerView fixedBannerView, boolean z11, int i11, CharSequence charSequence, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            charSequence = "";
        }
        fixedBannerView.m68423CP(z11, i11, charSequence);
    }

    /* renamed from: EN */
    private final void m68429EN() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: u70.w
            @Override // java.lang.Runnable
            public final void run() {
                FixedBannerView.m68432FN(FixedBannerView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EO */
    public static final void m68430EO(FixedBannerView fixedBannerView, View view) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        fixedBannerView.m68456LO().m124845y1(fixedBannerView.m68599vO().mo124314i());
        fixedBannerView.m68604wP();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FN */
    public static final void m68432FN(final FixedBannerView fixedBannerView) {
        String str;
        EnumC23326d enumC23326d;
        String str2;
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        int i11 = 0;
        int m100600k = C19172a.m100600k("tab_msg_fixed_banner@notification_restrict@enable_type", 0);
        if (m100600k < 0 || 7 < m100600k) {
            m100600k = 0;
        }
        C23331i c23331i = C23331i.f113531a;
        boolean m122735k = c23331i.m122735k(m100600k, fixedBannerView.getContext());
        boolean m122736l = c23331i.m122736l(m100600k, fixedBannerView.getContext());
        boolean m122734j = c23331i.m122734j(m100600k, fixedBannerView.getContext());
        EnumC23326d enumC23326d2 = EnumC23326d.f113524s;
        if (m122736l) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_battery_saved_mode_fixed_banner_description);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_check_device_settings);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            enumC23326d = EnumC23326d.f113521p;
            str2 = m118743r02;
            str = m118743r0;
            i11 = 1;
        } else {
            str = "";
            enumC23326d = enumC23326d2;
            str2 = "";
        }
        if (m122735k) {
            if (Build.VERSION.SDK_INT < 31) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_battery_optimized_fixed_banner_description_below_12);
                AbstractC19074t.m100207e(str, "getString(...)");
            } else {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_battery_optimized_fixed_banner_description_12_above);
                AbstractC19074t.m100207e(str, "getString(...)");
            }
            str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_check_battery_settings);
            AbstractC19074t.m100207e(str2, "getString(...)");
            enumC23326d = EnumC23326d.f113522q;
            i11++;
        }
        if (m122734j) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_data_saved_mode_fixed_banner_description);
            AbstractC19074t.m100207e(str, "getString(...)");
            str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_check_device_settings);
            AbstractC19074t.m100207e(str2, "getString(...)");
            enumC23326d = EnumC23326d.f113523r;
            i11++;
        }
        fixedBannerView.m68598vN(m122736l, m122734j);
        if (i11 > 1) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_battery_and_data_saved_mode_fixed_banner_description);
            AbstractC19074t.m100207e(str, "getString(...)");
            str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_learn_more);
            AbstractC19074t.m100207e(str2, "getString(...)");
        } else {
            if (i11 == 1 && m122735k && !C18922m.m99141t().m99163x() && !AbstractC0924m0.m3453Ta()) {
                AbstractC0924m0.m4204si(true);
                AbstractC19444a.m101697e(new Runnable() { // from class: u70.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        FixedBannerView.m68436GN(FixedBannerView.this);
                    }
                });
                return;
            }
            enumC23326d2 = enumC23326d;
        }
        if (str.length() == 0 || !c23331i.m122733g()) {
            fixedBannerView.m68612yP();
        } else {
            fixedBannerView.m68471PN(str, str2, enumC23326d2);
        }
    }

    /* renamed from: FO */
    private final View m68433FO(final C23337o c23337o) {
        if (AbstractC23306f.m120636Y1().m128531p()) {
            m68557kO().f137814r.setText(m92652XI(AbstractC8020f0.str_zcloud_banner_remind_setup_title));
            m68557kO().f137813q.setText(m92652XI(AbstractC8020f0.str_zcloud_restore_banner_description));
            Button button = m68557kO().f137816t;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_connect_to_zcloud);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            String format = String.format(m92652XI, Arrays.copyOf(new Object[]{C16805b.Companion.m89811a().m89800f()}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            button.setText(format);
        } else {
            m68557kO().f137814r.setText(m92652XI(AbstractC8020f0.str_zcloud_banner_remind_restore_title));
            m68557kO().f137813q.setText(m92652XI(AbstractC8020f0.str_zcloud_banner_remind_restore_description));
            m68557kO().f137816t.setText(m92652XI(AbstractC8020f0.str_action_restore));
        }
        m68557kO().getRoot().setOnClickListener(null);
        ZAppCompatImageView zAppCompatImageView = m68557kO().f137815s;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_close_line_24, AbstractC2807a.banner_icon_close));
        m68557kO().f137815s.setOnClickListener(new View.OnClickListener() { // from class: u70.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedBannerView.m68437GO(FixedBannerView.this, c23337o, view);
            }
        });
        m68557kO().f137816t.setOnClickListener(new View.OnClickListener() { // from class: u70.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedBannerView.m68441HO(view);
            }
        });
        RelativeLayout root = m68557kO().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: FP */
    private final void m68434FP() {
        this.f63758h1 = true;
        ScheduledFuture scheduledFuture = this.f63759i1;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public static final void m68436GN(FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        C23331i.f113531a.m122740p(fixedBannerView.m92676n2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GO */
    public static final void m68437GO(FixedBannerView fixedBannerView, C23337o c23337o, View view) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC19074t.m100208f(c23337o, "$bannerItem");
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_banner_resume_service_dismiss", null, null, null, 14, null);
        AbstractC23306f.m120636Y1().m128518J(AbstractC3489d.m17498f());
        fixedBannerView.m68615zO().m139217V(c23337o);
    }

    /* renamed from: GP */
    private final void m68438GP() {
        m68442HP();
    }

    /* renamed from: HN */
    private final boolean m68440HN() {
        boolean z11;
        if (!this.f63755e1 || AbstractC23306f.m120679j2().m124792S0()) {
            return false;
        }
        if (AbstractC3489d.m17498f() - AbstractC23306f.m120636Y1().m128527l() > 43200000) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean m128530o = AbstractC23306f.m120636Y1().m128530o();
        if (z11 && m128530o) {
            m68615zO().m139212O(new C23337o(AbstractC3489d.m17498f()));
            return true;
        }
        m68615zO().m139217V(new C23337o(AbstractC3489d.m17498f()));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HO */
    public static final void m68441HO(View view) {
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_banner_resume_service_accept", null, null, null, 14, null);
        C22438j.m115954w(C13958c.b.f71926r);
    }

    /* renamed from: HP */
    private final void m68442HP() {
        m68615zO().m139213P().m9219j(this, new C12241u(new C12244x()));
    }

    /* renamed from: IN */
    private final void m68444IN() {
        boolean z11;
        if (!this.f63755e1) {
            return;
        }
        if (AbstractC3489d.m17498f() - AbstractC23306f.m120636Y1().m128528m() > 21600000) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean m128536u = AbstractC23306f.m120636Y1().m128536u();
        if (AbstractC23306f.m120636Y1().m128529n() && z11 && m128536u) {
            m68615zO().m139212O(new C23338p(AbstractC3489d.m17498f()));
        } else {
            m68615zO().m139217V(new C23338p(AbstractC3489d.m17498f()));
        }
    }

    /* renamed from: IO */
    private final View m68445IO(final C23338p c23338p) {
        m68560lO().getRoot().setOnClickListener(null);
        ZAppCompatImageView zAppCompatImageView = m68560lO().f137920s;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_close_line_24, AbstractC2807a.banner_icon_close));
        m68560lO().f137920s.setOnClickListener(new View.OnClickListener() { // from class: u70.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedBannerView.m68449JO(FixedBannerView.this, c23338p, view);
            }
        });
        m68560lO().f137921t.setOnClickListener(new View.OnClickListener() { // from class: u70.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedBannerView.m68452KO(view);
            }
        });
        RelativeLayout root = m68560lO().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: IP */
    private final void m68446IP(long j11) {
        this.f63759i1 = AbstractC17930e.Companion.m94551d().mo94531e(this.f63760j1, j11);
    }

    /* renamed from: JN */
    private final void m68448JN() {
        if (!C26626l.Companion.m136712a().m136691C()) {
            return;
        }
        if (AbstractC0924m0.m3455Tc() && AbstractC0924m0.m3484Uc()) {
            m68615zO().m139217V(new C23341s(m68615zO().m139214Q(), null, 2, null));
            return;
        }
        AbstractC0924m0.m3495Un(true);
        if (AbstractC0924m0.m3455Tc() && !m92672lJ()) {
            m68615zO().m139217V(new C23341s(m68615zO().m139214Q(), null, 2, null));
        } else {
            m68615zO().m139212O(new C23341s(m68615zO().m139214Q(), new AbstractC28981d.e(-1, new InterfaceC28990m[0])));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JO */
    public static final void m68449JO(FixedBannerView fixedBannerView, C23338p c23338p, View view) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC19074t.m100208f(c23338p, "$bannerItem");
        C26676b.f126324a.m136972K(view.getId());
        AbstractC23306f.m120636Y1().m128519K(AbstractC3489d.m17498f());
        fixedBannerView.m68615zO().m139217V(c23338p);
    }

    /* renamed from: JP */
    private final void m68450JP() {
        mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C25244a.m130623Q(true, new C12246z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KO */
    public static final void m68452KO(View view) {
        C26676b.f126324a.m136972K(view.getId());
        C26626l.m136689z(C26626l.Companion.m136712a(), true, false, 2, null);
    }

    /* renamed from: KP */
    private final void m68453KP() {
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 10036);
        bVar.m124119a().m124117e(this, 150803);
        bVar.m124119a().m124117e(this, 150811);
        bVar.m124119a().m124117e(this, 150808);
        bVar.m124119a().m124117e(this, 150804);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:            if (r6.f63748X0 != 1) goto L21;     */
    /* renamed from: LN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m68455LN(final FixedBannerView fixedBannerView) {
        final boolean z11;
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        String m121120Kd = AbstractC23309i.m121120Kd();
        if (!TextUtils.isEmpty(m121120Kd)) {
            try {
                fixedBannerView.f63747W0 = new JSONObject(m121120Kd).getBoolean("is_set_dob");
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        String m121046Id = AbstractC23309i.m121046Id();
        if (!TextUtils.isEmpty(m121046Id)) {
            try {
                fixedBannerView.f63748X0 = new JSONObject(m121046Id).optInt("needUpdateInfo");
                fixedBannerView.f63749Y0 = r1.optInt("intervalTimeRemind");
            } catch (Exception e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
            }
        }
        if (fixedBannerView.m68615zO().m139214Q() - AbstractC23309i.m121113K6() > fixedBannerView.f63749Y0 * 1000) {
            z11 = true;
            if (fixedBannerView.f63747W0) {
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: u70.n0
                @Override // java.lang.Runnable
                public final void run() {
                    FixedBannerView.m68459MN(z11, fixedBannerView);
                }
            });
        }
        z11 = false;
        AbstractC19444a.m101697e(new Runnable() { // from class: u70.n0
            @Override // java.lang.Runnable
            public final void run() {
                FixedBannerView.m68459MN(z11, fixedBannerView);
            }
        });
    }

    /* renamed from: LO */
    private final C23870a m68456LO() {
        return (C23870a) this.f63756f1.getValue();
    }

    /* renamed from: LP */
    private final void m68457LP(CharSequence charSequence, int i11) {
        C30057tf m68564mO = m68564mO();
        RelativeLayout root = m68564mO.getRoot();
        root.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.layer_background_selected));
        int i12 = AbstractC23222t7.f112586t;
        root.setPadding(i12, 0, i12, 0);
        ZAppCompatImageView zAppCompatImageView = m68564mO.f139517u;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_backup_warning_solid_24, AbstractC2807a.icon_tertiary));
        ViewGroup.LayoutParams layoutParams = zAppCompatImageView.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(6);
        layoutParams2.addRule(15);
        ProgressBar progressBar = m68564mO.f139519w;
        progressBar.setVisibility(0);
        progressBar.setProgressIndicatorColor(C23212s8.m119606n(AbstractC28291a.storage_legend_paused));
        progressBar.setProgressBackgroundColor(C23212s8.m119606n(AbstractC2807a.storage_legend_empty));
        progressBar.setProgress(i11);
        progressBar.invalidate();
        RobotoTextView robotoTextView = m68564mO.f139514r;
        robotoTextView.setText(charSequence);
        robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.text_secondary));
        robotoTextView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams3 = robotoTextView.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams3).setMargins(0, 0, 0, 0);
        m68564mO.f139520x.setVisibility(8);
        m68564mO.f139515s.setVisibility(8);
        m68564mO.f139516t.setVisibility(8);
        m68564mO.f139513q.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MN */
    public static final void m68459MN(boolean z11, FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        if (z11) {
            fixedBannerView.m68615zO().m139212O(new C23334l(fixedBannerView.m68615zO().m139214Q()));
        } else {
            fixedBannerView.m68615zO().m139217V(new C23334l(0L, 1, null));
        }
    }

    /* renamed from: MO */
    private final View m68460MO(final C23340r c23340r) {
        int i11;
        int i12;
        String str;
        int m119606n;
        Drawable m139660c;
        String m92652XI;
        String m92652XI2;
        String m92652XI3;
        Drawable drawable;
        Drawable drawable2;
        int m127173b0;
        String m92652XI4;
        int m127173b02;
        float m116583f;
        if (c23340r.m122745e() instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c) {
            C0697c0.Companion.m1048b().m1043u("ZCloudGraceBanner");
        }
        C30057tf m68564mO = m68564mO();
        m68564mO.getRoot().setPadding(AbstractC23222t7.f112586t, 0, AbstractC23222t7.f112562h, 0);
        ViewGroup.LayoutParams layoutParams = m68564mO.f139517u.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(15);
        layoutParams2.addRule(6, AbstractC6918a0.ll_content);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C26703b m137293a = C26705d.m137293a(m92689tK, AbstractC2814h.t_large_m);
        RobotoTextView robotoTextView = m68564mO.f139515s;
        AbstractC19074t.m100207e(robotoTextView, "bannerTitle");
        new C26708g(robotoTextView).m137319a(m137293a);
        m68564mO.f139515s.setTextColor(C23212s8.m119606n(AbstractC2807a.banner_title));
        m68564mO.f139514r.setTextColor(C23212s8.m119606n(AbstractC2807a.banner_description));
        ViewGroup.LayoutParams layoutParams3 = m68564mO.f139516t.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams3).setMargins(AbstractC23222t7.f112566j, 0, 0, 0);
        ProgressBar progressBar = m68564mO.f139519w;
        if (c23340r.m122745e() instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        progressBar.setVisibility(i11);
        RobotoTextView robotoTextView2 = m68564mO.f139516t;
        robotoTextView2.setVisibility(0);
        String str2 = "";
        robotoTextView2.setText("");
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        robotoTextView2.setCompoundDrawablesWithIntrinsicBounds(C27280g.m139660c(m92689tK2, AbstractC2810d.zds_ic_close_line_24, AbstractC2807a.icon_tertiary), (Drawable) null, (Drawable) null, (Drawable) null);
        RobotoTextView robotoTextView3 = m68564mO.f139515s;
        if (c23340r.m122745e() instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        robotoTextView3.setVisibility(i12);
        m68564mO.f139520x.setVisibility(8);
        final C16888a m120627V1 = AbstractC23306f.m120627V1();
        AbstractC19074t.m100207e(m120627V1, "provideZCloudGracePeriodManager(...)");
        ZaloCloudRecoverCloudMediaWorker.AbstractC16884f m122745e = c23340r.m122745e();
        if (!(m122745e instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c)) {
            str = "ZCloudGraceBanner";
            if (m122745e instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) {
                int m90237g = m120627V1.m90237g();
                AbstractC16889b.c cVar = AbstractC16889b.c.f85930d;
                if (m90237g != cVar.m90258a()) {
                    m120627V1.m90222E(cVar.m90258a());
                }
                m68564mO.getRoot().setBackgroundColor(C23212s8.m119606n(AbstractC2807a.banner_container_informative));
                ZAppCompatImageView zAppCompatImageView = m68564mO.f139517u;
                Context m92689tK3 = m92689tK();
                AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
                zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK3, AbstractC2810d.zds_ic_cloud_download_solid_24, AbstractC2807a.information_icon));
                RobotoTextView robotoTextView4 = m68564mO.f139514r;
                ViewGroup.LayoutParams layoutParams4 = robotoTextView4.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams4).setMargins(0, 0, 0, 0);
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                decimalFormat.setRoundingMode(RoundingMode.FLOOR);
                String str3 = decimalFormat.format(Float.valueOf(((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) c23340r.m122745e()).m90209b())) + "%";
                SpannableString spannableString = new SpannableString(m92652XI(AbstractC8020f0.str_downloading_media) + " " + str3);
                m127173b02 = AbstractC24342w.m127173b0(spannableString, str3, 0, false, 6, null);
                spannableString.setSpan(new StyleSpan(1), m127173b02, str3.length() + m127173b02, 0);
                robotoTextView4.setText(spannableString);
                robotoTextView4.setVisibility(0);
                RobotoTextView robotoTextView5 = m68564mO.f139513q;
                robotoTextView5.setText(m92652XI(AbstractC8020f0.str_view_details));
                robotoTextView5.setVisibility(0);
                robotoTextView5.setOnClickListener(new View.OnClickListener() { // from class: u70.x0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FixedBannerView.m68468OO(view);
                    }
                });
                ProgressBar progressBar2 = m68564mO.f139519w;
                m116583f = AbstractC22543l.m116583f(((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) c23340r.m122745e()).m90209b(), 100.0f);
                progressBar2.setProgress((int) m116583f);
                RobotoTextView robotoTextView6 = m68564mO.f139516t;
                robotoTextView6.setVisibility(0);
                robotoTextView6.setOnClickListener(new View.OnClickListener() { // from class: u70.y0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FixedBannerView.m68472PO(FixedBannerView.this, m120627V1, view);
                    }
                });
                AbstractC19074t.m100205c(robotoTextView6);
            } else if (m122745e instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) {
                String m92652XI5 = m92652XI(AbstractC8020f0.str_media_download_paused);
                SpannableString spannableString2 = new SpannableString("");
                AbstractC16889b m90210b = ((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) c23340r.m122745e()).m90210b();
                if (!(m90210b instanceof AbstractC16889b.c)) {
                    if ((m90210b instanceof AbstractC16889b.e) || (m90210b instanceof AbstractC16889b.f)) {
                        m68564mO.getRoot().setBackgroundColor(C23212s8.m119606n(AbstractC2807a.banner_container_warning));
                        Context m92689tK4 = m92689tK();
                        AbstractC19074t.m100207e(m92689tK4, "requireContext(...)");
                        Drawable m139660c2 = C27280g.m139660c(m92689tK4, AbstractC2810d.zds_ic_backup_warning_solid_24, AbstractC2807a.warning_icon);
                        SpannableString spannableString3 = new SpannableString(m92652XI(AbstractC8020f0.str_an_error_occurs));
                        str2 = m92652XI(AbstractC8020f0.str_continue_download);
                        AbstractC19074t.m100207e(str2, "getString(...)");
                        final RobotoTextView robotoTextView7 = m68564mO.f139513q;
                        robotoTextView7.setVisibility(0);
                        robotoTextView7.setOnClickListener(new View.OnClickListener() { // from class: u70.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                FixedBannerView.m68476QO(RobotoTextView.this, view);
                            }
                        });
                        m68564mO.f139516t.setVisibility(8);
                        drawable2 = m139660c2;
                        spannableString2 = spannableString3;
                    } else if (m90210b instanceof AbstractC16889b.b) {
                        m68564mO.getRoot().setBackgroundColor(C23212s8.m119606n(AbstractC2807a.layer_background_selected));
                        Context m92689tK5 = m92689tK();
                        AbstractC19074t.m100207e(m92689tK5, "requireContext(...)");
                        drawable2 = C27280g.m139660c(m92689tK5, AbstractC2810d.zds_ic_backup_warning_solid_24, AbstractC2807a.icon_tertiary);
                        spannableString2 = new SpannableString(m92652XI(AbstractC8020f0.str_zcloud_migration_network_error));
                        m68564mO.f139513q.setVisibility(8);
                        m68564mO.f139516t.setVisibility(0);
                    } else if (m90210b instanceof AbstractC16889b.a) {
                        m68564mO.getRoot().setBackgroundColor(C23212s8.m119606n(AbstractC2807a.layer_background_selected));
                        Context m92689tK6 = m92689tK();
                        AbstractC19074t.m100207e(m92689tK6, "requireContext(...)");
                        drawable2 = C27280g.m139660c(m92689tK6, AbstractC2810d.zds_ic_backup_warning_solid_24, AbstractC2807a.icon_tertiary);
                        spannableString2 = new SpannableString(m92652XI(AbstractC8020f0.str_err_battery));
                        m68564mO.f139513q.setVisibility(8);
                        m68564mO.f139516t.setVisibility(0);
                    } else if (m90210b instanceof AbstractC16889b.d) {
                        m68564mO.getRoot().setBackgroundColor(C23212s8.m119606n(AbstractC2807a.banner_container_warning));
                        Context m92689tK7 = m92689tK();
                        AbstractC19074t.m100207e(m92689tK7, "requireContext(...)");
                        Drawable m139660c3 = C27280g.m139660c(m92689tK7, AbstractC2810d.zds_ic_backup_warning_solid_24, AbstractC2807a.warning_icon);
                        String m111038f = C21459a.m111038f(((AbstractC16889b.d) ((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) c23340r.m122745e()).m90210b()).m90260c(), 0, 2, null);
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String m92652XI6 = m92652XI(AbstractC8020f0.str_your_device_needs_more_free_space);
                        AbstractC19074t.m100207e(m92652XI6, "getString(...)");
                        String format = String.format(m92652XI6, Arrays.copyOf(new Object[]{m111038f}, 1));
                        AbstractC19074t.m100207e(format, "format(...)");
                        SpannableString spannableString4 = new SpannableString(format);
                        m127173b0 = AbstractC24342w.m127173b0(spannableString4, m111038f, 0, false, 6, null);
                        spannableString4.setSpan(new StyleSpan(1), m127173b0, m111038f.length() + m127173b0, 0);
                        if (AbstractC23152n3.m119051k(getContext())) {
                            m92652XI4 = m92652XI(AbstractC8020f0.str_free_up_storage);
                            AbstractC19074t.m100205c(m92652XI4);
                        } else {
                            m92652XI4 = m92652XI(AbstractC8020f0.str_view_instructions);
                            AbstractC19074t.m100205c(m92652XI4);
                        }
                        final RobotoTextView robotoTextView8 = m68564mO.f139513q;
                        robotoTextView8.setVisibility(0);
                        robotoTextView8.setOnClickListener(new View.OnClickListener() { // from class: u70.c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                FixedBannerView.m68480RO(RobotoTextView.this, this, view);
                            }
                        });
                        m68564mO.f139516t.setVisibility(8);
                        drawable2 = m139660c3;
                        spannableString2 = spannableString4;
                        str2 = m92652XI4;
                    } else {
                        drawable = null;
                    }
                    m68564mO.f139517u.setImageDrawable(drawable2);
                    RobotoTextView robotoTextView9 = m68564mO.f139515s;
                    robotoTextView9.setTextColor(C23212s8.m119606n(AbstractC2807a.banner_title));
                    robotoTextView9.setText(m92652XI5);
                    RobotoTextView robotoTextView10 = m68564mO.f139514r;
                    ViewGroup.LayoutParams layoutParams5 = robotoTextView10.getLayoutParams();
                    AbstractC19074t.m100206d(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    ((RelativeLayout.LayoutParams) layoutParams5).setMargins(0, AbstractC23222t7.f112566j, 0, 0);
                    robotoTextView10.setText(spannableString2);
                    robotoTextView10.setVisibility(0);
                    robotoTextView10.setTextColor(C23212s8.m119606n(AbstractC2807a.banner_description));
                    m68564mO.f139513q.setText(str2);
                    m68564mO.f139516t.setOnClickListener(new View.OnClickListener() { // from class: u70.d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FixedBannerView.m68484SO(FixedBannerView.this, m120627V1, c23340r, view);
                        }
                    });
                } else {
                    drawable = null;
                }
                drawable2 = drawable;
                m68564mO.f139517u.setImageDrawable(drawable2);
                RobotoTextView robotoTextView92 = m68564mO.f139515s;
                robotoTextView92.setTextColor(C23212s8.m119606n(AbstractC2807a.banner_title));
                robotoTextView92.setText(m92652XI5);
                RobotoTextView robotoTextView102 = m68564mO.f139514r;
                ViewGroup.LayoutParams layoutParams52 = robotoTextView102.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams52, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams52).setMargins(0, AbstractC23222t7.f112566j, 0, 0);
                robotoTextView102.setText(spannableString2);
                robotoTextView102.setVisibility(0);
                robotoTextView102.setTextColor(C23212s8.m119606n(AbstractC2807a.banner_description));
                m68564mO.f139513q.setText(str2);
                m68564mO.f139516t.setOnClickListener(new View.OnClickListener() { // from class: u70.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FixedBannerView.m68484SO(FixedBannerView.this, m120627V1, c23340r, view);
                    }
                });
            } else if (m122745e instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d) {
                final int m90211b = ((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d) c23340r.m122745e()).m90211b();
                RobotoTextView robotoTextView11 = m68564mO.f139514r;
                ViewGroup.LayoutParams layoutParams6 = robotoTextView11.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams6, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams6).setMargins(0, AbstractC23222t7.f112556e, 0, 0);
                robotoTextView11.setVisibility(0);
                RelativeLayout root = m68564mO.getRoot();
                if (m90211b == 4) {
                    m119606n = C23212s8.m119606n(AbstractC2807a.banner_container_warning);
                } else {
                    m119606n = C23212s8.m119606n(AbstractC2807a.banner_container_success);
                }
                root.setBackgroundColor(m119606n);
                ZAppCompatImageView zAppCompatImageView2 = m68564mO.f139517u;
                if (m90211b == 4) {
                    Context m92689tK8 = m92689tK();
                    AbstractC19074t.m100207e(m92689tK8, "requireContext(...)");
                    m139660c = C27280g.m139660c(m92689tK8, AbstractC2810d.zds_ic_backup_warning_solid_24, AbstractC2807a.warning_icon);
                } else {
                    Context m92689tK9 = m92689tK();
                    AbstractC19074t.m100207e(m92689tK9, "requireContext(...)");
                    m139660c = C27280g.m139660c(m92689tK9, AbstractC2810d.zds_ic_check_circle_solid_24, AbstractC2807a.success_icon);
                }
                zAppCompatImageView2.setImageDrawable(m139660c);
                RobotoTextView robotoTextView12 = m68564mO.f139515s;
                if (m90211b != 4) {
                    if (m90211b != 5) {
                        m92652XI = m92652XI(AbstractC8020f0.str_media_messages_downloaded_successfully);
                    } else {
                        m92652XI = m92652XI(AbstractC8020f0.str_all_media_available);
                    }
                } else {
                    m92652XI = m92652XI(AbstractC8020f0.str_expired_on_zcloud);
                }
                robotoTextView12.setText(m92652XI);
                RobotoTextView robotoTextView13 = m68564mO.f139514r;
                if (m90211b != 4) {
                    if (m90211b != 5) {
                        m92652XI2 = m92652XI(AbstractC8020f0.f43852x35a32c56);
                    } else {
                        m92652XI2 = m92652XI(AbstractC8020f0.str_from_now_on_new_media_messages_will_also_be_stored);
                    }
                } else {
                    m92652XI2 = m92652XI(AbstractC8020f0.str_msg_download_has_ended_banner_description);
                }
                robotoTextView13.setText(m92652XI2);
                RobotoTextView robotoTextView14 = m68564mO.f139513q;
                if (m90211b == 5) {
                    m92652XI3 = m92652XI(AbstractC8020f0.str_view_stored_media);
                } else {
                    m92652XI3 = m92652XI(AbstractC8020f0.str_view_downloaded_media);
                }
                robotoTextView14.setText(m92652XI3);
                robotoTextView14.setVisibility(0);
                robotoTextView14.setOnClickListener(new View.OnClickListener() { // from class: u70.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FixedBannerView.m68488TO(FixedBannerView.this, m120627V1, m90211b, view);
                    }
                });
                RobotoTextView robotoTextView15 = m68564mO.f139516t;
                robotoTextView15.setVisibility(0);
                robotoTextView15.setOnClickListener(new View.OnClickListener() { // from class: u70.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FixedBannerView.m68492UO(FixedBannerView.this, m120627V1, view);
                    }
                });
                AbstractC19074t.m100205c(robotoTextView15);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            m68564mO.getRoot().setBackgroundColor(C23212s8.m119606n(AbstractC2807a.banner_container_warning));
            ZAppCompatImageView zAppCompatImageView3 = m68564mO.f139517u;
            Context m92689tK10 = m92689tK();
            AbstractC19074t.m100207e(m92689tK10, "requireContext(...)");
            zAppCompatImageView3.setImageDrawable(C27280g.m139660c(m92689tK10, AbstractC2810d.zds_ic_warning_solid_24, AbstractC2807a.warning_icon));
            RobotoTextView robotoTextView16 = m68564mO.f139515s;
            C0860a m120691m2 = AbstractC23306f.m120691m2();
            AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
            long m2453g = C0860a.m2453g(m120691m2, false, 1, null);
            C23870a m68456LO = m68456LO();
            AbstractC19074t.m100207e(m68456LO, "<get-zaloCloudRepo>(...)");
            str = "ZCloudGraceBanner";
            robotoTextView16.setText(robotoTextView16.getResources().getQuantityString(AbstractC7921d0.str_zcloud_grace_period_banner_title, (int) m2453g, Long.valueOf(m2453g), C21459a.m111038f(C23870a.m124718I0(m68456LO, false, null, null, 6, null).m41251i().m41265a(), 0, 2, null)));
            RobotoTextView robotoTextView17 = m68564mO.f139514r;
            robotoTextView17.setText(m92653YI(AbstractC8020f0.str_zcloud_grace_period_banner_desc, C16805b.Companion.m89811a().m89800f()));
            robotoTextView17.setVisibility(0);
            ViewGroup.LayoutParams layoutParams7 = robotoTextView17.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams7).setMargins(0, AbstractC23222t7.f112566j, 0, 0);
            RobotoTextView robotoTextView18 = m68564mO.f139513q;
            robotoTextView18.setText(m92652XI(AbstractC8020f0.str_zcloud_grace_period_banner_cta));
            robotoTextView18.setVisibility(0);
            robotoTextView18.setOnClickListener(new View.OnClickListener() { // from class: u70.v0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FixedBannerView.m68496VO(view);
                }
            });
            RobotoTextView robotoTextView19 = m68564mO.f139516t;
            robotoTextView19.setVisibility(0);
            robotoTextView19.setOnClickListener(new View.OnClickListener() { // from class: u70.w0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FixedBannerView.m68464NO(C16888a.this, this, c23340r, view);
                }
            });
            ViewGroup.LayoutParams layoutParams8 = robotoTextView19.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams8, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) layoutParams8;
            layoutParams9.setMargins(AbstractC23222t7.f112576o, AbstractC23222t7.f112562h, 0, 0);
            layoutParams9.removeRule(15);
            AbstractC19074t.m100205c(robotoTextView19);
        }
        if (c23340r.m122745e() instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c) {
            C0697c0.Companion.m1048b().m1035h(str);
        }
        RelativeLayout root2 = m68564mO().getRoot();
        AbstractC19074t.m100207e(root2, "getRoot(...)");
        return root2;
    }

    /* renamed from: MP */
    private final void m68461MP(final String str, String str2, final EnumC22502a enumC22502a, final int i11) {
        C30057tf m68564mO = m68564mO();
        RelativeLayout root = m68564mO.getRoot();
        root.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.layer_background_selected));
        root.setPadding(AbstractC23222t7.f112586t, 0, AbstractC23222t7.f112562h, 0);
        ZAppCompatImageView zAppCompatImageView = m68564mO.f139517u;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_backup_warning_solid_24, AbstractC2807a.icon_tertiary));
        ViewGroup.LayoutParams layoutParams = zAppCompatImageView.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(15);
        layoutParams2.addRule(6, AbstractC6918a0.ll_content);
        RobotoTextView robotoTextView = m68564mO.f139514r;
        robotoTextView.setText(str);
        robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.banner_description));
        robotoTextView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams3 = robotoTextView.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams3).setMargins(0, 0, 0, 0);
        RobotoTextView robotoTextView2 = m68564mO.f139513q;
        robotoTextView2.setText(str2);
        robotoTextView2.setVisibility(0);
        robotoTextView2.setOnClickListener(new View.OnClickListener() { // from class: u70.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedBannerView.m68469OP(EnumC22502a.this, str, this, i11, view);
            }
        });
        m68564mO.f139516t.setVisibility(8);
        m68564mO.f139515s.setVisibility(8);
        m68564mO.f139520x.setVisibility(8);
        m68564mO.f139519w.setVisibility(8);
    }

    /* renamed from: NN */
    private final void m68463NN() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && m92676n2.mo35576n3() && m68615zO().m139216U(EnumC22502a.f110111p)) {
            C30983c m150606e = C30981a.m150598f().m150606e();
            AbstractC19074t.m100207e(m150606e, "getConnectionStateWithTime(...)");
            EnumC30982b enumC30982b = m150606e.f142944a;
            if (enumC30982b != EnumC30982b.CONNECTED) {
                C30981a.f142932d = enumC30982b;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NO */
    public static final void m68464NO(C16888a c16888a, FixedBannerView fixedBannerView, C23340r c23340r, View view) {
        AbstractC19074t.m100208f(c16888a, "$zCloudGracePeriodManager");
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC19074t.m100208f(c23340r, "$bannerItem");
        C0860a m120691m2 = AbstractC23306f.m120691m2();
        AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
        c16888a.m90219B(((int) C0860a.m2453g(m120691m2, false, 1, null)) - 1);
        fixedBannerView.m68615zO().m139217V(new C23340r(AbstractC3489d.m17498f(), c23340r.m122745e()));
    }

    /* renamed from: NP */
    static /* synthetic */ void m68465NP(FixedBannerView fixedBannerView, String str, String str2, EnumC22502a enumC22502a, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        fixedBannerView.m68461MP(str, str2, enumC22502a, i11);
    }

    /* renamed from: ON */
    private final void m68467ON(EnumC30982b enumC30982b) {
        if (m92672lJ() && this.f63740P0 != null && enumC30982b != null) {
            int i11 = C12221c.f63777c[enumC30982b.ordinal()];
            int i12 = 5;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 5) {
                        EnumC30982b enumC30982b2 = this.f63740P0;
                        if (enumC30982b2 == EnumC30982b.NO_NETWORK) {
                            i12 = 2;
                        } else if (enumC30982b2 == EnumC30982b.CONNECTING) {
                            i12 = 4;
                        } else if (enumC30982b2 == EnumC30982b.AIRPLANE) {
                            i12 = 7;
                        }
                    }
                    i12 = 0;
                } else {
                    EnumC30982b enumC30982b3 = this.f63740P0;
                    if (enumC30982b3 == EnumC30982b.NO_NETWORK) {
                        i12 = 1;
                    } else if (enumC30982b3 == EnumC30982b.CONNECTING) {
                        i12 = 3;
                    } else if (enumC30982b3 == EnumC30982b.CONNECTED) {
                        i12 = 6;
                    } else {
                        if (enumC30982b3 == EnumC30982b.AIRPLANE) {
                            i12 = 8;
                        }
                        i12 = 0;
                    }
                }
            } else {
                EnumC30982b enumC30982b4 = this.f63740P0;
                if (enumC30982b4 != EnumC30982b.CONNECTED) {
                    if (enumC30982b4 == EnumC30982b.AIRPLANE) {
                        i12 = 9;
                    }
                    i12 = 0;
                }
            }
            if (i12 > 0) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format("380%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                AbstractC23647d.m123897g(format);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OO */
    public static final void m68468OO(View view) {
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_banner_check_detail", null, null, null, 14, null);
        C26626l m120695n2 = AbstractC23306f.m120695n2();
        AbstractC19074t.m100207e(m120695n2, "provideZaloCloudUIHandler(...)");
        C26626l.m136673g0(m120695n2, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OP */
    public static final void m68469OP(EnumC22502a enumC22502a, String str, FixedBannerView fixedBannerView, int i11, View view) {
        Context context;
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(enumC22502a, "$bannerType");
        AbstractC19074t.m100208f(str, "$desc");
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        if (C12221c.f63775a[enumC22502a.ordinal()] == 8) {
            String m89800f = C16805b.Companion.m89811a().m89800f();
            if (AbstractC19074t.m100204b(str, AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_drive_error_desc, m89800f))) {
                TargetBackupInfo m135059x = C26263i.m135059x(C26263i.m135055u().m135087t());
                if (m135059x != null) {
                    AbstractC23211s7.m119566F(fixedBannerView.m92692wK(), m135059x, i11);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    return;
                }
                return;
            }
            if (AbstractC19074t.m100204b(str, AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_restore_error_banner_desc, m89800f))) {
                C22438j.f109770a.m115962z();
                return;
            }
            if (AbstractC19074t.m100204b(str, AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_pause, m89800f))) {
                InterfaceC27218a m92676n2 = fixedBannerView.m92676n2();
                if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                    mo35579p.m93069k2(ZCloudHomeView.class, null, 1, true);
                    return;
                }
                return;
            }
            if (AbstractC19074t.m100204b(str, AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_restore_message_error_banner_desc))) {
                InterfaceC27218a m92676n22 = fixedBannerView.m92676n2();
                if (m92676n22 != null && (context = m92676n22.getContext()) != null) {
                    C26676b.f126324a.m137010x();
                    C26626l.Companion.m136712a().m136696M(context, "banner");
                    return;
                }
                return;
            }
            if (i11 == -1) {
                C28989l.m144728I(C28989l.Companion.m144769a(), false, 1, null);
            } else {
                C28989l.m144729K(C28989l.Companion.m144769a(), i11, false, false, 6, null);
            }
            if (AbstractC19074t.m100204b(str, AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_restore_message_storage_error_banner_desc))) {
                C26676b.f126324a.m136975N(i11, "tab_chat");
                return;
            } else {
                C26676b.f126324a.m136973L();
                return;
            }
        }
        C25727d.Companion.m132789m();
    }

    /* renamed from: PN */
    private final void m68471PN(String str, String str2, EnumC23326d enumC23326d) {
        final C23327e c23327e = new C23327e(m68615zO().m139214Q(), str, str2, enumC23326d);
        AbstractC19444a.m101697e(new Runnable() { // from class: u70.r0
            @Override // java.lang.Runnable
            public final void run() {
                FixedBannerView.m68475QN(FixedBannerView.this, c23327e);
            }
        });
        C23331i.f113531a.m122731e(c23327e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PO */
    public static final void m68472PO(FixedBannerView fixedBannerView, C16888a c16888a, View view) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC19074t.m100208f(c16888a, "$zCloudGracePeriodManager");
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_banner_dismiss", null, null, null, 14, null);
        fixedBannerView.m68615zO().m139217V(new C23340r(0L, null, 3, null));
        c16888a.m90223F(true);
    }

    /* renamed from: PP */
    private final void m68473PP(String str, int i11) {
        C30057tf m68564mO = m68564mO();
        RelativeLayout root = m68564mO.getRoot();
        root.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.banner_container_informative));
        int i12 = AbstractC23222t7.f112586t;
        root.setPadding(i12, 0, i12, 0);
        root.setOnClickListener(new View.OnClickListener() { // from class: u70.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedBannerView.m68477QP(FixedBannerView.this, view);
            }
        });
        ZAppCompatImageView zAppCompatImageView = m68564mO.f139517u;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_zcloud_solid_24, AbstractC2807a.accent_blue_icon));
        ViewGroup.LayoutParams layoutParams = zAppCompatImageView.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(6);
        layoutParams2.addRule(15);
        ProgressBar progressBar = m68564mO.f139519w;
        progressBar.setProgress(i11);
        progressBar.setProgressIndicatorColor(C23212s8.m119606n(AbstractC2807a.progress_indicator_blue));
        progressBar.setProgressBackgroundColor(C23212s8.m119606n(AbstractC2807a.progress_track_background_black));
        progressBar.setVisibility(0);
        RobotoTextView robotoTextView = m68564mO.f139514r;
        robotoTextView.setText(str);
        robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.text_primary));
        robotoTextView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams3 = robotoTextView.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams3).setMargins(0, 0, 0, 0);
        RobotoTextView robotoTextView2 = m68564mO.f139520x;
        robotoTextView2.setText(i11 + "%");
        robotoTextView2.setVisibility(0);
        m68564mO.f139516t.setVisibility(8);
        m68564mO.f139515s.setVisibility(8);
        m68564mO.f139513q.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QN */
    public static final void m68475QN(FixedBannerView fixedBannerView, C23327e c23327e) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC19074t.m100208f(c23327e, "$item");
        fixedBannerView.m68615zO().m139212O(c23327e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QO */
    public static final void m68476QO(RobotoTextView robotoTextView, View view) {
        AbstractC19074t.m100208f(robotoTextView, "$this_apply");
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_banner_manual_resume", null, null, null, 14, null);
        ZaloCloudRecoverCloudMediaWorker.Companion.m90205q(robotoTextView.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QP */
    public static final void m68477QP(FixedBannerView fixedBannerView, View view) {
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        InterfaceC27218a m92676n2 = fixedBannerView.m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(ZCloudHomeView.class, null, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RN */
    public final ViewOnClickListenerC0139g.b m68479RN() {
        return new C12235o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RO */
    public static final void m68480RO(RobotoTextView robotoTextView, FixedBannerView fixedBannerView, View view) {
        AbstractC19074t.m100208f(robotoTextView, "$this_apply");
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        if (AbstractC23152n3.m119051k(robotoTextView.getContext())) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_banner_free_storage", null, null, null, 14, null);
            AbstractC23152n3.m119078x0(robotoTextView.getContext());
        } else {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_banner_full_storage_help", null, null, null, 14, null);
            AbstractC23152n3.m119050j0(fixedBannerView.m92689tK(), C21275a.Companion.m110211a().m110204g().m116313e());
        }
    }

    /* renamed from: RP */
    private final void m68481RP(String str, String str2, String str3) {
        int i11;
        int i12;
        int i13;
        C30057tf m68564mO = m68564mO();
        RelativeLayout root = m68564mO.getRoot();
        root.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.banner_container_success));
        root.setPadding(AbstractC23222t7.f112586t, 0, AbstractC23222t7.f112562h, 0);
        ZAppCompatImageView zAppCompatImageView = m68564mO.f139517u;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_backup_success_solid_24, AbstractC2807a.accent_green_icon));
        ViewGroup.LayoutParams layoutParams = zAppCompatImageView.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (str.length() > 0) {
            layoutParams2.removeRule(15);
            layoutParams2.addRule(6, AbstractC6918a0.ll_content);
        } else {
            layoutParams2.addRule(15);
            layoutParams2.removeRule(6);
        }
        RobotoTextView robotoTextView = m68564mO.f139515s;
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        C26703b m137293a = C26705d.m137293a(m92689tK2, AbstractC2814h.t_large_m);
        AbstractC19074t.m100205c(robotoTextView);
        new C26708g(robotoTextView).m137319a(m137293a);
        robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.banner_title));
        robotoTextView.setText(str);
        CharSequence text = robotoTextView.getText();
        AbstractC19074t.m100207e(text, "getText(...)");
        if (text.length() > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        RobotoTextView robotoTextView2 = m68564mO.f139514r;
        robotoTextView2.setText(str2);
        robotoTextView2.setTextColor(C23212s8.m119606n(AbstractC2807a.banner_description));
        robotoTextView2.setVisibility(0);
        ViewGroup.LayoutParams layoutParams3 = robotoTextView2.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        if (str.length() > 0) {
            i12 = AbstractC23222t7.f112566j;
        } else {
            i12 = 0;
        }
        layoutParams4.setMargins(0, i12, 0, 0);
        RobotoTextView robotoTextView3 = m68564mO.f139513q;
        robotoTextView3.setText(str3);
        CharSequence text2 = robotoTextView3.getText();
        AbstractC19074t.m100207e(text2, "getText(...)");
        if (text2.length() > 0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        robotoTextView3.setVisibility(i13);
        robotoTextView3.setOnClickListener(new View.OnClickListener() { // from class: u70.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedBannerView.m68485SP(FixedBannerView.this, view);
            }
        });
        RobotoTextView robotoTextView4 = m68564mO.f139516t;
        robotoTextView4.setVisibility(0);
        robotoTextView4.setText("");
        Context m92689tK3 = m92689tK();
        AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
        robotoTextView4.setCompoundDrawablesWithIntrinsicBounds(C27280g.m139660c(m92689tK3, AbstractC2810d.zds_ic_close_line_24, AbstractC2807a.icon_tertiary), (Drawable) null, (Drawable) null, (Drawable) null);
        ViewGroup.LayoutParams layoutParams5 = robotoTextView4.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.setMargins(AbstractC23222t7.f112576o, AbstractC23222t7.f112562h, 0, 0);
        if (str.length() > 0) {
            layoutParams6.removeRule(15);
        } else {
            layoutParams6.addRule(15);
        }
        m68564mO.f139520x.setVisibility(8);
        m68564mO.f139519w.setVisibility(8);
    }

    /* renamed from: SN */
    private final ClickableSpan m68483SN() {
        return new C12236p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SO */
    public static final void m68484SO(FixedBannerView fixedBannerView, C16888a c16888a, C23340r c23340r, View view) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC19074t.m100208f(c16888a, "$zCloudGracePeriodManager");
        AbstractC19074t.m100208f(c23340r, "$bannerItem");
        fixedBannerView.m68615zO().m139217V(new C23340r(0L, null, 3, null));
        c16888a.m90222E(((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) c23340r.m122745e()).m90210b().m90258a());
        AbstractC16889b m90210b = ((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) c23340r.m122745e()).m90210b();
        if (m90210b instanceof AbstractC16889b.a) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_banner_low_battery_dismiss", null, null, null, 14, null);
        } else if (m90210b instanceof AbstractC16889b.b) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_banner_no_wifi_dismiss", null, null, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SP */
    public static final void m68485SP(FixedBannerView fixedBannerView, View view) {
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        InterfaceC27218a m92676n2 = fixedBannerView.m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(ZCloudHomeView.class, null, 1, true);
        }
        AbstractC0924m0.m3495Un(false);
        fixedBannerView.m68615zO().m139217V(new C23341s(0L, null, 3, null));
    }

    /* renamed from: TN */
    private final InterfaceC20094a m68487TN(Set set, int i11, int i12) {
        return new C12237q(i11, i12, this, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TO */
    public static final void m68488TO(FixedBannerView fixedBannerView, C16888a c16888a, int i11, View view) {
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC19074t.m100208f(c16888a, "$zCloudGracePeriodManager");
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_done_banner_check_media", null, null, null, 14, null);
        fixedBannerView.m68615zO().m139217V(new C23340r(0L, null, 3, null));
        c16888a.m90223F(true);
        c16888a.m90224G(true);
        Bundle bundle = new Bundle();
        bundle.putInt("zcloud_gp_success_mode", i11);
        InterfaceC27218a m92676n2 = fixedBannerView.m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(ToolStorageView.class, bundle, 1, true);
        }
    }

    /* renamed from: TP */
    private final void m68489TP(String str, String str2, String str3, final int i11) {
        int i12;
        int i13;
        int i14;
        C30057tf m68564mO = m68564mO();
        RelativeLayout root = m68564mO.getRoot();
        root.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.banner_container_warning));
        root.setPadding(AbstractC23222t7.f112586t, 0, AbstractC23222t7.f112562h, 0);
        ZAppCompatImageView zAppCompatImageView = m68564mO.f139517u;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_backup_warning_solid_24, AbstractC2807a.warning_icon));
        ViewGroup.LayoutParams layoutParams = zAppCompatImageView.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (str.length() > 0) {
            layoutParams2.removeRule(15);
            layoutParams2.addRule(6, AbstractC6918a0.ll_content);
        } else {
            layoutParams2.addRule(15);
            layoutParams2.removeRule(6);
        }
        RobotoTextView robotoTextView = m68564mO.f139515s;
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        C26703b m137293a = C26705d.m137293a(m92689tK2, AbstractC2814h.t_large_m);
        AbstractC19074t.m100205c(robotoTextView);
        new C26708g(robotoTextView).m137319a(m137293a);
        robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.banner_title));
        robotoTextView.setText(str);
        CharSequence text = robotoTextView.getText();
        AbstractC19074t.m100207e(text, "getText(...)");
        if (text.length() > 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        robotoTextView.setVisibility(i12);
        RobotoTextView robotoTextView2 = m68564mO.f139514r;
        robotoTextView2.setText(str2);
        robotoTextView2.setTextColor(C23212s8.m119606n(AbstractC2807a.banner_description));
        robotoTextView2.setVisibility(0);
        ViewGroup.LayoutParams layoutParams3 = robotoTextView2.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        if (str.length() > 0) {
            i13 = AbstractC23222t7.f112566j;
        } else {
            i13 = 0;
        }
        layoutParams4.setMargins(0, i13, 0, 0);
        RobotoTextView robotoTextView3 = m68564mO.f139513q;
        robotoTextView3.setText(str3);
        CharSequence text2 = robotoTextView3.getText();
        AbstractC19074t.m100207e(text2, "getText(...)");
        if (text2.length() > 0) {
            i14 = 0;
        } else {
            i14 = 8;
        }
        robotoTextView3.setVisibility(i14);
        robotoTextView3.setOnClickListener(new View.OnClickListener() { // from class: u70.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedBannerView.m68493UP(i11, this, view);
            }
        });
        RobotoTextView robotoTextView4 = m68564mO.f139516t;
        robotoTextView4.setVisibility(0);
        robotoTextView4.setText("");
        Context m92689tK3 = m92689tK();
        AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
        robotoTextView4.setCompoundDrawablesWithIntrinsicBounds(C27280g.m139660c(m92689tK3, AbstractC2810d.zds_ic_close_line_24, AbstractC2807a.icon_tertiary), (Drawable) null, (Drawable) null, (Drawable) null);
        ViewGroup.LayoutParams layoutParams5 = robotoTextView4.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.setMargins(AbstractC23222t7.f112576o, AbstractC23222t7.f112562h, 0, 0);
        if (str.length() > 0) {
            layoutParams6.removeRule(15);
        } else {
            layoutParams6.addRule(15);
        }
        m68564mO.f139520x.setVisibility(8);
        m68564mO.f139519w.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UN */
    public final Handler m68491UN() {
        return new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: u70.f0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m68495VN;
                m68495VN = FixedBannerView.m68495VN(FixedBannerView.this, message);
                return m68495VN;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UO */
    public static final void m68492UO(FixedBannerView fixedBannerView, C16888a c16888a, View view) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC19074t.m100208f(c16888a, "$zCloudGracePeriodManager");
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_done_banner_dismiss", null, null, null, 14, null);
        fixedBannerView.m68615zO().m139217V(new C23340r(0L, null, 3, null));
        c16888a.m90223F(true);
        c16888a.m90224G(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UP */
    public static final void m68493UP(int i11, FixedBannerView fixedBannerView, View view) {
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        C26676b.f126324a.m137005s(i11);
        InterfaceC27218a m92676n2 = fixedBannerView.m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(ZCloudHomeView.class, null, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VN */
    public static final boolean m68495VN(FixedBannerView fixedBannerView, Message message) {
        EnumC30982b enumC30982b;
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        if (message.what == 1001) {
            fixedBannerView.m68576pO().removeMessages(1001);
            Object obj = message.obj;
            if (obj instanceof EnumC30982b) {
                enumC30982b = (EnumC30982b) obj;
            } else {
                enumC30982b = null;
            }
            fixedBannerView.m68620kP(enumC30982b);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VO */
    public static final void m68496VO(View view) {
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_banner_download_data", null, null, null, 14, null);
        C26626l m120695n2 = AbstractC23306f.m120695n2();
        AbstractC19074t.m100207e(m120695n2, "provideZaloCloudUIHandler(...)");
        C26626l.m136673g0(m120695n2, false, 1, null);
    }

    /* renamed from: VP */
    private final void m68497VP(final boolean z11) {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.runOnUiThread(new Runnable() { // from class: u70.h
                @Override // java.lang.Runnable
                public final void run() {
                    FixedBannerView.m68501WP(z11, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WN */
    public static final void m68499WN(FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        if (!AbstractC3489d.m17506n() && !AbstractC3489d.m17512t() && C16805b.Companion.m89811a().m89801i().m89767c() != 0) {
            C26626l.Companion.m136712a().m136693E(true);
            fixedBannerView.f63754d1 = false;
            fixedBannerView.m68448JN();
            return;
        }
        fixedBannerView.m68615zO().m139217V(new C23341s(0L, null, 3, null));
    }

    /* renamed from: WO */
    private final View m68500WO(C23341s c23341s) {
        float f11;
        int m127173b0;
        int m127173b02;
        boolean z11;
        String m118746s0;
        String m118743r0;
        m68564mO().getRoot().setOnClickListener(null);
        final AbstractC28981d m122746e = c23341s.m122746e();
        if (m122746e != null) {
            f11 = m122746e.m144695b();
        } else {
            f11 = 0.0f;
        }
        float f12 = f11 * 100.0f;
        String m89800f = C16805b.Companion.m89811a().m89800f();
        if ((m122746e instanceof AbstractC28981d.d) || (m122746e instanceof AbstractC28981d.b)) {
            String m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_progressing, m89800f, "");
            AbstractC19074t.m100207e(m118746s02, "getString(...)");
            m68473PP(m118746s02, (int) f12);
        } else if (m122746e instanceof AbstractC28981d.e) {
            C26626l.Companion.m136712a().m136693E(false);
            AbstractC0924m0.m3179Jq(true);
            if (AbstractC0924m0.m3455Tc()) {
                String m118746s03 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_full_quota_error, m89800f);
                AbstractC19074t.m100207e(m118746s03, "getString(...)");
                String m118746s04 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_full_quota_error_detail, m89800f);
                AbstractC19074t.m100207e(m118746s04, "getString(...)");
                String m118746s05 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_clean_up_zcloud_cta, m89800f);
                AbstractC19074t.m100207e(m118746s05, "getString(...)");
                m68489TP(m118746s03, m118746s04, m118746s05, ((AbstractC28981d.e) m122746e).m144696c());
            } else {
                String m118746s06 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_banner_success_title, m89800f);
                AbstractC19074t.m100207e(m118746s06, "getString(...)");
                String m118746s07 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_banner_success_desc, m89800f);
                AbstractC19074t.m100207e(m118746s07, "getString(...)");
                String m118746s08 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_banner_success_cta, m89800f);
                AbstractC19074t.m100207e(m118746s08, "getString(...)");
                m68481RP(m118746s06, m118746s07, m118746s08);
            }
        } else if (m122746e instanceof AbstractC28981d.a) {
            AbstractC28981d.a aVar = (AbstractC28981d.a) m122746e;
            int i11 = C12221c.f63776b[aVar.m144699f().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                InterfaceC28990m m144694a = aVar.m144694a(0);
                                if (m144694a != null) {
                                    z11 = m144694a.mo90081b();
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_pause, m89800f);
                                } else {
                                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_drive_error_desc, m89800f);
                                }
                                AbstractC19074t.m100205c(m118746s0);
                                if (z11) {
                                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_details);
                                } else {
                                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_resolve_error_cta);
                                }
                                AbstractC19074t.m100205c(m118743r0);
                                m68461MP(m118746s0, m118743r0, c23341s.m122715d(), aVar.m144696c());
                            } else {
                                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_restore_message_storage_error_banner_desc);
                                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_try_again_cta);
                                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                                m68461MP(m118743r02, m118743r03, c23341s.m122715d(), aVar.m144696c());
                            }
                        } else {
                            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_restore_message_error_banner_desc);
                            AbstractC19074t.m100207e(m118743r04, "getString(...)");
                            String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_delete_backup_and_resume_cta);
                            AbstractC19074t.m100207e(m118743r05, "getString(...)");
                            m68461MP(m118743r04, m118743r05, c23341s.m122715d(), aVar.m144696c());
                        }
                    } else {
                        String m118746s09 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_restore_error_banner_desc, m89800f);
                        AbstractC19074t.m100207e(m118746s09, "getString(...)");
                        String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_resolve_error_cta);
                        AbstractC19074t.m100207e(m118743r06, "getString(...)");
                        m68461MP(m118746s09, m118743r06, c23341s.m122715d(), aVar.m144696c());
                    }
                } else {
                    SpannableString spannableString = new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_battery_error_banner_desc, "15%", m89800f));
                    StyleSpan styleSpan = new StyleSpan(1);
                    m127173b0 = AbstractC24342w.m127173b0(spannableString, "15%", 0, false, 6, null);
                    m127173b02 = AbstractC24342w.m127173b0(spannableString, "15%", 0, false, 6, null);
                    spannableString.setSpan(styleSpan, m127173b0, m127173b02 + 3, 18);
                    m68457LP(spannableString, (int) f12);
                }
            } else {
                CharSequence m118746s010 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_network_error_banner_desc, m89800f);
                AbstractC19074t.m100207e(m118746s010, "getString(...)");
                m68457LP(m118746s010, (int) f12);
            }
        } else if (m122746e instanceof AbstractC28981d.c) {
            String m118746s011 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_unknown_error_banner_desc, m89800f);
            AbstractC19074t.m100207e(m118746s011, "getString(...)");
            String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_resume_migrate_cta);
            AbstractC19074t.m100207e(m118743r07, "getString(...)");
            m68461MP(m118746s011, m118743r07, c23341s.m122715d(), ((AbstractC28981d.c) m122746e).m144696c());
        }
        m68564mO().f139516t.setOnClickListener(new View.OnClickListener() { // from class: u70.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedBannerView.m68504XO(FixedBannerView.this, m122746e, view);
            }
        });
        RelativeLayout root = m68564mO().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WP */
    public static final void m68501WP(boolean z11, FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        if (z11) {
            fixedBannerView.m68615zO().m139212O(new C23324b(fixedBannerView.m68615zO().m139214Q()));
        } else {
            fixedBannerView.m68615zO().m139217V(new C23324b(0L, 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XN */
    public static final void m68503XN(FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        fixedBannerView.m68606xN((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f) ZaloCloudRecoverCloudMediaWorker.Companion.m90201h().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XO */
    public static final void m68504XO(FixedBannerView fixedBannerView, AbstractC28981d abstractC28981d, View view) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        fixedBannerView.f63754d1 = true;
        boolean z11 = abstractC28981d instanceof AbstractC28981d.e;
        if (z11 || (abstractC28981d != null && abstractC28981d.m144698e())) {
            AbstractC0924m0.m3495Un(false);
        }
        if (z11 && AbstractC0924m0.m3455Tc()) {
            C26676b.f126324a.m137007u(((AbstractC28981d.e) abstractC28981d).m144696c());
        }
        if (abstractC28981d instanceof AbstractC28981d.c) {
            C26676b.f126324a.m136978Q();
        }
        fixedBannerView.m68615zO().m139217V(new C23341s(0L, null, 3, null));
    }

    /* renamed from: XP */
    private final void m68505XP(boolean z11, boolean z12, int i11, CharSequence charSequence) {
        float f11;
        if (!z11) {
            m68423CP(z12, i11, charSequence);
            return;
        }
        final int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.connection_status_bar_h);
        float translationY = m68533eO().getRoot().getTranslationY() / m118655I;
        if (z12) {
            f11 = 0.0f;
        } else {
            f11 = -1.0f;
        }
        if (translationY == f11 || !z11) {
            m68423CP(z12, i11, charSequence);
            return;
        }
        ValueAnimator valueAnimator = this.f63742R0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        m68423CP(true, i11, charSequence);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, f11);
        this.f63742R0 = ofFloat;
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u70.m0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                FixedBannerView.m68513ZP(FixedBannerView.this, m118655I, valueAnimator2);
            }
        });
        ofFloat.addListener(new C12218a0(z12, this));
        ofFloat.start();
    }

    /* renamed from: YN */
    private final void m68507YN() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: u70.s0
            @Override // java.lang.Runnable
            public final void run() {
                FixedBannerView.m68511ZN(FixedBannerView.this);
            }
        });
    }

    /* renamed from: YO */
    private final void m68508YO() {
        C17487o0 mo35579p;
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(SettingNotificationV2View.class, null, 1, true);
        }
    }

    /* renamed from: YP */
    static /* synthetic */ void m68509YP(FixedBannerView fixedBannerView, boolean z11, boolean z12, int i11, CharSequence charSequence, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            charSequence = "";
        }
        fixedBannerView.m68505XP(z11, z12, i11, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZN */
    public static final void m68511ZN(final FixedBannerView fixedBannerView) {
        int m121181M0;
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        final C19055h0 c19055h0 = new C19055h0();
        if (!f63735x1) {
            if (C30981a.m150598f().m150607i()) {
                m121181M0 = AbstractC23309i.m121144L0();
            } else {
                m121181M0 = AbstractC23309i.m121181M0();
            }
            c19055h0.f94931p = m121181M0 * 1000;
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: u70.q0
            @Override // java.lang.Runnable
            public final void run() {
                FixedBannerView.m68515aO(FixedBannerView.this, c19055h0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZO */
    public final void m68512ZO() {
        String str;
        this.f63744T0 = 0;
        boolean m68573oP = m68573oP();
        boolean z11 = !AbstractC23309i.m122413t();
        boolean z12 = !AbstractC23309i.m122450u();
        boolean z13 = !C25244a.m130639q();
        if (m68573oP) {
            this.f63744T0 = 4;
            AbstractC23088h5.m118424e(MainApplication.Companion.m35500c());
            str = "1";
        } else if (z13 && z12 && z11) {
            m68508YO();
            str = "8";
        } else if (z13 && z12) {
            m68508YO();
            str = "7";
        } else if (z13 && z11) {
            m68508YO();
            str = "6";
        } else if (z12 && z11) {
            this.f63744T0 = 3;
            m68508YO();
            str = "4";
        } else if (z13) {
            m68450JP();
            str = "5";
        } else if (z12) {
            this.f63744T0 = 1;
            m68530dQ(13, 1, true);
            str = "3";
        } else if (z11) {
            this.f63744T0 = 2;
            m68530dQ(15, 1, true);
            str = "2";
        } else {
            str = "";
        }
        this.f63745U0 = str;
        if (str.length() > 0) {
            C0815e1.m2075D().m2099U(3, 2, 41, "1", "1", this.f63745U0, "0");
        }
        int i11 = this.f63744T0;
        if (i11 > 0) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("390%d%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11), 1}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            AbstractC23647d.m123897g(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZP */
    public static final void m68513ZP(FixedBannerView fixedBannerView, int i11, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue() * i11;
        fixedBannerView.m68533eO().getRoot().setTranslationY(floatValue);
        InterfaceC12219b interfaceC12219b = fixedBannerView.f63743S0;
        if (interfaceC12219b != null) {
            interfaceC12219b.mo68622a(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aO */
    public static final void m68515aO(FixedBannerView fixedBannerView, C19055h0 c19055h0) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC19074t.m100208f(c19055h0, "$delayTimeToCheck");
        fixedBannerView.m68576pO().removeMessages(1001);
        if (fixedBannerView.m68615zO().m139216U(EnumC22502a.f110111p)) {
            C30983c m150606e = C30981a.m150598f().m150606e();
            AbstractC19074t.m100207e(m150606e, "getConnectionStateWithTime(...)");
            if (!f63735x1 && m150606e.f142944a == EnumC30982b.CONNECTED) {
                m68427DP(fixedBannerView, false, 0, null, 6, null);
                C30981a.f142933e = 0L;
                return;
            } else {
                EnumC30982b enumC30982b = m150606e.f142944a;
                AbstractC19074t.m100207e(enumC30982b, "state");
                fixedBannerView.m68576pO().sendMessageDelayed(fixedBannerView.m68576pO().obtainMessage(1001, enumC30982b), 0L);
                return;
            }
        }
        fixedBannerView.m68576pO().sendMessageDelayed(fixedBannerView.m68576pO().obtainMessage(1001, null), c19055h0.f94931p);
    }

    /* renamed from: aP */
    private final void m68516aP(Object[] objArr) {
        Object obj = objArr[1];
        if (obj != null) {
            final int intValue = ((Integer) obj).intValue();
            if (intValue == -1) {
                this.f63754d1 = true;
                AbstractC19444a.m101697e(new Runnable() { // from class: u70.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        FixedBannerView.m68520bP(FixedBannerView.this);
                    }
                });
            } else {
                this.f63754d1 = false;
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: u70.a0
                @Override // java.lang.Runnable
                public final void run() {
                    FixedBannerView.m68524cP(intValue, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aQ */
    public static final void m68517aQ() {
        AbstractC23775p0.m124197b("db");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bO */
    public final View m68519bO(AbstractC23323a abstractC23323a) {
        switch (C12221c.f63775a[abstractC23323a.m122715d().ordinal()]) {
            case 1:
                AbstractC19074t.m100206d(abstractC23323a, "null cannot be cast to non-null type com.zing.zalo.data.messagefixedbanner.model.NetworkBannerItem");
                return m68580qO((C23325c) abstractC23323a);
            case 2:
                return m68572oO();
            case 3:
                AbstractC19074t.m100206d(abstractC23323a, "null cannot be cast to non-null type com.zing.zalo.data.messagefixedbanner.model.PCTransferBannerItem");
                return m68603wO((C23332j) abstractC23323a);
            case 4:
                return m68568nO();
            case 5:
                return m68607xO();
            case 6:
                AbstractC19074t.m100206d(abstractC23323a, "null cannot be cast to non-null type com.zing.zalo.data.messagefixedbanner.model.RemindNotifyBannerItem");
                return m68592tO((C23333k) abstractC23323a);
            case 7:
                AbstractC19074t.m100206d(abstractC23323a, "null cannot be cast to non-null type com.zing.zalo.data.messagefixedbanner.model.NotificationRestrictItem");
                return m68584rO((C23327e) abstractC23323a);
            case 8:
                AbstractC19074t.m100206d(abstractC23323a, "null cannot be cast to non-null type com.zing.zalo.data.messagefixedbanner.model.ZcloudOnboardingNotifyBannerItem");
                return m68500WO((C23341s) abstractC23323a);
            case 9:
                AbstractC19074t.m100206d(abstractC23323a, "null cannot be cast to non-null type com.zing.zalo.data.messagefixedbanner.model.ZCloudRemindSetupNotifyBannerItem");
                return m68445IO((C23338p) abstractC23323a);
            case 10:
                AbstractC19074t.m100206d(abstractC23323a, "null cannot be cast to non-null type com.zing.zalo.data.messagefixedbanner.model.ZCloudRemindRestoreNotifyBannerItem");
                return m68433FO((C23337o) abstractC23323a);
            case 11:
                AbstractC19074t.m100206d(abstractC23323a, "null cannot be cast to non-null type com.zing.zalo.data.messagefixedbanner.model.ZcloudChangeBackupKeyBannerItem");
                return m68415AO((C23339q) abstractC23323a);
            case 12:
                AbstractC19074t.m100206d(abstractC23323a, "null cannot be cast to non-null type com.zing.zalo.data.messagefixedbanner.model.ZCloudNotifyLockVerifyCloudBannerItem");
                return m68422CO((C23336n) abstractC23323a);
            case 13:
                AbstractC19074t.m100206d(abstractC23323a, "null cannot be cast to non-null type com.zing.zalo.data.messagefixedbanner.model.ZcloudGracePeriodBannerItem");
                return m68460MO((C23340r) abstractC23323a);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bP */
    public static final void m68520bP(FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        fixedBannerView.m68615zO().m139217V(new C23341s(0L, null, 3, null));
        fixedBannerView.m68615zO().m139217V(new C23338p(AbstractC3489d.m17498f()));
        fixedBannerView.m68615zO().m139217V(new C23337o(AbstractC3489d.m17498f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bQ */
    public static final void m68521bQ(FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        fixedBannerView.m68615zO().m139217V(new C23332j(0L, null, 3, null));
    }

    /* renamed from: cO */
    private final C30037sc m68523cO() {
        return (C30037sc) this.f63764n1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cP */
    public static final void m68524cP(int i11, FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        if (i11 == 100) {
            fixedBannerView.m68606xN((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f) ZaloCloudRecoverCloudMediaWorker.Companion.m90201h().getValue());
        } else {
            fixedBannerView.m68615zO().m139217V(new C23340r(0L, null, 3, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cQ */
    public static final void m68525cQ(FixedBannerView fixedBannerView, AbstractC28627l abstractC28627l) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        fixedBannerView.m68615zO().m139212O(new C23332j(fixedBannerView.m68615zO().m139214Q(), abstractC28627l));
    }

    /* renamed from: dO */
    private final C30015r7 m68528dO() {
        return (C30015r7) this.f63762l1.getValue();
    }

    /* renamed from: dP */
    private final void m68529dP(Object[] objArr) {
        int m121181M0;
        long j11;
        Object obj = objArr[0];
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.connection.state.ConnectionState");
        EnumC30982b enumC30982b = (EnumC30982b) obj;
        long currentTimeMillis = System.currentTimeMillis();
        if (C30981a.m150598f().m150607i()) {
            m121181M0 = AbstractC23309i.m121144L0();
        } else {
            m121181M0 = AbstractC23309i.m121181M0();
        }
        int i11 = m121181M0 * 1000;
        long j12 = C30981a.f142933e;
        if (j12 == 0 || j12 <= 0 || currentTimeMillis <= j12) {
            j11 = i11;
        } else {
            long j13 = currentTimeMillis - j12;
            if (1 <= j13 && j13 <= i11) {
                j11 = i11 - j13;
            } else {
                j11 = 0;
            }
        }
        if (j11 < 0) {
            j11 = 0;
        }
        if (enumC30982b == EnumC30982b.CONNECTED) {
            C30981a.f142933e = 0L;
            j11 = 0;
        }
        m68467ON(enumC30982b);
        if (!m68615zO().m139216U(EnumC22502a.f110111p)) {
            C30981a.f142933e = System.currentTimeMillis();
            m68576pO().removeMessages(1001);
            m68576pO().sendMessageDelayed(m68576pO().obtainMessage(1001, enumC30982b), j11);
        } else {
            m68576pO().removeMessages(1001);
            m68576pO().sendMessageDelayed(m68576pO().obtainMessage(1001, enumC30982b), 0L);
        }
    }

    /* renamed from: dQ */
    private final void m68530dQ(int i11, int i12, boolean z11) {
        if (m68611yO().contains(Integer.valueOf(i11))) {
            if (z11) {
                mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                return;
            }
            return;
        }
        if (z11) {
            mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        }
        if (C23055e5.m118272g(true)) {
            m68611yO().add(Integer.valueOf(i11));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(m68487TN(m68611yO(), i11, i12));
            c0766k.mo1699o3(i11, i12);
            return;
        }
        m68611yO().remove(Integer.valueOf(i11));
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_on_notification_update_setting_fail));
        mo78960q3();
    }

    /* renamed from: eO */
    private final C29921m3 m68533eO() {
        return (C29921m3) this.f63761k1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eP */
    public final void m68534eP() {
        m68615zO().m139217V(new C23333k(0L, null, 0, 7, null));
        AbstractC23309i.m122469ui(AbstractC23309i.m122115l0() + 1);
        AbstractC23309i.m122543wi(System.currentTimeMillis());
        if (this.f63745U0.length() > 0) {
            C0815e1.m2075D().m2099U(3, 4, 41, "1", "3", this.f63745U0, "0");
        }
        AbstractC23304d.f113365b2 = false;
        int i11 = this.f63744T0;
        if (i11 > 0) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("390%d%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11), 2}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            AbstractC23647d.m123897g(format);
        }
    }

    /* renamed from: fO */
    private final C29886k4 m68537fO() {
        return (C29886k4) this.f63766p1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fP */
    public final void m68538fP() {
        if (C20024r.m103943l()) {
            C20024r.m103949w();
        }
    }

    /* renamed from: gO */
    private final C29711a9 m68541gO() {
        return (C29711a9) this.f63767q1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gP */
    public final void m68542gP() {
        C30983c m150606e = C30981a.m150598f().m150606e();
        AbstractC19074t.m100207e(m150606e, "getConnectionStateWithTime(...)");
        if (m150606e.f142944a == EnumC30982b.CONNECT_LIMITED) {
            AbstractC28998a.m144876e(getContext());
        }
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("380%02d", Arrays.copyOf(new Object[]{0}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        AbstractC23647d.m123897g(format);
    }

    /* renamed from: hO */
    private final C29720b0 m68545hO() {
        return (C29720b0) this.f63763m1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hP */
    public final void m68546hP() {
        C17487o0 mo35579p;
        C17487o0 mo35579p2;
        if (!this.f63747W0) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("update", true);
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null && (mo35579p2 = m92676n2.mo35579p()) != null) {
                mo35579p2.m93069k2(UpdateUserInfoZView.class, bundle, 1, true);
            }
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("EXTRA_SHOW_FROM_DOCK", true);
            InterfaceC27218a m92676n22 = m92676n2();
            if (m92676n22 != null && (mo35579p = m92676n22.mo35579p()) != null) {
                mo35579p.m93069k2(UpdateAvatarView.class, bundle2, 1, true);
            }
        }
        AbstractC23309i.m122030ir(System.currentTimeMillis());
    }

    /* renamed from: iO */
    private final C29870j6 m68549iO() {
        return (C29870j6) this.f63765o1.getValue();
    }

    /* renamed from: iP */
    private final void m68550iP() {
        AbstractC19444a.m101697e(new Runnable() { // from class: u70.i0
            @Override // java.lang.Runnable
            public final void run() {
                FixedBannerView.m68554jP(FixedBannerView.this);
            }
        });
    }

    /* renamed from: jO */
    private final C29772dg m68553jO() {
        return (C29772dg) this.f63771u1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jP */
    public static final void m68554jP(FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        fixedBannerView.m68440HN();
        fixedBannerView.m68444IN();
        fixedBannerView.m68425DN();
    }

    /* renamed from: kO */
    private final C29808fg m68557kO() {
        return (C29808fg) this.f63770t1.getValue();
    }

    /* renamed from: lO */
    private final C29826gg m68560lO() {
        return (C29826gg) this.f63769s1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lP */
    public static final void m68561lP(FixedBannerView fixedBannerView, int i11, CharSequence charSequence) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        InterfaceC27218a m92676n2 = fixedBannerView.m92676n2();
        AbstractC19074t.m100205c(m92676n2);
        fixedBannerView.m68505XP(false, true, AbstractC1388a.m6961c(m92676n2.getContext(), i11), charSequence);
    }

    /* renamed from: mO */
    private final C30057tf m68564mO() {
        return (C30057tf) this.f63768r1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mP */
    public static final void m68565mP(FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        C30983c m150606e = C30981a.m150598f().m150606e();
        AbstractC19074t.m100207e(m150606e, "getConnectionStateWithTime(...)");
        if (m150606e.f142944a == EnumC30982b.CONNECTED) {
            fixedBannerView.m68576pO().removeMessages(1001);
            C30981a.f142933e = 0L;
            m68509YP(fixedBannerView, false, false, 0, null, 12, null);
            fixedBannerView.f63741Q0 = System.currentTimeMillis();
        }
        fixedBannerView.f63740P0 = null;
    }

    /* renamed from: nO */
    private final View m68568nO() {
        ReturnCallScreenView root = m68523cO().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nP */
    public static final void m68569nP(FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        m68509YP(fixedBannerView, false, false, 0, null, 12, null);
        fixedBannerView.f63741Q0 = System.currentTimeMillis();
    }

    /* renamed from: oO */
    private final View m68572oO() {
        LinearLayout root = m68528dO().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: oP */
    private final boolean m68573oP() {
        boolean z11 = !C1335e1.m6691e(MainApplication.Companion.m35500c()).m6695a();
        boolean z12 = !AbstractC23775p0.m124211p(EnumC23761i0.NOTIFICATIONS.m124183e());
        boolean m124212q = AbstractC23775p0.m124212q(EnumC23747b0.f114867z);
        boolean m124212q2 = AbstractC23775p0.m124212q(EnumC23747b0.f114854A);
        boolean m124212q3 = AbstractC23775p0.m124212q(EnumC23747b0.f114855B);
        if (z11 || z12 || m124212q || m124212q2 || m124212q3) {
            return true;
        }
        return false;
    }

    /* renamed from: pO */
    private final Handler m68576pO() {
        return (Handler) this.f63739O0.getValue();
    }

    /* renamed from: pP */
    private final AtomicBoolean m68577pP() {
        return (AtomicBoolean) this.f63752b1.getValue();
    }

    /* renamed from: qO */
    private final View m68580qO(C23325c c23325c) {
        LinearLayout root = m68533eO().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        m68533eO().f138649q.setBackgroundColor(c23325c.m122716e());
        m68533eO().f138652t.setText(c23325c.m122717g());
        return root;
    }

    /* renamed from: qP */
    private final boolean m68581qP() {
        int length;
        try {
            int m122115l0 = AbstractC23309i.m122115l0();
            if (m122115l0 < 0) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            long j11 = 34200;
            try {
                JSONObject jSONObject = new JSONObject(AbstractC23309i.m121561Wa());
                j11 = jSONObject.optLong("schedule_notification_interval", 34200L);
                JSONArray optJSONArray = jSONObject.optJSONArray("Fibonacci");
                if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                    for (int i11 = 0; i11 < length; i11++) {
                        arrayList.add(Integer.valueOf(optJSONArray.optInt(i11)));
                    }
                }
            } catch (JSONException unused) {
            }
            if (arrayList.size() == 0) {
                for (int i12 : f63733v1) {
                    arrayList.add(Integer.valueOf(i12));
                }
            }
            if (m122115l0 >= arrayList.size()) {
                AbstractC23309i.m122469ui(0);
                m122115l0 = 0;
            }
            if (System.currentTimeMillis() - ((((Number) arrayList.get(m122115l0)).longValue() * j11) * 1000) < AbstractC23309i.m122191n0()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: rO */
    private final View m68584rO(final C23327e c23327e) {
        m68541gO().f137230s.setOnClickListener(new View.OnClickListener() { // from class: u70.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FixedBannerView.m68588sO(FixedBannerView.this, c23327e, view);
            }
        });
        m68541gO().f137229r.setText(c23327e.m122721h());
        m68541gO().f137230s.setText(c23327e.m122719e());
        LinearLayout root = m68541gO().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rP */
    public static final void m68585rP(String str, int i11, FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        if (!TextUtils.isEmpty(str)) {
            C25804a m120688m = AbstractC23306f.m120688m();
            AbstractC19074t.m100205c(str);
            m120688m.m132982A(str, 2);
        }
        C26263i.m135055u().m135085r0(i11);
        if (fixedBannerView.f63751a1) {
            fixedBannerView.f63751a1 = false;
            AbstractC23306f.m120676j().m128407Y(8);
        }
    }

    /* renamed from: sN */
    private final void m68587sN() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && m92676n2.mo35576n3()) {
            if (C30981a.f142932d != null) {
                C30983c m150606e = C30981a.m150598f().m150606e();
                AbstractC19074t.m100207e(m150606e, "getConnectionStateWithTime(...)");
                EnumC30982b enumC30982b = m150606e.f142944a;
                if (enumC30982b != EnumC30982b.CONNECTED) {
                    m68620kP(enumC30982b);
                }
            }
            C30981a.f142932d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sO */
    public static final void m68588sO(FixedBannerView fixedBannerView, C23327e c23327e, View view) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        AbstractC19074t.m100208f(c23327e, "$item");
        fixedBannerView.m68593tP(c23327e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sP */
    public final void m68589sP() {
        AbstractC23323a m139215S = m68615zO().m139215S();
        AbstractC19074t.m100206d(m139215S, "null cannot be cast to non-null type com.zing.zalo.data.messagefixedbanner.model.NotificationRestrictItem");
        C23327e c23327e = (C23327e) m139215S;
        m68615zO().m139217V(c23327e);
        AbstractC0924m0.m2942Bl(AbstractC0924m0.m3770e4() + 1);
        AbstractC0924m0.m2971Cl(System.currentTimeMillis());
        C23331i.f113531a.m122730d(c23327e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public final void m68591tN(AbstractC28981d abstractC28981d) {
        if (this.f63755e1 && C16805b.Companion.m89811a().m89801i().m89767c() != 0 && !this.f63754d1 && !AbstractC19074t.m100204b(abstractC28981d, AbstractC28981d.f.f134110d) && C0860a.Companion.m2473a().m2466q()) {
            if (this.f63753c1 == null) {
                this.f63753c1 = abstractC28981d;
            }
            if (abstractC28981d instanceof AbstractC28981d.e) {
                if (abstractC28981d.m144696c() == 1) {
                    m68615zO().m139217V(new C23341s(AbstractC3489d.m17498f(), null, 2, null));
                }
                m68615zO().m139217V(new C23338p(AbstractC3489d.m17498f()));
                return;
            }
            AbstractC28981d abstractC28981d2 = this.f63753c1;
            if (abstractC28981d2 == null) {
                AbstractC19074t.m100223u("initialState");
                abstractC28981d2 = null;
            }
            if (!abstractC28981d2.m144698e()) {
                AbstractC0924m0.m3495Un(true);
                m68615zO().m139217V(new C23339q(0L, null, 3, null));
                m68615zO().m139212O(new C23341s(m68615zO().m139214Q(), abstractC28981d));
                return;
            } else if (AbstractC0924m0.m3958kc()) {
                m68615zO().m139217V(new C23339q(0L, null, 3, null));
                m68615zO().m139212O(new C23341s(m68615zO().m139214Q(), abstractC28981d));
                return;
            } else {
                m68615zO().m139217V(new C23341s(0L, null, 3, null));
                return;
            }
        }
        m68615zO().m139217V(new C23341s(0L, null, 3, null));
    }

    /* renamed from: tO */
    private final View m68592tO(C23333k c23333k) {
        LinearLayout root = m68537fO().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        SpannableString m122743g = c23333k.m122743g();
        if (m122743g != null) {
            m68537fO().f138461s.setText(m122743g);
            m68537fO().f138461s.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (c23333k.m122742e() > 0) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("390%d%d", Arrays.copyOf(new Object[]{Integer.valueOf(c23333k.m122742e()), 0}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            AbstractC23647d.m123897g(format);
        }
        return root;
    }

    /* renamed from: tP */
    private final void m68593tP(C23327e c23327e) {
        int i11 = C12221c.f63778d[c23327e.m122720g().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    ZaloWebView.Companion.m87168C(m92676n2(), C19172a.m100607r("tab_msg_fixed_banner@notification_restrict@learn_more_url", "https://help.zalo.me/huong-dan/chuyen-muc/nhan-tin-va-goi/khac-phuc-loi-thong-bao-zalo/"));
                } else {
                    C23331i.f113531a.m122739o(getContext());
                }
            } else {
                C23331i.f113531a.m122737m(getContext());
            }
        } else {
            C23331i.f113531a.m122738n(getContext());
        }
        C23331i.f113531a.m122729c(c23327e);
    }

    /* renamed from: uN */
    private final void m68595uN() {
        if (!m68456LO().m124790R0()) {
            m68434FP();
            m68604wP();
            AbstractC23306f.m120679j2().m124813i1(true);
        }
    }

    /* renamed from: uP */
    private final void m68596uP() {
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 10036);
        bVar.m124119a().m124115b(this, 150803);
        bVar.m124119a().m124115b(this, 150811);
        bVar.m124119a().m124115b(this, 150808);
        bVar.m124119a().m124115b(this, 150804);
    }

    /* renamed from: vN */
    private final void m68598vN(boolean z11, boolean z12) {
        boolean z13;
        Object obj;
        int m3710c4 = AbstractC0924m0.m3710c4();
        int m3680b4 = AbstractC0924m0.m3680b4();
        int m3740d4 = AbstractC0924m0.m3740d4();
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = getContext();
            if (context != null) {
                obj = context.getSystemService("activity");
            } else {
                obj = null;
            }
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type android.app.ActivityManager");
            z13 = ((ActivityManager) obj).isBackgroundRestricted();
        } else {
            z13 = false;
        }
        if (z11) {
            if (m3710c4 == 0) {
                AbstractC0924m0.m2942Bl(0L);
                AbstractC0924m0.m4411zl(1);
            }
        } else if (m3710c4 != 0) {
            AbstractC0924m0.m4411zl(0);
        }
        if (z13) {
            if (m3680b4 == 0) {
                AbstractC0924m0.m2942Bl(0L);
                AbstractC0924m0.m4382yl(1);
            }
        } else if (m3680b4 != 0) {
            AbstractC0924m0.m4382yl(0);
        }
        if (z12) {
            if (m3740d4 == 0) {
                AbstractC0924m0.m2942Bl(0L);
                AbstractC0924m0.m2913Al(1);
                return;
            }
            return;
        }
        if (m3740d4 != 0) {
            AbstractC0924m0.m2913Al(0);
        }
    }

    /* renamed from: vO */
    private final InterfaceC23792b m68599vO() {
        return (InterfaceC23792b) this.f63757g1.getValue();
    }

    /* renamed from: vP */
    private final void m68600vP() {
        if (!this.f63755e1) {
            return;
        }
        InterfaceC1801w m92657cJ = m92657cJ();
        AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(m92657cJ), null, null, new C12240t(null), 3, null);
    }

    /* renamed from: wN */
    private final void m68602wN(boolean z11) {
        boolean z12;
        if (f63734w1 == null) {
            f63734w1 = Boolean.valueOf(AbstractC23309i.m120964G5());
        }
        Boolean bool = f63734w1;
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            z12 = false;
        }
        if (!z11 && z12) {
            AbstractC23309i.m122469ui(0);
            AbstractC23309i.m122543wi(0L);
        }
        if (z11 != z12) {
            f63734w1 = Boolean.valueOf(z11);
            AbstractC23309i.m121839dq(z11);
        }
    }

    /* renamed from: wO */
    private final View m68603wO(C23332j c23332j) {
        ViewOnClickListenerC0139g viewOnClickListenerC0139g;
        FrameLayout root = m68545hO().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        AbstractC28627l m122741e = c23332j.m122741e();
        if (m122741e != null && (viewOnClickListenerC0139g = this.f63750Z0) != null) {
            viewOnClickListenerC0139g.m595t(m122741e);
        }
        return root;
    }

    /* renamed from: wP */
    private final void m68604wP() {
        AbstractC19444a.m101697e(new Runnable() { // from class: u70.i
            @Override // java.lang.Runnable
            public final void run() {
                FixedBannerView.m68608xP(FixedBannerView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xN */
    public final void m68606xN(ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f) {
        if (!AbstractC23306f.m120636Y1().m128530o() && !AbstractC23306f.m120636Y1().m128529n() && !AbstractC23306f.m120679j2().m124792S0()) {
            C16888a m120627V1 = AbstractC23306f.m120627V1();
            AbstractC19074t.m100207e(m120627V1, "provideZCloudGracePeriodManager(...)");
            if (!m120627V1.m90244o()) {
                if ((abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d) && !m120627V1.m90247r() && AbstractC0924m0.m3954k8() == EnumC30980a.f142926r.m150597c()) {
                    m68615zO().m139212O(new C23340r(m68615zO().m139214Q(), abstractC16884f));
                    return;
                } else {
                    m68615zO().m139217V(new C23340r(0L, null, 3, null));
                    return;
                }
            }
            if (AbstractC19074t.m100204b(abstractC16884f, ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b)) {
                C0860a m120691m2 = AbstractC23306f.m120691m2();
                AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
                long m2453g = C0860a.m2453g(m120691m2, false, 1, null);
                int m90235e = m120627V1.m90235e();
                if (m2453g <= 3) {
                    long j11 = m90235e;
                    if (m2453g < j11) {
                        m120627V1.m90219B((int) m2453g);
                    }
                    if (m2453g == j11) {
                        m68615zO().m139212O(new C23340r(m68615zO().m139214Q(), abstractC16884f));
                        return;
                    }
                } else {
                    if (m120627V1.m90235e() == Integer.MAX_VALUE) {
                        m68615zO().m139212O(new C23340r(m68615zO().m139214Q(), abstractC16884f));
                        return;
                    }
                    m120627V1.m90219B(((int) m2453g) - 1);
                }
                m68615zO().m139217V(new C23340r(m68615zO().m139214Q(), abstractC16884f));
                return;
            }
            if (abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) {
                if (m120627V1.m90237g() != ((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) abstractC16884f).m90210b().m90258a()) {
                    m68615zO().m139212O(new C23340r(m68615zO().m139214Q(), abstractC16884f));
                    return;
                } else {
                    m68615zO().m139217V(new C23340r(m68615zO().m139214Q(), abstractC16884f));
                    return;
                }
            }
            if (abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d) {
                if (!m120627V1.m90247r() && AbstractC0924m0.m3954k8() == EnumC30980a.f142925q.m150597c() && m92672lJ()) {
                    m68615zO().m139212O(new C23340r(m68615zO().m139214Q(), abstractC16884f));
                    AbstractC0924m0.m4330wr(EnumC30980a.f142926r.m150597c());
                    return;
                } else {
                    m68615zO().m139217V(new C23340r(m68615zO().m139214Q(), abstractC16884f));
                    return;
                }
            }
            if (m120627V1.m90246q()) {
                m68615zO().m139217V(new C23340r(m68615zO().m139214Q(), abstractC16884f));
                return;
            } else {
                m68615zO().m139212O(new C23340r(m68615zO().m139214Q(), abstractC16884f));
                return;
            }
        }
        m68615zO().m139217V(new C23340r(0L, null, 3, null));
    }

    /* renamed from: xO */
    private final View m68607xO() {
        FrameLayout root = m68549iO().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xP */
    public static final void m68608xP(FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        if (fixedBannerView.m68615zO().m139216U(EnumC22502a.f110107A)) {
            fixedBannerView.m68615zO().m139217V(new C23336n(AbstractC3489d.m17498f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public final void m68610yN() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: u70.u0
            @Override // java.lang.Runnable
            public final void run() {
                FixedBannerView.m68614zN(FixedBannerView.this);
            }
        });
    }

    /* renamed from: yO */
    private final Set m68611yO() {
        Object value = this.f63746V0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (Set) value;
    }

    /* renamed from: yP */
    private final void m68612yP() {
        if (m68615zO().m139216U(EnumC22502a.f110113r)) {
            AbstractC19444a.m101697e(new Runnable() { // from class: u70.t0
                @Override // java.lang.Runnable
                public final void run() {
                    FixedBannerView.m68616zP(FixedBannerView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cc A[Catch: Exception -> 0x001d, TRY_ENTER, TryCatch #0 {Exception -> 0x001d, blocks: (B:3:0x000c, B:5:0x0014, B:8:0x0020, B:16:0x0064, B:19:0x00cc, B:20:0x015c, B:22:0x0160, B:25:0x0168, B:28:0x0170, B:30:0x0187, B:31:0x01a5, B:33:0x01ac, B:36:0x01c7, B:38:0x01cb, B:40:0x01cf, B:42:0x01d3, B:43:0x01d5, B:44:0x01e0, B:46:0x01dd, B:48:0x01fb, B:53:0x00de, B:56:0x00ec, B:59:0x00fa, B:62:0x0107, B:64:0x0114, B:67:0x012e, B:69:0x0144), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0187 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:3:0x000c, B:5:0x0014, B:8:0x0020, B:16:0x0064, B:19:0x00cc, B:20:0x015c, B:22:0x0160, B:25:0x0168, B:28:0x0170, B:30:0x0187, B:31:0x01a5, B:33:0x01ac, B:36:0x01c7, B:38:0x01cb, B:40:0x01cf, B:42:0x01d3, B:43:0x01d5, B:44:0x01e0, B:46:0x01dd, B:48:0x01fb, B:53:0x00de, B:56:0x00ec, B:59:0x00fa, B:62:0x0107, B:64:0x0114, B:67:0x012e, B:69:0x0144), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ac A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:3:0x000c, B:5:0x0014, B:8:0x0020, B:16:0x0064, B:19:0x00cc, B:20:0x015c, B:22:0x0160, B:25:0x0168, B:28:0x0170, B:30:0x0187, B:31:0x01a5, B:33:0x01ac, B:36:0x01c7, B:38:0x01cb, B:40:0x01cf, B:42:0x01d3, B:43:0x01d5, B:44:0x01e0, B:46:0x01dd, B:48:0x01fb, B:53:0x00de, B:56:0x00ec, B:59:0x00fa, B:62:0x0107, B:64:0x0114, B:67:0x012e, B:69:0x0144), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: zN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m68614zN(final FixedBannerView fixedBannerView) {
        boolean z11;
        String str;
        String str2;
        String m118743r0;
        String m118743r02;
        String str3;
        int length;
        ArrayList m131500h;
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        try {
            fixedBannerView.f63744T0 = 0;
            if (AbstractC23309i.m122527w2() == 0) {
                AbstractC19444a.m101697e(new Runnable() { // from class: u70.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        FixedBannerView.m68414AN(FixedBannerView.this);
                    }
                });
                return;
            }
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_banner_notify_cta_go_to_setting);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            boolean z12 = !C1335e1.m6691e(MainApplication.Companion.m35500c()).m6695a();
            boolean z13 = !AbstractC23775p0.m124211p(EnumC23761i0.NOTIFICATIONS.m124183e());
            boolean m124212q = AbstractC23775p0.m124212q(EnumC23747b0.f114867z);
            boolean m124212q2 = AbstractC23775p0.m124212q(EnumC23747b0.f114854A);
            boolean m124212q3 = AbstractC23775p0.m124212q(EnumC23747b0.f114855B);
            if (!z12 && !z13 && !m124212q && !m124212q2 && !m124212q3) {
                z11 = false;
                fixedBannerView.m68602wN(!z11);
                boolean z14 = !AbstractC23309i.m122413t();
                boolean z15 = !AbstractC23309i.m122450u();
                boolean z16 = !C25244a.m130640r(true);
                C24559a.m127933c("NotificationNativeSetting", "checkToShowHintOnNotification masterOff: " + z12 + ", channelGroupOff: " + z13 + ", nativeMessageOff: " + m124212q + ", nativeGroupOff: " + m124212q2 + ", nativeCallOff: " + m124212q3 + ", singleOff: " + z14 + ", groupOff: " + z15 + ", callOff: " + z16);
                if (!z11) {
                    str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_on_notification_device);
                    fixedBannerView.f63744T0 = 4;
                    str = "1";
                } else if (z16 && z15 && z14) {
                    str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_msg_banner_notify_message_call_muted);
                    str = "8";
                } else if (z16 && z15) {
                    str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_msg_banner_notify_message_call_muted);
                    str = "7";
                } else if (z16 && z14) {
                    str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_msg_banner_notify_message_call_muted);
                    str = "6";
                } else if (z15 && z14) {
                    str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_msg_banner_notify_message_muted);
                    fixedBannerView.f63744T0 = 3;
                    str = "4";
                } else {
                    if (z16) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_banner_notify_call_muted);
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_banner_notify_cta_unmute);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        str3 = "5";
                    } else if (z14) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_msg_banner_notify_single_muted);
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_banner_notify_cta_unmute);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        fixedBannerView.f63744T0 = 2;
                        str3 = "2";
                    } else if (z15) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_msg_banner_notify_group_muted);
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_banner_notify_cta_unmute);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        fixedBannerView.f63744T0 = 1;
                        str3 = "3";
                    } else {
                        str = "";
                        str2 = null;
                    }
                    String str4 = m118743r02;
                    str = str3;
                    str2 = m118743r0;
                    m118743r03 = str4;
                }
                fixedBannerView.f63745U0 = str;
                if (str2 != null && str2.length() != 0 && fixedBannerView.m68581qP()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(" ");
                    length = sb2.length();
                    sb2.append(m118743r03);
                    if (length != -1) {
                        int length2 = sb2.length();
                        final SpannableString spannableString = new SpannableString(sb2.toString());
                        spannableString.setSpan(fixedBannerView.m68483SN(), length, length2, 33);
                        AbstractC19444a.m101697e(new Runnable() { // from class: u70.l0
                            @Override // java.lang.Runnable
                            public final void run() {
                                FixedBannerView.m68421CN(FixedBannerView.this, spannableString);
                            }
                        });
                    }
                    AbstractC23304d.f113370c2 = false;
                    if (AbstractC23304d.f113365b2) {
                        AbstractC23304d.f113365b2 = true;
                        m131500h = AbstractC25368s.m131500h("1", "0", fixedBannerView.f63745U0);
                        ?? r52 = z12;
                        if (AbstractC19074t.m100204b(fixedBannerView.f63745U0, "1")) {
                            if (m124212q) {
                                r52 = (z12 ? 1 : 0) | 2;
                            }
                            if (m124212q2) {
                                r52 = (r52 == true ? 1 : 0) | 4;
                            }
                            if (m124212q3) {
                                r52 = (r52 == true ? 1 : 0) | '\b';
                            }
                            if (z13) {
                                r52 = (r52 == true ? 1 : 0) | 16;
                            }
                            m131500h.add(String.valueOf((int) r52));
                        } else {
                            m131500h.add("0");
                        }
                        C0815e1 m2075D = C0815e1.m2075D();
                        String[] strArr = (String[]) m131500h.toArray(new String[0]);
                        m2075D.m2099U(3, 1, 41, (String[]) Arrays.copyOf(strArr, strArr.length));
                        return;
                    }
                    return;
                }
                AbstractC19444a.m101697e(new Runnable() { // from class: u70.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        FixedBannerView.m68418BN(FixedBannerView.this);
                    }
                });
            }
            z11 = true;
            fixedBannerView.m68602wN(!z11);
            boolean z142 = !AbstractC23309i.m122413t();
            boolean z152 = !AbstractC23309i.m122450u();
            boolean z162 = !C25244a.m130640r(true);
            C24559a.m127933c("NotificationNativeSetting", "checkToShowHintOnNotification masterOff: " + z12 + ", channelGroupOff: " + z13 + ", nativeMessageOff: " + m124212q + ", nativeGroupOff: " + m124212q2 + ", nativeCallOff: " + m124212q3 + ", singleOff: " + z142 + ", groupOff: " + z152 + ", callOff: " + z162);
            if (!z11) {
            }
            fixedBannerView.f63745U0 = str;
            if (str2 != null) {
                StringBuilder sb22 = new StringBuilder();
                sb22.append(str2);
                sb22.append(" ");
                length = sb22.length();
                sb22.append(m118743r03);
                if (length != -1) {
                }
                AbstractC23304d.f113370c2 = false;
                if (AbstractC23304d.f113365b2) {
                }
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: u70.k0
                @Override // java.lang.Runnable
                public final void run() {
                    FixedBannerView.m68418BN(FixedBannerView.this);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zO */
    public final C27096z0 m68615zO() {
        return (C27096z0) this.f63736L0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zP */
    public static final void m68616zP(FixedBannerView fixedBannerView) {
        AbstractC19074t.m100208f(fixedBannerView, "this$0");
        fixedBannerView.m68615zO().m139217V(new C23327e(0L, null, null, null, 15, null));
    }

    /* renamed from: BP */
    public final void m68617BP(InterfaceC12219b interfaceC12219b) {
        AbstractC19074t.m100208f(interfaceC12219b, "callback");
        this.f63743S0 = interfaceC12219b;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m68615zO().m103748N(C12247a.Companion.m68666a(m92642L3()));
        m68596uP();
    }

    /* renamed from: EP */
    public final void m68618EP(boolean z11) {
        if (!C32044o1.Companion.m154639a().m154619N()) {
            return;
        }
        if (z11) {
            m68615zO().m139212O(new C23335m(m68615zO().m139214Q()));
        } else {
            m68615zO().m139217V(new C23335m(0L, 1, null));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f63737M0 = linearLayout;
        linearLayout.setOrientation(1);
        m68600vP();
        LinearLayout linearLayout2 = this.f63737M0;
        if (linearLayout2 == null) {
            AbstractC19074t.m100223u("mainContainer");
            return null;
        }
        return linearLayout2;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        m68463NN();
        m68453KP();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        LinearLayout linearLayout = this.f63737M0;
        if (linearLayout == null) {
            AbstractC19074t.m100223u("mainContainer");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        this.f63738N0.m145993b();
    }

    /* renamed from: KN */
    public final void m68619KN() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: u70.p
            @Override // java.lang.Runnable
            public final void run() {
                FixedBannerView.m68455LN(FixedBannerView.this);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 73);
        bVar.m124119a().m124117e(this, 41);
        C21688c.Companion.m111854a().m111851x(this, "SYNC_MES", "PC_TRANSFER");
        m68576pO().removeMessages(1001);
        m68434FP();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m68587sN();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* renamed from: kP */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m68620kP(EnumC30982b enumC30982b) {
        final CharSequence m118743r0;
        int i11;
        if (enumC30982b == null) {
            C30983c m150606e = C30981a.m150598f().m150606e();
            AbstractC19074t.m100207e(m150606e, "getConnectionStateWithTime(...)");
            enumC30982b = m150606e.f142944a;
            if (enumC30982b == EnumC30982b.CONNECTED) {
                m68576pO().removeMessages(1001);
                C30981a.f142933e = 0L;
                m68427DP(this, false, 0, null, 6, null);
                return;
            }
        } else if (enumC30982b == EnumC30982b.CONNECTED) {
            m68576pO().removeMessages(1001);
            C30981a.f142933e = 0L;
            if (!m68615zO().m139216U(EnumC22502a.f110111p)) {
                return;
            }
        }
        int i12 = C12221c.f63777c[enumC30982b.ordinal()];
        boolean z11 = true;
        final int i13 = 0;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            m118743r0 = null;
                            z11 = false;
                            if (m118743r0 == null && m118743r0.length() != 0 && i13 != 0) {
                                if (m92676n2() != null) {
                                    AbstractC19444a.m101697e(new Runnable() { // from class: u70.j
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            FixedBannerView.m68561lP(FixedBannerView.this, i13, m118743r0);
                                        }
                                    });
                                    this.f63740P0 = enumC30982b;
                                    m68467ON(enumC30982b);
                                }
                                if (z11) {
                                    m68576pO().postDelayed(new Runnable() { // from class: u70.k
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            FixedBannerView.m68565mP(FixedBannerView.this);
                                        }
                                    }, 1000L);
                                    return;
                                }
                                return;
                            }
                            AbstractC19444a.m101697e(new Runnable() { // from class: u70.m
                                @Override // java.lang.Runnable
                                public final void run() {
                                    FixedBannerView.m68569nP(FixedBannerView.this);
                                }
                            });
                            this.f63740P0 = null;
                        }
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_notify_connected);
                        i13 = AbstractC16801x.bg_connect_notif_success;
                        C30981a.f142933e = 0L;
                        if (m118743r0 == null) {
                        }
                        AbstractC19444a.m101697e(new Runnable() { // from class: u70.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                FixedBannerView.m68569nP(FixedBannerView.this);
                            }
                        });
                        this.f63740P0 = null;
                    }
                    m118743r0 = AbstractC1463b.m7440a(AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_notify_limited_html), 0);
                    i11 = AbstractC16801x.bg_connect_notif_pending;
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_notify_connecting);
                    i11 = AbstractC16801x.bg_connect_notif_pending;
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_notify_no_network);
                i11 = AbstractC16801x.bg_connect_notif_error;
            }
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_notify_airplane_mode);
            i11 = AbstractC16801x.bg_connect_notif_error;
        }
        i13 = i11;
        z11 = false;
        if (m118743r0 == null) {
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: u70.m
            @Override // java.lang.Runnable
            public final void run() {
                FixedBannerView.m68569nP(FixedBannerView.this);
            }
        });
        this.f63740P0 = null;
    }

    @Override // p586vt.InterfaceC28625j
    /* renamed from: lk */
    public void mo57172lk(final AbstractC28627l abstractC28627l) {
        if (abstractC28627l != null && ViewOnClickListenerC0139g.Companion.m603c(abstractC28627l, m68577pP().get())) {
            if (!m92672lJ()) {
                return;
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: u70.e0
                @Override // java.lang.Runnable
                public final void run() {
                    FixedBannerView.m68525cQ(FixedBannerView.this, abstractC28627l);
                }
            });
        } else {
            m68577pP().set(false);
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: u70.c0
                @Override // java.lang.Runnable
                public final void run() {
                    FixedBannerView.m68517aQ();
                }
            });
            AbstractC19444a.m101695c(new Runnable() { // from class: u70.d0
                @Override // java.lang.Runnable
                public final void run() {
                    FixedBannerView.m68521bQ(FixedBannerView.this);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        final String stringExtra;
        boolean z11 = false;
        if (i11 != 1805) {
            final int i13 = 4;
            if (i11 != 1806) {
                if (i11 != 18054) {
                    if (i11 != 18055) {
                        super.onActivityResult(i11, i12, intent);
                        return;
                    }
                    if (i12 == -1) {
                        AbstractC19074t.m100205c(intent);
                        String stringExtra2 = intent.getStringExtra("extra_acc_local_auth");
                        if (!TextUtils.isEmpty(stringExtra2)) {
                            C25804a m120688m = AbstractC23306f.m120688m();
                            AbstractC19074t.m100205c(stringExtra2);
                            m120688m.m132982A(stringExtra2, 2);
                            C22447s.m116011M(3, m92676n2(), 1, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i12 == -1) {
                    AbstractC19074t.m100205c(intent);
                    String stringExtra3 = intent.getStringExtra("extra_acc_local_auth");
                    if (!TextUtils.isEmpty(stringExtra3)) {
                        C25804a m120688m2 = AbstractC23306f.m120688m();
                        AbstractC19074t.m100205c(stringExtra3);
                        m120688m2.m132982A(stringExtra3, 2);
                        C22447s.m116011M(4, m92676n2(), 1, 0);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i12 == -1) {
                if (intent != null) {
                    try {
                        z11 = intent.getBooleanExtra("return_setted_pass", false);
                        i13 = intent.getIntExtra("extra_entry_point", 4);
                        stringExtra = intent.getStringExtra("extra_acc_local_auth");
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                        return;
                    }
                } else {
                    stringExtra = null;
                }
                if (z11) {
                    i13 = 10;
                }
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: u70.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        FixedBannerView.m68585rP(stringExtra, i13, this);
                    }
                });
                return;
            }
            this.f63751a1 = false;
            return;
        }
        if (i12 == -1) {
            if (intent == null || !intent.getBooleanExtra("extra_delete_data", false)) {
                C26263i.m135055u().m135085r0(13);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 73);
        bVar.m124119a().m124115b(this, 41);
        C21688c.Companion.m111854a().m111849u(this, "SYNC_MES", "PC_TRANSFER");
        m68507YN();
        m68610yN();
        m68497VP(C20024r.m103943l());
        m68619KN();
        m68429EN();
        m68440HN();
        m68444IN();
        m68425DN();
        m68448JN();
        m68606xN(AbstractC23306f.m120627V1().m90234d());
    }

    /* renamed from: uO */
    public final View m68621uO() {
        if (m68615zO().m139216U(EnumC22502a.f110116u)) {
            return m68549iO().f138271r;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        switch (i11) {
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                m68497VP(false);
                return;
            case 73:
                m68529dP(objArr);
                return;
            case 10036:
                m68497VP(true);
                return;
            case 150803:
                m68516aP(objArr);
                return;
            case 150804:
                if (AbstractC3489d.m17506n()) {
                    AbstractC19444a.m101697e(new Runnable() { // from class: u70.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            FixedBannerView.m68503XN(FixedBannerView.this);
                        }
                    });
                    return;
                }
                return;
            case 150808:
                AbstractC19444a.m101697e(new Runnable() { // from class: u70.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        FixedBannerView.m68499WN(FixedBannerView.this);
                    }
                });
                return;
            case 150811:
                m68550iP();
                return;
            default:
                return;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m68438GP();
    }
}
