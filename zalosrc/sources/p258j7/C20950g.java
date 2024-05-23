package p258j7;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p094d7.InterfaceC17801a;
import p291k7.C21515j1;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;

/* renamed from: j7.g */
/* loaded from: classes3.dex */
final class C20950g implements InterfaceC20938a {

    /* renamed from: a */
    private final C20984x f102849a;

    /* renamed from: b */
    private final C20985x0 f102850b;

    /* renamed from: c */
    private final C20975s0 f102851c;

    /* renamed from: d */
    private final C20988z f102852d;

    /* renamed from: e */
    private final Handler f102853e = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20950g(C20984x c20984x, C20985x0 c20985x0, C20975s0 c20975s0, C20988z c20988z) {
        this.f102849a = c20984x;
        this.f102850b = c20985x0;
        this.f102851c = c20975s0;
        this.f102852d = c20988z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static List m109493i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    @Override // p258j7.InterfaceC20938a
    /* renamed from: a */
    public final AbstractC22888j mo109459a(int i11) {
        return this.f102849a.m109535c(i11);
    }

    @Override // p258j7.InterfaceC20938a
    /* renamed from: b */
    public final Set mo109460b() {
        return this.f102851c.m109513c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:            if (r2.containsAll(r3) != false) goto L13;     */
    @Override // p258j7.InterfaceC20938a
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC22888j mo109461c(C20942c c20942c) {
        C21515j1 c21515j1 = new C21515j1();
        c21515j1.m111163b(1);
        c20942c.m109469a().isEmpty();
        List m109469a = c20942c.m109469a();
        if (!m109469a.isEmpty() && (r2 = this.f102851c.m109514d()) != null) {
            HashSet hashSet = new HashSet();
            Iterator it = m109469a.iterator();
            while (it.hasNext()) {
                hashSet.add(((Locale) it.next()).getLanguage());
            }
        }
        if (this.f102851c.m109513c().containsAll(c20942c.m109470b()) && Collections.disjoint(c20942c.m109470b(), this.f102852d.m109543a())) {
            this.f102853e.post(new RunnableC20987y0(this, c20942c));
            return AbstractC22894m.m117604f(0);
        }
        this.f102852d.m109545c(c20942c.m109470b());
        return this.f102849a.m109536d(c20942c.m109470b(), m109493i(c20942c.m109469a()), c21515j1);
    }

    @Override // p258j7.InterfaceC20938a
    /* renamed from: d */
    public final synchronized void mo109462d(InterfaceC20946e interfaceC20946e) {
        this.f102850b.m111183b(interfaceC20946e);
    }

    @Override // p258j7.InterfaceC20938a
    /* renamed from: e */
    public final boolean mo109463e(AbstractC20944d abstractC20944d, Activity activity, int i11) {
        return m109494f(abstractC20944d, new C20989z0(this, activity), i11);
    }

    /* renamed from: f */
    public final boolean m109494f(AbstractC20944d abstractC20944d, InterfaceC17801a interfaceC17801a, int i11) {
        if (abstractC20944d.mo109486i() == 8 && abstractC20944d.mo109484g() != null) {
            interfaceC17801a.mo33349a(abstractC20944d.mo109484g().getIntentSender(), i11, null, 0, 0, 0, null);
            return true;
        }
        return false;
    }
}
