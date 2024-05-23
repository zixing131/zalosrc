package p234ia;

import java.util.concurrent.Executor;
import p015a9.InterfaceC0662b;

/* renamed from: ia.d */
/* loaded from: classes.dex */
public class C20454d {

    /* renamed from: a */
    private final InterfaceC0662b f100656a;

    public C20454d(InterfaceC0662b interfaceC0662b) {
        this.f100656a = interfaceC0662b;
    }

    /* renamed from: a */
    public Executor m106486a(Executor executor) {
        if (executor != null) {
            return executor;
        }
        return (Executor) this.f100656a.get();
    }
}
