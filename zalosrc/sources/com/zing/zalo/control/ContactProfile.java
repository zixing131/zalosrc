package com.zing.zalo.control;

import ag0.C0824j;
import ai.InterfaceC0861a;
import am.AbstractC0906d0;
import am.AbstractC0939u;
import am.C0943w;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import cm.C3594a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23008a2;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23244v8;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p055ce.C3433b;
import p056cj.C3545m;
import p111du.AbstractC18069a;
import p132ej.C18446h;
import p142ey.C18631a;
import p248iy.AbstractC20887g;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p461qu.AbstractC25495a;
import p588vw.C28652r;
import p716zh.C31868c5;
import p716zh.C31901e8;
import p716zh.C31922g;
import p716zh.C31924g1;
import p716zh.C31943h5;
import p716zh.C31973j5;
import p716zh.C31986k3;
import vg.C28203u6;

@SuppressLint({"DefaultLocale", "StringFormatInTimber"})
/* loaded from: classes3.dex */
public class ContactProfile implements InterfaceC0861a, Parcelable {

    /* renamed from: A */
    public String f42321A;

    /* renamed from: A0 */
    public List f42322A0;

    /* renamed from: A1 */
    public String f42323A1;

    /* renamed from: B */
    public String f42324B;

    /* renamed from: B0 */
    private String f42325B0;

    /* renamed from: B1 */
    public boolean f42326B1;

    /* renamed from: C */
    private String f42327C;

    /* renamed from: C0 */
    private boolean f42328C0;

    /* renamed from: C1 */
    public int f42329C1;

    /* renamed from: D */
    public long f42330D;

    /* renamed from: D0 */
    private int f42331D0;

    /* renamed from: D1 */
    public int f42332D1;

    /* renamed from: E */
    private boolean f42333E;

    /* renamed from: E0 */
    private int f42334E0;

    /* renamed from: E1 */
    public int f42335E1;

    /* renamed from: F */
    public long f42336F;

    /* renamed from: F0 */
    private String f42337F0;

    /* renamed from: F1 */
    public int f42338F1;

    /* renamed from: G */
    public int f42339G;

    /* renamed from: G0 */
    private String f42340G0;

    /* renamed from: G1 */
    public int f42341G1;

    /* renamed from: H */
    private int f42342H;

    /* renamed from: H0 */
    private JSONObject f42343H0;

    /* renamed from: H1 */
    public boolean f42344H1;

    /* renamed from: I */
    private boolean f42345I;

    /* renamed from: I0 */
    public String f42346I0;

    /* renamed from: I1 */
    public long f42347I1;

    /* renamed from: J */
    public C7908f f42348J;

    /* renamed from: J0 */
    public boolean f42349J0;

    /* renamed from: J1 */
    public int f42350J1;

    /* renamed from: K */
    public String f42351K;

    /* renamed from: K0 */
    public int f42352K0;

    /* renamed from: K1 */
    public int f42353K1;

    /* renamed from: L */
    public String f42354L;

    /* renamed from: L0 */
    public String f42355L0;

    /* renamed from: L1 */
    public boolean f42356L1;

    /* renamed from: M */
    public double f42357M;

    /* renamed from: M0 */
    public String f42358M0;

    /* renamed from: M1 */
    public boolean f42359M1;

    /* renamed from: N */
    public String f42360N;

    /* renamed from: N0 */
    public int f42361N0;

    /* renamed from: N1 */
    public String f42362N1;

    /* renamed from: O */
    public String f42363O;

    /* renamed from: O0 */
    public String f42364O0;

    /* renamed from: O1 */
    public int f42365O1;

    /* renamed from: P */
    public C7868d f42366P;

    /* renamed from: P0 */
    public String f42367P0;

    /* renamed from: P1 */
    public int f42368P1;

    /* renamed from: Q */
    public int f42369Q;

    /* renamed from: Q0 */
    public boolean f42370Q0;

    /* renamed from: Q1 */
    public String f42371Q1;

    /* renamed from: R */
    private C18446h f42372R;

    /* renamed from: R0 */
    public int f42373R0;

    /* renamed from: R1 */
    public long f42374R1;

    /* renamed from: S */
    public int f42375S;

    /* renamed from: S0 */
    public int f42376S0;

    /* renamed from: S1 */
    public int f42377S1;

    /* renamed from: T */
    private String f42378T;

    /* renamed from: T0 */
    private C31868c5 f42379T0;

    /* renamed from: T1 */
    public boolean f42380T1;

    /* renamed from: U */
    private CharSequence f42381U;

    /* renamed from: U0 */
    public int f42382U0;

    /* renamed from: U1 */
    public String f42383U1;

    /* renamed from: V */
    public C31924g1 f42384V;

    /* renamed from: V0 */
    public int f42385V0;

    /* renamed from: V1 */
    private String f42386V1;

    /* renamed from: W */
    public float f42387W;

    /* renamed from: W0 */
    public int f42388W0;

    /* renamed from: W1 */
    public C31922g f42389W1;

    /* renamed from: X */
    public int f42390X;

    /* renamed from: X0 */
    private boolean f42391X0;

    /* renamed from: X1 */
    public int f42392X1;

    /* renamed from: Y */
    public boolean f42393Y;

    /* renamed from: Y0 */
    public int f42394Y0;

    /* renamed from: Y1 */
    public int f42395Y1;

    /* renamed from: Z */
    public int f42396Z;

    /* renamed from: Z0 */
    private C7874j f42397Z0;

    /* renamed from: a0 */
    public int f42398a0;

    /* renamed from: a1 */
    public ArrayList f42399a1;

    /* renamed from: b0 */
    public long f42400b0;

    /* renamed from: b1 */
    public ArrayList f42401b1;

    /* renamed from: c0 */
    public String f42402c0;

    /* renamed from: c1 */
    public boolean f42403c1;

    /* renamed from: d0 */
    public int f42404d0;

    /* renamed from: d1 */
    public boolean f42405d1;

    /* renamed from: e0 */
    public String f42406e0;

    /* renamed from: e1 */
    public boolean f42407e1;

    /* renamed from: f0 */
    public String f42408f0;

    /* renamed from: f1 */
    private boolean f42409f1;

    /* renamed from: g0 */
    public String f42410g0;

    /* renamed from: g1 */
    public boolean f42411g1;

    /* renamed from: h0 */
    public int f42412h0;

    /* renamed from: h1 */
    public String f42413h1;

    /* renamed from: i0 */
    public int f42414i0;

    /* renamed from: i1 */
    public int f42415i1;

    /* renamed from: j0 */
    public long f42416j0;

    /* renamed from: j1 */
    private int f42417j1;

    /* renamed from: k0 */
    public long f42418k0;

    /* renamed from: k1 */
    public String f42419k1;

    /* renamed from: l0 */
    public String f42420l0;

    /* renamed from: l1 */
    public int f42421l1;

    /* renamed from: m0 */
    public String f42422m0;

    /* renamed from: m1 */
    public long f42423m1;

    /* renamed from: n0 */
    public int f42424n0;

    /* renamed from: n1 */
    public int f42425n1;

    /* renamed from: o0 */
    public String f42426o0;

    /* renamed from: o1 */
    public String f42427o1;

    /* renamed from: p */
    public int f42428p;

    /* renamed from: p0 */
    public String f42429p0;

    /* renamed from: p1 */
    public boolean f42430p1;

    /* renamed from: q */
    private String f42431q;

    /* renamed from: q0 */
    public int f42432q0;

    /* renamed from: q1 */
    public String f42433q1;

    /* renamed from: r */
    public String f42434r;

    /* renamed from: r0 */
    public int f42435r0;

    /* renamed from: r1 */
    public SpannableStringBuilder f42436r1;

    /* renamed from: s */
    public String f42437s;

    /* renamed from: s0 */
    public int f42438s0;

    /* renamed from: s1 */
    public SpannableStringBuilder f42439s1;

    /* renamed from: t */
    public String f42440t;

    /* renamed from: t0 */
    public boolean f42441t0;

    /* renamed from: t1 */
    public String f42442t1;

    /* renamed from: u */
    public String f42443u;

    /* renamed from: u0 */
    public boolean f42444u0;

    /* renamed from: u1 */
    public String f42445u1;

    /* renamed from: v */
    public String f42446v;

    /* renamed from: v0 */
    public int f42447v0;

    /* renamed from: v1 */
    private boolean f42448v1;

    /* renamed from: w */
    public int f42449w;

    /* renamed from: w0 */
    public int f42450w0;

    /* renamed from: w1 */
    private long f42451w1;

    /* renamed from: x */
    public String f42452x;

    /* renamed from: x0 */
    public int f42453x0;

    /* renamed from: x1 */
    public long f42454x1;

    /* renamed from: y */
    public String f42455y;

    /* renamed from: y0 */
    public int f42456y0;

    /* renamed from: y1 */
    public String f42457y1;

    /* renamed from: z */
    public String f42458z;

    /* renamed from: z0 */
    public C3545m f42459z0;

    /* renamed from: z1 */
    public String f42460z1;

    /* renamed from: Z1 */
    public static Comparator f42319Z1 = new Comparator() { // from class: zh.t0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m40348V0;
            m40348V0 = ContactProfile.m40348V0((ContactProfile) obj, (ContactProfile) obj2);
            return m40348V0;
        }
    };

    /* renamed from: a2 */
    public static Comparator f42320a2 = new Comparator() { // from class: zh.u0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m40349W0;
            m40349W0 = ContactProfile.m40349W0((ContactProfile) obj, (ContactProfile) obj2);
            return m40349W0;
        }
    };
    public static final Parcelable.Creator<ContactProfile> CREATOR = new C7866b();

    /* renamed from: com.zing.zalo.control.ContactProfile$a */
    /* loaded from: classes3.dex */
    public class C7865a extends AbstractC0939u {
        C7865a() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C0943w.f3447a.m4472f(ContactProfile.this.f42434r);
        }
    }

    /* renamed from: com.zing.zalo.control.ContactProfile$b */
    /* loaded from: classes3.dex */
    class C7866b implements Parcelable.Creator {
        C7866b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ContactProfile createFromParcel(Parcel parcel) {
            return new ContactProfile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ContactProfile[] newArray(int i11) {
            return new ContactProfile[i11];
        }
    }

    /* renamed from: com.zing.zalo.control.ContactProfile$j */
    /* loaded from: classes3.dex */
    public static class C7874j {

        /* renamed from: a */
        private String f42510a;

        /* renamed from: b */
        private String f42511b;

        /* renamed from: c */
        private String f42512c;

        public C7874j() {
            this.f42510a = "";
            this.f42511b = "";
            this.f42512c = "";
        }

        public C7874j(JSONObject jSONObject) {
            this();
            try {
                this.f42510a = AbstractC18069a.m96089h(jSONObject, "icon");
                this.f42511b = AbstractC18069a.m96089h(jSONObject, "link");
                this.f42512c = AbstractC18069a.m96089h(jSONObject, "name");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.control.ContactProfile$k */
    /* loaded from: classes3.dex */
    public static class C7875k {

        /* renamed from: a */
        String f42513a;

        /* renamed from: b */
        String f42514b;

        public C7875k(JSONObject jSONObject) {
            this.f42513a = "";
            this.f42514b = "";
            if (jSONObject != null) {
                this.f42513a = jSONObject.optString("question", "");
                this.f42514b = jSONObject.optString("answer", "");
            }
        }

        /* renamed from: a */
        public JSONObject m40473a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("question", this.f42513a);
                jSONObject.put("answer", this.f42514b);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }
    }

    public ContactProfile(int i11, String str) {
        this.f42428p = 0;
        this.f42431q = "";
        this.f42434r = "";
        this.f42437s = "";
        this.f42440t = "";
        this.f42443u = "";
        this.f42446v = "";
        this.f42449w = 0;
        this.f42452x = "";
        this.f42455y = "";
        this.f42458z = "";
        this.f42321A = "";
        this.f42324B = "";
        this.f42327C = "";
        this.f42330D = 0L;
        this.f42333E = true;
        this.f42336F = 0L;
        this.f42339G = 1;
        this.f42342H = 0;
        this.f42345I = false;
        this.f42348J = null;
        this.f42354L = "";
        this.f42357M = 0.0d;
        this.f42360N = "";
        this.f42363O = "";
        this.f42366P = null;
        this.f42369Q = 0;
        this.f42372R = null;
        this.f42375S = 1;
        this.f42378T = "";
        this.f42387W = 0.0f;
        this.f42390X = -1;
        this.f42393Y = false;
        this.f42396Z = 0;
        this.f42398a0 = 0;
        this.f42400b0 = 0L;
        this.f42402c0 = "";
        this.f42404d0 = -1;
        this.f42406e0 = "";
        this.f42408f0 = "";
        this.f42410g0 = "";
        this.f42412h0 = 0;
        this.f42414i0 = 0;
        this.f42416j0 = -1L;
        this.f42418k0 = 0L;
        this.f42420l0 = "";
        this.f42422m0 = "";
        this.f42424n0 = 0;
        this.f42426o0 = "";
        this.f42429p0 = "";
        this.f42432q0 = 0;
        this.f42435r0 = 0;
        this.f42438s0 = 0;
        this.f42441t0 = false;
        this.f42444u0 = false;
        this.f42447v0 = 1;
        this.f42450w0 = -1;
        this.f42453x0 = 1;
        this.f42456y0 = 0;
        this.f42459z0 = null;
        this.f42322A0 = new ArrayList();
        this.f42325B0 = "";
        this.f42328C0 = false;
        this.f42343H0 = new JSONObject();
        this.f42346I0 = "";
        this.f42349J0 = false;
        this.f42352K0 = 0;
        this.f42355L0 = "";
        this.f42358M0 = "";
        this.f42361N0 = 0;
        this.f42367P0 = null;
        this.f42370Q0 = false;
        this.f42373R0 = -1;
        this.f42376S0 = 0;
        this.f42382U0 = 0;
        this.f42385V0 = 0;
        this.f42388W0 = 1;
        this.f42391X0 = false;
        this.f42394Y0 = 0;
        this.f42397Z0 = null;
        this.f42399a1 = new ArrayList();
        this.f42401b1 = new ArrayList();
        this.f42403c1 = false;
        this.f42405d1 = false;
        this.f42407e1 = false;
        this.f42409f1 = false;
        this.f42411g1 = false;
        this.f42413h1 = "";
        this.f42415i1 = 0;
        this.f42417j1 = -1;
        this.f42419k1 = "";
        this.f42421l1 = 0;
        this.f42423m1 = 0L;
        this.f42425n1 = 0;
        this.f42427o1 = "";
        this.f42430p1 = false;
        this.f42433q1 = "";
        this.f42436r1 = new SpannableStringBuilder();
        this.f42439s1 = new SpannableStringBuilder();
        this.f42442t1 = "";
        this.f42445u1 = "";
        this.f42448v1 = false;
        this.f42451w1 = 0L;
        this.f42460z1 = "";
        this.f42323A1 = "";
        this.f42326B1 = false;
        this.f42329C1 = 1;
        this.f42332D1 = 1;
        this.f42335E1 = 0;
        this.f42338F1 = 0;
        this.f42341G1 = 0;
        this.f42344H1 = false;
        this.f42347I1 = 0L;
        this.f42350J1 = -1;
        this.f42353K1 = -1;
        this.f42356L1 = false;
        this.f42359M1 = false;
        this.f42365O1 = 4;
        this.f42368P1 = 0;
        this.f42371Q1 = "";
        this.f42380T1 = false;
        this.f42392X1 = -1;
        this.f42428p = i11;
        if (i11 == 1) {
            this.f42434r = "group_" + str;
        }
    }

    /* renamed from: C0 */
    public static boolean m40345C0(int i11) {
        return (i11 & 4) == 4;
    }

    /* renamed from: R0 */
    public static boolean m40346R0(String str) {
        long j11;
        try {
            if (AbstractC25495a.m132079d(str)) {
                j11 = Long.parseLong(AbstractC25495a.m132088m(str));
            } else {
                j11 = Long.parseLong(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            j11 = 0;
        }
        if (j11 > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: T0 */
    public static boolean m40347T0(int i11) {
        return (i11 & 1) == 1;
    }

    /* renamed from: V0 */
    public static /* synthetic */ int m40348V0(ContactProfile contactProfile, ContactProfile contactProfile2) {
        float f11 = contactProfile.f42387W;
        float f12 = contactProfile2.f42387W;
        int i11 = contactProfile.f42390X;
        int i12 = contactProfile2.f42390X;
        boolean z11 = contactProfile.f42393Y;
        boolean z12 = contactProfile2.f42393Y;
        if (f11 < f12) {
            return 1;
        }
        if (f11 > f12) {
            return -1;
        }
        if (i11 == -1) {
            i11 = Integer.MAX_VALUE;
        }
        if (i12 == -1) {
            i12 = Integer.MAX_VALUE;
        }
        if (i11 < i12) {
            return -1;
        }
        if (i12 < i11) {
            return 1;
        }
        if (z11 || z12) {
            if (!z11) {
                return -1;
            }
            if (!z12) {
                return 1;
            }
        }
        int i13 = contactProfile.f42396Z;
        int i14 = contactProfile2.f42396Z;
        if (i13 < i14) {
            return -1;
        }
        if (i14 < i13) {
            return 1;
        }
        if (!TextUtils.isEmpty(contactProfile.f42371Q1) && !TextUtils.isEmpty(contactProfile2.f42371Q1)) {
            return contactProfile.f42371Q1.compareTo(contactProfile2.f42371Q1);
        }
        return contactProfile.m40383Q(true, false).compareTo(contactProfile2.m40383Q(true, false));
    }

    /* renamed from: W0 */
    public static /* synthetic */ int m40349W0(ContactProfile contactProfile, ContactProfile contactProfile2) {
        float f11 = contactProfile.f42387W;
        float f12 = contactProfile2.f42387W;
        if (f11 < f12) {
            return -1;
        }
        if (f11 > f12) {
            return 1;
        }
        return 0;
    }

    /* renamed from: X0 */
    public static ContactProfile m40350X0(ContactProfile contactProfile, C17945a0 c17945a0, String str) {
        String str2;
        boolean z11;
        if (c17945a0.m94872D8()) {
            if (!c17945a0.m95014T6() && !c17945a0.m94865C8()) {
                z11 = false;
            } else {
                z11 = true;
            }
            str2 = C18446h.m97739b(z11);
        } else {
            str2 = "";
        }
        return new ContactProfile(contactProfile.f42434r, contactProfile.f42437s, contactProfile.f42446v, c17945a0.m95029V3(), str, c17945a0.mo95213o(), c17945a0.m95032V6(), c17945a0.m95160i6(), c17945a0.m95041W4(), c17945a0.m95089b4(), c17945a0.m95107d3(), 1, c17945a0.m95030V4(), str2);
    }

    /* renamed from: Y0 */
    public static ContactProfile m40351Y0(String str, String str2, String str3, MessageId messageId, long j11, String str4, boolean z11, int i11, int i12, int i13, int i14, int i15, String str5, String str6, long j12, String str7) {
        C7908f c7908f;
        JSONObject m117932a = AbstractC23008a2.m117932a(str5, true);
        if (m117932a != null) {
            c7908f = C7908f.Companion.m40878a(m117932a);
        } else {
            c7908f = null;
        }
        return new ContactProfile(str, str2, str3, messageId, j11, str4, z11, i11, i12, i13, i14, i15, c7908f, str6, j12, str7);
    }

    /* renamed from: Z0 */
    private void m40352Z0(Parcel parcel) {
        this.f42434r = parcel.readString();
        this.f42437s = parcel.readString();
        this.f42443u = parcel.readString();
        this.f42446v = parcel.readString();
        this.f42452x = parcel.readString();
        this.f42455y = parcel.readString();
        this.f42458z = parcel.readString();
        this.f42324B = parcel.readString();
        this.f42321A = parcel.readString();
        this.f42355L0 = parcel.readString();
        this.f42449w = parcel.readInt();
        this.f42339G = parcel.readInt();
        this.f42352K0 = parcel.readInt();
        this.f42336F = parcel.readLong();
        this.f42400b0 = parcel.readLong();
        this.f42357M = parcel.readDouble();
        this.f42323A1 = parcel.readString();
    }

    /* renamed from: g0 */
    public static String m40353g0(String str) {
        return "nativephone_" + str;
    }

    /* renamed from: w */
    public static ContactProfile m40356w(ContactProfile contactProfile) {
        ContactProfile contactProfile2 = new ContactProfile(contactProfile.f42434r);
        contactProfile2.f42437s = contactProfile.f42437s;
        contactProfile2.f42446v = contactProfile.f42446v;
        contactProfile2.f42455y = contactProfile.f42455y;
        contactProfile2.f42372R = contactProfile.m40392W();
        contactProfile2.f42375S = contactProfile.f42375S;
        contactProfile2.f42348J = contactProfile.f42348J;
        contactProfile2.f42413h1 = contactProfile.m40396a0();
        contactProfile2.f42387W = contactProfile.f42387W;
        contactProfile2.f42421l1 = contactProfile.f42421l1;
        contactProfile2.f42423m1 = contactProfile.f42423m1;
        contactProfile2.m40425q1(contactProfile.m40433v0());
        contactProfile2.f42352K0 = contactProfile.f42352K0;
        contactProfile2.f42436r1 = contactProfile.f42436r1;
        contactProfile2.f42439s1 = contactProfile.f42439s1;
        contactProfile2.f42376S0 = contactProfile.f42376S0;
        contactProfile2.f42373R0 = contactProfile.f42373R0;
        contactProfile2.f42329C1 = contactProfile.f42329C1;
        contactProfile2.f42332D1 = contactProfile.f42332D1;
        contactProfile2.f42458z = contactProfile.f42458z;
        contactProfile2.f42427o1 = contactProfile.f42427o1;
        contactProfile2.f42460z1 = contactProfile.f42460z1;
        contactProfile2.f42344H1 = contactProfile.f42344H1;
        contactProfile2.f42445u1 = contactProfile.f42445u1;
        contactProfile2.f42365O1 = contactProfile.f42365O1;
        contactProfile2.f42368P1 = contactProfile.f42368P1;
        contactProfile2.f42393Y = contactProfile.f42393Y;
        contactProfile2.f42390X = contactProfile.f42390X;
        contactProfile2.f42396Z = contactProfile.f42396Z;
        contactProfile2.f42371Q1 = contactProfile.f42371Q1;
        contactProfile2.f42357M = contactProfile.f42357M;
        contactProfile2.f42360N = contactProfile.f42360N;
        contactProfile2.f42359M1 = contactProfile.f42359M1;
        contactProfile2.f42361N0 = contactProfile.f42361N0;
        contactProfile2.f42364O0 = contactProfile.f42364O0;
        return contactProfile2;
    }

    /* renamed from: A0 */
    public boolean m40357A0() {
        return this.f42361N0 == 2;
    }

    /* renamed from: B */
    public String m40358B() {
        return this.f42327C;
    }

    /* renamed from: B0 */
    public boolean m40359B0() {
        return (this.f42352K0 & 4) == 4;
    }

    /* renamed from: C */
    public String m40360C() {
        if (!C18631a.m98446i().f93749a) {
            this.f42445u1 = "";
            return "";
        }
        String m98454g = C18631a.m98446i().m98454g(this.f42434r);
        this.f42445u1 = m98454g;
        return m98454g;
    }

    /* renamed from: D */
    public C16948d m40361D() {
        return new C16948d(1, this.f42434r, m40383Q(true, false), this.f42446v);
    }

    /* renamed from: D0 */
    public boolean m40362D0() {
        return this.f42448v1;
    }

    /* renamed from: E0 */
    public boolean m40363E0() {
        C31973j5 m40388T;
        if (!m40374K0() || (m40388T = m40388T(true)) == null || !m40388T.m153747Y()) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public C3433b m40364F() {
        String str = this.f42364O0;
        if (str != null && !str.isEmpty()) {
            try {
                return new C3433b(new JSONObject(this.f42364O0));
            } catch (Exception e11) {
                AbstractC20110a.m104540i(e11, "baInfo invalid: " + this.f42364O0, new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: F0 */
    public boolean m40365F0() {
        return this.f42409f1;
    }

    /* renamed from: G0 */
    public boolean m40366G0() {
        return this.f42333E;
    }

    /* renamed from: H */
    public int m40367H() {
        C3433b m40364F = m40364F();
        if (m40364F == null) {
            return 0;
        }
        return m40364F.m17256i();
    }

    /* renamed from: H0 */
    public int m40368H0() {
        return this.f42331D0;
    }

    /* renamed from: I */
    public long m40369I() {
        return this.f42451w1;
    }

    /* renamed from: I0 */
    public boolean m40370I0() {
        return this.f42328C0;
    }

    /* renamed from: J */
    public String m40371J() {
        C31901e8 m2801g = AbstractC0906d0.m2801g(MainApplication.getAppContext(), this.f42434r);
        if (m2801g != null && this.f42434r.equals(String.valueOf(m2801g.m153300r()))) {
            return m2801g.m153295h();
        }
        return "";
    }

    /* renamed from: J0 */
    public boolean m40372J0() {
        return AbstractC25495a.m132078c(this.f42434r);
    }

    /* renamed from: K */
    public String m40373K() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("{");
            sb2.append("\"dpn\":");
            sb2.append(JSONObject.quote(this.f42437s));
            sb2.append(",");
            sb2.append("\"uid\":");
            sb2.append(JSONObject.quote(this.f42434r));
            sb2.append(",");
            sb2.append("\"usr\":");
            sb2.append(JSONObject.quote(this.f42443u));
            sb2.append(",");
            sb2.append("\"avt\":");
            sb2.append(JSONObject.quote(this.f42446v));
            sb2.append(",");
            sb2.append("\"ged\":");
            sb2.append(JSONObject.quote("" + this.f42449w));
            sb2.append(",");
            sb2.append("\"sdob\":");
            sb2.append(JSONObject.quote(this.f42452x));
            sb2.append(",");
            sb2.append("\"dob\":");
            sb2.append(JSONObject.quote("" + this.f42400b0));
            sb2.append(",");
            sb2.append("\"phone\":");
            sb2.append(JSONObject.quote(this.f42455y));
            sb2.append(",");
            sb2.append("\"stt\":");
            sb2.append(JSONObject.quote(this.f42458z));
            sb2.append(",");
            sb2.append("\"last_action\":");
            sb2.append(JSONObject.quote("" + this.f42336F));
            sb2.append(",");
            sb2.append("\"receive_type\":");
            sb2.append(JSONObject.quote("" + this.f42339G));
            sb2.append(",");
            sb2.append("\"cover\":");
            sb2.append(JSONObject.quote(this.f42324B));
            sb2.append(",");
            sb2.append("\"tag\":");
            sb2.append(JSONObject.quote(this.f42346I0));
            sb2.append(",");
            sb2.append("\"showButton\":");
            if (this.f42349J0) {
                str = "1";
            } else {
                str = "0";
            }
            sb2.append(str);
            sb2.append(",");
            sb2.append("\"type\":");
            sb2.append(JSONObject.quote("" + this.f42352K0));
            sb2.append(",");
            sb2.append("\"detail_url\":");
            sb2.append(JSONObject.quote(this.f42355L0));
            sb2.append(",");
            sb2.append("\"uname\":");
            sb2.append(JSONObject.quote(this.f42460z1));
            sb2.append(",");
            sb2.append("\"name_score\":");
            sb2.append(JSONObject.quote("" + this.f42357M));
            sb2.append(",");
            sb2.append("\"voice\":");
            sb2.append(JSONObject.quote(this.f42321A));
            sb2.append(",");
            sb2.append("\"reqSrc\":");
            sb2.append(JSONObject.quote("" + this.f42373R0));
            sb2.append(",");
            sb2.append("\"unmap_profile\":");
            sb2.append(this.f42341G1);
            sb2.append(",");
            sb2.append("\"avt_full\":");
            sb2.append(JSONObject.quote(this.f42323A1));
            sb2.append(",");
            sb2.append("\"account_type\":");
            sb2.append(this.f42361N0);
            sb2.append(",");
            sb2.append("\"business_account\":");
            if (TextUtils.isEmpty(this.f42364O0)) {
                str2 = "\"\"";
            } else {
                str2 = this.f42364O0;
            }
            sb2.append(str2);
            sb2.append("}");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return sb2.toString();
    }

    /* renamed from: K0 */
    public boolean m40374K0() {
        return AbstractC25495a.m132079d(this.f42434r);
    }

    /* renamed from: L0 */
    public boolean m40375L0() {
        C7868d c7868d = this.f42366P;
        if (c7868d != null && !TextUtils.isEmpty(c7868d.f42479m)) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public ItemAlbumMobile m40376M() {
        ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
        try {
            String str = this.f42324B;
            itemAlbumMobile.f42607x = str;
            itemAlbumMobile.f42548C = str;
            itemAlbumMobile.f42605w = this.f42437s;
            itemAlbumMobile.f42593q = this.f42434r;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return itemAlbumMobile;
    }

    /* renamed from: M0 */
    public boolean m40377M0() {
        C18446h c18446h = this.f42372R;
        if (c18446h != null && c18446h.m97758w()) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public String m40378N() {
        return this.f42378T;
    }

    /* renamed from: N0 */
    public boolean m40379N0() {
        if (m40433v0() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public CharSequence m40380O() {
        String str;
        ContactProfile contactProfile;
        String str2;
        int m40432u0 = m40432u0();
        String str3 = "";
        if (m40432u0 != 0) {
            if (m40432u0 != 51) {
                if (m40432u0 == 52) {
                    C31986k3 c31986k3 = C31986k3.f147083a;
                    if (!c31986k3.m154110T1() && m40377M0()) {
                        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_decrypted_failed_incognito_sender);
                    }
                    if (!c31986k3.m154110T1()) {
                        if (m40374K0()) {
                            contactProfile = C28203u6.f131407a.m141809c(m40394Y().m41050n());
                        } else {
                            contactProfile = this;
                        }
                        if (contactProfile != null) {
                            str3 = contactProfile.m40383Q(true, false);
                        }
                        if (TextUtils.isEmpty(str3)) {
                            if (m40374K0()) {
                                str2 = this.f42413h1;
                            } else {
                                str2 = this.f42437s;
                            }
                            str3 = str2;
                        }
                        if (TextUtils.isEmpty(str3)) {
                            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_decrypted_failed_incognito_sender);
                        }
                        return AbstractC23136l9.m118746s0(AbstractC8020f0.str_e2ee_decrypted_failed_incognito, str3);
                    }
                    return AbstractC23136l9.m118743r0(AbstractC8020f0.str_unable_e2ee_decrypted_failed);
                }
            } else {
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_waiting_e2ee_decrypted_failed);
            }
        }
        if (!C28652r.f132825q) {
            C28652r.f132826r = true;
            return this.f42378T;
        }
        if (this.f42381U == null) {
            if (!TextUtils.isEmpty(this.f42378T)) {
                if (this.f42378T.length() > 150) {
                    str = this.f42378T.substring(0, 150);
                } else {
                    str = this.f42378T;
                }
                this.f42381U = C28652r.m143349v().m143357H(AbstractC23244v8.m119734D(str));
            } else {
                this.f42381U = "";
            }
        }
        return this.f42381U;
    }

    /* renamed from: O0 */
    public boolean m40381O0() {
        return this.f42434r.startsWith("nativephone_");
    }

    /* renamed from: P0 */
    public boolean m40382P0() {
        if (!m40374K0() && !m40387S0()) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public String m40383Q(boolean z11, boolean z12) {
        return m40385R(z11, z12, true);
    }

    /* renamed from: Q0 */
    public boolean m40384Q0() {
        return AbstractC25495a.m132078c(this.f42434r);
    }

    /* renamed from: R */
    public String m40385R(boolean z11, boolean z12, boolean z13) {
        if (m40374K0()) {
            return this.f42437s;
        }
        if (!z13 && !z11) {
            return AbstractC21935u.m114541h(this.f42455y, this.f42437s, z12);
        }
        return AbstractC21935u.m114540g(this.f42455y, this.f42434r, this.f42437s, z13);
    }

    /* renamed from: S */
    public String m40386S() {
        return this.f42386V1;
    }

    /* renamed from: S0 */
    public boolean m40387S0() {
        return (this.f42352K0 & 1) == 1;
    }

    /* renamed from: T */
    public C31973j5 m40388T(boolean z11) {
        C31973j5 m4473g = C0943w.f3447a.m4473g(this.f42434r);
        if (m4473g == null && z11) {
            C0824j.m2153b(new C7865a());
        }
        return m4473g;
    }

    /* renamed from: U */
    public C31973j5 m40389U() {
        return C0943w.f3447a.m4472f(this.f42434r);
    }

    /* renamed from: U0 */
    public boolean m40390U0() {
        return this.f42345I;
    }

    /* renamed from: V */
    public String m40391V() {
        C3433b m40364F = m40364F();
        if (m40364F != null) {
            return m40364F.m17255h();
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_label_business_account);
    }

    /* renamed from: W */
    public C18446h m40392W() {
        return this.f42372R;
    }

    /* renamed from: X */
    public int m40393X() {
        C18446h c18446h = this.f42372R;
        if (c18446h != null) {
            return c18446h.m97746e();
        }
        return 0;
    }

    /* renamed from: Y */
    public MessageId m40394Y() {
        C18446h c18446h = this.f42372R;
        if (c18446h != null) {
            return c18446h.m97747g();
        }
        return null;
    }

    /* renamed from: Z */
    public C31924g1 m40395Z() {
        return this.f42384V;
    }

    /* renamed from: a0 */
    public String m40396a0() {
        return this.f42413h1;
    }

    /* renamed from: a1 */
    public void m40397a1(String str) {
        this.f42327C = str;
    }

    @Override // ai.InterfaceC0863c
    /* renamed from: b */
    public String mo2478b() {
        return this.f42434r;
    }

    /* renamed from: b0 */
    public int m40398b0() {
        C18446h c18446h = this.f42372R;
        if (c18446h != null) {
            return c18446h.m97748h();
        }
        return 2;
    }

    /* renamed from: b1 */
    public void m40399b1(long j11) {
        this.f42451w1 = j11;
        this.f42448v1 = true;
    }

    @Override // ai.InterfaceC0861a
    /* renamed from: c */
    public String mo2475c() {
        return this.f42437s;
    }

    /* renamed from: c1 */
    public void m40400c1(boolean z11) {
        this.f42409f1 = z11;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: d */
    public float mo2479d() {
        return this.f42387W;
    }

    /* renamed from: d1 */
    public void m40401d1(String str) {
        if (str == null) {
            return;
        }
        this.f42378T = str;
        this.f42381U = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // ai.InterfaceC0861a
    /* renamed from: e */
    public void mo2476e(String str) {
        this.f42437s = str;
    }

    /* renamed from: e0 */
    public long m40402e0() {
        C18446h c18446h = this.f42372R;
        if (c18446h != null) {
            return c18446h.m97753r();
        }
        return 0L;
    }

    /* renamed from: e1 */
    public void m40403e1(boolean z11) {
        this.f42333E = z11;
    }

    /* renamed from: f1 */
    public void m40404f1(int i11) {
        this.f42331D0 = i11;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: g */
    public int mo2481g() {
        return this.f42365O1;
    }

    /* renamed from: g1 */
    public void m40405g1(boolean z11) {
        this.f42328C0 = z11;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: h */
    public List mo2482h() {
        return this.f42399a1;
    }

    /* renamed from: h0 */
    public JSONObject m40406h0() {
        return this.f42343H0;
    }

    /* renamed from: h1 */
    public void m40407h1(String str) {
        if (!TextUtils.equals(str, this.f42386V1)) {
            this.f42386V1 = str;
            C31943h5.f146766a.m153510n(this.f42434r, str);
        }
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: i */
    public void mo2483i(float f11) {
        this.f42387W = f11;
    }

    /* renamed from: i0 */
    public String m40408i0() {
        return this.f42337F0;
    }

    /* renamed from: i1 */
    public void m40409i1(C18446h c18446h) {
        this.f42372R = c18446h;
    }

    @Override // ai.InterfaceC0864d
    /* renamed from: j */
    public void mo2484j(int i11) {
        this.f42365O1 = i11;
    }

    /* renamed from: j0 */
    public int m40410j0() {
        return this.f42334E0;
    }

    /* renamed from: j1 */
    public void m40411j1(int i11) {
        if (this.f42372R == null) {
            this.f42372R = new C18446h(0L);
        }
        this.f42372R.m97760y(i11);
    }

    /* renamed from: k0 */
    public String m40412k0() {
        return this.f42325B0;
    }

    /* renamed from: k1 */
    public void m40413k1(JSONObject jSONObject) {
        this.f42343H0 = jSONObject;
    }

    /* renamed from: l0 */
    public String m40414l0() {
        return this.f42340G0;
    }

    /* renamed from: l1 */
    public void m40415l1(String str) {
        this.f42325B0 = str;
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    this.f42322A0.clear();
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject jSONObject = (JSONObject) jSONArray.get(i11);
                        if (jSONObject != null) {
                            this.f42322A0.add(new C7867c(jSONObject));
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: m0 */
    public String m40416m0() {
        return this.f42455y;
    }

    /* renamed from: m1 */
    public void m40417m1(String str) {
        this.f42455y = str;
        if (TextUtils.isEmpty(this.f42431q)) {
            this.f42431q = this.f42437s;
        }
        String trim = AbstractC21935u.m114542i(this.f42434r, this.f42431q).trim();
        this.f42437s = trim;
        this.f42440t = AbstractC23262x6.m120002o(trim).trim();
    }

    /* renamed from: n0 */
    public String m40418n0() {
        if (TextUtils.isEmpty(this.f42427o1)) {
            this.f42427o1 = AbstractC23028c0.m118087g(m40383Q(true, false));
        }
        return this.f42427o1;
    }

    /* renamed from: n1 */
    public void m40419n1(boolean z11) {
        if (z11) {
            this.f42451w1 |= 1;
        } else {
            this.f42451w1 &= -2;
        }
        this.f42448v1 = true;
    }

    /* renamed from: o0 */
    public String m40420o0() {
        String m40383Q = m40383Q(true, false);
        if (m40383Q != null && m40383Q.length() > 32) {
            return m40383Q.substring(0, 32) + "...";
        }
        return m40383Q;
    }

    /* renamed from: o1 */
    public void m40421o1(int i11) {
        if (this.f42372R == null) {
            this.f42372R = new C18446h(0L);
        }
        this.f42372R.m97743D(i11);
    }

    /* renamed from: p0 */
    public int m40422p0() {
        return this.f42450w0;
    }

    /* renamed from: p1 */
    public void m40423p1(boolean z11) {
        this.f42345I = z11;
    }

    /* renamed from: q0 */
    public int m40424q0() {
        return this.f42417j1;
    }

    /* renamed from: q1 */
    public void m40425q1(int i11) {
        this.f42342H = i11;
    }

    /* renamed from: r0 */
    public int m40426r0() {
        return this.f42428p;
    }

    /* renamed from: r1 */
    public void m40427r1() {
        int i11 = this.f42394Y0;
        if (i11 != 1 && i11 != 2) {
            this.f42395Y1 = 0;
        } else if (this.f42415i1 == 1) {
            this.f42395Y1 = 3;
        } else {
            this.f42395Y1 = i11;
        }
    }

    /* renamed from: s1 */
    public void m40428s1(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C31922g c31922g = new C31922g(new JSONObject(str));
            if (c31922g.m153387i()) {
                this.f42389W1 = c31922g;
                this.f42383U1 = str;
            }
            if (this.f42389W1 == null) {
                this.f42389W1 = C31922g.m153381c();
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t */
    public int m40429t() {
        return Integer.parseInt(AbstractC23160o0.m119280p1(AbstractC23306f.m120579F1().mo124314i())) - Integer.parseInt(AbstractC23160o0.m119280p1(this.f42400b0 * 1000));
    }

    /* renamed from: t0 */
    public int m40430t0() {
        return this.f42352K0;
    }

    public String toString() {
        return "ContactProfile{uid='" + this.f42434r + "', dpn='" + this.f42437s + "'}";
    }

    /* renamed from: u */
    public boolean m40431u() {
        return this.f42450w0 == 1;
    }

    /* renamed from: u0 */
    public int m40432u0() {
        C18446h c18446h = this.f42372R;
        if (c18446h != null) {
            return c18446h.m97755t();
        }
        return 0;
    }

    /* renamed from: v0 */
    public int m40433v0() {
        return this.f42342H;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f42434r);
        parcel.writeString(this.f42437s);
        parcel.writeString(this.f42443u);
        parcel.writeString(this.f42446v);
        parcel.writeString(this.f42452x);
        parcel.writeString(this.f42455y);
        parcel.writeString(this.f42458z);
        parcel.writeString(this.f42324B);
        parcel.writeString(this.f42321A);
        parcel.writeString(this.f42355L0);
        parcel.writeInt(this.f42449w);
        parcel.writeInt(this.f42339G);
        parcel.writeInt(this.f42352K0);
        parcel.writeLong(this.f42336F);
        parcel.writeLong(this.f42400b0);
        parcel.writeDouble(this.f42357M);
        parcel.writeString(this.f42323A1);
    }

    /* renamed from: x */
    public void m40434x(ContactProfile contactProfile) {
        this.f42451w1 = contactProfile.f42451w1;
        this.f42448v1 = contactProfile.f42448v1;
    }

    /* renamed from: x0 */
    public boolean m40435x0() {
        int i11 = this.f42395Y1;
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    /* renamed from: y */
    public boolean m40436y() {
        int m40368H0 = m40368H0();
        if (m40368H0 == 1 || m40368H0 == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m40437z() {
        int m40368H0 = m40368H0();
        if (m40368H0 != 2 && m40368H0 != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: z0 */
    public boolean m40438z0() {
        if (m40387S0() && this.f42391X0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.zing.zalo.control.ContactProfile$c */
    /* loaded from: classes3.dex */
    public static class C7867c {

        /* renamed from: a */
        private String f42462a;

        /* renamed from: b */
        private String f42463b;

        /* renamed from: c */
        private String f42464c;

        /* renamed from: d */
        private int f42465d;

        /* renamed from: e */
        private JSONObject f42466e;

        public C7867c() {
            this.f42462a = "";
            this.f42463b = "";
            this.f42464c = "";
            this.f42465d = 0;
            this.f42466e = new JSONObject();
        }

        /* renamed from: a */
        public String m40441a() {
            return this.f42462a;
        }

        /* renamed from: b */
        public int m40442b() {
            return this.f42465d;
        }

        /* renamed from: c */
        public String m40443c() {
            return this.f42464c;
        }

        /* renamed from: d */
        public String m40444d() {
            return this.f42463b;
        }

        /* renamed from: e */
        public JSONObject m40445e() {
            return this.f42466e;
        }

        public C7867c(JSONObject jSONObject) {
            this();
            try {
                this.f42462a = AbstractC18069a.m96089h(jSONObject, "dept_key");
                this.f42463b = AbstractC18069a.m96089h(jSONObject, "dept_name");
                this.f42464c = AbstractC18069a.m96089h(jSONObject, "icon");
                this.f42465d = AbstractC18069a.m96085d(jSONObject, "icon_type");
                this.f42466e = jSONObject;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.control.ContactProfile$i */
    /* loaded from: classes3.dex */
    public static class C7873i {

        /* renamed from: a */
        boolean f42508a;

        /* renamed from: b */
        long f42509b;

        public C7873i(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f42508a = jSONObject.optBoolean("autoplay");
                this.f42509b = jSONObject.optLong("seek");
            }
        }

        /* renamed from: a */
        public long m40471a() {
            return this.f42509b;
        }

        /* renamed from: b */
        public JSONObject m40472b() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("autoplay", this.f42508a);
                jSONObject.put("seek", this.f42509b);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        public C7873i(C7873i c7873i) {
            if (c7873i != null) {
                this.f42508a = c7873i.f42508a;
                this.f42509b = c7873i.f42509b;
            }
        }

        public C7873i() {
            this.f42508a = false;
            this.f42509b = 0L;
        }
    }

    /* renamed from: com.zing.zalo.control.ContactProfile$l */
    /* loaded from: classes3.dex */
    public static class C7876l {

        /* renamed from: a */
        String f42515a;

        /* renamed from: b */
        String f42516b;

        /* renamed from: c */
        public boolean f42517c;

        public C7876l(JSONObject jSONObject) {
            this.f42515a = "";
            this.f42516b = "";
            this.f42517c = false;
            if (jSONObject != null) {
                this.f42515a = jSONObject.optString("icon", "");
                this.f42516b = jSONObject.optString("name", "");
            }
        }

        /* renamed from: a */
        public String m40474a() {
            return this.f42516b;
        }

        /* renamed from: b */
        public JSONObject m40475b() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("icon", this.f42515a);
                jSONObject.put("name", this.f42516b);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        public C7876l(C7876l c7876l) {
            this.f42515a = "";
            this.f42516b = "";
            this.f42517c = false;
            this.f42515a = c7876l.f42515a;
            this.f42516b = c7876l.f42516b;
        }

        public C7876l() {
            this.f42517c = false;
            this.f42516b = "";
            this.f42515a = "";
        }

        public C7876l(String str, String str2) {
            this.f42517c = false;
            this.f42515a = str2;
            this.f42516b = str;
        }
    }

    /* renamed from: com.zing.zalo.control.ContactProfile$e */
    /* loaded from: classes3.dex */
    public static class C7869e {

        /* renamed from: a */
        String f42492a;

        /* renamed from: b */
        String f42493b;

        /* renamed from: c */
        String f42494c;

        public C7869e(JSONObject jSONObject) {
            this.f42492a = "";
            this.f42493b = "";
            this.f42494c = "";
            if (jSONObject != null) {
                this.f42492a = jSONObject.optString("icon", "");
                this.f42493b = jSONObject.optString("description", "");
                this.f42494c = jSONObject.optString("text", "");
            }
        }

        /* renamed from: a */
        public JSONObject m40452a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("icon", this.f42492a);
                jSONObject.put("description", this.f42493b);
                jSONObject.put("text", this.f42494c);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        public C7869e() {
            this.f42492a = "";
            this.f42493b = "";
            this.f42494c = "";
        }

        public C7869e(C7869e c7869e) {
            this.f42492a = "";
            this.f42493b = "";
            this.f42494c = "";
            this.f42492a = c7869e.f42492a;
            this.f42493b = c7869e.f42493b;
            this.f42494c = c7869e.f42494c;
        }
    }

    /* renamed from: com.zing.zalo.control.ContactProfile$f */
    /* loaded from: classes3.dex */
    public static class C7870f {

        /* renamed from: a */
        String f42495a;

        /* renamed from: b */
        String f42496b;

        /* renamed from: c */
        String f42497c;

        public C7870f(JSONObject jSONObject) {
            this.f42495a = "";
            this.f42496b = "";
            this.f42497c = "";
            if (jSONObject != null) {
                try {
                    this.f42495a = jSONObject.optString("thumbUrl");
                    this.f42496b = jSONObject.optString("gifUrl");
                    this.f42497c = jSONObject.optString("caption");
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public String m40453a() {
            return this.f42497c;
        }

        /* renamed from: b */
        public String m40454b() {
            return this.f42496b;
        }

        /* renamed from: c */
        public String m40455c() {
            return this.f42495a;
        }

        /* renamed from: d */
        public boolean m40456d() {
            if (!TextUtils.isEmpty(this.f42497c) && (!TextUtils.isEmpty(this.f42495a) || !TextUtils.isEmpty(this.f42496b))) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public JSONObject m40457e() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("thumbUrl", this.f42495a);
                jSONObject.put("gifUrl", this.f42496b);
                jSONObject.put("caption", this.f42497c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        public C7870f(C7870f c7870f) {
            this.f42495a = "";
            this.f42496b = "";
            this.f42497c = "";
            if (c7870f != null) {
                this.f42495a = c7870f.f42495a;
                this.f42496b = c7870f.f42496b;
                this.f42497c = c7870f.f42497c;
            }
        }

        public C7870f() {
            this.f42495a = "";
            this.f42496b = "";
            this.f42497c = "";
        }
    }

    public ContactProfile() {
        this.f42428p = 0;
        this.f42431q = "";
        this.f42434r = "";
        this.f42437s = "";
        this.f42440t = "";
        this.f42443u = "";
        this.f42446v = "";
        this.f42449w = 0;
        this.f42452x = "";
        this.f42455y = "";
        this.f42458z = "";
        this.f42321A = "";
        this.f42324B = "";
        this.f42327C = "";
        this.f42330D = 0L;
        this.f42333E = true;
        this.f42336F = 0L;
        this.f42339G = 1;
        this.f42342H = 0;
        this.f42345I = false;
        this.f42348J = null;
        this.f42354L = "";
        this.f42357M = 0.0d;
        this.f42360N = "";
        this.f42363O = "";
        this.f42366P = null;
        this.f42369Q = 0;
        this.f42372R = null;
        this.f42375S = 1;
        this.f42378T = "";
        this.f42387W = 0.0f;
        this.f42390X = -1;
        this.f42393Y = false;
        this.f42396Z = 0;
        this.f42398a0 = 0;
        this.f42400b0 = 0L;
        this.f42402c0 = "";
        this.f42404d0 = -1;
        this.f42406e0 = "";
        this.f42408f0 = "";
        this.f42410g0 = "";
        this.f42412h0 = 0;
        this.f42414i0 = 0;
        this.f42416j0 = -1L;
        this.f42418k0 = 0L;
        this.f42420l0 = "";
        this.f42422m0 = "";
        this.f42424n0 = 0;
        this.f42426o0 = "";
        this.f42429p0 = "";
        this.f42432q0 = 0;
        this.f42435r0 = 0;
        this.f42438s0 = 0;
        this.f42441t0 = false;
        this.f42444u0 = false;
        this.f42447v0 = 1;
        this.f42450w0 = -1;
        this.f42453x0 = 1;
        this.f42456y0 = 0;
        this.f42459z0 = null;
        this.f42322A0 = new ArrayList();
        this.f42325B0 = "";
        this.f42328C0 = false;
        this.f42343H0 = new JSONObject();
        this.f42346I0 = "";
        this.f42349J0 = false;
        this.f42352K0 = 0;
        this.f42355L0 = "";
        this.f42358M0 = "";
        this.f42361N0 = 0;
        this.f42367P0 = null;
        this.f42370Q0 = false;
        this.f42373R0 = -1;
        this.f42376S0 = 0;
        this.f42382U0 = 0;
        this.f42385V0 = 0;
        this.f42388W0 = 1;
        this.f42391X0 = false;
        this.f42394Y0 = 0;
        this.f42397Z0 = null;
        this.f42399a1 = new ArrayList();
        this.f42401b1 = new ArrayList();
        this.f42403c1 = false;
        this.f42405d1 = false;
        this.f42407e1 = false;
        this.f42409f1 = false;
        this.f42411g1 = false;
        this.f42413h1 = "";
        this.f42415i1 = 0;
        this.f42417j1 = -1;
        this.f42419k1 = "";
        this.f42421l1 = 0;
        this.f42423m1 = 0L;
        this.f42425n1 = 0;
        this.f42427o1 = "";
        this.f42430p1 = false;
        this.f42433q1 = "";
        this.f42436r1 = new SpannableStringBuilder();
        this.f42439s1 = new SpannableStringBuilder();
        this.f42442t1 = "";
        this.f42445u1 = "";
        this.f42448v1 = false;
        this.f42451w1 = 0L;
        this.f42460z1 = "";
        this.f42323A1 = "";
        this.f42326B1 = false;
        this.f42329C1 = 1;
        this.f42332D1 = 1;
        this.f42335E1 = 0;
        this.f42338F1 = 0;
        this.f42341G1 = 0;
        this.f42344H1 = false;
        this.f42347I1 = 0L;
        this.f42350J1 = -1;
        this.f42353K1 = -1;
        this.f42356L1 = false;
        this.f42359M1 = false;
        this.f42365O1 = 4;
        this.f42368P1 = 0;
        this.f42371Q1 = "";
        this.f42380T1 = false;
        this.f42392X1 = -1;
    }

    /* renamed from: com.zing.zalo.control.ContactProfile$g */
    /* loaded from: classes3.dex */
    public static class C7871g {

        /* renamed from: a */
        String f42498a;

        /* renamed from: b */
        String f42499b;

        /* renamed from: c */
        String f42500c;

        /* renamed from: d */
        String f42501d;

        /* renamed from: e */
        String f42502e;

        /* renamed from: f */
        String f42503f;

        public C7871g(JSONObject jSONObject) {
            this.f42498a = "";
            this.f42499b = "";
            this.f42500c = "";
            this.f42501d = "";
            this.f42502e = "";
            this.f42503f = "";
            if (jSONObject != null) {
                try {
                    this.f42498a = jSONObject.optString("thumb");
                    this.f42499b = jSONObject.optString("title");
                    this.f42500c = jSONObject.optString("description");
                    this.f42501d = jSONObject.optString("buttonTitle");
                    this.f42502e = jSONObject.optString("actionType");
                    if (jSONObject.has("actionData")) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("actionData");
                        this.f42503f = optJSONObject != null ? optJSONObject.toString() : "";
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public String m40458a() {
            return this.f42503f;
        }

        /* renamed from: b */
        public String m40459b() {
            return this.f42502e;
        }

        /* renamed from: c */
        public String m40460c() {
            return this.f42501d;
        }

        /* renamed from: d */
        public String m40461d() {
            return this.f42500c;
        }

        /* renamed from: e */
        public String m40462e() {
            return this.f42498a;
        }

        /* renamed from: f */
        public boolean m40463f() {
            if (!TextUtils.isEmpty(this.f42502e) && !TextUtils.isEmpty(this.f42503f)) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public JSONObject m40464g() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            JSONObject jSONObject = new JSONObject();
            try {
                Object obj = "";
                if (TextUtils.isEmpty(this.f42498a)) {
                    str = "";
                } else {
                    str = this.f42498a;
                }
                jSONObject.put("thumb", str);
                if (TextUtils.isEmpty(this.f42499b)) {
                    str2 = "";
                } else {
                    str2 = this.f42499b;
                }
                jSONObject.put("title", str2);
                if (TextUtils.isEmpty(this.f42500c)) {
                    str3 = "";
                } else {
                    str3 = this.f42500c;
                }
                jSONObject.put("description", str3);
                if (TextUtils.isEmpty(this.f42501d)) {
                    str4 = "";
                } else {
                    str4 = this.f42501d;
                }
                jSONObject.put("buttonTitle", str4);
                if (TextUtils.isEmpty(this.f42502e)) {
                    str5 = "";
                } else {
                    str5 = this.f42502e;
                }
                jSONObject.put("actionType", str5);
                if (!TextUtils.isEmpty(this.f42503f)) {
                    obj = new JSONObject(this.f42503f);
                }
                jSONObject.put("actionData", obj);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        public C7871g(C7871g c7871g) {
            this.f42498a = "";
            this.f42499b = "";
            this.f42500c = "";
            this.f42501d = "";
            this.f42502e = "";
            this.f42503f = "";
            if (c7871g != null) {
                this.f42498a = c7871g.f42498a;
                this.f42499b = c7871g.f42499b;
                this.f42500c = c7871g.f42500c;
                this.f42501d = c7871g.f42501d;
                this.f42502e = c7871g.f42502e;
                this.f42503f = c7871g.f42503f;
            }
        }

        public C7871g() {
            this.f42498a = "";
            this.f42499b = "";
            this.f42500c = "";
            this.f42501d = "";
            this.f42502e = "";
            this.f42503f = "";
        }
    }

    /* renamed from: com.zing.zalo.control.ContactProfile$h */
    /* loaded from: classes3.dex */
    public static class C7872h {

        /* renamed from: a */
        List f42504a;

        /* renamed from: b */
        C7870f f42505b;

        /* renamed from: c */
        C7873i f42506c;

        /* renamed from: d */
        C7871g f42507d;

        public C7872h(JSONObject jSONObject) {
            JSONArray optJSONArray;
            try {
                this.f42504a = new ArrayList();
                if (jSONObject != null) {
                    if (jSONObject.has("songId") && (optJSONArray = jSONObject.optJSONArray("songId")) != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            this.f42504a.add(optJSONArray.optString(i11));
                        }
                    }
                    if (jSONObject.has("emptyInfo")) {
                        this.f42505b = new C7870f(jSONObject.optJSONObject("emptyInfo"));
                    }
                    if (jSONObject.has("config")) {
                        this.f42506c = new C7873i(jSONObject.optJSONObject("config"));
                    }
                    if (jSONObject.has("footerInfo")) {
                        this.f42507d = new C7871g(jSONObject.optJSONObject("footerInfo"));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: a */
        public C7870f m40465a() {
            return this.f42505b;
        }

        /* renamed from: b */
        public C7871g m40466b() {
            return this.f42507d;
        }

        /* renamed from: c */
        public C7873i m40467c() {
            return this.f42506c;
        }

        /* renamed from: d */
        public List m40468d() {
            return this.f42504a;
        }

        /* renamed from: e */
        public JSONObject m40469e() {
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.f42504a != null) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = this.f42504a.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    jSONObject.put("songId", jSONArray);
                }
                C7873i c7873i = this.f42506c;
                if (c7873i != null) {
                    jSONObject.put("config", c7873i.m40472b());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        /* renamed from: f */
        public JSONObject m40470f() {
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.f42504a != null) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = this.f42504a.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    jSONObject.put("songId", jSONArray);
                }
                C7870f c7870f = this.f42505b;
                if (c7870f != null) {
                    jSONObject.put("emptyInfo", c7870f.m40457e());
                }
                C7873i c7873i = this.f42506c;
                if (c7873i != null) {
                    jSONObject.put("config", c7873i.m40472b());
                }
                C7871g c7871g = this.f42507d;
                if (c7871g != null) {
                    jSONObject.put("footerInfo", c7871g.m40464g());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        public C7872h(C7872h c7872h) {
            if (c7872h != null) {
                this.f42504a = new ArrayList(c7872h.f42504a);
                this.f42505b = new C7870f(c7872h.f42505b);
                this.f42506c = new C7873i(c7872h.f42506c);
                this.f42507d = new C7871g(c7872h.f42507d);
            }
        }

        public C7872h() {
            this.f42504a = new ArrayList();
            this.f42505b = new C7870f();
            this.f42506c = new C7873i();
            this.f42507d = new C7871g();
        }

        public C7872h(List list, C7870f c7870f, C7873i c7873i, C7871g c7871g) {
            this.f42504a = list != null ? new ArrayList(list) : new ArrayList();
            this.f42505b = c7870f != null ? new C7870f(c7870f) : new C7870f();
            this.f42506c = c7873i != null ? new C7873i(c7873i) : new C7873i();
            this.f42507d = c7871g != null ? new C7871g(c7871g) : new C7871g();
        }
    }

    public ContactProfile(ContactProfile contactProfile) {
        this.f42428p = 0;
        this.f42431q = "";
        this.f42434r = "";
        this.f42437s = "";
        this.f42440t = "";
        this.f42443u = "";
        this.f42446v = "";
        this.f42449w = 0;
        this.f42452x = "";
        this.f42455y = "";
        this.f42458z = "";
        this.f42321A = "";
        this.f42324B = "";
        this.f42327C = "";
        this.f42330D = 0L;
        this.f42333E = true;
        this.f42336F = 0L;
        this.f42339G = 1;
        this.f42342H = 0;
        this.f42345I = false;
        this.f42348J = null;
        this.f42354L = "";
        this.f42357M = 0.0d;
        this.f42360N = "";
        this.f42363O = "";
        this.f42366P = null;
        this.f42369Q = 0;
        this.f42372R = null;
        this.f42375S = 1;
        this.f42378T = "";
        this.f42387W = 0.0f;
        this.f42390X = -1;
        this.f42393Y = false;
        this.f42396Z = 0;
        this.f42398a0 = 0;
        this.f42400b0 = 0L;
        this.f42402c0 = "";
        this.f42404d0 = -1;
        this.f42406e0 = "";
        this.f42408f0 = "";
        this.f42410g0 = "";
        this.f42412h0 = 0;
        this.f42414i0 = 0;
        this.f42416j0 = -1L;
        this.f42418k0 = 0L;
        this.f42420l0 = "";
        this.f42422m0 = "";
        this.f42424n0 = 0;
        this.f42426o0 = "";
        this.f42429p0 = "";
        this.f42432q0 = 0;
        this.f42435r0 = 0;
        this.f42438s0 = 0;
        this.f42441t0 = false;
        this.f42444u0 = false;
        this.f42447v0 = 1;
        this.f42450w0 = -1;
        this.f42453x0 = 1;
        this.f42456y0 = 0;
        this.f42459z0 = null;
        this.f42322A0 = new ArrayList();
        this.f42325B0 = "";
        this.f42328C0 = false;
        this.f42343H0 = new JSONObject();
        this.f42346I0 = "";
        this.f42349J0 = false;
        this.f42352K0 = 0;
        this.f42355L0 = "";
        this.f42358M0 = "";
        this.f42361N0 = 0;
        this.f42367P0 = null;
        this.f42370Q0 = false;
        this.f42373R0 = -1;
        this.f42376S0 = 0;
        this.f42382U0 = 0;
        this.f42385V0 = 0;
        this.f42388W0 = 1;
        this.f42391X0 = false;
        this.f42394Y0 = 0;
        this.f42397Z0 = null;
        this.f42399a1 = new ArrayList();
        this.f42401b1 = new ArrayList();
        this.f42403c1 = false;
        this.f42405d1 = false;
        this.f42407e1 = false;
        this.f42409f1 = false;
        this.f42411g1 = false;
        this.f42413h1 = "";
        this.f42415i1 = 0;
        this.f42417j1 = -1;
        this.f42419k1 = "";
        this.f42421l1 = 0;
        this.f42423m1 = 0L;
        this.f42425n1 = 0;
        this.f42427o1 = "";
        this.f42430p1 = false;
        this.f42433q1 = "";
        this.f42436r1 = new SpannableStringBuilder();
        this.f42439s1 = new SpannableStringBuilder();
        this.f42442t1 = "";
        this.f42445u1 = "";
        this.f42448v1 = false;
        this.f42451w1 = 0L;
        this.f42460z1 = "";
        this.f42323A1 = "";
        this.f42326B1 = false;
        this.f42329C1 = 1;
        this.f42332D1 = 1;
        this.f42335E1 = 0;
        this.f42338F1 = 0;
        this.f42341G1 = 0;
        this.f42344H1 = false;
        this.f42347I1 = 0L;
        this.f42350J1 = -1;
        this.f42353K1 = -1;
        this.f42356L1 = false;
        this.f42359M1 = false;
        this.f42365O1 = 4;
        this.f42368P1 = 0;
        this.f42371Q1 = "";
        this.f42380T1 = false;
        this.f42392X1 = -1;
        this.f42434r = contactProfile.f42434r;
        this.f42443u = contactProfile.f42443u;
        this.f42437s = contactProfile.f42437s;
        this.f42446v = contactProfile.f42446v;
        this.f42455y = contactProfile.f42455y;
        this.f42458z = contactProfile.f42458z;
        this.f42321A = contactProfile.f42321A;
        this.f42406e0 = contactProfile.f42406e0;
        this.f42408f0 = contactProfile.f42408f0;
        this.f42410g0 = contactProfile.f42410g0;
        m40425q1(contactProfile.m40433v0());
        this.f42346I0 = contactProfile.f42346I0;
        this.f42349J0 = contactProfile.f42349J0;
        this.f42352K0 = contactProfile.f42352K0;
        this.f42358M0 = contactProfile.f42358M0;
        this.f42460z1 = contactProfile.f42460z1;
        C7868d c7868d = contactProfile.f42366P;
        if (c7868d != null) {
            this.f42366P = new C7868d(c7868d);
        } else {
            this.f42366P = new C7868d();
        }
        this.f42357M = contactProfile.f42357M;
        this.f42323A1 = contactProfile.f42323A1;
        this.f42361N0 = contactProfile.f42361N0;
        this.f42364O0 = contactProfile.f42364O0;
        this.f42367P0 = contactProfile.f42367P0;
    }

    /* renamed from: com.zing.zalo.control.ContactProfile$d */
    /* loaded from: classes3.dex */
    public static class C7868d {

        /* renamed from: a */
        public C7876l f42467a;

        /* renamed from: b */
        public C7876l f42468b;

        /* renamed from: c */
        public String f42469c;

        /* renamed from: d */
        public ArrayList f42470d;

        /* renamed from: e */
        public String f42471e;

        /* renamed from: f */
        public boolean f42472f;

        /* renamed from: g */
        public boolean f42473g;

        /* renamed from: h */
        public String f42474h;

        /* renamed from: i */
        public String f42475i;

        /* renamed from: j */
        public String f42476j;

        /* renamed from: k */
        public String f42477k;

        /* renamed from: l */
        public boolean f42478l;

        /* renamed from: m */
        public String f42479m;

        /* renamed from: n */
        public ArrayList f42480n;

        /* renamed from: o */
        public ArrayList f42481o;

        /* renamed from: p */
        public ArrayList f42482p;

        /* renamed from: q */
        public ArrayList f42483q;

        /* renamed from: r */
        public ArrayList f42484r;

        /* renamed from: s */
        public ArrayList f42485s;

        /* renamed from: t */
        public ArrayList f42486t;

        /* renamed from: u */
        public C7869e f42487u;

        /* renamed from: v */
        public ArrayList f42488v;

        /* renamed from: w */
        public C7872h f42489w;

        /* renamed from: x */
        public int f42490x;

        /* renamed from: y */
        public boolean f42491y;

        public C7868d(C7868d c7868d) {
            this.f42467a = null;
            this.f42468b = null;
            this.f42469c = null;
            this.f42470d = null;
            this.f42471e = null;
            this.f42472f = false;
            this.f42473g = true;
            this.f42474h = null;
            this.f42475i = null;
            this.f42476j = null;
            this.f42477k = null;
            this.f42478l = false;
            this.f42479m = null;
            this.f42480n = null;
            this.f42481o = null;
            this.f42482p = null;
            this.f42483q = null;
            this.f42484r = null;
            this.f42485s = null;
            this.f42486t = null;
            this.f42487u = null;
            this.f42488v = null;
            this.f42489w = null;
            this.f42490x = 0;
            this.f42491y = true;
            C7876l c7876l = c7868d.f42467a;
            if (c7876l != null) {
                this.f42467a = new C7876l(c7876l);
            }
            C7876l c7876l2 = c7868d.f42468b;
            if (c7876l2 != null) {
                this.f42468b = new C7876l(c7876l2);
            }
            this.f42469c = c7868d.f42469c;
            if (c7868d.f42470d != null) {
                this.f42470d = new ArrayList(c7868d.f42470d);
            } else {
                this.f42470d = new ArrayList();
            }
            this.f42474h = c7868d.f42474h;
            this.f42475i = c7868d.f42475i;
            this.f42471e = c7868d.f42471e;
            this.f42476j = c7868d.f42476j;
            this.f42477k = c7868d.f42477k;
            this.f42479m = c7868d.f42479m;
            if (c7868d.f42480n != null) {
                this.f42480n = new ArrayList(c7868d.f42480n);
            } else {
                this.f42480n = new ArrayList();
            }
            if (c7868d.f42481o != null) {
                this.f42481o = new ArrayList(c7868d.f42481o);
            } else {
                this.f42481o = new ArrayList();
            }
            if (c7868d.f42482p != null) {
                this.f42482p = new ArrayList(c7868d.f42482p);
            } else {
                this.f42482p = new ArrayList();
            }
            if (c7868d.f42483q != null) {
                this.f42483q = new ArrayList(c7868d.f42483q);
            } else {
                this.f42483q = new ArrayList();
            }
            if (c7868d.f42484r != null) {
                this.f42484r = new ArrayList(c7868d.f42484r);
            } else {
                this.f42484r = new ArrayList();
            }
            if (c7868d.f42485s != null) {
                this.f42485s = new ArrayList(c7868d.f42485s);
            } else {
                this.f42485s = new ArrayList();
            }
            if (c7868d.f42486t != null) {
                this.f42486t = new ArrayList(c7868d.f42486t);
            } else {
                this.f42486t = new ArrayList();
            }
            C7869e c7869e = c7868d.f42487u;
            if (c7869e != null) {
                this.f42487u = new C7869e(c7869e);
            } else {
                this.f42487u = new C7869e();
            }
            if (c7868d.f42488v != null) {
                this.f42488v = new ArrayList(c7868d.f42488v);
            } else {
                this.f42488v = new ArrayList();
            }
            C7872h c7872h = c7868d.f42489w;
            if (c7872h != null) {
                this.f42489w = new C7872h(c7872h);
            } else {
                this.f42489w = new C7872h();
            }
        }

        /* renamed from: a */
        public static String m40446a(List list) {
            JSONArray jSONArray = new JSONArray();
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONArray.toString();
        }

        /* renamed from: b */
        public String m40447b(int i11) {
            try {
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 20);
                jSONObject.put("manual", true);
                jSONObject.put("source", i11);
                jSONObject.put("updateData", this.f42490x);
                if (i11 == 2) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("quickSet", 1);
                    jSONObject.put("extraData", jSONObject2);
                }
                jSONArray.put(jSONObject);
                return jSONArray.toString();
            } catch (JSONException e11) {
                e11.printStackTrace();
                return "";
            }
        }

        /* renamed from: c */
        public String m40448c() {
            JSONArray jSONArray = new JSONArray();
            try {
                if (this.f42469c != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 0);
                    jSONObject.put("updateData", this.f42469c);
                    jSONArray.put(jSONObject);
                }
                if (this.f42470d != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it = this.f42470d.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put((String) it.next());
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 1);
                    jSONObject2.put("updateData", jSONArray2);
                    jSONArray.put(jSONObject2);
                }
                if (this.f42467a != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 2);
                    jSONObject3.put("updateData", this.f42467a.m40475b());
                    jSONObject3.put("manual", this.f42467a.f42517c);
                    jSONArray.put(jSONObject3);
                }
                if (this.f42468b != null) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 3);
                    jSONObject4.put("updateData", this.f42468b.m40475b());
                    jSONObject4.put("manual", this.f42468b.f42517c);
                    jSONArray.put(jSONObject4);
                }
                if (this.f42474h != null) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 4);
                    jSONObject5.put("updateData", this.f42474h);
                    jSONArray.put(jSONObject5);
                }
                if (this.f42471e != null) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 18);
                    jSONObject6.put("updateData", this.f42471e);
                    jSONObject6.put("manual", this.f42472f);
                    jSONArray.put(jSONObject6);
                }
                if (this.f42475i != null) {
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 5);
                    jSONObject7.put("updateData", this.f42475i);
                    jSONArray.put(jSONObject7);
                }
                if (this.f42476j != null) {
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 6);
                    jSONObject8.put("updateData", this.f42476j);
                    jSONArray.put(jSONObject8);
                }
                if (this.f42477k != null) {
                    JSONObject jSONObject9 = new JSONObject();
                    jSONObject9.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 17);
                    jSONObject9.put("updateData", this.f42477k);
                    jSONObject9.put("manual", this.f42478l);
                    jSONArray.put(jSONObject9);
                }
                if (this.f42479m != null) {
                    JSONObject jSONObject10 = new JSONObject();
                    jSONObject10.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 7);
                    jSONObject10.put("updateData", this.f42479m);
                    jSONObject10.put("isPushFeed", this.f42491y ? 1 : 0);
                    jSONArray.put(jSONObject10);
                }
                ArrayList arrayList = this.f42480n;
                if (arrayList != null && arrayList.size() > 0) {
                    JSONArray jSONArray3 = new JSONArray();
                    Iterator it2 = this.f42480n.iterator();
                    while (it2.hasNext()) {
                        jSONArray3.put((String) it2.next());
                    }
                    JSONObject jSONObject11 = new JSONObject();
                    jSONObject11.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 8);
                    jSONObject11.put("updateData", jSONArray3);
                    jSONArray.put(jSONObject11);
                }
                ArrayList arrayList2 = this.f42481o;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    JSONArray jSONArray4 = new JSONArray();
                    Iterator it3 = this.f42481o.iterator();
                    while (it3.hasNext()) {
                        jSONArray4.put((String) it3.next());
                    }
                    JSONObject jSONObject12 = new JSONObject();
                    jSONObject12.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 9);
                    jSONObject12.put("updateData", jSONArray4);
                    jSONArray.put(jSONObject12);
                }
                ArrayList arrayList3 = this.f42482p;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    JSONArray jSONArray5 = new JSONArray();
                    Iterator it4 = this.f42482p.iterator();
                    while (it4.hasNext()) {
                        jSONArray5.put((String) it4.next());
                    }
                    JSONObject jSONObject13 = new JSONObject();
                    jSONObject13.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 10);
                    jSONObject13.put("updateData", jSONArray5);
                    jSONArray.put(jSONObject13);
                }
                ArrayList arrayList4 = this.f42483q;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    JSONArray jSONArray6 = new JSONArray();
                    Iterator it5 = this.f42483q.iterator();
                    while (it5.hasNext()) {
                        jSONArray6.put((String) it5.next());
                    }
                    JSONObject jSONObject14 = new JSONObject();
                    jSONObject14.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 11);
                    jSONObject14.put("updateData", jSONArray6);
                    jSONArray.put(jSONObject14);
                }
                ArrayList arrayList5 = this.f42484r;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    JSONArray jSONArray7 = new JSONArray();
                    Iterator it6 = this.f42484r.iterator();
                    while (it6.hasNext()) {
                        jSONArray7.put((String) it6.next());
                    }
                    JSONObject jSONObject15 = new JSONObject();
                    jSONObject15.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 12);
                    jSONObject15.put("updateData", jSONArray7);
                    jSONArray.put(jSONObject15);
                }
                ArrayList arrayList6 = this.f42485s;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    JSONArray jSONArray8 = new JSONArray();
                    Iterator it7 = this.f42485s.iterator();
                    while (it7.hasNext()) {
                        jSONArray8.put((String) it7.next());
                    }
                    JSONObject jSONObject16 = new JSONObject();
                    jSONObject16.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 13);
                    jSONObject16.put("updateData", jSONArray8);
                    jSONArray.put(jSONObject16);
                }
                if (this.f42487u != null) {
                    JSONObject jSONObject17 = new JSONObject();
                    jSONObject17.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 14);
                    jSONObject17.put("updateData", this.f42487u.m40452a());
                    jSONArray.put(jSONObject17);
                }
                ArrayList arrayList7 = this.f42486t;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    JSONArray jSONArray9 = new JSONArray();
                    Iterator it8 = this.f42486t.iterator();
                    while (it8.hasNext()) {
                        jSONArray9.put((String) it8.next());
                    }
                    JSONObject jSONObject18 = new JSONObject();
                    jSONObject18.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 15);
                    jSONObject18.put("updateData", jSONArray9);
                    jSONArray.put(jSONObject18);
                }
                ArrayList arrayList8 = this.f42488v;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    JSONArray jSONArray10 = new JSONArray();
                    Iterator it9 = this.f42488v.iterator();
                    while (it9.hasNext()) {
                        jSONArray10.put(((C7875k) it9.next()).m40473a());
                    }
                    JSONObject jSONObject19 = new JSONObject();
                    jSONObject19.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 16);
                    jSONObject19.put("updateData", jSONArray10);
                    jSONArray.put(jSONObject19);
                }
                if (this.f42489w != null) {
                    JSONObject jSONObject20 = new JSONObject();
                    jSONObject20.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 19);
                    jSONObject20.put("manual", this.f42473g);
                    jSONObject20.put("updateData", this.f42489w.m40469e());
                    jSONArray.put(jSONObject20);
                }
                return jSONArray.toString();
            } catch (JSONException e11) {
                e11.printStackTrace();
                return "";
            }
        }

        /* renamed from: d */
        public String m40449d(int i11) {
            JSONArray jSONArray = new JSONArray();
            try {
                if (this.f42489w != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 19);
                    jSONObject.put("manual", this.f42473g);
                    jSONObject.put("source", i11);
                    jSONObject.put("updateData", this.f42489w.m40469e());
                    jSONArray.put(jSONObject);
                }
                return jSONArray.toString();
            } catch (JSONException e11) {
                e11.printStackTrace();
                return "";
            }
        }

        /* renamed from: e */
        void m40450e(JSONObject jSONObject) {
            String str;
            JSONArray jSONArray;
            int length;
            JSONArray jSONArray2;
            int length2;
            JSONArray jSONArray3;
            int length3;
            JSONArray jSONArray4;
            int length4;
            JSONArray jSONArray5;
            int length5;
            JSONArray jSONArray6;
            int length6;
            JSONArray jSONArray7;
            int length7;
            JSONArray jSONArray8;
            int length8;
            JSONArray jSONArray9;
            int length9;
            try {
                if (jSONObject.has("highSchool")) {
                    str = "ringBackTone";
                    this.f42467a = new C7876l(jSONObject.optJSONObject("highSchool"));
                } else {
                    str = "ringBackTone";
                }
                if (jSONObject.has("university")) {
                    this.f42468b = new C7876l(jSONObject.optJSONObject("university"));
                }
                this.f42469c = jSONObject.optString("email", null);
                if (jSONObject.has("photo") && (length9 = (jSONArray9 = jSONObject.getJSONArray("photo")).length()) > 0) {
                    this.f42470d = new ArrayList();
                    int i11 = 0;
                    for (length9 = (jSONArray9 = jSONObject.getJSONArray("photo")).length(); i11 < length9; length9 = length9) {
                        this.f42470d.add(jSONArray9.getString(i11));
                        i11++;
                    }
                }
                this.f42474h = jSONObject.optString("majors", null);
                this.f42475i = jSONObject.optString("position", null);
                this.f42471e = jSONObject.optString("homeTown", null);
                this.f42476j = jSONObject.optString("company", null);
                this.f42477k = jSONObject.optString("relationship", null);
                this.f42479m = jSONObject.optString("bio", null);
                if (jSONObject.has("musicFavSong") && (length8 = (jSONArray8 = jSONObject.getJSONArray("musicFavSong")).length()) > 0) {
                    this.f42480n = new ArrayList();
                    for (int i12 = 0; i12 < length8; i12++) {
                        this.f42480n.add(jSONArray8.getString(i12));
                    }
                }
                if (jSONObject.has("musicFavGenre") && (length7 = (jSONArray7 = jSONObject.getJSONArray("musicFavGenre")).length()) > 0) {
                    this.f42481o = new ArrayList();
                    for (int i13 = 0; i13 < length7; i13++) {
                        this.f42481o.add(jSONArray7.getString(i13));
                    }
                }
                if (jSONObject.has("food") && (length6 = (jSONArray6 = jSONObject.getJSONArray("food")).length()) > 0) {
                    this.f42482p = new ArrayList();
                    for (int i14 = 0; i14 < length6; i14++) {
                        this.f42482p.add(jSONArray6.getString(i14));
                    }
                }
                if (jSONObject.has("filmFavFilm") && (length5 = (jSONArray5 = jSONObject.getJSONArray("filmFavFilm")).length()) > 0) {
                    this.f42483q = new ArrayList();
                    for (int i15 = 0; i15 < length5; i15++) {
                        this.f42483q.add(jSONArray5.getString(i15));
                    }
                }
                if (jSONObject.has("travelBeenTo") && (length4 = (jSONArray4 = jSONObject.getJSONArray("travelBeenTo")).length()) > 0) {
                    this.f42484r = new ArrayList();
                    for (int i16 = 0; i16 < length4; i16++) {
                        this.f42484r.add(jSONArray4.getString(i16));
                    }
                }
                if (jSONObject.has("travelWantTo") && (length3 = (jSONArray3 = jSONObject.getJSONArray("travelWantTo")).length()) > 0) {
                    this.f42485s = new ArrayList();
                    for (int i17 = 0; i17 < length3; i17++) {
                        this.f42485s.add(jSONArray3.getString(i17));
                    }
                }
                if (jSONObject.has("category") && (length2 = (jSONArray2 = jSONObject.getJSONArray("category")).length()) > 0) {
                    this.f42486t = new ArrayList();
                    for (int i18 = 0; i18 < length2; i18++) {
                        this.f42486t.add(jSONArray2.getString(i18));
                    }
                }
                if (jSONObject.has("horoscope")) {
                    this.f42487u = new C7869e(jSONObject.getJSONObject("horoscope"));
                }
                if (jSONObject.has("question") && (length = (jSONArray = jSONObject.getJSONArray("question")).length()) > 0) {
                    this.f42488v = new ArrayList();
                    for (int i19 = 0; i19 < length; i19++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i19);
                        if (jSONObject2 != null) {
                            this.f42488v.add(new C7875k(jSONObject2));
                        }
                    }
                }
                if (jSONObject.has("musicProfileSong")) {
                    this.f42489w = new C7872h(jSONObject.optJSONObject("musicProfileSong"));
                }
                String str2 = str;
                if (jSONObject.has(str2)) {
                    this.f42490x = jSONObject.optInt(str2);
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public String m40451f() {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(this.f42469c)) {
                    jSONObject.put("email", this.f42469c);
                }
                ArrayList arrayList = this.f42470d;
                if (arrayList != null && arrayList.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = this.f42470d.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    jSONObject.put("photo", jSONArray);
                }
                C7876l c7876l = this.f42467a;
                if (c7876l != null) {
                    jSONObject.put("highSchool", c7876l.m40475b());
                }
                C7876l c7876l2 = this.f42468b;
                if (c7876l2 != null) {
                    jSONObject.put("university", c7876l2.m40475b());
                }
                if (!TextUtils.isEmpty(this.f42474h)) {
                    jSONObject.put("majors", this.f42474h);
                }
                if (!TextUtils.isEmpty(this.f42475i)) {
                    jSONObject.put("position", this.f42475i);
                }
                if (!TextUtils.isEmpty(this.f42471e)) {
                    jSONObject.put("homeTown", this.f42471e);
                }
                if (!TextUtils.isEmpty(this.f42476j)) {
                    jSONObject.put("company", this.f42476j);
                }
                if (!TextUtils.isEmpty(this.f42477k)) {
                    jSONObject.put("relationship", this.f42477k);
                }
                if (!TextUtils.isEmpty(this.f42479m)) {
                    jSONObject.put("bio", this.f42479m);
                }
                ArrayList arrayList2 = this.f42480n;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it2 = this.f42480n.iterator();
                    while (it2.hasNext()) {
                        jSONArray2.put((String) it2.next());
                    }
                    jSONObject.put("musicFavSong", jSONArray2);
                }
                ArrayList arrayList3 = this.f42481o;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    JSONArray jSONArray3 = new JSONArray();
                    Iterator it3 = this.f42481o.iterator();
                    while (it3.hasNext()) {
                        jSONArray3.put((String) it3.next());
                    }
                    jSONObject.put("musicFavGenre", jSONArray3);
                }
                ArrayList arrayList4 = this.f42482p;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    JSONArray jSONArray4 = new JSONArray();
                    Iterator it4 = this.f42482p.iterator();
                    while (it4.hasNext()) {
                        jSONArray4.put((String) it4.next());
                    }
                    jSONObject.put("food", jSONArray4);
                }
                ArrayList arrayList5 = this.f42483q;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    JSONArray jSONArray5 = new JSONArray();
                    Iterator it5 = this.f42483q.iterator();
                    while (it5.hasNext()) {
                        jSONArray5.put((String) it5.next());
                    }
                    jSONObject.put("filmFavFilm", jSONArray5);
                }
                ArrayList arrayList6 = this.f42484r;
                if (arrayList6 != null && arrayList6.size() > 0) {
                    JSONArray jSONArray6 = new JSONArray();
                    Iterator it6 = this.f42484r.iterator();
                    while (it6.hasNext()) {
                        jSONArray6.put((String) it6.next());
                    }
                    jSONObject.put("travelBeenTo", jSONArray6);
                }
                ArrayList arrayList7 = this.f42485s;
                if (arrayList7 != null && arrayList7.size() > 0) {
                    JSONArray jSONArray7 = new JSONArray();
                    Iterator it7 = this.f42485s.iterator();
                    while (it7.hasNext()) {
                        jSONArray7.put((String) it7.next());
                    }
                    jSONObject.put("travelWantTo", jSONArray7);
                }
                C7869e c7869e = this.f42487u;
                if (c7869e != null) {
                    jSONObject.put("horoscope", c7869e.m40452a());
                }
                ArrayList arrayList8 = this.f42486t;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    JSONArray jSONArray8 = new JSONArray();
                    Iterator it8 = this.f42486t.iterator();
                    while (it8.hasNext()) {
                        jSONArray8.put((String) it8.next());
                    }
                    jSONObject.put("category", jSONArray8);
                }
                ArrayList arrayList9 = this.f42488v;
                if (arrayList9 != null && arrayList9.size() > 0) {
                    JSONArray jSONArray9 = new JSONArray();
                    Iterator it9 = this.f42488v.iterator();
                    while (it9.hasNext()) {
                        jSONArray9.put(((C7875k) it9.next()).m40473a());
                    }
                    jSONObject.put("question", jSONArray9);
                }
                C7872h c7872h = this.f42489w;
                if (c7872h != null) {
                    jSONObject.put("musicProfileSong", c7872h.m40470f());
                }
                if (jSONObject.length() == 0) {
                    return "";
                }
                return jSONObject.toString();
            } catch (JSONException e11) {
                e11.printStackTrace();
                return "";
            }
        }

        public C7868d() {
            this.f42467a = null;
            this.f42468b = null;
            this.f42469c = null;
            this.f42470d = null;
            this.f42471e = null;
            this.f42472f = false;
            this.f42473g = true;
            this.f42474h = null;
            this.f42475i = null;
            this.f42476j = null;
            this.f42477k = null;
            this.f42478l = false;
            this.f42479m = null;
            this.f42480n = null;
            this.f42481o = null;
            this.f42482p = null;
            this.f42483q = null;
            this.f42484r = null;
            this.f42485s = null;
            this.f42486t = null;
            this.f42487u = null;
            this.f42488v = null;
            this.f42489w = null;
            this.f42490x = 0;
            this.f42491y = true;
        }

        public C7868d(JSONObject jSONObject) {
            this.f42467a = null;
            this.f42468b = null;
            this.f42469c = null;
            this.f42470d = null;
            this.f42471e = null;
            this.f42472f = false;
            this.f42473g = true;
            this.f42474h = null;
            this.f42475i = null;
            this.f42476j = null;
            this.f42477k = null;
            this.f42478l = false;
            this.f42479m = null;
            this.f42480n = null;
            this.f42481o = null;
            this.f42482p = null;
            this.f42483q = null;
            this.f42484r = null;
            this.f42485s = null;
            this.f42486t = null;
            this.f42487u = null;
            this.f42488v = null;
            this.f42489w = null;
            this.f42490x = 0;
            this.f42491y = true;
            m40450e(jSONObject);
        }
    }

    public ContactProfile(String str) {
        this.f42428p = 0;
        this.f42431q = "";
        this.f42434r = "";
        this.f42437s = "";
        this.f42440t = "";
        this.f42443u = "";
        this.f42446v = "";
        this.f42449w = 0;
        this.f42452x = "";
        this.f42455y = "";
        this.f42458z = "";
        this.f42321A = "";
        this.f42324B = "";
        this.f42327C = "";
        this.f42330D = 0L;
        this.f42333E = true;
        this.f42336F = 0L;
        this.f42339G = 1;
        this.f42342H = 0;
        this.f42345I = false;
        this.f42348J = null;
        this.f42354L = "";
        this.f42357M = 0.0d;
        this.f42360N = "";
        this.f42363O = "";
        this.f42366P = null;
        this.f42369Q = 0;
        this.f42372R = null;
        this.f42375S = 1;
        this.f42378T = "";
        this.f42387W = 0.0f;
        this.f42390X = -1;
        this.f42393Y = false;
        this.f42396Z = 0;
        this.f42398a0 = 0;
        this.f42400b0 = 0L;
        this.f42402c0 = "";
        this.f42404d0 = -1;
        this.f42406e0 = "";
        this.f42408f0 = "";
        this.f42410g0 = "";
        this.f42412h0 = 0;
        this.f42414i0 = 0;
        this.f42416j0 = -1L;
        this.f42418k0 = 0L;
        this.f42420l0 = "";
        this.f42422m0 = "";
        this.f42424n0 = 0;
        this.f42426o0 = "";
        this.f42429p0 = "";
        this.f42432q0 = 0;
        this.f42435r0 = 0;
        this.f42438s0 = 0;
        this.f42441t0 = false;
        this.f42444u0 = false;
        this.f42447v0 = 1;
        this.f42450w0 = -1;
        this.f42453x0 = 1;
        this.f42456y0 = 0;
        this.f42459z0 = null;
        this.f42322A0 = new ArrayList();
        this.f42325B0 = "";
        this.f42328C0 = false;
        this.f42343H0 = new JSONObject();
        this.f42346I0 = "";
        this.f42349J0 = false;
        this.f42352K0 = 0;
        this.f42355L0 = "";
        this.f42358M0 = "";
        this.f42361N0 = 0;
        this.f42367P0 = null;
        this.f42370Q0 = false;
        this.f42373R0 = -1;
        this.f42376S0 = 0;
        this.f42382U0 = 0;
        this.f42385V0 = 0;
        this.f42388W0 = 1;
        this.f42391X0 = false;
        this.f42394Y0 = 0;
        this.f42397Z0 = null;
        this.f42399a1 = new ArrayList();
        this.f42401b1 = new ArrayList();
        this.f42403c1 = false;
        this.f42405d1 = false;
        this.f42407e1 = false;
        this.f42409f1 = false;
        this.f42411g1 = false;
        this.f42413h1 = "";
        this.f42415i1 = 0;
        this.f42417j1 = -1;
        this.f42419k1 = "";
        this.f42421l1 = 0;
        this.f42423m1 = 0L;
        this.f42425n1 = 0;
        this.f42427o1 = "";
        this.f42430p1 = false;
        this.f42433q1 = "";
        this.f42436r1 = new SpannableStringBuilder();
        this.f42439s1 = new SpannableStringBuilder();
        this.f42442t1 = "";
        this.f42445u1 = "";
        this.f42448v1 = false;
        this.f42451w1 = 0L;
        this.f42460z1 = "";
        this.f42323A1 = "";
        this.f42326B1 = false;
        this.f42329C1 = 1;
        this.f42332D1 = 1;
        this.f42335E1 = 0;
        this.f42338F1 = 0;
        this.f42341G1 = 0;
        this.f42344H1 = false;
        this.f42347I1 = 0L;
        this.f42350J1 = -1;
        this.f42353K1 = -1;
        this.f42356L1 = false;
        this.f42359M1 = false;
        this.f42365O1 = 4;
        this.f42368P1 = 0;
        this.f42371Q1 = "";
        this.f42380T1 = false;
        this.f42392X1 = -1;
        this.f42434r = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0269, code lost:            r0 = new p716zh.C31868c5();        r0.m153171c(r5.getDouble("lat"));        r0.m153172d(r5.getDouble("lon"));        r23.f42379T0 = r0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ContactProfile(JSONObject jSONObject) {
        this.f42428p = 0;
        this.f42431q = "";
        this.f42434r = "";
        this.f42437s = "";
        this.f42440t = "";
        this.f42443u = "";
        this.f42446v = "";
        this.f42449w = 0;
        this.f42452x = "";
        this.f42455y = "";
        this.f42458z = "";
        this.f42321A = "";
        this.f42324B = "";
        this.f42327C = "";
        this.f42330D = 0L;
        this.f42333E = true;
        this.f42336F = 0L;
        this.f42339G = 1;
        this.f42342H = 0;
        this.f42345I = false;
        this.f42348J = null;
        this.f42354L = "";
        this.f42357M = 0.0d;
        this.f42360N = "";
        this.f42363O = "";
        this.f42366P = null;
        this.f42369Q = 0;
        this.f42372R = null;
        this.f42375S = 1;
        this.f42378T = "";
        this.f42387W = 0.0f;
        this.f42390X = -1;
        this.f42393Y = false;
        this.f42396Z = 0;
        this.f42398a0 = 0;
        this.f42400b0 = 0L;
        this.f42402c0 = "";
        this.f42404d0 = -1;
        this.f42406e0 = "";
        this.f42408f0 = "";
        this.f42410g0 = "";
        this.f42412h0 = 0;
        this.f42414i0 = 0;
        this.f42416j0 = -1L;
        this.f42418k0 = 0L;
        this.f42420l0 = "";
        this.f42422m0 = "";
        this.f42424n0 = 0;
        this.f42426o0 = "";
        this.f42429p0 = "";
        this.f42432q0 = 0;
        this.f42435r0 = 0;
        this.f42438s0 = 0;
        this.f42441t0 = false;
        this.f42444u0 = false;
        this.f42447v0 = 1;
        this.f42450w0 = -1;
        this.f42453x0 = 1;
        this.f42456y0 = 0;
        this.f42459z0 = null;
        this.f42322A0 = new ArrayList();
        this.f42325B0 = "";
        this.f42328C0 = false;
        this.f42343H0 = new JSONObject();
        this.f42346I0 = "";
        this.f42349J0 = false;
        this.f42352K0 = 0;
        this.f42355L0 = "";
        this.f42358M0 = "";
        this.f42361N0 = 0;
        this.f42367P0 = null;
        this.f42370Q0 = false;
        this.f42373R0 = -1;
        this.f42376S0 = 0;
        this.f42382U0 = 0;
        this.f42385V0 = 0;
        this.f42388W0 = 1;
        this.f42391X0 = false;
        this.f42394Y0 = 0;
        this.f42397Z0 = null;
        this.f42399a1 = new ArrayList();
        this.f42401b1 = new ArrayList();
        this.f42403c1 = false;
        this.f42405d1 = false;
        this.f42407e1 = false;
        this.f42409f1 = false;
        this.f42411g1 = false;
        this.f42413h1 = "";
        this.f42415i1 = 0;
        this.f42417j1 = -1;
        this.f42419k1 = "";
        this.f42421l1 = 0;
        this.f42423m1 = 0L;
        this.f42425n1 = 0;
        this.f42427o1 = "";
        this.f42430p1 = false;
        this.f42433q1 = "";
        this.f42436r1 = new SpannableStringBuilder();
        this.f42439s1 = new SpannableStringBuilder();
        this.f42442t1 = "";
        this.f42445u1 = "";
        this.f42448v1 = false;
        this.f42451w1 = 0L;
        this.f42460z1 = "";
        this.f42323A1 = "";
        this.f42326B1 = false;
        this.f42329C1 = 1;
        this.f42332D1 = 1;
        this.f42335E1 = 0;
        this.f42338F1 = 0;
        this.f42341G1 = 0;
        this.f42344H1 = false;
        this.f42347I1 = 0L;
        this.f42350J1 = -1;
        this.f42353K1 = -1;
        this.f42356L1 = false;
        this.f42359M1 = false;
        this.f42365O1 = 4;
        this.f42368P1 = 0;
        this.f42371Q1 = "";
        this.f42380T1 = false;
        this.f42392X1 = -1;
        try {
            this.f42437s = jSONObject.optString("dpn");
            this.f42434r = jSONObject.optString("uid");
            this.f42443u = jSONObject.optString("usr");
            this.f42446v = jSONObject.optString("avt");
            this.f42449w = jSONObject.optInt("ged", 0);
            this.f42452x = jSONObject.optString("sdob");
            this.f42455y = jSONObject.optString("phone");
            this.f42458z = jSONObject.optString("stt");
            this.f42324B = jSONObject.optString("cover");
            this.f42336F = jSONObject.optLong("last_action");
            this.f42339G = jSONObject.optInt("receive_type", 1);
            this.f42321A = jSONObject.optString("voice");
            this.f42400b0 = jSONObject.optLong("dob");
            this.f42346I0 = jSONObject.optString("tag");
            this.f42349J0 = !jSONObject.isNull("showButton") && jSONObject.optInt("showButton") == 1;
            this.f42352K0 = jSONObject.isNull(ZinstantMetaConstant.IMPRESSION_META_TYPE) ? 0 : jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f42355L0 = jSONObject.optString("detail_url");
            this.f42358M0 = jSONObject.optString("description");
            this.f42361N0 = jSONObject.optInt("account_type", 0);
            JSONObject optJSONObject = jSONObject.optJSONObject("business_account");
            this.f42364O0 = optJSONObject != null ? optJSONObject.toString() : "";
            this.f42330D = System.currentTimeMillis();
            this.f42391X0 = !jSONObject.isNull("is_block") && jSONObject.optBoolean("is_block");
            if (jSONObject.has("subcribe")) {
                this.f42450w0 = !jSONObject.optBoolean("subcribe") ? 1 : 0;
            } else {
                this.f42450w0 = -1;
            }
            if (jSONObject.has("locations")) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("locations");
                    int i11 = 0;
                    while (true) {
                        if (i11 >= jSONArray.length()) {
                            break;
                        }
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i11);
                        if (jSONObject2 != null) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            if (jSONObject.has("menu_info")) {
                try {
                    this.f42397Z0 = new C7874j(jSONObject.getJSONObject("menu_info"));
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            if (!jSONObject.isNull("versionProfile")) {
                this.f42385V0 = jSONObject.optInt("versionProfile");
            }
            if (jSONObject.has("enable_oa_call")) {
                this.f42331D0 = jSONObject.optInt("enable_oa_call");
            }
            if (jSONObject.has("oa_call_multi")) {
                this.f42328C0 = jSONObject.optInt("oa_call_multi") == 1;
            }
            if (jSONObject.has("oa_call_data")) {
                try {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("oa_call_data");
                    this.f42325B0 = jSONArray2.toString();
                    this.f42322A0.clear();
                    for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                        JSONObject jSONObject3 = (JSONObject) jSONArray2.get(i12);
                        if (jSONObject3 != null) {
                            this.f42322A0.add(new C7867c(jSONObject3));
                        }
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
            if (jSONObject.has("support_type")) {
                this.f42334E0 = jSONObject.optInt("support_type");
            }
            if (jSONObject.has("popup_message")) {
                this.f42337F0 = jSONObject.optString("popup_message");
            }
            if (jSONObject.has("popup_title")) {
                this.f42340G0 = jSONObject.optString("popup_title");
            }
            if (jSONObject.has("callcenter_tracking")) {
                this.f42343H0 = jSONObject.getJSONObject("callcenter_tracking");
            }
            if (!jSONObject.isNull("ext_menu")) {
                try {
                    JSONObject jSONObject4 = jSONObject.getJSONObject("ext_menu");
                    this.f42453x0 = !jSONObject4.isNull("group_msg") ? jSONObject4.getInt("group_msg") : 1;
                    if (m40387S0() && (jSONObject4.has("menu") || jSONObject4.has("zinstant_menu"))) {
                        if (jSONObject.has("expire_time")) {
                            this.f42459z0 = new C3545m(jSONObject4, System.currentTimeMillis(), jSONObject.getInt("expire_time"));
                        } else {
                            this.f42459z0 = new C3545m(jSONObject4, System.currentTimeMillis());
                        }
                    }
                } catch (Exception e14) {
                    AbstractC20110a.m104539h(e14);
                }
            }
            this.f42431q = this.f42437s;
            if (jSONObject.has("background")) {
                this.f42351K = AbstractC18069a.m96089h(jSONObject, "background");
            }
            if (jSONObject.has("secret_msg")) {
                m40419n1(jSONObject.optInt("secret_msg", 0) != 0);
            }
            if (jSONObject.has("uname") && !jSONObject.isNull("uname")) {
                String optString = jSONObject.optString("uname");
                if (TextUtils.isEmpty(optString) || optString.equalsIgnoreCase("null")) {
                    optString = "";
                }
                this.f42460z1 = optString;
            }
            this.f42394Y0 = jSONObject.optInt("profile_stt");
            this.f42415i1 = jSONObject.optInt("block_view_chat");
            m40427r1();
            this.f42338F1 = jSONObject.optInt("isOnline");
            if (!TextUtils.isEmpty(this.f42434r) && !this.f42434r.equals(CoreUtility.f89233i)) {
                C31901e8 m2800f = AbstractC0906d0.m2800f(MainApplication.getAppContext(), this.f42455y);
                C31901e8 m2801g = AbstractC0906d0.m2801g(MainApplication.getAppContext(), this.f42434r);
                if (m2800f != null && m2801g != null && m2800f != m2801g) {
                    AbstractC21935u.m114529S(this.f42434r, this.f42455y);
                }
            }
            this.f42357M = jSONObject.optDouble("name_score", this.f42357M);
            this.f42373R0 = jSONObject.optInt("reqSrc");
            this.f42341G1 = jSONObject.optInt("unmap_profile", 0);
            this.f42323A1 = jSONObject.optString("avt_full", "");
            m40428s1(jSONObject.optString("warning_stranger"));
            m40407h1(jSONObject.optString("globalId"));
        } catch (Exception e15) {
            AbstractC23350e.m122776f("", e15);
            try {
                if (TextUtils.isEmpty(this.f42434r) || TextUtils.isEmpty(CoreUtility.f89233i) || !this.f42434r.equals(CoreUtility.f89233i) || System.currentTimeMillis() - AbstractC23309i.m121743b6() < 43200000) {
                    return;
                }
                AbstractC23309i.m122625yq(System.currentTimeMillis());
                AbstractC20887g.m109232j(CoreUtility.f89233i, 0, e15.toString(), 0L, 80100, CoreUtility.f89236l);
            } catch (Exception e16) {
                e16.printStackTrace();
            }
        }
    }

    private ContactProfile(String str, String str2, String str3, MessageId messageId, String str4, long j11, boolean z11, boolean z12, int i11, int i12, int i13, int i14, long j12, String str5) {
        this.f42428p = 0;
        this.f42431q = "";
        this.f42434r = "";
        this.f42437s = "";
        this.f42440t = "";
        this.f42443u = "";
        this.f42446v = "";
        this.f42449w = 0;
        this.f42452x = "";
        this.f42455y = "";
        this.f42458z = "";
        this.f42321A = "";
        this.f42324B = "";
        this.f42327C = "";
        this.f42330D = 0L;
        this.f42333E = true;
        this.f42336F = 0L;
        this.f42339G = 1;
        this.f42342H = 0;
        this.f42345I = false;
        this.f42348J = null;
        this.f42354L = "";
        this.f42357M = 0.0d;
        this.f42360N = "";
        this.f42363O = "";
        this.f42366P = null;
        this.f42369Q = 0;
        this.f42372R = null;
        this.f42375S = 1;
        this.f42378T = "";
        this.f42387W = 0.0f;
        this.f42390X = -1;
        this.f42393Y = false;
        this.f42396Z = 0;
        this.f42398a0 = 0;
        this.f42400b0 = 0L;
        this.f42402c0 = "";
        this.f42404d0 = -1;
        this.f42406e0 = "";
        this.f42408f0 = "";
        this.f42410g0 = "";
        this.f42412h0 = 0;
        this.f42414i0 = 0;
        this.f42416j0 = -1L;
        this.f42418k0 = 0L;
        this.f42420l0 = "";
        this.f42422m0 = "";
        this.f42424n0 = 0;
        this.f42426o0 = "";
        this.f42429p0 = "";
        this.f42432q0 = 0;
        this.f42435r0 = 0;
        this.f42438s0 = 0;
        this.f42441t0 = false;
        this.f42444u0 = false;
        this.f42447v0 = 1;
        this.f42450w0 = -1;
        this.f42453x0 = 1;
        this.f42456y0 = 0;
        this.f42459z0 = null;
        this.f42322A0 = new ArrayList();
        this.f42325B0 = "";
        this.f42328C0 = false;
        this.f42343H0 = new JSONObject();
        this.f42346I0 = "";
        this.f42349J0 = false;
        this.f42352K0 = 0;
        this.f42355L0 = "";
        this.f42358M0 = "";
        this.f42361N0 = 0;
        this.f42367P0 = null;
        this.f42370Q0 = false;
        this.f42373R0 = -1;
        this.f42376S0 = 0;
        this.f42382U0 = 0;
        this.f42385V0 = 0;
        this.f42388W0 = 1;
        this.f42391X0 = false;
        this.f42394Y0 = 0;
        this.f42397Z0 = null;
        this.f42399a1 = new ArrayList();
        this.f42401b1 = new ArrayList();
        this.f42403c1 = false;
        this.f42405d1 = false;
        this.f42407e1 = false;
        this.f42409f1 = false;
        this.f42411g1 = false;
        this.f42413h1 = "";
        this.f42415i1 = 0;
        this.f42417j1 = -1;
        this.f42419k1 = "";
        this.f42421l1 = 0;
        this.f42423m1 = 0L;
        this.f42425n1 = 0;
        this.f42427o1 = "";
        this.f42430p1 = false;
        this.f42433q1 = "";
        this.f42436r1 = new SpannableStringBuilder();
        this.f42439s1 = new SpannableStringBuilder();
        this.f42442t1 = "";
        this.f42445u1 = "";
        this.f42448v1 = false;
        this.f42451w1 = 0L;
        this.f42460z1 = "";
        this.f42323A1 = "";
        this.f42326B1 = false;
        this.f42329C1 = 1;
        this.f42332D1 = 1;
        this.f42335E1 = 0;
        this.f42338F1 = 0;
        this.f42341G1 = 0;
        this.f42344H1 = false;
        this.f42347I1 = 0L;
        this.f42350J1 = -1;
        this.f42353K1 = -1;
        this.f42356L1 = false;
        this.f42359M1 = false;
        this.f42365O1 = 4;
        this.f42368P1 = 0;
        this.f42371Q1 = "";
        this.f42380T1 = false;
        this.f42392X1 = -1;
        this.f42434r = str;
        this.f42437s = str2;
        this.f42446v = str3;
        this.f42372R = new C18446h(i11, messageId, j11, z12, z11, i12, i13, j12, str5);
        m40401d1(str4);
        this.f42375S = i14;
        this.f42431q = str2;
    }

    private ContactProfile(String str, String str2, String str3, MessageId messageId, long j11, String str4, boolean z11, int i11, int i12, int i13, int i14, int i15, C7908f c7908f, String str5, long j12, String str6) {
        this.f42428p = 0;
        this.f42431q = "";
        this.f42434r = "";
        this.f42437s = "";
        this.f42440t = "";
        this.f42443u = "";
        this.f42446v = "";
        this.f42449w = 0;
        this.f42452x = "";
        this.f42455y = "";
        this.f42458z = "";
        this.f42321A = "";
        this.f42324B = "";
        this.f42327C = "";
        this.f42330D = 0L;
        this.f42333E = true;
        this.f42336F = 0L;
        this.f42339G = 1;
        this.f42342H = 0;
        this.f42345I = false;
        this.f42348J = null;
        this.f42354L = "";
        this.f42357M = 0.0d;
        this.f42360N = "";
        this.f42363O = "";
        this.f42366P = null;
        this.f42369Q = 0;
        this.f42372R = null;
        this.f42375S = 1;
        this.f42378T = "";
        this.f42387W = 0.0f;
        this.f42390X = -1;
        this.f42393Y = false;
        this.f42396Z = 0;
        this.f42398a0 = 0;
        this.f42400b0 = 0L;
        this.f42402c0 = "";
        this.f42404d0 = -1;
        this.f42406e0 = "";
        this.f42408f0 = "";
        this.f42410g0 = "";
        this.f42412h0 = 0;
        this.f42414i0 = 0;
        this.f42416j0 = -1L;
        this.f42418k0 = 0L;
        this.f42420l0 = "";
        this.f42422m0 = "";
        this.f42424n0 = 0;
        this.f42426o0 = "";
        this.f42429p0 = "";
        this.f42432q0 = 0;
        this.f42435r0 = 0;
        this.f42438s0 = 0;
        this.f42441t0 = false;
        this.f42444u0 = false;
        this.f42447v0 = 1;
        this.f42450w0 = -1;
        this.f42453x0 = 1;
        this.f42456y0 = 0;
        this.f42459z0 = null;
        this.f42322A0 = new ArrayList();
        this.f42325B0 = "";
        this.f42328C0 = false;
        this.f42343H0 = new JSONObject();
        this.f42346I0 = "";
        this.f42349J0 = false;
        this.f42352K0 = 0;
        this.f42355L0 = "";
        this.f42358M0 = "";
        this.f42361N0 = 0;
        this.f42367P0 = null;
        this.f42370Q0 = false;
        this.f42373R0 = -1;
        this.f42376S0 = 0;
        this.f42382U0 = 0;
        this.f42385V0 = 0;
        this.f42388W0 = 1;
        this.f42391X0 = false;
        this.f42394Y0 = 0;
        this.f42397Z0 = null;
        this.f42399a1 = new ArrayList();
        this.f42401b1 = new ArrayList();
        this.f42403c1 = false;
        this.f42405d1 = false;
        this.f42407e1 = false;
        this.f42409f1 = false;
        this.f42411g1 = false;
        this.f42413h1 = "";
        this.f42415i1 = 0;
        this.f42417j1 = -1;
        this.f42419k1 = "";
        this.f42421l1 = 0;
        this.f42423m1 = 0L;
        this.f42425n1 = 0;
        this.f42427o1 = "";
        this.f42430p1 = false;
        this.f42433q1 = "";
        this.f42436r1 = new SpannableStringBuilder();
        this.f42439s1 = new SpannableStringBuilder();
        this.f42442t1 = "";
        this.f42445u1 = "";
        this.f42448v1 = false;
        this.f42451w1 = 0L;
        this.f42460z1 = "";
        this.f42323A1 = "";
        this.f42326B1 = false;
        this.f42329C1 = 1;
        this.f42332D1 = 1;
        this.f42335E1 = 0;
        this.f42338F1 = 0;
        this.f42341G1 = 0;
        this.f42344H1 = false;
        this.f42347I1 = 0L;
        this.f42350J1 = -1;
        this.f42353K1 = -1;
        this.f42356L1 = false;
        this.f42359M1 = false;
        this.f42365O1 = 4;
        this.f42368P1 = 0;
        this.f42371Q1 = "";
        this.f42380T1 = false;
        this.f42392X1 = -1;
        this.f42434r = str;
        this.f42437s = str2;
        this.f42446v = str3;
        this.f42372R = new C18446h(i15, messageId, j11, i14 == 1, z11, i12, i13, j12, str6);
        m40401d1(str4);
        this.f42375S = i11;
        this.f42348J = c7908f;
        this.f42413h1 = str5;
    }

    public ContactProfile(C3594a c3594a) {
        this.f42428p = 0;
        this.f42431q = "";
        this.f42434r = "";
        this.f42437s = "";
        this.f42440t = "";
        this.f42443u = "";
        this.f42446v = "";
        this.f42449w = 0;
        this.f42452x = "";
        this.f42455y = "";
        this.f42458z = "";
        this.f42321A = "";
        this.f42324B = "";
        this.f42327C = "";
        this.f42330D = 0L;
        this.f42333E = true;
        this.f42336F = 0L;
        this.f42339G = 1;
        this.f42342H = 0;
        this.f42345I = false;
        this.f42348J = null;
        this.f42354L = "";
        this.f42357M = 0.0d;
        this.f42360N = "";
        this.f42363O = "";
        this.f42366P = null;
        this.f42369Q = 0;
        this.f42372R = null;
        this.f42375S = 1;
        this.f42378T = "";
        this.f42387W = 0.0f;
        this.f42390X = -1;
        this.f42393Y = false;
        this.f42396Z = 0;
        this.f42398a0 = 0;
        this.f42400b0 = 0L;
        this.f42402c0 = "";
        this.f42404d0 = -1;
        this.f42406e0 = "";
        this.f42408f0 = "";
        this.f42410g0 = "";
        this.f42412h0 = 0;
        this.f42414i0 = 0;
        this.f42416j0 = -1L;
        this.f42418k0 = 0L;
        this.f42420l0 = "";
        this.f42422m0 = "";
        this.f42424n0 = 0;
        this.f42426o0 = "";
        this.f42429p0 = "";
        this.f42432q0 = 0;
        this.f42435r0 = 0;
        this.f42438s0 = 0;
        this.f42441t0 = false;
        this.f42444u0 = false;
        this.f42447v0 = 1;
        this.f42450w0 = -1;
        this.f42453x0 = 1;
        this.f42456y0 = 0;
        this.f42459z0 = null;
        this.f42322A0 = new ArrayList();
        this.f42325B0 = "";
        this.f42328C0 = false;
        this.f42343H0 = new JSONObject();
        this.f42346I0 = "";
        this.f42349J0 = false;
        this.f42352K0 = 0;
        this.f42355L0 = "";
        this.f42358M0 = "";
        this.f42361N0 = 0;
        this.f42367P0 = null;
        this.f42370Q0 = false;
        this.f42373R0 = -1;
        this.f42376S0 = 0;
        this.f42382U0 = 0;
        this.f42385V0 = 0;
        this.f42388W0 = 1;
        this.f42391X0 = false;
        this.f42394Y0 = 0;
        this.f42397Z0 = null;
        this.f42399a1 = new ArrayList();
        this.f42401b1 = new ArrayList();
        this.f42403c1 = false;
        this.f42405d1 = false;
        this.f42407e1 = false;
        this.f42409f1 = false;
        this.f42411g1 = false;
        this.f42413h1 = "";
        this.f42415i1 = 0;
        this.f42417j1 = -1;
        this.f42419k1 = "";
        this.f42421l1 = 0;
        this.f42423m1 = 0L;
        this.f42425n1 = 0;
        this.f42427o1 = "";
        this.f42430p1 = false;
        this.f42433q1 = "";
        this.f42436r1 = new SpannableStringBuilder();
        this.f42439s1 = new SpannableStringBuilder();
        this.f42442t1 = "";
        this.f42445u1 = "";
        this.f42448v1 = false;
        this.f42451w1 = 0L;
        this.f42460z1 = "";
        this.f42323A1 = "";
        this.f42326B1 = false;
        this.f42329C1 = 1;
        this.f42332D1 = 1;
        this.f42335E1 = 0;
        this.f42338F1 = 0;
        this.f42341G1 = 0;
        this.f42344H1 = false;
        this.f42347I1 = 0L;
        this.f42350J1 = -1;
        this.f42353K1 = -1;
        this.f42356L1 = false;
        this.f42359M1 = false;
        this.f42365O1 = 4;
        this.f42368P1 = 0;
        this.f42371Q1 = "";
        this.f42380T1 = false;
        this.f42392X1 = -1;
        int i11 = c3594a.f15176c;
        this.f42428p = i11;
        if (i11 == 1) {
            this.f42434r = "group_" + c3594a.f15175b;
        } else {
            this.f42434r = c3594a.f15175b + "";
        }
        this.f42437s = c3594a.f15179f;
        this.f42372R = new C18446h(c3594a.f15177d);
        this.f42378T = c3594a.f15180g;
    }

    public ContactProfile(Parcel parcel) {
        this.f42428p = 0;
        this.f42431q = "";
        this.f42434r = "";
        this.f42437s = "";
        this.f42440t = "";
        this.f42443u = "";
        this.f42446v = "";
        this.f42449w = 0;
        this.f42452x = "";
        this.f42455y = "";
        this.f42458z = "";
        this.f42321A = "";
        this.f42324B = "";
        this.f42327C = "";
        this.f42330D = 0L;
        this.f42333E = true;
        this.f42336F = 0L;
        this.f42339G = 1;
        this.f42342H = 0;
        this.f42345I = false;
        this.f42348J = null;
        this.f42354L = "";
        this.f42357M = 0.0d;
        this.f42360N = "";
        this.f42363O = "";
        this.f42366P = null;
        this.f42369Q = 0;
        this.f42372R = null;
        this.f42375S = 1;
        this.f42378T = "";
        this.f42387W = 0.0f;
        this.f42390X = -1;
        this.f42393Y = false;
        this.f42396Z = 0;
        this.f42398a0 = 0;
        this.f42400b0 = 0L;
        this.f42402c0 = "";
        this.f42404d0 = -1;
        this.f42406e0 = "";
        this.f42408f0 = "";
        this.f42410g0 = "";
        this.f42412h0 = 0;
        this.f42414i0 = 0;
        this.f42416j0 = -1L;
        this.f42418k0 = 0L;
        this.f42420l0 = "";
        this.f42422m0 = "";
        this.f42424n0 = 0;
        this.f42426o0 = "";
        this.f42429p0 = "";
        this.f42432q0 = 0;
        this.f42435r0 = 0;
        this.f42438s0 = 0;
        this.f42441t0 = false;
        this.f42444u0 = false;
        this.f42447v0 = 1;
        this.f42450w0 = -1;
        this.f42453x0 = 1;
        this.f42456y0 = 0;
        this.f42459z0 = null;
        this.f42322A0 = new ArrayList();
        this.f42325B0 = "";
        this.f42328C0 = false;
        this.f42343H0 = new JSONObject();
        this.f42346I0 = "";
        this.f42349J0 = false;
        this.f42352K0 = 0;
        this.f42355L0 = "";
        this.f42358M0 = "";
        this.f42361N0 = 0;
        this.f42367P0 = null;
        this.f42370Q0 = false;
        this.f42373R0 = -1;
        this.f42376S0 = 0;
        this.f42382U0 = 0;
        this.f42385V0 = 0;
        this.f42388W0 = 1;
        this.f42391X0 = false;
        this.f42394Y0 = 0;
        this.f42397Z0 = null;
        this.f42399a1 = new ArrayList();
        this.f42401b1 = new ArrayList();
        this.f42403c1 = false;
        this.f42405d1 = false;
        this.f42407e1 = false;
        this.f42409f1 = false;
        this.f42411g1 = false;
        this.f42413h1 = "";
        this.f42415i1 = 0;
        this.f42417j1 = -1;
        this.f42419k1 = "";
        this.f42421l1 = 0;
        this.f42423m1 = 0L;
        this.f42425n1 = 0;
        this.f42427o1 = "";
        this.f42430p1 = false;
        this.f42433q1 = "";
        this.f42436r1 = new SpannableStringBuilder();
        this.f42439s1 = new SpannableStringBuilder();
        this.f42442t1 = "";
        this.f42445u1 = "";
        this.f42448v1 = false;
        this.f42451w1 = 0L;
        this.f42460z1 = "";
        this.f42323A1 = "";
        this.f42326B1 = false;
        this.f42329C1 = 1;
        this.f42332D1 = 1;
        this.f42335E1 = 0;
        this.f42338F1 = 0;
        this.f42341G1 = 0;
        this.f42344H1 = false;
        this.f42347I1 = 0L;
        this.f42350J1 = -1;
        this.f42353K1 = -1;
        this.f42356L1 = false;
        this.f42359M1 = false;
        this.f42365O1 = 4;
        this.f42368P1 = 0;
        this.f42371Q1 = "";
        this.f42380T1 = false;
        this.f42392X1 = -1;
        m40352Z0(parcel);
    }
}
