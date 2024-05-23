package p673y8;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.AbstractC1453s;
import com.google.firebase.C6576e;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p015a9.InterfaceC0662b;
import p034b8.InterfaceC2649a;
import p052c8.C3338b0;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p521t9.InterfaceC26608i;
import p673y8.InterfaceC30822j;

/* renamed from: y8.f */
/* loaded from: classes.dex */
public class C30818f implements InterfaceC30821i, InterfaceC30822j {

    /* renamed from: a */
    private final InterfaceC0662b f142283a;

    /* renamed from: b */
    private final Context f142284b;

    /* renamed from: c */
    private final InterfaceC0662b f142285c;

    /* renamed from: d */
    private final Set f142286d;

    /* renamed from: e */
    private final Executor f142287e;

    private C30818f(final Context context, final String str, Set set, InterfaceC0662b interfaceC0662b, Executor executor) {
        this(new InterfaceC0662b() { // from class: y8.e
            @Override // p015a9.InterfaceC0662b
            public final Object get() {
                C30829q m149901j;
                m149901j = C30818f.m149901j(context, str);
                return m149901j;
            }
        }, set, executor, interfaceC0662b, context);
    }

    /* renamed from: g */
    public static C3339c m149898g() {
        final C3338b0 m16815a = C3338b0.m16815a(InterfaceC2649a.class, Executor.class);
        return C3339c.m16822f(C30818f.class, InterfaceC30821i.class, InterfaceC30822j.class).m16841b(C3355r.m16909k(Context.class)).m16841b(C3355r.m16909k(C6576e.class)).m16841b(C3355r.m16911m(InterfaceC30819g.class)).m16841b(C3355r.m16910l(InterfaceC26608i.class)).m16841b(C3355r.m16908j(m16815a)).m16845f(new InterfaceC3345h() { // from class: y8.b
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                C30818f m149899h;
                m149899h = C30818f.m149899h(C3338b0.this, interfaceC3342e);
                return m149899h;
            }
        }).m16843d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ C30818f m149899h(C3338b0 c3338b0, InterfaceC3342e interfaceC3342e) {
        return new C30818f((Context) interfaceC3342e.mo16847a(Context.class), ((C6576e) interfaceC3342e.mo16847a(C6576e.class)).m33615n(), interfaceC3342e.mo16849c(InterfaceC30819g.class), interfaceC3342e.mo16850d(InterfaceC26608i.class), (Executor) interfaceC3342e.mo16853g(c3338b0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m149900i() {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                C30829q c30829q = (C30829q) this.f142283a.get();
                List m149920c = c30829q.m149920c();
                c30829q.m149919b();
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < m149920c.size(); i11++) {
                    AbstractC30830r abstractC30830r = (AbstractC30830r) m149920c.get(i11);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", abstractC30830r.mo149893c());
                    jSONObject.put("dates", new JSONArray((Collection) abstractC30830r.mo149892b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ C30829q m149901j(Context context, String str) {
        return new C30829q(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Void m149902k() {
        synchronized (this) {
            ((C30829q) this.f142283a.get()).m149925k(System.currentTimeMillis(), ((InterfaceC26608i) this.f142285c.get()).mo136561a());
        }
        return null;
    }

    @Override // p673y8.InterfaceC30821i
    /* renamed from: a */
    public AbstractC22888j mo149903a() {
        if (!AbstractC1453s.m7370a(this.f142284b)) {
            return AbstractC22894m.m117604f("");
        }
        return AbstractC22894m.m117601c(this.f142287e, new Callable() { // from class: y8.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m149900i;
                m149900i = C30818f.this.m149900i();
                return m149900i;
            }
        });
    }

    @Override // p673y8.InterfaceC30822j
    /* renamed from: b */
    public synchronized InterfaceC30822j.a mo149904b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C30829q c30829q = (C30829q) this.f142283a.get();
        if (c30829q.m149923i(currentTimeMillis)) {
            c30829q.m149922g();
            return InterfaceC30822j.a.GLOBAL;
        }
        return InterfaceC30822j.a.NONE;
    }

    /* renamed from: l */
    public AbstractC22888j m149905l() {
        if (this.f142286d.size() <= 0) {
            return AbstractC22894m.m117604f(null);
        }
        if (!AbstractC1453s.m7370a(this.f142284b)) {
            return AbstractC22894m.m117604f(null);
        }
        return AbstractC22894m.m117601c(this.f142287e, new Callable() { // from class: y8.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m149902k;
                m149902k = C30818f.this.m149902k();
                return m149902k;
            }
        });
    }

    C30818f(InterfaceC0662b interfaceC0662b, Set set, Executor executor, InterfaceC0662b interfaceC0662b2, Context context) {
        this.f142283a = interfaceC0662b;
        this.f142286d = set;
        this.f142287e = executor;
        this.f142285c = interfaceC0662b2;
        this.f142284b = context;
    }
}
