package pj0;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.zinstant.AbstractC17158i1;
import com.zing.zalo.zinstant.utils.C17205q;
import ek0.C18461a;
import ho0.AbstractC20110a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pj0.C24777c;
import zj0.C32219a;

/* renamed from: pj0.c */
/* loaded from: classes.dex */
public class C24777c {

    /* renamed from: l */
    private static final Object f118991l = new Object();

    /* renamed from: a */
    private int f118992a;

    /* renamed from: b */
    private String f118993b;

    /* renamed from: c */
    private long f118994c;

    /* renamed from: d */
    private long f118995d;

    /* renamed from: e */
    private float f118996e;

    /* renamed from: f */
    private float f118997f;

    /* renamed from: g */
    private Handler f118998g;

    /* renamed from: h */
    private final List f118999h;

    /* renamed from: i */
    private volatile boolean f119000i;

    /* renamed from: j */
    private volatile boolean f119001j;

    /* renamed from: k */
    private final C18461a f119002k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj0.c$a */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m128794b(int i11, Bundle bundle, int i12, d dVar) {
            try {
                Iterator it = C24777c.this.f118999h.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar == null) {
                        synchronized (C24777c.this.f118999h) {
                            it.remove();
                        }
                    } else {
                        bVar.mo116384a(i11);
                    }
                }
                C24777c.this.m128785j(new File(C24777c.this.m128787o()), i11, bundle, i12);
                if (dVar != null) {
                    dVar.mo95841a();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C24777c.this.f119000i = false;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:            if (r13.what == 1) goto L33;     */
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean handleMessage(Message message) {
            d dVar;
            switch (message.what) {
                case 1:
                    if (!C24777c.this.f119000i) {
                        C24777c.this.f119000i = true;
                        final int i11 = message.what;
                        final Bundle data = message.getData();
                        final int i12 = message.arg1;
                        Object obj = message.obj;
                        if (obj instanceof d) {
                            dVar = (d) obj;
                        } else {
                            dVar = null;
                        }
                        final d dVar2 = dVar;
                        AbstractC20110a.m104535d("clean up msg target: %d, type: %d, data: %s", Integer.valueOf(i11), Integer.valueOf(i12), data);
                        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: pj0.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                C24777c.a.this.m128794b(i11, data, i12, dVar2);
                            }
                        });
                    }
                    if (C24777c.this.f118992a != 100) {
                        break;
                    }
                    return true;
                case 2:
                    C24777c.this.f118992a = 100;
                    if (C24777c.this.f118998g.hasMessages(1)) {
                        C24777c.this.f118998g.removeMessages(1);
                    }
                    return true;
                case 3:
                    C24777c.this.f118992a = 101;
                    if (C24777c.this.f118998g.hasMessages(1)) {
                        C24777c.this.f118998g.removeMessages(1);
                    }
                    C24777c.this.f118998g.sendEmptyMessageDelayed(1, C24777c.this.f118995d);
                    return true;
                case 4:
                case 5:
                    if (C24777c.this.f119000i) {
                        if (C24777c.this.f118998g.hasMessages(message.what)) {
                            C24777c.this.f118998g.removeMessages(message.what);
                        }
                        C24777c.this.f118998g.sendEmptyMessageDelayed(message.what, 1000L);
                        return true;
                    }
                    if (C24777c.this.f119000i) {
                        C24777c.this.f118998g.sendMessageDelayed(Message.obtain(message), 1000L);
                        return true;
                    }
                    if (!C24777c.this.f119000i) {
                    }
                    if (C24777c.this.f118992a != 100) {
                    }
                    return true;
                case 6:
                case 7:
                    if (C24777c.this.f119000i) {
                    }
                    if (!C24777c.this.f119000i) {
                    }
                    if (C24777c.this.f118992a != 100) {
                    }
                    return true;
                default:
                    return false;
            }
        }
    }

    /* renamed from: pj0.c$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo116384a(int i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: pj0.c$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        static C24777c f119004a = new C24777c(null);
    }

    /* renamed from: pj0.c$d */
    /* loaded from: classes7.dex */
    public interface d {
        /* renamed from: a */
        void mo95841a();
    }

    /* synthetic */ C24777c(a aVar) {
        this();
    }

    /* renamed from: k */
    public static void m128774k(int i11) {
        AbstractC20110a.m104535d("deleteByType type: %d", Integer.valueOf(i11));
        Message obtainMessage = m128780t().f118998g.obtainMessage(7);
        obtainMessage.arg1 = i11;
        m128780t().f118998g.sendMessage(obtainMessage);
    }

    /* renamed from: l */
    public static void m128775l(int i11, d dVar) {
        AbstractC20110a.m104535d("deleteByType type: %d", Integer.valueOf(i11));
        Message obtainMessage = m128780t().f118998g.obtainMessage(7);
        obtainMessage.arg1 = i11;
        obtainMessage.obj = dVar;
        m128780t().f118998g.sendMessage(obtainMessage);
    }

    /* renamed from: n */
    public static void m128776n(int i11, ArrayList arrayList) {
        AbstractC20110a.m104535d("garbageCollection type: %d", Integer.valueOf(i11));
        Bundle bundle = new Bundle();
        bundle.putCharSequenceArrayList("keepsListFile", arrayList);
        Message obtainMessage = m128780t().f118998g.obtainMessage(6);
        obtainMessage.arg1 = i11;
        obtainMessage.setData(bundle);
        m128780t().f118998g.sendMessage(obtainMessage);
    }

    /* renamed from: q */
    public static File m128777q(String str, int i11) {
        return m128779s(str, String.valueOf(i11));
    }

    /* renamed from: r */
    public static File m128778r(String str, int i11, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            File file = new File(str2);
            if (!file.exists()) {
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                File m128777q = m128777q(str, i11);
                if (m128777q.exists()) {
                    if (C17205q.m91838a(m128777q, file)) {
                        m128777q.delete();
                        return file;
                    }
                    return m128777q;
                }
                return file;
            }
            return file;
        }
        return m128777q(str, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:            if (r1.canWrite() == false) goto L12;     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File m128779s(String str, String str2) {
        File parentFile;
        File file = new File(m128780t().m128787o().concat("/").concat(str2), str);
        try {
            parentFile = file.getParentFile();
        } catch (SecurityException e11) {
            e11.printStackTrace();
            if (m128780t().m128792y()) {
                return m128779s(str, str2);
            }
        }
        if (!parentFile.exists()) {
            if (parentFile.mkdirs()) {
            }
            if (m128780t().m128792y()) {
                return m128779s(str, str2);
            }
            return file;
        }
    }

    /* renamed from: t */
    public static C24777c m128780t() {
        return c.f119004a;
    }

    /* renamed from: v */
    public static long m128781v(File file, List list) {
        long length;
        File[] listFiles = file.listFiles();
        long j11 = 0;
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    length = m128781v(file2, list);
                } else {
                    list.add(file2);
                    length = file2.length();
                }
                j11 += length;
            }
        }
        return j11;
    }

    /* renamed from: z */
    private void m128782z() {
        if (this.f118998g.hasMessages(3)) {
            this.f118998g.removeMessages(3);
        }
        this.f118998g.sendEmptyMessage(3);
    }

    /* renamed from: h */
    public void m128783h(b bVar, boolean z11) {
        m128790w(bVar);
        synchronized (this.f118999h) {
            try {
                if (z11) {
                    this.f118999h.add(0, new WeakReference(bVar));
                } else {
                    this.f118999h.add(new WeakReference(bVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public void m128784i() {
        if (this.f118998g.hasMessages(1)) {
            this.f118998g.removeMessages(1);
        }
        this.f118998g.sendEmptyMessage(1);
    }

    /* renamed from: j */
    protected void m128785j(File file, int i11, Bundle bundle, int i12) {
        if (!file.isFile() && file.exists()) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 != 6) {
                        if (i11 != 7) {
                            long freeSpace = ((float) file.getFreeSpace()) * this.f118996e;
                            if (freeSpace <= 0 || freeSpace > this.f118994c) {
                                freeSpace = this.f118994c;
                            }
                            this.f119002k.m97792a(freeSpace, file.getAbsolutePath(), ((float) r1) * this.f118997f);
                            return;
                        }
                        if (i12 > -1) {
                            File m128788p = m128788p(i12);
                            if (m128788p.exists() && m128788p.isDirectory()) {
                                m128786m(m128788p);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (bundle == null) {
                        return;
                    }
                    ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList("keepsListFile");
                    File file2 = new File(m128780t().m128787o().concat("/").concat(String.valueOf(i12)));
                    if (file2.exists() && file2.isDirectory() && charSequenceArrayList != null && charSequenceArrayList.size() > 0) {
                        for (File file3 : file2.listFiles()) {
                            if (file3.isFile() && !charSequenceArrayList.contains(file3.getName())) {
                                file3.delete();
                            }
                        }
                        return;
                    }
                    return;
                }
                this.f119002k.m97793b(0L, file.getAbsolutePath());
                return;
            }
            m128786m(file);
        }
    }

    /* renamed from: m */
    protected void m128786m(File file) {
        AbstractC20110a.m104535d("clean up deleteDirectory: %s", file.getPath());
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m128786m(file2);
                } else if (file2.delete()) {
                    AbstractC20110a.m104535d("clean up directory file name: %s", file2.getName());
                }
            }
        }
    }

    /* renamed from: o */
    public String m128787o() {
        File externalCacheDir;
        String str = this.f118993b;
        if (str == null) {
            synchronized (f118991l) {
                try {
                    if (this.f118993b == null) {
                        this.f119001j = false;
                        Context m91742a = AbstractC17158i1.m91742a();
                        if (m91742a.getExternalCacheDir() == null) {
                            externalCacheDir = m91742a.getCacheDir();
                        } else {
                            externalCacheDir = m91742a.getExternalCacheDir();
                        }
                        this.f118993b = externalCacheDir.getPath().concat("/zinstant");
                        File file = new File(this.f118993b);
                        try {
                            if (!file.exists() && !file.mkdirs()) {
                                this.f118993b = m91742a.getCacheDir().getPath().concat("/zinstant");
                                File file2 = new File(this.f118993b);
                                if (!file2.exists() && !file2.mkdirs()) {
                                    AbstractC20110a.m104535d("Can't create cache folder for Zinstant: %s", this.f118993b);
                                }
                            }
                        } catch (SecurityException e11) {
                            e11.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return this.f118993b;
        }
        File file3 = new File(str);
        try {
            if (!file3.exists() && !file3.mkdirs()) {
                this.f118993b = null;
                return m128787o();
            }
            return str;
        } catch (SecurityException e12) {
            e12.printStackTrace();
            this.f118993b = null;
            return m128787o();
        }
    }

    /* renamed from: p */
    protected File m128788p(int i11) {
        return new File(m128780t().m128787o().concat("/").concat(String.valueOf(i11)));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[Catch: all -> 0x002c, TryCatch #0 {, blocks: (B:4:0x000f, B:7:0x0016, B:9:0x001c, B:11:0x0022, B:13:0x0032, B:15:0x003a, B:17:0x0045, B:19:0x0052, B:23:0x005c, B:25:0x0064, B:28:0x006a, B:31:0x0071, B:34:0x0077, B:35:0x0079, B:36:0x007c, B:42:0x002f), top: B:3:0x000f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[Catch: all -> 0x002c, TryCatch #0 {, blocks: (B:4:0x000f, B:7:0x0016, B:9:0x001c, B:11:0x0022, B:13:0x0032, B:15:0x003a, B:17:0x0045, B:19:0x0052, B:23:0x005c, B:25:0x0064, B:28:0x006a, B:31:0x0071, B:34:0x0077, B:35:0x0079, B:36:0x007c, B:42:0x002f), top: B:3:0x000f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x002c, TryCatch #0 {, blocks: (B:4:0x000f, B:7:0x0016, B:9:0x001c, B:11:0x0022, B:13:0x0032, B:15:0x003a, B:17:0x0045, B:19:0x0052, B:23:0x005c, B:25:0x0064, B:28:0x006a, B:31:0x0071, B:34:0x0077, B:35:0x0079, B:36:0x007c, B:42:0x002f), top: B:3:0x000f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077 A[Catch: all -> 0x002c, TryCatch #0 {, blocks: (B:4:0x000f, B:7:0x0016, B:9:0x001c, B:11:0x0022, B:13:0x0032, B:15:0x003a, B:17:0x0045, B:19:0x0052, B:23:0x005c, B:25:0x0064, B:28:0x006a, B:31:0x0071, B:34:0x0077, B:35:0x0079, B:36:0x007c, B:42:0x002f), top: B:3:0x000f, inners: #1 }] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m128789u(String str, long j11, long j12, float f11, float f12) {
        String str2;
        synchronized (f118991l) {
            File file = new File(str);
            boolean z11 = false;
            try {
                if (!file.exists() && !file.mkdirs()) {
                    AbstractC20110a.m104535d("Can't create cache folder for Zinstant: %s", str);
                }
            } catch (SecurityException e11) {
                e11.printStackTrace();
            }
            if (file.exists() && file.getFreeSpace() < 1048576) {
                if (m128781v(file, new ArrayList()) > 0) {
                    m128784i();
                } else {
                    str2 = null;
                    if (str2 != null) {
                        z11 = true;
                    }
                    this.f119001j = z11;
                    this.f118993b = str2;
                    if (j11 > 0) {
                        this.f118994c = j11;
                    }
                    if (j12 > 0) {
                        this.f118995d = j12;
                    }
                    if (f11 > 0.0f) {
                        this.f118996e = f11;
                    }
                    if (f12 > 0.0f) {
                        this.f118997f = f12;
                    }
                    m128782z();
                }
            }
            str2 = str;
            if (str2 != null) {
            }
            this.f119001j = z11;
            this.f118993b = str2;
            if (j11 > 0) {
            }
            if (j12 > 0) {
            }
            if (f11 > 0.0f) {
            }
            if (f12 > 0.0f) {
            }
            m128782z();
        }
    }

    /* renamed from: w */
    public void m128790w(b bVar) {
        synchronized (this.f118999h) {
            try {
                for (WeakReference weakReference : this.f118999h) {
                    if (weakReference.get() == bVar) {
                        weakReference.clear();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x */
    public void m128791x() {
        if (this.f118998g.hasMessages(4)) {
            this.f118998g.removeMessages(4);
        }
        this.f118998g.sendEmptyMessage(4);
    }

    /* renamed from: y */
    boolean m128792y() {
        if (!this.f119001j) {
            return false;
        }
        this.f119001j = false;
        this.f118993b = null;
        return true;
    }

    private C24777c() {
        this.f118994c = 524288000L;
        this.f118995d = 604800000L;
        this.f118996e = 0.2f;
        this.f118997f = 0.6f;
        this.f119001j = false;
        this.f119000i = false;
        this.f118992a = 100;
        this.f118999h = new ArrayList();
        this.f119002k = new C18461a(new C32219a());
        this.f118998g = new Handler(Looper.getMainLooper(), new a());
    }
}
