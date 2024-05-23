package p291k7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import com.google.android.play.core.splitinstall.internal.AbstractC6516c;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p231i7.C20359c;
import p231i7.C20363g;

/* renamed from: k7.n */
/* loaded from: classes.dex */
public final class C21525n {

    /* renamed from: a */
    private final C20363g f104560a;

    /* renamed from: b */
    private final C21507h f104561b;

    /* renamed from: c */
    private final Context f104562c;

    /* renamed from: d */
    private final C21519l f104563d;

    /* renamed from: e */
    private PackageInfo f104564e;

    public C21525n(Context context, C20363g c20363g, C21507h c21507h) {
        C21519l c21519l = new C21519l(new C20359c(c20363g));
        this.f104560a = c20363g;
        this.f104561b = c21507h;
        this.f104562c = context;
        this.f104563d = c21519l;
    }

    /* renamed from: d */
    private final PackageInfo m111177d() {
        if (this.f104564e == null) {
            try {
                this.f104564e = this.f104562c.getPackageManager().getPackageInfo(this.f104562c.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f104564e;
    }

    /* renamed from: e */
    private static X509Certificate m111178e(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m111179a(File[] fileArr) {
        long j11;
        PackageInfo m111177d = m111177d();
        if (Build.VERSION.SDK_INT >= 28) {
            j11 = m111177d.getLongVersionCode();
        } else {
            j11 = m111177d.versionCode;
        }
        AssetManager assetManager = (AssetManager) AbstractC6516c.m33395c(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length >= 0) {
                this.f104563d.m111173b(assetManager, fileArr[length]);
            } else {
                return true;
            }
        } while (j11 == this.f104563d.m111172a());
        return false;
    }

    /* renamed from: b */
    public final boolean m111180b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f104560a.m106142g(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m111181c(File[] fileArr) {
        PackageInfo m111177d = m111177d();
        ArrayList<X509Certificate> arrayList = null;
        if (m111177d != null && m111177d.signatures != null) {
            arrayList = new ArrayList();
            for (Signature signature : m111177d.signatures) {
                X509Certificate m111178e = m111178e(signature);
                if (m111178e != null) {
                    arrayList.add(m111178e);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length >= 0) {
                try {
                    String absolutePath = fileArr[length].getAbsolutePath();
                    try {
                        X509Certificate[][] m111110a = AbstractC21500e1.m111110a(absolutePath);
                        if (m111110a == null || m111110a.length == 0 || m111110a[0].length == 0) {
                            break;
                        }
                        if (arrayList.isEmpty()) {
                            break;
                        }
                        for (X509Certificate x509Certificate : arrayList) {
                            for (X509Certificate[] x509CertificateArr : m111110a) {
                                if (!x509CertificateArr[0].equals(x509Certificate)) {
                                }
                            }
                        }
                    } catch (Exception unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Downloaded split ");
                        sb2.append(absolutePath);
                        sb2.append(" is not signed.");
                    }
                } catch (Exception unused2) {
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
