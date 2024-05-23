package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import androidx.profileinstaller.AbstractC1854j;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: androidx.profileinstaller.j */
/* loaded from: classes.dex */
public abstract class AbstractC1854j {

    /* renamed from: a */
    private static final c f7595a = new a();

    /* renamed from: b */
    static final c f7596b = new b();

    /* renamed from: androidx.profileinstaller.j$a */
    /* loaded from: classes.dex */
    class a implements c {
        a() {
        }

        @Override // androidx.profileinstaller.AbstractC1854j.c
        /* renamed from: a */
        public void mo9515a(int i11, Object obj) {
        }

        @Override // androidx.profileinstaller.AbstractC1854j.c
        /* renamed from: b */
        public void mo9516b(int i11, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.j$b */
    /* loaded from: classes.dex */
    class b implements c {
        b() {
        }

        @Override // androidx.profileinstaller.AbstractC1854j.c
        /* renamed from: a */
        public void mo9515a(int i11, Object obj) {
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    if (i11 == 6 || i11 == 7 || i11 == 8) {
                        return;
                    }
                    return;
            }
        }

        @Override // androidx.profileinstaller.AbstractC1854j.c
        /* renamed from: b */
        public void mo9516b(int i11, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.j$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        void mo9515a(int i11, Object obj);

        /* renamed from: b */
        void mo9516b(int i11, Object obj);
    }

    /* renamed from: b */
    static boolean m9571b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* renamed from: c */
    public static void m9572c(Context context, Executor executor, c cVar) {
        m9571b(context.getFilesDir());
        m9576g(executor, cVar, 11, null);
    }

    /* renamed from: d */
    static boolean m9573d(PackageInfo packageInfo, File file, c cVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        boolean z11 = false;
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                if (readLong == packageInfo.lastUpdateTime) {
                    z11 = true;
                }
                if (z11) {
                    cVar.mo9515a(2, null);
                }
                return z11;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    static void m9575f(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: g */
    static void m9576g(Executor executor, c cVar, int i11, Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.i

            /* renamed from: q */
            public final /* synthetic */ int f7593q;

            /* renamed from: r */
            public final /* synthetic */ Object f7594r;

            public /* synthetic */ RunnableC1853i(int i112, Object obj2) {
                r2 = i112;
                r3 = obj2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1854j.c.this.mo9515a(r2, r3);
            }
        });
    }

    /* renamed from: h */
    private static boolean m9577h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) {
        C1848d c1848d = new C1848d(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!c1848d.m9546e()) {
            return false;
        }
        boolean m9549n = c1848d.m9547i().m9548m().m9549n();
        if (m9549n) {
            m9575f(packageInfo, file);
        }
        return m9549n;
    }

    /* renamed from: i */
    public static void m9578i(Context context) {
        m9579j(context, new ExecutorC1852h(), f7595a);
    }

    /* renamed from: j */
    public static void m9579j(Context context, Executor executor, c cVar) {
        m9580k(context, executor, cVar, false);
    }

    /* renamed from: k */
    public static void m9580k(Context context, Executor executor, c cVar, boolean z11) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z12 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z11 && m9573d(packageInfo, filesDir, cVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Skipping profile installation for ");
                sb2.append(context.getPackageName());
                AbstractC1861q.m9626c(context, false);
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Installing profile for ");
            sb3.append(context.getPackageName());
            if (m9577h(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z11) {
                z12 = true;
            }
            AbstractC1861q.m9626c(context, z12);
        } catch (PackageManager.NameNotFoundException e11) {
            cVar.mo9515a(7, e11);
            AbstractC1861q.m9626c(context, false);
        }
    }

    /* renamed from: l */
    public static void m9581l(Context context, Executor executor, c cVar) {
        try {
            m9575f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m9576g(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e11) {
            m9576g(executor, cVar, 7, e11);
        }
    }
}
