package in;

import ag0.AbstractC0837p0;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import fg0.ThreadFactoryC18928a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import in.AbstractC20631e;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import nh0.InterfaceC23792b;
import p296kc.C21654a;
import p348mi.AbstractC23306f;
import pm0.C24848g0;
import pm0.C24860q;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: in.e */
/* loaded from: classes3.dex */
public abstract class AbstractC20631e {
    public static final d Companion;

    /* renamed from: k */
    private static volatile ThreadPoolExecutor f101504k;

    /* renamed from: l */
    private static final Map f101505l;

    /* renamed from: m */
    private static final PriorityQueue f101506m;

    /* renamed from: n */
    private static final AtomicLong f101507n;

    /* renamed from: o */
    private static int f101508o;

    /* renamed from: a */
    private final h f101509a;

    /* renamed from: b */
    private final g f101510b;

    /* renamed from: e */
    private String f101513e;

    /* renamed from: f */
    private String f101514f;

    /* renamed from: g */
    protected int f101515g;

    /* renamed from: h */
    public String f101516h;

    /* renamed from: j */
    public c f101518j;

    /* renamed from: c */
    private final AtomicBoolean f101511c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f101512d = new AtomicBoolean();

    /* renamed from: i */
    private String f101517i = "";

    /* renamed from: in.e$a */
    /* loaded from: classes3.dex */
    public static final class a extends h {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            Object obj;
            boolean z11;
            AbstractC20631e.this.m107493u().set(true);
            Process.setThreadPriority(10);
            AbstractC20631e abstractC20631e = AbstractC20631e.this;
            Object[] m107532a = m107532a();
            C24860q mo1204l = abstractC20631e.mo1204l(Arrays.copyOf(m107532a, m107532a.length));
            if (mo1204l != null) {
                obj = mo1204l.m129215c();
            } else {
                obj = null;
            }
            if (mo1204l != null) {
                z11 = ((Boolean) mo1204l.m129216d()).booleanValue();
            } else {
                z11 = false;
            }
            return AbstractC20631e.this.m107468D(obj, true, z11);
        }
    }

    /* renamed from: in.e$b */
    /* loaded from: classes3.dex */
    public static final class b extends g {
        b(h hVar) {
            super(hVar);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC20631e.this.m107469E(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                AbstractC20631e.this.m107469E(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            }
        }
    }

    /* renamed from: in.e$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo95331a(int i11);

        /* renamed from: b */
        String mo95332b(String str, int i11);

        /* renamed from: c */
        boolean mo95333c();

        /* renamed from: d */
        boolean mo95334d();

        /* renamed from: e */
        void mo95335e(Map map, int i11);

        /* renamed from: f */
        boolean mo95336f(int i11);

        /* renamed from: g */
        int mo95337g(int i11, int i12);

        /* renamed from: h */
        boolean mo95338h();

        /* renamed from: i */
        boolean mo95339i();

        /* renamed from: j */
        boolean mo95340j();
    }

    /* renamed from: in.e$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: in.e$d$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f101521a;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.f101522p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.f101523q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.f101524r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e.f101525s.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[e.f101526t.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f101521a = iArr;
            }
        }

        private d() {
        }

        public /* synthetic */ d(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:3:0x0010, B:7:0x003e, B:9:0x004a, B:14:0x005f, B:16:0x006e, B:18:0x0074, B:20:0x0083, B:22:0x0089, B:24:0x0096, B:29:0x00a4, B:31:0x00b3, B:33:0x00b9, B:35:0x00c8, B:37:0x00ce, B:38:0x00d6, B:49:0x015c, B:51:0x0173, B:53:0x017f, B:55:0x018a, B:58:0x0197, B:60:0x01a3, B:65:0x01b5, B:67:0x01c4, B:69:0x01ca, B:71:0x01d9, B:73:0x01df, B:74:0x01ea, B:77:0x01f9, B:79:0x0211, B:84:0x021f, B:86:0x022e, B:88:0x0234, B:90:0x0241, B:92:0x0247, B:93:0x024f, B:104:0x02f7, B:106:0x0337, B:109:0x0358, B:111:0x0364, B:114:0x036e, B:116:0x0374, B:118:0x0381, B:120:0x0387, B:122:0x0394, B:125:0x039e, B:127:0x03a4, B:129:0x03b3, B:131:0x03b9, B:132:0x03c1), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:3:0x0010, B:7:0x003e, B:9:0x004a, B:14:0x005f, B:16:0x006e, B:18:0x0074, B:20:0x0083, B:22:0x0089, B:24:0x0096, B:29:0x00a4, B:31:0x00b3, B:33:0x00b9, B:35:0x00c8, B:37:0x00ce, B:38:0x00d6, B:49:0x015c, B:51:0x0173, B:53:0x017f, B:55:0x018a, B:58:0x0197, B:60:0x01a3, B:65:0x01b5, B:67:0x01c4, B:69:0x01ca, B:71:0x01d9, B:73:0x01df, B:74:0x01ea, B:77:0x01f9, B:79:0x0211, B:84:0x021f, B:86:0x022e, B:88:0x0234, B:90:0x0241, B:92:0x0247, B:93:0x024f, B:104:0x02f7, B:106:0x0337, B:109:0x0358, B:111:0x0364, B:114:0x036e, B:116:0x0374, B:118:0x0381, B:120:0x0387, B:122:0x0394, B:125:0x039e, B:127:0x03a4, B:129:0x03b3, B:131:0x03b9, B:132:0x03c1), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:3:0x0010, B:7:0x003e, B:9:0x004a, B:14:0x005f, B:16:0x006e, B:18:0x0074, B:20:0x0083, B:22:0x0089, B:24:0x0096, B:29:0x00a4, B:31:0x00b3, B:33:0x00b9, B:35:0x00c8, B:37:0x00ce, B:38:0x00d6, B:49:0x015c, B:51:0x0173, B:53:0x017f, B:55:0x018a, B:58:0x0197, B:60:0x01a3, B:65:0x01b5, B:67:0x01c4, B:69:0x01ca, B:71:0x01d9, B:73:0x01df, B:74:0x01ea, B:77:0x01f9, B:79:0x0211, B:84:0x021f, B:86:0x022e, B:88:0x0234, B:90:0x0241, B:92:0x0247, B:93:0x024f, B:104:0x02f7, B:106:0x0337, B:109:0x0358, B:111:0x0364, B:114:0x036e, B:116:0x0374, B:118:0x0381, B:120:0x0387, B:122:0x0394, B:125:0x039e, B:127:0x03a4, B:129:0x03b3, B:131:0x03b9, B:132:0x03c1), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c8 A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:3:0x0010, B:7:0x003e, B:9:0x004a, B:14:0x005f, B:16:0x006e, B:18:0x0074, B:20:0x0083, B:22:0x0089, B:24:0x0096, B:29:0x00a4, B:31:0x00b3, B:33:0x00b9, B:35:0x00c8, B:37:0x00ce, B:38:0x00d6, B:49:0x015c, B:51:0x0173, B:53:0x017f, B:55:0x018a, B:58:0x0197, B:60:0x01a3, B:65:0x01b5, B:67:0x01c4, B:69:0x01ca, B:71:0x01d9, B:73:0x01df, B:74:0x01ea, B:77:0x01f9, B:79:0x0211, B:84:0x021f, B:86:0x022e, B:88:0x0234, B:90:0x0241, B:92:0x0247, B:93:0x024f, B:104:0x02f7, B:106:0x0337, B:109:0x0358, B:111:0x0364, B:114:0x036e, B:116:0x0374, B:118:0x0381, B:120:0x0387, B:122:0x0394, B:125:0x039e, B:127:0x03a4, B:129:0x03b3, B:131:0x03b9, B:132:0x03c1), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01b5 A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:3:0x0010, B:7:0x003e, B:9:0x004a, B:14:0x005f, B:16:0x006e, B:18:0x0074, B:20:0x0083, B:22:0x0089, B:24:0x0096, B:29:0x00a4, B:31:0x00b3, B:33:0x00b9, B:35:0x00c8, B:37:0x00ce, B:38:0x00d6, B:49:0x015c, B:51:0x0173, B:53:0x017f, B:55:0x018a, B:58:0x0197, B:60:0x01a3, B:65:0x01b5, B:67:0x01c4, B:69:0x01ca, B:71:0x01d9, B:73:0x01df, B:74:0x01ea, B:77:0x01f9, B:79:0x0211, B:84:0x021f, B:86:0x022e, B:88:0x0234, B:90:0x0241, B:92:0x0247, B:93:0x024f, B:104:0x02f7, B:106:0x0337, B:109:0x0358, B:111:0x0364, B:114:0x036e, B:116:0x0374, B:118:0x0381, B:120:0x0387, B:122:0x0394, B:125:0x039e, B:127:0x03a4, B:129:0x03b3, B:131:0x03b9, B:132:0x03c1), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x021f A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:3:0x0010, B:7:0x003e, B:9:0x004a, B:14:0x005f, B:16:0x006e, B:18:0x0074, B:20:0x0083, B:22:0x0089, B:24:0x0096, B:29:0x00a4, B:31:0x00b3, B:33:0x00b9, B:35:0x00c8, B:37:0x00ce, B:38:0x00d6, B:49:0x015c, B:51:0x0173, B:53:0x017f, B:55:0x018a, B:58:0x0197, B:60:0x01a3, B:65:0x01b5, B:67:0x01c4, B:69:0x01ca, B:71:0x01d9, B:73:0x01df, B:74:0x01ea, B:77:0x01f9, B:79:0x0211, B:84:0x021f, B:86:0x022e, B:88:0x0234, B:90:0x0241, B:92:0x0247, B:93:0x024f, B:104:0x02f7, B:106:0x0337, B:109:0x0358, B:111:0x0364, B:114:0x036e, B:116:0x0374, B:118:0x0381, B:120:0x0387, B:122:0x0394, B:125:0x039e, B:127:0x03a4, B:129:0x03b3, B:131:0x03b9, B:132:0x03c1), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x022e A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:3:0x0010, B:7:0x003e, B:9:0x004a, B:14:0x005f, B:16:0x006e, B:18:0x0074, B:20:0x0083, B:22:0x0089, B:24:0x0096, B:29:0x00a4, B:31:0x00b3, B:33:0x00b9, B:35:0x00c8, B:37:0x00ce, B:38:0x00d6, B:49:0x015c, B:51:0x0173, B:53:0x017f, B:55:0x018a, B:58:0x0197, B:60:0x01a3, B:65:0x01b5, B:67:0x01c4, B:69:0x01ca, B:71:0x01d9, B:73:0x01df, B:74:0x01ea, B:77:0x01f9, B:79:0x0211, B:84:0x021f, B:86:0x022e, B:88:0x0234, B:90:0x0241, B:92:0x0247, B:93:0x024f, B:104:0x02f7, B:106:0x0337, B:109:0x0358, B:111:0x0364, B:114:0x036e, B:116:0x0374, B:118:0x0381, B:120:0x0387, B:122:0x0394, B:125:0x039e, B:127:0x03a4, B:129:0x03b3, B:131:0x03b9, B:132:0x03c1), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0241 A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:3:0x0010, B:7:0x003e, B:9:0x004a, B:14:0x005f, B:16:0x006e, B:18:0x0074, B:20:0x0083, B:22:0x0089, B:24:0x0096, B:29:0x00a4, B:31:0x00b3, B:33:0x00b9, B:35:0x00c8, B:37:0x00ce, B:38:0x00d6, B:49:0x015c, B:51:0x0173, B:53:0x017f, B:55:0x018a, B:58:0x0197, B:60:0x01a3, B:65:0x01b5, B:67:0x01c4, B:69:0x01ca, B:71:0x01d9, B:73:0x01df, B:74:0x01ea, B:77:0x01f9, B:79:0x0211, B:84:0x021f, B:86:0x022e, B:88:0x0234, B:90:0x0241, B:92:0x0247, B:93:0x024f, B:104:0x02f7, B:106:0x0337, B:109:0x0358, B:111:0x0364, B:114:0x036e, B:116:0x0374, B:118:0x0381, B:120:0x0387, B:122:0x0394, B:125:0x039e, B:127:0x03a4, B:129:0x03b3, B:131:0x03b9, B:132:0x03c1), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0228  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01f5  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void m107502e(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, AbstractC20631e abstractC20631e, AbstractC20631e abstractC20631e2) {
            String str;
            Integer num;
            Long l11;
            String str2;
            Integer num2;
            g m107492t;
            g m107492t2;
            g m107492t3;
            g m107492t4;
            String str3;
            String str4;
            String str5;
            Integer num3;
            Integer num4;
            Long l12;
            String m107494v;
            String str6;
            Long l13;
            String str7;
            long j11;
            Integer num5;
            Integer num6;
            g m107492t5;
            g m107492t6;
            String m107494v2;
            g m107492t7;
            g m107492t8;
            String m107494v3;
            String str8;
            String str9;
            String str10;
            Integer num7;
            Integer num8;
            Long l14;
            String str11;
            Long l15;
            Integer num9;
            Integer num10;
            g m107492t9;
            g m107492t10;
            String m107494v4;
            g m107492t11;
            g m107492t12;
            String m107494v5;
            try {
                Long l16 = null;
                if (m107512o() >= m107514q().getCorePoolSize()) {
                    if (z11) {
                        int size = m107516s().size();
                        if (abstractC20631e != null && (m107494v5 = abstractC20631e.m107494v()) != null) {
                            str8 = "DownloadFileAsyncTask";
                            str9 = m107494v5;
                            if (abstractC20631e == null) {
                                str10 = ", ts=";
                                num7 = Integer.valueOf(abstractC20631e.f101515g);
                            } else {
                                str10 = ", ts=";
                                num7 = null;
                            }
                            if (abstractC20631e == null && (m107492t12 = abstractC20631e.m107492t()) != null) {
                                num8 = Integer.valueOf(m107492t12.m107526d());
                            } else {
                                num8 = null;
                            }
                            if (abstractC20631e == null && (m107492t11 = abstractC20631e.m107492t()) != null) {
                                l14 = Long.valueOf(m107492t11.m107527e());
                            } else {
                                l14 = null;
                            }
                            if (abstractC20631e2 != null && (m107494v4 = abstractC20631e2.m107494v()) != null) {
                                str11 = m107494v4;
                                if (abstractC20631e2 == null) {
                                    l15 = l14;
                                    num9 = Integer.valueOf(abstractC20631e2.f101515g);
                                } else {
                                    l15 = l14;
                                    num9 = null;
                                }
                                if (abstractC20631e2 == null && (m107492t10 = abstractC20631e2.m107492t()) != null) {
                                    num10 = Integer.valueOf(m107492t10.m107526d());
                                } else {
                                    num10 = null;
                                }
                                if (abstractC20631e2 != null && (m107492t9 = abstractC20631e2.m107492t()) != null) {
                                    l16 = Long.valueOf(m107492t9.m107527e());
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("checkDownloadNextTaskInWaitingQueue() queue is FULL.\n + Waiting: ");
                                sb2.append(size);
                                sb2.append(" items. \n + Is contain: ");
                                sb2.append(z12);
                                sb2.append(". \n + Removed value: ");
                                sb2.append(z13);
                                sb2.append(". \n + Is still contain: ");
                                sb2.append(z14);
                                sb2.append(". \n + Added value: ");
                                sb2.append(z15);
                                sb2.append(". \n + Peek: [IDHash=");
                                sb2.append(str9);
                                sb2.append(", type=");
                                sb2.append(num7);
                                sb2.append(", priority=");
                                sb2.append(num8);
                                String str12 = str10;
                                sb2.append(str12);
                                sb2.append(l15);
                                sb2.append("]. \n + Target task: [IDHash=");
                                sb2.append(str11);
                                sb2.append(", type=");
                                sb2.append(num9);
                                sb2.append(", priority=");
                                sb2.append(num10);
                                sb2.append(str12);
                                sb2.append(l16);
                                sb2.append("].");
                                C21654a.m111581h(str8, sb2.toString(), C21654a.a.f105049r, false, 8, null);
                                return;
                            }
                            str11 = "";
                            if (abstractC20631e2 == null) {
                            }
                            if (abstractC20631e2 == null) {
                            }
                            num10 = null;
                            if (abstractC20631e2 != null) {
                                l16 = Long.valueOf(m107492t9.m107527e());
                            }
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append("checkDownloadNextTaskInWaitingQueue() queue is FULL.\n + Waiting: ");
                            sb22.append(size);
                            sb22.append(" items. \n + Is contain: ");
                            sb22.append(z12);
                            sb22.append(". \n + Removed value: ");
                            sb22.append(z13);
                            sb22.append(". \n + Is still contain: ");
                            sb22.append(z14);
                            sb22.append(". \n + Added value: ");
                            sb22.append(z15);
                            sb22.append(". \n + Peek: [IDHash=");
                            sb22.append(str9);
                            sb22.append(", type=");
                            sb22.append(num7);
                            sb22.append(", priority=");
                            sb22.append(num8);
                            String str122 = str10;
                            sb22.append(str122);
                            sb22.append(l15);
                            sb22.append("]. \n + Target task: [IDHash=");
                            sb22.append(str11);
                            sb22.append(", type=");
                            sb22.append(num9);
                            sb22.append(", priority=");
                            sb22.append(num10);
                            sb22.append(str122);
                            sb22.append(l16);
                            sb22.append("].");
                            C21654a.m111581h(str8, sb22.toString(), C21654a.a.f105049r, false, 8, null);
                            return;
                        }
                        str8 = "DownloadFileAsyncTask";
                        str9 = "";
                        if (abstractC20631e == null) {
                        }
                        if (abstractC20631e == null) {
                        }
                        num8 = null;
                        if (abstractC20631e == null) {
                        }
                        l14 = null;
                        if (abstractC20631e2 != null) {
                            str11 = m107494v4;
                            if (abstractC20631e2 == null) {
                            }
                            if (abstractC20631e2 == null) {
                            }
                            num10 = null;
                            if (abstractC20631e2 != null) {
                            }
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append("checkDownloadNextTaskInWaitingQueue() queue is FULL.\n + Waiting: ");
                            sb222.append(size);
                            sb222.append(" items. \n + Is contain: ");
                            sb222.append(z12);
                            sb222.append(". \n + Removed value: ");
                            sb222.append(z13);
                            sb222.append(". \n + Is still contain: ");
                            sb222.append(z14);
                            sb222.append(". \n + Added value: ");
                            sb222.append(z15);
                            sb222.append(". \n + Peek: [IDHash=");
                            sb222.append(str9);
                            sb222.append(", type=");
                            sb222.append(num7);
                            sb222.append(", priority=");
                            sb222.append(num8);
                            String str1222 = str10;
                            sb222.append(str1222);
                            sb222.append(l15);
                            sb222.append("]. \n + Target task: [IDHash=");
                            sb222.append(str11);
                            sb222.append(", type=");
                            sb222.append(num9);
                            sb222.append(", priority=");
                            sb222.append(num10);
                            sb222.append(str1222);
                            sb222.append(l16);
                            sb222.append("].");
                            C21654a.m111581h(str8, sb222.toString(), C21654a.a.f105049r, false, 8, null);
                            return;
                        }
                        str11 = "";
                        if (abstractC20631e2 == null) {
                        }
                        if (abstractC20631e2 == null) {
                        }
                        num10 = null;
                        if (abstractC20631e2 != null) {
                        }
                        StringBuilder sb2222 = new StringBuilder();
                        sb2222.append("checkDownloadNextTaskInWaitingQueue() queue is FULL.\n + Waiting: ");
                        sb2222.append(size);
                        sb2222.append(" items. \n + Is contain: ");
                        sb2222.append(z12);
                        sb2222.append(". \n + Removed value: ");
                        sb2222.append(z13);
                        sb2222.append(". \n + Is still contain: ");
                        sb2222.append(z14);
                        sb2222.append(". \n + Added value: ");
                        sb2222.append(z15);
                        sb2222.append(". \n + Peek: [IDHash=");
                        sb2222.append(str9);
                        sb2222.append(", type=");
                        sb2222.append(num7);
                        sb2222.append(", priority=");
                        sb2222.append(num8);
                        String str12222 = str10;
                        sb2222.append(str12222);
                        sb2222.append(l15);
                        sb2222.append("]. \n + Target task: [IDHash=");
                        sb2222.append(str11);
                        sb2222.append(", type=");
                        sb2222.append(num9);
                        sb2222.append(", priority=");
                        sb2222.append(num10);
                        sb2222.append(str12222);
                        sb2222.append(l16);
                        sb2222.append("].");
                        C21654a.m111581h(str8, sb2222.toString(), C21654a.a.f105049r, false, 8, null);
                        return;
                    }
                    return;
                }
                AbstractC20631e abstractC20631e3 = (AbstractC20631e) m107516s().peek();
                if (abstractC20631e3 != null && abstractC20631e3.m107492t().m107526d() != 1 && abstractC20631e3.m107492t().m107526d() != 2 && abstractC20631e3.m107492t().m107526d() != 3) {
                    if (z11) {
                        int size2 = m107516s().size();
                        if (abstractC20631e != null && (m107494v3 = abstractC20631e.m107494v()) != null) {
                            str3 = "DownloadFileAsyncTask";
                            str4 = m107494v3;
                            if (abstractC20631e == null) {
                                str5 = ", priority=";
                                num3 = Integer.valueOf(abstractC20631e.f101515g);
                            } else {
                                str5 = ", priority=";
                                num3 = null;
                            }
                            if (abstractC20631e == null && (m107492t8 = abstractC20631e.m107492t()) != null) {
                                num4 = Integer.valueOf(m107492t8.m107526d());
                            } else {
                                num4 = null;
                            }
                            if (abstractC20631e == null && (m107492t7 = abstractC20631e.m107492t()) != null) {
                                l12 = Long.valueOf(m107492t7.m107527e());
                            } else {
                                l12 = null;
                            }
                            m107494v = abstractC20631e3.m107494v();
                            if (m107494v != null) {
                                l13 = l12;
                                str6 = "";
                            } else {
                                str6 = m107494v;
                                l13 = l12;
                            }
                            int i11 = abstractC20631e3.f101515g;
                            int m107526d = abstractC20631e3.m107492t().m107526d();
                            Integer num11 = num3;
                            long m107527e = abstractC20631e3.m107492t().m107527e();
                            if (abstractC20631e2 != null && (m107494v2 = abstractC20631e2.m107494v()) != null) {
                                str7 = m107494v2;
                                if (abstractC20631e2 == null) {
                                    j11 = m107527e;
                                    num5 = Integer.valueOf(abstractC20631e2.f101515g);
                                } else {
                                    j11 = m107527e;
                                    num5 = null;
                                }
                                if (abstractC20631e2 == null && (m107492t6 = abstractC20631e2.m107492t()) != null) {
                                    num6 = Integer.valueOf(m107492t6.m107526d());
                                } else {
                                    num6 = null;
                                }
                                if (abstractC20631e2 != null && (m107492t5 = abstractC20631e2.m107492t()) != null) {
                                    l16 = Long.valueOf(m107492t5.m107527e());
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("checkDownloadNextTaskInWaitingQueue() task is PENDING. \n + Waiting: ");
                                sb3.append(size2);
                                sb3.append(" items. \n + Is contain: ");
                                sb3.append(z12);
                                sb3.append(". \n + Removed value: ");
                                sb3.append(z13);
                                sb3.append(". \n + Is still contain: ");
                                sb3.append(z14);
                                sb3.append(". \n + Added value: ");
                                sb3.append(z15);
                                sb3.append(". \n + Peek: [IDHash=");
                                sb3.append(str4);
                                sb3.append(", type=");
                                sb3.append(num11);
                                String str13 = str5;
                                sb3.append(str13);
                                sb3.append(num4);
                                sb3.append(", ts=");
                                sb3.append(l13);
                                sb3.append("]. \n + Current top: [IDHash=");
                                sb3.append(str6);
                                sb3.append(", type=");
                                sb3.append(i11);
                                sb3.append(str13);
                                sb3.append(m107526d);
                                sb3.append(", ts=");
                                sb3.append(j11);
                                sb3.append("]. \n + Target task: [IDHash=");
                                sb3.append(str7);
                                sb3.append(", type=");
                                sb3.append(num5);
                                sb3.append(str13);
                                sb3.append(num6);
                                sb3.append(", ts=");
                                sb3.append(l16);
                                sb3.append("].");
                                C21654a.m111581h(str3, sb3.toString(), C21654a.a.f105049r, false, 8, null);
                                return;
                            }
                            str7 = "";
                            if (abstractC20631e2 == null) {
                            }
                            if (abstractC20631e2 == null) {
                            }
                            num6 = null;
                            if (abstractC20631e2 != null) {
                                l16 = Long.valueOf(m107492t5.m107527e());
                            }
                            StringBuilder sb32 = new StringBuilder();
                            sb32.append("checkDownloadNextTaskInWaitingQueue() task is PENDING. \n + Waiting: ");
                            sb32.append(size2);
                            sb32.append(" items. \n + Is contain: ");
                            sb32.append(z12);
                            sb32.append(". \n + Removed value: ");
                            sb32.append(z13);
                            sb32.append(". \n + Is still contain: ");
                            sb32.append(z14);
                            sb32.append(". \n + Added value: ");
                            sb32.append(z15);
                            sb32.append(". \n + Peek: [IDHash=");
                            sb32.append(str4);
                            sb32.append(", type=");
                            sb32.append(num11);
                            String str132 = str5;
                            sb32.append(str132);
                            sb32.append(num4);
                            sb32.append(", ts=");
                            sb32.append(l13);
                            sb32.append("]. \n + Current top: [IDHash=");
                            sb32.append(str6);
                            sb32.append(", type=");
                            sb32.append(i11);
                            sb32.append(str132);
                            sb32.append(m107526d);
                            sb32.append(", ts=");
                            sb32.append(j11);
                            sb32.append("]. \n + Target task: [IDHash=");
                            sb32.append(str7);
                            sb32.append(", type=");
                            sb32.append(num5);
                            sb32.append(str132);
                            sb32.append(num6);
                            sb32.append(", ts=");
                            sb32.append(l16);
                            sb32.append("].");
                            C21654a.m111581h(str3, sb32.toString(), C21654a.a.f105049r, false, 8, null);
                            return;
                        }
                        str3 = "DownloadFileAsyncTask";
                        str4 = "";
                        if (abstractC20631e == null) {
                        }
                        if (abstractC20631e == null) {
                        }
                        num4 = null;
                        if (abstractC20631e == null) {
                        }
                        l12 = null;
                        m107494v = abstractC20631e3.m107494v();
                        if (m107494v != null) {
                        }
                        int i112 = abstractC20631e3.f101515g;
                        int m107526d2 = abstractC20631e3.m107492t().m107526d();
                        Integer num112 = num3;
                        long m107527e2 = abstractC20631e3.m107492t().m107527e();
                        if (abstractC20631e2 != null) {
                            str7 = m107494v2;
                            if (abstractC20631e2 == null) {
                            }
                            if (abstractC20631e2 == null) {
                            }
                            num6 = null;
                            if (abstractC20631e2 != null) {
                            }
                            StringBuilder sb322 = new StringBuilder();
                            sb322.append("checkDownloadNextTaskInWaitingQueue() task is PENDING. \n + Waiting: ");
                            sb322.append(size2);
                            sb322.append(" items. \n + Is contain: ");
                            sb322.append(z12);
                            sb322.append(". \n + Removed value: ");
                            sb322.append(z13);
                            sb322.append(". \n + Is still contain: ");
                            sb322.append(z14);
                            sb322.append(". \n + Added value: ");
                            sb322.append(z15);
                            sb322.append(". \n + Peek: [IDHash=");
                            sb322.append(str4);
                            sb322.append(", type=");
                            sb322.append(num112);
                            String str1322 = str5;
                            sb322.append(str1322);
                            sb322.append(num4);
                            sb322.append(", ts=");
                            sb322.append(l13);
                            sb322.append("]. \n + Current top: [IDHash=");
                            sb322.append(str6);
                            sb322.append(", type=");
                            sb322.append(i112);
                            sb322.append(str1322);
                            sb322.append(m107526d2);
                            sb322.append(", ts=");
                            sb322.append(j11);
                            sb322.append("]. \n + Target task: [IDHash=");
                            sb322.append(str7);
                            sb322.append(", type=");
                            sb322.append(num5);
                            sb322.append(str1322);
                            sb322.append(num6);
                            sb322.append(", ts=");
                            sb322.append(l16);
                            sb322.append("].");
                            C21654a.m111581h(str3, sb322.toString(), C21654a.a.f105049r, false, 8, null);
                            return;
                        }
                        str7 = "";
                        if (abstractC20631e2 == null) {
                        }
                        if (abstractC20631e2 == null) {
                        }
                        num6 = null;
                        if (abstractC20631e2 != null) {
                        }
                        StringBuilder sb3222 = new StringBuilder();
                        sb3222.append("checkDownloadNextTaskInWaitingQueue() task is PENDING. \n + Waiting: ");
                        sb3222.append(size2);
                        sb3222.append(" items. \n + Is contain: ");
                        sb3222.append(z12);
                        sb3222.append(". \n + Removed value: ");
                        sb3222.append(z13);
                        sb3222.append(". \n + Is still contain: ");
                        sb3222.append(z14);
                        sb3222.append(". \n + Added value: ");
                        sb3222.append(z15);
                        sb3222.append(". \n + Peek: [IDHash=");
                        sb3222.append(str4);
                        sb3222.append(", type=");
                        sb3222.append(num112);
                        String str13222 = str5;
                        sb3222.append(str13222);
                        sb3222.append(num4);
                        sb3222.append(", ts=");
                        sb3222.append(l13);
                        sb3222.append("]. \n + Current top: [IDHash=");
                        sb3222.append(str6);
                        sb3222.append(", type=");
                        sb3222.append(i112);
                        sb3222.append(str13222);
                        sb3222.append(m107526d2);
                        sb3222.append(", ts=");
                        sb3222.append(j11);
                        sb3222.append("]. \n + Target task: [IDHash=");
                        sb3222.append(str7);
                        sb3222.append(", type=");
                        sb3222.append(num5);
                        sb3222.append(str13222);
                        sb3222.append(num6);
                        sb3222.append(", ts=");
                        sb3222.append(l16);
                        sb3222.append("].");
                        C21654a.m111581h(str3, sb3222.toString(), C21654a.a.f105049r, false, 8, null);
                        return;
                    }
                    return;
                }
                AbstractC20631e m107509m = m107509m(m107509m(m107509m(m107509m(m107509m((AbstractC20631e) m107516s().poll(), m107516s(), e.f101522p), m107516s(), e.f101523q), m107516s(), e.f101524r), m107516s(), e.f101525s), m107516s(), e.f101526t);
                if (m107509m != null) {
                    m107515r().remove(m107509m.f101516h);
                    m107514q().execute(m107509m.m107492t());
                    m107519v(m107512o() + 1);
                    return;
                }
                if (z11) {
                    int size3 = m107516s().size();
                    if (abstractC20631e == null || (str = abstractC20631e.m107494v()) == null) {
                        str = "";
                    }
                    if (abstractC20631e != null && (m107492t4 = abstractC20631e.m107492t()) != null) {
                        num = Integer.valueOf(m107492t4.m107526d());
                    } else {
                        num = null;
                    }
                    if (abstractC20631e != null && (m107492t3 = abstractC20631e.m107492t()) != null) {
                        l11 = Long.valueOf(m107492t3.m107527e());
                    } else {
                        l11 = null;
                    }
                    if (abstractC20631e2 == null || (str2 = abstractC20631e2.m107494v()) == null) {
                        str2 = "";
                    }
                    if (abstractC20631e2 != null && (m107492t2 = abstractC20631e2.m107492t()) != null) {
                        num2 = Integer.valueOf(m107492t2.m107526d());
                    } else {
                        num2 = null;
                    }
                    if (abstractC20631e2 != null && (m107492t = abstractC20631e2.m107492t()) != null) {
                        l16 = Long.valueOf(m107492t.m107527e());
                    }
                    C21654a.m111581h("DownloadFileAsyncTask", "checkDownloadNextTaskInWaitingQueue() next task is null. \n+ Waiting: " + size3 + " items. \n + Is contain: " + z12 + ". \n + Removed value: " + z13 + ". \n + Is still contain: " + z14 + ". \n + Added value: " + z15 + ". \n + Peek: " + str + ", " + num + ", " + l11 + ". \n + Target task: " + str2 + ", " + num2 + ", " + l16 + ".", C21654a.a.f105049r, false, 8, null);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DownloadFileAsyncTask", e11);
            }
        }

        /* renamed from: f */
        static /* synthetic */ void m107503f(d dVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, AbstractC20631e abstractC20631e, AbstractC20631e abstractC20631e2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            if ((i11 & 2) != 0) {
                z12 = false;
            }
            if ((i11 & 4) != 0) {
                z13 = false;
            }
            if ((i11 & 8) != 0) {
                z14 = false;
            }
            if ((i11 & 16) != 0) {
                z15 = false;
            }
            if ((i11 & 32) != 0) {
                abstractC20631e = null;
            }
            if ((i11 & 64) != 0) {
                abstractC20631e2 = null;
            }
            dVar.m107502e(z11, z12, z13, z14, z15, abstractC20631e, abstractC20631e2);
        }

        /* renamed from: h */
        public static final void m107504h(LinkedList linkedList) {
            AbstractC19074t.m100208f(linkedList, "$cloneQueue");
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((AbstractC20631e) it.next()).mo107421i(true);
            }
        }

        /* renamed from: i */
        public final ThreadPoolExecutor m107505i() {
            int i11;
            if (Build.VERSION.SDK_INT >= 24) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i11, i11, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC18928a("DownloadFileAsyncTask"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }

        /* renamed from: j */
        public final boolean m107506j(AbstractC20631e abstractC20631e, c cVar, e eVar) {
            if (abstractC20631e.mo107495x()) {
                return true;
            }
            int i11 = a.f101521a[eVar.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                return cVar.mo95333c();
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return cVar.mo95338h();
                    }
                    return cVar.mo95340j();
                }
                return cVar.mo95334d();
            }
            return cVar.mo95339i();
        }

        /* renamed from: k */
        public final int m107507k(int i11, e eVar) {
            int i12 = a.f101521a[eVar.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                if (i11 == 2) {
                                    return 12;
                                }
                                return 13;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        if (i11 == 2) {
                            return 10;
                        }
                        return 11;
                    }
                    if (i11 == 2) {
                        return 8;
                    }
                    return 9;
                }
                if (i11 == 2) {
                    return 6;
                }
                return 7;
            }
            if (i11 != 2) {
                return 5;
            }
            return 4;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[ORIG_RETURN, RETURN] */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final int m107508l(e eVar, int i11) {
            int i12 = a.f101521a[eVar.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                if (i11 != 12) {
                                    if (i11 == 13) {
                                        return 3;
                                    }
                                    return i11;
                                }
                                return 2;
                            }
                            return i11;
                        }
                        if (i11 != 10) {
                            if (i11 != 11) {
                                return i11;
                            }
                        }
                        return 2;
                    }
                    if (i11 != 8) {
                        if (i11 != 9) {
                            return i11;
                        }
                    }
                    return 2;
                }
                if (i11 != 6) {
                    if (i11 != 7) {
                        return i11;
                    }
                }
                return 2;
            }
            if (i11 != 4) {
                if (i11 != 5) {
                    return i11;
                }
            }
            return 2;
        }

        /* renamed from: m */
        private final AbstractC20631e m107509m(AbstractC20631e abstractC20631e, PriorityQueue priorityQueue, e eVar) {
            c cVar;
            while (abstractC20631e != null && ((abstractC20631e.m107492t().m107526d() == 2 || abstractC20631e.m107492t().m107526d() == 3) && (cVar = abstractC20631e.f101518j) != null)) {
                AbstractC19074t.m100205c(cVar);
                if (m107506j(abstractC20631e, cVar, eVar)) {
                    break;
                }
                abstractC20631e.m107492t().m107530h(m107507k(abstractC20631e.m107492t().m107526d(), eVar));
                abstractC20631e.m107492t().m107531i(m107511n());
                c cVar2 = abstractC20631e.f101518j;
                AbstractC19074t.m100205c(cVar2);
                cVar2.mo95331a(abstractC20631e.m107492t().m107526d());
                priorityQueue.add(abstractC20631e);
                AbstractC20631e abstractC20631e2 = (AbstractC20631e) priorityQueue.peek();
                if (abstractC20631e2 != null && (abstractC20631e2.m107492t().m107526d() == 2 || abstractC20631e2.m107492t().m107526d() == 3)) {
                    abstractC20631e = (AbstractC20631e) priorityQueue.poll();
                } else {
                    abstractC20631e = null;
                }
            }
            return abstractC20631e;
        }

        /* renamed from: g */
        public final void m107510g() {
            LinkedList linkedList = new LinkedList();
            synchronized (AbstractC20631e.class) {
                d dVar = AbstractC20631e.Companion;
                linkedList.addAll(dVar.m107516s());
                dVar.m107515r().clear();
                dVar.m107516s().clear();
                dVar.m107519v(0);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: in.f

                /* renamed from: p */
                public final /* synthetic */ LinkedList f101534p;

                public /* synthetic */ RunnableC20632f(LinkedList linkedList2) {
                    r1 = linkedList2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC20631e.d.m107504h(r1);
                }
            });
        }

        /* renamed from: n */
        public final long m107511n() {
            return m107513p().decrementAndGet();
        }

        /* renamed from: o */
        public final int m107512o() {
            return AbstractC20631e.f101508o;
        }

        /* renamed from: p */
        public final AtomicLong m107513p() {
            return AbstractC20631e.f101507n;
        }

        /* renamed from: q */
        public final ThreadPoolExecutor m107514q() {
            return AbstractC20631e.f101504k;
        }

        /* renamed from: r */
        public final Map m107515r() {
            return AbstractC20631e.f101505l;
        }

        /* renamed from: s */
        public final PriorityQueue m107516s() {
            return AbstractC20631e.f101506m;
        }

        /* renamed from: t */
        public final boolean m107517t(String str) {
            AbstractC19074t.m100208f(str, "taskId");
            return m107515r().containsKey(str);
        }

        /* renamed from: u */
        public final void m107518u(AbstractC20631e abstractC20631e) {
            AbstractC19074t.m100208f(abstractC20631e, "task");
            synchronized (AbstractC20631e.class) {
                d dVar = AbstractC20631e.Companion;
                dVar.m107515r().remove(abstractC20631e.f101516h);
                dVar.m107516s().remove(abstractC20631e);
            }
        }

        /* renamed from: v */
        public final void m107519v(int i11) {
            AbstractC20631e.f101508o = i11;
        }

        /* renamed from: w */
        public final void m107520w(e eVar) {
            d dVar;
            int m107508l;
            AbstractC19074t.m100208f(eVar, "conditionType");
            synchronized (AbstractC20631e.class) {
                try {
                    Iterator it = AbstractC20631e.Companion.m107515r().entrySet().iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        AbstractC20631e abstractC20631e = (AbstractC20631e) ((Map.Entry) it.next()).getValue();
                        if (abstractC20631e.f101518j != null && (m107508l = (dVar = AbstractC20631e.Companion).m107508l(eVar, abstractC20631e.m107492t().m107526d())) != abstractC20631e.m107492t().m107526d()) {
                            abstractC20631e.m107492t().m107530h(m107508l);
                            c cVar = abstractC20631e.f101518j;
                            AbstractC19074t.m100205c(cVar);
                            cVar.mo95331a(m107508l);
                            dVar.m107516s().remove(abstractC20631e);
                            dVar.m107516s().add(abstractC20631e);
                            i11++;
                        }
                    }
                    while (true) {
                        d dVar2 = AbstractC20631e.Companion;
                        if (dVar2.m107512o() >= dVar2.m107514q().getCorePoolSize()) {
                            break;
                        }
                        int i12 = i11 - 1;
                        if (i11 <= 0) {
                            break;
                        }
                        m107503f(dVar2, false, false, false, false, false, null, null, 127, null);
                        i11 = i12;
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: x */
        public final void m107521x(String str, C17945a0 c17945a0, boolean z11) {
            AbstractC19074t.m100208f(c17945a0, "msg");
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            synchronized (AbstractC20631e.class) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        d dVar = AbstractC20631e.Companion;
                        AbstractC20631e abstractC20631e = (AbstractC20631e) dVar.m107515r().get(str);
                        if (abstractC20631e != null) {
                            if (abstractC20631e.m107492t().m107526d() != 1) {
                                C21654a.m111581h("DownloadFileAsyncTask", "updatePriorityIfPreDownload: MsgId = " + c17945a0.m95029V3(), C21654a.a.f105047p, false, 8, null);
                            }
                            abstractC20631e.m107492t().m107530h(1);
                            abstractC20631e.m107492t().m107531i(m120579F1.mo124310e());
                            dVar.m107502e(z11, dVar.m107516s().contains(abstractC20631e), dVar.m107516s().remove(abstractC20631e), dVar.m107516s().contains(abstractC20631e), dVar.m107516s().add(abstractC20631e), (AbstractC20631e) dVar.m107516s().peek(), abstractC20631e);
                        } else if (z11) {
                            MessageId m95029V3 = c17945a0.m95029V3();
                            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                            C21654a.m111581h("DownloadFileAsyncTask", "updatePriorityIfPreDownload() not in map. CliID=" + m95029V3.m41044h() + ", GloID=" + m95029V3.m41046j() + ", OwnerID=" + m95029V3.m41048l() + ", SenderID=" + m95029V3.m41050n() + ", Waiting: " + dVar.m107516s().size() + " items, Processing: " + dVar.m107512o() + " tasks", C21654a.a.f105049r, false, 8, null);
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: in.e$e */
    /* loaded from: classes3.dex */
    public static final class e extends Enum {

        /* renamed from: p */
        public static final e f101522p = new e("FAIL_NETWORK", 0);

        /* renamed from: q */
        public static final e f101523q = new e("APP_STATE", 1);

        /* renamed from: r */
        public static final e f101524r = new e("TIME_SEGMENT", 2);

        /* renamed from: s */
        public static final e f101525s = new e("OUT_QUOTA", 3);

        /* renamed from: t */
        public static final e f101526t = new e("LOCAL_SETTING_OFF", 4);

        /* renamed from: u */
        private static final /* synthetic */ e[] f101527u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f101528v;

        static {
            e[] m107522b = m107522b();
            f101527u = m107522b;
            f101528v = AbstractC30166b.m148796a(m107522b);
        }

        private e(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ e[] m107522b() {
            return new e[]{f101522p, f101523q, f101524r, f101525s, f101526t};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f101527u.clone();
        }
    }

    /* renamed from: in.e$f */
    /* loaded from: classes3.dex */
    private static final class f implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(AbstractC20631e abstractC20631e, AbstractC20631e abstractC20631e2) {
            AbstractC19074t.m100208f(abstractC20631e, "o1");
            AbstractC19074t.m100208f(abstractC20631e2, "o2");
            g m107492t = abstractC20631e.m107492t();
            int m107526d = m107492t.m107526d();
            long m107527e = m107492t.m107527e();
            int m107525c = m107492t.m107525c();
            long m107524a = m107492t.m107524a();
            g m107492t2 = abstractC20631e2.m107492t();
            int m107526d2 = m107492t2.m107526d();
            long m107527e2 = m107492t2.m107527e();
            int m107525c2 = m107492t2.m107525c();
            long m107524a2 = m107492t2.m107524a();
            int m100209g = AbstractC19074t.m100209g(m107526d, m107526d2);
            if (m100209g != 0) {
                return m100209g;
            }
            int m100210h = AbstractC19074t.m100210h(m107524a, m107524a2);
            if (m100210h != 0) {
                return m100210h;
            }
            int m100210h2 = AbstractC19074t.m100210h(m107527e2, m107527e);
            if (m100210h2 != 0) {
                return m100210h2;
            }
            if ((m107525c == 8 && m107525c2 == 4) || (m107525c2 == 8 && m107525c == 4)) {
                return 0;
            }
            return AbstractC19074t.m100209g(m107525c, m107525c2);
        }
    }

    /* renamed from: in.e$g */
    /* loaded from: classes3.dex */
    public static class g extends FutureTask {

        /* renamed from: p */
        private int f101529p;

        /* renamed from: q */
        private long f101530q;

        /* renamed from: r */
        private int f101531r;

        /* renamed from: s */
        private long f101532s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Callable callable) {
            super(callable);
            AbstractC19074t.m100208f(callable, "callable");
            this.f101529p = 2;
        }

        /* renamed from: a */
        public final long m107524a() {
            return this.f101532s;
        }

        /* renamed from: c */
        public final int m107525c() {
            return this.f101531r;
        }

        /* renamed from: d */
        public final int m107526d() {
            return this.f101529p;
        }

        /* renamed from: e */
        public final long m107527e() {
            return this.f101530q;
        }

        /* renamed from: f */
        public final void m107528f(long j11) {
            this.f101532s = j11;
        }

        /* renamed from: g */
        public final void m107529g(int i11) {
            this.f101531r = i11;
        }

        /* renamed from: h */
        public final void m107530h(int i11) {
            this.f101529p = i11;
        }

        /* renamed from: i */
        public final void m107531i(long j11) {
            this.f101530q = j11;
        }
    }

    /* renamed from: in.e$h */
    /* loaded from: classes3.dex */
    public static abstract class h implements Callable {

        /* renamed from: a */
        public Object[] f101533a;

        /* renamed from: a */
        public final Object[] m107532a() {
            Object[] objArr = this.f101533a;
            if (objArr != null) {
                return objArr;
            }
            AbstractC19074t.m100223u("params");
            return null;
        }

        /* renamed from: b */
        public final void m107533b(Object[] objArr) {
            AbstractC19074t.m100208f(objArr, "<set-?>");
            this.f101533a = objArr;
        }
    }

    static {
        d dVar = new d(null);
        Companion = dVar;
        f101504k = dVar.m107505i();
        f101505l = new HashMap();
        f101506m = new PriorityQueue(11, new f());
        f101507n = new AtomicLong(Long.MAX_VALUE);
    }

    public AbstractC20631e() {
        a aVar = new a();
        this.f101509a = aVar;
        this.f101510b = new b(aVar);
    }

    /* renamed from: D */
    public final Object m107468D(Object obj, boolean z11, boolean z12) {
        m107480p(obj, z11, z12);
        return obj;
    }

    /* renamed from: E */
    public final void m107469E(Object obj) {
        if (!this.f101512d.get()) {
            m107468D(obj, false, false);
        }
    }

    /* renamed from: k */
    private final int m107478k(int i11, e eVar, c cVar) {
        if (i11 == 2 || i11 == 3) {
            d dVar = Companion;
            if (!dVar.m107506j(this, cVar, eVar)) {
                int m107507k = dVar.m107507k(i11, eVar);
                cVar.mo95331a(m107507k);
                return m107507k;
            }
            return i11;
        }
        return i11;
    }

    /* renamed from: n */
    private final AbstractC20631e m107479n(Executor executor, int i11, long j11, int i12, long j12, String str, Object... objArr) {
        int i13;
        boolean z11;
        try {
            m107482B();
            g gVar = this.f101510b;
            gVar.m107531i(j11);
            gVar.m107529g(i12);
            gVar.m107528f(j12);
            this.f101509a.m107533b(objArr);
            this.f101516h = str;
            c cVar = this.f101518j;
            if (cVar != null) {
                e eVar = e.f101522p;
                AbstractC19074t.m100205c(cVar);
                int m107478k = m107478k(i11, eVar, cVar);
                e eVar2 = e.f101523q;
                c cVar2 = this.f101518j;
                AbstractC19074t.m100205c(cVar2);
                int m107478k2 = m107478k(m107478k, eVar2, cVar2);
                e eVar3 = e.f101524r;
                c cVar3 = this.f101518j;
                AbstractC19074t.m100205c(cVar3);
                int m107478k3 = m107478k(m107478k2, eVar3, cVar3);
                e eVar4 = e.f101525s;
                c cVar4 = this.f101518j;
                AbstractC19074t.m100205c(cVar4);
                int m107478k4 = m107478k(m107478k3, eVar4, cVar4);
                e eVar5 = e.f101526t;
                c cVar5 = this.f101518j;
                AbstractC19074t.m100205c(cVar5);
                i13 = m107478k(m107478k4, eVar5, cVar5);
            } else {
                i13 = i11;
            }
            this.f101510b.m107530h(i13);
            if (i13 == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            synchronized (AbstractC20631e.class) {
                try {
                    if (f101508o < f101504k.getCorePoolSize() && z11) {
                        executor.execute(this.f101510b);
                        f101508o++;
                    } else {
                        f101505l.put(str, this);
                        f101506m.add(this);
                    }
                    AtomicLong atomicLong = f101507n;
                    if (j11 < atomicLong.get()) {
                        atomicLong.set(j11);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DownloadFileAsyncTask", e11);
        }
        return this;
    }

    /* renamed from: p */
    private final void m107480p(Object obj, boolean z11, boolean z12) {
        AbstractC23350e.m122772b("DownloadFileAsyncTask", "doInBackground(): finished (type=%d)", Integer.valueOf(this.f101515g));
        if (!mo107426w()) {
            if (m107496y()) {
                m107497z();
            } else {
                mo1197A(obj, z12);
            }
            m107487j(z11);
        }
    }

    /* renamed from: q */
    public static final long m107481q() {
        return Companion.m107511n();
    }

    /* renamed from: A */
    public void mo1197A(Object obj, boolean z11) {
    }

    /* renamed from: B */
    protected final void m107482B() {
    }

    /* renamed from: C */
    public void mo1198C(Object... objArr) {
        AbstractC19074t.m100208f(objArr, "values");
    }

    /* renamed from: F */
    public final void m107483F(Object... objArr) {
        AbstractC19074t.m100208f(objArr, "values");
        if (!m107496y()) {
            mo1198C(Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: G */
    public final void m107484G(c cVar) {
        AbstractC19074t.m100208f(cVar, "delegate");
        this.f101518j = cVar;
    }

    /* renamed from: H */
    public final void m107485H(String str) {
        this.f101514f = str;
    }

    /* renamed from: I */
    public final void m107486I(String str) {
        this.f101513e = str;
    }

    /* renamed from: i */
    public boolean mo107421i(boolean z11) {
        Companion.m107518u(this);
        this.f101511c.set(true);
        return this.f101510b.cancel(z11);
    }

    /* renamed from: j */
    public final void m107487j(boolean z11) {
        synchronized (AbstractC20631e.class) {
            if (z11) {
                try {
                    f101508o--;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            d.m107503f(Companion, false, false, false, false, false, null, null, 127, null);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: l */
    protected abstract C24860q mo1204l(Object... objArr);

    /* renamed from: m */
    public final AbstractC20631e m107488m(Object... objArr) {
        AbstractC19074t.m100208f(objArr, "params");
        InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
        AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
        ThreadPoolExecutor threadPoolExecutor = f101504k;
        long mo124310e = m120579F1.mo124310e();
        Object obj = objArr[0];
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
        return m107479n(threadPoolExecutor, 1, mo124310e, 0, 0L, (String) obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: o */
    public final AbstractC20631e m107489o(int i11, long j11, int i12, long j12, String str, Object... objArr) {
        AbstractC19074t.m100208f(str, "taskId");
        AbstractC19074t.m100208f(objArr, "params");
        return m107479n(f101504k, i11, j11, i12, j12, str, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: r */
    public final String m107490r() {
        return this.f101514f;
    }

    /* renamed from: s */
    public final String m107491s() {
        return this.f101513e;
    }

    /* renamed from: t */
    public final g m107492t() {
        return this.f101510b;
    }

    /* renamed from: u */
    public final AtomicBoolean m107493u() {
        return this.f101512d;
    }

    /* renamed from: v */
    public final String m107494v() {
        if (this.f101517i.length() == 0) {
            String str = this.f101516h;
            if (str == null) {
                str = "";
            }
            String m122788d = AbstractC23352g.m122788d(str);
            AbstractC19074t.m100207e(m122788d, "md5(...)");
            this.f101517i = m122788d;
        }
        return this.f101517i;
    }

    /* renamed from: w */
    protected boolean mo107426w() {
        return false;
    }

    /* renamed from: x */
    protected boolean mo107495x() {
        return false;
    }

    /* renamed from: y */
    public final boolean m107496y() {
        return this.f101511c.get();
    }

    /* renamed from: z */
    public final void m107497z() {
    }
}
