package wf0;

import com.adtima.ads.ZAdsErrorCode;
import java.util.Objects;
import me0.C23055e5;
import nh0.C23793c;
import p140ev.C18613b;
import p140ev.C18619h;
import p248iy.AbstractC20887g;
import yf0.C30946k;

/* renamed from: wf0.d */
/* loaded from: classes5.dex */
public abstract class AbstractC28959d {
    /* renamed from: a */
    private static int m144628a(long j11) {
        if (j11 > 0 && j11 <= 8) {
            return 19601;
        }
        if (j11 > 8 && j11 <= 16) {
            return 19602;
        }
        if (j11 > 16 && j11 <= 32) {
            return 19603;
        }
        if (j11 > 32 && j11 <= 64) {
            return 19604;
        }
        if (j11 > 64 && j11 <= 128) {
            return 19605;
        }
        if (j11 > 128 && j11 <= 256) {
            return 19606;
        }
        if (j11 > 256 && j11 <= 512) {
            return 19607;
        }
        if (j11 > 512 && j11 <= 1024) {
            return 19608;
        }
        if (j11 > 1024 && j11 <= 2048) {
            return 19609;
        }
        if (j11 <= 2048 || j11 > 4096) {
            return j11 > 4096 ? 19611 : 0;
        }
        return 19610;
    }

    /* renamed from: b */
    private static int m144629b(C18613b c18613b, int i11) {
        int m98348a = c18613b.m98348a();
        if (m98348a != 2) {
            if (m98348a != 3) {
                if (m98348a != 4) {
                    if (m98348a != 5) {
                        if (m98348a == 100) {
                            return -1;
                        }
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    return -1;
                                }
                                return 19402;
                            }
                            return 19401;
                        }
                        return 19400;
                    }
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                return -1;
                            }
                            return 19562;
                        }
                        return 19561;
                    }
                    return 19560;
                }
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return -1;
                        }
                        return 19502;
                    }
                    return 19501;
                }
                return 19500;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return -1;
                    }
                    return 19542;
                }
                return 19541;
            }
            return 19540;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return -1;
                }
                return 19522;
            }
            return 19521;
        }
        return 19520;
    }

    /* renamed from: c */
    public static void m144630c(String str, boolean z11) {
        Long m150518l = C30946k.Companion.m150528a().m150518l(str);
        Long valueOf = Long.valueOf(C23793c.m124316k().mo124311f());
        if (m150518l != null && m150518l.longValue() > 0) {
            long longValue = valueOf.longValue() - m150518l.longValue();
            int m144628a = m144628a(longValue / 1000);
            if (m144628a > 0) {
                String format = String.format("{url : %s, closeTime : %d, openAgainTime : %d, duration : %d}", str, m150518l, valueOf, Long.valueOf(longValue));
                AbstractC20887g.m109248z(m144628a, format);
                if (z11) {
                    AbstractC20887g.m109248z(19600, format);
                }
            }
        }
    }

    /* renamed from: d */
    public static void m144631d(int i11) {
        AbstractC20887g.m109237o(i11);
    }

    /* renamed from: e */
    public static void m144632e(String str) {
        AbstractC20887g.m109240r(19800, str);
    }

    /* renamed from: f */
    public static void m144633f(C18619h c18619h, int i11, String str) {
        String m98402d;
        int i12;
        try {
            if (c18619h != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("qos load page failed after jump link: webViewErrorCode=");
                sb2.append(i11);
                sb2.append("; jumpUrl=");
                if (c18619h.m98402d() == null) {
                    m98402d = "";
                } else {
                    m98402d = c18619h.m98402d();
                }
                sb2.append(m98402d);
                sb2.append("; action=");
                sb2.append(c18619h.m98399a());
                C18613b m98400b = c18619h.m98400b();
                Objects.requireNonNull(m98400b);
                int m144629b = m144629b(m98400b, c18619h.m98399a());
                if (C23055e5.m118271f()) {
                    i12 = 19410;
                } else {
                    switch (i11) {
                        case -15:
                            i12 = 19422;
                            break;
                        case -14:
                            i12 = 19416;
                            break;
                        case -13:
                            i12 = 19415;
                            break;
                        case -12:
                            i12 = 19412;
                            break;
                        case -11:
                            i12 = 19414;
                            break;
                        case -10:
                            i12 = 19424;
                            break;
                        case -9:
                            i12 = 19420;
                            break;
                        case ZAdsErrorCode.SDK_NO_ADS_FREQUENCY_CAPPING /* -8 */:
                            i12 = 19421;
                            break;
                        case ZAdsErrorCode.SDK_INVALID_ZONE /* -7 */:
                            i12 = 19418;
                            break;
                        case -6:
                            i12 = 19413;
                            break;
                        case -5:
                            i12 = 19419;
                            break;
                        case -4:
                            i12 = 19411;
                            break;
                        case -3:
                            i12 = 19423;
                            break;
                        case -2:
                            i12 = 19417;
                            break;
                        default:
                            i12 = 19425;
                            break;
                    }
                }
                if (m144629b > 0) {
                    long m98401c = c18619h.m98401c();
                    long currentTimeMillis = System.currentTimeMillis();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("submit qos jump link failed: cmd=");
                    sb3.append(m144629b);
                    sb3.append("; retCode=");
                    sb3.append(i12);
                    AbstractC20887g.m109221H(false, false, i12, m144629b, 0, currentTimeMillis - m98401c, str, currentTimeMillis, m98401c);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("jump link qos is null");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public static void m144634g(boolean z11, boolean z12, int i11, int i12, int i13, long j11, String str, long j12, long j13) {
        AbstractC20887g.m109221H(z11, z12, i11, i12, i13, j11, str, j12, j13);
    }
}
