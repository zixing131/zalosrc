package h40;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: h40.a */
/* loaded from: classes.dex */
public class C19775a {

    /* renamed from: a */
    Stack f97924a;

    /* renamed from: h40.a$a */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a */
        static final C19775a f97925a = new C19775a();
    }

    /* renamed from: d */
    public static C19775a m103525d() {
        return a.f97925a;
    }

    /* renamed from: a */
    public void m103526a(Activity activity) {
        this.f97924a.push(new WeakReference(activity));
    }

    /* renamed from: b */
    public void m103527b(Activity activity) {
        Activity activity2;
        Iterator it = this.f97924a.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference != null) {
                activity2 = (Activity) weakReference.get();
            } else {
                activity2 = null;
            }
            if (activity2 == null) {
                it.remove();
            } else if (activity2 == activity) {
                it.remove();
            }
        }
    }

    /* renamed from: c */
    public Activity m103528c() {
        WeakReference weakReference;
        if (this.f97924a.isEmpty() || (weakReference = (WeakReference) this.f97924a.peek()) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    private C19775a() {
        this.f97924a = new Stack();
    }
}
