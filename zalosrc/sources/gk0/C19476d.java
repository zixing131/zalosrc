package gk0;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.zing.zalo.zinstant.C17161j1;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import j40.C20915b;
import java.io.File;
import ok0.InterfaceC24285b;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: gk0.d */
/* loaded from: classes7.dex */
public final class C19476d implements InterfaceC24285b.d {
    public static final b Companion = new b(null);

    /* renamed from: b */
    private static final InterfaceC24854k f96629b;

    /* renamed from: a */
    private final C20915b f96630a;

    /* renamed from: gk0.d$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f96631q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C17161j1 mo12V4() {
            return new C17161j1(0, 1, null);
        }
    }

    /* renamed from: gk0.d$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final C17161j1 m101828b() {
            return (C17161j1) C19476d.f96629b.getValue();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f96631q);
        f96629b = m129210a;
    }

    public C19476d(File file, int i11, int i12) {
        AbstractC19074t.m100208f(file, "file");
        C20915b.c cVar = C20915b.Companion;
        String path = file.getPath();
        AbstractC19074t.m100207e(path, "getPath(...)");
        C20915b m109442f = C20915b.c.m109442f(cVar, path, null, Companion.m101828b(), 2, null);
        this.f96630a = m109442f;
        if (!m109442f.m109435u()) {
            m109442f.setBounds(new Rect(0, 0, i11, i12));
            return;
        }
        throw new IllegalStateException("Invalid WebP drawable");
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: a */
    public boolean mo101820a() {
        return !this.f96630a.isRunning();
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: b */
    public void mo101821b() {
        this.f96630a.stop();
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: c */
    public void mo101822c() {
        this.f96630a.start();
    }

    @Override // ok0.InterfaceC24285b
    /* renamed from: d */
    public Drawable mo101823d() {
        return this.f96630a;
    }
}
