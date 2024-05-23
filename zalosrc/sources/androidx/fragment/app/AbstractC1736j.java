package androidx.fragment.app;

import androidx.lifecycle.AbstractC1785o;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.j */
/* loaded from: classes2.dex */
public abstract class AbstractC1736j {

    /* renamed from: b */
    int f7122b;

    /* renamed from: c */
    int f7123c;

    /* renamed from: d */
    int f7124d;

    /* renamed from: e */
    int f7125e;

    /* renamed from: f */
    int f7126f;

    /* renamed from: g */
    int f7127g;

    /* renamed from: h */
    boolean f7128h;

    /* renamed from: j */
    String f7130j;

    /* renamed from: k */
    int f7131k;

    /* renamed from: l */
    CharSequence f7132l;

    /* renamed from: m */
    int f7133m;

    /* renamed from: n */
    CharSequence f7134n;

    /* renamed from: o */
    ArrayList f7135o;

    /* renamed from: p */
    ArrayList f7136p;

    /* renamed from: r */
    ArrayList f7138r;

    /* renamed from: a */
    ArrayList f7121a = new ArrayList();

    /* renamed from: i */
    boolean f7129i = true;

    /* renamed from: q */
    boolean f7137q = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        int f7139a;

        /* renamed from: b */
        Fragment f7140b;

        /* renamed from: c */
        int f7141c;

        /* renamed from: d */
        int f7142d;

        /* renamed from: e */
        int f7143e;

        /* renamed from: f */
        int f7144f;

        /* renamed from: g */
        AbstractC1785o.b f7145g;

        /* renamed from: h */
        AbstractC1785o.b f7146h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i11, Fragment fragment) {
            this.f7139a = i11;
            this.f7140b = fragment;
            AbstractC1785o.b bVar = AbstractC1785o.b.RESUMED;
            this.f7145g = bVar;
            this.f7146h = bVar;
        }
    }

    /* renamed from: b */
    public AbstractC1736j m9139b(Fragment fragment, String str) {
        mo8936f(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m9140c(a aVar) {
        this.f7121a.add(aVar);
        aVar.f7141c = this.f7122b;
        aVar.f7142d = this.f7123c;
        aVar.f7143e = this.f7124d;
        aVar.f7144f = this.f7125e;
    }

    /* renamed from: d */
    public abstract int mo8934d();

    /* renamed from: e */
    public abstract int mo8935e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8936f(int i11, Fragment fragment, String str, int i12) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fragment.f6929M;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f6929M + " now " + str);
                }
                fragment.f6929M = str;
            }
            if (i11 != 0) {
                if (i11 != -1) {
                    int i13 = fragment.f6927K;
                    if (i13 != 0 && i13 != i11) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f6927K + " now " + i11);
                    }
                    fragment.f6927K = i11;
                    fragment.f6928L = i11;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            m9140c(new a(i12, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    /* renamed from: g */
    public AbstractC1736j mo8937g(Fragment fragment) {
        m9140c(new a(3, fragment));
        return this;
    }
}
