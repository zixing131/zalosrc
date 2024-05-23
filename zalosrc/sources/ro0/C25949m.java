package ro0;

import org.json.JSONObject;

/* renamed from: ro0.m */
/* loaded from: classes7.dex */
public class C25949m {

    /* renamed from: A */
    public int f123741A;

    /* renamed from: A0 */
    public int f123742A0;

    /* renamed from: B */
    public int f123743B;

    /* renamed from: B0 */
    public int f123744B0;

    /* renamed from: C */
    public int f123745C;

    /* renamed from: C0 */
    public int f123746C0;

    /* renamed from: D */
    public int f123747D;

    /* renamed from: D0 */
    public int f123748D0;

    /* renamed from: E */
    public int f123749E;

    /* renamed from: E0 */
    public int f123750E0;

    /* renamed from: F */
    public int f123751F;

    /* renamed from: F0 */
    public int f123752F0;

    /* renamed from: G */
    public int f123753G;

    /* renamed from: G0 */
    public int f123754G0;

    /* renamed from: H */
    public int f123755H;

    /* renamed from: I */
    public int f123757I;

    /* renamed from: J */
    public int f123759J;

    /* renamed from: K */
    public int f123761K;

    /* renamed from: L */
    public int f123762L;

    /* renamed from: M */
    public int f123763M;

    /* renamed from: N */
    public int f123764N;

    /* renamed from: O */
    public int f123765O;

    /* renamed from: P */
    public int f123766P;

    /* renamed from: Q */
    public int f123767Q;

    /* renamed from: R */
    public int f123768R;

    /* renamed from: S */
    public int f123769S;

    /* renamed from: T */
    public int f123770T;

    /* renamed from: U */
    public int f123771U;

    /* renamed from: V */
    public int f123772V;

    /* renamed from: W */
    public int f123773W;

    /* renamed from: X */
    public int f123774X;

    /* renamed from: Y */
    public int f123775Y;

    /* renamed from: Z */
    public int f123776Z;

    /* renamed from: a */
    public int f123777a;

    /* renamed from: a0 */
    public int f123778a0;

    /* renamed from: b */
    public int f123779b;

    /* renamed from: b0 */
    public int f123780b0;

    /* renamed from: c */
    public int f123781c;

    /* renamed from: c0 */
    public int f123782c0;

    /* renamed from: d */
    public int f123783d;

    /* renamed from: d0 */
    public int f123784d0;

    /* renamed from: e */
    public int f123785e;

    /* renamed from: e0 */
    public int f123786e0;

    /* renamed from: f */
    public int f123787f;

    /* renamed from: f0 */
    public int f123788f0;

    /* renamed from: g */
    public int f123789g;

    /* renamed from: g0 */
    public int f123790g0;

    /* renamed from: h */
    public int f123791h;

    /* renamed from: h0 */
    public int f123792h0;

    /* renamed from: i */
    public int f123793i;

    /* renamed from: i0 */
    public String f123794i0;

    /* renamed from: j */
    public int f123795j;

    /* renamed from: j0 */
    public String f123796j0;

    /* renamed from: k */
    public int f123797k;

    /* renamed from: k0 */
    public String f123798k0;

    /* renamed from: l */
    public int f123799l;

    /* renamed from: l0 */
    public int f123800l0;

    /* renamed from: m */
    public int f123801m;

    /* renamed from: m0 */
    public int f123802m0;

    /* renamed from: n */
    public int f123803n;

    /* renamed from: n0 */
    public int f123804n0;

    /* renamed from: o */
    public int f123805o;

    /* renamed from: o0 */
    public int f123806o0;

    /* renamed from: p */
    public int f123807p;

    /* renamed from: p0 */
    public int f123808p0;

    /* renamed from: q */
    public int f123809q;

    /* renamed from: q0 */
    public int f123810q0;

    /* renamed from: r */
    public int f123811r;

    /* renamed from: r0 */
    public int f123812r0;

    /* renamed from: s */
    public int f123813s;

    /* renamed from: s0 */
    public int f123814s0;

    /* renamed from: t */
    public int f123815t;

    /* renamed from: t0 */
    public int f123816t0;

    /* renamed from: u */
    public int f123817u;

    /* renamed from: u0 */
    public int f123818u0;

    /* renamed from: v */
    public int f123819v;

    /* renamed from: v0 */
    public int f123820v0;

    /* renamed from: w */
    public int f123821w;

    /* renamed from: w0 */
    public int f123822w0;

    /* renamed from: x */
    public int f123823x;

    /* renamed from: x0 */
    public int f123824x0;

    /* renamed from: y */
    public int f123825y;

    /* renamed from: y0 */
    public int f123826y0;

    /* renamed from: z */
    public int f123827z;

    /* renamed from: z0 */
    public int f123828z0;

    /* renamed from: H0 */
    public int f123756H0 = 0;

    /* renamed from: I0 */
    public int f123758I0 = 0;

    /* renamed from: J0 */
    public String f123760J0 = "";

    /* renamed from: b */
    private int m133683b(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getInt(str);
        }
        return 0;
    }

    /* renamed from: c */
    private String m133684c(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return "";
    }

    /* renamed from: a */
    public boolean m133685a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f123777a = m133683b(jSONObject, "rtt");
            this.f123779b = m133683b(jSONObject, "audioDelayEstimate");
            this.f123781c = m133683b(jSONObject, "videoDelayEstimate");
            this.f123783d = m133683b(jSONObject, "inputBw");
            this.f123785e = m133683b(jSONObject, "outputBw");
            this.f123787f = m133683b(jSONObject, "inputVideoBw");
            this.f123789g = m133683b(jSONObject, "inputAudioBw");
            this.f123791h = m133683b(jSONObject, "outputAudioBw");
            this.f123793i = m133683b(jSONObject, "outputVideoBw");
            this.f123795j = m133683b(jSONObject, "outputNormalFrameSize");
            this.f123797k = m133683b(jSONObject, "outputKeyFrameSize");
            this.f123799l = m133683b(jSONObject, "inputNormalFrameSize");
            this.f123801m = m133683b(jSONObject, "inputKeyFrameSize");
            this.f123803n = m133683b(jSONObject, "videoEncodeTime");
            this.f123805o = m133683b(jSONObject, "videoDecodeTime");
            this.f123807p = m133683b(jSONObject, "vidEncCodecId");
            this.f123809q = m133683b(jSONObject, "vidDecCodecId");
            this.f123811r = m133683b(jSONObject, "vidHwEnc");
            this.f123813s = m133683b(jSONObject, "vidHwDec");
            this.f123815t = m133683b(jSONObject, "videoEncodeDelayTime");
            this.f123817u = m133683b(jSONObject, "levelIdc");
            this.f123819v = m133683b(jSONObject, "audioPacketLoss");
            this.f123821w = m133683b(jSONObject, "remoteAudioLoss");
            this.f123823x = m133683b(jSONObject, "totalAudioLoss");
            this.f123825y = m133683b(jSONObject, "audioEncodeTime");
            this.f123827z = m133683b(jSONObject, "videoFps");
            this.f123741A = m133683b(jSONObject, "videoWidth");
            this.f123743B = m133683b(jSONObject, "videoHeight");
            this.f123747D = m133683b(jSONObject, "totalVideoNack");
            this.f123749E = m133683b(jSONObject, "totalAudioNack");
            this.f123751F = m133683b(jSONObject, "videoNackPktUpload");
            this.f123753G = m133683b(jSONObject, "audioNackPktUpload");
            this.f123755H = m133683b(jSONObject, "videoNackBwUpload");
            this.f123757I = m133683b(jSONObject, "audioNackBwUpload");
            this.f123759J = m133683b(jSONObject, "audioFecBwUp");
            this.f123761K = m133683b(jSONObject, "audioFecBwDown");
            this.f123745C = m133683b(jSONObject, "renderQueueSize");
            this.f123762L = m133683b(jSONObject, "captureWidth");
            this.f123763M = m133683b(jSONObject, "captureHeight");
            this.f123764N = m133683b(jSONObject, "captureFps");
            this.f123765O = m133683b(jSONObject, "encodeFps");
            this.f123766P = m133683b(jSONObject, "recordFps");
            this.f123767Q = m133683b(jSONObject, "playoutFps");
            this.f123768R = m133683b(jSONObject, "sendBwEstimate");
            this.f123769S = m133683b(jSONObject, "sendVideoBitrate");
            this.f123770T = m133683b(jSONObject, "remoteBwEstimate");
            this.f123771U = m133683b(jSONObject, "audioSendBwEstimate");
            this.f123772V = m133683b(jSONObject, "encodeWidth");
            this.f123773W = m133683b(jSONObject, "encodeHeight");
            this.f123774X = m133683b(jSONObject, "audioBitrate");
            this.f123775Y = m133683b(jSONObject, "audioUpPacketRate");
            this.f123776Z = m133683b(jSONObject, "videoUpPacketRate");
            this.f123778a0 = m133683b(jSONObject, "audioPacketPerSec");
            this.f123780b0 = m133683b(jSONObject, "videoPacketPerSec");
            this.f123782c0 = m133683b(jSONObject, "videoRtcpPacketRate");
            this.f123784d0 = m133683b(jSONObject, "audioRtcpPacketRate");
            this.f123790g0 = m133683b(jSONObject, "audioRtt");
            this.f123792h0 = m133683b(jSONObject, "videoRtt");
            this.f123794i0 = m133684c(jSONObject, "rtpServer");
            this.f123796j0 = m133684c(jSONObject, "partnerServer");
            this.f123798k0 = m133684c(jSONObject, "p2pAddress");
            this.f123800l0 = m133683b(jSONObject, "localFTime");
            this.f123802m0 = m133683b(jSONObject, "partnerFTime");
            this.f123804n0 = m133683b(jSONObject, "vidPartnerRenderFps");
            this.f123806o0 = m133683b(jSONObject, "vidKeyFrameEncode");
            this.f123808p0 = m133683b(jSONObject, "vidKeyFrameDecode");
            this.f123810q0 = m133683b(jSONObject, "initNewServer");
            this.f123812r0 = m133683b(jSONObject, "cacheServerType");
            this.f123814s0 = m133683b(jSONObject, "inputLevel");
            this.f123816t0 = m133683b(jSONObject, "outputLevel");
            this.f123742A0 = m133683b(jSONObject, "lossRatioAfterFEC");
            this.f123828z0 = m133683b(jSONObject, "lossRatioBeforeFEC");
            this.f123818u0 = m133683b(jSONObject, "fecTPMode");
            this.f123820v0 = m133683b(jSONObject, "fecTransportEnable");
            this.f123822w0 = m133683b(jSONObject, "fecTransportNoData");
            this.f123826y0 = m133683b(jSONObject, "isReceivingFEC");
            this.f123744B0 = m133683b(jSONObject, "fecMaxDurationInCall");
            this.f123824x0 = m133683b(jSONObject, "fecTransportNoParity");
            this.f123746C0 = m133683b(jSONObject, "fecTotalSentPacket");
            this.f123748D0 = m133683b(jSONObject, "fecTotalReceivePacket");
            this.f123750E0 = m133683b(jSONObject, "fecTotalRecoverPacket");
            this.f123752F0 = m133683b(jSONObject, "serverType");
            this.f123754G0 = m133683b(jSONObject, "partnerServerType");
            this.f123786e0 = m133683b(jSONObject, "bwProfileId");
            this.f123788f0 = m133683b(jSONObject, "encLevel");
            this.f123756H0 = m133683b(jSONObject, "srtpMode");
            this.f123758I0 = m133683b(jSONObject, "srtpRTCP");
            this.f123760J0 = m133684c(jSONObject, "serverDebug");
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
