package d30;

import bn0.AbstractC2933b;
import e30.C18195c;
import e30.InterfaceC18193a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import h30.InterfaceC19749b;
import h30.InterfaceC19750c;
import ho0.AbstractC20110a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.nio.FloatBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.SupervisorKt;
import org.json.JSONObject;
import org.tensorflow.lite.InterfaceC24498e;
import pm0.AbstractC24845f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25332a0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25366r;
import qm0.AbstractC25367r0;
import sm0.AbstractC26327c;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: d30.d */
/* loaded from: classes5.dex */
public final class C17724d implements InterfaceC17723c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC19750c f89823a;

    /* renamed from: b */
    private final InterfaceC19749b f89824b;

    /* renamed from: c */
    private final C17726f f89825c;

    /* renamed from: d */
    private final InterfaceC18193a f89826d;

    /* renamed from: e */
    private final C17721a f89827e;

    /* renamed from: f */
    private final InterfaceC24498e f89828f;

    /* renamed from: g */
    private final C17722b f89829g;

    /* renamed from: d30.d$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: d30.d$b */
    /* loaded from: classes5.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Float.valueOf(((Number) ((C24860q) obj2).m129214b()).floatValue()), Float.valueOf(((Number) ((C24860q) obj).m129214b()).floatValue()));
            return m135478b;
        }
    }

    /* renamed from: d30.d$c */
    /* loaded from: classes5.dex */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Float.valueOf(((Number) ((C24860q) obj2).m129214b()).floatValue()), Float.valueOf(((Number) ((C24860q) obj).m129214b()).floatValue()));
            return m135478b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d30.d$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f89830t;

        /* renamed from: u */
        int f89831u;

        /* renamed from: v */
        private /* synthetic */ Object f89832v;

        /* renamed from: x */
        final /* synthetic */ Map f89834x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC18505l f89835y;

        /* renamed from: z */
        final /* synthetic */ String f89836z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d30.d$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f89837t;

            /* renamed from: u */
            final /* synthetic */ String f89838u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Continuation continuation) {
                super(2, continuation);
                this.f89838u = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f89838u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f89837t == 0) {
                    AbstractC24862s.m129228b(obj);
                    File file = new File(this.f89838u, "train_result");
                    file.delete();
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    return file;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d30.d$d$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f89839t;

            /* renamed from: u */
            final /* synthetic */ C17724d f89840u;

            /* renamed from: v */
            final /* synthetic */ Map f89841v;

            /* renamed from: w */
            final /* synthetic */ InterfaceC18505l f89842w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17724d c17724d, Map map, InterfaceC18505l interfaceC18505l, Continuation continuation) {
                super(2, continuation);
                this.f89840u = c17724d;
                this.f89841v = map;
                this.f89842w = interfaceC18505l;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f89840u, this.f89841v, this.f89842w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f89839t == 0) {
                    AbstractC24862s.m129228b(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    C17728h m93819m = this.f89840u.m93819m(this.f89841v);
                    InterfaceC18505l interfaceC18505l = this.f89842w;
                    if (interfaceC18505l != null) {
                        interfaceC18505l.mo205i9(AbstractC29094b.m145342d(System.currentTimeMillis() - currentTimeMillis));
                    }
                    return m93819m;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d30.d$d$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f89843t;

            /* renamed from: u */
            final /* synthetic */ File f89844u;

            /* renamed from: v */
            final /* synthetic */ C17728h f89845v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(File file, C17728h c17728h, Continuation continuation) {
                super(2, continuation);
                this.f89844u = file;
                this.f89845v = c17728h;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new c(this.f89844u, this.f89845v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                String str;
                AbstractC28298d.m142578e();
                if (this.f89843t == 0) {
                    AbstractC24862s.m129228b(obj);
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(this.f89844u, "result_grad")));
                    try {
                        float[][] m93843c = this.f89845v.m93843c();
                        int length = m93843c.length - 1;
                        if (length >= 0) {
                            int i11 = 0;
                            while (true) {
                                int i12 = i11 + 1;
                                int length2 = m93843c[0].length - 1;
                                if (length2 >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        int i14 = i13 + 1;
                                        if (i13 == m93843c[0].length - 1) {
                                            str = "";
                                        } else {
                                            str = " ";
                                        }
                                        bufferedWriter.write(m93843c[i11][i13] + str);
                                        if (i14 > length2) {
                                            break;
                                        }
                                        i13 = i14;
                                    }
                                }
                                bufferedWriter.newLine();
                                if (i12 > length) {
                                    break;
                                }
                                i11 = i12;
                            }
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        AbstractC2933b.m13890a(bufferedWriter, null);
                        return C24848g0.f119245a;
                    } finally {
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d30.d$d$d, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32803d extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f89846t;

            /* renamed from: u */
            final /* synthetic */ File f89847u;

            /* renamed from: v */
            final /* synthetic */ C17728h f89848v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32803d(File file, C17728h c17728h, Continuation continuation) {
                super(2, continuation);
                this.f89847u = file;
                this.f89848v = c17728h;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32803d(this.f89847u, this.f89848v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f89846t == 0) {
                    AbstractC24862s.m129228b(obj);
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(this.f89847u, "result_info.json")));
                    try {
                        bufferedWriter.write(this.f89848v.m93841a().m93840e().toString());
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        AbstractC2933b.m13890a(bufferedWriter, null);
                        return C24848g0.f119245a;
                    } finally {
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32803d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Map map, InterfaceC18505l interfaceC18505l, String str, Continuation continuation) {
            super(2, continuation);
            this.f89834x = map;
            this.f89835y = interfaceC18505l;
            this.f89836z = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            d dVar = new d(this.f89834x, this.f89835y, this.f89836z, continuation);
            dVar.f89832v = obj;
            return dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x011a A[Catch: Exception -> 0x0022, TRY_LEAVE, TryCatch #0 {Exception -> 0x0022, blocks: (B:9:0x001d, B:10:0x00f9, B:12:0x011a, B:20:0x0035, B:22:0x00eb, B:27:0x0044, B:29:0x00ac, B:31:0x00de, B:36:0x0053, B:38:0x009c, B:43:0x0060), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00f7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00de A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:9:0x001d, B:10:0x00f9, B:12:0x011a, B:20:0x0035, B:22:0x00eb, B:27:0x0044, B:29:0x00ac, B:31:0x00de, B:36:0x0053, B:38:0x009c, B:43:0x0060), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Deferred m112538b;
            Deferred m112538b2;
            Object mo112598E;
            CoroutineScope coroutineScope;
            Deferred deferred;
            C17728h c17728h;
            Object mo112598E2;
            CoroutineScope coroutineScope2;
            File file;
            Deferred m112538b3;
            Deferred m112538b4;
            File file2;
            File file3;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f89831u;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    file2 = (File) this.f89832v;
                                    AbstractC24862s.m129228b(obj);
                                    file3 = new File(AbstractC19074t.m100216n(file2.getPath(), ".zip"));
                                    C17724d c17724d = C17724d.this;
                                    file3.delete();
                                    c17724d.f89823a.mo103466a(file2, file3);
                                    if (file3.exists()) {
                                        return "";
                                    }
                                    return file3.getPath();
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Deferred deferred2 = (Deferred) this.f89830t;
                            File file4 = (File) this.f89832v;
                            AbstractC24862s.m129228b(obj);
                            m112538b4 = deferred2;
                            file = file4;
                            this.f89832v = file;
                            this.f89830t = null;
                            this.f89831u = 4;
                            if (m112538b4.mo112598E(this) != m142578e) {
                                return m142578e;
                            }
                            file2 = file;
                            file3 = new File(AbstractC19074t.m100216n(file2.getPath(), ".zip"));
                            C17724d c17724d2 = C17724d.this;
                            file3.delete();
                            c17724d2.f89823a.mo103466a(file2, file3);
                            if (file3.exists()) {
                            }
                        } else {
                            C17728h c17728h2 = (C17728h) this.f89830t;
                            coroutineScope2 = (CoroutineScope) this.f89832v;
                            AbstractC24862s.m129228b(obj);
                            c17728h = c17728h2;
                            mo112598E2 = obj;
                            file = (File) mo112598E2;
                            m112538b3 = BuildersKt__Builders_commonKt.m112538b(coroutineScope2, SupervisorKt.m112864b(null, 1, null), null, new C32803d(file, c17728h, null), 2, null);
                            m112538b4 = BuildersKt__Builders_commonKt.m112538b(coroutineScope2, SupervisorKt.m112864b(null, 1, null), null, new c(file, c17728h, null), 2, null);
                            if (AbstractC19074t.m100204b(c17728h.m93842b(), "SUCCESS")) {
                                return "";
                            }
                            this.f89832v = file;
                            this.f89830t = m112538b4;
                            this.f89831u = 3;
                            if (m112538b3.mo112598E(this) == m142578e) {
                                return m142578e;
                            }
                            this.f89832v = file;
                            this.f89830t = null;
                            this.f89831u = 4;
                            if (m112538b4.mo112598E(this) != m142578e) {
                            }
                        }
                    } else {
                        deferred = (Deferred) this.f89830t;
                        coroutineScope = (CoroutineScope) this.f89832v;
                        AbstractC24862s.m129228b(obj);
                        mo112598E = obj;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.f89832v;
                    m112538b = BuildersKt__Builders_commonKt.m112538b(coroutineScope3, SupervisorKt.m112864b(null, 1, null), null, new b(C17724d.this, this.f89834x, this.f89835y, null), 2, null);
                    m112538b2 = BuildersKt__Builders_commonKt.m112538b(coroutineScope3, SupervisorKt.m112864b(null, 1, null), null, new a(this.f89836z, null), 2, null);
                    this.f89832v = coroutineScope3;
                    this.f89830t = m112538b2;
                    this.f89831u = 1;
                    mo112598E = m112538b.mo112598E(this);
                    if (mo112598E == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope3;
                    deferred = m112538b2;
                }
                c17728h = (C17728h) mo112598E;
                this.f89832v = coroutineScope;
                this.f89830t = c17728h;
                this.f89831u = 2;
                mo112598E2 = deferred.mo112598E(this);
                if (mo112598E2 == m142578e) {
                    return m142578e;
                }
                coroutineScope2 = coroutineScope;
                file = (File) mo112598E2;
                m112538b3 = BuildersKt__Builders_commonKt.m112538b(coroutineScope2, SupervisorKt.m112864b(null, 1, null), null, new C32803d(file, c17728h, null), 2, null);
                m112538b4 = BuildersKt__Builders_commonKt.m112538b(coroutineScope2, SupervisorKt.m112864b(null, 1, null), null, new c(file, c17728h, null), 2, null);
                if (AbstractC19074t.m100204b(c17728h.m93842b(), "SUCCESS")) {
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return "";
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C17724d(String str, String str2, String str3, int i11, List list, Map map, InterfaceC19750c interfaceC19750c, InterfaceC19749b interfaceC19749b) {
        AbstractC19074t.m100208f(str, "modelPath");
        AbstractC19074t.m100208f(str2, "configPath");
        AbstractC19074t.m100208f(str3, "item2IndexPath");
        AbstractC19074t.m100208f(list, "itemIdList");
        AbstractC19074t.m100208f(map, "kwd2IndexMap");
        AbstractC19074t.m100208f(interfaceC19750c, "zipHelper");
        AbstractC19074t.m100208f(interfaceC19749b, "tfLiteRuntimeHelper");
        this.f89823a = interfaceC19750c;
        this.f89824b = interfaceC19749b;
        InterfaceC24498e.a createInterpreterOptions = interfaceC19749b.createInterpreterOptions();
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        aVar.mo104548a("MFModel Loading model file...", new Object[0]);
        MappedByteBuffer m93814h = m93814h(str);
        createInterpreterOptions.m127829e(i11);
        InterfaceC24498e createInterpreter = interfaceC19749b.createInterpreter(m93814h, createInterpreterOptions);
        if (createInterpreter != null) {
            this.f89828f = createInterpreter;
            createInterpreter.m127824t0();
            aVar.mo104548a("MFModel Loading model file finished...", new Object[0]);
            this.f89829g = m93813g(str2);
            C17726f c17726f = new C17726f(str3);
            this.f89825c = c17726f;
            C17721a c17721a = new C17721a(list, map);
            this.f89827e = c17721a;
            this.f89826d = new C18195c(c17721a.m93796a(), c17726f);
            aVar.mo104548a("MFModel Sticker loaded", new Object[0]);
            return;
        }
        throw new IllegalStateException("Cannot create Interpreter");
    }

    /* renamed from: d */
    private final List m93810d(Map map, int i11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            int intValue2 = ((Number) entry.getValue()).intValue();
            arrayList.add(Integer.valueOf(intValue));
            arrayList2.add(Integer.valueOf(intValue2));
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size() - 1;
        int i12 = 0;
        if (size >= 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                arrayList3.add(new C24860q(arrayList.get(i13), arrayList2.get(i13)));
                if (i14 > size) {
                    break;
                }
                i13 = i14;
            }
        }
        Collections.shuffle(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        while (i12 < arrayList3.size()) {
            int i15 = i12 + i11;
            arrayList4.add(arrayList3.subList(i12, Math.min(i15, arrayList3.size())));
            i12 = i15;
        }
        return arrayList4;
    }

    /* renamed from: e */
    private final float[][] m93811e() {
        HashMap hashMap = new HashMap();
        hashMap.put("sth", "sth");
        HashMap hashMap2 = new HashMap();
        int m93835d = this.f89825c.m93835d();
        float[][] fArr = new float[m93835d];
        for (int i11 = 0; i11 < m93835d; i11++) {
            fArr[i11] = new float[this.f89829g.m93799c()];
        }
        hashMap2.put("params", fArr);
        this.f89824b.runSignature(this.f89828f, hashMap, hashMap2, "get_item_params");
        return fArr;
    }

    /* renamed from: f */
    private final void m93812f() {
        HashMap hashMap = new HashMap();
        hashMap.put("sth", "sth");
        this.f89824b.runSignature(this.f89828f, hashMap, new HashMap(), "reset_user_params");
    }

    /* renamed from: g */
    private final C17722b m93813g(String str) {
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()) {
                sb2.append(" ");
                sb2.append(scanner.nextLine());
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(fileInputStream, null);
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "content.toString()");
            if (sb3.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return new C17722b(new JSONObject(sb3));
            }
            throw new IllegalStateException("Empty config".toString());
        } finally {
        }
    }

    /* renamed from: h */
    private final MappedByteBuffer m93814h(String str) {
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, new File(str).length());
            AbstractC19074t.m100207e(map, "fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, modelFile.length())");
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(fileInputStream, null);
            return map;
        } finally {
        }
    }

    /* renamed from: i */
    private final float[] m93815i(int[] iArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("stickers", new int[][]{iArr});
        HashMap hashMap2 = new HashMap();
        float[][] fArr = {new float[iArr.length]};
        hashMap2.put("output", fArr);
        this.f89824b.runSignature(this.f89828f, hashMap, hashMap2, "predict");
        return fArr[0];
    }

    /* renamed from: j */
    private final Map m93816j() {
        int m93835d = this.f89825c.m93835d();
        int[] iArr = new int[m93835d];
        int i11 = 0;
        if (m93835d > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                iArr[i12] = i12;
                if (i13 >= m93835d) {
                    break;
                }
                i12 = i13;
            }
        }
        float[] m93815i = m93815i(iArr);
        HashMap hashMap = new HashMap();
        if (m93835d > 0) {
            while (true) {
                int i14 = i11 + 1;
                C24860q m93834c = this.f89825c.m93834c(i11);
                if (m93834c != null) {
                    hashMap.put(m93834c, Float.valueOf(m93815i[i11]));
                }
                if (i14 >= m93835d) {
                    break;
                }
                i11 = i14;
            }
        }
        return hashMap;
    }

    /* renamed from: k */
    private final float m93817k(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        if (size > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                C24860q c24860q = (C24860q) list.get(i11);
                iArr[i11] = ((Number) c24860q.m129215c()).intValue();
                iArr2[i11] = ((Number) c24860q.m129216d()).intValue();
                if (i12 >= size) {
                    break;
                }
                i11 = i12;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("stickers", iArr);
        hashMap.put("clicks", iArr2);
        HashMap hashMap2 = new HashMap();
        FloatBuffer allocate = FloatBuffer.allocate(1);
        AbstractC19074t.m100207e(allocate, "loss");
        hashMap2.put("loss", allocate);
        this.f89824b.runSignature(this.f89828f, hashMap, hashMap2, "reconstruct");
        return allocate.get(0);
    }

    /* renamed from: l */
    private final float m93818l(List list) {
        int[] iArr = new int[list.size()];
        int[] iArr2 = new int[list.size()];
        int size = list.size() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                C24860q c24860q = (C24860q) list.get(i11);
                iArr[i11] = ((Number) c24860q.m129215c()).intValue();
                iArr2[i11] = ((Number) c24860q.m129216d()).intValue();
                if (i12 > size) {
                    break;
                }
                i11 = i12;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("stickers", iArr);
        hashMap.put("clicks", iArr2);
        HashMap hashMap2 = new HashMap();
        FloatBuffer allocate = FloatBuffer.allocate(1);
        AbstractC19074t.m100207e(allocate, "loss");
        hashMap2.put("loss", allocate);
        this.f89824b.runSignature(this.f89828f, hashMap, hashMap2, "train");
        return allocate.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final C17728h m93819m(Map map) {
        String m129183b;
        int i11;
        int length;
        String m129183b2;
        String m129183b3;
        List m131497f;
        try {
            if (map.size() < this.f89829g.m93798b()) {
                return new C17728h("WARN STICKER MAP SIZE NOT QUALIFIED");
            }
            C17729i m93820n = m93820n(map);
            m93812f();
            Set mo96959a = this.f89826d.mo96959a(map, this.f89829g.m93800d());
            HashMap hashMap = new HashMap();
            for (C24860q c24860q : map.keySet()) {
                Integer m93833b = this.f89825c.m93833b(c24860q);
                if (m93833b != null) {
                    int intValue = m93833b.intValue();
                    Object obj = map.get(c24860q);
                    AbstractC19074t.m100205c(obj);
                    hashMap.put(Integer.valueOf(intValue), Integer.valueOf(Math.min(((Number) obj).intValue(), this.f89829g.m93806j())));
                }
            }
            Iterator it = mo96959a.iterator();
            while (it.hasNext()) {
                hashMap.put(Integer.valueOf(((Number) it.next()).intValue()), 0);
            }
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            if (this.f89829g.m93805i()) {
                m131497f = AbstractC25366r.m131497f(new ArrayList(hashMap.keySet()));
                int size = m131497f.size() - 1;
                if (size >= 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        int intValue2 = ((Number) m131497f.get(i12)).intValue();
                        Object obj2 = hashMap.get(Integer.valueOf(intValue2));
                        AbstractC19074t.m100205c(obj2);
                        int intValue3 = ((Number) obj2).intValue();
                        List list = m131497f;
                        if (i12 < this.f89829g.m93804h() * m131497f.size()) {
                            hashMap2.put(Integer.valueOf(intValue2), Integer.valueOf(intValue3));
                        } else {
                            hashMap3.put(Integer.valueOf(intValue2), Integer.valueOf(intValue3));
                        }
                        if (i13 > size) {
                            break;
                        }
                        i12 = i13;
                        m131497f = list;
                    }
                }
            } else {
                hashMap2.putAll(hashMap);
                hashMap3.putAll(hashMap);
            }
            int m93802f = this.f89829g.m93802f();
            int i14 = 1;
            if (m93802f > 0) {
                int i15 = 0;
                do {
                    i15++;
                    Iterator it2 = m93810d(hashMap2, this.f89829g.m93797a()).iterator();
                    while (it2.hasNext()) {
                        try {
                            m93817k((List) it2.next());
                        } catch (Exception e11) {
                            AbstractC20110a.f98889a.mo104552e(e11);
                            m129183b3 = AbstractC24845f.m129183b(e11);
                            return new C17728h(AbstractC19074t.m100216n("ERROR RECONSTRUCT: ", m129183b3));
                        }
                    }
                } while (i15 < m93802f);
            }
            float[][] m93811e = m93811e();
            int m93803g = this.f89829g.m93803g();
            float f11 = 0.0f;
            if (m93803g > 0) {
                int i16 = 0;
                i11 = 0;
                do {
                    i16++;
                    Iterator it3 = m93810d(hashMap3, this.f89829g.m93797a()).iterator();
                    while (it3.hasNext()) {
                        try {
                            f11 += m93818l((List) it3.next());
                            i11++;
                        } catch (Exception e12) {
                            AbstractC20110a.f98889a.mo104552e(e12);
                            m129183b2 = AbstractC24845f.m129183b(e12);
                            return new C17728h(AbstractC19074t.m100216n("ERROR TRAIN: ", m129183b2));
                        }
                    }
                } while (i16 < m93803g);
            } else {
                i11 = 0;
            }
            if (i11 != 0) {
                i14 = i11;
            }
            float[][] m93811e2 = m93811e();
            int m93835d = this.f89825c.m93835d();
            float[][] fArr = new float[m93835d];
            for (int i17 = 0; i17 < m93835d; i17++) {
                fArr[i17] = new float[this.f89829g.m93799c()];
            }
            int m93835d2 = this.f89825c.m93835d();
            if (m93835d2 > 0) {
                int i18 = 0;
                while (true) {
                    int i19 = i18 + 1;
                    int m93799c = this.f89829g.m93799c();
                    if (m93799c > 0) {
                        int i21 = 0;
                        while (true) {
                            int i22 = i21 + 1;
                            fArr[i18][i21] = m93811e2[i18][i21] - m93811e[i18][i21];
                            if (i22 >= m93799c) {
                                break;
                            }
                            i21 = i22;
                        }
                    }
                    if (i19 >= m93835d2) {
                        break;
                    }
                    i18 = i19;
                }
            }
            if (m93835d == 0) {
                length = 0;
            } else {
                length = fArr[0].length;
            }
            return new C17728h(new C17727g(f11 / i14, m93835d, length, m93820n), fArr, "SUCCESS");
        } catch (Exception e13) {
            AbstractC20110a.f98889a.mo104552e(e13);
            m129183b = AbstractC24845f.m129183b(e13);
            return new C17728h(AbstractC19074t.m100216n("ERROR FLOW TRAIN: ", m129183b));
        }
    }

    /* renamed from: n */
    private final C17729i m93820n(Map map) {
        List m131499w;
        List m131177E0;
        Map m131413r;
        List m131185M0;
        Set m131210j0;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i11 = 0;
        int i12 = 0;
        for (Map.Entry entry : map.entrySet()) {
            C24860q c24860q = (C24860q) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            int i13 = i12 + 1;
            if (i12 % 2 == 0) {
                hashMap.put(c24860q, Integer.valueOf(intValue));
            } else {
                hashMap2.put(c24860q, Integer.valueOf(intValue));
            }
            i12 = i13;
        }
        m131499w = AbstractC25367r0.m131499w(mo93807a(hashMap).m93830d());
        m131177E0 = AbstractC25332a0.m131177E0(m131499w, new c());
        m131413r = AbstractC25363p0.m131413r(m131177E0);
        m131185M0 = AbstractC25332a0.m131185M0(m131413r.keySet());
        HashMap hashMap3 = new HashMap();
        Set keySet = hashMap2.keySet();
        Integer[] numArr = {10, 20, 50, 100, 200};
        int i14 = 0;
        while (i14 < 5) {
            int intValue2 = numArr[i14].intValue();
            i14++;
            m131210j0 = AbstractC25332a0.m131210j0(m131185M0.subList(i11, intValue2), keySet);
            hashMap3.put(AbstractC19074t.m100216n("recall@", Integer.valueOf(intValue2)), Float.valueOf((m131210j0.size() * 1.0f) / keySet.size()));
            hashMap3.put(AbstractC19074t.m100216n("precision@", Integer.valueOf(intValue2)), Float.valueOf((m131210j0.size() * 1.0f) / r11.size()));
            i11 = 0;
        }
        return new C17729i(hashMap.size(), hashMap2.size(), hashMap3);
    }

    @Override // d30.InterfaceC17723c
    /* renamed from: a */
    public C17725e mo93807a(Map map) {
        float f11;
        int i11;
        List m131499w;
        List m131177E0;
        Map m131413r;
        List m131185M0;
        Set m131210j0;
        float f12;
        AbstractC19074t.m100208f(map, "clickMap");
        m93812f();
        Set mo96959a = this.f89826d.mo96959a(map, this.f89829g.m93800d());
        HashMap hashMap = new HashMap();
        for (C24860q c24860q : map.keySet()) {
            Integer m93833b = this.f89825c.m93833b(c24860q);
            if (m93833b != null) {
                int intValue = m93833b.intValue();
                Object obj = map.get(c24860q);
                AbstractC19074t.m100205c(obj);
                hashMap.put(Integer.valueOf(intValue), Integer.valueOf(Math.min(((Number) obj).intValue(), this.f89829g.m93806j())));
            }
        }
        Iterator it = mo96959a.iterator();
        while (it.hasNext()) {
            hashMap.put(Integer.valueOf(((Number) it.next()).intValue()), 0);
        }
        List m93810d = m93810d(hashMap, this.f89829g.m93797a());
        int m93801e = this.f89829g.m93801e();
        int i12 = 1;
        float f13 = 0.0f;
        if (m93801e > 0) {
            int i13 = 0;
            f11 = 0.0f;
            i11 = 0;
            do {
                i13++;
                Iterator it2 = m93810d.iterator();
                while (it2.hasNext()) {
                    try {
                        f11 += m93817k((List) it2.next());
                        i11++;
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                }
            } while (i13 < m93801e);
        } else {
            f11 = 0.0f;
            i11 = 0;
        }
        Map m93816j = m93816j();
        if (i11 != 0) {
            i12 = i11;
        }
        m131499w = AbstractC25367r0.m131499w(m93816j);
        m131177E0 = AbstractC25332a0.m131177E0(m131499w, new b());
        m131413r = AbstractC25363p0.m131413r(m131177E0);
        m131185M0 = AbstractC25332a0.m131185M0(m131413r.keySet());
        Set keySet = map.keySet();
        m131210j0 = AbstractC25332a0.m131210j0(m131185M0.subList(0, 50), keySet);
        if (keySet.size() > 0) {
            f13 = (m131210j0.size() * 1.0f) / r1.size();
            f12 = (m131210j0.size() * 1.0f) / keySet.size();
        } else {
            f12 = 0.0f;
        }
        if (Float.isNaN(f11) || Float.isNaN(f13) || Float.isNaN(f12)) {
            f11 = -1.0f;
            f12 = -1.0f;
            f13 = -1.0f;
        }
        return new C17725e(f11 / i12, f13, f12, m93816j);
    }

    /* renamed from: o */
    public Object m93821o(String str, Map map, InterfaceC18505l interfaceC18505l, Continuation continuation) {
        Object m112536b;
        m112536b = BuildersKt__BuildersKt.m112536b(null, new d(map, interfaceC18505l, str, null), 1, null);
        AbstractC19074t.m100207e(m112536b, "@WorkerThread\n    @Suppress(\"BlockingMethodInNonBlockingContext\")\n    override suspend fun writeTrainingResultToFile(folderPath: String, clickMap: Map<Pair<Int, String>, Int>, durationCallback: ((Long) -> Unit)?): String = runBlocking {\n        try {\n            // Do train\n            val trainResultTask = async(SupervisorJob()) {\n                val startTime = System.currentTimeMillis()\n                val result = train(clickMap)\n                durationCallback?.let { it(System.currentTimeMillis() - startTime) }\n                result\n            }\n            // Create folder and write files\n            val trainResultFolderCreationTask = async(SupervisorJob()) {\n                File(folderPath, TRAIN_FOLDER_NAME).also {\n                    it.delete()\n                    if (!it.exists()) it.mkdir()\n                }\n            }\n            // Wait for 2 tasks\n            val result = trainResultTask.await()\n            val trainFolder = trainResultFolderCreationTask.await()\n\n            // Write result files to folder\n\n            val writeResultInfoTask = async(SupervisorJob()) {\n                BufferedWriter(FileWriter(File(trainFolder, TRAIN_RESULT_INFO_FILE_NAME))).use { writer ->\n                    writer.write(result.commonInfo.toJsonObject().toString())\n                }\n            }\n            val writeResultGradTask = async(SupervisorJob()) {\n                BufferedWriter(FileWriter(File(trainFolder, TRAIN_RESULT_GRAD_FILE_NAME))).use { writer ->\n                    result.gradient.run {\n                        for (i in indices) {\n                            for (j in this[0].indices) {\n                                val endSymbol = if (j == this[0].size - 1) \"\" else \" \"\n                                writer.write(\"${this[i][j]}$endSymbol\")\n                            }\n                            writer.newLine()\n                        }\n                    }\n                }\n            }\n            // Wait for 2 writing file tasks\n            if (result.errorCode==\"SUCCESS\") {\n                writeResultInfoTask.await()\n                writeResultGradTask.await()\n\n                // Zip train folder\n                File(trainFolder.path + \".zip\").run {\n                    delete()\n                    zipHelper.zipDirectory(trainFolder, this)\n                    if (exists()) path else \"\"\n                }\n            } else {\n                \"\"\n            }\n        } catch (e: Exception) {\n            Timber.e(e)\n            \"\"\n        }\n    }");
        return m112536b;
    }
}
