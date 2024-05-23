package p258j7;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: j7.z */
/* loaded from: classes.dex */
public final class C20988z {

    /* renamed from: a */
    private final Context f102913a;

    public C20988z(Context context) {
        this.f102913a = context;
    }

    /* renamed from: d */
    private final SharedPreferences m109542d() {
        return this.f102913a.getSharedPreferences("playcore_split_install_internal", 0);
    }

    /* renamed from: a */
    public final Set m109543a() {
        Set<String> hashSet;
        synchronized (C20988z.class) {
            try {
                hashSet = m109542d().getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public final void m109544b() {
        synchronized (C20988z.class) {
            m109542d().edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m109545c(Collection collection) {
        synchronized (C20988z.class) {
            Set<String> m109543a = m109543a();
            HashSet hashSet = new HashSet();
            boolean z11 = false;
            for (String str : m109543a) {
                if (collection.contains(str)) {
                    z11 = true;
                } else {
                    hashSet.add(str);
                }
            }
            if (z11) {
                try {
                    m109542d().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }
}
