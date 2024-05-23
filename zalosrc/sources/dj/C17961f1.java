package dj;

import android.text.TextUtils;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import hu.AbstractC20130d;
import java.io.File;
import me0.AbstractC23041d2;
import me0.AbstractC23078g6;
import me0.AbstractC23204s0;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p559uv.C27373c;
import p716zh.C32091r6;
import th.AbstractC26689j;

/* renamed from: dj.f1 */
/* loaded from: classes3.dex */
public class C17961f1 extends C17969i0 implements InterfaceC17973j1 {

    /* renamed from: B */
    private String f90917B;

    /* renamed from: C */
    private String f90918C;

    /* renamed from: D */
    private long f90919D;

    /* renamed from: E */
    private int f90920E;

    /* renamed from: F */
    private int f90921F;

    /* renamed from: G */
    private int f90922G;

    /* renamed from: H */
    private int f90923H;

    /* renamed from: I */
    private String f90924I;

    /* renamed from: J */
    private int f90925J;

    /* renamed from: K */
    private int f90926K;

    /* renamed from: L */
    private String f90927L;

    /* renamed from: M */
    private int f90928M;

    /* renamed from: N */
    private int f90929N;

    /* renamed from: O */
    private long f90930O;

    /* renamed from: P */
    private int f90931P;

    /* renamed from: Q */
    private int f90932Q;

    /* renamed from: R */
    private long f90933R;

    /* renamed from: S */
    private long f90934S;

    /* renamed from: T */
    private long f90935T;

    /* renamed from: U */
    private boolean f90936U;

    /* renamed from: V */
    private boolean f90937V;

    /* renamed from: W */
    private boolean f90938W;

    /* renamed from: X */
    private boolean f90939X;

    /* renamed from: Y */
    private VideoBlendingParam f90940Y;

    /* renamed from: Z */
    private long f90941Z;

    /* renamed from: a0 */
    private boolean f90942a0;

    /* renamed from: b0 */
    private int f90943b0;

    /* renamed from: c0 */
    private int f90944c0;

    /* renamed from: d0 */
    private int f90945d0;

    /* renamed from: e0 */
    private long f90946e0;

    /* renamed from: f0 */
    private String f90947f0;

    /* renamed from: g0 */
    private int f90948g0;

    /* renamed from: h0 */
    private int f90949h0;

    /* renamed from: i0 */
    private int f90950i0;

    /* renamed from: j0 */
    private int f90951j0;

    /* renamed from: k0 */
    private String f90952k0;

    /* renamed from: l0 */
    private String f90953l0;

    /* renamed from: m0 */
    private String f90954m0;

    /* renamed from: n0 */
    private boolean f90955n0;

    /* renamed from: o0 */
    public long f90956o0;

    /* renamed from: p0 */
    private boolean f90957p0;

    public C17961f1(C17961f1 c17961f1) {
        super(c17961f1.f91011p, c17961f1.f91012q, c17961f1.f91013r, c17961f1.f91014s, c17961f1.f91015t, c17961f1.f91016u, c17961f1.f91017v);
        this.f90917B = "";
        this.f90918C = "";
        this.f90919D = 0L;
        this.f90920E = 0;
        this.f90921F = 0;
        this.f90922G = 0;
        this.f90923H = 0;
        this.f90924I = "";
        this.f90926K = -1;
        this.f90927L = "";
        this.f90930O = 0L;
        this.f90931P = 0;
        this.f90932Q = 24;
        this.f90933R = 0L;
        this.f90934S = 0L;
        this.f90935T = 0L;
        this.f90942a0 = false;
        this.f90945d0 = -1;
        this.f90946e0 = -1L;
        this.f90947f0 = "";
        this.f90952k0 = "";
        this.f90953l0 = "";
        this.f90954m0 = "";
        this.f90955n0 = false;
        this.f90956o0 = 0L;
        this.f90957p0 = false;
        this.f90954m0 = c17961f1.f90954m0;
        this.f90917B = c17961f1.f90917B;
        this.f90918C = c17961f1.f90918C;
        this.f90919D = c17961f1.f90919D;
        this.f90920E = c17961f1.f90920E;
        this.f90921F = c17961f1.f90921F;
        this.f90922G = c17961f1.f90922G;
        this.f90923H = c17961f1.f90923H;
        this.f90926K = c17961f1.f90926K;
        this.f90924I = c17961f1.f90924I;
        this.f90925J = c17961f1.f90925J;
        this.f90927L = c17961f1.f90927L;
        this.f90928M = c17961f1.f90928M;
        this.f90929N = c17961f1.f90929N;
        this.f90930O = c17961f1.f90930O;
        this.f90931P = c17961f1.f90931P;
        this.f90932Q = c17961f1.f90932Q;
        this.f90933R = c17961f1.f90933R;
        this.f90934S = c17961f1.f90934S;
        this.f90935T = c17961f1.f90935T;
        this.f90936U = c17961f1.f90936U;
        this.f90937V = c17961f1.f90937V;
        this.f90938W = c17961f1.f90937V;
        this.f90939X = c17961f1.f90939X;
        this.f90940Y = c17961f1.f90940Y;
        this.f90941Z = c17961f1.f90941Z;
        this.f90942a0 = c17961f1.f90942a0;
        this.f90944c0 = c17961f1.f90944c0;
        this.f90943b0 = c17961f1.f90943b0;
        this.f90947f0 = c17961f1.f90947f0;
        this.f90948g0 = c17961f1.f90948g0;
        this.f90949h0 = c17961f1.f90949h0;
        this.f90950i0 = c17961f1.f90950i0;
        this.f90951j0 = c17961f1.f90951j0;
        this.f90955n0 = c17961f1.f90955n0;
        this.f90957p0 = c17961f1.f90957p0;
    }

    /* renamed from: A */
    public static String m95438A(C27373c c27373c, boolean z11, long j11, int i11, int i12, long j12, int i13) {
        String m140268v;
        String m140267u;
        String m140270x;
        String m140249e;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("video_input_path", c27373c.m140220E());
            if (TextUtils.isEmpty(c27373c.m140268v())) {
                m140268v = "";
            } else {
                m140268v = c27373c.m140268v();
            }
            jSONObject.put("video_thumb_local_path", m140268v);
            if (TextUtils.isEmpty(c27373c.m140267u())) {
                m140267u = "";
            } else {
                m140267u = c27373c.m140267u();
            }
            jSONObject.put("video_thumb_from_gallery", m140267u);
            jSONObject.put("duration", c27373c.m140255i());
            jSONObject.put("video_original_width", c27373c.m140218C());
            jSONObject.put("video_original_height", c27373c.m140217B());
            jSONObject.put("video_width", c27373c.m140221F());
            jSONObject.put("video_height", c27373c.m140272z());
            jSONObject.put("video_bitrate", c27373c.m140269w());
            jSONObject.put("audio_bitrate", c27373c.m140247d());
            if (TextUtils.isEmpty(c27373c.m140270x())) {
                m140270x = "";
            } else {
                m140270x = c27373c.m140270x();
            }
            jSONObject.put("video_codec", m140270x);
            jSONObject.put("video_profile", c27373c.m140219D());
            jSONObject.put("video_level", c27373c.m140216A());
            jSONObject.put("duration_raw", c27373c.m140254h());
            jSONObject.put("video_rotation", c27373c.m140265s());
            if (TextUtils.isEmpty(c27373c.m140249e())) {
                m140249e = "";
            } else {
                m140249e = c27373c.m140249e();
            }
            jSONObject.put("audio_codec", m140249e);
            jSONObject.put("video_file_size", c27373c.m140256j());
            jSONObject.put("fileSize", c27373c.m140257k());
            jSONObject.put("need_compress_video", c27373c.f128942O);
            jSONObject.put("need_blend_video", c27373c.f128943P);
            jSONObject.put("need_flipping", c27373c.f128944Q);
            jSONObject.put("is_from_zalo_recorder", c27373c.f128946S);
            VideoBlendingParam videoBlendingParam = c27373c.f128947T;
            boolean z12 = false;
            if (videoBlendingParam != null) {
                jSONObject.put("video_blending_param", videoBlendingParam.m48166b());
                if (c27373c.f128947T.f48265Q > 0) {
                    z12 = true;
                }
                jSONObject.put("is_trimmed", z12);
                jSONObject.put("isHD", AbstractC23078g6.Companion.m118394i(c27373c) ? 1 : 0);
            }
            jSONObject.put("is_group_layout", z11 ? 1 : 0);
            jSONObject.put("group_layout_id", j11);
            jSONObject.put("id_in_group", i12);
            jSONObject.put("total_item_in_group", i11);
            if (i13 != -1 && j12 != -1) {
                jSONObject.put("albumAction", i13);
                jSONObject.put("albumID", j12);
            }
            return jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: V */
    private void m95439V() {
        boolean z11;
        try {
            if (!TextUtils.isEmpty(this.f91017v)) {
                JSONObject jSONObject = new JSONObject(this.f91017v);
                if (jSONObject.has("gif_path")) {
                    this.f90954m0 = AbstractC18069a.m96089h(jSONObject, "gif_path");
                } else if (jSONObject.has("video_input_path")) {
                    this.f90954m0 = AbstractC18069a.m96089h(jSONObject, "video_input_path");
                }
                if (jSONObject.has("video_thumb_local_path")) {
                    this.f90917B = AbstractC18069a.m96089h(jSONObject, "video_thumb_local_path");
                    String m104842L0 = AbstractC20130d.m104842L0();
                    if (this.f90917B.startsWith(m104842L0)) {
                        this.f90917B = AbstractC20130d.m104844M0() + this.f90917B.substring(m104842L0.length());
                    }
                }
                if (jSONObject.has("video_thumb_from_gallery")) {
                    this.f90918C = AbstractC18069a.m96089h(jSONObject, "video_thumb_from_gallery");
                }
                if (jSONObject.has("duration")) {
                    this.f90919D = AbstractC18069a.m96087f(jSONObject, "duration");
                }
                if (jSONObject.has("duration_raw")) {
                    this.f90930O = AbstractC18069a.m96087f(jSONObject, "duration_raw");
                }
                if (jSONObject.has("video_original_width")) {
                    this.f90920E = AbstractC18069a.m96085d(jSONObject, "video_original_width");
                }
                if (jSONObject.has("video_original_height")) {
                    this.f90921F = AbstractC18069a.m96085d(jSONObject, "video_original_height");
                }
                if (jSONObject.has("video_width")) {
                    this.f90922G = AbstractC18069a.m96085d(jSONObject, "video_width");
                }
                if (jSONObject.has("video_height")) {
                    this.f90923H = AbstractC18069a.m96085d(jSONObject, "video_height");
                }
                if (jSONObject.has("video_bitrate")) {
                    this.f90926K = AbstractC18069a.m96085d(jSONObject, "video_bitrate");
                }
                if (jSONObject.has("audio_bitrate")) {
                    this.f90925J = AbstractC18069a.m96085d(jSONObject, "audio_bitrate");
                }
                if (jSONObject.has("video_codec")) {
                    this.f90927L = AbstractC18069a.m96089h(jSONObject, "video_codec");
                }
                if (jSONObject.has("video_profile")) {
                    this.f90928M = AbstractC18069a.m96085d(jSONObject, "video_profile");
                }
                if (jSONObject.has("video_level")) {
                    this.f90929N = AbstractC18069a.m96085d(jSONObject, "video_level");
                }
                if (jSONObject.has("video_rotation")) {
                    this.f90931P = AbstractC18069a.m96085d(jSONObject, "video_rotation");
                }
                if (jSONObject.has("audio_codec")) {
                    this.f90924I = AbstractC18069a.m96089h(jSONObject, "audio_codec");
                }
                if (jSONObject.has("video_frame_rate")) {
                    this.f90932Q = AbstractC18069a.m96085d(jSONObject, "video_frame_rate");
                }
                if (jSONObject.has("video_file_size")) {
                    this.f90933R = AbstractC18069a.m96087f(jSONObject, "video_file_size");
                }
                if (jSONObject.has("fileSize")) {
                    this.f90934S = AbstractC18069a.m96087f(jSONObject, "fileSize");
                }
                if (jSONObject.has("thumbSize")) {
                    this.f90935T = AbstractC18069a.m96087f(jSONObject, "thumbSize");
                }
                if (jSONObject.has("need_compress_video")) {
                    this.f90936U = AbstractC18069a.m96083b(jSONObject, "need_compress_video");
                }
                if (jSONObject.has("need_blend_video")) {
                    this.f90937V = AbstractC18069a.m96083b(jSONObject, "need_blend_video");
                }
                if (jSONObject.has("need_flipping")) {
                    this.f90938W = AbstractC18069a.m96083b(jSONObject, "need_flipping");
                }
                if (jSONObject.has("is_from_zalo_recorder")) {
                    this.f90939X = AbstractC18069a.m96083b(jSONObject, "is_from_zalo_recorder");
                }
                if (jSONObject.has("video_blending_param")) {
                    this.f90940Y = VideoBlendingParam.m48165a(AbstractC18069a.m96091j(jSONObject, "video_blending_param"));
                }
                boolean z12 = false;
                if (jSONObject.has("is_group_layout")) {
                    if (AbstractC18069a.m96085d(jSONObject, "is_group_layout") == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f90942a0 = z11;
                }
                if (jSONObject.has("group_layout_id")) {
                    this.f90941Z = AbstractC18069a.m96087f(jSONObject, "group_layout_id");
                }
                if (jSONObject.has("id_in_group")) {
                    this.f90943b0 = AbstractC18069a.m96085d(jSONObject, "id_in_group");
                }
                if (jSONObject.has("total_item_in_group")) {
                    this.f90944c0 = AbstractC18069a.m96085d(jSONObject, "total_item_in_group");
                }
                if (jSONObject.has("albumID")) {
                    this.f90946e0 = AbstractC18069a.m96087f(jSONObject, "albumID");
                }
                if (jSONObject.has("albumAction")) {
                    this.f90945d0 = AbstractC18069a.m96085d(jSONObject, "albumAction");
                }
                if (jSONObject.has("compress_video_path")) {
                    this.f90947f0 = m95441X(AbstractC18069a.m96089h(jSONObject, "compress_video_path"));
                }
                if (jSONObject.has("video_url_to_renew")) {
                    this.f90952k0 = AbstractC18069a.m96089h(jSONObject, "video_url_to_renew");
                }
                if (jSONObject.has("thumb_url_to_renew")) {
                    this.f90953l0 = AbstractC18069a.m96089h(jSONObject, "thumb_url_to_renew");
                }
                if (jSONObject.has("is_trimmed")) {
                    this.f90955n0 = AbstractC18069a.m96083b(jSONObject, "is_trimmed");
                }
                if (jSONObject.has("isHD")) {
                    if (AbstractC18069a.m96086e(jSONObject, "isHD", 0) == 1) {
                        z12 = true;
                    }
                    this.f90957p0 = z12;
                }
                m95451E0();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: W */
    public static boolean m95440W(boolean z11) {
        if (z11 && AbstractC26689j.m137085L()) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public static String m95441X(String str) {
        if (!TextUtils.isEmpty(str)) {
            String m118212k = AbstractC23041d2.m118212k(str);
            if (str.startsWith("zalo/")) {
                return AbstractC20130d.m104828E0() + File.separator + m118212k;
            }
            String m95442r = m95442r(str);
            String substring = m95442r.substring(0, m95442r.indexOf(m118212k));
            if (m95442r.startsWith("zalo/")) {
                return AbstractC23204s0.m119553d(substring, true) + File.separator + m118212k;
            }
            return str;
        }
        return str;
    }

    /* renamed from: r */
    private static String m95442r(String str) {
        int indexOf;
        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf("/zalo/")) != -1) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    /* renamed from: A0 */
    public void m95443A0(int i11) {
        this.f90922G = i11;
    }

    /* renamed from: B */
    public int m95444B() {
        return this.f90929N;
    }

    /* renamed from: B0 */
    public void m95445B0(int i11) {
        this.f90951j0 = i11;
    }

    /* renamed from: C */
    public int m95446C() {
        return this.f90921F;
    }

    /* renamed from: C0 */
    public void m95447C0(int i11) {
        this.f90950i0 = i11;
    }

    /* renamed from: D */
    public int m95448D() {
        return this.f90920E;
    }

    /* renamed from: D0 */
    public void m95449D0() {
        String str;
        String str2;
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gif_path", this.f90954m0);
            String str4 = "";
            if (TextUtils.isEmpty(this.f90917B)) {
                str = "";
            } else {
                str = this.f90917B;
            }
            jSONObject.put("video_thumb_local_path", str);
            if (TextUtils.isEmpty(this.f90918C)) {
                str2 = "";
            } else {
                str2 = this.f90918C;
            }
            jSONObject.put("video_thumb_from_gallery", str2);
            jSONObject.put("duration", this.f90919D);
            jSONObject.put("video_original_width", this.f90920E);
            jSONObject.put("video_original_height", this.f90921F);
            jSONObject.put("video_width", this.f90922G);
            jSONObject.put("video_height", this.f90923H);
            jSONObject.put("video_bitrate", this.f90926K);
            jSONObject.put("audio_bitrate", this.f90925J);
            if (TextUtils.isEmpty(this.f90927L)) {
                str3 = "";
            } else {
                str3 = this.f90927L;
            }
            jSONObject.put("video_codec", str3);
            jSONObject.put("video_profile", this.f90928M);
            jSONObject.put("video_level", this.f90929N);
            jSONObject.put("duration_raw", this.f90930O);
            jSONObject.put("video_rotation", this.f90931P);
            if (!TextUtils.isEmpty(this.f90924I)) {
                str4 = this.f90924I;
            }
            jSONObject.put("audio_codec", str4);
            jSONObject.put("video_frame_rate", this.f90932Q);
            jSONObject.put("video_file_size", this.f90933R);
            jSONObject.put("fileSize", this.f90934S);
            long j11 = this.f90935T;
            if (j11 > 0) {
                jSONObject.put("thumbSize", j11);
            }
            jSONObject.put("need_compress_video", this.f90936U);
            jSONObject.put("need_blend_video", this.f90937V);
            jSONObject.put("is_from_zalo_recorder", this.f90939X);
            VideoBlendingParam videoBlendingParam = this.f90940Y;
            if (videoBlendingParam != null) {
                jSONObject.put("video_blending_param", videoBlendingParam.m48166b());
            }
            jSONObject.put("is_group_layout", this.f90942a0 ? 1 : 0);
            jSONObject.put("group_layout_id", this.f90941Z);
            jSONObject.put("id_in_group", this.f90943b0);
            jSONObject.put("total_item_in_group", this.f90944c0);
            if (this.f90946e0 != -1) {
                jSONObject.put("albumAction", this.f90945d0);
                jSONObject.put("albumID", this.f90946e0);
            }
            jSONObject.put("compress_video_path", m95442r(this.f90947f0));
            jSONObject.put("video_url_to_renew", this.f90952k0);
            jSONObject.put("thumb_url_to_renew", this.f90953l0);
            jSONObject.put("is_trimmed", this.f90955n0);
            jSONObject.put("isHD", this.f90957p0 ? 1 : 0);
            this.f91017v = jSONObject.toString();
            m95451E0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E */
    public int m95450E() {
        return this.f90928M;
    }

    /* renamed from: E0 */
    void m95451E0() {
        int i11;
        int i12;
        int i13 = this.f90931P;
        if (i13 != 90 && i13 != 270) {
            i11 = this.f90922G;
            i12 = this.f90923H;
        } else {
            i11 = this.f90923H;
            i12 = this.f90922G;
        }
        int[] m154831a = C32091r6.m154831a(i11, i12);
        this.f90948g0 = m154831a[0];
        this.f90949h0 = m154831a[1];
    }

    /* renamed from: F */
    public int m95452F() {
        return this.f90931P;
    }

    /* renamed from: G */
    public long m95453G() {
        return this.f90934S;
    }

    /* renamed from: H */
    public String m95454H() {
        return this.f90918C;
    }

    /* renamed from: I */
    public String m95455I() {
        return this.f90917B;
    }

    /* renamed from: J */
    public int m95456J() {
        return this.f90922G;
    }

    /* renamed from: K */
    public int m95457K() {
        return this.f90951j0;
    }

    /* renamed from: L */
    public int m95458L() {
        return this.f90950i0;
    }

    /* renamed from: M */
    public boolean m95459M() {
        return this.f90939X;
    }

    /* renamed from: N */
    public boolean m95460N() {
        return this.f90942a0;
    }

    /* renamed from: O */
    public boolean m95461O() {
        return this.f90957p0;
    }

    /* renamed from: P */
    public boolean m95462P() {
        return this.f90938W;
    }

    /* renamed from: Q */
    public boolean m95463Q() {
        return this.f90937V;
    }

    /* renamed from: R */
    public boolean m95464R() {
        return this.f90936U;
    }

    /* renamed from: S */
    public boolean m95465S() {
        return m95440W(this.f90957p0);
    }

    /* renamed from: T */
    public boolean m95466T() {
        return this.f90955n0;
    }

    /* renamed from: U */
    public void m95467U(boolean z11) {
        this.f90942a0 = z11;
    }

    /* renamed from: Y */
    public void m95468Y(int i11) {
        this.f90945d0 = i11;
    }

    /* renamed from: Z */
    public void m95469Z(long j11) {
        this.f90946e0 = j11;
    }

    @Override // dj.InterfaceC17973j1
    /* renamed from: a */
    public String mo95470a() {
        return this.f90952k0;
    }

    /* renamed from: a0 */
    public void m95471a0(int i11) {
        this.f90925J = i11;
    }

    /* renamed from: b0 */
    public void m95472b0(String str) {
        this.f90924I = str;
    }

    /* renamed from: c0 */
    public void m95473c0(String str) {
        this.f90947f0 = str;
    }

    /* renamed from: d0 */
    public void m95474d0(long j11) {
        this.f90941Z = j11;
    }

    /* renamed from: e0 */
    public void m95475e0(int i11) {
        this.f90944c0 = i11;
    }

    /* renamed from: f0 */
    public void m95476f0(boolean z11) {
        this.f90957p0 = m95440W(z11);
    }

    /* renamed from: g */
    public long m95477g() {
        return this.f90946e0;
    }

    /* renamed from: g0 */
    public void m95478g0(boolean z11) {
        this.f90936U = z11;
    }

    /* renamed from: h */
    public int m95479h() {
        return this.f90925J;
    }

    /* renamed from: h0 */
    public void m95480h0(int i11) {
        this.f90943b0 = i11;
    }

    /* renamed from: i */
    public String m95481i() {
        if (TextUtils.isEmpty(this.f90947f0)) {
            return "";
        }
        return AbstractC23041d2.m118212k(this.f90947f0);
    }

    /* renamed from: i0 */
    public void m95482i0(String str) {
        this.f90953l0 = str;
    }

    /* renamed from: j */
    public String m95483j() {
        return this.f90947f0;
    }

    /* renamed from: j0 */
    public void m95484j0(int i11) {
        this.f90926K = i11;
    }

    /* renamed from: k */
    public String m95485k() {
        return this.f90954m0;
    }

    /* renamed from: k0 */
    public void m95486k0(VideoBlendingParam videoBlendingParam) {
        this.f90940Y = videoBlendingParam;
    }

    /* renamed from: l */
    public long m95487l() {
        return this.f90941Z;
    }

    /* renamed from: l0 */
    public void m95488l0(String str) {
        this.f90927L = str;
    }

    /* renamed from: m */
    public int m95489m() {
        return this.f90944c0;
    }

    /* renamed from: m0 */
    public void m95490m0(long j11) {
        this.f90919D = j11;
    }

    /* renamed from: n */
    public String m95491n() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", this.f90919D);
            jSONObject.put("is_group_layout", this.f90942a0 ? 1 : 0);
            jSONObject.put("group_layout_id", this.f90941Z);
            jSONObject.put("id_in_group", this.f90943b0);
            jSONObject.put("total_item_in_group", this.f90944c0);
            jSONObject.put("video_original_width", this.f90920E);
            jSONObject.put("video_original_height", this.f90921F);
            jSONObject.put("video_width", this.f90922G);
            jSONObject.put("video_height", this.f90923H);
            jSONObject.put("video_rotation", this.f90931P);
            jSONObject.put("fileSize", this.f90934S);
            long j11 = this.f90935T;
            if (j11 > 0) {
                jSONObject.put("thumbSize", j11);
            }
            if (this.f90946e0 != -1) {
                jSONObject.put("albumAction", this.f90945d0);
                jSONObject.put("albumID", this.f90946e0);
            }
            jSONObject.put("isHD", this.f90957p0 ? 1 : 0);
            return jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: n0 */
    public void m95492n0(long j11) {
        this.f90930O = j11;
    }

    /* renamed from: o */
    public int m95493o() {
        return this.f90943b0;
    }

    /* renamed from: o0 */
    public void m95494o0(long j11) {
        this.f90933R = j11;
    }

    /* renamed from: p */
    public int m95495p() {
        return this.f90949h0;
    }

    /* renamed from: p0 */
    public void m95496p0(int i11) {
        this.f90932Q = i11;
    }

    /* renamed from: q */
    public int m95497q() {
        return this.f90948g0;
    }

    /* renamed from: q0 */
    public void m95498q0(int i11) {
        this.f90923H = i11;
    }

    /* renamed from: r0 */
    public void m95499r0(int i11) {
        this.f90929N = i11;
    }

    /* renamed from: s */
    public String m95500s() {
        return this.f90953l0;
    }

    /* renamed from: s0 */
    public void m95501s0(int i11) {
        this.f90921F = i11;
    }

    /* renamed from: t */
    public int m95502t() {
        return this.f90926K;
    }

    /* renamed from: t0 */
    public void m95503t0(int i11) {
        this.f90920E = i11;
    }

    /* renamed from: u */
    public VideoBlendingParam m95504u() {
        return this.f90940Y;
    }

    /* renamed from: u0 */
    public void m95505u0(int i11) {
        this.f90928M = i11;
    }

    /* renamed from: v */
    public String m95506v() {
        return this.f90927L;
    }

    /* renamed from: v0 */
    public void m95507v0(int i11) {
        this.f90931P = i11;
    }

    /* renamed from: w */
    public long m95508w() {
        return this.f90919D;
    }

    /* renamed from: w0 */
    public void m95509w0(long j11) {
        this.f90934S = j11;
    }

    /* renamed from: x */
    public long m95510x() {
        return this.f90933R;
    }

    /* renamed from: x0 */
    public void m95511x0(String str) {
        this.f90917B = str;
    }

    /* renamed from: y */
    public int m95512y() {
        return this.f90932Q;
    }

    /* renamed from: y0 */
    public void m95513y0(long j11) {
        this.f90935T = j11;
    }

    /* renamed from: z */
    public int m95514z() {
        return this.f90923H;
    }

    /* renamed from: z0 */
    public void m95515z0(String str) {
        this.f90952k0 = str;
    }

    public C17961f1(String str, int i11, String str2, String str3, String str4, String str5, String str6, C27373c c27373c) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f90917B = "";
        this.f90918C = "";
        this.f90919D = 0L;
        boolean z11 = false;
        this.f90920E = 0;
        this.f90921F = 0;
        this.f90922G = 0;
        this.f90923H = 0;
        this.f90924I = "";
        this.f90926K = -1;
        this.f90927L = "";
        this.f90930O = 0L;
        this.f90931P = 0;
        this.f90932Q = 24;
        this.f90933R = 0L;
        this.f90934S = 0L;
        this.f90935T = 0L;
        this.f90942a0 = false;
        this.f90945d0 = -1;
        this.f90946e0 = -1L;
        this.f90947f0 = "";
        this.f90952k0 = "";
        this.f90953l0 = "";
        this.f90954m0 = "";
        this.f90955n0 = false;
        this.f90956o0 = 0L;
        this.f90957p0 = false;
        if (c27373c != null) {
            this.f90917B = TextUtils.isEmpty(c27373c.m140268v()) ? "" : c27373c.m140268v();
            this.f90918C = TextUtils.isEmpty(c27373c.m140267u()) ? "" : c27373c.m140267u();
            this.f90919D = c27373c.m140255i();
            this.f90920E = c27373c.m140218C();
            this.f90921F = c27373c.m140217B();
            this.f90922G = c27373c.m140221F();
            this.f90923H = c27373c.m140272z();
            this.f90926K = c27373c.m140269w();
            this.f90925J = c27373c.m140247d();
            this.f90927L = TextUtils.isEmpty(c27373c.m140270x()) ? "" : c27373c.m140270x();
            this.f90928M = c27373c.m140219D();
            this.f90929N = c27373c.m140216A();
            this.f90930O = c27373c.m140254h();
            this.f90931P = c27373c.m140265s();
            this.f90924I = TextUtils.isEmpty(c27373c.m140249e()) ? "" : c27373c.m140249e();
            this.f90932Q = c27373c.m140271y();
            this.f90933R = c27373c.m140256j();
            this.f90934S = c27373c.m140257k();
            this.f90936U = c27373c.f128942O;
            this.f90937V = c27373c.f128943P;
            this.f90938W = c27373c.f128944Q;
            this.f90939X = c27373c.f128946S;
            this.f90940Y = c27373c.f128947T;
            this.f90954m0 = c27373c.f128949V ? c27373c.m140220E() : "";
            VideoBlendingParam videoBlendingParam = c27373c.f128947T;
            if (videoBlendingParam != null && videoBlendingParam.f48265Q > 0) {
                z11 = true;
            }
            this.f90955n0 = z11;
            this.f90957p0 = AbstractC23078g6.Companion.m118394i(c27373c);
        }
        m95451E0();
    }

    public C17961f1(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f90917B = "";
        this.f90918C = "";
        this.f90919D = 0L;
        this.f90920E = 0;
        this.f90921F = 0;
        this.f90922G = 0;
        this.f90923H = 0;
        this.f90924I = "";
        this.f90926K = -1;
        this.f90927L = "";
        this.f90930O = 0L;
        this.f90931P = 0;
        this.f90932Q = 24;
        this.f90933R = 0L;
        this.f90934S = 0L;
        this.f90935T = 0L;
        this.f90942a0 = false;
        this.f90945d0 = -1;
        this.f90946e0 = -1L;
        this.f90947f0 = "";
        this.f90952k0 = "";
        this.f90953l0 = "";
        this.f90954m0 = "";
        this.f90955n0 = false;
        this.f90956o0 = 0L;
        this.f90957p0 = false;
        m95439V();
    }

    public C17961f1(JSONObject jSONObject) {
        super(jSONObject);
        this.f90917B = "";
        this.f90918C = "";
        this.f90919D = 0L;
        this.f90920E = 0;
        this.f90921F = 0;
        this.f90922G = 0;
        this.f90923H = 0;
        this.f90924I = "";
        this.f90926K = -1;
        this.f90927L = "";
        this.f90930O = 0L;
        this.f90931P = 0;
        this.f90932Q = 24;
        this.f90933R = 0L;
        this.f90934S = 0L;
        this.f90935T = 0L;
        this.f90942a0 = false;
        this.f90945d0 = -1;
        this.f90946e0 = -1L;
        this.f90947f0 = "";
        this.f90952k0 = "";
        this.f90953l0 = "";
        this.f90954m0 = "";
        this.f90955n0 = false;
        this.f90956o0 = 0L;
        this.f90957p0 = false;
        m95439V();
    }
}
