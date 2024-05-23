package p258j7;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.SplitInstallException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p291k7.AbstractC21532p0;
import p291k7.AbstractC21541s0;
import p291k7.C21504g;
import p291k7.C21515j1;
import p291k7.C21536q1;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j7.x */
/* loaded from: classes3.dex */
public final class C20984x {

    /* renamed from: c */
    private static final C21536q1 f102902c = new C21536q1("SplitInstallService");

    /* renamed from: d */
    private static final Intent f102903d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    private final String f102904a;

    /* renamed from: b */
    C21504g f102905b;

    public C20984x(Context context, String str) {
        this.f102904a = str;
        if (AbstractC21541s0.m111203a(context)) {
            this.f102905b = new C21504g(AbstractC21532p0.m111187a(context), f102902c, "SplitInstallService", f102903d, C20970q.f102876a, null);
        }
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ Bundle m109528b(C21515j1 c21515j1) {
        Bundle m109533i = m109533i();
        m109533i.putParcelableArrayList("event_timestamps", new ArrayList<>(c21515j1.m111162a()));
        return m109533i;
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ ArrayList m109531g(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ ArrayList m109532h(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: i */
    public static Bundle m109533i() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        return bundle;
    }

    /* renamed from: j */
    private static AbstractC22888j m109534j() {
        f102902c.m111195b("onError(%d)", -14);
        return AbstractC22894m.m117603e(new SplitInstallException(-14));
    }

    /* renamed from: c */
    public final AbstractC22888j m109535c(int i11) {
        if (this.f102905b == null) {
            return m109534j();
        }
        f102902c.m111197d("cancelInstall(%d)", Integer.valueOf(i11));
        C22890k c22890k = new C22890k();
        this.f102905b.m111150s(new C20974s(this, c22890k, i11, c22890k), c22890k);
        return c22890k.m117594a();
    }

    /* renamed from: d */
    public final AbstractC22888j m109536d(Collection collection, Collection collection2, C21515j1 c21515j1) {
        if (this.f102905b == null) {
            return m109534j();
        }
        f102902c.m111197d("startInstall(%s,%s)", collection, collection2);
        C22890k c22890k = new C22890k();
        this.f102905b.m111150s(new C20972r(this, c22890k, collection, collection2, c21515j1, c22890k), c22890k);
        return c22890k.m117594a();
    }
}
