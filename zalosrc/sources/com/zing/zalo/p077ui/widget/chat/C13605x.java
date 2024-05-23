package com.zing.zalo.p077ui.widget.chat;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.text.TextUtils;
import et.AbstractC18594a;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Map;
import me0.AbstractC23136l9;
import p304ks.AbstractC21935u;
import p363nh.C23744a;
import p588vw.C28652r;
import se0.AbstractC26237b;

/* renamed from: com.zing.zalo.ui.widget.chat.x */
/* loaded from: classes6.dex */
public class C13605x {

    /* renamed from: c0 */
    public static final float f70120c0 = (AbstractC23136l9.m118722k0() * 6.0f) / 100.0f;

    /* renamed from: d0 */
    private static final float[] f70121d0 = {0.0f, 1.0f, 0.1f};

    /* renamed from: e0 */
    public static final int f70122e0 = AbstractC23136l9.m118742r(7.0f);

    /* renamed from: f0 */
    public static final int f70123f0 = AbstractC23136l9.m118742r(48.0f);

    /* renamed from: g0 */
    public static final float f70124g0 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: h0 */
    public static final int f70125h0 = AbstractC23136l9.m118742r(50.0f);

    /* renamed from: A */
    private final float f70126A;

    /* renamed from: B */
    private int f70127B;

    /* renamed from: C */
    private int f70128C;

    /* renamed from: D */
    private int f70129D;

    /* renamed from: E */
    private int f70130E;

    /* renamed from: F */
    private boolean f70131F;

    /* renamed from: G */
    private FloatBuffer f70132G;

    /* renamed from: H */
    private FloatBuffer f70133H;

    /* renamed from: I */
    private ShortBuffer f70134I;

    /* renamed from: J */
    private final FloatBuffer f70135J;

    /* renamed from: K */
    private final FloatBuffer f70136K;

    /* renamed from: L */
    private short[] f70137L;

    /* renamed from: M */
    private RectF f70138M;

    /* renamed from: N */
    private float f70139N;

    /* renamed from: O */
    public boolean f70140O;

    /* renamed from: P */
    public boolean f70141P;

    /* renamed from: Q */
    private int f70142Q;

    /* renamed from: R */
    public float f70143R;

    /* renamed from: S */
    private boolean f70144S;

    /* renamed from: T */
    private String f70145T;

    /* renamed from: U */
    private int f70146U;

    /* renamed from: V */
    private int f70147V;

    /* renamed from: W */
    public String f70148W;

    /* renamed from: X */
    public String f70149X;

    /* renamed from: Y */
    public boolean f70150Y;

    /* renamed from: Z */
    public String f70151Z;

    /* renamed from: a */
    private final Map f70152a;

    /* renamed from: a0 */
    public String f70153a0;

    /* renamed from: b */
    private final a f70154b;

    /* renamed from: b0 */
    public String f70155b0;

    /* renamed from: c */
    private float f70156c;

    /* renamed from: d */
    private float f70157d;

    /* renamed from: e */
    private float f70158e;

    /* renamed from: f */
    private float f70159f;

    /* renamed from: g */
    private final float[] f70160g;

    /* renamed from: h */
    private float f70161h;

    /* renamed from: i */
    private float f70162i;

    /* renamed from: j */
    public float f70163j;

    /* renamed from: k */
    public float f70164k;

    /* renamed from: l */
    private float f70165l;

    /* renamed from: m */
    private float f70166m;

    /* renamed from: n */
    private float f70167n;

    /* renamed from: o */
    private float f70168o;

    /* renamed from: p */
    private float f70169p;

    /* renamed from: q */
    private double f70170q;

    /* renamed from: r */
    private double f70171r;

    /* renamed from: s */
    private double f70172s;

    /* renamed from: t */
    private double f70173t;

    /* renamed from: u */
    private double f70174u;

    /* renamed from: v */
    private double f70175v;

    /* renamed from: w */
    private float f70176w;

    /* renamed from: x */
    private float f70177x;

    /* renamed from: y */
    private float f70178y;

    /* renamed from: z */
    private float f70179z;

    /* renamed from: com.zing.zalo.ui.widget.chat.x$a */
    /* loaded from: classes6.dex */
    public interface a {
        /* renamed from: e */
        void mo76117e(String str);

        /* renamed from: j */
        void mo76118j(String str, String str2, String str3);

        /* renamed from: k */
        void mo76119k(String str, String str2, String str3);

        /* renamed from: l */
        void mo76120l(String str, int i11);
    }

    public C13605x(Map map, a aVar) {
        this(0, 0, 1.0f, 0.0f, map, aVar);
    }

    /* renamed from: c */
    private int m76160c() {
        synchronized (this.f70152a) {
            try {
                if (this.f70152a.containsKey(this.f70148W)) {
                    return ((Integer) this.f70152a.get(this.f70148W)).intValue();
                }
                if (this.f70142Q == 6) {
                    a aVar = this.f70154b;
                    if (aVar != null) {
                        aVar.mo76117e(this.f70148W);
                    }
                    return -1;
                }
                Bitmap m98199f = AbstractC18594a.m98199f(this.f70148W);
                int m98198e = AbstractC18594a.m98198e(m98199f, null);
                m98199f.recycle();
                this.f70152a.put(this.f70148W, Integer.valueOf(m98198e));
                return m98198e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    private float[] m76161d() {
        RectF rectF = this.f70138M;
        float f11 = rectF.left;
        float f12 = this.f70165l;
        float f13 = f11 * f12;
        this.f70156c = f13;
        float f14 = rectF.right * f12;
        this.f70157d = f14;
        float f15 = rectF.bottom * f12;
        this.f70158e = f15;
        float f16 = rectF.top * f12;
        this.f70159f = f16;
        float[] fArr = this.f70160g;
        float f17 = this.f70163j;
        fArr[0] = f13 + f17;
        float f18 = this.f70164k;
        fArr[1] = f16 + f18;
        fArr[2] = f13 + f17;
        fArr[3] = f15 + f18;
        fArr[4] = f14 + f17;
        fArr[5] = f15 + f18;
        fArr[6] = f14 + f17;
        fArr[7] = f16 + f18;
        return fArr;
    }

    /* renamed from: e */
    private float[] m76162e() {
        int i11 = f70122e0;
        float f11 = -i11;
        this.f70156c = f11;
        float f12 = i11;
        this.f70157d = f12;
        float f13 = -i11;
        this.f70158e = f13;
        float f14 = i11;
        this.f70159f = f14;
        float[] fArr = this.f70160g;
        float f15 = this.f70163j;
        float f16 = f70124g0;
        float f17 = this.f70165l;
        fArr[0] = ((f11 + f15) - f16) - ((f17 * 72.0f) / 2.0f);
        float f18 = this.f70164k;
        fArr[1] = f14 + f18;
        fArr[2] = ((f11 + f15) - f16) - ((f17 * 72.0f) / 2.0f);
        fArr[3] = f13 + f18;
        fArr[4] = ((f12 + f15) - f16) - ((f17 * 72.0f) / 2.0f);
        fArr[5] = f13 + f18;
        fArr[6] = ((f12 + f15) - f16) - ((f17 * 72.0f) / 2.0f);
        fArr[7] = f14 + f18;
        return fArr;
    }

    /* renamed from: f */
    private float[] m76163f() {
        this.f70156c = 0.0f;
        float f11 = this.f70143R;
        float f12 = this.f70165l;
        float f13 = f11 * f12;
        this.f70157d = f13;
        this.f70158e = 0.0f;
        float f14 = f11 * f12;
        this.f70159f = f14;
        float[] fArr = this.f70160g;
        float f15 = this.f70163j;
        fArr[0] = 0.0f + f15;
        float f16 = this.f70164k;
        fArr[1] = f14 + f16;
        fArr[2] = 0.0f + f15;
        fArr[3] = 0.0f + f16;
        fArr[4] = f13 + f15;
        fArr[5] = 0.0f + f16;
        fArr[6] = f13 + f15;
        fArr[7] = f14 + f16;
        return fArr;
    }

    /* renamed from: g */
    private float[] m76164g() {
        this.f70156c = 0.0f;
        int i11 = f70123f0;
        float f11 = i11 * 5;
        this.f70157d = f11;
        this.f70158e = 0.0f;
        float f12 = i11;
        this.f70159f = f12;
        float[] fArr = this.f70160g;
        float f13 = this.f70163j;
        fArr[0] = 0.0f + f13;
        float f14 = this.f70164k;
        fArr[1] = f12 + f14;
        fArr[2] = 0.0f + f13;
        fArr[3] = 0.0f + f14;
        fArr[4] = f11 + f13;
        fArr[5] = 0.0f + f14;
        fArr[6] = f11 + f13;
        fArr[7] = f12 + f14;
        return fArr;
    }

    /* renamed from: h */
    private void m76165h() {
        this.f70131F = true;
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.f70137L = sArr;
        this.f70134I = AbstractC26237b.m134919d(sArr);
        float[] m76161d = m76161d();
        this.f70132G = AbstractC26237b.m134917b(m76161d.length);
        this.f70133H = AbstractC26237b.m134917b(m76161d.length);
    }

    /* renamed from: v */
    private FloatBuffer m76166v() {
        this.f70132G.clear();
        this.f70132G.put(m76161d());
        this.f70132G.position(0);
        return this.f70132G;
    }

    /* renamed from: w */
    private FloatBuffer m76167w() {
        this.f70133H.clear();
        int i11 = this.f70142Q;
        if (i11 == 8) {
            this.f70133H.put(m76164g());
        } else if (i11 != 9 && i11 != 10) {
            this.f70133H.put(m76162e());
        } else {
            this.f70133H.put(m76163f());
        }
        this.f70133H.position(0);
        return this.f70133H;
    }

    /* renamed from: a */
    public boolean m76168a(float f11, float f12, int i11) {
        if (!this.f70140O || this.f70138M == null) {
            return false;
        }
        double radians = Math.toRadians(-this.f70126A);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f13 = f11 - this.f70163j;
        float f14 = f12 - this.f70164k;
        float f15 = (f13 * cos) - (f14 * sin);
        float f16 = (f13 * sin) + (f14 * cos);
        RectF rectF = this.f70138M;
        float f17 = rectF.left;
        float f18 = this.f70165l;
        float f19 = i11;
        if (f15 <= (f17 * f18) - f19 || f15 >= (rectF.right * f18) + f19 || f16 <= (rectF.bottom * f18) - f19 || f16 >= (rectF.top * f18) + f19) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m76169b() {
        this.f70140O = false;
        this.f70141P = false;
    }

    /* renamed from: i */
    public boolean m76170i() {
        float abs = Math.abs(this.f70163j - this.f70176w);
        int i11 = f70125h0;
        if (abs < i11 && Math.abs(this.f70164k - this.f70177x) < i11) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x042f A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0011, B:9:0x0015, B:10:0x001c, B:12:0x0020, B:27:0x0040, B:29:0x007f, B:33:0x00a4, B:34:0x009f, B:35:0x042b, B:37:0x042f, B:39:0x0437, B:40:0x0439, B:65:0x04b7, B:67:0x04b8, B:71:0x04c2, B:73:0x04d8, B:74:0x04e7, B:76:0x04eb, B:77:0x04f3, B:79:0x04f7, B:81:0x04fb, B:82:0x0502, B:83:0x0508, B:85:0x0510, B:86:0x0542, B:88:0x0546, B:95:0x0570, B:96:0x057f, B:98:0x0578, B:102:0x00b1, B:104:0x00ce, B:106:0x00d9, B:108:0x00e0, B:109:0x0141, B:110:0x00e4, B:112:0x00ec, B:113:0x00f1, B:115:0x00f7, B:118:0x010a, B:120:0x0115, B:122:0x011c, B:123:0x0120, B:125:0x0128, B:126:0x012d, B:128:0x0133, B:131:0x0153, B:133:0x0180, B:134:0x019b, B:136:0x01a4, B:138:0x01b5, B:139:0x01ba, B:142:0x01c1, B:144:0x0193, B:147:0x01ce, B:149:0x01fb, B:150:0x0216, B:152:0x0221, B:153:0x0259, B:155:0x0261, B:157:0x023a, B:159:0x0241, B:161:0x0251, B:162:0x0256, B:163:0x020e, B:166:0x026b, B:168:0x0298, B:169:0x02b3, B:171:0x02cb, B:172:0x02f2, B:174:0x02fa, B:176:0x02e4, B:177:0x02ab, B:178:0x0300, B:180:0x032d, B:181:0x034b, B:183:0x0356, B:185:0x033d, B:187:0x0345, B:188:0x035c, B:190:0x039c, B:192:0x03a9, B:193:0x03af, B:194:0x03b8, B:196:0x03e5, B:197:0x0400, B:199:0x0406, B:200:0x041f, B:202:0x0425, B:204:0x0417, B:205:0x03f8, B:42:0x043a, B:44:0x043e, B:46:0x0459, B:47:0x04b4, B:50:0x046a, B:52:0x046e, B:54:0x0478, B:55:0x0484, B:56:0x0490, B:58:0x049a, B:59:0x04ab, B:61:0x04af), top: B:2:0x0006, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04f7 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0011, B:9:0x0015, B:10:0x001c, B:12:0x0020, B:27:0x0040, B:29:0x007f, B:33:0x00a4, B:34:0x009f, B:35:0x042b, B:37:0x042f, B:39:0x0437, B:40:0x0439, B:65:0x04b7, B:67:0x04b8, B:71:0x04c2, B:73:0x04d8, B:74:0x04e7, B:76:0x04eb, B:77:0x04f3, B:79:0x04f7, B:81:0x04fb, B:82:0x0502, B:83:0x0508, B:85:0x0510, B:86:0x0542, B:88:0x0546, B:95:0x0570, B:96:0x057f, B:98:0x0578, B:102:0x00b1, B:104:0x00ce, B:106:0x00d9, B:108:0x00e0, B:109:0x0141, B:110:0x00e4, B:112:0x00ec, B:113:0x00f1, B:115:0x00f7, B:118:0x010a, B:120:0x0115, B:122:0x011c, B:123:0x0120, B:125:0x0128, B:126:0x012d, B:128:0x0133, B:131:0x0153, B:133:0x0180, B:134:0x019b, B:136:0x01a4, B:138:0x01b5, B:139:0x01ba, B:142:0x01c1, B:144:0x0193, B:147:0x01ce, B:149:0x01fb, B:150:0x0216, B:152:0x0221, B:153:0x0259, B:155:0x0261, B:157:0x023a, B:159:0x0241, B:161:0x0251, B:162:0x0256, B:163:0x020e, B:166:0x026b, B:168:0x0298, B:169:0x02b3, B:171:0x02cb, B:172:0x02f2, B:174:0x02fa, B:176:0x02e4, B:177:0x02ab, B:178:0x0300, B:180:0x032d, B:181:0x034b, B:183:0x0356, B:185:0x033d, B:187:0x0345, B:188:0x035c, B:190:0x039c, B:192:0x03a9, B:193:0x03af, B:194:0x03b8, B:196:0x03e5, B:197:0x0400, B:199:0x0406, B:200:0x041f, B:202:0x0425, B:204:0x0417, B:205:0x03f8, B:42:0x043a, B:44:0x043e, B:46:0x0459, B:47:0x04b4, B:50:0x046a, B:52:0x046e, B:54:0x0478, B:55:0x0484, B:56:0x0490, B:58:0x049a, B:59:0x04ab, B:61:0x04af), top: B:2:0x0006, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0510 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0011, B:9:0x0015, B:10:0x001c, B:12:0x0020, B:27:0x0040, B:29:0x007f, B:33:0x00a4, B:34:0x009f, B:35:0x042b, B:37:0x042f, B:39:0x0437, B:40:0x0439, B:65:0x04b7, B:67:0x04b8, B:71:0x04c2, B:73:0x04d8, B:74:0x04e7, B:76:0x04eb, B:77:0x04f3, B:79:0x04f7, B:81:0x04fb, B:82:0x0502, B:83:0x0508, B:85:0x0510, B:86:0x0542, B:88:0x0546, B:95:0x0570, B:96:0x057f, B:98:0x0578, B:102:0x00b1, B:104:0x00ce, B:106:0x00d9, B:108:0x00e0, B:109:0x0141, B:110:0x00e4, B:112:0x00ec, B:113:0x00f1, B:115:0x00f7, B:118:0x010a, B:120:0x0115, B:122:0x011c, B:123:0x0120, B:125:0x0128, B:126:0x012d, B:128:0x0133, B:131:0x0153, B:133:0x0180, B:134:0x019b, B:136:0x01a4, B:138:0x01b5, B:139:0x01ba, B:142:0x01c1, B:144:0x0193, B:147:0x01ce, B:149:0x01fb, B:150:0x0216, B:152:0x0221, B:153:0x0259, B:155:0x0261, B:157:0x023a, B:159:0x0241, B:161:0x0251, B:162:0x0256, B:163:0x020e, B:166:0x026b, B:168:0x0298, B:169:0x02b3, B:171:0x02cb, B:172:0x02f2, B:174:0x02fa, B:176:0x02e4, B:177:0x02ab, B:178:0x0300, B:180:0x032d, B:181:0x034b, B:183:0x0356, B:185:0x033d, B:187:0x0345, B:188:0x035c, B:190:0x039c, B:192:0x03a9, B:193:0x03af, B:194:0x03b8, B:196:0x03e5, B:197:0x0400, B:199:0x0406, B:200:0x041f, B:202:0x0425, B:204:0x0417, B:205:0x03f8, B:42:0x043a, B:44:0x043e, B:46:0x0459, B:47:0x04b4, B:50:0x046a, B:52:0x046e, B:54:0x0478, B:55:0x0484, B:56:0x0490, B:58:0x049a, B:59:0x04ab, B:61:0x04af), top: B:2:0x0006, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0546 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0011, B:9:0x0015, B:10:0x001c, B:12:0x0020, B:27:0x0040, B:29:0x007f, B:33:0x00a4, B:34:0x009f, B:35:0x042b, B:37:0x042f, B:39:0x0437, B:40:0x0439, B:65:0x04b7, B:67:0x04b8, B:71:0x04c2, B:73:0x04d8, B:74:0x04e7, B:76:0x04eb, B:77:0x04f3, B:79:0x04f7, B:81:0x04fb, B:82:0x0502, B:83:0x0508, B:85:0x0510, B:86:0x0542, B:88:0x0546, B:95:0x0570, B:96:0x057f, B:98:0x0578, B:102:0x00b1, B:104:0x00ce, B:106:0x00d9, B:108:0x00e0, B:109:0x0141, B:110:0x00e4, B:112:0x00ec, B:113:0x00f1, B:115:0x00f7, B:118:0x010a, B:120:0x0115, B:122:0x011c, B:123:0x0120, B:125:0x0128, B:126:0x012d, B:128:0x0133, B:131:0x0153, B:133:0x0180, B:134:0x019b, B:136:0x01a4, B:138:0x01b5, B:139:0x01ba, B:142:0x01c1, B:144:0x0193, B:147:0x01ce, B:149:0x01fb, B:150:0x0216, B:152:0x0221, B:153:0x0259, B:155:0x0261, B:157:0x023a, B:159:0x0241, B:161:0x0251, B:162:0x0256, B:163:0x020e, B:166:0x026b, B:168:0x0298, B:169:0x02b3, B:171:0x02cb, B:172:0x02f2, B:174:0x02fa, B:176:0x02e4, B:177:0x02ab, B:178:0x0300, B:180:0x032d, B:181:0x034b, B:183:0x0356, B:185:0x033d, B:187:0x0345, B:188:0x035c, B:190:0x039c, B:192:0x03a9, B:193:0x03af, B:194:0x03b8, B:196:0x03e5, B:197:0x0400, B:199:0x0406, B:200:0x041f, B:202:0x0425, B:204:0x0417, B:205:0x03f8, B:42:0x043a, B:44:0x043e, B:46:0x0459, B:47:0x04b4, B:50:0x046a, B:52:0x046e, B:54:0x0478, B:55:0x0484, B:56:0x0490, B:58:0x049a, B:59:0x04ab, B:61:0x04af), top: B:2:0x0006, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m76171j(int i11, int i12, int[] iArr) {
        try {
            if (!this.f70140O || iArr[this.f70130E] == -1) {
                return;
            }
            if (!this.f70131F) {
                m76165h();
            }
            if (!this.f70131F) {
                return;
            }
            int i13 = this.f70142Q;
            if (i13 != 0 && i13 != 2) {
                if (i13 != 4 && i13 != 7 && i13 != 11 && i13 != 12) {
                    if (i13 == 5) {
                        this.f70127B++;
                        this.f70173t *= this.f70171r;
                        this.f70161h = (float) (this.f70161h + (Math.cos(this.f70170q) * this.f70173t));
                        float sin = (float) (this.f70162i + (Math.sin(this.f70170q) * this.f70173t));
                        this.f70162i = sin;
                        this.f70163j = i11 + this.f70161h;
                        float f11 = i12 + sin;
                        this.f70164k = f11;
                        int i14 = this.f70127B;
                        if (i14 > this.f70129D) {
                            int i15 = this.f70128C;
                            this.f70139N = (i15 - i14) / (i15 - r4);
                            double d11 = this.f70174u * this.f70172s;
                            this.f70174u = d11;
                            this.f70162i = (float) (sin - d11);
                            if (i14 > i15 || f11 < -72.0f) {
                                m76169b();
                                this.f70139N = 0.0f;
                            }
                            this.f70165l = this.f70166m * this.f70139N;
                        }
                    } else if (i13 == 6) {
                        double d12 = this.f70173t * this.f70171r;
                        this.f70173t = d12;
                        double d13 = this.f70170q + d12;
                        this.f70170q = d13;
                        if (d12 > 0.0d) {
                            float[] fArr = f70121d0;
                            int i16 = this.f70127B;
                            if (d13 >= fArr[i16]) {
                                int i17 = i16 + 1;
                                this.f70127B = i17;
                                if (i17 >= fArr.length) {
                                    m76169b();
                                } else {
                                    float f12 = fArr[i17];
                                    if (f12 > fArr[i16]) {
                                        this.f70173t = 0.08d;
                                        this.f70171r = 0.96d;
                                    } else if (f12 < fArr[i16]) {
                                        this.f70173t = -0.002d;
                                        this.f70171r = 1.05d;
                                    }
                                }
                                this.f70165l = (float) (this.f70170q * this.f70166m);
                            }
                        }
                        if (d12 < 0.0d) {
                            float[] fArr2 = f70121d0;
                            int i18 = this.f70127B;
                            if (d13 <= fArr2[i18]) {
                                int i19 = i18 + 1;
                                this.f70127B = i19;
                                if (i19 >= fArr2.length) {
                                    m76169b();
                                } else {
                                    float f13 = fArr2[i19];
                                    if (f13 > fArr2[i18]) {
                                        this.f70173t = 0.08d;
                                        this.f70171r = 0.96d;
                                    } else if (f13 < fArr2[i18]) {
                                        this.f70173t = -0.002d;
                                        this.f70171r = 1.05d;
                                    }
                                }
                            }
                        }
                        this.f70165l = (float) (this.f70170q * this.f70166m);
                    } else if (i13 == 8) {
                        float f14 = (float) (this.f70162i + this.f70173t);
                        this.f70162i = f14;
                        this.f70164k = this.f70177x + f14;
                        float f15 = this.f70176w + this.f70169p;
                        this.f70176w = f15;
                        this.f70163j = (float) (f15 + (this.f70167n * Math.cos(this.f70170q)));
                        float f16 = this.f70164k;
                        if (f16 < this.f70179z) {
                            this.f70162i = (float) (this.f70162i + (((r3 - f16) / (r3 - this.f70177x)) * this.f70175v));
                        } else {
                            this.f70170q += this.f70161h;
                        }
                        float f17 = this.f70168o;
                        if (f16 > (f17 * 2.0f) / 3.0f) {
                            float f18 = (f16 - ((2.0f * f17) / 3.0f)) / (f17 - ((f17 * 2.0f) / 3.0f));
                            if (f18 <= 1.0f) {
                                this.f70139N = 1.0f - f18;
                            } else {
                                this.f70139N = 0.0f;
                            }
                        }
                        if (f16 > f17) {
                            m76169b();
                            this.f70147V = -1;
                            return;
                        }
                    } else if (i13 == 10) {
                        float f19 = (float) (this.f70162i + this.f70173t);
                        this.f70162i = f19;
                        this.f70164k = this.f70177x + f19;
                        float f21 = this.f70176w + this.f70169p;
                        this.f70176w = f21;
                        this.f70163j = (float) (f21 + (this.f70167n * Math.cos(this.f70170q)));
                        float f22 = this.f70164k;
                        if (f22 < this.f70179z) {
                            this.f70162i = (float) (this.f70162i + (((r3 - f22) / (r3 - this.f70177x)) * this.f70175v));
                        } else {
                            this.f70170q += this.f70161h;
                        }
                        float f23 = this.f70168o;
                        if (f22 > (f23 / 2.0f) + this.f70161h) {
                            C23744a.m124114c().m124116d(60063, this.f70149X, 1000);
                        } else if (f22 > (f23 * 2.0f) / 3.0f) {
                            float f24 = (f22 - ((f23 * 2.0f) / 3.0f)) / (f23 - ((f23 * 2.0f) / 3.0f));
                            if (f24 <= 1.0f) {
                                this.f70139N = 1.0f - f24;
                            } else {
                                this.f70139N = 0.0f;
                            }
                        }
                        if (this.f70164k > this.f70168o) {
                            m76169b();
                            this.f70147V = -1;
                            return;
                        }
                    } else if (i13 == 9) {
                        float f25 = (float) (this.f70162i + this.f70173t);
                        this.f70162i = f25;
                        this.f70164k = this.f70177x + f25;
                        float f26 = this.f70176w + this.f70169p;
                        this.f70176w = f26;
                        this.f70163j = (float) (f26 + (this.f70167n * Math.cos(this.f70170q)));
                        float f27 = this.f70164k;
                        if (f27 < this.f70179z) {
                            this.f70162i = (float) (this.f70162i + (((r2 - f27) / (r2 - this.f70177x)) * this.f70175v));
                        } else {
                            this.f70170q += this.f70161h;
                        }
                        float f28 = (this.f70166m - 1.0f) * f27;
                        float f29 = this.f70168o;
                        this.f70165l = ((f28 / f29) * 2.0f) + 1.0f;
                        if (f27 > (f29 / 2.0f) + this.f70161h) {
                            C23744a.m124114c().m124116d(60063, this.f70149X, 1001);
                        } else {
                            this.f70139N = Math.min((f27 / (f29 / 2.0f)) + 0.2f, 1.0f);
                        }
                        if (this.f70164k > this.f70168o) {
                            m76169b();
                            this.f70147V = -1;
                            return;
                        }
                    } else {
                        double d14 = this.f70173t * this.f70171r;
                        this.f70173t = d14;
                        this.f70163j = (float) (this.f70163j - d14);
                        double d15 = this.f70170q + this.f70161h;
                        this.f70170q = d15;
                        this.f70164k = i12 + ((float) (this.f70168o * Math.cos(d15)));
                        float f31 = this.f70163j;
                        float f32 = this.f70178y;
                        if (f31 > f32) {
                            float f33 = this.f70167n;
                            this.f70165l = ((f33 - f31) / (f33 - f32)) * (this.f70166m + 0.5f);
                        } else {
                            float f34 = this.f70165l;
                            if (f34 > this.f70166m) {
                                this.f70165l = f34 - 0.07f;
                            }
                        }
                        if (f31 < (-this.f70138M.width())) {
                            m76169b();
                            this.f70147V = -1;
                            return;
                        }
                    }
                    if (this.f70147V < 0) {
                        if (TextUtils.isEmpty(this.f70145T)) {
                            int i21 = this.f70142Q;
                            if (i21 == 9 || i21 == 10) {
                                String format = String.format("story_reaction_%s", this.f70155b0);
                                if (this.f70152a.containsKey(format)) {
                                    this.f70147V = ((Integer) this.f70152a.get(format)).intValue();
                                } else {
                                    a aVar = this.f70154b;
                                    if (aVar != null) {
                                        aVar.mo76120l(this.f70155b0, (int) this.f70143R);
                                    }
                                }
                            }
                        } else {
                            synchronized (this.f70152a) {
                                try {
                                    if (this.f70142Q == 8) {
                                        String format2 = String.format("story_viewer_%1$s_%2$s", this.f70153a0, this.f70145T);
                                        if (this.f70152a.containsKey(format2)) {
                                            this.f70147V = ((Integer) this.f70152a.get(format2)).intValue();
                                        } else if (this.f70154b != null) {
                                            if (AbstractC21935u.m114557x(this.f70153a0, this.f70145T)) {
                                                this.f70154b.mo76119k(this.f70153a0, this.f70145T, this.f70151Z);
                                            } else {
                                                this.f70154b.mo76118j(this.f70153a0, this.f70145T, this.f70151Z);
                                            }
                                        }
                                    } else if (this.f70152a.containsKey(this.f70145T)) {
                                        this.f70147V = ((Integer) this.f70152a.get(this.f70145T)).intValue();
                                    } else {
                                        a aVar2 = this.f70154b;
                                        if (aVar2 != null) {
                                            aVar2.mo76117e(this.f70145T);
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                    if (this.f70146U < 0) {
                        if (this.f70144S) {
                            this.f70146U = m76160c();
                        } else {
                            this.f70146U = iArr[this.f70130E];
                        }
                    }
                    if (this.f70146U >= 0) {
                        GLES20.glVertexAttribPointer(C13606y.f70183f, 2, 5126, false, 0, (Buffer) this.f70135J);
                        GLES20.glVertexAttribPointer(C13606y.f70182e, 2, 5126, false, 0, (Buffer) m76166v());
                        GLES20.glUniform1f(C13606y.f70185h, this.f70139N);
                        GLES20.glBindTexture(3553, this.f70146U);
                        GLES20.glDrawElements(4, this.f70137L.length, 5123, this.f70134I);
                    }
                    if (this.f70147V >= 0) {
                        GLES20.glVertexAttribPointer(C13606y.f70183f, 2, 5126, false, 0, (Buffer) this.f70136K);
                        GLES20.glVertexAttribPointer(C13606y.f70182e, 2, 5126, false, 0, (Buffer) m76167w());
                        int i22 = this.f70142Q;
                        if (i22 != 8 && i22 != 9 && i22 != 10) {
                            GLES20.glUniform1f(C13606y.f70185h, 1.0f);
                            GLES20.glBindTexture(3553, this.f70147V);
                            GLES20.glDrawElements(4, this.f70137L.length, 5123, this.f70134I);
                            return;
                        }
                        GLES20.glUniform1f(C13606y.f70185h, this.f70139N);
                        GLES20.glBindTexture(3553, this.f70147V);
                        GLES20.glDrawElements(4, this.f70137L.length, 5123, this.f70134I);
                        return;
                    }
                    return;
                }
                this.f70127B++;
                this.f70173t *= this.f70171r;
                this.f70161h = (float) (this.f70161h + (Math.cos(this.f70170q) * this.f70173t));
                float sin2 = (float) (this.f70162i + (Math.sin(this.f70170q) * this.f70173t));
                this.f70162i = sin2;
                this.f70163j = i11 + this.f70161h;
                this.f70164k = i12 + sin2;
                int i23 = this.f70127B;
                if (i23 > this.f70129D) {
                    int i24 = this.f70128C;
                    this.f70139N = (i24 - i23) / (i24 - r2);
                    if (i23 > i24) {
                        m76169b();
                        this.f70139N = 0.0f;
                    }
                    this.f70165l = this.f70166m * this.f70139N;
                }
                if (this.f70147V < 0) {
                }
                if (this.f70146U < 0) {
                }
                if (this.f70146U >= 0) {
                }
                if (this.f70147V >= 0) {
                }
            }
            float f35 = (float) (this.f70162i + this.f70173t);
            this.f70162i = f35;
            this.f70164k = this.f70177x + f35;
            float f36 = this.f70176w - this.f70169p;
            this.f70176w = f36;
            this.f70163j = (float) (f36 + (this.f70167n * Math.cos(this.f70170q)));
            float f37 = this.f70164k;
            if (f37 < this.f70179z) {
                this.f70162i = (float) (this.f70162i + (((r2 - f37) / (r2 - this.f70177x)) * this.f70175v));
            } else {
                this.f70170q += this.f70161h;
            }
            float f38 = this.f70178y;
            if (f37 < f38) {
                float f39 = this.f70177x;
                this.f70165l = ((f37 - f39) / (f38 - f39)) * this.f70166m;
                this.f70139N = 1.0f;
            } else {
                this.f70165l = this.f70166m;
                this.f70139N = 1.0f;
            }
            if (f37 > this.f70168o) {
                m76169b();
                this.f70147V = -1;
                return;
            }
            if (this.f70147V < 0) {
            }
            if (this.f70146U < 0) {
            }
            if (this.f70146U >= 0) {
            }
            if (this.f70147V >= 0) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public void m76172k() {
        this.f70146U = -1;
        this.f70147V = -1;
    }

    /* renamed from: l */
    public void m76173l(int i11, int i12) {
        this.f70139N = 1.0f;
        this.f70166m = (i11 * 0.25f) / 72.0f;
        this.f70170q = f70121d0[0];
        this.f70173t = 0.07d;
        this.f70171r = 0.96d;
        this.f70127B = 1;
        this.f70163j = i11 / 2;
        this.f70164k = i12 / 2;
        this.f70140O = true;
    }

    /* renamed from: m */
    public void m76174m(int i11, int i12, int i13, int i14) {
        float f11 = i13;
        this.f70167n = f11 / 12.0f;
        this.f70168o = AbstractC23136l9.m118713h0() + 72;
        this.f70176w = i11;
        this.f70177x = i12;
        this.f70139N = 0.0f;
        this.f70140O = true;
        this.f70170q = 1.5707963267948966d;
        this.f70161h = (float) ((Math.random() * 3.141592653589793d) / 150.0d);
        float f12 = i14;
        double d11 = i14;
        this.f70178y = (f12 / 12.0f) + ((float) ((Math.random() * d11) / 20.0d)) + this.f70177x;
        this.f70179z = (f12 / 2.5f) + ((float) ((Math.random() * d11) / 5.0d)) + this.f70177x;
        float f13 = f70120c0 / 72.0f;
        this.f70166m = f13;
        int i15 = this.f70142Q;
        if (i15 == 2 || i15 == 3) {
            this.f70166m = f13 + 0.3f;
        }
        this.f70166m = (this.f70166m * this.f70143R) / 100.0f;
        if (i15 == 8) {
            this.f70173t = (f12 / 600.0f) + ((Math.random() * d11) / 1000.0d);
            this.f70175v = f12 / 160.0f;
            this.f70169p = (float) Math.random();
            this.f70139N = 1.0f;
            this.f70166m = 1.0f;
            this.f70165l = 1.0f;
        } else if (i15 == 10) {
            this.f70173t = (f12 / 600.0f) + ((Math.random() * d11) / 1000.0d);
            this.f70175v = f12 / 160.0f;
            if (Math.round(Math.random()) == 0) {
                this.f70169p = -((float) (Math.random() * AbstractC23136l9.m118742r(2.0f)));
            } else {
                this.f70169p = (float) (Math.random() * AbstractC23136l9.m118742r(2.0f));
            }
            this.f70139N = 1.0f;
            this.f70166m = 1.0f;
            this.f70165l = 1.0f;
        } else if (i15 == 9) {
            this.f70173t = (f12 / 300.0f) + ((Math.random() * d11) / 800.0d);
            this.f70175v = f12 / 80.0f;
            float f14 = f11 / 2.0f;
            this.f70167n = f14;
            float abs = Math.abs(this.f70176w - f14);
            if (this.f70176w < f14) {
                this.f70169p = (AbstractC23136l9.m118742r(8.0f) * abs) / f11;
            } else {
                this.f70169p = ((-AbstractC23136l9.m118742r(8.0f)) * abs) / f11;
            }
            this.f70139N = 1.0f;
            this.f70166m = 5.0f;
        } else {
            this.f70173t = (f12 / 300.0f) + ((Math.random() * d11) / 1000.0d);
            this.f70175v = f12 / 80.0f;
            this.f70169p = (float) (((-i13) / 1000.0f) + ((i13 * Math.random()) / 200.0d));
        }
        this.f70162i = 0.0f;
        this.f70163j = this.f70176w;
        this.f70164k = this.f70177x;
    }

    /* renamed from: n */
    public void m76175n(Rect rect) {
        if (rect != null) {
            float width = rect.width();
            this.f70163j = width;
            this.f70167n = width;
            this.f70168o = rect.height() / 4.0f;
            this.f70170q = Math.random() * 3.141592653589793d;
            this.f70161h = (float) (((Math.random() - 0.5d) * 3.141592653589793d) / 100.0d);
            this.f70139N = 1.0f;
            this.f70166m = f70120c0 / 72.0f;
            this.f70178y = rect.width() - (rect.width() / 20);
            int i11 = this.f70142Q;
            if (i11 == 2 || i11 == 3) {
                this.f70166m += 0.3f;
            }
            this.f70166m = (this.f70166m * this.f70143R) / 100.0f;
            this.f70173t = (float) ((rect.width() / 250.0f) + ((Math.random() * rect.width()) / 450.0d));
            this.f70171r = 1.0099999904632568d;
            this.f70140O = true;
        }
    }

    /* renamed from: o */
    public void m76176o(Rect rect, double d11, boolean z11) {
        if (rect != null) {
            int i11 = this.f70142Q;
            if (i11 == 7) {
                this.f70170q = d11;
                this.f70139N = 1.0f;
                this.f70140O = true;
                this.f70176w = rect.centerX();
                this.f70177x = rect.centerY();
                float f11 = ((f70120c0 * this.f70143R) / 72.0f) / 100.0f;
                this.f70166m = f11;
                this.f70165l = f11;
                this.f70171r = 0.85d;
                int random = (int) (Math.random() * 10.0d);
                this.f70129D = random + 25;
                this.f70128C = random + 45 + ((int) (Math.random() * 15.0d));
                int max = Math.max(rect.width(), rect.height());
                if (z11) {
                    this.f70173t = (max / 30.0f) + ((Math.random() * max) / 50.0d);
                } else {
                    this.f70173t = (max / 200.0f) + ((Math.random() * max) / 45.0d);
                }
                this.f70162i = 0.0f;
                this.f70161h = 0.0f;
                this.f70127B = 0;
                return;
            }
            if (i11 == 4) {
                this.f70170q = d11;
                this.f70139N = 1.0f;
                this.f70140O = true;
                this.f70176w = rect.centerX();
                this.f70177x = rect.centerY();
                float f12 = ((f70120c0 * this.f70143R) / 72.0f) / 100.0f;
                this.f70166m = f12;
                this.f70165l = f12;
                this.f70171r = 0.85d;
                int random2 = (int) (Math.random() * 10.0d);
                this.f70129D = random2 + 25;
                this.f70128C = random2 + 45 + ((int) (Math.random() * 15.0d));
                int max2 = Math.max(rect.width(), rect.height());
                if (z11) {
                    this.f70173t = (max2 / 15.0f) + ((Math.random() * max2) / 25.0d);
                } else {
                    this.f70173t = (max2 / 50.0f) + ((Math.random() * max2) / 25.0d);
                }
                this.f70162i = 0.0f;
                this.f70161h = 0.0f;
                this.f70127B = 0;
                return;
            }
            if (i11 == 5) {
                this.f70170q = d11;
                this.f70139N = 1.0f;
                this.f70140O = true;
                this.f70176w = rect.centerX();
                this.f70177x = rect.centerY();
                float f13 = ((f70120c0 * this.f70143R) / 72.0f) / 100.0f;
                this.f70166m = f13;
                this.f70165l = f13;
                this.f70171r = 0.87d;
                this.f70172s = 1.08d;
                int random3 = (int) (Math.random() * 10.0d);
                this.f70129D = random3 + 25;
                this.f70128C = random3 + 175 + ((int) (Math.random() * 15.0d));
                int max3 = Math.max(rect.width(), rect.height());
                float f14 = max3;
                this.f70173t = (f14 / 30.0f) + ((Math.random() * max3) / 10.0d);
                this.f70174u = f14 / 500.0f;
                this.f70162i = 0.0f;
                this.f70161h = 0.0f;
                this.f70127B = 0;
                return;
            }
            if (i11 == 11 || i11 == 12) {
                this.f70170q = Math.random() * d11;
                this.f70139N = 1.0f;
                this.f70140O = true;
                this.f70176w = rect.centerX();
                this.f70177x = rect.centerY();
                float f15 = ((f70120c0 * this.f70143R) / 72.0f) / 100.0f;
                this.f70166m = f15;
                this.f70165l = f15;
                this.f70171r = 0.85d;
                int random4 = (int) (Math.random() * 10.0d);
                this.f70129D = random4 + 25;
                this.f70128C = random4 + 45 + ((int) (Math.random() * 15.0d));
                int max4 = Math.max(rect.width(), rect.height());
                if (z11) {
                    this.f70173t = (max4 / 15.0f) + ((Math.random() * max4) / 25.0d);
                } else {
                    this.f70173t = (max4 / 50.0f) + ((Math.random() * max4) / 25.0d);
                }
                this.f70162i = 0.0f;
                this.f70161h = 0.0f;
                this.f70127B = 0;
            }
        }
    }

    /* renamed from: p */
    public void m76177p() {
        double d11;
        if (this.f70140O) {
            int i11 = this.f70142Q;
            if (i11 != 0 && i11 != 2) {
                if (i11 != 4 && i11 != 7 && i11 != 11 && i11 != 12) {
                    if (i11 == 5) {
                        this.f70127B++;
                        this.f70173t *= this.f70171r;
                        this.f70161h = (float) (this.f70161h + (Math.cos(this.f70170q) * this.f70173t));
                        float sin = (float) (this.f70162i + (Math.sin(this.f70170q) * this.f70173t));
                        this.f70162i = sin;
                        int i12 = this.f70127B;
                        if (i12 > this.f70129D) {
                            int i13 = this.f70128C;
                            this.f70139N = (i13 - i12) / (i13 - r3);
                            double d12 = this.f70174u * this.f70172s;
                            this.f70174u = d12;
                            this.f70162i = (float) (sin - d12);
                            if (i12 > i13 || this.f70164k < -72.0f) {
                                m76169b();
                                this.f70139N = 0.0f;
                            }
                            this.f70165l = this.f70166m * this.f70139N;
                            return;
                        }
                        return;
                    }
                    if (i11 == 6) {
                        double d13 = this.f70173t * this.f70171r;
                        this.f70173t = d13;
                        double d14 = this.f70170q + d13;
                        this.f70170q = d14;
                        if (d13 > 0.0d) {
                            float[] fArr = f70121d0;
                            int i14 = this.f70127B;
                            if (d14 >= fArr[i14]) {
                                int i15 = i14 + 1;
                                this.f70127B = i15;
                                if (i15 >= fArr.length) {
                                    m76169b();
                                } else {
                                    float f11 = fArr[i15];
                                    if (f11 > fArr[i14]) {
                                        this.f70173t = 0.08d;
                                        this.f70171r = 0.96d;
                                    } else if (f11 < fArr[i14]) {
                                        this.f70173t = -0.0015d;
                                        this.f70171r = 1.05d;
                                    }
                                }
                                this.f70165l = (float) (this.f70170q * this.f70166m);
                                return;
                            }
                            d11 = 0.0d;
                        } else {
                            d11 = 0.0d;
                        }
                        if (d13 < d11) {
                            float[] fArr2 = f70121d0;
                            int i16 = this.f70127B;
                            if (d14 <= fArr2[i16]) {
                                int i17 = i16 + 1;
                                this.f70127B = i17;
                                if (i17 >= fArr2.length) {
                                    m76169b();
                                } else {
                                    float f12 = fArr2[i17];
                                    if (f12 > fArr2[i16]) {
                                        this.f70173t = 0.08d;
                                        this.f70171r = 0.96d;
                                    } else if (f12 < fArr2[i16]) {
                                        this.f70173t = -0.0015d;
                                        this.f70171r = 1.05d;
                                    }
                                }
                            }
                        }
                        this.f70165l = (float) (this.f70170q * this.f70166m);
                        return;
                    }
                    if (i11 == 8) {
                        float f13 = (float) (this.f70162i + this.f70173t);
                        this.f70162i = f13;
                        this.f70164k = this.f70177x + f13;
                        float f14 = this.f70176w + this.f70169p;
                        this.f70176w = f14;
                        this.f70163j = (float) (f14 + (this.f70167n * Math.cos(this.f70170q)));
                        float f15 = this.f70164k;
                        if (f15 < this.f70179z) {
                            this.f70162i = (float) (this.f70162i + (((r3 - f15) / (r3 - this.f70177x)) * this.f70175v));
                        } else {
                            this.f70170q += this.f70161h;
                        }
                        float f16 = this.f70168o;
                        if (f15 > (f16 * 2.0f) / 3.0f) {
                            float f17 = (f15 - ((2.0f * f16) / 3.0f)) / (f16 - ((f16 * 2.0f) / 3.0f));
                            if (f17 <= 1.0f) {
                                this.f70139N = 1.0f - f17;
                            } else {
                                this.f70139N = 0.0f;
                            }
                        }
                        if (f15 > f16) {
                            m76169b();
                            return;
                        }
                        return;
                    }
                    if (i11 == 10) {
                        float f18 = (float) (this.f70162i + this.f70173t);
                        this.f70162i = f18;
                        this.f70164k = this.f70177x + f18;
                        float f19 = this.f70176w + this.f70169p;
                        this.f70176w = f19;
                        this.f70163j = (float) (f19 + (this.f70167n * Math.cos(this.f70170q)));
                        float f21 = this.f70164k;
                        if (f21 < this.f70179z) {
                            this.f70162i = (float) (this.f70162i + (((r5 - f21) / (r5 - this.f70177x)) * this.f70175v));
                        } else {
                            this.f70170q += this.f70161h;
                        }
                        float f22 = this.f70168o;
                        if (f21 > (f22 / 2.0f) + this.f70161h) {
                            C23744a.m124114c().m124116d(60063, this.f70149X, 1000);
                        } else if (f21 > (f22 * 2.0f) / 3.0f) {
                            float f23 = (f21 - ((f22 * 2.0f) / 3.0f)) / (f22 - ((f22 * 2.0f) / 3.0f));
                            if (f23 <= 1.0f) {
                                this.f70139N = 1.0f - f23;
                            } else {
                                this.f70139N = 0.0f;
                            }
                        }
                        if (this.f70164k > this.f70168o) {
                            m76169b();
                            return;
                        }
                        return;
                    }
                    if (i11 == 9) {
                        float f24 = (float) (this.f70162i + this.f70173t);
                        this.f70162i = f24;
                        this.f70164k = this.f70177x + f24;
                        float f25 = this.f70176w + this.f70169p;
                        this.f70176w = f25;
                        this.f70163j = (float) (f25 + (this.f70167n * Math.cos(this.f70170q)));
                        float f26 = this.f70164k;
                        if (f26 < this.f70179z) {
                            this.f70162i = (float) (this.f70162i + (((r5 - f26) / (r5 - this.f70177x)) * this.f70175v));
                        } else {
                            this.f70170q += this.f70161h;
                        }
                        float f27 = (this.f70166m - 1.0f) * f26;
                        float f28 = this.f70168o;
                        this.f70165l = ((f27 / f28) * 2.0f) + 1.0f;
                        if (f26 > (f28 / 2.0f) + this.f70161h) {
                            C23744a.m124114c().m124116d(60063, this.f70149X, 1001);
                        } else {
                            this.f70139N = Math.min((f26 / (f28 / 2.0f)) + 0.2f, 1.0f);
                        }
                        if (this.f70164k > this.f70168o) {
                            m76169b();
                            return;
                        }
                        return;
                    }
                    double d15 = this.f70173t * this.f70171r;
                    this.f70173t = d15;
                    float f29 = (float) (this.f70163j - d15);
                    this.f70163j = f29;
                    this.f70170q += this.f70161h;
                    float f31 = this.f70178y;
                    if (f29 > f31) {
                        float f32 = this.f70167n;
                        this.f70165l = ((f32 - f29) / (f32 - f31)) * (this.f70166m + 0.5f);
                    } else {
                        float f33 = this.f70165l;
                        if (f33 > this.f70166m) {
                            this.f70165l = f33 - 0.07f;
                        }
                    }
                    if (f29 < (-this.f70138M.width())) {
                        m76169b();
                        return;
                    }
                    return;
                }
                this.f70127B++;
                this.f70173t *= this.f70171r;
                this.f70161h = (float) (this.f70161h + (Math.cos(this.f70170q) * this.f70173t));
                this.f70162i = (float) (this.f70162i + (Math.sin(this.f70170q) * this.f70173t));
                int i18 = this.f70127B;
                if (i18 > this.f70129D) {
                    int i19 = this.f70128C;
                    this.f70139N = (i19 - i18) / (i19 - r2);
                    if (i18 > i19) {
                        m76169b();
                        this.f70139N = 0.0f;
                    }
                    this.f70165l = this.f70166m * this.f70139N;
                    return;
                }
                return;
            }
            float f34 = (float) (this.f70162i + this.f70173t);
            this.f70162i = f34;
            this.f70164k = this.f70177x + f34;
            float f35 = this.f70176w - this.f70169p;
            this.f70176w = f35;
            this.f70163j = (float) (f35 + (this.f70167n * Math.cos(this.f70170q)));
            float f36 = this.f70164k;
            if (f36 < this.f70179z) {
                this.f70162i = (float) (this.f70162i + (((r3 - f36) / (r3 - this.f70177x)) * this.f70175v));
            } else {
                this.f70170q += this.f70161h;
            }
            float f37 = this.f70178y;
            if (f36 < f37) {
                float f38 = this.f70177x;
                this.f70165l = ((f36 - f38) / (f37 - f38)) * this.f70166m;
                this.f70139N = 1.0f;
            } else {
                this.f70165l = this.f70166m;
                this.f70139N = 1.0f;
            }
            if (f36 > this.f70168o) {
                m76169b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m76178q(String str) {
        this.f70145T = str;
        this.f70147V = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m76179r(String str) {
        this.f70151Z = str;
        this.f70147V = -1;
    }

    /* renamed from: s */
    public void m76180s(String str, float f11, int i11) {
        this.f70148W = str;
        this.f70146U = -1;
        this.f70142Q = i11;
        if (f11 > 0.0f) {
            this.f70143R = f11;
        } else {
            this.f70143R = 100.0f;
        }
        if (i11 != 0 && i11 != 1 && i11 != 4 && i11 != 11 && i11 != 12 && i11 != 5 && i11 != 6 && i11 != 7) {
            if (i11 == 8) {
                this.f70144S = false;
                this.f70130E = 0;
            } else if (i11 != 9 && i11 != 10) {
                this.f70135J.clear();
                this.f70135J.put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f}).position(0);
                this.f70130E = (((int) (Math.random() * 100.0d)) % AnimChat.f69964h0.length) + 1;
                this.f70144S = false;
            } else {
                this.f70144S = false;
                this.f70130E = 0;
            }
        } else {
            if (C28652r.m143349v().m143377q(str) != null) {
                float m153698a = (r10.m153698a() * 77) / C28652r.m143348p().getWidth();
                float m153699b = (r10.m153699b() * 77) / C28652r.m143348p().getHeight();
                float m153698a2 = ((r10.m153698a() * 77) + 72) / C28652r.m143348p().getWidth();
                float m153699b2 = ((r10.m153699b() * 77) + 72) / C28652r.m143348p().getHeight();
                this.f70135J.clear();
                this.f70135J.put(new float[]{m153698a, m153699b, m153698a, m153699b2, m153698a2, m153699b2, m153698a2, m153699b}).position(0);
                this.f70144S = false;
            } else {
                this.f70135J.clear();
                this.f70135J.put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f}).position(0);
                this.f70144S = true;
            }
            this.f70130E = 0;
        }
        this.f70141P = true;
    }

    /* renamed from: t */
    public void m76181t(int i11, int i12) {
        float f11 = i11 / 2.0f;
        float f12 = i12 / 2.0f;
        this.f70138M = new RectF(-f11, f12, f11, -f12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m76182u(String str) {
        this.f70153a0 = str;
        this.f70147V = -1;
    }

    public C13605x(int i11, int i12, Map map, a aVar) {
        this(i11, i12, 1.0f, 0.0f, map, aVar);
    }

    public C13605x(int i11, int i12, float f11, float f12, Map map, a aVar) {
        this.f70160g = new float[8];
        this.f70130E = 1;
        this.f70131F = false;
        this.f70139N = 0.0f;
        this.f70140O = false;
        this.f70141P = false;
        this.f70142Q = 0;
        this.f70143R = 100.0f;
        this.f70144S = false;
        this.f70146U = -1;
        this.f70147V = -1;
        this.f70148W = "";
        this.f70149X = "";
        this.f70150Y = false;
        this.f70151Z = "";
        this.f70153a0 = "";
        this.f70155b0 = "";
        this.f70152a = map;
        this.f70154b = aVar;
        this.f70176w = i11;
        this.f70177x = i12;
        this.f70165l = f11;
        this.f70126A = f12;
        this.f70135J = AbstractC26237b.m134917b(8);
        this.f70136K = AbstractC26237b.m134918c(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f});
    }
}
