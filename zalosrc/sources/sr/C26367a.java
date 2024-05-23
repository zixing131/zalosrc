package sr;

import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: sr.a */
/* loaded from: classes4.dex */
public final class C26367a {

    /* renamed from: a */
    private final InterfaceC24854k f125260a;

    /* renamed from: b */
    private final InterfaceC24854k f125261b;

    /* renamed from: sr.a$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f125262q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo12V4() {
            return Dispatchers.m112680b().mo112623F0(1);
        }
    }

    /* renamed from: sr.a$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope mo12V4() {
            return CoroutineScopeKt.m112637a(C26367a.this.m135770b());
        }
    }

    public C26367a() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(a.f125262q);
        this.f125260a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new b());
        this.f125261b = m129210a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final CoroutineDispatcher m135770b() {
        return (CoroutineDispatcher) this.f125260a.getValue();
    }

    /* renamed from: c */
    public final CoroutineScope m135771c() {
        return (CoroutineScope) this.f125261b.getValue();
    }
}
