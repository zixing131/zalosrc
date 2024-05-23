package sa;

import com.google.android.gms.common.internal.AbstractC4199m;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p477ra.AbstractC25708a;
import qa.InterfaceC25205d;

/* renamed from: sa.a */
/* loaded from: classes3.dex */
public class C26199a implements InterfaceC25205d {

    /* renamed from: c */
    public static final C26199a f124491c = new a().m134765a();

    /* renamed from: a */
    final AtomicReference f124492a = new AtomicReference();

    /* renamed from: b */
    private final Executor f124493b;

    /* renamed from: sa.a$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private Executor f124494a;

        /* renamed from: a */
        public C26199a m134765a() {
            return new C26199a(this.f124494a, null);
        }

        /* renamed from: b */
        public a m134766b(Executor executor) {
            this.f124494a = executor;
            return this;
        }
    }

    /* synthetic */ C26199a(Executor executor, AbstractC26200b abstractC26200b) {
        this.f124493b = executor;
    }

    @Override // qa.InterfaceC25205d
    /* renamed from: a */
    public final String mo130457a() {
        if (true != mo130459c()) {
            return "play-services-mlkit-text-recognition";
        }
        return "text-recognition";
    }

    @Override // qa.InterfaceC25205d
    /* renamed from: b */
    public final String mo130458b() {
        return "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";
    }

    @Override // qa.InterfaceC25205d
    /* renamed from: c */
    public final boolean mo130459c() {
        return AbstractC25708a.m132627a(this.f124492a, "com.google.mlkit.dynamite.text.latin");
    }

    @Override // qa.InterfaceC25205d
    /* renamed from: d */
    public final int mo130460d() {
        if (mo130459c()) {
            return 24317;
        }
        return 24306;
    }

    @Override // qa.InterfaceC25205d
    /* renamed from: e */
    public final String mo130461e() {
        if (true != mo130459c()) {
            return "com.google.android.gms.vision.ocr";
        }
        return "com.google.mlkit.dynamite.text.latin";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C26199a)) {
            return false;
        }
        return AbstractC4199m.m19701a(this.f124493b, ((C26199a) obj).f124493b);
    }

    @Override // qa.InterfaceC25205d
    /* renamed from: f */
    public final String mo130462f() {
        return "en";
    }

    @Override // qa.InterfaceC25205d
    /* renamed from: g */
    public final Executor mo130463g() {
        return this.f124493b;
    }

    @Override // qa.InterfaceC25205d
    /* renamed from: h */
    public final int mo130464h() {
        return 1;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f124493b);
    }

    @Override // qa.InterfaceC25205d
    /* renamed from: i */
    public final String mo130465i() {
        return "optional-module-text-latin";
    }
}
