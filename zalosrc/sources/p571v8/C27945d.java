package p571v8;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p520t8.InterfaceC26582a;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;
import p520t8.InterfaceC26586e;
import p520t8.InterfaceC26587f;
import p540u8.InterfaceC27097a;
import p540u8.InterfaceC27098b;

/* renamed from: v8.d */
/* loaded from: classes.dex */
public final class C27945d implements InterfaceC27098b {

    /* renamed from: e */
    private static final InterfaceC26584c f130249e = new InterfaceC26584c() { // from class: v8.a
        @Override // p520t8.InterfaceC26584c
        /* renamed from: a */
        public final void mo480a(Object obj, Object obj2) {
            C27945d.m140804l(obj, (InterfaceC26585d) obj2);
        }
    };

    /* renamed from: f */
    private static final InterfaceC26586e f130250f = new InterfaceC26586e() { // from class: v8.b
        @Override // p520t8.InterfaceC26586e
        /* renamed from: a */
        public final void mo136515a(Object obj, Object obj2) {
            ((InterfaceC26587f) obj2).mo760d((String) obj);
        }
    };

    /* renamed from: g */
    private static final InterfaceC26586e f130251g = new InterfaceC26586e() { // from class: v8.c
        @Override // p520t8.InterfaceC26586e
        /* renamed from: a */
        public final void mo136515a(Object obj, Object obj2) {
            C27945d.m140806n((Boolean) obj, (InterfaceC26587f) obj2);
        }
    };

    /* renamed from: h */
    private static final b f130252h = new b(null);

    /* renamed from: a */
    private final Map f130253a = new HashMap();

    /* renamed from: b */
    private final Map f130254b = new HashMap();

    /* renamed from: c */
    private InterfaceC26584c f130255c = f130249e;

    /* renamed from: d */
    private boolean f130256d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v8.d$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC26582a {
        a() {
        }

        @Override // p520t8.InterfaceC26582a
        /* renamed from: a */
        public void mo136507a(Object obj, Writer writer) {
            C27946e c27946e = new C27946e(writer, C27945d.this.f130253a, C27945d.this.f130254b, C27945d.this.f130255c, C27945d.this.f130256d);
            c27946e.m140819i(obj, false);
            c27946e.m140827r();
        }

        @Override // p520t8.InterfaceC26582a
        /* renamed from: b */
        public String mo136508b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo136507a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v8.d$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC26586e {

        /* renamed from: a */
        private static final DateFormat f130258a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f130258a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // p520t8.InterfaceC26586e
        /* renamed from: b */
        public void mo136515a(Date date, InterfaceC26587f interfaceC26587f) {
            interfaceC26587f.mo760d(f130258a.format(date));
        }
    }

    public C27945d() {
        m140811p(String.class, f130250f);
        m140811p(Boolean.class, f130251g);
        m140811p(Date.class, f130252h);
    }

    /* renamed from: l */
    public static /* synthetic */ void m140804l(Object obj, InterfaceC26585d interfaceC26585d) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: n */
    public static /* synthetic */ void m140806n(Boolean bool, InterfaceC26587f interfaceC26587f) {
        interfaceC26587f.mo761f(bool.booleanValue());
    }

    /* renamed from: i */
    public InterfaceC26582a m140807i() {
        return new a();
    }

    /* renamed from: j */
    public C27945d m140808j(InterfaceC27097a interfaceC27097a) {
        interfaceC27097a.mo479a(this);
        return this;
    }

    /* renamed from: k */
    public C27945d m140809k(boolean z11) {
        this.f130256d = z11;
        return this;
    }

    @Override // p540u8.InterfaceC27098b
    /* renamed from: o */
    public C27945d mo725a(Class cls, InterfaceC26584c interfaceC26584c) {
        this.f130253a.put(cls, interfaceC26584c);
        this.f130254b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public C27945d m140811p(Class cls, InterfaceC26586e interfaceC26586e) {
        this.f130254b.put(cls, interfaceC26586e);
        this.f130253a.remove(cls);
        return this;
    }
}
