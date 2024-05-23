package nl0;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.os.StatFs;
import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import ol0.C24307e;
import ol0.InterfaceC24305c;

/* renamed from: nl0.d */
/* loaded from: classes7.dex */
public final class C23874d {

    /* renamed from: a */
    private final InterfaceC24305c f115419a;

    /* renamed from: b */
    private Runnable f115420b;

    /* renamed from: c */
    private String f115421c;

    /* renamed from: nl0.d$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a */
        public final long f115422a;

        /* renamed from: b */
        public final long f115423b;

        public b(long j11, long j12) {
            this.f115422a = j11;
            this.f115423b = j12;
        }

        /* renamed from: a */
        public static b m124923a() {
            return new b(209715200L, 419430400L);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f115422a == bVar.f115422a && this.f115423b == bVar.f115423b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f115422a), Long.valueOf(this.f115423b));
        }

        public String toString() {
            return "CacheConfig{minFreeSpace=" + this.f115422a + ", maxStorage=" + this.f115423b + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nl0.d$c */
    /* loaded from: classes7.dex */
    public static class c {

        /* renamed from: a */
        static final C23874d f115424a = new C23874d();
    }

    /* renamed from: d */
    private void m124912d(File file, b bVar) {
        ArrayList arrayList = new ArrayList();
        long m124919m = m124919m(file, arrayList);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Current cache size before cleanup: ");
        float f11 = (((float) m124919m) / 1024.0f) / 1024.0f;
        sb2.append(f11);
        sb2.append("MB");
        AbstractC20110a.m104535d(sb2.toString(), new Object[0]);
        Collections.sort(arrayList, new Comparator() { // from class: nl0.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m124916j;
                m124916j = C23874d.m124916j((File) obj, (File) obj2);
                return m124916j;
            }
        });
        if (m124919m < bVar.f115423b) {
            return;
        }
        AbstractC20110a.m104535d("Current cache size before cleanup: " + f11 + "MB", new Object[0]);
        long j11 = bVar.f115423b >> 1;
        for (int i11 = 0; m124919m > j11 && i11 < arrayList.size(); i11++) {
            File file2 = (File) arrayList.get(i11);
            long length = file2.length();
            if (file2.delete()) {
                m124919m -= length;
            }
        }
        AbstractC20110a.m104535d("Current cache size after cleanup: " + ((((float) m124919m) / 1024.0f) / 1024.0f) + "MB", new Object[0]);
    }

    /* renamed from: e */
    private void m124913e(File file, b bVar) {
        ArrayList arrayList = new ArrayList();
        m124919m(file, arrayList);
        Collections.sort(arrayList, new Comparator() { // from class: nl0.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m124917k;
                m124917k = C23874d.m124917k((File) obj, (File) obj2);
                return m124917k;
            }
        });
        StatFs statFs = new StatFs(file.getPath());
        AbstractC20110a.m104535d("Free space before cleanup: " + (((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024) / 1024) + "MB", new Object[0]);
        int i11 = 0;
        while (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() < bVar.f115422a && i11 < arrayList.size()) {
            ((File) arrayList.get(i11)).delete();
            i11++;
            statFs.restat(file.getPath());
        }
        AbstractC20110a.m104535d("Free space after cleanup: " + (((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024) / 1024) + "MB", new Object[0]);
    }

    /* renamed from: f */
    private void m124914f(final b bVar) {
        Runnable runnable = this.f115420b;
        if (runnable != null) {
            this.f115419a.mo126932a(runnable);
            this.f115420b = null;
        }
        InterfaceC24305c interfaceC24305c = this.f115419a;
        Runnable runnable2 = new Runnable() { // from class: nl0.a
            @Override // java.lang.Runnable
            public final void run() {
                C23874d.this.m124918l(bVar);
            }
        };
        this.f115420b = runnable2;
        interfaceC24305c.mo126933b(runnable2);
    }

    /* renamed from: i */
    public static C23874d m124915i() {
        return c.f115424a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ int m124916j(File file, File file2) {
        return (int) (file.lastModified() - file2.lastModified());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ int m124917k(File file, File file2) {
        return (int) (file.lastModified() - file2.lastModified());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m124918l(b bVar) {
        File file = new File(m124920g());
        try {
            if (!file.exists() && !file.mkdir()) {
                AbstractC20110a.m104535d("Cannot create cache folder?", new Object[0]);
            } else {
                m124912d(file, bVar);
                m124913e(file, bVar);
            }
        } catch (SecurityException unused) {
        }
    }

    /* renamed from: m */
    private long m124919m(File file, List list) {
        long length;
        File[] listFiles = file.listFiles();
        long j11 = 0;
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    length = m124919m(file2, list);
                } else {
                    list.add(file2);
                    length = file2.length();
                }
                j11 += length;
            }
        }
        return j11;
    }

    /* renamed from: g */
    public synchronized String m124920g() {
        File cacheDir;
        try {
            if (TextUtils.isEmpty(this.f115421c)) {
                Context appContext = CoreUtility.getAppContext();
                if (appContext.getExternalCacheDir() != null) {
                    cacheDir = appContext.getExternalCacheDir();
                } else {
                    cacheDir = appContext.getCacheDir();
                }
                this.f115421c = cacheDir.getPath().concat("/zlottie");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f115421c;
    }

    /* renamed from: h */
    public InterfaceC24305c m124921h() {
        return this.f115419a;
    }

    /* renamed from: n */
    public synchronized void m124922n(b bVar) {
        AbstractC20110a.m104535d("Set cache config: %s", bVar);
        m124914f(bVar);
    }

    private C23874d() {
        this.f115419a = new C24307e(AbstractC0837p0.m2225f());
        this.f115420b = null;
        this.f115421c = "";
        m124922n(b.m124923a());
    }
}
