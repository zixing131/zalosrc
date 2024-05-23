package vg;

import ag0.AbstractC0837p0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import p516t3.C26469c;
import p516t3.C26473g;
import p536u3.AbstractC27005l;
import p566v3.C27508p;

/* renamed from: vg.i5 */
/* loaded from: classes3.dex */
public class C28092i5 {

    /* renamed from: a */
    private static volatile C28092i5 f131047a;

    /* renamed from: vg.i5$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo141505a(C27508p c27508p);

        /* renamed from: b */
        void mo141506b();

        /* renamed from: c */
        void mo141507c();

        /* renamed from: d */
        void mo141508d(C27508p c27508p, String str);
    }

    /* renamed from: c */
    public static synchronized C28092i5 m141562c() {
        C28092i5 c28092i5;
        synchronized (C28092i5.class) {
            try {
                if (f131047a == null) {
                    synchronized (C28092i5.class) {
                        try {
                            if (f131047a == null) {
                                f131047a = new C28092i5();
                            }
                        } finally {
                        }
                    }
                }
                c28092i5 = f131047a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28092i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m141563d(String str, String str2, a aVar, String str3) {
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(str);
                if (file.exists()) {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        C27508p m139132a = AbstractC27005l.m139132a(fileInputStream2, str2);
                        if (m139132a != null) {
                            if (aVar != null) {
                                aVar.mo141505a(m139132a);
                            }
                            if (aVar != null) {
                                aVar.mo141508d(m139132a, str3);
                            }
                        } else if (aVar != null) {
                            aVar.mo141507c();
                        }
                        fileInputStream = fileInputStream2;
                    } catch (IOException e11) {
                        e = e11;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (aVar != null) {
                            aVar.mo141507c();
                        }
                        if (fileInputStream == null) {
                            return;
                        }
                        fileInputStream.close();
                    } catch (Exception e12) {
                        e = e12;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (aVar != null) {
                            aVar.mo141507c();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                }
                if (fileInputStream == null) {
                    return;
                }
            } catch (IOException e13) {
                e = e13;
            } catch (Exception e14) {
                e = e14;
            }
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: b */
    public void m141564b(final String str, final String str2, final String str3, final a aVar) {
        if (aVar != null) {
            aVar.mo141506b();
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vg.h5
            @Override // java.lang.Runnable
            public final void run() {
                C28092i5.m141563d(str2, str, aVar, str3);
            }
        });
    }

    /* renamed from: e */
    public C26469c m141565e(C27508p c27508p) {
        if (c27508p == null) {
            return null;
        }
        return new C26473g().m136448b(c27508p).m136449c(60).m136447a();
    }
}
