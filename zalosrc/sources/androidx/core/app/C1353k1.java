package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.AbstractC1388a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.k1 */
/* loaded from: classes2.dex */
public final class C1353k1 implements Iterable {

    /* renamed from: p */
    private final ArrayList f5974p = new ArrayList();

    /* renamed from: q */
    private final Context f5975q;

    /* renamed from: androidx.core.app.k1$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: h */
        Intent mo4748h();
    }

    private C1353k1(Context context) {
        this.f5975q = context;
    }

    /* renamed from: j */
    public static C1353k1 m6775j(Context context) {
        return new C1353k1(context);
    }

    /* renamed from: d */
    public C1353k1 m6776d(Intent intent) {
        this.f5974p.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public C1353k1 m6777e(Activity activity) {
        Intent intent;
        if (activity instanceof a) {
            intent = ((a) activity).mo4748h();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = AbstractC1360o.m6787a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f5975q.getPackageManager());
            }
            m6778g(component);
            m6776d(intent);
        }
        return this;
    }

    /* renamed from: g */
    public C1353k1 m6778g(ComponentName componentName) {
        int size = this.f5974p.size();
        try {
            Intent m6788b = AbstractC1360o.m6788b(this.f5975q, componentName);
            while (m6788b != null) {
                this.f5974p.add(size, m6788b);
                m6788b = AbstractC1360o.m6788b(this.f5975q, m6788b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f5974p.iterator();
    }

    /* renamed from: k */
    public void m6779k() {
        m6780l(null);
    }

    /* renamed from: l */
    public void m6780l(Bundle bundle) {
        if (!this.f5974p.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f5974p.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!AbstractC1388a.m6973o(this.f5975q, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f5975q.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
