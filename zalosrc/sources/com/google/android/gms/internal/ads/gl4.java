package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class gl4 {

    /* renamed from: a */
    private static final int[] f20728a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f20729b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static fl4 m22466a(byte[] bArr) {
        return m22467b(new wz1(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:            if (r11 != 3) goto L60;     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fl4 m22467b(wz1 wz1Var, boolean z11) {
        int i11;
        int m22468c = m22468c(wz1Var);
        int m22469d = m22469d(wz1Var);
        int m27746c = wz1Var.m27746c(4);
        String str = "mp4a.40." + m22468c;
        int i12 = 22;
        if (m22468c == 5 || m22468c == 29) {
            m22469d = m22469d(wz1Var);
            m22468c = m22468c(wz1Var);
            if (m22468c == 22) {
                m27746c = wz1Var.m27746c(4);
            }
        }
        if (z11) {
            int i13 = 3;
            if (m22468c != 1 && m22468c != 2 && m22468c != 3 && m22468c != 4 && m22468c != 6 && m22468c != 7 && m22468c != 17) {
                switch (m22468c) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw zzbu.m28713c("Unsupported audio object type: " + m22468c);
                }
            }
            if (wz1Var.m27755l()) {
                lr1.m24356e("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (wz1Var.m27755l()) {
                wz1Var.m27753j(14);
            }
            boolean m27755l = wz1Var.m27755l();
            if (m27746c != 0) {
                if (m22468c != 6) {
                    if (m22468c == 20) {
                        m22468c = 20;
                        i11 = 20;
                    } else {
                        i11 = m22468c;
                        if (m27755l) {
                            if (m22468c == 22) {
                                wz1Var.m27753j(16);
                            } else {
                                i12 = m22468c;
                            }
                            if (i12 == 17 || i12 == 19 || i12 == 20 || i12 == 23) {
                                wz1Var.m27753j(3);
                            }
                            wz1Var.m27753j(1);
                        }
                        switch (i11) {
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                int m27746c2 = wz1Var.m27746c(2);
                                if (m27746c2 == 2) {
                                    i13 = m27746c2;
                                }
                                throw zzbu.m28713c("Unsupported epConfig: " + i13);
                        }
                    }
                } else {
                    i11 = m22468c;
                }
                wz1Var.m27753j(3);
                if (m27755l) {
                }
                switch (i11) {
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i14 = f20729b[m27746c];
        if (i14 != -1) {
            return new fl4(m22469d, i14, str, null);
        }
        throw zzbu.m28711a(null, null);
    }

    /* renamed from: c */
    private static int m22468c(wz1 wz1Var) {
        int m27746c = wz1Var.m27746c(5);
        if (m27746c == 31) {
            return wz1Var.m27746c(6) + 32;
        }
        return m27746c;
    }

    /* renamed from: d */
    private static int m22469d(wz1 wz1Var) {
        int m27746c = wz1Var.m27746c(4);
        if (m27746c == 15) {
            return wz1Var.m27746c(24);
        }
        if (m27746c < 13) {
            return f20728a[m27746c];
        }
        throw zzbu.m28711a(null, null);
    }
}
