package c00;

import a00.InterfaceC0017b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p733zz.C32609a;

/* renamed from: c00.a */
/* loaded from: classes4.dex */
public class C3181a {

    /* renamed from: a */
    private final List f13414a;

    /* renamed from: b */
    private final int f13415b;

    /* renamed from: c */
    private final int f13416c;

    /* renamed from: d */
    private double f13417d;

    /* renamed from: e */
    private double f13418e;

    /* renamed from: f */
    private int f13419f;

    /* renamed from: g */
    private int f13420g;

    /* renamed from: h */
    private int f13421h;

    /* renamed from: i */
    private int f13422i;

    /* renamed from: j */
    private int f13423j;

    /* renamed from: k */
    private float[] f13424k;

    /* renamed from: l */
    private float[] f13425l;

    /* renamed from: m */
    private boolean[] f13426m;

    /* renamed from: n */
    private int[][] f13427n;

    /* renamed from: o */
    private int f13428o;

    public C3181a(List list, int i11, int i12, double d11, double d12, int i13, int i14, int i15, int i16) {
        this.f13414a = list;
        this.f13415b = i11;
        this.f13416c = i12;
        this.f13417d = d11;
        this.f13418e = d12;
        this.f13419f = i13;
        this.f13421h = i14;
        this.f13420g = i15;
        this.f13422i = i16;
        m15977b();
    }

    /* renamed from: b */
    private void m15977b() {
        this.f13423j = (int) Math.round(3.141592653589793d / this.f13418e);
        this.f13428o = (int) Math.round((((this.f13415b + this.f13416c) * 2) + 1) / this.f13417d);
        this.f13427n = new int[this.f13423j];
        boolean[] zArr = new boolean[this.f13415b * this.f13416c];
        this.f13426m = zArr;
        Arrays.fill(zArr, false);
        int i11 = this.f13423j;
        this.f13424k = new float[i11];
        this.f13425l = new float[i11];
        for (int i12 = 0; i12 < this.f13423j; i12++) {
            double d11 = i12;
            this.f13424k[i12] = (float) (Math.cos(this.f13418e * d11) / this.f13417d);
            this.f13425l[i12] = (float) (Math.sin(d11 * this.f13418e) / this.f13417d);
        }
        for (InterfaceC0017b interfaceC0017b : this.f13414a) {
            this.f13426m[((int) interfaceC0017b.getX()) + (((int) interfaceC0017b.getY()) * this.f13415b)] = true;
        }
    }

    /* renamed from: a */
    public List m15978a() {
        int round;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        char c11;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Iterator it;
        int i28;
        int i29;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.f13414a.iterator();
        while (it2.hasNext()) {
            InterfaceC0017b interfaceC0017b = (InterfaceC0017b) it2.next();
            int x11 = (int) interfaceC0017b.getX();
            int y11 = (int) interfaceC0017b.getY();
            if (this.f13426m[(this.f13415b * y11) + x11]) {
                int i31 = this.f13419f - 1;
                int i32 = 0;
                int i33 = 0;
                while (true) {
                    if (i32 < this.f13423j) {
                        int round2 = Math.round((x11 * this.f13424k[i32]) + (y11 * this.f13425l[i32]));
                        int i34 = this.f13428o;
                        int i35 = round2 + ((i34 - 1) / 2);
                        if (i35 < i34) {
                            int[][] iArr = this.f13427n;
                            if (iArr[i32] == null) {
                                int[] iArr2 = new int[i34];
                                iArr[i32] = iArr2;
                                Arrays.fill(iArr2, 0);
                            }
                            int[] iArr3 = this.f13427n[i32];
                            int i36 = iArr3[i35];
                            if (i36 == 0) {
                                iArr3[i35] = 1;
                            } else {
                                iArr3[i35] = i36 + 1;
                            }
                            int i37 = iArr3[i35];
                            if (i31 < i37) {
                                i33 = i32;
                                i31 = i37;
                            }
                            i32++;
                        } else {
                            throw new RuntimeException("rho out of index");
                        }
                    } else if (i31 < this.f13419f) {
                        continue;
                    } else {
                        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 2);
                        double d11 = -this.f13425l[i33];
                        double d12 = this.f13424k[i33];
                        int i38 = -1;
                        if (Math.abs(d11) > Math.abs(d12)) {
                            if (d11 > 0.0d) {
                                i38 = 1;
                            }
                            i11 = (int) Math.round((d12 * 65536) / Math.abs(d11));
                            y11 = (y11 << 16) + 32768;
                            round = i38;
                            z11 = true;
                        } else {
                            if (d12 > 0.0d) {
                                i38 = 1;
                            }
                            x11 = (x11 << 16) + 32768;
                            round = (int) Math.round((d11 * 65536) / Math.abs(d12));
                            i11 = i38;
                            z11 = false;
                        }
                        int i39 = 0;
                        for (int i41 = 2; i39 < i41; i41 = 2) {
                            if (i39 > 0) {
                                i25 = -round;
                                i24 = -i11;
                                i22 = y11;
                                i23 = x11;
                            } else {
                                i22 = y11;
                                i23 = x11;
                                i24 = i11;
                                i25 = round;
                            }
                            int i42 = 0;
                            while (true) {
                                if (z11) {
                                    i27 = i23;
                                    i26 = i22 >> 16;
                                } else {
                                    i26 = i22;
                                    i27 = i23 >> 16;
                                }
                                it = it2;
                                if (i27 < 0 || i27 >= (i29 = this.f13415b) || i26 < 0) {
                                    break;
                                }
                                i28 = y11;
                                if (i26 < this.f13416c) {
                                    if (this.f13426m[(i29 * i26) + i27]) {
                                        int[] iArr5 = iArr4[i39];
                                        iArr5[0] = i27;
                                        iArr5[1] = i26;
                                        i42 = 0;
                                    } else {
                                        int i43 = i42 + 1;
                                        if (i43 > this.f13421h) {
                                            break;
                                        }
                                        i42 = i43;
                                    }
                                    i23 += i25;
                                    i22 += i24;
                                    it2 = it;
                                    y11 = i28;
                                }
                            }
                            i39++;
                            it2 = it;
                            y11 = i28;
                        }
                        Iterator it3 = it2;
                        int i44 = y11;
                        if (Math.abs(iArr4[1][0] - iArr4[0][0]) < this.f13420g && Math.abs(iArr4[1][1] - iArr4[0][1]) < this.f13420g) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        int i45 = 0;
                        while (i45 < 2) {
                            if (i45 > 0) {
                                i14 = -round;
                                i13 = -i11;
                                i12 = x11;
                            } else {
                                i12 = x11;
                                i13 = i11;
                                i14 = round;
                            }
                            int i46 = i44;
                            while (true) {
                                if (z11) {
                                    i16 = i46 >> 16;
                                    i15 = i12;
                                } else {
                                    i15 = i12 >> 16;
                                    i16 = i46;
                                }
                                i17 = x11;
                                if (this.f13426m[(this.f13415b * i16) + i15]) {
                                    if (z12) {
                                        int i47 = 0;
                                        while (i47 < this.f13423j) {
                                            int i48 = i11;
                                            int i49 = round;
                                            int round3 = Math.round((i15 * this.f13424k[i47]) + (i16 * this.f13425l[i47])) + ((this.f13428o - 1) / 2);
                                            int[] iArr6 = this.f13427n[i47];
                                            if (iArr6 != null && (i21 = iArr6[round3]) != 0) {
                                                iArr6[round3] = i21 - 1;
                                            }
                                            i47++;
                                            i11 = i48;
                                            round = i49;
                                        }
                                    }
                                    i18 = i11;
                                    i19 = round;
                                    c11 = 0;
                                    this.f13426m[(this.f13415b * i16) + i15] = false;
                                } else {
                                    i18 = i11;
                                    i19 = round;
                                    c11 = 0;
                                }
                                int[] iArr7 = iArr4[i45];
                                if (i16 != iArr7[1] || i15 != iArr7[c11]) {
                                    i12 += i14;
                                    i46 += i13;
                                    x11 = i17;
                                    i11 = i18;
                                    round = i19;
                                }
                            }
                            i45++;
                            x11 = i17;
                            i11 = i18;
                            round = i19;
                        }
                        if (z12) {
                            int[] iArr8 = iArr4[0];
                            float f11 = iArr8[0];
                            float f12 = iArr8[1];
                            int[] iArr9 = iArr4[1];
                            C32609a c32609a = new C32609a(f11, f12, iArr9[0], iArr9[1]);
                            if (c32609a.f150703p.getX() > c32609a.f150704q.getX()) {
                                InterfaceC0017b m157950m = c32609a.m157950m();
                                c32609a.m157955s(c32609a.m157951n());
                                c32609a.m157956u(m157950m);
                            }
                            arrayList.add(c32609a);
                            if (arrayList.size() >= this.f13422i) {
                                return arrayList;
                            }
                        }
                        it2 = it3;
                    }
                }
            }
        }
        return arrayList;
    }
}
