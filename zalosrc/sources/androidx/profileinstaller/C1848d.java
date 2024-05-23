package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.AbstractC1854j;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: androidx.profileinstaller.d */
/* loaded from: classes2.dex */
public class C1848d {

    /* renamed from: a */
    private final AssetManager f7565a;

    /* renamed from: b */
    private final Executor f7566b;

    /* renamed from: c */
    private final AbstractC1854j.c f7567c;

    /* renamed from: e */
    private final File f7569e;

    /* renamed from: f */
    private final String f7570f;

    /* renamed from: g */
    private final String f7571g;

    /* renamed from: h */
    private final String f7572h;

    /* renamed from: j */
    private C1849e[] f7574j;

    /* renamed from: k */
    private byte[] f7575k;

    /* renamed from: i */
    private boolean f7573i = false;

    /* renamed from: d */
    private final byte[] f7568d = m9539d();

    public C1848d(AssetManager assetManager, Executor executor, AbstractC1854j.c cVar, String str, String str2, String str3, File file) {
        this.f7565a = assetManager;
        this.f7566b = executor;
        this.f7567c = cVar;
        this.f7570f = str;
        this.f7571g = str2;
        this.f7572h = str3;
        this.f7569e = file;
    }

    /* renamed from: b */
    private C1848d m9537b(C1849e[] c1849eArr, byte[] bArr) {
        InputStream m9542h;
        try {
            m9542h = m9542h(this.f7565a, this.f7572h);
        } catch (FileNotFoundException e11) {
            this.f7567c.mo9515a(9, e11);
        } catch (IOException e12) {
            this.f7567c.mo9515a(7, e12);
        } catch (IllegalStateException e13) {
            this.f7574j = null;
            this.f7567c.mo9515a(8, e13);
        }
        if (m9542h != null) {
            try {
                this.f7574j = AbstractC1860p.m9614q(m9542h, AbstractC1860p.m9612o(m9542h, AbstractC1860p.f7603b), bArr, c1849eArr);
                m9542h.close();
                return this;
            } catch (Throwable th2) {
                try {
                    m9542h.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (m9542h != null) {
            m9542h.close();
        }
        return null;
    }

    /* renamed from: c */
    private void m9538c() {
        if (this.f7573i) {
        } else {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    /* renamed from: d */
    private static byte[] m9539d() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 24 || i11 > 34) {
            return null;
        }
        switch (i11) {
            case 24:
            case 25:
                return AbstractC1862r.f7618e;
            case 26:
                return AbstractC1862r.f7617d;
            case 27:
                return AbstractC1862r.f7616c;
            case 28:
            case 29:
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                return AbstractC1862r.f7615b;
            case 31:
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
            case 33:
            case 34:
                return AbstractC1862r.f7614a;
            default:
                return null;
        }
    }

    /* renamed from: f */
    private InputStream m9540f(AssetManager assetManager) {
        try {
            return m9542h(assetManager, this.f7571g);
        } catch (FileNotFoundException e11) {
            this.f7567c.mo9515a(6, e11);
            return null;
        } catch (IOException e12) {
            this.f7567c.mo9515a(7, e12);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m9541g(int i11, Object obj) {
        this.f7567c.mo9515a(i11, obj);
    }

    /* renamed from: h */
    private InputStream m9542h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e11) {
            String message = e11.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f7567c.mo9516b(5, null);
            }
            return null;
        }
    }

    /* renamed from: j */
    private C1849e[] m9543j(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        C1849e[] m9620w = AbstractC1860p.m9620w(inputStream, AbstractC1860p.m9612o(inputStream, AbstractC1860p.f7602a), this.f7570f);
                        try {
                            inputStream.close();
                            return m9620w;
                        } catch (IOException e11) {
                            this.f7567c.mo9515a(7, e11);
                            return m9620w;
                        }
                    } catch (IOException e12) {
                        this.f7567c.mo9515a(7, e12);
                        inputStream.close();
                        return null;
                    }
                } catch (IllegalStateException e13) {
                    this.f7567c.mo9515a(8, e13);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e14) {
                this.f7567c.mo9515a(7, e14);
                return null;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException e15) {
                this.f7567c.mo9515a(7, e15);
            }
            throw th2;
        }
    }

    /* renamed from: k */
    private static boolean m9544k() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 24 || i11 > 34) {
            return false;
        }
        if (i11 != 24 && i11 != 25) {
            switch (i11) {
                case 31:
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                case 33:
                case 34:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    private void m9545l(final int i11, final Object obj) {
        this.f7566b.execute(new Runnable() { // from class: androidx.profileinstaller.c
            @Override // java.lang.Runnable
            public final void run() {
                C1848d.this.m9541g(i11, obj);
            }
        });
    }

    /* renamed from: e */
    public boolean m9546e() {
        if (this.f7568d == null) {
            m9545l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.f7569e.exists()) {
            if (!this.f7569e.canWrite()) {
                m9545l(4, null);
                return false;
            }
        } else {
            try {
                this.f7569e.createNewFile();
            } catch (IOException unused) {
                m9545l(4, null);
                return false;
            }
        }
        this.f7573i = true;
        return true;
    }

    /* renamed from: i */
    public C1848d m9547i() {
        C1848d m9537b;
        m9538c();
        if (this.f7568d == null) {
            return this;
        }
        InputStream m9540f = m9540f(this.f7565a);
        if (m9540f != null) {
            this.f7574j = m9543j(m9540f);
        }
        C1849e[] c1849eArr = this.f7574j;
        if (c1849eArr != null && m9544k() && (m9537b = m9537b(c1849eArr, this.f7568d)) != null) {
            return m9537b;
        }
        return this;
    }

    /* renamed from: m */
    public C1848d m9548m() {
        ByteArrayOutputStream byteArrayOutputStream;
        C1849e[] c1849eArr = this.f7574j;
        byte[] bArr = this.f7568d;
        if (c1849eArr != null && bArr != null) {
            m9538c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e11) {
                this.f7567c.mo9515a(7, e11);
            } catch (IllegalStateException e12) {
                this.f7567c.mo9515a(8, e12);
            }
            try {
                AbstractC1860p.m9587E(byteArrayOutputStream, bArr);
                if (!AbstractC1860p.m9584B(byteArrayOutputStream, bArr, c1849eArr)) {
                    this.f7567c.mo9515a(5, null);
                    this.f7574j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f7575k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f7574j = null;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this;
    }

    /* renamed from: n */
    public boolean m9549n() {
        byte[] bArr = this.f7575k;
        if (bArr == null) {
            return false;
        }
        m9538c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f7569e);
                    try {
                        AbstractC1850f.m9561l(byteArrayInputStream, fileOutputStream);
                        m9545l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e11) {
                m9545l(6, e11);
                return false;
            } catch (IOException e12) {
                m9545l(7, e12);
                return false;
            }
        } finally {
            this.f7575k = null;
            this.f7574j = null;
        }
    }
}
