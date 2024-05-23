package p177g2;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: g2.a */
/* loaded from: classes.dex */
public final class C19204a {

    /* renamed from: e */
    public static final a f95423e = new a(null);

    /* renamed from: f */
    private static final Map f95424f = new HashMap();

    /* renamed from: a */
    private final boolean f95425a;

    /* renamed from: b */
    private final File f95426b;

    /* renamed from: c */
    private final Lock f95427c;

    /* renamed from: d */
    private FileChannel f95428d;

    /* renamed from: g2.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final Lock m100671b(String str) {
            Lock lock;
            synchronized (C19204a.f95424f) {
                try {
                    Map map = C19204a.f95424f;
                    Object obj = map.get(str);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        map.put(str, obj);
                    }
                    lock = (Lock) obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lock;
        }
    }

    public C19204a(String str, File file, boolean z11) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(file, "lockDir");
        this.f95425a = z11;
        File file2 = new File(file, str + ".lck");
        this.f95426b = file2;
        a aVar = f95423e;
        String absolutePath = file2.getAbsolutePath();
        AbstractC19074t.m100207e(absolutePath, "lockFile.absolutePath");
        this.f95427c = aVar.m100671b(absolutePath);
    }

    /* renamed from: c */
    public static /* synthetic */ void m100667c(C19204a c19204a, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = c19204a.f95425a;
        }
        c19204a.m100668b(z11);
    }

    /* renamed from: b */
    public final void m100668b(boolean z11) {
        this.f95427c.lock();
        if (z11) {
            try {
                File parentFile = this.f95426b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f95426b).getChannel();
                channel.lock();
                this.f95428d = channel;
            } catch (IOException unused) {
                this.f95428d = null;
            }
        }
    }

    /* renamed from: d */
    public final void m100669d() {
        try {
            FileChannel fileChannel = this.f95428d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f95427c.unlock();
    }
}
