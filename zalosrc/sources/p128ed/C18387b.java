package p128ed;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import com.zing.zalo.p062db.C7959d;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import qm0.AbstractC25332a0;
import qm0.AbstractC25356m;
import si.C26263i;
import sm0.AbstractC26327c;

/* renamed from: ed.b */
/* loaded from: classes3.dex */
public final class C18387b {

    /* renamed from: a */
    public static final C18387b f92777a = new C18387b();

    /* renamed from: b */
    private static volatile boolean f92778b;

    /* renamed from: ed.b$a */
    /* loaded from: classes3.dex */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            return m135478b;
        }
    }

    private C18387b() {
    }

    /* renamed from: d */
    public static /* synthetic */ void m97386d(C18387b c18387b, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        c18387b.m97389c(z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m97387e() {
        boolean z11;
        List<File> m131320c;
        List m131177E0;
        List list;
        boolean z12;
        boolean z13 = false;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    f92778b = z13;
                    throw th;
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                z13 = false;
            }
            if (f92778b) {
                C18390e.m97413u("runnableCheckRollCache-ignore checking", false, 2, null);
                f92778b = false;
                return;
            }
            f92778b = true;
            File[] listFiles = new File(C18388c.f92779a.m97392c()).listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    m131320c = AbstractC25356m.m131320c(listFiles);
                    long j11 = 0;
                    long j12 = 0;
                    for (File file : m131320c) {
                        if (file.isFile() && file.exists()) {
                            j12 += file.length();
                        }
                    }
                    C18390e.m97413u("rollCacheLocalUpload: totalSize=" + j12 + ", count=" + m131320c.size(), false, 2, null);
                    m131177E0 = AbstractC25332a0.m131177E0(m131320c, new a());
                    int size = m131177E0.size();
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < size) {
                        try {
                            File file2 = (File) m131177E0.get(i11);
                            if (file2.exists() && file2.isFile()) {
                                int i13 = i11 + 1;
                                long length = file2.length();
                                list = m131177E0;
                                try {
                                    C18390e.m97413u("----- rollCacheLocalUpload [" + i13 + "]: file=" + file2 + ", length=" + length + ", time=" + file2.lastModified(), false, 2, null);
                                    if (j12 - j11 <= 209715200) {
                                        if (System.currentTimeMillis() - file2.lastModified() > 259200000) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z12) {
                                        }
                                    } else {
                                        z12 = false;
                                    }
                                    if (i11 == list.size() - 1 && !z12) {
                                        try {
                                            C18390e.m97413u("rollCacheLocalUpload: retain one", false, 2, null);
                                        } catch (Exception e12) {
                                            e = e12;
                                            AbstractC20110a.f98889a.mo104552e(e);
                                            i11++;
                                            m131177E0 = list;
                                        }
                                    } else {
                                        j11 += file2.length();
                                        AbstractC20130d.m104858T0(file2);
                                        i12++;
                                        String name = file2.getName();
                                        AbstractC19074t.m100205c(name);
                                        if (name.length() > 0) {
                                            C7959d.Companion.m41850e().m41690C0(name);
                                        }
                                        C18390e.m97413u("rollCacheLocalUpload: deleted", false, 2, null);
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                }
                            } else {
                                list = m131177E0;
                                C18390e.m97413u("----- rollCacheLocalUpload: file=" + file2 + ", not exist or invalid", false, 2, null);
                            }
                        } catch (Exception e14) {
                            e = e14;
                            list = m131177E0;
                        }
                        i11++;
                        m131177E0 = list;
                    }
                    C18390e.m97413u("rollCacheLocalUpload: totalSizeDeleted=" + j11 + ", totalFileDelete=" + i12, false, 2, null);
                    z13 = false;
                }
            }
            f92778b = z13;
        } catch (Throwable th3) {
            th = th3;
            z13 = false;
        }
    }

    /* renamed from: b */
    public final void m97388b() {
        m97386d(this, false, false, 3, null);
    }

    /* renamed from: c */
    public final void m97389c(boolean z11, boolean z12) {
        if (!C18390e.f92781a.m97415b()) {
            return;
        }
        if (!z12) {
            if (C26263i.m135055u().m135071M()) {
                C18390e.m97413u("runnableCheckRollCache-ignore syncing", false, 2, null);
                return;
            } else if (System.currentTimeMillis() - AbstractC0924m0.m3213L2() < 86400000) {
                C18390e.m97413u("runnableCheckRollCache-ignore interval time invalid", false, 2, null);
                return;
            }
        }
        AbstractC0924m0.m3172Jj(System.currentTimeMillis());
        if (z11) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ed.a
                @Override // java.lang.Runnable
                public final void run() {
                    C18387b.this.m97387e();
                }
            });
        } else {
            m97387e();
        }
    }
}
