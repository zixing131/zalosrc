package com.zing.zalo.p077ui.toolstorage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import dj.C17945a0;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import p461qu.AbstractC25495a;
import qm0.AbstractC25378x;

/* loaded from: classes6.dex */
public final class ThreadStorageInfo implements Parcelable {

    /* renamed from: A */
    private long f68437A;

    /* renamed from: B */
    private long f68438B;

    /* renamed from: C */
    private long f68439C;

    /* renamed from: D */
    private long f68440D;

    /* renamed from: E */
    private long f68441E;

    /* renamed from: F */
    private long f68442F;

    /* renamed from: G */
    private long f68443G;

    /* renamed from: H */
    private ArrayList f68444H;

    /* renamed from: I */
    private List f68445I;

    /* renamed from: J */
    private int f68446J;

    /* renamed from: p */
    private String f68447p;

    /* renamed from: q */
    private String f68448q;

    /* renamed from: r */
    private String f68449r;

    /* renamed from: s */
    private long f68450s;

    /* renamed from: t */
    private long f68451t;

    /* renamed from: u */
    private long f68452u;

    /* renamed from: v */
    private long f68453v;

    /* renamed from: w */
    private long f68454w;

    /* renamed from: x */
    private long f68455x;

    /* renamed from: y */
    private long f68456y;

    /* renamed from: z */
    private long f68457z;
    public static final C13327a Companion = new C13327a(null);
    public static final Parcelable.Creator<ThreadStorageInfo> CREATOR = new C13328b();

    /* renamed from: com.zing.zalo.ui.toolstorage.ThreadStorageInfo$a */
    /* loaded from: classes6.dex */
    public static final class C13327a {
        private C13327a() {
        }

        public /* synthetic */ C13327a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ThreadStorageInfo m74823a(String str, String str2, String str3, long j11) {
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(str2, "contactName");
            AbstractC19074t.m100208f(str3, "avatarUrl");
            ThreadStorageInfo threadStorageInfo = new ThreadStorageInfo(null, null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 262143, null);
            threadStorageInfo.f68447p = str;
            threadStorageInfo.f68448q = str2;
            threadStorageInfo.f68449r = str3;
            threadStorageInfo.f68450s = j11;
            return threadStorageInfo;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.ThreadStorageInfo$b */
    /* loaded from: classes6.dex */
    public static final class C13328b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ThreadStorageInfo createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ThreadStorageInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ThreadStorageInfo[] newArray(int i11) {
            return new ThreadStorageInfo[i11];
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.ThreadStorageInfo$c */
    /* loaded from: classes6.dex */
    static final class C13329c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C13380a f68458q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13329c(C13380a c13380a) {
            super(1);
            this.f68458q = c13380a;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C17945a0 c17945a0) {
            String str;
            AbstractC19074t.m100208f(c17945a0, "msg");
            String m94983Q3 = c17945a0.m94983Q3();
            C17945a0 m75089k = this.f68458q.m75089k();
            if (m75089k != null) {
                str = m75089k.m94983Q3();
            } else {
                str = null;
            }
            return Boolean.valueOf(AbstractC19074t.m100204b(m94983Q3, str));
        }
    }

    public ThreadStorageInfo(String str, String str2, String str3, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "userName");
        AbstractC19074t.m100208f(str3, "avatarUrl");
        this.f68447p = str;
        this.f68448q = str2;
        this.f68449r = str3;
        this.f68450s = j11;
        this.f68451t = j12;
        this.f68452u = j13;
        this.f68453v = j14;
        this.f68454w = j15;
        this.f68455x = j16;
        this.f68456y = j17;
        this.f68457z = j18;
        this.f68437A = j19;
        this.f68438B = j21;
        this.f68439C = j22;
        this.f68440D = j23;
        this.f68441E = j24;
        this.f68442F = j25;
        this.f68443G = j26;
        this.f68444H = new ArrayList();
    }

    /* renamed from: B */
    public final long m74767B() {
        return this.f68453v;
    }

    /* renamed from: C */
    public final long m74768C() {
        return this.f68454w;
    }

    /* renamed from: D */
    public final int m74769D() {
        return this.f68446J;
    }

    /* renamed from: F */
    public final long m74770F() {
        return this.f68451t;
    }

    /* renamed from: H */
    public final long m74771H() {
        return this.f68437A + this.f68439C + this.f68441E;
    }

    /* renamed from: I */
    public final long m74772I() {
        return this.f68454w;
    }

    /* renamed from: J */
    public final long m74773J() {
        return this.f68456y;
    }

    /* renamed from: K */
    public final long m74774K() {
        return this.f68442F;
    }

    /* renamed from: M */
    public final long m74775M() {
        return this.f68443G;
    }

    /* renamed from: N */
    public final long m74776N() {
        return m74772I() + m74773J() + m74771H();
    }

    /* renamed from: O */
    public final long m74777O() {
        return m74770F() + m74776N() + this.f68443G;
    }

    /* renamed from: Q */
    public final String m74778Q() {
        return this.f68449r;
    }

    /* renamed from: R */
    public final String m74779R() {
        return this.f68448q;
    }

    /* renamed from: S */
    public final long m74780S() {
        return this.f68457z;
    }

    /* renamed from: T */
    public final long m74781T() {
        return this.f68437A;
    }

    /* renamed from: U */
    public final long m74782U() {
        return this.f68455x;
    }

    /* renamed from: V */
    public final long m74783V() {
        return this.f68456y;
    }

    /* renamed from: W */
    public final boolean m74784W() {
        return AbstractC25495a.m132079d(m74822z());
    }

    /* renamed from: X */
    public final void m74785X(long j11) {
        this.f68451t = j11;
    }

    /* renamed from: Y */
    public final void m74786Y(long j11) {
        this.f68438B = j11;
    }

    /* renamed from: Z */
    public final void m74787Z(long j11) {
        this.f68439C = j11;
    }

    /* renamed from: a0 */
    public final void m74788a0(ArrayList arrayList) {
        this.f68445I = arrayList;
    }

    /* renamed from: b0 */
    public final void m74789b0(long j11) {
        this.f68450s = j11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void m74790e() {
        this.f68454w = 0L;
        this.f68453v = 0L;
        this.f68456y = 0L;
        this.f68455x = 0L;
        this.f68437A = 0L;
        this.f68457z = 0L;
        this.f68439C = 0L;
        this.f68438B = 0L;
        this.f68440D = 0L;
        this.f68441E = 0L;
    }

    /* renamed from: e0 */
    public final void m74791e0(long j11) {
        this.f68440D = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreadStorageInfo)) {
            return false;
        }
        ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) obj;
        return AbstractC19074t.m100204b(this.f68447p, threadStorageInfo.f68447p) && AbstractC19074t.m100204b(this.f68448q, threadStorageInfo.f68448q) && AbstractC19074t.m100204b(this.f68449r, threadStorageInfo.f68449r) && this.f68450s == threadStorageInfo.f68450s && this.f68451t == threadStorageInfo.f68451t && this.f68452u == threadStorageInfo.f68452u && this.f68453v == threadStorageInfo.f68453v && this.f68454w == threadStorageInfo.f68454w && this.f68455x == threadStorageInfo.f68455x && this.f68456y == threadStorageInfo.f68456y && this.f68457z == threadStorageInfo.f68457z && this.f68437A == threadStorageInfo.f68437A && this.f68438B == threadStorageInfo.f68438B && this.f68439C == threadStorageInfo.f68439C && this.f68440D == threadStorageInfo.f68440D && this.f68441E == threadStorageInfo.f68441E && this.f68442F == threadStorageInfo.f68442F && this.f68443G == threadStorageInfo.f68443G;
    }

    /* renamed from: f */
    public final void m74792f() {
        this.f68451t = 0L;
        this.f68452u = 0L;
        this.f68442F = 0L;
        this.f68443G = 0L;
        m74790e();
    }

    /* renamed from: g */
    public final void m74793g(C13380a c13380a) {
        if (c13380a != null) {
            AbstractC25378x.m131542D(this.f68444H, new C13329c(c13380a));
            if (c13380a.m75097s() || c13380a.m75071A()) {
                this.f68454w -= c13380a.m75087i();
            }
            if (c13380a.m75075E()) {
                this.f68437A -= c13380a.m75087i();
            }
            if (c13380a.m75100v()) {
                this.f68439C -= c13380a.m75087i();
            }
            if (c13380a.m75076F()) {
                this.f68456y -= c13380a.m75087i();
            }
        }
    }

    /* renamed from: g0 */
    public final void m74794g0(long j11) {
        this.f68441E = j11;
    }

    /* renamed from: h */
    public final long m74795h() {
        return m74807n() + this.f68442F;
    }

    /* renamed from: h0 */
    public final void m74796h0(long j11) {
        this.f68453v = j11;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f68447p.hashCode() * 31) + this.f68448q.hashCode()) * 31) + this.f68449r.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f68450s)) * 31) + AbstractC2147g0.m11521a(this.f68451t)) * 31) + AbstractC2147g0.m11521a(this.f68452u)) * 31) + AbstractC2147g0.m11521a(this.f68453v)) * 31) + AbstractC2147g0.m11521a(this.f68454w)) * 31) + AbstractC2147g0.m11521a(this.f68455x)) * 31) + AbstractC2147g0.m11521a(this.f68456y)) * 31) + AbstractC2147g0.m11521a(this.f68457z)) * 31) + AbstractC2147g0.m11521a(this.f68437A)) * 31) + AbstractC2147g0.m11521a(this.f68438B)) * 31) + AbstractC2147g0.m11521a(this.f68439C)) * 31) + AbstractC2147g0.m11521a(this.f68440D)) * 31) + AbstractC2147g0.m11521a(this.f68441E)) * 31) + AbstractC2147g0.m11521a(this.f68442F)) * 31) + AbstractC2147g0.m11521a(this.f68443G);
    }

    /* renamed from: i */
    public final long m74797i() {
        return m74771H() + this.f68443G;
    }

    /* renamed from: i0 */
    public final void m74798i0(long j11) {
        this.f68454w = j11;
    }

    /* renamed from: j */
    public final ArrayList m74799j() {
        return this.f68444H;
    }

    /* renamed from: j0 */
    public final void m74800j0(int i11) {
        this.f68446J = i11;
    }

    /* renamed from: k */
    public final long m74801k() {
        return this.f68453v + this.f68457z + this.f68438B + this.f68455x;
    }

    /* renamed from: k0 */
    public final void m74802k0(long j11) {
        this.f68442F = j11;
    }

    /* renamed from: l */
    public final long m74803l() {
        return this.f68454w + this.f68437A + this.f68439C + this.f68456y;
    }

    /* renamed from: l0 */
    public final void m74804l0(long j11) {
        this.f68443G = j11;
    }

    /* renamed from: m */
    public final long m74805m() {
        return this.f68452u;
    }

    /* renamed from: m0 */
    public final void m74806m0(long j11) {
        this.f68452u = j11;
    }

    /* renamed from: n */
    public final long m74807n() {
        return this.f68457z + this.f68438B + this.f68440D;
    }

    /* renamed from: n0 */
    public final void m74808n0(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f68449r = str;
    }

    /* renamed from: o */
    public final long m74809o() {
        return this.f68453v;
    }

    /* renamed from: o0 */
    public final void m74810o0(String str) {
        AbstractC19074t.m100208f(str, "name");
        this.f68448q = str;
    }

    /* renamed from: p */
    public final long m74811p() {
        return this.f68455x;
    }

    /* renamed from: p0 */
    public final void m74812p0(long j11) {
        this.f68457z = j11;
    }

    /* renamed from: q */
    public final long m74813q() {
        return this.f68438B;
    }

    /* renamed from: q0 */
    public final void m74814q0(long j11) {
        this.f68437A = j11;
    }

    /* renamed from: r0 */
    public final void m74815r0(long j11) {
        this.f68455x = j11;
    }

    /* renamed from: t */
    public final long m74816t() {
        return this.f68439C;
    }

    /* renamed from: t0 */
    public final void m74817t0(long j11) {
        this.f68456y = j11;
    }

    public String toString() {
        return "ThreadStorageInfo(uid='" + this.f68447p + "', userName='" + this.f68448q + "', dbSize=" + this.f68451t + ", totalMsgCount=" + this.f68452u + ", totalMediaSize=" + m74776N() + ", photoCount=" + this.f68453v + ", photoSize=" + this.f68454w + ", voiceCount=" + this.f68455x + ", voiceSize=" + this.f68456y + ", videoCount=" + this.f68457z + ", videoSize=" + this.f68437A + ", fileCount=" + this.f68438B + ", fileSize=" + this.f68439C + ", otherResourcesCount=" + this.f68440D + ", otherResourcesSize=" + this.f68441E + "skipOtherResourceCount=" + this.f68442F + "skipOtherResourceSize=" + this.f68443G + ")";
    }

    /* renamed from: u */
    public final List m74818u() {
        return this.f68445I;
    }

    /* renamed from: w */
    public final long m74819w() {
        return this.f68450s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f68447p);
        parcel.writeString(this.f68448q);
        parcel.writeString(this.f68449r);
        parcel.writeLong(this.f68450s);
        parcel.writeLong(this.f68451t);
        parcel.writeLong(this.f68452u);
        parcel.writeLong(this.f68453v);
        parcel.writeLong(this.f68454w);
        parcel.writeLong(this.f68455x);
        parcel.writeLong(this.f68456y);
        parcel.writeLong(this.f68457z);
        parcel.writeLong(this.f68437A);
        parcel.writeLong(this.f68438B);
        parcel.writeLong(this.f68439C);
        parcel.writeLong(this.f68440D);
        parcel.writeLong(this.f68441E);
        parcel.writeLong(this.f68442F);
        parcel.writeLong(this.f68443G);
    }

    /* renamed from: x */
    public final long m74820x() {
        return this.f68440D;
    }

    /* renamed from: y */
    public final long m74821y() {
        return this.f68441E;
    }

    /* renamed from: z */
    public final String m74822z() {
        return this.f68447p;
    }

    public /* synthetic */ ThreadStorageInfo(String str, String str2, String str3, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) == 0 ? str3 : "", (i11 & 8) != 0 ? 0L : j11, (i11 & 16) != 0 ? 0L : j12, (i11 & 32) != 0 ? 0L : j13, (i11 & 64) != 0 ? 0L : j14, (i11 & 128) != 0 ? 0L : j15, (i11 & 256) != 0 ? 0L : j16, (i11 & 512) != 0 ? 0L : j17, (i11 & 1024) != 0 ? 0L : j18, (i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? 0L : j19, (i11 & 4096) != 0 ? 0L : j21, (i11 & 8192) != 0 ? 0L : j22, (i11 & 16384) != 0 ? 0L : j23, (32768 & i11) != 0 ? 0L : j24, (65536 & i11) != 0 ? 0L : j25, (i11 & 131072) == 0 ? j26 : 0L);
    }
}
