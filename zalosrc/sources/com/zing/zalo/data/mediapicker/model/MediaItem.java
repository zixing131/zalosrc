package com.zing.zalo.data.mediapicker.model;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gq.AbstractC19588k;
import ho0.AbstractC20110a;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import ln0.AbstractC22543l;
import me0.AbstractC23067f6;
import on0.AbstractC24334o;
import on0.AbstractC24341v;
import p239ih.C20556f;
import p270jk.EnumC21281b;
import p276jt.C21362q;
import p348mi.C23307g;
import p716zh.C32027n;
import vc0.InterfaceC27965d;

/* loaded from: classes3.dex */
public class MediaItem extends AbstractC19588k implements Parcelable, Comparable<MediaItem>, InterfaceC27965d {

    /* renamed from: A */
    private boolean f42929A;

    /* renamed from: B */
    private MediaItem f42930B;

    /* renamed from: C */
    private String f42931C;

    /* renamed from: D */
    private String f42932D;

    /* renamed from: E */
    private String f42933E;

    /* renamed from: F */
    private String f42934F;

    /* renamed from: G */
    private boolean f42935G;

    /* renamed from: H */
    private long f42936H;

    /* renamed from: I */
    private String f42937I;

    /* renamed from: J */
    private String f42938J;

    /* renamed from: K */
    private int f42939K;

    /* renamed from: L */
    private int f42940L;

    /* renamed from: M */
    private int f42941M;

    /* renamed from: N */
    private int f42942N;

    /* renamed from: O */
    private RestoreDecorData f42943O;

    /* renamed from: P */
    private AtomicBoolean f42944P;

    /* renamed from: Q */
    private int f42945Q;

    /* renamed from: R */
    private String f42946R;

    /* renamed from: S */
    private String f42947S;

    /* renamed from: T */
    private long f42948T;

    /* renamed from: U */
    private int f42949U;

    /* renamed from: V */
    private float f42950V;

    /* renamed from: W */
    private float f42951W;

    /* renamed from: X */
    private String f42952X;

    /* renamed from: Y */
    private String f42953Y;

    /* renamed from: Z */
    private String f42954Z;

    /* renamed from: a0 */
    private int f42955a0;

    /* renamed from: b0 */
    private EnumC21281b f42956b0;

    /* renamed from: c0 */
    private boolean f42957c0;

    /* renamed from: d0 */
    private int f42958d0;

    /* renamed from: e0 */
    private long f42959e0;

    /* renamed from: f0 */
    private boolean f42960f0;

    /* renamed from: g0 */
    private C32027n f42961g0;

    /* renamed from: h0 */
    public int f42962h0;

    /* renamed from: p */
    private String f42963p;

    /* renamed from: q */
    private long f42964q;

    /* renamed from: r */
    private String f42965r;

    /* renamed from: s */
    private String f42966s;

    /* renamed from: t */
    private String f42967t;

    /* renamed from: u */
    private String f42968u;

    /* renamed from: v */
    private long f42969v;

    /* renamed from: w */
    private long f42970w;

    /* renamed from: x */
    private long f42971x;

    /* renamed from: y */
    private boolean f42972y;

    /* renamed from: z */
    private boolean f42973z;
    public static final C7944b Companion = new C7944b(null);
    public static final Parcelable.Creator<MediaItem> CREATOR = new C7943a();

    /* renamed from: com.zing.zalo.data.mediapicker.model.MediaItem$a */
    /* loaded from: classes3.dex */
    public static final class C7943a implements Parcelable.Creator {
        C7943a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaItem createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "in");
            return new MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaItem[] newArray(int i11) {
            return new MediaItem[i11];
        }
    }

    /* renamed from: com.zing.zalo.data.mediapicker.model.MediaItem$b */
    /* loaded from: classes3.dex */
    public static final class C7944b {
        private C7944b() {
        }

        public /* synthetic */ C7944b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public MediaItem() {
        this.f42965r = "";
        this.f42966s = "";
        this.f42967t = "";
        this.f42968u = "";
        this.f42931C = "";
        this.f42932D = "";
        this.f42933E = "";
        this.f42934F = "";
        this.f42937I = "";
        this.f42938J = "";
        this.f42946R = "";
        this.f42947S = "";
        this.f42948T = -1L;
        this.f42949U = -1;
        this.f42952X = "";
        this.f42953Y = "";
        this.f42954Z = "";
        this.f42955a0 = -1;
        this.f42956b0 = EnumC21281b.f103710q;
        this.f42958d0 = 3;
    }

    /* renamed from: A0 */
    public final void m41092A0(long j11) {
        this.f42948T = j11;
    }

    /* renamed from: B */
    public final long m41093B() {
        return this.f42971x;
    }

    /* renamed from: B0 */
    public final void m41094B0(boolean z11) {
        this.f42929A = z11;
    }

    /* renamed from: C */
    public final long m41095C() {
        long j11;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            j11 = AbstractC22543l.m116585h(this.f42971x, this.f42969v);
        } else if (i11 == 29) {
            j11 = this.f42969v;
        } else {
            return this.f42970w;
        }
        return j11 * 1000;
    }

    /* renamed from: C0 */
    public final void m41096C0(int i11) {
        this.f42945Q = i11;
    }

    /* renamed from: D */
    public final long m41097D() {
        return this.f42969v;
    }

    /* renamed from: D0 */
    public final void m41098D0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42946R = str;
    }

    /* renamed from: E0 */
    public final void m41099E0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42937I = str;
    }

    /* renamed from: F */
    public final String m41100F() {
        return this.f42932D;
    }

    /* renamed from: F0 */
    public void mo41080F0(long j11) {
        this.f42964q = j11;
    }

    /* renamed from: G0 */
    public final void m41101G0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42938J = str;
    }

    /* renamed from: H */
    public final String m41102H() {
        return this.f42953Y;
    }

    /* renamed from: H0 */
    public final void m41103H0(RestoreDecorData restoreDecorData) {
        this.f42943O = restoreDecorData;
    }

    /* renamed from: I */
    public final String m41104I() {
        return String.valueOf(mo41090x());
    }

    /* renamed from: I0 */
    public final void m41105I0(long j11) {
        this.f42971x = j11;
    }

    /* renamed from: J */
    public final float m41106J() {
        return this.f42950V;
    }

    /* renamed from: J0 */
    public final void m41107J0(long j11) {
        this.f42969v = j11;
    }

    /* renamed from: K */
    public final float m41108K() {
        return this.f42951W;
    }

    /* renamed from: K0 */
    public final void m41109K0(long j11) {
        this.f42970w = j11;
    }

    /* renamed from: L0 */
    public final void m41110L0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42932D = str;
    }

    /* renamed from: M */
    public final int m41111M() {
        return this.f42958d0;
    }

    /* renamed from: M0 */
    public final void m41112M0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42968u = str;
    }

    /* renamed from: N */
    public final String m41113N() {
        return this.f42931C;
    }

    /* renamed from: N0 */
    public final void m41114N0(boolean z11) {
        this.f42973z = z11;
    }

    /* renamed from: O */
    public final C32027n m41115O() {
        return this.f42961g0;
    }

    /* renamed from: O0 */
    public final void m41116O0(boolean z11) {
        this.f42935G = z11;
    }

    /* renamed from: P0 */
    public final void m41117P0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42953Y = str;
    }

    /* renamed from: Q */
    public String mo41081Q() {
        return this.f42965r;
    }

    /* renamed from: Q0 */
    public final void m41118Q0(int i11) {
        this.f42940L = i11;
    }

    /* renamed from: R */
    public final String m41119R() {
        return this.f42963p;
    }

    /* renamed from: R0 */
    public final void m41120R0(float f11) {
        this.f42950V = f11;
    }

    /* renamed from: S */
    public final int m41121S() {
        return this.f42955a0;
    }

    /* renamed from: S0 */
    public final void m41122S0(float f11) {
        this.f42951W = f11;
    }

    /* renamed from: T */
    public final String m41123T() {
        return this.f42966s;
    }

    /* renamed from: T0 */
    public final void m41124T0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42931C = str;
    }

    /* renamed from: U */
    public final EnumC21281b m41125U() {
        return this.f42956b0;
    }

    /* renamed from: U0 */
    public final void m41126U0(C32027n c32027n) {
        this.f42961g0 = c32027n;
    }

    /* renamed from: V */
    public final String m41127V() {
        return this.f42947S;
    }

    /* renamed from: V0 */
    public final void m41128V0(MediaItem mediaItem) {
        this.f42930B = mediaItem;
    }

    /* renamed from: W */
    public final boolean m41129W() {
        return this.f42957c0;
    }

    /* renamed from: W0 */
    public void mo41082W0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42965r = str;
    }

    /* renamed from: X */
    public final long m41130X() {
        return this.f42936H;
    }

    /* renamed from: X0 */
    public final void m41131X0(String str) {
        this.f42963p = str;
    }

    /* renamed from: Y */
    public final long m41132Y() {
        return this.f42959e0;
    }

    /* renamed from: Y0 */
    public final void m41133Y0(AtomicBoolean atomicBoolean) {
        this.f42944P = atomicBoolean;
    }

    /* renamed from: Z */
    public final String m41134Z() {
        return this.f42954Z;
    }

    /* renamed from: Z0 */
    public final void m41135Z0(int i11) {
        this.f42955a0 = i11;
    }

    /* renamed from: a0 */
    public String mo41083a0() {
        try {
            if (mo41081Q().length() == 0) {
                return "";
            }
            if (m41174v0()) {
                return this.f42967t;
            }
            String encode = URLEncoder.encode(mo41081Q(), "UTF-8");
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "content://id=%d&data=%s&date=%d", Arrays.copyOf(new Object[]{Long.valueOf(mo41090x()), encode, Long.valueOf(this.f42969v)}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    /* renamed from: a1 */
    public final void m41136a1(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42966s = str;
    }

    @Override // vc0.InterfaceC27965d
    /* renamed from: b */
    public boolean mo40584b() {
        return this.f42972y;
    }

    /* renamed from: b0 */
    public final int m41137b0() {
        return this.f42942N;
    }

    /* renamed from: b1 */
    public final void m41138b1(boolean z11) {
        this.f42960f0 = z11;
    }

    @Override // vc0.InterfaceC27965d
    /* renamed from: c */
    public String mo40586c() {
        return String.valueOf(mo41090x());
    }

    /* renamed from: c1 */
    public final void m41139c1(EnumC21281b enumC21281b) {
        AbstractC19074t.m100208f(enumC21281b, "<set-?>");
        this.f42956b0 = enumC21281b;
    }

    @Override // gq.AbstractC19588k
    /* renamed from: d */
    public int mo40517d() {
        return this.f42942N;
    }

    /* renamed from: d1 */
    public final void m41140d1(boolean z11) {
        this.f42972y = z11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // gq.AbstractC19588k
    /* renamed from: e */
    public int mo40518e() {
        return this.f42941M;
    }

    /* renamed from: e0 */
    public final String m41141e0() {
        return this.f42967t;
    }

    /* renamed from: e1 */
    public final void m41142e1(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42947S = str;
    }

    /* renamed from: f1 */
    public final void m41143f1(boolean z11) {
        this.f42957c0 = z11;
    }

    /* renamed from: g0 */
    public final int m41144g0() {
        return this.f42941M;
    }

    /* renamed from: g1 */
    public final void m41145g1(long j11) {
        this.f42936H = j11;
    }

    public final int getHeight() {
        return this.f42940L;
    }

    public final int getWidth() {
        return this.f42939K;
    }

    /* renamed from: h0 */
    public final String m41146h0() {
        String str = this.f42931C;
        if (str.length() == 0) {
            return mo41081Q();
        }
        return str;
    }

    /* renamed from: h1 */
    public final void m41147h1(long j11) {
        this.f42959e0 = j11;
    }

    /* renamed from: i0 */
    public final String m41148i0() {
        return this.f42952X;
    }

    /* renamed from: i1 */
    public final void m41149i1(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42954Z = str;
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "other");
        return 0;
    }

    /* renamed from: j0 */
    public final String m41150j0() {
        return this.f42933E;
    }

    /* renamed from: j1 */
    public final void m41151j1(int i11) {
        this.f42942N = i11;
    }

    /* renamed from: k0 */
    public final String m41152k0() {
        return this.f42934F;
    }

    /* renamed from: k1 */
    public final void m41153k1(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42967t = str;
    }

    /* renamed from: l0 */
    public boolean mo41154l0() {
        if (this.f42931C.length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l1 */
    public final void m41155l1(int i11) {
        this.f42941M = i11;
    }

    /* renamed from: m */
    public final int m41156m() {
        return this.f42949U;
    }

    /* renamed from: m0 */
    public final boolean m41157m0() {
        return this.f42929A;
    }

    /* renamed from: m1 */
    public final void m41158m1(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42952X = str;
    }

    /* renamed from: n0 */
    public final boolean m41159n0() {
        if (m41174v0()) {
            return true;
        }
        return new C20556f(mo41081Q()).m106830b();
    }

    /* renamed from: n1 */
    public final void m41160n1(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42933E = str;
    }

    /* renamed from: o0 */
    public final boolean m41161o0() {
        return this.f42973z;
    }

    /* renamed from: o1 */
    public final void m41162o1(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42934F = str;
    }

    /* renamed from: p0 */
    public final boolean m41163p0() {
        boolean m127125u;
        if (this.f42968u.length() <= 0) {
            return false;
        }
        String str = this.f42968u;
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
        m127125u = AbstractC24341v.m127125u(lowerCase, ".gif", false, 2, null);
        if (!m127125u) {
            return false;
        }
        return true;
    }

    /* renamed from: p1 */
    public final void m41164p1(int i11) {
        this.f42939K = i11;
    }

    /* renamed from: q */
    public final long m41165q() {
        return this.f42948T;
    }

    /* renamed from: q0 */
    public final boolean m41166q0() {
        return this.f42935G;
    }

    /* renamed from: q1 */
    public void mo41167q1(MediaItem mediaItem) {
        if (mediaItem != null) {
            mo41082W0(mediaItem.mo41081Q());
            this.f42931C = mediaItem.f42931C;
            this.f42967t = mediaItem.f42967t;
            this.f42932D = mediaItem.f42932D;
            this.f42937I = mediaItem.f42937I;
            this.f42938J = mediaItem.f42938J;
            this.f42943O = new RestoreDecorData(mediaItem.f42943O);
            this.f42962h0 = mediaItem.f42962h0;
        }
    }

    /* renamed from: r0 */
    public final AtomicBoolean m41168r0() {
        return this.f42944P;
    }

    /* renamed from: r1 */
    public void mo41169r1(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "srcItem");
        this.f42931C = mediaItem.f42931C;
        this.f42966s = mediaItem.f42966s;
        this.f42932D = mediaItem.f42932D;
        this.f42933E = mediaItem.f42933E;
        this.f42934F = mediaItem.f42934F;
        this.f42935G = mediaItem.f42935G;
        this.f42972y = mediaItem.f42972y;
        this.f42947S = mediaItem.f42947S;
        this.f42973z = mediaItem.f42973z;
        this.f42929A = mediaItem.f42929A;
        this.f42941M = mediaItem.f42941M;
        this.f42942N = mediaItem.f42942N;
        this.f42937I = mediaItem.f42937I;
        this.f42938J = mediaItem.f42938J;
        if (mediaItem.f42943O != null) {
            this.f42943O = new RestoreDecorData(mediaItem.f42943O);
        }
        this.f42962h0 = mediaItem.f42962h0;
    }

    /* renamed from: t */
    public final int m41170t() {
        return this.f42945Q;
    }

    /* renamed from: t0 */
    public final boolean m41171t0() {
        return this.f42960f0;
    }

    public String toString() {
        String m127098f;
        m127098f = AbstractC24334o.m127098f("\n               contentId:" + mo41090x() + "\n               dataPath:" + mo41081Q() + "\n               modifiedPath:" + this.f42931C + "\n               isSelected:" + this.f42972y + "\n               dateModified:" + this.f42969v + "\n\n               ");
        return m127098f;
    }

    /* renamed from: u */
    public final String m41172u() {
        return this.f42946R;
    }

    /* renamed from: u0 */
    public final boolean m41173u0() {
        return this.f42972y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:            if (r0 == false) goto L26;     */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m41174v0() {
        boolean m127120J;
        boolean m127120J2;
        boolean m127120J3;
        boolean m127120J4;
        if (mo41081Q().length() > 0) {
            m127120J3 = AbstractC24341v.m127120J(mo41081Q(), "http", false, 2, null);
            if (!m127120J3) {
                m127120J4 = AbstractC24341v.m127120J(mo41081Q(), "https", false, 2, null);
            }
            return true;
        }
        if (this.f42967t.length() > 0) {
            m127120J = AbstractC24341v.m127120J(this.f42967t, "http", false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(this.f42967t, "https", false, 2, null);
                if (!m127120J2) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final String m41175w() {
        return this.f42937I;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "dest");
        parcel.writeString(this.f42963p);
        parcel.writeLong(mo41090x());
        parcel.writeInt(this.f42958d0);
        parcel.writeString(mo41081Q());
        parcel.writeString(this.f42967t);
        parcel.writeString(this.f42968u);
        parcel.writeLong(this.f42969v);
        parcel.writeString(this.f42931C);
        parcel.writeString(this.f42932D);
        parcel.writeInt(this.f42935G ? 1 : 0);
        parcel.writeInt(this.f42972y ? 1 : 0);
        parcel.writeInt(this.f42973z ? 1 : 0);
        parcel.writeLong(this.f42970w);
        parcel.writeString(this.f42933E);
        parcel.writeString(this.f42934F);
        parcel.writeLong(this.f42936H);
        parcel.writeString(this.f42937I);
        parcel.writeString(this.f42938J);
        parcel.writeLong(this.f42948T);
        parcel.writeInt(this.f42949U);
        parcel.writeString(this.f42952X);
        parcel.writeString(this.f42953Y);
        parcel.writeString(this.f42954Z);
        parcel.writeInt(this.f42955a0);
        parcel.writeInt(this.f42941M);
        parcel.writeInt(this.f42942N);
        parcel.writeParcelable(this.f42943O, i11);
        parcel.writeInt(this.f42962h0);
    }

    /* renamed from: x */
    public long mo41090x() {
        return this.f42964q;
    }

    /* renamed from: x0 */
    public void mo41176x0() {
        this.f42931C = "";
        this.f42966s = "";
        this.f42932D = "";
        this.f42933E = "";
        this.f42934F = "";
        this.f42935G = false;
        this.f42972y = false;
        this.f42937I = "";
        this.f42938J = "";
        this.f42947S = "";
        RestoreDecorData restoreDecorData = this.f42943O;
        if (restoreDecorData != null) {
            restoreDecorData.m41188i();
        }
        this.f42943O = null;
        this.f42929A = false;
        this.f42957c0 = false;
        this.f42962h0 = 0;
    }

    /* renamed from: y */
    public final String m41177y() {
        return this.f42938J;
    }

    /* renamed from: z */
    public final RestoreDecorData m41178z() {
        return this.f42943O;
    }

    /* renamed from: z0 */
    public final void m41179z0(int i11) {
        this.f42949U = i11;
    }

    /* loaded from: classes3.dex */
    public static final class RestoreDecorData implements Parcelable {

        /* renamed from: p */
        private String f42974p;

        /* renamed from: q */
        private String f42975q;

        /* renamed from: r */
        private String f42976r;

        /* renamed from: s */
        private String f42977s;

        /* renamed from: t */
        private long f42978t;

        /* renamed from: u */
        private float f42979u;

        /* renamed from: v */
        private int f42980v;

        /* renamed from: w */
        private C21362q f42981w;
        public static final C7942b Companion = new C7942b(null);
        public static final Parcelable.Creator<RestoreDecorData> CREATOR = new C7941a();

        /* renamed from: com.zing.zalo.data.mediapicker.model.MediaItem$RestoreDecorData$a */
        /* loaded from: classes3.dex */
        public static final class C7941a implements Parcelable.Creator {
            C7941a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public RestoreDecorData createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "in");
                return new RestoreDecorData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public RestoreDecorData[] newArray(int i11) {
                return new RestoreDecorData[i11];
            }
        }

        /* renamed from: com.zing.zalo.data.mediapicker.model.MediaItem$RestoreDecorData$b */
        /* loaded from: classes3.dex */
        public static final class C7942b {
            private C7942b() {
            }

            public /* synthetic */ C7942b(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public RestoreDecorData() {
            this.f42974p = "";
            this.f42975q = "";
            this.f42976r = "";
            this.f42977s = "";
            this.f42978t = -1L;
            this.f42979u = 100.0f;
            this.f42981w = new C21362q(0.0d, 0.0d, 1.0d, 1.0d);
        }

        /* renamed from: a */
        public final String m41180a() {
            return this.f42977s;
        }

        /* renamed from: b */
        public final long m41181b() {
            return this.f42978t;
        }

        /* renamed from: c */
        public final float m41182c() {
            return this.f42979u;
        }

        /* renamed from: d */
        public final int m41183d() {
            return this.f42980v;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final C21362q m41184e() {
            return this.f42981w;
        }

        /* renamed from: f */
        public final String m41185f() {
            return this.f42976r;
        }

        /* renamed from: g */
        public final String m41186g() {
            return this.f42975q;
        }

        /* renamed from: h */
        public final String m41187h() {
            return this.f42974p;
        }

        /* renamed from: i */
        public final void m41188i() {
            this.f42974p = "";
            this.f42975q = "";
            this.f42976r = "";
            this.f42977s = "";
            this.f42978t = -1L;
            this.f42979u = 100.0f;
            this.f42980v = 0;
            this.f42981w = new C21362q(0.0d, 0.0d, 1.0d, 1.0d);
        }

        /* renamed from: j */
        public final void m41189j(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f42977s = str;
        }

        /* renamed from: k */
        public final void m41190k(long j11) {
            this.f42978t = j11;
        }

        /* renamed from: l */
        public final void m41191l(float f11) {
            this.f42979u = f11;
        }

        /* renamed from: m */
        public final void m41192m(int i11) {
            this.f42980v = i11;
        }

        /* renamed from: n */
        public final void m41193n(C21362q c21362q) {
            AbstractC19074t.m100208f(c21362q, "<set-?>");
            this.f42981w = c21362q;
        }

        /* renamed from: o */
        public final void m41194o(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f42976r = str;
        }

        /* renamed from: p */
        public final void m41195p(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f42975q = str;
        }

        /* renamed from: q */
        public final void m41196q(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f42974p = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "dest");
            parcel.writeString(this.f42974p);
            parcel.writeString(this.f42975q);
            parcel.writeString(this.f42976r);
            parcel.writeString(this.f42977s);
            parcel.writeLong(this.f42978t);
            parcel.writeFloat(this.f42979u);
            parcel.writeInt(this.f42980v);
            parcel.writeDouble(this.f42981w.f104140a);
            parcel.writeDouble(this.f42981w.f104141b);
            parcel.writeDouble(this.f42981w.f104142c);
            parcel.writeDouble(this.f42981w.f104143d);
        }

        public RestoreDecorData(RestoreDecorData restoreDecorData) {
            this();
            if (restoreDecorData != null) {
                this.f42974p = restoreDecorData.f42974p;
                this.f42975q = restoreDecorData.f42975q;
                this.f42976r = restoreDecorData.f42976r;
                this.f42977s = restoreDecorData.f42977s;
                this.f42978t = restoreDecorData.f42978t;
                this.f42979u = restoreDecorData.f42979u;
                this.f42981w = new C21362q(restoreDecorData.f42981w);
                this.f42980v = restoreDecorData.f42980v;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public RestoreDecorData(Parcel parcel) {
            this();
            AbstractC19074t.m100208f(parcel, "in");
            String readString = parcel.readString();
            String str = "";
            if (readString == null) {
                readString = "";
            } else {
                AbstractC19074t.m100205c(readString);
            }
            this.f42974p = readString;
            String readString2 = parcel.readString();
            if (readString2 == null) {
                readString2 = "";
            } else {
                AbstractC19074t.m100205c(readString2);
            }
            this.f42975q = readString2;
            String readString3 = parcel.readString();
            if (readString3 == null) {
                readString3 = "";
            } else {
                AbstractC19074t.m100205c(readString3);
            }
            this.f42976r = readString3;
            String readString4 = parcel.readString();
            if (readString4 != null) {
                AbstractC19074t.m100205c(readString4);
                str = readString4;
            }
            this.f42977s = str;
            this.f42978t = parcel.readLong();
            this.f42979u = parcel.readFloat();
            this.f42980v = parcel.readInt();
            this.f42981w = new C21362q(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }
    }

    public MediaItem(int i11) {
        this();
        this.f42958d0 = i11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaItem(MediaItem mediaItem) {
        this();
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        this.f42963p = mediaItem.f42963p;
        mo41080F0(mediaItem.mo41090x());
        this.f42958d0 = mediaItem.f42958d0;
        mo41082W0(mediaItem.mo41081Q());
        this.f42966s = mediaItem.f42966s;
        this.f42967t = mediaItem.f42967t;
        this.f42968u = mediaItem.f42968u;
        this.f42969v = mediaItem.f42969v;
        this.f42970w = mediaItem.f42970w;
        this.f42971x = mediaItem.f42971x;
        this.f42972y = mediaItem.f42972y;
        this.f42973z = mediaItem.f42973z;
        this.f42929A = mediaItem.f42929A;
        this.f42930B = mediaItem.f42930B;
        this.f42931C = mediaItem.f42931C;
        this.f42932D = mediaItem.f42932D;
        this.f42933E = mediaItem.f42933E;
        this.f42934F = mediaItem.f42934F;
        this.f42935G = mediaItem.f42935G;
        this.f42936H = mediaItem.f42936H;
        this.f42937I = mediaItem.f42937I;
        this.f42938J = mediaItem.f42938J;
        this.f42939K = mediaItem.f42939K;
        this.f42940L = mediaItem.f42940L;
        this.f42941M = mediaItem.f42941M;
        this.f42942N = mediaItem.f42942N;
        this.f42943O = new RestoreDecorData(mediaItem.f42943O);
        this.f42945Q = mediaItem.f42945Q;
        this.f42946R = mediaItem.f42946R;
        this.f42947S = mediaItem.f42947S;
        this.f42948T = mediaItem.f42948T;
        this.f42949U = mediaItem.f42949U;
        this.f42950V = mediaItem.f42950V;
        this.f42951W = mediaItem.f42951W;
        this.f42952X = mediaItem.f42952X;
        this.f42953Y = mediaItem.f42953Y;
        this.f42954Z = mediaItem.f42954Z;
        this.f42955a0 = mediaItem.f42955a0;
        this.f42956b0 = mediaItem.f42956b0;
        this.f42957c0 = mediaItem.f42957c0;
        this.f42962h0 = mediaItem.f42962h0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaItem(Parcel parcel) {
        this();
        AbstractC19074t.m100208f(parcel, "source");
        this.f42963p = parcel.readString();
        mo41080F0(parcel.readLong());
        this.f42958d0 = parcel.readInt();
        String readString = parcel.readString();
        String str = "";
        if (readString == null) {
            readString = "";
        } else {
            AbstractC19074t.m100205c(readString);
        }
        mo41082W0(readString);
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        } else {
            AbstractC19074t.m100205c(readString2);
        }
        this.f42967t = readString2;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        } else {
            AbstractC19074t.m100205c(readString3);
        }
        this.f42968u = readString3;
        this.f42969v = parcel.readLong();
        String readString4 = parcel.readString();
        if (readString4 == null) {
            readString4 = "";
        } else {
            AbstractC19074t.m100205c(readString4);
        }
        this.f42931C = readString4;
        String readString5 = parcel.readString();
        if (readString5 == null) {
            readString5 = "";
        } else {
            AbstractC19074t.m100205c(readString5);
        }
        this.f42932D = readString5;
        this.f42935G = parcel.readInt() == 1;
        this.f42972y = parcel.readInt() == 1;
        this.f42973z = parcel.readInt() == 1;
        this.f42970w = parcel.readLong();
        String readString6 = parcel.readString();
        if (readString6 == null) {
            readString6 = "";
        } else {
            AbstractC19074t.m100205c(readString6);
        }
        this.f42933E = readString6;
        String readString7 = parcel.readString();
        if (readString7 == null) {
            readString7 = "";
        } else {
            AbstractC19074t.m100205c(readString7);
        }
        this.f42934F = readString7;
        this.f42936H = parcel.readLong();
        String readString8 = parcel.readString();
        if (readString8 == null) {
            readString8 = "";
        } else {
            AbstractC19074t.m100205c(readString8);
        }
        this.f42937I = readString8;
        String readString9 = parcel.readString();
        if (readString9 == null) {
            readString9 = "";
        } else {
            AbstractC19074t.m100205c(readString9);
        }
        this.f42938J = readString9;
        this.f42948T = parcel.readLong();
        this.f42949U = parcel.readInt();
        String readString10 = parcel.readString();
        if (readString10 == null) {
            readString10 = "";
        } else {
            AbstractC19074t.m100205c(readString10);
        }
        this.f42952X = readString10;
        String readString11 = parcel.readString();
        if (readString11 == null) {
            readString11 = "";
        } else {
            AbstractC19074t.m100205c(readString11);
        }
        this.f42953Y = readString11;
        String readString12 = parcel.readString();
        if (readString12 != null) {
            AbstractC19074t.m100205c(readString12);
            str = readString12;
        }
        this.f42954Z = str;
        this.f42955a0 = parcel.readInt();
        this.f42941M = parcel.readInt();
        this.f42942N = parcel.readInt();
        this.f42943O = (RestoreDecorData) parcel.readParcelable(RestoreDecorData.class.getClassLoader());
        this.f42962h0 = parcel.readInt();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaItem(String str) {
        this();
        AbstractC19074t.m100208f(str, "localPath");
        C23307g m118367a = AbstractC23067f6.m118367a(str);
        AbstractC19074t.m100207e(m118367a, "getPhotoInfo(...)");
        mo41082W0(str);
        this.f42972y = true;
        this.f42941M = m118367a.f113474a;
        this.f42942N = m118367a.f113475b;
    }
}
