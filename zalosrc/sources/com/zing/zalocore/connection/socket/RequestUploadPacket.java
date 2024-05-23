package com.zing.zalocore.connection.socket;

import com.zing.zalo.utils.Keep;
import java.util.Hashtable;

/* loaded from: classes7.dex */
public class RequestUploadPacket extends RequestPacket {

    /* renamed from: A */
    private long f89341A;

    /* renamed from: B */
    private String f89342B;

    /* renamed from: C */
    private byte f89343C;

    /* renamed from: D */
    private byte f89344D;

    /* renamed from: E */
    private byte f89345E;

    /* renamed from: G */
    private long f89347G;

    /* renamed from: H */
    private long f89348H;

    /* renamed from: I */
    private int f89349I;

    /* renamed from: J */
    private String f89350J;

    /* renamed from: K */
    private String f89351K;

    /* renamed from: L */
    private String f89352L;

    /* renamed from: M */
    private String f89353M;

    /* renamed from: O */
    public int f89355O;

    /* renamed from: P */
    public int f89356P;

    /* renamed from: R */
    private byte f89358R;

    @Keep
    public byte[] mExtParams;

    @Keep
    public byte[] mFirstParams;

    @Keep
    public byte[] mIp;

    @Keep
    public byte[] mSecondParams;

    @Keep
    public byte[] mSubParams;

    @Keep
    public byte[] mTrackingData;

    /* renamed from: u */
    private String f89359u;

    /* renamed from: v */
    private String f89360v;

    /* renamed from: w */
    private long f89361w;

    /* renamed from: z */
    private int f89364z;

    /* renamed from: x */
    private int f89362x = 0;

    /* renamed from: y */
    private int f89363y = 0;

    /* renamed from: F */
    private byte f89346F = 1;

    /* renamed from: N */
    private byte f89354N = 0;

    /* renamed from: Q */
    Hashtable f89357Q = new Hashtable();

    /* renamed from: I */
    public void m93305I(byte b11) {
        this.f89346F = b11;
    }

    /* renamed from: J */
    public void m93306J(long j11) {
        this.f89361w = j11;
    }

    /* renamed from: K */
    public void m93307K(int i11) {
        this.f89355O = i11;
    }

    /* renamed from: L */
    public void m93308L(long j11) {
        this.f89347G = j11;
    }

    /* renamed from: M */
    public void m93309M(boolean z11) {
        this.f89337q = z11 ? (byte) 1 : (byte) 0;
    }

    /* renamed from: N */
    public void m93310N(byte[] bArr) {
        this.mExtParams = bArr;
    }

    /* renamed from: O */
    public void m93311O(String str) {
        this.f89360v = str;
    }

    /* renamed from: P */
    public void m93312P(String str) {
        this.f89359u = str;
    }

    /* renamed from: Q */
    public void m93313Q(long j11) {
        this.f89341A = j11;
    }

    /* renamed from: R */
    public void m93314R(byte[] bArr) {
        this.mFirstParams = bArr;
    }

    /* renamed from: S */
    public void m93315S(Hashtable hashtable) {
        this.f89357Q.putAll(hashtable);
    }

    /* renamed from: T */
    public void m93316T(int i11) {
        this.f89363y = i11;
    }

    /* renamed from: U */
    public void m93317U(byte[] bArr) {
        this.mIp = bArr;
    }

    /* renamed from: V */
    public void m93318V(byte b11) {
        this.f89354N = b11;
    }

    /* renamed from: W */
    public void m93319W(byte b11) {
        this.f89344D = b11;
    }

    /* renamed from: X */
    public void m93320X(byte b11) {
        this.f89343C = b11;
    }

    /* renamed from: Y */
    public void m93321Y(byte b11) {
        this.f89358R = b11;
    }

    /* renamed from: Z */
    public void m93322Z(byte b11) {
        this.f89345E = b11;
    }

    /* renamed from: a0 */
    public void m93323a0(long j11) {
        this.f89348H = j11;
    }

    /* renamed from: b0 */
    public void m93324b0(String str) {
        this.f89352L = str;
    }

    /* renamed from: c0 */
    public void m93325c0(String str) {
        this.f89350J = str;
    }

    /* renamed from: d0 */
    public void m93326d0(int i11) {
        this.f89349I = i11;
    }

    /* renamed from: e0 */
    public void m93327e0(String str) {
        this.f89353M = str;
    }

    /* renamed from: f0 */
    public void m93328f0(String str) {
        this.f89351K = str;
    }

    /* renamed from: g0 */
    public void m93329g0(byte[] bArr) {
        this.mSecondParams = bArr;
    }

    @Keep
    public long gci() {
        return this.f89361w;
    }

    @Keep
    public int gcl() {
        return this.f89355O;
    }

    @Keep
    public byte gcr() {
        return this.f89346F;
    }

    @Keep
    public long gct() {
        return this.f89347G;
    }

    @Keep
    public int gepl() {
        byte[] bArr = this.mExtParams;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    @Keep
    public String gfn() {
        String str = this.f89360v;
        return str == null ? "" : str;
    }

    @Keep
    public String gfp() {
        String str = this.f89359u;
        return str == null ? "" : str;
    }

    @Keep
    public int gfpl() {
        byte[] bArr = this.mFirstParams;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    @Keep
    public long gfs() {
        return this.f89341A;
    }

    @Keep
    /* renamed from: gh */
    public int m93330gh() {
        return this.f89363y;
    }

    @Keep
    public Object ghm() {
        return this.f89357Q;
    }

    @Keep
    public byte gicu() {
        return this.f89354N;
    }

    @Keep
    public byte gie() {
        return this.f89344D;
    }

    @Keep
    public byte gih() {
        return this.f89343C;
    }

    @Keep
    public byte gij() {
        return this.f89358R;
    }

    @Keep
    public int gil() {
        byte[] bArr = this.mIp;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    @Keep
    public byte gir() {
        return this.f89345E;
    }

    @Keep
    public long gmot() {
        return this.f89348H;
    }

    @Keep
    public String gogl() {
        String str = this.f89352L;
        return str == null ? "" : str;
    }

    @Keep
    public String gop() {
        String str = this.f89350J;
        return str == null ? "" : str;
    }

    @Keep
    public String grl() {
        String str = this.f89353M;
        return str == null ? "" : str;
    }

    @Keep
    public String grp() {
        String str = this.f89351K;
        return str == null ? "" : str;
    }

    @Keep
    public int grt() {
        return this.f89349I;
    }

    @Keep
    public int gslp() {
        byte[] bArr = this.mSecondParams;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    @Keep
    public int gspl() {
        byte[] bArr = this.mSubParams;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    @Keep
    public int gtgw() {
        return this.f89364z;
    }

    @Keep
    public int gtpl() {
        byte[] bArr = this.mTrackingData;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    @Keep
    public int gtrs() {
        return this.f89356P;
    }

    @Keep
    public String gvd() {
        String str = this.f89342B;
        return str == null ? "" : str;
    }

    @Keep
    /* renamed from: gw */
    public int m93331gw() {
        return this.f89362x;
    }

    /* renamed from: h0 */
    public void m93332h0(byte[] bArr) {
        this.mSubParams = bArr;
    }

    /* renamed from: i0 */
    public void m93333i0(int i11) {
        this.f89364z = i11;
    }

    /* renamed from: j0 */
    public void m93334j0(byte[] bArr) {
        this.mTrackingData = bArr;
    }

    /* renamed from: k0 */
    public void m93335k0(int i11) {
        this.f89356P = i11;
    }

    /* renamed from: l0 */
    public void m93336l0(String str) {
        this.f89342B = str;
    }

    /* renamed from: m0 */
    public void m93337m0(int i11) {
        this.f89362x = i11;
    }
}
