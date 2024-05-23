package rh0;

import ae.C0766k;
import ag0.C0809c1;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalocore.CoreUtility;
import fg0.ThreadFactoryC18928a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import im0.AbstractC20626a;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23301a;
import p361nb.C23665v;
import p361nb.C23669z;
import p420pb.C24709a;
import p602w9.C28825a;
import p645xh.C29628e;
import p665y0.C30242d;

/* renamed from: rh0.c */
/* loaded from: classes.dex */
public class C25795c {

    /* renamed from: a */
    private static final String f122997a = "c";

    /* renamed from: b */
    private static volatile C25795c f122998b;

    /* renamed from: c */
    public static long f122999c;

    /* renamed from: d */
    private static final String f123000d;

    /* renamed from: e */
    private static final String f123001e;

    /* renamed from: f */
    private static ScheduledExecutorService f123002f;

    /* renamed from: g */
    private static boolean f123003g;

    /* renamed from: h */
    private static long f123004h;

    /* renamed from: rh0.c$a */
    /* loaded from: classes7.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f123005a;

        a(C23669z c23669z) {
            this.f123005a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f123005a);
        }
    }

    /* renamed from: rh0.c$b */
    /* loaded from: classes7.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ArrayList f123007a;

        b(ArrayList arrayList) {
            this.f123007a = arrayList;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C24709a.m128299t(MainApplication.getAppContext()).m128306M(null, this.f123007a);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: rh0.c$c */
    /* loaded from: classes7.dex */
    public class c implements InterfaceC20094a {
        c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                String unused = C25795c.f122997a;
                if (c20096c != null && c20096c.m104491c() == 18006) {
                    try {
                        JSONObject jSONObject = new JSONObject(c20096c.m104490b());
                        if (!jSONObject.isNull("retry_time")) {
                            long optLong = jSONObject.optLong("retry_time");
                            if (optLong > 0) {
                                C25795c.f123004h = optLong * 1000;
                            }
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            try {
                C25795c.f123004h = 0L;
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("error_code")) {
                        int optInt = jSONObject.optInt("error_code", -999);
                        if (optInt == 0) {
                            String unused = C25795c.f122997a;
                        } else if (optInt == 18006 && (optJSONObject = jSONObject.optJSONObject("data")) != null && !optJSONObject.isNull("retry_time")) {
                            long optLong = optJSONObject.optLong("retry_time");
                            if (optLong > 0) {
                                C25795c.f123004h = optLong * 1000;
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    static {
        String str;
        if (MainApplication.getAppContext().getFilesDir() != null) {
            str = MainApplication.getAppContext().getFilesDir().getPath();
        } else {
            str = "/data/data/com.zing.zalo";
        }
        f123000d = str;
        f123001e = str + "/app_duration.bin";
        f123003g = true;
        f123004h = 0L;
    }

    /* renamed from: d */
    public static synchronized C25795c m132936d() {
        C25795c c25795c;
        synchronized (C25795c.class) {
            try {
                if (f122998b == null) {
                    synchronized (C25795c.class) {
                        try {
                            if (f122998b == null) {
                                f122998b = new C25795c();
                            }
                        } finally {
                        }
                    }
                }
                c25795c = f122998b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c25795c;
    }

    /* renamed from: e */
    public static /* synthetic */ void m132937e() {
        if (f123003g) {
            f122998b.m132939j();
            f123003g = false;
        }
        f122998b.m132938i(System.currentTimeMillis());
    }

    /* renamed from: i */
    private void m132938i(long j11) {
        try {
            if (f122999c == 0) {
                f122999c = j11;
            }
            C28825a c28825a = new C28825a(0);
            long j12 = f122999c;
            c28825a.m144103r(C23301a.m120511l(c28825a, j12, j11 - j12));
            byte[] m144082F = c28825a.m144082F();
            FileOutputStream fileOutputStream = new FileOutputStream(f123001e);
            try {
                fileOutputStream.write(m144082F);
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d(f122997a, e11.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0128 -> B:62:0x0149). Please report as a decompilation issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m132939j() {
        FileInputStream fileInputStream;
        int available;
        boolean z11;
        boolean z12;
        int i11;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(f123001e);
                try {
                    try {
                        available = fileInputStream.available();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            AbstractC23350e.m122774d(f122997a, e13.toString());
        }
        if (available > 0) {
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr);
            C23301a m120513o = C23301a.m120513o(ByteBuffer.wrap(bArr));
            if (m120513o != null) {
                boolean z13 = true;
                if (AbstractC23309i.m122562x0() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (AbstractC23309i.m120962G3(2) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z11) {
                    if (z12) {
                    }
                }
                if (!TextUtils.isEmpty(CoreUtility.f89233i) && m120513o.m120517m() > 60000 && m120513o.m120517m() < 31536000000L) {
                    boolean m93432x = C29628e.m147249E0().m93432x();
                    int m107387c = AbstractC20626a.m107387c();
                    int i12 = -1;
                    try {
                        C25796d m132952b = C25798f.m132949c().m132952b();
                        if (m132952b != null) {
                            i12 = m132952b.m132943f();
                        }
                        i11 = i12;
                    } catch (Exception e14) {
                        e14.printStackTrace();
                        i11 = -1;
                    }
                    long m120517m = m120513o.m120517m();
                    long m120518q = m120513o.m120518q();
                    long currentTimeMillis = System.currentTimeMillis();
                    C23665v c23665v = new C23665v(1, m120517m, m107387c, m93432x ? 1 : 0, i11, m120518q, currentTimeMillis);
                    try {
                        synchronized (AbstractC23304d.f113293K) {
                            try {
                                if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                                    AbstractC23304d.f113293K.add(c23665v);
                                }
                                if (AbstractC23304d.f113293K.size() < 50) {
                                    z13 = false;
                                }
                            } finally {
                                th = th;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                }
                            }
                        }
                        if (z11) {
                            C24709a.m128299t(MainApplication.getAppContext()).m128303G(c23665v);
                            if (z13) {
                                synchronized (AbstractC23304d.f113293K) {
                                    AbstractC23304d.f113293K = C24709a.m128299t(MainApplication.getAppContext()).m128313o(50L);
                                }
                            }
                        }
                    } catch (Exception e15) {
                        e = e15;
                        fileInputStream2 = fileInputStream;
                        try {
                            AbstractC23350e.m122774d(f122997a, e.toString());
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            return;
                        } catch (Throwable th5) {
                            th = th5;
                            Throwable th6 = th;
                            if (fileInputStream2 == null) {
                                try {
                                    fileInputStream2.close();
                                    throw th6;
                                } catch (IOException e16) {
                                    AbstractC23350e.m122774d(f122997a, e16.toString());
                                    throw th6;
                                }
                            }
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        fileInputStream2 = fileInputStream;
                        Throwable th62 = th;
                        if (fileInputStream2 == null) {
                        }
                    }
                    if (z12) {
                        long m120517m2 = m120513o.m120517m();
                        long m120518q2 = m120513o.m120518q();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        C23665v c23665v2 = new C23665v(2, m120517m2, m107387c, m93432x ? 1 : 0, i11, m120518q2, currentTimeMillis2);
                        c23665v2.f114654a = 2;
                        c23665v2.f114655b = 2;
                        C0809c1.m2050b(new a(c23665v2));
                        fileInputStream.close();
                    }
                }
            }
        }
        fileInputStream.close();
    }

    /* renamed from: f */
    public void m132940f() {
        if (f123002f != null) {
            m132941g();
        }
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC18928a("LogAppDuration"));
        f123002f = newSingleThreadScheduledExecutor;
        newSingleThreadScheduledExecutor.scheduleWithFixedDelay(new Runnable() { // from class: rh0.b
            @Override // java.lang.Runnable
            public final void run() {
                C25795c.m132937e();
            }
        }, 5000L, 300000L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: g */
    public void m132941g() {
        try {
            ScheduledExecutorService scheduledExecutorService = f123002f;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
        } catch (NullPointerException e11) {
            AbstractC23350e.m122774d(f122997a, e11.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x003f, code lost:            if (r10 > rh0.C25795c.f123004h) goto L85;     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m132942h(long j11) {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            int m120885E0 = AbstractC23309i.m120885E0();
            if (m120885E0 < 0) {
                m120885E0 = 0;
            }
            synchronized (AbstractC23304d.f113293K) {
                try {
                    if (!AbstractC23304d.f113293K.isEmpty()) {
                        if (j11 > AbstractC23309i.m121107K0()) {
                            if (j11 <= f123004h) {
                            }
                            C30242d c30242d = new C30242d();
                            int size = AbstractC23304d.f113293K.size();
                            int i11 = 0;
                            for (int i12 = 0; i12 < size && i11 != m120885E0; i12++) {
                                C23665v c23665v = (C23665v) AbstractC23304d.f113293K.get(i12);
                                arrayList.add(c23665v);
                                long j12 = c23665v.f114656c;
                                c30242d.m149132j(j12, Long.valueOf(j12));
                                i11++;
                            }
                            if (!arrayList.isEmpty()) {
                                for (int size2 = AbstractC23304d.f113293K.size() - 1; size2 >= 0; size2--) {
                                    if (c30242d.m149128f(((C23665v) AbstractC23304d.f113293K.get(size2)).f114656c) != null) {
                                        AbstractC23304d.f113293K.remove(size2);
                                    }
                                }
                            }
                        }
                        if (AbstractC23304d.f113293K.size() >= m120885E0) {
                            if (j11 > AbstractC23309i.m120811C0()) {
                            }
                        }
                    }
                } finally {
                }
            }
            if (!arrayList.isEmpty()) {
                C0824j.m2153b(new b(new ArrayList(arrayList)));
            }
            if (!arrayList.isEmpty()) {
                str = C23665v.m123989g(null, arrayList);
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C0766k c0766k = new C0766k();
            c cVar = new c();
            AbstractC23309i.m122143lr(System.currentTimeMillis());
            c0766k.mo1704o8(cVar);
            c0766k.mo1748u4(str, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
