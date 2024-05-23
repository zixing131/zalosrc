package p231i7;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.splitinstall.internal.zzbh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p258j7.AbstractC20973r0;
import p258j7.C20975s0;
import p258j7.C20985x0;
import p258j7.C20988z;
import p258j7.EnumC20967o0;
import p291k7.AbstractC21534q;
import p291k7.C21507h;
import p291k7.C21516k;
import p291k7.C21525n;
import p291k7.InterfaceC21528o;

/* renamed from: i7.b */
/* loaded from: classes.dex */
public class C20358b {

    /* renamed from: e */
    private static final AtomicReference f100367e = new AtomicReference(null);

    /* renamed from: f */
    public static final /* synthetic */ int f100368f = 0;

    /* renamed from: a */
    private final C20363g f100369a;

    /* renamed from: b */
    private final C20988z f100370b;

    /* renamed from: c */
    private final Set f100371c = new HashSet();

    /* renamed from: d */
    private final C20359c f100372d;

    private C20358b(Context context) {
        try {
            C20363g c20363g = new C20363g(context);
            this.f100369a = c20363g;
            this.f100372d = new C20359c(c20363g);
            this.f100370b = new C20988z(context);
        } catch (PackageManager.NameNotFoundException e11) {
            throw new zzbh("Failed to initialize FileStorage", e11);
        }
    }

    /* renamed from: a */
    public static boolean m106109a(Context context) {
        return m106118j(context, false);
    }

    /* renamed from: e */
    public static boolean m106113e(Context context) {
        return m106118j(context, true);
    }

    /* renamed from: f */
    public static boolean m106114f() {
        if (f100367e.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final Set m106115g() {
        HashSet hashSet;
        synchronized (this.f100371c) {
            hashSet = new HashSet(this.f100371c);
        }
        return hashSet;
    }

    /* renamed from: h */
    public final void m106116h(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C20363g.m106125l(this.f100369a.m106142g((String) it.next()));
        }
        this.f100370b.m109544b();
    }

    /* renamed from: i */
    private final synchronized void m106117i(Context context, boolean z11) {
        List<String> asList;
        ZipFile zipFile;
        try {
            if (z11) {
                this.f100369a.m106146k();
            } else {
                AbstractC20362f.m106124a().execute(new RunnableC20375s(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                if (strArr == null) {
                    asList = new ArrayList();
                } else {
                    asList = Arrays.asList(strArr);
                }
                Set<AbstractC20378v> m106145j = this.f100369a.m106145j();
                Set m109543a = this.f100370b.m109543a();
                HashSet hashSet = new HashSet();
                Iterator it = m106145j.iterator();
                while (it.hasNext()) {
                    String mo106123b = ((AbstractC20378v) it.next()).mo106123b();
                    if (asList.contains(mo106123b) || m109543a.contains(C20975s0.m109507b(mo106123b))) {
                        hashSet.add(mo106123b);
                        it.remove();
                    }
                }
                if (z11) {
                    m106116h(hashSet);
                } else if (!hashSet.isEmpty()) {
                    AbstractC20362f.m106124a().execute(new RunnableC20376t(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = m106145j.iterator();
                while (it2.hasNext()) {
                    String mo106123b2 = ((AbstractC20378v) it2.next()).mo106123b();
                    if (!C20975s0.m109508e(mo106123b2)) {
                        hashSet2.add(mo106123b2);
                    }
                }
                for (String str : asList) {
                    if (!C20975s0.m109508e(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<AbstractC20378v> hashSet3 = new HashSet(m106145j.size());
                for (AbstractC20378v abstractC20378v : m106145j) {
                    String mo106123b3 = abstractC20378v.mo106123b();
                    int i11 = C20975s0.f102887d;
                    if (mo106123b3.startsWith("config.") || hashSet2.contains(C20975s0.m109507b(abstractC20378v.mo106123b()))) {
                        hashSet3.add(abstractC20378v);
                    }
                }
                C20372p c20372p = new C20372p(this.f100369a);
                InterfaceC21528o m111190a = AbstractC21534q.m111190a();
                ClassLoader classLoader = context.getClassLoader();
                if (z11) {
                    m111190a.mo111103b(classLoader, c20372p.m106157c());
                } else {
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        Set m106156b = c20372p.m106156b((AbstractC20378v) it3.next());
                        if (m106156b == null) {
                            it3.remove();
                        } else {
                            m111190a.mo111103b(classLoader, m106156b);
                        }
                    }
                }
                HashSet hashSet4 = new HashSet();
                for (AbstractC20378v abstractC20378v2 : hashSet3) {
                    try {
                        zipFile = new ZipFile(abstractC20378v2.mo106122a());
                        try {
                            ZipEntry entry = zipFile.getEntry("classes.dex");
                            zipFile.close();
                            if (entry != null && !m111190a.mo111102a(classLoader, this.f100369a.m106136a(abstractC20378v2.mo106123b()), abstractC20378v2.mo106122a(), z11)) {
                                "split was not installed ".concat(abstractC20378v2.mo106122a().toString());
                            }
                            hashSet4.add(abstractC20378v2.mo106122a());
                        } catch (IOException e11) {
                            e = e11;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e12) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e12);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw e;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        zipFile = null;
                    }
                }
                this.f100372d.m106121a(context, hashSet4);
                HashSet hashSet5 = new HashSet();
                for (AbstractC20378v abstractC20378v3 : hashSet3) {
                    if (hashSet4.contains(abstractC20378v3.mo106122a())) {
                        String mo106123b4 = abstractC20378v3.mo106123b();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Split '");
                        sb2.append(mo106123b4);
                        sb2.append("' installation emulated");
                        hashSet5.add(abstractC20378v3.mo106123b());
                    } else {
                        String mo106123b5 = abstractC20378v3.mo106123b();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Split '");
                        sb3.append(mo106123b5);
                        sb3.append("' installation not emulated.");
                    }
                }
                synchronized (this.f100371c) {
                    this.f100371c.addAll(hashSet5);
                }
            } catch (PackageManager.NameNotFoundException e14) {
                throw new IOException(String.format("Cannot load data for application '%s'", packageName), e14);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: j */
    private static boolean m106118j(Context context, boolean z11) {
        boolean z12;
        if (m106119k()) {
            return false;
        }
        AtomicReference atomicReference = f100367e;
        C20358b c20358b = new C20358b(context);
        while (true) {
            if (AbstractC20357a.m106108a(atomicReference, null, c20358b)) {
                z12 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z12 = false;
                break;
            }
        }
        C20358b c20358b2 = (C20358b) f100367e.get();
        if (z12) {
            EnumC20967o0.INSTANCE.m109503b(new C21516k(context, AbstractC20362f.m106124a(), new C21525n(context, c20358b2.f100369a, new C21507h()), c20358b2.f100369a, new C20377u()));
            AbstractC20973r0.m109506b(new C20374r(c20358b2));
            AbstractC20362f.m106124a().execute(new Runnable() { // from class: i7.q

                /* renamed from: p */
                public final /* synthetic */ Context f100395p;

                public /* synthetic */ RunnableC20373q(Context context2) {
                    r1 = context2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = r1;
                    int i11 = C20358b.f100368f;
                    try {
                        C20985x0.m109538g(context2).m111184c(true);
                    } catch (SecurityException unused) {
                    }
                }
            });
        }
        try {
            c20358b2.m106117i(context2, z11);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    private static boolean m106119k() {
        return false;
    }
}
