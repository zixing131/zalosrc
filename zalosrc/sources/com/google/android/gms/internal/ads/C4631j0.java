package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j0 */
/* loaded from: classes2.dex */
final class C4631j0 implements InterfaceC4300a0 {

    /* renamed from: a */
    public final c83 f22581a;

    /* renamed from: b */
    private final int f22582b;

    private C4631j0(int i11, c83 c83Var) {
        this.f22582b = i11;
        this.f22581a = c83Var;
    }

    /* renamed from: b */
    public static C4631j0 m23495b(int i11, x02 x02Var) {
        String str;
        InterfaceC4300a0 c4668k0;
        String str2;
        z73 z73Var = new z73();
        int m27781l = x02Var.m27781l();
        int i12 = -2;
        while (x02Var.m27778i() > 8) {
            int m27784o = x02Var.m27784o();
            int m27780k = x02Var.m27780k() + x02Var.m27784o();
            x02Var.m27774e(m27780k);
            if (m27784o == 1414744396) {
                c4668k0 = m23495b(x02Var.m27784o(), x02Var);
            } else {
                C4668k0 c4668k02 = null;
                switch (m27784o) {
                    case 1718776947:
                        if (i12 == 2) {
                            x02Var.m27776g(4);
                            int m27784o2 = x02Var.m27784o();
                            int m27784o3 = x02Var.m27784o();
                            x02Var.m27776g(4);
                            int m27784o4 = x02Var.m27784o();
                            switch (m27784o4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                lr1.m24356e("StreamFormatChunk", "Ignoring track with unsupported compression " + m27784o4);
                                break;
                            } else {
                                C5004t1 c5004t1 = new C5004t1();
                                c5004t1.m26528x(m27784o2);
                                c5004t1.m26507f(m27784o3);
                                c5004t1.m26523s(str2);
                                c4668k02 = new C4668k0(c5004t1.m26529y());
                                break;
                            }
                        } else if (i12 == 1) {
                            int m27786q = x02Var.m27786q();
                            if (m27786q == 1) {
                                str = "audio/raw";
                            } else if (m27786q != 85) {
                                if (m27786q == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (m27786q != 8192) {
                                    if (m27786q != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                lr1.m24356e("StreamFormatChunk", "Ignoring track with unsupported format tag " + m27786q);
                                break;
                            } else {
                                int m27786q2 = x02Var.m27786q();
                                int m27784o5 = x02Var.m27784o();
                                x02Var.m27776g(6);
                                int m22330X = g92.m22330X(x02Var.m27792w());
                                int m27786q3 = x02Var.m27786q();
                                byte[] bArr = new byte[m27786q3];
                                x02Var.m27771b(bArr, 0, m27786q3);
                                C5004t1 c5004t12 = new C5004t1();
                                c5004t12.m26523s(str);
                                c5004t12.m26506e0(m27786q2);
                                c5004t12.m26524t(m27784o5);
                                if ("audio/raw".equals(str) && m22330X != 0) {
                                    c5004t12.m26518n(m22330X);
                                }
                                if ("audio/mp4a-latm".equals(str) && m27786q3 > 0) {
                                    c5004t12.m26513i(c83.m20833x(bArr));
                                }
                                c4668k0 = new C4668k0(c5004t12.m26529y());
                                break;
                            }
                        } else {
                            lr1.m24356e("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(g92.m22357o(i12)));
                            break;
                        }
                    case 1751742049:
                        c4668k0 = C4521g0.m22255a(x02Var);
                        break;
                    case 1752331379:
                        c4668k0 = C4558h0.m22654a(x02Var);
                        break;
                    case 1852994675:
                        c4668k0 = C4705l0.m24101a(x02Var);
                        break;
                }
                c4668k0 = c4668k02;
            }
            if (c4668k0 != null) {
                if (c4668k0.zza() == 1752331379) {
                    int i13 = ((C4558h0) c4668k0).f21474a;
                    if (i13 != 1935960438) {
                        if (i13 != 1935963489) {
                            if (i13 != 1937012852) {
                                lr1.m24356e("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i13))));
                                i12 = -1;
                            } else {
                                i12 = 3;
                            }
                        } else {
                            i12 = 1;
                        }
                    } else {
                        i12 = 2;
                    }
                }
                z73Var.m28452f(c4668k0);
            }
            x02Var.m27775f(m27780k);
            x02Var.m27774e(m27781l);
        }
        return new C4631j0(i11, z73Var.m28454h());
    }

    /* renamed from: a */
    public final InterfaceC4300a0 m23496a(Class cls) {
        c83 c83Var = this.f22581a;
        int size = c83Var.size();
        int i11 = 0;
        while (i11 < size) {
            InterfaceC4300a0 interfaceC4300a0 = (InterfaceC4300a0) c83Var.get(i11);
            i11++;
            if (interfaceC4300a0.getClass() == cls) {
                return interfaceC4300a0;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4300a0
    public final int zza() {
        return this.f22582b;
    }
}
