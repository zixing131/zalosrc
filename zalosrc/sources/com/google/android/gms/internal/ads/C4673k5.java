package com.google.android.gms.internal.ads;

import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k5 */
/* loaded from: classes2.dex */
public final class C4673k5 implements InterfaceC4307a7 {

    /* renamed from: a */
    private final List f23146a = c83.m20832w();

    public C4673k5(int i11) {
    }

    /* renamed from: b */
    private final C4898q6 m23837b(C5232z6 c5232z6) {
        return new C4898q6(m23839d(c5232z6));
    }

    /* renamed from: c */
    private final C4454e7 m23838c(C5232z6 c5232z6) {
        return new C4454e7(m23839d(c5232z6));
    }

    /* renamed from: d */
    private final List m23839d(C5232z6 c5232z6) {
        String str;
        int i11;
        List list;
        byte[] bArr;
        x02 x02Var = new x02(c5232z6.f31381d);
        List list2 = this.f23146a;
        while (x02Var.m27778i() > 0) {
            int m27788s = x02Var.m27788s();
            int m27780k = x02Var.m27780k() + x02Var.m27788s();
            if (m27788s == 134) {
                list2 = new ArrayList();
                int m27788s2 = x02Var.m27788s() & 31;
                for (int i12 = 0; i12 < m27788s2; i12++) {
                    String m27767F = x02Var.m27767F(3, w43.f29782c);
                    int m27788s3 = x02Var.m27788s();
                    int i13 = m27788s3 & 128;
                    if (i13 != 0) {
                        i11 = m27788s3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i11 = 1;
                    }
                    byte m27788s4 = (byte) x02Var.m27788s();
                    x02Var.m27776g(1);
                    if (i13 != 0) {
                        int i14 = x91.f30390c;
                        if ((m27788s4 & 64) != 0) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    C5004t1 c5004t1 = new C5004t1();
                    c5004t1.m26523s(str);
                    c5004t1.m26515k(m27767F);
                    c5004t1.m26502c0(i11);
                    c5004t1.m26513i(list);
                    list2.add(c5004t1.m26529y());
                }
            }
            x02Var.m27775f(m27780k);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4307a7
    /* renamed from: a */
    public final InterfaceC4380c7 mo20012a(int i11, C5232z6 c5232z6) {
        if (i11 != 2) {
            if (i11 != 3 && i11 != 4) {
                if (i11 != 21) {
                    if (i11 != 27) {
                        if (i11 != 36) {
                            if (i11 != 89) {
                                if (i11 != 138) {
                                    if (i11 != 172) {
                                        if (i11 != 257) {
                                            if (i11 != 128) {
                                                if (i11 != 129) {
                                                    if (i11 != 134) {
                                                        if (i11 != 135) {
                                                            switch (i11) {
                                                                case 15:
                                                                    return new C4490f6(new C4636j5(false, c5232z6.f31379b));
                                                                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                                                    return new C4490f6(new C5008t5(m23838c(c5232z6)));
                                                                case 17:
                                                                    return new C4490f6(new C4343b6(c5232z6.f31379b));
                                                                default:
                                                                    return null;
                                                            }
                                                        }
                                                    } else {
                                                        return new C4860p6(new C4453e6("application/x-scte35"));
                                                    }
                                                }
                                                return new C4490f6(new C4415d5(c5232z6.f31379b));
                                            }
                                        } else {
                                            return new C4860p6(new C4453e6("application/vnd.dvb.ait"));
                                        }
                                    } else {
                                        return new C4490f6(new C4526g5(c5232z6.f31379b));
                                    }
                                } else {
                                    return new C4490f6(new C4747m5(c5232z6.f31379b));
                                }
                            } else {
                                return new C4490f6(new C4785n5(c5232z6.f31380c));
                            }
                        } else {
                            return new C4490f6(new C5231z5(m23837b(c5232z6)));
                        }
                    } else {
                        return new C4490f6(new C5157x5(m23837b(c5232z6), false, false));
                    }
                } else {
                    return new C4490f6(new C4306a6());
                }
            } else {
                return new C4490f6(new C4379c6(c5232z6.f31379b));
            }
        }
        return new C4490f6(new C4897q5(m23838c(c5232z6)));
    }
}
