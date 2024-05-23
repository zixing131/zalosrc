package p610wi;

import bn0.AbstractC2933b;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.backuprestore.media.exception.DriveAuthException;
import com.zing.zalo.data.backuprestore.model.media.DriveStorageQuota;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import im0.AbstractC20626a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import ln0.AbstractC22543l;
import org.json.JSONObject;
import p543uc.C27224b;
import p543uc.C27225c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import sc.C26220b;
import un0.AbstractC27323a;
import un0.AbstractC27336n;
import un0.C27326d;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: wi.d */
/* loaded from: classes3.dex */
public final class C29050d implements InterfaceC29049c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final AbstractC27323a f134576a = AbstractC27336n.m139941b(null, c.f134590q, 1, null);

    /* renamed from: wi.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wi.d$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ String f134577A;

        /* renamed from: B */
        final /* synthetic */ C29050d f134578B;

        /* renamed from: t */
        Object f134579t;

        /* renamed from: u */
        Object f134580u;

        /* renamed from: v */
        Object f134581v;

        /* renamed from: w */
        Object f134582w;

        /* renamed from: x */
        Object f134583x;

        /* renamed from: y */
        Object f134584y;

        /* renamed from: z */
        int f134585z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: wi.d$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f134586t;

            /* renamed from: u */
            final /* synthetic */ URL f134587u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(URL url, Continuation continuation) {
                super(2, continuation);
                this.f134587u = url;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f134587u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f134586t == 0) {
                    AbstractC24862s.m129228b(obj);
                    return (URLConnection) FirebasePerfUrlConnection.instrument(this.f134587u.openConnection());
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
        /* renamed from: wi.d$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C33035b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f134588t;

            /* renamed from: u */
            final /* synthetic */ BufferedReader f134589u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C33035b(BufferedReader bufferedReader, Continuation continuation) {
                super(2, continuation);
                this.f134589u = bufferedReader;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C33035b(this.f134589u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f134588t == 0) {
                    AbstractC24862s.m129228b(obj);
                    return this.f134589u.readLine();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C33035b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, C29050d c29050d, Continuation continuation) {
            super(2, continuation);
            this.f134577A = str;
            this.f134578B = c29050d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f134577A, this.f134578B, continuation);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:2)|(1:(1:(8:6|7|8|9|10|11|(1:13)(1:55)|(3:15|16|(1:18)(5:20|10|11|(0)(0)|(3:22|23|(6:32|33|34|(2:36|37)|39|40)(4:27|28|(1:30)|31))(0)))(0))(2:67|68))(1:69))(2:87|(2:89|(1:91))(2:92|93))|70|71|72|73|(6:75|76|77|78|16|(0)(0))(4:82|(0)|39|40)|(3:(1:60)|(0)|(1:64))) */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x019c, code lost:            r6.disconnect();     */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x01a8, code lost:            r6.disconnect();     */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01ac, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x01ad, code lost:            sc.C26220b.m134821d("SMLBackupRestoreMediaApiHelper", r0);     */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0185, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0186, code lost:            r6 = r14;        r14 = r0;     */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0181, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0182, code lost:            r6 = r14;        r14 = r0;     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0101 A[Catch: all -> 0x0104, TryCatch #3 {all -> 0x0104, blocks: (B:11:0x00fd, B:13:0x0101, B:15:0x010c, B:22:0x011c, B:25:0x0122, B:27:0x0133, B:32:0x0171), top: B:10:0x00fd }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x010c A[Catch: all -> 0x0104, TryCatch #3 {all -> 0x0104, blocks: (B:11:0x00fd, B:13:0x0101, B:15:0x010c, B:22:0x011c, B:25:0x0122, B:27:0x0133, B:32:0x0171), top: B:10:0x00fd }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00f2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x011c A[Catch: all -> 0x0104, TryCatch #3 {all -> 0x0104, blocks: (B:11:0x00fd, B:13:0x0101, B:15:0x010c, B:22:0x011c, B:25:0x0122, B:27:0x0133, B:32:0x0171), top: B:10:0x00fd }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x018e A[Catch: Exception -> 0x0192, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x0192, blocks: (B:45:0x019c, B:36:0x018e), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x019c A[Catch: Exception -> 0x0192, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x0192, blocks: (B:45:0x019c, B:36:0x018e), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
        /* JADX WARN: Type inference failed for: r8v10, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00f3 -> B:10:0x00fd). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            HttpURLConnection httpURLConnection;
            Throwable th2;
            C19059j0 c19059j0;
            HttpURLConnection httpURLConnection2;
            C29050d c29050d;
            StringBuilder sb2;
            BufferedReader bufferedReader;
            b bVar;
            ?? r82;
            BufferedReader bufferedReader2;
            Object m112534g;
            b bVar2;
            HttpURLConnection httpURLConnection3;
            BufferedReader bufferedReader3;
            C29050d c29050d2;
            BufferedReader bufferedReader4;
            C19059j0 c19059j02;
            StringBuilder sb3;
            Object obj2;
            JSONObject optJSONObject;
            long m116581d;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f134585z;
            HttpURLConnection httpURLConnection4 = null;
            try {
                try {
                    try {
                    } catch (Exception e11) {
                        C26220b.m134821d("SMLBackupRestoreMediaApiHelper", e11);
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        StringBuilder sb4 = (StringBuilder) this.f134584y;
                        C19059j0 c19059j03 = (C19059j0) this.f134583x;
                        BufferedReader bufferedReader5 = (BufferedReader) this.f134582w;
                        C29050d c29050d3 = (C29050d) this.f134581v;
                        r82 = (Closeable) this.f134580u;
                        httpURLConnection2 = (HttpURLConnection) this.f134579t;
                        try {
                            AbstractC24862s.m129228b(obj);
                            httpURLConnection3 = httpURLConnection2;
                            bufferedReader3 = r82;
                            c29050d2 = c29050d3;
                            bufferedReader4 = bufferedReader5;
                            c19059j02 = c19059j03;
                            sb3 = sb4;
                            obj2 = m142578e;
                            bVar2 = this;
                        } catch (Throwable th4) {
                            th2 = th4;
                            httpURLConnection4 = httpURLConnection2;
                            bufferedReader2 = r82;
                            try {
                                throw th2;
                            } finally {
                            }
                        }
                        try {
                            String str = (String) obj;
                            if (str == null) {
                                c19059j02.f94941p = str;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                sb3.append((String) c19059j02.f94941p);
                                bVar = bVar2;
                                m142578e = obj2;
                                sb2 = sb3;
                                c19059j0 = c19059j02;
                                bufferedReader = bufferedReader4;
                                c29050d = c29050d2;
                                r82 = bufferedReader3;
                                httpURLConnection2 = httpURLConnection3;
                                CoroutineDispatcher m112680b = Dispatchers.m112680b();
                                C33035b c33035b = new C33035b(bufferedReader, null);
                                bVar.f134579t = httpURLConnection2;
                                bVar.f134580u = r82;
                                bVar.f134581v = c29050d;
                                bVar.f134582w = bufferedReader;
                                bVar.f134583x = c19059j0;
                                bVar.f134584y = sb2;
                                bVar.f134585z = 2;
                                m112534g = BuildersKt.m112534g(m112680b, c33035b, bVar);
                                if (m112534g != m142578e) {
                                    return m142578e;
                                }
                                Object obj3 = m142578e;
                                bVar2 = bVar;
                                obj = m112534g;
                                httpURLConnection3 = httpURLConnection2;
                                bufferedReader3 = r82;
                                c29050d2 = c29050d;
                                bufferedReader4 = bufferedReader;
                                c19059j02 = c19059j0;
                                sb3 = sb2;
                                obj2 = obj3;
                                String str2 = (String) obj;
                                if (str2 == null) {
                                }
                                if (str2 == null) {
                                    try {
                                    } catch (Exception e13) {
                                        e = e13;
                                        httpURLConnection4 = httpURLConnection3;
                                        C26220b.m134821d("SMLBackupRestoreMediaApiHelper", e);
                                        if (httpURLConnection4 != null) {
                                        }
                                        return AbstractC29094b.m145342d(-1L);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        httpURLConnection4 = httpURLConnection3;
                                        if (httpURLConnection4 != null) {
                                        }
                                        throw th;
                                    }
                                    if (sb3.length() > 0 && (optJSONObject = new JSONObject(sb3.toString()).optJSONObject("storageQuota")) != null) {
                                        AbstractC27323a abstractC27323a = c29050d2.f134576a;
                                        String jSONObject = optJSONObject.toString();
                                        AbstractC19074t.m100207e(jSONObject, "toString(...)");
                                        abstractC27323a.mo131586a();
                                        DriveStorageQuota driveStorageQuota = (DriveStorageQuota) abstractC27323a.m139867d(DriveStorageQuota.Companion.serializer(), jSONObject);
                                        m116581d = AbstractC22543l.m116581d(driveStorageQuota.m40988a() - driveStorageQuota.m40989b(), 0L);
                                        Long m145342d = AbstractC29094b.m145342d(m116581d);
                                        AbstractC2933b.m13890a(bufferedReader3, null);
                                        if (httpURLConnection3 != null) {
                                            httpURLConnection3.disconnect();
                                        }
                                        return m145342d;
                                    }
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    AbstractC2933b.m13890a(bufferedReader3, null);
                                    httpURLConnection = httpURLConnection3;
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    return AbstractC29094b.m145342d(-1L);
                                }
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            bufferedReader2 = bufferedReader3;
                            httpURLConnection4 = httpURLConnection3;
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (this.f134577A.length() != 0) {
                    URL url = new URL(C27224b.f127988a.m139325e());
                    CoroutineDispatcher m112680b2 = Dispatchers.m112680b();
                    a aVar = new a(url, null);
                    this.f134585z = 1;
                    obj = BuildersKt.m112534g(m112680b2, aVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                } else {
                    throw new DriveAuthException(0, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE, "Get quota Drive failed: invalid token");
                }
            }
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) obj;
            int m107385a = AbstractC20626a.m107385a(3);
            String str3 = this.f134577A;
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(m107385a);
            httpURLConnection.setReadTimeout(m107385a);
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + str3);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader bufferedReader6 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                C29050d c29050d4 = this.f134578B;
                try {
                    c19059j0 = new C19059j0();
                    c19059j0.f94941p = "";
                    httpURLConnection2 = httpURLConnection;
                    c29050d = c29050d4;
                    sb2 = new StringBuilder();
                    bufferedReader = bufferedReader6;
                    bVar = this;
                    r82 = bufferedReader6;
                    CoroutineDispatcher m112680b3 = Dispatchers.m112680b();
                    C33035b c33035b2 = new C33035b(bufferedReader, null);
                    bVar.f134579t = httpURLConnection2;
                    bVar.f134580u = r82;
                    bVar.f134581v = c29050d;
                    bVar.f134582w = bufferedReader;
                    bVar.f134583x = c19059j0;
                    bVar.f134584y = sb2;
                    bVar.f134585z = 2;
                    m112534g = BuildersKt.m112534g(m112680b3, c33035b2, bVar);
                    if (m112534g != m142578e) {
                    }
                } catch (Throwable th7) {
                    httpURLConnection4 = httpURLConnection;
                    th2 = th7;
                    bufferedReader2 = bufferedReader6;
                    throw th2;
                }
            } else {
                C27225c.m139331f("SMLBackupRestoreMediaApiHelper", 0, responseCode, httpURLConnection);
                if (httpURLConnection != null) {
                }
                return AbstractC29094b.m145342d(-1L);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wi.d$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f134590q = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m145080a(C27326d c27326d) {
            AbstractC19074t.m100208f(c27326d, "$this$Json");
            c27326d.m139881f(true);
            c27326d.m139878c(true);
            c27326d.m139882g(true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m145080a((C27326d) obj);
            return C24848g0.f119245a;
        }
    }

    @Override // p610wi.InterfaceC29049c
    /* renamed from: a */
    public Object mo145075a(String str, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new b(str, this, null), continuation);
    }
}
