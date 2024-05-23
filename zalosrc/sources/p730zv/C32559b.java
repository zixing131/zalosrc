package p730zv;

import au.AbstractC2378v0;
import aw.InterfaceC2388c;
import com.zing.zalo.mediapipe.faceeffect.data.ModelMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import in.C20627a;
import in.InterfaceC20630d;
import java.io.File;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p694yv.InterfaceC31086a;
import p730zv.AbstractC32560c;
import pm0.C24848g0;
import su.AbstractC26389c;

/* renamed from: zv.b */
/* loaded from: classes.dex */
public final class C32559b implements InterfaceC32558a {
    public static final a Companion = new a(null);

    /* renamed from: k */
    private static final String f150469k = "MPModelFileManager";

    /* renamed from: a */
    private final InterfaceC2388c f150470a;

    /* renamed from: b */
    private final InterfaceC31086a f150471b;

    /* renamed from: c */
    private final File f150472c;

    /* renamed from: d */
    private final File f150473d;

    /* renamed from: e */
    private final File f150474e;

    /* renamed from: f */
    private final Object f150475f;

    /* renamed from: g */
    private int f150476g;

    /* renamed from: h */
    private final b f150477h;

    /* renamed from: i */
    private C20627a f150478i;

    /* renamed from: j */
    private AbstractC32560c f150479j;

    /* renamed from: zv.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m157665a() {
            return C32559b.f150469k;
        }
    }

    /* renamed from: zv.b$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC20630d {
        b() {
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "path");
            AbstractC20110a.f98889a.m104564x(C32559b.Companion.m157665a()).mo104554k("Download model success", new Object[0]);
            C32559b.this.m157662l(0, 0);
            C32559b.this.f150476g = -1;
            AbstractC32560c.f fVar = new AbstractC32560c.f(new File(str));
            Object obj = C32559b.this.f150475f;
            C32559b c32559b = C32559b.this;
            synchronized (obj) {
                c32559b.f150479j = fVar;
                c32559b.f150478i = null;
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            C32559b.this.m157664m(fVar);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            AbstractC20110a.f98889a.m104564x(C32559b.Companion.m157665a()).mo104554k("Download model fail", new Object[0]);
            C32559b.this.m157662l(1, i11);
            C32559b.this.f150476g = -1;
            AbstractC32560c.e eVar = AbstractC32560c.e.f150486b;
            Object obj = C32559b.this.f150475f;
            C32559b c32559b = C32559b.this;
            synchronized (obj) {
                c32559b.f150479j = eVar;
                c32559b.f150478i = null;
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
            AbstractC20110a.f98889a.m104564x(C32559b.Companion.m157665a()).mo104554k("Downloading " + j11 + " %", new Object[0]);
        }
    }

    public C32559b(InterfaceC2388c interfaceC2388c, String str, InterfaceC31086a interfaceC31086a) {
        AbstractC19074t.m100208f(interfaceC2388c, "modelInfoRepo");
        AbstractC19074t.m100208f(str, "parentDir");
        AbstractC19074t.m100208f(interfaceC31086a, "mpFaceEffectConfig");
        this.f150470a = interfaceC2388c;
        this.f150471b = interfaceC31086a;
        this.f150472c = new File(str, "latest_data.zip");
        this.f150473d = new File(str, "data_temp");
        this.f150474e = new File(str, "data");
        this.f150475f = new Object();
        this.f150476g = -1;
        this.f150477h = new b();
    }

    /* renamed from: j */
    private final boolean m157661j(ModelMetadata modelMetadata, File file) {
        try {
            String m135987c = AbstractC26389c.m135987c(file);
            AbstractC19074t.m100205c(m135987c);
            if (m135987c.length() <= 0 || modelMetadata.m48226c().length() <= 0) {
                return false;
            }
            if (!AbstractC19074t.m100204b(m135987c, modelMetadata.m48226c())) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x(f150469k).mo104552e(e11);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m157662l(int i11, int i12) {
        int i13 = this.f150476g;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status_download", i11);
        jSONObject.put("model_version", i13);
        jSONObject.put("error_code", i12);
        AbstractC20887g.m109236n(32000, jSONObject.toString(), null, 0, 0L, 0, 60, null);
    }

    @Override // p730zv.InterfaceC32558a
    /* renamed from: a */
    public void mo157652a() {
        synchronized (this.f150475f) {
            try {
                if (this.f150479j instanceof AbstractC32560c.g) {
                    C20627a c20627a = this.f150478i;
                    if (c20627a != null) {
                        c20627a.mo107421i(true);
                    }
                    AbstractC20130d.m104858T0(this.f150472c);
                    this.f150479j = AbstractC32560c.e.f150486b;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p730zv.InterfaceC32558a
    /* renamed from: b */
    public void mo157653b() {
        AbstractC32560c abstractC32560c;
        Integer num;
        ModelMetadata mo151066b = this.f150471b.mo151066b();
        ModelMetadata mo12453b = this.f150470a.mo12453b();
        synchronized (this.f150475f) {
            abstractC32560c = this.f150479j;
        }
        if (mo151066b != null) {
            if (mo12453b != null && mo151066b.m48228e() <= mo12453b.m48228e()) {
                AbstractC20110a.f98889a.m104564x(f150469k).mo104554k("Current version is update to date", new Object[0]);
                return;
            }
            this.f150476g = mo151066b.m48228e();
            AbstractC20110a.b m104564x = AbstractC20110a.f98889a.m104564x(f150469k);
            int m48228e = mo151066b.m48228e();
            if (mo12453b != null) {
                num = Integer.valueOf(mo12453b.m48228e());
            } else {
                num = null;
            }
            m104564x.mo104554k("Found new version " + m48228e + ". Current version is " + num, new Object[0]);
            if (!(abstractC32560c instanceof AbstractC32560c.g)) {
                m157663k(mo151066b, this.f150472c);
            }
        }
    }

    @Override // p730zv.InterfaceC32558a
    /* renamed from: c */
    public AbstractC32560c mo157654c() {
        boolean z11;
        ModelMetadata mo12453b = this.f150470a.mo12453b();
        if (mo12453b != null && AbstractC19074t.m100204b(AbstractC20130d.m104877k(this.f150474e), mo12453b.m48225b())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            this.f150470a.mo12452a(null);
        }
        if (z11) {
            return new AbstractC32560c.b(this.f150474e);
        }
        return AbstractC32560c.a.f150482b;
    }

    /* renamed from: k */
    public void m157663k(ModelMetadata modelMetadata, File file) {
        AbstractC19074t.m100208f(modelMetadata, "modelMetadata");
        AbstractC19074t.m100208f(file, "outFile");
        synchronized (this.f150475f) {
            AbstractC20110a.f98889a.m104564x(f150469k).mo104554k("Downloading model " + modelMetadata.m48227d(), new Object[0]);
            C20627a c20627a = new C20627a(false);
            c20627a.m107419g0(this.f150477h);
            c20627a.f101478v = 0;
            c20627a.m107420h0(file.getAbsolutePath());
            c20627a.f101481y = true;
            this.f150479j = AbstractC32560c.g.f150488b;
            c20627a.m107488m(modelMetadata.m48227d());
            this.f150478i = c20627a;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: m */
    public AbstractC32560c m157664m(AbstractC32560c abstractC32560c) {
        AbstractC32560c abstractC32560c2;
        AbstractC19074t.m100208f(abstractC32560c, "modelFileState");
        synchronized (this.f150475f) {
            try {
                ModelMetadata mo151066b = this.f150471b.mo151066b();
                ModelMetadata mo12453b = this.f150470a.mo12453b();
                if (mo151066b != null) {
                    if (abstractC32560c instanceof AbstractC32560c.f) {
                        if (m157661j(mo151066b, ((AbstractC32560c.f) abstractC32560c).m157668a())) {
                            AbstractC20110a.f98889a.m104564x(f150469k).mo104554k("Checksum zip correct", new Object[0]);
                            abstractC32560c = new AbstractC32560c.d(((AbstractC32560c.f) abstractC32560c).m157668a());
                        } else {
                            AbstractC20110a.f98889a.m104564x(f150469k).mo104551d("Checksum zip incorrect", new Object[0]);
                            AbstractC20130d.m104858T0(((AbstractC32560c.f) abstractC32560c).m157668a());
                            abstractC32560c = AbstractC32560c.c.f150484b;
                        }
                    }
                    if (abstractC32560c instanceof AbstractC32560c.d) {
                        AbstractC20130d.m104856S0(this.f150473d);
                        if (AbstractC2378v0.m12421d(((AbstractC32560c.d) abstractC32560c).m157667a(), this.f150473d)) {
                            AbstractC20110a.f98889a.m104564x(f150469k).mo104554k("Unzip successful", new Object[0]);
                            AbstractC20130d.m104858T0(((AbstractC32560c.d) abstractC32560c).m157667a());
                            abstractC32560c = new AbstractC32560c.i(this.f150473d);
                        } else {
                            AbstractC20110a.f98889a.m104564x(f150469k).mo104551d("Unzip model error", new Object[0]);
                            AbstractC20130d.m104858T0(((AbstractC32560c.d) abstractC32560c).m157667a());
                            abstractC32560c = AbstractC32560c.h.f150489b;
                        }
                    }
                    if (abstractC32560c instanceof AbstractC32560c.i) {
                        if (AbstractC19074t.m100204b(AbstractC20130d.m104877k(((AbstractC32560c.i) abstractC32560c).m157669a()), mo151066b.m48225b())) {
                            AbstractC20110a.f98889a.m104564x(f150469k).mo104554k("Checksum folder correct", new Object[0]);
                            abstractC32560c2 = new AbstractC32560c.b(((AbstractC32560c.i) abstractC32560c).m157669a());
                        } else {
                            AbstractC20110a.f98889a.m104564x(f150469k).mo104551d("Checksum folder incorrect", new Object[0]);
                            AbstractC20130d.m104856S0(((AbstractC32560c.i) abstractC32560c).m157669a());
                            abstractC32560c2 = AbstractC32560c.a.f150482b;
                        }
                        abstractC32560c = abstractC32560c2;
                    }
                    if (abstractC32560c instanceof AbstractC32560c.b) {
                        if (mo12453b == null) {
                            AbstractC20110a.f98889a.m104564x(f150469k).mo104554k("Place new model version: " + mo151066b.m48228e(), new Object[0]);
                        } else {
                            AbstractC20110a.f98889a.m104564x(f150469k).mo104554k("Replacing old model version: " + mo12453b.m48228e() + " to " + mo151066b.m48228e(), new Object[0]);
                        }
                        AbstractC20130d.m104856S0(this.f150474e);
                        this.f150473d.renameTo(this.f150474e);
                        if (this.f150474e.isDirectory()) {
                            AbstractC20110a.f98889a.m104564x(f150469k).mo104554k("Model version " + mo151066b.m48228e() + " up to date", new Object[0]);
                            this.f150470a.mo12452a(mo151066b);
                        }
                    }
                }
                this.f150479j = abstractC32560c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC32560c;
    }
}
