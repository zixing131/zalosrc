package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.q1 */
/* loaded from: classes.dex */
public class C1202q1 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f4711c = new Object();

    /* renamed from: d */
    private static ArrayList f4712d;

    /* renamed from: a */
    private final Resources f4713a;

    /* renamed from: b */
    private final Resources.Theme f4714b;

    private C1202q1(Context context) {
        super(context);
        if (C1229z1.m5794b()) {
            C1229z1 c1229z1 = new C1229z1(this, context.getResources());
            this.f4713a = c1229z1;
            Resources.Theme newTheme = c1229z1.newTheme();
            this.f4714b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f4713a = new C1208s1(this, context.getResources());
        this.f4714b = null;
    }

    /* renamed from: a */
    private static boolean m5686a(Context context) {
        if (!(context instanceof C1202q1) && !(context.getResources() instanceof C1208s1) && !(context.getResources() instanceof C1229z1)) {
            return C1229z1.m5794b();
        }
        return false;
    }

    /* renamed from: b */
    public static Context m5687b(Context context) {
        C1202q1 c1202q1;
        if (m5686a(context)) {
            synchronized (f4711c) {
                try {
                    ArrayList arrayList = f4712d;
                    if (arrayList == null) {
                        f4712d = new ArrayList();
                    } else {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            WeakReference weakReference = (WeakReference) f4712d.get(size);
                            if (weakReference == null || weakReference.get() == null) {
                                f4712d.remove(size);
                            }
                        }
                        for (int size2 = f4712d.size() - 1; size2 >= 0; size2--) {
                            WeakReference weakReference2 = (WeakReference) f4712d.get(size2);
                            if (weakReference2 != null) {
                                c1202q1 = (C1202q1) weakReference2.get();
                            } else {
                                c1202q1 = null;
                            }
                            if (c1202q1 != null && c1202q1.getBaseContext() == context) {
                                return c1202q1;
                            }
                        }
                    }
                    C1202q1 c1202q12 = new C1202q1(context);
                    f4712d.add(new WeakReference(c1202q12));
                    return c1202q12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f4713a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f4713a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f4714b;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i11) {
        Resources.Theme theme = this.f4714b;
        if (theme == null) {
            super.setTheme(i11);
        } else {
            theme.applyStyle(i11, true);
        }
    }
}
