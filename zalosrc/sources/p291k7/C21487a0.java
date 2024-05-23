package p291k7;

import com.google.android.play.core.splitinstall.internal.AbstractC6516c;
import com.google.android.play.core.splitinstall.internal.C6515b;
import com.google.android.play.core.splitinstall.internal.zzbh;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p258j7.AbstractC20965n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k7.a0 */
/* loaded from: classes3.dex */
public final class C21487a0 implements InterfaceC21528o {
    /* renamed from: c */
    public static void m111100c(ClassLoader classLoader, Set set, InterfaceC21558z interfaceC21558z) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object m111206c = C21549v.m111206c(classLoader);
        C6515b m33394b = AbstractC6516c.m33394b(m111206c, "nativeLibraryDirectories", List.class);
        synchronized (AbstractC20965n0.class) {
            ArrayList arrayList = new ArrayList((Collection) m33394b.m33390a());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            m33394b.m33392c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] mo111109a = interfaceC21558z.mo111109a(m111206c, new ArrayList(hashSet), null, arrayList2);
        if (!arrayList2.isEmpty()) {
            zzbh zzbhVar = new zzbh("Error in makePathElements");
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList2.get(i11));
                } catch (Exception unused) {
                }
            }
            throw zzbhVar;
        }
        synchronized (AbstractC20965n0.class) {
            AbstractC6516c.m33393a(m111206c, "nativeLibraryPathElements", Object.class).m33389e(Arrays.asList(mo111109a));
        }
    }

    /* renamed from: d */
    public static boolean m111101d(ClassLoader classLoader, File file, File file2, boolean z11, String str) {
        return C21549v.m111208e(classLoader, file, file2, z11, new C21554x(), "zip", new C21540s());
    }

    @Override // p291k7.InterfaceC21528o
    /* renamed from: a */
    public final boolean mo111102a(ClassLoader classLoader, File file, File file2, boolean z11) {
        return m111101d(classLoader, file, file2, z11, "zip");
    }

    @Override // p291k7.InterfaceC21528o
    /* renamed from: b */
    public final void mo111103b(ClassLoader classLoader, Set set) {
        m111100c(classLoader, set, new C21556y());
    }
}
