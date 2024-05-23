package androidx.work;

import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p595w2.InterfaceC28696c;

/* loaded from: classes2.dex */
public final class WorkerParameters {

    /* renamed from: a */
    private UUID f9042a;

    /* renamed from: b */
    private C2148h f9043b;

    /* renamed from: c */
    private Set f9044c;

    /* renamed from: d */
    private C2133a f9045d;

    /* renamed from: e */
    private int f9046e;

    /* renamed from: f */
    private Executor f9047f;

    /* renamed from: g */
    private InterfaceC28696c f9048g;

    /* renamed from: h */
    private AbstractC2243k0 f9049h;

    /* renamed from: i */
    private InterfaceC2137b0 f9050i;

    /* renamed from: j */
    private InterfaceC2245m f9051j;

    /* renamed from: k */
    private int f9052k;

    /* renamed from: androidx.work.WorkerParameters$a */
    /* loaded from: classes2.dex */
    public static class C2133a {

        /* renamed from: a */
        public List f9053a = Collections.emptyList();

        /* renamed from: b */
        public List f9054b = Collections.emptyList();

        /* renamed from: c */
        public Network f9055c;
    }

    public WorkerParameters(UUID uuid, C2148h c2148h, Collection collection, C2133a c2133a, int i11, int i12, Executor executor, InterfaceC28696c interfaceC28696c, AbstractC2243k0 abstractC2243k0, InterfaceC2137b0 interfaceC2137b0, InterfaceC2245m interfaceC2245m) {
        this.f9042a = uuid;
        this.f9043b = c2148h;
        this.f9044c = new HashSet(collection);
        this.f9045d = c2133a;
        this.f9046e = i11;
        this.f9052k = i12;
        this.f9047f = executor;
        this.f9048g = interfaceC28696c;
        this.f9049h = abstractC2243k0;
        this.f9050i = interfaceC2137b0;
        this.f9051j = interfaceC2245m;
    }

    /* renamed from: a */
    public Executor m11451a() {
        return this.f9047f;
    }

    /* renamed from: b */
    public InterfaceC2245m m11452b() {
        return this.f9051j;
    }

    /* renamed from: c */
    public UUID m11453c() {
        return this.f9042a;
    }

    /* renamed from: d */
    public C2148h m11454d() {
        return this.f9043b;
    }

    /* renamed from: e */
    public Network m11455e() {
        return this.f9045d.f9055c;
    }

    /* renamed from: f */
    public InterfaceC2137b0 m11456f() {
        return this.f9050i;
    }

    /* renamed from: g */
    public int m11457g() {
        return this.f9046e;
    }

    /* renamed from: h */
    public Set m11458h() {
        return this.f9044c;
    }

    /* renamed from: i */
    public InterfaceC28696c m11459i() {
        return this.f9048g;
    }

    /* renamed from: j */
    public List m11460j() {
        return this.f9045d.f9053a;
    }

    /* renamed from: k */
    public List m11461k() {
        return this.f9045d.f9054b;
    }

    /* renamed from: l */
    public AbstractC2243k0 m11462l() {
        return this.f9049h;
    }
}
