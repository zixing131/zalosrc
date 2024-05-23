package p609wh;

import ag0.C0832n;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.RequestPacket;
import hu.AbstractC20130d;
import java.io.FileOutputStream;
import mm0.AbstractC23352g;
import p645xh.AbstractC29633j;
import p645xh.C29630g;
import rh0.AbstractC25803k;

/* renamed from: wh.m0 */
/* loaded from: classes3.dex */
public final class C29023m0 {

    /* renamed from: b */
    private static volatile C29023m0 f134368b;

    /* renamed from: a */
    public final String f134369a = C29023m0.class.getSimpleName();

    /* renamed from: a */
    public static synchronized C29023m0 m145017a() {
        C29023m0 c29023m0;
        synchronized (C29023m0.class) {
            try {
                if (f134368b == null) {
                    synchronized (C29023m0.class) {
                        try {
                            if (f134368b == null) {
                                f134368b = new C29023m0();
                            }
                        } finally {
                        }
                    }
                }
                c29023m0 = f134368b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c29023m0;
    }

    /* renamed from: b */
    public void m145018b(RequestPacket requestPacket) {
        String valueOf;
        String m104886o0;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        byte[] bArr = null;
        if (requestPacket.m93289k() == 0) {
            valueOf = null;
        } else {
            valueOf = String.valueOf(requestPacket.m93289k());
        }
        AbstractC25803k.m132971k(2, 3, String.valueOf((int) requestPacket.m93278a()), requestPacket.m93281d(), valueOf);
        if (requestPacket.m93278a() != 173 && requestPacket.m93278a() != 174 && requestPacket.m93278a() != 701 && requestPacket.m93278a() != 702 && requestPacket.m93278a() != 703 && requestPacket.m93278a() != 704 && requestPacket.m93278a() != 705 && requestPacket.m93278a() != 711 && requestPacket.m93278a() != 712 && requestPacket.m93278a() != 713 && requestPacket.m93278a() != 714 && requestPacket.m93278a() != 715) {
            try {
                if (requestPacket.m93286h() != null && requestPacket.m93286h().length > 0) {
                    try {
                        bArr = AbstractC29633j.m147358g(requestPacket.m93286h());
                    } catch (Exception unused) {
                    }
                    if (bArr != null) {
                        requestPacket.m93303y(bArr);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        if (requestPacket.m93284g() == 2 || requestPacket.m93284g() == 3 || requestPacket.m93284g() == 4) {
            if (requestPacket.m93278a() == 1) {
                if (requestPacket.m93289k() == 0) {
                    C29630g.m147299E0().f89373e = true;
                    return;
                } else if (requestPacket.m93289k() == -1) {
                    C0832n.m2179i().m2185c();
                    C29630g.m147299E0().mo93411k();
                    return;
                } else {
                    C29630g.m147299E0().mo93411k();
                    return;
                }
            }
            if ((requestPacket.m93278a() == 701 || requestPacket.m93278a() == 702 || requestPacket.m93278a() == 703 || requestPacket.m93278a() == 704 || requestPacket.m93278a() == 705 || requestPacket.m93278a() == 711 || requestPacket.m93278a() == 712 || requestPacket.m93278a() == 713 || requestPacket.m93278a() == 714 || requestPacket.m93278a() == 715) && requestPacket.m93289k() == 0) {
                try {
                    byte[] m93286h = requestPacket.m93286h();
                    int m93349l = AbstractC17522a.m93349l(m93286h, 0);
                    int m93349l2 = AbstractC17522a.m93349l(m93286h, 4);
                    byte[] bArr2 = new byte[m93349l2];
                    System.arraycopy(m93286h, 8, bArr2, 0, m93349l2);
                    String str2 = new String(bArr2);
                    if (m93349l == 302) {
                        int m93349l3 = AbstractC17522a.m93349l(m93286h, m93349l2 + 8);
                        byte[] bArr3 = new byte[m93349l3];
                        System.arraycopy(m93286h, m93349l2 + 12, bArr3, 0, m93349l3);
                        str = new String(bArr3);
                        m104886o0 = "";
                        i13 = 0;
                        i14 = 0;
                        i11 = 0;
                        i12 = 0;
                        i15 = m93349l3;
                    } else {
                        int m93349l4 = AbstractC17522a.m93349l(m93286h, 8 + m93349l2);
                        int m93349l5 = AbstractC17522a.m93349l(m93286h, m93349l2 + 12);
                        int m93349l6 = AbstractC17522a.m93349l(m93286h, m93349l2 + 16);
                        int m93349l7 = AbstractC17522a.m93349l(m93286h, m93349l2 + 20);
                        int i16 = m93349l2 + 24;
                        int length = m93286h.length - i16;
                        m104886o0 = AbstractC20130d.m104886o0();
                        try {
                            m104886o0 = m104886o0 + "/" + AbstractC23352g.m122788d(str2 + m93349l6);
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(m104886o0);
                        try {
                            fileOutputStream.write(m93286h, i16, length);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            i11 = m93349l6;
                            i12 = m93349l7;
                            i13 = m93349l4;
                            i14 = m93349l5;
                            str = "";
                            i15 = 0;
                        } finally {
                        }
                    }
                    requestPacket.m93303y(AbstractC29633j.m147360i(m93349l, m93349l2, str2, i15, str, i13, i14, i11, i12, m104886o0).getBytes());
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
        }
    }
}
