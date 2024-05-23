package p231i7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i7.l */
/* loaded from: classes3.dex */
public final class C20368l implements InterfaceC20370n {

    /* renamed from: a */
    final /* synthetic */ Set f100388a;

    /* renamed from: b */
    final /* synthetic */ AbstractC20378v f100389b;

    /* renamed from: c */
    final /* synthetic */ ZipFile f100390c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20368l(C20372p c20372p, Set set, AbstractC20378v abstractC20378v, ZipFile zipFile) {
        this.f100388a = set;
        this.f100389b = abstractC20378v;
        this.f100390c = zipFile;
    }

    @Override // p231i7.InterfaceC20370n
    /* renamed from: a */
    public final void mo106150a(C20371o c20371o, File file, boolean z11) {
        this.f100388a.add(file);
        if (!z11) {
            String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.f100389b.mo106123b(), c20371o.f100391a, this.f100389b.mo106122a().getAbsolutePath(), c20371o.f100392b.getName(), file.getAbsolutePath());
            ZipFile zipFile = this.f100390c;
            ZipEntry zipEntry = c20371o.f100392b;
            byte[] bArr = new byte[4096];
            if (file.exists()) {
                file.delete();
            }
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    C20363g.m106126m(file);
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.close();
                            inputStream.close();
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th5) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                    }
                }
                throw th4;
            }
        }
    }
}
