package p052c8;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p015a9.InterfaceC0661a;
import p015a9.InterfaceC0662b;
import p636x8.InterfaceC29473c;

/* renamed from: c8.c0 */
/* loaded from: classes.dex */
final class C3340c0 implements InterfaceC3342e {

    /* renamed from: a */
    private final Set f14175a;

    /* renamed from: b */
    private final Set f14176b;

    /* renamed from: c */
    private final Set f14177c;

    /* renamed from: d */
    private final Set f14178d;

    /* renamed from: e */
    private final Set f14179e;

    /* renamed from: f */
    private final Set f14180f;

    /* renamed from: g */
    private final InterfaceC3342e f14181g;

    /* renamed from: c8.c0$a */
    /* loaded from: classes3.dex */
    private static class a implements InterfaceC29473c {

        /* renamed from: a */
        private final Set f14182a;

        /* renamed from: b */
        private final InterfaceC29473c f14183b;

        public a(Set set, InterfaceC29473c interfaceC29473c) {
            this.f14182a = set;
            this.f14183b = interfaceC29473c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3340c0(C3339c c3339c, InterfaceC3342e interfaceC3342e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C3355r c3355r : c3339c.m16828g()) {
            if (c3355r.m16914e()) {
                if (c3355r.m16916g()) {
                    hashSet4.add(c3355r.m16912c());
                } else {
                    hashSet.add(c3355r.m16912c());
                }
            } else if (c3355r.m16913d()) {
                hashSet3.add(c3355r.m16912c());
            } else if (c3355r.m16916g()) {
                hashSet5.add(c3355r.m16912c());
            } else {
                hashSet2.add(c3355r.m16912c());
            }
        }
        if (!c3339c.m16832k().isEmpty()) {
            hashSet.add(C3338b0.m16816b(InterfaceC29473c.class));
        }
        this.f14175a = Collections.unmodifiableSet(hashSet);
        this.f14176b = Collections.unmodifiableSet(hashSet2);
        this.f14177c = Collections.unmodifiableSet(hashSet3);
        this.f14178d = Collections.unmodifiableSet(hashSet4);
        this.f14179e = Collections.unmodifiableSet(hashSet5);
        this.f14180f = c3339c.m16832k();
        this.f14181g = interfaceC3342e;
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: a */
    public Object mo16847a(Class cls) {
        if (this.f14175a.contains(C3338b0.m16816b(cls))) {
            Object mo16847a = this.f14181g.mo16847a(cls);
            if (!cls.equals(InterfaceC29473c.class)) {
                return mo16847a;
            }
            return new a(this.f14180f, (InterfaceC29473c) mo16847a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: b */
    public InterfaceC0661a mo16848b(C3338b0 c3338b0) {
        if (this.f14177c.contains(c3338b0)) {
            return this.f14181g.mo16848b(c3338b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", c3338b0));
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: c */
    public /* synthetic */ Set mo16849c(Class cls) {
        return AbstractC3341d.m16861f(this, cls);
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: d */
    public InterfaceC0662b mo16850d(Class cls) {
        return mo16854h(C3338b0.m16816b(cls));
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: e */
    public InterfaceC0662b mo16851e(C3338b0 c3338b0) {
        if (this.f14179e.contains(c3338b0)) {
            return this.f14181g.mo16851e(c3338b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c3338b0));
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: f */
    public Set mo16852f(C3338b0 c3338b0) {
        if (this.f14178d.contains(c3338b0)) {
            return this.f14181g.mo16852f(c3338b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", c3338b0));
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: g */
    public Object mo16853g(C3338b0 c3338b0) {
        if (this.f14175a.contains(c3338b0)) {
            return this.f14181g.mo16853g(c3338b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", c3338b0));
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: h */
    public InterfaceC0662b mo16854h(C3338b0 c3338b0) {
        if (this.f14176b.contains(c3338b0)) {
            return this.f14181g.mo16854h(c3338b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", c3338b0));
    }

    @Override // p052c8.InterfaceC3342e
    /* renamed from: i */
    public InterfaceC0661a mo16855i(Class cls) {
        return mo16848b(C3338b0.m16816b(cls));
    }
}
