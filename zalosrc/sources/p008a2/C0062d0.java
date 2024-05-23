package p008a2;

import android.content.Context;
import fn0.AbstractC19074t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import p046c2.AbstractC3206b;
import p046c2.AbstractC3207c;
import p119e2.InterfaceC18182g;
import p119e2.InterfaceC18183h;
import p177g2.C19204a;

/* renamed from: a2.d0 */
/* loaded from: classes.dex */
public final class C0062d0 implements InterfaceC18183h, InterfaceC0071i {

    /* renamed from: p */
    private final Context f257p;

    /* renamed from: q */
    private final String f258q;

    /* renamed from: r */
    private final File f259r;

    /* renamed from: s */
    private final Callable f260s;

    /* renamed from: t */
    private final int f261t;

    /* renamed from: u */
    private final InterfaceC18183h f262u;

    /* renamed from: v */
    private C0069h f263v;

    /* renamed from: w */
    private boolean f264w;

    public C0062d0(Context context, String str, File file, Callable callable, int i11, InterfaceC18183h interfaceC18183h) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18183h, "delegate");
        this.f257p = context;
        this.f258q = str;
        this.f259r = file;
        this.f260s = callable;
        this.f261t = i11;
        this.f262u = interfaceC18183h;
    }

    /* renamed from: b */
    private final void m228b(File file, boolean z11) {
        ReadableByteChannel newChannel;
        if (this.f258q != null) {
            newChannel = Channels.newChannel(this.f257p.getAssets().open(this.f258q));
            AbstractC19074t.m100207e(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f259r != null) {
            newChannel = new FileInputStream(this.f259r).getChannel();
            AbstractC19074t.m100207e(newChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f260s;
            if (callable != null) {
                try {
                    newChannel = Channels.newChannel((InputStream) callable.call());
                    AbstractC19074t.m100207e(newChannel, "newChannel(inputStream)");
                } catch (Exception e11) {
                    throw new IOException("inputStreamCallable exception on call", e11);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f257p.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        AbstractC19074t.m100207e(channel, "output");
        AbstractC3207c.m16308a(newChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        AbstractC19074t.m100207e(createTempFile, "intermediateFile");
        m229c(createTempFile, z11);
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    /* renamed from: c */
    private final void m229c(File file, boolean z11) {
        C0069h c0069h = this.f263v;
        if (c0069h == null) {
            AbstractC19074t.m100223u("databaseConfiguration");
            c0069h = null;
        }
        c0069h.getClass();
    }

    /* renamed from: f */
    private final void m230f(boolean z11) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databasePath = this.f257p.getDatabasePath(databaseName);
            C0069h c0069h = this.f263v;
            C0069h c0069h2 = null;
            if (c0069h == null) {
                AbstractC19074t.m100223u("databaseConfiguration");
                c0069h = null;
            }
            boolean z12 = c0069h.f302s;
            File filesDir = this.f257p.getFilesDir();
            AbstractC19074t.m100207e(filesDir, "context.filesDir");
            C19204a c19204a = new C19204a(databaseName, filesDir, z12);
            try {
                C19204a.m100667c(c19204a, false, 1, null);
                if (!databasePath.exists()) {
                    try {
                        AbstractC19074t.m100207e(databasePath, "databaseFile");
                        m228b(databasePath, z11);
                        return;
                    } catch (IOException e11) {
                        throw new RuntimeException("Unable to copy database file.", e11);
                    }
                }
                try {
                    AbstractC19074t.m100207e(databasePath, "databaseFile");
                    int m16307d = AbstractC3206b.m16307d(databasePath);
                    if (m16307d == this.f261t) {
                        return;
                    }
                    C0069h c0069h3 = this.f263v;
                    if (c0069h3 == null) {
                        AbstractC19074t.m100223u("databaseConfiguration");
                    } else {
                        c0069h2 = c0069h3;
                    }
                    if (c0069h2.m255a(m16307d, this.f261t)) {
                        return;
                    }
                    if (this.f257p.deleteDatabase(databaseName)) {
                        try {
                            m228b(databasePath, z11);
                        } catch (IOException unused) {
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to delete database file (");
                        sb2.append(databaseName);
                        sb2.append(") for a copy destructive migration.");
                    }
                    return;
                } catch (IOException unused2) {
                    return;
                }
            } finally {
                c19204a.m100669d();
            }
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // p008a2.InterfaceC0071i
    /* renamed from: a */
    public InterfaceC18183h mo186a() {
        return this.f262u;
    }

    @Override // p119e2.InterfaceC18183h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        mo186a().close();
        this.f264w = false;
    }

    /* renamed from: d */
    public final void m231d(C0069h c0069h) {
        AbstractC19074t.m100208f(c0069h, "databaseConfiguration");
        this.f263v = c0069h;
    }

    @Override // p119e2.InterfaceC18183h
    public String getDatabaseName() {
        return mo186a().getDatabaseName();
    }

    @Override // p119e2.InterfaceC18183h
    /* renamed from: p0 */
    public InterfaceC18182g mo187p0() {
        if (!this.f264w) {
            m230f(true);
            this.f264w = true;
        }
        return mo186a().mo187p0();
    }

    @Override // p119e2.InterfaceC18183h
    public void setWriteAheadLoggingEnabled(boolean z11) {
        mo186a().setWriteAheadLoggingEnabled(z11);
    }
}
