package com.zing.zalo.media.server;

import com.zing.zalo.media.download.AbstractC9010h;
import com.zing.zalo.media.download.C9008f;
import com.zing.zalo.media.server.NanoHTTPD;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.io.File;
import java.util.Map;
import me0.AbstractC23228u2;
import mm0.AbstractC23350e;

/* renamed from: com.zing.zalo.media.server.a */
/* loaded from: classes4.dex */
public class C9026a extends NanoHTTPD {

    /* renamed from: h */
    private static final String f48351h = "a";

    public C9026a(int i11) {
        super(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01d2 A[Catch: Exception -> 0x0088, TRY_ENTER, TryCatch #4 {Exception -> 0x0088, blocks: (B:2:0x0000, B:4:0x0052, B:6:0x0058, B:8:0x0071, B:10:0x008f, B:13:0x009b, B:16:0x00a5, B:19:0x00aa, B:37:0x01c7, B:46:0x01d2, B:52:0x01db, B:53:0x01de), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01db A[Catch: Exception -> 0x0088, TryCatch #4 {Exception -> 0x0088, blocks: (B:2:0x0000, B:4:0x0052, B:6:0x0058, B:8:0x0071, B:10:0x008f, B:13:0x009b, B:16:0x00a5, B:19:0x00aa, B:37:0x01c7, B:46:0x01d2, B:52:0x01db, B:53:0x01de), top: B:1:0x0000 }] */
    @Override // com.zing.zalo.media.server.NanoHTTPD
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NanoHTTPD.C9022j mo48182k(NanoHTTPD.InterfaceC9020h interfaceC9020h) {
        AbstractC9010h.a m48151d;
        long j11;
        AbstractC23228u2.a aVar;
        C9008f c9008f;
        NanoHTTPD.C9022j c9022j;
        C9008f c9008f2;
        NanoHTTPD.C9022j.b bVar;
        NanoHTTPD.C9022j c9022j2;
        try {
            Map mo48205b = interfaceC9020h.mo48205b();
            Map mo48204a = interfaceC9020h.mo48204a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("params:");
            sb2.append(mo48205b);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("headers:");
            sb3.append(mo48204a);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("cookies:");
            sb4.append(interfaceC9020h.mo48207d());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("method:");
            sb5.append(interfaceC9020h.mo48208e());
            String str = (String) mo48205b.get("downloadId");
            int parseInt = Integer.parseInt(str);
            if (parseInt > 0 && (m48151d = AbstractC9010h.m48151d(parseInt)) != null) {
                String str2 = (String) mo48204a.get("range");
                StringBuilder sb6 = new StringBuilder();
                sb6.append("range:");
                sb6.append(str2);
                if (str2 != null) {
                    aVar = AbstractC23228u2.m119705d(str2);
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("Range header received, proxying to http url connection:");
                    sb7.append(aVar);
                    j11 = aVar.m119707a();
                } else {
                    j11 = 0;
                    aVar = null;
                }
                int i11 = 0;
                while (m48151d.m48159f() <= 0 && i11 < 50) {
                    i11++;
                    Thread.sleep(100L);
                }
                if (i11 >= 50) {
                    return super.mo48182k(interfaceC9020h);
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append("startOffset:");
                sb8.append(j11);
                if (j11 < 0) {
                    j11 = 0;
                }
                try {
                    if (m48151d.m48161h()) {
                        File file = new File(m48151d.m48158e());
                        if (file.exists()) {
                            file.setLastModified(System.currentTimeMillis());
                        }
                        c9008f2 = new C9008f(m48151d.m48158e(), m48151d.m48157d(), m48151d.m48159f(), j11);
                    } else {
                        c9008f2 = new C9008f(m48151d.m48157d(), m48151d.m48158e(), m48151d.m48159f(), j11);
                    }
                } catch (Exception e11) {
                    e = e11;
                    c9008f = null;
                } catch (Throwable th2) {
                    th = th2;
                    c9008f = null;
                }
                try {
                    try {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("downloadId = ");
                        sb9.append(str);
                        sb9.append(", return stream = ");
                        sb9.append(c9008f2);
                        sb9.append(", total file size = ");
                        sb9.append(m48151d.m48159f());
                        long m48159f = m48151d.m48159f() - j11;
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("length:");
                        sb10.append(m48159f);
                        if (m48159f < 0) {
                            c9022j2 = new NanoHTTPD.C9022j(NanoHTTPD.C9022j.b.RANGE_NOT_SATISFIABLE, "video/mp4", c9008f2);
                            try {
                                c9022j2.m48217a("Content-Length", String.valueOf(0));
                                c9022j2.m48217a("accept-ranges", ZMediaPlayer.OnNativeInvokeListener.ARG_BYTES);
                                c9022j2.m48217a("Content-Range", String.format("bytes */%d", Long.valueOf(m48151d.m48159f())));
                            } catch (Exception e12) {
                                e = e12;
                                c9022j = c9022j2;
                                c9008f = c9008f2;
                                try {
                                    AbstractC23350e.m122776f(f48351h, e);
                                    if (c9008f != null) {
                                    }
                                    return c9022j;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (c9008f != null) {
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            if (aVar != null) {
                                bVar = NanoHTTPD.C9022j.b.PARTIAL_CONTENT;
                            } else {
                                bVar = NanoHTTPD.C9022j.b.OK;
                            }
                            NanoHTTPD.C9022j c9022j3 = new NanoHTTPD.C9022j(bVar, "video/mp4", c9008f2);
                            try {
                                c9022j3.m48217a("accept-ranges", ZMediaPlayer.OnNativeInvokeListener.ARG_BYTES);
                                c9022j3.m48217a("Content-Length", String.valueOf(m48159f));
                                if (aVar != null) {
                                    c9022j3.m48217a("Content-Range", String.format("bytes %d-%d/%d", Long.valueOf(j11), Long.valueOf(m48151d.m48159f() - 1), Long.valueOf(m48151d.m48159f())));
                                }
                                c9022j2 = c9022j3;
                            } catch (Exception e13) {
                                e = e13;
                                c9022j = c9022j3;
                                c9008f = c9008f2;
                                AbstractC23350e.m122776f(f48351h, e);
                                if (c9008f != null) {
                                }
                                return c9022j;
                            }
                        }
                        c9008f2.close();
                        return c9022j2;
                    } catch (Exception e14) {
                        e = e14;
                        c9008f = c9008f2;
                        c9022j = null;
                        AbstractC23350e.m122776f(f48351h, e);
                        if (c9008f != null) {
                            c9008f.close();
                        }
                        return c9022j;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    c9008f = c9008f2;
                    if (c9008f != null) {
                        c9008f.close();
                    }
                    throw th;
                }
            }
        } catch (Exception e15) {
            AbstractC23350e.m122776f(f48351h, e15);
        }
        return new NanoHTTPD.C9022j(NanoHTTPD.C9022j.b.BAD_REQUEST, "html/text", "");
    }
}
