package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.widget.AbstractC1158c0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.x */
/* loaded from: classes.dex */
public class C1616x {

    /* renamed from: a */
    private final Runnable f6595a;

    /* renamed from: b */
    private final CopyOnWriteArrayList f6596b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final Map f6597c = new HashMap();

    public C1616x(Runnable runnable) {
        this.f6595a = runnable;
    }

    /* renamed from: a */
    public void m8247a(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f6596b.iterator();
        if (!it.hasNext()) {
            return;
        }
        AbstractC1158c0.m5500a(it.next());
        throw null;
    }

    /* renamed from: b */
    public void m8248b(Menu menu) {
        Iterator it = this.f6596b.iterator();
        if (!it.hasNext()) {
            return;
        }
        AbstractC1158c0.m5500a(it.next());
        throw null;
    }

    /* renamed from: c */
    public boolean m8249c(MenuItem menuItem) {
        Iterator it = this.f6596b.iterator();
        if (!it.hasNext()) {
            return false;
        }
        AbstractC1158c0.m5500a(it.next());
        throw null;
    }

    /* renamed from: d */
    public void m8250d(Menu menu) {
        Iterator it = this.f6596b.iterator();
        if (!it.hasNext()) {
            return;
        }
        AbstractC1158c0.m5500a(it.next());
        throw null;
    }
}
