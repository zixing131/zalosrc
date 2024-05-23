package gk0;

import android.graphics.drawable.Drawable;
import com.zing.zalo.zlottie.widget.C17291a;
import java.io.File;
import ok0.InterfaceC24285b;

/* renamed from: gk0.c */
/* loaded from: classes7.dex */
public final class C19475c implements InterfaceC24285b.c {

    /* renamed from: a */
    private C17291a f96628a;

    public C19475c(File file, int i11, int i12) {
        this.f96628a = new C17291a(file, "", i11, i12, false, false);
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: a */
    public boolean mo101820a() {
        return !this.f96628a.isRunning();
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: b */
    public void mo101821b() {
        this.f96628a.stop();
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: c */
    public void mo101822c() {
        this.f96628a.start();
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: d */
    public Drawable mo101823d() {
        return this.f96628a;
    }
}
