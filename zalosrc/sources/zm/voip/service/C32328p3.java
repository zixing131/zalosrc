package zm.voip.service;

import android.os.Message;
import android.os.SystemClock;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3106r;
import com.vng.zing.vn.zrtc.GroupCallback;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import gp0.C19548i;
import gp0.C19567r0;
import gp0.C19569s0;
import gp0.C19577z;
import lo0.C22592c;
import lo0.C22621q0;
import org.json.JSONObject;
import p097db.AbstractC17849h;
import p097db.C17846e;
import p097db.EnumC17851j;
import p097db.EnumC17859r;
import p348mi.AbstractC23304d;
import p363nh.C23744a;
import ro0.AbstractRunnableC25943g;

/* renamed from: zm.voip.service.p3 */
/* loaded from: classes7.dex */
public class C32328p3 extends GroupCallback {

    /* renamed from: a */
    C22592c f149248a;

    /* renamed from: b */
    private final AbstractC32347t2 f149249b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.p3$a */
    /* loaded from: classes7.dex */
    public class a extends AbstractC32347t2 {
        a() {
        }

        @Override // zm.voip.service.AbstractC32347t2
        /* renamed from: d */
        protected void mo155742d(Message message) {
            C32328p3.this.m156359f(message);
        }
    }

    /* renamed from: zm.voip.service.p3$b */
    /* loaded from: classes7.dex */
    class b extends AbstractRunnableC25943g {
        b() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            AbstractC32273e3.m155748Q().m155812I1();
        }
    }

    /* renamed from: zm.voip.service.p3$c */
    /* loaded from: classes7.dex */
    class c extends AbstractRunnableC25943g {
        c() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            AbstractC17849h.m94305n();
        }
    }

    /* renamed from: zm.voip.service.p3$d */
    /* loaded from: classes7.dex */
    class d extends AbstractRunnableC25943g {
        d() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            AbstractC32273e3.m155748Q().m155812I1();
        }
    }

    /* renamed from: zm.voip.service.p3$e */
    /* loaded from: classes7.dex */
    public static class e {

        /* renamed from: a */
        public static final C32328p3 f149254a = new C32328p3();
    }

    /* synthetic */ C32328p3(AbstractC32333q3 abstractC32333q3) {
        this();
    }

    /* renamed from: e */
    public static C32328p3 m156358e() {
        return e.f149254a;
    }

    /* renamed from: f */
    public void m156359f(Message message) {
        C22592c m156362c = m156362c();
        if (m156362c == null) {
            return;
        }
        try {
            switch (message.what) {
                case 1:
                    m156364g();
                    return;
                case 2:
                default:
                case 3:
                    if (m156362c.m116854J()) {
                        m156364g();
                        return;
                    }
                    return;
                case 4:
                case 5:
                    m156364g();
                    return;
                case 6:
                    int intValue = ((Integer) message.obj).intValue();
                    if (!m156362c.m116927z()) {
                        AbstractC32273e3.m155748Q().mo155901n1(intValue);
                        break;
                    }
                    break;
                case 7:
                    int intValue2 = ((Integer) message.obj).intValue();
                    if (!m156362c.m116927z()) {
                        AbstractC32273e3.m155748Q().mo155904o1(intValue2);
                        break;
                    }
                    break;
                case 8:
                    int intValue3 = ((Integer) message.obj).intValue();
                    if (!m156362c.m116927z()) {
                        AbstractC32273e3.m155748Q().mo155907p1(intValue3);
                        break;
                    }
                    break;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    private void m156360i(C22592c c22592c) {
        AbstractC3082b0.m15421c("ZaloGroupCallback", "Update call");
        if (c22592c == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(C17846e.m94223f().m94234d());
            if (jSONObject.has("active")) {
                c22592c.m116873W(jSONObject.getBoolean("active"));
            }
            if (jSONObject.has("role")) {
                c22592c.m116882c0(jSONObject.getBoolean("role"));
            }
            if (jSONObject.has("state")) {
                c22592c.m116876Z(jSONObject.getInt("state"));
            }
            if (jSONObject.has("isZrtpConnected")) {
                c22592c.m116859L0(jSONObject.getBoolean("isZrtpConnected"));
            }
            if (jSONObject.has("zrtpInitDuration")) {
                c22592c.m116861M0(jSONObject.getInt("zrtpInitDuration"));
            }
            if (jSONObject.has("duration")) {
                c22592c.m116874X(jSONObject.getInt("duration"));
            }
            if (jSONObject.has("localCameraOff")) {
                c22592c.m116920v0(jSONObject.getInt("localCameraOff"));
            }
            if (jSONObject.has("cameraBack")) {
                c22592c.m116886e0(jSONObject.getBoolean("cameraBack"));
            }
            if (jSONObject.has("isRoaming")) {
                c22592c.m116837A0(jSONObject.getBoolean("isRoaming"));
            }
            if (jSONObject.has("fromNoti")) {
                c22592c.m116900l0(jSONObject.getInt("fromNoti"));
            }
            if (jSONObject.has("rtpAddress")) {
                c22592c.m116841C0(jSONObject.getString("rtpAddress"));
            }
            if (jSONObject.has("rtcpAddress")) {
                c22592c.m116839B0(jSONObject.getString("rtcpAddress"));
            }
            c22592c.m116892h0(SystemClock.elapsedRealtime() - (c22592c.m116881c() * 1000));
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZaloGroupCallback", "updateCallInfoFromNative: ", e11);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:2|3|(6:5|(1:7)|8|(1:10)|11|13)|15|16|17|8|(0)|11|13) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:            r2 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:            r2.printStackTrace();     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a7 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:3:0x0007, B:5:0x0020, B:8:0x0098, B:10:0x00a7, B:11:0x00b3, B:15:0x002e, B:17:0x0058, B:20:0x0095), top: B:2:0x0007, inners: #0 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m156361b() {
        AbstractC32273e3.m155748Q().mo155938y();
        try {
            this.f149248a.m116881c();
            int mo155833O = AbstractC32273e3.m155748Q().mo155833O();
            C19577z m102341J = C19577z.m102341J();
            if (!this.f149248a.m116852I()) {
                if (this.f149248a.m116891h() == 9) {
                }
                m102341J.m102389Q0(0L);
                if (m156362c().m116866P()) {
                    AbstractC32273e3.m155748Q().mo155858X1(new C22621q0());
                }
                this.f149249b.m156378e();
                AbstractC23304d.f113366b3 = mo155833O;
                AbstractC32273e3.m155748Q().m155882g1();
            }
            m156362c().m116924x0(false);
            AbstractC32273e3.m155748Q().mo155914r2();
            C32319o.m156293t().m156323l0();
            C22592c m156362c = m156358e().m156362c();
            m156358e().m156366j();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("groupId", m102341J.m102368F());
            jSONObject.put("duration", m156358e().m156363d());
            jSONObject.put("status", m156362c.m116891h());
            AbstractC32273e3.m155748Q().mo155875e0(m102341J.m102449x(), m102341J.m102372H(), m102341J.m102388Q(), 1, m102341J.m102390R(), jSONObject.toString());
            m102341J.m102389Q0(0L);
            if (m156362c().m116866P()) {
            }
            this.f149249b.m156378e();
            AbstractC23304d.f113366b3 = mo155833O;
            AbstractC32273e3.m155748Q().m155882g1();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public synchronized C22592c m156362c() {
        return this.f149248a;
    }

    /* renamed from: d */
    public int m156363d() {
        long m116881c = this.f149248a.m116881c();
        if (m116881c < 0 || m116881c >= 500000) {
            try {
                long m102447w = C19577z.m102341J().m102447w();
                if (m102447w != 0) {
                    m116881c = (int) ((SystemClock.elapsedRealtime() - m102447w) / 1000);
                }
            } catch (Exception unused) {
            }
            if (m116881c < 0 || m116881c >= 500000) {
                m116881c = 0;
            }
        }
        return (int) m116881c;
    }

    /* renamed from: g */
    public void m156364g() {
        AbstractC32273e3.m155748Q().m155882g1();
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public int getCPUUsage() {
        return 0;
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public int getNetworkType() {
        return AbstractC3106r.m15709b(AbstractC3096i0.m15574y());
    }

    /* renamed from: h */
    public void m156365h(boolean z11) {
        this.f149248a.m116872V(z11);
    }

    /* renamed from: j */
    public synchronized void m156366j() {
        C22592c c22592c = this.f149248a;
        if (c22592c == null) {
            return;
        }
        try {
            c22592c.m116855J0(true);
            m156360i(this.f149248a);
        } catch (Exception unused) {
            AbstractC3082b0.m15422d("ZaloGroupCallback", "updateCurrentCallInfoFromNative failed");
        }
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onCallAudioState(int i11, int i12) {
        AbstractC3082b0.m15421c("ZaloGroupCallback", "onCallAudioState: partnerId: " + i11 + " state: " + i12);
        if (i12 == EnumC17851j.PRE_START_DEVICE.ordinal()) {
            VoipAudioHelper.m155571S0(VoipAudioHelper.m155554K());
        }
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onCallAutoHangup() {
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onCallConfirmed() {
        AbstractC3082b0.m15421c("ZaloGroupCallback", "onCallConfirmed");
        if (this.f149248a == null) {
            return;
        }
        try {
            m156366j();
            this.f149249b.m156380g(1);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZaloGroupCallback", "onCallConfirmed failed", e11);
        }
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onCallEnd() {
        AbstractC3082b0.m15421c("ZaloGroupCallback", "onCallEnd");
        C22592c c22592c = this.f149248a;
        if (c22592c != null && c22592c.m116925y()) {
            m156366j();
            this.f149249b.m156379f();
            m156361b();
        }
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onCallErr(int i11) {
        AbstractC3082b0.m15424f("ZaloGroupCallback", "onCallErr: " + i11);
        if (i11 == -24) {
            HandlerC32324p.m156351d(new b());
            return;
        }
        if (i11 != -25 && i11 != -26) {
            if (i11 == -30 || i11 == -31) {
                HandlerC32324p.m156351d(new d());
                return;
            }
            return;
        }
        HandlerC32324p.m156351d(new c());
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onCallInit() {
        AbstractC3082b0.m15424f("ZaloGroupCallback", "onCallInit");
        C22592c c22592c = this.f149248a;
        if (c22592c != null && c22592c.m116870T()) {
            return;
        }
        try {
            m156366j();
            C32318n3.m156214E().m156258V();
            C23744a.m124114c().m124116d(10036, new Object[0]);
            this.f149249b.m156375a();
            if (!this.f149248a.m116842D() && !AbstractC3096i0.f13163g) {
                C19577z.m102341J().m102361B0(new C19548i(452));
            }
            this.f149249b.m156380g(1);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZaloGroupCallback", "onCallInit: " + e11.getMessage(), e11);
        }
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onCallJoinMeetingFailed(int i11) {
        AbstractC3082b0.m15424f("ZaloGroupCallback", "onCallJoinMeetingFailed: " + i11);
        C19577z.m102341J().m102361B0(new C19569s0(5, i11));
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onCallJoinMeetingSuccess(String str, String str2) {
        AbstractC3082b0.m15424f("ZaloGroupCallback", "onCallJoinMeetingSuccess: cmd = 451, server = " + str + " - " + str2);
        try {
            m156366j();
            if (this.f149248a.m116842D()) {
                C19577z.m102341J().m102434o1(str, str2, null);
                C19577z.m102341J().m102361B0(new C19567r0(str, str2));
            } else {
                C19577z.m102341J().m102361B0(new C19548i(454));
            }
            this.f149249b.m156380g(1);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZaloGroupCallback", "onCallJoinMeetingSuccess: ", e11);
        }
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onCallLog(String str) {
        AbstractC3082b0.m15424f("onGroupCallLog", str);
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onCallQualityChanged(int i11, int i12, int i13) {
        AbstractC3082b0.m15421c("ZaloGroupCallback", "onCallQualityChanged: quality: " + i12);
        try {
            m156366j();
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("ZaloGroupCallback", "onCallQualityChanged quality: " + i12, e11);
        }
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onCallStats(String str) {
        try {
            if (AbstractC32273e3.m155748Q().m155815J0()) {
                C23744a.m124114c().m124116d(ZAbstractBase.ZVU_BLEND_GEN_THUMB, str);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onCallVideoState(int i11, int i12) {
        AbstractC3082b0.m15424f("ZaloGroupCallback", "onCallVideoState: partnerId: " + i11 + " state: " + i12);
        C22592c c22592c = this.f149248a;
        if (c22592c != null && c22592c.m116925y()) {
            try {
                m156366j();
                if (i12 != EnumC17859r.START_CAPTURE.ordinal() && i12 != EnumC17859r.STOP_CAPTURE.ordinal() && i12 != EnumC17859r.SWITCH_CAMERA.ordinal() && i12 != EnumC17859r.SWITCH_CAMERA_FRONT.ordinal() && i12 != EnumC17859r.SWITCH_CAMERA_BACK.ordinal()) {
                    if (i12 != EnumC17859r.PARTNER_AUTO_START_CAPTURE.ordinal() && i12 != EnumC17859r.PARTNER_AUTO_STOP_CAPTURE.ordinal() && i12 != EnumC17859r.PARTNER_MANUAL_START_CAPTURE.ordinal() && i12 != EnumC17859r.PARTNER_MANUAL_STOP_CAPTURE.ordinal()) {
                        if (i12 != EnumC17859r.DETECT_LOSS_VIDEO.ordinal() && i12 != EnumC17859r.DETECT_RECEIVE_VIDEO.ordinal()) {
                            this.f149249b.m156380g(5);
                            if (i12 == EnumC17859r.AUTO_STOP_CAPTURE.ordinal()) {
                                AbstractC32273e3.m155748Q().mo155809H2(2, "", 5);
                                C23744a.m124114c().m124116d(1004, new Object[0]);
                            }
                        }
                        this.f149249b.m156381h(8, Integer.valueOf(i12));
                    }
                    this.f149249b.m156381h(7, Integer.valueOf(i12));
                }
                this.f149249b.m156381h(6, Integer.valueOf(i12));
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("ZaloGroupCallback", "onCallVideoState state: " + i12, e11);
            }
        }
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onPartnerJoinCall(int i11) {
        AbstractC3082b0.m15424f("ZaloGroupCallback", "onPartnerJoinCall: " + i11);
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onPartnerLeaveCall(int i11, int i12) {
        AbstractC3082b0.m15424f("ZaloGroupCallback", "onPartnerLeaveCall: " + i11 + " reason: " + i12);
    }

    @Override // com.vng.zing.vn.zrtc.GroupCallback
    public void onPartnerSpeakingStateChanged(String str) {
    }

    private C32328p3() {
        super(AbstractC3096i0.m15574y());
        this.f149248a = new C22592c();
        this.f149249b = new a();
    }
}
