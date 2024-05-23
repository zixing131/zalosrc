package zm.voip.service;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3106r;
import com.vng.zing.vn.zrtc.CallCallback;
import com.vng.zing.vn.zrtc.device.AndroidVideoCapturerObserver;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import dj.C17945a0;
import gp0.C19548i;
import gp0.C19561o0;
import gp0.C19563p0;
import gp0.C19568s;
import gp0.C19569s0;
import ho0.AbstractC20110a;
import java.util.List;
import java.util.Map;
import lo0.C22621q0;
import lo0.C22626t;
import me0.AbstractC23152n3;
import me0.AbstractC23178p7;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.videofilter.ZVideoFilterManager;
import p097db.AbstractC17849h;
import p097db.C17843b;
import p097db.EnumC17851j;
import p097db.EnumC17853l;
import p097db.EnumC17854m;
import p097db.EnumC17858q;
import p097db.EnumC17859r;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import ro0.AbstractRunnableC25943g;
import t00.C26444a;
import th.AbstractC26681b;
import vg.C28203u6;

/* renamed from: zm.voip.service.b4 */
/* loaded from: classes7.dex */
public class C32257b4 extends CallCallback {

    /* renamed from: a */
    C22626t f148846a;

    /* renamed from: b */
    private final AbstractC32347t2 f148847b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.b4$a */
    /* loaded from: classes7.dex */
    public class a extends AbstractC32347t2 {
        a() {
        }

        @Override // zm.voip.service.AbstractC32347t2
        /* renamed from: d */
        protected void mo155742d(Message message) {
            C32257b4.this.m155738n(message);
        }
    }

    /* renamed from: zm.voip.service.b4$b */
    /* loaded from: classes7.dex */
    class b extends AbstractRunnableC25943g {
        b() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94170d(false);
        }
    }

    /* renamed from: zm.voip.service.b4$c */
    /* loaded from: classes7.dex */
    class c extends AbstractRunnableC25943g {
        c() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            AbstractC32273e3.m155748Q().m155812I1();
        }
    }

    /* renamed from: zm.voip.service.b4$d */
    /* loaded from: classes7.dex */
    class d extends AbstractRunnableC25943g {
        d() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            AbstractC17849h.m94305n();
        }
    }

    /* renamed from: zm.voip.service.b4$e */
    /* loaded from: classes7.dex */
    class e extends AbstractRunnableC25943g {
        e() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            AbstractC32273e3.m155748Q().m155812I1();
        }
    }

    /* renamed from: zm.voip.service.b4$f */
    /* loaded from: classes7.dex */
    public static class f {

        /* renamed from: a */
        public static final C32257b4 f148853a = new C32257b4();
    }

    /* synthetic */ C32257b4(AbstractC32263c4 abstractC32263c4) {
        this();
    }

    /* renamed from: A */
    private void m155714A(C22626t c22626t) {
        String str;
        AbstractC3082b0.m15421c("ZaloVoipCallback", "Update call");
        if (c22626t != null) {
            try {
                str = "ZaloVoipCallback";
                try {
                    JSONObject jSONObject = new JSONObject(C17843b.m94137o().m94184k());
                    if (jSONObject.has("active")) {
                        c22626t.m117036J1(jSONObject.getBoolean("active"));
                    }
                    if (jSONObject.has("role")) {
                        c22626t.m117095c1(jSONObject.getBoolean("role"));
                    }
                    if (jSONObject.has("state")) {
                        c22626t.m117083Z0(jSONObject.getInt("state"));
                    }
                    if (jSONObject.has("mediaStatus")) {
                        c22626t.m117027G1(jSONObject.getInt("mediaStatus"));
                    }
                    if (jSONObject.has("isZrtpConnected")) {
                        c22626t.m117132l2(jSONObject.getBoolean("isZrtpConnected"));
                    }
                    if (jSONObject.has("zrtpInitDuration")) {
                        c22626t.m117136m2(jSONObject.getInt("zrtpInitDuration"));
                    }
                    if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                        c22626t.m117087a1(jSONObject.getBoolean(ZinstantMetaConstant.IMPRESSION_META_TYPE) ? 1 : 0);
                    }
                    if (jSONObject.has("duration")) {
                        c22626t.m117071V0(jSONObject.getInt("duration"));
                    }
                    if (jSONObject.has("quality")) {
                        c22626t.m117123j1(jSONObject.getInt("quality"));
                    }
                    if (jSONObject.has("qualityOverall")) {
                        c22626t.m117045M1(jSONObject.getInt("qualityOverall"));
                    }
                    if (jSONObject.has("localCameraOff")) {
                        c22626t.m117018D1(jSONObject.getInt("localCameraOff"));
                    }
                    if (jSONObject.has("localCameraOffReason")) {
                        c22626t.m117021E1(jSONObject.getInt("localCameraOffReason"));
                    }
                    if (jSONObject.has("partnerCameraOff")) {
                        c22626t.m117048N1(jSONObject.getInt("partnerCameraOff"));
                    }
                    if (jSONObject.has("partnerCameraOffReason")) {
                        c22626t.m117051O1(jSONObject.getInt("partnerCameraOffReason"));
                    }
                    if (jSONObject.has("cameraBack")) {
                        c22626t.m117103e1(jSONObject.getBoolean("cameraBack"));
                    }
                    if (jSONObject.has("isRoaming")) {
                        c22626t.m117084Z1(jSONObject.getBoolean("isRoaming"));
                    }
                    if (jSONObject.has("isImproving")) {
                        c22626t.m117171w1(jSONObject.getBoolean("isImproving"));
                    }
                    if (jSONObject.has("rtpAddress")) {
                        c22626t.m117100d2(jSONObject.getString("rtpAddress"));
                    }
                    if (jSONObject.has("rtcpAddress")) {
                        c22626t.m117096c2(jSONObject.getString("rtcpAddress"));
                    }
                    if (jSONObject.has("sessionId")) {
                        c22626t.m117104e2(jSONObject.getString("sessionId"));
                    }
                    if (jSONObject.has("poorSide")) {
                        c22626t.m117065T0(jSONObject.getInt("poorSide"));
                    }
                    if (jSONObject.has("vidPoorSide")) {
                        c22626t.m117128k2(jSONObject.getInt("vidPoorSide"));
                    }
                    if (jSONObject.has("fromNoti")) {
                        c22626t.m117162t1(jSONObject.getInt("fromNoti"));
                    }
                    if (jSONObject.has("audioHD")) {
                        c22626t.m117062S0(jSONObject.getInt("audioHD"));
                    }
                    if (jSONObject.has("lostConnectionSide")) {
                        c22626t.m117024F1(jSONObject.getInt("lostConnectionSide"));
                    }
                    c22626t.m117119i1(SystemClock.elapsedRealtime() - (c22626t.m117097d() * 1000));
                } catch (Exception e11) {
                    e = e11;
                    AbstractC3082b0.m15423e(str, "updateCallInfoFromNative: ", e);
                }
            } catch (Exception e12) {
                e = e12;
                str = "ZaloVoipCallback";
            }
        }
    }

    /* renamed from: B */
    private synchronized void m155715B() {
        C22626t c22626t = this.f148846a;
        if (c22626t == null) {
            return;
        }
        try {
            m155714A(c22626t);
            this.f148846a.m117074W0(C19561o0.m102161L().m102195D());
        } catch (Exception unused) {
            AbstractC3082b0.m15422d("ZaloVoipCallback", "updateCurrentCallInfoFromNative failed");
        }
    }

    /* renamed from: j */
    private void m155725j(int i11, int i12, boolean z11) {
        if (C26444a.m136319a().m136321c() && i12 == -1 && z11) {
            String valueOf = String.valueOf(i11);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                Context appContext = MainApplication.getAppContext();
                Map map = AbstractC23304d.f113321R;
                Boolean bool = (Boolean) map.get(valueOf);
                if (bool == null) {
                    bool = Boolean.valueOf(C7960e.m41971c6().m42606z9(valueOf));
                    map.put(valueOf, bool);
                }
                boolean booleanValue = bool.booleanValue();
                if (!booleanValue && AbstractC26681b.f126361f) {
                    booleanValue = AbstractC23178p7.m119414m(appContext, valueOf);
                }
                if (booleanValue) {
                    return;
                }
                int max = Math.max(AbstractC23309i.m121402S(), 0);
                List m41536b0 = C7956b.m41474B().m41536b0(valueOf, 0, max);
                long currentTimeMillis2 = System.currentTimeMillis() - AbstractC23309i.m121302Pa();
                long j11 = 0;
                for (int i13 = 0; i13 < m41536b0.size(); i13++) {
                    C17945a0 c17945a0 = (C17945a0) m41536b0.get(i13);
                    if (c17945a0.m94974P4() >= currentTimeMillis2 && c17945a0.m95032V6()) {
                        j11++;
                    }
                }
                if (j11 >= max) {
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(valueOf);
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    if (m141809c != null) {
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: zm.voip.service.y3
                            public /* synthetic */ RunnableC32373y3() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C32257b4.m155727o(ContactProfile.this);
                            }
                        }, Math.max(1500 - currentTimeMillis3, 0L));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: m */
    public static synchronized C32257b4 m155726m() {
        C32257b4 c32257b4;
        synchronized (C32257b4.class) {
            c32257b4 = f.f148853a;
        }
        return c32257b4;
    }

    /* renamed from: o */
    public static /* synthetic */ void m155727o(ContactProfile contactProfile) {
        AbstractC23152n3.m119001I0(MainApplication.getAppContext(), contactProfile);
    }

    /* renamed from: p */
    public static /* synthetic */ void m155728p() {
        try {
            C32319o.m156293t().m156304S(AbstractC3106r.m15708a(AbstractC3096i0.m15574y()));
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("ZaloVoipCallback", "holdcall when has navtive failed = " + e11.toString());
        }
    }

    /* renamed from: q */
    public static /* synthetic */ void m155729q(C22626t c22626t) {
        if (c22626t.m117047N0()) {
            AbstractC32273e3.m155748Q().mo155899m2();
        }
    }

    /* renamed from: r */
    public /* synthetic */ void m155730r() {
        onCallLog(C17843b.m94137o().m94168c());
    }

    /* renamed from: s */
    public static /* synthetic */ void m155731s() {
        AbstractC32273e3.m155748Q().mo155832N2(1);
    }

    /* renamed from: t */
    public static /* synthetic */ void m155732t() {
        C32319o.m156293t().m156319h0();
    }

    /* renamed from: u */
    public /* synthetic */ void m155733u(String str, String str2) {
        AbstractC32273e3.m155748Q().mo155912r0(this.f148846a, str, str2);
    }

    /* renamed from: v */
    public static /* synthetic */ void m155734v(int i11, int i12, int i13, int i14, String str) {
        if (i11 == EnumC17854m.CALLER_RESPONSE_NEW_TCP_SERVER.ordinal()) {
            AbstractC32273e3.m155748Q().mo155835O1(i12, i13, i14, str);
        } else if (i11 == EnumC17854m.CALLEE_REQUEST_NEW_TCP_SERVER.ordinal()) {
            AbstractC32273e3.m155748Q().mo155831N1(i12, i13, i14, str);
        }
    }

    /* renamed from: w */
    public static /* synthetic */ void m155735w() {
        AbstractC32273e3.m155748Q().mo155832N2(2);
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public String getDevPerf(String str) {
        return C32258c.m155744b(str);
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public int getNetworkType() {
        return AbstractC3106r.m15709b(AbstractC3096i0.m15574y());
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public String getPlatformStat() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("capture", AndroidVideoCapturerObserver.getStat());
            jSONObject.put("filterVersion", AndroidVideoCapturerObserver.getFilterStat());
            jSONObject.put("vidFilter", ZVideoFilterManager.getStat());
        } catch (JSONException e11) {
            AbstractC20110a.m104539h(e11);
        }
        return jSONObject.toString();
    }

    /* renamed from: k */
    void m155736k() {
        try {
            boolean m117122j0 = this.f148846a.m117122j0();
            int mo155833O = AbstractC32273e3.m155748Q().mo155833O();
            if (m117122j0) {
                if (!AbstractC3096i0.m15511R()) {
                    AbstractC32273e3.m155748Q().mo155914r2();
                }
                C32319o.m156293t().m156323l0();
            } else if (this.f148846a.m117090b0() && this.f148846a.m117050O0() && !this.f148846a.m117011B0()) {
                AbstractC32273e3.m155748Q().mo155816J2(mo155833O, this.f148846a.m117047N0(), this.f148846a.m117086a0());
            }
            if (this.f148846a.m117047N0()) {
                ZVideoFilterManager.regisRenderer(null);
            }
            AbstractC32273e3.m155748Q().mo155926u2();
            C19561o0.m102161L().m102231V0(0L);
            m155725j((int) this.f148846a.m117013C(), mo155833O, this.f148846a.m117090b0());
            AbstractC32273e3.m155748Q().mo155858X1(new C22621q0(new C22626t(this.f148846a)));
            this.f148846a.m117069U1(false);
            this.f148847b.m156378e();
            AbstractC23304d.f113366b3 = mo155833O;
            m155740y();
            if (this.f148846a.m117047N0()) {
                this.f148846a.m117030H1(1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public synchronized C22626t m155737l() {
        return this.f148846a;
    }

    /* renamed from: n */
    protected void m155738n(Message message) {
        C22626t m155737l = m155737l();
        if (m155737l == null) {
            return;
        }
        switch (message.what) {
            case 1:
                int m117113h = m155737l.m117113h();
                if (m117113h == 5) {
                    if (m155737l.m117109g() == 0) {
                        m155737l.m117080Y0(System.currentTimeMillis());
                        C32318n3.m156214E().m156260Y();
                        C32319o.m156293t().m156333t0();
                        if (AbstractC3106r.m15710c(AbstractC3096i0.m15574y())) {
                            HandlerC32324p.m156352e(new Runnable() { // from class: zm.voip.service.z3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C32257b4.m155728p();
                                }
                            }, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
                        }
                        if (AbstractC3096i0.m15538g() && !AbstractC3096i0.f13166j) {
                            AbstractC32273e3.m155748Q().m155827M1(new Runnable() { // from class: zm.voip.service.a4
                                public /* synthetic */ RunnableC32251a4() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C32257b4.m155729q(C22626t.this);
                                }
                            });
                        }
                    }
                    m155737l.m117115h1(true);
                }
                if (m155737l.m117090b0() || m117113h != 3) {
                    m155740y();
                    return;
                }
                return;
            case 2:
                AbstractC32273e3.m155748Q().mo116929a(0, 7);
                return;
            case 3:
            case 4:
                if (m155737l.m117126k0()) {
                    m155740y();
                    return;
                }
                return;
            case 5:
                if (!m155737l.m117067U()) {
                    m155740y();
                    return;
                }
                return;
            case 6:
                try {
                    int intValue = ((Integer) message.obj).intValue();
                    if (!m155737l.m117067U()) {
                        AbstractC32273e3.m155748Q().mo155901n1(intValue);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onCallAudioState(int i11) {
        AbstractC3082b0.m15421c("ZaloVoipCallback", "onCallAudioState: type: " + i11);
        C22626t c22626t = this.f148846a;
        if (c22626t != null && c22626t.m117170w0()) {
            if (i11 == EnumC17851j.RECEIVE_FIRST_AUDIO.ordinal()) {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.w3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C32257b4.m155731s();
                    }
                });
                return;
            }
            if (i11 == EnumC17851j.RECEIVE_ACK.ordinal()) {
                C19561o0.m102161L().m102206I0(new C19568s(408, 0, this.f148846a.m117013C(), this.f148846a.m117055Q()));
                return;
            }
            if (i11 == EnumC17851j.RECEIVE_ANSWER.ordinal()) {
                C19561o0.m102161L().m102206I0(new C19568s(300, 0, this.f148846a.m117013C(), this.f148846a.m117055Q()));
                return;
            }
            if (i11 == EnumC17851j.PRE_START_DEVICE.ordinal()) {
                VoipAudioHelper.m155571S0(VoipAudioHelper.m155554K());
                return;
            }
            try {
                m155715B();
                if (i11 == EnumC17851j.PLAY_POOR_SIGNAL.ordinal()) {
                    if (m155737l().m117126k0()) {
                        C32319o.m156293t().m156314c0();
                        return;
                    }
                    return;
                }
                if (i11 == EnumC17851j.STOP_POOR_SIGNAL.ordinal()) {
                    C32319o.m156293t().m156318g0();
                    return;
                }
                if (i11 == EnumC17851j.CANNOT_RECORD.ordinal()) {
                    this.f148846a.m117111g1(true);
                } else if (i11 == EnumC17851j.ON_HD_QUALITY.ordinal()) {
                    this.f148846a.m117062S0(1);
                    AbstractC32273e3.m155748Q().m155805G2();
                } else if (i11 == EnumC17851j.OFF_HD_QUALITY.ordinal()) {
                    this.f148846a.m117062S0(0);
                    AbstractC32273e3.m155748Q().m155805G2();
                } else {
                    if (i11 == EnumC17851j.STOP_RINGBACK_SIGNAL.ordinal()) {
                        this.f148847b.m156377c().post(new Runnable() { // from class: zm.voip.service.x3
                            @Override // java.lang.Runnable
                            public final void run() {
                                C32257b4.m155732t();
                            }
                        });
                        return;
                    }
                    if (i11 == EnumC17851j.SHOW_LOADING.ordinal()) {
                        AbstractC3082b0.m15421c("ZaloVoipCallback", "onCallAudioState SHOW_LOADING");
                        AbstractC32273e3.m155748Q().mo155896l2();
                        this.f148846a.m117039K1(true);
                    } else if (i11 == EnumC17851j.HIDE_LOADING.ordinal()) {
                        AbstractC3082b0.m15421c("ZaloVoipCallback", "onCallAudioState HIDE_LOADING: " + C17843b.m94137o().m94182j());
                        AbstractC32273e3.m155748Q().mo155928v0();
                        this.f148846a.m117039K1(false);
                    } else if (i11 == EnumC17851j.ROAMING.ordinal()) {
                        AbstractC3082b0.m15421c("ZaloVoipCallback", "onCallAudioState start ROAMING");
                        AbstractC32273e3.m155748Q().mo155908p2();
                    } else if (i11 == EnumC17851j.FINISH.ordinal()) {
                        AbstractC3082b0.m15421c("ZaloVoipCallback", "onCallAudioState finish ROAMING");
                        AbstractC32273e3.m155748Q().mo155922t2();
                    } else if (C32278f3.m155945a(i11)) {
                        AbstractC32273e3.m155748Q().mo155925u1(1, i11);
                        return;
                    }
                }
                this.f148847b.m156381h(4, Integer.valueOf(i11));
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("ZaloVoipCallback", "onCallAudioState state: " + i11, e11);
            }
        }
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onCallAutoHangup() {
        AbstractC3082b0.m15424f("ZaloVoipCallback", "onCallAutoHangup");
        try {
            m155715B();
            C22626t c22626t = this.f148846a;
            if (c22626t != null) {
                c22626t.m117068U0(true);
            }
            this.f148847b.m156382i(2, 500L);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZaloVoipCallback", "onCallAutoHangup: ", e11);
        }
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onCallChangeZRTP(int i11, String str, String str2, String str3) {
        AbstractC3082b0.m15424f("ZaloVoipCallback", "onCallChangeZRTP: state = " + i11 + "; rtpServer: " + str + " - " + str2);
        if (this.f148846a == null) {
            return;
        }
        if (i11 == EnumC17853l.START.ordinal()) {
            this.f148847b.m156377c().post(new Runnable() { // from class: zm.voip.service.s3

                /* renamed from: q */
                public final /* synthetic */ String f149265q;

                /* renamed from: r */
                public final /* synthetic */ String f149266r;

                public /* synthetic */ RunnableC32343s3(String str4, String str22) {
                    r2 = str4;
                    r3 = str22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C32257b4.this.m155733u(r2, r3);
                }
            });
            return;
        }
        if (i11 == EnumC17853l.SUCCESSFUL.ordinal()) {
            C19561o0.m102161L().m102204H0(new C19563p0(418, this.f148846a.m117090b0(), true, str4, str22, str3));
        } else if (i11 == EnumC17853l.FAILED.ordinal()) {
            C19561o0.m102161L().m102204H0(new C19563p0(418, this.f148846a.m117090b0(), false, str4, str22, str3));
        }
        try {
            m155715B();
            this.f148847b.m156377c().post(new Runnable() { // from class: zm.voip.service.t3
                public /* synthetic */ RunnableC32348t3() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C32257b4.this.m155740y();
                }
            });
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZaloVoipCallback", "onCallChangeZRTP state: " + i11, e11);
        }
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onCallErr(int i11) {
        AbstractC3082b0.m15424f("ZaloVoipCallback", "onCallErr: err = " + i11);
        if (i11 == -24) {
            HandlerC32324p.m156351d(new c());
            return;
        }
        if (i11 != -25 && i11 != -26) {
            if (i11 == -30 || i11 == -31) {
                HandlerC32324p.m156351d(new e());
                return;
            }
            return;
        }
        HandlerC32324p.m156351d(new d());
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onCallLog(String str) {
        AbstractC3082b0.m15424f("onCallLog", str);
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onCallQualityChanged(int i11) {
        AbstractC3082b0.m15421c("ZaloVoipCallback", "onCallQualityChanged: quality: " + i11);
        try {
            m155715B();
            this.f148847b.m156380g(3);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZaloVoipCallback", "onCallQualityChanged quality: " + i11, e11);
        }
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onCallRequest(int i11, int i12, int i13, int i14, String str) {
        AbstractC3082b0.m15421c("ZaloVoipCallback", "onCallRequest: type = " + i11 + ", partnerId = " + i12 + ", callId = " + i13 + ", data = " + str);
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.r3

            /* renamed from: p */
            public final /* synthetic */ int f149256p;

            /* renamed from: q */
            public final /* synthetic */ int f149257q;

            /* renamed from: r */
            public final /* synthetic */ int f149258r;

            /* renamed from: s */
            public final /* synthetic */ int f149259s;

            /* renamed from: t */
            public final /* synthetic */ String f149260t;

            public /* synthetic */ RunnableC32338r3(int i112, int i122, int i132, int i142, String str2) {
                r1 = i112;
                r2 = i122;
                r3 = i132;
                r4 = i142;
                r5 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C32257b4.m155734v(r1, r2, r3, r4, r5);
            }
        });
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onCallSendDataToPartner(int i11, int i12, int i13, String str) {
        AbstractC3082b0.m15421c("ZaloVoipCallback", "onCallSendDataToPartner: type = " + i13 + ", receiver = " + i11 + ", callid = " + i12 + ", data = " + str);
        AbstractC32273e3.m155748Q().mo155862Z1(i11, i12, i13, str);
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onCallState(int i11) {
        AbstractC3082b0.m15424f("ZaloVoipCallback", "onCallState: " + i11);
        C22626t c22626t = this.f148846a;
        if (c22626t == null) {
            return;
        }
        if (!c22626t.m117170w0()) {
            if (i11 == 6 && this.f148846a.m117064T()) {
                m155715B();
                this.f148846a.m117056Q0(false);
                this.f148847b.m156379f();
                m155736k();
                return;
            }
            return;
        }
        try {
            m155715B();
            if (i11 == 6) {
                this.f148846a.m117056Q0(false);
                this.f148847b.m156379f();
                m155736k();
            } else {
                this.f148847b.m156380g(1);
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZaloVoipCallback", "onCallState state: " + i11, e11);
        }
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onCallStats(String str) {
        try {
            if (AbstractC32273e3.m155748Q().m155815J0()) {
                C23744a.m124114c().m124116d(ZAbstractBase.ZVU_BLEND_GEN_THUMB, str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onCallUpdateP2PStatus(int i11, int i12) {
        AbstractC3082b0.m15421c("ZaloVoipCallback", "onCallUpdateP2PStatus: state = " + i11 + "; status: " + i12);
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onCallVideoState(int i11) {
        AbstractC3082b0.m15421c("ZaloVoipCallback", "onCallVideoState: state = " + i11);
        C22626t c22626t = this.f148846a;
        if (c22626t != null && c22626t.m117170w0()) {
            try {
                if (i11 == EnumC17859r.RECEIVE_FIRST_VIDEO.ordinal()) {
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zm.voip.service.v3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C32257b4.m155735w();
                        }
                    });
                    return;
                }
                m155715B();
                if (i11 != EnumC17859r.START_CAPTURE.ordinal() && i11 != EnumC17859r.STOP_CAPTURE.ordinal() && i11 != EnumC17859r.SWITCH_CAMERA.ordinal()) {
                    EnumC17859r enumC17859r = EnumC17859r.AUTO_STOP_CAPTURE;
                    if (i11 != enumC17859r.ordinal()) {
                        if (i11 != EnumC17859r.PARTNER_AUTO_START_CAPTURE.ordinal() && i11 != EnumC17859r.PARTNER_AUTO_STOP_CAPTURE.ordinal() && i11 != EnumC17859r.PARTNER_MANUAL_START_CAPTURE.ordinal() && i11 != EnumC17859r.PARTNER_MANUAL_STOP_CAPTURE.ordinal() && i11 != EnumC17859r.DETECT_LOSS_VIDEO.ordinal() && i11 != EnumC17859r.DETECT_RECEIVE_VIDEO.ordinal()) {
                            if (C32278f3.m155952h(i11)) {
                                AbstractC32273e3.m155748Q().mo155925u1(2, i11);
                            } else {
                                this.f148847b.m156380g(5);
                                if (i11 == enumC17859r.ordinal()) {
                                    AbstractC32273e3.m155748Q().mo155809H2(2, "", 5);
                                    C23744a.m124114c().m124116d(1004, new Object[0]);
                                }
                            }
                            AbstractC32273e3.m155748Q().mo155797E2();
                        }
                        this.f148847b.m156381h(6, Integer.valueOf(i11));
                        AbstractC32273e3.m155748Q().mo155797E2();
                    }
                }
                this.f148847b.m156381h(6, Integer.valueOf(i11));
                AbstractC32273e3.m155748Q().mo155797E2();
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("ZaloVoipCallback", "onCallVideoState state: " + i11, e11);
            }
        }
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onIncomingCall() {
        AbstractC3082b0.m15424f("ZaloVoipCallback", "onIncomingCall");
        C22626t c22626t = this.f148846a;
        if (c22626t != null && c22626t.m117170w0()) {
            AbstractC3082b0.m15424f("ZaloVoipCallback", "onIncomingCall returned!");
            return;
        }
        try {
            if (AbstractC3106r.m15710c(AbstractC3096i0.m15574y())) {
                HandlerC32324p.m156351d(new b());
                AbstractC3082b0.m15424f("ZaloVoipCallback", "onIncomingCall isInNativeCall returned!");
                return;
            }
            m155741z(true);
            AbstractC32273e3.m155748Q().mo155808H1();
            this.f148846a.m117056Q0(true);
            m155715B();
            this.f148847b.m156375a();
            if (C19561o0.m102161L().m102261k0() && AbstractC3096i0.f13165i) {
                AbstractC32273e3.m155748Q().mo155801F2(this.f148846a);
            } else {
                AbstractC32273e3.m155748Q().mo155861Z0(this.f148846a, false, 1001);
            }
            m155740y();
            C19561o0.m102161L().m102204H0(new C19548i(407));
            C23744a.m124114c().m124116d(10036, new Object[0]);
            if (this.f148846a.m117070V() && this.f148846a.m117170w0()) {
                AbstractC32273e3.m155748Q().mo116931c(C19561o0.m102161L().m102284z());
                this.f148846a.m117059R0(false);
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZaloVoipCallback", "onIncomingCall: " + e11.getMessage(), e11);
        }
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onInitZrtpRequestFailed(int i11) {
        AbstractC3082b0.m15424f("ZaloVoipCallback", "onInitZrtpRequestFailed: retCode: " + i11);
        if (i11 > 0) {
            i11 += 200;
        }
        C19561o0.m102161L().m102204H0(new C19569s0(5, i11));
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onInitZrtpWithServer(String str, String str2) {
        AbstractC3082b0.m15424f("ZaloVoipCallback", "onInitZrtpWithServer: cmd = 416, rtpServer = " + str + " - " + str2);
        try {
            m155715B();
            C19561o0.m102161L().m102191B1(str, str2, null);
            C19561o0.m102161L().m102204H0(new C19548i(416));
            this.f148847b.m156380g(1);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZaloVoipCallback", "onInitZrtpWithServer: ", e11);
        }
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onMakeCall() {
        AbstractC3082b0.m15424f("ZaloVoipCallback", "onMakeCall");
        C22626t c22626t = this.f148846a;
        if (c22626t != null && c22626t.m117170w0()) {
            return;
        }
        try {
            m155741z(true);
            AbstractC32273e3.m155748Q().mo155808H1();
            this.f148846a.m117056Q0(true);
            m155715B();
            AbstractC32273e3.m155748Q().mo155801F2(this.f148846a);
            C32318n3.m156214E().m156258V();
            C23744a.m124114c().m124116d(10036, new Object[0]);
            this.f148847b.m156375a();
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZaloVoipCallback", "onMakeCall: " + e11.getMessage(), e11);
        }
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onNativeException(String str) {
        AbstractC20110a.m104539h(new Exception(str));
    }

    @Override // com.vng.zing.vn.zrtc.CallCallback
    public void onPreConnectSuccessful(int i11, int i12, int i13, String str) {
        AbstractC3082b0.m15421c("ZaloVoipCallback", "onPreConnectSuccessful: type = " + i11 + ", receiver = " + i12 + ", requestId = " + i13 + ", extraData = " + str);
        if (i11 == EnumC17858q.SEND_INCOMING_TO_CALLEE.ordinal()) {
            AbstractC32273e3.m155748Q().mo155865a2(i12, i13, str);
        } else if (i11 == EnumC17858q.SEND_ANSWER_TO_CALLER.ordinal()) {
            AbstractC32273e3.m155748Q().mo155859Y1(i12, i13, str);
        }
    }

    /* renamed from: x */
    public void m155739x() {
        this.f148847b.m156376b(new Runnable() { // from class: zm.voip.service.u3
            public /* synthetic */ RunnableC32353u3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C32257b4.this.m155730r();
            }
        }, 1000);
    }

    /* renamed from: y */
    public void m155740y() {
        AbstractC32273e3.m155748Q().mo155898m1();
    }

    /* renamed from: z */
    public void m155741z(boolean z11) {
        this.f148846a.m117053P0(z11);
    }

    private C32257b4() {
        super(AbstractC3096i0.m15574y());
        this.f148846a = new C22626t();
        this.f148847b = new a();
    }
}
