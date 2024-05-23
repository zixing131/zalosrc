package com.zing.zalo.p077ui;

import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import ag0.C0809c1;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.core.content.AbstractC1388a;
import androidx.lifecycle.AbstractC1803x;
import au.AbstractC2345f;
import au.AbstractC2379w;
import au.C2350h0;
import com.androidquery.util.C3979l;
import com.showingphotolib.view.AnimationLayout;
import com.showingphotolib.view.ViewAnimationTarget;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.analytics.ZaloTrackingActivity;
import com.zing.zalo.biometric.BiometricWrapper;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamPlaybackView;
import com.zing.zalo.p077ui.zviews.FeedMinimizableVideoPlayerView;
import com.zing.zalo.p077ui.zviews.GifViewerZView;
import com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.passcode.PassCodeView;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import gg0.AbstractC19444a;
import hf0.C20043e;
import ho0.AbstractC20110a;
import i40.C20275e;
import i40.InterfaceC20278h;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23006a0;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import me0.AbstractC23171p0;
import me0.AbstractC23174p3;
import me0.C23212s8;
import me0.C23269y3;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p133ek.AbstractC18458a;
import p231i7.C20358b;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23999j;
import p463qw.C25498b;
import p542ub.InterfaceC27218a;
import p594w1.C28685a;
import p716zh.AbstractC32146v5;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xl0.InterfaceC30162c;

/* loaded from: classes.dex */
public class BaseZaloActivity extends ZaloTrackingActivity implements AnimationLayout.OnEventListener, InterfaceC20278h {
    public static final C10924a Companion = new C10924a(null);

    /* renamed from: h0 */
    private static final String f55172h0;

    /* renamed from: T */
    private final InterfaceC24854k f55173T;

    /* renamed from: U */
    private C20275e f55174U;

    /* renamed from: V */
    private Bundle f55175V;

    /* renamed from: W */
    private int f55176W;

    /* renamed from: X */
    private boolean f55177X;

    /* renamed from: Y */
    private Handler f55178Y;

    /* renamed from: Z */
    private boolean f55179Z;

    /* renamed from: a0 */
    private final long f55180a0;

    /* renamed from: b0 */
    private boolean f55181b0;

    /* renamed from: c0 */
    private final BroadcastReceiver f55182c0;

    /* renamed from: d0 */
    private int f55183d0;

    /* renamed from: e0 */
    private int f55184e0;

    /* renamed from: f0 */
    private boolean f55185f0;

    /* renamed from: g0 */
    private InterfaceC18494a f55186g0;

    /* renamed from: com.zing.zalo.ui.BaseZaloActivity$a */
    /* loaded from: classes.dex */
    public static final class C10924a {
        private C10924a() {
        }

        public /* synthetic */ C10924a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3979l m56697a(String str) {
            int length = AbstractC23006a0.f111910b.length;
            for (int i11 = 0; i11 < length; i11++) {
                C3979l m125676A2 = C23999j.m125676A2(str, AbstractC23006a0.f111910b[i11], C23278z2.m120110a());
                if (m125676A2 != null && m125676A2.m18839c() != null) {
                    return m125676A2;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final String m56698b() {
            return BaseZaloActivity.f55172h0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.BaseZaloActivity$b */
    /* loaded from: classes.dex */
    public static final class C10925b extends AbstractC19075u implements InterfaceC18494a {
        C10925b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AnimationLayout mo12V4() {
            AnimationLayout animationLayout = new AnimationLayout(BaseZaloActivity.this);
            animationLayout.setOnEventListener(BaseZaloActivity.this);
            return animationLayout;
        }
    }

    /* renamed from: com.zing.zalo.ui.BaseZaloActivity$c */
    /* loaded from: classes5.dex */
    public static final class C10926c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ int[] f55188a;

        /* renamed from: b */
        final /* synthetic */ String[] f55189b;

        C10926c(int[] iArr, String[] strArr) {
            this.f55188a = iArr;
            this.f55189b = strArr;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            int length = this.f55188a.length;
            for (int i11 = 0; i11 < length; i11++) {
                int m118185w = AbstractC23034c6.m118185w(this.f55189b[i11]);
                if (this.f55188a[i11] == -1) {
                    m118185w++;
                }
                String str = this.f55189b[i11];
                if (m118185w != AbstractC23309i.m121560W9(str) && m118185w >= 18100) {
                    AbstractC23309i.m121322Pu(str, m118185w);
                    AbstractC20887g.m109246x(m118185w, System.currentTimeMillis());
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.BaseZaloActivity$d */
    /* loaded from: classes5.dex */
    public static final class C10927d extends BiometricWrapper.AbstractC7309a {

        /* renamed from: a */
        final /* synthetic */ PassCodeView.InterfaceC17495f f55190a;

        C10927d(PassCodeView.InterfaceC17495f interfaceC17495f) {
            this.f55190a = interfaceC17495f;
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: a */
        public void mo37276a(int i11, CharSequence charSequence) {
            String m118743r0;
            String str;
            super.mo37276a(i11, charSequence);
            PassCodeView.InterfaceC17495f interfaceC17495f = this.f55190a;
            if (interfaceC17495f != null) {
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                interfaceC17495f.mo93117b(i11, str);
            }
            if (i11 != 13 && i11 != 10) {
                if (charSequence != null && charSequence.length() != 0) {
                    m118743r0 = charSequence.toString();
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.fingerprint_acquired_general_zalo);
                }
                ToastUtils.showMess(m118743r0);
            }
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: b */
        public void mo37277b() {
            super.mo37277b();
            PassCodeView.InterfaceC17495f interfaceC17495f = this.f55190a;
            if (interfaceC17495f != null) {
                interfaceC17495f.mo93118c();
            }
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: c */
        public void mo37278c(BiometricWrapper.C7310b c7310b) {
            AbstractC19074t.m100208f(c7310b, "authenticationResult");
            super.mo37278c(c7310b);
            PassCodeView.InterfaceC17495f interfaceC17495f = this.f55190a;
            if (interfaceC17495f != null) {
                interfaceC17495f.mo93116a();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.BaseZaloActivity$e */
    /* loaded from: classes5.dex */
    public static final class C10928e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ String f55191A;

        /* renamed from: B */
        final /* synthetic */ Bundle f55192B;

        /* renamed from: C */
        final /* synthetic */ int f55193C;

        /* renamed from: D */
        final /* synthetic */ AnimationTarget f55194D;

        /* renamed from: E */
        final /* synthetic */ C23528a f55195E;

        /* renamed from: t */
        Object f55196t;

        /* renamed from: u */
        Object f55197u;

        /* renamed from: v */
        Object f55198v;

        /* renamed from: w */
        int f55199w;

        /* renamed from: x */
        private /* synthetic */ Object f55200x;

        /* renamed from: z */
        final /* synthetic */ InterfaceC30162c f55202z;

        /* renamed from: com.zing.zalo.ui.BaseZaloActivity$e$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f55203t;

            /* renamed from: u */
            final /* synthetic */ C19059j0 f55204u;

            /* renamed from: v */
            final /* synthetic */ C23528a f55205v;

            /* renamed from: w */
            final /* synthetic */ String f55206w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C19059j0 c19059j0, C23528a c23528a, String str, Continuation continuation) {
                super(2, continuation);
                this.f55204u = c19059j0;
                this.f55205v = c23528a;
                this.f55206w = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f55204u, this.f55205v, this.f55206w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f55203t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f55204u.f94941p = this.f55205v.m123608n(this.f55206w, C3979l.b.UNKNOWN, AbstractC23006a0.m117875E(), C23278z2.m120110a());
                    Object obj2 = this.f55204u.f94941p;
                    if (obj2 != null) {
                        AbstractC19074t.m100205c(obj2);
                        if (((C3979l) obj2).m18839c() != null) {
                            C23999j.m125714W2(this.f55206w, AbstractC23006a0.m117875E(), 0, (C3979l) this.f55204u.f94941p, false, C23278z2.m120110a(), false, false);
                        }
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

        /* renamed from: com.zing.zalo.ui.BaseZaloActivity$e$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f55207t;

            /* renamed from: u */
            final /* synthetic */ C19059j0 f55208u;

            /* renamed from: v */
            final /* synthetic */ C23528a f55209v;

            /* renamed from: w */
            final /* synthetic */ C19059j0 f55210w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C19059j0 c19059j0, C23528a c23528a, C19059j0 c19059j02, Continuation continuation) {
                super(2, continuation);
                this.f55208u = c19059j0;
                this.f55209v = c23528a;
                this.f55210w = c19059j02;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f55208u, this.f55209v, this.f55210w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f55207t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f55208u.f94941p = this.f55209v.m123608n((String) this.f55210w.f94941p, C3979l.b.UNKNOWN, AbstractC23006a0.m117875E(), C23278z2.m120110a());
                    Object obj2 = this.f55208u.f94941p;
                    if (obj2 != null) {
                        AbstractC19074t.m100205c(obj2);
                        if (((C3979l) obj2).m18839c() != null) {
                            C23999j.m125714W2((String) this.f55210w.f94941p, AbstractC23006a0.m117875E(), 0, (C3979l) this.f55208u.f94941p, false, C23278z2.m120110a(), false, false);
                        }
                    }
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10928e(InterfaceC30162c interfaceC30162c, String str, Bundle bundle, int i11, AnimationTarget animationTarget, C23528a c23528a, Continuation continuation) {
            super(2, continuation);
            this.f55202z = interfaceC30162c;
            this.f55191A = str;
            this.f55192B = bundle;
            this.f55193C = i11;
            this.f55194D = animationTarget;
            this.f55195E = c23528a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C10928e c10928e = new C10928e(this.f55202z, this.f55191A, this.f55192B, this.f55193C, this.f55194D, this.f55195E, continuation);
            c10928e.f55200x = obj;
            return c10928e;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x01a6 A[Catch: Exception -> 0x0027, TryCatch #1 {Exception -> 0x0027, blocks: (B:7:0x0022, B:8:0x018b, B:10:0x01a6, B:12:0x01ac, B:15:0x01b5, B:19:0x01bd, B:23:0x01f6, B:25:0x01fe, B:26:0x0206, B:28:0x020c, B:31:0x0211, B:32:0x0240, B:33:0x0229, B:42:0x0161, B:44:0x0165, B:46:0x016f), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x01b9 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x01fe A[Catch: Exception -> 0x0027, TryCatch #1 {Exception -> 0x0027, blocks: (B:7:0x0022, B:8:0x018b, B:10:0x01a6, B:12:0x01ac, B:15:0x01b5, B:19:0x01bd, B:23:0x01f6, B:25:0x01fe, B:26:0x0206, B:28:0x020c, B:31:0x0211, B:32:0x0240, B:33:0x0229, B:42:0x0161, B:44:0x0165, B:46:0x016f), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x020c A[Catch: Exception -> 0x0027, TryCatch #1 {Exception -> 0x0027, blocks: (B:7:0x0022, B:8:0x018b, B:10:0x01a6, B:12:0x01ac, B:15:0x01b5, B:19:0x01bd, B:23:0x01f6, B:25:0x01fe, B:26:0x0206, B:28:0x020c, B:31:0x0211, B:32:0x0240, B:33:0x0229, B:42:0x0161, B:44:0x0165, B:46:0x016f), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x018a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0137 A[Catch: Exception -> 0x0082, TRY_LEAVE, TryCatch #2 {Exception -> 0x0082, blocks: (B:55:0x0052, B:57:0x0072, B:60:0x0079, B:61:0x0088, B:63:0x0095, B:65:0x009d, B:67:0x0133, B:69:0x0137, B:75:0x00bc, B:77:0x00c0, B:79:0x00c6, B:81:0x00ce, B:83:0x00d5, B:86:0x00dd, B:88:0x00e7, B:89:0x00f9, B:90:0x011b, B:92:0x0125, B:94:0x0131, B:95:0x0107, B:97:0x010f, B:100:0x0119), top: B:54:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00c6 A[Catch: Exception -> 0x0082, TryCatch #2 {Exception -> 0x0082, blocks: (B:55:0x0052, B:57:0x0072, B:60:0x0079, B:61:0x0088, B:63:0x0095, B:65:0x009d, B:67:0x0133, B:69:0x0137, B:75:0x00bc, B:77:0x00c0, B:79:0x00c6, B:81:0x00ce, B:83:0x00d5, B:86:0x00dd, B:88:0x00e7, B:89:0x00f9, B:90:0x011b, B:92:0x0125, B:94:0x0131, B:95:0x0107, B:97:0x010f, B:100:0x0119), top: B:54:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0107 A[Catch: Exception -> 0x0082, TryCatch #2 {Exception -> 0x0082, blocks: (B:55:0x0052, B:57:0x0072, B:60:0x0079, B:61:0x0088, B:63:0x0095, B:65:0x009d, B:67:0x0133, B:69:0x0137, B:75:0x00bc, B:77:0x00c0, B:79:0x00c6, B:81:0x00ce, B:83:0x00d5, B:86:0x00dd, B:88:0x00e7, B:89:0x00f9, B:90:0x011b, B:92:0x0125, B:94:0x0131, B:95:0x0107, B:97:0x010f, B:100:0x0119), top: B:54:0x0052 }] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C20275e c20275e;
            C19059j0 c19059j0;
            String str;
            C3979l c3979l;
            C19059j0 c19059j02;
            Object obj2;
            Bundle bundle;
            C3979l m56697a;
            Object obj3;
            C20275e c20275e2;
            C19059j0 c19059j03;
            C20275e c20275e3;
            C19059j0 c19059j04;
            C19059j0 c19059j05;
            Object obj4;
            CoroutineDispatcher m112680b;
            b bVar;
            boolean m105878o;
            AnimationTarget animationTarget;
            boolean z11;
            Bundle bundle2;
            int i11;
            Class m155121d;
            Rect animTargetLocationOnScreen;
            Object obj5 = "";
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f55199w;
            try {
            } catch (Exception e11) {
                e = e11;
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        c19059j03 = (C19059j0) this.f55197u;
                        c20275e2 = (C20275e) this.f55196t;
                        AbstractC24862s.m129228b(obj);
                        BaseZaloActivity.this.f55174U = c20275e2;
                        BaseZaloActivity.this.f55175V = this.f55192B;
                        BaseZaloActivity.this.f55176W = this.f55193C;
                        m105878o = c20275e2.m105878o();
                        animationTarget = this.f55194D;
                        if (animationTarget == null && (animTargetLocationOnScreen = animationTarget.getAnimTargetLocationOnScreen()) != null && !animTargetLocationOnScreen.isEmpty()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (c19059j03.f94941p != null || !z11 || m105878o) {
                            bundle2 = BaseZaloActivity.this.f55175V;
                            if (bundle2 != null) {
                                i11 = bundle2.getInt("EXTRA_INT_IMAGE_VIEWER_TYPE");
                            } else {
                                i11 = 0;
                            }
                            m155121d = AbstractC32146v5.m155121d(i11);
                            if (!m105878o && c19059j03.f94941p != null) {
                                BaseZaloActivity.this.mo35579p().m93066i2(m155121d, BaseZaloActivity.this.f55175V, BaseZaloActivity.this.f55176W, 0, true);
                                BaseZaloActivity.this.f55177X = false;
                            }
                            BaseZaloActivity.this.mo35579p().m93066i2(m155121d, BaseZaloActivity.this.f55175V, BaseZaloActivity.this.f55176W, 1, true);
                            BaseZaloActivity.this.f55177X = false;
                        } else {
                            AnimationLayout m56676o3 = BaseZaloActivity.this.m56676o3();
                            AnimationTarget animationTarget2 = this.f55194D;
                            m56676o3.type = 0;
                            m56676o3.setClipTopHeight(c20275e2.m105871c());
                            m56676o3.setClipBottomHeight(c20275e2.m105870b());
                            m56676o3.setRounded(c20275e2.m105874i());
                            m56676o3.expand(animationTarget2, (C3979l) c19059j03.f94941p);
                            c20275e2.m105864J((C3979l) c19059j03.f94941p);
                            BaseZaloActivity.this.m56693r3().sendEmptyMessageDelayed(1, 1000L);
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c19059j05 = (C19059j0) this.f55198v;
                c19059j04 = (C19059j0) this.f55197u;
                c20275e3 = (C20275e) this.f55196t;
                obj4 = (CoroutineScope) this.f55200x;
                try {
                    AbstractC24862s.m129228b(obj);
                } catch (Exception e12) {
                    e = e12;
                    obj5 = obj4;
                    AbstractC23350e.m122776f(obj5.getClass().getSimpleName(), e);
                    BaseZaloActivity.this.f55177X = false;
                    return C24848g0.f119245a;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Object obj6 = (CoroutineScope) this.f55200x;
                try {
                    BaseZaloActivity.this.f55177X = true;
                    InterfaceC30162c interfaceC30162c = this.f55202z;
                    AbstractC19074t.m100206d(interfaceC30162c, "null cannot be cast to non-null type com.zing.zalo.ui.animation.ImageViewerAnimationController");
                    c20275e = (C20275e) interfaceC30162c;
                    AbstractC2379w.m12430d(BaseZaloActivity.this.getCurrentFocus());
                    c19059j0 = new C19059j0();
                    str = this.f55191A;
                } catch (Exception e13) {
                    obj5 = obj6;
                    e = e13;
                    AbstractC23350e.m122776f(obj5.getClass().getSimpleName(), e);
                    BaseZaloActivity.this.f55177X = false;
                    return C24848g0.f119245a;
                }
                if (str != null && str.length() != 0) {
                    c3979l = BaseZaloActivity.Companion.m56697a(this.f55191A);
                    c19059j0.f94941p = c3979l;
                    c19059j02 = new C19059j0();
                    c19059j02.f94941p = "";
                    obj2 = c19059j0.f94941p;
                    if ((obj2 != null || ((C3979l) obj2).m18839c() == null || ((C3979l) c19059j0.f94941p).m18839c().getWidth() * ((C3979l) c19059j0.f94941p).m18839c().getHeight() < 57600) && (bundle = this.f55192B) != null) {
                        if (!bundle.containsKey("medialist")) {
                            ArrayList parcelableArrayList = this.f55192B.getParcelableArrayList("medialist");
                            if (parcelableArrayList != null && (!parcelableArrayList.isEmpty())) {
                                if (parcelableArrayList.size() > 1) {
                                    if (parcelableArrayList.size() > c20275e.m105875j()) {
                                        String str2 = ((ItemAlbumMobile) parcelableArrayList.get(c20275e.m105875j())).f42548C;
                                        AbstractC19074t.m100207e(str2, "thumbnail");
                                        c19059j02.f94941p = str2;
                                    }
                                } else {
                                    String str3 = ((ItemAlbumMobile) parcelableArrayList.get(0)).f42548C;
                                    AbstractC19074t.m100207e(str3, "thumbnail");
                                    c19059j02.f94941p = str3;
                                }
                            }
                        } else if (this.f55192B.containsKey("EXTRA_STR_CURRENT_INDEX_THUMB")) {
                            Object string = this.f55192B.getString("EXTRA_STR_CURRENT_INDEX_THUMB");
                            if (string != null) {
                                obj5 = string;
                            }
                            c19059j02.f94941p = obj5;
                        }
                        if (((CharSequence) c19059j02.f94941p).length() > 0 && (m56697a = BaseZaloActivity.Companion.m56697a((String) c19059j02.f94941p)) != null) {
                            c19059j0.f94941p = m56697a;
                        }
                    }
                    if (c19059j0.f94941p != null) {
                        CoroutineDispatcher m112680b2 = Dispatchers.m112680b();
                        a aVar = new a(c19059j0, this.f55195E, this.f55191A, null);
                        this.f55200x = obj6;
                        this.f55196t = c20275e;
                        this.f55197u = c19059j0;
                        this.f55198v = c19059j02;
                        this.f55199w = 1;
                        if (BuildersKt.m112534g(m112680b2, aVar, this) == m142578e) {
                            return m142578e;
                        }
                        c20275e3 = c20275e;
                        c19059j04 = c19059j0;
                        c19059j05 = c19059j02;
                        obj4 = obj6;
                    } else {
                        obj3 = obj6;
                        c20275e2 = c20275e;
                        c19059j03 = c19059j0;
                        if (c19059j03.f94941p == null && ((CharSequence) c19059j02.f94941p).length() > 0) {
                            m112680b = Dispatchers.m112680b();
                            bVar = new b(c19059j03, this.f55195E, c19059j02, null);
                            this.f55200x = obj3;
                            this.f55196t = c20275e2;
                            this.f55197u = c19059j03;
                            this.f55198v = null;
                            this.f55199w = 2;
                            if (BuildersKt.m112534g(m112680b, bVar, this) == m142578e) {
                                return m142578e;
                            }
                        }
                        BaseZaloActivity.this.f55174U = c20275e2;
                        BaseZaloActivity.this.f55175V = this.f55192B;
                        BaseZaloActivity.this.f55176W = this.f55193C;
                        m105878o = c20275e2.m105878o();
                        animationTarget = this.f55194D;
                        if (animationTarget == null) {
                        }
                        z11 = false;
                        if (c19059j03.f94941p != null) {
                        }
                        bundle2 = BaseZaloActivity.this.f55175V;
                        if (bundle2 != null) {
                        }
                        m155121d = AbstractC32146v5.m155121d(i11);
                        if (!m105878o) {
                            BaseZaloActivity.this.mo35579p().m93066i2(m155121d, BaseZaloActivity.this.f55175V, BaseZaloActivity.this.f55176W, 0, true);
                            BaseZaloActivity.this.f55177X = false;
                            return C24848g0.f119245a;
                        }
                        BaseZaloActivity.this.mo35579p().m93066i2(m155121d, BaseZaloActivity.this.f55175V, BaseZaloActivity.this.f55176W, 1, true);
                        BaseZaloActivity.this.f55177X = false;
                        return C24848g0.f119245a;
                    }
                }
                c3979l = null;
                c19059j0.f94941p = c3979l;
                c19059j02 = new C19059j0();
                c19059j02.f94941p = "";
                obj2 = c19059j0.f94941p;
                if (obj2 != null) {
                }
                if (!bundle.containsKey("medialist")) {
                }
                if (((CharSequence) c19059j02.f94941p).length() > 0) {
                    c19059j0.f94941p = m56697a;
                }
                if (c19059j0.f94941p != null) {
                }
            }
            c19059j02 = c19059j05;
            c19059j03 = c19059j04;
            c20275e2 = c20275e3;
            obj3 = obj4;
            if (c19059j03.f94941p == null) {
                m112680b = Dispatchers.m112680b();
                bVar = new b(c19059j03, this.f55195E, c19059j02, null);
                this.f55200x = obj3;
                this.f55196t = c20275e2;
                this.f55197u = c19059j03;
                this.f55198v = null;
                this.f55199w = 2;
                if (BuildersKt.m112534g(m112680b, bVar, this) == m142578e) {
                }
            }
            BaseZaloActivity.this.f55174U = c20275e2;
            BaseZaloActivity.this.f55175V = this.f55192B;
            BaseZaloActivity.this.f55176W = this.f55193C;
            m105878o = c20275e2.m105878o();
            animationTarget = this.f55194D;
            if (animationTarget == null) {
            }
            z11 = false;
            if (c19059j03.f94941p != null) {
            }
            bundle2 = BaseZaloActivity.this.f55175V;
            if (bundle2 != null) {
            }
            m155121d = AbstractC32146v5.m155121d(i11);
            if (!m105878o) {
            }
            BaseZaloActivity.this.mo35579p().m93066i2(m155121d, BaseZaloActivity.this.f55175V, BaseZaloActivity.this.f55176W, 1, true);
            BaseZaloActivity.this.f55177X = false;
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10928e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        String simpleName = BaseZaloActivity.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f55172h0 = simpleName;
    }

    public BaseZaloActivity() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C10925b());
        this.f55173T = m129210a;
        this.f55178Y = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: h40.g
            public /* synthetic */ C19799g() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m56679z3;
                m56679z3 = BaseZaloActivity.m56679z3(BaseZaloActivity.this, message);
                return m56679z3;
            }
        });
        this.f55180a0 = System.currentTimeMillis();
        this.f55182c0 = new BroadcastReceiver() { // from class: com.zing.zalo.ui.BaseZaloActivity$mBroadcastReceiverThemeChanged$1
            public BaseZaloActivity$mBroadcastReceiverThemeChanged$1() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC19074t.m100208f(context, "context");
                AbstractC19074t.m100208f(intent, "intent");
                if (BaseZaloActivity.this.isFinishing()) {
                    return;
                }
                String action = intent.getAction();
                BaseZaloActivity.Companion.m56698b();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Receive broadcast action: ");
                sb2.append(action);
                if (action != null) {
                    switch (action.hashCode()) {
                        case -1617047588:
                            if (action.equals("com.zing.zalo.ACTION_EXIT")) {
                                try {
                                    BaseZaloActivity.this.finish();
                                    return;
                                } catch (Exception e11) {
                                    AbstractC23350e.m122776f(BaseZaloActivity.Companion.m56698b(), e11);
                                    return;
                                }
                            }
                            return;
                        case -1183784766:
                            if (action.equals("com.zing.zalo.action.ACTION_THEME_CHANGED")) {
                                if (!C23212s8.f112471a.m119612j().get()) {
                                    BaseZaloActivity.this.mo35579p().mo57056b0(false);
                                }
                                C2350h0.f9867a.m12324b();
                                return;
                            }
                            return;
                        case 80028842:
                            if (action.equals("com.zing.zalo.action.ACTION_DENSITY_CONFIG_CHANGED")) {
                                BaseZaloActivity.this.finish();
                                return;
                            }
                            return;
                        case 2007722848:
                            if (action.equals("com.zing.zalo.action.ACTION_FONT_CHANGED")) {
                                BaseZaloActivity.this.mo35579p().mo57056b0(false);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }
        };
        this.f55183d0 = 1;
        this.f55184e0 = 1;
    }

    /* renamed from: A3 */
    public static final void m56660A3() {
        if (AbstractC0852x.f3062g) {
            AbstractC23309i.m122104kq(System.currentTimeMillis());
            AbstractC0852x.m2324A("Set last time use app");
        }
    }

    /* renamed from: J3 */
    public static final void m56661J3(BaseZaloActivity baseZaloActivity, Class cls, Bundle bundle, int i11, boolean z11) {
        AbstractC19074t.m100208f(baseZaloActivity, "this$0");
        super.mo35573l4(cls, bundle, i11, z11);
    }

    /* renamed from: R3 */
    public static final void m56668R3(BaseZaloActivity baseZaloActivity, Class cls, Bundle bundle, int i11, int i12, boolean z11) {
        AbstractC19074t.m100208f(baseZaloActivity, "this$0");
        super.mo35581q(cls, bundle, i11, i12, z11);
    }

    /* renamed from: f3 */
    private final void m56675f3(Intent intent) {
        try {
            ComponentName resolveActivity = intent.resolveActivity(getPackageManager());
            if (resolveActivity != null && AbstractC19074t.m100204b(resolveActivity.getPackageName(), MainApplication.Companion.m35500c().getPackageName())) {
                String className = resolveActivity.getClassName();
                AbstractC23304d.f113302M0 = className;
                AbstractC23309i.m122617yi(className);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o3 */
    public final AnimationLayout m56676o3() {
        return (AnimationLayout) this.f55173T.getValue();
    }

    /* renamed from: t3 */
    public static final C3979l m56677t3(String str) {
        return Companion.m56697a(str);
    }

    /* renamed from: y3 */
    private final boolean m56678y3() {
        if (getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            return true;
        }
        return false;
    }

    /* renamed from: z3 */
    public static final boolean m56679z3(BaseZaloActivity baseZaloActivity, Message message) {
        AbstractC19074t.m100208f(baseZaloActivity, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        if (message.what == 1) {
            baseZaloActivity.f55177X = false;
        }
        return false;
    }

    /* renamed from: B3 */
    public final void m56680B3(InterfaceC18494a interfaceC18494a) {
        this.f55186g0 = interfaceC18494a;
    }

    @Override // i40.InterfaceC20278h
    /* renamed from: D */
    public void mo56681D(int i11) {
        C20275e c20275e = this.f55174U;
        if (c20275e != null) {
            c20275e.m105869O(i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:3:0x000b, B:5:0x000f, B:10:0x001b, B:12:0x002d, B:15:0x0035, B:18:0x003c, B:20:0x0048, B:24:0x0054, B:26:0x008f, B:28:0x0097, B:29:0x00ad, B:31:0x00aa), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:3:0x000b, B:5:0x000f, B:10:0x001b, B:12:0x002d, B:15:0x0035, B:18:0x003c, B:20:0x0048, B:24:0x0054, B:26:0x008f, B:28:0x0097, B:29:0x00ad, B:31:0x00aa), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:3:0x000b, B:5:0x000f, B:10:0x001b, B:12:0x002d, B:15:0x0035, B:18:0x003c, B:20:0x0048, B:24:0x0054, B:26:0x008f, B:28:0x0097, B:29:0x00ad, B:31:0x00aa), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
    /* renamed from: E3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m56682E3(InterfaceC27218a interfaceC27218a, AnimationTarget animationTarget, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, C17391z c17391z, int i11) {
        C3979l c3979l;
        boolean z11;
        AbstractC19074t.m100208f(bundle, "param");
        AbstractC19074t.m100208f(c17391z, "video");
        try {
            if (!this.f55177X && !m56676o3().isAnimating()) {
                this.f55177X = true;
                C20275e c20275e = (C20275e) interfaceC30162c;
                AbstractC2379w.m12430d(getCurrentFocus());
                if (!AbstractC23171p0.m119371c() && !AbstractC23136l9.m118654H0(this) && str != null && str.length() != 0) {
                    c3979l = Companion.m56697a(str);
                    if (c20275e == null) {
                        z11 = c20275e.m105878o();
                    } else {
                        z11 = false;
                    }
                    if (c3979l == null && animationTarget != null && !z11) {
                        bundle.putInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
                        bundle.putString("video_str", c17391z.m92540e().toString());
                        this.f55174U = c20275e;
                        this.f55175V = bundle;
                        AnimationLayout m56676o3 = m56676o3();
                        m56676o3.type = 1;
                        AbstractC19074t.m100205c(c20275e);
                        m56676o3.setClipTopHeight(c20275e.m105871c());
                        m56676o3.setClipBottomHeight(c20275e.m105870b());
                        m56676o3.expand(animationTarget, c3979l);
                        c20275e.m105864J(c3979l);
                        this.f55178Y.sendEmptyMessageDelayed(1, 1000L);
                        return;
                    }
                    if (!bundle.getBoolean("EXTRA_BOOL_IS_FEED_VIDEO")) {
                        mo35579p().m93066i2(FeedMinimizableVideoPlayerView.class, bundle, bundle.getInt("EXTRA_INT_REQUEST_CODE"), 1, true);
                    } else {
                        C20043e.m104031v(interfaceC27218a, c17391z, i11, bundle);
                    }
                    this.f55177X = false;
                }
                c3979l = null;
                if (c20275e == null) {
                }
                if (c3979l == null) {
                }
                if (!bundle.getBoolean("EXTRA_BOOL_IS_FEED_VIDEO")) {
                }
                this.f55177X = false;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f55172h0, e11);
            this.f55177X = false;
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: G */
    public String mo35550G() {
        String m121375R9 = AbstractC23309i.m121375R9(MainApplication.Companion.m35500c());
        AbstractC19074t.m100207e(m121375R9, "getPassCodeStringMD5OldFromXML(...)");
        return m121375R9;
    }

    /* renamed from: G3 */
    public final void m56683G3(InterfaceC27218a interfaceC27218a, AnimationTarget animationTarget, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, C17391z c17391z, int i11, boolean z11) {
        C3979l c3979l;
        AbstractC19074t.m100208f(bundle, "param");
        AbstractC19074t.m100208f(interfaceC30162c, "iImageViewerAnimationController");
        AbstractC19074t.m100208f(c17391z, "video");
        try {
            if (!this.f55177X && !m56676o3().isAnimating()) {
                this.f55177X = true;
                C20275e c20275e = (C20275e) interfaceC30162c;
                AbstractC2379w.m12430d(getCurrentFocus());
                if (!AbstractC23171p0.m119371c() && !AbstractC23136l9.m118654H0(this) && str != null && str.length() != 0) {
                    if (z11) {
                        c3979l = Companion.m56697a(str + "_mask");
                    } else {
                        c3979l = Companion.m56697a(str);
                    }
                    boolean m105878o = c20275e.m105878o();
                    if (c3979l == null && animationTarget != null && !m105878o) {
                        bundle.putInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
                        bundle.putString("video_str", c17391z.m92540e().toString());
                        this.f55174U = c20275e;
                        this.f55175V = bundle;
                        AnimationLayout m56676o3 = m56676o3();
                        m56676o3.type = 1;
                        m56676o3.setClipTopHeight(c20275e.m105871c());
                        m56676o3.setClipBottomHeight(c20275e.m105870b());
                        m56676o3.expand(animationTarget, c3979l);
                        c20275e.m105864J(c3979l);
                        this.f55178Y.sendEmptyMessageDelayed(1, 1000L);
                        return;
                    }
                    C20043e.m104031v(interfaceC27218a, c17391z, 0, bundle);
                    this.f55177X = false;
                }
                c3979l = null;
                boolean m105878o2 = c20275e.m105878o();
                if (c3979l == null) {
                }
                C20043e.m104031v(interfaceC27218a, c17391z, 0, bundle);
                this.f55177X = false;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f55172h0, e11);
            this.f55177X = false;
        }
    }

    @Override // i40.InterfaceC20278h
    /* renamed from: H0 */
    public void mo56684H0(ZaloView zaloView, int i11) {
        AbstractC19074t.m100208f(zaloView, "fragment");
        C20275e c20275e = this.f55174U;
        if (c20275e != null) {
            c20275e.m105866L(i11);
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, p542ub.InterfaceC27218a
    /* renamed from: H2 */
    public void mo35551H2(AnimationTarget animationTarget, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, int i11) {
        AbstractC19074t.m100208f(interfaceC30162c, "iImageViewerAnimationController");
        C23528a c23528a = new C23528a((Activity) this);
        if (!this.f55177X && !m56676o3().isAnimating()) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), null, null, new C10928e(interfaceC30162c, str, bundle, i11, animationTarget, c23528a, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:3:0x0006, B:5:0x000a, B:10:0x0016, B:12:0x0028, B:15:0x0030, B:18:0x0037, B:19:0x0041, B:23:0x004d, B:27:0x0074, B:28:0x008e, B:32:0x0083), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* renamed from: I3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m56685I3(AnimationTarget animationTarget, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, int i11) {
        C3979l c3979l;
        AbstractC19074t.m100208f(interfaceC30162c, "iImageViewerAnimationController");
        try {
            if (!this.f55177X && !m56676o3().isAnimating()) {
                this.f55177X = true;
                C20275e c20275e = (C20275e) interfaceC30162c;
                AbstractC2379w.m12430d(getCurrentFocus());
                if (!AbstractC23171p0.m119371c() && !AbstractC23136l9.m118654H0(this) && str != null && str.length() != 0) {
                    c3979l = Companion.m56697a(str);
                    boolean m105878o = c20275e.m105878o();
                    this.f55175V = bundle;
                    if (c3979l == null && animationTarget != null && !m105878o) {
                        this.f55174U = c20275e;
                        AnimationLayout m56676o3 = m56676o3();
                        m56676o3.type = i11;
                        m56676o3.setClipTopHeight(c20275e.m105871c());
                        m56676o3.setClipBottomHeight(c20275e.m105870b());
                        m56676o3.expand(animationTarget, c3979l);
                        c20275e.m105864J(c3979l);
                        this.f55178Y.sendEmptyMessageDelayed(1, 1000L);
                        return;
                    }
                    if (i11 != 2) {
                        mo35579p().m93069k2(GifViewerZView.class, this.f55175V, 0, true);
                    } else if (i11 == 3) {
                        mo35579p().m93069k2(GroupLiveStreamPlaybackView.class, this.f55175V, 0, true);
                    }
                    this.f55177X = false;
                }
                c3979l = null;
                boolean m105878o2 = c20275e.m105878o();
                this.f55175V = bundle;
                if (c3979l == null) {
                }
                if (i11 != 2) {
                }
                this.f55177X = false;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f55172h0, e11);
            this.f55177X = false;
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, p542ub.InterfaceC27218a
    /* renamed from: K0 */
    public int mo35552K0() {
        return C23212s8.m119601h();
    }

    @Override // com.zing.zalo.activity.ZaloActivity, com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: L0 */
    public String mo35553L0() {
        String m121338Q9 = AbstractC23309i.m121338Q9();
        AbstractC19074t.m100207e(m121338Q9, "getPassCodeStringMD5(...)");
        return m121338Q9;
    }

    /* renamed from: T3 */
    public final void m56686T3() {
        int requestedOrientation = super.getRequestedOrientation();
        if ((m56678y3() && requestedOrientation == 1) || requestedOrientation == 13 || (!m56678y3() && super.getRequestedOrientation() == -1)) {
            setRequestedOrientation(this.f55184e0);
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, p542ub.InterfaceC27218a
    /* renamed from: V */
    public void mo35556V(ImageView imageView, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, int i11) {
        AbstractC19074t.m100208f(interfaceC30162c, "iImageViewerAnimationController");
        mo35551H2(new ViewAnimationTarget(imageView), str, bundle, interfaceC30162c, i11);
    }

    @Override // i40.InterfaceC20278h
    /* renamed from: X0 */
    public void mo56687X0(boolean z11) {
        C20275e c20275e;
        if (z11 && (c20275e = this.f55174U) != null && !c20275e.m105878o()) {
            c20275e.m105877m(m56676o3());
        }
        this.f55174U = null;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        AbstractC19074t.m100208f(context, "newBase");
        Context m120037d = C23269y3.m120037d(context, null, 2, null);
        if (m120037d != null) {
            context = m120037d;
        }
        super.attachBaseContext(context);
        C20358b.m106109a(this);
    }

    @Override // com.zing.zalo.activity.ZaloActivity, com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: b */
    public String mo35561b() {
        String string = getString(AbstractC8020f0.str_hint_setupPssCode);
        AbstractC19074t.m100207e(string, "getString(...)");
        return string;
    }

    @Override // com.zing.zalo.activity.ZaloActivity, com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: b0 */
    public void mo35562b0() {
        AbstractC23165o5.m119335d();
    }

    @Override // com.zing.zalo.activity.ZaloActivity, com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: b1 */
    public void mo35563b1() {
        String mo35550G = mo35550G();
        if (mo35550G.length() > 0) {
            AbstractC23309i.m121137Ku(MainApplication.Companion.m35500c(), mo35550G);
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: d */
    public void mo35566d() {
        ToastUtils.showMess(getString(AbstractC8020f0.str_hint_inputPssCodeIncorrect));
    }

    /* renamed from: d3 */
    protected void mo56688d3() {
        C23212s8.m119597d(this, false, 0, 0, 14, null);
    }

    @Override // android.app.Activity, p542ub.InterfaceC27218a
    public int getRequestedOrientation() {
        int i11;
        this.f55183d0 = super.getRequestedOrientation();
        if (m56678y3() && this.f55183d0 == -1) {
            i11 = 1;
        } else {
            i11 = this.f55183d0;
        }
        this.f55184e0 = i11;
        return i11;
    }

    @Override // i40.InterfaceC20278h
    /* renamed from: i */
    public void mo56689i(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "fragment");
    }

    @Override // i40.InterfaceC20278h
    /* renamed from: i1 */
    public void mo56690i1(ZaloView zaloView, C3979l c3979l) {
        AbstractC19074t.m100208f(zaloView, "fragment");
        C20275e c20275e = this.f55174U;
        if (c20275e != null) {
            c20275e.m105864J(c3979l);
        }
    }

    /* renamed from: i3 */
    public int m56691i3() {
        boolean z11;
        boolean z12;
        if (AbstractC23309i.m121155Lb() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AbstractC23309i.m121192Mb() == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11 || !z12) {
            return 0;
        }
        return 1;
    }

    /* renamed from: k3 */
    protected final int m56692k3(int i11) {
        if (m56678y3() && i11 == 1) {
            return -1;
        }
        if (!m56678y3() && i11 == -1) {
            return 1;
        }
        return i11;
    }

    @Override // com.zing.zalo.activity.ZaloActivity, p542ub.InterfaceC27218a
    /* renamed from: l4 */
    public void mo35573l4(Class cls, Bundle bundle, int i11, boolean z11) {
        if (AbstractC19444a.m101693a()) {
            super.mo35573l4(cls, bundle, i11, z11);
        } else {
            this.f55178Y.post(new Runnable() { // from class: h40.f

                /* renamed from: q */
                public final /* synthetic */ Class f97951q;

                /* renamed from: r */
                public final /* synthetic */ Bundle f97952r;

                /* renamed from: s */
                public final /* synthetic */ int f97953s;

                /* renamed from: t */
                public final /* synthetic */ boolean f97954t;

                public /* synthetic */ RunnableC19795f(Class cls2, Bundle bundle2, int i112, boolean z112) {
                    r2 = cls2;
                    r3 = bundle2;
                    r4 = i112;
                    r5 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseZaloActivity.m56661J3(BaseZaloActivity.this, r2, r3, r4, r5);
                }
            });
            AbstractC20110a.f98889a.mo104552e(new IllegalStateException("showZaloView must be called on the main thread"));
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, p542ub.InterfaceC27219b
    /* renamed from: n1 */
    public Activity mo35575n1() {
        return this;
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onActivityResult:\nrequest");
        sb2.append(i11);
        sb2.append("\nresult:");
        sb2.append(i12);
        super.onActivityResult(i11, i12, intent);
        C23744a.Companion.m124119a().m124116d(134, Integer.valueOf(i11), Integer.valueOf(i12), intent);
    }

    @Override // com.showingphotolib.view.AnimationLayout.OnEventListener
    public void onBeforeExpanding(int i11) {
        if (AnimationLayout.isTypeShowFullscreen(i11) && !mo35576n3()) {
            AbstractC23136l9.m118686X0(getWindow(), true);
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        mo56688d3();
        MainApplication.Companion.m35498a(this);
        mo35554O(32);
        if (bundle == null) {
            str = "new";
        } else {
            str = "restore";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCreate:");
        sb2.append(str);
        boolean z11 = false;
        if (bundle != null) {
            AbstractC23304d.f113334U0 = false;
        }
        this.f55181b0 = AbstractC0924m0.m3164Jb();
        AbstractC23165o5.m119336e(1, this, getClass().getName());
        if (AbstractC23165o5.m119333b()) {
            C17487o0 mo35579p = mo35579p();
            if (AbstractC23304d.f113266D0 && !this.f55181b0) {
                z11 = true;
            }
            mo35579p.m93016L1(z11);
        }
        super.onCreate(bundle);
        this.f55179Z = true;
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onDestroy() {
        try {
            C28685a.m143693b(this).m143697e(this.f55182c0);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        this.f55185f0 = true;
        InterfaceC18494a interfaceC18494a = this.f55186g0;
        if (interfaceC18494a != null) {
            interfaceC18494a.mo12V4();
        }
    }

    @Override // com.showingphotolib.view.AnimationLayout.OnEventListener
    public void onExpanded(int i11) {
        int i12;
        int i13 = 0;
        if (i11 == 0) {
            C20275e c20275e = this.f55174U;
            if (c20275e != null) {
                Bundle bundle = this.f55175V;
                if (bundle != null) {
                    i13 = bundle.getInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 0);
                }
                Class m155121d = AbstractC32146v5.m155121d(i13);
                ZaloView m105876l = c20275e.m105876l();
                if (m105876l == null) {
                    mo35579p().m93066i2(m155121d, this.f55175V, this.f55176W, 0, true);
                    return;
                } else {
                    m105876l.m92693xK().m93066i2(m155121d, this.f55175V, this.f55176W, 0, true);
                    return;
                }
            }
            return;
        }
        if (i11 == 1) {
            Bundle bundle2 = this.f55175V;
            if (bundle2 != null) {
                i12 = bundle2.getInt("EXTRA_INT_REQUEST_CODE");
            } else {
                i12 = 0;
            }
            Bundle bundle3 = this.f55175V;
            if (bundle3 != null && bundle3.getBoolean("EXTRA_BOOL_IS_FEED_VIDEO")) {
                mo35579p().m93066i2(FeedMinimizableVideoPlayerView.class, this.f55175V, i12, 0, true);
                return;
            } else {
                mo35579p().m93066i2(MinimizableVideoPlayerView.class, this.f55175V, i12, 0, true);
                return;
            }
        }
        if (i11 == 2) {
            mo35579p().m93069k2(GifViewerZView.class, this.f55175V, 0, true);
        } else if (i11 == 3) {
            mo35579p().m93069k2(GroupLiveStreamPlaybackView.class, this.f55175V, 0, true);
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4 && this.f55177X && m56676o3().isAnimating()) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f55179Z = false;
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C28685a m143693b = C28685a.m143693b(this);
        BroadcastReceiver broadcastReceiver = this.f55182c0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.zing.zalo.action.ACTION_FONT_CHANGED");
        intentFilter.addAction("com.zing.zalo.action.ACTION_THEME_CHANGED");
        intentFilter.addAction("com.zing.zalo.action.ACTION_DENSITY_CONFIG_CHANGED");
        intentFilter.addAction("com.zing.zalo.ACTION_EXIT");
        C24848g0 c24848g0 = C24848g0.f119245a;
        m143693b.m143695c(broadcastReceiver, intentFilter);
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onRequestPermissionsResult:\nrequest:");
        sb2.append(i11);
        sb2.append("\npermissions:");
        sb2.append(strArr);
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        AbstractC23034c6.m118160j0(this, i11, strArr, iArr);
        C0809c1.m2050b(new C10926c(iArr, strArr));
        C25498b.m132098b(MainApplication.Companion.m35500c());
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onResume() {
        AbstractC23165o5.m119336e(3, this, getClass().getName());
        super.onResume();
        this.f55179Z = true;
    }

    @Override // com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.onSaveInstanceState(bundle);
    }

    @Override // com.showingphotolib.view.AnimationLayout.OnEventListener
    public void onShrunk() {
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStart() {
        boolean z11;
        AbstractC20110a.f98889a.mo104548a("onStart: " + this, new Object[0]);
        Configuration configuration = getResources().getConfiguration();
        AbstractC19074t.m100207e(configuration, "getConfiguration(...)");
        if (!AbstractC19074t.m100204b(C23269y3.m120038e(configuration), AbstractC18458a.f93019a) && !(this instanceof WebViewMPActivity)) {
            recreate();
        }
        AbstractC23165o5.m119336e(2, this, getClass().getName());
        if (AbstractC23165o5.m119333b()) {
            C17487o0 mo35579p = mo35579p();
            if (AbstractC23304d.f113266D0 && !this.f55181b0) {
                z11 = true;
            } else {
                z11 = false;
            }
            mo35579p.m93016L1(z11);
        }
        if (this.f55181b0) {
            AbstractC0924m0.m2943Bm(false);
            this.f55181b0 = false;
        }
        if (AbstractC23304d.f113375d2 && !(this instanceof WebViewMPActivity)) {
            AbstractC23304d.f113375d2 = false;
            C28685a m143693b = C28685a.m143693b(MainApplication.Companion.m35500c());
            AbstractC19074t.m100207e(m143693b, "getInstance(...)");
            m143693b.m143696d(new Intent("com.zing.zalo.action.ACTION_THEME_CHANGED"));
            mo56688d3();
        }
        super.onStart();
        AbstractC23174p3.m119383h(2, this, this.f55180a0);
    }

    @Override // com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStop() {
        AbstractC20110a.f98889a.mo104548a("onStop: " + this, new Object[0]);
        AbstractC2379w.m12430d(getCurrentFocus());
        super.onStop();
        AbstractC23174p3.m119383h(5, this, this.f55180a0);
        AbstractC23165o5.m119336e(5, this, getClass().getName());
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: h40.d
            @Override // java.lang.Runnable
            public final void run() {
                BaseZaloActivity.m56660A3();
            }
        });
        this.f55185f0 = false;
    }

    @Override // com.zing.zalo.activity.ZaloActivity, com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: p0 */
    public void mo35580p0(PassCodeView.InterfaceC17495f interfaceC17495f) {
        try {
            if (m56691i3() == 0 || !AbstractC2345f.m12313b(MainApplication.Companion.m35500c())) {
                return;
            }
            BiometricWrapper biometricWrapper = new BiometricWrapper(getContext(), AbstractC1388a.m6967i(getContext()), new C10927d(interfaceC17495f));
            biometricWrapper.m37275d(getLifecycle());
            BiometricWrapper.C7312d m37291a = new BiometricWrapper.C7312d.a().m37297g(AbstractC23136l9.m118743r0(AbstractC8020f0.str_biometric)).m37294d("").m37296f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel)).m37293c(false).m37298h(true).m37291a();
            AbstractC19074t.m100207e(m37291a, "build(...)");
            biometricWrapper.m37273a(m37291a, null, false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, p542ub.InterfaceC27218a
    /* renamed from: q */
    public void mo35581q(Class cls, Bundle bundle, int i11, int i12, boolean z11) {
        if (AbstractC19444a.m101693a()) {
            super.mo35581q(cls, bundle, i11, i12, z11);
        } else {
            this.f55178Y.post(new Runnable() { // from class: h40.e

                /* renamed from: q */
                public final /* synthetic */ Class f97943q;

                /* renamed from: r */
                public final /* synthetic */ Bundle f97944r;

                /* renamed from: s */
                public final /* synthetic */ int f97945s;

                /* renamed from: t */
                public final /* synthetic */ int f97946t;

                /* renamed from: u */
                public final /* synthetic */ boolean f97947u;

                public /* synthetic */ RunnableC19791e(Class cls2, Bundle bundle2, int i112, int i122, boolean z112) {
                    r2 = cls2;
                    r3 = bundle2;
                    r4 = i112;
                    r5 = i122;
                    r6 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseZaloActivity.m56668R3(BaseZaloActivity.this, r2, r3, r4, r5, r6);
                }
            });
            AbstractC20110a.f98889a.mo104552e(new IllegalStateException("showZaloView must be called on the main thread"));
        }
    }

    /* renamed from: r3 */
    protected final Handler m56693r3() {
        return this.f55178Y;
    }

    @Override // com.zing.zalo.activity.ZaloActivity, com.zing.zalo.zview.C17487o0.l
    /* renamed from: r5 */
    public void mo35582r5(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        if (m56676o3().isAnimating()) {
            m56676o3().cancelAnim();
        }
    }

    @Override // com.zing.zalo.activity.ZaloActivity, com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: s */
    public String mo35583s() {
        String string = getString(AbstractC8020f0.str_titlePssCodeAct);
        AbstractC19074t.m100207e(string, "getString(...)");
        return string;
    }

    @Override // android.app.Activity, p542ub.InterfaceC27218a
    public void setRequestedOrientation(int i11) {
        this.f55184e0 = i11;
        int m56692k3 = m56692k3(i11);
        this.f55183d0 = m56692k3;
        super.setRequestedOrientation(m56692k3);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC19074t.m100208f(intent, "intent");
        m56675f3(intent);
        super.startActivity(intent, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i11, Bundle bundle) {
        AbstractC19074t.m100208f(intent, "intent");
        m56675f3(intent);
        super.startActivityForResult(intent, i11, bundle);
    }

    @Override // i40.InterfaceC20278h
    /* renamed from: u */
    public C20275e mo56694u() {
        return this.f55174U;
    }

    /* renamed from: v3 */
    public final boolean m56695v3() {
        return this.f55179Z;
    }

    /* renamed from: x3 */
    public final boolean m56696x3() {
        return this.f55185f0;
    }
}
