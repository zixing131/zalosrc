package vg;

import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilGIFToMP4;
import com.zing.zalo.zvideoutil.event.IProcessStateListener;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23041d2;
import me0.AbstractC23238v2;
import p348mi.AbstractC23309i;

/* renamed from: vg.q3 */
/* loaded from: classes3.dex */
public class C28164q3 {

    /* renamed from: e */
    private static volatile C28164q3 f131249e;

    /* renamed from: a */
    final List f131250a = new ArrayList();

    /* renamed from: b */
    boolean f131251b = false;

    /* renamed from: c */
    final ZVideoUtilGIFToMP4 f131252c = new ZVideoUtilGIFToMP4();

    /* renamed from: d */
    final IProcessStateListener f131253d = new IProcessStateListener() { // from class: vg.p3
        @Override // com.zing.zalo.zvideoutil.event.IProcessStateListener
        public final void onProcessState(int i11) {
            C28164q3.this.m141692f(i11);
        }
    };

    /* renamed from: vg.q3$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f131254a;

        /* renamed from: b */
        public String f131255b;

        /* renamed from: c */
        public boolean f131256c = false;

        /* renamed from: d */
        public boolean f131257d = false;

        /* renamed from: e */
        public int f131258e = 0;

        public a(String str, String str2) {
            this.f131254a = str;
            this.f131255b = str2;
        }
    }

    private C28164q3() {
    }

    /* renamed from: e */
    public static C28164q3 m141691e() {
        if (f131249e == null) {
            synchronized (C28164q3.class) {
                try {
                    if (f131249e == null) {
                        f131249e = new C28164q3();
                    }
                } finally {
                }
            }
        }
        return f131249e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m141692f(int i11) {
        if (i11 != -3 && i11 != -2 && i11 != -1) {
            if (i11 == 100) {
                m141694c(true);
                return;
            }
            return;
        }
        m141694c(false);
    }

    /* renamed from: b */
    public synchronized void m141693b(a aVar) {
        if (aVar != null) {
            this.f131250a.add(aVar);
            if (!this.f131251b) {
                m141695d();
            }
        }
    }

    /* renamed from: c */
    synchronized void m141694c(boolean z11) {
        try {
            this.f131251b = false;
            if (!this.f131250a.isEmpty()) {
                a aVar = (a) this.f131250a.remove(0);
                aVar.f131257d = z11;
                aVar.f131256c = true;
                if (!z11) {
                    if (!AbstractC23238v2.m119726k()) {
                        aVar.f131258e = 601;
                    } else {
                        aVar.f131258e = 502;
                    }
                }
            }
            if (!this.f131250a.isEmpty()) {
                m141695d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d */
    void m141695d() {
        try {
            if (this.f131251b) {
                return;
            }
            this.f131251b = true;
            a aVar = (a) this.f131250a.get(0);
            String str = aVar.f131254a;
            if (!AbstractC23041d2.m118194A(str)) {
                m141694c(false);
                return;
            }
            String str2 = aVar.f131255b;
            if (AbstractC23041d2.m118194A(str2)) {
                m141694c(true);
            } else {
                this.f131252c.process(this.f131253d, null, ZAbstractBase.reformatVideoPath(str), str2, AbstractC23309i.m121830dh() ? 1 : 0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            m141694c(false);
        }
    }
}
