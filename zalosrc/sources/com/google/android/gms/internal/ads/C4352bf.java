package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.bf */
/* loaded from: classes2.dex */
public final class C4352bf extends AbstractCallableC4316ag {

    /* renamed from: j */
    private static final C4353bg f17723j = new C4353bg();

    /* renamed from: i */
    private final Context f17724i;

    public C4352bf(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12, Context context, C4678ka c4678ka) {
        super(c4719le, "hhtrMjcGMTQSGdrv1+l2gakNTe0Pfchc8VT5kRHtsehlafuJ8JEE4iewNV4y5I/U", "o5W1eROpLyVNcsDGW3Y0lGc2x/V+mDPvMXouv3gbW6M=", c4939ra, i11, 27);
        this.f17724i = context;
    }

    /* renamed from: d */
    private final String m20497d() {
        try {
            if (this.f17021b.m24249l() != null) {
                this.f17021b.m24249l().get();
            }
            C4606ib m24241c = this.f17021b.m24241c();
            if (m24241c != null && m24241c.m23218r0()) {
                return m24241c.m23216F0();
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        Boolean bool;
        int i11;
        boolean z11;
        String str;
        C5200yb c5200yb;
        AtomicReference m20512a = f17723j.m20512a(this.f17724i.getPackageName());
        synchronized (m20512a) {
            try {
                C5200yb c5200yb2 = (C5200yb) m20512a.get();
                if (c5200yb2 != null) {
                    if (!AbstractC4831oe.m25172g(c5200yb2.f30870a)) {
                        if (!c5200yb2.f30870a.equals("E")) {
                            if (c5200yb2.f30870a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                            }
                            c5200yb = (C5200yb) m20512a.get();
                        }
                    }
                }
                if (!AbstractC4831oe.m25172g(null)) {
                    i11 = 5;
                } else {
                    if (!AbstractC4831oe.m25172g(null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    if (bool.booleanValue() && this.f17021b.m24251p()) {
                        i11 = 4;
                    } else {
                        i11 = 3;
                    }
                }
                if (i11 == 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Boolean valueOf = Boolean.valueOf(z11);
                Boolean bool2 = (Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21170Y1);
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21161X1)).booleanValue()) {
                    str = m20498c();
                } else {
                    str = null;
                }
                if (bool2.booleanValue() && this.f17021b.m24251p() && AbstractC4831oe.m25172g(str)) {
                    str = m20497d();
                }
                C5200yb c5200yb3 = new C5200yb((String) this.f17025f.invoke(null, this.f17724i, valueOf, str));
                if (AbstractC4831oe.m25172g(c5200yb3.f30870a) || c5200yb3.f30870a.equals("E")) {
                    int i12 = i11 - 1;
                    if (i12 != 3) {
                        if (i12 == 4) {
                            throw null;
                        }
                    } else {
                        String m20497d = m20497d();
                        if (!AbstractC4831oe.m25172g(m20497d)) {
                            c5200yb3.f30870a = m20497d;
                        }
                    }
                }
                m20512a.set(c5200yb3);
                c5200yb = (C5200yb) m20512a.get();
            } finally {
            }
        }
        synchronized (this.f17024e) {
            if (c5200yb != null) {
                try {
                    this.f17024e.m26003C0(c5200yb.f30870a);
                    this.f17024e.m26017T(c5200yb.f30871b);
                    this.f17024e.m26019V(c5200yb.f30872c);
                    this.f17024e.m26034m0(c5200yb.f30873d);
                    this.f17024e.m26001B0(c5200yb.f30874e);
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    protected final String m20498c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] m25174i = AbstractC4831oe.m25174i((String) zzay.zzc().m21823b(AbstractC4554gx.f21179Z1));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(m25174i)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(AbstractC4831oe.m25174i((String) zzay.zzc().m21823b(AbstractC4554gx.f21189a2)))));
            }
            Context context = this.f17724i;
            String packageName = context.getPackageName();
            this.f17021b.m24248k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final cd3 m20862D = cd3.m20862D();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.fg
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    cd3 cd3Var = cd3.this;
                    if (list == null) {
                        cd3Var.mo20863g(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ApkChecksum m20870a = AbstractC4389cg.m20870a(list.get(i11));
                            type = m20870a.getType();
                            if (type == 8) {
                                value = m20870a.getValue();
                                cd3Var.mo20863g(AbstractC4831oe.m25168c(value));
                                return;
                            }
                        }
                        cd3Var.mo20863g(null);
                    } catch (Throwable unused) {
                        cd3Var.mo20863g(null);
                    }
                }
            });
            return (String) m20862D.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
