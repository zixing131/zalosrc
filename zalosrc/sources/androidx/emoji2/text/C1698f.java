package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.core.util.AbstractC1487i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p665y0.C30240b;

/* renamed from: androidx.emoji2.text.f */
/* loaded from: classes2.dex */
public class C1698f {

    /* renamed from: o */
    private static final Object f6814o = new Object();

    /* renamed from: p */
    private static final Object f6815p = new Object();

    /* renamed from: q */
    private static volatile C1698f f6816q;

    /* renamed from: b */
    private final Set f6818b;

    /* renamed from: e */
    private final b f6821e;

    /* renamed from: f */
    final h f6822f;

    /* renamed from: g */
    private final j f6823g;

    /* renamed from: h */
    final boolean f6824h;

    /* renamed from: i */
    final boolean f6825i;

    /* renamed from: j */
    final int[] f6826j;

    /* renamed from: k */
    private final boolean f6827k;

    /* renamed from: l */
    private final int f6828l;

    /* renamed from: m */
    private final int f6829m;

    /* renamed from: n */
    private final e f6830n;

    /* renamed from: a */
    private final ReadWriteLock f6817a = new ReentrantReadWriteLock();

    /* renamed from: c */
    private volatile int f6819c = 3;

    /* renamed from: d */
    private final Handler f6820d = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.emoji2.text.f$a */
    /* loaded from: classes2.dex */
    private static final class a extends b {

        /* renamed from: b */
        private volatile C1701i f6831b;

        /* renamed from: c */
        private volatile C1706n f6832c;

        /* renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C32630a extends i {
            C32630a() {
            }

            @Override // androidx.emoji2.text.C1698f.i
            /* renamed from: a */
            public void mo8655a(Throwable th2) {
                a.this.f6834a.m8688l(th2);
            }

            @Override // androidx.emoji2.text.C1698f.i
            /* renamed from: b */
            public void mo8656b(C1706n c1706n) {
                a.this.m8696c(c1706n);
            }
        }

        a(C1698f c1698f) {
            super(c1698f);
        }

        @Override // androidx.emoji2.text.C1698f.b
        /* renamed from: a */
        void mo8694a() {
            try {
                this.f6834a.f6822f.mo8653a(new C32630a());
            } catch (Throwable th2) {
                this.f6834a.m8688l(th2);
            }
        }

        @Override // androidx.emoji2.text.C1698f.b
        /* renamed from: b */
        CharSequence mo8695b(CharSequence charSequence, int i11, int i12, int i13, boolean z11) {
            return this.f6831b.m8712c(charSequence, i11, i12, i13, z11);
        }

        /* renamed from: c */
        void m8696c(C1706n c1706n) {
            if (c1706n == null) {
                this.f6834a.m8688l(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f6832c = c1706n;
            C1706n c1706n2 = this.f6832c;
            j jVar = this.f6834a.f6823g;
            e eVar = this.f6834a.f6830n;
            C1698f c1698f = this.f6834a;
            this.f6831b = new C1701i(c1706n2, jVar, eVar, c1698f.f6825i, c1698f.f6826j, AbstractC1700h.m8706a());
            this.f6834a.m8689m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.f$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        final C1698f f6834a;

        b(C1698f c1698f) {
            this.f6834a = c1698f;
        }

        /* renamed from: a */
        abstract void mo8694a();

        /* renamed from: b */
        abstract CharSequence mo8695b(CharSequence charSequence, int i11, int i12, int i13, boolean z11);
    }

    /* renamed from: androidx.emoji2.text.f$c */
    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a */
        final h f6835a;

        /* renamed from: b */
        j f6836b;

        /* renamed from: c */
        boolean f6837c;

        /* renamed from: d */
        boolean f6838d;

        /* renamed from: e */
        int[] f6839e;

        /* renamed from: f */
        Set f6840f;

        /* renamed from: g */
        boolean f6841g;

        /* renamed from: h */
        int f6842h = -16711936;

        /* renamed from: i */
        int f6843i = 0;

        /* renamed from: j */
        e f6844j = new C1697e();

        /* JADX INFO: Access modifiers changed from: protected */
        public c(h hVar) {
            AbstractC1487i.m7493h(hVar, "metadataLoader cannot be null.");
            this.f6835a = hVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public final h m8697a() {
            return this.f6835a;
        }

        /* renamed from: b */
        public c m8698b(f fVar) {
            AbstractC1487i.m7493h(fVar, "initCallback cannot be null");
            if (this.f6840f == null) {
                this.f6840f = new C30240b();
            }
            this.f6840f.add(fVar);
            return this;
        }

        /* renamed from: c */
        public c m8699c(int i11) {
            this.f6842h = i11;
            return this;
        }

        /* renamed from: d */
        public c m8700d(boolean z11) {
            this.f6841g = z11;
            return this;
        }

        /* renamed from: e */
        public c m8701e(int i11) {
            this.f6843i = i11;
            return this;
        }

        /* renamed from: f */
        public c m8702f(boolean z11) {
            this.f6837c = z11;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.f$d */
    /* loaded from: classes2.dex */
    public static class d implements j {
        @Override // androidx.emoji2.text.C1698f.j
        /* renamed from: a */
        public AbstractC1702j mo8703a(C1708p c1708p) {
            return new C1709q(c1708p);
        }
    }

    /* renamed from: androidx.emoji2.text.f$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        boolean mo8676a(CharSequence charSequence, int i11, int i12, int i13);
    }

    /* renamed from: androidx.emoji2.text.f$f */
    /* loaded from: classes2.dex */
    public static abstract class f {
        /* renamed from: a */
        public void mo8704a(Throwable th2) {
        }

        /* renamed from: b */
        public void mo8705b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.f$g */
    /* loaded from: classes2.dex */
    public static class g implements Runnable {

        /* renamed from: p */
        private final List f6845p;

        /* renamed from: q */
        private final Throwable f6846q;

        /* renamed from: r */
        private final int f6847r;

        g(Collection collection, int i11) {
            this(collection, i11, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f6845p.size();
            int i11 = 0;
            if (this.f6847r != 1) {
                while (i11 < size) {
                    ((f) this.f6845p.get(i11)).mo8704a(this.f6846q);
                    i11++;
                }
            } else {
                while (i11 < size) {
                    ((f) this.f6845p.get(i11)).mo8705b();
                    i11++;
                }
            }
        }

        g(Collection collection, int i11, Throwable th2) {
            AbstractC1487i.m7493h(collection, "initCallbacks cannot be null");
            this.f6845p = new ArrayList(collection);
            this.f6847r = i11;
            this.f6846q = th2;
        }
    }

    /* renamed from: androidx.emoji2.text.f$h */
    /* loaded from: classes2.dex */
    public interface h {
        /* renamed from: a */
        void mo8653a(i iVar);
    }

    /* renamed from: androidx.emoji2.text.f$i */
    /* loaded from: classes2.dex */
    public static abstract class i {
        /* renamed from: a */
        public abstract void mo8655a(Throwable th2);

        /* renamed from: b */
        public abstract void mo8656b(C1706n c1706n);
    }

    /* renamed from: androidx.emoji2.text.f$j */
    /* loaded from: classes2.dex */
    public interface j {
        /* renamed from: a */
        AbstractC1702j mo8703a(C1708p c1708p);
    }

    private C1698f(c cVar) {
        this.f6824h = cVar.f6837c;
        this.f6825i = cVar.f6838d;
        this.f6826j = cVar.f6839e;
        this.f6827k = cVar.f6841g;
        this.f6828l = cVar.f6842h;
        this.f6822f = cVar.f6835a;
        this.f6829m = cVar.f6843i;
        this.f6830n = cVar.f6844j;
        C30240b c30240b = new C30240b();
        this.f6818b = c30240b;
        j jVar = cVar.f6836b;
        this.f6823g = jVar == null ? new d() : jVar;
        Set set = cVar.f6840f;
        if (set != null && !set.isEmpty()) {
            c30240b.addAll(cVar.f6840f);
        }
        this.f6821e = new a(this);
        m8683k();
    }

    /* renamed from: c */
    public static C1698f m8679c() {
        C1698f c1698f;
        boolean z11;
        synchronized (f6814o) {
            c1698f = f6816q;
            if (c1698f != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC1487i.m7494i(z11, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return c1698f;
    }

    /* renamed from: f */
    public static C1698f m8680f(c cVar) {
        C1698f c1698f = f6816q;
        if (c1698f == null) {
            synchronized (f6814o) {
                try {
                    c1698f = f6816q;
                    if (c1698f == null) {
                        c1698f = new C1698f(cVar);
                        f6816q = c1698f;
                    }
                } finally {
                }
            }
        }
        return c1698f;
    }

    /* renamed from: g */
    public static boolean m8681g() {
        return f6816q != null;
    }

    /* renamed from: i */
    private boolean m8682i() {
        if (m8685e() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private void m8683k() {
        this.f6817a.writeLock().lock();
        try {
            if (this.f6829m == 0) {
                this.f6819c = 0;
            }
            this.f6817a.writeLock().unlock();
            if (m8685e() == 0) {
                this.f6821e.mo8694a();
            }
        } catch (Throwable th2) {
            this.f6817a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: d */
    public int m8684d() {
        return this.f6828l;
    }

    /* renamed from: e */
    public int m8685e() {
        this.f6817a.readLock().lock();
        try {
            return this.f6819c;
        } finally {
            this.f6817a.readLock().unlock();
        }
    }

    /* renamed from: h */
    public boolean m8686h() {
        return this.f6827k;
    }

    /* renamed from: j */
    public void m8687j() {
        boolean z11 = true;
        if (this.f6829m != 1) {
            z11 = false;
        }
        AbstractC1487i.m7494i(z11, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m8682i()) {
            return;
        }
        this.f6817a.writeLock().lock();
        try {
            if (this.f6819c == 0) {
                return;
            }
            this.f6819c = 0;
            this.f6817a.writeLock().unlock();
            this.f6821e.mo8694a();
        } finally {
            this.f6817a.writeLock().unlock();
        }
    }

    /* renamed from: l */
    void m8688l(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f6817a.writeLock().lock();
        try {
            this.f6819c = 2;
            arrayList.addAll(this.f6818b);
            this.f6818b.clear();
            this.f6817a.writeLock().unlock();
            this.f6820d.post(new g(arrayList, this.f6819c, th2));
        } catch (Throwable th3) {
            this.f6817a.writeLock().unlock();
            throw th3;
        }
    }

    /* renamed from: m */
    void m8689m() {
        ArrayList arrayList = new ArrayList();
        this.f6817a.writeLock().lock();
        try {
            this.f6819c = 1;
            arrayList.addAll(this.f6818b);
            this.f6818b.clear();
            this.f6817a.writeLock().unlock();
            this.f6820d.post(new g(arrayList, this.f6819c));
        } catch (Throwable th2) {
            this.f6817a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: n */
    public CharSequence m8690n(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return m8691o(charSequence, 0, length);
    }

    /* renamed from: o */
    public CharSequence m8691o(CharSequence charSequence, int i11, int i12) {
        return m8692p(charSequence, i11, i12, Integer.MAX_VALUE);
    }

    /* renamed from: p */
    public CharSequence m8692p(CharSequence charSequence, int i11, int i12, int i13) {
        return m8693q(charSequence, i11, i12, i13, 0);
    }

    /* renamed from: q */
    public CharSequence m8693q(CharSequence charSequence, int i11, int i12, int i13, int i14) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        AbstractC1487i.m7494i(m8682i(), "Not initialized yet");
        AbstractC1487i.m7490e(i11, "start cannot be negative");
        AbstractC1487i.m7490e(i12, "end cannot be negative");
        AbstractC1487i.m7490e(i13, "maxEmojiCount cannot be negative");
        if (i11 <= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC1487i.m7487b(z11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i11 <= charSequence.length()) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC1487i.m7487b(z12, "start should be < than charSequence length");
        if (i12 <= charSequence.length()) {
            z13 = true;
        } else {
            z13 = false;
        }
        AbstractC1487i.m7487b(z13, "end should be < than charSequence length");
        if (charSequence.length() != 0 && i11 != i12) {
            if (i14 != 1) {
                if (i14 != 2) {
                    z14 = this.f6824h;
                } else {
                    z14 = false;
                }
            } else {
                z14 = true;
            }
            return this.f6821e.mo8695b(charSequence, i11, i12, i13, z14);
        }
        return charSequence;
    }
}
