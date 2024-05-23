package p231i7;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: i7.p */
/* loaded from: classes.dex */
public final class C20372p {

    /* renamed from: b */
    private static final Pattern f100393b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a */
    private final C20363g f100394a;

    public C20372p(C20363g c20363g) {
        this.f100394a = c20363g;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Set m106152a(C20372p c20372p, Set set, AbstractC20378v abstractC20378v, ZipFile zipFile) {
        HashSet hashSet = new HashSet();
        c20372p.m106155f(abstractC20378v, set, new C20368l(c20372p, hashSet, abstractC20378v, zipFile));
        return hashSet;
    }

    /* renamed from: e */
    private static void m106154e(AbstractC20378v abstractC20378v, InterfaceC20369m interfaceC20369m) {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(abstractC20378v.mo106122a());
            try {
                String mo106123b = abstractC20378v.mo106123b();
                HashMap hashMap = new HashMap();
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = f100393b.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", mo106123b, group2, group);
                        Set set = (Set) hashMap.get(group);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(group, set);
                        }
                        set.add(new C20371o(nextElement, group2));
                    }
                }
                HashMap hashMap2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (hashMap.containsKey(str)) {
                        String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str);
                        for (C20371o c20371o : (Set) hashMap.get(str)) {
                            if (hashMap2.containsKey(c20371o.f100391a)) {
                                String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", c20371o.f100391a, str);
                            } else {
                                hashMap2.put(c20371o.f100391a, c20371o);
                                String.format("NativeLibraryExtractor: using library %s for ABI %s", c20371o.f100391a, str);
                            }
                        }
                    } else {
                        String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str);
                    }
                }
                interfaceC20369m.mo106151a(zipFile, new HashSet(hashMap2.values()));
                zipFile.close();
            } catch (IOException e11) {
                e = e11;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e12) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e12);
                    }
                }
                throw e;
            }
        } catch (IOException e13) {
            e = e13;
            zipFile = null;
        }
    }

    /* renamed from: f */
    public final void m106155f(AbstractC20378v abstractC20378v, Set set, InterfaceC20370n interfaceC20370n) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C20371o c20371o = (C20371o) it.next();
            File m106138c = this.f100394a.m106138c(abstractC20378v.mo106123b(), c20371o.f100391a);
            boolean z11 = false;
            if (m106138c.exists() && m106138c.length() == c20371o.f100392b.getSize() && C20363g.m106127p(m106138c)) {
                z11 = true;
            }
            interfaceC20370n.mo106150a(c20371o, m106138c, z11);
        }
    }

    /* renamed from: b */
    public final Set m106156b(AbstractC20378v abstractC20378v) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        m106154e(abstractC20378v, new C20366j(this, abstractC20378v, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    /* renamed from: c */
    public final Set m106157c() {
        Set<AbstractC20378v> m106145j = this.f100394a.m106145j();
        for (String str : this.f100394a.m106143h()) {
            Iterator it = m106145j.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AbstractC20378v) it.next()).mo106123b().equals(str)) {
                        break;
                    }
                } else {
                    String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str);
                    this.f100394a.m106147n(str);
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (AbstractC20378v abstractC20378v : m106145j) {
            HashSet hashSet2 = new HashSet();
            m106154e(abstractC20378v, new C20367k(this, hashSet2, abstractC20378v));
            for (File file : this.f100394a.m106144i(abstractC20378v.mo106123b())) {
                if (!hashSet2.contains(file)) {
                    String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), abstractC20378v.mo106123b(), abstractC20378v.mo106122a().getAbsolutePath());
                    this.f100394a.m106148o(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }
}
