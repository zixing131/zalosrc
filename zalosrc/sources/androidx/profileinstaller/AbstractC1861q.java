package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.C1247c;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* renamed from: androidx.profileinstaller.q */
/* loaded from: classes.dex */
public abstract class AbstractC1861q {

    /* renamed from: a */
    private static final C1247c f7604a = C1247c.m5922z();

    /* renamed from: b */
    private static final Object f7605b = new Object();

    /* renamed from: c */
    private static c f7606c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.profileinstaller.q$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static PackageInfo m9627a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* renamed from: androidx.profileinstaller.q$b */
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a */
        final int f7607a;

        /* renamed from: b */
        final int f7608b;

        /* renamed from: c */
        final long f7609c;

        /* renamed from: d */
        final long f7610d;

        b(int i11, int i12, long j11, long j12) {
            this.f7607a = i11;
            this.f7608b = i12;
            this.f7609c = j11;
            this.f7610d = j12;
        }

        /* renamed from: a */
        static b m9628a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        /* renamed from: b */
        void m9629b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f7607a);
                dataOutputStream.writeInt(this.f7608b);
                dataOutputStream.writeLong(this.f7609c);
                dataOutputStream.writeLong(this.f7610d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f7608b == bVar.f7608b && this.f7609c == bVar.f7609c && this.f7607a == bVar.f7607a && this.f7610d == bVar.f7610d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f7608b), Long.valueOf(this.f7609c), Integer.valueOf(this.f7607a), Long.valueOf(this.f7610d));
        }
    }

    /* renamed from: androidx.profileinstaller.q$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final int f7611a;

        /* renamed from: b */
        private final boolean f7612b;

        /* renamed from: c */
        private final boolean f7613c;

        c(int i11, boolean z11, boolean z12) {
            this.f7611a = i11;
            this.f7613c = z12;
            this.f7612b = z11;
        }
    }

    /* renamed from: a */
    private static long m9624a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return a.m9627a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    private static c m9625b(int i11, boolean z11, boolean z12) {
        c cVar = new c(i11, z11, z12);
        f7606c = cVar;
        f7604a.mo5911v(cVar);
        return f7606c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:            r3 = 196608;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:            r3 = 1;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c m9626c(Context context, boolean z11) {
        boolean z12;
        boolean z13;
        b m9628a;
        b bVar;
        int i11;
        c cVar;
        if (!z11 && (cVar = f7606c) != null) {
            return cVar;
        }
        synchronized (f7605b) {
            if (!z11) {
                try {
                    c cVar2 = f7606c;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int i12 = Build.VERSION.SDK_INT;
            int i13 = 0;
            if (i12 >= 28 && i12 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                if (file.exists() && length > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                if (file2.exists() && length2 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                try {
                    long m9624a = m9624a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            m9628a = b.m9628a(file3);
                        } catch (IOException unused) {
                            return m9625b(131072, z12, z13);
                        }
                    } else {
                        m9628a = null;
                    }
                    if (m9628a != null && m9628a.f7609c == m9624a && (i11 = m9628a.f7608b) != 2) {
                        i13 = i11;
                        if (z11 && z13 && i13 != 1) {
                            i13 = 2;
                        }
                        if (m9628a != null && m9628a.f7608b == 2 && i13 == 1 && length < m9628a.f7610d) {
                            i13 = 3;
                        }
                        bVar = new b(1, i13, m9624a, length2);
                        if (m9628a != null || !m9628a.equals(bVar)) {
                            bVar.m9629b(file3);
                        }
                        return m9625b(i13, z12, z13);
                    }
                    if (z13) {
                        i13 = 2;
                    }
                    if (z11) {
                        i13 = 2;
                    }
                    if (m9628a != null) {
                        i13 = 3;
                    }
                    bVar = new b(1, i13, m9624a, length2);
                    if (m9628a != null) {
                    }
                    bVar.m9629b(file3);
                    return m9625b(i13, z12, z13);
                } catch (PackageManager.NameNotFoundException unused2) {
                    return m9625b(65536, z12, z13);
                }
            }
            return m9625b(262144, false, false);
        }
    }
}
