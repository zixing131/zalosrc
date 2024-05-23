package tg;

import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import au.AbstractC2378v0;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.util.Objects;
import me0.AbstractC23041d2;
import mm0.AbstractC23352g;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p379o3.C23994e;
import p379o3.C23995f;
import su.AbstractC26389c;
import tg.C26665p;

/* renamed from: tg.c */
/* loaded from: classes3.dex */
public class RunnableC26652c implements Runnable, InterfaceC26654e {

    /* renamed from: q */
    private final String f126131q;

    /* renamed from: r */
    private final int f126132r;

    /* renamed from: s */
    private final String f126133s;

    /* renamed from: t */
    private final C26657h f126134t;

    /* renamed from: u */
    private final File f126135u;

    /* renamed from: v */
    private final int f126136v;

    /* renamed from: w */
    private final C26665p.b f126137w;

    /* renamed from: x */
    private final C23528a f126138x;

    /* renamed from: y */
    private final byte f126139y;

    /* renamed from: p */
    private final long f126130p = System.currentTimeMillis();

    /* renamed from: z */
    private final int f126140z = 2;

    /* renamed from: tg.c$a */
    /* loaded from: classes3.dex */
    class a extends C23994e {

        /* renamed from: v0 */
        final /* synthetic */ File f126141v0;

        /* renamed from: w0 */
        final /* synthetic */ String f126142w0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: tg.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C32978a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ File f126144a;

            /* renamed from: b */
            final /* synthetic */ C23995f f126145b;

            C32978a(File file, C23995f c23995f) {
                this.f126144a = file;
                this.f126145b = c23995f;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                try {
                    File file = this.f126144a;
                    if (file != null && file.exists() && this.f126145b.m125657h() == 200) {
                        if (AbstractC23309i.m121306Pe() && !TextUtils.isEmpty(RunnableC26652c.this.f126134t.f126158c)) {
                            try {
                                String m135987c = AbstractC26389c.m135987c(this.f126144a);
                                if (TextUtils.isEmpty(m135987c) || !TextUtils.equals(m135987c, RunnableC26652c.this.f126134t.f126158c)) {
                                    RunnableC26652c.this.f126137w.mo136847a(RunnableC26652c.this.f126131q, -2, null, RunnableC26652c.this.f126136v);
                                    return;
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        if (!AbstractC2378v0.m12421d(this.f126144a, a.this.f126141v0)) {
                            RunnableC26652c.this.f126137w.mo136847a(RunnableC26652c.this.f126131q, -4, null, RunnableC26652c.this.f126136v);
                            return;
                        }
                        AbstractC20130d.m104858T0(this.f126144a);
                        try {
                            if (AbstractC23309i.m121306Pe() && !TextUtils.isEmpty(RunnableC26652c.this.f126134t.f126159d)) {
                                String m104877k = AbstractC20130d.m104877k(a.this.f126141v0);
                                if (TextUtils.isEmpty(m104877k) || !TextUtils.equals(m104877k, RunnableC26652c.this.f126134t.f126159d)) {
                                    RunnableC26652c.this.f126137w.mo136847a(RunnableC26652c.this.f126131q, -3, null, RunnableC26652c.this.f126136v);
                                    return;
                                }
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                        if (RunnableC26652c.this.f126132r == 14) {
                            RunnableC26652c.this.f126134t.m136821c(new File(a.this.f126142w0 + "/metadata"), a.this.f126142w0);
                        }
                        RunnableC26652c.this.f126137w.mo136847a(RunnableC26652c.this.f126131q, 0, a.this.f126141v0.getPath(), RunnableC26652c.this.f126136v);
                        return;
                    }
                    RunnableC26652c.this.f126137w.mo136847a(RunnableC26652c.this.f126131q, -5, null, RunnableC26652c.this.f126136v);
                } catch (Exception unused) {
                    RunnableC26652c.this.f126137w.mo136847a(RunnableC26652c.this.f126131q, -1, null, RunnableC26652c.this.f126136v);
                }
            }
        }

        a(File file, String str) {
            this.f126141v0 = file;
            this.f126142w0 = str;
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1, reason: merged with bridge method [inline-methods] */
        public void mo1932C(String str, File file, C23995f c23995f) {
            C0824j.m2153b(new C32978a(file, c23995f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26652c(C23528a c23528a, int i11, String str, int i12, String str2, C26657h c26657h, File file, C26665p.b bVar, byte b11) {
        this.f126136v = i11;
        this.f126131q = str;
        this.f126132r = i12;
        this.f126133s = str2;
        this.f126134t = c26657h;
        this.f126135u = file;
        this.f126137w = bVar;
        this.f126138x = c23528a;
        this.f126139y = b11;
    }

    /* renamed from: h */
    private String m136805h(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    String m118198E = AbstractC23041d2.m118198E(file);
                    if (!TextUtils.isEmpty(m118198E)) {
                        return new JSONObject(m118198E).optString("atlasName");
                    }
                    return "";
                }
                return "";
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }
        return "";
    }

    /* renamed from: i */
    private String m136806i(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    String m118198E = AbstractC23041d2.m118198E(file);
                    if (!TextUtils.isEmpty(m118198E)) {
                        return new JSONObject(m118198E).optString("textureName");
                    }
                    return "";
                }
                return "";
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }
        return "";
    }

    @Override // tg.InterfaceC26654e
    /* renamed from: a */
    public long mo136807a() {
        return this.f126130p;
    }

    @Override // tg.InterfaceC26654e
    /* renamed from: d */
    public int mo136808d() {
        return this.f126140z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x02cc, code lost:            if (r13 == false) goto L135;     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0236 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:11:0x003e, B:13:0x0044, B:15:0x004a, B:17:0x0056, B:19:0x0071, B:21:0x0076, B:23:0x007c, B:25:0x0086, B:27:0x0090, B:30:0x0230, B:32:0x0236, B:34:0x023c, B:36:0x0246, B:38:0x0250, B:41:0x025c, B:44:0x0266, B:46:0x026c, B:48:0x0276, B:50:0x0280, B:53:0x0297, B:55:0x029d, B:57:0x02a3, B:59:0x02ad, B:61:0x02b7, B:64:0x02ce, B:66:0x02c2, B:69:0x028c, B:72:0x00a0, B:74:0x00aa, B:86:0x00d9, B:88:0x00e3, B:90:0x00ed, B:92:0x00f7, B:93:0x0111, B:95:0x011b, B:97:0x013c, B:99:0x0146, B:100:0x0163, B:102:0x0169, B:104:0x0173, B:106:0x017d, B:109:0x0189, B:111:0x0193, B:113:0x0199, B:115:0x01a3, B:117:0x01ad, B:120:0x01b9, B:122:0x01c3, B:124:0x01e3, B:126:0x0221, B:128:0x0227), top: B:10:0x003e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x026c A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:11:0x003e, B:13:0x0044, B:15:0x004a, B:17:0x0056, B:19:0x0071, B:21:0x0076, B:23:0x007c, B:25:0x0086, B:27:0x0090, B:30:0x0230, B:32:0x0236, B:34:0x023c, B:36:0x0246, B:38:0x0250, B:41:0x025c, B:44:0x0266, B:46:0x026c, B:48:0x0276, B:50:0x0280, B:53:0x0297, B:55:0x029d, B:57:0x02a3, B:59:0x02ad, B:61:0x02b7, B:64:0x02ce, B:66:0x02c2, B:69:0x028c, B:72:0x00a0, B:74:0x00aa, B:86:0x00d9, B:88:0x00e3, B:90:0x00ed, B:92:0x00f7, B:93:0x0111, B:95:0x011b, B:97:0x013c, B:99:0x0146, B:100:0x0163, B:102:0x0169, B:104:0x0173, B:106:0x017d, B:109:0x0189, B:111:0x0193, B:113:0x0199, B:115:0x01a3, B:117:0x01ad, B:120:0x01b9, B:122:0x01c3, B:124:0x01e3, B:126:0x0221, B:128:0x0227), top: B:10:0x003e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x029d A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:11:0x003e, B:13:0x0044, B:15:0x004a, B:17:0x0056, B:19:0x0071, B:21:0x0076, B:23:0x007c, B:25:0x0086, B:27:0x0090, B:30:0x0230, B:32:0x0236, B:34:0x023c, B:36:0x0246, B:38:0x0250, B:41:0x025c, B:44:0x0266, B:46:0x026c, B:48:0x0276, B:50:0x0280, B:53:0x0297, B:55:0x029d, B:57:0x02a3, B:59:0x02ad, B:61:0x02b7, B:64:0x02ce, B:66:0x02c2, B:69:0x028c, B:72:0x00a0, B:74:0x00aa, B:86:0x00d9, B:88:0x00e3, B:90:0x00ed, B:92:0x00f7, B:93:0x0111, B:95:0x011b, B:97:0x013c, B:99:0x0146, B:100:0x0163, B:102:0x0169, B:104:0x0173, B:106:0x017d, B:109:0x0189, B:111:0x0193, B:113:0x0199, B:115:0x01a3, B:117:0x01ad, B:120:0x01b9, B:122:0x01c3, B:124:0x01e3, B:126:0x0221, B:128:0x0227), top: B:10:0x003e, outer: #1 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        boolean z11;
        boolean z12;
        String m104877k;
        try {
            File file = this.f126135u;
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                String str = file + "/" + AbstractC23352g.m122788d(this.f126133s);
                File file2 = new File(str);
                try {
                    if (file2.exists() && file2.listFiles() != null) {
                        File[] listFiles = file2.listFiles();
                        Objects.requireNonNull(listFiles);
                        if (listFiles.length > 0) {
                            File file3 = new File(file2 + "/metadata");
                            if (file3.exists()) {
                                int i11 = this.f126132r;
                                if (i11 == 5) {
                                    if (AbstractC23309i.m121306Pe() && !TextUtils.isEmpty(this.f126134t.f126159d)) {
                                        String m104877k2 = AbstractC20130d.m104877k(file2);
                                        if (TextUtils.isEmpty(m104877k2) || !TextUtils.equals(m104877k2, this.f126134t.f126159d)) {
                                            this.f126137w.mo136847a(this.f126131q, -3, null, this.f126136v);
                                            return;
                                        }
                                        z11 = true;
                                        if (this.f126132r == 9) {
                                            m104877k = AbstractC20130d.m104877k(file2);
                                            if (TextUtils.isEmpty(m104877k)) {
                                            }
                                            this.f126137w.mo136847a(this.f126131q, -3, null, this.f126136v);
                                            return;
                                        }
                                        if (this.f126132r != 10) {
                                        }
                                        z12 = z11;
                                        if (this.f126132r != 11) {
                                        }
                                    } else {
                                        z11 = new File(str + "/main.lua").exists();
                                        if (this.f126132r == 9 && AbstractC23309i.m121306Pe() && !TextUtils.isEmpty(this.f126134t.f126159d)) {
                                            m104877k = AbstractC20130d.m104877k(file2);
                                            if (TextUtils.isEmpty(m104877k) && TextUtils.equals(m104877k, this.f126134t.f126159d)) {
                                                z11 = true;
                                            } else {
                                                this.f126137w.mo136847a(this.f126131q, -3, null, this.f126136v);
                                                return;
                                            }
                                        }
                                        if (this.f126132r != 10 && !TextUtils.isEmpty(this.f126134t.f126159d)) {
                                            String m104877k3 = AbstractC20130d.m104877k(file2);
                                            if (!TextUtils.isEmpty(m104877k3) && TextUtils.equals(m104877k3, this.f126134t.f126159d)) {
                                                z12 = true;
                                            } else {
                                                this.f126137w.mo136847a(this.f126131q, -3, null, this.f126136v);
                                                return;
                                            }
                                        } else {
                                            z12 = z11;
                                        }
                                        if (this.f126132r != 11 && AbstractC23309i.m121306Pe() && !TextUtils.isEmpty(this.f126134t.f126159d)) {
                                            String m104877k4 = AbstractC20130d.m104877k(file2);
                                            if (TextUtils.isEmpty(m104877k4) || !TextUtils.equals(m104877k4, this.f126134t.f126159d)) {
                                                this.f126137w.mo136847a(this.f126131q, -3, null, this.f126136v);
                                                return;
                                            }
                                        }
                                        this.f126137w.mo136847a(this.f126131q, 0, file2.getPath(), this.f126136v);
                                        return;
                                    }
                                } else {
                                    if (i11 != 4 && i11 != 6) {
                                        if (i11 != 7 && i11 != 8) {
                                            if (i11 == 14) {
                                                if (!TextUtils.isEmpty(this.f126134t.f126159d)) {
                                                    String m104877k5 = AbstractC20130d.m104877k(file2);
                                                    if (!TextUtils.isEmpty(m104877k5) && TextUtils.equals(m104877k5, this.f126134t.f126159d)) {
                                                        this.f126134t.m136821c(new File(str + "/metadata"), str);
                                                        z11 = true;
                                                    } else {
                                                        this.f126137w.mo136847a(this.f126131q, -3, null, this.f126136v);
                                                        return;
                                                    }
                                                } else {
                                                    z11 = new File(str + "/data.json").exists();
                                                }
                                            } else if (i11 < 4) {
                                                String m136806i = m136806i(file3);
                                                if (!TextUtils.isEmpty(m136806i)) {
                                                    z11 = new File(str + "/" + m136806i).exists();
                                                }
                                            }
                                            if (this.f126132r == 9) {
                                            }
                                            if (this.f126132r != 10) {
                                            }
                                            z12 = z11;
                                            if (this.f126132r != 11) {
                                            }
                                        }
                                        if (AbstractC23309i.m121306Pe() && !TextUtils.isEmpty(this.f126134t.f126159d)) {
                                            String m104877k6 = AbstractC20130d.m104877k(file2);
                                            if (!TextUtils.isEmpty(m104877k6) && TextUtils.equals(m104877k6, this.f126134t.f126159d)) {
                                                z11 = true;
                                                if (this.f126132r == 9) {
                                                }
                                                if (this.f126132r != 10) {
                                                }
                                                z12 = z11;
                                                if (this.f126132r != 11) {
                                                }
                                            } else {
                                                this.f126137w.mo136847a(this.f126131q, -3, null, this.f126136v);
                                                return;
                                            }
                                        }
                                    }
                                    if (AbstractC23309i.m121306Pe() && !TextUtils.isEmpty(this.f126134t.f126159d)) {
                                        String m104877k7 = AbstractC20130d.m104877k(file2);
                                        if (TextUtils.isEmpty(m104877k7) || !TextUtils.equals(m104877k7, this.f126134t.f126159d)) {
                                            this.f126137w.mo136847a(this.f126131q, -3, null, this.f126136v);
                                            return;
                                        }
                                    } else {
                                        String str2 = str + "/fullscreen";
                                        File file4 = new File(str2);
                                        String m136805h = m136805h(file3);
                                        if (!TextUtils.isEmpty(m136805h)) {
                                            File file5 = new File(str2 + "/" + m136805h + ".atlas");
                                            File file6 = new File(str2 + "/" + m136805h + ".json");
                                            if (file4.exists() && file5.exists() && file6.exists()) {
                                            }
                                        }
                                    }
                                    z11 = true;
                                    if (this.f126132r == 9) {
                                    }
                                    if (this.f126132r != 10) {
                                    }
                                    z12 = z11;
                                    if (this.f126132r != 11) {
                                    }
                                }
                            }
                            z11 = false;
                            if (this.f126132r == 9) {
                            }
                            if (this.f126132r != 10) {
                            }
                            z12 = z11;
                            if (this.f126132r != 11) {
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (file2.exists()) {
                    AbstractC20110a.m104542k(8, "FREEZE_STICKER EffectZipDownloader#DownloadZipTask", new Object[0]);
                    AbstractC20130d.m104856S0(file2);
                }
                a aVar = new a(file2, str);
                File file7 = new File(file + "/" + this.f126131q + ".zip");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start download zip: source=");
                sb2.append((int) this.f126139y);
                sb2.append("; ");
                sb2.append(this.f126133s);
                sb2.append("; target=");
                sb2.append(file7.getPath());
                aVar.m125637w0("clientVersion", CoreUtility.f89236l + "");
                aVar.m125637w0("source", ((int) this.f126139y) + "");
                this.f126138x.m123600e(this.f126133s, file7, aVar);
                return;
            }
            throw new IllegalArgumentException("anim dir not exist");
        } catch (Exception e12) {
            e12.printStackTrace();
            this.f126137w.mo136847a(this.f126131q, -1, null, this.f126136v);
        }
    }
}
