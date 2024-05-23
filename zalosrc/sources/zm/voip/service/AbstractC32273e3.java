package zm.voip.service;

import ae.C0766k;
import ag0.AbstractC0837p0;
import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import au.C2343e;
import bp0.AbstractC3079a;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3103o;
import bp0.AbstractC3104p;
import bp0.AbstractC3108t;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.plugin.IVoipServiceRequestCallback;
import com.zing.zalo.plugin.IVoipZalo;
import com.zing.zalo.service.ZaloBackgroundService;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import gg0.AbstractC19444a;
import gp0.C19561o0;
import gp0.C19577z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.StateFlow;
import lo0.C22592c;
import lo0.C22602h;
import lo0.C22604i;
import lo0.C22621q0;
import lo0.C22625s0;
import lo0.C22626t;
import lo0.C22628v;
import lo0.InterfaceC22594d;
import me0.AbstractC23028c0;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import nh0.C23793c;
import org.json.JSONObject;
import org.webrtc.Constants;
import org.webrtc.EglBase;
import p097db.AbstractC17849h;
import p097db.C17843b;
import p097db.C17846e;
import p097db.EnumC17855n;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p394oj.C24277c;
import p445qe.C25244a;
import qo0.C25447g;
import ro0.AbstractRunnableC25943g;
import ro0.C25941e;
import ro0.C25942f;
import ro0.C25948l;

/* renamed from: zm.voip.service.e3 */
/* loaded from: classes7.dex */
public abstract class AbstractC32273e3 implements InterfaceC22594d {

    /* renamed from: y */
    static IVoipZalo f148885y = null;

    /* renamed from: z */
    public static boolean f148886z = false;

    /* renamed from: a */
    String f148887a;

    /* renamed from: i */
    ContactProfile f148895i;

    /* renamed from: j */
    Set f148896j;

    /* renamed from: k */
    Handler f148897k;

    /* renamed from: q */
    private CameraManager.AvailabilityCallback f148903q;

    /* renamed from: r */
    private CameraManager f148904r;

    /* renamed from: s */
    private Runnable f148905s;

    /* renamed from: b */
    C25941e f148888b = new C25941e(50);

    /* renamed from: c */
    C25941e f148889c = new C25941e(50);

    /* renamed from: d */
    C25941e f148890d = new C25941e(50);

    /* renamed from: e */
    protected volatile boolean f148891e = false;

    /* renamed from: f */
    private boolean f148892f = false;

    /* renamed from: g */
    protected volatile boolean f148893g = false;

    /* renamed from: h */
    private final HashSet f148894h = new HashSet();

    /* renamed from: l */
    boolean f148898l = false;

    /* renamed from: m */
    int f148899m = 0;

    /* renamed from: n */
    EglBase f148900n = null;

    /* renamed from: o */
    public int f148901o = 0;

    /* renamed from: p */
    public int f148902p = 45000;

    /* renamed from: t */
    protected boolean f148906t = false;

    /* renamed from: u */
    protected boolean f148907u = false;

    /* renamed from: v */
    public boolean f148908v = false;

    /* renamed from: w */
    public int f148909w = 20000;

    /* renamed from: x */
    public int f148910x = 35000;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.e3$a */
    /* loaded from: classes7.dex */
    public class a extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ boolean f148911p;

        /* renamed from: q */
        final /* synthetic */ int f148912q;

        a(boolean z11, int i11) {
            this.f148911p = z11;
            this.f148912q = i11;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            AbstractC3082b0.m15424f("DeviceHandler", "stopCamera: off: " + this.f148911p + " reason: " + this.f148912q);
            AbstractC17849h.m94304m(this.f148911p, this.f148912q);
            AbstractC3082b0.m15424f("DeviceHandler", "stopCamera: done");
        }
    }

    /* renamed from: zm.voip.service.e3$b */
    /* loaded from: classes7.dex */
    public class b extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ Map f148914p;

        /* renamed from: q */
        final /* synthetic */ Handler f148915q;

        /* renamed from: r */
        final /* synthetic */ long f148916r;

        b(Map map, Handler handler, long j11) {
            this.f148914p = map;
            this.f148915q = handler;
            this.f148916r = j11;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            long currentTimeMillis;
            boolean z11;
            int intValue = ((Integer) this.f148914p.get("typeCall")).intValue();
            if (AbstractC32273e3.this.f148891e) {
                if (AbstractC32273e3.this.f148894h.contains(Integer.valueOf(intValue))) {
                    AbstractC3082b0.m15421c(AbstractC32273e3.this.f148887a, intValue + " already init return");
                    return;
                }
                if (intValue == 1 || intValue == 5 || intValue == 6) {
                    AbstractC32273e3.this.f148894h.add(Integer.valueOf(intValue));
                }
                AbstractC32273e3.m155776w(this.f148914p, intValue, this.f148915q);
                return;
            }
            if (intValue == 1 || intValue == 5 || intValue == 6) {
                AbstractC32273e3.this.f148894h.add(Integer.valueOf(intValue));
            }
            if (intValue != 1 && intValue != 2 && intValue != 6 && intValue != 7) {
                currentTimeMillis = 0;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            if (!AbstractC32273e3.this.m155777z2()) {
                try {
                    if (this.f148914p.containsKey("SubmitLogWhenFail") && ((Boolean) this.f148914p.get("SubmitLogWhenFail")).booleanValue()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (Boolean.valueOf(z11).booleanValue()) {
                        if (AbstractC32273e3.f148886z) {
                            C22592c c22592c = new C22592c();
                            if (intValue == 6) {
                                c22592c.m116875Y((int) (System.currentTimeMillis() & 2147483647L));
                                c22592c.m116910q0(Integer.parseInt(CoreUtility.f89233i));
                            } else {
                                c22592c.m116875Y(((Integer) this.f148914p.get("zaloCallId")).intValue());
                                c22592c.m116910q0(((Integer) this.f148914p.get("hostId")).intValue());
                            }
                            C19577z.m102341J().m102411c1(Integer.parseInt(CoreUtility.f89233i));
                            c22592c.m116916t0(161);
                            AbstractC32273e3.this.mo155858X1(new C22621q0(c22592c));
                            return;
                        }
                        C22626t m102196D0 = C19561o0.m102161L().m102196D0();
                        if (intValue == 1) {
                            m102196D0.m117095c1(true);
                            m102196D0.m117140n2(AbstractC32273e3.this.m155814J());
                            m102196D0.m117060R1(((Integer) this.f148914p.get("calleeZaloId")).intValue());
                        } else {
                            m102196D0.m117095c1(false);
                            m102196D0.m117140n2(((Integer) this.f148914p.get("zaloCallId")).intValue());
                            m102196D0.m117060R1(((Integer) this.f148914p.get("peerZaloId")).intValue());
                        }
                        m102196D0.m117180z1(196);
                        AbstractC32273e3.this.mo155858X1(new C22621q0(m102196D0));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (intValue == 1 || intValue == 2 || intValue == 6 || intValue == 7) {
                C19561o0.m102161L().m102250e1(System.currentTimeMillis() - currentTimeMillis);
            }
            C17843b.m94137o().m94162Y(AbstractC3096i0.m15574y());
            C17843b m94137o = C17843b.m94137o();
            EnumC17855n enumC17855n = EnumC17855n.ZRTC_LOG_NONE;
            m94137o.m94175f0(enumC17855n.ordinal());
            C17843b.m94137o().m94154Q(C32257b4.m155726m());
            C17846e.m94223f().m94254y(AbstractC3096i0.m15574y());
            C17846e.m94223f().m94225B(enumC17855n.ordinal());
            C17846e.m94223f().m94250u(C32328p3.m156358e());
            AbstractC32273e3.this.f148891e = true;
            Handler handler = this.f148915q;
            if (handler != null) {
                AbstractC32273e3.m155776w(this.f148914p, intValue, handler);
                AbstractC3082b0.m15424f(AbstractC32273e3.this.f148887a, "initVoipController type = " + intValue + " ; timeInit = " + (System.currentTimeMillis() - this.f148916r));
            }
        }
    }

    /* renamed from: zm.voip.service.e3$c */
    /* loaded from: classes7.dex */
    public class c implements IVoipServiceRequestCallback {
        c() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            try {
                AbstractC32273e3.this.f148897k.sendMessage(AbstractC32273e3.this.f148897k.obtainMessage(1005, str));
            } catch (Exception unused) {
            }
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.e3$d */
    /* loaded from: classes7.dex */
    public class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ IVoipServiceRequestCallback f148919a;

        d(IVoipServiceRequestCallback iVoipServiceRequestCallback) {
            this.f148919a = iVoipServiceRequestCallback;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (this.f148919a != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
                if (c20096c != null) {
                    int m104491c = c20096c.m104491c();
                    if (m104491c == 102) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_error_login);
                    } else if (m104491c == 515) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG);
                    } else if (m104491c == 2027) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.TOO_MANY_REQUEST_MSG);
                    }
                }
                this.f148919a.onRequestFailed(m118743r0);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            IVoipServiceRequestCallback iVoipServiceRequestCallback = this.f148919a;
            if (iVoipServiceRequestCallback != null) {
                iVoipServiceRequestCallback.onRequestComplete("Finish");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.e3$e */
    /* loaded from: classes7.dex */
    public class e extends AbstractRunnableC25943g {
        e() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            AbstractC17849h.m94306o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.e3$f */
    /* loaded from: classes7.dex */
    public class f extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ boolean f148922p;

        f(boolean z11) {
            this.f148922p = z11;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94140C(this.f148922p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.e3$g */
    /* loaded from: classes7.dex */
    public class g extends CameraManager.AvailabilityCallback {
        g() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            if (C32257b4.m155726m().m155737l().m117047N0() && AbstractC32273e3.this.f148907u) {
                if (AbstractC3096i0.f13167k == 3 || AbstractC32273e3.this.f148908v) {
                    AbstractC32273e3 abstractC32273e3 = AbstractC32273e3.this;
                    abstractC32273e3.f148897k.removeCallbacks(abstractC32273e3.f148905s);
                    AbstractC32273e3 abstractC32273e32 = AbstractC32273e3.this;
                    abstractC32273e32.f148897k.postDelayed(abstractC32273e32.f148905s, 700L);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            AbstractC32273e3 abstractC32273e3 = AbstractC32273e3.this;
            abstractC32273e3.f148897k.removeCallbacks(abstractC32273e3.f148905s);
            AbstractC32273e3 abstractC32273e32 = AbstractC32273e3.this;
            abstractC32273e32.f148906t = true;
            abstractC32273e32.f148907u = true;
        }
    }

    /* renamed from: zm.voip.service.e3$h */
    /* loaded from: classes7.dex */
    public static class h {

        /* renamed from: a */
        public static final C32296j1 f148925a = new C32296j1();
    }

    /* renamed from: zm.voip.service.e3$i */
    /* loaded from: classes7.dex */
    public static class i {

        /* renamed from: a */
        public static final C32308l3 f148926a = new C32308l3();
    }

    public AbstractC32273e3(String str) {
        this.f148887a = str;
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.x2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC32273e3.m155757X0();
            }
        });
        AbstractC3104p.m15693v0(AbstractC3096i0.m15574y());
        AbstractC3082b0.m15428j(1);
        if (AbstractC23304d.f113368c0 != null) {
            try {
                this.f148895i = new ContactProfile(AbstractC23304d.f113368c0);
            } catch (Exception e11) {
                AbstractC3082b0.m15423e(this.f148887a, "Init VoipController failed", e11);
            }
        }
        mo155779A0();
        this.f148904r = (CameraManager) AbstractC3096i0.m15574y().getSystemService("camera");
    }

    /* renamed from: J1 */
    public void m155747J1() {
        try {
            if (this.f148906t && AbstractC23304d.f113319Q1) {
                this.f148906t = false;
                AbstractC17849h.m94301j();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Q */
    public static AbstractC32273e3 m155748Q() {
        return m155750R(f148886z);
    }

    /* renamed from: Q0 */
    public static /* synthetic */ void m155749Q0(int i11, String str, String str2, boolean z11, int i12, String str3) {
        h.f148925a.mo155873d1(i11, str, str2, z11, i12, str3);
    }

    /* renamed from: R */
    public static AbstractC32273e3 m155750R(boolean z11) {
        if (z11) {
            return i.f148926a;
        }
        return h.f148925a;
    }

    /* renamed from: R0 */
    public static /* synthetic */ void m155751R0(String str, int i11) {
        m155748Q().mo155850T2(str, i11, false);
    }

    /* renamed from: S0 */
    public static /* synthetic */ void m155752S0(int i11, int i12, int i13, String str, String str2, String str3, List list) {
        m155748Q().mo155870c1(i11, i12, i13, str, str2, str3, list);
    }

    /* renamed from: T0 */
    public static /* synthetic */ void m155753T0(int i11, int i12, List list, int i13, String str, int i14, String str2) {
        m155748Q().mo155834O0(i11, i12, list, i13, str, i14, str2);
    }

    /* renamed from: U0 */
    public /* synthetic */ void m155754U0(String str) {
        try {
            AbstractC3079a.m15406a(this.f148887a, "getZaloProfileById: userId = " + str);
            f148885y.getProfile(new c(), str);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e(this.f148887a, "getZaloProfileById error Exception", e11);
        }
    }

    /* renamed from: V0 */
    public static /* synthetic */ void m155755V0() {
        C19561o0.m102161L().m102193C0();
    }

    /* renamed from: W0 */
    public /* synthetic */ void m155756W0() {
        HandlerC32324p.m156351d(new RunnableC32372y2(this));
    }

    /* renamed from: X0 */
    public static /* synthetic */ void m155757X0() {
        AbstractC23304d.m120531b();
        C25244a.f121072a.m130657y();
    }

    /* renamed from: Y */
    public static int m155758Y() {
        return AbstractC23309i.m122130le();
    }

    /* renamed from: Y0 */
    public /* synthetic */ void m155759Y0() {
        HandlerC32324p.m156351d(new RunnableC32372y2(this));
    }

    /* renamed from: h2 */
    public static void m155764h2(IVoipZalo iVoipZalo) {
        f148885y = iVoipZalo;
        if (iVoipZalo != null && AbstractC3082b0.m15426h()) {
            AbstractC3096i0.m15560r(AbstractC3096i0.m15574y());
        }
    }

    /* renamed from: j0 */
    private void m155767j0(boolean z11) {
        this.f148897k.removeMessages(1007);
        this.f148897k.sendMessage(this.f148897k.obtainMessage(1007, Boolean.valueOf(z11)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: zm.voip.service.d3.<init>(int, int, java.util.List, int, java.lang.String, int, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: w */
    public static void m155776w(java.util.Map r16, int r17, android.os.Handler r18) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.voip.service.AbstractC32273e3.m155776w(java.util.Map, int, android.os.Handler):void");
    }

    /* renamed from: z2 */
    public boolean m155777z2() {
        if (this.f148892f) {
            return true;
        }
        try {
            NativeLoader.m89238q(CoreUtility.getAppContext(), EnumC16739a.f84876S);
            this.f148892f = true;
            return true;
        } catch (UnsatisfiedLinkError e11) {
            AbstractC3082b0.m15423e(this.f148887a, "We have a problem with the current stack.... NOT YET Implemented" + e11.getMessage(), e11);
            this.f148892f = false;
            AbstractC3096i0.m15518U0(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.call_load_lib_error));
            return false;
        } catch (Throwable th2) {
            AbstractC3082b0.m15423e(this.f148887a, "We have a problem with the current stack....", th2);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public boolean m155778A(int i11, int i12, int i13, long j11) {
        String format = String.format("%d_%d_%d_%d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Long.valueOf(j11));
        Integer num = (Integer) this.f148889c.get(format);
        if (num != null && num.intValue() == 1) {
            AbstractC3082b0.m15421c(this.f148887a, "Message " + i11 + " is dup");
            return true;
        }
        this.f148889c.put(format, 1);
        return false;
    }

    /* renamed from: A0 */
    abstract void mo155779A0();

    /* renamed from: A1 */
    public void mo155780A1(String str, C24277c c24277c, ContactProfile contactProfile) {
    }

    /* renamed from: A2 */
    public abstract void mo155781A2(String str, int i11);

    /* renamed from: B */
    public boolean m155782B(int i11, long j11) {
        if (i11 > 0) {
            long mo124311f = C23793c.m124316k().mo124311f() - j11;
            if (mo124311f > i11) {
                AbstractC3082b0.m15424f(this.f148887a, "Message is expired timeMsg = " + mo124311f + " > " + i11);
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: B0 */
    public boolean mo155783B0() {
        return false;
    }

    /* renamed from: B1 */
    public void m155784B1() {
        try {
            AbstractC3082b0.m15424f(this.f148887a, "unregisterListenCameraState");
            if (this.f148897k != null && AbstractC23304d.f113319Q1) {
                if (this.f148905s == null) {
                    this.f148905s = new Runnable() { // from class: zm.voip.service.u2
                        public /* synthetic */ RunnableC32352u2() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC32273e3.this.m155759Y0();
                        }
                    };
                }
                if (AbstractC3103o.m15619h(21) && this.f148903q == null) {
                    g gVar = new g();
                    this.f148903q = gVar;
                    this.f148904r.registerAvailabilityCallback(gVar, this.f148897k);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B2 */
    public abstract void mo155785B2(String str, int i11);

    /* renamed from: C */
    public boolean mo155786C(int i11) {
        return false;
    }

    /* renamed from: C0 */
    public boolean m155787C0(int i11) {
        return this.f148896j.contains(Integer.valueOf(i11));
    }

    /* renamed from: C1 */
    public void mo155788C1() {
    }

    /* renamed from: C2 */
    public void mo155789C2() {
    }

    /* renamed from: D */
    public boolean mo155790D(int i11) {
        return false;
    }

    /* renamed from: D0 */
    public boolean mo155791D0() {
        return mo155795E0(true);
    }

    /* renamed from: D1 */
    public void mo155792D1() {
    }

    /* renamed from: D2 */
    public void m155793D2() {
        Runnable runnable;
        try {
            AbstractC3082b0.m15424f(this.f148887a, "unregisterListenCameraState");
            Handler handler = this.f148897k;
            if (handler != null && (runnable = this.f148905s) != null && this.f148903q != null && AbstractC23304d.f113319Q1) {
                handler.removeCallbacks(runnable);
                this.f148904r.unregisterAvailabilityCallback(this.f148903q);
                this.f148907u = false;
                this.f148905s = null;
                this.f148903q = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E */
    public boolean mo155794E(int i11) {
        return false;
    }

    /* renamed from: E0 */
    public boolean mo155795E0(boolean z11) {
        if ((z11 && AbstractC3096i0.m15505O()) || AbstractC3096i0.f13163g) {
            return true;
        }
        if (AbstractC3096i0.m15513S() && AbstractC17849h.m94293b()) {
            return true;
        }
        return false;
    }

    /* renamed from: E1 */
    public synchronized void mo155796E1() {
    }

    /* renamed from: E2 */
    public void mo155797E2() {
    }

    /* renamed from: F */
    public boolean mo155798F(int i11) {
        return false;
    }

    /* renamed from: F0 */
    public boolean mo155799F0() {
        if (AbstractC3096i0.m15505O() || AbstractC3096i0.f13163g) {
            return true;
        }
        if (AbstractC3096i0.m15513S() && AbstractC17849h.m94293b()) {
            return true;
        }
        return false;
    }

    /* renamed from: F1 */
    public void m155800F1() {
        EglBase eglBase = this.f148900n;
        if (eglBase != null) {
            eglBase.release();
        }
        this.f148900n = null;
    }

    /* renamed from: F2 */
    public void mo155801F2(C22626t c22626t) {
    }

    /* renamed from: G */
    public void mo155802G() {
    }

    /* renamed from: G0 */
    public boolean m155803G0() {
        if (AbstractC3096i0.m15505O()) {
            return true;
        }
        return AbstractC3096i0.f13160d;
    }

    /* renamed from: G1 */
    public void mo155804G1() {
    }

    /* renamed from: G2 */
    public void m155805G2() {
        C23744a.m124114c().m124116d(10015, new Object[0]);
    }

    /* renamed from: H */
    public void mo155806H(Context context) {
    }

    /* renamed from: H0 */
    public boolean m155807H0() {
        if (!mo155791D0()) {
            return false;
        }
        if (f148886z) {
            return true;
        }
        return C19561o0.m102161L().m102267n0();
    }

    /* renamed from: H1 */
    public abstract void mo155808H1();

    /* renamed from: H2 */
    public void mo155809H2(int i11, String str, int i12) {
    }

    /* renamed from: I */
    public void mo155810I() {
    }

    /* renamed from: I0 */
    public boolean m155811I0() {
        if (!C19561o0.m102161L().m102255h0() && !C19577z.m102341J().m102442t0()) {
            return false;
        }
        return true;
    }

    /* renamed from: I1 */
    public void m155812I1() {
        try {
            if (!mo155791D0()) {
                return;
            }
            AbstractC17849h.m94300i();
        } catch (Exception unused) {
        }
    }

    /* renamed from: I2 */
    public void mo155813I2(int i11, int i12, int i13) {
    }

    /* renamed from: J */
    public int m155814J() {
        return (int) (System.currentTimeMillis() & 2147483647L);
    }

    /* renamed from: J0 */
    public boolean m155815J0() {
        return this.f148898l;
    }

    /* renamed from: J2 */
    public void mo155816J2(int i11, boolean z11, boolean z12) {
    }

    /* renamed from: K */
    public int mo155817K() {
        return -1;
    }

    /* renamed from: K0 */
    public boolean m155818K0() {
        return false;
    }

    /* renamed from: K1 */
    public int mo155819K1() {
        return 0;
    }

    /* renamed from: K2 */
    public void mo155820K2(int i11, int i12, int i13, int i14, String str) {
    }

    /* renamed from: L */
    public int m155821L() {
        return CoreUtility.f89236l;
    }

    /* renamed from: L0 */
    public boolean mo155822L0() {
        return false;
    }

    /* renamed from: L1 */
    public void mo155823L1(int i11) {
    }

    /* renamed from: L2 */
    public void mo155824L2(int i11, int i12, String str, String str2, String str3) {
    }

    /* renamed from: M */
    public int m155825M(String str) {
        try {
            return C2343e.m12307a(str, false);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e(this.f148887a, "getColorValueForBackgroundAvatar error Exception", e11);
            return -1;
        }
    }

    /* renamed from: M0 */
    public boolean mo155826M0() {
        return false;
    }

    /* renamed from: M1 */
    public void m155827M1(Runnable runnable) {
        AbstractC19444a.m101695c(runnable);
    }

    /* renamed from: M2 */
    public void mo155828M2(int i11, int i12, int i13, int i14, String str, String str2, String str3, int i15) {
    }

    /* renamed from: N */
    public synchronized EglBase m155829N() {
        try {
            if (this.f148900n == null) {
                AbstractC3082b0.m15421c(this.f148887a, "Create a new egl");
                this.f148900n = EglBase.create();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f148900n;
    }

    /* renamed from: N0 */
    public synchronized boolean m155830N0() {
        return this.f148891e;
    }

    /* renamed from: N1 */
    public void mo155831N1(int i11, int i12, int i13, String str) {
    }

    /* renamed from: N2 */
    public void mo155832N2(int i11) {
    }

    /* renamed from: O */
    public int mo155833O() {
        return 0;
    }

    /* renamed from: O0 */
    public void mo155834O0(int i11, int i12, List list, int i13, String str, int i14, String str2) {
        if (!f148886z) {
            f148886z = true;
            m155748Q().mo155834O0(i11, i12, list, i13, str, i14, str2);
        }
    }

    /* renamed from: O1 */
    public void mo155835O1(int i11, int i12, int i13, String str) {
    }

    /* renamed from: O2 */
    public void mo155836O2(int i11, int i12, int i13, String str, String str2, String str3, String str4) {
    }

    /* renamed from: P */
    public abstract StateFlow mo155837P();

    /* renamed from: P0 */
    public void mo155838P0(boolean z11) {
    }

    /* renamed from: P1 */
    public void mo155839P1(String str) {
    }

    /* renamed from: P2 */
    public void mo155840P2(int i11, int i12, int i13, String str, String str2, String str3, String str4, String str5, int i14) {
    }

    /* renamed from: Q1 */
    public void mo155841Q1(int i11, int i12, int i13, int i14, String str) {
        if (!mo155791D0()) {
            f148886z = true;
            m155748Q().mo155841Q1(i11, i12, i13, i14, str);
        }
    }

    /* renamed from: Q2 */
    public void mo155842Q2(int i11, int i12, String str, String str2, String str3, String str4, String str5, boolean z11, int i13) {
    }

    /* renamed from: R1 */
    public void mo155843R1(long j11, String str, int i11, String str2, int i12, int i13) {
    }

    /* renamed from: R2 */
    public void mo155844R2(int i11, long j11, int i12, long j12, int i13, String str) {
    }

    /* renamed from: S */
    public abstract ArrayList mo155845S();

    /* renamed from: S1 */
    public C17945a0 m155846S1(long j11, File file) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(j11));
        return AbstractC23112j7.m118520b0(arrayList, file.getPath(), false, null, 0, 26, "chat_send");
    }

    /* renamed from: S2 */
    public void mo155847S2(String str, int i11, int i12, int i13, long j11, String str2) {
    }

    /* renamed from: T */
    public long mo155848T() {
        return 0L;
    }

    /* renamed from: T1 */
    public void m155849T1(int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, String str, IVoipServiceRequestCallback iVoipServiceRequestCallback, int i17) {
        String str2;
        int length;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new d(iVoipServiceRequestCallback));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        try {
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            if (str2.length() == 0) {
                length = 0;
            } else {
                length = bytes.length;
            }
            StringBuilder sb2 = new StringBuilder();
            if (iArr != null) {
                for (int i18 : iArr) {
                    sb2.append(i18);
                    sb2.append(";");
                }
            }
            AbstractC3079a.m15406a(this.f148887a, "voiceFeedbackRating: receiverID = " + i11 + ", status = " + i12 + ", duration = " + i13 + ", callId = " + i14 + ", rating = " + i15 + ", feedbackCount = " + i16 + ", feedbacks = " + ((Object) sb2) + ", customFeedbackSize = " + length + ", customFeedbackContent = " + str2 + ", versionId = " + i17);
            c0766k.mo1603b6(iVoipServiceRequestCallback, i11, (byte) i12, i13, i14, (byte) i15, (byte) i16, iArr, (short) length, bytes, i17);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e(this.f148887a, "voiceFeedbackRating error Exception", e11);
        }
    }

    /* renamed from: T2 */
    public void mo155850T2(String str, int i11, boolean z11) {
    }

    /* renamed from: U */
    public Service m155851U() {
        return ZaloBackgroundService.f49570u;
    }

    /* renamed from: U1 */
    public void mo155852U1(int i11, int i12, int i13, int i14, int i15, HashSet hashSet, String str, IVoipServiceRequestCallback iVoipServiceRequestCallback, int i16) {
    }

    /* renamed from: V */
    public String m155853V(String str) {
        try {
            return AbstractC23028c0.m118087g(str);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e(this.f148887a, "getShortDpnForShowAvatarDefault error Exception", e11);
            return "";
        }
    }

    /* renamed from: V1 */
    public void mo155854V1() {
    }

    /* renamed from: W */
    public abstract C25948l mo155855W();

    /* renamed from: W1 */
    public abstract void mo155856W1(int i11, int i12, int i13);

    /* renamed from: X */
    public abstract void mo155857X();

    /* renamed from: X1 */
    public abstract void mo155858X1(C22621q0 c22621q0);

    /* renamed from: Y1 */
    public void mo155859Y1(int i11, int i12, String str) {
    }

    /* renamed from: Z */
    public abstract int mo155860Z();

    /* renamed from: Z0 */
    public synchronized boolean mo155861Z0(C22626t c22626t, boolean z11, int i11) {
        return false;
    }

    /* renamed from: Z1 */
    public void mo155862Z1(int i11, int i12, int i13, String str) {
    }

    /* renamed from: a0 */
    public void m155863a0(String str) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.z2

            /* renamed from: q */
            public final /* synthetic */ String f149336q;

            public /* synthetic */ RunnableC32377z2(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC32273e3.this.m155754U0(r2);
            }
        });
    }

    /* renamed from: a1 */
    public void mo155864a1() {
    }

    /* renamed from: a2 */
    public void mo155865a2(int i11, int i12, String str) {
    }

    /* renamed from: b0 */
    public void mo155866b0(int i11, String str, int i12, int i13, int i14, String str2, String str3) {
    }

    /* renamed from: b1 */
    public void mo155867b1(int i11) {
    }

    /* renamed from: b2 */
    public void mo155868b2(long j11) {
    }

    /* renamed from: c0 */
    public void mo155869c0(int i11) {
    }

    /* renamed from: c1 */
    public void mo155870c1(int i11, int i12, int i13, String str, String str2, String str3, List list) {
        if (!f148886z && !mo155791D0()) {
            f148886z = true;
            m155748Q().mo155870c1(i11, i12, i13, str, str2, str3, list);
        }
    }

    /* renamed from: c2 */
    public void m155871c2(int i11) {
        this.f148899m = i11;
    }

    /* renamed from: d0 */
    public void mo155872d0(int i11, int i12, int i13, String str, String str2) {
    }

    /* renamed from: d1 */
    public void mo155873d1(int i11, String str, String str2, boolean z11, int i12, String str3) {
        if (f148886z && !mo155791D0()) {
            f148886z = false;
            m155748Q().mo155873d1(i11, str, str2, z11, i12, str3);
        }
    }

    /* renamed from: d2 */
    public void mo155874d2(boolean z11) {
    }

    /* renamed from: e0 */
    public void mo155875e0(int i11, int i12, int i13, int i14, int i15, String str) {
    }

    /* renamed from: e1 */
    public void m155876e1(boolean z11) {
        if (mo155791D0()) {
            HandlerC32324p.m156351d(new f(z11));
        }
    }

    /* renamed from: e2 */
    public abstract void mo155877e2(boolean z11);

    /* renamed from: f0 */
    public void mo155878f0(int i11, String str, int i12, int i13, String str2, String str3, int i14) {
    }

    /* renamed from: f1 */
    public void m155879f1(C25942f c25942f, C25942f c25942f2, int i11) {
        C23744a.m124114c().m124116d(40013, c25942f, c25942f2, Integer.valueOf(i11));
    }

    /* renamed from: f2 */
    public void mo155880f2(Object obj, boolean z11) {
    }

    /* renamed from: g0 */
    public void mo155881g0(int i11, int i12, int i13, int i14, String str) {
    }

    /* renamed from: g1 */
    public void m155882g1() {
        C23744a.m124114c().m124116d(1001, new Object[0]);
    }

    /* renamed from: g2 */
    public void mo155883g2(Object obj, boolean z11, int i11) {
    }

    /* renamed from: h0 */
    public int m155884h0(Context context, Intent intent, int i11) {
        String action = intent.getAction();
        C22621q0 c22621q0 = new C22621q0();
        AbstractC3082b0.m15421c(this.f148887a, "deviceStateReceiver " + action);
        if (Constants.ACTION_CAMERA_OPENING.equalsIgnoreCase(action)) {
            return 7;
        }
        if (Constants.ACTION_CAMERA_FREEZE.equalsIgnoreCase(action)) {
            AbstractC3082b0.m15424f(this.f148887a, "Camera freeze");
            if (!c22621q0.m117000w()) {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.v2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC32273e3.m155755V0();
                    }
                });
            }
            if (!c22621q0.m116999v() || !c22621q0.m116975A() || c22621q0.m116996s()) {
                return 4;
            }
            m155895l1(1, AbstractC8020f0.call_popup_camera_disable);
            mo155781A2("camFreeze", 4);
            return 4;
        }
        if (Constants.ACTION_CAMERA_CLOSE.equalsIgnoreCase(action)) {
            return 5;
        }
        if ("android.intent.action.SCREEN_OFF".equalsIgnoreCase(action)) {
            AbstractC3082b0.m15421c(this.f148887a, "Receive action " + action);
            m155894l0();
            C32252b.f148832d = true;
            if (c22621q0.m116999v() && c22621q0.m116975A() && AbstractC3096i0.m15538g()) {
                m155767j0(C32252b.f148832d);
                return i11;
            }
            return i11;
        }
        if ("android.intent.action.SCREEN_ON".equalsIgnoreCase(action) || "android.intent.action.USER_PRESENT".equalsIgnoreCase(action)) {
            C32252b.f148832d = false;
            AbstractC3082b0.m15421c(this.f148887a, "Receive action " + action);
            if (c22621q0.m116999v() && c22621q0.m116975A() && AbstractC3096i0.m15538g()) {
                m155767j0(C32252b.f148832d);
                return i11;
            }
            return i11;
        }
        return i11;
    }

    /* renamed from: h1 */
    public void m155885h1(int i11) {
        C23744a.m124114c().m124116d(1007, Integer.valueOf(i11));
    }

    /* renamed from: i0 */
    public boolean m155886i0(Context context) {
        String[] strArr;
        C22621q0 c22621q0 = new C22621q0();
        AbstractC3082b0.m15421c(this.f148887a, "handleHeadsetButton : 0");
        if (c22621q0.m116975A()) {
            strArr = AbstractC3108t.f13194b;
        } else {
            strArr = AbstractC3108t.f13193a;
        }
        if (AbstractC3108t.m15712a(context, strArr) != 0) {
            return false;
        }
        int m116981d = c22621q0.m116981d();
        AbstractC3082b0.m15424f(this.f148887a, "handleHeadsetButton : " + m116981d);
        if (!c22621q0.m116995r() && c22621q0.m117003z() && (m116981d == 2 || m116981d == 3)) {
            mo116931c(4);
            return true;
        }
        if (m116981d != 5) {
            return false;
        }
        mo116929a(0, 6);
        return true;
    }

    /* renamed from: i1 */
    public void m155887i1(int i11, C25942f c25942f) {
        AbstractC3082b0.m15421c("DUNGNNTEST", "NOTI_CALL_PARTNER_JOINCALL " + c25942f.toString());
        C23744a.m124114c().m124116d(40011, Integer.valueOf(i11), c25942f);
    }

    /* renamed from: i2 */
    public boolean mo155888i2() {
        return false;
    }

    /* renamed from: j1 */
    public void m155889j1(C25942f c25942f, int i11) {
        AbstractC3082b0.m15421c("DUNGNNTEST", "NOTI_CALL_PARTNER_LEAVECALL(reason: " + C25942f.m133651d(i11) + ")" + c25942f.toString());
        C23744a.m124114c().m124116d(40012, c25942f, Integer.valueOf(i11));
    }

    /* renamed from: j2 */
    public boolean m155890j2() {
        return this.f148899m == 0;
    }

    /* renamed from: k0 */
    public void m155891k0(Intent intent) {
        int i11;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        C22621q0 c22621q0 = new C22621q0();
        if (action.equals("m.voip.api.action.ACTION_NOTI_END_CALL")) {
            if (!c22621q0.m116999v()) {
                if (!c22621q0.m116995r()) {
                    if (c22621q0.m116981d() != 2 && c22621q0.m116981d() != 3) {
                        return;
                    }
                } else {
                    return;
                }
            }
            AbstractC3096i0.m15552n();
            if (c22621q0.m117000w()) {
                i11 = 100;
            } else {
                i11 = 0;
            }
            mo116929a(i11, 5);
        }
    }

    /* renamed from: k1 */
    public abstract void mo155892k1(int i11, int i12, int i13);

    /* renamed from: k2 */
    public abstract void mo155893k2();

    /* renamed from: l0 */
    public void m155894l0() {
        C22621q0 c22621q0 = new C22621q0();
        if (c22621q0.m116994q() && !c22621q0.m116995r()) {
            AbstractC3082b0.m15424f(this.f148887a, "Stop Ring when off screen");
            C32319o.m156293t().m156328q0();
        }
    }

    /* renamed from: l1 */
    public void m155895l1(int i11, int i12) {
        C23744a.m124114c().m124116d(1005, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* renamed from: l2 */
    public abstract void mo155896l2();

    /* renamed from: m0 */
    public void mo155897m0(C22628v c22628v) {
    }

    /* renamed from: m1 */
    public void mo155898m1() {
    }

    /* renamed from: m2 */
    public abstract void mo155899m2();

    /* renamed from: n0 */
    public void mo155900n0(C22602h c22602h) {
    }

    /* renamed from: n1 */
    public abstract void mo155901n1(int i11);

    /* renamed from: n2 */
    public void mo155902n2() {
    }

    /* renamed from: o0 */
    public void mo155903o0(C22625s0 c22625s0) {
    }

    /* renamed from: o1 */
    public void mo155904o1(int i11) {
    }

    /* renamed from: o2 */
    public void m155905o2(String str) {
        AbstractC3082b0.m15421c(this.f148887a, "startLogAction: actionId = " + str);
        try {
            f148885y.startLog(str);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e(this.f148887a, "sendVoiceMsgToFriend error Exception", e11);
        }
    }

    /* renamed from: p0 */
    public void m155906p0() {
        if (this.f148906t) {
            this.f148897k.postDelayed(new Runnable() { // from class: zm.voip.service.w2
                public /* synthetic */ RunnableC32362w2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC32273e3.this.m155756W0();
                }
            }, 700L);
        }
    }

    /* renamed from: p1 */
    public void mo155907p1(int i11) {
    }

    /* renamed from: p2 */
    public abstract void mo155908p2();

    /* renamed from: q0 */
    public abstract void mo155909q0(boolean z11);

    /* renamed from: q1 */
    public void m155910q1() {
        AbstractC3082b0.m15421c(this.f148887a, "onBroadcastForceAutoHangUp ");
        C23744a.m124114c().m124116d(IMediaPlayer.MEDIA_INFO_HAVE_DATA_STREAM, new Object[0]);
    }

    /* renamed from: q2 */
    public void mo155911q2() {
    }

    /* renamed from: r0 */
    public void mo155912r0(C22626t c22626t, String str, String str2) {
    }

    /* renamed from: r1 */
    public void m155913r1() {
        AbstractC3082b0.m15421c(this.f148887a, "onBroadcastForceQuit ");
        C23744a.m124114c().m124116d(1000, new Object[0]);
    }

    /* renamed from: r2 */
    public abstract void mo155914r2();

    /* renamed from: s */
    public abstract void mo155915s(Object obj, int i11, int i12);

    /* renamed from: s0 */
    public void mo155916s0(C22604i c22604i) {
    }

    /* renamed from: s1 */
    public void mo155917s1(int i11) {
    }

    /* renamed from: s2 */
    public void m155918s2(boolean z11, int i11) {
        HandlerC32324p.m156351d(new a(z11, i11));
    }

    /* renamed from: t */
    public void mo155919t(boolean z11) {
    }

    /* renamed from: t0 */
    public abstract void mo155920t0(int i11, int i12, String str);

    /* renamed from: t1 */
    public void mo155921t1() {
    }

    /* renamed from: t2 */
    public abstract void mo155922t2();

    /* renamed from: u */
    public void mo155923u(JSONObject jSONObject) {
    }

    /* renamed from: u0 */
    public abstract void mo155924u0(int i11, int i12, String str);

    /* renamed from: u1 */
    public void mo155925u1(int i11, int i12) {
    }

    /* renamed from: u2 */
    public void mo155926u2() {
    }

    /* renamed from: v */
    public void mo155927v() {
    }

    /* renamed from: v0 */
    public abstract void mo155928v0();

    /* renamed from: v1 */
    public void mo155929v1(int i11, int i12) {
    }

    /* renamed from: v2 */
    public void mo155930v2(String str) {
    }

    /* renamed from: w0 */
    public void mo155931w0() {
    }

    /* renamed from: w1 */
    public void mo155932w1() {
    }

    /* renamed from: w2 */
    public void mo155933w2() {
    }

    /* renamed from: x */
    public void mo155934x() {
    }

    /* renamed from: x0 */
    public void mo155935x0(EglBase.Context context, Context context2, C25447g c25447g) {
    }

    /* renamed from: x1 */
    public void m155936x1() {
        C32318n3.m156214E().m156255N();
    }

    /* renamed from: x2 */
    public void m155937x2() {
        HandlerC32324p.m156351d(new e());
    }

    /* renamed from: y */
    public void mo155938y() {
    }

    /* renamed from: y0 */
    public void m155939y0(Map map) {
        m155943z0(map, this.f148897k);
    }

    /* renamed from: y1 */
    public void mo155940y1(String str, String str2) {
    }

    /* renamed from: y2 */
    public void m155941y2(boolean z11, Activity activity, long j11) {
        IVoipZalo iVoipZalo = f148885y;
        if (iVoipZalo != null) {
            iVoipZalo.trackingStateCallActivity(z11, activity, j11);
        }
    }

    /* renamed from: z */
    public boolean m155942z(int i11, int i12, int i13) {
        return m155778A(i11, i12, i13, 0L);
    }

    /* renamed from: z0 */
    public void m155943z0(Map map, Handler handler) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f148893g) {
            this.f148893g = true;
            AbstractC3096i0.m15550m();
            AbstractC3096i0.m15562s();
            C32319o.m156293t();
        }
        HandlerC32324p.m156351d(new b(map, handler, currentTimeMillis));
    }

    /* renamed from: z1 */
    public void mo155944z1(String str, int i11, int i12) {
    }
}
