package ye0;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ve0.C27996e;

/* renamed from: ye0.b */
/* loaded from: classes4.dex */
public final class C30920b {

    /* renamed from: b */
    private static final Logger f142589b = Logger.getLogger(C30920b.class.getName());

    /* renamed from: a */
    private final boolean f142590a;

    private C30920b(boolean z11) {
        this.f142590a = z11;
    }

    /* renamed from: a */
    private void m150206a(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e11) {
            f142589b.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e11);
        }
    }

    /* renamed from: b */
    private List m150207b() {
        if (!this.f142590a) {
            return Collections.emptyList();
        }
        throw new IllegalArgumentException("Source cannot be null");
    }

    /* renamed from: c */
    public static C30920b m150208c() {
        return new C30920b(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Collection m150209d(InputStream inputStream) {
        Throwable th2;
        IOException e11;
        ObjectInputStream objectInputStream;
        if (inputStream == null) {
            return m150207b();
        }
        try {
            try {
                objectInputStream = new ObjectInputStream(inputStream);
            } catch (IOException e12) {
                e11 = e12;
            } catch (Throwable th3) {
                th2 = th3;
                if (0 == 0) {
                }
                throw th2;
            }
            try {
                C27996e c27996e = new C27996e();
                c27996e.readExternal(objectInputStream);
                if (!c27996e.m141097b().isEmpty()) {
                    List m141097b = c27996e.m141097b();
                    m150206a(objectInputStream);
                    return m141097b;
                }
                throw new IllegalStateException("Empty metadata");
            } catch (IOException e13) {
                e11 = e13;
                throw new IllegalStateException("Unable to parse metadata file", e11);
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (0 == 0) {
                m150206a(null);
            } else {
                m150206a(inputStream);
            }
            throw th2;
        }
    }
}
