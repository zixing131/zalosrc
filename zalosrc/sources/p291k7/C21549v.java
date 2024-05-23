package p291k7;

import com.google.android.play.core.splitinstall.internal.AbstractC6516c;
import com.google.android.play.core.splitinstall.internal.C6514a;
import com.google.android.play.core.splitinstall.internal.zzbh;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p258j7.AbstractC20965n0;

/* renamed from: k7.v */
/* loaded from: classes3.dex */
public final class C21549v implements InterfaceC21528o {
    /* renamed from: c */
    public static Object m111206c(ClassLoader classLoader) {
        return AbstractC6516c.m33394b(classLoader, "pathList", Object.class).m33390a();
    }

    /* renamed from: d */
    public static void m111207d(ClassLoader classLoader, Set set) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            "Adding native library parent directory: ".concat(String.valueOf(file.getParentFile().getAbsolutePath()));
            hashSet.add(file.getParentFile());
        }
        C6514a m33393a = AbstractC6516c.m33393a(m111206c(classLoader), "nativeLibraryDirectories", File.class);
        hashSet.removeAll(Arrays.asList((File[]) m33393a.m33390a()));
        synchronized (AbstractC20965n0.class) {
            int size = hashSet.size();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Adding directories ");
            sb2.append(size);
            m33393a.m33389e(hashSet);
        }
    }

    /* renamed from: e */
    public static boolean m111208e(ClassLoader classLoader, File file, File file2, boolean z11, InterfaceC21546u interfaceC21546u, String str, InterfaceC21543t interfaceC21543t) {
        ArrayList arrayList = new ArrayList();
        Object m111206c = m111206c(classLoader);
        C6514a m33393a = AbstractC6516c.m33393a(m111206c, "dexElements", Object.class);
        List asList = Arrays.asList((Object[]) m33393a.m33390a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) AbstractC6516c.m33394b(it.next(), str, File.class).m33390a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z11 && !interfaceC21543t.mo111122a(m111206c, file2, file)) {
            "Should be optimized ".concat(String.valueOf(file2.getPath()));
            return false;
        }
        m33393a.m33388d(Arrays.asList(interfaceC21546u.mo111199a(m111206c, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList.get(i11));
            } catch (Exception unused) {
            }
        }
        AbstractC6516c.m33393a(m111206c, "dexElementsSuppressedExceptions", IOException.class).m33388d(arrayList);
        throw zzbhVar;
    }

    @Override // p291k7.InterfaceC21528o
    /* renamed from: a */
    public final boolean mo111102a(ClassLoader classLoader, File file, File file2, boolean z11) {
        return m111208e(classLoader, file, file2, z11, new C21537r(), "zip", new C21540s());
    }

    @Override // p291k7.InterfaceC21528o
    /* renamed from: b */
    public final void mo111103b(ClassLoader classLoader, Set set) {
        m111207d(classLoader, set);
    }
}
