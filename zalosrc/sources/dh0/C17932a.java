package dh0;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* renamed from: dh0.a */
/* loaded from: classes7.dex */
public final class C17932a {

    /* renamed from: a */
    public static final C17932a f90528a = new C17932a();

    /* renamed from: b */
    private static final CoroutineDispatcher f90529b;

    /* renamed from: c */
    private static final CoroutineDispatcher f90530c;

    /* renamed from: d */
    private static final CoroutineDispatcher f90531d;

    /* renamed from: e */
    private static final CoroutineDispatcher f90532e;

    static {
        CoroutineDispatcher m112680b = Dispatchers.m112680b();
        f90529b = m112680b;
        f90530c = m112680b.mo112623F0(1);
        f90531d = m112680b.mo112623F0(8);
        f90532e = m112680b.mo112623F0(4);
    }

    private C17932a() {
    }

    /* renamed from: a */
    public final CoroutineDispatcher m94572a() {
        return f90529b;
    }

    /* renamed from: b */
    public final CoroutineDispatcher m94573b() {
        return f90530c;
    }
}
