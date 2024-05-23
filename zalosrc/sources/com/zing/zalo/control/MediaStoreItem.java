package com.zing.zalo.control;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import au.EnumC2380x;
import au.EnumC2382z;
import b40.C2526d;
import b40.C2549x;
import ci.C3521p0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dg0.AbstractC17930e;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17990p0;
import dj.C18009w0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import hu.C20131e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23238v2;
import me0.AbstractC23262x6;
import me0.C23250w4;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import on0.AbstractC24341v;
import org.json.JSONException;
import org.json.JSONObject;
import p056cj.C3554v;
import p239ih.C20556f;
import p348mi.AbstractC23306f;
import p698yz.AbstractC31111g;
import p716zh.C31944h6;
import p716zh.C32175x6;
import pm0.C24848g0;
import vc0.InterfaceC27965d;

/* loaded from: classes3.dex */
public final class MediaStoreItem implements Parcelable, InterfaceC27965d {

    /* renamed from: A */
    private C32175x6 f42635A;

    /* renamed from: B */
    private String f42636B;

    /* renamed from: C */
    private int f42637C;

    /* renamed from: D */
    private boolean f42638D;

    /* renamed from: E */
    private C17945a0 f42639E;

    /* renamed from: F */
    private final List f42640F;

    /* renamed from: G */
    private final Object f42641G;

    /* renamed from: H */
    private boolean f42642H;

    /* renamed from: I */
    private final long f42643I;

    /* renamed from: J */
    private final long f42644J;

    /* renamed from: K */
    private final long f42645K;

    /* renamed from: L */
    private String f42646L;

    /* renamed from: M */
    private long f42647M;

    /* renamed from: p */
    private MessageId f42648p;

    /* renamed from: q */
    private long f42649q;

    /* renamed from: r */
    private int f42650r;

    /* renamed from: s */
    private CharSequence f42651s;

    /* renamed from: t */
    private CharSequence f42652t;

    /* renamed from: u */
    private C7888c f42653u;

    /* renamed from: v */
    private boolean f42654v;

    /* renamed from: w */
    private long f42655w;

    /* renamed from: x */
    private boolean f42656x;

    /* renamed from: y */
    private EnumC2380x f42657y;

    /* renamed from: z */
    private String f42658z;
    public static final C7887b Companion = new C7887b(null);
    public static final Parcelable.Creator<MediaStoreItem> CREATOR = new C7886a();

    /* renamed from: com.zing.zalo.control.MediaStoreItem$a */
    /* loaded from: classes3.dex */
    public static final class C7886a implements Parcelable.Creator {
        C7886a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaStoreItem createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new MediaStoreItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaStoreItem[] newArray(int i11) {
            return new MediaStoreItem[i11];
        }
    }

    /* renamed from: com.zing.zalo.control.MediaStoreItem$b */
    /* loaded from: classes3.dex */
    public static final class C7887b {
        private C7887b() {
        }

        public /* synthetic */ C7887b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.control.MediaStoreItem$c */
    /* loaded from: classes3.dex */
    public static final class C7888c {

        /* renamed from: a */
        private float f42659a;

        /* renamed from: b */
        private float f42660b;

        /* renamed from: c */
        private float f42661c;

        /* renamed from: d */
        private float f42662d;

        /* renamed from: e */
        private int f42663e;

        /* renamed from: f */
        private String f42664f;

        public C7888c() {
        }

        public C7888c(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f42659a = (float) jSONObject.optDouble("top", 0.0d);
                this.f42660b = (float) jSONObject.optDouble("left", 0.0d);
                this.f42661c = (float) jSONObject.optDouble("right", 0.0d);
                this.f42662d = (float) jSONObject.optDouble("bottom", 0.0d);
                this.f42663e = jSONObject.optInt("layoutId", 0);
                this.f42664f = jSONObject.optString("layoutType");
            }
        }

        /* renamed from: a */
        public final float m40621a() {
            return this.f42662d;
        }

        /* renamed from: b */
        public final int m40622b() {
            return this.f42663e;
        }

        /* renamed from: c */
        public final String m40623c() {
            return this.f42664f;
        }

        /* renamed from: d */
        public final float m40624d() {
            return this.f42660b;
        }

        /* renamed from: e */
        public final float m40625e() {
            return this.f42661c;
        }

        /* renamed from: f */
        public final float m40626f() {
            return this.f42659a;
        }

        /* renamed from: g */
        public final void m40627g(float f11) {
            this.f42662d = f11;
        }

        /* renamed from: h */
        public final void m40628h(int i11) {
            this.f42663e = i11;
        }

        /* renamed from: i */
        public final void m40629i(String str) {
            this.f42664f = str;
        }

        /* renamed from: j */
        public final void m40630j(float f11) {
            this.f42660b = f11;
        }

        /* renamed from: k */
        public final void m40631k(float f11) {
            this.f42661c = f11;
        }

        /* renamed from: l */
        public final void m40632l(float f11) {
            this.f42659a = f11;
        }

        /* renamed from: m */
        public final JSONObject m40633m() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", this.f42659a);
                jSONObject.put("left", this.f42660b);
                jSONObject.put("right", this.f42661c);
                jSONObject.put("bottom", this.f42662d);
                jSONObject.put("layoutId", this.f42663e);
                jSONObject.put("layoutType", this.f42664f);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }
    }

    public MediaStoreItem(MessageId messageId, long j11) {
        AbstractC19074t.m100208f(messageId, "messageId");
        this.f42648p = messageId;
        this.f42649q = j11;
        this.f42657y = EnumC2380x.f9934q;
        this.f42637C = 1;
        this.f42638D = true;
        C17945a0 m95365a = new C17945a0.w(messageId, 0).m95359K(this.f42649q).m95365a();
        AbstractC19074t.m100207e(m95365a, "build(...)");
        this.f42639E = m95365a;
        this.f42640F = Collections.synchronizedList(new ArrayList());
        this.f42641G = new Object();
        this.f42643I = 1L;
        this.f42644J = 1024L;
        this.f42645K = 1048576L;
        this.f42647M = 1L;
    }

    /* renamed from: O */
    private final String m40550O(long j11, long j12) {
        if (j12 == this.f42643I) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String string = MainApplication.Companion.m35500c().getResources().getString(AbstractC8020f0.str_num_byte);
            AbstractC19074t.m100207e(string, "getString(...)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
        if (j12 == this.f42644J) {
            C19067n0 c19067n02 = C19067n0.f94947a;
            String string2 = MainApplication.Companion.m35500c().getResources().getString(AbstractC8020f0.str_num_kilo_byte);
            AbstractC19074t.m100207e(string2, "getString(...)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{Long.valueOf(j11 / this.f42644J)}, 1));
            AbstractC19074t.m100207e(format2, "format(...)");
            return format2;
        }
        C19067n0 c19067n03 = C19067n0.f94947a;
        String string3 = MainApplication.Companion.m35500c().getResources().getString(AbstractC8020f0.str_num_mega_byte);
        AbstractC19074t.m100207e(string3, "getString(...)");
        String format3 = String.format(string3, Arrays.copyOf(new Object[]{Long.valueOf(j11 / this.f42645K)}, 1));
        AbstractC19074t.m100207e(format3, "format(...)");
        return format3;
    }

    /* renamed from: i */
    public static final void m40553i(MediaStoreItem mediaStoreItem, C3521p0.c cVar) {
        AbstractC19074t.m100208f(mediaStoreItem, "this$0");
        try {
            try {
                mediaStoreItem.m40587e(cVar);
                mediaStoreItem.m40610t0(false);
                AbstractC19656s0.m103070m(mediaStoreItem.m40599m());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } finally {
            mediaStoreItem.m40589f(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m40554k(MediaStoreItem mediaStoreItem, C3521p0.c cVar, boolean z11, boolean z12) {
        String str;
        String m94983Q3;
        boolean z13;
        String m104909A;
        boolean m127120J;
        AbstractC19074t.m100208f(mediaStoreItem, "this$0");
        try {
            String mo95039W2 = mediaStoreItem.m40599m().mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            C2526d c2526d = C2526d.f10270a;
            MessageId messageId = mediaStoreItem.f42648p;
            if (cVar != null) {
                str = cVar.mo17802c();
                if (str == null) {
                }
                c2526d.m12729v(messageId, -1, str, c2526d.m12733y(mo95039W2));
                mediaStoreItem.m40587e(cVar);
                m94983Q3 = mediaStoreItem.m40599m().m94983Q3();
                AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
                if (TextUtils.isEmpty(m94983Q3) && mediaStoreItem.m40599m().m94893G1(mediaStoreItem.m40599m().m94983Q3())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    if (!z13) {
                        m94983Q3 = mediaStoreItem.m40599m().m95283w2(false, false);
                        AbstractC19074t.m100207e(m94983Q3, "genDownloadFilePath(...)");
                        if (!TextUtils.isEmpty(m94983Q3) && !AbstractC19074t.m100204b(m94983Q3, mediaStoreItem.m40599m().m94983Q3()) && mediaStoreItem.m40599m().m94893G1(m94983Q3)) {
                            z13 = true;
                        }
                        z13 = false;
                    } else if (AbstractC31111g.m151130k(m94983Q3)) {
                        String m95283w2 = mediaStoreItem.m40599m().m95283w2(false, false);
                        if (!TextUtils.isEmpty(m95283w2) && !AbstractC19074t.m100204b(m95283w2, m94983Q3) && mediaStoreItem.m40599m().m94893G1(m95283w2)) {
                            AbstractC19074t.m100205c(m95283w2);
                        } else {
                            if (AbstractC23238v2.m119718c(new File(mediaStoreItem.m40599m().m94983Q3()), new File(m94983Q3))) {
                                AbstractC19074t.m100205c(m95283w2);
                            }
                            z13 = false;
                        }
                        m94983Q3 = m95283w2;
                        z13 = true;
                    }
                } else if (z13 && AbstractC31111g.m151130k(m94983Q3)) {
                    z13 = false;
                }
                m104909A = C20131e.m104909A();
                if (!z11 && z13) {
                    String m94983Q32 = mediaStoreItem.m40599m().m94983Q3();
                    AbstractC19074t.m100207e(m94983Q32, "getLocalpath(...)");
                    mediaStoreItem.m40590g(m94983Q32);
                    c2526d.m12690N(mediaStoreItem, true, true, true);
                    return;
                }
                if (mediaStoreItem.m40582Z() && z13) {
                    m127120J = AbstractC24341v.m127120J(m94983Q3, m104909A, false, 2, null);
                    if (m127120J) {
                        if (z12) {
                            mediaStoreItem.m40599m().m95194m2(mediaStoreItem.m40599m().m94983Q3(), true);
                        }
                        mediaStoreItem.m40589f(true);
                        c2526d.m12690N(mediaStoreItem, false, true, true);
                        return;
                    }
                }
                mediaStoreItem.m40599m().m95214o2(z12, !z12);
                mediaStoreItem.m40589f(false);
            }
            str = "";
            c2526d.m12729v(messageId, -1, str, c2526d.m12733y(mo95039W2));
            mediaStoreItem.m40587e(cVar);
            m94983Q3 = mediaStoreItem.m40599m().m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            if (TextUtils.isEmpty(m94983Q3)) {
            }
            z13 = false;
            if (Build.VERSION.SDK_INT >= 29) {
            }
            m104909A = C20131e.m104909A();
            if (!z11) {
            }
            if (mediaStoreItem.m40582Z()) {
                m127120J = AbstractC24341v.m127120J(m94983Q3, m104909A, false, 2, null);
                if (m127120J) {
                }
            }
            mediaStoreItem.m40599m().m95214o2(z12, !z12);
            mediaStoreItem.m40589f(false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: l */
    private final void m40555l(int i11, C17969i0 c17969i0, C17945a0 c17945a0) {
        int i12 = -1;
        this.f42650r = -1;
        boolean z11 = false;
        if (!AbstractC19646n0.m103031t1(i11) && !AbstractC19646n0.m102995k1(i11)) {
            if (AbstractC19646n0.m102886D1(i11)) {
                this.f42650r = 1;
                return;
            }
            if (AbstractC19646n0.m103003m1(i11)) {
                if (c17969i0 != null) {
                    this.f42652t = c17969i0.f91011p;
                }
                this.f42650r = 3;
                if (c17969i0 instanceof C17990p0) {
                    this.f42651s = ((C17990p0) c17969i0).f91011p;
                    return;
                }
                return;
            }
            if (i11 == 12 && c17969i0 != null && !TextUtils.isEmpty(c17969i0.f91016u) && AbstractC19074t.m100204b(c17969i0.f91016u, "recommened.link")) {
                z11 = true;
            }
            if (AbstractC19646n0.m103044x1(i11) || z11) {
                if (z11) {
                    this.f42652t = AbstractC23463h.m123179g(c17945a0);
                }
                if (TextUtils.isEmpty(c17945a0.m95090b5())) {
                    String m95019U3 = c17945a0.m95019U3();
                    AbstractC19074t.m100205c(m95019U3);
                    String m153548n = C31944h6.m153548n(m95019U3);
                    c17945a0.m94882Eb(m153548n);
                    this.f42652t = m153548n;
                }
                if (!TextUtils.isEmpty(c17945a0.m95090b5())) {
                    i12 = 2;
                }
                this.f42650r = i12;
                return;
            }
            return;
        }
        this.f42650r = 0;
    }

    /* renamed from: t */
    private final long m40556t() {
        C17990p0 c17990p0;
        C17969i0 m94929K2 = m40599m().m94929K2();
        if (m94929K2 instanceof C17990p0) {
            c17990p0 = (C17990p0) m94929K2;
        } else {
            c17990p0 = null;
        }
        if (c17990p0 != null) {
            return c17990p0.f91113B;
        }
        return 0L;
    }

    /* renamed from: u */
    private final long m40557u(long j11) {
        if (j11 < this.f42644J) {
            return this.f42643I;
        }
        long m40556t = m40556t();
        long j12 = this.f42645K;
        if (m40556t < j12) {
            return this.f42644J;
        }
        return j12;
    }

    /* renamed from: A0 */
    public final void m40558A0(boolean z11) {
        this.f42654v = z11;
    }

    /* renamed from: B */
    public final C7888c m40559B() {
        if (this.f42653u == null) {
            this.f42653u = new C7888c();
        }
        C7888c c7888c = this.f42653u;
        AbstractC19074t.m100205c(c7888c);
        return c7888c;
    }

    /* renamed from: B0 */
    public final void m40560B0(String str) {
        this.f42636B = str;
    }

    /* renamed from: C */
    public final float m40561C() {
        C7888c c7888c = this.f42653u;
        if (c7888c != null) {
            return c7888c.m40621a();
        }
        return 0.0f;
    }

    /* renamed from: C0 */
    public final void m40562C0(int i11) {
        this.f42637C = i11;
    }

    /* renamed from: D */
    public final int m40563D() {
        C7888c c7888c = this.f42653u;
        if (c7888c != null) {
            return c7888c.m40622b();
        }
        return 0;
    }

    /* renamed from: D0 */
    public final JSONObject m40564D0() {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObject2 = new JSONObject();
        try {
            CharSequence charSequence = this.f42651s;
            CharSequence charSequence2 = "";
            if (charSequence == null) {
                charSequence = "";
            }
            jSONObject2.put("fileName", charSequence);
            CharSequence charSequence3 = this.f42652t;
            if (charSequence3 != null) {
                charSequence2 = charSequence3;
            }
            jSONObject2.put("title", charSequence2);
            jSONObject2.put("globalMsgId", m40599m().m95029V3().m41047k());
            jSONObject2.put("clientMsgId", m40599m().m95029V3().m41045i());
            jSONObject2.put("conversationId", m40599m().mo95039W2());
            jSONObject2.put("senderId", m40599m().m94862C4());
            C7888c c7888c = this.f42653u;
            if (c7888c != null) {
                jSONObject = c7888c.m40633m();
            } else {
                jSONObject = null;
            }
            jSONObject2.put("layout", jSONObject);
            if (this.f42650r == 1) {
                str = "video";
            } else {
                str = "photo";
            }
            jSONObject2.put("subType", str);
            jSONObject2.put("selected", this.f42654v);
            jSONObject2.put("local_sharable_path", this.f42636B);
            jSONObject2.put("local_sharable_path_quality", this.f42637C);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject2;
    }

    /* renamed from: E0 */
    public final void m40565E0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        this.f42639E = c17945a0;
    }

    /* renamed from: F */
    public final float m40566F() {
        C7888c c7888c = this.f42653u;
        if (c7888c != null) {
            return c7888c.m40624d();
        }
        return 0.0f;
    }

    /* renamed from: H */
    public final float m40567H() {
        C7888c c7888c = this.f42653u;
        if (c7888c != null) {
            return c7888c.m40625e();
        }
        return 0.0f;
    }

    /* renamed from: I */
    public final float m40568I() {
        C7888c c7888c = this.f42653u;
        if (c7888c != null) {
            return c7888c.m40626f();
        }
        return 0.0f;
    }

    /* renamed from: J */
    public final String m40569J() {
        String m40623c;
        C7888c c7888c = this.f42653u;
        if (c7888c == null || (m40623c = c7888c.m40623c()) == null) {
            return "";
        }
        return m40623c;
    }

    /* renamed from: K */
    public final EnumC2380x m40570K() {
        return this.f42657y;
    }

    /* renamed from: M */
    public final MessageId m40571M() {
        return this.f42648p;
    }

    /* renamed from: N */
    public final String m40572N() {
        if (TextUtils.isEmpty(this.f42646L)) {
            this.f42647M = m40557u(m40556t());
            this.f42646L = m40550O(m40556t(), this.f42647M);
        }
        return this.f42646L;
    }

    /* renamed from: Q */
    public final long m40573Q() {
        return this.f42655w;
    }

    /* renamed from: R */
    public final String m40574R() {
        return this.f42636B;
    }

    /* renamed from: S */
    public final int m40575S() {
        return this.f42637C;
    }

    /* renamed from: T */
    public final String m40576T() {
        String m95131f5;
        if (m40598l0()) {
            String m95131f52 = m40599m().m95131f5();
            AbstractC19074t.m100205c(m95131f52);
            return m95131f52;
        }
        if (!TextUtils.isEmpty(m40599m().m95090b5())) {
            m95131f5 = m40599m().m95090b5();
        } else {
            m95131f5 = m40599m().m95131f5();
        }
        AbstractC19074t.m100205c(m95131f5);
        return m95131f5;
    }

    /* renamed from: U */
    public final int m40577U() {
        return this.f42650r;
    }

    /* renamed from: V */
    public final CharSequence m40578V() {
        return this.f42652t;
    }

    /* renamed from: W */
    public final String m40579W() {
        if (!TextUtils.isEmpty(m40599m().m95090b5())) {
            String m95090b5 = m40599m().m95090b5();
            AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
            return m95090b5;
        }
        if (AbstractC19646n0.m103044x1(m40599m().m95041W4())) {
            String m95019U3 = m40599m().m95019U3();
            AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
            return C31944h6.m153548n(m95019U3);
        }
        return "";
    }

    /* renamed from: X */
    public final String m40580X() {
        if (!TextUtils.isEmpty(this.f42658z)) {
            String str = this.f42658z;
            AbstractC19074t.m100205c(str);
            return str;
        }
        if (m40598l0()) {
            String m95131f5 = m40599m().m95131f5();
            AbstractC19074t.m100207e(m95131f5, "getUrl_thumb(...)");
            return m95131f5;
        }
        String m95090b5 = m40599m().m95090b5();
        AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
        return m95090b5;
    }

    /* renamed from: Y */
    public final boolean m40581Y() {
        return this.f42650r == 3;
    }

    /* renamed from: Z */
    public final boolean m40582Z() {
        if (!TextUtils.isEmpty(m40599m().m94983Q3()) && (m40599m().m95107d3() == 5 || (m40599m().m95032V6() && !m40599m().m95180k8()))) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public final boolean m40583a0() {
        boolean z11;
        synchronized (this.f42641G) {
            z11 = this.f42642H;
        }
        return z11;
    }

    @Override // vc0.InterfaceC27965d
    /* renamed from: b */
    public boolean mo40584b() {
        return this.f42654v;
    }

    /* renamed from: b0 */
    public final boolean m40585b0() {
        if (m40599m().m95248s3() == 2) {
            return true;
        }
        return false;
    }

    @Override // vc0.InterfaceC27965d
    /* renamed from: c */
    public String mo40586c() {
        return m40616y();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void m40587e(C3521p0.c cVar) {
        List list = this.f42640F;
        AbstractC19074t.m100207e(list, "msDownloadFileListeners");
        synchronized (list) {
            try {
                if (!this.f42640F.contains(cVar)) {
                    this.f42640F.add(cVar);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e0 */
    public final boolean m40588e0() {
        return this.f42656x;
    }

    /* renamed from: f */
    public final void m40589f(boolean z11) {
        List list = this.f42640F;
        AbstractC19074t.m100207e(list, "msDownloadFileListeners");
        synchronized (list) {
            try {
                List<C3521p0.c> list2 = this.f42640F;
                AbstractC19074t.m100207e(list2, "msDownloadFileListeners");
                for (C3521p0.c cVar : list2) {
                    if (cVar != null) {
                        cVar.mo17801b(this, z11);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final void m40590g(String str) {
        AbstractC19074t.m100208f(str, "localPath");
        try {
            C20556f c20556f = new C20556f(str);
            List list = this.f42640F;
            AbstractC19074t.m100207e(list, "msDownloadFileListeners");
            synchronized (list) {
                try {
                    List<C3521p0.c> list2 = this.f42640F;
                    AbstractC19074t.m100207e(list2, "msDownloadFileListeners");
                    for (C3521p0.c cVar : list2) {
                        if (cVar != null) {
                            cVar.mo17800a(this, c20556f);
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: g0 */
    public final boolean m40591g0() {
        return this.f42650r == -1;
    }

    public final int getHeight() {
        C18009w0 c18009w0;
        C17969i0 m94929K2 = m40599m().m94929K2();
        if (m94929K2 instanceof C18009w0) {
            c18009w0 = (C18009w0) m94929K2;
        } else {
            c18009w0 = null;
        }
        if (c18009w0 != null) {
            return c18009w0.m95785s();
        }
        return 0;
    }

    public final int getWidth() {
        C18009w0 c18009w0;
        C17969i0 m94929K2 = m40599m().m94929K2();
        if (m94929K2 instanceof C18009w0) {
            c18009w0 = (C18009w0) m94929K2;
        } else {
            c18009w0 = null;
        }
        if (c18009w0 != null) {
            return c18009w0.m95787u();
        }
        return 0;
    }

    /* renamed from: h */
    public final void m40592h(C3521p0.c cVar) {
        AbstractC17930e.Companion.m94551d().mo94528b(new Runnable() { // from class: zh.v6

            /* renamed from: q */
            public final /* synthetic */ C3521p0.c f148252q;

            public /* synthetic */ RunnableC32147v6(C3521p0.c cVar2) {
                r2 = cVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MediaStoreItem.m40553i(MediaStoreItem.this, r2);
            }
        });
    }

    /* renamed from: h0 */
    public final boolean m40593h0() {
        return this.f42650r == 2;
    }

    /* renamed from: i0 */
    public final boolean m40594i0() {
        return this.f42650r == 0;
    }

    /* renamed from: j */
    public final void m40595j(boolean z11, boolean z12, C3521p0.c cVar) {
        AbstractC17930e.Companion.m94551d().mo94528b(new Runnable() { // from class: zh.u6

            /* renamed from: q */
            public final /* synthetic */ C3521p0.c f148215q;

            /* renamed from: r */
            public final /* synthetic */ boolean f148216r;

            /* renamed from: s */
            public final /* synthetic */ boolean f148217s;

            public /* synthetic */ RunnableC32133u6(C3521p0.c cVar2, boolean z112, boolean z122) {
                r2 = cVar2;
                r3 = z112;
                r4 = z122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MediaStoreItem.m40554k(MediaStoreItem.this, r2, r3, r4);
            }
        });
    }

    /* renamed from: j0 */
    public final boolean m40596j0() {
        return m40599m().m95033V7();
    }

    /* renamed from: k0 */
    public final boolean m40597k0() {
        return this.f42654v;
    }

    /* renamed from: l0 */
    public final boolean m40598l0() {
        return this.f42650r == 1;
    }

    /* renamed from: m */
    public final C17945a0 m40599m() {
        C17945a0 m2636s;
        if (this.f42638D && (m2636s = AbstractC23306f.m120584H0().m2636s(this.f42648p)) != null) {
            this.f42638D = false;
            this.f42639E = m2636s;
        }
        return this.f42639E;
    }

    /* renamed from: m0 */
    public final boolean m40600m0() {
        return this.f42638D;
    }

    /* renamed from: n */
    public final C32175x6 m40601n() {
        return this.f42635A;
    }

    /* renamed from: n0 */
    public final boolean m40602n0() {
        return m40598l0();
    }

    /* renamed from: o */
    public final String m40603o() {
        return this.f42658z;
    }

    /* renamed from: o0 */
    public final boolean m40604o0(MessageId messageId) {
        return AbstractC19074t.m100204b(m40599m().m95029V3(), messageId);
    }

    /* renamed from: p */
    public final int m40605p() {
        boolean m127120J;
        boolean m127120J2;
        boolean m127120J3;
        boolean m127120J4;
        boolean m127120J5;
        boolean m127120J6;
        boolean m127120J7;
        boolean m127120J8;
        boolean m127120J9;
        boolean m127120J10;
        boolean m127120J11;
        String m95223p3 = m40599m().m95223p3();
        if (!TextUtils.isEmpty(m95223p3)) {
            AbstractC19074t.m100205c(m95223p3);
            Locale locale = Locale.getDefault();
            AbstractC19074t.m100207e(locale, "getDefault(...)");
            String lowerCase = m95223p3.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            m127120J = AbstractC24341v.m127120J(lowerCase, "flv", false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(lowerCase, "ogg", false, 2, null);
                if (!m127120J2) {
                    m127120J3 = AbstractC24341v.m127120J(lowerCase, "mov", false, 2, null);
                    if (!m127120J3) {
                        m127120J4 = AbstractC24341v.m127120J(lowerCase, "mpg", false, 2, null);
                        if (!m127120J4) {
                            m127120J5 = AbstractC24341v.m127120J(lowerCase, "mkv", false, 2, null);
                            if (!m127120J5) {
                                m127120J6 = AbstractC24341v.m127120J(lowerCase, "avi", false, 2, null);
                                if (!m127120J6) {
                                    m127120J7 = AbstractC24341v.m127120J(lowerCase, "asf", false, 2, null);
                                    if (!m127120J7) {
                                        m127120J8 = AbstractC24341v.m127120J(lowerCase, "wmv", false, 2, null);
                                        if (!m127120J8) {
                                            m127120J9 = AbstractC24341v.m127120J(lowerCase, "mp4", false, 2, null);
                                            if (!m127120J9) {
                                                m127120J10 = AbstractC24341v.m127120J(lowerCase, "3gp", false, 2, null);
                                                if (!m127120J10) {
                                                    m127120J11 = AbstractC24341v.m127120J(lowerCase, "pdf", false, 2, null);
                                                    if (m127120J11) {
                                                        return 1;
                                                    }
                                                    return -1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 0;
        }
        return -1;
    }

    /* renamed from: p0 */
    public final void m40606p0(C3521p0.c cVar) {
        AbstractC19074t.m100208f(cVar, "listener");
        List list = this.f42640F;
        AbstractC19074t.m100207e(list, "msDownloadFileListeners");
        synchronized (list) {
            this.f42640F.remove(cVar);
        }
    }

    /* renamed from: q */
    public final CharSequence m40607q() {
        return this.f42651s;
    }

    /* renamed from: q0 */
    public final void m40608q0(C32175x6 c32175x6) {
        this.f42635A = c32175x6;
    }

    /* renamed from: r0 */
    public final void m40609r0(String str) {
        this.f42658z = str;
    }

    /* renamed from: t0 */
    public final void m40610t0(boolean z11) {
        synchronized (this.f42641G) {
            this.f42642H = z11;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    public String toString() {
        return "MediaStoreItem{, messageId=" + this.f42648p + "}";
    }

    /* renamed from: u0 */
    public final void m40611u0(EnumC2380x enumC2380x) {
        AbstractC19074t.m100208f(enumC2380x, "<set-?>");
        this.f42657y = enumC2380x;
    }

    /* renamed from: v0 */
    public final void m40612v0(EnumC2382z enumC2382z, Pattern pattern) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        if (pattern != null) {
            if (enumC2382z == EnumC2382z.f9946s) {
                if (!TextUtils.isEmpty(this.f42652t)) {
                    String m120002o = AbstractC23262x6.m120002o(String.valueOf(this.f42652t));
                    AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                    Matcher matcher = pattern.matcher(m120002o);
                    SpannableString spannableString = new SpannableString(this.f42652t);
                    AbstractC19074t.m100205c(matcher);
                    C23250w4.m119802c0(matcher, spannableString);
                    this.f42652t = spannableString;
                    return;
                }
                return;
            }
            if (enumC2382z == EnumC2382z.f9947t && !TextUtils.isEmpty(this.f42651s)) {
                String m120002o2 = AbstractC23262x6.m120002o(String.valueOf(this.f42651s));
                AbstractC19074t.m100207e(m120002o2, "convertSignToNoSign(...)");
                Matcher matcher2 = pattern.matcher(m120002o2);
                SpannableString spannableString2 = new SpannableString(this.f42651s);
                AbstractC19074t.m100205c(matcher2);
                C23250w4.m119802c0(matcher2, spannableString2);
                this.f42651s = spannableString2;
            }
        }
    }

    /* renamed from: w */
    public final String m40613w() {
        String str = "";
        if (m40599m().m95248s3() != 2) {
            return "";
        }
        long m95238r3 = m40599m().m95238r3();
        if (m95238r3 > 0) {
            str = "" + AbstractC23041d2.m118226y(m95238r3);
        }
        if (m40599m().m95003S4() > 0) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_folder_items);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(m40599m().m95003S4())}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            return str + " • " + format;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        String str;
        String str2;
        JSONObject m40633m;
        String jSONObject;
        AbstractC19074t.m100208f(parcel, "dest");
        parcel.writeLong(m40599m().m95029V3().m41047k());
        parcel.writeLong(m40599m().m95029V3().m41045i());
        parcel.writeString(m40599m().m95029V3().m41050n());
        parcel.writeString(m40599m().m95029V3().m41048l());
        parcel.writeLong(m40599m().m94974P4());
        CharSequence charSequence = this.f42651s;
        String str3 = "";
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        parcel.writeString(str);
        CharSequence charSequence2 = this.f42652t;
        if (charSequence2 == null || (str2 = charSequence2.toString()) == null) {
            str2 = "";
        }
        parcel.writeString(str2);
        C7888c c7888c = this.f42653u;
        if (c7888c != null && (m40633m = c7888c.m40633m()) != null && (jSONObject = m40633m.toString()) != null) {
            str3 = jSONObject;
        }
        parcel.writeString(str3);
        parcel.writeInt(this.f42650r);
        parcel.writeInt(this.f42654v ? 1 : 0);
    }

    /* renamed from: x */
    public final String m40614x() {
        return m40599m().m95029V3().m41042C();
    }

    /* renamed from: x0 */
    public final void m40615x0(EnumC2382z enumC2382z, Pattern pattern, int i11) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        if (pattern != null) {
            if (enumC2382z == EnumC2382z.f9946s) {
                if (!TextUtils.isEmpty(this.f42652t)) {
                    String m120002o = AbstractC23262x6.m120002o(String.valueOf(this.f42652t));
                    AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                    Matcher matcher = pattern.matcher(m120002o);
                    SpannableString spannableString = new SpannableString(this.f42652t);
                    C23250w4 c23250w4 = C23250w4.f112644a;
                    AbstractC19074t.m100205c(matcher);
                    c23250w4.m119832d0(matcher, spannableString, i11);
                    this.f42652t = spannableString;
                    return;
                }
                return;
            }
            if (enumC2382z == EnumC2382z.f9947t && !TextUtils.isEmpty(this.f42651s)) {
                String m120002o2 = AbstractC23262x6.m120002o(String.valueOf(this.f42651s));
                AbstractC19074t.m100207e(m120002o2, "convertSignToNoSign(...)");
                Matcher matcher2 = pattern.matcher(m120002o2);
                SpannableString spannableString2 = new SpannableString(this.f42651s);
                C23250w4 c23250w42 = C23250w4.f112644a;
                AbstractC19074t.m100205c(matcher2);
                c23250w42.m119832d0(matcher2, spannableString2, i11);
                this.f42651s = spannableString2;
            }
        }
    }

    /* renamed from: y */
    public final String m40616y() {
        return m40599m().m95029V3().m41042C();
    }

    /* renamed from: z */
    public final long m40617z() {
        if (m40599m().m95029V3().m41047k() != 0) {
            return m40599m().m95029V3().m41047k();
        }
        if (m40599m().m95029V3().m41045i() != 0) {
            return m40599m().m95029V3().m41045i();
        }
        return m40599m().m94974P4();
    }

    /* renamed from: z0 */
    public final void m40618z0(long j11) {
        this.f42655w = j11;
    }

    public /* synthetic */ MediaStoreItem(MessageId messageId, long j11, int i11, AbstractC19060k abstractC19060k) {
        this(messageId, (i11 & 2) != 0 ? 0L : j11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaStoreItem(JSONObject jSONObject) {
        this(r12.m41063a(r13, r15, r17, r18), 0L, 2, null);
        MessageId.C7932a c7932a = MessageId.Companion;
        long j11 = (jSONObject == null || jSONObject.isNull("clientMsgId")) ? 0L : jSONObject.getLong("clientMsgId");
        long j12 = (jSONObject == null || jSONObject.isNull("globalMsgId")) ? 0L : jSONObject.getLong("globalMsgId");
        String string = (jSONObject == null || jSONObject.isNull("conversationId")) ? "" : jSONObject.getString("conversationId");
        AbstractC19074t.m100205c(string);
        String string2 = (jSONObject == null || jSONObject.isNull("senderId")) ? "" : jSONObject.getString("senderId");
        AbstractC19074t.m100205c(string2);
        if (jSONObject != null) {
            try {
                this.f42649q = jSONObject.isNull("createdTime") ? 0L : jSONObject.getLong("createdTime");
                this.f42651s = !jSONObject.isNull("fileName") ? jSONObject.getString("fileName") : "";
                this.f42652t = !jSONObject.isNull("title") ? jSONObject.getString("title") : "";
                this.f42653u = !jSONObject.isNull("layout") ? new C7888c(jSONObject.getJSONObject("layout")) : null;
                this.f42650r = AbstractC19074t.m100204b(jSONObject.optString("subType", ""), "video") ? 1 : 0;
                this.f42654v = jSONObject.optBoolean("selected", false);
                this.f42636B = jSONObject.optString("local_sharable_path");
                this.f42637C = jSONObject.optInt("local_sharable_path_quality", 1);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaStoreItem(C17945a0 c17945a0) {
        this(r0, c17945a0.m94974P4());
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        this.f42639E = c17945a0;
        this.f42653u = new C7888c(null);
        m40555l(c17945a0.m95041W4(), c17945a0.m94929K2(), c17945a0);
        if (AbstractC31111g.m151125f(m40599m())) {
            C2549x.f10397a.m12853g("chat_storedmedia", c17945a0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaStoreItem(C3554v c3554v) {
        this(c3554v.m18061c(), Long.parseLong(c3554v.m18064f()));
        AbstractC19074t.m100208f(c3554v, "searchResultChatContent");
        try {
            this.f42650r = -1;
            int m18065g = c3554v.m18065g();
            String m18059a = c3554v.m18059a();
            if (AbstractC19646n0.m103003m1(m18065g)) {
                if (!TextUtils.isEmpty(m18059a)) {
                    this.f42650r = 3;
                }
            } else if (AbstractC19646n0.m103035u1(m18065g)) {
                if (!TextUtils.isEmpty(m18059a)) {
                    this.f42650r = 2;
                }
            } else if (AbstractC19646n0.m103044x1(m18065g)) {
                String m153548n = C31944h6.m153548n(c3554v.m18060b());
                m40599m().m94882Eb(m153548n);
                this.f42652t = m153548n;
                if (!TextUtils.isEmpty(m40599m().m95090b5())) {
                    this.f42650r = 2;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaStoreItem(Parcel parcel) {
        this(r0.m41063a(0L, 0L, "", ""), 0L, 2, null);
        AbstractC19074t.m100208f(parcel, "parcel");
        MessageId.C7932a c7932a = MessageId.Companion;
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        this.f42649q = parcel.readLong();
        this.f42648p = c7932a.m41063a(readLong2, readLong, readString2 == null ? "" : readString2, readString != null ? readString : "");
        this.f42651s = parcel.readString();
        this.f42652t = parcel.readString();
        String readString3 = parcel.readString();
        if (readString3 != null) {
            this.f42653u = !TextUtils.isEmpty(readString3) ? new C7888c(new JSONObject(readString3)) : null;
        }
        this.f42650r = parcel.readInt();
        this.f42654v = parcel.readInt() == 1;
    }
}
