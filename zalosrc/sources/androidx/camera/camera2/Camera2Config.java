package androidx.camera.camera2;

import p533u0.C26917c;
import p563v0.InterfaceC27395b;
import p563v0.InterfaceC27396c;
import p563v0.InterfaceC27405l;

/* loaded from: classes2.dex */
public abstract class Camera2Config {

    /* loaded from: classes2.dex */
    public static final class DefaultProvider {
        public C26917c getCameraXConfig() {
            return Camera2Config.m5860a();
        }
    }

    /* renamed from: a */
    public static C26917c m5860a() {
        InterfaceC27396c interfaceC27396c = new InterfaceC27396c() { // from class: t0.a
        };
        InterfaceC27395b interfaceC27395b = new InterfaceC27395b() { // from class: t0.b
        };
        return new C26917c.a().m138731c(interfaceC27396c).m138732d(interfaceC27395b).m138735g(new InterfaceC27405l() { // from class: t0.c
        }).m138730a();
    }
}
