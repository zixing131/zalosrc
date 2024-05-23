package gk0;

import android.graphics.drawable.Drawable;
import com.zing.zalo.gifplayer.C8917b;
import com.zing.zalo.gifplayer.InterfaceC8919d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.File;
import ok0.InterfaceC24285b;

/* renamed from: gk0.a */
/* loaded from: classes7.dex */
public final class C19473a implements InterfaceC24285b.a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private C8917b f96624a;

    /* renamed from: b */
    private final b f96625b;

    /* renamed from: gk0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: gk0.a$b */
    /* loaded from: classes7.dex */
    public static final class b implements InterfaceC8919d {
        b() {
        }

        @Override // com.zing.zalo.gifplayer.InterfaceC8919d
        public void invalidate() {
            C8917b c8917b = C19473a.this.f96624a;
            if (c8917b == null) {
                AbstractC19074t.m100223u("gifDrawable");
                c8917b = null;
            }
            c8917b.invalidateSelf();
        }
    }

    public C19473a(File file) {
        b bVar = new b();
        this.f96625b = bVar;
        C8917b c8917b = new C8917b(file, 2073600);
        c8917b.m47614r(bVar);
        this.f96624a = c8917b;
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: a */
    public boolean mo101820a() {
        C8917b c8917b = this.f96624a;
        if (c8917b == null) {
            AbstractC19074t.m100223u("gifDrawable");
            c8917b = null;
        }
        return !c8917b.isRunning();
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: b */
    public void mo101821b() {
        C8917b c8917b = this.f96624a;
        if (c8917b == null) {
            AbstractC19074t.m100223u("gifDrawable");
            c8917b = null;
        }
        c8917b.stop();
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: c */
    public void mo101822c() {
        C8917b c8917b = this.f96624a;
        if (c8917b == null) {
            AbstractC19074t.m100223u("gifDrawable");
            c8917b = null;
        }
        c8917b.start();
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: d */
    public Drawable mo101823d() {
        C8917b c8917b = this.f96624a;
        if (c8917b == null) {
            AbstractC19074t.m100223u("gifDrawable");
            return null;
        }
        return c8917b;
    }
}
