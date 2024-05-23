package p291k7;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p231i7.C20358b;
import p231i7.C20363g;
import p231i7.C20377u;
import p258j7.InterfaceC20949f0;
import p258j7.InterfaceC20953h0;

/* renamed from: k7.k */
/* loaded from: classes.dex */
public final class C21516k implements InterfaceC20953h0 {

    /* renamed from: a */
    private final Context f104551a;

    /* renamed from: b */
    private final C20363g f104552b;

    /* renamed from: c */
    private final C21525n f104553c;

    /* renamed from: d */
    private final Executor f104554d;

    /* renamed from: e */
    private final C20377u f104555e;

    public C21516k(Context context, Executor executor, C21525n c21525n, C20363g c20363g, C20377u c20377u) {
        this.f104551a = context;
        this.f104552b = c20363g;
        this.f104553c = c21525n;
        this.f104554d = executor;
        this.f104555e = c20377u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m111165c(C21516k c21516k, List list, InterfaceC20949f0 interfaceC20949f0) {
        Integer m111167e = c21516k.m111167e(list);
        if (m111167e == null) {
            return;
        }
        if (m111167e.intValue() == 0) {
            interfaceC20949f0.zzc();
        } else {
            interfaceC20949f0.zzb(m111167e.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m111166d(C21516k c21516k, InterfaceC20949f0 interfaceC20949f0) {
        try {
            if (!C20358b.m106113e(AbstractC21532p0.m111187a(c21516k.f104551a))) {
                interfaceC20949f0.zzb(-12);
            } else {
                interfaceC20949f0.zza();
            }
        } catch (Exception unused) {
            interfaceC20949f0.zzb(-12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0066, code lost:            if (r6.exists() == false) goto L24;     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Integer m111167e(List list) {
        FileLock fileLock;
        int i11;
        File[] listFiles;
        try {
            FileChannel channel = new RandomAccessFile(this.f104552b.m106139d(), "rw").getChannel();
            Integer num = null;
            try {
                try {
                    fileLock = channel.tryLock();
                } finally {
                }
            } catch (OverlappingFileLockException unused) {
                fileLock = null;
            }
            if (fileLock != null) {
                try {
                    Iterator it = list.iterator();
                    while (true) {
                        i11 = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Intent intent = (Intent) it.next();
                        String stringExtra = intent.getStringExtra("split_id");
                        AssetFileDescriptor openAssetFileDescriptor = this.f104551a.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                        try {
                            File m106140e = this.f104552b.m106140e(stringExtra);
                            if (m106140e.exists()) {
                                if (m106140e.length() != openAssetFileDescriptor.getLength()) {
                                    if (!this.f104552b.m106142g(stringExtra).exists()) {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(openAssetFileDescriptor.createInputStream());
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(m106140e);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                while (true) {
                                                    int read = bufferedInputStream.read(bArr);
                                                    if (read <= 0) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, read);
                                                }
                                                fileOutputStream.close();
                                                bufferedInputStream.close();
                                            } catch (Throwable th2) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Throwable th3) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                                }
                                                throw th2;
                                            }
                                        } catch (Throwable th4) {
                                            try {
                                                bufferedInputStream.close();
                                            } catch (Throwable th5) {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                                            }
                                            throw th4;
                                        }
                                    }
                                    if (openAssetFileDescriptor != null) {
                                        openAssetFileDescriptor.close();
                                    }
                                }
                            }
                        } catch (Throwable th6) {
                            if (openAssetFileDescriptor != null) {
                                try {
                                    openAssetFileDescriptor.close();
                                } catch (Throwable th7) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                                }
                            }
                            throw th6;
                        }
                    }
                    listFiles = this.f104552b.m106137b().listFiles();
                } catch (IOException | Exception unused2) {
                    i11 = -13;
                }
                if (this.f104553c.m111181c(listFiles)) {
                    if (this.f104553c.m111179a(listFiles)) {
                        File[] listFiles2 = this.f104552b.m106137b().listFiles();
                        Arrays.sort(listFiles2);
                        int length = listFiles2.length;
                        while (true) {
                            length--;
                            if (length < 0) {
                                break;
                            }
                            C20363g.m106126m(listFiles2[length]);
                            File file = listFiles2[length];
                            file.renameTo(this.f104552b.m106141f(file));
                        }
                        num = Integer.valueOf(i11);
                        fileLock.release();
                    }
                }
                i11 = -11;
                num = Integer.valueOf(i11);
                fileLock.release();
            }
            if (channel != null) {
                channel.close();
            }
            return num;
        } catch (Exception unused3) {
            return -13;
        }
    }

    @Override // p258j7.InterfaceC20953h0
    /* renamed from: a */
    public final void mo109495a(List list, InterfaceC20949f0 interfaceC20949f0) {
        if (C20358b.m106114f()) {
            this.f104554d.execute(new RunnableC21513j(this, list, interfaceC20949f0));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}
