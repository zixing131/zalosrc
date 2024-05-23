package od0;

import ag0.C0816f;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.TextUtils;
import be.C2774c;
import bn0.AbstractC2932a;
import bn0.AbstractC2933b;
import bo.C3063z0;
import com.androidquery.util.BitmapEncoder;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.zmedia.zjxl.ZJXLDecoder;
import com.zing.zalo.zmedia.zjxl.ZJXLEncoder;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20098e;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23009a3;
import me0.AbstractC23041d2;
import me0.AbstractC23067f6;
import me0.AbstractC23078g6;
import me0.AbstractC23161o1;
import me0.AbstractC23227u1;
import me0.AbstractC23238v2;
import me0.AbstractC23254w8;
import me0.AbstractC23258x2;
import me0.AbstractC23277z1;
import nh0.C23793c;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p239ih.C20556f;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p386ob.EnumC24191b;
import p458qr.C25482o;
import p461qu.AbstractC25495a;
import p609wh.C29037t0;
import p620wt.AbstractC29238m;
import p645xh.C29630g;
import p645xh.C29632i;
import p716zh.AbstractC31990k7;
import p716zh.C32135u8;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import rd0.AbstractC25751q;
import rd0.AbstractC25752r;
import td0.C26638a;
import td0.C26639b;
import te0.C26643a;
import te0.C26645c;
import th.AbstractC26689j;

/* renamed from: od0.h */
/* loaded from: classes4.dex */
public final class C24230h {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private boolean f116994A;

    /* renamed from: B */
    private long f116995B;

    /* renamed from: C */
    private int f116996C;

    /* renamed from: D */
    private ArrayList f116997D;

    /* renamed from: E */
    private C3063z0 f116998E;

    /* renamed from: F */
    private PrivacyInfo f116999F;

    /* renamed from: G */
    private int f117000G;

    /* renamed from: H */
    private int f117001H;

    /* renamed from: I */
    private int f117002I;

    /* renamed from: J */
    private String f117003J;

    /* renamed from: K */
    private int f117004K;

    /* renamed from: L */
    private boolean f117005L;

    /* renamed from: M */
    private StoryMusicAttachment f117006M;

    /* renamed from: N */
    private int f117007N;

    /* renamed from: O */
    private boolean f117008O;

    /* renamed from: P */
    private TrackingSource f117009P;

    /* renamed from: Q */
    private long f117010Q;

    /* renamed from: R */
    private SongInfo f117011R;

    /* renamed from: S */
    private long f117012S;

    /* renamed from: T */
    private long f117013T;

    /* renamed from: U */
    private long f117014U;

    /* renamed from: V */
    private long f117015V;

    /* renamed from: W */
    private long f117016W;

    /* renamed from: X */
    private long f117017X;

    /* renamed from: Y */
    private long f117018Y;

    /* renamed from: Z */
    private long f117019Z;

    /* renamed from: a */
    private final int f117020a;

    /* renamed from: a0 */
    private EnumC24191b f117021a0;

    /* renamed from: b */
    private final EnumC24229g f117022b;

    /* renamed from: b0 */
    private boolean f117023b0;

    /* renamed from: c */
    private final String f117024c;

    /* renamed from: c0 */
    private int f117025c0;

    /* renamed from: d */
    private final String f117026d;

    /* renamed from: d0 */
    private final boolean f117027d0;

    /* renamed from: e */
    private final String f117028e;

    /* renamed from: e0 */
    private String f117029e0;

    /* renamed from: f */
    private final String f117030f;

    /* renamed from: f0 */
    private boolean f117031f0;

    /* renamed from: g */
    private long f117032g;

    /* renamed from: g0 */
    private boolean f117033g0;

    /* renamed from: h */
    private final boolean f117034h;

    /* renamed from: h0 */
    private int f117035h0;

    /* renamed from: i */
    private final InterfaceC24231i f117036i;

    /* renamed from: i0 */
    private boolean f117037i0;

    /* renamed from: j */
    private final C20556f f117038j;

    /* renamed from: j0 */
    private Map f117039j0;

    /* renamed from: k */
    private final InterfaceC24854k f117040k;

    /* renamed from: k0 */
    private boolean f117041k0;

    /* renamed from: l */
    private final InterfaceC24854k f117042l;

    /* renamed from: m */
    private final Set f117043m;

    /* renamed from: n */
    private final int f117044n;

    /* renamed from: o */
    private String f117045o;

    /* renamed from: p */
    private final int f117046p;

    /* renamed from: q */
    private final double f117047q;

    /* renamed from: r */
    private final double f117048r;

    /* renamed from: s */
    private final boolean f117049s;

    /* renamed from: t */
    private EnumC24233k f117050t;

    /* renamed from: u */
    private final C23307g f117051u;

    /* renamed from: v */
    private C23307g f117052v;

    /* renamed from: w */
    private C2774c f117053w;

    /* renamed from: x */
    private C29037t0 f117054x;

    /* renamed from: y */
    private String f117055y;

    /* renamed from: z */
    private String f117056z;

    /* renamed from: od0.h$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: od0.h$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Long mo12V4() {
            return Long.valueOf(C24230h.this.f117038j.m106845r());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: od0.h$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C20556f mo12V4() {
            return new C20556f(C24230h.this.m126532x());
        }
    }

    /* renamed from: od0.h$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC20098e {

        /* renamed from: a */
        private long f117059a = -1;

        /* renamed from: c */
        final /* synthetic */ long f117061c;

        /* renamed from: d */
        final /* synthetic */ C2774c f117062d;

        d(long j11, C2774c c2774c) {
            this.f117061c = j11;
            this.f117062d = c2774c;
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: a */
        public void mo2128a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            C26639b.m136739C("[uploadNative] onErrorData");
            C24230h.this.m126534y0(C23793c.Companion.m124321a().mo124319c() - this.f117061c);
            C24230h.this.m126484C0(this.f117062d.f10995g0);
            C24230h.this.m126533x0(this.f117062d.f10991e0);
            C24230h.this.m126534y0(this.f117062d.f10993f0);
            C24230h.this.m126463Z(c20096c);
            C24230h.this.m126474o();
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: b */
        public void mo2129b(Object obj) {
            EnumC24233k enumC24233k;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                C24230h c24230h = C24230h.this;
                if (this.f117062d.m13360p()) {
                    enumC24233k = EnumC24233k.f117063q;
                } else {
                    enumC24233k = EnumC24233k.f117064r;
                }
                c24230h.f117050t = enumC24233k;
                C24230h.this.m126484C0(this.f117062d.f10995g0);
                C24230h.this.m126533x0(this.f117062d.f10991e0);
                C24230h.this.m126534y0(this.f117062d.f10993f0);
                C24230h.this.m126506h0(((C23793c.Companion.m124321a().mo124319c() - this.f117061c) - C24230h.this.m126485D()) - C24230h.this.m126487E());
                C24230h c24230h2 = C24230h.this;
                EnumC24191b enumC24191b = this.f117062d.f10997h0;
                AbstractC19074t.m100207e(enumC24191b, "mRenewState");
                c24230h2.m126522r0(enumC24191b);
                AbstractC20110a.f98889a.mo104558r("[uploadNative] upload response: " + obj, new Object[0]);
                JSONObject jSONObject = new JSONObject((String) obj);
                int i11 = jSONObject.getInt("error_code");
                if (i11 == 0) {
                    C24230h.this.m126454K(jSONObject);
                    C24230h.this.m126474o();
                    C26639b.m136739C("[uploadNative] onDataProcessed: success and stateRenew: " + C24230h.this.m126479A());
                    return;
                }
                C26639b.m136739C("[uploadNative] onDataProcessed: error");
                mo2128a(new C20096c(i11, AbstractC23161o1.m119318c(i11, "")));
            } catch (Exception e11) {
                C24230h.this.m126461X();
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: c */
        public void mo2130c(long j11, String str) {
            AbstractC19074t.m100208f(str, "des");
            if (this.f117059a == j11) {
                return;
            }
            this.f117059a = j11;
            InterfaceC24231i m126523s = C24230h.this.m126523s();
            if (m126523s != null) {
                m126523s.mo126450c(C24230h.this, j11);
            }
        }
    }

    public C24230h(int i11, EnumC24229g enumC24229g, String str, String str2, String str3, String str4, long j11, boolean z11, InterfaceC24231i interfaceC24231i) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        C23307g c23307g;
        AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
        AbstractC19074t.m100208f(str, "originPath");
        AbstractC19074t.m100208f(str4, "outputPath");
        this.f117020a = i11;
        this.f117022b = enumC24229g;
        this.f117024c = str;
        this.f117026d = str2;
        this.f117028e = str3;
        this.f117030f = str4;
        this.f117032g = j11;
        this.f117034h = z11;
        this.f117036i = interfaceC24231i;
        this.f117038j = new C20556f(str);
        m129210a = AbstractC24856m.m129210a(new b());
        this.f117040k = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new c());
        this.f117042l = m129210a2;
        this.f117043m = new LinkedHashSet();
        this.f117044n = C26639b.m136751j(enumC24229g);
        this.f117045o = "";
        this.f117052v = new C23307g(0, 0);
        this.f117055y = "0";
        this.f117056z = "";
        this.f116996C = -1;
        this.f117021a0 = EnumC24191b.f116757q;
        this.f117027d0 = C26639b.m136760s(enumC24229g) || C26639b.m136766y(enumC24229g) || C26639b.m136762u(enumC24229g);
        this.f117029e0 = "";
        this.f117031f0 = true;
        this.f117035h0 = -1;
        if (C26639b.m136765x(enumC24229g)) {
            if (str.length() > 0) {
                c23307g = AbstractC23067f6.m118367a(str);
            } else {
                c23307g = new C23307g(this.f117001H, this.f117002I);
            }
            AbstractC19074t.m100205c(c23307g);
        } else {
            c23307g = new C23307g(this.f117001H, this.f117002I);
        }
        this.f117051u = c23307g;
    }

    /* renamed from: J */
    private final void m126453J(Exception exc) {
        if (AbstractC23227u1.m119701a(exc)) {
            m126499a0();
        } else {
            m126462Y();
        }
    }

    /* renamed from: K */
    public final void m126454K(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (!jSONObject2.isNull("data")) {
            jSONObject = jSONObject2;
        }
        AbstractC19074t.m100205c(jSONObject);
        m126471g(jSONObject);
        AbstractC19074t.m100205c(jSONObject);
        m126466b0(jSONObject);
    }

    /* renamed from: N */
    private final boolean m126455N() {
        long m136746e;
        long m106845r = m126476u().m106845r();
        if (this.f117041k0) {
            m136746e = C26639b.m136749h(this.f117022b);
        } else {
            m136746e = C26639b.m136746e(this.f117022b) + m126477y(this.f117022b);
        }
        if (m106845r > m136746e) {
            m126460W();
            return true;
        }
        return false;
    }

    /* renamed from: O */
    private final boolean m126456O() {
        if ((AbstractC23309i.m120937Ff() && m126457P()) || ((AbstractC23309i.m120974Gf() && C26639b.m136761t(this.f117022b)) || (AbstractC23309i.m120900Ef() && C26639b.m136763v(this.f117022b)))) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private final boolean m126457P() {
        EnumC24229g enumC24229g = this.f117022b;
        if (enumC24229g != EnumC24229g.f116983q && enumC24229g != EnumC24229g.f116984r && enumC24229g != EnumC24229g.f116978Q && enumC24229g != EnumC24229g.f116979R && enumC24229g != EnumC24229g.f116980S) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    private final boolean m126458Q(EnumC24229g enumC24229g) {
        if (enumC24229g == EnumC24229g.f116978Q) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private final void m126459S(long j11, int i11) {
        if (i11 != 0) {
            int i12 = this.f117035h0;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            C25482o.f122075a.m132010r(j11, Integer.valueOf(i11));
                            return;
                        }
                        return;
                    }
                    C25482o.f122075a.m132002j(j11, Integer.valueOf(i11));
                    return;
                }
                C25482o.f122075a.m132005m(j11, Integer.valueOf(i11));
                return;
            }
            C25482o.f122075a.m132006n(j11, Integer.valueOf(i11));
        }
    }

    /* renamed from: W */
    private final void m126460W() {
        m126463Z(C26638a.f126094a.m136736e());
    }

    /* renamed from: X */
    public final void m126461X() {
        m126463Z(C26638a.f126094a.m136732a());
    }

    /* renamed from: Y */
    private final void m126462Y() {
        m126463Z(C26638a.f126094a.m136734c());
    }

    /* renamed from: Z */
    public final void m126463Z(C20096c c20096c) {
        InterfaceC24231i interfaceC24231i = this.f117036i;
        if (interfaceC24231i != null) {
            interfaceC24231i.mo126449b(this, c20096c);
        }
    }

    /* renamed from: b0 */
    private final void m126466b0(JSONObject jSONObject) {
        InterfaceC24231i interfaceC24231i = this.f117036i;
        if (interfaceC24231i != null) {
            interfaceC24231i.mo126448a(this, jSONObject);
        }
    }

    /* renamed from: g */
    private final void m126471g(JSONObject jSONObject) {
        if (C26639b.m136765x(this.f117022b)) {
            C23307g c23307g = this.f117052v;
            if (c23307g.f113474a == 0 && c23307g.f113475b == 0) {
                C23307g m118367a = AbstractC23067f6.m118367a(this.f117030f);
                AbstractC19074t.m100207e(m118367a, "getPhotoInfo(...)");
                this.f117052v = m118367a;
            }
            jSONObject.put("photo_info", this.f117052v.m120735a());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x005a, code lost:            if (r13.outHeight > 0) goto L223;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03fd A[Catch: all -> 0x0296, TryCatch #13 {all -> 0x0296, blocks: (B:53:0x0259, B:56:0x03eb, B:58:0x03fd, B:60:0x0408, B:63:0x0413, B:70:0x042e, B:82:0x02f5, B:87:0x0334, B:88:0x036d, B:136:0x0377), top: B:31:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x042e A[Catch: all -> 0x0296, TRY_LEAVE, TryCatch #13 {all -> 0x0296, blocks: (B:53:0x0259, B:56:0x03eb, B:58:0x03fd, B:60:0x0408, B:63:0x0413, B:70:0x042e, B:82:0x02f5, B:87:0x0334, B:88:0x036d, B:136:0x0377), top: B:31:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ce A[Catch: all -> 0x02d8, TryCatch #14 {all -> 0x02d8, blocks: (B:75:0x02c8, B:77:0x02ce, B:81:0x02dc), top: B:74:0x02c8 }] */
    /* JADX WARN: Type inference failed for: r32v0, types: [android.graphics.Bitmap$CompressFormat] */
    /* JADX WARN: Type inference failed for: r34v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m126472m(C20556f c20556f, String str, int i11, int i12, Bitmap.CompressFormat compressFormat, int i13, boolean z11, boolean z12) {
        byte[] m13889c;
        BitmapFactory.Options options;
        String str2;
        BitmapFactory.Options options2;
        InputStream m118389d;
        InputStream inputStream;
        Throwable th2;
        InputStream inputStream2;
        int i14;
        InputStream inputStream3;
        String str3;
        int i15;
        String str4;
        String str5;
        int i16;
        OutputStream m106840m;
        long j11;
        AbstractC20110a.a aVar;
        String m106842o;
        String m106842o2;
        boolean z13;
        int max;
        InputStream m106838k = c20556f.m106838k();
        if (m106838k != null) {
            try {
                m13889c = AbstractC2932a.m13889c(m106838k);
                AbstractC2933b.m13890a(m106838k, null);
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC2933b.m13890a(m106838k, th3);
                    throw th4;
                }
            }
        } else {
            m13889c = null;
        }
        if (AbstractC23258x2.m119952k(AbstractC23258x2.m119944c(c20556f.m106838k()))) {
            m13889c = AbstractC23078g6.Companion.m118388c(c20556f.m106842o());
        }
        AbstractC23078g6.a aVar2 = AbstractC23078g6.Companion;
        InputStream m118389d2 = aVar2.m118389d(m13889c);
        if (m118389d2 != null) {
            try {
                options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(m118389d2, null, options);
                if (options.outWidth > 0) {
                }
                options = null;
                AbstractC2933b.m13890a(m118389d2, null);
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    AbstractC2933b.m13890a(m118389d2, th5);
                    throw th6;
                }
            }
        } else {
            options = null;
        }
        if (options == null) {
            str2 = "UploadItem encode JXL startTime=";
            options2 = null;
        } else {
            AbstractC20110a.a aVar3 = AbstractC20110a.f98889a;
            str2 = "UploadItem encode JXL startTime=";
            aVar3.mo104548a("UploadItem cloneOrCompressChatPhoto->compressPhotoChatInternal inputBitmapOptions: inDensity=" + options.inDensity + " inTargetDensity=" + options.inTargetDensity + " inSampleSize=" + options.inSampleSize + " outWidth=" + options.outWidth + " outHeight=" + options.outHeight, new Object[0]);
            options2 = new BitmapFactory.Options();
            if (z11 != 0) {
                max = AbstractC23009a3.m117970u(options.outWidth, options.outHeight, i12);
                z13 = true;
            } else {
                z13 = true;
                max = Math.max(1, Integer.highestOneBit(AbstractC23009a3.m117958i(options.outWidth, options.outHeight, i12, i12)));
            }
            options2.inSampleSize = max;
            if (AbstractC23009a3.f111957a) {
                options2.inMutable = z13;
                options2.inScaled = z13;
                options2.inDensity = Math.max(options.outHeight, options.outWidth);
                options2.inTargetDensity = (int) Math.ceil((m126478z(i12, options.outWidth, options.outHeight, z11) - 0.5d) * options2.inSampleSize);
            }
            aVar3.mo104548a("UploadItem cloneOrCompressChatPhoto->compressPhotoChatInternal outputBitmapOptions: inDensity=" + options2.inDensity + " inTargetDensity=" + options2.inTargetDensity + " inSampleSize=" + options2.inSampleSize + " outWidth=" + options2.outWidth + " outHeight=" + options2.outHeight, new Object[0]);
        }
        if (options2 != null && (m118389d = aVar2.m118389d(m13889c)) != null) {
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(m118389d, null, options2);
                if (decodeStream != null) {
                    if (i11 != 0) {
                        try {
                            Matrix matrix = new Matrix();
                            matrix.postRotate(i11);
                            decodeStream = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
                        } catch (Throwable th7) {
                            th2 = th7;
                            inputStream = m118389d;
                            try {
                                throw th2;
                            } catch (Throwable th8) {
                                AbstractC2933b.m13890a(inputStream, th2);
                                throw th8;
                            }
                        }
                    }
                    if (decodeStream != null) {
                        try {
                            String m126475p = m126475p(str);
                            C20556f c20556f2 = new C20556f(m126475p);
                            try {
                                if (z12) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    BitmapEncoder bitmapEncoder = new BitmapEncoder();
                                    bitmapEncoder.m18735b(decodeStream);
                                    bitmapEncoder.m18737d(i13);
                                    bitmapEncoder.m18736c(compressFormat);
                                    double m92548b = ZJXLEncoder.m92548b(bitmapEncoder, "", decodeStream.getWidth(), decodeStream.getHeight(), false);
                                    int m92549c = ZJXLEncoder.m92549c(m92548b);
                                    if (m92549c == 0) {
                                        int m92550d = ZJXLEncoder.m92550d(m92548b);
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        try {
                                            if (c20556f2.m106830b()) {
                                                try {
                                                    c20556f2.m106829a();
                                                } catch (IOException e11) {
                                                    e = e11;
                                                    inputStream3 = m118389d;
                                                    str4 = m126475p;
                                                    str5 = str2;
                                                    try {
                                                        if (!AbstractC23227u1.m119701a(e)) {
                                                        }
                                                        i16 = 601;
                                                        AbstractC20110a.a aVar4 = AbstractC20110a.f98889a;
                                                        aVar4.mo104551d("UploadItem cloneOrCompressChatPhoto->compressPhotoChatInternal: \n" + e, new Object[0]);
                                                        BitmapEncoder.f15688e.m18743f(currentTimeMillis, currentTimeMillis2, m92550d, m92549c, 16912);
                                                        aVar4.mo104548a(str5 + currentTimeMillis + " endTime=" + currentTimeMillis2 + " encodeTime=" + m92550d + " errorCode=" + m92549c, new Object[0]);
                                                        i15 = i16;
                                                        str3 = str4;
                                                        if (!new File(str3).renameTo(new File(str))) {
                                                        }
                                                        i14 = i15;
                                                        inputStream2 = inputStream3;
                                                        AbstractC2933b.m13890a(inputStream2, null);
                                                        return i14;
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        BitmapEncoder.f15688e.m18743f(currentTimeMillis, currentTimeMillis2, m92550d, m92549c, 16912);
                                                        AbstractC20110a.f98889a.mo104548a(str5 + currentTimeMillis + " endTime=" + currentTimeMillis2 + " encodeTime=" + m92550d + " errorCode=" + m92549c, new Object[0]);
                                                        throw th;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    str5 = str2;
                                                    BitmapEncoder.f15688e.m18743f(currentTimeMillis, currentTimeMillis2, m92550d, m92549c, 16912);
                                                    AbstractC20110a.f98889a.mo104548a(str5 + currentTimeMillis + " endTime=" + currentTimeMillis2 + " encodeTime=" + m92550d + " errorCode=" + m92549c, new Object[0]);
                                                    throw th;
                                                }
                                            }
                                            m106840m = c20556f2.m106840m();
                                        } catch (IOException e12) {
                                            e = e12;
                                            inputStream3 = m118389d;
                                            str4 = m126475p;
                                        } catch (Throwable th11) {
                                            th = th11;
                                        }
                                        try {
                                            if (m106840m != null) {
                                                try {
                                                    j11 = currentTimeMillis2;
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                }
                                                try {
                                                    AbstractC29238m.m145999c(new ByteArrayInputStream(bitmapEncoder.m18734a()), m106840m);
                                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                                    AbstractC2933b.m13890a(m106840m, null);
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    Throwable th14 = th;
                                                    try {
                                                        throw th14;
                                                    } catch (Throwable th15) {
                                                        AbstractC2933b.m13890a(m106840m, th14);
                                                        throw th15;
                                                    }
                                                }
                                            } else {
                                                j11 = currentTimeMillis2;
                                            }
                                        } catch (IOException e13) {
                                            e = e13;
                                            currentTimeMillis2 = compressFormat;
                                            inputStream3 = m118389d;
                                            str4 = m126475p;
                                            str5 = str2;
                                            if (!AbstractC23227u1.m119701a(e)) {
                                            }
                                            i16 = 601;
                                            AbstractC20110a.a aVar42 = AbstractC20110a.f98889a;
                                            aVar42.mo104551d("UploadItem cloneOrCompressChatPhoto->compressPhotoChatInternal: \n" + e, new Object[0]);
                                            BitmapEncoder.f15688e.m18743f(currentTimeMillis, currentTimeMillis2, m92550d, m92549c, 16912);
                                            aVar42.mo104548a(str5 + currentTimeMillis + " endTime=" + currentTimeMillis2 + " encodeTime=" + m92550d + " errorCode=" + m92549c, new Object[0]);
                                            i15 = i16;
                                            str3 = str4;
                                            if (!new File(str3).renameTo(new File(str))) {
                                            }
                                            i14 = i15;
                                            inputStream2 = inputStream3;
                                            AbstractC2933b.m13890a(inputStream2, null);
                                            return i14;
                                        } catch (Throwable th16) {
                                            th = th16;
                                            currentTimeMillis2 = compressFormat;
                                            str5 = str2;
                                            BitmapEncoder.f15688e.m18743f(currentTimeMillis, currentTimeMillis2, m92550d, m92549c, 16912);
                                            AbstractC20110a.f98889a.mo104548a(str5 + currentTimeMillis + " endTime=" + currentTimeMillis2 + " encodeTime=" + m92550d + " errorCode=" + m92549c, new Object[0]);
                                            throw th;
                                        }
                                        try {
                                            currentTimeMillis2 = System.currentTimeMillis();
                                            aVar = AbstractC20110a.f98889a;
                                            m106842o = c20556f.m106842o();
                                            m106842o2 = c20556f2.m106842o();
                                            inputStream3 = m118389d;
                                        } catch (IOException e14) {
                                            e = e14;
                                            inputStream3 = m118389d;
                                            str4 = m126475p;
                                            str5 = str2;
                                            currentTimeMillis2 = j11;
                                            if (!AbstractC23227u1.m119701a(e)) {
                                            }
                                            i16 = 601;
                                            AbstractC20110a.a aVar422 = AbstractC20110a.f98889a;
                                            aVar422.mo104551d("UploadItem cloneOrCompressChatPhoto->compressPhotoChatInternal: \n" + e, new Object[0]);
                                            BitmapEncoder.f15688e.m18743f(currentTimeMillis, currentTimeMillis2, m92550d, m92549c, 16912);
                                            aVar422.mo104548a(str5 + currentTimeMillis + " endTime=" + currentTimeMillis2 + " encodeTime=" + m92550d + " errorCode=" + m92549c, new Object[0]);
                                            i15 = i16;
                                            str3 = str4;
                                            if (!new File(str3).renameTo(new File(str))) {
                                            }
                                            i14 = i15;
                                            inputStream2 = inputStream3;
                                            AbstractC2933b.m13890a(inputStream2, null);
                                            return i14;
                                        } catch (Throwable th17) {
                                            th = th17;
                                            str5 = str2;
                                            currentTimeMillis2 = j11;
                                            BitmapEncoder.f15688e.m18743f(currentTimeMillis, currentTimeMillis2, m92550d, m92549c, 16912);
                                            AbstractC20110a.f98889a.mo104548a(str5 + currentTimeMillis + " endTime=" + currentTimeMillis2 + " encodeTime=" + m92550d + " errorCode=" + m92549c, new Object[0]);
                                            throw th;
                                        }
                                        try {
                                            try {
                                                C23307g c23307g = this.f117051u;
                                                int i17 = c23307g.f113474a;
                                                int i18 = c23307g.f113475b;
                                                StringBuilder sb2 = new StringBuilder();
                                                str4 = m126475p;
                                                try {
                                                    sb2.append("UploadItem cloneOrCompressChatPhoto->compressPhotoChatInternal: inputPath = ");
                                                    sb2.append(m106842o);
                                                    sb2.append(", outputPathTemp = ");
                                                    sb2.append(m106842o2);
                                                    sb2.append(", w = ");
                                                    sb2.append(i17);
                                                    sb2.append(", h = ");
                                                    sb2.append(i18);
                                                    sb2.append(", encodeImageFile in : ");
                                                    sb2.append(m92550d);
                                                    sb2.append(" ms");
                                                    aVar.mo104548a(sb2.toString(), new Object[0]);
                                                    BitmapEncoder.f15688e.m18743f(currentTimeMillis, currentTimeMillis2, m92550d, m92549c, 16912);
                                                    aVar.mo104548a(str2 + currentTimeMillis + " endTime=" + currentTimeMillis2 + " encodeTime=" + m92550d + " errorCode=" + m92549c, new Object[0]);
                                                    str3 = str4;
                                                } catch (IOException e15) {
                                                    e = e15;
                                                    str5 = str2;
                                                    if (!AbstractC23227u1.m119701a(e)) {
                                                        i16 = 502;
                                                        AbstractC20110a.a aVar4222 = AbstractC20110a.f98889a;
                                                        aVar4222.mo104551d("UploadItem cloneOrCompressChatPhoto->compressPhotoChatInternal: \n" + e, new Object[0]);
                                                        BitmapEncoder.f15688e.m18743f(currentTimeMillis, currentTimeMillis2, m92550d, m92549c, 16912);
                                                        aVar4222.mo104548a(str5 + currentTimeMillis + " endTime=" + currentTimeMillis2 + " encodeTime=" + m92550d + " errorCode=" + m92549c, new Object[0]);
                                                        i15 = i16;
                                                        str3 = str4;
                                                        if (!new File(str3).renameTo(new File(str))) {
                                                        }
                                                        i14 = i15;
                                                        inputStream2 = inputStream3;
                                                        AbstractC2933b.m13890a(inputStream2, null);
                                                        return i14;
                                                    }
                                                    i16 = 601;
                                                    AbstractC20110a.a aVar42222 = AbstractC20110a.f98889a;
                                                    aVar42222.mo104551d("UploadItem cloneOrCompressChatPhoto->compressPhotoChatInternal: \n" + e, new Object[0]);
                                                    BitmapEncoder.f15688e.m18743f(currentTimeMillis, currentTimeMillis2, m92550d, m92549c, 16912);
                                                    aVar42222.mo104548a(str5 + currentTimeMillis + " endTime=" + currentTimeMillis2 + " encodeTime=" + m92550d + " errorCode=" + m92549c, new Object[0]);
                                                    i15 = i16;
                                                    str3 = str4;
                                                    if (!new File(str3).renameTo(new File(str))) {
                                                    }
                                                    i14 = i15;
                                                    inputStream2 = inputStream3;
                                                    AbstractC2933b.m13890a(inputStream2, null);
                                                    return i14;
                                                }
                                            } catch (Throwable th18) {
                                                th = th18;
                                                str5 = str2;
                                                BitmapEncoder.f15688e.m18743f(currentTimeMillis, currentTimeMillis2, m92550d, m92549c, 16912);
                                                AbstractC20110a.f98889a.mo104548a(str5 + currentTimeMillis + " endTime=" + currentTimeMillis2 + " encodeTime=" + m92550d + " errorCode=" + m92549c, new Object[0]);
                                                throw th;
                                            }
                                        } catch (IOException e16) {
                                            e = e16;
                                            str4 = m126475p;
                                            str5 = str2;
                                            if (!AbstractC23227u1.m119701a(e) && AbstractC23238v2.m119726k()) {
                                                i16 = 502;
                                                AbstractC20110a.a aVar422222 = AbstractC20110a.f98889a;
                                                aVar422222.mo104551d("UploadItem cloneOrCompressChatPhoto->compressPhotoChatInternal: \n" + e, new Object[0]);
                                                BitmapEncoder.f15688e.m18743f(currentTimeMillis, currentTimeMillis2, m92550d, m92549c, 16912);
                                                aVar422222.mo104548a(str5 + currentTimeMillis + " endTime=" + currentTimeMillis2 + " encodeTime=" + m92550d + " errorCode=" + m92549c, new Object[0]);
                                                i15 = i16;
                                                str3 = str4;
                                                if (!new File(str3).renameTo(new File(str))) {
                                                }
                                                i14 = i15;
                                                inputStream2 = inputStream3;
                                                AbstractC2933b.m13890a(inputStream2, null);
                                                return i14;
                                            }
                                            i16 = 601;
                                            AbstractC20110a.a aVar4222222 = AbstractC20110a.f98889a;
                                            aVar4222222.mo104551d("UploadItem cloneOrCompressChatPhoto->compressPhotoChatInternal: \n" + e, new Object[0]);
                                            BitmapEncoder.f15688e.m18743f(currentTimeMillis, currentTimeMillis2, m92550d, m92549c, 16912);
                                            aVar4222222.mo104548a(str5 + currentTimeMillis + " endTime=" + currentTimeMillis2 + " encodeTime=" + m92550d + " errorCode=" + m92549c, new Object[0]);
                                            i15 = i16;
                                            str3 = str4;
                                            if (!new File(str3).renameTo(new File(str))) {
                                            }
                                            i14 = i15;
                                            inputStream2 = inputStream3;
                                            AbstractC2933b.m13890a(inputStream2, null);
                                            return i14;
                                        }
                                    } else {
                                        inputStream3 = m118389d;
                                        str3 = m126475p;
                                    }
                                } else {
                                    inputStream3 = m118389d;
                                    C32135u8 c32135u8 = new C32135u8(0L, 0L, 0L, 0, 15, null);
                                    str3 = m126475p;
                                    AbstractC31990k7.m154230k(str3, decodeStream, compressFormat, i13, c32135u8);
                                    BitmapEncoder.f15688e.m18743f(c32135u8.m155109d(), c32135u8.m155106a(), c32135u8.m155108c(), c32135u8.m155107b(), 16913);
                                    AbstractC20110a.f98889a.mo104548a("UploadItem encode JPEG startTime=" + c32135u8.m155109d() + " endTime=" + c32135u8.m155106a() + " encodeTime=" + c32135u8.m155108c() + " errorCode=" + c32135u8.m155107b(), new Object[0]);
                                }
                                i15 = 502;
                                if (!new File(str3).renameTo(new File(str))) {
                                    C20556f c20556f3 = new C20556f(str);
                                    if (c20556f3.m106830b() && c20556f3.m106845r() > 0) {
                                        i15 = 0;
                                    }
                                    AbstractC20110a.f98889a.mo104548a("UploadItem cloneOrCompressChatPhoto->rename file -> success outputPath=" + str, new Object[0]);
                                } else {
                                    AbstractC20110a.f98889a.mo104548a("UploadItem cloneOrCompressChatPhoto->rename file -> failed", new Object[0]);
                                }
                                i14 = i15;
                                inputStream2 = inputStream3;
                                AbstractC2933b.m13890a(inputStream2, null);
                                return i14;
                            } catch (Throwable th19) {
                                th = th19;
                                inputStream = z11;
                                th2 = th;
                                throw th2;
                            }
                        } catch (Throwable th20) {
                            th = th20;
                            z11 = m118389d;
                        }
                    }
                }
                inputStream2 = m118389d;
                i14 = 502;
                AbstractC2933b.m13890a(inputStream2, null);
                return i14;
            } catch (Throwable th21) {
                th = th21;
                inputStream = m118389d;
            }
        } else {
            return 502;
        }
    }

    /* renamed from: n */
    private final int m126473n(C20556f c20556f, C20556f c20556f2) {
        try {
            if (c20556f2.m106830b() && c20556f2.m106845r() == m126525t()) {
                return 0;
            }
            C26639b.m136739C("[cloneOrCompressPhotoIfNeeded] copyFileToCache");
            AbstractC23238v2.m119716a(c20556f, c20556f2);
            if (c20556f2.m106845r() == 0) {
                if (AbstractC23238v2.m119726k()) {
                    return 502;
                }
                return 601;
            }
            return 0;
        } catch (IOException unused) {
            if (AbstractC23238v2.m119726k()) {
                return 502;
            }
            return 601;
        }
    }

    /* renamed from: o */
    public final void m126474o() {
        if (!TextUtils.isEmpty(this.f117045o) && !AbstractC19074t.m100204b(this.f117045o, this.f117030f)) {
            AbstractC23041d2.m118208g(this.f117045o);
        }
    }

    /* renamed from: p */
    private final String m126475p(String str) {
        return AbstractC20130d.m104861V() + "temp_" + new C20556f(str).m106835h();
    }

    /* renamed from: u */
    private final C20556f m126476u() {
        return (C20556f) this.f117042l.getValue();
    }

    /* renamed from: y */
    private final long m126477y(EnumC24229g enumC24229g) {
        if (enumC24229g != EnumC24229g.f116962A && enumC24229g != EnumC24229g.f116976O) {
            return 0L;
        }
        return 5242880L;
    }

    /* renamed from: z */
    private final double m126478z(int i11, int i12, int i13, boolean z11) {
        if (z11) {
            double d11 = i11 * i11;
            double d12 = i12;
            double d13 = i13;
            return Math.max(Math.sqrt((d11 * d12) / d13), Math.sqrt((d11 * d13) / d12));
        }
        return i11;
    }

    /* renamed from: A */
    public final EnumC24191b m126479A() {
        return this.f117021a0;
    }

    /* renamed from: A0 */
    public final void m126480A0(int i11) {
        this.f117004K = i11;
    }

    /* renamed from: B */
    public final long m126481B() {
        return this.f117015V;
    }

    /* renamed from: B0 */
    public final void m126482B0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f117055y = str;
    }

    /* renamed from: C */
    public final long m126483C() {
        return this.f117016W;
    }

    /* renamed from: C0 */
    public final void m126484C0(int i11) {
        this.f117025c0 = i11;
    }

    /* renamed from: D */
    public final long m126485D() {
        return this.f117013T;
    }

    /* renamed from: D0 */
    public final void m126486D0(int i11) {
        this.f117001H = i11;
    }

    /* renamed from: E */
    public final long m126487E() {
        return this.f117014U;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c A[Catch: OutOfMemoryError -> 0x0086, Exception -> 0x0089, TryCatch #5 {Exception -> 0x0089, OutOfMemoryError -> 0x0086, blocks: (B:15:0x006e, B:17:0x0079, B:19:0x007d, B:23:0x0091, B:26:0x00a5, B:28:0x010c, B:29:0x0110, B:31:0x0132, B:33:0x013a, B:36:0x0141, B:39:0x014d, B:40:0x0150, B:42:0x0160, B:43:0x01ca, B:46:0x0186, B:48:0x018e, B:50:0x0196, B:52:0x01ae, B:53:0x01c5, B:54:0x00a3), top: B:14:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0141 A[Catch: OutOfMemoryError -> 0x0086, Exception -> 0x0089, TryCatch #5 {Exception -> 0x0089, OutOfMemoryError -> 0x0086, blocks: (B:15:0x006e, B:17:0x0079, B:19:0x007d, B:23:0x0091, B:26:0x00a5, B:28:0x010c, B:29:0x0110, B:31:0x0132, B:33:0x013a, B:36:0x0141, B:39:0x014d, B:40:0x0150, B:42:0x0160, B:43:0x01ca, B:46:0x0186, B:48:0x018e, B:50:0x0196, B:52:0x01ae, B:53:0x01c5, B:54:0x00a3), top: B:14:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0160 A[Catch: OutOfMemoryError -> 0x0086, Exception -> 0x0089, TryCatch #5 {Exception -> 0x0089, OutOfMemoryError -> 0x0086, blocks: (B:15:0x006e, B:17:0x0079, B:19:0x007d, B:23:0x0091, B:26:0x00a5, B:28:0x010c, B:29:0x0110, B:31:0x0132, B:33:0x013a, B:36:0x0141, B:39:0x014d, B:40:0x0150, B:42:0x0160, B:43:0x01ca, B:46:0x0186, B:48:0x018e, B:50:0x0196, B:52:0x01ae, B:53:0x01c5, B:54:0x00a3), top: B:14:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186 A[Catch: OutOfMemoryError -> 0x0086, Exception -> 0x0089, TryCatch #5 {Exception -> 0x0089, OutOfMemoryError -> 0x0086, blocks: (B:15:0x006e, B:17:0x0079, B:19:0x007d, B:23:0x0091, B:26:0x00a5, B:28:0x010c, B:29:0x0110, B:31:0x0132, B:33:0x013a, B:36:0x0141, B:39:0x014d, B:40:0x0150, B:42:0x0160, B:43:0x01ca, B:46:0x0186, B:48:0x018e, B:50:0x0196, B:52:0x01ae, B:53:0x01c5, B:54:0x00a3), top: B:14:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3 A[Catch: OutOfMemoryError -> 0x0086, Exception -> 0x0089, TryCatch #5 {Exception -> 0x0089, OutOfMemoryError -> 0x0086, blocks: (B:15:0x006e, B:17:0x0079, B:19:0x007d, B:23:0x0091, B:26:0x00a5, B:28:0x010c, B:29:0x0110, B:31:0x0132, B:33:0x013a, B:36:0x0141, B:39:0x014d, B:40:0x0150, B:42:0x0160, B:43:0x01ca, B:46:0x0186, B:48:0x018e, B:50:0x0196, B:52:0x01ae, B:53:0x01c5, B:54:0x00a3), top: B:14:0x006e }] */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m126488E0() {
        String str;
        String str2;
        boolean z11;
        boolean z12;
        Map map;
        this.f117012S = System.currentTimeMillis();
        long mo124319c = C23793c.Companion.m124321a().mo124319c();
        this.f117017X = m126476u().m106845r();
        try {
            try {
                if (m126455N()) {
                    return;
                }
                try {
                    short m136755n = (short) C26639b.m136755n(this.f117022b);
                    String m106834f = m126476u().m106834f();
                    if (m106834f.length() == 0) {
                        m106834f = "jpg";
                    }
                    str2 = "[uploadNative] Error %s";
                    try {
                        C2774c c2774c = new C2774c(this.f117030f, this.f117020a, AbstractC25495a.m132089n(this.f117055y), this.f117044n, m106834f, this.f117056z, m136755n, this.f116996C, C26639b.m136750i(this), this.f117032g, this.f117034h);
                        if (!C26639b.m136764w(this.f117022b) || (this.f117034h && !BitmapEncoder.f15688e.m18741d())) {
                            z11 = false;
                            c2774c.f10967L = z11;
                            if (!C24226d.Companion.m126436c().m126431W(this.f117055y)) {
                                z12 = false;
                            } else {
                                z12 = this.f117031f0;
                            }
                            c2774c.f10973R = z12;
                            c2774c.m13349E(this.f116997D);
                            c2774c.m13363u(this.f116995B);
                            c2774c.m13367y(this.f116998E);
                            c2774c.m13347C(this.f116999F);
                            c2774c.m13368z(this.f116994A);
                            c2774c.m13350F(this.f117004K);
                            c2774c.m13364v(this.f117000G);
                            c2774c.m13348D(this.f117005L);
                            c2774c.m13351G(C26639b.m136756o(this.f117022b));
                            c2774c.f10965J = this.f117003J;
                            c2774c.f10961F = this.f117009P;
                            c2774c.f10962G = this.f117010Q;
                            c2774c.f10963H = this.f117011R;
                            c2774c.f10964I = this.f117006M;
                            c2774c.f10960E = this.f117007N;
                            c2774c.f11016y = this.f117046p;
                            c2774c.f11017z = this.f117047q;
                            c2774c.f10956A = this.f117048r;
                            c2774c.f10957B = this.f117049s;
                            c2774c.f10974S = this.f117027d0;
                            c2774c.f10987c0 = this.f117037i0;
                            if (this.f117034h) {
                                c2774c.f10989d0 = this.f117045o;
                            }
                            c2774c.f10976U = this.f117024c;
                            c2774c.f10978W = this.f117029e0;
                            c2774c.f10975T = this.f117033g0;
                            c2774c.f10972Q = m126456O();
                            c2774c.f10979X = this.f117026d;
                            c2774c.f10980Y = this.f117028e;
                            c2774c.f10999i0 = this.f117041k0;
                            map = this.f117039j0;
                            if (map != null && (!map.isEmpty())) {
                                c2774c.m13352c(map);
                            }
                            if (m136755n == 1563) {
                                String m106835h = m126476u().m106835h();
                                if (m106835h == null) {
                                    m106835h = "";
                                }
                                c2774c.m13365w(m106835h);
                            }
                            c2774c.m13366x(new d(mo124319c, c2774c));
                            if (!C26639b.m136765x(this.f117022b)) {
                                C23307g m118367a = AbstractC23067f6.m118367a(this.f117030f);
                                AbstractC19074t.m100207e(m118367a, "getPhotoInfo(...)");
                                this.f117052v = m118367a;
                                c2774c.m13345A(m118367a);
                                c2774c.m13346B(this.f117051u);
                                c2774c.f10977V = 100L;
                                c2774c.f10981Z = AbstractC26689j.m137112u(C26639b.m136753l(this.f117022b));
                            } else if (C26639b.m136738B(this.f117022b) || C26639b.m136763v(this.f117022b)) {
                                this.f117052v = new C23307g(this.f117001H, this.f117002I);
                                C20556f c20556f = new C20556f(this.f117024c);
                                if (c20556f.m106830b()) {
                                    this.f117051u.f113480g = c20556f.m106845r();
                                    c2774c.m13346B(this.f117051u);
                                    c2774c.f10977V = c20556f.m106832d() / 1000;
                                }
                                c2774c.m13345A(this.f117052v);
                            }
                            C0816f.m2132b(c2774c);
                            this.f117053w = c2774c;
                        }
                        z11 = true;
                        c2774c.f10967L = z11;
                        if (!C24226d.Companion.m126436c().m126431W(this.f117055y)) {
                        }
                        c2774c.f10973R = z12;
                        c2774c.m13349E(this.f116997D);
                        c2774c.m13363u(this.f116995B);
                        c2774c.m13367y(this.f116998E);
                        c2774c.m13347C(this.f116999F);
                        c2774c.m13368z(this.f116994A);
                        c2774c.m13350F(this.f117004K);
                        c2774c.m13364v(this.f117000G);
                        c2774c.m13348D(this.f117005L);
                        c2774c.m13351G(C26639b.m136756o(this.f117022b));
                        c2774c.f10965J = this.f117003J;
                        c2774c.f10961F = this.f117009P;
                        c2774c.f10962G = this.f117010Q;
                        c2774c.f10963H = this.f117011R;
                        c2774c.f10964I = this.f117006M;
                        c2774c.f10960E = this.f117007N;
                        c2774c.f11016y = this.f117046p;
                        c2774c.f11017z = this.f117047q;
                        c2774c.f10956A = this.f117048r;
                        c2774c.f10957B = this.f117049s;
                        c2774c.f10974S = this.f117027d0;
                        c2774c.f10987c0 = this.f117037i0;
                        if (this.f117034h) {
                        }
                        c2774c.f10976U = this.f117024c;
                        c2774c.f10978W = this.f117029e0;
                        c2774c.f10975T = this.f117033g0;
                        c2774c.f10972Q = m126456O();
                        c2774c.f10979X = this.f117026d;
                        c2774c.f10980Y = this.f117028e;
                        c2774c.f10999i0 = this.f117041k0;
                        map = this.f117039j0;
                        if (map != null) {
                            c2774c.m13352c(map);
                        }
                        if (m136755n == 1563) {
                        }
                        c2774c.m13366x(new d(mo124319c, c2774c));
                        if (!C26639b.m136765x(this.f117022b)) {
                        }
                        C0816f.m2132b(c2774c);
                        this.f117053w = c2774c;
                    } catch (Exception e11) {
                        e = e11;
                        str = str2;
                        m126453J(e);
                        AbstractC20887g.m109238p(this.f117022b.m126452c() + 23000, this.f117012S);
                        AbstractC20110a.f98889a.mo104551d(str, e.toString());
                    } catch (OutOfMemoryError e12) {
                        e = e12;
                        m126462Y();
                        AbstractC20887g.m109238p(this.f117022b.m126452c() + 23000, this.f117012S);
                        AbstractC20110a.f98889a.mo104551d(str2, e.toString());
                    }
                } catch (Exception e13) {
                    e = e13;
                    str2 = "[uploadNative] Error %s";
                }
            } catch (Exception e14) {
                e = e14;
                str = "[uploadNative] Error %s";
            }
        } catch (OutOfMemoryError e15) {
            e = e15;
            str2 = "[uploadNative] Error %s";
        }
    }

    /* renamed from: F */
    public final String m126489F() {
        return this.f117055y;
    }

    /* renamed from: G */
    public final EnumC24229g m126490G() {
        return this.f117022b;
    }

    /* renamed from: H */
    public final EnumC24233k m126491H() {
        return this.f117050t;
    }

    /* renamed from: I */
    public final int m126492I() {
        return this.f117025c0;
    }

    /* renamed from: L */
    public final boolean m126493L() {
        return this.f117023b0;
    }

    /* renamed from: M */
    public final boolean m126494M() {
        return this.f117034h;
    }

    /* renamed from: R */
    public final boolean m126495R() {
        EnumC24229g enumC24229g = this.f117022b;
        if (enumC24229g != EnumC24229g.f116983q && enumC24229g != EnumC24229g.f116984r && enumC24229g != EnumC24229g.f116978Q && enumC24229g != EnumC24229g.f116980S && enumC24229g != EnumC24229g.f116979R) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public final void m126496T(C20096c c20096c) {
        AbstractC19074t.m100208f(c20096c, "errorMessage");
        for (InterfaceC24232j interfaceC24232j : this.f117043m) {
            EnumC24233k enumC24233k = this.f117050t;
            if (enumC24233k == null) {
                enumC24233k = EnumC24233k.f117063q;
            }
            interfaceC24232j.mo14380b(new AbstractC25752r.a(c20096c, enumC24233k, this.f117025c0));
        }
    }

    /* renamed from: U */
    public final void m126497U(long j11) {
        Iterator it = this.f117043m.iterator();
        while (it.hasNext()) {
            ((InterfaceC24232j) it.next()).mo14381c(j11);
        }
    }

    /* renamed from: V */
    public final void m126498V(AbstractC25751q abstractC25751q) {
        AbstractC19074t.m100208f(abstractC25751q, "uploadResponse");
        for (InterfaceC24232j interfaceC24232j : this.f117043m) {
            EnumC24233k enumC24233k = this.f117050t;
            if (enumC24233k == null) {
                enumC24233k = EnumC24233k.f117063q;
            }
            interfaceC24232j.mo14379a(new AbstractC25752r.b(abstractC25751q, enumC24233k, this.f117025c0));
        }
    }

    /* renamed from: a0 */
    public final void m126499a0() {
        m126463Z(C26638a.f126094a.m136733b());
    }

    /* renamed from: c0 */
    public final void m126500c0(long j11) {
        this.f117010Q = j11;
    }

    /* renamed from: d0 */
    public final void m126501d0(String str) {
        this.f117003J = str;
    }

    /* renamed from: e0 */
    public final void m126502e0(long j11) {
        this.f116995B = j11;
    }

    /* renamed from: f0 */
    public final void m126503f0(boolean z11) {
        this.f117041k0 = z11;
    }

    /* renamed from: g0 */
    public final void m126504g0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f117056z = str;
    }

    /* renamed from: h */
    public final void m126505h(InterfaceC24232j interfaceC24232j) {
        AbstractC19074t.m100208f(interfaceC24232j, "listener");
        this.f117043m.add(interfaceC24232j);
    }

    /* renamed from: h0 */
    public final void m126506h0(long j11) {
        this.f117018Y = j11;
    }

    /* renamed from: i */
    public final void m126507i() {
        C29037t0 c29037t0;
        this.f117008O = true;
        if (this.f117050t == EnumC24233k.f117064r && (c29037t0 = this.f117054x) != null) {
            c29037t0.mo51554n();
        }
        if (this.f117053w != null && C26639b.m136758q(this.f117022b)) {
            if (C26639b.m136756o(this.f117022b)) {
                C29632i.m147326E0().m93379G(this.f117020a);
            } else {
                C29630g.m147299E0().m93379G(this.f117020a);
            }
        }
    }

    /* renamed from: i0 */
    public final void m126508i0(int i11) {
        this.f117000G = i11;
    }

    /* renamed from: j */
    public final void m126509j() {
        this.f117043m.clear();
    }

    /* renamed from: j0 */
    public final void m126510j0(boolean z11) {
        this.f117033g0 = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0132, code lost:            if (r5 != false) goto L258;     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ad, code lost:            if (me0.AbstractC23238v2.m119726k() == false) goto L304;     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e1 A[Catch: all -> 0x0018, Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:5:0x0004, B:8:0x000f, B:12:0x0021, B:14:0x003a, B:16:0x0040, B:20:0x004c, B:23:0x0058, B:27:0x0066, B:30:0x0086, B:32:0x008d, B:34:0x0093, B:37:0x009e, B:39:0x00a4, B:42:0x00af, B:52:0x00cf, B:59:0x00e2, B:61:0x00e6, B:64:0x00fa, B:65:0x010a, B:67:0x0122, B:73:0x01d4, B:75:0x01ef, B:79:0x01fb, B:81:0x0203, B:83:0x0218, B:85:0x021e, B:88:0x0229, B:90:0x0254, B:91:0x025d, B:92:0x026f, B:94:0x027d, B:101:0x01e1, B:105:0x013c, B:106:0x0149, B:107:0x0143, B:111:0x0186, B:113:0x01bb, B:119:0x0101, B:120:0x0106, B:122:0x00ee, B:123:0x00f3, B:126:0x00c2, B:132:0x0070, B:134:0x0078, B:136:0x008a), top: B:4:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0136 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bb A[Catch: all -> 0x0018, Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:5:0x0004, B:8:0x000f, B:12:0x0021, B:14:0x003a, B:16:0x0040, B:20:0x004c, B:23:0x0058, B:27:0x0066, B:30:0x0086, B:32:0x008d, B:34:0x0093, B:37:0x009e, B:39:0x00a4, B:42:0x00af, B:52:0x00cf, B:59:0x00e2, B:61:0x00e6, B:64:0x00fa, B:65:0x010a, B:67:0x0122, B:73:0x01d4, B:75:0x01ef, B:79:0x01fb, B:81:0x0203, B:83:0x0218, B:85:0x021e, B:88:0x0229, B:90:0x0254, B:91:0x025d, B:92:0x026f, B:94:0x027d, B:101:0x01e1, B:105:0x013c, B:106:0x0149, B:107:0x0143, B:111:0x0186, B:113:0x01bb, B:119:0x0101, B:120:0x0106, B:122:0x00ee, B:123:0x00f3, B:126:0x00c2, B:132:0x0070, B:134:0x0078, B:136:0x008a), top: B:4:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093 A[Catch: all -> 0x0018, Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:5:0x0004, B:8:0x000f, B:12:0x0021, B:14:0x003a, B:16:0x0040, B:20:0x004c, B:23:0x0058, B:27:0x0066, B:30:0x0086, B:32:0x008d, B:34:0x0093, B:37:0x009e, B:39:0x00a4, B:42:0x00af, B:52:0x00cf, B:59:0x00e2, B:61:0x00e6, B:64:0x00fa, B:65:0x010a, B:67:0x0122, B:73:0x01d4, B:75:0x01ef, B:79:0x01fb, B:81:0x0203, B:83:0x0218, B:85:0x021e, B:88:0x0229, B:90:0x0254, B:91:0x025d, B:92:0x026f, B:94:0x027d, B:101:0x01e1, B:105:0x013c, B:106:0x0149, B:107:0x0143, B:111:0x0186, B:113:0x01bb, B:119:0x0101, B:120:0x0106, B:122:0x00ee, B:123:0x00f3, B:126:0x00c2, B:132:0x0070, B:134:0x0078, B:136:0x008a), top: B:4:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4 A[Catch: all -> 0x0018, Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:5:0x0004, B:8:0x000f, B:12:0x0021, B:14:0x003a, B:16:0x0040, B:20:0x004c, B:23:0x0058, B:27:0x0066, B:30:0x0086, B:32:0x008d, B:34:0x0093, B:37:0x009e, B:39:0x00a4, B:42:0x00af, B:52:0x00cf, B:59:0x00e2, B:61:0x00e6, B:64:0x00fa, B:65:0x010a, B:67:0x0122, B:73:0x01d4, B:75:0x01ef, B:79:0x01fb, B:81:0x0203, B:83:0x0218, B:85:0x021e, B:88:0x0229, B:90:0x0254, B:91:0x025d, B:92:0x026f, B:94:0x027d, B:101:0x01e1, B:105:0x013c, B:106:0x0149, B:107:0x0143, B:111:0x0186, B:113:0x01bb, B:119:0x0101, B:120:0x0106, B:122:0x00ee, B:123:0x00f3, B:126:0x00c2, B:132:0x0070, B:134:0x0078, B:136:0x008a), top: B:4:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[Catch: all -> 0x0018, Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:5:0x0004, B:8:0x000f, B:12:0x0021, B:14:0x003a, B:16:0x0040, B:20:0x004c, B:23:0x0058, B:27:0x0066, B:30:0x0086, B:32:0x008d, B:34:0x0093, B:37:0x009e, B:39:0x00a4, B:42:0x00af, B:52:0x00cf, B:59:0x00e2, B:61:0x00e6, B:64:0x00fa, B:65:0x010a, B:67:0x0122, B:73:0x01d4, B:75:0x01ef, B:79:0x01fb, B:81:0x0203, B:83:0x0218, B:85:0x021e, B:88:0x0229, B:90:0x0254, B:91:0x025d, B:92:0x026f, B:94:0x027d, B:101:0x01e1, B:105:0x013c, B:106:0x0149, B:107:0x0143, B:111:0x0186, B:113:0x01bb, B:119:0x0101, B:120:0x0106, B:122:0x00ee, B:123:0x00f3, B:126:0x00c2, B:132:0x0070, B:134:0x0078, B:136:0x008a), top: B:4:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6 A[Catch: all -> 0x0018, Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:5:0x0004, B:8:0x000f, B:12:0x0021, B:14:0x003a, B:16:0x0040, B:20:0x004c, B:23:0x0058, B:27:0x0066, B:30:0x0086, B:32:0x008d, B:34:0x0093, B:37:0x009e, B:39:0x00a4, B:42:0x00af, B:52:0x00cf, B:59:0x00e2, B:61:0x00e6, B:64:0x00fa, B:65:0x010a, B:67:0x0122, B:73:0x01d4, B:75:0x01ef, B:79:0x01fb, B:81:0x0203, B:83:0x0218, B:85:0x021e, B:88:0x0229, B:90:0x0254, B:91:0x025d, B:92:0x026f, B:94:0x027d, B:101:0x01e1, B:105:0x013c, B:106:0x0149, B:107:0x0143, B:111:0x0186, B:113:0x01bb, B:119:0x0101, B:120:0x0106, B:122:0x00ee, B:123:0x00f3, B:126:0x00c2, B:132:0x0070, B:134:0x0078, B:136:0x008a), top: B:4:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa A[Catch: all -> 0x0018, Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:5:0x0004, B:8:0x000f, B:12:0x0021, B:14:0x003a, B:16:0x0040, B:20:0x004c, B:23:0x0058, B:27:0x0066, B:30:0x0086, B:32:0x008d, B:34:0x0093, B:37:0x009e, B:39:0x00a4, B:42:0x00af, B:52:0x00cf, B:59:0x00e2, B:61:0x00e6, B:64:0x00fa, B:65:0x010a, B:67:0x0122, B:73:0x01d4, B:75:0x01ef, B:79:0x01fb, B:81:0x0203, B:83:0x0218, B:85:0x021e, B:88:0x0229, B:90:0x0254, B:91:0x025d, B:92:0x026f, B:94:0x027d, B:101:0x01e1, B:105:0x013c, B:106:0x0149, B:107:0x0143, B:111:0x0186, B:113:0x01bb, B:119:0x0101, B:120:0x0106, B:122:0x00ee, B:123:0x00f3, B:126:0x00c2, B:132:0x0070, B:134:0x0078, B:136:0x008a), top: B:4:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122 A[Catch: all -> 0x0018, Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:5:0x0004, B:8:0x000f, B:12:0x0021, B:14:0x003a, B:16:0x0040, B:20:0x004c, B:23:0x0058, B:27:0x0066, B:30:0x0086, B:32:0x008d, B:34:0x0093, B:37:0x009e, B:39:0x00a4, B:42:0x00af, B:52:0x00cf, B:59:0x00e2, B:61:0x00e6, B:64:0x00fa, B:65:0x010a, B:67:0x0122, B:73:0x01d4, B:75:0x01ef, B:79:0x01fb, B:81:0x0203, B:83:0x0218, B:85:0x021e, B:88:0x0229, B:90:0x0254, B:91:0x025d, B:92:0x026f, B:94:0x027d, B:101:0x01e1, B:105:0x013c, B:106:0x0149, B:107:0x0143, B:111:0x0186, B:113:0x01bb, B:119:0x0101, B:120:0x0106, B:122:0x00ee, B:123:0x00f3, B:126:0x00c2, B:132:0x0070, B:134:0x0078, B:136:0x008a), top: B:4:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d4 A[Catch: all -> 0x0018, Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:5:0x0004, B:8:0x000f, B:12:0x0021, B:14:0x003a, B:16:0x0040, B:20:0x004c, B:23:0x0058, B:27:0x0066, B:30:0x0086, B:32:0x008d, B:34:0x0093, B:37:0x009e, B:39:0x00a4, B:42:0x00af, B:52:0x00cf, B:59:0x00e2, B:61:0x00e6, B:64:0x00fa, B:65:0x010a, B:67:0x0122, B:73:0x01d4, B:75:0x01ef, B:79:0x01fb, B:81:0x0203, B:83:0x0218, B:85:0x021e, B:88:0x0229, B:90:0x0254, B:91:0x025d, B:92:0x026f, B:94:0x027d, B:101:0x01e1, B:105:0x013c, B:106:0x0149, B:107:0x0143, B:111:0x0186, B:113:0x01bb, B:119:0x0101, B:120:0x0106, B:122:0x00ee, B:123:0x00f3, B:126:0x00c2, B:132:0x0070, B:134:0x0078, B:136:0x008a), top: B:4:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ef A[Catch: all -> 0x0018, Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:5:0x0004, B:8:0x000f, B:12:0x0021, B:14:0x003a, B:16:0x0040, B:20:0x004c, B:23:0x0058, B:27:0x0066, B:30:0x0086, B:32:0x008d, B:34:0x0093, B:37:0x009e, B:39:0x00a4, B:42:0x00af, B:52:0x00cf, B:59:0x00e2, B:61:0x00e6, B:64:0x00fa, B:65:0x010a, B:67:0x0122, B:73:0x01d4, B:75:0x01ef, B:79:0x01fb, B:81:0x0203, B:83:0x0218, B:85:0x021e, B:88:0x0229, B:90:0x0254, B:91:0x025d, B:92:0x026f, B:94:0x027d, B:101:0x01e1, B:105:0x013c, B:106:0x0149, B:107:0x0143, B:111:0x0186, B:113:0x01bb, B:119:0x0101, B:120:0x0106, B:122:0x00ee, B:123:0x00f3, B:126:0x00c2, B:132:0x0070, B:134:0x0078, B:136:0x008a), top: B:4:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027d A[Catch: all -> 0x0018, Exception -> 0x001b, TRY_LEAVE, TryCatch #0 {Exception -> 0x001b, blocks: (B:5:0x0004, B:8:0x000f, B:12:0x0021, B:14:0x003a, B:16:0x0040, B:20:0x004c, B:23:0x0058, B:27:0x0066, B:30:0x0086, B:32:0x008d, B:34:0x0093, B:37:0x009e, B:39:0x00a4, B:42:0x00af, B:52:0x00cf, B:59:0x00e2, B:61:0x00e6, B:64:0x00fa, B:65:0x010a, B:67:0x0122, B:73:0x01d4, B:75:0x01ef, B:79:0x01fb, B:81:0x0203, B:83:0x0218, B:85:0x021e, B:88:0x0229, B:90:0x0254, B:91:0x025d, B:92:0x026f, B:94:0x027d, B:101:0x01e1, B:105:0x013c, B:106:0x0149, B:107:0x0143, B:111:0x0186, B:113:0x01bb, B:119:0x0101, B:120:0x0106, B:122:0x00ee, B:123:0x00f3, B:126:0x00c2, B:132:0x0070, B:134:0x0078, B:136:0x008a), top: B:4:0x0004, outer: #1 }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized int m126511k(boolean z11, boolean z12) {
        int i11;
        boolean z13;
        byte[] m119944c;
        boolean z14;
        Bitmap.CompressFormat compressFormat;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        int m137093b;
        int m137092a;
        C20556f m126476u;
        String str;
        String str2;
        int m126473n;
        int i12;
        int m137110s;
        int i13;
        boolean z22;
        C20556f c20556f;
        C20556f c20556f2;
        int i14;
        try {
            try {
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104551d("UploadItem->cloneOrCompressChatPhoto \n" + e11, new Object[0]);
                if (!AbstractC23227u1.m119701a(e11)) {
                    if (e11 instanceof IOException) {
                    }
                    i11 = 112;
                }
                i11 = 601;
            }
            if (!C26639b.m136764w(this.f117022b) || (z11 && !BitmapEncoder.f15688e.m18741d())) {
                z13 = false;
                m119944c = AbstractC23258x2.m119944c(this.f117038j.m106838k());
                AbstractC19074t.m100207e(m119944c, "getImageHeaderBytes(...)");
                boolean m119953l = AbstractC23258x2.m119953l(m119944c);
                if (!AbstractC23258x2.m119948g(m119944c) && !AbstractC23258x2.m119960s(m119944c) && ((!C26639b.m136759r(this.f117022b) || !m119953l) && ((!z13 || AbstractC23078g6.Companion.m118392g(this.f117024c)) && (z13 || !AbstractC23078g6.Companion.m118392g(this.f117024c))))) {
                    z14 = false;
                    if ((!m126458Q(this.f117022b) && m119953l) || (!C26639b.m136757p(this.f117044n) && AbstractC19074t.m100204b(this.f117038j.m106834f(), "png"))) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    Bitmap.CompressFormat compressFormat2 = compressFormat;
                    if (AbstractC26689j.m137100i() == 0 && C26645c.m136777d(this.f117024c)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (AbstractC26689j.m137100i() == 0 && AbstractC23009a3.m117960k(this.f117024c)) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (AbstractC26689j.m137100i() != 2 && !z15 && !z16) {
                        z17 = false;
                        if ((z12 || z11) && C26639b.m136741E(this.f117024c, 0, z17)) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (!z12 && C26639b.m136741E(this.f117024c, 1, z17)) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (!z19 && !z18) {
                            z21 = false;
                            this.f117023b0 = z21;
                            if (!z15) {
                                m137093b = AbstractC26689j.m137095d();
                            } else if (z16) {
                                m137093b = AbstractC26689j.m137099h();
                            } else {
                                m137093b = AbstractC26689j.m137093b();
                            }
                            int i15 = m137093b;
                            if (!z15) {
                                m137092a = AbstractC26689j.m137094c();
                            } else if (z16) {
                                m137092a = AbstractC26689j.m137098g();
                            } else {
                                m137092a = AbstractC26689j.m137092a();
                            }
                            m126476u = m126476u();
                            str = this.f117030f;
                            C23793c.b bVar = C23793c.Companion;
                            long mo124319c = bVar.m124321a().mo124319c();
                            if (m126476u.m106830b() && m126476u.m106845r() > 0) {
                                str2 = str;
                                i11 = 0;
                                z22 = true;
                                if (z12) {
                                    this.f117016W = bVar.m124321a().mo124319c() - mo124319c;
                                } else {
                                    this.f117015V = bVar.m124321a().mo124319c() - mo124319c;
                                }
                                if (i11 == 0) {
                                    this.f117017X = m126476u.m106845r();
                                }
                                if (z12 && z11 && z18 && !BitmapEncoder.f15688e.m18741d()) {
                                    String m136768a = C26639b.f126100a.m136768a(str2);
                                    c20556f = new C20556f(m136768a);
                                    long mo124319c2 = bVar.m124321a().mo124319c();
                                    if (i11 == 0 || (c20556f.m106830b() && c20556f.m106845r() > 0)) {
                                        c20556f2 = c20556f;
                                        this.f117015V = bVar.m124321a().mo124319c() - mo124319c2;
                                        if (i11 == 0) {
                                            this.f117045o = m136768a;
                                            this.f117019Z = c20556f2.m106845r();
                                        }
                                    }
                                    AbstractC20110a.f98889a.mo104548a("UploadItem cloneOrCompressChatPhoto->resizedFile quality=" + i15 + " resizedPath=" + m136768a + " inputPath=" + str2, new Object[0]);
                                    if (z22) {
                                        i14 = AbstractC23277z1.m120057a(this.f117038j);
                                    } else {
                                        i14 = 0;
                                    }
                                    c20556f2 = c20556f;
                                    i11 = m126472m(m126476u, m136768a, i14, AbstractC26689j.m137110s(), compressFormat2, i15, z17, z13);
                                    this.f117015V = bVar.m124321a().mo124319c() - mo124319c2;
                                    if (i11 == 0) {
                                    }
                                }
                            }
                            if ((!z12 || !z18) && !z14) {
                                str2 = str;
                                AbstractC20110a.f98889a.mo104548a("UploadItem cloneOrCompressChatPhoto->clone: primaryFile primaryPath=" + str2 + " originalPath=" + this.f117024c, new Object[0]);
                                String m126475p = m126475p(str2);
                                m126473n = m126473n(this.f117038j, new C20556f(m126475p));
                                if (m126473n != 0 && !new File(m126475p).renameTo(new File(str2))) {
                                    i12 = 502;
                                } else {
                                    i12 = m126473n;
                                }
                                i11 = i12;
                                z22 = true;
                                if (z12) {
                                }
                                if (i11 == 0) {
                                }
                                if (z12) {
                                    String m136768a2 = C26639b.f126100a.m136768a(str2);
                                    c20556f = new C20556f(m136768a2);
                                    long mo124319c22 = bVar.m124321a().mo124319c();
                                    if (i11 == 0) {
                                    }
                                    c20556f2 = c20556f;
                                    this.f117015V = bVar.m124321a().mo124319c() - mo124319c22;
                                    if (i11 == 0) {
                                    }
                                }
                            }
                            if (z12) {
                                m137110s = AbstractC26689j.m137109r();
                                i13 = m137092a;
                            } else {
                                m137110s = AbstractC26689j.m137110s();
                                i13 = i15;
                            }
                            AbstractC20110a.f98889a.mo104548a("UploadItem cloneOrCompressChatPhoto->compress: quality=" + i13 + " primaryFile primaryPath=" + str + " originalPath=" + this.f117024c, new Object[0]);
                            C20556f c20556f3 = this.f117038j;
                            str2 = str;
                            i11 = m126472m(c20556f3, str, AbstractC23277z1.m120057a(c20556f3), m137110s, compressFormat2, i13, z17, z13);
                            z22 = false;
                            if (z12) {
                            }
                            if (i11 == 0) {
                            }
                            if (z12) {
                            }
                        }
                        z21 = true;
                        this.f117023b0 = z21;
                        if (!z15) {
                        }
                        int i152 = m137093b;
                        if (!z15) {
                        }
                        m126476u = m126476u();
                        str = this.f117030f;
                        C23793c.b bVar2 = C23793c.Companion;
                        long mo124319c3 = bVar2.m124321a().mo124319c();
                        if (m126476u.m106830b()) {
                            str2 = str;
                            i11 = 0;
                            z22 = true;
                            if (z12) {
                            }
                            if (i11 == 0) {
                            }
                            if (z12) {
                            }
                        }
                        if (!z12) {
                        }
                        str2 = str;
                        AbstractC20110a.f98889a.mo104548a("UploadItem cloneOrCompressChatPhoto->clone: primaryFile primaryPath=" + str2 + " originalPath=" + this.f117024c, new Object[0]);
                        String m126475p2 = m126475p(str2);
                        m126473n = m126473n(this.f117038j, new C20556f(m126475p2));
                        if (m126473n != 0) {
                        }
                        i12 = m126473n;
                        i11 = i12;
                        z22 = true;
                        if (z12) {
                        }
                        if (i11 == 0) {
                        }
                        if (z12) {
                        }
                    }
                    z17 = true;
                    if (z12) {
                    }
                    z18 = true;
                    if (!z12) {
                    }
                    z19 = false;
                    if (!z19) {
                        z21 = false;
                        this.f117023b0 = z21;
                        if (!z15) {
                        }
                        int i1522 = m137093b;
                        if (!z15) {
                        }
                        m126476u = m126476u();
                        str = this.f117030f;
                        C23793c.b bVar22 = C23793c.Companion;
                        long mo124319c32 = bVar22.m124321a().mo124319c();
                        if (m126476u.m106830b()) {
                        }
                        if (!z12) {
                        }
                        str2 = str;
                        AbstractC20110a.f98889a.mo104548a("UploadItem cloneOrCompressChatPhoto->clone: primaryFile primaryPath=" + str2 + " originalPath=" + this.f117024c, new Object[0]);
                        String m126475p22 = m126475p(str2);
                        m126473n = m126473n(this.f117038j, new C20556f(m126475p22));
                        if (m126473n != 0) {
                        }
                        i12 = m126473n;
                        i11 = i12;
                        z22 = true;
                        if (z12) {
                        }
                        if (i11 == 0) {
                        }
                        if (z12) {
                        }
                    }
                    z21 = true;
                    this.f117023b0 = z21;
                    if (!z15) {
                    }
                    int i15222 = m137093b;
                    if (!z15) {
                    }
                    m126476u = m126476u();
                    str = this.f117030f;
                    C23793c.b bVar222 = C23793c.Companion;
                    long mo124319c322 = bVar222.m124321a().mo124319c();
                    if (m126476u.m106830b()) {
                    }
                    if (!z12) {
                    }
                    str2 = str;
                    AbstractC20110a.f98889a.mo104548a("UploadItem cloneOrCompressChatPhoto->clone: primaryFile primaryPath=" + str2 + " originalPath=" + this.f117024c, new Object[0]);
                    String m126475p222 = m126475p(str2);
                    m126473n = m126473n(this.f117038j, new C20556f(m126475p222));
                    if (m126473n != 0) {
                    }
                    i12 = m126473n;
                    i11 = i12;
                    z22 = true;
                    if (z12) {
                    }
                    if (i11 == 0) {
                    }
                    if (z12) {
                    }
                }
                z14 = true;
                if (!m126458Q(this.f117022b)) {
                }
                compressFormat = Bitmap.CompressFormat.JPEG;
                Bitmap.CompressFormat compressFormat22 = compressFormat;
                if (AbstractC26689j.m137100i() == 0) {
                }
                z15 = false;
                if (AbstractC26689j.m137100i() == 0) {
                }
                z16 = false;
                if (AbstractC26689j.m137100i() != 2) {
                    z17 = false;
                    if (z12) {
                    }
                    z18 = true;
                    if (!z12) {
                    }
                    z19 = false;
                    if (!z19) {
                    }
                    z21 = true;
                    this.f117023b0 = z21;
                    if (!z15) {
                    }
                    int i152222 = m137093b;
                    if (!z15) {
                    }
                    m126476u = m126476u();
                    str = this.f117030f;
                    C23793c.b bVar2222 = C23793c.Companion;
                    long mo124319c3222 = bVar2222.m124321a().mo124319c();
                    if (m126476u.m106830b()) {
                    }
                    if (!z12) {
                    }
                    str2 = str;
                    AbstractC20110a.f98889a.mo104548a("UploadItem cloneOrCompressChatPhoto->clone: primaryFile primaryPath=" + str2 + " originalPath=" + this.f117024c, new Object[0]);
                    String m126475p2222 = m126475p(str2);
                    m126473n = m126473n(this.f117038j, new C20556f(m126475p2222));
                    if (m126473n != 0) {
                    }
                    i12 = m126473n;
                    i11 = i12;
                    z22 = true;
                    if (z12) {
                    }
                    if (i11 == 0) {
                    }
                    if (z12) {
                    }
                }
                z17 = true;
                if (z12) {
                }
                z18 = true;
                if (!z12) {
                }
                z19 = false;
                if (!z19) {
                }
                z21 = true;
                this.f117023b0 = z21;
                if (!z15) {
                }
                int i1522222 = m137093b;
                if (!z15) {
                }
                m126476u = m126476u();
                str = this.f117030f;
                C23793c.b bVar22222 = C23793c.Companion;
                long mo124319c32222 = bVar22222.m124321a().mo124319c();
                if (m126476u.m106830b()) {
                }
                if (!z12) {
                }
                str2 = str;
                AbstractC20110a.f98889a.mo104548a("UploadItem cloneOrCompressChatPhoto->clone: primaryFile primaryPath=" + str2 + " originalPath=" + this.f117024c, new Object[0]);
                String m126475p22222 = m126475p(str2);
                m126473n = m126473n(this.f117038j, new C20556f(m126475p22222));
                if (m126473n != 0) {
                }
                i12 = m126473n;
                i11 = i12;
                z22 = true;
                if (z12) {
                }
                if (i11 == 0) {
                }
                if (z12) {
                }
            }
            z13 = true;
            m119944c = AbstractC23258x2.m119944c(this.f117038j.m106838k());
            AbstractC19074t.m100207e(m119944c, "getImageHeaderBytes(...)");
            boolean m119953l2 = AbstractC23258x2.m119953l(m119944c);
            if (!AbstractC23258x2.m119948g(m119944c)) {
                z14 = false;
                if (!m126458Q(this.f117022b)) {
                }
                compressFormat = Bitmap.CompressFormat.JPEG;
                Bitmap.CompressFormat compressFormat222 = compressFormat;
                if (AbstractC26689j.m137100i() == 0) {
                }
                z15 = false;
                if (AbstractC26689j.m137100i() == 0) {
                }
                z16 = false;
                if (AbstractC26689j.m137100i() != 2) {
                }
                z17 = true;
                if (z12) {
                }
                z18 = true;
                if (!z12) {
                }
                z19 = false;
                if (!z19) {
                }
                z21 = true;
                this.f117023b0 = z21;
                if (!z15) {
                }
                int i15222222 = m137093b;
                if (!z15) {
                }
                m126476u = m126476u();
                str = this.f117030f;
                C23793c.b bVar222222 = C23793c.Companion;
                long mo124319c322222 = bVar222222.m124321a().mo124319c();
                if (m126476u.m106830b()) {
                }
                if (!z12) {
                }
                str2 = str;
                AbstractC20110a.f98889a.mo104548a("UploadItem cloneOrCompressChatPhoto->clone: primaryFile primaryPath=" + str2 + " originalPath=" + this.f117024c, new Object[0]);
                String m126475p222222 = m126475p(str2);
                m126473n = m126473n(this.f117038j, new C20556f(m126475p222222));
                if (m126473n != 0) {
                }
                i12 = m126473n;
                i11 = i12;
                z22 = true;
                if (z12) {
                }
                if (i11 == 0) {
                }
                if (z12) {
                }
            }
            z14 = true;
            if (!m126458Q(this.f117022b)) {
            }
            compressFormat = Bitmap.CompressFormat.JPEG;
            Bitmap.CompressFormat compressFormat2222 = compressFormat;
            if (AbstractC26689j.m137100i() == 0) {
            }
            z15 = false;
            if (AbstractC26689j.m137100i() == 0) {
            }
            z16 = false;
            if (AbstractC26689j.m137100i() != 2) {
            }
            z17 = true;
            if (z12) {
            }
            z18 = true;
            if (!z12) {
            }
            z19 = false;
            if (!z19) {
            }
            z21 = true;
            this.f117023b0 = z21;
            if (!z15) {
            }
            int i152222222 = m137093b;
            if (!z15) {
            }
            m126476u = m126476u();
            str = this.f117030f;
            C23793c.b bVar2222222 = C23793c.Companion;
            long mo124319c3222222 = bVar2222222.m124321a().mo124319c();
            if (m126476u.m106830b()) {
            }
            if (!z12) {
            }
            str2 = str;
            AbstractC20110a.f98889a.mo104548a("UploadItem cloneOrCompressChatPhoto->clone: primaryFile primaryPath=" + str2 + " originalPath=" + this.f117024c, new Object[0]);
            String m126475p2222222 = m126475p(str2);
            m126473n = m126473n(this.f117038j, new C20556f(m126475p2222222));
            if (m126473n != 0) {
            }
            i12 = m126473n;
            i11 = i12;
            z22 = true;
            if (z12) {
            }
            if (i11 == 0) {
            }
            if (z12) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i11;
    }

    /* renamed from: k0 */
    public final void m126512k0(boolean z11) {
        this.f117037i0 = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:            if (r14 == false) goto L225;     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m126513l() {
        boolean m136743G;
        boolean z11;
        boolean z12;
        long j11;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int m127173b0;
        int i15;
        Bitmap.CompressFormat compressFormat;
        int i16;
        int m137092a;
        int m137098g;
        int m137101j;
        int i17;
        long mo124319c = C23793c.Companion.m124321a().mo124319c();
        if (m126476u().m106830b() && m126476u().m106845r() > 0) {
            i15 = 0;
        } else {
            short m136755n = (short) C26639b.m136755n(this.f117022b);
            String m106834f = this.f117038j.m106834f();
            byte[] m119944c = AbstractC23258x2.m119944c(this.f117038j.m106838k());
            AbstractC19074t.m100207e(m119944c, "getImageHeaderBytes(...)");
            boolean m119948g = AbstractC23258x2.m119948g(m119944c);
            boolean m119960s = AbstractC23258x2.m119960s(m119944c);
            int m136753l = C26639b.m136753l(this.f117022b);
            int m137100i = AbstractC26689j.m137100i();
            boolean m117960k = AbstractC23009a3.m117960k(this.f117024c);
            boolean m136777d = C26645c.m136777d(this.f117024c);
            if (m136753l != 0 && m136753l != 1) {
                m136743G = C26639b.m136743G(this.f117024c, m136753l);
            } else if (m137100i != 0 && (m137100i != 1 || m117960k || m136777d)) {
                if (m137100i == 1 || m137100i == 2) {
                    m136743G = C26639b.m136742F(this.f117024c, m136753l);
                }
                if (!m119948g && !m119960s) {
                    z11 = false;
                    this.f117023b0 = z11;
                    int m136748g = C26639b.m136748g(m136755n);
                    if (!z11) {
                        int m137103l = AbstractC26689j.m137103l();
                        Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.JPEG;
                        if (!C26639b.m136757p(this.f117044n) && AbstractC19074t.m100204b("png", m106834f)) {
                            compressFormat = Bitmap.CompressFormat.PNG;
                        } else {
                            compressFormat = compressFormat2;
                        }
                        if (m136748g != 0 && m136748g != 1) {
                            if (m136748g != 2) {
                                if (m136748g != 3) {
                                    i17 = m137103l;
                                    i16 = 601;
                                    i12 = C26643a.m136770a(this.f117024c, this.f117030f, i17, m136748g, compressFormat, C26639b.m136764w(this.f117022b));
                                } else {
                                    m137101j = AbstractC26689j.m137078E();
                                }
                            } else {
                                m137101j = AbstractC26689j.m137101j();
                            }
                            i17 = m137101j;
                            i16 = 601;
                            i12 = C26643a.m136770a(this.f117024c, this.f117030f, i17, m136748g, compressFormat, C26639b.m136764w(this.f117022b));
                        } else {
                            i16 = 601;
                            if (m136748g == 0) {
                                m137092a = AbstractC26689j.m137093b();
                            } else {
                                m137092a = AbstractC26689j.m137092a();
                            }
                            int i18 = m137092a;
                            if (m137100i != 0 && (m137100i != 1 || m117960k || m136777d)) {
                                if (m137100i != 1 && m137100i != 2) {
                                    i12 = 0;
                                } else {
                                    if (m136777d) {
                                        if (m136748g == 0) {
                                            m137098g = AbstractC26689j.m137095d();
                                        } else {
                                            m137098g = AbstractC26689j.m137094c();
                                        }
                                    } else {
                                        if (m117960k) {
                                            if (m136748g == 0) {
                                                m137098g = AbstractC26689j.m137099h();
                                            } else {
                                                m137098g = AbstractC26689j.m137098g();
                                            }
                                        }
                                        i12 = C26643a.m136771b(this.f117024c, this.f117030f, i18, m136748g, compressFormat);
                                    }
                                    i18 = m137098g;
                                    i12 = C26643a.m136771b(this.f117024c, this.f117030f, i18, m136748g, compressFormat);
                                }
                            } else {
                                i12 = C26643a.m136770a(this.f117024c, this.f117030f, i18, m136748g, compressFormat, C26639b.m136764w(this.f117022b));
                            }
                        }
                        if (i12 != i16) {
                            float m106845r = ((float) new C20556f(this.f117030f).m106845r()) / ((float) m126525t());
                            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                            aVar.mo104548a("[cloneOrCompressPhotoIfNeeded] compression ratio: " + m106845r, new Object[0]);
                            if (m106845r > 1.0f && !m119948g && !m119960s) {
                                aVar.mo104548a("[cloneOrCompressPhotoIfNeeded] compressRatio: " + m106845r + ", isHeifHeader: " + m119948g + ", isWebpHeader: " + m119960s, new Object[0]);
                                i12 = m126473n(this.f117038j, m126476u());
                            } else {
                                aVar.mo104548a("[cloneOrCompressPhotoIfNeeded] Temp upload photo: " + this.f117030f, new Object[0]);
                            }
                        }
                        j11 = mo124319c;
                    } else {
                        AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
                        aVar2.mo104548a("[cloneOrCompressPhotoIfNeeded] skip compression", new Object[0]);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!AbstractC23254w8.m119859g(this.f117024c) && AbstractC23258x2.m119952k(AbstractC23258x2.m119944c(this.f117038j.m106838k()))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int i19 = 100;
                        String str2 = "[JXL]";
                        if (!C26639b.m136764w(this.f117022b) || z12) {
                            j11 = mo124319c;
                            C20556f c20556f = null;
                            C20556f c20556f2 = this.f117038j;
                            if (!C26639b.m136764w(this.f117022b) && z12) {
                                i11 = 502;
                                try {
                                    ZJXLDecoder.Options options = new ZJXLDecoder.Options();
                                    options.f88636a = true;
                                    if (ZJXLDecoder.m92544d(ZJXLDecoder.m92545e(this.f117024c, options)) == 0) {
                                        i14 = options.bmPreviewWidth;
                                        i13 = options.bmPreviewHeight;
                                    } else {
                                        i13 = 0;
                                        i14 = 0;
                                    }
                                    if (i14 > 0 && i13 > 0) {
                                        Bitmap createBitmap = Bitmap.createBitmap(i14, i13, Bitmap.Config.ARGB_8888);
                                        AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
                                        if (ZJXLDecoder.m92544d(ZJXLDecoder.m92543c(this.f117024c, 1, createBitmap)) == 0) {
                                            if (m136748g != 0) {
                                                if (m136748g != 1) {
                                                    if (m136748g != 2) {
                                                        if (m136748g == 3) {
                                                            i19 = AbstractC26689j.m137078E();
                                                        }
                                                    } else {
                                                        i19 = AbstractC26689j.m137101j();
                                                    }
                                                } else {
                                                    i19 = AbstractC26689j.m137092a();
                                                }
                                            } else {
                                                i19 = AbstractC26689j.m137093b();
                                            }
                                            String str3 = this.f117030f;
                                            m127173b0 = AbstractC24342w.m127173b0(this.f117024c, ".jxl", 0, false, 6, null);
                                            if (m127173b0 >= 0) {
                                                String substring = this.f117024c.substring(0, m127173b0);
                                                AbstractC19074t.m100207e(substring, "substring(...)");
                                                str3 = substring + ".jpg";
                                            }
                                            AbstractC23009a3.m117972w(createBitmap, Bitmap.CompressFormat.JPEG, i19, str3);
                                            c20556f = new C20556f(str3);
                                            z12 = false;
                                        }
                                    }
                                } catch (Exception e11) {
                                    if (AbstractC23227u1.m119701a(e11) || !AbstractC23238v2.m119726k()) {
                                        i11 = 601;
                                    }
                                }
                            } else {
                                c20556f = c20556f2;
                                i11 = 0;
                            }
                            if (c20556f == null) {
                                AbstractC20110a.a aVar3 = AbstractC20110a.f98889a;
                                if (z12) {
                                    str = "[JXL]";
                                } else {
                                    str = "[JPEG]";
                                }
                                aVar3.m104564x(str).mo104548a("copyFile, errorCode = " + i11 + ", originPath = " + this.f117024c + ", inputFile = " + c20556f, new Object[0]);
                            }
                            if (c20556f != null) {
                                i11 = m126473n(c20556f, m126476u());
                                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                if (C26639b.m136767z(this.f117022b)) {
                                    if (i11 == 0) {
                                        AbstractC20110a.a aVar4 = AbstractC20110a.f98889a;
                                        if (!z12) {
                                            str2 = "[JPEG]";
                                        }
                                        aVar4.m104564x(str2).mo104548a("outputPath = " + this.f117030f + ", copyFile in : " + currentTimeMillis2 + " ms", new Object[0]);
                                    } else {
                                        AbstractC20110a.a aVar5 = AbstractC20110a.f98889a;
                                        if (!z12) {
                                            str2 = "[JPEG]";
                                        }
                                        aVar5.m104564x(str2).mo104548a("copyFile, errorCode = " + i11 + ", inputPath = " + this.f117024c, new Object[0]);
                                    }
                                }
                            }
                            i12 = i11;
                        } else {
                            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.JPEG;
                            if (!C26639b.m136757p(this.f117044n) && AbstractC19074t.m100204b("png", m106834f)) {
                                compressFormat3 = Bitmap.CompressFormat.PNG;
                            }
                            BitmapEncoder bitmapEncoder = new BitmapEncoder();
                            bitmapEncoder.m18737d(100);
                            bitmapEncoder.m18736c(compressFormat3);
                            String str4 = this.f117024c;
                            C23307g c23307g = this.f117051u;
                            double m92548b = ZJXLEncoder.m92548b(bitmapEncoder, str4, c23307g.f113474a, c23307g.f113475b, false);
                            int m92549c = ZJXLEncoder.m92549c(m92548b);
                            if (m92549c == 0) {
                                int m92550d = ZJXLEncoder.m92550d(m92548b);
                                j11 = mo124319c;
                                long j12 = m92550d;
                                long j13 = currentTimeMillis + j12;
                                try {
                                    if (m126476u().m106830b()) {
                                        m126476u().m106829a();
                                    }
                                    OutputStream m106840m = m126476u().m106840m();
                                    if (m106840m != null) {
                                        try {
                                            if (bitmapEncoder.m18734a() != null) {
                                                m106840m.write(bitmapEncoder.m18734a());
                                            }
                                        } finally {
                                        }
                                    }
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    AbstractC2933b.m13890a(m106840m, null);
                                    BitmapEncoder.f15688e.m18742e(currentTimeMillis, j13, j12, m92549c, true);
                                    AbstractC20110a.b m104564x = aVar2.m104564x("[JXL]");
                                    String str5 = this.f117024c;
                                    String m106842o = m126476u().m106842o();
                                    C23307g c23307g2 = this.f117051u;
                                    m104564x.mo104548a("inputPath = " + str5 + ", outputPath = " + m106842o + ", w = " + c23307g2.f113474a + ", h = " + c23307g2.f113475b + ", encodeImageFile in : " + m92550d + " ms", new Object[0]);
                                } catch (IOException e12) {
                                    if (!AbstractC23227u1.m119701a(e12) && AbstractC23238v2.m119726k()) {
                                        i12 = 0;
                                    } else {
                                        i12 = 601;
                                    }
                                    BitmapEncoder.f15688e.m18742e(currentTimeMillis, 0L, 0L, i12, true);
                                    AbstractC20110a.f98889a.m104564x("[JXL]").mo104548a("errorEncode = " + i12 + ", inputPath = " + this.f117024c, new Object[0]);
                                }
                            } else {
                                j11 = mo124319c;
                                BitmapEncoder.f15688e.m18742e(currentTimeMillis, 0L, 0L, m92549c, true);
                                aVar2.m104564x("[JXL]").mo104548a("errorEncode = " + m92549c + ", inputPath = " + this.f117024c, new Object[0]);
                            }
                            i12 = 0;
                        }
                    }
                    if (m136753l == 0) {
                        if (m136753l == 1) {
                            this.f117016W = C23793c.Companion.m124321a().mo124319c() - j11;
                        }
                    } else {
                        this.f117015V = C23793c.Companion.m124321a().mo124319c() - j11;
                    }
                    m126459S(System.currentTimeMillis(), i12);
                    i15 = i12;
                }
                z11 = true;
                this.f117023b0 = z11;
                int m136748g2 = C26639b.m136748g(m136755n);
                if (!z11) {
                }
                if (m136753l == 0) {
                }
                m126459S(System.currentTimeMillis(), i12);
                i15 = i12;
            } else {
                m136743G = C26639b.m136743G(this.f117024c, m136753l);
            }
        }
        AbstractC20110a.f98889a.mo104548a("[cloneOrCompressPhotoIfNeeded] upload file: " + this.f117030f + ", fileSize: " + m126476u().m106845r(), new Object[0]);
        return i15;
    }

    /* renamed from: l0 */
    public final void m126514l0(int i11) {
        this.f116996C = i11;
    }

    /* renamed from: m0 */
    public final void m126515m0(Map map) {
        this.f117039j0 = map;
    }

    /* renamed from: n0 */
    public final void m126516n0(int i11) {
        this.f117002I = i11;
    }

    /* renamed from: o0 */
    public final void m126517o0(C3063z0 c3063z0) {
        this.f116998E = c3063z0;
    }

    /* renamed from: p0 */
    public final void m126518p0(boolean z11) {
        this.f116994A = z11;
    }

    /* renamed from: q */
    public final long m126519q() {
        return this.f117018Y;
    }

    /* renamed from: q0 */
    public final void m126520q0(PrivacyInfo privacyInfo) {
        this.f116999F = privacyInfo;
    }

    /* renamed from: r */
    public final int m126521r() {
        return this.f117020a;
    }

    /* renamed from: r0 */
    public final void m126522r0(EnumC24191b enumC24191b) {
        AbstractC19074t.m100208f(enumC24191b, "<set-?>");
        this.f117021a0 = enumC24191b;
    }

    /* renamed from: s */
    public final InterfaceC24231i m126523s() {
        return this.f117036i;
    }

    /* renamed from: s0 */
    public final void m126524s0(boolean z11) {
        this.f117005L = z11;
    }

    /* renamed from: t */
    public final long m126525t() {
        return ((Number) this.f117040k.getValue()).longValue();
    }

    /* renamed from: t0 */
    public final void m126526t0(int i11) {
        this.f117035h0 = i11;
    }

    /* renamed from: u0 */
    public final void m126527u0(SongInfo songInfo) {
        this.f117011R = songInfo;
    }

    /* renamed from: v */
    public final long m126528v() {
        return this.f117017X;
    }

    /* renamed from: v0 */
    public final void m126529v0(StoryMusicAttachment storyMusicAttachment) {
        this.f117006M = storyMusicAttachment;
    }

    /* renamed from: w */
    public final long m126530w() {
        return this.f117019Z;
    }

    /* renamed from: w0 */
    public final void m126531w0(ArrayList arrayList) {
        this.f116997D = arrayList;
    }

    /* renamed from: x */
    public final String m126532x() {
        return this.f117030f;
    }

    /* renamed from: x0 */
    public final void m126533x0(long j11) {
        this.f117013T = j11;
    }

    /* renamed from: y0 */
    public final void m126534y0(long j11) {
        this.f117014U = j11;
    }

    /* renamed from: z0 */
    public final void m126535z0(TrackingSource trackingSource) {
        this.f117009P = trackingSource;
    }
}
