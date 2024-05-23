package p046c2;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import bn0.AbstractC2933b;
import fn0.AbstractC19074t;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import on0.AbstractC24341v;
import p008a2.AbstractC0086w;
import p119e2.C18177b;
import p119e2.InterfaceC18182g;
import p119e2.InterfaceC18185j;
import pm0.C24848g0;
import qm0.AbstractC25366r;

/* renamed from: c2.b */
/* loaded from: classes.dex */
public abstract class AbstractC3206b {
    /* renamed from: a */
    public static final CancellationSignal m16304a() {
        return C18177b.m96915b();
    }

    /* renamed from: b */
    public static final void m16305b(InterfaceC18182g interfaceC18182g) {
        List m131494c;
        List<String> m131492a;
        boolean m127120J;
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        m131494c = AbstractC25366r.m131494c();
        Cursor mo200q0 = interfaceC18182g.mo200q0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (mo200q0.moveToNext()) {
            try {
                m131494c.add(mo200q0.getString(0));
            } finally {
            }
        }
        C24848g0 c24848g0 = C24848g0.f119245a;
        AbstractC2933b.m13890a(mo200q0, null);
        m131492a = AbstractC25366r.m131492a(m131494c);
        for (String str : m131492a) {
            AbstractC19074t.m100207e(str, "triggerName");
            m127120J = AbstractC24341v.m127120J(str, "room_fts_content_sync_", false, 2, null);
            if (m127120J) {
                interfaceC18182g.mo201u("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* renamed from: c */
    public static final Cursor m16306c(AbstractC0086w abstractC0086w, InterfaceC18185j interfaceC18185j, boolean z11, CancellationSignal cancellationSignal) {
        int i11;
        AbstractC19074t.m100208f(abstractC0086w, "db");
        AbstractC19074t.m100208f(interfaceC18185j, "sqLiteQuery");
        Cursor m336A = abstractC0086w.m336A(interfaceC18185j, cancellationSignal);
        if (z11 && (m336A instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) m336A;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                i11 = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                i11 = count;
            }
            if (Build.VERSION.SDK_INT < 23 || i11 < count) {
                return AbstractC3205a.m16299a(m336A);
            }
            return m336A;
        }
        return m336A;
    }

    /* renamed from: d */
    public static final int m16307d(File file) {
        AbstractC19074t.m100208f(file, "databaseFile");
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i11 = allocate.getInt();
                AbstractC2933b.m13890a(channel, null);
                return i11;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2933b.m13890a(channel, th2);
                throw th3;
            }
        }
    }
}
