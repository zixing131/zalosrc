package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class mj4 implements ij4, dc3 {

    /* renamed from: C */
    public static final c83 f24603C = c83.m20824B(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: D */
    public static final c83 f24604D = c83.m20824B(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: E */
    public static final c83 f24605E = c83.m20824B(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: F */
    public static final c83 f24606F = c83.m20824B(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: G */
    public static final c83 f24607G = c83.m20824B(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: H */
    public static final c83 f24608H = c83.m20824B(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: I */
    private static mj4 f24609I;

    /* renamed from: A */
    private long f24610A;

    /* renamed from: B */
    private long f24611B;

    /* renamed from: p */
    private final f83 f24612p;

    /* renamed from: s */
    private final w81 f24615s;

    /* renamed from: u */
    private int f24617u;

    /* renamed from: v */
    private long f24618v;

    /* renamed from: w */
    private long f24619w;

    /* renamed from: x */
    private int f24620x;

    /* renamed from: y */
    private long f24621y;

    /* renamed from: z */
    private long f24622z;

    /* renamed from: q */
    private final gj4 f24613q = new gj4();

    /* renamed from: r */
    private final bk4 f24614r = new bk4(ZAbstractBase.ZVU_PROCESS_FLUSH);

    /* renamed from: t */
    private final boolean f24616t = true;

    /* synthetic */ mj4(Context context, Map map, int i11, w81 w81Var, boolean z11, lj4 lj4Var) {
        this.f24612p = f83.m21966c(map);
        this.f24615s = w81Var;
        if (context != null) {
            wy1 m27734b = wy1.m27734b(context);
            int m27736a = m27734b.m27736a();
            this.f24620x = m27736a;
            this.f24610A = m24615e(m27736a);
            m27734b.m27737d(new kj4(this));
            return;
        }
        this.f24620x = 0;
        this.f24610A = m24615e(0);
    }

    /* renamed from: c */
    public static synchronized mj4 m24613c(Context context) {
        mj4 mj4Var;
        Context applicationContext;
        synchronized (mj4.class) {
            try {
                if (f24609I == null) {
                    if (context == null) {
                        applicationContext = null;
                    } else {
                        applicationContext = context.getApplicationContext();
                    }
                    Context context2 = applicationContext;
                    int[] m24619j = m24619j(g92.m22354l(context));
                    HashMap hashMap = new HashMap(8);
                    hashMap.put(0, 1000000L);
                    c83 c83Var = f24603C;
                    hashMap.put(2, (Long) c83Var.get(m24619j[0]));
                    hashMap.put(3, (Long) f24604D.get(m24619j[1]));
                    hashMap.put(4, (Long) f24605E.get(m24619j[2]));
                    hashMap.put(5, (Long) f24606F.get(m24619j[3]));
                    hashMap.put(10, (Long) f24607G.get(m24619j[4]));
                    hashMap.put(9, (Long) f24608H.get(m24619j[5]));
                    hashMap.put(7, (Long) c83Var.get(m24619j[0]));
                    f24609I = new mj4(context2, hashMap, ZAbstractBase.ZVU_PROCESS_FLUSH, w81.f29846a, true, null);
                }
                mj4Var = f24609I;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mj4Var;
    }

    /* renamed from: e */
    private final long m24615e(int i11) {
        Long l11 = (Long) this.f24612p.get(Integer.valueOf(i11));
        if (l11 == null) {
            l11 = (Long) this.f24612p.get(0);
        }
        if (l11 == null) {
            l11 = 1000000L;
        }
        return l11.longValue();
    }

    /* renamed from: f */
    private final void m24616f(int i11, long j11, long j12) {
        int i12;
        long j13;
        if (i11 == 0) {
            if (j11 == 0) {
                if (j12 != this.f24611B) {
                    j13 = 0;
                } else {
                    return;
                }
            } else {
                j13 = j11;
            }
            i12 = 0;
        } else {
            i12 = i11;
            j13 = j11;
        }
        this.f24611B = j12;
        this.f24613q.m22458b(i12, j13, j12);
    }

    /* renamed from: g */
    public final synchronized void m24617g(int i11) {
        int i12;
        int i13 = this.f24620x;
        if (i13 != 0 && !this.f24616t) {
            return;
        }
        if (i13 == i11) {
            return;
        }
        this.f24620x = i11;
        if (i11 != 1 && i11 != 0 && i11 != 8) {
            this.f24610A = m24615e(i11);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f24617u > 0) {
                i12 = (int) (elapsedRealtime - this.f24618v);
            } else {
                i12 = 0;
            }
            m24616f(i12, this.f24619w, this.f24610A);
            this.f24618v = elapsedRealtime;
            this.f24619w = 0L;
            this.f24622z = 0L;
            this.f24621y = 0L;
            this.f24614r.m20565c();
        }
    }

    /* renamed from: h */
    private static boolean m24618h(wo2 wo2Var, boolean z11) {
        if (z11 && !wo2Var.m27670b(8)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0aa0, code lost:            return new int[]{4, 4, 4, 4, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0114, code lost:            if (r3.equals("XK") != false) goto L1780;     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0bd4, code lost:            return new int[]{1, 1, 1, 1, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x012c, code lost:            if (r3.equals("WF") != false) goto L1454;     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0768, code lost:            return new int[]{4, 2, 2, 4, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0136, code lost:            if (r3.equals("VU") != false) goto L1530;     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x086d, code lost:            return new int[]{3, 3, 3, 2, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x014e, code lost:            if (r3.equals("VI") != false) goto L1534;     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x087b, code lost:            return new int[]{0, 2, 0, 1, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0166, code lost:            if (r3.equals("VE") != false) goto L1692;     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0170, code lost:            if (r3.equals("VC") != false) goto L1740;     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x017a, code lost:            if (r3.equals("VA") != false) goto L1633;     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0192, code lost:            if (r3.equals("UY") != false) goto L1416;     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01aa, code lost:            if (r3.equals("UG") != false) goto L1119;     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ea, code lost:            return new int[]{3, 3, 4, 3, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01b4, code lost:            if (r3.equals("UA") != false) goto L1462;     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0784, code lost:            return new int[]{0, 2, 1, 1, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01cc, code lost:            if (r3.equals("TW") != false) goto L1595;     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x094f, code lost:            return new int[]{0, 0, 0, 0, 0, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01d6, code lost:            if (r3.equals("TV") != false) goto L1454;     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01fc, code lost:            if (r3.equals("TO") != false) goto L1716;     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0af4, code lost:            return new int[]{3, 2, 3, 3, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0206, code lost:            if (r3.equals("TN") != false) goto L1416;     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0210, code lost:            if (r3.equals("TM") != false) goto L1142;     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0338, code lost:            return new int[]{4, 2, 1, 1, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x021a, code lost:            if (r3.equals("TL") != false) goto L1645;     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x09fc, code lost:            return new int[]{4, 3, 4, 4, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0232, code lost:            if (r3.equals("TJ") != false) goto L1645;     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x024a, code lost:            if (r3.equals("TG") != false) goto L1552;     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x08b9, code lost:            return new int[]{3, 4, 1, 0, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0254, code lost:            if (r3.equals("TD") != false) goto L1692;     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x025e, code lost:            if (r3.equals("TC") != false) goto L1090;     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0286, code lost:            return new int[]{1, 2, 1, 0, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0275, code lost:            if (r3.equals("SY") != false) goto L1645;     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x027f, code lost:            if (r3.equals("SX") != false) goto L1090;     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x028d, code lost:            if (r3.equals("SV") != false) goto L1242;     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x048d, code lost:            return new int[]{2, 3, 3, 3, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x02c1, code lost:            if (r3.equals("SO") != false) goto L1716;     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x02d9, code lost:            if (r3.equals("SM") != false) goto L1768;     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0baa, code lost:            return new int[]{0, 2, 2, 2, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x02e3, code lost:            if (r3.equals("SL") != false) goto L1119;     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x02f1, code lost:            if (r3.equals("SK") != false) goto L1700;     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0abc, code lost:            return new int[]{0, 0, 0, 0, 1, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x02fb, code lost:            if (r3.equals("SI") != false) goto L1505;     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0817, code lost:            return new int[]{1, 0, 0, 0, 1, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0305, code lost:            if (r3.equals("SH") != false) goto L1587;     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x031d, code lost:            if (r3.equals("SE") != false) goto L1595;     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0327, code lost:            if (r3.equals("SD") != false) goto L1692;     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0331, code lost:            if (r3.equals("SC") != false) goto L1142;     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0377, code lost:            if (r3.equals("RS") != false) goto L1334;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:            if (r3.equals("CI") != false) goto L1603;     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x05ca, code lost:            return new int[]{1, 0, 0, 0, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x038f, code lost:            if (r3.equals("RE") != false) goto L1326;     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05ae, code lost:            return new int[]{1, 2, 1, 2, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x03b5, code lost:            if (r3.equals("PT") != false) goto L1595;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x096b, code lost:            return new int[]{3, 4, 4, 4, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03db, code lost:            if (r3.equals("PM") != false) goto L1768;     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x03e5, code lost:            if (r3.equals("PL") != false) goto L1220;     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0442, code lost:            return new int[]{1, 1, 2, 2, 4, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x03ee, code lost:            if (r3.equals("PK") != false) goto L1716;     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0406, code lost:            if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L1312;     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x057e, code lost:            return new int[]{4, 3, 3, 2, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0410, code lost:            if (r3.equals("PF") != false) goto L1669;     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0a50, code lost:            return new int[]{2, 2, 2, 1, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x041a, code lost:            if (r3.equals("PE") != false) goto L1497;     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x07fb, code lost:            return new int[]{1, 2, 4, 4, 4, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0424, code lost:            if (r3.equals("PA") != false) goto L1242;     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x043b, code lost:            if (r3.equals("NZ") != false) goto L1220;     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0449, code lost:            if (r3.equals("NU") != false) goto L1227;     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0459, code lost:            return new int[]{4, 2, 2, 1, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0452, code lost:            if (r3.equals("NR") != false) goto L1227;     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x046e, code lost:            if (r3.equals("NO") != false) goto L1625;     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x09b6, code lost:            return new int[]{0, 0, 2, 0, 1, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0486, code lost:            if (r3.equals("NI") != false) goto L1242;     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x04a2, code lost:            if (r3.equals("NE") != false) goto L1692;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:            if (r3.equals("CG") != false) goto L1591;     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x04ba, code lost:            if (r3.equals("NA") != false) goto L1530;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0941, code lost:            return new int[]{3, 4, 3, 3, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0518, code lost:            if (r3.equals("MT") != false) goto L1700;     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0522, code lost:            if (r3.equals("MS") != false) goto L1768;     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x052c, code lost:            if (r3.equals("MR") != false) goto L1290;     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x053a, code lost:            if (r3.equals("MQ") != false) goto L1513;     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0833, code lost:            return new int[]{2, 1, 2, 3, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0544, code lost:            if (r3.equals("MP") != false) goto L1300;     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0554, code lost:            return new int[]{0, 2, 4, 4, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:            if (r3.equals("CF") != false) goto L1408;     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x054d, code lost:            if (r3.equals("MO") != false) goto L1300;     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0577, code lost:            if (r3.equals("ML") != false) goto L1312;     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0593, code lost:            if (r3.equals("MH") != false) goto L1454;     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x059d, code lost:            if (r3.equals("MG") != false) goto L1692;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x06c8, code lost:            return new int[]{4, 2, 4, 2, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x05a7, code lost:            if (r3.equals("MF") != false) goto L1326;     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x05c3, code lost:            if (r3.equals("MD") != false) goto L1334;     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05ed, code lost:            if (r3.equals("LY") != false) goto L1716;     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x05f7, code lost:            if (r3.equals("LV") != false) goto L1595;     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x062b, code lost:            if (r3.equals("LR") != false) goto L1603;     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0643, code lost:            if (r3.equals("LI") != false) goto L1768;     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x064d, code lost:            if (r3.equals("LC") != false) goto L1740;     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0681, code lost:            if (r3.equals("KY") != false) goto L1740;     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x068b, code lost:            if (r3.equals("KW") != false) goto L1629;     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x09c4, code lost:            return new int[]{1, 0, 0, 0, 0, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x06a3, code lost:            if (r3.equals("KP") != false) goto L1567;     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x08ed, code lost:            return new int[]{3, 2, 2, 2, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x06ad, code lost:            if (r3.equals("KN") != false) goto L1740;     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x06b7, code lost:            if (r3.equals("KM") != false) goto L1692;     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x06c1, code lost:            if (r3.equals("KI") != false) goto L1408;     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x06dd, code lost:            if (r3.equals("KG") != false) goto L1416;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007e, code lost:            if (r3.equals("BN") != false) goto L1637;     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x06eb, code lost:            if (r3.equals("KE") != false) goto L1567;     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x071f, code lost:            if (r3.equals("JE") != false) goto L1435;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x09e0, code lost:            return new int[]{2, 2, 0, 0, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x073b, code lost:            if (r3.equals("IS") != false) goto L1595;     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0761, code lost:            if (r3.equals("IO") != false) goto L1454;     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x077d, code lost:            if (r3.equals("IM") != false) goto L1462;     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x078b, code lost:            if (r3.equals("IL") != false) goto L1665;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0088, code lost:            if (r3.equals("BM") != false) goto L1740;     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0a42, code lost:            return new int[]{1, 2, 2, 2, 3, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0795, code lost:            if (r3.equals("IE") != false) goto L1583;     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0925, code lost:            return new int[]{0, 1, 1, 1, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x07bb, code lost:            if (r3.equals("HT") != false) goto L1692;     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x07c5, code lost:            if (r3.equals("HR") != false) goto L1505;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0b48, code lost:            return new int[]{1, 2, 0, 0, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x07ea, code lost:            if (r3.equals("GW") != false) goto L1591;     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x07f4, code lost:            if (r3.equals("GU") != false) goto L1497;     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0810, code lost:            if (r3.equals("GR") != false) goto L1505;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:            if (r3.equals("BL") != false) goto L1633;     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x082c, code lost:            if (r3.equals("GP") != false) goto L1513;     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0848, code lost:            if (r3.equals("GM") != false) goto L1732;     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0b2c, code lost:            return new int[]{4, 3, 3, 4, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0852, code lost:            if (r3.equals("GL") != false) goto L1740;     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x085c, code lost:            if (r3.equals("GI") != false) goto L1760;     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0b8e, code lost:            return new int[]{0, 2, 0, 0, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0866, code lost:            if (r3.equals("GH") != false) goto L1530;     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0874, code lost:            if (r3.equals("GG") != false) goto L1534;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x09d2, code lost:            return new int[]{1, 2, 2, 2, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0882, code lost:            if (r3.equals("GF") != false) goto L1716;     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x089a, code lost:            if (r3.equals("GD") != false) goto L1740;     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x08b2, code lost:            if (r3.equals("GA") != false) goto L1552;     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x08ce, code lost:            if (r3.equals("FO") != false) goto L1760;     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x08e6, code lost:            if (r3.equals("FK") != false) goto L1567;     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x091e, code lost:            if (r3.equals("ES") != false) goto L1583;     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x092c, code lost:            if (r3.equals("ER") != false) goto L1587;     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x093a, code lost:            if (r3.equals("EG") != false) goto L1591;     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0948, code lost:            if (r3.equals("EE") != false) goto L1595;     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0964, code lost:            if (r3.equals("DZ") != false) goto L1603;     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0980, code lost:            if (r3.equals("DM") != false) goto L1760;     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0998, code lost:            if (r3.equals("DJ") != false) goto L1645;     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x09af, code lost:            if (r3.equals("CZ") != false) goto L1625;     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x09bd, code lost:            if (r3.equals("CY") != false) goto L1629;     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x09cb, code lost:            if (r3.equals("CX") != false) goto L1633;     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x09d9, code lost:            if (r3.equals("CW") != false) goto L1637;     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x09f5, code lost:            if (r3.equals("CU") != false) goto L1645;     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x0a3b, code lost:            if (r3.equals("CL") != false) goto L1665;     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x0a49, code lost:            if (r3.equals("CK") != false) goto L1669;     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x0a81, code lost:            if (r3.equals("BQ") != false) goto L1740;     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x0a99, code lost:            if (r3.equals("BI") != false) goto L1692;     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x0ab5, code lost:            if (r3.equals("BG") != false) goto L1700;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c6, code lost:            if (r3.equals("AR") != false) goto L1416;     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x0aed, code lost:            if (r3.equals("AZ") != false) goto L1716;     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x0b25, code lost:            if (r3.equals("AF") != false) goto L1732;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x06e4, code lost:            return new int[]{2, 1, 1, 1, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x0b41, code lost:            if (r3.equals("AD") != false) goto L1740;     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x0b87, code lost:            if (r3.equals("BB") != false) goto L1760;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d0, code lost:            if (r3.equals("AQ") != false) goto L1587;     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x0ba3, code lost:            if (r3.equals("AX") != false) goto L1768;     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x0bcd, code lost:            if (r3.equals("AL") != false) goto L1780;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0933, code lost:            return new int[]{4, 2, 2, 2, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00da, code lost:            if (r3.equals("ZW") != false) goto L1290;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0533, code lost:            return new int[]{4, 2, 4, 4, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0100, code lost:            if (r3.equals("YT") != false) goto L1435;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0726, code lost:            return new int[]{4, 2, 2, 3, 2, 2};     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x010a, code lost:            if (r3.equals("YE") != false) goto L1692;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x002d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0030. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0036. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0039. Please report as an issue. */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int[] m24619j(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 2091) {
            if (hashCode != 2092) {
                if (hashCode != 2102) {
                    if (hashCode != 2103) {
                        if (hashCode != 2111) {
                            if (hashCode != 2112) {
                                if (hashCode != 2129) {
                                    if (hashCode != 2130) {
                                        if (hashCode != 2135) {
                                            if (hashCode != 2136) {
                                                switch (hashCode) {
                                                    case 2083:
                                                        break;
                                                    case 2084:
                                                        if (str.equals("AE")) {
                                                            return new int[]{1, 4, 4, 4, 4, 0};
                                                        }
                                                        break;
                                                    case 2085:
                                                        break;
                                                    case 2086:
                                                        if (str.equals("AG")) {
                                                            return new int[]{2, 4, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    default:
                                                        switch (hashCode) {
                                                            case 2088:
                                                                if (str.equals("AI")) {
                                                                    return new int[]{0, 2, 0, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2094:
                                                                if (str.equals("AO")) {
                                                                    return new int[]{4, 4, 3, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2105:
                                                                break;
                                                            case 2114:
                                                                if (str.equals("BD")) {
                                                                    return new int[]{2, 1, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2115:
                                                                if (str.equals("BE")) {
                                                                    return new int[]{0, 1, 4, 4, 3, 2};
                                                                }
                                                                break;
                                                            case 2116:
                                                                if (str.equals("BF")) {
                                                                    return new int[]{4, 3, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2117:
                                                                break;
                                                            case 2118:
                                                                if (str.equals("BH")) {
                                                                    return new int[]{1, 2, 1, 3, 4, 2};
                                                                }
                                                                break;
                                                            case 2119:
                                                                break;
                                                            case 2120:
                                                                if (str.equals("BJ")) {
                                                                    return new int[]{4, 4, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2127:
                                                                break;
                                                            case 2133:
                                                                if (str.equals("BW")) {
                                                                    return new int[]{3, 2, 1, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2142:
                                                                if (str.equals("CA")) {
                                                                    return new int[]{0, 2, 2, 2, 3, 2};
                                                                }
                                                                break;
                                                            case 2145:
                                                                if (str.equals("CD")) {
                                                                    return new int[]{4, 2, 3, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2152:
                                                                break;
                                                            case 2153:
                                                                break;
                                                            case 2154:
                                                                if (str.equals("CM")) {
                                                                    return new int[]{3, 3, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2155:
                                                                if (str.equals("CN")) {
                                                                    return new int[]{2, 0, 1, 1, 3, 2};
                                                                }
                                                                break;
                                                            case 2156:
                                                                if (str.equals("CO")) {
                                                                    return new int[]{2, 3, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2159:
                                                                if (str.equals("CR")) {
                                                                    return new int[]{2, 3, 4, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2162:
                                                                break;
                                                            case 2163:
                                                                if (str.equals("CV")) {
                                                                    return new int[]{2, 1, 0, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2164:
                                                                break;
                                                            case 2165:
                                                                break;
                                                            case 2166:
                                                                break;
                                                            case 2167:
                                                                break;
                                                            case 2177:
                                                                if (str.equals("DE")) {
                                                                    return new int[]{0, 1, 2, 2, 2, 3};
                                                                }
                                                                break;
                                                            case 2182:
                                                                break;
                                                            case 2183:
                                                                if (str.equals("DK")) {
                                                                    return new int[]{0, 0, 3, 2, 0, 2};
                                                                }
                                                                break;
                                                            case 2185:
                                                                break;
                                                            case 2187:
                                                                if (str.equals("DO")) {
                                                                    return new int[]{3, 4, 4, 4, 4, 2};
                                                                }
                                                                break;
                                                            case 2198:
                                                                break;
                                                            case 2206:
                                                                if (str.equals("EC")) {
                                                                    return new int[]{2, 3, 2, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2208:
                                                                break;
                                                            case 2210:
                                                                break;
                                                            case 2221:
                                                                break;
                                                            case 2222:
                                                                break;
                                                            case 2223:
                                                                if (str.equals("ET")) {
                                                                    return new int[]{4, 3, 3, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2243:
                                                                if (str.equals("FI")) {
                                                                    return new int[]{0, 0, 0, 3, 0, 2};
                                                                }
                                                                break;
                                                            case 2244:
                                                                if (str.equals("FJ")) {
                                                                    return new int[]{3, 1, 2, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2245:
                                                                break;
                                                            case 2247:
                                                                if (str.equals("FM")) {
                                                                    return new int[]{4, 2, 4, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2249:
                                                                break;
                                                            case 2252:
                                                                if (str.equals("FR")) {
                                                                    return new int[]{1, 2, 3, 1, 0, 2};
                                                                }
                                                                break;
                                                            case 2266:
                                                                break;
                                                            case 2267:
                                                                if (str.equals("GB")) {
                                                                    return new int[]{0, 0, 1, 1, 1, 1};
                                                                }
                                                                break;
                                                            case 2269:
                                                                break;
                                                            case 2270:
                                                                if (str.equals("GE")) {
                                                                    return new int[]{1, 1, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2271:
                                                                break;
                                                            case 2272:
                                                                break;
                                                            case 2273:
                                                                break;
                                                            case 2274:
                                                                break;
                                                            case 2277:
                                                                break;
                                                            case 2278:
                                                                break;
                                                            case 2279:
                                                                if (str.equals("GN")) {
                                                                    return new int[]{4, 3, 4, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2281:
                                                                break;
                                                            case 2282:
                                                                if (str.equals("GQ")) {
                                                                    return new int[]{4, 2, 1, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2283:
                                                                break;
                                                            case 2285:
                                                                if (str.equals("GT")) {
                                                                    return new int[]{2, 3, 2, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2286:
                                                                break;
                                                            case 2288:
                                                                break;
                                                            case 2290:
                                                                if (str.equals("GY")) {
                                                                    return new int[]{3, 2, 2, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2307:
                                                                if (str.equals("HK")) {
                                                                    return new int[]{0, 1, 2, 3, 2, 0};
                                                                }
                                                                break;
                                                            case 2314:
                                                                break;
                                                            case 2316:
                                                                break;
                                                            case 2317:
                                                                if (str.equals("HU")) {
                                                                    return new int[]{0, 0, 0, 1, 3, 2};
                                                                }
                                                                break;
                                                            case 2331:
                                                                if (str.equals("ID")) {
                                                                    return new int[]{3, 1, 2, 2, 3, 2};
                                                                }
                                                                break;
                                                            case 2332:
                                                                break;
                                                            case 2339:
                                                                break;
                                                            case 2340:
                                                                break;
                                                            case 2341:
                                                                if (str.equals("IN")) {
                                                                    return new int[]{1, 1, 3, 2, 3, 3};
                                                                }
                                                                break;
                                                            case 2342:
                                                                break;
                                                            case 2344:
                                                                if (str.equals("IQ")) {
                                                                    return new int[]{3, 2, 2, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2345:
                                                                if (str.equals("IR")) {
                                                                    return new int[]{3, 0, 1, 1, 4, 1};
                                                                }
                                                                break;
                                                            case 2346:
                                                                break;
                                                            case 2347:
                                                                if (str.equals("IT")) {
                                                                    return new int[]{0, 0, 0, 1, 1, 2};
                                                                }
                                                                break;
                                                            case 2363:
                                                                break;
                                                            case 2371:
                                                                if (str.equals("JM")) {
                                                                    return new int[]{2, 4, 3, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2373:
                                                                if (str.equals("JO")) {
                                                                    return new int[]{2, 1, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2374:
                                                                if (str.equals("JP")) {
                                                                    return new int[]{0, 1, 1, 2, 2, 4};
                                                                }
                                                                break;
                                                            case 2394:
                                                                break;
                                                            case 2396:
                                                                break;
                                                            case 2397:
                                                                if (str.equals("KH")) {
                                                                    return new int[]{2, 1, 4, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2398:
                                                                break;
                                                            case 2402:
                                                                break;
                                                            case 2403:
                                                                break;
                                                            case 2405:
                                                                break;
                                                            case 2407:
                                                                if (str.equals("KR")) {
                                                                    return new int[]{0, 1, 1, 3, 4, 4};
                                                                }
                                                                break;
                                                            case 2412:
                                                                break;
                                                            case 2414:
                                                                break;
                                                            case 2415:
                                                                if (str.equals("KZ")) {
                                                                    return new int[]{2, 1, 2, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2421:
                                                                if (str.equals("LA")) {
                                                                    return new int[]{1, 2, 1, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2422:
                                                                if (str.equals("LB")) {
                                                                    return new int[]{3, 3, 2, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2423:
                                                                break;
                                                            case 2429:
                                                                break;
                                                            case 2431:
                                                                if (str.equals("LK")) {
                                                                    return new int[]{3, 1, 3, 3, 4, 2};
                                                                }
                                                                break;
                                                            case 2438:
                                                                break;
                                                            case 2439:
                                                                if (str.equals("LS")) {
                                                                    return new int[]{3, 3, 2, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2440:
                                                                if (str.equals("LT")) {
                                                                    return new int[]{0, 0, 0, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2441:
                                                                if (str.equals("LU")) {
                                                                    return new int[]{1, 0, 3, 2, 1, 4};
                                                                }
                                                                break;
                                                            case 2442:
                                                                break;
                                                            case 2445:
                                                                break;
                                                            case 2452:
                                                                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                                                                    return new int[]{3, 3, 1, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2454:
                                                                if (str.equals("MC")) {
                                                                    return new int[]{0, 2, 2, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2455:
                                                                break;
                                                            case 2456:
                                                                if (str.equals("ME")) {
                                                                    return new int[]{2, 0, 0, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2457:
                                                                break;
                                                            case 2458:
                                                                break;
                                                            case 2459:
                                                                break;
                                                            case 2462:
                                                                if (str.equals("MK")) {
                                                                    return new int[]{1, 0, 0, 1, 3, 2};
                                                                }
                                                                break;
                                                            case 2463:
                                                                break;
                                                            case 2464:
                                                                if (str.equals("MM")) {
                                                                    return new int[]{2, 4, 2, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2465:
                                                                if (str.equals("MN")) {
                                                                    return new int[]{2, 0, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2466:
                                                                break;
                                                            case 2467:
                                                                break;
                                                            case 2468:
                                                                break;
                                                            case 2469:
                                                                break;
                                                            case 2470:
                                                                break;
                                                            case 2471:
                                                                break;
                                                            case 2472:
                                                                if (str.equals("MU")) {
                                                                    return new int[]{3, 1, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2473:
                                                                if (str.equals("MV")) {
                                                                    return new int[]{3, 4, 1, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2474:
                                                                if (str.equals("MW")) {
                                                                    return new int[]{4, 2, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2475:
                                                                if (str.equals("MX")) {
                                                                    return new int[]{2, 4, 3, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2476:
                                                                if (str.equals("MY")) {
                                                                    return new int[]{1, 0, 3, 1, 3, 2};
                                                                }
                                                                break;
                                                            case 2477:
                                                                if (str.equals("MZ")) {
                                                                    return new int[]{3, 1, 2, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2483:
                                                                break;
                                                            case 2485:
                                                                if (str.equals("NC")) {
                                                                    return new int[]{3, 3, 4, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2487:
                                                                break;
                                                            case 2489:
                                                                if (str.equals("NG")) {
                                                                    return new int[]{3, 4, 2, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2491:
                                                                break;
                                                            case 2494:
                                                                if (str.equals("NL")) {
                                                                    return new int[]{0, 2, 2, 3, 0, 3};
                                                                }
                                                                break;
                                                            case 2497:
                                                                break;
                                                            case 2498:
                                                                if (str.equals("NP")) {
                                                                    return new int[]{2, 2, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2500:
                                                                break;
                                                            case 2503:
                                                                break;
                                                            case 2508:
                                                                break;
                                                            case 2526:
                                                                if (str.equals("OM")) {
                                                                    return new int[]{2, 3, 1, 3, 4, 2};
                                                                }
                                                                break;
                                                            case 2545:
                                                                break;
                                                            case 2549:
                                                                break;
                                                            case 2550:
                                                                break;
                                                            case 2551:
                                                                break;
                                                            case 2552:
                                                                if (str.equals("PH")) {
                                                                    return new int[]{2, 1, 3, 3, 3, 0};
                                                                }
                                                                break;
                                                            case 2555:
                                                                break;
                                                            case 2556:
                                                                break;
                                                            case 2557:
                                                                break;
                                                            case 2562:
                                                                if (str.equals("PR")) {
                                                                    return new int[]{2, 0, 2, 1, 2, 1};
                                                                }
                                                                break;
                                                            case 2563:
                                                                if (str.equals("PS")) {
                                                                    return new int[]{3, 4, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2564:
                                                                break;
                                                            case 2567:
                                                                if (str.equals("PW")) {
                                                                    return new int[]{2, 2, 4, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2576:
                                                                if (str.equals("QA")) {
                                                                    return new int[]{2, 4, 4, 4, 4, 2};
                                                                }
                                                                break;
                                                            case 2611:
                                                                break;
                                                            case 2621:
                                                                if (str.equals("RO")) {
                                                                    return new int[]{0, 0, 1, 2, 1, 2};
                                                                }
                                                                break;
                                                            case 2625:
                                                                break;
                                                            case 2627:
                                                                if (str.equals("RU")) {
                                                                    return new int[]{1, 0, 0, 0, 4, 3};
                                                                }
                                                                break;
                                                            case 2629:
                                                                if (str.equals("RW")) {
                                                                    return new int[]{3, 4, 2, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2638:
                                                                if (str.equals("SA")) {
                                                                    return new int[]{3, 1, 1, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2639:
                                                                if (str.equals("SB")) {
                                                                    return new int[]{4, 2, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2640:
                                                                break;
                                                            case 2641:
                                                                break;
                                                            case 2642:
                                                                break;
                                                            case 2644:
                                                                if (str.equals("SG")) {
                                                                    return new int[]{1, 1, 2, 2, 2, 1};
                                                                }
                                                                break;
                                                            case 2645:
                                                                break;
                                                            case 2646:
                                                                break;
                                                            case 2648:
                                                                break;
                                                            case 2649:
                                                                break;
                                                            case 2650:
                                                                break;
                                                            case 2651:
                                                                if (str.equals("SN")) {
                                                                    return new int[]{4, 4, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2652:
                                                                break;
                                                            case 2655:
                                                                if (str.equals("SR")) {
                                                                    return new int[]{2, 4, 3, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2656:
                                                                if (str.equals("SS")) {
                                                                    return new int[]{4, 3, 2, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2657:
                                                                if (str.equals("ST")) {
                                                                    return new int[]{2, 2, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2659:
                                                                break;
                                                            case 2661:
                                                                break;
                                                            case 2662:
                                                                break;
                                                            case 2663:
                                                                if (str.equals("SZ")) {
                                                                    return new int[]{3, 3, 3, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2671:
                                                                break;
                                                            case 2672:
                                                                break;
                                                            case 2675:
                                                                break;
                                                            case 2676:
                                                                if (str.equals("TH")) {
                                                                    return new int[]{0, 2, 2, 3, 3, 4};
                                                                }
                                                                break;
                                                            case 2678:
                                                                break;
                                                            case 2679:
                                                                if (str.equals("TK")) {
                                                                    return new int[]{2, 2, 2, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2680:
                                                                break;
                                                            case 2681:
                                                                break;
                                                            case 2682:
                                                                break;
                                                            case 2683:
                                                                break;
                                                            case 2686:
                                                                if (str.equals("TR")) {
                                                                    return new int[]{1, 1, 0, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2688:
                                                                if (str.equals("TT")) {
                                                                    return new int[]{1, 4, 1, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2690:
                                                                break;
                                                            case 2691:
                                                                break;
                                                            case 2694:
                                                                if (str.equals("TZ")) {
                                                                    return new int[]{3, 4, 3, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2700:
                                                                break;
                                                            case 2706:
                                                                break;
                                                            case 2718:
                                                                if (str.equals("US")) {
                                                                    return new int[]{1, 0, 2, 2, 3, 1};
                                                                }
                                                                break;
                                                            case 2724:
                                                                break;
                                                            case 2725:
                                                                if (str.equals("UZ")) {
                                                                    return new int[]{2, 2, 3, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2731:
                                                                break;
                                                            case 2733:
                                                                break;
                                                            case 2735:
                                                                break;
                                                            case 2737:
                                                                if (str.equals("VG")) {
                                                                    return new int[]{2, 2, 1, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2739:
                                                                break;
                                                            case 2744:
                                                                if (str.equals("VN")) {
                                                                    return new int[]{0, 3, 3, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2751:
                                                                break;
                                                            case 2767:
                                                                break;
                                                            case 2780:
                                                                if (str.equals("WS")) {
                                                                    return new int[]{3, 1, 3, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2803:
                                                                break;
                                                            case 2828:
                                                                break;
                                                            case 2843:
                                                                break;
                                                            case 2855:
                                                                if (str.equals("ZA")) {
                                                                    return new int[]{3, 2, 2, 1, 1, 2};
                                                                }
                                                                break;
                                                            case 2867:
                                                                if (str.equals("ZM")) {
                                                                    return new int[]{3, 3, 4, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2877:
                                                                break;
                                                            default:
                                                                switch (hashCode) {
                                                                    case 2096:
                                                                        break;
                                                                    case 2097:
                                                                        break;
                                                                    case 2098:
                                                                        if (str.equals("AS")) {
                                                                            return new int[]{2, 2, 3, 3, 2, 2};
                                                                        }
                                                                        break;
                                                                    case 2099:
                                                                        if (str.equals("AT")) {
                                                                            return new int[]{1, 0, 1, 1, 0, 0};
                                                                        }
                                                                        break;
                                                                    case 2100:
                                                                        if (str.equals("AU")) {
                                                                            return new int[]{0, 1, 1, 1, 2, 0};
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (hashCode) {
                                                                            case 2122:
                                                                                break;
                                                                            case 2123:
                                                                                break;
                                                                            case 2124:
                                                                                break;
                                                                            case 2125:
                                                                                if (str.equals("BO")) {
                                                                                    return new int[]{1, 2, 3, 2, 2, 2};
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (hashCode) {
                                                                                    case 2149:
                                                                                        if (str.equals("CH")) {
                                                                                            return new int[]{0, 0, 0, 1, 0, 2};
                                                                                        }
                                                                                        break;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                            } else if (str.equals("BZ")) {
                                                return new int[]{2, 4, 2, 1, 2, 2};
                                            }
                                        } else if (str.equals("BY")) {
                                            return new int[]{0, 1, 2, 3, 2, 2};
                                        }
                                    } else if (str.equals("BT")) {
                                        return new int[]{3, 1, 3, 2, 2, 2};
                                    }
                                } else if (str.equals("BS")) {
                                    return new int[]{4, 4, 2, 2, 2, 2};
                                }
                            }
                        } else if (str.equals("BA")) {
                            return new int[]{1, 2, 1, 1, 2, 2};
                        }
                    }
                } else if (str.equals("AW")) {
                    return new int[]{1, 3, 4, 4, 2, 2};
                }
            } else if (str.equals("AM")) {
                return new int[]{2, 3, 2, 3, 2, 2};
            }
            return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    @Override // com.google.android.gms.internal.ads.dc3
    /* renamed from: A */
    public final synchronized void mo21341A(qj2 qj2Var, wo2 wo2Var, boolean z11) {
        boolean z12;
        try {
            if (!m24618h(wo2Var, z11)) {
                return;
            }
            if (this.f24617u > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            v71.m27175f(z12);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i11 = (int) (elapsedRealtime - this.f24618v);
            this.f24621y += i11;
            long j11 = this.f24622z;
            long j12 = this.f24619w;
            this.f24622z = j11 + j12;
            if (i11 > 0) {
                this.f24614r.m20564b((int) Math.sqrt(j12), (((float) j12) * 8000.0f) / i11);
                if (this.f24621y < 2000) {
                    if (this.f24622z >= 524288) {
                    }
                    m24616f(i11, this.f24619w, this.f24610A);
                    this.f24618v = elapsedRealtime;
                    this.f24619w = 0L;
                }
                this.f24610A = this.f24614r.m20563a(0.5f);
                m24616f(i11, this.f24619w, this.f24610A);
                this.f24618v = elapsedRealtime;
                this.f24619w = 0L;
            }
            this.f24617u--;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.dc3
    /* renamed from: D */
    public final void mo21342D(qj2 qj2Var, wo2 wo2Var, boolean z11) {
    }

    @Override // com.google.android.gms.internal.ads.ij4
    /* renamed from: a */
    public final void mo23276a(Handler handler, hj4 hj4Var) {
        hj4Var.getClass();
        this.f24613q.m22457a(handler, hj4Var);
    }

    @Override // com.google.android.gms.internal.ads.ij4
    /* renamed from: b */
    public final void mo23277b(hj4 hj4Var) {
        this.f24613q.m22459c(hj4Var);
    }

    @Override // com.google.android.gms.internal.ads.dc3
    /* renamed from: i */
    public final synchronized void mo21343i(qj2 qj2Var, wo2 wo2Var, boolean z11, int i11) {
        if (!m24618h(wo2Var, z11)) {
            return;
        }
        this.f24619w += i11;
    }

    @Override // com.google.android.gms.internal.ads.dc3
    /* renamed from: x */
    public final synchronized void mo21344x(qj2 qj2Var, wo2 wo2Var, boolean z11) {
        try {
            if (!m24618h(wo2Var, z11)) {
                return;
            }
            if (this.f24617u == 0) {
                this.f24618v = SystemClock.elapsedRealtime();
            }
            this.f24617u++;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
