package dj;

import android.text.TextUtils;
import me0.AbstractC23008a2;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p394oj.C24280f;
import p716zh.C32091r6;

/* renamed from: dj.w0 */
/* loaded from: classes3.dex */
public class C18009w0 extends C17969i0 implements InterfaceC17973j1 {

    /* renamed from: B */
    private String f91211B;

    /* renamed from: C */
    private int f91212C;

    /* renamed from: D */
    private int f91213D;

    /* renamed from: E */
    private String f91214E;

    /* renamed from: F */
    private String f91215F;

    /* renamed from: G */
    private long f91216G;

    /* renamed from: H */
    private boolean f91217H;

    /* renamed from: I */
    private int f91218I;

    /* renamed from: J */
    private int f91219J;

    /* renamed from: K */
    private String f91220K;

    /* renamed from: L */
    private String f91221L;

    /* renamed from: M */
    private String f91222M;

    /* renamed from: N */
    private boolean f91223N;

    /* renamed from: O */
    private int f91224O;

    /* renamed from: P */
    private int f91225P;

    /* renamed from: Q */
    private long f91226Q;

    /* renamed from: R */
    private int f91227R;

    /* renamed from: S */
    private int f91228S;

    /* renamed from: T */
    private int f91229T;

    /* renamed from: U */
    private int f91230U;

    /* renamed from: V */
    private String f91231V;

    /* renamed from: W */
    private String f91232W;

    /* renamed from: X */
    private C24280f f91233X;

    /* renamed from: Y */
    private String f91234Y;

    /* renamed from: Z */
    private String f91235Z;

    /* renamed from: a0 */
    private float f91236a0;

    /* renamed from: b0 */
    private float f91237b0;

    /* renamed from: c0 */
    private boolean f91238c0;

    /* renamed from: d0 */
    public long f91239d0;

    /* renamed from: e0 */
    private long f91240e0;

    /* renamed from: f0 */
    private long f91241f0;

    /* renamed from: g0 */
    private long f91242g0;

    /* renamed from: h0 */
    private boolean f91243h0;

    /* renamed from: i0 */
    private int f91244i0;

    /* renamed from: j0 */
    private int f91245j0;

    /* renamed from: k0 */
    private int f91246k0;

    public C18009w0(C18009w0 c18009w0) {
        super(c18009w0.f91011p, c18009w0.f91012q, c18009w0.f91013r, c18009w0.f91014s, c18009w0.f91015t, c18009w0.f91016u, c18009w0.f91017v);
        this.f91211B = "";
        this.f91212C = 0;
        this.f91213D = 0;
        this.f91214E = "";
        this.f91215F = "";
        this.f91216G = -1L;
        this.f91217H = false;
        this.f91221L = "";
        this.f91222M = "";
        this.f91223N = true;
        this.f91224O = 0;
        this.f91225P = -1;
        this.f91226Q = -1L;
        this.f91231V = "";
        this.f91238c0 = false;
        this.f91239d0 = 0L;
        this.f91243h0 = false;
        this.f91244i0 = -1;
        this.f91245j0 = -1;
        this.f91246k0 = -1;
        this.f91211B = c18009w0.f91211B;
        this.f91212C = c18009w0.f91212C;
        this.f91213D = c18009w0.f91213D;
        this.f91214E = c18009w0.f91214E;
        this.f91215F = c18009w0.f91215F;
        this.f91216G = c18009w0.f91216G;
        this.f91217H = c18009w0.f91217H;
        this.f91218I = c18009w0.f91218I;
        this.f91219J = c18009w0.f91219J;
        this.f91227R = c18009w0.f91227R;
        this.f91228S = c18009w0.f91228S;
        this.f91229T = c18009w0.f91229T;
        this.f91230U = c18009w0.f91230U;
        this.f91234Y = c18009w0.f91234Y;
        this.f91244i0 = c18009w0.m95786t();
        this.f91245j0 = c18009w0.m95736A();
        this.f91246k0 = c18009w0.m95792z();
        m95734l0(c18009w0.f91232W, this.f91244i0);
        this.f91021z = c18009w0.f91021z;
    }

    /* renamed from: L */
    private void m95732L() {
        JSONObject jSONObject;
        boolean z11;
        boolean z12;
        boolean z13;
        try {
            if (!TextUtils.isEmpty(this.f91017v)) {
                JSONObject jSONObject2 = new JSONObject(this.f91017v);
                if (jSONObject2.has("hd")) {
                    this.f91211B = AbstractC18069a.m96089h(jSONObject2, "hd");
                }
                if (jSONObject2.has("width")) {
                    this.f91212C = AbstractC18069a.m96085d(jSONObject2, "width");
                }
                if (jSONObject2.has("height")) {
                    this.f91213D = AbstractC18069a.m96085d(jSONObject2, "height");
                }
                if (jSONObject2.has("voice")) {
                    this.f91215F = AbstractC18069a.m96089h(jSONObject2, "voice");
                }
                if (jSONObject2.has("voiceLocalPath")) {
                    this.f91214E = AbstractC18069a.m96089h(jSONObject2, "voiceLocalPath");
                }
                boolean z14 = false;
                if (jSONObject2.has("is_group_layout")) {
                    if (AbstractC18069a.m96085d(jSONObject2, "is_group_layout") == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.f91217H = z13;
                }
                if (jSONObject2.has("group_layout_id")) {
                    this.f91216G = AbstractC18069a.m96087f(jSONObject2, "group_layout_id");
                }
                if (jSONObject2.has("id_in_group")) {
                    this.f91218I = AbstractC18069a.m96085d(jSONObject2, "id_in_group");
                }
                if (jSONObject2.has("total_item_in_group")) {
                    this.f91219J = AbstractC18069a.m96085d(jSONObject2, "total_item_in_group");
                }
                if (jSONObject2.has("href_renew")) {
                    this.f91221L = AbstractC18069a.m96089h(jSONObject2, "href_renew");
                }
                if (jSONObject2.has("hd_renew")) {
                    this.f91222M = AbstractC18069a.m96089h(jSONObject2, "hd_renew");
                }
                if (jSONObject2.has("fileValid")) {
                    if (AbstractC18069a.m96085d(jSONObject2, "fileValid") == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f91223N = z12;
                }
                if (jSONObject2.has("albumID")) {
                    this.f91226Q = AbstractC18069a.m96087f(jSONObject2, "albumID");
                }
                if (jSONObject2.has("albumAction")) {
                    this.f91225P = AbstractC18069a.m96085d(jSONObject2, "albumAction");
                }
                if (jSONObject2.has("tracking")) {
                    this.f91231V = AbstractC18069a.m96089h(jSONObject2, "tracking");
                }
                if (jSONObject2.has("webp")) {
                    jSONObject = AbstractC18069a.m96091j(jSONObject2, "webp");
                } else {
                    jSONObject = null;
                }
                String str = "";
                if (jSONObject2.has("contentId")) {
                    this.f91234Y = AbstractC18069a.m96089h(jSONObject2, "contentId");
                } else {
                    this.f91234Y = "";
                }
                if (jSONObject2.has("forward_path_photo")) {
                    this.f91220K = AbstractC18069a.m96089h(jSONObject2, "forward_path_photo");
                }
                if (jSONObject2.has("result_qr_code")) {
                    this.f91235Z = AbstractC18069a.m96089h(jSONObject2, "result_qr_code");
                }
                if (jSONObject2.has("center_qr_point_x")) {
                    this.f91236a0 = (float) AbstractC18069a.m96084c(jSONObject2, "center_qr_point_x");
                }
                if (jSONObject2.has("center_qr_point_y")) {
                    this.f91237b0 = (float) AbstractC18069a.m96084c(jSONObject2, "center_qr_point_y");
                }
                if (jSONObject2.has("is_has_decoded_qr_view_full")) {
                    if (AbstractC18069a.m96085d(jSONObject2, "is_has_decoded_qr_view_full") == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f91238c0 = z11;
                }
                if (jSONObject2.has("fileSize")) {
                    this.f91240e0 = AbstractC18069a.m96087f(jSONObject2, "fileSize");
                }
                if (jSONObject2.has("hdSize")) {
                    this.f91241f0 = AbstractC18069a.m96087f(jSONObject2, "hdSize");
                }
                if (jSONObject2.has("thumbSize")) {
                    this.f91242g0 = AbstractC18069a.m96087f(jSONObject2, "thumbSize");
                }
                if (jSONObject2.has("is_skip_clone_compress")) {
                    if (AbstractC18069a.m96085d(jSONObject2, "is_skip_clone_compress") == 1) {
                        z14 = true;
                    }
                    this.f91243h0 = z14;
                }
                if (jSONObject2.has("pStickerType")) {
                    this.f91244i0 = AbstractC18069a.m96086e(jSONObject2, "pStickerType", -1);
                }
                if (jSONObject2.has("pStickerRootCateId")) {
                    this.f91245j0 = AbstractC18069a.m96086e(jSONObject2, "pStickerRootCateId", -1);
                }
                if (jSONObject2.has("pStickerId")) {
                    this.f91246k0 = AbstractC18069a.m96086e(jSONObject2, "pStickerId", -1);
                }
                if (jSONObject2.has("convertible")) {
                    this.f91021z = AbstractC18069a.m96089h(jSONObject2, "convertible");
                }
                m95735o0();
                if (jSONObject != null) {
                    str = jSONObject.toString();
                }
                m95734l0(str, this.f91244i0);
                m95733g();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m95733g() {
        if (!this.f91021z.isEmpty()) {
            this.f91211B = AbstractC23008a2.m117937f(this.f91211B, this.f91021z);
            this.f91014s = AbstractC23008a2.m117937f(this.f91014s, this.f91021z);
            this.f91013r = AbstractC23008a2.m117937f(this.f91013r, this.f91021z);
        }
    }

    /* renamed from: l0 */
    private void m95734l0(String str, int i11) {
        C24280f c24280f;
        this.f91232W = str;
        if (TextUtils.isEmpty(str)) {
            c24280f = null;
        } else {
            c24280f = new C24280f(this.f91232W);
        }
        this.f91233X = c24280f;
        if (c24280f == null && i11 == 1) {
            this.f91233X = new C24280f(this.f91014s, this.f91212C, this.f91213D, this.f91013r);
        }
    }

    /* renamed from: o0 */
    private void m95735o0() {
        int[] m154831a = C32091r6.m154831a(this.f91212C, this.f91213D);
        this.f91227R = m154831a[0];
        this.f91228S = m154831a[1];
    }

    /* renamed from: A */
    public int m95736A() {
        return this.f91245j0;
    }

    /* renamed from: B */
    public String m95737B() {
        return this.f91221L;
    }

    /* renamed from: C */
    public int m95738C() {
        return this.f91230U;
    }

    /* renamed from: D */
    public int m95739D() {
        return this.f91229T;
    }

    /* renamed from: E */
    public String m95740E() {
        return this.f91214E;
    }

    /* renamed from: F */
    public String m95741F() {
        return this.f91215F;
    }

    /* renamed from: G */
    public C24280f m95742G() {
        return this.f91233X;
    }

    /* renamed from: H */
    public boolean m95743H() {
        return this.f91217H;
    }

    /* renamed from: I */
    public boolean m95744I() {
        return this.f91238c0;
    }

    /* renamed from: J */
    public boolean m95745J() {
        return this.f91243h0;
    }

    /* renamed from: K */
    public void m95746K(boolean z11) {
        this.f91217H = z11;
    }

    /* renamed from: M */
    public void m95747M(int i11) {
        this.f91225P = i11;
    }

    /* renamed from: N */
    public void m95748N(long j11) {
        this.f91226Q = j11;
    }

    /* renamed from: O */
    public void m95749O(float f11) {
        this.f91236a0 = f11;
    }

    /* renamed from: P */
    public void m95750P(float f11) {
        this.f91237b0 = f11;
    }

    /* renamed from: Q */
    public void m95751Q(String str) {
        this.f91234Y = str;
    }

    /* renamed from: R */
    public void m95752R(long j11) {
        this.f91240e0 = j11;
    }

    /* renamed from: S */
    public void m95753S(String str) {
        this.f91220K = str;
    }

    /* renamed from: T */
    public void m95754T(long j11) {
        this.f91216G = j11;
    }

    /* renamed from: U */
    public void m95755U(int i11) {
        this.f91219J = i11;
    }

    /* renamed from: V */
    public void m95756V(boolean z11) {
        this.f91238c0 = z11;
    }

    /* renamed from: W */
    public void m95757W(long j11) {
        this.f91241f0 = j11;
    }

    /* renamed from: X */
    public void m95758X(String str) {
        this.f91211B = str;
    }

    /* renamed from: Y */
    public void m95759Y(int i11) {
        this.f91244i0 = i11;
    }

    /* renamed from: Z */
    public void m95760Z(int i11) {
        this.f91218I = i11;
    }

    @Override // dj.InterfaceC17973j1
    /* renamed from: a */
    public String mo95470a() {
        if (TextUtils.isEmpty(this.f91222M)) {
            return this.f91221L;
        }
        return this.f91222M;
    }

    /* renamed from: a0 */
    public void m95761a0(String str) {
        this.f91235Z = str;
    }

    /* renamed from: b0 */
    public void m95762b0(boolean z11) {
        this.f91243h0 = z11;
    }

    /* renamed from: c0 */
    public void m95763c0(int i11) {
        this.f91246k0 = i11;
    }

    /* renamed from: d0 */
    public void m95764d0(int i11) {
        this.f91245j0 = i11;
    }

    @Override // dj.C17969i0
    /* renamed from: e */
    public String mo95597e() {
        C24280f c24280f = this.f91233X;
        if (c24280f != null && !TextUtils.isEmpty(c24280f.f117264d)) {
            return this.f91233X.f117264d;
        }
        if (!TextUtils.isEmpty(this.f91013r)) {
            return this.f91013r;
        }
        return this.f91014s;
    }

    /* renamed from: e0 */
    public void m95765e0(long j11) {
        this.f91242g0 = j11;
    }

    @Override // dj.C17969i0
    /* renamed from: f */
    public String mo95598f() {
        return this.f91211B;
    }

    /* renamed from: f0 */
    public void m95766f0(String str) {
        this.f91231V = str;
    }

    /* renamed from: g0 */
    public void m95767g0(String str, String str2) {
        this.f91221L = str;
        this.f91222M = str2;
    }

    /* renamed from: h */
    public long m95768h() {
        return this.f91226Q;
    }

    /* renamed from: h0 */
    public void m95769h0(int i11) {
        this.f91230U = i11;
    }

    /* renamed from: i */
    public float m95770i() {
        return this.f91236a0;
    }

    /* renamed from: i0 */
    public void m95771i0(int i11) {
        this.f91229T = i11;
    }

    /* renamed from: j */
    public float m95772j() {
        return this.f91237b0;
    }

    /* renamed from: j0 */
    public void m95773j0(String str) {
        this.f91214E = str;
    }

    /* renamed from: k */
    public String m95774k() {
        return this.f91234Y;
    }

    /* renamed from: k0 */
    public void m95775k0(C24280f c24280f, int i11) {
        String str;
        if (c24280f != null) {
            str = c24280f.m126784a().toString();
        } else {
            str = "";
        }
        m95734l0(str, i11);
    }

    /* renamed from: l */
    public long m95776l() {
        return this.f91240e0;
    }

    /* renamed from: m */
    public long m95777m() {
        return this.f91216G;
    }

    /* renamed from: m0 */
    public void m95778m0() {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                int i11 = this.f91212C;
                if (i11 > 0 && this.f91213D > 0) {
                    jSONObject.put("width", i11);
                    jSONObject.put("height", this.f91213D);
                }
                if (!TextUtils.isEmpty(this.f91215F)) {
                    jSONObject.put("voice", this.f91215F);
                }
                if (!TextUtils.isEmpty(this.f91214E)) {
                    jSONObject.put("voiceLocalPath,", this.f91214E);
                }
                if (!TextUtils.isEmpty(this.f91211B)) {
                    jSONObject.put("hd", this.f91211B);
                }
                jSONObject.put("is_group_layout", this.f91217H ? 1 : 0);
                jSONObject.put("group_layout_id", this.f91216G);
                jSONObject.put("id_in_group", this.f91218I);
                jSONObject.put("total_item_in_group", this.f91219J);
                if (!TextUtils.isEmpty(this.f91221L)) {
                    jSONObject.put("href_renew", this.f91221L);
                }
                if (!TextUtils.isEmpty(this.f91222M)) {
                    jSONObject.put("hd_renew", this.f91222M);
                }
                jSONObject.put("fileValid", this.f91223N ? 1 : 0);
                if (this.f91226Q != -1) {
                    jSONObject.put("albumAction", this.f91225P);
                    jSONObject.put("albumID", this.f91226Q);
                }
                if (!TextUtils.isEmpty(this.f91231V)) {
                    jSONObject.put("tracking", this.f91231V);
                }
                if (!TextUtils.isEmpty(this.f91232W)) {
                    jSONObject.put("webp", new JSONObject(this.f91232W));
                }
                String str = this.f91234Y;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("contentId", str);
                jSONObject.put("forward_path_photo", this.f91220K);
                jSONObject.put("result_qr_code", this.f91235Z);
                jSONObject.put("center_qr_point_x", this.f91236a0);
                jSONObject.put("center_qr_point_y", this.f91237b0);
                jSONObject.put("is_has_decoded_qr_view_full", this.f91238c0 ? 1 : 0);
                jSONObject.put("is_skip_clone_compress", this.f91243h0 ? 1 : 0);
                long j11 = this.f91240e0;
                if (j11 > 0) {
                    jSONObject.put("fileSize", j11);
                }
                long j12 = this.f91241f0;
                if (j12 > 0) {
                    jSONObject.put("hdSize", j12);
                }
                long j13 = this.f91242g0;
                if (j13 > 0) {
                    jSONObject.put("thumbSize", j13);
                }
                int i12 = this.f91244i0;
                if (i12 >= 0) {
                    jSONObject.put("pStickerType", i12);
                }
                int i13 = this.f91245j0;
                if (i13 > 0) {
                    jSONObject.put("pStickerRootCateId", i13);
                }
                int i14 = this.f91246k0;
                if (i14 > 0) {
                    jSONObject.put("pStickerId", i14);
                }
                if (!this.f91021z.isEmpty()) {
                    jSONObject.put("convertible", this.f91021z);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            this.f91017v = jSONObject.toString();
        } catch (Throwable th2) {
            this.f91017v = jSONObject.toString();
            throw th2;
        }
    }

    /* renamed from: n */
    public int m95779n() {
        return this.f91219J;
    }

    /* renamed from: n0 */
    public void m95780n0(String str, int i11, int i12) {
        this.f91211B = str;
        this.f91212C = i11;
        this.f91213D = i12;
        m95735o0();
    }

    /* renamed from: o */
    public long m95781o() {
        return this.f91241f0;
    }

    /* renamed from: p */
    public String m95782p() {
        return this.f91222M;
    }

    /* renamed from: q */
    public JSONObject m95783q() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i11 = this.f91212C;
            if (i11 > 0 && this.f91213D > 0) {
                jSONObject.put("width", i11);
                jSONObject.put("height", this.f91213D);
            }
            if (!TextUtils.isEmpty(this.f91215F)) {
                jSONObject.put("voice", this.f91215F);
            }
            if (!TextUtils.isEmpty(this.f91211B)) {
                jSONObject.put("hd", this.f91211B);
            }
            jSONObject.put("is_group_layout", this.f91217H ? 1 : 0);
            jSONObject.put("group_layout_id", this.f91216G);
            jSONObject.put("id_in_group", this.f91218I);
            jSONObject.put("total_item_in_group", this.f91219J);
            if (this.f91226Q != -1) {
                jSONObject.put("albumAction", this.f91225P);
                jSONObject.put("albumID", this.f91226Q);
            }
            if (!TextUtils.isEmpty(this.f91231V)) {
                jSONObject.put("tracking", this.f91231V);
            }
            if (!TextUtils.isEmpty(this.f91232W)) {
                jSONObject.put("webp", new JSONObject(this.f91232W));
            }
            String str = this.f91234Y;
            if (str == null) {
                str = "";
            }
            jSONObject.put("contentId", str);
            long j11 = this.f91240e0;
            if (j11 > 0) {
                jSONObject.put("fileSize", j11);
            }
            long j12 = this.f91241f0;
            if (j12 > 0) {
                jSONObject.put("hdSize", j12);
            }
            long j13 = this.f91242g0;
            if (j13 > 0) {
                jSONObject.put("thumbSize", j13);
            }
            int i12 = this.f91244i0;
            if (i12 >= 0) {
                jSONObject.put("pStickerType", i12);
            }
            int i13 = this.f91245j0;
            if (i13 >= 0) {
                jSONObject.put("pStickerRootCateId", i13);
            }
            int i14 = this.f91246k0;
            if (i14 >= 0) {
                jSONObject.put("pStickerId", i14);
            }
            if (!this.f91021z.isEmpty()) {
                jSONObject.put("convertible", this.f91021z);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    /* renamed from: r */
    public String m95784r() {
        return m95783q().toString();
    }

    /* renamed from: s */
    public int m95785s() {
        return this.f91213D;
    }

    /* renamed from: t */
    public int m95786t() {
        return this.f91244i0;
    }

    /* renamed from: u */
    public int m95787u() {
        return this.f91212C;
    }

    /* renamed from: v */
    public int m95788v() {
        return this.f91218I;
    }

    /* renamed from: w */
    public int m95789w() {
        return this.f91228S;
    }

    /* renamed from: x */
    public int m95790x() {
        return this.f91227R;
    }

    /* renamed from: y */
    public String m95791y() {
        return this.f91235Z;
    }

    /* renamed from: z */
    public int m95792z() {
        return this.f91246k0;
    }

    public C18009w0(int i11, int i12) {
        this("", "", "", "", i11, i12);
    }

    public C18009w0(String str, String str2, String str3, String str4, int i11, int i12) {
        super(str, 0, str2, str3, "", "", "");
        this.f91214E = "";
        this.f91215F = "";
        this.f91216G = -1L;
        this.f91217H = false;
        this.f91221L = "";
        this.f91222M = "";
        this.f91223N = true;
        this.f91224O = 0;
        this.f91225P = -1;
        this.f91226Q = -1L;
        this.f91231V = "";
        this.f91238c0 = false;
        this.f91239d0 = 0L;
        this.f91243h0 = false;
        this.f91244i0 = -1;
        this.f91245j0 = -1;
        this.f91246k0 = -1;
        this.f91211B = str4;
        this.f91212C = i11;
        this.f91213D = i12;
        m95735o0();
    }

    public C18009w0(JSONObject jSONObject) {
        super(jSONObject);
        this.f91211B = "";
        this.f91212C = 0;
        this.f91213D = 0;
        this.f91214E = "";
        this.f91215F = "";
        this.f91216G = -1L;
        this.f91217H = false;
        this.f91221L = "";
        this.f91222M = "";
        this.f91223N = true;
        this.f91224O = 0;
        this.f91225P = -1;
        this.f91226Q = -1L;
        this.f91231V = "";
        this.f91238c0 = false;
        this.f91239d0 = 0L;
        this.f91243h0 = false;
        this.f91244i0 = -1;
        this.f91245j0 = -1;
        this.f91246k0 = -1;
        m95732L();
    }

    public C18009w0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f91211B = "";
        this.f91212C = 0;
        this.f91213D = 0;
        this.f91214E = "";
        this.f91215F = "";
        this.f91216G = -1L;
        this.f91217H = false;
        this.f91221L = "";
        this.f91222M = "";
        this.f91223N = true;
        this.f91224O = 0;
        this.f91225P = -1;
        this.f91226Q = -1L;
        this.f91231V = "";
        this.f91238c0 = false;
        this.f91239d0 = 0L;
        this.f91243h0 = false;
        this.f91244i0 = -1;
        this.f91245j0 = -1;
        this.f91246k0 = -1;
        m95732L();
    }
}
