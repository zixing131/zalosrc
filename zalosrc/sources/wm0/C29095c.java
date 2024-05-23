package wm0;

import kotlin.coroutines.Continuation;
import um0.InterfaceC27315f;

/* renamed from: wm0.c */
/* loaded from: classes.dex */
public final class C29095c implements Continuation {

    /* renamed from: p */
    public static final C29095c f134917p = new C29095c();

    private C29095c() {
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: g */
    public void mo112492g(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // kotlin.coroutines.Continuation
    public InterfaceC27315f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
