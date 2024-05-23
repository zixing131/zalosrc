package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.AbstractC1398e;
import androidx.core.provider.AbstractC1460g;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.core.graphics.o */
/* loaded from: classes2.dex */
public abstract class AbstractC1431o {

    /* renamed from: a */
    private ConcurrentHashMap f6258a = new ConcurrentHashMap();

    /* renamed from: androidx.core.graphics.o$a */
    /* loaded from: classes2.dex */
    public class a implements b {
        a() {
        }

        @Override // androidx.core.graphics.AbstractC1431o.b
        /* renamed from: c */
        public int mo7297b(AbstractC1460g.b bVar) {
            return bVar.m7412e();
        }

        @Override // androidx.core.graphics.AbstractC1431o.b
        /* renamed from: d */
        public boolean mo7296a(AbstractC1460g.b bVar) {
            return bVar.m7413f();
        }
    }

    /* renamed from: androidx.core.graphics.o$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        boolean mo7296a(Object obj);

        /* renamed from: b */
        int mo7297b(Object obj);
    }

    /* renamed from: e */
    private static Object m7293e(Object[] objArr, int i11, b bVar) {
        int i12;
        boolean z11;
        if ((i11 & 1) == 0) {
            i12 = 400;
        } else {
            i12 = IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        return m7294f(objArr, i12, z11, bVar);
    }

    /* renamed from: f */
    private static Object m7294f(Object[] objArr, int i11, boolean z11, b bVar) {
        int i12;
        Object obj = null;
        int i13 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(bVar.mo7297b(obj2) - i11) * 2;
            if (bVar.mo7296a(obj2) == z11) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            int i14 = abs + i12;
            if (obj == null || i13 > i14) {
                obj = obj2;
                i13 = i14;
            }
        }
        return obj;
    }

    /* renamed from: a */
    public abstract Typeface mo7269a(Context context, AbstractC1398e.c cVar, Resources resources, int i11);

    /* renamed from: b */
    public abstract Typeface mo7270b(Context context, CancellationSignal cancellationSignal, AbstractC1460g.b[] bVarArr, int i11);

    /* renamed from: c */
    public Typeface m7295c(Context context, InputStream inputStream) {
        File m7304e = AbstractC1432p.m7304e(context);
        if (m7304e == null) {
            return null;
        }
        try {
            if (!AbstractC1432p.m7303d(m7304e, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(m7304e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m7304e.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo7281d(Context context, Resources resources, int i11, String str, int i12) {
        File m7304e = AbstractC1432p.m7304e(context);
        if (m7304e == null) {
            return null;
        }
        try {
            if (!AbstractC1432p.m7302c(m7304e, resources, i11)) {
                return null;
            }
            return Typeface.createFromFile(m7304e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m7304e.delete();
        }
    }

    /* renamed from: g */
    public AbstractC1460g.b mo7292g(AbstractC1460g.b[] bVarArr, int i11) {
        return (AbstractC1460g.b) m7293e(bVarArr, i11, new a());
    }
}
